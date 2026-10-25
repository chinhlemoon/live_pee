package okhttp3.internal.publicsuffix;

import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.c4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jb;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zi;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes.dex */
public final class PublicSuffixDatabase {
    private static final char EXCEPTION_MARKER = '!';
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;
    public static final Companion Companion = new Companion(null);
    private static final byte[] WILDCARD_LABEL = {(byte) 42};
    private static final List<String> PREVAILING_RULE = c4.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa("*");
    private static final PublicSuffixDatabase instance = new PublicSuffixDatabase();
    private final AtomicBoolean listRead = new AtomicBoolean(false);
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    public static final /* synthetic */ byte[] access$getPublicSuffixListBytes$p(PublicSuffixDatabase $this) {
        byte[] bArr = $this.publicSuffixListBytes;
        if (bArr != null) {
            return bArr;
        }
        jd.n("publicSuffixListBytes");
        throw null;
    }

    public final String getEffectiveTldPlusOne(String domain) {
        int firstLabelOffset;
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(unicodeDomain, "unicodeDomain");
        List<String> listSplitDomain = splitDomain(unicodeDomain);
        List<String> listFindMatchingRule = findMatchingRule(listSplitDomain);
        if (listSplitDomain.size() == listFindMatchingRule.size() && listFindMatchingRule.get(0).charAt(0) != '!') {
            return null;
        }
        if (listFindMatchingRule.get(0).charAt(0) == '!') {
            firstLabelOffset = listSplitDomain.size() - listFindMatchingRule.size();
        } else {
            firstLabelOffset = listSplitDomain.size() - (listFindMatchingRule.size() + 1);
        }
        return mn.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(mn.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(l4.k(splitDomain(domain)), firstLabelOffset), ".", null, null, 0, null, null, 62);
    }

