package androidx.profileinstaller;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ActivityInfo;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.location.LocationManager;
import android.support.v4.app.C0002;
import android.support.v4.app.C0004;
import android.support.v4.graphics.drawable.C0009;
import android.support.v4.graphics.drawable.C0010;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.C0014;
import androidx.activity.C0020;
import androidx.activity.C0021;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.C0025;
import androidx.annotation.C0026;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0035;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.C0047;
import androidx.core.app.C0051;
import androidx.core.content.C0057;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0064;
import androidx.core.graphics.drawable.C0065;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0072;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0084;
import androidx.fragment.app.C0095;
import androidx.fragment.app.C0099;
import androidx.fragment.app.a;
import androidx.savedstate.C0127;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0133;
import androidx.versionedparcelable.C0135;
import com.example.vcam.C0141;
import com.example.vcam.HookMain;
import com.example.vcam.MainActivity;
import com.example.vcam.Menu;
import com.example.vcam.VideoToFrames;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.b7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.cl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dt;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.g7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jb;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.so;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.te;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.up;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ws;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import okhttp3.C0238;
import okhttp3.C0239;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0233;
import okhttp3.logging.C0234;
import okhttp3.logging.C0235;
import okhttp3.logging.C0236;
import retrofit2.C0259;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: androidx.profileinstaller.۟ۥۣۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0117 {

    /* JADX INFO: renamed from: ۟ۦ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int f97 = 471;

    /* JADX INFO: renamed from: ۟۟۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m4362(Object obj, Object obj2) {
        if (C0002.m72() >= 0) {
            jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj, (String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static sn m4363(Object obj, Object obj2) {
        if (C0065.m2448() > 0) {
            return ((f2) obj).sink((sn) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m4364(Object obj, Object obj2) {
        if (C0188.m7736() < 0) {
            ((s8) obj).U((l7) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۡۤۤ, reason: not valid java name and contains not printable characters */
    public static HookMain m4365(Object obj) {
        if (C0004.m139() < 0) {
            return Menu.m5585((Menu) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۦۣ, reason: not valid java name and contains not printable characters */
    public static int m4366(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4367(Object obj, int i) {
        if (C0078.m3044() <= 0) {
            return ((zp) obj).j(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m4368(Object obj) throws IOException {
        if (C0062.m2326() > 0) {
            ((u2) obj).flush();
        }
    }

    /* JADX INFO: renamed from: ۟۠ۢۨ۠, reason: not valid java name and contains not printable characters */
    public static Object m4369(Object obj) {
        if (C0069.m2756() < 0) {
            return e.b((Future) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۨۨ, reason: not valid java name and contains not printable characters */
    public static void m4370(Object obj, int i, Object obj2) {
        if (C0194.m7889() > 0) {
            u7.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((u7) obj, i, (View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۤۡۦ, reason: not valid java name and contains not printable characters */
    public static int m4371(Object obj) {
        if (C0178.m7344() < 0) {
            return ((uo.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).i;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۦۤ۠, reason: not valid java name and contains not printable characters */
    public static int m4372(Object obj, int i) {
        if (C0116.m4340() >= 0) {
            return ((LayerDrawable) obj).getId(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۦۦۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4373(Object obj, Object obj2) {
        if (C0058.m2184() > 0) {
            return ((LocationManager) obj).isProviderEnabled((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۧۡۦ, reason: not valid java name and contains not printable characters */
    public static String m4374(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۡۢۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4375(Object obj, Object obj2) {
        if (C0031.m1148() <= 0) {
            return ((Window.Callback) obj).dispatchPopulateAccessibilityEvent((AccessibilityEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۦۣۢ, reason: not valid java name and contains not printable characters */
    public static Paint m4376(Object obj) {
        if (C0182.m7528() < 0) {
            return ((pr.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۡۡ, reason: not valid java name and contains not printable characters */
    public static int m4377(Object obj) {
        if (C0225.m9001() > 0) {
            return ((s6) obj).a();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۡۧ, reason: not valid java name and contains not printable characters */
    public static Drawable m4378(Object obj, Object obj2, int i, boolean z) {
        if (C0234.m9461() < 0) {
            return ((z0) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj2, i, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۨۦ, reason: not valid java name and contains not printable characters */
    public static String m4379(Object obj) {
        if (C0211.m8341() > 0) {
            return ((ActivityInfo) obj).packageName;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4380(Object obj) {
        if (C0149.m6476() <= 0) {
            return ((b7) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۨۧۨ, reason: not valid java name and contains not printable characters */
    public static boolean m4381(Object obj) {
        if (C0072.m2856() < 0) {
            return ((com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.a) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static void m4382(Object obj, int i, int i2, Object obj2) {
        if (C0058.m2184() >= 0) {
            dl.r((byte[]) obj, i, i2, (g7) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۨ, reason: not valid java name and contains not printable characters */
    public static int m4383(Object obj) {
        if (C0064.m2388() >= 0) {
            return ((wr.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static boolean m4384(Object obj) {
        if (C0236.m9615() > 0) {
            return ((dt) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۦ۟ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m4385(Object obj) {
        if (C0204.m8270() < 0) {
            return ((ws) obj).n;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m4386(Object obj, int i) {
        if (C0259.m10136() > 0) {
            ((ViewGroup.MarginLayoutParams) obj).resolveLayoutDirection(i);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static y4 m4387(Object obj) {
        if (C0095.m3478() < 0) {
            return y4.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Shader) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static double m4388(double d) {
        if (C0026.m1047() > 0) {
            return Math.toRadians(d);
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static Drawable m4389(Object obj, Object obj2, int i) {
        if (C0021.m740() < 0) {
            return ((z0) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۢ۠, reason: not valid java name and contains not printable characters */
    public static void m4390(Object obj, Object obj2) {
        if (C0199.m7998() <= 0) {
            qc.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ImageView) obj, (ColorStateList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۤۦۥ, reason: not valid java name and contains not printable characters */
    public static Throwable m4391(Object obj, Object obj2, Object obj3) {
        if (C0238.m9653() > 0) {
            return ((xd) obj).o((xd.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2, (List) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m4392(Object obj) throws IOException {
        if (C0238.m9653() >= 0) {
            ((jb) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۢۤۧ, reason: not valid java name and contains not printable characters */
    public static void m4393(Object obj) throws IOException {
        if (C0128.m5064() <= 0) {
            ((up) obj).throwIfReached();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m4394(Object obj, Object obj2) {
        if (C0057.m2142() >= 0) {
            ((OnBackPressedDispatcher) obj).f((OnBackInvokedDispatcher) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۧۨ۟, reason: not valid java name and contains not printable characters */
    public static void m4395(Object obj, Object obj2) {
        if (C0127.m4950() > 0) {
            ((PopupWindow) obj).setContentView((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۨۦۨ, reason: not valid java name and contains not printable characters */
    public static boolean m4396(Object obj, Object obj2) {
        if (C0259.m10136() >= 0) {
            return ((Set) obj).contains(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۢۦ, reason: not valid java name and contains not printable characters */
    public static y5 m4397(Object obj) {
        if (C0084.m3253() <= 0) {
            return ((h7) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۨ۠, reason: not valid java name and contains not printable characters */
    public static SurfaceTexture m4398() {
        if (C0120.m4608() >= 0) {
            return HookMain.c1_fake_texture;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۡۢ, reason: not valid java name and contains not printable characters */
    public static void m4399(Object obj, Object obj2) {
        if (C0235.m9535() <= 0) {
            ((TextView) obj).setTransformationMethod((TransformationMethod) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۦۣۧ, reason: not valid java name and contains not printable characters */
    public static long m4400(Object obj) {
        if (C0020.m701() > 0) {
            return ((s2) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Animator m4401(Object obj, int i) {
        if (C0200.m8104() <= 0) {
            return AnimatorInflater.loadAnimator((Context) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨ۠۠, reason: not valid java name and contains not printable characters */
    public static byte[] m4402(Object obj, Object obj2) {
        if (C0009.m276() < 0) {
            return ((HookMain) obj).F((Bitmap) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۢۨ, reason: not valid java name and contains not printable characters */
    public static void m4403(Object obj) {
        if (C0078.m3044() <= 0) {
            ((WeakHashMap) obj).clear();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢۧ, reason: not valid java name and contains not printable characters */
    public static View m4404(Object obj) {
        if (C0047.m1663() < 0) {
            return ((zr) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦۤ, reason: not valid java name and contains not printable characters */
    public static boolean m4405(Object obj, Object obj2) {
        if (C0099.m3752() < 0) {
            return ((View) obj).onTouchEvent((MotionEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۦۣ۠, reason: not valid java name and contains not printable characters */
    public static int m4406(Object obj) {
        if (C0025.m934() >= 0) {
            return ((View) obj).getLeft();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۦۦۦ, reason: not valid java name and contains not printable characters */
    public static Drawable m4407(Object obj, int i) {
        if (C0178.m7344() < 0) {
            return ((zp) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4408(Object obj) {
        if (C0127.m4950() >= 0) {
            return ((vm) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۨۤۡ, reason: not valid java name and contains not printable characters */
    public static void m4409(Object obj) {
        if (C0240.m9826() > 0) {
            ((AnimatedVectorDrawable) obj).start();
        }
    }

    /* JADX INFO: renamed from: ۠ۢۧ۠, reason: not valid java name and contains not printable characters */
    public static MainActivity m4410(Object obj) {
        if (C0233.m9365() < 0) {
            return ((MainActivity.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4411(Object obj, Object obj2, boolean z) {
        if (C0240.m9826() >= 0) {
            return mo.w((CharSequence) obj, (CharSequence) obj2, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۦۥۡ, reason: not valid java name and contains not printable characters */
    public static void m4412(Object obj, Object obj2) {
        if (C0202.m8245() > 0) {
            ((VideoToFrames) obj).set_surfcae((Surface) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۧۦۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4413(Object obj, Object obj2, boolean z, int i) {
        if (C0133.m5208() < 0) {
            return lo.q((String) obj, (String) obj2, z, i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۥۣ۟, reason: not valid java name and contains not printable characters */
    public static void m4414(Object obj, Object obj2, Object obj3) {
        if (C0116.m4340() > 0) {
            ((h) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj2, (i) obj3);
        }
    }

    /* JADX INFO: renamed from: ۡۥۥ۟, reason: not valid java name and contains not printable characters */
    public static Drawable m4415(Object obj, Object obj2) {
        if (C0014.m545() > 0) {
            return Drawable.createFromStream((InputStream) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۢۧ, reason: not valid java name and contains not printable characters */
    public static wr.k m4416(Object obj) {
        if (C0172.m7180() >= 0) {
            return ((xr) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static Object m4417(Object obj) {
        if (C0141.m5769() > 0) {
            return ((te) obj).getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4418() {
        if (C0181.m7445() >= 0) {
            return vq.b();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۢۨۥ, reason: not valid java name and contains not printable characters */
    public static int m4419() {
        return 977 ^ C0113.f93;
    }

    /* JADX INFO: renamed from: ۢۧۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m4420() {
        if (C0035.m1268() <= 0) {
            return q7.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۢۧ, reason: not valid java name and contains not printable characters */
    public static int m4421(int i) {
        if (C0249.m10052() <= 0) {
            return r8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۦۢۢ, reason: not valid java name and contains not printable characters */
    public static q m4422(Object obj) {
        if (C0171.m7136() <= 0) {
            return ((so) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4423(Object obj) {
        if (C0051.m1783() <= 0) {
            return ((androidx.appcompat.widget.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).e;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨۡۢ, reason: not valid java name and contains not printable characters */
    public static int m4424(Object obj) {
        if (m4419() < 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static Runnable m4425(Object obj) {
        if (C0204.m8270() < 0) {
            return ((cl) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۡۦ, reason: contains not printable characters */
    public static Object m4426(Object obj, int i) {
        if (C0239.m9805() < 0) {
            return ((View) obj).getTag(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۨۡ, reason: contains not printable characters */
    public static Object m4427(Object obj, Object obj2) {
        if (C0010.m354() < 0) {
            return ((k3) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۧۧ, reason: contains not printable characters */
    public static boolean m4428(Object obj, boolean z) {
        if (C0235.m9535() <= 0) {
            return ((a) obj).O(z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۡۡۥ, reason: contains not printable characters */
    public static ColorFilter m4429(Object obj) {
        if (C0211.m8341() > 0) {
            return ((Drawable) obj).getColorFilter();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۨ۟, reason: contains not printable characters */
    public static boolean m4430(Object obj) {
        if (C0233.m9365() < 0) {
            return ((Collection) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ۟ۦۧ, reason: not valid java name and contains not printable characters */
    public static TransformationMethod m4432(Object obj, Object obj2) {
        if (C0187.m7613() >= 0) {
            return ((h8) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TransformationMethod) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static void m4433(Object obj) {
        if (C0191.m7812() >= 0) {
            ((j0.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).j();
        }
    }

    /* JADX INFO: renamed from: ۣۣۧۢ, reason: not valid java name and contains not printable characters */
    public static InputStream m4434(Object obj) {
        if (C0171.m7136() <= 0) {
            return ((HttpURLConnection) obj).getInputStream();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۢ۟, reason: not valid java name and contains not printable characters */
    public static y4 m4435(Object obj) {
        if (C0135.m5274() < 0) {
            return ((pr.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static AppCompatImageView m4436(Object obj, Object obj2, Object obj3) {
        if (C0010.m354() < 0) {
            return ((m1) obj).a((Context) obj2, (AttributeSet) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static a3[] m4437(Object obj) {
        if (C0058.m2184() > 0) {
            return ((dk) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۧۤ, reason: not valid java name and contains not printable characters */
    public static void m4438(Object obj) throws IOException {
        if (C0021.m740() < 0) {
            C0099.m3753((HookMain) obj);
        }
    }

    /* JADX INFO: renamed from: ۨۢۨ۠, reason: not valid java name and contains not printable characters */
    public static Method m4439() {
        if (C0072.m2856() <= 0) {
            return q7.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۨۨ, reason: not valid java name and contains not printable characters */
    public static String m4440(Object obj) {
        if (C0064.m2388() >= 0) {
            return q1.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m4441(Object obj, Object obj2, int i, Object obj3) {
        if (C0200.m8104() < 0) {
            return ((DialogInterface.OnKeyListener) obj).onKey((DialogInterface) obj2, i, (KeyEvent) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۣۡۧ, reason: contains not printable characters */
    public static String m4431(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
