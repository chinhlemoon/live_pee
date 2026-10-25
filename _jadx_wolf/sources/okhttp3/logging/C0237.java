package okhttp3.logging;

import android.support.v4.app.C0008;
import java.io.ByteArrayOutputStream;
import okhttp3.HttpUrl;

/* JADX INFO: renamed from: okhttp3.logging.ۣۢۤۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0237 {

    /* JADX INFO: renamed from: ۟۠ۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int f687 = -113;

    /* JADX INFO: renamed from: ۟ۤۤۥۥ, reason: not valid java name and contains not printable characters */
    public static String m9648(String str) {
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
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str2.charAt(i3 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = HttpUrl.FRAGMENT_ENCODE_SET.length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۟ۧۤۤۥ, reason: not valid java name and contains not printable characters */
    public static int m9649() {
        return (-201) ^ C0008.f8;
    }

    /* JADX INFO: renamed from: ۦ۟۠ۨ, reason: contains not printable characters */
    public static int m9650(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۨۨ, reason: not valid java name and contains not printable characters */
    public static String m9651(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
