package okhttp3.internal.io;

import android.content.ClipData;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.os.LocaleList;
import android.support.v4.app.C0002;
import android.support.v4.app.C0004;
import android.support.v4.graphics.drawable.C0009;
import android.text.Selection;
import android.text.Spannable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityRecord;
import android.widget.AbsListView;
import android.widget.TextView;
import androidx.activity.C0014;
import androidx.activity.C0017;
import androidx.activity.ComponentActivity;
import androidx.annotation.C0023;
import androidx.annotation.C0026;
import androidx.appcompat.app.C0034;
import androidx.appcompat.app.C0035;
import androidx.appcompat.app.C0036;
import androidx.appcompat.view.menu.C0039;
import androidx.appcompat.view.menu.C0040;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0051;
import androidx.core.app.C0052;
import androidx.core.content.C0057;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0064;
import androidx.core.graphics.drawable.C0066;
import androidx.core.widget.C0068;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0070;
import androidx.drawerlayout.widget.C0072;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0083;
import androidx.emoji2.text.C0084;
import androidx.fragment.app.C0095;
import androidx.fragment.app.C0099;
import androidx.fragment.app.a;
import androidx.lifecycle.C0107;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0119;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0123;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0135;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.HookMain;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.di;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dt;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.g;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mi;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.nb;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.nf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.od;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ts;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.w2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.C0239;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.internal.C0227;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.logging.C0232;
import org.xmlpull.v1.XmlSerializer;
import retrofit2.Response;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: okhttp3.internal.io.۟۠ۡۨۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0195 {

    /* JADX INFO: renamed from: ۥۦۢۦ, reason: contains not printable characters */
    public static int f645 = -196;

    /* JADX INFO: renamed from: ۣ۟۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static Drawable m7899(Object obj, Object obj2) {
        if (C0026.m1047() >= 0) {
            return ((qo) obj).i((Uri) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static Context m7900(Object obj) {
        if (C0068.m2650() > 0) {
            return ((mj) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۢ۠, reason: not valid java name and contains not printable characters */
    public static LocaleList m7901() {
        if (C0188.m7736() <= 0) {
            return LocaleList.getDefault();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۣۣ, reason: not valid java name and contains not printable characters */
    public static Object m7902(Object obj) {
        if (C0070.m2829() < 0) {
            return ((Response) obj).body();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۡۤ, reason: not valid java name and contains not printable characters */
    public static void m7903(Object obj, Object obj2, float f) {
        if (C0004.m139() < 0) {
            ((n3) obj).f((o3) obj2, f);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۨ۟, reason: not valid java name and contains not printable characters */
    public static int m7904(Object obj) {
        if (C0078.m3044() <= 0) {
            return ((Image.Plane) obj).getRowStride();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m7905(Object obj, Object obj2) {
        if (C0023.m843() > 0) {
            ((Window.Callback) obj).onActionModeFinished((ActionMode) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۦ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Set m7906(Object obj) {
        if (m7914() > 0) {
            return ((Bundle) obj).keySet();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m7907(int i) {
        if (C0181.m7445() > 0) {
            return a.t0(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧۡ, reason: not valid java name and contains not printable characters */
    public static void m7908(Object obj, Object obj2) {
        if (C0135.m5274() <= 0) {
            ((View) obj).setBackground((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m7909(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۢۡۨۢ, reason: not valid java name and contains not printable characters */
    public static Locale m7910() {
        if (C0023.m843() > 0) {
            return Locale.getDefault();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۡۧ, reason: not valid java name and contains not printable characters */
    public static boolean m7911() {
        if (C0171.m7136() <= 0) {
            return v0.h0;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۤۢۡ, reason: not valid java name and contains not printable characters */
    public static void m7912(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0072.m2856() <= 0) {
            ((k6) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj2, (Context) obj3, (Cursor) obj4);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۤۥۤ, reason: not valid java name and contains not printable characters */
    public static void m7913(Object obj, Object obj2, Object obj3) {
        if (C0062.m2326() > 0) {
            ((mi) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Menu) obj2, (MenuInflater) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۧۡۥ, reason: not valid java name and contains not printable characters */
    public static int m7914() {
        return (-1019) ^ C0194.f644;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤۥ, reason: not valid java name and contains not printable characters */
    public static void m7916(Object obj) {
        if (C0064.m2388() >= 0) {
            f5.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((f5) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static long m7917() {
        if (C0057.m2142() > 0) {
            return kq.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۥۦۡ, reason: not valid java name and contains not printable characters */
    public static boolean m7918(Object obj, Object obj2) {
        if (C0040.m1622() <= 0) {
            return obj.equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m7919(Object obj, boolean z) {
        if (C0068.m2650() > 0) {
            ((View) obj).setPressed(z);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۡۤۦ, reason: not valid java name and contains not printable characters */
    public static void m7920(Object obj) {
        if (C0069.m2756() <= 0) {
            ((ComponentActivity) obj).n();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۡۨ۠, reason: not valid java name and contains not printable characters */
    public static List m7921(Object obj) {
        if (C0051.m1783() < 0) {
            return ((vn) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۨۦ, reason: not valid java name and contains not printable characters */
    public static CharSequence m7922(Object obj, Object obj2) {
        if (C0213.m8458() > 0) {
            return ((ClipData.Item) obj).coerceToText((Context) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۤۦ, reason: not valid java name and contains not printable characters */
    public static v2 m7923(Object obj) {
        if (C0182.m7528() <= 0) {
            return tj.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((un) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static com.example.vcam.Menu m7924(Object obj) {
        if (C0074.m2951() <= 0) {
            return ((di) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static xs m7925(Object obj) {
        if (C0049.m1767() < 0) {
            return xs.j((WindowInsets) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۨۧ, reason: not valid java name and contains not printable characters */
    public static un m7926(Object obj) {
        if (C0128.m5064() <= 0) {
            return sj.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((File) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۥۢ, reason: not valid java name and contains not printable characters */
    public static boolean m7927(Object obj) {
        if (C0099.m3752() < 0) {
            return ((AbsListView) obj).isSelectedChildViewEnabled();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۣۢۡ, reason: not valid java name and contains not printable characters */
    public static j6 m7928() {
        if (C0107.m3883() > 0) {
            return nb.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۣ, reason: not valid java name and contains not printable characters */
    public static y0 m7929(Object obj) {
        if (C0034.m1206() < 0) {
            return ((x0) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۡ۟, reason: not valid java name and contains not printable characters */
    public static ViewPropertyAnimator m7930(Object obj, long j) {
        if (C0164.m6900() < 0) {
            return ((ViewPropertyAnimator) obj).setStartDelay(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۧ, reason: not valid java name and contains not printable characters */
    public static void m7931(Object obj) {
        if (C0026.m1047() >= 0) {
            h4.h((List) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۨۢۥ, reason: not valid java name and contains not printable characters */
    public static Long m7932(long j) {
        if (C0123.m4841() < 0) {
            return Long.valueOf(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡۡۧ, reason: not valid java name and contains not printable characters */
    public static boolean m7933(Object obj, Object obj2, int i, Object obj3) {
        if (C0194.m7889() > 0) {
            return ((hm) obj).o((Context) obj2, i, (Drawable) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢۤ, reason: not valid java name and contains not printable characters */
    public static void m7934(Object obj, Object obj2) {
        if (C0182.m7528() <= 0) {
            com.example.vcam.Menu.m5634((com.example.vcam.Menu) obj, (View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۢۥۣ, reason: not valid java name and contains not printable characters */
    public static boolean m7935(char c, char c2, boolean z) {
        if (C0162.m6837() < 0) {
            return r3.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(c, c2, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۥۦۨ, reason: not valid java name and contains not printable characters */
    public static void m7936(Object obj, Object obj2) {
        if (C0187.m7613() >= 0) {
            ((od) obj).j((Throwable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۥۨ۟, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m7937(int i, Object obj) {
        if (C0119.m4573() >= 0) {
            return pr.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, (PorterDuff.Mode) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۥۧ, reason: not valid java name and contains not printable characters */
    public static int m7938(Object obj) {
        if (C0035.m1268() <= 0) {
            return ((g) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۦۧۧ, reason: not valid java name and contains not printable characters */
    public static void m7939(Object obj, int i) {
        if (C0249.m10052() < 0) {
            ((AccessibilityRecord) obj).setMaxScrollY(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۨۦۣ, reason: not valid java name and contains not printable characters */
    public static int[] m7940() {
        if (C0161.m6744() > 0) {
            return mp.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۠ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m7941(Object obj) {
        if (C0120.m4608() > 0) {
            return ((k3) obj).x();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۨۤۤ, reason: not valid java name and contains not printable characters */
    public static Class m7942(Object obj) {
        if (C0039.m1515() <= 0) {
            return ((y3) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۢۤ, reason: not valid java name and contains not printable characters */
    public static Method m7943() {
        if (C0004.m139() < 0) {
            return ts.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static float[][] m7944() {
        if (C0214.m8575() < 0) {
            return f3.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static String m7945(String str) {
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

    /* JADX INFO: renamed from: ۣۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m7946(Object obj) {
        if (C0188.m7736() <= 0) {
            return ((x9) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static Method m7947(Object obj) {
        if (C0069.m2756() <= 0) {
            return ((h0) obj).P();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۡۤۢ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m7948(Object obj, long j, Object obj2) {
        if (C0062.m2326() > 0) {
            return ((OkHttpClient.Builder) obj).connectTimeout(j, (TimeUnit) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۤ۠, reason: not valid java name and contains not printable characters */
    public static void m7949(Object obj, int i, int i2, int i3, int i4) {
        if (C0036.m1332() < 0) {
            ((View) obj).postInvalidateOnAnimation(i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: ۢۦۢ۟, reason: not valid java name and contains not printable characters */
    public static boolean m7950(Object obj) {
        if (C0083.m3188() <= 0) {
            return ((View) obj).isAccessibilityHeading();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۦۣ۠, reason: not valid java name and contains not printable characters */
    public static void m7951(Object obj, float f, float f2) {
        if (C0002.m72() > 0) {
            ((Path) obj).rLineTo(f, f2);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static Object m7952(Object obj) {
        if (C0095.m3478() < 0) {
            return ((tm.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).next();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۦۦ, reason: not valid java name and contains not printable characters */
    public static boolean m7953(Object obj, Object obj2, float f, float f2) {
        if (C0083.m3188() <= 0) {
            return ((zr) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj2, f, f2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static String m7954(Object obj, Object obj2) {
        if (C0202.m8245() > 0) {
            return qo.f((Cursor) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۡ۠, reason: not valid java name and contains not printable characters */
    public static Rect m7955(Object obj) {
        if (C0084.m3253() <= 0) {
            return ((pr) obj).d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦ۟ۤ, reason: not valid java name and contains not printable characters */
    public static XmlSerializer m7956(Object obj, Object obj2, Object obj3) {
        if (C0026.m1047() >= 0) {
            return ((XmlSerializer) obj).startTag((String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۧ۠, reason: not valid java name and contains not printable characters */
    public static String m7957(Object obj) {
        if (C0074.m2951() <= 0) {
            return ((TypedArray) obj).getPositionDescription();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۦۡ, reason: contains not printable characters */
    public static void m7958(Object obj, int i) {
        if (C0052.m1890() > 0) {
            Selection.setSelection((Spannable) obj, i);
        }
    }

    /* JADX INFO: renamed from: ۥۣۤۧ, reason: contains not printable characters */
    public static void m7959(Object obj, Object obj2) {
        if (C0009.m276() < 0) {
            ((v0) obj).K((Window) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۦۤۨ, reason: contains not printable characters */
    public static int m7960(Object obj) {
        if (C0066.m2514() > 0) {
            return ((dt) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۣۨۧ, reason: contains not printable characters */
    public static TextView m7961(Object obj) {
        if (C0014.m545() >= 0) {
            return ((h8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠۠ۥ, reason: contains not printable characters */
    public static int m7962() {
        if (C0069.m2756() <= 0) {
            return w2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۤ۟, reason: contains not printable characters */
    public static void m7963(Object obj, Object obj2) {
        if (C0227.m9046() >= 0) {
            nf.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((StringBuilder) obj, (Locale) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۥ۠ۧ, reason: contains not printable characters */
    public static Class m7964() {
        if (C0078.m3044() <= 0) {
            return Long.TYPE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static void m7965(Object obj, int i) {
        if (C0232.m9299() > 0) {
            Arrays.fill((int[]) obj, i);
        }
    }

    /* JADX INFO: renamed from: ۧۡ۟, reason: not valid java name and contains not printable characters */
    public static xo m7966() {
        if (C0239.m9805() < 0) {
            return f6.f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۧۨ, reason: not valid java name and contains not printable characters */
    public static boolean m7967(Object obj, Object obj2) {
        if (C0187.m7613() >= 0) {
            return ((k3) obj).d((Throwable) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۦۣ۠, reason: not valid java name and contains not printable characters */
    public static HookMain m7968(Object obj) {
        if (C0017.m627() > 0) {
            return ((HookMain.v) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۤ۟, reason: not valid java name and contains not printable characters */
    public static y5.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m7969(Object obj) {
        if (C0214.m8575() < 0) {
            return ((y5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).getKey();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۣۤ, reason: not valid java name and contains not printable characters */
    public static WindowInsets m7970(Object obj, int i, int i2, int i3, int i4) {
        if (C0072.m2856() < 0) {
            return ((WindowInsets) obj).replaceSystemWindowInsets(i, i2, i3, i4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static ConnectionBlocker m7971(Object obj) {
        if (C0176.m7290() > 0) {
            return C0115.m4216((HookMain) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۢ۟, reason: not valid java name and contains not printable characters */
    public static void m7972(Object obj, Object obj2) {
        if (C0039.m1515() < 0) {
            ((Configuration) obj).setLocale((Locale) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۧۢ۟, reason: not valid java name and contains not printable characters */
    public static int[] m7973(Object obj) {
        if (C0117.m4419() <= 0) {
            return ((fj) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۢۨ, reason: not valid java name and contains not printable characters */
    public static String m7915(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
