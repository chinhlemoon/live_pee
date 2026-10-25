package androidx.appcompat.app;

import android.animation.TimeInterpolator;
import android.app.UiModeManager;
import android.content.ClipData;
import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.C0002;
import android.support.v4.app.C0004;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0009;
import android.support.v4.graphics.drawable.C0011;
import android.util.SizeF;
import android.util.TypedValue;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.activity.C0014;
import androidx.activity.C0017;
import androidx.annotation.C0024;
import androidx.appcompat.view.menu.C0039;
import androidx.appcompat.widget.C0047;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0052;
import androidx.core.app.C0053;
import androidx.core.app.C0055;
import androidx.core.content.C0057;
import androidx.core.graphics.drawable.C0064;
import androidx.core.graphics.drawable.C0065;
import androidx.core.widget.C0068;
import androidx.drawerlayout.widget.C0070;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0083;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0119;
import androidx.savedstate.C0126;
import androidx.savedstate.C0127;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0133;
import com.example.vcam.C0141;
import com.example.vcam.HookMain;
import com.example.vcam.Menu;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.aa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.c2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.el;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.im;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.je;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.js;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kh;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ks;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.og;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.oi;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.internal.C0227;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.io.C0195;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.internal.ws.C0224;
import okhttp3.logging.C0233;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.C0259;
import retrofit2.converter.scalars.C0243;

