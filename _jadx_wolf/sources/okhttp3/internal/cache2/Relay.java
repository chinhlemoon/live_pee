package okhttp3.internal.cache2;

import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.a3;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.hr;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.t6;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.up;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes.dex */
public final class Relay {
    public static final Companion Companion = new Companion(null);
    private static final long FILE_HEADER_SIZE = 32;
    public static final a3 PREFIX_CLEAN;
    public static final a3 PREFIX_DIRTY;
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    private final s2 buffer;
    private final long bufferMaxSize;
    private boolean complete;
    private RandomAccessFile file;
    private final a3 metadata;
    private int sourceCount;
    private un upstream;
    private final s2 upstreamBuffer;
    private long upstreamPos;
    private Thread upstreamReader;

    private Relay(RandomAccessFile file, un upstream, long upstreamPos, a3 metadata, long bufferMaxSize) {
        this.file = file;
        this.upstream = upstream;
        this.upstreamPos = upstreamPos;
        this.metadata = metadata;
        this.bufferMaxSize = bufferMaxSize;
        this.upstreamBuffer = new s2();
        this.complete = this.upstream == null;
        this.buffer = new s2();
    }

    public /* synthetic */ Relay(RandomAccessFile file, un upstream, long upstreamPos, a3 metadata, long bufferMaxSize, t6 $constructor_marker) {
        this(file, upstream, upstreamPos, metadata, bufferMaxSize);
    }

    public final RandomAccessFile getFile() {
        return this.file;
    }

    public final void setFile(RandomAccessFile randomAccessFile) {
        this.file = randomAccessFile;
    }

    public final un getUpstream() {
        return this.upstream;
    }

    public final void setUpstream(un unVar) {
        this.upstream = unVar;
    }

    public final long getUpstreamPos() {
        return this.upstreamPos;
    }

    public final void setUpstreamPos(long j) {
        this.upstreamPos = j;
    }

    public final long getBufferMaxSize() {
        return this.bufferMaxSize;
    }

    public final Thread getUpstreamReader() {
        return this.upstreamReader;
    }

    public final void setUpstreamReader(Thread thread) {
        this.upstreamReader = thread;
    }

