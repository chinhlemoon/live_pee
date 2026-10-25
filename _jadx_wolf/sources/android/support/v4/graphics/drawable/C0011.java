package android.support.v4.graphics.drawable;

import android.animation.Keyframe;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.FontStyle;
import android.media.MediaExtractor;
import android.support.v4.app.C0004;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.ActionProvider;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.AbsListView;
import android.widget.CompoundButton;
import androidx.activity.C0014;
import androidx.activity.C0021;
import androidx.annotation.C0023;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0035;
import androidx.appcompat.app.C0037;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0051;
import androidx.core.app.C0055;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.C0064;
import androidx.core.graphics.drawable.C0065;
import androidx.core.widget.C0068;
import androidx.drawerlayout.widget.C0070;
import androidx.emoji2.text.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0096;
import androidx.lifecycle.C0107;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0118;
import androidx.savedstate.C0122;
import androidx.savedstate.C0126;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0133;
import com.example.vcam.C0141;
import com.example.vcam.MainActivity;
import com.example.vcam.Menu;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.an;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.b1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.b3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.g7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.im;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kb;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ne;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z1;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.WeakHashMap;
import okhttp3.HttpUrl;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.ws.C0224;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0234;
import okhttp3.logging.C0235;
import okhttp3.logging.C0236;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import retrofit2.C0259;
import retrofit2.converter.scalars.C0243;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: android.support.v4.graphics.drawable.۟ۢۥۣۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0011 {

    /* JADX INFO: renamed from: ۟ۢۤۦ۠, reason: not valid java name and contains not printable characters */
    public static int f11 = 201;

    /* JADX INFO: renamed from: ۟۟۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static int m405(Object obj, int i) {
        if (C0051.m1783() <= 0) {
            return ContextCompat.getColor((Context) obj, i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۢۧۢ, reason: not valid java name and contains not printable characters */
    public static WeakReference m406(Object obj) {
        if (C0118.m4454() >= 0) {
            return ((yn) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static boolean m407(Object obj) {
        if (C0224.m8861() <= 0) {
            return ((ListIterator) obj).hasPrevious();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۦۣۡ, reason: not valid java name and contains not printable characters */
    public static boolean m408(Object obj) {
        if (C0037.m1437() < 0) {
            return ((File) obj).createNewFile();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static boolean m409(Object obj) {
        if (C0021.m740() <= 0) {
            return ((kb) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۥ۠, reason: not valid java name and contains not printable characters */
    public static Resources.Theme m410(Object obj) {
        if (C0214.m8575() < 0) {
            return ((im.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m411(Object obj, int i) {
        if (C0065.m2448() > 0) {
            return ((Resources) obj).getBoolean(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۢۢۨ, reason: not valid java name and contains not printable characters */
    public static int m412(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۢۨ۠, reason: not valid java name and contains not printable characters */
    public static Typeface.CustomFallbackBuilder m413(Object obj, Object obj2) {
        if (C0236.m9615() > 0) {
            return ((Typeface.CustomFallbackBuilder) obj).setStyle((FontStyle) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟۟۠, reason: not valid java name and contains not printable characters */
    public static String m414(Object obj) {
        if (C0065.m2448() > 0) {
            return ((an) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static void m415(Object obj, Object obj2) {
        if (C0200.m8104() < 0) {
            Menu.m5635((Menu) obj, (View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m416(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0128.m5064() < 0) {
            return m4.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Resources) obj, (XmlPullParser) obj2, (AttributeSet) obj3, (Resources.Theme) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static pq m417() {
        if (C0070.m2829() <= 0) {
            return pq.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static String m418(String str) {
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
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str2.charAt(i3 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = HttpUrl.FRAGMENT_ENCODE_SET.length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥۢ, reason: not valid java name and contains not printable characters */
    public static void m419(Object obj) {
        if (C0021.m740() <= 0) {
            ((xf) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨۥ, reason: not valid java name and contains not printable characters */
    public static Drawable m421(Object obj, int i) {
        if (C0094.m3450() >= 0) {
            return ContextCompat.getDrawable((Context) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۤۥ, reason: not valid java name and contains not printable characters */
    public static r m422(Object obj) {
        if (C0068.m2650() > 0) {
            return ((uo.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۥۧ, reason: not valid java name and contains not printable characters */
    public static List m423(Object obj) {
        if (C0141.m5769() > 0) {
            return ((AccessibilityEvent) obj).getText();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۢۧ, reason: not valid java name and contains not printable characters */
    public static WeakHashMap m424(Object obj) {
        if (C0202.m8245() > 0) {
            return ((hm) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int[] m425() {
        if (C0023.m843() >= 0) {
            return i0.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static Keyframe m426(float f) {
        if (C0187.m7613() > 0) {
            return Keyframe.ofInt(f);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧ۠, reason: not valid java name and contains not printable characters */
    public static CharSequence m427(Object obj) {
        if (C0035.m1268() < 0) {
            return ((p) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۤۥ, reason: not valid java name and contains not printable characters */
    public static void m428(Object obj, Object obj2, Object obj3, int i, int i2, int i3, int i4) {
        if (C0055.m2054() >= 0) {
            ((SpanWatcher) obj).onSpanChanged((Spannable) obj2, obj3, i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static h8 m429(Object obj) {
        if (C0201.m8184() <= 0) {
            return ((b1) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static float[] m430(Object obj) {
        if (C0225.m9001() >= 0) {
            return ((m2) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥ۠۠, reason: not valid java name and contains not printable characters */
    public static void m431(Object obj, int i) {
        if (C0178.m7344() < 0) {
            ((ViewGroup) obj).setBackgroundResource(i);
        }
    }

    /* JADX INFO: renamed from: ۡۡۧۢ, reason: not valid java name and contains not printable characters */
    public static char[] m432() {
        if (C0176.m7290() > 0) {
            return b3.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨ۟, reason: not valid java name and contains not printable characters */
    public static boolean m433(Object obj) {
        if (C0064.m2388() > 0) {
            return ((MediaExtractor) obj).advance();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۤۦۦ, reason: not valid java name and contains not printable characters */
    public static void m434(Object obj, Object obj2, Object obj3) {
        if (C0068.m2650() > 0) {
            ((i7) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj2, (Throwable) obj3);
        }
    }

    /* JADX INFO: renamed from: ۢۧۡ۠, reason: not valid java name and contains not printable characters */
    public static void m435(Object obj) {
        if (C0049.m1767() < 0) {
            ((MainActivity) obj).n0();
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static boolean m436(Object obj, Object obj2, int i) {
        if (C0235.m9535() < 0) {
            return ((z0.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((int[]) obj2, i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m437(Object obj, Object obj2) {
        if (C0004.m139() <= 0) {
            ((ActionProvider) obj).setVisibilityListener((ActionProvider.VisibilityListener) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۤۥۡ, reason: not valid java name and contains not printable characters */
    public static void m438(Object obj, int i) {
        if (C0126.m4908() <= 0) {
            ((View) obj).setAccessibilityLiveRegion(i);
        }
    }

    /* JADX INFO: renamed from: ۣۤۨ۠, reason: not valid java name and contains not printable characters */
    public static void m439(Object obj, boolean z) {
        if (C0225.m9001() > 0) {
            ((Drawable) obj).setAutoMirrored(z);
        }
    }

    /* JADX INFO: renamed from: ۤ۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m440(Object obj, Object obj2) {
        if (C0031.m1148() < 0) {
            return ((ne.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).a((KeyEvent) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤۡۡ, reason: not valid java name and contains not printable characters */
    public static Object m441(Object obj) {
        if (C0014.m545() >= 0) {
            return ((r4) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۥۢ, reason: not valid java name and contains not printable characters */
    public static void m442(Object obj, boolean z) {
        if (C0014.m545() >= 0) {
            ((Paint) obj).setFilterBitmap(z);
        }
    }

    /* JADX INFO: renamed from: ۤۤۤۨ, reason: not valid java name and contains not printable characters */
    public static long m443(Object obj) {
        if (C0148.m6464() <= 0) {
            return ((g7) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥ۠ۦۥ, reason: contains not printable characters */
    public static void m444(Object obj, Object obj2, int i, int i2, Object obj3) {
        if (C0122.m4736() < 0) {
            ((Paint) obj).getTextBounds((String) obj2, i, i2, (Rect) obj3);
        }
    }

    /* JADX INFO: renamed from: ۥۡ, reason: contains not printable characters */
    public static boolean m445(Object obj, Object obj2) {
        if (C0172.m7180() >= 0) {
            return ((Collection) obj).removeAll((Collection) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۡۥۤ, reason: contains not printable characters */
    public static int m446() {
        if (C0215.m8604() <= 0) {
            return z1.e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۦ۠ۦ, reason: contains not printable characters */
    public static void m447(Object obj, Object obj2) {
        if (C0009.m276() <= 0) {
            ((View) obj).onInitializeAccessibilityEvent((AccessibilityEvent) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۦۦۢ, reason: contains not printable characters */
    public static void m448(Object obj, boolean z) {
        if (C0096.m3601() <= 0) {
            ((AbsListView) obj).setSelectedChildViewEnabled(z);
        }
    }

    /* JADX INFO: renamed from: ۥۣۨۤ, reason: contains not printable characters */
    public static JSONObject m449(Object obj, Object obj2, long j) {
        if (C0235.m9535() < 0) {
            return ((JSONObject) obj).put((String) obj2, j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۧۧ, reason: contains not printable characters */
    public static boolean m450(Object obj, Object obj2, long j) {
        if (C0243.m9964() >= 0) {
            return ((View) obj).postDelayed((Runnable) obj2, j);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦ۠ۨۧ, reason: contains not printable characters */
    public static void m451(Object obj, Object obj2) {
        if (C0128.m5064() < 0) {
            v0.i.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ContextThemeWrapper) obj, (Configuration) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧۢۡ, reason: not valid java name and contains not printable characters */
    public static Locale m452(Object obj) {
        if (C0113.m4144() < 0) {
            return k1.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۢۤ, reason: not valid java name and contains not printable characters */
    public static void m453(Object obj, int i) {
        if (C0249.m10052() <= 0) {
            ((Thread) obj).setPriority(i);
        }
    }

    /* JADX INFO: renamed from: ۧۤۡ, reason: not valid java name and contains not printable characters */
    public static jj m454(Object obj, Object obj2) {
        if (C0023.m843() >= 0) {
            return ((xd) obj).s((sc) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥ۠۠, reason: not valid java name and contains not printable characters */
    public static void m455(Object obj, Object obj2) {
        if (C0122.m4736() < 0) {
            ((xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).l((EditorInfo) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧۥۧۤ, reason: not valid java name and contains not printable characters */
    public static Object m456(Object obj, int i) {
        if (C0133.m5208() <= 0) {
            return ((xf) obj).c(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۢ, reason: not valid java name and contains not printable characters */
    public static void m457(Object obj, Object obj2) {
        if (C0107.m3883() > 0) {
            ((z0) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨ۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static int m458() {
        return 900 ^ C0094.f81;
    }

    /* JADX INFO: renamed from: ۨۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m459(Object obj) {
        if (C0161.m6744() >= 0) {
            return ((CompoundButton) obj).getButtonTintMode();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۣ۟, reason: not valid java name and contains not printable characters */
    public static boolean m460(Object obj, Object obj2, int i, int i2, boolean z) {
        if (C0234.m9461() < 0) {
            return vq.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj, (ByteBuffer) obj2, i, i2, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۨۥۢ, reason: not valid java name and contains not printable characters */
    public static int m461(Object obj, Object obj2, int i, boolean z) {
        if (C0259.m10136() >= 0) {
            return mo.C((CharSequence) obj, (String) obj2, i, z);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static String m420(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
