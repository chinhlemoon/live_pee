package androidx.lifecycle;

import android.app.Dialog;
import android.app.NotificationManager;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.graphics.drawable.C0009;
import android.support.v4.graphics.drawable.C0010;
import android.support.v4.graphics.drawable.C0011;
import android.text.SpannableString;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.widget.CheckedTextView;
import android.widget.EdgeEffect;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.activity.C0017;
import androidx.activity.C0020;
import androidx.annotation.C0024;
import androidx.appcompat.app.C0036;
import androidx.appcompat.app.C0037;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.widget.C0047;
import androidx.cardview.widget.C0049;
import androidx.core.graphics.drawable.C0064;
import androidx.core.graphics.drawable.C0065;
import androidx.core.widget.C0068;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0079;
import androidx.fragment.app.C0094;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0119;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0122;
import androidx.savedstate.C0123;
import androidx.savedstate.C0126;
import androidx.savedstate.C0127;
import androidx.versionedparcelable.C0133;
import androidx.versionedparcelable.C0135;
import com.example.vcam.C0141;
import com.example.vcam.HookMain;
import com.example.vcam.LicenseManager;
import com.example.vcam.Menu;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bt;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ep;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.g7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.im;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mi;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qi;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.te;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ue;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.up;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zq;
import java.io.ByteArrayOutputStream;
import java.net.Socket;
import java.util.Arrays;
import java.util.Locale;
import okhttp3.C0238;
import okhttp3.C0239;
import okhttp3.C0240;
import okhttp3.Credentials;
import okhttp3.HttpUrl;
import okhttp3.internal.C0227;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0195;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0232;
import okhttp3.logging.C0236;
import org.xmlpull.v1.XmlPullParser;
import retrofit2.converter.scalars.C0243;

