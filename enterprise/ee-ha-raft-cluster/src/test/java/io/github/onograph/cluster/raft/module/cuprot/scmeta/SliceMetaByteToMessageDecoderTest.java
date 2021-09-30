package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class SliceMetaByteToMessageDecoderTest {

  @Test
  void testDecode() {
    SliceMetaByteToMessageDecoder sliceMetaByteToMessageDecoder = new SliceMetaByteToMessageDecoder();
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    compositeBufferResult.writeLong(42L);
    ArrayList<Object> objectList = new ArrayList<Object>();
    sliceMetaByteToMessageDecoder.decode(null, compositeBufferResult, objectList);
    assertEquals(8, compositeBufferResult.readerIndex());
    assertEquals(1, objectList.size());
    assertEquals(42, ((SliceMeta) objectList.get(0)).getIAr());
    assertEquals("", ((SliceMeta) objectList.get(0)).getStrNf());
  }

  @Test
  void testDecode2() {
    SliceMetaByteToMessageDecoder sliceMetaByteToMessageDecoder = new SliceMetaByteToMessageDecoder();
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    compositeBufferResult.writeInt(-1);
    assertThrows(NegativeArraySizeException.class,
        () -> sliceMetaByteToMessageDecoder.decode(null, compositeBufferResult,
            new ArrayList<Object>()));
  }
}

