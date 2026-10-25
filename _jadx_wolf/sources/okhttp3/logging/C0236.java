package okhttp3.logging;

import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.media.MediaCodec;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.graphics.drawable.C0009;
import android.support.v4.graphics.drawable.C0011;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.ContentInfo;
import android.view.DragEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.C0014;
import androidx.activity.C0021;
import androidx.annotation.C0024;
import androidx.annotation.C0025;
import androidx.annotation.C0026;
import androidx.appcompat.app.C0037;
import androidx.appcompat.view.menu.a;
import androidx.appcompat.view.menu.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0047;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0051;
import androidx.core.app.C0052;
import androidx.core.app.C0055;
import androidx.core.content.C0057;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0066;
import androidx.drawerlayout.widget.C0070;
import androidx.drawerlayout.widget.C0072;
import androidx.emoji2.text.C0084;
import androidx.fragment.app.C0096;
import androidx.fragment.app.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.lifecycle.C0106;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0118;
import androidx.savedstate.C0126;
import androidx.savedstate.C0127;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0129;
import androidx.versionedparcelable.C0135;
import com.example.vcam.C0141;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.HookMain;
import com.example.vcam.LicenseManager;
import com.example.vcam.Menu;
import com.example.vcam.VideoToFrames;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fi;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.Reference;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.zip.Inflater;
import kotlin.jvm.internal.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import okhttp3.HttpUrl;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.internal.ws.C0224;
import okhttp3.internal.ws.C0225;
import org.xmlpull.v1.XmlPullParser;
import retrofit2.converter.scalars.C0243;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: okhttp3.logging.۠ۨۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0236 {

    /* JADX INFO: renamed from: ۣ۟۠ۡۥ, reason: not valid java name and contains not printable characters */
    public static int f686 = -700;

    /* JADX INFO: renamed from: ۟۟۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static String m9562(Object obj, int i) {
        if (C0037.m1437() < 0) {
            return ((Cursor) obj).getString(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static String m9563(Object obj) {
        if (C0225.m9001() > 0) {
            return ((LicenseManager) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static h9 m9564() {
        if (C0084.m3253() < 0) {
            return h9.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۠ۦۦ, reason: not valid java name and contains not printable characters */
    public static boolean m9565(Object obj, Object obj2) {
        if (C0219.m8794() > 0) {
            return StateSet.stateSetMatches((int[]) obj, (int[]) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۡۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m9566(Object obj) {
        if (C0200.m8104() < 0) {
            return ((View) obj).isEnabled();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۢۧ۠, reason: not valid java name and contains not printable characters */
    public static Object m9567(Object obj, Object obj2) {
        if (C0187.m7613() > 0) {
            return ((Map) obj).remove(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static void m9568(Object obj, Object obj2, Object obj3, int i) {
        if (C0011.m458() >= 0) {
            j7.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((t5) obj, obj2, (qa) obj3, i);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m9569(Object obj) {
        if (C0084.m3253() < 0) {
            return ((MenuItem) obj).getIconTintMode();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۡۢ, reason: not valid java name and contains not printable characters */
    public static boolean m9570(Object obj) {
        if (C0009.m276() <= 0) {
            return ((AnimatorSet) obj).isStarted();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡۥ, reason: not valid java name and contains not printable characters */
    public static s2 m9571(Object obj) {
        if (C0057.m2142() >= 0) {
            return ((s2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۥ۠, reason: not valid java name and contains not printable characters */
    public static boolean m9572(Object obj, Object obj2) {
        if (C0129.m5108() > 0) {
            return ((xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).contains(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۦۣۡ, reason: not valid java name and contains not printable characters */
    public static zr.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m9573(Object obj) {
        if (C0232.m9299() >= 0) {
            return ((zr) obj).j;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۣۨ, reason: not valid java name and contains not printable characters */
    public static String m9574(Object obj, Object obj2) {
        if (C0128.m5064() < 0) {
            return ((s2) obj).J((Charset) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۤۢ, reason: not valid java name and contains not printable characters */
    public static long m9575(Object obj) {
        if (C0011.m458() > 0) {
            return ((vf) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡ۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m9576(Object obj, Object obj2, int i, int i2) {
        if (C0249.m10052() < 0) {
            ((Inflater) obj).setInput((byte[]) obj2, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۡ, reason: not valid java name and contains not printable characters */
    public static Throwable m9577(Object obj) {
        if (C0024.m896() > 0) {
            return rq.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Throwable) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۤ, reason: not valid java name and contains not printable characters */
    public static boolean m9578(Object obj) {
        if (C0202.m8245() > 0) {
            return ((MenuItem) obj).isCheckable();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۦۨۧ, reason: not valid java name and contains not printable characters */
    public static z9 m9579(Object obj) {
        if (C0200.m8104() <= 0) {
            return z9.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧۧۦ, reason: not valid java name and contains not printable characters */
    public static Menu m9580(Object obj) {
        if (C0047.m1663() < 0) {
            return ((Menu.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧۨ, reason: not valid java name and contains not printable characters */
    public static boolean m9581(Object obj, Object obj2, int i) {
        if (C0161.m6744() >= 0) {
            return ((zr.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).e((View) obj2, i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static int m9582(Object obj) {
        if (C0243.m9964() >= 0) {
            return Color.parseColor((String) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۡۤۡ, reason: not valid java name and contains not printable characters */
    public static Reference m9583(Object obj) {
        if (C0194.m7889() >= 0) {
            return ((d8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۨ۟, reason: not valid java name and contains not printable characters */
    public static boolean m9584(Object obj, Object obj2) {
        if (C0058.m2184() >= 0) {
            return ((Window.Callback) obj).dispatchGenericMotionEvent((MotionEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۦۤۧ, reason: not valid java name and contains not printable characters */
    public static Font.Builder m9585(Object obj, Object obj2) {
        if (C0188.m7736() < 0) {
            return ((Font.Builder) obj).setFontVariationSettings((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۥۡ, reason: not valid java name and contains not printable characters */
    public static void m9586(Object obj, int i) {
        if (C0084.m3253() <= 0) {
            ((ActionBarContextView) obj).setContentHeight(i);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static y5 m9587(Object obj) {
        if (C0217.m8693() <= 0) {
            return ((k3) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۨ۠, reason: not valid java name and contains not printable characters */
    public static Context m9588(Object obj) {
        if (C0049.m1767() <= 0) {
            return ((p) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۡۢ, reason: not valid java name and contains not printable characters */
    public static void m9589(Object obj) {
        if (C0199.m7998() <= 0) {
            ((m2) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡ۠, reason: not valid java name and contains not printable characters */
    public static float m9590(Object obj) {
        if (C0058.m2184() >= 0) {
            return ((DragEvent) obj).getX();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥۧ, reason: not valid java name and contains not printable characters */
    public static ContentInfo m9591(Object obj) {
        if (C0149.m6476() <= 0) {
            return ((ContentInfo.Builder) obj).build();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۦۣ, reason: not valid java name and contains not printable characters */
    public static Insets m9592(Object obj) {
        if (C0215.m8604() <= 0) {
            return ((dd) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static void m9593(Object obj, Object obj2) {
        if (C0178.m7344() < 0) {
            ((LinearLayout) obj).setLayoutParams((ViewGroup.LayoutParams) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۥۥ, reason: not valid java name and contains not printable characters */
    public static boolean m9594(Object obj, Object obj2, Object obj3) {
        if (C0047.m1663() < 0) {
            return ((o9) obj).a((View) obj2, (MotionEvent) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۣۨۦ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m9595(Object obj, int i) {
        if (C0233.m9365() <= 0) {
            return ((MediaCodec) obj).getInputBuffer(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۤۧ, reason: not valid java name and contains not printable characters */
    public static File m9596() {
        if (C0211.m8341() > 0) {
            return Environment.getExternalStorageDirectory();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۨۧ, reason: not valid java name and contains not printable characters */
    public static wr.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m9597() {
        if (C0047.m1663() < 0) {
            return wr.M();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۢۥ, reason: not valid java name and contains not printable characters */
    public static void m9598(Object obj) {
        if (C0014.m545() >= 0) {
            ((VideoToFrames) obj).stopDecode();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۥۤۢ, reason: not valid java name and contains not printable characters */
    public static boolean m9599(Object obj) {
        if (C0187.m7613() >= 0) {
            return ((HookMain) obj).need_to_show_toast;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۥۦ, reason: not valid java name and contains not printable characters */
    public static boolean m9600(Object obj) {
        if (C0118.m4454() > 0) {
            return ((x.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۨۡ, reason: not valid java name and contains not printable characters */
    public static v0.e m9601(Object obj) {
        if (C0116.m4340() > 0) {
            return ((v0) obj).h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۤ, reason: not valid java name and contains not printable characters */
    public static WindowManager.LayoutParams m9602(Object obj) {
        if (C0084.m3253() < 0) {
            return ((Menu.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static String m9603(String str) {
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

    /* JADX INFO: renamed from: ۟ۧۦ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m9604(Object obj, Object obj2) {
        if (C0232.m9299() > 0) {
            C0126.m4868((ConnectionBlocker) obj, (ConnectionBlocker.NetworkLog) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۧ۠, reason: not valid java name and contains not printable characters */
    public static void m9605(Object obj, Object obj2) {
        if (C0215.m8604() < 0) {
            ((a9) obj).k((ClassLoader) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static MediaPlayer m9606() {
        if (C0070.m2829() <= 0) {
            return HookMain.c2_player_1;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۦۢ, reason: not valid java name and contains not printable characters */
    public static View m9607(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0128.m5064() <= 0) {
            return ((xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).onCreateView((View) obj2, (String) obj3, (Context) obj4, (AttributeSet) obj5);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static void m9608(Object obj, long j) {
        if (C0024.m896() >= 0) {
            r8.i((OutputStream) obj, j);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static int[] m9609(Object obj, Object obj2) {
        if (C0072.m2856() <= 0) {
            return ((l1) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((int[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۤۥ, reason: not valid java name and contains not printable characters */
    public static Keyframe m9610(Object obj, Object obj2, Object obj3, Object obj4, int i, Object obj5) {
        if (C0096.m3601() < 0) {
            return m0.e((Context) obj, (Resources) obj2, (Resources.Theme) obj3, (AttributeSet) obj4, i, (XmlPullParser) obj5);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۥ۠, reason: not valid java name and contains not printable characters */
    public static void m9611(Object obj) throws IOException {
        if (C0181.m7445() >= 0) {
            ((uc) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۡۡۤ۠, reason: not valid java name and contains not printable characters */
    public static HookMain.u m9612(Object obj) {
        if (C0201.m8184() <= 0) {
            return ((kc) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۥ۟, reason: not valid java name and contains not printable characters */
    public static int m9613(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡۧۧ, reason: not valid java name and contains not printable characters */
    public static int m9614(int i) {
        if (C0162.m6837() <= 0) {
            return Color.blue(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۨ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m9615() {
        return (-760) ^ C0171.f621;
    }

    /* JADX INFO: renamed from: ۢۤۤۧ, reason: not valid java name and contains not printable characters */
    public static String m9617(Object obj, Object obj2) {
        if (C0026.m1047() >= 0) {
            return ((Matcher) obj).replaceAll((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۥۡ, reason: not valid java name and contains not printable characters */
    public static int m9618(Object obj) {
        if (C0211.m8341() >= 0) {
            return ((gd) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۤۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m9619() {
        if (C0214.m8575() <= 0) {
            return wr.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۦۢۢ, reason: not valid java name and contains not printable characters */
    public static FontFamily.Builder m9620(Object obj, Object obj2) {
        if (C0182.m7528() < 0) {
            return ((FontFamily.Builder) obj).addFont((Font) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۨ, reason: not valid java name and contains not printable characters */
    public static void m9621(Object obj, Object obj2) {
        if (C0021.m740() <= 0) {
            ((xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((a.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static void m9622(Object obj, boolean z) {
        if (C0021.m740() <= 0) {
            ((Window.Callback) obj).onPointerCaptureChanged(z);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m9623(Object obj) {
        if (C0164.m6900() < 0) {
            return ((fi) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۥۨ, reason: not valid java name and contains not printable characters */
    public static TypedValue m9624(Object obj) {
        if (C0051.m1783() < 0) {
            return ((ContentFrameLayout) obj).getFixedWidthMinor();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۟, reason: not valid java name and contains not printable characters */
    public static int m9625(Object obj) {
        if (C0021.m740() <= 0) {
            return ((qo) obj).t;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۧ۟, reason: not valid java name and contains not printable characters */
    public static Bundle m9626(Object obj) {
        if (C0106.m3835() > 0) {
            return ((x9) obj).e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۡۧ, reason: not valid java name and contains not printable characters */
    public static Type[] m9627(Object obj) {
        if (C0148.m6464() <= 0) {
            return ((Class) obj).getGenericInterfaces();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۦۣ, reason: not valid java name and contains not printable characters */
    public static void m9628(Object obj, Object obj2) {
        if (C0176.m7290() >= 0) {
            ((uo.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((AttributeSet) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۨۡۤ, reason: not valid java name and contains not printable characters */
    public static Drawable[] m9629(Object obj) {
        if (C0231.m9265() > 0) {
            return ((TextView) obj).getCompoundDrawables();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۦۢ, reason: contains not printable characters */
    public static void m9630(Object obj) {
        if (C0009.m276() < 0) {
            ((ActionBarContextView) obj).c();
        }
    }

    /* JADX INFO: renamed from: ۥۡۢۤ, reason: contains not printable characters */
    public static boolean m9631(Object obj, Object obj2) {
        if (C0066.m2514() > 0) {
            return lg.b((Map) obj, (Collection) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۡۥۢ, reason: contains not printable characters */
    public static String m9632(Object obj) {
        if (C0025.m934() > 0) {
            return Arrays.toString((Object[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۣۢ, reason: contains not printable characters */
    public static void m9633(Object obj, Object obj2) {
        if (C0201.m8184() < 0) {
            ((u0) obj).p((Bundle) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۥۦۡ, reason: contains not printable characters */
    public static int m9634(Object obj) {
        if (C0171.m7136() < 0) {
            return ((ViewGroup.LayoutParams) obj).width;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۣۧ۠, reason: contains not printable characters */
    public static PorterDuffColorFilter m9635(Object obj) {
        if (C0062.m2326() > 0) {
            return ((pr) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۧۧ, reason: contains not printable characters */
    public static PorterDuffColorFilter m9636(int i, Object obj) {
        if (C0052.m1890() >= 0) {
            return hm.d(i, (PorterDuff.Mode) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠۟ۥ, reason: contains not printable characters */
    public static boolean m9637(Object obj, Object obj2) {
        if (C0141.m5769() >= 0) {
            return ((View) obj).post((Runnable) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static MenuItem m9638(Object obj, int i) {
        if (C0178.m7344() <= 0) {
            return ((MenuItem) obj).setTitle(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m9639(int i) {
        if (C0055.m2054() >= 0) {
            return m7.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static void m9640(Object obj, Object obj2) {
        if (C0096.m3601() < 0) {
            ((v0) obj).U0((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧۡۥ۟, reason: not valid java name and contains not printable characters */
    public static int m9641(Object obj) {
        if (C0127.m4950() > 0) {
            return Integer.parseInt((String) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m9642(Object obj) {
        if (C0200.m8104() <= 0) {
            return ((xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).getSignature();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static void m9643(Object obj, Object obj2) {
        if (C0224.m8861() <= 0) {
            ((i) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((i.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۤۦۦ, reason: not valid java name and contains not printable characters */
    public static void m9644(Object obj, Object obj2) {
        if (C0182.m7528() <= 0) {
            ((View) obj).getLocationOnScreen((int[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۦۡۧ, reason: not valid java name and contains not printable characters */
    public static int m9645(Object obj) {
        if (C0135.m5274() < 0) {
            return ((sr) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۦۤ۟, reason: not valid java name and contains not printable characters */
    public static l2 m9646(Object obj) {
        if (C0224.m8861() < 0) {
            return l2.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۢۤ, reason: not valid java name and contains not printable characters */
    public static ColorFilter m9647(Object obj) {
        if (C0232.m9299() > 0) {
            return ((pr) obj).getColorFilter();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۡۧ, reason: not valid java name and contains not printable characters */
    public static String m9616(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
