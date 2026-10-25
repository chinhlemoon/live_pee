package androidx.profileinstaller;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.app.C0004;
import android.support.v4.graphics.drawable.C0009;
import android.support.v4.graphics.drawable.C0010;
import android.text.method.TransformationMethod;
import android.view.DragEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.TextView;
import androidx.activity.C0020;
import androidx.activity.C0021;
import androidx.annotation.C0025;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0034;
import androidx.appcompat.app.C0035;
import androidx.appcompat.app.C0037;
import androidx.appcompat.view.menu.C0039;
import androidx.appcompat.view.menu.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.appcompat.widget.C0047;
import androidx.core.app.C0051;
import androidx.core.app.C0052;
import androidx.core.content.C0058;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0072;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0079;
import androidx.emoji2.text.C0083;
import androidx.emoji2.text.C0084;
import androidx.fragment.app.C0095;
import androidx.fragment.app.C0096;
import androidx.fragment.app.C0097;
import androidx.fragment.app.C0099;
import androidx.lifecycle.g;
import androidx.savedstate.C0122;
import androidx.savedstate.C0127;
import androidx.versionedparcelable.C0129;
import androidx.versionedparcelable.C0135;
import com.example.vcam.C0141;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.HookMain;
import com.example.vcam.LicenseManager;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.an;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ar;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.c7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ct;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.el;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ep;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.g1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.im;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jb;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ks;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ld;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.nk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zp;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import okhttp3.C0238;
import okhttp3.C0239;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.internal.C0227;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0195;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.ws.C0224;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0233;
import okhttp3.logging.C0234;
import okhttp3.logging.C0235;
import retrofit2.C0259;
import retrofit2.converter.scalars.C0243;

