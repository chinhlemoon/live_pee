package okhttp3.logging;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.os.Handler;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.transition.Transition;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.activity.C0014;
import androidx.activity.C0017;
import androidx.activity.C0020;
import androidx.annotation.C0023;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0036;
import androidx.appcompat.widget.C0047;
import androidx.cardview.widget.C0049;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0062;
import androidx.drawerlayout.widget.C0072;
import androidx.emoji2.text.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.lifecycle.C0106;
import androidx.lifecycle.C0107;
import androidx.lifecycle.C0108;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0119;
import androidx.versionedparcelable.C0129;
import androidx.versionedparcelable.C0133;
import androidx.versionedparcelable.C0135;
import com.example.vcam.C0141;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.HookMain;
import com.example.vcam.MainActivity;
import com.example.vcam.Menu;
import com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.b1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.da;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ej;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.g7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ws;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import java.io.ByteArrayOutputStream;
import java.net.Socket;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.regex.Pattern;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.internal.C0227;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.io.C0195;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.publicsuffix.C0219;
import org.xmlpull.v1.XmlSerializer;
import retrofit2.C0259;

/* JADX INFO: renamed from: okhttp3.logging.۟ۧ۟ۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0235 {

    /* JADX INFO: renamed from: ۢۢۦۡ, reason: not valid java name and contains not printable characters */
    public static int f685 = -906;

    /* JADX INFO: renamed from: ۟۟۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static void m9496(Object obj) {
        if (C0215.m8604() < 0) {
            ((TextView) obj).endBatchEdit();
        }
    }

    /* JADX INFO: renamed from: ۟۟ۥۤۦ, reason: not valid java name and contains not printable characters */
    public static int m9497(Object obj, Object obj2, int i, int i2, boolean z, boolean z2) {
        if (C0106.m3835() >= 0) {
            return mo.D((CharSequence) obj, (CharSequence) obj2, i, i2, z, z2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static void m9498(Object obj, Object obj2) {
        if (C0107.m3883() >= 0) {
            l2.g((View) obj, (l2.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۢۦ۠, reason: not valid java name and contains not printable characters */
    public static MediaCodecInfo m9499(Object obj) {
        if (C0031.m1148() < 0) {
            return ((MediaCodec) obj).getCodecInfo();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m9500(Object obj) {
        if (C0182.m7528() <= 0) {
            return ((k9) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m9501(Object obj, Object obj2) {
        if (C0062.m2326() > 0) {
            return ((StringBuilder) obj).append((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m9502(Object obj, Object obj2) {
        if (C0047.m1663() <= 0) {
            return ej.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Activity) obj, (Intent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۥۨ, reason: not valid java name and contains not printable characters */
    public static Drawable m9503(Object obj, int i) {
        if (C0240.m9826() > 0) {
            return ((AnimationDrawable) obj).getFrame(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۡۤ, reason: not valid java name and contains not printable characters */
    public static int m9504(int i) {
        if (C0117.m4419() < 0) {
            return n5.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۥۦۤ, reason: not valid java name and contains not printable characters */
    public static xo m9505() {
        if (C0108.m4038() > 0) {
            return C0113.m4153();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۣۨ, reason: not valid java name and contains not printable characters */
    public static boolean m9506(Object obj, Object obj2) {
        if (C0017.m627() >= 0) {
            return ((Window.Callback) obj).dispatchTouchEvent((MotionEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m9507(Object obj, float f, float f2, float f3, float f4) {
        if (C0135.m5274() <= 0) {
            ((Path) obj).rQuadTo(f, f2, f3, f4);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۧ۟۠, reason: not valid java name and contains not printable characters */
    public static int m9508(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۦ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m9509(Object obj) {
        if (C0240.m9826() >= 0) {
            return ((ViewGroup) obj).getLeft();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢۧ, reason: not valid java name and contains not printable characters */
    public static fa m9510(Object obj) {
        if (C0213.m8458() >= 0) {
            return ((da) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ, reason: not valid java name and contains not printable characters */
    public static xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m9511(Object obj) {
        if (C0072.m2856() < 0) {
            return C0214.m8535((HookMain) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static Set m9512(Object obj) {
        if (C0195.m7914() >= 0) {
            return ((Map) obj).keySet();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static gs m9513(Object obj) {
        if (C0113.m4144() < 0) {
            return ((vm.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۦۥ, reason: not valid java name and contains not printable characters */
    public static void m9514(Object obj, Object obj2, Object obj3) {
        if (C0240.m9826() >= 0) {
            v0.c.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Configuration) obj, (Configuration) obj2, (Configuration) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۧۡۦ, reason: not valid java name and contains not printable characters */
    public static void m9516(Object obj, Object obj2, boolean z) {
        if (C0219.m8794() > 0) {
            Menu.m5577((Menu) obj, (CompoundButton) obj2, z);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧۡ, reason: not valid java name and contains not printable characters */
    public static void m9517(Object obj) {
        if (C0072.m2856() <= 0) {
            ((Path) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۟ۤۧۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m9518(Object obj, Object obj2) {
        if (C0172.m7180() > 0) {
            return ((u1) obj).addAll((Collection) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۨۨۤ, reason: not valid java name and contains not printable characters */
    public static int m9519(Object obj) {
        if (C0058.m2184() > 0) {
            return ((g7) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۤۤ۟, reason: not valid java name and contains not printable characters */
    public static boolean m9520(Object obj) {
        if (C0162.m6837() <= 0) {
            return ((String) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۤۥۦ, reason: not valid java name and contains not printable characters */
    public static void m9521(Object obj) {
        if (C0141.m5769() > 0) {
            ((Cursor) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۥۡۢ, reason: not valid java name and contains not printable characters */
    public static int m9522(Object obj, int i) {
        if (C0113.m4144() < 0) {
            return ((Cursor) obj).getInt(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۦۦۨ, reason: not valid java name and contains not printable characters */
    public static m8 m9523() {
        if (C0214.m8575() <= 0) {
            return m8.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۢ۠, reason: not valid java name and contains not printable characters */
    public static Object[] m9524() {
        if (C0259.m10136() > 0) {
            return rn.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠۠۟, reason: not valid java name and contains not printable characters */
    public static j9 m9525(Object obj) {
        if (C0108.m4038() >= 0) {
            return ((m9.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۡۢ, reason: not valid java name and contains not printable characters */
    public static e.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m9526(Object obj, Object obj2) {
        if (C0058.m2184() > 0) {
            return ((e) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((e.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static void m9527(Object obj, Object obj2) {
        if (C0058.m2184() > 0) {
            ((l2) obj).j((l2.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static XmlSerializer m9528(Object obj, Object obj2, Object obj3) {
        if (C0218.m8760() > 0) {
            return ((XmlSerializer) obj).endTag((String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۤۤ, reason: not valid java name and contains not printable characters */
    public static void m9529(Object obj) {
        if (C0218.m8760() >= 0) {
            ((m2) obj).n();
        }
    }

    /* JADX INFO: renamed from: ۠ۥۤۧ, reason: not valid java name and contains not printable characters */
    public static int m9530(Object obj) {
        if (C0058.m2184() > 0) {
            return ((TextView) obj).getBreakStrategy();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۧۧ۠, reason: not valid java name and contains not printable characters */
    public static long m9531(Object obj, long j, long j2, long j3) {
        if (C0232.m9299() > 0) {
            return bp.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj, j, j2, j3);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡ۠ۦۥ, reason: not valid java name and contains not printable characters */
    public static String m9532(String str) {
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

    /* JADX INFO: renamed from: ۣۡۤ۟, reason: not valid java name and contains not printable characters */
    public static Window.Callback m9533(Object obj) {
        if (C0036.m1332() <= 0) {
            return ((Window) obj).getCallback();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m9534(Object obj, boolean z) {
        if (C0113.m4144() <= 0) {
            ((ws) obj).E(z);
        }
    }

    /* JADX INFO: renamed from: ۡۥۦۡ, reason: not valid java name and contains not printable characters */
    public static int m9535() {
        return (-442) ^ C0047.f41;
    }

    /* JADX INFO: renamed from: ۢ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static StaticLayout.Builder m9536(Object obj, boolean z) {
        if (C0112.m4054() <= 0) {
            return ((StaticLayout.Builder) obj).setIncludePad(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۤۥ, reason: not valid java name and contains not printable characters */
    public static ColorFilter m9537(Object obj) {
        if (C0014.m545() >= 0) {
            return ((Paint) obj).getColorFilter();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟, reason: not valid java name and contains not printable characters */
    public static TextView m9538(Object obj) {
        if (C0020.m701() > 0) {
            return ((b1) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۡ, reason: not valid java name and contains not printable characters */
    public static byte m9539(Object obj, int i) {
        if (C0217.m8693() < 0) {
            return ((a3) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static Paint.Join m9540(Object obj) {
        if (C0133.m5208() < 0) {
            return ((pr.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۦۥ, reason: not valid java name and contains not printable characters */
    public static Handler m9541() {
        if (C0171.m7136() <= 0) {
            return x.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۨۧ, reason: not valid java name and contains not printable characters */
    public static void m9542(Object obj, Object obj2) {
        if (C0036.m1332() < 0) {
            ((qo) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Cursor) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۦۦ۠, reason: not valid java name and contains not printable characters */
    public static void m9543(Object obj, int i) {
        if (C0162.m6837() < 0) {
            ((LinearLayout) obj).setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: ۤۧۥۧ, reason: not valid java name and contains not printable characters */
    public static void m9544(Object obj, Object obj2) {
        if (m9535() < 0) {
            Menu.m5657((Menu) obj, (View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠ۨ, reason: contains not printable characters */
    public static void m9545(Object obj, Object obj2) {
        if (C0023.m843() >= 0) {
            ((f6.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((dp) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۢ۟۟, reason: contains not printable characters */
    public static Transition m9546(Object obj, Object obj2) {
        if (C0116.m4340() >= 0) {
            return ((Transition) obj).removeTarget((View) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۢۢ, reason: contains not printable characters */
    public static boolean m9547(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0031.m1148() <= 0) {
            return ((AtomicReferenceFieldUpdater) obj).compareAndSet(obj2, obj3, obj4);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۢۦۡ, reason: contains not printable characters */
    public static void m9548(Object obj, Object obj2) {
        if (C0141.m5769() > 0) {
            ((Drawable) obj).setColorFilter((ColorFilter) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۤۨۧ, reason: contains not printable characters */
    public static Drawable m9549(Object obj, Object obj2, int i) {
        if (C0119.m4573() > 0) {
            return ((hm) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۣۡ, reason: contains not printable characters */
    public static String m9550(Object obj) {
        if (C0149.m6476() < 0) {
            return ((m9.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۦۥ, reason: contains not printable characters */
    public static void m9551(Object obj, Object obj2, boolean z) {
        if (C0062.m2326() > 0) {
            ((PathMeasure) obj).setPath((Path) obj2, z);
        }
    }

    /* JADX INFO: renamed from: ۦۣ۠ۦ, reason: contains not printable characters */
    public static Pattern m9552(Object obj) {
        if (C0227.m9046() >= 0) {
            return ((bm) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨ۟ۧ, reason: contains not printable characters */
    public static void m9553(Object obj, Object obj2, boolean z) {
        if (C0049.m1767() <= 0) {
            MainActivity.m5561((MainActivity) obj, (CompoundButton) obj2, z);
        }
    }

    /* JADX INFO: renamed from: ۧ۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static void m9554(Object obj, boolean z) {
        if (C0219.m8794() > 0) {
            ((ScrollView) obj).setFillViewport(z);
        }
    }

    /* JADX INFO: renamed from: ۧۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static sn m9555(Object obj) {
        if (C0129.m5108() >= 0) {
            return sj.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Socket) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۥۨ, reason: not valid java name and contains not printable characters */
    public static void m9556(Object obj, boolean z) {
        if (C0227.m9046() >= 0) {
            ((m.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(z);
        }
    }

    /* JADX INFO: renamed from: ۨ۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static void m9557(Object obj, Object obj2) {
        if (C0201.m8184() < 0) {
            ((xs.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((dd) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣۨۤ, reason: not valid java name and contains not printable characters */
    public static void m9558(Object obj, Object obj2) {
        if (C0213.m8458() > 0) {
            ((TextPaint) obj).set((TextPaint) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۨۥۥ, reason: not valid java name and contains not printable characters */
    public static void m9559(Object obj, Object obj2) {
        if (C0232.m9299() > 0) {
            ((VelocityTracker) obj).addMovement((MotionEvent) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۦ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m9560(Object obj) {
        if (C0219.m8794() > 0) {
            return ((ConnectionBlocker) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m9561(Object obj, Object obj2) {
        if (C0031.m1148() < 0) {
            ((a9) obj).i((ClassLoader) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۦۦ۠, reason: not valid java name and contains not printable characters */
    public static String m9515(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
