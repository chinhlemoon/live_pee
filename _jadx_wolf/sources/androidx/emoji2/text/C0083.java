package androidx.emoji2.text;

import android.animation.ObjectAnimator;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.icu.util.ULocale;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.support.v4.app.C0004;
import android.support.v4.graphics.drawable.C0010;
import android.support.v4.graphics.drawable.C0011;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.activity.C0014;
import androidx.activity.C0017;
import androidx.activity.C0021;
import androidx.activity.ComponentActivity;
import androidx.annotation.C0025;
import androidx.appcompat.app.C0034;
import androidx.appcompat.app.C0035;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0047;
import androidx.cardview.widget.C0049;
import androidx.cardview.widget.CardView;
import androidx.core.app.C0052;
import androidx.core.content.C0057;
import androidx.core.graphics.drawable.C0064;
import androidx.core.graphics.drawable.C0065;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0070;
import androidx.fragment.app.C0094;
import androidx.lifecycle.C0106;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0116;
import androidx.savedstate.C0123;
import androidx.startup.C0128;
import com.example.vcam.HookMain;
import com.example.vcam.Menu;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.c;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.cf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mb;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mh;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.nc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ok;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.op;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zq;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.C0238;
import okhttp3.C0239;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0195;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.logging.C0231;
import okhttp3.logging.C0232;
import okhttp3.logging.C0236;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: androidx.emoji2.text.۟ۦ۠ۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0083 {

    /* JADX INFO: renamed from: ۥۦۨ۠, reason: contains not printable characters */
    public static int f74 = -233;

    /* JADX INFO: renamed from: ۟۟۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static void m3141(Object obj, boolean z) {
        if (C0094.m3450() > 0) {
            ((ObjectAnimator) obj).setAutoCancel(z);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static long m3142(Object obj) {
        if (C0218.m8760() >= 0) {
            return ((dp) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۟ۨۦۣ, reason: not valid java name and contains not printable characters */
    public static SpannableStringBuilder m3143(Object obj, int i, Object obj2) {
        if (C0176.m7290() > 0) {
            return ((vn) obj).insert(i, (CharSequence) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static int m3144(int i) {
        if (C0194.m7889() > 0) {
            return dl.c(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m3145(Object obj) {
        if (C0231.m9265() >= 0) {
            return ((r) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۡۨۥ, reason: not valid java name and contains not printable characters */
    public static o5.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m3146(Object obj) {
        if (C0219.m8794() >= 0) {
            return ((o5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m3147(Object obj) {
        if (C0215.m8604() <= 0) {
            return ((ViewGroup.LayoutParams) obj).height;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۤۧۧ, reason: not valid java name and contains not printable characters */
    public static Iterator m3148(Object obj) {
        if (C0047.m1663() < 0) {
            return ((ArrayList) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static void m3149(Object obj, int i, int i2, int i3, int i4) {
        if (C0034.m1206() < 0) {
            ((CardView.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static a6 m3150(Object obj, Object obj2) {
        if (C0187.m7613() >= 0) {
            return ((a6.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.C0142x35d57e31) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((y5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static op m3151(Object obj, Object obj2, Object obj3) {
        if (C0065.m2448() >= 0) {
            return ((pp.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((op) obj2, (y5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۣ۟, reason: not valid java name and contains not printable characters */
    public static hd m3152(int i, int i2) {
        if (C0025.m934() >= 0) {
            return tl.a(i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static List m3153(Object obj) {
        if (C0070.m2829() < 0) {
            return ((mo.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۢ۟, reason: not valid java name and contains not printable characters */
    public static boolean m3154(Object obj) {
        if (C0047.m1663() < 0) {
            return ((ActionBarContextView) obj).b();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۢۦۥ, reason: not valid java name and contains not printable characters */
    public static int m3155(Object obj, Object obj2) {
        if (C0021.m740() <= 0) {
            return ok.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj, (String) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۧ, reason: not valid java name and contains not printable characters */
    public static int m3156(Object obj) {
        if (C0064.m2388() >= 0) {
            return ((AtomicInteger) obj).getAndIncrement();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۦۤۦ, reason: not valid java name and contains not printable characters */
    public static s2 m3157(Object obj, Object obj2, int i, int i2, Object obj3) {
        if (C0171.m7136() <= 0) {
            return ((s2) obj).p0((String) obj2, i, i2, (Charset) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static int m3158(Object obj, Object obj2) {
        if (C0113.m4144() < 0) {
            return ((Spannable) obj).getSpanStart(obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦۡ, reason: not valid java name and contains not printable characters */
    public static View m3159(Object obj, int i) {
        if (C0201.m8184() < 0) {
            return ((ViewGroup) obj).findViewById(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢۢ, reason: not valid java name and contains not printable characters */
    public static boolean m3160(Object obj, Object obj2) {
        if (C0004.m139() <= 0) {
            return ((xd) obj).b(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤۤ, reason: not valid java name and contains not printable characters */
    public static com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.a m3161(Object obj) {
        if (C0169.m7034() <= 0) {
            return ((com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦۨ, reason: not valid java name and contains not printable characters */
    public static int m3162(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۨۧۦ, reason: not valid java name and contains not printable characters */
    public static View m3163(Object obj, int i) {
        if (C0079.m3072() < 0) {
            return ((Window) obj).findViewById(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static Application m3164(Object obj) {
        if (C0217.m8693() < 0) {
            return ((x.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۢ, reason: not valid java name and contains not printable characters */
    public static boolean m3165(Object obj) {
        if (C0035.m1268() < 0) {
            return ((xd) obj).z();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۢۥۥ, reason: not valid java name and contains not printable characters */
    public static boolean m3166(Object obj, Object obj2) {
        if (C0202.m8245() > 0) {
            return ((o9) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((MotionEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۥۦ۟, reason: not valid java name and contains not printable characters */
    public static CharSequence m3167(Object obj) {
        if (C0239.m9805() < 0) {
            return ((ActionBarContextView) obj).getSubtitle();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m3168(String str) {
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

    /* JADX INFO: renamed from: ۟ۥۣۡۨ, reason: not valid java name and contains not printable characters */
    public static void m3169(Object obj, Object obj2) {
        if (C0057.m2142() >= 0) {
            ((Configuration) obj).setLocales((LocaleList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۥۥۣ, reason: not valid java name and contains not printable characters */
    public static void m3170(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws XmlPullParserException, IOException {
        if (C0176.m7290() > 0) {
            ((pr) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Resources) obj2, (XmlPullParser) obj3, (AttributeSet) obj4, (Resources.Theme) obj5);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۦ۟۠, reason: not valid java name and contains not printable characters */
    public static Layout m3171(Object obj) {
        if (C0213.m8458() > 0) {
            return ((TextView) obj).getLayout();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۨ۠, reason: not valid java name and contains not printable characters */
    public static boolean m3172() {
        if (C0202.m8245() > 0) {
            return u7.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۨۢ۠, reason: not valid java name and contains not printable characters */
    public static void m3173(Object obj, long j) {
        if (C0123.m4841() < 0) {
            ((s2) obj).a0(j);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۨۦۡ, reason: not valid java name and contains not printable characters */
    public static void m3174(Object obj) {
        if (C0214.m8575() < 0) {
            ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).h();
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static Method m3175(Object obj, Object obj2) {
        if (C0112.m4054() <= 0) {
            return ((rr) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۧۦ, reason: not valid java name and contains not printable characters */
    public static CharSequence m3176(Object obj) {
        if (C0040.m1622() <= 0) {
            return ((q) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۢ, reason: not valid java name and contains not printable characters */
    public static ULocale m3177(Object obj) {
        if (C0049.m1767() <= 0) {
            return nc.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Locale) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3178(Object obj, Object obj2, Object obj3) {
        if (C0213.m8458() > 0) {
            return ((l) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj2, (l.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static int m3179(Object obj, Object obj2) {
        if (C0232.m9299() >= 0) {
            return ((t8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((t8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۨ۟۠, reason: not valid java name and contains not printable characters */
    public static Object m3180(Object obj) {
        if (C0116.m4340() >= 0) {
            return ((kotlin.jvm.internal.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).receiver;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۥۨ, reason: not valid java name and contains not printable characters */
    public static m2 m3181(Object obj, float f, float f2) {
        if (C0004.m139() < 0) {
            return ((m2) obj).h(f, f2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠۠۟, reason: not valid java name and contains not printable characters */
    public static void m3183(Object obj) {
        if (C0010.m354() <= 0) {
            ((i) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۢۢۥۦ, reason: not valid java name and contains not printable characters */
    public static Class m3184() {
        if (C0047.m1663() < 0) {
            return Boolean.TYPE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۣۧ, reason: not valid java name and contains not printable characters */
    public static Object m3185(Object obj, int i) {
        if (C0035.m1268() <= 0) {
            return ((c) obj).remove(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۤ, reason: not valid java name and contains not printable characters */
    public static List m3186(Object obj) {
        if (C0014.m545() >= 0) {
            return ((Uri) obj).getPathSegments();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۢۧ, reason: not valid java name and contains not printable characters */
    public static Context m3187(Object obj) {
        if (C0115.m4218() < 0) {
            return ((uo) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static int m3188() {
        return (-21) ^ C0231.f681;
    }

    /* JADX INFO: renamed from: ۤ۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static d0 m3189(Object obj, Object obj2, Object obj3) {
        if (C0057.m2142() > 0) {
            return ((ComponentActivity) obj).t((a0) obj2, (z) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۢۡ, reason: not valid java name and contains not printable characters */
    public static ArrayList m3190(Object obj) {
        if (C0128.m5064() <= 0) {
            return ((xd.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۤۥ, reason: not valid java name and contains not printable characters */
    public static boolean m3191(Object obj, Object obj2) {
        if (C0017.m627() >= 0) {
            return ((vn.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۠ۡۧ, reason: contains not printable characters */
    public static Object m3192(Object obj, int i, Object obj2) {
        if (C0204.m8270() < 0) {
            return zq.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Object[]) obj, i, (zq.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢ۠ۨ, reason: contains not printable characters */
    public static SubMenu m3193(Object obj, Object obj2) {
        if (C0069.m2756() <= 0) {
            return ((SubMenu) obj).setHeaderIcon((Drawable) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۠ۧ, reason: contains not printable characters */
    public static int m3194(Object obj) {
        if (C0171.m7136() < 0) {
            return ((sm) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۣۡ, reason: contains not printable characters */
    public static Menu m3195(Object obj) {
        if (C0195.m7914() >= 0) {
            return ((mh) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤۨۧ, reason: contains not printable characters */
    public static void m3196(Object obj, boolean z) {
        if (C0052.m1890() >= 0) {
            ((View) obj).setLongClickable(z);
        }
    }

    /* JADX INFO: renamed from: ۥۧۡۢ, reason: contains not printable characters */
    public static dn m3197(Object obj) {
        if (C0011.m458() >= 0) {
            return ((dn) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۨۦ, reason: contains not printable characters */
    public static short m3198(Object obj) {
        if (C0200.m8104() <= 0) {
            return ((s2) obj).l();
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: ۦ۠ۧۢ, reason: contains not printable characters */
    public static void m3199(Object obj, Object obj2, Object obj3) {
        if (C0010.m354() < 0) {
            dm.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Executor) obj, (Callable) obj2, (m5) obj3);
        }
    }

    /* JADX INFO: renamed from: ۦۣۨۡ, reason: contains not printable characters */
    public static void m3200(Object obj, long j, int i) {
        if (C0112.m4054() <= 0) {
            obj.wait(j, i);
        }
    }

    /* JADX INFO: renamed from: ۦۦۥۥ, reason: contains not printable characters */
    public static void m3201(Object obj, int i) {
        if (C0084.m3253() < 0) {
            ((u0) obj).z(i);
        }
    }

    /* JADX INFO: renamed from: ۦۧۡۨ, reason: contains not printable characters */
    public static int m3202(Object obj) {
        if (C0106.m3835() >= 0) {
            return ((xs) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۦۣۣ, reason: not valid java name and contains not printable characters */
    public static int[] m3203() {
        if (C0236.m9615() > 0) {
            return i0.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static a3 m3204(Object obj, int i) {
        if (C0021.m740() < 0) {
            return ((s2) obj).d0(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۧۧ, reason: not valid java name and contains not printable characters */
    public static void m3205(int i) {
        if (C0195.m7914() >= 0) {
            cf.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
    }

    /* JADX INFO: renamed from: ۧۨ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m3206(Object obj) {
        if (C0238.m9653() >= 0) {
            return ((HashMap) obj).hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3207(int i) {
        if (C0240.m9826() >= 0) {
            return KeyEvent.isModifierKey(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static Handler m3208(Object obj, boolean z) {
        if (C0079.m3072() <= 0) {
            return mb.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Looper) obj, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۢۢ, reason: not valid java name and contains not printable characters */
    public static HookMain m3209(Object obj) {
        if (C0115.m4218() <= 0) {
            return ((HookMain.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۨۨ, reason: not valid java name and contains not printable characters */
    public static e3 m3210(float f, float f2, float f3) {
        if (C0112.m4054() <= 0) {
            return e3.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(f, f2, f3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m3211(Object obj, Object obj2, Object obj3) {
        if (C0236.m9615() >= 0) {
            ((Bundle) obj).putIntegerArrayList((String) obj2, (ArrayList) obj3);
        }
    }

    /* JADX INFO: renamed from: ۨۧۦۣ, reason: not valid java name and contains not printable characters */
    public static void m3212(Object obj) {
        if (C0079.m3072() <= 0) {
            ((Resources.Theme) obj).rebase();
        }
    }

    /* JADX INFO: renamed from: ۡۥۢۦ, reason: not valid java name and contains not printable characters */
    public static String m3182(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
