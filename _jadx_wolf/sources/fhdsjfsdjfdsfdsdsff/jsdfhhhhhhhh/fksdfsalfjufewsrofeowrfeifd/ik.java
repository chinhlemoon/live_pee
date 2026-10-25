package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v4.app.C0002;
import android.support.v4.graphics.drawable.C0010;
import android.support.v4.graphics.drawable.C0011;
import androidx.activity.C0014;
import androidx.annotation.C0023;
import androidx.appcompat.view.menu.C0039;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0052;
import androidx.core.widget.C0069;
import androidx.emoji2.text.C0084;
import androidx.fragment.app.C0099;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0118;
import okhttp3.C0238;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.publicsuffix.C0214;
import retrofit2.C0259;
import retrofit2.converter.scalars.C0243;

/* JADX INFO: loaded from: classes.dex */
public final class ik {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f318short = {-9480, -8646, 1628};
    public static final ThreadLocal<kk<Rect, Rect>> xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = new ThreadLocal<>();

    public static class xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa {
        public static boolean xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(Paint paint, String str) {
            return C0023.m826(paint, str);
        }
    }

    public static boolean xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(Paint paint, String str) {
        if (C0002.m27() >= 23) {
            return C0052.m1916(paint, str);
        }
        int iM7772 = C0191.m7772(str);
        if (iM7772 == 1 && C0118.m4468(C0171.m7096(str, 0))) {
            return true;
        }
        String strM9660 = C0238.m9660(m6024(), 0, 2, 455);
        float fM9948 = C0243.m9948(paint, strM9660);
        float fM9949 = C0243.m9948(paint, C0112.m4102(m6024(), 2, 1, 1585));
        float fM99410 = C0243.m9948(paint, str);
        if (fM99410 == 0.0f) {
            return false;
        }
        if (C0112.m4118(str, 0, C0191.m7772(str)) > 1) {
            if (fM99410 > 2.0f * fM9949) {
                return false;
            }
            float fM10172 = 0.0f;
            int i = 0;
            while (i < iM7772) {
                int iM2685 = C0069.m2685(C0010.m403(str, i));
                fM10172 += C0259.m10172(paint, str, i, i + iM2685);
                i += iM2685;
            }
            if (fM99410 >= fM10172) {
                return false;
            }
        }
        if (fM99410 != fM9948) {
            return true;
        }
        kk kkVarM3272 = C0084.m3272();
        C0011.m444(paint, strM9660, 0, C0191.m7772(strM9660), (Rect) C0214.m8530(kkVarM3272));
        C0011.m444(paint, str, 0, iM7772, (Rect) C0039.m1547(kkVarM3272));
        return true ^ C0014.m505((Rect) C0214.m8530(kkVarM3272), C0039.m1547(kkVarM3272));
    }

    public static kk<Rect, Rect> xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa() {
        ThreadLocal threadLocalM8333 = C0211.m8333();
        kk<Rect, Rect> kkVar = (kk) C0049.m1730(threadLocalM8333);
        if (kkVar == null) {
            kk<Rect, Rect> kkVar2 = new kk<>(new Rect(), new Rect());
            C0214.m8522(threadLocalM8333, kkVar2);
            return kkVar2;
        }
        C0171.m7082((Rect) C0214.m8530(kkVar));
        C0171.m7082((Rect) C0039.m1547(kkVar));
        return kkVar;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۢۦ, reason: not valid java name and contains not printable characters */
    public static short[] m6024() {
        if (C0099.m3752() < 0) {
            return f318short;
        }
        return null;
    }
}
