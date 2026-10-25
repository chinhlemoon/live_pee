package androidx.versionedparcelable;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.SearchableInfo;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.icu.util.ULocale;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.C0004;
import android.support.v4.graphics.drawable.C0010;
import android.support.v4.graphics.drawable.C0011;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.activity.C0014;
import androidx.activity.C0020;
import androidx.activity.C0021;
import androidx.annotation.C0024;
import androidx.annotation.C0025;
import androidx.annotation.C0026;
import androidx.appcompat.app.C0034;
import androidx.appcompat.app.C0035;
import androidx.appcompat.view.menu.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.core.app.C0051;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0065;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0072;
import androidx.emoji2.text.C0079;
import androidx.emoji2.text.C0083;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0096;
import androidx.fragment.app.C0099;
import androidx.fragment.app.a;
import androidx.lifecycle.C0107;
import androidx.lifecycle.C0108;
import androidx.lifecycle.e;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0118;
import androidx.profileinstaller.C0119;
import androidx.profileinstaller.C0120;
import androidx.profileinstaller.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.savedstate.C0123;
import androidx.savedstate.C0126;
import androidx.savedstate.C0127;
import androidx.savedstate.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import com.example.vcam.C0141;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.HookMain;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.b;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.g;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.g1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.im;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ip;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ki;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lh;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.nc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.so;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.um;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ws;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import okhttp3.C0238;
import okhttp3.C0239;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.internal.C0227;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.logging.C0231;
import okhttp3.logging.C0232;
import okhttp3.logging.C0233;
import okhttp3.logging.C0235;
import retrofit2.C0259;

