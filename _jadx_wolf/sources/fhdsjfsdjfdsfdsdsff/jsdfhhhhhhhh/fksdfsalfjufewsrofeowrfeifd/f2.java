package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.support.v4.app.C0002;
import android.support.v4.app.C0004;
import android.support.v4.graphics.drawable.C0009;
import androidx.activity.C0021;
import androidx.annotation.C0023;
import androidx.annotation.C0024;
import androidx.annotation.C0025;
import androidx.appcompat.app.C0034;
import androidx.appcompat.app.C0035;
import androidx.appcompat.app.C0036;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0051;
import androidx.core.app.C0052;
import androidx.core.app.C0053;
import androidx.core.graphics.drawable.C0065;
import androidx.core.widget.C0068;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0072;
import androidx.emoji2.text.C0079;
import androidx.emoji2.text.C0083;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0095;
import androidx.fragment.app.C0096;
import androidx.fragment.app.C0099;
import androidx.lifecycle.C0107;
import androidx.lifecycle.C0108;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0116;
import androidx.savedstate.C0122;
import androidx.savedstate.C0123;
import androidx.savedstate.C0126;
import androidx.savedstate.C0127;
import androidx.versionedparcelable.C0135;
import java.io.IOException;
import java.io.InterruptedIOException;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.logging.C0230;
import okhttp3.logging.C0231;
import okhttp3.logging.C0232;
import okhttp3.logging.C0233;
import okhttp3.logging.C0235;
import retrofit2.http.C0249;

/* JADX INFO: loaded from: classes.dex */
public class f2 extends up {
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static f2 head;
    private boolean inQueue;
    private f2 next;
    private long timeoutAt;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f266short = {637, 582, 586, 585, 580, 585, 582, 587, 589, 588, 520, 589, 582, 604, 589, 602, 519, 589, 592, 577, 604, 1002, 1015, 1011, 1019, 1009, 1003, 1002, 1651, 1641, 1646, 1643, 3084, 3088, 3082, 3085, 3100, 3098, 1040, 1054, 1053, 1041, 1049};
    public static final xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa Companion = new xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(null);

    public static final class xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa {
        public xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa() {
        }

        public /* synthetic */ xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(t6 t6Var) {
            this();
        }

        public final void xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(f2 f2Var, long j, boolean z) {
            synchronized (f2.class) {
                if (C0161.m6737() == null) {
                    C0072.m2887(new f2());
                    C0096.m3551(new xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa());
                }
                long jM1964 = C0053.m1964();
                if (j != 0 && z) {
                    C0127.m4957(f2Var, C0069.m2734(j, C0107.m3895(f2Var) - jM1964) + jM1964);
                } else if (j != 0) {
                    C0127.m4957(f2Var, jM1964 + j);
                } else {
                    if (!z) {
                        throw new AssertionError();
                    }
                    C0127.m4957(f2Var, C0107.m3895(f2Var));
                }
                long jM1723 = C0049.m1723(f2Var, jM1964);
                f2 f2VarM6737 = C0161.m6737();
                C0021.m725(f2VarM6737);
                while (C0079.m3090(f2VarM6737) != null) {
                    f2 f2VarM3090 = C0079.m3090(f2VarM6737);
                    C0021.m725(f2VarM3090);
                    if (jM1723 < C0049.m1723(f2VarM3090, jM1964)) {
                        break;
                    }
                    f2 f2VarM3091 = C0079.m3090(f2VarM6737);
                    C0021.m725(f2VarM3091);
                    f2VarM6737 = f2VarM3091;
                }
                C0051.m1818(f2Var, C0079.m3090(f2VarM6737));
                C0051.m1818(f2VarM6737, f2Var);
                if (f2VarM6737 == C0161.m6737()) {
                    C0233.m9399(f2.class);
                }
                C0052.m1880();
            }
        }

