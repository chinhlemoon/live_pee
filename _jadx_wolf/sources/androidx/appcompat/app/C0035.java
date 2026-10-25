package androidx.appcompat.app;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontStyle;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.C0004;
import android.support.v4.app.C0006;
import android.transition.Transition;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ContentInfo;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.textclassifier.TextClassifier;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.SeekBar;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.C0017;
import androidx.activity.C0021;
import androidx.annotation.C0026;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.C0047;
import androidx.core.app.C0052;
import androidx.core.app.C0053;
import androidx.core.app.C0055;
import androidx.core.graphics.drawable.C0064;
import androidx.core.graphics.drawable.C0066;
import androidx.drawerlayout.widget.C0070;
import androidx.drawerlayout.widget.C0072;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0084;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0096;
import androidx.fragment.app.C0097;
import androidx.fragment.app.C0099;
import androidx.fragment.app.a;
import androidx.lifecycle.C0107;
import androidx.lifecycle.C0108;
import androidx.lifecycle.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0122;
import androidx.savedstate.C0123;
import androidx.savedstate.C0127;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0135;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.HookMain;
import com.example.vcam.Menu;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.aa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.cs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.g8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jb;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ns;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pi;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vh;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ws;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import okhttp3.C0238;
import okhttp3.C0239;
import okhttp3.HttpUrl;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.io.C0195;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0232;
import okhttp3.logging.C0235;
import okhttp3.logging.C0236;
import retrofit2.converter.scalars.C0243;

