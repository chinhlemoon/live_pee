package okhttp3.logging;

import android.app.Dialog;
import android.app.Instrumentation;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.location.Location;
import android.support.v4.app.C0002;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0009;
import android.text.PrecomputedText;
import android.text.Selection;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.style.ClickableSpan;
import android.view.ActionProvider;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.activity.C0017;
import androidx.activity.C0020;
import androidx.annotation.C0023;
import androidx.annotation.C0026;
import androidx.appcompat.app.C0034;
import androidx.appcompat.app.C0035;
import androidx.appcompat.app.C0036;
import androidx.appcompat.view.menu.C0039;
import androidx.appcompat.widget.C0047;
import androidx.cardview.widget.CardView;
import androidx.core.app.C0051;
import androidx.core.app.C0053;
import androidx.core.app.C0055;
import androidx.core.widget.C0068;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0079;
import androidx.emoji2.text.C0084;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0096;
import androidx.fragment.app.C0097;
import androidx.lifecycle.C0107;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0118;
import androidx.profileinstaller.C0119;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0122;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.HookMain;
import com.example.vcam.Menu;
import com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.Cif;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.an;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.b0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.b3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.eo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ic;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ne;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.of;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qb;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zs;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.zip.Deflater;
import okhttp3.C0238;
import okhttp3.C0240;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.internal.C0227;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.io.C0195;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.ws.C0224;
import okhttp3.internal.ws.C0225;
import retrofit2.C0259;

