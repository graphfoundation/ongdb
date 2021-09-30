package io.github.onograph.cluster.raft.module.cuprot.current.scmeta;

import static org.junit.jupiter.api.Assertions.assertThrows;

import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class CatchupProblemByteToMessageDecoderTest {

  @Test
  void testDecode() {
    CatchupProblemByteToMessageDecoder catchupProblemByteToMessageDecoder = new CatchupProblemByteToMessageDecoder();
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    compositeBufferResult.writeInt(42);
    assertThrows(ArrayIndexOutOfBoundsException.class,
        () -> catchupProblemByteToMessageDecoder.decode(null, compositeBufferResult,
            new ArrayList<Object>()));
  }

  @Test
  void testDecode2() {
    CatchupProblemByteToMessageDecoder catchupProblemByteToMessageDecoder = new CatchupProblemByteToMessageDecoder();
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    compositeBufferResult.writeLong(-1L);
    assertThrows(ArrayIndexOutOfBoundsException.class,
        () -> catchupProblemByteToMessageDecoder.decode(null, compositeBufferResult,
            new ArrayList<Object>()));
  }

  @Test
  void testDecode3() {
    CatchupProblemByteToMessageDecoder catchupProblemByteToMessageDecoder = new CatchupProblemByteToMessageDecoder();
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    compositeBufferResult.writeLong(Long.MAX_VALUE);
    assertThrows(ArrayIndexOutOfBoundsException.class,
        () -> catchupProblemByteToMessageDecoder.decode(null, compositeBufferResult,
            new ArrayList<Object>()));
  }
}

