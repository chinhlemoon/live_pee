package okhttp3.internal.publicsuffix;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Insets;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.C0002;
import android.support.v4.app.C0004;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0010;
import android.support.v4.graphics.drawable.C0011;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.widget.Switch;
import androidx.activity.C0020;
import androidx.activity.C0021;
import androidx.annotation.C0023;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0034;
import androidx.appcompat.app.C0035;
import androidx.appcompat.app.C0036;
import androidx.appcompat.app.C0037;
import androidx.appcompat.view.menu.C0040;
import androidx.core.app.C0051;
import androidx.core.graphics.drawable.C0065;
import androidx.core.widget.C0068;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0079;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0099;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0123;
import androidx.versionedparcelable.C0133;
import com.example.vcam.HookMain;
import com.example.vcam.LicenseManager;
import com.example.vcam.MainActivity;
import com.example.vcam.Menu;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.aa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fb;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.im;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.js;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.nc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ng;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.nh;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.op;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qb;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ua;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.us;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zs;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.C0238;
import okhttp3.C0239;
import okhttp3.HttpUrl;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.proxy.C0213;
import okhttp3.logging.C0231;
import okhttp3.logging.C0234;
import okhttp3.logging.C0235;
import retrofit2.C0259;
import retrofit2.converter.scalars.C0243;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: okhttp3.internal.publicsuffix.۟ۢۢ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0215 {

    /* JADX INFO: renamed from: ۟ۦ۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static int f665 = -88;

    /* JADX INFO: renamed from: ۟۟ۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m8588(Object obj) {
        if (C0021.m740() < 0) {
            return ((v0) obj).B;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۧۦۧ, reason: not valid java name and contains not printable characters */
    public static int m8589(Object obj) {
        if (C0214.m8575() <= 0) {
            return ((ViewGroup) obj).getWidth();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠۟۠, reason: not valid java name and contains not printable characters */
    public static Context m8590(Object obj) {
        if (C0231.m9265() > 0) {
            return ((v0) obj).d0();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static Object m8591(Object obj) {
        if (C0178.m7344() < 0) {
            return ((z9.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۢ۠, reason: not valid java name and contains not printable characters */
    public static void m8592(Object obj, Object obj2) {
        if (C0133.m5208() <= 0) {
            ((o5.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Uri) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۧۡۢ, reason: not valid java name and contains not printable characters */
    public static long m8593(Object obj, Object obj2, boolean z) {
        if (C0006.m169() <= 0) {
            return ((zs) obj).e((zs) obj2, z);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡۢۥۤ, reason: not valid java name and contains not printable characters */
    public static ua m8594(Object obj) {
        if (C0004.m139() <= 0) {
            return ((d7) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۥ۠, reason: not valid java name and contains not printable characters */
    public static String m8595(Object obj) {
        if (C0133.m5208() <= 0) {
            return ((HookMain) obj).currentVideoPath;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۥۣ, reason: not valid java name and contains not printable characters */
    public static hn m8596(Object obj, Object obj2, boolean z, int i) {
        if (C0002.m72() >= 0) {
            return mo.c0((CharSequence) obj, (String[]) obj2, z, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨ۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m8597(Object obj) {
        if (C0034.m1206() < 0) {
            return ((vf) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۢۢۡ, reason: not valid java name and contains not printable characters */
    public static void m8598(Object obj, Object obj2, int i) {
        if (C0194.m7889() >= 0) {
            ((zr.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).a((View) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static Appendable m8599(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, Object obj6, Object obj7) {
        if (C0040.m1622() < 0) {
            return mn.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((hn) obj, (Appendable) obj2, (CharSequence) obj3, (CharSequence) obj4, (CharSequence) obj5, i, (CharSequence) obj6, (qa) obj7);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m8600(Object obj) {
        if (C0099.m3752() <= 0) {
            ((h8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).d();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧۥ, reason: not valid java name and contains not printable characters */
    public static int m8601(Object obj) {
        if (C0079.m3072() < 0) {
            return ((wr.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۧۦ, reason: not valid java name and contains not printable characters */
    public static void m8602(Object obj) {
        if (C0239.m9805() <= 0) {
            ((d7.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۟ۤ۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m8603(Object obj) {
        if (C0031.m1148() < 0) {
            return ((y4) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۢۦۡ, reason: not valid java name and contains not printable characters */
    public static int m8604() {
        return (-413) ^ C0172.f622;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static int m8605(float f, float f2, float f3, Object obj) {
        if (C0065.m2448() >= 0) {
            return e3.f(f, f2, f3, (us) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۧۤ, reason: not valid java name and contains not printable characters */
    public static void m8606(Object obj, boolean z) {
        if (C0021.m740() < 0) {
            ((AccessibilityNodeInfo) obj).setFocusable(z);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۧۦۥ, reason: not valid java name and contains not printable characters */
    public static File m8607(Object obj) {
        if (C0164.m6900() < 0) {
            return ((qb) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۨۤ, reason: not valid java name and contains not printable characters */
    public static fb m8608(Object obj) {
        if (C0239.m9805() < 0) {
            return ((f6) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۡۨ, reason: not valid java name and contains not printable characters */
    public static MenuItem m8609(Object obj, boolean z) {
        if (C0214.m8575() <= 0) {
            return ((MenuItem) obj).setCheckable(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۥۢ, reason: not valid java name and contains not printable characters */
    public static boolean m8610(Object obj) {
        if (C0219.m8794() >= 0) {
            return ((u7) obj).c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۨۤۨ, reason: not valid java name and contains not printable characters */
    public static im.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m8611(Object obj) {
        if (C0036.m1332() <= 0) {
            return ((jm) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۦۦ, reason: not valid java name and contains not printable characters */
    public static z0 m8612() {
        if (C0002.m72() > 0) {
            return z0.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۨۨ, reason: not valid java name and contains not printable characters */
    public static int m8613(Object obj) {
        if (C0238.m9653() > 0) {
            return ((tm) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۥۧ۠, reason: not valid java name and contains not printable characters */
    public static void m8614(Object obj, Object obj2, int i, int i2) {
        if (C0172.m7180() > 0) {
            y7.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((EditorInfo) obj, (CharSequence) obj2, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۧۧ, reason: not valid java name and contains not printable characters */
    public static int m8615(Object obj) {
        if (C0243.m9964() >= 0) {
            return ((Configuration) obj).uiMode;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۦۥۥ, reason: not valid java name and contains not printable characters */
    public static float m8616(Object obj) {
        if (C0036.m1332() < 0) {
            return ((Configuration) obj).fontScale;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static Drawable m8617(Object obj) {
        if (C0037.m1437() <= 0) {
            return ((r7) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static Insets m8618(Object obj) {
        if (C0120.m4608() >= 0) {
            return ((Drawable) obj).getOpticalInsets();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static int m8619(Object obj) {
        if (C0162.m6837() <= 0) {
            return ((View) obj).getWidth();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static y5 m8620(Object obj) {
        if (C0235.m9535() < 0) {
            return ((i7) obj).getContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static Field m8621() {
        if (C0238.m9653() > 0) {
            return xs.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static Method m8622() {
        if (C0214.m8575() < 0) {
            return nc.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m8624(Object obj, Object obj2, Object obj3) {
        if (C0213.m8458() >= 0) {
            ((Bundle) obj).putLongArray((String) obj2, (long[]) obj3);
        }
    }

    /* JADX INFO: renamed from: ۢۡۥۦ, reason: not valid java name and contains not printable characters */
    public static void m8625(Object obj) {
        if (C0120.m4608() > 0) {
            Collections.sort((List) obj);
        }
    }

    /* JADX INFO: renamed from: ۢۨۡۦ, reason: not valid java name and contains not printable characters */
    public static jj m8626(Object obj) {
        if (C0191.m7812() > 0) {
            return ((xd.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟, reason: not valid java name and contains not printable characters */
    public static Object m8627(Object obj, Object obj2) {
        if (C0259.m10136() > 0) {
            return ((op) obj).x((y5) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۢۥ, reason: not valid java name and contains not printable characters */
    public static boolean m8628(Object obj, int i, Object obj2, int i2, int i3) {
        if (C0020.m701() >= 0) {
            return t2.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((dn) obj, i, (byte[]) obj2, i2, i3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static void m8629(Object obj, boolean z) {
        if (m8604() <= 0) {
            ((Switch) obj).setChecked(z);
        }
    }

    /* JADX INFO: renamed from: ۤ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static String m8630(String str) {
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

    /* JADX INFO: renamed from: ۣۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int[] m8631(Object obj) {
        if (C0010.m354() < 0) {
            return ((l1) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m8632(Object obj) {
        if (C0259.m10136() >= 0) {
            return ((Drawable) obj).isAutoMirrored();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟ۦۤ, reason: contains not printable characters */
    public static Field m8633() {
        if (C0011.m458() > 0) {
            return lm.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۦۧ, reason: contains not printable characters */
    public static String m8634(Object obj) {
        if (C0094.m3450() >= 0) {
            return ((TimeUnit) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡ۟, reason: contains not printable characters */
    public static HashMap m8635(Object obj) {
        if (C0164.m6900() <= 0) {
            return ((v9) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۤۡ, reason: contains not printable characters */
    public static boolean m8636(Object obj, Object obj2) {
        if (C0068.m2650() > 0) {
            return ((xd) obj).w((Throwable) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۡۥۢ, reason: contains not printable characters */
    public static js m8637(Object obj) {
        if (C0171.m7136() < 0) {
            return ((xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢ۠, reason: contains not printable characters */
    public static boolean m8638(Object obj) {
        if (C0051.m1783() < 0) {
            return ((v0) obj).E;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۤ۟ۨ, reason: contains not printable characters */
    public static void m8639(Object obj, Object obj2) {
        if (C0123.m4841() < 0) {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj, (String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۨۦۡ, reason: contains not printable characters */
    public static Context m8640(Object obj) {
        if (C0035.m1268() < 0) {
            return ((qo) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۧۦ, reason: contains not printable characters */
    public static Object[] m8641(Object obj) {
        if (C0011.m458() > 0) {
            return ((wn) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۦۣ, reason: contains not printable characters */
    public static int m8642(Object obj) {
        if (C0213.m8458() >= 0) {
            return ((uo.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۢۧ, reason: contains not printable characters */
    public static int m8643(int i) {
        if (m8604() < 0) {
            return ng.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۢۧ۠, reason: contains not printable characters */
    public static Menu m8644(Object obj) {
        if (C0249.m10052() < 0) {
            return ((nh) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۨۤ, reason: contains not printable characters */
    public static void m8645(Object obj, Object obj2) {
        if (C0116.m4340() >= 0) {
            ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).q((Resources) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۧۤۡ, reason: not valid java name and contains not printable characters */
    public static i m8646(Object obj) {
        if (C0188.m7736() < 0) {
            return i.N((AccessibilityNodeInfo) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۤۧ, reason: not valid java name and contains not printable characters */
    public static LicenseManager m8647(Object obj) {
        if (C0074.m2951() < 0) {
            return C0037.m1395((MainActivity) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۧۤ, reason: not valid java name and contains not printable characters */
    public static Map m8648(Object obj) {
        if (C0116.m4340() > 0) {
            return ((aa.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m8649(Object obj, Object obj2) {
        if (C0234.m9461() <= 0) {
            ((bo) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۡۦۡ, reason: not valid java name and contains not printable characters */
    public static String m8650(Object obj) {
        if (C0181.m7445() > 0) {
            return ((l9.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۨۨ, reason: not valid java name and contains not printable characters */
    public static int m8651(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۨۥۦۧ, reason: not valid java name and contains not printable characters */
    public static void m8652(Object obj, Object obj2) {
        if (C0023.m843() > 0) {
            ((Bundle) obj).remove((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡۢۥۡ, reason: not valid java name and contains not printable characters */
    public static String m8623(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
