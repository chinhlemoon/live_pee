package okhttp3.internal.http2;

import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.up;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v2;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes.dex */
public final class Http2Reader implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final Logger logger;
    private final boolean client;
    private final ContinuationSource continuation;
    private final Hpack.Reader hpackReader;
    private final v2 source;

    public interface Handler {
        void ackSettings();

        void alternateService(int i, String str, a3 a3Var, String str2, int i2, long j);

        void data(boolean z, int i, v2 v2Var, int i2) throws IOException;

        void goAway(int i, ErrorCode errorCode, a3 a3Var);

        void headers(boolean z, int i, int i2, List<Header> list);

        void ping(boolean z, int i, int i2);

        void priority(int i, int i2, int i3, boolean z);

        void pushPromise(int i, int i2, List<Header> list) throws IOException;

        void rstStream(int i, ErrorCode errorCode);

        void settings(boolean z, Settings settings);

        void windowUpdate(int i, long j);
    }

    public Http2Reader(v2 source, boolean client) {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(source, "source");
        this.source = source;
        this.client = client;
        ContinuationSource continuationSource = new ContinuationSource(source);
        this.continuation = continuationSource;
        this.hpackReader = new Hpack.Reader(continuationSource, 4096, 0, 4, null);
    }

    public final void readConnectionPreface(Handler handler) throws IOException {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(handler, "handler");
        if (this.client) {
            if (!nextFrame(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        v2 v2Var = this.source;
        a3 a3Var = Http2.CONNECTION_PREFACE;
        a3 connectionPreface = v2Var.f(a3Var.k());
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Util.format("<< CONNECTION " + connectionPreface.a(), new Object[0]));
        }
        if (true ^ jd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(a3Var, connectionPreface)) {
            throw new IOException("Expected a connection header but was " + connectionPreface.n());
        }
    }

    public final boolean nextFrame(boolean requireSettings, Handler handler) throws IOException {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(handler, "handler");
        try {
            this.source.z(9L);
            int length = Util.readMedium(this.source);
            if (length > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: " + length);
            }
            int type = Util.and(this.source.L(), 255);
            int flags = Util.and(this.source.L(), 255);
            int streamId = this.source.r() & Integer.MAX_VALUE;
            Logger logger2 = logger;
            if (logger2.isLoggable(Level.FINE)) {
                logger2.fine(Http2.INSTANCE.frameLog(true, streamId, length, type, flags));
            }
            if (requireSettings && type != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + Http2.INSTANCE.formattedType$okhttp(type));
            }
            switch (type) {
                case 0:
                    readData(handler, length, flags, streamId);
                    return true;
                case 1:
                    readHeaders(handler, length, flags, streamId);
                    return true;
                case 2:
                    readPriority(handler, length, flags, streamId);
                    return true;
                case 3:
                    readRstStream(handler, length, flags, streamId);
                    return true;
                case 4:
                    readSettings(handler, length, flags, streamId);
                    return true;
                case 5:
                    readPushPromise(handler, length, flags, streamId);
                    return true;
                case 6:
                    readPing(handler, length, flags, streamId);
                    return true;
                case 7:
                    readGoAway(handler, length, flags, streamId);
                    return true;
                case 8:
                    readWindowUpdate(handler, length, flags, streamId);
                    return true;
                default:
                    this.source.j(length);
                    return true;
            }
        } catch (EOFException e) {
            return false;
        }
    }

    private final void readHeaders(Handler handler, int length, int flags, int streamId) throws IOException {
        if (streamId == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean endStream = (flags & 1) != 0;
        int padding = (flags & 8) != 0 ? Util.and(this.source.L(), 255) : 0;
        int headerBlockLength = length;
        if ((flags & 32) != 0) {
            readPriority(handler, streamId);
            headerBlockLength -= 5;
        }
        handler.headers(endStream, streamId, -1, readHeaderBlock(Companion.lengthWithoutPadding(headerBlockLength, flags, padding), padding, flags, streamId));
    }

    private final List<Header> readHeaderBlock(int length, int padding, int flags, int streamId) throws IOException {
        this.continuation.setLeft(length);
        ContinuationSource continuationSource = this.continuation;
        continuationSource.setLength(continuationSource.getLeft());
        this.continuation.setPadding(padding);
        this.continuation.setFlags(flags);
        this.continuation.setStreamId(streamId);
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }

    private final void readData(Handler handler, int length, int flags, int streamId) throws IOException {
        if (streamId == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean inFinished = (flags & 1) != 0;
        boolean gzipped = (flags & 32) != 0;
        if (gzipped) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int padding = (flags & 8) != 0 ? Util.and(this.source.L(), 255) : 0;
        int dataLength = Companion.lengthWithoutPadding(length, flags, padding);
        handler.data(inFinished, streamId, this.source, dataLength);
        this.source.j(padding);
    }

    private final void readPriority(Handler handler, int length, int flags, int streamId) throws IOException {
        if (length != 5) {
            throw new IOException("TYPE_PRIORITY length: " + length + " != 5");
        }
        if (streamId == 0) {
            throw new IOException("TYPE_PRIORITY streamId == 0");
        }
        readPriority(handler, streamId);
    }

    private final void readPriority(Handler handler, int streamId) throws IOException {
        int w1 = this.source.r();
        boolean exclusive = (w1 & ((int) 2147483648L)) != 0;
        int streamDependency = Integer.MAX_VALUE & w1;
        int weight = Util.and(this.source.L(), 255) + 1;
        handler.priority(streamId, streamDependency, weight, exclusive);
    }

    private final void readRstStream(Handler handler, int length, int flags, int streamId) throws IOException {
        if (length != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + length + " != 4");
        }
        if (streamId == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int errorCodeInt = this.source.r();
        ErrorCode errorCode = ErrorCode.Companion.fromHttp2(errorCodeInt);
        if (errorCode == null) {
            throw new IOException("TYPE_RST_STREAM unexpected error code: " + errorCodeInt);
        }
        handler.rstStream(streamId, errorCode);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:42:0x0095 A[LOOP:0: B:17:0x003a->B:42:0x0095, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x0099 A[SYNTHETIC] */
    private final void readSettings(Handler handler, int length, int flags, int streamId) throws IOException {
        if (streamId != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((flags & 1) != 0) {
            if (length != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            handler.ackSettings();
            return;
        }
        if (length % 6 != 0) {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + length);
        }
        Settings settings = new Settings();
        fd fdVarXadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = tl.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(tl.a(0, length), 6);
        int i = fdVarXadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        int iXadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = fdVarXadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        int iXadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = fdVarXadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        if (iXadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa < 0 ? i >= iXadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa : i <= iXadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) {
            while (true) {
                int id = Util.and(this.source.l(), Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                int value = this.source.r();
                switch (id) {
                    case 1:
                    case 6:
                    default:
                        settings.set(id, value);
                        if (i != iXadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) {
                            i += iXadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
                        }
                        break;
                    case 2:
                        if (value != 0 && value != 1) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                        }
                        settings.set(id, value);
                        if (i != iXadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) {
                            i += iXadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
                        }
                        break;
                    case 3:
                        id = 4;
                        settings.set(id, value);
                        if (i != iXadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) {
                            i += iXadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
                        }
                        break;
                    case 4:
                        id = 7;
                        if (value < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        settings.set(id, value);
                        if (i != iXadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) {
                            i += iXadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
                        }
                        break;
                    case 5:
                        if (value < 16384 || value > 16777215) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + value);
                        }
                        settings.set(id, value);
                        if (i != iXadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) {
                            i += iXadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
                        }
                        break;
                }
            }
        }
        handler.settings(false, settings);
    }

    private final void readPushPromise(Handler handler, int length, int flags, int streamId) throws IOException {
        if (streamId == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int padding = (flags & 8) != 0 ? Util.and(this.source.L(), 255) : 0;
        int promisedStreamId = this.source.r() & Integer.MAX_VALUE;
        int headerBlockLength = Companion.lengthWithoutPadding(length - 4, flags, padding);
        handler.pushPromise(streamId, promisedStreamId, readHeaderBlock(headerBlockLength, padding, flags, streamId));
    }

    private final void readPing(Handler handler, int length, int flags, int streamId) throws IOException {
        if (length != 8) {
            throw new IOException("TYPE_PING length != 8: " + length);
        }
        if (streamId != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        int payload1 = this.source.r();
        int payload2 = this.source.r();
        boolean ack = (flags & 1) != 0;
        handler.ping(ack, payload1, payload2);
    }

    private final void readGoAway(Handler handler, int length, int flags, int streamId) throws IOException {
        if (length < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + length);
        }
        if (streamId != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int lastStreamId = this.source.r();
        int errorCodeInt = this.source.r();
        int opaqueDataLength = length - 8;
        ErrorCode errorCode = ErrorCode.Companion.fromHttp2(errorCodeInt);
        if (errorCode == null) {
            throw new IOException("TYPE_GOAWAY unexpected error code: " + errorCodeInt);
        }
        a3 debugData = a3.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        if (opaqueDataLength > 0) {
            debugData = this.source.f(opaqueDataLength);
        }
        handler.goAway(lastStreamId, errorCode, debugData);
    }

    private final void readWindowUpdate(Handler handler, int length, int flags, int streamId) throws IOException {
        if (length != 4) {
            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + length);
        }
        long increment = Util.and(this.source.r(), 2147483647L);
        if (increment == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        handler.windowUpdate(streamId, increment);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.source.close();
    }

    public static final class ContinuationSource implements un {
        private int flags;
        private int left;
        private int length;
        private int padding;
        private final v2 source;
        private int streamId;

        public ContinuationSource(v2 source) {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(source, "source");
            this.source = source;
        }

        public final int getLength() {
            return this.length;
        }

        public final void setLength(int i) {
            this.length = i;
        }

        public final int getFlags() {
            return this.flags;
        }

        public final void setFlags(int i) {
            this.flags = i;
        }

        public final int getStreamId() {
            return this.streamId;
        }

        public final void setStreamId(int i) {
            this.streamId = i;
        }

        public final int getLeft() {
            return this.left;
        }

        public final void setLeft(int i) {
            this.left = i;
        }

        public final int getPadding() {
            return this.padding;
        }

        public final void setPadding(int i) {
            this.padding = i;
        }

        @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un
        public long read(s2 sink, long byteCount) throws IOException {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(sink, "sink");
            while (true) {
                int i = this.left;
                if (i == 0) {
                    this.source.j(this.padding);
                    this.padding = 0;
                    if ((this.flags & 4) != 0) {
                        return -1L;
                    }
                    readContinuationHeader();
                } else {
                    long read = this.source.read(sink, Math.min(byteCount, i));
                    if (read == -1) {
                        return -1L;
                    }
                    this.left -= (int) read;
                    return read;
                }
            }
        }

        @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un
        public up timeout() {
            return this.source.timeout();
        }

        @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        private final void readContinuationHeader() throws IOException {
            int previousStreamId = this.streamId;
            int medium = Util.readMedium(this.source);
            this.left = medium;
            this.length = medium;
            int type = Util.and(this.source.L(), 255);
            this.flags = Util.and(this.source.L(), 255);
            Companion companion = Http2Reader.Companion;
            if (companion.getLogger().isLoggable(Level.FINE)) {
                companion.getLogger().fine(Http2.INSTANCE.frameLog(true, this.streamId, this.length, type, this.flags));
            }
            int iR = this.source.r() & Integer.MAX_VALUE;
            this.streamId = iR;
            if (type != 9) {
                throw new IOException(type + " != TYPE_CONTINUATION");
            }
            if (iR != previousStreamId) {
                throw new IOException("TYPE_CONTINUATION streamId changed");
            }
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(t6 $constructor_marker) {
            this();
        }

        public final Logger getLogger() {
            return Http2Reader.logger;
        }

        public final int lengthWithoutPadding(int length, int flags, int padding) throws IOException {
            int result = length;
            if ((flags & 8) != 0) {
                result--;
            }
            if (padding > result) {
                throw new IOException("PROTOCOL_ERROR padding " + padding + " > remaining length " + result);
            }
            return result - padding;
        }
    }

    static {
        Logger logger2 = Logger.getLogger(Http2.class.getName());
        jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(logger2, "Logger.getLogger(Http2::class.java.name)");
        logger = logger2;
    }
}
