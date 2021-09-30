package io.github.onograph.cluster.raft.akkamsg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.neo4j.kernel.impl.transaction.log.InMemoryClosableChannel;
import org.neo4j.kernel.impl.transaction.log.LogPositionMarker;

class ReadableClosablePositionAwareChecksumChannelPassThruImplTest {

  @Test
  void testConstructor() {

    ReadableClosablePositionAwareChecksumChannelPassThruImpl actualReadableClosablePositionAwareChecksumChannelPassThruImpl =
        new ReadableClosablePositionAwareChecksumChannelPassThruImpl(
            new ReadablePositionAwareChecksumChannelManager());
    actualReadableClosablePositionAwareChecksumChannelPassThruImpl.beginChecksum();
    actualReadableClosablePositionAwareChecksumChannelPassThruImpl.close();
  }

  @Test
  void testEndChecksumAndValidate() {
    assertEquals(0, (new ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        new ReadablePositionAwareChecksumChannelManager())).endChecksumAndValidate());
  }

  @Test
  void testGet() throws IOException {
    InMemoryClosableChannel inMemoryClosableChannel = new InMemoryClosableChannel();
    inMemoryClosableChannel.put("AAAAAAAA".getBytes("UTF-8"), 3);
    assertEquals('A', (new ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        inMemoryClosableChannel)).get());
  }

  @Test
  void testGet2() throws IOException {

    InMemoryClosableChannel inMemoryClosableChannel = new InMemoryClosableChannel();
    inMemoryClosableChannel.put("AAAAAAAA".getBytes("UTF-8"), 3);
    ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl =
        new ReadableClosablePositionAwareChecksumChannelPassThruImpl(
            inMemoryClosableChannel);
    readableClosablePositionAwareChecksumChannelPassThruImpl.get("AAAAAAAA".getBytes("UTF-8"), 3);
  }

  @Test
  void testGetCurrentPosition() {
    ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl =
        new ReadableClosablePositionAwareChecksumChannelPassThruImpl(
            new ReadablePositionAwareChecksumChannelManager());
    LogPositionMarker logPositionMarker = new LogPositionMarker();
    LogPositionMarker actualCurrentPosition = readableClosablePositionAwareChecksumChannelPassThruImpl
        .getCurrentPosition(logPositionMarker);
    assertSame(logPositionMarker, actualCurrentPosition);
    assertEquals("Mark:UNSPECIFIED", actualCurrentPosition.toString());
  }

  @Test
  void testGetDouble() throws IOException {
    InMemoryClosableChannel inMemoryClosableChannel = new InMemoryClosableChannel();
    inMemoryClosableChannel.putDouble(10.0);
    assertEquals(10.0,
        (new ReadableClosablePositionAwareChecksumChannelPassThruImpl(
            inMemoryClosableChannel)).getDouble());
  }

  @Test
  void testGetFloat() throws IOException {
    InMemoryClosableChannel inMemoryClosableChannel = new InMemoryClosableChannel();
    inMemoryClosableChannel.putDouble(10.0);
    assertEquals(2.5625f,
        (new ReadableClosablePositionAwareChecksumChannelPassThruImpl(
            inMemoryClosableChannel)).getFloat());
  }

  @Test
  void testGetInt() throws IOException {
    InMemoryClosableChannel inMemoryClosableChannel = new InMemoryClosableChannel();
    inMemoryClosableChannel.putDouble(10.0);
    assertEquals(1076101120,
        (new ReadableClosablePositionAwareChecksumChannelPassThruImpl(
            inMemoryClosableChannel)).getInt());
  }

  @Test
  void testGetLong() throws IOException {
    InMemoryClosableChannel inMemoryClosableChannel = new InMemoryClosableChannel();
    inMemoryClosableChannel.putDouble(10.0);
    assertEquals(4621819117588971520L,
        (new ReadableClosablePositionAwareChecksumChannelPassThruImpl(
            inMemoryClosableChannel)).getLong());
  }

  @Test
  void testGetShort() throws IOException {
    InMemoryClosableChannel inMemoryClosableChannel = new InMemoryClosableChannel();
    inMemoryClosableChannel.put("AAAAAAAA".getBytes("UTF-8"), 3);
    assertEquals((short) 16705,
        (new ReadableClosablePositionAwareChecksumChannelPassThruImpl(
            inMemoryClosableChannel)).getShort());
  }
}

