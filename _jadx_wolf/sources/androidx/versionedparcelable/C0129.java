package androidx.versionedparcelable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.support.v4.app.C0002;
import android.support.v4.app.C0004;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0011;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.activity.C0020;
import androidx.activity.C0021;
import androidx.annotation.C0024;
import androidx.annotation.C0031;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.C0035;
import androidx.appcompat.app.C0036;
import androidx.appcompat.view.menu.C0039;
import androidx.appcompat.view.menu.b;
import androidx.appcompat.view.menu.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.appcompat.view.menu.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.appcompat.view.menu.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.appcompat.widget.C0047;
import androidx.core.app.C0053;
import androidx.core.app.C0055;
import androidx.core.content.C0057;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0065;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0070;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0079;
import androidx.emoji2.text.C0083;
import androidx.emoji2.text.C0084;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0096;
import androidx.fragment.app.C0099;
import androidx.lifecycle.C0107;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0118;
import androidx.savedstate.C0122;
import androidx.savedstate.C0123;
import androidx.savedstate.C0127;
import com.example.vcam.HookMain;
import com.example.vcam.LicenseManager;
import com.example.vcam.Menu;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ad;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.c3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ii;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ks;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.up;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xb;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zb;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.internal.C0227;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.io.C0195;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0232;
import okhttp3.logging.C0233;
import okhttp3.logging.C0236;
import org.json.JSONObject;

