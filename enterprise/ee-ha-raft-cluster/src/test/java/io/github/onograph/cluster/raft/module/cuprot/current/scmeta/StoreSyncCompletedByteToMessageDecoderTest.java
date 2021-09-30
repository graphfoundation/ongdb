package io.github.onograph.cluster.raft.module.cuprot.current.scmeta;

import static org.junit.jupiter.api.Assertions.assertThrows;

import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class StoreSyncCompletedByteToMessageDecoderTest {

  @Test
  void testDecode() {
    StoreSyncCompletedByteToMessageDecoder storeSyncCompletedByteToMessageDecoder = new StoreSyncCompletedByteToMessageDecoder();
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    compositeBufferResult.writeLongLE(42L);
    compositeBufferResult.writeInt(42);
    assertThrows(ArrayIndexOutOfBoundsException.class,
        () -> storeSyncCompletedByteToMessageDecoder.decode(null, compositeBufferResult,
            new ArrayList<Object>()));
  }
}

