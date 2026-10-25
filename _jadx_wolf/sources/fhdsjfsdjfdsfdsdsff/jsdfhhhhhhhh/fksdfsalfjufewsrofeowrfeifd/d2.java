package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import androidx.activity.C0021;
import androidx.appcompat.widget.C0047;
import androidx.core.app.C0052;
import androidx.core.graphics.drawable.C0062;
import androidx.core.widget.C0068;
import androidx.fragment.app.C0095;
import androidx.lifecycle.C0106;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0119;
import androidx.savedstate.C0122;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.C0238;
import okhttp3.C0239;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.io.C0195;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0218;

/* JADX INFO: loaded from: classes.dex */
public class d2 extends c2 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f236short = {1033, 1089, 1117, 1116, 1094, 1035, 1891, 1835, 1847, 1846, 1836, 1889, 2409, 2337, 2365, 2364, 2342, 2411, 2961, 2960, 2950, 2945, 2972, 2971, 2964, 2945, 2972, 2970, 2971, 346, 274, 270, 271, 277, 344, 1381, 1325, 1329, 1328, 1322, 1383, 684, 740, 760, 761, 739, 686, 599, 543, 515, 514, 536, 597, 3206, 3253, 3253, 3238, 3262, 3303, 3247, 3238, 3252, 3303, 3242, 3240, 3253, 3234, 3303, 3251, 3247, 3238, 3241, 3303, 3240, 3241, 3234, 3303, 3234, 3243, 3234, 3242, 3234, 3241, 3251, 3305, 2110, 2061, 2061, 2078, 2054, 2143, 2070, 2060, 2143, 2074, 2066, 2063, 2059, 2054, 2129, 440, 496, 492, 493, 503, 442, 856, 784, 780, 781, 791, 858, 2342, 2414, 2418, 2419, 2409, 2340};

    public static final <T> boolean e(T[] tArr, T t) {
        C0215.m8639(tArr, C0149.m6497(m5910(), 0, 6, 1077));
        return C0062.m2281(tArr, t) >= 0;
    }

    public static final <T> List<T> f(T[] tArr) {
        C0215.m8639(tArr, C0202.m8243(m5910(), 6, 6, 1887));
        ArrayList arrayList = new ArrayList();
        C0162.m6808(tArr, arrayList);
        return arrayList;
    }

    public static final <C extends Collection<? super T>, T> C g(T[] tArr, C c) {
        C0215.m8639(tArr, C0068.m2608(m5910(), 12, 6, 2389));
        C0215.m8639(c, C0119.m4598(m5910(), 18, 11, 3061));
        for (T t : tArr) {
            if (t != null) {
                C0106.m3859(c, t);
            }
        }
        return c;
    }

    public static final <T> hd h(T[] tArr) {
        C0215.m8639(tArr, C0148.m6460(m5910(), 29, 6, 358));
        return new hd(0, C0218.m8766(tArr));
    }

    public static final <T> int i(T[] tArr) {
        C0215.m8639(tArr, C0195.m7915(m5910(), 35, 6, 1369));
        return tArr.length - 1;
    }

    public static final <T> int j(T[] tArr, T t) {
        C0215.m8639(tArr, C0106.m3866(m5910(), 41, 6, 656));
        if (t == null) {
            int length = tArr.length;
            for (int i = 0; i < length; i++) {
                if (tArr[i] == null) {
                    return i;
                }
            }
            return -1;
        }
        int length2 = tArr.length;
        for (int i2 = 0; i2 < length2; i2++) {
            if (C0021.m717(t, tArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public static final char k(char[] cArr) {
        C0215.m8639(cArr, C0095.m3491(m5910(), 47, 6, 619));
        switch (cArr.length) {
            case 0:
                throw new NoSuchElementException(C0162.m6834(m5910(), 85, 15, 2175));
            case 1:
                return cArr[0];
            default:
                throw new IllegalArgumentException(C0122.m4749(m5910(), 53, 32, 3271));
        }
    }

    public static final <T> T l(T[] tArr) {
        C0215.m8639(tArr, C0239.m9724(m5910(), 100, 6, 388));
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static final <T> List<T> m(T[] tArr) {
        C0215.m8639(tArr, C0052.m1915(m5910(), 106, 6, 868));
        switch (tArr.length) {
            case 0:
                return C0238.m9675();
            case 1:
                return C0112.m4065(tArr[0]);
            default:
                return C0047.m1670(tArr);
        }
    }

    public static final <T> List<T> n(T[] tArr) {
        C0215.m8639(tArr, C0200.m8107(m5910(), 112, 6, 2330));
        return new ArrayList(C0200.m8075(tArr));
    }

    /* JADX INFO: renamed from: ۡۨۤۤ, reason: not valid java name and contains not printable characters */
    public static short[] m5910() {
        if (C0176.m7290() > 0) {
            return f236short;
        }
        return null;
    }
}
