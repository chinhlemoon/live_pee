package android.support.v4.app;

import android.animation.Keyframe;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.support.v4.graphics.drawable.C0010;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.activity.C0021;
import androidx.annotation.C0025;
import androidx.appcompat.app.C0034;
import androidx.appcompat.app.C0035;
import androidx.appcompat.app.C0037;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.C0047;
import androidx.core.app.C0051;
import androidx.core.app.C0052;
import androidx.core.app.C0055;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0065;
import androidx.drawerlayout.widget.C0070;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0079;
import androidx.emoji2.text.C0083;
import androidx.emoji2.text.C0084;
import androidx.fragment.app.C0095;
import androidx.lifecycle.C0106;
import androidx.lifecycle.g;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0118;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0126;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0135;
import com.example.vcam.HookMain;
import com.example.vcam.Menu;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.as;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.b;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.c3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.da;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fb;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ih;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ns;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ws;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zs;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceArray;
import okhttp3.C0238;
import okhttp3.HttpUrl;
import okhttp3.internal.C0227;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0231;
import okhttp3.logging.C0232;
import okhttp3.logging.C0233;
import okhttp3.logging.C0235;
import okhttp3.logging.C0236;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.C0243;

/* JADX INFO: renamed from: android.support.v4.app.ۥۣۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0006 {

    /* JADX INFO: renamed from: ۣ۟ۧۨۧ, reason: not valid java name and contains not printable characters */
    public static int f6 = -749;

    /* JADX INFO: renamed from: ۟۟ۤۦۧ, reason: not valid java name and contains not printable characters */
    public static int m169() {
        return (-901) ^ C0118.f98;
    }

    /* JADX INFO: renamed from: ۟۟ۥۧۥ, reason: not valid java name and contains not printable characters */
    public static String m170(Object obj) {
        if (C0004.m139() <= 0) {
            return ((ArrayIndexOutOfBoundsException) obj).getMessage();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨۢ۠, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.AccessibilityAction m171() {
        if (C0243.m9964() > 0) {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static TextDirectionHeuristic m172(Object obj) {
        if (C0095.m3478() <= 0) {
            return ((TextView) obj).getTextDirectionHeuristic();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static void m173(Object obj) {
        if (C0047.m1663() < 0) {
            ((i7) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۟۠ۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m174(Object obj) {
        if (C0083.m3188() < 0) {
            return ((xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۢۦۡ, reason: not valid java name and contains not printable characters */
    public static void m175(Object obj) {
        if (C0065.m2448() >= 0) {
            ((ViewPropertyAnimator) obj).start();
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static int m176(Object obj) {
        if (C0047.m1663() < 0) {
            return ((Paint.FontMetricsInt) obj).top;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۥۨ, reason: not valid java name and contains not printable characters */
    public static HookMain m177(Object obj) {
        if (C0074.m2951() < 0) {
            return ((HookMain.n) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠۠۟, reason: not valid java name and contains not printable characters */
    public static Uri m178(Object obj) {
        if (C0211.m8341() >= 0) {
            return ((bd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥ۠ۥ, reason: not valid java name and contains not printable characters */
    public static Object m179(Object obj) {
        if (C0232.m9299() >= 0) {
            return ((lg.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).getKey();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧ۠۠, reason: not valid java name and contains not printable characters */
    public static void m180(Object obj, boolean z) {
        if (C0120.m4608() > 0) {
            ((Window.Callback) obj).onWindowFocusChanged(z);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static int m181(Object obj) {
        if (C0106.m3835() > 0) {
            return ((DisplayCutout) obj).hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۥۡ, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m182() {
        if (C0172.m7180() >= 0) {
            return PorterDuff.Mode.SRC_OVER;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦ۟ۨ, reason: not valid java name and contains not printable characters */
    public static g.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m183() {
        if (C0037.m1437() <= 0) {
            return lf.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static String m184(String str) {
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

    /* JADX INFO: renamed from: ۟ۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static Retrofit.Builder m185(Object obj, Object obj2) {
        if (C0171.m7136() < 0) {
            return ((Retrofit.Builder) obj).baseUrl((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static void m186(Object obj) {
        if (C0010.m354() <= 0) {
            ((l7) obj).run();
        }
    }

    /* JADX INFO: renamed from: ۟ۤۥ۠, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.AccessibilityAction m187() {
        if (C0236.m9615() >= 0) {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥ۟۠, reason: not valid java name and contains not printable characters */
    public static String m188(Object obj) {
        if (C0231.m9265() > 0) {
            return C0171.m7122((xd) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m189(Object obj) {
        if (C0149.m6476() <= 0) {
            ((v9) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۥ۠, reason: not valid java name and contains not printable characters */
    public static ns m190(Object obj) {
        if (C0117.m4419() <= 0) {
            return ((ws) obj).q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۣ۟, reason: not valid java name and contains not printable characters */
    public static void m191(Object obj, int i, int i2, int i3, int i4) {
        if (C0070.m2829() <= 0) {
            ((Drawable) obj).setHotspotBounds(i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۡ, reason: not valid java name and contains not printable characters */
    public static void m192(Object obj) {
        if (C0052.m1890() >= 0) {
            ((i1) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤ۠, reason: not valid java name and contains not printable characters */
    public static void m193(Object obj, Object obj2) {
        if (C0219.m8794() >= 0) {
            ((tm.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((tm.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۤۦ۟, reason: not valid java name and contains not printable characters */
    public static MappedByteBuffer m194(Object obj, Object obj2, long j, long j2) {
        if (C0037.m1437() <= 0) {
            return ((FileChannel) obj).map((FileChannel.MapMode) obj2, j, j2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۨ۟, reason: not valid java name and contains not printable characters */
    public static m5 m195(Object obj) {
        if (C0025.m934() > 0) {
            return ((dm.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۣۨ, reason: not valid java name and contains not printable characters */
    public static void m196(Object obj, Object obj2) {
        if (C0238.m9653() >= 0) {
            ((u0) obj).E((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۢۦۧ, reason: not valid java name and contains not printable characters */
    public static boolean m197(Object obj) {
        if (C0079.m3072() < 0) {
            return ((k6) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m198() {
        if (C0135.m5274() < 0) {
            return "ۢۦ۠";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۦۢ, reason: not valid java name and contains not printable characters */
    public static String m199() {
        if (C0021.m740() <= 0) {
            return Build.HARDWARE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۣۢ, reason: not valid java name and contains not printable characters */
    public static void m200(Object obj, Object obj2) {
        if (C0052.m1890() >= 0) {
            ((Window) obj).setCallback((Window.Callback) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۨۤ۠, reason: not valid java name and contains not printable characters */
    public static Drawable m201(Object obj) {
        if (C0235.m9535() <= 0) {
            return ((ActionBarContainer) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢ۠۟, reason: not valid java name and contains not printable characters */
    public static int m202(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡۤۤ, reason: not valid java name and contains not printable characters */
    public static void m203(Object obj, Object obj2) {
        if (C0126.m4908() <= 0) {
            ((zs) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((fb) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static void m204(Object obj) {
        if (C0106.m3835() > 0) {
            ((LongSparseArray) obj).clear();
        }
    }

    /* JADX INFO: renamed from: ۣۢۥۢ, reason: not valid java name and contains not printable characters */
    public static boolean m205(Object obj) {
        if (C0181.m7445() > 0) {
            return as.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ViewGroup) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۦۥ۠, reason: not valid java name and contains not printable characters */
    public static void m206(Object obj) {
        if (C0218.m8760() > 0) {
            ((bd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۣۥۢۢ, reason: not valid java name and contains not printable characters */
    public static mf m207(Object obj) {
        if (C0025.m934() > 0) {
            return v0.b.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Configuration) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۣۢ, reason: not valid java name and contains not printable characters */
    public static void m208(Object obj, int i) {
        if (C0217.m8693() <= 0) {
            r8.h((OutputStream) obj, i);
        }
    }

    /* JADX INFO: renamed from: ۣۦۦۤ, reason: not valid java name and contains not printable characters */
    public static void m210(Object obj) {
        if (C0051.m1783() <= 0) {
            jd.n((String) obj);
        }
    }

    /* JADX INFO: renamed from: ۣۧۦۥ, reason: not valid java name and contains not printable characters */
    public static int m211(Object obj) {
        if (C0172.m7180() > 0) {
            return ((View) obj).getHeight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۤۡ, reason: not valid java name and contains not printable characters */
    public static WindowInsets m212(Object obj, Object obj2) {
        if (C0035.m1268() <= 0) {
            return ((View) obj).dispatchApplyWindowInsets((WindowInsets) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢ۟, reason: not valid java name and contains not printable characters */
    public static boolean m213(Object obj) {
        if (C0002.m72() > 0) {
            return ((lg.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).hasNext();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤۤ۟, reason: not valid java name and contains not printable characters */
    public static boolean m214(Object obj, Object obj2) {
        if (C0238.m9653() > 0) {
            return lg.h((Map) obj, (Collection) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۤۧ, reason: not valid java name and contains not printable characters */
    public static int m215(Object obj) {
        if (C0135.m5274() <= 0) {
            return ((s2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۤۧ, reason: not valid java name and contains not printable characters */
    public static void m216(Object obj, float f) {
        if (C0176.m7290() >= 0) {
            ((Keyframe) obj).setFraction(f);
        }
    }

    /* JADX INFO: renamed from: ۤۧۧ۟, reason: not valid java name and contains not printable characters */
    public static v0 m217(Object obj) {
        if (C0010.m354() <= 0) {
            return v0.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۥۡ, reason: contains not printable characters */
    public static boolean m218(Object obj, int i) {
        if (m169() < 0) {
            return q7.d((Drawable) obj, i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۡۧۤ, reason: contains not printable characters */
    public static lf.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m219(Object obj) {
        if (C0227.m9046() > 0) {
            return lf.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((fs) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۟ۥ, reason: contains not printable characters */
    public static boolean m220(Object obj, Object obj2, long j, Object obj3) {
        if (C0079.m3072() <= 0) {
            return ((hm) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj2, j, (Drawable) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۤۨۦ, reason: contains not printable characters */
    public static List m221(Object obj) {
        if (C0055.m2054() >= 0) {
            return ((da) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۨۥ, reason: contains not printable characters */
    public static void m222(Object obj, Object obj2) {
        if (C0084.m3253() <= 0) {
            ((y1) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۤ۠ۢ, reason: contains not printable characters */
    public static void m223(Object obj, long j) {
        if (C0128.m5064() < 0) {
            ((f6) obj).P(j);
        }
    }

    /* JADX INFO: renamed from: ۦۣۤۡ, reason: contains not printable characters */
    public static void m224(Object obj, Object obj2) {
        if (C0233.m9365() < 0) {
            Menu.m5658((Menu) obj, (View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۦۡۨ, reason: contains not printable characters */
    public static Iterator m225(Object obj) {
        if (C0070.m2829() <= 0) {
            return ((List) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۡۢ, reason: contains not printable characters */
    public static Uri m226(Object obj) {
        if (C0058.m2184() >= 0) {
            return ((bd.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m227(Object obj, Object obj2) {
        if (C0181.m7445() >= 0) {
            Menu.m5590((Menu) obj, (View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣۧ۟, reason: not valid java name and contains not printable characters */
    public static int m228(Object obj) {
        if (C0034.m1206() < 0) {
            return ((TypedValue) obj).changingConfigurations;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۤۤۤ, reason: not valid java name and contains not printable characters */
    public static InputFilter[] m229(Object obj) {
        if (C0025.m934() > 0) {
            return ((TextView) obj).getFilters();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۣ۠, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.AccessibilityAction m230() {
        if (C0225.m9001() >= 0) {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۥۧ, reason: not valid java name and contains not printable characters */
    public static b m231(Object obj) {
        if (C0051.m1783() < 0) {
            return b.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static Typeface m232(Object obj) {
        if (C0116.m4340() >= 0) {
            return ((c3.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۥۦ, reason: not valid java name and contains not printable characters */
    public static void m233(Object obj, int i, Object obj2) {
        if (C0055.m2054() > 0) {
            ((AtomicReferenceArray) obj).set(i, obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۦۥۦ, reason: not valid java name and contains not printable characters */
    public static Menu m234(Object obj) {
        if (C0148.m6464() < 0) {
            return ((ih) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۧۤ, reason: not valid java name and contains not printable characters */
    public static int m235(Object obj, int i, Object obj2) {
        if (C0169.m7034() <= 0) {
            return ((Resources) obj).getColor(i, (Resources.Theme) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۦۣۣ, reason: not valid java name and contains not printable characters */
    public static String m209(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
