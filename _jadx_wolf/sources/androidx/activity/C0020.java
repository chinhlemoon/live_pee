package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.support.v4.graphics.drawable.C0009;
import android.support.v4.graphics.drawable.C0010;
import android.support.v4.graphics.drawable.C0011;
import android.text.Editable;
import android.util.Base64;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ActionProvider;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.C0023;
import androidx.annotation.C0031;
import androidx.appcompat.app.C0034;
import androidx.appcompat.view.menu.C0040;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0051;
import androidx.core.app.C0052;
import androidx.core.app.C0055;
import androidx.core.content.C0057;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0064;
import androidx.core.graphics.drawable.C0065;
import androidx.core.graphics.drawable.C0066;
import androidx.core.widget.C0068;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0070;
import androidx.drawerlayout.widget.C0072;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0079;
import androidx.emoji2.text.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0095;
import androidx.fragment.app.C0096;
import androidx.fragment.app.C0099;
import androidx.fragment.app.c;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0117;
import androidx.profileinstaller.C0118;
import androidx.profileinstaller.C0119;
import androidx.profileinstaller.C0120;
import androidx.versionedparcelable.C0129;
import androidx.versionedparcelable.C0133;
import com.example.vcam.HookMain;
import com.example.vcam.MainActivity;
import com.example.vcam.Menu;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0148;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.aa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.c8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ct;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.em;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.js;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ke;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.mp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.og;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.om;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.pr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.so;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vs;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xo;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zp;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.CRC32;
import okhttp3.C0238;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.internal.authenticator.C0162;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0195;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.logging.C0231;
import okhttp3.logging.C0232;
import okhttp3.logging.C0234;
import okhttp3.logging.C0236;
import org.xmlpull.v1.XmlPullParser;
import retrofit2.C0259;
import retrofit2.converter.scalars.C0243;

