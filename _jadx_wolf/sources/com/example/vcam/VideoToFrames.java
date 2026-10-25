package com.example.vcam;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.media.Image;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.support.v4.app.C0004;
import android.support.v4.graphics.drawable.C0009;
import android.support.v4.graphics.drawable.C0010;
import android.support.v4.graphics.drawable.C0011;
import android.view.Surface;
import androidx.activity.C0014;
import androidx.activity.C0018;
import androidx.activity.C0019;
import androidx.activity.C0020;
import androidx.activity.C0022;
import androidx.annotation.C0023;
import androidx.annotation.C0025;
import androidx.annotation.C0026;
import androidx.appcompat.app.C0033;
import androidx.appcompat.app.C0034;
import androidx.appcompat.app.C0036;
import androidx.appcompat.app.C0037;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.view.menu.C0042;
import androidx.appcompat.widget.C0047;
import androidx.cardview.widget.C0049;
import androidx.cardview.widget.C0050;
import androidx.core.app.C0051;
import androidx.core.app.C0052;
import androidx.core.app.C0053;
import androidx.core.app.C0055;
import androidx.core.app.C0056;
import androidx.core.content.C0057;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0063;
import androidx.core.graphics.drawable.C0064;
import androidx.core.widget.C0068;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0071;
import androidx.drawerlayout.widget.C0072;
import androidx.emoji2.text.C0084;
import androidx.emoji2.text.C0086;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0096;
import androidx.fragment.app.C0097;
import androidx.fragment.app.C0099;
import androidx.lifecycle.C0105;
import androidx.lifecycle.C0108;
import androidx.lifecycle.C0109;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0118;
import androidx.profileinstaller.C0119;
import androidx.savedstate.C0123;
import androidx.savedstate.C0124;
import androidx.savedstate.C0125;
import androidx.savedstate.C0126;
import androidx.savedstate.C0127;
import androidx.versionedparcelable.C0129;
import androidx.versionedparcelable.C0132;
import de.robv.android.xposed.XposedBridge;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ek;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.C0155;
import okhttp3.C0238;
import okhttp3.C0239;
import okhttp3.C0240;
import okhttp3.internal.authenticator.C0160;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0166;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache.C0170;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache2.C0174;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.cache2.C0177;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.concurrent.C0180;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http2.C0190;
import okhttp3.internal.io.C0195;
import okhttp3.internal.io.C0196;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.proxy.C0207;
import okhttp3.internal.proxy.C0210;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.tls.C0222;
import okhttp3.internal.ws.C0225;
import okhttp3.internal.ws.WebSocketProtocol;
import okhttp3.logging.C0230;
import okhttp3.logging.C0231;
import okhttp3.logging.C0232;
import okhttp3.logging.C0233;
import okhttp3.logging.C0235;
import okhttp3.logging.C0236;
import retrofit2.C0259;
import retrofit2.converter.scalars.C0244;
import retrofit2.http.C0246;
import retrofit2.http.C0247;
import retrofit2.http.C0250;
import retrofit2.http.C0251;

