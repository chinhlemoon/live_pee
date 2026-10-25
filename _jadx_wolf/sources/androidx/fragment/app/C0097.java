package androidx.fragment.app;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.icu.util.ULocale;
import android.media.MediaCodecInfo;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v4.graphics.drawable.C0009;
import android.support.v4.graphics.drawable.C0010;
import android.support.v4.graphics.drawable.C0011;
import android.text.PrecomputedText;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.Menu;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.activity.C0014;
import androidx.activity.C0017;
import androidx.activity.C0021;
import androidx.annotation.C0023;
import androidx.appcompat.app.C0034;
import androidx.appcompat.app.C0035;
import androidx.appcompat.app.C0036;
import androidx.appcompat.app.C0037;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.core.app.C0051;
import androidx.core.app.C0052;
import androidx.core.app.C0055;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0065;
import androidx.drawerlayout.widget.C0070;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0079;
import androidx.emoji2.text.C0084;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.C0106;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0116;
import androidx.savedstate.C0122;
import androidx.savedstate.C0123;
import androidx.savedstate.C0127;
import androidx.versionedparcelable.C0129;
import androidx.versionedparcelable.C0133;
import androidx.versionedparcelable.C0135;
import com.example.vcam.C0141;
import com.example.vcam.HookMain;
import com.example.vcam.LicenseManager;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bt;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dt;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ej;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.g1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.iq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lh;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mi;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rb;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ti;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.w2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ws;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Queue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.zip.Inflater;
import javax.crypto.IllegalBlockSizeException;
import okhttp3.C0238;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.internal.C0227;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.internal.ws.C0224;
import okhttp3.logging.C0231;
import okhttp3.logging.C0232;
import okhttp3.logging.C0233;
import okhttp3.logging.C0234;
import okhttp3.logging.C0235;
import okhttp3.logging.C0236;
import org.xmlpull.v1.XmlPullParser;
import retrofit2.C0259;
import retrofit2.converter.scalars.C0243;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: androidx.fragment.app.ۡ۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0097 {

    /* JADX INFO: renamed from: ۣ۟۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static int f84 = -331;

    /* JADX INFO: renamed from: ۟۟۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static float m3609(Object obj) {
        if (C0236.m9615() > 0) {
            return ((m2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static int m3610(Object obj) {
        if (C0037.m1437() < 0) {
            return ((bf) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static k0 m3611(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0224.m8861() <= 0) {
            return k0.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj, (Resources) obj2, (XmlPullParser) obj3, (AttributeSet) obj4, (Resources.Theme) obj5);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static void m3612(Object obj, Object obj2, Object obj3) {
        if (C0051.m1783() < 0) {
            ((Canvas) obj).drawPath((Path) obj2, (Paint) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟۠۠ۦۣ, reason: not valid java name and contains not printable characters */
    public static void m3613(Object obj, Object obj2) {
        if (C0249.m10052() < 0) {
            ((ObjectAnimator) obj).setInterpolator((TimeInterpolator) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۡۦۦ, reason: not valid java name and contains not printable characters */
    public static int m3614(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۠ۢۤۧ, reason: not valid java name and contains not printable characters */
    public static void m3615(Object obj, Object obj2) {
        if (C0099.m3752() <= 0) {
            ((MediaPlayer) obj).setOnPreparedListener((MediaPlayer.OnPreparedListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠۟ۢ, reason: not valid java name and contains not printable characters */
    public static View m3616(Object obj) {
        if (C0135.m5274() <= 0) {
            return ((o9) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static boolean m3617(Object obj, boolean z, int i, Object obj2, int i2, int i3) {
        if (C0112.m4054() < 0) {
            return ((String) obj).regionMatches(z, i, (String) obj2, i2, i3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m3618(Object obj) {
        if (C0010.m354() <= 0) {
            ((s0) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۟۠ۨۨ۟, reason: not valid java name and contains not printable characters */
    public static void m3619(Object obj) {
        if (C0099.m3752() <= 0) {
            ((u0) obj).v();
        }
    }

    /* JADX INFO: renamed from: ۟۠ۨۨۨ, reason: not valid java name and contains not printable characters */
    public static void m3620(Object obj, int i) {
        if (C0188.m7736() <= 0) {
            ((z1) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۥۡ, reason: not valid java name and contains not printable characters */
    public static void m3621(Object obj, Object obj2) {
        if (C0259.m10136() > 0) {
            ((mi) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Menu) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۡ, reason: not valid java name and contains not printable characters */
    public static boolean m3622(Object obj) {
        if (C0009.m276() <= 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).l;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m3623(Object obj, int i) {
        if (C0113.m4144() <= 0) {
            ((ViewGroup) obj).setId(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۥۤۨ, reason: not valid java name and contains not printable characters */
    public static k0 m3624(Object obj) {
        if (C0093.m3365() >= 0) {
            return k0.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۥۣ, reason: not valid java name and contains not printable characters */
    public static Object m3625(Object obj, Object obj2, Object obj3) {
        if (C0202.m8245() > 0) {
            return ((LinkedHashMap) obj).put(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۦۨ, reason: not valid java name and contains not printable characters */
    public static Void m3626(Object obj, Object obj2) {
        if (C0141.m5769() >= 0) {
            return ((k3) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧۥۦ, reason: not valid java name and contains not printable characters */
    public static q m3627(Object obj, Object obj2) {
        if (C0079.m3072() <= 0) {
            return ((q0) obj).c((q.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢۨ, reason: not valid java name and contains not printable characters */
    public static void m3628(Object obj) {
        if (C0231.m9265() >= 0) {
            ((zr) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧۥ, reason: not valid java name and contains not printable characters */
    public static Queue m3629(Object obj) {
        if (C0181.m7445() > 0) {
            return ((p1.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨ۠, reason: not valid java name and contains not printable characters */
    public static String m3630(Object obj) {
        if (C0233.m9365() < 0) {
            return ((IllegalBlockSizeException) obj).getMessage();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۤۨ, reason: not valid java name and contains not printable characters */
    public static q.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m3631(Object obj) {
        if (C0224.m8861() < 0) {
            return ((ws.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۨۥ, reason: not valid java name and contains not printable characters */
    public static void m3632(Object obj, int i) {
        if (C0034.m1206() < 0) {
            ((PopupWindow) obj).setWindowLayoutType(i);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m3633(Object obj) {
        if (C0070.m2829() < 0) {
            return ((fn) obj).r();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۥ, reason: not valid java name and contains not printable characters */
    public static ProviderInfo m3634(Object obj, Object obj2, Object obj3) {
        if (C0014.m545() >= 0) {
            return i9.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((PackageManager) obj, (j9) obj2, (Resources) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۤۥ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo m3635(Object obj) {
        if (C0232.m9299() >= 0) {
            return ((View) obj).createAccessibilityNodeInfo();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۧۢ, reason: not valid java name and contains not printable characters */
    public static PrecomputedText m3636(Object obj) {
        if (C0240.m9826() > 0) {
            return ((uk) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۢۢ, reason: not valid java name and contains not printable characters */
    public static int[] m3637() {
        if (C0011.m458() > 0) {
            return i0.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static com.example.vcam.Menu m3638(Object obj) {
        if (C0182.m7528() <= 0) {
            return ((com.example.vcam.Menu.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static PorterDuffColorFilter m3639(Object obj, Object obj2, Object obj3) {
        if (C0094.m3450() >= 0) {
            return hm.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ColorStateList) obj, (PorterDuff.Mode) obj2, (int[]) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۢ۠, reason: not valid java name and contains not printable characters */
    public static Drawable m3640(Object obj, Object obj2) {
        if (C0215.m8604() < 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).k((Drawable) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۦ, reason: not valid java name and contains not printable characters */
    public static j0 m3641(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0227.m9046() > 0) {
            return j0.e((Context) obj, (Resources) obj2, (XmlPullParser) obj3, (AttributeSet) obj4, (Resources.Theme) obj5);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥ۟۠, reason: not valid java name and contains not printable characters */
    public static void m3642(Object obj) {
        if (C0055.m2054() > 0) {
            m7.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((l7) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۥۧۢ, reason: not valid java name and contains not printable characters */
    public static long m3643(Object obj, Object obj2) {
        if (C0238.m9653() >= 0) {
            return ((dk.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((s2) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۨۡۦ, reason: not valid java name and contains not printable characters */
    public static void m3644(Object obj, boolean z) {
        if (C0021.m740() < 0) {
            ((AnimationDrawable) obj).setOneShot(z);
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m3645(Object obj, long j) {
        if (C0127.m4950() > 0) {
            return ((StringBuilder) obj).append(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡ۟, reason: not valid java name and contains not printable characters */
    public static String m3646(String str) {
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

    /* JADX INFO: renamed from: ۟ۥۧۦ۠, reason: not valid java name and contains not printable characters */
    public static void m3647(Object obj) {
        if (C0127.m4950() > 0) {
            lm.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Resources) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۨ۠۟, reason: not valid java name and contains not printable characters */
    public static BroadcastReceiver m3648(Object obj) {
        if (C0235.m9535() <= 0) {
            return ((v0.g) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static dt m3649(Object obj) {
        if (C0034.m1206() <= 0) {
            return ((bt) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۥۣ, reason: not valid java name and contains not printable characters */
    public static void m3650(Object obj) {
        if (C0172.m7180() >= 0) {
            ((a) obj).q();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۤۨۢ, reason: not valid java name and contains not printable characters */
    public static com.example.vcam.Menu m3651(Object obj) {
        if (C0116.m4340() > 0) {
            return ((lh) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠۠۟, reason: not valid java name and contains not printable characters */
    public static String m3652(Object obj) {
        if (C0176.m7290() >= 0) {
            return ((ULocale) obj).getScript();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m3653(Object obj, Object obj2) {
        if (C0122.m4736() < 0) {
            ((ProgressBar) obj).setProgressDrawable((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static MediaCodecInfo.CodecCapabilities m3654(Object obj, Object obj2) {
        if (C0084.m3253() <= 0) {
            return ((MediaCodecInfo) obj).getCapabilitiesForType((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static float m3655(Object obj) {
        if (C0074.m2951() <= 0) {
            return ((TextView) obj).getTextScaleX();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۠ۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m3656(Object obj) {
        if (C0214.m8575() < 0) {
            ((fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static byte[] m3657(Object obj, int i, int i2) {
        if (C0035.m1268() < 0) {
            return r8.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((InputStream) obj, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۥ۟, reason: not valid java name and contains not printable characters */
    public static void m3658(Object obj, Object obj2, Object obj3) {
        if (C0074.m2951() < 0) {
            ((u0) obj).B((View) obj2, (ViewGroup.LayoutParams) obj3);
        }
    }

    /* JADX INFO: renamed from: ۠ۤۨۤ, reason: not valid java name and contains not printable characters */
    public static int m3659() {
        return (-405) ^ C0234.f684;
    }

    /* JADX INFO: renamed from: ۠ۦۧۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3660(Object obj) {
        if (C0259.m10136() > 0) {
            return ((Inflater) obj).needsDictionary();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۡۡۧ, reason: not valid java name and contains not printable characters */
    public static void m3662(Object obj, Object obj2, Object obj3) {
        if (C0204.m8270() < 0) {
            ((EmojiCompatInitializer.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((androidx.emoji2.text.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2, (ThreadPoolExecutor) obj3);
        }
    }

    /* JADX INFO: renamed from: ۡۥۡۥ, reason: not valid java name and contains not printable characters */
    public static int m3663(Object obj) {
        if (C0065.m2448() > 0) {
            return ((ViewGroup.MarginLayoutParams) obj).height;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۨۦۨ, reason: not valid java name and contains not printable characters */
    public static void m3664(Object obj, boolean z) {
        if (C0233.m9365() < 0) {
            ((s8) obj).S(z);
        }
    }

    /* JADX INFO: renamed from: ۢ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static int[] m3665() {
        if (C0172.m7180() > 0) {
            return i0.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۡۤ, reason: not valid java name and contains not printable characters */
    public static ActionMode m3666(Object obj, Object obj2) {
        if (C0094.m3450() >= 0) {
            return ((Window.Callback) obj).onWindowStartingActionMode((ActionMode.Callback) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۡ۠, reason: not valid java name and contains not printable characters */
    public static int[] m3667() {
        if (C0234.m9461() < 0) {
            return StateSet.WILD_CARD;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۡۤ, reason: not valid java name and contains not printable characters */
    public static void m3668(Object obj, boolean z) {
        if (C0036.m1332() <= 0) {
            ((Drawable) obj).setFilterBitmap(z);
        }
    }

    /* JADX INFO: renamed from: ۢۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m3669(Object obj) {
        if (C0194.m7889() >= 0) {
            return ((InputStream) obj).available();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧ, reason: not valid java name and contains not printable characters */
    public static hm m3670() {
        if (C0093.m3365() >= 0) {
            return hm.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static Method m3671() {
        if (C0113.m4144() <= 0) {
            return x.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m3672(Object obj) {
        if (C0035.m1268() < 0) {
            return ((HookMain) obj).isRotationEnabled;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۢ۟, reason: not valid java name and contains not printable characters */
    public static void m3673(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0014.m545() >= 0) {
            ((TextView) obj).setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) obj2, (Drawable) obj3, (Drawable) obj4, (Drawable) obj5);
        }
    }

    /* JADX INFO: renamed from: ۣۦ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m3674(Object obj) {
        if (C0094.m3450() > 0) {
            return ((LicenseManager) obj).k();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static void m3675(Object obj, Object obj2) {
        if (C0211.m8341() > 0) {
            qc.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ImageView) obj, (ColorStateList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۦۣۡ, reason: not valid java name and contains not printable characters */
    public static Drawable m3676(Object obj, Object obj2) {
        if (m3659() > 0) {
            return ((dt) obj).newDrawable((Resources) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static int m3677(Object obj) {
        if (C0115.m4218() <= 0) {
            return ((TypedArray) obj).getChangingConfigurations();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۣ۟ۨ, reason: contains not printable characters */
    public static TypedValue m3678() {
        if (C0106.m3835() > 0) {
            return m4.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۨۤ, reason: contains not printable characters */
    public static Method m3679() {
        if (C0062.m2326() >= 0) {
            return u7.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠۟ۤ, reason: contains not printable characters */
    public static boolean m3680(Object obj) {
        if (C0023.m843() >= 0) {
            return ((LicenseManager) obj).c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۡۥۤ, reason: contains not printable characters */
    public static int[] m3681(Object obj) {
        if (C0123.m4841() < 0) {
            return ((fn) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۡۤ, reason: contains not printable characters */
    public static byte[] m3682(Object obj) {
        if (C0129.m5108() >= 0) {
            return ((ByteArrayOutputStream) obj).toByteArray();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۢ, reason: contains not printable characters */
    public static void m3683(Object obj, int i) {
        if (C0009.m276() < 0) {
            kp.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TextView) obj, i);
        }
    }

    /* JADX INFO: renamed from: ۥۣۨۡ, reason: contains not printable characters */
    public static HookMain m3684(Object obj) {
        if (m3659() >= 0) {
            return ((rb) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۦۤ, reason: contains not printable characters */
    public static void m3685(Object obj, boolean z) {
        if (C0200.m8104() <= 0) {
            ((ActionBarContextView) obj).setTitleOptional(z);
        }
    }

    /* JADX INFO: renamed from: ۦ۟ۦ, reason: contains not printable characters */
    public static Throwable m3686(Object obj) {
        if (C0181.m7445() > 0) {
            return ((CancellationException) obj).getCause();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۟ۦ, reason: contains not printable characters */
    public static boolean m3687(Object obj, float f, float f2, float f3) {
        if (C0219.m8794() > 0) {
            return ((Matrix) obj).postRotate(f, f2, f3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۣۡۤ, reason: contains not printable characters */
    public static Context m3688(Object obj) {
        if (C0169.m7034() < 0) {
            return ((o) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۧۦ, reason: contains not printable characters */
    public static zj m3689(Object obj) {
        if (C0017.m627() >= 0) {
            return ((wr.j) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۢۧ, reason: contains not printable characters */
    public static Method m3690(Object obj) {
        if (C0113.m4144() < 0) {
            return ((ti.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۨ۠, reason: contains not printable characters */
    public static Class m3691(Object obj) {
        if (C0243.m9964() > 0) {
            return ((i.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧ۠, reason: contains not printable characters */
    public static Path m3692(Object obj) {
        if (C0052.m1890() > 0) {
            return mk.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static boolean m3693(Object obj, Object obj2, Object obj3) {
        if (C0133.m5208() <= 0) {
            return g1.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((DragEvent) obj, (TextView) obj2, (Activity) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۡ۟۠, reason: not valid java name and contains not printable characters */
    public static void m3694(Object obj) {
        if (C0099.m3752() <= 0) {
            ((SubMenu) obj).clearHeader();
        }
    }

    /* JADX INFO: renamed from: ۧۡۦۧ, reason: not valid java name and contains not printable characters */
    public static y4 m3695(Object obj) {
        if (C0215.m8604() <= 0) {
            return ((pr.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۧ۟, reason: not valid java name and contains not printable characters */
    public static Method m3696() {
        if (C0218.m8760() >= 0) {
            return s7.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۤۨ, reason: not valid java name and contains not printable characters */
    public static int m3697() {
        if (C0127.m4950() >= 0) {
            return w2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean m3698(Object obj, Object obj2, long j) {
        if (C0217.m8693() < 0) {
            return ((Handler) obj).postDelayed((Runnable) obj2, j);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static void m3699(Object obj) {
        if (C0116.m4340() > 0) {
            u0.w((u0) obj);
        }
    }

    /* JADX INFO: renamed from: ۣۨۧۡ, reason: not valid java name and contains not printable characters */
    public static boolean m3700(Object obj, Object obj2) {
        if (C0074.m2951() < 0) {
            return ej.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Activity) obj, (Intent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨۨۢ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m3701(Object obj) {
        if (C0211.m8341() > 0) {
            return ((qm) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۧ, reason: not valid java name and contains not printable characters */
    public static iq m3702(Object obj) {
        if (C0178.m7344() < 0) {
            return ((hq) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static String m3661(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
