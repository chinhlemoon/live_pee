package okhttp3;

import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.w5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes.dex */
public final class Cookie {
    private final String domain;
    private final long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;
    private final String name;
    private final String path;
    private final boolean persistent;
    private final boolean secure;
    private final String value;
    public static final Companion Companion = new Companion(null);
    private static final Pattern YEAR_PATTERN = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern MONTH_PATTERN = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern DAY_OF_MONTH_PATTERN = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern TIME_PATTERN = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    public static final Cookie parse(HttpUrl httpUrl, String str) {
        return Companion.parse(httpUrl, str);
    }

    public static final List<Cookie> parseAll(HttpUrl httpUrl, Headers headers) {
        return Companion.parseAll(httpUrl, headers);
    }

    private Cookie(String name, String value, long expiresAt, String domain, String path, boolean secure, boolean httpOnly, boolean persistent, boolean hostOnly) {
        this.name = name;
        this.value = value;
        this.expiresAt = expiresAt;
        this.domain = domain;
        this.path = path;
        this.secure = secure;
        this.httpOnly = httpOnly;
        this.persistent = persistent;
        this.hostOnly = hostOnly;
    }

    public /* synthetic */ Cookie(String name, String value, long expiresAt, String domain, String path, boolean secure, boolean httpOnly, boolean persistent, boolean hostOnly, t6 $constructor_marker) {
        this(name, value, expiresAt, domain, path, secure, httpOnly, persistent, hostOnly);
    }

    public final String name() {
        return this.name;
    }

    public final String value() {
        return this.value;
    }

    public final long expiresAt() {
        return this.expiresAt;
    }

    public final String domain() {
        return this.domain;
    }

    public final String path() {
        return this.path;
    }

    public final boolean secure() {
        return this.secure;
    }

    public final boolean httpOnly() {
        return this.httpOnly;
    }

    public final boolean persistent() {
        return this.persistent;
    }

    public final boolean hostOnly() {
        return this.hostOnly;
    }

    public final boolean matches(HttpUrl url) {
        boolean domainMatch;
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(url, "url");
        if (this.hostOnly) {
            domainMatch = jd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(url.host(), this.domain);
        } else {
            domainMatch = Companion.domainMatch(url.host(), this.domain);
        }
        if (domainMatch && Companion.pathMatch(url, this.path)) {
            return !this.secure || url.isHttps();
        }
        return false;
    }

    public boolean equals(Object other) {
        return (other instanceof Cookie) && jd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(((Cookie) other).name, this.name) && jd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(((Cookie) other).value, this.value) && ((Cookie) other).expiresAt == this.expiresAt && jd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(((Cookie) other).domain, this.domain) && jd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(((Cookie) other).path, this.path) && ((Cookie) other).secure == this.secure && ((Cookie) other).httpOnly == this.httpOnly && ((Cookie) other).persistent == this.persistent && ((Cookie) other).hostOnly == this.hostOnly;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        int result = (17 * 31) + this.name.hashCode();
        return (((((((((((((((result * 31) + this.value.hashCode()) * 31) + w5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(this.expiresAt)) * 31) + this.domain.hashCode()) * 31) + this.path.hashCode()) * 31) + x5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(this.secure)) * 31) + x5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(this.httpOnly)) * 31) + x5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(this.persistent)) * 31) + x5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(this.hostOnly);
    }

    public String toString() {
        return toString$okhttp(false);
    }

    /* JADX INFO: renamed from: -deprecated_name, reason: not valid java name */
    public final String m6618deprecated_name() {
        return this.name;
    }

    /* JADX INFO: renamed from: -deprecated_value, reason: not valid java name */
    public final String m6622deprecated_value() {
        return this.value;
    }

    /* JADX INFO: renamed from: -deprecated_persistent, reason: not valid java name */
    public final boolean m6620deprecated_persistent() {
        return this.persistent;
    }

    /* JADX INFO: renamed from: -deprecated_expiresAt, reason: not valid java name */
    public final long m6615deprecated_expiresAt() {
        return this.expiresAt;
    }

    /* JADX INFO: renamed from: -deprecated_hostOnly, reason: not valid java name */
    public final boolean m6616deprecated_hostOnly() {
        return this.hostOnly;
    }

    /* JADX INFO: renamed from: -deprecated_domain, reason: not valid java name */
    public final String m6614deprecated_domain() {
        return this.domain;
    }

    /* JADX INFO: renamed from: -deprecated_path, reason: not valid java name */
    public final String m6619deprecated_path() {
        return this.path;
    }

    /* JADX INFO: renamed from: -deprecated_httpOnly, reason: not valid java name */
    public final boolean m6617deprecated_httpOnly() {
        return this.httpOnly;
    }

