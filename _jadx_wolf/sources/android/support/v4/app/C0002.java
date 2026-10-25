package android.support.v4.app;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.hardware.Camera;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.Surface;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.widget.ListView;
import android.widget.OverScroller;
import androidx.activity.C0014;
import androidx.annotation.C0024;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0035;
import androidx.appcompat.app.C0036;
import androidx.appcompat.view.menu.C0039;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.core.app.C0052;
import androidx.core.app.C0053;
import androidx.core.app.C0055;
import androidx.core.content.C0057;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0064;
import androidx.core.graphics.drawable.C0065;
import androidx.core.widget.C0068;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0070;
import androidx.drawerlayout.widget.C0072;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0099;
import androidx.lifecycle.C0106;
import androidx.lifecycle.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0118;
import androidx.profileinstaller.ProfileInstallerInitializer;
import androidx.savedstate.C0123;
import androidx.savedstate.C0127;
import androidx.savedstate.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.versionedparcelable.C0129;
import androidx.versionedparcelable.C0135;
import com.example.vcam.HookMain;
import com.example.vcam.MainActivity;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.aa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fh;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.im;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ip;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.iq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.js;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ks;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.nq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.oi;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.up;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.w0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ze;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.C0238;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.internal.C0227;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0195;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.ws.C0224;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0231;
import okhttp3.logging.C0232;
import okhttp3.logging.C0234;
import okhttp3.logging.C0236;
import org.xmlpull.v1.XmlPullParser;
import retrofit2.C0259;

