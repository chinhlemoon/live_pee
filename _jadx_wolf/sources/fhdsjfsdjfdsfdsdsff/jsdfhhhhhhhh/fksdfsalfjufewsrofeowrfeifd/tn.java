package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.support.v4.app.C0004;
import android.support.v4.graphics.drawable.C0009;
import androidx.activity.C0020;
import androidx.drawerlayout.widget.C0074;
import androidx.emoji2.text.C0084;
import androidx.lifecycle.C0107;
import androidx.profileinstaller.C0112;
import androidx.versionedparcelable.C0135;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.publicsuffix.C0215;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.logging.C0235;
import retrofit2.http.C0249;

/* JADX INFO: loaded from: classes.dex */
public final class tn extends f2 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f501short = {2079, 2051, 2063, 2055, 2057, 2072, 1686, 1675, 1679, 1671, 1677, 1687, 1686, 1225, 1262, 1254, 1251, 1258, 1259, 1199, 1275, 1248, 1199, 1260, 1251, 1248, 1276, 1258, 1199, 1275, 1254, 1250, 1258, 1259, 1199, 1248, 1274, 1275, 1199, 1276, 1248, 1260, 1252, 1258, 1275, 1199};
    public final Socket xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;

    public tn(Socket socket) {
        C0215.m8639(socket, C0249.m10020(m6260(), 0, 6, 2156));
        this.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = socket;
    }

    /* JADX INFO: renamed from: ۟ۢۤۤۦ, reason: not valid java name and contains not printable characters */
    public static short[] m6260() {
        if (C0112.m4054() < 0) {
            return f501short;
        }
        return null;
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f2
    public IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException(C0217.m8706(m6260(), 6, 7, 1762));
        if (iOException != null) {
            C0084.m3250(socketTimeoutException, iOException);
        }
        return socketTimeoutException;
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f2
    public void timedOut() {
        String strM2984 = C0074.m2984(m6260(), 13, 33, 1167);
        try {
            C0213.m8476(C0107.m3897(this));
        } catch (AssertionError e) {
            if (!C0161.m6733(e)) {
                throw e;
            }
            Logger loggerM649 = C0020.m649();
            Level levelM675 = C0020.m675();
            StringBuilder sb = new StringBuilder();
            C0235.m9501(sb, strM2984);
            C0004.m132(sb, C0107.m3897(this));
            C0135.m5328(loggerM649, levelM675, C0009.m261(sb), e);
        } catch (Exception e2) {
            Logger loggerM6410 = C0020.m649();
            Level levelM676 = C0020.m675();
            StringBuilder sb2 = new StringBuilder();
            C0235.m9501(sb2, strM2984);
            C0004.m132(sb2, C0107.m3897(this));
            C0135.m5328(loggerM6410, levelM676, C0009.m261(sb2), e2);
        }
    }
}
