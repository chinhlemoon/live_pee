package retrofit2;

import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t5;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes.dex */
abstract class HttpServiceMethod<ResponseT, ReturnT> extends ServiceMethod<ReturnT> {
    private final okhttp3.Call.Factory callFactory;
    private final RequestFactory requestFactory;
    private final Converter<ResponseBody, ResponseT> responseConverter;

    @Nullable
    public abstract ReturnT adapt(Call<ResponseT> call, Object[] objArr);

    public static <ResponseT, ReturnT> HttpServiceMethod<ResponseT, ReturnT> parseAnnotations(Retrofit retrofit, Method method, RequestFactory requestFactory) {
        Annotation[] annotations;
        Type adapterType;
        boolean continuationWantsResponse;
        boolean isKotlinSuspendFunction = requestFactory.isKotlinSuspendFunction;
        boolean continuationWantsResponse2 = false;
        Annotation[] annotations2 = method.getAnnotations();
        if (isKotlinSuspendFunction) {
            Type[] parameterTypes = method.getGenericParameterTypes();
            Type responseType = Utils.getParameterLowerBound(0, (ParameterizedType) parameterTypes[parameterTypes.length - 1]);
            if (Utils.getRawType(responseType) == Response.class && (responseType instanceof ParameterizedType)) {
                responseType = Utils.getParameterUpperBound(0, (ParameterizedType) responseType);
                continuationWantsResponse2 = true;
            }
            Type adapterType2 = new Utils.ParameterizedTypeImpl(null, Call.class, responseType);
            annotations = SkipCallbackExecutorImpl.ensurePresent(annotations2);
            adapterType = adapterType2;
            continuationWantsResponse = continuationWantsResponse2;
        } else {
            Type adapterType3 = method.getGenericReturnType();
            annotations = annotations2;
            adapterType = adapterType3;
            continuationWantsResponse = false;
        }
        CallAdapter<ResponseT, ReturnT> callAdapter = createCallAdapter(retrofit, method, adapterType, annotations);
        Type responseType2 = callAdapter.responseType();
        if (responseType2 == okhttp3.Response.class) {
            throw Utils.methodError(method, "'" + Utils.getRawType(responseType2).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if (responseType2 == Response.class) {
            throw Utils.methodError(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if (requestFactory.httpMethod.equals("HEAD") && !Void.class.equals(responseType2)) {
            throw Utils.methodError(method, "HEAD method must use Void as response type.", new Object[0]);
        }
        Converter<ResponseBody, ResponseT> responseConverter = createResponseConverter(retrofit, method, responseType2);
        okhttp3.Call.Factory callFactory = retrofit.callFactory;
        if (!isKotlinSuspendFunction) {
            return new CallAdapted(requestFactory, callFactory, responseConverter, callAdapter);
        }
        if (continuationWantsResponse) {
            return new SuspendForResponse(requestFactory, callFactory, responseConverter, callAdapter);
        }
        return new SuspendForBody(requestFactory, callFactory, responseConverter, callAdapter, false);
    }

    private static <ResponseT, ReturnT> CallAdapter<ResponseT, ReturnT> createCallAdapter(Retrofit retrofit, Method method, Type type, Annotation[] annotationArr) {
        try {
            return (CallAdapter<ResponseT, ReturnT>) retrofit.callAdapter(type, annotationArr);
        } catch (RuntimeException e) {
            throw Utils.methodError(method, e, "Unable to create call adapter for %s", type);
        }
    }

    private static <ResponseT> Converter<ResponseBody, ResponseT> createResponseConverter(Retrofit retrofit, Method method, Type responseType) {
        Annotation[] annotations = method.getAnnotations();
        try {
            return retrofit.responseBodyConverter(responseType, annotations);
        } catch (RuntimeException e) {
            throw Utils.methodError(method, e, "Unable to create converter for %s", responseType);
        }
    }

    public HttpServiceMethod(RequestFactory requestFactory, okhttp3.Call.Factory callFactory, Converter<ResponseBody, ResponseT> responseConverter) {
        this.requestFactory = requestFactory;
        this.callFactory = callFactory;
        this.responseConverter = responseConverter;
    }

    @Override // retrofit2.ServiceMethod
    @Nullable
    public final ReturnT invoke(Object[] args) {
        Call<ResponseT> call = new OkHttpCall<>(this.requestFactory, args, this.callFactory, this.responseConverter);
        return adapt(call, args);
    }

    public static final class CallAdapted<ResponseT, ReturnT> extends HttpServiceMethod<ResponseT, ReturnT> {
        private final CallAdapter<ResponseT, ReturnT> callAdapter;

        public CallAdapted(RequestFactory requestFactory, okhttp3.Call.Factory callFactory, Converter<ResponseBody, ResponseT> responseConverter, CallAdapter<ResponseT, ReturnT> callAdapter) {
            super(requestFactory, callFactory, responseConverter);
            this.callAdapter = callAdapter;
        }

        @Override // retrofit2.HttpServiceMethod
        public ReturnT adapt(Call<ResponseT> call, Object[] args) {
            return this.callAdapter.adapt(call);
        }
    }

    public static final class SuspendForResponse<ResponseT> extends HttpServiceMethod<ResponseT, Object> {
        private final CallAdapter<ResponseT, Call<ResponseT>> callAdapter;

        public SuspendForResponse(RequestFactory requestFactory, okhttp3.Call.Factory callFactory, Converter<ResponseBody, ResponseT> responseConverter, CallAdapter<ResponseT, Call<ResponseT>> callAdapter) {
            super(requestFactory, callFactory, responseConverter);
            this.callAdapter = callAdapter;
        }

        /* JADX WARN: Generic types in debug info not equals: fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t5 != kotlin.coroutines.Continuation<retrofit2.Response<ResponseT>> */
        @Override // retrofit2.HttpServiceMethod
        public Object adapt(Call<ResponseT> call, Object[] args) {
            Call<ResponseT> call2 = this.callAdapter.adapt(call);
            t5 t5Var = (t5) args[args.length - 1];
            try {
                return KotlinExtensions.awaitResponse(call2, t5Var);
            } catch (Exception e) {
                return KotlinExtensions.suspendAndThrow(e, t5Var);
            }
        }
    }

    public static final class SuspendForBody<ResponseT> extends HttpServiceMethod<ResponseT, Object> {
        private final CallAdapter<ResponseT, Call<ResponseT>> callAdapter;
        private final boolean isNullable;

        public SuspendForBody(RequestFactory requestFactory, okhttp3.Call.Factory callFactory, Converter<ResponseBody, ResponseT> responseConverter, CallAdapter<ResponseT, Call<ResponseT>> callAdapter, boolean isNullable) {
            super(requestFactory, callFactory, responseConverter);
            this.callAdapter = callAdapter;
            this.isNullable = isNullable;
        }

        /* JADX WARN: Generic types in debug info not equals: fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t5 != kotlin.coroutines.Continuation<ResponseT> */
        @Override // retrofit2.HttpServiceMethod
        public Object adapt(Call<ResponseT> call, Object[] args) {
            Call<ResponseT> call2 = this.callAdapter.adapt(call);
            t5 t5Var = (t5) args[args.length - 1];
            try {
                if (this.isNullable) {
                    return KotlinExtensions.awaitNullable(call2, t5Var);
                }
                return KotlinExtensions.await(call2, t5Var);
            } catch (Exception e) {
                return KotlinExtensions.suspendAndThrow(e, t5Var);
            }
        }
    }
}
