package androidx.fragment.app;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.SurfaceTexture;
import android.os.IBinder;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.C0002;
import android.support.v4.app.C0004;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.window.BackEvent;
import androidx.activity.C0017;
import androidx.activity.C0020;
import androidx.annotation.C0025;
import androidx.annotation.C0031;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.widget.C0047;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0051;
import androidx.core.app.C0053;
import androidx.core.graphics.drawable.C0065;
import androidx.core.widget.C0068;
import androidx.drawerlayout.widget.C0070;
import androidx.drawerlayout.widget.C0072;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0084;
import androidx.lifecycle.C0106;
import androidx.lifecycle.C0108;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0119;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0122;
import androidx.savedstate.C0123;
import androidx.savedstate.C0127;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0129;
import androidx.versionedparcelable.C0135;
import com.example.vcam.C0141;
import com.example.vcam.HookMain;
import com.example.vcam.Menu;
import com.example.vcam.VideoToFrames;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.im;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ki;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ks;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ls;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.oc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ws;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z1;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import okhttp3.C0238;
import okhttp3.C0239;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.internal.C0227;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0195;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.ws.C0224;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0232;
import okhttp3.logging.C0235;
import org.xmlpull.v1.XmlPullParser;
import retrofit2.converter.scalars.C0243;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: androidx.fragment.app.ۨ۟ۥ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0099 {

    /* JADX INFO: renamed from: ۟۟ۥ۠, reason: not valid java name and contains not printable characters */
    public static int f86 = -701;

    /* JADX INFO: renamed from: ۟۟ۡۨۦ, reason: not valid java name and contains not printable characters */
    public static void m3707(Object obj, Object obj2) {
        if (C0141.m5769() > 0) {
            ((TextView) obj).setTextLocales((LocaleList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۥۢۨ, reason: not valid java name and contains not printable characters */
    public static void m3708(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0084.m3253() <= 0) {
            ((pr.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Resources) obj2, (AttributeSet) obj3, (Resources.Theme) obj4, (XmlPullParser) obj5);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static String m3709() {
        if (C0051.m1783() <= 0) {
            return a9.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static void m3710(Object obj, int i) {
        if (C0129.m5108() > 0) {
            ((rr) obj).w(i);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۧۦۣ, reason: not valid java name and contains not printable characters */
    public static void m3711(Object obj, Object obj2) {
        if (C0020.m701() > 0) {
            ((ImageView) obj).setOnClickListener((View.OnClickListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۨۢ۟, reason: not valid java name and contains not printable characters */
    public static int m3712(Object obj) {
        if (C0068.m2650() > 0) {
            return ((View) obj).getAccessibilityLiveRegion();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static ws m3713(Object obj) {
        if (C0162.m6837() <= 0) {
            return ws.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۡۡ, reason: not valid java name and contains not printable characters */
    public static void m3714(Object obj, Object obj2) {
        if (C0053.m1959() > 0) {
            ((Parcel) obj).readByteArray((byte[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۧۡۦ, reason: not valid java name and contains not printable characters */
    public static boolean m3715(Object obj) {
        if (C0047.m1663() < 0) {
            return ((AccessibilityNodeInfo) obj).isLongClickable();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۡ۟, reason: not valid java name and contains not printable characters */
    public static boolean m3716(Object obj) {
        if (C0070.m2829() <= 0) {
            return wp.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static Object[] m3717() {
        if (C0017.m627() >= 0) {
            return z1.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧۧ, reason: not valid java name and contains not printable characters */
    public static Method m3718(Object obj) {
        if (C0122.m4736() <= 0) {
            return ((uo.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3719(Object obj, Object obj2) {
        if (C0093.m3365() >= 0) {
            return i9.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((List) obj, (List) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢۢ, reason: not valid java name and contains not printable characters */
    public static Method m3721(Object obj) {
        if (C0224.m8861() < 0) {
            return ((ki) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۡۥ, reason: not valid java name and contains not printable characters */
    public static void m3722(Object obj, long j, double d, double d2) {
        if (C0117.m4419() <= 0) {
            ((pq) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(j, d, d2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۧۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m3723(Object obj, Object obj2) {
        if (C0120.m4608() > 0) {
            return ((CopyOnWriteArrayList) obj).remove(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static Object m3724(Object obj) {
        if (C0201.m8184() < 0) {
            return ((a0.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static AtomicReferenceFieldUpdater m3725(Object obj) {
        if (C0049.m1767() <= 0) {
            return ((fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static void m3726(Object obj) {
        if (C0240.m9826() > 0) {
            wr.c0((View) obj);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢۡ, reason: not valid java name and contains not printable characters */
    public static String m3727(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۦۥۡ, reason: not valid java name and contains not printable characters */
    public static void m3728(Object obj) {
        if (C0040.m1622() <= 0) {
            ((Activity) obj).recreate();
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static int m3729(Object obj) {
        if (C0195.m7914() > 0) {
            return ((ViewGroup) obj).getWindowVisibility();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static ThreadLocal m3730() {
        if (C0239.m9805() < 0) {
            return qp.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m3731(Object obj) {
        if (C0002.m72() > 0) {
            return ((xs.d) obj).b();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۨ۠۟, reason: not valid java name and contains not printable characters */
    public static int m3732(Object obj) {
        if (C0238.m9653() >= 0) {
            return ((pr.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۨۧ۟, reason: not valid java name and contains not printable characters */
    public static Surface m3733(Object obj) {
        if (C0047.m1663() < 0) {
            return ((VideoToFrames) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۡ۠, reason: not valid java name and contains not printable characters */
    public static ObjectAnimator m3734(Object obj) {
        if (C0243.m9964() > 0) {
            return ((j0.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۡۨ, reason: not valid java name and contains not printable characters */
    public static int m3735(Object obj) {
        if (C0031.m1148() <= 0) {
            return ((yf) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۤۢۤ, reason: not valid java name and contains not printable characters */
    public static CharSequence m3736(Object obj) {
        if (C0176.m7290() >= 0) {
            return ((TextView) obj).getText();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۧۢ, reason: not valid java name and contains not printable characters */
    public static TypedArray m3737(Object obj, Object obj2, Object obj3, int i, int i2) {
        if (C0127.m4950() >= 0) {
            return ((Context) obj).obtainStyledAttributes((AttributeSet) obj2, (int[]) obj3, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m3738(Object obj, Object obj2) {
        if (C0148.m6464() <= 0) {
            return ((Context) obj).checkCallingPermission((String) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۧۡۢ, reason: not valid java name and contains not printable characters */
    public static void m3739(Object obj, boolean z) {
        if (C0225.m9001() > 0) {
            ((AccessibilityNodeInfo) obj).setCanOpenPopup(z);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۦ, reason: not valid java name and contains not printable characters */
    public static boolean m3740(Object obj) {
        if (C0227.m9046() >= 0) {
            return ((r7) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۨ۠ۦ, reason: not valid java name and contains not printable characters */
    public static Parcelable m3741(Object obj) {
        if (C0202.m8245() > 0) {
            return ((rr) obj).i();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3742(Object obj, Object obj2) {
        if (C0135.m5274() < 0) {
            return ((WeakHashMap) obj).containsKey(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۨۨۥ, reason: not valid java name and contains not printable characters */
    public static SurfaceTexture m3743() {
        if (C0178.m7344() < 0) {
            return HookMain.mSurfacetexture;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۥ۠, reason: not valid java name and contains not printable characters */
    public static int m3744(Object obj) {
        if (C0204.m8270() <= 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).a();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m3745(Object obj) {
        if (C0148.m6464() <= 0) {
            return ((com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m3746(Object obj, int i, int i2) {
        if (C0049.m1767() <= 0) {
            return Arrays.copyOfRange((byte[]) obj, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static void m3747(Object obj) throws IOException {
        if (C0049.m1767() < 0) {
            ((OutputStream) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۡ۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static List m3748(Object obj) {
        if (C0123.m4841() <= 0) {
            return d4.c((List) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۥ۠, reason: not valid java name and contains not printable characters */
    public static Object m3749(Object obj) {
        if (C0235.m9535() < 0) {
            return ((fa) obj).invoke();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m3750(Object obj, int i) {
        if (C0218.m8760() >= 0) {
            ((TextView) obj).setBackgroundColor(i);
        }
    }

    /* JADX INFO: renamed from: ۢ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static TypedValue m3751() {
        if (C0119.m4573() > 0) {
            return im.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m3752() {
        return (-6) ^ C0232.f682;
    }

    /* JADX INFO: renamed from: ۢ۠۠۠, reason: not valid java name and contains not printable characters */
    public static void m3753(Object obj) throws IOException {
        if (C0004.m139() < 0) {
            ((HookMain) obj).c0();
        }
    }

    /* JADX INFO: renamed from: ۢۡۡ, reason: not valid java name and contains not printable characters */
    public static Object m3754(Object obj) {
        if (C0065.m2448() > 0) {
            return ((yk) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m3755(Object obj) {
        if (C0096.m3601() <= 0) {
            return ((xd) obj).V();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۤ۠, reason: not valid java name and contains not printable characters */
    public static boolean m3756(Object obj, Object obj2, Object obj3) {
        if (C0078.m3044() <= 0) {
            return ((wr.l) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj2, (KeyEvent) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۥۧۢ, reason: not valid java name and contains not printable characters */
    public static boolean m3757(Object obj) {
        if (C0218.m8760() > 0) {
            return ((r6) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۧۤۧ, reason: not valid java name and contains not printable characters */
    public static int m3758(Object obj, int i) {
        if (C0129.m5108() >= 0) {
            return ((Menu) obj).selectedRuleIndex = i;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Throwable m3759(Object obj, Object obj2) {
        if (C0120.m4608() >= 0) {
            return ((l7) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m3760(Object obj, Object obj2) {
        if (C0227.m9046() >= 0) {
            return dl.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۨۧ, reason: not valid java name and contains not printable characters */
    public static int m3761(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۧۧ۟, reason: not valid java name and contains not printable characters */
    public static Method m3762() {
        if (C0112.m4054() <= 0) {
            return xs.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static MenuItem m3763(Object obj, int i) {
        if (C0249.m10052() <= 0) {
            return ((android.view.Menu) obj).findItem(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m3764(Object obj) {
        if (C0215.m8604() < 0) {
            return ((Collection) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۥۨ, reason: not valid java name and contains not printable characters */
    public static int m3765(Object obj) {
        if (C0188.m7736() <= 0) {
            return ((ArrayList) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static IBinder m3766(Object obj) {
        if (C0053.m1959() >= 0) {
            return ((oc.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.C0144x35d57e31) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟۟, reason: contains not printable characters */
    public static Resources m3767(Object obj) {
        if (C0108.m4038() > 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۥۨ, reason: contains not printable characters */
    public static Resources.Theme m3768(Object obj) {
        if (C0115.m4218() <= 0) {
            return ((Resources) obj).newTheme();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۦۤ, reason: contains not printable characters */
    public static int m3769(Object obj) {
        if (C0215.m8604() <= 0) {
            return ((Menu.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۣ۠ۢ, reason: contains not printable characters */
    public static Object m3770(Object obj) {
        if (C0215.m8604() < 0) {
            return ((HookMain) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۨۤ, reason: contains not printable characters */
    public static Window.Callback m3771(Object obj) {
        if (C0117.m4419() < 0) {
            return ((androidx.appcompat.widget.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۨۧ, reason: contains not printable characters */
    public static uk.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.C0145x35d57e31 m3772(Object obj, Object obj2) {
        if (C0162.m6837() <= 0) {
            return ((uk.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.C0145x35d57e31) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TextDirectionHeuristic) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۡۥ, reason: contains not printable characters */
    public static ls m3773(Object obj) {
        if (C0070.m2829() <= 0) {
            return ((ks) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۡۦ, reason: contains not printable characters */
    public static TextDirectionHeuristic m3774() {
        if (C0199.m7998() < 0) {
            return TextDirectionHeuristics.LOCALE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static Object m3775(Object obj, Object obj2) {
        if (C0178.m7344() < 0) {
            return ((AtomicReference) obj).getAndSet(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m3776(Object obj, int i) {
        if (C0213.m8458() > 0) {
            ((View) obj).setLabelFor(i);
        }
    }

    /* JADX INFO: renamed from: ۣۧۡۡ, reason: not valid java name and contains not printable characters */
    public static String m3777(Object obj) {
        if (C0072.m2856() <= 0) {
            return ((BufferedReader) obj).readLine();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m3778(Object obj) {
        if (C0128.m5064() < 0) {
            return wr.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۧۡ, reason: not valid java name and contains not printable characters */
    public static String m3779(Object obj, Object obj2) {
        if (C0213.m8458() > 0) {
            return C0074.m2931((a9) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۦۧ, reason: not valid java name and contains not printable characters */
    public static boolean m3780(Object obj) {
        if (C0148.m6464() <= 0) {
            return ((sc) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۨۨۡ, reason: not valid java name and contains not printable characters */
    public static int m3781(int i, int i2, int i3) {
        if (C0106.m3835() > 0) {
            return n4.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, i2, i3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨ۟ۤ, reason: not valid java name and contains not printable characters */
    public static float m3782(Object obj, Object obj2) {
        if (C0194.m7889() > 0) {
            return ((n0) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((BackEvent) obj2);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۨ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static ActivityInfo m3783(Object obj, Object obj2, int i) {
        if (C0161.m6744() >= 0) {
            return ((PackageManager) obj).getActivityInfo((ComponentName) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۥ, reason: not valid java name and contains not printable characters */
    public static int m3784(Object obj) {
        if (C0172.m7180() > 0) {
            return ((ListView) obj).getTop();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۨ۠, reason: not valid java name and contains not printable characters */
    public static Object[] m3785(Object obj) {
        if (C0025.m934() >= 0) {
            return ((uo) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۧۨ, reason: not valid java name and contains not printable characters */
    public static androidx.appcompat.view.menu.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m3786(Object obj) {
        if (C0148.m6464() <= 0) {
            return ((v0.k) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m3720(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
