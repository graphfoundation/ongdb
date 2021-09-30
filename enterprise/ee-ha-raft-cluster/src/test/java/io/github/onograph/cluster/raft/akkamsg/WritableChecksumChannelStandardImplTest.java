package io.github.onograph.cluster.raft.akkamsg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.buffer.Unpooled;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Test;

class WritableChecksumChannelStandardImplTest {

  @Test
  void testConstructor() {

    (new WritableChecksumChannelStandardImpl(Unpooled.compositeBuffer(3))).beginChecksum();
  }

  @Test
  void testConstructor2() {

    new WritableChecksumChannelStandardImpl(Unpooled.compositeBuffer(3));
  }

  @Test
  void testConstructor3() {

    new WritableChecksumChannelStandardImpl(Unpooled.compositeBuffer(3), 1L);
  }

  @Test
  void testByebfByteBuf() {
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    assertSame(compositeBufferResult,
        (new WritableChecksumChannelStandardImpl(compositeBufferResult)).byebfByteBuf());
  }

  @Test
  void testPut() throws MessageSizeException {
    WritableChecksumChannelStandardImpl writableChecksumChannelStandardImpl = new WritableChecksumChannelStandardImpl(
        Unpooled.compositeBuffer(3));
    assertSame(writableChecksumChannelStandardImpl,
        writableChecksumChannelStandardImpl.put((byte) 'A'));
  }

  @Test
  void testPut2() throws MessageSizeException {
    WritableChecksumChannelStandardImpl writableChecksumChannelStandardImpl = new WritableChecksumChannelStandardImpl(
        new CompositeByteBuf(new PooledByteBufAllocator(), true, 3));
    assertSame(writableChecksumChannelStandardImpl,
        writableChecksumChannelStandardImpl.put((byte) 'A'));
  }

  @Test
  void testPut3() throws MessageSizeException {
    WritableChecksumChannelStandardImpl writableChecksumChannelStandardImpl = new WritableChecksumChannelStandardImpl(
        Unpooled.compositeBuffer(3));
    writableChecksumChannelStandardImpl.putInt(42);
    assertSame(writableChecksumChannelStandardImpl,
        writableChecksumChannelStandardImpl.put((byte) 'A'));
  }

  @Test
  void testPut4() throws UnsupportedEncodingException, MessageSizeException {
    WritableChecksumChannelStandardImpl writableChecksumChannelStandardImpl = new WritableChecksumChannelStandardImpl(
        Unpooled.compositeBuffer(3));
    assertSame(writableChecksumChannelStandardImpl,
        writableChecksumChannelStandardImpl.put("AAAAAAAA".getBytes("UTF-8"), 3));
  }

  @Test
  void testPut5() throws UnsupportedEncodingException, MessageSizeException {
    WritableChecksumChannelStandardImpl writableChecksumChannelStandardImpl = new WritableChecksumChannelStandardImpl(
        new CompositeByteBuf(new PooledByteBufAllocator(), true, 3));
    assertSame(writableChecksumChannelStandardImpl,
        writableChecksumChannelStandardImpl.put("AAAAAAAA".getBytes("UTF-8"), 3));
  }

  @Test
  void testPut6() throws UnsupportedEncodingException, MessageSizeException {
    WritableChecksumChannelStandardImpl writableChecksumChannelStandardImpl = new WritableChecksumChannelStandardImpl(
        Unpooled.compositeBuffer(3), 1L);
    assertThrows(MessageSizeException.class,
        () -> writableChecksumChannelStandardImpl.put("AAAAAAAA".getBytes("UTF-8"), 3));
  }

  @Test
  void testPut7() throws UnsupportedEncodingException, MessageSizeException {
    WritableChecksumChannelStandardImpl writableChecksumChannelStandardImpl = new WritableChecksumChannelStandardImpl(
        Unpooled.compositeBuffer(3));
    writableChecksumChannelStandardImpl.putInt(42);
    assertSame(writableChecksumChannelStandardImpl,
        writableChecksumChannelStandardImpl.put("AAAAAAAA".getBytes("UTF-8"), 3));
  }

  @Test
  void testPutChecksum() {
    assertEquals(0,
        (new WritableChecksumChannelStandardImpl(Unpooled.compositeBuffer(3))).putChecksum());
  }

  @Test
  void testPutDouble() throws MessageSizeException {
    WritableChecksumChannelStandardImpl writableChecksumChannelStandardImpl = new WritableChecksumChannelStandardImpl(
        Unpooled.compositeBuffer(3));
    assertSame(writableChecksumChannelStandardImpl,
        writableChecksumChannelStandardImpl.putDouble(10.0));
  }

  @Test
  void testPutDouble2() throws MessageSizeException {
    WritableChecksumChannelStandardImpl writableChecksumChannelStandardImpl = new WritableChecksumChannelStandardImpl(
        new CompositeByteBuf(new PooledByteBufAllocator(), true, 3));
    assertSame(writableChecksumChannelStandardImpl,
        writableChecksumChannelStandardImpl.putDouble(10.0));
  }

  @Test
  void testPutDouble3() throws MessageSizeException {
    assertThrows(MessageSizeException.class,
        () -> (new WritableChecksumChannelStandardImpl(Unpooled.compositeBuffer(3), 1L)).putDouble(
            10.0));
  }

  @Test
  void testPutDouble4() throws MessageSizeException {
    WritableChecksumChannelStandardImpl writableChecksumChannelStandardImpl = new WritableChecksumChannelStandardImpl(
        Unpooled.compositeBuffer(3));
    writableChecksumChannelStandardImpl.putInt(42);
    assertSame(writableChecksumChannelStandardImpl,
        writableChecksumChannelStandardImpl.putDouble(10.0));
  }

