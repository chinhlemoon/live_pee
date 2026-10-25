package okhttp3.internal.http2;

import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lo;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes.dex */
public final class Http2 {
    private static final String[] BINARY;
    public static final int FLAG_ACK = 1;
    public static final int FLAG_COMPRESSED = 32;
    public static final int FLAG_END_HEADERS = 4;
    public static final int FLAG_END_PUSH_PROMISE = 4;
    public static final int FLAG_END_STREAM = 1;
    public static final int FLAG_NONE = 0;
    public static final int FLAG_PADDED = 8;
    public static final int FLAG_PRIORITY = 32;
    public static final int INITIAL_MAX_FRAME_SIZE = 16384;
    public static final int TYPE_CONTINUATION = 9;
    public static final int TYPE_DATA = 0;
    public static final int TYPE_GOAWAY = 7;
    public static final int TYPE_HEADERS = 1;
    public static final int TYPE_PING = 6;
    public static final int TYPE_PRIORITY = 2;
    public static final int TYPE_PUSH_PROMISE = 5;
    public static final int TYPE_RST_STREAM = 3;
    public static final int TYPE_SETTINGS = 4;
    public static final int TYPE_WINDOW_UPDATE = 8;
    public static final Http2 INSTANCE = new Http2();
    public static final a3 CONNECTION_PREFACE = a3.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    private static final String[] FRAME_NAMES = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    private static final String[] FLAGS = new String[64];

    static {
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            int it = i;
            String binaryString = Integer.toBinaryString(it);
            jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(binaryString, "Integer.toBinaryString(it)");
            strArr[i] = lo.l(Util.format("%8s", binaryString), ' ', '0', false, 4);
        }
        BINARY = strArr;
        String[] strArr2 = FLAGS;
        strArr2[0] = HttpUrl.FRAGMENT_ENCODE_SET;
        strArr2[1] = "END_STREAM";
        int[] prefixFlags = {1};
        strArr2[8] = "PADDED";
        for (int prefixFlag : prefixFlags) {
            String[] strArr3 = FLAGS;
            strArr3[prefixFlag | 8] = jd.e(strArr3[prefixFlag], "|PADDED");
        }
        String[] strArr4 = FLAGS;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] frameFlags = {4, 32, 36};
        for (int frameFlag : frameFlags) {
            for (int prefixFlag2 : prefixFlags) {
                String[] strArr5 = FLAGS;
                strArr5[prefixFlag2 | frameFlag] = strArr5[prefixFlag2] + "|" + strArr5[frameFlag];
                strArr5[prefixFlag2 | frameFlag | 8] = strArr5[prefixFlag2] + "|" + strArr5[frameFlag] + "|PADDED";
            }
        }
        int length = FLAGS.length;
        for (int i2 = 0; i2 < length; i2++) {
            String[] strArr6 = FLAGS;
            if (strArr6[i2] == null) {
                strArr6[i2] = BINARY[i2];
            }
        }
    }

    private Http2() {
    }

    public final String frameLog(boolean inbound, int streamId, int length, int type, int flags) {
        String formattedType = formattedType$okhttp(type);
        String formattedFlags = formatFlags(type, flags);
        String direction = inbound ? "<<" : ">>";
        return Util.format("%s 0x%08x %5d %-13s %s", direction, Integer.valueOf(streamId), Integer.valueOf(length), formattedType, formattedFlags);
    }

    public final String formattedType$okhttp(int type) {
        String[] strArr = FRAME_NAMES;
        return type < strArr.length ? strArr[type] : Util.format("0x%02x", Integer.valueOf(type));
    }

    public final String formatFlags(int type, int flags) {
        String result;
        if (flags == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        switch (type) {
            case 2:
            case 3:
            case 7:
            case 8:
                return BINARY[flags];
            case 4:
            case 6:
                return flags == 1 ? "ACK" : BINARY[flags];
            case 5:
            default:
                String[] strArr = FLAGS;
                if (flags < strArr.length) {
                    result = strArr[flags];
                    jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(result);
                } else {
                    result = BINARY[flags];
                }
                if (type == 5 && (flags & 4) != 0) {
                    return lo.m(result, "HEADERS", "PUSH_PROMISE", false, 4);
                }
                if (type == 0 && (flags & 32) != 0) {
                    return lo.m(result, "PRIORITY", "COMPRESSED", false, 4);
                }
                return result;
        }
    }
}
