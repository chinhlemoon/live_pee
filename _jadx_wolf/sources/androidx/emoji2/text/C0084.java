package androidx.emoji2.text;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.os.Bundle;
import android.support.v4.app.C0002;
import android.support.v4.app.C0004;
import android.support.v4.app.C0006;
import android.system.Os;
import android.system.StructStat;
import android.text.SpannableStringBuilder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.activity.C0014;
import androidx.activity.C0020;
import androidx.activity.C0021;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.C0023;
import androidx.annotation.C0024;
import androidx.annotation.C0026;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0035;
import androidx.appcompat.app.C0036;
import androidx.appcompat.view.menu.C0039;
import androidx.appcompat.view.menu.C0040;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0064;
import androidx.core.graphics.drawable.C0065;
import androidx.core.widget.C0069;
import androidx.fragment.app.C0097;
import androidx.lifecycle.C0107;
import androidx.lifecycle.C0108;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0119;
import androidx.savedstate.C0122;
import androidx.savedstate.C0123;
import androidx.savedstate.C0126;
import androidx.versionedparcelable.C0129;
import androidx.versionedparcelable.C0133;
import androidx.versionedparcelable.C0135;
import com.example.vcam.C0141;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.HookMain;
import com.example.vcam.LicenseManager;
import com.example.vcam.Menu;
import com.example.vcam.VideoToFrames;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ac;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.an;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ik;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qh;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.us;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.w3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ws;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ym;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.net.SocketTimeoutException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import okhttp3.C0238;
import okhttp3.HttpUrl;
import okhttp3.internal.C0227;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.internal.ws.C0224;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0232;
import okhttp3.logging.C0235;
import retrofit2.C0259;
import retrofit2.Response;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: androidx.emoji2.text.ۣ۠۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0084 {

    /* JADX INFO: renamed from: ۤۥۡۡ, reason: not valid java name and contains not printable characters */
    public static int f75 = 747;

    /* JADX INFO: renamed from: ۟۟۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static String m3213(Object obj) {
        if (C0002.m72() >= 0) {
            return ((x9) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static void m3214(Object obj) {
        if (C0259.m10136() > 0) {
            ((FrameLayout) obj).requestLayout();
        }
    }

    /* JADX INFO: renamed from: ۟۟ۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static Thread m3215(Object obj) {
        if (C0035.m1268() <= 0) {
            return ((VideoToFrames) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static Menu m3216(Object obj) {
        if (C0238.m9653() >= 0) {
            return ((qh) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨۤ۟, reason: not valid java name and contains not printable characters */
    public static String m3217(String str) {
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

    /* JADX INFO: renamed from: ۟۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static u6 m3218() {
        if (C0123.m4841() <= 0) {
            return u6.c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static void m3219(Object obj) {
        if (C0133.m5208() <= 0) {
            q7.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Drawable) obj);
        }
    }

    /* JADX INFO: renamed from: ۟۠۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static void m3220(Object obj) {
        if (C0004.m139() <= 0) {
            ((ConnectionBlocker) obj).f();
        }
    }

    /* JADX INFO: renamed from: ۟۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static void m3221(Object obj, long j, Object obj2, int i, Object obj3, int i2, int i3, Object obj4) {
        if (C0097.m3659() > 0) {
            ((dk.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(j, (s2) obj2, i, (List) obj3, i2, i3, (List) obj4);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۡۥۢ, reason: not valid java name and contains not printable characters */
    public static void m3222(Object obj) {
        if (C0232.m9299() > 0) {
            ((k1) obj).r();
        }
    }

    /* JADX INFO: renamed from: ۟۠ۢۥۡ, reason: not valid java name and contains not printable characters */
    public static Map m3223(Object obj) {
        if (C0040.m1622() <= 0) {
            return ((wm) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static zm m3224(Object obj) {
        if (C0141.m5769() >= 0) {
            return ((ym) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m3225(Object obj, Object obj2, Object obj3) {
        if (C0023.m843() >= 0) {
            ((k0) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj2, (Animator) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۤۧۥ, reason: not valid java name and contains not printable characters */
    public static void m3226(Object obj, Object obj2) {
        if (C0135.m5274() <= 0) {
            ((ScrollView) obj).setLayoutParams((ViewGroup.LayoutParams) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static int m3227(Object obj) {
        if (C0036.m1332() <= 0) {
            return ((yf) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۡۤ, reason: not valid java name and contains not printable characters */
    public static void m3228(Object obj, Object obj2) {
        if (C0219.m8794() > 0) {
            wr.N((View) obj, (h) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m3229(Object obj, Object obj2) {
        if (C0065.m2448() >= 0) {
            ((xs.d) obj).f((xs) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۥ, reason: not valid java name and contains not printable characters */
    public static HookMain m3230(Object obj) {
        if (C0014.m545() >= 0) {
            return ((HookMain.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۢ, reason: not valid java name and contains not printable characters */
    public static ActionMode m3231(Object obj, Object obj2, int i) {
        if (C0211.m8341() > 0) {
            return ((Window.Callback) obj).onWindowStartingActionMode((ActionMode.Callback) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥ۠۠, reason: not valid java name and contains not printable characters */
    public static void m3232(Object obj, Object obj2, Object obj3) {
        if (C0181.m7445() >= 0) {
            ((wr.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).b((View) obj2, (Boolean) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۧ۠۠, reason: not valid java name and contains not printable characters */
    public static Typeface m3233(Object obj, Object obj2) {
        if (C0200.m8104() <= 0) {
            return ((wq) obj).a(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static void m3234(Object obj, boolean z) {
        if (C0164.m6900() <= 0) {
            ((ListView) obj).setPressed(z);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static StructStat m3235(Object obj) {
        if (C0108.m4038() >= 0) {
            return Os.stat((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static f6 m3236(Object obj) {
        if (C0069.m2756() < 0) {
            return ((an) obj).S();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Bundle m3237(Object obj, Object obj2) {
        if (C0218.m8760() >= 0) {
            return ((androidx.savedstate.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m3238(Object obj) {
        if (C0133.m5208() < 0) {
            return ((fj) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۦ۟۟, reason: not valid java name and contains not printable characters */
    public static void m3239(Object obj) {
        if (C0169.m7034() <= 0) {
            OnBackPressedDispatcher.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((fa) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static int m3240(Object obj, Object obj2) {
        if (C0213.m8458() > 0) {
            return ((Activity) obj).checkSelfPermission((String) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۦۨ, reason: not valid java name and contains not printable characters */
    public static int m3241(Object obj) {
        if (C0062.m2326() >= 0) {
            return ((u0) obj).f();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۡۥۣ, reason: not valid java name and contains not printable characters */
    public static boolean m3242(Object obj) {
        if (C0004.m139() <= 0) {
            return ((ConnectionBlocker) obj).k();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static File m3243(Object obj) {
        if (C0116.m4340() > 0) {
            return ((Context) obj).getCacheDir();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۨ, reason: not valid java name and contains not printable characters */
    public static Class m3244(Object obj) {
        if (C0249.m10052() < 0) {
            return ((HookMain.o) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static Font.Builder m3245(Object obj, int i) {
        if (C0164.m6900() <= 0) {
            return ((Font.Builder) obj).setTtcIndex(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static void m3246(Object obj, Object obj2) {
        if (C0014.m545() > 0) {
            pp.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((y5) obj, obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۢۢۢ, reason: not valid java name and contains not printable characters */
    public static float m3247(Object obj) {
        if (C0039.m1515() < 0) {
            return ((us) obj).b();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦۥ, reason: not valid java name and contains not printable characters */
    public static boolean m3248(Object obj) {
        if (C0119.m4573() >= 0) {
            return ((k1) obj).e;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۥۥۧ, reason: not valid java name and contains not printable characters */
    public static hn m3249(Object obj) {
        if (C0064.m2388() > 0) {
            return kn.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Iterator) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۡۤ, reason: not valid java name and contains not printable characters */
    public static Throwable m3250(Object obj, Object obj2) {
        if (C0031.m1148() <= 0) {
            return ((SocketTimeoutException) obj).initCause((Throwable) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۨۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3251(Object obj) {
        if (C0249.m10052() <= 0) {
            return ((Response) obj).isSuccessful();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3252(Object obj, Object obj2) {
        if (C0133.m5208() <= 0) {
            return ((ViewGroup) obj).post((Runnable) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m3253() {
        return (-563) ^ C0217.f667;
    }

    /* JADX INFO: renamed from: ۡ۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static SpannableStringBuilder m3254(Object obj, int i, int i2, Object obj2) {
        if (C0021.m740() < 0) {
            return ((vn) obj).replace(i, i2, (CharSequence) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۤۧ, reason: not valid java name and contains not printable characters */
    public static int m3255(Object obj) {
        if (C0227.m9046() > 0) {
            return ((okhttp3.Response) obj).code();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۧۤ, reason: not valid java name and contains not printable characters */
    public static Typeface m3256() {
        if (C0107.m3883() > 0) {
            return Typeface.DEFAULT;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۢۢ, reason: not valid java name and contains not printable characters */
    public static void m3257(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0202.m8245() > 0) {
            ((xd) obj).i((xd.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2, (w3) obj3, obj4);
        }
    }

    /* JADX INFO: renamed from: ۢۦۣ۠, reason: not valid java name and contains not printable characters */
    public static int m3258(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static HookMain m3259(Object obj) {
        if (C0235.m9535() < 0) {
            return ((ac) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m3260(Object obj, Object obj2) {
        if (C0187.m7613() > 0) {
            ((l2) obj).l((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۡ۟۠, reason: not valid java name and contains not printable characters */
    public static boolean m3261(Object obj) {
        if (C0161.m6744() > 0) {
            return ((LinkedHashMap) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۡۤۧ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m3262(Object obj, int i) {
        if (C0200.m8104() <= 0) {
            return ((TypedArray) obj).getColorStateList(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۡ۟, reason: contains not printable characters */
    public static int m3263(Object obj, Object obj2) {
        if (C0215.m8604() < 0) {
            return ((AtomicIntegerFieldUpdater) obj).decrementAndGet(obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۣۣۧ, reason: contains not printable characters */
    public static int m3264() {
        if (C0039.m1515() <= 0) {
            return u0.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۤۢۤ, reason: contains not printable characters */
    public static mf m3265() {
        if (C0039.m1515() < 0) {
            return u0.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۥۧ, reason: contains not printable characters */
    public static float m3266(Object obj, float f, float f2, float f3) {
        if (C0126.m4908() < 0) {
            return ((zr) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(f, f2, f3);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۦ۟ۥۢ, reason: contains not printable characters */
    public static WindowInsets m3267(Object obj, int i, int i2, int i3, int i4) {
        if (C0225.m9001() > 0) {
            return ((WindowInsets) obj).inset(i, i2, i3, i4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡ۟ۥ, reason: contains not printable characters */
    public static void m3268(Object obj, boolean z) {
        if (C0020.m701() > 0) {
            ((i) obj).G(z);
        }
    }

    /* JADX INFO: renamed from: ۦۣ۟۟, reason: contains not printable characters */
    public static PackageInfo m3269(Object obj, Object obj2, int i) {
        if (C0026.m1047() >= 0) {
            return ((PackageManager) obj).getPackageInfo((String) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥ۟ۢ, reason: contains not printable characters */
    public static Context m3270(Object obj) {
        if (C0122.m4736() <= 0) {
            return ((k6) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static String m3271(Object obj) {
        if (C0024.m896() >= 0) {
            return ((LicenseManager) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static kk m3272() {
        if (C0129.m5108() >= 0) {
            return ik.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۥۥ, reason: not valid java name and contains not printable characters */
    public static TextDirectionHeuristic m3273() {
        if (C0213.m8458() > 0) {
            return TextDirectionHeuristics.ANYRTL_LTR;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۡۦ, reason: not valid java name and contains not printable characters */
    public static float m3274(Object obj) {
        if (C0115.m4218() < 0) {
            return ((us) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۧۥۧۡ, reason: not valid java name and contains not printable characters */
    public static boolean m3275(Object obj, Object obj2) {
        if (C0202.m8245() > 0) {
            return ((lg.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).contains(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۨۥۣ, reason: not valid java name and contains not printable characters */
    public static String m3276(Object obj) {
        if (C0006.m169() <= 0) {
            return ((okhttp3.Response) obj).message();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3278(boolean z, boolean z2, boolean z3) {
        if (C0224.m8861() <= 0) {
            return ws.i(z, z2, z3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۢۤ, reason: not valid java name and contains not printable characters */
    public static String m3277(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
