package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.neo4j.kernel.impl.transaction.log.InMemoryClosableChannel;

class SetupGdbStoreSyncReplyTest {

  @Test
  void testEroSetupGdbStoreSyncReply() {
    assertThrows(IllegalStateException.class,
        () -> SetupGdbStoreSyncReply.eroSetupGdbStoreSyncReply(
            SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.OK));
  }

  @Test
  void testEroSetupGdbStoreSyncReply2() {
    SetupGdbStoreSyncReply actualEroSetupGdbStoreSyncReplyResult = SetupGdbStoreSyncReply
        .eroSetupGdbStoreSyncReply(
            SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.SYNC_SGUID_NOT_MATCHING_ERR);
    assertEquals(0L, actualEroSetupGdbStoreSyncReplyResult.getLgItpcl());
    assertEquals(SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.SYNC_SGUID_NOT_MATCHING_ERR,
        actualEroSetupGdbStoreSyncReplyResult.getStat());
    assertEquals(0, actualEroSetupGdbStoreSyncReplyResult.getPtsPathArray().length);
  }

  @Test
  void testSetupGdbStoreSyncReplyMessageToByteEncoderEncode() throws Exception {
    SetupGdbStoreSyncReply.SetupGdbStoreSyncReplyMessageToByteEncoder setupGdbStoreSyncReplyMessageToByteEncoder =
        new SetupGdbStoreSyncReply.SetupGdbStoreSyncReplyMessageToByteEncoder();
    SetupGdbStoreSyncReply _rcspSetupGdbStoreSyncReply = SetupGdbStoreSyncReply
        .eroSetupGdbStoreSyncReply(
            SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.SYNC_SGUID_NOT_MATCHING_ERR);
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    setupGdbStoreSyncReplyMessageToByteEncoder.encode(null, _rcspSetupGdbStoreSyncReply,
        compositeBufferResult);
    assertEquals(Short.SIZE, compositeBufferResult.writerIndex());
    assertEquals(Double.SIZE, compositeBufferResult.array().length);
    assertTrue(compositeBufferResult.hasArray());
    assertEquals(Double.SIZE, compositeBufferResult.capacity());
  }

  @Test
  void testSetupGdbStoreSyncReplySafeChannelMarshalMarshal() throws IOException {

    SetupGdbStoreSyncReply.SetupGdbStoreSyncReplySafeChannelMarshal setupGdbStoreSyncReplySafeChannelMarshal =
        new SetupGdbStoreSyncReply.SetupGdbStoreSyncReplySafeChannelMarshal();
    SetupGdbStoreSyncReply _rcspSetupGdbStoreSyncReply = SetupGdbStoreSyncReply
        .eroSetupGdbStoreSyncReply(
            SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.SYNC_SGUID_NOT_MATCHING_ERR);
    setupGdbStoreSyncReplySafeChannelMarshal.marshal(_rcspSetupGdbStoreSyncReply,
        new InMemoryClosableChannel());
  }

  @Test
  void testSetupGdbStoreSyncReplySafeChannelMarshalMarshal2() throws IOException {

    SetupGdbStoreSyncReply.SetupGdbStoreSyncReplySafeChannelMarshal setupGdbStoreSyncReplySafeChannelMarshal =
        new SetupGdbStoreSyncReply.SetupGdbStoreSyncReplySafeChannelMarshal();
    SetupGdbStoreSyncReply _rcspSetupGdbStoreSyncReply = SetupGdbStoreSyncReply.sucsSetupGdbStoreSyncReply(
        1L,
        new Path[]{Paths.get(
            System.getProperty("java.io.tmpdir"),
            "test.txt"),
            Paths.get(System.getProperty(
                    "java.io.tmpdir"),
                "test.txt"),
            Paths.get(System.getProperty(
                    "java.io.tmpdir"),
                "test.txt")});
    setupGdbStoreSyncReplySafeChannelMarshal.marshal(_rcspSetupGdbStoreSyncReply,
        new InMemoryClosableChannel());
  }

  @Test
  void testSetupGdbStoreSyncReplySafeChannelMarshalUnmarshal0() throws IOException {
    SetupGdbStoreSyncReply.SetupGdbStoreSyncReplySafeChannelMarshal setupGdbStoreSyncReplySafeChannelMarshal =
        new SetupGdbStoreSyncReply.SetupGdbStoreSyncReplySafeChannelMarshal();

    InMemoryClosableChannel inMemoryClosableChannel = new InMemoryClosableChannel();
    inMemoryClosableChannel.putDouble(10.0);
    assertThrows(ArrayIndexOutOfBoundsException.class,
        () -> setupGdbStoreSyncReplySafeChannelMarshal.unmarshal0(inMemoryClosableChannel));
  }

