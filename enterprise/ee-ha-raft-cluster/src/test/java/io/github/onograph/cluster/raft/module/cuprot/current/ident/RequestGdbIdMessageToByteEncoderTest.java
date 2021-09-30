package io.github.onograph.cluster.raft.module.cuprot.current.ident;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.jupiter.api.Test;

class RequestGdbIdMessageToByteEncoderTest {

  @Test
  void testEncode() throws Exception {
    RequestGdbIdMessageToByteEncoder requestGdbIdMessageToByteEncoder = new RequestGdbIdMessageToByteEncoder();
    RequestGdbId m = new RequestGdbId("Gdb Name");
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    requestGdbIdMessageToByteEncoder.encode(null, m, compositeBufferResult);
    assertEquals(12, compositeBufferResult.writerIndex());
    assertEquals(Double.SIZE, compositeBufferResult.array().length);
    assertTrue(compositeBufferResult.hasArray());
    assertEquals(Double.SIZE, compositeBufferResult.capacity());
  }
}

