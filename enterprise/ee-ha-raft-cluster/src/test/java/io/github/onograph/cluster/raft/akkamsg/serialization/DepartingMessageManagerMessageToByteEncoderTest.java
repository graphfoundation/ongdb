package io.github.onograph.cluster.raft.akkamsg.serialization;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;

import io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta;
import io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry;
import io.github.onograph.cluster.raft.share.meta.fsm.State;
import io.github.onograph.cluster.raft.share.sync.SyncableData;
import io.github.onograph.config.NodeGroupIdentifier;
import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.buffer.Unpooled;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.UUID;
import org.junit.jupiter.api.Test;

class DepartingMessageManagerMessageToByteEncoderTest {

  @Test
  void testCrahdrDepartingMessageManagerMessageToByteEncoderProcessor() {
    DepartingMessageManagerMessageToByteEncoder departingMessageManagerMessageToByteEncoder = new DepartingMessageManagerMessageToByteEncoder();
    assertNull(
        departingMessageManagerMessageToByteEncoder.crahdrDepartingMessageManagerMessageToByteEncoderProcessor(
            new DefaultWritableChecksumChannel(Unpooled.compositeBuffer(3)),
            null).memberSafeStateMarshalImpl);
  }

  @Test
  void testProcessorConstructor() {
    DefaultWritableChecksumChannel defaultWritableChecksumChannel = new DefaultWritableChecksumChannel(
        Unpooled.compositeBuffer(3));
    DepartingMessageManagerMessageToByteEncoder.Processor actualProcessor = new DepartingMessageManagerMessageToByteEncoder.Processor(
        defaultWritableChecksumChannel, null);

    assertNull(actualProcessor.memberSafeStateMarshalImpl);
    assertSame(actualProcessor.defaultWritableChecksumChannel, defaultWritableChecksumChannel);
    assertNull(null);
  }

  @Test
  void testProcessorProcess() {
    DepartingMessageManagerMessageToByteEncoder.Processor processor = new DepartingMessageManagerMessageToByteEncoder.Processor(
        new DefaultWritableChecksumChannel(Unpooled.compositeBuffer(3)), null);
    assertNull(processor.process(
        new ConsensusMessageServiceMeta.AliveNoReplyMessage(new ConsensusNodeId(UUID.randomUUID()),
            1L, 1L, 1L)));
  }

  @Test
  void testProcessorProcess10() {
    DepartingMessageManagerMessageToByteEncoder.Processor processor = new DepartingMessageManagerMessageToByteEncoder.Processor(
        new DefaultWritableChecksumChannel(Unpooled.compositeBuffer(3)), null);
    assertNull(processor.process(new ConsensusMessageServiceMeta.LogClipRequestMessage(1L)));
  }

  @Test
  void testProcessorProcess11() throws Exception {
    DepartingMessageManagerMessageToByteEncoder.Processor processor = new DepartingMessageManagerMessageToByteEncoder.Processor(
        new DefaultWritableChecksumChannel(Unpooled.compositeBuffer(3)), null);
    SyncableData btval = mock(SyncableData.class);
    assertNull(processor
        .process(new ConsensusMessageServiceMeta.MsgCreatorService.Ask(btval,
            new ConsensusNodeId(UUID.randomUUID()))));
  }

  @Test
  void testProcessorProcess12() {
    DepartingMessageManagerMessageToByteEncoder.Processor processor = new DepartingMessageManagerMessageToByteEncoder.Processor(
        new DefaultWritableChecksumChannel(Unpooled.compositeBuffer(3)), null);
    assertNull(
        processor.process(new ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk(
            new ArrayList<SyncableData>())));
  }

  @Test
  void testProcessorProcess13() {
    DepartingMessageManagerMessageToByteEncoder.Processor processor = new DepartingMessageManagerMessageToByteEncoder.Processor(
        new DefaultWritableChecksumChannel(Unpooled.compositeBuffer(3)), null);
    assertNull(
        processor.process(new ConsensusMessageServiceMeta.RequestTransactionLogCZMetaMessage(1L,
            new ConsensusNodeId(UUID.randomUUID()), 1L)));
  }

  @Test
  void testProcessorProcess14() {
    DepartingMessageManagerMessageToByteEncoder.Processor processor = new DepartingMessageManagerMessageToByteEncoder.Processor(
        new DefaultWritableChecksumChannel(
            new CompositeByteBuf(new PooledByteBufAllocator(), true, 3)), null);
    assertNull(
        processor.process(new ConsensusMessageServiceMeta.RequestTransactionLogCZMetaMessage(1L,
            new ConsensusNodeId(UUID.randomUUID()), 1L)));
  }

