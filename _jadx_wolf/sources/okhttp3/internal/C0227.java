package okhttp3.internal;

import android.app.LocaleManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Looper;
import android.support.v4.app.C0002;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0010;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.Switch;
import androidx.activity.C0020;
import androidx.annotation.C0023;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0036;
import androidx.appcompat.app.C0037;
import androidx.appcompat.view.menu.C0039;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.widget.C0047;
import androidx.core.app.C0051;
import androidx.core.app.C0053;
import androidx.core.graphics.drawable.C0065;
import androidx.core.graphics.drawable.C0066;
import androidx.core.widget.C0068;
import androidx.drawerlayout.widget.C0070;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0079;
import androidx.emoji2.text.C0083;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0095;
import androidx.lifecycle.C0106;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0118;
import androidx.profileinstaller.C0119;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0126;
import androidx.versionedparcelable.C0129;
import androidx.versionedparcelable.C0133;
import androidx.versionedparcelable.C0135;
import com.example.vcam.C0141;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.HookMain;
import com.example.vcam.LicenseManager;
import com.example.vcam.MainActivity;
import com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.am;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.b;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.c3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.de;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.g7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.w3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.ProxySelector;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import okhttp3.C0239;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0195;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.ws.C0224;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0235;
import okhttp3.logging.C0236;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import retrofit2.converter.scalars.C0243;