  @Test
  void testSetupGdbStoreSyncReplySafeChannelMarshalUnmarshal02() throws IOException {
    SetupGdbStoreSyncReply.SetupGdbStoreSyncReplySafeChannelMarshal setupGdbStoreSyncReplySafeChannelMarshal =
        new SetupGdbStoreSyncReply.SetupGdbStoreSyncReplySafeChannelMarshal();

    InMemoryClosableChannel inMemoryClosableChannel = new InMemoryClosableChannel();
    inMemoryClosableChannel.putLong(0L);
    inMemoryClosableChannel.putLong(0L);
    SetupGdbStoreSyncReply actualUnmarshal0Result = setupGdbStoreSyncReplySafeChannelMarshal
        .unmarshal0(inMemoryClosableChannel);
    assertEquals(0L, actualUnmarshal0Result.getLgItpcl());
    assertEquals(SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.OK,
        actualUnmarshal0Result.getStat());
    assertEquals(0, actualUnmarshal0Result.getPtsPathArray().length);
  }

  @Test
  void testSucsSetupGdbStoreSyncReply() {
    SetupGdbStoreSyncReply actualSucsSetupGdbStoreSyncReplyResult = SetupGdbStoreSyncReply
        .sucsSetupGdbStoreSyncReply(1L,
            new Path[]{Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")});
    assertEquals(1L, actualSucsSetupGdbStoreSyncReplyResult.getLgItpcl());
    assertEquals(SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.OK,
        actualSucsSetupGdbStoreSyncReplyResult.getStat());
    assertEquals(1, actualSucsSetupGdbStoreSyncReplyResult.getPtsPathArray().length);
  }

  @Test
  void testEquals() {
    SetupGdbStoreSyncReply eroSetupGdbStoreSyncReplyResult = SetupGdbStoreSyncReply
        .eroSetupGdbStoreSyncReply(
            SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.SYNC_SGUID_NOT_MATCHING_ERR);
    SetupGdbStoreSyncReply eroSetupGdbStoreSyncReplyResult1 = SetupGdbStoreSyncReply
        .eroSetupGdbStoreSyncReply(
            SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.SYNC_SGUID_NOT_MATCHING_ERR);
    assertTrue(eroSetupGdbStoreSyncReplyResult.equals(eroSetupGdbStoreSyncReplyResult1));
    int expectedHashCodeResult = eroSetupGdbStoreSyncReplyResult.hashCode();
    assertEquals(expectedHashCodeResult, eroSetupGdbStoreSyncReplyResult1.hashCode());
  }

  @Test
  void testEquals2() {
    SetupGdbStoreSyncReply eroSetupGdbStoreSyncReplyResult = SetupGdbStoreSyncReply.eroSetupGdbStoreSyncReply(
        null);
    assertFalse(eroSetupGdbStoreSyncReplyResult.equals(SetupGdbStoreSyncReply
        .eroSetupGdbStoreSyncReply(
            SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.SYNC_SGUID_NOT_MATCHING_ERR)));
  }

  @Test
  void testEquals3() {
    SetupGdbStoreSyncReply sucsSetupGdbStoreSyncReplyResult = SetupGdbStoreSyncReply.sucsSetupGdbStoreSyncReply(
        1L,
        new Path[]{Paths.get(System.getProperty(
            "java.io.tmpdir"), "test.txt"),
            Paths.get(System.getProperty(
                    "java.io.tmpdir"),
                "test.txt"),
            Paths.get(System.getProperty(
                    "java.io.tmpdir"),
                "test.txt")});
    assertFalse(sucsSetupGdbStoreSyncReplyResult.equals(SetupGdbStoreSyncReply
        .eroSetupGdbStoreSyncReply(
            SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.SYNC_SGUID_NOT_MATCHING_ERR)));
  }

  @Test
  void testEquals4() {
    assertFalse(SetupGdbStoreSyncReply
        .eroSetupGdbStoreSyncReply(
            SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.SYNC_SGUID_NOT_MATCHING_ERR)
        .equals(null));
  }

  @Test
  void testEquals5() {
    assertFalse(SetupGdbStoreSyncReply
        .eroSetupGdbStoreSyncReply(
            SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.SYNC_SGUID_NOT_MATCHING_ERR)
        .equals(0));
  }
}

