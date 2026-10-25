package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.support.v4.app.C0004;
import android.support.v4.graphics.drawable.C0009;
import androidx.drawerlayout.widget.C0072;
import androidx.fragment.app.C0095;
import androidx.fragment.app.C0096;
import androidx.profileinstaller.C0112;
import java.io.IOException;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.logging.C0230;
import okhttp3.logging.C0235;

/* JADX INFO: loaded from: classes.dex */
public abstract class p9 implements sn {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f431short = {1202, 1203, 1210, 1203, 1201, 1207, 1186, 1203, 1817, 1797, 1823, 1816, 1801, 1807};
    private final sn delegate;

    public p9(sn snVar) {
        C0215.m8639(snVar, C0096.m3543(m6170(), 0, 8, 1238));
        this.delegate = snVar;
    }

    /* JADX INFO: renamed from: ۟۠ۢۧۨ, reason: not valid java name and contains not printable characters */
    public static short[] m6170() {
        if (C0182.m7528() <= 0) {
            return f431short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۤ۟, reason: not valid java name and contains not printable characters */
    public static sn m6171(Object obj) {
        if (C0204.m8270() < 0) {
            return ((p9) obj).delegate;
        }
        return null;
    }

    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name */
    public final sn m6172deprecated_delegate() {
        return m6171(this);
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sn, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        C0095.m3482(m6171(this));
    }

    public final sn delegate() {
        return m6171(this);
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sn, java.io.Flushable
    public void flush() throws IOException {
        C0201.m8222(m6171(this));
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sn
    public up timeout() {
        return C0072.m2889(m6171(this));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        C0235.m9501(sb, C0191.m7795(C0112.m4080(this)));
        C0230.m9172(sb, '(');
        C0004.m132(sb, m6171(this));
        C0230.m9172(sb, ')');
        return C0009.m261(sb);
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sn
    public void write(s2 s2Var, long j) throws IOException {
        C0215.m8639(s2Var, C0219.m8780(m6170(), 8, 6, 1898));
        C0201.m8173(m6171(this), s2Var, j);
    }
}
