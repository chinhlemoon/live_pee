package androidx.drawerlayout.widget;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.LocaleList;
import android.support.v4.app.C0002;
import android.support.v4.app.C0004;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.Surface;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.InputContentInfo;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.window.BackEvent;
import androidx.activity.C0014;
import androidx.activity.C0017;
import androidx.activity.C0021;
import androidx.annotation.C0023;
import androidx.annotation.C0025;
import androidx.annotation.C0026;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0035;
import androidx.appcompat.app.C0037;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.C0047;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0053;
import androidx.core.content.C0057;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0065;
import androidx.core.widget.C0069;
import androidx.emoji2.text.C0079;
import androidx.emoji2.text.C0083;
import androidx.emoji2.text.C0084;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0106;
import androidx.lifecycle.C0107;
import androidx.lifecycle.C0108;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0118;
import androidx.savedstate.C0123;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0129;
import androidx.versionedparcelable.C0133;
import com.example.vcam.C0141;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.HookMain;
import com.example.vcam.LicenseManager;
import com.example.vcam.MainActivity;
import com.example.vcam.Menu;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ag;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ds;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.im;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.js;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.nk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ns;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ua;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ul;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.us;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vh;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ws;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReferenceArray;
import okhttp3.HttpUrl;
import okhttp3.internal.C0227;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.ws.C0224;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0231;
import okhttp3.logging.C0234;
import okhttp3.logging.C0235;
import okhttp3.logging.C0236;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: androidx.drawerlayout.widget.ۥۦۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0074 {

    /* JADX INFO: renamed from: ۡۦۢ۠, reason: not valid java name and contains not printable characters */
    public static int f68 = 53;

    /* JADX INFO: renamed from: ۟۟۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static v0 m2914(Object obj) {
        if (m2951() <= 0) {
            return v0.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۠ۥۥ, reason: not valid java name and contains not printable characters */
    public static Locale m2915(Object obj, int i) {
        if (C0065.m2448() > 0) {
            return ((LocaleList) obj).get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧۧۡ, reason: not valid java name and contains not printable characters */
    public static void m2916(Object obj) {
        if (C0079.m3072() <= 0) {
            ((VelocityTracker) obj).recycle();
        }
    }

    /* JADX INFO: renamed from: ۟۠۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static void m2917(Object obj, boolean z) {
        if (C0108.m4038() > 0) {
            ((v0) obj).F0(z);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static boolean m2918(Object obj, int i, Object obj2, Object obj3) {
        if (C0225.m9001() > 0) {
            return ((AtomicReferenceArray) obj).compareAndSet(i, obj2, obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo m2919(Object obj) {
        if (C0249.m10052() <= 0) {
            return ((i) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۥۦ, reason: not valid java name and contains not printable characters */
    public static void m2920(Object obj, Object obj2, long j, long j2) {
        if (C0211.m8341() > 0) {
            ((Timer) obj).scheduleAtFixedRate((TimerTask) obj2, j, j2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static boolean m2921(Object obj, float f, float f2, int i, int i2) {
        if (C0234.m9461() < 0) {
            return ((zr) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(f, f2, i, i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۥۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m2922(Object obj) {
        if (C0108.m4038() > 0) {
            return ((q) obj).d();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۧۨ۟, reason: not valid java name and contains not printable characters */
    public static boolean m2923(Object obj) {
        if (C0123.m4841() <= 0) {
            return ((Fragment) obj).v;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۧۨۧ, reason: not valid java name and contains not printable characters */
    public static Class m2924(Object obj) {
        if (C0171.m7136() <= 0) {
            return ((Method) obj).getReturnType();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡ۠, reason: not valid java name and contains not printable characters */
    public static int m2925(Object obj) {
        if (C0172.m7180() > 0) {
            return ((Drawable) obj).getLayoutDirection();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static s2 m2926(Object obj) {
        if (C0004.m139() <= 0) {
            return ((ul) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m2927(Object obj) {
        if (C0227.m9046() >= 0) {
            return ((k8) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۧۦۣ, reason: not valid java name and contains not printable characters */
    public static lg.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m2928(Object obj) {
        if (C0214.m8575() < 0) {
            return ((lg) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m2929(Object obj) {
        if (C0224.m8861() <= 0) {
            ((ConnectionBlocker) obj).n();
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static Surface m2930() {
        if (C0178.m7344() < 0) {
            return HookMain.mSurface;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static String m2931(Object obj, Object obj2) {
        if (C0234.m9461() < 0) {
            return ((a9) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۨ, reason: not valid java name and contains not printable characters */
    public static MainActivity m2932(Object obj) {
        if (C0199.m7998() <= 0) {
            return ((ag) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥۤ, reason: not valid java name and contains not printable characters */
    public static void m2933(Object obj, boolean z) {
        if (C0004.m139() < 0) {
            ((h8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(z);
        }
    }

    /* JADX INFO: renamed from: ۣۣۣ۟۟, reason: not valid java name and contains not printable characters */
    public static int m2934(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۥۣ۟, reason: not valid java name and contains not printable characters */
    public static boolean m2935(Object obj) {
        if (C0065.m2448() > 0) {
            return ((n9.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m2936(Object obj, int i, int i2) {
        if (C0199.m7998() <= 0) {
            return ((j0.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).A(i, i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static Menu m2937(Object obj) {
        if (C0227.m9046() > 0) {
            return ((vh) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۤ, reason: not valid java name and contains not printable characters */
    public static void m2938(Object obj, Object obj2) {
        if (C0035.m1268() < 0) {
            ((HookMain) obj).G((Context) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۦۡ۟, reason: not valid java name and contains not printable characters */
    public static void m2939(Object obj, Object obj2, Object obj3) {
        if (C0047.m1663() <= 0) {
            ((Bundle) obj).putCharArray((String) obj2, (char[]) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۦۣ۠, reason: not valid java name and contains not printable characters */
    public static void m2940(Object obj, int i) {
        if (C0231.m9265() > 0) {
            ((LinearLayout) obj).setOrientation(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۧۢۡ, reason: not valid java name and contains not printable characters */
    public static float[][] m2941() {
        if (C0191.m7812() >= 0) {
            return f3.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨۧ, reason: not valid java name and contains not printable characters */
    public static void m2942(Object obj, long j) {
        if (C0116.m4340() >= 0) {
            ((xf) obj).a(j);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۨۤۨ, reason: not valid java name and contains not printable characters */
    public static void m2943(Object obj, long j, Object obj2, int i, Object obj3, int i2, int i3, Object obj4, int i4) {
        if (C0031.m1148() <= 0) {
            List list = (List) obj3;
            C0084.m3221((dk.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj, (i4 & 1) != 0 ? 0L : j, (s2) obj2, (i4 & 4) != 0 ? 0 : i, list, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? C0026.m1019(list) : i3, (List) obj4);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۢۢۧ, reason: not valid java name and contains not printable characters */
    public static int m2944(Object obj, int i) {
        if (C0191.m7812() >= 0) {
            return ((TypedArray) obj).getType(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۤۥۧ, reason: not valid java name and contains not printable characters */
    public static long m2945(Object obj) {
        if (C0129.m5108() > 0) {
            return ((t8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۦۥۥ, reason: not valid java name and contains not printable characters */
    public static void m2946(Object obj, boolean z, Object obj2, Object obj3, Object obj4) {
        if (C0117.m4419() < 0) {
            ((LicenseManager.LicenseCallback) obj).onLicenseVerified(z, (String) obj2, (String) obj3, (String) obj4);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۦۧۤ, reason: not valid java name and contains not printable characters */
    public static ExecutorService m2947(int i, Object obj) {
        if (C0235.m9535() <= 0) {
            return Executors.newFixedThreadPool(i, (ThreadFactory) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۨۥ, reason: not valid java name and contains not printable characters */
    public static Object m2948(Object obj, Object obj2, Object obj3) {
        if (C0128.m5064() < 0) {
            return y5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.C0146x35d57e31.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((y5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj, obj2, (ua) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m2949(Object obj, Object obj2) {
        if (C0072.m2856() <= 0) {
            return ((Collection) obj).contains(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static a3 m2950(Object obj) {
        if (C0004.m139() <= 0) {
            return ((a3) obj).m();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦ۟۠, reason: not valid java name and contains not printable characters */
    public static int m2951() {
        return 701 ^ C0249.f699;
    }

    /* JADX INFO: renamed from: ۟ۧ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static float m2952(Object obj) {
        if (C0148.m6464() <= 0) {
            return ((us) obj).b;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۧۥۣ۟, reason: not valid java name and contains not printable characters */
    public static l2 m2953(Object obj) {
        if (C0148.m6464() <= 0) {
            return C0049.m1736((HookMain) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۥۡ, reason: not valid java name and contains not printable characters */
    public static int m2954(Object obj) {
        if (C0057.m2142() > 0) {
            return ((Spannable) obj).length();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static ActionBarContainer m2955(Object obj) {
        if (C0053.m1959() > 0) {
            return ((ws) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۧۧ, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m2956(Object obj) {
        if (C0002.m72() > 0) {
            return ((TextView) obj).getCompoundDrawableTintMode();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static Context m2957(Object obj) {
        if (C0107.m3883() >= 0) {
            return ((HookMain.u.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۡۧ, reason: not valid java name and contains not printable characters */
    public static dn m2958(Object obj) {
        if (C0069.m2756() < 0) {
            return ((nk) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۨ۠, reason: not valid java name and contains not printable characters */
    public static js m2959(Object obj, Object obj2) {
        if (C0133.m5208() <= 0) {
            return ((js) obj).c((ns) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۦۧ, reason: not valid java name and contains not printable characters */
    public static boolean m2960(Object obj) {
        if (C0204.m8270() < 0) {
            return ((List) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static float m2961(Object obj) {
        if (C0106.m3835() > 0) {
            return ((BackEvent) obj).getProgress();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static ApplicationInfo m2962(Object obj) {
        if (C0164.m6900() < 0) {
            return ((ActivityInfo) obj).applicationInfo;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static int m2963(Object obj) {
        if (C0141.m5769() >= 0) {
            return ((m2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۤۤۥ, reason: not valid java name and contains not printable characters */
    public static void m2964(Object obj) {
        if (C0058.m2184() >= 0) {
            ((InputContentInfo) obj).requestPermission();
        }
    }

    /* JADX INFO: renamed from: ۢۤۦۧ, reason: not valid java name and contains not printable characters */
    public static void m2965(Object obj, Object obj2) {
        if (C0069.m2756() < 0) {
            ((AccessibilityNodeInfo) obj).getBoundsInParent((Rect) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۧۥۤ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m2966(Object obj) {
        if (C0083.m3188() <= 0) {
            return ((im.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۦ۠, reason: not valid java name and contains not printable characters */
    public static boolean m2967(Object obj) {
        if (C0040.m1622() < 0) {
            return ((TextView) obj).isHorizontallyScrollable();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۢۨۧ, reason: not valid java name and contains not printable characters */
    public static String m2968(Object obj) {
        if (C0176.m7290() > 0) {
            return jd.a((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۦ۟, reason: not valid java name and contains not printable characters */
    public static ConnectionBlocker m2969(Object obj) {
        if (C0225.m9001() >= 0) {
            return ((ConnectionBlocker.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static TextPaint m2970(Object obj) {
        if (C0118.m4454() > 0) {
            return ((PrecomputedText.Params) obj).getTextPaint();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static Object m2971(Object obj, int i) {
        if (C0069.m2756() < 0) {
            return ((SparseArray) obj).valueAt(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static void m2972(Object obj) {
        if (C0115.m4218() <= 0) {
            ((hk) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۤۢۡۢ, reason: not valid java name and contains not printable characters */
    public static float m2973(Object obj) {
        if (C0014.m545() >= 0) {
            return ((pr.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).getAlpha();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۤۥۢ۟, reason: not valid java name and contains not printable characters */
    public static int m2974(Object obj) {
        if (C0025.m934() > 0) {
            return ((Configuration) obj).mnc;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۥۣۢ, reason: not valid java name and contains not printable characters */
    public static bs m2975(Object obj) {
        if (C0213.m8458() > 0) {
            return ds.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Class) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۥۨ, reason: not valid java name and contains not printable characters */
    public static void m2976(Object obj) {
        if (C0037.m1437() <= 0) {
            ((Iterator) obj).remove();
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟ۧ, reason: contains not printable characters */
    public static Object m2977(Object obj) {
        if (C0023.m843() >= 0) {
            return ((Callable) obj).call();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦ۠ۢ, reason: contains not printable characters */
    public static xs m2978(Object obj, Object obj2) {
        if (C0218.m8760() > 0) {
            return wr.E((View) obj, (xs) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۢۧ, reason: contains not printable characters */
    public static Object m2979(Object obj, Object obj2) {
        if (C0072.m2856() < 0) {
            return pp.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((y5) obj, obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۤۢ, reason: contains not printable characters */
    public static void m2980(Object obj, long j, Object obj2) {
        if (C0021.m740() < 0) {
            ((t8) obj).p0(j, (t8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۦۧۦ, reason: contains not printable characters */
    public static XC_LoadPackage.LoadPackageParam m2981(Object obj) {
        if (C0108.m4038() > 0) {
            return ((HookMain.w) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۨ, reason: contains not printable characters */
    public static int m2982(Object obj) {
        if (C0049.m1767() < 0) {
            return ((p0) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۡۨ۟, reason: not valid java name and contains not printable characters */
    public static Typeface m2983() {
        if (C0236.m9615() > 0) {
            return Typeface.MONOSPACE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۧۧ, reason: not valid java name and contains not printable characters */
    public static String m2985(String str) {
        String string = HttpUrl.FRAGMENT_ENCODE_SET;
        int i = 0;
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        while (i < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i).toString();
            i++;
            str2 = string2;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        for (int i2 = 0; i2 < str.length(); i2 += 2) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(i2)) << 4) | string.indexOf(str.charAt(i2 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        String str3 = "a";
        while (str3.length() > 0) {
            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (HttpUrl.FRAGMENT_ENCODE_SET.length() == 0) {
                str3 = "a";
            }
        }
        int length = str3.length();
        int length2 = str2.length();
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str2.charAt(i3 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = HttpUrl.FRAGMENT_ENCODE_SET.length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۧۤۢۦ, reason: not valid java name and contains not printable characters */
    public static int m2986(Object obj) {
        if (C0017.m627() > 0) {
            return ((ViewGroup) obj).getRight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۨ۠ۦ, reason: not valid java name and contains not printable characters */
    public static tm m2987(Object obj) {
        if (C0115.m4218() < 0) {
            return tm.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static HookMain m2988(Object obj) {
        if (m2951() <= 0) {
            return ((HookMain.i) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۤۤ, reason: not valid java name and contains not printable characters */
    public static WeakHashMap m2989() {
        if (C0176.m7290() > 0) {
            return im.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۠۟, reason: not valid java name and contains not printable characters */
    public static int m2990(Object obj) {
        if (C0249.m10052() <= 0) {
            return pg.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ViewGroup.MarginLayoutParams) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨۦ۟, reason: not valid java name and contains not printable characters */
    public static void m2991(Object obj, float f) {
        if (C0231.m9265() > 0) {
            ((ws) obj).x(f);
        }
    }

    /* JADX INFO: renamed from: ۣۣۧۡ, reason: not valid java name and contains not printable characters */
    public static String m2984(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
