package androidx.appcompat.view.menu;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.C0004;
import android.support.v4.graphics.drawable.C0011;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.activity.C0020;
import androidx.annotation.C0024;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.C0036;
import androidx.appcompat.app.C0037;
import androidx.appcompat.widget.C0047;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.cardview.widget.C0049;
import androidx.cardview.widget.CardView;
import androidx.core.app.C0052;
import androidx.core.app.C0053;
import androidx.core.app.C0055;
import androidx.core.content.C0057;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0064;
import androidx.drawerlayout.widget.C0072;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0079;
import androidx.emoji2.text.C0083;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0095;
import androidx.fragment.app.C0097;
import androidx.fragment.app.C0099;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0108;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0117;
import androidx.savedstate.C0122;
import androidx.savedstate.C0126;
import androidx.savedstate.C0127;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0133;
import androidx.versionedparcelable.C0135;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.HookMain;
import com.example.vcam.MainActivity;
import com.example.vcam.Menu;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bi;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bt;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.df;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.eg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.nm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.on;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.so;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.w2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zf;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.OutputStream;
import java.net.Proxy;
import java.nio.channels.FileChannel;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import okhttp3.C0239;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.internal.C0227;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.logging.C0231;
import okhttp3.logging.C0234;
import okhttp3.logging.C0236;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.۟ۡۤۦۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0040 {

    /* JADX INFO: renamed from: ۟ۢۢۧۤ, reason: not valid java name and contains not printable characters */
    public static int f37 = 58;

    /* JADX INFO: renamed from: ۟۟۠ۦۦ, reason: not valid java name and contains not printable characters */
    public static byte[] m1551(Object obj, long j) {
        if (C0020.m701() > 0) {
            return ((s2) obj).H(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۦۥ, reason: not valid java name and contains not printable characters */
    public static void m1552(Object obj, Object obj2) {
        if (C0128.m5064() < 0) {
            ((AppCompatActivity) obj).setContentView((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۤۡۧ, reason: not valid java name and contains not printable characters */
    public static Resources.Theme m1553(Object obj) {
        if (C0053.m1959() >= 0) {
            return ((Context) obj).getTheme();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m1554(Object obj, Object obj2) {
        if (C0083.m3188() < 0) {
            Menu.m5618((Dialog) obj, (View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static float m1555(float f, float f2) {
        if (C0240.m9826() > 0) {
            return Math.min(f, f2);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m1556(Object obj) {
        if (C0093.m3365() > 0) {
            return ((HookMain) obj).a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static e9 m1557() {
        if (C0164.m6900() <= 0) {
            return e9.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۨۥ, reason: not valid java name and contains not printable characters */
    public static void m1558(Object obj, int i) {
        if (C0055.m2054() > 0) {
            ((LinearLayout) obj).setGravity(i);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۨۤۤ, reason: not valid java name and contains not printable characters */
    public static float m1559(float f) {
        if (C0004.m139() <= 0) {
            return f3.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(f);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m1560(Object obj) {
        if (C0122.m4736() < 0) {
            return ((e) obj).isDone();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static Typeface m1561(Object obj, int i) {
        if (C0213.m8458() > 0) {
            return Typeface.create((Typeface) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۢ, reason: not valid java name and contains not printable characters */
    public static sp m1562(Object obj) {
        if (C0097.m3659() >= 0) {
            return ((rp) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۧ۠, reason: not valid java name and contains not printable characters */
    public static void m1563(Object obj, Object obj2) {
        if (C0112.m4054() <= 0) {
            ((CompoundButton) obj).setButtonDrawable((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۨۢۧ, reason: not valid java name and contains not printable characters */
    public static int m1564() {
        if (C0108.m4038() >= 0) {
            return w2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟, reason: not valid java name and contains not printable characters */
    public static MainActivity.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m1565(Object obj) {
        if (C0211.m8341() >= 0) {
            return ((eg) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۢۨ, reason: not valid java name and contains not printable characters */
    public static void m1566(Object obj, Object obj2) {
        if (C0194.m7889() >= 0) {
            ((OutputStream) obj).write((byte[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۧ, reason: not valid java name and contains not printable characters */
    public static s2 m1567(Object obj, Object obj2, int i, int i2) {
        if (C0117.m4419() < 0) {
            return ((s2) obj).s0((String) obj2, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۡ۠, reason: not valid java name and contains not printable characters */
    public static boolean m1568(Object obj, Object obj2) {
        if (C0231.m9265() >= 0) {
            return ((kp.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TextView) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۧۦۤ, reason: not valid java name and contains not printable characters */
    public static a3 m1569(Object obj, Object obj2) {
        if (C0095.m3478() < 0) {
            return ((a3.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۢۦ, reason: not valid java name and contains not printable characters */
    public static boolean m1570(Object obj) {
        if (C0122.m4736() <= 0) {
            return ((Fragment) obj).u;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۣۧ۠, reason: not valid java name and contains not printable characters */
    public static void m1571(Object obj, Object obj2) {
        if (C0024.m896() >= 0) {
            ((Rect) obj).set((Rect) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۦۡۡ, reason: not valid java name and contains not printable characters */
    public static int m1572(Object obj) {
        if (C0239.m9805() < 0) {
            return ((y) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۧۤۢ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m1573(Object obj, Object obj2) {
        if (C0099.m3752() < 0) {
            return ((OkHttpClient.Builder) obj).proxy((Proxy) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۦۣ, reason: not valid java name and contains not printable characters */
    public static CharSequence m1574(Object obj) {
        if (C0093.m3365() >= 0) {
            return ((androidx.appcompat.widget.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۡۧ, reason: not valid java name and contains not printable characters */
    public static androidx.emoji2.text.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m1575() {
        if (C0093.m3365() > 0) {
            return androidx.emoji2.text.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m1576(String str) {
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

    /* JADX INFO: renamed from: ۟ۦۥۡۦ, reason: not valid java name and contains not printable characters */
    public static lg m1577(Object obj) {
        if (C0064.m2388() >= 0) {
            return lg.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۣۦ, reason: not valid java name and contains not printable characters */
    public static SurfaceHolder m1578() {
        if (C0083.m3188() <= 0) {
            return HookMain.ori_holder;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1579(Object obj, Object obj2) {
        if (C0191.m7812() >= 0) {
            return ((v0) obj).n0((v0.k) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۡ۠۟, reason: not valid java name and contains not printable characters */
    public static boolean m1580(Object obj) {
        if (C0133.m5208() < 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).o;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢۤ, reason: not valid java name and contains not printable characters */
    public static int m1581(Object obj) {
        if (C0191.m7812() >= 0) {
            return ((uf) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۦ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m1582(Object obj) {
        if (C0227.m9046() >= 0) {
            return ((TextPaint) obj).getFlags();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static void m1583(Object obj, Object obj2) {
        if (C0126.m4908() < 0) {
            ((View) obj).setLayoutParams((ViewGroup.LayoutParams) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static void m1584(Object obj, Object obj2) {
        if (C0234.m9461() <= 0) {
            Menu.m5640((Menu) obj, (View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m1585(Object obj) {
        if (C0108.m4038() > 0) {
            return ((TextView) obj).onCheckIsTextEditor();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static HttpLoggingInterceptor m1587(Object obj, Object obj2) {
        if (C0108.m4038() >= 0) {
            return ((HttpLoggingInterceptor) obj).setLevel((HttpLoggingInterceptor.Level) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥ۠۠, reason: not valid java name and contains not printable characters */
    public static mf m1588() {
        if (C0148.m6464() < 0) {
            return u0.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۡ۟, reason: not valid java name and contains not printable characters */
    public static Throwable m1589(Object obj, Object obj2) {
        if (C0231.m9265() > 0) {
            return ((k3) obj).i((rd) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۧۥ, reason: not valid java name and contains not printable characters */
    public static DisplayMetrics m1590(Object obj) {
        if (C0249.m10052() < 0) {
            return ((Resources) obj).getDisplayMetrics();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۤۦ, reason: not valid java name and contains not printable characters */
    public static XC_LoadPackage.LoadPackageParam m1591(Object obj) {
        if (C0052.m1890() >= 0) {
            return ((HookMain.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦ۠ۥ, reason: not valid java name and contains not printable characters */
    public static Collection m1592(Object obj, Object obj2) {
        if (m1622() < 0) {
            return mn.a((hn) obj, (Collection) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۤ۠, reason: not valid java name and contains not printable characters */
    public static int m1593(Object obj) {
        if (C0058.m2184() >= 0) {
            return ((z1) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢۢ۠, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m1594(Object obj) {
        if (C0127.m4950() >= 0) {
            return ((qm) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۥۣ, reason: not valid java name and contains not printable characters */
    public static void m1595(Object obj, int i, Object obj2) {
        if (C0078.m3044() < 0) {
            ((fj) obj).d(i, (ViewParent) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۧۨۢ, reason: not valid java name and contains not printable characters */
    public static int m1596(Object obj, int i) {
        if (C0039.m1515() < 0) {
            return C0234.m9446((byte[]) obj, i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Drawable m1597(Object obj) {
        if (C0079.m3072() <= 0) {
            return ((CardView.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static MainActivity m1598(Object obj) {
        if (C0078.m3044() <= 0) {
            return ((zf) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۠۟, reason: not valid java name and contains not printable characters */
    public static boolean m1599(Object obj) {
        if (C0039.m1515() < 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).p;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static void m1600(Object obj) {
        if (C0219.m8794() >= 0) {
            ((p7) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۣۡۡۧ, reason: not valid java name and contains not printable characters */
    public static void m1601(Object obj, Object obj2) {
        if (C0083.m3188() < 0) {
            ((ViewStubCompat) obj).setLayoutInflater((LayoutInflater) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۡۤۡ, reason: not valid java name and contains not printable characters */
    public static int m1602(Object obj) {
        if (C0149.m6476() <= 0) {
            return ((View) obj).getLabelFor();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۦ, reason: not valid java name and contains not printable characters */
    public static boolean m1603(Object obj, Object obj2) {
        if (C0236.m9615() >= 0) {
            return ((bt) obj).setState((int[]) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m1604(Object obj, Object obj2) {
        if (C0236.m9615() > 0) {
            ((q.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((q) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۤۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m1605(Object obj) {
        if (C0049.m1767() < 0) {
            return nm.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۤۦۨ, reason: not valid java name and contains not printable characters */
    public static Surface m1606() {
        if (C0204.m8270() < 0) {
            return HookMain.c2_reader_Surfcae_1;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۥۢ, reason: not valid java name and contains not printable characters */
    public static long m1607(Object obj) {
        if (C0057.m2142() >= 0) {
            return C0133.m5203((ConnectionBlocker) obj);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۣ۟ۧ, reason: contains not printable characters */
    public static androidx.fragment.app.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m1608(Object obj) {
        if (C0037.m1437() <= 0) {
            return ((t9) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۤۧ, reason: contains not printable characters */
    public static boolean m1609(Object obj) {
        if (C0052.m1890() > 0) {
            return ((r0) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۥۤۨ, reason: contains not printable characters */
    public static File[] m1610(Object obj, Object obj2) {
        if (C0036.m1332() <= 0) {
            return ((File) obj).listFiles((FilenameFilter) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۠ۧ, reason: contains not printable characters */
    public static ListView m1611(Object obj) {
        if (C0234.m9461() <= 0) {
            return ((df) obj).m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۧۧ, reason: contains not printable characters */
    public static android.view.Menu m1612(Object obj, Object obj2) {
        if (C0057.m2142() > 0) {
            return ((so.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((android.view.Menu) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۨۥ, reason: contains not printable characters */
    public static MenuItem m1613(Object obj, Object obj2) {
        if (C0047.m1663() < 0) {
            return ((MenuItem) obj).setOnMenuItemClickListener((MenuItem.OnMenuItemClickListener) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۡ, reason: contains not printable characters */
    public static void m1614(Object obj, Object obj2) {
        if (C0047.m1663() < 0) {
            ((xs) obj).f((dd) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۦۥ۠, reason: contains not printable characters */
    public static Set m1615(Object obj) {
        if (C0187.m7613() > 0) {
            return on.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Set) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۥۥ, reason: contains not printable characters */
    public static int m1616(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m1617(Object obj, Object obj2, boolean z) {
        if (C0079.m3072() < 0) {
            m7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((l7) obj, (t5) obj2, z);
        }
    }

    /* JADX INFO: renamed from: ۧ۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static Bundle m1618(Object obj) {
        if (C0057.m2142() >= 0) {
            return ((Fragment) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۣۡ, reason: not valid java name and contains not printable characters */
    public static View m1619(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0117.m4419() <= 0) {
            return ((m1) obj).k((Context) obj2, (String) obj3, (String) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۦ۠, reason: not valid java name and contains not printable characters */
    public static long m1620(Object obj) {
        if (C0072.m2856() < 0) {
            return ((FileChannel) obj).size();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۧۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1621(Object obj) {
        if (C0211.m8341() > 0) {
            return ((KeyEvent) obj).isSystem();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۨۨ, reason: not valid java name and contains not printable characters */
    public static int m1622() {
        return 861 ^ C0215.f665;
    }

    /* JADX INFO: renamed from: ۨ۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static Menu m1623(Object obj) {
        if (C0011.m458() >= 0) {
            return ((bi) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int[] m1624() {
        if (C0113.m4144() <= 0) {
            return m1.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۦۡ, reason: not valid java name and contains not printable characters */
    public static boolean m1625(Object obj, long j) {
        if (C0215.m8604() <= 0) {
            return ((f6) obj).T(j);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨۨ۠, reason: not valid java name and contains not printable characters */
    public static void m1626(Object obj, Object obj2, Object obj3) {
        if (C0240.m9826() > 0) {
            ((View.AccessibilityDelegate) obj).onPopulateAccessibilityEvent((View) obj2, (AccessibilityEvent) obj3);
        }
    }

    /* JADX INFO: renamed from: ۨۨۥ۟, reason: not valid java name and contains not printable characters */
    public static boolean m1627(Object obj) {
        if (C0135.m5274() <= 0) {
            return mf.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Locale) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m1586(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
