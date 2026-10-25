package androidx.core.graphics.drawable;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.MediaExtractor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v4.app.C0002;
import android.support.v4.app.C0004;
import android.support.v4.graphics.drawable.C0009;
import android.support.v4.graphics.drawable.C0010;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.TransformationMethod;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.PopupWindow;
import androidx.activity.C0020;
import androidx.annotation.C0023;
import androidx.appcompat.app.C0034;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0051;
import androidx.core.app.C0052;
import androidx.core.widget.C0068;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0084;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0095;
import androidx.lifecycle.C0106;
import androidx.lifecycle.C0107;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0119;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0123;
import androidx.savedstate.C0126;
import androidx.savedstate.C0127;
import androidx.versionedparcelable.C0129;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.Menu;
import com.example.vcam.VideoToFrames;
import com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.Cif;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ak;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ci;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.id;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.js;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kh;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ks;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ms;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.w6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ws;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y4;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.zip.CRC32;
import okhttp3.C0238;
import okhttp3.HttpUrl;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.logging.C0231;
import okhttp3.logging.C0232;
import okhttp3.logging.C0233;
import okhttp3.logging.C0234;
import retrofit2.converter.scalars.C0243;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: androidx.core.graphics.drawable.ۡۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0064 {

    /* JADX INFO: renamed from: ۣ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int f58 = 768;

    /* JADX INFO: renamed from: ۟۟ۡۤۧ, reason: not valid java name and contains not printable characters */
    public static void m2339(Object obj, int i, int i2) {
        if (C0034.m1206() <= 0) {
            ((m2) obj).b(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m2340(Object obj) {
        if (C0020.m701() > 0) {
            ((ks.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m2341(Object obj, Object obj2) {
        if (C0200.m8104() <= 0) {
            return wr.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj, (KeyEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static Constructor m2342(Object obj, Object obj2) {
        if (C0169.m7034() <= 0) {
            return ((wq) obj).o((Class) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۥ۠, reason: not valid java name and contains not printable characters */
    public static boolean m2343(Object obj, Object obj2) {
        if (C0078.m3044() <= 0) {
            return ((ArrayList) obj).contains(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static int m2344(Object obj) {
        if (C0234.m9461() <= 0) {
            return ((f8) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static void m2345(Object obj, Object obj2) {
        if (C0107.m3883() > 0) {
            ((Executor) obj).execute((Runnable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۧۧۨ, reason: not valid java name and contains not printable characters */
    public static int m2346(Object obj) {
        if (C0169.m7034() < 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).t;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static EditText m2347(Object obj) {
        if (C0171.m7136() < 0) {
            return ((kh) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۥۢ, reason: not valid java name and contains not printable characters */
    public static Surface m2348(Object obj) {
        if (C0204.m8270() < 0) {
            return ((SurfaceHolder) obj).getSurface();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۦۦ, reason: not valid java name and contains not printable characters */
    public static void m2349(Object obj, float f, float f2) {
        if (C0094.m3450() >= 0) {
            ((Path) obj).rMoveTo(f, f2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨ۠, reason: not valid java name and contains not printable characters */
    public static Drawable[] m2350(Object obj) {
        if (C0211.m8341() > 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static xs m2351(Object obj) {
        if (C0249.m10052() <= 0) {
            return wr.e.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m2352(Object obj, int i) {
        if (C0095.m3478() < 0) {
            return r8.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((InputStream) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۢۦ, reason: not valid java name and contains not printable characters */
    public static int m2353(Object obj) {
        if (C0052.m1890() > 0) {
            return ((ViewGroup.MarginLayoutParams) obj).topMargin;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۡۦۤ, reason: not valid java name and contains not printable characters */
    public static int m2354(int i) {
        if (C0233.m9365() <= 0) {
            return vk.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m2355(Object obj) {
        if (C0162.m6837() <= 0) {
            ((j0.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۟ۢۨۤۨ, reason: not valid java name and contains not printable characters */
    public static void m2356(Object obj) {
        if (C0068.m2650() >= 0) {
            ((Cif) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static int m2357(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static long m2358(Object obj) {
        if (C0040.m1622() < 0) {
            return ((s2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static Object m2359(Object obj, int i) {
        if (C0094.m3450() >= 0) {
            return ((AtomicReferenceArray) obj).get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۡۧ, reason: not valid java name and contains not printable characters */
    public static Context m2360(Object obj) {
        if (C0002.m72() > 0) {
            return ((t0) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۦ, reason: not valid java name and contains not printable characters */
    public static void m2361(Object obj, Object obj2) {
        if (C0093.m3365() >= 0) {
            ((xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).a((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۢۨ, reason: not valid java name and contains not printable characters */
    public static Resources m2362(Object obj) {
        if (C0004.m139() < 0) {
            return ((Resources.Theme) obj).getResources();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static js m2363(Object obj, float f) {
        if (C0238.m9653() > 0) {
            return ((js) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(f);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static boolean m2364(Object obj) {
        if (C0009.m276() < 0) {
            return ((PopupWindow) obj).isShowing();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۦ۟, reason: not valid java name and contains not printable characters */
    public static String m2365(String str) {
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

    /* JADX INFO: renamed from: ۟ۤۧۦۥ, reason: not valid java name and contains not printable characters */
    public static boolean m2366() {
        if (C0161.m6744() > 0) {
            return lm.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۨ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m2367(Object obj) {
        if (C0149.m6476() < 0) {
            ((MediaExtractor) obj).release();
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static ClipData m2368(Object obj) {
        if (C0116.m4340() > 0) {
            return ((ClipboardManager) obj).getPrimaryClip();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۟۠, reason: not valid java name and contains not printable characters */
    public static Map m2369(Object obj) {
        if (C0202.m8245() > 0) {
            return ((wm) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m2370(Object obj) {
        if (C0093.m3365() > 0) {
            return ((xs) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۣۨ۠, reason: not valid java name and contains not printable characters */
    public static String m2371() {
        if (C0051.m1783() <= 0) {
            return Build.DEVICE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۢۤ, reason: not valid java name and contains not printable characters */
    public static TransformationMethod m2372(Object obj, Object obj2) {
        if (C0093.m3365() >= 0) {
            return ((h8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TransformationMethod) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m2373(Object obj, Object obj2) {
        if (C0149.m6476() < 0) {
            ((ActionBarContextView) obj).setTitle((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۨۦۢ, reason: not valid java name and contains not printable characters */
    public static Drawable m2374(Object obj, Object obj2, long j) {
        if (C0119.m4573() >= 0) {
            return ((hm) obj).a((Context) obj2, j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢۦ, reason: not valid java name and contains not printable characters */
    public static Typeface m2375(Object obj, int i, boolean z) {
        if (C0117.m4419() < 0) {
            return Typeface.create((Typeface) obj, i, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۧۥ, reason: not valid java name and contains not printable characters */
    public static void m2376(Object obj, Object obj2, Object obj3) {
        if (C0200.m8104() <= 0) {
            ((Bundle) obj).putDoubleArray((String) obj2, (double[]) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۥۣ۟, reason: not valid java name and contains not printable characters */
    public static Drawable m2377(Object obj, Object obj2) {
        if (C0113.m4144() <= 0) {
            return ((qo) obj).h((Uri) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۤۡ, reason: not valid java name and contains not printable characters */
    public static Object m2378(Object obj) {
        if (C0232.m9299() >= 0) {
            return ((dm.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۨۧ, reason: not valid java name and contains not printable characters */
    public static void m2379(Object obj, int i) {
        if (C0243.m9964() >= 0) {
            i8.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((EditText) obj, i);
        }
    }

    /* JADX INFO: renamed from: ۣ۠۟۠, reason: not valid java name and contains not printable characters */
    public static int m2380(Object obj) {
        if (C0049.m1767() < 0) {
            return ((l2.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static String m2381(Object obj) {
        if (C0107.m3883() >= 0) {
            return Menu.m5628((Menu) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۨ۠, reason: not valid java name and contains not printable characters */
    public static String m2382(Object obj) {
        if (C0065.m2448() > 0) {
            return ((Uri) obj).getPath();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟, reason: not valid java name and contains not printable characters */
    public static MenuItem m2383(Object obj, Object obj2) {
        if (C0106.m3835() > 0) {
            return ((MenuItem) obj).setIconTintList((ColorStateList) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۢۧ, reason: not valid java name and contains not printable characters */
    public static AtomicLongFieldUpdater m2384() {
        if (C0113.m4144() <= 0) {
            return f6.c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۡۨ, reason: not valid java name and contains not printable characters */
    public static String m2385(Object obj) {
        if (C0020.m701() > 0) {
            return ((ConnectionBlocker.NetworkLog) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۥۢ, reason: not valid java name and contains not printable characters */
    public static int m2386(Object obj) {
        if (C0231.m9265() >= 0) {
            return ((id.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۧۧ۠, reason: not valid java name and contains not printable characters */
    public static void m2387(Object obj, boolean z) {
        if (C0200.m8104() <= 0) {
            ((h8) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(z);
        }
    }

    /* JADX INFO: renamed from: ۡۨۤۥ, reason: not valid java name and contains not printable characters */
    public static int m2388() {
        return 537 ^ C0116.f96;
    }

    /* JADX INFO: renamed from: ۡۨۦۡ, reason: not valid java name and contains not printable characters */
    public static Matrix m2389() {
        if (C0204.m8270() <= 0) {
            return pr.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۧۦ, reason: not valid java name and contains not printable characters */
    public static ms m2390(Object obj) {
        if (C0078.m3044() < 0) {
            return ((ks) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۨۡ, reason: not valid java name and contains not printable characters */
    public static long m2391(Object obj) {
        if (C0123.m4841() <= 0) {
            return ((Number) obj).longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟۟, reason: not valid java name and contains not printable characters */
    public static String m2392(Object obj) {
        if (C0171.m7136() < 0) {
            return ((CancellationException) obj).getMessage();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۨۦ, reason: not valid java name and contains not printable characters */
    public static boolean m2393(Object obj) {
        if (C0127.m4950() >= 0) {
            return ((ws) obj).h;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۢ۟, reason: not valid java name and contains not printable characters */
    public static Menu m2394(Object obj) {
        if (C0181.m7445() >= 0) {
            return ((ci) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۤ۟, reason: not valid java name and contains not printable characters */
    public static void m2395(Object obj, Object obj2, Object obj3, int i) {
        if (C0034.m1206() < 0) {
            ((KeyListener) obj).clearMetaKeyState((View) obj2, (Editable) obj3, i);
        }
    }

    /* JADX INFO: renamed from: ۣۤۤۦ, reason: not valid java name and contains not printable characters */
    public static boolean m2396(Object obj) {
        if (C0010.m354() <= 0) {
            return ((VideoToFrames) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۤۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean m2397(Object obj) {
        if (C0068.m2650() > 0) {
            return ((r4) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۤۨ۠, reason: not valid java name and contains not printable characters */
    public static void m2398(Object obj) {
        if (C0161.m6744() > 0) {
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy) obj);
        }
    }

    /* JADX INFO: renamed from: ۤۨۡۧ, reason: not valid java name and contains not printable characters */
    public static ak m2399() {
        if (C0164.m6900() < 0) {
            return wr.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۨۡ, reason: contains not printable characters */
    public static int m2400(Object obj) {
        if (C0217.m8693() <= 0) {
            return ((y4) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۦۣۤ, reason: contains not printable characters */
    public static CharSequence m2401(Object obj) {
        if (C0010.m354() <= 0) {
            return ((AccessibilityNodeInfo) obj).getContentDescription();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۧ۟, reason: contains not printable characters */
    public static AtomicLongFieldUpdater m2402() {
        if (C0084.m3253() < 0) {
            return vf.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۦ۟, reason: contains not printable characters */
    public static void m2403(Object obj) {
        if (C0078.m3044() < 0) {
            ((CRC32) obj).reset();
        }
    }

    /* JADX INFO: renamed from: ۦۦۦ۠, reason: contains not printable characters */
    public static int m2404(Object obj) {
        if (C0120.m4608() >= 0) {
            return ((f6) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧ۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m2405(Object obj, boolean z) {
        if (C0095.m3478() < 0) {
            ((ViewParent) obj).requestDisallowInterceptTouchEvent(z);
        }
    }

    /* JADX INFO: renamed from: ۣۧۡۥ, reason: not valid java name and contains not printable characters */
    public static boolean m2406(Object obj) {
        if (C0127.m4950() >= 0) {
            return ((jq) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۧۦۤ, reason: not valid java name and contains not printable characters */
    public static void m2407(Object obj, boolean z) {
        if (C0023.m843() >= 0) {
            ((HttpURLConnection) obj).setDoOutput(z);
        }
    }

    /* JADX INFO: renamed from: ۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m2408(Object obj) {
        if (C0129.m5108() >= 0) {
            return ((ViewGroup.MarginLayoutParams) obj).getMarginStart();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨ۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static w6 m2409() {
        if (C0010.m354() <= 0) {
            return w6.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۦۢ, reason: not valid java name and contains not printable characters */
    public static String m2411() {
        if (C0219.m8794() >= 0) {
            return "ۧ۟ۢ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨ۟۟, reason: not valid java name and contains not printable characters */
    public static LocationManager m2412(Object obj) {
        if (C0126.m4908() <= 0) {
            return ((qq) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۧ, reason: not valid java name and contains not printable characters */
    public static String m2410(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