/* JADX INFO: renamed from: androidx.appcompat.app.۟ۥۡ۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0035 {

    /* JADX INFO: renamed from: ۠ۡۢۦ, reason: not valid java name and contains not printable characters */
    public static int f33 = -488;

    /* JADX INFO: renamed from: ۟۟ۤۥۧ, reason: not valid java name and contains not printable characters */
    public static fd m1231(Object obj, int i, int i2, int i3) {
        if (C0218.m8760() > 0) {
            return ((fd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤۦۥ, reason: not valid java name and contains not printable characters */
    public static void m1232(Object obj, Object obj2, Object obj3) {
        if (C0178.m7344() < 0) {
            C0128.m5097((ns) obj, (View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static o5 m1233(Object obj) {
        if (C0195.m7914() >= 0) {
            return o5.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ContentInfo) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static List m1234(Object obj) {
        if (C0116.m4340() >= 0) {
            return ((AccessibilityNodeInfo) obj).getActionList();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m1235(Object obj, Object obj2) {
        if (C0169.m7034() <= 0) {
            return ((Typeface) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۥۨۦ, reason: not valid java name and contains not printable characters */
    public static j0.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m1236(Object obj) {
        if (C0214.m8575() < 0) {
            return ((j0) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۣ۠, reason: not valid java name and contains not printable characters */
    public static void m1237(Object obj, Object obj2) {
        if (C0188.m7736() <= 0) {
            Menu.m5662((Menu) obj, (View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۧۥۣ, reason: not valid java name and contains not printable characters */
    public static int[] m1238() {
        if (C0232.m9299() >= 0) {
            return i0.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۧۤ, reason: not valid java name and contains not printable characters */
    public static Parcelable m1239(Object obj) {
        if (C0236.m9615() >= 0) {
            return ((a) obj).O0();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static Transition m1240(Object obj, Object obj2) {
        if (C0004.m139() < 0) {
            return ((Transition) obj).addListener((Transition.TransitionListener) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۥۨ, reason: not valid java name and contains not printable characters */
    public static void m1241(Object obj, Object obj2, Object obj3) {
        if (C0040.m1622() < 0) {
            ((Bundle) obj).putParcelableArray((String) obj2, (Parcelable[]) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۥۨ۠, reason: not valid java name and contains not printable characters */
    public static ws m1242(Object obj) {
        if (C0243.m9964() > 0) {
            return ws.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۨۤ, reason: not valid java name and contains not printable characters */
    public static k6 m1243(Object obj) {
        if (C0004.m139() < 0) {
            return k6.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m1244(Object obj) {
        if (C0204.m8270() < 0) {
            return ((f6) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧۦۤ, reason: not valid java name and contains not printable characters */
    public static int m1245(Object obj, Object obj2) {
        if (C0108.m4038() >= 0) {
            return yq.a((FontStyle) obj, (FontStyle) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static boolean m1246(Object obj) {
        if (C0235.m9535() <= 0) {
            return ((f6.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).b();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۥۢ۟, reason: not valid java name and contains not printable characters */
    public static void m1247(Object obj, float f, float f2) {
        if (C0195.m7914() >= 0) {
            ((View) obj).drawableHotspotChanged(f, f2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۦۦۦ, reason: not valid java name and contains not printable characters */
    public static MenuItem m1248(Object obj, Object obj2) {
        if (C0034.m1206() < 0) {
            return ((MenuItem) obj).setTitle((CharSequence) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡۥ, reason: not valid java name and contains not printable characters */
    public static void m1249(Object obj, boolean z) {
        if (C0006.m169() <= 0) {
            ((t8) obj).r0(z);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۦ, reason: not valid java name and contains not printable characters */
    public static void m1250(Object obj, Object obj2) {
        if (C0055.m2054() > 0) {
            ((View) obj).setOnHoverListener((View.OnHoverListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static ConnectionBlocker.BlockRule m1251(Object obj) {
        if (C0097.m3659() >= 0) {
            return ((vh) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static int m1252(Object obj, int i) {
        if (C0225.m9001() > 0) {
            return ((ByteBuffer) obj).getInt(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static MenuInflater m1253(Object obj) {
        if (C0164.m6900() <= 0) {
            return ((v0) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۤ۠, reason: not valid java name and contains not printable characters */
    public static cs[] m1254(Object obj) {
        if (C0204.m8270() <= 0) {
            return ((wc) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m1255() {
        if (C0188.m7736() < 0) {
            return xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.ON_RESUME;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥۡ, reason: not valid java name and contains not printable characters */
    public static String m1256(Object obj) {
        if (C0072.m2856() < 0) {
            return ((j9) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۨۥ, reason: not valid java name and contains not printable characters */
    public static int m1257(Object obj) {
        if (C0037.m1437() < 0) {
            return ((r7) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣۥۤ, reason: not valid java name and contains not printable characters */
    public static e.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m1258() {
        if (C0017.m627() >= 0) {
            return e.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۢ۟, reason: not valid java name and contains not printable characters */
    public static AsyncTask m1259(Object obj, Object obj2) {
        if (C0084.m3253() < 0) {
            return ((AsyncTask) obj).execute((Object[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m1260(Object obj, Object obj2, boolean z, int i) {
        if (C0172.m7180() >= 0) {
            return lo.c((String) obj, (String) obj2, z, i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۦۥۣ, reason: not valid java name and contains not printable characters */
    public static void m1261(Object obj) {
        if (C0219.m8794() > 0) {
            ((yn) obj).c();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۧۦۢ, reason: not valid java name and contains not printable characters */
    public static void m1262(Object obj, Object obj2) {
        if (C0123.m4841() <= 0) {
            ((Activity) obj).onConfigurationChanged((Configuration) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static void m1263(Object obj, Object obj2) {
        if (C0213.m8458() >= 0) {
            ((Button) obj).setBackground((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m1264(Object obj) {
        if (C0070.m2829() < 0) {
            return ((FrameLayout) obj).getWidth();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m1265(Object obj) {
        if (C0074.m2951() < 0) {
            return ((String) obj).trim();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۤۤ, reason: not valid java name and contains not printable characters */
    public static HookMain m1266(Object obj) {
        if (C0232.m9299() > 0) {
            return ((HookMain.c) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۦۦ, reason: not valid java name and contains not printable characters */
    public static int m1267(Object obj, Object obj2, int i, boolean z, int i2) {
        if (C0040.m1622() < 0) {
            return mo.L((CharSequence) obj, (String) obj2, i, z, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static int m1268() {
        return 254 ^ C0235.f685;
    }

    /* JADX INFO: renamed from: ۠۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static int m1269(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static void m1270(Object obj, boolean z) {
        if (C0164.m6900() < 0) {
            ((ws) obj).A(z);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static String m1271(String str) {
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
        while (str.length() > 0) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(-2)) << 4) | string.indexOf(str.charAt(-1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i2 = 0; i2 < length; i2++) {
            byteArray[i2] = (byte) (byteArray[i2] ^ str2.charAt(i2 % length2));
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۠ۤۡۨ, reason: not valid java name and contains not printable characters */
    public static Intent m1272(Object obj) {
        if (C0094.m3450() >= 0) {
            return ((y) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۦۤ, reason: not valid java name and contains not printable characters */
    public static void m1273(Object obj, Object obj2, float f) {
        if (C0178.m7344() <= 0) {
            ((Bundle) obj).putFloat((String) obj2, f);
        }
    }

    /* JADX INFO: renamed from: ۡ۟ۥ۠, reason: not valid java name and contains not printable characters */
    public static Rect m1274(Object obj) {
        if (C0107.m3883() >= 0) {
            return ((u7) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۡۢ, reason: not valid java name and contains not printable characters */
    public static void m1275(Object obj, Object obj2) {
        if (C0037.m1437() < 0) {
            ((AccessibilityManager) obj).sendAccessibilityEvent((AccessibilityEvent) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡۦۢۥ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m1276(Object obj, Object obj2, int i) {
        if (C0217.m8693() <= 0) {
            return ((z0) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۦۥ, reason: not valid java name and contains not printable characters */
    public static boolean m1277(Object obj) {
        if (C0239.m9805() < 0) {
            return ((Thread) obj).isAlive();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۨۡ, reason: not valid java name and contains not printable characters */
    public static int m1278(Object obj, int i) {
        if (C0116.m4340() >= 0) {
            return ((LayerDrawable) obj).getLayerInsetStart(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۨۥۣ, reason: not valid java name and contains not printable characters */
    public static void m1279(Object obj, Object obj2) {
        if (C0135.m5274() <= 0) {
            ((SeekBar) obj).setThumb((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡۨۧ۠, reason: not valid java name and contains not printable characters */
    public static pi m1280(Object obj, int i, Object obj2) {
        if (C0232.m9299() > 0) {
            return ((pi) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, (ByteBuffer) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static void m1281(Object obj, Object obj2) {
        if (C0214.m8575() < 0) {
            ((xs.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((dd) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢ۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static Runnable m1282(Object obj) {
        if (C0053.m1959() >= 0) {
            return ((v0) obj).s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۡۤ, reason: not valid java name and contains not printable characters */
    public static dd m1283(Object obj) {
        if (C0099.m3752() < 0) {
            return ((xs.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۢ, reason: not valid java name and contains not printable characters */
    public static List m1284(Object obj, Object obj2) {
        if (C0171.m7136() <= 0) {
            return ((l2) obj).i((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۤ۠, reason: not valid java name and contains not printable characters */
    public static OnBackInvokedDispatcher m1285(Object obj) {
        if (C0182.m7528() < 0) {
            return ((Activity) obj).getOnBackInvokedDispatcher();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۧۢ, reason: not valid java name and contains not printable characters */
    public static float m1286(Object obj) {
        if (C0064.m2388() > 0) {
            return ((g8) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۨۡۥ, reason: not valid java name and contains not printable characters */
    public static long m1287(Object obj, int i) {
        if (C0078.m3044() <= 0) {
            return ((ListView) obj).getItemIdAtPosition(i);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static TextClassifier m1288() {
        if (C0191.m7812() > 0) {
            return TextClassifier.NO_OP;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢ۠ۦ, reason: not valid java name and contains not printable characters */
    public static AppCompatEditText m1289(Object obj, Object obj2, Object obj3) {
        if (C0239.m9805() <= 0) {
            return ((m1) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj2, (AttributeSet) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۢۦ, reason: not valid java name and contains not printable characters */
    public static int m1290(Object obj) {
        if (C0026.m1047() > 0) {
            return ((r7) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۨ۠, reason: not valid java name and contains not printable characters */
    public static ObjectAnimator m1291(Object obj, Object obj2, Object obj3) {
        if (C0117.m4419() <= 0) {
            return ObjectAnimator.ofInt(obj, (String) obj2, (int[]) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۨۤ, reason: contains not printable characters */
    public static Class m1292() {
        if (C0238.m9653() >= 0) {
            return HookMain.c2_state_callback;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۢۧ, reason: contains not printable characters */
    public static float m1293(Object obj) {
        if (C0021.m740() <= 0) {
            return ((pr.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).b;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۥۣۨ, reason: contains not printable characters */
    public static Font.Builder m1294(Object obj, int i) {
        if (C0004.m139() <= 0) {
            return ((Font.Builder) obj).setSlant(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۧۢ, reason: contains not printable characters */
    public static void m1295(Object obj, Object obj2) {
        if (C0066.m2514() > 0) {
            ((com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((File) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۧۤ, reason: contains not printable characters */
    public static void m1296(Object obj, Object obj2) {
        if (C0047.m1663() <= 0) {
            ((Window.Callback) obj).onActionModeStarted((ActionMode) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۧۦۥ, reason: contains not printable characters */
    public static void m1297(Object obj, int i, boolean z) {
        if (C0122.m4736() < 0) {
            ((i) obj).B(i, z);
        }
    }

    /* JADX INFO: renamed from: ۦ۠ۧۧ, reason: contains not printable characters */
    public static String m1298(Object obj, int i) {
        if (C0148.m6464() <= 0) {
            return ((TypedArray) obj).getString(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۨۢ, reason: contains not printable characters */
    public static void m1299(Object obj, Object obj2) {
        if (C0084.m3253() <= 0) {
            wr.d.i((View) obj, (ColorStateList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۣ۠ۤ, reason: contains not printable characters */
    public static ConnectionBlocker m1300(Object obj) {
        if (C0218.m8760() > 0) {
            return ((j5) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۨۦ, reason: contains not printable characters */
    public static ColorFilter m1301(Object obj, Object obj2) {
        if (C0215.m8604() < 0) {
            return ((Paint) obj).setColorFilter((ColorFilter) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۡۥ, reason: contains not printable characters */
    public static void m1302() {
        if (C0169.m7034() <= 0) {
            kq.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۦۥۢۧ, reason: contains not printable characters */
    public static boolean m1303(Object obj, float f, float f2, Object obj2, boolean z) {
        if (C0096.m3601() <= 0) {
            return ((PathMeasure) obj).getSegment(f, f2, (Path) obj2, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۨۡۥ, reason: contains not printable characters */
    public static void m1305(Object obj, Object obj2, Object obj3) {
        if (C0218.m8760() >= 0) {
            ((aa) obj).b((Map) obj2, (View) obj3);
        }
    }

    /* JADX INFO: renamed from: ۧۢۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1306(Object obj) {
        if (C0200.m8104() < 0) {
            return ((ws) obj).k;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۧ۟, reason: not valid java name and contains not printable characters */
    public static void m1307(Object obj, Object obj2) {
        if (C0052.m1890() > 0) {
            ((View) obj).setOnClickListener((View.OnClickListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static long m1308() {
        if (C0112.m4054() < 0) {
            return f2.m5957();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۨۢۦ, reason: not valid java name and contains not printable characters */
    public static void m1309(Object obj, Object obj2, long j, long j2) {
        if (C0004.m139() <= 0) {
            ((jb) obj).d((s2) obj2, j, j2);
        }
    }

    /* JADX INFO: renamed from: ۨۤۨۦ, reason: not valid java name and contains not printable characters */
    public static ProviderInfo m1310(Object obj, Object obj2, int i) {
        if (C0120.m4608() >= 0) {
            return ((PackageManager) obj).getProviderInfo((ComponentName) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۢۦ, reason: not valid java name and contains not printable characters */
    public static int m1311(Object obj) {
        if (C0187.m7613() >= 0) {
            return ((k0.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۧۤۤ, reason: not valid java name and contains not printable characters */
    public static void m1312(Object obj, int i) {
        if (C0127.m4950() >= 0) {
            ((sr) obj).w(i);
        }
    }

    /* JADX INFO: renamed from: ۦۧۥۢ, reason: contains not printable characters */
    public static String m1304(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