/* JADX INFO: renamed from: androidx.appcompat.app.ۣۣۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0036 {

    /* JADX INFO: renamed from: ۟ۡ۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static int f34 = -659;

    /* JADX INFO: renamed from: ۟۟۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static boolean m1313(Object obj, Object obj2) {
        if (C0199.m7998() <= 0) {
            return ((HookMain) obj).isActionAllowed((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟۠ۦۢ, reason: not valid java name and contains not printable characters */
    public static ks m1314(Object obj, Object obj2) {
        if (C0024.m896() >= 0) {
            return ((ks) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((js) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static int m1315(Object obj, Object obj2) {
        if (C0039.m1515() < 0) {
            return ((j0.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).x((int[]) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۤۤ۠, reason: not valid java name and contains not printable characters */
    public static ClipData m1316(Object obj, Object obj2) {
        if (C0017.m627() > 0) {
            return ClipData.newPlainText((CharSequence) obj, (CharSequence) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static CharSequence m1317(Object obj) {
        if (C0200.m8104() <= 0) {
            return ((v0) obj).j0();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m1318(Object obj) {
        if (C0055.m2054() >= 0) {
            return l1.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۢۧۡ, reason: not valid java name and contains not printable characters */
    public static String m1319(Object obj) {
        if (C0009.m276() <= 0) {
            return ((File) obj).getPath();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۡۢ, reason: not valid java name and contains not printable characters */
    public static Paint m1320(Object obj) {
        if (C0009.m276() < 0) {
            return ((qm) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static boolean m1321(Object obj) {
        if (C0057.m2142() > 0) {
            return ((i) obj).v();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Set m1322(Object obj) {
        if (C0214.m8575() <= 0) {
            return ((HashMap) obj).keySet();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۤ, reason: not valid java name and contains not printable characters */
    public static tf m1323(Object obj) {
        if (C0227.m9046() > 0) {
            return ((tf.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۠۟ۢ, reason: not valid java name and contains not printable characters */
    public static hn m1324(Object obj, Object obj2, int i, boolean z, int i2) {
        if (C0068.m2650() >= 0) {
            return mo.P((CharSequence) obj, (char[]) obj2, i, z, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۧۥ, reason: not valid java name and contains not printable characters */
    public static Context m1325(Object obj) {
        if (C0083.m3188() <= 0) {
            return ((ViewGroup) obj).getContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۨ, reason: not valid java name and contains not printable characters */
    public static void m1326(Object obj) {
        if (C0070.m2829() <= 0) {
            ((qn) obj).dismiss();
        }
    }

    /* JADX INFO: renamed from: ۟ۢۥۣ۠, reason: not valid java name and contains not printable characters */
    public static String m1327(String str) {
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

    /* JADX INFO: renamed from: ۟ۢۧ۠, reason: not valid java name and contains not printable characters */
    public static View m1328(Object obj) {
        if (C0052.m1890() > 0) {
            return ((View) obj).getRootView();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static boolean m1329(Object obj, Object obj2) {
        if (C0004.m139() > 0) {
            return false;
        }
        return C0217.m8711((String) obj2);
    }

    /* JADX INFO: renamed from: ۣ۟۠۠۟, reason: not valid java name and contains not printable characters */
    public static CharSequence m1330(Object obj) {
        if (C0064.m2388() > 0) {
            return ((View) obj).getAccessibilityPaneTitle();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۢۡ, reason: not valid java name and contains not printable characters */
    public static ViewPropertyAnimator m1331(Object obj, float f) {
        if (C0141.m5769() >= 0) {
            return ((ViewPropertyAnimator) obj).alpha(f);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m1332() {
        return (-411) ^ C0112.f92;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡ۠, reason: not valid java name and contains not printable characters */
    public static Map m1333(Object obj) {
        if (C0002.m72() > 0) {
            return ((aa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۧۡ, reason: not valid java name and contains not printable characters */
    public static HttpLoggingInterceptor.Level m1334() {
        if (C0133.m5208() < 0) {
            return HttpLoggingInterceptor.Level.BODY;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static CharSequence m1335(Object obj) {
        if (C0195.m7914() > 0) {
            return ((View) obj).getStateDescription();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠۠۟, reason: not valid java name and contains not printable characters */
    public static void m1336(Object obj) {
        if (C0119.m4573() > 0) {
            ((vn) obj).a();
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m1337(Object obj, Object obj2) {
        if (C0233.m9365() < 0) {
            return ((HashMap) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static void m1338(Object obj) {
        if (C0014.m545() > 0) {
            ((FileInputStream) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۢۤۢ, reason: not valid java name and contains not printable characters */
    public static CharSequence m1339(Object obj) {
        if (C0213.m8458() >= 0) {
            return wr.g((View) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m1340(Object obj, boolean z) {
        if (C0243.m9964() >= 0) {
            ((r7) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(z);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۦۣ۟, reason: not valid java name and contains not printable characters */
    public static com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.a m1341(Object obj, Object obj2) {
        if (C0006.m169() <= 0) {
            return C0218.m8730((com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj, (com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۨۨ, reason: not valid java name and contains not printable characters */
    public static Menu m1342(Object obj) {
        if (C0078.m3044() <= 0) {
            return ((kh) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static q m1343(Object obj) {
        if (C0127.m4950() > 0) {
            return ((v0) obj).p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۤۤ, reason: not valid java name and contains not printable characters */
    public static Paint.Cap m1344() {
        if (C0178.m7344() <= 0) {
            return Paint.Cap.SQUARE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static String m1345(Object obj) {
        if (C0259.m10136() > 0) {
            return ((Handler) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۦ, reason: not valid java name and contains not printable characters */
    public static ViewPropertyAnimator m1346(Object obj, Object obj2) {
        if (C0065.m2448() >= 0) {
            return ((ViewPropertyAnimator) obj).setInterpolator((TimeInterpolator) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۦ۟, reason: not valid java name and contains not printable characters */
    public static void m1347(Object obj, Object obj2) {
        if (C0259.m10136() >= 0) {
            ((a9) obj).n((ClassLoader) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۦ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m1349(Object obj) {
        if (C0011.m458() > 0) {
            ((v0) obj).a0();
        }
    }

    /* JADX INFO: renamed from: ۡۧ۠۠, reason: not valid java name and contains not printable characters */
    public static void m1350(Object obj) {
        if (C0259.m10136() >= 0) {
            ((lf.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).d();
        }
    }

    /* JADX INFO: renamed from: ۡۨ۠, reason: not valid java name and contains not printable characters */
    public static void m1351(Object obj, Object obj2, Object obj3) {
        if (C0199.m7998() <= 0) {
            y2.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Bundle) obj, (String) obj2, (SizeF) obj3);
        }
    }

    /* JADX INFO: renamed from: ۢ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.AccessibilityAction m1352() {
        if (C0128.m5064() < 0) {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۢۤ, reason: not valid java name and contains not printable characters */
    public static File m1353(Object obj) {
        if (C0219.m8794() > 0) {
            return ((File) obj).getParentFile();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥ۠, reason: not valid java name and contains not printable characters */
    public static Object m1354(Object obj, Object obj2, int i) {
        if (C0065.m2448() >= 0) {
            return x4.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj, (qa) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۤۤ, reason: not valid java name and contains not printable characters */
    public static StackTraceElement m1355(Object obj) {
        if (C0199.m7998() < 0) {
            return ((o2) obj).getStackTraceElement();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۡ۟, reason: not valid java name and contains not printable characters */
    public static int[] m1356(Object obj) {
        if (C0219.m8794() > 0) {
            return ((wn) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۨۧ, reason: not valid java name and contains not printable characters */
    public static Uri m1357(Object obj) {
        if (C0116.m4340() >= 0) {
            return Uri.parse((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣ۟, reason: not valid java name and contains not printable characters */
    public static byte[] m1358(Object obj, Object obj2, int i, int i2, int i3, int i4) {
        if (C0259.m10136() > 0) {
            return c2.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((byte[]) obj, (byte[]) obj2, i, i2, i3, i4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦ۟ۢ, reason: not valid java name and contains not printable characters */
    public static long m1359(Object obj) {
        if (C0113.m4144() < 0) {
            return hm.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TypedValue) obj);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۦۨ, reason: not valid java name and contains not printable characters */
    public static void m1360(Object obj, int i) {
        if (C0011.m458() > 0) {
            im.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.m6028((im.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj, i);
        }
    }

    /* JADX INFO: renamed from: ۣۣۧ, reason: not valid java name and contains not printable characters */
    public static f2 m1361(Object obj) {
        if (C0187.m7613() >= 0) {
            return ((f2.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static oi m1362(Object obj, int i, Object obj2) {
        if (C0024.m896() >= 0) {
            return ((oi) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, (ByteBuffer) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۢۥ, reason: contains not printable characters */
    public static boolean m1363(Object obj) {
        if (C0034.m1206() <= 0) {
            return ((je) obj).isLateinit();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣ۠, reason: contains not printable characters */
    public static ClassLoader m1364(Object obj) {
        if (C0202.m8245() > 0) {
            return ((a9.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۟ۦ, reason: contains not printable characters */
    public static ks m1365(Object obj, Object obj2, Object obj3) {
        if (C0171.m7136() < 0) {
            return ((ks) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((js) obj2, (js) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۦۧ, reason: contains not printable characters */
    public static String m1366(Object obj) {
        if (C0064.m2388() > 0) {
            return el.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((byte[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣ۟ۦ, reason: contains not printable characters */
    public static Map m1367(Object obj, Object obj2) {
        if (C0211.m8341() > 0) {
            return og.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Iterable) obj, (Map) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠۠, reason: contains not printable characters */
    public static int m1368(Object obj) {
        if (C0052.m1890() > 0) {
            return ((UiModeManager) obj).getNightMode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۡۥۥ, reason: contains not printable characters */
    public static void m1369(Object obj, boolean z) {
        if (C0240.m9826() >= 0) {
            ((AccessibilityNodeInfo) obj).setScrollable(z);
        }
    }

    /* JADX INFO: renamed from: ۦۧۥۢ, reason: contains not printable characters */
    public static boolean m1370(Object obj, int i, int i2) {
        if (C0126.m4908() <= 0) {
            return ((zr) obj).s(i, i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۣۨۤ, reason: contains not printable characters */
    public static SubMenu m1371(Object obj, Object obj2) {
        if (C0243.m9964() > 0) {
            return ((p2) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((SubMenu) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m1372(Object obj, Object obj2) {
        if (C0128.m5064() <= 0) {
            ((View) obj).setSystemGestureExclusionRects((List) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧۡۦۦ, reason: not valid java name and contains not printable characters */
    public static hd m1373(Object obj) {
        if (C0224.m8861() <= 0) {
            return ((hd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۨۥ, reason: not valid java name and contains not printable characters */
    public static Object m1374(Object obj, Object obj2) {
        if (C0006.m169() <= 0) {
            return ((Constructor) obj).newInstance((Object[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧ۠۟, reason: not valid java name and contains not printable characters */
    public static xs m1375(Object obj) {
        if (C0213.m8458() >= 0) {
            return wr.r((View) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1376(Object obj, int i) {
        if (C0047.m1663() < 0) {
            return ((m2) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۢۥ۟, reason: not valid java name and contains not printable characters */
    public static int m1377(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۣۨۥ, reason: not valid java name and contains not printable characters */
    public static tm.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m1378(Object obj) {
        if (C0053.m1959() > 0) {
            return ((tm.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۥۤ, reason: not valid java name and contains not printable characters */
    public static com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m1379(Object obj) {
        if (C0049.m1767() <= 0) {
            return ((com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static String m1348(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
