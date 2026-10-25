package androidx.core.content;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Insets;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Binder;
import android.os.Parcel;
import android.provider.Settings;
import android.support.v4.app.C0002;
import android.support.v4.app.C0004;
import android.support.v4.graphics.drawable.C0010;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.C0014;
import androidx.activity.C0017;
import androidx.activity.C0020;
import androidx.annotation.C0024;
import androidx.appcompat.app.C0034;
import androidx.appcompat.app.C0037;
import androidx.appcompat.view.menu.C0039;
import androidx.appcompat.view.menu.C0040;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0051;
import androidx.core.app.C0053;
import androidx.core.graphics.drawable.C0065;
import androidx.core.graphics.drawable.C0066;
import androidx.core.widget.C0068;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0079;
import androidx.emoji2.text.C0083;
import androidx.emoji2.text.C0084;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0095;
import androidx.fragment.app.C0096;
import androidx.fragment.app.C0099;
import androidx.lifecycle.C0106;
import androidx.lifecycle.C0107;
import androidx.lifecycle.C0108;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0119;
import androidx.savedstate.C0126;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0129;
import androidx.versionedparcelable.C0133;
import com.example.vcam.C0141;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.HookMain;
import com.example.vcam.LicenseManager;
import com.example.vcam.Menu;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.b3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.b7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.cc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.g6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.g7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.iq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.nf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.of;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ph;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.re;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.us;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zs;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.annotation.Annotation;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.zip.Deflater;
import okhttp3.C0238;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.internal.C0227;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.logging.C0231;
import okhttp3.logging.C0233;
import okhttp3.logging.C0236;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import retrofit2.converter.scalars.C0243;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: androidx.core.content.ۥۢۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0058 {

    /* JADX INFO: renamed from: ۤۢۢ۠, reason: not valid java name and contains not printable characters */
    public static int f52 = 92;

    /* JADX INFO: renamed from: ۣ۟۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static Context m2153(Object obj) {
        if (C0188.m7736() <= 0) {
            return ((HookMain) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static float m2154(Object obj) {
        if (C0095.m3478() < 0) {
            return ((us) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟۟ۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m2155(Object obj) {
        if (C0188.m7736() < 0) {
            o6.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((t5) obj);
        }
    }

    /* JADX INFO: renamed from: ۟۠۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static Locale[] m2156() {
        if (C0017.m627() >= 0) {
            return nf.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static Uri m2157(Object obj) {
        if (C0066.m2514() > 0) {
            return ((o5.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۣ۠, reason: not valid java name and contains not printable characters */
    public static void m2158(Object obj, Object obj2) {
        if (C0004.m139() <= 0) {
            ((View) obj).setLayerPaint((Paint) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۧۥ۠, reason: not valid java name and contains not printable characters */
    public static void m2159(Object obj, boolean z) {
        if (C0037.m1437() <= 0) {
            ((pr) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(z);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۨ۠۟, reason: not valid java name and contains not printable characters */
    public static m2 m2160(Object obj, boolean z) {
        if (C0233.m9365() < 0) {
            return ((m2) obj).e(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۡۢ, reason: not valid java name and contains not printable characters */
    public static void m2161(Object obj) {
        if (C0126.m4908() < 0) {
            ((AnimatedVectorDrawable) obj).stop();
        }
    }

    /* JADX INFO: renamed from: ۟ۡۡۨ, reason: not valid java name and contains not printable characters */
    public static void m2162(Object obj, int i) {
        if (C0112.m4054() <= 0) {
            q7.e((Drawable) obj, i);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧۦ, reason: not valid java name and contains not printable characters */
    public static int m2163(Object obj, int i) {
        if (C0099.m3752() <= 0) {
            return ((u1) obj).a(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static InputConnection m2164(Object obj, Object obj2, Object obj3) {
        if (C0039.m1515() < 0) {
            return ((a8.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((InputConnection) obj2, (EditorInfo) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static Context m2165(Object obj) {
        if (C0231.m9265() > 0) {
            return ((m) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m2166(Object obj, Object obj2) {
        if (C0079.m3072() <= 0) {
            ((xd) obj).y((Throwable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m2167(Object obj) {
        if (C0243.m9964() > 0) {
            ((uo.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m2168(Object obj, Object obj2) {
        if (C0095.m3478() <= 0) {
            x8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Throwable) obj, (Throwable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m2169(Object obj) {
        if (C0108.m4038() >= 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).f();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۧۡ, reason: not valid java name and contains not printable characters */
    public static Annotation m2170(Object obj, Object obj2) {
        if (C0236.m9615() >= 0) {
            return ((Class) obj).getAnnotation((Class) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤ۠, reason: not valid java name and contains not printable characters */
    public static int m2171(Object obj, int i) {
        if (C0083.m3188() < 0) {
            return ((LayerDrawable) obj).getLayerInsetEnd(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean m2172(Object obj) {
        if (C0034.m1206() < 0) {
            return u7.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((AbsListView) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۡۥۥ, reason: not valid java name and contains not printable characters */
    public static Menu m2173(Object obj) {
        if (C0128.m5064() <= 0) {
            return ((ph) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۦۥ, reason: not valid java name and contains not printable characters */
    public static String m2174(Object obj) {
        if (C0068.m2650() >= 0) {
            return xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((byte[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m2175(Object obj) {
        if (C0128.m5064() < 0) {
            ((iq) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤۦ, reason: not valid java name and contains not printable characters */
    public static String m2176(Object obj) {
        if (C0024.m896() >= 0) {
            return ((NumberFormatException) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۥۢ, reason: not valid java name and contains not printable characters */
    public static void m2177(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws XmlPullParserException, IOException {
        if (C0014.m545() >= 0) {
            q7.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Drawable) obj, (Resources) obj2, (XmlPullParser) obj3, (AttributeSet) obj4, (Resources.Theme) obj5);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۤۧ۟, reason: not valid java name and contains not printable characters */
    public static int m2178(Object obj) {
        if (C0093.m3365() > 0) {
            return ((Configuration) obj).screenWidthDp;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۣۡۤ, reason: not valid java name and contains not printable characters */
    public static double m2179(double d, double d2) {
        if (C0218.m8760() > 0) {
            return Math.max(d, d2);
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: ۟ۦۢۨۥ, reason: not valid java name and contains not printable characters */
    public static int m2180(Object obj) {
        if (C0199.m7998() <= 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۣۦۨ, reason: not valid java name and contains not printable characters */
    public static Rect m2181() {
        if (C0171.m7136() <= 0) {
            return wr.k();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static void m2182(Object obj, Object obj2, int i, Object obj3) {
        if (C0178.m7344() <= 0) {
            ((z0.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).c((Drawable) obj2, i, (PorterDuff.Mode) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۠۠۟, reason: not valid java name and contains not printable characters */
    public static int m2183(Object obj) {
        if (C0133.m5208() <= 0) {
            return ((j9) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۡۦۤ, reason: not valid java name and contains not printable characters */
    public static int m2184() {
        return 779 ^ C0095.f82;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤ۠, reason: not valid java name and contains not printable characters */
    public static String m2185(Object obj) {
        if (C0107.m3883() >= 0) {
            return zl.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((re) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۧۤ, reason: not valid java name and contains not printable characters */
    public static void m2186(Object obj, Object obj2, Object obj3) {
        if (m2184() >= 0) {
            ((e.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((e.a) obj2, (Thread) obj3);
        }
    }

    /* JADX INFO: renamed from: ۠ۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static HookMain.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m2187(Object obj) {
        if (C0240.m9826() >= 0) {
            return ((cc) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۢۧ, reason: not valid java name and contains not printable characters */
    public static int m2188() {
        if (C0181.m7445() >= 0) {
            return Binder.getCallingUid();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static void m2189(Object obj) {
        if (C0049.m1767() < 0) {
            ((m2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).e();
        }
    }

    /* JADX INFO: renamed from: ۠ۤۡۢ, reason: not valid java name and contains not printable characters */
    public static TypedArray m2190(Object obj, Object obj2, Object obj3, int i, int i2) {
        if (C0014.m545() > 0) {
            return ((Resources.Theme) obj).obtainStyledAttributes((AttributeSet) obj2, (int[]) obj3, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static ClipDescription m2191(Object obj) {
        if (C0065.m2448() > 0) {
            return ((bd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۦ۠, reason: not valid java name and contains not printable characters */
    public static int m2192(Object obj) {
        if (C0238.m9653() >= 0) {
            return ((Parcel) obj).readInt();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡ۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static void m2193(Object obj, int i) {
        if (C0083.m3188() < 0) {
            ((ViewGroup.MarginLayoutParams) obj).setMarginEnd(i);
        }
    }

    /* JADX INFO: renamed from: ۡۢۢۧ, reason: not valid java name and contains not printable characters */
    public static Deflater m2194(Object obj) {
        if (C0020.m701() > 0) {
            return ((b7) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static WindowInsets.Builder m2195(Object obj, Object obj2) {
        if (C0119.m4573() >= 0) {
            return ((WindowInsets.Builder) obj).setSystemWindowInsets((Insets) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۥ۟, reason: not valid java name and contains not printable characters */
    public static int m2196(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡۥۤۥ, reason: not valid java name and contains not printable characters */
    public static void m2197(Object obj, Object obj2, Object obj3) throws IOException {
        if (C0227.m9046() > 0) {
            dl.y((OutputStream) obj, (g7) obj2, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۡۦۦ, reason: not valid java name and contains not printable characters */
    public static g6 m2198() {
        if (C0213.m8458() >= 0) {
            return g6.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۨۦ, reason: not valid java name and contains not printable characters */
    public static void m2199(Object obj, Object obj2) {
        if (C0049.m1767() < 0) {
            ((PrintStream) obj).print((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m2200(Object obj) {
        if (C0074.m2951() < 0) {
            return ((wn) obj).a();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۥۡۨ, reason: not valid java name and contains not printable characters */
    public static void m2201(Object obj, int i) {
        if (C0141.m5769() > 0) {
            ((Paint) obj).setColor(i);
        }
    }

    /* JADX INFO: renamed from: ۢۨۡۢ, reason: not valid java name and contains not printable characters */
    public static int m2202(char c) {
        if (C0240.m9826() >= 0) {
            return b3.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(c);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۤ۟, reason: not valid java name and contains not printable characters */
    public static float m2203(Object obj) {
        if (C0238.m9653() > 0) {
            return ((pr.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۢۧۧ, reason: not valid java name and contains not printable characters */
    public static boolean m2204(Object obj, int i) {
        if (C0099.m3752() <= 0) {
            return ((zr) obj).t(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۦۡۦ, reason: not valid java name and contains not printable characters */
    public static void m2205(Object obj, int i, float f) {
        if (C0204.m8270() < 0) {
            ((VelocityTracker) obj).computeCurrentVelocity(i, f);
        }
    }

    /* JADX INFO: renamed from: ۣۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m2206(Object obj, Object obj2) {
        if (C0169.m7034() < 0) {
            ((Drawable) obj).unscheduleSelf((Runnable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۨۨ۠, reason: not valid java name and contains not printable characters */
    public static View m2207(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0182.m7528() < 0) {
            return ((gm) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj2, (Cursor) obj3, (ViewGroup) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static String m2208(Object obj) {
        if (C0002.m72() > 0) {
            return ((h5) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۧۤ, reason: not valid java name and contains not printable characters */
    public static void m2209(Object obj, int i) {
        if (C0053.m1959() > 0) {
            kp.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TextView) obj, i);
        }
    }

    /* JADX INFO: renamed from: ۤۦ, reason: not valid java name and contains not printable characters */
    public static int m2210(Object obj, int i) {
        if (C0219.m8794() >= 0) {
            return ((SparseArray) obj).indexOfKey(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۧۨۡ, reason: not valid java name and contains not printable characters */
    public static ExecutorService m2211() {
        if (C0176.m7290() >= 0) {
            return l9.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۨۤ, reason: contains not printable characters */
    public static void m2212(Object obj, Object obj2) {
        if (C0217.m8693() <= 0) {
            ((ClipboardManager) obj).setPrimaryClip((ClipData) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۣۡۧ, reason: contains not printable characters */
    public static void m2213(Object obj, Object obj2) {
        if (C0084.m3253() <= 0) {
            ((q) obj).g((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۢ۟ۧ, reason: contains not printable characters */
    public static tr m2214(Object obj) {
        if (C0010.m354() <= 0) {
            return ((rr) obj).m();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۢۡ, reason: contains not printable characters */
    public static float m2215(Object obj, Object obj2) {
        if (C0106.m3835() > 0) {
            return ((n3) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((o3) obj2);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۥۣۤۨ, reason: contains not printable characters */
    public static String m2216(Object obj, Object obj2) {
        if (C0116.m4340() > 0) {
            return Settings.Secure.getString((ContentResolver) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۡۦ, reason: contains not printable characters */
    public static void m2217(Object obj, boolean z) {
        if (C0040.m1622() < 0) {
            ((i) obj).J(z);
        }
    }

    /* JADX INFO: renamed from: ۥۥۡ۟, reason: contains not printable characters */
    public static k8 m2218() {
        if (C0199.m7998() <= 0) {
            return C0096.m3587();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۣۣ, reason: contains not printable characters */
    public static Drawable.ConstantState m2219(Object obj) {
        if (C0249.m10052() <= 0) {
            return ((Drawable) obj).getConstantState();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۧۧ, reason: contains not printable characters */
    public static e3 m2220(int i) {
        if (C0049.m1767() < 0) {
            return e3.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۨ۠, reason: contains not printable characters */
    public static dp m2221(Object obj) {
        if (C0214.m8575() <= 0) {
            return ((zs) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡ۠ۧ, reason: contains not printable characters */
    public static e.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m2222() {
        if (C0161.m6744() > 0) {
            return e.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۢۥ, reason: contains not printable characters */
    public static ConnectionBlocker m2223(Object obj) {
        if (C0040.m1622() < 0) {
            return ((ConnectionBlocker.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥ۟ۨ, reason: contains not printable characters */
    public static String m2224(String str) {
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

    /* JADX INFO: renamed from: ۦۧۦۨ, reason: contains not printable characters */
    public static int m2226(Object obj) {
        if (C0095.m3478() < 0) {
            return ((of) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۨۢ۠, reason: contains not printable characters */
    public static boolean m2227(Object obj, boolean z) {
        if (C0079.m3072() <= 0) {
            return ((LicenseManager) obj).c = z;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۦۧ, reason: not valid java name and contains not printable characters */
    public static boolean m2228(Object obj, Object obj2) {
        if (C0116.m4340() > 0) {
            return ((ViewGroup) obj).removeCallbacks((Runnable) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۨۦۡ, reason: not valid java name and contains not printable characters */
    public static int m2229(char c) {
        if (C0199.m7998() < 0) {
            return Character.getNumericValue(c);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨۡۢ, reason: not valid java name and contains not printable characters */
    public static TextView m2230(Object obj) {
        if (C0129.m5108() > 0) {
            return ((qo.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦ۟, reason: not valid java name and contains not printable characters */
    public static float m2231(Object obj) {
        if (C0051.m1783() < 0) {
            return ((us) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۨۦۡۡ, reason: not valid java name and contains not printable characters */
    public static void m2232(Object obj, Object obj2) {
        if (C0095.m3478() <= 0) {
            ((Button) obj).setLayoutParams((ViewGroup.LayoutParams) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۥۣۡ, reason: contains not printable characters */
    public static String m2225(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
