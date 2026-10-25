package androidx.annotation;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.support.v4.app.C0004;
import android.support.v4.graphics.drawable.C0009;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.C0021;
import androidx.appcompat.app.C0035;
import androidx.appcompat.widget.C0047;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0052;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0065;
import androidx.core.graphics.drawable.C0066;
import androidx.core.widget.C0068;
import androidx.core.widget.C0069;
import androidx.emoji2.text.C0078;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0095;
import androidx.lifecycle.C0107;
import androidx.lifecycle.C0108;
import androidx.lifecycle.e;
import androidx.lifecycle.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0118;
import androidx.profileinstaller.C0119;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0122;
import androidx.savedstate.C0127;
import androidx.savedstate.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.versionedparcelable.C0133;
import androidx.versionedparcelable.C0135;
import com.example.vcam.C0141;
import com.example.vcam.Menu;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bt;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.el;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.g3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.iq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.up;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import okhttp3.internal.C0227;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.ws.C0224;
import okhttp3.logging.C0232;
import okhttp3.logging.C0233;
import okhttp3.logging.C0234;
import okhttp3.logging.C0235;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: androidx.annotation.۟ۢۧ۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0024 {

    /* JADX INFO: renamed from: ۟ۧ۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static int f23 = 546;

    /* JADX INFO: renamed from: ۟۟۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static int m864(Object obj, int i, int i2) {
        if (C0120.m4608() >= 0) {
            return n5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((int[]) obj, i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۡۨۨ, reason: not valid java name and contains not printable characters */
    public static Object m865(Object obj) {
        if (C0178.m7344() < 0) {
            return ((ArrayDeque) obj).peek();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۢۧ, reason: not valid java name and contains not printable characters */
    public static String m866(Object obj) {
        if (C0199.m7998() <= 0) {
            return ((l9.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m867(Object obj) {
        if (C0052.m1890() >= 0) {
            return ((Locale) obj).hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۤۢ۟, reason: not valid java name and contains not printable characters */
    public static TypedValue m868(Object obj) {
        if (C0049.m1767() <= 0) {
            return ((ContentFrameLayout) obj).getMinWidthMinor();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۥۧ, reason: not valid java name and contains not printable characters */
    public static TextDirectionHeuristic m869() {
        if (C0065.m2448() >= 0) {
            return TextDirectionHeuristics.LTR;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۤ, reason: not valid java name and contains not printable characters */
    public static dd m870(Object obj) {
        if (C0023.m843() >= 0) {
            return ((xs.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m871(Object obj, int i) {
        if (C0135.m5274() <= 0) {
            return ((zr.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m872(Object obj) {
        if (C0235.m9535() <= 0) {
            return Log.getStackTraceString((Throwable) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۨۦ, reason: not valid java name and contains not printable characters */
    public static long m873(Object obj) {
        if (C0078.m3044() <= 0) {
            return ((t8) obj).V();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨۡ, reason: not valid java name and contains not printable characters */
    public static CharSequence m874(Object obj) {
        if (C0232.m9299() >= 0) {
            return ((i.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۦۢ, reason: not valid java name and contains not printable characters */
    public static Object[] m875(Object obj, Object obj2) {
        if (C0215.m8604() < 0) {
            return ((Collection) obj).toArray((Object[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨ۠ۢ, reason: not valid java name and contains not printable characters */
    public static Bundle m876(Object obj) {
        if (C0233.m9365() <= 0) {
            return e.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((e) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۧ, reason: not valid java name and contains not printable characters */
    public static int[] m877(Object obj) {
        if (C0118.m4454() > 0) {
            return ((bt) obj).getState();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۥ, reason: not valid java name and contains not printable characters */
    public static int m878(Object obj, int i, int i2, int i3) {
        if (C0227.m9046() > 0) {
            return ((zr) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, i2, i3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۤ۟۠, reason: not valid java name and contains not printable characters */
    public static float m879(int i, float f, Object obj) {
        if (C0066.m2514() > 0) {
            return TypedValue.applyDimension(i, f, (DisplayMetrics) obj);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۤۤۢۥ, reason: not valid java name and contains not printable characters */
    public static void m880(Object obj, Object obj2, Object obj3) {
        if (C0113.m4144() < 0) {
            ((v0) obj).B0((v0.k) obj2, (KeyEvent) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۥۤۢ, reason: not valid java name and contains not printable characters */
    public static int m881(Object obj) {
        if (C0062.m2326() >= 0) {
            return ((n9.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static int m882(Object obj) {
        if (C0148.m6464() < 0) {
            return ((iq) obj).a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static l2 m883(Object obj) {
        if (C0194.m7889() >= 0) {
            return l2.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۧۨ, reason: not valid java name and contains not printable characters */
    public static String m884(String str) {
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

    /* JADX INFO: renamed from: ۟ۦۡۡ۟, reason: not valid java name and contains not printable characters */
    public static void m885(Object obj, Object obj2) {
        if (C0119.m4573() >= 0) {
            ((xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۤۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m886(Object obj) {
        if (C0119.m4573() > 0) {
            return ((pr.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m887(Object obj) {
        if (C0214.m8575() <= 0) {
            return ((xp) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۢۧ, reason: not valid java name and contains not printable characters */
    public static Drawable m888(Object obj) {
        if (C0176.m7290() >= 0) {
            return ((PackageManager) obj).getDefaultActivityIcon();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۤۨ, reason: not valid java name and contains not printable characters */
    public static String m889(int i) {
        if (C0093.m3365() >= 0) {
            return o5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m890() {
        if (C0009.m276() <= 0) {
            return Build.MANUFACTURER;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m891(Object obj, boolean z) {
        if (C0164.m6900() <= 0) {
            ((androidx.appcompat.view.menu.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).S(z);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m892(Object obj, Object obj2) {
        if (C0224.m8861() <= 0) {
            return ((LocaleList) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۨۢۧ, reason: not valid java name and contains not printable characters */
    public static int m893(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۠ۨۨ۟, reason: not valid java name and contains not printable characters */
    public static TypedArray m894(Object obj) {
        if (C0233.m9365() < 0) {
            return ((zp) obj).i();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m895(Object obj) {
        if (C0004.m139() < 0) {
            return ((Package) obj).getName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static int m896() {
        return 788 ^ C0232.f682;
    }

    /* JADX INFO: renamed from: ۡۥۨۨ, reason: not valid java name and contains not printable characters */
    public static long m898(Object obj) {
        if (C0127.m4950() >= 0) {
            return ((s2) obj).c();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۢۤ, reason: not valid java name and contains not printable characters */
    public static sn m899(Object obj) {
        if (C0116.m4340() > 0) {
            return rj.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((OutputStream) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۥ۟, reason: not valid java name and contains not printable characters */
    public static int m900(Object obj) {
        if (C0233.m9365() < 0) {
            return ((m2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۢ۠, reason: not valid java name and contains not printable characters */
    public static int m901(Object obj) {
        if (C0232.m9299() >= 0) {
            return ((FrameLayout) obj).getHeight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۦۧ۠, reason: not valid java name and contains not printable characters */
    public static Object m902(Object obj) {
        if (C0035.m1268() < 0) {
            return ((yo) obj).getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۥۤ, reason: not valid java name and contains not printable characters */
    public static Boolean m903(Object obj, Object obj2) {
        if (C0161.m6744() >= 0) {
            return ((wr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).a((View) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۣۨ, reason: not valid java name and contains not printable characters */
    public static boolean m904(Object obj, Object obj2) {
        if (C0149.m6476() <= 0) {
            return ((zq.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((n9.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۠۠ۢ, reason: contains not printable characters */
    public static byte[] m905() {
        if (C0021.m740() < 0) {
            return el.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۥۤ, reason: contains not printable characters */
    public static TimeUnit m906() {
        if (C0133.m5208() < 0) {
            return TimeUnit.SECONDS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۣ۠, reason: contains not printable characters */
    public static String m907(Object obj) {
        if (C0108.m4038() > 0) {
            return ((m9.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۣۨ, reason: contains not printable characters */
    public static r4 m908(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (C0107.m3883() >= 0) {
            return ((r4) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj2, (g3) obj3, (qa) obj4, obj5, (Throwable) obj6);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۥ۠, reason: contains not printable characters */
    public static int m909(Object obj, Object obj2) {
        if (C0069.m2756() <= 0) {
            return ((Configuration) obj).diff((Configuration) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۦۣۡ, reason: contains not printable characters */
    public static ColorStateList m910(Object obj) {
        if (C0162.m6837() <= 0) {
            return ((MenuItem) obj).getIconTintList();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧۢ۟, reason: contains not printable characters */
    public static boolean m911(Object obj) {
        if (C0068.m2650() >= 0) {
            return ((uo.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).m;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۧۤۢ, reason: contains not printable characters */
    public static List m912(Object obj, Object obj2, Object obj3) {
        if (C0141.m5769() >= 0) {
            return ((kp.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj2, (PackageManager) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧۧۧ, reason: contains not printable characters */
    public static up m913(Object obj) {
        if (C0234.m9461() <= 0) {
            return ((r9) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۣۡ, reason: not valid java name and contains not printable characters */
    public static Thread.UncaughtExceptionHandler m914(Object obj) {
        if (C0122.m4736() < 0) {
            return ((Thread) obj).getUncaughtExceptionHandler();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۣ۟, reason: not valid java name and contains not printable characters */
    public static int m915(Object obj, int i) {
        if (C0204.m8270() <= 0) {
            return ((Random) obj).nextInt(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۥۥۢ, reason: not valid java name and contains not printable characters */
    public static boolean m916(Object obj) {
        if (C0149.m6476() < 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).A;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۦۥۥ, reason: not valid java name and contains not printable characters */
    public static int m917(Object obj) {
        if (C0047.m1663() < 0) {
            return ((KeyEvent) obj).getFlags();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۧۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m918(Object obj, int i) {
        if (C0095.m3478() < 0) {
            return ((v0) obj).y(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۧۦ, reason: not valid java name and contains not printable characters */
    public static boolean m919(Object obj) {
        if (C0249.m10052() <= 0) {
            return ((Menu.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۨۡۧ, reason: not valid java name and contains not printable characters */
    public static void m920(Object obj, Object obj2) {
        if (C0127.m4950() >= 0) {
            ((m5) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۥۦۢ, reason: not valid java name and contains not printable characters */
    public static Set m921(Object obj) {
        if (C0066.m2514() > 0) {
            return ((WeakHashMap) obj).entrySet();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۥ۠, reason: not valid java name and contains not printable characters */
    public static String m897(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
