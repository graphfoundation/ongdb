package io.github.onograph.cluster.raft.module.cuprot.current.ident;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class GdbIdByteToMessageDecoderTest {

  @Test
  void testDecode() throws Exception {
    GdbIdByteToMessageDecoder gdbIdByteToMessageDecoder = new GdbIdByteToMessageDecoder();
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    compositeBufferResult.writeLongLE(42L);
    compositeBufferResult.writeLong(42L);
    ArrayList<Object> objectList = new ArrayList<Object>();
    gdbIdByteToMessageDecoder.decode(null, compositeBufferResult, objectList);
    assertEquals(Short.SIZE, compositeBufferResult.readerIndex());
    assertEquals(1, objectList.size());
    assertEquals("DatabaseId{2a000000}", ((GdbId) objectList.get(0)).getRDatabaseId().toString());
  }
}

