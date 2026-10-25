package com.example.vcam;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.C0002;
import android.support.v4.app.C0003;
import android.support.v4.graphics.drawable.C0009;
import androidx.activity.C0019;
import androidx.activity.C0020;
import androidx.activity.C0022;
import androidx.annotation.C0024;
import androidx.annotation.C0025;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.C0035;
import androidx.appcompat.app.C0037;
import androidx.appcompat.widget.C0047;
import androidx.core.app.C0051;
import androidx.drawerlayout.widget.C0071;
import androidx.emoji2.text.C0079;
import androidx.emoji2.text.C0082;
import androidx.emoji2.text.C0083;
import androidx.emoji2.text.C0084;
import androidx.fragment.app.C0096;
import androidx.lifecycle.C0107;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0116;
import androidx.savedstate.C0125;
import de.robv.android.xposed.XposedBridge;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.c0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ur;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y;
import java.io.File;
import okhttp3.C0238;
import okhttp3.internal.C0227;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0168;
import okhttp3.internal.cache.C0170;
import okhttp3.internal.cache2.C0174;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http2.C0190;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.proxy.C0212;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.internal.tls.C0221;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0230;
import okhttp3.logging.C0233;
import okhttp3.logging.C0235;
import retrofit2.converter.scalars.C0245;
import retrofit2.http.C0246;
import retrofit2.http.C0247;
import retrofit2.internal.C0255;

