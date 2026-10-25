package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.support.v4.app.C0002;
import android.support.v4.app.C0006;
import android.support.v4.graphics.drawable.C0009;
import androidx.activity.C0014;
import androidx.activity.C0020;
import androidx.annotation.C0023;
import androidx.core.app.C0051;
import androidx.drawerlayout.widget.C0070;
import androidx.fragment.app.C0096;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0118;
import androidx.profileinstaller.C0120;
import java.lang.reflect.Method;
import okhttp3.C0239;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.io.C0195;
import okhttp3.internal.platform.C0204;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.logging.C0236;

/* JADX INFO: loaded from: classes.dex */
public class ct extends bt {
    public static Method c;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f235short = {407, 434, 417, 432, 432, 421, 420, 388, 434, 417, 439, 417, 418, 428, 421, 385, 432, 425, 498, 497, 2436, 2483, 2483, 2478, 2483, 2529, 2466, 2464, 2477, 2477, 2472, 2479, 2470, 2529, 2437, 2483, 2464, 2486, 2464, 2467, 2477, 2468, 2530, 2472, 2482, 2449, 2483, 2478, 2475, 2468, 2466, 2485, 2468, 2469, 2537, 2536, 2529, 2476, 2468, 2485, 2473, 2478, 2469, 2339, 2361, 2330, 2360, 2341, 2336, 2351, 2345, 2366, 2351, 2350, 461, 488, 507, 490, 490, 511, 510, 478, 488, 507, 493, 507, 504, 502, 511, 475, 490, 499, 424, 427, 1309, 1338, 1330, 1335, 1342, 1343, 1403, 1327, 1332, 1403, 1321, 1342, 1327, 1321, 1330, 1342, 1325, 1342, 1403, 1311, 1321, 1338, 1324, 1338, 1337, 1335, 1342, 1400, 1330, 1320, 1291, 1321, 1332, 1329, 1342, 1336, 1327, 1342, 1343, 1395, 1394, 1403, 1334, 1342, 1327, 1331, 1332, 1343};

    public ct(Drawable drawable) {
        super(drawable);
        C0020.m665(this);
    }

    public ct(dt dtVar, Resources resources) {
        super(dtVar, resources);
        C0020.m665(this);
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨ۠, reason: not valid java name and contains not printable characters */
    public static short[] m5909() {
        if (C0164.m6900() < 0) {
            return f235short;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return C0096.m3605(C0051.m1833(this));
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        C0171.m7084(C0051.m1833(this), outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method methodM4486;
        Drawable drawableM1833 = C0051.m1833(this);
        if (drawableM1833 != null && (methodM4486 = C0118.m4486()) != null) {
            try {
                return C0112.m4059((Boolean) C0218.m8721(methodM4486, drawableM1833, new Object[0]));
            } catch (Exception e) {
                C0113.m4161(m5909(), 0, 20, 448);
                C0023.m823(m5909(), 20, 43, 2497);
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        C0009.m295(C0051.m1833(this), f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C0006.m191(C0051.m1833(this), i, i2, i3, i4);
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bt, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        C0120.m4635(this);
        return true;
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bt, android.graphics.drawable.Drawable
    public void setTint(int i) {
        if (C0120.m4662(this)) {
            super.setTint(i);
        } else {
            C0204.m8274(C0051.m1833(this), i);
        }
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bt, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (C0120.m4662(this)) {
            super.setTintList(colorStateList);
        } else {
            C0014.m489(C0051.m1833(this), colorStateList);
        }
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bt, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (C0120.m4662(this)) {
            super.setTintMode(mode);
        } else {
            C0070.m2795(C0051.m1833(this), mode);
        }
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.bt
    public boolean xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa() {
        if (C0002.m27() != 21) {
            return false;
        }
        Drawable drawableM1833 = C0051.m1833(this);
        return (drawableM1833 instanceof GradientDrawable) || (drawableM1833 instanceof DrawableContainer) || (drawableM1833 instanceof InsetDrawable) || (drawableM1833 instanceof RippleDrawable);
    }

    public final void xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa() {
        if (C0118.m4486() == null) {
            try {
                c = C0239.m9794(Drawable.class, C0195.m7915(m5909(), 63, 11, 2378), new Class[0]);
            } catch (Exception e) {
                C0236.m9616(m5909(), 74, 20, 410);
                C0213.m8457(m5909(), 94, 48, 1371);
            }
        }
    }
}
