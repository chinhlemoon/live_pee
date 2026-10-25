package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.support.v4.app.C0004;
import android.support.v4.graphics.drawable.C0009;
import androidx.appcompat.app.C0034;
import androidx.core.content.C0057;
import androidx.core.graphics.drawable.C0062;
import androidx.core.widget.C0069;
import androidx.emoji2.text.C0079;
import androidx.emoji2.text.C0083;
import androidx.fragment.app.C0095;
import androidx.fragment.app.C0097;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0118;
import androidx.savedstate.C0123;
import androidx.savedstate.C0126;
import androidx.savedstate.C0127;
import androidx.versionedparcelable.C0135;
import java.io.IOException;
import java.io.InputStream;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.logging.C0230;
import okhttp3.logging.C0233;
import okhttp3.logging.C0235;

/* JADX INFO: loaded from: classes.dex */
public final class cd implements un {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f231short = {686, 681, 695, 690, 691, 3274, 3287, 3283, 3291, 3281, 3275, 3274, 2280, 2290, 2293, 2288, 1048, 1027, 1038, 1055, 1081, 1045, 1039, 1044, 1038, 1114, 1094, 1114, 1098, 1088, 1114, 2661, 2681, 2659, 2660, 2677, 2675, 2622};
    public final up xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
    public final InputStream xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;

    public cd(InputStream inputStream, up upVar) {
        C0215.m8639(inputStream, C0172.m7173(m5905(), 0, 5, 711));
        C0215.m8639(upVar, C0135.m5317(m5905(), 5, 7, 3262));
        this.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = inputStream;
        this.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = upVar;
    }

    /* JADX INFO: renamed from: ۤۢۢ, reason: not valid java name and contains not printable characters */
    public static short[] m5905() {
        if (C0057.m2142() >= 0) {
            return f231short;
        }
        return null;
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C0118.m4519(C0172.m7157(this));
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un
    public long read(s2 s2Var, long j) throws IOException {
        C0215.m8639(s2Var, C0095.m3491(m5905(), 12, 4, 2203));
        if (j == 0) {
            return 0L;
        }
        if (!(j >= 0)) {
            StringBuilder sb = new StringBuilder();
            C0235.m9501(sb, C0233.m9376(m5905(), 16, 15, 1146));
            C0097.m3645(sb, j);
            throw new IllegalArgumentException(C0172.m7197(C0009.m261(sb)));
        }
        try {
            C0117.m4393(C0201.m8139(this));
            dn dnVarM4989 = C0127.m4989(s2Var, 1);
            int iM2332 = C0062.m2332(C0172.m7157(this), C0161.m6781(dnVarM4989), C0200.m8100(dnVarM4989), (int) C0069.m2734(j, 8192 - C0200.m8100(dnVarM4989)));
            if (iM2332 != -1) {
                dnVarM4989.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = C0200.m8100(dnVarM4989) + iM2332;
                C0083.m3173(s2Var, C0123.m4769(s2Var) + ((long) iM2332));
                return iM2332;
            }
            if (C0034.m1169(dnVarM4989) != C0200.m8100(dnVarM4989)) {
                return -1L;
            }
            s2Var.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = C0079.m3078(dnVarM4989);
            C0181.m7435(dnVarM4989);
            return -1L;
        } catch (AssertionError e) {
            if (C0161.m6733(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un
    public up timeout() {
        return C0201.m8139(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        C0235.m9501(sb, C0126.m4877(m5905(), 31, 7, 2582));
        C0004.m132(sb, C0172.m7157(this));
        C0230.m9172(sb, ')');
        return C0009.m261(sb);
    }
}
