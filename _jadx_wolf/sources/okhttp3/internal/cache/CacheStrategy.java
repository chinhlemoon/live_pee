package okhttp3.internal.cache;

import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t6;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import okhttp3.internal.http.StatusLine;

/* JADX INFO: loaded from: classes.dex */
public final class CacheStrategy {
    public static final Companion Companion = new Companion(null);
    private final Response cacheResponse;
    private final Request networkRequest;

    public CacheStrategy(Request networkRequest, Response cacheResponse) {
        this.networkRequest = networkRequest;
        this.cacheResponse = cacheResponse;
    }

    public final Request getNetworkRequest() {
        return this.networkRequest;
    }

    public final Response getCacheResponse() {
        return this.cacheResponse;
    }

    public static final class Factory {
        private int ageSeconds;
        private final Response cacheResponse;
        private String etag;
        private Date expires;
        private Date lastModified;
        private String lastModifiedString;
        private final long nowMillis;
        private long receivedResponseMillis;
        private final Request request;
        private long sentRequestMillis;
        private Date servedDate;
        private String servedDateString;

        public Factory(long nowMillis, Request request, Response cacheResponse) {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(request, "request");
            this.nowMillis = nowMillis;
            this.request = request;
            this.cacheResponse = cacheResponse;
            this.ageSeconds = -1;
            if (cacheResponse != null) {
                this.sentRequestMillis = cacheResponse.sentRequestAtMillis();
                this.receivedResponseMillis = cacheResponse.receivedResponseAtMillis();
                Headers headers = cacheResponse.headers();
                int size = headers.size();
                for (int i = 0; i < size; i++) {
                    String fieldName = headers.name(i);
                    String value = headers.value(i);
                    if (lo.d(fieldName, "Date", true)) {
                        this.servedDate = DatesKt.toHttpDateOrNull(value);
                        this.servedDateString = value;
                    } else if (lo.d(fieldName, "Expires", true)) {
                        this.expires = DatesKt.toHttpDateOrNull(value);
                    } else if (lo.d(fieldName, "Last-Modified", true)) {
                        this.lastModified = DatesKt.toHttpDateOrNull(value);
                        this.lastModifiedString = value;
                    } else if (lo.d(fieldName, "ETag", true)) {
                        this.etag = value;
                    } else if (lo.d(fieldName, "Age", true)) {
                        this.ageSeconds = Util.toNonNegativeInt(value, -1);
                    }
                }
            }
        }

        public final Request getRequest$okhttp() {
            return this.request;
        }

        private final boolean isFreshnessLifetimeHeuristic() {
            Response response = this.cacheResponse;
            jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(response);
            return response.cacheControl().maxAgeSeconds() == -1 && this.expires == null;
        }

        public final CacheStrategy compute() {
            CacheStrategy candidate = computeCandidate();
            if (candidate.getNetworkRequest() != null && this.request.cacheControl().onlyIfCached()) {
                return new CacheStrategy(null, null);
            }
            return candidate;
        }

