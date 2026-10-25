package androidx.activity;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.support.v4.app.C0002;
import android.support.v4.app.C0004;
import android.support.v4.graphics.drawable.C0010;
import android.support.v4.graphics.drawable.C0011;
import android.text.method.KeyListener;
import android.util.Base64;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import android.window.OnBackInvokedCallback;
import androidx.annotation.C0023;
import androidx.annotation.C0024;
import androidx.annotation.C0026;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0035;
import androidx.appcompat.app.C0037;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0047;
import androidx.core.app.C0052;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0066;
import androidx.core.widget.C0068;
import androidx.drawerlayout.widget.C0070;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0084;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0095;
import androidx.fragment.app.Fragment;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0119;
import androidx.savedstate.C0122;
import androidx.savedstate.C0123;
import androidx.savedstate.C0126;
import androidx.savedstate.C0127;
import androidx.versionedparcelable.C0135;
import com.example.vcam.C0141;
import com.example.vcam.HookMain;
import com.example.vcam.Menu;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ai;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ar;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.im;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.oi;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ts;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ws;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.ws.C0224;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0231;
import okhttp3.logging.C0232;
import okhttp3.logging.C0234;
import okhttp3.logging.C0235;
import retrofit2.C0259;

/* JADX INFO: renamed from: androidx.activity.ۡۧ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0021 {

    /* JADX INFO: renamed from: ۣۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int f20 = -822;

    /* JADX INFO: renamed from: ۟۟۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static void m709(Object obj, Object obj2, int i) {
        if (C0213.m8458() > 0) {
            y7.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((EditorInfo) obj, (CharSequence) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۟۠۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static gg m710(Object obj) {
        if (C0004.m139() < 0) {
            return ((gg) obj).S();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static float m711(Object obj) {
        if (C0031.m1148() <= 0) {
            return ((e3) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟۠ۤۦۧ, reason: not valid java name and contains not printable characters */
    public static ActionBarContextView m712(Object obj) {
        if (C0011.m458() >= 0) {
            return ((yn) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static boolean m713(Object obj) {
        if (C0122.m4736() < 0) {
            return ((Fragment) obj).i;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m714(Object obj) {
        if (C0035.m1268() < 0) {
            return ((lg.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۥۣ۟, reason: not valid java name and contains not printable characters */
    public static long m715() {
        if (C0058.m2184() >= 0) {
            return f2.m5956();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠ۨۡۥ, reason: not valid java name and contains not printable characters */
    public static void m716(Object obj, Object obj2) {
        if (C0135.m5274() <= 0) {
            v0.b.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Configuration) obj, (mf) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static boolean m717(Object obj, Object obj2) {
        if (C0024.m896() >= 0) {
            return jd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj, obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧۨ, reason: not valid java name and contains not printable characters */
    public static Menu m718(Object obj) {
        if (C0040.m1622() <= 0) {
            return ((ai) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۥۢ, reason: not valid java name and contains not printable characters */
    public static boolean m719(Object obj, int i, Object obj2, int i2, int i3, boolean z) {
        if (C0181.m7445() > 0) {
            return lo.g((String) obj, i, (String) obj2, i2, i3, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۨۡۡ, reason: not valid java name and contains not printable characters */
    public static h8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m720(Object obj) {
        if (C0211.m8341() >= 0) {
            return ((h8.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static void m721(Object obj, Object obj2, Object obj3) {
        if (C0161.m6744() >= 0) {
            ts.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj, (Rect) obj2, (Rect) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static List m722(Object obj) {
        if (C0078.m3044() <= 0) {
            return mn.b((hn) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡ۠, reason: not valid java name and contains not printable characters */
    public static void m723(Object obj, Object obj2) {
        if (C0094.m3450() >= 0) {
            ((s2) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((byte[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static void m724(Object obj, Object obj2) {
        if (C0058.m2184() > 0) {
            ((xs) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۥ۟۠, reason: not valid java name and contains not printable characters */
    public static void m725(Object obj) {
        if (C0235.m9535() <= 0) {
            jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static void m726(Object obj, Object obj2) {
        if (C0176.m7290() >= 0) {
            p1.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj, (String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۡۡۤ, reason: not valid java name and contains not printable characters */
    public static boolean m728(Object obj) {
        if (C0113.m4144() < 0) {
            return ((ws) obj).d;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۢۧۢ, reason: not valid java name and contains not printable characters */
    public static void m729(Object obj) {
        if (C0127.m4950() >= 0) {
            ((RectF) obj).setEmpty();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static un m730(Object obj, Object obj2) {
        if (C0095.m3478() < 0) {
            return ((f2) obj).source((un) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m731(Object obj) {
        if (C0070.m2829() < 0) {
            ((t8) obj).o0();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧۨ, reason: not valid java name and contains not printable characters */
    public static int m732(Object obj) {
        if (C0123.m4841() <= 0) {
            return ((j0.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static String m733(Object obj) {
        if (C0117.m4419() <= 0) {
            return p6.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((t5) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۢ۠, reason: not valid java name and contains not printable characters */
    public static IntStream m734(Object obj) {
        if (C0225.m9001() >= 0) {
            return jr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((CharSequence) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۣۢ, reason: not valid java name and contains not printable characters */
    public static int m735(Object obj, Object obj2) {
        if (C0171.m7136() <= 0) {
            return ((HookMain) obj).d0((File) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۧۡۥ, reason: not valid java name and contains not printable characters */
    public static String m736(Object obj, int i) {
        if (C0047.m1663() <= 0) {
            return Base64.encodeToString((byte[]) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۨۧ, reason: not valid java name and contains not printable characters */
    public static int m737(Object obj, int i) {
        if (C0182.m7528() < 0) {
            return ((f8) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static Animator m738(Object obj, Object obj2, Object obj3, int i) {
        if (C0127.m4950() >= 0) {
            return m0.b((Context) obj, (Resources) obj2, (Resources.Theme) obj3, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۨ, reason: not valid java name and contains not printable characters */
    public static Parcelable m739(Object obj, Object obj2) {
        if (C0234.m9461() <= 0) {
            return ((Parcel) obj).readParcelable((ClassLoader) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m740() {
        return 96 ^ C0068.f62;
    }

    /* JADX INFO: renamed from: ۟ۦۢۦ۟, reason: not valid java name and contains not printable characters */
    public static String m741(Object obj, int i) {
        if (C0148.m6464() <= 0) {
            return ((Context) obj).getString(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۨۨ, reason: not valid java name and contains not printable characters */
    public static boolean m742(Object obj) {
        if (C0070.m2829() < 0) {
            return ((pr.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۢۥۧ, reason: not valid java name and contains not printable characters */
    public static int m743(Object obj) {
        if (C0232.m9299() > 0) {
            return ((KeyListener) obj).getInputType();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤۢ, reason: not valid java name and contains not printable characters */
    public static char m744(Object obj) {
        if (C0231.m9265() > 0) {
            return ((uo.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).f;
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: ۟ۧۦۢۤ, reason: not valid java name and contains not printable characters */
    public static void m745(Object obj) {
        if (C0026.m1047() >= 0) {
            ((HookMain) obj).e0();
        }
    }

    /* JADX INFO: renamed from: ۣ۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static short m746(Object obj) {
        if (C0119.m4573() > 0) {
            return ((oi) obj).f();
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: ۠ۡ۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m747(Object obj) {
        if (C0010.m354() <= 0) {
            return ((v0.e) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۨۥۣ, reason: not valid java name and contains not printable characters */
    public static int m748(Object obj) {
        if (C0052.m1890() > 0) {
            return mo.A((CharSequence) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡ۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static View.AccessibilityDelegate m749(Object obj) {
        if (C0231.m9265() > 0) {
            return ((h) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۢۦ, reason: not valid java name and contains not printable characters */
    public static int m750(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡۨۥۥ, reason: not valid java name and contains not printable characters */
    public static String m751(String str) {
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

    /* JADX INFO: renamed from: ۣۢ۠۟, reason: not valid java name and contains not printable characters */
    public static int m752(Object obj) {
        if (C0224.m8861() < 0) {
            return ((vl) obj).d();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۡۤ۟, reason: not valid java name and contains not printable characters */
    public static ParcelFileDescriptor m753(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0023.m843() > 0) {
            return ar.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ContentResolver) obj, (Uri) obj2, (String) obj3, (CancellationSignal) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m754(Object obj) {
        if (C0141.m5769() >= 0) {
            return ((View) obj).hasTransientState();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۡ۠, reason: not valid java name and contains not printable characters */
    public static MenuItem m755(Object obj, Object obj2) {
        if (C0040.m1622() < 0) {
            return ((MenuItem) obj).setTitleCondensed((CharSequence) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۧۢ, reason: not valid java name and contains not printable characters */
    public static void m756(Object obj, Object obj2) {
        if (C0225.m9001() >= 0) {
            ((xd.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).e((Throwable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۧۦۣ, reason: not valid java name and contains not printable characters */
    public static int m757(Object obj, Object obj2) {
        if (C0214.m8575() < 0) {
            return ((s2) obj).read((ByteBuffer) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static void m758(Object obj) {
        if (C0172.m7180() > 0) {
            ((ObjectAnimator) obj).reverse();
        }
    }

    /* JADX INFO: renamed from: ۤۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m759(Object obj) {
        if (C0004.m139() < 0) {
            return ((Locale) obj).toLanguageTag();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤ۟, reason: not valid java name and contains not printable characters */
    public static boolean m760(Object obj, Object obj2, Object obj3) {
        if (C0240.m9826() > 0) {
            return ((AtomicReference) obj).compareAndSet(obj2, obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۥۥۣ, reason: not valid java name and contains not printable characters */
    public static int m761(Object obj) {
        if (C0218.m8760() >= 0) {
            return ((MotionEvent) obj).getActionMasked();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۧۨۨ, reason: not valid java name and contains not printable characters */
    public static boolean m762(Object obj, int i, int i2) {
        if (C0040.m1622() < 0) {
            return ((zr) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۨۨ۟, reason: not valid java name and contains not printable characters */
    public static float m763(Object obj) {
        if (C0232.m9299() > 0) {
            return ((pr.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۥۡ۠ۢ, reason: contains not printable characters */
    public static void m764(Object obj, float f) {
        if (C0115.m4218() < 0) {
            ((GradientDrawable) obj).setCornerRadius(f);
        }
    }

    /* JADX INFO: renamed from: ۥۣۢۧ, reason: contains not printable characters */
    public static a9 m765(Object obj) {
        if (C0149.m6476() <= 0) {
            return a9.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۢۡ, reason: contains not printable characters */
    public static boolean m766() {
        if (C0164.m6900() < 0) {
            return im.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۨۨ۟, reason: contains not printable characters */
    public static int m767(Object obj) {
        if (C0002.m72() > 0) {
            return ((TypedArray) obj).length();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦ۠۠ۧ, reason: contains not printable characters */
    public static Drawable m768(Object obj, int i) {
        if (C0020.m701() >= 0) {
            return ((TypedArray) obj).getDrawable(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۤ, reason: contains not printable characters */
    public static Drawable m769(Object obj) {
        if (C0217.m8693() < 0) {
            return ((InsetDrawable) obj).getDrawable();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۦۨ, reason: contains not printable characters */
    public static int m770(Object obj) {
        if (C0010.m354() < 0) {
            return ((Drawable) obj).getAlpha();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۣۥۨ, reason: contains not printable characters */
    public static OnBackInvokedCallback m771(Object obj, Object obj2) {
        if (C0178.m7344() <= 0) {
            return v0.d.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj, (v0) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۦ۠, reason: contains not printable characters */
    public static void m772(Object obj, float f, float f2) {
        if (C0074.m2951() <= 0) {
            ((Path) obj).moveTo(f, f2);
        }
    }

    /* JADX INFO: renamed from: ۦۦۢۨ, reason: contains not printable characters */
    public static float[] m773(Object obj) {
        if (C0084.m3253() < 0) {
            return ((m2) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۢ۟, reason: not valid java name and contains not printable characters */
    public static int m774(Object obj) {
        if (C0047.m1663() <= 0) {
            return yr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ViewConfiguration) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Object m775(Object obj) {
        if (C0037.m1437() <= 0) {
            return ((View) obj).getTag();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۢۧ, reason: not valid java name and contains not printable characters */
    public static int m776(Object obj) {
        if (C0201.m8184() <= 0) {
            return ((v0.k) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧۧۤ, reason: not valid java name and contains not printable characters */
    public static String m777(Object obj, Object obj2, Object obj3, boolean z) {
        if (C0259.m10136() >= 0) {
            return lo.k((String) obj, (String) obj2, (String) obj3, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۧۨ, reason: not valid java name and contains not printable characters */
    public static yf m778() {
        if (C0123.m4841() < 0) {
            return l9.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static boolean m779(Object obj, int i) {
        if (C0066.m2514() > 0) {
            return ((Window) obj).requestFeature(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨۨۧ, reason: not valid java name and contains not printable characters */
    public static Drawable m780(Object obj, int i) {
        if (C0126.m4908() <= 0) {
            return ((LayerDrawable) obj).findDrawableByLayerId(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۧۧ, reason: not valid java name and contains not printable characters */
    public static String m727(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
