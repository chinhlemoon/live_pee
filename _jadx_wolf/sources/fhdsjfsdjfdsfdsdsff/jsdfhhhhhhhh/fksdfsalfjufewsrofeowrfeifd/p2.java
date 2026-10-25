package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.core.app.C0055;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0072;
import androidx.profileinstaller.C0119;
import androidx.versionedparcelable.C0133;
import okhttp3.C0238;
import okhttp3.internal.cache.C0172;
import okhttp3.internal.connection.C0182;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.logging.C0232;

/* JADX INFO: loaded from: classes.dex */
public abstract class p2 {
    public final Context xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
    public rn<vo, MenuItem> xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
    public rn<wo, SubMenu> xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;

    public p2(Context context) {
        this.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = context;
    }

    public final void xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa() {
        rn rnVarM2045 = C0055.m2045(this);
        if (rnVarM2045 != null) {
            C0232.m9292(rnVarM2045);
        }
        rn rnVarM8527 = C0214.m8527(this);
        if (rnVarM8527 != null) {
            C0232.m9292(rnVarM8527);
        }
    }

    public final MenuItem xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(MenuItem menuItem) {
        if (!(menuItem instanceof vo)) {
            return menuItem;
        }
        vo voVar = (vo) menuItem;
        if (C0055.m2045(this) == null) {
            this.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = new rn<>();
        }
        MenuItem menuItem2 = (MenuItem) C0133.m5236(C0055.m2045(this), voVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        ki kiVar = new ki(C0069.m2751(this), voVar);
        C0072.m2869(C0055.m2045(this), voVar, kiVar);
        return kiVar;
    }

    public final SubMenu xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(SubMenu subMenu) {
        if (!(subMenu instanceof wo)) {
            return subMenu;
        }
        wo woVar = (wo) subMenu;
        if (C0214.m8527(this) == null) {
            this.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = new rn<>();
        }
        SubMenu subMenu2 = (SubMenu) C0133.m5236(C0214.m8527(this), woVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        po poVar = new po(C0069.m2751(this), woVar);
        C0072.m2869(C0214.m8527(this), woVar, poVar);
        return poVar;
    }

    public final void xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(int i) {
        if (C0055.m2045(this) == null) {
            return;
        }
        int i2 = 0;
        while (i2 < C0238.m9654(C0055.m2045(this))) {
            if (C0072.m2908((vo) C0182.m7525(C0055.m2045(this), i2)) == i) {
                C0172.m7176(C0055.m2045(this), i2);
                i2--;
            }
            i2++;
        }
    }

    public final void xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(int i) {
        if (C0055.m2045(this) == null) {
            return;
        }
        for (int i2 = 0; i2 < C0238.m9654(C0055.m2045(this)); i2++) {
            if (C0119.m4555((vo) C0182.m7525(C0055.m2045(this), i2)) == i) {
                C0172.m7176(C0055.m2045(this), i2);
                return;
            }
        }
    }
}
