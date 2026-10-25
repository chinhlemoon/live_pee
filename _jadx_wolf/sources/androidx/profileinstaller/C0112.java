package androidx.profileinstaller;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.ContactsContract;
import android.support.v4.app.C0004;
import android.support.v4.graphics.drawable.C0011;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowInsets;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.activity.C0021;
import androidx.annotation.C0024;
import androidx.annotation.C0025;
import androidx.annotation.C0026;
import androidx.appcompat.app.C0035;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0051;
import androidx.core.app.C0053;
import androidx.core.graphics.drawable.C0065;
import androidx.core.graphics.drawable.C0066;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0072;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0079;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0095;
import androidx.fragment.app.C0096;
import androidx.lifecycle.C0107;
import androidx.lifecycle.c;
import androidx.savedstate.C0123;
import androidx.savedstate.C0127;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0135;
import com.example.vcam.C0141;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.LicenseManager;
import com.example.vcam.Menu;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.c4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.id;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ws;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ze;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.zip.Inflater;
import okhttp3.C0239;
import okhttp3.HttpUrl;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.ws.C0224;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0233;
import okhttp3.logging.C0234;
import okhttp3.logging.C0235;
import org.json.JSONObject;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: androidx.profileinstaller.۟۟۟۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0112 {

    /* JADX INFO: renamed from: ۧۦۣۤ, reason: not valid java name and contains not printable characters */
    public static int f92 = 292;

    /* JADX INFO: renamed from: ۣۣ۟۟۠, reason: not valid java name and contains not printable characters */
    public static int m4054() {
        return (-824) ^ C0182.f632;
    }

    /* JADX INFO: renamed from: ۟۠ۡۥۣ, reason: not valid java name and contains not printable characters */
    public static Uri m4055(Object obj) {
        if (C0116.m4340() > 0) {
            return ((bd) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static int m4056(Object obj) {
        if (C0148.m6464() <= 0) {
            return ((vo) obj).getNumericModifiers();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۤۦۦ, reason: not valid java name and contains not printable characters */
    public static int m4057(Object obj, int i) {
        if (C0078.m3044() <= 0) {
            return ((zr.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۥۨۢ, reason: not valid java name and contains not printable characters */
    public static dd m4058(Object obj) {
        if (C0107.m3883() >= 0) {
            return ((xs.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4059(Object obj) {
        if (C0225.m9001() > 0) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۧۥ۟, reason: not valid java name and contains not printable characters */
    public static String m4060(String str) {
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

    /* JADX INFO: renamed from: ۟ۢۤۨۤ, reason: not valid java name and contains not printable characters */
    public static CancellationException m4061(Object obj) {
        if (C0224.m8861() < 0) {
            return ((rd) obj).d();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۣۨ, reason: not valid java name and contains not printable characters */
    public static MenuItem m4062(Object obj, int i) {
        if (C0117.m4419() <= 0) {
            return ((vo) obj).setActionView(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠۟, reason: not valid java name and contains not printable characters */
    public static Context m4063(Object obj, Object obj2, boolean z, boolean z2) {
        if (C0095.m3478() < 0) {
            return m1.m((Context) obj, (AttributeSet) obj2, z, z2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۤ, reason: not valid java name and contains not printable characters */
    public static int m4064(int i, int i2, int i3) {
        if (C0011.m458() > 0) {
            return fl.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, i2, i3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۦۡ, reason: not valid java name and contains not printable characters */
    public static List m4065(Object obj) {
        if (C0239.m9805() <= 0) {
            return c4.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦ۠, reason: not valid java name and contains not printable characters */
    public static Map m4066(Object obj) {
        if (C0234.m9461() <= 0) {
            return ((j6) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static int m4067(Object obj) {
        if (C0065.m2448() >= 0) {
            return ((Menu.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۢۤۤ, reason: not valid java name and contains not printable characters */
    public static void m4068(Object obj, Object obj2) {
        if (C0172.m7180() > 0) {
            ((ProfileInstallerInitializer) obj).a((Context) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۦ, reason: not valid java name and contains not printable characters */
    public static xs m4069() {
        if (C0021.m740() <= 0) {
            return xs.d.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m4070() {
        if (C0188.m7736() <= 0) {
            return hm.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧۥ, reason: not valid java name and contains not printable characters */
    public static Uri m4071() {
        if (C0004.m139() < 0) {
            return ContactsContract.Contacts.CONTENT_URI;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۢ۟, reason: not valid java name and contains not printable characters */
    public static com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m4072(Object obj) {
        if (C0025.m934() >= 0) {
            return com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.valueOf((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static Context m4073(Object obj) {
        if (C0128.m5064() <= 0) {
            return ((k0) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡۨۧ, reason: not valid java name and contains not printable characters */
    public static void m4074(Object obj, Object obj2) {
        if (C0065.m2448() > 0) {
            fq.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj, (CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۥۨۦ, reason: not valid java name and contains not printable characters */
    public static void m4075(Object obj, Object obj2, int i, int i2, Object obj3) {
        if (C0161.m6744() >= 0) {
            ((pr.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Canvas) obj2, i, i2, (ColorFilter) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۥ۟ۢ, reason: not valid java name and contains not printable characters */
    public static WindowInsets m4076(Object obj) {
        if (C0094.m3450() >= 0) {
            return ((View) obj).getRootWindowInsets();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥ۠, reason: not valid java name and contains not printable characters */
    public static int m4077(Object obj) {
        if (C0107.m3883() >= 0) {
            return ((xf) obj).b();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۡۡۢ, reason: not valid java name and contains not printable characters */
    public static Uri m4078() {
        if (C0202.m8245() > 0) {
            return ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۤۥ, reason: not valid java name and contains not printable characters */
    public static int m4079(Object obj) {
        if (C0162.m6837() <= 0) {
            return ((Inflater) obj).getRemaining();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۤۦ۟, reason: not valid java name and contains not printable characters */
    public static Class m4080(Object obj) {
        if (C0214.m8575() <= 0) {
            return obj.getClass();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۦ۠, reason: not valid java name and contains not printable characters */
    public static Object m4081(Object obj) {
        if (C0164.m6900() < 0) {
            return ((vn.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۧۤ, reason: not valid java name and contains not printable characters */
    public static AtomicIntegerFieldUpdater m4082() {
        if (C0065.m2448() > 0) {
            return m3.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۨۡ, reason: not valid java name and contains not printable characters */
    public static String m4083(Object obj) {
        if (C0213.m8458() > 0) {
            return ((com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static s1 m4084() {
        if (C0235.m9535() <= 0) {
            return s1.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m4085(Object obj, Object obj2) {
        if (C0164.m6900() < 0) {
            ((t5) obj).resumeWith(obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۢۢۧ, reason: not valid java name and contains not printable characters */
    public static int m4086(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۠ۤۧۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4087(Object obj) {
        if (C0069.m2756() <= 0) {
            return ((View) obj).isShown();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۥۡۤ, reason: not valid java name and contains not printable characters */
    public static ze m4088(Object obj) {
        if (C0178.m7344() < 0) {
            return ((lf.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static void m4089(Object obj, Object obj2, Object obj3) {
        if (C0066.m2514() >= 0) {
            ((Bundle) obj).putShortArray((String) obj2, (short[]) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣۡۢۢ, reason: not valid java name and contains not printable characters */
    public static Void m4090(Object obj) {
        if (C0079.m3072() < 0) {
            return ((p8) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۥۨ, reason: not valid java name and contains not printable characters */
    public static String m4091(Object obj) {
        if (C0118.m4454() > 0) {
            return ((LicenseManager) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static void m4092(Object obj, boolean z) {
        if (C0120.m4608() >= 0) {
            p4.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ObjectAnimator) obj, z);
        }
    }

    /* JADX INFO: renamed from: ۢ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static Rect m4093(Object obj) {
        if (C0182.m7528() <= 0) {
            return ((jq) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۡۨ, reason: not valid java name and contains not printable characters */
    public static int m4094(Object obj) {
        if (C0249.m10052() <= 0) {
            return ((id) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۤۡۥ, reason: not valid java name and contains not printable characters */
    public static int m4095(Object obj, Object obj2) {
        if (C0233.m9365() <= 0) {
            return ((a9) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢۤۤ, reason: not valid java name and contains not printable characters */
    public static boolean m4096(Object obj) {
        if (C0202.m8245() > 0) {
            return ((fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۦۥۨ, reason: not valid java name and contains not printable characters */
    public static float m4097(Object obj) {
        if (C0234.m9461() < 0) {
            return ((PathMeasure) obj).getLength();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۢۨۨ, reason: not valid java name and contains not printable characters */
    public static s6 m4098(Object obj) {
        if (C0123.m4841() < 0) {
            return ((ws) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۦۢ, reason: not valid java name and contains not printable characters */
    public static c m4099(Object obj) {
        if (C0053.m1959() >= 0) {
            return ((wk) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۢۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4100(Object obj) {
        if (C0199.m7998() < 0) {
            return ((u6) obj).x0();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤۤ۟, reason: not valid java name and contains not printable characters */
    public static float m4101(float f) {
        if (C0096.m3601() < 0) {
            return Math.abs(f);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۤۡۦۨ, reason: not valid java name and contains not printable characters */
    public static LicenseManager.LicenseCallback m4103(Object obj) {
        if (C0072.m2856() < 0) {
            return C0049.m1770((LicenseManager) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۤۥ, reason: not valid java name and contains not printable characters */
    public static void m4104(Object obj, Object obj2) {
        if (C0176.m7290() >= 0) {
            ((tf) obj).a((tf) obj2);
        }
    }

    /* JADX INFO: renamed from: ۤۤۡۨ, reason: not valid java name and contains not printable characters */
    public static String m4105(Object obj) {
        if (C0118.m4454() > 0) {
            return ((JSONObject) obj).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۧۤ, reason: not valid java name and contains not printable characters */
    public static ConnectionBlocker.ConnectionBlockerCallback m4106(Object obj) {
        if (C0161.m6744() >= 0) {
            return C0204.m8272((ConnectionBlocker) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۧۥ, reason: contains not printable characters */
    public static int m4107(Object obj) {
        if (C0181.m7445() >= 0) {
            return ((TextView) obj).getHyphenationFrequency();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۤۥۦ, reason: contains not printable characters */
    public static int m4108(Object obj) {
        if (C0026.m1047() > 0) {
            return ((f6) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۤۧۢ, reason: contains not printable characters */
    public static Handler m4109() {
        if (C0128.m5064() <= 0) {
            return d3.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۡ۟, reason: contains not printable characters */
    public static void m4110(Object obj, Object obj2) {
        if (C0024.m896() > 0) {
            vd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((y5) obj, (CancellationException) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۨۡۧ, reason: contains not printable characters */
    public static m2 m4111(Object obj, int i) {
        if (C0035.m1268() <= 0) {
            return ((m2) obj).i(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۤۢ, reason: contains not printable characters */
    public static void m4112(Object obj, int i) {
        if (C0225.m9001() > 0) {
            ((EditText) obj).setTextColor(i);
        }
    }

    /* JADX INFO: renamed from: ۦۡۨۢ, reason: contains not printable characters */
    public static int m4113(Object obj) {
        if (C0127.m4950() >= 0) {
            return ((pr.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۣۤۥ, reason: contains not printable characters */
    public static Random m4114() {
        if (C0218.m8760() > 0) {
            return a9.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦ۟ۡ, reason: contains not printable characters */
    public static void m4115(Object obj, Object obj2) {
        if (C0141.m5769() > 0) {
            ((FrameLayout) obj).setForeground((Drawable) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۦ۟ۤ, reason: contains not printable characters */
    public static boolean m4116(Object obj) {
        if (C0148.m6464() <= 0) {
            return ((TextView) obj).getIncludeFontPadding();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static Method m4117(Object obj) {
        if (C0051.m1783() < 0) {
            return x.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Class) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m4118(Object obj, int i, int i2) {
        if (C0187.m7613() >= 0) {
            return ((String) obj).codePointCount(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۤۢ, reason: not valid java name and contains not printable characters */
    public static boolean m4119(Object obj) {
        if (C0119.m4573() >= 0) {
            return ((u6) obj).w0();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۥۦۤ, reason: not valid java name and contains not printable characters */
    public static boolean m4120(Object obj, boolean z) {
        if (C0115.m4218() < 0) {
            return bp.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۢۧۡ, reason: not valid java name and contains not printable characters */
    public static m1 m4121(Object obj) {
        if (C0078.m3044() <= 0) {
            return ((v0) obj).a0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۨۥ, reason: not valid java name and contains not printable characters */
    public static Context m4122(Object obj) {
        if (C0135.m5274() < 0) {
            return ((v0.k) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۢۡ, reason: not valid java name and contains not printable characters */
    public static InputFilter[] m4123(Object obj, Object obj2) {
        if (C0213.m8458() > 0) {
            return ((h8) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((InputFilter[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۥۥ, reason: not valid java name and contains not printable characters */
    public static AtomicReferenceFieldUpdater m4124(Object obj) {
        if (C0149.m6476() < 0) {
            return ((e.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۣۤ, reason: not valid java name and contains not printable characters */
    public static void m4125(Object obj, int i, boolean z, boolean z2) {
        if (C0053.m1959() > 0) {
            ((android.view.Menu) obj).setGroupCheckable(i, z, z2);
        }
    }

    /* JADX INFO: renamed from: ۨۦ۠ۥ, reason: not valid java name and contains not printable characters */
    public static float m4126(float f, float f2) {
        if (C0072.m2856() < 0) {
            return Math.max(f, f2);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۨۦۧ۟, reason: not valid java name and contains not printable characters */
    public static hn m4127(Object obj) {
        if (C0120.m4608() > 0) {
            return kn.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((hn) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡ۠۟, reason: not valid java name and contains not printable characters */
    public static String m4102(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
