package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.content.Context;
import android.os.Handler;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0009;
import androidx.annotation.C0023;
import androidx.core.graphics.drawable.C0065;
import androidx.lifecycle.C0108;
import androidx.profileinstaller.C0113;
import androidx.versionedparcelable.C0129;
import de.robv.android.xposed.XposedBridge;
import okhttp3.internal.C0227;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0235;

/* JADX INFO: loaded from: classes.dex */
public class nj {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f407short = {12846, 621, 637, 639, 627, 635, 620, 639, 12847, 613, 624, 625, 618, 631, 632, 615, 611, 542, 626, 7401, 599, 542, 598, 599, 7421, 592, 542, 586, 598, 7413, 542, 586, 593, 607, 589, 586, 516, 542, 14932, 2583, 2567, 2565, 2569, 2561, 2582, 2565, 14933, 2591, 2570, 2571, 2576, 2573, 2562, 2589, 2585, 2660, 2567, 2603, 2602, 2608, 2593, 2620, 2608, 2660, 2602, 2609, 2600, 2600, 2664, 2660, 2607, 2604, 2736, 2602, 2595, 2660, 2608, 2604, 5255, 2660, 2604, 2605, 5255, 2602, 2660, 2608, 2604, 5263, 2660, 2608, 2603, 2597, 2615, 2608, 2686, 2660, 13612, 1391, 1407, 1405, 1393, 1401, 1390, 1405, 13613, 1383, 1394, 1395, 1384, 1397, 1402, 1381, 1377, 1308, 1392, 7147, 1365, 1308, 1352, 7069, 1363, 1308, 1364, 1373, 1362, 1368, 1360, 1369, 1358, 1286, 1308};

    public static /* synthetic */ void xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(Context context, String str, int i) {
        try {
            C0188.m7741(C0113.m4177(context, str, i));
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            C0235.m9501(sb, C0108.m4043(m6143(), 0, 38, 574));
            C0235.m9501(sb, C0225.m8949(e));
            m6144(C0009.m261(sb));
        }
    }

    public static void xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(Context context, String str, int i) {
        if (context == null) {
            StringBuilder sb = new StringBuilder();
            C0235.m9501(sb, C0023.m823(m6143(), 38, 58, 2628));
            C0235.m9501(sb, str);
            m6144(C0009.m261(sb));
            return;
        }
        try {
            C0065.m2467(new Handler(C0227.m9043()), new mj(context, str, i));
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            C0235.m9501(sb2, C0129.m5181(m6143(), 96, 35, 1340));
            C0235.m9501(sb2, C0225.m8949(e));
            m6144(C0009.m261(sb2));
        }
    }

    /* JADX INFO: renamed from: ۦ۟۟ۧ, reason: contains not printable characters */
    public static short[] m6143() {
        if (C0172.m7180() >= 0) {
            return f407short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m6144(Object obj) {
        if (C0006.m169() < 0) {
            XposedBridge.log((String) obj);
        }
    }
}
