package okhttp3.internal.http;

import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t6;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;

/* JADX INFO: loaded from: classes.dex */
public final class RetryAndFollowUpInterceptor implements Interceptor {
    public static final Companion Companion = new Companion(null);
    private static final int MAX_FOLLOW_UPS = 20;
    private final OkHttpClient client;

    public RetryAndFollowUpInterceptor(OkHttpClient client) {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(client, "client");
        this.client = client;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(chain, "chain");
        RealInterceptorChain realChain = (RealInterceptorChain) chain;
        Request request = ((RealInterceptorChain) chain).getRequest$okhttp();
        RealCall call = realChain.getCall$okhttp();
        List recoveredFailures = d4.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        boolean newExchangeFinder = true;
        Response priorResponse = null;
        int followUpCount = 0;
        Request request2 = request;
        while (true) {
            call.enterNetworkInterceptorExchange(request2, newExchangeFinder);
            try {
                if (call.isCanceled()) {
                    throw new IOException("Canceled");
                }
                try {
                    Response response = realChain.proceed(request2);
                    newExchangeFinder = true;
                    if (priorResponse != null) {
                        response = response.newBuilder().priorResponse(priorResponse.newBuilder().body(null).build()).build();
                    }
                    Exchange exchange = call.getInterceptorScopedExchange$okhttp();
                    Request followUp = followUpRequest(response, exchange);
                    if (followUp == null) {
                        if (exchange != null && exchange.isDuplex$okhttp()) {
                            call.timeoutEarlyExit();
                        }
                        call.exitNetworkInterceptorExchange$okhttp(false);
                        return response;
                    }
                    RequestBody followUpBody = followUp.body();
                    if (followUpBody != null && followUpBody.isOneShot()) {
                        call.exitNetworkInterceptorExchange$okhttp(false);
                        return response;
                    }
                    ResponseBody responseBodyBody = response.body();
                    if (responseBodyBody != null) {
                        Util.closeQuietly(responseBodyBody);
                    }
                    followUpCount++;
                    if (followUpCount > MAX_FOLLOW_UPS) {
                        throw new ProtocolException("Too many follow-up requests: " + followUpCount);
                    }
                    request2 = followUp;
                    priorResponse = response;
                    call.exitNetworkInterceptorExchange$okhttp(true);
                } catch (IOException e) {
                    if (!recover(e, call, request2, e instanceof ConnectionShutdownException ? false : true)) {
                        throw Util.withSuppressed(e, recoveredFailures);
                    }
                    recoveredFailures = l4.v(recoveredFailures, e);
                    newExchangeFinder = false;
                    call.exitNetworkInterceptorExchange$okhttp(true);
                } catch (RouteException e2) {
                    if (!recover(e2.getLastConnectException(), call, request2, false)) {
                        throw Util.withSuppressed(e2.getFirstConnectException(), recoveredFailures);
                    }
                    recoveredFailures = l4.v(recoveredFailures, e2.getFirstConnectException());
                    newExchangeFinder = false;
                    call.exitNetworkInterceptorExchange$okhttp(true);
                }
            } catch (Throwable th) {
                call.exitNetworkInterceptorExchange$okhttp(true);
                throw th;
            }
        }
    }

    private final boolean recover(IOException e, RealCall call, Request userRequest, boolean requestSendStarted) {
        if (this.client.retryOnConnectionFailure()) {
            return !(requestSendStarted && requestIsOneShot(e, userRequest)) && isRecoverable(e, requestSendStarted) && call.retryAfterFailure();
        }
        return false;
    }

    private final boolean requestIsOneShot(IOException e, Request userRequest) {
        RequestBody requestBody = userRequest.body();
        return (requestBody != null && requestBody.isOneShot()) || (e instanceof FileNotFoundException);
    }

