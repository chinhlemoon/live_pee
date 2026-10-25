package okhttp3.internal.platform.android;

import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes.dex */
public interface SocketAdapter {
    void configureTlsExtensions(SSLSocket sSLSocket, String str, List<? extends Protocol> list);

    String getSelectedProtocol(SSLSocket sSLSocket);

    boolean isSupported();

    boolean matchesSocket(SSLSocket sSLSocket);

    boolean matchesSocketFactory(SSLSocketFactory sSLSocketFactory);

    X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory);

    public static final class DefaultImpls {
        public static X509TrustManager trustManager(SocketAdapter $this, SSLSocketFactory sslSocketFactory) {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(sslSocketFactory, "sslSocketFactory");
            return null;
        }

        public static boolean matchesSocketFactory(SocketAdapter $this, SSLSocketFactory sslSocketFactory) {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(sslSocketFactory, "sslSocketFactory");
            return false;
        }
    }
}
