package okhttp3.internal.cache;

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.media.MediaCodec;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.PowerManager;
import android.support.v4.app.C0004;
import android.text.PrecomputedText;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.animation.Interpolator;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import androidx.activity.C0017;
import androidx.activity.C0021;
import androidx.annotation.C0023;
import androidx.appcompat.app.C0035;
import androidx.appcompat.app.C0036;
import androidx.appcompat.app.C0037;
import androidx.appcompat.view.menu.b;
import androidx.appcompat.widget.C0047;
import androidx.core.app.C0051;
import androidx.core.app.C0052;
import androidx.core.app.C0053;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0065;
import androidx.drawerlayout.widget.C0070;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0079;
import androidx.emoji2.text.C0083;
import androidx.emoji2.text.C0084;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0095;
import androidx.fragment.app.C0099;
import androidx.fragment.app.a;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0118;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0126;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0129;
import androidx.versionedparcelable.C0135;
import com.example.vcam.HookMain;
import com.example.vcam.LicenseManager;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.b8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.c4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.cs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ed;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.eo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gb;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.iq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.of;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.zip.Deflater;
import okhttp3.C0238;
import okhttp3.HttpUrl;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0195;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.internal.ws.C0224;
import okhttp3.logging.C0232;
import okhttp3.logging.C0233;
import okhttp3.logging.C0234;
import okhttp3.logging.C0235;
import org.xmlpull.v1.XmlPullParser;
import retrofit2.C0259;
import retrofit2.converter.scalars.C0243;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: okhttp3.internal.cache.ۡۦۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0169 {

    /* JADX INFO: renamed from: ۢ۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static int f619 = 471;

    /* JADX INFO: renamed from: ۟۟۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static int m6980(Object obj) {
        if (C0118.m4454() > 0) {
            return obj.hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static Drawable m6981(Object obj) {
        if (C0115.m4218() < 0) {
            return t3.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((CheckedTextView) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۣۦ, reason: not valid java name and contains not printable characters */
    public static void m6982(Object obj, Object obj2) {
        if (C0172.m7180() >= 0) {
            ((IntentFilter) obj).addAction((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۦۣۦ, reason: not valid java name and contains not printable characters */
    public static void m6983(Object obj, Object obj2) {
        if (C0200.m8104() <= 0) {
            wr.R((View) obj, (ColorStateList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠۠۟, reason: not valid java name and contains not printable characters */
    public static void m6984(Object obj, Object obj2) {
        if (C0116.m4340() > 0) {
            ((n3) obj).h((o3) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static Field m6985(Object obj, Object obj2) {
        if (C0195.m7914() > 0) {
            return ((Class) obj).getField((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۤۡ, reason: not valid java name and contains not printable characters */
    public static String m6986(Object obj) {
        if (C0129.m5108() > 0) {
            return ((eo.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟۠, reason: not valid java name and contains not printable characters */
    public static void m6987(Object obj, boolean z) {
        if (C0051.m1783() < 0) {
            vs.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Window.Callback) obj, z);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۤۧۥ, reason: not valid java name and contains not printable characters */
    public static int m6988(Object obj) {
        if (C0051.m1783() <= 0) {
            return ((v0) obj).M();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۥۧۡ, reason: not valid java name and contains not printable characters */
    public static void m6989(Object obj) {
        if (C0202.m8245() >= 0) {
            ((a) obj).s();
        }
    }

    /* JADX INFO: renamed from: ۟ۡۦۤۥ, reason: not valid java name and contains not printable characters */
    public static a3 m6990(Object obj, int i) {
        if (C0232.m9299() > 0) {
            return ((dk) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۧۧ, reason: not valid java name and contains not printable characters */
    public static int m6991(Object obj, long j) {
        if (C0035.m1268() <= 0) {
            return ((MediaCodec) obj).dequeueInputBuffer(j);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۥۥ, reason: not valid java name and contains not printable characters */
    public static boolean m6992(Object obj) {
        if (C0135.m5274() <= 0) {
            return ((i7) obj).b();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۧ۟۠, reason: not valid java name and contains not printable characters */
    public static Object m6993() {
        if (C0249.m10052() <= 0) {
            return b8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static MenuItem m6994(Object obj, Object obj2) {
        if (C0058.m2184() >= 0) {
            return ((MenuItem) obj).setOnActionExpandListener((MenuItem.OnActionExpandListener) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥ۠ۡ, reason: not valid java name and contains not printable characters */
    public static uj m6995(Object obj) {
        if (C0017.m627() >= 0) {
            return ((wr.d.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m6996(Object obj) {
        if (C0099.m3752() <= 0) {
            return v0.a.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((PowerManager) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۧ۟, reason: not valid java name and contains not printable characters */
    public static Method m6997(Object obj) {
        if (C0201.m8184() < 0) {
            return ((wq) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۨۦ, reason: not valid java name and contains not printable characters */
    public static String m6998(Object obj) {
        if (C0188.m7736() < 0) {
            return ((pr.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m6999(Object obj, Object obj2) {
        if (C0171.m7136() < 0) {
            return ((a6) obj).Q((y5) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤۧ, reason: not valid java name and contains not printable characters */
    public static float m7000(float f) {
        if (C0128.m5064() < 0) {
            return f3.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(f);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۤۥ۠, reason: not valid java name and contains not printable characters */
    public static Object m7001(Object obj) {
        if (C0083.m3188() <= 0) {
            return ((jk) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static int m7002(Object obj) {
        if (C0171.m7136() < 0) {
            return ((SeekBar) obj).getPaddingRight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static hd m7003(Object obj) {
        if (C0053.m1959() >= 0) {
            return mo.z((CharSequence) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۧ۠, reason: not valid java name and contains not printable characters */
    public static void m7004(Object obj, Object obj2, int i, int i2) {
        if (C0195.m7914() >= 0) {
            ((Deflater) obj).setInput((byte[]) obj2, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۨۨۢ, reason: not valid java name and contains not printable characters */
    public static void m7005(Object obj, Object obj2, Object obj3) {
        if (C0259.m10136() > 0) {
            ((k1) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Drawable) obj2, (xp) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static Object[] m7006() {
        if (C0202.m8245() >= 0) {
            return rn.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۧۧ, reason: not valid java name and contains not printable characters */
    public static String m7007(Object obj, int i, Object obj2, int i2, int i3) {
        if (C0095.m3478() <= 0) {
            return tq.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Resources) obj, i, (String) obj2, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۡۥ, reason: not valid java name and contains not printable characters */
    public static Location m7008(Object obj, Object obj2) {
        if (C0074.m2951() < 0) {
            return ((LocationManager) obj).getLastKnownLocation((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧ۟, reason: not valid java name and contains not printable characters */
    public static void m7009(Object obj, Object obj2) {
        if (C0235.m9535() < 0) {
            ((xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).b0(obj2);
        }
    }

    /* JADX INFO: renamed from: ۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m7010(Object obj) {
        if (C0243.m9964() >= 0) {
            return ((PrecomputedText.Params) obj).getHyphenationFrequency();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠۠ۢۦ, reason: not valid java name and contains not printable characters */
    public static a3 m7011(Object obj) {
        if (C0058.m2184() >= 0) {
            return ((s2) obj).e();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static Method m7012() {
        if (C0129.m5108() >= 0) {
            return vq.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static b m7013(Object obj, Object obj2) {
        if (C0037.m1437() <= 0) {
            return ((v0.k) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((androidx.appcompat.view.menu.a.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۦۢ, reason: not valid java name and contains not printable characters */
    public static Object m7014(Object obj, Object obj2) {
        if (C0178.m7344() < 0) {
            return ((wr.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m7015(Object obj) {
        if (C0004.m139() <= 0) {
            return ((x9) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static n8 m7016() {
        if (C0074.m2951() < 0) {
            return n8.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static ImageView.ScaleType m7017() {
        if (C0021.m740() <= 0) {
            return ImageView.ScaleType.CENTER_INSIDE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static boolean m7018(Object obj, Object obj2) {
        if (C0116.m4340() >= 0) {
            return ((f6) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((dp) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۥۣۥ, reason: not valid java name and contains not printable characters */
    public static Context m7019(Object obj) {
        if (C0079.m3072() <= 0) {
            return ((CheckedTextView) obj).getContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۡۥ, reason: not valid java name and contains not printable characters */
    public static long m7020(Object obj, Object obj2, long j) {
        if (C0036.m1332() <= 0) {
            return ((s2) obj).G((a3) obj2, j);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static int m7021(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡۦ۠ۦ, reason: not valid java name and contains not printable characters */
    public static Object[] m7022(Object obj, boolean z) {
        if (C0074.m2951() <= 0) {
            return c4.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Object[]) obj, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۢۧ, reason: not valid java name and contains not printable characters */
    public static FileInputStream m7023(Object obj, Object obj2) {
        if (C0126.m4908() < 0) {
            return ((Context) obj).openFileInput((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢۥ, reason: not valid java name and contains not printable characters */
    public static String m7025(String str) {
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

    /* JADX INFO: renamed from: ۣۢۦ۠, reason: not valid java name and contains not printable characters */
    public static HookMain.u m7026(Object obj) {
        if (C0182.m7528() <= 0) {
            return ((lc) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m7027(Object obj) {
        if (C0052.m1890() >= 0) {
            return ((of) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۢۤ۠, reason: not valid java name and contains not printable characters */
    public static Throwable m7028(Object obj) {
        if (C0118.m4454() >= 0) {
            return ((Exception) obj).getCause();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۤۧ, reason: not valid java name and contains not printable characters */
    public static jq m7029(Object obj) {
        if (C0047.m1663() <= 0) {
            return ((iq) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۡۡ, reason: not valid java name and contains not printable characters */
    public static ArrayList m7030(Object obj) {
        if (C0070.m2829() < 0) {
            return ((k0.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۧۡ, reason: not valid java name and contains not printable characters */
    public static Typeface m7031(Object obj, Object obj2, int i, Object obj3, int i2, int i3) {
        if (C0162.m6837() <= 0) {
            return tq.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj, (Resources) obj2, i, (String) obj3, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۦۨ, reason: not valid java name and contains not printable characters */
    public static Rect m7032(Object obj) {
        if (C0148.m6464() < 0) {
            return ((Drawable) obj).getBounds();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۢۡ, reason: not valid java name and contains not printable characters */
    public static char m7033(Object obj) {
        if (C0234.m9461() < 0) {
            return ((MenuItem) obj).getAlphabeticShortcut();
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: ۣۤۦ۠, reason: not valid java name and contains not printable characters */
    public static int m7034() {
        return 297 ^ C0219.f669;
    }

    /* JADX INFO: renamed from: ۣۤۨۧ, reason: not valid java name and contains not printable characters */
    public static Runnable m7035(Object obj) {
        if (C0234.m9461() <= 0) {
            return ((zr) obj).n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨ۠ۢ, reason: not valid java name and contains not printable characters */
    public static qa m7036(Object obj) {
        if (C0128.m5064() <= 0) {
            return ((cs) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۧۢ, reason: contains not printable characters */
    public static Object m7037(Object obj) {
        if (C0084.m3253() < 0) {
            return ((xd) obj).v();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡ۟ۤ, reason: contains not printable characters */
    public static void m7038(Object obj, Object obj2) {
        if (C0120.m4608() > 0) {
            wr.I((View) obj, (Runnable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۡۦ۠, reason: contains not printable characters */
    public static boolean m7039(Object obj, int i, Object obj2) {
        if (C0128.m5064() <= 0) {
            return ((TypedArray) obj).getValue(i, (TypedValue) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۦۣ۟, reason: contains not printable characters */
    public static boolean m7040(char c) {
        if (C0172.m7180() >= 0) {
            return Character.isSpaceChar(c);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣۨ, reason: contains not printable characters */
    public static int m7041(Object obj) {
        if (C0194.m7889() >= 0) {
            return ((ed) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۨۧ۠, reason: contains not printable characters */
    public static void m7042(Object obj, Object obj2, int i, int i2, int i3) {
        if (C0181.m7445() >= 0) {
            ((PopupWindow) obj).showAsDropDown((View) obj2, i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ۦ۟۠۟, reason: contains not printable characters */
    public static Method m7043(Object obj, Object obj2) {
        if (C0017.m627() > 0) {
            return ((wq) obj).j((Class) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۡۦ, reason: contains not printable characters */
    public static void m7044(Object obj, int i) {
        if (C0233.m9365() < 0) {
            ((k3) obj).h(i);
        }
    }

    /* JADX INFO: renamed from: ۦۧۦۡ, reason: contains not printable characters */
    public static NetworkInfo m7045(Object obj) {
        if (C0112.m4054() <= 0) {
            return ((ConnectivityManager) obj).getActiveNetworkInfo();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static TextPaint m7046(Object obj) {
        if (C0084.m3253() <= 0) {
            return ((uk.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static String[] m7047(Object obj, Object obj2) {
        if (C0219.m8794() > 0) {
            return ((Bundle) obj).getStringArray((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static void m7048(Object obj, Object obj2) {
        if (C0238.m9653() >= 0) {
            ((s5) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Configuration) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static Interpolator m7049(Object obj, int i) {
        if (C0093.m3365() > 0) {
            return l0.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۡۢ, reason: not valid java name and contains not printable characters */
    public static HookMain m7050(Object obj) {
        if (C0065.m2448() >= 0) {
            return ((HookMain.s) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۤۨ, reason: not valid java name and contains not printable characters */
    public static lg m7051(Object obj) {
        if (C0083.m3188() <= 0) {
            return ((x1) obj).e();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static String m7052(Object obj) {
        if (C0126.m4908() < 0) {
            return C0120.m4623((LicenseManager) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static int m7053(Object obj) {
        if (C0182.m7528() < 0) {
            return ((View) obj).getMinimumWidth();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۤۥۡ, reason: not valid java name and contains not printable characters */
    public static gb.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m7054(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0023.m843() >= 0) {
            return gb.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Resources) obj, (XmlPullParser) obj2, (AttributeSet) obj3, (Resources.Theme) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۧۧ, reason: not valid java name and contains not printable characters */
    public static x1 m7055(Object obj) {
        if (C0224.m8861() <= 0) {
            return x1.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۨۥ, reason: not valid java name and contains not printable characters */
    public static String m7024(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
