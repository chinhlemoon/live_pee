package com.example.vcam;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.C0001;
import android.support.v4.app.C0002;
import android.support.v4.app.C0004;
import android.support.v4.app.C0005;
import android.support.v4.app.C0008;
import android.support.v4.graphics.drawable.C0009;
import android.support.v4.graphics.drawable.C0010;
import android.support.v4.graphics.drawable.C0011;
import android.support.v4.graphics.drawable.C0012;
import androidx.activity.C0014;
import androidx.activity.C0015;
import androidx.activity.C0016;
import androidx.activity.C0017;
import androidx.activity.C0020;
import androidx.activity.C0021;
import androidx.annotation.C0023;
import androidx.annotation.C0024;
import androidx.annotation.C0025;
import androidx.annotation.C0026;
import androidx.annotation.C0029;
import androidx.annotation.C0030;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0034;
import androidx.appcompat.app.C0035;
import androidx.appcompat.app.C0036;
import androidx.appcompat.app.C0037;
import androidx.appcompat.view.menu.C0039;
import androidx.appcompat.widget.C0046;
import androidx.appcompat.widget.C0047;
import androidx.cardview.widget.C0049;
import androidx.cardview.widget.C0050;
import androidx.core.app.C0052;
import androidx.core.app.C0053;
import androidx.core.app.C0055;
import androidx.core.app.C0056;
import androidx.core.content.C0057;
import androidx.core.content.C0058;
import androidx.core.content.C0059;
import androidx.core.graphics.drawable.C0063;
import androidx.core.graphics.drawable.C0064;
import androidx.core.graphics.drawable.C0065;
import androidx.core.widget.C0068;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0071;
import androidx.drawerlayout.widget.C0072;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0079;
import androidx.emoji2.text.C0081;
import androidx.emoji2.text.C0084;
import androidx.emoji2.text.C0085;
import androidx.emoji2.text.C0086;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0095;
import androidx.fragment.app.C0096;
import androidx.fragment.app.C0097;
import androidx.fragment.app.C0098;
import androidx.fragment.app.C0099;
import androidx.lifecycle.C0106;
import androidx.lifecycle.C0107;
import androidx.lifecycle.C0109;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0119;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0122;
import androidx.savedstate.C0123;
import androidx.savedstate.C0124;
import androidx.savedstate.C0125;
import androidx.savedstate.C0126;
import androidx.savedstate.C0127;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0129;
import androidx.versionedparcelable.C0134;
import androidx.versionedparcelable.C0135;
import androidx.versionedparcelable.C0136;
import de.robv.android.xposed.XposedBridge;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0150;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0152;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0153;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ve;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.we;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.C0155;
import kotlin.jvm.internal.C0157;
import okhttp3.C0238;
import okhttp3.C0240;
import okhttp3.C0241;
import okhttp3.internal.C0227;
import okhttp3.internal.C0228;
import okhttp3.internal.authenticator.C0159;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.authenticator.C0163;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0165;
import okhttp3.internal.cache.C0167;
import okhttp3.internal.cache.C0168;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.cache2.C0173;
import okhttp3.internal.cache2.C0174;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.cache2.C0177;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.connection.C0183;
import okhttp3.internal.connection.C0184;
import okhttp3.internal.http.C0186;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http1.C0189;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0195;
import okhttp3.internal.io.C0196;
import okhttp3.internal.io.C0197;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.C0205;
import okhttp3.internal.platform.C0206;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.platform.android.C0203;
import okhttp3.internal.proxy.C0209;
import okhttp3.internal.proxy.C0210;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0216;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.tls.C0220;
import okhttp3.internal.tls.C0221;
import okhttp3.internal.ws.C0223;
import okhttp3.internal.ws.C0224;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0229;
import okhttp3.logging.C0231;
import okhttp3.logging.C0232;
import okhttp3.logging.C0233;
import okhttp3.logging.C0235;
import okhttp3.logging.C0236;
import org.json.JSONObject;
import retrofit2.C0257;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.converter.scalars.C0243;
import retrofit2.converter.scalars.C0244;
import retrofit2.http.C0246;
import retrofit2.http.C0247;
import retrofit2.http.C0248;
import retrofit2.http.C0249;
import retrofit2.http.C0250;
import retrofit2.http.C0251;
import retrofit2.http.C0252;