    /* JADX INFO: renamed from: -deprecated_secure, reason: not valid java name */
    public final boolean m6621deprecated_secure() {
        return this.secure;
    }

    public final String toString$okhttp(boolean forObsoleteRfc2965) {
        StringBuilder $this$buildString = new StringBuilder();
        $this$buildString.append(this.name);
        $this$buildString.append('=');
        $this$buildString.append(this.value);
        if (this.persistent) {
            if (this.expiresAt == Long.MIN_VALUE) {
                $this$buildString.append("; max-age=0");
            } else {
                $this$buildString.append("; expires=");
                $this$buildString.append(DatesKt.toHttpDateString(new Date(this.expiresAt)));
            }
        }
        if (!this.hostOnly) {
            $this$buildString.append("; domain=");
            if (forObsoleteRfc2965) {
                $this$buildString.append(".");
            }
            $this$buildString.append(this.domain);
        }
        $this$buildString.append("; path=");
        $this$buildString.append(this.path);
        if (this.secure) {
            $this$buildString.append("; secure");
        }
        if (this.httpOnly) {
            $this$buildString.append("; httponly");
        }
        String string = $this$buildString.toString();
        jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(string, "toString()");
        return string;
    }

    public static final class Builder {
        private String domain;
        private boolean hostOnly;
        private boolean httpOnly;
        private String name;
        private boolean persistent;
        private boolean secure;
        private String value;
        private long expiresAt = DatesKt.MAX_DATE;
        private String path = "/";

        public final Builder name(String name) {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(name, "name");
            if (!jd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(mo.j0(name).toString(), name)) {
                throw new IllegalArgumentException("name is not trimmed".toString());
            }
            this.name = name;
            return this;
        }

        public final Builder value(String value) {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(value, "value");
            if (!jd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(mo.j0(value).toString(), value)) {
                throw new IllegalArgumentException("value is not trimmed".toString());
            }
            this.value = value;
            return this;
        }

        public final Builder expiresAt(long expiresAt) {
            long expiresAt2 = expiresAt;
            if (expiresAt2 <= 0) {
                expiresAt2 = Long.MIN_VALUE;
            }
            if (expiresAt2 > DatesKt.MAX_DATE) {
                expiresAt2 = DatesKt.MAX_DATE;
            }
            this.expiresAt = expiresAt2;
            this.persistent = true;
            return this;
        }

        public final Builder domain(String domain) {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(domain, "domain");
            return domain(domain, false);
        }

        public final Builder hostOnlyDomain(String domain) {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(domain, "domain");
            return domain(domain, true);
        }

        private final Builder domain(String domain, boolean hostOnly) {
            String canonicalDomain = HostnamesKt.toCanonicalHost(domain);
            if (canonicalDomain == null) {
                throw new IllegalArgumentException("unexpected domain: " + domain);
            }
            this.domain = canonicalDomain;
            this.hostOnly = hostOnly;
            return this;
        }

        public final Builder path(String path) {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(path, "path");
            if (!lo.q(path, "/", false, 2)) {
                throw new IllegalArgumentException("path must start with '/'".toString());
            }
            this.path = path;
            return this;
        }

        public final Builder secure() {
            this.secure = true;
            return this;
        }

        public final Builder httpOnly() {
            this.httpOnly = true;
            return this;
        }

