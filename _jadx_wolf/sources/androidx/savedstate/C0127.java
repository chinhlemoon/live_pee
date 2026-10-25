package androidx.savedstate;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.ClipData;
import android.content.Context;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.fonts.FontStyle;
import android.graphics.fonts.FontVariationAxis;
import android.hardware.Camera;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.support.v4.app.C0004;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0009;
import android.support.v4.graphics.drawable.C0011;
import android.util.AttributeSet;
import android.view.ContentInfo;
import android.view.Display;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.activity.C0020;
import androidx.activity.C0021;
import androidx.annotation.C0026;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0035;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.C0047;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0051;
import androidx.core.app.C0052;
import androidx.core.app.C0053;
import androidx.core.app.C0055;
import androidx.core.content.C0057;
import androidx.core.graphics.drawable.C0065;
import androidx.core.graphics.drawable.C0066;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0083;
import androidx.emoji2.text.C0084;
import androidx.emoji2.text.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0096;
import androidx.fragment.app.C0097;
import androidx.fragment.app.C0099;
import androidx.lifecycle.C0107;
import androidx.lifecycle.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.lifecycle.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0118;
import androidx.profileinstaller.C0120;
import androidx.versionedparcelable.C0129;
import com.example.vcam.C0141;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.HookMain;
import com.example.vcam.LicenseManager;
import com.example.vcam.Menu;
import com.example.vcam.VideoToFrames;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dh;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dt;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gi;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.js;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ke;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.oj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.w6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wh;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ym;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.function.Predicate;
import okhttp3.HttpUrl;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.io.C0195;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.logging.C0231;
import okhttp3.logging.C0236;
import retrofit2.C0259;
import retrofit2.converter.scalars.C0243;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: androidx.savedstate.ۨۢۦۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0127 {

    /* JADX INFO: renamed from: ۤ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static int f106 = -794;

    /* JADX INFO: renamed from: ۟۟۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static String m4930(String str) {
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

    /* JADX INFO: renamed from: ۣ۟۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m4931(Object obj) {
        if (C0182.m7528() < 0) {
            return ((dt) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۡۦۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4932(Object obj) {
        if (C0009.m276() < 0) {
            return ((j0) obj).n;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۤۦۦ, reason: not valid java name and contains not printable characters */
    public static String m4933() {
        if (C0031.m1148() < 0) {
            return Build.VERSION.RELEASE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m4934(Object obj, Object obj2, int i) {
        if (C0020.m701() >= 0) {
            return ((String) obj).lastIndexOf((String) obj2, i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۥۨۨ, reason: not valid java name and contains not printable characters */
    public static AppCompatAutoCompleteTextView m4935(Object obj, Object obj2, Object obj3) {
        if (C0181.m7445() > 0) {
            return ((m1) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj2, (AttributeSet) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۡ, reason: not valid java name and contains not printable characters */
    public static int m4936(Object obj) {
        if (C0149.m6476() < 0) {
            return ((qo) obj).s;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۨۤۢ, reason: not valid java name and contains not printable characters */
    public static long m4937(Object obj, long j, long j2, long j3, int i, Object obj2) {
        if (C0149.m6476() < 0) {
            return C0187.m7638((String) obj, j, j2, j3, i);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟۠۠۟, reason: not valid java name and contains not printable characters */
    public static Class m4938(Object obj, Object obj2) {
        if (C0035.m1268() <= 0) {
            return ((rr) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Class) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static o5 m4939(Object obj) {
        if (C0083.m3188() <= 0) {
            return ((o5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۤۢ, reason: not valid java name and contains not printable characters */
    public static char[] m4940(Object obj) {
        if (C0066.m2514() >= 0) {
            return ((xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static z0 m4941(Object obj) {
        if (C0011.m458() >= 0) {
            return ((p0) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static LicenseManager m4942(Object obj) {
        if (C0053.m1959() >= 0) {
            return ((LicenseManager.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static byte[] m4943() {
        if (C0107.m3883() >= 0) {
            return t2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۨۡ, reason: not valid java name and contains not printable characters */
    public static void m4944(Object obj, Object obj2, Object obj3) {
        if (C0052.m1890() >= 0) {
            ((wr.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj2, obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static boolean m4945(Object obj) {
        if (C0051.m1783() < 0) {
            return oj.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((NotificationManager) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static void m4946(Object obj, Object obj2) {
        if (C0069.m2756() <= 0) {
            ((xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۤۤۥ, reason: not valid java name and contains not printable characters */
    public static MenuItem m4947(Object obj, Object obj2) {
        if (C0078.m3044() < 0) {
            return ((p2) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((MenuItem) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۧۧ, reason: not valid java name and contains not printable characters */
    public static View m4948(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0084.m3253() < 0) {
            return ((k6) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj2, (Cursor) obj3, (ViewGroup) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۡۨ, reason: not valid java name and contains not printable characters */
    public static a6 m4949() {
        if (C0069.m2756() <= 0) {
            return w6.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧ۠, reason: not valid java name and contains not printable characters */
    public static int m4950() {
        return (-485) ^ C0115.f95;
    }

    /* JADX INFO: renamed from: ۟ۢۤۧۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4951(Object obj) {
        if (C0118.m4454() >= 0) {
            return ((s2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۦۤ۟, reason: not valid java name and contains not printable characters */
    public static int m4952(Object obj) {
        if (C0057.m2142() >= 0) {
            return ((View) obj).getScrollY();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠۟, reason: not valid java name and contains not printable characters */
    public static String m4953(Object obj) {
        if (C0047.m1663() <= 0) {
            return LicenseManager.i((byte[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۥ, reason: not valid java name and contains not printable characters */
    public static AtomicReferenceFieldUpdater m4954() {
        if (C0259.m10136() >= 0) {
            return uf.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۨ, reason: not valid java name and contains not printable characters */
    public static void m4955(Object obj, boolean z) {
        if (C0021.m740() <= 0) {
            tk.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((PopupWindow) obj, z);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static v0.k m4956(Object obj, int i) {
        if (C0031.m1148() < 0) {
            return ((v0) obj).i0(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۣ۟, reason: not valid java name and contains not printable characters */
    public static void m4957(Object obj, long j) {
        if (C0065.m2448() >= 0) {
            ((f2) obj).timeoutAt = j;
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۨۢ, reason: not valid java name and contains not printable characters */
    public static Object m4958() {
        if (C0094.m3450() >= 0) {
            return sf.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡ۠۠, reason: not valid java name and contains not printable characters */
    public static Object m4959(Object obj) {
        if (C0231.m9265() > 0) {
            return ((ke) obj).getDelegate();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۥۢ, reason: not valid java name and contains not printable characters */
    public static int m4960(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۤۦۦ, reason: not valid java name and contains not printable characters */
    public static String m4961(Object obj) {
        if (C0006.m169() <= 0) {
            return ((ConnectionBlocker.BlockRule) obj).description;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۦۨ, reason: not valid java name and contains not printable characters */
    public static void m4962(Object obj, Object obj2) {
        if (C0078.m3044() < 0) {
            ((View) obj).addOnAttachStateChangeListener((View.OnAttachStateChangeListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static List m4963(Object obj, Object obj2) {
        if (C0117.m4419() <= 0) {
            return ((xd.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).b((Throwable) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m4964(Object obj, Object obj2) {
        if (C0004.m139() <= 0) {
            return ((o9) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((MotionEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۣۤۡ, reason: not valid java name and contains not printable characters */
    public static void m4965(Object obj, Object obj2) {
        if (C0065.m2448() > 0) {
            ((k7) obj).b0(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۨ۠ۡ, reason: not valid java name and contains not printable characters */
    public static float m4966(Object obj, Object obj2) {
        if (C0055.m2054() >= 0) {
            return ((e3) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((e3) obj2);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۦ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m4967(Object obj, Object obj2, Object obj3) {
        if (C0129.m5108() > 0) {
            return ((wr.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).c((CharSequence) obj2, (CharSequence) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦ۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m4968(int i, int i2) {
        if (C0161.m6744() > 0) {
            return n4.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۣۢۢ, reason: not valid java name and contains not printable characters */
    public static boolean m4969(Object obj) {
        if (C0116.m4340() > 0) {
            return ((TextView) obj).isInEditMode();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۣۡۤ, reason: not valid java name and contains not printable characters */
    public static void m4970(Object obj, Object obj2) {
        if (C0171.m7136() <= 0) {
            Menu.m5668((Menu) obj, (View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۤۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m4971(Object obj, Object obj2) {
        if (C0176.m7290() > 0) {
            return ((rp) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((sp) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۥۤ۟, reason: not valid java name and contains not printable characters */
    public static void m4972(Object obj, Object obj2) {
        if (C0116.m4340() > 0) {
            ((MediaPlayer) obj).setSurface((Surface) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۢۧۢ, reason: not valid java name and contains not printable characters */
    public static int m4973(Object obj) {
        if (C0051.m1783() < 0) {
            return ((FontStyle) obj).getWeight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۨۢۤ, reason: not valid java name and contains not printable characters */
    public static xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m4974(Object obj) {
        if (C0188.m7736() <= 0) {
            return ((ym) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static int m4975(Object obj) {
        if (C0040.m1622() < 0) {
            return ((Map) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠, reason: not valid java name and contains not printable characters */
    public static void m4976(Object obj, Object obj2, Object obj3) {
        if (C0169.m7034() < 0) {
            ((com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).k((com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۠ۦ۟۟, reason: not valid java name and contains not printable characters */
    public static boolean m4977(Object obj, Object obj2) {
        if (C0195.m7914() > 0) {
            return ((List) obj).removeIf((Predicate) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static int m4978(Object obj) {
        if (C0236.m9615() > 0) {
            return ((Camera.Size) obj).height;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡ۟۟۟, reason: not valid java name and contains not printable characters */
    public static boolean m4979(Object obj) {
        if (C0051.m1783() <= 0) {
            return ((gi) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡ۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static void m4980(Object obj, Object obj2, int i) {
        if (C0201.m8184() < 0) {
            C0107.m3908((Context) obj, (String) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۡۤۧۧ, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m4981(Object obj) {
        if (C0187.m7613() >= 0) {
            return ((pr.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۦۧ, reason: not valid java name and contains not printable characters */
    public static File m4982(Object obj, Object obj2) {
        if (C0097.m3659() >= 0) {
            return ((uq) obj).b((ParcelFileDescriptor) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۢۢ, reason: not valid java name and contains not printable characters */
    public static void m4983(Object obj, Object obj2) {
        if (C0053.m1959() >= 0) {
            ((xs.d) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((xs) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢ۟ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4984(char c) {
        if (C0099.m3752() <= 0) {
            return q3.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(c);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۤۢۦ, reason: not valid java name and contains not printable characters */
    public static void m4985(Object obj, Object obj2) {
        if (C0243.m9964() > 0) {
            ((ActionBarContextView) obj).setSubtitle((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۤۢۧ, reason: not valid java name and contains not printable characters */
    public static void m4986(Object obj, Object obj2) {
        if (C0026.m1047() >= 0) {
            ((s6) obj).d((ScrollingTabContainerView) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۦۣ۠, reason: not valid java name and contains not printable characters */
    public static float m4987(Object obj) {
        if (C0057.m2142() >= 0) {
            return ((qm) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۢۦۦۧ, reason: not valid java name and contains not printable characters */
    public static int m4988(Object obj) {
        if (C0214.m8575() <= 0) {
            return ((uo.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۨۨۨ, reason: not valid java name and contains not printable characters */
    public static dn m4989(Object obj, int i) {
        if (C0099.m3752() < 0) {
            return ((s2) obj).e0(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4991(Object obj) {
        if (C0243.m9964() > 0) {
            return ((jf) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۡۡۡ, reason: not valid java name and contains not printable characters */
    public static int m4992(Object obj) {
        if (C0026.m1047() >= 0) {
            return Menu.m5661((Menu) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۥۣ۠, reason: not valid java name and contains not printable characters */
    public static void m4993(Object obj) {
        if (C0074.m2951() < 0) {
            ((VideoToFrames.Callback) obj).onFinishDecode();
        }
    }

    /* JADX INFO: renamed from: ۤۥۥۨ, reason: not valid java name and contains not printable characters */
    public static void m4994(Object obj, int i) {
        if (C0141.m5769() > 0) {
            kp.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj, i);
        }
    }

    /* JADX INFO: renamed from: ۤۥۦۡ, reason: not valid java name and contains not printable characters */
    public static int m4995(Object obj) {
        if (C0218.m8760() > 0) {
            return ((Display) obj).getWidth();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۢۡۧ, reason: contains not printable characters */
    public static p7 m4996(Object obj, boolean z, boolean z2, Object obj2) {
        if (C0065.m2448() > 0) {
            return ((rd) obj).M(z, z2, (qa) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۦ۠, reason: contains not printable characters */
    public static ClipData m4997(Object obj) {
        if (C0066.m2514() > 0) {
            return ((ContentInfo) obj).getClip();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۦۡ, reason: contains not printable characters */
    public static boolean m4998(Object obj, Object obj2) {
        if (C0094.m3450() >= 0) {
            return ((Activity) obj).shouldShowRequestPermissionRationale((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۦۨۡ, reason: contains not printable characters */
    public static WeakReference m4999(Object obj) {
        if (C0122.m4736() < 0) {
            return ((js) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡ۠ۤ, reason: contains not printable characters */
    public static Appendable m5000(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, Object obj6, Object obj7) {
        if (m4950() >= 0) {
            return l4.p((Iterable) obj, (Appendable) obj2, (CharSequence) obj3, (CharSequence) obj4, (CharSequence) obj5, i, (CharSequence) obj6, (qa) obj7);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤ۠, reason: contains not printable characters */
    public static v0.g m5001(Object obj) {
        if (C0021.m740() < 0) {
            return v0.g.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۧۤ, reason: contains not printable characters */
    public static void m5002(Object obj, int i) {
        if (C0195.m7914() > 0) {
            ((TextView) obj).setBreakStrategy(i);
        }
    }

    /* JADX INFO: renamed from: ۧ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static m6 m5003(Object obj) {
        if (C0120.m4608() >= 0) {
            return n6.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((o2) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static Method m5004(Object obj, Object obj2) {
        if (C0097.m3659() >= 0) {
            return ((rr) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Class) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۨ, reason: not valid java name and contains not printable characters */
    public static boolean m5005(Object obj, int i, int i2) {
        if (C0066.m2514() >= 0) {
            return HookMain.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((MediaPlayer) obj, i, i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static Object m5006(Object obj, Object obj2, Object obj3) {
        if (C0035.m1268() <= 0) {
            return ((n1) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Class) obj2, (Set) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۨۨ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.AccessibilityAction m5007() {
        if (C0057.m2142() >= 0) {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۡ, reason: not valid java name and contains not printable characters */
    public static float m5008(Object obj) {
        if (C0181.m7445() > 0) {
            return ((qm) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۨۥۥۡ, reason: not valid java name and contains not printable characters */
    public static n9.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa[] m5009(Object obj) {
        if (C0122.m4736() <= 0) {
            return ((n9.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦ۠۟, reason: not valid java name and contains not printable characters */
    public static Menu m5010(Object obj) {
        if (C0035.m1268() < 0) {
            return ((dh) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۡ۠, reason: not valid java name and contains not printable characters */
    public static FontVariationAxis[] m5011(Object obj) {
        if (C0249.m10052() < 0) {
            return FontVariationAxis.fromFontVariationSettings((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۢۥ, reason: not valid java name and contains not printable characters */
    public static void m5012(Object obj, boolean z) {
        if (C0096.m3601() < 0) {
            ((h8) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(z);
        }
    }

    /* JADX INFO: renamed from: ۨۧۤۤ, reason: not valid java name and contains not printable characters */
    public static wh m5013() {
        if (C0049.m1767() <= 0) {
            return wh.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۡ۟, reason: not valid java name and contains not printable characters */
    public static String m4990(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
