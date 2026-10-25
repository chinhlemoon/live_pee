package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.support.v4.app.C0002;
import android.support.v4.graphics.drawable.C0009;
import androidx.activity.C0021;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0066;
import androidx.profileinstaller.C0113;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.platform.android.C0202;

/* JADX INFO: loaded from: classes.dex */
public abstract class u5 extends o2 {
    private final y5 _context;
    private transient t5<Object> intercepted;

    public u5(t5<Object> t5Var) {
        this(t5Var, t5Var != null ? C0113.m4192(t5Var) : null);
    }

    public u5(t5<Object> t5Var, y5 y5Var) {
        super(t5Var);
        this._context = y5Var;
    }

    /* JADX INFO: renamed from: ۣۤۤ۠, reason: not valid java name and contains not printable characters */
    public static t5 m6267(Object obj) {
        if (C0202.m8245() >= 0) {
            return ((u5) obj).intercepted;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۡ۠, reason: not valid java name and contains not printable characters */
    public static y5 m6268(Object obj) {
        if (C0176.m7290() > 0) {
            return ((u5) obj)._context;
        }
        return null;
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t5
    public y5 getContext() {
        y5 y5VarM6268 = m6268(this);
        C0021.m725(y5VarM6268);
        return y5VarM6268;
    }

    public final t5<Object> intercepted() {
        t5<Object> t5VarM6267 = m6267(this);
        if (t5VarM6267 == null) {
            v5 v5Var = (v5) C0002.m8(C0066.m2560(this), C0062.m2247());
            if (v5Var == null || (t5VarM6267 = C0009.m301(v5Var, this)) == null) {
                t5VarM6267 = this;
            }
            this.intercepted = t5VarM6267;
        }
        return t5VarM6267;
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o2
    public void releaseIntercepted() {
        t5 t5VarM6267 = m6267(this);
        if (t5VarM6267 != null && t5VarM6267 != this) {
            y5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaVarM8 = C0002.m8(C0066.m2560(this), C0062.m2247());
            C0021.m725(xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaVarM8);
            C0002.m54((v5) xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaVarM8, t5VarM6267);
        }
        this.intercepted = C0178.m7379();
    }
}
