package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import okhttp3.ResponseBody;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes.dex */
@IgnoreJRERequirement
final class OptionalConverterFactory extends Converter.Factory {
    public static final Converter.Factory INSTANCE = new OptionalConverterFactory();

    @Override // retrofit2.Converter.Factory
    @Nullable
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        if (Converter.Factory.getRawType(type) != Optional.class) {
            return null;
        }
        Type innerType = Converter.Factory.getParameterUpperBound(0, (ParameterizedType) type);
        Converter<ResponseBody, Object> delegate = retrofit.responseBodyConverter(innerType, annotations);
        return new OptionalConverter(delegate);
    }

    @IgnoreJRERequirement
    public static final class OptionalConverter<T> implements Converter<ResponseBody, Optional<T>> {
        public final Converter<ResponseBody, T> delegate;

        public OptionalConverter(Converter<ResponseBody, T> delegate) {
            this.delegate = delegate;
        }

        @Override // retrofit2.Converter
        public Optional<T> convert(ResponseBody value) throws IOException {
            return Optional.ofNullable(this.delegate.convert(value));
        }
    }
}