/* JADX INFO: loaded from: classes.dex */
public class LicenseManager {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f164short = {771, 825, 798, 792, 783, 779, 775, 842, 826, 792, 773, 907, 920, 920, 927, 1001, 1003, 1003, 2471, 2482, 2480, 2554, 1603, 1612, 1609, 1616, 1602, 1615, 1601, 1618, 1604, 618, 587, 600, 583, 589, 587, 526, 613, 587, 599, 2888, 2932, 2933, 5539, 2920, 2876, 2942, 5591, 2876, 2943, 5627, 2941, 2876, 2942, 5565, 2930, 2876, 2887, 1975, 1994, 1929, 1922, 1626, 1931, 1994, 1787, 1626, 6409, 1929, 1994, 1921, 1799, 1929, 1922, 1994, 1922, 1925, 6475, 1950, 1988, 2016, 1966, 1935, 1948, 1923, 1929, 1935, 1994, 1953, 1935, 1939, 1994, 1787, 1801, 1994, 1787, 1626, 6409, 1929, 1994, 1945, 1931, 1925, 1994, 1929, 1922, 1795, 1946, 1988, 1994, 1954, 1801, 1939, 1994, 1933, 6407, 1923, 1994, 1924, 1817, 1994, 1929, 1922, 1925, 1994, 1931, 1934, 1927, 1923, 1924, 1994, 1787, 6441, 1994, 1921, 1799, 1929, 1922, 1994, 1922, 1925, 6475, 1950, 1988, 13721, 1498, 1482, 1480, 1476, 1484, 1499, 1480, 13720, 1490, 1477, 1472, 1482, 1484, 1479, 1498, 1484, 1492, 1449, 1485, 1516, 1535, 1504, 1514, 1516, 1449, 1474, 1516, 1520, 1449, 1514, 1510, 1529, 1504, 1516, 1517, 1449, 1533, 1510, 1449, 1514, 1509, 1504, 1529, 1515, 1510, 1512, 1531, 1517, 1459, 1449, 12666, 313, 297, 299, 295, 303, 312, 299, 12667, 305, 294, 291, 297, 303, 292, 313, 303, 311, 330, 303, 280, 280, 261, 280, 330, 281, 258, 261, 285, 259, 260, 269, 330, 286, 261, 267, 281, 286, 330, 261, 280, 330, 265, 261, 282, 275, 259, 260, 269, 336, 330, 2750, 2715, 2705, 2711, 2716, 2689, 2711, 2770, 2705, 2714, 2882, 2707, 2770, 2713, 2591, 2705, 2714, 2770, 2714, 2717, 5203, 2694, 2760, 2770, 14818, 2465, 2481, 2483, 2495, 2487, 2464, 2483, 14819, 2473, 2494, 2491, 2481, 2487, 2492, 2465, 2487, 2479, 2514, 2487, 2432, 2432, 2461, 2432, 2514, 2433, 2458, 2461, 2437, 2459, 2460, 2453, 2514, 2438, 2461, 2451, 2433, 2438, 2504, 2514, 8252, 1872, 1828, 1848, 1849, 6606, 1828, 1872, 1842, 6586, 1872, 1843, 1848, 1759, 1841, 1872, 1632, 1759, 6546, 1843, 1872, 1632, 1650, 1854, 1847, 1872, 1851, 1965, 1494, 1482, 1366, 1484, 1477, 1442, 1494, 1483, 1484, 1442, 1170, 1152, 1484, 1477, 1442, 1481, 1375, 1416, 1243, 1272, 1137, 1267, 1272, 1200, 1272, 1136, 1278, 1271, 1194, 1177, 1600, 2330, 2355, 2484, 2349, 2420, 2367, 2489, 2359, 2364, 2420, 2364, 2363, 6133, 2336, 2414, 2397, 1666, 6261, 1726, 1770, 1698, 6251, 1700, 1776, 1731, 1256, 1229, 1217, 1219, 1267, 1256, 1249, 1170, 1173, 1174, 1208, 1209, 1195, 1216, 1237, 13020, 671, 655, 653, 641, 649, 670, 653, 13021, 663, 640, 645, 655, 649, 642, 671, 649, 657, 748, 648, 681, 687, 702, 693, 700, 696, 677, 674, 683, 748, 700, 685, 693, 672, 675, 685, 680, 758, 748, 1365, 1369, 1296, 1295, 1347, 1369, 984, 980, 924, 921, 917, 919, 974, 980, 15034, 2809, 2793, 2795, 2791, 2799, 2808, 2795, 15035, 2801, 2790, 2787, 2793, 2799, 2788, 2809, 2799, 2807, 2698, 2798, 2767, 2761, 2757, 2766, 2767, 2766, 2698, 2778, 2763, 2771, 2758, 2757, 2763, 2766, 2698, 2758, 2767, 2756, 2765, 2782, 2754, 2704, 2698, 2088, 2084, 2112, 2145, 2151, 2155, 2144, 2145, 2144, 2084, 2125, 2130, 2084, 2152, 2145, 2154, 2147, 2160, 2156, 2110, 2084, 1401, 1405, 1387, 1303, 1403, 1402, 1403, 1303, 1384, 1395, 1403, 1387, 1293, 1384, 1369, 1372, 1372, 1361, 1366, 1375, 2967, 3030, 2966, 3031, 2965, 3032, 2968, 3033, 2969, 3034, 2970, 3035, 2971, 3036, 2972, 3037, 2973, 3038, 2974, 3039, 2975, 3030, 2944, 3031, 2945, 3032, 2946, 3033, 2947, 3034, 2948, 3035, 2964, 2960, 2950, 13708, 1487, 1503, 1501, 1489, 1497, 1486, 1501, 13709, 1479, 1488, 1493, 1503, 1497, 1490, 1487, 1497, 1473, 1468, 1496, 1529, 1535, 1518, 1509, 1516, 1512, 1525, 1523, 1522, 1468, 1519, 1513, 1535, 1535, 1529, 1519, 1519, 1530, 1513, 1520, 1446, 1468, 651, 650, 651, 646, 640, 2667, 2678, 2674, 2682, 2668, 2667, 2686, 2674, 2671, 2820, 2901, 2821, 2900, 2822, 2907, 2823, 2906, 2816, 2905, 2817, 2904, 2818, 2911, 2819, 2910, 2844, 2909, 2845, 2908, 2846, 2901, 2847, 2900, 2840, 2907, 2841, 2906, 2842, 2905, 2843, 2904, 13790, 1437, 1421, 1423, 1411, 1419, 1436, 1423, 13791, 1429, 1410, 1415, 1421, 1419, 1408, 1437, 1419, 1427, 1518, 1414, 1411, 1423, 1421, 1518, 1464, 1451, 1468, 1447, 1448, 1447, 1453, 1455, 1466, 1447, 1441, 1440, 1518, 1448, 1455, 1447, 1442, 1451, 1450, 1524, 1518, 1451, 1462, 1470, 1451, 1453, 1466, 1451, 1450, 1518, 1894, 1898, 1837, 1829, 1854, 1898, 12805, 582, 598, 596, 600, 592, 583, 596, 12804, 590, 601, 604, 598, 592, 603, 582, 592, 584, 565, 583, 624, 614, 613, 634, 635, 614, 624, 565, 624, 621, 613, 636, 615, 624, 625, 559, 565, 609, 636, 632, 624, 614, 609, 628, 632, 613, 552, 1653, 1657, 1594, 1580, 1579, 1579, 1596, 1591, 1581, 1636, 14133, 1910, 1894, 1892, 1896, 1888, 1911, 1892, 14132, 1918, 1897, 1900, 1894, 1888, 1899, 1910, 1888, 1912, 1797, 1901, 1896, 1892, 1894, 1797, 1860, 1867, 1857, 1797, 1873, 1868, 1864, 1856, 1878, 1873, 1860, 1864, 1877, 1797, 1875, 1856, 1879, 1868, 1859, 1868, 1856, 1857, 1797, 1878, 1872, 1862, 1862, 1856, 1878, 1878, 1859, 1872, 1865, 1865, 1884, 12900, 551, 567, 565, 569, 561, 550, 565, 12901, 559, 568, 573, 567, 561, 570, 551, 561, 553, 596, 569, 541, 519, 519, 541, 538, 531, 596, 538, 539, 538, 535, 529, 596, 539, 518, 596, 512, 541, 537, 529, 519, 512, 533, 537, 516, 596, 541, 538, 596, 518, 529, 519, 516, 539, 538, 519, 529, 12677, 454, 470, 468, 472, 464, 455, 468, 12676, 462, 473, 476, 470, 464, 475, 454, 464, 456, 437, 465, 496, 502, 487, 492, 485, 481, 508, 506, 507, 437, 499, 500, 508, 505, 496, 497, 437, 497, 480, 496, 437, 481, 506, 437, 482, 487, 506, 507, 498, 437, 503, 505, 506, 502, 510, 437, 505, 496, 507, 498, 481, 509, 431, 437, 353, 365, 285, 300, 308, 289, 290, 300, 297, 365, 289, 296, 291, 298, 313, 293, 375, 365, 2796, 2784, 2693, 2744, 2736, 2725, 2723, 2740, 2725, 2724, 2784, 2733, 2741, 2732, 2740, 
    2729, 2736, 2732, 2725, 2784, 2735, 2726, 2784, 2801, 2806, 12722, 497, 481, 483, 495, 487, 496, 483, 12723, 505, 494, 491, 481, 487, 492, 497, 487, 511, 386, 491, 460, 468, 451, 462, 459, 454, 386, 466, 451, 475, 462, 461, 451, 454, 386, 461, 464, 386, 491, 500, 386, 462, 455, 460, 453, 470, 458, 408, 386, 466, 451, 475, 462, 461, 451, 454, 415, 2346, 2342, 2415, 2416, 2363, 13803, 1448, 1464, 1466, 1462, 1470, 1449, 1466, 13802, 1440, 1463, 1458, 1464, 1470, 1461, 1448, 1470, 1446, 1499, 1471, 1438, 1432, 1417, 1410, 1419, 1423, 1426, 1428, 1429, 1499, 1437, 1434, 1426, 1431, 1438, 1439, 1473, 1499, 2330, 2326, 2405, 2370, 2391, 2389, 2397, 2326, 2370, 2372, 2391, 2389, 2387, 2316, 2326, 3297, 3297, 3242, 3272, 3272, 3242, 3324, 3324, 3324, 3324, 13776, 1427, 1411, 1409, 1421, 1413, 1426, 1409, 13777, 1435, 1420, 1417, 1411, 1413, 1422, 1427, 1413, 1437, 1504, 1413, 1458, 1458, 1455, 1458, 1504, 1456, 1441, 1458, 1459, 1449, 1454, 1447, 1504, 1445, 1464, 1456, 1449, 1458, 1465, 1504, 1444, 1441, 1460, 1445, 1530, 1504, 894, 882, 883, 883, 888, 894, 873, 884, 875, 884, 873, 868, 15506, 3281, 3265, 3267, 3279, 3271, 3280, 3267, 15507, 3289, 3278, 3275, 3265, 3271, 3276, 3281, 3271, 3295, 3234, 3271, 3312, 3312, 3309, 3312, 3234, 3297, 3306, 3303, 3297, 3305, 3307, 3308, 3301, 3234, 3308, 3303, 3318, 3317, 3309, 3312, 3305, 3256, 3234, 489, 495, 505, 505, 511, 489, 489, 509, 501, 483, 483, 497, 503, 501, 1570, 1575, 1586, 1575, 2627, 2645, 2643, 2644, 2639, 2637, 2629, 2642, 2687, 2638, 2625, 2637, 2629, 267, 265, 286, 259, 284, 267, 286, 259, 261, 260, 309, 270, 267, 286, 271, 2477, 2480, 2488, 2465, 2490, 2481, 2455, 2476, 2473, 2492, 2477, 397, 389, 398, 405, 447, 398, 385, 397, 389, 1070, 1044, 1075, 1077, 1058, 1062, 1066, 1127, 1047, 1077, 1064, 1708, 1700, 1711, 1716, 1694, 1698, 1710, 1709, 1710, 1715, 841, 858, 858, 861, 811, 809, 809, 14716, 2367, 2351, 2349, 2337, 2345, 2366, 2349, 14717, 2359, 2336, 2341, 2351, 2345, 2338, 2367, 2345, 2353, 2380, 2336, 2309, 2319, 2313, 2306, 2335, 2313, 2380, 2330, 2317, 2304, 2309, 2312, 2380, 2314, 2307, 2334, 2390, 2380, 3261, 3304, 3315, 3305, 3316, 3313, 3261, 15014, 2789, 2805, 2807, 2811, 2803, 2788, 2807, 15015, 2797, 2810, 2815, 2805, 2803, 2808, 2789, 2803, 2795, 2710, 2811, 2771, 2776, 2755, 2710, 2776, 2775, 2779, 2771, 2700, 2710, 2603, 2599, 2634, 2658, 2665, 2674, 2599, 2660, 2664, 2667, 2664, 2677, 2621, 2599, 14245, 2022, 2038, 2036, 2040, 2032, 2023, 2036, 14244, 2030, 2041, 2044, 2038, 2032, 2043, 2022, 2032, 2024, 1941, 2041, 2012, 2006, 2000, 2011, 1990, 2000, 1941, 2000, 1997, 1989, 2012, 1991, 2000, 2001, 1935, 1941, 1671, 1698, 1704, 1710, 1701, 1720, 1710, 1771, 2010, 1576, 1771, 1699, 6260, 1727, 1771, 1699, 6250, 1701, 1777, 1771, 13354, 1129, 1145, 1147, 1143, 1151, 1128, 1147, 13355, 1121, 1142, 1139, 1145, 1151, 1140, 1129, 1151, 1127, 1050, 1142, 1107, 1113, 1119, 1108, 1097, 1119, 1050, 1107, 1108, 1100, 1115, 1110, 1107, 1118, 1024, 1050, 13566, 1213, 1197, 1199, 1187, 1195, 1212, 1199, 13567, 1205, 1186, 1191, 1197, 1195, 1184, 1213, 1195, 1203, 1230, 1195, 1180, 1180, 1153, 1180, 1230, 1182, 1167, 1180, 1181, 1159, 1152, 1161, 1230, 1154, 1159, 1165, 1163, 1152, 1181, 1163, 1230, 1180, 1163, 1181, 1182, 1153, 1152, 1181, 1163, 1236, 1230, 595, 7368, 630, 575, 615, 7410, 575, 627, 738, 575, 635, 7408, 575, 627, 630, 7384, 618, 549, 575, 15068, 2719, 2703, 2701, 2689, 2697, 2718, 2701, 15069, 2711, 2688, 2693, 2703, 2697, 2690, 2719, 2697, 2705, 2796, 2714, 2729, 2750, 2725, 2730, 2741, 2725, 2722, 2731, 2796, 2720, 2725, 2735, 2729, 2722, 2751, 2729, 2796, 2730, 2723, 2750, 2796, 2728, 2729, 2746, 2725, 2735, 2729, 2806, 2796, 1744, 1779, 1647, 1781, 1788, 1723, 1784, 1640, 1723, 1776, 6180, 1775, 1723, 1781, 6218, 1778, 1723, 1782, 6202, 1781, 1788, 1998, 2005, 2000, 2005, 2004, 1996, 2005};
    public final Handler a;
    public String b;
    public boolean c;
    public Context xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
    public String xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
    public boolean xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = false;
    public String xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
    public String xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
    public String xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
    public String xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
    public LicenseCallback xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;

