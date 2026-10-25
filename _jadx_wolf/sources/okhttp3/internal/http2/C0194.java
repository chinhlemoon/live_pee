package okhttp3.internal.http2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.graphics.drawable.C0011;
import android.text.TextWatcher;
import android.util.Size;
import android.view.ContentInfo;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EdgeEffect;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import androidx.activity.C0017;
import androidx.activity.C0020;
import androidx.activity.C0021;
import androidx.annotation.C0026;
import androidx.appcompat.app.C0034;
import androidx.appcompat.view.menu.C0039;
import androidx.appcompat.view.menu.C0040;
import androidx.core.app.C0051;
import androidx.core.app.C0052;
import androidx.core.app.C0053;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0066;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0070;
import androidx.emoji2.text.C0079;
import androidx.emoji2.text.C0084;
import androidx.lifecycle.C0107;
import androidx.lifecycle.C0108;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0118;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0126;
import androidx.versionedparcelable.C0129;
import androidx.versionedparcelable.C0133;
import com.example.vcam.C0141;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.HookMain;
import com.example.vcam.LicenseManager;
import com.example.vcam.Menu;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.b0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qi;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ti;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.us;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yh;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yo;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.C0238;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.internal.C0227;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0236;
import retrofit2.converter.scalars.C0243;

