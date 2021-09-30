package io.github.onograph.cluster.raft.module.cuprot.current.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AuthMetaMessageToByteEncoderTest {

  @Test
  void testEncode() throws Exception {
    AuthMetaMessageToByteEncoder authMetaMessageToByteEncoder = new AuthMetaMessageToByteEncoder();
    AuthMeta m = new AuthMeta(new ArrayList<String>());
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    authMetaMessageToByteEncoder.encode(null, m, compositeBufferResult);
    assertEquals(8, compositeBufferResult.writerIndex());
    assertEquals(Double.SIZE, compositeBufferResult.array().length);
    assertTrue(compositeBufferResult.hasArray());
    assertFalse(compositeBufferResult.readBoolean());
    assertEquals(Double.SIZE, compositeBufferResult.capacity());
  }

  @Test
  void testEncode2() throws Exception {
    AuthMetaMessageToByteEncoder authMetaMessageToByteEncoder = new AuthMetaMessageToByteEncoder();

    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    stringList.add("foo");
    AuthMeta m = new AuthMeta(stringList);
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    authMetaMessageToByteEncoder.encode(null, m, compositeBufferResult);
    assertEquals(22, compositeBufferResult.writerIndex());
    assertEquals(Double.SIZE, compositeBufferResult.array().length);
    assertTrue(compositeBufferResult.hasArray());
    assertEquals(Double.SIZE, compositeBufferResult.capacity());
  }
}

