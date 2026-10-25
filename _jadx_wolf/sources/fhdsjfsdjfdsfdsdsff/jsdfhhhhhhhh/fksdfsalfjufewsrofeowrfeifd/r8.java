package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.support.v4.app.C0002;
import android.support.v4.app.C0004;
import android.support.v4.graphics.drawable.C0009;
import androidx.appcompat.app.C0034;
import androidx.appcompat.view.menu.C0040;
import androidx.core.app.C0051;
import androidx.core.graphics.drawable.C0062;
import androidx.fragment.app.C0096;
import androidx.fragment.app.C0097;
import androidx.lifecycle.C0107;
import androidx.lifecycle.C0108;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0119;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0123;
import androidx.savedstate.C0126;
import androidx.versionedparcelable.C0135;
import com.example.vcam.C0141;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import okhttp3.C0239;
import okhttp3.C0240;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.ws.C0224;
import okhttp3.logging.C0235;
import okhttp3.logging.C0236;
import retrofit2.converter.scalars.C0243;

/* JADX INFO: loaded from: classes.dex */
public class r8 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f459short = {835, 868, 892, 875, 870, 867, 878, 810, 880, 867, 890, 810, 878, 875, 894, 875, 804, 810, 857, 894, 888, 879, 875, 871, 810, 879, 868, 878, 879, 878, 810, 875, 876, 894, 879, 888, 810, 814, 894, 869, 894, 875, 870, 840, 883, 894, 879, 889, 856, 879, 875, 878, 810, 872, 883, 894, 879, 889, 804, 810, 847, 882, 890, 879, 873, 894, 879, 878, 810, 1144, 1082, 1057, 1068, 1085, 1067, 3200, 3239, 3247, 3237, 3240, 3261, 3244, 3259, 3305, 3245, 3232, 3245, 3305, 3239, 3238, 3261, 3305, 3247, 3232, 3239, 3232, 3258, 3233, 1851, 1814, 1819, 1809, 1880, 1803, 1887, 1805, 1818, 1822, 1819, 1887, 1818, 1809, 1808, 1802, 1816, 1815, 1887, 1821, 1798, 1803, 1818, 1804, 1887, 1819, 1802, 1805, 1814, 1809, 1816, 1887, 1819, 1818, 1820, 1808, 1810, 1807, 1805, 1818, 1804, 1804, 1814, 1808, 1809, 1873, 1887, 1818, 1799, 1807, 1818, 1820, 1803, 1818, 1819, 1858, 1064, 1129, 1131, 1148, 1149, 1129, 1124, 1077, 1274, 1243, 1216, 1172, 1233, 1242, 1243, 1217, 1235, 1244, 1172, 1238, 1229, 1216, 1233, 1223, 1172, 1216, 1243, 1172, 1222, 1233, 1237, 1232, 1166, 1172};

    public static long a(InputStream inputStream) throws IOException {
        return C0120.m4670(inputStream, 4);
    }

    public static int b(InputStream inputStream) throws IOException {
        return (int) C0120.m4670(inputStream, 1);
    }

    public static int c(String str) {
        return C0113.m4130(str, C0034.m1162()).length;
    }

    public static void d(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[512];
        while (true) {
            int iM40 = C0002.m40(inputStream, bArr);
            if (iM40 <= 0) {
                return;
            } else {
                C0119.m4542(outputStream, bArr, 0, iM40);
            }
        }
    }

    public static void e(OutputStream outputStream, byte[] bArr) throws IOException {
        C0236.m9608(outputStream, bArr.length);
        byte[] bArrM3547 = C0096.m3547(bArr);
        C0236.m9608(outputStream, bArrM3547.length);
        C0040.m1566(outputStream, bArrM3547);
    }

    public static void f(OutputStream outputStream, String str) throws IOException {
        C0040.m1566(outputStream, C0113.m4130(str, C0034.m1162()));
    }

    public static void g(OutputStream outputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        C0040.m1566(outputStream, bArr);
    }

    public static void h(OutputStream outputStream, int i) throws IOException {
        C0141.m5762(outputStream, i, 2);
    }

    public static void i(OutputStream outputStream, long j) throws IOException {
        C0141.m5762(outputStream, j, 4);
    }

    public static void j(OutputStream outputStream, int i) throws IOException {
        C0141.m5762(outputStream, i, 1);
    }

    public static int xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(int i) {
        return (((i + 8) - 1) & (-8)) / 8;
    }

    public static byte[] xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(InputStream inputStream, int i, int i2) throws IOException {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            int i3 = 0;
            int iM9898 = 0;
            byte[] bArr2 = new byte[2048];
            while (!C0135.m5308(inflater) && !C0097.m3660(inflater) && i3 < i) {
                int iM40 = C0002.m40(inputStream, bArr2);
                if (iM40 < 0) {
                    StringBuilder sb = new StringBuilder();
                    C0235.m9501(sb, C0149.m6497(m6208(), 0, 69, 778));
                    C0126.m4911(sb, i);
                    C0235.m9501(sb, C0224.m8870(m6208(), 69, 6, 1112));
                    throw C0188.m7733(C0009.m261(sb));
                }
                C0236.m9576(inflater, bArr2, 0, iM40);
                try {
                    iM9898 += C0243.m9898(inflater, bArr, iM9898, i2 - iM9898);
                    i3 += iM40;
                } catch (DataFormatException e) {
                    throw C0188.m7733(C0051.m1841(e));
                }
            }
            if (i3 == i) {
                if (!C0135.m5308(inflater)) {
                    throw C0188.m7733(C0149.m6497(m6208(), 75, 23, 3273));
                }
                C0239.m9720(inflater);
                return bArr;
            }
            StringBuilder sb2 = new StringBuilder();
            C0235.m9501(sb2, C0108.m4043(m6208(), 98, 56, 1919));
            C0126.m4911(sb2, i);
            C0235.m9501(sb2, C0119.m4598(m6208(), 154, 8, 1032));
            C0126.m4911(sb2, i3);
            throw C0188.m7733(C0009.m261(sb2));
        } catch (Throwable th) {
            C0239.m9720(inflater);
            throw th;
        }
    }

    public static byte[] xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(byte[] bArr) throws IOException {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                C0004.m106(deflaterOutputStream, bArr);
                C0240.m9837(deflaterOutputStream);
                C0123.m4783(deflater);
                return C0097.m3682(byteArrayOutputStream);
            } catch (Throwable th) {
                try {
                    C0240.m9837(deflaterOutputStream);
                } catch (Throwable th2) {
                    C0107.m3940(th, th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            C0123.m4783(deflater);
            throw th3;
        }
    }

    public static RuntimeException xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(String str) {
        return new IllegalStateException(str);
    }

    public static byte[] xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int iM2332 = C0062.m2332(inputStream, bArr, i2, i - i2);
            if (iM2332 < 0) {
                StringBuilder sb = new StringBuilder();
                C0235.m9501(sb, C0239.m9724(m6208(), 162, 26, 1204));
                C0126.m4911(sb, i);
                throw C0188.m7733(C0009.m261(sb));
            }
            i2 += iM2332;
        }
        return bArr;
    }

    public static String xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(InputStream inputStream, int i) throws IOException {
        return new String(C0191.m7780(inputStream, i), C0034.m1162());
    }

    public static long xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(InputStream inputStream, int i) throws IOException {
        byte[] bArrM7780 = C0191.m7780(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrM7780[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    public static int xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(InputStream inputStream) throws IOException {
        return (int) C0120.m4670(inputStream, 2);
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡ۠, reason: not valid java name and contains not printable characters */
    public static short[] m6208() {
        if (C0113.m4144() < 0) {
            return f459short;
        }
        return null;
    }
}
