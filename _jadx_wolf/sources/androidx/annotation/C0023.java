package androidx.annotation;

import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.DataSetObservable;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.MediaCodec;
import android.support.v4.app.C0002;
import android.support.v4.app.C0004;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0009;
import android.support.v4.graphics.drawable.C0010;
import android.support.v4.graphics.drawable.C0011;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.window.BackEvent;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.C0014;
import androidx.activity.C0017;
import androidx.activity.C0021;
import androidx.appcompat.app.C0034;
import androidx.appcompat.app.C0035;
import androidx.appcompat.app.C0037;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0051;
import androidx.core.app.C0053;
import androidx.core.content.C0057;
import androidx.core.graphics.drawable.C0065;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0096;
import androidx.fragment.app.C0099;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0108;
import androidx.lifecycle.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0118;
import androidx.savedstate.C0127;
import androidx.versionedparcelable.C0133;
import androidx.versionedparcelable.C0135;
import com.example.vcam.C0141;
import com.example.vcam.HookMain;
import com.example.vcam.MainActivity;
import com.example.vcam.Menu;
import com.example.vcam.VideoPickerActivity;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.Cif;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ba;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hi;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ur;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.us;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.x9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.LockSupport;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.ws.C0224;
import okhttp3.logging.C0232;
import okhttp3.logging.C0233;
import okhttp3.logging.C0234;
import okhttp3.logging.C0235;
import org.xmlpull.v1.XmlPullParser;
import retrofit2.converter.scalars.C0243;

