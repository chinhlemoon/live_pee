package androidx.core.content;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.database.ContentObserver;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0010;
import android.telephony.TelephonyManager;
import android.text.method.TransformationMethod;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.C0017;
import androidx.activity.C0020;
import androidx.annotation.C0023;
import androidx.annotation.C0024;
import androidx.annotation.C0026;
import androidx.annotation.C0031;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.widget.C0047;
import androidx.core.app.C0051;
import androidx.core.app.C0053;
import androidx.core.app.C0055;
import androidx.core.graphics.drawable.C0065;
import androidx.core.graphics.drawable.C0066;
import androidx.core.widget.C0068;
import androidx.drawerlayout.widget.C0070;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0079;
import androidx.emoji2.text.C0083;
import androidx.emoji2.text.C0084;
import androidx.emoji2.text.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0095;
import androidx.fragment.app.C0099;
import androidx.lifecycle.C0106;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0118;
import androidx.profileinstaller.C0119;
import androidx.savedstate.C0123;
import androidx.versionedparcelable.C0129;
import androidx.versionedparcelable.C0133;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.HookMain;
import com.example.vcam.LicenseManager;
import com.example.vcam.Menu;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.cs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ej;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.el;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.g3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.g5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.js;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ls;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.nc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ws;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ym;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReferenceArray;
import okhttp3.HttpUrl;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.ws.C0224;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0231;
import okhttp3.logging.C0235;
import okhttp3.logging.C0236;
import org.xmlpull.v1.XmlPullParser;
import retrofit2.C0259;

