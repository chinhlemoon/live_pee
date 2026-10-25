package okhttp3.logging;

import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.co;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jb;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.on;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z3;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes.dex */
public final class HttpLoggingInterceptor implements Interceptor {
    private volatile Set<String> headersToRedact;
    private volatile Level level;
    private final Logger logger;

    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpLoggingInterceptor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public HttpLoggingInterceptor(Logger logger) {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(logger, "logger");
        this.logger = logger;
        this.headersToRedact = on.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        this.level = Level.NONE;
    }

    public /* synthetic */ HttpLoggingInterceptor(Logger logger, int i, t6 t6Var) {
        this((i & 1) != 0 ? Logger.DEFAULT : logger);
    }

    public final Level getLevel() {
        return this.level;
    }

    public final void level(Level level) {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(level, "<set-?>");
        this.level = level;
    }

    public interface Logger {
        public static final Companion Companion = new Companion(null);
        public static final Logger DEFAULT = new Companion.DefaultLogger();

        void log(String str);

        public static final class Companion {
            public static final /* synthetic */ Companion $$INSTANCE = null;

            private Companion() {
            }

            public /* synthetic */ Companion(t6 $constructor_marker) {
                this();
            }

            public static final class DefaultLogger implements Logger {
                @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
                public void log(String message) {
                    jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(message, "message");
                    Platform.log$default(Platform.Companion.get(), message, 0, null, 6, null);
                }
            }
        }
    }

    public final void redactHeader(String name) {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(name, "name");
        lo.e(co.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa);
        TreeSet newHeadersToRedact = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        i4.i(newHeadersToRedact, this.headersToRedact);
        newHeadersToRedact.add(name);
        this.headersToRedact = newHeadersToRedact;
    }

    public final HttpLoggingInterceptor setLevel(Level level) {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(level, "level");
        this.level = level;
        return this;
    }

