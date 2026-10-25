package okhttp3.internal.connection;

import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.c4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.d4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fa;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.i4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.re;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t6;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Route;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes.dex */
public final class RouteSelector {
    public static final Companion Companion = new Companion(null);
    private final Address address;
    private final Call call;
    private final EventListener eventListener;
    private List<? extends InetSocketAddress> inetSocketAddresses;
    private int nextProxyIndex;
    private final List<Route> postponedRoutes;
    private List<? extends Proxy> proxies;
    private final RouteDatabase routeDatabase;

    public RouteSelector(Address address, RouteDatabase routeDatabase, Call call, EventListener eventListener) {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(address, "address");
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(routeDatabase, "routeDatabase");
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(call, "call");
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(eventListener, "eventListener");
        this.address = address;
        this.routeDatabase = routeDatabase;
        this.call = call;
        this.eventListener = eventListener;
        this.proxies = d4.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        this.inetSocketAddresses = d4.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa();
        this.postponedRoutes = new ArrayList();
        resetNextProxy(address.url(), address.proxy());
    }

    public final boolean hasNext() {
        return hasNextProxy() || (this.postponedRoutes.isEmpty() ^ true);
    }

    public final Selection next() throws IOException {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        List routes = new ArrayList();
        while (hasNextProxy()) {
            Proxy proxy = nextProxy();
            for (InetSocketAddress inetSocketAddress : this.inetSocketAddresses) {
                Route route = new Route(this.address, proxy, inetSocketAddress);
                if (this.routeDatabase.shouldPostpone(route)) {
                    this.postponedRoutes.add(route);
                } else {
                    routes.add(route);
                }
            }
            if (!routes.isEmpty()) {
                break;
            }
        }
        if (routes.isEmpty()) {
            i4.i(routes, this.postponedRoutes);
            this.postponedRoutes.clear();
        }
        return new Selection(routes);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void resetNextProxy(HttpUrl url, Proxy proxy) {
        AnonymousClass1 $fun$selectProxies$1 = new AnonymousClass1(proxy, url);
        this.eventListener.proxySelectStart(this.call, url);
        List<? extends Proxy> listInvoke = $fun$selectProxies$1.invoke();
        this.proxies = listInvoke;
        this.nextProxyIndex = 0;
        this.eventListener.proxySelectEnd(this.call, url, listInvoke);
    }

    /* JADX INFO: renamed from: okhttp3.internal.connection.RouteSelector$resetNextProxy$1, reason: invalid class name */
    public static final class AnonymousClass1 extends re implements fa<List<? extends Proxy>> {
        public final /* synthetic */ Proxy $proxy;
        public final /* synthetic */ HttpUrl $url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Proxy proxy, HttpUrl httpUrl) {
            super(0);
            this.$proxy = proxy;
            this.$url = httpUrl;
        }

        @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.fa
        public final List<? extends Proxy> invoke() {
            Proxy proxy = this.$proxy;
            if (proxy != null) {
                return c4.xadsadasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(proxy);
            }
            URI uri = this.$url.uri();
            if (uri.getHost() == null) {
                return Util.immutableListOf(Proxy.NO_PROXY);
            }
            List<Proxy> listSelect = RouteSelector.this.address.proxySelector().select(uri);
            return listSelect == null || listSelect.isEmpty() ? Util.immutableListOf(Proxy.NO_PROXY) : Util.toImmutableList(listSelect);
        }
    }

    private final boolean hasNextProxy() {
        return this.nextProxyIndex < this.proxies.size();
    }

    private final Proxy nextProxy() throws IOException {
        if (!hasNextProxy()) {
            throw new SocketException("No route to " + this.address.url().host() + "; exhausted proxy configurations: " + this.proxies);
        }
        List<? extends Proxy> list = this.proxies;
        int i = this.nextProxyIndex;
        this.nextProxyIndex = i + 1;
        Proxy result = list.get(i);
        resetNextInetSocketAddress(result);
        return result;
    }

    private final void resetNextInetSocketAddress(Proxy proxy) throws IOException {
        String socketHost;
        int socketPort;
        List mutableInetSocketAddresses = new ArrayList();
        this.inetSocketAddresses = mutableInetSocketAddresses;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            socketHost = this.address.url().host();
            socketPort = this.address.url().port();
        } else {
            SocketAddress proxyAddress = proxy.address();
            if (!(proxyAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + proxyAddress.getClass()).toString());
            }
            socketHost = Companion.getSocketHost((InetSocketAddress) proxyAddress);
            socketPort = ((InetSocketAddress) proxyAddress).getPort();
        }
        if (1 > socketPort || 65535 < socketPort) {
            throw new SocketException("No route to " + socketHost + ':' + socketPort + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            mutableInetSocketAddresses.add(InetSocketAddress.createUnresolved(socketHost, socketPort));
            return;
        }
        this.eventListener.dnsStart(this.call, socketHost);
        List<InetAddress> listLookup = this.address.dns().lookup(socketHost);
        if (listLookup.isEmpty()) {
            throw new UnknownHostException(this.address.dns() + " returned no addresses for " + socketHost);
        }
        this.eventListener.dnsEnd(this.call, socketHost, listLookup);
        for (InetAddress inetAddress : listLookup) {
            mutableInetSocketAddresses.add(new InetSocketAddress(inetAddress, socketPort));
        }
    }

    public static final class Selection {
        private int nextRouteIndex;
        private final List<Route> routes;

        public Selection(List<Route> list) {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(list, "routes");
            this.routes = list;
        }

        public final List<Route> getRoutes() {
            return this.routes;
        }

        public final boolean hasNext() {
            return this.nextRouteIndex < this.routes.size();
        }

        public final Route next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            List<Route> list = this.routes;
            int i = this.nextRouteIndex;
            this.nextRouteIndex = i + 1;
            return list.get(i);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(t6 $constructor_marker) {
            this();
        }

        public final String getSocketHost(InetSocketAddress $this$socketHost) {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa($this$socketHost, "$this$socketHost");
            InetAddress address = $this$socketHost.getAddress();
            if (address == null) {
                String hostName = $this$socketHost.getHostName();
                jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(hostName, "hostName");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(hostAddress, "address.hostAddress");
            return hostAddress;
        }
    }
}
