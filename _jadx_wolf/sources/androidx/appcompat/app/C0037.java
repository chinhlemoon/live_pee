package androidx.appcompat.app;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.app.SearchableInfo;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.net.Uri;
import android.os.Parcel;
import android.support.v4.graphics.drawable.C0010;
import android.text.TextDirectionHeuristic;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AbsListView;
import android.widget.EditText;
import android.widget.TextView;
import androidx.activity.C0017;
import androidx.activity.C0020;
import androidx.activity.C0021;
import androidx.annotation.C0023;
import androidx.annotation.C0024;
import androidx.annotation.C0025;
import androidx.annotation.C0031;
import androidx.appcompat.view.menu.C0039;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.SearchView;
import androidx.core.app.C0052;
import androidx.core.app.C0053;
import androidx.core.content.C0057;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0064;
import androidx.core.graphics.drawable.C0066;
import androidx.drawerlayout.widget.C0070;
import androidx.drawerlayout.widget.C0072;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0079;
import androidx.emoji2.text.C0083;
import androidx.emoji2.text.C0084;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0097;
import androidx.fragment.app.C0099;
import androidx.lifecycle.C0108;
import androidx.lifecycle.g;
import androidx.lifecycle.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0118;
import androidx.profileinstaller.C0119;
import androidx.savedstate.C0123;
import androidx.savedstate.C0126;
import androidx.versionedparcelable.C0133;
import androidx.versionedparcelable.C0135;
import com.example.vcam.HookMain;
import com.example.vcam.LicenseManager;
import com.example.vcam.MainActivity;
import com.example.vcam.Menu;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.db;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ed;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ee;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.el;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ff;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.id;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.im;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ng;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ql;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ze;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import okhttp3.C0238;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.ws.C0224;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0231;
import okhttp3.logging.C0232;
import okhttp3.logging.C0234;
import org.xmlpull.v1.XmlPullParser;
import retrofit2.converter.scalars.C0243;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: androidx.appcompat.app.ۨۢۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0037 {

    /* JADX INFO: renamed from: ۣ۠۟, reason: not valid java name and contains not printable characters */
    public static int f35 = -636;

    /* JADX INFO: renamed from: ۟۟۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static void m1380(Object obj, Object obj2) {
        if (C0116.m4340() > 0) {
            ((View) obj).setAccessibilityDelegate((View.AccessibilityDelegate) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۢۦۡ, reason: not valid java name and contains not printable characters */
    public static y4 m1381(Object obj, int i, Object obj2) {
        if (C0097.m3659() > 0) {
            return y4.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Resources) obj, i, (Resources.Theme) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۧۦ, reason: not valid java name and contains not printable characters */
    public static int m1382(Object obj) {
        if (C0024.m896() >= 0) {
            return ((TextView) obj).getCompoundPaddingTop();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۧۧۢ, reason: not valid java name and contains not printable characters */
    public static int m1383(Object obj) {
        if (C0133.m5208() <= 0) {
            return ((AtomicInteger) obj).incrementAndGet();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static String m1384(Object obj) {
        if (C0225.m9001() >= 0) {
            return ((SearchableInfo) obj).getSuggestSelection();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۦۥ, reason: not valid java name and contains not printable characters */
    public static Stream m1385(Object obj, Object obj2) {
        if (C0200.m8104() < 0) {
            return ((Stream) obj).filter((Predicate) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m1386(Object obj) {
        if (C0238.m9653() >= 0) {
            return u7.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((AbsListView) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static int m1387(Object obj) {
        if (C0072.m2856() < 0) {
            return kp.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TextDirectionHeuristic) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static int m1388(Object obj) {
        if (C0214.m8575() < 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).e();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۡ۟, reason: not valid java name and contains not printable characters */
    public static int m1389(Object obj) {
        if (C0164.m6900() < 0) {
            return ((p) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m1390(Object obj) {
        if (C0178.m7344() <= 0) {
            return ((m) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦۢ, reason: not valid java name and contains not printable characters */
    public static float m1391(Object obj) {
        if (C0135.m5274() < 0) {
            return ((RectF) obj).right;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۡۥۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m1392(Object obj) {
        if (C0116.m4340() > 0) {
            return ((ActionBarOverlayLayout) obj).o();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۨۤۧ, reason: not valid java name and contains not printable characters */
    public static EditText m1393(Object obj) {
        if (C0211.m8341() >= 0) {
            return ((i8) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠۠۟, reason: not valid java name and contains not printable characters */
    public static g.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m1394() {
        if (C0064.m2388() >= 0) {
            return v9.b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۥۢ, reason: not valid java name and contains not printable characters */
    public static LicenseManager m1395(Object obj) {
        if (C0066.m2514() >= 0) {
            return ((MainActivity) obj).C;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m1396(Object obj) {
        if (C0052.m1890() > 0) {
            return ((pr.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧ۠, reason: not valid java name and contains not printable characters */
    public static zr m1397(Object obj, Object obj2) {
        if (C0218.m8760() > 0) {
            return zr.g((ViewGroup) obj, (zr.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static wm m1398(Object obj) {
        if (C0057.m2142() > 0) {
            return ((vm) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۣۧ, reason: not valid java name and contains not printable characters */
    public static int m1399(Object obj) {
        if (C0169.m7034() < 0) {
            return ((Image.Plane) obj).getPixelStride();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤ۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m1400(Object obj) {
        if (C0074.m2951() < 0) {
            return ((pr) obj).getIntrinsicHeight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.AccessibilityAction m1401() {
        if (C0238.m9653() > 0) {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۤ۟, reason: not valid java name and contains not printable characters */
    public static void m1402(Object obj) {
        if (C0238.m9653() > 0) {
            bs.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤۨ, reason: not valid java name and contains not printable characters */
    public static Uri m1403(Object obj) {
        if (C0123.m4841() <= 0) {
            return ((Intent) obj).getData();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m1404(Object obj) {
        if (C0074.m2951() <= 0) {
            ((zr) obj).a();
        }
    }

    /* JADX INFO: renamed from: ۟ۤۧۡۡ, reason: not valid java name and contains not printable characters */
    public static void m1405(Object obj) {
        if (C0017.m627() > 0) {
            ((Window.Callback) obj).onContentChanged();
        }
    }

    /* JADX INFO: renamed from: ۟ۤۨۤ۟, reason: not valid java name and contains not printable characters */
    public static void m1406(Object obj, Object obj2) {
        if (C0108.m4038() > 0) {
            ((Drawable) obj).applyTheme((Resources.Theme) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m1407(Object obj, Object obj2, long j) throws EOFException {
        if (C0053.m1959() >= 0) {
            ((s2) obj).g((s2) obj2, j);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۡۤ۟, reason: not valid java name and contains not printable characters */
    public static void m1408(Object obj, Object obj2) {
        if (C0020.m701() >= 0) {
            ((u1) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۡۦۤ, reason: not valid java name and contains not printable characters */
    public static void m1409(Object obj) {
        if (C0181.m7445() > 0) {
            HookMain.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.m5546((HookMain.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۦۧ, reason: not valid java name and contains not printable characters */
    public static boolean m1410(Object obj) {
        if (C0232.m9299() > 0) {
            return ((File) obj).delete();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦ۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m1411(Object obj, Object obj2) {
        if (C0064.m2388() > 0) {
            ((Thread) obj).setName((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۦ۟, reason: not valid java name and contains not printable characters */
    public static CharSequence m1412(Object obj) {
        if (C0023.m843() >= 0) {
            return ((AccessibilityNodeInfo) obj).getText();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m1413(Object obj, Object obj2) {
        if (C0010.m354() < 0) {
            n.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Drawable) obj, (Outline) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۧۡ, reason: not valid java name and contains not printable characters */
    public static boolean m1414(Object obj) {
        if (C0070.m2829() < 0) {
            return s7.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Drawable) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۨۡۤ, reason: not valid java name and contains not printable characters */
    public static IntStream m1415(Object obj) {
        if (C0191.m7812() >= 0) {
            return ((CharSequence) obj).chars();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static ed m1416(Object obj) {
        if (C0149.m6476() <= 0) {
            return ((fd) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static float[][] m1417() {
        if (C0215.m8604() < 0) {
            return f3.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۡۥ, reason: not valid java name and contains not printable characters */
    public static String m1418(Object obj, Object obj2) {
        if (C0176.m7290() >= 0) {
            return ((l2) obj).a(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۨۤ, reason: not valid java name and contains not printable characters */
    public static void m1419(Object obj, Object obj2) {
        if (C0238.m9653() > 0) {
            ((SearchView) obj).K((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۥ, reason: not valid java name and contains not printable characters */
    public static int m1420(Object obj) {
        if (C0119.m4573() > 0) {
            return ((j0) obj).l;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static List m1421(Object obj) {
        if (C0171.m7136() < 0) {
            return ((Menu.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۧۧ, reason: not valid java name and contains not printable characters */
    public static Object m1422() {
        if (C0093.m3365() >= 0) {
            return im.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۧ۠, reason: not valid java name and contains not printable characters */
    public static Insets m1423(Object obj) {
        if (C0083.m3188() <= 0) {
            return s7.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Drawable) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static v2 m1424(Object obj) {
        if (C0231.m9265() > 0) {
            return ((uc) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۦۢ, reason: not valid java name and contains not printable characters */
    public static xs m1425(Object obj) {
        if (C0234.m9461() < 0) {
            return ((xs.d) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۧۥ, reason: not valid java name and contains not printable characters */
    public static void m1426(Object obj, Object obj2) {
        if (C0053.m1959() >= 0) {
            C0224.m8885((LicenseManager) obj, (String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static void m1427(Object obj, Object obj2) {
        if (C0057.m2142() > 0) {
            Menu.m5671((Menu) obj, (View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۨۤۥ, reason: not valid java name and contains not printable characters */
    public static String m1428(Object obj) {
        if (C0010.m354() < 0) {
            return ((pr.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).getPathName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۨۡ, reason: not valid java name and contains not printable characters */
    public static float m1429(Object obj) {
        if (C0024.m896() >= 0) {
            return ((pr.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۡۤۧ, reason: not valid java name and contains not printable characters */
    public static int[] m1430() {
        if (C0062.m2326() > 0) {
            return ql.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۧ۟, reason: not valid java name and contains not printable characters */
    public static id m1431(Object obj, Object obj2) {
        if (C0243.m9964() >= 0) {
            return ((id.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Parcel) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۡۧ, reason: not valid java name and contains not printable characters */
    public static int m1432(Object obj) {
        if (C0119.m4573() > 0) {
            return ((s2) obj).U();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۨۧۨ, reason: not valid java name and contains not printable characters */
    public static Object m1433(Object obj) {
        if (C0031.m1148() <= 0) {
            return e.a((ff) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m1434(Object obj) {
        if (C0217.m8693() <= 0) {
            return ((ze) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۡۥ, reason: not valid java name and contains not printable characters */
    public static Resources m1435(Object obj) {
        if (C0149.m6476() <= 0) {
            return ((TypedArray) obj).getResources();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۠, reason: not valid java name and contains not printable characters */
    public static String m1436(Object obj, Object obj2) {
        if (C0039.m1515() < 0) {
            return ((String) obj).toLowerCase((Locale) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m1437() {
        return 16 ^ C0079.f70;
    }

    /* JADX INFO: renamed from: ۢۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m1438(Object obj, long j, Object obj2) {
        if (C0225.m9001() > 0) {
            return ((s2) obj).W(j, (Charset) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۦ, reason: not valid java name and contains not printable characters */
    public static void m1439(Object obj, float f) {
        if (C0211.m8341() > 0) {
            wr.T((View) obj, f);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static a3 m1440() {
        if (C0126.m4908() < 0) {
            return a3.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static Field m1441() {
        if (C0093.m3365() > 0) {
            return s7.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۨۦ, reason: not valid java name and contains not printable characters */
    public static void m1442(Object obj, Object obj2, int i) {
        if (C0118.m4454() >= 0) {
            ((h) obj).d((View) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۣۦۢۡ, reason: not valid java name and contains not printable characters */
    public static void m1443(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0135.m5274() < 0) {
            ((Canvas) obj).drawBitmap((Bitmap) obj2, (Rect) obj3, (Rect) obj4, (Paint) obj5);
        }
    }

    /* JADX INFO: renamed from: ۤ۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static String m1444(Object obj) {
        if (C0215.m8604() < 0) {
            return ((uo.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static InputStream m1445(Object obj, Object obj2) {
        if (C0113.m4144() < 0) {
            return ((ContentResolver) obj).openInputStream((Uri) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static Keyframe m1446(float f) {
        if (C0072.m2856() <= 0) {
            return Keyframe.ofFloat(f);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۡۡ, reason: not valid java name and contains not printable characters */
    public static ee m1447(Object obj) {
        if (C0074.m2951() < 0) {
            return zl.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((db) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Object m1448(Object obj, int i, Object obj2) {
        if (C0021.m740() < 0) {
            return ((AtomicReferenceArray) obj).getAndSet(i, obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۥۦ, reason: not valid java name and contains not printable characters */
    public static boolean m1449(Object obj) {
        if (C0034.m1206() <= 0) {
            return ((l9.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۤۨ, reason: not valid java name and contains not printable characters */
    public static ObjectAnimator m1450(Object obj, Object obj2, Object obj3, Object obj4, float f, Object obj5) {
        if (C0099.m3752() < 0) {
            return m0.f((Context) obj, (Resources) obj2, (Resources.Theme) obj3, (AttributeSet) obj4, f, (XmlPullParser) obj5);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۡ, reason: not valid java name and contains not printable characters */
    public static float m1451(Object obj, Object obj2) {
        if (C0053.m1959() > 0) {
            return ((pr.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Matrix) obj2);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۥۡ۠, reason: contains not printable characters */
    public static Drawable.Callback m1452(Object obj) {
        if (C0017.m627() > 0) {
            return ((r7.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۥۢ, reason: contains not printable characters */
    public static int m1453(Object obj) {
        if (C0025.m934() > 0) {
            return ((j0) obj).m;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۢ۟, reason: contains not printable characters */
    public static int m1454(float f) {
        if (C0025.m934() >= 0) {
            return f3.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۢ۠ۥ, reason: contains not printable characters */
    public static String m1455(Object obj) {
        if (C0126.m4908() < 0) {
            return ((Locale) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۥۢ, reason: contains not printable characters */
    public static CharSequence m1456(Object obj) {
        if (C0066.m2514() > 0) {
            return ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨ۠ۧ, reason: contains not printable characters */
    public static Throwable m1457(Object obj) {
        if (C0084.m3253() <= 0) {
            return ((e.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۥۥ, reason: contains not printable characters */
    public static Drawable m1458(Object obj, Object obj2, boolean z) {
        if (C0191.m7812() >= 0) {
            return ((f1) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Drawable) obj2, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static int m1460(Object obj) {
        if (C0234.m9461() < 0) {
            return ((TextView) obj).getAutoSizeStepGranularity();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static mf m1461() {
        if (C0083.m3188() <= 0) {
            return u0.c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۢۢ, reason: not valid java name and contains not printable characters */
    public static void m1462(Object obj, int i) {
        if (C0040.m1622() <= 0) {
            ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).n(i);
        }
    }

    /* JADX INFO: renamed from: ۧۦ۟ۤ, reason: not valid java name and contains not printable characters */
    public static Map m1463(Object obj) {
        if (C0225.m9001() > 0) {
            return ng.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Map) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦ۠, reason: not valid java name and contains not printable characters */
    public static void m1464(Object obj) {
        if (C0118.m4454() >= 0) {
            ((XmlResourceParser) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۧۨ۠, reason: not valid java name and contains not printable characters */
    public static byte[] m1465() {
        if (C0240.m9826() > 0) {
            return el.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static PorterDuffColorFilter m1466(Object obj, int i, Object obj2) {
        if (C0116.m4340() >= 0) {
            return ((hm.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).a(i, (PorterDuff.Mode) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۢ, reason: not valid java name and contains not printable characters */
    public static String m1467(String str) {
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

    /* JADX INFO: renamed from: ۨۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m1468(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۣۨۤ, reason: not valid java name and contains not printable characters */
    public static String m1469(Object obj) {
        if (C0249.m10052() <= 0) {
            return ((IllegalAccessException) obj).getMessage();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۣۦ, reason: not valid java name and contains not printable characters */
    public static void m1470(Object obj) {
        if (C0040.m1622() <= 0) {
            ((jf) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۦۢۡ۟, reason: contains not printable characters */
    public static String m1459(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
