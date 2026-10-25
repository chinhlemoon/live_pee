package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v4.graphics.drawable.C0010;
import android.support.v4.graphics.drawable.C0011;
import androidx.annotation.C0023;
import androidx.appcompat.view.menu.C0040;
import androidx.core.content.C0058;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0065;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0097;
import androidx.fragment.app.C0099;
import androidx.lifecycle.C0108;
import androidx.profileinstaller.C0115;
import androidx.savedstate.C0123;
import com.example.vcam.R;
import okhttp3.C0240;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.platform.android.C0200;
import retrofit2.converter.scalars.C0243;

/* JADX INFO: loaded from: classes.dex */
public class o {
    public Context xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;

    public o(Context context) {
        this.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = context;
    }

    public static o xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(Context context) {
        return new o(context);
    }

    public boolean xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa() {
        return C0062.m2294(C0023.m839(C0097.m3688(this))) < 14;
    }

    public int xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa() {
        return C0010.m384(C0181.m7411(C0097.m3688(this)), R.dimen.abc_action_bar_stacked_tab_max_width);
    }

    public int xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa() {
        return C0115.m4256(C0040.m1590(C0181.m7411(C0097.m3688(this)))) / 2;
    }

    public int xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa() {
        Configuration configurationM8064 = C0200.m8064(C0181.m7411(C0097.m3688(this)));
        int iM2178 = C0058.m2178(configurationM8064);
        int iM9838 = C0240.m9838(configurationM8064);
        if (C0094.m3419(configurationM8064) > 600 || iM2178 > 600) {
            return 5;
        }
        if (iM2178 > 960 && iM9838 > 720) {
            return 5;
        }
        if (iM2178 > 720 && iM9838 > 960) {
            return 5;
        }
        if (iM2178 >= 500) {
            return 4;
        }
        if (iM2178 > 640 && iM9838 > 480) {
            return 4;
        }
        if (iM2178 <= 480 || iM9838 <= 640) {
            return iM2178 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa() {
        TypedArray typedArrayM3737 = C0099.m3737(C0097.m3688(this), null, C0065.m2442(), R.attr.actionBarStyle, 0);
        C0065.m2442();
        int iM4014 = C0108.m4014(typedArrayM3737, 13, 0);
        Resources resourcesM7411 = C0181.m7411(C0097.m3688(this));
        if (!C0243.m9896(this)) {
            iM4014 = C0194.m7880(iM4014, C0010.m384(resourcesM7411, R.dimen.abc_action_bar_stacked_max_height));
        }
        C0123.m4819(typedArrayM3737);
        return iM4014;
    }

    public boolean xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa() {
        return C0011.m411(C0181.m7411(C0097.m3688(this)), R.bool.abc_action_bar_embed_tabs);
    }

    public boolean xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa() {
        return true;
    }
}