/* JADX INFO: renamed from: androidx.versionedparcelable.۟ۧۥۣۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0133 {

    /* JADX INFO: renamed from: ۟ۧۦ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int f112 = 867;

    /* JADX INFO: renamed from: ۣ۟۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static ColorStateList m5196(Object obj, int i, Object obj2) {
        if (C0051.m1783() < 0) {
            return im.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Resources) obj, i, (Resources.Theme) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m5197(String str) {
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

    /* JADX INFO: renamed from: ۣ۟۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static void m5198(Object obj, int i, int i2) {
        if (C0214.m8575() < 0) {
            ((b.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۟۠۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static Object m5199(Object obj) {
        if (C0034.m1206() <= 0) {
            return ((DragEvent) obj).getLocalState();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۡۨ, reason: not valid java name and contains not printable characters */
    public static void m5200(Object obj, Object obj2, int i, int i2, boolean z, Object obj3) {
        if (C0119.m4573() >= 0) {
            ((jq) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj2, i, i2, z, (CharSequence) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۢۡ۟, reason: not valid java name and contains not printable characters */
    public static int m5201(Object obj) {
        if (C0176.m7290() >= 0) {
            return ((MotionEvent) obj).getPointerCount();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۦۥ۟, reason: not valid java name and contains not printable characters */
    public static boolean m5202() {
        if (C0126.m4908() <= 0) {
            return x.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۨۡۤ, reason: not valid java name and contains not printable characters */
    public static long m5203(Object obj) {
        if (C0108.m4038() > 0) {
            return ((ConnectionBlocker) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠ۨۦ۟, reason: not valid java name and contains not printable characters */
    public static String m5204(Object obj) {
        if (C0227.m9046() >= 0) {
            return ((SearchableInfo) obj).getSuggestAuthority();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m5205(Object obj, int i) {
        if (C0021.m740() < 0) {
            ((zr) obj).b(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۥۦ, reason: not valid java name and contains not printable characters */
    public static tm.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m5206(Object obj) {
        if (C0093.m3365() >= 0) {
            return ((tm.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۤۢ, reason: not valid java name and contains not printable characters */
    public static long m5207(Object obj) {
        if (C0117.m4419() <= 0) {
            return ((s2) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۢۥ, reason: not valid java name and contains not printable characters */
    public static int m5208() {
        return (-652) ^ C0231.f681;
    }

    /* JADX INFO: renamed from: ۟ۢۦۤۢ, reason: not valid java name and contains not printable characters */
    public static i m5209(Object obj) {
        if (C0199.m7998() <= 0) {
            return ((g) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۥۤ, reason: not valid java name and contains not printable characters */
    public static boolean m5210(Object obj) {
        if (C0026.m1047() > 0) {
            return ((i1) obj).a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۢ, reason: not valid java name and contains not printable characters */
    public static void m5211(Object obj, int i, int i2, int i3, int i4) {
        if (C0199.m7998() < 0) {
            ((Button) obj).setPadding(i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥ۠, reason: not valid java name and contains not printable characters */
    public static void m5212(Object obj, Object obj2) {
        if (C0011.m458() > 0) {
            ((xd.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Throwable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۤ۟, reason: not valid java name and contains not printable characters */
    public static List m5213(Object obj) {
        if (C0072.m2856() < 0) {
            return C0120.m4626((ConnectionBlocker) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۧۡ, reason: not valid java name and contains not printable characters */
    public static void m5214(Object obj, Object obj2) {
        if (C0117.m4419() < 0) {
            ((ws.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).g((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static int m5215(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۥۢۨۡ, reason: not valid java name and contains not printable characters */
    public static void m5216(Object obj, Object obj2) {
        if (C0014.m545() > 0) {
            ((xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Bundle) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۥۦۧ, reason: not valid java name and contains not printable characters */
    public static Typeface m5217(Object obj) {
        if (C0240.m9826() >= 0) {
            return ((l9.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static View m5218(Object obj) {
        if (C0172.m7180() > 0) {
            return ((v0) obj).y;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۢۦ, reason: not valid java name and contains not printable characters */
    public static Method m5219() {
        if (C0010.m354() < 0) {
            return qk.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۢۤ, reason: not valid java name and contains not printable characters */
    public static t5 m5220(Object obj) {
        if (C0020.m701() > 0) {
            return ((k3) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۤۢ, reason: not valid java name and contains not printable characters */
    public static String m5221(Object obj) {
        if (C0149.m6476() <= 0) {
            return ((uo.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۥۨ, reason: not valid java name and contains not printable characters */
    public static zq m5222() {
        if (C0200.m8104() < 0) {
            return tq.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m5223(Object obj) {
        if (C0233.m9365() < 0) {
            ((bs) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۦۨ, reason: not valid java name and contains not printable characters */
    public static void m5224(Object obj, Object obj2) {
        if (C0079.m3072() <= 0) {
            ((a) obj).o((Configuration) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۡۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m5225() {
        if (C0116.m4340() >= 0) {
            return xs.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠۟, reason: not valid java name and contains not printable characters */
    public static Activity m5226(Object obj) {
        if (C0069.m2756() <= 0) {
            return g1.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۥ۟, reason: not valid java name and contains not printable characters */
    public static int m5227(Object obj) {
        if (C0079.m3072() < 0) {
            return ((m6) obj).v();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static void m5228(Object obj, Object obj2) {
        if (C0235.m9535() <= 0) {
            q6.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj, (StringBuilder) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۤۧۤ, reason: not valid java name and contains not printable characters */
    public static void m5229(Object obj, Object obj2, float f, float f2, Object obj3) {
        if (C0025.m934() > 0) {
            ((Canvas) obj).drawRoundRect((RectF) obj2, f, f2, (Paint) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۥۨۧ, reason: not valid java name and contains not printable characters */
    public static void m5230(Object obj, int i) {
        if (C0148.m6464() < 0) {
            ((zr) obj).k(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۦ۟, reason: not valid java name and contains not printable characters */
    public static ColorStateList m5231(Object obj) {
        if (C0117.m4419() < 0) {
            return qc.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ImageView) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۡ, reason: not valid java name and contains not printable characters */
    public static ULocale m5232(Object obj) {
        if (C0141.m5769() > 0) {
            return nc.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۤۨ, reason: not valid java name and contains not printable characters */
    public static Iterable m5233(Object obj) {
        if (C0058.m2184() > 0) {
            return mn.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((hn) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۥ۠, reason: not valid java name and contains not printable characters */
    public static void m5234(Object obj, Object obj2, Object obj3) {
        if (C0096.m3601() <= 0) {
            ((k3) obj).b((qa) obj2, (Throwable) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m5235(Object obj) {
        if (C0024.m896() > 0) {
            return ((com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۥۤ, reason: not valid java name and contains not printable characters */
    public static Object m5236(Object obj, Object obj2) {
        if (C0025.m934() > 0) {
            return ((rn) obj).get(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static int m5237(Object obj, Object obj2, Object obj3) {
        if (C0058.m2184() >= 0) {
            return ((PackageManager) obj).checkPermission((String) obj2, (String) obj3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۨ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m5238(Object obj, boolean z) {
        if (C0065.m2448() > 0) {
            ((Constructor) obj).setAccessible(z);
        }
    }

    /* JADX INFO: renamed from: ۡ۠ۨۦ, reason: not valid java name and contains not printable characters */
    public static Void m5239(Object obj) {
        if (C0010.m354() < 0) {
            return ((n8) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۢ۟, reason: not valid java name and contains not printable characters */
    public static Intent m5240(Object obj) {
        if (C0239.m9805() < 0) {
            return ((ip.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۨۨ, reason: not valid java name and contains not printable characters */
    public static boolean m5241(Object obj, Object obj2, Object obj3, int i, int i2, int i3) {
        if (C0069.m2756() < 0) {
            return ((wq) obj).g(obj2, (ByteBuffer) obj3, i, i2, i3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۢۡۦ, reason: not valid java name and contains not printable characters */
    public static HookMain m5242(Object obj) {
        if (C0107.m3883() > 0) {
            return ((HookMain.f) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۤۡ, reason: not valid java name and contains not printable characters */
    public static e m5243(Object obj) {
        if (C0117.m4419() < 0) {
            return ((um) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۤۢ, reason: not valid java name and contains not printable characters */
    public static void m5244(Object obj, Object obj2) {
        if (C0187.m7613() > 0) {
            ((v0.k) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۢۢۨ, reason: not valid java name and contains not printable characters */
    public static void m5245(Object obj, Object obj2) {
        if (C0232.m9299() >= 0) {
            ((Path) obj).setFillType((Path.FillType) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۥ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m5246(Object obj, Object obj2) {
        if (C0035.m1268() <= 0) {
            ((EditText) obj).setHint((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۦۣۧ, reason: not valid java name and contains not printable characters */
    public static r.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m5247(Object obj) {
        if (C0083.m3188() < 0) {
            return ((ki.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۤ۟, reason: not valid java name and contains not printable characters */
    public static Drawable m5248(Object obj) {
        if (C0123.m4841() < 0) {
            return ((ListView) obj).getSelector();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۢۢ, reason: not valid java name and contains not printable characters */
    public static Object m5249(Object obj, Object obj2) {
        if (C0204.m8270() < 0) {
            return ((rn) obj).remove(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۥ۟, reason: not valid java name and contains not printable characters */
    public static void m5250(Object obj, int i) {
        if (C0099.m3752() <= 0) {
            ((ValueAnimator) obj).setRepeatMode(i);
        }
    }

    /* JADX INFO: renamed from: ۣۤۨۧ, reason: not valid java name and contains not printable characters */
    public static void m5251(Object obj, int i) {
        if (C0108.m4038() >= 0) {
            ((LinearLayout) obj).setBackgroundColor(i);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۤۢ, reason: contains not printable characters */
    public static Context m5252(Object obj) {
        if (C0112.m4054() <= 0) {
            return ((l9.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۥۥ, reason: contains not printable characters */
    public static ArrayList m5253(Object obj) {
        if (C0025.m934() >= 0) {
            return ((so.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۧ, reason: contains not printable characters */
    public static AppCompatSpinner m5254(Object obj, Object obj2, Object obj3) {
        if (C0259.m10136() >= 0) {
            return ((m1) obj).f((Context) obj2, (AttributeSet) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۡ۠, reason: contains not printable characters */
    public static Cursor m5255(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        if (C0126.m4908() < 0) {
            return i9.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ContentResolver) obj, (Uri) obj2, (String[]) obj3, (String) obj4, (String[]) obj5, (String) obj6, obj7);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۥۢ, reason: contains not printable characters */
    public static LinearLayout m5256(Object obj) {
        if (C0112.m4054() < 0) {
            return ((lh) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۦۦ, reason: contains not printable characters */
    public static void m5257(Object obj, int i, int i2, int i3, int i4) {
        if (C0194.m7889() >= 0) {
            k1.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TextView) obj, i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: ۦ۟ۧۡ, reason: contains not printable characters */
    public static void m5258(Object obj, Object obj2) {
        if (C0238.m9653() >= 0) {
            ((rr) obj).A((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۣۦۦ, reason: contains not printable characters */
    public static Rect m5259(Object obj) {
        if (C0107.m3883() >= 0) {
            return ((z9.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۨۧ, reason: contains not printable characters */
    public static xp m5260(Object obj) {
        if (C0202.m8245() >= 0) {
            return ((k1) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static androidx.lifecycle.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m5261() {
        if (C0004.m139() < 0) {
            return androidx.lifecycle.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.ON_DESTROY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۣ, reason: not valid java name and contains not printable characters */
    public static boolean m5262(Object obj) {
        if (C0072.m2856() <= 0) {
            return ((vj) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Drawable m5263(Object obj) {
        if (C0118.m4454() > 0) {
            return ((t7) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static long m5264(Object obj, Object obj2) {
        if (C0127.m4950() >= 0) {
            return ((s2) obj).o((un) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۨۢۨ, reason: not valid java name and contains not printable characters */
    public static xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m5265(Object obj) {
        if (C0176.m7290() >= 0) {
            return ((f7) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥ۠ۨ, reason: not valid java name and contains not printable characters */
    public static Runnable m5266(Object obj) {
        if (C0004.m139() < 0) {
            return ((t8) obj).h0();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m5267(Object obj, int i) {
        if (C0219.m8794() >= 0) {
            ((rp) obj).d(i);
        }
    }

    /* JADX INFO: renamed from: ۨۨۤۤ, reason: not valid java name and contains not printable characters */
    public static int m5268(Object obj) {
        if (C0219.m8794() >= 0) {
            return ((zr) obj).g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۨۨۧ, reason: not valid java name and contains not printable characters */
    public static boolean m5269(Object obj, Object obj2, int i) {
        if (C0239.m9805() < 0) {
            return ((String) obj).startsWith((String) obj2, i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static String m5195(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