/* JADX INFO: loaded from: classes.dex */
public class VideoToFrames implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f178short = {1955, 1959, 1955, 1963, 2052, 2075, 2070, 2071, 2077, 2141, 2499, 2498, 2496, 2517, 2444, 2527, 2521, 2524, 2524, 2499, 2526, 2520, 2444, 2543, 2531, 2528, 2531, 2558, 2547, 2538, 2499, 2526, 2497, 2509, 2520, 2533, 2456, 2462, 2460, 2444, 2509, 2498, 2504, 2444, 2543, 2531, 2528, 2531, 2558, 2547, 2538, 2499, 2526, 2497, 2509, 2520, 2530, 2554, 2462, 2461, 3083, 3081, 3078, 3151, 3100, 3144, 3083, 3079, 3078, 3102, 3085, 3098, 3100, 3144, 3105, 3077, 3081, 3087, 3085, 3144, 3100, 3079, 3144, 3082, 3089, 3100, 3085, 3144, 3081, 3098, 3098, 3081, 3089, 3140, 3144, 3086, 3079, 3098, 3077, 3081, 3100, 3144, 2198, 2199, 2193, 2205, 2198, 2199, 13863, 1636, 1652, 1654, 1658, 1650, 1637, 1654, 13862, 13863, 1619, 1618, 1620, 1624, 1619, 1618, 1605, 13862, 22839, 24572, -28716, 32310, 13610, 1385, 1401, 1403, 1399, 1407, 1384, 1403, 13611, 13610, 1374, 1375, 1369, 1365, 1374, 1375, 1352, 13611, 1396, 1365, 1306, 1356, 1363, 1374, 1375, 1365, 1306, 1358, 1352, 1371, 1369, 1361, 1306, 1372, 1365, 1359, 1364, 1374, 1306, 1363, 1364, 1306, 1978, 1982, 1978, 1970, 665, 661, 662, 661, 648, 727, 668, 661, 648, 663, 667, 654, 15101, 2750, 2734, 2732, 2720, 2728, 2751, 2732, 15100, 15101, 2697, 2696, 2702, 2690, 2697, 2696, 2719, 15100, 2718, 2696, 2713, 2765, 2697, 2696, 2702, 2690, 2697, 2696, 2765, 2702, 2690, 2689, 2690, 2719, 2765, 2699, 2690, 2719, 2688, 2700, 2713, 2765, 2713, 2690, 2765, 2713, 2708, 2717, 2696, 2765, 2783, 2780, 2782, 2776, 2781, 2782, 2782, 2772, 2772, 2783, 2874, 2821, 2824, 2825, 2819, 2872, 2819, 2858, 2846, 2829, 2817, 2825, 2847, 3103, 3076, 3083, 3080, 3078, 3087, 3146, 3102, 3077, 3146, 3097, 3087, 3102, 3146, 3086, 3087, 3081, 3077, 3086, 3087, 3146, 3081, 3077, 3078, 3077, 3096, 3146, 3084, 3077, 3096, 3079, 3083, 3102, 3142, 3146, 3081, 3077, 3078, 3077, 3096, 3146, 3084, 3077, 3096, 3079, 3083, 3102, 3146, 3102, 3091, 3098, 3087, 3146, 3160, 3163, 3161, 3167, 3162, 3161, 3161, 3155, 3155, 3160, 3146, 3076, 3077, 3102, 3146, 3097, 3103, 3098, 3098, 3077, 3096, 3102, 3087, 3086, 15103, 2748, 2732, 2734, 2722, 2730, 2749, 2734, 15102, 15103, 2699, 2698, 2700, 2688, 2699, 2698, 2717, 15102, 2714, 2689, 2702, 2701, 2691, 2698, 2767, 2715, 2688, 2767, 2716, 2698, 2715, 2767, 2699, 2698, 2700, 2688, 2699, 2698, 2767, 2700, 2688, 2691, 2688, 2717, 2767, 2697, 2688, 2717, 2690, 2702, 2715, 2755, 2767, 2700, 2688, 2691, 2688, 2717, 2767, 2697, 2688, 2717, 2690, 2702, 2715, 2767, 2715, 2710, 2719, 2698, 2767, 2781, 2782, 2780, 2778, 2783, 2780, 2780, 2774, 2774, 2781, 2767, 2689, 2688, 2715, 2767, 2716, 2714, 2719, 2719, 2688, 2717, 2715, 2698, 2699, 13649, 1298, 1282, 1280, 1292, 1284, 1299, 1280, 13648, 1306, 1335, 1320, 1317, 1316, 1326, 1319, 1320, 1325, 1316, 1308, 2405, 2427, 2422, 2406, 2426, 397, 384, 396, 386, 397, 401, 13034, 681, 697, 699, 695, 703, 680, 699, 13035, 13794, 1441, 1457, 1459, 1471, 1463, 1440, 1459, 13795, 31565, 32761, 23300, -30163, 21512, -28437, 1411, 1413, 1408, 1408, 1439, 1410, 1412, 1429, 1428, 1488, 1427, 1439, 1436, 1439, 1410, 1488, 1430, 1439, 1410, 1437, 1425, 1412, 1482, 1488, 2889};
    public Thread a;
    public Surface b;
    public Callback c;
    public ek xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
    public LinkedBlockingQueue<byte[]> xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
    public boolean xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = false;
    public String xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
    public Throwable xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;

    public interface Callback {
        void onDecodeFrame(int i);

        void onFinishDecode();
    }

    public static int xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(MediaExtractor mediaExtractor) {
        int iM9707 = C0238.m9707(mediaExtractor);
        int i = 0;
        while (true) {
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        break;
                    case 49:
                        i2 = i < iM9707 ? 1709 : 1678;
                        break;
                    case 204:
                        break;
                    case 239:
                        return C0247.f697 ^ (-288);
                    default:
                        break;
                }
            }
            boolean zM3401 = C0094.m3401(C0014.m524(C0047.m1674(mediaExtractor, i), C0093.m3362(m5712(), 0, C0166.f616 ^ 462, 1998)), C0040.m1586(m5712(), 4, C0190.f640 ^ (-25), 2162));
            int i3 = 1740;
            while (true) {
                i3 ^= 1757;
                switch (i3) {
                    case 17:
                        i3 = zM3401 ? 1833 : 1802;
                        break;
                    case 54:
                        break;
                    case 471:
                        break;
                    case 500:
                        return i;
                    default:
                        break;
                }
            }
            i += C0180.f630 ^ (-761);
            int i4 = 1864;
            while (true) {
                i4 ^= 1881;
                switch (i4) {
                    case 17:
                        i4 = 48674;
                        break;
                    case 47483:
                        break;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:308:0x026e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:309:0x0274 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:310:0x0278 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x0274 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:0x0270 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:0x0265 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x0294 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:0x028b A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:104:0x0191. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:113:0x01b2. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:120:0x01df. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:144:0x022c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:158:0x026a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:165:0x0290. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x0099. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:43:0x00b1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:62:0x0103. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:76:0x0130. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:90:0x015d. Please report as an issue. */
    public static byte[] xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(Image image, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case 14:
                    break;
                case 49:
                    i11 = i != 1 ? 1709 : 1678;
                    break;
                case 204:
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case 17:
                                i12 = i == 2 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                throw new IllegalArgumentException(C0162.m6834(m5712(), 10, C0033.f31 ^ (-376), 2476));
                            case 500:
                                int i13 = 1864;
                                while (true) {
                                    i13 ^= 1881;
                                    switch (i13) {
                                        case 17:
                                            i13 = 48674;
                                            continue;
                                        case 47483:
                                            break;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 239:
                    break;
                default:
                    break;
            }
        }
        boolean zM8373 = C0211.m8373(image);
        int i14 = 48767;
        while (true) {
            i14 ^= 48784;
            switch (i14) {
                case 14:
                    break;
                case 45:
                    StringBuilder sb = new StringBuilder();
                    C0235.m9501(sb, C0049.m1751(m5712(), 60, C0177.f627 ^ 142, 3176));
                    C0126.m4911(sb, C0233.m9381(image));
                    throw new RuntimeException(C0009.m261(sb));
                case 76:
                    Rect rectM8523 = C0214.m8523(image);
                    int iM9381 = C0233.m9381(image);
                    int iM6812 = C0162.m6812(rectM8523);
                    int iM6423 = C0148.m6423(rectM8523);
                    Image.Plane[] planeArrM9875 = C0240.m9875(image);
                    byte[] bArr = new byte[(C0217.m8663(iM9381) * (iM6812 * iM6423)) / (C0125.f104 ^ (-503))];
                    byte[] bArr2 = new byte[C0195.m7904(planeArrM9875[0])];
                    int i15 = 1;
                    int i16 = 0;
                    int i17 = 0;
                    while (true) {
                        int length = planeArrM9875.length;
                        int i18 = 48891;
                        while (true) {
                            i18 ^= 48908;
                            switch (i18) {
                                case 22:
                                    break;
                                case 53:
                                    break;
                                case 503:
                                    i18 = i16 < length ? 49635 : 48953;
                                    break;
                                case 32495:
                                    break;
                                default:
                                    break;
                            }
                            return bArr;
                        }
                        switch (i16) {
                            case 0:
                                i2 = 1;
                                i3 = 0;
                                break;
                            case 1:
                                int i19 = 51588;
                                while (true) {
                                    i19 ^= 51605;
                                    switch (i19) {
                                        case 17:
                                            i19 = i == 1 ? 51681 : 51650;
                                            break;
                                        case 54:
                                            break;
                                        case 87:
                                            int i20 = 51836;
                                            while (true) {
                                                i20 ^= 51853;
                                                switch (i20) {
                                                    case 241:
                                                        i20 = i == 2 ? 52580 : 52549;
                                                        break;
                                                    case 1963:
                                                        break;
                                                    case 1992:
                                                        i2 = i15;
                                                        i3 = i17;
                                                        break;
                                                    case 2025:
                                                        int i21 = (iM6812 * iM6423) + (C0063.f57 ^ (-659));
                                                        int i22 = 52611;
                                                        while (true) {
                                                            i22 ^= 52628;
                                                            switch (i22) {
                                                                case 23:
                                                                    i22 = 52642;
                                                                    break;
                                                                case 54:
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                            i2 = 2;
                                                            i3 = i21;
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            break;
                                        case 116:
                                            int i23 = iM6812 * iM6423;
                                            int i24 = 51712;
                                            while (true) {
                                                i24 ^= 51729;
                                                switch (i24) {
                                                    case 14:
                                                        break;
                                                    case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                                                    case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                                                    default:
                                                        break;
                                                    case 17:
                                                        i24 = 51743;
                                                        break;
                                                }
                                                i2 = 1;
                                                i3 = i23;
                                                break;
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 2:
                                int i25 = 49790;
                                while (true) {
                                    i25 ^= 49807;
                                    switch (i25) {
                                        case 18:
                                            break;
                                        case 51:
                                            int i26 = 50689;
                                            while (true) {
                                                i26 ^= 50706;
                                                switch (i26) {
                                                    case 19:
                                                        i26 = i == 2 ? 50782 : 50751;
                                                        break;
                                                    case 45:
                                                        i2 = i15;
                                                        i3 = i17;
                                                        break;
                                                    case 50:
                                                        break;
                                                    case 76:
                                                        int i27 = iM6812 * iM6423;
                                                        int i28 = 50813;
                                                        while (true) {
                                                            i28 ^= 50830;
                                                            switch (i28) {
                                                                case 18:
                                                                    break;
                                                                case 243:
                                                                    i28 = 50844;
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                            i2 = 2;
                                                            i3 = i27;
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            break;
                                        case 84:
                                            int i29 = (int) (((double) (iM6812 * iM6423)) * 1.25d);
                                            int i30 = 49914;
                                            while (true) {
                                                i30 ^= 49931;
                                                switch (i30) {
                                                    case 497:
                                                        i30 = 50596;
                                                        break;
                                                    case 1711:
                                                        break;
                                                    default:
                                                        break;
                                                }
                                                i2 = 1;
                                                i3 = i29;
                                                break;
                                            }
                                            break;
                                        case 241:
                                            i25 = i == 1 ? 49883 : 49852;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            default:
                                int i31 = 49666;
                                while (true) {
                                    i31 ^= 49683;
                                    switch (i31) {
                                        case 17:
                                            i31 = 49697;
                                            break;
                                        case 50:
                                            break;
                                        default:
                                            break;
                                    }
                                    i2 = i15;
                                    i3 = i17;
                                    break;
                                }
                                break;
                        }
                        ByteBuffer byteBufferM7244 = C0176.m7244(planeArrM9875[i16]);
                        int iM7904 = C0195.m7904(planeArrM9875[i16]);
                        int iM1399 = C0037.m1399(planeArrM9875[i16]);
                        int i32 = 52735;
                        while (true) {
                            i32 ^= 52752;
                            switch (i32) {
                                case 14:
                                    break;
                                case 45:
                                    i4 = 1;
                                    break;
                                case 1007:
                                    i32 = i16 == 0 ? 53479 : 52797;
                                    break;
                                case 7927:
                                    i4 = 0;
                                    int i33 = 53510;
                                    while (true) {
                                        i33 ^= 53527;
                                        switch (i33) {
                                            case 17:
                                                i33 = 53541;
                                                break;
                                            case 50:
                                                break;
                                            default:
                                                break;
                                        }
                                        break;
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                        int i34 = iM6812 >> i4;
                        int i35 = iM6423 >> i4;
                        C0096.m3554(byteBufferM7244, ((C0108.m4006(rectM8523) >> i4) * iM1399) - (0 - ((C0113.m4147(rectM8523) >> i4) * iM7904)));
                        int i36 = 0;
                        while (true) {
                            int i37 = 53634;
                            while (true) {
                                i37 ^= 53651;
                                switch (i37) {
                                    case 17:
                                        i37 = i36 < i35 ? 53727 : 53696;
                                        break;
                                    case 50:
                                        break;
                                    case 76:
                                        int i38 = 53758;
                                        while (true) {
                                            i38 ^= 53775;
                                            switch (i38) {
                                                case 1009:
                                                    i38 = iM1399 == 1 ? 54502 : 54471;
                                                    break;
                                                case 1703:
                                                    break;
                                                case 1736:
                                                    i5 = (((C0022.f21 ^ 583) + i34) * iM1399) + (C0251.f701 ^ (-144));
                                                    C0010.m401(byteBufferM7244, bArr2, 0, i5);
                                                    i6 = 0;
                                                    i7 = i3;
                                                    while (true) {
                                                        i8 = 55432;
                                                        while (true) {
                                                            i8 ^= 55449;
                                                            switch (i8) {
                                                                case 17:
                                                                    i8 = i6 < i34 ? 55525 : 55494;
                                                                    break;
                                                                case 62:
                                                                    break;
                                                                case 95:
                                                                    break;
                                                                case 124:
                                                                    bArr[i7] = bArr2[i6 * iM1399];
                                                                    i7 = ((i7 + 4) + i2) - 4;
                                                                    int i39 = (C0132.f111 ^ (-943)) + i6;
                                                                    i9 = 55556;
                                                                    while (true) {
                                                                        i9 ^= 55573;
                                                                        switch (i9) {
                                                                            case 17:
                                                                                i9 = 55587;
                                                                                break;
                                                                            case 54:
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    i6 = i39;
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                            i10 = i5;
                                                            i3 = i7;
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                case 1769:
                                                    int i40 = 54533;
                                                    while (true) {
                                                        i40 ^= 54550;
                                                        switch (i40) {
                                                            case 19:
                                                                i40 = i2 == 1 ? 54626 : 54595;
                                                                break;
                                                            case 50:
                                                                break;
                                                            case 85:
                                                                i5 = (((C0022.f21 ^ 583) + i34) * iM1399) + (C0251.f701 ^ (-144));
                                                                C0010.m401(byteBufferM7244, bArr2, 0, i5);
                                                                i6 = 0;
                                                                i7 = i3;
                                                                while (true) {
                                                                    i8 = 55432;
                                                                    while (true) {
                                                                        i8 ^= 55449;
                                                                        switch (i8) {
                                                                            case 17:
                                                                                if (i6 < i34) {
                                                                                }
                                                                                break;
                                                                            case 62:
                                                                                break;
                                                                            case 95:
                                                                                break;
                                                                            case 124:
                                                                                bArr[i7] = bArr2[i6 * iM1399];
                                                                                i7 = ((i7 + 4) + i2) - 4;
                                                                                int i310 = (C0132.f111 ^ (-943)) + i6;
                                                                                i9 = 55556;
                                                                                while (true) {
                                                                                    i9 ^= 55573;
                                                                                    switch (i9) {
                                                                                        case 17:
                                                                                            i9 = 55587;
                                                                                            break;
                                                                                        case 54:
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                i6 = i310;
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                        i10 = i5;
                                                                        i3 = i7;
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                            case 116:
                                                                C0010.m401(byteBufferM7244, bArr, i3, i34);
                                                                i3 -= 0 - i34;
                                                                int i41 = 54657;
                                                                while (true) {
                                                                    i41 ^= 54674;
                                                                    switch (i41) {
                                                                        case 19:
                                                                            i41 = 54688;
                                                                            break;
                                                                        case 50:
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                    i10 = i34;
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    break;
                                            }
                                            int i42 = C0244.f694;
                                            int i43 = 55680;
                                            while (true) {
                                                i43 ^= 55697;
                                                switch (i43) {
                                                    case 17:
                                                        i43 = i36 < (i42 ^ (-409)) + i35 ? 56424 : 56393;
                                                        break;
                                                    case 1467:
                                                        break;
                                                    case 1496:
                                                        break;
                                                    case 1529:
                                                        C0096.m3554(byteBufferM7244, (((((C0178.m7397(byteBufferM7244) - 28) + iM7904) + 28) - 12) - i10) + 12);
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            i36 += C0056.f50 ^ (-83);
                                            int i44 = 56455;
                                            while (true) {
                                                i44 ^= 56472;
                                                switch (i44) {
                                                    case 31:
                                                        i44 = 56486;
                                                        break;
                                                    case 62:
                                                        break;
                                                }
                                            }
                                        }
                                        break;
                                    case 83:
                                        break;
                                    default:
                                        break;
                                }
                                int i45 = i16 + (C0086.f77 ^ (-630));
                                int i46 = 56579;
                                while (true) {
                                    i46 ^= 56596;
                                    switch (i46) {
                                        case 23:
                                            i46 = 56610;
                                            break;
                                        case 54:
                                            break;
                                    }
                                }
                                i15 = i2;
                                i16 = i45;
                                i17 = i3;
                            }
                        }
                    }
                    break;
                case 239:
                    if (zM8373) {
                        i14 = 48860;
                    }
                    break;
                default:
                    continue;
            }
            i14 = 48829;
        }
    }

    public static boolean xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(Image image) {
        switch (C0233.m9381(image)) {
            case 17:
            case 35:
            case 842094169:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: ۟ۧۤۡۤ, reason: not valid java name and contains not printable characters */
    public static void m5711(Object obj) {
        int iM7344 = C0178.m7344();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM7344 <= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    XposedBridge.log((String) obj);
                    return;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۢۥ۟ۢ, reason: not valid java name and contains not printable characters */
    public static short[] m5712() {
        int iM4950 = C0127.m4950();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM4950 > 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return f178short;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    public void decode(String str) throws Throwable {
        this.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = str;
        Thread threadM3215 = C0084.m3215(this);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (threadM3215 == null) {
                        i = 1709;
                    }
                    break;
                case 204:
                    Thread thread = new Thread(this, C0225.m8958(m5712(), 102, C0155.f605 ^ (-396), 2290));
                    this.a = thread;
                    C0096.m3551(thread);
                    Throwable thM3454 = C0094.m3454(this);
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (thM3454 == null) {
                                    i2 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                throw thM3454;
                            case 500:
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            i3 = 48674;
                                            break;
                                        case 47483:
                                            return;
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i2 = 1802;
                    }
                    break;
                case 239:
                    return;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            C0052.m1854(this, C0148.m6445(this));
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        return;
                    case 49:
                        i = 1647;
                        break;
                }
            }
        } catch (Throwable th) {
            this.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = th;
        }
    }

    public void setCallback(Callback callback) {
        this.c = callback;
    }

    public void setEnqueue(LinkedBlockingQueue<byte[]> linkedBlockingQueue) {
        this.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = linkedBlockingQueue;
    }

    public void setSaveFrames(String str, ek ekVar) throws IOException {
        this.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = ekVar;
    }

    public void set_surfcae(Surface surface) {
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (surface != null) {
                        i = 1709;
                    }
                    break;
                case 204:
                    this.b = surface;
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    public void stopDecode() {
        this.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    @SuppressLint({"WrongConstant"})
    public void videoDecode(String str) throws IOException {
        Throwable th;
        ?? r2;
        Object obj;
        MediaCodec mediaCodecM2627;
        MediaExtractor mediaExtractor;
        short[] sArrM5712 = m5712();
        int i = C0244.f694 ^ 398;
        String strM2101 = C0057.m2101(sArrM5712, 108, i, 1591);
        m5711(strM2101);
        try {
            try {
                new File(str);
                mediaExtractor = new MediaExtractor();
                try {
                    C0113.m4171(mediaExtractor, str);
                    int iM7394 = C0178.m7394(mediaExtractor);
                    int i2 = 1616;
                    while (true) {
                        i2 ^= 1633;
                        switch (i2) {
                            case 14:
                                break;
                            case 49:
                                i2 = iM7394 < 0 ? 1709 : 1678;
                                break;
                            case 204:
                                StringBuilder sb = new StringBuilder();
                                C0235.m9501(sb, C0178.m7355(m5712(), 130, C0018.f17 ^ (-122), 1338));
                                C0235.m9501(sb, str);
                                m5711(C0009.m261(sb));
                                break;
                            case 239:
                                break;
                            default:
                                break;
                        }
                    }
                    C0176.m7271(mediaExtractor, iM7394);
                    MediaFormat mediaFormatM1674 = C0047.m1674(mediaExtractor, iM7394);
                    String strM524 = C0014.m524(mediaFormatM1674, C0034.m1230(m5712(), 172, C0109.f91 ^ (-704), 2007));
                    mediaCodecM2627 = C0068.m2627(strM524);
                    try {
                        C0149.m6550(this, C0097.m3654(C0235.m9499(mediaCodecM2627), strM524));
                        MediaCodecInfo.CodecCapabilities codecCapabilitiesM3654 = C0097.m3654(C0235.m9499(mediaCodecM2627), strM524);
                        int i3 = 2135034674 ^ C0160.f610;
                        boolean zM9115 = C0230.m9115(this, i3, codecCapabilitiesM3654);
                        int i4 = 1740;
                        while (true) {
                            i4 ^= 1757;
                            switch (i4) {
                                case 17:
                                    i4 = zM9115 ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    C0188.m7729(m5712(), 248, C0019.f18 ^ (-694), 2924);
                                    C0188.m7729(m5712(), 261, C0190.f640 ^ (-84), 3178);
                                    m5711(C0049.m1751(m5712(), 338, C0140.f186 ^ 300, 2799));
                                    break;
                                case 500:
                                    C0026.m994(mediaFormatM1674, C0231.m9202(m5712(), 176, C0050.f44 ^ 581, 762), i3);
                                    m5711(C0176.m7259(m5712(), 188, C0174.f624 ^ (-375), 2797));
                                    int i5 = 1864;
                                    while (true) {
                                        i5 ^= 1881;
                                        switch (i5) {
                                            case 17:
                                                i5 = 48674;
                                                continue;
                                            case 47483:
                                                break;
                                            default:
                                                continue;
                                        }
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                        C0123.m4806(this, mediaCodecM2627, mediaExtractor, mediaFormatM1674);
                        C0115.m4245(mediaCodecM2627);
                        while (true) {
                            boolean zM2396 = C0064.m2396(this);
                            int i6 = 48767;
                            while (true) {
                                i6 ^= 48784;
                                switch (i6) {
                                    case 14:
                                        break;
                                    case 45:
                                        C0115.m4245(mediaCodecM2627);
                                        C0023.m807(mediaCodecM2627);
                                        int i7 = 49666;
                                        while (true) {
                                            i7 ^= 49683;
                                            switch (i7) {
                                                case 17:
                                                    i7 = 49697;
                                                    break;
                                                case 50:
                                                    C0064.m2367(mediaExtractor);
                                                    return;
                                            }
                                        }
                                        break;
                                    case 76:
                                        break;
                                    case 239:
                                        i6 = !zM2396 ? 48860 : 48829;
                                        break;
                                    default:
                                        break;
                                }
                            }
                            C0259.m10147(mediaExtractor, 310 ^ ((long) C0210.f660), 0);
                            C0123.m4806(this, mediaCodecM2627, mediaExtractor, mediaFormatM1674);
                            C0115.m4245(mediaCodecM2627);
                            int i8 = 48891;
                            while (true) {
                                i8 ^= 48908;
                                switch (i8) {
                                    case 22:
                                        break;
                                    case 503:
                                        i8 = 48922;
                                        break;
                                }
                            }
                        }
                    } catch (Exception e) {
                        e = e;
                        StringBuilder sb2 = new StringBuilder();
                        C0235.m9501(sb2, C0036.m1348(m5712(), 433, C0071.f65 ^ (-873), 1345));
                        C0235.m9501(sb2, C0072.m2849(e));
                        m5711(C0009.m261(sb2));
                        int i9 = 49914;
                        while (true) {
                            i9 ^= 49931;
                            switch (i9) {
                                case 497:
                                    i9 = mediaCodecM2627 != null ? 50658 : 50627;
                                    break;
                                case 1711:
                                    break;
                                case 1736:
                                    break;
                                case 1769:
                                    C0115.m4245(mediaCodecM2627);
                                    C0023.m807(mediaCodecM2627);
                                    break;
                                default:
                                    break;
                            }
                        }
                        int i10 = 50689;
                        while (true) {
                            i10 ^= 50706;
                            switch (i10) {
                                case 19:
                                    if (mediaExtractor != null) {
                                        i10 = 50782;
                                    }
                                    break;
                                case 45:
                                    return;
                                case 50:
                                    break;
                                case 76:
                                    break;
                                default:
                                    continue;
                            }
                            i10 = 50751;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    mediaCodecM2627 = null;
                } catch (Throwable th2) {
                    th = th2;
                    r2 = 0;
                    obj = mediaExtractor;
                    int i11 = 49790;
                    while (true) {
                        i11 ^= 49807;
                        switch (i11) {
                            case 18:
                                int i12 = 50813;
                                while (true) {
                                    i12 ^= 50830;
                                    switch (i12) {
                                        case 18:
                                            break;
                                        case 53:
                                            break;
                                        case 243:
                                            if (r2 != 0) {
                                                i12 = 51557;
                                            }
                                            break;
                                        case 4075:
                                            C0115.m4245(r2);
                                            C0023.m807(r2);
                                            break;
                                        default:
                                            continue;
                                    }
                                    i12 = 50875;
                                }
                                int i13 = 51588;
                                while (true) {
                                    i13 ^= 51605;
                                    switch (i13) {
                                        case 17:
                                            if (obj != null) {
                                                i13 = 51681;
                                            }
                                            break;
                                        case 54:
                                            break;
                                        case 87:
                                            throw th;
                                        case 116:
                                            C0064.m2367(obj);
                                            throw th;
                                        default:
                                            continue;
                                    }
                                    i13 = 51650;
                                }
                                break;
                            case 241:
                                i11 = 49821;
                                break;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                obj = strM2101;
                r2 = i;
            }
        } catch (Exception e3) {
            e = e3;
            mediaCodecM2627 = null;
            mediaExtractor = null;
        } catch (Throwable th4) {
            th = th4;
            r2 = 0;
            obj = null;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:109:0x01d3. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:130:0x0245. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:136:0x026b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:149:0x02a0. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:163:0x02e6. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:170:0x0327. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:40:0x00d6. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:52:0x0110. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:58:0x0122. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:81:0x0171. Please report as an issue. */
    public final void xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(MediaCodec mediaCodec, MediaExtractor mediaExtractor, MediaFormat mediaFormat) {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        long jM4167;
        boolean z4;
        boolean z5 = false;
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        C0233.m9369(mediaCodec, mediaFormat, C0099.m3733(this), null, 0);
        C0230.m9106(mediaCodec);
        C0115.m4242(mediaFormat, C0053.m2010(m5712(), 453, C0222.f672 ^ 925, 2322));
        C0115.m4242(mediaFormat, C0195.m7915(m5712(), 458, C0042.f39 ^ 797, 485));
        long j = 0;
        boolean z6 = false;
        int i2 = 0;
        boolean z7 = false;
        while (true) {
            int i3 = 1616;
            while (true) {
                i3 ^= 1633;
                switch (i3) {
                    case 14:
                        break;
                    case 49:
                        i3 = !z6 ? 1709 : 1678;
                        break;
                    case 204:
                        boolean zM2396 = C0064.m2396(this);
                        int i4 = 1740;
                        while (true) {
                            i4 ^= 1757;
                            switch (i4) {
                                case 17:
                                    i4 = !zM2396 ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case 500:
                                    long j2 = (-10185) ^ ((long) C0170.f620);
                                    int i5 = 1864;
                                    while (true) {
                                        i5 ^= 1881;
                                        switch (i5) {
                                            case 17:
                                                i5 = !z7 ? 48736 : 48705;
                                                break;
                                            case 47384:
                                                z = z7;
                                                break;
                                            case 47417:
                                                int iM6991 = C0169.m6991(mediaCodec, j2);
                                                int i6 = 48767;
                                                while (true) {
                                                    i6 ^= 48784;
                                                    switch (i6) {
                                                        case 14:
                                                            break;
                                                        case 45:
                                                            int i7 = 49914;
                                                            while (true) {
                                                                i7 ^= 49931;
                                                                switch (i7) {
                                                                    case 497:
                                                                        i7 = 50596;
                                                                        break;
                                                                    case 1711:
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                                z = z7;
                                                                break;
                                                            }
                                                            break;
                                                        case 76:
                                                            int iM8759 = C0218.m8759(mediaExtractor, C0236.m9595(mediaCodec, iM6991), 0);
                                                            int i8 = 48891;
                                                            while (true) {
                                                                i8 ^= 48908;
                                                                switch (i8) {
                                                                    case 22:
                                                                        break;
                                                                    case 53:
                                                                        C0171.m7093(mediaCodec, iM6991, 0, iM8759, C0118.m4493(mediaExtractor), 0);
                                                                        C0011.m433(mediaExtractor);
                                                                        int i9 = 49790;
                                                                        while (true) {
                                                                            i9 ^= 49807;
                                                                            switch (i9) {
                                                                                case 18:
                                                                                    break;
                                                                                case 241:
                                                                                    i9 = 49821;
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                            z = z7;
                                                                            break;
                                                                        }
                                                                        break;
                                                                    case 503:
                                                                        i8 = iM8759 < 0 ? 49635 : 48953;
                                                                        break;
                                                                    case 32495:
                                                                        C0171.m7093(mediaCodec, iM6991, 0, 0, 0L, 4);
                                                                        int i10 = 49666;
                                                                        while (true) {
                                                                            i10 ^= 49683;
                                                                            switch (i10) {
                                                                                case 17:
                                                                                    i10 = 49697;
                                                                                    break;
                                                                                case 50:
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                            z = true;
                                                                            break;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 239:
                                                            i6 = iM6991 >= 0 ? 48860 : 48829;
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 47483:
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    int iM663 = C0020.m663(mediaCodec, bufferInfo, j2);
                                    int i11 = 50689;
                                    while (true) {
                                        i11 ^= 50706;
                                        switch (i11) {
                                            case 19:
                                                i11 = iM663 >= 0 ? 50782 : 50751;
                                                break;
                                            case 45:
                                                z2 = z6;
                                                i = i2;
                                                break;
                                            case 50:
                                                break;
                                            case 76:
                                                int iM9302 = C0232.m9302(bufferInfo);
                                                int i12 = C0246.f696;
                                                int i13 = 50813;
                                                while (true) {
                                                    i13 ^= 50830;
                                                    switch (i13) {
                                                        case 18:
                                                            break;
                                                        case 53:
                                                            z2 = z6;
                                                            break;
                                                        case 243:
                                                            i13 = ((i12 ^ (-969)) & iM9302) != 0 ? 51557 : 50875;
                                                            break;
                                                        case 4075:
                                                            z2 = true;
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                int iM4007 = C0108.m4007(bufferInfo);
                                                int i14 = 51588;
                                                while (true) {
                                                    i14 ^= 51605;
                                                    switch (i14) {
                                                        case 17:
                                                            i14 = iM4007 != 0 ? 51681 : 51650;
                                                            break;
                                                        case 54:
                                                            break;
                                                        case 87:
                                                            z3 = false;
                                                            break;
                                                        case 116:
                                                            z3 = true;
                                                            int i15 = 51712;
                                                            while (true) {
                                                                i15 ^= 51729;
                                                                switch (i15) {
                                                                    case 14:
                                                                        break;
                                                                    case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                                                                    case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                                                                    default:
                                                                        break;
                                                                    case 17:
                                                                        i15 = 51743;
                                                                        break;
                                                                }
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                int i16 = 51836;
                                                while (true) {
                                                    i16 ^= 51853;
                                                    switch (i16) {
                                                        case 241:
                                                            i16 = z3 ? 52580 : 52549;
                                                            break;
                                                        case 1963:
                                                            break;
                                                        case 1992:
                                                            i = i2;
                                                            break;
                                                        case 2025:
                                                            i = i2 + (C0105.f87 ^ 661);
                                                            Callback callbackM8218 = C0201.m8218(this);
                                                            int i17 = 52611;
                                                            while (true) {
                                                                i17 ^= 52628;
                                                                switch (i17) {
                                                                    case 23:
                                                                        i17 = callbackM8218 != null ? 52704 : 52673;
                                                                        break;
                                                                    case 54:
                                                                        break;
                                                                    case 85:
                                                                        break;
                                                                    case 116:
                                                                        C0053.m1967(callbackM8218, i);
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            int i18 = 52735;
                                                            while (true) {
                                                                i18 ^= 52752;
                                                                switch (i18) {
                                                                    case 14:
                                                                        break;
                                                                    case 45:
                                                                        jM4167 = j;
                                                                        z4 = z5;
                                                                        break;
                                                                    case 1007:
                                                                        i18 = !z5 ? 53479 : 52797;
                                                                        break;
                                                                    case 7927:
                                                                        jM4167 = C0113.m4167();
                                                                        z4 = true;
                                                                        int i19 = 53510;
                                                                        while (true) {
                                                                            i19 ^= 53527;
                                                                            switch (i19) {
                                                                                case 17:
                                                                                    i19 = 53541;
                                                                                    break;
                                                                                case 50:
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                            break;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            Surface surfaceM3733 = C0099.m3733(this);
                                                            String strM5181 = C0129.m5181(m5712(), 464, C0250.f700 ^ 240, 762);
                                                            int i20 = 53634;
                                                            while (true) {
                                                                i20 ^= 53651;
                                                                switch (i20) {
                                                                    case 17:
                                                                        i20 = surfaceM3733 == null ? 53727 : 53696;
                                                                        break;
                                                                    case 50:
                                                                        break;
                                                                    case 76:
                                                                        Image imageM2026 = C0055.m2026(mediaCodec, iM663);
                                                                        ByteBuffer byteBufferM7244 = C0176.m7244(C0240.m9875(imageM2026)[0]);
                                                                        byte[] bArr = new byte[C0119.m4588(byteBufferM7244)];
                                                                        C0004.m142(byteBufferM7244, bArr);
                                                                        LinkedBlockingQueue linkedBlockingQueueM8966 = C0225.m8966(this);
                                                                        int i21 = 53758;
                                                                        while (true) {
                                                                            i21 ^= 53775;
                                                                            switch (i21) {
                                                                                case 1009:
                                                                                    i21 = linkedBlockingQueueM8966 != null ? 54502 : 54471;
                                                                                    break;
                                                                                case 1703:
                                                                                    break;
                                                                                case 1736:
                                                                                    break;
                                                                                case 1769:
                                                                                    try {
                                                                                        C0026.m1055(linkedBlockingQueueM8966, bArr);
                                                                                        int i22 = 54533;
                                                                                        while (true) {
                                                                                            i22 ^= 54550;
                                                                                            switch (i22) {
                                                                                                case 19:
                                                                                                    i22 = 54564;
                                                                                                    break;
                                                                                                case 50:
                                                                                                    break;
                                                                                                default:
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                    } catch (InterruptedException e) {
                                                                                        StringBuilder sb = new StringBuilder();
                                                                                        C0235.m9501(sb, strM5181);
                                                                                        C0235.m9501(sb, C0051.m1795(e));
                                                                                        m5711(C0009.m261(sb));
                                                                                        int i23 = 54657;
                                                                                        while (true) {
                                                                                            i23 ^= 54674;
                                                                                            switch (i23) {
                                                                                                case 19:
                                                                                                    i23 = 54688;
                                                                                                    break;
                                                                                                case 50:
                                                                                                    break;
                                                                                                default:
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        ek ekVarM9768 = C0239.m9768(this);
                                                                        int i24 = 55432;
                                                                        while (true) {
                                                                            i24 ^= 55449;
                                                                            switch (i24) {
                                                                                case 17:
                                                                                    i24 = ekVarM9768 != null ? 55525 : 55494;
                                                                                    break;
                                                                                case 62:
                                                                                    break;
                                                                                case 95:
                                                                                    break;
                                                                                case 124:
                                                                                    HookMain.data_buffer = C0119.m4585(imageM2026, C0174.f624 ^ (-329));
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        C0171.m7137(imageM2026);
                                                                        int i25 = 55556;
                                                                        while (true) {
                                                                            i25 ^= 55573;
                                                                            switch (i25) {
                                                                                case 17:
                                                                                    i25 = 55587;
                                                                                    break;
                                                                                case 54:
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                            break;
                                                                        }
                                                                        break;
                                                                    case 83:
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            long jM9799 = 8 + (((C0239.m9799(bufferInfo) / 1000) - 8) - (((C0113.m4167() - 26) - jM4167) + 26));
                                                            int i26 = 55680;
                                                            while (true) {
                                                                i26 ^= 55697;
                                                                switch (i26) {
                                                                    case 17:
                                                                        i26 = jM9799 > 0 ? 56424 : 56393;
                                                                        break;
                                                                    case 1467:
                                                                        break;
                                                                    case 1496:
                                                                        break;
                                                                    case 1529:
                                                                        try {
                                                                            C0161.m6731(jM9799);
                                                                            int i27 = 56455;
                                                                            while (true) {
                                                                                i27 ^= 56472;
                                                                                switch (i27) {
                                                                                    case 31:
                                                                                        i27 = 56486;
                                                                                        break;
                                                                                    case 62:
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                        } catch (InterruptedException e2) {
                                                                            StringBuilder sb2 = new StringBuilder();
                                                                            C0235.m9501(sb2, strM5181);
                                                                            C0235.m9501(sb2, C0051.m1795(e2));
                                                                            m5711(C0009.m261(sb2));
                                                                            m5711(C0014.m495(m5712(), 473, C0196.f646 ^ 425, 1522));
                                                                        }
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            C0049.m1731(mediaCodec, iM663, true);
                                                            int i28 = 56579;
                                                            while (true) {
                                                                i28 ^= 56596;
                                                                switch (i28) {
                                                                    case 23:
                                                                        i28 = 56610;
                                                                        break;
                                                                    case 54:
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                                j = jM4167;
                                                                z5 = z4;
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    int i29 = 1507503;
                                    while (true) {
                                        i29 ^= 1507520;
                                        switch (i29) {
                                            case 14:
                                                break;
                                            case 111:
                                                i29 = 1507534;
                                                break;
                                        }
                                    }
                                    i2 = i;
                                    z7 = z;
                                    z6 = z2;
                                    break;
                                default:
                                    break;
                            }
                        }
                        break;
                    case 239:
                        break;
                    default:
                        break;
                }
            }
        }
        Callback callbackM8219 = C0201.m8218(this);
        int i30 = 1507627;
        while (true) {
            i30 ^= 1507644;
            switch (i30) {
                case 23:
                    if (callbackM8219 != null) {
                        i30 = 1507720;
                    }
                    break;
                case 85:
                    return;
                case 118:
                    break;
                case 180:
                    C0127.m4993(callbackM8219);
                    return;
                default:
                    continue;
            }
            i30 = 1507689;
        }
    }

    public final boolean xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(int i, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        int[] iArrM2749 = C0069.m2749(codecCapabilities);
        int length = iArrM2749.length;
        int i2 = 0;
        while (true) {
            int i3 = 1616;
            while (true) {
                i3 ^= 1633;
                switch (i3) {
                    case 14:
                        break;
                    case 49:
                        i3 = i2 < length ? 1709 : 1678;
                        break;
                    case 204:
                        break;
                    case 239:
                        return false;
                    default:
                        break;
                }
            }
            int i4 = iArrM2749[i2];
            int i5 = 1740;
            while (true) {
                i5 ^= 1757;
                switch (i5) {
                    case 17:
                        i5 = i4 == i ? 1833 : 1802;
                        break;
                    case 54:
                        break;
                    case 471:
                        break;
                    case 500:
                        return true;
                    default:
                        break;
                }
            }
            i2 += C0246.f696 ^ (-974);
            int i6 = 1864;
            while (true) {
                i6 ^= 1881;
                switch (i6) {
                    case 17:
                        i6 = 48674;
                        break;
                    case 47483:
                        break;
                }
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0021. Please report as an issue. */
    public final void xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        C0058.m2199(C0200.m8135(), C0119.m4598(m5712(), 488, C0124.f103 ^ (-870), 1520));
        int[] iArrM2749 = C0069.m2749(codecCapabilities);
        int length = iArrM2749.length;
        int i = 0;
        while (true) {
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        break;
                    case 49:
                        i2 = i < length ? 1709 : 1678;
                        break;
                    case 204:
                        break;
                    case 239:
                        break;
                    default:
                        break;
                }
                C0052.m1869(C0200.m8135());
                return;
            }
            int i3 = iArrM2749[i];
            PrintStream printStreamM8135 = C0200.m8135();
            StringBuilder sb = new StringBuilder();
            C0126.m4911(sb, i3);
            C0235.m9501(sb, C0025.m931(m5712(), 512, 1, 2880));
            C0058.m2199(printStreamM8135, C0009.m261(sb));
            i += C0207.f657 ^ 343;
            int i4 = 1740;
            while (true) {
                i4 ^= 1757;
                switch (i4) {
                    case 17:
                        i4 = 1771;
                        break;
                    case 54:
                        break;
                }
            }
        }
    }
}
