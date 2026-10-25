package androidx.savedstate;

import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.support.v4.app.C0004;
import android.text.InputFilter;
import android.text.method.KeyListener;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.widget.AbsListView;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.OverScroller;
import android.widget.TextView;
import androidx.activity.C0014;
import androidx.activity.C0017;
import androidx.annotation.C0023;
import androidx.annotation.C0024;
import androidx.annotation.C0025;
import androidx.annotation.C0026;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0037;
import androidx.appcompat.view.menu.C0039;
import androidx.appcompat.widget.C0047;
import androidx.core.app.C0051;
import androidx.core.app.C0055;
import androidx.core.content.C0057;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0066;
import androidx.core.widget.C0068;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0084;
import androidx.fragment.app.C0099;
import androidx.fragment.app.a;
import androidx.lifecycle.C0106;
import androidx.lifecycle.C0107;
import androidx.lifecycle.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.lifecycle.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0118;
import androidx.profileinstaller.C0119;
import androidx.profileinstaller.C0120;
import androidx.versionedparcelable.C0135;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.LicenseManager;
import com.example.vcam.Menu;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bt;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.c8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.cp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.db;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.er;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ij;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.js;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.yn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zp;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0195;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0231;
import okhttp3.logging.C0232;
import okhttp3.logging.C0234;
import okhttp3.logging.C0236;
import retrofit2.C0259;
import retrofit2.converter.scalars.C0243;

