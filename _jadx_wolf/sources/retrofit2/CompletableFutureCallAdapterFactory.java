package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes.dex */
@IgnoreJRERequirement
final class CompletableFutureCallAdapterFactory extends CallAdapter.Factory {
    public static final CallAdapter.Factory INSTANCE = new CompletableFutureCallAdapterFactory();

    @Override // retrofit2.CallAdapter.Factory
    @Nullable
    public CallAdapter<?, ?> get(Type returnType, Annotation[] annotations, Retrofit retrofit) {
        if (CallAdapter.Factory.getRawType(returnType) != CompletableFuture.class) {
            return null;
        }
        if (!(returnType instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type innerType = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) returnType);
        if (CallAdapter.Factory.getRawType(innerType) != Response.class) {
            return new BodyCallAdapter(innerType);
        }
        if (!(innerType instanceof ParameterizedType)) {
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        Type responseType = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) innerType);
        return new ResponseCallAdapter(responseType);
    }

    @IgnoreJRERequirement
    public static final class BodyCallAdapter<R> implements CallAdapter<R, CompletableFuture<R>> {
        private final Type responseType;

        public BodyCallAdapter(Type responseType) {
            this.responseType = responseType;
        }

        @Override // retrofit2.CallAdapter
        public Type responseType() {
            return this.responseType;
        }

        @Override // retrofit2.CallAdapter
        public CompletableFuture<R> adapt(Call<R> call) {
            CompletableFuture<R> future = new CallCancelCompletableFuture<>(call);
            call.enqueue(new BodyCallback(future));
            return future;
        }

        @IgnoreJRERequirement
        public class BodyCallback implements Callback<R> {
            private final CompletableFuture<R> future;

            public BodyCallback(CompletableFuture<R> future) {
                this.future = future;
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<R> call, Response<R> response) {
                if (response.isSuccessful()) {
                    this.future.complete(response.body());
                } else {
                    this.future.completeExceptionally(new HttpException(response));
                }
            }

            @Override // retrofit2.Callback
            public void onFailure(Call<R> call, Throwable t) {
                this.future.completeExceptionally(t);
            }
        }
    }

    @IgnoreJRERequirement
    public static final class ResponseCallAdapter<R> implements CallAdapter<R, CompletableFuture<Response<R>>> {
        private final Type responseType;

        public ResponseCallAdapter(Type responseType) {
            this.responseType = responseType;
        }

        @Override // retrofit2.CallAdapter
        public Type responseType() {
            return this.responseType;
        }

        @Override // retrofit2.CallAdapter
        public CompletableFuture<Response<R>> adapt(Call<R> call) {
            CompletableFuture<Response<R>> future = new CallCancelCompletableFuture<>(call);
            call.enqueue(new ResponseCallback(future));
            return future;
        }

        @IgnoreJRERequirement
        public class ResponseCallback implements Callback<R> {
            private final CompletableFuture<Response<R>> future;

            public ResponseCallback(CompletableFuture<Response<R>> future) {
                this.future = future;
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<R> call, Response<R> response) {
                this.future.complete(response);
            }

            @Override // retrofit2.Callback
            public void onFailure(Call<R> call, Throwable t) {
                this.future.completeExceptionally(t);
            }
        }
    }

    @IgnoreJRERequirement
    public static final class CallCancelCompletableFuture<T> extends CompletableFuture<T> {
        private final Call<?> call;

        public CallCancelCompletableFuture(Call<?> call) {
            this.call = call;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean mayInterruptIfRunning) {
            if (mayInterruptIfRunning) {
                this.call.cancel();
            }
            return super.cancel(mayInterruptIfRunning);
        }
    }
}
