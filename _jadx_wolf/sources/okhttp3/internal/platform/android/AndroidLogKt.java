package okhttp3.internal.platform.android;

import java.util.logging.Level;
import java.util.logging.LogRecord;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidLogKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int getAndroidLevel(LogRecord $this$androidLevel) {
        if ($this$androidLevel.getLevel().intValue() > Level.INFO.intValue()) {
            return 5;
        }
        return $this$androidLevel.getLevel().intValue() == Level.INFO.intValue() ? 4 : 3;
    }
}
