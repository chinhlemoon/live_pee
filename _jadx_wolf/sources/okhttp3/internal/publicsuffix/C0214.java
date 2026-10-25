package okhttp3.internal.publicsuffix;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.C0004;
import android.support.v4.graphics.drawable.C0009;
import android.support.v4.graphics.drawable.C0010;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.activity.C0017;
import androidx.activity.C0020;
import androidx.activity.C0021;
import androidx.activity.ComponentActivity;
import androidx.annotation.C0023;
import androidx.annotation.C0026;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0034;
import androidx.appcompat.app.C0037;
import androidx.core.app.C0052;
import androidx.core.app.C0053;
import androidx.core.app.C0055;
import androidx.core.content.C0057;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0065;
import androidx.core.graphics.drawable.C0066;
import androidx.core.widget.C0068;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0083;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0096;
import androidx.fragment.app.C0097;
import androidx.lifecycle.C0107;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0119;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0123;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0129;
import androidx.versionedparcelable.C0133;
import androidx.versionedparcelable.C0135;
import com.example.vcam.C0141;
import com.example.vcam.HookMain;
import com.example.vcam.MainActivity;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.b0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.c2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ii;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ki;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mi;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.nj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.nk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.so;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.w3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z1;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.net.Socket;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.zip.Inflater;
import kotlin.jvm.internal.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import okhttp3.C0238;
import okhttp3.C0239;
import okhttp3.HttpUrl;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.io.C0195;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0231;
import okhttp3.logging.C0234;
import okhttp3.logging.C0236;
import org.xmlpull.v1.XmlPullParser;
import retrofit2.C0259;
import retrofit2.converter.scalars.C0243;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: okhttp3.internal.publicsuffix.ۣ۟ۡۢ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0214 {

    /* JADX INFO: renamed from: ۦۣ۠ۡ, reason: contains not printable characters */
    public static int f664 = 306;

    /* JADX INFO: renamed from: ۣۣ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m8506(Object obj) {
        if (C0053.m1959() > 0) {
            return ((View) obj).isLaidOut();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۥۢۡ, reason: not valid java name and contains not printable characters */
    public static boolean m8507(Object obj, Object obj2) {
        if (C0129.m5108() >= 0) {
            return ((pr.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((int[]) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۦۣ۠, reason: not valid java name and contains not printable characters */
    public static int m8508(Object obj) {
        if (C0068.m2650() > 0) {
            return ((pr) obj).getIntrinsicWidth();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۧۡۧ, reason: not valid java name and contains not printable characters */
    public static TransitionSet m8509(Object obj, Object obj2) {
        if (C0053.m1959() > 0) {
            return ((TransitionSet) obj).addTransition((Transition) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۤۤ, reason: not valid java name and contains not printable characters */
    public static AtomicIntegerFieldUpdater m8510() {
        if (C0218.m8760() > 0) {
            return k3.b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static Paint.Style m8511() {
        if (C0243.m9964() > 0) {
            return Paint.Style.FILL;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۨۤ, reason: not valid java name and contains not printable characters */
    public static Context m8512(Object obj) {
        if (C0201.m8184() <= 0) {
            return ((so) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static byte[] m8513(Object obj, int i, int i2) {
        if (C0010.m354() <= 0) {
            return c2.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((byte[]) obj, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۥ۠, reason: not valid java name and contains not printable characters */
    public static Object m8514(Object obj, int i, Object obj2) {
        if (C0026.m1047() >= 0) {
            return ((List) obj).set(i, obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۦۤ, reason: not valid java name and contains not printable characters */
    public static void m8515(Object obj, Object obj2) {
        if (C0135.m5274() <= 0) {
            ((CancellationException) obj).setStackTrace((StackTraceElement[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static ViewGroup m8516(Object obj) {
        if (C0052.m1890() >= 0) {
            return ((v0) obj).T();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۥۤ, reason: not valid java name and contains not printable characters */
    public static void m8517(Object obj, boolean z) {
        if (C0213.m8458() > 0) {
            ((ki) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(z);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۥۡۨ, reason: not valid java name and contains not printable characters */
    public static void m8518(Object obj, Object obj2) {
        if (C0199.m7998() <= 0) {
            ((tp) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((y5) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۦۤۦ, reason: not valid java name and contains not printable characters */
    public static boolean m8519(Object obj, Object obj2, Object obj3) {
        if (C0133.m5208() <= 0) {
            return ((q.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((q) obj2, (Menu) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static int m8520(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0034.m1206() <= 0) {
            return m0.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Resources) obj, (Resources.Theme) obj2, (AttributeSet) obj3, (XmlPullParser) obj4);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static Object m8521(Object obj) {
        if (C0004.m139() <= 0) {
            return ((xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).getBoundReceiver();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۤ, reason: not valid java name and contains not printable characters */
    public static void m8522(Object obj, Object obj2) {
        if (C0023.m843() >= 0) {
            ((ThreadLocal) obj).set(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۡۦۨ, reason: not valid java name and contains not printable characters */
    public static Rect m8523(Object obj) {
        if (C0195.m7914() >= 0) {
            return ((Image) obj).getCropRect();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۧۢ, reason: not valid java name and contains not printable characters */
    public static CharSequence m8524(Object obj) {
        if (C0037.m1437() < 0) {
            return ((uo.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۦۢ, reason: not valid java name and contains not printable characters */
    public static String m8525(String str) {
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

    /* JADX INFO: renamed from: ۣۣ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static MenuItem m8526(Object obj, char c, int i) {
        if (C0239.m9805() < 0) {
            return ii.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((MenuItem) obj, c, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static rn m8527(Object obj) {
        if (C0215.m8604() <= 0) {
            return ((p2) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۥ۠, reason: not valid java name and contains not printable characters */
    public static CharSequence m8528(Object obj) {
        if (C0093.m3365() >= 0) {
            return ((p) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۦۥ, reason: not valid java name and contains not printable characters */
    public static void m8529(Object obj) {
        if (C0096.m3601() <= 0) {
            ((v0) obj).V();
        }
    }

    /* JADX INFO: renamed from: ۟ۤۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static Object m8530(Object obj) {
        if (C0259.m10136() >= 0) {
            return ((kk) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧ۟۠, reason: not valid java name and contains not printable characters */
    public static boolean m8531(Object obj) {
        if (C0009.m276() < 0) {
            return ((z1) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Drawable m8532(Object obj, Object obj2) {
        if (C0031.m1148() <= 0) {
            return ((qo) obj).l((Cursor) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۤ, reason: not valid java name and contains not printable characters */
    public static ThreadLocal m8533() {
        if (C0017.m627() >= 0) {
            return mp.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static boolean m8534(Object obj, Object obj2, float f, float f2) {
        if (C0231.m9265() >= 0) {
            return hs.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ViewParent) obj, (View) obj2, f, f2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۣۡۨ, reason: not valid java name and contains not printable characters */
    public static com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m8535(Object obj) {
        if (C0107.m3883() > 0) {
            return ((HookMain) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۧۤ, reason: not valid java name and contains not printable characters */
    public static int m8536(Object obj) {
        if (C0052.m1890() >= 0) {
            return ((Cursor) obj).getCount();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۦۦۤ, reason: not valid java name and contains not printable characters */
    public static void m8537(Object obj, Object obj2) {
        if (C0225.m9001() >= 0) {
            ((wr.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۨۤ, reason: not valid java name and contains not printable characters */
    public static void m8538(Object obj) {
        if (C0231.m9265() > 0) {
            jd.g((String) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m8539(Object obj, Object obj2) {
        if (C0128.m5064() < 0) {
            ((pr) obj).draw((Canvas) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۡۥۧ, reason: not valid java name and contains not printable characters */
    public static x.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m8540(Object obj) {
        if (C0115.m4218() < 0) {
            return ((x.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۡ, reason: not valid java name and contains not printable characters */
    public static Object m8541(Object obj) {
        if (C0034.m1206() <= 0) {
            return ((uo) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static b0.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m8542() {
        if (C0021.m740() < 0) {
            return b0.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static void m8543(Object obj, Object obj2) {
        if (C0119.m4573() >= 0) {
            ((AnimatorSet) obj).playTogether((Collection<Animator>) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static View m8544(Object obj, int i) {
        if (C0096.m3601() < 0) {
            return ((View) obj).findViewById(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥ۠, reason: not valid java name and contains not printable characters */
    public static void m8545(Object obj, Object obj2) {
        if (C0066.m2514() > 0) {
            ((u0) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۥۤۤ, reason: not valid java name and contains not printable characters */
    public static boolean m8546(Object obj) {
        if (C0097.m3659() >= 0) {
            return ((Inflater) obj).needsInput();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۡۦۣ, reason: not valid java name and contains not printable characters */
    public static Drawable m8547(Object obj, Object obj2, int i, boolean z, Object obj3) {
        if (C0234.m9461() < 0) {
            return ((hm) obj).m((Context) obj2, i, z, (Drawable) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۨ, reason: not valid java name and contains not printable characters */
    public static TextView m8548(Object obj) {
        if (C0094.m3450() >= 0) {
            return ((MainActivity) obj).z;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦ۠ۦ, reason: not valid java name and contains not printable characters */
    public static PorterDuffColorFilter m8549(Object obj, int i, Object obj2, Object obj3) {
        if (C0120.m4608() >= 0) {
            return ((hm.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).b(i, (PorterDuff.Mode) obj2, (PorterDuffColorFilter) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۧۧ, reason: not valid java name and contains not printable characters */
    public static int m8550(int i) {
        if (C0239.m9805() < 0) {
            return dl.q(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢ۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static int m8551(Object obj, Object obj2, int i, Object obj3) {
        if (C0055.m2054() > 0) {
            return ((AppOpsManager) obj).checkOpNoThrow((String) obj2, i, (String) obj3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢۤۦ, reason: not valid java name and contains not printable characters */
    public static y4 m8552(int i) {
        if (C0009.m276() <= 0) {
            return y4.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m8553(Object obj) {
        if (C0141.m5769() > 0) {
            return ((com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m8554(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m8555(Object obj) {
        if (C0213.m8458() > 0) {
            ((Set) obj).clear();
        }
    }

    /* JADX INFO: renamed from: ۣۢ۟, reason: not valid java name and contains not printable characters */
    public static double m8556(double d, double d2) {
        if (C0031.m1148() <= 0) {
            return Math.pow(d, d2);
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: ۣۥۧ, reason: not valid java name and contains not printable characters */
    public static Object m8557(Object obj) {
        if (C0236.m9615() > 0) {
            return ((xd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m8558(Object obj) {
        if (C0017.m627() >= 0) {
            return ((MotionEvent) obj).getActionIndex();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨۦۣ, reason: not valid java name and contains not printable characters */
    public static boolean m8559(Object obj, Object obj2) {
        if (C0176.m7290() >= 0) {
            return ((mi) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((MenuItem) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m8560(Object obj) {
        if (C0243.m9964() >= 0) {
            return ((Activity) obj).isFinishing();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static mf m8561(Object obj) {
        if (C0010.m354() <= 0) {
            return mf.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static void m8562(Object obj, Object obj2, Object obj3) {
        if (C0096.m3601() <= 0) {
            ((xd) obj).I((jj) obj2, (Throwable) obj3);
        }
    }

    /* JADX INFO: renamed from: ۤۢۡۤ, reason: not valid java name and contains not printable characters */
    public static void m8563(Object obj, Object obj2) {
        if (C0178.m7344() <= 0) {
            ((CompoundButton) obj).setButtonTintMode((PorterDuff.Mode) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۤۤۨ, reason: not valid java name and contains not printable characters */
    public static int[] m8564() {
        if (C0249.m10052() < 0) {
            return m1.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۢۢ, reason: not valid java name and contains not printable characters */
    public static Bundle m8565(Object obj) {
        if (C0065.m2448() >= 0) {
            return ((ComponentActivity) obj).p();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۤ, reason: not valid java name and contains not printable characters */
    public static boolean m8566(Object obj, int i) {
        if (C0133.m5208() < 0) {
            return ((AnimationDrawable) obj).setLevel(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۧۨۤ, reason: not valid java name and contains not printable characters */
    public static void m8567(Object obj, Object obj2) {
        if (C0164.m6900() <= 0) {
            r7.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Drawable) obj, (Outline) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۨۡ, reason: not valid java name and contains not printable characters */
    public static Boolean m8568() {
        if (C0259.m10136() >= 0) {
            return u0.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۢۡ, reason: not valid java name and contains not printable characters */
    public static int m8569(Object obj) {
        if (C0112.m4054() < 0) {
            return ((f6.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).workerCtl;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۥۨۧ, reason: contains not printable characters */
    public static sn m8570(Object obj, boolean z) {
        if (C0020.m701() >= 0) {
            return rj.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((File) obj, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۧ, reason: contains not printable characters */
    public static InputStream m8571(Object obj) {
        if (C0074.m2951() <= 0) {
            return ((Socket) obj).getInputStream();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۟۠, reason: contains not printable characters */
    public static k3 m8572(Object obj) {
        if (C0234.m9461() < 0) {
            return ((u3) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۧۨ, reason: contains not printable characters */
    public static void m8573(Object obj, Object obj2, Object obj3) {
        if (C0201.m8184() < 0) {
            ((wr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).b((View) obj2, (Boolean) obj3);
        }
    }

    /* JADX INFO: renamed from: ۦۡ۠۠, reason: contains not printable characters */
    public static int m8574(Object obj, int i) {
        if (C0178.m7344() <= 0) {
            return gn.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((fn) obj, i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۢ۠۟, reason: contains not printable characters */
    public static int m8575() {
        return 300 ^ C0123.f102;
    }

    /* JADX INFO: renamed from: ۦۣۣ۟, reason: contains not printable characters */
    public static boolean m8576(Object obj) {
        if (C0083.m3188() <= 0) {
            return ((TextView) obj).isAttachedToWindow();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۣۨۤ, reason: contains not printable characters */
    public static float m8577(Object obj, Object obj2) {
        if (C0031.m1148() < 0) {
            return ((n3) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((o3) obj2);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۦۤۡ۟, reason: contains not printable characters */
    public static int m8578(Object obj) {
        if (C0219.m8794() >= 0) {
            return ((m9.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۥۧ, reason: not valid java name and contains not printable characters */
    public static void m8580(Object obj, Object obj2, int i) {
        if (C0062.m2326() >= 0) {
            nj.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj, (String) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۧۧۤ۠, reason: not valid java name and contains not printable characters */
    public static Object m8581(Object obj, int i) {
        if (C0161.m6744() >= 0) {
            return ((List) obj).remove(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨ۟ۤ, reason: not valid java name and contains not printable characters */
    public static w3 m8582(Object obj, Object obj2) {
        if (C0238.m9653() >= 0) {
            return ((xd) obj).l((sc) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۡۡ, reason: not valid java name and contains not printable characters */
    public static Runnable m8583(Object obj) {
        if (C0236.m9615() >= 0) {
            return ((r7) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m8584(Object obj) {
        if (C0202.m8245() >= 0) {
            return ((n9.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۨ۟, reason: not valid java name and contains not printable characters */
    public static s2 m8585(Object obj) {
        if (C0057.m2142() > 0) {
            return ((nk) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۤۢ, reason: not valid java name and contains not printable characters */
    public static boolean m8586(Object obj) {
        if (C0201.m8184() < 0) {
            return ((r6) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨۨۤ, reason: not valid java name and contains not printable characters */
    public static int m8587(Object obj) {
        if (C0023.m843() > 0) {
            return ((t1) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۤۡۦ, reason: not valid java name and contains not printable characters */
    public static String m8579(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
