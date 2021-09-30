package io.github.onograph.cluster.raft.module.cuprot.current.gdbi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.buffer.Unpooled;
import org.junit.jupiter.api.Test;

class RequestAllGdbIdsMessageToByteEncoderTest {

  @Test
  void testEncode() throws Exception {
    RequestAllGdbIdsMessageToByteEncoder requestAllGdbIdsMessageToByteEncoder = new RequestAllGdbIdsMessageToByteEncoder();
    RequestAllGdbIds m = new RequestAllGdbIds();
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    requestAllGdbIdsMessageToByteEncoder.encode(null, m, compositeBufferResult);
    assertEquals(1, compositeBufferResult.writerIndex());
    assertEquals(Double.SIZE, compositeBufferResult.array().length);
    assertTrue(compositeBufferResult.hasArray());
    assertEquals(Double.SIZE, compositeBufferResult.capacity());
  }

  @Test
  void testEncode2() throws Exception {
    RequestAllGdbIdsMessageToByteEncoder requestAllGdbIdsMessageToByteEncoder = new RequestAllGdbIdsMessageToByteEncoder();
    RequestAllGdbIds m = new RequestAllGdbIds();
    CompositeByteBuf compositeByteBuf = new CompositeByteBuf(new PooledByteBufAllocator(), true, 3);

    requestAllGdbIdsMessageToByteEncoder.encode(null, m, compositeByteBuf);
    assertEquals(1, compositeByteBuf.writerIndex());
    assertEquals(Double.SIZE, compositeByteBuf.capacity());
    assertTrue(compositeByteBuf.hasMemoryAddress());
    assertEquals(1, compositeByteBuf.refCnt());
    //assertEquals( "PooledByteBufAllocatorMetric(usedHeapMemory: 0; usedDirectMemory: 16777216; numHeapArenas: 24;" + " numDirectArenas: 24; smallCacheSize: 256; normalCacheSize: 64; numThreadLocalCaches: 1; chunkSize:" + " 16777216)", ((PooledByteBufAllocator) compositeByteBuf.alloc()).metric().toString() );
  }
}

