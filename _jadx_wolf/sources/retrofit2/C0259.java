package retrofit2;

import android.animation.ObjectAnimator;
import android.app.ActionBar;
import android.app.Dialog;
import android.content.ClipData;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraDevice;
import android.media.MediaExtractor;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.support.v4.app.C0002;
import android.support.v4.graphics.drawable.C0009;
import android.support.v4.graphics.drawable.C0010;
import android.support.v4.graphics.drawable.C0011;
import android.text.TextPaint;
import android.transition.Transition;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.activity.C0017;
import androidx.appcompat.app.C0034;
import androidx.appcompat.app.C0037;
import androidx.appcompat.view.menu.C0039;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.C0047;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0055;
import androidx.core.content.C0057;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0065;
import androidx.core.graphics.drawable.C0066;
import androidx.drawerlayout.widget.C0072;
import androidx.emoji2.text.C0083;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0094;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0106;
import androidx.lifecycle.C0108;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0118;
import androidx.profileinstaller.C0119;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0122;
import androidx.savedstate.C0123;
import androidx.savedstate.C0126;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0133;
import androidx.versionedparcelable.C0135;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.HookMain;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.aq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.cp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.eo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.g5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ii;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ne;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rb;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ua;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ws;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.internal.C0227;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.ws.C0224;
import okhttp3.logging.C0231;
import okhttp3.logging.C0233;
import okhttp3.logging.C0235;

