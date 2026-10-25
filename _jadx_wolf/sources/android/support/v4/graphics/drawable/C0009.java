package android.support.v4.graphics.drawable;

import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.app.NotificationManager;
import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.support.v4.app.C0004;
import android.support.v4.app.C0006;
import android.system.Os;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.textclassifier.TextClassifier;
import android.widget.PopupWindow;
import androidx.activity.C0014;
import androidx.activity.C0021;
import androidx.annotation.C0023;
import androidx.annotation.C0025;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0034;
import androidx.appcompat.app.C0036;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.widget.SearchView;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0051;
import androidx.core.content.C0057;
import androidx.core.graphics.drawable.C0066;
import androidx.drawerlayout.widget.C0070;
import androidx.drawerlayout.widget.C0072;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0095;
import androidx.fragment.app.C0096;
import androidx.fragment.app.C0097;
import androidx.fragment.app.C0099;
import androidx.lifecycle.C0106;
import androidx.lifecycle.C0108;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0118;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0123;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0129;
import androidx.versionedparcelable.C0133;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.HookMain;
import com.example.vcam.LicenseManager;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.c3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fi;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.g5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qi;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ua;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.us;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.List;
import java.util.Set;
import okhttp3.HttpUrl;
import okhttp3.internal.C0227;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.ws.C0224;
import okhttp3.logging.C0232;
import okhttp3.logging.C0235;
import okhttp3.logging.C0236;