  @Test
  void testProcessorProcess15() {
    DepartingMessageManagerMessageToByteEncoder.Processor processor = new DepartingMessageManagerMessageToByteEncoder.Processor(
        new DefaultWritableChecksumChannel(Unpooled.compositeBuffer(3)), null);
    assertNull(processor
        .process(new ConsensusMessageServiceMeta.Timeoutable.AliveMsg(
            new ConsensusNodeId(UUID.randomUUID()))));
  }

  @Test
  void testProcessorProcess16() {
    DepartingMessageManagerMessageToByteEncoder.Processor processor = new DepartingMessageManagerMessageToByteEncoder.Processor(
        new DefaultWritableChecksumChannel(Unpooled.compositeBuffer(3)), null);
    assertNull(processor.process(
        new ConsensusMessageServiceMeta.Timeoutable.ConsensusElectionTimeout(
            new ConsensusNodeId(UUID.randomUUID()))));
  }

  @Test
  void testProcessorProcess17() throws Exception {
    DepartingMessageManagerMessageToByteEncoder.Processor processor = new DepartingMessageManagerMessageToByteEncoder.Processor(
        new DefaultWritableChecksumChannel(Unpooled.compositeBuffer(3)), null);
    ConsensusLogEntry consensusLogEntry = new ConsensusLogEntry(mock(SyncableData.class), 1L);

    ConsensusLogEntry consensusLogEntry1 = new ConsensusLogEntry(mock(SyncableData.class), 1L);

    assertNull(
        processor
            .process(new ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask(1L, 1L,
                new ConsensusLogEntry[]{consensusLogEntry, consensusLogEntry1,
                    new ConsensusLogEntry(
                        mock(SyncableData.class),
                        1L)},
                new ConsensusNodeId(UUID.randomUUID()), 1L, 1L)));
  }

  @Test
  void testProcessorProcess18() throws Exception {
    DepartingMessageManagerMessageToByteEncoder.Processor processor = new DepartingMessageManagerMessageToByteEncoder.Processor(
        new DefaultWritableChecksumChannel(
            new CompositeByteBuf(new PooledByteBufAllocator(), true, 3)), null);
    ConsensusLogEntry consensusLogEntry = new ConsensusLogEntry(mock(SyncableData.class), 1L);

    ConsensusLogEntry consensusLogEntry1 = new ConsensusLogEntry(mock(SyncableData.class), 1L);

    assertNull(
        processor
            .process(new ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask(1L, 1L,
                new ConsensusLogEntry[]{consensusLogEntry, consensusLogEntry1,
                    new ConsensusLogEntry(
                        mock(SyncableData.class),
                        1L)},
                new ConsensusNodeId(UUID.randomUUID()), 1L, 1L)));
  }

  @Test
  void testProcessorProcess19() {
    DepartingMessageManagerMessageToByteEncoder.Processor processor = new DepartingMessageManagerMessageToByteEncoder.Processor(
        new DefaultWritableChecksumChannel(Unpooled.compositeBuffer(3)), null);
    assertNull(processor.process(new ConsensusMessageServiceMeta.TransactionLogAddMessage.Reply(
        new ConsensusNodeId(UUID.randomUUID()), true, 1L, 1L, 1L)));
  }

  @Test
  void testProcessorProcess2() {
    DepartingMessageManagerMessageToByteEncoder.Processor processor = new DepartingMessageManagerMessageToByteEncoder.Processor(
        new DefaultWritableChecksumChannel(
            new CompositeByteBuf(new PooledByteBufAllocator(), true, 3)), null);
    assertNull(processor.process(
        new ConsensusMessageServiceMeta.AliveNoReplyMessage(new ConsensusNodeId(UUID.randomUUID()),
            1L, 1L, 1L)));
  }

  @Test
  void testProcessorProcess20() {
    DepartingMessageManagerMessageToByteEncoder.Processor processor = new DepartingMessageManagerMessageToByteEncoder.Processor(
        new DefaultWritableChecksumChannel(
            new CompositeByteBuf(new PooledByteBufAllocator(), true, 3)), null);
    assertNull(processor.process(new ConsensusMessageServiceMeta.TransactionLogAddMessage.Reply(
        new ConsensusNodeId(UUID.randomUUID()), true, 1L, 1L, 1L)));
  }

  @Test
  void testProcessorProcess21() {
    DepartingMessageManagerMessageToByteEncoder.Processor processor = new DepartingMessageManagerMessageToByteEncoder.Processor(
        new DefaultWritableChecksumChannel(Unpooled.compositeBuffer(3)), null);
    assertNull(processor.process(new ConsensusMessageServiceMeta.VotePreparationMessage.Reply(
        new ConsensusNodeId(UUID.randomUUID()), true, 1L)));
  }

