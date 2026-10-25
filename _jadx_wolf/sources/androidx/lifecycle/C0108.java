package androidx.lifecycle;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.DataSetObservable;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.LocaleList;
import android.support.v4.app.C0004;
import android.support.v4.graphics.drawable.C0009;
import android.support.v4.graphics.drawable.C0011;
import android.text.Layout;
import android.text.StaticLayout;
import android.view.KeyEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.activity.C0014;
import androidx.annotation.C0023;
import androidx.annotation.C0031;
import androidx.appcompat.view.menu.C0039;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.widget.C0047;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0052;
import androidx.core.app.C0053;
import androidx.core.app.C0055;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0066;
import androidx.core.widget.C0068;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0072;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0079;
import androidx.emoji2.text.C0084;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0096;
import androidx.fragment.app.Fragment;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0119;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0126;
import androidx.savedstate.C0127;
import androidx.versionedparcelable.C0129;
import androidx.versionedparcelable.C0135;
import com.example.vcam.HookMain;
import com.example.vcam.Menu;
import com.example.vcam.VideoToFrames;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.c3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.er;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.g3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.g5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ie;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jb;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.js;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kb;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kh;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pi;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ts;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yi;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.Timer;
import java.util.WeakHashMap;
import okhttp3.C0238;
import okhttp3.C0239;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.internal.C0227;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.logging.C0232;
import okhttp3.logging.C0234;
import okhttp3.logging.C0235;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.C0243;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: androidx.lifecycle.ۤ۟ۤۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0108 {

    /* JADX INFO: renamed from: ۟ۢ۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static int f90 = 755;

    /* JADX INFO: renamed from: ۟۟۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static js m3968(Object obj) {
        if (C0106.m3835() >= 0) {
            return ((u7) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static boolean m3969(Object obj) {
        if (C0072.m2856() < 0) {
            return ((l1) obj).o();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static StaticLayout m3970(Object obj, Object obj2, Object obj3, int i, int i2) {
        if (C0039.m1515() < 0) {
            return ((l1) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((CharSequence) obj2, (Layout.Alignment) obj3, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦ۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3971() {
        if (C0227.m9046() >= 0) {
            return ts.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۦۤۥ, reason: not valid java name and contains not printable characters */
    public static void m3972(Object obj, Object obj2, Object obj3) {
        if (C0249.m10052() <= 0) {
            ((er) obj).f0((y5) obj2, obj3);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static Timer m3973(Object obj) {
        if (C0078.m3044() <= 0) {
            return ((HookMain.u.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static StaticLayout.Builder m3974(Object obj, int i) {
        if (C0047.m1663() < 0) {
            return ((StaticLayout.Builder) obj).setHyphenationFrequency(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static a3 m3975(Object obj, Object obj2) {
        if (C0023.m843() > 0) {
            return ((a3) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۥۨ, reason: not valid java name and contains not printable characters */
    public static c3 m3976(Object obj) {
        if (C0047.m1663() < 0) {
            return ((l9.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static String m3977(String str) {
        String string = HttpUrl.FRAGMENT_ENCODE_SET;
        int i = 0;
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        while (i < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i).toString();
            i++;
            str2 = string2;
        }
        while (string.length() > 0) {
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
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static float m3978(Object obj) {
        if (C0164.m6900() < 0) {
            return ((pr.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۤ, reason: not valid java name and contains not printable characters */
    public static int m3979(Object obj) {
        if (C0182.m7528() < 0) {
            return ((View) obj).getId();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static LocaleList m3980(Object obj) {
        if (C0047.m1663() < 0) {
            return mf.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Locale[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۡ۠, reason: not valid java name and contains not printable characters */
    public static ie.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m3981(Object obj) {
        if (C0120.m4608() >= 0) {
            return ((yi) obj).mo6381getSetter();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۤۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3982(Object obj) {
        if (C0161.m6744() >= 0) {
            return ((l1) obj).m();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۦۥۥ, reason: not valid java name and contains not printable characters */
    public static xs m3983(Object obj) {
        if (C0040.m1622() <= 0) {
            return xs.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۧۨ, reason: not valid java name and contains not printable characters */
    public static int m3984(Object obj) {
        if (C0011.m458() > 0) {
            return q4.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TypedArray) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m3985(Object obj) {
        if (C0211.m8341() > 0) {
            return ((Drawable) obj).getIntrinsicHeight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۨۥۦ, reason: not valid java name and contains not printable characters */
    public static byte m3986(Object obj, long j) {
        if (C0009.m276() < 0) {
            return ((s2) obj).x(j);
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: ۟ۡۨۦ, reason: not valid java name and contains not printable characters */
    public static gg m3987() {
        if (C0176.m7290() > 0) {
            return jg.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦۨ, reason: not valid java name and contains not printable characters */
    public static VelocityTracker m3988(Object obj) {
        if (C0126.m4908() <= 0) {
            return ((zr) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۣۧ, reason: not valid java name and contains not printable characters */
    public static void m3989(Object obj, Object obj2) {
        if (C0120.m4608() >= 0) {
            ((Window.Callback) obj).onWindowAttributesChanged((WindowManager.LayoutParams) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧ۠, reason: not valid java name and contains not printable characters */
    public static void m3990(Object obj) {
        if (C0240.m9826() >= 0) {
            ((m2) obj).a();
        }
    }

    /* JADX INFO: renamed from: ۟ۤۧۦ۟, reason: not valid java name and contains not printable characters */
    public static Object m3991() {
        if (C0178.m7344() < 0) {
            return u0.d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨ۠۠, reason: not valid java name and contains not printable characters */
    public static int m3992(Object obj) {
        if (C0240.m9826() >= 0) {
            return ((d7.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3993(Object obj, int i, Object obj2) {
        if (C0004.m139() < 0) {
            return ((v0) obj).w0(i, (KeyEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۣۡ۠, reason: not valid java name and contains not printable characters */
    public static String m3994(Object obj) {
        if (C0079.m3072() < 0) {
            return ((FileNotFoundException) obj).getMessage();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۥۧ, reason: not valid java name and contains not printable characters */
    public static void m3995(Object obj, Object obj2) {
        if (C0243.m9964() > 0) {
            ((v9) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Fragment) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۥۢ, reason: not valid java name and contains not printable characters */
    public static g3 m3996(Object obj, Object obj2) {
        if (C0009.m276() < 0) {
            return ((k3) obj).o((qa) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦ۠۠, reason: not valid java name and contains not printable characters */
    public static int m3997(Object obj, Object obj2, int i, boolean z) {
        if (C0239.m9805() <= 0) {
            return mo.H((CharSequence) obj, (char[]) obj2, i, z);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۦۨۦ, reason: not valid java name and contains not printable characters */
    public static int m3998(Object obj) {
        if (C0052.m1890() > 0) {
            return ((o8) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۧۡۡ, reason: not valid java name and contains not printable characters */
    public static fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e.a m3999(Object obj) {
        if (C0094.m3450() > 0) {
            return ((fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e.a) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠۟, reason: not valid java name and contains not printable characters */
    public static pi m4000(Object obj) {
        if (C0234.m9461() < 0) {
            return pi.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ByteBuffer) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static View m4001(Object obj, Object obj2) {
        if (C0211.m8341() < 0) {
            return null;
        }
        return ((l2) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = (View) obj2;
    }

    /* JADX INFO: renamed from: ۟ۦۢۤ۠, reason: not valid java name and contains not printable characters */
    public static String m4002(Object obj) {
        if (C0232.m9299() >= 0) {
            return ((j9) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۤۢ, reason: not valid java name and contains not printable characters */
    public static boolean m4003(Object obj, int i) {
        if (C0176.m7290() >= 0) {
            return ((pd) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۣۣۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4004(Object obj) {
        if (C0066.m2514() >= 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۣۥۧ, reason: not valid java name and contains not printable characters */
    public static Object m4005(Object obj) {
        if (C0053.m1959() > 0) {
            return l4.m((Iterable) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۧۥ, reason: not valid java name and contains not printable characters */
    public static int m4006(Object obj) {
        if (C0162.m6837() < 0) {
            return ((Rect) obj).left;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static int m4007(Object obj) {
        if (C0084.m3253() < 0) {
            return ((MediaCodec.BufferInfo) obj).size;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۢۨ۠, reason: not valid java name and contains not printable characters */
    public static WeakHashMap m4008(Object obj) {
        if (C0164.m6900() <= 0) {
            return ((tm) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۥ, reason: not valid java name and contains not printable characters */
    public static mf m4009(Object obj, Object obj2) {
        if (C0194.m7889() > 0) {
            return qf.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((mf) obj, (mf) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۡۢ, reason: not valid java name and contains not printable characters */
    public static void m4010(Object obj, int i) {
        if (C0135.m5274() <= 0) {
            ((GradientDrawable) obj).setColor(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۥۥۢ, reason: not valid java name and contains not printable characters */
    public static String m4011(Object obj) {
        if (C0202.m8245() > 0) {
            return ((Locale) obj).getScript();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۢۤ, reason: not valid java name and contains not printable characters */
    public static float m4012(Object obj) {
        if (C0078.m3044() < 0) {
            return ((e3) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۧۦۨۦ, reason: not valid java name and contains not printable characters */
    public static Throwable m4013(Object obj) {
        if (C0235.m9535() < 0) {
            return ((xd.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠۟۠, reason: not valid java name and contains not printable characters */
    public static int m4014(Object obj, int i, int i2) {
        if (C0069.m2756() < 0) {
            return ((TypedArray) obj).getLayoutDimension(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static long m4015(Object obj, Object obj2, long j) {
        if (C0171.m7136() <= 0) {
            return ((uc) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((s2) obj2, j);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۢۢ, reason: not valid java name and contains not printable characters */
    public static void m4016(int i, int i2) {
        if (C0062.m2326() >= 0) {
            n6.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۣۡ۠ۨ, reason: not valid java name and contains not printable characters */
    public static EditText m4017(Object obj) {
        if (C0074.m2951() <= 0) {
            return ((kh) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۢۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4018(Object obj) {
        if (C0014.m545() >= 0) {
            return ((gd) obj).hasNext();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۨۢۡ, reason: not valid java name and contains not printable characters */
    public static Retrofit.Builder m4019(Object obj, Object obj2) {
        if (C0162.m6837() < 0) {
            return ((Retrofit.Builder) obj).client((OkHttpClient) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۤۢ, reason: not valid java name and contains not printable characters */
    public static Field m4020() {
        if (C0079.m3072() < 0) {
            return g5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥ۠, reason: not valid java name and contains not printable characters */
    public static void m4021(Object obj, Object obj2) {
        if (C0218.m8760() > 0) {
            ((u1) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۦۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4022(Object obj, long j) {
        if (C0096.m3601() < 0) {
            return ((t8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).a(j);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static Typeface m4023(Object obj) {
        if (C0129.m5108() > 0) {
            return ((k1) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۦۨ, reason: not valid java name and contains not printable characters */
    public static void m4024(Object obj, Object obj2, byte b) {
        if (C0047.m1663() <= 0) {
            ((Bundle) obj).putByte((String) obj2, b);
        }
    }

    /* JADX INFO: renamed from: ۣۤۡ۠, reason: not valid java name and contains not printable characters */
    public static void m4025(Object obj, int i, int i2, int i3, int i4) {
        if (C0049.m1767() < 0) {
            ((ImageButton) obj).setPadding(i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: ۤۦۤۢ, reason: not valid java name and contains not printable characters */
    public static float m4026(int i) {
        if (C0119.m4573() > 0) {
            return f3.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۤۧۤ, reason: not valid java name and contains not printable characters */
    public static void m4027(Object obj) {
        if (C0127.m4950() >= 0) {
            ((BaseAdapter) obj).notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۦۤ, reason: contains not printable characters */
    public static u2 m4028(Object obj) {
        if (C0014.m545() > 0) {
            return rj.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((sn) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢ۟۠, reason: contains not printable characters */
    public static boolean m4029(Object obj, int i, Object obj2) {
        if (C0107.m3883() > 0) {
            return ((l1) obj).p(i, (RectF) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۢۤۢ, reason: contains not printable characters */
    public static LinearLayout m4030(Object obj) {
        if (C0093.m3365() >= 0) {
            return Menu.m5659((Menu) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۣۦ, reason: contains not printable characters */
    public static float m4031(Object obj) {
        if (C0068.m2650() > 0) {
            return ((pr.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).h;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۥۦۣۥ, reason: contains not printable characters */
    public static void m4032(Object obj, Object obj2, int i, int i2) {
        if (C0238.m9653() > 0) {
            ((jb) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj2, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۦ۠ۡۦ, reason: contains not printable characters */
    public static boolean m4033(Object obj, long j, Object obj2, int i, int i2) {
        if (C0161.m6744() > 0) {
            return ((vl) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(j, (a3) obj2, i, i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦ۠ۥۣ, reason: contains not printable characters */
    public static VideoToFrames m4034() {
        if (C0031.m1148() < 0) {
            return HookMain.c2_hw_decode_obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢ۟ۨ, reason: contains not printable characters */
    public static fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m4035(Object obj, Object obj2, int i) {
        if (C0094.m3450() > 0) {
            return ((fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((js) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۢۢ, reason: contains not printable characters */
    public static CharSequence m4036(Object obj) {
        if (C0217.m8693() <= 0) {
            return wr.s((View) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۨۢ, reason: contains not printable characters */
    public static String m4037(Object obj) {
        if (C0055.m2054() > 0) {
            return ((kb) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m4038() {
        return (-556) ^ C0235.f685;
    }

    /* JADX INFO: renamed from: ۧ۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4039(Object obj, Object obj2, float f, float f2, boolean z) {
        if (C0215.m8604() <= 0) {
            return hs.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ViewParent) obj, (View) obj2, f, f2, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۢۦۡ, reason: not valid java name and contains not printable characters */
    public static void m4040(Object obj) {
        if (C0161.m6744() >= 0) {
            u0.F((Context) obj);
        }
    }

    /* JADX INFO: renamed from: ۨ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static int m4041(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۨ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static Appendable m4042(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, Object obj6, Object obj7, int i2) {
        if (C0117.m4419() < 0) {
            return l4.q((Iterable) obj, (Appendable) obj2, (CharSequence) obj3, (CharSequence) obj4, (CharSequence) obj5, i, (CharSequence) obj6, (qa) obj7, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m4044(Object obj) {
        if (C0053.m1959() > 0) {
            return qc.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ImageView) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۦ۟, reason: not valid java name and contains not printable characters */
    public static void m4045(Object obj, Object obj2) {
        if (C0191.m7812() > 0) {
            ((ImageView) obj).setTag(obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۥۦۣ, reason: not valid java name and contains not printable characters */
    public static f2 m4046(Object obj) {
        if (C0214.m8575() <= 0) {
            return f2.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۥۤ, reason: not valid java name and contains not printable characters */
    public static dn m4047(Object obj) {
        if (C0162.m6837() <= 0) {
            return ((s2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۧۥ, reason: not valid java name and contains not printable characters */
    public static void m4048(Object obj, Object obj2) {
        if (C0238.m9653() > 0) {
            ((DataSetObservable) obj).unregisterObserver(obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۧۥۦ, reason: not valid java name and contains not printable characters */
    public static Typeface m4049(Object obj) {
        if (C0115.m4218() <= 0) {
            return vq.a(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static String m4043(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
