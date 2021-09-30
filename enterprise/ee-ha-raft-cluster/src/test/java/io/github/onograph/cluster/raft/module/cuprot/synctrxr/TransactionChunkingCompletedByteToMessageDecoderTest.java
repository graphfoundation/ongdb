package io.github.onograph.cluster.raft.module.cuprot.synctrxr;

import static org.junit.jupiter.api.Assertions.assertThrows;

import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class TransactionChunkingCompletedByteToMessageDecoderTest {

  @Test
  void testDecode() {
    TransactionChunkingCompletedByteToMessageDecoder transactionChunkingCompletedByteToMessageDecoder =
        new TransactionChunkingCompletedByteToMessageDecoder();
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    compositeBufferResult.writeLongLE(42L);
    compositeBufferResult.writeInt(42);
    assertThrows(ArrayIndexOutOfBoundsException.class,
        () -> transactionChunkingCompletedByteToMessageDecoder
            .decode(null, compositeBufferResult, new ArrayList<Object>()));
  }
}