/* JADX INFO: renamed from: androidx.core.content.۟ۥۨۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0057 {

    /* JADX INFO: renamed from: ۡ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static int f51 = -771;

    /* JADX INFO: renamed from: ۣ۟۟ۧۥ, reason: not valid java name and contains not printable characters */
    public static void m2078() {
        if (C0093.m3365() >= 0) {
            d4.f();
        }
    }

    /* JADX INFO: renamed from: ۟۟ۨۢۦ, reason: not valid java name and contains not printable characters */
    public static lf.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m2079(Object obj) {
        if (C0191.m7812() >= 0) {
            return ((lf) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static void m2080(Object obj, int i) {
        if (C0084.m3253() <= 0) {
            ((SparseArray) obj).removeAt(i);
        }
    }

    /* JADX INFO: renamed from: ۟۠۟ۦۧ, reason: not valid java name and contains not printable characters */
    public static void m2081(Object obj) {
        if (C0224.m8861() <= 0) {
            ((v0) obj).P();
        }
    }

    /* JADX INFO: renamed from: ۟۠۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static boolean m2082(Object obj) {
        if (C0259.m10136() > 0) {
            return ((r7) obj).c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static String m2083(String str) {
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

    /* JADX INFO: renamed from: ۟۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static boolean m2084(Object obj) {
        if (C0119.m4573() > 0) {
            return ((v9) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static boolean m2085(Object obj) {
        if (C0113.m4144() <= 0) {
            return ((ws) obj).f;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۦۢ, reason: not valid java name and contains not printable characters */
    public static x9[] m2086(Object obj, int i) {
        if (C0191.m7812() > 0) {
            return ((x9.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۥۦ, reason: not valid java name and contains not printable characters */
    public static Iterator m2087(Object obj) {
        if (C0023.m843() > 0) {
            return ((v7.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۦۤ, reason: not valid java name and contains not printable characters */
    public static Shader m2088(Object obj) {
        if (C0188.m7736() < 0) {
            return ((y4) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۦۨ, reason: not valid java name and contains not printable characters */
    public static long m2089(Object obj) {
        if (C0093.m3365() > 0) {
            return ((ConnectionBlocker.NetworkLog) obj).timestamp;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠ۦۣۢ, reason: not valid java name and contains not printable characters */
    public static String m2090(Object obj) {
        if (C0020.m701() > 0) {
            return ((TelephonyManager) obj).getDeviceId();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧ۠۟, reason: not valid java name and contains not printable characters */
    public static ym m2091(Object obj) {
        if (C0112.m4054() < 0) {
            return ym.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((zm) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۦۨ, reason: not valid java name and contains not printable characters */
    public static void m2092(Object obj) {
        if (C0215.m8604() < 0) {
            ((ws.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۟۠ۨۥۨ, reason: not valid java name and contains not printable characters */
    public static js m2093(Object obj, long j) {
        if (C0068.m2650() >= 0) {
            return ((js) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m2094(Object obj, Object obj2) {
        if (m2142() > 0) {
            ((View) obj).postOnAnimation((Runnable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۢۥۥ, reason: not valid java name and contains not printable characters */
    public static void m2095(Object obj, Object obj2, Object obj3) {
        if (C0026.m1047() >= 0) {
            ((k3) obj).a((g3) obj2, (Throwable) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static qa m2096(Object obj) {
        if (C0201.m8184() <= 0) {
            return ((a) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۧۦ, reason: not valid java name and contains not printable characters */
    public static void m2097(Object obj, Object obj2) {
        if (C0024.m896() > 0) {
            ((Cursor) obj).registerContentObserver((ContentObserver) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۧۧۧ, reason: not valid java name and contains not printable characters */
    public static mf m2098(Object obj, Object obj2) {
        if (m2142() > 0) {
            return ((v0) obj).h0((Configuration) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟۠, reason: not valid java name and contains not printable characters */
    public static boolean m2099(Object obj) {
        if (C0119.m4573() > 0) {
            return ((yn) obj).b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m2100(Object obj, int i) {
        if (C0148.m6464() <= 0) {
            ((a3) obj).g(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m2102(Object obj) {
        if (C0006.m169() <= 0) {
            ((zp) obj).n();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۥ۠ۦ, reason: not valid java name and contains not printable characters */
    public static ls m2103(Object obj) {
        if (C0040.m1622() < 0) {
            return ((ws) obj).p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟۟, reason: not valid java name and contains not printable characters */
    public static vl m2104(Object obj) {
        if (C0053.m1959() > 0) {
            return vl.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static String m2105(Object obj) {
        if (C0149.m6476() <= 0) {
            return nc.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۤۨ, reason: not valid java name and contains not printable characters */
    public static boolean m2106(Object obj, Object obj2) {
        if (C0116.m4340() >= 0) {
            return ((vn) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Class) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۥۥۣ, reason: not valid java name and contains not printable characters */
    public static void m2107(Object obj, int i, Object obj2) {
        if (C0095.m3478() <= 0) {
            ((AtomicReferenceArray) obj).lazySet(i, obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۦۡۦ, reason: not valid java name and contains not printable characters */
    public static Class m2108(Object obj) {
        if (C0119.m4573() >= 0) {
            return ((cs) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟۠, reason: not valid java name and contains not printable characters */
    public static CharSequence m2109(Object obj, Object obj2, Object obj3) {
        if (C0118.m4454() >= 0) {
            return ((TransformationMethod) obj).getTransformation((CharSequence) obj2, (View) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m2110(Object obj) {
        if (C0053.m1959() > 0) {
            return q7.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Drawable) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static boolean m2111(Object obj, Object obj2) {
        if (C0031.m1148() <= 0) {
            return ((bo) obj).onStateChange((int[]) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static Throwable m2112(Object obj, Object obj2) {
        if (C0178.m7344() <= 0) {
            return jd.d((Throwable) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۦ۠, reason: not valid java name and contains not printable characters */
    public static void m2113(Object obj, Object obj2) {
        if (C0217.m8693() < 0) {
            g5.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((CompoundButton) obj, (PorterDuff.Mode) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۢ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m2114(Object obj) {
        if (C0149.m6476() <= 0) {
            return ((String) obj).hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۢۧۦ, reason: not valid java name and contains not printable characters */
    public static void m2115(Object obj) {
        if (C0070.m2829() < 0) {
            ((vl) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣۡۧ, reason: not valid java name and contains not printable characters */
    public static int m2116(Object obj, char c, int i, boolean z, int i2) {
        if (C0010.m354() <= 0) {
            return mo.K((CharSequence) obj, c, i, z, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۦ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Object[] m2117(Object obj) {
        if (C0053.m1959() >= 0) {
            return ((tp) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Menu m2118(Object obj) {
        if (C0095.m3478() <= 0) {
            return ((Menu.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۨۥ, reason: not valid java name and contains not printable characters */
    public static void m2119(Object obj, int i, Object obj2) {
        if (C0083.m3188() <= 0) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۢۥ۟, reason: not valid java name and contains not printable characters */
    public static int m2120(Object obj, Object obj2, boolean z) {
        if (C0099.m3752() <= 0) {
            return t2.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((s2) obj, (dk) obj2, z);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۢۨۨ, reason: not valid java name and contains not printable characters */
    public static Transition m2121(Object obj, int i) {
        if (C0023.m843() >= 0) {
            return ((TransitionSet) obj).getTransitionAt(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧ۟, reason: not valid java name and contains not printable characters */
    public static Object m2122(Object obj) {
        if (C0093.m3365() >= 0) {
            return ((yf) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static int m2123(Object obj) {
        if (C0187.m7613() >= 0) {
            return ((l1) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۡۨۥ, reason: not valid java name and contains not printable characters */
    public static byte[] m2124() {
        if (C0065.m2448() >= 0) {
            return el.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥ۠, reason: not valid java name and contains not printable characters */
    public static q m2125(Object obj, Object obj2) {
        if (C0236.m9615() >= 0) {
            return ((m) obj).g((q.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۣۢ, reason: not valid java name and contains not printable characters */
    public static Intent m2126(Object obj, Object obj2) {
        if (C0178.m7344() <= 0) {
            return ej.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj, (ComponentName) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static String m2127(Object obj) {
        if (C0236.m9615() >= 0) {
            return ((PackageManager.NameNotFoundException) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۢۢ, reason: not valid java name and contains not printable characters */
    public static Object m2128(Object obj) {
        if (C0017.m627() > 0) {
            return ((Locale) obj).clone();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۤۧ, reason: not valid java name and contains not printable characters */
    public static void m2129(Object obj, int i, int i2, int i3, int i4) {
        if (C0129.m5108() >= 0) {
            ((View) obj).setPaddingRelative(i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: ۡۨۡۢ, reason: not valid java name and contains not printable characters */
    public static boolean m2130(Object obj, int i) {
        if (C0047.m1663() < 0) {
            return ((u0) obj).y(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۦۤۨ, reason: not valid java name and contains not printable characters */
    public static Constructor m2131(Object obj, Object obj2) {
        if (C0231.m9265() >= 0) {
            return ((Class) obj).getDeclaredConstructor((Class[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m2132(Object obj) {
        if (C0066.m2514() >= 0) {
            return ((ListView) obj).getFirstVisiblePosition();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int[] m2133(Object obj) {
        if (C0010.m354() <= 0) {
            return ((z0.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۟۟, reason: not valid java name and contains not printable characters */
    public static void m2134(Object obj, Object obj2) {
        if (C0123.m4841() <= 0) {
            TransitionManager.beginDelayedTransition((ViewGroup) obj, (Transition) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۤۦۤ, reason: not valid java name and contains not printable characters */
    public static void m2135(Object obj) {
        if (C0106.m3835() >= 0) {
            ((xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۤۤۢ, reason: not valid java name and contains not printable characters */
    public static boolean m2136(Object obj, Object obj2, float f, float f2, boolean z) {
        if (C0188.m7736() < 0) {
            return hs.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ViewParent) obj, (View) obj2, f, f2, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۥۢۦ, reason: not valid java name and contains not printable characters */
    public static void m2137(Object obj, Object obj2) {
        if (C0235.m9535() < 0) {
            ((View) obj).setTooltipText((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۦۤۧ, reason: not valid java name and contains not printable characters */
    public static void m2138(Object obj, int i) {
        if (C0116.m4340() >= 0) {
            ((m2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).b(i);
        }
    }

    /* JADX INFO: renamed from: ۤۧ۟, reason: not valid java name and contains not printable characters */
    public static void m2139(Object obj) {
        if (C0119.m4573() > 0) {
            ((LicenseManager) obj).x();
        }
    }

    /* JADX INFO: renamed from: ۤۧۥ۟, reason: not valid java name and contains not printable characters */
    public static CharSequence m2140(Object obj, Object obj2) {
        if (C0093.m3365() >= 0) {
            return ((xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۡۢ, reason: contains not printable characters */
    public static int m2141(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥ۠۠۟, reason: contains not printable characters */
    public static int m2142() {
        return 333 ^ C0051.f45;
    }

    /* JADX INFO: renamed from: ۥ۠ۧ۟, reason: contains not printable characters */
    public static void m2143(Object obj, int i) {
        if (C0079.m3072() <= 0) {
            kp.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TextView) obj, i);
        }
    }

    /* JADX INFO: renamed from: ۦ۟ۢۡ, reason: contains not printable characters */
    public static int m2144(Object obj) {
        if (C0133.m5208() < 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).s;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۢ۟ۡ, reason: contains not printable characters */
    public static boolean m2145(Object obj, int i) {
        if (C0079.m3072() <= 0) {
            return ((Drawable) obj).setLevel(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۥ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m2146(Object obj, Object obj2) {
        if (C0225.m9001() >= 0) {
            ((PrintWriter) obj).println(obj2);
        }
    }

    /* JADX INFO: renamed from: ۧۦۥ, reason: not valid java name and contains not printable characters */
    public static String m2147(Object obj, int i) {
        if (C0172.m7180() >= 0) {
            return ((a9) obj).d(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨ۟, reason: not valid java name and contains not printable characters */
    public static boolean m2148(Object obj, Object obj2, Object obj3, int i, boolean z) {
        if (C0055.m2054() > 0) {
            return sq.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TypedArray) obj, (XmlPullParser) obj2, (String) obj3, i, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۧۨۢ, reason: not valid java name and contains not printable characters */
    public static void m2149(Object obj, Object obj2) {
        if (C0020.m701() > 0) {
            ((zr) obj).A((MotionEvent) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۦۧ۠, reason: not valid java name and contains not printable characters */
    public static lg m2150(Object obj) {
        if (C0074.m2951() <= 0) {
            return ((z1) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m2151(Object obj, Object obj2) {
        if (C0040.m1622() < 0) {
            ((i) obj).L((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۧۧۥ, reason: not valid java name and contains not printable characters */
    public static XC_LoadPackage.LoadPackageParam m2152(Object obj) {
        if (C0083.m3188() < 0) {
            return ((HookMain.b) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨ۟۟, reason: not valid java name and contains not printable characters */
    public static String m2101(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
