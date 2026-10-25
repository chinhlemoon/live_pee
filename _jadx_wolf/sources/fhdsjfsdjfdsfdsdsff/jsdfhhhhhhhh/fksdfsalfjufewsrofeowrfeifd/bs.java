package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import androidx.appcompat.app.C0037;
import androidx.core.graphics.drawable.C0065;
import androidx.emoji2.text.C0079;
import androidx.fragment.app.C0096;
import androidx.profileinstaller.C0120;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0133;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.proxy.C0211;

/* JADX INFO: loaded from: classes.dex */
public abstract class bs {
    public final Map<String, Object> xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = new HashMap();
    public final Set<Closeable> xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = new LinkedHashSet();

    public static void xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(Object obj) {
        if (obj instanceof Closeable) {
            try {
                C0211.m8384((Closeable) obj);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final void xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa() {
        Map mapM2417 = C0065.m2417(this);
        if (mapM2417 != null) {
            synchronized (mapM2417) {
                Iterator itM5078 = C0128.m5078(C0181.m7422(C0065.m2417(this)));
                while (C0164.m6913(itM5078)) {
                    C0037.m1402(C0120.m4679(itM5078));
                }
            }
        }
        Set setM3127 = C0079.m3127(this);
        if (setM3127 != null) {
            synchronized (setM3127) {
                Iterator itM3528 = C0096.m3528(C0079.m3127(this));
                while (C0164.m6913(itM3528)) {
                    C0037.m1402((Closeable) C0120.m4679(itM3528));
                }
            }
        }
        C0133.m5223(this);
    }

    public <T> T xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(String str) {
        T t;
        Map mapM2417 = C0065.m2417(this);
        if (mapM2417 == null) {
            return null;
        }
        synchronized (mapM2417) {
            t = (T) C0161.m6770(C0065.m2417(this), str);
        }
        return t;
    }

    public void xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa() {
    }
}
