package io.github.onograph.cluster.raft.akkamsg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.neo4j.kernel.impl.transaction.log.InMemoryClosableChannel;
import org.neo4j.kernel.impl.transaction.log.LogPosition;
import org.neo4j.kernel.impl.transaction.log.LogPositionMarker;

class ReadableClosablePositionAwareChecksumChannelImplTest {

  @Test
  void testConstructor() {

    new ReadableClosablePositionAwareChecksumChannelImpl(
        new ReadablePositionAwareChecksumChannelManager(), 3);
  }

  @Test
  void testBeginChecksum() {

    (new ReadableClosablePositionAwareChecksumChannelImpl(
        new ReadablePositionAwareChecksumChannelManager(), 3))
        .beginChecksum();
  }

  @Test
  void testClose() {

    (new ReadableClosablePositionAwareChecksumChannelImpl(
        new ReadablePositionAwareChecksumChannelManager(), 3))
        .close();
  }

  @Test
  void testEndChecksumAndValidate() {
    assertEquals(0,
        (new ReadableClosablePositionAwareChecksumChannelImpl(
            new ReadablePositionAwareChecksumChannelManager(), 3))
            .endChecksumAndValidate());
  }

  @Test
  void testGet() throws IOException {
    InMemoryClosableChannel inMemoryClosableChannel = new InMemoryClosableChannel();
    inMemoryClosableChannel.put("AAAAAAAA".getBytes("UTF-8"), 3);
    assertEquals('A',
        (new ReadableClosablePositionAwareChecksumChannelImpl(inMemoryClosableChannel, 3)).get());
  }

  @Test
  void testGet2() throws IOException {

    InMemoryClosableChannel inMemoryClosableChannel = new InMemoryClosableChannel();
    inMemoryClosableChannel.put("AAAAAAAA".getBytes("UTF-8"), 3);
    ReadableClosablePositionAwareChecksumChannelImpl readableClosablePositionAwareChecksumChannelImpl =
        new ReadableClosablePositionAwareChecksumChannelImpl(
            inMemoryClosableChannel, 3);
    readableClosablePositionAwareChecksumChannelImpl.get("AAAAAAAA".getBytes("UTF-8"), 3);
  }

  @Test
  void testGetCurrentPosition() {
    LogPosition actualCurrentPosition = (new ReadableClosablePositionAwareChecksumChannelImpl(
        new ReadablePositionAwareChecksumChannelManager(), 3)).getCurrentPosition();
    assertSame(actualCurrentPosition.UNSPECIFIED, actualCurrentPosition);
  }

  @Test
  void testGetCurrentPosition2() {
    ReadableClosablePositionAwareChecksumChannelImpl readableClosablePositionAwareChecksumChannelImpl =
        new ReadableClosablePositionAwareChecksumChannelImpl(
            new ReadablePositionAwareChecksumChannelManager(), 3);
    LogPositionMarker logPositionMarker = new LogPositionMarker();
    LogPositionMarker actualCurrentPosition = readableClosablePositionAwareChecksumChannelImpl
        .getCurrentPosition(logPositionMarker);
    assertSame(logPositionMarker, actualCurrentPosition);
    assertEquals("Mark:UNSPECIFIED", actualCurrentPosition.toString());
  }

  @Test
  void testGetDouble() throws IOException {
    InMemoryClosableChannel inMemoryClosableChannel = new InMemoryClosableChannel();
    inMemoryClosableChannel.putDouble(10.0);
    assertEquals(10.0,
        (new ReadableClosablePositionAwareChecksumChannelImpl(inMemoryClosableChannel,
            8)).getDouble());
  }

  @Test
  void testGetFloat() throws IOException {
    InMemoryClosableChannel inMemoryClosableChannel = new InMemoryClosableChannel();
    inMemoryClosableChannel.putDouble(10.0);
    assertEquals(2.5625f,
        (new ReadableClosablePositionAwareChecksumChannelImpl(inMemoryClosableChannel,
            4)).getFloat());
  }

  @Test
  void testGetInt() throws IOException {
    InMemoryClosableChannel inMemoryClosableChannel = new InMemoryClosableChannel();
    inMemoryClosableChannel.putDouble(10.0);
    assertEquals(1076101120,
        (new ReadableClosablePositionAwareChecksumChannelImpl(inMemoryClosableChannel,
            4)).getInt());
  }

  @Test
  void testGetLong() throws IOException {
    InMemoryClosableChannel inMemoryClosableChannel = new InMemoryClosableChannel();
    inMemoryClosableChannel.putDouble(10.0);
    assertEquals(4621819117588971520L,
        (new ReadableClosablePositionAwareChecksumChannelImpl(inMemoryClosableChannel,
            8)).getLong());
  }

  @Test
  void testGetShort() throws IOException {
    InMemoryClosableChannel inMemoryClosableChannel = new InMemoryClosableChannel();
    inMemoryClosableChannel.put("AAAAAAAA".getBytes("UTF-8"), 3);
    assertEquals((short) 16705,
        (new ReadableClosablePositionAwareChecksumChannelImpl(inMemoryClosableChannel,
            3)).getShort());
  }
}

