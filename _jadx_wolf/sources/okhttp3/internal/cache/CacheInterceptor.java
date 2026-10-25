package okhttp3.internal.cache;

import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.up;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v2;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.RealResponseBody;

/* JADX INFO: loaded from: classes.dex */
public final class CacheInterceptor implements Interceptor {
    public static final Companion Companion = new Companion(null);
    private final Cache cache;

    public CacheInterceptor(Cache cache) {
        this.cache = cache;
    }

    public final Cache getCache$okhttp() {
        return this.cache;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        EventListener listener;
        ResponseBody responseBodyBody;
        ResponseBody responseBodyBody2;
        ResponseBody responseBodyBody3;
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(chain, "chain");
        Call call = chain.call();
        Cache cache = this.cache;
        Response cacheCandidate = cache != null ? cache.get$okhttp(chain.request()) : null;
        long now = System.currentTimeMillis();
        CacheStrategy strategy = new CacheStrategy.Factory(now, chain.request(), cacheCandidate).compute();
        Request networkRequest = strategy.getNetworkRequest();
        Response cacheResponse = strategy.getCacheResponse();
        Cache cache2 = this.cache;
        if (cache2 != null) {
            cache2.trackResponse$okhttp(strategy);
        }
        RealCall realCall = (RealCall) (!(call instanceof RealCall) ? null : call);
        if (realCall == null || (listener = realCall.getEventListener$okhttp()) == null) {
            listener = EventListener.NONE;
        }
        if (cacheCandidate != null && cacheResponse == null && (responseBodyBody3 = cacheCandidate.body()) != null) {
            Util.closeQuietly(responseBodyBody3);
        }
        if (networkRequest == null && cacheResponse == null) {
            Response it = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_1_1).code(504).message("Unsatisfiable Request (only-if-cached)").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(System.currentTimeMillis()).build();
            listener.satisfactionFailure(call, it);
            return it;
        }
        if (networkRequest == null) {
            jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(cacheResponse);
            Response it2 = cacheResponse.newBuilder().cacheResponse(Companion.stripBody(cacheResponse)).build();
            listener.cacheHit(call, it2);
            return it2;
        }
        if (cacheResponse != null) {
            listener.cacheConditionalHit(call, cacheResponse);
        } else if (this.cache != null) {
            listener.cacheMiss(call);
        }
        try {
            Response networkResponse = chain.proceed(networkRequest);
            if (networkResponse == null && cacheCandidate != null && (responseBodyBody2 = cacheCandidate.body()) != null) {
                Util.closeQuietly(responseBodyBody2);
            }
            if (cacheResponse != null) {
                if (networkResponse != null && networkResponse.code() == 304) {
                    Response.Builder builderNewBuilder = cacheResponse.newBuilder();
                    Companion companion = Companion;
                    Response response = builderNewBuilder.headers(companion.combine(cacheResponse.headers(), networkResponse.headers())).sentRequestAtMillis(networkResponse.sentRequestAtMillis()).receivedResponseAtMillis(networkResponse.receivedResponseAtMillis()).cacheResponse(companion.stripBody(cacheResponse)).networkResponse(companion.stripBody(networkResponse)).build();
                    ResponseBody responseBodyBody4 = networkResponse.body();
                    jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(responseBodyBody4);
                    responseBodyBody4.close();
                    Cache cache3 = this.cache;
                    jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(cache3);
                    cache3.trackConditionalCacheHit$okhttp();
                    this.cache.update$okhttp(cacheResponse, response);
                    listener.cacheHit(call, response);
                    return response;
                }
                ResponseBody responseBodyBody5 = cacheResponse.body();
                if (responseBodyBody5 != null) {
                    Util.closeQuietly(responseBodyBody5);
                }
            }
            jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(networkResponse);
            Response.Builder builderNewBuilder2 = networkResponse.newBuilder();
            Companion companion2 = Companion;
            Response response2 = builderNewBuilder2.cacheResponse(companion2.stripBody(cacheResponse)).networkResponse(companion2.stripBody(networkResponse)).build();
            if (this.cache != null) {
                if (HttpHeaders.promisesBody(response2) && CacheStrategy.Companion.isCacheable(response2, networkRequest)) {
                    CacheRequest cacheRequest = this.cache.put$okhttp(response2);
                    Response responseCacheWritingResponse = cacheWritingResponse(cacheRequest, response2);
                    if (cacheResponse != null) {
                        listener.cacheMiss(call);
                    }
                    return responseCacheWritingResponse;
                }
                if (HttpMethod.INSTANCE.invalidatesCache(networkRequest.method())) {
                    try {
                        this.cache.remove$okhttp(networkRequest);
                    } catch (IOException e) {
                    }
                }
            }
            return response2;
        } catch (Throwable th) {
            if (cacheCandidate != null && (responseBodyBody = cacheCandidate.body()) != null) {
                Util.closeQuietly(responseBodyBody);
            }
            throw th;
        }
    }

    private final Response cacheWritingResponse(final CacheRequest cacheRequest, Response response) throws IOException {
        if (cacheRequest == null) {
            return response;
        }
        sn cacheBodyUnbuffered = cacheRequest.body();
        ResponseBody responseBodyBody = response.body();
        jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(responseBodyBody);
        final v2 source = responseBodyBody.source();
        final u2 cacheBody = rj.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(cacheBodyUnbuffered);
        un unVar = new un() { // from class: okhttp3.internal.cache.CacheInterceptor$cacheWritingResponse$cacheWritingSource$1
            private boolean cacheRequestClosed;

            @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un
            public long read(s2 sink, long byteCount) throws IOException {
                jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(sink, "sink");
                try {
                    long bytesRead = source.read(sink, byteCount);
                    if (bytesRead == -1) {
                        if (!this.cacheRequestClosed) {
                            this.cacheRequestClosed = true;
                            cacheBody.close();
                        }
                        return -1L;
                    }
                    sink.m(cacheBody.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(), sink.b0() - bytesRead, bytesRead);
                    cacheBody.a();
                    return bytesRead;
                } catch (IOException e) {
                    if (!this.cacheRequestClosed) {
                        this.cacheRequestClosed = true;
                        cacheRequest.abort();
                    }
                    throw e;
                }
            }

            @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un
            public up timeout() {
                return source.timeout();
            }

            @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                if (!this.cacheRequestClosed && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    this.cacheRequestClosed = true;
                    cacheRequest.abort();
                }
                source.close();
            }
        };
        String contentType = Response.header$default(response, "Content-Type", null, 2, null);
        long contentLength = response.body().contentLength();
        return response.newBuilder().body(new RealResponseBody(contentType, contentLength, rj.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(unVar))).build();
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(t6 $constructor_marker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Response stripBody(Response response) {
            if ((response != null ? response.body() : null) != null) {
                return response.newBuilder().body(null).build();
            }
            return response;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Headers combine(Headers cachedHeaders, Headers networkHeaders) {
            Headers.Builder result = new Headers.Builder();
            int size = cachedHeaders.size();
            for (int index = 0; index < size; index++) {
                String fieldName = cachedHeaders.name(index);
                String value = cachedHeaders.value(index);
                if ((!lo.d("Warning", fieldName, true) || !lo.q(value, "1", false, 2)) && (isContentSpecificHeader(fieldName) || !isEndToEnd(fieldName) || networkHeaders.get(fieldName) == null)) {
                    result.addLenient$okhttp(fieldName, value);
                }
            }
            int size2 = networkHeaders.size();
            for (int index2 = 0; index2 < size2; index2++) {
                String fieldName2 = networkHeaders.name(index2);
                if (!isContentSpecificHeader(fieldName2) && isEndToEnd(fieldName2)) {
                    result.addLenient$okhttp(fieldName2, networkHeaders.value(index2));
                }
            }
            return result.build();
        }

        private final boolean isEndToEnd(String fieldName) {
            return (lo.d("Connection", fieldName, true) || lo.d("Keep-Alive", fieldName, true) || lo.d("Proxy-Authenticate", fieldName, true) || lo.d("Proxy-Authorization", fieldName, true) || lo.d("TE", fieldName, true) || lo.d("Trailers", fieldName, true) || lo.d("Transfer-Encoding", fieldName, true) || lo.d("Upgrade", fieldName, true)) ? false : true;
        }

        private final boolean isContentSpecificHeader(String fieldName) {
            return lo.d("Content-Length", fieldName, true) || lo.d("Content-Encoding", fieldName, true) || lo.d("Content-Type", fieldName, true);
        }
    }
}
