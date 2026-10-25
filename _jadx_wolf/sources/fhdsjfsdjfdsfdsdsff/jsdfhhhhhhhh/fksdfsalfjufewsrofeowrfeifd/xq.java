package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.graphics.Typeface;
import androidx.activity.C0017;
import androidx.appcompat.app.C0036;
import androidx.appcompat.view.menu.C0039;
import androidx.core.widget.C0069;
import androidx.emoji2.text.C0078;
import androidx.lifecycle.C0106;
import androidx.profileinstaller.C0112;
import com.example.vcam.C0141;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import okhttp3.C0239;
import okhttp3.internal.publicsuffix.C0218;
import okhttp3.logging.C0230;
import retrofit2.C0259;

/* JADX INFO: loaded from: classes.dex */
public class xq extends wq {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f571short = {2543, 2557, 2546, 2543, 2481, 2543, 2553, 2542, 2549, 2554, 856, 841, 862, 858, 847, 862, 893, 841, 852, 854, 893, 858, 854, 850, 855, 850, 862, 840, 876, 850, 847, 851, 895, 862, 861, 858, 846, 855, 847};

    /* JADX INFO: renamed from: ۢ۠۟, reason: not valid java name and contains not printable characters */
    public static short[] m6359() {
        if (C0106.m3835() > 0) {
            return f571short;
        }
        return null;
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wq
    public Typeface a(Object obj) {
        try {
            Object objM560 = C0017.m560(C0230.m9160(this), 1);
            C0259.m10149(objM560, 0, obj);
            return (Typeface) C0218.m8721(C0141.m5801(this), null, new Object[]{objM560, C0036.m1348(m6359(), 0, 10, 2460), C0078.m3006(-1), C0078.m3006(-1)});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.wq
    public Method m(Class<?> cls) throws NoSuchMethodException {
        Class clsM2682 = C0069.m2682();
        Method methodM9794 = C0239.m9794(Typeface.class, C0039.m1483(m6359(), 10, 29, 827), new Class[]{C0112.m4080(C0017.m560(cls, 1)), String.class, clsM2682, clsM2682});
        C0017.m556(methodM9794, true);
        return methodM9794;
    }
}