/* JADX INFO: renamed from: android.support.v4.app.ۣۥۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0002 {

    /* JADX INFO: renamed from: ۣۨۥ, reason: not valid java name and contains not printable characters */
    public static int f2 = 424;

    /* JADX INFO: renamed from: ۟۟۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static y5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m8(Object obj, Object obj2) {
        if (C0201.m8184() < 0) {
            return ((y5) obj).A((y5.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۡۥۡ, reason: not valid java name and contains not printable characters */
    public static xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m9(Object obj) {
        if (C0135.m5274() < 0) {
            return ((xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static ViewPropertyAnimator m10(Object obj, Object obj2) {
        if (C0053.m1959() >= 0) {
            return js.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ViewPropertyAnimator) obj, (ValueAnimator.AnimatorUpdateListener) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m11() {
        if (C0106.m3835() >= 0) {
            return pr.e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤۥۣ, reason: not valid java name and contains not printable characters */
    public static v0 m12(Object obj) {
        if (C0176.m7290() >= 0) {
            return ((w0) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤۦۧ, reason: not valid java name and contains not printable characters */
    public static boolean m13(Object obj) {
        if (C0055.m2054() >= 0) {
            return ((i8) obj).a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۦۡۢ, reason: not valid java name and contains not printable characters */
    public static u7 m14(Object obj) {
        if (C0149.m6476() <= 0) {
            return u7.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧۧ۟, reason: not valid java name and contains not printable characters */
    public static int m15(Object obj) {
        if (C0194.m7889() >= 0) {
            return wr.f((View) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۨۥۣ, reason: not valid java name and contains not printable characters */
    public static boolean m16(Object obj, Object obj2) {
        if (C0218.m8760() >= 0) {
            return ((HashMap) obj).containsKey(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static SubMenu m17(Object obj, Object obj2) {
        if (C0035.m1268() < 0) {
            return ((Menu) obj).addSubMenu((CharSequence) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۤۨ, reason: not valid java name and contains not printable characters */
    public static String[] m18() {
        if (C0240.m9826() > 0) {
            return y7.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۢ۠, reason: not valid java name and contains not printable characters */
    public static int m19(Object obj) {
        if (C0040.m1622() <= 0) {
            return ((EditorInfo) obj).initialSelStart;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m20(Object obj) {
        if (C0162.m6837() <= 0) {
            return ((Surface) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۡۦ, reason: not valid java name and contains not printable characters */
    public static boolean m21(Object obj) {
        if (C0188.m7736() <= 0) {
            return ((o9) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠۟, reason: not valid java name and contains not printable characters */
    public static void m22(Object obj, float f) {
        if (C0052.m1890() > 0) {
            ((View) obj).setZ(f);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۦ, reason: not valid java name and contains not printable characters */
    public static boolean m23(Object obj, int i) {
        if (C0225.m9001() > 0) {
            return ((ListView) obj).canScrollList(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧ۠, reason: not valid java name and contains not printable characters */
    public static MainActivity m24(Object obj) {
        if (C0164.m6900() <= 0) {
            return ((bg) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۦ۠, reason: not valid java name and contains not printable characters */
    public static up m25(Object obj, long j, Object obj2) {
        if (C0123.m4841() <= 0) {
            return ((up) obj).timeout(j, (TimeUnit) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧۡ, reason: not valid java name and contains not printable characters */
    public static void m26(Object obj, boolean z) {
        if (C0112.m4054() <= 0) {
            ((h8.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(z);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢ۠, reason: not valid java name and contains not printable characters */
    public static int m27() {
        if (C0072.m2856() < 0) {
            return Build.VERSION.SDK_INT;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۥۦ, reason: not valid java name and contains not printable characters */
    public static boolean m28(Object obj) {
        if (C0199.m7998() <= 0) {
            return ((HookMain) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۦۡۤ, reason: not valid java name and contains not printable characters */
    public static void m29(Object obj, Object obj2, Object obj3) {
        if (C0069.m2756() <= 0) {
            xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj, (ze) obj2, (xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m30(Object obj) {
        if (C0224.m8861() <= 0) {
            ((com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).i();
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۦۨ, reason: not valid java name and contains not printable characters */
    public static void m31(Object obj, int i) {
        if (C0118.m4454() >= 0) {
            ((MenuItem) obj).setShowAsAction(i);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static int m32(Object obj) {
        if (C0135.m5274() <= 0) {
            return ((OverScroller) obj).getCurrY();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۤۦ, reason: not valid java name and contains not printable characters */
    public static Drawable.ConstantState m33(Object obj) {
        if (C0214.m8575() < 0) {
            return ((pr) obj).getConstantState();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m34(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static String m35(Object obj, long j) {
        if (C0171.m7136() < 0) {
            return t2.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((s2) obj, j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۥۤ, reason: not valid java name and contains not printable characters */
    public static long m36(Object obj, boolean z) {
        if (C0191.m7812() > 0) {
            return ((s8) obj).T(z);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۡۨ۟, reason: not valid java name and contains not printable characters */
    public static ProfileInstallerInitializer m37(Object obj) {
        if (C0161.m6744() > 0) {
            return ((bl) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۧۧ, reason: not valid java name and contains not printable characters */
    public static Bitmap m38(Object obj, Object obj2) {
        if (C0217.m8693() < 0) {
            return C0188.m7740((HookMain) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۥۣ, reason: not valid java name and contains not printable characters */
    public static o5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m39(Object obj, Object obj2) {
        if (C0053.m1959() >= 0) {
            return ((o5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Bundle) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static int m40(Object obj, Object obj2) {
        if (C0036.m1332() < 0) {
            return ((InputStream) obj).read((byte[]) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m41() {
        if (C0162.m6837() < 0) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۟ۥ, reason: not valid java name and contains not printable characters */
    public static Camera.Size m42(Object obj) {
        if (C0232.m9299() >= 0) {
            return ((Camera.Parameters) obj).getPreviewSize();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۤ۠, reason: not valid java name and contains not printable characters */
    public static xs m43(Object obj) {
        if (C0062.m2326() >= 0) {
            return wr.d.b((View) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۤۧ, reason: not valid java name and contains not printable characters */
    public static ip m44(Object obj, Object obj2) {
        if (C0129.m5108() >= 0) {
            return ((ip) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Intent) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m45(Object obj) {
        if (C0014.m545() >= 0) {
            ((ks) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m46(Object obj) {
        if (C0039.m1515() < 0) {
            return ((AccessibilityNodeInfo) obj).isChecked();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m47(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0065.m2448() > 0) {
            return ((tf) obj).i((tf) obj2, (tf) obj3, (tf.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj4);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۡۥ, reason: not valid java name and contains not printable characters */
    public static Display m48(Object obj) {
        if (C0149.m6476() <= 0) {
            return ((WindowManager) obj).getDefaultDisplay();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۣۨ, reason: not valid java name and contains not printable characters */
    public static Context m49(Object obj) {
        if (C0164.m6900() <= 0) {
            return ((ContextWrapper) obj).getBaseContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۨ, reason: not valid java name and contains not printable characters */
    public static Object m50(Object obj) {
        if (C0106.m3835() >= 0) {
            return C0099.m3770((HookMain) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۢۤ, reason: not valid java name and contains not printable characters */
    public static m5 m51(Object obj) {
        if (C0227.m9046() >= 0) {
            return ((dm.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۦۦ, reason: not valid java name and contains not printable characters */
    public static CharSequence m52(Object obj) {
        if (C0238.m9653() >= 0) {
            return ((ActionBarContextView) obj).getTitle();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۨۤ, reason: not valid java name and contains not printable characters */
    public static bd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m53(Object obj) {
        if (C0113.m4144() < 0) {
            return ((bd) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۧ۠, reason: not valid java name and contains not printable characters */
    public static void m54(Object obj, Object obj2) {
        if (C0055.m2054() > 0) {
            ((v5) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((t5) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۠۠, reason: not valid java name and contains not printable characters */
    public static Window m55(Object obj) {
        if (C0217.m8693() < 0) {
            return ((v0) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۨ۟, reason: not valid java name and contains not printable characters */
    public static void m56(Object obj, Object obj2) {
        if (C0164.m6900() <= 0) {
            ((Configuration) obj).setLayoutDirection((Locale) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static androidx.appcompat.view.menu.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m57(Object obj) {
        if (C0171.m7136() < 0) {
            return ((androidx.appcompat.view.menu.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).v();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠, reason: not valid java name and contains not printable characters */
    public static boolean m58(int i) {
        if (C0202.m8245() >= 0) {
            return y7.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m59(String str) {
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
        while (length > 0) {
            byteArray[-1] = (byte) (byteArray[-1] ^ str2.charAt((-1) % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = HttpUrl.FRAGMENT_ENCODE_SET.length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۡۥۤۧ, reason: not valid java name and contains not printable characters */
    public static Handler m60(Object obj) {
        if (C0213.m8458() > 0) {
            return im.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Handler) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۣۡ, reason: not valid java name and contains not printable characters */
    public static void m61(Object obj, Object obj2, Object obj3) {
        if (C0070.m2829() <= 0) {
            ((aa) obj).c((View) obj2, (Rect) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣۢۥۤ, reason: not valid java name and contains not printable characters */
    public static Bundle m63(Object obj) {
        if (C0035.m1268() <= 0) {
            return ((ServiceInfo) obj).metaData;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m64(Object obj) {
        if (C0031.m1148() < 0) {
            return ((oi) obj).b();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤۧۨ, reason: not valid java name and contains not printable characters */
    public static ViewParent m65(Object obj) {
        if (C0004.m139() <= 0) {
            return ((View) obj).getParentForAccessibility();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۡۨ, reason: not valid java name and contains not printable characters */
    public static void m66() {
        if (C0236.m9615() >= 0) {
            f.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۤ۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static m m67(Object obj) {
        if (C0127.m4950() >= 0) {
            return ((v0) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۦ۟, reason: not valid java name and contains not printable characters */
    public static qa m68(Object obj) {
        if (C0213.m8458() >= 0) {
            return C0004.m146((nq) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۨ۟, reason: not valid java name and contains not printable characters */
    public static short m69(Object obj, int i) {
        if (C0259.m10136() >= 0) {
            return ((ByteBuffer) obj).getShort(i);
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static int m70(int i, float f, float f3) {
        if (C0195.m7914() >= 0) {
            return m4.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, f, f3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۣۤۢ, reason: contains not printable characters */
    public static Typeface m71(Object obj, int i, boolean z) {
        if (C0024.m896() >= 0) {
            return k1.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Typeface) obj, i, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥ۠ۢ, reason: contains not printable characters */
    public static int m72() {
        return 736 ^ C0217.f667;
    }

    /* JADX INFO: renamed from: ۥۥۤۦ, reason: contains not printable characters */
    public static CharSequence m73(Object obj) {
        if (C0225.m9001() > 0) {
            return ((iq) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۡۧ, reason: contains not printable characters */
    public static xs.d m74(Object obj) {
        if (C0231.m9265() >= 0) {
            return ((xs) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۠ۥ, reason: contains not printable characters */
    public static Class m75() {
        if (C0057.m2142() > 0) {
            return lm.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static int m76(Object obj) {
        if (C0181.m7445() > 0) {
            return ((l9.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧ۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static tm.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m77(Object obj) {
        if (C0200.m8104() < 0) {
            return ((tm.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۥۤ, reason: not valid java name and contains not printable characters */
    public static void m78(Object obj, float f) {
        if (C0065.m2448() >= 0) {
            ((qm) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(f);
        }
    }

    /* JADX INFO: renamed from: ۧۡۢ۟, reason: not valid java name and contains not printable characters */
    public static rn m79() {
        if (C0094.m3450() > 0) {
            return l9.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۥ, reason: not valid java name and contains not printable characters */
    public static void m80(Object obj, Object obj2, Object obj3, int i) {
        if (C0068.m2650() >= 0) {
            ((ViewParent) obj).onNestedScrollAccepted((View) obj2, (View) obj3, i);
        }
    }

    /* JADX INFO: renamed from: ۧۥۦ, reason: not valid java name and contains not printable characters */
    public static boolean m81(Object obj) {
        if (C0171.m7136() < 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).q;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۦۨۤ, reason: not valid java name and contains not printable characters */
    public static void m82(Object obj) {
        if (C0234.m9461() <= 0) {
            ((o9) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۣۨ۟, reason: not valid java name and contains not printable characters */
    public static Context m83(Object obj) {
        if (C0064.m2388() >= 0) {
            return ((Dialog) obj).getContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static List m84(Object obj, Object obj2) {
        if (C0070.m2829() <= 0) {
            return i9.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((j9) obj, (Resources) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۡۡ, reason: not valid java name and contains not printable characters */
    public static void m85(Object obj, Object obj2) {
        if (C0062.m2326() > 0) {
            ((Parcel) obj).writeByteArray((byte[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۨۢۡ, reason: not valid java name and contains not printable characters */
    public static boolean m86(Object obj, Object obj2) {
        if (C0259.m10136() >= 0) {
            return sq.b((XmlPullParser) obj, (String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۦۤ۟, reason: not valid java name and contains not printable characters */
    public static String m87(Object obj) {
        if (C0094.m3450() >= 0) {
            return ((a3) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۦۨ, reason: not valid java name and contains not printable characters */
    public static com.example.vcam.Menu m88(Object obj) {
        if (C0202.m8245() >= 0) {
            return ((fh) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۢۤ, reason: not valid java name and contains not printable characters */
    public static String m62(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
