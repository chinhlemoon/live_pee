package androidx.annotation;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.hardware.Camera;
import android.support.v4.graphics.drawable.C0011;
import android.transition.Transition;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EdgeEffect;
import android.widget.Switch;
import android.widget.TextView;
import androidx.activity.C0014;
import androidx.activity.C0017;
import androidx.activity.C0021;
import androidx.appcompat.app.C0036;
import androidx.appcompat.view.menu.C0039;
import androidx.appcompat.view.menu.C0040;
import androidx.core.app.C0052;
import androidx.core.app.C0053;
import androidx.core.app.C0055;
import androidx.core.content.C0057;
import androidx.core.graphics.drawable.C0064;
import androidx.drawerlayout.widget.C0070;
import androidx.drawerlayout.widget.C0072;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0083;
import androidx.fragment.app.C0097;
import androidx.fragment.app.C0099;
import androidx.lifecycle.C0107;
import androidx.lifecycle.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.lifecycle.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0126;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0133;
import androidx.versionedparcelable.C0135;
import com.example.vcam.C0141;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.HookMain;
import com.example.vcam.LicenseManager;
import com.example.vcam.Menu;
import com.example.vcam.VideoToFrames;
import com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.aa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.c9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ca;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.da;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.im;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.oi;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yg;
import java.io.ByteArrayOutputStream;
import java.lang.ref.Reference;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.C0238;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.C0227;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0195;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.internal.ws.C0224;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0231;
import okhttp3.logging.C0232;
import okhttp3.logging.C0235;
import org.xmlpull.v1.XmlPullParser;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/* JADX INFO: renamed from: androidx.annotation.ۣۧۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0031 {

    /* JADX INFO: renamed from: ۣۡۨۨ, reason: not valid java name and contains not printable characters */
    public static int f30 = 420;

    /* JADX INFO: renamed from: ۟۟۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static int m1083(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۟ۢۦۤ, reason: not valid java name and contains not printable characters */
    public static m m1084(Object obj) {
        if (C0072.m2856() <= 0) {
            return ((v0) obj).C0();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static Object m1085() {
        if (C0097.m3659() > 0) {
            return l9.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static Object m1086(Object obj) {
        if (C0064.m2388() >= 0) {
            return ((AtomicReference) obj).get();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m1087(Object obj, Object obj2) {
        if (C0191.m7812() >= 0) {
            ((VideoToFrames) obj).decode((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۢۧۦ, reason: not valid java name and contains not printable characters */
    public static Object m1088(Object obj) {
        if (C0232.m9299() >= 0) {
            return ((Queue) obj).poll();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static Switch m1089(Object obj) {
        if (C0201.m8184() <= 0) {
            return Menu.m5636((Menu) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۦۦ, reason: not valid java name and contains not printable characters */
    public static int m1090(Object obj) {
        if (C0195.m7914() > 0) {
            return ((xs) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۤۡۨ, reason: not valid java name and contains not printable characters */
    public static void m1091(Object obj, Object obj2) {
        if (C0053.m1959() >= 0) {
            ((View) obj).onPopulateAccessibilityEvent((AccessibilityEvent) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۥۥۧ, reason: not valid java name and contains not printable characters */
    public static void m1092(Object obj, int i, Object obj2, Object obj3) {
        if (C0040.m1622() < 0) {
            Menu.m5624((Menu) obj, i, (ConnectionBlocker.BlockRule) obj2, (View) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۦ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m1093(Object obj) {
        if (C0025.m934() > 0) {
            return ((TextView) obj).getPaddingTop();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۧۦۤ, reason: not valid java name and contains not printable characters */
    public static void m1094(Object obj, Object obj2) {
        if (C0171.m7136() <= 0) {
            ((xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).f((xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۢۨۢ, reason: not valid java name and contains not printable characters */
    public static int[] m1095(Object obj) {
        if (C0225.m9001() > 0) {
            return ((jq) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۨۦ, reason: not valid java name and contains not printable characters */
    public static void m1096(Object obj, Object obj2) {
        if (C0162.m6837() < 0) {
            ((r7) obj).setTintList((ColorStateList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static WindowInsets m1097(Object obj, Object obj2) {
        if (C0227.m9046() > 0) {
            return wr.c.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj, (WindowInsets) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨ۠ۥ, reason: not valid java name and contains not printable characters */
    public static ArrayList m1098(Object obj) {
        if (C0039.m1515() <= 0) {
            return ((aa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static long m1099(long j, long j2) {
        if (C0070.m2829() <= 0) {
            return tl.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(j, j2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۧۧ۠, reason: not valid java name and contains not printable characters */
    public static Reference m1100(Object obj) {
        if (C0224.m8861() < 0) {
            return ((d8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static List m1101(Object obj) {
        if (C0078.m3044() <= 0) {
            return ((View) obj).getSystemGestureExclusionRects();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m1102(Object obj, char c, int i, boolean z) {
        if (C0213.m8458() > 0) {
            return mo.I((CharSequence) obj, c, i, z);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۡۧۢ, reason: not valid java name and contains not printable characters */
    public static ScalarsConverterFactory m1103() {
        if (C0055.m2054() > 0) {
            return ScalarsConverterFactory.create();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۡۡ, reason: not valid java name and contains not printable characters */
    public static void m1104(Object obj, Object obj2, Object obj3, float f, Object obj4) {
        if (C0017.m627() > 0) {
            m0.i((ValueAnimator) obj, (TypedArray) obj2, (TypedArray) obj3, f, (XmlPullParser) obj4);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۥۧۤ, reason: not valid java name and contains not printable characters */
    public static String m1105(Object obj, int i) {
        if (C0083.m3188() < 0) {
            return ((Resources) obj).getResourceEntryName(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧ۠, reason: not valid java name and contains not printable characters */
    public static ComponentName m1106(Object obj) {
        if (C0083.m3188() <= 0) {
            return ((Activity) obj).getComponentName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۥۡ, reason: not valid java name and contains not printable characters */
    public static l2.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m1107(Object obj) {
        if (C0014.m545() >= 0) {
            return ((j2) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۠ۧ, reason: not valid java name and contains not printable characters */
    public static wn m1108(Object obj) {
        if (C0135.m5274() < 0) {
            return ((wn) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۢ, reason: not valid java name and contains not printable characters */
    public static void m1109(Object obj) {
        if (C0219.m8794() >= 0) {
            jd.m((String) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۡۦۦ, reason: not valid java name and contains not printable characters */
    public static Request m1110(Object obj, Object obj2, Object obj3) {
        if (C0194.m7889() < 0) {
            return null;
        }
        return C0231.m9264((xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj, (Response) obj3);
    }

    /* JADX INFO: renamed from: ۟ۦۢۨۡ, reason: not valid java name and contains not printable characters */
    public static void m1111(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        if (C0225.m9001() >= 0) {
            wr.g.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj, (Context) obj2, (int[]) obj3, (AttributeSet) obj4, (TypedArray) obj5, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static Transition m1112(Object obj, Object obj2) {
        if (C0023.m843() >= 0) {
            return ((Transition) obj).addTarget((View) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡ۠, reason: not valid java name and contains not printable characters */
    public static void m1113(Object obj) {
        if (C0176.m7290() > 0) {
            ((vn) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢۧ, reason: not valid java name and contains not printable characters */
    public static Drawable m1114(Object obj, Object obj2, Object obj3) {
        if (C0057.m2142() > 0) {
            return ((Drawable.ConstantState) obj).newDrawable((Resources) obj2, (Resources.Theme) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۦۣ, reason: not valid java name and contains not printable characters */
    public static void m1115(Object obj, Object obj2, long j, boolean z) {
        if (C0036.m1332() <= 0) {
            ((f2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((f2) obj2, j, z);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static void m1116(Object obj, Object obj2) {
        if (C0107.m3883() > 0) {
            HookMain.a.m5413((HookMain.a) obj);
        }
    }

    /* JADX INFO: renamed from: ۠ۤۧۦ, reason: not valid java name and contains not printable characters */
    public static xo m1117() {
        if (C0064.m2388() >= 0) {
            return C0161.m6758();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۦۢ, reason: not valid java name and contains not printable characters */
    public static void m1118(Object obj, Object obj2) {
        if (C0112.m4054() < 0) {
            wr.d.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((WindowInsets) obj, (View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۨ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m1119(Object obj) {
        if (C0178.m7344() <= 0) {
            return ((k1.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static xs m1120(Object obj, Object obj2, Object obj3) {
        if (C0238.m9653() >= 0) {
            return ((uj) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj2, (xs) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۢۡ, reason: not valid java name and contains not printable characters */
    public static void m1121(Object obj) {
        if (C0235.m9535() <= 0) {
            u0.x((u0) obj);
        }
    }

    /* JADX INFO: renamed from: ۣۡۢۨ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m1122(Object obj) {
        if (C0149.m6476() < 0) {
            return ((pr.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۤ۠, reason: not valid java name and contains not printable characters */
    public static Menu m1123(Object obj) {
        if (C0232.m9299() > 0) {
            return ((yg) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۥۧ, reason: not valid java name and contains not printable characters */
    public static boolean m1124(Object obj) {
        if (C0164.m6900() <= 0) {
            return ((Drawable) obj).isStateful();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۥ۠ۨ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m1125(Object obj, int i, Object obj2) {
        if (C0099.m3752() < 0) {
            return im.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Resources) obj, i, (Resources.Theme) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۢۢ, reason: not valid java name and contains not printable characters */
    public static void m1126(Object obj) {
        if (C0181.m7445() > 0) {
            ((LicenseManager) obj).w();
        }
    }

    /* JADX INFO: renamed from: ۢ۟ۦۡ, reason: not valid java name and contains not printable characters */
    public static String m1127(String str) {
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

    /* JADX INFO: renamed from: ۢۢۦۣ, reason: not valid java name and contains not printable characters */
    public static d8 m1128(Object obj) {
        if (C0011.m458() >= 0) {
            return ((h8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m1129(Object obj) {
        if (C0120.m4608() > 0) {
            return C0201.m8186((ConnectionBlocker) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۡ۟, reason: not valid java name and contains not printable characters */
    public static void m1130(Object obj, float f, float f2) {
        if (C0025.m934() >= 0) {
            ((EdgeEffect) obj).onPull(f, f2);
        }
    }

    /* JADX INFO: renamed from: ۤۡۥۣ, reason: not valid java name and contains not printable characters */
    public static CharSequence m1131(Object obj) {
        if (C0194.m7889() > 0) {
            return ((MenuItem) obj).getTooltipText();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۨۦ, reason: not valid java name and contains not printable characters */
    public static c9.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m1132(Object obj) {
        if (C0215.m8604() <= 0) {
            return ((c9) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۨۡ, reason: contains not printable characters */
    public static int m1133(Object obj) {
        if (C0176.m7290() >= 0) {
            return ((oi) obj).a();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۠ۢۦ, reason: contains not printable characters */
    public static short m1134(Object obj) {
        if (C0148.m6464() < 0) {
            return ((vl) obj).m();
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: ۥۤۢۦ, reason: contains not printable characters */
    public static un m1135(Object obj) {
        if (C0227.m9046() > 0) {
            return sj.b((Socket) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۦ۠, reason: contains not printable characters */
    public static Paint m1136(Object obj) {
        if (C0231.m9265() > 0) {
            return ((pr.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۢۡ, reason: contains not printable characters */
    public static void m1137(Object obj, Object obj2) {
        if (C0021.m740() <= 0) {
            ((xd) obj).K((Throwable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۨۡۧ, reason: contains not printable characters */
    public static Method m1138() {
        if (C0141.m5769() > 0) {
            return tk.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۢۨ, reason: contains not printable characters */
    public static SubMenu m1139(Object obj) {
        if (C0052.m1890() >= 0) {
            return ((MenuItem) obj).getSubMenu();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static String m1140(int i) {
        if (C0036.m1332() < 0) {
            return String.valueOf(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۢۡ, reason: not valid java name and contains not printable characters */
    public static void m1141(Object obj, boolean z) {
        if (C0126.m4908() <= 0) {
            ((rr) obj).q(z);
        }
    }

    /* JADX INFO: renamed from: ۨ۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static da m1142(Object obj) {
        if (C0115.m4218() <= 0) {
            return ((ca) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۢۨ, reason: not valid java name and contains not printable characters */
    public static pq m1143() {
        if (C0107.m3883() > 0) {
            return pq.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۧۨ, reason: not valid java name and contains not printable characters */
    public static void m1144(Object obj, int i) {
        if (C0128.m5064() <= 0) {
            ((f6.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).a(i);
        }
    }

    /* JADX INFO: renamed from: ۨۢۨۨ, reason: not valid java name and contains not printable characters */
    public static int[] m1145(Object obj) {
        if (C0188.m7736() <= 0) {
            return ((HookMain.u.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۦۤ, reason: not valid java name and contains not printable characters */
    public static int m1146(Object obj) {
        if (C0187.m7613() > 0) {
            return ((Camera.Parameters) obj).getPreviewFrameRate();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۦۢۧ, reason: not valid java name and contains not printable characters */
    public static int m1148() {
        return (-300) ^ C0011.f11;
    }

    /* JADX INFO: renamed from: ۨۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m1149(Object obj) {
        if (C0232.m9299() > 0) {
            return ((LicenseManager.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۤ۟, reason: not valid java name and contains not printable characters */
    public static Set m1150(Object obj) {
        if (C0133.m5208() < 0) {
            return ((lg) obj).e();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۡۨ, reason: not valid java name and contains not printable characters */
    public static String m1147(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
