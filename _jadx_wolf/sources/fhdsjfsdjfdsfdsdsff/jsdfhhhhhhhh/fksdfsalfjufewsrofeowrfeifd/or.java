package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.C0009;
import androidx.core.content.C0057;
import androidx.emoji2.text.C0084;
import androidx.fragment.app.C0097;
import androidx.savedstate.C0123;
import okhttp3.C0239;
import okhttp3.internal.C0227;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.io.C0199;
import okhttp3.internal.platform.android.C0200;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0219;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0231;
import okhttp3.logging.C0232;

/* JADX INFO: loaded from: classes.dex */
public abstract class or extends Drawable implements vp {
    public Drawable xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawableM4784 = C0123.m4784(this);
        if (drawableM4784 != null) {
            C0199.m8017(drawableM4784, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        Drawable drawableM4784 = C0123.m4784(this);
        if (drawableM4784 != null) {
            C0232.m9330(drawableM4784);
        } else {
            super.clearColorFilter();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        Drawable drawableM4784 = C0123.m4784(this);
        return drawableM4784 != null ? C0231.m9237(drawableM4784) : super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        Drawable drawableM4784 = C0123.m4784(this);
        return drawableM4784 != null ? C0219.m8837(drawableM4784) : super.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        Drawable drawableM4784 = C0123.m4784(this);
        return drawableM4784 != null ? C0201.m8196(drawableM4784) : super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Drawable drawableM4784 = C0123.m4784(this);
        return drawableM4784 != null ? C0227.m9018(drawableM4784, rect) : super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        Drawable drawableM4784 = C0123.m4784(this);
        return drawableM4784 != null ? C0161.m6785(drawableM4784) : super.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        Drawable drawableM4784 = C0123.m4784(this);
        return drawableM4784 != null ? C0225.m8993(drawableM4784) : super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        Drawable drawableM4784 = C0123.m4784(this);
        if (drawableM4784 != null) {
            C0084.m3219(drawableM4784);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawableM4784 = C0123.m4784(this);
        return drawableM4784 != null ? C0057.m2145(drawableM4784, i) : super.onLevelChange(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        Drawable drawableM4784 = C0123.m4784(this);
        if (drawableM4784 != null) {
            C0009.m262(drawableM4784, i);
        } else {
            super.setChangingConfigurations(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i, PorterDuff.Mode mode) {
        Drawable drawableM4784 = C0123.m4784(this);
        if (drawableM4784 != null) {
            C0213.m8431(drawableM4784, i, mode);
        } else {
            super.setColorFilter(i, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        Drawable drawableM4784 = C0123.m4784(this);
        if (drawableM4784 != null) {
            C0097.m3668(drawableM4784, z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        Drawable drawableM4784 = C0123.m4784(this);
        if (drawableM4784 != null) {
            C0181.m7442(drawableM4784, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Drawable drawableM4784 = C0123.m4784(this);
        if (drawableM4784 != null) {
            C0239.m9733(drawableM4784, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        Drawable drawableM4784 = C0123.m4784(this);
        return drawableM4784 != null ? C0200.m8096(drawableM4784, iArr) : super.setState(iArr);
    }
}
