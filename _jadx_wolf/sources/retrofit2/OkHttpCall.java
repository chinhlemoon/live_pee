package retrofit2;

import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q9;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.rj;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.up;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.v2;
import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes.dex */
final class OkHttpCall<T> implements Call<T> {
    private final Object[] args;
    private final okhttp3.Call.Factory callFactory;
    private volatile boolean canceled;

    @GuardedBy("this")
    @Nullable
    private Throwable creationFailure;

    @GuardedBy("this")
    private boolean executed;

    @GuardedBy("this")
    @Nullable
    private okhttp3.Call rawCall;
    private final RequestFactory requestFactory;
    private final Converter<ResponseBody, T> responseConverter;

    public OkHttpCall(RequestFactory requestFactory, Object[] args, okhttp3.Call.Factory callFactory, Converter<ResponseBody, T> responseConverter) {
        this.requestFactory = requestFactory;
        this.args = args;
        this.callFactory = callFactory;
        this.responseConverter = responseConverter;
    }

    @Override // retrofit2.Call
    public OkHttpCall<T> clone() {
        return new OkHttpCall<>(this.requestFactory, this.args, this.callFactory, this.responseConverter);
    }

    @Override // retrofit2.Call
    public synchronized Request request() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return getRawCall().request();
    }

    @Override // retrofit2.Call
    public synchronized up timeout() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create call.", e);
        }
        return getRawCall().timeout();
    }

    @GuardedBy("this")
    private okhttp3.Call getRawCall() throws IOException {
        okhttp3.Call call = this.rawCall;
        if (call != null) {
            return call;
        }
        Throwable th = this.creationFailure;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            okhttp3.Call callCreateRawCall = createRawCall();
            this.rawCall = callCreateRawCall;
            return callCreateRawCall;
        } catch (IOException | Error | RuntimeException e) {
            Utils.throwIfFatal(e);
            this.creationFailure = e;
            throw e;
        }
    }

    @Override // retrofit2.Call
    public void enqueue(final Callback<T> callback) {
        okhttp3.Call call;
        Throwable failure;
        Objects.requireNonNull(callback, "callback == null");
        synchronized (this) {
            if (this.executed) {
                throw new IllegalStateException("Already executed.");
            }
            this.executed = true;
            call = this.rawCall;
            failure = this.creationFailure;
            if (call == null && failure == null) {
                try {
                    okhttp3.Call callCreateRawCall = createRawCall();
                    this.rawCall = callCreateRawCall;
                    call = callCreateRawCall;
                } catch (Throwable t) {
                    Utils.throwIfFatal(t);
                    this.creationFailure = t;
                    failure = t;
                }
            }
        }
        if (failure != null) {
            callback.onFailure(this, failure);
            return;
        }
        if (this.canceled) {
            call.cancel();
        }
        call.enqueue(new okhttp3.Callback() { // from class: retrofit2.OkHttpCall.1
            @Override // okhttp3.Callback
            public void onResponse(okhttp3.Call call2, okhttp3.Response rawResponse) {
                try {
                    Response<T> response = OkHttpCall.this.parseResponse(rawResponse);
                    try {
                        callback.onResponse(OkHttpCall.this, response);
                    } catch (Throwable t2) {
                        Utils.throwIfFatal(t2);
                        t2.printStackTrace();
                    }
                } catch (Throwable e) {
                    Utils.throwIfFatal(e);
                    callFailure(e);
                }
            }

            @Override // okhttp3.Callback
            public void onFailure(okhttp3.Call call2, IOException e) {
                callFailure(e);
            }

            private void callFailure(Throwable e) {
                try {
                    callback.onFailure(OkHttpCall.this, e);
                } catch (Throwable t2) {
                    Utils.throwIfFatal(t2);
                    t2.printStackTrace();
                }
            }
        });
    }

    @Override // retrofit2.Call
    public synchronized boolean isExecuted() {
        return this.executed;
    }

    @Override // retrofit2.Call
    public Response<T> execute() throws IOException {
        okhttp3.Call call;
        synchronized (this) {
            if (this.executed) {
                throw new IllegalStateException("Already executed.");
            }
            this.executed = true;
            call = getRawCall();
        }
        if (this.canceled) {
            call.cancel();
        }
        return parseResponse(call.execute());
    }

    private okhttp3.Call createRawCall() throws IOException {
        okhttp3.Call call = this.callFactory.newCall(this.requestFactory.create(this.args));
        if (call == null) {
            throw new NullPointerException("Call.Factory returned null.");
        }
        return call;
    }

    public Response<T> parseResponse(okhttp3.Response rawResponse) throws IOException {
        ResponseBody rawBody = rawResponse.body();
        okhttp3.Response rawResponse2 = rawResponse.newBuilder().body(new NoContentResponseBody(rawBody.contentType(), rawBody.contentLength())).build();
        int code = rawResponse2.code();
        if (code < 200 || code >= 300) {
            try {
                ResponseBody bufferedBody = Utils.buffer(rawBody);
                return Response.error(bufferedBody, rawResponse2);
            } finally {
                rawBody.close();
            }
        }
        if (code == 204 || code == 205) {
            rawBody.close();
            return Response.success((Object) null, rawResponse2);
        }
        ExceptionCatchingResponseBody catchingBody = new ExceptionCatchingResponseBody(rawBody);
        try {
            T body = this.responseConverter.convert(catchingBody);
            return Response.success(body, rawResponse2);
        } catch (RuntimeException e) {
            catchingBody.throwIfCaught();
            throw e;
        }
    }

    @Override // retrofit2.Call
    public void cancel() {
        okhttp3.Call call;
        this.canceled = true;
        synchronized (this) {
            call = this.rawCall;
        }
        if (call != null) {
            call.cancel();
        }
    }

    @Override // retrofit2.Call
    public boolean isCanceled() {
        boolean z = true;
        if (this.canceled) {
            return true;
        }
        synchronized (this) {
            okhttp3.Call call = this.rawCall;
            if (call == null || !call.isCanceled()) {
                z = false;
            }
        }
        return z;
    }

    public static final class NoContentResponseBody extends ResponseBody {
        private final long contentLength;

        @Nullable
        private final MediaType contentType;

        public NoContentResponseBody(@Nullable MediaType contentType, long contentLength) {
            this.contentType = contentType;
            this.contentLength = contentLength;
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            return this.contentType;
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            return this.contentLength;
        }

        @Override // okhttp3.ResponseBody
        public v2 source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public static final class ExceptionCatchingResponseBody extends ResponseBody {
        private final ResponseBody delegate;
        private final v2 delegateSource;

        @Nullable
        public IOException thrownException;

        public ExceptionCatchingResponseBody(ResponseBody delegate) {
            this.delegate = delegate;
            this.delegateSource = rj.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(new q9(delegate.source()) { // from class: retrofit2.OkHttpCall.ExceptionCatchingResponseBody.1
                @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.q9, fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un
                public long read(s2 sink, long byteCount) throws IOException {
                    try {
                        return super.read(sink, byteCount);
                    } catch (IOException e) {
                        ExceptionCatchingResponseBody.this.thrownException = e;
                        throw e;
                    }
                }
            });
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            return this.delegate.contentType();
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            return this.delegate.contentLength();
        }

        @Override // okhttp3.ResponseBody
        public v2 source() {
            return this.delegateSource;
        }

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
        }

        public void throwIfCaught() throws IOException {
            IOException iOException = this.thrownException;
            if (iOException != null) {
                throw iOException;
            }
        }
    }
}
