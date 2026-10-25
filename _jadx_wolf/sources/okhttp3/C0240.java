package okhttp3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.media.MediaPlayer;
import android.support.v4.app.C0002;
import android.support.v4.app.C0004;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0010;
import android.support.v4.graphics.drawable.C0011;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.activity.C0014;
import androidx.activity.C0017;
import androidx.annotation.C0026;
import androidx.appcompat.app.C0035;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.view.menu.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.C0051;
import androidx.core.app.C0052;
import androidx.core.app.C0053;
import androidx.core.app.C0055;
import androidx.core.graphics.drawable.C0065;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0070;
import androidx.drawerlayout.widget.C0072;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0083;
import androidx.emoji2.text.C0084;
import androidx.emoji2.text.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0095;
import androidx.fragment.app.C0096;
import androidx.lifecycle.C0108;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0117;
import androidx.savedstate.C0126;
import androidx.versionedparcelable.C0133;
import androidx.versionedparcelable.C0135;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.HookMain;
import com.example.vcam.LicenseManager;
import com.example.vcam.MainActivity;
import com.example.vcam.Menu;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.c2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ng;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pi;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qi;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.th;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.w;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zs;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.DeflaterOutputStream;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.internal.ws.C0224;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0232;
import okhttp3.logging.C0233;
import okhttp3.logging.C0234;
import okhttp3.logging.C0235;
import org.xmlpull.v1.XmlPullParser;
import retrofit2.C0259;
import retrofit2.converter.scalars.C0243;

