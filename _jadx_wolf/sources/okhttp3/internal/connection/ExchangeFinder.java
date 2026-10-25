package okhttp3.internal.connection;

import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import java.io.IOException;
import java.net.Socket;
import java.util.List;
import okhttp3.Address;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: classes.dex */
public final class ExchangeFinder {
    private final Address address;
    private final RealCall call;
    private final RealConnectionPool connectionPool;
    private int connectionShutdownCount;
    private final EventListener eventListener;
    private Route nextRouteToTry;
    private int otherFailureCount;
    private int refusedStreamCount;
    private RouteSelector.Selection routeSelection;
    private RouteSelector routeSelector;

    public ExchangeFinder(RealConnectionPool connectionPool, Address address, RealCall call, EventListener eventListener) {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(connectionPool, "connectionPool");
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(address, "address");
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(call, "call");
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(eventListener, "eventListener");
        this.connectionPool = connectionPool;
        this.address = address;
        this.call = call;
        this.eventListener = eventListener;
    }

    public final Address getAddress$okhttp() {
        return this.address;
    }

    public final ExchangeCodec find(OkHttpClient client, RealInterceptorChain chain) {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(client, "client");
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(chain, "chain");
        try {
            RealConnection resultConnection = findHealthyConnection(chain.getConnectTimeoutMillis$okhttp(), chain.getReadTimeoutMillis$okhttp(), chain.getWriteTimeoutMillis$okhttp(), client.pingIntervalMillis(), client.retryOnConnectionFailure(), !jd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(chain.getRequest$okhttp().method(), "GET"));
            return resultConnection.newCodec$okhttp(client, chain);
        } catch (IOException e) {
            trackFailure(e);
            throw new RouteException(e);
        } catch (RouteException e2) {
            trackFailure(e2.getLastConnectException());
            throw e2;
        }
    }

