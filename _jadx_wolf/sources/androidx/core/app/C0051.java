package androidx.core.app;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObservable;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.FontFamily;
import android.hardware.Camera;
import android.location.Location;
import android.os.Bundle;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0011;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.view.CollapsibleActionView;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityRecord;
import android.view.animation.Interpolator;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.activity.C0020;
import androidx.annotation.C0024;
import androidx.annotation.C0025;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0035;
import androidx.appcompat.app.C0036;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.C0047;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.cardview.widget.C0049;
import androidx.core.content.C0057;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0066;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0072;
import androidx.emoji2.text.C0078;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0096;
import androidx.lifecycle.C0108;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0118;
import androidx.profileinstaller.C0119;
import androidx.savedstate.C0122;
import androidx.savedstate.C0123;
import androidx.savedstate.C0126;
import androidx.savedstate.C0127;
import com.example.vcam.HookMain;
import com.example.vcam.LicenseManager;
import com.example.vcam.Menu;
import com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bt;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.js;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ki;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.zip.DataFormatException;
import okhttp3.C0238;
import okhttp3.C0239;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.internal.ws.C0224;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0232;
import okhttp3.logging.C0236;
import org.xmlpull.v1.XmlPullParser;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: androidx.core.app.۟۠۟۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0051 {

    /* JADX INFO: renamed from: ۣۣ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int f45 = 872;

    /* JADX INFO: renamed from: ۣ۟۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static int m1778(Object obj) {
        if (C0024.m896() >= 0) {
            return ((TextView) obj).getMeasuredHeight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۧۢۢ, reason: not valid java name and contains not printable characters */
    public static int m1779(Object obj) {
        if (C0047.m1663() < 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).h;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۨۡ۟, reason: not valid java name and contains not printable characters */
    public static boolean m1780(Object obj, Object obj2, Object obj3) {
        if (C0181.m7445() > 0) {
            return ((wr.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Boolean) obj2, (Boolean) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۨۨ۟, reason: not valid java name and contains not printable characters */
    public static xp m1781(Object obj) {
        if (C0078.m3044() <= 0) {
            return ((d1) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۟۠, reason: not valid java name and contains not printable characters */
    public static void m1782(Object obj, Object obj2) {
        if (C0236.m9615() >= 0) {
            ((FrameLayout) obj).addView((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠۠۟, reason: not valid java name and contains not printable characters */
    public static int m1783() {
        return (-784) ^ C0232.f682;
    }

    /* JADX INFO: renamed from: ۟۠ۡۤۡ, reason: not valid java name and contains not printable characters */
    public static Object[] m1784(Object obj) {
        if (C0127.m4950() > 0) {
            return ((xf) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۦۨ, reason: not valid java name and contains not printable characters */
    public static Typeface m1785(Object obj) {
        if (C0036.m1332() <= 0) {
            return ((k1.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m1786(Object obj, Object obj2) {
        if (C0119.m4573() >= 0) {
            ((ActionBarContainer) obj).setTabContainer((ScrollingTabContainerView) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۢۡۢ, reason: not valid java name and contains not printable characters */
    public static TextDirectionHeuristic m1787() {
        if (C0214.m8575() < 0) {
            return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦ۟, reason: not valid java name and contains not printable characters */
    public static int m1788(Object obj, int i, int i2, Object obj2) {
        if (C0191.m7812() >= 0) {
            return ((Spannable) obj).nextSpanTransition(i, i2, (Class) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤ۠, reason: not valid java name and contains not printable characters */
    public static int m1789(Object obj) {
        if (C0078.m3044() <= 0) {
            return ((ViewConfiguration) obj).getScaledMaximumFlingVelocity();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۤۧۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1790(Object obj, int i) {
        if (C0011.m458() > 0) {
            return m4.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Resources) obj, i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۥۡۧ, reason: not valid java name and contains not printable characters */
    public static Integer m1791() {
        if (C0053.m1959() >= 0) {
            return qd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۤۢ, reason: not valid java name and contains not printable characters */
    public static int m1792(Object obj, Object obj2, Object obj3, int i, int i2) {
        if (C0035.m1268() <= 0) {
            return sq.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TypedArray) obj, (XmlPullParser) obj2, (String) obj3, i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static void m1793(Object obj, Object obj2) {
        if (C0093.m3365() > 0) {
            ((wr.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۢۨۤ, reason: not valid java name and contains not printable characters */
    public static int m1794(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static String m1795(Object obj) {
        if (C0113.m4144() < 0) {
            return ((InterruptedException) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static Intent m1796(Object obj) {
        if (C0178.m7344() < 0) {
            return ((kp.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static WindowInsets m1797(Object obj) {
        if (C0031.m1148() <= 0) {
            return ((WindowInsets) obj).consumeSystemWindowInsets();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static qp m1798() {
        if (C0113.m4144() < 0) {
            return qp.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m1799(Object obj, Object obj2) {
        if (C0239.m9805() < 0) {
            return HookMain.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((File) obj, (String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m1800(Object obj) {
        if (C0020.m701() >= 0) {
            ((Runnable) obj).run();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۥۧۦ, reason: not valid java name and contains not printable characters */
    public static TextView m1801(Object obj) {
        if (C0126.m4908() <= 0) {
            return ((d8) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۡ۠, reason: not valid java name and contains not printable characters */
    public static List m1802(Object obj) {
        if (C0062.m2326() >= 0) {
            return mn.c((hn) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۤۢ, reason: not valid java name and contains not printable characters */
    public static String m1803(Object obj) {
        if (C0169.m7034() < 0) {
            return ((LicenseManager) obj).l();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۥۣ, reason: not valid java name and contains not printable characters */
    public static TextClassifier m1804(Object obj) {
        if (C0201.m8184() < 0) {
            return ((TextClassificationManager) obj).getTextClassifier();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1805(Object obj) {
        if (C0169.m7034() < 0) {
            return x.a((Activity) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۥ۟۟, reason: not valid java name and contains not printable characters */
    public static int m1806(Object obj) {
        if (C0118.m4454() >= 0) {
            return ((Paint) obj).getColor();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۥۥۢ, reason: not valid java name and contains not printable characters */
    public static void m1807(Object obj) {
        if (C0238.m9653() >= 0) {
            ((zr) obj).x();
        }
    }

    /* JADX INFO: renamed from: ۟ۤۥۣۨ, reason: not valid java name and contains not printable characters */
    public static void m1808(Object obj) {
        if (C0057.m2142() > 0) {
            ((a9) obj).b();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۥۡۦ, reason: not valid java name and contains not printable characters */
    public static int m1809(Object obj) {
        if (C0224.m8861() <= 0) {
            return ((xs.d) obj).hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۥۢۥ, reason: not valid java name and contains not printable characters */
    public static m9.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m1810(Object obj, Object obj2) {
        if (C0172.m7180() > 0) {
            return m9.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((XmlPullParser) obj, (Resources) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۥۢ, reason: not valid java name and contains not printable characters */
    public static tm.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m1811(Object obj) {
        if (C0040.m1622() < 0) {
            return ((tm.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۤۢ, reason: not valid java name and contains not printable characters */
    public static void m1812(Object obj, boolean z) {
        if (C0057.m2142() > 0) {
            ((u7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(z);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۨۦۥ, reason: not valid java name and contains not printable characters */
    public static void m1813(Object obj, boolean z) {
        if (C0115.m4218() <= 0) {
            ((View) obj).setAccessibilityHeading(z);
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۨ۟, reason: not valid java name and contains not printable characters */
    public static void m1814(Object obj, Object obj2) {
        if (C0176.m7290() >= 0) {
            ((DataSetObservable) obj).registerObserver(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۨ۠, reason: not valid java name and contains not printable characters */
    public static Charset m1815(Object obj) {
        if (C0113.m4144() < 0) {
            return Charset.forName((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۥۤ, reason: not valid java name and contains not printable characters */
    public static void m1816(Object obj, Object obj2, Object obj3) {
        if (C0249.m10052() <= 0) {
            ((Bundle) obj).putStringArray((String) obj2, (String[]) obj3);
        }
    }

    /* JADX INFO: renamed from: ۠ۡۡۢ, reason: not valid java name and contains not printable characters */
    public static Context m1817(Object obj, Object obj2) {
        if (C0025.m934() > 0) {
            return ((ContextWrapper) obj).createConfigurationContext((Configuration) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static void m1818(Object obj, Object obj2) {
        if (C0116.m4340() >= 0) {
            ((f2) obj).next = (f2) obj2;
        }
    }

    /* JADX INFO: renamed from: ۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static FontFamily m1819(Object obj) {
        if (C0238.m9653() > 0) {
            return ((FontFamily.Builder) obj).build();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۦۤ, reason: not valid java name and contains not printable characters */
    public static void m1820(Object obj, Object obj2, int i, int i2, int i3, int i4, int i5) {
        if (C0204.m8270() <= 0) {
            ((gj) obj).f((View) obj2, i, i2, i3, i4, i5);
        }
    }

    /* JADX INFO: renamed from: ۡ۟۟, reason: not valid java name and contains not printable characters */
    public static boolean m1821(Object obj) {
        if (C0202.m8245() > 0) {
            return ((MenuItem) obj).isEnabled();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static CollapsibleActionView m1822(Object obj) {
        if (C0078.m3044() <= 0) {
            return ((ki.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۢ۟, reason: not valid java name and contains not printable characters */
    public static int[] m1823() {
        if (C0096.m3601() < 0) {
            return i0.b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥ۟, reason: not valid java name and contains not printable characters */
    public static boolean m1824(Object obj) {
        if (C0161.m6744() >= 0) {
            return ((AccessibilityNodeInfo) obj).isFocusable();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۦۤ۟, reason: not valid java name and contains not printable characters */
    public static boolean m1825(Object obj) {
        if (C0162.m6837() <= 0) {
            return ((v0.k) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۨۡۡ, reason: not valid java name and contains not printable characters */
    public static String m1826(String str) {
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

    /* JADX INFO: renamed from: ۢ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static void m1827(Object obj, boolean z) {
        if (C0240.m9826() >= 0) {
            wr.f.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj, z);
        }
    }

    /* JADX INFO: renamed from: ۢ۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static Iterator m1828(Object obj) {
        if (C0072.m2856() <= 0) {
            return ((kn.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۢۥ, reason: not valid java name and contains not printable characters */
    public static long m1829(Object obj) {
        if (C0025.m934() > 0) {
            return ((Location) obj).getTime();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۢۢۢ, reason: not valid java name and contains not printable characters */
    public static void m1830(Object obj, Object obj2) {
        if (C0176.m7290() > 0) {
            ((qm) obj).a((Rect) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۥۣۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1831(Object obj, int i) {
        if (C0123.m4841() <= 0) {
            return ((r7) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m1832(Object obj) {
        if (C0049.m1767() <= 0) {
            return ((yf) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۡۨ, reason: not valid java name and contains not printable characters */
    public static Drawable m1833(Object obj) {
        if (C0191.m7812() >= 0) {
            return ((bt) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥ۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1834(Object obj) {
        if (C0217.m8693() < 0) {
            return ((ViewGroup) obj).isShown();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۥۨۢ, reason: not valid java name and contains not printable characters */
    public static StaticLayout m1835(Object obj) {
        if (C0119.m4573() > 0) {
            return ((StaticLayout.Builder) obj).build();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۥۤ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m1836(Object obj) {
        if (C0202.m8245() >= 0) {
            return ((View) obj).getBackgroundTintList();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m1838(Object obj) {
        if (C0162.m6837() <= 0) {
            return ((ListView) obj).getCount();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤ۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static String m1839(int i) {
        if (C0122.m4736() < 0) {
            return i.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m1840(Object obj) {
        if (C0006.m169() < 0) {
            return ((ListIterator) obj).nextIndex();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۢۤۦ, reason: not valid java name and contains not printable characters */
    public static String m1841(Object obj) {
        if (C0108.m4038() >= 0) {
            return ((DataFormatException) obj).getMessage();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۧۢ, reason: not valid java name and contains not printable characters */
    public static s2 m1842(Object obj, long j) {
        if (C0040.m1622() <= 0) {
            return ((s2) obj).k0(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۤۦ, reason: not valid java name and contains not printable characters */
    public static int m1843(Object obj) {
        if (C0058.m2184() > 0) {
            return ((HookMain) obj).videoSwitchIntervalMinutes;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۣۢۨ, reason: contains not printable characters */
    public static List m1844(Object obj) {
        if (C0219.m8794() > 0) {
            return ((j9) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۧ۠, reason: contains not printable characters */
    public static void m1845(Object obj, Object obj2) {
        if (C0112.m4054() < 0) {
            ((xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.a) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦ۟ۥ۟, reason: contains not printable characters */
    public static int m1846(Object obj) {
        if (C0249.m10052() < 0) {
            return ((v.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۤ۠۟, reason: contains not printable characters */
    public static sn m1847() {
        if (C0035.m1268() <= 0) {
            return tj.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۡۤ, reason: contains not printable characters */
    public static int m1848(Object obj) {
        if (C0218.m8760() > 0) {
            return ((m9.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۦۤ۟, reason: contains not printable characters */
    public static void m1849(Object obj, int i) {
        if (C0066.m2514() > 0) {
            ((AccessibilityRecord) obj).setMaxScrollX(i);
        }
    }

    /* JADX INFO: renamed from: ۣۣۧ۟, reason: not valid java name and contains not printable characters */
    public static js m1850(Object obj, Object obj2) {
        if (C0031.m1148() <= 0) {
            return ((js) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Interpolator) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۡۨ, reason: not valid java name and contains not printable characters */
    public static void m1851(Object obj, Object obj2) {
        if (C0069.m2756() < 0) {
            Menu.m5694((Menu) obj, (View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۢۡ, reason: not valid java name and contains not printable characters */
    public static boolean m1852(Object obj) {
        if (C0036.m1332() <= 0) {
            return ((f2) obj).exit();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۨ۠, reason: not valid java name and contains not printable characters */
    public static Camera m1853() {
        if (C0225.m9001() > 0) {
            return HookMain.mCamera1;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۨ۠, reason: not valid java name and contains not printable characters */
    public static String m1837(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
