package io.github.onograph.cluster.raft.akkamsg.serialization;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel;
import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.buffer.Unpooled;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.neo4j.kernel.impl.transaction.log.InMemoryClosableChannel;

class BasicStringSerializationHandlerTest {

  @Test
  void testMaslForBySt() {
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    BasicStringSerializationHandler.maslForBySt(compositeBufferResult, " str Srn");
    assertEquals(12, compositeBufferResult.writerIndex());
    assertEquals(Double.SIZE, compositeBufferResult.array().length);
    assertTrue(compositeBufferResult.hasArray());
    assertEquals(Double.SIZE, compositeBufferResult.capacity());
  }

  @Test
  void testMaslForBySt2() {
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    BasicStringSerializationHandler.maslForBySt(compositeBufferResult, (String) null);
    assertEquals(4, compositeBufferResult.writerIndex());
    assertEquals(Double.SIZE, compositeBufferResult.array().length);
    assertTrue(compositeBufferResult.hasArray());
    assertEquals(Double.SIZE, compositeBufferResult.capacity());
  }

  @Test
  void testMaslForBySt3() {
    CompositeByteBuf compositeByteBuf = new CompositeByteBuf(new PooledByteBufAllocator(), true, 3);

    BasicStringSerializationHandler.maslForBySt(compositeByteBuf, " str Srn");
    assertEquals(12, compositeByteBuf.writerIndex());
    assertEquals(Double.SIZE, compositeByteBuf.capacity());
    assertTrue(compositeByteBuf.hasMemoryAddress());
    assertEquals(1, compositeByteBuf.refCnt());
        /*assertEquals( "PooledByteBufAllocatorMetric(usedHeapMemory: 0; usedDirectMemory: 16777216; numHeapArenas: 24;"
                      + " numDirectArenas: 24; smallCacheSize: 256; normalCacheSize: 64; numThreadLocalCaches: 1; chunkSize:"
                      + " 16777216)", ((PooledByteBufAllocator) compositeByteBuf.alloc()).metric().toString() );*/
  }

  @Test
  void testMaslForBySt4() {
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    compositeBufferResult.writeInt(42);
    BasicStringSerializationHandler.maslForBySt(compositeBufferResult, " str Srn");
    assertEquals(Short.SIZE, compositeBufferResult.writerIndex());
  }

  @Test
  void testMaslForBySt5() throws IOException {

    BasicStringSerializationHandler.maslForBySt(" str Srn", new InMemoryClosableChannel());
  }

  @Test
  void testMaslForBySt6() throws IOException {

    BasicStringSerializationHandler.maslForBySt("42",
        new DefaultWritableChecksumChannel(Unpooled.compositeBuffer(3)));
  }

  @Test
  void testUnahString() {
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    compositeBufferResult.writeInt(-1);
    assertNull(BasicStringSerializationHandler.unahString(compositeBufferResult));
    assertEquals(4, compositeBufferResult.readerIndex());
  }

  @Test
  void testUnahString2() {
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    compositeBufferResult.writeInt(Integer.MIN_VALUE);
    assertThrows(NegativeArraySizeException.class,
        () -> BasicStringSerializationHandler.unahString(compositeBufferResult));
  }

  @Test
  void testUnahString3() throws IOException {
    InMemoryClosableChannel inMemoryClosableChannel = new InMemoryClosableChannel();
    inMemoryClosableChannel.putLong(0L);
    assertEquals("", BasicStringSerializationHandler.unahString(inMemoryClosableChannel));
  }

  @Test
  void testUnahString4() throws IOException {
    InMemoryClosableChannel inMemoryClosableChannel = new InMemoryClosableChannel();
    inMemoryClosableChannel.putLong(-1L);
    assertNull(BasicStringSerializationHandler.unahString(inMemoryClosableChannel));
  }
}