/* JADX INFO: renamed from: okhttp3.internal.۠۠ۥۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0227 {

    /* JADX INFO: renamed from: ۟ۦۨۥۥ, reason: not valid java name and contains not printable characters */
    public static int f677 = -204;

    /* JADX INFO: renamed from: ۣ۟۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static void m9013(Object obj, boolean z) {
        if (C0053.m1959() > 0) {
            ((Field) obj).setAccessible(z);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۥۡۡ, reason: not valid java name and contains not printable characters */
    public static float[] m9014(Object obj) {
        if (C0243.m9964() > 0) {
            return ((zr) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static Resources.Theme m9015(Object obj) {
        if (C0036.m1332() < 0) {
            return ((s5) obj).getTheme();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۥۡ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m9016(Object obj, int i, Object obj2) {
        if (C0112.m4054() <= 0) {
            return ((Resources) obj).getColorStateList(i, (Resources.Theme) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۧۤ, reason: not valid java name and contains not printable characters */
    public static void m9017(Object obj, boolean z) {
        if (C0065.m2448() >= 0) {
            ((ThreadPoolExecutor) obj).allowCoreThreadTimeOut(z);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static boolean m9018(Object obj, Object obj2) {
        if (C0066.m2514() > 0) {
            return ((Drawable) obj).getPadding((Rect) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۧۢ۠, reason: not valid java name and contains not printable characters */
    public static void m9019(Object obj, Object obj2) {
        if (C0224.m8861() < 0) {
            ((a9) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ClassLoader) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۟۟۠, reason: not valid java name and contains not printable characters */
    public static void m9020(Object obj, Object obj2, char c) {
        if (C0187.m7613() >= 0) {
            ((Bundle) obj).putChar((String) obj2, c);
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m9021(Object obj) {
        if (C0240.m9826() > 0) {
            return ((String) obj).getBytes();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧ۟, reason: not valid java name and contains not printable characters */
    public static void m9022(Object obj, int i) {
        if (C0211.m8341() > 0) {
            ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).m(i);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨ۟, reason: not valid java name and contains not printable characters */
    public static long m9023() {
        if (C0195.m7914() >= 0) {
            return AnimationUtils.currentAnimationTimeMillis();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡۤۦۧ, reason: not valid java name and contains not printable characters */
    public static void m9024(Object obj, Object obj2) {
        if (C0126.m4908() <= 0) {
            ((AccessibilityNodeInfo) obj).setParent((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۨ۠ۢ, reason: not valid java name and contains not printable characters */
    public static AtomicReferenceFieldUpdater m9025() {
        if (C0118.m4454() > 0) {
            return xd.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۡۨ, reason: not valid java name and contains not printable characters */
    public static String m9026(Object obj) {
        if (C0037.m1437() < 0) {
            return ((LicenseManager) obj).m();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۥۨ, reason: not valid java name and contains not printable characters */
    public static void m9027(Object obj, Object obj2) {
        if (C0074.m2951() <= 0) {
            ((LinearLayout) obj).setBackground((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡ۟, reason: not valid java name and contains not printable characters */
    public static boolean m9028(Object obj) {
        if (C0240.m9826() > 0) {
            return ((vo) obj).expandActionView();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۧۡۢ, reason: not valid java name and contains not printable characters */
    public static boolean m9029(Object obj, Object obj2) {
        if (C0039.m1515() < 0) {
            return ((rn) obj).containsKey(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۨۧۥ, reason: not valid java name and contains not printable characters */
    public static Map m9030(Object obj) {
        if (C0065.m2448() >= 0) {
            return ((fs) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۧ, reason: not valid java name and contains not printable characters */
    public static void m9031(Object obj) {
        if (C0074.m2951() <= 0) {
            ((MainActivity) obj).l0();
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static Drawable.Callback m9032(Object obj) {
        if (C0070.m2829() < 0) {
            return ((r7.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۤۡ, reason: not valid java name and contains not printable characters */
    public static int m9033(Object obj) {
        if (C0201.m8184() <= 0) {
            return ((yk) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۢۧۧ, reason: not valid java name and contains not printable characters */
    public static boolean m9034(Object obj) {
        if (C0225.m9001() >= 0) {
            return ((Cursor) obj).isClosed();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۤۡۤ, reason: not valid java name and contains not printable characters */
    public static void m9035(Object obj, Object obj2) {
        if (C0023.m843() >= 0) {
            ((Switch) obj).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۤۦ۟, reason: not valid java name and contains not printable characters */
    public static boolean m9036(Object obj, int i, Object obj2) {
        if (C0133.m5208() < 0) {
            return ((Window.Callback) obj).onCreatePanelMenu(i, (Menu) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static w3 m9037(Object obj) {
        if (C0031.m1148() <= 0) {
            return ((xd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m9038(Object obj, Object obj2, Object obj3) {
        if (C0171.m7136() < 0) {
            return ((b.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Collection) obj2, (Collection) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۣۤۥ, reason: not valid java name and contains not printable characters */
    public static String m9039(Object obj) {
        if (C0178.m7344() < 0) {
            return ((Context) obj).getOpPackageName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۡۨ, reason: not valid java name and contains not printable characters */
    public static int m9040(Object obj) {
        if (C0040.m1622() < 0) {
            return ((View) obj).getTextDirection();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۦۣۤ, reason: not valid java name and contains not printable characters */
    public static int m9041(Object obj, int i, Object obj2, Object obj3) {
        if (C0093.m3365() >= 0) {
            return q1.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj, i, (String) obj2, (String) obj3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۧۥ۠, reason: not valid java name and contains not printable characters */
    public static void m9042(Object obj, Object obj2) {
        if (C0070.m2829() < 0) {
            ((c3) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((l9.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۧۨۡ, reason: not valid java name and contains not printable characters */
    public static Looper m9043() {
        if (C0020.m701() >= 0) {
            return Looper.getMainLooper();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۡۤ, reason: not valid java name and contains not printable characters */
    public static char m9044(Object obj) {
        if (C0079.m3072() < 0) {
            return ((p) obj).a;
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: ۟ۦۢۤۡ, reason: not valid java name and contains not printable characters */
    public static void m9045(Object obj, Object obj2) {
        if (C0217.m8693() < 0) {
            ((Drawable) obj).draw((Canvas) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۤ۟۟, reason: not valid java name and contains not printable characters */
    public static int m9046() {
        return 42 ^ C0126.f105;
    }

    /* JADX INFO: renamed from: ۟ۦۤ۟۠, reason: not valid java name and contains not printable characters */
    public static void m9047(Object obj, float f) {
        if (C0239.m9805() <= 0) {
            ((Paint) obj).setStrokeWidth(f);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۥۥۤ, reason: not valid java name and contains not printable characters */
    public static Object m9048(Object obj) {
        if (C0047.m1663() < 0) {
            return ((jk) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۥۨ, reason: not valid java name and contains not printable characters */
    public static de m9049(Object obj, Object obj2, Object obj3) {
        if (C0037.m1437() <= 0) {
            return ((am) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Class) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۨۡ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m9050(Object obj, Object obj2, int i) {
        if (C0141.m5769() >= 0) {
            return ((z0.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m9051(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static o5 m9052(Object obj, Object obj2) {
        if (C0065.m2448() >= 0) {
            return wr.G((View) obj, (o5) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static Class m9053(Object obj) {
        if (C0194.m7889() >= 0) {
            return ((x3) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۤۦ, reason: not valid java name and contains not printable characters */
    public static void m9054(Object obj) {
        if (C0116.m4340() > 0) {
            ((e.a) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۟ۧۡۧۨ, reason: not valid java name and contains not printable characters */
    public static boolean m9055(Object obj, Object obj2) {
        if (C0181.m7445() > 0) {
            return ((v0) obj).W((KeyEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۦۥ۠, reason: not valid java name and contains not printable characters */
    public static void m9056(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws XmlPullParserException, IOException {
        if (C0051.m1783() <= 0) {
            ((pr) obj).inflate((Resources) obj2, (XmlPullParser) obj3, (AttributeSet) obj4, (Resources.Theme) obj5);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۦۧۤ, reason: not valid java name and contains not printable characters */
    public static a3 m9057(Object obj) {
        if (C0135.m5274() <= 0) {
            return ((s2) obj).c0();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧ۟, reason: not valid java name and contains not printable characters */
    public static o0.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m9058() {
        if (C0068.m2650() > 0) {
            return o0.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m9059(Object obj, Object obj2) throws IOException {
        if (C0106.m3835() >= 0) {
            dl.h((InputStream) obj, (g7) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static void m9060(Object obj, Object obj2) {
        if (C0236.m9615() >= 0) {
            ((LocaleManager) obj).setApplicationLocales((LocaleList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static String m9061(Object obj) {
        if (C0181.m7445() > 0) {
            return ((xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۦ۟, reason: not valid java name and contains not printable characters */
    public static MessageDigest m9062(Object obj) {
        if (C0239.m9805() <= 0) {
            return MessageDigest.getInstance((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۧ۠, reason: not valid java name and contains not printable characters */
    public static Object m9063(Object obj) {
        if (C0120.m4608() >= 0) {
            return ((Future) obj).get();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۠, reason: not valid java name and contains not printable characters */
    public static void m9064(Object obj, Object obj2) {
        if (C0214.m8575() <= 0) {
            ((AccessibilityNodeInfo) obj).setClassName((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡۢۧ۠, reason: not valid java name and contains not printable characters */
    public static void m9065(Object obj) {
        if (C0171.m7136() < 0) {
            ProxySelector.setDefault((ProxySelector) obj);
        }
    }

    /* JADX INFO: renamed from: ۡۤۧۥ, reason: not valid java name and contains not printable characters */
    public static String m9066(String str) {
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

    /* JADX INFO: renamed from: ۡۥۤۧ, reason: not valid java name and contains not printable characters */
    public static String m9067(Object obj) {
        if (C0178.m7344() <= 0) {
            return ((k5) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۤۡ, reason: not valid java name and contains not printable characters */
    public static Object[] m9068(Object obj, int i, Object obj2) {
        if (C0006.m169() <= 0) {
            return Arrays.copyOf((Object[]) obj, i, (Class) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۥۣ, reason: not valid java name and contains not printable characters */
    public static void m9069(Object obj) {
        if (C0129.m5108() > 0) {
            C0171.m7083((Context) obj);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static int m9070(Object obj, Object obj2, Object obj3) {
        if (C0141.m5769() >= 0) {
            return ((i) obj).n((ClickableSpan) obj2, (SparseArray) obj3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۦۦۡ, reason: not valid java name and contains not printable characters */
    public static boolean m9071(Object obj) {
        if (C0181.m7445() > 0) {
            return ((k3) obj).n();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۡۨۡ, reason: not valid java name and contains not printable characters */
    public static String m9072() {
        if (C0204.m8270() <= 0) {
            return "۠۠ۢ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۡۢ, reason: not valid java name and contains not printable characters */
    public static void m9073(long j) {
        if (C0116.m4340() > 0) {
            LockSupport.parkNanos(j);
        }
    }

    /* JADX INFO: renamed from: ۥ۠ۨۥ, reason: contains not printable characters */
    public static void m9075(Object obj, Object obj2, Object obj3) {
        if (C0040.m1622() <= 0) {
            ((Bundle) obj).putIntArray((String) obj2, (int[]) obj3);
        }
    }

    /* JADX INFO: renamed from: ۥۢۧۤ, reason: contains not printable characters */
    public static TypedValue m9076() {
        if (C0204.m8270() < 0) {
            return mp.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۨ۠, reason: contains not printable characters */
    public static void m9077(Object obj) {
        if (C0002.m72() >= 0) {
            ((PopupWindow) obj).dismiss();
        }
    }

    /* JADX INFO: renamed from: ۥۧ۠۟, reason: contains not printable characters */
    public static void m9078(Object obj, Object obj2) {
        if (C0191.m7812() > 0) {
            ((ConnectionBlocker) obj).p((File) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۣۣ, reason: contains not printable characters */
    public static String m9079(Object obj) {
        if (C0047.m1663() < 0) {
            return ((a9) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۡۦ, reason: contains not printable characters */
    public static boolean m9080() {
        if (C0215.m8604() < 0) {
            return HookMain.is_hooked;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۤۤۧ, reason: contains not printable characters */
    public static CharSequence m9081(Object obj) {
        if (C0119.m4573() >= 0) {
            return ((vo) obj).getTooltipText();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥ۠ۢ, reason: contains not printable characters */
    public static Drawable m9082(Object obj, Object obj2) {
        if (C0051.m1783() <= 0) {
            return ((qo) obj).j((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m9083(Object obj, int i) {
        if (C0200.m8104() < 0) {
            ((PopupWindow) obj).setHeight(i);
        }
    }

    /* JADX INFO: renamed from: ۧۧۨۧ, reason: not valid java name and contains not printable characters */
    public static String m9084(Object obj) {
        if (C0178.m7344() <= 0) {
            return ((AttributeSet) obj).getClassAttribute();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۨۨ, reason: not valid java name and contains not printable characters */
    public static String m9085(Object obj) {
        if (C0095.m3478() <= 0) {
            return ((View) obj).getTransitionName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static boolean m9086(Object obj) {
        if (C0094.m3450() > 0) {
            return ((lg.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۢ۠ۦ, reason: not valid java name and contains not printable characters */
    public static o5 m9087(Object obj) {
        if (C0083.m3188() < 0) {
            return wr.A((o5) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۧۨ, reason: not valid java name and contains not printable characters */
    public static void m9088(Object obj) {
        if (C0214.m8575() < 0) {
            ((v0.g) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۨۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static Object m9089(Object obj, int i) {
        if (C0235.m9535() <= 0) {
            return ((rn) obj).d(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۥۢ, reason: not valid java name and contains not printable characters */
    public static boolean m9090(Object obj) {
        if (C0010.m354() < 0) {
            return hm.i((Drawable) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨۨۨ, reason: not valid java name and contains not printable characters */
    public static boolean m9091(Object obj) {
        if (C0083.m3188() < 0) {
            return ((v0) obj).z;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤۨۧ, reason: not valid java name and contains not printable characters */
    public static String m9074(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
