package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class SliceByteToMessageDecoderTest {

  @Test
  void testDecode() {
    SliceByteToMessageDecoder sliceByteToMessageDecoder = new SliceByteToMessageDecoder();
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    compositeBufferResult.writeLong(42L);
    ArrayList<Object> objectList = new ArrayList<Object>();
    sliceByteToMessageDecoder.decode(null, compositeBufferResult, objectList);
    assertEquals(2, compositeBufferResult.refCnt());
    assertEquals(8, compositeBufferResult.readerIndex());
    assertEquals(1, objectList.size());
    assertFalse(((Slice) objectList.get(0)).getIsIl());
    assertFalse(((Slice) objectList.get(0)).getPyodByteBuf().isContiguous());
  }

  @Test
  void testDecode2() {
    SliceByteToMessageDecoder sliceByteToMessageDecoder = new SliceByteToMessageDecoder();
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    compositeBufferResult.writeInt(1);
    ArrayList<Object> objectList = new ArrayList<Object>();
    sliceByteToMessageDecoder.decode(null, compositeBufferResult, objectList);
    assertEquals(2, compositeBufferResult.refCnt());
    assertEquals(4, compositeBufferResult.readerIndex());
    assertEquals(1, objectList.size());
    assertTrue(((Slice) objectList.get(0)).getIsIl());
    assertFalse(((Slice) objectList.get(0)).getPyodByteBuf().isContiguous());
  }
}