/* JADX INFO: renamed from: okhttp3.۟ۢۡۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0240 {

    /* JADX INFO: renamed from: ۟ۥۥ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int f690 = 204;

    /* JADX INFO: renamed from: ۟۟۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static boolean m9810(Object obj) {
        if (C0233.m9365() <= 0) {
            return ((l1) obj).f();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۡۡۦ, reason: not valid java name and contains not printable characters */
    public static int m9811(Object obj) {
        if (C0006.m169() < 0) {
            return ((u7) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۡۥۤ, reason: not valid java name and contains not printable characters */
    public static String m9812(Object obj) {
        if (C0126.m4908() <= 0) {
            return ((ProviderInfo) obj).packageName;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۡۨۨ, reason: not valid java name and contains not printable characters */
    public static Object m9813(Object obj) {
        if (C0213.m8458() >= 0) {
            return ((Map.Entry) obj).getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۡۦ, reason: not valid java name and contains not printable characters */
    public static boolean m9814(Object obj) {
        if (C0202.m8245() >= 0) {
            return ((xf) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۥۨۦ, reason: not valid java name and contains not printable characters */
    public static boolean m9815(Object obj) {
        if (C0069.m2756() <= 0) {
            return u0.m((Context) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۧۥ۠, reason: not valid java name and contains not printable characters */
    public static Map m9816(Object obj) {
        if (C0187.m7613() > 0) {
            return ng.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((jk) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m9817(Object obj) {
        if (C0040.m1622() <= 0) {
            return ((TextView) obj).isEnabled();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static String m9818(Object obj) {
        if (C0004.m139() <= 0) {
            return ((l2.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static Object m9819(Object obj) {
        if (C0074.m2951() < 0) {
            return ((bf) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m9820(Object obj, int i) {
        if (C0181.m7445() > 0) {
            ((ConnectionBlocker) obj).o(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۡۡۢ, reason: not valid java name and contains not printable characters */
    public static String m9821(String str) {
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

    /* JADX INFO: renamed from: ۟ۢ۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static void m9822(Object obj, int i, Object obj2) {
        if (C0010.m354() < 0) {
            ((wn) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۨۧ۟, reason: not valid java name and contains not printable characters */
    public static Menu m9823(Object obj) {
        if (C0259.m10136() > 0) {
            return ((th) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static ColorFilter m9824(Object obj) {
        if (C0135.m5274() <= 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).v;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥۢ, reason: not valid java name and contains not printable characters */
    public static CharSequence m9825(Object obj, Object obj2, int i, int i2, int i3, int i4) {
        if (C0235.m9535() < 0) {
            return ((xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).i((CharSequence) obj2, i, i2, i3, i4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧۧ, reason: not valid java name and contains not printable characters */
    public static int m9826() {
        return 681 ^ C0072.f66;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m9827(Object obj, Object obj2) {
        if (C0026.m1047() > 0) {
            ((wr.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۥۢۧ, reason: not valid java name and contains not printable characters */
    public static AppCompatTextView m9828(Object obj, Object obj2, Object obj3) {
        if (C0232.m9299() > 0) {
            return ((m1) obj).g((Context) obj2, (AttributeSet) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡ۟۠, reason: not valid java name and contains not printable characters */
    public static float m9829(float f) {
        if (C0095.m3478() <= 0) {
            return Math.signum(f);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۤۦۧۢ, reason: not valid java name and contains not printable characters */
    public static void m9830(Object obj, int i, Object obj2) {
        if (C0215.m8604() < 0) {
            ((pi) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, (ByteBuffer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۡۢۨ, reason: not valid java name and contains not printable characters */
    public static void m9831(Object obj, Object obj2, Object obj3) {
        if (C0053.m1959() > 0) {
            ((d0) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj2, (w) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۡۤۥ, reason: not valid java name and contains not printable characters */
    public static String m9832(Object obj) {
        if (C0065.m2448() > 0) {
            return C0084.m3271((LicenseManager) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۢۡ, reason: not valid java name and contains not printable characters */
    public static void m9833(Object obj) {
        if (C0040.m1622() < 0) {
            ((v0.g) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣۦۢ, reason: not valid java name and contains not printable characters */
    public static CharSequence m9834(Object obj, Object obj2) {
        if (C0084.m3253() < 0) {
            return ((ResolveInfo) obj).loadLabel((PackageManager) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۢ۟, reason: not valid java name and contains not printable characters */
    public static void m9835(Object obj, int i) {
        if (C0232.m9299() >= 0) {
            wr.C((View) obj, i);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۨۧ, reason: not valid java name and contains not printable characters */
    public static boolean m9836(Object obj) {
        if (C0199.m7998() <= 0) {
            return ((x9) obj).b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۦۡ۟, reason: not valid java name and contains not printable characters */
    public static void m9837(Object obj) throws IOException {
        if (C0017.m627() > 0) {
            ((DeflaterOutputStream) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m9838(Object obj) {
        if (C0182.m7528() < 0) {
            return ((Configuration) obj).screenHeightDp;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static void m9839(Object obj, Object obj2) {
        if (C0243.m9964() >= 0) {
            ((TextView) obj).setBackground((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static int m9840(Object obj) {
        if (C0010.m354() < 0) {
            return ((XmlPullParser) obj).getDepth();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۢۨۧ, reason: not valid java name and contains not printable characters */
    public static void m9841(Object obj) {
        if (C0014.m545() >= 0) {
            ((MainActivity) obj).d0();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡۧ, reason: not valid java name and contains not printable characters */
    public static boolean m9842(Object obj, Object obj2) {
        if (C0149.m6476() <= 0) {
            return ((Set) obj).add(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static dp m9843(Object obj, Object obj2) {
        if (C0051.m1783() <= 0) {
            return ((zs) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((dp) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۦۤ, reason: not valid java name and contains not printable characters */
    public static MainActivity m9845(Object obj) {
        if (C0149.m6476() < 0) {
            return ((dg) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static Surface m9846() {
        if (C0055.m2054() >= 0) {
            return HookMain.c2_preview_Surfcae_1;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۣۦ, reason: not valid java name and contains not printable characters */
    public static void m9847(Object obj) {
        if (C0096.m3601() <= 0) {
            ((Toolbar) obj).q();
        }
    }

    /* JADX INFO: renamed from: ۠ۦۤۧ, reason: not valid java name and contains not printable characters */
    public static List m9848(Object obj) {
        if (C0108.m4038() > 0) {
            return c2.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Object[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۧۥ, reason: not valid java name and contains not printable characters */
    public static boolean m9849(Object obj) {
        if (C0219.m8794() >= 0) {
            return ((mf) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۡۨۡ, reason: not valid java name and contains not printable characters */
    public static byte[] m9850(Object obj) {
        if (C0052.m1890() > 0) {
            return ((MessageDigest) obj).digest();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean m9851() {
        if (C0199.m7998() < 0) {
            return kq.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۢۢ۟, reason: not valid java name and contains not printable characters */
    public static boolean m9852(Object obj, Object obj2, Object obj3) {
        if (C0232.m9299() >= 0) {
            return ((h) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ClickableSpan) obj2, (View) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۡۢۡ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m9853(Object obj) {
        if (C0233.m9365() <= 0) {
            return ((vo) obj).getIconTintList();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۧ۟, reason: not valid java name and contains not printable characters */
    public static Typeface m9854(Object obj) {
        if (C0211.m8341() >= 0) {
            return ((Typeface.Builder) obj).build();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m9855(Object obj) {
        if (C0225.m9001() >= 0) {
            ((xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).U();
        }
    }

    /* JADX INFO: renamed from: ۢۤۢ۠, reason: not valid java name and contains not printable characters */
    public static float m9856(Object obj, long j) {
        if (C0217.m8693() < 0) {
            return ((m2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(j);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۢۧۧۢ, reason: not valid java name and contains not printable characters */
    public static View.AccessibilityDelegate m9857() {
        if (C0002.m72() >= 0) {
            return h.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۨۥ, reason: not valid java name and contains not printable characters */
    public static int m9858(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static void m9859(Object obj, Object obj2) {
        if (C0083.m3188() < 0) {
            ((HookMain) obj).D((MediaPlayer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣۧۨ, reason: not valid java name and contains not printable characters */
    public static float m9860(Object obj, int i, float f) {
        if (C0117.m4419() <= 0) {
            return ((TypedArray) obj).getDimension(i, f);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۨۥۨ, reason: not valid java name and contains not printable characters */
    public static Class m9861(Object obj, boolean z, Object obj2) {
        if (C0235.m9535() <= 0) {
            return Class.forName((String) obj, z, (ClassLoader) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m9862(Object obj) {
        if (C0202.m8245() >= 0) {
            return ((Window.Callback) obj).onSearchRequested();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m9863(Object obj) {
        if (C0094.m3450() > 0) {
            ((android.view.Menu) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟ۧ, reason: contains not printable characters */
    public static int m9864(int i, int i2, int i3, int i4) {
        if (C0070.m2829() < 0) {
            return Color.argb(i, i2, i3, i4);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۡۢ۟, reason: contains not printable characters */
    public static void m9865(Object obj) {
        if (C0204.m8270() < 0) {
            ((android.view.Menu) obj).clear();
        }
    }

    /* JADX INFO: renamed from: ۥۦۡۡ, reason: contains not printable characters */
    public static int[] m9866(Object obj) {
        if (C0035.m1268() < 0) {
            return ((SeekBar) obj).getDrawableState();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۧۤ, reason: contains not printable characters */
    public static PorterDuffColorFilter m9867(Object obj) {
        if (C0235.m9535() < 0) {
            return ((qm) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۟۠, reason: contains not printable characters */
    public static Resources m9868(Object obj) {
        if (C0133.m5208() < 0) {
            return ((View) obj).getResources();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۤۢ, reason: contains not printable characters */
    public static byte[] m9869(Object obj, Object obj2) {
        if (C0051.m1783() <= 0) {
            return C0117.m4402((HookMain) obj, (Bitmap) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۤۡ, reason: contains not printable characters */
    public static Throwable m9870(Object obj) {
        if (C0040.m1622() <= 0) {
            return ((r4) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦ۠ۨ, reason: contains not printable characters */
    public static boolean m9871(Object obj) {
        if (C0194.m7889() > 0) {
            return ((l2) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۦۢۧ, reason: contains not printable characters */
    public static boolean m9872(Object obj, int i, int i2, int i3, int i4) {
        if (C0011.m458() > 0) {
            return ((Rect) obj).intersects(i, i2, i3, i4);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۧۥۡ, reason: contains not printable characters */
    public static int m9873(Object obj) {
        if (C0178.m7344() < 0) {
            return ((ViewGroup.MarginLayoutParams) obj).rightMargin;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m9874() {
        if (C0238.m9653() >= 0) {
            z0.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۣۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static Image.Plane[] m9875(Object obj) {
        if (C0243.m9964() > 0) {
            return ((Image) obj).getPlanes();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۧۡ, reason: not valid java name and contains not printable characters */
    public static hm.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m9876(Object obj) {
        if (C0055.m2054() > 0) {
            return ((hm) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۨۧ, reason: not valid java name and contains not printable characters */
    public static void m9877(Object obj, Object obj2) {
        if (C0219.m8794() >= 0) {
            ((Canvas) obj).getMatrix((Matrix) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧۥۢ۟, reason: not valid java name and contains not printable characters */
    public static long m9878(int i) {
        if (C0224.m8861() <= 0) {
            return qi.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static s2 m9879(Object obj) {
        if (C0204.m8270() <= 0) {
            return ((u2) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m9880(Object obj) {
        if (C0234.m9461() <= 0) {
            return ((u7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨۥۧ, reason: not valid java name and contains not printable characters */
    public static void m9881(Object obj, int i, Object obj2) {
        if (C0194.m7889() >= 0) {
            ((Window.Callback) obj).onPanelClosed(i, (android.view.Menu) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۨۤۤ, reason: not valid java name and contains not printable characters */
    public static float m9882(Object obj) {
        if (C0181.m7445() > 0) {
            return ((e3) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۨۧۢۨ, reason: not valid java name and contains not printable characters */
    public static v0 m9883(Object obj) {
        if (C0116.m4340() >= 0) {
            return v0.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۤ۟, reason: not valid java name and contains not printable characters */
    public static String m9844(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
