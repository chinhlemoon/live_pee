package okhttp3.internal.cache;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Insets;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.hardware.camera2.CameraCaptureSession;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Trace;
import android.support.v4.graphics.drawable.C0009;
import android.text.InputFilter;
import android.text.StaticLayout;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.inputmethod.EditorInfo;
import android.widget.ListView;
import android.widget.TextView;
import androidx.activity.C0017;
import androidx.annotation.C0024;
import androidx.annotation.C0025;
import androidx.annotation.C0026;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0034;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.view.menu.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.appcompat.view.menu.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.appcompat.widget.C0047;
import androidx.core.app.C0053;
import androidx.core.content.C0057;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0065;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0072;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0079;
import androidx.emoji2.text.C0083;
import androidx.emoji2.text.C0084;
import androidx.emoji2.text.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.fragment.app.C0096;
import androidx.fragment.app.C0099;
import androidx.lifecycle.C0106;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0116;
import androidx.savedstate.C0126;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0129;
import com.example.vcam.C0141;
import com.example.vcam.HookMain;
import com.example.vcam.Menu;
import com.example.vcam.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ap;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.cd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ee;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.g7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jh;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.js;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.nm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.qq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ti;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.us;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ws;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zh;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import javax.crypto.Cipher;
import okhttp3.C0238;
import okhttp3.C0239;
import okhttp3.HttpUrl;
import okhttp3.internal.C0227;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0195;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.ws.C0224;
import okhttp3.logging.C0232;
import okhttp3.logging.C0233;
import okhttp3.logging.C0234;
import okhttp3.logging.C0236;
import retrofit2.C0259;
import retrofit2.converter.scalars.C0243;
import retrofit2.http.C0249;

