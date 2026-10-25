package android.support.v4.graphics.drawable;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.C0004;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.activity.C0020;
import androidx.activity.C0021;
import androidx.annotation.C0023;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0035;
import androidx.appcompat.app.C0036;
import androidx.appcompat.view.menu.C0039;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0052;
import androidx.core.content.C0057;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0064;
import androidx.core.graphics.drawable.C0065;
import androidx.core.graphics.drawable.C0066;
import androidx.core.widget.C0068;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0070;
import androidx.drawerlayout.widget.C0072;
import androidx.emoji2.text.C0084;
import androidx.emoji2.text.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0099;
import androidx.lifecycle.C0106;
import androidx.lifecycle.C0107;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0118;
import androidx.savedstate.C0122;
import androidx.savedstate.C0127;
import androidx.versionedparcelable.C0129;
import androidx.versionedparcelable.C0133;
import com.example.vcam.C0141;
import com.example.vcam.Menu;
import com.example.vcam.VideoPickerActivity;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.c;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.eq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ii;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.iq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ir;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ks;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ne;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.op;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.si;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zs;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.zip.CRC32;
import okhttp3.C0239;
import okhttp3.HttpUrl;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0236;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import retrofit2.C0259;
import retrofit2.converter.scalars.C0243;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: android.support.v4.graphics.drawable.ۣ۟ۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0010 {

    /* JADX INFO: renamed from: ۥۣۤ۟, reason: contains not printable characters */
    public static int f10 = 132;

    /* JADX INFO: renamed from: ۣ۟۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m325(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0036.m1332() <= 0) {
            return ((h) obj).a((ViewGroup) obj2, (View) obj3, (AccessibilityEvent) obj4);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static int m326(Object obj) {
        if (C0049.m1767() <= 0) {
            return ((zs) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m327(Object obj, Object obj2) {
        if (C0116.m4340() > 0) {
            ((SecureRandom) obj).nextBytes((byte[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m328(Object obj, Object obj2) {
        if (C0249.m10052() <= 0) {
            ((Shader) obj).setLocalMatrix((Matrix) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۨۨۦ, reason: not valid java name and contains not printable characters */
    public static void m329(Object obj, Object obj2) {
        if (C0031.m1148() < 0) {
            ii.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((MenuItem) obj, (CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۡۡۢ, reason: not valid java name and contains not printable characters */
    public static void m330(Object obj, Object obj2, Object obj3) {
        if (C0259.m10136() >= 0) {
            ((tp) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((op) obj2, obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۡۥۤ, reason: not valid java name and contains not printable characters */
    public static String m331(Object obj) {
        if (C0066.m2514() >= 0) {
            return ((StackTraceElement) obj).getClassName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧۢۨ, reason: not valid java name and contains not printable characters */
    public static AtomicReferenceFieldUpdater m332() {
        if (C0225.m9001() >= 0) {
            return tf.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۨ۟, reason: not valid java name and contains not printable characters */
    public static void m333(Object obj, boolean z) {
        if (C0057.m2142() > 0) {
            wr.f.a((View) obj, z);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۡ۟۟, reason: not valid java name and contains not printable characters */
    public static int m334(Object obj) {
        if (C0162.m6837() <= 0) {
            return ((lg) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۢ۠, reason: not valid java name and contains not printable characters */
    public static boolean m335(Object obj, float f, float f2) {
        if (C0107.m3883() >= 0) {
            return ((Matrix) obj).postScale(f, f2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۢۨۢ, reason: not valid java name and contains not printable characters */
    public static Animator m336(Object obj, int i) {
        if (C0039.m1515() <= 0) {
            return m0.a((Context) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Context m337(Object obj, Object obj2) {
        if (C0122.m4736() <= 0) {
            return ((Context) obj).createConfigurationContext((Configuration) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۨ۟, reason: not valid java name and contains not printable characters */
    public static void m338(Object obj, int i, int i2, int i3, int i4) {
        if (C0211.m8341() > 0) {
            ((Spinner) obj).setPadding(i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۧۨ۟, reason: not valid java name and contains not printable characters */
    public static void m339(Object obj, int i, int i2) {
        if (C0236.m9615() > 0) {
            ((l2) obj).k(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۦۣ, reason: not valid java name and contains not printable characters */
    public static Object m340(Object obj, Object obj2) {
        if (C0191.m7812() > 0) {
            return ((wr.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m341(Object obj) {
        if (C0118.m4454() > 0) {
            return ((k1) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static long m342() {
        if (C0164.m6900() <= 0) {
            return jp.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m343(Object obj) {
        if (C0225.m9001() >= 0) {
            return ((i) obj).u();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static void m344(Object obj, Object obj2, Object obj3) {
        if (C0035.m1268() <= 0) {
            ((h) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj2, (AccessibilityEvent) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۥۡ, reason: not valid java name and contains not printable characters */
    public static Menu m345(Object obj) {
        if (C0036.m1332() <= 0) {
            return ((tg) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤ۠, reason: not valid java name and contains not printable characters */
    public static CharSequence m346(Object obj, Object obj2) {
        if (C0112.m4054() < 0) {
            return ((xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).f((CharSequence) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۤۡ, reason: not valid java name and contains not printable characters */
    public static String m347() {
        if (m354() < 0) {
            return "ۤ۠ۨ";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۨ۠, reason: not valid java name and contains not printable characters */
    public static void m348(Object obj, boolean z) {
        if (C0161.m6744() > 0) {
            ((iq) obj).a(z);
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۥۢ, reason: not valid java name and contains not printable characters */
    public static void m349(Object obj, Object obj2) {
        if (C0194.m7889() >= 0) {
            ((rr) obj).y((Parcelable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m350(Object obj) {
        if (C0064.m2388() >= 0) {
            return ((a3) obj).n();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۧۥ, reason: not valid java name and contains not printable characters */
    public static a6 m351(Object obj) {
        if (C0133.m5208() <= 0) {
            return ((i7) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۥ۠, reason: not valid java name and contains not printable characters */
    public static long m352(long j, long j2) {
        if (C0084.m3253() < 0) {
            return Math.max(j, j2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۨ۟, reason: not valid java name and contains not printable characters */
    public static String m353(Object obj, Object obj2) {
        if (C0004.m139() < 0) {
            return ((e) obj).h(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۨ, reason: not valid java name and contains not printable characters */
    public static int m354() {
        return (-426) ^ C0243.f693;
    }

    /* JADX INFO: renamed from: ۟ۦ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m355(Object obj) {
        if (C0058.m2184() >= 0) {
            return ((MenuItem) obj).getNumericModifiers();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static Object m356(Object obj, Object obj2) {
        if (C0072.m2856() <= 0) {
            return ((WeakHashMap) obj).get(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static void m357(Object obj) {
        if (C0094.m3450() >= 0) {
            ((bs) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۣ۟, reason: not valid java name and contains not printable characters */
    public static View m358(Object obj) {
        if (C0214.m8575() < 0) {
            return ((l2) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۤ, reason: not valid java name and contains not printable characters */
    public static boolean m359(Object obj) {
        if (C0236.m9615() > 0) {
            return wr.z((View) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m360(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦۥۤ, reason: not valid java name and contains not printable characters */
    public static Charset m362() {
        if (C0122.m4736() <= 0) {
            return s3.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int[] m363(Object obj) {
        if (C0178.m7344() < 0) {
            return ((zr) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static fs m364(Object obj) {
        if (C0068.m2650() > 0) {
            return ((gs) obj).d();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean m365() {
        if (C0020.m701() >= 0) {
            return ne.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static void m366(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws XmlPullParserException, IOException {
        if (C0117.m4419() <= 0) {
            ((Drawable) obj).inflate((Resources) obj2, (XmlPullParser) obj3, (AttributeSet) obj4, (Resources.Theme) obj5);
        }
    }

    /* JADX INFO: renamed from: ۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m367(Object obj) {
        if (C0106.m3835() > 0) {
            return ((i) obj).w();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۡۤۢ, reason: not valid java name and contains not printable characters */
    public static void m368(Object obj, Object obj2) {
        if (C0239.m9805() <= 0) {
            ((LayoutInflater) obj).setFactory2((LayoutInflater.Factory2) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static void m369(Object obj, int i) {
        if (C0031.m1148() <= 0) {
            ((rp) obj).b(i);
        }
    }

    /* JADX INFO: renamed from: ۡۡۥۨ, reason: not valid java name and contains not printable characters */
    public static Paint.Join m370(Object obj, int i, Object obj2) {
        if (C0099.m3752() <= 0) {
            return ((pr.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, (Paint.Join) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static byte[] m371(Object obj) {
        if (C0004.m139() < 0) {
            return ((Signature) obj).toByteArray();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۢۥ, reason: not valid java name and contains not printable characters */
    public static int m372(Object obj) {
        if (C0218.m8760() >= 0) {
            return ((yf) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۢۢۨ, reason: not valid java name and contains not printable characters */
    public static pr m373(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0052.m1890() >= 0) {
            return pr.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Resources) obj, (XmlPullParser) obj2, (AttributeSet) obj3, (Resources.Theme) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۧۧ, reason: not valid java name and contains not printable characters */
    public static MenuItem m374(Object obj, Object obj2) {
        if (C0036.m1332() < 0) {
            return ((MenuItem) obj).setIntent((Intent) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۢۤ, reason: not valid java name and contains not printable characters */
    public static String m375(Object obj) {
        if (C0057.m2142() > 0) {
            return ((UUID) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static TypedArray m376(Object obj, int i, Object obj2) {
        if (C0122.m4736() <= 0) {
            return ((Context) obj).obtainStyledAttributes(i, (int[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣ۠, reason: not valid java name and contains not printable characters */
    public static void m377(Object obj) {
        if (C0011.m458() > 0) {
            ((ViewGroup) obj).requestLayout();
        }
    }

    /* JADX INFO: renamed from: ۣۡۡ۟, reason: not valid java name and contains not printable characters */
    public static v0.g m378(Object obj) {
        if (C0070.m2829() <= 0) {
            return ((v0) obj).T;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۤۨ, reason: not valid java name and contains not printable characters */
    public static void m379(Object obj) {
        if (C0031.m1148() <= 0) {
            ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۤۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m380(Object obj, int i, Object obj2) {
        if (C0176.m7290() >= 0) {
            return ((AccessibilityNodeInfo) obj).performAction(i, (Bundle) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۡۡۦ, reason: not valid java name and contains not printable characters */
    public static View m381(Object obj) {
        if (C0035.m1268() <= 0) {
            return ((m1.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۤۨ, reason: not valid java name and contains not printable characters */
    public static xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m382(Object obj) {
        if (C0129.m5108() > 0) {
            return ((d8) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۢۦ, reason: not valid java name and contains not printable characters */
    public static int m383(Object obj) {
        if (C0149.m6476() < 0) {
            return ((ViewGroup) obj).getVisibility();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۨۥۤ, reason: not valid java name and contains not printable characters */
    public static int m384(Object obj, int i) {
        if (C0141.m5769() >= 0) {
            return ((Resources) obj).getDimensionPixelSize(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۧۥۢ, reason: contains not printable characters */
    public static f6.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m385() {
        if (C0023.m843() > 0) {
            return f6.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۧۡ, reason: contains not printable characters */
    public static void m386(Object obj, Object obj2) {
        if (C0141.m5769() >= 0) {
            VideoPickerActivity.m5709((VideoPickerActivity) obj, (y) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۨۦۢ, reason: contains not printable characters */
    public static int m387(Object obj) {
        if (C0122.m4736() <= 0) {
            return kp.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TextView) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦ۠ۢۤ, reason: contains not printable characters */
    public static long m388(Object obj) {
        if (C0204.m8270() < 0) {
            return ((CRC32) obj).getValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦ۠ۥۡ, reason: contains not printable characters */
    public static Object m389(Object obj, int i) {
        if (C0239.m9805() <= 0) {
            return ((c) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤ۟ۤ, reason: contains not printable characters */
    public static Object m390(Object obj) {
        if (C0069.m2756() <= 0) {
            return Objects.requireNonNull(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤ۟ۦ, reason: contains not printable characters */
    public static boolean m391(Object obj, Object obj2) {
        if (C0259.m10136() > 0) {
            return ((WindowInsets) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۥۢۦ, reason: contains not printable characters */
    public static void m392(Object obj, float f, float f2) {
        if (C0118.m4454() >= 0) {
            q7.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Drawable) obj, f, f2);
        }
    }

    /* JADX INFO: renamed from: ۦۥۦۦ, reason: contains not printable characters */
    public static void m393(Object obj, Object obj2, int i) {
        if (C0149.m6476() <= 0) {
            f1.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((LayerDrawable) obj, (LayerDrawable) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۦۧۡۨ, reason: contains not printable characters */
    public static vo m394(Object obj, Object obj2) {
        if (C0199.m7998() < 0) {
            return ((p) obj).setTooltipText((CharSequence) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static String m395(String str) {
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

    /* JADX INFO: renamed from: ۧۡۦۡ, reason: not valid java name and contains not printable characters */
    public static boolean m396(Object obj) {
        if (C0188.m7736() < 0) {
            return ((xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۧۧ۠, reason: not valid java name and contains not printable characters */
    public static f6.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m397(Object obj) {
        if (C0161.m6744() >= 0) {
            return ((f6) obj).d();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠۟۟, reason: not valid java name and contains not printable characters */
    public static ArrayList m398(Object obj) {
        if (C0065.m2448() >= 0) {
            return ((ks) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۦۣ, reason: not valid java name and contains not printable characters */
    public static p m399(Object obj) {
        if (C0118.m4454() >= 0) {
            return ((eq) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m400(Object obj, Object obj2, Object obj3, int i) {
        if (C0072.m2856() <= 0) {
            ((k6) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj2, (Cursor) obj3, i);
        }
    }

    /* JADX INFO: renamed from: ۨۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m401(Object obj, Object obj2, int i, int i2) {
        if (C0021.m740() <= 0) {
            return ((ByteBuffer) obj).get((byte[]) obj2, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۡ۠, reason: not valid java name and contains not printable characters */
    public static ir m402() {
        if (C0009.m276() <= 0) {
            return ir.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۢۡ, reason: not valid java name and contains not printable characters */
    public static int m403(Object obj, int i) {
        if (C0127.m4950() > 0) {
            return ((String) obj).codePointAt(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۧۥۥ, reason: not valid java name and contains not printable characters */
    public static si m404(Object obj, Object obj2, int i) {
        if (C0259.m10136() > 0) {
            return kg.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Throwable) obj, (String) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m361(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
