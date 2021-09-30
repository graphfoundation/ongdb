package io.github.onograph.cluster.raft.akkamsg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.buffer.Unpooled;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Test;

class DefaultWritableChecksumChannelTest {

  @Test
  void testConstructor() {

    (new DefaultWritableChecksumChannel(Unpooled.compositeBuffer(3))).beginChecksum();
  }

  @Test
  void testByebfByteBuf() {
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    assertSame(compositeBufferResult,
        (new DefaultWritableChecksumChannel(compositeBufferResult)).byebfByteBuf());
  }

  @Test
  void testPut() {
    DefaultWritableChecksumChannel defaultWritableChecksumChannel = new DefaultWritableChecksumChannel(
        Unpooled.compositeBuffer(3));
    assertSame(defaultWritableChecksumChannel, defaultWritableChecksumChannel.put((byte) 'A'));
  }

  @Test
  void testPut2() {
    DefaultWritableChecksumChannel defaultWritableChecksumChannel = new DefaultWritableChecksumChannel(
        new CompositeByteBuf(new PooledByteBufAllocator(), true, 3));
    assertSame(defaultWritableChecksumChannel, defaultWritableChecksumChannel.put((byte) 'A'));
  }

  @Test
  void testPut3() {
    DefaultWritableChecksumChannel defaultWritableChecksumChannel = new DefaultWritableChecksumChannel(
        Unpooled.compositeBuffer(3));
    defaultWritableChecksumChannel.putInt(42);
    assertSame(defaultWritableChecksumChannel, defaultWritableChecksumChannel.put((byte) 'A'));
  }

  @Test
  void testPut4() throws UnsupportedEncodingException {
    DefaultWritableChecksumChannel defaultWritableChecksumChannel = new DefaultWritableChecksumChannel(
        Unpooled.compositeBuffer(3));
    assertSame(defaultWritableChecksumChannel,
        defaultWritableChecksumChannel.put("AAAAAAAA".getBytes("UTF-8"), 3));
  }

  @Test
  void testPut5() throws UnsupportedEncodingException {
    DefaultWritableChecksumChannel defaultWritableChecksumChannel = new DefaultWritableChecksumChannel(
        new CompositeByteBuf(new PooledByteBufAllocator(), true, 3));
    assertSame(defaultWritableChecksumChannel,
        defaultWritableChecksumChannel.put("AAAAAAAA".getBytes("UTF-8"), 3));
  }

  @Test
  void testPut6() throws UnsupportedEncodingException {
    DefaultWritableChecksumChannel defaultWritableChecksumChannel = new DefaultWritableChecksumChannel(
        Unpooled.compositeBuffer(3));
    defaultWritableChecksumChannel.putInt(42);
    assertSame(defaultWritableChecksumChannel,
        defaultWritableChecksumChannel.put("AAAAAAAA".getBytes("UTF-8"), 3));
  }

  @Test
  void testPutChecksum() {
    assertEquals(0,
        (new DefaultWritableChecksumChannel(Unpooled.compositeBuffer(3))).putChecksum());
  }

  @Test
  void testPutDouble() {
    DefaultWritableChecksumChannel defaultWritableChecksumChannel = new DefaultWritableChecksumChannel(
        Unpooled.compositeBuffer(3));
    assertSame(defaultWritableChecksumChannel, defaultWritableChecksumChannel.putDouble(10.0));
  }

  @Test
  void testPutDouble2() {
    DefaultWritableChecksumChannel defaultWritableChecksumChannel = new DefaultWritableChecksumChannel(
        new CompositeByteBuf(new PooledByteBufAllocator(), true, 3));
    assertSame(defaultWritableChecksumChannel, defaultWritableChecksumChannel.putDouble(10.0));
  }

  @Test
  void testPutDouble3() {
    DefaultWritableChecksumChannel defaultWritableChecksumChannel = new DefaultWritableChecksumChannel(
        Unpooled.compositeBuffer(3));
    defaultWritableChecksumChannel.putInt(42);
    assertSame(defaultWritableChecksumChannel, defaultWritableChecksumChannel.putDouble(10.0));
  }

