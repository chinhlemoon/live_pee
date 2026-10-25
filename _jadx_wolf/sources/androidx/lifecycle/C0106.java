package androidx.lifecycle;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.SystemClock;
import android.support.v4.graphics.drawable.C0009;
import android.support.v4.graphics.drawable.C0010;
import android.support.v4.graphics.drawable.C0011;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.widget.CompoundButton;
import androidx.activity.C0021;
import androidx.activity.ComponentActivity;
import androidx.annotation.C0023;
import androidx.annotation.C0024;
import androidx.annotation.C0026;
import androidx.appcompat.app.C0034;
import androidx.appcompat.app.C0035;
import androidx.appcompat.app.C0036;
import androidx.appcompat.app.C0037;
import androidx.appcompat.widget.C0047;
import androidx.cardview.widget.C0049;
import androidx.cardview.widget.CardView;
import androidx.core.content.C0057;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0065;
import androidx.core.graphics.drawable.C0066;
import androidx.core.widget.C0068;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0072;
import androidx.emoji2.text.C0083;
import androidx.emoji2.text.C0084;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0095;
import androidx.fragment.app.C0096;
import androidx.fragment.app.C0097;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0119;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0123;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0129;
import androidx.versionedparcelable.C0135;
import com.example.vcam.C0141;
import com.example.vcam.HookMain;
import com.example.vcam.MainActivity;
import com.example.vcam.Menu;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.cp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ek;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.g5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kh;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.of;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tb;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ua;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ws;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ze;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zs;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Constructor;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.CancellationException;
import okhttp3.C0238;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0195;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0231;
import okhttp3.logging.C0232;
import okhttp3.logging.C0233;
import okhttp3.logging.C0236;
import org.xmlpull.v1.XmlPullParser;
import retrofit2.Call;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: androidx.lifecycle.۟ۧ۟۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0106 {

    /* JADX INFO: renamed from: ۟ۥۣۤۡ, reason: not valid java name and contains not printable characters */
    public static int f88 = -349;

    /* JADX INFO: renamed from: ۟۟۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static XmlResourceParser m3791(Object obj, int i) {
        if (C0072.m2856() <= 0) {
            return ((Resources) obj).getXml(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۧۧ, reason: not valid java name and contains not printable characters */
    public static int m3792(Object obj) {
        if (C0233.m9365() <= 0) {
            return ((f6.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۥ۠ۤ, reason: not valid java name and contains not printable characters */
    public static CancellationException m3793(Object obj) {
        if (C0096.m3601() <= 0) {
            return ((lk) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۥۢ, reason: not valid java name and contains not printable characters */
    public static boolean m3794(Object obj, Object obj2, Object obj3) {
        if (C0117.m4419() <= 0) {
            return ((wr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).c((Boolean) obj2, (Boolean) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠۟ۦۧ, reason: not valid java name and contains not printable characters */
    public static boolean m3795(Object obj) {
        if (C0095.m3478() <= 0) {
            return ((CardView.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static ComponentActivity m3796(Object obj) {
        if (C0148.m6464() <= 0) {
            return ((z4) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static void m3797(Object obj, Object obj2, Object obj3) {
        if (C0068.m2650() >= 0) {
            ((LiveData) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ze) obj2, (qj) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۦ۟ۢ, reason: not valid java name and contains not printable characters */
    public static long m3798() {
        if (C0169.m7034() < 0) {
            return SystemClock.uptimeMillis();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m3799(Object obj, boolean z) {
        if (C0113.m4144() <= 0) {
            ((ws) obj).y(z);
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static int m3800(Object obj) {
        if (C0047.m1663() < 0) {
            return ((LocaleList) obj).hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۢۥ۠, reason: not valid java name and contains not printable characters */
    public static Object m3801(Object obj) {
        if (C0072.m2856() <= 0) {
            return fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠۠, reason: not valid java name and contains not printable characters */
    public static void m3802(Object obj, Object obj2, int i) {
        if (C0161.m6744() >= 0) {
            ((EditorInfo) obj).setInitialSurroundingSubText((CharSequence) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static int m3803(Object obj) {
        if (C0201.m8184() < 0) {
            return ((o5.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۢ, reason: not valid java name and contains not printable characters */
    public static void m3804(Object obj) {
        if (C0119.m4573() >= 0) {
            ((lf.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۟ۢۧۢۤ, reason: not valid java name and contains not printable characters */
    public static String m3805(Object obj) {
        if (C0201.m8184() < 0) {
            return ((a9.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static boolean m3806(Object obj, Object obj2) {
        if (C0231.m9265() > 0) {
            return TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static int m3807(Object obj) {
        if (C0249.m10052() <= 0) {
            return ((fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.g) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨۤ, reason: not valid java name and contains not printable characters */
    public static int m3808(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۦۨۨ, reason: not valid java name and contains not printable characters */
    public static dr m3809() {
        if (C0097.m3659() > 0) {
            return dr.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Set m3810(Object obj) {
        if (C0218.m8760() > 0) {
            return ((TreeMap) obj).keySet();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۦۦ, reason: not valid java name and contains not printable characters */
    public static void m3811(Object obj, Object obj2) {
        if (C0141.m5769() >= 0) {
            ((uo.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).a((MenuItem) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static tb m3812() {
        if (C0084.m3253() < 0) {
            return tb.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۦۨ, reason: not valid java name and contains not printable characters */
    public static char m3813(char c) {
        if (C0037.m1437() <= 0) {
            return Character.toLowerCase(c);
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: ۟ۤۦۢۢ, reason: not valid java name and contains not printable characters */
    public static void m3814(Object obj) {
        if (C0057.m2142() > 0) {
            ((l1) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۟ۤۦۢۤ, reason: not valid java name and contains not printable characters */
    public static Bitmap m3815(Object obj) {
        if (C0225.m9001() > 0) {
            return ((f1) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۦ, reason: not valid java name and contains not printable characters */
    public static boolean m3816(Object obj) {
        if (C0225.m9001() > 0) {
            return ((vo) obj).collapseActionView();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m3817(Object obj, Object obj2) {
        if (C0035.m1268() <= 0) {
            ((rr) obj).s((byte[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static LayoutInflater.Factory2 m3818(Object obj) {
        if (C0199.m7998() < 0) {
            return ((LayoutInflater) obj).getFactory2();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۣۢ, reason: not valid java name and contains not printable characters */
    public static dp m3819(Object obj, Object obj2, boolean z, int i) {
        if (C0115.m4218() <= 0) {
            return zs.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((zs) obj, (dp) obj2, z, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۦ۠, reason: not valid java name and contains not printable characters */
    public static void m3820(Object obj, Object obj2) {
        if (C0236.m9615() > 0) {
            e6.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((y5) obj, (Throwable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۢۦۥ, reason: not valid java name and contains not printable characters */
    public static ek m3821() {
        if (C0117.m4419() <= 0) {
            return ek.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۡۨ, reason: not valid java name and contains not printable characters */
    public static Object m3822(Object obj, Object obj2, Object obj3) {
        if (C0128.m5064() <= 0) {
            return ((y5) obj).m(obj2, (ua) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۦۣ, reason: not valid java name and contains not printable characters */
    public static Object m3823(Object obj) {
        if (C0094.m3450() > 0) {
            return ((lg.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m3824(Object obj, int i, int i2) {
        if (C0057.m2142() >= 0) {
            ((LayerDrawable) obj).setId(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۡۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m3825(Object obj) {
        if (C0225.m9001() > 0) {
            return wr.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۡۧۦ, reason: not valid java name and contains not printable characters */
    public static int m3826(Object obj, Object obj2, int i) {
        if (C0204.m8270() < 0) {
            return ((rn) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj2, i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۟ۦ, reason: not valid java name and contains not printable characters */
    public static Object m3827(Object obj, Object obj2) {
        if (C0195.m7914() >= 0) {
            return ((h2) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۨ, reason: not valid java name and contains not printable characters */
    public static String m3828(String str) {
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

    /* JADX INFO: renamed from: ۟ۦۤۦۣ, reason: not valid java name and contains not printable characters */
    public static void m3829(Object obj) {
        if (C0204.m8270() <= 0) {
            ((bo.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).j();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۥۧۦ, reason: not valid java name and contains not printable characters */
    public static void m3830(Object obj, Object obj2) {
        if (C0037.m1437() <= 0) {
            g5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((CompoundButton) obj, (PorterDuff.Mode) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۧۢۦ, reason: not valid java name and contains not printable characters */
    public static MainActivity.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m3831(Object obj) {
        if (C0011.m458() > 0) {
            return ((fg) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۥۧ, reason: not valid java name and contains not printable characters */
    public static int m3832(Object obj) {
        if (C0094.m3450() >= 0) {
            return ((KeyEvent) obj).getKeyCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static int[] m3833(Object obj) {
        if (C0068.m2650() >= 0) {
            return ((rn) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡ۠۟, reason: not valid java name and contains not printable characters */
    public static bo.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m3834(Object obj) {
        if (C0172.m7180() >= 0) {
            return ((bo) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۢۢ, reason: not valid java name and contains not printable characters */
    public static int m3835() {
        return 952 ^ C0096.f83;
    }

    /* JADX INFO: renamed from: ۟ۧۡۤۡ, reason: not valid java name and contains not printable characters */
    public static void m3836(Object obj, int i, int i2, int i3, int i4) {
        if (C0240.m9826() >= 0) {
            ((zr) obj).j(i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۥۧ, reason: not valid java name and contains not printable characters */
    public static Uri m3837(Object obj) {
        if (C0123.m4841() <= 0) {
            return ((bd) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧ۠, reason: not valid java name and contains not printable characters */
    public static int m3838(Object obj) {
        if (C0182.m7528() < 0) {
            return ((n9.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۧۧۥ, reason: not valid java name and contains not printable characters */
    public static Object m3839(Object obj) {
        if (C0049.m1767() < 0) {
            return ((xd.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡ۟۠, reason: not valid java name and contains not printable characters */
    public static int m3840(Object obj) {
        if (C0036.m1332() <= 0) {
            return ((kh) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static float m3841(Object obj) {
        if (C0023.m843() > 0) {
            return ((Menu.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static HookMain.i m3842(Object obj) {
        if (C0010.m354() <= 0) {
            return ((HookMain.i.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۦ۟, reason: not valid java name and contains not printable characters */
    public static int m3843(Object obj, int i) {
        if (C0069.m2756() < 0) {
            return ((cp) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۥ۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3844(Object obj) {
        if (C0026.m1047() > 0) {
            return ((ws) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۦۦۥ, reason: not valid java name and contains not printable characters */
    public static boolean m3845(Object obj) {
        if (C0097.m3659() > 0) {
            return ((kp.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۨۨۥ, reason: not valid java name and contains not printable characters */
    public static boolean m3846(Object obj) {
        if (C0211.m8341() > 0) {
            return ((xd.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۡۤۤ, reason: not valid java name and contains not printable characters */
    public static String m3847(Object obj) {
        if (C0069.m2756() <= 0) {
            return ((InetAddress) obj).getHostName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۧ, reason: not valid java name and contains not printable characters */
    public static Locale m3848(Object obj, int i) {
        if (C0120.m4608() > 0) {
            return ((of) obj).get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۡۢ, reason: not valid java name and contains not printable characters */
    public static pr.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m3849(Object obj) {
        if (C0238.m9653() > 0) {
            return ((pr.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۥۧ, reason: not valid java name and contains not printable characters */
    public static void m3850(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0034.m1206() <= 0) {
            ((z9) obj).i(obj2, (ArrayList) obj3, (ArrayList) obj4);
        }
    }

    /* JADX INFO: renamed from: ۡۦۡ, reason: not valid java name and contains not printable characters */
    public static void m3851(Object obj, float f, float f2) {
        if (C0021.m740() < 0) {
            ((MediaPlayer) obj).setVolume(f, f2);
        }
    }

    /* JADX INFO: renamed from: ۢۡۢۨ, reason: not valid java name and contains not printable characters */
    public static void m3852(Object obj, Object obj2) {
        if (C0238.m9653() > 0) {
            ((WindowManager) obj).removeView((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۢۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3853(Object obj) {
        if (C0095.m3478() <= 0) {
            return ((ws) obj).m;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static Void m3854(Object obj, int i) {
        if (C0120.m4608() > 0) {
            return ((o8) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢ۟, reason: not valid java name and contains not printable characters */
    public static long m3855(Object obj) {
        if (C0211.m8341() > 0) {
            return ((s8) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۢۥ, reason: not valid java name and contains not printable characters */
    public static void m3856(Object obj, boolean z) {
        if (C0238.m9653() > 0) {
            ((q) obj).k(z);
        }
    }

    /* JADX INFO: renamed from: ۣۣۣۡ, reason: not valid java name and contains not printable characters */
    public static int m3857(Object obj, int i) {
        if (C0058.m2184() >= 0) {
            return ((u1) obj).b(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۦۧ, reason: not valid java name and contains not printable characters */
    public static int m3858(Object obj, int i, int i2) {
        if (C0123.m4841() <= 0) {
            return ((u1.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۦۤۡ, reason: not valid java name and contains not printable characters */
    public static boolean m3859(Object obj, Object obj2) {
        if (C0034.m1206() <= 0) {
            return ((Collection) obj).add(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨۡ۠, reason: not valid java name and contains not printable characters */
    public static boolean m3860(Object obj, Object obj2) {
        if (C0093.m3365() > 0) {
            return d2.e((Object[]) obj, obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static void m3861(Object obj, boolean z) {
        if (C0214.m8575() <= 0) {
            ((i8) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(z);
        }
    }

    /* JADX INFO: renamed from: ۤۦۧۡ, reason: not valid java name and contains not printable characters */
    public static void m3862(Object obj, Object obj2, Object obj3) {
        if (C0194.m7889() > 0) {
            ((pr.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TypedArray) obj2, (XmlPullParser) obj3);
        }
    }

    /* JADX INFO: renamed from: ۥۣۢۢ, reason: contains not printable characters */
    public static int m3863(Object obj, int i) {
        if (C0176.m7290() > 0) {
            return ((LayerDrawable) obj).getLayerHeight(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۢۨۨ, reason: contains not printable characters */
    public static boolean m3864(Object obj, int i) {
        if (C0035.m1268() < 0) {
            return ((rr) obj).e(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۤۦۡ, reason: contains not printable characters */
    public static void m3865(Object obj, float f, float f2) {
        if (C0083.m3188() < 0) {
            ((MotionEvent) obj).offsetLocation(f, f2);
        }
    }

    /* JADX INFO: renamed from: ۥۦۨۧ, reason: contains not printable characters */
    public static void m3867(Object obj, Object obj2) {
        if (C0232.m9299() >= 0) {
            ((r7) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۧۦۧ, reason: contains not printable characters */
    public static boolean m3868(Object obj) {
        if (C0009.m276() <= 0) {
            return C0065.m2455(obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۨۤۧ, reason: contains not printable characters */
    public static void m3869(Object obj, Object obj2, Object obj3) {
        if (C0135.m5274() < 0) {
            v0.b.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Configuration) obj, (Configuration) obj2, (Configuration) obj3);
        }
    }

    /* JADX INFO: renamed from: ۦۣۤۢ, reason: contains not printable characters */
    public static View.AccessibilityDelegate m3870(Object obj) {
        if (C0211.m8341() >= 0) {
            return ((h) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۨ, reason: contains not printable characters */
    public static long m3871(Object obj, byte b, long j, long j2) {
        if (C0202.m8245() >= 0) {
            return ((vl) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(b, j, j2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۡۤۦ, reason: not valid java name and contains not printable characters */
    public static boolean m3872(Object obj) {
        if (C0129.m5108() >= 0) {
            return ((i1) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۤۥۦ, reason: not valid java name and contains not printable characters */
    public static boolean m3873(Object obj, Object obj2, int i, Object obj3) {
        if (C0236.m9615() > 0) {
            return ((View.AccessibilityDelegate) obj).performAccessibilityAction((View) obj2, i, (Bundle) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۤۧ۠, reason: not valid java name and contains not printable characters */
    public static void m3874(Object obj, Object obj2, Object obj3) {
        if (C0024.m896() >= 0) {
            ((Bundle) obj).putBooleanArray((String) obj2, (boolean[]) obj3);
        }
    }

    /* JADX INFO: renamed from: ۧۨ۠, reason: not valid java name and contains not printable characters */
    public static Constructor m3875() {
        if (C0062.m2326() >= 0) {
            return xs.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static Bundle m3876(Object obj) {
        if (C0083.m3188() <= 0) {
            return ((AccessibilityNodeInfo) obj).getExtras();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static void m3877(Object obj, float f, float f2, float f3, float f4) {
        if (C0204.m8270() <= 0) {
            ((Path) obj).quadTo(f, f2, f3, f4);
        }
    }

    /* JADX INFO: renamed from: ۨۢۨۧ, reason: not valid java name and contains not printable characters */
    public static Call m3878(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0066.m2514() > 0) {
            return o0.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj, (String) obj2, (String) obj3, (String) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۡ۠, reason: not valid java name and contains not printable characters */
    public static lg m3879(Object obj) {
        if (C0171.m7136() < 0) {
            return lg.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۢۢ, reason: not valid java name and contains not printable characters */
    public static void m3880(Object obj, boolean z) {
        if (C0037.m1437() < 0) {
            ((View) obj).setScreenReaderFocusable(z);
        }
    }

    /* JADX INFO: renamed from: ۨۦۨۧ, reason: not valid java name and contains not printable characters */
    public static boolean m3881(Object obj) {
        if (C0213.m8458() > 0) {
            return ((p) obj).i;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۦۤۤ, reason: contains not printable characters */
    public static String m3866(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
