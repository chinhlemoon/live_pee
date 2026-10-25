package okhttp3.internal.cache2;

import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.jd;
import fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd.s2;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes.dex */
public final class FileOperator {
    private final FileChannel fileChannel;

    public FileOperator(FileChannel fileChannel) {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }

    public final void write(long pos, s2 source, long byteCount) throws IOException {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(source, "source");
        if (byteCount < 0 || byteCount > source.b0()) {
            throw new IndexOutOfBoundsException();
        }
        long mutablePos = pos;
        long mutableByteCount = byteCount;
        while (mutableByteCount > 0) {
            long bytesWritten = this.fileChannel.transferFrom(source, mutablePos, mutableByteCount);
            mutablePos += bytesWritten;
            mutableByteCount -= bytesWritten;
        }
    }

    public final void read(long pos, s2 sink, long byteCount) throws IOException {
        jd.xadsdaasadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa(sink, "sink");
        if (byteCount < 0) {
            throw new IndexOutOfBoundsException();
        }
        long mutablePos = pos;
        long mutableByteCount = byteCount;
        while (mutableByteCount > 0) {
            long bytesRead = this.fileChannel.transferTo(mutablePos, mutableByteCount, sink);
            mutablePos += bytesRead;
            mutableByteCount -= bytesRead;
        }
    }
}
