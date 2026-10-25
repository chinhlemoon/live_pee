package okhttp3;

import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.e4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l4;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: loaded from: classes.dex */
public final class Dispatcher {
    private ExecutorService executorServiceOrNull;
    private Runnable idleCallback;
    private int maxRequests;
    private int maxRequestsPerHost;
    private final ArrayDeque<RealCall.AsyncCall> readyAsyncCalls;
    private final ArrayDeque<RealCall.AsyncCall> runningAsyncCalls;
    private final ArrayDeque<RealCall> runningSyncCalls;

    public Dispatcher() {
        this.maxRequests = 64;
        this.maxRequestsPerHost = 5;
        this.readyAsyncCalls = new ArrayDeque<>();
        this.runningAsyncCalls = new ArrayDeque<>();
        this.runningSyncCalls = new ArrayDeque<>();
    }

    public final synchronized int getMaxRequests() {
        return this.maxRequests;
    }

    public final void setMaxRequests(int maxRequests) {
        if (!(maxRequests >= 1)) {
            throw new IllegalArgumentException(("max < 1: " + maxRequests).toString());
        }
        synchronized (this) {
            this.maxRequests = maxRequests;
            hr hrVar = hr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        promoteAndExecute();
    }

    public final synchronized int getMaxRequestsPerHost() {
        return this.maxRequestsPerHost;
    }

    public final void setMaxRequestsPerHost(int maxRequestsPerHost) {
        if (!(maxRequestsPerHost >= 1)) {
            throw new IllegalArgumentException(("max < 1: " + maxRequestsPerHost).toString());
        }
        synchronized (this) {
            this.maxRequestsPerHost = maxRequestsPerHost;
            hr hrVar = hr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        promoteAndExecute();
    }

    public final synchronized Runnable getIdleCallback() {
        return this.idleCallback;
    }

    public final synchronized void setIdleCallback(Runnable runnable) {
        this.idleCallback = runnable;
    }

    public final synchronized ExecutorService executorService() {
        ExecutorService executorService;
        if (this.executorServiceOrNull == null) {
            this.executorServiceOrNull = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory(Util.okHttpName + " Dispatcher", false));
        }
        executorService = this.executorServiceOrNull;
        jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(executorService);
        return executorService;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Dispatcher(ExecutorService executorService) {
        this();
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(executorService, "executorService");
        this.executorServiceOrNull = executorService;
    }

    public final void enqueue$okhttp(RealCall.AsyncCall call) {
        RealCall.AsyncCall existingCall;
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(call, "call");
        synchronized (this) {
            this.readyAsyncCalls.add(call);
            if (!call.getCall().getForWebSocket() && (existingCall = findExistingCallWithHost(call.getHost())) != null) {
                call.reuseCallsPerHostFrom(existingCall);
            }
            hr hrVar = hr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        promoteAndExecute();
    }

    private final RealCall.AsyncCall findExistingCallWithHost(String host) {
        for (RealCall.AsyncCall existingCall : this.runningAsyncCalls) {
            if (jd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(existingCall.getHost(), host)) {
                return existingCall;
            }
        }
        for (RealCall.AsyncCall existingCall2 : this.readyAsyncCalls) {
            if (jd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(existingCall2.getHost(), host)) {
                return existingCall2;
            }
        }
        return null;
    }

    public final synchronized void cancelAll() {
        for (RealCall.AsyncCall call : this.readyAsyncCalls) {
            call.getCall().cancel();
        }
        for (RealCall.AsyncCall call2 : this.runningAsyncCalls) {
            call2.getCall().cancel();
        }
        for (RealCall call3 : this.runningSyncCalls) {
            call3.cancel();
        }
    }

    private final boolean promoteAndExecute() {
        int i;
        boolean isRunning;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        List executableCalls = new ArrayList();
        synchronized (this) {
            Iterator<RealCall.AsyncCall> it = this.readyAsyncCalls.iterator();
            jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(it, "readyAsyncCalls.iterator()");
            while (it.hasNext()) {
                RealCall.AsyncCall asyncCall = it.next();
                if (this.runningAsyncCalls.size() >= this.maxRequests) {
                    break;
                }
                if (asyncCall.getCallsPerHost().get() < this.maxRequestsPerHost) {
                    it.remove();
                    asyncCall.getCallsPerHost().incrementAndGet();
                    jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(asyncCall, "asyncCall");
                    executableCalls.add(asyncCall);
                    this.runningAsyncCalls.add(asyncCall);
                }
            }
            i = 0;
            isRunning = runningCallsCount() > 0;
            hr hrVar = hr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        int size = executableCalls.size();
        while (i < size) {
            int i2 = i;
            ((RealCall.AsyncCall) executableCalls.get(i2)).executeOn(executorService());
            i = i2 + 1;
        }
        return isRunning;
    }

    public final synchronized void executed$okhttp(RealCall call) {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(call, "call");
        this.runningSyncCalls.add(call);
    }

    public final void finished$okhttp(RealCall.AsyncCall call) {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(call, "call");
        call.getCallsPerHost().decrementAndGet();
        finished(this.runningAsyncCalls, call);
    }

    public final void finished$okhttp(RealCall call) {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(call, "call");
        finished(this.runningSyncCalls, call);
    }

    private final <T> void finished(Deque<T> deque, T t) {
        Runnable idleCallback;
        synchronized (this) {
            if (!deque.remove(t)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            idleCallback = this.idleCallback;
            hr hrVar = hr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        boolean isRunning = promoteAndExecute();
        if (!isRunning && idleCallback != null) {
            idleCallback.run();
        }
    }

    public final synchronized List<Call> queuedCalls() {
        List<Call> listUnmodifiableList;
        Iterable $this$map$iv = this.readyAsyncCalls;
        ArrayList arrayList = new ArrayList(e4.g($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            RealCall.AsyncCall it = (RealCall.AsyncCall) item$iv$iv;
            arrayList.add(it.getCall());
        }
        listUnmodifiableList = Collections.unmodifiableList(arrayList);
        jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(listUnmodifiableList, "Collections.unmodifiable…yncCalls.map { it.call })");
        return listUnmodifiableList;
    }

    public final synchronized List<Call> runningCalls() {
        List<Call> listUnmodifiableList;
        ArrayDeque<RealCall> arrayDeque = this.runningSyncCalls;
        Iterable $this$map$iv = this.runningAsyncCalls;
        Collection destination$iv$iv = new ArrayList(e4.g($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            RealCall.AsyncCall it = (RealCall.AsyncCall) item$iv$iv;
            destination$iv$iv.add(it.getCall());
        }
        listUnmodifiableList = Collections.unmodifiableList(l4.u(arrayDeque, destination$iv$iv));
        jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(listUnmodifiableList, "Collections.unmodifiable…yncCalls.map { it.call })");
        return listUnmodifiableList;
    }

    public final synchronized int queuedCallsCount() {
        return this.readyAsyncCalls.size();
    }

    public final synchronized int runningCallsCount() {
        return this.runningAsyncCalls.size() + this.runningSyncCalls.size();
    }

    /* JADX INFO: renamed from: -deprecated_executorService, reason: not valid java name */
    public final ExecutorService m6623deprecated_executorService() {
        return executorService();
    }
}
