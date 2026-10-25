package okhttp3.internal.http;

import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ul;
import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;

/* JADX INFO: loaded from: classes.dex */
public final class CallServerInterceptor implements Interceptor {
    private final boolean forWebSocket;

    public CallServerInterceptor(boolean forWebSocket) {
        this.forWebSocket = forWebSocket;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0175  */
    /* JADX WARN: Code duplicated, block: B:52:0x017b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0180  */
    /* JADX WARN: Code duplicated, block: B:56:0x0188  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a2  */
    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Long lValueOf;
        ResponseBody responseBodyBody;
        long jContentLength;
        ResponseBody responseBodyBody2;
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(chain, "chain");
        RealInterceptorChain realChain = (RealInterceptorChain) chain;
        Exchange exchange = realChain.getExchange$okhttp();
        jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(exchange);
        Request request = realChain.getRequest$okhttp();
        RequestBody requestBody = request.body();
        long sentRequestMillis = System.currentTimeMillis();
        exchange.writeRequestHeaders(request);
        boolean invokeStartEvent = true;
        Response.Builder responseBuilder = null;
        if (!HttpMethod.permitsRequestBody(request.method()) || requestBody == null) {
            exchange.noRequestBody();
        } else {
            if (lo.d("100-continue", request.header("Expect"), true)) {
                exchange.flushRequest();
                responseBuilder = exchange.readResponseHeaders(true);
                exchange.responseHeadersStart();
                invokeStartEvent = false;
            }
            if (responseBuilder != null) {
                exchange.noRequestBody();
                if (!exchange.getConnection$okhttp().isMultiplexed$okhttp()) {
                    exchange.noNewExchangesOnConnection();
                }
            } else if (requestBody.isDuplex()) {
                exchange.flushRequest();
                requestBody.writeTo(rj.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(exchange.createRequestBody(request, true)));
            } else {
                u2 bufferedRequestBody = rj.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(exchange.createRequestBody(request, false));
                requestBody.writeTo(bufferedRequestBody);
                ((ul) bufferedRequestBody).close();
            }
        }
        if (requestBody == null || !requestBody.isDuplex()) {
            exchange.finishRequest();
        }
        if (responseBuilder == null) {
            Response.Builder responseHeaders = exchange.readResponseHeaders(false);
            jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(responseHeaders);
            responseBuilder = responseHeaders;
            if (invokeStartEvent) {
                exchange.responseHeadersStart();
                invokeStartEvent = false;
            }
        }
        Response response = responseBuilder.request(request).handshake(exchange.getConnection$okhttp().handshake()).sentRequestAtMillis(sentRequestMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
        int code = response.code();
        if (code == 100) {
            Response.Builder responseBuilder2 = exchange.readResponseHeaders(false);
            jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(responseBuilder2);
            if (invokeStartEvent) {
                exchange.responseHeadersStart();
            }
            response = responseBuilder2.request(request).handshake(exchange.getConnection$okhttp().handshake()).sentRequestAtMillis(sentRequestMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
            code = response.code();
        }
        exchange.responseHeadersEnd(response);
        Response response2 = (this.forWebSocket && code == 101) ? response.newBuilder().body(Util.EMPTY_RESPONSE).build() : response.newBuilder().body(exchange.openResponseBody(response)).build();
        if (!lo.d("close", response2.request().header("Connection"), true)) {
            lValueOf = null;
            if (lo.d("close", Response.header$default(response2, "Connection", null, 2, null), true)) {
            }
            if (code != 204 || code == 205) {
                responseBodyBody = response2.body();
                if (responseBodyBody != null) {
                    jContentLength = responseBodyBody.contentLength();
                } else {
                    jContentLength = -1;
                }
                if (jContentLength > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("HTTP ");
                    sb.append(code);
                    sb.append(" had non-zero Content-Length: ");
                    responseBodyBody2 = response2.body();
                    if (responseBodyBody2 != null) {
                        lValueOf = Long.valueOf(responseBodyBody2.contentLength());
                    }
                    sb.append(lValueOf);
                    throw new ProtocolException(sb.toString());
                }
            }
            return response2;
        }
        lValueOf = null;
        exchange.noNewExchangesOnConnection();
        if (code != 204) {
            responseBodyBody = response2.body();
            if (responseBodyBody != null) {
                jContentLength = responseBodyBody.contentLength();
            } else {
                jContentLength = -1;
            }
            if (jContentLength > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("HTTP ");
                sb2.append(code);
                sb2.append(" had non-zero Content-Length: ");
                responseBodyBody2 = response2.body();
                if (responseBodyBody2 != null) {
                    lValueOf = Long.valueOf(responseBodyBody2.contentLength());
                }
                sb2.append(lValueOf);
                throw new ProtocolException(sb2.toString());
            }
        } else {
            responseBodyBody = response2.body();
            if (responseBodyBody != null) {
                jContentLength = responseBodyBody.contentLength();
            } else {
                jContentLength = -1;
            }
            if (jContentLength > 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("HTTP ");
                sb3.append(code);
                sb3.append(" had non-zero Content-Length: ");
                responseBodyBody2 = response2.body();
                if (responseBodyBody2 != null) {
                    lValueOf = Long.valueOf(responseBodyBody2.contentLength());
                }
                sb3.append(lValueOf);
                throw new ProtocolException(sb3.toString());
            }
        }
        return response2;
    }
}
