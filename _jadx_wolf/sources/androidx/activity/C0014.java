package androidx.activity;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaFormat;
import android.support.v4.graphics.drawable.C0009;
import android.support.v4.graphics.drawable.C0010;
import android.support.v4.graphics.drawable.C0011;
import android.text.Editable;
import android.text.PrecomputedText;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.C0023;
import androidx.annotation.C0025;
import androidx.appcompat.app.C0036;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.view.menu.a;
import androidx.appcompat.view.menu.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0051;
import androidx.core.app.C0052;
import androidx.core.app.C0053;
import androidx.core.app.C0055;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0066;
import androidx.core.widget.C0068;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.drawerlayout.widget.C0072;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0079;
import androidx.emoji2.text.C0084;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0095;
import androidx.fragment.app.C0096;
import androidx.fragment.app.C0099;
import androidx.lifecycle.C0106;
import androidx.lifecycle.C0108;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0119;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0129;
import com.example.vcam.HookMain;
import com.example.vcam.MainActivity;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.b9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bt;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.c3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.c8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ej;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ie;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ks;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.oh;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ws;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yi;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zl;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.nio.channels.FileChannel;
import java.util.ArrayDeque;
import java.util.Calendar;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import okhttp3.C0239;
import okhttp3.HttpUrl;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0231;
import okhttp3.logging.C0232;
import okhttp3.logging.C0233;
import okhttp3.logging.C0235;
import retrofit2.C0259;
import retrofit2.converter.scalars.C0243;

