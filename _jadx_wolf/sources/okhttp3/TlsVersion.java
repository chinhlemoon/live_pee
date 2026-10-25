package okhttp3;

import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t6;

/* JADX INFO: loaded from: classes.dex */
public enum TlsVersion {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");

    public static final Companion Companion = new Companion(null);
    private final String javaName;

    public static final TlsVersion forJavaName(String str) {
        return Companion.forJavaName(str);
    }

    TlsVersion(String javaName) {
        this.javaName = javaName;
    }

    public final String javaName() {
        return this.javaName;
    }

    /* JADX INFO: renamed from: -deprecated_javaName, reason: not valid java name */
    public final String m6717deprecated_javaName() {
        return this.javaName;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(t6 $constructor_marker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final TlsVersion forJavaName(String javaName) {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(javaName, "javaName");
            switch (javaName.hashCode()) {
                case -503070503:
                    if (javaName.equals("TLSv1.1")) {
                        return TlsVersion.TLS_1_1;
                    }
                    break;
                case -503070502:
                    if (javaName.equals("TLSv1.2")) {
                        return TlsVersion.TLS_1_2;
                    }
                    break;
                case -503070501:
                    if (javaName.equals("TLSv1.3")) {
                        return TlsVersion.TLS_1_3;
                    }
                    break;
                case 79201641:
                    if (javaName.equals("SSLv3")) {
                        return TlsVersion.SSL_3_0;
                    }
                    break;
                case 79923350:
                    if (javaName.equals("TLSv1")) {
                        return TlsVersion.TLS_1_0;
                    }
                    break;
            }
            throw new IllegalArgumentException("Unexpected TLS version: " + javaName);
        }
    }
}
