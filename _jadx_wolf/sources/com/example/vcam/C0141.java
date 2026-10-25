package com.example.vcam;

import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.hardware.camera2.CaptureFailure;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.app.C0002;
import android.support.v4.app.C0004;
import android.text.SpannableStringBuilder;
import android.text.TextDirectionHeuristic;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import androidx.activity.C0015;
import androidx.activity.C0019;
import androidx.activity.ComponentActivity;
import androidx.annotation.C0023;
import androidx.annotation.C0024;
import androidx.annotation.C0028;
import androidx.appcompat.app.C0035;
import androidx.appcompat.view.menu.C0040;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.core.app.C0051;
import androidx.core.app.C0053;
import androidx.core.app.C0055;
import androidx.core.app.C0056;
import androidx.core.content.C0057;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0064;
import androidx.core.graphics.drawable.C0065;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0072;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0078;
import androidx.emoji2.text.C0083;
import androidx.emoji2.text.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0094;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0116;
import androidx.savedstate.C0122;
import androidx.savedstate.C0123;
import androidx.savedstate.C0125;
import androidx.savedstate.C0127;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0129;
import androidx.versionedparcelable.C0130;
import androidx.versionedparcelable.C0133;
import androidx.versionedparcelable.C0135;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.C0149;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.am;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bk;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.c;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.c3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.dn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fb;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fc;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.g7;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.gl;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.h;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.iq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.j9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.k3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ke;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.kp;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.lg;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.n1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ne;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.o5;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.p6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.ql;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.r8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.tm;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.u8;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v0;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.vn;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wf;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.z1;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zq;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.zr;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Stream;
import okhttp3.C0240;
import okhttp3.HttpUrl;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0169;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.cache2.C0173;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.platform.android.C0202;
import okhttp3.internal.platform.android.C0203;
import okhttp3.internal.proxy.C0211;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.internal.ws.C0224;
import okhttp3.logging.C0231;
import okhttp3.logging.C0232;
import okhttp3.logging.C0234;
import okhttp3.logging.C0235;
import org.json.JSONObject;
import retrofit2.internal.C0256;

