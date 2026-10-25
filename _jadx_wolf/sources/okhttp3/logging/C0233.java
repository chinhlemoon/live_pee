package okhttp3.logging;

import android.app.Application;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.media.Image;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.support.v4.app.C0002;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0009;
import android.support.v4.graphics.drawable.C0011;
import android.system.OsConstants;
import android.text.Editable;
import android.text.Layout;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.activity.C0014;
import androidx.activity.C0021;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.C0023;
import androidx.annotation.C0026;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0036;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.C0047;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0052;
import androidx.core.content.C0057;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0064;
import androidx.core.widget.C0068;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0070;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0083;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0095;
import androidx.fragment.app.C0096;
import androidx.lifecycle.C0107;
import androidx.lifecycle.C0108;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0118;
import androidx.profileinstaller.C0119;
import androidx.savedstate.C0122;
import androidx.savedstate.C0127;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0133;
import com.example.vcam.C0141;
import com.example.vcam.LicenseManager;
import com.example.vcam.MainActivity;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.cp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.en;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.id;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kb;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ke;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ks;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ob;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.w7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ws;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y5;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.C0238;
import okhttp3.C0239;
import okhttp3.HttpUrl;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.publicsuffix.C0219;
import retrofit2.C0259;
import retrofit2.converter.scalars.C0243;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: okhttp3.logging.۟ۥۨ۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0233 {

    /* JADX INFO: renamed from: ۣۦ۠۠, reason: not valid java name and contains not printable characters */
    public static int f683 = -795;

    /* JADX INFO: renamed from: ۟۟ۡۧۨ, reason: not valid java name and contains not printable characters */
    public static String m9344(String str) {
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
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str2.charAt(i3 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = HttpUrl.FRAGMENT_ENCODE_SET.length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۟۟ۢۤۢ, reason: not valid java name and contains not printable characters */
    public static LayoutInflater m9345(Object obj) {
        if (C0117.m4419() < 0) {
            return ((gm) obj).f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۣۨ, reason: not valid java name and contains not printable characters */
    public static float m9346(Object obj) {
        if (C0238.m9653() >= 0) {
            return wr.d.a((View) obj);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟۠۟۠, reason: not valid java name and contains not printable characters */
    public static int m9347(Object obj) {
        if (C0057.m2142() > 0) {
            return ((tp) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static void m9348(Object obj) {
        if (C0031.m1148() <= 0) {
            l3.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m9349(Object obj) {
        if (C0148.m6464() < 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).canApplyTheme();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۨۤ۟, reason: not valid java name and contains not printable characters */
    public static hn m9350(Object obj, int i) {
        if (C0194.m7889() >= 0) {
            return ((w7) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static List m9351(Object obj) {
        if (C0141.m5769() >= 0) {
            return e2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Object[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۨۧ, reason: not valid java name and contains not printable characters */
    public static View m9352(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        if (C0036.m1332() <= 0) {
            return ((l2) obj).c((View) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, (String) obj7, (String) obj8);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static Rect m9353(Object obj) {
        if (C0235.m9535() < 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).d();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨ۠ۦ, reason: not valid java name and contains not printable characters */
    public static ks m9354(Object obj, Object obj2) {
        if (C0040.m1622() <= 0) {
            return ((ks) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Interpolator) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static void m9355(Object obj, Object obj2) {
        if (C0118.m4454() > 0) {
            ((Application) obj).unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡ۠, reason: not valid java name and contains not printable characters */
    public static void m9356(Object obj, Object obj2) {
        if (C0095.m3478() <= 0) {
            ((xd) obj).Q((wd) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۡۥۨ, reason: not valid java name and contains not printable characters */
    public static void m9357(Object obj, int i, Object obj2) {
        if (C0218.m8760() >= 0) {
            ((cp) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, (ByteBuffer) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۥۡۤ, reason: not valid java name and contains not printable characters */
    public static void m9358(Object obj) {
        if (C0127.m4950() > 0) {
            ((MainActivity) obj).f0();
        }
    }

    /* JADX INFO: renamed from: ۟ۢۥۦۡ, reason: not valid java name and contains not printable characters */
    public static boolean m9359(int i) {
        if (C0217.m8693() < 0) {
            return OsConstants.S_ISREG(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static boolean m9360(Object obj, Object obj2, Object obj3, int i) {
        if (C0202.m8245() > 0) {
            return ((ViewParent) obj).onStartNestedScroll((View) obj2, (View) obj3, i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦۨ, reason: not valid java name and contains not printable characters */
    public static boolean m9361(Object obj) {
        if (C0107.m3883() > 0) {
            return ((pr.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۥۡ, reason: not valid java name and contains not printable characters */
    public static ActionBarOverlayLayout m9362(Object obj) {
        if (C0181.m7445() > 0) {
            return ((ws) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m9363(Object obj) {
        if (C0243.m9964() >= 0) {
            return ((i) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨ۠, reason: not valid java name and contains not printable characters */
    public static long m9364(Object obj) {
        if (C0023.m843() >= 0) {
            return ((f6) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static int m9365() {
        return 59 ^ C0052.f46;
    }

    /* JADX INFO: renamed from: ۟ۤۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m9366(Object obj) {
        if (C0009.m276() <= 0) {
            return ((ComponentName) obj).flattenToShortString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۡۥ, reason: not valid java name and contains not printable characters */
    public static Font.Builder m9367(Object obj, int i) {
        if (C0057.m2142() >= 0) {
            return ((Font.Builder) obj).setWeight(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static OnBackPressedDispatcher m9368(Object obj) {
        if (C0219.m8794() > 0) {
            return ((f5) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static void m9369(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        if (C0204.m8270() <= 0) {
            ((MediaCodec) obj).configure((MediaFormat) obj2, (Surface) obj3, (MediaCrypto) obj4, i);
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static Layout.Alignment m9370() {
        if (C0026.m1047() >= 0) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡ۠۟, reason: not valid java name and contains not printable characters */
    public static CharSequence m9371(Object obj, Object obj2) {
        if (C0058.m2184() > 0) {
            return ((qo) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Cursor) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۤۢ, reason: not valid java name and contains not printable characters */
    public static f6.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m9372() {
        if (C0249.m10052() <= 0) {
            return f6.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۧۧ, reason: not valid java name and contains not printable characters */
    public static Bundle m9373(Object obj) {
        if (C0095.m3478() < 0) {
            return ((ActivityInfo) obj).metaData;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m9374(Object obj, Object obj2) {
        if (C0194.m7889() >= 0) {
            ((v0.k) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۤۤۡ, reason: not valid java name and contains not printable characters */
    public static void m9375(Object obj, boolean z) {
        if (C0011.m458() >= 0) {
            ((ActionBarOverlayLayout) obj).setHideOnContentScrollEnabled(z);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Method m9377(Object obj, Object obj2) {
        if (C0236.m9615() > 0) {
            return ((wq) obj).m((Class) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static boolean m9378(Object obj) {
        if (C0113.m4144() < 0) {
            return ((Drawable) obj).canApplyTheme();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦ۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m9379(Object obj, Object obj2, Object obj3) {
        if (C0243.m9964() >= 0) {
            ((kb) obj).U((y5) obj2, (Runnable) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m9380(Object obj, Object obj2) {
        if (C0068.m2650() >= 0) {
            ((LicenseManager) obj).v((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۢۢ, reason: not valid java name and contains not printable characters */
    public static int m9381(Object obj) {
        if (C0057.m2142() > 0) {
            return ((Image) obj).getFormat();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۤ۟۟, reason: not valid java name and contains not printable characters */
    public static void m9382(Object obj) {
        if (C0187.m7613() > 0) {
            ((u7) obj).drawableStateChanged();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۨۥۨ, reason: not valid java name and contains not printable characters */
    public static Insets m9383(int i, int i2, int i3, int i4) {
        if (C0215.m8604() <= 0) {
            return dd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, i2, i3, i4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠۠, reason: not valid java name and contains not printable characters */
    public static dp m9384(Object obj, boolean z) {
        if (C0108.m4038() > 0) {
            return ((f6.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).l(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static CharSequence m9385(Object obj, Object obj2, int i) {
        if (C0119.m4573() > 0) {
            return lp.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj, (ClipData.Item) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m9386(Object obj) {
        if (C0083.m3188() <= 0) {
            return ((uo.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).l;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۦۧۤ, reason: not valid java name and contains not printable characters */
    public static Object m9387(Object obj, Object obj2) {
        if (C0064.m2388() > 0) {
            return ((HashMap) obj).remove(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m9388(Object obj, Object obj2) {
        if (C0232.m9299() >= 0) {
            ((PrintWriter) obj).print((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m9389(Object obj, Object obj2) {
        if (C0128.m5064() <= 0) {
            return ((TextView) obj).setFontVariationSettings((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۤۢۦ, reason: not valid java name and contains not printable characters */
    public static void m9390(Object obj) {
        if (C0119.m4573() >= 0) {
            ((m2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).a();
        }
    }

    /* JADX INFO: renamed from: ۢۥۤۡ, reason: not valid java name and contains not printable characters */
    public static int m9391(Object obj) {
        if (C0171.m7136() <= 0) {
            return ((n9.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m9392(Object obj, Object obj2, int i) {
        if (C0006.m169() < 0) {
            ((AnimationDrawable) obj).addFrame((Drawable) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۧ, reason: not valid java name and contains not printable characters */
    public static Object m9393(Object obj) {
        if (C0259.m10136() > 0) {
            return ((ke) obj).get();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۡ۠, reason: not valid java name and contains not printable characters */
    public static double m9394(double d) {
        if (C0036.m1332() < 0) {
            return Math.ceil(d);
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: ۣۤۢۥ, reason: not valid java name and contains not printable characters */
    public static int m9395(Object obj) {
        if (C0074.m2951() <= 0) {
            return ((id.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۤۦ۟, reason: not valid java name and contains not printable characters */
    public static AtomicReference[] m9396() {
        if (C0239.m9805() < 0) {
            return en.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۡۦ, reason: not valid java name and contains not printable characters */
    public static void m9397(Object obj, float f) {
        if (C0182.m7528() < 0) {
            ((View) obj).setTranslationZ(f);
        }
    }

    /* JADX INFO: renamed from: ۣۥۢۨ, reason: not valid java name and contains not printable characters */
    public static int m9398(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤ۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static void m9399(Object obj) {
        if (C0096.m3601() <= 0) {
            obj.notify();
        }
    }

    /* JADX INFO: renamed from: ۤ۠ۧۥ, reason: not valid java name and contains not printable characters */
    public static boolean m9400(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0235.m9535() <= 0) {
            return ((KeyListener) obj).onKeyOther((View) obj2, (Editable) obj3, (KeyEvent) obj4);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static float m9401(Object obj) {
        if (C0069.m2756() < 0) {
            return ((pr.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).c;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۤۥ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m9402(Object obj) {
        if (C0070.m2829() <= 0) {
            return ((Canvas) obj).save();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۨ۠ۦ, reason: not valid java name and contains not printable characters */
    public static SubMenu m9403(Object obj) {
        if (C0014.m545() >= 0) {
            return ((uo.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۡ۠, reason: contains not printable characters */
    public static boolean m9404(Object obj) {
        if (C0094.m3450() > 0) {
            return ((fg) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣۥۡ, reason: contains not printable characters */
    public static void m9405(Object obj) {
        if (C0069.m2756() <= 0) {
            ((pr) obj).invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: ۥۤۦۣ, reason: contains not printable characters */
    public static ob m9406() {
        if (C0169.m7034() < 0) {
            return ob.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۧۧ, reason: contains not printable characters */
    public static void m9407(Object obj, Object obj2) {
        if (C0169.m7034() < 0) {
            ((n9.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Typeface) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۣۡۤ, reason: contains not printable characters */
    public static byte m9408(int i) {
        if (C0118.m4454() > 0) {
            return Character.getDirectionality(i);
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: ۦۣۨۢ, reason: contains not printable characters */
    public static void m9409(Object obj, int i) {
        if (C0148.m6464() <= 0) {
            ((ViewGroup.MarginLayoutParams) obj).setMarginStart(i);
        }
    }

    /* JADX INFO: renamed from: ۣۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m9410(Object obj, char c, int i, boolean z, int i2) {
        if (C0133.m5208() <= 0) {
            return mo.F((CharSequence) obj, c, i, z, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۡۤۦ, reason: not valid java name and contains not printable characters */
    public static int[] m9411(Object obj) {
        if (C0049.m1767() <= 0) {
            return ((View) obj).getDrawableState();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m9412(Object obj) {
        if (C0191.m7812() >= 0) {
            return ((m9.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۧۧ, reason: not valid java name and contains not printable characters */
    public static Map m9413(Object obj) {
        if (C0122.m4736() <= 0) {
            return ((lg) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static e.a m9414() {
        if (C0172.m7180() >= 0) {
            return e.a.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۡ۠, reason: not valid java name and contains not printable characters */
    public static boolean m9415(Object obj) {
        if (C0021.m740() < 0) {
            return ((s0) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨۢ۟, reason: not valid java name and contains not printable characters */
    public static Map m9416(Object obj) {
        if (C0095.m3478() < 0) {
            return ((j6) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۤ, reason: not valid java name and contains not printable characters */
    public static int m9417(Object obj) {
        if (C0047.m1663() <= 0) {
            return ((CharSequence) obj).length();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m9418(Object obj, Object obj2) {
        if (C0002.m72() >= 0) {
            wr.V((View) obj, (uj) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۦۨۦ, reason: not valid java name and contains not printable characters */
    public static String m9376(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
