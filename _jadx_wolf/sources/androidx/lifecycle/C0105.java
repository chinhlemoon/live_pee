package androidx.lifecycle;

import androidx.core.graphics.drawable.C0060;
import java.io.ByteArrayOutputStream;
import okhttp3.HttpUrl;

/* JADX INFO: renamed from: androidx.lifecycle.۟ۢۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0105 {

    /* JADX INFO: renamed from: ۣۣۢۦ, reason: not valid java name and contains not printable characters */
    public static int f87 = 660;

    /* JADX INFO: renamed from: ۟ۡۧۧ۠, reason: not valid java name and contains not printable characters */
    public static int m3787(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static int m3788() {
        return 738 ^ C0060.f54;
    }

    /* JADX INFO: renamed from: ۠ۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m3790(String str) {
        String string = HttpUrl.FRAGMENT_ENCODE_SET;
        int i = 0;
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        while (i < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i).toString();
            i++;
            str2 = string2;
        }
        while (string.length() > 0) {
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        for (int i2 = 0; i2 < str.length(); i2 += 2) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(i2)) << 4) | string.indexOf(str.charAt(i2 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str2.charAt(i3 % length2));
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static String m3789(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
