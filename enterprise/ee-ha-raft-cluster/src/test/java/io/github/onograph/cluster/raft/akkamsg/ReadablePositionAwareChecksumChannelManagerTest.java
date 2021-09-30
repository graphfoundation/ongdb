package io.github.onograph.cluster.raft.akkamsg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.neo4j.kernel.impl.transaction.log.LogPositionMarker;

class ReadablePositionAwareChecksumChannelManagerTest {

  @Test
  void testClose() throws IOException {
    assertThrows(IllegalArgumentException.class,
        () -> (new ReadablePositionAwareChecksumChannelManager()).close());
  }

  @Test
  void testDeettoForRe() {

    ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager = new ReadablePositionAwareChecksumChannelManager();
    readablePositionAwareChecksumChannelManager.deettoForRe(
        new ReadablePositionAwareChecksumChannelManager());
  }

  @Test
  void testEndChecksumAndValidate() throws IOException {
    assertEquals(0, (new ReadablePositionAwareChecksumChannelManager()).endChecksumAndValidate());
  }

  @Test
  void testGet() throws IOException {
    assertThrows(IllegalArgumentException.class,
        () -> (new ReadablePositionAwareChecksumChannelManager()).get());
  }

  @Test
  void testGet2() throws IOException {
    ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager = new ReadablePositionAwareChecksumChannelManager();
    assertThrows(IllegalArgumentException.class,
        () -> readablePositionAwareChecksumChannelManager.get("AAAAAAAA".getBytes("UTF-8"), 3));
  }

  @Test
  void testGetCurrentPosition() throws IOException {
    assertThrows(IllegalArgumentException.class,
        () -> (new ReadablePositionAwareChecksumChannelManager()).getCurrentPosition());
  }

  @Test
  void testGetCurrentPosition2() throws IOException {
    ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager = new ReadablePositionAwareChecksumChannelManager();
    assertThrows(IllegalArgumentException.class,
        () -> readablePositionAwareChecksumChannelManager.getCurrentPosition(
            new LogPositionMarker()));
  }

  @Test
  void testGetDouble() throws IOException {
    assertThrows(IllegalArgumentException.class,
        () -> (new ReadablePositionAwareChecksumChannelManager()).getDouble());
  }

  @Test
  void testGetFloat() throws IOException {
    assertThrows(IllegalArgumentException.class,
        () -> (new ReadablePositionAwareChecksumChannelManager()).getFloat());
  }

  @Test
  void testGetInt() throws IOException {
    assertThrows(IllegalArgumentException.class,
        () -> (new ReadablePositionAwareChecksumChannelManager()).getInt());
  }

  @Test
  void testGetLong() throws IOException {
    assertThrows(IllegalArgumentException.class,
        () -> (new ReadablePositionAwareChecksumChannelManager()).getLong());
  }

  @Test
  void testGetShort() throws IOException {
    assertThrows(IllegalArgumentException.class,
        () -> (new ReadablePositionAwareChecksumChannelManager()).getShort());
  }

  @Test
  void testConstructor() {

    (new ReadablePositionAwareChecksumChannelManager()).beginChecksum();
  }
}

