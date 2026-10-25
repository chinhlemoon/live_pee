package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.C0002;
import android.support.v4.app.C0006;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0021;
import androidx.annotation.C0023;
import androidx.appcompat.app.C0034;
import androidx.appcompat.view.menu.C0039;
import androidx.appcompat.view.menu.C0040;
import androidx.core.content.C0057;
import androidx.emoji2.text.C0083;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0097;
import androidx.profileinstaller.C0118;
import androidx.startup.C0128;
import com.example.vcam.R;
import okhttp3.internal.cache.C0164;
import okhttp3.internal.cache2.C0176;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0230;
import okhttp3.logging.C0236;
import retrofit2.C0259;
import retrofit2.converter.scalars.C0243;
import retrofit2.http.C0249;

/* JADX INFO: loaded from: classes.dex */
public class y0 extends f5 implements q0 {
    public u0 xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
    public final ne.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;

    public y0(Context context, int i) {
        super(context, C0023.m831(context, i));
        this.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = new x0(this);
        u0 u0VarM10152 = C0259.m10152(this);
        C0128.m5030(u0VarM10152, C0023.m831(context, i));
        C0236.m9633(u0VarM10152, null);
    }

    public static int b(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        C0188.m7690(C0040.m1553(context), R.attr.dialogTheme, typedValue, true);
        return C0128.m5063(typedValue);
    }

    public u0 a() {
        if (C0225.m8968(this) == null) {
            this.xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = C0243.m9905(this, this);
        }
        return C0225.m8968(this);
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C0243.m9975(C0259.m10152(this), view, layoutParams);
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q0
    public q c(q.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaVar) {
        return null;
    }

    public boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        C0230.m9150(C0259.m10152(this));
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C0164.m6916(C0034.m1200(this), C0118.m4480(C0243.m9973(this)), this, keyEvent);
    }

    public boolean e(int i) {
        return C0057.m2130(C0259.m10152(this), i);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) C0039.m1543(C0259.m10152(this), i);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        C0094.m3410(C0259.m10152(this));
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f5, android.app.Dialog
    public void onCreate(Bundle bundle) {
        C0176.m7296(C0259.m10152(this));
        super.onCreate(bundle);
        C0236.m9633(C0259.m10152(this), bundle);
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.f5, android.app.Dialog
    public void onStop() {
        super.onStop();
        C0097.m3619(C0259.m10152(this));
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        C0083.m3201(C0259.m10152(this), i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        C0249.m10070(C0259.m10152(this), view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C0097.m3658(C0259.m10152(this), view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        C0006.m196(C0259.m10152(this), C0021.m741(C0002.m83(this), i));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        C0006.m196(C0259.m10152(this), charSequence);
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q0
    public void xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(q qVar) {
    }

    @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q0
    public void xadsdsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(q qVar) {
    }
}