        public final Cookie build() {
            String str = this.name;
            if (str == null) {
                throw new NullPointerException("builder.name == null");
            }
            String str2 = this.value;
            if (str2 == null) {
                throw new NullPointerException("builder.value == null");
            }
            long j = this.expiresAt;
            String str3 = this.domain;
            if (str3 != null) {
                return new Cookie(str, str2, j, str3, this.path, this.secure, this.httpOnly, this.persistent, this.hostOnly, null);
            }
            throw new NullPointerException("builder.domain == null");
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(t6 $constructor_marker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean domainMatch(String urlHost, String domain) {
            if (jd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(urlHost, domain)) {
                return true;
            }
            return lo.c(urlHost, domain, false, 2) && urlHost.charAt((urlHost.length() - domain.length()) - 1) == '.' && !Util.canParseAsIpAddress(urlHost);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean pathMatch(HttpUrl url, String path) {
            String urlPath = url.encodedPath();
            if (jd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(urlPath, path)) {
                return true;
            }
            return lo.q(urlPath, path, false, 2) && (lo.c(path, "/", false, 2) || urlPath.charAt(path.length()) == '/');
        }

        public final Cookie parse(HttpUrl url, String setCookie) {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(url, "url");
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(setCookie, "setCookie");
            return parse$okhttp(System.currentTimeMillis(), url, setCookie);
        }

        public final Cookie parse$okhttp(long currentTimeMillis, HttpUrl url, String setCookie) {
            long expiresAt;
            long deltaMilliseconds;
            String strTrimSubstring;
            int limit;
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(url, "url");
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(setCookie, "setCookie");
            int cookiePairEnd = Util.delimiterOffset$default(setCookie, ';', 0, 0, 6, (Object) null);
            int pairEqualsSign = Util.delimiterOffset$default(setCookie, '=', 0, cookiePairEnd, 2, (Object) null);
            if (pairEqualsSign == cookiePairEnd) {
                return null;
            }
            String cookieName = Util.trimSubstring$default(setCookie, 0, pairEqualsSign, 1, null);
            if (!(cookieName.length() == 0) && Util.indexOfControlOrNonAscii(cookieName) == -1) {
                String cookieValue = Util.trimSubstring(setCookie, pairEqualsSign + 1, cookiePairEnd);
                if (Util.indexOfControlOrNonAscii(cookieValue) != -1) {
                    return null;
                }
                int pos = cookiePairEnd + 1;
                long deltaSeconds = -1;
                boolean secureOnly = false;
                boolean httpOnly = false;
                boolean hostOnly = true;
                boolean persistent = false;
                int pos2 = pos;
                long expiresAt2 = 253402300799999L;
                String path = null;
                String domain = null;
                for (int limit2 = setCookie.length(); pos2 < limit2; limit2 = limit) {
                    int attributePairEnd = Util.delimiterOffset(setCookie, ';', pos2, limit2);
                    int attributeEqualsSign = Util.delimiterOffset(setCookie, '=', pos2, attributePairEnd);
                    String attributeName = Util.trimSubstring(setCookie, pos2, attributeEqualsSign);
                    if (attributeEqualsSign < attributePairEnd) {
                        strTrimSubstring = Util.trimSubstring(setCookie, attributeEqualsSign + 1, attributePairEnd);
                    } else {
                        strTrimSubstring = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    String attributeValue = strTrimSubstring;
                    int pairEqualsSign2 = pairEqualsSign;
                    if (lo.d(attributeName, "expires", true)) {
                        try {
                            limit = limit2;
                            try {
                                expiresAt2 = parseExpires(attributeValue, 0, attributeValue.length());
                                persistent = true;
                            } catch (IllegalArgumentException e) {
                            }
                        } catch (IllegalArgumentException e2) {
                            limit = limit2;
                        }
                    } else {
                        limit = limit2;
                        if (lo.d(attributeName, "max-age", true)) {
                            try {
                                long deltaSeconds2 = parseMaxAge(attributeValue);
                                persistent = true;
                                deltaSeconds = deltaSeconds2;
                            } catch (NumberFormatException e3) {
                            }
                        } else if (lo.d(attributeName, "domain", true)) {
                            try {
                                String domain2 = parseDomain(attributeValue);
                                domain = domain2;
                                hostOnly = false;
                            } catch (IllegalArgumentException e4) {
                            }
                        } else if (lo.d(attributeName, "path", true)) {
                            path = attributeValue;
                        } else if (lo.d(attributeName, "secure", true)) {
                            secureOnly = true;
                        } else if (lo.d(attributeName, "httponly", true)) {
                            httpOnly = true;
                        }
                    }
                    pos2 = attributePairEnd + 1;
                    pairEqualsSign = pairEqualsSign2;
                }
                if (deltaSeconds == Long.MIN_VALUE) {
                    expiresAt = Long.MIN_VALUE;
                } else if (deltaSeconds == -1) {
                    expiresAt = expiresAt2;
                } else {
                    if (deltaSeconds <= 9223372036854775L) {
                        deltaMilliseconds = ((long) 1000) * deltaSeconds;
                    } else {
                        deltaMilliseconds = Long.MAX_VALUE;
                    }
                    long expiresAt3 = currentTimeMillis + deltaMilliseconds;
                    expiresAt = (expiresAt3 < currentTimeMillis || expiresAt3 > DatesKt.MAX_DATE) ? 253402300799999L : expiresAt3;
                }
                String urlHost = url.host();
                if (domain == null) {
                    domain = urlHost;
                } else if (!domainMatch(urlHost, domain)) {
                    return null;
                }
                if (urlHost.length() != domain.length() && PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(domain) == null) {
                    return null;
                }
                String path2 = "/";
                if (path == null || !lo.q(path, "/", false, 2)) {
                    String encodedPath = url.encodedPath();
                    int lastSlash = mo.K(encodedPath, '/', 0, false, 6);
                    if (lastSlash != 0) {
                        if (encodedPath == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        path2 = encodedPath.substring(0, lastSlash);
                        jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(path2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                } else {
                    path2 = path;
                }
                return new Cookie(cookieName, cookieValue, expiresAt, domain, path2, secureOnly, httpOnly, persistent, hostOnly, null);
            }
            return null;
        }

        private final long parseExpires(String s, int pos, int limit) {
            int pos2 = dateCharacterOffset(s, pos, limit, false);
            int minute = -1;
            int minute2 = -1;
            int second = -1;
            int dayOfMonth = -1;
            int month = -1;
            int year = -1;
            Matcher matcher = Cookie.TIME_PATTERN.matcher(s);
            while (pos2 < limit) {
                int end = dateCharacterOffset(s, pos2 + 1, limit, true);
                matcher.region(pos2, end);
                if (minute == -1 && matcher.usePattern(Cookie.TIME_PATTERN).matches()) {
                    String strGroup = matcher.group(1);
                    jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(strGroup, "matcher.group(1)");
                    int hour = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(strGroup2, "matcher.group(2)");
                    int minute3 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(strGroup3, "matcher.group(3)");
                    second = Integer.parseInt(strGroup3);
                    minute2 = minute3;
                    minute = hour;
                } else if (dayOfMonth == -1 && matcher.usePattern(Cookie.DAY_OF_MONTH_PATTERN).matches()) {
                    String strGroup4 = matcher.group(1);
                    jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(strGroup4, "matcher.group(1)");
                    dayOfMonth = Integer.parseInt(strGroup4);
                } else if (month == -1 && matcher.usePattern(Cookie.MONTH_PATTERN).matches()) {
                    String strGroup5 = matcher.group(1);
                    jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(strGroup5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(locale, "Locale.US");
                    String monthString = strGroup5.toLowerCase(locale);
                    jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(monthString, "(this as java.lang.String).toLowerCase(locale)");
                    String strPattern = Cookie.MONTH_PATTERN.pattern();
                    jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(strPattern, "MONTH_PATTERN.pattern()");
                    month = mo.G(strPattern, monthString, 0, false, 6) / 4;
                } else if (year == -1 && matcher.usePattern(Cookie.YEAR_PATTERN).matches()) {
                    String strGroup6 = matcher.group(1);
                    jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(strGroup6, "matcher.group(1)");
                    year = Integer.parseInt(strGroup6);
                }
                pos2 = dateCharacterOffset(s, end + 1, limit, false);
            }
            if (70 <= year && 99 >= year) {
                year += 1900;
            }
            if (year >= 0 && 69 >= year) {
                year += 2000;
            }
            if (!(year >= 1601)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(month != -1)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(1 <= dayOfMonth && 31 >= dayOfMonth)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(minute >= 0 && 23 >= minute)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(minute2 >= 0 && 59 >= minute2)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(second >= 0 && 59 >= second)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            GregorianCalendar $this$apply = new GregorianCalendar(Util.UTC);
            $this$apply.setLenient(false);
            $this$apply.set(1, year);
            $this$apply.set(2, month - 1);
            $this$apply.set(5, dayOfMonth);
            $this$apply.set(11, minute);
            $this$apply.set(12, minute2);
            $this$apply.set(13, second);
            $this$apply.set(14, 0);
            return $this$apply.getTimeInMillis();
        }

        private final int dateCharacterOffset(String input, int pos, int limit, boolean invert) {
            for (int i = pos; i < limit; i++) {
                int c = input.charAt(i);
                boolean dateCharacter = (c < 32 && c != 9) || c >= 127 || (48 <= c && 57 >= c) || ((97 <= c && 122 >= c) || ((65 <= c && 90 >= c) || c == 58));
                if (dateCharacter == (!invert)) {
                    return i;
                }
            }
            return limit;
        }

        private final long parseMaxAge(String s) {
            try {
                long parsed = Long.parseLong(s);
                if (parsed <= 0) {
                    return Long.MIN_VALUE;
                }
                return parsed;
            } catch (NumberFormatException e) {
                if (new bm("-?\\d+").xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(s)) {
                    return lo.q(s, "-", false, 2) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e;
            }
        }

        private final String parseDomain(String s) {
            if (!(!lo.c(s, ".", false, 2))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            String canonicalHost = HostnamesKt.toCanonicalHost(mo.U(s, "."));
            if (canonicalHost != null) {
                return canonicalHost;
            }
            throw new IllegalArgumentException();
        }

        public final List<Cookie> parseAll(HttpUrl url, Headers headers) {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(url, "url");
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(headers, "headers");
            List<String> listValues = headers.values("Set-Cookie");
            List cookies = null;
            int size = listValues.size();
            for (int i = 0; i < size; i++) {
                Cookie cookie = parse(url, listValues.get(i));
                if (cookie != null) {
                    if (cookies == null) {
                        cookies = new ArrayList();
                    }
                    cookies.add(cookie);
                }
            }
            if (cookies != null) {
                List<Cookie> listUnmodifiableList = Collections.unmodifiableList(cookies);
                jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(listUnmodifiableList, "Collections.unmodifiableList(cookies)");
                return listUnmodifiableList;
            }
            return d4.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }
}
