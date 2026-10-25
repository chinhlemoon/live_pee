package okhttp3.internal.http1;

import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.up;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v2;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;

/* JADX INFO: loaded from: classes.dex */
public final class Http1ExchangeCodec implements ExchangeCodec {
    public static final Companion Companion = new Companion(null);
    private static final long NO_CHUNK_YET = -1;
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    private final OkHttpClient client;
    private final RealConnection connection;
    private final HeadersReader headersReader;
    private final u2 sink;
    private final v2 source;
    private int state;
    private Headers trailers;

    public Http1ExchangeCodec(OkHttpClient client, RealConnection connection, v2 source, u2 sink) {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(connection, "connection");
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(source, "source");
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(sink, "sink");
        this.client = client;
        this.connection = connection;
        this.source = source;
        this.sink = sink;
        this.headersReader = new HeadersReader(source);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public RealConnection getConnection() {
        return this.connection;
    }

    private final boolean isChunked(Response $this$isChunked) {
        return lo.d("chunked", Response.header$default($this$isChunked, "Transfer-Encoding", null, 2, null), true);
    }

    private final boolean isChunked(Request $this$isChunked) {
        return lo.d("chunked", $this$isChunked.header("Transfer-Encoding"), true);
    }

    public final boolean isClosed() {
        return this.state == 6;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public sn createRequestBody(Request request, long contentLength) throws ProtocolException {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(request, "request");
        if (request.body() != null && request.body().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (isChunked(request)) {
            return newChunkedSink();
        }
        if (contentLength != NO_CHUNK_YET) {
            return newKnownLengthSink();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        getConnection().cancel();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(Request request) {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(request, "request");
        RequestLine requestLine = RequestLine.INSTANCE;
        Proxy.Type type = getConnection().route().proxy().type();
        jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(type, "connection.route().proxy.type()");
        String requestLine2 = requestLine.get(request, type);
        writeRequest(request.headers(), requestLine2);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(Response response) {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(response, "response");
        if (HttpHeaders.promisesBody(response)) {
            return isChunked(response) ? NO_CHUNK_YET : Util.headersContentLength(response);
        }
        return 0L;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public un openResponseBodySource(Response response) {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(response, "response");
        if (!HttpHeaders.promisesBody(response)) {
            return newFixedLengthSource(0L);
        }
        if (isChunked(response)) {
            return newChunkedSource(response.request().url());
        }
        long contentLength = Util.headersContentLength(response);
        if (contentLength != NO_CHUNK_YET) {
            return newFixedLengthSource(contentLength);
        }
        return newUnknownLengthSource();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Headers trailers() {
        if (!(this.state == 6)) {
            throw new IllegalStateException("too early; can't read the trailers yet".toString());
        }
        Headers headers = this.trailers;
        return headers != null ? headers : Util.EMPTY_HEADERS;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() throws IOException {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() {
        this.sink.flush();
    }

    public final void writeRequest(Headers headers, String requestLine) {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(headers, "headers");
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(requestLine, "requestLine");
        if (!(this.state == 0)) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        this.sink.C(requestLine).C("\r\n");
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            this.sink.C(headers.name(i)).C(": ").C(headers.value(i)).C("\r\n");
        }
        this.sink.C("\r\n");
        this.state = 1;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Response.Builder readResponseHeaders(boolean expectContinue) {
        int i = this.state;
        boolean z = true;
        if (i != 1 && i != 3) {
            z = false;
        }
        if (!z) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        try {
            StatusLine statusLine = StatusLine.Companion.parse(this.headersReader.readLine());
            Response.Builder responseBuilder = new Response.Builder().protocol(statusLine.protocol).code(statusLine.code).message(statusLine.message).headers(this.headersReader.readHeaders());
            if (expectContinue && statusLine.code == 100) {
                return null;
            }
            if (statusLine.code == 100) {
                this.state = 3;
            } else {
                this.state = 4;
            }
            return responseBuilder;
        } catch (EOFException e) {
            String address = getConnection().route().address().url().redact();
            throw new IOException("unexpected end of stream on " + address, e);
        }
    }

    private final sn newChunkedSink() {
        if (!(this.state == 1)) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        this.state = 2;
        return new ChunkedSink();
    }

    private final sn newKnownLengthSink() {
        if (!(this.state == 1)) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        this.state = 2;
        return new KnownLengthSink();
    }

    private final un newFixedLengthSource(long length) {
        if (!(this.state == 4)) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        this.state = 5;
        return new FixedLengthSource(length);
    }

    private final un newChunkedSource(HttpUrl url) {
        if (!(this.state == 4)) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        this.state = 5;
        return new ChunkedSource(this, url);
    }

    private final un newUnknownLengthSource() {
        if (!(this.state == 4)) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        this.state = 5;
        getConnection().noNewExchanges$okhttp();
        return new UnknownLengthSource();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void detachTimeout(r9 timeout) {
        up oldDelegate = timeout.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        timeout.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(up.NONE);
        oldDelegate.clearDeadline();
        oldDelegate.clearTimeout();
    }

    public final void skipConnectBody(Response response) {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(response, "response");
        long contentLength = Util.headersContentLength(response);
        if (contentLength == NO_CHUNK_YET) {
            return;
        }
        un body = newFixedLengthSource(contentLength);
        Util.skipAll(body, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        body.close();
    }

    public final class KnownLengthSink implements sn {
        private boolean closed;
        private final r9 timeout;

        public KnownLengthSink() {
            this.timeout = new r9(Http1ExchangeCodec.this.sink.timeout());
        }

        @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sn
        public up timeout() {
            return this.timeout;
        }

        @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sn
        public void write(s2 source, long byteCount) throws IOException {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(source, "source");
            if (!(!this.closed)) {
                throw new IllegalStateException("closed".toString());
            }
            Util.checkOffsetAndCount(source.b0(), 0L, byteCount);
            Http1ExchangeCodec.this.sink.write(source, byteCount);
        }

        @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sn, java.io.Flushable
        public void flush() throws IOException {
            if (this.closed) {
                return;
            }
            Http1ExchangeCodec.this.sink.flush();
        }

        @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sn, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1ExchangeCodec.this.detachTimeout(this.timeout);
            Http1ExchangeCodec.this.state = 3;
        }
    }

    public final class ChunkedSink implements sn {
        private boolean closed;
        private final r9 timeout;

        public ChunkedSink() {
            this.timeout = new r9(Http1ExchangeCodec.this.sink.timeout());
        }

        @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sn
        public up timeout() {
            return this.timeout;
        }

        @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sn
        public void write(s2 source, long byteCount) throws IOException {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(source, "source");
            if (!(!this.closed)) {
                throw new IllegalStateException("closed".toString());
            }
            if (byteCount == 0) {
                return;
            }
            Http1ExchangeCodec.this.sink.b(byteCount);
            Http1ExchangeCodec.this.sink.C("\r\n");
            Http1ExchangeCodec.this.sink.write(source, byteCount);
            Http1ExchangeCodec.this.sink.C("\r\n");
        }

        @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sn, java.io.Flushable
        public synchronized void flush() {
            if (this.closed) {
                return;
            }
            Http1ExchangeCodec.this.sink.flush();
        }

        @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sn, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1ExchangeCodec.this.sink.C("0\r\n\r\n");
            Http1ExchangeCodec.this.detachTimeout(this.timeout);
            Http1ExchangeCodec.this.state = 3;
        }
    }

    public abstract class AbstractSource implements un {
        private boolean closed;
        private final r9 timeout;

        @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un, java.io.Closeable, java.lang.AutoCloseable
        public abstract /* synthetic */ void close() throws IOException;

        public AbstractSource() {
            this.timeout = new r9(Http1ExchangeCodec.this.source.timeout());
        }

        public final r9 getTimeout() {
            return this.timeout;
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final void setClosed(boolean z) {
            this.closed = z;
        }

        @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un
        public up timeout() {
            return this.timeout;
        }

        @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un
        public long read(s2 sink, long byteCount) throws IOException {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(sink, "sink");
            try {
                return Http1ExchangeCodec.this.source.read(sink, byteCount);
            } catch (IOException e) {
                Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
                throw e;
            }
        }

        public final void responseBodyComplete() {
            if (Http1ExchangeCodec.this.state == 6) {
                return;
            }
            if (Http1ExchangeCodec.this.state == 5) {
                Http1ExchangeCodec.this.detachTimeout(this.timeout);
                Http1ExchangeCodec.this.state = 6;
            } else {
                throw new IllegalStateException("state: " + Http1ExchangeCodec.this.state);
            }
        }
    }

    public final class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;

        public FixedLengthSource(long bytesRemaining) {
            super();
            this.bytesRemaining = bytesRemaining;
            if (bytesRemaining == 0) {
                responseBodyComplete();
            }
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un
        public long read(s2 sink, long byteCount) throws IOException {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(sink, "sink");
            if (byteCount >= 0) {
                if (!(true ^ getClosed())) {
                    throw new IllegalStateException("closed".toString());
                }
                long j = this.bytesRemaining;
                if (j == 0) {
                    return Http1ExchangeCodec.NO_CHUNK_YET;
                }
                long read = super.read(sink, Math.min(j, byteCount));
                if (read == Http1ExchangeCodec.NO_CHUNK_YET) {
                    Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                    ProtocolException e = new ProtocolException("unexpected end of stream");
                    responseBodyComplete();
                    throw e;
                }
                long j2 = this.bytesRemaining - read;
                this.bytesRemaining = j2;
                if (j2 == 0) {
                    responseBodyComplete();
                }
                return read;
            }
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.bytesRemaining != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
            }
            setClosed(true);
        }
    }

    public final class ChunkedSource extends AbstractSource {
        private long bytesRemainingInChunk;
        private boolean hasMoreChunks;
        public final /* synthetic */ Http1ExchangeCodec this$0;
        private final HttpUrl url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChunkedSource(Http1ExchangeCodec this$0, HttpUrl url) {
            super();
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(url, "url");
            this.this$0 = this$0;
            this.url = url;
            this.bytesRemainingInChunk = Http1ExchangeCodec.NO_CHUNK_YET;
            this.hasMoreChunks = true;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un
        public long read(s2 sink, long byteCount) throws IOException {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(sink, "sink");
            if (byteCount >= 0) {
                if (!(true ^ getClosed())) {
                    throw new IllegalStateException("closed".toString());
                }
                if (!this.hasMoreChunks) {
                    return Http1ExchangeCodec.NO_CHUNK_YET;
                }
                long j = this.bytesRemainingInChunk;
                if (j == 0 || j == Http1ExchangeCodec.NO_CHUNK_YET) {
                    readChunkSize();
                    if (!this.hasMoreChunks) {
                        return Http1ExchangeCodec.NO_CHUNK_YET;
                    }
                }
                long read = super.read(sink, Math.min(byteCount, this.bytesRemainingInChunk));
                if (read == Http1ExchangeCodec.NO_CHUNK_YET) {
                    this.this$0.getConnection().noNewExchanges$okhttp();
                    ProtocolException e = new ProtocolException("unexpected end of stream");
                    responseBodyComplete();
                    throw e;
                }
                this.bytesRemainingInChunk -= read;
                return read;
            }
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }

        private final void readChunkSize() throws IOException {
            if (this.bytesRemainingInChunk != Http1ExchangeCodec.NO_CHUNK_YET) {
                this.this$0.source.w();
            }
            try {
                this.bytesRemainingInChunk = this.this$0.source.I();
                String strW = this.this$0.source.w();
                if (strW == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                String extensions = mo.j0(strW).toString();
                if (this.bytesRemainingInChunk >= 0) {
                    if (!(extensions.length() > 0) || lo.q(extensions, ";", false, 2)) {
                        if (this.bytesRemainingInChunk == 0) {
                            this.hasMoreChunks = false;
                            Http1ExchangeCodec http1ExchangeCodec = this.this$0;
                            http1ExchangeCodec.trailers = http1ExchangeCodec.headersReader.readHeaders();
                            OkHttpClient okHttpClient = this.this$0.client;
                            jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(okHttpClient);
                            CookieJar cookieJar = okHttpClient.cookieJar();
                            HttpUrl httpUrl = this.url;
                            Headers headers = this.this$0.trailers;
                            jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(headers);
                            HttpHeaders.receiveHeaders(cookieJar, httpUrl, headers);
                            responseBodyComplete();
                            return;
                        }
                        return;
                    }
                }
                throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.bytesRemainingInChunk + extensions + '\"');
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.this$0.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
            }
            setClosed(true);
        }
    }

    public final class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;

        public UnknownLengthSource() {
            super();
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un
        public long read(s2 sink, long byteCount) throws IOException {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(sink, "sink");
            if (byteCount >= 0) {
                if (!(!getClosed())) {
                    throw new IllegalStateException("closed".toString());
                }
                if (this.inputExhausted) {
                    return Http1ExchangeCodec.NO_CHUNK_YET;
                }
                long read = super.read(sink, byteCount);
                if (read == Http1ExchangeCodec.NO_CHUNK_YET) {
                    this.inputExhausted = true;
                    responseBodyComplete();
                    return Http1ExchangeCodec.NO_CHUNK_YET;
                }
                return read;
            }
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (!this.inputExhausted) {
                responseBodyComplete();
            }
            setClosed(true);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(t6 $constructor_marker) {
            this();
        }
    }
}
