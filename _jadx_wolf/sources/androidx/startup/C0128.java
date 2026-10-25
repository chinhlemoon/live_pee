package androidx.startup;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0009;
import android.text.Spannable;
import android.util.TypedValue;
import android.view.DragEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.activity.C0014;
import androidx.activity.C0017;
import androidx.annotation.C0024;
import androidx.annotation.C0025;
import androidx.annotation.C0031;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.C0034;
import androidx.appcompat.app.C0035;
import androidx.appcompat.app.C0036;
import androidx.appcompat.app.C0037;
import androidx.appcompat.view.menu.C0039;
import androidx.appcompat.widget.C0047;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0051;
import androidx.core.app.C0052;
import androidx.core.app.C0053;
import androidx.core.app.C0055;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0064;
import androidx.core.graphics.drawable.C0065;
import androidx.core.widget.C0069;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0079;
import androidx.emoji2.text.C0084;
import androidx.emoji2.text.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0095;
import androidx.fragment.app.C0096;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0106;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0119;
import androidx.savedstate.C0122;
import com.example.vcam.C0141;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.HookMain;
import com.example.vcam.MainActivity;
import com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bt;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.cp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dt;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.er;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.g5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ie;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jb;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ns;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.us;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ws;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.zip.Inflater;
import javax.crypto.Mac;
import okhttp3.C0239;
import okhttp3.HttpUrl;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0195;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.logging.C0231;
import okhttp3.logging.C0234;
import okhttp3.logging.C0235;
import okhttp3.logging.C0236;

