package okhttp3.internal.authenticator;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Insets;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.LocaleList;
import android.support.v4.app.C0004;
import android.support.v4.graphics.drawable.C0010;
import android.support.v4.graphics.drawable.C0011;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.activity.C0014;
import androidx.activity.C0017;
import androidx.annotation.C0023;
import androidx.annotation.C0026;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0034;
import androidx.appcompat.app.C0035;
import androidx.appcompat.app.C0036;
import androidx.appcompat.app.C0037;
import androidx.appcompat.view.menu.C0039;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0052;
import androidx.core.content.C0057;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0065;
import androidx.core.graphics.drawable.C0066;
import androidx.core.widget.C0068;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0070;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0083;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0096;
import androidx.fragment.app.C0097;
import androidx.fragment.app.C0099;
import androidx.fragment.app.a;
import androidx.lifecycle.C0106;
import androidx.lifecycle.C0107;
import androidx.lifecycle.C0108;
import androidx.lifecycle.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0118;
import androidx.profileinstaller.C0119;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0133;
import androidx.versionedparcelable.C0135;
import com.example.vcam.ConnectionBlocker;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.aa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.c2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ii;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.w8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ye;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zs;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Logger;
import java.util.zip.Inflater;
import okhttp3.C0238;
import okhttp3.HttpUrl;
import okhttp3.internal.C0227;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.logging.C0231;
import okhttp3.logging.C0232;
import okhttp3.logging.C0234;
import okhttp3.logging.C0235;
import org.xmlpull.v1.XmlPullParser;
import retrofit2.converter.scalars.C0243;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: okhttp3.internal.authenticator.ۤۧۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0161 {

    /* JADX INFO: renamed from: ۢۤۦ۟, reason: not valid java name and contains not printable characters */
    public static int f611 = 748;

    /* JADX INFO: renamed from: ۣ۟۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static Logger m6726(Object obj) {
        if (C0188.m7736() < 0) {
            return Logger.getLogger((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static boolean m6727(Object obj) {
        if (C0017.m627() > 0) {
            return ((ConnectionBlocker.BlockRule) obj).enabled;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۨۦۤ, reason: not valid java name and contains not printable characters */
    public static int m6728(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۠۟ۦۡ, reason: not valid java name and contains not printable characters */
    public static Drawable m6729(Object obj) {
        if (C0135.m5274() < 0) {
            return ((i1) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static int m6730(Object obj) {
        if (C0057.m2142() > 0) {
            return ((r7) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static void m6731(long j) {
        if (C0036.m1332() < 0) {
            Thread.sleep(j);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static boolean m6732(Object obj) {
        if (C0035.m1268() <= 0) {
            return ((View) obj).isInLayout();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۨۢ۟, reason: not valid java name and contains not printable characters */
    public static boolean m6733(Object obj) {
        if (C0235.m9535() <= 0) {
            return rj.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((AssertionError) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡ۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m6734(Object obj, Object obj2) {
        if (C0093.m3365() >= 0) {
            ((ViewGroup) obj).setLayoutParams((ViewGroup.LayoutParams) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۤۡۦ, reason: not valid java name and contains not printable characters */
    public static void m6735(Object obj, char c, int i) {
        if (C0070.m2829() <= 0) {
            ii.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((MenuItem) obj, c, i);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۤۥۧ, reason: not valid java name and contains not printable characters */
    public static boolean m6736(Object obj) {
        if (C0200.m8104() < 0) {
            return ((Activity) obj).isChangingConfigurations();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۥۦۥ, reason: not valid java name and contains not printable characters */
    public static f2 m6737() {
        if (C0117.m4419() <= 0) {
            return f2.m5960();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m6738(Object obj) {
        if (C0037.m1437() < 0) {
            return ((yf) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m6739(Object obj, Object obj2, int i, int i2) {
        if (C0178.m7344() <= 0) {
            c2.b((Object[]) obj, obj2, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۦ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m6740(Object obj, Object obj2) {
        if (C0119.m4573() >= 0) {
            ((FrameLayout) obj).setBackgroundDrawable((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۨۡۢ, reason: not valid java name and contains not printable characters */
    public static boolean m6741(Object obj) {
        if (C0097.m3659() > 0) {
            return ((Menu) obj).hasVisibleItems();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static ViewParent m6742(Object obj, int i) {
        if (C0062.m2326() > 0) {
            return ((fj) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static long m6743(Object obj, Object obj2) {
        if (C0058.m2184() >= 0) {
            return ((zs) obj).c((zs) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥۨ, reason: not valid java name and contains not printable characters */
    public static int m6744() {
        return (-734) ^ C0194.f644;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢۥ, reason: not valid java name and contains not printable characters */
    public static String m6745(Object obj) {
        if (C0234.m9461() <= 0) {
            return ((a3) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static void m6746(Object obj, int i, int i2) {
        if (C0108.m4038() >= 0) {
            ((LayerDrawable) obj).setLayerHeight(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۨۢۡ, reason: not valid java name and contains not printable characters */
    public static void m6747(Object obj, Object obj2, Object obj3, int i) {
        if (C0128.m5064() < 0) {
            vs.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Window.Callback) obj, (List) obj2, (Menu) obj3, i);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟۟, reason: not valid java name and contains not printable characters */
    public static InetAddress m6748(Object obj) {
        if (C0031.m1148() <= 0) {
            return ((InetSocketAddress) obj).getAddress();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static Paint.Cap m6749(Object obj) {
        if (C0232.m9299() > 0) {
            return ((pr.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static boolean m6750(Object obj) {
        if (C0058.m2184() > 0) {
            return ((wq) obj).i();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۡۥ۠, reason: not valid java name and contains not printable characters */
    public static int[] m6751(Object obj) {
        if (C0238.m9653() >= 0) {
            return ((TextView) obj).getDrawableState();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۨۢ, reason: not valid java name and contains not printable characters */
    public static int m6752(Object obj) {
        if (C0162.m6837() < 0) {
            return ((View) obj).getScrollIndicators();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static ViewPropertyAnimator m6753(Object obj, long j) {
        if (C0066.m2514() >= 0) {
            return ((ViewPropertyAnimator) obj).setDuration(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤۤ, reason: not valid java name and contains not printable characters */
    public static Drawable m6754(Object obj) {
        if (C0062.m2326() >= 0) {
            return ((ImageView) obj).getBackground();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۥۣ, reason: not valid java name and contains not printable characters */
    public static ArrayList m6755(Object obj) {
        if (C0107.m3883() > 0) {
            return ((aa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۦۥ, reason: not valid java name and contains not printable characters */
    public static ContextMenu.ContextMenuInfo m6756(Object obj) {
        if (C0097.m3659() >= 0) {
            return ((MenuItem) obj).getMenuInfo();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۧۨ, reason: not valid java name and contains not printable characters */
    public static Rect m6757(Object obj) {
        if (C0164.m6900() < 0) {
            return ((z9.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static xo m6758() {
        if (C0094.m3450() >= 0) {
            return w8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۦۨ, reason: not valid java name and contains not printable characters */
    public static boolean m6759(Object obj, int i, Object obj2) {
        if (C0074.m2951() < 0) {
            return ((m) obj).a(i, (KeyEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۨۢۥ, reason: not valid java name and contains not printable characters */
    public static int[] m6760(Object obj) {
        if (C0099.m3752() < 0) {
            return ((dk) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۧ, reason: not valid java name and contains not printable characters */
    public static void m6761(Object obj, boolean z) {
        if (C0108.m4038() >= 0) {
            ((k1) obj).k(z);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m6762(Object obj, Object obj2, Object obj3) {
        if (C0083.m3188() <= 0) {
            ((l7) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Throwable) obj2, (Throwable) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static TypedArray m6763(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0133.m5208() < 0) {
            return m4.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Resources) obj, (Resources.Theme) obj2, (AttributeSet) obj3, (int[]) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۥ۠, reason: not valid java name and contains not printable characters */
    public static View m6764(Object obj, int i) {
        if (C0106.m3835() > 0) {
            return ((LinearLayout) obj).getChildAt(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۥۤ, reason: not valid java name and contains not printable characters */
    public static boolean m6765(Object obj) {
        if (C0057.m2142() > 0) {
            return ((s8) obj).a0();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static int m6766(Object obj) {
        if (C0162.m6837() < 0) {
            return ((SeekBar) obj).getHeight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۢۦ, reason: not valid java name and contains not printable characters */
    public static String m6767(String str) {
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

    /* JADX INFO: renamed from: ۡۧۧۧ, reason: not valid java name and contains not printable characters */
    public static boolean m6768(Object obj) {
        if (C0037.m1437() <= 0) {
            return ((ActionProvider) obj).isVisible();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static CharSequence m6769(Object obj, int i, int i2) {
        if (C0118.m4454() > 0) {
            return ((CharSequence) obj).subSequence(i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۥ, reason: not valid java name and contains not printable characters */
    public static Object m6770(Object obj, Object obj2) {
        if (C0049.m1767() < 0) {
            return ((Map) obj).get(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۦۥ, reason: not valid java name and contains not printable characters */
    public static int m6771(Object obj) {
        if (C0078.m3044() <= 0) {
            return Objects.hash((Object[]) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۤۢۥ, reason: not valid java name and contains not printable characters */
    public static Bitmap m6772(int i, int i2, Object obj) {
        if (C0162.m6837() < 0) {
            return Bitmap.createBitmap(i, i2, (Bitmap.Config) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۤ۟, reason: not valid java name and contains not printable characters */
    public static Paint m6773(Object obj) {
        if (C0065.m2448() > 0) {
            return ((ShapeDrawable) obj).getPaint();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۠۟, reason: not valid java name and contains not printable characters */
    public static void m6774(Object obj) {
        if (C0094.m3450() >= 0) {
            ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).j();
        }
    }

    /* JADX INFO: renamed from: ۣۣ۠, reason: not valid java name and contains not printable characters */
    public static void m6775(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0243.m9964() > 0) {
            ((lf.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).c((String) obj2, (FileDescriptor) obj3, (PrintWriter) obj4, (String[]) obj5);
        }
    }

    /* JADX INFO: renamed from: ۣۡ۟۟, reason: not valid java name and contains not printable characters */
    public static long m6776(Object obj, Object obj2, long j) {
        if (C0052.m1890() >= 0) {
            return ((s2) obj).P((a3) obj2, j);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۥۣۢ, reason: not valid java name and contains not printable characters */
    public static xf m6777(Object obj) {
        if (C0128.m5064() < 0) {
            return ((j0.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).C;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۡ, reason: not valid java name and contains not printable characters */
    public static void m6778(Object obj, Object obj2) {
        if (C0039.m1515() <= 0) {
            ((m1.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤ۠ۦۥ, reason: not valid java name and contains not printable characters */
    public static int m6779(Object obj) {
        if (C0249.m10052() < 0) {
            return ((TextView) obj).getTotalPaddingRight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۢۢۡ, reason: not valid java name and contains not printable characters */
    public static boolean m6780(Object obj) {
        if (C0096.m3601() <= 0) {
            return ((v0) obj).K;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤ۟۟, reason: not valid java name and contains not printable characters */
    public static byte[] m6781(Object obj) {
        if (C0169.m7034() <= 0) {
            return ((dn) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۡۧ, reason: not valid java name and contains not printable characters */
    public static Runnable m6782(Object obj) {
        if (C0068.m2650() > 0) {
            return ((dq) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۦۡ, reason: not valid java name and contains not printable characters */
    public static Object[] m6783(Object obj, int i) {
        if (C0162.m6837() < 0) {
            return ((lg) obj).i(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۥۢ, reason: not valid java name and contains not printable characters */
    public static File m6784(Object obj) {
        if (C0099.m3752() <= 0) {
            return ((Context) obj).getFilesDir();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۤۤ, reason: not valid java name and contains not printable characters */
    public static int[] m6785(Object obj) {
        if (C0176.m7290() > 0) {
            return ((Drawable) obj).getState();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠۟, reason: contains not printable characters */
    public static ArrayList m6786(Object obj) {
        if (C0231.m9265() >= 0) {
            return ((z9.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۨۤ, reason: contains not printable characters */
    public static Configuration m6787(Object obj) {
        if (C0069.m2756() <= 0) {
            return ((v0) obj).N;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۦۧ, reason: contains not printable characters */
    public static AtomicReferenceFieldUpdater m6788() {
        if (C0108.m4038() > 0) {
            return t8.b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠۠ۦ, reason: contains not printable characters */
    public static LocaleList m6790() {
        if (C0068.m2650() > 0) {
            return LocaleList.getAdjustedDefault();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۠ۡ, reason: contains not printable characters */
    public static AttributeSet m6791(Object obj) {
        if (C0231.m9265() >= 0) {
            return Xml.asAttributeSet((XmlPullParser) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۦۡ, reason: contains not printable characters */
    public static boolean m6792(Object obj, int i, Object obj2) {
        if (C0010.m354() <= 0) {
            return ((Window.Callback) obj).onMenuItemSelected(i, (MenuItem) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۨۡ۟, reason: contains not printable characters */
    public static AtomicIntegerFieldUpdater m6793() {
        if (C0097.m3659() >= 0) {
            return zs.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۡ۠, reason: not valid java name and contains not printable characters */
    public static TextDirectionHeuristic m6794() {
        if (C0004.m139() <= 0) {
            return TextDirectionHeuristics.FIRSTSTRONG_RTL;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۥۦ, reason: not valid java name and contains not printable characters */
    public static Object m6795(Object obj, Object obj2) {
        if (C0097.m3659() >= 0) {
            return ((HashMap) obj).get(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۤۨ, reason: not valid java name and contains not printable characters */
    public static int m6796(Object obj) {
        if (C0169.m7034() < 0) {
            return ((Insets) obj).right;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۥ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m6797(Object obj, boolean z) {
        if (C0011.m458() > 0) {
            ((a) obj).B(z);
        }
    }

    /* JADX INFO: renamed from: ۧۥۥۡ, reason: not valid java name and contains not printable characters */
    public static tm.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m6798(Object obj, Object obj2) {
        if (C0026.m1047() >= 0) {
            return ((d9) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static Object m6799() {
        if (m6744() >= 0) {
            return xf.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static dd m6800(Object obj) {
        if (C0218.m8760() >= 0) {
            return dd.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Rect) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static CharSequence m6801(Object obj, Object obj2) {
        if (C0227.m9046() > 0) {
            return ((qo) obj).c((CharSequence) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۦۥ, reason: not valid java name and contains not printable characters */
    public static s2 m6802(Object obj, Object obj2) {
        if (C0017.m627() > 0) {
            return ((s2) obj).f0((a3) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۟۟, reason: not valid java name and contains not printable characters */
    public static void m6803(Object obj, Object obj2) {
        if (C0014.m545() >= 0) {
            ((pr) obj).setTintMode((PorterDuff.Mode) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۨۥۥ, reason: not valid java name and contains not printable characters */
    public static long m6804(Object obj) {
        if (C0176.m7290() >= 0) {
            return ((Inflater) obj).getBytesWritten();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۤۡۧ, reason: not valid java name and contains not printable characters */
    public static void m6805(Object obj) throws IOException {
        if (C0023.m843() >= 0) {
            ((un) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۨۥۨ۠, reason: not valid java name and contains not printable characters */
    public static j0.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m6806(Object obj) {
        if (C0034.m1206() <= 0) {
            return ((j0) obj).d();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۢ۠, reason: not valid java name and contains not printable characters */
    public static void m6807(Object obj, Object obj2) {
        if (C0118.m4454() > 0) {
            ((xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ye) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۥۣۧ, reason: contains not printable characters */
    public static String m6789(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
