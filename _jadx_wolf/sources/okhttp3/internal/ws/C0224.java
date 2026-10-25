package okhttp3.internal.ws;

import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0009;
import android.support.v4.graphics.drawable.C0011;
import android.text.Editable;
import android.text.Spannable;
import android.view.DisplayCutout;
import android.view.Menu;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityRecord;
import android.view.inputmethod.InputContentInfo;
import android.widget.EdgeEffect;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.activity.C0017;
import androidx.activity.C0021;
import androidx.activity.ComponentActivity;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0035;
import androidx.appcompat.app.C0036;
import androidx.appcompat.view.menu.C0039;
import androidx.appcompat.widget.C0047;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0053;
import androidx.core.content.C0057;
import androidx.core.graphics.drawable.C0066;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0072;
import androidx.drawerlayout.widget.C0074;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0095;
import androidx.fragment.app.C0097;
import androidx.fragment.app.C0099;
import androidx.fragment.app.a;
import androidx.lifecycle.C0107;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0117;
import androidx.savedstate.C0123;
import androidx.versionedparcelable.C0135;
import com.example.vcam.C0141;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.HookMain;
import com.example.vcam.LicenseManager;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.b;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.b7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.c2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.c5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ei;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jh;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.js;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.op;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.so;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ym;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zs;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import okhttp3.C0239;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.io.C0195;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.logging.C0231;
import okhttp3.logging.C0232;
import okhttp3.logging.C0235;
import org.xmlpull.v1.XmlSerializer;
import retrofit2.Response;
import retrofit2.converter.scalars.C0243;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: okhttp3.internal.ws.۟ۥۡۨۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0224 {

    /* JADX INFO: renamed from: ۦۣۦۦ, reason: contains not printable characters */
    public static int f674 = 544;

    /* JADX INFO: renamed from: ۣ۟۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static String m8855(Object obj) {
        if (C0069.m2756() < 0) {
            return ((Response) obj).message();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۤ۠, reason: not valid java name and contains not printable characters */
    public static zs m8856(Object obj) {
        if (C0176.m7290() > 0) {
            return ((f6.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static boolean m8857(Object obj, Object obj2) {
        if (C0031.m1148() < 0) {
            return ((a) obj).C((Menu) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۨۤۨ, reason: not valid java name and contains not printable characters */
    public static com.example.vcam.Menu m8858(Object obj) {
        if (C0135.m5274() < 0) {
            return ((jh) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static Context m8859(Object obj) {
        if (C0047.m1663() < 0) {
            return ((so.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۨۢ, reason: not valid java name and contains not printable characters */
    public static void m8860(Object obj) {
        if (C0057.m2142() >= 0) {
            ((k3) obj).f();
        }
    }

    /* JADX INFO: renamed from: ۟۠ۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m8861() {
        return 181 ^ C0113.f93;
    }

    /* JADX INFO: renamed from: ۟۠ۨۦۧ, reason: not valid java name and contains not printable characters */
    public static void m8862(Object obj, int i) {
        if (C0057.m2142() > 0) {
            k.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((AccessibilityRecord) obj, i);
        }
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۨ۟, reason: not valid java name and contains not printable characters */
    public static String m8863(Object obj) {
        if (C0172.m7180() >= 0) {
            return ((xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).getName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡ۟, reason: not valid java name and contains not printable characters */
    public static void m8864(Object obj) {
        if (C0074.m2951() <= 0) {
            ((v0) obj).Z();
        }
    }

    /* JADX INFO: renamed from: ۟ۡۢۤۤ, reason: not valid java name and contains not printable characters */
    public static void m8865(Object obj, Object obj2, boolean z) {
        if (C0178.m7344() <= 0) {
            ((wr.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj2, z);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۨۨۥ, reason: not valid java name and contains not printable characters */
    public static boolean m8866(Object obj) {
        if (C0182.m7528() <= 0) {
            return ((r6) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static com.example.vcam.Menu m8867(Object obj) {
        if (C0204.m8270() <= 0) {
            return ((ei) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static void m8868(Object obj, Object obj2) {
        if (C0057.m2142() >= 0) {
            kp.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TextView) obj, (ColorStateList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۧۢۤ, reason: not valid java name and contains not printable characters */
    public static Constructor m8869(Object obj) {
        if (C0123.m4841() <= 0) {
            return ((wq) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟۠, reason: not valid java name and contains not printable characters */
    public static y m8871(Object obj, Object obj2) {
        if (C0021.m740() <= 0) {
            return ((y.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Parcel) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static void m8872(Object obj, Object obj2) {
        if (C0239.m9805() < 0) {
            lp.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Editable) obj, (CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤۥ, reason: not valid java name and contains not printable characters */
    public static int m8873(Object obj) {
        if (C0099.m3752() < 0) {
            return ((o9) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۤۨ, reason: not valid java name and contains not printable characters */
    public static a6 m8874(Object obj) {
        if (C0006.m169() < 0) {
            return ((bf) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static Uri m8875(Object obj) {
        if (C0135.m5274() <= 0) {
            return ((Uri.Builder) obj).build();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۨ۟, reason: not valid java name and contains not printable characters */
    public static int m8876(Object obj) {
        if (m8861() < 0) {
            return ((Configuration) obj).orientation;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m8877(Object obj, boolean z) {
        if (C0049.m1767() <= 0) {
            ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).p(z);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۢۤۢ, reason: not valid java name and contains not printable characters */
    public static String m8878(String str) {
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

    /* JADX INFO: renamed from: ۟ۤۥۧ۠, reason: not valid java name and contains not printable characters */
    public static int m8879(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۤۦۣۨ, reason: not valid java name and contains not printable characters */
    public static void m8880(Object obj, int i, int i2) {
        if (C0006.m169() <= 0) {
            d8.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Spannable) obj, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۦۤ۠, reason: not valid java name and contains not printable characters */
    public static void m8881(Object obj, Object obj2, int i, int i2, int i3, int i4) {
        if (C0148.m6464() <= 0) {
            ((ViewParent) obj).onNestedScroll((View) obj2, i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۡۥۥ, reason: not valid java name and contains not printable characters */
    public static List m8882(Object obj, int i) {
        if (C0117.m4419() <= 0) {
            return m9.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Resources) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۟ۧ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.AccessibilityAction m8883() {
        if (C0213.m8458() >= 0) {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۢۦ, reason: not valid java name and contains not printable characters */
    public static js m8884(Object obj, int i, long j) {
        if (C0243.m9964() > 0) {
            return ((s6) obj).g(i, j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۢۢ, reason: not valid java name and contains not printable characters */
    public static void m8885(Object obj, Object obj2) {
        if (C0201.m8184() <= 0) {
            ((LicenseManager) obj).o((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۨ۠ۦ, reason: not valid java name and contains not printable characters */
    public static ComponentActivity m8886(Object obj) {
        if (C0035.m1268() <= 0) {
            return ((c5) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۡۡ, reason: not valid java name and contains not printable characters */
    public static void m8887(Object obj, Object obj2) {
        if (C0225.m9001() >= 0) {
            ((xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).d0(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static int m8888(Object obj) {
        if (C0191.m7812() > 0) {
            return ((a3) obj).k();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۨۧ۟, reason: not valid java name and contains not printable characters */
    public static void m8889(Object obj, boolean z) {
        if (C0123.m4841() <= 0) {
            ((TextView) obj).setAllCaps(z);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static Object m8890(Object obj, Object obj2) {
        if (C0039.m1515() <= 0) {
            return ((WeakHashMap) obj).remove(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m8891(Object obj, Object obj2) {
        if (C0072.m2856() < 0) {
            rq.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj, (String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦ۟, reason: not valid java name and contains not printable characters */
    public static void m8892(Object obj, int i, Object obj2, float f, float f2) {
        if (C0231.m9265() > 0) {
            ((u7) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, (View) obj2, f, f2);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۥۤۡ, reason: not valid java name and contains not printable characters */
    public static void m8893(Object obj, int i, int i2) {
        if (C0036.m1332() < 0) {
            ((b.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۡ, reason: not valid java name and contains not printable characters */
    public static void m8894(Object obj, Object obj2) {
        if (C0095.m3478() < 0) {
            ((Paint) obj).setStrokeJoin((Paint.Join) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۨۤ۟, reason: not valid java name and contains not printable characters */
    public static void m8895(Object obj, Object obj2, Object obj3) {
        if (C0240.m9826() >= 0) {
            ((op) obj).q((y5) obj2, obj3);
        }
    }

    /* JADX INFO: renamed from: ۠۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static void m8896(Object obj, float f, float f2) {
        if (C0235.m9535() <= 0) {
            x7.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((EdgeEffect) obj, f, f2);
        }
    }

    /* JADX INFO: renamed from: ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static int m8897(Object obj) {
        if (C0188.m7736() < 0) {
            return wr.u((View) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static ym m8898(Object obj, Object obj2) {
        if (C0011.m458() >= 0) {
            return ((ym.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((zm) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥ۟۠, reason: not valid java name and contains not printable characters */
    public static XmlSerializer m8899(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0141.m5769() > 0) {
            return ((XmlSerializer) obj).attribute((String) obj2, (String) obj3, (String) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۤ۠, reason: not valid java name and contains not printable characters */
    public static void m8900(Object obj) {
        if (C0069.m2756() <= 0) {
            ((r6) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۠ۧۧ۠, reason: not valid java name and contains not printable characters */
    public static HookMain m8901(Object obj) {
        if (C0066.m2514() >= 0) {
            return ((HookMain.h) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static byte m8902(Object obj, int i) {
        if (C0225.m9001() >= 0) {
            return ((ByteBuffer) obj).get(i);
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: ۣۡۢۡ, reason: not valid java name and contains not printable characters */
    public static AtomicReferenceFieldUpdater m8903(Object obj) {
        if (C0031.m1148() <= 0) {
            return ((e.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۢۧ, reason: not valid java name and contains not printable characters */
    public static int m8904(Object obj) {
        if (C0031.m1148() < 0) {
            return ((o5.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۦ۠, reason: not valid java name and contains not printable characters */
    public static String[] m8905(Object obj, Object obj2) {
        if (C0249.m10052() <= 0) {
            return ((Intent) obj).getStringArrayExtra((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m8906(Object obj) {
        if (C0115.m4218() <= 0) {
            ((b7) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۢ۠۟ۢ, reason: not valid java name and contains not printable characters */
    public static DisplayCutout m8907(Object obj) {
        if (C0232.m9299() > 0) {
            return ((WindowInsets) obj).getDisplayCutout();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۨۧ, reason: not valid java name and contains not printable characters */
    public static int m8908(Object obj) {
        if (C0094.m3450() > 0) {
            return ((ListView) obj).getChildCount();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۢ۠ۥ, reason: not valid java name and contains not printable characters */
    public static Bundle m8909(Object obj) {
        if (C0199.m7998() < 0) {
            return ((i) obj).f();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۧۡ, reason: not valid java name and contains not printable characters */
    public static int m8910(Object obj) {
        if (C0181.m7445() > 0) {
            return ((ConnectionBlocker.NetworkLog) obj).port;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢۧ, reason: not valid java name and contains not printable characters */
    public static xs m8911(Object obj, int i, int i2, int i3, int i4) {
        if (C0094.m3450() > 0) {
            return ((xs) obj).d(i, i2, i3, i4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠, reason: not valid java name and contains not printable characters */
    public static void m8912(Object obj) {
        if (C0243.m9964() > 0) {
            ((ComponentActivity.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۣۢۥ۠, reason: not valid java name and contains not printable characters */
    public static boolean m8913(int i) {
        if (C0031.m1148() < 0) {
            return Modifier.isPublic(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۢۥۨ, reason: not valid java name and contains not printable characters */
    public static jk m8914(Object obj, Object obj2, int i, boolean z, boolean z2) {
        if (C0239.m9805() < 0) {
            return mo.y((CharSequence) obj, (Collection) obj2, i, z, z2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۥ۟, reason: not valid java name and contains not printable characters */
    public static boolean m8915(Object obj) {
        if (C0097.m3659() >= 0) {
            return ((l1) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static s2 m8916(Object obj) {
        if (C0107.m3883() >= 0) {
            return ((s2) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۤۢ, reason: not valid java name and contains not printable characters */
    public static v0 m8917(Object obj) {
        if (C0215.m8604() <= 0) {
            return v0.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۦۤ, reason: not valid java name and contains not printable characters */
    public static Drawable[] m8918(Object obj) {
        if (C0202.m8245() > 0) {
            return k1.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TextView) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۣۧ, reason: contains not printable characters */
    public static void m8919(Object obj, int i) {
        if (C0214.m8575() < 0) {
            tk.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((PopupWindow) obj, i);
        }
    }

    /* JADX INFO: renamed from: ۥۨۧۤ, reason: contains not printable characters */
    public static r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m8920(Object obj) {
        if (C0149.m6476() < 0) {
            return ((r7) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠ۨۦ, reason: contains not printable characters */
    public static ClipDescription m8921(Object obj) {
        if (C0009.m276() < 0) {
            return ((InputContentInfo) obj).getDescription();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۣۢ, reason: contains not printable characters */
    public static s m8922() {
        if (C0176.m7290() > 0) {
            return s.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۣۦ, reason: contains not printable characters */
    public static HookMain.i m8923(Object obj) {
        if (C0066.m2514() > 0) {
            return ((HookMain.i.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦ۟ۧ, reason: contains not printable characters */
    public static PorterDuff.Mode m8924(Object obj) {
        if (C0017.m627() > 0) {
            return wr.i((View) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۟۟, reason: not valid java name and contains not printable characters */
    public static qq.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m8925(Object obj) {
        if (C0049.m1767() <= 0) {
            return ((qq) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡۤۥ, reason: not valid java name and contains not printable characters */
    public static Object m8926(Object obj, int i) {
        if (C0178.m7344() < 0) {
            return ((List) obj).get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۧ۠, reason: not valid java name and contains not printable characters */
    public static String[] m8927(Object obj, int i) {
        if (C0164.m6900() <= 0) {
            return ((Resources) obj).getStringArray(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۡ۠, reason: not valid java name and contains not printable characters */
    public static void m8928(Object obj, int i) {
        if (C0113.m4144() < 0) {
            ((l1) obj).j(i);
        }
    }

    /* JADX INFO: renamed from: ۧۦۧۤ, reason: not valid java name and contains not printable characters */
    public static Object m8929(Object obj) {
        if (C0195.m7914() > 0) {
            return ((y1) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۤ۠, reason: not valid java name and contains not printable characters */
    public static Object[] m8930(Object obj, Object obj2, int i, int i2, int i3) {
        if (C0191.m7812() > 0) {
            return c2.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Object[]) obj, (Object[]) obj2, i, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m8931(Object obj, Object obj2) {
        if (C0053.m1959() > 0) {
            return ((Class) obj).isInstance(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۡۥۣ, reason: not valid java name and contains not printable characters */
    public static void m8932(Object obj, float f) {
        if (C0031.m1148() <= 0) {
            ((Paint) obj).setStrokeMiter(f);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦۡ, reason: not valid java name and contains not printable characters */
    public static String m8870(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