        public final f2 xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa() throws InterruptedException {
            f2 f2VarM6737 = C0161.m6737();
            C0021.m725(f2VarM6737);
            f2 f2VarM3090 = C0079.m3090(f2VarM6737);
            if (f2VarM3090 == null) {
                long jM1964 = C0053.m1964();
                C0231.m9266(f2.class, C0021.m715());
                f2 f2VarM6738 = C0161.m6737();
                C0021.m725(f2VarM6738);
                if (C0079.m3090(f2VarM6738) != null || C0053.m1964() - jM1964 < C0035.m1308()) {
                    return null;
                }
                return C0161.m6737();
            }
            long jM1723 = C0049.m1723(f2VarM3090, C0053.m1964());
            if (jM1723 > 0) {
                long j = jM1723 / 1000000;
                C0083.m3200(f2.class, j, (int) (jM1723 - (1000000 * j)));
                return null;
            }
            f2 f2VarM6739 = C0161.m6737();
            C0021.m725(f2VarM6739);
            C0051.m1818(f2VarM6739, C0079.m3090(f2VarM3090));
            C0051.m1818(f2VarM3090, null);
            return f2VarM3090;
        }

        public final boolean xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(f2 f2Var) {
            synchronized (f2.class) {
                for (f2 f2VarM6737 = C0161.m6737(); f2VarM6737 != null; f2VarM6737 = C0079.m3090(f2VarM6737)) {
                    if (C0079.m3090(f2VarM6737) == f2Var) {
                        C0051.m1818(f2VarM6737, C0079.m3090(f2Var));
                        C0051.m1818(f2Var, null);
                        return false;
                    }
                }
                return true;
            }
        }
    }

    public static final class xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa extends Thread {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f267short = {1492, 1520, 1522, 1524, 1467, 1484, 1530, 1519, 1528, 1523, 1535, 1524, 1532};

        public xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa() {
            super(C0107.m3950(m5963(), 0, 13, 1435));
            C0095.m3526(this, true);
        }

        /* JADX INFO: renamed from: ۣۤ۠ۧ, reason: not valid java name and contains not printable characters */
        public static short[] m5963() {
            if (C0232.m9299() >= 0) {
                return f267short;
            }
            return null;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            f2 f2VarM5290;
            while (true) {
                try {
                    synchronized (f2.class) {
                        f2VarM5290 = C0135.m5290(C0107.m3966());
                        if (f2VarM5290 == C0161.m6737()) {
                            C0072.m2887(null);
                            return;
                        }
                        C0052.m1880();
                    }
                    if (f2VarM5290 != null) {
                        C0065.m2422(f2VarM5290);
                    }
                } catch (InterruptedException e) {
                }
            }
        }
    }

    public static final class xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa implements sn {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f268short = {985, 1003, 993, 1014, 1019, 972, 1009, 1013, 1021, 1015, 1005, 1004, 950, 1003, 1009, 1014, 1011, 944, 983, 971, 977, 982, 967, 961};
        public final /* synthetic */ sn xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;

        public xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(sn snVar) {
            this.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = snVar;
        }

        /* JADX INFO: renamed from: ۡۨۥۨ, reason: not valid java name and contains not printable characters */
        public static short[] m5964() {
            if (C0023.m843() > 0) {
                return f268short;
            }
            return null;
        }

        @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sn, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            f2 f2VarM4046 = C0108.m4046(this);
            C0023.m846(f2VarM4046);
            try {
                try {
                    C0095.m3482(C0123.m4813(this));
                    C0052.m1880();
                    if (C0051.m1852(f2VarM4046)) {
                        throw C0230.m9167(f2VarM4046, null);
                    }
                } catch (IOException e) {
                    if (!C0051.m1852(f2VarM4046)) {
                        throw e;
                    }
                    throw C0230.m9167(f2VarM4046, e);
                }
            } catch (Throwable th) {
                if (C0051.m1852(f2VarM4046) && 0 != 0) {
                    throw C0230.m9167(f2VarM4046, null);
                }
                throw th;
            }
        }

        @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sn, java.io.Flushable
        public void flush() throws IOException {
            f2 f2VarM4046 = C0108.m4046(this);
            C0023.m846(f2VarM4046);
            try {
                try {
                    C0201.m8222(C0123.m4813(this));
                    C0052.m1880();
                    if (C0051.m1852(f2VarM4046)) {
                        throw C0230.m9167(f2VarM4046, null);
                    }
                } catch (IOException e) {
                    if (!C0051.m1852(f2VarM4046)) {
                        throw e;
                    }
                    throw C0230.m9167(f2VarM4046, e);
                }
            } catch (Throwable th) {
                if (C0051.m1852(f2VarM4046) && 0 != 0) {
                    throw C0230.m9167(f2VarM4046, null);
                }
                throw th;
            }
        }

