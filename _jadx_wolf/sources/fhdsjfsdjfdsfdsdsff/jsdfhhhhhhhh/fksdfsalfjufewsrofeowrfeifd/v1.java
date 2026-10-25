package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.support.v4.app.C0006;
import androidx.annotation.C0023;
import androidx.core.widget.C0068;
import androidx.fragment.app.C0099;
import java.util.Iterator;
import java.util.NoSuchElementException;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0215;

/* JADX INFO: loaded from: classes.dex */
public final class v1<T> implements Iterator<T>, fe {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f526short = {2298, 2281, 2281, 2298, 2274, 2722, 2717, 2696, 2719, 2700, 2713, 2692, 2690, 2691, 2765, 2692, 2718, 2765, 2691, 2690, 2713, 2765, 2718, 2712, 2717, 2717, 2690, 2719, 2713, 2696, 2697, 2765, 2699, 2690, 2719, 2765, 2719, 2696, 2700, 2697, 2752, 2690, 2691, 2689, 2708, 2765, 2702, 2690, 2689, 2689, 2696, 2702, 2713, 2692, 2690, 2691};
    public int xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
    public final T[] xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;

    public v1(T[] tArr) {
        C0215.m8639(tArr, C0099.m3720(m6299(), 0, 5, 2203));
        this.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = tArr;
    }

    /* JADX INFO: renamed from: ۟ۧۤ۠۟, reason: not valid java name and contains not printable characters */
    public static short[] m6299() {
        if (C0164.m6900() <= 0) {
            return f526short;
        }
        return null;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return C0068.m2657(this) < C0213.m8430(this).length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            Object[] objArrM8430 = C0213.m8430(this);
            int iM2657 = C0068.m2657(this);
            this.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = iM2657 + 1;
            return (T) objArrM8430[iM2657];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = C0068.m2657(this) - 1;
            throw new NoSuchElementException(C0006.m170(e));
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException(C0023.m823(m6299(), 5, 51, 2797));
    }
}
