package retrofit2;

import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hr;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.http.Streaming;

/* JADX INFO: loaded from: classes.dex */
final class BuiltInConverters extends Converter.Factory {
    private boolean checkForKotlinUnit = true;

    @Override // retrofit2.Converter.Factory
    @Nullable
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        if (type == ResponseBody.class) {
            if (Utils.isAnnotationPresent(annotations, Streaming.class)) {
                return StreamingResponseBodyConverter.INSTANCE;
            }
            return BufferingResponseBodyConverter.INSTANCE;
        }
        if (type == Void.class) {
            return VoidResponseBodyConverter.INSTANCE;
        }
        if (this.checkForKotlinUnit && type == hr.class) {
            try {
                return UnitResponseBodyConverter.INSTANCE;
            } catch (NoClassDefFoundError e) {
                this.checkForKotlinUnit = false;
                return null;
            }
        }
        return null;
    }

    @Override // retrofit2.Converter.Factory
    @Nullable
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
        if (RequestBody.class.isAssignableFrom(Utils.getRawType(type))) {
            return RequestBodyConverter.INSTANCE;
        }
        return null;
    }

    public static final class VoidResponseBodyConverter implements Converter<ResponseBody, Void> {
        public static final VoidResponseBodyConverter INSTANCE = new VoidResponseBodyConverter();

        @Override // retrofit2.Converter
        public Void convert(ResponseBody value) {
            value.close();
            return null;
        }
    }

    public static final class UnitResponseBodyConverter implements Converter<ResponseBody, hr> {
        public static final UnitResponseBodyConverter INSTANCE = new UnitResponseBodyConverter();

        @Override // retrofit2.Converter
        public hr convert(ResponseBody value) {
            value.close();
            return hr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
    }

    public static final class RequestBodyConverter implements Converter<RequestBody, RequestBody> {
        public static final RequestBodyConverter INSTANCE = new RequestBodyConverter();

        @Override // retrofit2.Converter
        public RequestBody convert(RequestBody value) {
            return value;
        }
    }

    public static final class StreamingResponseBodyConverter implements Converter<ResponseBody, ResponseBody> {
        public static final StreamingResponseBodyConverter INSTANCE = new StreamingResponseBodyConverter();

        @Override // retrofit2.Converter
        public ResponseBody convert(ResponseBody value) {
            return value;
        }
    }

    public static final class BufferingResponseBodyConverter implements Converter<ResponseBody, ResponseBody> {
        public static final BufferingResponseBodyConverter INSTANCE = new BufferingResponseBodyConverter();

        @Override // retrofit2.Converter
        public ResponseBody convert(ResponseBody value) throws IOException {
            try {
                return Utils.buffer(value);
            } finally {
                value.close();
            }
        }
    }

    public static final class ToStringConverter implements Converter<Object, String> {
        public static final ToStringConverter INSTANCE = new ToStringConverter();

        @Override // retrofit2.Converter
        public String convert(Object value) {
            return value.toString();
        }
    }
}