/* JADX INFO: renamed from: androidx.activity.ۣۡۢ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0020 {

    /* JADX INFO: renamed from: ۣ۟۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static int f19 = 835;

    /* JADX INFO: renamed from: ۟۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static int[] m639() {
        if (C0231.m9265() > 0) {
            return m1.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m640(Object obj) {
        if (C0031.m1148() <= 0) {
            return ((bo) obj).i;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۥۣۣ, reason: not valid java name and contains not printable characters */
    public static int[] m641(Object obj) {
        if (C0171.m7136() < 0) {
            return ((z0.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۨ۟, reason: not valid java name and contains not printable characters */
    public static Collection m642(Object obj) {
        if (C0072.m2856() <= 0) {
            return ((p8) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢ۠, reason: not valid java name and contains not printable characters */
    public static ActionMode m643(Object obj, Object obj2, int i) {
        if (C0011.m458() > 0) {
            return vs.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Window.Callback) obj, (ActionMode.Callback) obj2, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static int m644(Object obj, int i, int i2, int i3) {
        if (C0199.m7998() < 0) {
            return bp.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj, i, i2, i3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۡۢۨ, reason: not valid java name and contains not printable characters */
    public static String m645(String str) {
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

    /* JADX INFO: renamed from: ۟ۢۢۥۣ, reason: not valid java name and contains not printable characters */
    public static float[] m646(Object obj) {
        if (C0034.m1206() < 0) {
            return ((m2) obj).a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۨۧ, reason: not valid java name and contains not printable characters */
    public static int m647(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۢۦ۠ۤ, reason: not valid java name and contains not printable characters */
    public static Context m648(Object obj) {
        if (C0074.m2951() < 0) {
            return C0058.m2153((HookMain) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۧۤۡ, reason: not valid java name and contains not printable characters */
    public static Logger m649() {
        if (C0052.m1890() > 0) {
            return C0095.m3474();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۢۢ, reason: not valid java name and contains not printable characters */
    public static boolean m650(Object obj) {
        if (C0202.m8245() > 0) {
            return ((i8) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Class m651(Object obj) {
        if (C0065.m2448() > 0) {
            return ((wq) obj).n();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static float m652(Object obj) {
        if (C0095.m3478() <= 0) {
            return Float.parseFloat((String) obj);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static IInterface m653(Object obj, Object obj2) {
        if (C0014.m545() >= 0) {
            return ((IBinder) obj).queryLocalInterface((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۧۡ۟, reason: not valid java name and contains not printable characters */
    public static void m655(Object obj, Object obj2, int i, int i2, int i3, int i4, int i5, int i6) {
        if (C0133.m5208() < 0) {
            ((Bitmap) obj).getPixels((int[]) obj2, i, i2, i3, i4, i5, i6);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۨ۟ۡ, reason: not valid java name and contains not printable characters */
    public static ke m656(Object obj) {
        if (C0232.m9299() >= 0) {
            return zl.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((gl) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨ۠, reason: not valid java name and contains not printable characters */
    public static Handler m657(Object obj) {
        if (C0116.m4340() > 0) {
            return Handler.createAsync((Looper) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۨۡ, reason: not valid java name and contains not printable characters */
    public static KeyEvent.DispatcherState m658(Object obj) {
        if (C0215.m8604() <= 0) {
            return ((View) obj).getKeyDispatcherState();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m659(Object obj) {
        if (C0148.m6464() <= 0) {
            return ((KeyEvent) obj).getAction();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۤۤ۟, reason: not valid java name and contains not printable characters */
    public static void m660(Object obj, Object obj2) {
        if (C0234.m9461() < 0) {
            ((xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).j((xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۥۡۡ, reason: not valid java name and contains not printable characters */
    public static void m661(Object obj, Object obj2, Object obj3, float f) {
        if (C0117.m4419() <= 0) {
            ((mk.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((mk.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2, (mk.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj3, f);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۢۦ۠, reason: not valid java name and contains not printable characters */
    public static void m662(Object obj) {
        if (C0195.m7914() > 0) {
            ((hk) obj).g();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۦۨۡ, reason: not valid java name and contains not printable characters */
    public static int m663(Object obj, Object obj2, long j) {
        if (C0116.m4340() >= 0) {
            return ((MediaCodec) obj).dequeueOutputBuffer((MediaCodec.BufferInfo) obj2, j);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۧۡۦ, reason: not valid java name and contains not printable characters */
    public static int m664(Object obj, Object obj2, Object obj3) {
        if (C0010.m354() < 0) {
            return ((dj) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Comparable) obj2, (Comparable) obj3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۨۤ۟, reason: not valid java name and contains not printable characters */
    public static void m665(Object obj) {
        if (C0236.m9615() >= 0) {
            ((ct) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
    }

    /* JADX INFO: renamed from: ۟ۧۡۡۨ, reason: not valid java name and contains not printable characters */
    public static Map m666(Object obj) {
        if (C0055.m2054() > 0) {
            return og.b((Map) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡۥ, reason: not valid java name and contains not printable characters */
    public static wr.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m667() {
        if (C0187.m7613() >= 0) {
            return wr.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m668(Object obj, int i, int i2) {
        if (C0176.m7290() >= 0) {
            return ((zp) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۤۦۥ, reason: not valid java name and contains not printable characters */
    public static boolean m669(Object obj) {
        if (C0051.m1783() <= 0) {
            return ((rd) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۥۢۥ, reason: not valid java name and contains not printable characters */
    public static void m670(Object obj) {
        if (C0200.m8104() <= 0) {
            ((View) obj).postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: ۠ۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m671(Object obj, int i) {
        if (C0119.m4573() > 0) {
            return ((Dialog) obj).requestWindowFeature(i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۨۢۤ, reason: not valid java name and contains not printable characters */
    public static void m672(Object obj, Object obj2) {
        if (C0079.m3072() <= 0) {
            Menu.m5610((Menu) obj, (View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۨۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m673(Object obj, int i) {
        if (C0120.m4608() >= 0) {
            return Base64.decode((String) obj, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static rn m674(Object obj) {
        if (C0194.m7889() > 0) {
            return ((so.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static Level m675() {
        if (C0069.m2756() <= 0) {
            return Level.WARNING;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۢۢ, reason: not valid java name and contains not printable characters */
    public static Collection m676(Object obj) {
        if (C0055.m2054() > 0) {
            return ((HashMap) obj).values();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۥۨ, reason: not valid java name and contains not printable characters */
    public static o5.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m677(Object obj) {
        if (C0259.m10136() > 0) {
            return ((o5) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۨ, reason: not valid java name and contains not printable characters */
    public static em m678(Object obj) {
        if (C0009.m276() <= 0) {
            return ((f6) obj).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۡۥ, reason: not valid java name and contains not printable characters */
    public static js m679(Object obj, int i, long j) {
        if (C0095.m3478() <= 0) {
            return ((xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(i, j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۢۡ, reason: not valid java name and contains not printable characters */
    public static Drawable[] m680(Object obj) {
        if (C0149.m6476() < 0) {
            return ((TextView) obj).getCompoundDrawablesRelative();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۢۡ, reason: not valid java name and contains not printable characters */
    public static void m681(Object obj, Object obj2, int i, int i2) {
        if (C0049.m1767() <= 0) {
            ((CRC32) obj).update((byte[]) obj2, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۤۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static xo m682() {
        if (C0055.m2054() > 0) {
            return C0113.m4137();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۤۧ, reason: not valid java name and contains not printable characters */
    public static int m683(Object obj) {
        if (C0040.m1622() < 0) {
            return ((v0.k) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟ۤۥ, reason: contains not printable characters */
    public static void m684(Object obj, int i) {
        if (C0057.m2142() >= 0) {
            ((c) obj).l(i);
        }
    }

    /* JADX INFO: renamed from: ۥ۠ۡۧ, reason: contains not printable characters */
    public static Editable m685(Object obj) {
        if (C0066.m2514() >= 0) {
            return ((c8) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡ۠, reason: contains not printable characters */
    public static void m686(Object obj, Object obj2) {
        if (C0070.m2829() < 0) {
            C0129.m5133((HookMain) obj, (Context) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۢۢۥ, reason: contains not printable characters */
    public static void m687(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0093.m3365() > 0) {
            ((pr.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TypedArray) obj2, (XmlPullParser) obj3, (Resources.Theme) obj4);
        }
    }

    /* JADX INFO: renamed from: ۥۢۦۧ, reason: contains not printable characters */
    public static int m688(Object obj, Object obj2) {
        if (C0031.m1148() < 0) {
            return ((AtomicIntegerFieldUpdater) obj).incrementAndGet(obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۣۣۧ, reason: contains not printable characters */
    public static boolean m689() {
        if (C0243.m9964() >= 0) {
            return e.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۥ۟ۡ, reason: contains not printable characters */
    public static Drawable m690(Object obj) {
        if (C0236.m9615() >= 0) {
            return ((CompoundButton) obj).getButtonDrawable();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۢۨ, reason: contains not printable characters */
    public static LayoutInflater m691(Object obj) {
        if (C0021.m740() < 0) {
            return ((s5) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۡۤ, reason: contains not printable characters */
    public static void m692(Object obj) {
        if (C0117.m4419() < 0) {
            C0023.m847((MainActivity) obj);
        }
    }

    /* JADX INFO: renamed from: ۦ۟ۧۧ, reason: contains not printable characters */
    public static void m693(Object obj) {
        if (C0199.m7998() < 0) {
            ((SeekBar) obj).invalidate();
        }
    }

    /* JADX INFO: renamed from: ۦ۠ۨۡ, reason: contains not printable characters */
    public static int m694(Object obj) {
        if (C0099.m3752() <= 0) {
            return ((Parcel) obj).dataPosition();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۢۧۡ, reason: contains not printable characters */
    public static void m695(Object obj, int i) {
        if (C0096.m3601() <= 0) {
            ((v0) obj).z0(i);
        }
    }

    /* JADX INFO: renamed from: ۦۥۣ۠, reason: contains not printable characters */
    public static boolean m696(Object obj, Object obj2, int i) {
        if (C0240.m9826() >= 0) {
            return aa.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((List) obj, (View) obj2, i);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۦۥۦ, reason: contains not printable characters */
    public static Object m697(Object obj) {
        if (C0172.m7180() > 0) {
            return om.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Throwable) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۧۡۡ, reason: contains not printable characters */
    public static void m698(Object obj, int i, boolean z) {
        if (C0014.m545() >= 0) {
            ((Resources.Theme) obj).applyStyle(i, z);
        }
    }

    /* JADX INFO: renamed from: ۧ۠۠, reason: not valid java name and contains not printable characters */
    public static View m699(Object obj, Object obj2) {
        if (C0068.m2650() > 0) {
            return ((ActionProvider) obj).onCreateActionView((MenuItem) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static MenuItem m700(Object obj, int i) {
        if (C0162.m6837() <= 0) {
            return ((android.view.Menu) obj).add(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡۡۥ, reason: not valid java name and contains not printable characters */
    public static int m701() {
        return (-274) ^ C0238.f688;
    }

    /* JADX INFO: renamed from: ۣۧۢۨ, reason: not valid java name and contains not printable characters */
    public static int m702(Object obj, Object obj2) {
        if (C0011.m458() > 0) {
            return ((ArrayList) obj).indexOf(obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۥ۠ۨ, reason: not valid java name and contains not printable characters */
    public static float m703(Object obj) {
        if (C0133.m5208() < 0) {
            return ((n2) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۧۥۤۨ, reason: not valid java name and contains not printable characters */
    public static int m704(Object obj, int i) {
        if (C0064.m2388() > 0) {
            return mp.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj, i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۦ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m705(Object obj, Object obj2) {
        if (C0017.m627() >= 0) {
            Menu.m5607((Menu) obj, (View) obj2);
        }
    }

    /* JADX INFO: renamed from: ۧۧۨۨ, reason: not valid java name and contains not printable characters */
    public static TypedValue m706(Object obj, int i) {
        if (C0182.m7528() < 0) {
            return ((TypedArray) obj).peekValue(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۦۢ, reason: not valid java name and contains not printable characters */
    public static int m707(Object obj) {
        if (C0118.m4454() >= 0) {
            return ((ListView) obj).getSelectedItemPosition();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۥۡۢ, reason: not valid java name and contains not printable characters */
    public static vf m708(Object obj, long j) {
        if (C0040.m1622() < 0) {
            return ((vf) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤۥ, reason: not valid java name and contains not printable characters */
    public static String m654(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
