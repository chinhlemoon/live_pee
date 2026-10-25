package okhttp3;

import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v2;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.StatusLine;

/* JADX INFO: loaded from: classes.dex */
public final class Response implements Closeable {
    private final ResponseBody body;
    private final Response cacheResponse;
    private final int code;
    private final Exchange exchange;
    private final Handshake handshake;
    private final Headers headers;
    private CacheControl lazyCacheControl;
    private final String message;
    private final Response networkResponse;
    private final Response priorResponse;
    private final Protocol protocol;
    private final long receivedResponseAtMillis;
    private final Request request;
    private final long sentRequestAtMillis;

    public final String header(String str) {
        return header$default(this, str, null, 2, null);
    }

    public Response(Request request, Protocol protocol, String message, int code, Handshake handshake, Headers headers, ResponseBody body, Response networkResponse, Response cacheResponse, Response priorResponse, long sentRequestAtMillis, long receivedResponseAtMillis, Exchange exchange) {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(request, "request");
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(protocol, "protocol");
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(message, "message");
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(headers, "headers");
        this.request = request;
        this.protocol = protocol;
        this.message = message;
        this.code = code;
        this.handshake = handshake;
        this.headers = headers;
        this.body = body;
        this.networkResponse = networkResponse;
        this.cacheResponse = cacheResponse;
        this.priorResponse = priorResponse;
        this.sentRequestAtMillis = sentRequestAtMillis;
        this.receivedResponseAtMillis = receivedResponseAtMillis;
        this.exchange = exchange;
    }

    public final Request request() {
        return this.request;
    }

    public final Protocol protocol() {
        return this.protocol;
    }

    public final String message() {
        return this.message;
    }

    public final int code() {
        return this.code;
    }

    public final Handshake handshake() {
        return this.handshake;
    }

    public final Headers headers() {
        return this.headers;
    }

    public final ResponseBody body() {
        return this.body;
    }

    public final Response networkResponse() {
        return this.networkResponse;
    }

    public final Response cacheResponse() {
        return this.cacheResponse;
    }

    public final Response priorResponse() {
        return this.priorResponse;
    }

    public final long sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    public final long receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    public final Exchange exchange() {
        return this.exchange;
    }

    /* JADX INFO: renamed from: -deprecated_request, reason: not valid java name */
    public final Request m6712deprecated_request() {
        return this.request;
    }

    /* JADX INFO: renamed from: -deprecated_protocol, reason: not valid java name */
    public final Protocol m6710deprecated_protocol() {
        return this.protocol;
    }

    /* JADX INFO: renamed from: -deprecated_code, reason: not valid java name */
    public final int m6704deprecated_code() {
        return this.code;
    }

    public final boolean isSuccessful() {
        int i = this.code;
        return 200 <= i && 299 >= i;
    }

    /* JADX INFO: renamed from: -deprecated_message, reason: not valid java name */
    public final String m6707deprecated_message() {
        return this.message;
    }

    /* JADX INFO: renamed from: -deprecated_handshake, reason: not valid java name */
    public final Handshake m6705deprecated_handshake() {
        return this.handshake;
    }

    public final List<String> headers(String name) {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(name, "name");
        return this.headers.values(name);
    }

    public static /* synthetic */ String header$default(Response response, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return response.header(str, str2);
    }

    public final String header(String name, String defaultValue) {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(name, "name");
        String str = this.headers.get(name);
        return str != null ? str : defaultValue;
    }

    /* JADX INFO: renamed from: -deprecated_headers, reason: not valid java name */
    public final Headers m6706deprecated_headers() {
        return this.headers;
    }

    public final Headers trailers() throws IOException {
        Exchange exchange = this.exchange;
        if (exchange != null) {
            return exchange.trailers();
        }
        throw new IllegalStateException("trailers not available".toString());
    }

    public final ResponseBody peekBody(long byteCount) throws IOException {
        ResponseBody responseBody = this.body;
        jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(responseBody);
        v2 peeked = responseBody.source().u();
        s2 buffer = new s2();
        peeked.p(byteCount);
        buffer.g0(peeked, Math.min(byteCount, peeked.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa().b0()));
        return ResponseBody.Companion.create(buffer, this.body.contentType(), buffer.b0());
    }

