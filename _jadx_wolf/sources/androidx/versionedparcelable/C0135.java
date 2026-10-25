package androidx.versionedparcelable;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.C0002;
import android.support.v4.app.C0004;
import android.support.v4.graphics.drawable.C0009;
import android.support.v4.graphics.drawable.C0010;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.widget.CompoundButton;
import android.widget.EdgeEffect;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.C0014;
import androidx.activity.C0017;
import androidx.activity.C0020;
import androidx.annotation.C0023;
import androidx.annotation.C0024;
import androidx.annotation.C0025;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.C0035;
import androidx.appcompat.app.C0036;
import androidx.appcompat.view.menu.C0039;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.view.menu.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.appcompat.widget.C0047;
import androidx.core.app.C0053;
import androidx.core.app.C0055;
import androidx.core.content.C0057;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0065;
import androidx.core.graphics.drawable.C0066;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0072;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0083;
import androidx.emoji2.text.C0084;
import androidx.fragment.app.C0099;
import androidx.fragment.app.a;
import androidx.lifecycle.C0106;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0118;
import androidx.profileinstaller.C0119;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0126;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.HookMain;
import com.example.vcam.LicenseManager;
import com.example.vcam.MainActivity;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.c9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.da;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.em;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.iq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ks;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.nm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.oi;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ve;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ws;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.Inflater;
import javax.crypto.Cipher;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0195;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0231;
import okhttp3.logging.C0232;
import okhttp3.logging.C0233;
import okhttp3.logging.C0234;
import okhttp3.logging.C0235;
import retrofit2.Retrofit;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: androidx.versionedparcelable.ۥ۠ۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0135 {

    /* JADX INFO: renamed from: ۟ۡۨۡۥ, reason: not valid java name and contains not printable characters */
    public static int f114 = 814;

    /* JADX INFO: renamed from: ۟۟۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m5274() {
        return 644 ^ C0115.f95;
    }

    /* JADX INFO: renamed from: ۟۟ۡۥۣ, reason: not valid java name and contains not printable characters */
    public static Intent m5275(Object obj) {
        if (C0118.m4454() >= 0) {
            return ((MenuItem) obj).getIntent();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤۥۢ, reason: not valid java name and contains not printable characters */
    public static void m5276(Object obj, int i) {
        if (C0023.m843() > 0) {
            ((View) obj).setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۥۧۥ, reason: not valid java name and contains not printable characters */
    public static int m5277(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۟ۦۣۧ, reason: not valid java name and contains not printable characters */
    public static String m5278(String str) {
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

    /* JADX INFO: renamed from: ۟۟ۦۦۨ, reason: not valid java name and contains not printable characters */
    public static Runnable m5279(Object obj) {
        if (C0053.m1959() >= 0) {
            return ((e.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧۤ۟, reason: not valid java name and contains not printable characters */
    public static String m5280(int i, int i2) {
        if (C0233.m9365() < 0) {
            return Integer.toString(i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟۟۠, reason: not valid java name and contains not printable characters */
    public static void m5281(Object obj, float f, float f2) {
        if (C0215.m8604() < 0) {
            x7.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((EdgeEffect) obj, f, f2);
        }
    }

    /* JADX INFO: renamed from: ۟۠۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static oi m5282(Object obj) {
        if (C0181.m7445() > 0) {
            return ((f8) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m5283(Object obj) {
        if (C0195.m7914() >= 0) {
            ((a) obj).H();
        }
    }

    /* JADX INFO: renamed from: ۟۠ۥ۟۠, reason: not valid java name and contains not printable characters */
    public static boolean m5284(Object obj, Object obj2, Object obj3) {
        if (C0010.m354() <= 0) {
            return ((q.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((q) obj2, (MenuItem) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۥۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m5285(Object obj) {
        if (C0188.m7736() <= 0) {
            return ((ConnectionBlocker) obj).j();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۦۥۡ, reason: not valid java name and contains not printable characters */
    public static void m5286(Object obj, Object obj2) {
        if (C0025.m934() >= 0) {
            ((rr) obj).u((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static TypedArray m5287(Object obj, int i) {
        if (C0083.m3188() < 0) {
            return ((Resources) obj).obtainTypedArray(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m5288(Object obj, int i, Object obj2, int i2, int i3) {
        if (C0126.m4908() < 0) {
            return ((fn) obj).e(i, (a3) obj2, i2, i3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static View m5289(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z, boolean z2, boolean z3, boolean z4) {
        if (C0014.m545() >= 0) {
            return ((m1) obj).j((View) obj2, (String) obj3, (Context) obj4, (AttributeSet) obj5, z, z2, z3, z4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۦۦ, reason: not valid java name and contains not printable characters */
    public static f2 m5290(Object obj) {
        if (C0009.m276() <= 0) {
            return ((f2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static void m5291(Object obj, boolean z) {
        if (C0066.m2514() >= 0) {
            ((Menu) obj).setQwertyMode(z);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۨۤۢ, reason: not valid java name and contains not printable characters */
    public static boolean m5292(Object obj, Object obj2, Object obj3) {
        if (C0178.m7344() <= 0) {
            return ((xd) obj).W((sc) obj2, obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۦ, reason: not valid java name and contains not printable characters */
    public static int m5293(Object obj) {
        if (C0204.m8270() < 0) {
            return ((Enum) obj).ordinal();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥۡ, reason: not valid java name and contains not printable characters */
    public static TextDirectionHeuristic m5294(Object obj) {
        if (C0117.m4419() < 0) {
            return ((uk.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean m5295(Object obj) {
        if (C0057.m2142() > 0) {
            return ((dn) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۥۢ, reason: not valid java name and contains not printable characters */
    public static int m5296(Object obj) {
        if (C0119.m4573() > 0) {
            return ((iq) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static int m5297(Object obj) {
        if (C0062.m2326() > 0) {
            return n6.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((o2) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۡۡۧ, reason: not valid java name and contains not printable characters */
    public static int m5298(Object obj) {
        if (C0201.m8184() < 0) {
            return ((ByteBuffer) obj).getInt();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۢۦ۟, reason: not valid java name and contains not printable characters */
    public static void m5299(Object obj) {
        if (C0017.m627() > 0) {
            ((xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).V();
        }
    }

    /* JADX INFO: renamed from: ۟ۤۦۤ, reason: not valid java name and contains not printable characters */
    public static void m5300(Object obj, Object obj2) {
        if (C0194.m7889() >= 0) {
            ((HookMain) obj).H((Context) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۦۤۤ, reason: not valid java name and contains not printable characters */
    public static void m5301(Object obj) {
        if (C0218.m8760() > 0) {
            ((Map) obj).clear();
        }
    }

    /* JADX INFO: renamed from: ۟ۤۦۨۢ, reason: not valid java name and contains not printable characters */
    public static void m5302(Object obj, Object obj2) {
        if (C0219.m8794() >= 0) {
            ((j0) obj).l((TypedArray) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean m5303(Object obj, Object obj2) {
        if (C0014.m545() > 0) {
            return ((Activity) obj).shouldUpRecreateTask((Intent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۤۨ۠, reason: not valid java name and contains not printable characters */
    public static boolean m5304(Object obj) {
        if (C0112.m4054() <= 0) {
            return ((da) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۥۨۧ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m5305(Object obj, Object obj2) {
        if (C0035.m1268() <= 0) {
            return ((OkHttpClient.Builder) obj).addInterceptor((Interceptor) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۧۨ, reason: not valid java name and contains not printable characters */
    public static LicenseManager m5306(Object obj) {
        if (C0176.m7290() >= 0) {
            return ((ve) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static void m5307(Object obj, int i, int i2, int i3, int i4) {
        if (C0213.m8458() > 0) {
            ((LinearLayout) obj).setPadding(i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static boolean m5308(Object obj) {
        if (C0235.m9535() < 0) {
            return ((Inflater) obj).finished();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۡ۟۠, reason: not valid java name and contains not printable characters */
    public static un m5309(Object obj) {
        if (C0024.m896() > 0) {
            return ((f2.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۤۨ, reason: not valid java name and contains not printable characters */
    public static String m5310(Object obj) {
        if (C0036.m1332() < 0) {
            return ((rr) obj).k();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m5311(Object obj, Object obj2, int i) {
        if (C0017.m627() >= 0) {
            ((Parcel) obj).writeParcelable((Parcelable) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۢۧۢ, reason: not valid java name and contains not printable characters */
    public static void m5312(Object obj, Object obj2) {
        if (C0225.m9001() > 0) {
            HookMain.m5401((HookMain) obj, (Context) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۦۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean m5313(Object obj) {
        if (C0211.m8341() >= 0) {
            return ((AccessibilityNodeInfo) obj).isFocused();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static TextDirectionHeuristic m5314() {
        if (C0078.m3044() <= 0) {
            return TextDirectionHeuristics.RTL;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m5315(Object obj, Object obj2) {
        if (C0099.m3752() < 0) {
            ((v0) obj).P0((Configuration) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۥۢ, reason: not valid java name and contains not printable characters */
    public static boolean m5316(Object obj) {
        if (C0004.m139() <= 0) {
            return ((MainActivity) obj).E;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۤ۠۠, reason: not valid java name and contains not printable characters */
    public static Interpolator m5318() {
        if (m5274() < 0) {
            return zr.o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۥۥ, reason: not valid java name and contains not printable characters */
    public static void m5319(Object obj, int i) {
        if (C0062.m2326() >= 0) {
            ((r6) obj).c(i);
        }
    }

    /* JADX INFO: renamed from: ۠ۦۣۨ, reason: not valid java name and contains not printable characters */
    public static int m5320(Object obj) {
        if (C0211.m8341() > 0) {
            return ((zr) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static void m5321(Object obj, Object obj2) {
        if (C0231.m9265() > 0) {
            ((Drawable) obj).copyBounds((Rect) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۨۦۨ, reason: not valid java name and contains not printable characters */
    public static Retrofit m5322(Object obj) {
        if (C0182.m7528() < 0) {
            return ((Retrofit.Builder) obj).build();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۥۡ, reason: not valid java name and contains not printable characters */
    public static void m5323(Object obj) {
        if (C0195.m7914() >= 0) {
            ((AppCompatActivity) obj).J();
        }
    }

    /* JADX INFO: renamed from: ۣۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m5324(Object obj, Object obj2, Object obj3) {
        if (C0120.m4608() >= 0) {
            return ((wr.l) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj2, (KeyEvent) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۡۨ۠, reason: not valid java name and contains not printable characters */
    public static boolean m5325(Object obj, int i, Object obj2, boolean z) {
        if (C0249.m10052() < 0) {
            return ((v0) obj).Q0(i, (mf) obj2, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۡۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m5326(Object obj) {
        if (C0211.m8341() > 0) {
            return ((Map) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۢۡۧ, reason: not valid java name and contains not printable characters */
    public static void m5327(Object obj, Object obj2, int i) {
        if (C0040.m1622() < 0) {
            ((TextView) obj).setTypeface((Typeface) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۣۣۢۦ, reason: not valid java name and contains not printable characters */
    public static void m5328(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0058.m2184() > 0) {
            ((Logger) obj).log((Level) obj2, (String) obj3, (Throwable) obj4);
        }
    }

    /* JADX INFO: renamed from: ۣۢۦۢ, reason: not valid java name and contains not printable characters */
    public static UUID m5329() {
        if (C0084.m3253() <= 0) {
            return UUID.randomUUID();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m5330(Object obj) {
        if (C0182.m7528() <= 0) {
            C0181.m7485((Activity) obj);
        }
    }

    /* JADX INFO: renamed from: ۢۥۤ, reason: not valid java name and contains not printable characters */
    public static boolean m5331(Object obj, Object obj2) {
        if (C0020.m701() >= 0) {
            return ((j0) obj).onStateChange((int[]) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۥۧۡ, reason: not valid java name and contains not printable characters */
    public static int m5332(Object obj) {
        if (C0023.m843() > 0) {
            return ((pr) obj).getAlpha();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m5333(Object obj, Object obj2) {
        if (C0023.m843() > 0) {
            ((Context) obj).startActivity((Intent) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤ۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m5334(Object obj) {
        if (C0234.m9461() <= 0) {
            return ((i1) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۦ۠, reason: not valid java name and contains not printable characters */
    public static ks m5335(Object obj) {
        if (C0053.m1959() >= 0) {
            return ((ws) obj).l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۤۢ, reason: not valid java name and contains not printable characters */
    public static int m5336(Object obj) {
        if (C0161.m6744() >= 0) {
            return ((uo.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۤۢۡ, reason: not valid java name and contains not printable characters */
    public static byte[] m5337(Object obj, Object obj2) {
        if (C0162.m6837() < 0) {
            return ((Cipher) obj).doFinal((byte[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۢۦ, reason: not valid java name and contains not printable characters */
    public static String m5338(Object obj, int i) {
        if (C0204.m8270() <= 0) {
            return ((Resources) obj).getResourcePackageName(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۢ۟, reason: not valid java name and contains not printable characters */
    public static void m5339(Object obj, int i, Object obj2) {
        if (C0055.m2054() > 0) {
            ((em) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۦۤۦ, reason: not valid java name and contains not printable characters */
    public static int m5340(int i) {
        if (C0083.m3188() <= 0) {
            return KeyEvent.normalizeMetaState(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟ۨ۠, reason: contains not printable characters */
    public static uk.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m5341(Object obj) {
        if (C0035.m1268() < 0) {
            return ((uk) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۢۢ, reason: contains not printable characters */
    public static int m5342(Object obj, int i, int i2, int i3, Object obj2, Object obj3, Object obj4, int i4, Object obj5) {
        if (C0069.m2756() <= 0) {
            return ((Menu) obj).addIntentOptions(i, i2, i3, (ComponentName) obj2, (Intent[]) obj3, (Intent) obj4, i4, (MenuItem[]) obj5);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۣ۠ۨ, reason: contains not printable characters */
    public static Object m5343(Object obj) {
        if (C0240.m9826() > 0) {
            return ((uo) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤ, reason: contains not printable characters */
    public static void m5344(Object obj, Object obj2) {
        if (C0002.m72() >= 0) {
            ((hm) obj).l((hm.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۦۡۧ, reason: contains not printable characters */
    public static boolean m5345(Object obj) {
        if (C0047.m1663() <= 0) {
            return ((xp) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦ۟ۥ, reason: contains not printable characters */
    public static char[] m5346(Object obj) {
        if (C0218.m8760() > 0) {
            return ((mo.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۦۢ, reason: contains not printable characters */
    public static boolean m5347(Object obj, int i, int i2) {
        if (C0039.m1515() < 0) {
            return ((pr.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۣۢۧ, reason: contains not printable characters */
    public static nm.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m5348() {
        if (C0187.m7613() >= 0) {
            return nm.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۡۧ, reason: contains not printable characters */
    public static TextDirectionHeuristic m5349(Object obj) {
        if (C0161.m6744() > 0) {
            return ((uk.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.C0145x35d57e31) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۦۣ, reason: contains not printable characters */
    public static Drawable m5350(Object obj, Object obj2) {
        if (C0200.m8104() <= 0) {
            return ((qo) obj).k((Cursor) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static Map m5351() {
        if (C0133.m5208() < 0) {
            return y3.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۧ۟, reason: not valid java name and contains not printable characters */
    public static Random m5352(Object obj) {
        if (C0232.m9299() > 0) {
            return ((c9.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۧۡ, reason: not valid java name and contains not printable characters */
    public static l3.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m5353(Object obj) {
        if (C0211.m8341() > 0) {
            return ((l3) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۥۥ, reason: not valid java name and contains not printable characters */
    public static void m5354(Object obj) {
        if (C0112.m4054() <= 0) {
            ((hk) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۧۤۧۥ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m5355(Object obj) {
        if (C0106.m3835() >= 0) {
            return ((CompoundButton) obj).getButtonTintList();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۤ۟, reason: not valid java name and contains not printable characters */
    public static void m5356(Object obj, Object obj2) {
        if (C0072.m2856() < 0) {
            ((yj) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧۦ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m5357(Object obj, int i, Object obj2, Object obj3) {
        if (C0065.m2448() > 0) {
            ((Cipher) obj).init(i, (Key) obj2, (AlgorithmParameterSpec) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m5317(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
