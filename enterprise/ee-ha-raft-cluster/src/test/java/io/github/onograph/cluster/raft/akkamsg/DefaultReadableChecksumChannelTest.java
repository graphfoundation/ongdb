package io.github.onograph.cluster.raft.akkamsg;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.neo4j.kernel.impl.transaction.log.LogPositionMarker;

class DefaultReadableChecksumChannelTest {

  @Test
  void testConstructor() {
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    DefaultReadableChecksumChannel actualDefaultReadableChecksumChannel = new DefaultReadableChecksumChannel(
        compositeBufferResult);
    actualDefaultReadableChecksumChannel.beginChecksum();
    actualDefaultReadableChecksumChannel.close();
    ByteBufAllocator allocResult = compositeBufferResult.alloc();
    assertTrue(allocResult instanceof io.netty.buffer.UnpooledByteBufAllocator);
    assertEquals(0, compositeBufferResult.writerIndex());
    byte[] arrayResult = compositeBufferResult.array();
    assertEquals(0, arrayResult.length);
    assertArrayEquals(new byte[]{}, arrayResult);
    assertTrue(compositeBufferResult.hasArray());
    assertFalse(compositeBufferResult.isReadOnly());
    assertEquals("CompositeByteBuf(ridx: 0, widx: 0, cap: 0, components=0)",
        compositeBufferResult.toString());
    assertEquals(1, compositeBufferResult.refCnt());
    assertEquals(0, compositeBufferResult.readerIndex());
    assertEquals(3, compositeBufferResult.maxNumComponents());
    assertEquals(Integer.MAX_VALUE, compositeBufferResult.maxCapacity());
    assertFalse(compositeBufferResult.isWritable());
    assertFalse(compositeBufferResult.isReadable());
    assertTrue(compositeBufferResult.hasMemoryAddress());
    assertFalse(compositeBufferResult.isDirect());
    assertFalse(compositeBufferResult.isContiguous());
    assertEquals(0, compositeBufferResult.capacity());
    assertFalse(allocResult.isDirectBufferPooled());
    assertEquals("UnpooledByteBufAllocator(directByDefault: true)", allocResult.toString());
  }

  @Test
  void testConstructor2() {
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    new DefaultReadableChecksumChannel(compositeBufferResult);
    assertTrue(compositeBufferResult.alloc() instanceof io.netty.buffer.UnpooledByteBufAllocator);
    assertEquals(0, compositeBufferResult.writerIndex());
    assertNull(compositeBufferResult.unwrap());
    byte[] arrayResult = compositeBufferResult.array();
    assertEquals(0, arrayResult.length);
    assertArrayEquals(new byte[]{}, arrayResult);
    assertTrue(compositeBufferResult.hasArray());
    assertFalse(compositeBufferResult.isReadOnly());
    assertEquals("CompositeByteBuf(ridx: 0, widx: 0, cap: 0, components=0)",
        compositeBufferResult.toString());
    assertEquals(1, compositeBufferResult.refCnt());
    assertEquals(0, compositeBufferResult.readerIndex());
    assertEquals(3, compositeBufferResult.maxNumComponents());
    assertEquals(Integer.MAX_VALUE, compositeBufferResult.maxCapacity());
    assertFalse(compositeBufferResult.isWritable());
    assertFalse(compositeBufferResult.isReadable());
    assertTrue(compositeBufferResult.hasMemoryAddress());
    assertFalse(compositeBufferResult.isDirect());
    assertFalse(compositeBufferResult.isContiguous());
    assertEquals(0, compositeBufferResult.capacity());
  }

  @Test
  void testAvibbe() {
    assertEquals(0, (new DefaultReadableChecksumChannel(Unpooled.compositeBuffer(3))).avibbe());
  }

  @Test
  void testEndChecksumAndValidate() {
    assertEquals(0,
        (new DefaultReadableChecksumChannel(Unpooled.compositeBuffer(3))).endChecksumAndValidate());
  }

  @Test
  void testGet() throws IOException {
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    compositeBufferResult.writeInt(42);
    assertEquals((byte) 0, (new DefaultReadableChecksumChannel(compositeBufferResult)).get());
  }

  @Test
  void testGet2() throws IOException {

    DefaultReadableChecksumChannel defaultReadableChecksumChannel = new DefaultReadableChecksumChannel(
        Unpooled.compositeBuffer(3));
    defaultReadableChecksumChannel.get("AAAAAAAA".getBytes("UTF-8"), 0);
  }

  @Test
  void testGet3() throws IOException {

    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    compositeBufferResult.writeInt(42);
    DefaultReadableChecksumChannel defaultReadableChecksumChannel = new DefaultReadableChecksumChannel(
        compositeBufferResult);
    defaultReadableChecksumChannel.get("AAAAAAAA".getBytes("UTF-8"), 3);
  }

  @Test
  void testGetCurrentPosition() {
    DefaultReadableChecksumChannel defaultReadableChecksumChannel = new DefaultReadableChecksumChannel(
        Unpooled.compositeBuffer(3));
    LogPositionMarker logPositionMarker = new LogPositionMarker();
    LogPositionMarker actualCurrentPosition = defaultReadableChecksumChannel.getCurrentPosition(
        logPositionMarker);
    assertSame(logPositionMarker, actualCurrentPosition);
    assertEquals("Mark:UNSPECIFIED", actualCurrentPosition.toString());
  }

  @Test
  void testGetDouble() throws IOException {
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    compositeBufferResult.writeLong(42L);
    assertEquals(2.08E-322,
        (new DefaultReadableChecksumChannel(compositeBufferResult)).getDouble());
  }

  @Test
  void testGetFloat() throws IOException {
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    compositeBufferResult.writeInt(42);
    assertEquals(5.9E-44f, (new DefaultReadableChecksumChannel(compositeBufferResult)).getFloat());
  }

  @Test
  void testGetInt() throws IOException {
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    compositeBufferResult.writeInt(42);
    assertEquals(42, (new DefaultReadableChecksumChannel(compositeBufferResult)).getInt());
  }

  @Test
  void testGetLong() throws IOException {
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    compositeBufferResult.writeLong(42L);
    assertEquals(42L, (new DefaultReadableChecksumChannel(compositeBufferResult)).getLong());
  }

  @Test
  void testGetShort() throws IOException {
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    compositeBufferResult.writeInt(42);
    assertEquals((short) 0, (new DefaultReadableChecksumChannel(compositeBufferResult)).getShort());
  }

  @Test
  void testRedbt() {
    assertEquals(0, (new DefaultReadableChecksumChannel(Unpooled.compositeBuffer(3))).redbt());
  }

  @Test
  void testSerdbt() {
    assertThrows(IllegalStateException.class,
        () -> (new DefaultReadableChecksumChannel(Unpooled.compositeBuffer(3))).serdbt(1));
    assertThrows(IllegalArgumentException.class,
        () -> (new DefaultReadableChecksumChannel(Unpooled.compositeBuffer(3))).serdbt(-1));
  }

  @Test
  void testSerdbt2() {

    (new DefaultReadableChecksumChannel(Unpooled.compositeBuffer(3))).serdbt(0);
  }
}

