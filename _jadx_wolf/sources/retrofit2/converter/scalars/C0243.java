package retrofit2.converter.scalars;

import android.animation.Animator;
import android.app.Activity;
import android.app.Dialog;
import android.content.ClipDescription;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.C0002;
import android.support.v4.app.C0004;
import android.support.v4.graphics.drawable.C0011;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.activity.C0014;
import androidx.activity.C0017;
import androidx.annotation.C0025;
import androidx.annotation.C0026;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0034;
import androidx.appcompat.app.C0036;
import androidx.appcompat.app.C0037;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.core.app.C0052;
import androidx.core.app.C0053;
import androidx.core.app.C0055;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0065;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0072;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0079;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0095;
import androidx.fragment.app.C0096;
import androidx.fragment.app.C0097;
import androidx.fragment.app.C0099;
import androidx.lifecycle.C0106;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0118;
import androidx.profileinstaller.C0119;
import androidx.savedstate.C0122;
import androidx.savedstate.C0123;
import androidx.savedstate.C0127;
import com.example.vcam.C0141;
import com.example.vcam.HookMain;
import com.example.vcam.LicenseManager;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.Cif;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.aq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.b4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.c3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.je;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.js;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kb;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ki;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ls;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.md;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ne;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.nq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.oi;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.or;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.we;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xo;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.zip.Inflater;
import okhttp3.HttpUrl;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0195;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0231;
import okhttp3.logging.C0232;
import okhttp3.logging.C0236;
import org.xmlpull.v1.XmlPullParser;
import retrofit2.C0259;