/* JADX INFO: renamed from: retrofit2.ۧۡۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0259 {

    /* JADX INFO: renamed from: ۣۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int f709 = 952;

    /* JADX INFO: renamed from: ۟۟۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static int m10118(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۟ۡۤ۟, reason: not valid java name and contains not printable characters */
    public static void m10119(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0108.m4038() >= 0) {
            ((Fragment) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj2, (FileDescriptor) obj3, (PrintWriter) obj4, (String[]) obj5);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۢۤۤ, reason: not valid java name and contains not printable characters */
    public static float[] m10120(Object obj) {
        if (C0094.m3450() > 0) {
            return ((m2) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦ۠۟, reason: not valid java name and contains not printable characters */
    public static int m10121(Object obj) {
        if (C0169.m7034() < 0) {
            return ((Rect) obj).right;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m10122(Object obj) {
        if (C0062.m2326() >= 0) {
            return ((v0.k) obj).c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۡ۠ۨ, reason: not valid java name and contains not printable characters */
    public static byte[] m10123() {
        if (C0011.m458() >= 0) {
            return dl.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۢۤ, reason: not valid java name and contains not printable characters */
    public static void m10124(Object obj) {
        if (C0149.m6476() < 0) {
            wr.K((View) obj);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m10125(Object obj, Object obj2) {
        if (C0215.m8604() < 0) {
            ((aq) obj).setSupportCompoundDrawablesTintList((ColorStateList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static int m10126() {
        if (C0083.m3188() < 0) {
            return HookMain.onemwidth;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۧۧۡ, reason: not valid java name and contains not printable characters */
    public static void m10127(Object obj) {
        if (C0106.m3835() > 0) {
            ((pr.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۟ۡۨ۠ۡ, reason: not valid java name and contains not printable characters */
    public static Matcher m10128(Object obj, Object obj2) {
        if (C0066.m2514() >= 0) {
            return ((Pattern) obj).matcher((CharSequence) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m10129(Object obj, Object obj2, boolean z, int i) {
        if (C0128.m5064() <= 0) {
            return mo.x((CharSequence) obj, (CharSequence) obj2, z, i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۧۥ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m10130(Object obj, Object obj2) {
        if (C0055.m2054() > 0) {
            return ((z0.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m10131(Object obj, Object obj2, Object obj3) {
        if (C0057.m2142() > 0) {
            return ((v0) obj).E0((v0.k) obj2, (KeyEvent) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static xp m10132(Object obj) {
        if (C0058.m2184() > 0) {
            return ((k1) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦۦ, reason: not valid java name and contains not printable characters */
    public static String m10133(Object obj, Object obj2) {
        if (C0164.m6900() <= 0) {
            return ((eo.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static String m10135(Object obj) {
        if (C0093.m3365() > 0) {
            return ((RuntimeException) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۡۥ, reason: not valid java name and contains not printable characters */
    public static int m10136() {
        return (-482) ^ C0188.f638;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static ClipData m10137(Object obj) {
        if (C0118.m4454() > 0) {
            return ((o5.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static boolean m10138(Object obj, int i, boolean z) {
        if (C0049.m1767() <= 0) {
            return ((TypedArray) obj).getBoolean(i, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m10139() {
        if (m10136() > 0) {
            return u7.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۣۡ۠, reason: not valid java name and contains not printable characters */
    public static HookMain.i m10140(Object obj) {
        if (C0178.m7344() < 0) {
            return ((HookMain.i.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m10141(Object obj, int i) {
        if (C0214.m8575() < 0) {
            return ((cp) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۥۦ۠, reason: not valid java name and contains not printable characters */
    public static AssetManager m10142(Object obj) {
        if (C0017.m627() > 0) {
            return ((Resources) obj).getAssets();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۦۣ, reason: not valid java name and contains not printable characters */
    public static HashMap m10143(Object obj) {
        if (C0194.m7889() > 0) {
            return ((d9) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static o m10144(Object obj) {
        if (C0233.m9365() < 0) {
            return o.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static int m10145(Object obj) {
        if (C0065.m2448() >= 0) {
            return ((ViewConfiguration) obj).getScaledHoverSlop();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static void m10146(Object obj) {
        if (C0213.m8458() > 0) {
            ((Dialog) obj).show();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m10147(Object obj, long j, int i) {
        if (C0123.m4841() <= 0) {
            ((MediaExtractor) obj).seekTo(j, i);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣ۠ۢ, reason: not valid java name and contains not printable characters */
    public static Object m10148(Object obj) {
        if (C0009.m276() < 0) {
            return d2.l((Object[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۧۦ, reason: not valid java name and contains not printable characters */
    public static void m10149(Object obj, int i, Object obj2) {
        if (C0202.m8245() > 0) {
            Array.set(obj, i, obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m10150(Object obj, int i) {
        if (C0072.m2856() <= 0) {
            return ((cp) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۥۨۢ, reason: not valid java name and contains not printable characters */
    public static Window.Callback m10151(Object obj) {
        if (C0135.m5274() < 0) {
            return ((vs) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static u0 m10152(Object obj) {
        if (C0093.m3365() >= 0) {
            return ((y0) obj).a();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۤۦ, reason: not valid java name and contains not printable characters */
    public static void m10153(Object obj, Object obj2) {
        if (C0233.m9365() < 0) {
            ((Parcel) obj).writeBundle((Bundle) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static void m10154(Object obj) {
        if (C0224.m8861() <= 0) {
            ((ObjectAnimator) obj).cancel();
        }
    }

    /* JADX INFO: renamed from: ۟ۧۤۢ۠, reason: not valid java name and contains not printable characters */
    public static void m10155(Object obj, Object obj2) {
        if (C0235.m9535() < 0) {
            ((xs.d) obj).e((dd) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static boolean m10156(Object obj, Object obj2) {
        if (C0122.m4736() <= 0) {
            return ne.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ActionBar) obj, (KeyEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m10157(String str) {
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

    /* JADX INFO: renamed from: ۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static ActionBarContainer m10158(Object obj) {
        if (C0188.m7736() <= 0) {
            return ((n) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۡۢ, reason: not valid java name and contains not printable characters */
    public static Drawable m10159(Object obj) {
        if (C0002.m72() > 0) {
            return g5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((CompoundButton) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int[] m10160(Object obj) {
        if (C0122.m4736() <= 0) {
            return ((ImageView) obj).getDrawableState();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۨۥ, reason: not valid java name and contains not printable characters */
    public static boolean m10161(Object obj) {
        if (C0233.m9365() <= 0) {
            return ((com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۨ۠ۦ, reason: not valid java name and contains not printable characters */
    public static List m10162() {
        if (C0106.m3835() > 0) {
            return Collections.emptyList();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static CameraDevice.StateCallback m10163() {
        if (C0037.m1437() <= 0) {
            return HookMain.c2_state_cb;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥ۟۟, reason: not valid java name and contains not printable characters */
    public static jj m10164(Object obj) {
        if (C0040.m1622() <= 0) {
            return ((rc) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۣۣ, reason: not valid java name and contains not printable characters */
    public static Object m10165(Object obj, Object obj2, Object obj3) {
        if (C0191.m7812() >= 0) {
            return rd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((rd) obj, obj2, (ua) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۧۥۧ, reason: not valid java name and contains not printable characters */
    public static Shader m10166(Object obj) {
        if (C0211.m8341() >= 0) {
            return ((y4) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۢ, reason: not valid java name and contains not printable characters */
    public static mr m10167() {
        if (C0047.m1663() < 0) {
            return mr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۧۥ, reason: not valid java name and contains not printable characters */
    public static int m10168(Object obj) {
        if (C0049.m1767() <= 0) {
            return ((n9.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۦۥۤ, reason: not valid java name and contains not printable characters */
    public static boolean m10169(Object obj) {
        if (C0181.m7445() > 0) {
            return ((o) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m10170(Object obj) {
        if (C0112.m4054() <= 0) {
            ((ws) obj).p();
        }
    }

    /* JADX INFO: renamed from: ۤ۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static void m10171(Object obj, int i) {
        if (C0112.m4054() <= 0) {
            ((PopupWindow) obj).setWidth(i);
        }
    }

    /* JADX INFO: renamed from: ۤۡۦۦ, reason: not valid java name and contains not printable characters */
    public static float m10172(Object obj, Object obj2, int i, int i2) {
        if (C0034.m1206() < 0) {
            return ((Paint) obj).measureText((String) obj2, i, i2);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۣۣۤ, reason: not valid java name and contains not printable characters */
    public static boolean m10173(Object obj) {
        if (C0093.m3365() > 0) {
            return ((LocaleList) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤۨۥ, reason: not valid java name and contains not printable characters */
    public static q.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m10174(Object obj) {
        if (C0034.m1206() < 0) {
            return ((v0.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۤۦ, reason: not valid java name and contains not printable characters */
    public static boolean m10175(Object obj) {
        if (C0133.m5208() < 0) {
            return ((rb) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۥۧ۟, reason: not valid java name and contains not printable characters */
    public static e.a m10176(Object obj) {
        if (C0017.m627() >= 0) {
            return ((e) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۥۦ, reason: not valid java name and contains not printable characters */
    public static TextPaint m10177(Object obj) {
        if (C0010.m354() < 0) {
            return ((uk.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۧۨ, reason: not valid java name and contains not printable characters */
    public static int m10178(Object obj) {
        if (C0231.m9265() > 0) {
            return ((Class) obj).hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦ, reason: contains not printable characters */
    public static void m10179(Object obj, float f, float f2, int i) {
        if (C0199.m7998() < 0) {
            ((zr) obj).y(f, f2, i);
        }
    }

    /* JADX INFO: renamed from: ۥۣۦۧ, reason: contains not printable characters */
    public static void m10180(Object obj) {
        if (C0120.m4608() > 0) {
            ((r6) obj).d();
        }
    }

    /* JADX INFO: renamed from: ۥۤ۠۠, reason: contains not printable characters */
    public static int[] m10181(Object obj) {
        if (C0126.m4908() < 0) {
            return ((z0.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۤ۟, reason: contains not printable characters */
    public static p8 m10182() {
        if (C0065.m2448() >= 0) {
            return p8.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۡ, reason: contains not printable characters */
    public static int m10183(Object obj) {
        if (C0227.m9046() >= 0) {
            return ((p) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۧۤ, reason: contains not printable characters */
    public static int m10184(int i, int i2) {
        if (C0039.m1515() < 0) {
            return Math.max(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۧ۟, reason: not valid java name and contains not printable characters */
    public static TypedArray m10185(Object obj, Object obj2) {
        if (C0062.m2326() > 0) {
            return ((Context) obj).obtainStyledAttributes((int[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m10186() {
        if (C0188.m7736() <= 0) {
            return HookMain.mhight;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۦۤۨ, reason: not valid java name and contains not printable characters */
    public static MenuItem m10187(Object obj, Object obj2) {
        if (C0240.m9826() > 0) {
            return ii.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((MenuItem) obj, (r) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m10188(Object obj) {
        if (C0062.m2326() > 0) {
            return ((View) obj).performClick();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۢ۠, reason: not valid java name and contains not printable characters */
    public static boolean m10189() {
        if (C0010.m354() <= 0) {
            return xs.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۨۡ, reason: not valid java name and contains not printable characters */
    public static boolean m10190(Object obj) {
        if (C0119.m4573() >= 0) {
            return ((s0) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۥۦۦ, reason: not valid java name and contains not printable characters */
    public static Transition m10191(Object obj) {
        if (C0191.m7812() > 0) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۨ, reason: not valid java name and contains not printable characters */
    public static void m10192(Object obj, Object obj2, int i) {
        if (C0233.m9365() < 0) {
            ((ConnectionBlocker.ConnectionBlockerCallback) obj).onConnectionAllowed((String) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۣۣۣ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m10134(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
