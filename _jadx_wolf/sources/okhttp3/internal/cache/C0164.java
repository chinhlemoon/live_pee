package okhttp3.internal.cache;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.icu.util.ULocale;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.C0004;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0010;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.CollapsibleActionView;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.OverScroller;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.activity.C0020;
import androidx.activity.C0021;
import androidx.annotation.C0024;
import androidx.annotation.C0025;
import androidx.annotation.C0026;
import androidx.appcompat.app.C0034;
import androidx.appcompat.app.C0036;
import androidx.appcompat.app.C0037;
import androidx.appcompat.view.menu.C0039;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.view.menu.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.appcompat.widget.C0047;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0053;
import androidx.core.content.C0057;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.C0065;
import androidx.core.widget.C0068;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0078;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0095;
import androidx.fragment.app.C0099;
import androidx.fragment.app.a;
import androidx.lifecycle.C0106;
import androidx.lifecycle.C0107;
import androidx.lifecycle.C0108;
import androidx.profileinstaller.C0118;
import androidx.savedstate.C0123;
import androidx.savedstate.C0126;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0129;
import androidx.versionedparcelable.C0135;
import com.example.vcam.C0141;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.HookMain;
import com.example.vcam.LicenseManager;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.Cif;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.aa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.c2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.da;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ep;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gb;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mh;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ne;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.w2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ws;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import javax.crypto.Mac;
import okhttp3.C0238;
import okhttp3.C0239;
import okhttp3.HttpUrl;
import okhttp3.internal.C0227;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0195;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.ws.C0224;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0232;
import okhttp3.logging.C0234;
import okhttp3.logging.C0235;
import okhttp3.logging.C0236;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.converter.scalars.C0243;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: okhttp3.internal.cache.۟۟ۡۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0164 {

    /* JADX INFO: renamed from: ۡۢۦ۟, reason: not valid java name and contains not printable characters */
    public static int f614 = -892;

    /* JADX INFO: renamed from: ۣ۟۟۠۠, reason: not valid java name and contains not printable characters */
    public static ep m6883() {
        if (C0034.m1206() <= 0) {
            return jp.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۣۥ, reason: not valid java name and contains not printable characters */
    public static boolean m6884(Object obj) {
        if (C0053.m1959() >= 0) {
            return ((h8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static String m6885(Object obj) {
        if (C0006.m169() < 0) {
            return ((AccessibilityNodeInfo) obj).getUniqueId();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧۧۥ, reason: not valid java name and contains not printable characters */
    public static char m6886(Object obj) {
        if (C0006.m169() <= 0) {
            return ((p) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: ۟۠۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean m6887(Object obj) {
        if (C0099.m3752() < 0) {
            return ((File) obj).exists();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static Context m6888(Object obj) {
        if (C0049.m1767() < 0) {
            return ((lc) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static s6 m6889(Object obj, Object obj2) {
        if (C0204.m8270() < 0) {
            return ((ws) obj).n((View) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۧۨ, reason: not valid java name and contains not printable characters */
    public static void m6890(Object obj, int i) {
        if (C0068.m2650() >= 0) {
            ((v0) obj).Q(i);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۦۨ۠, reason: not valid java name and contains not printable characters */
    public static StaticLayout.Builder m6891(Object obj, int i, int i2, Object obj2, int i3) {
        if (C0234.m9461() <= 0) {
            return StaticLayout.Builder.obtain((CharSequence) obj, i, i2, (TextPaint) obj2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m6892(Object obj, Object obj2) {
        if (C0181.m7445() >= 0) {
            return w2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj, (String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۥۣۤ, reason: not valid java name and contains not printable characters */
    public static void m6893(Object obj, Object obj2, Object obj3, long j) {
        if (C0141.m5769() > 0) {
            ((Drawable.Callback) obj).scheduleDrawable((Drawable) obj2, (Runnable) obj3, j);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۦۢۡ, reason: not valid java name and contains not printable characters */
    public static void m6894(Object obj) {
        if (C0141.m5769() >= 0) {
            ((ArrayList) obj).clear();
        }
    }

    /* JADX INFO: renamed from: ۟ۢۤۢ۟, reason: not valid java name and contains not printable characters */
    public static Method m6895() {
        if (C0123.m4841() < 0) {
            return x.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۡۢ, reason: not valid java name and contains not printable characters */
    public static m9.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa[] m6896(Object obj) {
        if (C0021.m740() < 0) {
            return ((m9.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۡۨ, reason: not valid java name and contains not printable characters */
    public static ConnectionBlocker.BlockRule m6897(Object obj) {
        if (C0053.m1959() > 0) {
            return ((mh) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static void m6899(Object obj) {
        if (C0191.m7812() > 0) {
            ((CollapsibleActionView) obj).onActionViewExpanded();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static int m6900() {
        return 962 ^ C0235.f685;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static String m6901(String str) {
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
        while (length > 0) {
            byteArray[-1] = (byte) (byteArray[-1] ^ str2.charAt((-1) % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = HttpUrl.FRAGMENT_ENCODE_SET.length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤ۟, reason: not valid java name and contains not printable characters */
    public static v0.k[] m6902(Object obj) {
        if (C0169.m7034() <= 0) {
            return ((v0) obj).H;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۦ۟, reason: not valid java name and contains not printable characters */
    public static String m6903(Object obj) {
        if (C0039.m1515() <= 0) {
            return ((Cif) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۤۢ, reason: not valid java name and contains not printable characters */
    public static long m6904(Object obj, Object obj2, long j) {
        if (C0036.m1332() < 0) {
            return ((JSONObject) obj).optLong((String) obj2, j);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۢۤۦ, reason: not valid java name and contains not printable characters */
    public static int m6905(Object obj, Object obj2) {
        if (C0037.m1437() <= 0) {
            return ContextCompat.checkSelfPermission((Context) obj, (String) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۥ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m6906(Object obj, Object obj2, Object obj3) {
        if (C0162.m6837() < 0) {
            ((Bundle) obj).putCharSequence((String) obj2, (CharSequence) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۥۦ۠, reason: not valid java name and contains not printable characters */
    public static OverScroller m6907(Object obj) {
        if (C0176.m7290() >= 0) {
            return ((zr) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۢۤ, reason: not valid java name and contains not printable characters */
    public static int m6908(Object obj, Object obj2) {
        if (C0095.m3478() < 0) {
            return ((dk) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((a3) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۦۨۤ, reason: not valid java name and contains not printable characters */
    public static Runnable m6909(Object obj) {
        if (C0202.m8245() > 0) {
            return ((o9) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۡۢ, reason: not valid java name and contains not printable characters */
    public static int m6910(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۥۣ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m6911(Object obj) {
        if (C0249.m10052() < 0) {
            return ((ws) obj).o();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣۡۨ, reason: not valid java name and contains not printable characters */
    public static LayoutInflater.Factory m6912(Object obj) {
        if (C0236.m9615() >= 0) {
            return ((LayoutInflater) obj).getFactory();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۧۢ, reason: not valid java name and contains not printable characters */
    public static boolean m6913(Object obj) {
        if (C0047.m1663() <= 0) {
            return ((Iterator) obj).hasNext();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۨۤۤ, reason: not valid java name and contains not printable characters */
    public static IntStream m6914(Object obj) {
        if (C0249.m10052() <= 0) {
            return jr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((CharSequence) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۠۠, reason: not valid java name and contains not printable characters */
    public static uo m6915(Object obj) {
        if (C0225.m9001() >= 0) {
            return uo.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۤۥ, reason: not valid java name and contains not printable characters */
    public static boolean m6916(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0040.m1622() <= 0) {
            return ne.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ne.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj, (View) obj2, (Window.Callback) obj3, (KeyEvent) obj4);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧ۟۟۟, reason: not valid java name and contains not printable characters */
    public static ClassLoader m6917(Object obj) {
        if (C0129.m5108() > 0) {
            return ((Class) obj).getClassLoader();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static p1.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m6918(Object obj) {
        if (C0227.m9046() >= 0) {
            return ((o1) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡ۟۠, reason: not valid java name and contains not printable characters */
    public static void m6919(Object obj, int i, int i2, int i3) {
        if (C0234.m9461() <= 0) {
            c2.a((int[]) obj, i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۥۢۦ, reason: not valid java name and contains not printable characters */
    public static void m6920(Object obj, Object obj2, Object obj3) {
        if (C0020.m701() >= 0) {
            C0094.m3455((Context) obj, (String) obj2, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static float m6921(Object obj) {
        if (C0128.m5064() <= 0) {
            return ((m2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۧۧ۠۠, reason: not valid java name and contains not printable characters */
    public static int m6922(Object obj) {
        if (C0232.m9299() >= 0) {
            return ((d7) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static String m6923(Object obj, Object obj2, Object obj3, int i) {
        if (C0108.m4038() > 0) {
            return sq.a((TypedArray) obj, (XmlPullParser) obj2, (String) obj3, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static Application m6924(Object obj) {
        if (C0004.m139() < 0) {
            return ((Activity) obj).getApplication();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۧ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m6925(Object obj) {
        if (C0188.m7736() < 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).x;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۤۡ, reason: not valid java name and contains not printable characters */
    public static ProviderInfo m6926(Object obj, Object obj2, int i) {
        if (C0227.m9046() > 0) {
            return ((PackageManager) obj).resolveContentProvider((String) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۦۣ, reason: not valid java name and contains not printable characters */
    public static boolean m6927(Object obj) {
        if (C0078.m3044() < 0) {
            return ((l1) obj).q();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۦۨ۟, reason: not valid java name and contains not printable characters */
    public static xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m6928(Object obj) {
        if (C0108.m4038() >= 0) {
            return ((yn) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۦ۠, reason: not valid java name and contains not printable characters */
    public static void m6929(Object obj) {
        if (C0195.m7914() > 0) {
            da.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((da) obj);
        }
    }

    /* JADX INFO: renamed from: ۢۢ۠ۥ, reason: not valid java name and contains not printable characters */
    public static xs m6930(Object obj, Object obj2, Object obj3) {
        if (C0249.m10052() < 0) {
            return wr.d.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj, (xs) obj2, (Rect) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۤۤ, reason: not valid java name and contains not printable characters */
    public static boolean m6931(Object obj) {
        if (C0188.m7736() < 0) {
            return ((AccessibilityNodeInfo) obj).isSelected();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۤ۟۟, reason: not valid java name and contains not printable characters */
    public static int m6932(Object obj) {
        if (C0161.m6744() >= 0) {
            return d4.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((List) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۤۤۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m6933(Object obj, Object obj2) {
        if (C0021.m740() < 0) {
            return ((Mac) obj).doFinal((byte[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۣۢ, reason: not valid java name and contains not printable characters */
    public static boolean m6934(Object obj, Object obj2) {
        if (C0199.m7998() <= 0) {
            return ((a) obj).x((MenuItem) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۦۡۢ, reason: not valid java name and contains not printable characters */
    public static pr m6935(Object obj, int i, Object obj2) {
        if (C0107.m3883() >= 0) {
            return pr.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Resources) obj, i, (Resources.Theme) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۢۧ, reason: not valid java name and contains not printable characters */
    public static void m6936(Object obj, Object obj2) {
        if (C0053.m1959() > 0) {
            aa.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((List) obj, (View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۦۦۦ, reason: not valid java name and contains not printable characters */
    public static y5.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m6937(Object obj) {
        if (C0010.m354() <= 0) {
            return ((xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ, reason: not valid java name and contains not printable characters */
    public static boolean m6938(Object obj) {
        if (C0141.m5769() >= 0) {
            return C0126.m4900((LicenseManager) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۧۧۦ, reason: not valid java name and contains not printable characters */
    public static Drawable m6939(Object obj, int i) {
        if (C0141.m5769() >= 0) {
            return ((LayerDrawable) obj).getDrawable(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۨۨ, reason: not valid java name and contains not printable characters */
    public static Object[] m6940(Object obj) {
        if (C0141.m5769() > 0) {
            return ((t1) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m6941(Object obj, Object obj2) {
        if (C0057.m2142() >= 0) {
            return ((f6) obj).B((f6.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤۧۧ, reason: not valid java name and contains not printable characters */
    public static void m6942(Object obj, Object obj2, Object obj3) {
        if (C0171.m7136() <= 0) {
            ((View.AccessibilityDelegate) obj).sendAccessibilityEventUnchecked((View) obj2, (AccessibilityEvent) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣۤۤۧ, reason: not valid java name and contains not printable characters */
    public static void m6943(Object obj) {
        if (C0020.m701() >= 0) {
            ((View) obj).requestFitSystemWindows();
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۡۢ, reason: contains not printable characters */
    public static void m6944(Object obj, Object obj2) {
        if (C0236.m9615() >= 0) {
            ((Spinner) obj).setAdapter((SpinnerAdapter) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥ۠۟ۨ, reason: contains not printable characters */
    public static String m6945(Object obj) {
        if (C0024.m896() > 0) {
            return ((k3) obj).q();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۤ, reason: contains not printable characters */
    public static ULocale m6946(Object obj) {
        if (C0118.m4454() > 0) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡ۠ۤ, reason: contains not printable characters */
    public static HookMain m6947(Object obj) {
        if (C0025.m934() >= 0) {
            return ((HookMain.r) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۣۤ, reason: contains not printable characters */
    public static boolean m6948(Object obj) {
        if (C0074.m2951() < 0) {
            return ((k3) obj).w();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣۧۧ, reason: contains not printable characters */
    public static HookMain m6949(Object obj) {
        if (C0194.m7889() > 0) {
            return ((HookMain.e) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۡ۟, reason: contains not printable characters */
    public static void m6950(Object obj, int i) {
        if (C0149.m6476() < 0) {
            ((p) obj).setShowAsAction(i);
        }
    }

    /* JADX INFO: renamed from: ۦ۟ۦۦ, reason: contains not printable characters */
    public static String m6951() {
        if (C0065.m2448() > 0) {
            return Build.BOARD;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۡۡ, reason: contains not printable characters */
    public static void m6952(Object obj, Object obj2) {
        if (C0026.m1047() > 0) {
            ((i1) obj).b((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦ۠ۢۢ, reason: contains not printable characters */
    public static float[] m6953(Object obj) {
        if (C0037.m1437() < 0) {
            return ((gb.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۥ, reason: contains not printable characters */
    public static Throwable m6954(Object obj, Object obj2) {
        if (C0118.m4454() >= 0) {
            return ((CancellationException) obj).initCause((Throwable) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧ۟ۡ, reason: contains not printable characters */
    public static ArrayList m6955(Object obj) {
        if (C0020.m701() > 0) {
            return ((y9) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۧۦ, reason: contains not printable characters */
    public static int m6956(int i, int i2) {
        if (C0238.m9653() >= 0) {
            return tl.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۢۡ, reason: not valid java name and contains not printable characters */
    public static void m6957(Object obj, Object obj2) {
        if (C0135.m5274() <= 0) {
            ((Call) obj).enqueue((Callback) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۧۧ۠, reason: not valid java name and contains not printable characters */
    public static CharSequence m6958(Object obj) {
        if (C0006.m169() < 0) {
            return ((i) obj).c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۧ۟, reason: not valid java name and contains not printable characters */
    public static int[] m6959(Object obj) {
        if (C0243.m9964() >= 0) {
            return ((z0.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۢۡ, reason: not valid java name and contains not printable characters */
    public static boolean m6960(Object obj, int i, Object obj2) {
        if (C0239.m9805() < 0) {
            return ((i) obj).y(i, (Bundle) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۤۥۡ, reason: not valid java name and contains not printable characters */
    public static String m6961(Object obj) {
        if (C0224.m8861() <= 0) {
            return ((Pattern) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۦۨ, reason: not valid java name and contains not printable characters */
    public static k3 m6962(Object obj) {
        if (C0021.m740() <= 0) {
            return ((i7) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۡۢ, reason: not valid java name and contains not printable characters */
    public static void m6963(Object obj) {
        if (C0106.m3835() > 0) {
            ((SurfaceTexture) obj).release();
        }
    }

    /* JADX INFO: renamed from: ۟ۢۥۢ۠, reason: not valid java name and contains not printable characters */
    public static String m6898(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
