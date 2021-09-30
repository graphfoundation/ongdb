package io.github.onograph.cluster.raft.module.cuprot.current.scmeta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.jupiter.api.Test;

class StoreIdMessageToByteEncoderTest {

  @Test
  void testEncode() throws Exception {
    StoreIdMessageToByteEncoder storeIdMessageToByteEncoder = new StoreIdMessageToByteEncoder();
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    storeIdMessageToByteEncoder.encode(null, null, compositeBufferResult);
    assertEquals(1, compositeBufferResult.writerIndex());
    assertEquals(Double.SIZE, compositeBufferResult.array().length);
    assertTrue(compositeBufferResult.hasArray());
    assertEquals(Double.SIZE, compositeBufferResult.capacity());
  }

  @Test
  void testEncode2() throws Exception {
    StoreIdMessageToByteEncoder storeIdMessageToByteEncoder = new StoreIdMessageToByteEncoder();
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    compositeBufferResult.writeInt(42);
    storeIdMessageToByteEncoder.encode(null, null, compositeBufferResult);
    assertEquals(5, compositeBufferResult.writerIndex());
    assertFalse(compositeBufferResult.readBoolean());
  }
}