    private final boolean isRecoverable(IOException e, boolean requestSendStarted) {
        if (e instanceof ProtocolException) {
            return false;
        }
        if (e instanceof InterruptedIOException) {
            return (e instanceof SocketTimeoutException) && !requestSendStarted;
        }
        return (((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) || (e instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private final Request followUpRequest(Response userResponse, Exchange exchange) throws IOException {
        RealConnection connection$okhttp;
        Route route = (exchange == null || (connection$okhttp = exchange.getConnection$okhttp()) == null) ? null : connection$okhttp.route();
        int responseCode = userResponse.code();
        String method = userResponse.request().method();
        switch (responseCode) {
            case 300:
            case 301:
            case 302:
            case 303:
            case StatusLine.HTTP_TEMP_REDIRECT /* 307 */:
            case StatusLine.HTTP_PERM_REDIRECT /* 308 */:
                return buildRedirectRequest(userResponse, method);
            case 401:
                return this.client.authenticator().authenticate(route, userResponse);
            case 407:
                jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(route);
                Proxy selectedProxy = route.proxy();
                if (selectedProxy.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                return this.client.proxyAuthenticator().authenticate(route, userResponse);
            case 408:
                if (!this.client.retryOnConnectionFailure()) {
                    return null;
                }
                RequestBody requestBody = userResponse.request().body();
                if (requestBody != null && requestBody.isOneShot()) {
                    return null;
                }
                Response priorResponse = userResponse.priorResponse();
                if ((priorResponse != null && priorResponse.code() == 408) || retryAfter(userResponse, 0) > 0) {
                    return null;
                }
                return userResponse.request();
            case StatusLine.HTTP_MISDIRECTED_REQUEST /* 421 */:
                RequestBody requestBody2 = userResponse.request().body();
                if ((requestBody2 != null && requestBody2.isOneShot()) || exchange == null || !exchange.isCoalescedConnection$okhttp()) {
                    return null;
                }
                exchange.getConnection$okhttp().noCoalescedConnections$okhttp();
                return userResponse.request();
            case 503:
                Response priorResponse2 = userResponse.priorResponse();
                if ((priorResponse2 != null && priorResponse2.code() == 503) || retryAfter(userResponse, Integer.MAX_VALUE) != 0) {
                    return null;
                }
                return userResponse.request();
            default:
                return null;
        }
    }

    private final Request buildRedirectRequest(Response userResponse, String method) {
        String location;
        HttpUrl url;
        if (!this.client.followRedirects() || (location = Response.header$default(userResponse, "Location", null, 2, null)) == null || (url = userResponse.request().url().resolve(location)) == null) {
            return null;
        }
        boolean sameScheme = jd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(url.scheme(), userResponse.request().url().scheme());
        if (!sameScheme && !this.client.followSslRedirects()) {
            return null;
        }
        Request.Builder requestBuilder = userResponse.request().newBuilder();
        if (HttpMethod.permitsRequestBody(method)) {
            int responseCode = userResponse.code();
            HttpMethod httpMethod = HttpMethod.INSTANCE;
            boolean maintainBody = httpMethod.redirectsWithBody(method) || responseCode == 308 || responseCode == 307;
            if (httpMethod.redirectsToGet(method) && responseCode != 308 && responseCode != 307) {
                requestBuilder.method("GET", null);
            } else {
                RequestBody requestBody = maintainBody ? userResponse.request().body() : null;
                requestBuilder.method(method, requestBody);
            }
            if (!maintainBody) {
                requestBuilder.removeHeader("Transfer-Encoding");
                requestBuilder.removeHeader("Content-Length");
                requestBuilder.removeHeader("Content-Type");
            }
        }
        if (!Util.canReuseConnectionFor(userResponse.request().url(), url)) {
            requestBuilder.removeHeader("Authorization");
        }
        return requestBuilder.url(url).build();
    }

    private final int retryAfter(Response userResponse, int defaultDelay) {
        String header = Response.header$default(userResponse, "Retry-After", null, 2, null);
        if (header == null) {
            return defaultDelay;
        }
        if (new bm("\\d+").xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(header)) {
            Integer numValueOf = Integer.valueOf(header);
            jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(numValueOf, "Integer.valueOf(header)");
            return numValueOf.intValue();
        }
        return Integer.MAX_VALUE;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(t6 $constructor_marker) {
            this();
        }
    }
}
