package okhttp3.internal.http2;

import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.c2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes.dex */
public final class Hpack {
    public static final Hpack INSTANCE;
    private static final Map<a3, Integer> NAME_TO_FIRST_INDEX;
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
    private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;
    private static final Header[] STATIC_HEADER_TABLE;

    static {
        Hpack hpack = new Hpack();
        INSTANCE = hpack;
        a3 a3Var = Header.TARGET_METHOD;
        a3 a3Var2 = Header.TARGET_PATH;
        a3 a3Var3 = Header.TARGET_SCHEME;
        a3 a3Var4 = Header.RESPONSE_STATUS;
        STATIC_HEADER_TABLE = new Header[]{new Header(Header.TARGET_AUTHORITY, HttpUrl.FRAGMENT_ENCODE_SET), new Header(a3Var, "GET"), new Header(a3Var, "POST"), new Header(a3Var2, "/"), new Header(a3Var2, "/index.html"), new Header(a3Var3, "http"), new Header(a3Var3, "https"), new Header(a3Var4, "200"), new Header(a3Var4, "204"), new Header(a3Var4, "206"), new Header(a3Var4, "304"), new Header(a3Var4, "400"), new Header(a3Var4, "404"), new Header(a3Var4, "500"), new Header("accept-charset", HttpUrl.FRAGMENT_ENCODE_SET), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", HttpUrl.FRAGMENT_ENCODE_SET), new Header("accept-ranges", HttpUrl.FRAGMENT_ENCODE_SET), new Header("accept", HttpUrl.FRAGMENT_ENCODE_SET), new Header("access-control-allow-origin", HttpUrl.FRAGMENT_ENCODE_SET), new Header("age", HttpUrl.FRAGMENT_ENCODE_SET), new Header("allow", HttpUrl.FRAGMENT_ENCODE_SET), new Header("authorization", HttpUrl.FRAGMENT_ENCODE_SET), new Header("cache-control", HttpUrl.FRAGMENT_ENCODE_SET), new Header("content-disposition", HttpUrl.FRAGMENT_ENCODE_SET), new Header("content-encoding", HttpUrl.FRAGMENT_ENCODE_SET), new Header("content-language", HttpUrl.FRAGMENT_ENCODE_SET), new Header("content-length", HttpUrl.FRAGMENT_ENCODE_SET), new Header("content-location", HttpUrl.FRAGMENT_ENCODE_SET), new Header("content-range", HttpUrl.FRAGMENT_ENCODE_SET), new Header("content-type", HttpUrl.FRAGMENT_ENCODE_SET), new Header("cookie", HttpUrl.FRAGMENT_ENCODE_SET), new Header("date", HttpUrl.FRAGMENT_ENCODE_SET), new Header("etag", HttpUrl.FRAGMENT_ENCODE_SET), new Header("expect", HttpUrl.FRAGMENT_ENCODE_SET), new Header("expires", HttpUrl.FRAGMENT_ENCODE_SET), new Header("from", HttpUrl.FRAGMENT_ENCODE_SET), new Header("host", HttpUrl.FRAGMENT_ENCODE_SET), new Header("if-match", HttpUrl.FRAGMENT_ENCODE_SET), new Header("if-modified-since", HttpUrl.FRAGMENT_ENCODE_SET), new Header("if-none-match", HttpUrl.FRAGMENT_ENCODE_SET), new Header("if-range", HttpUrl.FRAGMENT_ENCODE_SET), new Header("if-unmodified-since", HttpUrl.FRAGMENT_ENCODE_SET), new Header("last-modified", HttpUrl.FRAGMENT_ENCODE_SET), new Header("link", HttpUrl.FRAGMENT_ENCODE_SET), new Header("location", HttpUrl.FRAGMENT_ENCODE_SET), new Header("max-forwards", HttpUrl.FRAGMENT_ENCODE_SET), new Header("proxy-authenticate", HttpUrl.FRAGMENT_ENCODE_SET), new Header("proxy-authorization", HttpUrl.FRAGMENT_ENCODE_SET), new Header("range", HttpUrl.FRAGMENT_ENCODE_SET), new Header("referer", HttpUrl.FRAGMENT_ENCODE_SET), new Header("refresh", HttpUrl.FRAGMENT_ENCODE_SET), new Header("retry-after", HttpUrl.FRAGMENT_ENCODE_SET), new Header("server", HttpUrl.FRAGMENT_ENCODE_SET), new Header("set-cookie", HttpUrl.FRAGMENT_ENCODE_SET), new Header("strict-transport-security", HttpUrl.FRAGMENT_ENCODE_SET), new Header("transfer-encoding", HttpUrl.FRAGMENT_ENCODE_SET), new Header("user-agent", HttpUrl.FRAGMENT_ENCODE_SET), new Header("vary", HttpUrl.FRAGMENT_ENCODE_SET), new Header("via", HttpUrl.FRAGMENT_ENCODE_SET), new Header("www-authenticate", HttpUrl.FRAGMENT_ENCODE_SET)};
        NAME_TO_FIRST_INDEX = hpack.nameToFirstIndex();
    }

    private Hpack() {
    }

    public final Header[] getSTATIC_HEADER_TABLE() {
        return STATIC_HEADER_TABLE;
    }

    public final Map<a3, Integer> getNAME_TO_FIRST_INDEX() {
        return NAME_TO_FIRST_INDEX;
    }

    public static final class Reader {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        public int headerCount;
        private final List<Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final v2 source;

        public Reader(un unVar, int i) {
            this(unVar, i, 0, 4, null);
        }

        public Reader(un source, int headerTableSizeSetting, int maxDynamicTableByteCount) {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(source, "source");
            this.headerTableSizeSetting = headerTableSizeSetting;
            this.maxDynamicTableByteCount = maxDynamicTableByteCount;
            this.headerList = new ArrayList();
            this.source = rj.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(source);
            Header[] headerArr = new Header[8];
            this.dynamicTable = headerArr;
            this.nextHeaderIndex = headerArr.length - 1;
        }

        public /* synthetic */ Reader(un unVar, int i, int i2, int i3, t6 t6Var) {
            this(unVar, i, (i3 & 4) != 0 ? i : i2);
        }

        public final List<Header> getAndResetHeaderList() {
            List<Header> listA = l4.A(this.headerList);
            this.headerList.clear();
            return listA;
        }

        public final int maxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        private final void adjustDynamicTableByteCount() {
            int i = this.maxDynamicTableByteCount;
            int i2 = this.dynamicTableByteCount;
            if (i < i2) {
                if (i == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i2 - i);
                }
            }
        }

        private final void clearDynamicTable() {
            c2.d(this.dynamicTable, null, 0, 0, 6);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int evictToRecoverBytes(int bytesToRecover) {
            int i;
            int bytesToRecover2 = bytesToRecover;
            int entriesToEvict = 0;
            if (bytesToRecover2 > 0) {
                int j = this.dynamicTable.length;
                while (true) {
                    j--;
                    i = this.nextHeaderIndex;
                    if (j < i || bytesToRecover2 <= 0) {
                        break;
                    }
                    Header toEvict = this.dynamicTable[j];
                    jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(toEvict);
                    int i2 = toEvict.hpackSize;
                    bytesToRecover2 -= i2;
                    this.dynamicTableByteCount -= i2;
                    this.headerCount--;
                    entriesToEvict++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i + 1, headerArr, i + 1 + entriesToEvict, this.headerCount);
                this.nextHeaderIndex += entriesToEvict;
            }
            return entriesToEvict;
        }

        public final void readHeaders() throws IOException {
            while (!this.source.E()) {
                int b = Util.and(this.source.L(), 255);
                if (b != 128) {
                    if ((b & 128) == 128) {
                        int index = readInt(b, 127);
                        readIndexedHeader(index - 1);
                    } else if (b != 64) {
                        if ((b & 64) == 64) {
                            int index2 = readInt(b, Hpack.PREFIX_6_BITS);
                            readLiteralHeaderWithIncrementalIndexingIndexedName(index2 - 1);
                        } else if ((b & 32) == 32) {
                            int i = readInt(b, Hpack.PREFIX_5_BITS);
                            this.maxDynamicTableByteCount = i;
                            if (i < 0 || i > this.headerTableSizeSetting) {
                                throw new IOException("Invalid dynamic table size update " + this.maxDynamicTableByteCount);
                            }
                            adjustDynamicTableByteCount();
                        } else if (b == 16 || b == 0) {
                            readLiteralHeaderWithoutIndexingNewName();
                        } else {
                            int index3 = readInt(b, 15);
                            readLiteralHeaderWithoutIndexingIndexedName(index3 - 1);
                        }
                    } else {
                        readLiteralHeaderWithIncrementalIndexingNewName();
                    }
                } else {
                    throw new IOException("index == 0");
                }
            }
        }

        private final void readIndexedHeader(int index) throws IOException {
            if (isStaticHeader(index)) {
                Header staticEntry = Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[index];
                this.headerList.add(staticEntry);
                return;
            }
            int dynamicTableIndex = dynamicTableIndex(index - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (dynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (dynamicTableIndex < headerArr.length) {
                    List<Header> list = this.headerList;
                    Header header = headerArr[dynamicTableIndex];
                    jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(header);
                    list.add(header);
                    return;
                }
            }
            throw new IOException("Header index too large " + (index + 1));
        }

        private final int dynamicTableIndex(int index) {
            return this.nextHeaderIndex + 1 + index;
        }

        private final void readLiteralHeaderWithoutIndexingIndexedName(int index) throws IOException {
            a3 name = getName(index);
            a3 value = readByteString();
            this.headerList.add(new Header(name, value));
        }

        private final void readLiteralHeaderWithoutIndexingNewName() throws IOException {
            a3 name = Hpack.INSTANCE.checkLowercase(readByteString());
            a3 value = readByteString();
            this.headerList.add(new Header(name, value));
        }

        private final void readLiteralHeaderWithIncrementalIndexingIndexedName(int nameIndex) throws IOException {
            a3 name = getName(nameIndex);
            a3 value = readByteString();
            insertIntoDynamicTable(-1, new Header(name, value));
        }

        private final void readLiteralHeaderWithIncrementalIndexingNewName() throws IOException {
            a3 name = Hpack.INSTANCE.checkLowercase(readByteString());
            a3 value = readByteString();
            insertIntoDynamicTable(-1, new Header(name, value));
        }

        private final a3 getName(int index) throws IOException {
            if (isStaticHeader(index)) {
                return Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[index].name;
            }
            int dynamicTableIndex = dynamicTableIndex(index - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (dynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (dynamicTableIndex < headerArr.length) {
                    Header header = headerArr[dynamicTableIndex];
                    jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(header);
                    return header.name;
                }
            }
            throw new IOException("Header index too large " + (index + 1));
        }

        private final boolean isStaticHeader(int index) {
            return index >= 0 && index <= Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length - 1;
        }

        private final void insertIntoDynamicTable(int index, Header entry) {
            this.headerList.add(entry);
            int delta = entry.hpackSize;
            if (index != -1) {
                Header header = this.dynamicTable[dynamicTableIndex(index)];
                jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(header);
                delta -= header.hpackSize;
            }
            int i = this.maxDynamicTableByteCount;
            if (delta > i) {
                clearDynamicTable();
                return;
            }
            int bytesToRecover = (this.dynamicTableByteCount + delta) - i;
            int entriesEvicted = evictToRecoverBytes(bytesToRecover);
            if (index != -1) {
                this.dynamicTable[index + dynamicTableIndex(index) + entriesEvicted] = entry;
            } else {
                int i2 = this.headerCount + 1;
                Header[] headerArr = this.dynamicTable;
                if (i2 > headerArr.length) {
                    Header[] doubled = new Header[headerArr.length * 2];
                    System.arraycopy(headerArr, 0, doubled, headerArr.length, headerArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = doubled;
                }
                int index2 = this.nextHeaderIndex;
                this.nextHeaderIndex = index2 - 1;
                this.dynamicTable[index2] = entry;
                this.headerCount++;
            }
            this.dynamicTableByteCount += delta;
        }

        private final int readByte() throws IOException {
            return Util.and(this.source.L(), 255);
        }

        public final int readInt(int firstByte, int prefixMask) throws IOException {
            int prefix = firstByte & prefixMask;
            if (prefix < prefixMask) {
                return prefix;
            }
            int result = prefixMask;
            int shift = 0;
            while (true) {
                int b = readByte();
                if ((b & 128) != 0) {
                    result += (b & 127) << shift;
                    shift += 7;
                } else {
                    return result + (b << shift);
                }
            }
        }

        public final a3 readByteString() throws IOException {
            int firstByte = readByte();
            boolean huffmanDecode = (firstByte & 128) == 128;
            long length = readInt(firstByte, 127);
            if (huffmanDecode) {
                s2 decodeBuffer = new s2();
                Huffman.INSTANCE.decode(this.source, length, decodeBuffer);
                return decodeBuffer.e();
            }
            return this.source.f(length);
        }
    }

    private final Map<a3, Integer> nameToFirstIndex() {
        Header[] headerArr = STATIC_HEADER_TABLE;
        LinkedHashMap result = new LinkedHashMap(headerArr.length);
        int length = headerArr.length;
        for (int i = 0; i < length; i++) {
            Header[] headerArr2 = STATIC_HEADER_TABLE;
            if (!result.containsKey(headerArr2[i].name)) {
                result.put(headerArr2[i].name, Integer.valueOf(i));
            }
        }
        Map<a3, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(result);
        jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(mapUnmodifiableMap, "Collections.unmodifiableMap(result)");
        return mapUnmodifiableMap;
    }

    public static final class Writer {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        public int headerCount;
        public int headerTableSizeSetting;
        public int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final s2 out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        public Writer(int i, s2 s2Var) {
            this(i, false, s2Var, 2, null);
        }

        public Writer(s2 s2Var) {
            this(0, false, s2Var, 3, null);
        }

        public Writer(int headerTableSizeSetting, boolean useCompression, s2 out) {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(out, "out");
            this.headerTableSizeSetting = headerTableSizeSetting;
            this.useCompression = useCompression;
            this.out = out;
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            this.maxDynamicTableByteCount = headerTableSizeSetting;
            Header[] headerArr = new Header[8];
            this.dynamicTable = headerArr;
            this.nextHeaderIndex = headerArr.length - 1;
        }

        public /* synthetic */ Writer(int i, boolean z, s2 s2Var, int i2, t6 t6Var) {
            this((i2 & 1) != 0 ? Hpack.SETTINGS_HEADER_TABLE_SIZE : i, (i2 & 2) != 0 ? true : z, s2Var);
        }

        private final void clearDynamicTable() {
            c2.d(this.dynamicTable, null, 0, 0, 6);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int evictToRecoverBytes(int bytesToRecover) {
            int i;
            int bytesToRecover2 = bytesToRecover;
            int entriesToEvict = 0;
            if (bytesToRecover2 > 0) {
                int j = this.dynamicTable.length;
                while (true) {
                    j--;
                    i = this.nextHeaderIndex;
                    if (j < i || bytesToRecover2 <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[j];
                    jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(header);
                    bytesToRecover2 -= header.hpackSize;
                    int i2 = this.dynamicTableByteCount;
                    Header header2 = this.dynamicTable[j];
                    jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(header2);
                    this.dynamicTableByteCount = i2 - header2.hpackSize;
                    this.headerCount--;
                    entriesToEvict++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i + 1, headerArr, i + 1 + entriesToEvict, this.headerCount);
                Header[] headerArr2 = this.dynamicTable;
                int i3 = this.nextHeaderIndex;
                Arrays.fill(headerArr2, i3 + 1, i3 + 1 + entriesToEvict, (Object) null);
                this.nextHeaderIndex += entriesToEvict;
            }
            return entriesToEvict;
        }

        private final void insertIntoDynamicTable(Header entry) {
            int delta = entry.hpackSize;
            int i = this.maxDynamicTableByteCount;
            if (delta > i) {
                clearDynamicTable();
                return;
            }
            int bytesToRecover = (this.dynamicTableByteCount + delta) - i;
            evictToRecoverBytes(bytesToRecover);
            int i2 = this.headerCount + 1;
            Header[] headerArr = this.dynamicTable;
            if (i2 > headerArr.length) {
                Header[] doubled = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, doubled, headerArr.length, headerArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = doubled;
            }
            int index = this.nextHeaderIndex;
            this.nextHeaderIndex = index - 1;
            this.dynamicTable[index] = entry;
            this.headerCount++;
            this.dynamicTableByteCount += delta;
        }

        public final void writeHeaders(List<Header> list) throws IOException {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(list, "headerBlock");
            if (this.emitDynamicTableSizeUpdate) {
                int i = this.smallestHeaderTableSizeSetting;
                if (i < this.maxDynamicTableByteCount) {
                    writeInt(i, Hpack.PREFIX_5_BITS, 32);
                }
                this.emitDynamicTableSizeUpdate = false;
                this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
                writeInt(this.maxDynamicTableByteCount, Hpack.PREFIX_5_BITS, 32);
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Header header = list.get(i2);
                a3 name = header.name.m();
                a3 value = header.value;
                int headerIndex = -1;
                int headerNameIndex = -1;
                Hpack hpack = Hpack.INSTANCE;
                Integer staticIndex = hpack.getNAME_TO_FIRST_INDEX().get(name);
                if (staticIndex != null && 2 <= (headerNameIndex = staticIndex.intValue() + 1) && 7 >= headerNameIndex) {
                    if (jd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(hpack.getSTATIC_HEADER_TABLE()[headerNameIndex - 1].value, value)) {
                        headerIndex = headerNameIndex;
                    } else if (jd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(hpack.getSTATIC_HEADER_TABLE()[headerNameIndex].value, value)) {
                        headerIndex = headerNameIndex + 1;
                    }
                }
                if (headerIndex == -1) {
                    int length = this.dynamicTable.length;
                    for (int j = this.nextHeaderIndex + 1; j < length; j++) {
                        Header header2 = this.dynamicTable[j];
                        jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(header2);
                        if (jd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(header2.name, name)) {
                            Header header3 = this.dynamicTable[j];
                            jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(header3);
                            if (jd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(header3.value, value)) {
                                headerIndex = (j - this.nextHeaderIndex) + Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length;
                                break;
                            } else if (headerNameIndex == -1) {
                                headerNameIndex = (j - this.nextHeaderIndex) + Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length;
                            }
                        }
                    }
                }
                if (headerIndex == -1) {
                    if (headerNameIndex == -1) {
                        this.out.j0(64);
                        writeByteString(name);
                        writeByteString(value);
                        insertIntoDynamicTable(header);
                    } else if (!name.l(Header.PSEUDO_PREFIX) || !(!jd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(Header.TARGET_AUTHORITY, name))) {
                        writeInt(headerNameIndex, Hpack.PREFIX_6_BITS, 64);
                        writeByteString(value);
                        insertIntoDynamicTable(header);
                    } else {
                        writeInt(headerNameIndex, 15, 0);
                        writeByteString(value);
                    }
                } else {
                    writeInt(headerIndex, 127, 128);
                }
            }
        }

        public final void writeInt(int value, int prefixMask, int bits) {
            if (value < prefixMask) {
                this.out.j0(bits | value);
                return;
            }
            this.out.j0(bits | prefixMask);
            int value2 = value - prefixMask;
            while (value2 >= 128) {
                int b = value2 & 127;
                this.out.j0(b | 128);
                value2 >>>= 7;
            }
            this.out.j0(value2);
        }

        public final void writeByteString(a3 data) throws IOException {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(data, "data");
            if (this.useCompression) {
                Huffman huffman = Huffman.INSTANCE;
                if (huffman.encodedLength(data) < data.k()) {
                    s2 huffmanBuffer = new s2();
                    huffman.encode(data, huffmanBuffer);
                    a3 huffmanBytes = huffmanBuffer.e();
                    writeInt(huffmanBytes.k(), 127, 128);
                    this.out.f0(huffmanBytes);
                    return;
                }
            }
            writeInt(data.k(), 127, 0);
            this.out.f0(data);
        }

        public final void resizeHeaderTable(int headerTableSizeSetting) {
            this.headerTableSizeSetting = headerTableSizeSetting;
            int effectiveHeaderTableSize = Math.min(headerTableSizeSetting, 16384);
            int i = this.maxDynamicTableByteCount;
            if (i == effectiveHeaderTableSize) {
                return;
            }
            if (effectiveHeaderTableSize < i) {
                this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, effectiveHeaderTableSize);
            }
            this.emitDynamicTableSizeUpdate = true;
            this.maxDynamicTableByteCount = effectiveHeaderTableSize;
            adjustDynamicTableByteCount();
        }

        private final void adjustDynamicTableByteCount() {
            int i = this.maxDynamicTableByteCount;
            int i2 = this.dynamicTableByteCount;
            if (i < i2) {
                if (i == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i2 - i);
                }
            }
        }
    }

    public final a3 checkLowercase(a3 name) throws IOException {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(name, "name");
        int iK = name.k();
        for (int i = 0; i < iK; i++) {
            byte b = (byte) 65;
            byte b2 = (byte) 90;
            byte bXadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = name.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
            if (b <= bXadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa && b2 >= bXadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.n());
            }
        }
        return name;
    }
}
