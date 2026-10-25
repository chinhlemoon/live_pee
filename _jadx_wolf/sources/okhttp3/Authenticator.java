package okhttp3;

import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t6;
import java.io.IOException;
import okhttp3.internal.authenticator.JavaNetAuthenticator;

/* JADX INFO: loaded from: classes.dex */
public interface Authenticator {
    public static final Companion Companion = new Companion(null);
    public static final Authenticator NONE = new Companion.AuthenticatorNone();
    public static final Authenticator JAVA_NET_AUTHENTICATOR = new JavaNetAuthenticator(null, 1, null);

    Request authenticate(Route route, Response response) throws IOException;

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = null;

        private Companion() {
        }

        public /* synthetic */ Companion(t6 $constructor_marker) {
            this();
        }

        public static final class AuthenticatorNone implements Authenticator {
            @Override // okhttp3.Authenticator
            public Request authenticate(Route route, Response response) {
                jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(response, "response");
                return null;
            }
        }
    }
}
