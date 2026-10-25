package okhttp3.internal.connection;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.C0002;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0011;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.activity.C0014;
import androidx.activity.C0017;
import androidx.activity.C0020;
import androidx.activity.C0021;
import androidx.annotation.C0026;
import androidx.appcompat.app.C0037;
import androidx.appcompat.widget.C0047;
import androidx.appcompat.widget.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.core.app.C0053;
import androidx.core.content.C0057;
import androidx.core.graphics.drawable.C0062;
import androidx.drawerlayout.widget.C0074;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0095;
import androidx.fragment.app.C0097;
import androidx.lifecycle.C0108;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0118;
import androidx.savedstate.C0122;
import androidx.savedstate.C0123;
import androidx.savedstate.C0126;
import androidx.versionedparcelable.C0129;
import androidx.versionedparcelable.C0133;
import androidx.versionedparcelable.C0135;
import com.example.vcam.HookMain;
import com.example.vcam.LicenseManager;
import com.example.vcam.MainActivity;
import com.example.vcam.Menu;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.aa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.an;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.b;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gi;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.po;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ql;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ua;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.reflect.Method;
import java.net.DatagramPacket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import okhttp3.C0238;
import okhttp3.HttpUrl;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.io.C0195;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0233;
import okhttp3.logging.C0235;
import okhttp3.logging.C0236;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import retrofit2.converter.scalars.C0243;

