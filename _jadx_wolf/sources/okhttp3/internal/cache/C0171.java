package okhttp3.internal.cache;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.hardware.Camera;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.params.SessionConfiguration;
import android.icu.text.DecimalFormatSymbols;
import android.icu.util.ULocale;
import android.media.Image;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.support.v4.app.C0002;
import android.support.v4.graphics.drawable.C0009;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.activity.C0020;
import androidx.annotation.C0024;
import androidx.annotation.C0025;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0037;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.view.menu.a;
import androidx.appcompat.view.menu.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.appcompat.view.menu.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.appcompat.widget.C0047;
import androidx.core.app.C0051;
import androidx.core.app.C0052;
import androidx.core.app.C0053;
import androidx.core.app.C0055;
import androidx.core.content.C0057;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0064;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0070;
import androidx.drawerlayout.widget.C0072;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0079;
import androidx.emoji2.text.C0083;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0096;
import androidx.lifecycle.C0106;
import androidx.lifecycle.C0107;
import androidx.lifecycle.C0108;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0119;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0123;
import androidx.savedstate.C0126;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0129;
import androidx.versionedparcelable.C0133;
import androidx.versionedparcelable.C0135;
import com.example.vcam.ConnectionBlocker;
import com.example.vcam.HookMain;
import com.example.vcam.MainActivity;
import com.example.vcam.Menu;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.g7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ki;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.sq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.us;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ws;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.y1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import okhttp3.C0239;
import okhttp3.HttpUrl;
import okhttp3.internal.C0227;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.logging.C0235;
import okhttp3.logging.C0236;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import retrofit2.converter.scalars.C0243;