    private final RealConnection findHealthyConnection(int connectTimeout, int readTimeout, int writeTimeout, int pingIntervalMillis, boolean connectionRetryEnabled, boolean doExtensiveHealthChecks) throws IOException {
        while (true) {
            RealConnection candidate = findConnection(connectTimeout, readTimeout, writeTimeout, pingIntervalMillis, connectionRetryEnabled);
            if (candidate.isHealthy(doExtensiveHealthChecks)) {
                return candidate;
            }
            candidate.noNewExchanges$okhttp();
            if (this.nextRouteToTry == null) {
                RouteSelector.Selection selection = this.routeSelection;
                boolean routesLeft = selection != null ? selection.hasNext() : true;
                if (routesLeft) {
                    continue;
                } else {
                    RouteSelector routeSelector = this.routeSelector;
                    boolean routesSelectionLeft = routeSelector != null ? routeSelector.hasNext() : true;
                    if (!routesSelectionLeft) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:71:0x0186  */
    private final RealConnection findConnection(int connectTimeout, int readTimeout, int writeTimeout, int pingIntervalMillis, boolean connectionRetryEnabled) throws IOException {
        RouteSelector localRouteSelector;
        RouteSelector.Selection localRouteSelection;
        List<Route> routes;
        Route route;
        List<Route> list;
        if (this.call.isCanceled()) {
            throw new IOException("Canceled");
        }
        RealConnection callConnection = this.call.getConnection();
        if (callConnection != null) {
            Socket socketReleaseConnectionNoEvents$okhttp = null;
            synchronized (callConnection) {
                if (callConnection.getNoNewExchanges() || !sameHostAndPort(callConnection.route().address().url())) {
                    socketReleaseConnectionNoEvents$okhttp = this.call.releaseConnectionNoEvents$okhttp();
                }
                hr hrVar = hr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
            }
            if (this.call.getConnection() != null) {
                if (!(socketReleaseConnectionNoEvents$okhttp == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                return callConnection;
            }
            if (socketReleaseConnectionNoEvents$okhttp != null) {
                Util.closeQuietly(socketReleaseConnectionNoEvents$okhttp);
            }
            this.eventListener.connectionReleased(this.call, callConnection);
        }
        this.refusedStreamCount = 0;
        this.connectionShutdownCount = 0;
        this.otherFailureCount = 0;
        if (this.connectionPool.callAcquirePooledConnection(this.address, this.call, null, false)) {
            RealConnection result = this.call.getConnection();
            jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(result);
            this.eventListener.connectionAcquired(this.call, result);
            return result;
        }
        Route route2 = this.nextRouteToTry;
        if (route2 != null) {
            list = null;
            jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(route2);
            route = route2;
            this.nextRouteToTry = null;
        } else {
            RouteSelector.Selection selection = this.routeSelection;
            if (selection != null) {
                jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(selection);
                if (selection.hasNext()) {
                    list = null;
                    RouteSelector.Selection selection2 = this.routeSelection;
                    jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(selection2);
                    route = selection2.next();
                } else {
                    localRouteSelector = this.routeSelector;
                    if (localRouteSelector == null) {
                        localRouteSelector = new RouteSelector(this.address, this.call.getClient().getRouteDatabase(), this.call, this.eventListener);
                        this.routeSelector = localRouteSelector;
                    }
                    localRouteSelection = localRouteSelector.next();
                    this.routeSelection = localRouteSelection;
                    routes = localRouteSelection.getRoutes();
                    if (!this.call.isCanceled()) {
                        if (this.connectionPool.callAcquirePooledConnection(this.address, this.call, routes, false)) {
                            RealConnection result2 = this.call.getConnection();
                            jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(result2);
                            this.eventListener.connectionAcquired(this.call, result2);
                            return result2;
                        }
                        route = localRouteSelection.next();
                        list = routes;
                    } else {
                        throw new IOException("Canceled");
                    }
                }
            } else {
                localRouteSelector = this.routeSelector;
                if (localRouteSelector == null) {
                    localRouteSelector = new RouteSelector(this.address, this.call.getClient().getRouteDatabase(), this.call, this.eventListener);
                    this.routeSelector = localRouteSelector;
                }
                localRouteSelection = localRouteSelector.next();
                this.routeSelection = localRouteSelection;
                routes = localRouteSelection.getRoutes();
                if (!this.call.isCanceled()) {
                    if (this.connectionPool.callAcquirePooledConnection(this.address, this.call, routes, false)) {
                        RealConnection result3 = this.call.getConnection();
                        jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(result3);
                        this.eventListener.connectionAcquired(this.call, result3);
                        return result3;
                    }
                    route = localRouteSelection.next();
                    list = routes;
                } else {
                    throw new IOException("Canceled");
                }
            }
        }
        RealConnection newConnection = new RealConnection(this.connectionPool, route);
        this.call.setConnectionToCancel(newConnection);
        try {
            newConnection.connect(connectTimeout, readTimeout, writeTimeout, pingIntervalMillis, connectionRetryEnabled, this.call, this.eventListener);
            this.call.setConnectionToCancel(null);
            this.call.getClient().getRouteDatabase().connected(newConnection.route());
            if (this.connectionPool.callAcquirePooledConnection(this.address, this.call, list, true)) {
                RealConnection result4 = this.call.getConnection();
                jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(result4);
                this.nextRouteToTry = route;
                Util.closeQuietly(newConnection.socket());
                this.eventListener.connectionAcquired(this.call, result4);
                return result4;
            }
            synchronized (newConnection) {
                this.connectionPool.put(newConnection);
                this.call.acquireConnectionNoEvents(newConnection);
                hr hrVar2 = hr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
            }
            this.eventListener.connectionAcquired(this.call, newConnection);
            return newConnection;
        } catch (Throwable th) {
            this.call.setConnectionToCancel(null);
            throw th;
        }
    }

    public final void trackFailure(IOException e) {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(e, "e");
        this.nextRouteToTry = null;
        if ((e instanceof StreamResetException) && ((StreamResetException) e).errorCode == ErrorCode.REFUSED_STREAM) {
            this.refusedStreamCount++;
        } else if (e instanceof ConnectionShutdownException) {
            this.connectionShutdownCount++;
        } else {
            this.otherFailureCount++;
        }
    }

    public final boolean retryAfterFailure() {
        RouteSelector localRouteSelector;
        if (this.refusedStreamCount == 0 && this.connectionShutdownCount == 0 && this.otherFailureCount == 0) {
            return false;
        }
        if (this.nextRouteToTry != null) {
            return true;
        }
        Route retryRoute = retryRoute();
        if (retryRoute != null) {
            this.nextRouteToTry = retryRoute;
            return true;
        }
        RouteSelector.Selection selection = this.routeSelection;
        if ((selection == null || !selection.hasNext()) && (localRouteSelector = this.routeSelector) != null) {
            return localRouteSelector.hasNext();
        }
        return true;
    }

    private final Route retryRoute() {
        RealConnection connection;
        if (this.refusedStreamCount > 1 || this.connectionShutdownCount > 1 || this.otherFailureCount > 0 || (connection = this.call.getConnection()) == null) {
            return null;
        }
        synchronized (connection) {
            if (connection.getRouteFailureCount$okhttp() != 0) {
                return null;
            }
            if (Util.canReuseConnectionFor(connection.route().address().url(), this.address.url())) {
                return connection.route();
            }
            return null;
        }
    }

    public final boolean sameHostAndPort(HttpUrl url) {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(url, "url");
        HttpUrl routeUrl = this.address.url();
        return url.port() == routeUrl.port() && jd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(url.host(), routeUrl.host());
    }
}
