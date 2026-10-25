package androidx.core.app;

import android.app.Activity;
import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.provider.Settings;
import android.support.v4.graphics.drawable.C0009;
import android.support.v4.graphics.drawable.C0010;
import android.text.StaticLayout;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContentInfo;
import android.view.Menu;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.window.BackEvent;
import androidx.activity.C0020;
import androidx.activity.C0021;
import androidx.annotation.C0025;
import androidx.annotation.C0026;
import androidx.appcompat.app.C0034;
import androidx.appcompat.app.C0037;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.core.content.C0057;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0064;
import androidx.core.graphics.drawable.C0065;
import androidx.core.graphics.drawable.C0066;
import androidx.core.widget.C0068;
import androidx.drawerlayout.widget.C0070;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0079;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0095;
import androidx.fragment.app.Fragment;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0118;
import androidx.profileinstaller.C0119;
import androidx.savedstate.C0123;
import androidx.startup.C0128;
import com.example.vcam.C0141;
import com.example.vcam.HookMain;
import com.example.vcam.LicenseManager;
import com.example.vcam.MainActivity;
import com.example.vcam.VideoToFrames;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.b;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.b0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ch;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.et;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ti;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vb;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ws;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import okhttp3.C0238;
import okhttp3.C0239;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.internal.C0227;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0231;
import okhttp3.logging.C0233;
import okhttp3.logging.C0234;
import okhttp3.logging.C0236;
import org.xmlpull.v1.XmlPullParser;
import retrofit2.C0259;

