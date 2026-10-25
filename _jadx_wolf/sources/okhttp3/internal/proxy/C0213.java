package okhttp3.internal.proxy;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.location.Location;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Parcel;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0009;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ActionProvider;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.inputmethod.EditorInfo;
import android.widget.ImageButton;
import android.widget.SeekBar;
import androidx.activity.C0014;
import androidx.activity.C0017;
import androidx.activity.C0020;
import androidx.activity.C0021;
import androidx.annotation.C0024;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0036;
import androidx.appcompat.app.C0037;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.C0047;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0052;
import androidx.core.app.C0053;
import androidx.core.content.C0058;
import androidx.core.widget.C0068;
import androidx.core.widget.C0069;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.drawerlayout.widget.C0072;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0083;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0095;
import androidx.fragment.app.C0097;
import androidx.lifecycle.C0108;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0118;
import androidx.profileinstaller.C0119;
import androidx.savedstate.C0122;
import androidx.savedstate.C0123;
import androidx.savedstate.C0126;
import androidx.savedstate.C0127;
import androidx.startup.C0128;
import com.example.vcam.C0141;
import com.example.vcam.HookMain;
import com.example.vcam.LicenseManager;
import com.example.vcam.MainActivity;
import com.example.vcam.Menu;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.cg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.g3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kb;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ke;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.oi;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ol;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.up;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ws;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yi;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zs;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import okhttp3.C0239;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.internal.C0227;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0231;
import okhttp3.logging.C0232;
import okhttp3.logging.C0234;
import okhttp3.logging.C0235;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import retrofit2.C0259;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: okhttp3.internal.proxy.۠ۥۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0213 {

    /* JADX INFO: renamed from: ۥۤۥۣ, reason: contains not printable characters */
    public static int f663 = 485;

    /* JADX INFO: renamed from: ۟۟ۡۨۢ, reason: not valid java name and contains not printable characters */
    public static MainActivity m8424(Object obj) {
        if (C0235.m9535() < 0) {
            return ((cg) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۥ۟, reason: not valid java name and contains not printable characters */
    public static long m8425(Object obj) {
        if (C0200.m8104() <= 0) {
            return ((m2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠ۡۦۦ, reason: not valid java name and contains not printable characters */
    public static s2 m8426(Object obj, Object obj2) {
        if (C0118.m4454() >= 0) {
            return ((s2) obj).r0((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢ۟۟, reason: not valid java name and contains not printable characters */
    public static String m8427(Object obj, Object obj2) {
        if (C0074.m2951() <= 0) {
            return f9.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj, (Uri) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static g3 m8428(Object obj) {
        if (C0211.m8341() >= 0) {
            return ((r4) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۧۡ, reason: not valid java name and contains not printable characters */
    public static void m8429(Object obj, Object obj2) {
        if (C0235.m9535() <= 0) {
            Menu.m5653((Menu) obj, (View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۢۧۢ, reason: not valid java name and contains not printable characters */
    public static Object[] m8430(Object obj) {
        if (C0036.m1332() <= 0) {
            return ((v1) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۣۤ, reason: not valid java name and contains not printable characters */
    public static void m8431(Object obj, int i, Object obj2) {
        if (C0093.m3365() >= 0) {
            ((Drawable) obj).setColorFilter(i, (PorterDuff.Mode) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨ۠, reason: not valid java name and contains not printable characters */
    public static XmlResourceParser m8432(Object obj, int i) {
        if (C0113.m4144() <= 0) {
            return ((Resources) obj).getAnimation(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟۟, reason: not valid java name and contains not printable characters */
    public static Object m8433() {
        if (m8458() > 0) {
            return u0.g();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m8434(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws XmlPullParserException, IOException {
        if (C0118.m4454() > 0) {
            q7.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Drawable) obj, (Resources) obj2, (XmlPullParser) obj3, (AttributeSet) obj4, (Resources.Theme) obj5);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۡۨۤ, reason: not valid java name and contains not printable characters */
    public static void m8435(Object obj, int i) {
        if (C0117.m4419() <= 0) {
            ((y4) obj).c(i);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۥ۠, reason: not valid java name and contains not printable characters */
    public static int m8436(Object obj, Object obj2) {
        if (C0017.m627() > 0) {
            return ((PackageManager) obj).getComponentEnabledSetting((ComponentName) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۥۦۣ, reason: not valid java name and contains not printable characters */
    public static void m8437(Object obj, Object obj2) {
        if (C0176.m7290() > 0) {
            Menu.m5681((Menu) obj, (View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۥۨۡ, reason: not valid java name and contains not printable characters */
    public static boolean m8438(Object obj) {
        if (C0031.m1148() <= 0) {
            return C0194.m7881((LicenseManager) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۨۢ, reason: not valid java name and contains not printable characters */
    public static Context m8439(Object obj) {
        if (C0234.m9461() <= 0) {
            return ((View) obj).getContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۥۤ, reason: not valid java name and contains not printable characters */
    public static boolean m8440(Object obj) {
        if (C0249.m10052() < 0) {
            return ((up) obj).hasDeadline();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۨۦ, reason: not valid java name and contains not printable characters */
    public static void m8441(Object obj, Object obj2, int i, int i2) {
        if (C0148.m6464() < 0) {
            y7.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((EditorInfo) obj, (CharSequence) obj2, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۡۢ, reason: not valid java name and contains not printable characters */
    public static String m8442(Object obj) {
        if (C0231.m9265() > 0) {
            return ((s2) obj).X();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۨ, reason: not valid java name and contains not printable characters */
    public static HookMain m8443(Object obj) {
        if (C0052.m1890() >= 0) {
            return ((HookMain.m) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static boolean m8444(int i, int i2) {
        if (C0021.m740() < 0) {
            return HookMain.V(i, i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧۤ, reason: not valid java name and contains not printable characters */
    public static AtomicIntegerFieldUpdater m8445() {
        if (C0068.m2650() > 0) {
            return zs.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۢۧ, reason: not valid java name and contains not printable characters */
    public static ke.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m8446(Object obj) {
        if (C0094.m3450() > 0) {
            return ((yi) obj).mo6380getGetter();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۢۨ, reason: not valid java name and contains not printable characters */
    public static void m8447(Object obj, Object obj2) {
        if (C0009.m276() <= 0) {
            ((ViewParent) obj).onStopNestedScroll((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۨۨۢ, reason: not valid java name and contains not printable characters */
    public static HookMain m8448(Object obj) {
        if (C0020.m701() > 0) {
            return ((HookMain.t) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static HookMain m8449(Object obj) {
        if (C0068.m2650() >= 0) {
            return ((HookMain.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۤۢ, reason: not valid java name and contains not printable characters */
    public static void m8450(Object obj, int i) {
        if (C0199.m7998() <= 0) {
            wr.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.k((View) obj, i);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۥۣ۟, reason: not valid java name and contains not printable characters */
    public static int m8451(Object obj) {
        if (C0225.m9001() > 0) {
            return ((fd) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۧۡ۠, reason: not valid java name and contains not printable characters */
    public static boolean m8452(Object obj) {
        if (C0009.m276() < 0) {
            return ((View) obj).isPressed();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۨۥ۟, reason: not valid java name and contains not printable characters */
    public static int m8453(Object obj) {
        if (C0072.m2856() <= 0) {
            return ((Configuration) obj).touchscreen;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧ۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static ContentLoadingProgressBar m8454(Object obj) {
        if (C0232.m9299() >= 0) {
            return ((p5) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static Object m8455(Object obj, int i) {
        if (C0171.m7136() < 0) {
            return ((wn) obj).b(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static HookMain m8456(Object obj) {
        if (C0069.m2756() < 0) {
            return ((HookMain.w) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۧۡ, reason: not valid java name and contains not printable characters */
    public static int m8458() {
        return 112 ^ C0182.f632;
    }

    /* JADX INFO: renamed from: ۟ۧۥۢۡ, reason: not valid java name and contains not printable characters */
    public static int m8459(Object obj, int i, int i2) {
        if (m8458() > 0) {
            return m0.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TypedArray) obj, i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۥۢۢ, reason: not valid java name and contains not printable characters */
    public static Object m8460(Object obj, Object obj2, Object obj3) {
        if (C0108.m4038() >= 0) {
            return ((WeakHashMap) obj).put(obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m8461(Object obj, int i, Object obj2) {
        if (C0024.m896() > 0) {
            return ((v0) obj).u0(i, (KeyEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۦۣۦ, reason: not valid java name and contains not printable characters */
    public static boolean m8462(Object obj) {
        if (C0037.m1437() <= 0) {
            return yr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ViewConfiguration) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m8463(Object obj, Object obj2, Object obj3, int i, int i2) {
        if (C0259.m10136() > 0) {
            return ((gj) obj).g((View) obj2, (View) obj3, i, i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static Cursor m8464(Object obj, Object obj2, Object obj3, int i) {
        if (C0161.m6744() >= 0) {
            return ((qo) obj).m((SearchableInfo) obj2, (String) obj3, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m8465(Object obj, Object obj2) {
        if (C0128.m5064() <= 0) {
            return mo.g0((CharSequence) obj, (hd) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m8466(Object obj) {
        if (C0123.m4841() < 0) {
            return ((SeekBar) obj).getPaddingLeft();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۨۦۥ, reason: not valid java name and contains not printable characters */
    public static boolean m8467(Object obj) {
        if (C0227.m9046() > 0) {
            return ((v0) obj).s0();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۡۡۤ, reason: not valid java name and contains not printable characters */
    public static double m8468(Object obj) {
        if (C0202.m8245() >= 0) {
            return ((Location) obj).getLongitude();
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: ۣۡۧۧ, reason: not valid java name and contains not printable characters */
    public static int m8469(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۢۢ, reason: not valid java name and contains not printable characters */
    public static Set m8470(Object obj) {
        if (C0123.m4841() < 0) {
            return Collections.newSetFromMap((Map) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۢ۟, reason: not valid java name and contains not printable characters */
    public static boolean m8471(Object obj) {
        if (C0235.m9535() <= 0) {
            return ((View) obj).isAttachedToWindow();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۥۥۨ, reason: not valid java name and contains not printable characters */
    public static void m8472(Object obj) {
        if (m8458() > 0) {
            wr.c.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj);
        }
    }

    /* JADX INFO: renamed from: ۢۥۦۦ, reason: not valid java name and contains not printable characters */
    public static long m8473(Object obj, long j) {
        if (C0127.m4950() >= 0) {
            return ((TimeUnit) obj).toMillis(j);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢۦۤۢ, reason: not valid java name and contains not printable characters */
    public static String m8474(Object obj) {
        if (C0006.m169() < 0) {
            return ((Locale) obj).getCountry();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۥ, reason: not valid java name and contains not printable characters */
    public static String m8475(Object obj) {
        if (C0021.m740() <= 0) {
            return zo.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۨۤ, reason: not valid java name and contains not printable characters */
    public static void m8476(Object obj) throws IOException {
        if (C0178.m7344() < 0) {
            ((Socket) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۣۢۨۦ, reason: not valid java name and contains not printable characters */
    public static Handler m8477(Object obj) {
        if (C0047.m1663() < 0) {
            return ((kb) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۨ۠, reason: not valid java name and contains not printable characters */
    public static dd m8478(Object obj) {
        if (C0141.m5769() > 0) {
            return ((xs.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۥۧ, reason: not valid java name and contains not printable characters */
    public static WindowInsets m8479(Object obj, Object obj2) {
        if (C0126.m4908() <= 0) {
            return ((View) obj).onApplyWindowInsets((WindowInsets) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static Object m8480(Object obj) {
        if (C0072.m2856() < 0) {
            return ((tf) obj)._next;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static int[] m8481() {
        if (C0232.m9299() > 0) {
            return ol.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m8482(Object obj, Object obj2, int i) {
        if (C0217.m8693() <= 0) {
            TextUtils.writeToParcel((CharSequence) obj, (Parcel) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۣۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m8483(Object obj) {
        if (C0108.m4038() > 0) {
            ((ws.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).c();
        }
    }

    /* JADX INFO: renamed from: ۤۥۧۡ, reason: not valid java name and contains not printable characters */
    public static j0.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m8484(Object obj) {
        if (C0058.m2184() > 0) {
            return ((j0) obj).k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۢۦ, reason: not valid java name and contains not printable characters */
    public static byte[] m8485(Object obj, Object obj2) {
        if (C0095.m3478() <= 0) {
            return ((String) obj).getBytes((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۧۥ, reason: not valid java name and contains not printable characters */
    public static int m8486(Object obj) {
        if (C0119.m4573() > 0) {
            return ((sr) obj).c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۧۤۧ, reason: not valid java name and contains not printable characters */
    public static String m8487(String str) {
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

    /* JADX INFO: renamed from: ۤۨۧۢ, reason: not valid java name and contains not printable characters */
    public static void m8488(Object obj, Object obj2) {
        if (C0122.m4736() < 0) {
            ((ImageButton) obj).setOnClickListener((View.OnClickListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۡۤۧ, reason: contains not printable characters */
    public static int m8489(Object obj) {
        if (C0053.m1959() >= 0) {
            return ((oi) obj).d();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۢۡۦ, reason: contains not printable characters */
    public static Typeface m8490(Object obj) {
        if (C0097.m3659() > 0) {
            return uq.a(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۢۦ, reason: contains not printable characters */
    public static Intent m8491(Object obj, Object obj2) {
        if (C0014.m545() > 0) {
            return ((Intent) obj).setComponent((ComponentName) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۡۡ, reason: contains not printable characters */
    public static boolean m8492(Object obj, int i, int i2) {
        if (C0108.m4038() >= 0) {
            return HookMain.a((MediaPlayer) obj, i, i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۦۧ, reason: contains not printable characters */
    public static void m8493(Object obj, int i, int i2) {
        if (C0225.m9001() > 0) {
            ((LayerDrawable) obj).setLayerInsetLeft(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۦ۟ۧ۠, reason: contains not printable characters */
    public static boolean m8494() {
        if (C0232.m9299() > 0) {
            return Thread.interrupted();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦ۠ۨ, reason: contains not printable characters */
    public static boolean m8495(Object obj, Object obj2) {
        if (C0006.m169() <= 0) {
            return ((Date) obj).after((Date) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۢۤ۠, reason: contains not printable characters */
    public static Runnable m8496(Object obj) {
        if (C0149.m6476() < 0) {
            return ((p1.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۥۦ, reason: contains not printable characters */
    public static void m8497(Object obj, Object obj2, boolean z) {
        if (C0239.m9805() <= 0) {
            ((xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).c0((Throwable) obj2, z);
        }
    }

    /* JADX INFO: renamed from: ۦۥ۠ۡ, reason: contains not printable characters */
    public static int m8498(Object obj) {
        if (C0218.m8760() >= 0) {
            return ((View) obj).getPaddingRight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۥ۠ۨ, reason: contains not printable characters */
    public static AppCompatRatingBar m8499(Object obj, Object obj2, Object obj3) {
        if (C0083.m3188() < 0) {
            return ((m1) obj).d((Context) obj2, (AttributeSet) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧۤ۟, reason: contains not printable characters */
    public static void m8500(Object obj, Object obj2) {
        if (C0240.m9826() >= 0) {
            ((q) obj).j((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۧۦۨ, reason: not valid java name and contains not printable characters */
    public static String m8501(Object obj) {
        if (C0049.m1767() < 0) {
            return ((ReflectiveOperationException) obj).getMessage();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m8502(Object obj, int i, int i2) {
        if (C0162.m6837() < 0) {
            return ((v0.j) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۡۧۥ, reason: not valid java name and contains not printable characters */
    public static r4 m8503(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        if (C0259.m10136() >= 0) {
            return r4.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((r4) obj, obj2, (g3) obj3, (qa) obj4, obj5, (Throwable) obj6, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۢۨ, reason: not valid java name and contains not printable characters */
    public static boolean m8504(Object obj, boolean z) {
        if (C0202.m8245() >= 0) {
            return ((MainActivity) obj).E = z;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۧ۠۟, reason: not valid java name and contains not printable characters */
    public static View m8505(Object obj) {
        if (C0178.m7344() <= 0) {
            return ((ActionProvider) obj).onCreateActionView();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۦۧ, reason: not valid java name and contains not printable characters */
    public static String m8457(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
