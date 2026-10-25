package androidx.profileinstaller;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.media.MediaExtractor;
import android.support.v4.app.C0002;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0011;
import android.transition.TransitionSet;
import android.util.SparseArray;
import android.util.StateSet;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.Surface;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.C0017;
import androidx.activity.C0020;
import androidx.activity.C0021;
import androidx.annotation.C0024;
import androidx.annotation.C0026;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0036;
import androidx.appcompat.app.C0037;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.view.menu.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.appcompat.widget.C0047;
import androidx.core.app.C0051;
import androidx.core.app.C0055;
import androidx.core.content.C0057;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0066;
import androidx.drawerlayout.widget.C0070;
import androidx.drawerlayout.widget.C0072;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0095;
import androidx.fragment.app.C0099;
import androidx.lifecycle.C0107;
import androidx.lifecycle.C0108;
import androidx.savedstate.C0122;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0135;
import com.example.vcam.HookMain;
import com.example.vcam.LicenseManager;
import com.example.vcam.MainActivity;
import com.example.vcam.Menu;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ak;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.am;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.cb;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.iq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ko;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ql;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.w2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.w8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import okhttp3.HttpUrl;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.io.C0195;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.internal.ws.C0224;
import okhttp3.logging.C0231;
import okhttp3.logging.C0232;
import okhttp3.logging.C0233;
import okhttp3.logging.C0235;
import okhttp3.logging.C0236;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: androidx.profileinstaller.۟۠ۢۦۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0113 {

    /* JADX INFO: renamed from: ۟ۧۢ۠۟, reason: not valid java name and contains not printable characters */
    public static int f93 = -373;

    /* JADX INFO: renamed from: ۟۟ۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m4128(String str) {
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

    /* JADX INFO: renamed from: ۟۟ۢۨۦ, reason: not valid java name and contains not printable characters */
    public static void m4129(Object obj) {
        if (C0024.m896() >= 0) {
            ((Surface) obj).release();
        }
    }

    /* JADX INFO: renamed from: ۟۟ۦ۠ۢ, reason: not valid java name and contains not printable characters */
    public static byte[] m4130(Object obj, Object obj2) {
        if (C0202.m8245() > 0) {
            return ((String) obj).getBytes((Charset) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۢ۠, reason: not valid java name and contains not printable characters */
    public static Thread m4131(Object obj, Object obj2) {
        if (C0195.m7914() > 0) {
            return C0200.m8053((String) obj, (Runnable) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۦ۠, reason: not valid java name and contains not printable characters */
    public static void m4132(Object obj, boolean z) {
        if (C0148.m6464() <= 0) {
            ((m) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(z);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۥۥۥ, reason: not valid java name and contains not printable characters */
    public static int m4133(Object obj) {
        if (C0070.m2829() < 0) {
            return ((TransitionSet) obj).getTransitionCount();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static void m4134(Object obj, Object obj2) {
        if (C0116.m4340() >= 0) {
            ((xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).J((xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۦ۠ۤ, reason: not valid java name and contains not printable characters */
    public static v0.k m4135(Object obj) {
        if (C0119.m4573() >= 0) {
            return ((v0) obj).I;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۣۢ, reason: not valid java name and contains not printable characters */
    public static float m4136(Object obj) {
        if (C0122.m4736() <= 0) {
            return ((zr) obj).e;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۡۨ۠, reason: not valid java name and contains not printable characters */
    public static xo m4137() {
        if (C0232.m9299() > 0) {
            return w8.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m4138(Object obj, Object obj2) {
        if (C0236.m9615() >= 0) {
            ((Map) obj).putAll((Map) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4139(Object obj) {
        if (C0011.m458() >= 0) {
            return ((v0) obj).v;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۤۨۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4140(Object obj, int i, Object obj2, int i2, int i3) {
        if (C0094.m3450() > 0) {
            return ((a3) obj).f(i, (byte[]) obj2, i2, i3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۥۨۤ, reason: not valid java name and contains not printable characters */
    public static ContentResolver m4141(Object obj) {
        if (C0024.m896() > 0) {
            return ((Context) obj).getContentResolver();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۨۧ, reason: not valid java name and contains not printable characters */
    public static void m4142(Object obj) {
        if (C0051.m1783() <= 0) {
            ((r0) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static l6 m4143(Object obj) {
        if (C0047.m1663() <= 0) {
            return ((k6) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static int m4144() {
        return 521 ^ C0215.f665;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤ۠, reason: not valid java name and contains not printable characters */
    public static double m4145(double d) {
        if (C0017.m627() > 0) {
            return Math.abs(d);
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡ۟, reason: not valid java name and contains not printable characters */
    public static void m4146(Object obj, boolean z) {
        if (C0235.m9535() <= 0) {
            ((Spinner) obj).setEnabled(z);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۤۦ۟, reason: not valid java name and contains not printable characters */
    public static int m4147(Object obj) {
        if (C0107.m3883() > 0) {
            return ((Rect) obj).top;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣۢۢ, reason: not valid java name and contains not printable characters */
    public static boolean m4148() {
        if (C0024.m896() >= 0) {
            return w2.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۥۡۦ, reason: not valid java name and contains not printable characters */
    public static ActionMode.Callback m4149(Object obj) {
        if (C0119.m4573() >= 0) {
            return ((kp.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static void m4150(Object obj, int i, Object obj2) {
        if (C0118.m4454() > 0) {
            ((SparseArray) obj).append(i, obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۡۨۧ, reason: not valid java name and contains not printable characters */
    public static void m4151(Object obj, Object obj2) {
        if (C0182.m7528() < 0) {
            C0135.m5300((HookMain) obj, (Context) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۥۥۥ, reason: not valid java name and contains not printable characters */
    public static void m4152(Object obj, Object obj2) throws IOException {
        if (C0024.m896() > 0) {
            ((FileOutputStream) obj).write((byte[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static xo m4153() {
        if (C0002.m72() >= 0) {
            return yd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۢۦ, reason: not valid java name and contains not printable characters */
    public static iq m4154() {
        if (C0231.m9265() >= 0) {
            return iq.f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۥۧ, reason: not valid java name and contains not printable characters */
    public static void m4155(Object obj, boolean z, long j, Object obj2) {
        if (C0020.m701() >= 0) {
            HookMain.n.m5482((HookMain.n) obj, z, j, (String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static tf m4156(Object obj, Object obj2) {
        if (C0235.m9535() <= 0) {
            return ((tf) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((tf) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢ۟, reason: not valid java name and contains not printable characters */
    public static boolean m4157(Object obj) {
        if (C0108.m4038() > 0) {
            return ((u7) obj).b();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۦۥۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4158(Object obj) {
        if (C0062.m2326() >= 0) {
            return ((gc) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۧ۠ۤ, reason: not valid java name and contains not printable characters */
    public static CharSequence m4159(Object obj) {
        if (C0148.m6464() < 0) {
            return ((i) obj).e();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static void m4160(Object obj, Object obj2) {
        if (C0006.m169() <= 0) {
            ((LicenseManager) obj).u((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۥۣ۠, reason: not valid java name and contains not printable characters */
    public static String m4162(Object obj, Object obj2) {
        if (C0026.m1047() >= 0) {
            return ((am) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((cb) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۨۨ, reason: not valid java name and contains not printable characters */
    public static Object m4163(Object obj, Object obj2, Object obj3) {
        if (C0040.m1622() <= 0) {
            return ((AtomicReferenceFieldUpdater) obj).getAndSet(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static Throwable m4164(Object obj) {
        if (C0057.m2142() >= 0) {
            return ((InvocationTargetException) obj).getCause();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۤۧ, reason: not valid java name and contains not printable characters */
    public static void m4165(Object obj, Object obj2) {
        if (C0031.m1148() < 0) {
            ((wr.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m4166(Object obj) {
        if (C0235.m9535() <= 0) {
            Arrays.sort((int[]) obj);
        }
    }

    /* JADX INFO: renamed from: ۡۡۨ۠, reason: not valid java name and contains not printable characters */
    public static long m4167() {
        if (C0128.m5064() < 0) {
            return System.currentTimeMillis();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۢ۠ۦ, reason: not valid java name and contains not printable characters */
    public static ak m4168(Object obj) {
        if (C0031.m1148() < 0) {
            return wr.l((View) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۡۨ, reason: not valid java name and contains not printable characters */
    public static int[] m4169() {
        if (C0219.m8794() > 0) {
            return ql.e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۡ, reason: not valid java name and contains not printable characters */
    public static int[] m4170(Object obj, int i) {
        if (C0249.m10052() < 0) {
            return StateSet.trimStateSet((int[]) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۦۣ, reason: not valid java name and contains not printable characters */
    public static void m4171(Object obj, Object obj2) throws IOException {
        if (C0072.m2856() < 0) {
            ((MediaExtractor) obj).setDataSource((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡۤۦۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4172(Object obj, Object obj2) {
        if (C0128.m5064() <= 0) {
            return ((v0) obj).o0((v0.k) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۦۤۤ, reason: not valid java name and contains not printable characters */
    public static String m4173(Object obj) {
        if (C0117.m4419() <= 0) {
            return ((gg) obj).T();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۥ۠, reason: not valid java name and contains not printable characters */
    public static int m4174(Object obj) {
        if (C0224.m8861() < 0) {
            return ((KeyCharacterMap) obj).getKeyboardType();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m4175(Object obj) {
        if (C0169.m7034() < 0) {
            return ((fj) obj).b();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۢۡ۟, reason: not valid java name and contains not printable characters */
    public static tf m4176(Object obj) {
        if (C0036.m1332() < 0) {
            return ((tf.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۤ۠, reason: not valid java name and contains not printable characters */
    public static Toast m4177(Object obj, Object obj2, int i) {
        if (C0176.m7290() >= 0) {
            return Toast.makeText((Context) obj, (CharSequence) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۧ, reason: not valid java name and contains not printable characters */
    public static mr m4178() {
        if (C0017.m627() >= 0) {
            return mr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۧۦ, reason: not valid java name and contains not printable characters */
    public static long m4179(Object obj) {
        if (C0058.m2184() > 0) {
            return ((f6) obj).controlState;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static HookMain.r m4180(Object obj) {
        if (C0188.m7736() < 0) {
            return ((hc) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static KeyCharacterMap m4181(int i) {
        if (C0037.m1437() < 0) {
            return KeyCharacterMap.load(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۡۧ, reason: contains not printable characters */
    public static boolean m4182() {
        if (C0066.m2514() >= 0) {
            return qr.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣۡۧ, reason: contains not printable characters */
    public static int m4183(Object obj) {
        if (C0118.m4454() > 0) {
            return ((v7.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۣۨ۟, reason: contains not printable characters */
    public static String m4184(Object obj) {
        if (C0095.m3478() <= 0) {
            return ((com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۦۢ, reason: contains not printable characters */
    public static int m4185(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥۥۥۢ, reason: contains not printable characters */
    public static void m4186(Object obj, Object obj2) {
        if (C0199.m7998() <= 0) {
            Menu.m5639((Menu) obj, (View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦ۟ۡۡ, reason: contains not printable characters */
    public static ArrayList m4187(Object obj) {
        if (C0099.m3752() < 0) {
            return ((z9.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۢۧ, reason: contains not printable characters */
    public static TextView m4188(Object obj) {
        if (C0195.m7914() >= 0) {
            return ((MainActivity) obj).y;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۡۨ, reason: not valid java name and contains not printable characters */
    public static Long m4189(Object obj) {
        if (C0233.m9365() < 0) {
            return ko.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m4190(Object obj, Object obj2) {
        if (C0021.m740() <= 0) {
            ((View) obj).setBackgroundTintMode((PorterDuff.Mode) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧۦۣ۠, reason: not valid java name and contains not printable characters */
    public static boolean m4191(Object obj) {
        if (C0099.m3752() < 0) {
            return ((View) obj).requestFocus();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۨ۟ۡ, reason: not valid java name and contains not printable characters */
    public static y5 m4192(Object obj) {
        if (C0040.m1622() <= 0) {
            return ((t5) obj).getContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۡ, reason: not valid java name and contains not printable characters */
    public static xo m4193() {
        if (C0115.m4218() < 0) {
            return j7.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۥۣ, reason: not valid java name and contains not printable characters */
    public static int m4194(Object obj) {
        if (C0055.m2054() > 0) {
            return ((a3) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۧۨۨ, reason: not valid java name and contains not printable characters */
    public static qq m4195() {
        if (C0182.m7528() < 0) {
            return qq.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۨ۟, reason: not valid java name and contains not printable characters */
    public static String m4161(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
