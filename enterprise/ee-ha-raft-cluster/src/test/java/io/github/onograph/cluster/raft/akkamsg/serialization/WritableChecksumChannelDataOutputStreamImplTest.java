package io.github.onograph.cluster.raft.akkamsg.serialization;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.junit.jupiter.api.Test;

class WritableChecksumChannelDataOutputStreamImplTest {

  @Test
  void testConstructor() {

    new WritableChecksumChannelDataOutputStreamImpl(new ByteArrayOutputStream(3));
  }

  @Test
  void testBeginChecksum() {
    assertThrows(UnsupportedOperationException.class,
        () -> (new WritableChecksumChannelDataOutputStreamImpl(
            new ByteArrayOutputStream(3))).beginChecksum());
  }

  @Test
  void testPut() throws IOException {
    WritableChecksumChannelDataOutputStreamImpl writableChecksumChannelDataOutputStreamImpl = new WritableChecksumChannelDataOutputStreamImpl(
        new ByteArrayOutputStream(3));
    assertSame(writableChecksumChannelDataOutputStreamImpl,
        writableChecksumChannelDataOutputStreamImpl.put((byte) 'A'));
  }

  @Test
  void testPut2() throws IOException {
    WritableChecksumChannelDataOutputStreamImpl writableChecksumChannelDataOutputStreamImpl = new WritableChecksumChannelDataOutputStreamImpl(
        new ByteArrayOutputStream(3));
    assertSame(writableChecksumChannelDataOutputStreamImpl,
        writableChecksumChannelDataOutputStreamImpl.put("AAAAAAAA".getBytes("UTF-8"), 3));
  }

  @Test
  void testPutChecksum() {
    assertThrows(UnsupportedOperationException.class,
        () -> (new WritableChecksumChannelDataOutputStreamImpl(
            new ByteArrayOutputStream(3))).putChecksum());
  }

  @Test
  void testPutDouble() throws IOException {
    WritableChecksumChannelDataOutputStreamImpl writableChecksumChannelDataOutputStreamImpl = new WritableChecksumChannelDataOutputStreamImpl(
        new ByteArrayOutputStream(3));
    assertSame(writableChecksumChannelDataOutputStreamImpl,
        writableChecksumChannelDataOutputStreamImpl.putDouble(10.0));
  }

  @Test
  void testPutFloat() throws IOException {
    WritableChecksumChannelDataOutputStreamImpl writableChecksumChannelDataOutputStreamImpl = new WritableChecksumChannelDataOutputStreamImpl(
        new ByteArrayOutputStream(3));
    assertSame(writableChecksumChannelDataOutputStreamImpl,
        writableChecksumChannelDataOutputStreamImpl.putFloat(10.0f));
  }

  @Test
  void testPutInt() throws IOException {
    WritableChecksumChannelDataOutputStreamImpl writableChecksumChannelDataOutputStreamImpl = new WritableChecksumChannelDataOutputStreamImpl(
        new ByteArrayOutputStream(3));
    assertSame(writableChecksumChannelDataOutputStreamImpl,
        writableChecksumChannelDataOutputStreamImpl.putInt(42));
  }

  @Test
  void testPutLong() throws IOException {
    WritableChecksumChannelDataOutputStreamImpl writableChecksumChannelDataOutputStreamImpl = new WritableChecksumChannelDataOutputStreamImpl(
        new ByteArrayOutputStream(3));
    assertSame(writableChecksumChannelDataOutputStreamImpl,
        writableChecksumChannelDataOutputStreamImpl.putLong(42L));
  }

  @Test
  void testPutShort() throws IOException {
    WritableChecksumChannelDataOutputStreamImpl writableChecksumChannelDataOutputStreamImpl = new WritableChecksumChannelDataOutputStreamImpl(
        new ByteArrayOutputStream(3));
    assertSame(writableChecksumChannelDataOutputStreamImpl,
        writableChecksumChannelDataOutputStreamImpl.putShort((short) 1));
  }
}

