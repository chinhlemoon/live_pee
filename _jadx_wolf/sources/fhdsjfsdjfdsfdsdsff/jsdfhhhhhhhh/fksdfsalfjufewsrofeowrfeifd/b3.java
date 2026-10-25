package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.support.v4.graphics.drawable.C0009;
import androidx.annotation.C0023;
import androidx.core.app.C0052;
import androidx.emoji2.text.C0084;
import androidx.savedstate.C0126;
import okhttp3.C0238;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.logging.C0230;
import okhttp3.logging.C0232;
import okhttp3.logging.C0235;

/* JADX INFO: loaded from: classes.dex */
public final class b3 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f220short = {3051, 3024, 3035, 3014, 3022, 3035, 3037, 3018, 3035, 3034, 2974, 3030, 3035, 3014, 2974, 3034, 3031, 3033, 3031, 3018, 2948, 2974, 3032, 2952, 2964, 2965, 2959, 3032, 2975, 2963, 2961, 2961, 2963, 2962, 2987, 2958, 2965, 2952, 2969, 1601, 1622, 1605, 1605, 1606, 1617};
    public static final char[] xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        if ('a' <= c && 'f' >= c) {
            return (c - 'a') + 10;
        }
        if ('A' <= c && 'F' >= c) {
            return (c - 'A') + 10;
        }
        StringBuilder sb = new StringBuilder();
        C0235.m9501(sb, C0126.m4877(m5892(), 0, 22, 3006));
        C0230.m9172(sb, c);
        throw new IllegalArgumentException(C0009.m261(sb));
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0139  */
    /* JADX WARN: Code duplicated, block: B:139:0x0193  */
    /* JADX WARN: Code duplicated, block: B:168:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:221:0x0262  */
    /* JADX WARN: Code duplicated, block: B:246:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:280:0x0309  */
    /* JADX WARN: Code duplicated, block: B:311:0x0367  */
    /* JADX WARN: Code duplicated, block: B:345:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:372:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:380:0x0401 A[PHI: r25
  0x0401: PHI (r25v10 int) = (r25v9 int), (r25v12 int) binds: [B:379:0x03ff, B:352:0x03c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:434:0x0494  */
    /* JADX WARN: Code duplicated, block: B:459:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:493:0x0536  */
    /* JADX WARN: Code duplicated, block: B:528:0x0597  */
    /* JADX WARN: Code duplicated, block: B:558:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:592:0x064e  */
    /* JADX WARN: Code duplicated, block: B:600:0x065d A[PHI: r25
  0x065d: PHI (r25v3 int) = (r25v0 int), (r25v1 int), (r25v4 int) binds: [B:656:0x06d8, B:629:0x069f, B:599:0x065b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:622:0x0692  */
    /* JADX WARN: Code duplicated, block: B:649:0x06cb  */
    public static final int xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(byte[] bArr, int i) {
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        int i8 = 0;
        boolean z2 = false;
        int length = bArr.length;
        int i9 = 0;
        while (i9 < length) {
            byte b = bArr[i9];
            byte b2 = 127;
            boolean z3 = false;
            int i10 = 2;
            if (b >= 0) {
                int i11 = i8 + 1;
                if (i8 == i) {
                    return i7;
                }
                if (b != 10 && b != 13) {
                    if ((b >= 0 && 31 >= b) || (127 <= b && 159 >= b)) {
                        return -1;
                    }
                }
                if (b == 65533) {
                    return -1;
                }
                i7 += b < 65536 ? 1 : 2;
                i9++;
                i8 = i11;
                while (i9 < length && bArr[i9] >= 0) {
                    int i12 = i9 + 1;
                    byte b3 = bArr[i9];
                    int i13 = i8 + 1;
                    if (i8 == i) {
                        return i7;
                    }
                    if (b3 != 10 && b3 != 13) {
                        if ((b3 >= 0 && 31 >= b3) || (b2 <= b3 && 159 >= b3)) {
                            return -1;
                        }
                    }
                    if (b3 == 65533) {
                        return -1;
                    }
                    i7 += b3 < 65536 ? 1 : 2;
                    i9 = i12;
                    i8 = i13;
                    b2 = 127;
                }
                z = z2;
            } else if ((b >> 5) == -2) {
                if (length <= i9 + 1) {
                    i6 = i8 + 1;
                    if (i8 == i) {
                        return i7;
                    }
                    if (65533 != 10 && 65533 != 13) {
                        if ((65533 >= 0 && 31 >= 65533) || (127 <= 65533 && 159 >= 65533)) {
                            z3 = true;
                        }
                        if (z3) {
                            return -1;
                        }
                    }
                    if (65533 == 65533) {
                        return -1;
                    }
                    i7 += 65533 < 65536 ? 1 : 2;
                    C0052.m1880();
                    z = z2;
                    i10 = 1;
                } else {
                    byte b4 = bArr[i9];
                    byte b5 = bArr[i9 + 1];
                    if ((b5 & 192) == 128) {
                        z = z2;
                        int i14 = (b5 ^ 3968) ^ (b4 << 6);
                        if (i14 < 128) {
                            int i15 = i8 + 1;
                            if (i8 == i) {
                                return i7;
                            }
                            if (65533 != 10 && 65533 != 13) {
                                if (65533 >= 0 && 31 >= 65533) {
                                    z3 = true;
                                } else if (127 <= 65533 && 159 >= 65533) {
                                    z3 = true;
                                }
                                if (z3) {
                                    return -1;
                                }
                            }
                            if (65533 == 65533) {
                                return -1;
                            }
                            i7 += 65533 >= 65536 ? 2 : 1;
                            C0052.m1880();
                            i6 = i15;
                        } else {
                            int i16 = i8 + 1;
                            if (i8 == i) {
                                return i7;
                            }
                            if (i14 != 10 && i14 != 13) {
                                if (i14 >= 0 && 31 >= i14) {
                                    z3 = true;
                                } else if (127 <= i14 && 159 >= i14) {
                                    z3 = true;
                                }
                                if (z3) {
                                    return -1;
                                }
                            }
                            if (i14 == 65533) {
                                return -1;
                            }
                            i7 += i14 >= 65536 ? 2 : 1;
                            C0052.m1880();
                            i6 = i16;
                        }
                    } else {
                        int i17 = i8 + 1;
                        if (i8 == i) {
                            return i7;
                        }
                        z = z2;
                        if (65533 != 10 && 65533 != 13) {
                            if (65533 >= 0 && 31 >= 65533) {
                                z3 = true;
                            } else if (127 <= 65533 && 159 >= 65533) {
                                z3 = true;
                            }
                            if (z3) {
                                return -1;
                            }
                        }
                        if (65533 == 65533) {
                            return -1;
                        }
                        i7 += 65533 < 65536 ? 1 : 2;
                        C0052.m1880();
                        i6 = i17;
                        i10 = 1;
                    }
                }
                i9 += i10;
                i8 = i6;
            } else {
                z = z2;
                if ((b >> 4) == -2) {
                    if (length <= i9 + 2) {
                        i5 = i8 + 1;
                        if (i8 == i) {
                            return i7;
                        }
                        if (65533 != 10 && 65533 != 13) {
                            if ((65533 >= 0 && 31 >= 65533) || (127 <= 65533 && 159 >= 65533)) {
                                return -1;
                            }
                        }
                        if (65533 == 65533) {
                            return -1;
                        }
                        i7 += 65533 < 65536 ? 1 : 2;
                        C0052.m1880();
                        if (length <= i9 + 1) {
                            i10 = 1;
                        } else {
                            if (!((192 & bArr[i9 + 1]) == 128)) {
                                i10 = 1;
                            }
                        }
                    } else {
                        byte b6 = bArr[i9];
                        byte b7 = bArr[i9 + 1];
                        if ((b7 & 192) == 128) {
                            byte b8 = bArr[i9 + 2];
                            if ((b8 & 192) == 128) {
                                int i18 = (((-123008) ^ b8) ^ (b7 << 6)) ^ (b6 << 12);
                                if (i18 < 2048) {
                                    i4 = i8 + 1;
                                    if (i8 == i) {
                                        return i7;
                                    }
                                    if (65533 != 10 && 65533 != 13) {
                                        if (65533 >= 0 && 31 >= 65533) {
                                            z3 = true;
                                        } else if (127 <= 65533 && 159 >= 65533) {
                                            z3 = true;
                                        }
                                        if (z3) {
                                            return -1;
                                        }
                                    }
                                    if (65533 == 65533) {
                                        return -1;
                                    }
                                    i7 += 65533 < 65536 ? 1 : 2;
                                } else {
                                    if (55296 <= i18 && 57343 >= i18) {
                                        i4 = i8 + 1;
                                        if (i8 == i) {
                                            return i7;
                                        }
                                        if (65533 != 10 && 65533 != 13) {
                                            if (65533 >= 0 && 31 >= 65533) {
                                                z3 = true;
                                            } else if (127 <= 65533 && 159 >= 65533) {
                                                z3 = true;
                                            }
                                            if (z3) {
                                                return -1;
                                            }
                                        }
                                        if (65533 == 65533) {
                                            return -1;
                                        }
                                        if (65533 < 65536) {
                                            i10 = 1;
                                        }
                                    } else {
                                        i4 = i8 + 1;
                                        if (i8 == i) {
                                            return i7;
                                        }
                                        if (i18 != 10 && i18 != 13) {
                                            if (i18 >= 0 && 31 >= i18) {
                                                z3 = true;
                                            } else if (127 <= i18 && 159 >= i18) {
                                                z3 = true;
                                            }
                                            if (z3) {
                                                return -1;
                                            }
                                        }
                                        if (i18 == 65533) {
                                            return -1;
                                        }
                                        if (i18 < 65536) {
                                            i10 = 1;
                                        }
                                    }
                                    i7 += i10;
                                }
                                C0052.m1880();
                                i5 = i4;
                                i10 = 3;
                            } else {
                                int i19 = i8 + 1;
                                if (i8 == i) {
                                    return i7;
                                }
                                if (65533 != 10 && 65533 != 13) {
                                    if (65533 >= 0 && 31 >= 65533) {
                                        z3 = true;
                                    } else if (127 <= 65533 && 159 >= 65533) {
                                        z3 = true;
                                    }
                                    if (z3) {
                                        return -1;
                                    }
                                }
                                if (65533 == 65533) {
                                    return -1;
                                }
                                i7 += 65533 >= 65536 ? 2 : 1;
                                C0052.m1880();
                                i5 = i19;
                            }
                        } else {
                            int i20 = i8 + 1;
                            if (i8 == i) {
                                return i7;
                            }
                            if (65533 != 10 && 65533 != 13) {
                                if (65533 >= 0 && 31 >= 65533) {
                                    z3 = true;
                                } else if (127 <= 65533 && 159 >= 65533) {
                                    z3 = true;
                                }
                                if (z3) {
                                    return -1;
                                }
                            }
                            if (65533 == 65533) {
                                return -1;
                            }
                            i7 += 65533 < 65536 ? 1 : 2;
                            C0052.m1880();
                            i5 = i20;
                            i10 = 1;
                        }
                    }
                    i9 += i10;
                    i8 = i5;
                } else if ((b >> 3) == -2) {
                    if (length <= i9 + 3) {
                        i3 = i8 + 1;
                        if (i8 == i) {
                            return i7;
                        }
                        if (65533 != 10 && 65533 != 13) {
                            if ((65533 >= 0 && 31 >= 65533) || (127 <= 65533 && 159 >= 65533)) {
                                return -1;
                            }
                        }
                        if (65533 == 65533) {
                            return -1;
                        }
                        i7 += 65533 < 65536 ? 1 : 2;
                        C0052.m1880();
                        if (length <= i9 + 1) {
                            i10 = 1;
                        } else {
                            if (!((192 & bArr[i9 + 1]) == 128)) {
                                i10 = 1;
                            } else if (length > i9 + 2) {
                                if ((192 & bArr[i9 + 2]) == 128) {
                                    i10 = 3;
                                }
                            }
                        }
                    } else {
                        byte b9 = bArr[i9];
                        byte b10 = bArr[i9 + 1];
                        if ((192 & b10) == 128) {
                            byte b11 = bArr[i9 + 2];
                            if ((192 & b11) == 128) {
                                byte b12 = bArr[i9 + 3];
                                if ((b12 & 192) == 128) {
                                    int i21 = (((3678080 ^ b12) ^ (b11 << 6)) ^ (b10 << 12)) ^ (b9 << 18);
                                    if (i21 > 1114111) {
                                        i2 = i8 + 1;
                                        if (i8 == i) {
                                            return i7;
                                        }
                                        if (65533 != 10 && 65533 != 13) {
                                            if (65533 >= 0 && 31 >= 65533) {
                                                z3 = true;
                                            } else if (127 <= 65533 && 159 >= 65533) {
                                                z3 = true;
                                            }
                                            if (z3) {
                                                return -1;
                                            }
                                        }
                                        if (65533 == 65533) {
                                            return -1;
                                        }
                                        i7 += 65533 < 65536 ? 1 : 2;
                                    } else {
                                        if (55296 <= i21 && 57343 >= i21) {
                                            i2 = i8 + 1;
                                            if (i8 == i) {
                                                return i7;
                                            }
                                            if (65533 != 10 && 65533 != 13) {
                                                if (65533 >= 0 && 31 >= 65533) {
                                                    z3 = true;
                                                } else if (127 <= 65533 && 159 >= 65533) {
                                                    z3 = true;
                                                }
                                                if (z3) {
                                                    return -1;
                                                }
                                            }
                                            if (65533 == 65533) {
                                                return -1;
                                            }
                                            if (65533 < 65536) {
                                                i10 = 1;
                                            }
                                        } else if (i21 < 65536) {
                                            i2 = i8 + 1;
                                            if (i8 == i) {
                                                return i7;
                                            }
                                            if (65533 != 10 && 65533 != 13) {
                                                if (65533 >= 0 && 31 >= 65533) {
                                                    z3 = true;
                                                } else if (127 <= 65533 && 159 >= 65533) {
                                                    z3 = true;
                                                }
                                                if (z3) {
                                                    return -1;
                                                }
                                            }
                                            if (65533 == 65533) {
                                                return -1;
                                            }
                                            if (65533 < 65536) {
                                                i10 = 1;
                                            }
                                        } else {
                                            i2 = i8 + 1;
                                            if (i8 == i) {
                                                return i7;
                                            }
                                            if (i21 != 10 && i21 != 13) {
                                                if (i21 >= 0 && 31 >= i21) {
                                                    z3 = true;
                                                } else if (127 <= i21 && 159 >= i21) {
                                                    z3 = true;
                                                }
                                                if (z3) {
                                                    return -1;
                                                }
                                            }
                                            if (i21 == 65533) {
                                                return -1;
                                            }
                                            if (i21 < 65536) {
                                                i10 = 1;
                                            }
                                        }
                                        i7 += i10;
                                    }
                                    C0052.m1880();
                                    i3 = i2;
                                    i10 = 4;
                                } else {
                                    int i22 = i8 + 1;
                                    if (i8 == i) {
                                        return i7;
                                    }
                                    if (65533 != 10 && 65533 != 13) {
                                        if (65533 >= 0 && 31 >= 65533) {
                                            z3 = true;
                                        } else if (127 <= 65533 && 159 >= 65533) {
                                            z3 = true;
                                        }
                                        if (z3) {
                                            return -1;
                                        }
                                    }
                                    if (65533 == 65533) {
                                        return -1;
                                    }
                                    i7 += 65533 < 65536 ? 1 : 2;
                                    C0052.m1880();
                                    i3 = i22;
                                    i10 = 3;
                                }
                            } else {
                                int i23 = i8 + 1;
                                if (i8 == i) {
                                    return i7;
                                }
                                if (65533 != 10 && 65533 != 13) {
                                    if (65533 >= 0 && 31 >= 65533) {
                                        z3 = true;
                                    } else if (127 <= 65533 && 159 >= 65533) {
                                        z3 = true;
                                    }
                                    if (z3) {
                                        return -1;
                                    }
                                }
                                if (65533 == 65533) {
                                    return -1;
                                }
                                i7 += 65533 >= 65536 ? 2 : 1;
                                C0052.m1880();
                                i3 = i23;
                            }
                        } else {
                            int i24 = i8 + 1;
                            if (i8 == i) {
                                return i7;
                            }
                            if (65533 != 10 && 65533 != 13) {
                                if (65533 >= 0 && 31 >= 65533) {
                                    z3 = true;
                                } else if (127 <= 65533 && 159 >= 65533) {
                                    z3 = true;
                                }
                                if (z3) {
                                    return -1;
                                }
                            }
                            if (65533 == 65533) {
                                return -1;
                            }
                            i7 += 65533 < 65536 ? 1 : 2;
                            C0052.m1880();
                            i3 = i24;
                            i10 = 1;
                        }
                    }
                    i9 += i10;
                    i8 = i3;
                } else {
                    int i25 = i8 + 1;
                    if (i8 == i) {
                        return i7;
                    }
                    if ((65533 >= 0 && 31 >= 65533) || (127 <= 65533 && 159 >= 65533)) {
                        z3 = true;
                    }
                    if (z3 || 65533 == 65533) {
                        return -1;
                    }
                    i7 += 65533 < 65536 ? 1 : 2;
                    i9++;
                    i8 = i25;
                }
            }
            z2 = z;
        }
        return i7;
    }

    public static final void xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(a3 a3Var, s2 s2Var, int i, int i2) {
        C0215.m8639(a3Var, C0181.m7457(m5892(), 22, 17, 3068));
        C0215.m8639(s2Var, C0023.m823(m5892(), 39, 6, 1571));
        C0187.m7646(s2Var, C0232.m9295(a3Var), i, i2);
    }

    public static final char[] xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa() {
        return C0238.m9664();
    }

    /* JADX INFO: renamed from: ۟۠۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static short[] m5892() {
        if (C0084.m3253() <= 0) {
            return f220short;
        }
        return null;
    }
}
