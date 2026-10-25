package okhttp3;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.icu.text.DecimalFormatSymbols;
import android.media.MediaExtractor;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.C0002;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0009;
import android.support.v4.graphics.drawable.C0010;
import android.support.v4.graphics.drawable.C0011;
import android.text.Editable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.WindowInsets;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.BackEvent;
import androidx.activity.C0020;
import androidx.annotation.C0026;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0034;
import androidx.appcompat.app.C0037;
import androidx.appcompat.view.menu.C0039;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.view.menu.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.cardview.widget.C0049;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0064;
import androidx.core.widget.C0068;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0096;
import androidx.fragment.app.C0097;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import androidx.lifecycle.C0106;
import androidx.lifecycle.C0108;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0122;
import androidx.savedstate.C0123;
import androidx.savedstate.C0127;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0133;
import androidx.versionedparcelable.C0135;
import com.example.vcam.HookMain;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.b3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.c3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.cj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ec;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.im;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yb;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zs;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Logger;
import okhttp3.internal.C0227;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.io.C0195;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.logging.C0231;
import okhttp3.logging.C0234;
import okhttp3.logging.C0236;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: okhttp3.ۣ۟۟ۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0238 {

    /* JADX INFO: renamed from: ۟ۥۢۤۨ, reason: not valid java name and contains not printable characters */
    public static int f688 = -628;

    /* JADX INFO: renamed from: ۣ۟۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static void m9652(Object obj) {
        if (C0127.m4950() > 0) {
            ((HttpURLConnection) obj).disconnect();
        }
    }

    /* JADX INFO: renamed from: ۟۟ۨۥۥ, reason: not valid java name and contains not printable characters */
    public static int m9653() {
        return 832 ^ C0191.f641;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static int m9654(Object obj) {
        if (C0135.m5274() < 0) {
            return ((rn) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡ۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static String[] m9655(Object obj) {
        if (C0195.m7914() > 0) {
            return ((DecimalFormatSymbols) obj).getDigitStrings();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m9656(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String[] m9657(Object obj, Object obj2, int i) {
        if (C0108.m4038() >= 0) {
            return ((String) obj).split((String) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧۥ, reason: not valid java name and contains not printable characters */
    public static long m9658(Object obj, long j, long j2) {
        if (m9653() >= 0) {
            return ((vf.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(j, j2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۡۡۤ, reason: not valid java name and contains not printable characters */
    public static z8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.C0147x35d57e31 m9659() {
        if (C0049.m1767() <= 0) {
            return z8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.C0147x35d57e31.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۢۡ, reason: not valid java name and contains not printable characters */
    public static xp m9661(Object obj) {
        if (C0039.m1515() <= 0) {
            return ((k1) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۥۡ, reason: not valid java name and contains not printable characters */
    public static HookMain m9662(Object obj) {
        if (C0049.m1767() <= 0) {
            return ((yb) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static Logger m9663() {
        if (C0213.m8458() > 0) {
            return e.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static char[] m9664() {
        if (C0116.m4340() >= 0) {
            return b3.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m9665(Object obj) {
        if (C0249.m10052() <= 0) {
            return ((x9) obj).d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static AtomicReferenceFieldUpdater m9666() {
        if (C0120.m4608() > 0) {
            return zs.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static int[] m9667() {
        if (C0010.m354() <= 0) {
            return n5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۤۡ, reason: not valid java name and contains not printable characters */
    public static ViewPropertyAnimator m9668(Object obj, Object obj2) {
        if (C0182.m7528() < 0) {
            return ((ViewPropertyAnimator) obj).setListener((Animator.AnimatorListener) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۨۧ, reason: not valid java name and contains not printable characters */
    public static String[] m9669(Object obj) {
        if (C0128.m5064() < 0) {
            return y7.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((EditorInfo) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧۨ, reason: not valid java name and contains not printable characters */
    public static boolean m9670(Object obj, Object obj2) {
        if (C0031.m1148() <= 0) {
            return ((a) obj).p((MenuItem) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۦ۠, reason: not valid java name and contains not printable characters */
    public static void m9671(Object obj, Object obj2) {
        if (C0204.m8270() < 0) {
            qc.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ImageView) obj, (PorterDuff.Mode) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۦۨ۠, reason: not valid java name and contains not printable characters */
    public static EditText m9672(Object obj) {
        if (C0094.m3450() > 0) {
            return ((a8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨ۟, reason: not valid java name and contains not printable characters */
    public static void m9673(Object obj, int i, Object obj2, Object obj3) throws XmlPullParserException, IOException {
        if (C0112.m4054() < 0) {
            ((XmlPullParser) obj).require(i, (String) obj2, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۢۥ۟, reason: not valid java name and contains not printable characters */
    public static Object m9674() {
        if (C0204.m8270() < 0) {
            return im.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۥۤ, reason: not valid java name and contains not printable characters */
    public static List m9675() {
        if (C0231.m9265() > 0) {
            return d4.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۡۡ, reason: not valid java name and contains not printable characters */
    public static float m9676(Object obj) {
        if (C0034.m1206() < 0) {
            return ((BackEvent) obj).getTouchX();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۦۢۥۣ, reason: not valid java name and contains not printable characters */
    public static int m9677(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦۥۨۦ, reason: not valid java name and contains not printable characters */
    public static HookMain.a m9678(Object obj) {
        if (C0115.m4218() <= 0) {
            return ((ec) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۥۣ, reason: not valid java name and contains not printable characters */
    public static void m9679(Object obj, int i, int i2) {
        if (C0201.m8184() <= 0) {
            ((SparseIntArray) obj).put(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۦۣ, reason: not valid java name and contains not printable characters */
    public static void m9680(Object obj, Object obj2) {
        if (C0236.m9615() >= 0) {
            ((xd) obj).a(obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤۡ, reason: not valid java name and contains not printable characters */
    public static Object m9681(Object obj) {
        if (C0219.m8794() >= 0) {
            return yd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۤۢ, reason: not valid java name and contains not printable characters */
    public static xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m9682(Object obj) {
        if (C0187.m7613() >= 0) {
            return ((i8) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۥۤ, reason: not valid java name and contains not printable characters */
    public static void m9683(Object obj, Object obj2) {
        if (C0123.m4841() < 0) {
            wr.h.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj, (CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۨۥۧ, reason: not valid java name and contains not printable characters */
    public static boolean m9684(Object obj) {
        if (C0002.m72() > 0) {
            return ((tf) obj).e();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۡۨۤ, reason: not valid java name and contains not printable characters */
    public static String m9685(Object obj) {
        if (C0062.m2326() >= 0) {
            return ((lf.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۧۥ, reason: not valid java name and contains not printable characters */
    public static boolean m9686(Object obj) {
        if (C0106.m3835() > 0) {
            return ((l3) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static boolean m9687(Object obj) {
        if (C0128.m5064() < 0) {
            return ((v0) obj).M;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۥۡۥ, reason: not valid java name and contains not printable characters */
    public static void m9688(Object obj, Object obj2, int i, int i2) {
        if (C0202.m8245() > 0) {
            ((a3) obj).o((s2) obj2, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۡ۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static void m9689(Object obj) {
        if (C0234.m9461() < 0) {
            ((sr) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۡۡۡ۠, reason: not valid java name and contains not printable characters */
    public static cj m9690() {
        if (C0116.m4340() >= 0) {
            return cj.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۢۢ, reason: not valid java name and contains not printable characters */
    public static n9.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m9691(Object obj) {
        if (C0227.m9046() > 0) {
            return ((c3.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۡۨ, reason: not valid java name and contains not printable characters */
    public static long m9692(Object obj) {
        if (C0097.m3659() > 0) {
            return ((pq) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢۦۧۤ, reason: not valid java name and contains not printable characters */
    public static void m9693(Object obj, Object obj2) {
        if (C0169.m7034() < 0) {
            ((xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).I((Bundle) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۧۥ۟, reason: not valid java name and contains not printable characters */
    public static int m9694(Object obj) {
        if (C0200.m8104() <= 0) {
            return ((WindowInsets) obj).getSystemWindowInsetLeft();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۨ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m9695(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0010.m354() <= 0) {
            return m4.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Resources) obj, (XmlPullParser) obj2, (AttributeSet) obj3, (Resources.Theme) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۧ۠, reason: not valid java name and contains not printable characters */
    public static int m9696(Object obj) {
        if (C0218.m8760() > 0) {
            return ((Fragment) obj).s;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤ۟۟۠, reason: not valid java name and contains not printable characters */
    public static Parcelable m9697(Object obj) {
        if (C0020.m701() >= 0) {
            return ((fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۦۥ, reason: not valid java name and contains not printable characters */
    public static f6 m9698(Object obj) {
        if (C0037.m1437() <= 0) {
            return f6.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۡۦ, reason: not valid java name and contains not printable characters */
    public static Drawable m9699(Object obj, int i) {
        if (C0133.m5208() <= 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۤۥ, reason: not valid java name and contains not printable characters */
    public static Drawable m9700(Object obj, int i) {
        if (C0122.m4736() < 0) {
            return ((zp) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۦۢ, reason: not valid java name and contains not printable characters */
    public static boolean m9701(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0040.m1622() < 0) {
            return ((KeyEvent) obj).dispatch((KeyEvent.Callback) obj2, (KeyEvent.DispatcherState) obj3, obj4);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۠ۢ, reason: contains not printable characters */
    public static float m9702(Object obj) {
        if (C0240.m9826() >= 0) {
            return ((MotionEvent) obj).getX();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۥۣۡۤ, reason: contains not printable characters */
    public static dn m9703(Object obj) {
        if (C0133.m5208() <= 0) {
            return ((dn) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۣ, reason: contains not printable characters */
    public static boolean m9704(Object obj, Object obj2, int i, int i2, boolean z) {
        if (C0078.m3044() < 0) {
            return xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((InputConnection) obj, (Editable) obj2, i, i2, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۧ۟ۡ, reason: contains not printable characters */
    public static o5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m9705(Object obj, int i) {
        if (C0011.m458() > 0) {
            return ((o5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۥۨ, reason: contains not printable characters */
    public static int m9706(Object obj) {
        if (C0068.m2650() > 0) {
            return ((Parcel) obj).dataSize();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۡۨۥ, reason: contains not printable characters */
    public static int m9707(Object obj) {
        if (C0002.m72() > 0) {
            return ((MediaExtractor) obj).getTrackCount();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۣۢۧ, reason: contains not printable characters */
    public static String m9708(Object obj) {
        if (C0096.m3601() < 0) {
            return q1.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۣ۠, reason: contains not printable characters */
    public static boolean m9709(Object obj, Object obj2) {
        if (C0162.m6837() < 0) {
            return ((String) obj).equalsIgnoreCase((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۨۤۧ, reason: contains not printable characters */
    public static e8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m9710(Object obj) {
        if (C0096.m3601() <= 0) {
            return ((e8) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۢۥ, reason: not valid java name and contains not printable characters */
    public static void m9711(Object obj) {
        if (C0009.m276() <= 0) {
            ((TextView) obj).requestLayout();
        }
    }

    /* JADX INFO: renamed from: ۣۧۤ۟, reason: not valid java name and contains not printable characters */
    public static int m9712(Object obj, int i) {
        if (C0064.m2388() >= 0) {
            return ((LayerDrawable) obj).getLayerWidth(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۤۥۥ, reason: not valid java name and contains not printable characters */
    public static int m9713() {
        if (C0227.m9046() >= 0) {
            return HookMain.mwidth;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۥ۠, reason: not valid java name and contains not printable characters */
    public static WindowInsets m9714(Object obj) {
        if (C0204.m8270() <= 0) {
            return ((WindowInsets.Builder) obj).build();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۣۢ, reason: not valid java name and contains not printable characters */
    public static Typeface.Builder m9715(Object obj, boolean z) {
        if (C0006.m169() <= 0) {
            return ((Typeface.Builder) obj).setItalic(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠۠۠, reason: not valid java name and contains not printable characters */
    public static JSONObject m9716(Object obj, Object obj2, double d) {
        if (C0031.m1148() < 0) {
            return ((JSONObject) obj).put((String) obj2, d);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۤۡ, reason: not valid java name and contains not printable characters */
    public static void m9717(Object obj, Object obj2) {
        if (C0049.m1767() < 0) {
            ((View) obj).getLocationInWindow((int[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣۨۢ, reason: not valid java name and contains not printable characters */
    public static Surface m9718() {
        if (C0026.m1047() >= 0) {
            return HookMain.c2_virtual_surface;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۣۡ, reason: not valid java name and contains not printable characters */
    public static int m9719(Object obj, int i, int i2) {
        if (C0011.m458() >= 0) {
            return ((zp) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۤ۟۟, reason: not valid java name and contains not printable characters */
    public static String m9660(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
