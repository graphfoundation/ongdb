package io.github.onograph.cluster.raft.control.connect;

import static org.junit.jupiter.api.Assertions.assertThrows;

import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class ServerByteToMessageDecoderTest {

  @Test
  void testDecode() {
    ServerByteToMessageDecoder serverByteToMessageDecoder = new ServerByteToMessageDecoder();
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    compositeBufferResult.writeInt(42);
    assertThrows(IllegalStateException.class,
        () -> serverByteToMessageDecoder.decode(null, compositeBufferResult,
            new ArrayList<Object>()));
  }
}

