package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.support.v4.app.C0004;
import android.support.v4.graphics.drawable.C0009;
import androidx.activity.C0021;
import androidx.core.app.C0053;
import androidx.core.content.C0057;
import androidx.core.graphics.drawable.C0064;
import androidx.fragment.app.C0097;
import androidx.profileinstaller.C0120;
import java.util.concurrent.CancellationException;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.logging.C0235;

/* JADX INFO: loaded from: classes.dex */
public final class sd extends CancellationException {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f479short = {1969, 1962, 2016, 2021, 2024, 1975};
    public final transient rd xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;

    public sd(String str, Throwable th, rd rdVar) {
        super(str);
        this.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = rdVar;
        if (th != null) {
            C0164.m6954(this, th);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۨ۟, reason: not valid java name and contains not printable characters */
    public static short[] m6232() {
        if (C0120.m4608() > 0) {
            return f479short;
        }
        return null;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof sd) && C0021.m717(C0064.m2392((sd) obj), C0064.m2392(this)) && C0021.m717(C0053.m1946((sd) obj), C0053.m1946(this)) && C0021.m717(C0097.m3686((sd) obj), C0097.m3686(this)));
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        C0214.m8515(this, new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String strM2392 = C0064.m2392(this);
        C0021.m725(strM2392);
        int iM2114 = ((C0057.m2114(strM2392) * 31) + C0169.m6980(C0053.m1946(this))) * 31;
        Throwable thM3686 = C0097.m3686(this);
        return iM2114 + (thM3686 != null ? C0182.m7496(thM3686) : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        C0235.m9501(sb, super.toString());
        C0235.m9501(sb, C0219.m8780(m6232(), 0, 6, 1930));
        C0004.m132(sb, C0053.m1946(this));
        return C0009.m261(sb);
    }
}
