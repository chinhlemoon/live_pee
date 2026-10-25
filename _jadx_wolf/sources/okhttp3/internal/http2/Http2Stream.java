package okhttp3.internal.http2;

import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.up;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v2;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import okhttp3.Headers;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes.dex */
public final class Http2Stream {
    public static final Companion Companion = new Companion(null);
    public static final long EMIT_BUFFER_SIZE = 16384;
    private final Http2Connection connection;
    private ErrorCode errorCode;
    private IOException errorException;
    private boolean hasResponseHeaders;
    private final ArrayDeque<Headers> headersQueue;
    private final int id;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final StreamTimeout readTimeout;
    private final FramingSink sink;
    private final FramingSource source;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final StreamTimeout writeTimeout;

    public Http2Stream(int id, Http2Connection connection, boolean outFinished, boolean inFinished, Headers headers) {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(connection, "connection");
        this.id = id;
        this.connection = connection;
        this.writeBytesMaximum = connection.getPeerSettings().getInitialWindowSize();
        ArrayDeque<Headers> arrayDeque = new ArrayDeque<>();
        this.headersQueue = arrayDeque;
        this.source = new FramingSource(connection.getOkHttpSettings().getInitialWindowSize(), inFinished);
        this.sink = new FramingSink(outFinished);
        this.readTimeout = new StreamTimeout();
        this.writeTimeout = new StreamTimeout();
        if (headers != null) {
            if (!(!isLocallyInitiated())) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(headers);
        } else if (!isLocallyInitiated()) {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    public final int getId() {
        return this.id;
    }

    public final Http2Connection getConnection() {
        return this.connection;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    public final void setReadBytesTotal$okhttp(long j) {
        this.readBytesTotal = j;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final void setReadBytesAcknowledged$okhttp(long j) {
        this.readBytesAcknowledged = j;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final void setWriteBytesTotal$okhttp(long j) {
        this.writeBytesTotal = j;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final void setWriteBytesMaximum$okhttp(long j) {
        this.writeBytesMaximum = j;
    }

    public final FramingSource getSource$okhttp() {
        return this.source;
    }

    public final FramingSink getSink$okhttp() {
        return this.sink;
    }

    public final StreamTimeout getReadTimeout$okhttp() {
        return this.readTimeout;
    }

    public final StreamTimeout getWriteTimeout$okhttp() {
        return this.writeTimeout;
    }

    public final synchronized ErrorCode getErrorCode$okhttp() {
        return this.errorCode;
    }

    public final void setErrorCode$okhttp(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public final IOException getErrorException$okhttp() {
        return this.errorException;
    }

    public final void setErrorException$okhttp(IOException iOException) {
        this.errorException = iOException;
    }

    public final synchronized boolean isOpen() {
        if (this.errorCode != null) {
            return false;
        }
        return ((this.source.getFinished$okhttp() || this.source.getClosed$okhttp()) && (this.sink.getFinished() || this.sink.getClosed()) && this.hasResponseHeaders) ? false : true;
    }

    public final boolean isLocallyInitiated() {
        boolean streamIsClient = (this.id & 1) == 1;
        return this.connection.getClient$okhttp() == streamIsClient;
    }

    public final synchronized Headers takeHeaders() throws IOException {
        Headers headersRemoveFirst;
        this.readTimeout.enter();
        while (this.headersQueue.isEmpty()) {
            try {
                try {
                    if (this.errorCode != null) {
                        break;
                    }
                    waitForIo$okhttp();
                } catch (Throwable th) {
                    th = th;
                    this.readTimeout.exitAndThrowIfTimedOut();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        this.readTimeout.exitAndThrowIfTimedOut();
        if (!this.headersQueue.isEmpty()) {
            headersRemoveFirst = this.headersQueue.removeFirst();
            jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(headersRemoveFirst, "headersQueue.removeFirst()");
        } else {
            Throwable streamResetException = this.errorException;
            if (streamResetException == null) {
                ErrorCode errorCode = this.errorCode;
                jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(errorCode);
                streamResetException = new StreamResetException(errorCode);
            }
            throw streamResetException;
        }
        return headersRemoveFirst;
    }

    public final synchronized Headers trailers() throws IOException {
        Headers trailers;
        if (this.source.getFinished$okhttp() && this.source.getReceiveBuffer().E() && this.source.getReadBuffer().E()) {
            trailers = this.source.getTrailers();
            if (trailers == null) {
                trailers = Util.EMPTY_HEADERS;
            }
        } else {
            if (this.errorCode != null) {
                Throwable streamResetException = this.errorException;
                if (streamResetException == null) {
                    ErrorCode errorCode = this.errorCode;
                    jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(errorCode);
                    streamResetException = new StreamResetException(errorCode);
                }
                throw streamResetException;
            }
            throw new IllegalStateException("too early; can't read the trailers yet");
        }
        return trailers;
    }

    public final void writeHeaders(List<Header> list, boolean outFinished, boolean flushHeaders) throws IOException {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(list, "responseHeaders");
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        boolean flushHeaders2 = flushHeaders;
        synchronized (this) {
            this.hasResponseHeaders = true;
            if (outFinished) {
                this.sink.setFinished(true);
            }
            hr hrVar = hr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        if (!flushHeaders2) {
            synchronized (this.connection) {
                flushHeaders2 = this.connection.getWriteBytesTotal() >= this.connection.getWriteBytesMaximum();
            }
        }
        this.connection.writeHeaders$okhttp(this.id, outFinished, list);
        if (flushHeaders2) {
            this.connection.flush();
        }
    }

    public final void enqueueTrailers(Headers trailers) {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(trailers, "trailers");
        synchronized (this) {
            boolean z = true;
            if (!(!this.sink.getFinished())) {
                throw new IllegalStateException("already finished".toString());
            }
            if (trailers.size() == 0) {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException("trailers.size() == 0".toString());
            }
            this.sink.setTrailers(trailers);
            hr hrVar = hr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
    }

    public final up readTimeout() {
        return this.readTimeout;
    }

    public final up writeTimeout() {
        return this.writeTimeout;
    }

    public final un getSource() {
        return this.source;
    }

    public final sn getSink() {
        synchronized (this) {
            if (!(this.hasResponseHeaders || isLocallyInitiated())) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
            hr hrVar = hr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return this.sink;
    }

    public final void close(ErrorCode rstStatusCode, IOException errorException) throws IOException {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(rstStatusCode, "rstStatusCode");
        if (!closeInternal(rstStatusCode, errorException)) {
            return;
        }
        this.connection.writeSynReset$okhttp(this.id, rstStatusCode);
    }

    public final void closeLater(ErrorCode errorCode) {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(errorCode, "errorCode");
        if (!closeInternal(errorCode, null)) {
            return;
        }
        this.connection.writeSynResetLater$okhttp(this.id, errorCode);
    }

    private final boolean closeInternal(ErrorCode errorCode, IOException errorException) {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        synchronized (this) {
            if (this.errorCode != null) {
                return false;
            }
            if (this.source.getFinished$okhttp() && this.sink.getFinished()) {
                return false;
            }
            this.errorCode = errorCode;
            this.errorException = errorException;
            notifyAll();
            hr hrVar = hr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
            this.connection.removeStream$okhttp(this.id);
            return true;
        }
    }

    public final void receiveData(v2 source, int length) throws IOException {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(source, "source");
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        this.source.receive$okhttp(source, length);
    }

    public final void receiveHeaders(Headers headers, boolean inFinished) {
        boolean open;
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(headers, "headers");
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        synchronized (this) {
            if (!this.hasResponseHeaders || !inFinished) {
                this.hasResponseHeaders = true;
                this.headersQueue.add(headers);
            } else {
                this.source.setTrailers(headers);
            }
            if (inFinished) {
                this.source.setFinished$okhttp(true);
            }
            open = isOpen();
            notifyAll();
            hr hrVar = hr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        if (!open) {
            this.connection.removeStream$okhttp(this.id);
        }
    }

    public final synchronized void receiveRstStream(ErrorCode errorCode) {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(errorCode, "errorCode");
        if (this.errorCode == null) {
            this.errorCode = errorCode;
            notifyAll();
        }
    }

    public final class FramingSource implements un {
        private boolean closed;
        private boolean finished;
        private final long maxByteCount;
        private Headers trailers;
        private final s2 receiveBuffer = new s2();
        private final s2 readBuffer = new s2();

        public FramingSource(long maxByteCount, boolean finished) {
            this.maxByteCount = maxByteCount;
            this.finished = finished;
        }

        public final boolean getFinished$okhttp() {
            return this.finished;
        }

        public final void setFinished$okhttp(boolean z) {
            this.finished = z;
        }

        public final s2 getReceiveBuffer() {
            return this.receiveBuffer;
        }

        public final s2 getReadBuffer() {
            return this.readBuffer;
        }

        public final Headers getTrailers() {
            return this.trailers;
        }

        public final void setTrailers(Headers headers) {
            this.trailers = headers;
        }

        public final boolean getClosed$okhttp() {
            return this.closed;
        }

        public final void setClosed$okhttp(boolean z) {
            this.closed = z;
        }

        @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un
        public long read(s2 sink, long byteCount) throws IOException {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(sink, "sink");
            long j = 0;
            if (!(byteCount >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
            }
            while (true) {
                boolean tryAgain = false;
                long readBytesDelivered = -1;
                IOException iOException = null;
                synchronized (Http2Stream.this) {
                    Http2Stream.this.getReadTimeout$okhttp().enter();
                    try {
                        if (Http2Stream.this.getErrorCode$okhttp() != null) {
                            IOException errorException$okhttp = Http2Stream.this.getErrorException$okhttp();
                            if (errorException$okhttp == null) {
                                ErrorCode errorCode$okhttp = Http2Stream.this.getErrorCode$okhttp();
                                jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(errorCode$okhttp);
                                errorException$okhttp = new StreamResetException(errorCode$okhttp);
                            }
                            iOException = errorException$okhttp;
                        }
                        if (this.closed) {
                            throw new IOException("stream closed");
                        }
                        if (this.readBuffer.b0() > j) {
                            s2 s2Var = this.readBuffer;
                            readBytesDelivered = s2Var.read(sink, Math.min(byteCount, s2Var.b0()));
                            Http2Stream http2Stream = Http2Stream.this;
                            http2Stream.setReadBytesTotal$okhttp(http2Stream.getReadBytesTotal() + readBytesDelivered);
                            long unacknowledgedBytesRead = Http2Stream.this.getReadBytesTotal() - Http2Stream.this.getReadBytesAcknowledged();
                            if (iOException == null && unacknowledgedBytesRead >= Http2Stream.this.getConnection().getOkHttpSettings().getInitialWindowSize() / 2) {
                                Http2Stream.this.getConnection().writeWindowUpdateLater$okhttp(Http2Stream.this.getId(), unacknowledgedBytesRead);
                                Http2Stream http2Stream2 = Http2Stream.this;
                                http2Stream2.setReadBytesAcknowledged$okhttp(http2Stream2.getReadBytesTotal());
                            }
                        } else if (!this.finished && iOException == null) {
                            Http2Stream.this.waitForIo$okhttp();
                            tryAgain = true;
                        }
                        Http2Stream.this.getReadTimeout$okhttp().exitAndThrowIfTimedOut();
                        hr hrVar = hr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
                    } catch (Throwable th) {
                        Http2Stream.this.getReadTimeout$okhttp().exitAndThrowIfTimedOut();
                        throw th;
                    }
                }
                if (!tryAgain) {
                    if (readBytesDelivered != -1) {
                        updateConnectionFlowControl(readBytesDelivered);
                        return readBytesDelivered;
                    }
                    if (iOException == null) {
                        return -1L;
                    }
                    jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(iOException);
                    throw iOException;
                }
                j = 0;
            }
        }

        private final void updateConnectionFlowControl(long read) {
            Object $this$assertThreadDoesntHoldLock$iv = Http2Stream.this;
            if (!Util.assertionsEnabled || !Thread.holdsLock($this$assertThreadDoesntHoldLock$iv)) {
                Http2Stream.this.getConnection().updateConnectionFlowControl$okhttp(read);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append($this$assertThreadDoesntHoldLock$iv);
            throw new AssertionError(sb.toString());
        }

        public final void receive$okhttp(v2 source, long byteCount) throws IOException {
            boolean finished;
            boolean flowControlError;
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(source, "source");
            Object $this$assertThreadDoesntHoldLock$iv = Http2Stream.this;
            if (!Util.assertionsEnabled || !Thread.holdsLock($this$assertThreadDoesntHoldLock$iv)) {
                long byteCount2 = byteCount;
                while (byteCount2 > 0) {
                    synchronized (Http2Stream.this) {
                        finished = this.finished;
                        flowControlError = this.readBuffer.b0() + byteCount2 > this.maxByteCount;
                        hr hrVar = hr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
                    }
                    if (flowControlError) {
                        source.j(byteCount2);
                        Http2Stream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                        return;
                    }
                    if (finished) {
                        source.j(byteCount2);
                        return;
                    }
                    long read = source.read(this.receiveBuffer, byteCount2);
                    if (read == -1) {
                        throw new EOFException();
                    }
                    byteCount2 -= read;
                    long bytesDiscarded = 0;
                    synchronized (Http2Stream.this) {
                        if (this.closed) {
                            bytesDiscarded = this.receiveBuffer.b0();
                            this.receiveBuffer.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
                        } else {
                            boolean wasEmpty = this.readBuffer.b0() == 0;
                            this.readBuffer.o(this.receiveBuffer);
                            if (wasEmpty) {
                                Object $this$notifyAll$iv = Http2Stream.this;
                                if ($this$notifyAll$iv == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                }
                                $this$notifyAll$iv.notifyAll();
                            }
                        }
                    }
                    if (bytesDiscarded > 0) {
                        updateConnectionFlowControl(bytesDiscarded);
                    }
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append($this$assertThreadDoesntHoldLock$iv);
            throw new AssertionError(sb.toString());
        }

        @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un
        public up timeout() {
            return Http2Stream.this.getReadTimeout$okhttp();
        }

        @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long bytesDiscarded;
            synchronized (Http2Stream.this) {
                this.closed = true;
                bytesDiscarded = this.readBuffer.b0();
                this.readBuffer.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
                Object $this$notifyAll$iv = Http2Stream.this;
                if ($this$notifyAll$iv == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
                $this$notifyAll$iv.notifyAll();
                hr hrVar = hr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
            }
            if (bytesDiscarded > 0) {
                updateConnectionFlowControl(bytesDiscarded);
            }
            Http2Stream.this.cancelStreamIfNecessary$okhttp();
        }
    }

    public final void cancelStreamIfNecessary$okhttp() throws IOException {
        boolean cancel;
        boolean open;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        synchronized (this) {
            cancel = !this.source.getFinished$okhttp() && this.source.getClosed$okhttp() && (this.sink.getFinished() || this.sink.getClosed());
            open = isOpen();
            hr hrVar = hr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        if (cancel) {
            close(ErrorCode.CANCEL, null);
        } else if (!open) {
            this.connection.removeStream$okhttp(this.id);
        }
    }

    public final class FramingSink implements sn {
        private boolean closed;
        private boolean finished;
        private final s2 sendBuffer;
        private Headers trailers;

        public FramingSink(boolean finished) {
            this.finished = finished;
            this.sendBuffer = new s2();
        }

        public /* synthetic */ FramingSink(Http2Stream http2Stream, boolean z, int i, t6 t6Var) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean getFinished() {
            return this.finished;
        }

        public final void setFinished(boolean z) {
            this.finished = z;
        }

        public final Headers getTrailers() {
            return this.trailers;
        }

        public final void setTrailers(Headers headers) {
            this.trailers = headers;
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final void setClosed(boolean z) {
            this.closed = z;
        }

        @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sn
        public void write(s2 source, long byteCount) throws Throwable {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(source, "source");
            Object $this$assertThreadDoesntHoldLock$iv = Http2Stream.this;
            if (!Util.assertionsEnabled || !Thread.holdsLock($this$assertThreadDoesntHoldLock$iv)) {
                this.sendBuffer.write(source, byteCount);
                while (this.sendBuffer.b0() >= Http2Stream.EMIT_BUFFER_SIZE) {
                    emitFrame(false);
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append($this$assertThreadDoesntHoldLock$iv);
            throw new AssertionError(sb.toString());
        }

        private final void emitFrame(boolean outFinishedOnLastFrame) throws Throwable {
            synchronized (Http2Stream.this) {
                try {
                    Http2Stream.this.getWriteTimeout$okhttp().enter();
                    while (Http2Stream.this.getWriteBytesTotal() >= Http2Stream.this.getWriteBytesMaximum() && !this.finished && !this.closed && Http2Stream.this.getErrorCode$okhttp() == null) {
                        try {
                            Http2Stream.this.waitForIo$okhttp();
                        } catch (Throwable th) {
                            Http2Stream.this.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                            throw th;
                        }
                    }
                    Http2Stream.this.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                    Http2Stream.this.checkOutNotClosed$okhttp();
                    long toWrite = Math.min(Http2Stream.this.getWriteBytesMaximum() - Http2Stream.this.getWriteBytesTotal(), this.sendBuffer.b0());
                    Http2Stream http2Stream = Http2Stream.this;
                    http2Stream.setWriteBytesTotal$okhttp(http2Stream.getWriteBytesTotal() + toWrite);
                    boolean outFinished = outFinishedOnLastFrame && toWrite == this.sendBuffer.b0();
                    try {
                        hr hrVar = hr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
                        Http2Stream.this.getWriteTimeout$okhttp().enter();
                        try {
                            Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), outFinished, this.sendBuffer, toWrite);
                        } finally {
                            Http2Stream.this.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }

        @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sn, java.io.Flushable
        public void flush() throws Throwable {
            Object $this$assertThreadDoesntHoldLock$iv = Http2Stream.this;
            if (!Util.assertionsEnabled || !Thread.holdsLock($this$assertThreadDoesntHoldLock$iv)) {
                synchronized (Http2Stream.this) {
                    Http2Stream.this.checkOutNotClosed$okhttp();
                    hr hrVar = hr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
                }
                while (this.sendBuffer.b0() > 0) {
                    emitFrame(false);
                    Http2Stream.this.getConnection().flush();
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append($this$assertThreadDoesntHoldLock$iv);
            throw new AssertionError(sb.toString());
        }

        @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sn
        public up timeout() {
            return Http2Stream.this.getWriteTimeout$okhttp();
        }

        @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sn, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws Throwable {
            Object $this$assertThreadDoesntHoldLock$iv = Http2Stream.this;
            if (!Util.assertionsEnabled || !Thread.holdsLock($this$assertThreadDoesntHoldLock$iv)) {
                synchronized (Http2Stream.this) {
                    if (this.closed) {
                        return;
                    }
                    boolean outFinished = Http2Stream.this.getErrorCode$okhttp() == null;
                    hr hrVar = hr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
                    if (!Http2Stream.this.getSink$okhttp().finished) {
                        boolean hasData = this.sendBuffer.b0() > 0;
                        boolean hasTrailers = this.trailers != null;
                        if (hasTrailers) {
                            while (this.sendBuffer.b0() > 0) {
                                emitFrame(false);
                            }
                            Http2Connection connection = Http2Stream.this.getConnection();
                            int id = Http2Stream.this.getId();
                            Headers headers = this.trailers;
                            jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(headers);
                            connection.writeHeaders$okhttp(id, outFinished, Util.toHeaderList(headers));
                        } else if (hasData) {
                            while (this.sendBuffer.b0() > 0) {
                                emitFrame(true);
                            }
                        } else if (outFinished) {
                            Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), true, null, 0L);
                        }
                    }
                    synchronized (Http2Stream.this) {
                        this.closed = true;
                        hr hrVar2 = hr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
                    }
                    Http2Stream.this.getConnection().flush();
                    Http2Stream.this.cancelStreamIfNecessary$okhttp();
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append($this$assertThreadDoesntHoldLock$iv);
            throw new AssertionError(sb.toString());
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(t6 $constructor_marker) {
            this();
        }
    }

    public final void addBytesToWriteWindow(long delta) {
        this.writeBytesMaximum += delta;
        if (delta > 0) {
            notifyAll();
        }
    }

    public final void checkOutNotClosed$okhttp() throws IOException {
        if (this.sink.getClosed()) {
            throw new IOException("stream closed");
        }
        if (this.sink.getFinished()) {
            throw new IOException("stream finished");
        }
        if (this.errorCode != null) {
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.errorCode;
            jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(errorCode);
            throw new StreamResetException(errorCode);
        }
    }

    public final void waitForIo$okhttp() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final class StreamTimeout extends f2 {
        public StreamTimeout() {
        }

        @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f2
        public void timedOut() {
            Http2Stream.this.closeLater(ErrorCode.CANCEL);
            Http2Stream.this.getConnection().sendDegradedPingLater$okhttp();
        }

        @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f2
        public IOException newTimeoutException(IOException cause) {
            SocketTimeoutException $this$apply = new SocketTimeoutException("timeout");
            if (cause != null) {
                $this$apply.initCause(cause);
            }
            return $this$apply;
        }

        public final void exitAndThrowIfTimedOut() throws IOException {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }
    }
}