/* JADX INFO: renamed from: androidx.startup.۟ۦ۠ۦۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0128 {

    /* JADX INFO: renamed from: ۢۥۨۤ, reason: not valid java name and contains not printable characters */
    public static int f107 = -715;

    /* JADX INFO: renamed from: ۣ۟۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static Object[] m5014(Object obj, int i, int i2, Object obj2) {
        if (C0055.m2054() >= 0) {
            return ((Spannable) obj).getSpans(i, i2, (Class) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static void m5015(boolean z, Object obj) {
        if (C0162.m6837() < 0) {
            sl.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(z, (Number) obj);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static void m5016(Object obj, int i) {
        if (C0035.m1268() < 0) {
            ((zr) obj).B(i);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۤۢ۠, reason: not valid java name and contains not printable characters */
    public static boolean m5017(Object obj) {
        if (C0017.m627() > 0) {
            return ((er) obj).e0();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۤۤۡ, reason: not valid java name and contains not printable characters */
    public static void m5018(Object obj, Object obj2) {
        if (C0215.m8604() <= 0) {
            ((TextView) obj).setLayoutParams((ViewGroup.LayoutParams) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۧۥ, reason: not valid java name and contains not printable characters */
    public static ws m5019(Object obj) {
        if (C0213.m8458() > 0) {
            return ws.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static int m5020(Object obj) {
        if (C0052.m1890() >= 0) {
            return ((EditorInfo) obj).inputType;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۨۤۨ, reason: not valid java name and contains not printable characters */
    public static int m5021(Object obj, int i, int i2) {
        if (C0025.m934() >= 0) {
            return ((TypedArray) obj).getDimensionPixelSize(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۡۡۨ, reason: not valid java name and contains not printable characters */
    public static int[] m5022(Object obj) {
        if (C0106.m3835() >= 0) {
            return ((CompoundButton) obj).getDrawableState();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۦۤ, reason: not valid java name and contains not printable characters */
    public static xo m5023() {
        if (C0039.m1515() <= 0) {
            return C0093.m3347();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧۨ, reason: not valid java name and contains not printable characters */
    public static int[] m5024() {
        if (C0053.m1959() >= 0) {
            return mp.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۣۢ, reason: not valid java name and contains not printable characters */
    public static void m5025(Object obj, Object obj2) {
        if (C0084.m3253() < 0) {
            ((MediaPlayer) obj).setDataSource((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧ۟, reason: not valid java name and contains not printable characters */
    public static int m5026(Object obj) {
        if (C0062.m2326() >= 0) {
            return ((DragEvent) obj).getAction();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m5027(Object obj, Object obj2) {
        if (C0200.m8104() <= 0) {
            return ((String) obj).endsWith((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢ۟۠۟, reason: not valid java name and contains not printable characters */
    public static Context m5028(Object obj, Object obj2) {
        if (C0164.m6900() < 0) {
            return s5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((s5) obj, (Configuration) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۢ۟, reason: not valid java name and contains not printable characters */
    public static void m5029(Object obj, Object obj2) {
        if (C0236.m9615() > 0) {
            Collections.sort((List) obj, (Comparator) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۢۨۤ, reason: not valid java name and contains not printable characters */
    public static void m5030(Object obj, int i) {
        if (C0051.m1783() <= 0) {
            ((u0) obj).D(i);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤ۟, reason: not valid java name and contains not printable characters */
    public static String m5031(Object obj) {
        if (C0034.m1206() <= 0) {
            return q1.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۤ۟, reason: not valid java name and contains not printable characters */
    public static int m5032(Object obj) {
        if (C0172.m7180() > 0) {
            return ((rl) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۨۦ, reason: not valid java name and contains not printable characters */
    public static xo m5033() {
        if (C0215.m8604() <= 0) {
            return yd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static String m5035(Object obj) {
        if (C0069.m2756() < 0) {
            return ((Uri) obj).getAuthority();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۢۡ, reason: not valid java name and contains not printable characters */
    public static int[] m5036(Object obj, int i) {
        if (C0188.m7736() <= 0) {
            return dl.e((InputStream) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۧ۟, reason: not valid java name and contains not printable characters */
    public static Object m5037(Object obj) {
        if (C0096.m3601() < 0) {
            return ((j) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۨ, reason: not valid java name and contains not printable characters */
    public static void m5038(Object obj, Object obj2) {
        if (C0079.m3072() <= 0) {
            ((Matrix) obj).getValues((float[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۤۡ۟, reason: not valid java name and contains not printable characters */
    public static Button m5039(Object obj) {
        if (C0053.m1959() >= 0) {
            return ((MainActivity) obj).A;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦ۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m5040(Object obj) {
        if (C0049.m1767() < 0) {
            return kg.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((gg) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۨۡۢ, reason: not valid java name and contains not printable characters */
    public static u0 m5041(Object obj) {
        if (C0215.m8604() <= 0) {
            return ((AppCompatActivity) obj).D();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۨۧ, reason: not valid java name and contains not printable characters */
    public static int m5042(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۧۥ, reason: not valid java name and contains not printable characters */
    public static void m5043(Object obj) {
        if (C0084.m3253() < 0) {
            ((xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۡۥۧ, reason: not valid java name and contains not printable characters */
    public static Inflater m5044(Object obj) {
        if (C0065.m2448() >= 0) {
            return ((jb) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢ۠۠, reason: not valid java name and contains not printable characters */
    public static Object m5045(Object obj) {
        if (C0096.m3601() < 0) {
            return ((uo.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۨۢ, reason: not valid java name and contains not printable characters */
    public static xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m5046(Object obj) {
        if (C0164.m6900() < 0) {
            return ((f8) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۡۨ, reason: not valid java name and contains not printable characters */
    public static String m5047(String str) {
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

    /* JADX INFO: renamed from: ۟ۥۥۤۤ, reason: not valid java name and contains not printable characters */
    public static dt m5048(Object obj) {
        if (C0176.m7290() > 0) {
            return ((bt) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۣۤ, reason: not valid java name and contains not printable characters */
    public static int m5049(Object obj, int i, int i2) {
        if (C0096.m3601() <= 0) {
            return rn.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((int[]) obj, i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static Charset m5050() {
        if (C0117.m4419() <= 0) {
            return s3.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۤ۠, reason: not valid java name and contains not printable characters */
    public static boolean m5051(int i, int i2) {
        if (C0009.m276() < 0) {
            return HookMain.T(i, i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۦۧ, reason: not valid java name and contains not printable characters */
    public static int m5052(Object obj) {
        if (C0037.m1437() <= 0) {
            return ((f6.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۣۧ۠, reason: not valid java name and contains not printable characters */
    public static float m5053(Object obj) {
        if (C0148.m6464() < 0) {
            return ((us) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۦۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m5054(Object obj, Object obj2) {
        if (C0141.m5769() > 0) {
            ((qp) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((s8) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۨۤۥ, reason: not valid java name and contains not printable characters */
    public static boolean m5055(Object obj) {
        if (C0122.m4736() <= 0) {
            return ((bt) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int[] m5056(Object obj) {
        if (C0053.m1959() >= 0) {
            return ((dk) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static t5 m5057(Object obj) {
        if (C0119.m4573() > 0) {
            return ((u5) obj).intercepted();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۨۦ, reason: not valid java name and contains not printable characters */
    public static int m5058(Object obj, int i) {
        if (C0036.m1332() <= 0) {
            return ((MotionEvent) obj).findPointerIndex(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۦۤ۟, reason: not valid java name and contains not printable characters */
    public static void m5059(Object obj, float f) {
        if (C0235.m9535() <= 0) {
            ((View) obj).setElevation(f);
        }
    }

    /* JADX INFO: renamed from: ۠۠۟ۢ, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m5060(Object obj) {
        if (C0034.m1206() < 0) {
            return ((vo) obj).getIconTintMode();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m5061(Object obj) {
        if (C0095.m3478() < 0) {
            return ((cp) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۡۤ, reason: not valid java name and contains not printable characters */
    public static bd m5062(Object obj) {
        if (m5064() <= 0) {
            return bd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۡۨ, reason: not valid java name and contains not printable characters */
    public static int m5063(Object obj) {
        if (C0106.m3835() >= 0) {
            return ((TypedValue) obj).resourceId;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۨۦۨ, reason: not valid java name and contains not printable characters */
    public static int m5064() {
        return 378 ^ C0006.f6;
    }

    /* JADX INFO: renamed from: ۡ۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static boolean m5065(Object obj) {
        if (C0219.m8794() > 0) {
            return ((o9) obj).b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۥۡۧ, reason: not valid java name and contains not printable characters */
    public static boolean m5066(Object obj, Object obj2) {
        if (C0188.m7736() < 0) {
            return ((z1) obj).contains(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۨ۠ۥ, reason: not valid java name and contains not printable characters */
    public static byte[] m5067(Object obj) {
        if (C0195.m7914() >= 0) {
            return ((rr) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۨ۠, reason: not valid java name and contains not printable characters */
    public static boolean m5068(Object obj) {
        if (C0024.m896() >= 0) {
            return ((pr) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۢۦۧ, reason: not valid java name and contains not printable characters */
    public static int m5069(Object obj) {
        if (C0062.m2326() > 0) {
            return yr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ViewConfiguration) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۦۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m5070(Object obj, Object obj2, boolean z) {
        if (C0051.m1783() <= 0) {
            return lo.b((String) obj, (String) obj2, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۦۨۧ, reason: not valid java name and contains not printable characters */
    public static void m5071(Object obj, Object obj2) {
        if (C0182.m7528() < 0) {
            ((m) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Configuration) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۨۤۢ, reason: not valid java name and contains not printable characters */
    public static hd m5072(Object obj) {
        if (C0014.m545() >= 0) {
            return ((d7.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۧۦ, reason: not valid java name and contains not printable characters */
    public static boolean m5073(Object obj, Object obj2) {
        if (C0231.m9265() >= 0) {
            return ((z1) obj).add(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m5074(Object obj, Object obj2) {
        if (C0119.m4573() >= 0) {
            g5.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((CompoundButton) obj, (ColorStateList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤ۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static Object m5075(Object obj, Object obj2, Object obj3) {
        if (C0084.m3253() < 0) {
            return ((TreeMap) obj).put(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۤۨ, reason: not valid java name and contains not printable characters */
    public static void m5076(Object obj, int i) {
        if (C0078.m3044() <= 0) {
            ((EditText) obj).setInputType(i);
        }
    }

    /* JADX INFO: renamed from: ۤۦۧ۟, reason: not valid java name and contains not printable characters */
    public static void m5077(Object obj, boolean z) {
        if (C0053.m1959() >= 0) {
            ((PopupWindow) obj).setOverlapAnchor(z);
        }
    }

    /* JADX INFO: renamed from: ۤۨۨۤ, reason: not valid java name and contains not printable characters */
    public static Iterator m5078(Object obj) {
        if (C0106.m3835() > 0) {
            return ((Collection) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠۠ۦ, reason: contains not printable characters */
    public static void m5079(Object obj, boolean z) {
        if (C0117.m4419() <= 0) {
            ((ConnectionBlocker) obj).t(z);
        }
    }

    /* JADX INFO: renamed from: ۥۡۦۦ, reason: contains not printable characters */
    public static Animator m5080(Object obj, Object obj2, Object obj3, int i, float f) {
        if (C0239.m9805() <= 0) {
            return m0.c((Context) obj, (Resources) obj2, (Resources.Theme) obj3, i, f);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۣۣ, reason: contains not printable characters */
    public static void m5081(Object obj) {
        if (C0201.m8184() <= 0) {
            ((a9) obj).a();
        }
    }

    /* JADX INFO: renamed from: ۥۤۥ۟, reason: contains not printable characters */
    public static int m5082(Object obj) {
        if (C0234.m9461() <= 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).getChangingConfigurations();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۤۦۡ, reason: contains not printable characters */
    public static void m5083(Object obj, Object obj2, Object obj3, Object obj4) {
        if (m5064() <= 0) {
            ((pr.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Canvas) obj2, (ColorFilter) obj3, (Rect) obj4);
        }
    }

    /* JADX INFO: renamed from: ۥۥ۟ۦ, reason: contains not printable characters */
    public static boolean m5084(Object obj) {
        if (C0115.m4218() < 0) {
            return ((s8) obj).Z();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦ۟۠ۦ, reason: contains not printable characters */
    public static String m5085(Object obj) {
        if (C0201.m8184() <= 0) {
            return ((l2) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۨۧ, reason: contains not printable characters */
    public static boolean m5086(Object obj) {
        if (C0149.m6476() <= 0) {
            return ((Fragment) obj).h;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۡۦۦ, reason: contains not printable characters */
    public static boolean m5087(Object obj) {
        if (C0031.m1148() <= 0) {
            return wr.f.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۦۣۨ, reason: contains not printable characters */
    public static ie.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m5088(Object obj) {
        if (C0219.m8794() > 0) {
            return ((ie) obj).mo6381getSetter();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۨ۠, reason: contains not printable characters */
    public static void m5089(Object obj, int i) {
        if (C0006.m169() <= 0) {
            ((v.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
    }

    /* JADX INFO: renamed from: ۣۣۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean m5090(Object obj, Object obj2) {
        if (C0239.m9805() < 0) {
            return ((lg.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).contains(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۦۥۧ, reason: not valid java name and contains not printable characters */
    public static MenuItem m5091(Object obj, int i, int i2, int i3, int i4) {
        if (C0047.m1663() <= 0) {
            return ((Menu) obj).add(i, i2, i3, i4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۤۡ, reason: not valid java name and contains not printable characters */
    public static boolean m5092(Object obj) {
        if (C0149.m6476() < 0) {
            return ((AccessibilityNodeInfo) obj).isCheckable();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۧۧ, reason: not valid java name and contains not printable characters */
    public static Handler m5093(Object obj) {
        if (C0036.m1332() <= 0) {
            return i5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Looper) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۡ, reason: not valid java name and contains not printable characters */
    public static xf m5094(Object obj) {
        if (C0064.m2388() >= 0) {
            return ((xf) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m5095(Object obj) {
        if (C0187.m7613() > 0) {
            return ((View) obj).isNestedScrollingEnabled();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۡۢۡ, reason: not valid java name and contains not printable characters */
    public static int m5096(char c, int i) {
        if (C0181.m7445() > 0) {
            return q3.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(c, i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۢۢۨ, reason: not valid java name and contains not printable characters */
    public static void m5097(Object obj, Object obj2) {
        if (C0113.m4144() < 0) {
            C0171.m7085((ws.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) ((ns) obj), (View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۥۡۧ, reason: not valid java name and contains not printable characters */
    public static int m5098(Object obj) {
        if (C0194.m7889() >= 0) {
            return ((SeekBar) obj).getMax();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۧۨۢ, reason: not valid java name and contains not printable characters */
    public static Mac m5099(Object obj) {
        if (C0058.m2184() >= 0) {
            return Mac.getInstance((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۨۦ, reason: not valid java name and contains not printable characters */
    public static String m5034(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
