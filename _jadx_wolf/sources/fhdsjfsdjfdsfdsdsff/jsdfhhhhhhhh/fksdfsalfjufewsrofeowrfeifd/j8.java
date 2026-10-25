package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.graphics.Rect;
import android.support.v4.graphics.drawable.C0010;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.appcompat.view.menu.C0040;
import androidx.core.content.C0057;
import androidx.profileinstaller.C0118;
import androidx.profileinstaller.C0120;
import com.example.vcam.C0141;

/* JADX INFO: loaded from: classes.dex */
public class j8 implements TransformationMethod {
    public final TransformationMethod xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;

    public j8(TransformationMethod transformationMethod) {
        this.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        CharSequence charSequenceM2109 = charSequence;
        if (C0118.m4490(view)) {
            return charSequenceM2109;
        }
        TransformationMethod transformationMethodM4477 = C0118.m4477(this);
        if (transformationMethodM4477 != null) {
            charSequenceM2109 = C0057.m2109(transformationMethodM4477, charSequenceM2109, view);
        }
        if (charSequenceM2109 != null) {
            switch (C0141.m5768(C0040.m1575())) {
                case 1:
                    return C0010.m346(C0040.m1575(), charSequenceM2109);
            }
        }
        return charSequenceM2109;
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethodM4477 = C0118.m4477(this);
        if (transformationMethodM4477 != null) {
            C0120.m4668(transformationMethodM4477, view, charSequence, z, i, rect);
        }
    }

    public TransformationMethod xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa() {
        return C0118.m4477(this);
    }
}
