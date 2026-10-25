package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.support.v4.app.C0006;
import android.text.style.ReplacementSpan;
import androidx.appcompat.app.C0035;
import androidx.appcompat.widget.C0047;
import androidx.core.app.C0052;
import androidx.core.widget.C0068;
import androidx.fragment.app.C0095;
import androidx.profileinstaller.C0118;
import androidx.savedstate.C0126;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.publicsuffix.C0217;

/* JADX INFO: loaded from: classes.dex */
public abstract class g8 extends ReplacementSpan {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f287short = {1725, 1717, 1700, 1713, 1716, 1713, 1700, 1713, 1776, 1715, 1713, 1726, 1726, 1727, 1700, 1776, 1714, 1717, 1776, 1726, 1701, 1724, 1724};
    public final f8 xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
    public final Paint.FontMetricsInt xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = new Paint.FontMetricsInt();
    public short xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = -1;
    public float xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = 1.0f;

    public g8(f8 f8Var) {
        C0118.m4525(f8Var, C0217.m8706(m5986(), 0, 23, 1744));
        this.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = f8Var;
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static short[] m5986() {
        if (C0199.m7998() <= 0) {
            return f287short;
        }
        return null;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        C0126.m4919(paint, C0201.m8162(this));
        Paint.FontMetricsInt fontMetricsIntM8162 = C0201.m8162(this);
        this.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = (C0052.m1906(C0095.m3502(fontMetricsIntM8162) - C0068.m2622(fontMetricsIntM8162)) * 1.0f) / C0149.m6531(C0162.m6846(this));
        C0149.m6531(C0162.m6846(this));
        short sM1641 = (short) (C0047.m1641(C0162.m6846(this)) * C0035.m1286(this));
        this.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = sM1641;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsIntM8163 = C0201.m8162(this);
            fontMetricsInt.ascent = C0068.m2622(fontMetricsIntM8163);
            fontMetricsInt.descent = C0095.m3502(fontMetricsIntM8163);
            fontMetricsInt.top = C0006.m176(fontMetricsIntM8163);
            fontMetricsInt.bottom = C0182.m7502(fontMetricsIntM8163);
        }
        return sM1641;
    }

    public final f8 xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa() {
        return C0162.m6846(this);
    }
}
