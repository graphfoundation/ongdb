package io.github.onograph.cluster.raft.akkamsg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import io.netty.buffer.Unpooled;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.neo4j.kernel.impl.transaction.log.InMemoryClosableChannel;

class WritableChecksumChannelImplTest {

  @Test
  void testConstructor() {

    (new WritableChecksumChannelImpl(new InMemoryClosableChannel())).beginChecksum();
  }

  @Test
  void testPut() throws IOException {
    WritableChecksumChannelImpl writableChecksumChannelImpl = new WritableChecksumChannelImpl(
        new InMemoryClosableChannel());
    assertSame(writableChecksumChannelImpl, writableChecksumChannelImpl.put((byte) 'A'));
  }

  @Test
  void testPut2() throws IOException {
    WritableChecksumChannelImpl writableChecksumChannelImpl = new WritableChecksumChannelImpl(
        new InMemoryClosableChannel("AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8"), false, true));
    assertSame(writableChecksumChannelImpl, writableChecksumChannelImpl.put((byte) 'A'));
  }

  @Test
  void testPut3() throws IOException {
    WritableChecksumChannelImpl writableChecksumChannelImpl = new WritableChecksumChannelImpl(
        new InMemoryClosableChannel());
    assertSame(writableChecksumChannelImpl,
        writableChecksumChannelImpl.put("AAAAAAAA".getBytes("UTF-8"), 3));
  }

  @Test
  void testPutChecksum() {
    assertEquals(0, (new WritableChecksumChannelImpl(new InMemoryClosableChannel())).putChecksum());
  }

  @Test
  void testPutDouble() throws IOException {
    WritableChecksumChannelImpl writableChecksumChannelImpl = new WritableChecksumChannelImpl(
        new InMemoryClosableChannel());
    assertSame(writableChecksumChannelImpl, writableChecksumChannelImpl.putDouble(10.0));
  }

  @Test
  void testPutDouble2() throws IOException {
    WritableChecksumChannelImpl writableChecksumChannelImpl = new WritableChecksumChannelImpl(
        new DefaultWritableChecksumChannel(Unpooled.compositeBuffer(3)));
    assertSame(writableChecksumChannelImpl, writableChecksumChannelImpl.putDouble(10.0));
  }

  @Test
  void testPutDouble3() throws IOException {
    WritableChecksumChannelImpl writableChecksumChannelImpl = new WritableChecksumChannelImpl(
        new WritableChecksumChannelImpl(new InMemoryClosableChannel()));
    assertSame(writableChecksumChannelImpl, writableChecksumChannelImpl.putDouble(10.0));
  }

  @Test
  void testPutFloat() throws IOException {
    WritableChecksumChannelImpl writableChecksumChannelImpl = new WritableChecksumChannelImpl(
        new InMemoryClosableChannel());
    assertSame(writableChecksumChannelImpl, writableChecksumChannelImpl.putFloat(10.0f));
  }

  @Test
  void testPutFloat2() throws IOException {
    WritableChecksumChannelImpl writableChecksumChannelImpl = new WritableChecksumChannelImpl(
        new DefaultWritableChecksumChannel(Unpooled.compositeBuffer(3)));
    assertSame(writableChecksumChannelImpl, writableChecksumChannelImpl.putFloat(10.0f));
  }

  @Test
  void testPutFloat3() throws IOException {
    WritableChecksumChannelImpl writableChecksumChannelImpl = new WritableChecksumChannelImpl(
        new WritableChecksumChannelImpl(new InMemoryClosableChannel()));
    assertSame(writableChecksumChannelImpl, writableChecksumChannelImpl.putFloat(10.0f));
  }

  @Test
  void testPutInt() throws IOException {
    WritableChecksumChannelImpl writableChecksumChannelImpl = new WritableChecksumChannelImpl(
        new InMemoryClosableChannel());
    assertSame(writableChecksumChannelImpl, writableChecksumChannelImpl.putInt(42));
  }

  @Test
  void testPutInt2() throws IOException {
    WritableChecksumChannelImpl writableChecksumChannelImpl = new WritableChecksumChannelImpl(
        new DefaultWritableChecksumChannel(Unpooled.compositeBuffer(3)));
    assertSame(writableChecksumChannelImpl, writableChecksumChannelImpl.putInt(42));
  }

  @Test
  void testPutInt3() throws IOException {
    WritableChecksumChannelImpl writableChecksumChannelImpl = new WritableChecksumChannelImpl(
        new WritableChecksumChannelImpl(new InMemoryClosableChannel()));
    assertSame(writableChecksumChannelImpl, writableChecksumChannelImpl.putInt(42));
  }

  @Test
  void testPutLong() throws IOException {
    WritableChecksumChannelImpl writableChecksumChannelImpl = new WritableChecksumChannelImpl(
        new InMemoryClosableChannel());
    assertSame(writableChecksumChannelImpl, writableChecksumChannelImpl.putLong(42L));
  }

  @Test
  void testPutLong2() throws IOException {
    WritableChecksumChannelImpl writableChecksumChannelImpl = new WritableChecksumChannelImpl(
        new DefaultWritableChecksumChannel(Unpooled.compositeBuffer(3)));
    assertSame(writableChecksumChannelImpl, writableChecksumChannelImpl.putLong(42L));
  }

  @Test
  void testPutLong3() throws IOException {
    WritableChecksumChannelImpl writableChecksumChannelImpl = new WritableChecksumChannelImpl(
        new WritableChecksumChannelImpl(new InMemoryClosableChannel()));
    assertSame(writableChecksumChannelImpl, writableChecksumChannelImpl.putLong(42L));
  }

  @Test
  void testPutShort() throws IOException {
    WritableChecksumChannelImpl writableChecksumChannelImpl = new WritableChecksumChannelImpl(
        new InMemoryClosableChannel());
    assertSame(writableChecksumChannelImpl, writableChecksumChannelImpl.putShort((short) 1));
  }

  @Test
  void testPutShort2() throws IOException {
    WritableChecksumChannelImpl writableChecksumChannelImpl = new WritableChecksumChannelImpl(
        new InMemoryClosableChannel("AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8"), false, true));
    assertSame(writableChecksumChannelImpl, writableChecksumChannelImpl.putShort((short) 1));
  }
}

