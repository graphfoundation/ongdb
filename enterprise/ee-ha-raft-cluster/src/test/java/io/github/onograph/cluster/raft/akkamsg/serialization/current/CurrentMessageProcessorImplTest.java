package io.github.onograph.cluster.raft.akkamsg.serialization.current;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta;
import io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry;
import io.github.onograph.cluster.raft.share.sync.SyncableData;
import io.github.onograph.config.NodeGroupIdentifier;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.UUID;
import org.junit.jupiter.api.Test;

class CurrentMessageProcessorImplTest {

  @Test
  void testProcess() {
    CurrentMessageProcessorImpl currentMessageProcessorImpl = new CurrentMessageProcessorImpl();
    assertTrue(currentMessageProcessorImpl.process(
        new ConsensusMessageServiceMeta.AliveNoReplyMessage(new ConsensusNodeId(UUID.randomUUID()),
            1L, 1L, 1L)));
  }

  @Test
  void testProcess10() {
    CurrentMessageProcessorImpl currentMessageProcessorImpl = new CurrentMessageProcessorImpl();
    assertTrue(currentMessageProcessorImpl
        .process(new ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk(
            new ArrayList<SyncableData>())));
  }

  @Test
  void testProcess11() {
    CurrentMessageProcessorImpl currentMessageProcessorImpl = new CurrentMessageProcessorImpl();
    assertTrue(currentMessageProcessorImpl.process(
        new ConsensusMessageServiceMeta.RequestTransactionLogCZMetaMessage(
            1L, new ConsensusNodeId(UUID.randomUUID()), 1L)));
  }

  @Test
  void testProcess12() {
    CurrentMessageProcessorImpl currentMessageProcessorImpl = new CurrentMessageProcessorImpl();
    assertTrue(currentMessageProcessorImpl
        .process(new ConsensusMessageServiceMeta.Timeoutable.AliveMsg(
            new ConsensusNodeId(UUID.randomUUID()))));
  }

  @Test
  void testProcess13() {
    CurrentMessageProcessorImpl currentMessageProcessorImpl = new CurrentMessageProcessorImpl();
    assertTrue(currentMessageProcessorImpl.process(
        new ConsensusMessageServiceMeta.Timeoutable.ConsensusElectionTimeout(
            new ConsensusNodeId(UUID.randomUUID()))));
  }

  @Test
  void testProcess14() {
    CurrentMessageProcessorImpl currentMessageProcessorImpl = new CurrentMessageProcessorImpl();
    ConsensusLogEntry consensusLogEntry = new ConsensusLogEntry(mock(SyncableData.class), 1L);

    ConsensusLogEntry consensusLogEntry1 = new ConsensusLogEntry(mock(SyncableData.class), 1L);

    assertTrue(
        currentMessageProcessorImpl
            .process(new ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask(1L, 1L,
                new ConsensusLogEntry[]{consensusLogEntry, consensusLogEntry1,
                    new ConsensusLogEntry(
                        mock(SyncableData.class),
                        1L)},
                new ConsensusNodeId(UUID.randomUUID()), 1L, 1L)));
  }

  @Test
  void testProcess15() {
    CurrentMessageProcessorImpl currentMessageProcessorImpl = new CurrentMessageProcessorImpl();
    assertTrue(currentMessageProcessorImpl.process(
        new ConsensusMessageServiceMeta.TransactionLogAddMessage.Reply(
            new ConsensusNodeId(UUID.randomUUID()), true, 1L, 1L, 1L)));
  }

  @Test
  void testProcess16() {
    CurrentMessageProcessorImpl currentMessageProcessorImpl = new CurrentMessageProcessorImpl();
    ConsensusNodeId _cniaeConsensusNodeId = new ConsensusNodeId(UUID.randomUUID());
    assertTrue(currentMessageProcessorImpl.process(
        new ConsensusMessageServiceMeta.VotePreparationMessage.Ask(
            _cniaeConsensusNodeId, new ConsensusNodeId(UUID.randomUUID()), 1L, 1L, 1L)));
  }

