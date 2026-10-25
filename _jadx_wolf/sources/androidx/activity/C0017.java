package androidx.activity;

import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.support.v4.graphics.drawable.C0009;
import android.support.v4.graphics.drawable.C0011;
import android.text.method.TransformationMethod;
import android.util.TypedValue;
import android.view.DisplayCutout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.OverScroller;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.C0023;
import androidx.annotation.C0024;
import androidx.annotation.C0025;
import androidx.annotation.C0026;
import androidx.appcompat.app.C0034;
import androidx.appcompat.app.C0036;
import androidx.appcompat.app.C0037;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.core.app.C0052;
import androidx.core.content.C0057;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0065;
import androidx.core.graphics.drawable.C0066;
import androidx.core.widget.C0068;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0070;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0083;
import androidx.emoji2.text.C0084;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0095;
import androidx.lifecycle.C0107;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0118;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0122;
import androidx.savedstate.C0123;
import com.example.vcam.C0141;
import com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.Cif;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dt;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.eh;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.eq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.er;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.g7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ii;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.im;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.js;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ls;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ol;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.us;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zs;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ListIterator;
import okhttp3.C0238;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0195;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0231;
import okhttp3.logging.C0232;
import okhttp3.logging.C0233;
import okhttp3.logging.C0234;
import okhttp3.logging.C0235;
import okhttp3.logging.C0236;
import org.xmlpull.v1.XmlPullParser;
import retrofit2.converter.scalars.C0243;

