package io.github.onograph.cluster.raft.control;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.buffer.ReadOnlyByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.jupiter.api.Test;

class SanityCheckingUtilitiesTest {

  @Test
  void testIsCrmavaForSt() {
    assertFalse(SanityCheckingUtilities.isCrmavaForSt("Val"));
    assertFalse(SanityCheckingUtilities.isCrmavaForSt("foo"));
    assertTrue(SanityCheckingUtilities.isCrmavaForSt("NEO4J_CLUSTER"));
  }

  @Test
  void testMaivaebfByteBuf() {

    SanityCheckingUtilities.maivaebfByteBuf();
  }

  @Test
  void testRedmgvuString() {
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    compositeBufferResult.writeInt(42);
    assertEquals("\u0000\u0000\u0000*\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000",
        SanityCheckingUtilities.redmgvuString(compositeBufferResult));
    assertEquals(13, compositeBufferResult.readerIndex());
  }

  @Test
  void testRedmgvuString2() {
    PooledByteBufAllocator alloc = new PooledByteBufAllocator();
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    CompositeByteBuf compositeBufferResult1 = Unpooled.compositeBuffer(3);

    CompositeByteBuf compositeByteBuf = new CompositeByteBuf(alloc, true, 3, compositeBufferResult,
        compositeBufferResult1, Unpooled.compositeBuffer(3));
    compositeByteBuf.writeInt(42);
    assertEquals("\u0000\u0000\u0000*\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000",
        SanityCheckingUtilities.redmgvuString(compositeByteBuf));
    assertEquals(13, compositeByteBuf.readerIndex());
  }

  @Test
  void testRedmgvuString3() {
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    compositeBufferResult.writeInt(42);
    ReadOnlyByteBuf readOnlyByteBuf = new ReadOnlyByteBuf(compositeBufferResult);
    assertEquals("\u0000\u0000\u0000*\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000",
        SanityCheckingUtilities.redmgvuString(readOnlyByteBuf));
    assertEquals(13, readOnlyByteBuf.readerIndex());
  }
}

