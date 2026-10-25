package okhttp3.internal.proxy;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.hardware.Camera;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.C0002;
import android.support.v4.app.C0004;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0009;
import android.support.v4.graphics.drawable.C0010;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputContentInfo;
import android.widget.TextView;
import androidx.activity.C0014;
import androidx.activity.C0017;
import androidx.activity.C0020;
import androidx.annotation.C0023;
import androidx.annotation.C0024;
import androidx.annotation.C0025;
import androidx.appcompat.app.C0037;
import androidx.appcompat.view.menu.C0039;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.C0047;
import androidx.core.app.C0053;
import androidx.core.app.C0055;
import androidx.core.content.C0057;
import androidx.core.widget.C0068;
import androidx.drawerlayout.widget.C0070;
import androidx.drawerlayout.widget.C0072;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0079;
import androidx.emoji2.text.C0083;
import androidx.emoji2.text.C0084;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0097;
import androidx.fragment.app.C0099;
import androidx.fragment.app.a;
import androidx.lifecycle.C0106;
import androidx.lifecycle.C0107;
import androidx.lifecycle.C0108;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0118;
import androidx.profileinstaller.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.savedstate.C0122;
import androidx.savedstate.C0126;
import androidx.savedstate.C0127;
import androidx.versionedparcelable.C0133;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.HookMain;
import com.example.vcam.LicenseManager;
import com.example.vcam.VideoToFrames;
import com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.aa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bt;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.cr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.el;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gi;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.id;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ik;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ls;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ok;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.C0238;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.logging.C0231;
import okhttp3.logging.C0235;
import okhttp3.logging.C0236;