    private final List<String> splitDomain(String domain) {
        List<String> listB0 = mo.b0(domain, new char[]{'.'}, false, 0, 6);
        if (jd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) l4.t(listB0), HttpUrl.FRAGMENT_ENCODE_SET)) {
            return l4.l(listB0, 1);
        }
        return listB0;
    }

    private final List<String> findMatchingRule(List<String> list) {
        if (!this.listRead.get() && this.listRead.compareAndSet(false, true)) {
            readTheListUninterruptibly();
        } else {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        if (!(this.publicSuffixListBytes != null)) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
        int size = list.size();
        byte[][] domainLabelsUtf8Bytes = new byte[size][];
        for (int i = 0; i < size; i++) {
            int i2 = i;
            String str = list.get(i2);
            Charset charset = StandardCharsets.UTF_8;
            jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(charset, "UTF_8");
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = str.getBytes(charset);
            jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(bytes, "(this as java.lang.String).getBytes(charset)");
            domainLabelsUtf8Bytes[i] = bytes;
        }
        String exactMatch = null;
        int length = domainLabelsUtf8Bytes.length;
        for (int i3 = 0; i3 < length; i3++) {
            Companion companion = Companion;
            byte[] bArr = this.publicSuffixListBytes;
            if (bArr == null) {
                jd.n("publicSuffixListBytes");
                throw null;
            }
            String rule = companion.binarySearch(bArr, domainLabelsUtf8Bytes, i3);
            if (rule != null) {
                exactMatch = rule;
                break;
            }
        }
        String wildcardMatch = null;
        if (domainLabelsUtf8Bytes.length > 1) {
            byte[][] labelsWithWildcard = (byte[][]) domainLabelsUtf8Bytes.clone();
            int length2 = labelsWithWildcard.length - 1;
            for (int labelIndex = 0; labelIndex < length2; labelIndex++) {
                labelsWithWildcard[labelIndex] = WILDCARD_LABEL;
                Companion companion2 = Companion;
                byte[] bArr2 = this.publicSuffixListBytes;
                if (bArr2 == null) {
                    jd.n("publicSuffixListBytes");
                    throw null;
                }
                String rule2 = companion2.binarySearch(bArr2, labelsWithWildcard, labelIndex);
                if (rule2 != null) {
                    wildcardMatch = rule2;
                    break;
                }
            }
        }
        String exception = null;
        if (wildcardMatch != null) {
            int length3 = domainLabelsUtf8Bytes.length - 1;
            for (int labelIndex2 = 0; labelIndex2 < length3; labelIndex2++) {
                Companion companion3 = Companion;
                byte[] bArr3 = this.publicSuffixExceptionListBytes;
                if (bArr3 == null) {
                    jd.n("publicSuffixExceptionListBytes");
                    throw null;
                }
                String rule3 = companion3.binarySearch(bArr3, domainLabelsUtf8Bytes, labelIndex2);
                if (rule3 != null) {
                    exception = rule3;
                    break;
                }
            }
        }
        if (exception != null) {
            return mo.b0(EXCEPTION_MARKER + exception, new char[]{'.'}, false, 0, 6);
        }
        if (exactMatch == null && wildcardMatch == null) {
            return PREVAILING_RULE;
        }
        List<String> listB0 = exactMatch != null ? mo.b0(exactMatch, new char[]{'.'}, false, 0, 6) : d4.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        List<String> listB1 = wildcardMatch != null ? mo.b0(wildcardMatch, new char[]{'.'}, false, 0, 6) : d4.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        if (listB0.size() > listB1.size()) {
            return listB0;
        }
        return listB1;
    }

    /* JADX INFO: renamed from: okhttp3.internal.publicsuffix.PublicSuffixDatabase$findMatchingRule$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends zi {
        public AnonymousClass1(PublicSuffixDatabase publicSuffixDatabase) {
            super(publicSuffixDatabase, PublicSuffixDatabase.class, "publicSuffixListBytes", "getPublicSuffixListBytes()[B", 0);
        }

        @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zi, fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ke
        public Object get() {
            return PublicSuffixDatabase.access$getPublicSuffixListBytes$p((PublicSuffixDatabase) this.receiver);
        }

        @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zi
        public void set(Object value) {
            ((PublicSuffixDatabase) this.receiver).publicSuffixListBytes = (byte[]) value;
        }
    }

    private final void readTheListUninterruptibly() {
        boolean interrupted = false;
        while (true) {
            try {
                try {
                    try {
                        readTheList();
                        break;
                    } catch (IOException e) {
                        Platform.Companion.get().log("Failed to read public suffix list", 5, e);
                        if (!interrupted) {
                            return;
                        }
                        Thread.currentThread().interrupt();
                        return;
                    }
                } catch (InterruptedIOException e2) {
                    Thread.interrupted();
                    interrupted = true;
                }
            } catch (Throwable th) {
                if (interrupted) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (!interrupted) {
            return;
        }
        Thread.currentThread().interrupt();
    }

    private final void readTheList() throws IOException {
        InputStream resource = PublicSuffixDatabase.class.getResourceAsStream(PUBLIC_SUFFIX_RESOURCE);
        if (resource == null) {
            return;
        }
        v2 bufferedSource = rj.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(new jb(rj.c(resource)));
        try {
            int totalBytes = bufferedSource.r();
            byte[] bArrH = bufferedSource.H(totalBytes);
            int totalExceptionBytes = bufferedSource.r();
            byte[] bArrH2 = bufferedSource.H(totalExceptionBytes);
            hr hrVar = hr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
            z3.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(bufferedSource, null);
            synchronized (this) {
                jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(bArrH);
                this.publicSuffixListBytes = bArrH;
                jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(bArrH2);
                this.publicSuffixExceptionListBytes = bArrH2;
            }
            this.readCompleteLatch.countDown();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                z3.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(bufferedSource, th);
                throw th2;
            }
        }
    }

    public final void setListBytes(byte[] publicSuffixListBytes, byte[] publicSuffixExceptionListBytes) {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(publicSuffixListBytes, "publicSuffixListBytes");
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(publicSuffixExceptionListBytes, "publicSuffixExceptionListBytes");
        this.publicSuffixListBytes = publicSuffixListBytes;
        this.publicSuffixExceptionListBytes = publicSuffixExceptionListBytes;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(t6 $constructor_marker) {
            this();
        }

        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.instance;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String binarySearch(byte[] $this$binarySearch, byte[][] labels, int labelIndex) {
            int byte0;
            int compareResult;
            int low = 0;
            int high = $this$binarySearch.length;
            while (low < high) {
                int mid = (low + high) / 2;
                while (mid > -1 && $this$binarySearch[mid] != ((byte) 10)) {
                    mid--;
                }
                int mid2 = mid + 1;
                int end = 1;
                while ($this$binarySearch[mid2 + end] != ((byte) 10)) {
                    end++;
                }
                int publicSuffixLength = (mid2 + end) - mid2;
                int currentLabelIndex = labelIndex;
                int currentLabelByteIndex = 0;
                int publicSuffixByteIndex = 0;
                boolean expectDot = false;
                while (true) {
                    if (!expectDot) {
                        byte0 = Util.and(labels[currentLabelIndex][currentLabelByteIndex], 255);
                    } else {
                        byte0 = 46;
                        expectDot = false;
                    }
                    int byte1 = Util.and($this$binarySearch[mid2 + publicSuffixByteIndex], 255);
                    compareResult = byte0 - byte1;
                    if (compareResult != 0) {
                        break;
                    }
                    publicSuffixByteIndex++;
                    currentLabelByteIndex++;
                    if (publicSuffixByteIndex == publicSuffixLength) {
                        break;
                    }
                    if (labels[currentLabelIndex].length == currentLabelByteIndex) {
                        if (currentLabelIndex == labels.length - 1) {
                            break;
                        }
                        currentLabelIndex++;
                        expectDot = true;
                        currentLabelByteIndex = -1;
                    }
                    low = low;
                }
                if (compareResult < 0) {
                    high = mid2 - 1;
                } else if (compareResult > 0) {
                    low = mid2 + end + 1;
                } else {
                    int low2 = publicSuffixLength - publicSuffixByteIndex;
                    int labelBytesLeft = labels[currentLabelIndex].length - currentLabelByteIndex;
                    int i = currentLabelIndex + 1;
                    int low3 = low;
                    for (int low4 = labels.length; i < low4; low4 = low4) {
                        labelBytesLeft += labels[i].length;
                        i++;
                    }
                    if (labelBytesLeft < low2) {
                        high = mid2 - 1;
                        low = low3;
                    } else if (labelBytesLeft > low2) {
                        low = mid2 + end + 1;
                    } else {
                        Charset charset = StandardCharsets.UTF_8;
                        jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(charset, "UTF_8");
                        String match = new String($this$binarySearch, mid2, publicSuffixLength, charset);
                        return match;
                    }
                }
            }
            return null;
        }
    }
}
