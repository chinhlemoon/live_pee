package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.support.v4.graphics.drawable.C0009;
import androidx.core.app.C0053;
import androidx.core.graphics.drawable.C0065;
import com.example.vcam.C0141;
import java.io.Writer;
import okhttp3.internal.platform.android.C0200;
import okhttp3.logging.C0230;

/* JADX INFO: loaded from: classes.dex */
public final class wf extends Writer {
    public StringBuilder xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = new StringBuilder(128);
    public final String xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;

    public wf(String str) {
        this.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = str;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C0148.m6473(this);
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        C0148.m6473(this);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                C0148.m6473(this);
            } else {
                C0230.m9172(C0141.m5790(this), c);
            }
        }
    }

    public final void xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa() {
        if (C0200.m8087(C0141.m5790(this)) > 0) {
            C0053.m1980(this);
            C0009.m261(C0141.m5790(this));
            StringBuilder sbM5790 = C0141.m5790(this);
            C0065.m2420(sbM5790, 0, C0200.m8087(sbM5790));
        }
    }
}
