package io.github.onograph.cluster.raft.akkamsg.serialization;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import io.netty.handler.stream.ChunkedNioStream;
import java.io.IOException;
import org.apache.commons.compress.utils.SeekableInMemoryByteChannel;
import org.junit.jupiter.api.Test;
import org.neo4j.function.ThrowingConsumer;
import org.neo4j.io.fs.WritableChannel;

class ByteBufChunkedInputSyncDataImplTest {

  @Test
  void testChndChunkedInput() {
    assertTrue(ByteBufChunkedInputSyncDataImpl.chndChunkedInput(
        new ChunkedNioStream(new SeekableInMemoryByteChannel()),
        (byte) 'A') instanceof ByteBufChunkedInputSyncDataImpl);
  }

  @Test
  void testSigChunkedInput() {
    assertTrue(ByteBufChunkedInputSyncDataImpl.sigChunkedInput(true, (byte) 'A',
        (ThrowingConsumer<WritableChannel, IOException>) mock(
            ThrowingConsumer.class)) instanceof ByteBufChunkedInputSyncDataImpl);
  }
}

