package androidx.appcompat.widget;

import android.animation.Keyframe;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.hardware.camera2.params.SessionConfiguration;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.LocaleList;
import android.support.v4.app.C0002;
import android.support.v4.app.C0004;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0009;
import android.text.PrecomputedText;
import android.text.TextPaint;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.OverScroller;
import android.widget.TextView;
import androidx.activity.C0017;
import androidx.activity.C0021;
import androidx.annotation.C0024;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0034;
import androidx.appcompat.app.C0037;
import androidx.appcompat.view.menu.C0039;
import androidx.appcompat.view.menu.C0040;
import androidx.core.app.C0051;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0065;
import androidx.drawerlayout.widget.C0070;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0079;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0094;
import androidx.lifecycle.C0106;
import androidx.lifecycle.C0107;
import androidx.lifecycle.C0108;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0119;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0122;
import androidx.versionedparcelable.C0129;
import androidx.versionedparcelable.C0133;
import androidx.versionedparcelable.C0135;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.HookMain;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ip;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.iq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jb;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.km;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.nd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.so;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ws;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.Executor;
import okhttp3.C0238;
import okhttp3.C0239;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.io.C0195;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.internal.ws.C0224;
import okhttp3.logging.C0231;
import retrofit2.converter.scalars.C0243;

/* JADX INFO: renamed from: androidx.appcompat.widget.ۧۡۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0047 {

    /* JADX INFO: renamed from: ۟ۢۨۤۤ, reason: not valid java name and contains not printable characters */
    public static int f41 = 993;

    /* JADX INFO: renamed from: ۟۟ۨ۠۠, reason: not valid java name and contains not printable characters */
    public static void m1640(Object obj) {
        if (C0231.m9265() >= 0) {
            ((Canvas) obj).restore();
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠۠۟, reason: not valid java name and contains not printable characters */
    public static short m1641(Object obj) {
        if (C0040.m1622() <= 0) {
            return ((f8) obj).a();
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: ۟۠ۢۡ۠, reason: not valid java name and contains not printable characters */
    public static int m1642(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۠ۦۤۥ, reason: not valid java name and contains not printable characters */
    public static Keyframe m1643(Object obj, float f) {
        if (C0243.m9964() >= 0) {
            return m0.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Keyframe) obj, f);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static ConnectionBlocker m1644(Object obj) {
        if (C0219.m8794() >= 0) {
            return ((k5) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static pr.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m1645(Object obj) {
        if (C0182.m7528() < 0) {
            return ((pr) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠۟, reason: not valid java name and contains not printable characters */
    public static boolean m1646(Object obj) {
        if (C0079.m3072() <= 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).e;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m1647(String str) {
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

    /* JADX INFO: renamed from: ۟ۡۢۦۣ, reason: not valid java name and contains not printable characters */
    public static int m1648(Object obj, Object obj2, int i, int i2) {
        if (C0195.m7914() >= 0) {
            return ((s2) obj).R((byte[]) obj2, i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۥۧ۠, reason: not valid java name and contains not printable characters */
    public static MenuItem m1649(Object obj, int i, int i2, int i3, Object obj2) {
        if (C0034.m1206() < 0) {
            return ((Menu) obj).add(i, i2, i3, (CharSequence) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧ۟, reason: not valid java name and contains not printable characters */
    public static void m1650(Object obj, int i, int i2) {
        if (C0178.m7344() < 0) {
            ((Rect) obj).inset(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۧۤۡ, reason: not valid java name and contains not printable characters */
    public static boolean m1651(Object obj) {
        if (C0224.m8861() < 0) {
            return C0240.m9871((l2) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m1652(int i, int i2, int i3) {
        if (C0009.m276() <= 0) {
            d4.d(i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m1653(Object obj, int i, Object obj2) {
        if (C0172.m7180() > 0) {
            return ((v0) obj).x0(i, (KeyEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۤۡ۟, reason: not valid java name and contains not printable characters */
    public static int[] m1654(Object obj) {
        if (C0058.m2184() >= 0) {
            return ((jq) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۢ, reason: not valid java name and contains not printable characters */
    public static boolean m1655(Object obj) {
        if (C0129.m5108() >= 0) {
            return ((t1) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۤۦۥ, reason: not valid java name and contains not printable characters */
    public static Executor m1656(Object obj) {
        if (C0204.m8270() < 0) {
            return ((SessionConfiguration) obj).getExecutor();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m1657(Object obj) {
        if (C0133.m5208() < 0) {
            return ((vf) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static int m1658(Object obj) {
        if (C0093.m3365() >= 0) {
            return ((View) obj).getScrollX();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟۟, reason: not valid java name and contains not printable characters */
    public static LocaleList m1659(Object obj) {
        if (C0070.m2829() <= 0) {
            return u0.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۥۤ, reason: not valid java name and contains not printable characters */
    public static vf m1660(Object obj, int i, Object obj2) {
        if (C0211.m8341() >= 0) {
            return ((vf) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m1661(Object obj) {
        if (C0078.m3044() < 0) {
            return ((OverScroller) obj).getFinalY();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥۢ, reason: not valid java name and contains not printable characters */
    public static float m1662(Object obj) {
        if (C0178.m7344() <= 0) {
            return ((Rect) obj).exactCenterY();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۤۤۥ, reason: not valid java name and contains not printable characters */
    public static int m1663() {
        return (-831) ^ C0182.f632;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨۨ, reason: not valid java name and contains not printable characters */
    public static gg m1664(Object obj, Object obj2) {
        if (C0199.m7998() < 0) {
            return ((hg) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((List) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۢ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.AccessibilityAction m1665() {
        if (C0024.m896() > 0) {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۡ۟, reason: not valid java name and contains not printable characters */
    public static void m1666(Object obj) {
        if (C0135.m5274() < 0) {
            ((Activity) obj).finishAffinity();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۦۣ۟, reason: not valid java name and contains not printable characters */
    public static ip m1667(Object obj, Object obj2) {
        if (C0078.m3044() < 0) {
            return ((ip) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ComponentName) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static void m1668(Object obj, Object obj2) {
        if (C0058.m2184() >= 0) {
            ((nd) obj).j((Throwable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۥۣ, reason: not valid java name and contains not printable characters */
    public static void m1669(Object obj, Object obj2, Object obj3) {
        if (C0120.m4608() >= 0) {
            ((xd) obj).J((jj) obj2, (Throwable) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۦۦۡ, reason: not valid java name and contains not printable characters */
    public static List m1670(Object obj) {
        if (C0017.m627() > 0) {
            return d2.n((Object[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۨۢ, reason: not valid java name and contains not printable characters */
    public static Object m1671(Object obj) {
        if (C0009.m276() <= 0) {
            return ((jk) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۥۤ, reason: not valid java name and contains not printable characters */
    public static ActionMode.Callback m1672(Object obj) {
        if (C0213.m8458() > 0) {
            return ((so.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۧۤ, reason: not valid java name and contains not printable characters */
    public static WindowManager.LayoutParams m1673(Object obj) {
        if (C0107.m3883() > 0) {
            return ((com.example.vcam.Menu.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static MediaFormat m1674(Object obj, int i) {
        if (C0231.m9265() > 0) {
            return ((MediaExtractor) obj).getTrackFormat(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1675(Object obj) {
        if (C0093.m3365() > 0) {
            return ((Rect) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۨۡۢ, reason: not valid java name and contains not printable characters */
    public static byte m1676(Object obj) {
        if (C0034.m1206() < 0) {
            return ((jb) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: ۠ۨۦۢ, reason: not valid java name and contains not printable characters */
    public static int m1677(Object obj, Object obj2, Object obj3) {
        if (C0119.m4573() > 0) {
            return ((pm) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Comparable) obj2, (Comparable) obj3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۢۥۡ, reason: not valid java name and contains not printable characters */
    public static int m1678(Object obj, Object obj2) {
        if (C0031.m1148() < 0) {
            return ((u1) obj).indexOf(obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۤۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean m1679(Object obj) {
        if (C0202.m8245() > 0) {
            return ((r0) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۦۤۡ, reason: not valid java name and contains not printable characters */
    public static void m1680(Object obj) {
        if (C0065.m2448() >= 0) {
            iq.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((iq) obj);
        }
    }

    /* JADX INFO: renamed from: ۡۧۡ, reason: not valid java name and contains not printable characters */
    public static int m1681(Object obj, Object obj2) {
        if (m1663() < 0) {
            return ((Configuration) obj).updateFrom((Configuration) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static int m1682(Object obj) {
        if (C0202.m8245() >= 0) {
            return ((InputStream) obj).read();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢۥۨ, reason: not valid java name and contains not printable characters */
    public static Typeface m1683(Object obj) {
        if (C0191.m7812() > 0) {
            return ((km) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m1684(Object obj, int i, int i2, int i3) {
        if (C0006.m169() <= 0) {
            return ((zr) obj).c(i, i2, i3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۤۦ۠, reason: not valid java name and contains not printable characters */
    public static fa m1685(Object obj) {
        if (C0106.m3835() > 0) {
            return ((wj) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۧۨ, reason: not valid java name and contains not printable characters */
    public static tm.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m1686(Object obj) {
        if (C0004.m139() < 0) {
            return ((tm.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Context m1687(Object obj) {
        if (C0108.m4038() > 0) {
            return ((r5) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m1688(Object obj, boolean z) {
        if (C0021.m740() <= 0) {
            ((ws) obj).v(z);
        }
    }

    /* JADX INFO: renamed from: ۤۡۥ۠, reason: not valid java name and contains not printable characters */
    public static boolean m1689(Object obj, Object obj2, Object obj3) {
        if (C0039.m1515() < 0) {
            return ((q.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((q) obj2, (Menu) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۡۨۢ, reason: not valid java name and contains not printable characters */
    public static void m1690(Object obj, float f, float f2) {
        if (C0002.m72() > 0) {
            ((Canvas) obj).translate(f, f2);
        }
    }

    /* JADX INFO: renamed from: ۤۧۡۨ, reason: not valid java name and contains not printable characters */
    public static int m1691(Object obj, int i) {
        if (C0107.m3883() >= 0) {
            return ((LayerDrawable) obj).getLayerInsetTop(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۨۧۡ, reason: not valid java name and contains not printable characters */
    public static void m1692() {
        if (C0238.m9653() >= 0) {
            uq.c();
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public static double m1693(double d, double d2) {
        if (C0171.m7136() < 0) {
            return Math.atan2(d, d2);
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: ۥ۠۠ۨ, reason: contains not printable characters */
    public static Surface m1694() {
        if (C0037.m1437() < 0) {
            return HookMain.c2_preview_Surfcae;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨ۠ۨ, reason: contains not printable characters */
    public static IntentFilter m1695(Object obj) {
        if (C0164.m6900() < 0) {
            return ((v0.g) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۟, reason: contains not printable characters */
    public static boolean m1696(Object obj, Object obj2) {
        if (C0034.m1206() < 0) {
            return ((l1.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TextView) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۡۧۡ, reason: contains not printable characters */
    public static CharSequence m1697(Object obj) {
        if (C0079.m3072() < 0) {
            return ((p) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥ, reason: contains not printable characters */
    public static Object m1698(Object obj, Object obj2) {
        if (C0122.m4736() < 0) {
            return ((qa) obj).invoke(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static int m1699(Object obj) {
        if (C0188.m7736() < 0) {
            return ((PrecomputedText.Params) obj).getBreakStrategy();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۡۡۡ, reason: not valid java name and contains not printable characters */
    public static int m1700(Object obj, int i, int i2) {
        if (C0051.m1783() <= 0) {
            return ((TypedArray) obj).getColor(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۢۧۥ, reason: not valid java name and contains not printable characters */
    public static xo m1701() {
        if (C0115.m4218() <= 0) {
            return C0181.m7451();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۤۢ, reason: not valid java name and contains not printable characters */
    public static Bundle m1702(Object obj) {
        if (C0094.m3450() >= 0) {
            return ((o5.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۦۨ, reason: not valid java name and contains not printable characters */
    public static void m1703(Object obj, Object obj2, Object obj3) {
        if (C0040.m1622() <= 0) {
            ((qo) obj).s((String) obj2, (Drawable) obj3);
        }
    }

    /* JADX INFO: renamed from: ۨۢۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1704(Object obj, Object obj2) {
        if (C0172.m7180() > 0) {
            return ((a3) obj).l((a3) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨۥۥ, reason: not valid java name and contains not printable characters */
    public static String m1706(Object obj) {
        if (C0239.m9805() < 0) {
            return ((a3) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۡۦ, reason: not valid java name and contains not printable characters */
    public static Paint.FontMetricsInt m1707(Object obj) {
        if (C0169.m7034() < 0) {
            return ((TextPaint) obj).getFontMetricsInt();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۠۟, reason: not valid java name and contains not printable characters */
    public static String m1705(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
