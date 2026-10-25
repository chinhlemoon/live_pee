package androidx.core.widget;

import android.animation.Keyframe;
import android.app.Activity;
import android.app.Dialog;
import android.app.NotificationManager;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.FontVariationAxis;
import android.media.MediaCodec;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.C0002;
import android.support.v4.app.C0004;
import android.support.v4.graphics.drawable.C0010;
import android.support.v4.graphics.drawable.C0011;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.annotation.C0023;
import androidx.annotation.C0025;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0034;
import androidx.appcompat.app.C0035;
import androidx.appcompat.widget.C0047;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0053;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0064;
import androidx.drawerlayout.widget.C0072;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0079;
import androidx.emoji2.text.C0083;
import androidx.emoji2.text.C0084;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0096;
import androidx.fragment.app.C0099;
import androidx.fragment.app.a;
import androidx.lifecycle.C0106;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0118;
import androidx.profileinstaller.C0119;
import androidx.savedstate.C0123;
import androidx.savedstate.C0126;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0129;
import androidx.versionedparcelable.C0133;
import com.example.vcam.HookMain;
import com.example.vcam.MainActivity;
import com.example.vcam.Menu;
import com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.Cdo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.am;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.b;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ep;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ib;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.iq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.is;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.md;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ne;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.nf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.oj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.re;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ws;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z7;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InterruptedIOException;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import okhttp3.C0238;
import okhttp3.C0239;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.io.C0195;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.internal.ws.C0224;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0232;
import okhttp3.logging.C0234;
import retrofit2.C0259;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: androidx.core.widget.۟ۧۡۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0068 {

    /* JADX INFO: renamed from: ۦ۠۠۟, reason: contains not printable characters */
    public static int f62 = -872;

    /* JADX INFO: renamed from: ۟۟۠ۨ۟, reason: not valid java name and contains not printable characters */
    public static int m2586(Object obj) {
        if (C0078.m3044() < 0) {
            return ((m2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۡۦۨ, reason: not valid java name and contains not printable characters */
    public static String m2587(Object obj) {
        if (C0096.m3601() < 0) {
            return ((nf) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m2588(Object obj, Object obj2, double d) {
        if (C0084.m3253() <= 0) {
            ((Bundle) obj).putDouble((String) obj2, d);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static q m2589(Object obj) {
        if (C0035.m1268() <= 0) {
            return ((ws) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۦ۠, reason: not valid java name and contains not printable characters */
    public static String m2590(Object obj) {
        if (C0025.m934() >= 0) {
            return ((String) obj).toLowerCase();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۧۦ, reason: not valid java name and contains not printable characters */
    public static MediaPlayer m2591() {
        if (C0176.m7290() > 0) {
            return HookMain.c2_player;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۡۦ, reason: not valid java name and contains not printable characters */
    public static void m2592(Object obj, Object obj2) {
        if (C0106.m3835() > 0) {
            ((ViewTreeObserver) obj).removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۨۡۧ, reason: not valid java name and contains not printable characters */
    public static View.AccessibilityDelegate m2593(Object obj) {
        if (C0047.m1663() < 0) {
            return ((View) obj).getAccessibilityDelegate();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠۟, reason: not valid java name and contains not printable characters */
    public static void m2594(Object obj, Object obj2) {
        if (C0178.m7344() <= 0) {
            ((FrameLayout) obj).getLocationInWindow((int[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥۢ, reason: not valid java name and contains not printable characters */
    public static String m2595() {
        if (C0199.m7998() <= 0) {
            return "ۣۦۥ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦۡ, reason: not valid java name and contains not printable characters */
    public static long m2596(Object obj) {
        if (C0123.m4841() <= 0) {
            return ((bn) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡۨ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m2597(Object obj, Object obj2) {
        if (C0239.m9805() < 0) {
            ((yn) obj).j((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢ۠۟, reason: not valid java name and contains not printable characters */
    public static void m2598(Object obj, Object obj2) {
        if (C0128.m5064() < 0) {
            ((ActionMode.Callback) obj).onDestroyActionMode((ActionMode) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۢۤ۟, reason: not valid java name and contains not printable characters */
    public static float m2599(Object obj) {
        if (C0079.m3072() <= 0) {
            return ((TextPaint) obj).getTextScaleX();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۢۢۦۣ, reason: not valid java name and contains not printable characters */
    public static l9.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m2600(Object obj) {
        if (C0062.m2326() >= 0) {
            return ((l9.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۨۨ, reason: not valid java name and contains not printable characters */
    public static void m2601(Object obj, Object obj2, Object obj3) {
        if (C0225.m9001() >= 0) {
            ((wr.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).b((View) obj2, (CharSequence) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m2602(Object obj, Object obj2, Object obj3, Object obj4, int i, Object obj5, Object obj6) {
        if (C0119.m4573() >= 0) {
            Menu.m5683((Menu) obj, (EditText) obj2, (EditText) obj3, (EditText) obj4, i, (Dialog) obj5, (View) obj6);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m2603(Object obj, int i, int i2) {
        if (C0213.m8458() >= 0) {
            return ((j0.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).z(i, i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۦۡۨ, reason: not valid java name and contains not printable characters */
    public static int m2604(Object obj) {
        if (C0093.m3365() >= 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۦۨۦ, reason: not valid java name and contains not printable characters */
    public static int m2605(Object obj) {
        if (C0249.m10052() < 0) {
            return ((View) obj).getMeasuredWidth();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۧۡ۠, reason: not valid java name and contains not printable characters */
    public static a3.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m2606() {
        if (C0049.m1767() < 0) {
            return a3.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean m2607(Object obj, Object obj2) {
        if (C0064.m2388() > 0) {
            return ne.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Activity) obj, (KeyEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m2609(Object obj, Object obj2) {
        if (C0129.m5108() > 0) {
            return ((am) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((re) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static boolean m2610(Object obj) {
        if (C0072.m2856() <= 0) {
            return ((View) obj).isPaddingRelative();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۥۤ, reason: not valid java name and contains not printable characters */
    public static boolean m2611(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2, int i3, Object obj5) {
        if (C0113.m4144() < 0) {
            return ((wq) obj).f((Context) obj2, obj3, (String) obj4, i, i2, i3, (FontVariationAxis[]) obj5);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m2612(Object obj, Object obj2) {
        if (C0133.m5208() <= 0) {
            return ((Context) obj).deleteFile((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢۨ, reason: not valid java name and contains not printable characters */
    public static int m2613(Object obj) {
        if (C0058.m2184() > 0) {
            return ((m9.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۥۢ, reason: not valid java name and contains not printable characters */
    public static void m2614(Object obj) {
        if (C0025.m934() > 0) {
            ((xf) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۨۧۧ, reason: not valid java name and contains not printable characters */
    public static void m2615(Object obj, Object obj2) {
        if (C0195.m7914() >= 0) {
            ((hm) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m2616(Object obj) {
        if (C0149.m6476() <= 0) {
            return ((xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static ConcurrentHashMap m2617() {
        if (C0004.m139() < 0) {
            return l1.e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۧۢ, reason: not valid java name and contains not printable characters */
    public static int m2618(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۤۧۨ, reason: not valid java name and contains not printable characters */
    public static Boolean m2619(boolean z) {
        if (C0149.m6476() < 0) {
            return Boolean.valueOf(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Object m2620(Object obj, Object obj2, int i) {
        if (C0162.m6837() <= 0) {
            return dm.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ExecutorService) obj, (Callable) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m2621(Object obj) {
        if (C0031.m1148() < 0) {
            return C0214.m8553((xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۡ۟, reason: not valid java name and contains not printable characters */
    public static int m2622(Object obj) {
        if (C0164.m6900() <= 0) {
            return ((Paint.FontMetricsInt) obj).ascent;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۣۣۧ, reason: not valid java name and contains not printable characters */
    public static int m2623(int i) {
        if (C0234.m9461() <= 0) {
            return ib.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۦۣ۟, reason: not valid java name and contains not printable characters */
    public static int m2624(Object obj) {
        if (C0219.m8794() > 0) {
            return ((PopupWindow) obj).getWindowLayoutType();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m2625(Object obj, int i) {
        if (C0011.m458() >= 0) {
            return ((Resources) obj).getResourceName(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡۤ, reason: not valid java name and contains not printable characters */
    public static ThreadPoolExecutor m2626(Object obj) {
        if (C0123.m4841() <= 0) {
            return ((z7) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡۢ, reason: not valid java name and contains not printable characters */
    public static MediaCodec m2627(Object obj) {
        if (C0232.m9299() >= 0) {
            return MediaCodec.createDecoderByType((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۦۧ, reason: not valid java name and contains not printable characters */
    public static int m2628(Object obj, Object obj2) {
        if (C0215.m8604() < 0) {
            return ((Cursor) obj).getColumnIndex((String) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۤۨۦ, reason: not valid java name and contains not printable characters */
    public static rl m2629() {
        if (C0058.m2184() >= 0) {
            return C0201.m8149();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m2630(Object obj, Object obj2) {
        if (C0083.m3188() <= 0) {
            ((md) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Throwable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static List m2631(Object obj, int i) {
        if (C0225.m9001() > 0) {
            return l4.y((Iterable) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۥۡ, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m2632(Object obj, int i) {
        if (C0217.m8693() < 0) {
            return ((hm) obj).g(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۥۣ, reason: not valid java name and contains not printable characters */
    public static void m2633(Object obj) {
        if (C0010.m354() < 0) {
            ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۡ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static void m2634(Object obj) {
        if (C0106.m3835() >= 0) {
            ((LinearLayout) obj).removeAllViews();
        }
    }

    /* JADX INFO: renamed from: ۡ۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static SpannableStringBuilder m2635(Object obj, int i, int i2) {
        if (C0031.m1148() < 0) {
            return ((vn) obj).delete(i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static b.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m2636() {
        if (C0195.m7914() >= 0) {
            return b.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۦۧ, reason: not valid java name and contains not printable characters */
    public static Object m2637(Object obj, int i, Object obj2) {
        if (C0202.m8245() >= 0) {
            return ((lg) obj).a(i, obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۤ, reason: not valid java name and contains not printable characters */
    public static boolean m2638(Object obj, int i, int i2) {
        if (C0096.m3601() < 0) {
            return HookMain.b((MediaPlayer) obj, i, i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۥ۠۠, reason: not valid java name and contains not printable characters */
    public static Drawable.ConstantState m2639(Object obj) {
        if (C0116.m4340() > 0) {
            return ((k0.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۣۡ, reason: not valid java name and contains not printable characters */
    public static Keyframe m2640(float f, int i) {
        if (C0112.m4054() <= 0) {
            return Keyframe.ofInt(f, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static NotificationManager m2641(Object obj) {
        if (C0171.m7136() < 0) {
            return ((oj) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static AtomicReferenceFieldUpdater m2642(Object obj) {
        if (C0116.m4340() >= 0) {
            return ((e.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۤ, reason: not valid java name and contains not printable characters */
    public static void m2643(Object obj, Object obj2, Object obj3) {
        if (C0259.m10136() > 0) {
            Cdo.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Appendable) obj, obj2, (qa) obj3);
        }
    }

    /* JADX INFO: renamed from: ۢۢۧ, reason: not valid java name and contains not printable characters */
    public static int m2644(Object obj) {
        if (C0128.m5064() < 0) {
            return ((m9.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۢۧۧ, reason: not valid java name and contains not printable characters */
    public static void m2645(Object obj) {
        if (C0162.m6837() < 0) {
            ((Response) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۢۥ, reason: not valid java name and contains not printable characters */
    public static Class m2646() {
        if (C0191.m7812() > 0) {
            return xs.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۨ۟, reason: not valid java name and contains not printable characters */
    public static MenuInflater m2647(Object obj) {
        if (C0083.m3188() < 0) {
            return ((q) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣۡ, reason: not valid java name and contains not printable characters */
    public static int m2648(Object obj, int i) {
        if (C0053.m1959() >= 0) {
            return ((Calendar) obj).get(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۣۤ, reason: not valid java name and contains not printable characters */
    public static void m2649(Object obj, long j, Object obj2) {
        if (C0002.m72() > 0) {
            ((xf) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(j, obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣۤۨ, reason: not valid java name and contains not printable characters */
    public static int m2650() {
        return 1018 ^ C0172.f622;
    }

    /* JADX INFO: renamed from: ۣۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m2651(String str) {
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

    /* JADX INFO: renamed from: ۣۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m2652(Object obj) {
        if (C0023.m843() >= 0) {
            ((BufferedReader) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۤ۟ۦۨ, reason: not valid java name and contains not printable characters */
    public static Typeface m2653(Object obj) {
        if (C0062.m2326() > 0) {
            return Typeface.createFromFile((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡ۟, reason: not valid java name and contains not printable characters */
    public static Runnable m2654(Object obj) {
        if (C0004.m139() < 0) {
            return ((v0) obj).W;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۡۤ, reason: not valid java name and contains not printable characters */
    public static void m2655(Object obj, Object obj2, int i) {
        if (C0169.m7034() <= 0) {
            rn.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((int[]) obj, (Object[]) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۤۢۡۦ, reason: not valid java name and contains not printable characters */
    public static void m2656(Object obj) {
        if (C0034.m1206() < 0) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }
    }

    /* JADX INFO: renamed from: ۤۦۣ, reason: not valid java name and contains not printable characters */
    public static int m2657(Object obj) {
        if (C0099.m3752() < 0) {
            return ((v1) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۦۧۥ, reason: not valid java name and contains not printable characters */
    public static boolean m2658(Object obj, Object obj2, Object obj3) {
        if (C0083.m3188() < 0) {
            return ((wr.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj2, obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۦ۟ۨ, reason: contains not printable characters */
    public static MenuItem m2659(Object obj, int i) {
        if (C0094.m3450() >= 0) {
            return ((vo) obj).setShowAsActionFlags(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۤ۟, reason: contains not printable characters */
    public static void m2660(Object obj) {
        if (C0034.m1206() <= 0) {
            C0240.m9841((MainActivity) obj);
        }
    }

    /* JADX INFO: renamed from: ۦ۟ۥۢ, reason: contains not printable characters */
    public static void m2661(Object obj) {
        if (C0199.m7998() < 0) {
            ((a) obj).u();
        }
    }

    /* JADX INFO: renamed from: ۦۣۢۤ, reason: contains not printable characters */
    public static Object m2662(Object obj) {
        if (C0238.m9653() >= 0) {
            return pp.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((y5) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۤۨ, reason: contains not printable characters */
    public static Object m2663(Object obj, Object obj2) {
        if (C0126.m4908() < 0) {
            return x4.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj, (qa) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۧۤ, reason: contains not printable characters */
    public static void m2664(Object obj, Object obj2, int i, Object obj3) {
        if (C0224.m8861() < 0) {
            ((Activity) obj).startActivityForResult((Intent) obj2, i, (Bundle) obj3);
        }
    }

    /* JADX INFO: renamed from: ۧ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static Uri.Builder m2665(Object obj, Object obj2) {
        if (C0176.m7290() >= 0) {
            return ((Uri.Builder) obj).fragment((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static float[] m2666(Object obj) {
        if (C0129.m5108() >= 0) {
            return ((pr) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static View m2667(Object obj) {
        if (C0062.m2326() >= 0) {
            return ((is) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۣ۟, reason: not valid java name and contains not printable characters */
    public static void m2668(Object obj, Object obj2) {
        if (C0079.m3072() <= 0) {
            Menu.m5655((Menu) obj, (View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧۧۡۤ, reason: not valid java name and contains not printable characters */
    public static Throwable m2669(Object obj, Object obj2) {
        if (C0118.m4454() > 0) {
            return ((InterruptedIOException) obj).initCause((Throwable) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۥۨ, reason: not valid java name and contains not printable characters */
    public static void m2670(Object obj) {
        if (C0083.m3188() <= 0) {
            ((iq) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۨۨۡ۠, reason: not valid java name and contains not printable characters */
    public static ep m2671() {
        if (C0149.m6476() <= 0) {
            return jp.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۠۟, reason: not valid java name and contains not printable characters */
    public static String m2608(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
