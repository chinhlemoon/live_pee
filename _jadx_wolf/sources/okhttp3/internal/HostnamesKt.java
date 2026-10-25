package okhttp3.internal;

import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class HostnamesKt {
    public static final String toCanonicalHost(String $this$toCanonicalHost) {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa($this$toCanonicalHost, "$this$toCanonicalHost");
        if (mo.v($this$toCanonicalHost, ":", false, 2)) {
            InetAddress inetAddress = (lo.q($this$toCanonicalHost, "[", false, 2) && lo.c($this$toCanonicalHost, "]", false, 2)) ? decodeIpv6($this$toCanonicalHost, 1, $this$toCanonicalHost.length() - 1) : decodeIpv6($this$toCanonicalHost, 0, $this$toCanonicalHost.length());
            if (inetAddress == null) {
                return null;
            }
            byte[] address = inetAddress.getAddress();
            if (address.length == 16) {
                jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(address, "address");
                return inet6AddressToAscii(address);
            }
            if (address.length == 4) {
                return inetAddress.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + $this$toCanonicalHost + '\'');
        }
        try {
            String ascii = IDN.toASCII($this$toCanonicalHost);
            jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(ascii, "IDN.toASCII(host)");
            Locale locale = Locale.US;
            jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(locale, "Locale.US");
            String result = ascii.toLowerCase(locale);
            jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(result, "(this as java.lang.String).toLowerCase(locale)");
            if ((result.length() == 0) || containsInvalidHostnameAsciiCodes(result)) {
                return null;
            }
            return result;
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    private static final boolean containsInvalidHostnameAsciiCodes(String $this$containsInvalidHostnameAsciiCodes) {
        int length = $this$containsInvalidHostnameAsciiCodes.length();
        for (int i = 0; i < length; i++) {
            char c = $this$containsInvalidHostnameAsciiCodes.charAt(i);
            if (jd.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(c, 31) <= 0 || jd.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(c, 127) >= 0 || mo.F(" #%/:?@[\\]", c, 0, false, 6) != -1) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c A[LOOP:1: B:29:0x004f->B:33:0x005c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x0064 A[EDGE_INSN: B:55:0x0064->B:34:0x0064 BREAK  A[LOOP:1: B:29:0x004f->B:33:0x005c], SYNTHETIC] */
    private static final InetAddress decodeIpv6(String input, int pos, int limit) {
        int value;
        int groupLength;
        int hexDigit;
        byte[] address = new byte[16];
        int b = 0;
        int compress = -1;
        int groupOffset = -1;
        int i = pos;
        while (i < limit) {
            if (b == address.length) {
                return null;
            }
            if (i + 2 <= limit && lo.p(input, "::", i, false, 4)) {
                if (compress != -1) {
                    return null;
                }
                i += 2;
                b += 2;
                compress = b;
                if (i == limit) {
                    break;
                }
                value = 0;
                groupOffset = i;
                while (i < limit) {
                    hexDigit = Util.parseHexDigit(input.charAt(i));
                    if (hexDigit == -1) {
                        break;
                        break;
                    }
                    value = (value << 4) + hexDigit;
                    i++;
                }
                groupLength = i - groupOffset;
                if (groupLength != 0) {
                }
                return null;
            }
            if (b != 0) {
                if (lo.p(input, ":", i, false, 4)) {
                    i++;
                } else {
                    if (!lo.p(input, ".", i, false, 4) || !decodeIpv4Suffix(input, groupOffset, limit, address, b - 2)) {
                        return null;
                    }
                    b += 2;
                    break;
                }
            }
            value = 0;
            groupOffset = i;
            while (i < limit) {
                hexDigit = Util.parseHexDigit(input.charAt(i));
                if (hexDigit == -1) {
                    break;
                }
                value = (value << 4) + hexDigit;
                i++;
            }
            groupLength = i - groupOffset;
            if (groupLength != 0 || groupLength > 4) {
                return null;
            }
            int b2 = b + 1;
            address[b] = (byte) ((value >>> 8) & 255);
            b = b2 + 1;
            address[b2] = (byte) (value & 255);
        }
        if (b != address.length) {
            if (compress == -1) {
                return null;
            }
            System.arraycopy(address, compress, address, address.length - (b - compress), b - compress);
            Arrays.fill(address, compress, (address.length - b) + compress, (byte) 0);
        }
        return InetAddress.getByAddress(address);
    }

    private static final boolean decodeIpv4Suffix(String input, int pos, int limit, byte[] address, int addressOffset) {
        int b = addressOffset;
        int i = pos;
        while (i < limit) {
            if (b == address.length) {
                return false;
            }
            if (b != addressOffset) {
                if (input.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int value = 0;
            int groupOffset = i;
            while (i < limit) {
                char c = input.charAt(i);
                if (jd.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(c, 48) < 0 || jd.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(c, 57) > 0) {
                    break;
                }
                if ((value == 0 && groupOffset != i) || (value = ((value * 10) + c) - 48) > 255) {
                    return false;
                }
                i++;
            }
            int groupLength = i - groupOffset;
            if (groupLength == 0) {
                return false;
            }
            address[b] = (byte) value;
            b++;
        }
        return b == addressOffset + 4;
    }

    private static final String inet6AddressToAscii(byte[] address) {
        int longestRunOffset = -1;
        int longestRunLength = 0;
        int i = 0;
        while (i < address.length) {
            int currentRunOffset = i;
            while (i < 16 && address[i] == 0 && address[i + 1] == 0) {
                i += 2;
            }
            int currentRunLength = i - currentRunOffset;
            if (currentRunLength > longestRunLength && currentRunLength >= 4) {
                longestRunOffset = currentRunOffset;
                longestRunLength = currentRunLength;
            }
            i += 2;
        }
        s2 result = new s2();
        int i2 = 0;
        while (i2 < address.length) {
            if (i2 == longestRunOffset) {
                result.j0(58);
                i2 += longestRunLength;
                if (i2 == 16) {
                    result.j0(58);
                }
            } else {
                if (i2 > 0) {
                    result.j0(58);
                }
                int group = (Util.and(address[i2], 255) << 8) | Util.and(address[i2 + 1], 255);
                result.l0(group);
                i2 += 2;
            }
        }
        return result.X();
    }
}
