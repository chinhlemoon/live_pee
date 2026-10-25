package androidx.fragment.app;

import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.support.v4.app.C0004;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0009;
import android.text.Editable;
import android.text.method.TransformationMethod;
import android.text.style.ClickableSpan;
import android.transition.Transition;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeProvider;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.activity.C0014;
import androidx.annotation.C0025;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0034;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.widget.C0047;
import androidx.core.app.C0051;
import androidx.core.app.C0055;
import androidx.core.content.C0057;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0064;
import androidx.core.widget.C0068;
import androidx.drawerlayout.widget.C0070;
import androidx.drawerlayout.widget.C0072;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0079;
import androidx.emoji2.text.C0084;
import androidx.lifecycle.C0107;
import androidx.lifecycle.C0108;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0118;
import androidx.profileinstaller.C0119;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0126;
import com.example.vcam.C0141;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.HookMain;
import com.example.vcam.LicenseManager;
import com.example.vcam.MainActivity;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.Cif;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.eg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.eo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ft;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ko;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ni;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ol;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.to;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.us;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.we;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import okhttp3.C0238;
import okhttp3.C0239;
import okhttp3.HttpUrl;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.io.C0195;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.logging.C0231;
import okhttp3.logging.C0236;
import org.xmlpull.v1.XmlSerializer;
import retrofit2.C0259;

