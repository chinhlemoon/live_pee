package androidx.emoji2.text;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Insets;
import android.graphics.Matrix;
import android.graphics.Path;
import android.media.MediaPlayer;
import android.os.LocaleList;
import android.os.ParcelFileDescriptor;
import android.support.v4.app.C0002;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0009;
import android.text.SpannableStringBuilder;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.activity.C0014;
import androidx.activity.C0017;
import androidx.activity.C0020;
import androidx.annotation.C0023;
import androidx.annotation.C0024;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0034;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0051;
import androidx.core.app.C0055;
import androidx.core.content.C0057;
import androidx.core.graphics.drawable.C0064;
import androidx.core.graphics.drawable.C0065;
import androidx.drawerlayout.widget.C0070;
import androidx.drawerlayout.widget.C0072;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0095;
import androidx.fragment.app.C0099;
import androidx.lifecycle.C0106;
import androidx.lifecycle.C0108;
import androidx.lifecycle.c;
import androidx.profileinstaller.C0115;
import androidx.savedstate.C0122;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0133;
import androidx.versionedparcelable.C0135;
import com.example.vcam.HookMain;
import com.example.vcam.MainActivity;
import de.robv.android.xposed.XC_MethodHook;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ad;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.im;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pi;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qi;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ws;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xh;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zs;
import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import okhttp3.C0238;
import okhttp3.HttpUrl;
import okhttp3.internal.C0227;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.io.C0195;
import okhttp3.internal.io.C0199;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.ws.C0224;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0231;
import okhttp3.logging.C0235;
import okhttp3.logging.C0236;

