package okhttp3.internal.http1;

import android.animation.ValueAnimator;
import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.LocaleList;
import android.os.PowerManager;
import android.support.v4.app.C0002;
import android.support.v4.app.C0004;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0009;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.widget.AbsListView;
import android.widget.EdgeEffect;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.C0023;
import androidx.annotation.C0024;
import androidx.annotation.C0026;
import androidx.appcompat.app.C0035;
import androidx.appcompat.app.C0036;
import androidx.appcompat.app.C0037;
import androidx.appcompat.view.menu.C0039;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.core.app.C0052;
import androidx.core.app.C0053;
import androidx.core.app.C0055;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0065;
import androidx.drawerlayout.widget.C0070;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0079;
import androidx.emoji2.text.C0083;
import androidx.emoji2.text.C0084;
import androidx.fragment.app.C0096;
import androidx.fragment.app.a;
import androidx.lifecycle.C0106;
import androidx.lifecycle.C0107;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0118;
import androidx.profileinstaller.C0119;
import androidx.savedstate.C0123;
import androidx.savedstate.C0126;
import androidx.savedstate.C0127;
import androidx.versionedparcelable.C0129;
import androidx.versionedparcelable.C0133;
import com.example.vcam.C0141;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.HookMain;
import com.example.vcam.Menu;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ah;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ar;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.b3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.be;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.em;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.eo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gb;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ig;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.il;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jh;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ws;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.Deflater;
import okhttp3.C0239;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0195;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.internal.ws.C0224;
import okhttp3.logging.C0231;
import okhttp3.logging.C0233;
import retrofit2.C0259;
import retrofit2.converter.scalars.C0243;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: okhttp3.internal.http1.۟ۡۡۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0187 {

    /* JADX INFO: renamed from: ۣ۟۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static int f637 = -909;

    /* JADX INFO: renamed from: ۟۟ۡۡ۟, reason: not valid java name and contains not printable characters */
    public static View m7589(Object obj) {
        if (C0200.m8104() <= 0) {
            return ((fj) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۡۢۦ, reason: not valid java name and contains not printable characters */
    public static Object m7590(Object obj) {
        if (C0065.m2448() > 0) {
            return ((Map.Entry) obj).getKey();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۧۦ, reason: not valid java name and contains not printable characters */
    public static float m7591(Object obj) {
        if (C0083.m3188() <= 0) {
            return ((View) obj).getTranslationZ();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟۟ۥۡۤ, reason: not valid java name and contains not printable characters */
    public static void m7592(Object obj, Object obj2, int i, int i2, int i3, int i4, int i5, Object obj3) {
        if (C0074.m2951() <= 0) {
            hs.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ViewParent) obj, (View) obj2, i, i2, i3, i4, i5, (int[]) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۦۤۡ, reason: not valid java name and contains not printable characters */
    public static Context m7593(Object obj) {
        if (C0004.m139() < 0) {
            return ((l2) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨۢۧ, reason: not valid java name and contains not printable characters */
    public static void m7594(Object obj, Object obj2) {
        if (C0224.m8861() < 0) {
            ((LinearLayout) obj).addView((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static Object m7595(Object obj, Object obj2) {
        if (C0204.m8270() < 0) {
            return ((ConcurrentHashMap) obj).get(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static r7 m7596(Object obj) {
        if (C0200.m8104() < 0) {
            return r7.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۨ۟, reason: not valid java name and contains not printable characters */
    public static void m7597(Object obj) throws IOException {
        if (C0065.m2448() > 0) {
            ((ObjectOutputStream) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static Random m7598(Object obj) {
        if (C0083.m3188() <= 0) {
            return ((HookMain) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۨۦ, reason: not valid java name and contains not printable characters */
    public static ConnectionBlocker.BlockRule m7599(Object obj) {
        if (C0259.m10136() >= 0) {
            return ((jh) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m7600(Object obj, int i) {
        if (C0191.m7812() > 0) {
            return ((View) obj).startNestedScroll(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۡۧۢ, reason: not valid java name and contains not printable characters */
    public static boolean m7601(Object obj, boolean z, boolean z2) {
        if (C0215.m8604() < 0) {
            return ((j0) obj).setVisible(z, z2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static String m7602(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۡۨۤ, reason: not valid java name and contains not printable characters */
    public static Object[] m7603(Object obj, int i, int i2, Object obj2) {
        if (C0141.m5769() > 0) {
            return ((Spanned) obj).getSpans(i, i2, (Class) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۣۦ, reason: not valid java name and contains not printable characters */
    public static int m7604(Object obj) {
        if (C0062.m2326() >= 0) {
            return ((m9.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۦۦۢ, reason: not valid java name and contains not printable characters */
    public static void m7605(Object obj, Object obj2, Object obj3) {
        if (C0224.m8861() < 0) {
            ((l1.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((StaticLayout.Builder) obj2, (TextView) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m7606(Object obj) {
        if (C0126.m4908() <= 0) {
            ((xp) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۟ۡۧۡۧ, reason: not valid java name and contains not printable characters */
    public static String m7607(Object obj) {
        if (C0058.m2184() >= 0) {
            return ((m6) obj).m();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m7608(Object obj) {
        if (C0106.m3835() >= 0) {
            return ((hc) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۦۧ, reason: not valid java name and contains not printable characters */
    public static boolean m7609(Object obj, Object obj2) {
        if (C0119.m4573() > 0) {
            return ((Class) obj).isAssignableFrom((Class) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۦۣ۟, reason: not valid java name and contains not printable characters */
    public static Object m7610(Object obj, Object obj2, Object obj3) {
        if (C0123.m4841() <= 0) {
            return ((rn) obj).getOrDefault(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۧ۠, reason: not valid java name and contains not printable characters */
    public static int m7611(Object obj) {
        if (C0171.m7136() < 0) {
            return ((p) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static int m7612(Object obj) {
        if (C0178.m7344() <= 0) {
            return ((p) obj).k;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨۥ, reason: not valid java name and contains not printable characters */
    public static int m7613() {
        return (-226) ^ C0070.f64;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static float m7614(Object obj) {
        if (C0006.m169() <= 0) {
            return ((pr.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static TextPaint m7615(Object obj) {
        if (C0219.m8794() >= 0) {
            return ((TextView) obj).getPaint();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static void m7616(Object obj, boolean z) {
        if (C0215.m8604() <= 0) {
            u7.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((AbsListView) obj, z);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢ۟, reason: not valid java name and contains not printable characters */
    public static int m7617(Object obj) {
        if (C0023.m843() >= 0) {
            return ((sr) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥ۟, reason: not valid java name and contains not printable characters */
    public static boolean m7618(Object obj) {
        if (C0035.m1268() <= 0) {
            return ((s6) obj).i();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static HookMain m7619(Object obj) {
        if (C0055.m2054() > 0) {
            return ((HookMain.p) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۡ, reason: not valid java name and contains not printable characters */
    public static void m7620(Object obj, Object obj2) {
        if (C0231.m9265() >= 0) {
            HookMain.m5410((HookMain) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۨۡۡ, reason: not valid java name and contains not printable characters */
    public static Menu m7621(Object obj) {
        if (C0233.m9365() < 0) {
            return ((ah) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۢۡ, reason: not valid java name and contains not printable characters */
    public static ViewPropertyAnimator m7622(Object obj, Object obj2) {
        if (C0107.m3883() > 0) {
            return ((ViewPropertyAnimator) obj).setUpdateListener((ValueAnimator.AnimatorUpdateListener) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۤۥ, reason: not valid java name and contains not printable characters */
    public static int m7623() {
        if (C0074.m2951() <= 0) {
            return HookMain.onemhight;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۨۦۥ, reason: not valid java name and contains not printable characters */
    public static int m7624(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۤۨۨ۠, reason: not valid java name and contains not printable characters */
    public static void m7625(Object obj) {
        if (C0249.m10052() <= 0) {
            jd.l((String) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static String m7626(Object obj) {
        if (C0201.m8184() <= 0) {
            return ((ActivityInfo) obj).permission;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static Shader.TileMode m7627(int i) {
        if (C0191.m7812() > 0) {
            return gb.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۥ۟, reason: not valid java name and contains not printable characters */
    public static String m7628(Object obj) {
        if (C0053.m1959() >= 0) {
            return ((j9) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۢۦ, reason: not valid java name and contains not printable characters */
    public static Cursor m7629(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (C0233.m9365() < 0) {
            return ((ContentResolver) obj).query((Uri) obj2, (String[]) obj3, (String) obj4, (String[]) obj5, (String) obj6);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m7630(Object obj) {
        if (C0079.m3072() < 0) {
            return ((em) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static Drawable m7631(Object obj) {
        if (C0194.m7889() > 0) {
            return ((ActionBarContainer) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۡ۠, reason: not valid java name and contains not printable characters */
    public static boolean m7632(Object obj) {
        if (C0239.m9805() <= 0) {
            return ((PowerManager) obj).isPowerSaveMode();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static ClipData m7633(Object obj) {
        if (C0240.m9826() >= 0) {
            return ((o5.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۤ۠, reason: not valid java name and contains not printable characters */
    public static FileOutputStream m7634(Object obj, Object obj2, int i) {
        if (C0243.m9964() > 0) {
            return ((Context) obj).openFileOutput((String) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۤ, reason: not valid java name and contains not printable characters */
    public static yf m7635() {
        if (C0191.m7812() >= 0) {
            return tq.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m7636(Object obj, float f, float f2, float f3) {
        if (C0118.m4454() >= 0) {
            return o9.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj, f, f2, f3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۥۦۡ, reason: not valid java name and contains not printable characters */
    public static void m7637(Object obj, Object obj2, int i, int i2) {
        if (C0039.m1515() < 0) {
            b3.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((a3) obj, (s2) obj2, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static long m7638(Object obj, long j, long j2, long j3, int i) {
        if (C0083.m3188() <= 0) {
            return C0009.m312((String) obj, j, (i & 4) != 0 ? 1L : j2, (i & 8) != 0 ? Long.MAX_VALUE : j3);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠ۨۤۤ, reason: not valid java name and contains not printable characters */
    public static void m7639(Object obj) {
        if (C0129.m5108() >= 0) {
            ((u7) obj).e();
        }
    }

    /* JADX INFO: renamed from: ۡ۟۟, reason: not valid java name and contains not printable characters */
    public static void m7640(Object obj, boolean z) {
        if (C0052.m1890() >= 0) {
            ((HttpURLConnection) obj).setDoInput(z);
        }
    }

    /* JADX INFO: renamed from: ۡۡۨۥ, reason: not valid java name and contains not printable characters */
    public static Drawable m7641(Object obj, int i, int i2, Object obj2) {
        if (C0199.m7998() < 0) {
            return ((Resources) obj).getDrawableForDensity(i, i2, (Resources.Theme) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۨۥ, reason: not valid java name and contains not printable characters */
    public static int m7642(Object obj) {
        if (C0162.m6837() < 0) {
            return ((pr) obj).getOpacity();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۤ۟۟, reason: not valid java name and contains not printable characters */
    public static int m7643(Object obj) {
        if (C0116.m4340() > 0) {
            return ((pr) obj).getChangingConfigurations();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۨۤۥ, reason: not valid java name and contains not printable characters */
    public static void m7644(Object obj) {
        if (C0084.m3253() < 0) {
            ar.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Closeable) obj);
        }
    }

    /* JADX INFO: renamed from: ۢ۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static hn m7645(Object obj, Object obj2, int i, boolean z, int i2, int i3) {
        if (C0129.m5108() > 0) {
            return mo.S((CharSequence) obj, (String[]) obj2, i, z, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۢۥ, reason: not valid java name and contains not printable characters */
    public static s2 m7646(Object obj, Object obj2, int i, int i2) {
        if (C0053.m1959() > 0) {
            return ((s2) obj).i0((byte[]) obj2, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۢۤ, reason: not valid java name and contains not printable characters */
    public static void m7647(Object obj) {
        if (C0009.m276() <= 0) {
            ((a) obj).m();
        }
    }

    /* JADX INFO: renamed from: ۢۥۥ۠, reason: not valid java name and contains not printable characters */
    public static int m7648(Object obj) {
        if (C0002.m72() >= 0) {
            return ((l1) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۦ۠ۦ, reason: not valid java name and contains not printable characters */
    public static ArrayList m7649(Object obj) {
        if (C0096.m3601() < 0) {
            return ((ws) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۣۧ, reason: not valid java name and contains not printable characters */
    public static String m7650(Object obj, Object obj2) {
        if (C0176.m7290() > 0) {
            return ((eo.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۤ۟, reason: not valid java name and contains not printable characters */
    public static int m7651(Object obj, Object obj2) {
        if (C0172.m7180() > 0) {
            return ((a3) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((a3) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧۨۥ, reason: not valid java name and contains not printable characters */
    public static void m7652(Object obj, int i, Object obj2, int i2, int i3) {
        if (C0162.m6837() < 0) {
            System.arraycopy(obj, i, obj2, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ۤۡۧۦ, reason: not valid java name and contains not printable characters */
    public static be m7653(Object obj) {
        if (C0078.m3044() <= 0) {
            return ((il) obj).compute();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۦۨ, reason: not valid java name and contains not printable characters */
    public static void m7654(Object obj, int i, int i2) {
        if (C0127.m4950() > 0) {
            ((rp) obj).e(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۤۢۧۢ, reason: not valid java name and contains not printable characters */
    public static long m7655(Object obj) {
        if (C0036.m1332() <= 0) {
            return ((s2) obj).v();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۤۤۡ, reason: not valid java name and contains not printable characters */
    public static m2 m7656(Object obj, float f, float f2) {
        if (C0036.m1332() <= 0) {
            return ((m2) obj).f(f, f2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۨۡ, reason: not valid java name and contains not printable characters */
    public static LocaleList m7657(Object obj) {
        if (m7613() > 0) {
            return u0.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۦۨ, reason: not valid java name and contains not printable characters */
    public static boolean m7658(Object obj, int i) {
        if (C0026.m1047() >= 0) {
            return ((zr) obj).u(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤۨۤ, reason: not valid java name and contains not printable characters */
    public static View m7659(Object obj, int i) {
        if (C0040.m1622() <= 0) {
            return ((ListView) obj).getChildAt(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۧ, reason: not valid java name and contains not printable characters */
    public static float m7660(Object obj, float f, float f2) {
        if (C0195.m7914() > 0) {
            return ((EdgeEffect) obj).onPullDistance(f, f2);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۥ۠ۤ۠, reason: contains not printable characters */
    public static xo m7661() {
        if (C0037.m1437() <= 0) {
            return C0116.m4301();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۦۤ, reason: contains not printable characters */
    public static void m7662(Object obj, boolean z) {
        if (C0188.m7736() <= 0) {
            ((ws) obj).z(z);
        }
    }

    /* JADX INFO: renamed from: ۥۤۧ۠, reason: contains not printable characters */
    public static String m7663(Object obj) {
        if (m7613() > 0) {
            return ((i) obj).l();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟۠۠, reason: contains not printable characters */
    public static BitSet m7664(Object obj) {
        if (C0058.m2184() >= 0) {
            return BitSet.valueOf((byte[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۡۨ, reason: contains not printable characters */
    public static int[] m7666() {
        if (C0117.m4419() <= 0) {
            return mp.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m7667(Object obj, int i) {
        if (C0119.m4573() >= 0) {
            ((f6.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).g(i);
        }
    }

    /* JADX INFO: renamed from: ۧۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m7668(Object obj, Object obj2, int i) {
        if (C0133.m5208() < 0) {
            ((u7) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۣۧۧۧ, reason: not valid java name and contains not printable characters */
    public static Iterator m7669() {
        if (C0164.m6900() < 0) {
            return ig.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧ۠, reason: not valid java name and contains not printable characters */
    public static void m7670(Object obj, Object obj2) {
        if (C0024.m896() >= 0) {
            ((p0) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ColorStateList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨ۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static int m7671(Object obj, Object obj2, int i, int i2, int i3) {
        if (C0141.m5769() > 0) {
            return ((Deflater) obj).deflate((byte[]) obj2, i, i2, i3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m7672(Object obj) {
        if (C0079.m3072() <= 0) {
            return ((View) obj).getLayoutDirection();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m7673(Object obj) {
        if (C0164.m6900() < 0) {
            return ((l3) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۧۨ۟, reason: contains not printable characters */
    public static String m7665(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
