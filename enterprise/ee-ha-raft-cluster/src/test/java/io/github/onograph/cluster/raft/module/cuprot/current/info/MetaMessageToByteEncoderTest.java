package io.github.onograph.cluster.raft.module.cuprot.current.info;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.jupiter.api.Test;

class MetaMessageToByteEncoderTest {

  @Test
  void testEncode() throws Exception {
    MetaMessageToByteEncoder metaMessageToByteEncoder = new MetaMessageToByteEncoder();
    Meta m = Meta.craMeta(1L, " str Fr");
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    metaMessageToByteEncoder.encode(null, m, compositeBufferResult);
    assertEquals(20, compositeBufferResult.writerIndex());
    assertEquals(Double.SIZE, compositeBufferResult.array().length);
    assertTrue(compositeBufferResult.hasArray());
    assertEquals(Double.SIZE, compositeBufferResult.capacity());
  }
}