/* JADX INFO: renamed from: androidx.activity.۟ۤ۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0017 {

    /* JADX INFO: renamed from: ۟ۤ۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static int f16 = -625;

    /* JADX INFO: renamed from: ۟۟ۡۢۡ, reason: not valid java name and contains not printable characters */
    public static void m554(Object obj, Object obj2, Object obj3) {
        if (C0199.m7998() <= 0) {
            ((l7) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj2, (Throwable) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static int[] m555() {
        if (C0009.m276() < 0) {
            return mp.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m556(Object obj, boolean z) {
        if (C0070.m2829() <= 0) {
            ((Method) obj).setAccessible(z);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۤۢ۟, reason: not valid java name and contains not printable characters */
    public static int m557(Object obj) {
        if (C0116.m4340() > 0) {
            return ((y4) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۢ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m558(Object obj) {
        if (C0202.m8245() >= 0) {
            return ((zs) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۡۢۧ, reason: not valid java name and contains not printable characters */
    public static Field m559() {
        if (C0236.m9615() > 0) {
            return lm.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static Object m560(Object obj, int i) {
        if (C0122.m4736() < 0) {
            return Array.newInstance((Class<?>) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static TransformationMethod m561(Object obj, Object obj2) {
        if (C0171.m7136() < 0) {
            return ((h8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).b((TransformationMethod) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static er m562(Object obj, Object obj2, Object obj3) {
        if (C0235.m9535() < 0) {
            return z5.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((t5) obj, (y5) obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۨ, reason: not valid java name and contains not printable characters */
    public static xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m563(Object obj) {
        if (C0093.m3365() >= 0) {
            return ((eq) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۡۧ, reason: not valid java name and contains not printable characters */
    public static Context m564(Object obj) {
        if (C0052.m1890() >= 0) {
            return ((m1.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۦۡ, reason: not valid java name and contains not printable characters */
    public static fd m565(int i, int i2) {
        if (C0225.m9001() > 0) {
            return tl.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m566(Object obj, Object obj2, Object obj3, int i, int i2) {
        if (C0188.m7736() <= 0) {
            return sq.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TypedArray) obj, (XmlPullParser) obj2, (String) obj3, i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥۧ, reason: not valid java name and contains not printable characters */
    public static double m568(double d) {
        if (C0040.m1622() <= 0) {
            return Math.exp(d);
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m569(Object obj, Object obj2) {
        if (C0083.m3188() <= 0) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static void m570(Object obj, Object obj2) throws IOException {
        if (C0231.m9265() >= 0) {
            dl.z((OutputStream) obj, (g7) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤ۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo m571(Object obj) {
        if (C0123.m4841() < 0) {
            return ((i) obj).M();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m572(Object obj) {
        if (C0217.m8693() <= 0) {
            return ((p) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥۢ, reason: not valid java name and contains not printable characters */
    public static v0.g m573(Object obj) {
        if (C0078.m3044() < 0) {
            return ((v0) obj).S;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۨۦ, reason: not valid java name and contains not printable characters */
    public static void m574(Object obj, Object obj2) {
        if (C0026.m1047() > 0) {
            ((ContentFrameLayout) obj).setAttachListener((ContentFrameLayout.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨۦ, reason: not valid java name and contains not printable characters */
    public static xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m575() {
        if (C0200.m8104() < 0) {
            return xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡ۠, reason: not valid java name and contains not printable characters */
    public static js m576(Object obj, long j) {
        if (C0037.m1437() <= 0) {
            return ((js) obj).b(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static int[] m577() {
        if (C0014.m545() > 0) {
            return ol.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦ۟ۢ, reason: not valid java name and contains not printable characters */
    public static ThreadLocal m578() {
        if (C0182.m7528() < 0) {
            return im.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۢ۟, reason: not valid java name and contains not printable characters */
    public static Drawable.ConstantState m579(Object obj) {
        if (C0195.m7914() >= 0) {
            return ((dt) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m580(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۧۡۧۤ, reason: not valid java name and contains not printable characters */
    public static int m581(Object obj) {
        if (C0187.m7613() > 0) {
            return q7.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Drawable) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۡۨۦ, reason: not valid java name and contains not printable characters */
    public static void m582(Object obj, int i) {
        if (C0014.m545() > 0) {
            ((TextView) obj).setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۢ۠ۥ, reason: not valid java name and contains not printable characters */
    public static ComponentActivity m583(Object obj) {
        if (C0199.m7998() < 0) {
            return ((a5) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۥ۠, reason: not valid java name and contains not printable characters */
    public static int m584(Object obj) {
        if (C0024.m896() > 0) {
            return pj.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Object[]) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۤۥۡ, reason: not valid java name and contains not printable characters */
    public static Cursor m585(Object obj) {
        if (C0025.m934() > 0) {
            return ((k6) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۤۢ, reason: not valid java name and contains not printable characters */
    public static Paint m586(Object obj) {
        if (C0234.m9461() <= 0) {
            return ((BitmapDrawable) obj).getPaint();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static int[] m587() {
        if (C0115.m4218() <= 0) {
            return m1.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥ۠ۤ, reason: not valid java name and contains not printable characters */
    public static LayoutInflater m588(Object obj, Object obj2) {
        if (C0083.m3188() <= 0) {
            return ((LayoutInflater) obj).cloneInContext((Context) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۨۨ, reason: not valid java name and contains not printable characters */
    public static int[] m589() {
        if (C0233.m9365() <= 0) {
            return i0.c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۦۤ, reason: not valid java name and contains not printable characters */
    public static int m590(Object obj, int i) {
        if (C0218.m8760() >= 0) {
            return r7.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Resources) obj, i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static int m591(int i, float f) {
        if (C0120.m4608() >= 0) {
            return pr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡ۠ۦۥ, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m592() {
        if (C0188.m7736() < 0) {
            return PorterDuff.Mode.SCREEN;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۢۨ, reason: not valid java name and contains not printable characters */
    public static Uri.Builder m593(Object obj, Object obj2) {
        if (C0095.m3478() < 0) {
            return ((Uri.Builder) obj).authority((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۦۡ, reason: not valid java name and contains not printable characters */
    public static void m594(Object obj, int i) {
        if (C0116.m4340() >= 0) {
            ((Menu) obj).removeGroup(i);
        }
    }

    /* JADX INFO: renamed from: ۡۧۨۦ, reason: not valid java name and contains not printable characters */
    public static String m595(String str) {
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

    /* JADX INFO: renamed from: ۣۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m596(Object obj) {
        if (C0118.m4454() >= 0) {
            return ((h8) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۡۡۢ, reason: not valid java name and contains not printable characters */
    public static boolean m597(Object obj) {
        if (C0243.m9964() >= 0) {
            return ((OverScroller) obj).computeScrollOffset();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۢۢۤ, reason: not valid java name and contains not printable characters */
    public static View.AccessibilityDelegate m598(Object obj) {
        if (C0231.m9265() >= 0) {
            return wr.g.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۥ, reason: not valid java name and contains not printable characters */
    public static int m599(Object obj) {
        if (C0037.m1437() < 0) {
            return wr.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m600(Object obj) {
        if (C0238.m9653() > 0) {
            Cif.m6021((Cif) obj);
        }
    }

    /* JADX INFO: renamed from: ۣۢۨۨ, reason: not valid java name and contains not printable characters */
    public static int m601(Object obj, int i) {
        if (C0194.m7889() > 0) {
            return e4.g((Iterable) obj, i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۥۥۢ, reason: not valid java name and contains not printable characters */
    public static void m602(Object obj, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        if (C0070.m2829() <= 0) {
            mk.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Path) obj, f, f2, f3, f4, f5, f6, f7, z, z2);
        }
    }

    /* JADX INFO: renamed from: ۢۥۦۤ, reason: not valid java name and contains not printable characters */
    public static void m603(Object obj, Object obj2) {
        if (C0162.m6837() <= 0) {
            ((ls) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۦۣ۠, reason: not valid java name and contains not printable characters */
    public static Object m604(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0058.m2184() > 0) {
            return ((uo.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj2, (Class[]) obj3, (Object[]) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۡۡ, reason: not valid java name and contains not printable characters */
    public static String m605(Object obj) {
        if (C0069.m2756() <= 0) {
            return ((IOException) obj).getMessage();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static int m606(Object obj) {
        if (C0107.m3883() > 0) {
            return ((jm) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢۢ۟, reason: not valid java name and contains not printable characters */
    public static Object m607(Object obj) {
        if (C0066.m2514() > 0) {
            return ((vf) obj).b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢۨ, reason: not valid java name and contains not printable characters */
    public static float m608(Object obj) {
        if (C0066.m2514() >= 0) {
            return ((e3) obj).d();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۣۣۤ, reason: not valid java name and contains not printable characters */
    public static Thread m609(Object obj) {
        if (C0065.m2448() > 0) {
            return ((u6) obj).c0();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۥ, reason: not valid java name and contains not printable characters */
    public static s2 m610(Object obj) {
        if (C0232.m9299() >= 0) {
            return s2.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۧۨ, reason: not valid java name and contains not printable characters */
    public static String m611(Object obj, Object obj2) throws IOException {
        if (C0204.m8270() <= 0) {
            return ((Cif) obj).c((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۧۢ, reason: not valid java name and contains not printable characters */
    public static int m612(Object obj) {
        if (C0187.m7613() > 0) {
            return pg.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ViewGroup.MarginLayoutParams) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤ۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static Drawable.ConstantState m613(Object obj) {
        if (C0023.m843() > 0) {
            return ((pr.a) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۤۢ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m614(Object obj, Object obj2) {
        if (C0204.m8270() <= 0) {
            return ((StringBuilder) obj).append((CharSequence) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۧۦ, reason: not valid java name and contains not printable characters */
    public static com.example.vcam.Menu m615(Object obj) {
        if (C0068.m2650() >= 0) {
            return ((eh) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۠ۦ, reason: contains not printable characters */
    public static int[] m616() {
        if (C0036.m1332() < 0) {
            return f1.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۤ, reason: contains not printable characters */
    public static ListAdapter m617(Object obj) {
        if (C0149.m6476() < 0) {
            return ((ListView) obj).getAdapter();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۦۣ, reason: contains not printable characters */
    public static PropertyValuesHolder m618(Object obj, Object obj2, Object obj3) {
        if (C0141.m5769() > 0) {
            return PropertyValuesHolder.ofObject((String) obj, (TypeEvaluator) obj2, (Object[]) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۦۥ, reason: contains not printable characters */
    public static Process m619(Object obj, Object obj2) {
        if (C0066.m2514() > 0) {
            return ((Runtime) obj).exec((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۨۡ, reason: contains not printable characters */
    public static String m620(Object obj) {
        if (C0218.m8760() >= 0) {
            return ((mj) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۧۡ, reason: contains not printable characters */
    public static Typeface m621(Object obj, Object obj2, Object obj3, int i, int i2, Object obj4, Object obj5, boolean z, boolean z2) {
        if (C0240.m9826() > 0) {
            return im.b((Context) obj, (Resources) obj2, (TypedValue) obj3, i, i2, (im.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj4, (Handler) obj5, z, z2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۧۡ, reason: contains not printable characters */
    public static float m622(Object obj) {
        if (C0232.m9299() >= 0) {
            return ((us) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۦۨ۟ۨ, reason: contains not printable characters */
    public static void m623(Object obj, Object obj2) {
        if (C0084.m3253() <= 0) {
            ii.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((MenuItem) obj, (ColorStateList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۣۨۥ, reason: contains not printable characters */
    public static DisplayCutout m624(Object obj) {
        if (C0095.m3478() <= 0) {
            return ((o7) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static void m625(Object obj, Object obj2) {
        if (C0011.m458() > 0) {
            ((Paint) obj).setStyle((Paint.Style) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧۦۢ, reason: not valid java name and contains not printable characters */
    public static MenuItem m626(Object obj, Object obj2) {
        if (C0065.m2448() > 0) {
            return ii.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.b((MenuItem) obj, (PorterDuff.Mode) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۣۡ, reason: not valid java name and contains not printable characters */
    public static int m627() {
        return (-860) ^ C0034.f32;
    }

    /* JADX INFO: renamed from: ۨۥۥۢ, reason: not valid java name and contains not printable characters */
    public static Object m628(Object obj) {
        if (C0057.m2142() > 0) {
            return ((ListIterator) obj).previous();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨ۠, reason: not valid java name and contains not printable characters */
    public static int m629(Object obj, Object obj2, Object obj3, int i, int i2) {
        if (C0037.m1437() < 0) {
            return sq.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TypedArray) obj, (XmlPullParser) obj2, (String) obj3, i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۨۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m630(Object obj) {
        if (C0021.m740() < 0) {
            return ((xd) obj).r();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۧۥۣ, reason: not valid java name and contains not printable characters */
    public static String m567(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