/* JADX INFO: renamed from: com.example.vcam.ۨۨۥۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0141 {

    /* JADX INFO: renamed from: ۟ۥۥۣ۟, reason: not valid java name and contains not printable characters */
    public static int f187 = 194;

    /* JADX INFO: renamed from: ۟۟ۡۨۡ, reason: not valid java name and contains not printable characters */
    public static double m5737(double d) {
        int iM7136 = C0171.m7136();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM7136 < 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return Math.floor(d);
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return 0.0d;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟۟ۦ۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m5738(Object obj) {
        int iM1268 = C0035.m1268();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM1268 <= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return ((m2) obj).j;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return false;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟۟ۧۤۨ, reason: not valid java name and contains not printable characters */
    public static void m5739(Object obj, Object obj2) {
        int iM4736 = C0122.m4736();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM4736 < 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    ((a9) obj).j((ClassLoader) obj2);
                    return;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟۟ۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Typeface m5740(Object obj, Object obj2, Object obj3, int i, int i2) {
        int iM1622 = C0040.m1622();
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    if (iM1622 <= 0) {
                        i3 = 1709;
                    }
                    break;
                case 204:
                    return l9.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj, (j9) obj2, (c3) obj3, i, i2);
                case 239:
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i3 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m5741(Object obj) {
        int iM2054 = C0055.m2054();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM2054 >= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    ((Activity) obj).finish();
                    return;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟۠ۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m5742(Object obj) {
        int iM6900 = C0164.m6900();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM6900 <= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    ((AnimatorSet) obj).start();
                    return;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m5743(Object obj, long j, int i) {
        int iM7344 = C0178.m7344();
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (iM7344 < 0) {
                        i2 = 1709;
                    }
                    break;
                case 204:
                    return f6.U((f6) obj, j, i);
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return false;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i2 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟۠ۥۡۤ, reason: not valid java name and contains not printable characters */
    public static int m5744(Object obj) {
        int iM2951 = C0074.m2951();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM2951 <= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return ((zr) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return 0;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟۠ۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static a3 m5745(Object obj, Object obj2, int i, int i2) {
        int iM8245 = C0202.m8245();
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    if (iM8245 > 0) {
                        i3 = 1709;
                    }
                    break;
                case 204:
                    return ((a3.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((byte[]) obj2, i, i2);
                case 239:
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i3 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m5746(Object obj, Object obj2, Object obj3) {
        int iM1622 = C0040.m1622();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM1622 <= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    ((View.AccessibilityDelegate) obj).onInitializeAccessibilityEvent((View) obj2, (AccessibilityEvent) obj3);
                    return;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟۠ۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m5747(Object obj, Object obj2) {
        int iM4841 = C0123.m4841();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM4841 < 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    ((ActionBarContextView) obj).xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((q) obj2);
                    return;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static void m5748(Object obj, Object obj2) {
        int iM3044 = C0078.m3044();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM3044 <= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    ((xd.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).d(obj2);
                    return;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static HookMain.a m5749(Object obj) {
        int iM4841 = C0123.m4841();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM4841 < 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return ((fc) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢۤ, reason: not valid java name and contains not printable characters */
    public static List m5750(Object obj) {
        int iM4144 = C0113.m4144();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM4144 < 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return ((Menu.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۡۧۤۨ, reason: not valid java name and contains not printable characters */
    public static hr m5751(Object obj) {
        int iM5208 = C0133.m5208();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM5208 < 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return ComponentActivity.g((ComponentActivity) obj);
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static int m5752(Object obj) {
        int iM1622 = C0040.m1622();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM1622 <= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return ((CaptureFailure) obj).getReason();
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return 0;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m5753() {
        int iM1622 = C0040.m1622();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM1622 < 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return ne.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return false;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۢۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m5754(Object obj, Object obj2) {
        int iM2951 = C0074.m2951();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM2951 < 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    ((ValueAnimator) obj).setValues((PropertyValuesHolder[]) obj2);
                    return;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۢۦۣۢ, reason: not valid java name and contains not printable characters */
    public static byte[] m5755(Object obj) {
        int iM8861 = C0224.m8861();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM8861 < 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return dl.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((g7) obj);
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۢۨۥۦ, reason: not valid java name and contains not printable characters */
    public static int m5756(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦ۟, reason: not valid java name and contains not printable characters */
    public static void m5757(Object obj, Object obj2) {
        int iM2388 = C0064.m2388();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM2388 > 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    Menu.m5606((Menu) obj, (View) obj2);
                    return;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۨ, reason: not valid java name and contains not printable characters */
    public static wr.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m5758() {
        int iM7034 = C0169.m7034();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM7034 < 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return wr.b0();
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۨۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m5759(Object obj) {
        int iM5274 = C0135.m5274();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM5274 <= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return ((AnimatorSet) obj).isRunning();
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return false;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static TextDirectionHeuristic m5760(Object obj) {
        int iM1783 = C0051.m1783();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM1783 < 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return kp.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((TextView) obj);
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۤۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static float m5761(float f, float f2, float f3) {
        int iM9461 = C0234.m9461();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM9461 < 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return m2.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(f, f2, f3);
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return 0.0f;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۥۡ۠۟, reason: not valid java name and contains not printable characters */
    public static void m5762(Object obj, long j, int i) throws IOException {
        int iM7528 = C0182.m7528();
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (iM7528 < 0) {
                        i2 = 1709;
                    }
                    break;
                case 204:
                    r8.g((OutputStream) obj, j, i);
                    return;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i2 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣۤۤ, reason: not valid java name and contains not printable characters */
    public static boolean m5763(Object obj) {
        int iM3188 = C0083.m3188();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM3188 <= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return ((ActivityInfo) obj).exported;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return false;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۥۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m5764(Object obj, Object obj2, int i) {
        int iM896 = C0024.m896();
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (iM896 > 0) {
                        i2 = 1709;
                    }
                    break;
                case 204:
                    ((dn) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((dn) obj2, i);
                    return;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i2 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۥۦۨۢ, reason: not valid java name and contains not printable characters */
    public static void m5765(Object obj, Object obj2, Object obj3) {
        int iM5064 = C0128.m5064();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM5064 < 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    ((h) obj).e((View) obj2, (AccessibilityEvent) obj3);
                    return;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۥۧۧ۟, reason: not valid java name and contains not printable characters */
    public static void m5766(Object obj) {
        int iM8341 = C0211.m8341();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM8341 > 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    ((k3) obj).s();
                    return;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۢۧ, reason: not valid java name and contains not printable characters */
    public static JSONObject m5767(Object obj, Object obj2) {
        int iM4340 = C0116.m4340();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM4340 > 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return ((JSONObject) obj).getJSONObject((String) obj2);
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۢۧ, reason: not valid java name and contains not printable characters */
    public static int m5768(Object obj) {
        int iM4218 = C0115.m4218();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM4218 <= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return ((xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return 0;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۦۧۢۢ, reason: not valid java name and contains not printable characters */
    public static int m5769() {
        String str = "ۥۣۣ";
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            switch (C0203.m8249(str)) {
                case 1749790:
                    str = "ۣۤۤ";
                    i4 = i3 ^ (-1);
                    break;
                case 1750748:
                    return i4;
                case 1751529:
                    str = "ۣۦ۟";
                    i4 = i | i2;
                    break;
                case 1751621:
                    str = "ۦۣۤ";
                    i2 = i4 & (-633);
                    break;
                case 1752581:
                    str = "ۢۦۢ";
                    i3 = C0023.f22;
                    break;
                case 1753543:
                    str = "۠۟ۨ";
                    i4 = 632;
                    break;
                default:
                    i = i4 & i3;
                    str = "ۤ۠ۥ";
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۟ۦۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m5770(Object obj) {
        int iM72 = C0002.m72();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM72 >= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    ((Window.Callback) obj).onDetachedFromWindow();
                    return;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0030. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0049. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x005f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000b. Please report as an issue. */
    /* JADX INFO: renamed from: ۟ۦۨۨ, reason: not valid java name and contains not printable characters */
    public static String m5771(String str) {
        int length = 0;
        String string = HttpUrl.FRAGMENT_ENCODE_SET;
        String string2 = HttpUrl.FRAGMENT_ENCODE_SET;
        int i = 0;
        while (true) {
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        break;
                    case 49:
                        i2 = i >= 15 ? 1709 : 1678;
                        break;
                    case 204:
                        break;
                    case 239:
                        break;
                    default:
                        break;
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / (C0056.f50 ^ (-82)));
                int i3 = 0;
                while (true) {
                    int length2 = str.length();
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = i3 >= length2 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                break;
                            default:
                                break;
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        int length3 = byteArray.length;
                        int length4 = string2.length();
                        while (true) {
                            int i5 = 1864;
                            while (true) {
                                i5 ^= 1881;
                                switch (i5) {
                                    case 17:
                                        i5 = length3 <= 0 ? 48736 : 48705;
                                        break;
                                    case 47384:
                                        break;
                                    case 47417:
                                        break;
                                    case 47483:
                                        break;
                                    default:
                                        break;
                                }
                                while (true) {
                                    int length5 = byteArray.length;
                                    int i6 = 48767;
                                    while (true) {
                                        i6 ^= 48784;
                                        switch (i6) {
                                            case 14:
                                                break;
                                            case 45:
                                                break;
                                            case 76:
                                                break;
                                            case 239:
                                                i6 = length >= length5 ? 48860 : 48829;
                                                break;
                                            default:
                                                break;
                                        }
                                        return new String(byteArray);
                                    }
                                    length = HttpUrl.FRAGMENT_ENCODE_SET.length() + (C0015.f14 ^ (-628));
                                    int i7 = 49914;
                                    while (true) {
                                        i7 ^= 49931;
                                        switch (i7) {
                                            case 497:
                                                i7 = 50596;
                                                break;
                                            case 1711:
                                                break;
                                        }
                                    }
                                }
                            }
                            byte b = byteArray[-1];
                            char cCharAt = string2.charAt((-1) % length4);
                            byteArray[-1] = (byte) ((b & (cCharAt ^ (-1))) | ((b ^ (-1)) & cCharAt));
                            int i8 = 49790;
                            while (true) {
                                i8 ^= 49807;
                                switch (i8) {
                                    case 18:
                                        break;
                                    case 241:
                                        i8 = 49821;
                                        break;
                                }
                            }
                        }
                    }
                    int iIndexOf = string.indexOf(str.charAt(i3)) << (C0256.f706 ^ (-539));
                    int iIndexOf2 = string.indexOf(str.charAt((C0019.f18 ^ (-698)) + i3));
                    byteArrayOutputStream.write((iIndexOf & iIndexOf2) | (iIndexOf ^ iIndexOf2));
                    i3 += C0130.f109 ^ (-627);
                    int i9 = 49666;
                    while (true) {
                        i9 ^= 49683;
                        switch (i9) {
                            case 17:
                                i9 = 49697;
                                break;
                            case 50:
                                break;
                        }
                    }
                }
            }
            string = new StringBuffer().append(string).append(Integer.toHexString(i)).toString();
            StringBuffer stringBufferAppend = new StringBuffer().append(string2);
            int iRandom = (int) (Math.random() * ((double) (C0173.f623 ^ 273)));
            string2 = stringBufferAppend.append((iRandom & (i ^ (-1))) | ((iRandom ^ (-1)) & i)).toString();
            i += C0028.f27 ^ (-903);
            int i10 = 48891;
            while (true) {
                i10 ^= 48908;
                switch (i10) {
                    case 22:
                        break;
                    case 503:
                        i10 = 48922;
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static Typeface m5772(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        int iM9826 = C0240.m9826();
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (iM9826 > 0) {
                        i2 = 1709;
                    }
                    break;
                case 204:
                    return ((zq) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Context) obj2, (m9.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj3, (Resources) obj4, i);
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i2 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static tm.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m5773(Object obj) {
        int iM3365 = C0093.m3365();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM3365 > 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return ((tm) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0007. Please report as an issue. */
    /* JADX INFO: renamed from: ۟ۧۡۥۡ, reason: not valid java name and contains not printable characters */
    public static String m5774(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        int i4 = 0;
        while (true) {
            int i5 = 1616;
            while (true) {
                i5 ^= 1633;
                switch (i5) {
                    case 14:
                        break;
                    case 49:
                        i5 = i4 < i2 ? 1709 : 1678;
                        break;
                    case 204:
                        break;
                    case 239:
                        break;
                    default:
                        break;
                }
                return new String(cArr);
            }
            short s = sArr[0 - ((0 - i) - i4)];
            cArr[i4] = (char) ((s & (i3 ^ (-1))) | ((s ^ (-1)) & i3));
            i4 += C0125.f104 ^ (-512);
            int i6 = 1740;
            while (true) {
                i6 ^= 1757;
                switch (i6) {
                    case 17:
                        i6 = 1771;
                        break;
                    case 54:
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۟ۧۢۡ۠, reason: not valid java name and contains not printable characters */
    public static void m5775(Object obj) {
        int iM2756 = C0069.m2756();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM2756 <= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    ((iq) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
                    return;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۧۢۢۧ, reason: not valid java name and contains not printable characters */
    public static String m5776(Object obj) {
        int iM4340 = C0116.m4340();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM4340 > 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return ((File) obj).getName();
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢۦ, reason: not valid java name and contains not printable characters */
    public static String m5777(Object obj) {
        int iM9299 = C0232.m9299();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM9299 >= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return p6.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(obj);
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦۥ, reason: not valid java name and contains not printable characters */
    public static double m5778(double d) {
        int iM2054 = C0055.m2054();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM2054 > 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return Math.acos(d);
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return 0.0d;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۧۥۨۨ, reason: not valid java name and contains not printable characters */
    public static boolean m5779(Object obj) {
        int iM2054 = C0055.m2054();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM2054 >= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return ((MenuItem) obj).hasSubMenu();
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return false;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۧۧۧۢ, reason: not valid java name and contains not printable characters */
    public static void m5780(Object obj, Object obj2) {
        int iM8760 = C0218.m8760();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM8760 >= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    Menu.m5677((Menu) obj, (View) obj2);
                    return;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۠ۡۡۦ, reason: not valid java name and contains not printable characters */
    public static int m5781(Object obj, Object obj2) {
        int iM8270 = C0204.m8270();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM8270 < 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return ((Bundle) obj).getInt((String) obj2);
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return 0;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m5782(Object obj) {
        int iM1959 = C0053.m1959();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM1959 > 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return ((Fragment) obj).J;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۠ۢۨۡ, reason: not valid java name and contains not printable characters */
    public static int m5783(Object obj) {
        int iM9535 = C0235.m9535();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM9535 < 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return ((c) obj).size();
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return 0;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۠ۤۡۢ, reason: not valid java name and contains not printable characters */
    public static List m5784(Object obj) {
        int iM5108 = C0129.m5108();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM5108 > 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return ((i) obj).xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۠ۥۢ۠, reason: not valid java name and contains not printable characters */
    public static int m5785(Object obj) {
        int iM2184 = C0058.m2184();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM2184 >= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return ((lg.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return 0;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۡ۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static Object m5786(Object obj) {
        int iM8184 = C0201.m8184();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM8184 < 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return ((tf.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).get();
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣۣۢۥ, reason: not valid java name and contains not printable characters */
    public static MenuItem m5787(Object obj, char c, char c2) {
        int iM843 = C0023.m843();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM843 >= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return ((MenuItem) obj).setShortcut(c, c2);
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣۢۦۣ, reason: not valid java name and contains not printable characters */
    public static long m5788(Object obj) {
        int iM8604 = C0215.m8604();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM8604 < 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return ((Stream) obj).count();
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return 0L;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣۣۢۧ, reason: not valid java name and contains not printable characters */
    public static int m5789(Object obj) {
        int iM139 = C0004.m139();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM139 <= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return ((HookMain) obj).c2_ori_width;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return 0;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۢۧۦۦ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m5790(Object obj) {
        int iM4340 = C0116.m4340();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM4340 >= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return ((wf) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۢۨۤ۠, reason: not valid java name and contains not printable characters */
    public static ke m5791(Object obj, Object obj2) {
        int iM5064 = C0128.m5064();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM5064 <= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return ((am) obj).xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((gl) obj2);
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣۤۧۦ, reason: not valid java name and contains not printable characters */
    public static n1 m5792() {
        int iM8270 = C0204.m8270();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM8270 <= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return n1.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣۨۢۤ, reason: not valid java name and contains not printable characters */
    public static SparseArray m5793(Object obj) {
        int iM8794 = C0219.m8794();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM8794 >= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return ((wr.l) obj).xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۤۡۦۥ, reason: not valid java name and contains not printable characters */
    public static List m5794(Object obj, Object obj2) {
        int iM6476 = C0149.m6476();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM6476 < 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return ((i) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((String) obj2);
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣۣۤۡ, reason: not valid java name and contains not printable characters */
    public static long m5795(Object obj) {
        int iM2142 = C0057.m2142();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM2142 > 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return ((ViewPropertyAnimator) obj).getDuration();
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return 0L;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۤۨۥۢ, reason: not valid java name and contains not printable characters */
    public static SpannableStringBuilder m5796(Object obj, Object obj2, int i, int i2) {
        int iM7445 = C0181.m7445();
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    if (iM7445 >= 0) {
                        i3 = 1709;
                    }
                    break;
                case 204:
                    return ((vn) obj).append((CharSequence) obj2, i, i2);
                case 239:
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i3 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۤۨۨ۠, reason: not valid java name and contains not printable characters */
    public static int m5797(Object obj, int i) {
        int iM9826 = C0240.m9826();
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (iM9826 >= 0) {
                        i2 = 1709;
                    }
                    break;
                case 204:
                    return ((j0.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).w(i);
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return 0;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i2 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۥ۠ۥۧ, reason: contains not printable characters */
    public static void m5798(Object obj) {
        int iM9461 = C0234.m9461();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM9461 <= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    VideoPickerActivity.T((HookMain) obj);
                    return;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۥ۠ۦۤ, reason: contains not printable characters */
    public static void m5799(Object obj, Object obj2) throws IOException {
        int iM8458 = C0213.m8458();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM8458 > 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    r8.e((OutputStream) obj, (byte[]) obj2);
                    return;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۥۣ۠, reason: contains not printable characters */
    public static void m5800(Object obj) {
        int iM2856 = C0072.m2856();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM2856 <= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    ((bk) obj).xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
                    return;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۥۥۥۤ, reason: contains not printable characters */
    public static Method m5801(Object obj) {
        int iM3450 = C0094.m3450();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM3450 >= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return ((wq) obj).e;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۥۦۤۤ, reason: contains not printable characters */
    public static String m5802(Object obj, Object obj2) {
        int iM7290 = C0176.m7290();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM7290 > 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return ((xd) obj).S(obj2);
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۥۦۧۦ, reason: contains not printable characters */
    public static fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m5803(Object obj, Object obj2) {
        int iM9826 = C0240.m9826();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM9826 >= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return ((fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa((Parcel) obj2);
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۦۥۣۢ, reason: contains not printable characters */
    public static void m5804(Object obj, long j, Object obj2) {
        int iM8104 = C0200.m8104();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM8104 < 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    ((u8) obj).d0(j, (t8.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj2);
                    return;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۧ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m5805(Object obj) {
        int iM3365 = C0093.m3365();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM3365 >= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return ((z1) obj).xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return 0;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۧ۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static TreeMap m5806(Object obj) {
        int iM2388 = C0064.m2388();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM2388 > 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return ((g7) obj).a;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣۧۡۤ, reason: not valid java name and contains not printable characters */
    public static void m5807(Object obj, Object obj2) {
        int iM2448 = C0065.m2448();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM2448 >= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    ((r6) obj).setWindowTitle((CharSequence) obj2);
                    return;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۧۢۢ۟, reason: not valid java name and contains not printable characters */
    public static v0.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa m5808(Object obj) {
        int iM7613 = C0187.m7613();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM7613 >= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return v0.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.this;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣۧۢۧ, reason: not valid java name and contains not printable characters */
    public static int m5809(Object obj) {
        int iM9265 = C0231.m9265();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM9265 > 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return ((MotionEvent) obj).getSource();
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return 0;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۧۥۡۨ, reason: not valid java name and contains not printable characters */
    public static dj m5810() {
        int iM9461 = C0234.m9461();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM9461 <= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return dj.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۧۥۦۡ, reason: not valid java name and contains not printable characters */
    public static fb m5811(Object obj) {
        int iM2856 = C0072.m2856();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM2856 <= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return ((f6) obj).a;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۨۤۥ۠, reason: not valid java name and contains not printable characters */
    public static ContentInfo m5812(Object obj) {
        int iM4950 = C0127.m4950();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM4950 >= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return ((o5.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) obj).xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۨۥۣ۠, reason: not valid java name and contains not printable characters */
    public static int m5813(Object obj) {
        int iM8270 = C0204.m8270();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM8270 < 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return ((m2) obj).b;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return 0;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX INFO: renamed from: ۨۨۢۧ, reason: not valid java name and contains not printable characters */
    public static int[] m5814() {
        int iM9265 = C0231.m9265();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM9265 >= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return ql.l;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }
}