/* JADX INFO: renamed from: androidx.savedstate.ۦۣۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0126 {

    /* JADX INFO: renamed from: ۣ۟ۡۤۤ, reason: not valid java name and contains not printable characters */
    public static int f105 = 60;

    /* JADX INFO: renamed from: ۟۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static js m4854(Object obj, float f) {
        if (C0127.m4950() >= 0) {
            return ((js) obj).e(f);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m4855(Object obj, Object obj2) {
        if (C0058.m2184() > 0) {
            ConnectionBlocker.m5367((ConnectionBlocker) obj, (String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۡۦۣ, reason: not valid java name and contains not printable characters */
    public static ViewParent m4856(Object obj) {
        if (C0023.m843() >= 0) {
            return ((ViewParent) obj).getParent();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۤۤۥ, reason: not valid java name and contains not printable characters */
    public static j6 m4857(Object obj) {
        if (C0014.m545() > 0) {
            return ((xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۧۧ, reason: not valid java name and contains not printable characters */
    public static void m4858(Object obj, Object obj2, boolean z) {
        if (C0169.m7034() <= 0) {
            Menu.m5609((Menu) obj, (CompoundButton) obj2, z);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static Locale m4859(Object obj) {
        if (C0062.m2326() > 0) {
            return ((Configuration) obj).locale;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static s2 m4860(Object obj, Object obj2, long j, long j2) {
        if (C0119.m4573() > 0) {
            return ((s2) obj).m((s2) obj2, j, j2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static XC_LoadPackage.LoadPackageParam m4861(Object obj) {
        if (C0068.m2650() >= 0) {
            return ((dc) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static String m4862(Object obj) {
        if (C0118.m4454() > 0) {
            return ((Parcel) obj).readString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static Throwable m4863(Object obj, Object obj2) {
        if (C0074.m2951() <= 0) {
            return ((Resources.NotFoundException) obj).initCause((Throwable) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۥ۟, reason: not valid java name and contains not printable characters */
    public static boolean m4864(Object obj, Object obj2, Object obj3) {
        if (C0039.m1515() <= 0) {
            return ((kp.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((ResolveInfo) obj2, (Context) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۥۦۢ, reason: not valid java name and contains not printable characters */
    public static MenuItem m4865(Object obj, Object obj2) {
        if (C0234.m9461() < 0) {
            return ((MenuItem) obj).setActionView((View) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m4866(Object obj) {
        if (C0234.m9461() < 0) {
            return ((AccessibilityNodeInfo.AccessibilityAction) obj).getId();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۡۤۧ, reason: not valid java name and contains not printable characters */
    public static int m4867(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۡۢ۟۟, reason: not valid java name and contains not printable characters */
    public static void m4868(Object obj, Object obj2) {
        if (C0194.m7889() > 0) {
            ((ConnectionBlocker) obj).c((ConnectionBlocker.NetworkLog) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۢ, reason: not valid java name and contains not printable characters */
    public static void m4869(Object obj, int i, int i2) {
        if (C0232.m9299() > 0) {
            ((ij) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۧۡ, reason: not valid java name and contains not printable characters */
    public static void m4870(Object obj, boolean z) {
        if (C0181.m7445() >= 0) {
            ((h8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(z);
        }
    }

    /* JADX INFO: renamed from: ۟ۡۨۡۧ, reason: not valid java name and contains not printable characters */
    public static void m4871(Object obj, long j) {
        if (C0240.m9826() > 0) {
            ((Thread) obj).join(j);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m4872(Object obj) {
        if (C0023.m843() >= 0) {
            return ((OverScroller) obj).getFinalX();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static y1 m4873(Object obj) {
        if (C0024.m896() > 0) {
            return ((s8) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨۥ, reason: not valid java name and contains not printable characters */
    public static Object[] m4874(Object obj) {
        if (C0120.m4608() >= 0) {
            return ((y1) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4875(Object obj) {
        if (C0127.m4950() > 0) {
            return ((gd) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۥۣ, reason: not valid java name and contains not printable characters */
    public static long m4876(Object obj) {
        if (C0215.m8604() <= 0) {
            return ((f6.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۤۧۥ, reason: not valid java name and contains not printable characters */
    public static int m4878(Object obj) {
        if (C0004.m139() < 0) {
            return ((cp) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۥۦۢ, reason: not valid java name and contains not printable characters */
    public static boolean m4879(Object obj, boolean z, boolean z2) {
        if (C0026.m1047() >= 0) {
            return ((pr) obj).setVisible(z, z2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static void m4880(Object obj, Object obj2) {
        if (C0031.m1148() <= 0) {
            ((bt) obj).setTintList((ColorStateList) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۦۡ۠, reason: not valid java name and contains not printable characters */
    public static int m4881(int i) {
        if (C0107.m3883() > 0) {
            return Color.green(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۦۡۡ, reason: not valid java name and contains not printable characters */
    public static int m4882(Object obj) {
        if (C0172.m7180() > 0) {
            return l1.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TextView) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣۧۡ, reason: not valid java name and contains not printable characters */
    public static void m4883(Object obj, Object obj2) {
        if (m4908() <= 0) {
            ((a3) obj).h((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۨۧ۟, reason: not valid java name and contains not printable characters */
    public static TypedArray m4884(Object obj) {
        if (C0113.m4144() <= 0) {
            return ((zp) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۧۨ, reason: not valid java name and contains not printable characters */
    public static String m4885(String str) {
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

    /* JADX INFO: renamed from: ۟ۦۧۤۡ, reason: not valid java name and contains not printable characters */
    public static q.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m4886(Object obj) {
        if (C0058.m2184() >= 0) {
            return ((yn) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦ۠, reason: not valid java name and contains not printable characters */
    public static Resources m4887(Object obj) {
        if (C0057.m2142() >= 0) {
            return r7.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Resources.Theme) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥ۠ۢ, reason: not valid java name and contains not printable characters */
    public static StackTraceElement m4888(Object obj) {
        if (C0195.m7914() >= 0) {
            return n6.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((o2) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۡ, reason: not valid java name and contains not printable characters */
    public static TypedArray m4889(Object obj, Object obj2, Object obj3) {
        if (m4908() <= 0) {
            return ((Context) obj).obtainStyledAttributes((AttributeSet) obj2, (int[]) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۤۥ, reason: not valid java name and contains not printable characters */
    public static Drawable m4890(Object obj) {
        if (C0047.m1663() < 0) {
            return q7.i((Drawable) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۦۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4891(Object obj, Object obj2, Object obj3) {
        if (C0069.m2756() < 0) {
            return ((ActionMode.Callback) obj).onCreateActionMode((ActionMode) obj2, (android.view.Menu) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۧۦۨۢ, reason: not valid java name and contains not printable characters */
    public static Bitmap.CompressFormat m4892() {
        if (C0099.m3752() <= 0) {
            return Bitmap.CompressFormat.JPEG;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۥۤ, reason: not valid java name and contains not printable characters */
    public static void m4893(Object obj, boolean z) {
        if (C0169.m7034() < 0) {
            ((EditText) obj).setEnabled(z);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static void m4894(Object obj, float f) {
        if (C0243.m9964() >= 0) {
            ((View) obj).setTranslationY(f);
        }
    }

    /* JADX INFO: renamed from: ۠ۥۣۨ, reason: not valid java name and contains not printable characters */
    public static boolean m4895(Object obj) {
        if (C0199.m7998() < 0) {
            return ((v0) obj).F;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static List m4896(Object obj) {
        if (C0058.m2184() >= 0) {
            return ((j9) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۦۣ, reason: not valid java name and contains not printable characters */
    public static void m4897(Object obj) {
        if (C0037.m1437() < 0) {
            ((i7) obj).d();
        }
    }

    /* JADX INFO: renamed from: ۣۡۢۤ, reason: not valid java name and contains not printable characters */
    public static xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m4898() {
        if (C0116.m4340() > 0) {
            return xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.ON_CREATE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۡ, reason: not valid java name and contains not printable characters */
    public static void m4899(Object obj, Object obj2) {
        if (C0231.m9265() > 0) {
            ((c8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((EditorInfo) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡۥۤۢ, reason: not valid java name and contains not printable characters */
    public static boolean m4900(Object obj) {
        if (C0058.m2184() > 0) {
            return ((LicenseManager) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۡۨ, reason: not valid java name and contains not printable characters */
    public static KeyListener m4901(Object obj, Object obj2) {
        if (C0188.m7736() <= 0) {
            return ((a8) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((KeyListener) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۤۦ, reason: not valid java name and contains not printable characters */
    public static er m4902(Object obj) {
        if (C0259.m10136() >= 0) {
            return z5.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((h6) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static void m4903(Object obj, Object obj2) {
        if (C0204.m8270() < 0) {
            ((ImageButton) obj).setScaleType((ImageView.ScaleType) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۢۢۥ, reason: not valid java name and contains not printable characters */
    public static void m4904(Object obj, int i) {
        if (C0106.m3835() >= 0) {
            ((vo) obj).setShowAsAction(i);
        }
    }

    /* JADX INFO: renamed from: ۣۣۢۢ, reason: not valid java name and contains not printable characters */
    public static Object m4905(Object obj, long j, Object obj2) {
        if (C0057.m2142() >= 0) {
            return ((xf) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(j, obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m4906(Object obj, boolean z) {
        if (C0201.m8184() < 0) {
            u7.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((AbsListView) obj, z);
        }
    }

    /* JADX INFO: renamed from: ۣۤۢۦ, reason: not valid java name and contains not printable characters */
    public static long m4907(Object obj, long j, Object obj2) {
        if (C0017.m627() > 0) {
            return ((TimeUnit) obj).convert(j, (TimeUnit) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤۤۦۢ, reason: not valid java name and contains not printable characters */
    public static int m4908() {
        return 197 ^ C0127.f106;
    }

    /* JADX INFO: renamed from: ۤۦۦ۠, reason: not valid java name and contains not printable characters */
    public static int m4909(Object obj) {
        if (C0225.m9001() >= 0) {
            return ((db) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۠۟ۦ, reason: contains not printable characters */
    public static long m4910(Object obj, Object obj2) {
        if (C0107.m3883() >= 0) {
            return ((Field) obj).getLong(obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۡۨ۠, reason: contains not printable characters */
    public static StringBuilder m4911(Object obj, int i) {
        if (C0191.m7812() > 0) {
            return ((StringBuilder) obj).append(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۤۥ, reason: contains not printable characters */
    public static int m4912(Object obj) {
        if (C0084.m3253() < 0) {
            return ((gm) obj).d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۤ۟ۤ, reason: contains not printable characters */
    public static PropertyValuesHolder m4913(Object obj, Object obj2) {
        if (C0161.m6744() >= 0) {
            return PropertyValuesHolder.ofFloat((String) obj, (float[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤ۠ۧ, reason: contains not printable characters */
    public static void m4914(Object obj, int i, int i2, int i3, int i4) {
        if (C0116.m4340() >= 0) {
            ((EditText) obj).setPadding(i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: ۥۦۤۧ, reason: contains not printable characters */
    public static boolean m4915(Object obj) {
        if (C0135.m5274() < 0) {
            return ((HashMap) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦ۟ۨۧ, reason: contains not printable characters */
    public static boolean m4916(Object obj) {
        if (C0161.m6744() >= 0) {
            return ((v0) obj).X;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۣ۠ۨ, reason: contains not printable characters */
    public static InputFilter[] m4917(Object obj, Object obj2) {
        if (C0191.m7812() >= 0) {
            return ((h8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((InputFilter[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۣۥ, reason: contains not printable characters */
    public static String m4918(Object obj) {
        if (C0074.m2951() < 0) {
            return ((a9.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧ۟ۦ, reason: contains not printable characters */
    public static int m4919(Object obj, Object obj2) {
        if (C0122.m4736() < 0) {
            return ((Paint) obj).getFontMetricsInt((Paint.FontMetricsInt) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧ۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static TransitionSet m4920(Object obj, int i) {
        if (C0051.m1783() <= 0) {
            return ((TransitionSet) obj).setOrdering(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۢۡ, reason: not valid java name and contains not printable characters */
    public static int m4921(Object obj) {
        if (C0119.m4573() >= 0) {
            return ((TypedValue) obj).type;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۧۥۤ, reason: not valid java name and contains not printable characters */
    public static double m4922() {
        if (C0236.m9615() > 0) {
            return rm.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: ۨ۟ۧۥ, reason: not valid java name and contains not printable characters */
    public static int m4923(Object obj, int i, int i2) {
        if (C0176.m7290() >= 0) {
            return ((TypedArray) obj).getInteger(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m4924(Object obj) {
        if (C0023.m843() >= 0) {
            ((a) obj).C0();
        }
    }

    /* JADX INFO: renamed from: ۨۡۤۤ, reason: not valid java name and contains not printable characters */
    public static Drawable m4925(Object obj, Object obj2, Object obj3, int i) {
        if (C0213.m8458() >= 0) {
            return ((z0.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((hm) obj2, (Context) obj3, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۨۡ, reason: not valid java name and contains not printable characters */
    public static SparseArray m4926(Object obj, Object obj2) {
        if (C0047.m1663() < 0) {
            return ((i) obj).i((View) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۦۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4927(char c) {
        if (C0055.m2054() > 0) {
            return Character.isHighSurrogate(c);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۦۧۦ, reason: not valid java name and contains not printable characters */
    public static float m4928(int i) {
        if (C0066.m2514() > 0) {
            return f3.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۨۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m4929(Object obj) {
        if (C0025.m934() >= 0) {
            ((f6.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).m();
        }
    }

    /* JADX INFO: renamed from: ۟ۤۤۡۧ, reason: not valid java name and contains not printable characters */
    public static String m4877(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
