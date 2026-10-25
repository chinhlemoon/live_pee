package okhttp3.internal.concurrent;

import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.l4;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t6;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes.dex */
public final class TaskRunner {
    public static final Companion Companion = new Companion(null);
    public static final TaskRunner INSTANCE = new TaskRunner(new RealBackend(Util.threadFactory(Util.okHttpName + " TaskRunner", true)));
    private static final Logger logger;
    private final Backend backend;
    private final List<TaskQueue> busyQueues;
    private boolean coordinatorWaiting;
    private long coordinatorWakeUpAt;
    private int nextQueueName;
    private final List<TaskQueue> readyQueues;
    private final Runnable runnable;

    public interface Backend {
        void beforeTask(TaskRunner taskRunner);

        void coordinatorNotify(TaskRunner taskRunner);

        void coordinatorWait(TaskRunner taskRunner, long j);

        void execute(Runnable runnable);

        long nanoTime();
    }

    public TaskRunner(Backend backend) {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(backend, "backend");
        this.backend = backend;
        this.nextQueueName = 10000;
        this.busyQueues = new ArrayList();
        this.readyQueues = new ArrayList();
        this.runnable = new Runnable() { // from class: okhttp3.internal.concurrent.TaskRunner$runnable$1
            @Override // java.lang.Runnable
            public void run() {
                Task task;
                while (true) {
                    synchronized (this.this$0) {
                        task = this.this$0.awaitTaskToRun();
                    }
                    if (task == null) {
                        return;
                    }
                    TaskQueue queue$iv = task.getQueue$okhttp();
                    jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(queue$iv);
                    long startNs$iv = -1;
                    boolean loggingEnabled$iv = TaskRunner.Companion.getLogger().isLoggable(Level.FINE);
                    if (loggingEnabled$iv) {
                        startNs$iv = queue$iv.getTaskRunner$okhttp().getBackend().nanoTime();
                        TaskLoggerKt.log(task, queue$iv, "starting");
                    }
                    try {
                        this.this$0.runTask(task);
                        try {
                            hr hrVar = hr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
                            if (loggingEnabled$iv) {
                                TaskLoggerKt.log(task, queue$iv, "finished run in " + TaskLoggerKt.formatDuration(queue$iv.getTaskRunner$okhttp().getBackend().nanoTime() - startNs$iv));
                            }
                        } catch (Throwable th) {
                            if (loggingEnabled$iv) {
                                long elapsedNs$iv = queue$iv.getTaskRunner$okhttp().getBackend().nanoTime() - startNs$iv;
                                if (0 != 0) {
                                    TaskLoggerKt.log(task, queue$iv, "finished run in " + TaskLoggerKt.formatDuration(elapsedNs$iv));
                                } else {
                                    TaskLoggerKt.log(task, queue$iv, "failed a run in " + TaskLoggerKt.formatDuration(elapsedNs$iv));
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        this.this$0.getBackend().execute(this);
                        throw th2;
                    }
                }
            }
        };
    }

    public final Backend getBackend() {
        return this.backend;
    }

    public final void kickCoordinator$okhttp(TaskQueue taskQueue) {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(taskQueue, "taskQueue");
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        Object $this$assertThreadHoldsLock$iv = taskQueue.getActiveTask$okhttp();
        if ($this$assertThreadHoldsLock$iv == null) {
            if (!taskQueue.getFutureTasks$okhttp().isEmpty()) {
                Util.addIfAbsent(this.readyQueues, taskQueue);
            } else {
                this.readyQueues.remove(taskQueue);
            }
        }
        if (this.coordinatorWaiting) {
            this.backend.coordinatorNotify(this);
        } else {
            this.backend.execute(this.runnable);
        }
    }

    private final void beforeRun(Task task) {
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        task.setNextExecuteNanoTime$okhttp(-1L);
        TaskQueue queue = task.getQueue$okhttp();
        jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(queue);
        queue.getFutureTasks$okhttp().remove(task);
        this.readyQueues.remove(queue);
        queue.setActiveTask$okhttp(task);
        this.busyQueues.add(queue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runTask(Task task) {
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
        Thread currentThread = Thread.currentThread();
        jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(currentThread, "currentThread");
        String oldName = currentThread.getName();
        currentThread.setName(task.getName());
        try {
            long delayNanos = task.runOnce();
            synchronized (this) {
                afterRun(task, delayNanos);
                hr hrVar = hr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
            }
        } finally {
            synchronized (this) {
                afterRun(task, -1L);
                hr hrVar2 = hr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
                currentThread.setName(oldName);
            }
        }
    }

    private final void afterRun(Task task, long delayNanos) {
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        TaskQueue queue = task.getQueue$okhttp();
        jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(queue);
        if (!(queue.getActiveTask$okhttp() == task)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean cancelActiveTask = queue.getCancelActiveTask$okhttp();
        queue.setCancelActiveTask$okhttp(false);
        queue.setActiveTask$okhttp(null);
        this.busyQueues.remove(queue);
        if (delayNanos != -1 && !cancelActiveTask && !queue.getShutdown$okhttp()) {
            queue.scheduleAndDecide$okhttp(task, delayNanos, true);
        }
        if (!queue.getFutureTasks$okhttp().isEmpty()) {
            this.readyQueues.add(queue);
        }
    }

    public final Task awaitTaskToRun() {
        if (!Util.assertionsEnabled || Thread.holdsLock(this)) {
            while (!this.readyQueues.isEmpty()) {
                long now = this.backend.nanoTime();
                boolean multipleReadyTasks = false;
                long minDelayNanos = Long.MAX_VALUE;
                Task readyTask = null;
                for (TaskQueue queue : this.readyQueues) {
                    Task candidate = queue.getFutureTasks$okhttp().get(0);
                    long candidateDelay = Math.max(0L, candidate.getNextExecuteNanoTime$okhttp() - now);
                    if (candidateDelay > 0) {
                        minDelayNanos = Math.min(candidateDelay, minDelayNanos);
                    } else {
                        if (readyTask != null) {
                            multipleReadyTasks = true;
                            break;
                        }
                        readyTask = candidate;
                    }
                }
                if (readyTask != null) {
                    beforeRun(readyTask);
                    if (multipleReadyTasks || (!this.coordinatorWaiting && (true ^ this.readyQueues.isEmpty()))) {
                        this.backend.execute(this.runnable);
                    }
                    return readyTask;
                }
                if (this.coordinatorWaiting) {
                    if (minDelayNanos < this.coordinatorWakeUpAt - now) {
                        this.backend.coordinatorNotify(this);
                    }
                    return null;
                }
                this.coordinatorWaiting = true;
                this.coordinatorWakeUpAt = now + minDelayNanos;
                try {
                    try {
                        this.backend.coordinatorWait(this, minDelayNanos);
                    } catch (InterruptedException e) {
                        cancelAll();
                    }
                    this.coordinatorWaiting = false;
                } catch (Throwable th) {
                    this.coordinatorWaiting = false;
                    throw th;
                }
            }
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread threadCurrentThread = Thread.currentThread();
        jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(threadCurrentThread, "Thread.currentThread()");
        sb.append(threadCurrentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    public final TaskQueue newQueue() {
        int name;
        synchronized (this) {
            name = this.nextQueueName;
            this.nextQueueName = name + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('Q');
        sb.append(name);
        return new TaskQueue(this, sb.toString());
    }

    public final List<TaskQueue> activeQueues() {
        List<TaskQueue> listU;
        synchronized (this) {
            listU = l4.u(this.busyQueues, this.readyQueues);
        }
        return listU;
    }

    public final void cancelAll() {
        for (int i = this.busyQueues.size() - 1; i >= 0; i--) {
            this.busyQueues.get(i).cancelAllAndDecide$okhttp();
        }
        for (int i2 = this.readyQueues.size() - 1; i2 >= 0; i2--) {
            TaskQueue queue = this.readyQueues.get(i2);
            queue.cancelAllAndDecide$okhttp();
            if (queue.getFutureTasks$okhttp().isEmpty()) {
                this.readyQueues.remove(i2);
            }
        }
    }

    public static final class RealBackend implements Backend {
        private final ThreadPoolExecutor executor;

        public RealBackend(ThreadFactory threadFactory) {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(threadFactory, "threadFactory");
            this.executor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void beforeTask(TaskRunner taskRunner) {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(taskRunner, "taskRunner");
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public long nanoTime() {
            return System.nanoTime();
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void coordinatorNotify(TaskRunner taskRunner) {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void coordinatorWait(TaskRunner taskRunner, long nanos) throws InterruptedException {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(taskRunner, "taskRunner");
            long ms = nanos / 1000000;
            long ns = nanos - (1000000 * ms);
            if (ms > 0 || nanos > 0) {
                taskRunner.wait(ms, (int) ns);
            }
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void execute(Runnable runnable) {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(runnable, "runnable");
            this.executor.execute(runnable);
        }

        public final void shutdown() {
            this.executor.shutdown();
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(t6 $constructor_marker) {
            this();
        }

        public final Logger getLogger() {
            return TaskRunner.logger;
        }
    }

    static {
        Logger logger2 = Logger.getLogger(TaskRunner.class.getName());
        jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(logger2, "Logger.getLogger(TaskRunner::class.java.name)");
        logger = logger2;
    }
}
