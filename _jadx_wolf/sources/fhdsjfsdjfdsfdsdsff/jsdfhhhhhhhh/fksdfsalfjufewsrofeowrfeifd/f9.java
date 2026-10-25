package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.support.v4.app.C0002;
import android.support.v4.app.C0004;
import android.support.v4.graphics.drawable.C0009;
import androidx.annotation.C0023;
import androidx.appcompat.app.C0037;
import androidx.core.app.C0055;
import androidx.core.graphics.drawable.C0064;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0079;
import androidx.emoji2.text.C0084;
import androidx.fragment.app.C0093;
import androidx.lifecycle.C0107;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0118;
import androidx.savedstate.C0122;
import com.example.vcam.C0141;
import de.robv.android.xposed.XposedBridge;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import okhttp3.C0238;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0235;
import okhttp3.logging.C0236;

/* JADX INFO: loaded from: classes.dex */
public class f9 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f275short = {14914, 2561, 2577, 2579, 2591, 2583, 2560, 2579, 2674, 2580, 2587, 2570, 2674, 2590, 5252, 2587, 14915, 2562, 2592, 2621, 2609, 2615, 2593, 2593, 2619, 2620, 2613, 2674, 2567, 2560, 2587, 2664, 2674, 1506, 1518, 1519, 1525, 1508, 1519, 1525, 3172, 3167, 3154, 3144, 3147, 3159, 3162, 3138, 3172, 3157, 3162, 3158, 3166, 12804, 583, 599, 597, 601, 593, 582, 597, 564, 594, 605, 588, 564, 600, 7362, 605, 12805, 594, 637, 632, 625, 564, 634, 629, 633, 625, 558, 564, 384, 415, 402, 403, 409, 389, 14098, 1873, 1857, 1859, 1871, 1863, 1872, 1859, 1826, 1860, 1867, 1882, 1826, 1870, 6612, 1867, 14099, 1857, 1904, 1895, 1891, 1910, 1895, 1894, 1826, 1889, 1891, 1889, 1898, 1895, 1826, 1894, 1899, 1904, 1848, 1826, 13519, 1164, 1180, 1182, 1170, 1178, 1165, 1182, 1279, 1177, 1174, 1159, 1279, 1171, 6665, 1174, 13518, 1177, 1206, 1203, 1210, 1279, 1212, 1200, 1199, 1206, 1210, 1211, 1279, 1195, 1200, 1253, 1279, 12807, 580, 596, 598, 602, 594, 581, 598, 567, 593, 606, 591, 567, 603, 7361, 606, 12806, 603, 7360, 638, 567, 636, 639, 638, 567, 635, 7346, 622, 567, 774, 935, 7370, 633, 624, 567, 627, 7356, 633, 567, 611, 7420, 567, 578, 581, 606, 557, 567, 1008, 1023, 1018, 1011, 14429, 2078, 2062, 2060, 2048, 2056, 2079, 2060, 2157, 2059, 2052, 2069, 2157, 2049, 5787, 2052, 14428, 2059, 2084, 2081, 2088, 2157, 2109, 2092, 2105, 2085, 2157, 2091, 2111, 2082, 2080, 2157, 2072, 2079, 2052, 2167, 2157};

    /* JADX WARN: Code duplicated, block: B:46:0x014e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static String xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(Context context, Uri uri) {
        StringBuilder sb = new StringBuilder();
        C0235.m9501(sb, C0093.m3362(m5974(), 0, 33, 2642));
        C0235.m9501(sb, C0194.m7862(uri));
        m5975(C0009.m261(sb));
        if (!C0238.m9709(C0117.m4431(m5974(), 33, 7, 1409), C0199.m7988(uri))) {
            if (!C0238.m9709(C0107.m3950(m5974(), 203, 4, 918), C0199.m7988(uri))) {
                return null;
            }
            String strM2382 = C0064.m2382(uri);
            StringBuilder sb2 = new StringBuilder();
            C0235.m9501(sb2, C0194.m7874(m5974(), 207, 37, 2125));
            C0235.m9501(sb2, strM2382);
            m5975(C0009.m261(sb2));
            return strM2382;
        }
        try {
            ContentResolver contentResolverM4141 = C0113.m4141(context);
            Cursor cursorM7629 = C0187.m7629(contentResolverM4141, uri, null, null, null, null);
            if (cursorM7629 == null || !C0182.m7518(cursorM7629)) {
                return null;
            }
            String strM9562 = C0236.m9562(cursorM7629, C0162.m6860(cursorM7629, C0204.m8281(m5974(), 40, 13, 3131)));
            C0235.m9521(cursorM7629);
            StringBuilder sb3 = new StringBuilder();
            C0235.m9501(sb3, C0004.m119(m5974(), 53, 28, 532));
            C0235.m9501(sb3, strM9562);
            m5975(C0009.m261(sb3));
            File file = new File(C0084.m3243(context), C0023.m823(m5974(), 81, 6, 502));
            if (!C0164.m6887(file)) {
                C0023.m808(file);
                StringBuilder sb4 = new StringBuilder();
                C0235.m9501(sb4, C0235.m9515(m5974(), 87, 36, 1794));
                C0235.m9501(sb4, C0116.m4296(file));
                m5975(C0009.m261(sb4));
            }
            File file2 = new File(file, strM9562);
            InputStream inputStreamM1445 = C0037.m1445(contentResolverM4141, uri);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int iM40 = C0002.m40(inputStreamM1445, bArr);
                        if (iM40 == -1) {
                            String strM4296 = C0116.m4296(file2);
                            StringBuilder sb5 = new StringBuilder();
                            C0235.m9501(sb5, C0055.m2066(m5974(), 123, 33, 1247));
                            C0235.m9501(sb5, strM4296);
                            m5975(C0009.m261(sb5));
                            C0079.m3087(fileOutputStream);
                            C0118.m4519(inputStreamM1445);
                            return strM4296;
                        }
                        C0122.m4713(fileOutputStream, bArr, 0, iM40);
                        if (inputStreamM1445 != null) {
                            try {
                                C0118.m4519(inputStreamM1445);
                            } catch (Throwable th) {
                                C0107.m3940(th, th);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        C0079.m3087(fileOutputStream);
                    } catch (Throwable th3) {
                        C0107.m3940(th2, th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                if (inputStreamM1445 != null) {
                    C0118.m4519(inputStreamM1445);
                }
                throw th4;
            }
        } catch (Exception e) {
            StringBuilder sb6 = new StringBuilder();
            C0235.m9501(sb6, C0141.m5774(m5974(), 156, 47, 535));
            C0235.m9501(sb6, C0225.m8949(e));
            m5975(C0009.m261(sb6));
            return null;
        }
    }

    /* JADX INFO: renamed from: ۟ۢۡۨۦ, reason: not valid java name and contains not printable characters */
    public static short[] m5974() {
        if (C0217.m8693() < 0) {
            return f275short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static void m5975(Object obj) {
        if (C0078.m3044() < 0) {
            XposedBridge.log((String) obj);
        }
    }
}
