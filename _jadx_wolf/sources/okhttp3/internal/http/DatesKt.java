package okhttp3.internal.http;

import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes.dex */
public final class DatesKt {
    private static final DateFormat[] BROWSER_COMPATIBLE_DATE_FORMATS;
    private static final String[] BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS;
    public static final long MAX_DATE = 253402300799999L;
    private static final DatesKt$STANDARD_DATE_FORMAT$1 STANDARD_DATE_FORMAT = new ThreadLocal<DateFormat>() { // from class: okhttp3.internal.http.DatesKt$STANDARD_DATE_FORMAT$1
        @Override // java.lang.ThreadLocal
        public DateFormat initialValue() {
            SimpleDateFormat $this$apply = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            $this$apply.setLenient(false);
            $this$apply.setTimeZone(Util.UTC);
            return $this$apply;
        }
    };

    /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.http.DatesKt$STANDARD_DATE_FORMAT$1] */
    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS = strArr;
        BROWSER_COMPATIBLE_DATE_FORMATS = new DateFormat[strArr.length];
    }

    public static final Date toHttpDateOrNull(String $this$toHttpDateOrNull) {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa($this$toHttpDateOrNull, "$this$toHttpDateOrNull");
        if ($this$toHttpDateOrNull.length() == 0) {
            return null;
        }
        ParsePosition position = new ParsePosition(0);
        Date date = STANDARD_DATE_FORMAT.get().parse($this$toHttpDateOrNull, position);
        if (position.getIndex() == $this$toHttpDateOrNull.length()) {
            return date;
        }
        String[] strArr = BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS;
        synchronized (strArr) {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                DateFormat[] dateFormatArr = BROWSER_COMPATIBLE_DATE_FORMATS;
                DateFormat format = dateFormatArr[i];
                if (format == null) {
                    SimpleDateFormat $this$apply = new SimpleDateFormat(BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS[i], Locale.US);
                    $this$apply.setTimeZone(Util.UTC);
                    format = $this$apply;
                    dateFormatArr[i] = format;
                }
                position.setIndex(0);
                Date date2 = format.parse($this$toHttpDateOrNull, position);
                if (position.getIndex() != 0) {
                    return date2;
                }
            }
            hr hrVar = hr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
            return null;
        }
    }

    public static final String toHttpDateString(Date $this$toHttpDateString) {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa($this$toHttpDateString, "$this$toHttpDateString");
        String str = STANDARD_DATE_FORMAT.get().format($this$toHttpDateString);
        jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(str, "STANDARD_DATE_FORMAT.get().format(this)");
        return str;
    }
}
