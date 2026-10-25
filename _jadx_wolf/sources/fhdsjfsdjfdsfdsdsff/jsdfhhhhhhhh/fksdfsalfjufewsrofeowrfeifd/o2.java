package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.support.v4.app.C0004;
import android.support.v4.graphics.drawable.C0009;
import android.support.v4.graphics.drawable.C0011;
import androidx.activity.C0020;
import androidx.activity.C0021;
import androidx.annotation.C0025;
import androidx.appcompat.app.C0036;
import androidx.appcompat.app.C0037;
import androidx.core.content.C0057;
import androidx.core.content.C0058;
import androidx.core.widget.C0069;
import androidx.emoji2.text.C0083;
import androidx.fragment.app.C0094;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0126;
import androidx.versionedparcelable.C0135;
import com.example.vcam.C0141;
import java.io.Serializable;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.logging.C0235;

/* JADX INFO: loaded from: classes.dex */
public abstract class o2 implements t5<Object>, h6, Serializable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f414short = {2596, 2600, 2602, 2615, 2603, 2594, 2611, 2606, 2600, 2601, 966, 983, 960, 964, 977, 960, 909, 998, 970, 971, 977, 972, 971, 976, 964, 977, 972, 970, 971, 908, 901, 973, 964, 982, 901, 971, 970, 977, 901, 967, 960, 960, 971, 901, 970, 979, 960, 983, 983, 972, 961, 961, 960, 971, 535, 539, 537, 516, 536, 529, 512, 541, 539, 538, 2438, 2455, 2432, 2436, 2449, 2432, 2509, 2468, 2443, 2460, 2522, 2526, 2470, 2442, 2443, 2449, 2444, 2443, 2448, 2436, 2449, 2444, 2442, 2443, 2508, 2501, 2445, 2436, 2454, 2501, 2443, 2442, 2449, 2501, 2439, 2432, 2432, 2443, 2501, 2442, 2451, 2432, 2455, 2455, 2444, 2433, 2433, 2432, 2443, 1091, 1135, 1134, 1140, 1129, 1134, 1141, 1121, 1140, 1129, 1135, 1134, 1056, 1121, 1140, 1056};
    private final t5<Object> completion;

    public o2(t5<Object> t5Var) {
        this.completion = t5Var;
    }

    /* JADX INFO: renamed from: ۟ۥۨۤۤ, reason: not valid java name and contains not printable characters */
    public static short[] m6152() {
        if (C0094.m3450() > 0) {
            return f414short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥ۟ۦ, reason: not valid java name and contains not printable characters */
    public static t5 m6153(Object obj) {
        if (C0011.m458() > 0) {
            return ((o2) obj).completion;
        }
        return null;
    }

    public t5<hr> create(t5<?> t5Var) {
        C0215.m8639(t5Var, C0181.m7457(m6152(), 0, 10, 2631));
        throw new UnsupportedOperationException(C0141.m5774(m6152(), 10, 44, 933));
    }

    public t5<hr> create(Object obj, t5<?> t5Var) {
        C0215.m8639(t5Var, C0083.m3182(m6152(), 54, 10, 628));
        throw new UnsupportedOperationException(C0037.m1459(m6152(), 64, 49, 2533));
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h6
    public h6 getCallerFrame() {
        t5 t5VarM6153 = m6153(this);
        if (t5VarM6153 instanceof h6) {
            return (h6) t5VarM6153;
        }
        return null;
    }

    public final t5<Object> getCompletion() {
        return m6153(this);
    }

    public StackTraceElement getStackTraceElement() {
        return C0126.m4888(this);
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t5
    public final void resumeWith(Object obj) {
        Object objM975;
        t5 t5Var = this;
        Object obj2 = obj;
        while (true) {
            C0058.m2155(t5Var);
            o2 o2Var = (o2) t5Var;
            t5 t5VarM6153 = m6153(o2Var);
            C0021.m725(t5VarM6153);
            try {
                objM975 = C0025.m975(o2Var, obj2);
                if (objM975 == C0120.m4653()) {
                    return;
                }
                C0135.m5348();
                C0069.m2719(objM975);
            } catch (Throwable th) {
                C0135.m5348();
                Object objM697 = C0020.m697(th);
                C0069.m2719(objM697);
                objM975 = objM697;
            }
            C0181.m7475(o2Var);
            if (!(t5VarM6153 instanceof o2)) {
                C0112.m4085(t5VarM6153, objM975);
                return;
            } else {
                t5Var = t5VarM6153;
                obj2 = objM975;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        C0235.m9501(sb, C0057.m2101(m6152(), 113, 16, 1024));
        Object objM1355 = C0036.m1355(this);
        if (objM1355 == null) {
            objM1355 = C0201.m8189(C0112.m4080(this));
        }
        C0004.m132(sb, objM1355);
        return C0009.m261(sb);
    }
}
