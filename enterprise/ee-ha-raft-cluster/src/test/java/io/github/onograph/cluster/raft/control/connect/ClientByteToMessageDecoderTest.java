package io.github.onograph.cluster.raft.control.connect;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class ClientByteToMessageDecoderTest {

  @Test
  void testDecode() throws ClientException {
    ClientByteToMessageDecoder clientByteToMessageDecoder = new ClientByteToMessageDecoder();
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    compositeBufferResult.writeInt(42);
    clientByteToMessageDecoder.decode(null, compositeBufferResult, new ArrayList<Object>());
    assertEquals(4, compositeBufferResult.readerIndex());
  }
}

