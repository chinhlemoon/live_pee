package androidx.core.graphics.drawable;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.app.LocaleManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.support.v4.app.C0004;
import android.support.v4.graphics.drawable.C0010;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.transition.Transition;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.activity.C0020;
import androidx.activity.C0021;
import androidx.annotation.C0024;
import androidx.annotation.C0026;
import androidx.appcompat.app.C0034;
import androidx.appcompat.app.C0036;
import androidx.appcompat.view.menu.C0039;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.view.menu.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.C0047;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0052;
import androidx.core.app.C0055;
import androidx.core.content.C0057;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0072;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0083;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0096;
import androidx.lifecycle.C0106;
import androidx.lifecycle.C0107;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0118;
import androidx.profileinstaller.C0119;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0123;
import androidx.savedstate.C0126;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0133;
import com.example.vcam.HookMain;
import com.example.vcam.LicenseManager;
import com.example.vcam.Menu;
import com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.Cif;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.cq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.eo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ij;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.js;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ls;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.of;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qi;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.us;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ws;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.TreeMap;
import okhttp3.C0238;
import okhttp3.HttpUrl;
import okhttp3.internal.C0227;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0195;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.ws.C0224;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0232;
import okhttp3.logging.C0235;
import org.json.JSONException;
import retrofit2.C0259;
import retrofit2.converter.scalars.C0243;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: androidx.core.graphics.drawable.۟۠ۡۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0062 {

    /* JADX INFO: renamed from: ۨۨۡۦ, reason: not valid java name and contains not printable characters */
    public static int f56 = -243;

    /* JADX INFO: renamed from: ۟۟۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static String m2245(Object obj) {
        if (C0195.m7914() > 0) {
            return e7.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۤۨ, reason: not valid java name and contains not printable characters */
    public static String[] m2246() {
        if (C0224.m8861() < 0) {
            return m1.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۦۧ, reason: not valid java name and contains not printable characters */
    public static v5.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m2247() {
        if (C0112.m4054() < 0) {
            return v5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static int m2248(Object obj) {
        if (C0055.m2054() >= 0) {
            return ((Configuration) obj).screenLayout;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۥۦۢ, reason: not valid java name and contains not printable characters */
    public static void m2249(Object obj) {
        if (C0194.m7889() >= 0) {
            ((ByteArrayOutputStream) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۟۟ۧ۟۠, reason: not valid java name and contains not printable characters */
    public static void m2250(Object obj, Object obj2, int i) {
        if (C0107.m3883() > 0) {
            ((Bundle) obj).putInt((String) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟۠۟, reason: not valid java name and contains not printable characters */
    public static void m2251(Object obj, Object obj2, Object obj3) {
        if (C0123.m4841() < 0) {
            ((tf.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((tf) obj2, obj3);
        }
    }

    /* JADX INFO: renamed from: ۟۠۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static Surface m2252() {
        if (C0119.m4573() > 0) {
            return HookMain.c1_fake_surface;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۠۠, reason: not valid java name and contains not printable characters */
    public static o5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m2253(Object obj, Object obj2) {
        if (C0133.m5208() <= 0) {
            return ((o5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Uri) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static Object m2254(Object obj) {
        if (C0232.m9299() > 0) {
            return ((q) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static SeekBar m2255(Object obj) {
        if (C0026.m1047() >= 0) {
            return ((i1) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۤۨ, reason: not valid java name and contains not printable characters */
    public static int m2256(Object obj, Object obj2, Object obj3) {
        if (C0149.m6476() < 0) {
            return q1.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj, (String) obj2, (String) obj3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۤ۟۟, reason: not valid java name and contains not printable characters */
    public static void m2257(Object obj, Object obj2) {
        if (C0078.m3044() < 0) {
            ((q0) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((q) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۨۢۡ, reason: not valid java name and contains not printable characters */
    public static boolean m2258(Object obj) {
        if (C0126.m4908() <= 0) {
            return ((v0.k) obj).h;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۨۢۦ, reason: not valid java name and contains not printable characters */
    public static Drawable m2259(Object obj, Object obj2, int i, boolean z) {
        if (C0249.m10052() < 0) {
            return ((hm) obj).c((Context) obj2, i, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static Object m2260(Object obj, Object obj2) {
        if (C0055.m2054() > 0) {
            return ((LinkedHashMap) obj).remove(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۥ, reason: not valid java name and contains not printable characters */
    public static Thread m2261(Object obj) {
        if (C0120.m4608() >= 0) {
            return ((u8) obj).c0();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۥۣ, reason: not valid java name and contains not printable characters */
    public static int m2262(Object obj) {
        if (C0096.m3601() < 0) {
            return ((sp) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۨۤۨ, reason: not valid java name and contains not printable characters */
    public static int m2263(Object obj) {
        if (C0055.m2054() > 0) {
            return ((qi.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static String m2264(Object obj) {
        if (C0049.m1767() <= 0) {
            return ((Cif) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۢۡ, reason: not valid java name and contains not printable characters */
    public static SpannableStringBuilder m2265(Object obj, int i, Object obj2, int i2, int i3) {
        if (C0107.m3883() >= 0) {
            return ((vn) obj).insert(i, (CharSequence) obj2, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static float m2266(Object obj) {
        if (C0118.m4454() >= 0) {
            return ((MotionEvent) obj).getRawX();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤ۟, reason: not valid java name and contains not printable characters */
    public static int m2267(Object obj, int i) {
        if (C0235.m9535() <= 0) {
            return ((SparseIntArray) obj).get(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۥۨۦ, reason: not valid java name and contains not printable characters */
    public static String m2268(Object obj) {
        if (C0057.m2142() > 0) {
            return ((of) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۡ۟, reason: not valid java name and contains not printable characters */
    public static Method m2269(Object obj, Object obj2, Object obj3) {
        if (C0204.m8270() <= 0) {
            return ((Class) obj).getMethod((String) obj2, (Class[]) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟, reason: not valid java name and contains not printable characters */
    public static AnimatorSet m2270(Object obj) {
        if (C0217.m8693() <= 0) {
            return ((k0.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m2271(Object obj, boolean z) {
        if (C0225.m9001() > 0) {
            ((ws) obj).k(z);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static AccessibilityEvent m2272() {
        if (C0133.m5208() <= 0) {
            return AccessibilityEvent.obtain();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static int m2273(Object obj) {
        if (C0162.m6837() < 0) {
            return ((View) obj).getPaddingTop();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static void m2274(Object obj, Object obj2, long j, long j2) {
        if (C0195.m7914() > 0) {
            ((Timer) obj).schedule((TimerTask) obj2, j, j2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static int m2275(Object obj) {
        if (C0243.m9964() > 0) {
            return ((TreeMap) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static void m2276(Object obj) {
        if (C0096.m3601() <= 0) {
            ((v0) obj).Y();
        }
    }

    /* JADX INFO: renamed from: ۟ۤۡۡ۠, reason: not valid java name and contains not printable characters */
    public static float m2277(Object obj) {
        if (C0128.m5064() < 0) {
            return ((e3) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۤۤۡۦ, reason: not valid java name and contains not printable characters */
    public static j9 m2278(Object obj) {
        if (C0113.m4144() < 0) {
            return ((l9.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۥۡ, reason: not valid java name and contains not printable characters */
    public static void m2279(Object obj, Object obj2) {
        if (C0052.m1890() > 0) {
            ((EditText) obj).addTextChangedListener((TextWatcher) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣۢۥ, reason: not valid java name and contains not printable characters */
    public static x1 m2280(Object obj) {
        if (C0211.m8341() >= 0) {
            return ((rr) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۤۨ, reason: not valid java name and contains not printable characters */
    public static int m2281(Object obj, Object obj2) {
        if (C0024.m896() > 0) {
            return d2.j((Object[]) obj, obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣۦۧ, reason: not valid java name and contains not printable characters */
    public static boolean m2282(Object obj) {
        if (C0169.m7034() < 0) {
            return ((u6) obj).v0();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۥ۟ۤ, reason: not valid java name and contains not printable characters */
    public static LocaleList m2283(Object obj) {
        if (C0047.m1663() < 0) {
            return ((LocaleManager) obj).getApplicationLocales();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۡۦ, reason: not valid java name and contains not printable characters */
    public static void m2284(Object obj, Object obj2) {
        if (C0195.m7914() >= 0) {
            C0112.m4104((tf) obj, (tf) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۥۥۦ, reason: not valid java name and contains not printable characters */
    public static float m2285(Object obj) {
        if (C0112.m4054() < 0) {
            return ((us) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۟, reason: not valid java name and contains not printable characters */
    public static dd m2286(Object obj) {
        if (C0172.m7180() >= 0) {
            return ((xs.d) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static zr m2287(Object obj) {
        if (C0072.m2856() <= 0) {
            return zr.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static Context m2288(Object obj) {
        if (C0172.m7180() > 0) {
            return ((l9.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۡۧ, reason: not valid java name and contains not printable characters */
    public static ViewParent m2289(Object obj) {
        if (C0238.m9653() > 0) {
            return ((fj) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۡۧ, reason: not valid java name and contains not printable characters */
    public static TypedValue m2290(Object obj) {
        if (C0116.m4340() >= 0) {
            return ((ContentFrameLayout) obj).getMinWidthMajor();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static long m2291(Object obj) {
        if (C0215.m8604() <= 0) {
            return ((HookMain) obj).videoSwitchInterval;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static Toolbar m2292(Object obj) {
        if (C0149.m6476() < 0) {
            return ((xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۨۡ, reason: not valid java name and contains not printable characters */
    public static void m2293(Object obj, int i) {
        if (C0227.m9046() >= 0) {
            ((TextView) obj).setTextAppearance(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۤۦۨ, reason: not valid java name and contains not printable characters */
    public static int m2294(Object obj) {
        if (C0225.m9001() >= 0) {
            return ((ApplicationInfo) obj).targetSdkVersion;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤۧ, reason: not valid java name and contains not printable characters */
    public static String m2295(Object obj) {
        if (C0259.m10136() > 0) {
            return ((xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m2296(Object obj, Object obj2) {
        if (C0117.m4419() <= 0) {
            return eo.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m2297(Object obj, Object obj2) {
        if (C0181.m7445() >= 0) {
            return ((o8) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Void) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۧۤۢ, reason: not valid java name and contains not printable characters */
    public static Drawable m2298(Object obj) {
        if (C0055.m2054() > 0) {
            return ((ActionBarContainer) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m2299(Object obj) {
        if (C0172.m7180() > 0) {
            return dl.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤ۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m2300(Object obj) {
        if (C0213.m8458() > 0) {
            return ((ViewConfiguration) obj).shouldShowMenuShortcutsWhenKeyboardPresent();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۤۡ۠, reason: not valid java name and contains not printable characters */
    public static void m2301(Object obj) {
        if (C0249.m10052() < 0) {
            ((xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۠ۤۨۧ, reason: not valid java name and contains not printable characters */
    public static String m2302(Object obj) {
        if (C0201.m8184() <= 0) {
            return ((JSONException) obj).getMessage();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m2303(Object obj, Object obj2, Object obj3) {
        if (m2326() > 0) {
            Menu.m5643((Menu) obj, (LinearLayout) obj2, (View) obj3);
        }
    }

    /* JADX INFO: renamed from: ۡۦۦۤ, reason: not valid java name and contains not printable characters */
    public static String m2305(String str) {
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

    /* JADX INFO: renamed from: ۡۧۥ۟, reason: not valid java name and contains not printable characters */
    public static Drawable m2306(Object obj, Object obj2) {
        if (C0123.m4841() < 0) {
            return ((qo) obj).b((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۦ, reason: not valid java name and contains not printable characters */
    public static Thread m2307() {
        if (C0107.m3883() > 0) {
            return Thread.currentThread();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static m m2308(Object obj) {
        if (C0126.m4908() < 0) {
            return ((v0) obj).j();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۤۡ, reason: not valid java name and contains not printable characters */
    public static void m2309(Object obj, Object obj2) {
        if (C0069.m2756() < 0) {
            ((Transition) obj).setEpicenterCallback((Transition.EpicenterCallback) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣۢ۠, reason: not valid java name and contains not printable characters */
    public static void m2310(Object obj) {
        if (C0117.m4419() <= 0) {
            LocaleList.setDefault((LocaleList) obj);
        }
    }

    /* JADX INFO: renamed from: ۣۥۡۦ, reason: not valid java name and contains not printable characters */
    public static String m2311(Object obj) {
        if (C0195.m7914() > 0) {
            return ((AccessibilityNodeInfo) obj).getViewIdResourceName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۧۤ, reason: not valid java name and contains not printable characters */
    public static ls m2312(Object obj) {
        if (C0010.m354() < 0) {
            return ((js.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static Toolbar m2313(Object obj) {
        if (C0094.m3450() > 0) {
            return ((cq) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣۨ, reason: not valid java name and contains not printable characters */
    public static void m2314(Object obj) {
        if (C0126.m4908() < 0) {
            ((MediaPlayer) obj).start();
        }
    }

    /* JADX INFO: renamed from: ۤ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static ListAdapter m2315(Object obj) {
        if (C0034.m1206() < 0) {
            return ((androidx.appcompat.view.menu.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m2316(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۤۦۦ, reason: not valid java name and contains not printable characters */
    public static Object[] m2317(Object obj, Object obj2) {
        if (C0034.m1206() < 0) {
            return ((Set) obj).toArray((Object[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۤۦ, reason: not valid java name and contains not printable characters */
    public static int m2318(Object obj) {
        if (C0021.m740() <= 0) {
            return ((LocaleList) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۡۥۢ, reason: contains not printable characters */
    public static String m2319(Object obj) {
        if (C0083.m3188() <= 0) {
            return ((a9.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢ۟۠, reason: contains not printable characters */
    public static DragAndDropPermissions m2320(Object obj, Object obj2) {
        if (C0004.m139() <= 0) {
            return ((Activity) obj).requestDragAndDropPermissions((DragEvent) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۥۡ, reason: contains not printable characters */
    public static boolean m2321(Object obj, Object obj2) {
        if (C0172.m7180() >= 0) {
            return ((MenuItem.OnMenuItemClickListener) obj).onMenuItemClick((MenuItem) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣۨ۟, reason: contains not printable characters */
    public static int m2322(Object obj) {
        if (C0096.m3601() < 0) {
            return ((qo) obj).o;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۤۨۤ, reason: contains not printable characters */
    public static Method m2323() {
        if (C0106.m3835() >= 0) {
            return uq.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥ۟ۦ, reason: contains not printable characters */
    public static boolean m2324(Object obj) {
        if (C0083.m3188() <= 0) {
            return ((View) obj).hasOverlappingRendering();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۦۤ۠, reason: contains not printable characters */
    public static void m2325(Object obj, Object obj2) {
        if (C0194.m7889() >= 0) {
            ((Parcel) obj).enforceInterface((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۧۤ, reason: not valid java name and contains not printable characters */
    public static int m2326() {
        return (-103) ^ C0039.f36;
    }

    /* JADX INFO: renamed from: ۧۤۡ, reason: not valid java name and contains not printable characters */
    public static Locale m2327(Object obj) {
        if (C0235.m9535() <= 0) {
            return mf.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۥۡ, reason: not valid java name and contains not printable characters */
    public static void m2328(Object obj) {
        if (C0202.m8245() > 0) {
            LicenseManager.m5555((LicenseManager) obj);
        }
    }

    /* JADX INFO: renamed from: ۧۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m2329(Object obj) {
        if (C0072.m2856() <= 0) {
            return ((ij) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static List m2330(Object obj) {
        if (C0020.m701() > 0) {
            return mo.O((CharSequence) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢ۠, reason: not valid java name and contains not printable characters */
    public static boolean m2331(Object obj) {
        if (C0036.m1332() <= 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).u;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۢۤۧ, reason: not valid java name and contains not printable characters */
    public static int m2332(Object obj, Object obj2, int i, int i2) {
        if (C0128.m5064() < 0) {
            return ((InputStream) obj).read((byte[]) obj2, i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨۤۡ, reason: not valid java name and contains not printable characters */
    public static j6.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m2333() {
        if (C0040.m1622() < 0) {
            return j6.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۢۥ, reason: not valid java name and contains not printable characters */
    public static Object m2334(Object obj) {
        if (C0162.m6837() <= 0) {
            return ((Spinner) obj).getSelectedItem();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۦ۟, reason: not valid java name and contains not printable characters */
    public static String m2304(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
