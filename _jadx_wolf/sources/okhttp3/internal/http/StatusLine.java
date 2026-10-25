package okhttp3.internal.http;

import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t6;
import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Response;

/* JADX INFO: loaded from: classes.dex */
public final class StatusLine {
    public static final Companion Companion = new Companion(null);
    public static final int HTTP_CONTINUE = 100;
    public static final int HTTP_MISDIRECTED_REQUEST = 421;
    public static final int HTTP_PERM_REDIRECT = 308;
    public static final int HTTP_TEMP_REDIRECT = 307;
    public final int code;
    public final String message;
    public final Protocol protocol;

    public StatusLine(Protocol protocol, int code, String message) {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(protocol, "protocol");
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(message, "message");
        this.protocol = protocol;
        this.code = code;
        this.message = message;
    }

    public String toString() {
        StringBuilder $this$buildString = new StringBuilder();
        if (this.protocol == Protocol.HTTP_1_0) {
            $this$buildString.append("HTTP/1.0");
        } else {
            $this$buildString.append("HTTP/1.1");
        }
        $this$buildString.append(' ');
        $this$buildString.append(this.code);
        $this$buildString.append(' ');
        $this$buildString.append(this.message);
        String string = $this$buildString.toString();
        jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(t6 $constructor_marker) {
            this();
        }

        public final StatusLine get(Response response) {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(response, "response");
            return new StatusLine(response.protocol(), response.code(), response.message());
        }

        public final StatusLine parse(String statusLine) throws IOException {
            Protocol protocol;
            int codeStart;
            Protocol protocol2;
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(statusLine, "statusLine");
            if (lo.q(statusLine, "HTTP/1.", false, 2)) {
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                int httpMinorVersion = statusLine.charAt(7) - '0';
                codeStart = 9;
                if (httpMinorVersion == 0) {
                    protocol2 = Protocol.HTTP_1_0;
                } else if (httpMinorVersion == 1) {
                    protocol2 = Protocol.HTTP_1_1;
                } else {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                protocol = protocol2;
            } else if (lo.q(statusLine, "ICY ", false, 2)) {
                protocol = Protocol.HTTP_1_0;
                codeStart = 4;
            } else {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
            if (statusLine.length() < codeStart + 3) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
            try {
                String strSubstring = statusLine.substring(codeStart, codeStart + 3);
                jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                int code = Integer.parseInt(strSubstring);
                String message = HttpUrl.FRAGMENT_ENCODE_SET;
                if (statusLine.length() > codeStart + 3) {
                    if (statusLine.charAt(codeStart + 3) != ' ') {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                    String strSubstring2 = statusLine.substring(codeStart + 4);
                    jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(strSubstring2, "(this as java.lang.String).substring(startIndex)");
                    message = strSubstring2;
                }
                return new StatusLine(protocol, code, message);
            } catch (NumberFormatException e) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
        }
    }
}
