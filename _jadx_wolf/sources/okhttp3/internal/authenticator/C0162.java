package okhttp3.internal.authenticator;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.app.C0004;
import android.support.v4.graphics.drawable.C0010;
import android.support.v4.graphics.drawable.C0011;
import android.text.Editable;
import android.text.Spannable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.EdgeEffect;
import android.widget.TextView;
import androidx.activity.C0020;
import androidx.activity.C0021;
import androidx.annotation.C0023;
import androidx.annotation.C0024;
import androidx.annotation.C0025;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.widget.C0047;
import androidx.core.app.C0055;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0066;
import androidx.drawerlayout.widget.C0070;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0084;
import androidx.fragment.app.C0095;
import androidx.fragment.app.C0097;
import androidx.fragment.app.a;
import androidx.lifecycle.C0106;
import androidx.lifecycle.C0107;
import androidx.lifecycle.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0123;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0133;
import com.example.vcam.HookMain;
import com.example.vcam.MainActivity;
import com.example.vcam.Menu;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ar;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ek;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.em;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.g8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.im;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ks;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ws;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import okhttp3.C0238;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.internal.C0227;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.logging.C0233;
import okhttp3.logging.C0234;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: okhttp3.internal.authenticator.ۧۥۡ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0162 {

    /* JADX INFO: renamed from: ۦۧۡ, reason: contains not printable characters */
    public static int f612 = -901;

    /* JADX INFO: renamed from: ۣ۟۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static Collection m6808(Object obj, Object obj2) {
        if (C0178.m7344() < 0) {
            return d2.g((Object[]) obj, (Collection) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static List m6809(Object obj) {
        if (C0219.m8794() >= 0) {
            return d4.b((Object[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m6810(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨۦ, reason: not valid java name and contains not printable characters */
    public static void m6811(Object obj, int i) {
        if (C0011.m458() >= 0) {
            ((TextView) obj).setHyphenationFrequency(i);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m6812(Object obj) {
        if (C0219.m8794() > 0) {
            return ((Rect) obj).width();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۤۨ۠, reason: not valid java name and contains not printable characters */
    public static void m6813(Object obj, int i, int i2) {
        if (C0211.m8341() > 0) {
            ((pr.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m6814(Object obj) {
        if (C0233.m9365() <= 0) {
            return ((sm) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static void m6815(Object obj) {
        if (C0188.m7736() < 0) {
            ((q) obj).c();
        }
    }

    /* JADX INFO: renamed from: ۟ۢۤ۠۠, reason: not valid java name and contains not printable characters */
    public static v3 m6816(Object obj) {
        if (m6837() <= 0) {
            return ((xd) obj).u();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m6817(Object obj) {
        if (C0123.m4841() < 0) {
            return ((v2) obj).E();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m6818(Object obj, Object obj2) {
        if (C0078.m3044() < 0) {
            return ((Queue) obj).add(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۠۟, reason: not valid java name and contains not printable characters */
    public static void m6819(Object obj, float f, boolean z, boolean z2) {
        if (C0095.m3478() <= 0) {
            ((qm) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(f, z, z2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static l2 m6820(Object obj) {
        if (C0023.m843() >= 0) {
            return ((k2) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣ۟, reason: not valid java name and contains not printable characters */
    public static boolean m6821(Object obj, Object obj2) {
        if (C0084.m3253() <= 0) {
            return ar.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((File) obj, (InputStream) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۡۤ, reason: not valid java name and contains not printable characters */
    public static long m6822(Object obj) {
        if (C0074.m2951() < 0) {
            return ((gc) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static a3[] m6823(Object obj) {
        if (C0240.m9826() > 0) {
            return ((dk) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۥۡ, reason: not valid java name and contains not printable characters */
    public static y5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m6824(Object obj, Object obj2) {
        if (C0095.m3478() < 0) {
            return rd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((rd) obj, (y5.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static Collection m6825(Object obj) {
        if (C0021.m740() < 0) {
            return ((lg) obj).f();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static Uri.Builder m6826(Object obj, Object obj2, Object obj3) {
        if (C0204.m8270() <= 0) {
            return ((Uri.Builder) obj).appendQueryParameter((String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۥ, reason: not valid java name and contains not printable characters */
    public static boolean m6827(Object obj, Object obj2) {
        if (C0128.m5064() <= 0) {
            return ((MainActivity) obj).c0((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۤۨۨ, reason: not valid java name and contains not printable characters */
    public static Menu m6828(Object obj) {
        if (C0113.m4144() < 0) {
            return ((wg) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m6829(Object obj, Object obj2, int i, Object obj3) {
        if (C0215.m8604() <= 0) {
            return ((e8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Editable) obj2, i, (KeyEvent) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۢۢۡ, reason: not valid java name and contains not printable characters */
    public static int m6830(Object obj) {
        if (C0238.m9653() >= 0) {
            return ((pr.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۤۦ۠, reason: not valid java name and contains not printable characters */
    public static void m6831(Object obj) {
        if (C0215.m8604() < 0) {
            p1.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۧۥۧ, reason: not valid java name and contains not printable characters */
    public static String m6832() {
        if (C0040.m1622() <= 0) {
            return HookMain.video_path;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m6833(Object obj) {
        if (C0055.m2054() >= 0) {
            return ((ks.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۡۡۧ, reason: not valid java name and contains not printable characters */
    public static ek m6835() {
        if (C0215.m8604() <= 0) {
            return ek.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۢۢ, reason: not valid java name and contains not printable characters */
    public static Object m6836(Object obj, int i) {
        if (C0024.m896() > 0) {
            return ((em) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦۦ, reason: not valid java name and contains not printable characters */
    public static int m6837() {
        return (-920) ^ C0058.f52;
    }

    /* JADX INFO: renamed from: ۟ۧۧۧ۟, reason: not valid java name and contains not printable characters */
    public static void m6838(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0097.m3659() >= 0) {
            ((pr.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Resources) obj2, (AttributeSet) obj3, (Resources.Theme) obj4, (XmlPullParser) obj5);
        }
    }

    /* JADX INFO: renamed from: ۟ۨۤۥ, reason: not valid java name and contains not printable characters */
    public static boolean m6839(Object obj) {
        if (C0058.m2184() > 0) {
            return ((ViewTreeObserver) obj).isAlive();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m6840(String str) {
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

    /* JADX INFO: renamed from: ۠ۡۤ۟, reason: not valid java name and contains not printable characters */
    public static int m6841(Object obj) {
        if (C0025.m934() >= 0) {
            return q7.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Drawable) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۢۨۡ, reason: not valid java name and contains not printable characters */
    public static float m6842(Object obj, float f, float f2) {
        if (C0020.m701() > 0) {
            return x7.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((EdgeEffect) obj, f, f2);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static boolean m6843(Object obj) {
        if (C0106.m3835() > 0) {
            return ((View) obj).hasNestedScrollingParent();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m6844(Object obj) {
        if (C0201.m8184() <= 0) {
            return ((ws) obj).B();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۡۢۨ, reason: not valid java name and contains not printable characters */
    public static dn m6845(Object obj, Object obj2) {
        if (C0133.m5208() < 0) {
            return ((dn) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((dn) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۥ, reason: not valid java name and contains not printable characters */
    public static f8 m6846(Object obj) {
        if (C0169.m7034() < 0) {
            return ((g8) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤ۠۠, reason: not valid java name and contains not printable characters */
    public static Method m6847() {
        if (C0133.m5208() < 0) {
            return im.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۤۤ, reason: not valid java name and contains not printable characters */
    public static MenuItem m6848(Object obj, Object obj2) {
        if (C0097.m3659() > 0) {
            return ((MenuItem) obj).setIconTintMode((PorterDuff.Mode) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۨۥ, reason: not valid java name and contains not printable characters */
    public static Typeface m6849(Object obj, int i, Object obj2, int i2, Object obj3) {
        if (C0172.m7180() >= 0) {
            return im.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj, i, (TypedValue) obj2, i2, (im.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۧ, reason: not valid java name and contains not printable characters */
    public static void m6850(Object obj, Object obj2) {
        if (C0078.m3044() < 0) {
            ((ViewGroup) obj).addView((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۢۤۥ, reason: not valid java name and contains not printable characters */
    public static boolean m6851(Object obj, int i) {
        if (C0116.m4340() > 0) {
            return ((m2) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۧۦۨ, reason: not valid java name and contains not printable characters */
    public static h6 m6852(Object obj) {
        if (C0227.m9046() >= 0) {
            return ((h6) obj).getCallerFrame();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static void m6853(Object obj, Object obj2) {
        if (C0191.m7812() > 0) {
            ((a) obj).y((android.view.Menu) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۡۥ۠, reason: not valid java name and contains not printable characters */
    public static Object m6854() {
        if (C0214.m8575() < 0) {
            return vq.c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۥۨ, reason: not valid java name and contains not printable characters */
    public static Intent m6855(Object obj) {
        if (C0238.m9653() >= 0) {
            return ((p) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m6856(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0107.m3883() > 0) {
            return ((e.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((e) obj2, (e.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj3, (e.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj4);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۦۧۢ, reason: not valid java name and contains not printable characters */
    public static void m6857(Object obj, Object obj2) {
        if (C0070.m2829() < 0) {
            ((View) obj).setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۨۤ۟, reason: not valid java name and contains not printable characters */
    public static int m6858(Object obj) {
        if (C0066.m2514() > 0) {
            return ((Display) obj).getHeight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static Future m6859(Object obj, Object obj2) {
        if (C0123.m4841() <= 0) {
            return ((ExecutorService) obj).submit((Callable) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۦۨ, reason: not valid java name and contains not printable characters */
    public static int m6860(Object obj, Object obj2) {
        if (C0202.m8245() >= 0) {
            return ((Cursor) obj).getColumnIndexOrThrow((String) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۤۥ۟, reason: not valid java name and contains not printable characters */
    public static String m6861() {
        if (C0024.m896() >= 0) {
            return "ۢۡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۦۣ, reason: not valid java name and contains not printable characters */
    public static Integer m6862() {
        if (C0249.m10052() < 0) {
            return pd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۠, reason: contains not printable characters */
    public static boolean m6863(Object obj, Object obj2) {
        if (C0047.m1663() <= 0) {
            return ((ArrayList) obj).remove(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۢ۠ۤ, reason: contains not printable characters */
    public static float[] m6864(Object obj) {
        if (C0176.m7290() > 0) {
            return ((mk.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥ۟۟, reason: contains not printable characters */
    public static wn m6865(Object obj) {
        if (C0233.m9365() <= 0) {
            return ((lf.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۤۤ, reason: contains not printable characters */
    public static ColorStateList m6866(Object obj, Object obj2) {
        if (C0066.m2514() >= 0) {
            return ((z0.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۤۧ, reason: contains not printable characters */
    public static Spannable m6867(Object obj) {
        if (C0233.m9365() < 0) {
            return ((jr) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۡ, reason: contains not printable characters */
    public static void m6868(Object obj, Object obj2, Object obj3, int i, int i2) {
        if (C0004.m139() < 0) {
            hs.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ViewParent) obj, (View) obj2, (View) obj3, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۦۡۤۥ, reason: contains not printable characters */
    public static void m6869(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) throws XmlPullParserException, IOException {
        if (C0133.m5208() < 0) {
            ((j0) obj).g((Context) obj2, (Resources) obj3, (XmlPullParser) obj4, (AttributeSet) obj5, (Resources.Theme) obj6);
        }
    }

    /* JADX INFO: renamed from: ۦۢۦۨ, reason: contains not printable characters */
    public static CharSequence m6870(Object obj) {
        if (C0095.m3478() <= 0) {
            return ((p) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۢۦ, reason: contains not printable characters */
    public static float m6871(Object obj) {
        if (C0010.m354() < 0) {
            return ((RectF) obj).bottom;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۦۦۤ, reason: contains not printable characters */
    public static Object m6872(Object obj) {
        if (C0240.m9826() >= 0) {
            return l4.w((Iterable) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۥۧ, reason: contains not printable characters */
    public static void m6873(Object obj, Object obj2) {
        if (C0234.m9461() < 0) {
            ((pr.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Path) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧۡ۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m6874(Object obj) {
        if (C0112.m4054() <= 0) {
            return ((MenuItem) obj).isChecked();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۥۨۨ, reason: not valid java name and contains not printable characters */
    public static void m6875(Object obj, long j) throws IOException {
        if (C0219.m8794() >= 0) {
            ((v2) obj).j(j);
        }
    }

    /* JADX INFO: renamed from: ۨ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static boolean m6876(Object obj, Object obj2) {
        if (C0120.m4608() >= 0) {
            return ((xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۦۨۨ, reason: not valid java name and contains not printable characters */
    public static float m6877(Object obj) {
        if (C0123.m4841() < 0) {
            return ((Menu.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۨۨۨۢ, reason: not valid java name and contains not printable characters */
    public static ViewPropertyAnimator m6878(Object obj, float f) {
        if (C0058.m2184() >= 0) {
            return ((ViewPropertyAnimator) obj).translationY(f);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m6834(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
