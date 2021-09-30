package io.github.onograph.cluster.raft.module.cuprot.current.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AuthMetaByteToMessageDecoderTest {

  @Test
  void testDecode() throws Exception {
    AuthMetaByteToMessageDecoder authMetaByteToMessageDecoder = new AuthMetaByteToMessageDecoder();
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    compositeBufferResult.writeLong(0L);
    ArrayList<Object> objectList = new ArrayList<Object>();
    authMetaByteToMessageDecoder.decode(null, compositeBufferResult, objectList);
    assertEquals(8, compositeBufferResult.readerIndex());
    assertEquals(1, objectList.size());
    assertTrue(((AuthMeta) objectList.get(0)).getListCmadString().isEmpty());
  }
}

