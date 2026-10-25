package retrofit2;

import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.up;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import okhttp3.Request;

/* JADX INFO: loaded from: classes.dex */
final class DefaultCallAdapterFactory extends CallAdapter.Factory {

    @Nullable
    private final Executor callbackExecutor;

    public DefaultCallAdapterFactory(@Nullable Executor callbackExecutor) {
        this.callbackExecutor = callbackExecutor;
    }

    @Override // retrofit2.CallAdapter.Factory
    @Nullable
    public CallAdapter<?, ?> get(Type returnType, Annotation[] annotations, Retrofit retrofit) {
        if (CallAdapter.Factory.getRawType(returnType) != Call.class) {
            return null;
        }
        if (!(returnType instanceof ParameterizedType)) {
            throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        }
        final Type responseType = Utils.getParameterUpperBound(0, (ParameterizedType) returnType);
        final Executor executor = Utils.isAnnotationPresent(annotations, SkipCallbackExecutor.class) ? null : this.callbackExecutor;
        return new CallAdapter<Object, Call<?>>() { // from class: retrofit2.DefaultCallAdapterFactory.1
            @Override // retrofit2.CallAdapter
            public Type responseType() {
                return responseType;
            }

            @Override // retrofit2.CallAdapter
            public Call<?> adapt(Call<Object> call) {
                Executor executor2 = executor;
                return executor2 == null ? call : new ExecutorCallbackCall(executor2, call);
            }
        };
    }

    public static final class ExecutorCallbackCall<T> implements Call<T> {
        public final Executor callbackExecutor;
        public final Call<T> delegate;

        public ExecutorCallbackCall(Executor callbackExecutor, Call<T> delegate) {
            this.callbackExecutor = callbackExecutor;
            this.delegate = delegate;
        }

        @Override // retrofit2.Call
        public void enqueue(Callback<T> callback) {
            Objects.requireNonNull(callback, "callback == null");
            this.delegate.enqueue(new AnonymousClass1(callback));
        }

        /* JADX INFO: renamed from: retrofit2.DefaultCallAdapterFactory$ExecutorCallbackCall$1, reason: invalid class name */
        public class AnonymousClass1 implements Callback<T> {
            public final /* synthetic */ Callback val$callback;

            public AnonymousClass1(Callback callback) {
                this.val$callback = callback;
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call, final Response<T> response) {
                Executor executor = ExecutorCallbackCall.this.callbackExecutor;
                final Callback callback = this.val$callback;
                executor.execute(new Runnable() { // from class: retrofit2.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.lambda$onResponse$0(callback, response);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$onResponse$0(Callback callback, Response response) {
                if (ExecutorCallbackCall.this.delegate.isCanceled()) {
                    callback.onFailure(ExecutorCallbackCall.this, new IOException("Canceled"));
                } else {
                    callback.onResponse(ExecutorCallbackCall.this, response);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$onFailure$1(Callback callback, Throwable t) {
                callback.onFailure(ExecutorCallbackCall.this, t);
            }

            @Override // retrofit2.Callback
            public void onFailure(Call<T> call, final Throwable t) {
                Executor executor = ExecutorCallbackCall.this.callbackExecutor;
                final Callback callback = this.val$callback;
                executor.execute(new Runnable() { // from class: retrofit2.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa.lambda$onFailure$1(callback, t);
                    }
                });
            }
        }

        @Override // retrofit2.Call
        public boolean isExecuted() {
            return this.delegate.isExecuted();
        }

        @Override // retrofit2.Call
        public Response<T> execute() throws IOException {
            return this.delegate.execute();
        }

        @Override // retrofit2.Call
        public void cancel() {
            this.delegate.cancel();
        }

        @Override // retrofit2.Call
        public boolean isCanceled() {
            return this.delegate.isCanceled();
        }

        @Override // retrofit2.Call
        public Call<T> clone() {
            return new ExecutorCallbackCall(this.callbackExecutor, this.delegate.clone());
        }

        @Override // retrofit2.Call
        public Request request() {
            return this.delegate.request();
        }

        @Override // retrofit2.Call
        public up timeout() {
            return this.delegate.timeout();
        }
    }
}
