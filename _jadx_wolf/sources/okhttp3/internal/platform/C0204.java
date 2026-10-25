package okhttp3.internal.platform;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.PowerManager;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0010;
import android.support.v4.graphics.drawable.C0011;
import android.system.StructStat;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.activity.C0017;
import androidx.activity.C0021;
import androidx.annotation.C0024;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0035;
import androidx.appcompat.app.C0036;
import androidx.core.app.C0055;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0064;
import androidx.core.graphics.drawable.C0066;
import androidx.drawerlayout.widget.C0072;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0078;
import androidx.fragment.app.C0096;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0118;
import androidx.profileinstaller.C0119;
import androidx.savedstate.C0126;
import androidx.savedstate.C0127;
import androidx.versionedparcelable.C0133;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.MainActivity;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ar;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ba;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bt;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.c3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ce;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.en;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.im;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.nc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ua;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ws;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ym;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zs;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.reflect.Field;
import java.net.Proxy;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.C0238;
import okhttp3.HttpUrl;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.io.C0195;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.internal.ws.C0224;
import okhttp3.logging.C0231;
import okhttp3.logging.C0233;
import okhttp3.logging.C0234;
import org.json.JSONObject;
import retrofit2.C0259;
import retrofit2.converter.scalars.C0243;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: okhttp3.internal.platform.۟ۢۥۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0204 {

    /* JADX INFO: renamed from: ۣۥۡۧ, reason: not valid java name and contains not printable characters */
    public static int f654 = -325;

    /* JADX INFO: renamed from: ۟۟۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static JSONObject m8250(Object obj, Object obj2, Object obj3) {
        if (C0126.m4908() <= 0) {
            return ((JSONObject) obj).put((String) obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m8251(Object obj) {
        if (C0036.m1332() < 0) {
            return ((WindowInsets) obj).getStableInsetTop();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۡۡۢ, reason: not valid java name and contains not printable characters */
    public static s8 m8252(Object obj) {
        if (C0219.m8794() > 0) {
            return ((qp) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۡۢ, reason: not valid java name and contains not printable characters */
    public static void m8253(Object obj, Object obj2, Object obj3) {
        if (C0011.m458() > 0) {
            ((WindowManager) obj).addView((View) obj2, (ViewGroup.LayoutParams) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۢۧ۠, reason: not valid java name and contains not printable characters */
    public static Object[] m8254(Object obj) {
        if (C0024.m896() >= 0) {
            return ((uo) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static mf m8255(Object obj, Object obj2) {
        if (C0031.m1148() < 0) {
            return ((v0) obj).L((Context) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۧۡ, reason: not valid java name and contains not printable characters */
    public static CharSequence m8256(Object obj) {
        if (C0011.m458() >= 0) {
            return ((Activity) obj).getTitle();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۢۦ, reason: not valid java name and contains not printable characters */
    public static void m8257(Object obj) {
        if (C0074.m2951() <= 0) {
            ((uo.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m8258(Object obj) {
        if (C0202.m8245() > 0) {
            return ((mo.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۧۥۧ, reason: not valid java name and contains not printable characters */
    public static boolean m8259(Object obj) {
        if (C0036.m1332() < 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).n;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۨۨۧ, reason: not valid java name and contains not printable characters */
    public static void m8260(Object obj, Object obj2, Object obj3) {
        if (C0238.m9653() >= 0) {
            ((e.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((e.a) obj2, (e.a) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static String m8261(Object obj) {
        if (C0118.m4454() > 0) {
            return ((a9.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۦۣ, reason: not valid java name and contains not printable characters */
    public static int m8262(Object obj) {
        if (C0178.m7344() < 0) {
            return ((k1.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m8263(Object obj, Object obj2, Object obj3) {
        if (C0072.m2856() < 0) {
            ((Bundle) obj).putString((String) obj2, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static Field m8264() {
        if (C0171.m7136() < 0) {
            return xs.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧۥ, reason: not valid java name and contains not printable characters */
    public static boolean m8265(Object obj, boolean z, boolean z2) {
        if (C0006.m169() <= 0) {
            return ((Drawable) obj).setVisible(z, z2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۢۥ, reason: not valid java name and contains not printable characters */
    public static void m8266(Object obj, Object obj2) {
        if (C0011.m458() >= 0) {
            ((r7) obj).a((Resources) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡ۟, reason: not valid java name and contains not printable characters */
    public static void m8267(Object obj, int i) {
        if (C0024.m896() >= 0) {
            ((c3) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨ۟, reason: not valid java name and contains not printable characters */
    public static boolean m8268(Object obj, Object obj2) {
        if (C0035.m1268() < 0) {
            return ((bt) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((int[]) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۦ۠ۤ, reason: not valid java name and contains not printable characters */
    public static ym m8269(Object obj) {
        if (C0199.m7998() < 0) {
            return ((ba) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧ۟, reason: not valid java name and contains not printable characters */
    public static int m8270() {
        return (-850) ^ C0096.f83;
    }

    /* JADX INFO: renamed from: ۟ۥ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static wm m8271(Object obj) {
        if (C0249.m10052() <= 0) {
            return ((vm.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static ConnectionBlocker.ConnectionBlockerCallback m8272(Object obj) {
        if (C0112.m4054() < 0) {
            return ((ConnectionBlocker) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static Typeface m8273(Object obj, int i, Object obj2, int i2, int i3) {
        if (C0201.m8184() < 0) {
            return tq.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Resources) obj, i, (String) obj2, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۥ, reason: not valid java name and contains not printable characters */
    public static void m8274(Object obj, int i) {
        if (C0113.m4144() < 0) {
            ((Drawable) obj).setTint(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۥۣۨ, reason: not valid java name and contains not printable characters */
    public static File m8275(Object obj) {
        if (C0171.m7136() <= 0) {
            return ar.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۧ۟, reason: not valid java name and contains not printable characters */
    public static void m8276(Object obj, Object obj2) {
        if (C0224.m8861() <= 0) {
            ((rr) obj).F((tr) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۟۟۠, reason: not valid java name and contains not printable characters */
    public static int m8277(Object obj) {
        if (C0035.m1268() < 0) {
            return ((u1) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۣۡۦ, reason: not valid java name and contains not printable characters */
    public static int m8278(Object obj) {
        if (C0243.m9964() > 0) {
            return ((StructStat) obj).st_mode;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m8279(Object obj, Object obj2) {
        if (C0259.m10136() >= 0) {
            return ((f6.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).k((f6.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۧ, reason: not valid java name and contains not printable characters */
    public static AtomicReference m8280(Object obj) {
        if (C0231.m9265() > 0) {
            return ((en) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۢۤ, reason: not valid java name and contains not printable characters */
    public static void m8282(Object obj, boolean z) {
        if (C0127.m4950() > 0) {
            ((ws) obj).l(z);
        }
    }

    /* JADX INFO: renamed from: ۠ۦۧۡ, reason: not valid java name and contains not printable characters */
    public static int m8283(Object obj) {
        if (C0234.m9461() < 0) {
            return ((im.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static ua m8284(Object obj) {
        if (C0017.m627() >= 0) {
            return C0215.m8594((d7) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m8285(int i) {
        if (C0062.m2326() >= 0) {
            return y.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m8286(Object obj, boolean z) {
        if (C0066.m2514() > 0) {
            ((xd.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).c(z);
        }
    }

    /* JADX INFO: renamed from: ۣۢۤ۠, reason: not valid java name and contains not printable characters */
    public static int m8287(Object obj) {
        if (C0195.m7914() >= 0) {
            return ((TextView) obj).getTotalPaddingLeft();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۥۢ۠, reason: not valid java name and contains not printable characters */
    public static void m8288(Object obj, Object obj2) {
        if (C0021.m740() <= 0) {
            MainActivity.m5560((MainActivity) obj);
        }
    }

    /* JADX INFO: renamed from: ۢۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m8289(Object obj) {
        if (C0064.m2388() >= 0) {
            return sq.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TypedValue) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static int m8290(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۣۢۥ, reason: not valid java name and contains not printable characters */
    public static Proxy m8291() {
        if (C0021.m740() <= 0) {
            return Proxy.NO_PROXY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۧ۟, reason: not valid java name and contains not printable characters */
    public static Drawable m8292(Object obj, Object obj2) {
        if (C0201.m8184() < 0) {
            return ((f1) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Drawable) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟۠, reason: not valid java name and contains not printable characters */
    public static void m8293(Object obj, Object obj2, Object obj3) {
        if (C0187.m7613() >= 0) {
            ((Bundle) obj).putCharSequenceArray((String) obj2, (CharSequence[]) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m8294(Object obj, Object obj2, Object obj3) {
        if (C0233.m9365() < 0) {
            return dl.b((String) obj, (String) obj2, (byte[]) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۢ۟, reason: contains not printable characters */
    public static String m8295(String str) {
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

    /* JADX INFO: renamed from: ۦ۟۠۟, reason: contains not printable characters */
    public static int m8296(Object obj) {
        if (C0055.m2054() > 0) {
            return ((View) obj).getVisibility();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۢ۠ۦ, reason: contains not printable characters */
    public static int m8297(Object obj) {
        if (C0064.m2388() > 0) {
            return ((gm) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۢۥۥ, reason: contains not printable characters */
    public static xs m8298(Object obj) {
        if (C0213.m8458() > 0) {
            return ((xs) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۤۡ, reason: contains not printable characters */
    public static PowerManager m8299(Object obj) {
        if (C0234.m9461() <= 0) {
            return ((v0.f) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۨۦ, reason: contains not printable characters */
    public static void m8300(Object obj, Object obj2) {
        if (C0017.m627() > 0) {
            ((h3) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Throwable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۧ۠۟, reason: contains not printable characters */
    public static int m8301(Object obj) {
        if (C0078.m3044() <= 0) {
            return ((sm) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۧۧ, reason: contains not printable characters */
    public static PackageManager m8302(Object obj) {
        if (C0064.m2388() > 0) {
            return ((Context) obj).getPackageManager();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۥۧ, reason: not valid java name and contains not printable characters */
    public static Class m8303(Object obj) {
        if (C0119.m4573() >= 0) {
            return zd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ce) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۤۥ, reason: not valid java name and contains not printable characters */
    public static void m8304(Object obj, Object obj2) {
        if (C0055.m2054() > 0) {
            ((u3) obj).j((Throwable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۢۢ۠, reason: not valid java name and contains not printable characters */
    public static Typeface m8305(Object obj) {
        if (C0096.m3601() <= 0) {
            return ((Paint) obj).getTypeface();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۧۥ, reason: not valid java name and contains not printable characters */
    public static long m8306(Object obj, Object obj2) {
        if (C0133.m5208() < 0) {
            return ((zs) obj).d((zs) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۤۢۦ, reason: not valid java name and contains not printable characters */
    public static String m8307(Object obj) {
        if (C0010.m354() <= 0) {
            return nc.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Locale) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static String m8281(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
