package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.StrictMode;
import android.support.v4.app.C0002;
import android.support.v4.app.C0004;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0009;
import android.support.v4.graphics.drawable.C0011;
import androidx.activity.C0014;
import androidx.activity.C0017;
import androidx.activity.C0021;
import androidx.annotation.C0024;
import androidx.appcompat.app.C0036;
import androidx.appcompat.app.C0037;
import androidx.appcompat.view.menu.C0039;
import androidx.appcompat.view.menu.C0040;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0053;
import androidx.core.graphics.drawable.C0064;
import androidx.core.graphics.drawable.C0065;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0084;
import androidx.fragment.app.C0094;
import androidx.lifecycle.C0107;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0122;
import androidx.savedstate.C0126;
import androidx.savedstate.C0127;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.C0227;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.logging.C0235;
import okhttp3.logging.C0236;

/* JADX INFO: loaded from: classes.dex */
public class ar {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f212short = {511, 439, 446, 447, 421, 3083, 2301, 2256, 2265, 2252, 2255, 2248, 2250, 2252, 2282, 2246, 2244, 2265, 2248, 2269, 2300, 2269, 2240, 2245, 1913, 1870, 1870, 1875, 1870, 1820, 1887, 1875, 1868, 1861, 1877, 1874, 1883, 1820, 1870, 1881, 1871, 1875, 1865, 1870, 1887, 1881, 1820, 1887, 1875, 1874, 1864, 1881, 1874, 1864, 1871, 1820, 1864, 1875, 1820, 1864, 1881, 1873, 1868, 1820, 1882, 1877, 1872, 1881, 1798, 1820, 1282};

    public static class xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa {
        public static ParcelFileDescriptor xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(ContentResolver contentResolver, Uri uri, String str, CancellationSignal cancellationSignal) throws FileNotFoundException {
            return C0065.m2437(contentResolver, uri, str, cancellationSignal);
        }
    }

    public static void xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(Closeable closeable) {
        if (closeable != null) {
            try {
                C0211.m8384(closeable);
            } catch (IOException e) {
            }
        }
    }

    public static File xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(Context context) {
        File fileM3243 = C0084.m3243(context);
        if (fileM3243 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        C0235.m9501(sb, C0127.m4990(m5884(), 0, 5, 465));
        C0126.m4911(sb, C0094.m3432());
        String strM9616 = C0236.m9616(m5884(), 5, 1, 3110);
        C0235.m9501(sb, strM9616);
        C0126.m4911(sb, C0181.m7415());
        C0235.m9501(sb, strM9616);
        String strM261 = C0009.m261(sb);
        for (int i = 0; i < 100; i++) {
            StringBuilder sb2 = new StringBuilder();
            C0235.m9501(sb2, strM261);
            C0126.m4911(sb2, i);
            File file = new File(fileM3243, C0009.m261(sb2));
            try {
                if (C0011.m408(file)) {
                    return file;
                }
            } catch (IOException e) {
            }
        }
        return null;
    }

    public static ByteBuffer xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(Context context, Resources resources, int i) {
        File fileM8275 = C0204.m8275(context);
        if (fileM8275 == null) {
            return null;
        }
        try {
            if (C0094.m3383(fileM8275, resources, i)) {
                return C0120.m4609(fileM8275);
            }
            return null;
        } finally {
            C0037.m1410(fileM8275);
        }
    }

    public static boolean xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(File file, Resources resources, int i) {
        InputStream inputStreamM1982 = null;
        try {
            inputStreamM1982 = C0053.m1982(resources, i);
            return C0162.m6821(file, inputStreamM1982);
        } finally {
            C0187.m7644(inputStreamM1982);
        }
    }

    public static boolean xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream = null;
        StrictMode.ThreadPolicy threadPolicyM1549 = C0039.m1549();
        try {
            fileOutputStream = new FileOutputStream(file, false);
            byte[] bArr = new byte[1024];
            while (true) {
                int iM40 = C0002.m40(inputStream, bArr);
                if (iM40 == -1) {
                    return true;
                }
                C0122.m4713(fileOutputStream, bArr, 0, iM40);
                C0187.m7644(fileOutputStream);
                C0064.m2398(threadPolicyM1549);
            }
        } catch (IOException e) {
            C0182.m7561(m5884(), 6, 18, 2217);
            StringBuilder sb = new StringBuilder();
            C0235.m9501(sb, C0227.m9074(m5884(), 24, 46, 1852));
            C0235.m9501(sb, C0017.m605(e));
            C0009.m261(sb);
            return false;
        } finally {
            C0187.m7644(fileOutputStream);
            C0064.m2398(threadPolicyM1549);
        }
    }

    public static ByteBuffer xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(Context context, CancellationSignal cancellationSignal, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorM753 = C0021.m753(C0113.m4141(context), uri, C0172.m7173(m5884(), 70, 1, 1392), cancellationSignal);
            if (parcelFileDescriptorM753 == null) {
                if (parcelFileDescriptorM753 != null) {
                    C0053.m1981(parcelFileDescriptorM753);
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(C0078.m3013(parcelFileDescriptorM753));
                try {
                    FileChannel fileChannelM500 = C0014.m500(fileInputStream);
                    MappedByteBuffer mappedByteBufferM194 = C0006.m194(fileChannelM500, C0049.m1713(), 0L, C0040.m1620(fileChannelM500));
                    C0036.m1338(fileInputStream);
                    C0053.m1981(parcelFileDescriptorM753);
                    return mappedByteBufferM194;
                } catch (Throwable th) {
                    try {
                        C0036.m1338(fileInputStream);
                    } catch (Throwable th2) {
                        C0107.m3940(th, th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    C0053.m1981(parcelFileDescriptorM753);
                } catch (Throwable th4) {
                    C0107.m3940(th3, th4);
                }
                throw th3;
            }
        } catch (IOException e) {
            return null;
        }
    }

    public static ByteBuffer xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileChannel fileChannelM500 = C0014.m500(fileInputStream);
                MappedByteBuffer mappedByteBufferM194 = C0006.m194(fileChannelM500, C0049.m1713(), 0L, C0040.m1620(fileChannelM500));
                C0036.m1338(fileInputStream);
                return mappedByteBufferM194;
            } catch (Throwable th) {
                try {
                    C0036.m1338(fileInputStream);
                } catch (Throwable th2) {
                    C0107.m3940(th, th2);
                }
                throw th;
            }
        } catch (IOException e) {
            return null;
        }
    }

    public static Map<Uri, ByteBuffer> xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(Context context, n9.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa[] xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaVarArr, CancellationSignal cancellationSignal) {
        HashMap map = new HashMap();
        for (n9.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaVar : xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaVarArr) {
            if (C0024.m881(xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaVar) == 0) {
                Uri uriM7509 = C0182.m7509(xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaVar);
                if (!C0002.m16(map, uriM7509)) {
                    C0219.m8791(map, uriM7509, C0116.m4311(context, cancellationSignal, uriM7509));
                }
            }
        }
        return C0004.m153(map);
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۡ, reason: not valid java name and contains not printable characters */
    public static short[] m5884() {
        if (C0021.m740() < 0) {
            return f212short;
        }
        return null;
    }
}
