package okhttp3.internal.connection;

import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: loaded from: classes.dex */
public final class ConnectInterceptor implements Interceptor {
    public static final ConnectInterceptor INSTANCE = new ConnectInterceptor();

    private ConnectInterceptor() {
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(chain, "chain");
        RealInterceptorChain realChain = (RealInterceptorChain) chain;
        Exchange exchange = realChain.getCall$okhttp().initExchange$okhttp((RealInterceptorChain) chain);
        RealInterceptorChain connectedChain = RealInterceptorChain.copy$okhttp$default(realChain, 0, exchange, null, 0, 0, 0, 61, null);
        return connectedChain.proceed(realChain.getRequest$okhttp());
    }
}
