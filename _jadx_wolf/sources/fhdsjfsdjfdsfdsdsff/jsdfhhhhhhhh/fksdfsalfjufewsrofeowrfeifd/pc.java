package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.appcompat.app.C0034;
import androidx.core.content.UnusedAppRestrictionsBackportService;
import androidx.core.graphics.drawable.C0062;
import androidx.drawerlayout.widget.C0070;
import androidx.drawerlayout.widget.C0072;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0120;
import okhttp3.logging.C0231;

/* JADX INFO: loaded from: classes.dex */
public interface pc extends IInterface {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    public static final short[] f432short = {1070, 1057, 1067, 1085, 1056, 1062, 1067, 1079, 1131, 1068, 1056, 1085, 1066, 1131, 1070, 1087, 1087, 1131, 1082, 1057, 1082, 1084, 1066, 1067, 1070, 1087, 1087, 1085, 1066, 1084, 1083, 1085, 1062, 1068, 1083, 1062, 1056, 1057, 1084, 1131, 1030, 1050, 1057, 1082, 1084, 1066, 1067, 1038, 1087, 1087, 1053, 1066, 1084, 1083, 1085, 1062, 1068, 1083, 1062, 1056, 1057, 1084, 1037, 1070, 1068, 1060, 1087, 1056, 1085, 1083, 1052, 1066, 1085, 1081, 1062, 1068, 1066};
    public static final String xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = C0034.m1230(f432short, 0, 77, 1103).replace('$', '.');

    public static abstract class xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa extends Binder implements pc {
        public xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa() {
            C0120.m4658(this, this, C0115.m4244());
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String strM4244 = C0115.m4244();
            if (i >= 1 && i <= 16777215) {
                C0062.m2325(parcel, strM4244);
            }
            switch (i) {
                case 1598968902:
                    C0072.m2906(parcel2, strM4244);
                    return true;
                default:
                    switch (i) {
                        case 1:
                            C0070.m2830((UnusedAppRestrictionsBackportService.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa) this, C0149.m6477(C0231.m9238(parcel)));
                            return true;
                        default:
                            return super.onTransact(i, parcel, parcel2, i2);
                    }
            }
        }
    }
}