/* JADX INFO: renamed from: okhttp3.internal.proxy.ۣ۠۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0211 {

    /* JADX INFO: renamed from: ۣۧۥ۠, reason: not valid java name and contains not printable characters */
    public static int f661 = -419;

    /* JADX INFO: renamed from: ۣ۟۟۠۟, reason: not valid java name and contains not printable characters */
    public static void m8332(Object obj) {
        if (C0039.m1515() < 0) {
            ((xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۟۟۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static ThreadLocal m8333() {
        if (C0040.m1622() <= 0) {
            return ik.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m8334(Object obj, float f, float f2) {
        if (C0116.m4340() > 0) {
            return ((View) obj).dispatchNestedPreFling(f, f2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۥ۠ۦ, reason: not valid java name and contains not printable characters */
    public static r7.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m8335(Object obj) {
        if (C0218.m8760() > 0) {
            return ((r7) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧۥۡ, reason: not valid java name and contains not printable characters */
    public static ConnectionBlocker.NetworkLog m8336(Object obj) {
        if (C0200.m8104() < 0) {
            return ((j5) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m8337(Object obj) {
        if (C0079.m3072() < 0) {
            return ((v0) obj).L;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠۠ۦۥ, reason: not valid java name and contains not printable characters */
    public static Uri m8338(Object obj) {
        if (C0176.m7290() > 0) {
            return ((InputContentInfo) obj).getLinkUri();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۨۨ, reason: not valid java name and contains not printable characters */
    public static int m8339(Object obj) {
        if (C0006.m169() < 0) {
            return ((vo) obj).getAlphabeticModifiers();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۥۨۢ, reason: not valid java name and contains not printable characters */
    public static byte[] m8340() {
        if (C0219.m8794() >= 0) {
            return el.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۢۦ, reason: not valid java name and contains not printable characters */
    public static int m8341() {
        return 352 ^ C0078.f69;
    }

    /* JADX INFO: renamed from: ۟۠ۨ۟۟, reason: not valid java name and contains not printable characters */
    public static boolean m8342(Object obj) {
        if (C0079.m3072() <= 0) {
            return ((i) obj).x();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۨۡۧ, reason: not valid java name and contains not printable characters */
    public static void m8343(Object obj, int i, Object obj2) {
        if (C0014.m545() >= 0) {
            ((xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.InterfaceC0111x3839ecd2) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static boolean m8344(Object obj) {
        if (C0078.m3044() <= 0) {
            return aa.d((List) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۢ۠۠, reason: not valid java name and contains not printable characters */
    public static int[] m8345() {
        if (C0106.m3835() >= 0) {
            return mp.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۥ۠, reason: not valid java name and contains not printable characters */
    public static boolean m8346(Object obj, Object obj2, int i, Object obj3) {
        if (C0200.m8104() <= 0) {
            return ((h) obj).b((View) obj2, i, (Bundle) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢ۠۠۠, reason: not valid java name and contains not printable characters */
    public static rp m8347(Object obj) {
        if (C0010.m354() < 0) {
            return ((sp) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m8348() {
        if (C0188.m7736() < 0) {
            return "ۣ۟ۨ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢ۟, reason: not valid java name and contains not printable characters */
    public static Paint.Join m8349() {
        if (C0093.m3365() >= 0) {
            return Paint.Join.ROUND;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۢ, reason: not valid java name and contains not printable characters */
    public static boolean m8350(Object obj) {
        if (C0097.m3659() > 0) {
            return ((zr) obj).l;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m8351(Object obj, Object obj2) {
        if (C0199.m7998() <= 0) {
            kp.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TextView) obj, (PorterDuff.Mode) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m8352(Object obj, Object obj2) {
        if (C0188.m7736() <= 0) {
            return ((p0) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Drawable) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧۡ, reason: not valid java name and contains not printable characters */
    public static void m8353(Object obj, Object obj2) {
        if (C0218.m8760() > 0) {
            v0.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Configuration) obj, (Locale) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤ۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m8354(Object obj) {
        if (C0108.m4038() > 0) {
            return ((rp) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۡۧۢ, reason: not valid java name and contains not printable characters */
    public static Object m8355(Object obj) {
        if (C0094.m3450() > 0) {
            return ((p1.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۥۢ, reason: not valid java name and contains not printable characters */
    public static Animator m8356(Object obj) {
        if (C0099.m3752() <= 0) {
            return ((Animator) obj).clone();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۢ۟, reason: not valid java name and contains not printable characters */
    public static void m8357(Object obj, int i) {
        if (C0107.m3883() >= 0) {
            ((p2) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۢۧۧ, reason: not valid java name and contains not printable characters */
    public static int m8358(int i) {
        if (C0039.m1515() <= 0) {
            return n5.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣۤۧ, reason: not valid java name and contains not printable characters */
    public static String m8359(Object obj) {
        if (C0024.m896() > 0) {
            return ((m1.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۥ, reason: not valid java name and contains not printable characters */
    public static int m8360(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۥۨۧ۠, reason: not valid java name and contains not printable characters */
    public static void m8361(Object obj) {
        if (C0083.m3188() <= 0) {
            lm.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Resources) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static Object m8362(Object obj, Object obj2) {
        if (C0037.m1437() <= 0) {
            return ((h2) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static xs.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m8363(Object obj) {
        if (C0231.m9265() > 0) {
            return ((xs.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۢۤ, reason: not valid java name and contains not printable characters */
    public static Object m8364(Object obj, int i) {
        if (C0023.m843() >= 0) {
            return ((wn) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۥ۟, reason: not valid java name and contains not printable characters */
    public static boolean m8365(Object obj, Object obj2) {
        if (C0017.m627() >= 0) {
            return ((pr.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((int[]) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۢۦۢ, reason: not valid java name and contains not printable characters */
    public static HookMain.i m8366(Object obj) {
        if (C0164.m6900() <= 0) {
            return ((HookMain.i.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m8367(Object obj) {
        if (C0068.m2650() > 0) {
            return ((u7) obj).e;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۣۧ, reason: not valid java name and contains not printable characters */
    public static AppCompatRadioButton m8368(Object obj, Object obj2, Object obj3) {
        if (C0235.m9535() < 0) {
            return ((m1) obj).c((Context) obj2, (AttributeSet) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m8369(Object obj, Object obj2) {
        if (C0020.m701() >= 0) {
            C0113.m4160((LicenseManager) obj, (String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static CharSequence m8370(Object obj, int i) {
        if (C0068.m2650() > 0) {
            return ((zp) obj).g(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m8371(Object obj, float f) {
        if (C0084.m3253() < 0) {
            ((TextPaint) obj).setTextSize(f);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۢۥۧ, reason: not valid java name and contains not printable characters */
    public static float m8372(Object obj) {
        if (C0181.m7445() > 0) {
            return ((TypedValue) obj).getFloat();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m8373(Object obj) {
        if (C0014.m545() > 0) {
            return VideoToFrames.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Image) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۥۥ, reason: not valid java name and contains not printable characters */
    public static String m8374(Object obj, int i) {
        if (C0218.m8760() >= 0) {
            return ((String) obj).substring(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۡۢ, reason: not valid java name and contains not printable characters */
    public static id[] m8375(Object obj, int i) {
        if (C0133.m5208() < 0) {
            return ((id.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۦۦ, reason: not valid java name and contains not printable characters */
    public static void m8376(Object obj) {
        if (C0004.m139() < 0) {
            ((InvocationTargetException) obj).printStackTrace();
        }
    }

    /* JADX INFO: renamed from: ۠۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static Window.Callback m8377(Object obj) {
        if (C0072.m2856() < 0) {
            return ((v0) obj).k0();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static MenuItem m8378(Object obj, boolean z) {
        if (C0231.m9265() >= 0) {
            return ((MenuItem) obj).setVisible(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static void m8379(Object obj, Object obj2) {
        if (C0002.m72() >= 0) {
            ((AnimatorSet) obj).playSequentially((Animator[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m8380(Object obj, Object obj2) throws IOException {
        if (C0127.m4950() >= 0) {
            ((Camera) obj).setPreviewTexture((SurfaceTexture) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۢۡۦ, reason: not valid java name and contains not printable characters */
    public static float m8381(Object obj) {
        if (C0238.m9653() > 0) {
            return ((View) obj).getZ();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static char m8382(Object obj, int i) {
        if (C0236.m9615() >= 0) {
            return ((CharSequence) obj).charAt(i);
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static int m8383(Object obj, Object obj2) {
        if (C0161.m6744() >= 0) {
            return ((Spannable) obj).getSpanEnd(obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۧۧ۟, reason: not valid java name and contains not printable characters */
    public static void m8384(Object obj) throws IOException {
        if (C0070.m2829() < 0) {
            ((Closeable) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۠ۧۧۡ, reason: not valid java name and contains not printable characters */
    public static void m8385(Object obj, Object obj2) {
        if (C0240.m9826() >= 0) {
            ((ls) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۨۤۦ, reason: not valid java name and contains not printable characters */
    public static void m8386(Object obj) {
        if (C0202.m8245() >= 0) {
            jd.j((String) obj);
        }
    }

    /* JADX INFO: renamed from: ۡۦۥۧ, reason: not valid java name and contains not printable characters */
    public static xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.InterfaceC0111x3839ecd2 m8387(Object obj) {
        if (C0068.m2650() >= 0) {
            return ((yk) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۧ۠, reason: not valid java name and contains not printable characters */
    public static int m8388(Object obj) {
        if (C0106.m3835() >= 0) {
            return ((bt) obj).getChangingConfigurations();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۡۡۢ, reason: not valid java name and contains not printable characters */
    public static int m8389(Object obj) {
        if (C0116.m4340() >= 0) {
            return ((v0.g) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۡۡۦ, reason: not valid java name and contains not printable characters */
    public static Drawable m8390(Object obj, int i) {
        if (C0126.m4908() < 0) {
            return ((DrawableContainer.DrawableContainerState) obj).getChild(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۤ۟, reason: not valid java name and contains not printable characters */
    public static boolean m8391(Object obj, Object obj2) {
        if (C0118.m4454() >= 0) {
            return ((t8) obj).j0((Runnable) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۤۧ۟, reason: not valid java name and contains not printable characters */
    public static int m8392(Object obj) {
        if (C0068.m2650() > 0) {
            return ((gd) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۦۤۢ, reason: not valid java name and contains not printable characters */
    public static int m8393(Object obj, Object obj2, int i, int i2, Object obj3) {
        if (C0231.m9265() >= 0) {
            return ok.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj, (String) obj2, i, i2, (String) obj3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۧۥۡ, reason: not valid java name and contains not printable characters */
    public static void m8394(Object obj) {
        if (C0122.m4736() <= 0) {
            ((k1) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۢۨۥ۠, reason: not valid java name and contains not printable characters */
    public static Bundle m8395(Object obj) {
        if (C0238.m9653() >= 0) {
            return ((vm) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static cr m8396() {
        if (C0053.m1959() >= 0) {
            return cr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۢۥ, reason: not valid java name and contains not printable characters */
    public static v0 m8397(Object obj) {
        if (C0169.m7034() <= 0) {
            return v0.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۤۦ, reason: not valid java name and contains not printable characters */
    public static Object m8398(Object obj, Object obj2, Object obj3) {
        if (C0161.m6744() > 0) {
            return ((ConcurrentHashMap) obj).put(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۢ۟, reason: not valid java name and contains not printable characters */
    public static void m8399(Object obj, Object obj2) {
        if (C0187.m7613() > 0) {
            p1.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.m6168((p1.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj, (Runnable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۨۦۦ, reason: not valid java name and contains not printable characters */
    public static boolean m8400(Object obj, Object obj2) {
        if (C0107.m3883() > 0) {
            return ((a1) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((KeyListener) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static Matrix m8401(Object obj) {
        if (C0162.m6837() < 0) {
            return ((View) obj).getMatrix();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۦ۠, reason: not valid java name and contains not printable characters */
    public static String m8402(String str) {
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

    /* JADX INFO: renamed from: ۤۢۤۨ, reason: not valid java name and contains not printable characters */
    public static boolean m8403(Object obj) {
        if (C0093.m3365() >= 0) {
            return ((x9) obj).c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m8404(Object obj) {
        if (C0201.m8184() < 0) {
            return ((wn) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۤۤۡ, reason: not valid java name and contains not printable characters */
    public static Field m8405() {
        if (C0236.m9615() > 0) {
            return x.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨ۟۟, reason: not valid java name and contains not printable characters */
    public static Random m8406(Object obj) {
        if (C0118.m4454() > 0) {
            return ((d) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public static void m8407(Object obj, Object obj2) {
        if (C0017.m627() > 0) {
            ((TextView) obj).setFilters((InputFilter[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۣۧۤ, reason: contains not printable characters */
    public static String m8408(Object obj) {
        if (C0117.m4419() < 0) {
            return ((NoSuchAlgorithmException) obj).getMessage();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۧ۟, reason: contains not printable characters */
    public static Uri.Builder m8409(Object obj, Object obj2) {
        if (C0057.m2142() >= 0) {
            return ((Uri.Builder) obj).appendPath((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤ۟۟, reason: contains not printable characters */
    public static void m8410(Object obj, Object obj2) {
        if (C0009.m276() < 0) {
            ((xs) obj).g((xs) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۥۥۢ, reason: contains not printable characters */
    public static long m8411(Object obj) {
        if (C0055.m2054() >= 0) {
            return ((gi) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static pr.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m8412(Object obj) {
        if (C0176.m7290() > 0) {
            return ((pr.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۦۦ, reason: not valid java name and contains not printable characters */
    public static void m8413(Object obj) {
        if (C0176.m7290() > 0) {
            ((a) obj).E();
        }
    }

    /* JADX INFO: renamed from: ۧۤۤۢ, reason: not valid java name and contains not printable characters */
    public static boolean m8414(Object obj, Object obj2) {
        if (C0178.m7344() <= 0) {
            return ((bf) obj).S((Runnable) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m8415(Object obj) {
        if (C0047.m1663() < 0) {
            ((l3.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۨۤ۟۠, reason: not valid java name and contains not printable characters */
    public static float m8416(Object obj) {
        if (C0025.m934() >= 0) {
            return ((Number) obj).floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۨۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m8417(Object obj, Object obj2) {
        if (C0070.m2829() <= 0) {
            return vs.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Window.Callback) obj, (SearchEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m8419(Object obj) {
        if (C0040.m1622() < 0) {
            return ((LicenseManager) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m8418(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
