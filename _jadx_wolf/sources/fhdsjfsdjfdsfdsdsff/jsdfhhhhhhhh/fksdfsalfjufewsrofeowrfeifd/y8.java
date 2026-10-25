package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.os.Handler;
import android.support.v4.app.C0004;
import android.support.v4.graphics.drawable.C0009;
import androidx.annotation.C0023;
import androidx.annotation.C0024;
import androidx.core.graphics.drawable.C0065;
import androidx.core.widget.C0069;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import okhttp3.logging.C0235;

/* JADX INFO: loaded from: classes.dex */
public final class y8 {

    public static class xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa implements Executor {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f582short = {3170, 3115, 3121, 3170, 3121, 3114, 3127, 3126, 3126, 3115, 3116, 3109, 3170, 3110, 3117, 3125, 3116};
        public final Handler xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;

        public xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(Handler handler) {
            C0065.m2473(handler);
            this.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = handler;
        }

        /* JADX INFO: renamed from: ۤۥ۟ۦ, reason: not valid java name and contains not printable characters */
        public static short[] m6376() {
            if (C0023.m843() >= 0) {
                return f582short;
            }
            return null;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            Handler handlerM2748 = C0069.m2748(this);
            C0065.m2473(runnable);
            if (C0065.m2467(handlerM2748, runnable)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            C0004.m132(sb, C0069.m2748(this));
            C0235.m9501(sb, C0024.m897(m6376(), 0, 17, 3138));
            throw new RejectedExecutionException(C0009.m261(sb));
        }
    }

    public static Executor xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(Handler handler) {
        return new xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(handler);
    }
}
