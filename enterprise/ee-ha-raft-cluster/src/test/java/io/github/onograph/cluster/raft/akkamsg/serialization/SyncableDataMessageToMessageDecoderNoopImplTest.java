package io.github.onograph.cluster.raft.akkamsg.serialization;

import static org.junit.jupiter.api.Assertions.assertTrue;

import io.github.onograph.cluster.raft.akkamsg.DefaultReadableChecksumChannel;
import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;
import java.io.IOException;
import org.junit.jupiter.api.Test;

class SyncableDataMessageToMessageDecoderNoopImplTest {

  @Test
  void testCoseForDe() throws IOException {

    SyncableDataMessageToMessageDecoderNoopImpl syncableDataMessageToMessageDecoderNoopImpl = new SyncableDataMessageToMessageDecoderNoopImpl();
    syncableDataMessageToMessageDecoderNoopImpl
        .coseForDe(new DefaultReadableChecksumChannel(Unpooled.compositeBuffer(3)));
  }

  @Test
  void testCoseForDe2() throws IOException {

    SyncableDataMessageToMessageDecoderNoopImpl syncableDataMessageToMessageDecoderNoopImpl = new SyncableDataMessageToMessageDecoderNoopImpl();
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    compositeBufferResult.writeInt(42);
    compositeBufferResult.readRetainedSlice(3);
    syncableDataMessageToMessageDecoderNoopImpl.coseForDe(
        new DefaultReadableChecksumChannel(compositeBufferResult));
  }

  @Test
  void testCracttDataManagerFactory() {
    assertTrue(
        (new SyncableDataMessageToMessageDecoderNoopImpl()).cracttDataManagerFactory().getIsCi());
  }
}