    public final s2 getUpstreamBuffer() {
        return this.upstreamBuffer;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final void setComplete(boolean z) {
        this.complete = z;
    }

    public final s2 getBuffer() {
        return this.buffer;
    }

    public final int getSourceCount() {
        return this.sourceCount;
    }

    public final void setSourceCount(int i) {
        this.sourceCount = i;
    }

    public final boolean isClosed() {
        return this.file == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeHeader(a3 prefix, long upstreamSize, long metadataSize) throws IOException {
        s2 header = new s2();
        header.f0(prefix);
        header.n0(upstreamSize);
        header.n0(metadataSize);
        if (!(header.b0() == FILE_HEADER_SIZE)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        RandomAccessFile randomAccessFile = this.file;
        jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(channel, "file!!.channel");
        FileOperator fileOperator = new FileOperator(channel);
        fileOperator.write(0L, header, FILE_HEADER_SIZE);
    }

    private final void writeMetadata(long upstreamSize) throws IOException {
        s2 metadataBuffer = new s2();
        metadataBuffer.f0(this.metadata);
        RandomAccessFile randomAccessFile = this.file;
        jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(channel, "file!!.channel");
        FileOperator fileOperator = new FileOperator(channel);
        fileOperator.write(FILE_HEADER_SIZE + upstreamSize, metadataBuffer, this.metadata.k());
    }

    public final void commit(long upstreamSize) throws IOException {
        writeMetadata(upstreamSize);
        RandomAccessFile randomAccessFile = this.file;
        jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(randomAccessFile);
        randomAccessFile.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, upstreamSize, this.metadata.k());
        RandomAccessFile randomAccessFile2 = this.file;
        jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
            hr hrVar = hr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        }
        un unVar = this.upstream;
        if (unVar != null) {
            Util.closeQuietly(unVar);
        }
        this.upstream = null;
    }

    public final a3 metadata() {
        return this.metadata;
    }

    public final un newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new RelaySource();
        }
    }

    public final class RelaySource implements un {
        private FileOperator fileOperator;
        private long sourcePos;
        private final up timeout = new up();

        public RelaySource() {
            RandomAccessFile file = Relay.this.getFile();
            jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(file);
            FileChannel channel = file.getChannel();
            jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(channel, "file!!.channel");
            this.fileOperator = new FileOperator(channel);
        }

        @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un
        public long read(s2 sink, long byteCount) throws Throwable {
            Thread thread;
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(sink, "sink");
            int i = 1;
            if (!(this.fileOperator != null)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            synchronized (Relay.this) {
                while (true) {
                    long upstreamPos = Relay.this.getUpstreamPos();
                    if (this.sourcePos == upstreamPos) {
                        if (!Relay.this.getComplete()) {
                            if (Relay.this.getUpstreamReader() == null) {
                                Relay.this.setUpstreamReader(Thread.currentThread());
                                break;
                            }
                            this.timeout.waitUntilNotified(Relay.this);
                        } else {
                            return -1L;
                        }
                    } else {
                        long bufferPos = Relay.this.getUpstreamPos() - Relay.this.getBuffer().b0();
                        if (this.sourcePos < bufferPos) {
                            i = 2;
                            break;
                        }
                        long bytesToRead = Math.min(byteCount, Relay.this.getUpstreamPos() - this.sourcePos);
                        Relay.this.getBuffer().m(sink, this.sourcePos - bufferPos, bytesToRead);
                        this.sourcePos += bytesToRead;
                        return bytesToRead;
                    }
                }
                int source = i;
                if (source == 2) {
                    long bytesToRead2 = Math.min(byteCount, Relay.this.getUpstreamPos() - this.sourcePos);
                    FileOperator fileOperator = this.fileOperator;
                    jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(fileOperator);
                    fileOperator.read(this.sourcePos + Relay.FILE_HEADER_SIZE, sink, bytesToRead2);
                    this.sourcePos += bytesToRead2;
                    return bytesToRead2;
                }
                try {
                    un upstream = Relay.this.getUpstream();
                    jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(upstream);
                    long upstreamBytesRead = upstream.read(Relay.this.getUpstreamBuffer(), Relay.this.getBufferMaxSize());
                    if (upstreamBytesRead == -1) {
                        Relay relay = Relay.this;
                        relay.commit(relay.getUpstreamPos());
                        synchronized (Relay.this) {
                            Relay.this.setUpstreamReader(null);
                            Object $this$notifyAll$iv = Relay.this;
                            if ($this$notifyAll$iv == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                            }
                            $this$notifyAll$iv.notifyAll();
                            hr hrVar = hr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
                        }
                        return -1L;
                    }
                    long bytesRead = Math.min(upstreamBytesRead, byteCount);
                    try {
                        Relay.this.getUpstreamBuffer().m(sink, 0L, bytesRead);
                        this.sourcePos += bytesRead;
                        FileOperator fileOperator2 = this.fileOperator;
                        jd.xadsadsaadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(fileOperator2);
                        fileOperator2.write(Relay.this.getUpstreamPos() + Relay.FILE_HEADER_SIZE, Relay.this.getUpstreamBuffer().xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(), upstreamBytesRead);
                        synchronized (Relay.this) {
                            try {
                                try {
                                    Relay.this.getBuffer().write(Relay.this.getUpstreamBuffer(), upstreamBytesRead);
                                    if (Relay.this.getBuffer().b0() > Relay.this.getBufferMaxSize()) {
                                        Relay.this.getBuffer().j(Relay.this.getBuffer().b0() - Relay.this.getBufferMaxSize());
                                    }
                                    Relay relay2 = Relay.this;
                                    relay2.setUpstreamPos(relay2.getUpstreamPos() + upstreamBytesRead);
                                    hr hrVar2 = hr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
                                    synchronized (Relay.this) {
                                        Relay.this.setUpstreamReader(null);
                                        Object $this$notifyAll$iv2 = Relay.this;
                                        if ($this$notifyAll$iv2 == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                        }
                                        $this$notifyAll$iv2.notifyAll();
                                    }
                                    return bytesRead;
                                } catch (Throwable th) {
                                    th = th;
                                    thread = null;
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        synchronized (Relay.this) {
                                            Relay.this.setUpstreamReader(thread);
                                            Object $this$notifyAll$iv3 = Relay.this;
                                            if ($this$notifyAll$iv3 == null) {
                                                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                            }
                                            $this$notifyAll$iv3.notifyAll();
                                            hr hrVar3 = hr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                thread = null;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        thread = null;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    thread = null;
                }
            }
        }

        @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un
        public up timeout() {
            return this.timeout;
        }

        @Override // fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.un, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.fileOperator == null) {
                return;
            }
            this.fileOperator = null;
            RandomAccessFile file = null;
            synchronized (Relay.this) {
                Relay relay = Relay.this;
                relay.setSourceCount(relay.getSourceCount() - 1);
                if (Relay.this.getSourceCount() == 0) {
                    file = Relay.this.getFile();
                    Relay.this.setFile(null);
                }
                hr hrVar = hr.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
            }
            if (file != null) {
                Util.closeQuietly(file);
            }
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(t6 $constructor_marker) {
            this();
        }

        public final Relay edit(File file, un upstream, a3 metadata, long bufferMaxSize) throws IOException {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(file, "file");
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(upstream, "upstream");
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(metadata, "metadata");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            Relay result = new Relay(randomAccessFile, upstream, 0L, metadata, bufferMaxSize, null);
            randomAccessFile.setLength(0L);
            result.writeHeader(Relay.PREFIX_DIRTY, -1L, -1L);
            return result;
        }

        public final Relay read(File file) throws IOException {
            jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(file, "file");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            jd.xadsadasadaafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(channel, "randomAccessFile.channel");
            FileOperator fileOperator = new FileOperator(channel);
            s2 header = new s2();
            fileOperator.read(0L, header, Relay.FILE_HEADER_SIZE);
            a3 a3Var = Relay.PREFIX_CLEAN;
            a3 prefix = header.f(a3Var.k());
            if (!jd.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(prefix, a3Var)) {
                throw new IOException("unreadable cache file");
            }
            long upstreamSize = header.v();
            long metadataSize = header.v();
            s2 metadataBuffer = new s2();
            fileOperator.read(upstreamSize + Relay.FILE_HEADER_SIZE, metadataBuffer, metadataSize);
            a3 metadata = metadataBuffer.e();
            return new Relay(randomAccessFile, null, upstreamSize, metadata, 0L, null);
        }
    }

    static {
        a3.xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaVar = a3.xadsdsadaafsaafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;
        PREFIX_CLEAN = xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaVar.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa("OkHttp cache v1\n");
        PREFIX_DIRTY = xadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaVar.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa("OkHttp DIRTY :(\n");
    }
}