/* JADX INFO: renamed from: androidx.lifecycle.ۡۨ۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0107 {

    /* JADX INFO: renamed from: ۟ۤۥۣۡ, reason: not valid java name and contains not printable characters */
    public static int f89 = -41;

    /* JADX INFO: renamed from: ۟۟۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static Handler m3882(Object obj) {
        if (C0079.m3072() <= 0) {
            return ((LicenseManager) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static int m3883() {
        return (-6) ^ C0113.f93;
    }

    /* JADX INFO: renamed from: ۟۟ۢۢۤ, reason: not valid java name and contains not printable characters */
    public static int m3884(Object obj) {
        if (C0195.m7914() >= 0) {
            return ((MotionEvent) obj).getAction();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۢۦۧ, reason: not valid java name and contains not printable characters */
    public static void m3885(Object obj, int i, Object obj2) {
        if (C0017.m627() > 0) {
            ((androidx.profileinstaller.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۥ۟ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m3886(Object obj) {
        if (C0149.m6476() <= 0) {
            return ((qq.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۥۦۦ, reason: not valid java name and contains not printable characters */
    public static int m3887(Object obj) {
        if (C0106.m3835() >= 0) {
            return ((n9.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static void m3888(Object obj, Object obj2, int i, int i2, int i3) {
        if (C0188.m7736() <= 0) {
            ((SpannableString) obj).setSpan(obj2, i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static void m3889(Object obj) {
        if (C0148.m6464() < 0) {
            ((Dialog) obj).dismiss();
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static String m3890(Object obj) {
        if (C0133.m5208() <= 0) {
            return ((TextPaint) obj).getFontVariationSettings();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Context m3891(Object obj) {
        if (C0236.m9615() >= 0) {
            return ((TextView) obj).getContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۢۥ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m3892(Object obj) {
        if (C0037.m1437() <= 0) {
            return ((TextView) obj).getCompoundDrawableTintList();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۥۧ, reason: not valid java name and contains not printable characters */
    public static void m3893(Object obj, int i) {
        if (C0182.m7528() < 0) {
            ((fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).setContentHeight(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۢۡۤ, reason: not valid java name and contains not printable characters */
    public static com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m3894(Object obj) {
        if (C0176.m7290() > 0) {
            return ((HookMain) obj).getProxyManager();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۧ, reason: not valid java name and contains not printable characters */
    public static long m3895(Object obj) {
        if (C0074.m2951() < 0) {
            return ((up) obj).deadlineNanoTime();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡۦۨۦ, reason: not valid java name and contains not printable characters */
    public static void m3896(Object obj, boolean z) {
        if (C0202.m8245() > 0) {
            ((u7) obj).c(z);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Socket m3897(Object obj) {
        if (C0079.m3072() <= 0) {
            return ((tn) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۥ, reason: not valid java name and contains not printable characters */
    public static boolean m3898(Object obj, Object obj2) {
        if (C0218.m8760() > 0) {
            return ((y4) obj).b((int[]) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static void m3899(Object obj, Object obj2) {
        if (C0162.m6837() < 0) {
            ((ImageButton) obj).setImageDrawable((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۢۥۧ, reason: not valid java name and contains not printable characters */
    public static q8 m3900() {
        if (C0240.m9826() > 0) {
            return q8.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۢ, reason: not valid java name and contains not printable characters */
    public static byte[] m3901(Object obj) {
        if (C0011.m458() >= 0) {
            return dl.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((g7) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۡۤ, reason: not valid java name and contains not printable characters */
    public static float m3902(Object obj, float f, float f2, float f3, float f4) {
        if (C0094.m3450() > 0) {
            return ((m2) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(f, f2, f3, f4);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static String m3903(Object obj, Object obj2) {
        if (C0120.m4608() > 0) {
            return Credentials.basic((String) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3904(Object obj) {
        if (C0169.m7034() < 0) {
            return ((uo.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠۠, reason: not valid java name and contains not printable characters */
    public static Parcelable.Creator m3905() {
        if (C0194.m7889() >= 0) {
            return Intent.CREATOR;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۥۥ, reason: not valid java name and contains not printable characters */
    public static void m3906(Object obj, Object obj2) {
        if (C0239.m9805() < 0) {
            HookMain.m5398((HookMain) obj);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static void m3907(Object obj, int i, int i2, int i3) {
        if (C0225.m9001() > 0) {
            Arrays.fill((int[]) obj, i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static void m3908(Object obj, Object obj2, int i) {
        if (C0238.m9653() > 0) {
            Menu.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj, (String) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static Interpolator m3909(Object obj) {
        if (C0074.m2951() <= 0) {
            return ((m2) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥ۟۟, reason: not valid java name and contains not printable characters */
    public static void m3910(Object obj) {
        if (C0017.m627() > 0) {
            ((fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e) obj).e();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۥۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3911(Object obj, int i, int i2, int i3, int i4) {
        if (C0011.m458() > 0) {
            return ((Rect) obj).intersect(i, i2, i3, i4);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۢۡ, reason: not valid java name and contains not printable characters */
    public static String[] m3912(Object obj) {
        if (m3883() >= 0) {
            return wr.q((View) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟۟, reason: not valid java name and contains not printable characters */
    public static Object m3913(Object obj) {
        if (C0215.m8604() <= 0) {
            return ((v0) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m3914(Object obj, Object obj2, Object obj3, boolean z, int i) {
        if (C0148.m6464() <= 0) {
            f6.q((f6) obj, (Runnable) obj2, (ep) obj3, z, i);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m3915(Object obj, Object obj2, Object obj3, boolean z, int i) {
        if (C0049.m1767() <= 0) {
            return lo.m((String) obj, (String) obj2, (String) obj3, z, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static lg m3916(Object obj) {
        if (C0047.m1663() <= 0) {
            return lg.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static View m3917(Object obj) {
        if (C0123.m4841() <= 0) {
            return ((vo) obj).getActionView();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۡ, reason: not valid java name and contains not printable characters */
    public static void m3918(Object obj, int i) {
        if (C0240.m9826() >= 0) {
            ((pr) obj).setAlpha(i);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥۦ, reason: not valid java name and contains not printable characters */
    public static void m3919(Object obj, Object obj2) {
        if (C0218.m8760() > 0) {
            ((q) obj).e((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤ۟, reason: not valid java name and contains not printable characters */
    public static long m3920(Object obj) {
        if (C0217.m8693() <= 0) {
            return ((qi.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۧۧۤ, reason: not valid java name and contains not printable characters */
    public static float m3921(Object obj) {
        if (C0024.m896() >= 0) {
            return x7.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((EdgeEffect) obj);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۥۡۡۦ, reason: not valid java name and contains not printable characters */
    public static void m3922(Object obj) {
        if (C0164.m6900() < 0) {
            ((j0.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۤۥۣ, reason: not valid java name and contains not printable characters */
    public static float m3923(Object obj) {
        if (C0009.m276() < 0) {
            return ((DisplayMetrics) obj).density;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۥۤۨۡ, reason: not valid java name and contains not printable characters */
    public static boolean m3924(Object obj, Object obj2) {
        if (C0240.m9826() >= 0) {
            return ((zq.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static boolean m3925(Object obj) {
        if (C0040.m1622() < 0) {
            return ((pr.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static int m3926(Object obj, Object obj2, int i, boolean z) {
        if (C0141.m5769() >= 0) {
            return mo.J((CharSequence) obj, (String) obj2, i, z);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۥۦ, reason: not valid java name and contains not printable characters */
    public static void m3927(Object obj) {
        if (C0182.m7528() <= 0) {
            ((rr) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۥۧ۠, reason: not valid java name and contains not printable characters */
    public static te m3928(Object obj) {
        if (C0117.m4419() <= 0) {
            return ue.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((fa) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static Menu m3929(Object obj) {
        if (C0181.m7445() >= 0) {
            return ((Menu.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡ۟, reason: not valid java name and contains not printable characters */
    public static void m3930(Object obj) {
        if (C0106.m3835() >= 0) {
            ((Drawable) obj).jumpToCurrentState();
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static String m3931(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۧۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3932(Object obj) {
        if (C0068.m2650() >= 0) {
            return ((r7) obj).a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m3933(Object obj, int i, Object obj2) {
        if (C0123.m4841() <= 0) {
            ((ResultReceiver) obj).send(i, (Bundle) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static String m3934(Object obj) {
        if (C0126.m4908() <= 0) {
            return ((a3) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۢۦ, reason: not valid java name and contains not printable characters */
    public static int m3935(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۠ۧۡۢ, reason: not valid java name and contains not printable characters */
    public static String m3936(Object obj) {
        if (C0113.m4144() <= 0) {
            return ((m6) obj).c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۠, reason: not valid java name and contains not printable characters */
    public static char m3937(char c) {
        if (C0161.m6744() > 0) {
            return Character.toUpperCase(c);
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: ۣۡۢۤ, reason: not valid java name and contains not printable characters */
    public static tf m3938(Object obj) {
        if (C0204.m8270() <= 0) {
            return ((tf) obj).d();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m3939(Object obj) {
        if (C0232.m9299() >= 0) {
            return ((r7) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۨۧ, reason: not valid java name and contains not printable characters */
    public static void m3940(Object obj, Object obj2) {
        if (C0135.m5274() < 0) {
            ((Throwable) obj).addSuppressed((Throwable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡۦۧۨ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.AccessibilityAction m3941() {
        if (C0064.m2388() > 0) {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۡ۟, reason: not valid java name and contains not printable characters */
    public static int m3942(Object obj) {
        if (C0010.m354() <= 0) {
            return ((NotificationManager) obj).getImportance();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۨۥۢ, reason: not valid java name and contains not printable characters */
    public static String m3943(Object obj) {
        if (C0036.m1332() <= 0) {
            return ((l2.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۧۢ, reason: not valid java name and contains not printable characters */
    public static boolean m3944(Object obj, Object obj2, int i, boolean z) {
        if (C0116.m4340() >= 0) {
            return lo.n((String) obj, (String) obj2, i, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢ۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static CharSequence m3945(Object obj, Object obj2) {
        if (C0214.m8575() <= 0) {
            return ((ClipData.Item) obj).coerceToStyledText((Context) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۦۣ, reason: not valid java name and contains not printable characters */
    public static Object m3946(Object obj) {
        if (C0181.m7445() > 0) {
            return ((bd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۡۡ, reason: not valid java name and contains not printable characters */
    public static void m3947(Object obj, int i, int i2) {
        if (C0232.m9299() > 0) {
            ((LayerDrawable) obj).setLayerInsetRight(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۢۨۡۨ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m3948(Object obj, float f) {
        if (C0078.m3044() <= 0) {
            return ((StringBuilder) obj).append(f);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m3949(Object obj, int i) {
        if (C0119.m4573() >= 0) {
            return im.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((im.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۥۦ, reason: not valid java name and contains not printable characters */
    public static void m3951(Object obj, Object obj2, Object obj3) {
        if (C0122.m4736() <= 0) {
            ((Path) obj).addPath((Path) obj2, (Matrix) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣۤۨۢ, reason: not valid java name and contains not printable characters */
    public static void m3952(Object obj, Object obj2) {
        if (C0171.m7136() <= 0) {
            ((bt) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Resources) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۦۥۡ, reason: not valid java name and contains not printable characters */
    public static void m3953(Object obj, Object obj2) {
        if (C0123.m4841() < 0) {
            ((TextView) obj).setTextLocale((Locale) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۨۡ, reason: not valid java name and contains not printable characters */
    public static int m3954(Object obj, long j, Object obj2, Object obj3) {
        if (C0243.m9964() >= 0) {
            return ((t8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(j, (t8.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2, (t8) obj3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۤۨۡ, reason: not valid java name and contains not printable characters */
    public static void m3955(int i) {
        if (C0127.m4950() >= 0) {
            System.exit(i);
        }
    }

    /* JADX INFO: renamed from: ۤۥۨ۟, reason: not valid java name and contains not printable characters */
    public static CharSequence m3956(Object obj) {
        if (C0078.m3044() < 0) {
            return ((uo.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤ۟ۡ, reason: contains not printable characters */
    public static dp m3957(Object obj) {
        if (C0200.m8104() < 0) {
            return ((f6.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).e();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۡۢ, reason: contains not printable characters */
    public static void m3958(Object obj) {
        if (C0202.m8245() > 0) {
            ((v7.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۦۢۦۣ, reason: contains not printable characters */
    public static boolean m3959(Object obj, Object obj2) {
        if (C0024.m896() > 0) {
            return ((Handler) obj).postAtFrontOfQueue((Runnable) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۤۦۦ, reason: contains not printable characters */
    public static void m3960(Object obj) {
        if (C0020.m701() > 0) {
            ((u8) obj).e0();
        }
    }

    /* JADX INFO: renamed from: ۦۦ, reason: contains not printable characters */
    public static void m3961(Object obj) {
        if (C0201.m8184() < 0) {
            ((s5) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۣۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static CheckedTextView m3962(Object obj) {
        if (C0236.m9615() >= 0) {
            return ((r0) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۥ۠, reason: not valid java name and contains not printable characters */
    public static Intent m3963(Object obj, Object obj2) {
        if (C0065.m2448() > 0) {
            return ((Intent) obj).setType((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۟۟, reason: not valid java name and contains not printable characters */
    public static int m3964(Object obj) {
        if (C0227.m9046() > 0) {
            return ((lg.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨۡ۠, reason: not valid java name and contains not printable characters */
    public static void m3965(Object obj, Object obj2) {
        if (C0024.m896() > 0) {
            ((mi) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((android.view.Menu) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۤۡ۠, reason: not valid java name and contains not printable characters */
    public static f2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m3966() {
        if (C0011.m458() >= 0) {
            return f2.Companion;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۣ۠, reason: not valid java name and contains not printable characters */
    public static String m3967(Object obj, Object obj2, Object obj3) {
        if (C0135.m5274() < 0) {
            return ((XmlPullParser) obj).getAttributeValue((String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۦۣ, reason: not valid java name and contains not printable characters */
    public static String m3950(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
