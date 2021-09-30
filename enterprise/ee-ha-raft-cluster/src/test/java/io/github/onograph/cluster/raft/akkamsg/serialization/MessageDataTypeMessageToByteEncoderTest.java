package io.github.onograph.cluster.raft.akkamsg.serialization;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.buffer.Unpooled;
import org.junit.jupiter.api.Test;

class MessageDataTypeMessageToByteEncoderTest {

  @Test
  void testEncode() {
    MessageDataTypeMessageToByteEncoder messageDataTypeMessageToByteEncoder = new MessageDataTypeMessageToByteEncoder();
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    messageDataTypeMessageToByteEncoder.encode(null, MessageDataType.CT, compositeBufferResult);
    assertEquals(1, compositeBufferResult.writerIndex());
    assertEquals(Double.SIZE, compositeBufferResult.array().length);
    assertTrue(compositeBufferResult.hasArray());
    assertEquals(Double.SIZE, compositeBufferResult.capacity());
  }

  @Test
  void testEncode2() {
    MessageDataTypeMessageToByteEncoder messageDataTypeMessageToByteEncoder = new MessageDataTypeMessageToByteEncoder();
    CompositeByteBuf compositeByteBuf = new CompositeByteBuf(new PooledByteBufAllocator(), true, 3);

    messageDataTypeMessageToByteEncoder.encode(null, MessageDataType.CT, compositeByteBuf);
    assertEquals(1, compositeByteBuf.writerIndex());
    assertEquals(Double.SIZE, compositeByteBuf.capacity());
    assertTrue(compositeByteBuf.hasMemoryAddress());
    assertEquals(1, compositeByteBuf.refCnt());
        /*
        assertEquals( "PooledByteBufAllocatorMetric(usedHeapMemory: 0; usedDirectMemory: 16777216; numHeapArenas: 24;"
                      + " numDirectArenas: 24; smallCacheSize: 256; normalCacheSize: 64; numThreadLocalCaches: 1; chunkSize:"
                      + " 16777216)", ((PooledByteBufAllocator) compositeByteBuf.alloc()).metric().toString() );*/
  }

  @Test
  void testEncode3() {
    MessageDataTypeMessageToByteEncoder messageDataTypeMessageToByteEncoder = new MessageDataTypeMessageToByteEncoder();
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    compositeBufferResult.writeInt(42);
    messageDataTypeMessageToByteEncoder.encode(null, MessageDataType.CT, compositeBufferResult);
    assertEquals(5, compositeBufferResult.writerIndex());
    assertFalse(compositeBufferResult.readBoolean());
  }
}

