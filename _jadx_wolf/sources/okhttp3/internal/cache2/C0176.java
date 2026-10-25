package okhttp3.internal.cache2;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.hardware.camera2.CaptureRequest;
import android.media.Image;
import android.media.MediaExtractor;
import android.net.Uri;
import android.support.v4.graphics.drawable.C0009;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextPaint;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.activity.C0020;
import androidx.activity.C0021;
import androidx.annotation.C0023;
import androidx.annotation.C0026;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0034;
import androidx.appcompat.app.C0036;
import androidx.appcompat.app.C0037;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.view.menu.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.cardview.widget.CardView;
import androidx.core.app.C0055;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0065;
import androidx.core.graphics.drawable.C0066;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0079;
import androidx.emoji2.text.C0083;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0095;
import androidx.fragment.app.C0099;
import androidx.lifecycle.C0106;
import androidx.lifecycle.C0107;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0118;
import androidx.profileinstaller.C0119;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0126;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0133;
import com.example.vcam.C0141;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.HookMain;
import com.example.vcam.LicenseManager;
import com.example.vcam.MainActivity;
import com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.b;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bt;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.cm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.cs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gb;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ki;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ls;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.nd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.nq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.oh;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ws;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import okhttp3.C0239;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.internal.C0227;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.ws.C0224;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0232;
import okhttp3.logging.C0233;
import okhttp3.logging.C0235;
import okhttp3.logging.C0236;
import org.xmlpull.v1.XmlPullParser;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: okhttp3.internal.cache2.۟ۤۡۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0176 {

    /* JADX INFO: renamed from: ۧۥۤۡ, reason: not valid java name and contains not printable characters */
    public static int f626 = 927;

    /* JADX INFO: renamed from: ۟۟۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static MenuItem m7234(Object obj, Object obj2) {
        if (C0094.m3450() >= 0) {
            return ((MenuItem) obj).setIcon((Drawable) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static ki m7235(Object obj) {
        if (C0232.m9299() >= 0) {
            return ki.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۧۨ, reason: not valid java name and contains not printable characters */
    public static int m7236(Object obj) {
        if (C0233.m9365() <= 0) {
            return ((uk.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean m7237(Object obj) {
        if (C0037.m1437() <= 0) {
            return ((HookMain) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۤۡۧ, reason: not valid java name and contains not printable characters */
    public static MenuItem m7238(Object obj, char c, char c2, int i, int i2) {
        if (C0106.m3835() >= 0) {
            return ((MenuItem) obj).setShortcut(c, c2, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤۤ۟, reason: not valid java name and contains not printable characters */
    public static void m7239(Object obj, boolean z) {
        if (C0083.m3188() <= 0) {
            ((a1) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(z);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۥۨ۟, reason: not valid java name and contains not printable characters */
    public static rn m7240() {
        if (C0116.m4340() >= 0) {
            return m1.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۤۡ, reason: not valid java name and contains not printable characters */
    public static void m7241(Object obj, Object obj2) {
        if (C0036.m1332() < 0) {
            ((View) obj).invalidate((Rect) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static Field m7242(Object obj, Object obj2) {
        if (C0202.m8245() > 0) {
            return ((Class) obj).getDeclaredField((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m7243(Object obj) {
        if (C0215.m8604() < 0) {
            return v0.a.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Locale) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۣ۟, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m7244(Object obj) {
        if (C0066.m2514() >= 0) {
            return ((Image.Plane) obj).getBuffer();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۡۦ, reason: not valid java name and contains not printable characters */
    public static ConnectionBlocker.NetworkLog m7245(Object obj) {
        if (C0178.m7344() < 0) {
            return ((oh) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m7246(Object obj) {
        if (C0126.m4908() <= 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).i();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static Throwable m7247(Object obj, Object obj2) {
        if (C0020.m701() > 0) {
            return ((xd) obj).j(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۨ, reason: not valid java name and contains not printable characters */
    public static xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m7248(Object obj) {
        if (C0037.m1437() < 0) {
            return ((v0.k) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۦ, reason: not valid java name and contains not printable characters */
    public static int m7249(Object obj) {
        if (C0141.m5769() >= 0) {
            return ((b.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۢۦۦ, reason: not valid java name and contains not printable characters */
    public static int m7250(Object obj) {
        if (C0233.m9365() < 0) {
            return ((n9.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static Locale m7251() {
        if (C0118.m4454() >= 0) {
            return Locale.ROOT;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۦۦ, reason: not valid java name and contains not printable characters */
    public static boolean m7252(Object obj) {
        if (C0062.m2326() > 0) {
            return ((bt) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m7253(Object obj, boolean z) {
        if (C0233.m9365() < 0) {
            return ((HookMain) obj).a = z;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static Method m7254(Object obj) {
        if (C0095.m3478() < 0) {
            return ((wq) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۦۦ, reason: not valid java name and contains not printable characters */
    public static Context m7255(Object obj) {
        if (C0249.m10052() <= 0) {
            return ((yn) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۥ۟, reason: not valid java name and contains not printable characters */
    public static float m7256(Object obj, int i, float f) {
        if (C0021.m740() <= 0) {
            return ((TypedArray) obj).getFloat(i, f);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۦ۠, reason: not valid java name and contains not printable characters */
    public static float[] m7257(int i) {
        if (C0236.m9615() > 0) {
            return f3.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۧۥ, reason: not valid java name and contains not printable characters */
    public static int m7258(Object obj) {
        if (C0182.m7528() <= 0) {
            return ((mf) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۡ, reason: not valid java name and contains not printable characters */
    public static ArrayList m7260(Object obj) {
        if (C0215.m8604() <= 0) {
            return ((z9.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥۥ, reason: not valid java name and contains not printable characters */
    public static Uri m7261(Object obj) {
        if (C0232.m9299() >= 0) {
            return ((o5.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۦۤ, reason: not valid java name and contains not printable characters */
    public static String m7262(String str) {
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

    /* JADX INFO: renamed from: ۟ۤۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static CharSequence m7263(Object obj, Object obj2) {
        if (C0009.m276() <= 0) {
            return ((wr.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).a((View) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۢۦ, reason: not valid java name and contains not printable characters */
    public static AppCompatToggleButton m7264(Object obj, Object obj2, Object obj3) {
        if (C0218.m8760() > 0) {
            return ((m1) obj).h((Context) obj2, (AttributeSet) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۦ۠, reason: not valid java name and contains not printable characters */
    public static HashMap m7265(Object obj) {
        if (C0164.m6900() < 0) {
            return ((y9) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۨۡ, reason: not valid java name and contains not printable characters */
    public static boolean m7266(Object obj, Object obj2, Object obj3, int i, Object obj4) {
        if (C0202.m8245() > 0) {
            return ((KeyListener) obj).onKeyDown((View) obj2, (Editable) obj3, i, (KeyEvent) obj4);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۤۤۢ, reason: not valid java name and contains not printable characters */
    public static Package m7267(Object obj) {
        if (C0055.m2054() > 0) {
            return ((Class) obj).getPackage();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static int m7268(Object obj) {
        if (C0034.m1206() < 0) {
            return ((x.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۣۤۤ, reason: not valid java name and contains not printable characters */
    public static int m7269(Object obj, Object obj2, int i, Object obj3) {
        if (C0020.m701() >= 0) {
            return q1.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((AppOpsManager) obj, (String) obj2, i, (String) obj3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۤۥۦ, reason: not valid java name and contains not printable characters */
    public static boolean m7270(Object obj, int i) {
        if (C0118.m4454() > 0) {
            return ((j0) obj).k(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۣۤۧ, reason: not valid java name and contains not printable characters */
    public static void m7271(Object obj, int i) {
        if (C0214.m8575() < 0) {
            ((MediaExtractor) obj).selectTrack(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۤۨ۠, reason: not valid java name and contains not printable characters */
    public static void m7272(Object obj) {
        if (C0040.m1622() <= 0) {
            ((z1) obj).clear();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۦۦ۠, reason: not valid java name and contains not printable characters */
    public static wd m7273(Object obj, Object obj2, boolean z) {
        if (m7290() > 0) {
            return ((xd) obj).E((qa) obj2, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۨ, reason: not valid java name and contains not printable characters */
    public static lg.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m7274(Object obj) {
        if (C0065.m2448() > 0) {
            return ((lg) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۤۦ, reason: not valid java name and contains not printable characters */
    public static j m7275(Object obj, Object obj2) {
        if (C0009.m276() <= 0) {
            return ((h) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۦۥ, reason: not valid java name and contains not printable characters */
    public static ByteOrder m7276() {
        if (C0040.m1622() <= 0) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۨۤ, reason: not valid java name and contains not printable characters */
    public static a3 m7277(Object obj) {
        if (C0065.m2448() >= 0) {
            return ((fn) obj).s();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۥ, reason: not valid java name and contains not printable characters */
    public static int m7278(Object obj, int i) {
        if (C0074.m2951() < 0) {
            return ((LayerDrawable) obj).getLayerInsetBottom(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m7279(Object obj, Object obj2, int i, int i2, int i3) {
        if (C0225.m9001() >= 0) {
            ((PrecomputedText) obj).setSpan(obj2, i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ۟ۨۢۢ, reason: not valid java name and contains not printable characters */
    public static float[] m7280() {
        if (C0169.m7034() < 0) {
            return f3.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static ls m7281(Object obj) {
        if (C0249.m10052() < 0) {
            return ((ws) obj).o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static boolean m7282(Object obj, Object obj2) {
        if (C0227.m9046() > 0) {
            return ((ListView) obj).post((Runnable) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m7283(Object obj, int i) {
        if (C0062.m2326() > 0) {
            ((ActionBarContainer) obj).setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: ۠ۤۤۡ, reason: not valid java name and contains not printable characters */
    public static void m7284(Object obj, Object obj2, Object obj3) {
        if (C0235.m9535() < 0) {
            v0.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Configuration) obj, (Configuration) obj2, (Configuration) obj3);
        }
    }

    /* JADX INFO: renamed from: ۠ۥۣۢ, reason: not valid java name and contains not printable characters */
    public static gb.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m7285(Object obj, int i, int i2, boolean z, int i3) {
        if (C0211.m8341() > 0) {
            return gb.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((gb.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj, i, i2, z, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۤ۟, reason: not valid java name and contains not printable characters */
    public static XC_LoadPackage.LoadPackageParam m7286(Object obj) {
        if (C0172.m7180() > 0) {
            return ((HookMain.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۡ, reason: not valid java name and contains not printable characters */
    public static void m7287(Object obj, Object obj2, long j, boolean z) {
        if (m7290() >= 0) {
            C0031.m1115((f2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj, (f2) obj2, j, z);
        }
    }

    /* JADX INFO: renamed from: ۡۦۢ, reason: not valid java name and contains not printable characters */
    public static int m7288(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۢ۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static void m7289(Object obj) {
        if (C0128.m5064() <= 0) {
            ((jq) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۢۧۡ۟, reason: not valid java name and contains not printable characters */
    public static int m7290() {
        return 637 ^ C0182.f632;
    }

    /* JADX INFO: renamed from: ۢۧۧ, reason: not valid java name and contains not printable characters */
    public static CaptureRequest.Builder m7291() {
        if (C0115.m4218() <= 0) {
            return HookMain.c2_builder;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۡۥ, reason: not valid java name and contains not printable characters */
    public static int m7292(Object obj) {
        if (C0148.m6464() < 0) {
            return ((zr) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۤۧۡ, reason: not valid java name and contains not printable characters */
    public static Thread m7293(Object obj) {
        if (C0119.m4573() >= 0) {
            return ((r2) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m7294(Object obj, Object obj2) {
        if (C0213.m8458() > 0) {
            kp.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TextView) obj, (PorterDuff.Mode) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۤۡۤ, reason: not valid java name and contains not printable characters */
    public static void m7295(Object obj, Object obj2) {
        if (C0099.m3752() <= 0) {
            ((ImageView) obj).setImageTintMode((PorterDuff.Mode) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m7296(Object obj) {
        if (C0062.m2326() >= 0) {
            ((u0) obj).k();
        }
    }

    /* JADX INFO: renamed from: ۣۤۤۡ, reason: not valid java name and contains not printable characters */
    public static int m7297(Object obj) {
        if (m7290() >= 0) {
            return ((WindowInsets) obj).hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۦ۠۠, reason: not valid java name and contains not printable characters */
    public static float m7298(Object obj) {
        if (C0026.m1047() > 0) {
            return ((TextPaint) obj).getTextSize();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۤۦۧۡ, reason: not valid java name and contains not printable characters */
    public static fa m7299(Object obj) {
        if (C0236.m9615() > 0) {
            return ((vj) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۨۤ, reason: not valid java name and contains not printable characters */
    public static tf m7300(Object obj) {
        if (C0214.m8575() <= 0) {
            return ((cm) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۢۧ, reason: contains not printable characters */
    public static int m7301(Object obj) {
        if (C0074.m2951() < 0) {
            return ((qo) obj).p;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۨ۠۟, reason: contains not printable characters */
    public static LicenseManager.LicenseCallback m7302(Object obj) {
        if (C0069.m2756() < 0) {
            return ((LicenseManager.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۠ۡ, reason: contains not printable characters */
    public static xo m7303() {
        if (C0106.m3835() >= 0) {
            return C0128.m5033();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢ۟, reason: contains not printable characters */
    public static View.AccessibilityDelegate m7304(Object obj) {
        if (C0120.m4608() >= 0) {
            return ((h) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۡۡ, reason: contains not printable characters */
    public static String m7305(Object obj, int i, int i2) {
        if (C0224.m8861() < 0) {
            return ((String) obj).substring(i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۢۡ, reason: contains not printable characters */
    public static hn m7306(Object obj) {
        if (C0023.m843() > 0) {
            return ((nq) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static PorterDuffColorFilter m7307(int i, Object obj) {
        if (C0079.m3072() <= 0) {
            return z0.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, (PorterDuff.Mode) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۧۢ, reason: not valid java name and contains not printable characters */
    public static qa m7308(Object obj) {
        if (C0116.m4340() > 0) {
            return ((nd) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۧ, reason: not valid java name and contains not printable characters */
    public static void m7309(Object obj) {
        if (C0239.m9805() <= 0) {
            MainActivity.m5565((MainActivity) obj);
        }
    }

    /* JADX INFO: renamed from: ۧۨ۟۠, reason: not valid java name and contains not printable characters */
    public static String m7310(Object obj) {
        if (C0194.m7889() > 0) {
            return ((xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.a) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۡۡ, reason: not valid java name and contains not printable characters */
    public static void m7311(Object obj, int i, int i2) {
        if (C0213.m8458() >= 0) {
            ((LayerDrawable) obj).setLayerInsetTop(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۣۨۢ۟, reason: not valid java name and contains not printable characters */
    public static View m7312(Object obj) {
        if (C0128.m5064() < 0) {
            return ((CardView.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۧ۠, reason: not valid java name and contains not printable characters */
    public static qa m7313(Object obj) {
        if (C0107.m3883() >= 0) {
            return ((cs) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣۨ, reason: not valid java name and contains not printable characters */
    public static void m7314(Object obj, int i) {
        if (C0133.m5208() < 0) {
            wr.D((View) obj, i);
        }
    }

    /* JADX INFO: renamed from: ۨۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m7315(Object obj, Object obj2) {
        if (C0058.m2184() >= 0) {
            ((v0.e) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Window.Callback) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۧۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m7316(Object obj) {
        if (C0240.m9826() > 0) {
            return C0116.m4322((ConnectionBlocker) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۨۥۥ, reason: not valid java name and contains not printable characters */
    public static int m7317(Object obj) {
        if (C0227.m9046() > 0) {
            return ((v0) obj).O;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۨۥۧ, reason: not valid java name and contains not printable characters */
    public static Drawable m7318(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0034.m1206() < 0) {
            return q4.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Resources) obj, (XmlPullParser) obj2, (AttributeSet) obj3, (Resources.Theme) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m7259(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