/* JADX INFO: renamed from: android.support.v4.graphics.drawable.ۣ۟ۡ۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0009 {

    /* JADX INFO: renamed from: ۣۣ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static int f9 = -327;

    /* JADX INFO: renamed from: ۟۟ۢۡۨ, reason: not valid java name and contains not printable characters */
    public static void m244(Object obj, Object obj2, int i, Object obj3) {
        if (C0006.m169() < 0) {
            ((ConnectionBlocker) obj).b((String) obj2, i, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static byte[] m245(Object obj, Object obj2) {
        if (C0025.m934() > 0) {
            return ((MessageDigest) obj).digest((byte[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m246(Object obj) {
        if (C0214.m8575() <= 0) {
            return ((qi.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static int m247(Object obj) {
        if (C0149.m6476() <= 0) {
            return ((Configuration) obj).densityDpi;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۡۨۤ, reason: not valid java name and contains not printable characters */
    public static hm m248() {
        if (C0023.m843() > 0) {
            return hm.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static void m249(Object obj, Object obj2) {
        if (C0194.m7889() > 0) {
            ((Cursor) obj).registerDataSetObserver((DataSetObserver) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۧۡ۠, reason: not valid java name and contains not printable characters */
    public static r7.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m250(Object obj, Object obj2) {
        if (C0161.m6744() >= 0) {
            return ((r7.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Drawable.Callback) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۨ۠, reason: not valid java name and contains not printable characters */
    public static int m251(int i) {
        if (C0116.m4340() > 0) {
            return q3.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۨۤۤ, reason: not valid java name and contains not printable characters */
    public static float m252(Object obj) {
        if (C0120.m4608() > 0) {
            return ((us) obj).a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۡ۟۠۠, reason: not valid java name and contains not printable characters */
    public static void m253(Object obj, Object obj2) {
        if (C0232.m9299() >= 0) {
            ((pr) obj).setTintList((ColorStateList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۤۨۦ, reason: not valid java name and contains not printable characters */
    public static void m254(Object obj, float f, float f2, int i) {
        if (C0120.m4608() > 0) {
            ((zr) obj).z(f, f2, i);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۧۡۦ, reason: not valid java name and contains not printable characters */
    public static boolean m255(Object obj) {
        if (C0191.m7812() > 0) {
            return ((NotificationManager) obj).areNotificationsEnabled();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۧۤ۠, reason: not valid java name and contains not printable characters */
    public static Object m256(Object obj, Object obj2, Object obj3) {
        if (C0176.m7290() >= 0) {
            return ((ua) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m257(Object obj, Object obj2) {
        if (C0199.m7998() <= 0) {
            return pj.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj, obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static boolean m258() {
        if (C0094.m3450() >= 0) {
            return g5.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧۦ, reason: not valid java name and contains not printable characters */
    public static void m260(Object obj, int i, Object obj2) {
        if (C0169.m7034() < 0) {
            ((u7) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, (View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static String m261(Object obj) {
        if (C0116.m4340() > 0) {
            return ((StringBuilder) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣۣ۟, reason: not valid java name and contains not printable characters */
    public static void m262(Object obj, int i) {
        if (C0161.m6744() > 0) {
            ((Drawable) obj).setChangingConfigurations(i);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static boolean m263(Object obj) {
        if (C0106.m3835() >= 0) {
            return ((AccessibilityManager) obj).isTouchExplorationEnabled();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static String m264(Object obj) {
        if (C0181.m7445() >= 0) {
            return Os.readlink((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m265(Object obj, Object obj2) {
        if (C0115.m4218() <= 0) {
            ((PropertyValuesHolder) obj).setEvaluator((TypeEvaluator) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦۨ, reason: not valid java name and contains not printable characters */
    public static List m266(Object obj) {
        if (C0066.m2514() > 0) {
            return d2.f((Object[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static int m267(Object obj) {
        if (C0236.m9615() > 0) {
            return C0164.m6922((d7) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m268(Object obj, int i) {
        if (C0116.m4340() >= 0) {
            ((z1) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۡ۟۟, reason: not valid java name and contains not printable characters */
    public static int m269(Object obj) {
        if (C0051.m1783() < 0) {
            return ((Drawable) obj).getChangingConfigurations();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۢ, reason: not valid java name and contains not printable characters */
    public static float[] m270(Object obj) {
        if (C0072.m2856() <= 0) {
            return ((us) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۤ, reason: not valid java name and contains not printable characters */
    public static int m271(Object obj) {
        if (C0040.m1622() < 0) {
            return ((x9) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۦۣۣ, reason: not valid java name and contains not printable characters */
    public static LayoutInflater m272(Object obj) {
        if (C0123.m4841() < 0) {
            return LayoutInflater.from((Context) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۥۦ, reason: not valid java name and contains not printable characters */
    public static boolean m273(Object obj) {
        if (C0128.m5064() <= 0) {
            return ((vf) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧۤ, reason: not valid java name and contains not printable characters */
    public static long m274(Object obj) {
        if (C0095.m3478() <= 0) {
            return ((s2) obj).I();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۧۤۤ, reason: not valid java name and contains not printable characters */
    public static void m275(Object obj, Object obj2) {
        if (C0115.m4218() < 0) {
            ((c3) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Typeface) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۢۦۡ, reason: not valid java name and contains not printable characters */
    public static int m276() {
        return (-696) ^ C0004.f4;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m277(Object obj, boolean z) {
        if (C0201.m8184() <= 0) {
            ((f6) obj).Q(z);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۥۥ, reason: not valid java name and contains not printable characters */
    public static ViewParent m278(Object obj) {
        if (C0115.m4218() < 0) {
            return ((ViewGroup) obj).getParent();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦ۟۟, reason: not valid java name and contains not printable characters */
    public static ClipData m279(Object obj) {
        if (C0227.m9046() >= 0) {
            return ((o5.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۨۨ, reason: not valid java name and contains not printable characters */
    public static Paint.Join m280() {
        if (C0188.m7736() <= 0) {
            return Paint.Join.BEVEL;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۤ, reason: not valid java name and contains not printable characters */
    public static void m281(Object obj, Object obj2, int i) {
        if (C0118.m4454() > 0) {
            HookMain.c.m5424((HookMain.c) obj, (String) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۤۦ, reason: not valid java name and contains not printable characters */
    public static int m282(Object obj) {
        if (C0217.m8693() < 0) {
            return ((Set) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۥۢۥ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m283(Object obj, boolean z) {
        if (C0181.m7445() >= 0) {
            return ((StringBuilder) obj).append(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static Object m284(Object obj, Object obj2) {
        if (C0096.m3601() <= 0) {
            return x4.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj, (j3) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۢۨ, reason: not valid java name and contains not printable characters */
    public static Rect m285(Object obj) {
        if (C0199.m7998() < 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۦ۠, reason: not valid java name and contains not printable characters */
    public static float m286(Object obj) {
        if (C0108.m4038() >= 0) {
            return ((pr.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦۤ, reason: not valid java name and contains not printable characters */
    public static boolean m287(Object obj) {
        if (C0235.m9535() <= 0) {
            return ((wn) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۧۤ۠, reason: not valid java name and contains not printable characters */
    public static MediaPlayer m288() {
        if (C0036.m1332() <= 0) {
            return HookMain.mMediaPlayer;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static float m289(Object obj) {
        if (C0113.m4144() < 0) {
            return ((e3) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m290(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡۡۥۤ, reason: not valid java name and contains not printable characters */
    public static TextClassifier m291(Object obj) {
        if (C0181.m7445() >= 0) {
            return ((j1) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean m292(Object obj, Object obj2) {
        if (C0169.m7034() <= 0) {
            return wr.a((View) obj, (KeyEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۢۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m293(Object obj, Object obj2, Object obj3) {
        if (C0123.m4841() <= 0) {
            return ((wr.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).c((CharSequence) obj2, (CharSequence) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۥۦۧ, reason: not valid java name and contains not printable characters */
    public static hn m294(Object obj) {
        if (C0164.m6900() < 0) {
            return C0118.m4464((v7) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۧ, reason: not valid java name and contains not printable characters */
    public static void m295(Object obj, float f, float f2) {
        if (C0120.m4608() > 0) {
            ((Drawable) obj).setHotspot(f, f2);
        }
    }

    /* JADX INFO: renamed from: ۡۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m296(Object obj, Object obj2) {
        if (C0099.m3752() <= 0) {
            ((ViewGroup) obj).removeView((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m297(Object obj) {
        if (C0224.m8861() < 0) {
            return ((d1) obj).d();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۢۥۡ, reason: not valid java name and contains not printable characters */
    public static void m298(Object obj, Object obj2, int i, int i2, int i3) {
        if (C0093.m3365() >= 0) {
            ((PopupWindow) obj).showAtLocation((View) obj2, i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ۣۢۦۥ, reason: not valid java name and contains not printable characters */
    public static String m299(String str) {
        String string = HttpUrl.FRAGMENT_ENCODE_SET;
        int i = 0;
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        while (i < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i).toString();
            i++;
            str2 = string2;
        }
        while (string.length() > 0) {
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
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۢۦۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean m300(Object obj) {
        if (C0200.m8104() < 0) {
            return ((Drawable.ConstantState) obj).canApplyTheme();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۦۢ۠, reason: not valid java name and contains not printable characters */
    public static t5 m301(Object obj, Object obj2) {
        if (C0161.m6744() >= 0) {
            return ((v5) obj).G((t5) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۦۣ, reason: not valid java name and contains not printable characters */
    public static boolean m302(Object obj, Object obj2) {
        if (C0057.m2142() > 0) {
            return ((LicenseManager) obj).p((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static String m303(Object obj, int i, int i2) {
        if (C0040.m1622() <= 0) {
            return TextUtils.substring((CharSequence) obj, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m304(Object obj) {
        if (C0070.m2829() <= 0) {
            return ((SearchView) obj).getSuggestionCommitIconResId();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static Field m305() {
        if (C0187.m7613() >= 0) {
            return tk.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static o7 m306(Object obj) {
        if (C0034.m1206() <= 0) {
            return o7.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((DisplayCutout) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۥۤ, reason: not valid java name and contains not printable characters */
    public static int m307(Object obj, int i, int i2) {
        if (C0093.m3365() > 0) {
            return ((j0.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).y(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۤۦ۠, reason: not valid java name and contains not printable characters */
    public static Object[] m308(Object obj) {
        if (C0072.m2856() < 0) {
            return ((rn) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۨۤ, reason: not valid java name and contains not printable characters */
    public static int m309(Object obj) {
        if (C0014.m545() > 0) {
            return ((t8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m310(Object obj) {
        if (C0066.m2514() > 0) {
            return ((DisplayMetrics) obj).densityDpi;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۠ۡۤ, reason: contains not printable characters */
    public static HookMain.i m311(Object obj) {
        if (C0031.m1148() <= 0) {
            return ((HookMain.i.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۨۡ, reason: contains not printable characters */
    public static long m312(Object obj, long j, long j2, long j3) {
        if (C0161.m6744() > 0) {
            return zo.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj, j, j2, j3);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۧۢ۠, reason: contains not printable characters */
    public static void m313(Object obj) {
        if (C0188.m7736() < 0) {
            ((l3) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۦۥ۠ۤ, reason: contains not printable characters */
    public static Context m314(Object obj) {
        if (C0200.m8104() < 0) {
            return ((fi) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۧۦ, reason: contains not printable characters */
    public static boolean m315(Object obj, Object obj2) {
        if (C0129.m5108() >= 0) {
            return ((t8) obj).s0((t8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۦۨۧ, reason: contains not printable characters */
    public static void m316(Object obj, Object obj2) {
        if (C0097.m3659() > 0) {
            ((AccessibilityEvent) obj).setSource((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۨۦۦ, reason: contains not printable characters */
    public static int m317(Object obj, int i) {
        if (C0095.m3478() < 0) {
            return ((u1) obj).c(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۨۧۧ, reason: contains not printable characters */
    public static void m318(Object obj, int i) {
        if (C0049.m1767() <= 0) {
            ((View) obj).setLayoutDirection(i);
        }
    }

    /* JADX INFO: renamed from: ۧ۟ۦۨ, reason: not valid java name and contains not printable characters */
    public static void m319(Object obj, int i, int i2) {
        if (C0133.m5208() <= 0) {
            wr.e.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۨ۠ۨۧ, reason: not valid java name and contains not printable characters */
    public static boolean m320(Object obj) {
        if (C0021.m740() <= 0) {
            return ((ViewGroup.MarginLayoutParams) obj).isMarginRelative();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۡۡ۟, reason: not valid java name and contains not printable characters */
    public static int m321(Object obj) {
        if (C0188.m7736() <= 0) {
            return ((hg) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۡۤۡ, reason: not valid java name and contains not printable characters */
    public static void m322(Object obj, Object obj2) {
        if (C0057.m2142() >= 0) {
            ((xd) obj).O((k8) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۦ۠۟, reason: not valid java name and contains not printable characters */
    public static String m323(Object obj) {
        if (C0117.m4419() < 0) {
            return ((j9) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۧۤ, reason: not valid java name and contains not printable characters */
    public static Resources m324(Object obj) {
        if (C0171.m7136() <= 0) {
            return ((s5) obj).getResources();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۤ, reason: not valid java name and contains not printable characters */
    public static String m259(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
