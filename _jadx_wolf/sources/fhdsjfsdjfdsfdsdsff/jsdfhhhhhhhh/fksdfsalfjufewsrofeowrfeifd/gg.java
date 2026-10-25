package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.support.v4.graphics.drawable.C0009;
import androidx.activity.C0021;
import androidx.core.app.C0055;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0079;
import androidx.profileinstaller.C0113;
import com.example.vcam.C0141;
import okhttp3.internal.concurrent.C0181;
import okhttp3.internal.http2.C0194;
import okhttp3.logging.C0230;
import okhttp3.logging.C0235;

/* JADX INFO: loaded from: classes.dex */
public abstract class gg extends a6 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f289short = {1767, 1738, 1744, 1747, 1730, 1751, 1728, 1739, 1734, 1745, 1744, 1677, 1774, 1730, 1738, 1741, 2751, 2706, 2696, 2699, 2714, 2703, 2712, 2707, 2718, 2697, 2696, 2773, 2742, 2714, 2706, 2709, 2773, 2706, 2710, 2710, 2718, 2719, 2706, 2714, 2703, 2718};

    /* JADX INFO: renamed from: ۡۡۡۧ, reason: not valid java name and contains not printable characters */
    public static short[] m5988() {
        if (C0055.m2054() > 0) {
            return f289short;
        }
        return null;
    }

    public abstract gg S();

    public final String T() {
        gg ggVarM710;
        gg ggVarM7887 = C0194.m7887();
        if (this == ggVarM7887) {
            return C0074.m2984(m5988(), 0, 16, 1699);
        }
        try {
            ggVarM710 = C0021.m710(ggVarM7887);
        } catch (UnsupportedOperationException e) {
            ggVarM710 = null;
        }
        if (this == ggVarM710) {
            return C0181.m7457(m5988(), 16, 26, 2811);
        }
        return null;
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a6
    public String toString() {
        String strM4173 = C0113.m4173(this);
        if (strM4173 != null) {
            return strM4173;
        }
        StringBuilder sb = new StringBuilder();
        C0235.m9501(sb, C0079.m3091(this));
        C0230.m9172(sb, '@');
        C0235.m9501(sb, C0141.m5777(this));
        return C0009.m261(sb);
    }
}
