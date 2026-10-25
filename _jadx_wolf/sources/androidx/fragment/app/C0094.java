package androidx.fragment.app;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Process;
import android.support.v4.app.C0004;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0009;
import android.support.v4.graphics.drawable.C0011;
import android.text.Spanned;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.ListView;
import androidx.activity.C0014;
import androidx.activity.C0021;
import androidx.annotation.C0025;
import androidx.appcompat.app.C0035;
import androidx.appcompat.app.C0036;
import androidx.appcompat.view.menu.C0039;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0052;
import androidx.core.content.C0057;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0064;
import androidx.drawerlayout.widget.C0072;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0079;
import androidx.emoji2.text.C0083;
import androidx.lifecycle.C0106;
import androidx.lifecycle.C0107;
import androidx.lifecycle.C0108;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0115;
import com.example.vcam.C0141;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.HookMain;
import com.example.vcam.Menu;
import com.example.vcam.VideoToFrames;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ar;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ba;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.im;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.iq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kb;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ks;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ql;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.si;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ws;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z1;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import okhttp3.C0238;
import okhttp3.C0239;
import okhttp3.HttpUrl;
import okhttp3.internal.C0227;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.io.C0195;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0231;
import okhttp3.logging.C0232;
import okhttp3.logging.C0233;
import okhttp3.logging.C0234;
import okhttp3.logging.C0235;
import retrofit2.C0259;
import retrofit2.converter.scalars.C0243;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: androidx.fragment.app.۟ۥۤۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0094 {

    /* JADX INFO: renamed from: ۣ۟ۢۡۤ, reason: not valid java name and contains not printable characters */
    public static int f81 = 828;

    /* JADX INFO: renamed from: ۟۟ۢۦۡ, reason: not valid java name and contains not printable characters */
    public static Configuration m3375() {
        if (C0014.m545() >= 0) {
            return s5.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤۢۥ, reason: not valid java name and contains not printable characters */
    public static void m3376(Object obj, int i) {
        if (C0106.m3835() >= 0) {
            ((u1) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۥ۟۟, reason: not valid java name and contains not printable characters */
    public static int m3377(Object obj) {
        if (C0218.m8760() > 0) {
            return ((v7) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۥۣۨ, reason: not valid java name and contains not printable characters */
    public static int m3378(int i, int i2) {
        if (C0176.m7290() > 0) {
            return Character.digit(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۦۥۤ, reason: not valid java name and contains not printable characters */
    public static int m3379(Object obj, int i, int i2, int i3) {
        if (C0259.m10136() > 0) {
            return gn.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((int[]) obj, i, i2, i3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۧۤۡ, reason: not valid java name and contains not printable characters */
    public static int m3380(Object obj) {
        if (C0199.m7998() < 0) {
            return ((wl) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۨۦۧ, reason: not valid java name and contains not printable characters */
    public static Menu m3381(Object obj) {
        if (C0072.m2856() <= 0) {
            return ((xg) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m3382(Object obj) {
        if (C0035.m1268() <= 0) {
            return kp.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۢ۠۟, reason: not valid java name and contains not printable characters */
    public static boolean m3383(Object obj, Object obj2, int i) {
        if (C0108.m4038() >= 0) {
            return ar.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((File) obj, (Resources) obj2, i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.AccessibilityAction m3385() {
        if (C0052.m1890() >= 0) {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3386(Object obj) {
        if (C0074.m2951() < 0) {
            return ((ks) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static int m3387(Object obj, int i) {
        if (C0004.m139() < 0) {
            return ((rl) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static void m3388(Object obj, float f, float f2) {
        if (C0233.m9365() <= 0) {
            ((m2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).d(f, f2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۤۨۦ, reason: not valid java name and contains not printable characters */
    public static AtomicReferenceFieldUpdater m3389(Object obj) {
        if (C0169.m7034() < 0) {
            return ((fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m3390(Object obj) {
        if (C0243.m9964() >= 0) {
            return ((Menu.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۧۧۦ, reason: not valid java name and contains not printable characters */
    public static boolean m3391(Object obj, long j) {
        if (C0052.m1890() > 0) {
            return ((vl) obj).p(j);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m3392(Object obj, boolean z) {
        if (C0164.m6900() < 0) {
            ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).l(z);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static Context m3393(Object obj) {
        if (C0052.m1890() > 0) {
            return ((ws) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤۥ, reason: not valid java name and contains not printable characters */
    public static void m3394(Object obj, Object obj2) {
        if (C0195.m7914() >= 0) {
            ((ImageView) obj).setImageTintList((ColorStateList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۥۦۧ, reason: not valid java name and contains not printable characters */
    public static vo m3395(Object obj, int i) {
        if (C0234.m9461() <= 0) {
            return ((p) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۣۨ, reason: not valid java name and contains not printable characters */
    public static ListView m3396(Object obj) {
        if (C0181.m7445() > 0) {
            return ((qn) obj).c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static int m3397(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static Configuration m3398(Object obj) {
        if (C0097.m3659() > 0) {
            return ((s5) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۦ, reason: not valid java name and contains not printable characters */
    public static void m3399(Object obj) {
        if (C0225.m9001() >= 0) {
            ((ba) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static Intent m3400(Object obj, int i) {
        if (C0199.m7998() < 0) {
            return ((Intent) obj).addFlags(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3401(Object obj, Object obj2) {
        if (C0058.m2184() > 0) {
            return ((String) obj).startsWith((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m3402(char c) {
        if (C0188.m7736() < 0) {
            return String.valueOf(c);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۢۦ, reason: not valid java name and contains not printable characters */
    public static ValueAnimator m3403(Object obj, long j) {
        if (C0231.m9265() > 0) {
            return ((ValueAnimator) obj).setDuration(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۤ, reason: not valid java name and contains not printable characters */
    public static Context m3404(Object obj, Object obj2) {
        if (C0238.m9653() >= 0) {
            return v0.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj, (Configuration) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m3405(Object obj) {
        if (C0014.m545() > 0) {
            return ((i) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۣۧ, reason: not valid java name and contains not printable characters */
    public static int m3406(Object obj) {
        if (C0231.m9265() > 0) {
            return ((SessionConfiguration) obj).getSessionType();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۤۨۨ, reason: not valid java name and contains not printable characters */
    public static ViewTreeObserver m3407(Object obj) {
        if (C0214.m8575() <= 0) {
            return ((View) obj).getViewTreeObserver();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m3408(Object obj) {
        if (C0036.m1332() <= 0) {
            return ((TypedValue) obj).assetCookie;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۥۡ, reason: not valid java name and contains not printable characters */
    public static dn m3409(Object obj) {
        if (C0006.m169() < 0) {
            return ((dn) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۤۥ, reason: not valid java name and contains not printable characters */
    public static void m3410(Object obj) {
        if (C0064.m2388() >= 0) {
            ((u0) obj).l();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m3411(Object obj, int i) {
        if (C0011.m458() >= 0) {
            return ((hd) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۧۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m3412(Object obj, Object obj2) {
        if (C0083.m3188() < 0) {
            return ((Matrix) obj).preConcat((Matrix) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static boolean m3413(Object obj) {
        if (C0021.m740() <= 0) {
            return ((v0) obj).J;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۡۧۤ, reason: not valid java name and contains not printable characters */
    public static xp m3414(Object obj) {
        if (C0227.m9046() > 0) {
            return ((p0) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m3415(Object obj) {
        if (C0141.m5769() >= 0) {
            return ((com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۨۦ, reason: not valid java name and contains not printable characters */
    public static xs m3416(Object obj) {
        if (C0040.m1622() <= 0) {
            return ((xs) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۧ۠, reason: not valid java name and contains not printable characters */
    public static int m3417(Object obj, Object obj2) {
        if (C0249.m10052() < 0) {
            return ((Spanned) obj).getSpanFlags(obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static int m3418(Object obj) {
        if (C0249.m10052() < 0) {
            return ((ViewGroup) obj).getChildCount();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۥۢ۟, reason: not valid java name and contains not printable characters */
    public static int m3419(Object obj) {
        if (C0115.m4218() < 0) {
            return ((Configuration) obj).smallestScreenWidthDp;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۥۦۡ, reason: not valid java name and contains not printable characters */
    public static void m3420(Object obj, int i, int i2, int i3, int i4) {
        if (C0187.m7613() > 0) {
            ((ContentFrameLayout) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: ۠ۦۦۡ, reason: not valid java name and contains not printable characters */
    public static boolean m3421(Object obj) {
        if (C0259.m10136() > 0) {
            return ((iq) obj).e;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡ۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static View m3422(Object obj) {
        if (C0204.m8270() <= 0) {
            return ((m2) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۨۧ, reason: not valid java name and contains not printable characters */
    public static Object[] m3423(Object obj) {
        if (C0107.m3883() >= 0) {
            return ((z1) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۥۣ, reason: not valid java name and contains not printable characters */
    public static a6 m3424(Object obj, int i) {
        if (C0149.m6476() <= 0) {
            return ((a6) obj).R(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۧ۟, reason: not valid java name and contains not printable characters */
    public static byte[] m3425(Object obj, int i) {
        if (C0025.m934() >= 0) {
            return Arrays.copyOf((byte[]) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢ۠, reason: not valid java name and contains not printable characters */
    public static boolean m3426(Object obj, Object obj2, boolean z, int i) {
        if (C0052.m1890() > 0) {
            return mo.f0((CharSequence) obj, (CharSequence) obj2, z, i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۢۡ, reason: not valid java name and contains not printable characters */
    public static void m3427(Object obj, int i) {
        if (C0217.m8693() < 0) {
            ((View) obj).offsetTopAndBottom(i);
        }
    }

    /* JADX INFO: renamed from: ۢۤۤۧ, reason: not valid java name and contains not printable characters */
    public static si m3428(Object obj, Object obj2) {
        if (C0083.m3188() < 0) {
            return kg.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Throwable) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۤۢ, reason: not valid java name and contains not printable characters */
    public static String m3429(String str) {
        String string = HttpUrl.FRAGMENT_ENCODE_SET;
        int i = 0;
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        while (i < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i).toString();
            i++;
            str2 = string2;
        }
        while (string.length() > 0) {
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
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۢۧۢ۠, reason: not valid java name and contains not printable characters */
    public static hn m3430(Object obj, Object obj2) {
        if (C0039.m1515() < 0) {
            return mn.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((hn) obj, (qa) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۧ۠, reason: not valid java name and contains not printable characters */
    public static int m3431(Object obj) {
        if (C0235.m9535() < 0) {
            return ((android.view.Menu) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m3432() {
        if (C0211.m8341() > 0) {
            return Process.myPid();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۡۧۡ, reason: not valid java name and contains not printable characters */
    public static void m3433(Object obj, Object obj2) {
        if (C0211.m8341() > 0) {
            Menu.m5573((Menu) obj, (View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۤۤ, reason: not valid java name and contains not printable characters */
    public static Bitmap m3434(Object obj) {
        if (C0049.m1767() < 0) {
            return ((pr.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧ۟۠, reason: not valid java name and contains not printable characters */
    public static Context m3435(Object obj) {
        if (C0009.m276() <= 0) {
            return ((v0) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۧۤ, reason: not valid java name and contains not printable characters */
    public static AtomicReference m3436(Object obj) {
        if (C0187.m7613() >= 0) {
            return ((l5) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۤۤ, reason: contains not printable characters */
    public static StringBuilder m3437(Object obj, Object obj2, int i, int i2) {
        if (C0171.m7136() <= 0) {
            return ((StringBuilder) obj).append((CharSequence) obj2, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧ۠ۧ, reason: contains not printable characters */
    public static int[] m3438() {
        if (C0011.m458() > 0) {
            return ql.j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۦۤ, reason: contains not printable characters */
    public static int m3439(Object obj) {
        if (C0115.m4218() < 0) {
            return ((k1) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦ۠ۡۥ, reason: contains not printable characters */
    public static kb m3440(Object obj) {
        if (C0057.m2142() > 0) {
            return ((kb) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۤۤ, reason: contains not printable characters */
    public static uk.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.C0145x35d57e31 m3441(Object obj, int i) {
        if (C0115.m4218() < 0) {
            return ((uk.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.C0145x35d57e31) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۧۧ, reason: contains not printable characters */
    public static float m3442(Object obj) {
        if (C0079.m3072() < 0) {
            return ((TextPaint) obj).getLetterSpacing();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۦۤۨۨ, reason: contains not printable characters */
    public static qa m3443(Object obj) {
        if (C0239.m9805() <= 0) {
            return ((r4) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥ۠ۦ, reason: contains not printable characters */
    public static void m3444(Object obj) {
        if (C0112.m4054() < 0) {
            ((k1) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۧ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static void m3445(Object obj, Object obj2) {
        if (C0148.m6464() <= 0) {
            ((ConnectionBlocker) obj).r((ConnectionBlocker.ConnectionBlockerCallback) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۧ۠۟, reason: not valid java name and contains not printable characters */
    public static int m3446(Object obj) {
        if (C0083.m3188() <= 0) {
            return ((o9) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧ۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3447(Object obj) {
        if (C0199.m7998() < 0) {
            return ((pr.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۡۢۧ, reason: not valid java name and contains not printable characters */
    public static HookMain m3448(Object obj) {
        if (C0141.m5769() > 0) {
            return ((HookMain.a) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡۤۢ, reason: not valid java name and contains not printable characters */
    public static String m3449(Object obj) {
        if (C0049.m1767() <= 0) {
            return ((j9) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۡۢ, reason: not valid java name and contains not printable characters */
    public static int m3450() {
        return (-455) ^ C0052.f46;
    }

    /* JADX INFO: renamed from: ۣۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static Drawable m3451(Object obj) {
        if (C0187.m7613() > 0) {
            return ((Drawable.ConstantState) obj).newDrawable();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۧۨ, reason: not valid java name and contains not printable characters */
    public static Drawable m3452(Object obj, int i, Object obj2) {
        if (C0225.m9001() > 0) {
            return im.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Resources) obj, i, (Resources.Theme) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۨ۟, reason: not valid java name and contains not printable characters */
    public static Path m3453(Object obj) {
        if (C0232.m9299() >= 0) {
            return ((pr.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static Throwable m3454(Object obj) {
        if (C0225.m9001() >= 0) {
            return ((VideoToFrames) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۦ۟, reason: not valid java name and contains not printable characters */
    public static void m3455(Object obj, Object obj2, Object obj3) {
        if (C0095.m3478() <= 0) {
            HookMain.s.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj, (String) obj2, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۨۦ, reason: not valid java name and contains not printable characters */
    public static String m3384(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