  @Test
  void testPutFloat() {
    DefaultWritableChecksumChannel defaultWritableChecksumChannel = new DefaultWritableChecksumChannel(
        Unpooled.compositeBuffer(3));
    assertSame(defaultWritableChecksumChannel, defaultWritableChecksumChannel.putFloat(10.0f));
  }

  @Test
  void testPutFloat2() {
    DefaultWritableChecksumChannel defaultWritableChecksumChannel = new DefaultWritableChecksumChannel(
        new CompositeByteBuf(new PooledByteBufAllocator(), true, 3));
    assertSame(defaultWritableChecksumChannel, defaultWritableChecksumChannel.putFloat(10.0f));
  }

  @Test
  void testPutFloat3() {
    DefaultWritableChecksumChannel defaultWritableChecksumChannel = new DefaultWritableChecksumChannel(
        Unpooled.compositeBuffer(3));
    defaultWritableChecksumChannel.putInt(42);
    assertSame(defaultWritableChecksumChannel, defaultWritableChecksumChannel.putFloat(10.0f));
  }

  @Test
  void testPutInt() {
    DefaultWritableChecksumChannel defaultWritableChecksumChannel = new DefaultWritableChecksumChannel(
        Unpooled.compositeBuffer(3));
    assertSame(defaultWritableChecksumChannel, defaultWritableChecksumChannel.putInt(42));
  }

  @Test
  void testPutInt2() {
    DefaultWritableChecksumChannel defaultWritableChecksumChannel = new DefaultWritableChecksumChannel(
        new CompositeByteBuf(new PooledByteBufAllocator(), true, 3));
    assertSame(defaultWritableChecksumChannel, defaultWritableChecksumChannel.putInt(42));
  }

  @Test
  void testPutInt3() {
    DefaultWritableChecksumChannel defaultWritableChecksumChannel = new DefaultWritableChecksumChannel(
        Unpooled.compositeBuffer(3));
    defaultWritableChecksumChannel.putInt(42);
    assertSame(defaultWritableChecksumChannel, defaultWritableChecksumChannel.putInt(42));
  }

  @Test
  void testPutLong() {
    DefaultWritableChecksumChannel defaultWritableChecksumChannel = new DefaultWritableChecksumChannel(
        Unpooled.compositeBuffer(3));
    assertSame(defaultWritableChecksumChannel, defaultWritableChecksumChannel.putLong(42L));
  }

  @Test
  void testPutLong2() {
    DefaultWritableChecksumChannel defaultWritableChecksumChannel = new DefaultWritableChecksumChannel(
        new CompositeByteBuf(new PooledByteBufAllocator(), true, 3));
    assertSame(defaultWritableChecksumChannel, defaultWritableChecksumChannel.putLong(42L));
  }

  @Test
  void testPutLong3() {
    DefaultWritableChecksumChannel defaultWritableChecksumChannel = new DefaultWritableChecksumChannel(
        Unpooled.compositeBuffer(3));
    defaultWritableChecksumChannel.putInt(42);
    assertSame(defaultWritableChecksumChannel, defaultWritableChecksumChannel.putLong(42L));
  }

  @Test
  void testPutShort() {
    DefaultWritableChecksumChannel defaultWritableChecksumChannel = new DefaultWritableChecksumChannel(
        Unpooled.compositeBuffer(3));
    assertSame(defaultWritableChecksumChannel, defaultWritableChecksumChannel.putShort((short) 1));
  }

  @Test
  void testPutShort2() {
    DefaultWritableChecksumChannel defaultWritableChecksumChannel = new DefaultWritableChecksumChannel(
        new CompositeByteBuf(new PooledByteBufAllocator(), true, 3));
    assertSame(defaultWritableChecksumChannel, defaultWritableChecksumChannel.putShort((short) 1));
  }

  @Test
  void testPutShort3() {
    DefaultWritableChecksumChannel defaultWritableChecksumChannel = new DefaultWritableChecksumChannel(
        Unpooled.compositeBuffer(3));
    defaultWritableChecksumChannel.putInt(42);
    assertSame(defaultWritableChecksumChannel, defaultWritableChecksumChannel.putShort((short) 1));
  }
}

