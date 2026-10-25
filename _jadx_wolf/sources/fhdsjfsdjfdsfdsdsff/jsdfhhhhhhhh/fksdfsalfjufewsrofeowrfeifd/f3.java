package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import androidx.annotation.C0026;
import androidx.appcompat.view.menu.C0040;
import androidx.core.app.C0052;
import androidx.savedstate.C0126;
import okhttp3.C0239;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.io.C0195;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.logging.C0234;
import okhttp3.logging.C0236;

/* JADX INFO: loaded from: classes.dex */
public final class f3 {
    public static final float[][] xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = {95.047f, 100.0f, 108.883f};
    public static final float[][] xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    public static int xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = (f > 8.0f ? 1 : (f == 8.0f ? 0 : -1)) > 0 ? f2 * f2 * f2 : f / 903.2963f;
        boolean z = (f2 * f2) * f2 > 0.008856452f;
        float f4 = z ? f2 * f2 * f2 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        float f5 = z ? f2 * f2 * f2 : ((116.0f * f2) - 16.0f) / 903.2963f;
        float[] fArrM7280 = C0176.m7280();
        return C0052.m1885(fArrM7280[0] * f4, fArrM7280[1] * f3, fArrM7280[2] * f5);
    }

    public static float xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(int i) {
        float f = i / 255.0f;
        return f <= 0.04045f ? (f / 12.92f) * 100.0f : ((float) C0214.m8556((0.055f + f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static float xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(int i) {
        return C0040.m1559(C0126.m4928(i));
    }

    public static float xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(float f) {
        float f2 = f / 100.0f;
        return f2 <= 0.008856452f ? 903.2963f * f2 : (116.0f * ((float) C0026.m1008(f2))) - 16.0f;
    }

    public static float xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }

    public static float[] xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(int i) {
        float fM9746 = C0239.m9746(C0234.m9474(i));
        float fM9747 = C0239.m9746(C0126.m4881(i));
        float fM9748 = C0239.m9746(C0236.m9614(i));
        float[][] fArrM7944 = C0195.m7944();
        return new float[]{(fArrM7944[0][0] * fM9746) + (fArrM7944[0][1] * fM9747) + (fArrM7944[0][2] * fM9748), (fArrM7944[1][0] * fM9746) + (fArrM7944[1][1] * fM9747) + (fArrM7944[1][2] * fM9748), (fArrM7944[2][0] * fM9746) + (fArrM7944[2][1] * fM9747) + (fArrM7944[2][2] * fM9748)};
    }

    public static float xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(int i) {
        float fM9746 = C0239.m9746(C0234.m9474(i));
        float fM9747 = C0239.m9746(C0126.m4881(i));
        float fM9748 = C0239.m9746(C0236.m9614(i));
        float[][] fArrM7944 = C0195.m7944();
        return (fArrM7944[1][0] * fM9746) + (fArrM7944[1][1] * fM9747) + (fArrM7944[1][2] * fM9748);
    }

    public static float xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(float f) {
        return f > 8.0f ? ((float) C0214.m8556((((double) f) + 16.0d) / 116.0d, 3.0d)) * 100.0f : (f / 903.2963f) * 100.0f;
    }
}