        @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sn
        public /* bridge */ /* synthetic */ up timeout() {
            return C0036.m1361(this);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            C0235.m9501(sb, C0099.m3720(m5964(), 0, 18, 920));
            C0004.m132(sb, C0123.m4813(this));
            C0230.m9172(sb, ')');
            return C0009.m261(sb);
        }

        @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sn
        public void write(s2 s2Var, long j) throws IOException {
            long jM8100;
            C0215.m8639(s2Var, C0201.m8180(m5964(), 18, 6, 932));
            C0123.m4790(C0123.m4769(s2Var), 0L, j);
            for (long j2 = j; j2 > 0; j2 -= jM8100) {
                jM8100 = 0;
                dn dnVarM4727 = C0122.m4727(s2Var);
                C0021.m725(dnVarM4727);
                while (jM8100 < f2.TIMEOUT_WRITE_SIZE) {
                    jM8100 += (long) (C0200.m8100(dnVarM4727) - C0034.m1169(dnVarM4727));
                    if (jM8100 >= j2) {
                        jM8100 = j2;
                        break;
                    } else {
                        dn dnVarM102 = C0004.m102(dnVarM4727);
                        C0021.m725(dnVarM102);
                        dnVarM4727 = dnVarM102;
                    }
                }
                f2 f2VarM4046 = C0108.m4046(this);
                C0023.m846(f2VarM4046);
                try {
                    try {
                        C0201.m8173(C0123.m4813(this), s2Var, jM8100);
                        C0052.m1880();
                        if (C0051.m1852(f2VarM4046)) {
                            throw C0230.m9167(f2VarM4046, null);
                        }
                    } catch (IOException e) {
                        if (!C0051.m1852(f2VarM4046)) {
                            throw e;
                        }
                        throw C0230.m9167(f2VarM4046, e);
                    }
                } catch (Throwable th) {
                    if (C0051.m1852(f2VarM4046) && 0 != 0) {
                        throw C0230.m9167(f2VarM4046, null);
                    }
                    throw th;
                }
            }
        }

