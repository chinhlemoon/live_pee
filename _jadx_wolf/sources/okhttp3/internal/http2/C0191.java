package okhttp3.internal.http2;

import android.animation.ObjectAnimator;
import android.content.ClipData;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.media.MediaPlayer;
import android.support.v4.app.C0002;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0009;
import android.support.v4.graphics.drawable.C0010;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Switch;
import android.widget.TextView;
import androidx.activity.C0017;
import androidx.activity.C0020;
import androidx.activity.C0021;
import androidx.annotation.C0023;
import androidx.annotation.C0025;
import androidx.annotation.C0026;
import androidx.appcompat.app.C0034;
import androidx.appcompat.app.C0035;
import androidx.appcompat.widget.C0047;
import androidx.appcompat.widget.SearchView;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0051;
import androidx.core.app.C0055;
import androidx.core.graphics.drawable.C0064;
import androidx.core.widget.C0069;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.drawerlayout.widget.C0070;
import androidx.emoji2.text.C0083;
import androidx.emoji2.text.C0084;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0095;
import androidx.fragment.app.C0099;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0106;
import androidx.lifecycle.C0107;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0122;
import androidx.savedstate.C0126;
import androidx.savedstate.C0127;
import androidx.versionedparcelable.C0135;
import com.example.vcam.MainActivity;
import com.example.vcam.Menu;
import com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.b;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.be;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bt;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.cm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ii;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sb;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zk;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import okhttp3.HttpUrl;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.logging.C0235;
import org.xmlpull.v1.XmlSerializer;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: okhttp3.internal.http2.ۣ۟ۢۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0191 {

    /* JADX INFO: renamed from: ۠۠ۥ۠, reason: not valid java name and contains not printable characters */
    public static int f641 = 817;

    /* JADX INFO: renamed from: ۟۟ۢۨۦ, reason: not valid java name and contains not printable characters */
    public static void m7757() {
        if (C0095.m3478() <= 0) {
            yc.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۟۟ۦۣۧ, reason: not valid java name and contains not printable characters */
    public static boolean m7758(Object obj, Object obj2) {
        if (C0194.m7889() >= 0) {
            return ((AccessibilityNodeInfo) obj).removeAction((AccessibilityNodeInfo.AccessibilityAction) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m7759() {
        if (C0099.m3752() < 0) {
            return xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static InputFilter[] m7760(Object obj, Object obj2) {
        if (C0020.m701() > 0) {
            return ((h8.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((InputFilter[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static ObjectAnimator m7761(Object obj, long j) {
        if (C0084.m3253() < 0) {
            return ((ObjectAnimator) obj).setDuration(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static int m7762(Object obj) {
        if (C0135.m5274() < 0) {
            return ((ViewGroup.MarginLayoutParams) obj).getMarginEnd();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۢ, reason: not valid java name and contains not printable characters */
    public static o9 m7763(Object obj) {
        if (C0051.m1783() <= 0) {
            return o9.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۡۨ, reason: not valid java name and contains not printable characters */
    public static int m7764(int i, Object obj) {
        if (C0047.m1663() <= 0) {
            return hm.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, (PorterDuff.Mode) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۨۨۥ, reason: not valid java name and contains not printable characters */
    public static String m7765(Object obj) {
        if (C0026.m1047() >= 0) {
            return ((Fragment) obj).t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m7766(Object obj) {
        if (C0006.m169() < 0) {
            return ((ClipData) obj).getItemCount();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠۟, reason: not valid java name and contains not printable characters */
    public static tm.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m7767(Object obj, Object obj2, Object obj3) {
        if (C0095.m3478() < 0) {
            return ((tm) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static int m7769(Object obj) {
        if (C0002.m72() >= 0) {
            return ((xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۡۧ, reason: not valid java name and contains not printable characters */
    public static boolean m7770(Object obj) {
        if (C0049.m1767() < 0) {
            return ((pr) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۢۥۦ, reason: not valid java name and contains not printable characters */
    public static long m7771(double d) {
        if (C0126.m4908() < 0) {
            return Math.round(d);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۢۦ۠, reason: not valid java name and contains not printable characters */
    public static int m7772(Object obj) {
        if (C0120.m4608() >= 0) {
            return ((String) obj).length();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۦۢۨ, reason: not valid java name and contains not printable characters */
    public static void m7773(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0023.m843() >= 0) {
            ((m1) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj2, (View) obj3, (AttributeSet) obj4);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۧۤ۟, reason: not valid java name and contains not printable characters */
    public static void m7774(Object obj, int i) {
        if (C0017.m627() >= 0) {
            ((TextView) obj).setFirstBaselineToTopHeight(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m7775(Object obj) {
        if (C0069.m2756() <= 0) {
            return ((vf.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m7776(Object obj, Object obj2, int i, int i2) {
        if (C0021.m740() < 0) {
            return ((AtomicIntegerFieldUpdater) obj).compareAndSet(obj2, i, i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۣۡ۠, reason: not valid java name and contains not printable characters */
    public static String m7777(String str) {
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

    /* JADX INFO: renamed from: ۟ۦۡۧۢ, reason: not valid java name and contains not printable characters */
    public static be m7778(Object obj) {
        if (C0106.m3835() > 0) {
            return ((kotlin.jvm.internal.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).compute();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۨۨ, reason: not valid java name and contains not printable characters */
    public static Fragment m7779(Object obj, Object obj2) {
        if (C0116.m4340() > 0) {
            return ((y9) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۡۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m7780(Object obj, int i) {
        if (C0083.m3188() <= 0) {
            return r8.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((InputStream) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۢۥ, reason: not valid java name and contains not printable characters */
    public static v0 m7781(Object obj) {
        if (C0064.m2388() > 0) {
            return v0.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m7782() {
        if (C0025.m934() >= 0) {
            return u0.a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۥ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m7783(Object obj, boolean z) {
        if (C0023.m843() >= 0) {
            ((r7) obj).setDither(z);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۥۣۧ, reason: not valid java name and contains not printable characters */
    public static void m7784(Object obj) {
        if (C0181.m7445() >= 0) {
            ((ContentLoadingProgressBar) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۠ۢۧ۠, reason: not valid java name and contains not printable characters */
    public static String m7785(Object obj) {
        if (C0051.m1783() <= 0) {
            return Menu.m5672((Menu) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠, reason: not valid java name and contains not printable characters */
    public static float m7786(Object obj) {
        if (C0213.m8458() >= 0) {
            return ((l1) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۠ۤۢۢ, reason: not valid java name and contains not printable characters */
    public static SearchView m7787(Object obj) {
        if (C0107.m3883() >= 0) {
            return ((qo) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۡۢ, reason: not valid java name and contains not printable characters */
    public static void m7788(Object obj, int i, int i2, int i3) {
        if (C0106.m3835() > 0) {
            ((b.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ۠ۥۦۨ, reason: not valid java name and contains not printable characters */
    public static void m7789(Object obj, Object obj2) {
        if (C0117.m4419() < 0) {
            ((MediaPlayer) obj).setOnErrorListener((MediaPlayer.OnErrorListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡ۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m7790(Object obj, char c, int i) {
        if (C0006.m169() < 0) {
            ii.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((MenuItem) obj, c, i);
        }
    }

    /* JADX INFO: renamed from: ۡ۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static boolean m7791(Object obj, Object obj2) {
        if (C0172.m7180() >= 0) {
            return ((xd) obj).e((Throwable) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۡ۠, reason: not valid java name and contains not printable characters */
    public static kj m7792() {
        if (C0099.m3752() < 0) {
            return kj.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۧۦ, reason: not valid java name and contains not printable characters */
    public static boolean m7793(Object obj) {
        if (C0051.m1783() < 0) {
            return ((View) obj).hasOnClickListeners();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۧۦۥ, reason: not valid java name and contains not printable characters */
    public static Switch m7794(Object obj) {
        if (C0009.m276() < 0) {
            return ((MainActivity) obj).v;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۨۢ, reason: not valid java name and contains not printable characters */
    public static String m7795(Object obj) {
        if (C0215.m8604() < 0) {
            return ((Class) obj).getSimpleName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۨ۟, reason: not valid java name and contains not printable characters */
    public static Paint.Cap m7796() {
        if (C0122.m4736() < 0) {
            return Paint.Cap.ROUND;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m7797(Object obj, int i) {
        if (C0070.m2829() <= 0) {
            ((m2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).c(i);
        }
    }

    /* JADX INFO: renamed from: ۣۡۡۡ, reason: not valid java name and contains not printable characters */
    public static sb m7798() {
        if (C0122.m4736() < 0) {
            return sb.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۥۥ, reason: not valid java name and contains not printable characters */
    public static void m7799(Object obj) {
        if (C0249.m10052() <= 0) {
            ((j0) obj).h();
        }
    }

    /* JADX INFO: renamed from: ۣۦۤۢ, reason: not valid java name and contains not printable characters */
    public static xo m7800() {
        if (C0172.m7180() >= 0) {
            return yd.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۢۥ, reason: not valid java name and contains not printable characters */
    public static boolean m7801() {
        if (C0235.m9535() <= 0) {
            return lm.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۤۨ۠, reason: not valid java name and contains not printable characters */
    public static AtomicIntegerFieldUpdater m7802() {
        if (C0035.m1268() <= 0) {
            return f6.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۢ۠, reason: not valid java name and contains not printable characters */
    public static Context m7803(Object obj) {
        if (C0214.m8575() <= 0) {
            return ((zk) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠۟ۨ, reason: contains not printable characters */
    public static xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m7804(Object obj) {
        if (C0017.m627() > 0) {
            return xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((File) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۢۢ, reason: contains not printable characters */
    public static float m7805(Object obj, float f) {
        if (C0199.m7998() <= 0) {
            return ((m2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(f);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۥۣ, reason: contains not printable characters */
    public static cm m7806(Object obj) {
        if (C0034.m1206() <= 0) {
            return ((tf) obj).h();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۟ۡ, reason: contains not printable characters */
    public static XmlSerializer m7807() {
        if (C0010.m354() <= 0) {
            return Xml.newSerializer();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۤۨ, reason: contains not printable characters */
    public static long m7808(Object obj, Object obj2) {
        if (C0182.m7528() <= 0) {
            return ((AtomicLongFieldUpdater) obj).getAndDecrement(obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۡ۟ۨ, reason: contains not printable characters */
    public static Object m7809(Object obj) {
        if (C0025.m934() >= 0) {
            return ((WeakReference) obj).get();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۤۡ, reason: contains not printable characters */
    public static int m7810(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۦۣۧ۟, reason: contains not printable characters */
    public static PorterDuff.Mode m7811() {
        if (C0127.m4950() > 0) {
            return bt.b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۢۦ, reason: not valid java name and contains not printable characters */
    public static int m7812() {
        return (-400) ^ C0235.f685;
    }

    /* JADX INFO: renamed from: ۧۢۥ۠, reason: not valid java name and contains not printable characters */
    public static TextView m7813(Object obj) {
        if (C0094.m3450() >= 0) {
            return ((jq) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۥۢ, reason: not valid java name and contains not printable characters */
    public static boolean m7814(Object obj) {
        if (C0094.m3450() >= 0) {
            return ((s0) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۧۧۡ, reason: not valid java name and contains not printable characters */
    public static Object[] m7815(Object obj, Object obj2) {
        if (C0202.m8245() >= 0) {
            return ((u1) obj).toArray((Object[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۧ۟, reason: not valid java name and contains not printable characters */
    public static void m7816(Object obj, Object obj2) {
        if (C0055.m2054() >= 0) {
            ((AccessibilityNodeInfo) obj).setStateDescription((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۢۡ۟, reason: not valid java name and contains not printable characters */
    public static boolean m7817(Object obj, int i, Object obj2, int i2, int i3) {
        if (C0215.m8604() <= 0) {
            return ((a3) obj).e(i, (a3) obj2, i2, i3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨۨۥ, reason: not valid java name and contains not printable characters */
    public static int m7818(Object obj) {
        if (C0161.m6744() >= 0) {
            return ((u7) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۡۡۦ, reason: not valid java name and contains not printable characters */
    public static String m7768(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
