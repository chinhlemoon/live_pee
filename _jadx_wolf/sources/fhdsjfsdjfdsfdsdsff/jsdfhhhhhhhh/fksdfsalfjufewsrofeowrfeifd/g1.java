package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.support.v4.app.C0002;
import android.support.v4.app.C0004;
import android.support.v4.graphics.drawable.C0009;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.core.graphics.drawable.C0062;
import androidx.core.graphics.drawable.C0064;
import androidx.core.widget.C0069;
import androidx.drawerlayout.widget.C0072;
import androidx.emoji2.text.C0078;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0097;
import androidx.fragment.app.C0099;
import androidx.lifecycle.C0107;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0120;
import androidx.savedstate.C0127;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0133;
import okhttp3.C0238;
import okhttp3.internal.C0227;
import okhttp3.internal.http2.C0191;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.io.C0195;
import okhttp3.internal.proxy.C0213;
import okhttp3.internal.ws.C0225;
import okhttp3.logging.C0232;
import okhttp3.logging.C0235;
import okhttp3.logging.C0236;

/* JADX INFO: loaded from: classes.dex */
public final class g1 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f283short = {1567, 1597, 1586, 1659, 1576, 1660, 1588, 1597, 1586, 1592, 1584, 1593, 1660, 1592, 1582, 1587, 1580, 1638, 1660, 1586, 1587, 1660, 1597, 1599, 1576, 1589, 1578, 1589, 1576, 1573, 1638, 1660, 1578, 1589, 1593, 1579, 1633, 575, 520, 526, 520, 516, 539, 520, 558, 514, 515, 537, 520, 515, 537, 2779, 2772, 2769, 2760, 2778, 2775, 2777, 2762, 2780};

    public static final class xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa {
        public static boolean xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(DragEvent dragEvent, TextView textView, Activity activity) {
            C0062.m2320(activity, dragEvent);
            int iM7857 = C0194.m7857(textView, C0236.m9590(dragEvent), C0115.m4265(dragEvent));
            C0232.m9324(textView);
            try {
                C0195.m7958((Spannable) C0099.m3736(textView), iM7857);
                C0227.m9052(textView, C0127.m4939(new o5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(C0225.m8952(dragEvent), 3)));
                return true;
            } finally {
                C0235.m9496(textView);
            }
        }

        public static boolean xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(DragEvent dragEvent, View view, Activity activity) {
            C0062.m2320(activity, dragEvent);
            C0227.m9052(view, C0127.m4939(new o5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(C0225.m8952(dragEvent), 3)));
            return true;
        }
    }

    public static boolean xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(View view, DragEvent dragEvent) {
        int iM27 = C0002.m27();
        if (iM27 >= 31 || iM27 < 24 || C0133.m5199(dragEvent) != null || C0107.m3912(view) == null) {
            return false;
        }
        Activity activityM5226 = C0133.m5226(view);
        if (activityM5226 != null) {
            if (C0128.m5026(dragEvent) == 1) {
                return !(view instanceof TextView);
            }
            if (C0128.m5026(dragEvent) == 3) {
                return view instanceof TextView ? C0097.m3693(dragEvent, (TextView) view, activityM5226) : C0120.m4676(dragEvent, view, activityM5226);
            }
            return false;
        }
        StringBuilder sb = new StringBuilder();
        C0235.m9501(sb, C0078.m3039(m5983(), 0, 37, 1628));
        C0004.m132(sb, view);
        C0009.m261(sb);
        C0072.m2852(m5983(), 37, 14, 621);
        return false;
    }

    public static boolean xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(TextView textView, int i) {
        if (C0002.m27() >= 31 || C0107.m3912(textView) == null || !(i == 16908322 || i == 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) C0069.m2736(C0107.m3891(textView), C0093.m3362(m5983(), 51, 9, 2744));
        ClipData clipDataM2368 = clipboardManager == null ? null : C0064.m2368(clipboardManager);
        if (clipDataM2368 != null && C0191.m7766(clipDataM2368) > 0) {
            o5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaVar = new o5.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(clipDataM2368, 1);
            C0238.m9705(xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaVar, i != 16908322 ? 1 : 0);
            C0227.m9052(textView, C0127.m4939(xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaVar));
        }
        return true;
    }

    public static Activity xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(View view) {
        for (Context contextM8439 = C0213.m8439(view); contextM8439 instanceof ContextWrapper; contextM8439 = C0002.m49((ContextWrapper) contextM8439)) {
            if (contextM8439 instanceof Activity) {
                return (Activity) contextM8439;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۟ۦۣ, reason: not valid java name and contains not printable characters */
    public static short[] m5983() {
        if (C0128.m5064() <= 0) {
            return f283short;
        }
        return null;
    }
}
