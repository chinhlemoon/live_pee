package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.support.v4.app.C0004;
import android.support.v4.graphics.drawable.C0009;
import androidx.profileinstaller.C0112;
import androidx.savedstate.C0122;
import java.io.IOException;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.io.C0199;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.logging.C0230;
import okhttp3.logging.C0231;
import okhttp3.logging.C0235;

/* JADX INFO: loaded from: classes.dex */
public abstract class q9 implements un {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f447short = {442, 443, 434, 443, 441, 447, 426, 443, 568, 546, 549, 544};
    private final un delegate;

    public q9(un unVar) {
        C0215.m8639(unVar, C0122.m4749(m6191(), 0, 8, 478));
        this.delegate = unVar;
    }

    /* JADX INFO: renamed from: ۟۠ۡۧۨ, reason: not valid java name and contains not printable characters */
    public static short[] m6191() {
        if (C0148.m6464() < 0) {
            return f447short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۢۤ, reason: not valid java name and contains not printable characters */
    public static un m6192(Object obj) {
        if (C0112.m4054() < 0) {
            return ((q9) obj).delegate;
        }
        return null;
    }

    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name */
    public final un m6193deprecated_delegate() {
        return m6192(this);
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        C0161.m6805(m6192(this));
    }

    public final un delegate() {
        return m6192(this);
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un
    public long read(s2 s2Var, long j) throws IOException {
        C0215.m8639(s2Var, C0214.m8579(m6191(), 8, 4, 587));
        return C0199.m8026(m6192(this), s2Var, j);
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un
    public up timeout() {
        return C0231.m9208(m6192(this));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        C0235.m9501(sb, C0191.m7795(C0112.m4080(this)));
        C0230.m9172(sb, '(');
        C0004.m132(sb, m6192(this));
        C0230.m9172(sb, ')');
        return C0009.m261(sb);
    }
}
