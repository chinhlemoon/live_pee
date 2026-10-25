package okhttp3.internal.http1;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.support.v4.graphics.drawable.C0009;
import android.support.v4.graphics.drawable.C0011;
import android.text.TextWatcher;
import android.util.Size;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Toast;
import androidx.activity.C0017;
import androidx.activity.C0021;
import androidx.annotation.C0024;
import androidx.annotation.C0025;
import androidx.appcompat.app.C0036;
import androidx.appcompat.app.C0037;
import androidx.appcompat.view.menu.C0039;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.widget.SearchView;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0051;
import androidx.core.content.C0057;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0064;
import androidx.drawerlayout.widget.C0072;
import androidx.emoji2.text.C0078;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0097;
import androidx.lifecycle.C0106;
import androidx.lifecycle.C0107;
import androidx.lifecycle.f;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0118;
import androidx.profileinstaller.C0119;
import androidx.savedstate.C0122;
import androidx.savedstate.C0126;
import androidx.savedstate.C0127;
import androidx.savedstate.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.HookMain;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ar;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.b6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.en;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.et;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.g7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ii;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.im;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.js;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ls;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ql;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zq;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import okhttp3.C0238;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.internal.C0227;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0195;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0231;
import okhttp3.logging.C0234;
import okhttp3.logging.C0236;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: renamed from: okhttp3.internal.http1.۟ۧۢ۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0188 {

    /* JADX INFO: renamed from: ۟ۧ۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static int f638 = -676;

    /* JADX INFO: renamed from: ۟۟۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static XC_LoadPackage.LoadPackageParam m7674(Object obj) {
        if (C0215.m8604() < 0) {
            return ((HookMain.u.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۡ۟۟, reason: not valid java name and contains not printable characters */
    public static m2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m7675(Object obj) {
        if (C0194.m7889() >= 0) {
            return ((m2) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۡۡۦ, reason: not valid java name and contains not printable characters */
    public static long m7676(Object obj) {
        if (C0127.m4950() >= 0) {
            return ((r7) obj).f;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۟ۡۦۣ, reason: not valid java name and contains not printable characters */
    public static Typeface m7677(Object obj) {
        if (C0039.m1515() <= 0) {
            return tq.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static void m7678(Object obj, Object obj2, Object obj3) {
        if (C0187.m7613() >= 0) {
            ((js) obj).a((View) obj2, (ls) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static XC_LoadPackage.LoadPackageParam m7679(Object obj) {
        if (C0036.m1332() <= 0) {
            return ((HookMain) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۠۟, reason: not valid java name and contains not printable characters */
    public static View m7680(Object obj) {
        if (C0149.m6476() < 0) {
            return ((wr.d.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۡۤ, reason: not valid java name and contains not printable characters */
    public static boolean m7681(Object obj) {
        if (C0200.m8104() <= 0) {
            return ((uo.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).k;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static b6.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m7682() {
        if (C0049.m1767() <= 0) {
            return b6.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m7683(Object obj) {
        if (C0234.m9461() <= 0) {
            return ((ApplicationInfo) obj).name;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۨ۠, reason: not valid java name and contains not printable characters */
    public static boolean m7684(Object obj, Object obj2, boolean z, int i) {
        if (C0058.m2184() >= 0) {
            return mo.v((CharSequence) obj, (CharSequence) obj2, z, i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static dn m7685() {
        if (C0236.m9615() > 0) {
            return en.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠۟, reason: not valid java name and contains not printable characters */
    public static int[] m7686() {
        if (C0009.m276() <= 0) {
            return ql.c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۦۥ, reason: not valid java name and contains not printable characters */
    public static Resources m7687(Object obj, Object obj2) {
        if (C0037.m1437() < 0) {
            return ((PackageManager) obj).getResourcesForApplication((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۨۡ, reason: not valid java name and contains not printable characters */
    public static RectF m7688() {
        if (C0017.m627() >= 0) {
            return l1.d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static hn m7689(Object obj) {
        if (C0024.m896() >= 0) {
            return ((mn.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m7690(Object obj, int i, Object obj2, boolean z) {
        if (C0119.m4573() >= 0) {
            return ((Resources.Theme) obj).resolveAttribute(i, (TypedValue) obj2, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۧۤ, reason: not valid java name and contains not printable characters */
    public static int m7691(Object obj) {
        if (C0227.m9046() >= 0) {
            return ((SearchView) obj).getSuggestionRowLayout();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۨ۟ۤ, reason: not valid java name and contains not printable characters */
    public static float m7692(Object obj) {
        if (C0122.m4736() <= 0) {
            return ((pr.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).d;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static hd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m7693() {
        if (C0169.m7034() <= 0) {
            return hd.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۡۦ, reason: not valid java name and contains not printable characters */
    public static int m7694(Object obj) {
        if (C0126.m4908() < 0) {
            return ((m2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m7695(Object obj) {
        if (C0078.m3044() <= 0) {
            ((ConnectionBlocker) obj).e();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥۡ, reason: not valid java name and contains not printable characters */
    public static mk.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa[] m7696(Object obj) {
        if (C0178.m7344() < 0) {
            return mk.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨ۟, reason: not valid java name and contains not printable characters */
    public static List m7697(Object obj) {
        if (C0009.m276() <= 0) {
            return ((ConnectionBlocker) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static wm m7698(Object obj) {
        if (C0107.m3883() >= 0) {
            return f.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((gs) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۡۧ, reason: not valid java name and contains not printable characters */
    public static WindowInsets m7699(Object obj) {
        if (C0118.m4454() >= 0) {
            return ((xs.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۤ, reason: not valid java name and contains not printable characters */
    public static xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m7700(Object obj) {
        if (m7736() < 0) {
            return ((xm) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤ۟۠, reason: not valid java name and contains not printable characters */
    public static void m7701(Object obj, Object obj2, int i, int i2, int i3) {
        if (C0093.m3365() >= 0) {
            ((TextWatcher) obj).beforeTextChanged((CharSequence) obj2, i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m7702(Object obj, Object obj2) {
        if (C0051.m1783() < 0) {
            wr.P((View) obj, (CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۨۥۨ, reason: not valid java name and contains not printable characters */
    public static Bundle m7703(Object obj) {
        if (C0149.m6476() <= 0) {
            return ((ProviderInfo) obj).metaData;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۡۡ, reason: not valid java name and contains not printable characters */
    public static View.AccessibilityDelegate m7704(Object obj) {
        if (C0231.m9265() >= 0) {
            return wr.d((View) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static String m7705(Object obj) {
        if (C0115.m4218() <= 0) {
            return ((g7) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡۧ, reason: not valid java name and contains not printable characters */
    public static void m7706(Object obj, Object obj2, Object obj3) {
        if (C0064.m2388() >= 0) {
            ((View.AccessibilityDelegate) obj).onInitializeAccessibilityNodeInfo((View) obj2, (AccessibilityNodeInfo) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۨۢ۠, reason: not valid java name and contains not printable characters */
    public static void m7707(Object obj) throws IOException {
        if (C0199.m7998() <= 0) {
            ((XmlSerializer) obj).endDocument();
        }
    }

    /* JADX INFO: renamed from: ۟ۨۨۧ, reason: not valid java name and contains not printable characters */
    public static Object m7708(Object obj) {
        if (C0011.m458() >= 0) {
            return ((i.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۢۢ, reason: not valid java name and contains not printable characters */
    public static void m7709(Object obj, int i, Object obj2) {
        if (C0117.m4419() < 0) {
            ((im.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, (Handler) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۥۦۢ, reason: not valid java name and contains not printable characters */
    public static CharSequence m7710(Object obj) {
        if (C0051.m1783() <= 0) {
            return ((AccessibilityNodeInfo) obj).getPackageName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static int m7711(Object obj, Object obj2) {
        if (C0225.m9001() >= 0) {
            return C0182.m7542((byte[]) obj, (byte[]) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۡۢ۠, reason: not valid java name and contains not printable characters */
    public static void m7712(Object obj, Object obj2) {
        if (C0238.m9653() > 0) {
            ii.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((MenuItem) obj, (CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۡۢۤ, reason: not valid java name and contains not printable characters */
    public static HookMain m7713(Object obj) {
        if (C0025.m934() > 0) {
            return ((HookMain.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۧۡ, reason: not valid java name and contains not printable characters */
    public static int[] m7714() {
        if (C0217.m8693() < 0) {
            return ql.f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۥۥ, reason: not valid java name and contains not printable characters */
    public static pr m7715(Object obj) {
        if (C0240.m9826() >= 0) {
            return ((k0.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۢۨ, reason: not valid java name and contains not printable characters */
    public static int[] m7716() {
        if (C0057.m2142() >= 0) {
            return i0.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static Matrix m7717(Object obj) {
        if (C0097.m3659() > 0) {
            return ((pr.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۦ۟, reason: not valid java name and contains not printable characters */
    public static String m7718() {
        if (C0112.m4054() <= 0) {
            return a9.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨ, reason: not valid java name and contains not printable characters */
    public static e3 m7719(float f, float f2, float f3) {
        if (C0231.m9265() >= 0) {
            return e3.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(f, f2, f3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۡ, reason: not valid java name and contains not printable characters */
    public static int m7720(Object obj, Object obj2) {
        if (C0172.m7180() >= 0) {
            return o4.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Comparable) obj, (Comparable) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۤۧۡ, reason: not valid java name and contains not printable characters */
    public static mf m7721(Object obj) {
        if (C0040.m1622() < 0) {
            return mf.a((LocaleList) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۥۧ, reason: not valid java name and contains not printable characters */
    public static SubMenu m7722(Object obj, int i, int i2, int i3, int i4) {
        if (C0072.m2856() <= 0) {
            return ((Menu) obj).addSubMenu(i, i2, i3, i4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۧۥ, reason: not valid java name and contains not printable characters */
    public static boolean m7723(Object obj) {
        if (C0181.m7445() >= 0) {
            return ((rn) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m7724(Object obj, Object obj2, int i) {
        if (C0199.m7998() < 0) {
            return ((hm) obj).f((Context) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۤۨ, reason: not valid java name and contains not printable characters */
    public static String m7725(String str) {
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

    /* JADX INFO: renamed from: ۣۤۡۥ, reason: not valid java name and contains not printable characters */
    public static boolean m7726(Object obj, int i, Object obj2) {
        if (C0009.m276() < 0) {
            return x.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj, i, (Activity) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۦۣ۟, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m7727(Object obj, Object obj2, int i) {
        if (C0017.m627() >= 0) {
            return ar.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj, (Resources) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۧۥ, reason: not valid java name and contains not printable characters */
    public static void m7728(Object obj, Object obj2, Object obj3) {
        if (C0024.m896() > 0) {
            ((Bundle) obj).putSize((String) obj2, (Size) obj3);
        }
    }

    /* JADX INFO: renamed from: ۤۨۢۢ, reason: not valid java name and contains not printable characters */
    public static int m7730(Object obj) {
        if (C0078.m3044() < 0) {
            return ((p8) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۨۦۧ, reason: not valid java name and contains not printable characters */
    public static Bitmap m7731(Object obj) {
        if (C0021.m740() < 0) {
            return ((BitmapDrawable) obj).getBitmap();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static void m7732(Object obj) {
        if (C0037.m1437() <= 0) {
            e.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((e) obj);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۨۥ, reason: contains not printable characters */
    public static RuntimeException m7733(Object obj) {
        if (C0127.m4950() >= 0) {
            return r8.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۡ, reason: contains not printable characters */
    public static Matrix m7734(Object obj) {
        if (C0213.m8458() >= 0) {
            return ((pr) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤ۟ۦ, reason: contains not printable characters */
    public static char m7735(Object obj) {
        if (C0225.m9001() > 0) {
            return ((MenuItem) obj).getNumericShortcut();
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: ۥۨۦۢ, reason: contains not printable characters */
    public static int m7736() {
        return 991 ^ C0195.f645;
    }

    /* JADX INFO: renamed from: ۦ۟ۤۥ, reason: contains not printable characters */
    public static boolean m7737(Object obj) {
        if (C0021.m740() <= 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۣۡ۠, reason: contains not printable characters */
    public static Drawable m7738(Object obj, Object obj2, int i, Object obj3) {
        if (C0106.m3835() > 0) {
            return ((PackageManager) obj).getDrawable((String) obj2, i, (ApplicationInfo) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۧۨ, reason: contains not printable characters */
    public static Object m7739(Object obj) {
        if (C0036.m1332() < 0) {
            return ((jk) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۠ۡ, reason: contains not printable characters */
    public static Bitmap m7740(Object obj, Object obj2) {
        if (C0215.m8604() < 0) {
            return ((HookMain) obj).E((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۦ, reason: contains not printable characters */
    public static void m7741(Object obj) {
        if (C0240.m9826() >= 0) {
            ((Toast) obj).show();
        }
    }

    /* JADX INFO: renamed from: ۧ۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static int m7742(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧ۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static int m7743(Object obj) {
        if (C0097.m3659() > 0) {
            return ((pr.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧۧۧ, reason: not valid java name and contains not printable characters */
    public static String m7744(Object obj, char c, Object obj2) {
        if (C0093.m3365() >= 0) {
            return mo.h0((String) obj, c, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟۠۟, reason: not valid java name and contains not printable characters */
    public static int m7745(Object obj) {
        if (C0122.m4736() < 0) {
            return ((uk.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۦۦۣ, reason: not valid java name and contains not printable characters */
    public static e9 m7746(Object obj) {
        if (C0051.m1783() < 0) {
            return ((et) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۤۧ, reason: not valid java name and contains not printable characters */
    public static int m7747(Object obj) {
        if (C0164.m6900() <= 0) {
            return ((ViewGroup) obj).getBottom();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۨۦۨ, reason: not valid java name and contains not printable characters */
    public static Object m7748(Object obj, int i, boolean z, Object obj2) {
        if (C0094.m3450() > 0) {
            return zq.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Object[]) obj, i, z, (zq.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m7729(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
