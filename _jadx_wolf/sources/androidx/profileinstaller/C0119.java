package androidx.profileinstaller;

import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.RectF;
import android.media.Image;
import android.net.Uri;
import android.os.Parcel;
import android.support.v4.app.C0002;
import android.text.TextPaint;
import android.transition.TransitionSet;
import android.view.MenuItem;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.activity.C0014;
import androidx.activity.C0017;
import androidx.activity.C0021;
import androidx.appcompat.app.C0034;
import androidx.appcompat.app.C0036;
import androidx.appcompat.view.menu.C0039;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0047;
import androidx.core.app.C0053;
import androidx.core.app.C0055;
import androidx.core.content.C0057;
import androidx.core.graphics.drawable.C0066;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0083;
import androidx.emoji2.text.C0084;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0096;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.lifecycle.C0106;
import androidx.savedstate.C0122;
import androidx.savedstate.C0123;
import com.example.vcam.C0141;
import com.example.vcam.Menu;
import com.example.vcam.VideoToFrames;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ad;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.b;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.oi;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uh;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.us;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ws;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import okhttp3.C0238;
import okhttp3.C0239;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.ws.C0224;
import okhttp3.logging.C0231;
import okhttp3.logging.C0233;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: androidx.profileinstaller.ۧۧۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0119 {

    /* JADX INFO: renamed from: ۟ۡ۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static int f99 = 141;

    /* JADX INFO: renamed from: ۣ۟۟۠۠, reason: not valid java name and contains not printable characters */
    public static int m4540(Object obj) {
        if (C0112.m4054() <= 0) {
            return ((Method) obj).getModifiers();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۢۢ۟, reason: not valid java name and contains not printable characters */
    public static vf m4541(Object obj) {
        if (C0123.m4841() < 0) {
            return ((vf) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m4542(Object obj, Object obj2, int i, int i2) {
        if (C0171.m7136() < 0) {
            ((OutputStream) obj).write((byte[]) obj2, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۥۨۡ, reason: not valid java name and contains not printable characters */
    public static mf m4543() {
        if (C0106.m3835() > 0) {
            return u0.i();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۣۨ, reason: not valid java name and contains not printable characters */
    public static int m4544(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۠۟۠۟, reason: not valid java name and contains not printable characters */
    public static Thread m4545(Object obj) {
        if (C0171.m7136() <= 0) {
            return ((u6) obj).u0();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static Uri m4546(Object obj) {
        if (C0162.m6837() < 0) {
            return ((bd.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m4547(Object obj) {
        if (C0083.m3188() < 0) {
            ((v0) obj).J();
        }
    }

    /* JADX INFO: renamed from: ۟۠ۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m4548(Object obj, int i) {
        if (C0112.m4054() <= 0) {
            ((rp) obj).c(i);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۥ۠ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4549() {
        if (C0238.m9653() >= 0) {
            return s7.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static float m4550(Object obj) {
        if (C0233.m9365() <= 0) {
            return ((us) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢ۠, reason: not valid java name and contains not printable characters */
    public static void m4551(Object obj, Object obj2) {
        if (C0106.m3835() > 0) {
            ((TextView) obj).setHintTextColor((ColorStateList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۦۧ۟, reason: not valid java name and contains not printable characters */
    public static Window.Callback m4552(Object obj) {
        if (C0040.m1622() <= 0) {
            return ((vs) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۨۤ, reason: not valid java name and contains not printable characters */
    public static void m4553(Object obj, Object obj2, Object obj3) {
        if (C0084.m3253() <= 0) {
            ((View) obj).setOnReceiveContentListener((String[]) obj2, (OnReceiveContentListener) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۥۣۨ, reason: not valid java name and contains not printable characters */
    public static boolean m4554(Object obj) {
        if (C0047.m1663() < 0) {
            return ((PopupWindow) obj).getOverlapAnchor();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۠۟, reason: not valid java name and contains not printable characters */
    public static int m4555(Object obj) {
        if (C0036.m1332() <= 0) {
            return ((MenuItem) obj).getItemId();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m4556(Object obj, boolean z) {
        if (C0161.m6744() > 0) {
            ((Dialog) obj).setCancelable(z);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۢۦۧ, reason: not valid java name and contains not printable characters */
    public static void m4557(Object obj, boolean z) {
        if (C0240.m9826() >= 0) {
            ((e1) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(z);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static List m4558(Object obj) {
        if (C0149.m6476() < 0) {
            return ((TransitionSet) obj).getTargets();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۢ۠, reason: not valid java name and contains not printable characters */
    public static OutputStream m4559(Object obj) {
        if (C0224.m8861() <= 0) {
            return ((Socket) obj).getOutputStream();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۣۨ, reason: not valid java name and contains not printable characters */
    public static void m4560(Object obj) {
        if (C0217.m8693() < 0) {
            ((k0.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣ۟۠, reason: not valid java name and contains not printable characters */
    public static String m4561(String str) {
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

    /* JADX INFO: renamed from: ۟ۥ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static void m4562(Object obj) {
        if (C0017.m627() >= 0) {
            wr.d.r((View) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static List m4563(Object obj) {
        if (C0014.m545() >= 0) {
            return h.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۦۧ, reason: not valid java name and contains not printable characters */
    public static m2 m4564(Object obj) {
        if (C0002.m72() >= 0) {
            return m2.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۡۡ, reason: not valid java name and contains not printable characters */
    public static TextPaint m4565(Object obj) {
        if (C0055.m2054() > 0) {
            return ((uk.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.C0145x35d57e31) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۦ, reason: not valid java name and contains not printable characters */
    public static Fragment m4566(Object obj) {
        if (C0141.m5769() >= 0) {
            return ((c) obj).c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۣۤ, reason: not valid java name and contains not printable characters */
    public static ImageView m4567(Object obj) {
        if (C0169.m7034() <= 0) {
            return ((d1) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4568(Object obj, Object obj2) {
        if (C0200.m8104() <= 0) {
            return ((Map.Entry) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static mk.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa[] m4569(Object obj) {
        if (C0199.m7998() < 0) {
            return ((m0.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۥۡ, reason: not valid java name and contains not printable characters */
    public static void m4570(Object obj, Object obj2) {
        if (C0057.m2142() > 0) {
            ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Resources.Theme) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۨۨ۠, reason: not valid java name and contains not printable characters */
    public static int m4571(Object obj) {
        if (C0199.m7998() < 0) {
            return ((z1) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۡۢ۟, reason: not valid java name and contains not printable characters */
    public static View m4572(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0231.m9265() >= 0) {
            return ((qo) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj2, (Cursor) obj3, (ViewGroup) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۧ۠, reason: not valid java name and contains not printable characters */
    public static int m4573() {
        return 658 ^ C0172.f622;
    }

    /* JADX INFO: renamed from: ۟ۧۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m4574(Object obj) {
        if (C0078.m3044() <= 0) {
            return ((f7) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۧۧۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4575() {
        if (C0053.m1959() > 0) {
            return v6.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static Context m4576(Object obj) {
        if (C0172.m7180() >= 0) {
            return ((ws) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۦۦ, reason: not valid java name and contains not printable characters */
    public static void m4577(Object obj, Object obj2) {
        if (C0122.m4736() < 0) {
            ((ActionBarContextView) obj).setCustomView((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡ۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static int m4578(Object obj) {
        if (C0200.m8104() < 0) {
            return ((k6) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۡۥۧ, reason: not valid java name and contains not printable characters */
    public static xp m4579(Object obj) {
        if (C0094.m3450() > 0) {
            return ((p0) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۨۧ, reason: not valid java name and contains not printable characters */
    public static void m4580(Object obj) {
        if (C0055.m2054() > 0) {
            ((ActionBarContextView) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۡۧۧۦ, reason: not valid java name and contains not printable characters */
    public static int m4581(Object obj) {
        if (C0217.m8693() <= 0) {
            return ((e3) obj).h();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۧۤۦ, reason: not valid java name and contains not printable characters */
    public static void m4582(Object obj, int i, Object obj2) {
        if (C0122.m4736() <= 0) {
            ((View) obj).setTag(i, obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m4583(Object obj, Object obj2) {
        if (C0113.m4144() < 0) {
            return ((l1) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((RectF) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static ViewGroup m4584(Object obj) {
        if (C0039.m1515() < 0) {
            return ((zr) obj).m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨ, reason: not valid java name and contains not printable characters */
    public static byte[] m4585(Object obj, int i) {
        if (C0199.m7998() <= 0) {
            return VideoToFrames.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Image) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۨۤ, reason: not valid java name and contains not printable characters */
    public static int m4586(Object obj, Object obj2) {
        if (C0096.m3601() < 0) {
            return ((b.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Collection) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۤ۠۟, reason: not valid java name and contains not printable characters */
    public static ColorStateList m4587(Object obj, int i, Object obj2) {
        if (C0164.m6900() <= 0) {
            return m4.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Resources) obj, i, (Resources.Theme) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m4588(Object obj) {
        if (C0093.m3365() > 0) {
            return ((ByteBuffer) obj).remaining();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static sn m4589(Object obj) {
        if (C0224.m8861() < 0) {
            return sj.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((OutputStream) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۧۢ, reason: not valid java name and contains not printable characters */
    public static void m4590(Object obj, int i) {
        if (C0002.m72() >= 0) {
            ((Parcel) obj).setDataPosition(i);
        }
    }

    /* JADX INFO: renamed from: ۤۦۧۦ, reason: not valid java name and contains not printable characters */
    public static short m4591(Object obj) {
        if (C0169.m7034() <= 0) {
            return ((oi) obj).c();
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: ۥ۟ۡۥ, reason: contains not printable characters */
    public static String m4592(Object obj) {
        if (C0047.m1663() <= 0) {
            return ((pr.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).getGroupName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۦ۟, reason: contains not printable characters */
    public static void m4593(Object obj, Object obj2, Object obj3) {
        if (C0021.m740() < 0) {
            ((pr.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TypedArray) obj2, (XmlPullParser) obj3);
        }
    }

    /* JADX INFO: renamed from: ۦۣۣ۟, reason: contains not printable characters */
    public static ad.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m4594(Object obj) {
        if (C0217.m8693() <= 0) {
            return ((ad.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧ۠۠, reason: contains not printable characters */
    public static Menu m4595(Object obj) {
        if (C0036.m1332() <= 0) {
            return ((uh) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۧۡ, reason: not valid java name and contains not printable characters */
    public static Map m4596() {
        if (C0066.m2514() > 0) {
            return a9.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m4597() {
        if (C0169.m7034() <= 0) {
            return "ۨۥۨ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۤ۟, reason: not valid java name and contains not printable characters */
    public static bo.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m4599(Object obj) {
        if (C0172.m7180() >= 0) {
            return ((bo) obj).b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m4600(Object obj) {
        if (C0112.m4054() <= 0) {
            return ((tm.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).hasNext();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static CharSequence m4601(Object obj) {
        if (C0239.m9805() < 0) {
            return ((v0) obj).l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۨۧ, reason: not valid java name and contains not printable characters */
    public static void m4602(Object obj, Object obj2) {
        if (C0034.m1206() <= 0) {
            ((qm) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ColorStateList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨ۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m4598(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
