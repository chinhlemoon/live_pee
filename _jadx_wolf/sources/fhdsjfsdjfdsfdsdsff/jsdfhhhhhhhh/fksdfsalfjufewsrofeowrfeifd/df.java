package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.widget.ListView;
import androidx.appcompat.view.menu.C0040;
import androidx.cardview.widget.C0049;
import androidx.core.app.C0051;
import androidx.core.app.C0053;
import androidx.core.content.C0057;
import androidx.drawerlayout.widget.C0072;
import okhttp3.internal.http1.C0187;
import okhttp3.internal.publicsuffix.C0217;
import okhttp3.internal.ws.C0224;

/* JADX INFO: loaded from: classes.dex */
public class df extends m2 {
    public final ListView m;

    public df(ListView listView) {
        super(listView);
        this.m = listView;
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2
    public void b(int i, int i2) {
        C0049.m1744(C0040.m1611(this), i2);
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2
    public boolean xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(int i) {
        return false;
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.m2
    public boolean xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(int i) {
        ListView listViewM1611 = C0040.m1611(this);
        int iM1838 = C0051.m1838(listViewM1611);
        if (iM1838 == 0) {
            return false;
        }
        int iM8908 = C0224.m8908(listViewM1611);
        int iM2132 = C0057.m2132(listViewM1611);
        int i2 = iM2132 + iM8908;
        if (i > 0) {
            return i2 < iM1838 || C0217.m8676(C0187.m7659(listViewM1611, iM8908 + (-1))) > C0053.m1966(listViewM1611);
        }
        if (i < 0) {
            return iM2132 > 0 || C0072.m2885(C0187.m7659(listViewM1611, 0)) < 0;
        }
        return false;
    }
}
