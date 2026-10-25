package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.animation.TypeEvaluator;
import androidx.emoji2.text.C0078;
import androidx.profileinstaller.C0112;
import okhttp3.C0239;
import okhttp3.internal.publicsuffix.C0214;
import okhttp3.logging.C0231;

/* JADX INFO: loaded from: classes.dex */
public class s1 implements TypeEvaluator {
    public static final s1 xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = new s1();

    public static s1 xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa() {
        return C0112.m4084();
    }

    @Override // android.animation.TypeEvaluator
    public Object evaluate(float f, Object obj, Object obj2) {
        int iM9261 = C0231.m9261((Integer) obj);
        float f2 = ((iM9261 >> 24) & 255) / 255.0f;
        int iM9262 = C0231.m9261((Integer) obj2);
        float fM8556 = (float) C0214.m8556(((iM9261 >> 16) & 255) / 255.0f, 2.2d);
        float fM8557 = (float) C0214.m8556(((iM9261 >> 8) & 255) / 255.0f, 2.2d);
        float fM8558 = (float) C0214.m8556((iM9261 & 255) / 255.0f, 2.2d);
        return C0078.m3006((C0239.m9744(((((((iM9262 >> 24) & 255) / 255.0f) - f2) * f) + f2) * 255.0f) << 24) | (C0239.m9744(((float) C0214.m8556(((((float) C0214.m8556(((iM9262 >> 16) & 255) / 255.0f, 2.2d)) - fM8556) * f) + fM8556, 0.45454545454545453d)) * 255.0f) << 16) | (C0239.m9744(((float) C0214.m8556(((((float) C0214.m8556(((iM9262 >> 8) & 255) / 255.0f, 2.2d)) - fM8557) * f) + fM8557, 0.45454545454545453d)) * 255.0f) << 8) | C0239.m9744(((float) C0214.m8556(((((float) C0214.m8556((iM9262 & 255) / 255.0f, 2.2d)) - fM8558) * f) + fM8558, 0.45454545454545453d)) * 255.0f));
    }
}
