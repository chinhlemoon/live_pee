package okhttp3.logging;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PathMeasure;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.os.Bundle;
import android.support.v4.app.C0004;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0009;
import android.text.Editable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.EdgeEffect;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.activity.C0014;
import androidx.activity.C0017;
import androidx.annotation.C0026;
import androidx.appcompat.app.C0034;
import androidx.appcompat.app.C0035;
import androidx.appcompat.view.menu.C0039;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.view.menu.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.C0047;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0064;
import androidx.core.graphics.drawable.C0065;
import androidx.core.widget.C0068;
import androidx.drawerlayout.widget.C0072;
import androidx.emoji2.text.C0079;
import androidx.fragment.app.C0095;
import androidx.fragment.app.C0097;
import androidx.fragment.app.C0099;
import androidx.lifecycle.C0106;
import androidx.lifecycle.C0107;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0118;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0122;
import androidx.savedstate.C0123;
import androidx.savedstate.C0127;
import androidx.versionedparcelable.C0129;
import androidx.versionedparcelable.C0133;
import androidx.versionedparcelable.C0135;
import com.example.vcam.C0141;
import com.example.vcam.HookMain;
import com.example.vcam.MainActivity;
import com.example.vcam.Menu;
import com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.aa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.b8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.da;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dt;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.im;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.iq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ml;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.w1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Timer;
import okhttp3.C0238;
import okhttp3.HttpUrl;
import okhttp3.internal.C0227;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.publicsuffix.C0219;
import org.xmlpull.v1.XmlPullParser;
import retrofit2.converter.scalars.C0243;

