package androidx.emoji2.text;

import android.animation.Keyframe;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.ActionBar;
import android.app.Activity;
import android.content.ContentUris;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.support.v4.app.C0002;
import android.support.v4.app.C0004;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0009;
import android.support.v4.graphics.drawable.C0011;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.widget.CompoundButton;
import android.window.BackEvent;
import androidx.activity.C0017;
import androidx.annotation.C0026;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0034;
import androidx.appcompat.app.C0035;
import androidx.appcompat.app.C0037;
import androidx.appcompat.view.menu.C0039;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0047;
import androidx.core.app.C0053;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0065;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0070;
import androidx.fragment.app.C0095;
import androidx.fragment.app.C0096;
import androidx.lifecycle.C0107;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0122;
import androidx.savedstate.C0126;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0129;
import androidx.versionedparcelable.C0133;
import androidx.versionedparcelable.C0135;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.Menu;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.b;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bt;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.c7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.g7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.js;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ol;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.w3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Set;
import java.util.WeakHashMap;
import okhttp3.HttpUrl;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0195;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.ws.C0224;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0233;
import okhttp3.logging.C0234;
import okhttp3.logging.C0235;
import retrofit2.C0259;

/* JADX INFO: renamed from: androidx.emoji2.text.۟ۡۡۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0079 {

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int f70 = -497;

    /* JADX INFO: renamed from: ۟۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static void m3060(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        if (C0194.m7889() >= 0) {
            ((k1) obj).q((Drawable) obj2, (Drawable) obj3, (Drawable) obj4, (Drawable) obj5, (Drawable) obj6, (Drawable) obj7);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۧۢۤ, reason: not valid java name and contains not printable characters */
    public static void m3061(Object obj) {
        if (C0112.m4054() < 0) {
            ((MediaPlayer) obj).release();
        }
    }

    /* JADX INFO: renamed from: ۟۟ۧۥ۟, reason: not valid java name and contains not printable characters */
    public static int m3062(Object obj) {
        if (C0031.m1148() < 0) {
            return ((m9.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static xp m3063(Object obj) {
        if (C0148.m6464() <= 0) {
            return ((k1) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m3064(Object obj) {
        if (m3072() < 0) {
            return ((ConnectionBlocker.NetworkLog) obj).blocked;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static Runnable m3065(Object obj) {
        if (C0122.m4736() <= 0) {
            return ((z9.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static Uri m3066(Object obj, long j) {
        if (C0133.m5208() < 0) {
            return ContentUris.withAppendedId((Uri) obj, j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۢ۠, reason: not valid java name and contains not printable characters */
    public static boolean m3067(Object obj) {
        if (C0004.m139() <= 0) {
            return ((b.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).hasPrevious();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦۡ, reason: not valid java name and contains not printable characters */
    public static void m3068(Object obj, Object obj2, Object obj3, boolean z) {
        if (C0225.m9001() > 0) {
            Menu.m5572((Menu) obj, (ConnectionBlocker.BlockRule) obj2, (CompoundButton) obj3, z);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۥۡۡ, reason: not valid java name and contains not printable characters */
    public static int m3069(Object obj, Object obj2, int i, int i2) {
        if (C0107.m3883() > 0) {
            return ((zr.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj2, i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۦۢۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3070(Object obj) {
        if (C0039.m1515() < 0) {
            return ((i) obj).p();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۧۡۧ, reason: not valid java name and contains not printable characters */
    public static void m3071(Object obj, Object obj2) throws IOException {
        if (C0234.m9461() <= 0) {
            dl.A((OutputStream) obj, (g7) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢ۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m3072() {
        return 21 ^ C0164.f614;
    }

    /* JADX INFO: renamed from: ۟ۢۢۤۤ, reason: not valid java name and contains not printable characters */
    public static View m3073(Object obj) {
        if (C0031.m1148() <= 0) {
            return ((js.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢۧ, reason: not valid java name and contains not printable characters */
    public static float m3074(Object obj) {
        if (C0011.m458() > 0) {
            return ((Keyframe) obj).getFraction();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۢۧۨ, reason: not valid java name and contains not printable characters */
    public static WeakHashMap m3075(Object obj) {
        if (C0128.m5064() < 0) {
            return ((qo) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨۨ, reason: not valid java name and contains not printable characters */
    public static String m3076(Object obj) {
        if (C0259.m10136() >= 0) {
            return ((l2.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟۟, reason: not valid java name and contains not printable characters */
    public static int m3077(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧ۟, reason: not valid java name and contains not printable characters */
    public static dn m3078(Object obj) {
        if (C0199.m7998() < 0) {
            return ((dn) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static int m3079(Object obj) {
        if (C0002.m72() >= 0) {
            return ((Rect) obj).bottom;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static Byte m3080(byte b) {
        if (C0234.m9461() <= 0) {
            return Byte.valueOf(b);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۣ۠, reason: not valid java name and contains not printable characters */
    public static boolean m3081(Object obj) {
        if (C0117.m4419() < 0) {
            return ((ArrayList) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3082(Object obj, Object obj2, int i, Object obj3) {
        if (C0182.m7528() < 0) {
            return ((Bitmap) obj).compress((Bitmap.CompressFormat) obj2, i, (OutputStream) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static ActionBar m3083(Object obj) {
        if (C0149.m6476() <= 0) {
            return ((Activity) obj).getActionBar();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤ۠۠, reason: not valid java name and contains not printable characters */
    public static int m3084(Object obj) {
        if (C0161.m6744() >= 0) {
            return ((ViewGroup.MarginLayoutParams) obj).leftMargin;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۨۡ, reason: not valid java name and contains not printable characters */
    public static int m3085(Object obj, Object obj2) {
        if (C0009.m276() < 0) {
            return ((n0) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((BackEvent) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۟ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m3086(Object obj) {
        if (C0135.m5274() < 0) {
            return C0172.m7206((t8) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۣۨۤ, reason: not valid java name and contains not printable characters */
    public static void m3087(Object obj) {
        if (C0204.m8270() < 0) {
            ((FileOutputStream) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۤ۠, reason: not valid java name and contains not printable characters */
    public static boolean m3088(Object obj) {
        if (C0006.m169() <= 0) {
            return ((u7) obj).d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۦۥۨ, reason: not valid java name and contains not printable characters */
    public static int m3089(Object obj, int i) {
        if (C0069.m2756() <= 0) {
            return ((f6.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).c(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۤ, reason: not valid java name and contains not printable characters */
    public static f2 m3090(Object obj) {
        if (C0113.m4144() <= 0) {
            return f2.m5962((f2) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۨۦ, reason: not valid java name and contains not printable characters */
    public static String m3091(Object obj) {
        if (C0053.m1959() >= 0) {
            return p6.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۧ۟, reason: not valid java name and contains not printable characters */
    public static void m3092(Object obj) {
        if (C0176.m7290() >= 0) {
            ((Thread) obj).interrupt();
        }
    }

    /* JADX INFO: renamed from: ۠۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static String m3093(Object obj) {
        if (C0126.m4908() <= 0) {
            return ((dm.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۤ۟, reason: not valid java name and contains not printable characters */
    public static void m3094(Object obj, Object obj2) {
        if (C0129.m5108() >= 0) {
            ((ValueAnimator) obj).setInterpolator((TimeInterpolator) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۦۦ, reason: not valid java name and contains not printable characters */
    public static byte[] m3095(Object obj) {
        if (C0195.m7914() >= 0) {
            return ((s2) obj).y();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۥۥ, reason: not valid java name and contains not printable characters */
    public static int[] m3096() {
        if (C0070.m2829() <= 0) {
            return ol.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static c7 m3097() {
        if (C0126.m4908() <= 0) {
            return v6.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static int m3098(int i, int i2) {
        if (C0065.m2448() > 0) {
            return Gravity.getAbsoluteGravity(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۢۤ, reason: not valid java name and contains not printable characters */
    public static void m3099(Object obj) {
        if (C0181.m7445() > 0) {
            ((CancellationSignal) obj).cancel();
        }
    }

    /* JADX INFO: renamed from: ۣۡۧۤ, reason: not valid java name and contains not printable characters */
    public static int m3100(Object obj) {
        if (C0026.m1047() >= 0) {
            return ((dm.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢ۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static String m3102(String str) {
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

    /* JADX INFO: renamed from: ۢۡۡ, reason: not valid java name and contains not printable characters */
    public static void m3103(Object obj, int i) {
        if (C0062.m2326() > 0) {
            ((v0) obj).p0(i);
        }
    }

    /* JADX INFO: renamed from: ۢۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static URLConnection m3104(Object obj) {
        if (C0120.m4608() > 0) {
            return ((URL) obj).openConnection();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۧۢ, reason: not valid java name and contains not printable characters */
    public static s2 m3105(Object obj) {
        if (C0235.m9535() < 0) {
            return ((s2) obj).t();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۥۣ, reason: not valid java name and contains not printable characters */
    public static CharSequence m3106(Object obj) {
        if (C0096.m3601() <= 0) {
            return ((EditorInfo) obj).hintText;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static long m3107(Object obj) {
        if (C0037.m1437() < 0) {
            return ((g7) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۡۤۦ, reason: not valid java name and contains not printable characters */
    public static int m3108(Object obj) {
        if (C0233.m9365() < 0) {
            return ((uk.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.C0145x35d57e31) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢۨ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.AccessibilityAction m3109() {
        if (C0035.m1268() < 0) {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۤۨ, reason: not valid java name and contains not printable characters */
    public static void m3110(Object obj, int i, Object obj2) {
        if (C0034.m1206() < 0) {
            ((ArrayList) obj).add(i, obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۦۨۧ, reason: not valid java name and contains not printable characters */
    public static pp.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m3111() {
        if (C0095.m3478() < 0) {
            return pp.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۧۦ, reason: not valid java name and contains not printable characters */
    public static int m3112(Object obj) {
        if (C0202.m8245() >= 0) {
            return ((rp) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨۥۧ, reason: not valid java name and contains not printable characters */
    public static Method[] m3113(Object obj) {
        if (C0017.m627() > 0) {
            return ((Class) obj).getMethods();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۤ۠, reason: contains not printable characters */
    public static void m3114(Object obj, boolean z) {
        if (C0107.m3883() > 0) {
            ((ConnectionBlocker) obj).s(z);
        }
    }

    /* JADX INFO: renamed from: ۥۡۤۢ, reason: contains not printable characters */
    public static boolean m3115(Object obj) {
        if (C0200.m8104() < 0) {
            return ((ActionBarContextView) obj).d();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۢۨۦ, reason: contains not printable characters */
    public static void m3116(Object obj, int i) {
        if (C0058.m2184() > 0) {
            ((f6.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
    }

    /* JADX INFO: renamed from: ۥۣۣۢ, reason: contains not printable characters */
    public static void m3117(Object obj, Object obj2) {
        if (C0017.m627() > 0) {
            ((w3) obj).j((Throwable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۥۥ۟, reason: contains not printable characters */
    public static tr m3118(Object obj, Object obj2, Object obj3) {
        if (C0224.m8861() <= 0) {
            return ((rr) obj).f((String) obj2, (rr) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۧۤ, reason: contains not printable characters */
    public static boolean m3119(Object obj, Object obj2, Object obj3) {
        if (C0224.m8861() <= 0) {
            return ((o9) obj).b((View) obj2, (MotionEvent) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣۨۤ, reason: contains not printable characters */
    public static void m3120(Object obj) {
        if (C0201.m8184() < 0) {
            ((l2) obj).s();
        }
    }

    /* JADX INFO: renamed from: ۦۢۢۨ, reason: contains not printable characters */
    public static void m3121(Object obj, Object obj2, Object obj3) {
        if (C0213.m8458() > 0) {
            ((h2) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj2, obj3);
        }
    }

    /* JADX INFO: renamed from: ۦۦ, reason: contains not printable characters */
    public static boolean m3122(Object obj) {
        if (C0062.m2326() > 0) {
            return ((r6) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۨ۟ۦ, reason: contains not printable characters */
    public static int m3123(Object obj, int i, long j) {
        if (C0233.m9365() <= 0) {
            return n5.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((long[]) obj, i, j);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۢۦۤ, reason: not valid java name and contains not printable characters */
    public static String[] m3124(Object obj, int i) {
        if (C0047.m1663() < 0) {
            return ((PackageManager) obj).getPackagesForUid(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۧۧ, reason: not valid java name and contains not printable characters */
    public static boolean m3125(Object obj) {
        if (C0062.m2326() >= 0) {
            return ((bt) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۨ۠, reason: not valid java name and contains not printable characters */
    public static boolean m3126(Object obj) {
        if (C0172.m7180() >= 0) {
            return ((m2) obj).k;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۨۡ۠, reason: not valid java name and contains not printable characters */
    public static Set m3127(Object obj) {
        if (C0218.m8760() >= 0) {
            return ((bs) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۧۥ, reason: not valid java name and contains not printable characters */
    public static void m3128(Object obj, Object obj2, Object obj3) {
        if (C0017.m627() >= 0) {
            ((Bundle) obj).putFloatArray((String) obj2, (float[]) obj3);
        }
    }

    /* JADX INFO: renamed from: ۡۥۣۥ, reason: not valid java name and contains not printable characters */
    public static String m3101(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
