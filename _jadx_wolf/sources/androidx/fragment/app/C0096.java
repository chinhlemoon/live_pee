package androidx.fragment.app;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.C0002;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0010;
import android.support.v4.graphics.drawable.C0011;
import android.text.PrecomputedText;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.Surface;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.activity.C0020;
import androidx.annotation.C0023;
import androidx.annotation.C0025;
import androidx.annotation.C0026;
import androidx.appcompat.app.C0035;
import androidx.appcompat.app.C0036;
import androidx.appcompat.app.C0037;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.C0047;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0051;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0064;
import androidx.core.widget.C0068;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0070;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0079;
import androidx.emoji2.text.C0083;
import androidx.lifecycle.C0108;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0117;
import androidx.savedstate.C0126;
import androidx.savedstate.C0127;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0133;
import com.example.vcam.C0141;
import com.example.vcam.HookMain;
import com.example.vcam.MainActivity;
import com.example.vcam.Menu;
import com.example.vcam.VideoPickerActivity;
import com.example.vcam.VideoToFrames;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ib;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.id;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ii;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.us;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ws;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z0;
import java.io.ByteArrayOutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import okhttp3.HttpUrl;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.ws.C0224;
import okhttp3.logging.C0231;
import okhttp3.logging.C0233;
import okhttp3.logging.C0234;
import okhttp3.logging.C0236;
import retrofit2.C0259;

