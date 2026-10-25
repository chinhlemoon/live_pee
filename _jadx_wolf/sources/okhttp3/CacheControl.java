package okhttp3;

import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t6;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes.dex */
public final class CacheControl {
    private String headerValue;
    private final boolean immutable;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;
    public static final Companion Companion = new Companion(null);
    public static final CacheControl FORCE_NETWORK = new Builder().noCache().build();
    public static final CacheControl FORCE_CACHE = new Builder().onlyIfCached().maxStale(Integer.MAX_VALUE, TimeUnit.SECONDS).build();

    public static final CacheControl parse(Headers headers) {
        return Companion.parse(headers);
    }

    private CacheControl(boolean noCache, boolean noStore, int maxAgeSeconds, int sMaxAgeSeconds, boolean isPrivate, boolean isPublic, boolean mustRevalidate, int maxStaleSeconds, int minFreshSeconds, boolean onlyIfCached, boolean noTransform, boolean immutable, String headerValue) {
        this.noCache = noCache;
        this.noStore = noStore;
        this.maxAgeSeconds = maxAgeSeconds;
        this.sMaxAgeSeconds = sMaxAgeSeconds;
        this.isPrivate = isPrivate;
        this.isPublic = isPublic;
        this.mustRevalidate = mustRevalidate;
        this.maxStaleSeconds = maxStaleSeconds;
        this.minFreshSeconds = minFreshSeconds;
        this.onlyIfCached = onlyIfCached;
        this.noTransform = noTransform;
        this.immutable = immutable;
        this.headerValue = headerValue;
    }

    public /* synthetic */ CacheControl(boolean noCache, boolean noStore, int maxAgeSeconds, int sMaxAgeSeconds, boolean isPrivate, boolean isPublic, boolean mustRevalidate, int maxStaleSeconds, int minFreshSeconds, boolean onlyIfCached, boolean noTransform, boolean immutable, String headerValue, t6 $constructor_marker) {
        this(noCache, noStore, maxAgeSeconds, sMaxAgeSeconds, isPrivate, isPublic, mustRevalidate, maxStaleSeconds, minFreshSeconds, onlyIfCached, noTransform, immutable, headerValue);
    }

    public final boolean noCache() {
        return this.noCache;
    }

    public final boolean noStore() {
        return this.noStore;
    }

    public final int maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    public final int sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public final boolean isPrivate() {
        return this.isPrivate;
    }

    public final boolean isPublic() {
        return this.isPublic;
    }

    public final boolean mustRevalidate() {
        return this.mustRevalidate;
    }

    public final int maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    public final int minFreshSeconds() {
        return this.minFreshSeconds;
    }

    public final boolean onlyIfCached() {
        return this.onlyIfCached;
    }

    public final boolean noTransform() {
        return this.noTransform;
    }

    public final boolean immutable() {
        return this.immutable;
    }

    /* JADX INFO: renamed from: -deprecated_noCache, reason: not valid java name */
    public final boolean m6601deprecated_noCache() {
        return this.noCache;
    }

    /* JADX INFO: renamed from: -deprecated_noStore, reason: not valid java name */
    public final boolean m6602deprecated_noStore() {
        return this.noStore;
    }

    /* JADX INFO: renamed from: -deprecated_maxAgeSeconds, reason: not valid java name */
    public final int m6597deprecated_maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    /* JADX INFO: renamed from: -deprecated_sMaxAgeSeconds, reason: not valid java name */
    public final int m6605deprecated_sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    /* JADX INFO: renamed from: -deprecated_mustRevalidate, reason: not valid java name */
    public final boolean m6600deprecated_mustRevalidate() {
        return this.mustRevalidate;
    }

    /* JADX INFO: renamed from: -deprecated_maxStaleSeconds, reason: not valid java name */
    public final int m6598deprecated_maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    /* JADX INFO: renamed from: -deprecated_minFreshSeconds, reason: not valid java name */
    public final int m6599deprecated_minFreshSeconds() {
        return this.minFreshSeconds;
    }

    /* JADX INFO: renamed from: -deprecated_onlyIfCached, reason: not valid java name */
    public final boolean m6604deprecated_onlyIfCached() {
        return this.onlyIfCached;
    }

    /* JADX INFO: renamed from: -deprecated_noTransform, reason: not valid java name */
    public final boolean m6603deprecated_noTransform() {
        return this.noTransform;
    }