        public f2 xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa() {
            return C0108.m4046(this);
        }
    }

    public static final class xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa implements un {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f269short = {902, 924, 923, 926, 946, 896, 906, 925, 912, 935, 922, 926, 918, 924, 902, 903, 989, 896, 924, 902, 897, 912, 918, 987};
        public final /* synthetic */ un xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;

        public xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(un unVar) {
            this.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = unVar;
        }

        /* JADX INFO: renamed from: ۟ۡۥۥۣ, reason: not valid java name and contains not printable characters */
        public static short[] m5965() {
            if (C0034.m1206() <= 0) {
                return f269short;
            }
            return null;
        }

        @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            f2 f2VarM4728 = C0122.m4728(this);
            C0023.m846(f2VarM4728);
            try {
                try {
                    C0161.m6805(C0135.m5309(this));
                    C0052.m1880();
                    if (C0051.m1852(f2VarM4728)) {
                        throw C0230.m9167(f2VarM4728, null);
                    }
                } catch (IOException e) {
                    if (!C0051.m1852(f2VarM4728)) {
                        throw e;
                    }
                    throw C0230.m9167(f2VarM4728, e);
                }
            } catch (Throwable th) {
                if (C0051.m1852(f2VarM4728) && 0 != 0) {
                    throw C0230.m9167(f2VarM4728, null);
                }
                throw th;
            }
        }

        @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un
        public long read(s2 s2Var, long j) throws IOException {
            C0215.m8639(s2Var, C0002.m62(m5965(), 0, 4, 1013));
            f2 f2VarM4728 = C0122.m4728(this);
            C0023.m846(f2VarM4728);
            try {
                try {
                    long jM8026 = C0199.m8026(C0135.m5309(this), s2Var, j);
                    if (C0051.m1852(f2VarM4728)) {
                        throw C0230.m9167(f2VarM4728, null);
                    }
                    return jM8026;
                } catch (IOException e) {
                    if (C0051.m1852(f2VarM4728)) {
                        throw C0230.m9167(f2VarM4728, e);
                    }
                    throw e;
                }
            } catch (Throwable th) {
                if (!C0051.m1852(f2VarM4728) || 0 == 0) {
                    throw th;
                }
                throw C0230.m9167(f2VarM4728, null);
            }
        }

        @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un
        public /* bridge */ /* synthetic */ up timeout() {
            return C0200.m8128(this);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            C0235.m9501(sb, C0202.m8243(m5965(), 4, 20, 1011));
            C0004.m132(sb, C0135.m5309(this));
            C0230.m9172(sb, ')');
            return C0009.m261(sb);
        }

        public f2 xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa() {
            return C0122.m4728(this);
        }
    }

    static {
        long jM8473 = C0213.m8473(C0024.m906(), 60L);
        IDLE_TIMEOUT_MILLIS = jM8473;
        IDLE_TIMEOUT_NANOS = C0115.m4217(C0200.m8063(), jM8473);
    }

    private final long remainingNanos(long j) {
        return m5958(this) - j;
    }

    /* JADX INFO: renamed from: ۟۟ۥۨ۟, reason: not valid java name and contains not printable characters */
    public static long m5955(Object obj, long j) {
        if (C0049.m1767() <= 0) {
            return ((f2) obj).remainingNanos(j);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡۦۣۥ, reason: not valid java name and contains not printable characters */
    public static long m5956() {
        if (C0099.m3752() <= 0) {
            return IDLE_TIMEOUT_MILLIS;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۤۤۤ, reason: not valid java name and contains not printable characters */
    public static long m5957() {
        if (C0176.m7290() > 0) {
            return IDLE_TIMEOUT_NANOS;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static long m5958(Object obj) {
        if (C0021.m740() < 0) {
            return ((f2) obj).timeoutAt;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۥۦ۟, reason: not valid java name and contains not printable characters */
    public static short[] m5959() {
        if (C0126.m4908() < 0) {
            return f266short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۦۢ, reason: not valid java name and contains not printable characters */
    public static f2 m5960() {
        if (C0068.m2650() >= 0) {
            return head;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۦۥ, reason: not valid java name and contains not printable characters */
    public static boolean m5961(Object obj) {
        if (C0164.m6900() <= 0) {
            return ((f2) obj).inQueue;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨۨۥ, reason: not valid java name and contains not printable characters */
    public static f2 m5962(Object obj) {
        if (C0249.m10052() < 0) {
            return ((f2) obj).next;
        }
        return null;
    }

    public final IOException access$newTimeoutException(IOException iOException) {
        return C0093.m3316(this, iOException);
    }

    public final void enter() {
        if (!(!m5961(this))) {
            throw new IllegalStateException(C0172.m7197(C0083.m3182(m5959(), 0, 21, 552)));
        }
        long jM8083 = C0200.m8083(this);
        boolean zM8440 = C0213.m8440(this);
        if (jM8083 != 0 || zM8440) {
            this.inQueue = true;
            C0176.m7287(C0107.m3966(), this, jM8083, zM8440);
        }
    }

    public final boolean exit() {
        if (!m5961(this)) {
            return false;
        }
        this.inQueue = false;
        return C0025.m968(C0107.m3966(), this);
    }

    public IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException(C0107.m3950(m5959(), 21, 7, 926));
        if (iOException != null) {
            C0068.m2669(interruptedIOException, iOException);
        }
        return interruptedIOException;
    }

    public final sn sink(sn snVar) {
        C0215.m8639(snVar, C0116.m4308(m5959(), 28, 4, 1536));
        return new xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(snVar);
    }

    public final un source(un unVar) {
        C0215.m8639(unVar, C0213.m8457(m5959(), 32, 6, 3199));
        return new xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(unVar);
    }

    public void timedOut() {
    }

    public final <T> T withTimeout(fa<? extends T> faVar) throws IOException {
        C0215.m8639(faVar, C0009.m259(m5959(), 38, 5, 1138));
        C0023.m846(this);
        try {
            try {
                T t = (T) C0099.m3749(faVar);
                C0191.m7757();
                if (C0051.m1852(this)) {
                    throw C0230.m9167(this, null);
                }
                C0034.m1227();
                return t;
            } catch (IOException e) {
                if (C0051.m1852(this)) {
                    throw C0230.m9167(this, e);
                }
                throw e;
            }
        } catch (Throwable th) {
            C0191.m7757();
            if (C0051.m1852(this) && 0 != 0) {
                throw C0230.m9167(this, null);
            }
            C0034.m1227();
            throw th;
        }
    }
}
