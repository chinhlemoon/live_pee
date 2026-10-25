package androidx.drawerlayout.widget;

import android.animation.Keyframe;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.support.v4.app.C0002;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0009;
import android.support.v4.graphics.drawable.C0011;
import android.text.Editable;
import android.text.Spannable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewParent;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import androidx.activity.C0021;
import androidx.annotation.C0023;
import androidx.annotation.C0026;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0035;
import androidx.appcompat.app.C0036;
import androidx.appcompat.app.C0037;
import androidx.appcompat.view.menu.C0039;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.C0047;
import androidx.core.app.C0051;
import androidx.core.app.C0053;
import androidx.core.app.C0055;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0065;
import androidx.core.graphics.drawable.C0066;
import androidx.core.widget.C0068;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0079;
import androidx.emoji2.text.C0083;
import androidx.emoji2.text.C0084;
import androidx.emoji2.text.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0096;
import androidx.fragment.app.C0097;
import androidx.fragment.app.C0099;
import androidx.lifecycle.C0106;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0118;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0122;
import androidx.savedstate.C0126;
import androidx.startup.C0128;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.HookMain;
import com.example.vcam.Menu;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.id;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.js;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ls;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.up;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ym;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zp;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import okhttp3.C0239;
import okhttp3.HttpUrl;
import okhttp3.internal.C0227;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0195;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.platform.android.C0202;
import okhttp3.logging.C0231;
import okhttp3.logging.C0233;
import okhttp3.logging.C0234;
import retrofit2.C0259;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: androidx.drawerlayout.widget.ۣۣ۟۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0072 {

    /* JADX INFO: renamed from: ۨۦۨ, reason: not valid java name and contains not printable characters */
    public static int f66 = 559;

    /* JADX INFO: renamed from: ۣ۟۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static int m2836(Object obj) {
        if (C0062.m2326() >= 0) {
            return ((v0) obj).V;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۦۤۡ, reason: not valid java name and contains not printable characters */
    public static Void m2837() {
        if (C0053.m1959() >= 0) {
            return kg.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۧۡ, reason: not valid java name and contains not printable characters */
    public static ConnectionBlocker m2838(Object obj) {
        if (C0096.m3601() <= 0) {
            return ((HookMain) obj).getConnectionBlocker();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static void m2839(Object obj, Object obj2) {
        if (C0031.m1148() < 0) {
            ((ls) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۤۡۥ, reason: not valid java name and contains not printable characters */
    public static Typeface m2840(Object obj) {
        if (C0009.m276() < 0) {
            return ((Typeface.CustomFallbackBuilder) obj).build();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۧ۠, reason: not valid java name and contains not printable characters */
    public static Constructor m2841(Object obj, Object obj2) {
        if (C0023.m843() > 0) {
            return ((Class) obj).getConstructor((Class[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۨۢ, reason: not valid java name and contains not printable characters */
    public static Object m2842(Object obj) {
        if (C0078.m3044() <= 0) {
            return ((hk) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۦۧ, reason: not valid java name and contains not printable characters */
    public static String m2843() {
        if (C0047.m1663() < 0) {
            return Build.DISPLAY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static hd m2844() {
        if (C0116.m4340() > 0) {
            return hd.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static int m2845(Object obj) {
        if (C0117.m4419() <= 0) {
            return ((dd) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤ۠, reason: not valid java name and contains not printable characters */
    public static String m2846(Object obj) {
        if (C0194.m7889() > 0) {
            return ((SecurityException) obj).getMessage();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۨۥ, reason: not valid java name and contains not printable characters */
    public static String m2847(Object obj) {
        if (C0128.m5064() < 0) {
            return Arrays.toString((int[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۤ, reason: not valid java name and contains not printable characters */
    public static boolean m2848(Object obj) {
        if (C0079.m3072() < 0) {
            return ((v0.k) obj).d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۧۡ۟, reason: not valid java name and contains not printable characters */
    public static String m2849(Object obj) {
        if (C0126.m4908() < 0) {
            return ((Exception) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static int m2850(Object obj) {
        if (C0112.m4054() <= 0) {
            return ((Number) obj).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m2851(Object obj) {
        if (C0039.m1515() <= 0) {
            return ((Throwable) obj).getMessage();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟۠۟, reason: not valid java name and contains not printable characters */
    public static List m2853(Object obj, Object obj2, boolean z, int i) {
        if (C0259.m10136() >= 0) {
            return mo.Z((CharSequence) obj, (char[]) obj2, z, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۦۧ, reason: not valid java name and contains not printable characters */
    public static char m2854(Object obj, int i) {
        if (C0079.m3072() <= 0) {
            return ((Spannable) obj).charAt(i);
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static void m2855(Object obj, Object obj2) {
        if (C0055.m2054() >= 0) {
            t3.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((CheckedTextView) obj, (ColorStateList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static int m2856() {
        return (-181) ^ C0231.f681;
    }

    /* JADX INFO: renamed from: ۟ۤۢ۟, reason: not valid java name and contains not printable characters */
    public static Field m2857() {
        if (C0259.m10136() >= 0) {
            return s7.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨۤ, reason: not valid java name and contains not printable characters */
    public static Adapter m2858(Object obj) {
        if (C0115.m4218() < 0) {
            return ((AdapterView) obj).getAdapter();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۤۦ, reason: not valid java name and contains not printable characters */
    public static void m2859(Object obj, int i, int i2) {
        if (C0036.m1332() < 0) {
            ((View) obj).setScrollIndicators(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Boolean m2860() {
        if (C0011.m458() > 0) {
            return Boolean.TRUE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static void m2861(Object obj) {
        if (C0227.m9046() > 0) {
            ((ym) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m2862(Object obj, Object obj2, Object obj3) {
        if (C0065.m2448() >= 0) {
            ((Drawable.Callback) obj).unscheduleDrawable((Drawable) obj2, (Runnable) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m2863(Object obj) {
        if (C0118.m4454() > 0) {
            return ((x.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۢۧۤ, reason: not valid java name and contains not printable characters */
    public static int m2864(Object obj) {
        if (C0002.m72() > 0) {
            return ((fd) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣۢ۠, reason: not valid java name and contains not printable characters */
    public static void m2865(Object obj) {
        if (C0006.m169() <= 0) {
            Menu.m5596((Menu) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۦۨۨ, reason: not valid java name and contains not printable characters */
    public static String m2866(Object obj) {
        if (C0053.m1959() >= 0) {
            return ((j9) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m2867(Object obj, Object obj2) {
        if (C0009.m276() < 0) {
            Menu.m5692((Menu) obj, (View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static void m2868(Object obj) {
        if (C0234.m9461() < 0) {
            ((t8) obj).n0();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۢۢۡ, reason: not valid java name and contains not printable characters */
    public static Object m2869(Object obj, Object obj2, Object obj3) {
        if (C0172.m7180() >= 0) {
            return ((rn) obj).put(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۢۢ, reason: not valid java name and contains not printable characters */
    public static Paint m2870(Object obj) {
        if (C0099.m3752() <= 0) {
            return ((pr.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۣۥ, reason: not valid java name and contains not printable characters */
    public static Context m2871(Object obj) {
        if (C0053.m1959() >= 0) {
            return ((HookMain.s) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۤۦ, reason: not valid java name and contains not printable characters */
    public static int m2872(Object obj, Object obj2, boolean z) {
        if (C0051.m1783() < 0) {
            return ((j0.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((AnimationDrawable) obj2, z);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡۨ, reason: not valid java name and contains not printable characters */
    public static int m2873(Object obj) {
        if (C0169.m7034() <= 0) {
            return ((id) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۨۢۦ, reason: not valid java name and contains not printable characters */
    public static void m2874(Object obj, Object obj2) {
        if (C0078.m3044() < 0) {
            ((RectF) obj).set((Rect) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static lg m2875(Object obj) {
        if (C0202.m8245() > 0) {
            return ((z1) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۦۣ, reason: not valid java name and contains not printable characters */
    public static void m2876(Object obj, boolean z) {
        if (C0021.m740() < 0) {
            ((ActionBarOverlayLayout) obj).setShowingForActionMode(z);
        }
    }

    /* JADX INFO: renamed from: ۠ۥۤۨ, reason: not valid java name and contains not printable characters */
    public static double m2877(double d) {
        if (C0201.m8184() <= 0) {
            return Math.asin(d);
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: ۠ۦۣۢ, reason: not valid java name and contains not printable characters */
    public static ViewParent m2878(Object obj) {
        if (C0093.m3365() >= 0) {
            return ((View) obj).getParent();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۤۡ, reason: not valid java name and contains not printable characters */
    public static boolean m2879(Object obj, Object obj2) {
        if (C0094.m3450() >= 0) {
            return ((t1) obj).contains(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۦۤۥ, reason: not valid java name and contains not printable characters */
    public static void m2880(Object obj) {
        if (C0037.m1437() < 0) {
            ((p1.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۡۧۤ, reason: not valid java name and contains not printable characters */
    public static CompoundButton m2881(Object obj) {
        if (C0188.m7736() < 0) {
            return ((s0) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۢۥ, reason: not valid java name and contains not printable characters */
    public static js m2882(Object obj) {
        if (C0113.m4144() <= 0) {
            return ((v0) obj).t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۥۢ, reason: not valid java name and contains not printable characters */
    public static void m2883(Object obj, Object obj2) {
        if (C0187.m7613() > 0) {
            ((Keyframe) obj).setInterpolator((TimeInterpolator) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۥ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m2884(Object obj, boolean z) {
        if (C0162.m6837() <= 0) {
            ((Button) obj).setEnabled(z);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static int m2885(Object obj) {
        if (C0195.m7914() > 0) {
            return ((View) obj).getTop();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۧۡ, reason: not valid java name and contains not printable characters */
    public static void m2886(Object obj) {
        if (C0120.m4608() > 0) {
            ((j0.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۣۧۥۦ, reason: not valid java name and contains not printable characters */
    public static void m2887(Object obj) {
        if (C0239.m9805() < 0) {
            f2.head = (f2) obj;
        }
    }

    /* JADX INFO: renamed from: ۤ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static Object m2888(Object obj, Object obj2, Object obj3) {
        if (C0097.m3659() >= 0) {
            return ((xd) obj).k((xd.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۦۧ, reason: not valid java name and contains not printable characters */
    public static up m2889(Object obj) {
        if (C0068.m2650() > 0) {
            return ((sn) obj).timeout();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۢۨ, reason: not valid java name and contains not printable characters */
    public static boolean m2890(Object obj) {
        if (C0249.m10052() <= 0) {
            return TextUtils.isEmpty((CharSequence) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۤۦۣ, reason: not valid java name and contains not printable characters */
    public static Editable m2891(Object obj, int i, Object obj2) {
        if (C0106.m3835() >= 0) {
            return ((Editable) obj).insert(i, (CharSequence) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥ۠, reason: not valid java name and contains not printable characters */
    public static int m2892(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤۥۡ۠, reason: not valid java name and contains not printable characters */
    public static void m2893(Object obj, Object obj2) {
        if (C0051.m1783() <= 0) {
            ((l9.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((l9.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۧۦۡ, reason: not valid java name and contains not printable characters */
    public static int m2894(Object obj, int i, int i2) {
        if (C0066.m2514() >= 0) {
            return ((zp) obj).e(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۣ۠ۤ, reason: contains not printable characters */
    public static int m2895(Object obj) {
        if (C0187.m7613() >= 0) {
            return ((Drawable.ConstantState) obj).getChangingConfigurations();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۡۦۦ, reason: contains not printable characters */
    public static TypedValue m2896(Object obj) {
        if (C0026.m1047() > 0) {
            return ((zp) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۥۢ, reason: contains not printable characters */
    public static void m2897(Object obj, boolean z) {
        if (C0233.m9365() < 0) {
            ((CompoundButton) obj).setChecked(z);
        }
    }

    /* JADX INFO: renamed from: ۥۥ۠, reason: contains not printable characters */
    public static String m2898(Object obj, char c, char c2) {
        if (C0122.m4736() < 0) {
            return ((String) obj).replace(c, c2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۥ۟, reason: contains not printable characters */
    public static boolean m2899(Object obj, boolean z) {
        if (C0126.m4908() <= 0) {
            return ((HookMain) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = z;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۨۤ۟, reason: contains not printable characters */
    public static String m2900(String str) {
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
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str2.charAt(i3 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = HttpUrl.FRAGMENT_ENCODE_SET.length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۦ۟ۨۡ, reason: contains not printable characters */
    public static String m2901(Object obj) {
        if (C0148.m6464() < 0) {
            return ((a9) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۦۢ, reason: contains not printable characters */
    public static long m2902(Object obj, int i) {
        if (C0083.m3188() <= 0) {
            return ((Cursor) obj).getLong(i);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۡ, reason: not valid java name and contains not printable characters */
    public static void m2903(Object obj) {
        if (C0065.m2448() > 0) {
            ((BaseAdapter) obj).notifyDataSetInvalidated();
        }
    }

    /* JADX INFO: renamed from: ۧۤۡۢ, reason: not valid java name and contains not printable characters */
    public static void m2904(Object obj, Object obj2, long j) {
        if (C0036.m1332() <= 0) {
            ((Drawable) obj).scheduleSelf((Runnable) obj2, j);
        }
    }

    /* JADX INFO: renamed from: ۧۥۦۦ, reason: not valid java name and contains not printable characters */
    public static void m2905(Object obj) {
        if (C0169.m7034() < 0) {
            ((HookMain) obj).switchToRandomVideo();
        }
    }

    /* JADX INFO: renamed from: ۧۦۦۨ, reason: not valid java name and contains not printable characters */
    public static void m2906(Object obj, Object obj2) {
        if (C0084.m3253() < 0) {
            ((Parcel) obj).writeString((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧۨۡۡ, reason: not valid java name and contains not printable characters */
    public static long m2907(Object obj, long j, int i) {
        if (C0084.m3253() <= 0) {
            return ((vf.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(j, i);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۤۢۨ, reason: not valid java name and contains not printable characters */
    public static int m2908(Object obj) {
        if (C0120.m4608() >= 0) {
            return ((MenuItem) obj).getGroupId();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۥۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m2909(Object obj) {
        if (C0035.m1268() <= 0) {
            return ((xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static String m2852(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
