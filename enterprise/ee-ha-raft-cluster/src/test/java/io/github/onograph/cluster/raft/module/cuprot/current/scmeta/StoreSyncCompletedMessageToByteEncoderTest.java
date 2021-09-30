package io.github.onograph.cluster.raft.module.cuprot.current.scmeta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted;
import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.jupiter.api.Test;

class StoreSyncCompletedMessageToByteEncoderTest {

  @Test
  void testEncode() {
    StoreSyncCompletedMessageToByteEncoder storeSyncCompletedMessageToByteEncoder = new StoreSyncCompletedMessageToByteEncoder();
    StoreSyncCompleted m = new StoreSyncCompleted(1L,
        StoreSyncCompleted.SetupGdbSyncReplyStateType.OK);

    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    storeSyncCompletedMessageToByteEncoder.encode(null, m, compositeBufferResult);
    assertEquals(12, compositeBufferResult.writerIndex());
    assertEquals(Double.SIZE, compositeBufferResult.array().length);
    assertTrue(compositeBufferResult.hasArray());
    assertEquals(Double.SIZE, compositeBufferResult.capacity());
  }
}

