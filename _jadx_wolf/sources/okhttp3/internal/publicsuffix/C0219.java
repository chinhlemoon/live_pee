package okhttp3.internal.publicsuffix;

import android.animation.Keyframe;
import android.app.Activity;
import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.support.v4.app.C0002;
import android.support.v4.app.C0006;
import android.util.AttributeSet;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.CheckedTextView;
import android.widget.OverScroller;
import androidx.activity.C0014;
import androidx.activity.C0020;
import androidx.activity.C0021;
import androidx.annotation.C0024;
import androidx.annotation.C0025;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0034;
import androidx.appcompat.view.menu.C0039;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.C0047;
import androidx.core.app.C0055;
import androidx.core.graphics.drawable.C0064;
import androidx.core.graphics.drawable.C0065;
import androidx.core.graphics.drawable.C0066;
import androidx.core.widget.C0068;
import androidx.fragment.app.C0096;
import androidx.fragment.app.C0099;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0119;
import androidx.savedstate.C0123;
import androidx.versionedparcelable.C0129;
import androidx.versionedparcelable.C0133;
import androidx.versionedparcelable.C0135;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ii;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.im;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ud;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.stream.IntStream;
import okhttp3.C0238;
import okhttp3.C0239;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.C0227;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.ws.C0224;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0233;
import okhttp3.logging.C0234;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: okhttp3.internal.publicsuffix.ۤۧ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0219 {

    /* JADX INFO: renamed from: ۣۥۥ, reason: not valid java name and contains not printable characters */
    public static int f669 = -398;

    /* JADX INFO: renamed from: ۟۟۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static void m8774(Object obj, Object obj2) {
        if (C0200.m8104() <= 0) {
            ((ActionProvider) obj).onPrepareSubMenu((SubMenu) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static ThreadLocal m8775() {
        if (C0200.m8104() <= 0) {
            return wr.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m8776(Object obj, Object obj2) {
        if (C0161.m6744() >= 0) {
            return ((ArrayList) obj).addAll((Collection) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۧۨۥ, reason: not valid java name and contains not printable characters */
    public static void m8777(Object obj, Object obj2) {
        if (C0188.m7736() < 0) {
            u0.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj, (LocaleList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static MenuItem m8778(Object obj, Object obj2) {
        if (C0164.m6900() < 0) {
            return ((vo) obj).setActionView((View) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۥۢ, reason: not valid java name and contains not printable characters */
    public static boolean m8779(Object obj) {
        if (C0047.m1663() < 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static int m8781(Object obj, Object obj2, Object obj3) {
        if (C0021.m740() < 0) {
            return ((AppOpsManager) obj).noteProxyOp((String) obj2, (String) obj3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۦۤۨ, reason: not valid java name and contains not printable characters */
    public static Base64.Encoder m8782() {
        if (C0014.m545() >= 0) {
            return Base64.getUrlEncoder();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۦ۟, reason: not valid java name and contains not printable characters */
    public static int m8783(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡ۠, reason: not valid java name and contains not printable characters */
    public static boolean m8784(Object obj, int i, int i2) {
        if (C0129.m5108() >= 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).o(i, i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۥۧۨ, reason: not valid java name and contains not printable characters */
    public static VelocityTracker m8785() {
        if (C0238.m9653() > 0) {
            return VelocityTracker.obtain();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static m9.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m8786(Object obj, Object obj2) {
        if (C0099.m3752() < 0) {
            return m9.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((XmlPullParser) obj, (Resources) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۡۡ, reason: not valid java name and contains not printable characters */
    public static long m8787(Object obj, int i, int i2) {
        if (C0164.m6900() < 0) {
            return lr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj, i, i2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۣۢۡ, reason: not valid java name and contains not printable characters */
    public static Keyframe m8788(float f, float f2) {
        if (C0002.m72() >= 0) {
            return Keyframe.ofFloat(f, f2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۦۡ, reason: not valid java name and contains not printable characters */
    public static int m8789(Object obj) {
        if (C0068.m2650() > 0) {
            return ((yf) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣۧ, reason: not valid java name and contains not printable characters */
    public static long m8790(Object obj, Object obj2, long j) {
        if (C0119.m4573() >= 0) {
            return ((uc) obj).read((s2) obj2, j);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۦۦۥ, reason: not valid java name and contains not printable characters */
    public static Object m8791(Object obj, Object obj2, Object obj3) {
        if (C0233.m9365() <= 0) {
            return ((HashMap) obj).put(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m8792(Object obj, Object obj2, int i) {
        if (C0181.m7445() >= 0) {
            return ((v0) obj).r0((Context) obj2, i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۢ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m8793(Object obj, Object obj2) {
        if (C0133.m5208() < 0) {
            ud.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((y5) obj, (CancellationException) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m8794() {
        return (-744) ^ C0238.f688;
    }

    /* JADX INFO: renamed from: ۟ۧۥۢۧ, reason: not valid java name and contains not printable characters */
    public static int m8795(Object obj) {
        if (C0225.m9001() > 0) {
            return ((Configuration) obj).navigation;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۦۢۡ, reason: not valid java name and contains not printable characters */
    public static int m8796(int i) {
        if (C0214.m8575() < 0) {
            return Color.alpha(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۦۧۨ, reason: not valid java name and contains not printable characters */
    public static void m8797(Object obj) {
        if (C0117.m4419() < 0) {
            im.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Resources.Theme) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۧۧۧ, reason: not valid java name and contains not printable characters */
    public static Void m8798(Object obj) {
        if (C0021.m740() < 0) {
            return ((n8) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m8799(Object obj) {
        if (C0201.m8184() <= 0) {
            return ((yf) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۦ۟۠, reason: not valid java name and contains not printable characters */
    public static ResponseBody m8800(Object obj) {
        if (C0064.m2388() >= 0) {
            return ((Response) obj).body();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۣۧ, reason: not valid java name and contains not printable characters */
    public static boolean m8801(Object obj, int i, int i2, int i3, int i4) {
        if (C0213.m8458() >= 0) {
            return ((zr) obj).m(i, i2, i3, i4);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۢۡۡ, reason: not valid java name and contains not printable characters */
    public static String m8802(Object obj) {
        if (C0123.m4841() <= 0) {
            return ((ResponseBody) obj).string();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۡۤ, reason: not valid java name and contains not printable characters */
    public static Typeface m8803(Object obj) {
        if (m8794() >= 0) {
            return Typeface.createFromFile((File) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۤۥ, reason: not valid java name and contains not printable characters */
    public static void m8804(Object obj) {
        if (C0188.m7736() <= 0) {
            ((k3) obj).g();
        }
    }

    /* JADX INFO: renamed from: ۣۣۡ۠, reason: not valid java name and contains not printable characters */
    public static List m8805(Object obj) {
        if (C0020.m701() >= 0) {
            return ((l2) obj).d();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۨ, reason: not valid java name and contains not printable characters */
    public static float m8806(Object obj) {
        if (C0148.m6464() <= 0) {
            return ((l1) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۡۧۧۢ, reason: not valid java name and contains not printable characters */
    public static void m8807(Object obj, Object obj2) {
        if (C0024.m896() > 0) {
            hs.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ViewParent) obj, (View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢ۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static ComponentName m8808(Object obj, Object obj2) {
        if (C0227.m9046() >= 0) {
            return ((Intent) obj).resolveActivity((PackageManager) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۤۤ, reason: not valid java name and contains not printable characters */
    public static Typeface m8809(Object obj, Object obj2, Object obj3) {
        if (C0225.m9001() >= 0) {
            return ((zq) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj2, (InputStream) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۤۥ, reason: not valid java name and contains not printable characters */
    public static Object m8810(Object obj) {
        if (C0047.m1663() <= 0) {
            return ((j) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m8811(Object obj, boolean z, int i, Object obj2) {
        if (C0116.m4340() > 0) {
            s8.X((s8) obj, z, i, obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۡۢۨ, reason: not valid java name and contains not printable characters */
    public static Method m8812(Object obj) {
        if (C0161.m6744() >= 0) {
            return ((kp.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static IntStream m8813(Object obj) {
        if (C0234.m9461() < 0) {
            return ((CharSequence) obj).codePoints();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۥۡ, reason: not valid java name and contains not printable characters */
    public static void m8814(Object obj, Object obj2, int i) {
        if (C0217.m8693() < 0) {
            v.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Activity) obj, (String[]) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۣۢۧۥ, reason: not valid java name and contains not printable characters */
    public static boolean m8815(Object obj, Object obj2) {
        if (C0014.m545() > 0) {
            return lg.g((Map) obj, (Collection) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۥۦۣ, reason: not valid java name and contains not printable characters */
    public static String m8816(int i) {
        if (C0096.m3601() < 0) {
            return xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۣ, reason: not valid java name and contains not printable characters */
    public static void m8817(Object obj, Object obj2) {
        if (C0025.m934() >= 0) {
            ii.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((MenuItem) obj, (PorterDuff.Mode) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۦۧۤ, reason: not valid java name and contains not printable characters */
    public static CharSequence m8818(Object obj) {
        if (C0066.m2514() >= 0) {
            return ((MenuItem) obj).getContentDescription();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m8819(Object obj) {
        if (C0113.m4144() <= 0) {
            return ((p0) obj).c();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨۢ۠, reason: not valid java name and contains not printable characters */
    public static AppCompatButton m8820(Object obj, Object obj2, Object obj3) {
        if (C0239.m9805() <= 0) {
            return ((m1) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj2, (AttributeSet) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۢۢ, reason: not valid java name and contains not printable characters */
    public static void m8821(Object obj, Object obj2) {
        if (C0034.m1206() < 0) {
            t3.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((CheckedTextView) obj, (PorterDuff.Mode) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۤۥۣ, reason: not valid java name and contains not printable characters */
    public static void m8822(Object obj, boolean z) {
        if (C0218.m8760() >= 0) {
            ((a8.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(z);
        }
    }

    /* JADX INFO: renamed from: ۤۨۨۨ, reason: not valid java name and contains not printable characters */
    public static String m8823(String str) {
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

    /* JADX INFO: renamed from: ۥۣۥۤ, reason: contains not printable characters */
    public static String m8824(Object obj) {
        if (C0055.m2054() >= 0) {
            return ((Activity) obj).getPackageName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۦۡ, reason: contains not printable characters */
    public static int m8825(Object obj) {
        if (C0201.m8184() <= 0) {
            return ((OverScroller) obj).getCurrX();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦ۠ۡ۠, reason: contains not printable characters */
    public static char m8826(Object obj) {
        if (C0006.m169() <= 0) {
            return ((uo.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).h;
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: ۦۣۡۤ, reason: contains not printable characters */
    public static xs m8827(Object obj, Object obj2) {
        if (C0135.m5274() < 0) {
            return xs.k((WindowInsets) obj, (View) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۢۧ, reason: contains not printable characters */
    public static int m8828(Object obj) {
        if (C0224.m8861() < 0) {
            return ((Configuration) obj).keyboardHidden;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۥ۠۟, reason: contains not printable characters */
    public static float m8829(Object obj, int i, float f, float f2, float f3) {
        if (C0039.m1515() < 0) {
            return ((m2) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, f, f2, f3);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۦۥۦۨ, reason: contains not printable characters */
    public static androidx.emoji2.text.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m8830(Object obj) {
        if (C0002.m72() >= 0) {
            return ((d8) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡۨ۠, reason: not valid java name and contains not printable characters */
    public static Object m8831(Object obj, Object obj2) {
        if (C0239.m9805() <= 0) {
            return ((uo) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۧۧ, reason: not valid java name and contains not printable characters */
    public static boolean m8832(Object obj) {
        if (C0065.m2448() > 0) {
            return ((u7) obj).d();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m8833() {
        if (C0047.m1663() < 0) {
            return Build.PRODUCT;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static boolean m8834(Object obj) {
        if (C0065.m2448() > 0) {
            return ((jr) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۡۧۢ, reason: not valid java name and contains not printable characters */
    public static boolean m8835(Object obj, Object obj2) {
        if (C0202.m8245() >= 0) {
            return ((ArrayList) obj).add(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨۤۢ, reason: not valid java name and contains not printable characters */
    public static void m8836(Object obj, Object obj2, Object obj3) {
        if (C0025.m934() > 0) {
            ((k3) obj).c((qa) obj2, (Throwable) obj3);
        }
    }

    /* JADX INFO: renamed from: ۨۥۤ۠, reason: not valid java name and contains not printable characters */
    public static int m8837(Object obj) {
        if (C0099.m3752() < 0) {
            return ((Drawable) obj).getMinimumHeight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۨۧۡ, reason: not valid java name and contains not printable characters */
    public static dn m8838(Object obj, int i) {
        if (C0031.m1148() <= 0) {
            return ((dn) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۨۢ, reason: not valid java name and contains not printable characters */
    public static String m8780(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