    /* JADX INFO: renamed from: -deprecated_body, reason: not valid java name */
    public final ResponseBody m6701deprecated_body() {
        return this.body;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final boolean isRedirect() {
        switch (this.code) {
            case 300:
            case 301:
            case 302:
            case 303:
            case StatusLine.HTTP_TEMP_REDIRECT /* 307 */:
            case StatusLine.HTTP_PERM_REDIRECT /* 308 */:
                return true;
            case 304:
            case 305:
            case 306:
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: -deprecated_networkResponse, reason: not valid java name */
    public final Response m6708deprecated_networkResponse() {
        return this.networkResponse;
    }

    /* JADX INFO: renamed from: -deprecated_cacheResponse, reason: not valid java name */
    public final Response m6703deprecated_cacheResponse() {
        return this.cacheResponse;
    }

    /* JADX INFO: renamed from: -deprecated_priorResponse, reason: not valid java name */
    public final Response m6709deprecated_priorResponse() {
        return this.priorResponse;
    }

    public final List<Challenge> challenges() {
        String str;
        Headers headers = this.headers;
        switch (this.code) {
            case 401:
                str = "WWW-Authenticate";
                break;
            case 407:
                str = "Proxy-Authenticate";
                break;
            default:
                return d4.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return HttpHeaders.parseChallenges(headers, str);
    }

    public final CacheControl cacheControl() {
        CacheControl result = this.lazyCacheControl;
        if (result == null) {
            CacheControl result2 = CacheControl.Companion.parse(this.headers);
            this.lazyCacheControl = result2;
            return result2;
        }
        return result;
    }

    /* JADX INFO: renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final CacheControl m6702deprecated_cacheControl() {
        return cacheControl();
    }

    /* JADX INFO: renamed from: -deprecated_sentRequestAtMillis, reason: not valid java name */
    public final long m6713deprecated_sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    /* JADX INFO: renamed from: -deprecated_receivedResponseAtMillis, reason: not valid java name */
    public final long m6711deprecated_receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ResponseBody responseBody = this.body;
        if (responseBody == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        responseBody.close();
    }

    public String toString() {
        return "Response{protocol=" + this.protocol + ", code=" + this.code + ", message=" + this.message + ", url=" + this.request.url() + '}';
    }

    public static class Builder {
        private ResponseBody body;
        private Response cacheResponse;
        private int code;
        private Exchange exchange;
        private Handshake handshake;
        private Headers.Builder headers;
        private String message;
        private Response networkResponse;
        private Response priorResponse;
        private Protocol protocol;
        private long receivedResponseAtMillis;
        private Request request;
        private long sentRequestAtMillis;

        public final Request getRequest$okhttp() {
            return this.request;
        }

        public final void setRequest$okhttp(Request request) {
            this.request = request;
        }

        public final Protocol getProtocol$okhttp() {
            return this.protocol;
        }

        public final void setProtocol$okhttp(Protocol protocol) {
            this.protocol = protocol;
        }

        public final int getCode$okhttp() {
            return this.code;
        }

        public final void setCode$okhttp(int i) {
            this.code = i;
        }

        public final String getMessage$okhttp() {
            return this.message;
        }

        public final void setMessage$okhttp(String str) {
            this.message = str;
        }

        public final Handshake getHandshake$okhttp() {
            return this.handshake;
        }

        public final void setHandshake$okhttp(Handshake handshake) {
            this.handshake = handshake;
        }

        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        public final void setHeaders$okhttp(Headers.Builder builder) {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(builder, "<set-?>");
            this.headers = builder;
        }

        public final ResponseBody getBody$okhttp() {
            return this.body;
        }

        public final void setBody$okhttp(ResponseBody responseBody) {
            this.body = responseBody;
        }

        public final Response getNetworkResponse$okhttp() {
            return this.networkResponse;
        }

        public final void setNetworkResponse$okhttp(Response response) {
            this.networkResponse = response;
        }

        public final Response getCacheResponse$okhttp() {
            return this.cacheResponse;
        }

        public final void setCacheResponse$okhttp(Response response) {
            this.cacheResponse = response;
        }

        public final Response getPriorResponse$okhttp() {
            return this.priorResponse;
        }

        public final void setPriorResponse$okhttp(Response response) {
            this.priorResponse = response;
        }

        public final long getSentRequestAtMillis$okhttp() {
            return this.sentRequestAtMillis;
        }

        public final void setSentRequestAtMillis$okhttp(long j) {
            this.sentRequestAtMillis = j;
        }

        public final long getReceivedResponseAtMillis$okhttp() {
            return this.receivedResponseAtMillis;
        }

        public final void setReceivedResponseAtMillis$okhttp(long j) {
            this.receivedResponseAtMillis = j;
        }

        public final Exchange getExchange$okhttp() {
            return this.exchange;
        }

        public final void setExchange$okhttp(Exchange exchange) {
            this.exchange = exchange;
        }

        public Builder() {
            this.code = -1;
            this.headers = new Headers.Builder();
        }

        public Builder(Response response) {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(response, "response");
            this.code = -1;
            this.request = response.request();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.handshake = response.handshake();
            this.headers = response.headers().newBuilder();
            this.body = response.body();
            this.networkResponse = response.networkResponse();
            this.cacheResponse = response.cacheResponse();
            this.priorResponse = response.priorResponse();
            this.sentRequestAtMillis = response.sentRequestAtMillis();
            this.receivedResponseAtMillis = response.receivedResponseAtMillis();
            this.exchange = response.exchange();
        }

        public Builder request(Request request) {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(request, "request");
            this.request = request;
            return this;
        }

        public Builder protocol(Protocol protocol) {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(protocol, "protocol");
            this.protocol = protocol;
            return this;
        }

        public Builder code(int code) {
            this.code = code;
            return this;
        }

        public Builder message(String message) {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(message, "message");
            this.message = message;
            return this;
        }

        public Builder handshake(Handshake handshake) {
            this.handshake = handshake;
            return this;
        }

        public Builder header(String name, String value) {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(name, "name");
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(value, "value");
            this.headers.set(name, value);
            return this;
        }

        public Builder addHeader(String name, String value) {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(name, "name");
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(value, "value");
            this.headers.add(name, value);
            return this;
        }

        public Builder removeHeader(String name) {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(name, "name");
            this.headers.removeAll(name);
            return this;
        }

        public Builder headers(Headers headers) {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(headers, "headers");
            this.headers = headers.newBuilder();
            return this;
        }

        public Builder body(ResponseBody body) {
            this.body = body;
            return this;
        }

        public Builder networkResponse(Response networkResponse) {
            checkSupportResponse("networkResponse", networkResponse);
            this.networkResponse = networkResponse;
            return this;
        }

        public Builder cacheResponse(Response cacheResponse) {
            checkSupportResponse("cacheResponse", cacheResponse);
            this.cacheResponse = cacheResponse;
            return this;
        }

        private final void checkSupportResponse(String name, Response response) {
            if (response != null) {
                if (!(response.body() == null)) {
                    throw new IllegalArgumentException((name + ".body != null").toString());
                }
                if (!(response.networkResponse() == null)) {
                    throw new IllegalArgumentException((name + ".networkResponse != null").toString());
                }
                if (!(response.cacheResponse() == null)) {
                    throw new IllegalArgumentException((name + ".cacheResponse != null").toString());
                }
                if (response.priorResponse() == null) {
                    return;
                }
                throw new IllegalArgumentException((name + ".priorResponse != null").toString());
            }
        }

        public Builder priorResponse(Response priorResponse) {
            checkPriorResponse(priorResponse);
            this.priorResponse = priorResponse;
            return this;
        }

        private final void checkPriorResponse(Response response) {
            if (response != null) {
                if (!(response.body() == null)) {
                    throw new IllegalArgumentException("priorResponse.body != null".toString());
                }
            }
        }

        public Builder sentRequestAtMillis(long sentRequestAtMillis) {
            this.sentRequestAtMillis = sentRequestAtMillis;
            return this;
        }

        public Builder receivedResponseAtMillis(long receivedResponseAtMillis) {
            this.receivedResponseAtMillis = receivedResponseAtMillis;
            return this;
        }

        public final void initExchange$okhttp(Exchange deferredTrailers) {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(deferredTrailers, "deferredTrailers");
            this.exchange = deferredTrailers;
        }

        public Response build() {
            int i = this.code;
            if (!(i >= 0)) {
                throw new IllegalStateException(("code < 0: " + this.code).toString());
            }
            Request request = this.request;
            if (request == null) {
                throw new IllegalStateException("request == null".toString());
            }
            Protocol protocol = this.protocol;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null".toString());
            }
            String str = this.message;
            if (str != null) {
                return new Response(request, protocol, str, i, this.handshake, this.headers.build(), this.body, this.networkResponse, this.cacheResponse, this.priorResponse, this.sentRequestAtMillis, this.receivedResponseAtMillis, this.exchange);
            }
            throw new IllegalStateException("message == null".toString());
        }
    }
}