/* JADX INFO: renamed from: androidx.versionedparcelable.۟ۤۦۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0129 {

    /* JADX INFO: renamed from: ۟ۥ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static int f108 = -896;

    /* JADX INFO: renamed from: ۣۣ۟۟۠, reason: not valid java name and contains not printable characters */
    public static void m5100(Object obj, Object obj2, int i) {
        if (C0188.m7736() < 0) {
            ((l1) obj).g((AttributeSet) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۡۨۡ, reason: not valid java name and contains not printable characters */
    public static String m5101(Object obj, Object obj2, Object obj3) {
        if (C0065.m2448() > 0) {
            return String.format((Locale) obj, (String) obj2, (Object[]) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static xb m5102() {
        if (C0002.m72() >= 0) {
            return xb.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۢۦ, reason: not valid java name and contains not printable characters */
    public static void m5103(Object obj) {
        if (C0218.m8760() > 0) {
            ((h8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).c();
        }
    }

    /* JADX INFO: renamed from: ۟۟ۢۦ۠, reason: not valid java name and contains not printable characters */
    public static int m5104(Object obj, Object obj2) {
        if (C0096.m3601() <= 0) {
            return ((Spannable) obj).getSpanFlags(obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۥ۠ۨ, reason: not valid java name and contains not printable characters */
    public static mf m5105(Object obj) {
        if (C0199.m7998() < 0) {
            return mf.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Locale[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۡ۟, reason: not valid java name and contains not printable characters */
    public static void m5106(Object obj) {
        if (C0225.m9001() > 0) {
            kq.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۦ۟ۢ, reason: not valid java name and contains not printable characters */
    public static i8 m5107(Object obj) {
        if (C0035.m1268() < 0) {
            return ((a8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨۤ۠, reason: not valid java name and contains not printable characters */
    public static int m5108() {
        return 108 ^ C0002.f2;
    }

    /* JADX INFO: renamed from: ۟۟ۨۥ۠, reason: not valid java name and contains not printable characters */
    public static View m5109(Object obj) {
        if (C0024.m896() > 0) {
            return ((v0.k) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۡۤ, reason: not valid java name and contains not printable characters */
    public static boolean m5110(Object obj) {
        if (C0123.m4841() < 0) {
            return ((dn) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۤۢۨ, reason: not valid java name and contains not printable characters */
    public static Context m5111(Object obj) {
        if (C0232.m9299() > 0) {
            return ((l1) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Bundle m5112(Object obj) {
        if (C0148.m6464() < 0) {
            return i.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((AccessibilityNodeInfo) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۨۧ, reason: not valid java name and contains not printable characters */
    public static void m5113(Object obj, int i) {
        if (C0213.m8458() >= 0) {
            m7.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((l7) obj, i);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m5114(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0191.m7812() >= 0) {
            return C0181.m7470((LicenseManager) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤ۟۟, reason: not valid java name and contains not printable characters */
    public static void m5115(Object obj, Object obj2) {
        if (C0227.m9046() > 0) {
            ((BitmapDrawable) obj).setTileModeX((Shader.TileMode) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠۟, reason: not valid java name and contains not printable characters */
    public static void m5116(Object obj, Object obj2) {
        if (C0055.m2054() > 0) {
            k1.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TextView) obj, (Locale) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۡۥۦ, reason: not valid java name and contains not printable characters */
    public static int m5117(Object obj) {
        if (C0078.m3044() < 0) {
            return ((Menu.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۤ, reason: not valid java name and contains not printable characters */
    public static qk m5118() {
        if (C0079.m3072() < 0) {
            return rk.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۡ۠, reason: not valid java name and contains not printable characters */
    public static Interpolator m5119(Object obj) {
        if (C0115.m4218() < 0) {
            return ((ks) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m5120(Object obj) {
        if (C0057.m2142() >= 0) {
            ((AppCompatActivity) obj).I();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧ۟, reason: not valid java name and contains not printable characters */
    public static int m5121(Object obj, int i, int i2) {
        if (C0213.m8458() >= 0) {
            return ((String) obj).lastIndexOf(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static Locale m5122(Object obj) {
        if (C0225.m9001() > 0) {
            return ((TextPaint) obj).getTextLocale();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۢۥ, reason: not valid java name and contains not printable characters */
    public static long[] m5123(Object obj) {
        if (C0123.m4841() <= 0) {
            return ((xf) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۤ۠, reason: not valid java name and contains not printable characters */
    public static kl m5124() {
        if (C0036.m1332() <= 0) {
            return kl.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static p7 m5125(Object obj, boolean z, boolean z2, Object obj2, int i, Object obj3) {
        if (C0047.m1663() <= 0) {
            return rd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((rd) obj, z, z2, (qa) obj2, i, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۠ۢ, reason: not valid java name and contains not printable characters */
    public static Resources m5126() {
        if (C0039.m1515() <= 0) {
            return Resources.getSystem();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۠ۨ, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m5127(Object obj) {
        if (C0058.m2184() >= 0) {
            return ((s0) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۦۧ, reason: not valid java name and contains not printable characters */
    public static List m5128(Object obj) {
        if (C0083.m3188() <= 0) {
            return ((Menu.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۢۡ, reason: not valid java name and contains not printable characters */
    public static MenuItem m5129(Object obj, char c, int i) {
        if (C0127.m4950() > 0) {
            return ii.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.c((MenuItem) obj, c, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۢۧ, reason: not valid java name and contains not printable characters */
    public static void m5130(Object obj, boolean z) {
        if (C0202.m8245() > 0) {
            ((xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).l(z);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣۤۧ, reason: not valid java name and contains not printable characters */
    public static b m5131(Object obj, Object obj2) {
        if (C0233.m9365() <= 0) {
            return ((xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ViewGroup) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۦۦ, reason: not valid java name and contains not printable characters */
    public static void m5132(Object obj, int i) {
        if (C0169.m7034() <= 0) {
            ((Spinner) obj).setSelection(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۧ۠۠, reason: not valid java name and contains not printable characters */
    public static void m5133(Object obj, Object obj2) {
        if (C0006.m169() < 0) {
            ((HookMain) obj).I((Context) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۤۨ, reason: not valid java name and contains not printable characters */
    public static hd m5134(Object obj) {
        if (C0123.m4841() < 0) {
            return ((d7.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۨ۟, reason: not valid java name and contains not printable characters */
    public static void m5135(Object obj, Object obj2) {
        if (C0211.m8341() >= 0) {
            wr.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.e((View) obj, (Runnable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۨۢ۟, reason: not valid java name and contains not printable characters */
    public static Looper m5136() {
        if (C0062.m2326() > 0) {
            return Looper.myLooper();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static int m5137(Object obj, Object obj2, int i, int i2) {
        if (C0107.m3883() > 0) {
            return d4.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((List) obj, (Comparable) obj2, i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۥۦۨ, reason: not valid java name and contains not printable characters */
    public static v0 m5138(Object obj) {
        if (C0217.m8693() < 0) {
            return v0.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static View m5139(Object obj) {
        if (C0188.m7736() <= 0) {
            return ((m1) obj).i();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static CharSequence m5140(Object obj) {
        if (C0225.m9001() > 0) {
            return TextUtils.concat((CharSequence[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۢۢ, reason: not valid java name and contains not printable characters */
    public static int m5141(Object obj) {
        if (C0148.m6464() <= 0) {
            return ((rr) obj).g();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m5142(Object obj, int i) {
        if (C0195.m7914() >= 0) {
            ((l1) obj).d(i);
        }
    }

    /* JADX INFO: renamed from: ۠ۥۢۡ, reason: not valid java name and contains not printable characters */
    public static v0.g m5143(Object obj, Object obj2) {
        if (C0020.m701() >= 0) {
            return ((v0) obj).f0((Context) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۨۡ, reason: not valid java name and contains not printable characters */
    public static ad.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m5144(Object obj) {
        if (C0069.m2756() < 0) {
            return ad.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۡۦ, reason: not valid java name and contains not printable characters */
    public static boolean m5145(Object obj) {
        if (C0240.m9826() > 0) {
            return ((ColorStateList) obj).isStateful();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۧۤۤ, reason: not valid java name and contains not printable characters */
    public static boolean m5146(Object obj, Object obj2) {
        if (C0118.m4454() > 0) {
            return ((List) obj).remove(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۡۡۧ, reason: not valid java name and contains not printable characters */
    public static int m5147(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡۤۡۢ, reason: not valid java name and contains not printable characters */
    public static boolean m5148(Object obj) {
        if (C0219.m8794() > 0) {
            return wr.f.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۦۥ, reason: not valid java name and contains not printable characters */
    public static boolean m5149(Object obj) {
        if (C0002.m72() >= 0) {
            return ((Class) obj).isPrimitive();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۧۨۥ, reason: not valid java name and contains not printable characters */
    public static boolean m5150(Object obj) {
        if (C0047.m1663() <= 0) {
            return ((f6) obj).t();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۢۧۦ, reason: not valid java name and contains not printable characters */
    public static Parcel m5151(Object obj) {
        if (C0122.m4736() < 0) {
            return ((sr) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m5152(Object obj, Object obj2) {
        if (C0171.m7136() <= 0) {
            ((e) obj).f((e.a) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۦۤۦ, reason: not valid java name and contains not printable characters */
    public static Field m5153() {
        if (C0031.m1148() <= 0) {
            return wr.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۧۤ, reason: not valid java name and contains not printable characters */
    public static void m5154(Object obj) {
        if (C0094.m3450() >= 0) {
            ((TextPaint) obj).reset();
        }
    }

    /* JADX INFO: renamed from: ۣۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m5155(Object obj) {
        if (C0135.m5274() < 0) {
            return wr.a.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۤۡۡ, reason: not valid java name and contains not printable characters */
    public static int m5156(Object obj) {
        if (C0214.m8575() < 0) {
            return ((d7.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۤۤ, reason: not valid java name and contains not printable characters */
    public static TextView m5157(Object obj) {
        if (C0099.m3752() <= 0) {
            return ((k1) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۥۦ, reason: not valid java name and contains not printable characters */
    public static void m5158(Object obj, Object obj2) {
        if (C0011.m458() >= 0) {
            ((Spinner) obj).setOnItemSelectedListener((AdapterView.OnItemSelectedListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static int m5159(Object obj, int i) {
        if (C0118.m4454() >= 0) {
            return m9.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TypedArray) obj, i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۧۤۤ, reason: not valid java name and contains not printable characters */
    public static HookMain m5160(Object obj) {
        if (C0024.m896() >= 0) {
            return ((zb) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۢ۟, reason: contains not printable characters */
    public static boolean m5161(Object obj) {
        if (C0215.m8604() < 0) {
            return ((xs.d) obj).c();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۡۤۦ, reason: contains not printable characters */
    public static boolean m5162(Object obj, Object obj2) {
        if (C0161.m6744() > 0) {
            return ((Window.Callback) obj).onSearchRequested((SearchEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۦۤۦ, reason: contains not printable characters */
    public static JSONObject m5163(Object obj, Object obj2, int i) {
        if (C0031.m1148() < 0) {
            return ((JSONObject) obj).put((String) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۣۧ, reason: contains not printable characters */
    public static void m5164(Object obj, Object obj2, Object obj3) {
        if (C0236.m9615() > 0) {
            ((wr.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj2, obj3);
        }
    }

    /* JADX INFO: renamed from: ۥۦۨۨ, reason: contains not printable characters */
    public static String m5165(String str) {
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

    /* JADX INFO: renamed from: ۥۨ۠ۤ, reason: contains not printable characters */
    public static int m5166(Object obj, Object obj2, int i) {
        if (C0070.m2829() < 0) {
            return ((ColorStateList) obj).getColorForState((int[]) obj2, i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦ۟۟ۢ, reason: contains not printable characters */
    public static void m5167(Object obj, Object obj2) {
        if (C0093.m3365() >= 0) {
            ((AccessibilityNodeInfo) obj).addAction((AccessibilityNodeInfo.AccessibilityAction) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۢ۟ۦ, reason: contains not printable characters */
    public static WeakHashMap m5168(Object obj) {
        if (C0122.m4736() <= 0) {
            return ((wr.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۢۢ, reason: contains not printable characters */
    public static int m5169(Object obj) {
        if (C0036.m1332() < 0) {
            return ((f8) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۦۥۢ, reason: contains not printable characters */
    public static boolean m5170(Object obj, int i, Object obj2, int i2) {
        if (C0232.m9299() > 0) {
            return ((xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).performShortcut(i, (KeyEvent) obj2, i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۧۥ, reason: contains not printable characters */
    public static up m5171(Object obj, long j) {
        if (C0021.m740() <= 0) {
            return ((up) obj).deadlineNanoTime(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨ۠ۥ, reason: contains not printable characters */
    public static int m5172(Object obj, Object obj2, Object obj3, int i) {
        if (C0053.m1959() >= 0) {
            return ((j0.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).t((int[]) obj2, (Drawable) obj3, i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۣۨۧ, reason: contains not printable characters */
    public static n9.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m5173(Object obj) {
        if (C0116.m4340() > 0) {
            return ((c3) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m5174(Object obj) {
        if (C0133.m5208() < 0) {
            return ((m) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۡۢۦ, reason: not valid java name and contains not printable characters */
    public static void m5175(Object obj, Object obj2) {
        if (C0200.m8104() < 0) {
            ((View) obj).setOnLongClickListener((View.OnLongClickListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۧۢۦ, reason: not valid java name and contains not printable characters */
    public static String m5176() {
        if (C0204.m8270() < 0) {
            return "۠ۦۣ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۧۦ, reason: not valid java name and contains not printable characters */
    public static void m5177(Object obj) {
        if (C0084.m3253() < 0) {
            ((p2) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۧۧۤ, reason: not valid java name and contains not printable characters */
    public static float m5178(Object obj) {
        if (C0047.m1663() <= 0) {
            return ((pr.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).e;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۨۡۧۧ, reason: not valid java name and contains not printable characters */
    public static int m5179(Object obj) {
        if (C0122.m4736() < 0) {
            return ((AtomicInteger) obj).decrementAndGet();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨۢۢ, reason: not valid java name and contains not printable characters */
    public static void m5180(Object obj, boolean z) {
        if (C0211.m8341() >= 0) {
            wr.W((View) obj, z);
        }
    }

    /* JADX INFO: renamed from: ۨۨۧۨ, reason: not valid java name and contains not printable characters */
    public static int m5182(Object obj) {
        if (C0004.m139() < 0) {
            return ((sm) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۦۡۤ, reason: not valid java name and contains not printable characters */
    public static String m5181(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