/* JADX INFO: renamed from: androidx.profileinstaller.ۨۦۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0120 {

    /* JADX INFO: renamed from: ۡۤۥۧ, reason: not valid java name and contains not printable characters */
    public static int f100 = -623;

    /* JADX INFO: renamed from: ۟۟۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4603(Object obj) {
        if (C0035.m1268() < 0) {
            return ((MediaPlayer) obj).isLooping();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static Locale m4604(Object obj) {
        if (C0187.m7613() >= 0) {
            return Locale.forLanguageTag((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static HookMain.c m4605(Object obj) {
        if (C0164.m6900() <= 0) {
            return ((bc) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static float m4606(Object obj) {
        if (C0095.m3478() < 0) {
            return ((TextView) obj).getLineSpacingMultiplier();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟۟ۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Drawable m4607(Object obj, int i) {
        if (C0039.m1515() < 0) {
            return ((Resources) obj).getDrawable(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢ۟۟, reason: not valid java name and contains not printable characters */
    public static int m4608() {
        return (-104) ^ C0021.f20;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m4609(Object obj) {
        if (C0135.m5274() <= 0) {
            return ar.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((File) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨ۠ۢ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m4610(Object obj, int i) {
        if (C0058.m2184() > 0) {
            return h1.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static void m4611(Object obj) {
        if (C0099.m3752() <= 0) {
            ((v0.g) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m4612(Object obj, Object obj2) {
        if (C0052.m1890() > 0) {
            return ((Request.Builder) obj).url((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static int m4613(Object obj, Object obj2, Object obj3) {
        if (C0034.m1206() <= 0) {
            return ((v0) obj).T0((xs) obj2, (Rect) obj3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۢۤۥ, reason: not valid java name and contains not printable characters */
    public static Object[] m4614(Object obj) {
        if (C0224.m8861() < 0) {
            return ((m1) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۦ, reason: not valid java name and contains not printable characters */
    public static v2 m4615(Object obj) {
        if (C0227.m9046() > 0) {
            return ((nk) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۨۢ, reason: not valid java name and contains not printable characters */
    public static void m4616(Object obj) {
        if (C0199.m7998() < 0) {
            ((xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).clear();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤ۠, reason: not valid java name and contains not printable characters */
    public static boolean m4617(Object obj) {
        if (C0097.m3659() >= 0) {
            return sj.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((AssertionError) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۥ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m4618(Object obj, Object obj2, int i, int i2, Object obj3, int i3) {
        if (C0074.m2951() < 0) {
            ((gj) obj).b((View) obj2, i, i2, (int[]) obj3, i3);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۥۣۢ, reason: not valid java name and contains not printable characters */
    public static int m4619(Object obj, int i) {
        if (C0234.m9461() < 0) {
            return ((AnimationDrawable) obj).getDuration(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۥۣۤ, reason: not valid java name and contains not printable characters */
    public static void m4620(Object obj, int i, Object obj2, Object obj3) {
        if (m4608() > 0) {
            ((v0) obj).N(i, (v0.k) obj2, (Menu) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۦ۟۟, reason: not valid java name and contains not printable characters */
    public static j9 m4621(Object obj) {
        if (C0122.m4736() < 0) {
            return ((m9.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۣ, reason: not valid java name and contains not printable characters */
    public static c7 m4622() {
        if (C0259.m10136() >= 0) {
            return v6.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧۦۡ, reason: not valid java name and contains not printable characters */
    public static String m4623(Object obj) {
        if (C0113.m4144() < 0) {
            return ((LicenseManager) obj).h();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m4624(Object obj, int i) {
        if (C0141.m5769() >= 0) {
            return m9.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TypedArray) obj, i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static CharSequence m4625(Object obj, Object obj2) {
        if (C0200.m8104() < 0) {
            return ((wr.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).a((View) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۥ, reason: not valid java name and contains not printable characters */
    public static List m4626(Object obj) {
        if (C0227.m9046() >= 0) {
            return ((ConnectionBlocker) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m4627(Object obj, Object obj2, long j) {
        if (C0052.m1890() >= 0) {
            ((Bundle) obj).putLong((String) obj2, j);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m4628(Object obj, Object obj2, int i) {
        if (C0202.m8245() > 0) {
            return ((ConnectionBlocker.BlockRule) obj).matches((String) obj2, i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m4629(Object obj) {
        if (C0215.m8604() < 0) {
            return ((uo.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).v;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦ۠ۧ, reason: not valid java name and contains not printable characters */
    public static bs m4630(Object obj, Object obj2) {
        if (C0025.m934() > 0) {
            return ((g) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Class) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۡۦ, reason: not valid java name and contains not printable characters */
    public static int m4631(Object obj) {
        if (C0187.m7613() > 0) {
            return ((lg.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۢۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4632(Object obj, Object obj2) {
        if (C0127.m4950() >= 0) {
            return ((TextView) obj).post((Runnable) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤ۠۠۟, reason: not valid java name and contains not printable characters */
    public static void m4633(Object obj, boolean z) {
        if (C0096.m3601() < 0) {
            ((pr) obj).setAutoMirrored(z);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m4634(Object obj) {
        if (C0052.m1890() >= 0) {
            return ((ConnectionBlocker.BlockRule) obj).hitCount;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۨ, reason: not valid java name and contains not printable characters */
    public static void m4635(Object obj) {
        if (C0069.m2756() < 0) {
            ((Drawable) obj).invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: ۟ۤۦۣ, reason: not valid java name and contains not printable characters */
    public static int m4636(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۤۧۢۡ, reason: not valid java name and contains not printable characters */
    public static int m4637() {
        if (C0215.m8604() <= 0) {
            return rn.b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static EditText m4638(Object obj) {
        if (C0214.m8575() <= 0) {
            return com.example.vcam.Menu.m5632((com.example.vcam.Menu) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۦۧ, reason: not valid java name and contains not printable characters */
    public static void m4639(Object obj, Object obj2, Object obj3, boolean z) {
        if (C0037.m1437() < 0) {
            ((an) obj).T((Runnable) obj2, (ep) obj3, z);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣۧ۟, reason: not valid java name and contains not printable characters */
    public static int m4641(Object obj) {
        if (C0078.m3044() < 0) {
            return ((tm) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۦۥ, reason: not valid java name and contains not printable characters */
    public static Rect m4642() {
        if (C0224.m8861() < 0) {
            return s7.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۡۤ, reason: not valid java name and contains not printable characters */
    public static androidx.emoji2.text.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m4643(Object obj) {
        if (C0233.m9365() < 0) {
            return ((z7) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۢ۟, reason: not valid java name and contains not printable characters */
    public static boolean m4644(char c) {
        if (C0171.m7136() <= 0) {
            return Character.isLowSurrogate(c);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۥۢ۠, reason: not valid java name and contains not printable characters */
    public static void m4645(Object obj, int i) {
        if (C0164.m6900() < 0) {
            wr.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj, i);
        }
    }

    /* JADX INFO: renamed from: ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m4646(Object obj) {
        if (C0083.m3188() <= 0) {
            return ((MenuItem) obj).getAlphabeticModifiers();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static String m4647(Object obj, int i) {
        if (C0010.m354() < 0) {
            return ((Resources) obj).getString(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۦۣ, reason: not valid java name and contains not printable characters */
    public static boolean m4648(Object obj) {
        if (C0084.m3253() < 0) {
            return s5.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Configuration) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۥۥۦ, reason: not valid java name and contains not printable characters */
    public static void m4649(Object obj) {
        if (C0172.m7180() >= 0) {
            ((OverScroller) obj).abortAnimation();
        }
    }

    /* JADX INFO: renamed from: ۟ۧۦۧۨ, reason: not valid java name and contains not printable characters */
    public static boolean m4650(Object obj) {
        if (C0148.m6464() < 0) {
            return ((yo) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۦۨۢ, reason: not valid java name and contains not printable characters */
    public static void m4651(Object obj) {
        if (C0194.m7889() >= 0) {
            ((androidx.appcompat.widget.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).x();
        }
    }

    /* JADX INFO: renamed from: ۠۟ۧۥ, reason: not valid java name and contains not printable characters */
    public static int m4652(Object obj) {
        if (C0238.m9653() >= 0) {
            return ((View) obj).getPaddingLeft();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static Object m4653() {
        if (C0164.m6900() <= 0) {
            return ld.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۥ۠, reason: not valid java name and contains not printable characters */
    public static int m4654(Object obj, int i, int i2, int i3) {
        if (C0215.m8604() <= 0) {
            return zo.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj, i, i2, i3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۡۨۨ, reason: not valid java name and contains not printable characters */
    public static void m4655(Object obj, float f) {
        if (C0259.m10136() >= 0) {
            ((FrameLayout) obj).setTranslationY(f);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static MenuItem m4656(Object obj, Object obj2) {
        if (C0225.m9001() >= 0) {
            return ((MenuItem) obj).setTooltipText((CharSequence) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m4657(Object obj, Object obj2, int i, int i2, int i3, int i4) {
        if (C0078.m3044() < 0) {
            hs.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ViewParent) obj, (View) obj2, i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: ۠ۨۥۨ, reason: not valid java name and contains not printable characters */
    public static void m4658(Object obj, Object obj2, Object obj3) {
        if (C0069.m2756() <= 0) {
            ((Binder) obj).attachInterface((IInterface) obj2, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۡۤۧ۟, reason: not valid java name and contains not printable characters */
    public static bk m4659(Object obj, Object obj2) {
        if (C0031.m1148() < 0) {
            return bk.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj, (Runnable) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۤۤ, reason: not valid java name and contains not printable characters */
    public static int m4660(Object obj) {
        if (C0178.m7344() <= 0) {
            return ((uk.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.C0145x35d57e31) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۧۤۡ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m4661(Object obj, Object obj2) {
        if (C0169.m7034() <= 0) {
            return ((z0.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۦۢ, reason: not valid java name and contains not printable characters */
    public static boolean m4662(Object obj) {
        if (C0037.m1437() < 0) {
            return ((ct) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢ۠ۥۥ, reason: not valid java name and contains not printable characters */
    public static int m4663(Object obj, int i) {
        if (C0047.m1663() < 0) {
            return ((String) obj).lastIndexOf(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4664(Object obj) {
        if (m4608() >= 0) {
            return ((k8) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۢ۠ۦ, reason: not valid java name and contains not printable characters */
    public static n0 m4665() {
        if (C0072.m2856() < 0) {
            return n0.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۨۢ, reason: not valid java name and contains not printable characters */
    public static String m4666(String str) {
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

    /* JADX INFO: renamed from: ۣۥۦ۠, reason: not valid java name and contains not printable characters */
    public static uc m4667(Object obj) {
        if (C0195.m7914() > 0) {
            return ((jb) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۤۦ, reason: not valid java name and contains not printable characters */
    public static void m4668(Object obj, Object obj2, Object obj3, boolean z, int i, Object obj4) {
        if (C0129.m5108() > 0) {
            ((TransformationMethod) obj).onFocusChanged((View) obj2, (CharSequence) obj3, z, i, (Rect) obj4);
        }
    }

    /* JADX INFO: renamed from: ۣۨۤ۟, reason: not valid java name and contains not printable characters */
    public static Context m4669(Object obj) {
        if (C0069.m2756() < 0) {
            return ((com.example.vcam.Menu.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static long m4670(Object obj, int i) {
        if (C0084.m3253() < 0) {
            return r8.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((InputStream) obj, i);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤۡۦۢ, reason: not valid java name and contains not printable characters */
    public static CharSequence[] m4671(Object obj, int i) {
        if (C0004.m139() <= 0) {
            return ((TypedArray) obj).getTextArray(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۦۥ, reason: not valid java name and contains not printable characters */
    public static float m4672(Object obj, int i) {
        if (C0020.m701() > 0) {
            return ((VelocityTracker) obj).getYVelocity(i);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۣۤۤ, reason: not valid java name and contains not printable characters */
    public static void m4673(Object obj) {
        if (C0243.m9964() > 0) {
            ((ks) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۤۥۣۥ, reason: not valid java name and contains not printable characters */
    public static Reference m4674(Object obj) {
        if (C0239.m9805() <= 0) {
            return ((i8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡ۠ۧ, reason: contains not printable characters */
    public static void m4675(Object obj, float f) {
        if (C0079.m3072() < 0) {
            ((ViewGroup) obj).setAlpha(f);
        }
    }

    /* JADX INFO: renamed from: ۥۤۤۨ, reason: contains not printable characters */
    public static boolean m4676(Object obj, Object obj2, Object obj3) {
        if (C0051.m1783() < 0) {
            return g1.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((DragEvent) obj, (View) obj2, (Activity) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۦۥ۟, reason: contains not printable characters */
    public static byte[] m4677() {
        if (C0051.m1783() <= 0) {
            return el.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۥ۠, reason: contains not printable characters */
    public static MenuItem m4678(Object obj, char c, char c2, int i, int i2) {
        if (C0164.m6900() < 0) {
            return ((vo) obj).setShortcut(c, c2, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۟۠, reason: contains not printable characters */
    public static Object m4679(Object obj) {
        if (C0122.m4736() < 0) {
            return ((Iterator) obj).next();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۧۥ, reason: contains not printable characters */
    public static String m4680(Object obj) {
        if (C0115.m4218() <= 0) {
            return ((l9.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡ۠ۦ, reason: contains not printable characters */
    public static int m4681(Object obj) {
        if (C0118.m4454() >= 0) {
            return ((l9.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۦۣۧ, reason: contains not printable characters */
    public static boolean m4682(Object obj, Object obj2) {
        if (C0009.m276() <= 0) {
            return ((mf) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۢۦۣ, reason: not valid java name and contains not printable characters */
    public static Typeface m4683(Object obj, int i, int i2, Object obj2) {
        if (C0162.m6837() <= 0) {
            return ((zp) obj).a(i, i2, (im.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۥۢ, reason: not valid java name and contains not printable characters */
    public static String m4684(Object obj) {
        if (C0235.m9535() < 0) {
            return ((e) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤ۟۠, reason: not valid java name and contains not printable characters */
    public static SubMenu m4685(Object obj, int i) {
        if (C0078.m3044() <= 0) {
            return ((SubMenu) obj).setHeaderIcon(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۥۡ, reason: not valid java name and contains not printable characters */
    public static Drawable m4686(Object obj, int i, Object obj2) {
        if (C0034.m1206() < 0) {
            return ((Resources) obj).getDrawable(i, (Resources.Theme) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۦۤ, reason: not valid java name and contains not printable characters */
    public static String m4640(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
