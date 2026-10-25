package okhttp3;

import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.re;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.te;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ue;
import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes.dex */
public final class Handshake {
    public static final Companion Companion = new Companion(null);
    private final CipherSuite cipherSuite;
    private final List<Certificate> localCertificates;
    private final te peerCertificates$delegate;
    private final TlsVersion tlsVersion;

    public static final Handshake get(SSLSession sSLSession) throws IOException {
        return Companion.get(sSLSession);
    }

    public static final Handshake get(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> list, List<? extends Certificate> list2) {
        return Companion.get(tlsVersion, cipherSuite, list, list2);
    }

    public final List<Certificate> peerCertificates() {
        return (List) this.peerCertificates$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Handshake(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> list, fa<? extends List<? extends Certificate>> faVar) {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(tlsVersion, "tlsVersion");
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(cipherSuite, "cipherSuite");
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(list, "localCertificates");
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(faVar, "peerCertificatesFn");
        this.tlsVersion = tlsVersion;
        this.cipherSuite = cipherSuite;
        this.localCertificates = list;
        this.peerCertificates$delegate = ue.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(new AnonymousClass2(faVar));
    }

    public final TlsVersion tlsVersion() {
        return this.tlsVersion;
    }

    public final CipherSuite cipherSuite() {
        return this.cipherSuite;
    }

    public final List<Certificate> localCertificates() {
        return this.localCertificates;
    }

    /* JADX INFO: renamed from: okhttp3.Handshake$peerCertificates$2, reason: invalid class name */
    public static final class AnonymousClass2 extends re implements fa<List<? extends Certificate>> {
        public final /* synthetic */ fa $peerCertificatesFn;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(fa faVar) {
            super(0);
            this.$peerCertificatesFn = faVar;
        }

        @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fa
        public final List<? extends Certificate> invoke() {
            try {
                return (List) this.$peerCertificatesFn.invoke();
            } catch (SSLPeerUnverifiedException e) {
                return d4.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
            }
        }
    }

    /* JADX INFO: renamed from: -deprecated_tlsVersion, reason: not valid java name */
    public final TlsVersion m6630deprecated_tlsVersion() {
        return this.tlsVersion;
    }

    /* JADX INFO: renamed from: -deprecated_cipherSuite, reason: not valid java name */
    public final CipherSuite m6625deprecated_cipherSuite() {
        return this.cipherSuite;
    }

    /* JADX INFO: renamed from: -deprecated_peerCertificates, reason: not valid java name */
    public final List<Certificate> m6628deprecated_peerCertificates() {
        return peerCertificates();
    }

    public final Principal peerPrincipal() {
        Object objO = l4.o(peerCertificates());
        if (!(objO instanceof X509Certificate)) {
            objO = null;
        }
        X509Certificate x509Certificate = (X509Certificate) objO;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    /* JADX INFO: renamed from: -deprecated_peerPrincipal, reason: not valid java name */
    public final Principal m6629deprecated_peerPrincipal() {
        return peerPrincipal();
    }

    /* JADX INFO: renamed from: -deprecated_localCertificates, reason: not valid java name */
    public final List<Certificate> m6626deprecated_localCertificates() {
        return this.localCertificates;
    }

    public final Principal localPrincipal() {
        Object objO = l4.o(this.localCertificates);
        if (!(objO instanceof X509Certificate)) {
            objO = null;
        }
        X509Certificate x509Certificate = (X509Certificate) objO;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    /* JADX INFO: renamed from: -deprecated_localPrincipal, reason: not valid java name */
    public final Principal m6627deprecated_localPrincipal() {
        return localPrincipal();
    }

    public boolean equals(Object other) {
        return (other instanceof Handshake) && ((Handshake) other).tlsVersion == this.tlsVersion && jd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(((Handshake) other).cipherSuite, this.cipherSuite) && jd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(((Handshake) other).peerCertificates(), peerCertificates()) && jd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(((Handshake) other).localCertificates, this.localCertificates);
    }

    public int hashCode() {
        int result = (17 * 31) + this.tlsVersion.hashCode();
        return (((((result * 31) + this.cipherSuite.hashCode()) * 31) + peerCertificates().hashCode()) * 31) + this.localCertificates.hashCode();
    }

    public String toString() {
        Iterable $this$map$iv = peerCertificates();
        Collection destination$iv$iv = new ArrayList(e4.g($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            Certificate it = (Certificate) item$iv$iv;
            destination$iv$iv.add(getName(it));
        }
        String peerCertificatesString = destination$iv$iv.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{");
        sb.append("tlsVersion=");
        sb.append(this.tlsVersion);
        sb.append(' ');
        sb.append("cipherSuite=");
        sb.append(this.cipherSuite);
        sb.append(' ');
        sb.append("peerCertificates=");
        sb.append(peerCertificatesString);
        sb.append(' ');
        sb.append("localCertificates=");
        Iterable $this$map$iv2 = this.localCertificates;
        Collection destination$iv$iv2 = new ArrayList(e4.g($this$map$iv2, 10));
        for (Object item$iv$iv2 : $this$map$iv2) {
            Certificate it2 = (Certificate) item$iv$iv2;
            destination$iv$iv2.add(getName(it2));
        }
        sb.append(destination$iv$iv2);
        sb.append('}');
        return sb.toString();
    }

    private final String getName(Certificate $this$name) {
        if ($this$name instanceof X509Certificate) {
            return ((X509Certificate) $this$name).getSubjectDN().toString();
        }
        String type = $this$name.getType();
        jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(type, "type");
        return type;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(t6 $constructor_marker) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        
            if (r0.equals("TLS_NULL_WITH_NULL_NULL") == false) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
        
            throw new java.io.IOException("cipherSuite == " + r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            if (r0.equals("SSL_NULL_WITH_NULL_NULL") == false) goto L15;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Handshake get(SSLSession $this$handshake) throws IOException {
            List<Certificate> listXadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa($this$handshake, "$this$handshake");
            String cipherSuiteString = $this$handshake.getCipherSuite();
            if (cipherSuiteString == null) {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
            switch (cipherSuiteString.hashCode()) {
                case 1019404634:
                    break;
                case 1208658923:
                    break;
            }
            CipherSuite cipherSuite = CipherSuite.Companion.forJavaName(cipherSuiteString);
            String tlsVersionString = $this$handshake.getProtocol();
            if (tlsVersionString == null) {
                throw new IllegalStateException("tlsVersion == null".toString());
            }
            if (jd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa("NONE", tlsVersionString)) {
                throw new IOException("tlsVersion == NONE");
            }
            TlsVersion tlsVersion = TlsVersion.Companion.forJavaName(tlsVersionString);
            try {
                listXadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = toImmutableList($this$handshake.getPeerCertificates());
            } catch (SSLPeerUnverifiedException e) {
                listXadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = d4.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
            }
            return new Handshake(tlsVersion, cipherSuite, toImmutableList($this$handshake.getLocalCertificates()), new Handshake$Companion$handshake$1(listXadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa));
        }

        private final List<Certificate> toImmutableList(Certificate[] $this$toImmutableList) {
            if ($this$toImmutableList != null) {
                return Util.immutableListOf((Certificate[]) Arrays.copyOf($this$toImmutableList, $this$toImmutableList.length));
            }
            return d4.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }

        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final Handshake m6631deprecated_get(SSLSession sslSession) throws IOException {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(sslSession, "sslSession");
            return get(sslSession);
        }

        public final Handshake get(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> list, List<? extends Certificate> list2) {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(tlsVersion, "tlsVersion");
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(cipherSuite, "cipherSuite");
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(list, "peerCertificates");
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(list2, "localCertificates");
            List peerCertificatesCopy = Util.toImmutableList(list);
            return new Handshake(tlsVersion, cipherSuite, Util.toImmutableList(list2), new Handshake$Companion$get$1(peerCertificatesCopy));
        }
    }
}