/* JADX INFO: renamed from: okhttp3.internal.cache.ۧ۠ۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0171 {

    /* JADX INFO: renamed from: ۢۢۨۦ, reason: not valid java name and contains not printable characters */
    public static int f621 = -593;

    /* JADX INFO: renamed from: ۣ۟۟۟, reason: not valid java name and contains not printable characters */
    public static Camera m7060() {
        if (C0123.m4841() <= 0) {
            return HookMain.origin_preview_camera;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۢۡ, reason: not valid java name and contains not printable characters */
    public static void m7061(Object obj, int i) {
        if (C0047.m1663() <= 0) {
            ((ImageView) obj).setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۥۣ۟, reason: not valid java name and contains not printable characters */
    public static CameraCaptureSession.StateCallback m7062(Object obj) {
        if (C0053.m1959() >= 0) {
            return ((SessionConfiguration) obj).getStateCallback();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۦۢ, reason: not valid java name and contains not printable characters */
    public static boolean m7063(Object obj, Object obj2) {
        if (C0202.m8245() > 0) {
            return ((JSONObject) obj).getBoolean((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۟ۦۤۦ, reason: not valid java name and contains not printable characters */
    public static int m7064(Object obj) {
        if (C0133.m5208() <= 0) {
            return ((r7.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).i;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۨۢۤ, reason: not valid java name and contains not printable characters */
    public static void m7065(Object obj) {
        if (C0164.m6900() <= 0) {
            ((l1) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۟۠۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static XC_LoadPackage.LoadPackageParam m7066(Object obj) {
        if (C0164.m6900() <= 0) {
            return ((HookMain.v) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static ThreadLocal m7067() {
        if (C0009.m276() < 0) {
            return f8.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static InputContentInfo m7068(Object obj) {
        if (C0239.m9805() < 0) {
            return ((bd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨۦۡ, reason: not valid java name and contains not printable characters */
    public static ImageView m7069(Object obj) {
        if (C0002.m72() >= 0) {
            return ((qo.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static void m7070(Object obj) throws XmlPullParserException, IOException {
        if (C0149.m6476() < 0) {
            m9.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((XmlPullParser) obj);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۡۡ, reason: not valid java name and contains not printable characters */
    public static int[] m7071(Object obj) {
        if (C0025.m934() > 0) {
            return ((g7) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۦ۠, reason: not valid java name and contains not printable characters */
    public static Float m7072(float f) {
        if (C0083.m3188() < 0) {
            return Float.valueOf(f);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۢۡۦ, reason: not valid java name and contains not printable characters */
    public static MenuItem.OnActionExpandListener m7073(Object obj) {
        if (C0181.m7445() >= 0) {
            return ((ki.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static RectF m7074(Object obj) {
        if (C0009.m276() <= 0) {
            return ((qm) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧۧ۠, reason: not valid java name and contains not printable characters */
    public static void m7075(Object obj, Object obj2, Object obj3) {
        if (C0149.m6476() <= 0) {
            ((m1) obj).n((View) obj2, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۢ۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m7076(Object obj, Object obj2, int i) {
        if (C0020.m701() >= 0) {
            k1.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TextView) obj, (int[]) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۢ, reason: not valid java name and contains not printable characters */
    public static boolean m7077(Object obj, int i, int i2, Object obj2, Object obj3) {
        if (C0107.m3883() >= 0) {
            return ((View) obj).dispatchNestedPreScroll(i, i2, (int[]) obj2, (int[]) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۢۢۨۤ, reason: not valid java name and contains not printable characters */
    public static int m7078(Object obj) {
        if (C0052.m1890() >= 0) {
            return ((xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).getCount();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨۧ, reason: not valid java name and contains not printable characters */
    public static s1 m7079() {
        if (C0128.m5064() < 0) {
            return s1.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static HashMap m7080(Object obj) {
        if (C0236.m9615() >= 0) {
            return ((v9) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۡۧ, reason: not valid java name and contains not printable characters */
    public static ULocale m7081(Object obj) {
        if (C0188.m7736() < 0) {
            return ULocale.forLocale((Locale) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨۦ, reason: not valid java name and contains not printable characters */
    public static void m7082(Object obj) {
        if (C0069.m2756() <= 0) {
            ((Rect) obj).setEmpty();
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static void m7083(Object obj) {
        if (C0135.m5274() <= 0) {
            u0.n((Context) obj);
        }
    }

    /* JADX INFO: renamed from: ۣۣۣ۟۠, reason: not valid java name and contains not printable characters */
    public static void m7084(Object obj, Object obj2) {
        if (C0227.m9046() >= 0) {
            ((Drawable) obj).getOutline((Outline) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static void m7085(Object obj, Object obj2) {
        if (C0053.m1959() > 0) {
            ((ws.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static float m7086(Object obj, Object obj2, Object obj3, int i, float f) {
        if (C0211.m8341() > 0) {
            return sq.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TypedArray) obj, (XmlPullParser) obj2, (String) obj3, i, f);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۦۨ, reason: not valid java name and contains not printable characters */
    public static boolean m7087(Object obj, Object obj2, int i, int i2) {
        if (C0115.m4218() <= 0) {
            return ((zr) obj).v((View) obj2, i, i2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۡۥ, reason: not valid java name and contains not printable characters */
    public static void m7088(Object obj, Object obj2, int i) {
        if (C0194.m7889() > 0) {
            ((Intent) obj).writeToParcel((Parcel) obj2, i);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m7089(Object obj) {
        if (C0235.m9535() <= 0) {
            return ((y1) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static int m7090(Object obj) {
        if (C0119.m4573() > 0) {
            return Arrays.hashCode((byte[]) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۧ, reason: not valid java name and contains not printable characters */
    public static Parcelable m7091(Object obj, Object obj2) {
        if (C0126.m4908() <= 0) {
            return ((Bundle) obj).getParcelable((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m7092(Object obj, Object obj2) {
        if (C0062.m2326() > 0) {
            return ((Matrix) obj).mapRect((RectF) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۥ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m7093(Object obj, int i, int i2, int i3, long j, int i4) {
        if (C0037.m1437() < 0) {
            ((MediaCodec) obj).queueInputBuffer(i, i2, i3, j, i4);
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static int m7094(Object obj) {
        if (C0129.m5108() >= 0) {
            return ((dd) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۢۢ, reason: not valid java name and contains not printable characters */
    public static void m7095(Object obj, Object obj2, Object obj3) {
        if (C0058.m2184() >= 0) {
            ((m1) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj2, (AttributeSet) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۥ۟ۨ, reason: not valid java name and contains not printable characters */
    public static char m7096(Object obj, int i) {
        if (C0227.m9046() >= 0) {
            return ((String) obj).charAt(i);
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: ۟ۥۨ۠۠, reason: not valid java name and contains not printable characters */
    public static Set m7097(Object obj) {
        if (C0064.m2388() > 0) {
            return ((p8) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۣۣ, reason: not valid java name and contains not printable characters */
    public static String m7098(Object obj, Object obj2) {
        if (C0096.m3601() >= 0) {
            return null;
        }
        return ((Menu) obj).selectedVideoPath = (String) obj2;
    }

    /* JADX INFO: renamed from: ۟ۦۦۢۦ, reason: not valid java name and contains not printable characters */
    public static Object m7099(Object obj) {
        if (C0213.m8458() >= 0) {
            return ((tm.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۨۦۤ, reason: not valid java name and contains not printable characters */
    public static float m7100(Object obj) {
        if (C0113.m4144() < 0) {
            return ((View) obj).getElevation();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static us m7101(Object obj, float f, float f2, float f3, boolean z) {
        if (C0040.m1622() < 0) {
            return us.c((float[]) obj, f, f2, f3, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۢ۠, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m7102(Object obj, int i) {
        if (C0070.m2829() < 0) {
            return ((z0.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).b(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۢۤ, reason: not valid java name and contains not printable characters */
    public static Field m7103() {
        if (m7136() < 0) {
            return s7.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۢۦ, reason: not valid java name and contains not printable characters */
    public static int m7104(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۠ۤۤۡ, reason: not valid java name and contains not printable characters */
    public static sp m7105(Object obj) {
        if (C0078.m3044() < 0) {
            return ((rp) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۢ, reason: not valid java name and contains not printable characters */
    public static void m7106(Object obj, boolean z, Object obj2) {
        if (C0040.m1622() <= 0) {
            HookMain.r.m5491((HookMain.r) obj, z, (String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۥۧۨ, reason: not valid java name and contains not printable characters */
    public static int m7107() {
        if (C0120.m4608() > 0) {
            return Process.myUid();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static boolean m7108(Object obj) {
        if (C0120.m4608() > 0) {
            return ((m2) obj).m();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۨۥ۠, reason: not valid java name and contains not printable characters */
    public static int m7109(Object obj, Object obj2) {
        if (C0055.m2054() > 0) {
            return ((Context) obj).checkSelfPermission((String) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m7110(Object obj) {
        if (C0070.m2829() <= 0) {
            return ((xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۥ۟, reason: not valid java name and contains not printable characters */
    public static void m7111(Object obj, Object obj2, int i, int i2, int i3) {
        if (C0020.m701() >= 0) {
            tk.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((PopupWindow) obj, (View) obj2, i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ۡۧۥ۠, reason: not valid java name and contains not printable characters */
    public static int[] m7112() {
        if (C0172.m7180() >= 0) {
            return i0.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟۟۟, reason: not valid java name and contains not printable characters */
    public static Object m7113(Object obj) {
        if (C0219.m8794() >= 0) {
            return ((e) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m7115(Object obj, Object obj2) {
        if (C0051.m1783() <= 0) {
            ((xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((a) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۢۧۤ, reason: not valid java name and contains not printable characters */
    public static MainActivity m7116(Object obj) {
        if (C0211.m8341() >= 0) {
            return ((MainActivity.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۦۢ, reason: not valid java name and contains not printable characters */
    public static void m7117(Object obj) {
        if (C0176.m7290() > 0) {
            lq.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj);
        }
    }

    /* JADX INFO: renamed from: ۢۧۢۧ, reason: not valid java name and contains not printable characters */
    public static vn m7118(Object obj, Object obj2) {
        if (C0079.m3072() < 0) {
            return vn.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Class) obj, (CharSequence) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۨۡ, reason: not valid java name and contains not printable characters */
    public static ConnectionBlocker m7119(Object obj) {
        if (C0079.m3072() < 0) {
            return ((ConnectionBlocker.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۨۥ, reason: not valid java name and contains not printable characters */
    public static e.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m7120() {
        if (C0199.m7998() <= 0) {
            return e.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۧۢ, reason: not valid java name and contains not printable characters */
    public static boolean m7121(Object obj, Object obj2) {
        if (C0188.m7736() < 0) {
            return ((List) obj).addAll((Collection) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static String m7122(Object obj) {
        if (C0024.m896() >= 0) {
            return ((xd) obj).f();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۢۤ, reason: not valid java name and contains not printable characters */
    public static boolean m7123(Object obj, char c, boolean z) {
        if (C0106.m3835() >= 0) {
            return mo.s((CharSequence) obj, c, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۥۧ, reason: not valid java name and contains not printable characters */
    public static String m7124(Object obj) {
        if (C0072.m2856() < 0) {
            return ((XmlPullParser) obj).getName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧ۠۠, reason: not valid java name and contains not printable characters */
    public static tm.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m7125(Object obj) {
        if (C0243.m9964() >= 0) {
            return ((tm.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۧ۠, reason: not valid java name and contains not printable characters */
    public static String m7126(Object obj) {
        if (C0200.m8104() <= 0) {
            return System.clearProperty((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۤۡ, reason: contains not printable characters */
    public static boolean m7127(Object obj) {
        if (C0199.m7998() < 0) {
            return ((s8) obj).Y();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۠ۨۢ, reason: contains not printable characters */
    public static StaticLayout m7128(Object obj, Object obj2, int i, int i2, Object obj3, Object obj4, Object obj5) {
        if (C0031.m1148() < 0) {
            return l1.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((CharSequence) obj, (Layout.Alignment) obj2, i, i2, (TextView) obj3, (TextPaint) obj4, (l1.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj5);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۨ۟, reason: contains not printable characters */
    public static void m7129(Object obj, Object obj2) {
        if (C0094.m3450() >= 0) {
            ((Spannable) obj).removeSpan(obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۨۧ, reason: contains not printable characters */
    public static String[] m7130(Object obj) {
        if (C0227.m9046() >= 0) {
            return kp.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((DecimalFormatSymbols) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۧۥ, reason: contains not printable characters */
    public static boolean m7131(Object obj, int i, Object obj2, int i2, int i3) {
        if (C0040.m1622() <= 0) {
            return fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((byte[]) obj, i, (byte[]) obj2, i2, i3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۢۡ, reason: contains not printable characters */
    public static ArrayList m7132(Object obj) {
        if (C0107.m3883() >= 0) {
            return ((pr.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۣۦ, reason: contains not printable characters */
    public static CharSequence m7133(Object obj) {
        if (C0108.m4038() > 0) {
            return ((vo) obj).getContentDescription();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۦ۟, reason: contains not printable characters */
    public static void m7134(Object obj, Object obj2) {
        if (C0078.m3044() < 0) {
            ((ScrollView) obj).addView((View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Uri m7135(Object obj) {
        if (C0057.m2142() >= 0) {
            return ((n9.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۥۨ, reason: not valid java name and contains not printable characters */
    public static int m7136() {
        return 425 ^ C0164.f614;
    }

    /* JADX INFO: renamed from: ۣۣۧۥ, reason: not valid java name and contains not printable characters */
    public static void m7137(Object obj) {
        if (C0074.m2951() < 0) {
            ((Image) obj).close();
        }
    }

    /* JADX INFO: renamed from: ۧۤۥ۠, reason: not valid java name and contains not printable characters */
    public static String m7138(Object obj) {
        if (C0235.m9535() <= 0) {
            return AppOpsManager.permissionToOp((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۧ۠, reason: not valid java name and contains not printable characters */
    public static int m7139(Object obj, int i) {
        if (C0162.m6837() <= 0) {
            return ((SparseArray) obj).keyAt(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۤۡۧ, reason: not valid java name and contains not printable characters */
    public static void m7140(Object obj, Object obj2, Object obj3) {
        if (C0037.m1437() <= 0) {
            Menu.m5698((Menu) obj, (ConnectionBlocker.NetworkLog) obj2, (View) obj3);
        }
    }

    /* JADX INFO: renamed from: ۨۥۢ۟, reason: not valid java name and contains not printable characters */
    public static String m7141(String str) {
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

    /* JADX INFO: renamed from: ۨۨ۠ۡ, reason: not valid java name and contains not printable characters */
    public static Bundle m7142(Object obj) {
        if (C0113.m4144() <= 0) {
            return ((o5.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static String m7114(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
