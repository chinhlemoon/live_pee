package okhttp3.internal.http1;

import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v2;
import java.io.IOException;
import okhttp3.Headers;

/* JADX INFO: loaded from: classes.dex */
public final class HeadersReader {
    public static final Companion Companion = new Companion(null);
    private static final int HEADER_LIMIT = 262144;
    private long headerLimit;
    private final v2 source;

    public HeadersReader(v2 source) {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(source, "source");
        this.source = source;
        this.headerLimit = HEADER_LIMIT;
    }

    public final v2 getSource() {
        return this.source;
    }

    public final String readLine() throws IOException {
        String line = this.source.i(this.headerLimit);
        this.headerLimit -= (long) line.length();
        return line;
    }

    public final Headers readHeaders() throws IOException {
        Headers.Builder result = new Headers.Builder();
        while (true) {
            String line = readLine();
            if (!(line.length() == 0)) {
                result.addLenient$okhttp(line);
            } else {
                return result.build();
            }
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(t6 $constructor_marker) {
            this();
        }
    }
}