        private final CacheStrategy computeCandidate() {
            String conditionName;
            String conditionValue;
            if (this.cacheResponse == null) {
                return new CacheStrategy(this.request, null);
            }
            if (this.request.isHttps() && this.cacheResponse.handshake() == null) {
                return new CacheStrategy(this.request, null);
            }
            if (!CacheStrategy.Companion.isCacheable(this.cacheResponse, this.request)) {
                return new CacheStrategy(this.request, null);
            }
            CacheControl requestCaching = this.request.cacheControl();
            if (requestCaching.noCache() || hasConditions(this.request)) {
                return new CacheStrategy(this.request, 0);
            }
            CacheControl responseCaching = this.cacheResponse.cacheControl();
            long ageMillis = cacheResponseAge();
            long freshMillis = computeFreshnessLifetime();
            if (requestCaching.maxAgeSeconds() != -1) {
                freshMillis = Math.min(freshMillis, TimeUnit.SECONDS.toMillis(requestCaching.maxAgeSeconds()));
            }
            long minFreshMillis = requestCaching.minFreshSeconds() != -1 ? TimeUnit.SECONDS.toMillis(requestCaching.minFreshSeconds()) : 0L;
            long maxStaleMillis = 0;
            if (!responseCaching.mustRevalidate() && requestCaching.maxStaleSeconds() != -1) {
                maxStaleMillis = TimeUnit.SECONDS.toMillis(requestCaching.maxStaleSeconds());
            }
            if (!responseCaching.noCache() && ageMillis + minFreshMillis < freshMillis + maxStaleMillis) {
                Response.Builder builder = this.cacheResponse.newBuilder();
                if (ageMillis + minFreshMillis >= freshMillis) {
                    builder.addHeader("Warning", "110 HttpURLConnection \"Response is stale\"");
                }
                if (ageMillis > 86400000 && isFreshnessLifetimeHeuristic()) {
                    builder.addHeader("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                }
                return new CacheStrategy(null, builder.build());
            }
            if (this.etag != null) {
                conditionName = "If-None-Match";
                conditionValue = this.etag;
            } else if (this.lastModified != null) {
                conditionName = "If-Modified-Since";
                conditionValue = this.lastModifiedString;
            } else {
                if (this.servedDate == null) {
                    return new CacheStrategy(this.request, null);
                }
                conditionName = "If-Modified-Since";
                conditionValue = this.servedDateString;
            }
            Headers.Builder conditionalRequestHeaders = this.request.headers().newBuilder();
            jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(conditionValue);
            conditionalRequestHeaders.addLenient$okhttp(conditionName, conditionValue);
            Request conditionalRequest = this.request.newBuilder().headers(conditionalRequestHeaders.build()).build();
            return new CacheStrategy(conditionalRequest, this.cacheResponse);
        }

        private final long computeFreshnessLifetime() {
            Response response = this.cacheResponse;
            jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(response);
            CacheControl responseCaching = response.cacheControl();
            if (responseCaching.maxAgeSeconds() != -1) {
                return TimeUnit.SECONDS.toMillis(responseCaching.maxAgeSeconds());
            }
            Date expires = this.expires;
            if (expires != null) {
                Date date = this.servedDate;
                long servedMillis = date != null ? date.getTime() : this.receivedResponseMillis;
                long delta = expires.getTime() - servedMillis;
                if (delta > 0) {
                    return delta;
                }
                return 0L;
            }
            if (this.lastModified == null || this.cacheResponse.request().url().query() != null) {
                return 0L;
            }
            Date date2 = this.servedDate;
            long servedMillis2 = date2 != null ? date2.getTime() : this.sentRequestMillis;
            Date date3 = this.lastModified;
            jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(date3);
            long delta2 = servedMillis2 - date3.getTime();
            if (delta2 > 0) {
                return delta2 / ((long) 10);
            }
            return 0L;
        }

        private final long cacheResponseAge() {
            long receivedAge;
            Date servedDate = this.servedDate;
            long apparentReceivedAge = servedDate != null ? Math.max(0L, this.receivedResponseMillis - servedDate.getTime()) : 0L;
            int i = this.ageSeconds;
            if (i != -1) {
                receivedAge = Math.max(apparentReceivedAge, TimeUnit.SECONDS.toMillis(i));
            } else {
                receivedAge = apparentReceivedAge;
            }
            long j = this.receivedResponseMillis;
            long responseDuration = j - this.sentRequestMillis;
            long residentDuration = this.nowMillis - j;
            return receivedAge + responseDuration + residentDuration;
        }

        private final boolean hasConditions(Request request) {
            return (request.header("If-Modified-Since") == null && request.header("If-None-Match") == null) ? false : true;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(t6 $constructor_marker) {
            this();
        }

        public final boolean isCacheable(Response response, Request request) {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(response, "response");
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(request, "request");
            switch (response.code()) {
                case 200:
                case 203:
                case 204:
                case 300:
                case 301:
                case StatusLine.HTTP_PERM_REDIRECT /* 308 */:
                case 404:
                case 405:
                case 410:
                case 414:
                case 501:
                    break;
                case 302:
                case StatusLine.HTTP_TEMP_REDIRECT /* 307 */:
                    if (Response.header$default(response, "Expires", null, 2, null) == null && response.cacheControl().maxAgeSeconds() == -1 && !response.cacheControl().isPublic() && !response.cacheControl().isPrivate()) {
                        return false;
                    }
                    break;
                default:
                    return false;
            }
            return (response.cacheControl().noStore() || request.cacheControl().noStore()) ? false : true;
        }
    }
}
