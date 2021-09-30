package io.github.onograph.cluster.raft.akkamsg.serialization.current.decoding;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import io.github.onograph.cluster.raft.akkamsg.DefaultReadableChecksumChannel;
import io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager;
import io.github.onograph.cluster.raft.akkamsg.serialization.ContentTypeRef;
import io.github.onograph.cluster.raft.akkamsg.serialization.ReadableChannelDataInputStreamImpl;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.share.CommandReaderFactoryProvider;
import io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta;
import io.netty.buffer.Unpooled;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.kernel.impl.transaction.log.InMemoryClosableChannel;

class CurrentConsensusByteToMessageDecoderTest {

  @Test
  void testConstructor() {
    assertFalse(
        (new CurrentConsensusByteToMessageDecoder(new ContentTypeRef(),
            mock(CommandReaderFactoryProvider.class)))
            .isSingleDecode());
  }

  @Test
  void testGelzcpfcrvoOptional() {
    ReadablePositionAwareChecksumChannelManager _readableChannel = new ReadablePositionAwareChecksumChannelManager();
    assertFalse(CurrentConsensusByteToMessageDecoder
        .gelzcpfcrvoOptional(_readableChannel,
            ConsensusMessageServiceMeta.RaftConsensusMessageType.MTYPE_CONS_VOTE_REQ,
            new ConsensusNodeId(UUID.randomUUID()))
        .isPresent());
  }

  @Test
  void testGelzcpfcrvoOptional2() {
    InMemoryClosableChannel _readableChannel = new InMemoryClosableChannel();
    assertThrows(RuntimeException.class,
        () -> CurrentConsensusByteToMessageDecoder.gelzcpfcrvoOptional(_readableChannel,
            ConsensusMessageServiceMeta.RaftConsensusMessageType.LEADER_CHNG_REQ,
            new ConsensusNodeId(UUID.randomUUID())));
  }

  @Test
  void testGelzcpfcrvoOptional3() throws UnsupportedEncodingException {
    InMemoryClosableChannel _readableChannel = new InMemoryClosableChannel(
        "AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8"),
        true, true);

    assertThrows(RuntimeException.class,
        () -> CurrentConsensusByteToMessageDecoder.gelzcpfcrvoOptional(_readableChannel,
            ConsensusMessageServiceMeta.RaftConsensusMessageType.LEADER_CHNG_REQ,
            new ConsensusNodeId(UUID.randomUUID())));
  }

  //@Test
  void testGelzcpfcrvoOptional4() throws UnsupportedEncodingException {
    ReadableChannelDataInputStreamImpl _readableChannel = new ReadableChannelDataInputStreamImpl(
        new ByteArrayInputStream("AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8")));
    assertThrows(Exception.class,
        () -> CurrentConsensusByteToMessageDecoder.gelzcpfcrvoOptional(_readableChannel,
            ConsensusMessageServiceMeta.RaftConsensusMessageType.LEADER_CHNG_REQ,
            new ConsensusNodeId(UUID.randomUUID())));
  }

  //@Test
  void testGelzcpfcrvoOptional5() {
    DefaultReadableChecksumChannel _readableChannel = new DefaultReadableChecksumChannel(
        Unpooled.compositeBuffer(3));
    assertThrows(RuntimeException.class,
        () -> CurrentConsensusByteToMessageDecoder.gelzcpfcrvoOptional(_readableChannel,
            ConsensusMessageServiceMeta.RaftConsensusMessageType.LEADER_CHNG_REQ,
            new ConsensusNodeId(UUID.randomUUID())));
  }

  @Test
  void testGelzcpfcrvoOptional6() {
    InMemoryClosableChannel inMemoryClosableChannel = new InMemoryClosableChannel();
    inMemoryClosableChannel.putDouble(10.0);
    assertThrows(RuntimeException.class,
        () -> CurrentConsensusByteToMessageDecoder.gelzcpfcrvoOptional(inMemoryClosableChannel,
            ConsensusMessageServiceMeta.RaftConsensusMessageType.LEADER_CHNG_REQ,
            new ConsensusNodeId(UUID.randomUUID())));
  }

  @Test
  void testGelzcpfcrvoOptional7() throws UnsupportedEncodingException {
    InMemoryClosableChannel _readableChannel = new InMemoryClosableChannel(
        "AAAAAAAAAAAAAAAA￿AAAAAAA".getBytes("UTF-8"),
        true, true);

    assertTrue(
        CurrentConsensusByteToMessageDecoder
            .gelzcpfcrvoOptional(_readableChannel,
                ConsensusMessageServiceMeta.RaftConsensusMessageType.LEADER_CHNG_REQ,
                new ConsensusNodeId(UUID.randomUUID()))
            .isPresent());
  }

  @Test
  void testGelzcpfcrvoOptional8() throws UnsupportedEncodingException {
    InMemoryClosableChannel _readableChannel = new InMemoryClosableChannel(
        "AAAAAAAAAAAAAAAA￿AAA￿AAA".getBytes("UTF-8"),
        true, true);

    assertTrue(
        CurrentConsensusByteToMessageDecoder
            .gelzcpfcrvoOptional(_readableChannel,
                ConsensusMessageServiceMeta.RaftConsensusMessageType.LEADER_CHNG_REQ,
                new ConsensusNodeId(UUID.randomUUID()))
            .isPresent());
  }

  @Test
  void testGelzcpOptional() throws IOException, EndOfStreamException {
    CurrentConsensusByteToMessageDecoder currentConsensusByteToMessageDecoder = new CurrentConsensusByteToMessageDecoder(
        new ContentTypeRef(), mock(CommandReaderFactoryProvider.class));
    ConsensusNodeId _froConsensusNodeId = new ConsensusNodeId(UUID.randomUUID());

    InMemoryClosableChannel inMemoryClosableChannel = new InMemoryClosableChannel();
    inMemoryClosableChannel.putLong(0L);
    inMemoryClosableChannel.putLong(0L);
    inMemoryClosableChannel.putLong(0L);
    inMemoryClosableChannel.putShort((short) 0);
    assertTrue(
        currentConsensusByteToMessageDecoder
            .gelzcpOptional(_froConsensusNodeId,
                ConsensusMessageServiceMeta.RaftConsensusMessageType.MTYPE_CONS_VOTE_REQ,
                inMemoryClosableChannel)
            .isPresent());
  }

  @Test
  void testGelzcpOptional2() throws IOException, EndOfStreamException {
    CurrentConsensusByteToMessageDecoder currentConsensusByteToMessageDecoder = new CurrentConsensusByteToMessageDecoder(
        new ContentTypeRef(), mock(CommandReaderFactoryProvider.class));
    ConsensusNodeId _froConsensusNodeId = new ConsensusNodeId(UUID.randomUUID());

    InMemoryClosableChannel inMemoryClosableChannel = new InMemoryClosableChannel();
    inMemoryClosableChannel.putLong(0L);
    inMemoryClosableChannel.putShort((short) 0);
    assertTrue(
        currentConsensusByteToMessageDecoder
            .gelzcpOptional(_froConsensusNodeId,
                ConsensusMessageServiceMeta.RaftConsensusMessageType.MTYPE_CONS_VOTE_ANS,
                inMemoryClosableChannel)
            .isPresent());
  }
}

