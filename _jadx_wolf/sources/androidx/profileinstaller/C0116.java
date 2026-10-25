package androidx.profileinstaller;

import android.app.AppOpsManager;
import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.support.v4.app.C0002;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.C0020;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.C0047;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0052;
import androidx.core.app.C0053;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0064;
import androidx.core.widget.C0068;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0072;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0079;
import androidx.emoji2.text.C0084;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0096;
import androidx.fragment.app.C0097;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.lifecycle.C0106;
import androidx.lifecycle.C0108;
import androidx.lifecycle.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.savedstate.C0123;
import androidx.savedstate.C0126;
import androidx.savedstate.C0127;
import androidx.versionedparcelable.C0135;
import com.example.vcam.C0141;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.HookMain;
import com.example.vcam.MainActivity;
import com.example.vcam.VideoPickerActivity;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.an;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ar;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.b;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.en;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ij;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ko;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.oi;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pi;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ql;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.up;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ws;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zp;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.internal.C0227;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0195;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.internal.ws.C0224;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0231;
import okhttp3.logging.C0232;
import okhttp3.logging.C0233;
import okhttp3.logging.C0234;
import okhttp3.logging.C0235;
import retrofit2.C0259;

/* JADX INFO: renamed from: androidx.profileinstaller.۟ۥۣۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0116 {

    /* JADX INFO: renamed from: ۨۤۦۥ, reason: not valid java name and contains not printable characters */
    public static int f96 = 609;

    /* JADX INFO: renamed from: ۣ۟۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m4283(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static void m4284(Object obj, Object obj2, Object obj3) {
        if (C0199.m7998() <= 0) {
            ((k1) obj).f((WeakReference) obj2, (Typeface) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۧۡۢ, reason: not valid java name and contains not printable characters */
    public static int m4285(Object obj) {
        if (C0182.m7528() <= 0) {
            return wr.b.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m4286(Object obj) {
        if (C0119.m4573() > 0) {
            return ((Method) obj).getName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨۥۧ, reason: not valid java name and contains not printable characters */
    public static int[] m4287() {
        if (C0195.m7914() > 0) {
            return ql.s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m4288() {
        if (C0141.m5769() >= 0) {
            return xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.INITIALIZED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۤۨ, reason: not valid java name and contains not printable characters */
    public static xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m4289() {
        if (C0178.m7344() <= 0) {
            return xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.CREATED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static void m4290(Object obj) {
        if (C0002.m72() > 0) {
            ((MainActivity) obj).o0();
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static String m4291() {
        if (C0149.m6476() < 0) {
            return Build.FINGERPRINT;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static up.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m4292() {
        if (C0194.m7889() > 0) {
            return up.Companion;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4293(Object obj) {
        if (C0149.m6476() <= 0) {
            return ((r6) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۦۧۡ, reason: not valid java name and contains not printable characters */
    public static Configuration m4294(Object obj, Object obj2, int i, Object obj3, Object obj4, boolean z) {
        if (C0049.m1767() < 0) {
            return ((v0) obj).S((Context) obj2, i, (mf) obj3, (Configuration) obj4, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static int m4295(Object obj) {
        if (C0191.m7812() >= 0) {
            return ((lg.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۡۥۧ, reason: not valid java name and contains not printable characters */
    public static String m4296(Object obj) {
        if (C0064.m2388() >= 0) {
            return ((File) obj).getAbsolutePath();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۥۥ, reason: not valid java name and contains not printable characters */
    public static long m4297(Object obj) {
        if (C0215.m8604() <= 0) {
            return ((t8) obj).m0();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۤۥۡ, reason: not valid java name and contains not printable characters */
    public static Shader.TileMode m4298() {
        if (C0053.m1959() > 0) {
            return Shader.TileMode.MIRROR;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۢۤ, reason: not valid java name and contains not printable characters */
    public static Interpolator m4299(Object obj, int i) {
        if (C0234.m9461() < 0) {
            return AnimationUtils.loadInterpolator((Context) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۤۤ, reason: not valid java name and contains not printable characters */
    public static TextView m4300(Object obj) {
        if (C0171.m7136() < 0) {
            return ((j1) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static xo m4301() {
        if (C0188.m7736() < 0) {
            return j7.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static String m4302(Object obj) {
        if (C0084.m3253() < 0) {
            return ((InetSocketAddress) obj).getHostName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4303(Object obj) {
        if (C0172.m7180() > 0) {
            return ((tf) obj).f();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۢۦ, reason: not valid java name and contains not printable characters */
    public static Object m4304(Object obj, long j) {
        if (C0072.m2856() < 0) {
            return ((xf) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static int m4305(Object obj) {
        if (C0235.m9535() < 0) {
            return ((uk.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4306(Object obj) {
        if (C0199.m7998() < 0) {
            return ((b.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).hasNext();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m4307(int i) {
        if (C0047.m1663() < 0) {
            return ColorStateList.valueOf(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۦ۠, reason: not valid java name and contains not printable characters */
    public static void m4309(Object obj, int i, int i2, int i3, int i4, int i5) {
        if (C0181.m7445() > 0) {
            ((OverScroller) obj).startScroll(i, i2, i3, i4, i5);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۤۢۡ, reason: not valid java name and contains not printable characters */
    public static oi m4310(Object obj, Object obj2, int i) {
        if (C0117.m4419() <= 0) {
            return ((pi) obj).b((oi) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۤۢ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m4311(Object obj, Object obj2, Object obj3) {
        if (C0227.m9046() >= 0) {
            return ar.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj, (CancellationSignal) obj2, (Uri) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۣ۠, reason: not valid java name and contains not printable characters */
    public static void m4312(Object obj) {
        if (C0052.m1890() >= 0) {
            obj.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۥ۠۟, reason: not valid java name and contains not printable characters */
    public static void m4313(Object obj) {
        if (C0127.m4950() >= 0) {
            ((wn) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۦۨۢ, reason: not valid java name and contains not printable characters */
    public static void m4314(Object obj, Object obj2, int i, int i2, Object obj3, int i3) {
        if (C0108.m4038() >= 0) {
            hs.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ViewParent) obj, (View) obj2, i, i2, (int[]) obj3, i3);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۧۥ, reason: not valid java name and contains not printable characters */
    public static int m4315(Object obj) {
        if (C0234.m9461() < 0) {
            return ((WindowInsets) obj).getStableInsetLeft();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۨۡ۟, reason: not valid java name and contains not printable characters */
    public static Bitmap.Config m4316() {
        if (C0062.m2326() >= 0) {
            return Bitmap.Config.ARGB_8888;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static SubMenu m4317(Object obj, int i) {
        if (C0135.m5274() < 0) {
            return ((Menu) obj).addSubMenu(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m4318(String str) {
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

    /* JADX INFO: renamed from: ۠ۡۥۣ, reason: not valid java name and contains not printable characters */
    public static Callable m4319(Object obj) {
        if (C0068.m2650() > 0) {
            return ((dm.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static AppCompatActivity m4320(Object obj) {
        if (C0224.m8861() <= 0) {
            return ((v0) obj).O0();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۡ۠, reason: not valid java name and contains not printable characters */
    public static ws.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m4321(Object obj) {
        if (C0097.m3659() >= 0) {
            return ((ws) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4322(Object obj) {
        if (C0135.m5274() <= 0) {
            return ((ConnectionBlocker) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۨۦۣ, reason: not valid java name and contains not printable characters */
    public static OnBackInvokedDispatcher m4323(Object obj) {
        if (C0233.m9365() < 0) {
            return ((Dialog) obj).getOnBackInvokedDispatcher();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m4324(Object obj) {
        if (C0020.m701() > 0) {
            return ((k1) obj).d();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۦۥۨ, reason: not valid java name and contains not printable characters */
    public static TypedValue m4325(Object obj) {
        if (C0072.m2856() < 0) {
            return ((ContentFrameLayout) obj).getFixedHeightMinor();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۢۤ, reason: not valid java name and contains not printable characters */
    public static HookMain m4326() {
        if (C0240.m9826() > 0) {
            return VideoPickerActivity.v;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۟۟, reason: not valid java name and contains not printable characters */
    public static void m4327(Object obj) {
        if (C0079.m3072() < 0) {
            ((f6.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).d();
        }
    }

    /* JADX INFO: renamed from: ۢ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static int m4328(Object obj) {
        if (C0227.m9046() >= 0) {
            return ((m2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢۢۡ, reason: not valid java name and contains not printable characters */
    public static zp m4329(Object obj, Object obj2, Object obj3) {
        if (C0200.m8104() < 0) {
            return zp.l((Context) obj, (AttributeSet) obj2, (int[]) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢۢ, reason: not valid java name and contains not printable characters */
    public static AppOpsManager m4330(Object obj) {
        if (C0126.m4908() <= 0) {
            return q1.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۥ۟, reason: not valid java name and contains not printable characters */
    public static String m4331(Object obj, Object obj2, Object obj3) {
        if (C0259.m10136() > 0) {
            return ((Bundle) obj).getString((String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥ۠۟, reason: not valid java name and contains not printable characters */
    public static void m4332(Object obj, Object obj2) {
        if (C0094.m3450() >= 0) {
            ((ActionBarOverlayLayout) obj).setActionBarVisibilityCallback((ActionBarOverlayLayout.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۦۧۦ, reason: not valid java name and contains not printable characters */
    public static void m4333(Object obj, boolean z) {
        if (C0202.m8245() >= 0) {
            ((s6) obj).e(z);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static void m4334(Object obj, Object obj2, int i, Object obj3) {
        if (C0047.m1663() < 0) {
            ((k3) obj).t(obj2, i, (qa) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣۢۥۦ, reason: not valid java name and contains not printable characters */
    public static double m4335(double d) {
        if (C0108.m4038() > 0) {
            return Math.log(d);
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: ۣۢۨۡ, reason: not valid java name and contains not printable characters */
    public static void m4336(Object obj, Object obj2) {
        if (C0217.m8693() < 0) {
            ((TextView) obj).setCompoundDrawableTintMode((PorterDuff.Mode) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m4337(Object obj) {
        if (C0225.m9001() > 0) {
            return ((a3) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int[] m4338() {
        if (C0215.m8604() <= 0) {
            return i0.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static y5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m4339(Object obj, Object obj2) {
        if (C0120.m4608() > 0) {
            return ((a) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((y5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۦۣ, reason: not valid java name and contains not printable characters */
    public static int m4340() {
        return 428 ^ C0172.f622;
    }

    /* JADX INFO: renamed from: ۤۧۧۢ, reason: not valid java name and contains not printable characters */
    public static void m4341(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0069.m2756() <= 0) {
            ((androidx.fragment.app.a) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2, (s9) obj3, (Fragment) obj4);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ, reason: contains not printable characters */
    public static com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m4342(Object obj) {
        if (C0084.m3253() <= 0) {
            return ((com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۨ۠, reason: contains not printable characters */
    public static boolean m4343(Object obj, Object obj2) {
        if (C0217.m8693() <= 0) {
            return ((MenuItem.OnActionExpandListener) obj).onMenuItemActionExpand((MenuItem) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣ۠ۢ, reason: contains not printable characters */
    public static HookMain.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m4344(Object obj) {
        if (C0231.m9265() >= 0) {
            return ((dc) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۦۦ, reason: contains not printable characters */
    public static int m4345(Object obj) {
        if (C0162.m6837() <= 0) {
            return ((x9) obj).g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۢ۠ۡ, reason: contains not printable characters */
    public static int m4346(Object obj) {
        if (C0096.m3601() < 0) {
            return ((o5.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۦۣۦ, reason: contains not printable characters */
    public static boolean m4347(Object obj) {
        if (C0074.m2951() < 0) {
            return ((s2) obj).E();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۡۤۨ, reason: contains not printable characters */
    public static Long m4348(Object obj, int i) {
        if (C0117.m4419() < 0) {
            return ko.a((String) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۦ۟, reason: contains not printable characters */
    public static long m4349(Object obj) {
        if (C0094.m3450() >= 0) {
            return ((an) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۤ۟ۥ, reason: contains not printable characters */
    public static void m4350(Object obj) {
        if (C0148.m6464() <= 0) {
            wr.b((View) obj);
        }
    }

    /* JADX INFO: renamed from: ۦۤۦ۟, reason: contains not printable characters */
    public static xs.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m4351(Object obj, Object obj2) {
        if (C0123.m4841() <= 0) {
            return ((xs.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((dd) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧۦ۠, reason: contains not printable characters */
    public static XC_LoadPackage.LoadPackageParam m4352(Object obj) {
        if (C0232.m9299() >= 0) {
            return ((HookMain.u) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟۠۠, reason: not valid java name and contains not printable characters */
    public static int m4353(Object obj, int i) {
        if (C0219.m8794() >= 0) {
            return ((MotionEvent) obj).getPointerId(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۢۡۥ, reason: not valid java name and contains not printable characters */
    public static void m4354(Object obj, boolean z) {
        if (C0213.m8458() > 0) {
            ((AccessibilityNodeInfo) obj).setScreenReaderFocusable(z);
        }
    }

    /* JADX INFO: renamed from: ۣۧۢۤ, reason: not valid java name and contains not printable characters */
    public static void m4355(Object obj, Object obj2) {
        if (C0127.m4950() > 0) {
            ((rd) obj).t((CancellationException) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧۥۣۢ, reason: not valid java name and contains not printable characters */
    public static void m4356(Object obj) {
        if (C0200.m8104() <= 0) {
            ((Path) obj).reset();
        }
    }

    /* JADX INFO: renamed from: ۣۨ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m4357(Object obj, Object obj2, Object obj3) {
        if (C0106.m3835() >= 0) {
            return mo.X((String) obj, (CharSequence) obj2, (CharSequence) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۢۡ, reason: not valid java name and contains not printable characters */
    public static WindowInsets m4358(Object obj) {
        if (C0191.m7812() >= 0) {
            return ((WindowInsets) obj).consumeStableInsets();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۥۤ, reason: not valid java name and contains not printable characters */
    public static int m4359() {
        if (C0069.m2756() <= 0) {
            return en.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۥۨۢ, reason: not valid java name and contains not printable characters */
    public static int m4360(Object obj) {
        if (C0120.m4608() > 0) {
            return ((ij) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۥۣۨ, reason: not valid java name and contains not printable characters */
    public static boolean m4361(Object obj, Object obj2) {
        if (C0195.m7914() >= 0) {
            return com.example.vcam.Menu.m5669((File) obj, (String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m4308(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
