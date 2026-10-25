package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.C0002;
import android.support.v4.app.C0004;
import android.support.v4.graphics.drawable.C0009;
import androidx.activity.C0014;
import androidx.annotation.C0031;
import androidx.core.app.C0051;
import androidx.core.app.C0052;
import androidx.core.app.C0055;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0097;
import androidx.fragment.app.C0099;
import androidx.savedstate.C0122;
import androidx.versionedparcelable.C0135;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0230;
import okhttp3.logging.C0231;
import okhttp3.logging.C0233;
import okhttp3.logging.C0235;

/* JADX INFO: loaded from: classes.dex */
public final class ej {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f258short = {2218, 2216, 2233, 2205, 2220, 2239, 2216, 2211, 2233, 2188, 2222, 2233, 2212, 2235, 2212, 2233, 2228, 2180, 2211, 2233, 2216, 2211, 2233, 2295, 2285, 2223, 2220, 2217, 2285, 2237, 2220, 2239, 2216, 2211, 2233, 2188, 2222, 2233, 2212, 2235, 2212, 2233, 2228, 2179, 2220, 2208, 2216, 2285, 2282, 2685, 2682, 2611, 2612, 2682, 2615, 2619, 2612, 2611, 2620, 2623, 2601, 2606, 2961, 3006, 2985, 2954, 2987, 2998, 2995, 2988, 2276, 2283, 2273, 2295, 2282, 2284, 2273, 2219, 2294, 2288, 2293, 2293, 2282, 2295, 2289, 2219, 2261, 2244, 2263, 2240, 2251, 2257, 2266, 2244, 2246, 2257, 2252, 2259, 2252, 2257, 2268};

    public static class xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa {
        public static Intent xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(Activity activity) {
            return C0225.m8950(activity);
        }

        public static boolean xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(Activity activity, Intent intent) {
            return C0231.m9254(activity, intent);
        }

        public static boolean xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(Activity activity, Intent intent) {
            return C0135.m5303(activity, intent);
        }
    }

    public static Intent xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(Activity activity) {
        Intent intentM151 = C0004.m151(activity);
        if (intentM151 != null) {
            return intentM151;
        }
        String strM2039 = C0055.m2039(activity);
        if (strM2039 == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, strM2039);
        try {
            return C0014.m538(activity, componentName) == null ? C0149.m6508(componentName) : C0213.m8491(new Intent(), componentName);
        } catch (PackageManager.NameNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            C0235.m9501(sb, C0099.m3720(m5947(), 0, 49, 2253));
            C0235.m9501(sb, strM2039);
            C0235.m9501(sb, C0051.m1837(m5947(), 49, 13, 2650));
            C0009.m261(sb);
            C0162.m6834(m5947(), 62, 8, 3039);
            return null;
        }
    }

    public static void xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(Activity activity, Intent intent) {
        C0235.m9502(activity, intent);
    }

    public static Intent xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strM538 = C0014.m538(context, componentName);
        if (strM538 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(C0230.m9128(componentName), strM538);
        return C0014.m538(context, componentName2) == null ? C0149.m6508(componentName2) : C0213.m8491(new Intent(), componentName2);
    }

    public static String xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(Activity activity) {
        try {
            return C0014.m538(activity, C0031.m1106(activity));
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static String xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strM6522;
        PackageManager packageManagerM8302 = C0204.m8302(context);
        int iM27 = C0002.m27();
        int i = iM27 >= 24 ? 128 | 512 : 128 | 512;
        if (iM27 >= 29) {
            i |= 269221888;
        } else if (iM27 >= 24) {
            i |= 786432;
        }
        ActivityInfo activityInfoM3783 = C0099.m3783(packageManagerM8302, componentName, i);
        String strM1908 = C0052.m1908(activityInfoM3783);
        if (strM1908 != null) {
            return strM1908;
        }
        Bundle bundleM9373 = C0233.m9373(activityInfoM3783);
        if (bundleM9373 == null || (strM6522 = C0149.m6522(bundleM9373, C0094.m3384(m5947(), 70, 31, 2181))) == null) {
            return null;
        }
        if (C0171.m7096(strM6522, 0) != '.') {
            return strM6522;
        }
        StringBuilder sb = new StringBuilder();
        C0235.m9501(sb, C0122.m4698(context));
        C0235.m9501(sb, strM6522);
        return C0009.m261(sb);
    }

    public static boolean xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(Activity activity, Intent intent) {
        return C0097.m3700(activity, intent);
    }

    /* JADX INFO: renamed from: ۟ۦۣۢۤ, reason: not valid java name and contains not printable characters */
    public static short[] m5947() {
        if (C0199.m7998() < 0) {
            return f258short;
        }
        return null;
    }
}