/* JADX INFO: renamed from: okhttp3.logging.۟ۤ۟ۥۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0232 {

    /* JADX INFO: renamed from: ۣ۟ۥۡۥ, reason: not valid java name and contains not printable characters */
    public static int f682 = 364;

    /* JADX INFO: renamed from: ۟۟۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static Drawable m9271(Object obj, Object obj2, int i) {
        if (C0123.m4841() < 0) {
            return ((hm) obj).b((Context) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟۠۠, reason: not valid java name and contains not printable characters */
    public static int m9272(int i, Object obj) {
        if (C0035.m1268() < 0) {
            return TypedValue.complexToDimensionPixelSize(i, (DisplayMetrics) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static void m9273(Object obj, int i, int i2, int i3, int i4) {
        if (C0191.m7812() > 0) {
            ((TextView) obj).setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۨۤۡ, reason: not valid java name and contains not printable characters */
    public static Timer m9274(Object obj) {
        if (C0164.m6900() <= 0) {
            return ((HookMain) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static m2 m9275(Object obj, float f, float f2) {
        if (C0047.m1663() < 0) {
            return ((m2) obj).l(f, f2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m9276(Object obj) {
        if (C0120.m4608() >= 0) {
            return ((Configuration) obj).colorMode;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m9277(Object obj) {
        if (C0106.m3835() > 0) {
            return ((iq) obj).d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۧۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m9278(Object obj, boolean z) {
        if (C0236.m9615() >= 0) {
            return zo.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۨۦۦ, reason: not valid java name and contains not printable characters */
    public static void m9279(Object obj, Object obj2, int i) {
        if (C0164.m6900() <= 0) {
            v.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Activity) obj, (String[]) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۟۠۟, reason: not valid java name and contains not printable characters */
    public static void m9280(Object obj, Object obj2) {
        if (C0243.m9964() >= 0) {
            ((wd) obj).l((xd) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m9281(Object obj) {
        if (C0006.m169() < 0) {
            return ((WindowInsets) obj).getSystemWindowInsetBottom();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static void m9282(Object obj, int i) {
        if (C0164.m6900() <= 0) {
            ((rr) obj).o(i);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean m9283(Object obj, int i) {
        if (C0227.m9046() > 0) {
            return im.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Resources) obj, i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۥۦۥ, reason: not valid java name and contains not printable characters */
    public static View.AccessibilityDelegate m9284(Object obj) {
        if (C0117.m4419() < 0) {
            return wr.e((View) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static a6 m9285() {
        if (C0097.m3659() > 0) {
            return n7.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۥۤ, reason: not valid java name and contains not printable characters */
    public static void m9286(Object obj, int i) {
        if (C0148.m6464() < 0) {
            kp.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TextView) obj, i);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۢۥ۠, reason: not valid java name and contains not printable characters */
    public static ViewGroup m9287(Object obj) {
        if (C0217.m8693() <= 0) {
            return ((v0) obj).w;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m9288(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧ۟, reason: not valid java name and contains not printable characters */
    public static void m9289(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        if (C0219.m8794() > 0) {
            ((View) obj).saveAttributeDataForStyleable((Context) obj2, (int[]) obj3, (AttributeSet) obj4, (TypedArray) obj5, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۧۡۤ, reason: not valid java name and contains not printable characters */
    public static void m9291(Object obj) {
        if (C0117.m4419() < 0) {
            ((HookMain) obj).stopVideoSwitchTimer();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨ۟, reason: not valid java name and contains not printable characters */
    public static void m9292(Object obj) {
        if (C0079.m3072() <= 0) {
            ((rn) obj).clear();
        }
    }

    /* JADX INFO: renamed from: ۟ۢۨۤۡ, reason: not valid java name and contains not printable characters */
    public static xs m9293(Object obj) {
        if (C0122.m4736() <= 0) {
            return ((xs.d) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static int[] m9294() {
        if (C0133.m5208() < 0) {
            return ml.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static byte[] m9295(Object obj) {
        if (C0116.m4340() > 0) {
            return ((a3) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m9296(Object obj) {
        if (C0035.m1268() <= 0) {
            return ((o9) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۧۥ, reason: not valid java name and contains not printable characters */
    public static void m9297(Object obj) {
        if (C0099.m3752() < 0) {
            HookMain.m5396((HookMain) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static void m9298(Object obj) {
        if (C0141.m5769() >= 0) {
            ((MainActivity) obj).e0();
        }
    }

    /* JADX INFO: renamed from: ۟ۤۦ۠۠, reason: not valid java name and contains not printable characters */
    public static int m9299() {
        return (-93) ^ C0127.f106;
    }

    /* JADX INFO: renamed from: ۟ۤۨ۠ۦ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m9300(Object obj) {
        if (C0120.m4608() > 0) {
            return ((dt) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨ۟, reason: not valid java name and contains not printable characters */
    public static ArrayList m9301(Object obj) {
        if (C0201.m8184() <= 0) {
            return ((aa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۥۢ, reason: not valid java name and contains not printable characters */
    public static int m9302(Object obj) {
        if (C0062.m2326() >= 0) {
            return ((MediaCodec.BufferInfo) obj).flags;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۨۦ, reason: not valid java name and contains not printable characters */
    public static int m9303(Object obj) {
        if (C0095.m3478() <= 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۡۥ, reason: not valid java name and contains not printable characters */
    public static void m9304(Object obj, long j) {
        if (C0204.m8270() < 0) {
            ((vl) obj).z(j);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۨۥ۟, reason: not valid java name and contains not printable characters */
    public static s2 m9305(Object obj, Object obj2) {
        if (C0218.m8760() > 0) {
            return ((s2) obj).h0((byte[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۥۥ, reason: not valid java name and contains not printable characters */
    public static void m9306(Object obj) {
        if (C0218.m8760() > 0) {
            ((dn) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۤۤ۠, reason: not valid java name and contains not printable characters */
    public static void m9307(Object obj, Object obj2, int i) {
        if (C0068.m2650() >= 0) {
            ((zr) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۧۢۨ, reason: not valid java name and contains not printable characters */
    public static TypedValue m9308(Object obj, Object obj2, Object obj3, int i) {
        if (C0122.m4736() <= 0) {
            return sq.d((TypedArray) obj, (XmlPullParser) obj2, (String) obj3, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۡۨ, reason: not valid java name and contains not printable characters */
    public static String m9309(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۧۥۦ, reason: not valid java name and contains not printable characters */
    public static int m9310(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (C0009.m276() <= 0) {
            return ((j0) obj).i((Context) obj2, (Resources) obj3, (XmlPullParser) obj4, (AttributeSet) obj5, (Resources.Theme) obj6);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۧۧۤ, reason: not valid java name and contains not printable characters */
    public static Object m9311(Object obj, Object obj2) {
        if (C0040.m1622() < 0) {
            return q1.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj, (Class) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۡۨ, reason: not valid java name and contains not printable characters */
    public static Menu m9312(Object obj) {
        if (C0217.m8693() < 0) {
            return ((Menu.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۦۧ, reason: not valid java name and contains not printable characters */
    public static Runnable m9313(Object obj) {
        if (C0064.m2388() > 0) {
            return ((iq) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۡۡ, reason: not valid java name and contains not printable characters */
    public static long m9314(long j, long j2) {
        if (C0217.m8693() <= 0) {
            return tl.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(j, j2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۢۥ۟, reason: not valid java name and contains not printable characters */
    public static boolean m9315(int i) {
        if (C0129.m5108() >= 0) {
            return m7.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۥۧۤ, reason: not valid java name and contains not printable characters */
    public static void m9316(Object obj, int i) {
        if (C0161.m6744() > 0) {
            ((s6) obj).l(i);
        }
    }

    /* JADX INFO: renamed from: ۡۦۡۤ, reason: not valid java name and contains not printable characters */
    public static float m9317(Object obj) {
        if (C0238.m9653() >= 0) {
            return ((TextView) obj).getLineSpacingExtra();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۢ۟ۦۡ, reason: not valid java name and contains not printable characters */
    public static Iterator m9318(Object obj) {
        if (C0004.m139() < 0) {
            return w1.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Object[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static un m9319(Object obj) {
        if (C0227.m9046() > 0) {
            return ((vl) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static void m9320(Object obj, Object obj2) {
        if (C0117.m4419() <= 0) {
            ((xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).H((Bundle) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۢۢ۟, reason: not valid java name and contains not printable characters */
    public static Class m9321(Object obj) {
        if (C0065.m2448() >= 0) {
            return ((vn) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۤ۠, reason: not valid java name and contains not printable characters */
    public static Class m9322() {
        if (C0034.m1206() <= 0) {
            return b8.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨ۟۠, reason: not valid java name and contains not printable characters */
    public static EdgeEffect m9323(Object obj, Object obj2) {
        if (C0129.m5108() >= 0) {
            return x7.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj, (AttributeSet) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static void m9324(Object obj) {
        if (C0161.m6744() >= 0) {
            ((TextView) obj).beginBatchEdit();
        }
    }

    /* JADX INFO: renamed from: ۣۣۢ۟, reason: not valid java name and contains not printable characters */
    public static void m9325(Object obj, Object obj2) {
        if (C0014.m545() >= 0) {
            Menu.m5574((Menu) obj, (View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۦۣ۟, reason: not valid java name and contains not printable characters */
    public static AppCompatCheckBox m9326(Object obj, Object obj2, Object obj3) {
        if (C0064.m2388() >= 0) {
            return ((m1) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj2, (AttributeSet) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۦۡ, reason: not valid java name and contains not printable characters */
    public static void m9327(Object obj) {
        if (C0194.m7889() > 0) {
            ((da) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۤۤۥۧ, reason: not valid java name and contains not printable characters */
    public static zp m9328(Object obj, Object obj2, Object obj3, int i, int i2) {
        if (C0112.m4054() <= 0) {
            return zp.m((Context) obj, (AttributeSet) obj2, (int[]) obj3, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۢۨ, reason: not valid java name and contains not printable characters */
    public static q m9329(Object obj, Object obj2) {
        if (C0118.m4454() > 0) {
            return ((v0) obj).L0((q.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static void m9330(Object obj) {
        if (C0107.m3883() >= 0) {
            ((Drawable) obj).clearColorFilter();
        }
    }

    /* JADX INFO: renamed from: ۥۢ۟۠, reason: contains not printable characters */
    public static Context m9331(Object obj) {
        if (C0178.m7344() <= 0) {
            return ((ProgressBar) obj).getContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۦۦ, reason: contains not printable characters */
    public static hd m9332() {
        if (C0064.m2388() > 0) {
            return C0072.m2844();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۧ, reason: contains not printable characters */
    public static void m9333(Object obj) {
        if (C0035.m1268() < 0) {
            jd.i((String) obj);
        }
    }

    /* JADX INFO: renamed from: ۦ۟ۧۥ, reason: contains not printable characters */
    public static int m9334(Object obj) {
        if (C0017.m627() > 0) {
            return ((View) obj).getPaddingBottom();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦ۠ۤ۠, reason: contains not printable characters */
    public static boolean m9335(Object obj, Object obj2) {
        if (C0213.m8458() > 0) {
            return ((Configuration) obj).equals((Configuration) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۥ۠, reason: contains not printable characters */
    public static Object m9336(Object obj, Object obj2) {
        if (C0135.m5274() < 0) {
            return ((xd) obj).C(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۥۡ, reason: contains not printable characters */
    public static Editable.Factory m9337() {
        if (C0191.m7812() >= 0) {
            return b8.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۠, reason: not valid java name and contains not printable characters */
    public static void m9338(Object obj, int i, int i2) {
        if (C0129.m5108() > 0) {
            ((pr.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).b(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۧۨۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean m9339(Object obj, float f, Object obj2, Object obj3) {
        if (C0039.m1515() < 0) {
            return ((PathMeasure) obj).getPosTan(f, (float[]) obj2, (float[]) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m9340(Object obj, float f, float f2) {
        if (C0014.m545() >= 0) {
            ((Canvas) obj).scale(f, f2);
        }
    }

    /* JADX INFO: renamed from: ۨۡۤۡ, reason: not valid java name and contains not printable characters */
    public static int m9341(Object obj) {
        if (C0211.m8341() >= 0) {
            return ((xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۤۢۢ, reason: not valid java name and contains not printable characters */
    public static void m9342(Object obj, Object obj2) {
        if (C0026.m1047() >= 0) {
            ((PopupWindow) obj).setBackgroundDrawable((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۦۦۡ, reason: not valid java name and contains not printable characters */
    public static WindowInsets m9343(Object obj) {
        if (C0211.m8341() >= 0) {
            return ((xs) obj).i();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m9290(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
