package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.support.v4.app.C0006;
import androidx.core.graphics.drawable.C0064;
import androidx.core.widget.C0069;
import java.util.concurrent.atomic.AtomicReferenceArray;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.platform.android.C0200;

/* JADX INFO: loaded from: classes.dex */
public final class em<T> {
    private volatile AtomicReferenceArray<T> array;

    public em(int i) {
        this.array = new AtomicReferenceArray<>(i);
    }

    /* JADX INFO: renamed from: ۟ۤۨۥ۠, reason: not valid java name and contains not printable characters */
    public static AtomicReferenceArray m5949(Object obj) {
        if (C0200.m8104() < 0) {
            return ((em) obj).array;
        }
        return null;
    }

    public final int xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa() {
        return C0069.m2704(m5949(this));
    }

    public final T xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(int i) {
        AtomicReferenceArray atomicReferenceArrayM5949 = m5949(this);
        if (i < C0069.m2704(atomicReferenceArrayM5949)) {
            return (T) C0064.m2359(atomicReferenceArrayM5949, i);
        }
        return null;
    }

    public final void xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(int i, T t) {
        AtomicReferenceArray atomicReferenceArrayM5949 = m5949(this);
        int iM2704 = C0069.m2704(atomicReferenceArrayM5949);
        if (i < iM2704) {
            C0006.m233(atomicReferenceArrayM5949, i, t);
            return;
        }
        AtomicReferenceArray<T> atomicReferenceArray = new AtomicReferenceArray<>(C0164.m6956(i + 1, iM2704 * 2));
        for (int i2 = 0; i2 < iM2704; i2++) {
            C0006.m233(atomicReferenceArray, i2, C0064.m2359(atomicReferenceArrayM5949, i2));
        }
        C0006.m233(atomicReferenceArray, i, t);
        this.array = atomicReferenceArray;
    }
}
