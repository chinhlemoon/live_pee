package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.support.v4.graphics.drawable.C0009;
import androidx.core.graphics.drawable.C0064;
import androidx.emoji2.text.C0078;
import androidx.fragment.app.C0093;
import androidx.lifecycle.C0107;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0116;
import androidx.savedstate.C0122;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0129;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.io.C0195;
import okhttp3.internal.publicsuffix.C0215;

/* JADX INFO: loaded from: classes.dex */
public class ko extends jo {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f348short = {1687, 1759, 1731, 1730, 1752, 1685, 460, 388, 408, 409, 387, 462, 1463, 1535, 1507, 1506, 1528, 1461, 1750, 1694, 1666, 1667, 1689, 1748};

    public static final Long a(String str, int i) {
        int i2;
        boolean z;
        long j;
        C0215.m8639(str, C0064.m2410(m6064(), 0, 6, 1707));
        C0009.m251(i);
        int iM7772 = C0191.m7772(str);
        if (iM7772 == 0) {
            return null;
        }
        char cM7096 = C0171.m7096(str, 0);
        if (C0122.m4723(cM7096, 48) >= 0) {
            i2 = 0;
            z = false;
            j = -9223372036854775807L;
        } else {
            if (iM7772 == 1) {
                return null;
            }
            i2 = 1;
            if (cM7096 == '-') {
                z = true;
                j = Long.MIN_VALUE;
            } else {
                if (cM7096 != '+') {
                    return null;
                }
                z = false;
                j = -9223372036854775807L;
            }
        }
        long j2 = -256204778801521550L;
        long j3 = -256204778801521550L;
        long j4 = 0;
        int i3 = i2;
        while (i3 < iM7772) {
            int iM5096 = C0128.m5096(C0171.m7096(str, i3), i);
            if (iM5096 < 0) {
                return null;
            }
            if (j4 < j3) {
                if (j3 != j2) {
                    return null;
                }
                long j5 = j / ((long) i);
                if (j4 < j5) {
                    return null;
                }
                j3 = j5;
            }
            long j6 = j4 * ((long) i);
            if (j6 < ((long) iM5096) + j) {
                return null;
            }
            j4 = j6 - ((long) iM5096);
            i3++;
            cM7096 = cM7096;
            j2 = j2;
        }
        return z ? C0195.m7932(j4) : C0195.m7932(-j4);
    }

    public static final Integer xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(String str) {
        C0215.m8639(str, C0107.m3950(m6064(), 6, 6, 496));
        return C0093.m3300(str, 10);
    }

    public static final Integer xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(String str, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        C0215.m8639(str, C0129.m5181(m6064(), 12, 6, 1419));
        C0009.m251(i);
        int iM7772 = C0191.m7772(str);
        if (iM7772 == 0) {
            return null;
        }
        char cM7096 = C0171.m7096(str, 0);
        if (C0122.m4723(cM7096, 48) >= 0) {
            i2 = 0;
            z = false;
            i3 = -2147483647;
        } else {
            if (iM7772 == 1) {
                return null;
            }
            i2 = 1;
            if (cM7096 == '-') {
                z = true;
                i3 = Integer.MIN_VALUE;
            } else {
                if (cM7096 != '+') {
                    return null;
                }
                z = false;
                i3 = -2147483647;
            }
        }
        int i5 = -59652323;
        int i6 = 0;
        for (int i7 = i2; i7 < iM7772; i7++) {
            int iM5096 = C0128.m5096(C0171.m7096(str, i7), i);
            if (iM5096 < 0) {
                return null;
            }
            if ((i6 < i5 && (i5 != -59652323 || i6 < (i5 = i3 / i))) || (i4 = i6 * i) < i3 + iM5096) {
                return null;
            }
            i6 = i4 - iM5096;
        }
        return z ? C0078.m3006(i6) : C0078.m3006(-i6);
    }

    public static final Long xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(String str) {
        C0215.m8639(str, C0112.m4102(m6064(), 18, 6, 1770));
        return C0116.m4348(str, 10);
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static short[] m6064() {
        if (C0115.m4218() < 0) {
            return f348short;
        }
        return null;
    }
}