  @Test
  void testProcessorProcess22() {
    DepartingMessageManagerMessageToByteEncoder.Processor processor = new DepartingMessageManagerMessageToByteEncoder.Processor(
        new DefaultWritableChecksumChannel(
            new CompositeByteBuf(new PooledByteBufAllocator(), true, 3)), null);
    assertNull(processor.process(new ConsensusMessageServiceMeta.VotePreparationMessage.Reply(
        new ConsensusNodeId(UUID.randomUUID()), true, 1L)));
  }

  @Test
  void testProcessorProcess3() {
    DepartingMessageManagerMessageToByteEncoder.Processor processor = new DepartingMessageManagerMessageToByteEncoder.Processor(
        new DefaultWritableChecksumChannel(Unpooled.compositeBuffer(3)), null);
    assertNull(
        processor.process(new ConsensusMessageServiceMeta.AliveReplyMessage(
            new ConsensusNodeId(UUID.randomUUID()))));
  }

  @Test
  void testProcessorProcess4() {
    DepartingMessageManagerMessageToByteEncoder.Processor processor = new DepartingMessageManagerMessageToByteEncoder.Processor(
        new DefaultWritableChecksumChannel(Unpooled.compositeBuffer(3)), null);
    assertNull(processor.process(
        new ConsensusMessageServiceMeta.CandidateVoteMessage.Reply(
            new ConsensusNodeId(UUID.randomUUID()), true, 1L)));
  }

  @Test
  void testProcessorProcess5() {
    DepartingMessageManagerMessageToByteEncoder.Processor processor = new DepartingMessageManagerMessageToByteEncoder.Processor(
        new DefaultWritableChecksumChannel(
            new CompositeByteBuf(new PooledByteBufAllocator(), true, 3)), null);
    assertNull(processor.process(
        new ConsensusMessageServiceMeta.CandidateVoteMessage.Reply(
            new ConsensusNodeId(UUID.randomUUID()), true, 1L)));
  }

  @Test
  void testProcessorProcess6() throws Exception {
    DepartingMessageManagerMessageToByteEncoder.Processor processor = new DepartingMessageManagerMessageToByteEncoder.Processor(
        new DefaultWritableChecksumChannel(Unpooled.compositeBuffer(3)), null);
    ConsensusNodeId _fConsensusNodeId = new ConsensusNodeId(UUID.randomUUID());
    UUID _riUUID = UUID.randomUUID();
    assertThrows(UnsupportedOperationException.class,
        () -> processor.process(
            new ConsensusMessageServiceMeta.InfoReplyMessage(_fConsensusNodeId, _riUUID,
                new State(State.MetaStateMessageType.OK))));
  }

  @Test
  void testProcessorProcess7() throws Exception {
    DepartingMessageManagerMessageToByteEncoder.Processor processor = new DepartingMessageManagerMessageToByteEncoder.Processor(
        new DefaultWritableChecksumChannel(Unpooled.compositeBuffer(3)), null);
    ConsensusNodeId _fConsensusNodeId = new ConsensusNodeId(UUID.randomUUID());
    assertThrows(UnsupportedOperationException.class,
        () -> processor.process(
            new ConsensusMessageServiceMeta.LeaderChangeService.AskToChange(_fConsensusNodeId, 1L,
                1L, new HashSet<NodeGroupIdentifier>())));
  }

  @Test
  void testProcessorProcess8() throws Exception {
    DepartingMessageManagerMessageToByteEncoder.Processor processor = new DepartingMessageManagerMessageToByteEncoder.Processor(
        new DefaultWritableChecksumChannel(Unpooled.compositeBuffer(3)), null);
    assertThrows(UnsupportedOperationException.class,
        () -> processor.process(
            new ConsensusMessageServiceMeta.LeaderChangeService.LeaderNotAccepted(
                new ConsensusNodeId(UUID.randomUUID()), 1L, 1L)));
  }

  @Test
  void testProcessorProcess9() throws Exception {
    DepartingMessageManagerMessageToByteEncoder.Processor processor = new DepartingMessageManagerMessageToByteEncoder.Processor(
        new DefaultWritableChecksumChannel(Unpooled.compositeBuffer(3)), null);
    ConsensusNodeId _frConsensusNodeId = new ConsensusNodeId(UUID.randomUUID());
    ConsensusNodeId _pooeConsensusNodeId = new ConsensusNodeId(UUID.randomUUID());
    assertNull(processor.process(
        new ConsensusMessageServiceMeta.LeaderChangeService.LeaderRec(_frConsensusNodeId,
            _pooeConsensusNodeId,
            new HashSet<NodeGroupIdentifier>())));
  }
}

