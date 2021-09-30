package io.github.onograph.cluster.raft.module.cuprot.current.gdbi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AllGdbIdsByteToMessageDecoderTest {

  @Test
  void testDecode() throws Exception {
    AllGdbIdsByteToMessageDecoder allGdbIdsByteToMessageDecoder = new AllGdbIdsByteToMessageDecoder();
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    compositeBufferResult.writeLong(0L);
    ArrayList<Object> objectList = new ArrayList<Object>();
    allGdbIdsByteToMessageDecoder.decode(null, compositeBufferResult, objectList);
    assertEquals(8, compositeBufferResult.readerIndex());
    assertEquals(1, objectList.size());
    assertTrue(((AllGdbIds) objectList.get(0)).getSetDiNamedDatabaseId().isEmpty());
    assertEquals(0, ((AllGdbIds) objectList.get(0)).getSz());
  }
}