/* JADX INFO: renamed from: retrofit2.converter.scalars.۟۟ۧۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0243 {

    /* JADX INFO: renamed from: ۨۢۥۥ, reason: not valid java name and contains not printable characters */
    public static int f693 = 340;

    /* JADX INFO: renamed from: ۟۟۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static Class m9893(Object obj) {
        if (C0095.m3478() <= 0) {
            return ((wr.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m9894(Object obj, Object obj2, Object obj3) {
        if (C0037.m1437() <= 0) {
            return ((String) obj).replace((CharSequence) obj2, (CharSequence) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static void m9895(Object obj, int i, Object obj2) {
        if (C0055.m2054() >= 0) {
            ((oi) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, (ByteBuffer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static boolean m9896(Object obj) {
        if (C0112.m4054() < 0) {
            return ((o) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۥۦۥ, reason: not valid java name and contains not printable characters */
    public static Method m9897(Object obj) {
        if (C0106.m3835() > 0) {
            return x.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Class) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m9898(Object obj, Object obj2, int i, int i2) {
        if (C0119.m4573() >= 0) {
            return ((Inflater) obj).inflate((byte[]) obj2, i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static Context m9899(Object obj) {
        if (C0096.m3601() < 0) {
            return ((qq) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static boolean m9900(Object obj, Object obj2) {
        if (C0002.m72() >= 0) {
            return ((CopyOnWriteArrayList) obj).add(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۥۣۢ, reason: not valid java name and contains not printable characters */
    public static void m9901(Object obj) {
        if (C0194.m7889() > 0) {
            ((lg) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static void m9902(Object obj, Object obj2, Object obj3) {
        if (C0072.m2856() <= 0) {
            ((Bundle) obj).putBinder((String) obj2, (IBinder) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static ClipDescription m9903(Object obj) {
        if (C0079.m3072() < 0) {
            return ((bd.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m9904(Object obj) {
        if (C0078.m3044() < 0) {
            return ((je) obj).isConst();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۦ, reason: not valid java name and contains not printable characters */
    public static u0 m9905(Object obj, Object obj2) {
        if (C0211.m8341() >= 0) {
            return u0.a((Dialog) obj, (q0) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۨۨ, reason: not valid java name and contains not printable characters */
    public static String m9906(Object obj, char c, Object obj2, int i) {
        if (C0204.m8270() < 0) {
            return mo.i0((String) obj, c, (String) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.AccessibilityAction m9907() {
        if (C0037.m1437() <= 0) {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۧ, reason: not valid java name and contains not printable characters */
    public static Object m9908(Object obj, Object obj2) {
        if (C0079.m3072() <= 0) {
            return ((l7) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۢ۠, reason: not valid java name and contains not printable characters */
    public static boolean m9909(Object obj) {
        if (C0036.m1332() <= 0) {
            return wr.x((View) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۦۧ۟, reason: not valid java name and contains not printable characters */
    public static Executor m9910(Object obj) {
        if (C0172.m7180() > 0) {
            return ((p1.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۨۥ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m9911(Object obj) {
        if (C0025.m934() > 0) {
            return ((ImageView) obj).getImageTintList();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧ۠۠, reason: not valid java name and contains not printable characters */
    public static void m9912(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2, Object obj5) {
        if (C0096.m3601() <= 0) {
            ((pr.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((pr.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2, (pr.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj3, (Canvas) obj4, i, i2, (ColorFilter) obj5);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static View m9913(Object obj) {
        if (C0053.m1959() > 0) {
            return ((ki.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static xo m9914() {
        if (C0169.m7034() <= 0) {
            return vf.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۤ, reason: not valid java name and contains not printable characters */
    public static int[] m9915(Object obj) {
        if (C0204.m8270() < 0) {
            return ((ListView) obj).getDrawableState();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۡ۟, reason: not valid java name and contains not printable characters */
    public static int m9916(Object obj, int i) {
        if (C0200.m8104() < 0) {
            return ((LayerDrawable) obj).getLayerInsetRight(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۨ۠ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m9917(Object obj, boolean z) {
        if (C0058.m2184() > 0) {
            return ((Future) obj).cancel(z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m9918(Object obj, Object obj2) {
        if (C0236.m9615() >= 0) {
            ((aq) obj).setSupportCompoundDrawablesTintMode((PorterDuff.Mode) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static int m9919(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static Resources m9920(Object obj) {
        if (C0040.m1622() < 0) {
            return ((s5) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۦ۟, reason: not valid java name and contains not printable characters */
    public static Object m9921(Object obj) {
        if (C0161.m6744() > 0) {
            return ((i7) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥ۠ۡ, reason: not valid java name and contains not printable characters */
    public static Method m9922() {
        if (C0004.m139() <= 0) {
            return vq.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static v0 m9923(Object obj) {
        if (C0122.m4736() < 0) {
            return v0.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦۧ, reason: not valid java name and contains not printable characters */
    public static int m9924(Object obj) {
        if (C0095.m3478() <= 0) {
            return ((TextView) obj).getMaxLines();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۦۥ, reason: not valid java name and contains not printable characters */
    public static Window m9925(Object obj) {
        if (C0127.m4950() >= 0) {
            return ((Activity) obj).getWindow();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۣۤ, reason: not valid java name and contains not printable characters */
    public static LicenseManager m9926(Object obj) {
        if (C0162.m6837() < 0) {
            return ((we) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۧ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.AccessibilityAction m9927() {
        if (C0200.m8104() <= 0) {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۢۦ, reason: not valid java name and contains not printable characters */
    public static WindowInsets m9928(Object obj, Object obj2, Object obj3) {
        if (C0191.m7812() > 0) {
            return ((View) obj).computeSystemWindowInsets((WindowInsets) obj2, (Rect) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۤ۟, reason: not valid java name and contains not printable characters */
    public static qa m9929(Object obj) {
        if (C0187.m7613() >= 0) {
            return ((md) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۨۤ, reason: not valid java name and contains not printable characters */
    public static void m9930(Object obj, int i) {
        if (C0096.m3601() < 0) {
            ((ImageView) obj).setImageResource(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۡ۟۟, reason: not valid java name and contains not printable characters */
    public static void m9931(Object obj, int i, Object obj2, boolean z, Object obj3) {
        if (C0195.m7914() > 0) {
            ((v0) obj).S0(i, (mf) obj2, z, (Configuration) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۣۤ, reason: not valid java name and contains not printable characters */
    public static void m9932(Object obj, int i) {
        if (C0200.m8104() < 0) {
            ((Drawable) obj).setAlpha(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static Drawable m9933(Object obj) {
        if (C0017.m627() > 0) {
            return ((ImageView) obj).getDrawable();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m9934(Object obj, Object obj2, Object obj3) {
        if (C0031.m1148() < 0) {
            ((xd) obj).h((sc) obj2, obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۡۧۥ, reason: not valid java name and contains not printable characters */
    public static Animator m9935(Object obj, Object obj2, Object obj3, Object obj4, float f) {
        if (C0219.m8794() > 0) {
            return m0.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj, (Resources) obj2, (Resources.Theme) obj3, (XmlPullParser) obj4, f);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢ۠ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m9936(Object obj, Object obj2) {
        if (C0069.m2756() <= 0) {
            return ((k3) obj).e((Throwable) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static HookMain.u.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m9937(Object obj) {
        if (C0036.m1332() < 0) {
            return ((mc) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۦۢ, reason: not valid java name and contains not printable characters */
    public static StaticLayout.Builder m9938(Object obj, Object obj2) {
        if (C0225.m9001() >= 0) {
            return ((StaticLayout.Builder) obj).setTextDirection((TextDirectionHeuristic) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m9939(Object obj, Object obj2) {
        if (C0176.m7290() >= 0) {
            q7.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Drawable) obj, (ColorStateList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static js m9940(Object obj, Object obj2) {
        if (C0052.m1890() >= 0) {
            return ((js) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ls) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۦۢ, reason: not valid java name and contains not printable characters */
    public static boolean m9941(Object obj, Object obj2) {
        if (C0093.m3365() >= 0) {
            return ((or) obj).setState((int[]) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۤ۟۟, reason: not valid java name and contains not printable characters */
    public static Rect m9942(Object obj) {
        if (C0055.m2054() > 0) {
            return ((v0) obj).Y;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m9943(Object obj) {
        if (C0026.m1047() > 0) {
            return ((ActionBarContainer) obj).d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡ۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static Cif m9944(Object obj) {
        if (C0002.m72() >= 0) {
            return ((hf) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۥۦ, reason: not valid java name and contains not printable characters */
    public static SubMenu m9945(Object obj, int i) {
        if (C0025.m934() >= 0) {
            return ((SubMenu) obj).setHeaderTitle(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۥۤ, reason: not valid java name and contains not printable characters */
    public static void m9946(Object obj, Object obj2) {
        if (C0118.m4454() > 0) {
            ((l1) obj).n((TypedArray) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m9947(Object obj) {
        if (C0231.m9265() > 0) {
            return ((v9) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۢۥۥ, reason: not valid java name and contains not printable characters */
    public static float m9948(Object obj, Object obj2) {
        if (C0259.m10136() >= 0) {
            return ((Paint) obj).measureText((String) obj2);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۢۦۨۦ, reason: not valid java name and contains not printable characters */
    public static Looper m9949(Object obj) {
        if (C0231.m9265() > 0) {
            return ((Activity) obj).getMainLooper();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠۟, reason: not valid java name and contains not printable characters */
    public static int m9950(Object obj) {
        if (C0017.m627() >= 0) {
            return ((o5.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۡۦ, reason: not valid java name and contains not printable characters */
    public static void m9951(Object obj, int i, int i2) {
        if (C0099.m3752() < 0) {
            ((Rect) obj).offsetTo(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۣۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static Iterator m9952(Object obj) {
        if (C0011.m458() > 0) {
            return ((nq.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۧ۠, reason: not valid java name and contains not printable characters */
    public static String m9953(Object obj) {
        if (C0099.m3752() <= 0) {
            return ((j9) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۨۨ, reason: not valid java name and contains not printable characters */
    public static void m9954(Object obj, Object obj2, Object obj3) {
        if (C0164.m6900() < 0) {
            ((h) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj2, (AccessibilityEvent) obj3);
        }
    }

    /* JADX INFO: renamed from: ۤ۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean m9955(Object obj, Object obj2) {
        if (C0123.m4841() < 0) {
            return ((HashSet) obj).contains(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static String m9956(String str) {
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
        while (str.length() > 0) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(-2)) << 4) | string.indexOf(str.charAt(-1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i2 = 0; i2 < length; i2++) {
            byteArray[i2] = (byte) (byteArray[i2] ^ str2.charAt(i2 % length2));
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۣۤ۟۟, reason: not valid java name and contains not printable characters */
    public static int m9957(Object obj) {
        if (C0225.m9001() > 0) {
            return ((dm.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.C0143x35d57e31) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟ۥۨ, reason: contains not printable characters */
    public static boolean m9959(Object obj, int i, Object obj2, Object obj3) {
        if (C0195.m7914() >= 0) {
            return ((Window.Callback) obj).onPreparePanel(i, (View) obj2, (Menu) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۢۥۡ, reason: contains not printable characters */
    public static Class m9960() {
        if (C0113.m4144() < 0) {
            return uq.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤ۟ۢ, reason: contains not printable characters */
    public static void m9961(Object obj) {
        if (C0014.m545() >= 0) {
            ((v0) obj).N0();
        }
    }

    /* JADX INFO: renamed from: ۥۦۧ۠, reason: contains not printable characters */
    public static Handler m9962(Object obj) {
        if (C0202.m8245() >= 0) {
            return ((c3) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۦۧ, reason: contains not printable characters */
    public static l9.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m9963(Object obj, Object obj2, Object obj3, int i) {
        if (C0232.m9299() > 0) {
            return l9.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj, (Context) obj2, (j9) obj3, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۥۥ, reason: contains not printable characters */
    public static int m9964() {
        return 275 ^ C0182.f632;
    }

    /* JADX INFO: renamed from: ۦۧ۠ۤ, reason: contains not printable characters */
    public static void m9965(Object obj, Object obj2, Object obj3) {
        if (C0065.m2448() > 0) {
            ((Bundle) obj).putParcelable((String) obj2, (Parcelable) obj3);
        }
    }

    /* JADX INFO: renamed from: ۧ۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static boolean m9966(Object obj, Object obj2) {
        if (C0034.m1206() <= 0) {
            return ne.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj, (KeyEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۡۦۡ, reason: not valid java name and contains not printable characters */
    public static boolean m9967(Object obj) {
        if (C0176.m7290() >= 0) {
            return wr.y((View) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۧۢۡ, reason: not valid java name and contains not printable characters */
    public static Object[] m9968() {
        if (C0069.m2756() < 0) {
            return b4.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۨۡ, reason: not valid java name and contains not printable characters */
    public static float m9969(Object obj) {
        if (C0055.m2054() > 0) {
            return ((pr.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۧۨۡ, reason: not valid java name and contains not printable characters */
    public static DecimalFormatSymbols m9970(Object obj) {
        if (C0141.m5769() >= 0) {
            return kp.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Locale) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m9971(Object obj, Object obj2, float f, float f2, boolean z) {
        if (C0195.m7914() > 0) {
            return ((ViewParent) obj).onNestedFling((View) obj2, f, f2, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۨۢ, reason: not valid java name and contains not printable characters */
    public static kb m9972(Object obj) {
        if (C0011.m458() >= 0) {
            return ((kb) obj).V();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۡۥ, reason: not valid java name and contains not printable characters */
    public static Window m9973(Object obj) {
        if (C0097.m3659() > 0) {
            return ((Dialog) obj).getWindow();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۤۢ, reason: not valid java name and contains not printable characters */
    public static float m9974(Object obj) {
        if (C0191.m7812() >= 0) {
            return ((pr.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).b;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۨۨۦ۟, reason: not valid java name and contains not printable characters */
    public static void m9975(Object obj, Object obj2, Object obj3) {
        if (C0034.m1206() < 0) {
            ((u0) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj2, (ViewGroup.LayoutParams) obj3);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۤۨ, reason: contains not printable characters */
    public static String m9958(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
