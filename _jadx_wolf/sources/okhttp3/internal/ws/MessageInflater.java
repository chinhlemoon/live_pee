package okhttp3.internal.ws;

import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class MessageInflater implements Closeable {
    private final s2 deflatedBytes;
    private final Inflater inflater;
    private final uc inflaterSource;
    private final boolean noContextTakeover;

    public MessageInflater(boolean noContextTakeover) {
        this.noContextTakeover = noContextTakeover;
        s2 s2Var = new s2();
        this.deflatedBytes = s2Var;
        Inflater inflater = new Inflater(true);
        this.inflater = inflater;
        this.inflaterSource = new uc((un) s2Var, inflater);
    }

    public final void inflate(s2 buffer) throws IOException {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(buffer, "buffer");
        if (!(this.deflatedBytes.b0() == 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.noContextTakeover) {
            this.inflater.reset();
        }
        this.deflatedBytes.o(buffer);
        this.deflatedBytes.m0(Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        long totalBytesToRead = this.inflater.getBytesRead() + this.deflatedBytes.b0();
        do {
            this.inflaterSource.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(buffer, Long.MAX_VALUE);
        } while (this.inflater.getBytesRead() < totalBytesToRead);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.inflaterSource.close();
    }
}
