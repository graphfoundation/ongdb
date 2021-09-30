package io.github.onograph.cluster.raft.akkamsg.serialization;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.buffer.Unpooled;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Test;

class ChunkedInputEncodingServiceTest {

  @Test
  void testConstructor() throws UnsupportedEncodingException {
    byte[] bytes = "AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8");
    ChunkedInputEncodingService actualChunkedInputEncodingService = new ChunkedInputEncodingService(
        bytes, true);

    assertFalse(actualChunkedInputEncodingService.isEndOfInput());
    assertEquals(24L, actualChunkedInputEncodingService.length());
    assertEquals(24, bytes.length);
  }

  @Test
  void testConstructor2() throws UnsupportedEncodingException {
    assertEquals(24L,
        (new ChunkedInputEncodingService("AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8"), 1,
            true)).length());
  }

  @Test
  void testConstructor3() throws UnsupportedEncodingException {
    assertEquals(24L,
        (new ChunkedInputEncodingService("AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8"), 493,
            true)).length());
  }

  @Test
  void testConstructor4() throws UnsupportedEncodingException {
    assertEquals(24L, (new ChunkedInputEncodingService("AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8"),
        true)).length());
  }

  @Test
  void testIsEndOfInput() throws UnsupportedEncodingException {
    assertFalse((new ChunkedInputEncodingService("AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8"),
        true)).isEndOfInput());
    assertFalse((new ChunkedInputEncodingService(new byte[]{}, true)).isEndOfInput());
  }

  @Test
  void testLength() throws UnsupportedEncodingException {
    assertEquals(24L, (new ChunkedInputEncodingService("AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8"),
        true)).length());
  }

  @Test
  void testProgress() throws UnsupportedEncodingException {
    assertEquals(0L, (new ChunkedInputEncodingService("AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8"),
        true)).progress());
  }

  @Test
  void testReadChunk() throws UnsupportedEncodingException {
    ChunkedInputEncodingService chunkedInputEncodingService = new ChunkedInputEncodingService(
        "AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8"), true);
    PooledByteBufAllocator pooledByteBufAllocator = new PooledByteBufAllocator();
    chunkedInputEncodingService.readChunk(pooledByteBufAllocator);
    //assertEquals( "PooledByteBufAllocatorMetric(usedHeapMemory: 16777216; usedDirectMemory: 0; numHeapArenas: 24;" + " numDirectArenas: 24; smallCacheSize: 256; normalCacheSize: 64; numThreadLocalCaches: 1; chunkSize:" + " 16777216)", pooledByteBufAllocator.metric().toString() );
    assertTrue(chunkedInputEncodingService.isEndOfInput());
  }

  @Test
  void testReadChunk2() throws UnsupportedEncodingException {
    ChunkedInputEncodingService chunkedInputEncodingService = new ChunkedInputEncodingService(
        "AAAAAAAAAAAAAAAAﾀAAAAAAA".getBytes("UTF-8"), true);
    PooledByteBufAllocator pooledByteBufAllocator = new PooledByteBufAllocator();
    chunkedInputEncodingService.readChunk(pooledByteBufAllocator);
    // assertEquals( "PooledByteBufAllocatorMetric(usedHeapMemory: 16777216; usedDirectMemory: 0; numHeapArenas: 24;"+ " numDirectArenas: 24; smallCacheSize: 256; normalCacheSize: 64; numThreadLocalCaches: 1; chunkSize:"+ " 16777216)", pooledByteBufAllocator.metric().toString() );
    assertTrue(chunkedInputEncodingService.isEndOfInput());
  }

  @Test
  void testReadChunk3() {
    ChunkedInputEncodingService chunkedInputEncodingService = new ChunkedInputEncodingService(
        new byte[]{}, true);
    assertNull(chunkedInputEncodingService.readChunk(new PooledByteBufAllocator()));
    assertTrue(chunkedInputEncodingService.isEndOfInput());
  }

  @Test
  void testReadChunk4() throws UnsupportedEncodingException {
    ChunkedInputEncodingService chunkedInputEncodingService = new ChunkedInputEncodingService(
        "AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8"), false);
    PooledByteBufAllocator pooledByteBufAllocator = new PooledByteBufAllocator();
    chunkedInputEncodingService.readChunk(pooledByteBufAllocator);
    //assertEquals( "PooledByteBufAllocatorMetric(usedHeapMemory: 16777216; usedDirectMemory: 0; numHeapArenas: 24;" + " numDirectArenas: 24; smallCacheSize: 256; normalCacheSize: 64; numThreadLocalCaches: 1; chunkSize:" + " 16777216)", pooledByteBufAllocator.metric().toString() );
    assertTrue(chunkedInputEncodingService.isEndOfInput());
  }

  @Test
  void testReadChunk5() throws UnsupportedEncodingException {
    ChunkedInputEncodingService chunkedInputEncodingService = new ChunkedInputEncodingService(
        "AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8"), 1, true);
    PooledByteBufAllocator pooledByteBufAllocator = new PooledByteBufAllocator();
    chunkedInputEncodingService.readChunk(pooledByteBufAllocator);
    //assertEquals( "PooledByteBufAllocatorMetric(usedHeapMemory: 16777216; usedDirectMemory: 0; numHeapArenas: 24;" + " numDirectArenas: 24; smallCacheSize: 256; normalCacheSize: 64; numThreadLocalCaches: 1; chunkSize:" + " 16777216)", pooledByteBufAllocator.metric().toString() );
    assertFalse(chunkedInputEncodingService.isEndOfInput());
  }

  @Test
  void testSeraepoForBy() throws UnsupportedEncodingException {
    ChunkedInputEncodingService chunkedInputEncodingService = new ChunkedInputEncodingService(
        "AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8"), false);
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    chunkedInputEncodingService.seraepoForBy(compositeBufferResult, 1);
    assertEquals(0, compositeBufferResult.writerIndex());
    assertTrue(compositeBufferResult.hasArray());
    assertEquals(0, compositeBufferResult.readerIndex());
    assertEquals(Integer.MAX_VALUE, compositeBufferResult.maxCapacity());
    assertFalse(chunkedInputEncodingService.isEndOfInput());
  }
}