    public interface LicenseCallback {
        void onLicenseVerified(boolean z, String str, String str2, String str3);
    }

    public class xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa implements Runnable {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f165short = {15020, 2799, 2815, 2813, 2801, 2809, 2798, 2813, 15021, 2791, 2800, 2805, 2815, 2809, 2802, 2799, 2809, 2785, 2716, 2796, 2777, 2766, 2773, 2771, 2776, 2773, 2783, 2716, 2768, 2773, 2783, 2777, 2770, 2767, 2777, 2716, 2783, 2772, 2777, 2783, 2775, 2716, 2760, 2766, 2773, 2779, 2779, 2777, 2766, 2777, 2776};
        public final LicenseManager xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;

        public xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(LicenseManager licenseManager) {
            this.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = licenseManager;
        }

        /* JADX INFO: renamed from: ۟ۥۢۦۡ, reason: not valid java name and contains not printable characters */
        public static short[] m5556() {
            int iM9365 = C0233.m9365();
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        if (iM9365 < 0) {
                            i = 1709;
                        }
                        break;
                    case 204:
                        return f165short;
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

        /* JADX INFO: renamed from: ۟ۦۢۦۧ, reason: not valid java name and contains not printable characters */
        public static void m5557(Object obj) {
            int iM8184 = C0201.m8184();
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        if (iM8184 < 0) {
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

        @Override // java.lang.Runnable
        public void run() {
            String strM1961 = C0053.m1961(C0127.m4942(this));
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        if (strM1961 != null) {
                            i = 1709;
                        }
                        break;
                    case 204:
                        boolean zM8438 = C0213.m8438(C0127.m4942(this));
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    if (zM8438) {
                                        i2 = 1833;
                                    }
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case 500:
                                    boolean zM7440 = C0181.m7440(C0127.m4942(this));
                                    int i3 = 1864;
                                    while (true) {
                                        i3 ^= 1881;
                                        switch (i3) {
                                            case 17:
                                                if (!zM7440) {
                                                    i3 = 48736;
                                                }
                                                break;
                                            case 47384:
                                                break;
                                            case 47417:
                                                m5557(C0113.m4161(m5556(), 0, C0210.f660 ^ 261, 2748));
                                                LicenseManager licenseManagerM4942 = C0127.m4942(this);
                                                C0225.m8960(licenseManagerM4942, C0053.m1961(licenseManagerM4942), C0112.m4103(C0127.m4942(this)));
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
            C0097.m3698(C0039.m1521(C0127.m4942(this)), this, 599840 ^ ((long) C0150.f601));
        }
    }

    public class xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa implements Callback<String> {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f166short = {13707, 1480, 1496, 1498, 1494, 1502, 1481, 1498, 13706, 1472, 1495, 1490, 1496, 1502, 1493, 1480, 1502, 1478, 1467, 1495, 1522, 1528, 1534, 1525, 1512, 1534, 1467, 1528, 1523, 1534, 1528, 1520, 1467, 1533, 1530, 1522, 1527, 1534, 1535, 1441, 1467, 1994, 2025, 1909, 2031, 2022, 1953, 2037, 2025, 6466, 1953, 2026, 6462, 2037, 1953, 2031, 6480, 2024, 1953, 2034, 2020, 2035, 2039, 2020, 2035, 1979, 1953, 2411, 2373, 6031, 2373, 2316, 2369, 2511, 2316, 2372, 2371, 6043, 2383, 2316, 2388, 2509, 2383, 2316, 2369, 2373, 2370, 2372, 2316, 2404, 2401, 2413, 2415, 2316, 2392, 2372, 6025, 2392, 2316, 2382, 6029, 2373, 13855, 1628, 1612, 1614, 1602, 1610, 1629, 1614, 13854, 1620, 1603, 1606, 1612, 1610, 1601, 1628, 1610, 1618, 1583, 1603, 1638, 1644, 1642, 1633, 1660, 1642, 1583, 1661, 1642, 1660, 1663, 1632, 1633, 1660, 1642, 1589, 1583, 1887, 1870, 1878, 1859, 1856, 1870, 1867, 3273, 3286, 438, 435, 447, 445, 13654, 1301, 1285, 1287, 1291, 1283, 1300, 1287, 13655, 1309, 1290, 1295, 1285, 1283, 1288, 1301, 1283, 1307, 1382, 1283, 1332, 1332, 1321, 1332, 1382, 1334, 1332, 1321, 1317, 1315, 1333, 1333, 1327, 1320, 1313, 1382, 1332, 1315, 1333, 1334, 1321, 1320, 1333, 1315, 1404, 1382, 3108, 4799, 3073, 3144, 3088, 3209, 3083, 3144, 3100, 3072, 4761, 3083, 3154, 3144, 14441, 2090, 2106, 2104, 2100, 2108, 2091, 2104, 14440, 2082, 2101, 2096, 2106, 2108, 2103, 2090, 2108, 2084, 2137, 2101, 2064, 2074, 2076, 2071, 2058, 2076, 2137, 2059, 2076, 2058, 2057, 2070, 2071, 2058, 2076, 2137, 2079, 2072, 2064, 2069, 2076, 2077, 2115, 2137, 479, 8004, 506, 435, 491, 370, 496, 435, 487, 507, 8034, 496, 425, 435, 475, 455, 455, 451, 435, 1678, 1667, 1678};
        public final String xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        public final LicenseCallback xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        public final LicenseManager xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;

        public xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(LicenseManager licenseManager, String str, LicenseCallback licenseCallback) {
            this.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = licenseManager;
            this.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = str;
            this.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = licenseCallback;
        }

        /* JADX INFO: renamed from: ۠ۡۤۤ, reason: not valid java name and contains not printable characters */
        public static void m5558(Object obj) {
            int iM8604 = C0215.m8604();
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        if (iM8604 < 0) {
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

        /* JADX INFO: renamed from: ۤۨۨۥ, reason: not valid java name and contains not printable characters */
        public static short[] m5559() {
            int iM2184 = C0058.m2184();
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        if (iM2184 >= 0) {
                            i = 1709;
                        }
                        break;
                    case 204:
                        return f166short;
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

        @Override // retrofit2.Callback
        public void onFailure(Call<String> call, Throwable th) {
            C0058.m2227(C0181.m7421(this), false);
            StringBuilder sb = new StringBuilder();
            C0235.m9501(sb, C0099.m3720(m5559(), 0, C0186.f636 ^ (-387), 1435));
            C0235.m9501(sb, C0072.m2851(th));
            m5558(C0009.m261(sb));
            LicenseManager licenseManagerM7421 = C0181.m7421(this);
            StringBuilder sb2 = new StringBuilder();
            String strM495 = C0014.m495(m5559(), 41, C0250.f700 ^ 227, 1921);
            C0235.m9501(sb2, strM495);
            C0235.m9501(sb2, C0072.m2851(th));
            C0037.m1426(licenseManagerM7421, C0009.m261(sb2));
            LicenseCallback licenseCallbackM7302 = C0176.m7302(this);
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        if (licenseCallbackM7302 != null) {
                            i = 1709;
                        }
                        break;
                    case 204:
                        StringBuilder sb3 = new StringBuilder();
                        C0235.m9501(sb3, strM495);
                        C0235.m9501(sb3, C0072.m2851(th));
                        C0074.m2946(licenseCallbackM7302, false, C0009.m261(sb3), C0123.m4823(C0181.m7421(this)), C0240.m9832(C0181.m7421(this)));
                        return;
                    case 239:
                        return;
                    default:
                        continue;
                }
                i = 1678;
            }
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x01cd -> B:34:0x011b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x01db -> B:34:0x011b). Please report as a decompilation issue!!! */
        @Override // retrofit2.Callback
        public void onResponse(Call<String> call, Response<String> response) {
            int i;
            String strM5034 = C0128.m5034(m5559(), 67, C0184.f634 ^ 862, 2348);
            C0058.m2227(C0181.m7421(this), false);
            boolean zM3251 = C0084.m3251(response);
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        break;
                    case 49:
                        i2 = zM3251 ? 1709 : 1678;
                        break;
                    case 204:
                        Object objM7902 = C0195.m7902(response);
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    i3 = objM7902 != null ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case 500:
                                    try {
                                        StringBuilder sb = new StringBuilder();
                                        C0235.m9501(sb, C0026.m995(m5559(), 102, C0241.f691 ^ 541, 1551));
                                        C0235.m9501(sb, (String) C0195.m7902(response));
                                        m5558(C0009.m261(sb));
                                        JSONObject jSONObject = new JSONObject((String) C0195.m7902(response));
                                        String strM5114 = C0129.m5114(C0181.m7421(this), C0004.m129(jSONObject, C0231.m9202(m5559(), 139, C0029.f28 ^ 680, 1839)), C0004.m129(jSONObject, C0187.m7665(m5559(), 146, C0046.f40 ^ (-215), 3232)), C0004.m129(jSONObject, C0217.m8706(m5559(), 148, C0016.f15 ^ (-297), 478)), C0031.m1149(this));
                                        int i4 = 1864;
                                        while (true) {
                                            i4 ^= 1881;
                                            switch (i4) {
                                                case 17:
                                                    i4 = strM5114 != null ? 48736 : 48705;
                                                    break;
                                                case 47384:
                                                    C0037.m1426(C0181.m7421(this), strM5034);
                                                    LicenseCallback licenseCallbackM7302 = C0176.m7302(this);
                                                    int i5 = 49666;
                                                    while (true) {
                                                        i5 ^= 49683;
                                                        switch (i5) {
                                                            case 17:
                                                                i5 = licenseCallbackM7302 != null ? 49759 : 49728;
                                                                break;
                                                            case 50:
                                                                break;
                                                            case 76:
                                                                C0074.m2946(licenseCallbackM7302, false, strM5034, C0123.m4823(C0181.m7421(this)), C0240.m9832(C0181.m7421(this)));
                                                                int i6 = 49790;
                                                                while (true) {
                                                                    i6 ^= 49807;
                                                                    switch (i6) {
                                                                        case 18:
                                                                            break;
                                                                        case 241:
                                                                            i6 = 49821;
                                                                            continue;
                                                                        default:
                                                                            continue;
                                                                    }
                                                                }
                                                                break;
                                                            case 83:
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 47417:
                                                    C0211.m8369(C0181.m7421(this), strM5114);
                                                    LicenseCallback licenseCallbackM7303 = C0176.m7302(this);
                                                    int i7 = 48767;
                                                    while (true) {
                                                        i7 ^= 48784;
                                                        switch (i7) {
                                                            case 14:
                                                                break;
                                                            case 45:
                                                                break;
                                                            case 76:
                                                                C0074.m2946(licenseCallbackM7303, C0164.m6938(C0181.m7421(this)), C0169.m7052(C0181.m7421(this)), C0123.m4823(C0181.m7421(this)), C0240.m9832(C0181.m7421(this)));
                                                                int i8 = 48891;
                                                                while (true) {
                                                                    i8 ^= 48908;
                                                                    switch (i8) {
                                                                        case 22:
                                                                            break;
                                                                        case 503:
                                                                            i8 = 48922;
                                                                            continue;
                                                                        default:
                                                                            continue;
                                                                    }
                                                                }
                                                                break;
                                                            case 239:
                                                                i7 = licenseCallbackM7303 != null ? 48860 : 48829;
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 47483:
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        while (true) {
                                            i ^= 50706;
                                            switch (i) {
                                                case 19:
                                                    i = 50720;
                                                    break;
                                                case 50:
                                                    break;
                                            }
                                        }
                                    } catch (Exception e) {
                                        StringBuilder sb2 = new StringBuilder();
                                        C0235.m9501(sb2, C0011.m420(m5559(), 152, C0008.f8 ^ (-186), 1350));
                                        C0235.m9501(sb2, C0225.m8949(e));
                                        m5558(C0009.m261(sb2));
                                        LicenseManager licenseManagerM7421 = C0181.m7421(this);
                                        StringBuilder sb3 = new StringBuilder();
                                        String strM1751 = C0049.m1751(m5559(), 198, C0246.f696 ^ (-963), 3176);
                                        C0235.m9501(sb3, strM1751);
                                        C0235.m9501(sb3, C0225.m8949(e));
                                        C0037.m1426(licenseManagerM7421, C0009.m261(sb3));
                                        LicenseCallback licenseCallbackM7304 = C0176.m7302(this);
                                        int i9 = 49914;
                                        while (true) {
                                            i9 ^= 49931;
                                            switch (i9) {
                                                case 497:
                                                    i9 = licenseCallbackM7304 != null ? 50658 : 50627;
                                                    break;
                                                case 1711:
                                                    break;
                                                case 1736:
                                                    break;
                                                case 1769:
                                                    StringBuilder sb4 = new StringBuilder();
                                                    C0235.m9501(sb4, strM1751);
                                                    C0235.m9501(sb4, C0225.m8949(e));
                                                    C0074.m2946(licenseCallbackM7304, false, C0009.m261(sb4), C0123.m4823(C0181.m7421(this)), C0240.m9832(C0181.m7421(this)));
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                    }
                                    i = 50689;
                                    break;
                                default:
                                    break;
                            }
                        }
                        break;
                    case 239:
                        break;
                    default:
                        break;
                }
                return;
            }
            StringBuilder sb5 = new StringBuilder();
            C0235.m9501(sb5, C0171.m7114(m5559(), 212, C0209.f659 ^ (-630), 2169));
            C0126.m4911(sb5, C0115.m4225(response));
            m5558(C0009.m261(sb5));
            LicenseManager licenseManagerM7422 = C0181.m7421(this);
            StringBuilder sb6 = new StringBuilder();
            String strM1304 = C0035.m1304(m5559(), 256, C0221.f671 ^ 149, 403);
            C0235.m9501(sb6, strM1304);
            C0126.m4911(sb6, C0115.m4225(response));
            C0235.m9501(sb6, C0135.m5317(m5559(), 275, C0189.f639 ^ (-684), 1710));
            C0235.m9501(sb6, C0224.m8855(response));
            C0037.m1426(licenseManagerM7422, C0009.m261(sb6));
            LicenseCallback licenseCallbackM7305 = C0176.m7302(this);
            int i10 = 50813;
            while (true) {
                i10 ^= 50830;
                switch (i10) {
                    case 18:
                        break;
                    case 53:
                        return;
                    case 243:
                        if (licenseCallbackM7305 != null) {
                            i10 = 51557;
                        }
                        break;
                    case 4075:
                        StringBuilder sb7 = new StringBuilder();
                        C0235.m9501(sb7, strM1304);
                        C0126.m4911(sb7, C0115.m4225(response));
                        C0074.m2946(licenseCallbackM7305, false, C0009.m261(sb7), C0123.m4823(C0181.m7421(this)), C0240.m9832(C0181.m7421(this)));
                        return;
                    default:
                        continue;
                }
                i10 = 50875;
            }
        }
    }

    public LicenseManager(Context context) {
        String str = "ۦ۟ۨ";
        Looper looperM9043 = null;
        Handler handler = null;
        String strM3491 = null;
        String strM3309 = null;
        String strM6497 = null;
        short[] sArrM5554 = null;
        int i = 0;
        int i2 = 0;
        while (true) {
            switch (C0203.m8249(str)) {
                case 56322:
                    this.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = strM6497;
                    str = "ۦۦۥ";
                    break;
                case 56350:
                    str = "۠ۢ";
                    strM6497 = C0149.m6497(sArrM5554, 11, i, 936);
                    break;
                case 56506:
                    i = i2 ^ 886;
                    str = "ۣۢ۟";
                    break;
                case 56509:
                    str = "ۨۥۥ";
                    sArrM5554 = m5554();
                    break;
                case 1748705:
                    this.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = strM3309;
                    str = "ۦۣ";
                    break;
                case 1749574:
                    str = "ۤ۟۟";
                    strM3491 = C0095.m3491(sArrM5554, 0, i, 874);
                    break;
                case 1749663:
                    i2 = C0063.f57;
                    str = "ۣۣۢ";
                    break;
                case 1749822:
                    this.a = handler;
                    str = "ۥۤۥ";
                    break;
                case 1750628:
                    i = i2 ^ (-661);
                    str = "ۡ۟";
                    break;
                case 1751492:
                    this.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = strM3491;
                    str = "ۥۡ۠";
                    break;
                case 1751656:
                    this.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = context;
                    str = "ۥۣ۠";
                    break;
                case 1752488:
                    C0057.m2139(this);
                    str = "۟ۥۡ";
                    break;
                case 1752516:
                    str = "ۢۢ۟";
                    sArrM5554 = m5554();
                    break;
                case 1752614:
                    this.c = false;
                    str = "ۤۤۨ";
                    break;
                case 1752706:
                    this.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = strM3309;
                    str = "ۣۧۨ";
                    break;
                case 1753423:
                    str = "ۥۧۤ";
                    strM3309 = C0093.m3309();
                    break;
                case 1753637:
                    looperM9043 = C0227.m9043();
                    str = "ۨۥ۟";
                    break;
                case 1754658:
                    this.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = strM3309;
                    str = "ۡۢۢ";
                    break;
                case 1755522:
                    str = "ۣۢۧ";
                    handler = new Handler(looperM9043);
                    break;
                case 1755528:
                    i2 = C0184.f634;
                    str = "ۦ۠";
                    break;
                default:
                    return;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000c. Please report as an issue. */
    public static String i(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        int length = bArr.length;
        int i = 0;
        while (true) {
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        break;
                    case 49:
                        i2 = i < length ? 1709 : 1678;
                        break;
                    case 204:
                        break;
                    case 239:
                        break;
                    default:
                        break;
                }
                return C0009.m261(sb);
            }
            C0235.m9501(sb, C0039.m1511(C0055.m2066(m5554(), 18, C0159.f609 ^ 275, 2434), new Object[]{C0079.m3080(bArr[i])}));
            i += C0153.f604 ^ 177;
            int i3 = 1740;
            while (true) {
                i3 ^= 1757;
                switch (i3) {
                    case 17:
                        i3 = 1771;
                        break;
                    case 54:
                        break;
                }
            }
        }
    }

    private /* synthetic */ void s(String str) {
        try {
            C0058.m2212((ClipboardManager) C0069.m2736(C0052.m1875(this), C0240.m9844(m5554(), 22, C0012.f12 ^ 672, 1568)), C0036.m1316(C0231.m9202(m5554(), 31, C0246.f696 ^ (-967), 558), str));
            StringBuilder sb = new StringBuilder();
            C0235.m9501(sb, C0162.m6834(m5554(), 41, C0098.f85 ^ 254, 2844));
            C0235.m9501(sb, str);
            C0235.m9501(sb, C0025.m931(m5554(), 59, C0174.f624 ^ (-285), 2026));
            C0188.m7741(C0113.m4177(C0052.m1875(this), C0009.m261(sb), 1));
            StringBuilder sb2 = new StringBuilder();
            C0235.m9501(sb2, C0039.m1483(m5554(), 145, C0124.f103 ^ (-847), 1417));
            C0235.m9501(sb2, str);
            m5552(C0009.m261(sb2));
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
            StringBuilder sb3 = new StringBuilder();
            C0235.m9501(sb3, C0021.m727(m5554(), 196, C0139.f185 ^ (-422), 362));
            C0235.m9501(sb3, C0225.m8949(e));
            m5552(C0009.m261(sb3));
            Context contextM1875 = C0052.m1875(this);
            StringBuilder sb4 = new StringBuilder();
            C0235.m9501(sb4, C0162.m6834(m5554(), 247, C0109.f91 ^ (-676), 2802));
            C0235.m9501(sb4, str);
            C0188.m7741(C0113.m4177(contextM1875, C0009.m261(sb4), 1));
        }
    }

    private /* synthetic */ void t() {
        try {
            C0188.m7741(C0113.m4177(C0052.m1875(this), C0120.m4623(this), 1));
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
            C0235.m9501(sb, C0164.m6898(m5554(), 271, C0216.f666 ^ 355, 2546));
            C0235.m9501(sb, C0225.m8949(e));
            m5552(C0009.m261(sb));
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static void m5552(Object obj) {
        int iM7344 = C0178.m7344();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM7344 < 0) {
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

    /* JADX INFO: renamed from: ۣۤۢۤ, reason: not valid java name and contains not printable characters */
    public static void m5553(Object obj, Object obj2) {
        int iM9615 = C0236.m9615();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM9615 > 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    ((LicenseManager) obj).s((String) obj2);
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

    /* JADX INFO: renamed from: ۧ۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static short[] m5554() {
        int iM9001 = C0225.m9001();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM9001 >= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return f164short;
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

    /* JADX INFO: renamed from: ۨۧۤۤ, reason: not valid java name and contains not printable characters */
    public static void m5555(Object obj) {
        int iM4841 = C0123.m4841();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM4841 <= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    ((LicenseManager) obj).t();
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

    public final String h() {
        boolean zM4900 = C0126.m4900(this);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (!zM4900) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return C0218.m8741(m5554(), 311, C0050.f44 ^ 597, 1904);
                case 239:
                    StringBuilder sb = new StringBuilder();
                    C0235.m9501(sb, C0017.m567(m5554(), 339, C0177.f627 ^ 182, 1410));
                    C0235.m9501(sb, C0084.m3277(m5554(), 357, C0257.f707 ^ (-142), 1168));
                    C0235.m9501(sb, C0236.m9563(this));
                    String strM4431 = C0117.m4431(m5554(), 369, 1, 1610);
                    C0235.m9501(sb, strM4431);
                    C0235.m9501(sb, C0068.m2608(m5554(), 370, C0136.f115 ^ (-410), 2388));
                    C0235.m9501(sb, C0211.m8419(this));
                    C0235.m9501(sb, strM4431);
                    C0235.m9501(sb, C0064.m2410(m5554(), 386, C0086.f77 ^ (-638), 1738));
                    C0235.m9501(sb, C0122.m4695(this));
                    return C0009.m261(sb);
                default:
                    continue;
            }
            i = 1678;
        }
    }

    public final String j(String str, String str2, String str3, String str4) {
        String str5;
        String strM8457 = C0213.m8457(m5554(), 395, C0220.f670 ^ 708, 1184);
        String strM9290 = C0232.m9290(m5554(), 405, C0189.f639 ^ (-686), 1261);
        try {
            StringBuilder sb = new StringBuilder();
            C0235.m9501(sb, C0238.m9660(m5554(), 410, C0071.f65 ^ (-860), 716));
            C0235.m9501(sb, str);
            C0235.m9501(sb, C0047.m1705(m5554(), 449, C0173.f623 ^ 285, 1401));
            C0235.m9501(sb, str2);
            C0235.m9501(sb, C0020.m654(m5554(), 455, C0251.f701 ^ (-135), 1012));
            C0235.m9501(sb, str3);
            m5552(C0009.m261(sb));
            int i = C0140.f186 ^ 369;
            byte[] bArrM673 = C0020.m673(str, i);
            byte[] bArrM674 = C0020.m673(str2, i);
            StringBuilder sb2 = new StringBuilder();
            C0235.m9501(sb2, C0011.m420(m5554(), 463, C0220.f670 ^ 741, 2730));
            C0126.m4911(sb2, bArrM673.length);
            C0235.m9501(sb2, C0149.m6497(m5554(), 506, C0241.f691 ^ 557, 2052));
            C0126.m4911(sb2, bArrM674.length);
            m5552(C0009.m261(sb2));
            int length = bArrM673.length;
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                try {
                    switch (i2) {
                        case 14:
                            break;
                        case 49:
                            i2 = length != 0 ? 1709 : 1678;
                            break;
                        case 204:
                            int length2 = bArrM674.length;
                            int i3 = 1740;
                            while (true) {
                                i3 ^= 1757;
                                switch (i3) {
                                    case 17:
                                        i3 = length2 == 16 ? 1833 : 1802;
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        break;
                                    case 500:
                                        int length3 = bArrM673.length;
                                        int i4 = 1864;
                                        while (true) {
                                            i4 ^= 1881;
                                            switch (i4) {
                                                case 17:
                                                    i4 = length3 % 16 != 0 ? 48736 : 48705;
                                                    break;
                                                case 47384:
                                                    Cipher cipherM7153 = C0172.m7153(C0164.m6898(m5554(), 527, C0081.f72 ^ 363, 1336));
                                                    C0135.m5357(cipherM7153, i, new SecretKeySpec(C0213.m8485(C0023.m823(m5554(), 547, C0244.f694 ^ 440, 3055), strM9290), C0187.m7665(m5554(), 579, C0056.f50 ^ (-81), 3029)), new IvParameterSpec(bArrM674));
                                                    try {
                                                        str5 = new String(C0135.m5337(cipherM7153, bArrM673), strM9290);
                                                        StringBuilder sb3 = new StringBuilder();
                                                        C0235.m9501(sb3, C0065.m2484(m5554(), 582, C0001.f1 ^ (-431), 1436));
                                                        C0235.m9501(sb3, str5);
                                                        m5552(C0009.m261(sb3));
                                                        JSONObject jSONObject = new JSONObject(str5);
                                                        String strM2683 = C0069.m2683(jSONObject, C0014.m495(m5554(), 624, C0189.f639 ^ (-686), 741), null);
                                                        String strM823 = C0023.m823(m5554(), 629, C0086.f77 ^ (-638), 2591);
                                                        long j = (-12) ^ ((long) C0134.f113);
                                                        long jM6904 = C0164.m6904(jSONObject, strM823, j);
                                                        int i5 = 48891;
                                                        while (true) {
                                                            i5 ^= 48908;
                                                            switch (i5) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    break;
                                                                case 503:
                                                                    i5 = strM2683 != null ? 49635 : 48953;
                                                                    break;
                                                                case 32495:
                                                                    int i6 = 49666;
                                                                    while (true) {
                                                                        i6 ^= 49683;
                                                                        switch (i6) {
                                                                            case 17:
                                                                                i6 = jM6904 == j ? 49759 : 49728;
                                                                                break;
                                                                            case 50:
                                                                                break;
                                                                            case 76:
                                                                                int i7 = 49790;
                                                                                while (true) {
                                                                                    i7 ^= 49807;
                                                                                    switch (i7) {
                                                                                        case 18:
                                                                                            break;
                                                                                        case 241:
                                                                                            i7 = 49821;
                                                                                            continue;
                                                                                        default:
                                                                                            continue;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 83:
                                                                                StringBuilder sb4 = new StringBuilder();
                                                                                C0235.m9501(sb4, str);
                                                                                C0235.m9501(sb4, str2);
                                                                                C0235.m9501(sb4, strM2683);
                                                                                C0235.m9501(sb4, C0093.m3311(jM6904));
                                                                                C0235.m9501(sb4, str4);
                                                                                String strM261 = C0009.m261(sb4);
                                                                                Mac macM5099 = C0128.m5099(strM8457);
                                                                                C0034.m1156(macM5099, new SecretKeySpec(C0213.m8485(C0231.m9202(m5554(), 638, C0050.f44 ^ 617, 2924), strM9290), strM8457));
                                                                                String strM4953 = C0127.m4953(C0164.m6933(macM5099, C0213.m8485(strM261, strM9290)));
                                                                                boolean zM4779 = C0123.m4779(strM4953, str3);
                                                                                int i8 = 49914;
                                                                                while (true) {
                                                                                    i8 ^= 49931;
                                                                                    switch (i8) {
                                                                                        case 497:
                                                                                            if (!zM4779) {
                                                                                                i8 = 50658;
                                                                                            }
                                                                                            break;
                                                                                        case 1711:
                                                                                            break;
                                                                                        case 1736:
                                                                                            long jM4167 = C0113.m4167() / 1000;
                                                                                            long jM10019 = C0249.m10019(((11 + jM4167) - jM6904) - 11);
                                                                                            int i9 = 50689;
                                                                                            while (true) {
                                                                                                i9 ^= 50706;
                                                                                                switch (i9) {
                                                                                                    case 19:
                                                                                                        if (jM10019 > 30) {
                                                                                                            i9 = 50782;
                                                                                                        }
                                                                                                        break;
                                                                                                    case 45:
                                                                                                        m5552(C0195.m7915(m5554(), 787, C0015.f14 ^ (-586), 1829));
                                                                                                        break;
                                                                                                    case 50:
                                                                                                        break;
                                                                                                    case 76:
                                                                                                        StringBuilder sb5 = new StringBuilder();
                                                                                                        C0235.m9501(sb5, C0224.m8870(m5554(), 730, C0056.f50 ^ (-125), 533));
                                                                                                        C0097.m3645(sb5, jM6904);
                                                                                                        C0235.m9501(sb5, C0218.m8741(m5554(), 777, C0196.f646 ^ 428, 1625));
                                                                                                        C0097.m3645(sb5, jM4167);
                                                                                                        m5552(C0009.m261(sb5));
                                                                                                        str5 = null;
                                                                                                        break;
                                                                                                    default:
                                                                                                        continue;
                                                                                                }
                                                                                                i9 = 50751;
                                                                                            }
                                                                                            break;
                                                                                        case 1769:
                                                                                            StringBuilder sb6 = new StringBuilder();
                                                                                            C0235.m9501(sb6, C0128.m5034(m5554(), 670, C0086.f77 ^ (-579), 1486));
                                                                                            C0235.m9501(sb6, str3);
                                                                                            C0235.m9501(sb6, C0162.m6834(m5554(), 724, C0150.f601 ^ 230, 1866));
                                                                                            C0235.m9501(sb6, strM4953);
                                                                                            m5552(C0009.m261(sb6));
                                                                                            str5 = null;
                                                                                            break;
                                                                                        default:
                                                                                            continue;
                                                                                    }
                                                                                    i8 = 50627;
                                                                                }
                                                                                return str5;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        m5552(C0194.m7874(m5554(), 846, C0125.f104 ^ (-456), 628));
                                                        str5 = null;
                                                    } catch (IllegalBlockSizeException e) {
                                                        StringBuilder sb7 = new StringBuilder();
                                                        C0235.m9501(sb7, C0112.m4102(m5554(), 903, C0209.f659 ^ (-538), 405));
                                                        C0235.m9501(sb7, C0097.m3630(e));
                                                        C0235.m9501(sb7, C0112.m4102(m5554(), 967, C0056.f50 ^ (-66), 333));
                                                        C0126.m4911(sb7, bArrM673.length);
                                                        C0235.m9501(sb7, C0002.m62(m5554(), 985, C0251.f701 ^ (-152), 2752));
                                                        m5552(C0009.m261(sb7));
                                                        str5 = null;
                                                    }
                                                    return str5;
                                                case 47417:
                                                    int i10 = 48767;
                                                    while (true) {
                                                        i10 ^= 48784;
                                                        switch (i10) {
                                                            case 14:
                                                                break;
                                                            case 239:
                                                                i10 = 48798;
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 47483:
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        break;
                                    default:
                                        break;
                                }
                            }
                            break;
                        case 239:
                            break;
                        default:
                            break;
                    }
                } catch (Exception e2) {
                    e = e2;
                    int i11 = 50813;
                    while (true) {
                        i11 ^= 50830;
                        switch (i11) {
                            case 18:
                                break;
                            case 243:
                                i11 = 50844;
                                continue;
                            default:
                                continue;
                        }
                        StringBuilder sb8 = new StringBuilder();
                        C0235.m9501(sb8, C0004.m119(m5554(), 1072, C0246.f696 ^ (-1003), 1531));
                        C0235.m9501(sb8, C0225.m8949(e));
                        C0235.m9501(sb8, C0169.m7024(m5554(), 1110, C0183.f633 ^ (-302), 2358));
                        C0235.m9501(sb8, C0024.m872(e));
                        m5552(C0009.m261(sb8));
                        return null;
                    }
                }
            }
            StringBuilder sb9 = new StringBuilder();
            C0235.m9501(sb9, C0122.m4749(m5554(), 1010, C0229.f679 ^ (-946), 418));
            C0126.m4911(sb9, bArrM673.length);
            C0235.m9501(sb9, C0231.m9202(m5554(), 1067, C0229.f679 ^ (-910), 2310));
            C0126.m4911(sb9, bArrM674.length);
            m5552(C0009.m261(sb9));
            str5 = null;
            return str5;
        } catch (Exception e3) {
            e = e3;
        }
    }

    public String k() {
        return C0236.m9563(this);
    }

    public String l() {
        return C0122.m4695(this);
    }

    public String m() {
        return C0084.m3271(this);
    }

    public String n() {
        return C0181.m7467(this);
    }

    public final void o(String str) {
        this.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = false;
        LicenseCallback licenseCallbackM1770 = C0049.m1770(this);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (licenseCallbackM1770 != null) {
                        i = 1709;
                    }
                    break;
                case 204:
                    C0074.m2946(licenseCallbackM1770, false, str, C0181.m7467(this), C0084.m3271(this));
                    break;
                case 239:
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
        C0233.m9380(this, C0112.m4091(this));
    }

    public final boolean p(String str) {
        try {
            Date dateM7147 = C0172.m7147(new SimpleDateFormat(C0047.m1705(m5554(), 1125, C0085.f76 ^ 467, 3205), C0195.m7910()), str);
            Date date = new Date();
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        if (dateM7147 != null) {
                            i = 1709;
                        }
                        break;
                    case 204:
                        boolean zM8495 = C0213.m8495(dateM7147, date);
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    if (zM8495) {
                                        i2 = 1833;
                                    }
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    return false;
                                case 500:
                                    return true;
                                default:
                                    continue;
                            }
                            i2 = 1802;
                        }
                        break;
                    case 239:
                        return false;
                    default:
                        continue;
                }
                i = 1678;
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            C0235.m9501(sb, C0097.m3661(m5554(), 1135, C0228.f678 ^ (-29), 1472));
            C0235.m9501(sb, C0225.m8949(e));
            m5552(C0009.m261(sb));
            return false;
        }
    }

    public boolean q() {
        boolean zM4900 = C0126.m4900(this);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = zM4900 ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM302 = C0009.m302(this, C0122.m4695(this));
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = zM302 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            i3 = 48674;
                                            break;
                                        case 47483:
                                            return true;
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 239:
                    break;
                default:
                    break;
            }
        }
        return false;
    }

    public final boolean r() {
        try {
            NetworkInfo networkInfoM7045 = C0169.m7045((ConnectivityManager) C0069.m2736(C0052.m1875(this), C0011.m420(m5554(), 1181, C0157.f607 ^ 772, 797)));
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        i = networkInfoM7045 != null ? 1709 : 1678;
                        break;
                    case 204:
                        boolean zM8980 = C0225.m8980(networkInfoM7045);
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = zM8980 ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case 500:
                                    return true;
                                default:
                                    break;
                            }
                        }
                        break;
                    case 239:
                        break;
                    default:
                        break;
                }
            }
            return false;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            C0235.m9501(sb, C0204.m8281(m5554(), 1193, C0165.f615 ^ (-814), 3202));
            C0235.m9501(sb, C0225.m8949(e));
            m5552(C0009.m261(sb));
            return false;
        }
    }

    public final void u(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean zM7063 = C0171.m7063(jSONObject, C0122.m4749(m5554(), 1236, C0155.f605 ^ (-395), 410));
            String strM129 = C0004.m129(jSONObject, C0064.m2410(m5554(), 1243, C0030.f29 ^ (-326), 400));
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        i = zM7063 ? 1709 : 1678;
                        break;
                    case 204:
                        JSONObject jSONObjectM5767 = C0141.m5767(jSONObject, C0119.m4598(m5554(), 1250, C0197.f647 ^ 215, 1606));
                        this.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = C0004.m129(jSONObjectM5767, C0243.m9958(m5554(), 1254, C0016.f15 ^ (-290), 2592));
                        this.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = C0004.m129(jSONObjectM5767, C0182.m7561(m5554(), 1267, C0206.f656 ^ 786, 362));
                        this.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = C0004.m129(jSONObjectM5767, C0072.m2852(m5554(), 1282, C0252.f702 ^ (-870), 2504));
                        this.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = C0069.m2683(jSONObjectM5767, C0122.m4749(m5554(), 1293, C0050.f44 ^ 576, 480), C0129.m5181(m5554(), 1302, C0247.f697 ^ 276, 1095));
                        this.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = C0069.m2683(jSONObjectM5767, C0238.m9660(m5554(), 1313, C0248.f698 ^ (-859), 1729), C0094.m3384(m5554(), 1323, C0059.f53 ^ 989, 874));
                        boolean zM302 = C0009.m302(this, C0122.m4695(this));
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = zM302 ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    this.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = false;
                                    StringBuilder sb = new StringBuilder();
                                    C0235.m9501(sb, C0058.m2225(m5554(), 1419, C0005.f5 ^ (-206), 1973));
                                    C0235.m9501(sb, C0122.m4695(this));
                                    m5552(C0009.m261(sb));
                                    StringBuilder sb2 = new StringBuilder();
                                    C0235.m9501(sb2, C0047.m1705(m5554(), 1455, C0177.f627 ^ 176, 1739));
                                    C0235.m9501(sb2, C0122.m4695(this));
                                    C0009.m261(sb2);
                                    C0233.m9380(this, C0112.m4091(this));
                                    break;
                                case 500:
                                    this.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = true;
                                    StringBuilder sb3 = new StringBuilder();
                                    C0235.m9501(sb3, C0171.m7114(m5554(), 1330, C0001.f1 ^ (-419), 2412));
                                    C0235.m9501(sb3, C0236.m9563(this));
                                    C0235.m9501(sb3, C0127.m4990(m5554(), 1368, C0223.f673 ^ (-227), 3229));
                                    C0235.m9501(sb3, C0122.m4695(this));
                                    m5552(C0009.m261(sb3));
                                    StringBuilder sb4 = new StringBuilder();
                                    C0235.m9501(sb4, C0214.m8579(m5554(), 1375, C0205.f655 ^ 152, 2742));
                                    C0235.m9501(sb4, C0181.m7467(this));
                                    C0235.m9501(sb4, C0214.m8579(m5554(), 1405, C0250.f700 ^ 247, 2567));
                                    C0235.m9501(sb4, C0084.m3271(this));
                                    m5552(C0009.m261(sb4));
                                    int i3 = 1864;
                                    while (true) {
                                        i3 ^= 1881;
                                        switch (i3) {
                                            case 17:
                                                i3 = 48674;
                                                continue;
                                            case 47483:
                                                break;
                                            default:
                                                continue;
                                        }
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                        int i4 = 48767;
                        while (true) {
                            i4 ^= 48784;
                            switch (i4) {
                                case 14:
                                    break;
                                case 239:
                                    i4 = 48798;
                                    continue;
                                default:
                                    continue;
                            }
                        }
                        break;
                    case 239:
                        this.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = false;
                        StringBuilder sb5 = new StringBuilder();
                        C0235.m9501(sb5, C0115.m4241(m5554(), 1475, C0005.f5 ^ (-206), 1082));
                        C0235.m9501(sb5, strM129);
                        m5552(C0009.m261(sb5));
                        C0233.m9380(this, C0112.m4091(this));
                        break;
                    default:
                        break;
                }
            }
            LicenseCallback licenseCallbackM1770 = C0049.m1770(this);
            int i5 = 48891;
            while (true) {
                i5 ^= 48908;
                switch (i5) {
                    case 22:
                        break;
                    case 53:
                        break;
                    case 503:
                        i5 = licenseCallbackM1770 != null ? 49635 : 48953;
                        break;
                    case 32495:
                        C0074.m2946(licenseCallbackM1770, C0126.m4900(this), C0120.m4623(this), C0181.m7467(this), C0084.m3271(this));
                        break;
                    default:
                        break;
                }
            }
            boolean zM4900 = C0126.m4900(this);
            int i6 = 49666;
            while (true) {
                i6 ^= 49683;
                switch (i6) {
                    case 17:
                        i6 = zM4900 ? 49759 : 49728;
                        break;
                    case 50:
                        break;
                    case 76:
                        C0031.m1126(this);
                        break;
                    case 83:
                        break;
                    default:
                        break;
                }
            }
            int i7 = 49790;
            while (true) {
                i7 ^= 49807;
                switch (i7) {
                    case 18:
                        return;
                    case 241:
                        i7 = 49821;
                        break;
                }
            }
        } catch (Exception e) {
            StringBuilder sb6 = new StringBuilder();
            C0235.m9501(sb6, C0249.m10020(m5554(), 1511, C0152.f603 ^ 396, 1262));
            C0235.m9501(sb6, C0225.m8949(e));
            m5552(C0009.m261(sb6));
            this.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = false;
            LicenseCallback licenseCallbackM1771 = C0049.m1770(this);
            int i8 = 49914;
            while (true) {
                i8 ^= 49931;
                switch (i8) {
                    case 497:
                        i8 = licenseCallbackM1771 == null ? 50627 : 50658;
                        break;
                    case 1711:
                        break;
                    case 1736:
                        break;
                    case 1769:
                        StringBuilder sb7 = new StringBuilder();
                        C0235.m9501(sb7, C0161.m6789(m5554(), 1562, C0167.f617 ^ (-196), 543));
                        C0235.m9501(sb7, C0225.m8949(e));
                        C0074.m2946(licenseCallbackM1771, false, C0009.m261(sb7), C0181.m7467(this), C0084.m3271(this));
                        break;
                }
            }
            C0233.m9380(this, C0112.m4091(this));
        }
    }

    public final void v(String str) {
        String str2 = "ۢ۟ۨ";
        we weVar = null;
        Handler handler = null;
        Looper looperM9043 = null;
        while (true) {
            switch (C0203.m8249(str2)) {
                case 56351:
                    C0065.m2467(handler, weVar);
                    str2 = "۟ۡۤ";
                    break;
                case 1746751:
                    str2 = "ۧۧۦ";
                    handler = new Handler(looperM9043);
                    break;
                case 1746754:
                    return;
                case 1754630:
                    weVar = new we(this, str);
                    str2 = "ۡ۠";
                    break;
                default:
                    str2 = "۟ۡۡ";
                    looperM9043 = C0227.m9043();
                    break;
            }
        }
    }

    public final void w() {
        String str = "ۤۤۢ";
        Looper looperM9043 = null;
        ve veVar = null;
        Handler handler = null;
        while (true) {
            switch (C0203.m8249(str)) {
                case 56571:
                    return;
                case 1751649:
                    C0065.m2467(handler, veVar);
                    str = "ۣۨ";
                    break;
                case 1751650:
                    looperM9043 = C0227.m9043();
                    str = "ۤ۟ۥ";
                    break;
                case 1752553:
                    str = "ۤۤۡ";
                    veVar = new ve(this);
                    break;
                default:
                    str = "ۥۢۦ";
                    handler = new Handler(looperM9043);
                    break;
            }
        }
    }

    public final void x() {
        int i = 0;
        String str = "ۨۤ۠";
        xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaVar = null;
        Handler handlerM3882 = null;
        long j = 0;
        long j2 = 0;
        while (true) {
            switch (C0203.m8249(str)) {
                case 1748802:
                    str = "ۣۢۨ";
                    i = C0168.f618;
                    break;
                case 1749697:
                    C0097.m3698(handlerM3882, xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaVar, j2);
                    str = "۟ۨۨ";
                    break;
                case 1749853:
                    j = i;
                    str = "ۣ۠ۤ";
                    break;
                case 1750564:
                    xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaVar = new xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(this);
                    str = "ۡۥۦ";
                    break;
                case 1750567:
                    str = "ۣۢۢ";
                    j2 = (-599286) ^ j;
                    break;
                case 1755492:
                    str = "ۣ۠ۡ";
                    handlerM3882 = C0107.m3882(this);
                    break;
                default:
                    return;
            }
        }
    }

    public void y(String str, LicenseCallback licenseCallback) {
        this.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = licenseCallback;
        this.b = str;
        this.c = true;
        StringBuilder sb = new StringBuilder();
        C0235.m9501(sb, C0240.m9844(m5554(), 1581, C0163.f613 ^ 17, 2764));
        C0235.m9501(sb, str);
        m5552(C0009.m261(sb));
        boolean zM7881 = C0194.m7881(this);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (!zM7881) {
                        i = 1709;
                    }
                    break;
                case 204:
                    this.c = false;
                    this.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = false;
                    LicenseCallback licenseCallbackM1770 = C0049.m1770(this);
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (licenseCallbackM1770 != null) {
                                    i2 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return;
                            case 500:
                                C0074.m2946(licenseCallbackM1770, false, C0079.m3101(m5554(), 1630, C0186.f636 ^ (-447), 1691), C0181.m7467(this), C0084.m3271(this));
                                C0233.m9380(this, str);
                                return;
                            default:
                                continue;
                        }
                        i2 = 1802;
                    }
                    break;
                case 239:
                    byte[] bArr = new byte[16];
                    C0010.m327(new SecureRandom(), bArr);
                    String strM4953 = C0127.m4953(bArr);
                    String strM3544 = C0096.m3544();
                    String strM2410 = C0064.m2410(m5554(), 1651, C0016.f15 ^ (-300), 1979);
                    int i3 = 1864;
                    while (true) {
                        i3 ^= 1881;
                        switch (i3) {
                            case 17:
                                i3 = strM3544 != null ? 48736 : 48705;
                                break;
                            case 47384:
                                strM3544 = strM2410;
                                break;
                            case 47417:
                                int i4 = 48767;
                                while (true) {
                                    i4 ^= 48784;
                                    switch (i4) {
                                        case 14:
                                            break;
                                        case 239:
                                            i4 = 48798;
                                            continue;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 47483:
                                break;
                            default:
                                break;
                        }
                    }
                    String strM4291 = C0116.m4291();
                    int i5 = 48891;
                    while (true) {
                        i5 ^= 48908;
                        switch (i5) {
                            case 22:
                                break;
                            case 53:
                                break;
                            case 503:
                                if (strM4291 != null) {
                                    i5 = 49635;
                                }
                                break;
                            case 32495:
                                strM2410 = strM4291;
                                break;
                            default:
                                continue;
                        }
                        i5 = 48953;
                    }
                    C0164.m6957(C0106.m3878(str, strM3544, strM2410, strM4953), new xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(this, str, licenseCallback));
                    return;
                default:
                    continue;
            }
            i = 1678;
        }
    }
}
