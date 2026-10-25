package androidx.core.graphics.drawable;

import android.app.Dialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraCaptureSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Trace;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0009;
import android.text.Spanned;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.C0014;
import androidx.activity.C0017;
import androidx.annotation.C0024;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0037;
import androidx.appcompat.view.menu.C0039;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.widget.C0047;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0052;
import androidx.core.app.C0055;
import androidx.core.content.C0057;
import androidx.drawerlayout.widget.C0072;
import androidx.emoji2.text.C0079;
import androidx.emoji2.text.C0083;
import androidx.emoji2.text.C0084;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0095;
import androidx.fragment.app.C0099;
import androidx.fragment.app.c;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0118;
import androidx.profileinstaller.C0119;
import androidx.profileinstaller.ProfileInstallerInitializer;
import androidx.savedstate.C0122;
import androidx.savedstate.C0123;
import androidx.savedstate.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.startup.C0128;
import com.example.vcam.HookMain;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.al;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.b;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bt;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.db;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.g7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.g8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gb;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.nm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pi;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ql;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ul;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zp;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import okhttp3.C0238;
import okhttp3.C0239;
import okhttp3.HttpUrl;
import okhttp3.internal.C0227;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0195;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.ws.C0224;
import okhttp3.logging.C0231;
import okhttp3.logging.C0232;
import okhttp3.logging.C0233;
import okhttp3.logging.C0234;
import okhttp3.logging.C0235;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: androidx.core.graphics.drawable.ۢ۟ۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0065 {

    /* JADX INFO: renamed from: ۟ۡۡۡۥ, reason: not valid java name and contains not printable characters */
    public static int f59 = 700;

    /* JADX INFO: renamed from: ۟۟۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static String m2413(Object obj) {
        if (C0123.m4841() <= 0) {
            return ((m9.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static Animatable m2414(Object obj) {
        if (C0181.m7445() > 0) {
            return ((j0.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۡۦ۟, reason: not valid java name and contains not printable characters */
    public static CharSequence m2415(Object obj) {
        if (C0049.m1767() <= 0) {
            return ((TypedValue) obj).string;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟۟۟, reason: not valid java name and contains not printable characters */
    public static void m2416(Object obj) {
        if (C0169.m7034() <= 0) {
            ((j0) obj).jumpToCurrentState();
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static Map m2417(Object obj) {
        if (C0182.m7528() < 0) {
            return ((bs) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤۡۦ, reason: not valid java name and contains not printable characters */
    public static float m2418(Object obj) {
        if (C0093.m3365() >= 0) {
            return ((pr.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟۟ۦۣ, reason: not valid java name and contains not printable characters */
    public static xs.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m2419(Object obj, Object obj2) {
        if (C0037.m1437() < 0) {
            return ((xs.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((dd) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧۤۥ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m2420(Object obj, int i, int i2) {
        if (C0204.m8270() <= 0) {
            return ((StringBuilder) obj).delete(i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static Drawable m2421(Object obj, Object obj2) {
        if (C0119.m4573() >= 0) {
            return ((Drawable.ConstantState) obj).newDrawable((Resources) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۢۨ, reason: not valid java name and contains not printable characters */
    public static void m2422(Object obj) {
        if (C0119.m4573() > 0) {
            ((f2) obj).timedOut();
        }
    }

    /* JADX INFO: renamed from: ۟۠ۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static Field m2423() {
        if (C0238.m9653() > 0) {
            return u7.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static int m2424(Object obj, Object obj2) {
        if (C0093.m3365() >= 0) {
            return Collections.binarySearch((List) obj, obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static Object[] m2425() {
        if (C0083.m3188() < 0) {
            return u1.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static XC_LoadPackage.LoadPackageParam m2426(Object obj) {
        if (C0169.m7034() < 0) {
            return ((HookMain.e) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧۢ۟, reason: not valid java name and contains not printable characters */
    public static Typeface m2427() {
        if (C0195.m7914() >= 0) {
            return Typeface.SANS_SERIF;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧۦۧ, reason: not valid java name and contains not printable characters */
    public static int m2428(Object obj, Object obj2) {
        if (C0079.m3072() <= 0) {
            return ((Spanned) obj).getSpanStart(obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static CopyOnWriteArrayList m2429(Object obj) {
        if (m2448() > 0) {
            return ((vj) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۧۨ, reason: not valid java name and contains not printable characters */
    public static CharSequence m2430(Object obj) {
        if (C0215.m8604() <= 0) {
            return ((View) obj).getContentDescription();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۡۤ, reason: not valid java name and contains not printable characters */
    public static Thread m2431(Object obj) {
        if (C0191.m7812() >= 0) {
            return ((Looper) obj).getThread();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۥ۟, reason: not valid java name and contains not printable characters */
    public static String m2432(Object obj) {
        if (C0199.m7998() < 0) {
            return ((g7) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۨۥ, reason: not valid java name and contains not printable characters */
    public static int[] m2433() {
        if (C0052.m1890() >= 0) {
            return ql.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۦۧ, reason: not valid java name and contains not printable characters */
    public static boolean m2434(Object obj) {
        if (C0182.m7528() <= 0) {
            return ((ul) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۧۤۢ, reason: not valid java name and contains not printable characters */
    public static boolean m2435() {
        if (C0057.m2142() >= 0) {
            return Trace.isEnabled();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static int m2436(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۦۥ۠, reason: not valid java name and contains not printable characters */
    public static ParcelFileDescriptor m2437(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0187.m7613() > 0) {
            return ((ContentResolver) obj).openFileDescriptor((Uri) obj2, (String) obj3, (CancellationSignal) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۢۦ, reason: not valid java name and contains not printable characters */
    public static void m2438(Object obj, Object obj2) {
        if (C0227.m9046() >= 0) {
            ((HookMain) obj).a0((CameraCaptureSession.StateCallback) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۡۢۢ, reason: not valid java name and contains not printable characters */
    public static qq m2439(Object obj) {
        if (C0095.m3478() < 0) {
            return qq.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static long m2440(Object obj, Object obj2, long j) {
        if (C0055.m2054() >= 0) {
            return ((s2) obj).read((s2) obj2, j);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۥۨۢ, reason: not valid java name and contains not printable characters */
    public static long m2441(Object obj) {
        if (C0235.m9535() <= 0) {
            return r8.a((InputStream) obj);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۥۣۨ, reason: not valid java name and contains not printable characters */
    public static int[] m2442() {
        if (C0182.m7528() <= 0) {
            return ql.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨۧ, reason: not valid java name and contains not printable characters */
    public static int m2443(Object obj) {
        if (C0072.m2856() <= 0) {
            return ((b.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۢۡۢ, reason: not valid java name and contains not printable characters */
    public static void m2444(Object obj) {
        if (C0040.m1622() < 0) {
            ((ViewPropertyAnimator) obj).cancel();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۤۥ۠, reason: not valid java name and contains not printable characters */
    public static boolean m2445(Object obj) {
        if (C0224.m8861() <= 0) {
            return kp.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TextView) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۨۥۦ, reason: not valid java name and contains not printable characters */
    public static int m2446(Object obj) {
        if (C0194.m7889() >= 0) {
            return ((db) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۡ۟۟, reason: not valid java name and contains not printable characters */
    public static boolean m2447(Object obj) {
        if (C0039.m1515() <= 0) {
            return ((View) obj).isLongClickable();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۧۢ۟, reason: not valid java name and contains not printable characters */
    public static int m2448() {
        return 69 ^ C0232.f682;
    }

    /* JADX INFO: renamed from: ۟ۧۧۦۣ, reason: not valid java name and contains not printable characters */
    public static int m2449(Object obj) {
        if (C0118.m4454() > 0) {
            return ((View) obj).getMeasuredHeight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static OnBackInvokedDispatcher m2450(Object obj) {
        if (C0116.m4340() >= 0) {
            return ((v0) obj).b0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۥۤ, reason: not valid java name and contains not printable characters */
    public static Pattern m2451(Object obj) {
        if (C0031.m1148() < 0) {
            return Pattern.compile((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۧۡ, reason: not valid java name and contains not printable characters */
    public static float m2452(Object obj, float f) {
        if (C0006.m169() < 0) {
            return ((Interpolator) obj).getInterpolation(f);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m2453(Object obj) {
        if (C0187.m7613() >= 0) {
            ((vn.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۠ۧۢۡ, reason: not valid java name and contains not printable characters */
    public static void m2454(Object obj, Object obj2) {
        if (C0164.m6900() < 0) {
            ((Dialog) obj).setContentView((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۧۤۤ, reason: not valid java name and contains not printable characters */
    public static boolean m2455(Object obj) {
        if (C0227.m9046() > 0) {
            return a9.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static WindowInsets m2456(Object obj) {
        if (C0079.m3072() < 0) {
            return ((xs.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static tm.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m2457(Object obj, Object obj2) {
        if (C0112.m4054() < 0) {
            return ((tm.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((tm.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢ۠, reason: not valid java name and contains not printable characters */
    public static x9 m2458(Object obj) {
        if (C0233.m9365() < 0) {
            return ((c) obj).j();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦ۠۠, reason: not valid java name and contains not printable characters */
    public static float m2459(Object obj) {
        if (C0233.m9365() < 0) {
            return ((View) obj).getTranslationY();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۡۧۧۧ, reason: not valid java name and contains not printable characters */
    public static s2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m2460(Object obj, Object obj2) {
        if (C0009.m276() < 0) {
            return ((s2) obj).S((s2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡ۟۟, reason: not valid java name and contains not printable characters */
    public static int m2461(Object obj) {
        if (C0122.m4736() <= 0) {
            return ((f6) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۢۡ, reason: not valid java name and contains not printable characters */
    public static pi m2462(Object obj, Object obj2) {
        if (C0232.m9299() >= 0) {
            return pi.a((ByteBuffer) obj, (pi) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۢۧ, reason: not valid java name and contains not printable characters */
    public static Object m2463(Object obj) {
        if (C0099.m3752() < 0) {
            return ((l7) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۨۧ, reason: not valid java name and contains not printable characters */
    public static Throwable m2464(Object obj) {
        if (C0017.m627() > 0) {
            return nm.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۧۧ, reason: not valid java name and contains not printable characters */
    public static int[] m2465(Object obj) {
        if (C0178.m7344() <= 0) {
            return ((m6) obj).l();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۧ, reason: not valid java name and contains not printable characters */
    public static void m2466(Object obj, Object obj2) {
        if (C0214.m8575() <= 0) {
            ((xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Bundle) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m2467(Object obj, Object obj2) {
        if (C0084.m3253() <= 0) {
            return ((Handler) obj).post((Runnable) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۠ۥ, reason: not valid java name and contains not printable characters */
    public static m2 m2468(Object obj, float f, float f2) {
        if (C0239.m9805() < 0) {
            return ((m2) obj).k(f, f2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m2469(Object obj) {
        if (C0218.m8760() >= 0) {
            ((u7) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۣۧۨۦ, reason: not valid java name and contains not printable characters */
    public static void m2470(Object obj) {
        if (C0232.m9299() >= 0) {
            ((a9) obj).h();
        }
    }

    /* JADX INFO: renamed from: ۤ۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static x1 m2471(Object obj) {
        if (C0234.m9461() <= 0) {
            return ((rr) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۧۡ, reason: not valid java name and contains not printable characters */
    public static Object m2472() {
        if (C0094.m3450() > 0) {
            return n1.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۡۦ, reason: not valid java name and contains not printable characters */
    public static Object m2473(Object obj) {
        if (C0052.m1890() >= 0) {
            return vk.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۦۣ, reason: not valid java name and contains not printable characters */
    public static Looper m2474(Object obj) {
        if (C0014.m545() > 0) {
            return ((Handler) obj).getLooper();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۨۥ, reason: not valid java name and contains not printable characters */
    public static boolean m2475(Object obj, boolean z, boolean z2) {
        if (C0149.m6476() < 0) {
            return ((bt) obj).setVisible(z, z2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟ۤۥ, reason: contains not printable characters */
    public static f8 m2476(Object obj) {
        if (C0009.m276() <= 0) {
            return ((g8) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۢ۠, reason: contains not printable characters */
    public static Object m2477(Object obj) {
        if (C0169.m7034() < 0) {
            return ((xd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۥۢ, reason: contains not printable characters */
    public static int[] m2478(Object obj) {
        if (C0047.m1663() <= 0) {
            return ((o9) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۤۡ, reason: contains not printable characters */
    public static h8.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m2479(Object obj) {
        if (C0201.m8184() <= 0) {
            return ((h8) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۥۡ, reason: contains not printable characters */
    public static int m2480(Object obj) {
        if (C0099.m3752() <= 0) {
            return ((k1.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۡۥۧ, reason: contains not printable characters */
    public static SparseIntArray m2481(Object obj) {
        if (C0231.m9265() > 0) {
            return ((sr) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۦۧ, reason: contains not printable characters */
    public static String[] m2482(Object obj) {
        if (C0014.m545() >= 0) {
            return ((v.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۢۡ, reason: contains not printable characters */
    public static int m2483(Object obj) {
        if (C0161.m6744() > 0) {
            return ((d7.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۣۧۧ, reason: contains not printable characters */
    public static Map.Entry m2485(Object obj) {
        if (C0178.m7344() < 0) {
            return ((lg.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static String m2486(String str) {
        String string = HttpUrl.FRAGMENT_ENCODE_SET;
        int i = 0;
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        while (i < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i).toString();
            i++;
            str2 = string2;
        }
        while (string.length() > 0) {
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
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۧۡۥۤ, reason: not valid java name and contains not printable characters */
    public static Context m2487(Object obj) {
        if (C0178.m7344() <= 0) {
            return ((al) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۦ۟, reason: not valid java name and contains not printable characters */
    public static int m2488(Object obj, int i, int i2) {
        if (C0024.m896() >= 0) {
            return ((zp) obj).b(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۧۧۡ, reason: not valid java name and contains not printable characters */
    public static void m2489(Object obj) {
        if (C0052.m1890() >= 0) {
            lm.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj);
        }
    }

    /* JADX INFO: renamed from: ۨ۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static void m2490(Object obj) {
        if (C0009.m276() < 0) {
            ProfileInstallerInitializer.d((Context) obj);
        }
    }

    /* JADX INFO: renamed from: ۣۨۡۤ, reason: not valid java name and contains not printable characters */
    public static void m2491(Object obj, Object obj2) {
        if (C0037.m1437() < 0) {
            ((Button) obj).setOnClickListener((View.OnClickListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۤۦ, reason: not valid java name and contains not printable characters */
    public static Shader m2492(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0009.m276() < 0) {
            return gb.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Resources) obj, (XmlPullParser) obj2, (AttributeSet) obj3, (Resources.Theme) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m2493(Object obj, boolean z) {
        if (C0128.m5064() < 0) {
            ((Drawable) obj).setDither(z);
        }
    }

    /* JADX INFO: renamed from: ۦۣۤۤ, reason: contains not printable characters */
    public static String m2484(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
