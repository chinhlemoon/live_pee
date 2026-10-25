package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.support.v4.app.C0002;
import androidx.core.graphics.drawable.C0062;
import androidx.profileinstaller.C0119;
import java.lang.reflect.Method;
import okhttp3.C0239;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.io.C0195;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.ws.C0224;
import okhttp3.logging.C0230;
import okhttp3.logging.C0234;
import retrofit2.http.C0249;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa implements b6 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f294short = {848, 850, 835, 866, 857, 852, 854, 834, 848, 863, 835, 882, 847, 852, 850, 839, 835, 862, 856, 857, 871, 837, 850, 895, 854, 857, 851, 859, 850, 837};
    private volatile Object _preHandler;

    public h0() {
        super(C0188.m7682());
        this._preHandler = this;
    }

    /* JADX INFO: renamed from: ۣ۟۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static Object m5993(Object obj) {
        if (C0149.m6476() < 0) {
            return ((h0) obj)._preHandler;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۢ۠, reason: not valid java name and contains not printable characters */
    public static short[] m5994() {
        if (C0249.m10052() <= 0) {
            return f294short;
        }
        return null;
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.b6
    public void B(y5 y5Var, Throwable th) {
        int iM27 = C0002.m27();
        if (26 <= iM27 && iM27 < 28) {
            Method methodM7947 = C0195.m7947(this);
            Object objM8721 = methodM7947 != null ? C0218.m8721(methodM7947, null, new Object[0]) : null;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = objM8721 instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) objM8721 : null;
            if (uncaughtExceptionHandler != null) {
                C0234.m9459(uncaughtExceptionHandler, C0062.m2307(), th);
            }
        }
    }

    public final Method P() {
        Object objM5993 = m5993(this);
        if (objM5993 != this) {
            return (Method) objM5993;
        }
        Method method = null;
        try {
            boolean z = false;
            Method methodM9794 = C0239.m9794(Thread.class, C0195.m7915(m5994(), 0, 30, 823), new Class[0]);
            if (C0224.m8913(C0119.m4540(methodM9794)) && C0230.m9143(C0119.m4540(methodM9794))) {
                z = true;
            }
            if (z) {
                method = methodM9794;
            }
        } catch (Throwable th) {
        }
        this._preHandler = method;
        return method;
    }
}