    /* JADX INFO: renamed from: -deprecated_level, reason: not valid java name */
    public final Level m9096deprecated_level() {
        return this.level;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws Exception {
        Charset charset;
        Charset charset2;
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(chain, "chain");
        Level level = this.level;
        Request request = chain.request();
        if (level == Level.NONE) {
            return chain.proceed(request);
        }
        boolean logBody = level == Level.BODY;
        boolean logHeaders = logBody || level == Level.HEADERS;
        RequestBody requestBody = request.body();
        Connection connection = chain.connection();
        StringBuilder sb = new StringBuilder();
        sb.append("--> ");
        sb.append(request.method());
        sb.append(' ');
        sb.append(request.url());
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        sb.append(connection != null ? " " + connection.protocol() : HttpUrl.FRAGMENT_ENCODE_SET);
        String requestStartMessage = sb.toString();
        this.logger.log((!logHeaders && requestBody != null) ? requestStartMessage + " (" + requestBody.contentLength() + "-byte body)" : requestStartMessage);
        String str2 = "UTF_8";
        if (logHeaders) {
            Headers headers = request.headers();
            if (requestBody != null) {
                MediaType it = requestBody.contentType();
                if (it != null && headers.get("Content-Type") == null) {
                    this.logger.log("Content-Type: " + it);
                }
                if (requestBody.contentLength() != -1 && headers.get("Content-Length") == null) {
                    this.logger.log("Content-Length: " + requestBody.contentLength());
                }
            }
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                logHeader(headers, i);
            }
            if (!logBody || requestBody == null) {
                this.logger.log("--> END " + request.method());
            } else if (bodyHasUnknownEncoding(request.headers())) {
                this.logger.log("--> END " + request.method() + " (encoded body omitted)");
                str2 = "UTF_8";
                str = str;
            } else if (requestBody.isDuplex()) {
                this.logger.log("--> END " + request.method() + " (duplex request body omitted)");
                str2 = "UTF_8";
                str = str;
            } else if (requestBody.isOneShot()) {
                this.logger.log("--> END " + request.method() + " (one-shot body omitted)");
                str2 = "UTF_8";
                str = str;
            } else {
                s2 buffer = new s2();
                requestBody.writeTo(buffer);
                MediaType contentType = requestBody.contentType();
                if (contentType == null || (charset2 = contentType.charset(StandardCharsets.UTF_8)) == null) {
                    charset2 = StandardCharsets.UTF_8;
                    jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(charset2, "UTF_8");
                }
                this.logger.log(HttpUrl.FRAGMENT_ENCODE_SET);
                if (Utf8Kt.isProbablyUtf8(buffer)) {
                    this.logger.log(buffer.J(charset2));
                    Logger logger = this.logger;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("--> END ");
                    sb2.append(request.method());
                    sb2.append(" (");
                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                    sb2.append(requestBody.contentLength());
                    sb2.append("-byte body)");
                    logger.log(sb2.toString());
                    str2 = "UTF_8";
                } else {
                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                    Logger logger2 = this.logger;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("--> END ");
                    sb3.append(request.method());
                    sb3.append(" (binary ");
                    str2 = "UTF_8";
                    sb3.append(requestBody.contentLength());
                    sb3.append("-byte body omitted)");
                    logger2.log(sb3.toString());
                }
            }
        } else {
            str2 = "UTF_8";
            str = str;
        }
        long startNs = System.nanoTime();
        try {
            Response response = chain.proceed(request);
            long tookMs = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - startNs);
            ResponseBody responseBody = response.body();
            jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(responseBody);
            long contentLength = responseBody.contentLength();
            String bodySize = contentLength != -1 ? contentLength + "-byte" : "unknown-length";
            Logger logger3 = this.logger;
            StringBuilder sb4 = new StringBuilder();
            String str3 = str2;
            sb4.append("<-- ");
            sb4.append(response.code());
            sb4.append(response.message().length() == 0 ? str : String.valueOf(' ') + response.message());
            sb4.append(' ');
            sb4.append(response.request().url());
            sb4.append(" (");
            sb4.append(tookMs);
            sb4.append("ms");
            sb4.append(logHeaders ? str : ", " + bodySize + " body");
            sb4.append(')');
            logger3.log(sb4.toString());
            if (logHeaders) {
                Headers headers2 = response.headers();
                int size2 = headers2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    logHeader(headers2, i2);
                }
                if (!logBody || !HttpHeaders.promisesBody(response)) {
                    this.logger.log("<-- END HTTP");
                } else if (bodyHasUnknownEncoding(response.headers())) {
                    this.logger.log("<-- END HTTP (encoded body omitted)");
                } else {
                    v2 source = responseBody.source();
                    source.p(Long.MAX_VALUE);
                    s2 s2VarXadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = source.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
                    Long gzippedLength = null;
                    if (lo.d("gzip", headers2.get("Content-Encoding"), true)) {
                        gzippedLength = Long.valueOf(s2VarXadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.b0());
                        jb gzippedResponseBody = new jb(s2VarXadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa());
                        try {
                            s2VarXadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = new s2();
                            s2VarXadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.o(gzippedResponseBody);
                            z3.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(gzippedResponseBody, null);
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                z3.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(gzippedResponseBody, th);
                                throw th2;
                            }
                        }
                    }
                    MediaType contentType2 = responseBody.contentType();
                    if (contentType2 == null || (charset = contentType2.charset(StandardCharsets.UTF_8)) == null) {
                        charset = StandardCharsets.UTF_8;
                        jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(charset, str3);
                    }
                    if (!Utf8Kt.isProbablyUtf8(s2VarXadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa)) {
                        String bodySize2 = str;
                        this.logger.log(bodySize2);
                        this.logger.log("<-- END HTTP (binary " + s2VarXadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.b0() + "-byte body omitted)");
                        return response;
                    }
                    String bodySize3 = str;
                    if (contentLength != 0) {
                        this.logger.log(bodySize3);
                        this.logger.log(s2VarXadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa().J(charset));
                    }
                    if (gzippedLength == null) {
                        this.logger.log("<-- END HTTP (" + s2VarXadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.b0() + "-byte body)");
                    } else {
                        this.logger.log("<-- END HTTP (" + s2VarXadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.b0() + "-byte, " + gzippedLength + "-gzipped-byte body)");
                    }
                }
            }
            return response;
        } catch (Exception e) {
            this.logger.log("<-- HTTP FAILED: " + e);
            throw e;
        }
    }

    private final void logHeader(Headers headers, int i) {
        String value = this.headersToRedact.contains(headers.name(i)) ? "██" : headers.value(i);
        this.logger.log(headers.name(i) + ": " + value);
    }

    private final boolean bodyHasUnknownEncoding(Headers headers) {
        String contentEncoding = headers.get("Content-Encoding");
        return (contentEncoding == null || lo.d(contentEncoding, "identity", true) || lo.d(contentEncoding, "gzip", true)) ? false : true;
    }
}
