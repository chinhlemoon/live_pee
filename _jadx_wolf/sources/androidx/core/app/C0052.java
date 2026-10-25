package androidx.core.app;

import android.app.Dialog;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.Signature;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.app.C0002;
import android.support.v4.app.C0004;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0011;
import android.text.Spannable;
import android.text.StaticLayout;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.SubMenu;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.InputContentInfo;
import android.widget.FrameLayout;
import android.widget.ListView;
import androidx.activity.C0017;
import androidx.annotation.C0024;
import androidx.annotation.C0025;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0034;
import androidx.appcompat.app.C0035;
import androidx.appcompat.app.C0036;
import androidx.appcompat.app.C0037;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.C0047;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.cardview.widget.C0049;
import androidx.core.content.C0058;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.C0065;
import androidx.core.widget.C0069;
import androidx.emoji2.text.C0079;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0096;
import androidx.lifecycle.C0108;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0118;
import androidx.profileinstaller.C0119;
import androidx.savedstate.C0122;
import androidx.versionedparcelable.C0129;
import androidx.versionedparcelable.C0135;
import com.example.vcam.HookMain;
import com.example.vcam.LicenseManager;
import com.example.vcam.Menu;
import com.example.vcam.VideoToFrames;
import com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ef;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ik;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kh;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.nf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.w6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import okhttp3.C0238;
import okhttp3.C0239;
import okhttp3.HttpUrl;
import okhttp3.internal.C0227;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.io.C0195;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.ws.C0224;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0234;
import okhttp3.logging.C0235;
import okhttp3.logging.C0236;
import org.json.JSONArray;
import retrofit2.C0259;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: androidx.core.app.۟۠ۢۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0052 {

    /* JADX INFO: renamed from: ۟ۥۨۥ, reason: not valid java name and contains not printable characters */
    public static int f46 = -606;

    /* JADX INFO: renamed from: ۟۟ۢۤۦ, reason: not valid java name and contains not printable characters */
    public static void m1854(Object obj, Object obj2) throws IOException {
        if (C0031.m1148() < 0) {
            ((VideoToFrames) obj).videoDecode((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۥۨۥ, reason: not valid java name and contains not printable characters */
    public static boolean m1855(Object obj) {
        if (C0065.m2448() >= 0) {
            return ((qm) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۧۧۡ, reason: not valid java name and contains not printable characters */
    public static boolean m1856(Object obj) {
        if (C0094.m3450() >= 0) {
            return ((m2) obj).g;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۢۧۤ, reason: not valid java name and contains not printable characters */
    public static byte m1857(Object obj) {
        if (C0037.m1437() < 0) {
            return ((s2) obj).L();
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static String m1858(Object obj) {
        if (C0224.m8861() <= 0) {
            return ((a9.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static rl.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m1859() {
        if (C0178.m7344() <= 0) {
            return rl.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۦۦ, reason: not valid java name and contains not printable characters */
    public static double m1860(double d) {
        if (C0065.m2448() > 0) {
            return Math.sin(d);
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: ۟ۡۤۢۡ, reason: not valid java name and contains not printable characters */
    public static void m1861(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        if (C0079.m3072() <= 0) {
            wr.L((View) obj, (Context) obj2, (int[]) obj3, (AttributeSet) obj4, (TypedArray) obj5, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۤۢۦ, reason: not valid java name and contains not printable characters */
    public static int m1862(Object obj, int i) {
        if (C0161.m6744() >= 0) {
            return ((Menu) obj).lastX = i;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۥۥ۠, reason: not valid java name and contains not printable characters */
    public static String m1863(String str) {
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

    /* JADX INFO: renamed from: ۟ۢ۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static List m1864(Object obj) {
        if (C0187.m7613() > 0) {
            return i9.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Signature[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static int m1865(int i, int i2, int i3) {
        if (C0049.m1767() <= 0) {
            return tl.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, i2, i3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static void m1866(Object obj, Object obj2) {
        if (C0047.m1663() <= 0) {
            ((View) obj).getWindowVisibleDisplayFrame((Rect) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۤۢۤ, reason: not valid java name and contains not printable characters */
    public static void m1867(Object obj) {
        if (C0204.m8270() < 0) {
            ((s2) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۟ۢۤۨ۟, reason: not valid java name and contains not printable characters */
    public static boolean m1868() {
        if (C0236.m9615() > 0) {
            return xs.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۦۥۥ, reason: not valid java name and contains not printable characters */
    public static void m1869(Object obj) {
        if (C0096.m3601() <= 0) {
            ((PrintStream) obj).println();
        }
    }

    /* JADX INFO: renamed from: ۟ۢۧۥۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1870(Object obj, Object obj2) {
        if (C0162.m6837() <= 0) {
            return i4.i((Collection) obj, (Iterable) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static float[] m1871(Object obj) {
        if (C0187.m7613() >= 0) {
            return ((m2) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤ۠, reason: not valid java name and contains not printable characters */
    public static o5 m1872(Object obj) {
        if (C0191.m7812() >= 0) {
            return wr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((o5) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۦۣ, reason: not valid java name and contains not printable characters */
    public static Object m1873(Object obj, Object obj2) {
        if (C0034.m1206() < 0) {
            return ((TreeMap) obj).get(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۨ۠, reason: not valid java name and contains not printable characters */
    public static void m1874(Object obj, Object obj2) {
        if (C0259.m10136() > 0) {
            ((xd) obj).L(obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static Context m1875(Object obj) {
        if (C0238.m9653() > 0) {
            return ((LicenseManager) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static String m1876(Object obj) {
        if (C0024.m896() >= 0) {
            return ((xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static int m1877(Object obj) {
        if (C0215.m8604() < 0) {
            return ((xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m1878(Object obj, Object obj2, int i, int i2, int i3) {
        if (C0227.m9046() >= 0) {
            ((Spannable) obj).setSpan(obj2, i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۤۤ۟, reason: not valid java name and contains not printable characters */
    public static int m1879() {
        if (C0025.m934() >= 0) {
            return u0.e();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۥۡۦ, reason: not valid java name and contains not printable characters */
    public static hr m1880() {
        if (C0108.m4038() >= 0) {
            return hr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۦ۠, reason: not valid java name and contains not printable characters */
    public static boolean m1881(Object obj) {
        if (C0017.m627() >= 0) {
            return z9.u((Transition) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۤۧۥ, reason: not valid java name and contains not printable characters */
    public static Locale[] m1882(Object obj) {
        if (C0036.m1332() < 0) {
            return ((nf) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۦۢ, reason: not valid java name and contains not printable characters */
    public static int[] m1883() {
        if (C0200.m8104() < 0) {
            return i0.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۨۡ, reason: not valid java name and contains not printable characters */
    public static Method m1884(Object obj) {
        if (C0058.m2184() > 0) {
            return l1.c((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۢ۠, reason: not valid java name and contains not printable characters */
    public static int m1885(double d, double d2, double d3) {
        if (C0225.m9001() >= 0) {
            return n4.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(d, d2, d3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۨۤۢ, reason: not valid java name and contains not printable characters */
    public static Drawable m1886(Object obj, Object obj2) {
        if (C0035.m1268() < 0) {
            return ((qo) obj).e((ComponentName) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۨ, reason: not valid java name and contains not printable characters */
    public static void m1887(Object obj, int i) {
        if (C0235.m9535() <= 0) {
            ((FrameLayout) obj).setId(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static SubMenu m1888(Object obj, int i) {
        if (C0069.m2756() <= 0) {
            return ((SubMenu) obj).setIcon(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۡۢ, reason: not valid java name and contains not printable characters */
    public static ColorFilter m1889(Object obj) {
        if (C0249.m10052() < 0) {
            return q7.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Drawable) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۧۢ, reason: not valid java name and contains not printable characters */
    public static int m1890() {
        return 275 ^ C0047.f41;
    }

    /* JADX INFO: renamed from: ۟ۦۦ۠۠, reason: not valid java name and contains not printable characters */
    public static ColorStateList m1891(Object obj, int i) {
        if (C0053.m1959() >= 0) {
            return ContextCompat.getColorStateList((Context) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۨۦ, reason: not valid java name and contains not printable characters */
    public static String m1892(Object obj, long j) {
        if (C0002.m72() > 0) {
            return ((s2) obj).i(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡ۠, reason: not valid java name and contains not printable characters */
    public static v0 m1893(Object obj) {
        if (C0182.m7528() <= 0) {
            return v0.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static AtomicReferenceFieldUpdater m1894() {
        if (C0004.m139() <= 0) {
            return i7.c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۢۨ, reason: not valid java name and contains not printable characters */
    public static void m1895(Object obj, int i) {
        if (C0094.m3450() > 0) {
            ef.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ListView) obj, i);
        }
    }

    /* JADX INFO: renamed from: ۡ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static v9 m1896(Object obj) {
        if (C0182.m7528() <= 0) {
            return ((y9) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۤۥ, reason: not valid java name and contains not printable characters */
    public static xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m1897(Object obj, Object obj2, Object obj3) {
        if (C0135.m5274() <= 0) {
            return ((xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Parcel) obj2, (ClassLoader) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static HookMain m1898(Object obj) {
        if (C0171.m7136() < 0) {
            return ((HookMain.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m1899(Object obj, int i, int i2) {
        if (C0162.m6837() < 0) {
            return ((zr) obj).p(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۨ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m1900(Object obj) {
        if (C0201.m8184() <= 0) {
            return ((JSONArray) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۤۤ, reason: not valid java name and contains not printable characters */
    public static void m1901(Object obj, boolean z) {
        if (C0113.m4144() <= 0) {
            ((ActionBarContainer) obj).setTransitioning(z);
        }
    }

    /* JADX INFO: renamed from: ۣ۠۠, reason: not valid java name and contains not printable characters */
    public static ComponentName m1902(Object obj) {
        if (C0055.m2054() >= 0) {
            return ((SearchableInfo) obj).getSearchActivity();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static int m1903(Object obj) {
        if (C0119.m4573() >= 0) {
            return ((Bundle) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۦۢۤ, reason: not valid java name and contains not printable characters */
    public static Set m1904(Object obj) {
        if (C0188.m7736() < 0) {
            return ((p8) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۡۤ, reason: not valid java name and contains not printable characters */
    public static Uri m1905(Object obj) {
        if (C0011.m458() >= 0) {
            return ((InputContentInfo) obj).getContentUri();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static int m1906(int i) {
        if (C0069.m2756() <= 0) {
            return Math.abs(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤ۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static TypedValue m1907(Object obj) {
        if (C0053.m1959() >= 0) {
            return ((ContentFrameLayout) obj).getFixedHeightMajor();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۦۣ, reason: not valid java name and contains not printable characters */
    public static String m1908(Object obj) {
        if (C0235.m9535() < 0) {
            return ((ActivityInfo) obj).parentActivityName;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۤ, reason: not valid java name and contains not printable characters */
    public static void m1909(Object obj, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        if (C0187.m7613() >= 0) {
            mk.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Path) obj, d, d2, d3, d4, d5, d6, d7, d8, d9);
        }
    }

    /* JADX INFO: renamed from: ۤۡۤۧ, reason: not valid java name and contains not printable characters */
    public static dd m1910(Object obj) {
        if (C0036.m1332() <= 0) {
            return ((xs.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۦۢ, reason: not valid java name and contains not printable characters */
    public static int m1911(Object obj) {
        if (C0118.m4454() >= 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟ۦۤ, reason: contains not printable characters */
    public static int m1912(Object obj) {
        if (C0249.m10052() < 0) {
            return ((qo) obj).r;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۠ۧۤ, reason: contains not printable characters */
    public static mf m1913(Object obj, Object obj2) {
        if (C0129.m5108() > 0) {
            return qf.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((mf) obj, (mf) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤ۟۟, reason: contains not printable characters */
    public static void m1914(Object obj) {
        if (C0172.m7180() >= 0) {
            LockSupport.unpark((Thread) obj);
        }
    }

    /* JADX INFO: renamed from: ۦ۠۠۠, reason: contains not printable characters */
    public static boolean m1916(Object obj, Object obj2) {
        if (C0195.m7914() > 0) {
            return ik.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Paint) obj, (String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۣ۠ۥ, reason: contains not printable characters */
    public static boolean m1917(Object obj, Object obj2, int i, Object obj3, int i2) {
        if (C0113.m4144() < 0) {
            return ((v0) obj).D0((v0.k) obj2, i, (KeyEvent) obj3, i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۤۢۡ, reason: contains not printable characters */
    public static int m1918(Object obj) {
        if (C0162.m6837() <= 0) {
            return ((ColorStateList) obj).getDefaultColor();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۤۥۨ, reason: contains not printable characters */
    public static boolean m1919(Object obj) {
        if (C0002.m72() > 0) {
            return ((j0.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۥۦۧ, reason: contains not printable characters */
    public static void m1920(Object obj, Object obj2, Object obj3) {
        if (C0204.m8270() < 0) {
            ((w6) obj).P((y5) obj2, (Runnable) obj3);
        }
    }

    /* JADX INFO: renamed from: ۦۦۦ, reason: contains not printable characters */
    public static String m1921(Object obj) {
        if (C0234.m9461() <= 0) {
            return ((pr.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m1922(Object obj) {
        if (C0236.m9615() > 0) {
            return ((m9.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static StaticLayout.Builder m1923(Object obj, int i) {
        if (C0117.m4419() <= 0) {
            return ((StaticLayout.Builder) obj).setBreakStrategy(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m1924(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧۧۨۧ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.AccessibilityAction m1925() {
        if (C0227.m9046() > 0) {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۢۥ, reason: not valid java name and contains not printable characters */
    public static Dialog m1926(Object obj) {
        if (C0006.m169() <= 0) {
            return ((kh) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۡۥ, reason: not valid java name and contains not printable characters */
    public static void m1927(Object obj, Object obj2, Object obj3) {
        if (C0239.m9805() <= 0) {
            ((z9) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj2, (ArrayList) obj3);
        }
    }

    /* JADX INFO: renamed from: ۨۧۡ۠, reason: not valid java name and contains not printable characters */
    public static void m1928(Object obj, Object obj2) {
        if (C0122.m4736() <= 0) {
            ((e) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((StringBuilder) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۨۤ۠, reason: not valid java name and contains not printable characters */
    public static boolean m1929(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0025.m934() > 0) {
            return ((e.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((e) obj2, (e.a) obj3, (e.a) obj4);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦ۟ۨ, reason: contains not printable characters */
    public static String m1915(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
