package okhttp3.internal.cache2;

import android.animation.ValueAnimator;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.media.MediaExtractor;
import android.support.v4.app.C0004;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0009;
import android.text.PrecomputedText;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ActionProvider;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.activity.C0014;
import androidx.activity.C0020;
import androidx.activity.C0021;
import androidx.activity.ComponentActivity;
import androidx.annotation.C0023;
import androidx.annotation.C0024;
import androidx.annotation.C0026;
import androidx.appcompat.app.C0037;
import androidx.appcompat.view.menu.C0039;
import androidx.appcompat.widget.C0047;
import androidx.core.app.C0051;
import androidx.core.app.C0052;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0064;
import androidx.core.graphics.drawable.C0065;
import androidx.core.widget.C0068;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0072;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0079;
import androidx.emoji2.text.C0083;
import androidx.emoji2.text.C0084;
import androidx.fragment.app.C0096;
import androidx.fragment.app.C0097;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0116;
import androidx.savedstate.C0122;
import androidx.savedstate.C0123;
import androidx.savedstate.C0126;
import androidx.savedstate.C0127;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0129;
import androidx.versionedparcelable.C0133;
import androidx.versionedparcelable.C0135;
import com.example.vcam.C0141;
import com.example.vcam.HookMain;
import com.example.vcam.Menu;
import com.example.vcam.VideoToFrames;
import com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.c2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.cs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.il;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.je;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.nc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.nd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sh;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.us;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zs;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import okhttp3.C0238;
import okhttp3.C0239;
import okhttp3.C0240;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.logging.C0231;
import okhttp3.logging.C0233;
import org.xmlpull.v1.XmlPullParser;
import retrofit2.C0259;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: okhttp3.internal.cache2.۟ۧۡ۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0178 {

    /* JADX INFO: renamed from: ۤۤۧۦ, reason: not valid java name and contains not printable characters */
    public static int f628 = 866;

    /* JADX INFO: renamed from: ۣ۟۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static Surface m7323(Object obj) {
        if (C0115.m4218() < 0) {
            return ((HookMain) obj).C();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۠ۨۦ, reason: not valid java name and contains not printable characters */
    public static Runnable m7324(Object obj) {
        if (C0084.m3253() <= 0) {
            return ((m2) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static boolean m7325(Object obj) {
        if (C0021.m740() < 0) {
            return ((ActionProvider) obj).onPerformDefaultAction();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static void m7326(Object obj) {
        if (C0004.m139() < 0) {
            ((c) obj).e();
        }
    }

    /* JADX INFO: renamed from: ۟۟ۢۨۧ, reason: not valid java name and contains not printable characters */
    public static String m7327(Object obj) {
        if (C0215.m8604() <= 0) {
            return nc.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Locale) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static e3 m7328(float f, float f2, float f3, Object obj) {
        if (C0218.m8760() >= 0) {
            return e3.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(f, f2, f3, (us) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m7329(Object obj) {
        if (C0097.m3659() > 0) {
            return ((l1) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۢ۟۟, reason: not valid java name and contains not printable characters */
    public static int m7330(Object obj) {
        if (C0079.m3072() < 0) {
            return ((v0) obj).P;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۦۥ, reason: not valid java name and contains not printable characters */
    public static Paint.Join m7331() {
        if (C0162.m6837() < 0) {
            return Paint.Join.MITER;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۣ۠, reason: not valid java name and contains not printable characters */
    public static HookMain m7332(Object obj) {
        if (C0123.m4841() <= 0) {
            return ((HookMain.o) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m7333(Object obj) {
        if (C0128.m5064() < 0) {
            ((s6) obj).collapseActionView();
        }
    }

    /* JADX INFO: renamed from: ۟۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static void m7334(Object obj) {
        if (C0126.m4908() < 0) {
            ((v0) obj).A0();
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static Object m7335(Object obj, Object obj2) {
        if (C0187.m7613() >= 0) {
            return ((a9) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Object[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۡۡ, reason: not valid java name and contains not printable characters */
    public static String m7336(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۡۧۤ, reason: not valid java name and contains not printable characters */
    public static int m7337(Object obj) {
        if (C0122.m4736() <= 0) {
            return ((i.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧۡ, reason: not valid java name and contains not printable characters */
    public static Menu m7338(Object obj) {
        if (C0021.m740() < 0) {
            return ((Menu.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m7339(Object obj, int i) {
        if (C0083.m3188() <= 0) {
            ((android.view.Menu) obj).removeItem(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static String m7340(Object obj) {
        if (C0201.m8184() <= 0) {
            return ((m9.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static Object m7341() {
        if (C0069.m2756() <= 0) {
            return uq.d();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static EditText m7342(Object obj) {
        if (C0069.m2756() <= 0) {
            return ((a1) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static boolean m7343(Object obj) {
        if (C0215.m8604() < 0) {
            return ((e.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۦۡ, reason: not valid java name and contains not printable characters */
    public static int m7344() {
        return (-380) ^ C0065.f59;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۣ, reason: not valid java name and contains not printable characters */
    public static Object[] m7345(Object obj, Object obj2, int i, int i2, int i3, int i4) {
        if (C0024.m896() >= 0) {
            return c2.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Object[]) obj, (Object[]) obj2, i, i2, i3, i4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۥ, reason: not valid java name and contains not printable characters */
    public static boolean m7346(Object obj, Object obj2, float f, float f2) {
        if (C0240.m9826() > 0) {
            return hs.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ViewParent) obj, (View) obj2, f, f2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۢۦۧ, reason: not valid java name and contains not printable characters */
    public static void m7347(Object obj, boolean z) {
        if (C0213.m8458() >= 0) {
            ((ViewGroup) obj).setTransitionGroup(z);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۥ۠۠, reason: not valid java name and contains not printable characters */
    public static float[] m7348(Object obj) {
        if (C0133.m5208() < 0) {
            return ((zr) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۡ۟, reason: not valid java name and contains not printable characters */
    public static void m7349(Object obj) {
        if (C0023.m843() >= 0) {
            ((yf) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۟ۤۥۣۥ, reason: not valid java name and contains not printable characters */
    public static void m7350(Object obj, Object obj2) {
        if (C0058.m2184() >= 0) {
            ((View) obj).setBackgroundTintList((ColorStateList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۥۥۥ, reason: not valid java name and contains not printable characters */
    public static void m7351(Object obj, Object obj2) {
        if (C0213.m8458() >= 0) {
            ((LinearLayout) obj).setOnClickListener((View.OnClickListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۦۧۥ, reason: not valid java name and contains not printable characters */
    public static boolean m7352(Object obj, int i) {
        if (C0231.m9265() >= 0) {
            return ((BitSet) obj).get(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۣۨۨ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m7353(Object obj, Object obj2, Object obj3) {
        if (C0240.m9826() >= 0) {
            return m4.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Resources) obj, (XmlPullParser) obj2, (Resources.Theme) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۣ۠, reason: not valid java name and contains not printable characters */
    public static Class m7354() {
        if (C0127.m4950() >= 0) {
            return Float.TYPE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۣۤ, reason: not valid java name and contains not printable characters */
    public static lg m7356(Object obj) {
        if (C0162.m6837() <= 0) {
            return lg.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦ۠۠, reason: not valid java name and contains not printable characters */
    public static Drawable m7357(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0259.m10136() > 0) {
            return ((hm.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj2, (XmlPullParser) obj3, (AttributeSet) obj4, (Resources.Theme) obj5);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static Object m7358(Object obj) {
        if (C0014.m545() > 0) {
            return ((uf) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static l6.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m7359(Object obj) {
        if (C0116.m4340() > 0) {
            return ((l6) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static AtomicReferenceFieldUpdater m7360() {
        if (C0217.m8693() < 0) {
            return tf.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m7361(int i, int i2) {
        if (C0026.m1047() > 0) {
            return HookMain.U(i, i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۧۡ۠, reason: not valid java name and contains not printable characters */
    public static void m7362(Object obj, Object obj2) {
        if (C0129.m5108() > 0) {
            ((ComponentActivity) obj).q();
        }
    }

    /* JADX INFO: renamed from: ۟ۧۨۡ, reason: not valid java name and contains not printable characters */
    public static AtomicIntegerFieldUpdater m7363() {
        if (C0096.m3601() < 0) {
            return zs.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۢۡ, reason: not valid java name and contains not printable characters */
    public static long m7364() {
        if (C0039.m1515() <= 0) {
            return u6.d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۨۨۡ, reason: not valid java name and contains not printable characters */
    public static PrecomputedText.Params m7365(Object obj) {
        if (C0249.m10052() <= 0) {
            return kp.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TextView) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۦۧ, reason: not valid java name and contains not printable characters */
    public static Menu m7366(Object obj) {
        if (C0064.m2388() > 0) {
            return ((sh) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۣۥ, reason: not valid java name and contains not printable characters */
    public static boolean m7367(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0217.m8693() <= 0) {
            return ((e.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((e) obj2, obj3, obj4);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۦۧۢ, reason: not valid java name and contains not printable characters */
    public static AtomicIntegerFieldUpdater m7368() {
        if (C0009.m276() <= 0) {
            return nd.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static je m7369(Object obj) {
        if (C0239.m9805() < 0) {
            return ((il) obj).getReflected();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۡۢ, reason: not valid java name and contains not printable characters */
    public static String m7370(Object obj) {
        if (C0238.m9653() >= 0) {
            return ((HookMain) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۥۤ, reason: not valid java name and contains not printable characters */
    public static int m7371(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۡۨۨ, reason: not valid java name and contains not printable characters */
    public static void m7372(Object obj, int i) {
        if (C0116.m4340() > 0) {
            tk.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((PopupWindow) obj, i);
        }
    }

    /* JADX INFO: renamed from: ۢ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m7373(Object obj) {
        if (C0068.m2650() >= 0) {
            return ((Fragment) obj).x;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۢۡۡ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m7374(Object obj) {
        if (C0115.m4218() < 0) {
            return ((xp) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m7375(Object obj) {
        if (C0171.m7136() < 0) {
            return ((Method) obj).isAccessible();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۢۥۦ, reason: not valid java name and contains not printable characters */
    public static int[] m7376(Object obj) {
        if (C0006.m169() < 0) {
            return ((z1) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۡۤ, reason: not valid java name and contains not printable characters */
    public static String[] m7377() {
        if (C0072.m2856() < 0) {
            return a9.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۧۡ, reason: not valid java name and contains not printable characters */
    public static Context m7378(Object obj) {
        if (C0135.m5274() < 0) {
            return ((FrameLayout) obj).getContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧ, reason: not valid java name and contains not printable characters */
    public static s4 m7379() {
        if (C0052.m1890() >= 0) {
            return s4.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۢ, reason: not valid java name and contains not printable characters */
    public static Class m7380(Object obj) {
        if (C0231.m9265() > 0) {
            return ((cs) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۦ, reason: not valid java name and contains not printable characters */
    public static Response m7381(Object obj) {
        if (C0215.m8604() < 0) {
            return ((Call) obj).execute();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۦ, reason: not valid java name and contains not printable characters */
    public static void m7382(Object obj, boolean z, long j, Object obj2) {
        if (C0169.m7034() < 0) {
            Menu.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.m5700((Menu.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj, z, j, (String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤ۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static ClipDescription m7383(Object obj) {
        if (C0141.m5769() >= 0) {
            return ((ClipData) obj).getDescription();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۠۟, reason: not valid java name and contains not printable characters */
    public static void m7384(Object obj, Object obj2, Object obj3) {
        if (C0065.m2448() > 0) {
            ((Resources) obj).updateConfiguration((Configuration) obj2, (DisplayMetrics) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static Set m7385(Object obj) {
        if (C0135.m5274() < 0) {
            return C0078.m2994((l2) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۠ۦ, reason: contains not printable characters */
    public static HookMain m7386(Object obj) {
        if (C0047.m1663() <= 0) {
            return ((HookMain.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۣۣ, reason: contains not printable characters */
    public static int m7387(Object obj) {
        if (C0128.m5064() <= 0) {
            return ((Drawable) obj).getOpacity();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۨۥۡ, reason: contains not printable characters */
    public static String m7388(Object obj) {
        if (C0020.m701() > 0) {
            return ((xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۦۧ, reason: contains not printable characters */
    public static int m7389(Object obj) {
        if (C0211.m8341() > 0) {
            return ((SpannableStringBuilder) obj).length();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۦ۠ۢ, reason: contains not printable characters */
    public static ValueAnimator m7390(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, float f, Object obj6) {
        if (C0058.m2184() > 0) {
            return m0.d((Context) obj, (Resources) obj2, (Resources.Theme) obj3, (AttributeSet) obj4, (ValueAnimator) obj5, f, (XmlPullParser) obj6);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static int m7391(Object obj) {
        if (C0181.m7445() > 0) {
            return ((HashMap) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧ۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m7392(Object obj, Object obj2) {
        if (C0233.m9365() <= 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Drawable) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧۡ۟, reason: not valid java name and contains not printable characters */
    public static Cursor m7393(Object obj) {
        if (C0051.m1783() <= 0) {
            return ((k6) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m7394(Object obj) {
        if (C0051.m1783() <= 0) {
            return VideoToFrames.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((MediaExtractor) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m7395(Object obj, Object obj2, boolean z) {
        if (C0037.m1437() <= 0) {
            ((v0) obj).R((v0.k) obj2, z);
        }
    }

    /* JADX INFO: renamed from: ۧۨۦ۟, reason: not valid java name and contains not printable characters */
    public static jr.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m7396() {
        if (C0112.m4054() < 0) {
            return jr.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۦۢ, reason: not valid java name and contains not printable characters */
    public static int m7397(Object obj) {
        if (C0113.m4144() <= 0) {
            return ((ByteBuffer) obj).position();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static gp m7398(Object obj) {
        if (C0127.m4950() > 0) {
            return ((r1) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۤۤ, reason: not valid java name and contains not printable characters */
    public static int m7399(Object obj) {
        if (C0068.m2650() > 0) {
            return ((IntentFilter) obj).countActions();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m7355(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
