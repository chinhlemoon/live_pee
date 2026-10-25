package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.support.v4.app.C0002;
import android.support.v4.graphics.drawable.C0009;
import androidx.annotation.C0026;
import androidx.appcompat.view.menu.C0039;
import androidx.appcompat.widget.C0047;
import androidx.core.app.C0052;
import androidx.lifecycle.C0108;
import androidx.profileinstaller.C0112;
import androidx.savedstate.C0126;
import androidx.savedstate.C0127;
import androidx.versionedparcelable.C0129;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import okhttp3.C0238;
import okhttp3.C0240;
import okhttp3.internal.C0227;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.internal.ws.C0224;
import okhttp3.logging.C0235;
import okhttp3.logging.C0236;

/* JADX INFO: loaded from: classes.dex */
public class d4 extends c4 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f237short = {773, 780, 773, 781, 773, 782, 788, 787, 2824, 2817, 2824, 2816, 2824, 2819, 2841, 2846, 2310, 2382, 2386, 2387, 2377, 2308, 2696, 2703, 747, 767, 738, 736, 708, 739, 745, 744, 757, 685, 677, 2588, 2567, 2593, 2566, 2572, 2573, 2576, 2632, 2624, 2830, 2823, 2894, 2900, 2823, 2880, 2901, 2882, 2886, 2899, 2882, 2901, 2823, 2899, 2895, 2886, 2889, 2823, 2900, 2894, 2909, 2882, 2823, 2831, 407, 414, 471, 461, 414, 466, 475, 461, 461, 414, 458, 470, 479, 464, 414, 452, 475, 460, 465, 400, 2045, 2036, 1981, 1959, 2036, 1971, 1958, 1969, 1973, 1952, 1969, 1958, 2036, 1952, 1980, 1973, 1978, 2036, 1952, 1979, 1949, 1978, 1968, 1969, 1964, 2036, 2044, 584, 612, 638, 613, 639, 555, 612, 637, 622, 633, 621, 615, 612, 636, 555, 611, 618, 632, 555, 611, 618, 635, 635, 622, 613, 622, 623, 549, 3270, 3297, 3307, 3306, 3319, 3247, 3296, 3321, 3306, 3325, 3305, 3299, 3296, 3320, 3247, 3303, 3310, 3324, 3247, 3303, 3310, 3327, 3327, 3306, 3297, 3306, 3307, 3233, 1520, 1464, 1444, 1445, 1471, 1522, 3057, 3001, 2981, 2980, 3006, 3059, 1477, 1421, 1425, 1424, 1418, 1479, 2973, 2964, 2973, 2965, 2973, 2966, 2956, 2955};

    public static final <T> List<T> a(T... tArr) {
        C0215.m8639(tArr, C0039.m1483(m5911(), 0, 8, 864));
        return C0009.m266(tArr);
    }

    public static final <T> List<T> b(T... tArr) {
        C0215.m8639(tArr, C0164.m6898(m5911(), 8, 8, 2925));
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new t1(tArr, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> c(List<? extends T> list) {
        C0215.m8639(list, C0127.m4990(m5911(), 16, 6, 2362));
        switch (C0026.m1019(list)) {
            case 0:
                return C0238.m9675();
            case 1:
                return C0112.m4065(C0224.m8926(list, 0));
            default:
                return list;
        }
    }

    public static final void d(int i, int i2, int i3) {
        String strM9616 = C0236.m9616(m5911(), 22, 2, 2721);
        String strM4043 = C0108.m4043(m5911(), 24, 11, 653);
        if (i2 > i3) {
            StringBuilder sb = new StringBuilder();
            C0235.m9501(sb, strM4043);
            C0126.m4911(sb, i2);
            C0235.m9501(sb, C0191.m7768(m5911(), 88, 27, 2004));
            C0126.m4911(sb, i3);
            C0235.m9501(sb, strM9616);
            throw new IllegalArgumentException(C0009.m261(sb));
        }
        if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder();
            C0235.m9501(sb2, strM4043);
            C0126.m4911(sb2, i2);
            C0235.m9501(sb2, C0214.m8579(m5911(), 68, 20, 446));
            throw new IndexOutOfBoundsException(C0009.m261(sb2));
        }
        if (i3 <= i) {
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        C0235.m9501(sb3, C0052.m1915(m5911(), 35, 9, 2664));
        C0126.m4911(sb3, i3);
        C0235.m9501(sb3, C0112.m4102(m5911(), 44, 24, 2855));
        C0126.m4911(sb3, i);
        C0235.m9501(sb3, strM9616);
        throw new IndexOutOfBoundsException(C0009.m261(sb3));
    }

    public static final void e() {
        throw new ArithmeticException(C0002.m62(m5911(), 115, 28, 523));
    }

    public static final void f() {
        throw new ArithmeticException(C0211.m8418(m5911(), 143, 28, 3215));
    }

    public static /* synthetic */ int xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(List list, Comparable comparable, int i, int i2, int i3) {
        int iM1019 = i2;
        int i4 = i;
        if ((i3 & 2) != 0) {
            i4 = 0;
        }
        if ((i3 & 4) != 0) {
            iM1019 = C0026.m1019(list);
        }
        return C0129.m5137(list, comparable, i4, iM1019);
    }

    public static final <T> Collection<T> xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(T[] tArr) {
        C0215.m8639(tArr, C0161.m6789(m5911(), 171, 6, 1484));
        return new t1(tArr, false);
    }

    public static final <T extends Comparable<? super T>> int xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(List<? extends T> list, T t, int i, int i2) {
        C0215.m8639(list, C0148.m6460(m5911(), 177, 6, 3021));
        C0047.m1652(C0026.m1019(list), i, i2);
        int i3 = i;
        int i4 = i2 - 1;
        while (i3 <= i4) {
            int i5 = (i3 + i4) >>> 1;
            int iM7720 = C0188.m7720((Comparable) C0224.m8926(list, i5), t);
            if (iM7720 < 0) {
                i3 = i5 + 1;
            } else {
                if (iM7720 <= 0) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final <T> List<T> xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa() {
        return C0026.m1005();
    }

    public static final <T> int xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(List<? extends T> list) {
        C0215.m8639(list, C0211.m8418(m5911(), 183, 6, 1529));
        return C0026.m1019(list) - 1;
    }

    public static final <T> List<T> xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(T... tArr) {
        C0215.m8639(tArr, C0227.m9074(m5911(), 189, 8, 3064));
        return tArr.length > 0 ? C0240.m9848(tArr) : C0238.m9675();
    }

    /* JADX INFO: renamed from: ۟۟۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static short[] m5911() {
        if (C0219.m8794() >= 0) {
            return f237short;
        }
        return null;
    }
}