/* JADX INFO: renamed from: androidx.core.app.ۣ۟ۤۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0053 {

    /* JADX INFO: renamed from: ۣۨۨۦ, reason: not valid java name and contains not printable characters */
    public static int f47 = -52;

    /* JADX INFO: renamed from: ۣ۟۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static String m1930(Object obj) {
        if (C0026.m1047() > 0) {
            return ((Fragment) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static void m1931(Object obj, int i) {
        if (C0164.m6900() <= 0) {
            ((rn) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۤۦ۠, reason: not valid java name and contains not printable characters */
    public static int m1932(Object obj) {
        if (C0010.m354() <= 0) {
            return ((b.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۥ۠ۡ, reason: not valid java name and contains not printable characters */
    public static TypedValue m1933(Object obj) {
        if (C0233.m9365() <= 0) {
            return ((ContentFrameLayout) obj).getFixedWidthMajor();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۦۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1934(Object obj, int i, Object obj2, int i2, int i3) {
        if (C0199.m7998() < 0) {
            return ((String) obj).regionMatches(i, (String) obj2, i2, i3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static OutputConfiguration m1935() {
        if (C0238.m9653() >= 0) {
            return HookMain.outputConfiguration;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۠۟, reason: not valid java name and contains not printable characters */
    public static Surface m1936() {
        if (C0119.m4573() >= 0) {
            return HookMain.c2_reader_Surfcae;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static HashMap m1937(Object obj) {
        if (C0169.m7034() <= 0) {
            return ((v9) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۨ۠, reason: not valid java name and contains not printable characters */
    public static int m1938(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static Iterator m1939(Object obj) {
        if (C0238.m9653() >= 0) {
            return ((Iterable) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۥ۠, reason: not valid java name and contains not printable characters */
    public static void m1940(Object obj) {
        if (C0115.m4218() < 0) {
            ((u7.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۟ۡۢۢۢ, reason: not valid java name and contains not printable characters */
    public static ClassCastException m1941(Object obj) {
        if (C0025.m934() >= 0) {
            return rq.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ClassCastException) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m1942(Object obj, long j, Object obj2, int i, int i2) {
        if (C0065.m2448() >= 0) {
            return ((s2) obj).Q(j, (a3) obj2, i, i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۦ, reason: not valid java name and contains not printable characters */
    public static boolean m1943(Object obj, Object obj2) {
        if (C0201.m8184() < 0) {
            return ((d9) obj).contains(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۡ, reason: not valid java name and contains not printable characters */
    public static lg m1944(Object obj) {
        if (C0079.m3072() <= 0) {
            return ((x1) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۤ۟, reason: not valid java name and contains not printable characters */
    public static Button m1945(Object obj) {
        if (C0037.m1437() <= 0) {
            return ((MainActivity) obj).B;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۨۤ, reason: not valid java name and contains not printable characters */
    public static rd m1946(Object obj) {
        if (C0118.m4454() >= 0) {
            return ((sd) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦ۠ۨ, reason: not valid java name and contains not printable characters */
    public static byte[] m1947() {
        if (C0094.m3450() >= 0) {
            return xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۣۣ, reason: not valid java name and contains not printable characters */
    public static int m1948(Object obj) {
        if (C0066.m2514() >= 0) {
            return ((n2) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۨۢۤ, reason: not valid java name and contains not printable characters */
    public static void m1949(Object obj) {
        if (C0182.m7528() <= 0) {
            v0.b.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((mf) obj);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m1950(Object obj, int i, int i2) {
        if (C0123.m4841() < 0) {
            ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).g(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۦۥ, reason: not valid java name and contains not printable characters */
    public static Menu m1951(Object obj) {
        if (C0231.m9265() > 0) {
            return ((ws.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦ۠۟, reason: not valid java name and contains not printable characters */
    public static Object m1952(Object obj, Object obj2, Object obj3) {
        if (C0009.m276() < 0) {
            return ((xd) obj).Z((sc) obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۤۢ, reason: not valid java name and contains not printable characters */
    public static Bundle m1953(Object obj) {
        if (C0118.m4454() > 0) {
            return ((v0.k) obj).i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۥ۟, reason: not valid java name and contains not printable characters */
    public static int m1954(Object obj) {
        if (C0074.m2951() <= 0) {
            return ((s6) obj).f();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۧۡۨ, reason: not valid java name and contains not printable characters */
    public static HookMain m1955(Object obj) {
        if (C0187.m7613() > 0) {
            return ((vb) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۟۠, reason: not valid java name and contains not printable characters */
    public static long m1956(Object obj) {
        if (C0234.m9461() <= 0) {
            return ((h2) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static Object m1957(Object obj, Object obj2, Object obj3) {
        if (C0057.m2142() > 0) {
            return l1.e(obj, (String) obj2, obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m1958(char c) {
        if (C0236.m9615() >= 0) {
            return C0058.m2202(c);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static int m1959() {
        return (-720) ^ C0233.f683;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1960(Object obj) {
        if (C0026.m1047() >= 0) {
            return ((AnimationDrawable) obj).isOneShot();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۨۥ, reason: not valid java name and contains not printable characters */
    public static String m1961(Object obj) {
        if (C0037.m1437() < 0) {
            return C0112.m4091((LicenseManager) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۨۦ, reason: not valid java name and contains not printable characters */
    public static String m1962(Object obj, long j) {
        if (C0162.m6837() < 0) {
            return ((s2) obj).Y(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m1963(Object obj) {
        if (C0239.m9805() < 0) {
            rq.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۤۤۦ, reason: not valid java name and contains not printable characters */
    public static long m1964() {
        if (C0200.m8104() < 0) {
            return System.nanoTime();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۥۥۧ, reason: not valid java name and contains not printable characters */
    public static ActionBarContextView m1965(Object obj) {
        if (C0187.m7613() > 0) {
            return ((ws) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۨ, reason: not valid java name and contains not printable characters */
    public static int m1966(Object obj) {
        if (C0162.m6837() < 0) {
            return ((ListView) obj).getHeight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static void m1967(Object obj, int i) {
        if (C0020.m701() >= 0) {
            ((VideoToFrames.Callback) obj).onDecodeFrame(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static PorterDuffColorFilter m1968(Object obj, Object obj2, Object obj3) {
        if (C0225.m9001() >= 0) {
            return ((pr) obj).b((ColorStateList) obj2, (PorterDuff.Mode) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static ti.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m1969() {
        if (C0219.m8794() > 0) {
            return ti.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۡۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1970(Object obj) {
        if (C0093.m3365() >= 0) {
            return ((v0) obj).q0();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥۢۡ۠, reason: not valid java name and contains not printable characters */
    public static int m1971(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (C0070.m2829() <= 0) {
            return ((j0) obj).j((Context) obj2, (Resources) obj3, (XmlPullParser) obj4, (AttributeSet) obj5, (Resources.Theme) obj6);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۤۥۨ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m1972(Object obj) {
        if (C0259.m10136() > 0) {
            return ((qm) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۥۡۢ, reason: not valid java name and contains not printable characters */
    public static Object m1973(Object obj, Object obj2) {
        if (C0191.m7812() > 0) {
            return ((Activity) obj).getSystemService((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۧۦ, reason: not valid java name and contains not printable characters */
    public static ClipDescription m1974(Object obj) {
        if (C0215.m8604() <= 0) {
            return ((bd) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۡۨ, reason: not valid java name and contains not printable characters */
    public static void m1975(Object obj, Object obj2, Object obj3) {
        if (C0219.m8794() >= 0) {
            ((r4) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((k3) obj2, (Throwable) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۦۤۦ, reason: not valid java name and contains not printable characters */
    public static List m1976(Object obj) {
        if (C0116.m4340() >= 0) {
            return ((com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m1977(Object obj, Object obj2, int i, int i2) {
        if (C0068.m2650() >= 0) {
            return ((ByteBuffer) obj).put((byte[]) obj2, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۥ۟, reason: not valid java name and contains not printable characters */
    public static OutputStream m1978(Object obj) {
        if (C0161.m6744() > 0) {
            return ((HttpURLConnection) obj).getOutputStream();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۦۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1979(Object obj) {
        if (C0094.m3450() > 0) {
            return ((Cursor) obj).requery();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۥۥۦ, reason: not valid java name and contains not printable characters */
    public static String m1980(Object obj) {
        if (C0236.m9615() > 0) {
            return ((wf) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۨۥ, reason: not valid java name and contains not printable characters */
    public static void m1981(Object obj) throws IOException {
        if (C0204.m8270() <= 0) {
            ((ParcelFileDescriptor) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۠۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static InputStream m1982(Object obj, int i) {
        if (C0161.m6744() >= 0) {
            return ((Resources) obj).openRawResource(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static xs m1983() {
        if (C0021.m740() <= 0) {
            return xs.c.i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static int m1984(Object obj, int i) {
        if (C0064.m2388() >= 0) {
            return ((u1) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۤۥ۟, reason: not valid java name and contains not printable characters */
    public static void m1985(Object obj, Object obj2, int i, int i2, boolean z, Object obj3) {
        if (C0115.m4218() < 0) {
            ((jq) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj2, i, i2, z, (WindowManager.LayoutParams) obj3);
        }
    }

    /* JADX INFO: renamed from: ۢۦۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m1986(Object obj) {
        if (C0227.m9046() >= 0) {
            return ((uc) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۧۡ۟, reason: not valid java name and contains not printable characters */
    public static float m1987(Object obj) {
        if (C0231.m9265() >= 0) {
            return ((BackEvent) obj).getTouchY();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۢۨۨ, reason: not valid java name and contains not printable characters */
    public static com.example.vcam.Menu m1988(Object obj) {
        if (C0236.m9615() >= 0) {
            return ((ch) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static int m1989(Object obj) {
        if (C0095.m3478() < 0) {
            return ((v0.k) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m1990(Object obj) {
        if (C0010.m354() <= 0) {
            return ((m2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۡۢ۟, reason: not valid java name and contains not printable characters */
    public static void m1991(Object obj) {
        if (C0112.m4054() <= 0) {
            ((t8) obj).g0();
        }
    }

    /* JADX INFO: renamed from: ۣۢۥۧ, reason: not valid java name and contains not printable characters */
    public static hm m1992(Object obj) {
        if (C0065.m2448() > 0) {
            return ((z0) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۥ۟۟, reason: not valid java name and contains not printable characters */
    public static long m1993(Object obj) {
        if (C0194.m7889() > 0) {
            return ((e9) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۦۥ۠, reason: not valid java name and contains not printable characters */
    public static Intent m1994(Object obj, Object obj2, Object obj3) {
        if (C0055.m2054() >= 0) {
            return ((b0) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj2, (String[]) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m1995(Object obj, boolean z, Object obj2, long j) {
        if (C0204.m8270() < 0) {
            ((com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(z, (String) obj2, j);
        }
    }

    /* JADX INFO: renamed from: ۤۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m1996(Object obj) {
        if (C0148.m6464() < 0) {
            return ((et) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۨۨۨ, reason: not valid java name and contains not printable characters */
    public static void m1997(Object obj) {
        if (C0178.m7344() <= 0) {
            ((u7.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۥ۠ۥۧ, reason: contains not printable characters */
    public static ListIterator m1998(Object obj, int i) {
        if (C0078.m3044() <= 0) {
            return ((List) obj).listIterator(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۨ۟, reason: contains not printable characters */
    public static String m1999(Object obj, Object obj2) {
        if (C0141.m5769() > 0) {
            return System.getProperty((String) obj, (String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡ۟ۡ, reason: contains not printable characters */
    public static Class[] m2000() {
        if (C0117.m4419() < 0) {
            return uo.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥ۟ۦ, reason: contains not printable characters */
    public static void m2001(Object obj, Object obj2) {
        if (C0176.m7290() >= 0) {
            ((HttpURLConnection) obj).setRequestMethod((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۥۢ۟, reason: contains not printable characters */
    public static void m2002(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0034.m1206() < 0) {
            ((TextView) obj).setCompoundDrawablesRelative((Drawable) obj2, (Drawable) obj3, (Drawable) obj4, (Drawable) obj5);
        }
    }

    /* JADX INFO: renamed from: ۥۨۧ, reason: contains not printable characters */
    public static int m2003(Object obj, Object obj2) {
        if (C0202.m8245() >= 0) {
            return ((rn) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۨۧ۟, reason: contains not printable characters */
    public static String m2004(String str) {
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

    /* JADX INFO: renamed from: ۦۧۦۤ, reason: contains not printable characters */
    public static StaticLayout.Builder m2005(Object obj, float f, float f2) {
        if (C0149.m6476() <= 0) {
            return ((StaticLayout.Builder) obj).setLineSpacing(f, f2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static Class m2006() {
        if (C0199.m7998() < 0) {
            return vq.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static int m2007(long j) {
        if (C0199.m7998() < 0) {
            return Long.signum(j);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m2008(Object obj) {
        if (C0128.m5064() < 0) {
            wr.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.c((View) obj);
        }
    }

    /* JADX INFO: renamed from: ۧۧۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m2009(Object obj) {
        if (C0148.m6464() <= 0) {
            return ((v0.e) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۦۣ, reason: not valid java name and contains not printable characters */
    public static boolean m2011(Object obj) {
        if (C0240.m9826() > 0) {
            return Settings.canDrawOverlays((Context) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۨ, reason: not valid java name and contains not printable characters */
    public static ContentInfo m2012(Object obj, Object obj2) {
        if (C0070.m2829() < 0) {
            return ((View) obj).performReceiveContent((ContentInfo) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۧ۟, reason: not valid java name and contains not printable characters */
    public static int m2013(Object obj, Object obj2) {
        if (C0021.m740() < 0) {
            return ((lg) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨ۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static String m2010(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
