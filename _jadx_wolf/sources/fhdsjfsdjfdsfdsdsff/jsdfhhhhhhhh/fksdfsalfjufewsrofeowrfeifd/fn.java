package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.support.v4.app.C0002;
import androidx.activity.C0014;
import androidx.activity.C0021;
import androidx.annotation.C0023;
import androidx.appcompat.app.C0037;
import androidx.appcompat.widget.C0047;
import androidx.core.content.C0057;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0070;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0079;
import androidx.emoji2.text.C0083;
import androidx.emoji2.text.C0084;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0095;
import androidx.fragment.app.C0097;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0117;
import androidx.savedstate.C0122;
import androidx.savedstate.C0123;
import androidx.versionedparcelable.C0135;
import java.security.MessageDigest;
import okhttp3.C0238;
import okhttp3.C0240;
import okhttp3.internal.C0227;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.internal.ws.C0224;
import okhttp3.logging.C0232;
import retrofit2.http.C0249;

/* JADX INFO: loaded from: classes.dex */
public final class fn extends a3 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f279short = {2604, 2618, 2616, 2610, 2618, 2609, 2603, 2604, 3294, 3283, 3272, 3295, 3289, 3278, 3285, 3272, 3267, 2737, 2730, 2742, 2747, 2732, 3187, 3176, 3188, 3193, 3182, 1058, 1077, 1062, 1062, 1061, 1074, 2808, 2805, 2814, 2806, 2795, 2800, 2797, 2801, 2804, 1277, 1264, 1278, 1276, 1258, 1261, 1207, 1277, 1264, 1278, 1276, 1258, 1261, 1201, 1200};
    public final transient byte[][] a;
    public final transient int[] b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn(byte[][] bArr, int[] iArr) {
        super(C0232.m9295(C0037.m1440()));
        C0215.m8639(bArr, C0094.m3384(m5979(), 0, 8, 2655));
        C0215.m8639(iArr, C0219.m8780(m5979(), 8, 9, 3258));
        this.a = bArr;
        this.b = iArr;
    }

    /* JADX INFO: renamed from: ۠۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static short[] m5979() {
        if (C0084.m3253() < 0) {
            return f279short;
        }
        return null;
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3
    public String a() {
        return C0047.m1706(C0176.m7277(this));
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3
    public byte[] b() {
        return C0097.m3633(this);
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3
    public byte c(int i) {
        C0123.m4790(C0014.m512(this)[C0069.m2707(this).length - 1], i, 1L);
        int iM8574 = C0214.m8574(this, i);
        return C0069.m2707(this)[iM8574][(i - (iM8574 == 0 ? 0 : C0014.m512(this)[iM8574 - 1])) + C0014.m512(this)[C0069.m2707(this).length + iM8574]];
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3
    public boolean e(int i, a3 a3Var, int i2, int i3) {
        C0215.m8639(a3Var, C0135.m5317(m5979(), 17, 5, 2782));
        fn fnVar = this;
        if (i < 0 || i > C0224.m8888(fnVar) - i3) {
            return false;
        }
        int i4 = i2;
        int i5 = i + i3;
        int iM8574 = C0214.m8574(fnVar, i);
        int i6 = i;
        while (i6 < i5) {
            int i7 = iM8574 == 0 ? 0 : C0014.m512(fnVar)[iM8574 - 1];
            int i8 = C0014.m512(fnVar)[iM8574] - i7;
            int i9 = C0014.m512(fnVar)[C0069.m2707(fnVar).length + iM8574];
            int iM7880 = C0194.m7880(i5, i7 + i8) - i6;
            fn fnVar2 = fnVar;
            if (!C0113.m4140(a3Var, i4, C0069.m2707(fnVar)[iM8574], (i6 - i7) + i9, iM7880)) {
                return false;
            }
            i4 += iM7880;
            i6 += iM7880;
            iM8574++;
            fnVar = fnVar2;
        }
        return true;
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a3) && C0224.m8888((a3) obj) == C0224.m8888(this) && C0135.m5288(this, 0, (a3) obj, 0, C0224.m8888(this));
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3
    public boolean f(int i, byte[] bArr, int i2, int i3) {
        C0215.m8639(bArr, C0095.m3491(m5979(), 22, 5, 3100));
        if (i < 0 || i > C0224.m8888(this) - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i2;
        int i5 = i + i3;
        int iM8574 = C0214.m8574(this, i);
        int i6 = i;
        while (i6 < i5) {
            int i7 = iM8574 == 0 ? 0 : C0014.m512(this)[iM8574 - 1];
            int i8 = C0014.m512(this)[iM8574] - i7;
            int i9 = C0014.m512(this)[C0069.m2707(this).length + iM8574];
            int iM7880 = C0194.m7880(i5, i7 + i8) - i6;
            if (!C0171.m7131(C0069.m2707(this)[iM8574], i9 + (i6 - i7), bArr, i4, iM7880)) {
                return false;
            }
            i4 += iM7880;
            i6 += iM7880;
            iM8574++;
        }
        return true;
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3
    public int hashCode() {
        int iM801 = C0023.m801(this);
        if (iM801 == 0) {
            iM801 = 1;
            int length = C0069.m2707(this).length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = C0014.m512(this)[length + i2];
                int i4 = C0014.m512(this)[i2];
                byte[] bArr = C0069.m2707(this)[i2];
                int i5 = i3 + (i4 - i);
                for (int i6 = i3; i6 < i5; i6++) {
                    iM801 = (iM801 * 31) + bArr[i6];
                }
                i = i4;
            }
            C0057.m2100(this, iM801);
        }
        return iM801;
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3
    public a3 m() {
        return C0074.m2950(C0176.m7277(this));
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3
    public void o(s2 s2Var, int i, int i2) {
        C0215.m8639(s2Var, C0057.m2101(m5979(), 27, 6, 1088));
        int i3 = i + i2;
        int iM8574 = C0214.m8574(this, i);
        int i4 = i;
        while (i4 < i3) {
            int i5 = iM8574 == 0 ? 0 : C0014.m512(this)[iM8574 - 1];
            int i6 = C0014.m512(this)[iM8574] - i5;
            int i7 = C0014.m512(this)[C0069.m2707(this).length + iM8574];
            int iM7880 = C0194.m7880(i3, i5 + i6) - i4;
            int i8 = (i4 - i5) + i7;
            dn dnVar = new dn(C0069.m2707(this)[iM8574], i8, i8 + iM7880, true, false);
            dn dnVarM4727 = C0122.m4727(s2Var);
            if (dnVarM4727 == null) {
                dnVar.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = dnVar;
                dnVar.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = dnVar;
                s2Var.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = dnVar;
            } else {
                C0021.m725(dnVarM4727);
                dn dnVarM9703 = C0238.m9703(dnVarM4727);
                C0021.m725(dnVarM9703);
                C0162.m6845(dnVarM9703, dnVar);
            }
            i4 += iM7880;
            iM8574++;
        }
        C0083.m3173(s2Var, C0123.m4769(s2Var) + ((long) C0224.m8888(this)));
    }

    public final int[] p() {
        return C0097.m3681(this);
    }

    public final byte[][] q() {
        return C0014.m507(this);
    }

    public byte[] r() {
        byte[] bArr = new byte[C0224.m8888(this)];
        int i = 0;
        int length = C0069.m2707(this).length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = C0014.m512(this)[length + i3];
            int i5 = C0014.m512(this)[i3];
            int i6 = i5 - i2;
            C0249.m10012(C0069.m2707(this)[i3], bArr, i, i4, i4 + i6);
            i += i6;
            i2 = i5;
        }
        return bArr;
    }

    public final a3 s() {
        return new a3(C0097.m3633(this));
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3
    public String toString() {
        return C0201.m8226(C0176.m7277(this));
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3
    public String xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa() {
        return C0002.m87(C0176.m7277(this));
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3
    public a3 xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(String str) {
        C0215.m8639(str, C0047.m1705(m5979(), 33, 9, 2713));
        MessageDigest messageDigestM9062 = C0227.m9062(str);
        int length = C0069.m2707(this).length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = C0014.m512(this)[length + i2];
            int i4 = C0014.m512(this)[i2];
            C0070.m2827(messageDigestM9062, C0069.m2707(this)[i2], i3, i4 - i);
            i = i4;
        }
        byte[] bArrM9850 = C0240.m9850(messageDigestM9062);
        C0117.m4362(bArrM9850, C0079.m3101(m5979(), 42, 15, 1177));
        return new a3(bArrM9850);
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3
    public int xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa() {
        return C0014.m512(this)[C0069.m2707(this).length - 1];
    }
}
