package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.support.v4.app.C0002;
import android.support.v4.graphics.drawable.C0009;
import android.support.v4.graphics.drawable.C0010;
import androidx.appcompat.app.C0035;
import androidx.drawerlayout.widget.C0072;
import androidx.lifecycle.C0107;
import androidx.profileinstaller.C0113;
import androidx.savedstate.C0126;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.logging.C0235;

/* JADX INFO: loaded from: classes.dex */
public final class lr {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f371short = {2700, 2780, 2752, 2753, 2779, 2700, 2781, 2780, 2766, 2704, 2811, 2753, 2770, 2765, 2305, 2314, 2304, 2349, 2314, 2304, 2305, 2332, 2372, 2394, 2372, 2327, 2320, 2326, 2317, 2314, 2307, 2378, 2312, 2305, 2314, 2307, 2320, 2316, 2398, 2372, 666, 644, 666, 1792, 1803, 1793, 1836, 1803, 1793, 1792, 1821, 1861, 1881, 1861, 1799, 1792, 1794, 1804, 1803, 1836, 1803, 1793, 1792, 1821, 1887, 1861, 565, 553, 565, 706, 709, 711, 713, 718, 745, 718, 708, 709, 728, 640, 668, 640, 656, 666, 640};

    public static final long xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(String str, int i, int i2) {
        C0215.m8639(str, C0010.m361(m6100(), 0, 14, 2728));
        if (!(i >= 0)) {
            StringBuilder sb = new StringBuilder();
            C0235.m9501(sb, C0107.m3950(m6100(), 69, 16, 672));
            C0126.m4911(sb, i);
            throw new IllegalArgumentException(C0172.m7197(C0009.m261(sb)));
        }
        if (!(i2 >= i)) {
            StringBuilder sb2 = new StringBuilder();
            C0235.m9501(sb2, C0002.m62(m6100(), 43, 23, 1893));
            C0126.m4911(sb2, i2);
            C0235.m9501(sb2, C0035.m1304(m6100(), 66, 3, 533));
            C0126.m4911(sb2, i);
            throw new IllegalArgumentException(C0172.m7197(C0009.m261(sb2)));
        }
        if (!(i2 <= C0191.m7772(str))) {
            StringBuilder sb3 = new StringBuilder();
            C0235.m9501(sb3, C0113.m4161(m6100(), 14, 26, 2404));
            C0126.m4911(sb3, i2);
            C0235.m9501(sb3, C0072.m2852(m6100(), 40, 3, 698));
            C0126.m4911(sb3, C0191.m7772(str));
            throw new IllegalArgumentException(C0172.m7197(C0009.m261(sb3)));
        }
        long j = 0;
        int i3 = i;
        while (i3 < i2) {
            char cM7096 = C0171.m7096(str, i3);
            if (cM7096 < 128) {
                j++;
                i3++;
            } else if (cM7096 < 2048) {
                j += (long) 2;
                i3++;
            } else if (cM7096 < 55296 || cM7096 > 57343) {
                j += (long) 3;
                i3++;
            } else {
                char cM7097 = i3 + 1 < i2 ? C0171.m7096(str, i3 + 1) : (char) 0;
                if (cM7096 > 56319 || cM7097 < 56320 || cM7097 > 57343) {
                    j++;
                    i3++;
                } else {
                    j += (long) 4;
                    i3 += 2;
                }
            }
        }
        return j;
    }

    public static /* synthetic */ long xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(String str, int i, int i2, int i3) {
        int iM7772 = i2;
        int i4 = i;
        if ((i3 & 1) != 0) {
            i4 = 0;
        }
        if ((i3 & 2) != 0) {
            iM7772 = C0191.m7772(str);
        }
        return C0219.m8787(str, i4, iM7772);
    }

    /* JADX INFO: renamed from: ۟ۤۢۨ, reason: not valid java name and contains not printable characters */
    public static short[] m6100() {
        if (C0219.m8794() > 0) {
            return f371short;
        }
        return null;
    }
}
