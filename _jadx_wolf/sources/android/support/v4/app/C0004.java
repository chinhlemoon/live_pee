package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.graphics.drawable.C0009;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ListView;
import androidx.activity.C0014;
import androidx.activity.C0021;
import androidx.annotation.C0023;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0036;
import androidx.appcompat.view.menu.C0039;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0053;
import androidx.core.content.C0057;
import androidx.core.content.C0058;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0064;
import androidx.core.graphics.drawable.C0066;
import androidx.core.widget.C0068;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0070;
import androidx.emoji2.text.C0084;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0095;
import androidx.fragment.app.C0097;
import androidx.lifecycle.C0106;
import androidx.lifecycle.C0107;
import androidx.lifecycle.C0108;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0119;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0122;
import androidx.savedstate.C0127;
import androidx.versionedparcelable.C0129;
import com.example.vcam.Menu;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ck;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ej;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gi;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.nq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.us;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y4;
import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.zip.DeflaterOutputStream;
import okhttp3.C0238;
import okhttp3.HttpUrl;
import okhttp3.internal.C0227;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0195;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0234;
import okhttp3.logging.C0235;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import retrofit2.converter.scalars.C0243;

/* JADX INFO: renamed from: android.support.v4.app.ۥۢۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0004 {

    /* JADX INFO: renamed from: ۟۟ۤۦۢ, reason: not valid java name and contains not printable characters */
    public static int f4 = 255;

    /* JADX INFO: renamed from: ۟۟۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static void m93(Object obj, int i, int i2, int i3, int i4) {
        if (C0031.m1148() <= 0) {
            q7.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Drawable) obj, i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: ۟۟۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static List m94(Object obj) {
        if (C0219.m8794() > 0) {
            return Arrays.asList((Object[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۡۤۨ, reason: not valid java name and contains not printable characters */
    public static View m95(Object obj) {
        if (C0023.m843() >= 0) {
            return ((j2) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۥۣ, reason: not valid java name and contains not printable characters */
    public static int m96(int i, int i2, int i3) {
        if (C0053.m1959() >= 0) {
            return dl.d(i, i2, i3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m97(Object obj) {
        if (C0036.m1332() < 0) {
            return ((pq) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static void m98(Object obj, Object obj2, int i, int i2) {
        if (C0149.m6476() < 0) {
            ((f6) obj).G((f6.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m99(String str) {
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

    /* JADX INFO: renamed from: ۟۠ۢۢۢ, reason: not valid java name and contains not printable characters */
    public static void m100(Object obj) {
        if (C0084.m3253() < 0) {
            ((q) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۟۠ۢۤۢ, reason: not valid java name and contains not printable characters */
    public static void m101(Object obj, Object obj2) {
        if (C0213.m8458() > 0) {
            q7.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Drawable) obj, (Resources.Theme) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۥۢ۟, reason: not valid java name and contains not printable characters */
    public static dn m102(Object obj) {
        if (C0108.m4038() > 0) {
            return ((dn) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۧۨ, reason: not valid java name and contains not printable characters */
    public static void m103(Object obj, boolean z) {
        if (C0122.m4736() <= 0) {
            ((AccessibilityNodeInfo) obj).setHeading(z);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۥ, reason: not valid java name and contains not printable characters */
    public static float m104(Object obj) {
        if (C0234.m9461() < 0) {
            return ((Menu.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۡۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static a6.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m105() {
        if (C0057.m2142() >= 0) {
            return a6.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۤۧ, reason: not valid java name and contains not printable characters */
    public static void m106(Object obj, Object obj2) {
        if (C0127.m4950() > 0) {
            ((DeflaterOutputStream) obj).write((byte[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۥ, reason: not valid java name and contains not printable characters */
    public static WeakHashMap m107() {
        if (C0176.m7290() > 0) {
            return wr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۥ, reason: not valid java name and contains not printable characters */
    public static void m108(Object obj) {
        if (C0049.m1767() < 0) {
            ((Animatable) obj).stop();
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static XC_LoadPackage.LoadPackageParam m109(Object obj) {
        if (C0194.m7889() >= 0) {
            return ((lc) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static Location m110(Object obj) {
        if (C0213.m8458() > 0) {
            return ((qq) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static Object m111(Object obj, Object obj2) {
        if (C0149.m6476() <= 0) {
            return ((Parcelable.Creator) obj).createFromParcel((Parcel) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m112(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۤۡۡۦ, reason: not valid java name and contains not printable characters */
    public static void m113(Object obj, Object obj2) {
        if (C0117.m4419() < 0) {
            ((wq) obj).e(obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۡۦۤ, reason: not valid java name and contains not printable characters */
    public static Rect m114(Object obj) {
        if (C0227.m9046() > 0) {
            return s7.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Drawable) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۦ, reason: not valid java name and contains not printable characters */
    public static View m115(Object obj, Object obj2, Object obj3) {
        if (C0120.m4608() > 0) {
            return ((wr.l) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj2, (KeyEvent) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۢۦ, reason: not valid java name and contains not printable characters */
    public static void m116(Object obj) {
        if (C0117.m4419() <= 0) {
            ((jr) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۟ۤۤۨ۠, reason: not valid java name and contains not printable characters */
    public static void m117(Object obj, Object obj2, Object obj3) {
        if (C0106.m3835() >= 0) {
            ((Bundle) obj).putSerializable((String) obj2, (Serializable) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۥۣ۠, reason: not valid java name and contains not printable characters */
    public static int m118(Object obj, int i, int i2) {
        if (C0009.m276() < 0) {
            return ((ListView) obj).pointToPosition(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۧۧۥ, reason: not valid java name and contains not printable characters */
    public static void m120(Object obj) {
        if (C0213.m8458() > 0) {
            ((ObjectInputStream) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static boolean m121(Object obj, Object obj2, Object obj3) {
        if (C0200.m8104() <= 0) {
            return ContextCompat.startActivities((Context) obj, (Intent[]) obj2, (Bundle) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static void m122(Object obj) {
        if (C0195.m7914() >= 0) {
            u0.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((u0) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m123(Object obj, Object obj2, Object obj3) {
        if (C0188.m7736() < 0) {
            return ((ActionMode.Callback) obj).onPrepareActionMode((ActionMode) obj2, (android.view.Menu) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۢۤۨ, reason: not valid java name and contains not printable characters */
    public static tf m124(Object obj, Object obj2) {
        if (C0171.m7136() <= 0) {
            return ((tf) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ck) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۡۡ, reason: not valid java name and contains not printable characters */
    public static Shader.TileMode m125() {
        if (C0161.m6744() >= 0) {
            return Shader.TileMode.REPEAT;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۧ۟, reason: not valid java name and contains not printable characters */
    public static void m126(Object obj) {
        if (C0202.m8245() >= 0) {
            hm.h((hm) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۧۤ۟, reason: not valid java name and contains not printable characters */
    public static float m127(Object obj) {
        if (m139() < 0) {
            return ((us) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static void m128(Object obj, boolean z) {
        if (C0093.m3365() >= 0) {
            q7.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Drawable) obj, z);
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۥۤ, reason: not valid java name and contains not printable characters */
    public static String m129(Object obj, Object obj2) {
        if (C0058.m2184() > 0) {
            return ((JSONObject) obj).getString((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static boolean m130(Object obj, Object obj2) {
        if (C0107.m3883() >= 0) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۥۡ, reason: not valid java name and contains not printable characters */
    public static void m131(Object obj, boolean z) {
        if (C0201.m8184() < 0) {
            ((s8) obj).W(z);
        }
    }

    /* JADX INFO: renamed from: ۟ۧۦۣۤ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m132(Object obj, Object obj2) {
        if (C0119.m4573() >= 0) {
            return ((StringBuilder) obj).append(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۧ, reason: not valid java name and contains not printable characters */
    public static Class[] m133(Object obj) {
        if (C0057.m2142() > 0) {
            return ((Method) obj).getParameterTypes();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۨ, reason: not valid java name and contains not printable characters */
    public static List m134(Object obj, Object obj2, boolean z, int i) {
        if (C0053.m1959() >= 0) {
            return mo.a0((CharSequence) obj, (String) obj2, z, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨ۟۟, reason: not valid java name and contains not printable characters */
    public static void m135(Object obj, Object obj2) {
        if (C0021.m740() < 0) {
            C0235.m9498((View) obj, (l2.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡ۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static y4 m136(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        if (C0068.m2650() >= 0) {
            return sq.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TypedArray) obj, (XmlPullParser) obj2, (Resources.Theme) obj3, (String) obj4, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۥۥ, reason: not valid java name and contains not printable characters */
    public static int m137(Object obj) {
        if (C0039.m1515() < 0) {
            return ((m9.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢ۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static void m138(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0062.m2326() > 0) {
            ((lf.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj2, (FileDescriptor) obj3, (PrintWriter) obj4, (String[]) obj5);
        }
    }

    /* JADX INFO: renamed from: ۢۡۡ۠, reason: not valid java name and contains not printable characters */
    public static int m139() {
        return 566 ^ C0164.f614;
    }

    /* JADX INFO: renamed from: ۢۤۧ, reason: not valid java name and contains not printable characters */
    public static void m140(Object obj, Object obj2) {
        if (C0036.m1332() <= 0) {
            ((f6.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).h(obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static Object m141(Object obj, Object obj2) {
        if (C0211.m8341() > 0) {
            return pj.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۦۧ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m142(Object obj, Object obj2) {
        if (C0161.m6744() > 0) {
            return ((ByteBuffer) obj).get((byte[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡ۠, reason: not valid java name and contains not printable characters */
    public static String m143(Object obj) {
        if (C0108.m4038() >= 0) {
            return ((RuntimeException) obj).getMessage();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۥۡۥ, reason: not valid java name and contains not printable characters */
    public static void m144(Object obj) {
        if (C0021.m740() <= 0) {
            ((e) obj).c();
        }
    }

    /* JADX INFO: renamed from: ۤۦ۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m145(Object obj) {
        if (C0097.m3659() >= 0) {
            return ((m2) obj).h;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۠ۨ۟, reason: contains not printable characters */
    public static qa m146(Object obj) {
        if (C0066.m2514() >= 0) {
            return ((nq) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۟۠, reason: contains not printable characters */
    public static int m147(int i) {
        if (C0161.m6744() >= 0) {
            return Integer.highestOneBit(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۣ۠۟, reason: contains not printable characters */
    public static void m148(Object obj) {
        if (C0243.m9964() > 0) {
            ((fs) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۥۥۣۢ, reason: contains not printable characters */
    public static void m149(Object obj, char c, Object obj2) {
        if (C0009.m276() <= 0) {
            mk.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ArrayList) obj, c, (float[]) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۥۤ۠, reason: contains not printable characters */
    public static hn m150(Object obj) {
        if (C0095.m3478() <= 0) {
            return mo.N((CharSequence) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧ۠ۧ, reason: contains not printable characters */
    public static Intent m151(Object obj) {
        if (C0014.m545() >= 0) {
            return ej.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Activity) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۥۢ, reason: contains not printable characters */
    public static boolean m152(Object obj) {
        if (C0095.m3478() <= 0) {
            return ((i) obj).r();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۣ۠ۤ, reason: contains not printable characters */
    public static Map m153(Object obj) {
        if (C0238.m9653() >= 0) {
            return Collections.unmodifiableMap((Map) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۢۧ, reason: contains not printable characters */
    public static void m154(Object obj, Object obj2) {
        if (C0107.m3883() > 0) {
            ((i) obj).H((CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۤۢ, reason: contains not printable characters */
    public static String m155(Object obj) {
        if (C0178.m7344() < 0) {
            return ((gi) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧۥ۠, reason: contains not printable characters */
    public static boolean m156(Object obj) {
        if (C0129.m5108() >= 0) {
            return ((v0) obj).A;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m157(Object obj, Object obj2, int i, boolean z, int i2) {
        if (C0064.m2388() >= 0) {
            return lo.p((String) obj, (String) obj2, i, z, i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۦۥۣ, reason: not valid java name and contains not printable characters */
    public static SparseArray m158(Object obj, Object obj2) {
        if (C0036.m1332() <= 0) {
            return ((i) obj).g((View) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static v0.l m159(Object obj) {
        if (C0225.m9001() >= 0) {
            return ((v0) obj).o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۢۡ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m160(Object obj, int i) {
        if (C0053.m1959() >= 0) {
            return mp.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۥۡ, reason: not valid java name and contains not printable characters */
    public static void m161(Object obj) {
        if (C0094.m3450() >= 0) {
            ((jf) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۨۤۥۣ, reason: not valid java name and contains not printable characters */
    public static m9.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa[] m162(Object obj) {
        if (C0164.m6900() < 0) {
            return ((m9.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۥۤ, reason: not valid java name and contains not printable characters */
    public static void m163(Object obj, Object obj2) {
        if (C0070.m2829() < 0) {
            q7.g((Drawable) obj, (PorterDuff.Mode) obj2);
        }
    }

    /* JADX INFO: renamed from: ۨۨ۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m164(Object obj) {
        if (C0069.m2756() <= 0) {
            return String.valueOf(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۧ۠, reason: not valid java name and contains not printable characters */
    public static String m119(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
