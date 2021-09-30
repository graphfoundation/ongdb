package io.github.onograph.cluster.raft.module.cuprot.synctrxr;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType;
import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.jupiter.api.Test;

class TransactionChunkingCompletedMessageToByteEncoderTest {

  @Test
  void testEncode() {
    TransactionChunkingCompletedMessageToByteEncoder transactionChunkingCompletedMessageToByteEncoder =
        new TransactionChunkingCompletedMessageToByteEncoder();
    TransactionChunkingCompleted _rsosTransactionChunkingCompleted = new TransactionChunkingCompleted(
        1L,
        CatchupStatusType.CST_OK_STREAM_COMPLETE);

    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    transactionChunkingCompletedMessageToByteEncoder.encode(null, _rsosTransactionChunkingCompleted,
        compositeBufferResult);
    assertEquals(12, compositeBufferResult.writerIndex());
    assertEquals(Double.SIZE, compositeBufferResult.array().length);
    assertTrue(compositeBufferResult.hasArray());
    assertEquals(Double.SIZE, compositeBufferResult.capacity());
  }
}

