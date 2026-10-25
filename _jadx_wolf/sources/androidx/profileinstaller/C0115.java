package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Trace;
import android.support.v4.app.C0004;
import android.support.v4.graphics.drawable.C0009;
import android.support.v4.graphics.drawable.C0011;
import android.text.PrecomputedText;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.DragEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.activity.C0014;
import androidx.activity.C0017;
import androidx.annotation.C0024;
import androidx.annotation.C0025;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0035;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.C0047;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0052;
import androidx.core.app.C0055;
import androidx.core.content.C0057;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0064;
import androidx.core.graphics.drawable.C0065;
import androidx.core.widget.C0068;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0084;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0095;
import androidx.fragment.app.C0096;
import androidx.lifecycle.C0106;
import androidx.lifecycle.C0107;
import androidx.lifecycle.C0108;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0129;
import com.example.vcam.C0141;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.HookMain;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.at;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.c3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.g7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gb;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.im;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ks;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mh;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z1;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.C0239;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.internal.C0227;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.internal.ws.C0224;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0231;
import retrofit2.Response;
import retrofit2.converter.scalars.C0243;

/* JADX INFO: renamed from: androidx.profileinstaller.ۣۣ۟ۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0115 {

    /* JADX INFO: renamed from: ۟ۧۧ۟۟, reason: not valid java name and contains not printable characters */
    public static int f95 = -1;

    /* JADX INFO: renamed from: ۟۟۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static WindowInsets m4200(Object obj, Object obj2, Object obj3) {
        if (C0239.m9805() <= 0) {
            return ((View.OnApplyWindowInsetsListener) obj).onApplyWindowInsets((View) obj2, (WindowInsets) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۡ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m4201(Object obj) {
        if (C0011.m458() >= 0) {
            return ((ListView) obj).getVisibility();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۤۤۥ, reason: not valid java name and contains not printable characters */
    public static void m4202(Object obj, int i) {
        if (C0227.m9046() >= 0) {
            kp.b((TextView) obj, i);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۢۦۦ, reason: not valid java name and contains not printable characters */
    public static void m4203(Object obj, int i) {
        if (C0108.m4038() > 0) {
            ((TextView) obj).setMaxLines(i);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۦۣ۠, reason: not valid java name and contains not printable characters */
    public static int m4204(int i, int i2, int i3, int i4, int i5) {
        if (C0025.m934() >= 0) {
            return n4.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, i2, i3, i4, i5);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۦۣۡ, reason: not valid java name and contains not printable characters */
    public static void m4205(Object obj, Object obj2, Object obj3, int i, int i2) {
        if (C0217.m8693() < 0) {
            ((SpanWatcher) obj).onSpanAdded((Spannable) obj2, obj3, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۧۧۤ, reason: not valid java name and contains not printable characters */
    public static double m4206(double d, double d2) {
        if (C0106.m3835() > 0) {
            return Math.hypot(d, d2);
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: ۟ۡ۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4207(Object obj, Object obj2) {
        if (C0239.m9805() < 0) {
            return ((vn) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static bn m4208() {
        if (C0118.m4454() > 0) {
            return jp.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۡۧ, reason: not valid java name and contains not printable characters */
    public static void m4209(Object obj, Object obj2) {
        if (C0058.m2184() >= 0) {
            ((j0) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۧ, reason: not valid java name and contains not printable characters */
    public static Object[] m4210(Object obj, int i, int i2, Object obj2) {
        if (C0058.m2184() > 0) {
            return ((PrecomputedText) obj).getSpans(i, i2, (Class) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۣۢ, reason: not valid java name and contains not printable characters */
    public static void m4211(Object obj, Object obj2) {
        if (C0084.m3253() < 0) {
            q7.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.a((Drawable) obj, (PorterDuff.Mode) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۦۡۨ, reason: not valid java name and contains not printable characters */
    public static Drawable m4212(Object obj) {
        if (C0117.m4419() < 0) {
            return ((at) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m4213(Object obj) {
        if (C0078.m3044() < 0) {
            return wr.d.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static void m4214(Object obj) {
        if (C0141.m5769() >= 0) {
            ((FileOutputStream) obj).flush();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m4215(Object obj, Object obj2) throws IOException {
        if (C0227.m9046() >= 0) {
            dl.n((InputStream) obj, (g7) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۢۢۦ, reason: not valid java name and contains not printable characters */
    public static ConnectionBlocker m4216(Object obj) {
        if (C0128.m5064() < 0) {
            return ((HookMain) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢۤ, reason: not valid java name and contains not printable characters */
    public static long m4217(Object obj, long j) {
        if (C0112.m4054() <= 0) {
            return ((TimeUnit) obj).toNanos(j);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۨ, reason: not valid java name and contains not printable characters */
    public static int m4218() {
        return (-1000) ^ C0108.f90;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧۦ, reason: not valid java name and contains not printable characters */
    public static String m4219(Object obj) {
        if (C0231.m9265() > 0) {
            return ((PackageInfo) obj).versionName;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۧۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4220() {
        if (C0225.m9001() >= 0) {
            return tk.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨۤ, reason: not valid java name and contains not printable characters */
    public static TransformationMethod m4221(Object obj, Object obj2) {
        if (C0224.m8861() <= 0) {
            return ((h8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).e((TransformationMethod) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۦ, reason: not valid java name and contains not printable characters */
    public static void m4222(Object obj, int i) {
        if (C0014.m545() >= 0) {
            ((View) obj).setScrollIndicators(i);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۦۣ۟, reason: not valid java name and contains not printable characters */
    public static boolean m4223(Object obj, Object obj2) {
        if (C0243.m9964() >= 0) {
            return ((pr.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((int[]) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۦ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m4224(Object obj, Object obj2) {
        if (C0094.m3450() > 0) {
            ((EditText) obj).setText((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static int m4225(Object obj) {
        if (C0107.m3883() >= 0) {
            return ((Response) obj).code();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۤ, reason: not valid java name and contains not printable characters */
    public static Object m4226(Object obj, Object obj2, Object obj3) {
        if (C0178.m7344() <= 0) {
            return ((Map) obj).put(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m4227(Object obj) {
        if (C0095.m3478() <= 0) {
            return ((rl.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۧۥۤ, reason: not valid java name and contains not printable characters */
    public static boolean m4228(Object obj, int i, int i2) {
        if (C0047.m1663() <= 0) {
            return ((Menu) obj).performIdentifierAction(i, i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static p7 m4229(Object obj) {
        if (C0024.m896() >= 0) {
            return ((k3) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۡۤ, reason: not valid java name and contains not printable characters */
    public static qm m4230(Object obj, Object obj2) {
        if (C0240.m9826() > 0) {
            return ((n3) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((o3) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۣۧ, reason: not valid java name and contains not printable characters */
    public static void m4231(Object obj) {
        if (C0017.m627() >= 0) {
            Trace.beginSection((String) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۥۨۧ, reason: not valid java name and contains not printable characters */
    public static Map m4232(Object obj) {
        if (C0162.m6837() <= 0) {
            return ((n1) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۤ۠, reason: not valid java name and contains not printable characters */
    public static void m4233(Object obj, int i) {
        if (C0120.m4608() > 0) {
            ((im.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۧۢۢ, reason: not valid java name and contains not printable characters */
    public static ks m4234(Object obj, long j) {
        if (C0057.m2142() >= 0) {
            return ((ks) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۧ۟, reason: not valid java name and contains not printable characters */
    public static xp m4235(Object obj) {
        if (C0112.m4054() < 0) {
            return ((d1) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۧۡ, reason: not valid java name and contains not printable characters */
    public static sn m4236(Object obj, boolean z) {
        if (C0181.m7445() >= 0) {
            return sj.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((File) obj, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static int m4237(Object obj, int i) {
        if (C0118.m4454() >= 0) {
            return ((Resources) obj).getDimensionPixelOffset(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4238(Object obj) {
        if (C0064.m2388() > 0) {
            return ((com.example.vcam.Menu.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4239(Object obj) {
        if (C0239.m9805() <= 0) {
            return ((l2) obj).e();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۧۡۤ, reason: not valid java name and contains not printable characters */
    public static boolean m4240(Object obj) {
        if (C0009.m276() < 0) {
            return ((mo.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡۨ, reason: not valid java name and contains not printable characters */
    public static int m4242(Object obj, Object obj2) {
        if (C0052.m1890() > 0) {
            return ((MediaFormat) obj).getInteger((String) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static String m4243(String str) {
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

    /* JADX INFO: renamed from: ۣۣ۠۠, reason: not valid java name and contains not printable characters */
    public static String m4244() {
        if (C0065.m2448() > 0) {
            return pc.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static void m4245(Object obj) {
        if (C0068.m2650() >= 0) {
            ((MediaCodec) obj).stop();
        }
    }

    /* JADX INFO: renamed from: ۠ۤۧۧ, reason: not valid java name and contains not printable characters */
    public static int m4246(Object obj) {
        if (C0078.m3044() <= 0) {
            return ((pr.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).getRootAlpha();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۤۨۦ, reason: not valid java name and contains not printable characters */
    public static ViewParent m4247(Object obj) {
        if (C0096.m3601() < 0) {
            return ((FrameLayout) obj).getParent();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4248(Object obj) {
        if (C0171.m7136() < 0) {
            return ((pr.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m4249(Object obj) {
        if (C0024.m896() >= 0) {
            return ((com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4250(Object obj) {
        if (C0194.m7889() > 0) {
            return ((q) obj).b();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۡۡ, reason: not valid java name and contains not printable characters */
    public static AppCompatSeekBar m4251(Object obj, Object obj2, Object obj3) {
        if (C0017.m627() >= 0) {
            return ((m1) obj).e((Context) obj2, (AttributeSet) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۢۢ, reason: not valid java name and contains not printable characters */
    public static int[] m4252(Object obj) {
        if (C0148.m6464() < 0) {
            return ((gb.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۨۦ, reason: not valid java name and contains not printable characters */
    public static int[] m4253() {
        if (C0171.m7136() < 0) {
            return z1.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۡۤ, reason: not valid java name and contains not printable characters */
    public static void m4254(Object obj, int i, boolean z) {
        if (C0224.m8861() <= 0) {
            ((Menu) obj).setGroupVisible(i, z);
        }
    }

    /* JADX INFO: renamed from: ۣۢۧ۠, reason: not valid java name and contains not printable characters */
    public static void m4255(Object obj, int i, Object obj2) {
        if (C0129.m5108() > 0) {
            ((SparseArray) obj).put(i, obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟, reason: not valid java name and contains not printable characters */
    public static int m4256(Object obj) {
        if (C0064.m2388() > 0) {
            return ((DisplayMetrics) obj).widthPixels;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۤۨ, reason: not valid java name and contains not printable characters */
    public static void m4257(Object obj, float f, float f2) {
        if (C0224.m8861() < 0) {
            ((RectF) obj).offset(f, f2);
        }
    }

    /* JADX INFO: renamed from: ۣۥۡۡ, reason: not valid java name and contains not printable characters */
    public static int m4258(Object obj) {
        if (C0035.m1268() < 0) {
            return ((mh) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۥۨ۠, reason: not valid java name and contains not printable characters */
    public static OutputStream m4259(Object obj) {
        if (C0055.m2054() >= 0) {
            return ((fk) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۥۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m4260(Object obj) {
        if (C0031.m1148() < 0) {
            return fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۨۢ, reason: not valid java name and contains not printable characters */
    public static Drawable m4261(Object obj) {
        if (C0047.m1663() <= 0) {
            return ((Drawable) obj).mutate();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۤ۟, reason: not valid java name and contains not printable characters */
    public static Method m4262(Object obj, Object obj2) {
        if (C0213.m8458() > 0) {
            return ((wq) obj).l((Class) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static Object m4263() {
        if (C0009.m276() <= 0) {
            return wn.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m4264() {
        if (C0202.m8245() > 0) {
            return uq.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤۦ۟, reason: not valid java name and contains not printable characters */
    public static float m4265(Object obj) {
        if (C0049.m1767() <= 0) {
            return ((DragEvent) obj).getY();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۤۦۥۢ, reason: not valid java name and contains not printable characters */
    public static int m4266(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤۨۤۢ, reason: not valid java name and contains not printable characters */
    public static int m4267(Object obj) {
        if (C0219.m8794() >= 0) {
            return ((c3.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۣ۠ۤ, reason: contains not printable characters */
    public static void m4268(Object obj) {
        if (C0171.m7136() < 0) {
            ((m) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۦ۟ۢۦ, reason: contains not printable characters */
    public static int m4269(Object obj) {
        if (C0084.m3253() < 0) {
            return ((o5) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۡۤۦ, reason: contains not printable characters */
    public static Bundle m4270(Object obj) {
        if (C0231.m9265() > 0) {
            return ((x9) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۡۤ, reason: contains not printable characters */
    public static int m4271() {
        if (C0106.m3835() >= 0) {
            return rn.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۦ۠ۢ, reason: contains not printable characters */
    public static boolean m4272(Object obj) {
        if (C0113.m4144() <= 0) {
            return ((mk.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m4273(Object obj, int i) {
        if (C0118.m4454() >= 0) {
            ((View) obj).offsetLeftAndRight(i);
        }
    }

    /* JADX INFO: renamed from: ۧۢۡۨ, reason: not valid java name and contains not printable characters */
    public static WindowInsets m4274(Object obj, Object obj2) {
        if (C0118.m4454() > 0) {
            return wr.c.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj, (WindowInsets) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۧۢ, reason: not valid java name and contains not printable characters */
    public static Class m4275(Object obj) {
        if (C0025.m934() > 0) {
            return ((kp.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۥۢ, reason: not valid java name and contains not printable characters */
    public static boolean m4276() {
        if (C0240.m9826() >= 0) {
            return androidx.emoji2.text.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static byte m4277(Object obj) {
        if (C0215.m8604() <= 0) {
            return ((Number) obj).byteValue();
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: ۨۢۦۡ, reason: not valid java name and contains not printable characters */
    public static HookMain.n m4278(Object obj) {
        if (C0243.m9964() >= 0) {
            return ((gc) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۤ۟, reason: not valid java name and contains not printable characters */
    public static vo m4279(Object obj, Object obj2) {
        if (C0004.m139() <= 0) {
            return ((vo) obj).setContentDescription((CharSequence) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۣۡ, reason: not valid java name and contains not printable characters */
    public static Object m4280(Object obj) {
        if (C0202.m8245() >= 0) {
            return l4.n((List) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۥۡ, reason: not valid java name and contains not printable characters */
    public static r.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m4281(Object obj) {
        if (C0200.m8104() < 0) {
            return ((r) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۡۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4282(Object obj, int i) {
        if (C0149.m6476() < 0) {
            return Log.isLoggable((String) obj, i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static String m4241(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