/* JADX INFO: renamed from: androidx.emoji2.text.۟۠ۤۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0078 {

    /* JADX INFO: renamed from: ۡ۠ۨ۟, reason: not valid java name and contains not printable characters */
    public static int f69 = 223;

    /* JADX INFO: renamed from: ۟۟ۡۤۡ, reason: not valid java name and contains not printable characters */
    public static String m2992(String str) {
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

    /* JADX INFO: renamed from: ۟۟ۢۢۨ, reason: not valid java name and contains not printable characters */
    public static void m2993(Object obj, Object obj2) {
        if (C0164.m6900() < 0) {
            ((Animator) obj).setTarget(obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static Set m2994(Object obj) {
        if (C0214.m8575() < 0) {
            return ((l2) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m2995(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static boolean m2996(Object obj) {
        if (C0115.m4218() <= 0) {
            return ((WeakHashMap) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static Long m2997(Object obj, long j) {
        if (C0227.m9046() >= 0) {
            return Long.getLong((String) obj, j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static dp m2998(Object obj) {
        if (C0135.m5274() <= 0) {
            return ((zs) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۥ۟, reason: not valid java name and contains not printable characters */
    public static rl m2999(Object obj) {
        if (C0006.m169() < 0) {
            return ((qk) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m3000(Object obj) {
        if (C0169.m7034() <= 0) {
            c.d((c) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۥۡ, reason: not valid java name and contains not printable characters */
    public static void m3001(Object obj, Object obj2) {
        if (m3044() < 0) {
            ((Matrix) obj).set((Matrix) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۡۥۥ, reason: not valid java name and contains not printable characters */
    public static String m3002(Object obj, Object obj2) {
        if (C0235.m9535() < 0) {
            return System.setProperty((String) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢۥ, reason: not valid java name and contains not printable characters */
    public static Class[] m3003() {
        if (C0215.m8604() < 0) {
            return uo.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static ListAdapter m3004(Object obj) {
        if (C0072.m2856() < 0) {
            return ((HeaderViewListAdapter) obj).getWrappedAdapter();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۡ, reason: not valid java name and contains not printable characters */
    public static void m3005(Object obj, Object obj2) {
        if (C0020.m701() > 0) {
            ((v0) obj).I0((mf) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۥۣ۟, reason: not valid java name and contains not printable characters */
    public static Integer m3006(int i) {
        if (C0128.m5064() <= 0) {
            return Integer.valueOf(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۧۡ, reason: not valid java name and contains not printable characters */
    public static void m3007(Object obj) {
        if (C0065.m2448() > 0) {
            ((MainActivity) obj).m0();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦۦ, reason: not valid java name and contains not printable characters */
    public static Set m3008(Object obj) {
        if (C0055.m2054() > 0) {
            return ((r5) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۨ, reason: not valid java name and contains not printable characters */
    public static void m3009(Object obj) {
        if (C0187.m7613() >= 0) {
            im.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Resources.Theme) obj);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۥۡ۠, reason: not valid java name and contains not printable characters */
    public static Resources m3010(Object obj) {
        if (C0095.m3478() < 0) {
            return ((s5) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m3011(Object obj, int i) {
        if (C0031.m1148() < 0) {
            ((AccessibilityEvent) obj).setContentChangeTypes(i);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥۨ, reason: not valid java name and contains not printable characters */
    public static void m3012(Object obj) {
        if (C0057.m2142() >= 0) {
            v.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Activity) obj);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static FileDescriptor m3013(Object obj) {
        if (C0095.m3478() < 0) {
            return ((ParcelFileDescriptor) obj).getFileDescriptor();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۨ۟, reason: not valid java name and contains not printable characters */
    public static void m3014(Object obj) {
        if (C0172.m7180() >= 0) {
            ((ws) obj).j();
        }
    }

    /* JADX INFO: renamed from: ۟ۤۦۥۤ, reason: not valid java name and contains not printable characters */
    public static void m3015(Object obj, Object obj2) {
        if (C0014.m545() >= 0) {
            ((CompoundButton) obj).setButtonTintList((ColorStateList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۥ۠ۥ, reason: not valid java name and contains not printable characters */
    public static SpannableStringBuilder m3016(Object obj, int i, int i2, Object obj2, int i3, int i4) {
        if (C0231.m9265() >= 0) {
            return ((vn) obj).replace(i, i2, (CharSequence) obj2, i3, i4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۢ, reason: not valid java name and contains not printable characters */
    public static qa m3017(Object obj) {
        if (C0115.m4218() <= 0) {
            return ((u4) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static Insets m3018(int i, int i2, int i3, int i4) {
        if (C0020.m701() > 0) {
            return Insets.of(i, i2, i3, i4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۢ۠, reason: not valid java name and contains not printable characters */
    public static int m3019(Object obj) {
        if (C0023.m843() >= 0) {
            return ((sm) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۣۧ۠, reason: not valid java name and contains not printable characters */
    public static pi m3020(Object obj) {
        if (C0195.m7914() > 0) {
            return ((xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۤۧ, reason: not valid java name and contains not printable characters */
    public static long m3021(Object obj) {
        if (C0002.m72() > 0) {
            return ((qi.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۧۡۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3022() {
        if (C0164.m6900() <= 0) {
            return v0.g0;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۤۦۣ, reason: not valid java name and contains not printable characters */
    public static dd m3023(Object obj) {
        if (C0099.m3752() < 0) {
            return ((xs.d) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۣۦ, reason: not valid java name and contains not printable characters */
    public static y4 m3024(Object obj, int i, Object obj2) {
        if (C0225.m9001() >= 0) {
            return y4.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Resources) obj, i, (Resources.Theme) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۥۡ, reason: not valid java name and contains not printable characters */
    public static void m3025(Object obj, Object obj2, float f, float f2) {
        if (C0115.m4218() < 0) {
            ((zr.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).d((View) obj2, f, f2);
        }
    }

    /* JADX INFO: renamed from: ۟ۨۧ۠, reason: not valid java name and contains not printable characters */
    public static Object m3026() {
        if (C0014.m545() > 0) {
            return e.b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static void m3027(Object obj, Object obj2) {
        if (C0049.m1767() < 0) {
            ((s6) obj).setWindowTitle((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static XC_MethodHook.Unhook m3028(Object obj) {
        if (C0236.m9615() >= 0) {
            return ((l2) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۣۤ, reason: not valid java name and contains not printable characters */
    public static int m3029(Object obj, int i) {
        if (C0093.m3365() >= 0) {
            return ((ListAdapter) obj).getItemViewType(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۧۡۡ, reason: not valid java name and contains not printable characters */
    public static vo m3030(Object obj, Object obj2) {
        if (C0224.m8861() < 0) {
            return ((vo) obj).setTooltipText((CharSequence) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static boolean m3031(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0188.m7736() < 0) {
            return ((xd) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj2, (jj) obj3, (wd) obj4);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۥۡۧ, reason: not valid java name and contains not printable characters */
    public static String m3032(Object obj) {
        if (C0122.m4736() <= 0) {
            return ((ActivityInfo) obj).name;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۨۥ, reason: not valid java name and contains not printable characters */
    public static int m3033(Object obj) {
        if (C0024.m896() > 0) {
            return ((HookMain) obj).c2_ori_height;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۡۥ۟, reason: not valid java name and contains not printable characters */
    public static Matrix m3034(Object obj) {
        if (C0070.m2829() <= 0) {
            return ((pr.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۢۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3035(Object obj) {
        if (C0191.m7812() >= 0) {
            return ((v0) obj).U;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۤۧ, reason: not valid java name and contains not printable characters */
    public static LocaleList m3036(Object obj) {
        if (C0095.m3478() <= 0) {
            return LocaleList.forLanguageTags((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦ۠, reason: not valid java name and contains not printable characters */
    public static void m3037(Object obj, Object obj2, Object obj3, int i) {
        if (C0065.m2448() > 0) {
            hs.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ViewParent) obj, (View) obj2, (View) obj3, i);
        }
    }

    /* JADX INFO: renamed from: ۣۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static ad.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m3038(Object obj) {
        if (C0034.m1206() <= 0) {
            return ((ad.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static CharSequence m3040(Object obj) {
        if (C0051.m1783() <= 0) {
            return ((MenuItem) obj).getTitle();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۦۦ, reason: contains not printable characters */
    public static void m3041(Object obj, Object obj2) {
        if (C0149.m6476() < 0) {
            ((ViewTreeObserver) obj).addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۡۡۥ, reason: contains not printable characters */
    public static long[] m3042() {
        if (C0084.m3253() <= 0) {
            return n5.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۡۧ, reason: contains not printable characters */
    public static int m3043(Object obj) {
        if (C0002.m72() >= 0) {
            return ((gd) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۨۥۣ, reason: contains not printable characters */
    public static int m3044() {
        return (-461) ^ C0217.f667;
    }

    /* JADX INFO: renamed from: ۦ۟ۧ۟, reason: contains not printable characters */
    public static short m3045(Object obj) {
        if (C0072.m2856() <= 0) {
            return ((vl) obj).l();
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: ۦۢۢۤ, reason: contains not printable characters */
    public static int m3046(Object obj) {
        if (C0106.m3835() > 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۥۢ۟, reason: contains not printable characters */
    public static short m3047(Object obj) {
        if (C0099.m3752() <= 0) {
            return ((s2) obj).V();
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: ۦۥۨۦ, reason: contains not printable characters */
    public static boolean m3048(Object obj, Object obj2, int i, boolean z) {
        if (C0017.m627() > 0) {
            return uq.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj, (String) obj2, i, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۧۦۣ, reason: contains not printable characters */
    public static void m3049() {
        if (C0133.m5208() < 0) {
            jd.f();
        }
    }

    /* JADX INFO: renamed from: ۧ۠ۥۥ, reason: not valid java name and contains not printable characters */
    public static v0.k m3050(Object obj, Object obj2) {
        if (C0238.m9653() >= 0) {
            return ((v0) obj).b0((Menu) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۢۦ, reason: not valid java name and contains not printable characters */
    public static void m3051(Object obj, Object obj2, float f, Object obj3, Object obj4) {
        if (C0070.m2829() <= 0) {
            m0.k((Path) obj, (ObjectAnimator) obj2, f, (String) obj3, (String) obj4);
        }
    }

    /* JADX INFO: renamed from: ۨ۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static InputConnection m3052(Object obj, Object obj2, Object obj3) {
        if (C0064.m2388() > 0) {
            return ((a8) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((InputConnection) obj2, (EditorInfo) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۢ۠, reason: not valid java name and contains not printable characters */
    public static ColorStateList m3053(Object obj, int i) {
        if (C0231.m9265() >= 0) {
            return ((zp) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۦۦ, reason: not valid java name and contains not printable characters */
    public static xh m3054() {
        if (C0009.m276() <= 0) {
            return xh.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۤۦ, reason: not valid java name and contains not printable characters */
    public static AtomicReferenceFieldUpdater m3055() {
        if (C0108.m4038() > 0) {
            return vf.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۨ۠, reason: not valid java name and contains not printable characters */
    public static Iterator m3056(Object obj) {
        if (C0188.m7736() < 0) {
            return ((lg.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۣۣ, reason: not valid java name and contains not printable characters */
    public static void m3057(Object obj) {
        if (m3044() < 0) {
            ((MediaPlayer) obj).reset();
        }
    }

    /* JADX INFO: renamed from: ۨۧۦۦ, reason: not valid java name and contains not printable characters */
    public static Button m3058(Object obj) {
        if (C0199.m7998() < 0) {
            return com.example.vcam.Menu.m5593((com.example.vcam.Menu) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۡۦ, reason: not valid java name and contains not printable characters */
    public static String m3059(Object obj, Object obj2) {
        if (C0049.m1767() <= 0) {
            return ((String) obj).toUpperCase((Locale) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۤ, reason: not valid java name and contains not printable characters */
    public static String m3039(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
