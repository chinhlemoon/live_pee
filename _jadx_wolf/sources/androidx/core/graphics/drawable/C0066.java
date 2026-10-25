package androidx.core.graphics.drawable;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.LocaleList;
import android.support.v4.graphics.drawable.C0009;
import android.support.v4.graphics.drawable.C0010;
import android.text.Editable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.ImageView;
import androidx.activity.C0014;
import androidx.activity.C0017;
import androidx.activity.C0020;
import androidx.annotation.C0024;
import androidx.annotation.C0025;
import androidx.annotation.C0026;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0036;
import androidx.appcompat.app.C0037;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.widget.C0047;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0051;
import androidx.core.app.C0052;
import androidx.core.app.C0053;
import androidx.core.widget.C0068;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0070;
import androidx.drawerlayout.widget.C0072;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0084;
import androidx.emoji2.text.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0096;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0107;
import androidx.profileinstaller.C0118;
import androidx.profileinstaller.C0119;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0122;
import androidx.savedstate.C0123;
import androidx.savedstate.C0126;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0129;
import androidx.versionedparcelable.C0135;
import com.example.vcam.C0141;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.HookMain;
import com.example.vcam.MainActivity;
import com.example.vcam.Menu;
import com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.Cif;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ak;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.b;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ep;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.im;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ip;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.is;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.js;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ks;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ls;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.nk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ns;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.oj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.oq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.or;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ym;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z6;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.C0238;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.internal.C0227;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0195;
import okhttp3.internal.io.C0199;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.logging.C0231;
import okhttp3.logging.C0233;
import okhttp3.logging.C0234;
import okhttp3.logging.C0235;
import okhttp3.logging.C0236;
import retrofit2.C0259;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: androidx.core.graphics.drawable.ۢ۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0066 {

    /* JADX INFO: renamed from: ۟۠ۡۦۦ, reason: not valid java name and contains not printable characters */
    public static int f60 = -433;

    /* JADX INFO: renamed from: ۟۟۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static long m2494(int i, int i2) {
        if (C0122.m4736() <= 0) {
            return j0.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.v(i, i2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۟۠ۨ۟, reason: not valid java name and contains not printable characters */
    public static void m2495(Object obj) {
        if (C0049.m1767() <= 0) {
            ((Exception) obj).printStackTrace();
        }
    }

    /* JADX INFO: renamed from: ۟۟ۡۡۥ, reason: not valid java name and contains not printable characters */
    public static ImageView m2496(Object obj) {
        if (C0070.m2829() <= 0) {
            return ((qo.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۦۥ, reason: not valid java name and contains not printable characters */
    public static void m2497(Object obj) {
        if (C0120.m4608() > 0) {
            v.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Activity) obj);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static r6 m2498(Object obj) {
        if (C0093.m3365() >= 0) {
            return ((v0) obj).m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤۥ۠, reason: not valid java name and contains not printable characters */
    public static int m2499(Object obj) {
        if (C0026.m1047() >= 0) {
            return ((rn) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۤۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m2500(Object obj, Object obj2) {
        if (C0118.m4454() >= 0) {
            return Objects.equals(obj, obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m2501(Object obj) {
        if (C0128.m5064() <= 0) {
            return ((Intent) obj).getAction();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۥۨ, reason: not valid java name and contains not printable characters */
    public static z6 m2502() {
        if (C0010.m354() < 0) {
            return z6.c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static void m2503(Object obj, int i) {
        if (C0009.m276() < 0) {
            ((View) obj).setTextDirection(i);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨۧ, reason: not valid java name and contains not printable characters */
    public static void m2504(Object obj) {
        if (C0227.m9046() >= 0) {
            ((Menu) obj).destroy();
        }
    }

    /* JADX INFO: renamed from: ۟ۡۥ۠ۢ, reason: not valid java name and contains not printable characters */
    public static Object m2505(Object obj, long j, Object obj2) {
        if (C0062.m2326() >= 0) {
            return ((Future) obj).get(j, (TimeUnit) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۣۡ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m2506(Object obj) {
        if (C0010.m354() <= 0) {
            return ((p) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧۨۤ, reason: not valid java name and contains not printable characters */
    public static boolean m2507(Object obj, Object obj2) {
        if (C0020.m701() >= 0) {
            return ((Window.Callback) obj).dispatchKeyShortcutEvent((KeyEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۨۤ, reason: not valid java name and contains not printable characters */
    public static int m2508(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static ks m2509(Object obj, Object obj2) {
        if (C0078.m3044() < 0) {
            return ((ks) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ls) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static ym.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m2510() {
        if (C0084.m3253() <= 0) {
            return ym.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۥۥ, reason: not valid java name and contains not printable characters */
    public static ep m2511(Object obj) {
        if (C0017.m627() > 0) {
            return ((dp) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۦ, reason: not valid java name and contains not printable characters */
    public static s2 m2512(Object obj) {
        if (C0249.m10052() < 0) {
            return ((v2) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m2513(Object obj) {
        if (C0238.m9653() >= 0) {
            return ((x9) obj).f;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧۥ, reason: not valid java name and contains not printable characters */
    public static int m2514() {
        return 128 ^ C0126.f105;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۤ, reason: not valid java name and contains not printable characters */
    public static b m2515(Object obj) {
        if (C0040.m1622() < 0) {
            return ((b.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۥۡ, reason: not valid java name and contains not printable characters */
    public static void m2516(Object obj, float f, float f2, float f3, float f4, float f5, float f6) {
        if (C0051.m1783() <= 0) {
            ((Path) obj).cubicTo(f, f2, f3, f4, f5, f6);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m2517(Object obj) {
        if (C0233.m9365() <= 0) {
            return ((mf) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static void m2518(Object obj, int i, float f) {
        if (C0141.m5769() >= 0) {
            ((k1) obj).t(i, f);
        }
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String[] m2519(Object obj) {
        if (C0093.m3365() > 0) {
            return ((EditorInfo) obj).contentMimeTypes;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢ۟, reason: not valid java name and contains not printable characters */
    public static void m2520(Object obj) {
        if (C0010.m354() <= 0) {
            HookMain.u.m5503((HookMain.u) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۥۦۨ, reason: not valid java name and contains not printable characters */
    public static boolean m2521(Object obj, Object obj2, boolean z) {
        if (C0053.m1959() > 0) {
            return mo.t((CharSequence) obj, (CharSequence) obj2, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m2522(Object obj) {
        if (C0128.m5064() < 0) {
            return ((xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m2523(Object obj) {
        if (C0135.m5274() <= 0) {
            return wr.w((View) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥ۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static float m2524(Object obj) {
        if (C0047.m1663() <= 0) {
            return ((Rect) obj).exactCenterX();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۥۢۦ, reason: not valid java name and contains not printable characters */
    public static MenuItem m2525(Object obj, Object obj2) {
        if (C0214.m8575() < 0) {
            return ((vo) obj).setIconTintList((ColorStateList) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۢۧ, reason: not valid java name and contains not printable characters */
    public static un m2526(Object obj) {
        if (C0036.m1332() <= 0) {
            return sj.a((InputStream) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۨ, reason: not valid java name and contains not printable characters */
    public static CancellationException m2527(Object obj, Object obj2, Object obj3, int i, Object obj4) {
        if (C0123.m4841() <= 0) {
            return xd.U((xd) obj, (Throwable) obj2, (String) obj3, i, obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۤۨ, reason: not valid java name and contains not printable characters */
    public static Drawable m2529(Object obj) {
        if (C0148.m6464() <= 0) {
            return ((p) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۨۡ, reason: not valid java name and contains not printable characters */
    public static a8.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m2530(Object obj) {
        if (C0195.m7914() >= 0) {
            return ((a8) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static Rect m2531(Object obj) {
        if (C0051.m1783() <= 0) {
            return ((r7) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۤ۟, reason: not valid java name and contains not printable characters */
    public static boolean m2532(Object obj) {
        if (C0053.m1959() > 0) {
            return ((qq) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۣۢۤ, reason: not valid java name and contains not printable characters */
    public static XmlResourceParser m2533(Object obj, int i) {
        if (C0178.m7344() < 0) {
            return ((Resources) obj).getLayout(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۧۧ, reason: not valid java name and contains not printable characters */
    public static uk.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m2534(Object obj) {
        if (C0094.m3450() >= 0) {
            return ((uk.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.C0145x35d57e31) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static Context m2535(Object obj) {
        if (C0126.m4908() < 0) {
            return ((Cif) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m2536(Object obj, int i, Object obj2, boolean z) {
        if (C0129.m5108() > 0) {
            ((Resources) obj).getValue(i, (TypedValue) obj2, z);
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m2537(Object obj, int i, int i2) {
        if (C0119.m4573() >= 0) {
            ((LayerDrawable) obj).setLayerGravity(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static void m2538(Object obj) {
        if (C0025.m934() > 0) {
            HookMain.m5407((HookMain) obj);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۥۣ, reason: not valid java name and contains not printable characters */
    public static List m2539(Object obj) {
        if (C0148.m6464() <= 0) {
            return ((ConnectionBlocker) obj).h();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۦ۠, reason: not valid java name and contains not printable characters */
    public static Button m2540(Object obj) {
        if (C0234.m9461() <= 0) {
            return ((MainActivity) obj).x;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟۠, reason: not valid java name and contains not printable characters */
    public static void m2541(Object obj, int i) {
        if (C0188.m7736() <= 0) {
            ((Button) obj).setTextColor(i);
        }
    }

    /* JADX INFO: renamed from: ۠۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static long m2542(Object obj) {
        if (C0259.m10136() > 0) {
            return ((nk) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠ۥۨۦ, reason: not valid java name and contains not printable characters */
    public static int m2543(Object obj) {
        if (C0084.m3253() <= 0) {
            return r8.b((InputStream) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۨۡۤ, reason: not valid java name and contains not printable characters */
    public static Context m2544(Object obj) {
        if (C0053.m1959() > 0) {
            return ((oj) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m2545(Object obj) {
        if (C0052.m1890() > 0) {
            return ((s5) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۥۦۡ, reason: not valid java name and contains not printable characters */
    public static void m2546(Object obj) {
        if (C0078.m3044() <= 0) {
            ((NoSuchMethodException) obj).printStackTrace();
        }
    }

    /* JADX INFO: renamed from: ۡۦۢۨ, reason: not valid java name and contains not printable characters */
    public static String m2547(String str) {
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

    /* JADX INFO: renamed from: ۣۢ۟۠, reason: not valid java name and contains not printable characters */
    public static DataSetObserver m2548(Object obj) {
        if (C0037.m1437() <= 0) {
            return ((k6) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static boolean m2549(Object obj, int i, Object obj2) {
        if (C0214.m8575() <= 0) {
            return xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Editable) obj, i, (KeyEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢ۠ۥۢ, reason: not valid java name and contains not printable characters */
    public static void m2550(Object obj, Object obj2) {
        if (C0020.m701() >= 0) {
            ((i) obj).b((Rect) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۨۡۤ, reason: not valid java name and contains not printable characters */
    public static void m2551(Object obj, float f) {
        if (C0031.m1148() <= 0) {
            ((pr.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).setAlpha(f);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۥۢ, reason: not valid java name and contains not printable characters */
    public static Context m2552(Object obj) {
        if (C0215.m8604() <= 0) {
            return ((ip) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۦۥ, reason: not valid java name and contains not printable characters */
    public static char[] m2553(Object obj) {
        if (C0036.m1332() < 0) {
            return ((String) obj).toCharArray();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۤۥ, reason: not valid java name and contains not printable characters */
    public static o5 m2554(Object obj, Object obj2) {
        if (C0052.m1890() > 0) {
            return ((ak) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((o5) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۥ, reason: not valid java name and contains not printable characters */
    public static boolean m2555(Object obj) {
        if (C0119.m4573() > 0) {
            return ((Cursor) obj).moveToNext();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۤۥ, reason: not valid java name and contains not printable characters */
    public static int m2556(Object obj, int i) {
        if (C0182.m7528() <= 0) {
            return ((v0) obj).G0(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۥۢ, reason: not valid java name and contains not printable characters */
    public static jk m2557(Object obj, Object obj2) {
        if (C0231.m9265() >= 0) {
            return oq.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj, obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۧ, reason: not valid java name and contains not printable characters */
    public static rn m2558(Object obj) {
        if (C0024.m896() > 0) {
            return ((hm) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m2559(Object obj, int i) {
        if (C0171.m7136() < 0) {
            return ((Resources) obj).getColorStateList(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡ۠۠, reason: not valid java name and contains not printable characters */
    public static y5 m2560(Object obj) {
        if (C0068.m2650() >= 0) {
            return ((u5) obj).getContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۡۥ, reason: not valid java name and contains not printable characters */
    public static int[] m2561(Object obj) {
        if (C0240.m9826() > 0) {
            return ((or) obj).getState();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۨۤ, reason: not valid java name and contains not printable characters */
    public static Set m2562(Object obj) {
        if (C0107.m3883() > 0) {
            return ((lg) obj).d();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۧۢ, reason: not valid java name and contains not printable characters */
    public static MenuItem m2563(Object obj) {
        if (C0182.m7528() < 0) {
            return ((SubMenu) obj).getItem();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۨ۟, reason: not valid java name and contains not printable characters */
    public static LocaleList m2564(Object obj) {
        if (C0178.m7344() <= 0) {
            return ((TextPaint) obj).getTextLocales();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۧۦ, reason: not valid java name and contains not printable characters */
    public static AtomicInteger m2565(Object obj) {
        if (C0233.m9365() <= 0) {
            return ((vn.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۨۦ, reason: not valid java name and contains not printable characters */
    public static char m2566(Object obj) {
        if (C0025.m934() > 0) {
            return ((mk.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: ۤۨۡۡ, reason: not valid java name and contains not printable characters */
    public static void m2567(Object obj) {
        if (C0065.m2448() > 0) {
            im.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Resources.Theme) obj);
        }
    }

    /* JADX INFO: renamed from: ۤۨۨ۠, reason: not valid java name and contains not printable characters */
    public static int m2568(Object obj) {
        if (C0093.m3365() >= 0) {
            return ((pr.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۠ۤۡ, reason: contains not printable characters */
    public static xd m2569(Object obj) {
        if (C0051.m1783() <= 0) {
            return ((wd) obj).k();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۨۡ, reason: contains not printable characters */
    public static void m2570(Object obj) {
        if (C0182.m7528() <= 0) {
            ((js) obj).d();
        }
    }

    /* JADX INFO: renamed from: ۥۧ, reason: contains not printable characters */
    public static ns m2571(Object obj) {
        if (C0236.m9615() > 0) {
            return ((is) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۨۨ, reason: contains not printable characters */
    public static ViewGroup m2572(Object obj) {
        if (C0069.m2756() <= 0) {
            return ((Fragment) obj).A;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۥ۟, reason: contains not printable characters */
    public static boolean m2573(Object obj, int i, boolean z) {
        if (C0238.m9653() >= 0) {
            return ((AttributeSet) obj).getAttributeBooleanValue(i, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۥۧ۠, reason: contains not printable characters */
    public static XC_LoadPackage.LoadPackageParam m2574(Object obj) {
        if (C0014.m545() >= 0) {
            return ((kc) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧ۠۟, reason: not valid java name and contains not printable characters */
    public static Locale m2575(Object obj) {
        if (C0199.m7998() < 0) {
            return mf.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧ۠۠, reason: not valid java name and contains not printable characters */
    public static void m2576(Object obj, int i) {
        if (C0096.m3601() < 0) {
            ((sp) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
    }

    /* JADX INFO: renamed from: ۨ۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static void m2577(Object obj, long j) {
        if (C0235.m9535() <= 0) {
            ((s2) obj).j(j);
        }
    }

    /* JADX INFO: renamed from: ۨۡۦۡ, reason: not valid java name and contains not printable characters */
    public static void m2578(Object obj) {
        if (C0068.m2650() >= 0) {
            C0195.m7916((f5) obj);
        }
    }

    /* JADX INFO: renamed from: ۨۥۣۤ, reason: not valid java name and contains not printable characters */
    public static Object m2579(Object obj) {
        if (C0072.m2856() < 0) {
            return ((tf) obj)._prev;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۤۥ, reason: not valid java name and contains not printable characters */
    public static void m2580(Object obj, Object obj2) {
        if (C0068.m2650() >= 0) {
            ((Cursor) obj).unregisterDataSetObserver((DataSetObserver) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۨ۠ۦ, reason: not valid java name and contains not printable characters */
    public static Object[] m2581(Object obj, Object obj2) {
        if (C0194.m7889() >= 0) {
            return ((List) obj).toArray((Object[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m2528(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