  @Test
  void testProcess17() {
    CurrentMessageProcessorImpl currentMessageProcessorImpl = new CurrentMessageProcessorImpl();
    assertTrue(currentMessageProcessorImpl.process(
        new ConsensusMessageServiceMeta.VotePreparationMessage.Reply(
            new ConsensusNodeId(UUID.randomUUID()), true, 1L)));
  }

  @Test
  void testProcess2() {
    CurrentMessageProcessorImpl currentMessageProcessorImpl = new CurrentMessageProcessorImpl();
    assertTrue(currentMessageProcessorImpl
        .process(new ConsensusMessageServiceMeta.AliveReplyMessage(
            new ConsensusNodeId(UUID.randomUUID()))));
  }

  @Test
  void testProcess3() {
    CurrentMessageProcessorImpl currentMessageProcessorImpl = new CurrentMessageProcessorImpl();
    ConsensusNodeId _cniaeConsensusNodeId = new ConsensusNodeId(UUID.randomUUID());
    assertTrue(currentMessageProcessorImpl.process(
        new ConsensusMessageServiceMeta.CandidateVoteMessage.Ask(
            _cniaeConsensusNodeId, new ConsensusNodeId(UUID.randomUUID()), 1L, 1L, 1L)));
  }

  @Test
  void testProcess4() {
    CurrentMessageProcessorImpl currentMessageProcessorImpl = new CurrentMessageProcessorImpl();
    assertTrue(currentMessageProcessorImpl.process(
        new ConsensusMessageServiceMeta.CandidateVoteMessage.Reply(
            new ConsensusNodeId(UUID.randomUUID()), true, 1L)));
  }

  @Test
  void testProcess5() {
    CurrentMessageProcessorImpl currentMessageProcessorImpl = new CurrentMessageProcessorImpl();
    ConsensusNodeId _fConsensusNodeId = new ConsensusNodeId(UUID.randomUUID());
    assertTrue(currentMessageProcessorImpl.process(
        new ConsensusMessageServiceMeta.LeaderChangeService.AskToChange(
            _fConsensusNodeId, 1L, 1L, new HashSet<NodeGroupIdentifier>())));
  }

  @Test
  void testProcess6() {
    CurrentMessageProcessorImpl currentMessageProcessorImpl = new CurrentMessageProcessorImpl();
    assertTrue(
        currentMessageProcessorImpl.process(
            new ConsensusMessageServiceMeta.LeaderChangeService.LeaderNotAccepted(
                new ConsensusNodeId(UUID.randomUUID()), 1L, 1L)));
  }

  @Test
  void testProcess7() {
    CurrentMessageProcessorImpl currentMessageProcessorImpl = new CurrentMessageProcessorImpl();
    ConsensusNodeId _frConsensusNodeId = new ConsensusNodeId(UUID.randomUUID());
    ConsensusNodeId _pooeConsensusNodeId = new ConsensusNodeId(UUID.randomUUID());
    assertTrue(currentMessageProcessorImpl.process(
        new ConsensusMessageServiceMeta.LeaderChangeService.LeaderRec(
            _frConsensusNodeId, _pooeConsensusNodeId, new HashSet<NodeGroupIdentifier>())));
  }

  @Test
  void testProcess8() {
    CurrentMessageProcessorImpl currentMessageProcessorImpl = new CurrentMessageProcessorImpl();
    assertTrue(currentMessageProcessorImpl.process(
        new ConsensusMessageServiceMeta.LogClipRequestMessage(1L)));
  }

  @Test
  void testProcess9() {
    CurrentMessageProcessorImpl currentMessageProcessorImpl = new CurrentMessageProcessorImpl();
    SyncableData btval = mock(SyncableData.class);
    assertTrue(currentMessageProcessorImpl
        .process(new ConsensusMessageServiceMeta.MsgCreatorService.Ask(btval,
            new ConsensusNodeId(UUID.randomUUID()))));
  }
}

