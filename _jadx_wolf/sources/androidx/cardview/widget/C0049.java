package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.graphics.drawable.C0010;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.method.TransformationMethod;
import android.util.SizeF;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ListView;
import androidx.activity.C0017;
import androidx.activity.C0021;
import androidx.annotation.C0025;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0036;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.C0052;
import androidx.core.app.C0053;
import androidx.core.graphics.drawable.C0065;
import androidx.core.graphics.drawable.C0066;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0079;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0096;
import androidx.fragment.app.C0099;
import androidx.lifecycle.C0107;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0117;
import androidx.versionedparcelable.C0129;
import androidx.versionedparcelable.C0135;
import com.example.vcam.C0141;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.HookMain;
import com.example.vcam.LicenseManager;
import com.example.vcam.Menu;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.aa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bh;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ef;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.im;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ne;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.se;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ws;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import okhttp3.C0238;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.internal.C0227;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0195;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0231;
import okhttp3.logging.C0235;
import org.xmlpull.v1.XmlPullParser;
import retrofit2.C0259;
import retrofit2.Call;
import retrofit2.converter.scalars.C0243;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: androidx.cardview.widget.ۥ۠ۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0049 {

    /* JADX INFO: renamed from: ۢ۠۠ۥ, reason: not valid java name and contains not printable characters */
    public static int f43 = -783;

    /* JADX INFO: renamed from: ۟۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static void m1712(Object obj, int i, int i2) {
        if (C0141.m5769() >= 0) {
            Selection.setSelection((Spannable) obj, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static FileChannel.MapMode m1713() {
        if (C0052.m1890() >= 0) {
            return FileChannel.MapMode.READ_ONLY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static void m1714(Object obj, Object obj2) {
        if (C0053.m1959() > 0) {
            q7.f((Drawable) obj, (ColorStateList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m1715(Object obj) {
        if (C0135.m5274() < 0) {
            return ((aa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static int m1716(Object obj) {
        if (C0036.m1332() < 0) {
            return kp.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static void m1717(Object obj, Object obj2) {
        if (C0017.m627() > 0) {
            se.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((LayoutInflater) obj, (LayoutInflater.Factory2) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۠۟۟, reason: not valid java name and contains not printable characters */
    public static void m1718(Object obj, Object obj2, boolean z) {
        if (C0243.m9964() > 0) {
            Menu.m5667((Menu) obj, (CompoundButton) obj2, z);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۢۥۨ, reason: not valid java name and contains not printable characters */
    public static a6.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.C0142x35d57e31 m1719() {
        if (C0129.m5108() > 0) {
            return a6.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.C0142x35d57e31.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m1720() {
        if (C0225.m9001() >= 0) {
            return t2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۡۨ, reason: not valid java name and contains not printable characters */
    public static TransformationMethod m1721(Object obj) {
        if (C0117.m4419() <= 0) {
            return ((j8) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧ۟, reason: not valid java name and contains not printable characters */
    public static void m1722(Object obj, Object obj2, int i) {
        if (C0169.m7034() < 0) {
            C0214.m8580((Context) obj, (String) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۢ, reason: not valid java name and contains not printable characters */
    public static long m1723(Object obj, long j) {
        if (C0040.m1622() <= 0) {
            return f2.m5955((f2) obj, j);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static int[] m1724(Object obj, int i) {
        if (C0238.m9653() > 0) {
            return Arrays.copyOf((int[]) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static Object m1725(Object obj) {
        if (C0065.m2448() >= 0) {
            return ((r4) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨۧ, reason: not valid java name and contains not printable characters */
    public static Font m1726(Object obj) {
        if (C0065.m2448() >= 0) {
            return ((Font.Builder) obj).build();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦ۟۠, reason: not valid java name and contains not printable characters */
    public static String m1727() {
        if (C0021.m740() <= 0) {
            return "ۥۣۢ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۡ, reason: not valid java name and contains not printable characters */
    public static void m1728(Object obj, int i, int i2) {
        if (C0200.m8104() < 0) {
            ((View) obj).measure(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static View m1729(Object obj) {
        if (C0066.m2514() >= 0) {
            return ((bk) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۢۡ, reason: not valid java name and contains not printable characters */
    public static Object m1730(Object obj) {
        if (C0148.m6464() <= 0) {
            return ((ThreadLocal) obj).get();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۨۦ, reason: not valid java name and contains not printable characters */
    public static void m1731(Object obj, int i, boolean z) {
        if (C0238.m9653() > 0) {
            ((MediaCodec) obj).releaseOutputBuffer(i, z);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۥۦۥ, reason: not valid java name and contains not printable characters */
    public static int[] m1732(Object obj) {
        if (C0249.m10052() < 0) {
            return ((zr) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۥۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1733(Object obj) {
        if (C0031.m1148() <= 0) {
            return ((h8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۧۧۨ, reason: not valid java name and contains not printable characters */
    public static uf m1734(Object obj) {
        if (C0182.m7528() <= 0) {
            return ((bf) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static void m1735(Object obj, Object obj2) {
        if (C0021.m740() < 0) {
            ((a9) obj).l((ClassLoader) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤۧ, reason: not valid java name and contains not printable characters */
    public static l2 m1736(Object obj) {
        if (C0052.m1890() >= 0) {
            return ((HookMain) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۥۧ, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m1737(Object obj) {
        if (C0078.m3044() <= 0) {
            return ((ImageView) obj).getImageTintMode();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦۦ, reason: not valid java name and contains not printable characters */
    public static int m1738(Object obj) {
        if (C0231.m9265() > 0) {
            return ((uo.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).j;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static Object[] m1739() {
        if (C0195.m7914() > 0) {
            return z1.b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۤ, reason: not valid java name and contains not printable characters */
    public static HookMain m1740(Object obj) {
        if (C0171.m7136() <= 0) {
            return ((HookMain.d) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m1741(Object obj) {
        if (C0227.m9046() > 0) {
            return ((XmlPullParser) obj).next();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢۡ۠, reason: not valid java name and contains not printable characters */
    public static int m1742(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۢۧۤۤ, reason: not valid java name and contains not printable characters */
    public static n9.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa[] m1743(Object obj) {
        if (C0200.m8104() <= 0) {
            return ((n9.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static void m1744(Object obj, int i) {
        if (C0231.m9265() > 0) {
            ef.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ListView) obj, i);
        }
    }

    /* JADX INFO: renamed from: ۣۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m1745(Object obj) {
        if (C0218.m8760() >= 0) {
            return ((a9.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۤ۠, reason: not valid java name and contains not printable characters */
    public static int m1746(Object obj) {
        if (C0079.m3072() <= 0) {
            return ((qo) obj).q;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۡۤۨ, reason: not valid java name and contains not printable characters */
    public static HookMain m1747(Object obj) {
        if (C0219.m8794() >= 0) {
            return ((HookMain.u) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢ۟, reason: not valid java name and contains not printable characters */
    public static Call m1748(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (C0259.m10136() >= 0) {
            return ((o0.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۦ۟, reason: not valid java name and contains not printable characters */
    public static WeakReference m1749(Object obj) {
        if (m1767() <= 0) {
            return ((ws.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۧۥ, reason: not valid java name and contains not printable characters */
    public static AtomicLongFieldUpdater m1750() {
        if (C0093.m3365() >= 0) {
            return f6.d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static String m1752(String str) {
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

    /* JADX INFO: renamed from: ۥۣ۟ۧ, reason: contains not printable characters */
    public static Class[] m1753() {
        if (C0164.m6900() < 0) {
            return m1.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۥۡ, reason: contains not printable characters */
    public static Bundle m1754(Object obj) {
        if (C0164.m6900() <= 0) {
            return ((Parcel) obj).readBundle();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۦۥ, reason: contains not printable characters */
    public static int[] m1755() {
        if (C0112.m4054() <= 0) {
            return s7.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۨۢ, reason: contains not printable characters */
    public static int m1756(Object obj) {
        if (C0240.m9826() > 0) {
            return ((wr.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۥۣ۟, reason: contains not printable characters */
    public static float m1757(Object obj) {
        if (C0162.m6837() < 0) {
            return ((MotionEvent) obj).getY();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۦۨۥ۠, reason: contains not printable characters */
    public static Method m1758() {
        if (C0235.m9535() < 0) {
            return ne.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m1759(Object obj) {
        if (C0176.m7290() >= 0) {
            return ((Class) obj).getCanonicalName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static int m1760(Object obj) {
        if (C0107.m3883() >= 0) {
            return ((xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۢۤ۠, reason: not valid java name and contains not printable characters */
    public static boolean m1761(Object obj, Object obj2) {
        if (C0115.m4218() < 0) {
            return pj.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj, obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۧۢ, reason: not valid java name and contains not printable characters */
    public static Bundle m1762(Object obj) {
        if (C0096.m3601() <= 0) {
            return ((EditorInfo) obj).extras;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۧۨ, reason: not valid java name and contains not printable characters */
    public static Menu m1763(Object obj) {
        if (C0099.m3752() < 0) {
            return ((bh) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦ۠ۥ, reason: not valid java name and contains not printable characters */
    public static SpannableStringBuilder m1764(Object obj, Object obj2) {
        if (C0025.m934() >= 0) {
            return ((vn) obj).append((CharSequence) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۡۡ, reason: not valid java name and contains not printable characters */
    public static int m1765(int i) {
        if (C0211.m8341() >= 0) {
            return n5.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۨۤ۟, reason: not valid java name and contains not printable characters */
    public static void m1766(Object obj, Object obj2, Object obj3) {
        if (C0010.m354() <= 0) {
            ((Bundle) obj).putSizeF((String) obj2, (SizeF) obj3);
        }
    }

    /* JADX INFO: renamed from: ۨ۟, reason: not valid java name and contains not printable characters */
    public static int m1767() {
        return 684 ^ C0219.f669;
    }

    /* JADX INFO: renamed from: ۨۢۡ۟, reason: not valid java name and contains not printable characters */
    public static ColorStateList m1768(Object obj) {
        if (C0176.m7290() >= 0) {
            return ((qm) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۢۦ, reason: not valid java name and contains not printable characters */
    public static ThreadPoolExecutor m1769(Object obj, int i, int i2) {
        if (C0161.m6744() > 0) {
            return dm.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۢۨ, reason: not valid java name and contains not printable characters */
    public static LicenseManager.LicenseCallback m1770(Object obj) {
        if (C0194.m7889() >= 0) {
            return ((LicenseManager) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static im.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m1771(Object obj) {
        if (C0235.m9535() <= 0) {
            return ((tq.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۡ, reason: not valid java name and contains not printable characters */
    public static Context m1772(Object obj) {
        if (C0215.m8604() <= 0) {
            return ((ConnectionBlocker) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۦۢ, reason: not valid java name and contains not printable characters */
    public static Toolbar m1773(Object obj) {
        if (C0240.m9826() > 0) {
            return ((bq) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۧ۠, reason: not valid java name and contains not printable characters */
    public static String m1751(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
