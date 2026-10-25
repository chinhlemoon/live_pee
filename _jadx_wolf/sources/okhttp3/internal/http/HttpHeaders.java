package okhttp3.internal.http;

import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.og;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes.dex */
public final class HttpHeaders {
    private static final a3 QUOTED_STRING_DELIMITERS;
    private static final a3 TOKEN_DELIMITERS;

    static {
        a3.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaVar = a3.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        QUOTED_STRING_DELIMITERS = xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaVar.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa("\"\\");
        TOKEN_DELIMITERS = xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaVar.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa("\t ,=");
    }

    public static final List<Challenge> parseChallenges(Headers $this$parseChallenges, String headerName) {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa($this$parseChallenges, "$this$parseChallenges");
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(headerName, "headerName");
        List result = new ArrayList();
        int size = $this$parseChallenges.size();
        for (int h = 0; h < size; h++) {
            if (lo.d(headerName, $this$parseChallenges.name(h), true)) {
                s2 header = new s2().r0($this$parseChallenges.value(h));
                try {
                    readChallengeHeader(header, result);
                } catch (EOFException e) {
                    Platform.Companion.get().log("Unable to parse challenge", 5, e);
                }
            }
        }
        return result;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0093  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:59:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0089 A[EDGE_INSN: B:67:0x0089->B:29:0x0089 BREAK  A[LOOP:1: B:23:0x0076->B:68:0x0076], SYNTHETIC] */
    private static final void readChallengeHeader(s2 $this$readChallengeHeader, List<Challenge> list) throws EOFException {
        String parameterValue;
        String replaced;
        String peek = null;
        while (true) {
            if (peek == null) {
                skipCommasAndWhitespace($this$readChallengeHeader);
                peek = readToken($this$readChallengeHeader);
                if (peek == null) {
                    return;
                }
            }
            String schemeName = peek;
            boolean commaPrefixed = skipCommasAndWhitespace($this$readChallengeHeader);
            peek = readToken($this$readChallengeHeader);
            if (peek == null) {
                if ($this$readChallengeHeader.E()) {
                    list.add(new Challenge(schemeName, (Map<String, String>) og.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa()));
                    return;
                }
                return;
            }
            byte b = (byte) 61;
            int eqCount = Util.skipAll($this$readChallengeHeader, b);
            boolean commaSuffixed = skipCommasAndWhitespace($this$readChallengeHeader);
            if (!commaPrefixed && (commaSuffixed || $this$readChallengeHeader.E())) {
                Map mapSingletonMap = Collections.singletonMap(null, peek + lo.i("=", eqCount));
                jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(mapSingletonMap, "Collections.singletonMap…ek + \"=\".repeat(eqCount))");
                list.add(new Challenge(schemeName, (Map<String, String>) mapSingletonMap));
                peek = null;
            } else {
                Map parameters = new LinkedHashMap();
                int eqCount2 = eqCount + Util.skipAll($this$readChallengeHeader, b);
                while (true) {
                    if (peek == null) {
                        peek = readToken($this$readChallengeHeader);
                        if (skipCommasAndWhitespace($this$readChallengeHeader)) {
                            break;
                        }
                        eqCount2 = Util.skipAll($this$readChallengeHeader, b);
                        if (eqCount2 == 0) {
                            break;
                        }
                        if (eqCount2 <= 1 || skipCommasAndWhitespace($this$readChallengeHeader)) {
                            return;
                        }
                        if (startsWith($this$readChallengeHeader, (byte) 34)) {
                            parameterValue = readQuotedString($this$readChallengeHeader);
                        } else {
                            parameterValue = readToken($this$readChallengeHeader);
                        }
                        if (parameterValue != null) {
                            return;
                        }
                        replaced = (String) parameters.put(peek, parameterValue);
                        peek = null;
                        if (replaced != null) {
                            return;
                        }
                        if (skipCommasAndWhitespace($this$readChallengeHeader) && !$this$readChallengeHeader.E()) {
                            return;
                        }
                    } else {
                        if (eqCount2 == 0) {
                            break;
                            break;
                        }
                        if (eqCount2 <= 1) {
                            return;
                        }
                        if (startsWith($this$readChallengeHeader, (byte) 34)) {
                            parameterValue = readQuotedString($this$readChallengeHeader);
                        } else {
                            parameterValue = readToken($this$readChallengeHeader);
                        }
                        if (parameterValue != null) {
                            return;
                        }
                        replaced = (String) parameters.put(peek, parameterValue);
                        peek = null;
                        if (replaced != null) {
                            return;
                        } else {
                            if (skipCommasAndWhitespace($this$readChallengeHeader)) {
                            }
                        }
                    }
                }
                list.add(new Challenge(schemeName, (Map<String, String>) parameters));
            }
        }
    }

    private static final boolean skipCommasAndWhitespace(s2 $this$skipCommasAndWhitespace) throws EOFException {
        boolean commaFound = false;
        while (!$this$skipCommasAndWhitespace.E()) {
            switch ($this$skipCommasAndWhitespace.x(0L)) {
                case 9:
                case 32:
                    $this$skipCommasAndWhitespace.L();
                    break;
                case 44:
                    $this$skipCommasAndWhitespace.L();
                    commaFound = true;
                    break;
                default:
                    return commaFound;
            }
        }
        return commaFound;
    }

    private static final boolean startsWith(s2 $this$startsWith, byte prefix) {
        return !$this$startsWith.E() && $this$startsWith.x(0L) == prefix;
    }

    private static final String readQuotedString(s2 $this$readQuotedString) throws EOFException {
        byte b = (byte) 34;
        if (!($this$readQuotedString.L() == b)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        s2 result = new s2();
        while (true) {
            long i = $this$readQuotedString.M(QUOTED_STRING_DELIMITERS);
            if (i == -1) {
                return null;
            }
            if ($this$readQuotedString.x(i) == b) {
                result.write($this$readQuotedString, i);
                $this$readQuotedString.L();
                return result.X();
            }
            if ($this$readQuotedString.b0() == i + 1) {
                return null;
            }
            result.write($this$readQuotedString, i);
            $this$readQuotedString.L();
            result.write($this$readQuotedString, 1L);
        }
    }

    private static final String readToken(s2 $this$readToken) {
        long tokenSize = $this$readToken.M(TOKEN_DELIMITERS);
        if (tokenSize == -1) {
            tokenSize = $this$readToken.b0();
        }
        if (tokenSize != 0) {
            return $this$readToken.Y(tokenSize);
        }
        return null;
    }

    public static final void receiveHeaders(CookieJar $this$receiveHeaders, HttpUrl url, Headers headers) {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa($this$receiveHeaders, "$this$receiveHeaders");
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(url, "url");
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(headers, "headers");
        if ($this$receiveHeaders == CookieJar.NO_COOKIES) {
            return;
        }
        List<Cookie> all = Cookie.Companion.parseAll(url, headers);
        if (all.isEmpty()) {
            return;
        }
        $this$receiveHeaders.saveFromResponse(url, all);
    }

    public static final boolean promisesBody(Response $this$promisesBody) {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa($this$promisesBody, "$this$promisesBody");
        if (jd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa($this$promisesBody.request().method(), "HEAD")) {
            return false;
        }
        int responseCode = $this$promisesBody.code();
        return (((responseCode >= 100 && responseCode < 200) || responseCode == 204 || responseCode == 304) && Util.headersContentLength($this$promisesBody) == -1 && !lo.d("chunked", Response.header$default($this$promisesBody, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    public static final boolean hasBody(Response response) {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(response, "response");
        return promisesBody(response);
    }
}