/* JADX INFO: renamed from: okhttp3.internal.cache.ۣۧۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0172 {

    /* JADX INFO: renamed from: ۟ۢۥۨ۟, reason: not valid java name and contains not printable characters */
    public static int f622 = 870;

    /* JADX INFO: renamed from: ۟۟۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static ti.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m7143(Object obj, Object obj2) {
        if (C0141.m5769() >= 0) {
            return ((ti) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((o2) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static ws m7144(Object obj) {
        if (C0057.m2142() > 0) {
            return ws.this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static Object m7145(Object obj, int i) {
        if (C0227.m9046() > 0) {
            return ((z1) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۢۨ۠, reason: not valid java name and contains not printable characters */
    public static js m7146(Object obj) {
        if (C0079.m3072() <= 0) {
            return wr.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((View) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۥۦۥ, reason: not valid java name and contains not printable characters */
    public static Date m7147(Object obj, Object obj2) {
        if (C0112.m4054() <= 0) {
            return ((SimpleDateFormat) obj).parse((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۠۠, reason: not valid java name and contains not printable characters */
    public static String m7148(Object obj, int i) {
        if (C0204.m8270() < 0) {
            return ((a9) obj).e(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static void m7149(Object obj) {
        if (C0162.m6837() <= 0) {
            ((vn.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۟۠ۥۦۨ, reason: not valid java name and contains not printable characters */
    public static xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m7150(Object obj) {
        if (C0096.m3601() <= 0) {
            return ((i8) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static Shader.TileMode m7151() {
        if (C0249.m10052() <= 0) {
            return Shader.TileMode.CLAMP;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۥ۟, reason: not valid java name and contains not printable characters */
    public static int m7152(Object obj) {
        if (m7180() >= 0) {
            return ((p) obj).b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۦۡۥ, reason: not valid java name and contains not printable characters */
    public static Cipher m7153(Object obj) {
        if (C0149.m6476() <= 0) {
            return Cipher.getInstance((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۢۤ, reason: not valid java name and contains not printable characters */
    public static int m7154(Object obj, int i) {
        if (C0079.m3072() <= 0) {
            return ((StaticLayout) obj).getLineEnd(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۨۦ, reason: not valid java name and contains not printable characters */
    public static void m7155(Object obj, boolean z) {
        if (C0062.m2326() > 0) {
            ((xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(z);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۡۡۧ, reason: not valid java name and contains not printable characters */
    public static void m7156(Object obj, Object obj2) {
        if (C0062.m2326() > 0) {
            ((q0) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((q) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static InputStream m7157(Object obj) {
        if (C0084.m3253() <= 0) {
            return ((cd) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢ۠۠, reason: not valid java name and contains not printable characters */
    public static float m7158(Object obj) {
        if (C0195.m7914() > 0) {
            return ((pr.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).d;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۢۥۢ, reason: not valid java name and contains not printable characters */
    public static InputFilter[] m7159(Object obj, Object obj2) {
        if (C0065.m2448() > 0) {
            return ((h8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((InputFilter[]) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۥۢ, reason: not valid java name and contains not printable characters */
    public static float m7160(Object obj) {
        if (C0224.m8861() < 0) {
            return ((us) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۢۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static MenuItem m7161(Object obj, int i) {
        if (C0181.m7445() >= 0) {
            return ((xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).getItem(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m7162(Object obj, Object obj2) {
        if (C0239.m9805() <= 0) {
            return ((d1) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Drawable) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static Font m7163(Object obj, int i) {
        if (C0040.m1622() <= 0) {
            return ((FontFamily) obj).getFont(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥۢ, reason: not valid java name and contains not printable characters */
    public static Drawable.Callback m7164(Object obj) {
        if (C0148.m6464() < 0) {
            return ((k0) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m7165(Object obj, Object obj2) {
        if (C0009.m276() < 0) {
            return ((ti) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((o2) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟۠۟, reason: not valid java name and contains not printable characters */
    public static Cursor m7166(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        if (C0074.m2951() <= 0) {
            return ((ContentResolver) obj).query((Uri) obj2, (String[]) obj3, (String) obj4, (String[]) obj5, (String) obj6, (CancellationSignal) obj7);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static void m7167(Object obj, Object obj2) {
        if (C0017.m627() > 0) {
            ((View) obj).setTransitionName((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨ۠, reason: not valid java name and contains not printable characters */
    public static g7[] m7168(Object obj, Object obj2, int i) {
        if (C0106.m3835() > 0) {
            return dl.p((InputStream) obj, (String) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۤۦ, reason: not valid java name and contains not printable characters */
    public static Object m7169(Object obj, Object obj2) {
        if (C0128.m5064() < 0) {
            return ((Context) obj).getSystemService((Class) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۦۥ۠, reason: not valid java name and contains not printable characters */
    public static Menu m7170(Object obj) {
        if (C0236.m9615() >= 0) {
            return ((zh) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۡۢ, reason: not valid java name and contains not printable characters */
    public static lg.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m7171(Object obj) {
        if (C0069.m2756() < 0) {
            return ((lg) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠۟۠, reason: not valid java name and contains not printable characters */
    public static void m7172(Object obj) {
        if (C0164.m6900() <= 0) {
            ((js) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۤ۠۠, reason: not valid java name and contains not printable characters */
    public static int m7174(Object obj) {
        if (C0233.m9365() < 0) {
            return ((l9.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۥۨۥ, reason: not valid java name and contains not printable characters */
    public static r.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m7175(Object obj) {
        if (C0031.m1148() <= 0) {
            return ((r) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧۧۧ, reason: not valid java name and contains not printable characters */
    public static Object m7176(Object obj, int i) {
        if (C0238.m9653() > 0) {
            return ((rn) obj).b(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۠ۥ, reason: not valid java name and contains not printable characters */
    public static Throwable m7177(Object obj) {
        if (C0047.m1663() <= 0) {
            return ((nm.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۡۡۡ, reason: not valid java name and contains not printable characters */
    public static int m7178(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦۨۦ, reason: not valid java name and contains not printable characters */
    public static Object m7179(Object obj, Object obj2) {
        if (C0234.m9461() <= 0) {
            return ((n1) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Class) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟۟۟, reason: not valid java name and contains not printable characters */
    public static int m7180() {
        return 517 ^ C0047.f41;
    }

    /* JADX INFO: renamed from: ۟ۧۢۦ, reason: not valid java name and contains not printable characters */
    public static v2 m7181(Object obj) {
        if (C0243.m9964() >= 0) {
            return rj.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((un) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۤۡ, reason: not valid java name and contains not printable characters */
    public static String m7182(Object obj) {
        if (C0259.m10136() > 0) {
            return ap.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۨۨ, reason: not valid java name and contains not printable characters */
    public static int m7183(Object obj) {
        if (C0238.m9653() > 0) {
            return r8.c((String) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m7184(Object obj, Object obj2) {
        if (C0069.m2756() > 0) {
            return false;
        }
        return C0025.m979((String) obj2);
    }

    /* JADX INFO: renamed from: ۠۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static void m7185(Object obj, Object obj2, int i, Object obj3) {
        if (C0182.m7528() <= 0) {
            ((v0.e) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Window.Callback) obj2, i, (android.view.Menu) obj3);
        }
    }

    /* JADX INFO: renamed from: ۠ۡۥۣ, reason: not valid java name and contains not printable characters */
    public static int m7186(Object obj) {
        if (C0217.m8693() < 0) {
            return ((InetSocketAddress) obj).getPort();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۡۦۥ, reason: not valid java name and contains not printable characters */
    public static void m7187(Object obj, int i) {
        if (C0084.m3253() <= 0) {
            ((TextView) obj).setGravity(i);
        }
    }

    /* JADX INFO: renamed from: ۠ۥۦۥ, reason: not valid java name and contains not printable characters */
    public static int m7188(Object obj) {
        if (C0072.m2856() <= 0) {
            return ((View) obj).getPaddingStart();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۨۢۡ, reason: not valid java name and contains not printable characters */
    public static long m7189(Object obj) {
        if (C0233.m9365() <= 0) {
            return ((qq.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡ۟۠۟, reason: not valid java name and contains not printable characters */
    public static boolean m7190(Object obj, Object obj2) {
        if (C0214.m8575() < 0) {
            return ((ListView) obj).removeCallbacks((Runnable) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡۢۢ, reason: not valid java name and contains not printable characters */
    public static int m7191(Object obj) {
        if (C0232.m9299() >= 0) {
            return ((jh) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۥۨ, reason: not valid java name and contains not printable characters */
    public static void m7192(Object obj, Object obj2) {
        if (C0099.m3752() < 0) {
            ((Drawable) obj).setCallback((Drawable.Callback) obj2);
        }
    }

    /* JADX INFO: renamed from: ۡۧۥۦ, reason: not valid java name and contains not printable characters */
    public static p7 m7193(Object obj) {
        if (C0040.m1622() <= 0) {
            return ((k3) obj).m();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static void m7194(Object obj, Object obj2) {
        if (C0129.m5108() >= 0) {
            C0065.m2438((HookMain) obj, (CameraCaptureSession.StateCallback) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۧۤۡ, reason: not valid java name and contains not printable characters */
    public static boolean m7195(Object obj) {
        if (C0128.m5064() <= 0) {
            return ((pr.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m7196(Object obj) {
        if (C0034.m1206() <= 0) {
            ((xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).e();
        }
    }

    /* JADX INFO: renamed from: ۣ۠۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m7197(Object obj) {
        if (C0053.m1959() > 0) {
            return obj.toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢۥ, reason: not valid java name and contains not printable characters */
    public static boolean m7198(Object obj, Object obj2) {
        if (C0115.m4218() <= 0) {
            return ((xs) obj).equals(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m7199(Object obj, int i) {
        if (C0034.m1206() <= 0) {
            return qo.n((Cursor) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۤ, reason: not valid java name and contains not printable characters */
    public static void m7200(Object obj, float f, float f2, float f3, float f4) {
        if (C0034.m1206() <= 0) {
            ((RectF) obj).set(f, f2, f3, f4);
        }
    }

    /* JADX INFO: renamed from: ۤۥۧ۠, reason: not valid java name and contains not printable characters */
    public static s2 m7201(Object obj, int i) {
        if (C0227.m9046() > 0) {
            return ((s2) obj).o0(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦ۟۟, reason: not valid java name and contains not printable characters */
    public static long m7202(Object obj, Object obj2, long j) {
        if (C0083.m3188() < 0) {
            return ((AtomicLongFieldUpdater) obj).addAndGet(obj2, j);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۤۧ۠, reason: not valid java name and contains not printable characters */
    public static CharSequence m7203(Object obj) {
        if (C0171.m7136() < 0) {
            return ((i) obj).j();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠ۡۦ, reason: contains not printable characters */
    public static Typeface m7204(Object obj, Object obj2) {
        if (C0034.m1206() < 0) {
            return ((Paint) obj).setTypeface((Typeface) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۥۧ, reason: contains not printable characters */
    public static boolean m7205(Object obj) {
        if (C0024.m896() > 0) {
            return ((xd) obj).p();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۥۧۦ, reason: contains not printable characters */
    public static boolean m7206(Object obj) {
        if (C0164.m6900() <= 0) {
            return ((t8) obj).k0();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۥۨۨ, reason: contains not printable characters */
    public static void m7207() {
        if (C0148.m6464() < 0) {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: ۥۧۢۦ, reason: contains not printable characters */
    public static Locale m7208() {
        if (C0026.m1047() >= 0) {
            return Locale.US;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۧۥ, reason: contains not printable characters */
    public static vo m7209(Object obj, Object obj2) {
        if (C0084.m3253() < 0) {
            return ((vo) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((r) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۥۥ, reason: contains not printable characters */
    public static String[] m7210(Object obj, Object obj2) {
        if (C0169.m7034() <= 0) {
            return ((String) obj).split((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۨۨ, reason: contains not printable characters */
    public static void m7211(Object obj, Object obj2, Object obj3) {
        if (C0233.m9365() <= 0) {
            ((Bundle) obj).putByteArray((String) obj2, (byte[]) obj3);
        }
    }

    /* JADX INFO: renamed from: ۦۥ۟ۥ, reason: contains not printable characters */
    public static float[] m7212(Object obj, int i, int i2) {
        if (C0126.m4908() < 0) {
            return mk.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((float[]) obj, i, i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۣ۠, reason: contains not printable characters */
    public static float m7213(Object obj) {
        if (C0047.m1663() < 0) {
            return ((e3) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۧۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m7214(Object obj) {
        if (C0062.m2326() > 0) {
            return ((ee) obj).isSuspend();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۢۥۡ, reason: not valid java name and contains not printable characters */
    public static Location m7215(Object obj, Object obj2) {
        if (C0194.m7889() > 0) {
            return ((qq) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۤۤ, reason: not valid java name and contains not printable characters */
    public static WindowInsets.Builder m7216(Object obj, Object obj2) {
        if (C0116.m4340() > 0) {
            return ((WindowInsets.Builder) obj).setStableInsets((Insets) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۣۡ, reason: not valid java name and contains not printable characters */
    public static int m7217(Object obj) {
        if (C0236.m9615() >= 0) {
            return ((EditorInfo) obj).initialSelEnd;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۧ۠۠, reason: not valid java name and contains not printable characters */
    public static String m7218(Object obj, Object obj2) {
        if (C0201.m8184() < 0) {
            return ((mo.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((hd) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static int m7219(Object obj) {
        if (C0148.m6464() < 0) {
            return ((ContentInfo) obj).getSource();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۦ۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m7220(Object obj) {
        if (C0215.m8604() < 0) {
            return ((bc) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۧ, reason: not valid java name and contains not printable characters */
    public static String m7221(String str) {
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

    /* JADX INFO: renamed from: ۟ۥ۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static String m7173(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
