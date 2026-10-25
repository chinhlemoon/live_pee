package okhttp3.internal.ws;

import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.app.SearchableInfo;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v4.app.C0002;
import android.support.v4.app.C0006;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.view.Menu;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityEvent;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ScrollView;
import androidx.activity.C0014;
import androidx.activity.C0021;
import androidx.annotation.C0024;
import androidx.appcompat.app.C0034;
import androidx.appcompat.app.C0035;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0051;
import androidx.core.app.C0053;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0066;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0079;
import androidx.emoji2.text.C0083;
import androidx.emoji2.text.C0084;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0095;
import androidx.fragment.app.C0099;
import androidx.lifecycle.C0106;
import androidx.lifecycle.C0108;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0119;
import com.example.vcam.C0141;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.HookMain;
import com.example.vcam.LicenseManager;
import com.example.vcam.VideoToFrames;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ad;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.g5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.im;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jb;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ql;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ts;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.up;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zs;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicReferenceArray;
import okhttp3.C0239;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.logging.C0231;
import okhttp3.logging.C0233;
import okhttp3.logging.C0234;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import retrofit2.converter.scalars.C0243;

/* JADX INFO: renamed from: okhttp3.internal.ws.ۤۧۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0225 {

    /* JADX INFO: renamed from: ۟۟ۧۨ۠, reason: not valid java name and contains not printable characters */
    public static int f675 = -731;

    /* JADX INFO: renamed from: ۟۟۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static void m8933(Object obj) {
        if (C0162.m6837() < 0) {
            ts.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۡۡۦ, reason: not valid java name and contains not printable characters */
    public static double m8934(Object obj) {
        if (C0106.m3835() > 0) {
            return ((Number) obj).doubleValue();
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static void m8935(Object obj) {
        if (C0119.m4573() >= 0) {
            ((y1) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static void m8936(Object obj, Object obj2) {
        if (C0006.m169() <= 0) {
            ((r6) obj).setWindowCallback((Window.Callback) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۥۢۤ, reason: not valid java name and contains not printable characters */
    public static long m8937(Object obj) {
        if (C0095.m3478() < 0) {
            return ((m2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۟ۥۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m8938(Object obj) {
        if (C0219.m8794() >= 0) {
            return ((pr.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۧۤۥ, reason: not valid java name and contains not printable characters */
    public static View m8939(Object obj) {
        if (C0069.m2756() <= 0) {
            return ((jq) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static int[] m8940(Object obj, Object obj2) {
        if (C0062.m2326() >= 0) {
            return ((bo) obj).c((AttributeSet) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۧۧ, reason: not valid java name and contains not printable characters */
    public static r7 m8941(Object obj) {
        if (C0078.m3044() < 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۡ۟, reason: not valid java name and contains not printable characters */
    public static int m8942() {
        if (C0171.m7136() < 0) {
            return m2.l;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۥۤۢ, reason: not valid java name and contains not printable characters */
    public static int m8943() {
        if (C0211.m8341() > 0) {
            return zo.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۥۥ, reason: not valid java name and contains not printable characters */
    public static EmojiCompatInitializer.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m8944(Object obj) {
        if (C0176.m7290() > 0) {
            return ((z7) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m8945(Object obj) {
        if (C0049.m1767() < 0) {
            return ((xs) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static void m8946(Object obj) {
        if (C0051.m1783() <= 0) {
            wr.a0((View) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int[] m8947() {
        if (C0066.m2514() >= 0) {
            return mp.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static View m8948(Object obj, int i, Object obj2, Object obj3) {
        if (C0053.m1959() > 0) {
            return ((ListAdapter) obj).getView(i, (View) obj2, (ViewGroup) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥ۟۟, reason: not valid java name and contains not printable characters */
    public static String m8949(Object obj) {
        if (C0213.m8458() > 0) {
            return ((Exception) obj).getMessage();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۥ, reason: not valid java name and contains not printable characters */
    public static Intent m8950(Object obj) {
        if (C0234.m9461() < 0) {
            return ((Activity) obj).getParentActivityIntent();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static void m8951(Object obj, Object obj2, Object obj3) {
        if (C0002.m72() > 0) {
            ((Bundle) obj).putBundle((String) obj2, (Bundle) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static ClipData m8952(Object obj) {
        if (C0224.m8861() <= 0) {
            return ((DragEvent) obj).getClipData();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static vl m8953(Object obj) {
        if (m9001() >= 0) {
            return ((jb) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۟۟, reason: not valid java name and contains not printable characters */
    public static Typeface m8954() {
        if (C0240.m9826() > 0) {
            return Typeface.SERIF;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static Typeface m8955(Object obj) {
        if (C0231.m9265() >= 0) {
            return ((TextPaint) obj).getTypeface();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤ۠۟, reason: not valid java name and contains not printable characters */
    public static e9 m8956() {
        if (C0112.m4054() <= 0) {
            return e9.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Keyframe m8957(float f) {
        if (C0074.m2951() <= 0) {
            return Keyframe.ofObject(f);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨ۠۠, reason: not valid java name and contains not printable characters */
    public static hn m8959(Object obj, Object obj2, int i, boolean z, int i2) {
        if (C0187.m7613() > 0) {
            return mo.Q((CharSequence) obj, (String[]) obj2, i, z, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۡ۠, reason: not valid java name and contains not printable characters */
    public static void m8960(Object obj, Object obj2, Object obj3) {
        if (C0214.m8575() <= 0) {
            ((LicenseManager) obj).y((String) obj2, (LicenseManager.LicenseCallback) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۢۡۢ, reason: not valid java name and contains not printable characters */
    public static AtomicReferenceArray m8961(Object obj) {
        if (C0141.m5769() >= 0) {
            return ((zs) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۤۦ, reason: not valid java name and contains not printable characters */
    public static boolean m8962(Object obj) {
        if (C0217.m8693() <= 0) {
            return ((vl) obj).E();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۥۦ, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m8963(Object obj) {
        if (C0006.m169() <= 0) {
            return qc.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ImageView) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static e.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m8964(Object obj) {
        if (C0214.m8575() < 0) {
            return ((e) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static int m8965(Object obj, Object obj2) {
        if (C0069.m2756() < 0) {
            return ((zr.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۡۧ۟, reason: not valid java name and contains not printable characters */
    public static LinkedBlockingQueue m8966(Object obj) {
        if (C0024.m896() >= 0) {
            return ((VideoToFrames) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۤ, reason: not valid java name and contains not printable characters */
    public static Object m8967(Object obj) {
        if (C0240.m9826() >= 0) {
            return ((jk) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۥۢ, reason: not valid java name and contains not printable characters */
    public static u0 m8968(Object obj) {
        if (C0108.m4038() >= 0) {
            return ((y0) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static Method m8969(Object obj) {
        if (C0095.m3478() < 0) {
            return ((wq) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static Object m8970(Object obj, Object obj2) {
        if (C0219.m8794() >= 0) {
            return ((vc) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static int[] m8971() {
        if (C0219.m8794() >= 0) {
            return ql.q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۡۥ, reason: not valid java name and contains not printable characters */
    public static long m8972() {
        if (C0035.m1268() < 0) {
            return jp.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۡۧ۠, reason: not valid java name and contains not printable characters */
    public static Object m8973(Object obj) {
        if (C0218.m8760() >= 0) {
            return ((yo) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۡۧ, reason: not valid java name and contains not printable characters */
    public static void m8974(Object obj, Object obj2, Object obj3, Object obj4) throws XmlPullParserException, IOException {
        if (C0108.m4038() > 0) {
            ((uo) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((XmlPullParser) obj2, (AttributeSet) obj3, (Menu) obj4);
        }
    }

    /* JADX INFO: renamed from: ۡۢ۠ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m8975(Object obj) {
        if (C0083.m3188() <= 0) {
            return ((SearchableInfo) obj).shouldRewriteQueryFromData();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۢۥ, reason: not valid java name and contains not printable characters */
    public static PropertyValuesHolder m8976(Object obj, int i, int i2, int i3, Object obj2) {
        if (C0058.m2184() > 0) {
            return m0.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TypedArray) obj, i, i2, i3, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۥۢ, reason: not valid java name and contains not printable characters */
    public static String m8977(Object obj) {
        if (C0084.m3253() <= 0) {
            return ((x9) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۢۦ, reason: not valid java name and contains not printable characters */
    public static Surface m8978(Object obj) {
        if (C0014.m545() >= 0) {
            return C0178.m7323((HookMain) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۢ۠, reason: not valid java name and contains not printable characters */
    public static void m8979(Object obj, Object obj2, Object obj3, int i, int i2) {
        if (C0214.m8575() < 0) {
            ((SpanWatcher) obj).onSpanRemoved((Spannable) obj2, obj3, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۢۢۤۢ, reason: not valid java name and contains not printable characters */
    public static boolean m8980(Object obj) {
        if (C0243.m9964() >= 0) {
            return ((NetworkInfo) obj).isConnected();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۥۢۡ, reason: not valid java name and contains not printable characters */
    public static int m8981(Object obj) {
        if (C0078.m3044() < 0) {
            return ((v0.k) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۧۦۤ, reason: not valid java name and contains not printable characters */
    public static Object m8982(Object obj) {
        if (C0169.m7034() < 0) {
            return ((jk) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۧۧ, reason: not valid java name and contains not printable characters */
    public static String m8983(Object obj) {
        if (C0215.m8604() <= 0) {
            return ((ConnectionBlocker.NetworkLog) obj).target;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m8984(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۣ۠ۢ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m8985(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        if (C0115.m4218() < 0) {
            return sq.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TypedArray) obj, (XmlPullParser) obj2, (Resources.Theme) obj3, (String) obj4, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣۤ, reason: not valid java name and contains not printable characters */
    public static Menu m8986(Object obj) {
        if (C0162.m6837() <= 0) {
            return ((q) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۥ, reason: not valid java name and contains not printable characters */
    public static Method m8987() {
        if (C0094.m3450() >= 0) {
            return kq.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۧ, reason: not valid java name and contains not printable characters */
    public static String m8988(String str) {
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

    /* JADX INFO: renamed from: ۣۣۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m8989(Object obj, Object obj2) {
        if (C0169.m7034() < 0) {
            return ((Collection) obj).addAll((Collection) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤۥ۠, reason: not valid java name and contains not printable characters */
    public static void m8990(Object obj, int i) {
        if (C0094.m3450() >= 0) {
            ((yf) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
    }

    /* JADX INFO: renamed from: ۤۥۣۡ, reason: not valid java name and contains not printable characters */
    public static void m8991(Object obj, Object obj2) {
        if (C0034.m1206() < 0) {
            wr.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.i((View) obj, (Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۥۧۦ, reason: contains not printable characters */
    public static sp[] m8992(Object obj) {
        if (C0233.m9365() <= 0) {
            return ((rp) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟۟ۤ, reason: contains not printable characters */
    public static Region m8993(Object obj) {
        if (C0178.m7344() <= 0) {
            return ((Drawable) obj).getTransparentRegion();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۢۡ, reason: contains not printable characters */
    public static boolean m8994(Object obj) {
        if (C0213.m8458() > 0) {
            return ((tm.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦ۠ۨ۟, reason: contains not printable characters */
    public static Resources m8995(Object obj) {
        if (C0106.m3835() > 0) {
            return ((im.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۢۢ, reason: contains not printable characters */
    public static void m8996(Object obj) {
        if (C0021.m740() < 0) {
            ((hk) obj).j();
        }
    }

    /* JADX INFO: renamed from: ۦۧ, reason: contains not printable characters */
    public static boolean m8997(Object obj, Object obj2, Object obj3) {
        if (C0182.m7528() < 0) {
            return ad.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj, (Bundle) obj2, (ad.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۧۧ۟, reason: contains not printable characters */
    public static Object m8998(Object obj, Object obj2, Object obj3) {
        if (C0239.m9805() < 0) {
            return ((xd) obj).Y(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m8999(Object obj, Object obj2, Object obj3) {
        if (C0149.m6476() < 0) {
            return ((View.AccessibilityDelegate) obj).dispatchPopulateAccessibilityEvent((View) obj2, (AccessibilityEvent) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۧۡۨ, reason: not valid java name and contains not printable characters */
    public static float m9000(Object obj) {
        if (C0099.m3752() < 0) {
            return ((pr.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).c;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۧۨۢۥ, reason: not valid java name and contains not printable characters */
    public static int m9001() {
        return (-23) ^ C0187.f637;
    }

    /* JADX INFO: renamed from: ۣۨ۟۠, reason: not valid java name and contains not printable characters */
    public static long m9002(Object obj, long j, long j2) {
        if (C0178.m7344() < 0) {
            return ((up.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(j, j2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۨ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m9003(Object obj, int i, int i2, int i3, int i4) {
        if (C0079.m3072() <= 0) {
            ((ScrollView) obj).setPadding(i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: ۨ۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static Drawable m9004(Object obj) {
        if (C0083.m3188() <= 0) {
            return g5.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((CompoundButton) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۨۢ, reason: not valid java name and contains not printable characters */
    public static void m9005(Object obj, Object obj2, int i) {
        if (C0078.m3044() < 0) {
            ((gj) obj).a((View) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۨۢۨۢ, reason: not valid java name and contains not printable characters */
    public static int m9006(Object obj) {
        if (C0112.m4054() <= 0) {
            return ((xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۨ۟ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m9007(Object obj, Object obj2) {
        if (C0224.m8861() < 0) {
            return ((Set) obj).remove(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨۥۣ, reason: not valid java name and contains not printable characters */
    public static void m9008(Object obj, Object obj2) {
        if (C0034.m1206() <= 0) {
            qc.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ImageView) obj, (PorterDuff.Mode) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۧۢۨ, reason: not valid java name and contains not printable characters */
    public static String m8958(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