/* JADX INFO: renamed from: okhttp3.internal.http2.ۤۤۦ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0194 {

    /* JADX INFO: renamed from: ۥۤۢۡ, reason: contains not printable characters */
    public static int f644 = -755;

    /* JADX INFO: renamed from: ۣ۟۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static float m7827(Object obj) {
        if (C0161.m6744() > 0) {
            return ((EdgeEffect) obj).getDistance();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟۟ۥۣۡ, reason: not valid java name and contains not printable characters */
    public static Object m7828(Object obj, Object obj2) {
        if (C0108.m4038() > 0) {
            return ((e) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۦۧ, reason: not valid java name and contains not printable characters */
    public static int m7829(Object obj, long j, Object obj2) {
        if (C0117.m4419() < 0) {
            return ((t8) obj).q0(j, (t8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۥ۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m7830(Object obj, Object obj2, Object obj3) {
        if (C0204.m8270() <= 0) {
            y2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Bundle) obj, (String) obj2, (Size) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۧۥۥ, reason: not valid java name and contains not printable characters */
    public static CharSequence m7831(Object obj) {
        if (C0112.m4054() <= 0) {
            return ((uo.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m7832(Object obj) {
        if (C0211.m8341() >= 0) {
            return ((wr.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥ۠, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m7833() {
        if (C0117.m4419() < 0) {
            return PorterDuff.Mode.ADD;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static float m7834(Object obj) {
        if (C0164.m6900() < 0) {
            return ((l1) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤ۟, reason: not valid java name and contains not printable characters */
    public static int m7835() {
        if (C0187.m7613() > 0) {
            return View.generateViewId();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۢ, reason: not valid java name and contains not printable characters */
    public static void m7836(Object obj, Object obj2, int i, int i2, int i3) {
        if (C0020.m701() > 0) {
            ((TextWatcher) obj).onTextChanged((CharSequence) obj2, i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static long m7837(Object obj) {
        if (C0187.m7613() >= 0) {
            return ((qi.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static long m7838(Object obj) {
        if (C0236.m9615() > 0) {
            return ((m2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥۨ, reason: not valid java name and contains not printable characters */
    public static Object[] m7839(Object obj) {
        if (C0053.m1959() > 0) {
            return ((u1) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۣۤ, reason: not valid java name and contains not printable characters */
    public static void m7840(Object obj, Object obj2) {
        if (C0238.m9653() > 0) {
            ((Bundle) obj).putAll((Bundle) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static float m7841(Object obj) {
        if (C0051.m1783() < 0) {
            return ((us) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۥۤ, reason: not valid java name and contains not printable characters */
    public static boolean m7842(Object obj, int i) {
        if (C0011.m458() >= 0) {
            return ((Cursor) obj).moveToPosition(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۡۨ۟, reason: not valid java name and contains not printable characters */
    public static boolean m7843(Object obj) {
        if (C0052.m1890() > 0) {
            return ((uo.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۦ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m7844(Object obj, Object obj2) {
        if (C0238.m9653() >= 0) {
            ((xd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).j((Throwable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۨۡۧ, reason: not valid java name and contains not printable characters */
    public static Menu m7845(Object obj) {
        if (C0238.m9653() > 0) {
            return ((yh) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۨۤ, reason: not valid java name and contains not printable characters */
    public static uk.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.C0145x35d57e31 m7846(Object obj, int i) {
        if (C0217.m8693() <= 0) {
            return ((uk.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.C0145x35d57e31) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m7847(Object obj) {
        if (C0052.m1890() >= 0) {
            return ((f8) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static ContentInfo.Builder m7848(Object obj, int i) {
        if (C0225.m9001() > 0) {
            return ((ContentInfo.Builder) obj).setFlags(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static int m7849(Object obj) {
        if (C0020.m701() > 0) {
            return ((d1) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static String m7850(Object obj) {
        if (C0133.m5208() < 0) {
            return ((l2.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۥۦ, reason: not valid java name and contains not printable characters */
    public static Object m7851(Object obj) {
        if (C0079.m3072() < 0) {
            return ((k3) obj).k();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۧ, reason: not valid java name and contains not printable characters */
    public static boolean m7852() {
        if (C0040.m1622() < 0) {
            return HookMain.is_someone_playing;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m7853(Object obj, Object obj2) {
        if (C0040.m1622() < 0) {
            ((ImageButton) obj).setLayoutParams((ViewGroup.LayoutParams) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static void m7854() {
        if (C0120.m4608() >= 0) {
            lq.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۟ۧۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static Object m7855(Object obj) {
        if (C0238.m9653() >= 0) {
            return ((yo) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۢ, reason: not valid java name and contains not printable characters */
    public static Method m7856(Object obj) {
        if (C0051.m1783() <= 0) {
            return ((ti.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۧۥ, reason: not valid java name and contains not printable characters */
    public static int m7857(Object obj, float f, float f2) {
        if (C0181.m7445() >= 0) {
            return ((TextView) obj).getOffsetForPosition(f, f2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۨۤۥ, reason: not valid java name and contains not printable characters */
    public static boolean m7858(Object obj) {
        if (C0129.m5108() >= 0) {
            return ((v0) obj).K0();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static y5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m7859(Object obj, Object obj2) {
        if (C0058.m2184() >= 0) {
            return v5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((v5) obj, (y5.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۡۢ, reason: not valid java name and contains not printable characters */
    public static OnBackInvokedCallback m7860(Object obj) {
        if (C0126.m4908() <= 0) {
            return ((v0) obj).c0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۧۤ, reason: not valid java name and contains not printable characters */
    public static void m7861(Object obj, int i, Object obj2) {
        if (C0069.m2756() <= 0) {
            ((List) obj).add(i, obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۨۧ, reason: not valid java name and contains not printable characters */
    public static String m7862(Object obj) {
        if (C0243.m9964() > 0) {
            return ((Uri) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static a0.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m7863(Object obj, Object obj2, Object obj3) {
        if (C0084.m3253() <= 0) {
            return ((b0) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj2, (String[]) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m7864(Object obj) {
        if (C0200.m8104() <= 0) {
            return ((ActivityInfo) obj).configChanges;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۧۦۤ, reason: not valid java name and contains not printable characters */
    public static int m7865(Object obj) {
        if (C0021.m740() <= 0) {
            return ((ViewGroup.MarginLayoutParams) obj).getLayoutDirection();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m7866(Object obj, int i) {
        if (C0172.m7180() >= 0) {
            ((ViewGroup.MarginLayoutParams) obj).setLayoutDirection(i);
        }
    }

    /* JADX INFO: renamed from: ۣۢۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean m7867(Object obj, int i, Object obj2) {
        if (C0164.m6900() <= 0) {
            return ((android.view.Menu) obj).isShortcutKey(i, (KeyEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۡۦۣ, reason: not valid java name and contains not printable characters */
    public static pm m7868() {
        if (C0217.m8693() <= 0) {
            return pm.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۧ, reason: not valid java name and contains not printable characters */
    public static void m7869(Object obj, int i) {
        if (C0017.m627() > 0) {
            ((v0) obj).X(i);
        }
    }

    /* JADX INFO: renamed from: ۣۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static qq m7870(Object obj) {
        if (C0021.m740() <= 0) {
            return ((v0.h) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۤۥ, reason: not valid java name and contains not printable characters */
    public static long m7871(Object obj) {
        if (C0178.m7344() <= 0) {
            return ((Thread) obj).getId();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۢۨ, reason: not valid java name and contains not printable characters */
    public static void m7872(Object obj, Object obj2, float f) {
        if (C0107.m3883() > 0) {
            ((Outline) obj).setRoundRect((Rect) obj2, f);
        }
    }

    /* JADX INFO: renamed from: ۣۥۦ, reason: not valid java name and contains not printable characters */
    public static ThreadLocalRandom m7873() {
        if (C0120.m4608() >= 0) {
            return ThreadLocalRandom.current();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۧ۠, reason: not valid java name and contains not printable characters */
    public static void m7875(Object obj) {
        if (C0161.m6744() > 0) {
            ((p) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m7876(Object obj, Object obj2) {
        if (C0034.m1206() <= 0) {
            ((Window) obj).setBackgroundDrawable((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static ConnectionBlocker m7877(Object obj) {
        if (C0039.m1515() <= 0) {
            return ((ConnectionBlocker.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۦۢ, reason: not valid java name and contains not printable characters */
    public static int m7878(Object obj, int i) {
        if (C0058.m2184() >= 0) {
            return ((LayerDrawable) obj).getLayerInsetLeft(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۥۢ۠, reason: not valid java name and contains not printable characters */
    public static String m7879(String str) {
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

    /* JADX INFO: renamed from: ۤۨۧۨ, reason: not valid java name and contains not printable characters */
    public static int m7880(int i, int i2) {
        if (C0120.m4608() >= 0) {
            return Math.min(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static boolean m7881(Object obj) {
        if (C0118.m4454() > 0) {
            return ((LicenseManager) obj).r();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦ۟ۡ, reason: contains not printable characters */
    public static WeakReference m7882(Object obj) {
        if (C0236.m9615() > 0) {
            return ((k1.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۢ, reason: contains not printable characters */
    public static void m7883(Object obj, Object obj2) {
        if (C0191.m7812() > 0) {
            ((TextView) obj).setText((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۣۣۡ, reason: contains not printable characters */
    public static Locale m7884(Object obj) {
        if (C0187.m7613() > 0) {
            return ((f0) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۨ, reason: contains not printable characters */
    public static int m7885(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦۣ۠ۨ, reason: contains not printable characters */
    public static ContentInfo.Builder m7886(Object obj) {
        if (C0161.m6744() > 0) {
            return ((o5.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۦۤ, reason: contains not printable characters */
    public static gg m7887() {
        if (C0240.m9826() >= 0) {
            return n7.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۤۡ, reason: contains not printable characters */
    public static PorterDuffColorFilter m7888(Object obj, Object obj2, Object obj3) {
        if (C0017.m627() >= 0) {
            return ((qm) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ColorStateList) obj2, (PorterDuff.Mode) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧۨۤ, reason: contains not printable characters */
    public static int m7889() {
        return 682 ^ C0172.f622;
    }

    /* JADX INFO: renamed from: ۣۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m7890(Object obj, Object obj2) {
        if (C0227.m9046() >= 0) {
            ((LinearLayout) obj).setOnTouchListener((View.OnTouchListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧۢۥۦ, reason: not valid java name and contains not printable characters */
    public static List m7891(Object obj) {
        if (C0117.m4419() <= 0) {
            return l4.A((Iterable) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۧ۟, reason: not valid java name and contains not printable characters */
    public static void m7892(Object obj, Object obj2) {
        if (C0188.m7736() <= 0) {
            ((AtomicReference) obj).set(obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۨۢۧ, reason: not valid java name and contains not printable characters */
    public static Intent m7893(Object obj) {
        if (C0108.m4038() > 0) {
            return ((y) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m7894(Object obj, Object obj2) {
        if (C0066.m2514() > 0) {
            ((TextView) obj).setTypeface((Typeface) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۥۤۢ, reason: not valid java name and contains not printable characters */
    public static boolean m7895(Object obj, int i, Object obj2, int i2, int i3, boolean z) {
        if (C0141.m5769() > 0) {
            return mo.T((CharSequence) obj, i, (CharSequence) obj2, i2, i3, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۥۥ۠, reason: not valid java name and contains not printable characters */
    public static Class m7896(Object obj) {
        if (C0171.m7136() <= 0) {
            return ((Class) obj).getComponentType();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۦ۠, reason: not valid java name and contains not printable characters */
    public static int m7897(Object obj) {
        if (C0026.m1047() >= 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).r;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m7898(Object obj) {
        if (C0070.m2829() < 0) {
            return ((y4) obj).d();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨۤۢ, reason: not valid java name and contains not printable characters */
    public static String m7874(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
