package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.drawerlayout.widget.C0072;
import androidx.emoji2.text.C0079;
import androidx.savedstate.C0126;
import okhttp3.internal.publicsuffix.C0217;

/* JADX INFO: loaded from: classes.dex */
public class c1 {
    public static InputConnection xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && C0079.m3106(editorInfo) == null) {
            for (ViewParent viewParentM2878 = C0072.m2878(view); viewParentM2878 instanceof View; viewParentM2878 = C0126.m4856(viewParentM2878)) {
                if (viewParentM2878 instanceof ys) {
                    editorInfo.hintText = C0217.m8683((ys) viewParentM2878);
                    break;
                }
            }
        }
        return inputConnection;
    }
}
