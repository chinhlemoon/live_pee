package okhttp3.internal.http2;

import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u2;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes.dex */
public final class Http2Writer implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final s2 hpackBuffer;
    private final Hpack.Writer hpackWriter;
    private int maxFrameSize;
    private final u2 sink;

    public Http2Writer(u2 sink, boolean client) {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(sink, "sink");
        this.sink = sink;
        this.client = client;
        s2 s2Var = new s2();
        this.hpackBuffer = s2Var;
        this.maxFrameSize = Http2.INITIAL_MAX_FRAME_SIZE;
        this.hpackWriter = new Hpack.Writer(0, false, s2Var, 3, null);
    }

    public final Hpack.Writer getHpackWriter() {
        return this.hpackWriter;
    }

    public final synchronized void connectionPreface() throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        if (this.client) {
            Logger logger2 = logger;
            if (logger2.isLoggable(Level.FINE)) {
                logger2.fine(Util.format(">> CONNECTION " + Http2.CONNECTION_PREFACE.a(), new Object[0]));
            }
            this.sink.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(Http2.CONNECTION_PREFACE);
            this.sink.flush();
        }
    }

    public final synchronized void applyAndAckSettings(Settings peerSettings) throws IOException {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(peerSettings, "peerSettings");
        if (this.closed) {
            throw new IOException("closed");
        }
        this.maxFrameSize = peerSettings.getMaxFrameSize(this.maxFrameSize);
        if (peerSettings.getHeaderTableSize() != -1) {
            this.hpackWriter.resizeHeaderTable(peerSettings.getHeaderTableSize());
        }
        frameHeader(0, 0, 4, 1);
        this.sink.flush();
    }

    public final synchronized void pushPromise(int streamId, int promisedStreamId, List<Header> list) throws IOException {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(list, "requestHeaders");
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.writeHeaders(list);
        long byteCount = this.hpackBuffer.b0();
        int length = (int) Math.min(((long) this.maxFrameSize) - 4, byteCount);
        frameHeader(streamId, length + 4, 5, byteCount == ((long) length) ? 4 : 0);
        this.sink.s(Integer.MAX_VALUE & promisedStreamId);
        this.sink.write(this.hpackBuffer, length);
        if (byteCount > length) {
            writeContinuationFrames(streamId, byteCount - ((long) length));
        }
    }

    public final synchronized void flush() throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        this.sink.flush();
    }

    public final synchronized void rstStream(int streamId, ErrorCode errorCode) throws IOException {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(errorCode, "errorCode");
        if (this.closed) {
            throw new IOException("closed");
        }
        if (!(errorCode.getHttpCode() != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        frameHeader(streamId, 4, 3, 0);
        this.sink.s(errorCode.getHttpCode());
        this.sink.flush();
    }

    public final int maxDataLength() {
        return this.maxFrameSize;
    }

    public final synchronized void data(boolean outFinished, int streamId, s2 source, int byteCount) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        int flags = outFinished ? 0 | 1 : 0;
        dataFrame(streamId, flags, source, byteCount);
    }

    public final void dataFrame(int streamId, int flags, s2 buffer, int byteCount) throws IOException {
        frameHeader(streamId, byteCount, 0, flags);
        if (byteCount > 0) {
            u2 u2Var = this.sink;
            jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(buffer);
            u2Var.write(buffer, byteCount);
        }
    }

    public final synchronized void settings(Settings settings) throws IOException {
        int id;
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(settings, "settings");
        if (this.closed) {
            throw new IOException("closed");
        }
        frameHeader(0, settings.size() * 6, 4, 0);
        for (int i = 0; i < 10; i++) {
            if (settings.isSet(i)) {
                switch (i) {
                    case 4:
                        id = 3;
                        break;
                    case 7:
                        id = 4;
                        break;
                    default:
                        id = i;
                        break;
                }
                this.sink.n(id);
                this.sink.s(settings.get(i));
            }
        }
        this.sink.flush();
    }

    public final synchronized void ping(boolean ack, int payload1, int payload2) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        frameHeader(0, 8, 6, ack ? 1 : 0);
        this.sink.s(payload1);
        this.sink.s(payload2);
        this.sink.flush();
    }

    public final synchronized void goAway(int lastGoodStreamId, ErrorCode errorCode, byte[] debugData) throws IOException {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(errorCode, "errorCode");
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(debugData, "debugData");
        if (this.closed) {
            throw new IOException("closed");
        }
        if (!(errorCode.getHttpCode() != -1)) {
            throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
        }
        frameHeader(0, debugData.length + 8, 7, 0);
        this.sink.s(lastGoodStreamId);
        this.sink.s(errorCode.getHttpCode());
        if (!(debugData.length == 0)) {
            this.sink.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(debugData);
        }
        this.sink.flush();
    }

    public final synchronized void windowUpdate(int streamId, long windowSizeIncrement) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        if (!(windowSizeIncrement != 0 && windowSizeIncrement <= 2147483647L)) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + windowSizeIncrement).toString());
        }
        frameHeader(streamId, 4, 8, 0);
        this.sink.s((int) windowSizeIncrement);
        this.sink.flush();
    }

    public final void frameHeader(int streamId, int length, int type, int flags) throws IOException {
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Http2.INSTANCE.frameLog(false, streamId, length, type, flags));
        }
        if (!(length <= this.maxFrameSize)) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.maxFrameSize + ": " + length).toString());
        }
        if (!((((int) 2147483648L) & streamId) == 0)) {
            throw new IllegalArgumentException(("reserved bit set: " + streamId).toString());
        }
        Util.writeMedium(this.sink, length);
        this.sink.F(type & 255);
        this.sink.F(flags & 255);
        this.sink.s(Integer.MAX_VALUE & streamId);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.closed = true;
        this.sink.close();
    }

    private final void writeContinuationFrames(int streamId, long byteCount) throws IOException {
        long byteCount2 = byteCount;
        while (byteCount2 > 0) {
            long length = Math.min(this.maxFrameSize, byteCount2);
            byteCount2 -= length;
            frameHeader(streamId, (int) length, 9, byteCount2 == 0 ? 4 : 0);
            this.sink.write(this.hpackBuffer, length);
        }
    }

    public final synchronized void headers(boolean outFinished, int streamId, List<Header> list) throws IOException {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(list, "headerBlock");
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.writeHeaders(list);
        long byteCount = this.hpackBuffer.b0();
        long length = Math.min(this.maxFrameSize, byteCount);
        int flags = byteCount == length ? 4 : 0;
        if (outFinished) {
            flags |= 1;
        }
        frameHeader(streamId, (int) length, 1, flags);
        this.sink.write(this.hpackBuffer, length);
        if (byteCount > length) {
            writeContinuationFrames(streamId, byteCount - length);
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
