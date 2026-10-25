package androidx.core.widget;

import android.app.Activity;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.IntentSender;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.media.MediaCodecInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0011;
import android.text.Layout;
import android.text.StaticLayout;
import android.util.AttributeSet;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import android.view.inputmethod.EditorInfo;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.activity.C0014;
import androidx.annotation.C0026;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0035;
import androidx.appcompat.app.C0036;
import androidx.appcompat.app.C0037;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.view.menu.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0047;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.C0052;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0065;
import androidx.drawerlayout.widget.C0070;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0079;
import androidx.emoji2.text.C0083;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0097;
import androidx.fragment.app.C0099;
import androidx.fragment.app.a;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0119;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0122;
import androidx.savedstate.C0127;
import androidx.versionedparcelable.C0129;
import androidx.versionedparcelable.C0135;
import com.example.vcam.C0141;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.HookMain;
import com.example.vcam.Menu;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.c7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ck;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ep;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.id;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.li;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ne;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.nm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.og;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.on;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qi;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ws;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zs;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import okhttp3.C0238;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.internal.C0227;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.internal.ws.C0224;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0233;
import okhttp3.logging.C0234;
import okhttp3.logging.C0235;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import retrofit2.converter.scalars.C0243;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: androidx.core.widget.ۢ۟ۨۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0069 {

    /* JADX INFO: renamed from: ۣۣ۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static int f63 = -335;

    /* JADX INFO: renamed from: ۟۟۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static dp m2672(Object obj, boolean z) {
        if (C0070.m2829() < 0) {
            return ((f6.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۧۤ, reason: not valid java name and contains not printable characters */
    public static Context m2673(Object obj) {
        if (C0200.m8104() < 0) {
            return ((n1) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢ۟۠, reason: not valid java name and contains not printable characters */
    public static boolean m2674(Object obj) {
        if (C0240.m9826() >= 0) {
            return ((Activity) obj).isChild();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int[] m2675(Object obj) {
        if (C0225.m9001() >= 0) {
            return ((pr.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static s6 m2676(Object obj) {
        if (C0243.m9964() >= 0) {
            return ((Toolbar) obj).getWrapper();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۡۥ, reason: not valid java name and contains not printable characters */
    public static int m2677(int i, int i2, int i3) {
        if (C0062.m2326() > 0) {
            return fl.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, i2, i3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static boolean m2678(Object obj, Object obj2, int i, Object obj3) {
        if (C0127.m4950() > 0) {
            return h.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View.AccessibilityDelegate) obj, (View) obj2, i, (Bundle) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠۠, reason: not valid java name and contains not printable characters */
    public static int m2679(int i, int i2) {
        if (C0065.m2448() >= 0) {
            return vk.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۢۤۧ, reason: not valid java name and contains not printable characters */
    public static void m2680(Object obj, int i, float f) {
        if (C0074.m2951() <= 0) {
            ((l1) obj).l(i, f);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۤۢۦ, reason: not valid java name and contains not printable characters */
    public static l1.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m2681(Object obj) {
        if (C0052.m1890() >= 0) {
            return ((l1) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static Class m2682() {
        if (C0181.m7445() >= 0) {
            return Integer.TYPE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۤ, reason: not valid java name and contains not printable characters */
    public static String m2683(Object obj, Object obj2, Object obj3) {
        if (C0135.m5274() <= 0) {
            return ((JSONObject) obj).optString((String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۨ, reason: not valid java name and contains not printable characters */
    public static xd m2684(Object obj) {
        if (C0191.m7812() > 0) {
            return ((xd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۡ, reason: not valid java name and contains not printable characters */
    public static int m2685(int i) {
        if (C0079.m3072() <= 0) {
            return Character.charCount(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۨۢۦ, reason: not valid java name and contains not printable characters */
    public static AtomicReferenceFieldUpdater m2686(Object obj, Object obj2, Object obj3) {
        if (C0036.m1332() <= 0) {
            return AtomicReferenceFieldUpdater.newUpdater((Class) obj, (Class) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static void m2687(Object obj, Object obj2, Object obj3, Object obj4) throws XmlPullParserException, IOException {
        if (C0094.m3450() > 0) {
            ((Drawable) obj).inflate((Resources) obj2, (XmlPullParser) obj3, (AttributeSet) obj4);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۢۨ۠, reason: not valid java name and contains not printable characters */
    public static Menu m2688(Object obj) {
        if (C0099.m3752() < 0) {
            return ((Menu.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤۢ, reason: not valid java name and contains not printable characters */
    public static Set m2689(Object obj) {
        if (C0149.m6476() <= 0) {
            return ((n1) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧۤ, reason: not valid java name and contains not printable characters */
    public static void m2690(Object obj, Object obj2) {
        if (C0164.m6900() <= 0) {
            ((ProgressBar) obj).setIndeterminateDrawable((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۦ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m2691(Object obj, Object obj2) {
        if (C0238.m9653() >= 0) {
            ((Throwable) obj).setStackTrace((StackTraceElement[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۦۥۣ, reason: not valid java name and contains not printable characters */
    public static int m2692(int i, int i2) {
        if (C0141.m5769() >= 0) {
            return tl.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static Map m2693() {
        if (m2756() <= 0) {
            return og.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static String m2694(Object obj) {
        if (C0129.m5108() > 0) {
            return ((k3) obj).l();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static void m2695(Object obj) {
        if (C0164.m6900() <= 0) {
            ((v0) obj).l0();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۡۧۥ, reason: not valid java name and contains not printable characters */
    public static StaticLayout.Builder m2696(Object obj, Object obj2) {
        if (C0006.m169() <= 0) {
            return ((StaticLayout.Builder) obj).setAlignment((Layout.Alignment) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۢۡۧ, reason: not valid java name and contains not printable characters */
    public static boolean m2697(Object obj) {
        if (C0097.m3659() >= 0) {
            return wr.v((View) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۣۢ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m2698(Object obj, Object obj2) {
        if (C0233.m9365() < 0) {
            return ((z0.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۥ۠, reason: not valid java name and contains not printable characters */
    public static float m2699(Object obj) {
        if (C0079.m3072() <= 0) {
            return ((qm) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۥۣۥۦ, reason: not valid java name and contains not printable characters */
    public static void m2700(Object obj, Object obj2) {
        if (C0238.m9653() >= 0) {
            C0074.m2938((HookMain) obj, (Context) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۤۤ۟, reason: not valid java name and contains not printable characters */
    public static void m2701(Object obj, Object obj2) {
        if (C0240.m9826() > 0) {
            ((ViewTreeObserver) obj).addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۨۨۡ, reason: not valid java name and contains not printable characters */
    public static int m2702(Object obj, long j) {
        if (C0148.m6464() <= 0) {
            return ((s2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(j);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۡۥۡ, reason: not valid java name and contains not printable characters */
    public static Object m2703(Object obj, Object obj2) {
        if (C0219.m8794() >= 0) {
            return ((yf) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۢۤ, reason: not valid java name and contains not printable characters */
    public static int m2704(Object obj) {
        if (C0148.m6464() <= 0) {
            return ((AtomicReferenceArray) obj).length();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۣۡ, reason: not valid java name and contains not printable characters */
    public static xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m2705(Object obj) {
        if (C0035.m1268() <= 0) {
            return ((ws.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m2706(Object obj, Object obj2, int i) {
        if (C0249.m10052() < 0) {
            return ((u7) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((MotionEvent) obj2, i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۡ۟۠, reason: not valid java name and contains not printable characters */
    public static byte[][] m2707(Object obj) {
        if (C0093.m3365() > 0) {
            return ((fn) obj).q();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡ۠۠, reason: not valid java name and contains not printable characters */
    public static Uri.Builder m2708(Object obj, Object obj2) {
        if (C0217.m8693() < 0) {
            return ((Uri.Builder) obj).query((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۣ, reason: not valid java name and contains not printable characters */
    public static int m2709(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۨۨ۠, reason: not valid java name and contains not printable characters */
    public static boolean m2710(Object obj, Object obj2, Object obj3) {
        if (C0238.m9653() >= 0) {
            return ((a) obj).r((android.view.Menu) obj2, (MenuInflater) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m2711(Object obj, Object obj2, Object obj3) {
        if (C0141.m5769() >= 0) {
            ((ConnectionBlocker.ConnectionBlockerCallback) obj).onRuleTriggered((ConnectionBlocker.BlockRule) obj2, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static a6 m2712() {
        if (C0036.m1332() <= 0) {
            return n7.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۡ۟, reason: not valid java name and contains not printable characters */
    public static ActionBarContextView m2713(Object obj) {
        if (C0234.m9461() < 0) {
            return ((v0) obj).q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۤۧ, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m2714() {
        if (C0031.m1148() <= 0) {
            return PorterDuff.Mode.SRC_IN;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static MenuItem m2715(Object obj, char c, int i) {
        if (C0204.m8270() <= 0) {
            return ((MenuItem) obj).setAlphabeticShortcut(c, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۥۧ, reason: not valid java name and contains not printable characters */
    public static boolean m2716(Object obj) {
        if (C0083.m3188() < 0) {
            return ((li) obj).e();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۢ۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m2717(Object obj) {
        if (C0047.m1663() <= 0) {
            return ((l2.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۢ۟, reason: not valid java name and contains not printable characters */
    public static long m2718(Object obj) {
        if (C0149.m6476() < 0) {
            return ((f6.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۧۢۡ, reason: not valid java name and contains not printable characters */
    public static Object m2719(Object obj) {
        if (C0097.m3659() > 0) {
            return nm.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m2720(Object obj, Object obj2) {
        if (C0235.m9535() < 0) {
            ((qq) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Location) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۢ۠۟, reason: not valid java name and contains not printable characters */
    public static IntentSender m2721(Object obj) {
        if (C0006.m169() < 0) {
            return ((id) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۡ, reason: not valid java name and contains not printable characters */
    public static k6 m2722(Object obj) {
        if (C0011.m458() >= 0) {
            return k6.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۨۨ, reason: not valid java name and contains not printable characters */
    public static c7 m2723() {
        if (C0115.m4218() <= 0) {
            return v6.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۨۨ, reason: not valid java name and contains not printable characters */
    public static qi.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m2724(Object obj) {
        if (C0219.m8794() > 0) {
            return qi.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((qi.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۡۦ, reason: not valid java name and contains not printable characters */
    public static dp m2725(Object obj, Object obj2, boolean z) {
        if (C0217.m8693() < 0) {
            return ((zs) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((dp) obj2, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣ, reason: not valid java name and contains not printable characters */
    public static void m2726(Object obj, Object obj2, boolean z) {
        if (C0201.m8184() < 0) {
            Menu.m5598((Menu) obj, (CompoundButton) obj2, z);
        }
    }

    /* JADX INFO: renamed from: ۣۣۨۢ, reason: not valid java name and contains not printable characters */
    public static void m2727(Object obj, Object obj2, int i, Object obj3) {
        if (C0093.m3365() >= 0) {
            ((ConnectionBlocker.ConnectionBlockerCallback) obj).onConnectionBlocked((String) obj2, i, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣۥۤ۟, reason: not valid java name and contains not printable characters */
    public static void m2728(Object obj, Object obj2) {
        if (C0122.m4736() <= 0) {
            ((TextView) obj).setCompoundDrawableTintList((ColorStateList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۧۨۥ, reason: not valid java name and contains not printable characters */
    public static Context m2729(Object obj) {
        if (C0120.m4608() > 0) {
            return ((ws.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static int m2730(Object obj) {
        if (C0224.m8861() < 0) {
            return ((sm) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۥ۠ۨ, reason: not valid java name and contains not printable characters */
    public static Set m2731() {
        if (C0202.m8245() > 0) {
            return on.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۦۥ, reason: not valid java name and contains not printable characters */
    public static void m2732(Object obj, Object obj2) {
        if (C0171.m7136() <= 0) {
            Menu.m5578((Menu) obj, (View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۡۧ۟, reason: contains not printable characters */
    public static long m2734(long j, long j2) {
        if (C0026.m1047() >= 0) {
            return Math.min(j, j2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۢۡۥ, reason: contains not printable characters */
    public static int m2735(Object obj) {
        if (C0065.m2448() > 0) {
            return ((l1) obj).b();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۤۡۨ, reason: contains not printable characters */
    public static Object m2736(Object obj, Object obj2) {
        if (C0240.m9826() > 0) {
            return ((Context) obj).getSystemService((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۢۡ, reason: contains not printable characters */
    public static String m2737(String str) {
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

    /* JADX INFO: renamed from: ۥۧۥۨ, reason: contains not printable characters */
    public static int m2738(Object obj, int i, float f) {
        if (C0227.m9046() > 0) {
            return mp.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj, i, f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦ۠ۨۤ, reason: contains not printable characters */
    public static jk m2739(Object obj, Object obj2, int i, boolean z, boolean z2) {
        if (C0200.m8104() <= 0) {
            return C0224.m8914((CharSequence) obj, (Collection) obj2, i, z, z2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۢۥ, reason: contains not printable characters */
    public static mk.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa[] m2740(Object obj) {
        if (C0070.m2829() <= 0) {
            return ((pr.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۢۡ, reason: contains not printable characters */
    public static dd m2741() {
        if (C0135.m5274() < 0) {
            return dd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦ۠۟, reason: contains not printable characters */
    public static Field m2742() {
        if (C0201.m8184() <= 0) {
            return ne.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦ۠ۢ, reason: contains not printable characters */
    public static boolean m2743(Object obj, Object obj2) {
        if (C0099.m3752() < 0) {
            return ((Canvas) obj).clipPath((Path) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static h2 m2744(Object obj) {
        if (C0078.m3044() <= 0) {
            return ((ck) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static int m2745(Object obj) {
        if (C0233.m9365() < 0) {
            return ((ViewConfiguration) obj).getScaledTouchSlop();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۡۢۧ, reason: not valid java name and contains not printable characters */
    public static String m2746(Object obj) {
        if (C0122.m4736() < 0) {
            return ((SearchableInfo) obj).getSuggestPath();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۥۢ, reason: not valid java name and contains not printable characters */
    public static void m2747(Object obj, Object obj2) {
        if (C0062.m2326() > 0) {
            y7.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((EditorInfo) obj, (CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧۥۦ۠, reason: not valid java name and contains not printable characters */
    public static Handler m2748(Object obj) {
        if (C0031.m1148() <= 0) {
            return ((y8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int[] m2749(Object obj) {
        if (C0188.m7736() <= 0) {
            return ((MediaCodecInfo.CodecCapabilities) obj).colorFormats;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۥ۠, reason: not valid java name and contains not printable characters */
    public static String m2750(Object obj) {
        if (C0249.m10052() <= 0) {
            return ((sr) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۡ۠, reason: not valid java name and contains not printable characters */
    public static Context m2751(Object obj) {
        if (C0014.m545() > 0) {
            return ((p2) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۢۢ, reason: not valid java name and contains not printable characters */
    public static Appendable m2752(Object obj, Object obj2) {
        if (C0162.m6837() < 0) {
            return ((Appendable) obj).append((CharSequence) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۥ۠, reason: not valid java name and contains not printable characters */
    public static Matrix m2753(Object obj) {
        if (C0119.m4573() >= 0) {
            return ((pr.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۨ, reason: not valid java name and contains not printable characters */
    public static int m2754(Object obj) {
        if (C0181.m7445() > 0) {
            return ((MenuItem) obj).getOrder();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۦۡ۠, reason: not valid java name and contains not printable characters */
    public static int m2755(Object obj) {
        if (C0119.m4573() > 0) {
            return ((f8) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۧ۠۟, reason: not valid java name and contains not printable characters */
    public static int m2756() {
        return 122 ^ C0037.f35;
    }

    /* JADX INFO: renamed from: ۨۨۥ۠, reason: not valid java name and contains not printable characters */
    public static dp m2757(Object obj, Object obj2, Object obj3) {
        if (C0040.m1622() <= 0) {
            return ((f6) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Runnable) obj2, (ep) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۡۤ, reason: contains not printable characters */
    public static String m2733(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
