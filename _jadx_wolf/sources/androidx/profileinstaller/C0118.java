package androidx.profileinstaller;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.MediaExtractor;
import android.os.Bundle;
import android.os.LocaleList;
import android.support.v4.app.C0002;
import android.support.v4.graphics.drawable.C0009;
import android.support.v4.graphics.drawable.C0011;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.Display;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.ListView;
import androidx.activity.C0014;
import androidx.activity.C0017;
import androidx.activity.C0020;
import androidx.annotation.C0026;
import androidx.annotation.C0031;
import androidx.appcompat.app.AppLocalesMetadataHolderService;
import androidx.appcompat.app.C0034;
import androidx.appcompat.app.C0035;
import androidx.appcompat.view.menu.C0039;
import androidx.appcompat.view.menu.C0040;
import androidx.cardview.widget.CardView;
import androidx.core.app.C0051;
import androidx.core.app.C0052;
import androidx.core.app.C0055;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0064;
import androidx.core.graphics.drawable.C0065;
import androidx.core.widget.C0068;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0070;
import androidx.drawerlayout.widget.C0072;
import androidx.emoji2.text.C0083;
import androidx.emoji2.text.C0084;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0095;
import androidx.fragment.app.C0096;
import androidx.fragment.app.C0097;
import androidx.fragment.app.C0099;
import androidx.lifecycle.C0106;
import androidx.lifecycle.C0107;
import androidx.savedstate.C0123;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0133;
import com.example.vcam.HookMain;
import com.example.vcam.MainActivity;
import com.example.vcam.Menu;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.b;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ce;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ct;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.da;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.eo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ep;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.iq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ki;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.oi;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ti;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ua;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.us;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.w3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.zip.Inflater;
import okhttp3.C0239;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0195;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.ws.C0224;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0231;
import okhttp3.logging.C0232;
import okhttp3.logging.C0234;
import okhttp3.logging.C0235;
import retrofit2.C0259;
import retrofit2.converter.scalars.C0243;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: androidx.profileinstaller.ۣۧ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0118 {

    /* JADX INFO: renamed from: ۣۦۧۢ, reason: not valid java name and contains not printable characters */
    public static int f98 = 49;

    /* JADX INFO: renamed from: ۟۟۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static b m4442(Object obj) {
        if (C0062.m2326() > 0) {
            return b.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۥۡ, reason: not valid java name and contains not printable characters */
    public static Display m4443(Object obj) {
        if (C0017.m627() >= 0) {
            return ((View) obj).getDisplay();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧۨۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4444(Object obj) {
        if (C0117.m4419() <= 0) {
            return ((CardView.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۨۨۥ, reason: not valid java name and contains not printable characters */
    public static void m4445(Object obj, boolean z) {
        if (C0107.m3883() >= 0) {
            q7.a((Drawable) obj, z);
        }
    }

    /* JADX INFO: renamed from: ۟۠۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m4446(Object obj) {
        if (C0096.m3601() <= 0) {
            return ((LocaleList) obj).toLanguageTags();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static hn m4447(Object obj, Object obj2, boolean z, int i, int i2) {
        if (C0084.m3253() < 0) {
            return mo.d0((CharSequence) obj, (String[]) obj2, z, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۢۧ, reason: not valid java name and contains not printable characters */
    public static void m4448(Object obj) {
        if (C0064.m2388() > 0) {
            Menu.m5615((Menu) obj);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static MenuItem.OnMenuItemClickListener m4449(Object obj) {
        if (C0218.m8760() > 0) {
            return ((ki.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa[] m4450(Object obj, int i) {
        if (C0039.m1515() < 0) {
            return ((xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۨۨ, reason: not valid java name and contains not printable characters */
    public static boolean m4451(Object obj) {
        if (C0149.m6476() < 0) {
            return ((uc) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡ۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m4452(Object obj) {
        if (C0215.m8604() <= 0) {
            ((ObjectInputStream) obj).defaultReadObject();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static int m4453(Object obj) {
        if (C0026.m1047() > 0) {
            return ((ApplicationInfo) obj).uid;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۡۢ, reason: not valid java name and contains not printable characters */
    public static int m4454() {
        return 150 ^ C0231.f681;
    }

    /* JADX INFO: renamed from: ۟ۡۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static float m4455(float f, float f2, boolean z) {
        if (C0040.m1622() < 0) {
            return rm.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(f, f2, z);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۡۦۣۤ, reason: not valid java name and contains not printable characters */
    public static int m4456(Object obj) {
        if (C0231.m9265() >= 0) {
            return ((AccessibilityNodeInfo) obj).hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۡۢۤ, reason: not valid java name and contains not printable characters */
    public static Class m4457(Object obj) {
        if (C0128.m5064() < 0) {
            return zd.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ce) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m4458(Object obj) {
        if (C0201.m8184() < 0) {
            return fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۣ, reason: not valid java name and contains not printable characters */
    public static InputFilter[] m4459(Object obj, Object obj2) {
        if (C0234.m9461() < 0) {
            return ((h8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((InputFilter[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m4460(Object obj) {
        if (C0051.m1783() < 0) {
            return ((AssertionError) obj).getMessage();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۢ, reason: not valid java name and contains not printable characters */
    public static float m4461(Object obj, int i) {
        if (C0133.m5208() < 0) {
            return ((MotionEvent) obj).getY(i);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦۡ, reason: not valid java name and contains not printable characters */
    public static int m4462(Object obj, int i, int i2, int i3, int i4) {
        if (C0199.m7998() <= 0) {
            return bp.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj, i, i2, i3, i4);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۧ, reason: not valid java name and contains not printable characters */
    public static MenuItem m4463(Object obj, Object obj2) {
        if (C0095.m3478() < 0) {
            return ((android.view.Menu) obj).add((CharSequence) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static hn m4464(Object obj) {
        if (C0249.m10052() <= 0) {
            return ((v7) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4465(Object obj) {
        if (C0020.m701() >= 0) {
            return ((Drawable) obj).isVisible();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۢۥۤ, reason: not valid java name and contains not printable characters */
    public static vr m4466() {
        if (C0213.m8458() >= 0) {
            return vr.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۦۦ, reason: not valid java name and contains not printable characters */
    public static String m4467() {
        if (C0181.m7445() >= 0) {
            return "ۥۤۡ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4468(char c) {
        if (C0097.m3659() >= 0) {
            return Character.isWhitespace(c);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۥۨۡ, reason: not valid java name and contains not printable characters */
    public static AtomicIntegerFieldUpdater m4469() {
        if (C0072.m2856() <= 0) {
            return f6.e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۨۨ, reason: not valid java name and contains not printable characters */
    public static View m4470(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0133.m5208() < 0) {
            return ((m1) obj).l((Context) obj2, (String) obj3, (AttributeSet) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۢ۟, reason: not valid java name and contains not printable characters */
    public static qa m4471(Object obj) {
        if (C0169.m7034() <= 0) {
            return eo.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨ۟ۡ, reason: not valid java name and contains not printable characters */
    public static Class m4472() {
        if (C0009.m276() < 0) {
            return x.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۢ, reason: not valid java name and contains not printable characters */
    public static float m4473(Object obj) {
        if (C0062.m2326() >= 0) {
            return ((us) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۤۨۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4474(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0243.m9964() > 0) {
            return ((xd) obj).a0((xd.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2, (w3) obj3, obj4);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m4475(Object obj, int i, Object obj2) {
        if (C0164.m6900() <= 0) {
            ((u1) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, (Collection) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4476(Object obj) {
        if (C0094.m3450() > 0) {
            return ((AccessibilityNodeInfo) obj).isEnabled();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۦۡۥ, reason: not valid java name and contains not printable characters */
    public static TransformationMethod m4477(Object obj) {
        if (C0232.m9299() >= 0) {
            return ((j8) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۧ, reason: not valid java name and contains not printable characters */
    public static void m4478(Object obj) {
        if (C0194.m7889() >= 0) {
            C0011.m435((MainActivity) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۢۢۦ, reason: not valid java name and contains not printable characters */
    public static View m4480(Object obj) {
        if (C0099.m3752() <= 0) {
            return ((Window) obj).getDecorView();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۤ۠, reason: not valid java name and contains not printable characters */
    public static void m4481(Object obj) {
        if (C0039.m1515() < 0) {
            obj.wait();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۤۦ, reason: not valid java name and contains not printable characters */
    public static Object m4482(Object obj) {
        if (C0031.m1148() < 0) {
            return ((z9.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4483(Object obj, Object obj2, boolean z) {
        if (C0224.m8861() < 0) {
            return lo.o((String) obj, (String) obj2, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4484(Object obj) {
        if (C0234.m9461() <= 0) {
            return ((t4) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۧۢ۟, reason: not valid java name and contains not printable characters */
    public static void m4485(Object obj, Object obj2) {
        if (C0148.m6464() < 0) {
            ((HookMain) obj).b0((Class) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۤۨ, reason: not valid java name and contains not printable characters */
    public static Method m4486() {
        if (C0020.m701() >= 0) {
            return ct.c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m4487(Object obj, Object obj2, Object obj3, int i) {
        if (C0055.m2054() > 0) {
            ((qo) obj).q((ImageView) obj2, (Drawable) obj3, i);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۧۢۤ, reason: not valid java name and contains not printable characters */
    public static int m4488(Object obj) {
        if (C0213.m8458() > 0) {
            return ((o5) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۡ, reason: not valid java name and contains not printable characters */
    public static int m4489(Object obj) {
        if (m4454() >= 0) {
            return ((ep) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static boolean m4490(Object obj) {
        if (C0035.m1268() <= 0) {
            return ((View) obj).isInEditMode();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۣ۠, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.AccessibilityAction m4491() {
        if (C0215.m8604() <= 0) {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4492(Object obj, Object obj2) {
        if (C0065.m2448() >= 0) {
            return ((Bundle) obj).getBoolean((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static long m4493(Object obj) {
        if (C0195.m7914() > 0) {
            return ((MediaExtractor) obj).getSampleTime();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠ۦ۠ۧ, reason: not valid java name and contains not printable characters */
    public static Level m4494() {
        if (C0178.m7344() < 0) {
            return Level.SEVERE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۨۥ, reason: not valid java name and contains not printable characters */
    public static int m4495(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۠ۨۢۨ, reason: not valid java name and contains not printable characters */
    public static Cursor m4496(Object obj, Object obj2) {
        if (C0164.m6900() < 0) {
            return ((k6) obj).a((Cursor) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static Object m4497() {
        if (C0106.m3835() > 0) {
            return u0.c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m4498(Object obj, Object obj2) {
        if (C0014.m545() >= 0) {
            ((ImageView) obj).setImageDrawable((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡ۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static String m4499(Object obj) {
        if (C0128.m5064() < 0) {
            return ((gc) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4500(Object obj) {
        if (C0035.m1268() < 0) {
            return ((HookMain) obj).need_recreate;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۡۢۤ, reason: not valid java name and contains not printable characters */
    public static boolean m4501(Object obj) {
        if (C0070.m2829() <= 0) {
            return ((vf) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۤۦۦ, reason: not valid java name and contains not printable characters */
    public static int m4502(Object obj, Object obj2, Object obj3) {
        if (C0169.m7034() <= 0) {
            return q1.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((AppOpsManager) obj, (String) obj2, (String) obj3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۤۧ, reason: not valid java name and contains not printable characters */
    public static void m4503(Object obj) {
        if (C0169.m7034() <= 0) {
            ((ListView) obj).refreshDrawableState();
        }
    }

    /* JADX INFO: renamed from: ۢ۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static dd m4504(int i, int i2, int i3, int i4) {
        if (C0011.m458() >= 0) {
            return dd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, i2, i3, i4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m4505(Object obj) {
        if (C0239.m9805() <= 0) {
            ((HookMain) obj).startVideoSwitchTimer();
        }
    }

    /* JADX INFO: renamed from: ۣۣۡ, reason: not valid java name and contains not printable characters */
    public static s2 m4506(Object obj, int i) {
        if (C0069.m2756() < 0) {
            return ((s2) obj).m0(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۢۤ, reason: not valid java name and contains not printable characters */
    public static void m4507(Object obj, int i, boolean z) {
        if (C0065.m2448() > 0) {
            ((android.view.Menu) obj).setGroupEnabled(i, z);
        }
    }

    /* JADX INFO: renamed from: ۣۤۦ, reason: not valid java name and contains not printable characters */
    public static int m4508(Object obj) {
        if (C0034.m1206() < 0) {
            return ((mj) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m4509(Object obj) {
        if (C0199.m7998() <= 0) {
            C0164.m6929((da) obj);
        }
    }

    /* JADX INFO: renamed from: ۣۨۨ۠, reason: not valid java name and contains not printable characters */
    public static String m4510(Object obj) {
        if (C0178.m7344() <= 0) {
            return ((a9.e) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static int m4511(Object obj) {
        if (C0068.m2650() > 0) {
            return ((AttributeSet) obj).getAttributeCount();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Method m4512(Object obj) {
        if (C0031.m1148() <= 0) {
            return ((ti.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۡۡ, reason: not valid java name and contains not printable characters */
    public static int[] m4513(Object obj) {
        if (C0035.m1268() <= 0) {
            return ((j0.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۢۨ, reason: not valid java name and contains not printable characters */
    public static int m4514(Object obj, Object obj2) {
        if (C0215.m8604() <= 0) {
            return ((s2) obj).write((ByteBuffer) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۤ۟, reason: not valid java name and contains not printable characters */
    public static boolean m4515() {
        if (C0051.m1783() <= 0) {
            return lm.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۤۥ, reason: not valid java name and contains not printable characters */
    public static CharSequence m4516(Object obj) {
        if (C0231.m9265() >= 0) {
            return ((d7) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧ۟, reason: not valid java name and contains not printable characters */
    public static int m4517(Object obj) {
        if (C0062.m2326() > 0) {
            return ((vf) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۨۥۣ, reason: not valid java name and contains not printable characters */
    public static int m4518(Object obj, int i) {
        if (C0234.m9461() <= 0) {
            return ((oi) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۣ۠ۥ, reason: contains not printable characters */
    public static void m4519(Object obj) {
        if (C0259.m10136() >= 0) {
            ((InputStream) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۥۡۥ, reason: contains not printable characters */
    public static boolean m4520(Object obj, int i, int i2, int i3, int i4, Object obj2, int i5, Object obj3) {
        if (C0112.m4054() <= 0) {
            return ((fj) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, i2, i3, i4, (int[]) obj2, i5, (int[]) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣۡۨ, reason: contains not printable characters */
    public static void m4521(Object obj, boolean z) {
        if (C0002.m72() > 0) {
            ((m) obj).e(z);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۠, reason: contains not printable characters */
    public static void m4522(Object obj, Object obj2) {
        if (C0065.m2448() >= 0) {
            e.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Runnable) obj, (Executor) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۠۠, reason: contains not printable characters */
    public static ua m4523() {
        if (C0225.m9001() > 0) {
            return pp.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤ۠ۡ, reason: contains not printable characters */
    public static Object m4524(Object obj, Object obj2) {
        if (C0083.m3188() < 0) {
            return ((xd) obj).D(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۧۥ, reason: contains not printable characters */
    public static Object m4525(Object obj, Object obj2) {
        if (C0214.m8575() <= 0) {
            return vk.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj, obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۧ۠, reason: contains not printable characters */
    public static void m4526(Object obj, int i) {
        if (C0068.m2650() > 0) {
            ((Bitmap) obj).eraseColor(i);
        }
    }

    /* JADX INFO: renamed from: ۦۡۨۥ, reason: contains not printable characters */
    public static boolean m4527(Object obj, Object obj2, int i) {
        if (C0123.m4841() < 0) {
            return ((zr) obj).H((View) obj2, i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۢۧۢ, reason: contains not printable characters */
    public static List m4528(Object obj) {
        if (C0195.m7914() >= 0) {
            return rq.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۨ۠, reason: contains not printable characters */
    public static ServiceInfo m4529(Object obj) {
        if (C0097.m3659() > 0) {
            return AppLocalesMetadataHolderService.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۢۧ, reason: not valid java name and contains not printable characters */
    public static int m4530(Object obj, Object obj2, int i, int i2, int i3, int i4) {
        if (C0243.m9964() >= 0) {
            return ((zr) obj).d((View) obj2, i, i2, i3, i4);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧۤۦ, reason: not valid java name and contains not printable characters */
    public static String m4531(String str) {
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

    /* JADX INFO: renamed from: ۧۤۦۨ, reason: not valid java name and contains not printable characters */
    public static boolean m4532(Object obj) {
        if (C0099.m3752() < 0) {
            return ((i) obj).q();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ۠۠, reason: not valid java name and contains not printable characters */
    public static String m4533(Object obj) {
        if (C0112.m4054() < 0) {
            return ((xo) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۦ۠, reason: not valid java name and contains not printable characters */
    public static void m4534(Object obj) {
        if (C0026.m1047() >= 0) {
            ((com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۣۨۢۦ, reason: not valid java name and contains not printable characters */
    public static Inflater m4535(Object obj) {
        if (C0240.m9826() > 0) {
            return ((uc) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۡۥ, reason: not valid java name and contains not printable characters */
    public static void m4536(Object obj, Object obj2) {
        if (C0235.m9535() < 0) {
            ((pr) obj).setColorFilter((ColorFilter) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m4537(Object obj, Object obj2) {
        if (C0052.m1890() > 0) {
            return ((zq.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨۤۢ, reason: not valid java name and contains not printable characters */
    public static void m4538(Object obj, int i, int i2, int i3, int i4) {
        if (C0182.m7528() < 0) {
            ((Rect) obj).set(i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: ۣۨۨۢ, reason: not valid java name and contains not printable characters */
    public static int m4539(Object obj) {
        if (C0240.m9826() >= 0) {
            return ((iq) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦ۠۟۟, reason: not valid java name and contains not printable characters */
    public static String m4479(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
