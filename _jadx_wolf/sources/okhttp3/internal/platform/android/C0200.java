package okhttp3.internal.platform.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.PathMeasure;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import android.support.v4.app.C0004;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0009;
import android.support.v4.graphics.drawable.C0010;
import android.text.Spannable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.activity.C0014;
import androidx.activity.C0020;
import androidx.annotation.C0023;
import androidx.annotation.C0024;
import androidx.annotation.C0025;
import androidx.appcompat.app.C0035;
import androidx.appcompat.app.C0036;
import androidx.appcompat.app.C0037;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.C0047;
import androidx.core.app.C0051;
import androidx.core.app.C0052;
import androidx.core.app.C0053;
import androidx.core.app.C0055;
import androidx.core.content.C0057;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0064;
import androidx.core.graphics.drawable.C0066;
import androidx.core.widget.C0068;
import androidx.drawerlayout.widget.C0070;
import androidx.drawerlayout.widget.C0072;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0079;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0096;
import androidx.fragment.app.C0097;
import androidx.fragment.app.C0099;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0106;
import androidx.lifecycle.C0108;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0118;
import androidx.profileinstaller.C0119;
import androidx.savedstate.C0123;
import androidx.savedstate.C0126;
import androidx.versionedparcelable.C0129;
import androidx.versionedparcelable.C0133;
import com.example.vcam.C0141;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.HookMain;
import com.example.vcam.Menu;
import com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.Cif;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.b0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.b7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.de;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ic;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ll;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ml;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.op;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ug;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.uo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.up;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ws;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zp;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import okhttp3.C0238;
import okhttp3.HttpUrl;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.io.C0195;
import okhttp3.internal.io.C0199;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0236;
import retrofit2.converter.scalars.C0243;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: okhttp3.internal.platform.android.ۣ۟۟۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0200 {

    /* JADX INFO: renamed from: ۟ۥۣۥۣ, reason: not valid java name and contains not printable characters */
    public static int f650 = -882;

    /* JADX INFO: renamed from: ۟۟ۡۢۧ, reason: not valid java name and contains not printable characters */
    public static Throwable m8052(Object obj) {
        if (C0058.m2184() >= 0) {
            return ((e.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static Thread m8053(Object obj, Object obj2) {
        if (C0164.m6900() < 0) {
            return i5.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj, (Runnable) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤۤ۠, reason: not valid java name and contains not printable characters */
    public static l m8054(Object obj) {
        if (C0096.m3601() < 0) {
            return ((i.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧۢۤ, reason: not valid java name and contains not printable characters */
    public static op[] m8055(Object obj) {
        if (C0047.m1663() < 0) {
            return ((tp) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static void m8056(Object obj, int i) {
        if (C0115.m4218() < 0) {
            ((AccessibilityNodeInfo) obj).addAction(i);
        }
    }

    /* JADX INFO: renamed from: ۟۠۠ۨ۟, reason: not valid java name and contains not printable characters */
    public static dd m8057(Object obj, int i, int i2, int i3, int i4) {
        if (C0202.m8245() >= 0) {
            return xs.b((dd) obj, i, i2, i3, i4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۦۢ, reason: not valid java name and contains not printable characters */
    public static void m8058(Object obj, Object obj2, long j) {
        if (C0004.m139() < 0) {
            ((s2) obj).write((s2) obj2, j);
        }
    }

    /* JADX INFO: renamed from: ۟۠ۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m8059(Object obj) {
        if (C0010.m354() < 0) {
            ((NoSuchFieldException) obj).printStackTrace();
        }
    }

    /* JADX INFO: renamed from: ۟۠ۢۥۦ, reason: not valid java name and contains not printable characters */
    public static int m8060(Object obj) {
        if (C0123.m4841() <= 0) {
            return ((ByteArrayOutputStream) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠ۧۤۦ, reason: not valid java name and contains not printable characters */
    public static xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m8061(Object obj) {
        if (C0010.m354() <= 0) {
            return ((ll) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۦۧ, reason: not valid java name and contains not printable characters */
    public static int[] m8062() {
        if (C0078.m3044() <= 0) {
            return ml.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۢۥ, reason: not valid java name and contains not printable characters */
    public static TimeUnit m8063() {
        if (C0141.m5769() >= 0) {
            return TimeUnit.MILLISECONDS;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧ۟, reason: not valid java name and contains not printable characters */
    public static Configuration m8064(Object obj) {
        if (C0243.m9964() > 0) {
            return ((Resources) obj).getConfiguration();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۧۨ, reason: not valid java name and contains not printable characters */
    public static int m8065(Object obj) {
        if (C0099.m3752() < 0) {
            return ((sr) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۡۨ۟, reason: not valid java name and contains not printable characters */
    public static boolean m8066(Object obj) {
        if (C0096.m3601() <= 0) {
            return ((v0) obj).J0();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۤۡ, reason: not valid java name and contains not printable characters */
    public static Intent m8067(Object obj, Object obj2) {
        if (C0097.m3659() >= 0) {
            return ((b0.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥ۟۟, reason: not valid java name and contains not printable characters */
    public static float m8068(Object obj) {
        if (C0014.m545() >= 0) {
            return ((pr.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۢۥۡۢ, reason: not valid java name and contains not printable characters */
    public static tm.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m8069(Object obj, Object obj2) {
        if (C0014.m545() > 0) {
            return ((tm) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۡ۠, reason: not valid java name and contains not printable characters */
    public static q.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m8070(Object obj) {
        if (C0243.m9964() > 0) {
            return ((ws) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static void m8071(Object obj, Object obj2) {
        if (C0178.m7344() <= 0) {
            ((Cif) obj).d((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static void m8072(Object obj, boolean z) {
        if (C0037.m1437() <= 0) {
            ((View) obj).setHasTransientState(z);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۦۥ, reason: not valid java name and contains not printable characters */
    public static int m8073(Object obj) {
        if (C0249.m10052() < 0) {
            return ((SparseArray) obj).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۣ۟۟, reason: not valid java name and contains not printable characters */
    public static PathMeasure m8074(Object obj) {
        if (C0006.m169() <= 0) {
            return ((pr.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۥ, reason: not valid java name and contains not printable characters */
    public static Collection m8075(Object obj) {
        if (C0036.m1332() < 0) {
            return d4.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Object[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۣۧ, reason: not valid java name and contains not printable characters */
    public static void m8076(Object obj) {
        if (C0108.m4038() > 0) {
            ((ConnectionBlocker) obj).d();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۨۢۨ, reason: not valid java name and contains not printable characters */
    public static void m8077(Object obj, Object obj2) {
        if (C0009.m276() < 0) {
            ((y9) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Fragment) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۤ۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static long m8078(Object obj) {
        if (C0023.m843() > 0) {
            return ((pq) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤ۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static Object[] m8079(Object obj, Object obj2) {
        if (C0072.m2856() <= 0) {
            return ((ArrayList) obj).toArray((Object[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۧ, reason: not valid java name and contains not printable characters */
    public static Intent m8080(Object obj, Object obj2, Object obj3) {
        if (C0195.m7914() >= 0) {
            return ((Context) obj).registerReceiver((BroadcastReceiver) obj2, (IntentFilter) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۤ۠, reason: not valid java name and contains not printable characters */
    public static int m8081(Object obj) {
        if (C0249.m10052() <= 0) {
            return ((SeekBar) obj).getWidth();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۧ۠ۤ, reason: not valid java name and contains not printable characters */
    public static XC_LoadPackage.LoadPackageParam m8082(Object obj) {
        if (C0169.m7034() < 0) {
            return ((HookMain.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static long m8083(Object obj) {
        if (C0079.m3072() <= 0) {
            return ((up) obj).timeoutNanos();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۣۢۦ, reason: not valid java name and contains not printable characters */
    public static int m8084(Object obj) {
        if (C0199.m7998() < 0) {
            return r8.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((InputStream) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۢۦۤ, reason: not valid java name and contains not printable characters */
    public static Object m8085(Object obj) {
        if (C0052.m1890() > 0) {
            return ((xd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۣۢ, reason: not valid java name and contains not printable characters */
    public static void m8086(Object obj, Object obj2) {
        if (C0161.m6744() > 0) {
            ((l2) obj).m((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m8087(Object obj) {
        if (C0188.m7736() <= 0) {
            return ((StringBuilder) obj).length();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۥۥ۠, reason: not valid java name and contains not printable characters */
    public static int m8088(Object obj) {
        if (C0051.m1783() < 0) {
            return ((uo.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۡۡ۠, reason: not valid java name and contains not printable characters */
    public static String m8089(Object obj, Object obj2) {
        if (C0096.m3601() <= 0) {
            return ((Base64.Encoder) obj).encodeToString((byte[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۢۥ, reason: not valid java name and contains not printable characters */
    public static KeyListener m8090(Object obj, Object obj2) {
        if (C0058.m2184() >= 0) {
            return ((a8.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((KeyListener) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۡۡ, reason: not valid java name and contains not printable characters */
    public static int m8091(Object obj) {
        if (C0099.m3752() < 0) {
            return ((Drawable) obj).getLevel();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m8092(Object obj) {
        if (C0097.m3659() >= 0) {
            return ((HookMain) obj).J();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡۡ, reason: not valid java name and contains not printable characters */
    public static int m8093(Object obj) {
        if (C0126.m4908() <= 0) {
            return ((WindowInsets) obj).getSystemWindowInsetRight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢۥ, reason: not valid java name and contains not printable characters */
    public static int m8094(Object obj, Object obj2) {
        if (m8104() <= 0) {
            return ((String) obj).indexOf((String) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦ۠, reason: not valid java name and contains not printable characters */
    public static Interpolator m8095() {
        if (C0113.m4144() < 0) {
            return ws.s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۡۥ, reason: not valid java name and contains not printable characters */
    public static boolean m8096(Object obj, Object obj2) {
        if (C0014.m545() >= 0) {
            return ((Drawable) obj).setState((int[]) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۦۣۤ, reason: not valid java name and contains not printable characters */
    public static CharSequence m8097(Object obj, int i, int i2) {
        if (C0133.m5208() <= 0) {
            return ((Spannable) obj).subSequence(i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۧۨ, reason: not valid java name and contains not printable characters */
    public static ThreadLocal m8098() {
        if (C0218.m8760() >= 0) {
            return m4.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static v0 m8099(Object obj) {
        if (C0024.m896() >= 0) {
            return v0.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m8100(Object obj) {
        if (C0035.m1268() <= 0) {
            return ((dn) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۨۤ۟, reason: not valid java name and contains not printable characters */
    public static Context m8101(Object obj) {
        if (C0025.m934() > 0) {
            return ((ic) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۡۦ, reason: not valid java name and contains not printable characters */
    public static f6.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m8102(Object obj) {
        if (C0129.m5108() > 0) {
            return ((f6) obj).A();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۥۨ, reason: not valid java name and contains not printable characters */
    public static void m8103(Object obj, Object obj2) {
        if (C0094.m3450() >= 0) {
            ((View) obj).setTag(obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۥۣۣ, reason: not valid java name and contains not printable characters */
    public static int m8104() {
        return 727 ^ C0006.f6;
    }

    /* JADX INFO: renamed from: ۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static int m8105(Object obj) {
        if (C0068.m2650() > 0) {
            return ((qo) obj).k;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۤۥۣ, reason: not valid java name and contains not printable characters */
    public static de m8106(Object obj) {
        if (C0126.m4908() <= 0) {
            return ((kotlin.jvm.internal.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).getOwner();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۟, reason: not valid java name and contains not printable characters */
    public static String m8108(Object obj) {
        if (C0236.m9615() > 0) {
            return wr.t((View) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m8109(int i, int i2) {
        if (C0238.m9653() >= 0) {
            return n4.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۥۡۡ, reason: not valid java name and contains not printable characters */
    public static void m8110(Object obj, int i) {
        if (C0066.m2514() > 0) {
            kp.a((TextView) obj, i);
        }
    }

    /* JADX INFO: renamed from: ۢۨۤ۟, reason: not valid java name and contains not printable characters */
    public static void m8111(Object obj, Object obj2, Object obj3) {
        if (C0057.m2142() >= 0) {
            ((lg) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj2, obj3);
        }
    }

    /* JADX INFO: renamed from: ۣۣۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m8112(Object obj) {
        if (C0064.m2388() >= 0) {
            return ((AccessibilityNodeInfo) obj).isClickable();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣۢۤ, reason: not valid java name and contains not printable characters */
    public static AppCompatCheckedTextView m8113(Object obj, Object obj2, Object obj3) {
        if (C0195.m7914() > 0) {
            return ((m1) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj2, (AttributeSet) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m8114(Object obj) {
        if (C0074.m2951() < 0) {
            return ((hc) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m8115(Object obj, int i) {
        if (C0072.m2856() < 0) {
            return ((zp) obj).f(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤ۠۟, reason: not valid java name and contains not printable characters */
    public static Bundle m8116(Object obj) {
        if (C0020.m701() >= 0) {
            return ((Cursor) obj).getExtras();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۦۡ, reason: not valid java name and contains not printable characters */
    public static int m8117(int i) {
        if (C0004.m139() <= 0) {
            return SdkExtensions.getExtensionVersion(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static Stream m8118(Object obj) {
        if (C0055.m2054() >= 0) {
            return ((List) obj).stream();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۨۧ, reason: not valid java name and contains not printable characters */
    public static int m8119(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤۨۨ۠, reason: not valid java name and contains not printable characters */
    public static Object m8120(Object obj, int i) {
        if (C0053.m1959() >= 0) {
            return ((ArrayList) obj).get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۧۤ, reason: contains not printable characters */
    public static void m8121(Object obj) {
        if (C0181.m7445() > 0) {
            ((d1) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۧۨ, reason: contains not printable characters */
    public static void m8122(Object obj, boolean z) {
        if (C0070.m2829() <= 0) {
            HookMain.m5405((HookMain) obj, z);
        }
    }

    /* JADX INFO: renamed from: ۥ۠ۦۦ, reason: contains not printable characters */
    public static Menu m8123(Object obj) {
        if (C0218.m8760() > 0) {
            return ((ug) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۢ۟, reason: contains not printable characters */
    public static int m8124(Object obj, Object obj2, Object obj3) {
        if (C0236.m9615() >= 0) {
            return ((bo.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).r((int[]) obj2, (Drawable) obj3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۢۥۨ, reason: contains not printable characters */
    public static int[] m8125() {
        if (C0119.m4573() >= 0) {
            return ml.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۣ۠, reason: contains not printable characters */
    public static int m8126(Object obj) {
        if (C0097.m3659() > 0) {
            return ((uo.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۤۡۥ, reason: contains not printable characters */
    public static String m8127(String str) {
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
        String str3 = "a";
        while (str3.length() > 0) {
            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (HttpUrl.FRAGMENT_ENCODE_SET.length() == 0) {
                str3 = "a";
            }
        }
        int length = str3.length();
        int length2 = str2.length();
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str2.charAt(i3 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = HttpUrl.FRAGMENT_ENCODE_SET.length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۥۦۢ۟, reason: contains not printable characters */
    public static f2 m8128(Object obj) {
        if (C0106.m3835() > 0) {
            return ((f2.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۨۤ, reason: contains not printable characters */
    public static boolean m8129(Object obj) {
        if (C0108.m4038() >= 0) {
            return ((qm) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۦۥ۟, reason: contains not printable characters */
    public static int m8130(Object obj, Object obj2) {
        if (C0009.m276() <= 0) {
            return ((f6) obj).x((f6.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧ۟۠, reason: not valid java name and contains not printable characters */
    public static fr m8131() {
        if (C0118.m4454() > 0) {
            return fr.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static void m8132(Object obj, boolean z) {
        if (C0051.m1783() < 0) {
            ((b7) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(z);
        }
    }

    /* JADX INFO: renamed from: ۧۤۤۤ, reason: not valid java name and contains not printable characters */
    public static boolean m8133(Object obj) {
        if (C0172.m7180() > 0) {
            return ((vo) obj).isActionViewExpanded();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static CharSequence m8134(Object obj) {
        if (C0225.m9001() > 0) {
            return ((uo.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۢۤ, reason: not valid java name and contains not printable characters */
    public static PrintStream m8135() {
        if (C0118.m4454() > 0) {
            return System.out;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m8136(Object obj) {
        if (C0117.m4419() < 0) {
            return ((i) obj).o();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m8137(Object obj, long j) {
        if (C0057.m2142() > 0) {
            return ((vf.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(j);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۧۨ۟, reason: not valid java name and contains not printable characters */
    public static List m8138(Object obj) {
        if (C0172.m7180() > 0) {
            return l4.C((Collection) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۦۥ, reason: not valid java name and contains not printable characters */
    public static String m8107(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