  @Test
  void testPutFloat() throws MessageSizeException {
    WritableChecksumChannelStandardImpl writableChecksumChannelStandardImpl = new WritableChecksumChannelStandardImpl(
        Unpooled.compositeBuffer(3));
    assertSame(writableChecksumChannelStandardImpl,
        writableChecksumChannelStandardImpl.putFloat(10.0f));
  }

  @Test
  void testPutFloat2() throws MessageSizeException {
    WritableChecksumChannelStandardImpl writableChecksumChannelStandardImpl = new WritableChecksumChannelStandardImpl(
        new CompositeByteBuf(new PooledByteBufAllocator(), true, 3));
    assertSame(writableChecksumChannelStandardImpl,
        writableChecksumChannelStandardImpl.putFloat(10.0f));
  }

  @Test
  void testPutFloat3() throws MessageSizeException {
    assertThrows(MessageSizeException.class,
        () -> (new WritableChecksumChannelStandardImpl(Unpooled.compositeBuffer(3), 1L)).putFloat(
            10.0f));
  }

  @Test
  void testPutFloat4() throws MessageSizeException {
    WritableChecksumChannelStandardImpl writableChecksumChannelStandardImpl = new WritableChecksumChannelStandardImpl(
        Unpooled.compositeBuffer(3));
    writableChecksumChannelStandardImpl.putInt(42);
    assertSame(writableChecksumChannelStandardImpl,
        writableChecksumChannelStandardImpl.putFloat(10.0f));
  }

  @Test
  void testPutInt() throws MessageSizeException {
    WritableChecksumChannelStandardImpl writableChecksumChannelStandardImpl = new WritableChecksumChannelStandardImpl(
        Unpooled.compositeBuffer(3));
    assertSame(writableChecksumChannelStandardImpl, writableChecksumChannelStandardImpl.putInt(42));
  }

  @Test
  void testPutInt2() throws MessageSizeException {
    WritableChecksumChannelStandardImpl writableChecksumChannelStandardImpl = new WritableChecksumChannelStandardImpl(
        new CompositeByteBuf(new PooledByteBufAllocator(), true, 3));
    assertSame(writableChecksumChannelStandardImpl, writableChecksumChannelStandardImpl.putInt(42));
  }

  @Test
  void testPutInt3() throws MessageSizeException {
    assertThrows(MessageSizeException.class,
        () -> (new WritableChecksumChannelStandardImpl(Unpooled.compositeBuffer(3), 1L)).putInt(
            42));
  }

  @Test
  void testPutInt4() throws MessageSizeException {
    WritableChecksumChannelStandardImpl writableChecksumChannelStandardImpl = new WritableChecksumChannelStandardImpl(
        Unpooled.compositeBuffer(3));
    writableChecksumChannelStandardImpl.putInt(42);
    assertSame(writableChecksumChannelStandardImpl, writableChecksumChannelStandardImpl.putInt(42));
  }

  @Test
  void testPutLong() throws MessageSizeException {
    WritableChecksumChannelStandardImpl writableChecksumChannelStandardImpl = new WritableChecksumChannelStandardImpl(
        Unpooled.compositeBuffer(3));
    assertSame(writableChecksumChannelStandardImpl,
        writableChecksumChannelStandardImpl.putLong(42L));
  }

  @Test
  void testPutLong2() throws MessageSizeException {
    WritableChecksumChannelStandardImpl writableChecksumChannelStandardImpl = new WritableChecksumChannelStandardImpl(
        new CompositeByteBuf(new PooledByteBufAllocator(), true, 3));
    assertSame(writableChecksumChannelStandardImpl,
        writableChecksumChannelStandardImpl.putLong(42L));
  }

  @Test
  void testPutLong3() throws MessageSizeException {
    assertThrows(MessageSizeException.class,
        () -> (new WritableChecksumChannelStandardImpl(Unpooled.compositeBuffer(3), 1L)).putLong(
            42L));
  }

  @Test
  void testPutLong4() throws MessageSizeException {
    WritableChecksumChannelStandardImpl writableChecksumChannelStandardImpl = new WritableChecksumChannelStandardImpl(
        Unpooled.compositeBuffer(3));
    writableChecksumChannelStandardImpl.putInt(42);
    assertSame(writableChecksumChannelStandardImpl,
        writableChecksumChannelStandardImpl.putLong(42L));
  }

  @Test
  void testPutShort() throws MessageSizeException {
    WritableChecksumChannelStandardImpl writableChecksumChannelStandardImpl = new WritableChecksumChannelStandardImpl(
        Unpooled.compositeBuffer(3));
    assertSame(writableChecksumChannelStandardImpl,
        writableChecksumChannelStandardImpl.putShort((short) 1));
  }

  @Test
  void testPutShort2() throws MessageSizeException {
    WritableChecksumChannelStandardImpl writableChecksumChannelStandardImpl = new WritableChecksumChannelStandardImpl(
        new CompositeByteBuf(new PooledByteBufAllocator(), true, 3));
    assertSame(writableChecksumChannelStandardImpl,
        writableChecksumChannelStandardImpl.putShort((short) 1));
  }

  @Test
  void testPutShort3() throws MessageSizeException {
    assertThrows(MessageSizeException.class,
        () -> (new WritableChecksumChannelStandardImpl(Unpooled.compositeBuffer(3), 1L)).putShort(
            (short) 1));
  }

  @Test
  void testPutShort4() throws MessageSizeException {
    WritableChecksumChannelStandardImpl writableChecksumChannelStandardImpl = new WritableChecksumChannelStandardImpl(
        Unpooled.compositeBuffer(3));
    writableChecksumChannelStandardImpl.putInt(42);
    assertSame(writableChecksumChannelStandardImpl,
        writableChecksumChannelStandardImpl.putShort((short) 1));
  }
}

