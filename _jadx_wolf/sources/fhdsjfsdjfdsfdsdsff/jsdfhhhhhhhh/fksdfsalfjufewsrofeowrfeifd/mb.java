package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.C0002;
import android.view.Choreographer;
import androidx.activity.C0020;
import androidx.appcompat.app.C0036;
import androidx.core.content.C0057;
import androidx.core.widget.C0068;
import androidx.core.widget.C0069;
import androidx.emoji2.text.C0083;
import androidx.versionedparcelable.C0135;
import okhttp3.C0239;
import okhttp3.internal.C0227;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.publicsuffix.C0218;

/* JADX INFO: loaded from: classes.dex */
public final class mb {
    private static volatile Choreographer choreographer;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f381short = {1635, 1650, 1637, 1633, 1652, 1637, 1601, 1651, 1657, 1646, 1635, 2780, 2759, 2782, 2782, 2706, 2769, 2771, 2780, 2780, 2781, 2758, 2706, 2768, 2775, 2706, 2769, 2771, 2753, 2758, 2706, 2758, 2781, 2706, 2780, 2781, 2780, 2719, 2780, 2759, 2782, 2782, 2706, 2758, 2763, 2754, 2775, 2706, 2771, 2780, 2774, 2752, 2781, 2779, 2774, 2716, 2781, 2753, 2716, 2810, 2771, 2780, 2774, 2782, 2775, 2752};

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Object objM697;
        Object[] objArr = 0;
        try {
            C0135.m5348();
            objM697 = new kb(C0083.m3208(C0227.m9043(), true), (String) (objArr == true ? 1 : 0), 2);
            C0069.m2719(objM697);
        } catch (Throwable th) {
            C0135.m5348();
            objM697 = C0020.m697(th);
            C0069.m2719(objM697);
        }
    }

    public static final Handler xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(Looper looper, boolean z) {
        if (!z) {
            return new Handler(looper);
        }
        if (C0002.m27() < 28) {
            try {
                return (Handler) C0036.m1374(C0057.m2131(Handler.class, new Class[]{Looper.class, Handler.Callback.class, C0083.m3184()}), new Object[]{looper, null, C0068.m2619(true)});
            } catch (NoSuchMethodException e) {
                return new Handler(looper);
            }
        }
        Object objM8721 = C0218.m8721(C0239.m9794(Handler.class, C0172.m7173(m6114(), 0, 11, 1536), new Class[]{Looper.class}), null, new Object[]{looper});
        if (objM8721 != null) {
            return (Handler) objM8721;
        }
        throw new NullPointerException(C0194.m7874(m6114(), 11, 55, 2738));
    }

    /* JADX INFO: renamed from: ۠۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static short[] m6114() {
        if (C0200.m8104() <= 0) {
            return f381short;
        }
        return null;
    }
}
