package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import androidx.appcompat.app.C0034;
import androidx.appcompat.view.menu.C0040;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0051;
import androidx.core.app.C0052;
import androidx.emoji2.text.C0079;
import androidx.fragment.app.C0097;
import androidx.lifecycle.C0106;
import okhttp3.C0240;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.io.C0199;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.ws.C0224;
import okhttp3.logging.C0235;

/* JADX INFO: loaded from: classes.dex */
public final class bf extends a6 implements Runnable, c7 {
    public final uf<Runnable> a;
    public final Object b;
    private volatile int runningWorkers;
    public final a6 xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
    public final int xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
    public final /* synthetic */ c7 xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;

    /* JADX WARN: Multi-variable type inference failed */
    public bf(a6 a6Var, int i) {
        this.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = a6Var;
        this.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = i;
        c7 c7Var = a6Var instanceof c7 ? (c7) a6Var : null;
        this.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = c7Var == null ? C0079.m3097() : c7Var;
        this.a = new uf<>(false);
        this.b = new Object();
    }

    /* JADX INFO: renamed from: ۣۤۤۧ, reason: not valid java name and contains not printable characters */
    public static int m5896(Object obj) {
        if (C0079.m3072() <= 0) {
            return ((bf) obj).runningWorkers;
        }
        return 0;
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a6
    public void P(y5 y5Var, Runnable runnable) {
        if (C0211.m8414(this, runnable) || !C0199.m8027(this)) {
            return;
        }
        C0217.m8659(C0224.m8874(this), this, this);
    }

    public final boolean S(Runnable runnable) {
        C0034.m1178(C0049.m1734(this), runnable);
        return m5896(this) >= C0097.m3610(this);
    }

    public final boolean T() {
        synchronized (C0240.m9819(this)) {
            if (m5896(this) >= C0097.m3610(this)) {
                return false;
            }
            this.runningWorkers = m5896(this) + 1;
            return true;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = 0;
        while (true) {
            Runnable runnable = (Runnable) C0178.m7358(C0049.m1734(this));
            if (runnable != null) {
                try {
                    C0051.m1800(runnable);
                } catch (Throwable th) {
                    C0106.m3820(C0235.m9523(), th);
                }
                i++;
                if (i >= 16 && C0169.m6999(C0224.m8874(this), this)) {
                    C0217.m8659(C0224.m8874(this), this, this);
                    return;
                }
            } else {
                synchronized (C0240.m9819(this)) {
                    this.runningWorkers = m5896(this) - 1;
                    if (C0040.m1581(C0049.m1734(this)) == 0) {
                        return;
                    }
                    this.runningWorkers = m5896(this) + 1;
                    i = 0;
                    C0052.m1880();
                }
            }
        }
    }
}
