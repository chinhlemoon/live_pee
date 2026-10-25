package androidx.fragment.app;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.C0004;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0009;
import android.support.v4.graphics.drawable.C0010;
import android.support.v4.graphics.drawable.C0011;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.C0014;
import androidx.activity.ComponentActivity;
import androidx.annotation.C0023;
import androidx.appcompat.view.menu.C0039;
import androidx.appcompat.widget.C0047;
import androidx.core.app.C0052;
import androidx.core.app.C0053;
import androidx.core.app.C0055;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0064;
import androidx.core.graphics.drawable.C0065;
import androidx.core.graphics.drawable.C0066;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0072;
import androidx.emoji2.text.C0079;
import androidx.emoji2.text.C0084;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0119;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0122;
import androidx.savedstate.C0126;
import androidx.savedstate.C0127;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0133;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.HookMain;
import com.example.vcam.LicenseManager;
import com.example.vcam.MainActivity;
import com.example.vcam.Menu;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.as;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.b5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gh;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ii;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.iq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.od;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ql;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.up;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ws;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z1;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.internal.C0227;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.ws.C0224;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0233;
import okhttp3.logging.C0235;
import org.xmlpull.v1.XmlPullParser;
import retrofit2.C0259;

/* JADX INFO: renamed from: androidx.fragment.app.۟ۦۥۦۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0095 {

    /* JADX INFO: renamed from: ۤۧۥ۠, reason: not valid java name and contains not printable characters */
    public static int f82 = 505;

    /* JADX INFO: renamed from: ۟۟ۢۦ۟, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m3456(Object obj) {
        if (C0052.m1890() > 0) {
            return ((uo.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).w;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static MenuItem m3457(Object obj, Object obj2) {
        if (C0215.m8604() < 0) {
            return ii.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((MenuItem) obj, (CharSequence) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧۥۧ, reason: not valid java name and contains not printable characters */
    public static z1 m3458(Object obj) {
        if (C0227.m9046() >= 0) {
            return z1.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧۦۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3459(Object obj) {
        if (C0053.m1959() > 0) {
            return ((uo.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m3460(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۠ۤۤۦ, reason: not valid java name and contains not printable characters */
    public static boolean m3461(Object obj) {
        if (C0010.m354() < 0) {
            return ((hd) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۦۧۨ, reason: not valid java name and contains not printable characters */
    public static int[] m3462() {
        if (C0218.m8760() >= 0) {
            return ql.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static void m3463(Object obj, Object obj2, int i) {
        if (C0187.m7613() > 0) {
            ((TextView) obj).setTextAppearance((Context) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۢۦۦ, reason: not valid java name and contains not printable characters */
    public static Intent m3464(Object obj, Object obj2, Object obj3) {
        if (C0233.m9365() < 0) {
            return ((kp.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ResolveInfo) obj2, (TextView) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۡۨ, reason: not valid java name and contains not printable characters */
    public static Interpolator m3465() {
        if (C0225.m9001() >= 0) {
            return ws.r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۧۦ, reason: not valid java name and contains not printable characters */
    public static void m3466(Object obj, Object obj2) {
        if (C0099.m3752() < 0) {
            ((Application) obj).registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۦ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m3467(Object obj, Object obj2) {
        if (C0187.m7613() >= 0) {
            ((View) obj).setAccessibilityPaneTitle((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3468(Object obj) {
        if (C0072.m2856() <= 0) {
            return ((m3) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static Menu m3469(Object obj) {
        if (C0217.m8693() <= 0) {
            return ((gh) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۡۥ, reason: not valid java name and contains not printable characters */
    public static void m3470(Object obj, boolean z) {
        if (C0064.m2388() >= 0) {
            ((a) obj).v(z);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۤۦۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3471(Object obj, int i, int i2) {
        if (C0009.m276() <= 0) {
            return HookMain.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((MediaPlayer) obj, i, i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۥۨۦ, reason: not valid java name and contains not printable characters */
    public static void m3472(Object obj, Object obj2, boolean z) {
        if (C0065.m2448() >= 0) {
            Menu.m5594((Menu) obj, (CompoundButton) obj2, z);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۧۥۦ, reason: not valid java name and contains not printable characters */
    public static void m3473(Object obj, int i) {
        if (C0215.m8604() <= 0) {
            ((q) obj).i(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۨۡۧ, reason: not valid java name and contains not printable characters */
    public static Logger m3474() {
        if (C0214.m8575() <= 0) {
            return sj.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۥۡ, reason: not valid java name and contains not printable characters */
    public static MotionEvent m3475(Object obj) {
        if (C0162.m6837() < 0) {
            return MotionEvent.obtainNoHistory((MotionEvent) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m3476(Object obj) {
        if (C0178.m7344() <= 0) {
            return ((View) obj).isScreenReaderFocusable();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۣۢ۟, reason: not valid java name and contains not printable characters */
    public static float m3477(Object obj, int i) {
        if (C0199.m7998() <= 0) {
            return ((MotionEvent) obj).getX(i);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۥۢۤۡ, reason: not valid java name and contains not printable characters */
    public static int m3478() {
        return 880 ^ C0235.f685;
    }

    /* JADX INFO: renamed from: ۟ۥۢۦ۠, reason: not valid java name and contains not printable characters */
    public static String m3479(int i) {
        if (C0120.m4608() > 0) {
            return o5.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۦۡ, reason: not valid java name and contains not printable characters */
    public static void m3480(Object obj, Object obj2) {
        if (C0064.m2388() > 0) {
            ConnectionBlocker.m5372((ConnectionBlocker) obj, (ConnectionBlocker.NetworkLog) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static void m3481(Object obj, int i, Object obj2) {
        if (C0224.m8861() < 0) {
            mk.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj, i, (mk.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static void m3482(Object obj) throws IOException {
        if (C0200.m8104() <= 0) {
            ((sn) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۤۨ۠, reason: not valid java name and contains not printable characters */
    public static int m3483(Object obj) {
        if (C0127.m4950() > 0) {
            return ((m2) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۦ۠۟, reason: not valid java name and contains not printable characters */
    public static StackTraceElement[] m3484(Object obj) {
        if (C0066.m2514() >= 0) {
            return ((Throwable) obj).getStackTrace();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۥ, reason: not valid java name and contains not printable characters */
    public static boolean m3485(Object obj) {
        if (C0133.m5208() <= 0) {
            return ((File) obj).canWrite();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۧ, reason: not valid java name and contains not printable characters */
    public static String m3486(Object obj) {
        if (C0127.m4950() > 0) {
            return ((XmlPullParser) obj).getPositionDescription();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۢ۟, reason: not valid java name and contains not printable characters */
    public static void m3487(Object obj) {
        if (C0023.m843() > 0) {
            lm.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Resources) obj);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۨ۟, reason: not valid java name and contains not printable characters */
    public static int m3488(Object obj) {
        if (C0004.m139() < 0) {
            return ((LinearLayout) obj).getVisibility();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۦۣۣ, reason: not valid java name and contains not printable characters */
    public static String m3489(String str) {
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

    /* JADX INFO: renamed from: ۟ۧۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static View m3490(Object obj) {
        if (C0194.m7889() >= 0) {
            return ((iq) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static void m3492(Object obj) {
        if (C0181.m7445() > 0) {
            mq.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj);
        }
    }

    /* JADX INFO: renamed from: ۠ۨۥۥ, reason: not valid java name and contains not printable characters */
    public static xd m3493(Object obj) {
        if (C0006.m169() <= 0) {
            return ((wd) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۢۨ, reason: not valid java name and contains not printable characters */
    public static void m3494(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0099.m3752() <= 0) {
            k1.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TextView) obj, (Drawable) obj2, (Drawable) obj3, (Drawable) obj4, (Drawable) obj5);
        }
    }

    /* JADX INFO: renamed from: ۡۧۢۢ, reason: not valid java name and contains not printable characters */
    public static int m3495(Object obj) {
        if (C0164.m6900() < 0) {
            return ((WindowInsets) obj).getSystemWindowInsetTop();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢۤ۠, reason: not valid java name and contains not printable characters */
    public static void m3496(Object obj, Object obj2) {
        if (C0062.m2326() >= 0) {
            ((ObjectAnimator) obj).setValues((PropertyValuesHolder[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۥۤۤ, reason: not valid java name and contains not printable characters */
    public static qa m3497(Object obj) {
        if (C0188.m7736() <= 0) {
            return ((od) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۧۢ, reason: not valid java name and contains not printable characters */
    public static void m3498(Object obj, Object obj2, Object obj3) {
        if (C0119.m4573() >= 0) {
            ((v0) obj).H0((Configuration) obj2, (mf) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣۥۢۡ, reason: not valid java name and contains not printable characters */
    public static String m3499(Object obj) {
        if (C0069.m2756() <= 0) {
            return ((LicenseManager) obj).n();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۢۦ, reason: not valid java name and contains not printable characters */
    public static Throwable m3500(Object obj) {
        if (C0194.m7889() > 0) {
            return ((ExecutionException) obj).getCause();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۨۧ, reason: not valid java name and contains not printable characters */
    public static void m3501(Object obj, Object obj2, int i) {
        if (C0259.m10136() >= 0) {
            hs.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ViewParent) obj, (View) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۣۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m3502(Object obj) {
        if (C0204.m8270() < 0) {
            return ((Paint.FontMetricsInt) obj).descent;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۦۢۥ, reason: not valid java name and contains not printable characters */
    public static String m3503(Object obj) {
        if (C0079.m3072() <= 0) {
            return ((ConnectionBlocker.BlockRule) obj).target;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۥ۠, reason: not valid java name and contains not printable characters */
    public static void m3504(Object obj, Object obj2) {
        if (C0187.m7613() >= 0) {
            ((l.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Bundle) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۧۥۨ, reason: not valid java name and contains not printable characters */
    public static void m3505(Object obj, int i, int i2, int i3, int i4) {
        if (C0117.m4419() <= 0) {
            ((View) obj).layout(i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: ۣۤۤۡ, reason: not valid java name and contains not printable characters */
    public static int m3506(Object obj) {
        if (C0069.m2756() < 0) {
            return ((m2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۥۨۢ, reason: not valid java name and contains not printable characters */
    public static int m3507(Object obj, Object obj2) {
        if (C0055.m2054() > 0) {
            return ((ViewGroup) obj).indexOfChild((View) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۠ۡۨ, reason: contains not printable characters */
    public static Throwable m3508(Object obj) {
        if (C0047.m1663() < 0) {
            return jd.c((Throwable) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۧۧ, reason: contains not printable characters */
    public static void m3509(Object obj, int i) {
        if (C0164.m6900() <= 0) {
            ((ArrayAdapter) obj).setDropDownViewResource(i);
        }
    }

    /* JADX INFO: renamed from: ۥۨ۠ۤ, reason: contains not printable characters */
    public static int m3510(Object obj) {
        if (C0128.m5064() < 0) {
            return ((KeyEvent) obj).getDeviceId();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦ۠ۥۡ, reason: contains not printable characters */
    public static Paint m3511(Object obj, Object obj2) {
        if (C0181.m7445() >= 0) {
            return ((pr.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ColorFilter) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۥۥ, reason: contains not printable characters */
    public static void m3512(Object obj, Object obj2) {
        if (C0099.m3752() < 0) {
            ((t7) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۣۦۤ, reason: contains not printable characters */
    public static Menu m3513(Object obj) {
        if (C0116.m4340() > 0) {
            return ((vg) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۨۢ, reason: contains not printable characters */
    public static OkHttpClient m3514(Object obj) {
        if (C0039.m1515() < 0) {
            return ((OkHttpClient.Builder) obj).build();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۥۨ, reason: contains not printable characters */
    public static void m3515(Object obj, Object obj2) {
        if (C0058.m2184() >= 0) {
            MainActivity.m5564((MainActivity) obj);
        }
    }

    /* JADX INFO: renamed from: ۣۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m3516(Object obj) {
        if (C0122.m4736() <= 0) {
            return ((k7) obj).e0();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۡۧۦ, reason: not valid java name and contains not printable characters */
    public static ComponentActivity m3517(Object obj) {
        if (C0126.m4908() < 0) {
            return ((b5) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۧۢ, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m3518(Object obj) {
        if (C0011.m458() >= 0) {
            return ((pr.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۨۤ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m3519(Object obj, long j, Object obj2) {
        if (C0065.m2448() > 0) {
            return ((OkHttpClient.Builder) obj).writeTimeout(j, (TimeUnit) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۤۢ, reason: not valid java name and contains not printable characters */
    public static boolean m3520(Object obj, Object obj2) {
        if (C0014.m545() <= 0) {
            return false;
        }
        return C0181.m7472((String) obj2);
    }

    /* JADX INFO: renamed from: ۨ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m3521(Object obj) {
        if (C0172.m7180() >= 0) {
            return as.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ViewGroup) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static void m3522(Object obj, Object obj2) {
        if (C0084.m3253() < 0) {
            ((View) obj).sendAccessibilityEventUnchecked((AccessibilityEvent) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۨۦ۠, reason: not valid java name and contains not printable characters */
    public static void m3523(Object obj) {
        if (C0096.m3601() < 0) {
            wr.d0((View) obj);
        }
    }

    /* JADX INFO: renamed from: ۨۤۤۢ, reason: not valid java name and contains not printable characters */
    public static f6.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m3524() {
        if (C0164.m6900() < 0) {
            return f6.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۥۨ, reason: not valid java name and contains not printable characters */
    public static up m3525(Object obj) {
        if (C0120.m4608() > 0) {
            return ((vl) obj).timeout();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۧۧ, reason: not valid java name and contains not printable characters */
    public static void m3526(Object obj, boolean z) {
        if (C0079.m3072() < 0) {
            ((Thread) obj).setDaemon(z);
        }
    }

    /* JADX INFO: renamed from: ۣ۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m3491(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