/* JADX INFO: renamed from: androidx.activity.ۣ۟۟ۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0014 {

    /* JADX INFO: renamed from: ۟ۥۥۤۥ, reason: not valid java name and contains not printable characters */
    public static int f13 = -122;

    /* JADX INFO: renamed from: ۣ۟۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static pp.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m466() {
        if (C0095.m3478() <= 0) {
            return pp.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۥ۠, reason: not valid java name and contains not printable characters */
    public static void m467(Object obj, boolean z) {
        if (C0025.m934() > 0) {
            wr.O((View) obj, z);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۧۨۧ, reason: not valid java name and contains not printable characters */
    public static boolean m468(Object obj) {
        if (C0009.m276() <= 0) {
            return ((y1) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static boolean m469(Object obj) {
        if (C0219.m8794() > 0) {
            return ((sm) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۠۠, reason: not valid java name and contains not printable characters */
    public static ActivityInfo m470(Object obj) {
        if (C0199.m7998() < 0) {
            return ((ResolveInfo) obj).activityInfo;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۦۦ, reason: not valid java name and contains not printable characters */
    public static boolean m471(Object obj) {
        if (C0201.m8184() <= 0) {
            return ((xp) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠, reason: not valid java name and contains not printable characters */
    public static Typeface m472(Object obj, Object obj2, int i, Object obj3, Object obj4) {
        if (C0117.m4419() <= 0) {
            return l9.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj, (j9) obj2, i, (Executor) obj3, (c3) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۥۨ, reason: not valid java name and contains not printable characters */
    public static int m473(Object obj) {
        if (C0204.m8270() < 0) {
            return ((ListView) obj).getListPaddingBottom();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۨ۠ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m474(Object obj, int i, Object obj2, int i2) {
        if (C0106.m3835() >= 0) {
            return ((Menu) obj).performShortcut(i, (KeyEvent) obj2, i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۨۤۢ, reason: not valid java name and contains not printable characters */
    public static void m475(Object obj, Object obj2, int i) {
        if (C0232.m9299() > 0) {
            ((l1) obj).i((int[]) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۦ, reason: not valid java name and contains not printable characters */
    public static String m476(Object obj, int i) {
        if (C0053.m1959() > 0) {
            return l9.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((j9) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۤ۠, reason: not valid java name and contains not printable characters */
    public static boolean m477(Object obj, Object obj2, Object obj3, int i, int i2, boolean z) {
        if (C0119.m4573() > 0) {
            return ((c8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((InputConnection) obj2, (Editable) obj3, i, i2, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۦۣۤ, reason: not valid java name and contains not printable characters */
    public static boolean m478(Object obj) {
        if (C0129.m5108() > 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).m;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۨۨۨ, reason: not valid java name and contains not printable characters */
    public static Throwable m479(Object obj) {
        if (C0036.m1332() < 0) {
            return ((AssertionError) obj).getCause();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۨ۠, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m480(Object obj) {
        if (C0218.m8760() > 0) {
            return ((bt) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۢۨ, reason: not valid java name and contains not printable characters */
    public static AtomicIntegerFieldUpdater m481(Object obj, Object obj2) {
        if (C0025.m934() >= 0) {
            return AtomicIntegerFieldUpdater.newUpdater((Class) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m482(Object obj, int i, Object obj2, Object obj3) {
        if (C0078.m3044() < 0) {
            ((v.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).onRequestPermissionsResult(i, (String[]) obj2, (int[]) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m483(Object obj, Object obj2) {
        if (C0066.m2514() >= 0) {
            return ((String) obj).contains((CharSequence) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m484(Object obj, float f, float f2) {
        if (C0062.m2326() > 0) {
            ((TextView) obj).setLineSpacing(f, f2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۤۡۡ, reason: not valid java name and contains not printable characters */
    public static void m485(Object obj, Object obj2) {
        if (C0011.m458() > 0) {
            ((View) obj).removeOnUnhandledKeyEventListener((View.OnUnhandledKeyEventListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۥۣۢ, reason: not valid java name and contains not printable characters */
    public static Context m486(Object obj) {
        if (C0084.m3253() < 0) {
            return ((HookMain) obj).toast_content;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟۟۠, reason: not valid java name and contains not printable characters */
    public static int m487(Object obj) {
        if (C0213.m8458() >= 0) {
            return ((m2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static Context m488(Object obj) {
        if (C0231.m9265() > 0) {
            return ((EditText) obj).getContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۤۢ, reason: not valid java name and contains not printable characters */
    public static void m489(Object obj, Object obj2) {
        if (C0115.m4218() <= 0) {
            ((Drawable) obj).setTintList((ColorStateList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۦۦ۟, reason: not valid java name and contains not printable characters */
    public static boolean m490(Object obj, Object obj2, boolean z) {
        if (C0202.m8245() >= 0) {
            return mo.e0((CharSequence) obj, (CharSequence) obj2, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۧ۠ۤ, reason: not valid java name and contains not printable characters */
    public static List m491(Object obj) {
        if (C0040.m1622() < 0) {
            return ((xc) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۤۨ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.AccessibilityAction m492() {
        if (C0178.m7344() < 0) {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۦۥ, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m493(Object obj) {
        if (C0108.m4038() >= 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).y;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۨ۠, reason: not valid java name and contains not printable characters */
    public static void m494(Object obj, Object obj2) {
        if (C0219.m8794() > 0) {
            ((RuntimeException) obj).setStackTrace((StackTraceElement[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۥۢۦ, reason: not valid java name and contains not printable characters */
    public static Class m496(Object obj) {
        if (C0187.m7613() >= 0) {
            return Class.forName((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۦ, reason: not valid java name and contains not printable characters */
    public static void m497(Object obj, Object obj2) {
        if (C0181.m7445() > 0) {
            ((ws) obj).r((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۨۧۤ, reason: not valid java name and contains not printable characters */
    public static void m498(Object obj, Object obj2) {
        if (C0191.m7812() > 0) {
            ((v0) obj).O((xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static void m499(Object obj, Object obj2, Object obj3) {
        if (C0099.m3752() <= 0) {
            ((r6) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Menu) obj2, (a.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static FileChannel m500(Object obj) {
        if (C0181.m7445() > 0) {
            return ((FileInputStream) obj).getChannel();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۡ۠, reason: not valid java name and contains not printable characters */
    public static String m501(Object obj) {
        if (C0068.m2650() >= 0) {
            return ((m6) obj).f();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟۠, reason: not valid java name and contains not printable characters */
    public static boolean m502(Object obj) {
        if (C0074.m2951() < 0) {
            return ((AnimatedVectorDrawable) obj).isRunning();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static ContentLoadingProgressBar m503(Object obj) {
        if (C0169.m7034() <= 0) {
            return ((q5) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۢۡ, reason: not valid java name and contains not printable characters */
    public static void m504(Object obj) {
        if (C0058.m2184() >= 0) {
            ((o9) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۟ۧۤۢۤ, reason: not valid java name and contains not printable characters */
    public static boolean m505(Object obj, Object obj2) {
        if (C0078.m3044() < 0) {
            return ((Rect) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۥۨۦ, reason: not valid java name and contains not printable characters */
    public static boolean m506(Object obj) {
        if (C0072.m2856() < 0) {
            return ((View) obj).getFitsSystemWindows();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۧۤۤ, reason: not valid java name and contains not printable characters */
    public static byte[][] m507(Object obj) {
        if (C0243.m9964() > 0) {
            return ((fn) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨ۟۠, reason: not valid java name and contains not printable characters */
    public static String m508(String str) {
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

    /* JADX INFO: renamed from: ۟ۨۥۧ, reason: not valid java name and contains not printable characters */
    public static ie m509(Object obj) {
        if (C0066.m2514() >= 0) {
            return zl.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((yi) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m510(Object obj) {
        if (C0010.m354() <= 0) {
            ((View) obj).forceLayout();
        }
    }

    /* JADX INFO: renamed from: ۠ۧۧۧ, reason: not valid java name and contains not printable characters */
    public static com.example.vcam.Menu m511(Object obj) {
        if (C0194.m7889() > 0) {
            return ((oh) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۡۧ, reason: not valid java name and contains not printable characters */
    public static int[] m512(Object obj) {
        if (C0052.m1890() >= 0) {
            return ((fn) obj).p();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۧۡ, reason: not valid java name and contains not printable characters */
    public static void m513(Object obj, boolean z) {
        if (C0079.m3072() <= 0) {
            ((s6) obj).k(z);
        }
    }

    /* JADX INFO: renamed from: ۢۥۦۢ, reason: not valid java name and contains not printable characters */
    public static boolean m514(Object obj) {
        if (C0239.m9805() < 0) {
            return ((ws.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).l();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m515(Object obj, int i) {
        if (C0148.m6464() < 0) {
            ((pr) obj).setTint(i);
        }
    }

    /* JADX INFO: renamed from: ۢۨۧ۟, reason: not valid java name and contains not printable characters */
    public static Activity m516(Object obj) {
        if (C0178.m7344() < 0) {
            return ((x.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۨۦ, reason: not valid java name and contains not printable characters */
    public static Object m517(Object obj) {
        if (C0194.m7889() > 0) {
            return ((ObjectInputStream) obj).readObject();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡ۟, reason: not valid java name and contains not printable characters */
    public static Paint.Cap m518() {
        if (C0049.m1767() < 0) {
            return Paint.Cap.BUTT;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۥۦ, reason: not valid java name and contains not printable characters */
    public static PrecomputedText.Params.Builder m519(Object obj, int i) {
        if (C0217.m8693() < 0) {
            return ((PrecomputedText.Params.Builder) obj).setBreakStrategy(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۢ۟, reason: not valid java name and contains not printable characters */
    public static Set m520(Object obj) {
        if (C0232.m9299() >= 0) {
            return ((WeakHashMap) obj).keySet();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۤۦ, reason: not valid java name and contains not printable characters */
    public static void m521(Object obj, Object obj2) {
        if (C0068.m2650() >= 0) {
            wr.d.n((View) obj, (String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۤۦ۠, reason: not valid java name and contains not printable characters */
    public static void m522(Object obj, Object obj2) {
        if (C0093.m3365() > 0) {
            ((xs.d) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۨۨۤ, reason: not valid java name and contains not printable characters */
    public static MenuItem m523(Object obj, char c, int i) {
        if (C0055.m2054() > 0) {
            return ((MenuItem) obj).setNumericShortcut(c, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠۟ۥ, reason: contains not printable characters */
    public static String m524(Object obj, Object obj2) {
        if (C0215.m8604() <= 0) {
            return ((MediaFormat) obj).getString((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۦۨ, reason: contains not printable characters */
    public static int m525(Object obj) {
        if (C0235.m9535() <= 0) {
            return ((Configuration) obj).keyboard;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۤۤۢ, reason: contains not printable characters */
    public static void m526(Object obj, boolean z) {
        if (C0096.m3601() < 0) {
            ((ws) obj).h(z);
        }
    }

    /* JADX INFO: renamed from: ۥۨۥ۠, reason: contains not printable characters */
    public static StringBuilder m527(Object obj, double d) {
        if (C0128.m5064() <= 0) {
            return ((StringBuilder) obj).append(d);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۥۦ, reason: contains not printable characters */
    public static void m528(Object obj, Object obj2) {
        if (C0219.m8794() > 0) {
            ((ArrayDeque) obj).push(obj2);
        }
    }

    /* JADX INFO: renamed from: ۦ۟ۨۨ, reason: contains not printable characters */
    public static MenuItem m529(Object obj, boolean z) {
        if (C0051.m1783() < 0) {
            return ((MenuItem) obj).setEnabled(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۡۥ, reason: contains not printable characters */
    public static b9 m530() {
        if (C0259.m10136() >= 0) {
            return b9.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۠ۢ, reason: contains not printable characters */
    public static int m531(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦۥ۟ۤ, reason: contains not printable characters */
    public static boolean m532(Object obj) {
        if (C0051.m1783() < 0) {
            return ((ListView) obj).isShown();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۧۦۢ, reason: contains not printable characters */
    public static t5 m533(Object obj) {
        if (C0021.m740() <= 0) {
            return ((i7) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧۨۢ, reason: contains not printable characters */
    public static PackageManager m534(Object obj) {
        if (C0225.m9001() >= 0) {
            return ((Activity) obj).getPackageManager();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۧۢ, reason: contains not printable characters */
    public static void m535(Object obj, long j) {
        if (C0062.m2326() > 0) {
            ((vl) obj).j(j);
        }
    }

    /* JADX INFO: renamed from: ۧ۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static Calendar m536() {
        if (C0079.m3072() < 0) {
            return Calendar.getInstance();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static int m537(Object obj) {
        if (C0062.m2326() > 0) {
            return ((WindowInsets) obj).getStableInsetRight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۡۦ, reason: not valid java name and contains not printable characters */
    public static String m538(Object obj, Object obj2) {
        if (C0112.m4054() <= 0) {
            return ej.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj, (ComponentName) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Drawable m539(Object obj) {
        if (C0182.m7528() < 0) {
            return ((pr) obj).mutate();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۦ۠, reason: not valid java name and contains not printable characters */
    public static void m540(Object obj, boolean z) {
        if (C0020.m701() >= 0) {
            MainActivity.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.m5569((MainActivity.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj, z);
        }
    }

    /* JADX INFO: renamed from: ۧۤۡۧ, reason: not valid java name and contains not printable characters */
    public static SurfaceTexture m541() {
        if (C0112.m4054() < 0) {
            return HookMain.c2_virtual_surfaceTexture;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۤ, reason: not valid java name and contains not printable characters */
    public static long m542(Object obj) {
        if (C0051.m1783() < 0) {
            return ((ks) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static void m543(Object obj, Object obj2, int i, int i2, float f, float f2, Object obj3) {
        if (C0093.m3365() > 0) {
            ((Canvas) obj).drawText((char[]) obj2, i, i2, f, f2, (Paint) obj3);
        }
    }

    /* JADX INFO: renamed from: ۨۤۥۣ, reason: not valid java name and contains not printable characters */
    public static r m544(Object obj) {
        if (C0233.m9365() <= 0) {
            return ((vo) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۨۥ, reason: not valid java name and contains not printable characters */
    public static int m545() {
        return (-402) ^ C0023.f22;
    }

    /* JADX INFO: renamed from: ۟ۦۣۡ, reason: not valid java name and contains not printable characters */
    public static String m495(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
