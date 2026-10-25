package androidx.appcompat.view.menu;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Insets;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.shapes.Shape;
import android.icu.text.DecimalFormatSymbols;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.StrictMode;
import android.support.v4.app.C0002;
import android.support.v4.app.C0004;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0010;
import android.support.v4.graphics.drawable.C0011;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeProvider;
import android.widget.CheckedTextView;
import android.widget.TextView;
import androidx.activity.C0014;
import androidx.activity.C0020;
import androidx.annotation.C0023;
import androidx.appcompat.app.C0034;
import androidx.core.app.C0051;
import androidx.core.app.C0052;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0064;
import androidx.core.graphics.drawable.C0065;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0070;
import androidx.drawerlayout.widget.C0072;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0083;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0095;
import androidx.fragment.app.C0096;
import androidx.fragment.app.C0097;
import androidx.lifecycle.C0106;
import androidx.lifecycle.C0107;
import androidx.lifecycle.C0108;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0119;
import androidx.savedstate.C0123;
import androidx.savedstate.C0127;
import androidx.versionedparcelable.C0133;
import androidx.versionedparcelable.C0135;
import com.example.vcam.C0141;
import com.example.vcam.HookMain;
import com.example.vcam.LicenseManager;
import com.example.vcam.Menu;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.aa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.be;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.c0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ck;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.cp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.en;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fi;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ib;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.iq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pb;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ws;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z9;
import java.io.ByteArrayOutputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import okhttp3.C0238;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.internal.C0227;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.logging.C0232;
import okhttp3.logging.C0234;
import okhttp3.logging.C0235;
import org.xmlpull.v1.XmlPullParser;
import retrofit2.C0259;
import retrofit2.converter.scalars.C0243;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.ۣ۟۟ۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0039 {

    /* JADX INFO: renamed from: ۟۠۟۠, reason: not valid java name and contains not printable characters */
    public static int f36 = -457;

    /* JADX INFO: renamed from: ۟۟۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static Shape m1471(Object obj) {
        if (C0227.m9046() > 0) {
            return ((f1) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۤۢ, reason: not valid java name and contains not printable characters */
    public static boolean m1472(Object obj) {
        if (C0034.m1206() < 0) {
            return ((s8) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۢۦ, reason: not valid java name and contains not printable characters */
    public static void m1473(Object obj, Object obj2, Object obj3) {
        if (C0119.m4573() > 0) {
            ((HttpURLConnection) obj).setRequestProperty((String) obj2, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۤۦۡ, reason: not valid java name and contains not printable characters */
    public static View m1474(Object obj) {
        if (C0112.m4054() < 0) {
            return ((z9.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۧ۟, reason: not valid java name and contains not printable characters */
    public static int m1475(Object obj) {
        if (C0095.m3478() <= 0) {
            return ((cp) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۥۣ۠, reason: not valid java name and contains not printable characters */
    public static Request m1476(Object obj) {
        if (C0218.m8760() >= 0) {
            return ((Request.Builder) obj).build();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۢۥ, reason: not valid java name and contains not printable characters */
    public static float m1477(Object obj) {
        if (C0023.m843() > 0) {
            return ((e3) obj).c();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟۠ۨۤۡ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m1478(Object obj) {
        if (C0010.m354() <= 0) {
            return ((Request) obj).newBuilder();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۨۢ, reason: not valid java name and contains not printable characters */
    public static View m1479(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0200.m8104() < 0) {
            return ((v0) obj).onCreateView((View) obj2, (String) obj3, (Context) obj4, (AttributeSet) obj5);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static void m1480(Object obj) {
        if (C0065.m2448() >= 0) {
            ((ws) obj).C();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠۠, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeProvider m1481(Object obj, Object obj2) {
        if (C0006.m169() <= 0) {
            return ((View.AccessibilityDelegate) obj).getAccessibilityNodeProvider((View) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static Intent m1482(Object obj, Object obj2, Object obj3) {
        if (C0172.m7180() >= 0) {
            return ((c0) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj2, (Intent) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۦ۟, reason: not valid java name and contains not printable characters */
    public static String m1484(Object obj) {
        if (C0235.m9535() < 0) {
            return ((fi) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static int m1485(Object obj) {
        if (C0141.m5769() > 0) {
            return ((ParcelFileDescriptor) obj).getFd();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۦ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m1486(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0135.m5274() < 0) {
            return ((Resources) obj).getIdentifier((String) obj2, (String) obj3, (String) obj4);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static TextView m1487(Object obj) {
        if (C0002.m72() > 0) {
            return ((k1.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧۦ, reason: not valid java name and contains not printable characters */
    public static void m1488(Object obj, Object obj2, Object obj3) {
        if (C0014.m545() >= 0) {
            ((k3) obj).p((qa) obj2, obj3);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static Map m1489(Object obj, Object obj2) {
        if (C0238.m9653() >= 0) {
            return Collections.singletonMap(obj, obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥۡ, reason: not valid java name and contains not printable characters */
    public static int m1490(Object obj) {
        if (C0052.m1890() >= 0) {
            return ((Insets) obj).left;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۦۧۡ, reason: not valid java name and contains not printable characters */
    public static void m1491(Object obj, long j, Object obj2) {
        if (C0064.m2388() > 0) {
            ((xf) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(j, obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۦۨ, reason: not valid java name and contains not printable characters */
    public static int m1492(Object obj, Object obj2, int i, int i2, int i3) {
        if (C0243.m9964() >= 0) {
            return d4.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((List) obj, (Comparable) obj2, i, i2, i3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static String m1493(int i) {
        if (C0123.m4841() < 0) {
            return Integer.toHexString(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۨ, reason: not valid java name and contains not printable characters */
    public static void m1494(Object obj, Object obj2) {
        if (C0106.m3835() >= 0) {
            ((i) obj).A((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣۤۨ, reason: not valid java name and contains not printable characters */
    public static int m1495(Object obj, int i) {
        if (C0133.m5208() < 0) {
            return ((String) obj).indexOf(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۧۨۡ, reason: not valid java name and contains not printable characters */
    public static void m1496(Object obj, Object obj2, Object obj3) {
        if (C0218.m8760() >= 0) {
            ((rr) obj).C((tr) obj2, (rr) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣ۟۠, reason: not valid java name and contains not printable characters */
    public static Drawable m1497(Object obj) {
        if (C0062.m2326() >= 0) {
            return q7.h((Drawable) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۤۢ, reason: not valid java name and contains not printable characters */
    public static boolean m1498(Object obj, Object obj2) {
        if (C0052.m1890() >= 0) {
            return ((v3) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Throwable) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۦۧۨ, reason: not valid java name and contains not printable characters */
    public static void m1499(Object obj) {
        if (C0234.m9461() <= 0) {
            ((i3) obj).cancel();
        }
    }

    /* JADX INFO: renamed from: ۟ۧۡۢ۠, reason: not valid java name and contains not printable characters */
    public static String m1500(String str) {
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

    /* JADX INFO: renamed from: ۟ۧۢۤ, reason: not valid java name and contains not printable characters */
    public static z0 m1501() {
        if (C0172.m7180() > 0) {
            return z0.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦۤ, reason: not valid java name and contains not printable characters */
    public static void m1502(Object obj, Object obj2) {
        if (C0034.m1206() < 0) {
            ((uo.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((AttributeSet) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۨ, reason: not valid java name and contains not printable characters */
    public static void m1503(Object obj) {
        if (C0004.m139() <= 0) {
            iq.m6032((iq) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۤۦۧ, reason: not valid java name and contains not printable characters */
    public static int m1504() {
        if (C0096.m3601() < 0) {
            return en.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static sp m1505(Object obj) {
        if (C0259.m10136() >= 0) {
            return ((rp) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۤ۠, reason: not valid java name and contains not printable characters */
    public static HookMain m1506(Object obj) {
        if (C0188.m7736() <= 0) {
            return ((pb) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۥۢ, reason: not valid java name and contains not printable characters */
    public static String m1507() {
        if (C0171.m7136() < 0) {
            return "ۥ۠ۢ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۧ۠, reason: not valid java name and contains not printable characters */
    public static Object m1508(Object obj, Object obj2) {
        if (C0133.m5208() <= 0) {
            return ((ck) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۨ۟, reason: not valid java name and contains not printable characters */
    public static int m1509(Object obj) {
        if (C0083.m3188() <= 0) {
            return ((dd) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۠۠, reason: not valid java name and contains not printable characters */
    public static ArrayList m1510(Object obj) {
        if (C0006.m169() < 0) {
            return ((aa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۢۢ, reason: not valid java name and contains not printable characters */
    public static String m1511(Object obj, Object obj2) {
        if (C0004.m139() < 0) {
            return String.format((String) obj, (Object[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۡۨ, reason: not valid java name and contains not printable characters */
    public static int m1512(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۠ۥۣۢ, reason: not valid java name and contains not printable characters */
    public static void m1513(Object obj, Object obj2, int i, Object obj3) {
        if (C0187.m7613() > 0) {
            v.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Activity) obj, (Intent) obj2, i, (Bundle) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static void m1514(Object obj, Object obj2) {
        if (C0213.m8458() > 0) {
            ((Activity) obj).runOnUiThread((Runnable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۨۨۥ, reason: not valid java name and contains not printable characters */
    public static int m1515() {
        return (-85) ^ C0020.f19;
    }

    /* JADX INFO: renamed from: ۣۡ۟۟, reason: not valid java name and contains not printable characters */
    public static boolean m1516(Object obj) {
        if (C0097.m3659() > 0) {
            return ((ViewConfiguration) obj).hasPermanentMenuKey();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۤۢ۠, reason: not valid java name and contains not printable characters */
    public static Object[] m1517(Object obj, int i, Object obj2) {
        if (C0108.m4038() > 0) {
            return ib.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Object[]) obj, i, obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥ۟ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m1518(Object obj, int i, Object obj2) {
        if (C0188.m7736() <= 0) {
            return ((v0) obj).v0(i, (KeyEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۧۨۧ, reason: not valid java name and contains not printable characters */
    public static long m1519(Object obj, byte b) {
        if (C0074.m2951() < 0) {
            return ((vl) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(b);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static Thread m1520(Object obj) {
        if (C0011.m458() > 0) {
            return ((e.a) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۡۤ, reason: not valid java name and contains not printable characters */
    public static Handler m1521(Object obj) {
        if (C0161.m6744() > 0) {
            return C0107.m3882((LicenseManager) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢ, reason: not valid java name and contains not printable characters */
    public static float m1522(Object obj) {
        if (C0127.m4950() > 0) {
            return ((n2) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۢۢۤ, reason: not valid java name and contains not printable characters */
    public static CancellationException m1523(Object obj, Object obj2, Object obj3) {
        if (C0232.m9299() > 0) {
            return ((xd) obj).T((Throwable) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m1524() {
        if (C0133.m5208() < 0) {
            return z1.c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m1525(Object obj, Object obj2) {
        if (C0202.m8245() >= 0) {
            return k1.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TextView) obj, (String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۧ۟, reason: not valid java name and contains not printable characters */
    public static vf.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m1526() {
        if (C0051.m1783() <= 0) {
            return vf.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۡۡ, reason: not valid java name and contains not printable characters */
    public static void m1527(Object obj) {
        if (C0062.m2326() >= 0) {
            ((Matrix) obj).reset();
        }
    }

    /* JADX INFO: renamed from: ۣۣۧۥ, reason: not valid java name and contains not printable characters */
    public static ClipData.Item m1528(Object obj, int i) {
        if (C0187.m7613() >= 0) {
            return ((ClipData) obj).getItemAt(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static float m1529(float f, float f2, float f3) {
        if (C0108.m4038() > 0) {
            return f3.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(f, f2, f3);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۤ۟۟, reason: not valid java name and contains not printable characters */
    public static MenuItem m1530(Object obj, int i) {
        if (C0218.m8760() >= 0) {
            return ((MenuItem) obj).setActionView(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۣ۠, reason: not valid java name and contains not printable characters */
    public static Context m1531(Object obj) {
        if (C0062.m2326() >= 0) {
            return ((s6) obj).getContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۠۟, reason: contains not printable characters */
    public static void m1532(Object obj, Object obj2) {
        if (C0108.m4038() > 0) {
            HookMain.a.m5417((HookMain.a) obj);
        }
    }

    /* JADX INFO: renamed from: ۥۡ۠۟, reason: contains not printable characters */
    public static int m1533(Object obj) {
        if (C0069.m2756() <= 0) {
            return ((rn) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۢۧ, reason: contains not printable characters */
    public static Object m1534(Object obj, Object obj2) {
        if (C0235.m9535() <= 0) {
            return ((be) obj).call((Object[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۨۤ, reason: contains not printable characters */
    public static void m1535(Object obj, Object obj2) {
        if (C0093.m3365() >= 0) {
            ((v4) obj).j((Throwable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦ۟۠ۡ, reason: contains not printable characters */
    public static Object m1536(Object obj) {
        if (C0072.m2856() < 0) {
            return ((tf) obj).b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦ, reason: contains not printable characters */
    public static DecimalFormatSymbols m1537(Object obj) {
        if (C0014.m545() > 0) {
            return DecimalFormatSymbols.getInstance((Locale) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۡۥ, reason: contains not printable characters */
    public static int m1538(Object obj) {
        if (C0240.m9826() >= 0) {
            return ((m9.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۨۧۦ, reason: contains not printable characters */
    public static int m1539(Object obj) {
        if (C0078.m3044() <= 0) {
            return ((XmlPullParser) obj).getEventType();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۡ۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1540(Object obj, Object obj2, Object obj3, int i, int i2) {
        if (C0097.m3659() >= 0) {
            return hs.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ViewParent) obj, (View) obj2, (View) obj3, i, i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۨۢۤ, reason: not valid java name and contains not printable characters */
    public static void m1541(Object obj) {
        if (C0123.m4841() < 0) {
            ((List) obj).clear();
        }
    }

    /* JADX INFO: renamed from: ۧۨۤ۟, reason: not valid java name and contains not printable characters */
    public static void m1542(Object obj, Object obj2) {
        if (C0119.m4573() > 0) {
            ((CheckedTextView) obj).setCheckMarkTintMode((PorterDuff.Mode) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static View m1543(Object obj, int i) {
        if (C0211.m8341() > 0) {
            return ((u0) obj).b(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static n9.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa[] m1544(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0097.m3659() > 0) {
            return i9.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj, (j9) obj2, (String) obj3, (CancellationSignal) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۥۥ, reason: not valid java name and contains not printable characters */
    public static int[] m1545(Object obj) {
        if (C0218.m8760() >= 0) {
            return ((lc) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m1546(Object obj) {
        if (C0002.m72() > 0) {
            return ((Resources.Theme) obj).hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨ, reason: not valid java name and contains not printable characters */
    public static Object m1547(Object obj) {
        if (C0010.m354() <= 0) {
            return ((kk) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۠ۨ, reason: not valid java name and contains not printable characters */
    public static k1 m1548(Object obj) {
        if (C0094.m3450() >= 0) {
            return k1.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥ۟, reason: not valid java name and contains not printable characters */
    public static StrictMode.ThreadPolicy m1549() {
        if (C0070.m2829() < 0) {
            return StrictMode.allowThreadDiskWrites();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۦۨ, reason: not valid java name and contains not printable characters */
    public static void m1550(Object obj, Object obj2) {
        if (C0065.m2448() >= 0) {
            Menu.m5673((Menu) obj, (View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static String m1483(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
