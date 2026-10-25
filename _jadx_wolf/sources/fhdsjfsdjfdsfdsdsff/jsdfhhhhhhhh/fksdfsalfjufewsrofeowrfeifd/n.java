package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.support.v4.app.C0006;
import androidx.annotation.C0023;
import androidx.appcompat.app.C0037;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.core.graphics.drawable.C0062;
import okhttp3.internal.C0227;
import okhttp3.internal.cache.C0171;
import okhttp3.internal.http1.C0187;
import retrofit2.C0259;
import retrofit2.converter.scalars.C0243;

/* JADX INFO: loaded from: classes.dex */
public class n extends Drawable {
    public final ActionBarContainer xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;

    public static class xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa {
        public static void xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(Drawable drawable, Outline outline) {
            C0171.m7084(drawable, outline);
        }
    }

    public n(ActionBarContainer actionBarContainer) {
        this.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainerM10158 = C0259.m10158(this);
        if (C0023.m836(actionBarContainerM10158)) {
            Drawable drawableM201 = C0006.m201(actionBarContainerM10158);
            if (drawableM201 != null) {
                C0227.m9045(drawableM201, canvas);
                return;
            }
            return;
        }
        Drawable drawableM2298 = C0062.m2298(actionBarContainerM10158);
        if (drawableM2298 != null) {
            C0227.m9045(drawableM2298, canvas);
        }
        ActionBarContainer actionBarContainerM10159 = C0259.m10158(this);
        Drawable drawableM7631 = C0187.m7631(actionBarContainerM10159);
        if (drawableM7631 == null || !C0243.m9943(actionBarContainerM10159)) {
            return;
        }
        C0227.m9045(drawableM7631, canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainerM10158 = C0259.m10158(this);
        if (C0023.m836(actionBarContainerM10158)) {
            if (C0006.m201(actionBarContainerM10158) != null) {
                C0037.m1413(C0062.m2298(actionBarContainerM10158), outline);
            }
        } else {
            Drawable drawableM2298 = C0062.m2298(actionBarContainerM10158);
            if (drawableM2298 != null) {
                C0037.m1413(drawableM2298, outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