/* JADX INFO: renamed from: androidx.fragment.app.ۣ۠ۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0096 {

    /* JADX INFO: renamed from: ۟۠ۤۦۧ, reason: not valid java name and contains not printable characters */
    public static int f83 = 803;

    /* JADX INFO: renamed from: ۟۟۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static Bitmap m3527(Object obj) {
        if (C0201.m8184() <= 0) {
            return BitmapFactory.decodeFile((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static Iterator m3528(Object obj) {
        if (C0211.m8341() > 0) {
            return ((Set) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۡۥ۠, reason: not valid java name and contains not printable characters */
    public static char m3529(Object obj) {
        if (C0126.m4908() < 0) {
            return ((Character) obj).charValue();
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static void m3530(Object obj, Object obj2) {
        if (C0020.m701() >= 0) {
            v0.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Configuration) obj, (Locale) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static VideoToFrames m3531() {
        if (C0234.m9461() <= 0) {
            return HookMain.hw_decode_obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧۦ۠, reason: not valid java name and contains not printable characters */
    public static void m3532(Object obj, long j) {
        if (C0126.m4908() < 0) {
            ((ValueAnimator) obj).setStartDelay(j);
        }
    }

    /* JADX INFO: renamed from: ۟۠۠ۢۦ, reason: not valid java name and contains not printable characters */
    public static xo m3533() {
        if (C0047.m1663() < 0) {
            return pp.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۨۤ, reason: not valid java name and contains not printable characters */
    public static Object m3534(Object obj, Object obj2, Object obj3) {
        if (C0211.m8341() > 0) {
            return ((pp.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj2, (y5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۢۢ, reason: not valid java name and contains not printable characters */
    public static void m3535(Object obj, Object obj2, boolean z) {
        if (C0141.m5769() > 0) {
            Menu.m5583((Menu) obj, (CompoundButton) obj2, z);
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static String m3536(String str) {
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

    /* JADX INFO: renamed from: ۟ۡ۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m3537(Object obj) {
        if (C0035.m1268() < 0) {
            return ((WindowInsets) obj).isConsumed();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡ۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static tf m3538(Object obj) {
        if (C0224.m8861() < 0) {
            return ((tf) obj).c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۦۣ, reason: not valid java name and contains not printable characters */
    public static Object m3539(Object obj, Object obj2) {
        if (C0049.m1767() < 0) {
            return ((h2) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۥۧ, reason: not valid java name and contains not printable characters */
    public static boolean m3540() {
        if (C0083.m3188() < 0) {
            return tk.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۧۥۨ, reason: not valid java name and contains not printable characters */
    public static void m3541(Object obj) {
        if (C0164.m6900() < 0) {
            ((f6.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).f();
        }
    }

    /* JADX INFO: renamed from: ۟ۡۨۨ۟, reason: not valid java name and contains not printable characters */
    public static d0 m3542(Object obj) {
        if (C0161.m6744() >= 0) {
            return ((VideoPickerActivity) obj).u;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m3544() {
        if (C0037.m1437() <= 0) {
            return Build.MODEL;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۢۧ, reason: not valid java name and contains not printable characters */
    public static int m3545(Object obj) {
        if (C0079.m3072() < 0) {
            return ((y) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۥۥ۠, reason: not valid java name and contains not printable characters */
    public static int[] m3546(Object obj, int i, int i2) {
        if (C0064.m2388() >= 0) {
            return ib.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((int[]) obj, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣ۟ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m3547(Object obj) {
        if (C0010.m354() <= 0) {
            return r8.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((byte[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static SubMenu m3548(Object obj, Object obj2) {
        if (C0211.m8341() >= 0) {
            return ((SubMenu) obj).setHeaderTitle((CharSequence) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۨ, reason: not valid java name and contains not printable characters */
    public static int m3549(Object obj) {
        if (C0127.m4950() > 0) {
            return ((ws) obj).g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤۥ, reason: not valid java name and contains not printable characters */
    public static MenuItem m3550(Object obj, Object obj2) {
        if (C0215.m8604() < 0) {
            return ii.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.e((MenuItem) obj, (CharSequence) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۤۨ, reason: not valid java name and contains not printable characters */
    public static void m3551(Object obj) {
        if (C0176.m7290() >= 0) {
            ((Thread) obj).start();
        }
    }

    /* JADX INFO: renamed from: ۟ۤۦ۟, reason: not valid java name and contains not printable characters */
    public static void m3552(Object obj, Object obj2) {
        if (C0116.m4340() > 0) {
            t3.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((CheckedTextView) obj, (PorterDuff.Mode) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۦۣ۟, reason: not valid java name and contains not printable characters */
    public static float m3553(Object obj) {
        if (C0011.m458() > 0) {
            return ((m2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).b;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨۡ, reason: not valid java name and contains not printable characters */
    public static Buffer m3554(Object obj, int i) {
        if (C0176.m7290() >= 0) {
            return ((ByteBuffer) obj).position(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨۢ, reason: not valid java name and contains not printable characters */
    public static void m3555(Object obj, int i) {
        if (C0097.m3659() > 0) {
            ((v0) obj).y0(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static boolean m3556(Object obj, Object obj2) {
        if (C0171.m7136() <= 0) {
            return n5.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj, obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۡۥۢ, reason: not valid java name and contains not printable characters */
    public static s2 m3557(Object obj, int i) {
        if (C0128.m5064() <= 0) {
            return ((s2) obj).j0(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۤۥ, reason: not valid java name and contains not printable characters */
    public static boolean m3558(Object obj) {
        if (C0162.m6837() <= 0) {
            return ((Surface) obj).isValid();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۤۥ۠, reason: not valid java name and contains not printable characters */
    public static Intent m3559(Object obj) {
        if (C0234.m9461() <= 0) {
            return ((id.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۣ۠, reason: not valid java name and contains not printable characters */
    public static xs m3560(Object obj) {
        if (C0068.m2650() > 0) {
            return ((xs) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۥۤ, reason: not valid java name and contains not printable characters */
    public static int m3561(Object obj, int i, int i2) {
        if (C0049.m1767() < 0) {
            return ((TypedArray) obj).getResourceId(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۨۢ۟, reason: not valid java name and contains not printable characters */
    public static AppCompatMultiAutoCompleteTextView m3562(Object obj, Object obj2, Object obj3) {
        if (C0117.m4419() < 0) {
            return ((m1) obj).b((Context) obj2, (AttributeSet) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۡۢ, reason: not valid java name and contains not printable characters */
    public static int m3563(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦۣۢۨ, reason: not valid java name and contains not printable characters */
    public static void m3564(Object obj, Object obj2) {
        if (C0036.m1332() < 0) {
            ((Button) obj).setText((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢ۠, reason: not valid java name and contains not printable characters */
    public static void m3565(Object obj, boolean z) {
        if (C0233.m9365() <= 0) {
            ((AccessibilityNodeInfo) obj).setFocused(z);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static void m3566(Object obj, Object obj2) {
        if (C0133.m5208() < 0) {
            ((xs.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).e((dd) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.AccessibilityAction m3567() {
        if (C0023.m843() >= 0) {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۧۥ, reason: not valid java name and contains not printable characters */
    public static int m3568(Object obj) {
        if (C0171.m7136() <= 0) {
            return C0025.m937((d7) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۦۥۥ, reason: not valid java name and contains not printable characters */
    public static int m3569(Object obj) {
        if (C0025.m934() >= 0) {
            return k1.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TextView) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۧۦۢ, reason: not valid java name and contains not printable characters */
    public static void m3570(Object obj, long j) {
        if (C0074.m2951() < 0) {
            LockSupport.parkNanos(obj, j);
        }
    }

    /* JADX INFO: renamed from: ۡ۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m3571(Object obj) {
        if (C0161.m6744() > 0) {
            ((a) obj).A();
        }
    }

    /* JADX INFO: renamed from: ۡ۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static AtomicIntegerFieldUpdater m3572() {
        if (C0188.m7736() < 0) {
            return t4.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۦۢ, reason: not valid java name and contains not printable characters */
    public static Fragment m3573(Object obj, Object obj2, Object obj3) {
        if (C0070.m2829() < 0) {
            return Fragment.I((Context) obj, (String) obj2, (Bundle) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۦۥ, reason: not valid java name and contains not printable characters */
    public static HookMain m3574(Object obj) {
        if (C0224.m8861() <= 0) {
            return ((HookMain.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۧ, reason: not valid java name and contains not printable characters */
    public static void m3575(Object obj, Object obj2, Object obj3) {
        if (C0234.m9461() <= 0) {
            ((AtomicReferenceFieldUpdater) obj).lazySet(obj2, obj3);
        }
    }

    /* JADX INFO: renamed from: ۣۢۢ۟, reason: not valid java name and contains not printable characters */
    public static int m3576(Object obj) {
        if (C0051.m1783() < 0) {
            return ((v0) obj).Q;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢۨۦ, reason: not valid java name and contains not printable characters */
    public static void m3577(Object obj, boolean z) {
        if (C0070.m2829() < 0) {
            tk.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((PopupWindow) obj, z);
        }
    }

    /* JADX INFO: renamed from: ۢۥۥ۟, reason: not valid java name and contains not printable characters */
    public static void m3578(Object obj, Object obj2) {
        if (C0188.m7736() < 0) {
            ((Drawable) obj).setBounds((Rect) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۦۣ۟, reason: not valid java name and contains not printable characters */
    public static void m3579(Object obj) {
        if (C0026.m1047() >= 0) {
            C0116.m4290((MainActivity) obj);
        }
    }

    /* JADX INFO: renamed from: ۢۧۡ, reason: not valid java name and contains not printable characters */
    public static float m3580(Object obj) {
        if (C0236.m9615() >= 0) {
            return ((us) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۢۧۥ۟, reason: not valid java name and contains not printable characters */
    public static int m3581(Object obj) {
        if (C0010.m354() < 0) {
            return ((ActivityInfo) obj).getIconResource();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۤ۟, reason: not valid java name and contains not printable characters */
    public static void m3582(Object obj, Object obj2) {
        if (C0002.m72() > 0) {
            ((PrecomputedText) obj).removeSpan(obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۧ۟۠, reason: not valid java name and contains not printable characters */
    public static Object m3583(Object obj) {
        if (C0231.m9265() > 0) {
            return ((x.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۥۢ, reason: not valid java name and contains not printable characters */
    public static Object[] m3584() {
        if (C0204.m8270() < 0) {
            return n5.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۠ۡ, reason: not valid java name and contains not printable characters */
    public static v0 m3585(Object obj) {
        if (C0149.m6476() < 0) {
            return v0.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m3586(Object obj, Object obj2) {
        if (C0218.m8760() >= 0) {
            ((ByteArrayOutputStream) obj).write((byte[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static k8 m3587() {
        if (C0049.m1767() <= 0) {
            return yd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static StackTraceElement[] m3588(Object obj) {
        if (C0164.m6900() < 0) {
            return ((Exception) obj).getStackTrace();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static CharSequence m3589(Object obj) {
        if (C0133.m5208() <= 0) {
            return ((AccessibilityNodeInfo) obj).getClassName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۡۨ, reason: not valid java name and contains not printable characters */
    public static float m3590(Object obj) {
        if (C0214.m8575() < 0) {
            return ((n2) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۤۥۧۦ, reason: not valid java name and contains not printable characters */
    public static AtomicReferenceArray m3591(Object obj) {
        if (C0176.m7290() > 0) {
            return ((vf) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۧ۠, reason: not valid java name and contains not printable characters */
    public static int m3592(Object obj) {
        if (C0204.m8270() <= 0) {
            return ((KeyEvent) obj).getRepeatCount();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۠ۥۥ, reason: contains not printable characters */
    public static TransformationMethod m3593(Object obj) {
        if (C0006.m169() < 0) {
            return ((TextView) obj).getTransformationMethod();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۦۡ, reason: contains not printable characters */
    public static Drawable m3594(Object obj) {
        if (C0259.m10136() >= 0) {
            return ((qo) obj).g();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۢ۟, reason: contains not printable characters */
    public static boolean m3595(Object obj, Object obj2, int i, Object obj3) {
        if (C0069.m2756() < 0) {
            return ((z0.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).e((Context) obj2, i, (Drawable) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣۢۧ, reason: contains not printable characters */
    public static void m3596(Object obj, int i) {
        if (C0117.m4419() <= 0) {
            ((s6) obj).b(i);
        }
    }

    /* JADX INFO: renamed from: ۥۦۣ۠, reason: contains not printable characters */
    public static boolean m3597(Object obj) {
        if (C0211.m8341() > 0) {
            return ((r7) obj).isAutoMirrored();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۧۤۡ, reason: contains not printable characters */
    public static void m3598(Object obj, int i) {
        if (C0079.m3072() < 0) {
            ((n9.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
    }

    /* JADX INFO: renamed from: ۥۧۦ۠, reason: contains not printable characters */
    public static boolean m3599(Object obj) {
        if (C0176.m7290() > 0) {
            return ((v0) obj).C;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۨۦۤ, reason: contains not printable characters */
    public static int m3600(Object obj) {
        if (C0108.m4038() > 0) {
            return ((o9) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۦۥۨ, reason: contains not printable characters */
    public static int m3601() {
        return (-330) ^ C0058.f52;
    }

    /* JADX INFO: renamed from: ۦۨ, reason: contains not printable characters */
    public static long m3602(Object obj) {
        if (C0188.m7736() < 0) {
            return ((t8.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧ۠ۥۤ, reason: not valid java name and contains not printable characters */
    public static void m3603(Object obj, Object obj2, int i, int i2, int i3) {
        if (C0113.m4144() < 0) {
            ((vn.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).onTextChanged((CharSequence) obj2, i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ۧۥ۠ۥ, reason: not valid java name and contains not printable characters */
    public static WindowManager m3604(Object obj) {
        if (C0127.m4950() >= 0) {
            return Menu.m5645((Menu) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static Rect m3605(Object obj) {
        if (C0035.m1268() <= 0) {
            return ((Drawable) obj).getDirtyBounds();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥ۟۠, reason: not valid java name and contains not printable characters */
    public static long m3606(Object obj, long j, int i) {
        if (m3601() < 0) {
            return ((vf.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(j, i);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۧۥ, reason: not valid java name and contains not printable characters */
    public static a m3607(Object obj) {
        if (C0161.m6744() > 0) {
            return ((xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۤ۠, reason: not valid java name and contains not printable characters */
    public static vo m3608(Object obj) {
        if (C0093.m3365() >= 0) {
            return ((p) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m3543(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
