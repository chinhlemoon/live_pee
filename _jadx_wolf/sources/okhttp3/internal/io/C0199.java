package okhttp3.internal.io;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.LocaleList;
import android.support.v4.app.C0004;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0009;
import android.text.InputFilter;
import android.transition.Transition;
import android.view.ContentInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.TextView;
import androidx.activity.C0014;
import androidx.activity.C0017;
import androidx.activity.C0021;
import androidx.annotation.C0025;
import androidx.appcompat.app.C0034;
import androidx.appcompat.app.C0035;
import androidx.appcompat.app.C0036;
import androidx.appcompat.app.C0037;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0052;
import androidx.core.app.C0053;
import androidx.core.app.C0055;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0065;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0079;
import androidx.emoji2.text.C0083;
import androidx.emoji2.text.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0096;
import androidx.fragment.app.C0097;
import androidx.lifecycle.C0107;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0118;
import androidx.profileinstaller.C0119;
import androidx.savedstate.C0123;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0129;
import androidx.versionedparcelable.C0133;
import androidx.versionedparcelable.C0135;
import com.example.vcam.HookMain;
import com.example.vcam.MainActivity;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.aa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.id;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ki;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.oc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import okhttp3.C0238;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.ws.C0224;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0231;
import okhttp3.logging.C0233;
import okhttp3.logging.C0235;
import org.xmlpull.v1.XmlPullParser;
import retrofit2.converter.scalars.C0243;

