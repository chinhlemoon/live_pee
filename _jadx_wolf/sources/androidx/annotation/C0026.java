package androidx.annotation;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.FontFamily;
import android.hardware.camera2.params.SessionConfiguration;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcelable;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0010;
import android.support.v4.graphics.drawable.C0011;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ListView;
import android.widget.TextView;
import androidx.activity.C0014;
import androidx.activity.C0017;
import androidx.activity.C0020;
import androidx.activity.C0021;
import androidx.appcompat.app.C0036;
import androidx.appcompat.app.C0037;
import androidx.appcompat.widget.C0047;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0051;
import androidx.core.app.C0052;
import androidx.core.app.C0053;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0065;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0070;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0079;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0096;
import androidx.fragment.app.C0097;
import androidx.fragment.app.C0099;
import androidx.lifecycle.C0107;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0119;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0126;
import androidx.savedstate.C0127;
import androidx.versionedparcelable.C0133;
import androidx.versionedparcelable.C0135;
import com.example.vcam.C0141;
import com.example.vcam.HookMain;
import com.example.vcam.Menu;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ej;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.g2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.id;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jb;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ki;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.nq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ql;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ti;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.us;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.w3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y5;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.zip.CRC32;
import okhttp3.Authenticator;
import okhttp3.C0238;
import okhttp3.C0239;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.logging.C0231;
import okhttp3.logging.C0232;
import okhttp3.logging.C0233;
import okhttp3.logging.C0234;
import okhttp3.logging.C0236;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import retrofit2.C0259;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.C0243;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: androidx.annotation.۟ۤ۟ۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0026 {

    /* JADX INFO: renamed from: ۣۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int f25 = 531;

    /* JADX INFO: renamed from: ۟۟۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m987() {
        if (C0234.m9461() <= 0) {
            return HookMain.data_buffer;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧۥ, reason: not valid java name and contains not printable characters */
    public static Shader m988(Object obj, Object obj2) {
        if (m1047() > 0) {
            return ((Paint) obj).setShader((Shader) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static boolean m989(Object obj, Object obj2, Object obj3) {
        if (C0097.m3659() > 0) {
            return ((i.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj2, (Bundle) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۢۧۧ, reason: not valid java name and contains not printable characters */
    public static short m990(Object obj) {
        if (C0234.m9461() < 0) {
            return ((Number) obj).shortValue();
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static Object m991(Object obj) {
        if (C0107.m3883() > 0) {
            return ((tm.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۦ۠, reason: not valid java name and contains not printable characters */
    public static int m992(int i, int i2, int i3, Object obj) {
        if (C0069.m2756() <= 0) {
            return vk.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, i2, i3, (String) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m993(Object obj) {
        if (C0211.m8341() > 0) {
            return ((s2) obj).r();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m994(Object obj, Object obj2, int i) {
        if (C0014.m545() > 0) {
            ((MediaFormat) obj).setInteger((String) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۟ۢ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m996(Object obj, Object obj2) {
        if (C0135.m5274() < 0) {
            ((l2) obj).n((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۡۧۧ, reason: not valid java name and contains not printable characters */
    public static void m997(Object obj, Object obj2) {
        if (C0169.m7034() < 0) {
            kq.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj, (Exception) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۢۧۦ, reason: not valid java name and contains not printable characters */
    public static String m998(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۢۥۧ, reason: not valid java name and contains not printable characters */
    public static int m999(Object obj) {
        if (C0119.m4573() >= 0) {
            return ((mk.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۧۥ, reason: not valid java name and contains not printable characters */
    public static Object m1000() {
        if (C0202.m8245() > 0) {
            return g2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۦ۠, reason: not valid java name and contains not printable characters */
    public static ti.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m1001() {
        if (C0052.m1890() >= 0) {
            return ti.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥ۠ۦ, reason: not valid java name and contains not printable characters */
    public static hn m1002(Object obj) {
        if (C0239.m9805() < 0) {
            return C0176.m7306((nq) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤۡ, reason: not valid java name and contains not printable characters */
    public static boolean m1003(Object obj) {
        if (C0047.m1663() <= 0) {
            return ((View) obj).isLayoutDirectionResolved();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static Map.Entry m1004(Object obj) {
        if (C0052.m1890() >= 0) {
            return ((tm.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static o8 m1005() {
        if (C0259.m10136() > 0) {
            return o8.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢ۠۟, reason: not valid java name and contains not printable characters */
    public static void m1006(int i, int i2) {
        if (C0010.m354() <= 0) {
            a2.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۢۨۤ, reason: not valid java name and contains not printable characters */
    public static String m1007() {
        if (C0171.m7136() < 0) {
            return "ۨۥ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨ۠۟, reason: not valid java name and contains not printable characters */
    public static double m1008(double d) {
        if (C0249.m10052() <= 0) {
            return Math.cbrt(d);
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static vo m1009(Object obj, Object obj2) {
        if (C0096.m3601() < 0) {
            return ((p) obj).setContentDescription((CharSequence) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۢۦ, reason: not valid java name and contains not printable characters */
    public static String m1010(Object obj) {
        if (C0070.m2829() < 0) {
            return ((String) obj).toUpperCase();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۡۨ, reason: not valid java name and contains not printable characters */
    public static w3 m1011(Object obj, Object obj2) {
        if (C0238.m9653() > 0) {
            return ((xd) obj).H((tf) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۦۡ, reason: not valid java name and contains not printable characters */
    public static String m1012(Object obj, Object obj2, Object obj3, Object obj4, int i, Object obj5, Object obj6, int i2) {
        if (C0202.m8245() >= 0) {
            return l4.s((Iterable) obj, (CharSequence) obj2, (CharSequence) obj3, (CharSequence) obj4, i, (CharSequence) obj5, (qa) obj6, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static void m1013(Object obj, Object obj2, Object obj3) {
        if (C0096.m3601() <= 0) {
            ((ViewGroup) obj).addView((View) obj2, (ViewGroup.LayoutParams) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۦۥ, reason: not valid java name and contains not printable characters */
    public static int m1014() {
        if (C0233.m9365() < 0) {
            return jp.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۧۥۥ, reason: not valid java name and contains not printable characters */
    public static void m1015(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws XmlPullParserException, IOException {
        if (C0219.m8794() > 0) {
            q4.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Drawable) obj, (Resources) obj2, (XmlPullParser) obj3, (AttributeSet) obj4, (Resources.Theme) obj5);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۤ, reason: not valid java name and contains not printable characters */
    public static IntentSender m1016(Object obj) {
        if (C0191.m7812() > 0) {
            return ((id.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦ۠۠, reason: not valid java name and contains not printable characters */
    public static short m1017(short s) {
        if (C0065.m2448() > 0) {
            return xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(s);
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: ۠۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static xs m1018(Object obj) {
        if (C0011.m458() > 0) {
            return ((xs.d) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static int m1019(Object obj) {
        if (C0141.m5769() > 0) {
            return ((List) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m1020(Object obj, Object obj2) {
        if (C0099.m3752() < 0) {
            return ((OkHttpClient.Builder) obj).proxyAuthenticator((Authenticator) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m1021(Object obj) {
        if (C0074.m2951() <= 0) {
            Locale.setDefault((Locale) obj);
        }
    }

    /* JADX INFO: renamed from: ۠ۦ۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m1022(Object obj, Object obj2) {
        if (C0199.m7998() < 0) {
            return ((Window) obj).superDispatchKeyEvent((KeyEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m1023(Object obj) {
        if (C0133.m5208() < 0) {
            return ((FontFamily) obj).getSize();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static int m1024(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡ۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static a3 m1025(Object obj, long j) {
        if (C0211.m8341() > 0) {
            return ((s2) obj).f(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۢۨ, reason: not valid java name and contains not printable characters */
    public static y5 m1026(Object obj) {
        if (C0187.m7613() > 0) {
            return ((k3) obj).getContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥ۟, reason: not valid java name and contains not printable characters */
    public static ColorFilter m1027(Object obj) {
        if (C0116.m4340() > 0) {
            return ((pr) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۢۨ, reason: not valid java name and contains not printable characters */
    public static void m1028(Object obj, Object obj2) {
        if (C0020.m701() > 0) {
            ((a9) obj).m((ClassLoader) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۡۧ۟, reason: not valid java name and contains not printable characters */
    public static int m1029(Object obj) {
        if (C0037.m1437() < 0) {
            return ((j0.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۨۧ۟, reason: not valid java name and contains not printable characters */
    public static void m1030(Object obj, int i, int i2, int i3, int i4) {
        if (C0161.m6744() > 0) {
            ((l1) obj).h(i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: ۢ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static int[] m1031() {
        if (C0078.m3044() <= 0) {
            return ql.i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۤۥ, reason: not valid java name and contains not printable characters */
    public static Editable m1032(Object obj, int i, int i2, Object obj2) {
        if (C0243.m9964() >= 0) {
            return ((Editable) obj).replace(i, i2, (CharSequence) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۢ۟, reason: not valid java name and contains not printable characters */
    public static Parcelable.Creator m1033() {
        if (C0062.m2326() > 0) {
            return TextUtils.CHAR_SEQUENCE_CREATOR;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۦۡ, reason: not valid java name and contains not printable characters */
    public static SessionConfiguration m1034() {
        if (C0006.m169() < 0) {
            return HookMain.sessionConfiguration;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۦۥ, reason: not valid java name and contains not printable characters */
    public static uk.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m1035(Object obj) {
        if (C0049.m1767() <= 0) {
            return kp.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TextView) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۡۢ, reason: not valid java name and contains not printable characters */
    public static void m1036(Object obj, Object obj2) {
        if (C0036.m1332() <= 0) {
            ((ObjectOutputStream) obj).writeObject(obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static void m1037(Object obj) {
        if (C0025.m934() >= 0) {
            s7.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Drawable) obj);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static u1.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m1038() {
        if (C0149.m6476() <= 0) {
            return u1.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static float[] m1039(Object obj) {
        if (C0211.m8341() >= 0) {
            return ((us) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static Object m1040(Object obj, Object obj2) {
        if (C0049.m1767() < 0) {
            return ((Retrofit) obj).create((Class) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m1041(int i, int i2) {
        if (C0188.m7736() < 0) {
            return fl.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢۢۢ, reason: not valid java name and contains not printable characters */
    public static Drawable m1042(Object obj) {
        if (C0017.m627() > 0) {
            return ((r7) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۣۡ, reason: not valid java name and contains not printable characters */
    public static CRC32 m1043(Object obj) {
        if (C0243.m9964() >= 0) {
            return ((jb) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۡۤ, reason: not valid java name and contains not printable characters */
    public static Object m1044(Object obj) {
        if (C0231.m9265() > 0) {
            return ((ArrayDeque) obj).pop();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۡ۟, reason: not valid java name and contains not printable characters */
    public static XC_LoadPackage.LoadPackageParam m1045(Object obj) {
        if (C0021.m740() <= 0) {
            return ((HookMain.d) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۡۦ, reason: not valid java name and contains not printable characters */
    public static View m1046(Object obj, int i, Object obj2, boolean z) {
        if (C0232.m9299() > 0) {
            return ((LayoutInflater) obj).inflate(i, (ViewGroup) obj2, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۨۥ, reason: not valid java name and contains not printable characters */
    public static int m1047() {
        return (-321) ^ C0070.f64;
    }

    /* JADX INFO: renamed from: ۣۤۤۨ, reason: not valid java name and contains not printable characters */
    public static Intent m1048(Object obj) {
        if (C0236.m9615() > 0) {
            return ej.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Activity) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۤۨ, reason: contains not printable characters */
    public static boolean m1049(Object obj, Object obj2, Object obj3) {
        if (C0176.m7290() > 0) {
            return ((v0.e) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Window.Callback) obj2, (KeyEvent) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۡۧ۟, reason: contains not printable characters */
    public static boolean m1050(Object obj) {
        if (C0094.m3450() >= 0) {
            return ((y4) obj).a();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۡۧۥ, reason: contains not printable characters */
    public static String[] m1051(Object obj) {
        if (C0120.m4608() > 0) {
            return ((View) obj).getReceiveContentMimeTypes();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۢۥ, reason: contains not printable characters */
    public static boolean m1052(Object obj, Object obj2) {
        if (C0201.m8184() <= 0) {
            return ((wr.l) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((KeyEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۧۢ, reason: contains not printable characters */
    public static boolean m1053(Object obj) {
        if (C0094.m3450() > 0) {
            return ((rr) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣۨۨ, reason: contains not printable characters */
    public static sn m1054(Object obj) {
        if (C0202.m8245() > 0) {
            return sj.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((File) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۤۤ, reason: contains not printable characters */
    public static void m1055(Object obj, Object obj2) throws InterruptedException {
        if (C0010.m354() <= 0) {
            ((LinkedBlockingQueue) obj).put(obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۢۢۧ, reason: contains not printable characters */
    public static void m1056(Object obj) {
        if (C0079.m3072() < 0) {
            ((Menu) obj).showFloatingUI();
        }
    }

    /* JADX INFO: renamed from: ۦۣۣۨ, reason: contains not printable characters */
    public static Locale m1057(Object obj, int i) {
        if (C0078.m3044() <= 0) {
            return ((mf) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۥ۟, reason: contains not printable characters */
    public static PorterDuff.Mode m1058() {
        if (C0199.m7998() <= 0) {
            return C0148.m6419();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۦۦ, reason: contains not printable characters */
    public static vo m1059(Object obj) {
        if (C0194.m7889() >= 0) {
            return ((ki) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧ۟ۨ, reason: contains not printable characters */
    public static void m1060(Object obj, Object obj2, Object obj3) {
        if (C0053.m1959() > 0) {
            ((qk) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Throwable) obj2, (Throwable) obj3);
        }
    }

    /* JADX INFO: renamed from: ۧ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static LocaleList m1061(Object obj) {
        if (C0231.m9265() > 0) {
            return ((pf) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static int[] m1062() {
        if (C0127.m4950() >= 0) {
            return ql.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static HookMain m1063(Object obj) {
        if (C0182.m7528() <= 0) {
            return ((HookMain.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۢ۟, reason: not valid java name and contains not printable characters */
    public static void m1064(Object obj, Object obj2) {
        if (C0051.m1783() <= 0) {
            ((kp.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((android.view.Menu) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۤۦۣ, reason: not valid java name and contains not printable characters */
    public static void m1065(Object obj, int i) {
        if (C0126.m4908() <= 0) {
            ((ListView) obj).setSelection(i);
        }
    }

    /* JADX INFO: renamed from: ۨۥۧۡ, reason: not valid java name and contains not printable characters */
    public static CharSequence m1066(Object obj, Object obj2, int i, int i2) {
        if (C0215.m8604() <= 0) {
            return ((androidx.emoji2.text.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).g((CharSequence) obj2, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۢ, reason: not valid java name and contains not printable characters */
    public static String m995(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