/* JADX INFO: renamed from: androidx.annotation.۟۠ۥۣۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0023 {

    /* JADX INFO: renamed from: ۟۟ۦۦ۠, reason: not valid java name and contains not printable characters */
    public static int f22 = -736;

    /* JADX INFO: renamed from: ۣ۟۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m785(Object obj, Object obj2) {
        if (C0148.m6464() < 0) {
            ((qo) obj).t((Cursor) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۡۤۥ, reason: not valid java name and contains not printable characters */
    public static void m786(Object obj, Object obj2) {
        if (C0021.m740() < 0) {
            HookMain.m5400((HookMain) obj, (File) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۡۧۦ, reason: not valid java name and contains not printable characters */
    public static void m787(Object obj, int i) {
        if (C0026.m1047() > 0) {
            ((AudioManager) obj).playSoundEffect(i);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۤۤۧ, reason: not valid java name and contains not printable characters */
    public static CopyOnWriteArrayList m788(Object obj) {
        if (C0213.m8458() > 0) {
            return ((hi) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static CharSequence m789(Object obj) {
        if (C0127.m4950() > 0) {
            return ((mo.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static DataSetObservable m790(Object obj) {
        if (C0014.m545() >= 0) {
            return ((hk) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡ۟۠, reason: not valid java name and contains not printable characters */
    public static boolean m791(int i) {
        if (C0051.m1783() < 0) {
            return m0.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۢ۠۠, reason: not valid java name and contains not printable characters */
    public static String m792(Object obj, Object obj2, int i) {
        if (C0243.m9964() >= 0) {
            return xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((byte[]) obj, (byte[]) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۢۡ۟, reason: not valid java name and contains not printable characters */
    public static View m793(Object obj) {
        if (C0172.m7180() >= 0) {
            return ((Fragment) obj).B;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static Charset m794() {
        if (C0117.m4419() <= 0) {
            return s3.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m795(Object obj, Object obj2) {
        if (C0182.m7528() < 0) {
            ((v0) obj).C((OnBackInvokedDispatcher) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۥۧۨ, reason: not valid java name and contains not printable characters */
    public static View m796(Object obj) {
        if (C0011.m458() > 0) {
            return ((r) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۡۨ, reason: not valid java name and contains not printable characters */
    public static void m797(Object obj, int i) {
        if (C0108.m4038() >= 0) {
            ((ImageButton) obj).setBackgroundResource(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static Method m798() {
        if (C0199.m7998() < 0) {
            return uq.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static int m799(Object obj, int i, int i2, Object obj2, boolean z) {
        if (C0025.m934() >= 0) {
            return ((j0.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).u(i, i2, (Drawable) obj2, z);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۤۨۡ, reason: not valid java name and contains not printable characters */
    public static boolean m800(Object obj) {
        if (C0181.m7445() >= 0) {
            return ((x9) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۦ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m801(Object obj) {
        if (C0133.m5208() <= 0) {
            return ((a3) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۧۦۤ, reason: not valid java name and contains not printable characters */
    public static int m802(Object obj, Object obj2) {
        if (C0099.m3752() <= 0) {
            return ((e3) obj).g((us) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۧۨ, reason: not valid java name and contains not printable characters */
    public static s2 m803(Object obj, long j) {
        if (C0182.m7528() < 0) {
            return ((s2) obj).l0(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static String m804(Object obj) {
        if (C0004.m139() < 0) {
            return ((l2.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m805(Object obj) {
        if (C0187.m7613() > 0) {
            return ((y1) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۢۢ, reason: not valid java name and contains not printable characters */
    public static v0.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m806(Object obj) {
        if (C0014.m545() >= 0) {
            return ((v0) obj).n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static void m807(Object obj) {
        if (C0021.m740() <= 0) {
            ((MediaCodec) obj).release();
        }
    }

    /* JADX INFO: renamed from: ۟ۤۡۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean m808(Object obj) {
        if (C0093.m3365() >= 0) {
            return ((File) obj).mkdirs();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۢۢ, reason: not valid java name and contains not printable characters */
    public static void m809(Object obj, Object obj2) {
        if (C0232.m9299() >= 0) {
            ((rr) obj).D((tr) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥۤ, reason: not valid java name and contains not printable characters */
    public static x1 m810(Object obj) {
        if (C0025.m934() >= 0) {
            return ((k0.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۤۢ, reason: not valid java name and contains not printable characters */
    public static xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m811(Object obj) {
        if (C0194.m7889() >= 0) {
            return ((ba) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۧۢ, reason: not valid java name and contains not printable characters */
    public static float[] m812(Object obj) {
        if (C0035.m1268() < 0) {
            return ((zr) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۨ۠, reason: not valid java name and contains not printable characters */
    public static List m813(Object obj, Object obj2, int i) {
        if (C0017.m627() >= 0) {
            return ((PackageManager) obj).queryIntentActivities((Intent) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static void m814(Object obj) {
        if (C0074.m2951() <= 0) {
            ((Animatable) obj).start();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣ۟۠, reason: not valid java name and contains not printable characters */
    public static void m815(Object obj, int i) {
        if (C0057.m2142() > 0) {
            ((ActionBarContextView) obj).setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m816(Object obj) {
        if (C0215.m8604() < 0) {
            ((f6.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).j();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m817(Object obj, Object obj2) {
        if (C0034.m1206() < 0) {
            return ((Set) obj).containsAll((Collection) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۣۡۨ, reason: not valid java name and contains not printable characters */
    public static int m818(Object obj) {
        if (C0074.m2951() < 0) {
            return ((Drawable) obj).getIntrinsicWidth();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m819(Object obj) {
        if (C0065.m2448() >= 0) {
            return ((gp) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۣۤۡ, reason: not valid java name and contains not printable characters */
    public static int m820(Object obj) {
        if (C0218.m8760() > 0) {
            return ((q8) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۨۤۦ, reason: not valid java name and contains not printable characters */
    public static boolean m821() {
        if (C0199.m7998() < 0) {
            return qr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۡۡۤ, reason: not valid java name and contains not printable characters */
    public static Signature[] m822(Object obj) {
        if (C0049.m1767() < 0) {
            return ((PackageInfo) obj).signatures;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۧۦ, reason: not valid java name and contains not printable characters */
    public static int m824(Object obj) {
        if (C0112.m4054() < 0) {
            return ((u1) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۨۦ, reason: not valid java name and contains not printable characters */
    public static tm.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m825(Object obj, Object obj2) {
        if (C0010.m354() < 0) {
            return ((tm.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((tm.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m826(Object obj, Object obj2) {
        if (C0118.m4454() >= 0) {
            return ((Paint) obj).hasGlyph((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m827(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0141.m5769() > 0) {
            ((pr.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Resources) obj2, (AttributeSet) obj3, (Resources.Theme) obj4, (XmlPullParser) obj5);
        }
    }

    /* JADX INFO: renamed from: ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m828(Object obj, Object obj2, int i, int i2, int i3, int i4, int i5, Object obj3) {
        if (C0037.m1437() <= 0) {
            ((hj) obj).e((View) obj2, i, i2, i3, i4, i5, (int[]) obj3);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static boolean m829(Object obj) {
        if (C0148.m6464() <= 0) {
            return C0135.m5316((MainActivity) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m830(Object obj) {
        if (m843() >= 0) {
            LockSupport.park(obj);
        }
    }

    /* JADX INFO: renamed from: ۠ۧۤ۠, reason: not valid java name and contains not printable characters */
    public static int m831(Object obj, int i) {
        if (C0204.m8270() <= 0) {
            return y0.b((Context) obj, i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static vn.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m832(Object obj, Object obj2) {
        if (C0009.m276() < 0) {
            return ((vn) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۡ۠, reason: not valid java name and contains not printable characters */
    public static void m833(Object obj, boolean z) {
        if (C0224.m8861() <= 0) {
            ((Switch) obj).setEnabled(z);
        }
    }

    /* JADX INFO: renamed from: ۡۢ۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m834(Object obj) {
        if (C0113.m4144() < 0) {
            return ((Cif) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۡۢ, reason: not valid java name and contains not printable characters */
    public static float m835(Object obj) {
        if (C0074.m2951() <= 0) {
            return ((RectF) obj).top;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۡۦۨ, reason: not valid java name and contains not printable characters */
    public static boolean m836(Object obj) {
        if (C0069.m2756() < 0) {
            return ((ActionBarContainer) obj).c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static View m837(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0057.m2142() >= 0) {
            return ((k6) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj2, (Cursor) obj3, (ViewGroup) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨ۠۟, reason: not valid java name and contains not printable characters */
    public static y5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m838(Object obj, Object obj2) {
        if (C0199.m7998() < 0) {
            return y5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.C0146x35d57e31.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((y5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj, (y5.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۤۥ, reason: not valid java name and contains not printable characters */
    public static ApplicationInfo m839(Object obj) {
        if (C0051.m1783() < 0) {
            return ((Context) obj).getApplicationInfo();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۡۧ, reason: not valid java name and contains not printable characters */
    public static wr.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m840() {
        if (C0211.m8341() > 0) {
            return wr.F();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۦۢ, reason: not valid java name and contains not printable characters */
    public static String m841(Object obj) {
        if (C0240.m9826() > 0) {
            return ((a9.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m842(Object obj) {
        if (C0053.m1959() >= 0) {
            return ((BackEvent) obj).getSwipeEdge();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static int m843() {
        return (-220) ^ C0235.f685;
    }

    /* JADX INFO: renamed from: ۣ۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static Activity m844(Object obj) {
        if (C0011.m458() > 0) {
            return ((u) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۤۥ, reason: not valid java name and contains not printable characters */
    public static int m845(Object obj) {
        if (C0002.m72() > 0) {
            return wr.o((View) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۥ۟۠, reason: not valid java name and contains not printable characters */
    public static void m846(Object obj) {
        if (C0094.m3450() >= 0) {
            ((f2) obj).enter();
        }
    }

    /* JADX INFO: renamed from: ۣۥۥۢ, reason: not valid java name and contains not printable characters */
    public static void m847(Object obj) {
        if (C0034.m1206() <= 0) {
            ((MainActivity) obj).p0();
        }
    }

    /* JADX INFO: renamed from: ۤ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static Drawable m848(Object obj, Object obj2, int i) {
        if (C0233.m9365() <= 0) {
            return ((hm) obj).j((Context) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۥۥ, reason: contains not printable characters */
    public static int m849(Object obj) {
        if (C0217.m8693() < 0) {
            return ((TextView) obj).getPaddingBottom();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۤ۟ۥ, reason: contains not printable characters */
    public static PropertyValuesHolder[] m850(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0211.m8341() > 0) {
            return m0.h((Context) obj, (Resources) obj2, (Resources.Theme) obj3, (XmlPullParser) obj4, (AttributeSet) obj5);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥ۠ۨ, reason: contains not printable characters */
    public static boolean m851(Object obj) {
        if (C0069.m2756() <= 0) {
            return q7.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Drawable) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۣ۟ۦ, reason: contains not printable characters */
    public static VideoPickerActivity m852(Object obj) {
        if (C0127.m4950() > 0) {
            return ((ur) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۡۡ, reason: contains not printable characters */
    public static void m853(Object obj, Object obj2) {
        if (C0233.m9365() < 0) {
            ((CheckedTextView) obj).setCheckMarkTintList((ColorStateList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۦۦۣۡ, reason: contains not printable characters */
    public static Iterator m854(Object obj) {
        if (C0117.m4419() <= 0) {
            return ((hn) obj).iterator();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۢۢ, reason: contains not printable characters */
    public static Menu m855(Object obj) {
        if (C0025.m934() > 0) {
            return ((zg) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۡۥ, reason: not valid java name and contains not printable characters */
    public static void m856(Object obj, int i) {
        if (C0234.m9461() < 0) {
            ((f6.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
    }

    /* JADX INFO: renamed from: ۧۦۤۧ, reason: not valid java name and contains not printable characters */
    public static float m857(Object obj, int i) {
        if (C0096.m3601() < 0) {
            return ((VelocityTracker) obj).getXVelocity(i);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۨ۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static Typeface m858(Object obj) {
        if (C0031.m1148() <= 0) {
            return ((xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۧۦ, reason: not valid java name and contains not printable characters */
    public static int m859(Object obj) {
        if (C0006.m169() <= 0) {
            return ((fd) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m860(String str) {
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

    /* JADX INFO: renamed from: ۨۤۧۨ, reason: not valid java name and contains not printable characters */
    public static void m861(Object obj, int i) {
        if (C0133.m5208() < 0) {
            ((zr.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).b(i);
        }
    }

    /* JADX INFO: renamed from: ۨۥۦۢ, reason: not valid java name and contains not printable characters */
    public static int m862(Object obj) {
        if (C0182.m7528() < 0) {
            return ((HookMain) obj).imageReaderFormat;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۧۧۡ, reason: not valid java name and contains not printable characters */
    public static int m863(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۧۥ۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m823(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