/* JADX INFO: renamed from: okhttp3.internal.io.ۧۨۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0199 {

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int f649 = 689;

    /* JADX INFO: renamed from: ۟۟۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m7987(Object obj, Object obj2) {
        if (C0171.m7136() < 0) {
            ((m) obj).f((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۨۧۨ, reason: not valid java name and contains not printable characters */
    public static String m7988(Object obj) {
        if (C0074.m2951() < 0) {
            return ((Uri) obj).getScheme();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m7989(Object obj) {
        if (C0217.m8693() < 0) {
            ((ObjectAnimator) obj).start();
        }
    }

    /* JADX INFO: renamed from: ۟۠ۡۡۦ, reason: not valid java name and contains not printable characters */
    public static k0.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m7990(Object obj) {
        if (C0036.m1332() <= 0) {
            return ((k0) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static TimeUnit m7991() {
        if (C0117.m4419() < 0) {
            return TimeUnit.NANOSECONDS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static void m7992(Object obj, int i) {
        if (C0238.m9653() >= 0) {
            super/*android.view.ViewGroup*/.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static Field m7993() {
        if (C0176.m7290() > 0) {
            return x.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥۧ, reason: not valid java name and contains not printable characters */
    public static View m7994(Object obj, int i) {
        if (C0004.m139() <= 0) {
            return ((ViewGroup) obj).getChildAt(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۧۤ, reason: not valid java name and contains not printable characters */
    public static int m7995(Object obj) {
        if (C0133.m5208() <= 0) {
            return ((Insets) obj).bottom;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤ۟, reason: not valid java name and contains not printable characters */
    public static int m7996(Object obj, int i, int i2) {
        if (C0164.m6900() < 0) {
            return ((String) obj).indexOf(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static void m7997(Object obj, Object obj2) {
        if (C0009.m276() < 0) {
            ((xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).k((xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠۠, reason: not valid java name and contains not printable characters */
    public static int m7998() {
        return 997 ^ C0195.f645;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static String m7999(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static float m8000(Object obj, float f) {
        if (C0119.m4573() >= 0) {
            return ((zr) obj).i(f);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۦ۠, reason: not valid java name and contains not printable characters */
    public static boolean m8001(Object obj, int i, Object obj2) {
        if (C0129.m5108() > 0) {
            return ((Window.Callback) obj).onMenuOpened(i, (Menu) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m8002(Object obj) {
        if (C0078.m3044() <= 0) {
            return ((EditText) obj).isInEditMode();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۧۡۧ, reason: not valid java name and contains not printable characters */
    public static String m8003() {
        if (C0118.m4454() > 0) {
            return oc.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static int m8004(Object obj) {
        if (C0055.m2054() > 0) {
            return ((View) obj).getRight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥ۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m8005(Object obj, Object obj2) {
        if (C0035.m1268() < 0) {
            ((f6) obj).M((dp) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۤۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m8006(Object obj, int i, boolean z) {
        if (C0211.m8341() > 0) {
            return ((zp) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m8007(Object obj) {
        if (C0037.m1437() < 0) {
            return ((m9.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۢۧۨ, reason: not valid java name and contains not printable characters */
    public static List m8008(Object obj) {
        if (C0006.m169() < 0) {
            return ((Transition) obj).getTargets();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۤۡ, reason: not valid java name and contains not printable characters */
    public static boolean m8009(Object obj, Object obj2) {
        if (C0217.m8693() <= 0) {
            return ((Field) obj).getBoolean(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۤۤۥ, reason: not valid java name and contains not printable characters */
    public static ArrayList m8010(Object obj) {
        if (C0128.m5064() < 0) {
            return ((aa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۣۨ, reason: not valid java name and contains not printable characters */
    public static HookMain m8011(Object obj) {
        if (C0176.m7290() > 0) {
            return ((MainActivity) obj).u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static Class m8012(Object obj, Object obj2) {
        if (C0065.m2448() > 0) {
            return ((ClassLoader) obj).loadClass((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۤ, reason: not valid java name and contains not printable characters */
    public static un m8013(Object obj) {
        if (C0096.m3601() <= 0) {
            return rj.c((InputStream) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static Intent m8014(Object obj) {
        if (C0135.m5274() < 0) {
            return ((id) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۥۡ, reason: not valid java name and contains not printable characters */
    public static HookMain.u m8015(Object obj) {
        if (C0115.m4218() < 0) {
            return ((HookMain.u.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static void m8016(Object obj, Object obj2) {
        if (C0053.m1959() >= 0) {
            ((n1) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Bundle) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡۢۥۨ, reason: not valid java name and contains not printable characters */
    public static void m8017(Object obj, Object obj2) {
        if (C0123.m4841() <= 0) {
            q7.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Drawable) obj, (Resources.Theme) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡۥۡۢ, reason: not valid java name and contains not printable characters */
    public static Executor m8018(Object obj) {
        if (C0049.m1767() < 0) {
            return ((e.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۦۨ, reason: not valid java name and contains not printable characters */
    public static boolean m8019(Object obj) {
        if (C0079.m3072() <= 0) {
            return ((fd) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۥۦۢ, reason: not valid java name and contains not printable characters */
    public static ContentInfo m8020(Object obj) {
        if (C0096.m3601() < 0) {
            return ((o5) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m8021(Object obj, Object obj2) {
        if (C0213.m8458() > 0) {
            ((xd) obj).N((lk) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۡۡۤ, reason: not valid java name and contains not printable characters */
    public static void m8022(Object obj, Object obj2) {
        if (C0083.m3188() < 0) {
            ((i) obj).a((Rect) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۡۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m8023(Object obj, Object obj2, Object obj3) {
        if (C0235.m9535() < 0) {
            return ((d8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TextView) obj2, (InputFilter) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m8024(Object obj, Object obj2) {
        if (C0204.m8270() <= 0) {
            ((CheckedTextView) obj).setCheckMarkDrawable((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣۦ۠, reason: not valid java name and contains not printable characters */
    public static int m8025(Object obj) {
        if (C0107.m3883() > 0) {
            return ((TextView) obj).getMeasuredWidth();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨۧ, reason: not valid java name and contains not printable characters */
    public static long m8026(Object obj, Object obj2, long j) {
        if (C0231.m9265() > 0) {
            return ((un) obj).read((s2) obj2, j);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۤ۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m8027(Object obj) {
        if (C0097.m3659() > 0) {
            return ((bf) obj).T();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۤۨ, reason: not valid java name and contains not printable characters */
    public static void m8028(Object obj, Object obj2) {
        if (C0171.m7136() <= 0) {
            wr.S((View) obj, (PorterDuff.Mode) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۤۤ, reason: not valid java name and contains not printable characters */
    public static void m8029(Object obj, Object obj2, int i, float f, Object obj3) {
        if (C0224.m8861() < 0) {
            m0.j((ValueAnimator) obj, (TypedArray) obj2, i, f, (XmlPullParser) obj3);
        }
    }

    /* JADX INFO: renamed from: ۤۤۥۦ, reason: not valid java name and contains not printable characters */
    public static int m8030(Object obj) {
        if (m7998() < 0) {
            return ((View) obj).getImportantForAccessibility();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۤۦۧ, reason: not valid java name and contains not printable characters */
    public static void m8031(Object obj, int i, int i2) {
        if (C0243.m9964() >= 0) {
            ((zr.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۣۤۨۦ, reason: not valid java name and contains not printable characters */
    public static ki m8032(Object obj) {
        if (C0233.m9365() <= 0) {
            return ki.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۥۥ, reason: not valid java name and contains not printable characters */
    public static int[] m8033(Object obj) {
        if (C0240.m9826() > 0) {
            return ((z0.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۢۢ, reason: contains not printable characters */
    public static LocaleList m8034(Object obj) {
        if (C0052.m1890() > 0) {
            return k1.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۠ۤ, reason: contains not printable characters */
    public static Object m8035(Object obj) {
        if (C0200.m8104() < 0) {
            return ((z9.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۢۦ, reason: contains not printable characters */
    public static ArrayList m8036(Object obj) {
        if (C0062.m2326() >= 0) {
            return ((z9.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۨۥ, reason: contains not printable characters */
    public static int m8037(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥۧۨۨ, reason: contains not printable characters */
    public static Proxy.Type m8038() {
        if (C0231.m9265() >= 0) {
            return Proxy.Type.SOCKS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡ۠ۨ, reason: contains not printable characters */
    public static int m8039(Object obj) {
        if (C0202.m8245() >= 0) {
            return C0094.m3377((v7) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۤۡۧ, reason: contains not printable characters */
    public static boolean m8040(Object obj) {
        if (C0217.m8693() <= 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۣۤۤ, reason: contains not printable characters */
    public static void m8041(Object obj, Object obj2) {
        if (C0004.m139() < 0) {
            ((Configuration) obj).setTo((Configuration) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۥ۟ۥ, reason: contains not printable characters */
    public static tm.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m8042(Object obj) {
        if (C0014.m545() > 0) {
            return ((tm) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۣۢ, reason: contains not printable characters */
    public static View m8043(Object obj, int i, Object obj2) {
        if (C0034.m1206() < 0) {
            return ((LayoutInflater) obj).inflate(i, (ViewGroup) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static String m8044() {
        if (C0017.m627() >= 0) {
            return "ۥۦۣ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static y5.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m8045(Object obj) {
        if (C0035.m1268() < 0) {
            return ((a) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۨۤ, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m8046(Object obj) {
        if (C0021.m740() <= 0) {
            return ((i1) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۤۤ, reason: not valid java name and contains not printable characters */
    public static String m8047(Object obj) {
        if (C0225.m9001() >= 0) {
            return ((a9.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۢ۟, reason: not valid java name and contains not printable characters */
    public static int m8048(Object obj) {
        if (C0225.m9001() >= 0) {
            return ((uo.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).o;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۤۡۤ, reason: not valid java name and contains not printable characters */
    public static int m8049(Object obj) {
        if (C0096.m3601() < 0) {
            return ((dd) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۥۢ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m8050(Object obj) {
        if (C0214.m8575() <= 0) {
            return ((s0) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۥۨ, reason: not valid java name and contains not printable characters */
    public static void m8051(Object obj, Object obj2) {
        if (C0025.m934() >= 0) {
            t3.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((CheckedTextView) obj, (ColorStateList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static String m7986(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
