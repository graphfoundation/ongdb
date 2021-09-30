package io.github.onograph.cluster.raft.akkamsg.serialization;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.junit.jupiter.api.Test;

class ReadableChannelDataInputStreamImplTest {

  @Test
  void testClose() throws IOException {

    (new ReadableChannelDataInputStreamImpl(
        new ByteArrayInputStream("AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8"))))
        .close();
  }

  @Test
  void testClose2() throws IOException {

    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(
        "AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8"));
    byteArrayInputStream.transferTo(new ByteArrayOutputStream(3));
    (new ReadableChannelDataInputStreamImpl(byteArrayInputStream)).close();
  }

  @Test
  void testGet() throws IOException {
    assertEquals('A',
        (new ReadableChannelDataInputStreamImpl(
            new ByteArrayInputStream("AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8"))))
            .get());
  }

  @Test
  void testGet2() throws IOException {

    ReadableChannelDataInputStreamImpl readableChannelDataInputStreamImpl = new ReadableChannelDataInputStreamImpl(
        new ByteArrayInputStream("AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8")));
    readableChannelDataInputStreamImpl.get("AAAAAAAA".getBytes("UTF-8"), 3);
  }

  @Test
  void testGet3() throws IOException {

    (new ReadableChannelDataInputStreamImpl(
        new ByteArrayInputStream("AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8"))))
        .get(new byte[]{0, 'A', 'A', 'A', 'A', 'A', 'A', 'A'}, 3);
  }

  @Test
  void testGetDouble() throws IOException {
    assertEquals(2261634.5098039214,
        (new ReadableChannelDataInputStreamImpl(
            new ByteArrayInputStream("AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8"))))
            .getDouble());
  }

  @Test
  void testGetFloat() throws IOException {
    assertEquals(12.078431f,
        (new ReadableChannelDataInputStreamImpl(
            new ByteArrayInputStream("AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8"))))
            .getFloat());
  }

  @Test
  void testGetInt() throws IOException {
    assertEquals(1094795585,
        (new ReadableChannelDataInputStreamImpl(
            new ByteArrayInputStream("AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8"))))
            .getInt());
  }

  @Test
  void testGetLong() throws IOException {
    assertEquals(4702111234474983745L,
        (new ReadableChannelDataInputStreamImpl(
            new ByteArrayInputStream("AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8"))))
            .getLong());
  }

  @Test
  void testGetShort() throws IOException {
    assertEquals((short) 16705,
        (new ReadableChannelDataInputStreamImpl(
            new ByteArrayInputStream("AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8"))))
            .getShort());
  }
}

