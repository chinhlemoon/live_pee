package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.support.v4.graphics.drawable.C0010;
import androidx.activity.C0021;
import androidx.appcompat.view.menu.C0040;
import androidx.core.app.C0053;
import androidx.core.graphics.drawable.C0062;
import androidx.savedstate.C0123;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0217;

/* JADX INFO: loaded from: classes.dex */
public class l8 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f362short = {2420, 2422, 2401, 2428, 2403, 2428, 2401, 2412, 1212, 1214, 1193, 1204, 1195, 1204, 1193, 1188, 1621, 1623, 1600, 1629, 1602, 1629, 1600, 1613, 2924, 2926, 2937, 2916, 2939, 2916, 2937, 2932, 1168, 1170, 1157, 1176, 1159, 1176, 1157, 1160, 1827, 1849, 1848, 1823, 1848, 1837, 1848, 1833, 665, 667, 652, 657, 654, 657, 652, 641, 499, 497, 486, 507, 484, 507, 486, 491};

    /* JADX INFO: renamed from: ۣۣۦ۟, reason: not valid java name and contains not printable characters */
    public static short[] m6089() {
        if (C0053.m1959() >= 0) {
            return f362short;
        }
        return null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        C0215.m8639(activity, C0062.m2304(m6089(), 0, 8, 2325));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        C0215.m8639(activity, C0217.m8706(m6089(), 8, 8, 1245));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        C0215.m8639(activity, C0021.m727(m6089(), 16, 8, 1588));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        C0215.m8639(activity, C0123.m4840(m6089(), 24, 8, 2829));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C0215.m8639(activity, C0213.m8457(m6089(), 32, 8, 1265));
        C0215.m8639(bundle, C0182.m7561(m6089(), 40, 8, 1868));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        C0215.m8639(activity, C0010.m361(m6089(), 48, 8, 760));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        C0215.m8639(activity, C0040.m1586(m6089(), 56, 8, 402));
    }
}
