package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.app.C0052;
import androidx.core.graphics.drawable.C0066;
import androidx.emoji2.text.C0083;
import androidx.fragment.app.C0096;
import androidx.fragment.app.C0097;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0127;
import okhttp3.C0239;
import okhttp3.internal.connection.C0182;
import okhttp3.logging.C0231;
import retrofit2.converter.scalars.C0243;

/* JADX INFO: loaded from: classes.dex */
public class po extends ni implements SubMenu {
    public final wo xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;

    public po(Context context, wo woVar) {
        super(context, woVar);
        this.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = woVar;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        C0097.m3694(C0182.m7534(this));
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return C0127.m4947(this, C0066.m2563(C0182.m7534(this)));
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        C0120.m4685(C0182.m7534(this), i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        C0083.m3193(C0182.m7534(this), drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        C0243.m9945(C0182.m7534(this), i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        C0096.m3548(C0182.m7534(this), charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        C0231.m9235(C0182.m7534(this), view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        C0052.m1888(C0182.m7534(this), i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        C0239.m9795(C0182.m7534(this), drawable);
        return this;
    }
}