/* JADX INFO: renamed from: okhttp3.logging.۟ۦۥۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0234 {

    /* JADX INFO: renamed from: ۤ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static int f684 = -463;

    /* JADX INFO: renamed from: ۟۟۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static boolean m9419(Object obj) {
        if (C0232.m9299() >= 0) {
            return ((m2) obj).i;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۤۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean m9420(Object obj) {
        if (C0079.m3072() <= 0) {
            return wr.b.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m9421(Object obj) {
        if (C0068.m2650() > 0) {
            return ((l1) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m9422(Object obj, int i) {
        if (C0200.m8104() <= 0) {
            ((View) obj).setImportantForAccessibility(i);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۤ۟۠, reason: not valid java name and contains not printable characters */
    public static String m9423(Object obj, Object obj2, Object obj3) {
        if (C0169.m7034() < 0) {
            return eo.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۢ, reason: not valid java name and contains not printable characters */
    public static int m9424(Object obj) {
        if (C0148.m6464() <= 0) {
            return ((uo.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).n;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦۥ, reason: not valid java name and contains not printable characters */
    public static String m9425(Object obj) {
        if (C0053.m1959() >= 0) {
            return ((Cif) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۦۨ, reason: not valid java name and contains not printable characters */
    public static boolean m9426(Object obj) {
        if (C0026.m1047() > 0) {
            return ((ViewGroup) obj).isTransitionGroup();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m9427(Object obj) {
        if (C0225.m9001() >= 0) {
            ((qp) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨ۟, reason: not valid java name and contains not printable characters */
    public static boolean m9428(Object obj) {
        if (C0149.m6476() < 0) {
            return ((v0) obj).G;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static View m9429(Object obj) {
        if (C0002.m72() > 0) {
            return jq.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧ۠, reason: not valid java name and contains not printable characters */
    public static void m9430(Object obj) {
        if (C0036.m1332() <= 0) {
            ((u6) obj).t0();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۦۤ۠, reason: not valid java name and contains not printable characters */
    public static int m9431(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢۤ, reason: not valid java name and contains not printable characters */
    public static int m9432(Object obj) {
        if (C0120.m4608() > 0) {
            return Selection.getSelectionEnd((CharSequence) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤ۠, reason: not valid java name and contains not printable characters */
    public static TextDirectionHeuristic m9433(Object obj) {
        if (C0200.m8104() <= 0) {
            return ((PrecomputedText.Params) obj).getTextDirection();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static ViewPropertyAnimator m9434(Object obj) {
        if (C0217.m8693() < 0) {
            return ((View) obj).animate();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۧۡ, reason: not valid java name and contains not printable characters */
    public static int m9435(Object obj) {
        if (C0023.m843() > 0) {
            return ((l2.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static WeakHashMap m9436(Object obj) {
        if (C0161.m6744() >= 0) {
            return ((hm) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۢۦ, reason: not valid java name and contains not printable characters */
    public static int m9437(Object obj, int i) {
        if (C0171.m7136() < 0) {
            return ((LayerDrawable) obj).getLayerGravity(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۡۨۦ, reason: not valid java name and contains not printable characters */
    public static int m9438(Object obj) {
        if (C0097.m3659() >= 0) {
            return ((HttpURLConnection) obj).getResponseCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣۢۡ, reason: not valid java name and contains not printable characters */
    public static Call m9439(Object obj, Object obj2) {
        if (C0006.m169() < 0) {
            return ((OkHttpClient) obj).newCall((Request) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۥۡ, reason: not valid java name and contains not printable characters */
    public static void m9440(Object obj, int i) {
        if (C0113.m4144() <= 0) {
            ((p2) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣۤۦ, reason: not valid java name and contains not printable characters */
    public static f6 m9441(Object obj) {
        if (C0217.m8693() <= 0) {
            return ((an) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۨۡ, reason: not valid java name and contains not printable characters */
    public static String m9442(Object obj) {
        if (C0240.m9826() >= 0) {
            return ((hf) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static Class m9443(Object obj, Object obj2) {
        if (C0238.m9653() > 0) {
            return ((Class) obj).asSubclass((Class) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۢۨ, reason: not valid java name and contains not printable characters */
    public static xs m9444(Object obj) {
        if (C0051.m1783() < 0) {
            return ((xs.d) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۨۨ, reason: not valid java name and contains not printable characters */
    public static int m9445(Object obj) {
        if (C0051.m1783() < 0) {
            return ((ListAdapter) obj).getCount();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۦۣۡ, reason: not valid java name and contains not printable characters */
    public static int m9446(Object obj, int i) {
        if (C0182.m7528() <= 0) {
            return b3.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((byte[]) obj, i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۨۦۥ, reason: not valid java name and contains not printable characters */
    public static boolean m9447(Object obj) {
        if (C0084.m3253() < 0) {
            return ((ActionProvider) obj).hasSubMenu();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static Object m9448(Object obj) {
        if (C0118.m4454() >= 0) {
            return ((x.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static of m9449(Object obj) {
        if (C0161.m6744() > 0) {
            return ((mf) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static int m9450(Object obj, int i) {
        if (C0009.m276() <= 0) {
            return ((Menu) obj).lastY = i;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static DialogInterface.OnKeyListener m9451(Object obj) {
        if (C0259.m10136() > 0) {
            return ne.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Dialog) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۢۤ, reason: not valid java name and contains not printable characters */
    public static xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m9452(Object obj) {
        if (C0227.m9046() > 0) {
            return ((xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۥۨ, reason: not valid java name and contains not printable characters */
    public static String m9453(Object obj) {
        if (C0202.m8245() >= 0) {
            return ((InterruptedException) obj).getMessage();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۨ۟, reason: not valid java name and contains not printable characters */
    public static void m9454(Object obj, boolean z) {
        if (C0169.m7034() < 0) {
            ((h8.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(z);
        }
    }

    /* JADX INFO: renamed from: ۡ۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static Map m9455(Object obj, int i, Object obj2) {
        if (C0009.m276() <= 0) {
            return ((b0) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, (Intent) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۥۣ, reason: not valid java name and contains not printable characters */
    public static void m9456(Object obj) {
        if (C0051.m1783() <= 0) {
            ((Deflater) obj).finish();
        }
    }

    /* JADX INFO: renamed from: ۡۦ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m9457(Object obj, Object obj2) {
        if (C0055.m2054() > 0) {
            ((zs) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((dp) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡۨۡ۠, reason: not valid java name and contains not printable characters */
    public static int m9458(Object obj, Object obj2, int i, boolean z, int i2) {
        if (C0020.m701() > 0) {
            return mo.G((CharSequence) obj, (String) obj2, i, z, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m9459(Object obj, Object obj2, Object obj3) {
        if (C0213.m8458() >= 0) {
            ((Thread.UncaughtExceptionHandler) obj).uncaughtException((Thread) obj2, (Throwable) obj3);
        }
    }

    /* JADX INFO: renamed from: ۢۢۨۡ, reason: not valid java name and contains not printable characters */
    public static String m9460(Object obj) {
        if (C0211.m8341() >= 0) {
            return ((ic) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m9461() {
        return 786 ^ C0238.f688;
    }

    /* JADX INFO: renamed from: ۢۦ۠۟, reason: not valid java name and contains not printable characters */
    public static Object m9462() {
        if (C0047.m1663() <= 0) {
            return sf.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۣ۠, reason: not valid java name and contains not printable characters */
    public static void m9463(Object obj) {
        if (C0195.m7914() > 0) {
            ((View) obj).invalidate();
        }
    }

    /* JADX INFO: renamed from: ۢۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m9464(Object obj, Object obj2) {
        if (C0149.m6476() <= 0) {
            ((Window) obj).setContentView((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۢۨۤ, reason: not valid java name and contains not printable characters */
    public static Cursor m9465(Object obj, Object obj2) {
        if (C0034.m1206() <= 0) {
            return ((qo) obj).o((CharSequence) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۦۧ, reason: not valid java name and contains not printable characters */
    public static int m9467(Object obj) {
        if (C0039.m1515() < 0) {
            return ((TextView) obj).getInputType();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۨۤ, reason: not valid java name and contains not printable characters */
    public static HookMain m9468(Object obj) {
        if (C0240.m9826() >= 0) {
            return ((qb) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۢ۠, reason: not valid java name and contains not printable characters */
    public static Throwable m9469(Object obj, Object obj2) {
        if (C0214.m8575() <= 0) {
            return ((xd) obj).n(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢ۟, reason: not valid java name and contains not printable characters */
    public static View m9470(Object obj) {
        if (C0224.m8861() <= 0) {
            return ((zc) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥۨۤ, reason: not valid java name and contains not printable characters */
    public static void m9471(Object obj, Object obj2) {
        if (C0187.m7613() > 0) {
            ((CardView.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۨۦۢ, reason: not valid java name and contains not printable characters */
    public static Configuration m9472(Object obj, Object obj2) {
        if (C0119.m4573() > 0) {
            return v0.c0((Configuration) obj, (Configuration) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m9473(Object obj) {
        if (C0118.m4454() >= 0) {
            return HookMain.O((String) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤۡۤ, reason: not valid java name and contains not printable characters */
    public static int m9474(int i) {
        if (C0120.m4608() > 0) {
            return Color.red(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۦۣۦ, reason: not valid java name and contains not printable characters */
    public static Context m9475(Object obj) {
        if (C0074.m2951() < 0) {
            return ((zp) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۡۢ, reason: contains not printable characters */
    public static boolean m9476(Object obj) {
        if (C0204.m8270() <= 0) {
            return ((ListView) obj).requestFocus();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۠ۢۦ, reason: contains not printable characters */
    public static void m9477(Object obj, Object obj2) {
        if (C0068.m2650() > 0) {
            ((Instrumentation) obj).sendPointerSync((MotionEvent) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۢۢۤ, reason: contains not printable characters */
    public static void m9478(Object obj, int i, Object obj2, int i2, Object obj3) {
        if (C0035.m1268() <= 0) {
            ((ConnectionBlocker) obj).v(i, (String) obj2, i2, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۠ۤ, reason: contains not printable characters */
    public static double m9479(Object obj) {
        if (C0178.m7344() < 0) {
            return ((Location) obj).getLatitude();
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: ۥۣۡۥ, reason: contains not printable characters */
    public static boolean m9480(Object obj, Object obj2, int i, long j) {
        if (C0094.m3450() >= 0) {
            return ((ListView) obj).performItemClick((View) obj2, i, j);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣۧۥ, reason: contains not printable characters */
    public static void m9481(Object obj, Object obj2, Object obj3, int i) {
        if (C0218.m8760() >= 0) {
            ((i) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ClickableSpan) obj2, (Spanned) obj3, i);
        }
    }

    /* JADX INFO: renamed from: ۥۥۨ۠, reason: contains not printable characters */
    public static boolean m9482(Object obj) {
        if (C0107.m3883() > 0) {
            return ((Context) obj).isRestricted();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۦۧۦ, reason: contains not printable characters */
    public static void m9483(Object obj, Object obj2) {
        if (C0112.m4054() <= 0) {
            ((sp) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((rp) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۣۧ۠, reason: contains not printable characters */
    public static String m9484(String str) {
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
        while (str.length() > 0) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(-2)) << 4) | string.indexOf(str.charAt(-1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i2 = 0; i2 < length; i2++) {
            byteArray[i2] = (byte) (byteArray[i2] ^ str2.charAt(i2 % length2));
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۦ۟۠ۥ, reason: contains not printable characters */
    public static void m9485(Object obj) {
        if (C0236.m9615() >= 0) {
            ((vn) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۦۤۧۢ, reason: contains not printable characters */
    public static boolean m9486(Object obj) {
        if (C0227.m9046() >= 0) {
            return ((v0.k) obj).g;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۡۦۣ, reason: not valid java name and contains not printable characters */
    public static Field m9487() {
        if (C0039.m1515() <= 0) {
            return xs.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۡ۟, reason: not valid java name and contains not printable characters */
    public static p1.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m9488() {
        if (C0017.m627() > 0) {
            return u0.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۧ۠, reason: not valid java name and contains not printable characters */
    public static xd m9489(Object obj) {
        if (C0096.m3601() < 0) {
            return ((xd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static float m9490(Object obj) {
        if (C0122.m4736() < 0) {
            return ((e3) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۨۨ۟, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m9491(Object obj, long j, Object obj2) {
        if (C0232.m9299() >= 0) {
            return ((OkHttpClient.Builder) obj).readTimeout(j, (TimeUnit) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m9492(Object obj) {
        if (C0112.m4054() <= 0) {
            return z5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((y5) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۢۨ, reason: not valid java name and contains not printable characters */
    public static int m9493(Object obj) {
        if (C0225.m9001() > 0) {
            return ((fp) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۨۡۧ, reason: not valid java name and contains not printable characters */
    public static List m9494(Object obj) {
        if (C0215.m8604() <= 0) {
            return ((k2) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۨۤ, reason: not valid java name and contains not printable characters */
    public static boolean m9495(Object obj) {
        if (C0188.m7736() < 0) {
            return ((xd.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).a();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m9466(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
