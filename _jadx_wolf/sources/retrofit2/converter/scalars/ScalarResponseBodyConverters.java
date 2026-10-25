package retrofit2.converter.scalars;

import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes.dex */
final class ScalarResponseBodyConverters {
    private ScalarResponseBodyConverters() {
    }

    public static final class StringResponseBodyConverter implements Converter<ResponseBody, String> {
        public static final StringResponseBodyConverter INSTANCE = new StringResponseBodyConverter();

        @Override // retrofit2.Converter
        public String convert(ResponseBody value) throws IOException {
            return value.string();
        }
    }

    public static final class BooleanResponseBodyConverter implements Converter<ResponseBody, Boolean> {
        public static final BooleanResponseBodyConverter INSTANCE = new BooleanResponseBodyConverter();

        @Override // retrofit2.Converter
        public Boolean convert(ResponseBody value) throws IOException {
            return Boolean.valueOf(value.string());
        }
    }

    public static final class ByteResponseBodyConverter implements Converter<ResponseBody, Byte> {
        public static final ByteResponseBodyConverter INSTANCE = new ByteResponseBodyConverter();

        @Override // retrofit2.Converter
        public Byte convert(ResponseBody value) throws IOException {
            return Byte.valueOf(value.string());
        }
    }

    public static final class CharacterResponseBodyConverter implements Converter<ResponseBody, Character> {
        public static final CharacterResponseBodyConverter INSTANCE = new CharacterResponseBodyConverter();

        @Override // retrofit2.Converter
        public Character convert(ResponseBody value) throws IOException {
            String body = value.string();
            if (body.length() != 1) {
                throw new IOException("Expected body of length 1 for Character conversion but was " + body.length());
            }
            return Character.valueOf(body.charAt(0));
        }
    }

    public static final class DoubleResponseBodyConverter implements Converter<ResponseBody, Double> {
        public static final DoubleResponseBodyConverter INSTANCE = new DoubleResponseBodyConverter();

        @Override // retrofit2.Converter
        public Double convert(ResponseBody value) throws IOException {
            return Double.valueOf(value.string());
        }
    }

    public static final class FloatResponseBodyConverter implements Converter<ResponseBody, Float> {
        public static final FloatResponseBodyConverter INSTANCE = new FloatResponseBodyConverter();

        @Override // retrofit2.Converter
        public Float convert(ResponseBody value) throws IOException {
            return Float.valueOf(value.string());
        }
    }

    public static final class IntegerResponseBodyConverter implements Converter<ResponseBody, Integer> {
        public static final IntegerResponseBodyConverter INSTANCE = new IntegerResponseBodyConverter();

        @Override // retrofit2.Converter
        public Integer convert(ResponseBody value) throws IOException {
            return Integer.valueOf(value.string());
        }
    }

    public static final class LongResponseBodyConverter implements Converter<ResponseBody, Long> {
        public static final LongResponseBodyConverter INSTANCE = new LongResponseBodyConverter();

        @Override // retrofit2.Converter
        public Long convert(ResponseBody value) throws IOException {
            return Long.valueOf(value.string());
        }
    }

    public static final class ShortResponseBodyConverter implements Converter<ResponseBody, Short> {
        public static final ShortResponseBodyConverter INSTANCE = new ShortResponseBodyConverter();

        @Override // retrofit2.Converter
        public Short convert(ResponseBody value) throws IOException {
            return Short.valueOf(value.string());
        }
    }
}
