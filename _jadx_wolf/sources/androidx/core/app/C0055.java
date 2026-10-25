package androidx.core.app;

import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.Image;
import android.media.MediaCodec;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.C0002;
import android.support.v4.app.C0004;
import android.support.v4.app.C0006;
import android.text.PrecomputedText;
import android.view.ActionProvider;
import android.view.ContentInfo;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ListView;
import android.widget.TextView;
import androidx.activity.C0014;
import androidx.activity.C0017;
import androidx.activity.C0021;
import androidx.annotation.C0023;
import androidx.annotation.C0024;
import androidx.appcompat.app.C0034;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.view.menu.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.core.content.C0057;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0066;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.drawerlayout.widget.C0070;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0078;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0095;
import androidx.fragment.app.C0096;
import androidx.fragment.app.C0099;
import androidx.fragment.app.a;
import androidx.lifecycle.C0107;
import androidx.lifecycle.C0108;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0118;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0123;
import androidx.savedstate.C0127;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0135;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.Menu;
import com.example.vcam.VideoToFrames;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ad;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.b4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ej;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ek;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.im;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ip;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ki;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ne;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ql;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ws;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z1;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Random;
import okhttp3.HttpUrl;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0199;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.ws.C0224;

/* JADX INFO: renamed from: androidx.core.app.ۢۦۥۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0055 {

    /* JADX INFO: renamed from: ۥۥ۠۠, reason: contains not printable characters */
    public static int f49 = -557;

    /* JADX INFO: renamed from: ۟۟ۥۧ۟, reason: not valid java name and contains not printable characters */
    public static View m2018(Object obj) {
        if (C0062.m2326() >= 0) {
            return ((ws) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧۨ۠, reason: not valid java name and contains not printable characters */
    public static float m2019(Object obj) {
        if (C0002.m72() > 0) {
            return ((MotionEvent) obj).getRawY();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟۠۠ۦۦ, reason: not valid java name and contains not printable characters */
    public static boolean m2020(Object obj, Object obj2) {
        if (C0078.m3044() < 0) {
            return ne.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Dialog) obj, (KeyEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۢۦۡ, reason: not valid java name and contains not printable characters */
    public static ActionProvider m2021(Object obj) {
        if (C0017.m627() > 0) {
            return ((ki.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static void m2022(Object obj, Object obj2) {
        if (C0178.m7344() <= 0) {
            ((qm) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ColorStateList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۢۧۨ, reason: not valid java name and contains not printable characters */
    public static e.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m2023(Object obj) {
        if (C0218.m8760() > 0) {
            return ((e.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Throwable m2024(Object obj, Object obj2) {
        if (C0116.m4340() > 0) {
            return e6.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Throwable) obj, (Throwable) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦ۠ۢ, reason: not valid java name and contains not printable characters */
    public static xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m2025(Object obj, int i) {
        if (C0095.m3478() <= 0) {
            return ((xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).K(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۥ, reason: not valid java name and contains not printable characters */
    public static Image m2026(Object obj, int i) {
        if (C0213.m8458() > 0) {
            return ((MediaCodec) obj).getOutputImage(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨ۠۠, reason: not valid java name and contains not printable characters */
    public static void m2027(Object obj, Object obj2, Object obj3, int i) {
        if (C0074.m2951() <= 0) {
            wr.b.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ViewParent) obj, (View) obj2, (View) obj3, i);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m2028(Object obj) {
        if (C0161.m6744() >= 0) {
            return ((fd) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static Object m2029(Object obj, Object obj2) {
        if (C0070.m2829() < 0) {
            return x4.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj, (t5) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۢ۠, reason: not valid java name and contains not printable characters */
    public static void m2030(Object obj, Object obj2) {
        if (C0123.m4841() < 0) {
            ((ip) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Bundle) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static hn m2031(Object obj, Object obj2, int i, boolean z, int i2, int i3) {
        if (C0023.m843() > 0) {
            return mo.R((CharSequence) obj, (char[]) obj2, i, z, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static xs m2032(Object obj, int i, int i2, int i3, int i4) {
        if (C0113.m4144() <= 0) {
            return ((xs.d) obj).a(i, i2, i3, i4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۥۥ, reason: not valid java name and contains not printable characters */
    public static lg m2033(Object obj) {
        if (C0006.m169() < 0) {
            return lg.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m2034(Object obj, int i) {
        if (C0194.m7889() > 0) {
            wr.B((View) obj, i);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧ۟, reason: not valid java name and contains not printable characters */
    public static void m2035(Object obj, Object obj2, Object obj3) {
        if (C0127.m4950() > 0) {
            ((VideoToFrames) obj).setSaveFrames((String) obj2, (ek) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static Object[] m2036(Object obj) {
        if (C0070.m2829() < 0) {
            return b4.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Collection) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static jk m2037(Object obj, Object obj2, int i) {
        if (C0034.m1206() < 0) {
            return ((mo.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((CharSequence) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۨۧ, reason: not valid java name and contains not printable characters */
    public static PrecomputedText.Params.Builder m2038(Object obj, int i) {
        if (C0099.m3752() <= 0) {
            return ((PrecomputedText.Params.Builder) obj).setHyphenationFrequency(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۥۧ, reason: not valid java name and contains not printable characters */
    public static String m2039(Object obj) {
        if (C0094.m3450() >= 0) {
            return ej.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Activity) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۣۨ, reason: not valid java name and contains not printable characters */
    public static LayoutInflater.Factory2 m2040(Object obj) {
        if (C0062.m2326() >= 0) {
            return ((a) obj).i0();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static void m2041(Object obj) {
        if (C0040.m1622() <= 0) {
            Menu.m5684((Menu) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Paint.Cap m2042(Object obj, int i, Object obj2) {
        if (C0107.m3883() > 0) {
            return ((pr.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, (Paint.Cap) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۥۦ, reason: not valid java name and contains not printable characters */
    public static boolean m2043(Object obj, Object obj2) {
        if (C0057.m2142() > 0) {
            return ((o8) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Void) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۥۧ۟, reason: not valid java name and contains not printable characters */
    public static void m2044(Object obj, int i) {
        if (C0096.m3601() < 0) {
            ((PrintWriter) obj).print(i);
        }
    }

    /* JADX INFO: renamed from: ۠ۢۦ۠, reason: not valid java name and contains not printable characters */
    public static rn m2045(Object obj) {
        if (C0199.m7998() <= 0) {
            return ((p2) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤ۠۟, reason: not valid java name and contains not printable characters */
    public static String m2046(String str) {
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
        while (length > 0) {
            byteArray[-1] = (byte) (byteArray[-1] ^ str2.charAt((-1) % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = HttpUrl.FRAGMENT_ENCODE_SET.length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۡ۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static boolean m2047(Object obj, Object obj2, Object obj3, int i) {
        if (C0117.m4419() < 0) {
            return ((xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).E((MenuItem) obj2, (androidx.appcompat.view.menu.a) obj3, i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static CharSequence m2048(Object obj, int i) {
        if (C0066.m2514() > 0) {
            return ((TypedArray) obj).getText(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۦۤ, reason: not valid java name and contains not printable characters */
    public static void m2049(Object obj, boolean z) {
        if (C0108.m4038() > 0) {
            ((MediaPlayer) obj).setLooping(z);
        }
    }

    /* JADX INFO: renamed from: ۢۦۡۤ, reason: not valid java name and contains not printable characters */
    public static void m2050(Object obj) {
        if (C0053.m1959() >= 0) {
            ((ContentLoadingProgressBar) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۢۨۥۧ, reason: not valid java name and contains not printable characters */
    public static void m2051(Object obj, int i, Object obj2, Object obj3) {
        if (C0127.m4950() > 0) {
            im.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((im.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj, i, (ColorStateList) obj2, (Resources.Theme) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static long m2052(Object obj) {
        if (C0021.m740() <= 0) {
            return ((r7) obj).e;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۧۧۡ, reason: not valid java name and contains not printable characters */
    public static void m2053(Object obj, Object obj2) {
        if (C0123.m4841() <= 0) {
            ((ws.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).j((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۢۥۧ, reason: not valid java name and contains not printable characters */
    public static int m2054() {
        return (-417) ^ C0164.f614;
    }

    /* JADX INFO: renamed from: ۤۥۨۢ, reason: not valid java name and contains not printable characters */
    public static androidx.lifecycle.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m2055() {
        if (C0135.m5274() <= 0) {
            return androidx.lifecycle.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.STARTED;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۣۨ, reason: not valid java name and contains not printable characters */
    public static void m2056(Object obj, Object obj2) {
        if (C0014.m545() >= 0) {
            wr.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.g((ViewTreeObserver) obj, (ViewTreeObserver.OnGlobalLayoutListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۨۧۡ, reason: not valid java name and contains not printable characters */
    public static int m2057(Object obj) {
        if (C0120.m4608() >= 0) {
            return ((Random) obj).nextInt();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۣ۠ۤ, reason: contains not printable characters */
    public static boolean m2058(Object obj) {
        if (C0135.m5274() <= 0) {
            return ((v0) obj).D;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۥۥۢ, reason: contains not printable characters */
    public static boolean m2059(Object obj) {
        if (C0135.m5274() <= 0) {
            return Menu.m5641((ConnectionBlocker.NetworkLog) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۦۤۦ, reason: contains not printable characters */
    public static void m2060(Object obj, Object obj2) {
        if (C0004.m139() <= 0) {
            ((u7) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Canvas) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۧ۟ۤ, reason: contains not printable characters */
    public static int m2061(Object obj, int i, int i2) {
        if (C0021.m740() <= 0) {
            return ((TypedArray) obj).getInt(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۨۦ۟, reason: contains not printable characters */
    public static int m2062(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦۢۨۢ, reason: contains not printable characters */
    public static void m2063(Object obj, Object obj2) {
        if (C0006.m169() < 0) {
            ((k3) obj).r((Throwable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۣۧۡ, reason: contains not printable characters */
    public static TextView m2064(Object obj) {
        if (C0024.m896() > 0) {
            return ((kp.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m2065(Object obj) {
        if (C0224.m8861() <= 0) {
            return ((ListView) obj).getDividerHeight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۥۣۧ, reason: not valid java name and contains not printable characters */
    public static int m2067(Object obj, Object obj2, Object obj3) {
        if (C0118.m4454() > 0) {
            return ((AppOpsManager) obj).noteProxyOpNoThrow((String) obj2, (String) obj3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۦۦۣ, reason: not valid java name and contains not printable characters */
    public static boolean m2068(Object obj, Object obj2, int i, Object obj3) {
        if (C0188.m7736() <= 0) {
            return ad.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj, (bd) obj2, i, (Bundle) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۦۨۦ, reason: not valid java name and contains not printable characters */
    public static Runnable m2069(Object obj) {
        if (C0176.m7290() > 0) {
            return ((bk) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۨ۠, reason: not valid java name and contains not printable characters */
    public static boolean m2070(Object obj) {
        if (C0128.m5064() <= 0) {
            return ((View) obj).hasFocus();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۡۧ۟, reason: not valid java name and contains not printable characters */
    public static int m2071(Object obj) {
        if (C0099.m3752() <= 0) {
            return ((ContentInfo) obj).getFlags();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۤۤۨ, reason: not valid java name and contains not printable characters */
    public static boolean m2072(Object obj, Object obj2) {
        if (C0181.m7445() >= 0) {
            return ((z1) obj).remove(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۦۤۦ, reason: not valid java name and contains not printable characters */
    public static int[] m2073() {
        if (C0094.m3450() >= 0) {
            return ql.t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۧۡ, reason: not valid java name and contains not printable characters */
    public static String m2066(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
