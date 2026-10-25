package okhttp3.internal.ws;

import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ko;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t6;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes.dex */
public final class WebSocketExtensions {
    public static final Companion Companion = new Companion(null);
    private static final String HEADER_WEB_SOCKET_EXTENSION = "Sec-WebSocket-Extensions";
    public final Integer clientMaxWindowBits;
    public final boolean clientNoContextTakeover;
    public final boolean perMessageDeflate;
    public final Integer serverMaxWindowBits;
    public final boolean serverNoContextTakeover;
    public final boolean unknownValues;

    public WebSocketExtensions() {
        this(false, null, false, null, false, false, 63, null);
    }

    public static /* synthetic */ WebSocketExtensions copy$default(WebSocketExtensions webSocketExtensions, boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = webSocketExtensions.perMessageDeflate;
        }
        if ((i & 2) != 0) {
            num = webSocketExtensions.clientMaxWindowBits;
        }
        Integer num3 = num;
        if ((i & 4) != 0) {
            z2 = webSocketExtensions.clientNoContextTakeover;
        }
        boolean z5 = z2;
        if ((i & 8) != 0) {
            num2 = webSocketExtensions.serverMaxWindowBits;
        }
        Integer num4 = num2;
        if ((i & 16) != 0) {
            z3 = webSocketExtensions.serverNoContextTakeover;
        }
        boolean z6 = z3;
        if ((i & 32) != 0) {
            z4 = webSocketExtensions.unknownValues;
        }
        return webSocketExtensions.copy(z, num3, z5, num4, z6, z4);
    }

    public final boolean component1() {
        return this.perMessageDeflate;
    }

    public final Integer component2() {
        return this.clientMaxWindowBits;
    }

    public final boolean component3() {
        return this.clientNoContextTakeover;
    }

    public final Integer component4() {
        return this.serverMaxWindowBits;
    }

    public final boolean component5() {
        return this.serverNoContextTakeover;
    }

    public final boolean component6() {
        return this.unknownValues;
    }

    public final WebSocketExtensions copy(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4) {
        return new WebSocketExtensions(z, num, z2, num2, z3, z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSocketExtensions)) {
            return false;
        }
        WebSocketExtensions webSocketExtensions = (WebSocketExtensions) obj;
        return this.perMessageDeflate == webSocketExtensions.perMessageDeflate && jd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(this.clientMaxWindowBits, webSocketExtensions.clientMaxWindowBits) && this.clientNoContextTakeover == webSocketExtensions.clientNoContextTakeover && jd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(this.serverMaxWindowBits, webSocketExtensions.serverMaxWindowBits) && this.serverNoContextTakeover == webSocketExtensions.serverNoContextTakeover && this.unknownValues == webSocketExtensions.unknownValues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public int hashCode() {
        boolean z = this.perMessageDeflate;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Integer num = this.clientMaxWindowBits;
        int iHashCode = (i + (num != null ? num.hashCode() : 0)) * 31;
        boolean z2 = this.clientNoContextTakeover;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (iHashCode + r2) * 31;
        Integer num2 = this.serverMaxWindowBits;
        int iHashCode2 = (i2 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z3 = this.serverNoContextTakeover;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i3 = (iHashCode2 + r3) * 31;
        boolean z4 = this.unknownValues;
        return i3 + (z4 ? 1 : z4);
    }

    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.perMessageDeflate + ", clientMaxWindowBits=" + this.clientMaxWindowBits + ", clientNoContextTakeover=" + this.clientNoContextTakeover + ", serverMaxWindowBits=" + this.serverMaxWindowBits + ", serverNoContextTakeover=" + this.serverNoContextTakeover + ", unknownValues=" + this.unknownValues + ")";
    }

    public WebSocketExtensions(boolean perMessageDeflate, Integer clientMaxWindowBits, boolean clientNoContextTakeover, Integer serverMaxWindowBits, boolean serverNoContextTakeover, boolean unknownValues) {
        this.perMessageDeflate = perMessageDeflate;
        this.clientMaxWindowBits = clientMaxWindowBits;
        this.clientNoContextTakeover = clientNoContextTakeover;
        this.serverMaxWindowBits = serverMaxWindowBits;
        this.serverNoContextTakeover = serverNoContextTakeover;
        this.unknownValues = unknownValues;
    }

    public /* synthetic */ WebSocketExtensions(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4, int i, t6 t6Var) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? false : z2, (i & 8) == 0 ? num2 : null, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4);
    }

    public final boolean noContextTakeover(boolean clientOriginated) {
        if (clientOriginated) {
            return this.clientNoContextTakeover;
        }
        return this.serverNoContextTakeover;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(t6 $constructor_marker) {
            this();
        }

        public final WebSocketExtensions parse(Headers responseHeaders) throws IOException {
            boolean unexpectedValues;
            Headers headers = responseHeaders;
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(headers, "responseHeaders");
            boolean compressionEnabled = false;
            Integer clientMaxWindowBits = null;
            boolean clientNoContextTakeover = false;
            Integer serverMaxWindowBits = null;
            boolean serverNoContextTakeover = false;
            boolean unexpectedValues2 = false;
            int size = responseHeaders.size();
            int i = 0;
            while (i < size) {
                boolean z = true;
                if (lo.d(headers.name(i), WebSocketExtensions.HEADER_WEB_SOCKET_EXTENSION, true)) {
                    String header = headers.value(i);
                    int pos = 0;
                    while (pos < header.length()) {
                        int extensionEnd = Util.delimiterOffset$default(header, ',', pos, 0, 4, (Object) null);
                        int extensionTokenEnd = Util.delimiterOffset(header, ';', pos, extensionEnd);
                        String extensionToken = Util.trimSubstring(header, pos, extensionTokenEnd);
                        pos = extensionTokenEnd + 1;
                        if (lo.d(extensionToken, "permessage-deflate", z)) {
                            if (compressionEnabled) {
                                unexpectedValues2 = true;
                            }
                            compressionEnabled = true;
                            while (pos < extensionEnd) {
                                int parameterEnd = Util.delimiterOffset(header, ';', pos, extensionEnd);
                                int equals = Util.delimiterOffset(header, '=', pos, parameterEnd);
                                String name = Util.trimSubstring(header, pos, equals);
                                String value = equals < parameterEnd ? mo.W(Util.trimSubstring(header, equals + 1, parameterEnd), "\"") : null;
                                pos = parameterEnd + 1;
                                boolean unexpectedValues3 = unexpectedValues2;
                                if (lo.d(name, "client_max_window_bits", true)) {
                                    boolean unexpectedValues4 = clientMaxWindowBits != null ? true : unexpectedValues3;
                                    Integer clientMaxWindowBits2 = value != null ? ko.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(value) : null;
                                    if (clientMaxWindowBits2 == null) {
                                        clientMaxWindowBits = clientMaxWindowBits2;
                                        unexpectedValues = true;
                                    } else {
                                        clientMaxWindowBits = clientMaxWindowBits2;
                                        unexpectedValues = unexpectedValues4;
                                    }
                                } else if (lo.d(name, "client_no_context_takeover", true)) {
                                    boolean unexpectedValues5 = clientNoContextTakeover ? true : unexpectedValues3;
                                    if (value != null) {
                                        unexpectedValues5 = true;
                                    }
                                    clientNoContextTakeover = true;
                                    unexpectedValues = unexpectedValues5;
                                } else if (lo.d(name, "server_max_window_bits", true)) {
                                    boolean unexpectedValues6 = serverMaxWindowBits != null ? true : unexpectedValues3;
                                    Integer serverMaxWindowBits2 = value != null ? ko.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(value) : null;
                                    if (serverMaxWindowBits2 == null) {
                                        serverMaxWindowBits = serverMaxWindowBits2;
                                        unexpectedValues = true;
                                    } else {
                                        serverMaxWindowBits = serverMaxWindowBits2;
                                        unexpectedValues = unexpectedValues6;
                                    }
                                } else if (lo.d(name, "server_no_context_takeover", true)) {
                                    unexpectedValues = serverNoContextTakeover ? true : unexpectedValues3;
                                    if (value != null) {
                                        unexpectedValues = true;
                                    }
                                    serverNoContextTakeover = true;
                                } else {
                                    unexpectedValues = true;
                                }
                                unexpectedValues2 = unexpectedValues;
                                compressionEnabled = compressionEnabled;
                                extensionToken = extensionToken;
                            }
                            unexpectedValues2 = unexpectedValues2;
                        } else {
                            unexpectedValues2 = true;
                        }
                        z = true;
                    }
                }
                i++;
                headers = responseHeaders;
            }
            return new WebSocketExtensions(compressionEnabled, clientMaxWindowBits, clientNoContextTakeover, serverMaxWindowBits, serverNoContextTakeover, unexpectedValues2);
        }
    }
}