    /* JADX INFO: renamed from: -deprecated_immutable, reason: not valid java name */
    public final boolean m6596deprecated_immutable() {
        return this.immutable;
    }

    public String toString() {
        String result = this.headerValue;
        if (result == null) {
            StringBuilder $this$buildString = new StringBuilder();
            if (this.noCache) {
                $this$buildString.append("no-cache, ");
            }
            if (this.noStore) {
                $this$buildString.append("no-store, ");
            }
            if (this.maxAgeSeconds != -1) {
                $this$buildString.append("max-age=");
                $this$buildString.append(this.maxAgeSeconds);
                $this$buildString.append(", ");
            }
            if (this.sMaxAgeSeconds != -1) {
                $this$buildString.append("s-maxage=");
                $this$buildString.append(this.sMaxAgeSeconds);
                $this$buildString.append(", ");
            }
            if (this.isPrivate) {
                $this$buildString.append("private, ");
            }
            if (this.isPublic) {
                $this$buildString.append("public, ");
            }
            if (this.mustRevalidate) {
                $this$buildString.append("must-revalidate, ");
            }
            if (this.maxStaleSeconds != -1) {
                $this$buildString.append("max-stale=");
                $this$buildString.append(this.maxStaleSeconds);
                $this$buildString.append(", ");
            }
            if (this.minFreshSeconds != -1) {
                $this$buildString.append("min-fresh=");
                $this$buildString.append(this.minFreshSeconds);
                $this$buildString.append(", ");
            }
            if (this.onlyIfCached) {
                $this$buildString.append("only-if-cached, ");
            }
            if (this.noTransform) {
                $this$buildString.append("no-transform, ");
            }
            if (this.immutable) {
                $this$buildString.append("immutable, ");
            }
            if ($this$buildString.length() == 0) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            $this$buildString.delete($this$buildString.length() - 2, $this$buildString.length());
            String result2 = $this$buildString.toString();
            jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(result2, "StringBuilder().apply(builderAction).toString()");
            this.headerValue = result2;
            return result2;
        }
        return result;
    }

    public static final class Builder {
        private boolean immutable;
        private int maxAgeSeconds = -1;
        private int maxStaleSeconds = -1;
        private int minFreshSeconds = -1;
        private boolean noCache;
        private boolean noStore;
        private boolean noTransform;
        private boolean onlyIfCached;

        public final Builder noCache() {
            this.noCache = true;
            return this;
        }

        public final Builder noStore() {
            this.noStore = true;
            return this;
        }

        public final Builder maxAge(int maxAge, TimeUnit timeUnit) {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(timeUnit, "timeUnit");
            if (!(maxAge >= 0)) {
                throw new IllegalArgumentException(("maxAge < 0: " + maxAge).toString());
            }
            long maxAgeSecondsLong = timeUnit.toSeconds(maxAge);
            this.maxAgeSeconds = clampToInt(maxAgeSecondsLong);
            return this;
        }

        public final Builder maxStale(int maxStale, TimeUnit timeUnit) {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(timeUnit, "timeUnit");
            if (!(maxStale >= 0)) {
                throw new IllegalArgumentException(("maxStale < 0: " + maxStale).toString());
            }
            long maxStaleSecondsLong = timeUnit.toSeconds(maxStale);
            this.maxStaleSeconds = clampToInt(maxStaleSecondsLong);
            return this;
        }

        public final Builder minFresh(int minFresh, TimeUnit timeUnit) {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(timeUnit, "timeUnit");
            if (!(minFresh >= 0)) {
                throw new IllegalArgumentException(("minFresh < 0: " + minFresh).toString());
            }
            long minFreshSecondsLong = timeUnit.toSeconds(minFresh);
            this.minFreshSeconds = clampToInt(minFreshSecondsLong);
            return this;
        }

        public final Builder onlyIfCached() {
            this.onlyIfCached = true;
            return this;
        }

        public final Builder noTransform() {
            this.noTransform = true;
            return this;
        }

        public final Builder immutable() {
            this.immutable = true;
            return this;
        }

