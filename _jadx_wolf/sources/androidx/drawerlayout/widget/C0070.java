package androidx.drawerlayout.widget;

import android.content.Context;
import android.content.Intent;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.C0002;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0010;
import android.support.v4.graphics.drawable.C0011;
import android.text.Editable;
import android.text.StaticLayout;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityRecord;
import android.view.inputmethod.EditorInfo;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.activity.C0020;
import androidx.activity.C0021;
import androidx.annotation.C0024;
import androidx.annotation.C0025;
import androidx.annotation.C0026;
import androidx.appcompat.app.C0034;
import androidx.appcompat.app.C0037;
import androidx.appcompat.view.menu.C0039;
import androidx.appcompat.widget.C0047;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0052;
import androidx.core.content.C0057;
import androidx.core.content.UnusedAppRestrictionsBackportService;
import androidx.core.graphics.drawable.C0064;
import androidx.core.graphics.drawable.C0065;
import androidx.core.graphics.drawable.C0066;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0083;
import androidx.emoji2.text.C0084;
import androidx.fragment.app.C0095;
import androidx.fragment.app.C0096;
import androidx.fragment.app.C0097;
import androidx.lifecycle.C0106;
import androidx.lifecycle.C0108;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0122;
import androidx.savedstate.C0123;
import androidx.savedstate.C0126;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0129;
import androidx.versionedparcelable.C0133;
import com.example.vcam.C0141;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.am;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.at;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.c;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.c0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ce;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.oc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.BitSet;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import okhttp3.HttpUrl;
import okhttp3.internal.C0227;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.internal.ws.C0224;
import okhttp3.logging.C0231;
import okhttp3.logging.C0233;
import okhttp3.logging.C0235;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import retrofit2.C0259;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: androidx.drawerlayout.widget.۟۟ۡۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0070 {

    /* JADX INFO: renamed from: ۟ۧۤۨۡ, reason: not valid java name and contains not printable characters */
    public static int f64 = -721;

    /* JADX INFO: renamed from: ۟۟۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static void m2758(Object obj, Object obj2, short s) {
        if (C0129.m5108() > 0) {
            ((Bundle) obj).putShort((String) obj2, s);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۡۤۧ, reason: not valid java name and contains not printable characters */
    public static View m2759(Object obj, int i) {
        if (C0191.m7812() > 0) {
            return ((Window.Callback) obj).onCreatePanelView(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static tf m2760(Object obj) {
        if (C0057.m2142() >= 0) {
            return ((tf) obj).g();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static WeakReference m2761(Object obj) {
        if (C0182.m7528() <= 0) {
            return ((wr.l) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean m2762(Object obj) {
        if (C0215.m8604() < 0) {
            return ((v0.e) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m2763(Object obj) {
        if (C0020.m701() >= 0) {
            return ((r0) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static String m2764(String str) {
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

    /* JADX INFO: renamed from: ۟۠ۦۥ۟, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m2765(Object obj) {
        if (C0026.m1047() >= 0) {
            return ((yf) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۧۤ, reason: not valid java name and contains not printable characters */
    public static Void m2766(Object obj) {
        if (C0002.m72() >= 0) {
            return ((p8) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨ۠ۢ, reason: not valid java name and contains not printable characters */
    public static CancellationException m2767(Object obj, Object obj2) {
        if (C0224.m8861() <= 0) {
            return e.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj, (Throwable) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۥۢ, reason: not valid java name and contains not printable characters */
    public static y m2768(Object obj, int i, Object obj2) {
        if (C0181.m7445() > 0) {
            return ((c0) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, (Intent) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static Class[] m2769() {
        if (C0227.m9046() >= 0) {
            return uo.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۨ, reason: not valid java name and contains not printable characters */
    public static f6.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m2770(Object obj) {
        if (C0204.m8270() <= 0) {
            return ((f6.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static TextView m2771(Object obj) {
        if (C0066.m2514() >= 0) {
            return ((l1) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۨ۠, reason: not valid java name and contains not printable characters */
    public static int[] m2772(Object obj) {
        if (C0116.m4340() > 0) {
            return ((CheckedTextView) obj).getDrawableState();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۢۥ, reason: not valid java name and contains not printable characters */
    public static StaticLayout.Builder m2773(Object obj, int i) {
        if (C0231.m9265() >= 0) {
            return ((StaticLayout.Builder) obj).setMaxLines(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨ۟, reason: not valid java name and contains not printable characters */
    public static x1 m2774(Object obj) {
        if (C0066.m2514() >= 0) {
            return ((pr.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static int m2775(Object obj) {
        if (C0141.m5769() > 0) {
            return ((s5) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥۡ, reason: not valid java name and contains not printable characters */
    public static Drawable.Callback m2776(Object obj) {
        if (C0025.m934() > 0) {
            return ((Drawable) obj).getCallback();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۧۦ, reason: not valid java name and contains not printable characters */
    public static int m2777(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static ce m2778(Object obj, Object obj2) {
        if (C0083.m3188() <= 0) {
            return ((am) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Class) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۡ, reason: not valid java name and contains not printable characters */
    public static h m2779(Object obj) {
        if (C0096.m3601() < 0) {
            return wr.c((View) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static void m2780(Object obj, Object obj2, int i) {
        if (C0249.m10052() <= 0) {
            y7.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((EditorInfo) obj, (CharSequence) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤۨ, reason: not valid java name and contains not printable characters */
    public static int m2781(Object obj) {
        if (C0106.m3835() >= 0) {
            return ((WindowManager.LayoutParams) obj).y;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۥۥۨ, reason: not valid java name and contains not printable characters */
    public static void m2782(Object obj, int i, int i2, int i3, int i4) {
        if (C0108.m4038() > 0) {
            ((LinearLayout.LayoutParams) obj).setMargins(i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m2783(Object obj, Object obj2) {
        if (C0148.m6464() <= 0) {
            ((hm) obj).k((Context) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static int m2784(Object obj, int i, int i2) {
        if (C0213.m8458() > 0) {
            return dl.f((BitSet) obj, i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۥۤ, reason: not valid java name and contains not printable characters */
    public static int m2785(Object obj) {
        if (C0052.m1890() >= 0) {
            return ((LayerDrawable) obj).getNumberOfLayers();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static KeyListener m2786(Object obj) {
        if (C0235.m9535() < 0) {
            return ((e8) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۡۥ, reason: not valid java name and contains not printable characters */
    public static void m2787(Object obj, int i) throws IOException {
        if (C0065.m2448() >= 0) {
            r8.j((OutputStream) obj, i);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۢۦۦ, reason: not valid java name and contains not printable characters */
    public static String m2788(Object obj, Object obj2, Object obj3, Object obj4, int i, Object obj5, Object obj6) {
        if (C0011.m458() >= 0) {
            return mn.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((hn) obj, (CharSequence) obj2, (CharSequence) obj3, (CharSequence) obj4, i, (CharSequence) obj5, (qa) obj6);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۧۥ, reason: not valid java name and contains not printable characters */
    public static void m2789(Object obj, Object obj2) {
        if (C0084.m3253() <= 0) {
            ((View) obj).removeOnAttachStateChangeListener((View.OnAttachStateChangeListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static Editable m2790(Object obj) {
        if (C0149.m6476() < 0) {
            return ((EditText) obj).getEditableText();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۨ, reason: not valid java name and contains not printable characters */
    public static void m2791(Object obj, Object obj2, int i, int i2, Object obj3) {
        if (C0219.m8794() > 0) {
            ((ViewParent) obj).onNestedPreScroll((View) obj2, i, i2, (int[]) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۥۦۡ, reason: not valid java name and contains not printable characters */
    public static void m2792(Object obj, int i) {
        if (C0097.m3659() >= 0) {
            ((u1) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۦۥۣ, reason: not valid java name and contains not printable characters */
    public static void m2793(Object obj, int i, int i2) {
        if (C0064.m2388() >= 0) {
            ((LayerDrawable) obj).setLayerWidth(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static int m2794(Object obj) {
        if (C0162.m6837() <= 0) {
            return ((i.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧ۠, reason: not valid java name and contains not printable characters */
    public static void m2795(Object obj, Object obj2) {
        if (C0010.m354() < 0) {
            ((Drawable) obj).setTintMode((PorterDuff.Mode) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static u2 m2796(Object obj) {
        if (C0218.m8760() >= 0) {
            return ((u2) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m2797(Object obj, float f, float f2) {
        if (C0026.m1047() > 0) {
            return ((Matrix) obj).postTranslate(f, f2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static int m2798(Object obj) {
        if (C0010.m354() < 0) {
            return ((PorterDuff.Mode) obj).hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۤۨۧ, reason: not valid java name and contains not printable characters */
    public static int m2799(Object obj) {
        if (C0024.m896() > 0) {
            return ((uo.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۢۧۡ, reason: not valid java name and contains not printable characters */
    public static boolean m2800(Object obj, boolean z) {
        if (C0120.m4608() >= 0) {
            return ((v0) obj).G(z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۡۦۨ, reason: not valid java name and contains not printable characters */
    public static void m2801(Object obj, Object obj2, Object obj3) throws XmlPullParserException {
        if (C0006.m169() < 0) {
            ((XmlPullParser) obj).setInput((InputStream) obj2, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۡۥۢۨ, reason: not valid java name and contains not printable characters */
    public static int m2802(Object obj) {
        if (C0074.m2951() <= 0) {
            return ((StaticLayout) obj).getLineCount();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۥۦ۟, reason: not valid java name and contains not printable characters */
    public static int m2803(Object obj, int i) {
        if (C0078.m3044() < 0) {
            return mp.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj, i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢۤۤ, reason: not valid java name and contains not printable characters */
    public static boolean m2804(Object obj, Object obj2) {
        if (C0122.m4736() <= 0) {
            return ((Window.Callback) obj).dispatchTrackballEvent((MotionEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۥۥۢ, reason: not valid java name and contains not printable characters */
    public static Object[] m2805(Object obj, int i, int i2) {
        if (C0024.m896() >= 0) {
            return Arrays.copyOfRange((Object[]) obj, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۥ۠, reason: not valid java name and contains not printable characters */
    public static boolean m2806(Object obj, Object obj2) {
        if (C0021.m740() < 0) {
            return ((AccessibilityNodeInfo) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۦۤ, reason: not valid java name and contains not printable characters */
    public static boolean m2807(Object obj) {
        if (C0214.m8575() < 0) {
            return ((View) obj).isImportantForAccessibility();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۦۣ۟, reason: not valid java name and contains not printable characters */
    public static int m2808(Object obj) {
        if (C0034.m1206() <= 0) {
            return ((c) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۦۤۦ, reason: not valid java name and contains not printable characters */
    public static boolean m2809(Object obj, Object obj2, Object obj3) {
        if (C0037.m1437() <= 0) {
            return ((wr.k) obj).onUnhandledKeyEvent((View) obj2, (KeyEvent) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۢۡ, reason: not valid java name and contains not printable characters */
    public static wn m2810(Object obj) {
        if (C0233.m9365() <= 0) {
            return ((j0.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).D;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m2811() {
        if (C0126.m4908() < 0) {
            return "ۤۨۧ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۧۥ, reason: not valid java name and contains not printable characters */
    public static a6 m2812() {
        if (C0037.m1437() <= 0) {
            return n7.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۤ۠, reason: not valid java name and contains not printable characters */
    public static void m2813(Object obj) {
        if (C0047.m1663() <= 0) {
            ((l2) obj).r();
        }
    }

    /* JADX INFO: renamed from: ۤۦۤۧ, reason: not valid java name and contains not printable characters */
    public static f6.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m2814() {
        if (C0084.m3253() <= 0) {
            return f6.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean m2815(Object obj, int i) {
        if (C0095.m3478() <= 0) {
            return ((Drawable) obj).setLayoutDirection(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۡۤ, reason: contains not printable characters */
    public static String m2816() {
        if (C0259.m10136() >= 0) {
            return "۠ۤۦ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۤۤ, reason: contains not printable characters */
    public static void m2817(Object obj, Object obj2) {
        if (C0128.m5064() <= 0) {
            ((View) obj).addOnUnhandledKeyEventListener((View.OnUnhandledKeyEventListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۤۡۤ, reason: contains not printable characters */
    public static void m2818(Object obj, Object obj2, Object obj3) {
        if (C0249.m10052() <= 0) {
            ((WindowManager) obj).updateViewLayout((View) obj2, (ViewGroup.LayoutParams) obj3);
        }
    }

    /* JADX INFO: renamed from: ۥۨۦ, reason: contains not printable characters */
    public static int m2819(Object obj) {
        if (C0049.m1767() <= 0) {
            return ((m.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦ۟ۦۦ, reason: contains not printable characters */
    public static void m2820(Object obj, Object obj2) {
        if (C0123.m4841() <= 0) {
            ((at) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦ۠ۦ۟, reason: contains not printable characters */
    public static Field m2821() {
        if (C0227.m9046() >= 0) {
            return x.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۡ, reason: contains not printable characters */
    public static void m2822(Object obj, Object obj2) {
        if (C0219.m8794() >= 0) {
            ((Switch) obj).setLayoutParams((ViewGroup.LayoutParams) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۥۡۨ, reason: contains not printable characters */
    public static String m2823() {
        if (C0191.m7812() > 0) {
            return "ۥ۟ۢ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m2824(Object obj, Object obj2, int i, Object obj3) {
        if (C0133.m5208() < 0) {
            return ((z0.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).d((Context) obj2, i, (Drawable) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۧۦ۟, reason: not valid java name and contains not printable characters */
    public static void m2825(Object obj, Object obj2, Object obj3) {
        if (C0039.m1515() < 0) {
            ((wr.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).b((View) obj2, (CharSequence) obj3);
        }
    }

    /* JADX INFO: renamed from: ۧۥۧ۟, reason: not valid java name and contains not printable characters */
    public static void m2826(Object obj, int i) {
        if (C0123.m4841() <= 0) {
            k.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((AccessibilityRecord) obj, i);
        }
    }

    /* JADX INFO: renamed from: ۧۨ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m2827(Object obj, Object obj2, int i, int i2) {
        if (C0259.m10136() >= 0) {
            ((MessageDigest) obj).update((byte[]) obj2, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۣۨ۟, reason: not valid java name and contains not printable characters */
    public static boolean m2828(Object obj) {
        if (C0002.m72() > 0) {
            return ((pr) obj).isAutoMirrored();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۨ, reason: not valid java name and contains not printable characters */
    public static int m2829() {
        return (-192) ^ C0213.f663;
    }

    /* JADX INFO: renamed from: ۣۣۨۤ, reason: not valid java name and contains not printable characters */
    public static void m2830(Object obj, Object obj2) throws RemoteException {
        if (C0084.m3253() <= 0) {
            ((UnusedAppRestrictionsBackportService.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((oc) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۨۤۥ, reason: not valid java name and contains not printable characters */
    public static String m2831(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