/* JADX INFO: renamed from: okhttp3.internal.connection.۟ۥۣۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0182 {

    /* JADX INFO: renamed from: ۦۣۧۨ, reason: contains not printable characters */
    public static int f632 = 943;

    /* JADX INFO: renamed from: ۟۟۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m7492(Object obj) {
        if (C0191.m7812() > 0) {
            return ((uo.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static int[] m7493(Object obj) {
        if (C0097.m3659() > 0) {
            return ((zr) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨۨ۟, reason: not valid java name and contains not printable characters */
    public static Intent m7494(Object obj, Object obj2, boolean z) {
        if (C0164.m6900() < 0) {
            return ((Intent) obj).putExtra((String) obj2, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۡۨ, reason: not valid java name and contains not printable characters */
    public static CharSequence m7495(Object obj) {
        if (C0233.m9365() <= 0) {
            return ((rr) obj).c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۦۧ, reason: not valid java name and contains not printable characters */
    public static int m7496(Object obj) {
        if (m7528() <= 0) {
            return ((Throwable) obj).hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static boolean m7497(Object obj) {
        if (C0037.m1437() < 0) {
            return ((File) obj).canRead();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۦ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m7498(Object obj) {
        if (C0020.m701() > 0) {
            HookMain.m5411((HookMain) obj);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۦۧۧ, reason: not valid java name and contains not printable characters */
    public static boolean m7499(Object obj, long j) {
        if (C0062.m2326() > 0) {
            return ((v2) obj).p(j);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Uri.Builder m7500(Object obj, Object obj2) {
        if (C0191.m7812() > 0) {
            return ((Uri.Builder) obj).appendEncodedPath((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۡۢ, reason: not valid java name and contains not printable characters */
    public static Typeface m7501(Object obj, Object obj2, Object obj3, int i, Object obj4, int i2) {
        if (C0053.m1959() >= 0) {
            return ((zq) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj2, (Resources) obj3, i, (String) obj4, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥ۠, reason: not valid java name and contains not printable characters */
    public static int m7502(Object obj) {
        if (C0097.m3659() >= 0) {
            return ((Paint.FontMetricsInt) obj).bottom;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m7503(Object obj, Object obj2) {
        if (C0021.m740() < 0) {
            ((View) obj).setStateDescription((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۧۥۣ, reason: not valid java name and contains not printable characters */
    public static WindowInsets m7504(Object obj) {
        if (C0162.m6837() <= 0) {
            return ((WindowInsets) obj).consumeDisplayCutout();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۡ, reason: not valid java name and contains not printable characters */
    public static WeakHashMap m7505(Object obj) {
        if (C0236.m9615() >= 0) {
            return ((wr.l) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥ۟۟, reason: not valid java name and contains not printable characters */
    public static boolean m7506(Object obj) {
        if (C0093.m3365() >= 0) {
            return ((LicenseManager) obj).q();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۦۨۦ, reason: not valid java name and contains not printable characters */
    public static Object m7507(Object obj, Object obj2) {
        if (C0026.m1047() > 0) {
            return ((LinkedHashMap) obj).get(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨ۟۠, reason: not valid java name and contains not printable characters */
    public static MenuItem m7508(Object obj, char c) {
        if (C0093.m3365() >= 0) {
            return ((MenuItem) obj).setAlphabeticShortcut(c);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧۧ, reason: not valid java name and contains not printable characters */
    public static Uri m7509(Object obj) {
        if (C0017.m627() >= 0) {
            return ((n9.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۦ۠, reason: not valid java name and contains not printable characters */
    public static void m7510(Object obj, Object obj2, boolean z) {
        if (C0117.m4419() < 0) {
            ((Bundle) obj).putBoolean((String) obj2, z);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۡۢۥ, reason: not valid java name and contains not printable characters */
    public static int m7511(Object obj, Object obj2) {
        if (C0108.m4038() >= 0) {
            return ((TextPaint) obj).getFontMetricsInt((Paint.FontMetricsInt) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static dp m7512(Object obj, boolean z) {
        if (C0118.m4454() >= 0) {
            return ((f6.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۡۡ, reason: not valid java name and contains not printable characters */
    public static void m7513(Object obj, Object obj2, Object obj3) {
        if (C0112.m4054() < 0) {
            ((aa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ArrayList) obj2, (View) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۥۤۧ, reason: not valid java name and contains not printable characters */
    public static int[] m7514(Object obj) {
        if (C0135.m5274() < 0) {
            return ((z0.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨ۠ۨ, reason: not valid java name and contains not printable characters */
    public static Runnable m7515(Object obj) {
        if (C0020.m701() > 0) {
            return ((o1) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۤۦ, reason: not valid java name and contains not printable characters */
    public static void m7516(Object obj, int i, int i2, Object obj2) {
        if (C0123.m4841() < 0) {
            Arrays.fill((Object[]) obj, i, i2, obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۦ۟۟, reason: not valid java name and contains not printable characters */
    public static i2 m7517() {
        if (C0002.m72() > 0) {
            return i2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۨۥ, reason: not valid java name and contains not printable characters */
    public static boolean m7518(Object obj) {
        if (m7528() <= 0) {
            return ((Cursor) obj).moveToFirst();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۦ۠ۤ, reason: not valid java name and contains not printable characters */
    public static Method m7519(Object obj) {
        if (C0014.m545() > 0) {
            return ((wq) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean m7520(Object obj, int i) {
        if (C0097.m3659() > 0) {
            return ((fj) obj).a(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۧۡۦ, reason: not valid java name and contains not printable characters */
    public static void m7521(Object obj) {
        if (C0195.m7914() > 0) {
            ((View) obj).requestApplyInsets();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۧۤۦ, reason: not valid java name and contains not printable characters */
    public static z1 m7522() {
        if (C0011.m458() > 0) {
            return u0.b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m7523(Object obj, Object obj2) {
        if (m7528() < 0) {
            return lg.c((Set) obj, obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۤۤۢ, reason: not valid java name and contains not printable characters */
    public static ClipData m7524(Object obj) {
        if (C0235.m9535() <= 0) {
            return ((o5) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۥۡ, reason: not valid java name and contains not printable characters */
    public static Object m7525(Object obj, int i) {
        if (C0113.m4144() < 0) {
            return ((rn) obj).a(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۧۨ, reason: not valid java name and contains not printable characters */
    public static jk m7526(Object obj, Object obj2, int i) {
        if (C0219.m8794() >= 0) {
            return ((mo.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((CharSequence) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static Menu.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m7527(Object obj) {
        if (C0195.m7914() > 0) {
            return ((gi) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۧۡ, reason: not valid java name and contains not printable characters */
    public static int m7528() {
        return (-293) ^ f632;
    }

    /* JADX INFO: renamed from: ۣ۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static int[] m7529() {
        if (C0178.m7344() <= 0) {
            return ql.b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static void m7530(Object obj, int i) {
        if (C0053.m1959() > 0) {
            ((ScrollView) obj).setBackgroundColor(i);
        }
    }

    /* JADX INFO: renamed from: ۠ۨۧۨ, reason: not valid java name and contains not printable characters */
    public static void m7531(Object obj, int i) {
        if (C0162.m6837() <= 0) {
            ((q) obj).f(i);
        }
    }

    /* JADX INFO: renamed from: ۡۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m7532(Object obj) {
        if (C0057.m2142() >= 0) {
            return ((DatagramPacket) obj).getPort();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۤۥ۟, reason: not valid java name and contains not printable characters */
    public static void m7533(Object obj, Object obj2, Object obj3, Object obj4) throws XmlPullParserException {
        if (C0095.m3478() < 0) {
            ((pr) obj).a((TypedArray) obj2, (XmlPullParser) obj3, (Resources.Theme) obj4);
        }
    }

    /* JADX INFO: renamed from: ۡۨۢ, reason: not valid java name and contains not printable characters */
    public static wo m7534(Object obj) {
        if (C0047.m1663() <= 0) {
            return ((po) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static void m7535(int i) {
        if (C0108.m4038() >= 0) {
            mo.Y(i);
        }
    }

    /* JADX INFO: renamed from: ۢۢۢۢ, reason: not valid java name and contains not printable characters */
    public static void m7536(Object obj, Object obj2, int i) {
        if (C0047.m1663() <= 0) {
            ((s5) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Resources.Theme) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۢۢۨۤ, reason: not valid java name and contains not printable characters */
    public static void m7537(Object obj, int i) {
        if (C0017.m627() > 0) {
            ((Paint) obj).setAlpha(i);
        }
    }

    /* JADX INFO: renamed from: ۢۦۧۦ, reason: not valid java name and contains not printable characters */
    public static l2 m7538(Object obj, Object obj2) {
        if (C0225.m9001() <= 0) {
            return null;
        }
        return ((HookMain) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = (l2) obj2;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static List m7539(Object obj, Object obj2) {
        if (C0074.m2951() < 0) {
            return l4.E((Iterable) obj, (Iterable) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m7540(Object obj, Object obj2, Object obj3, int i) {
        if (C0161.m6744() >= 0) {
            return hs.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ViewParent) obj, (View) obj2, (View) obj3, i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۡۦۤ, reason: not valid java name and contains not printable characters */
    public static String m7541(Object obj) {
        if (C0195.m7914() >= 0) {
            return ((MainActivity) obj).D;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۧۦ, reason: not valid java name and contains not printable characters */
    public static int m7542(Object obj, Object obj2) {
        if (C0171.m7136() < 0) {
            return i9.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((byte[]) obj, (byte[]) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۤۤۨ, reason: not valid java name and contains not printable characters */
    public static Rect m7543(Object obj) {
        if (C0020.m701() >= 0) {
            return ((qm) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۤ۠, reason: not valid java name and contains not printable characters */
    public static int m7544(Object obj) {
        if (C0037.m1437() < 0) {
            return ((ViewConfiguration) obj).getScaledMinimumFlingVelocity();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m7545(Object obj) {
        if (C0037.m1437() <= 0) {
            return ((an) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۡۢۦ, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m7546() {
        if (C0133.m5208() <= 0) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۨۢ, reason: not valid java name and contains not printable characters */
    public static View m7547(Object obj, int i, int i2) {
        if (C0126.m4908() <= 0) {
            return ((zr) obj).l(i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۥۨ, reason: not valid java name and contains not printable characters */
    public static int m7548(Object obj) {
        if (C0171.m7136() < 0) {
            return ((Bitmap) obj).getWidth();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m7549(Object obj, boolean z) {
        if (C0172.m7180() > 0) {
            ((xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).y(z);
        }
    }

    /* JADX INFO: renamed from: ۥ۠ۡ, reason: contains not printable characters */
    public static void m7550(Object obj, int i, Object obj2) {
        if (C0122.m4736() <= 0) {
            ((u7) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, (View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥ۠ۦۡ, reason: contains not printable characters */
    public static CharSequence m7551(Object obj) {
        if (C0164.m6900() <= 0) {
            return ((q) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۢۡ, reason: contains not printable characters */
    public static float m7552(Object obj, float f, float f2) {
        if (C0162.m6837() < 0) {
            return ((m2) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(f, f2);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۥۢ۟ۨ, reason: contains not printable characters */
    public static int m7553(Object obj) {
        if (C0191.m7812() > 0) {
            return ((TypedValue) obj).data;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۤۦۣ, reason: contains not printable characters */
    public static boolean m7554(Object obj) {
        if (C0235.m9535() <= 0) {
            return wr.b.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣۤۨ, reason: contains not printable characters */
    public static xp m7555(Object obj) {
        if (C0014.m545() >= 0) {
            return ((p0) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۧۤ, reason: contains not printable characters */
    public static boolean m7556(Object obj, int i) {
        if (C0238.m9653() >= 0) {
            return ((Window) obj).hasFeature(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣۨۧ, reason: contains not printable characters */
    public static ua m7557() {
        if (C0218.m8760() >= 0) {
            return pp.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۦۡ, reason: contains not printable characters */
    public static xs m7558(Object obj) {
        if (C0133.m5208() < 0) {
            return ((xs.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۦۥ, reason: contains not printable characters */
    public static float[] m7559(Object obj) {
        if (C0057.m2142() > 0) {
            return mk.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۤ۟, reason: contains not printable characters */
    public static long m7560(Object obj) {
        if (C0117.m4419() < 0) {
            return ((com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.a) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧ۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static EditText m7562(Object obj) {
        if (C0129.m5108() > 0) {
            return Menu.m5586((Menu) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۢۡ, reason: not valid java name and contains not printable characters */
    public static int m7563(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧۢۤ۠, reason: not valid java name and contains not printable characters */
    public static void m7564(Object obj, int i) {
        if (C0162.m6837() <= 0) {
            ((lg) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
    }

    /* JADX INFO: renamed from: ۧۤ۠۠, reason: not valid java name and contains not printable characters */
    public static void m7565(Object obj, Object obj2, Object obj3) {
        if (C0006.m169() <= 0) {
            ((qo) obj).r((TextView) obj2, (CharSequence) obj3);
        }
    }

    /* JADX INFO: renamed from: ۧۦۡۤ, reason: not valid java name and contains not printable characters */
    public static boolean m7566(Object obj) {
        if (C0243.m9964() >= 0) {
            return ((m2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static Object m7567(Object obj, int i) {
        if (C0118.m4454() >= 0) {
            return ((b) obj).get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۨۡ, reason: not valid java name and contains not printable characters */
    public static int m7568(Object obj) {
        if (C0053.m1959() > 0) {
            return ((Map.Entry) obj).hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m7569(String str) {
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

    /* JADX INFO: renamed from: ۨۥۦۥ, reason: not valid java name and contains not printable characters */
    public static void m7570(Object obj, boolean z) {
        if (C0214.m8575() <= 0) {
            ((m) obj).d(z);
        }
    }

    /* JADX INFO: renamed from: ۨۦ, reason: not valid java name and contains not printable characters */
    public static int m7571(Object obj) {
        if (C0213.m8458() > 0) {
            return kp.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TextView) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۨۥ, reason: not valid java name and contains not printable characters */
    public static v0.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m7572(Object obj) {
        if (C0037.m1437() < 0) {
            return v0.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m7561(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