/* JADX INFO: loaded from: classes.dex */
public class VideoPickerActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f177short = {15235, 3008, 3024, 3026, 3038, 3030, 3009, 3026, 2995, 3029, 3034, 3019, 2995, 3039, 5445, 3034, 15234, 2691, 2928, 2995, 3056, 3067, 5470, 3069, 2995, 3045, 3066, 3063, 3062, 3068, 2995, 3047, 5496, 2995, 3047, 3067, 2595, 2995, 3045, 3066, 5460, 3069, 2985, 2995, 1269, 1286, 1477, 1414, 1421, 6952, 1419, 1477, 1427, 1420, 1409, 1408, 1418, 1503, 1477, 14114, 1889, 1905, 1907, 1919, 1911, 1888, 1907, 1810, 1908, 1915, 1898, 1810, 1918, 6628, 1915, 14115, 1918, 6629, 1883, 1800, 1810, 1882, 1885, 1885, 1881, 1919, 1875, 1883, 1884, 1915, 1884, 1857, 1862, 1875, 1884, 1873, 1879, 1810, 1886, 2002, 1810, 1884, 1863, 1886, 1886, 3141, 4830, 3168, 3123, 3113, 3138, 3169, 3325, 3175, 3182, 3113, 3197, 3169, 4810, 3113, 3178, 4772, 3193, 3113, 3175, 3169, 4772, 3197, 3113, 3199, 3168, 3181, 3180, 3174, 12980, 759, 743, 741, 745, 737, 758, 741, 644, 738, 749, 764, 644, 744, 7282, 749, 12981, 744, 7283, 717, 670, 644, 751, 716, 592, 714, 707, 644, 720, 716, 7271, 644, 712, 7169, 733, 644, 949, 788, 7289, 714, 707, 644, 704, 7183, 714, 644, 722, 717, 704, 705, 715, 644, 720, 7247, 644, 753, 758, 749, 3024, 5451, 3061, 2982, 3004, 3031, 3060, 2920, 3058, 3067, 3004, 3048, 3060, 5471, 3004, 3056, 5433, 3045, 3004, 2701, 2604, 5441, 3058, 3067, 3004, 3064, 5431, 3058, 3004, 3050, 3061, 3064, 3065, 3059, 1276, 1267, 1273, 1263, 1266, 1268, 1273, 1203, 1268, 1267, 1257, 1272, 1267, 1257, 1203, 1276, 1278, 1257, 1268, 1266, 1267, 1203, 1242, 1240, 1225, 1218, 1246, 1234, 1235, 1225, 1240, 1235, 1225, 2277, 2298, 2295, 2294, 2300, 2236, 2233, 611, 620, 614, 624, 621, 619, 614, 556, 619, 620, 630, 615, 620, 630, 556, 609, 611, 630, 615, 613, 621, 624, 635, 556, 589, 594, 583, 588, 579, 576, 590, 583, 13511, 1156, 1172, 1174, 1178, 1170, 1157, 1174, 1271, 1169, 1182, 1167, 1271, 1179, 6657, 1182, 13510, 1179, 6656, 1214, 1271, 1212, 1215, 1214, 1271, 1210, 6664, 1271, 1187, 1189, 1083, 1209, 1215, 1271, 1204, 1215, 6682, 1209, 1271, 1185, 1214, 1203, 1202, 1208, 1261, 1271, 3280, 3315, 3183, 3317, 3324, 3259, 3311, 3315, 4696, 3259, 3318, 4676, 3259, 3311, 3305, 3191, 3317, 3315, 3259, 3320, 3315, 4694, 3317, 3259, 3309, 3314, 3327, 3326, 3316, 13727, 1500, 1484, 1486, 1474, 1482, 1501, 1486, 1455, 1481, 1478, 1495, 1455, 1475, 7001, 1478, 13726, 1497, 1510, 1515, 1514, 1504, 1503, 1510, 1516, 1508, 1514, 1533, 1486, 1516, 1531, 1510, 1529, 1510, 1531, 1526, 1455, 1504, 1505, 1484, 1533, 1514, 1518, 1531, 1514, 1455, 1516, 1518, 1507, 1507, 1514, 1515, 2256, 2271, 2261, 2243, 2270, 2264, 2261, 2207, 2241, 2260, 2243, 2268, 2264, 2242, 2242, 2264, 2270, 2271, 2207, 2275, 2292, 2288, 2293, 2286, 2300, 2292, 2293, 2296, 2288, 2286, 2279, 2296, 2293, 2292, 2302, 14857, 2634, 2650, 2648, 2644, 2652, 2635, 2648, 2617, 2655, 2640, 2625, 2617, 2645, 5327, 2640, 14856, 2632, 2668, 2656, 5336, 2679, 2617, 2635, 2652, 2648, 2653, 2630, 2644, 2652, 2653, 2640, 2648, 2630, 2639, 2640, 2653, 2652, 2646, 2617, 2683, 5330, 2617, 2669, 5362, 2617, 2682, 2673, 5320, 2672, 667, 7295, 694, 760, 681, 685, 673, 7193, 694, 760, 684, 682, 685, 673, 760, 699, 7285, 680, 760, 686, 689, 700, 701, 695, 760, 969, 7195, 760, 699, 688, 7189, 694, 760, 702, 689, 692, 701};
    public static HookMain v;
    public d0<Intent> u;

    private /* synthetic */ void R(y yVar) {
        int iM3545 = C0096.m3545(yVar);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM3545 == -1) {
                        i = 1709;
                    }
                    break;
                case 204:
                    Intent intentM1272 = C0035.m1272(yVar);
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (intentM1272 != null) {
                                    i2 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                Uri uriM1403 = C0037.m1403(C0035.m1272(yVar));
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            if (uriM1403 != null) {
                                                i3 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            break;
                                        case 47417:
                                            String strM8427 = C0213.m8427(this, uriM1403);
                                            int i4 = 48767;
                                            while (true) {
                                                i4 ^= 48784;
                                                switch (i4) {
                                                    case 14:
                                                        break;
                                                    case 45:
                                                        m5708(C0051.m1837(m5710(), 134, C0245.f695 ^ (-713), 676));
                                                        C0188.m7741(C0113.m4177(this, C0217.m8706(m5710(), 192, C0174.f624 ^ (-361), 2972), 0));
                                                        break;
                                                    case 76:
                                                        StringBuilder sb = new StringBuilder();
                                                        C0235.m9501(sb, C0024.m897(m5710(), 0, C0003.f3 ^ 735, 2963));
                                                        C0235.m9501(sb, strM8427);
                                                        m5708(C0009.m261(sb));
                                                        HookMain hookMainM4326 = C0116.m4326();
                                                        int i5 = 48891;
                                                        while (true) {
                                                            i5 ^= 48908;
                                                            switch (i5) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    m5708(C0020.m654(m5710(), 59, C0221.f671 ^ 168, 1842));
                                                                    C0188.m7741(C0113.m4177(this, C0164.m6898(m5710(), 105, C0071.f65 ^ (-866), 3081), 0));
                                                                    int i6 = 49790;
                                                                    while (true) {
                                                                        i6 ^= 49807;
                                                                        switch (i6) {
                                                                            case 18:
                                                                                break;
                                                                            case 241:
                                                                                i6 = 49821;
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 503:
                                                                    if (hookMainM4326 != null) {
                                                                        i5 = 49635;
                                                                    }
                                                                    break;
                                                                case 32495:
                                                                    hookMainM4326.currentVideoPath = strM8427;
                                                                    C0149.m6524(hookMainM4326, strM8427);
                                                                    StringBuilder sb2 = new StringBuilder();
                                                                    C0235.m9501(sb2, C0182.m7561(m5710(), 44, C0082.f73 ^ (-762), 1509));
                                                                    C0235.m9501(sb2, C0141.m5776(new File(strM8427)));
                                                                    C0188.m7741(C0113.m4177(this, C0009.m261(sb2), 0));
                                                                    int i7 = 49666;
                                                                    while (true) {
                                                                        i7 ^= 49683;
                                                                        switch (i7) {
                                                                            case 17:
                                                                                i7 = 49697;
                                                                                break;
                                                                            case 50:
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                            i5 = 48953;
                                                        }
                                                        break;
                                                    case 239:
                                                        if (strM8427 != null) {
                                                            i4 = 48860;
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i4 = 48829;
                                            }
                                            break;
                                        case 47483:
                                            break;
                                        default:
                                            continue;
                                    }
                                    i3 = 48705;
                                }
                                break;
                            default:
                                continue;
                        }
                        i2 = 1802;
                    }
                    break;
                case 239:
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
        C0141.m5741(this);
    }

    public static void T(HookMain hookMain) {
        v = hookMain;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m5708(Object obj) {
        int iM8575 = C0214.m8575();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM8575 <= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    XposedBridge.log((String) obj);
                    return;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣۤۡۤ, reason: not valid java name and contains not printable characters */
    public static void m5709(Object obj, Object obj2) {
        int iM3188 = C0083.m3188();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM3188 <= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    ((VideoPickerActivity) obj).R((y) obj2);
                    return;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۤۦۦ۠, reason: not valid java name and contains not printable characters */
    public static short[] m5710() {
        int iM3188 = C0083.m3188();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM3188 < 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return f177short;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    public final void S() {
        Intent intent = new Intent(C0025.m931(m5710(), 226, C0190.f640 ^ (-64), 1181));
        C0107.m3963(intent, C0047.m1705(m5710(), 259, C0125.f104 ^ (-506), 2195));
        C0230.m9156(intent, C0233.m9376(m5710(), 266, C0022.f21 ^ (-616), 514));
        try {
            C0217.m8690(C0096.m3542(this), intent);
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        return;
                    case 49:
                        i = 1647;
                        break;
                }
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            C0235.m9501(sb, C0238.m9660(m5710(), 298, C0170.f620 ^ (-247), 1239));
            C0235.m9501(sb, C0225.m8949(e));
            m5708(C0009.m261(sb));
            C0188.m7741(C0113.m4177(this, C0191.m7768(m5710(), 344, C0019.f18 ^ (-678), 3227), 0));
            C0141.m5741(this);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m5708(C0079.m3101(m5710(), 373, C0221.f671 ^ 178, 1423));
        this.u = C0083.m3189(this, new c0(), new ur(this));
        int iM27 = C0002.m27();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM27 >= 33) {
                        i = 1709;
                    }
                    break;
                case 204:
                    String strM1705 = C0047.m1705(m5710(), 425, C0247.f697 ^ 316, 2225);
                    int iM3240 = C0084.m3240(this, strM1705);
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (iM3240 != 0) {
                                    i2 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                C0201.m8148(this);
                                int i3 = 48767;
                                while (true) {
                                    i3 ^= 48784;
                                    switch (i3) {
                                        case 14:
                                            return;
                                        case 239:
                                            i3 = 48798;
                                            break;
                                    }
                                }
                                break;
                            case 500:
                                String[] strArr = new String[1];
                                strArr[C0255.f705 ^ (-460)] = strM1705;
                                C0219.m8814(this, strArr, C0246.f696 ^ (-38));
                                int i4 = 1864;
                                while (true) {
                                    i4 ^= 1881;
                                    switch (i4) {
                                        case 17:
                                            i4 = 48674;
                                            break;
                                        case 47483:
                                            return;
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i2 = 1802;
                    }
                    break;
                case 239:
                    C0201.m8148(this);
                    return;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i == 1001) {
                        i2 = 1709;
                    }
                    break;
                case 204:
                    int length = iArr.length;
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                if (length > 0) {
                                    i3 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                int i4 = iArr[0];
                                int i5 = 1864;
                                while (true) {
                                    i5 ^= 1881;
                                    switch (i5) {
                                        case 17:
                                            if (i4 == 0) {
                                                i5 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            break;
                                        case 47417:
                                            C0201.m8148(this);
                                            int i6 = 48767;
                                            while (true) {
                                                i6 ^= 48784;
                                                switch (i6) {
                                                    case 14:
                                                        return;
                                                    case 239:
                                                        i6 = 48798;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 47483:
                                            break;
                                        default:
                                            continue;
                                    }
                                    i5 = 48705;
                                }
                                break;
                            default:
                                continue;
                        }
                        i3 = 1802;
                    }
                    m5708(C0227.m9074(m5710(), 460, C0168.f618 ^ (-776), 2585));
                    C0188.m7741(C0113.m4177(this, C0199.m7986(m5710(), 510, C0212.f662 ^ 255, 728), 1));
                    C0141.m5741(this);
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i2 = 1678;
        }
    }
}
