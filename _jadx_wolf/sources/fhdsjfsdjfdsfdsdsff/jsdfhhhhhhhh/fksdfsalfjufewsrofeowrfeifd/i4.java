package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import androidx.activity.C0020;
import androidx.core.app.C0053;
import androidx.fragment.app.C0094;
import androidx.lifecycle.C0106;
import androidx.profileinstaller.C0119;
import androidx.profileinstaller.C0120;
import java.util.Collection;
import java.util.Iterator;
import okhttp3.C0240;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.ws.C0225;

/* JADX INFO: loaded from: classes.dex */
public class i4 extends h4 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f310short = {1788, 1716, 1704, 1705, 1715, 1790, 500, 509, 500, 508, 500, 511, 485, 482, 1195, 1251, 1279, 1278, 1252, 1193, 1717, 1724, 1717, 1725, 1717, 1726, 1700, 1699};

    public static final <T> boolean i(Collection<? super T> collection, Iterable<? extends T> iterable) {
        C0215.m8639(collection, C0148.m6460(m6011(), 0, 6, 1728));
        C0215.m8639(iterable, C0119.m4598(m6011(), 6, 8, 401));
        if (iterable instanceof Collection) {
            return C0225.m8989(collection, (Collection) iterable);
        }
        boolean z = false;
        Iterator itM1939 = C0053.m1939(iterable);
        while (C0164.m6913(itM1939)) {
            if (C0106.m3859(collection, C0120.m4679(itM1939))) {
                z = true;
            }
        }
        return z;
    }

    public static final <T> boolean j(Collection<? super T> collection, T[] tArr) {
        C0215.m8639(collection, C0094.m3384(m6011(), 14, 6, 1175));
        C0215.m8639(tArr, C0020.m654(m6011(), 20, 8, 1744));
        return C0225.m8989(collection, C0240.m9848(tArr));
    }

    /* JADX INFO: renamed from: ۣۧۨۦ, reason: not valid java name and contains not printable characters */
    public static short[] m6011() {
        if (C0215.m8604() <= 0) {
            return f310short;
        }
        return null;
    }
}
