package androidx.savedstate;

import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.app.C0002;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0009;
import android.support.v4.graphics.drawable.C0010;
import android.support.v4.graphics.drawable.C0011;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ContentInfo;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.C0014;
import androidx.annotation.C0023;
import androidx.annotation.C0025;
import androidx.appcompat.app.C0036;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.widget.C0047;
import androidx.core.app.C0052;
import androidx.core.app.C0053;
import androidx.core.content.C0057;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0064;
import androidx.core.graphics.drawable.C0066;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0072;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0079;
import androidx.emoji2.text.C0084;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0095;
import androidx.fragment.app.C0096;
import androidx.fragment.app.C0099;
import androidx.fragment.app.a;
import androidx.lifecycle.C0106;
import androidx.lifecycle.C0107;
import androidx.lifecycle.C0108;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0117;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0135;
import com.example.vcam.C0141;
import com.example.vcam.LicenseManager;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.am;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.b8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.da;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ie;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.im;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.js;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.of;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.up;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.w3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yi;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.C0227;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.ws.C0224;
import okhttp3.logging.C0231;
import okhttp3.logging.C0232;
import okhttp3.logging.C0234;
import okhttp3.logging.C0236;
import retrofit2.C0259;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: androidx.savedstate.۟۠ۦ۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0122 {

    /* JADX INFO: renamed from: ۟۟ۢ۟۟, reason: not valid java name and contains not printable characters */
    public static int f101 = -534;

    /* JADX INFO: renamed from: ۣ۟۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m4687(Object obj, float f) {
        if (C0006.m169() < 0) {
            ((FrameLayout) obj).setAlpha(f);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۢۢۨ, reason: not valid java name and contains not printable characters */
    public static void m4688(Object obj, Object obj2) {
        if (C0172.m7180() > 0) {
            ((rp) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((sp) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۨۤ۟, reason: not valid java name and contains not printable characters */
    public static boolean m4689(Object obj) {
        if (C0023.m843() > 0) {
            return ((Response) obj).isSuccessful();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static float m4690(Object obj) {
        if (C0106.m3835() >= 0) {
            return ((e3) obj).a();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟۠ۢۤۨ, reason: not valid java name and contains not printable characters */
    public static String m4691(Object obj, Object obj2) {
        if (C0227.m9046() > 0) {
            return fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((byte[]) obj, (byte[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۥۦ, reason: not valid java name and contains not printable characters */
    public static Activity m4692(Object obj) {
        if (C0218.m8760() >= 0) {
            return ((v.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۡۡ, reason: not valid java name and contains not printable characters */
    public static ViewTreeObserver m4693(Object obj) {
        if (C0117.m4419() < 0) {
            return ((bk) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static void m4694(Object obj, int i) {
        if (C0112.m4054() < 0) {
            ((ValueAnimator) obj).setRepeatCount(i);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۨۢ۟, reason: not valid java name and contains not printable characters */
    public static String m4695(Object obj) {
        if (C0058.m2184() >= 0) {
            return ((LicenseManager) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۥ۟, reason: not valid java name and contains not printable characters */
    public static ie m4696(Object obj, Object obj2) {
        if (C0217.m8693() < 0) {
            return ((am) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((yi) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static int m4697(Object obj) {
        if (C0010.m354() <= 0) {
            return ((pr.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).getChangingConfigurations();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧۧ, reason: not valid java name and contains not printable characters */
    public static String m4698(Object obj) {
        if (C0096.m3601() < 0) {
            return ((Context) obj).getPackageName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠۟, reason: not valid java name and contains not printable characters */
    public static Drawable m4699(Object obj) {
        if (C0232.m9299() > 0) {
            return t3.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((CheckedTextView) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static tf m4700(Object obj) {
        if (C0036.m1332() <= 0) {
            return sf.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m4701(Object obj) {
        if (C0006.m169() <= 0) {
            return ((a3) obj).b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۤۡ, reason: not valid java name and contains not printable characters */
    public static float m4702(Object obj) {
        if (C0161.m6744() > 0) {
            return ((zr) obj).f;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡ۟, reason: not valid java name and contains not printable characters */
    public static WindowManager.LayoutParams m4703(Object obj) {
        if (C0141.m5769() > 0) {
            return ((jq) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟۟۠, reason: not valid java name and contains not printable characters */
    public static void m4704(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0259.m10136() >= 0) {
            C0084.m3257((xd) obj, (xd.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2, (w3) obj3, obj4);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۨ, reason: not valid java name and contains not printable characters */
    public static int m4705(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۤۥ۠۠, reason: not valid java name and contains not printable characters */
    public static String m4706() {
        if (C0052.m1890() >= 0) {
            return Build.BRAND;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۥۧ, reason: not valid java name and contains not printable characters */
    public static void m4707(Object obj) {
        if (C0002.m72() > 0) {
            ((k0) obj).start();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧ۟, reason: not valid java name and contains not printable characters */
    public static void m4708(Object obj, Object obj2) {
        if (C0072.m2856() < 0) {
            ((EditText) obj).setEditableFactory((Editable.Factory) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۧۤۥ, reason: not valid java name and contains not printable characters */
    public static String m4709(Object obj) {
        if (C0079.m3072() <= 0) {
            return wr.d.c((View) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۨۧ, reason: not valid java name and contains not printable characters */
    public static void m4710(Object obj, Object obj2) {
        if (C0202.m8245() > 0) {
            d6.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((y5) obj, (Throwable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۢ۠, reason: not valid java name and contains not printable characters */
    public static int m4711(Object obj) {
        if (C0064.m2388() >= 0) {
            return ((uk.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۤۨۥ, reason: not valid java name and contains not printable characters */
    public static int m4712(Object obj) {
        if (C0040.m1622() <= 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).c();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۢ۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m4713(Object obj, Object obj2, int i, int i2) throws IOException {
        if (C0176.m7290() >= 0) {
            ((FileOutputStream) obj).write((byte[]) obj2, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static Iterator m4714(Object obj) {
        if (C0236.m9615() >= 0) {
            return ((tm) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۦۡ, reason: not valid java name and contains not printable characters */
    public static void m4715(Object obj, float f) {
        if (C0123.m4841() <= 0) {
            ((TextView) obj).setTextSize(f);
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static Intent m4716(Object obj, Object obj2) {
        if (C0096.m3601() < 0) {
            return ((Intent) obj).setAction((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۡۡ, reason: not valid java name and contains not printable characters */
    public static String m4717() {
        if (C0214.m8575() <= 0) {
            return "ۧۦ۟";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static up m4718(Object obj) {
        if (C0047.m1663() <= 0) {
            return ((up) obj).clearDeadline();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۥۧ, reason: not valid java name and contains not printable characters */
    public static void m4719(Object obj, Object obj2, int i, int i2, int i3, int i4) {
        if (C0052.m1890() > 0) {
            ((zr.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).c((View) obj2, i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m4720(Object obj, Object obj2, int i, Object obj3, int i2, Object obj4) {
        if (C0234.m9461() <= 0) {
            k3.u((k3) obj, obj2, i, (qa) obj3, i2, obj4);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۤۨ۠, reason: not valid java name and contains not printable characters */
    public static boolean m4721(Object obj) {
        if (C0002.m72() >= 0) {
            return q7.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Drawable) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۥ۟, reason: not valid java name and contains not printable characters */
    public static void m4722(Object obj) {
        if (C0107.m3883() > 0) {
            ((a9) obj).g();
        }
    }

    /* JADX INFO: renamed from: ۟ۧۥۥۦ, reason: not valid java name and contains not printable characters */
    public static int m4723(int i, int i2) {
        if (C0066.m2514() >= 0) {
            return jd.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۥۨۧ, reason: not valid java name and contains not printable characters */
    public static Object m4724(Object obj) {
        if (C0014.m545() > 0) {
            return ((of) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۦۨ, reason: not valid java name and contains not printable characters */
    public static Object m4725(Object obj) {
        if (C0106.m3835() >= 0) {
            return ((q) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean m4726(Object obj, Object obj2) {
        if (C0064.m2388() > 0) {
            return ((View) obj).removeCallbacks((Runnable) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۠۟ۢ, reason: not valid java name and contains not printable characters */
    public static dn m4727(Object obj) {
        if (C0023.m843() > 0) {
            return ((s2) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۧۧ, reason: not valid java name and contains not printable characters */
    public static f2 m4728(Object obj) {
        if (C0025.m934() > 0) {
            return f2.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static Context m4729(Object obj) {
        if (C0108.m4038() >= 0) {
            return ((ImageView) obj).getContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۢۧ, reason: not valid java name and contains not printable characters */
    public static Constructor m4730() {
        if (C0178.m7344() < 0) {
            return uq.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۨۡ, reason: not valid java name and contains not printable characters */
    public static int m4731(Object obj) {
        if (C0211.m8341() >= 0) {
            return ((m9.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۦۨ۠, reason: not valid java name and contains not printable characters */
    public static Editable.Factory m4732() {
        if (C0240.m9826() >= 0) {
            return b8.getInstance();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۨۤ, reason: not valid java name and contains not printable characters */
    public static void m4733(Object obj, boolean z) {
        if (C0232.m9299() >= 0) {
            ((View) obj).setNestedScrollingEnabled(z);
        }
    }

    /* JADX INFO: renamed from: ۣۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static Object m4734(Object obj, Object obj2, Object obj3) {
        if (C0064.m2388() >= 0) {
            return ((yf) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۥۡ, reason: not valid java name and contains not printable characters */
    public static void m4735(Object obj, Object obj2) {
        if (C0236.m9615() >= 0) {
            ((o5.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Bundle) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۥۤۥ, reason: not valid java name and contains not printable characters */
    public static int m4736() {
        return (-752) ^ C0117.f97;
    }

    /* JADX INFO: renamed from: ۣ۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static Typeface m4737(Object obj, Object obj2, Object obj3, int i, Object obj4, int i2, int i3, Object obj5, Object obj6, boolean z) {
        if (C0079.m3072() <= 0) {
            return tq.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj, (m9.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2, (Resources) obj3, i, (String) obj4, i2, i3, (im.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj5, (Handler) obj6, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۤۤ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeProvider m4738(Object obj, Object obj2) {
        if (C0231.m9265() > 0) {
            return h.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View.AccessibilityDelegate) obj, (View) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۥۥ, reason: not valid java name and contains not printable characters */
    public static void m4739(Object obj, int i, int i2, int i3, int i4) {
        if (C0135.m5274() < 0) {
            ((TextView) obj).setPadding(i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: ۤ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static View m4740(Object obj) {
        if (C0011.m458() >= 0) {
            return ((q) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static View m4741(Object obj) {
        if (C0009.m276() < 0) {
            return ((v0.k) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۡۤ, reason: not valid java name and contains not printable characters */
    public static int m4742(Object obj) {
        if (m4736() < 0) {
            return ((AtomicInteger) obj).get();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۢۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4743(Object obj) {
        if (C0099.m3752() < 0) {
            return ((pr) obj).isStateful();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m4744(String str) {
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
        while (length > 0) {
            byteArray[-1] = (byte) (byteArray[-1] ^ str2.charAt((-1) % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = HttpUrl.FRAGMENT_ENCODE_SET.length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۤۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m4745(Object obj) {
        if (C0009.m276() < 0) {
            return ((h8.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۨۥ۟, reason: not valid java name and contains not printable characters */
    public static int m4746(Object obj) {
        if (C0052.m1890() >= 0) {
            return ((ViewGroup) obj).getNestedScrollAxes();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۨ, reason: contains not printable characters */
    public static Locale[] m4747() {
        if (C0135.m5274() < 0) {
            return mf.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۤۢ, reason: contains not printable characters */
    public static long m4748(Object obj) {
        if (C0062.m2326() > 0) {
            return ((js) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۣۣۨ, reason: contains not printable characters */
    public static int m4750(Object obj) {
        if (C0079.m3072() < 0) {
            return ((u7) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۥ۠ۢ, reason: contains not printable characters */
    public static List m4751() {
        if (C0224.m8861() <= 0) {
            return d6.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۨۢ, reason: contains not printable characters */
    public static void m4752(Object obj, Object obj2) {
        if (C0057.m2142() > 0) {
            ((Cursor) obj).unregisterContentObserver((ContentObserver) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۧۤ۠, reason: contains not printable characters */
    public static PropertyValuesHolder m4753(Object obj, Object obj2) {
        if (C0066.m2514() >= 0) {
            return PropertyValuesHolder.ofKeyframe((String) obj, (Keyframe[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۢ۟, reason: contains not printable characters */
    public static void m4754(Object obj, int i) {
        if (C0141.m5769() >= 0) {
            ((TextView) obj).setTextColor(i);
        }
    }

    /* JADX INFO: renamed from: ۦۣ۟ۨ, reason: contains not printable characters */
    public static Object m4755(Object obj) {
        if (C0128.m5064() <= 0) {
            return ((da) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۥۡ, reason: contains not printable characters */
    public static void m4756(Object obj, Object obj2, Object obj3, int i, int i2) {
        if (C0095.m3478() <= 0) {
            ((e1) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj2, (AttributeSet) obj3, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۦۢۢ۟, reason: contains not printable characters */
    public static ContentInfo.Builder m4757(Object obj, Object obj2) {
        if (C0079.m3072() <= 0) {
            return ((ContentInfo.Builder) obj).setExtras((Bundle) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۢ۠, reason: contains not printable characters */
    public static int m4758(Object obj) {
        if (C0053.m1959() >= 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۧۨۤ, reason: contains not printable characters */
    public static Class m4759(Object obj) {
        if (C0095.m3478() < 0) {
            return ((gk) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static float m4760(Object obj) {
        if (C0069.m2756() < 0) {
            return ((e3) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۧۥۨ۠, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m4761(int i, Object obj) {
        if (C0249.m10052() < 0) {
            return s7.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, (PorterDuff.Mode) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۤۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4762(Object obj) {
        if (C0162.m6837() < 0) {
            return ((lg.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۨۢ, reason: not valid java name and contains not printable characters */
    public static void m4763(Object obj, Object obj2, int i, int i2) {
        if (C0078.m3044() <= 0) {
            ((PackageManager) obj).setComponentEnabledSetting((ComponentName) obj2, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۨۨۤۤ, reason: not valid java name and contains not printable characters */
    public static void m4764(Object obj, Object obj2) {
        if (C0093.m3365() > 0) {
            ((a) obj).M0((Parcelable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۢۧۨ, reason: contains not printable characters */
    public static String m4749(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