/* JADX INFO: renamed from: androidx.fragment.app.۟ۡۦۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0093 {

    /* JADX INFO: renamed from: ۟ۦۣۤۤ, reason: not valid java name and contains not printable characters */
    public static int f80 = -723;

    /* JADX INFO: renamed from: ۟۟۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static Class m3295(Object obj) {
        if (C0113.m4144() <= 0) {
            return ((y3) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static void m3296(Object obj, Object obj2, Object obj3) throws IOException {
        if (C0094.m3450() > 0) {
            ((XmlSerializer) obj).startDocument((String) obj2, (Boolean) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟۟۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static String m3297(Object obj) {
        if (C0031.m1148() <= 0) {
            return ((CharSequence) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۧۧ, reason: not valid java name and contains not printable characters */
    public static void m3298(Object obj, boolean z) {
        if (C0006.m169() < 0) {
            ((h8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).a(z);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۧۢۧ, reason: not valid java name and contains not printable characters */
    public static int m3299(Object obj) {
        if (C0074.m2951() <= 0) {
            return ((lg.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static Integer m3300(Object obj, int i) {
        if (C0047.m1663() < 0) {
            return ko.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static Set m3301(Object obj) {
        if (C0116.m4340() >= 0) {
            return ((LinkedHashMap) obj).entrySet();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۢۨ, reason: not valid java name and contains not printable characters */
    public static String m3302(String str) {
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

    /* JADX INFO: renamed from: ۟ۡ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static n9.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m3303(Object obj, Object obj2, Object obj3) {
        if (C0118.m4454() > 0) {
            return i9.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj, (j9) obj2, (CancellationSignal) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static n9.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m3304(Object obj, int i, int i2, boolean z, int i3) {
        if (C0108.m4038() >= 0) {
            return n9.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Uri) obj, i, i2, z, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۡ, reason: not valid java name and contains not printable characters */
    public static void m3305(Object obj, float f, float f2) {
        if (C0084.m3253() < 0) {
            u7.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj, f, f2);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static Context m3306(Object obj) {
        if (C0009.m276() < 0) {
            return ((Context) obj).getApplicationContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۡۧ, reason: not valid java name and contains not printable characters */
    public static int m3307(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۡۤۤۧ, reason: not valid java name and contains not printable characters */
    public static Context m3308(Object obj) {
        if (C0126.m4908() <= 0) {
            return ((SeekBar) obj).getContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۤ۟, reason: not valid java name and contains not printable characters */
    public static String m3309() {
        if (C0055.m2054() >= 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۧۤ, reason: not valid java name and contains not printable characters */
    public static sn m3310(Object obj, boolean z, int i) {
        if (C0074.m2951() < 0) {
            return sj.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((File) obj, z, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static String m3311(long j) {
        if (C0072.m2856() <= 0) {
            return String.valueOf(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static void m3312(Object obj, Object obj2) {
        if (C0176.m7290() >= 0) {
            C0118.m4485((HookMain) obj, (Class) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۤ۠, reason: not valid java name and contains not printable characters */
    public static Object[] m3313(Object obj, int i) {
        if (C0004.m139() <= 0) {
            return Arrays.copyOf((Object[]) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۢ۠, reason: not valid java name and contains not printable characters */
    public static Locale m3314(Object obj) {
        if (C0259.m10136() >= 0) {
            return ((TextView) obj).getTextLocale();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۧۦ, reason: not valid java name and contains not printable characters */
    public static void m3315(Object obj, Object obj2, int i, Object obj3) {
        if (C0006.m169() <= 0) {
            ((ViewGroup) obj).addView((View) obj2, i, (ViewGroup.LayoutParams) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۥۣ۠, reason: not valid java name and contains not printable characters */
    public static IOException m3316(Object obj, Object obj2) {
        if (C0231.m9265() > 0) {
            return ((f2) obj).newTimeoutException((IOException) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۧۦ, reason: not valid java name and contains not printable characters */
    public static int m3317(Object obj) {
        if (C0117.m4419() < 0) {
            return ((Configuration) obj).navigationHidden;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۦۣۨ, reason: not valid java name and contains not printable characters */
    public static CharSequence m3318(Object obj) {
        if (C0215.m8604() <= 0) {
            return ((MenuItem) obj).getTitleCondensed();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۡ۠, reason: not valid java name and contains not printable characters */
    public static ConnectionBlocker m3319(Object obj) {
        if (C0238.m9653() > 0) {
            return ((ConnectionBlocker.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m3320(Object obj) {
        if (C0014.m545() >= 0) {
            return ((View) obj).getBackgroundTintMode();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧ۟, reason: not valid java name and contains not printable characters */
    public static y4 m3321(Object obj) {
        if (C0141.m5769() > 0) {
            return y4.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ColorStateList) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m3322(Object obj, Object obj2) {
        if (C0070.m2829() <= 0) {
            wr.d.m((View) obj, (uj) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨۡ, reason: not valid java name and contains not printable characters */
    public static int m3323(Object obj) {
        if (C0218.m8760() >= 0) {
            return ((n9.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۥ۠ۨ, reason: not valid java name and contains not printable characters */
    public static l1 m3324(Object obj) {
        if (C0097.m3659() >= 0) {
            return ((k1) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static CharSequence m3325(Object obj) {
        if (C0164.m6900() <= 0) {
            return wr.h.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۢ, reason: not valid java name and contains not printable characters */
    public static int m3326(Object obj, Object obj2) {
        if (C0014.m545() >= 0) {
            return ((z1) obj).indexOf(obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m3327(Object obj) {
        if (C0161.m6744() > 0) {
            ((pr.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).a();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣۤۤ, reason: not valid java name and contains not printable characters */
    public static void m3328(Object obj, Object obj2) {
        if (C0097.m3659() >= 0) {
            ((y9) obj).i((c) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣۤۧ, reason: not valid java name and contains not printable characters */
    public static void m3329(Object obj, Object obj2) {
        if (C0113.m4144() < 0) {
            ((ClickableSpan) obj).onClick((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۤۤۨ, reason: not valid java name and contains not printable characters */
    public static v0.g m3330(Object obj, Object obj2) {
        if (C0191.m7812() > 0) {
            return ((v0) obj).g0((Context) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۢۥ, reason: not valid java name and contains not printable characters */
    public static Object m3331(Object obj) {
        if (C0120.m4608() > 0) {
            return ((u1) obj).d();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۡ۟, reason: not valid java name and contains not printable characters */
    public static MediaPlayer m3332() {
        if (C0079.m3072() <= 0) {
            return HookMain.mplayer1;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۨۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3333(Object obj) {
        if (C0176.m7290() > 0) {
            return ((i) obj).s();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۡ, reason: not valid java name and contains not printable characters */
    public static int[] m3334(Object obj) {
        if (C0195.m7914() >= 0) {
            return ((l1) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۣۦ, reason: not valid java name and contains not printable characters */
    public static Editable m3335(Object obj) {
        if (m3365() >= 0) {
            return ((TextView) obj).getEditableText();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static int m3336(Object obj) {
        if (C0176.m7290() >= 0) {
            return ((zr.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۦ۠ۤ, reason: not valid java name and contains not printable characters */
    public static TransformationMethod m3337(Object obj, Object obj2) {
        if (C0172.m7180() >= 0) {
            return ((h8.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TransformationMethod) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۤ, reason: not valid java name and contains not printable characters */
    public static String m3338(Object obj) {
        if (C0055.m2054() >= 0) {
            return ((we) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۡۡ, reason: not valid java name and contains not printable characters */
    public static int m3339(Object obj) {
        if (C0057.m2142() >= 0) {
            return ((vf) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۨ, reason: not valid java name and contains not printable characters */
    public static void m3340(Object obj, Object obj2) {
        if (C0169.m7034() <= 0) {
            ((t8) obj).i0((Runnable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3341(Object obj) {
        if (C0051.m1783() <= 0) {
            return ((xd.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۥۥۧ, reason: not valid java name and contains not printable characters */
    public static int[] m3342() {
        if (C0095.m3478() < 0) {
            return ol.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۢ۠, reason: not valid java name and contains not printable characters */
    public static String m3343(Object obj, char c, char c2, boolean z) {
        if (C0191.m7812() >= 0) {
            return lo.j((String) obj, c, c2, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۤۧ, reason: not valid java name and contains not printable characters */
    public static int m3344(Object obj) {
        if (C0215.m8604() <= 0) {
            return ((m9.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static Handler m3345(Object obj) {
        if (C0218.m8760() > 0) {
            return ((dm.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۥۢ, reason: not valid java name and contains not printable characters */
    public static SparseArray m3346(Object obj) {
        if (C0149.m6476() < 0) {
            return ((SparseArray) obj).clone();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤ۠, reason: not valid java name and contains not printable characters */
    public static xo m3347() {
        if (C0107.m3883() > 0) {
            return yd.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۢۢ, reason: not valid java name and contains not printable characters */
    public static mf m3348() {
        if (C0025.m934() > 0) {
            return mf.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۣۣ, reason: not valid java name and contains not printable characters */
    public static boolean m3349(Object obj) {
        if (C0034.m1206() <= 0) {
            return ((ListView) obj).isPressed();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۥۨ۟, reason: not valid java name and contains not printable characters */
    public static MenuItem m3350(Object obj, boolean z) {
        if (C0126.m4908() < 0) {
            return ((MenuItem) obj).setChecked(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۨۢ, reason: not valid java name and contains not printable characters */
    public static int m3351(Object obj) {
        if (C0211.m8341() > 0) {
            return ((View) obj).getPaddingEnd();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۨۥ۠, reason: not valid java name and contains not printable characters */
    public static float m3352(Object obj) {
        if (C0162.m6837() <= 0) {
            return ((us) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۣ۠۟, reason: not valid java name and contains not printable characters */
    public static int m3353() {
        if (C0014.m545() >= 0) {
            return i.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۥ, reason: not valid java name and contains not printable characters */
    public static CharSequence m3354(Object obj, Object obj2, int i) {
        if (C0188.m7736() < 0) {
            return lp.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj, (ClipData.Item) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۨ, reason: not valid java name and contains not printable characters */
    public static zp m3355(Object obj, int i, Object obj2) {
        if (C0172.m7180() > 0) {
            return zp.k((Context) obj, i, (int[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static eo.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m3356() {
        if (C0181.m7445() >= 0) {
            return eo.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۡۥ, reason: not valid java name and contains not printable characters */
    public static qn m3357(Object obj) {
        if (C0149.m6476() < 0) {
            return ((o9) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۥۣ, reason: not valid java name and contains not printable characters */
    public static EditText m3358(Object obj) {
        if (C0231.m9265() > 0) {
            return ((MainActivity) obj).w;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۤ, reason: not valid java name and contains not printable characters */
    public static Cif m3359(Object obj) {
        if (C0204.m8270() <= 0) {
            return ((gf) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡ۟۟, reason: not valid java name and contains not printable characters */
    public static void m3360(Object obj, Object obj2, Object obj3) {
        if (C0112.m4054() <= 0) {
            hm.n((Drawable) obj, (xp) obj2, (int[]) obj3);
        }
    }

    /* JADX INFO: renamed from: ۤۤۢۢ, reason: not valid java name and contains not printable characters */
    public static String m3361(Object obj, Object obj2, Object obj3, Object obj4, int i, Object obj5, Object obj6) {
        if (C0239.m9805() <= 0) {
            return l4.r((Iterable) obj, (CharSequence) obj2, (CharSequence) obj3, (CharSequence) obj4, i, (CharSequence) obj5, (qa) obj6);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۡۡ, reason: contains not printable characters */
    public static boolean m3363(Object obj) {
        if (C0119.m4573() >= 0) {
            return ((qn) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣۡ۟, reason: contains not printable characters */
    public static to m3364(Object obj) {
        if (C0040.m1622() <= 0) {
            return ((ni) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۡۧ, reason: contains not printable characters */
    public static int m3365() {
        return (-445) ^ C0068.f62;
    }

    /* JADX INFO: renamed from: ۥۤۥۨ, reason: contains not printable characters */
    public static LicenseManager m3366(Object obj) {
        if (C0064.m2388() > 0) {
            return ((HookMain) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۨۧ, reason: contains not printable characters */
    public static ft.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m3367() {
        if (C0215.m8604() <= 0) {
            return ft.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۢۧ, reason: contains not printable characters */
    public static xd.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m3368(Object obj) {
        if (C0200.m8104() <= 0) {
            return ((xd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۧ۠, reason: contains not printable characters */
    public static AccessibilityNodeProvider m3369(Object obj) {
        if (C0040.m1622() < 0) {
            return ((View) obj).getAccessibilityNodeProvider();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۡۢ, reason: contains not printable characters */
    public static List m3370(Object obj) {
        if (C0058.m2184() >= 0) {
            return ((Transition) obj).getTargetTypes();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۥۦ, reason: not valid java name and contains not printable characters */
    public static boolean m3371(Object obj) {
        if (C0217.m8693() <= 0) {
            return ((eg) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ۠۟۠, reason: not valid java name and contains not printable characters */
    public static Object m3372(Object obj, int i, Object obj2) {
        if (C0079.m3072() <= 0) {
            return ((wn) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۨۦ, reason: not valid java name and contains not printable characters */
    public static float m3373(Object obj) {
        if (C0236.m9615() > 0) {
            return ((e3) obj).b();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۨۤ۟, reason: not valid java name and contains not printable characters */
    public static SurfaceTexture m3374() {
        if (C0025.m934() > 0) {
            return HookMain.fake_SurfaceTexture;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۧۡ, reason: not valid java name and contains not printable characters */
    public static String m3362(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