        private final int clampToInt(long $this$clampToInt) {
            if ($this$clampToInt > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            return (int) $this$clampToInt;
        }

        public final CacheControl build() {
            return new CacheControl(this.noCache, this.noStore, this.maxAgeSeconds, -1, false, false, false, this.maxStaleSeconds, this.minFreshSeconds, this.onlyIfCached, this.noTransform, this.immutable, null, null);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(t6 $constructor_marker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:33:0x00f5  */
        /* JADX WARN: Code duplicated, block: B:34:0x0102  */
        /* JADX WARN: Code duplicated, block: B:36:0x010a  */
        /* JADX WARN: Code duplicated, block: B:37:0x0114  */
        /* JADX WARN: Code duplicated, block: B:39:0x011d  */
        /* JADX WARN: Code duplicated, block: B:40:0x012a  */
        /* JADX WARN: Code duplicated, block: B:42:0x0132  */
        /* JADX WARN: Code duplicated, block: B:43:0x013e  */
        /* JADX WARN: Code duplicated, block: B:45:0x0146  */
        /* JADX WARN: Code duplicated, block: B:46:0x0153  */
        /* JADX WARN: Code duplicated, block: B:48:0x015b  */
        /* JADX WARN: Code duplicated, block: B:49:0x0165  */
        /* JADX WARN: Code duplicated, block: B:51:0x016d  */
        /* JADX WARN: Code duplicated, block: B:52:0x0179  */
        /* JADX WARN: Code duplicated, block: B:54:0x0181  */
        /* JADX WARN: Code duplicated, block: B:55:0x0193  */
        /* JADX WARN: Code duplicated, block: B:57:0x019b  */
        /* JADX WARN: Code duplicated, block: B:58:0x01a9  */
        /* JADX WARN: Code duplicated, block: B:60:0x01b1  */
        /* JADX WARN: Code duplicated, block: B:61:0x01bc  */
        /* JADX WARN: Code duplicated, block: B:63:0x01c4  */
        /* JADX WARN: Code duplicated, block: B:64:0x01d0  */
        /* JADX WARN: Code duplicated, block: B:66:0x01d8  */
        /* JADX WARN: Code duplicated, block: B:67:0x01e4  */
        public final CacheControl parse(Headers headers) {
            boolean isPrivate;
            String parameter;
            Headers headers2 = headers;
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(headers2, "headers");
            boolean noStore = false;
            int maxAgeSeconds = -1;
            int sMaxAgeSeconds = -1;
            boolean isPrivate2 = false;
            boolean isPublic = false;
            boolean mustRevalidate = false;
            int maxStaleSeconds = -1;
            int minFreshSeconds = -1;
            boolean onlyIfCached = false;
            boolean noTransform = false;
            boolean immutable = false;
            boolean canUseHeaderValue = true;
            String headerValue = null;
            int size = headers.size();
            boolean noCache = false;
            int i = 0;
            while (i < size) {
                int i2 = size;
                String name = headers2.name(i);
                boolean immutable2 = immutable;
                String value = headers2.value(i);
                boolean noTransform2 = noTransform;
                if (lo.d(name, "Cache-Control", true)) {
                    if (headerValue != null) {
                        canUseHeaderValue = false;
                    } else {
                        headerValue = value;
                    }
                } else {
                    if (lo.d(name, "Pragma", true)) {
                        canUseHeaderValue = false;
                    }
                    immutable = immutable2;
                    i++;
                    headers2 = headers;
                    size = i2;
                    noTransform = noTransform2;
                }
                int pos = 0;
                while (pos < value.length()) {
                    int tokenStart = pos;
                    boolean noStore2 = noStore;
                    int pos2 = indexOfElement(value, "=,;", pos);
                    String strSubstring = value.substring(tokenStart, pos2);
                    int maxAgeSeconds2 = maxAgeSeconds;
                    jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    String directive = mo.j0(strSubstring).toString();
                    int sMaxAgeSeconds2 = sMaxAgeSeconds;
                    int sMaxAgeSeconds3 = value.length();
                    if (pos2 != sMaxAgeSeconds3) {
                        isPrivate = isPrivate2;
                        if (value.charAt(pos2) != ',' && value.charAt(pos2) != ';') {
                            int pos3 = Util.indexOfNonWhitespace(value, pos2 + 1);
                            if (pos3 >= value.length() || value.charAt(pos3) != '\"') {
                                isPublic = isPublic;
                                pos = indexOfElement(value, ",;", pos3);
                                String strSubstring2 = value.substring(pos3, pos);
                                jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                parameter = mo.j0(strSubstring2).toString();
                            } else {
                                int pos4 = pos3 + 1;
                                isPublic = isPublic;
                                int pos5 = mo.F(value, '\"', pos4, false, 4);
                                String strSubstring3 = value.substring(pos4, pos5);
                                jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(strSubstring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                parameter = strSubstring3;
                                pos = pos5 + 1;
                            }
                        }
                        if (lo.d("no-cache", directive, true)) {
                            noCache = true;
                            noStore = noStore2;
                            maxAgeSeconds = maxAgeSeconds2;
                            sMaxAgeSeconds = sMaxAgeSeconds2;
                            isPublic = isPublic;
                        } else if (lo.d("no-store", directive, true)) {
                            noStore = true;
                            maxAgeSeconds = maxAgeSeconds2;
                            sMaxAgeSeconds = sMaxAgeSeconds2;
                            isPublic = isPublic;
                        } else if (lo.d("max-age", directive, true)) {
                            maxAgeSeconds = Util.toNonNegativeInt(parameter, -1);
                            noStore = noStore2;
                            sMaxAgeSeconds = sMaxAgeSeconds2;
                            isPublic = isPublic;
                        } else if (lo.d("s-maxage", directive, true)) {
                            sMaxAgeSeconds = Util.toNonNegativeInt(parameter, -1);
                            noStore = noStore2;
                            maxAgeSeconds = maxAgeSeconds2;
                            isPublic = isPublic;
                        } else if (lo.d("private", directive, true)) {
                            isPrivate = true;
                            noStore = noStore2;
                            maxAgeSeconds = maxAgeSeconds2;
                            sMaxAgeSeconds = sMaxAgeSeconds2;
                            isPublic = isPublic;
                        } else if (lo.d("public", directive, true)) {
                            isPublic = true;
                            noStore = noStore2;
                            maxAgeSeconds = maxAgeSeconds2;
                            sMaxAgeSeconds = sMaxAgeSeconds2;
                        } else if (lo.d("must-revalidate", directive, true)) {
                            mustRevalidate = true;
                            noStore = noStore2;
                            maxAgeSeconds = maxAgeSeconds2;
                            sMaxAgeSeconds = sMaxAgeSeconds2;
                            isPublic = isPublic;
                        } else if (lo.d("max-stale", directive, true)) {
                            maxStaleSeconds = Util.toNonNegativeInt(parameter, Integer.MAX_VALUE);
                            noStore = noStore2;
                            maxAgeSeconds = maxAgeSeconds2;
                            sMaxAgeSeconds = sMaxAgeSeconds2;
                            isPublic = isPublic;
                        } else if (lo.d("min-fresh", directive, true)) {
                            minFreshSeconds = Util.toNonNegativeInt(parameter, -1);
                            noStore = noStore2;
                            maxAgeSeconds = maxAgeSeconds2;
                            sMaxAgeSeconds = sMaxAgeSeconds2;
                            isPublic = isPublic;
                        } else if (lo.d("only-if-cached", directive, true)) {
                            onlyIfCached = true;
                            noStore = noStore2;
                            maxAgeSeconds = maxAgeSeconds2;
                            sMaxAgeSeconds = sMaxAgeSeconds2;
                            isPublic = isPublic;
                        } else if (lo.d("no-transform", directive, true)) {
                            noTransform2 = true;
                            noStore = noStore2;
                            maxAgeSeconds = maxAgeSeconds2;
                            sMaxAgeSeconds = sMaxAgeSeconds2;
                            isPublic = isPublic;
                        } else if (lo.d("immutable", directive, true)) {
                            noStore = noStore2;
                            maxAgeSeconds = maxAgeSeconds2;
                            sMaxAgeSeconds = sMaxAgeSeconds2;
                            isPublic = isPublic;
                        } else {
                            immutable2 = true;
                            noStore = noStore2;
                            maxAgeSeconds = maxAgeSeconds2;
                            sMaxAgeSeconds = sMaxAgeSeconds2;
                            isPublic = isPublic;
                        }
                        isPrivate2 = isPrivate;
                    } else {
                        isPrivate = isPrivate2;
                    }
                    pos = pos2 + 1;
                    parameter = null;
                    if (lo.d("no-cache", directive, true)) {
                        noCache = true;
                        noStore = noStore2;
                        maxAgeSeconds = maxAgeSeconds2;
                        sMaxAgeSeconds = sMaxAgeSeconds2;
                        isPublic = isPublic;
                    } else if (lo.d("no-store", directive, true)) {
                        noStore = true;
                        maxAgeSeconds = maxAgeSeconds2;
                        sMaxAgeSeconds = sMaxAgeSeconds2;
                        isPublic = isPublic;
                    } else if (lo.d("max-age", directive, true)) {
                        maxAgeSeconds = Util.toNonNegativeInt(parameter, -1);
                        noStore = noStore2;
                        sMaxAgeSeconds = sMaxAgeSeconds2;
                        isPublic = isPublic;
                    } else if (lo.d("s-maxage", directive, true)) {
                        sMaxAgeSeconds = Util.toNonNegativeInt(parameter, -1);
                        noStore = noStore2;
                        maxAgeSeconds = maxAgeSeconds2;
                        isPublic = isPublic;
                    } else if (lo.d("private", directive, true)) {
                        isPrivate = true;
                        noStore = noStore2;
                        maxAgeSeconds = maxAgeSeconds2;
                        sMaxAgeSeconds = sMaxAgeSeconds2;
                        isPublic = isPublic;
                    } else if (lo.d("public", directive, true)) {
                        isPublic = true;
                        noStore = noStore2;
                        maxAgeSeconds = maxAgeSeconds2;
                        sMaxAgeSeconds = sMaxAgeSeconds2;
                    } else if (lo.d("must-revalidate", directive, true)) {
                        mustRevalidate = true;
                        noStore = noStore2;
                        maxAgeSeconds = maxAgeSeconds2;
                        sMaxAgeSeconds = sMaxAgeSeconds2;
                        isPublic = isPublic;
                    } else if (lo.d("max-stale", directive, true)) {
                        maxStaleSeconds = Util.toNonNegativeInt(parameter, Integer.MAX_VALUE);
                        noStore = noStore2;
                        maxAgeSeconds = maxAgeSeconds2;
                        sMaxAgeSeconds = sMaxAgeSeconds2;
                        isPublic = isPublic;
                    } else if (lo.d("min-fresh", directive, true)) {
                        minFreshSeconds = Util.toNonNegativeInt(parameter, -1);
                        noStore = noStore2;
                        maxAgeSeconds = maxAgeSeconds2;
                        sMaxAgeSeconds = sMaxAgeSeconds2;
                        isPublic = isPublic;
                    } else if (lo.d("only-if-cached", directive, true)) {
                        onlyIfCached = true;
                        noStore = noStore2;
                        maxAgeSeconds = maxAgeSeconds2;
                        sMaxAgeSeconds = sMaxAgeSeconds2;
                        isPublic = isPublic;
                    } else if (lo.d("no-transform", directive, true)) {
                        noTransform2 = true;
                        noStore = noStore2;
                        maxAgeSeconds = maxAgeSeconds2;
                        sMaxAgeSeconds = sMaxAgeSeconds2;
                        isPublic = isPublic;
                    } else if (lo.d("immutable", directive, true)) {
                        noStore = noStore2;
                        maxAgeSeconds = maxAgeSeconds2;
                        sMaxAgeSeconds = sMaxAgeSeconds2;
                        isPublic = isPublic;
                    } else {
                        immutable2 = true;
                        noStore = noStore2;
                        maxAgeSeconds = maxAgeSeconds2;
                        sMaxAgeSeconds = sMaxAgeSeconds2;
                        isPublic = isPublic;
                    }
                    isPrivate2 = isPrivate;
                }
                immutable = immutable2;
                i++;
                headers2 = headers;
                size = i2;
                noTransform = noTransform2;
            }
            boolean noTransform3 = noTransform;
            boolean immutable3 = immutable;
            if (!canUseHeaderValue) {
                headerValue = null;
            }
            return new CacheControl(noCache, noStore, maxAgeSeconds, sMaxAgeSeconds, isPrivate2, isPublic, mustRevalidate, maxStaleSeconds, minFreshSeconds, onlyIfCached, noTransform3, immutable3, headerValue, null);
        }

        public static /* synthetic */ int indexOfElement$default(Companion companion, String str, String str2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return companion.indexOfElement(str, str2, i);
        }

        private final int indexOfElement(String $this$indexOfElement, String characters, int startIndex) {
            int length = $this$indexOfElement.length();
            for (int i = startIndex; i < length; i++) {
                if (mo.u(characters, $this$indexOfElement.charAt(i), false, 2)) {
                    return i;
                }
            }
            return $this$indexOfElement.length();
        }
    }
}
