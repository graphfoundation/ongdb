package io.github.onograph.cluster.raft.akkamsg.serialization.current;

import io.github.onograph.cluster.raft.akkamsg.serialization.MessageProcessorImpl;
import io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta;


public class CurrentMessageProcessorImpl extends MessageProcessorImpl {

  @Override
  public Boolean process(ConsensusMessageServiceMeta.LeaderChangeService.LeaderRec leaderRec) {
    return true;
  }

  @Override
  public Boolean process(ConsensusMessageServiceMeta.LeaderChangeService.AskToChange askToChange) {
    return true;
  }

  @Override
  public Boolean process(
      ConsensusMessageServiceMeta.LeaderChangeService.LeaderNotAccepted leaderNotAccepted) {
    return true;
  }

  @Override
  public Boolean process(ConsensusMessageServiceMeta.CandidateVoteMessage.Ask ask) {
    return true;
  }

  @Override
  public Boolean process(ConsensusMessageServiceMeta.CandidateVoteMessage.Reply reply) {
    return true;
  }

  @Override
  public Boolean process(ConsensusMessageServiceMeta.VotePreparationMessage.Ask ask) {
    return true;
  }

  @Override
  public Boolean process(ConsensusMessageServiceMeta.VotePreparationMessage.Reply reply) {
    return true;
  }

  @Override
  public Boolean process(ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask ask) {
    return true;
  }

  @Override
  public Boolean process(ConsensusMessageServiceMeta.TransactionLogAddMessage.Reply reply) {
    return true;
  }

  @Override
  public Boolean process(
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveNoReplyMessage _hatetAliveNoReplyMessage) {
    return true;
  }

  @Override
  public Boolean process(
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveReplyMessage _rhAliveReplyMessage) {
    return true;
  }

  @Override
  public Boolean process(
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RequestTransactionLogCZMetaMessage _iclRequestTransactionLogCZMetaMessage) {
    return true;
  }

  @Override
  public Boolean process(
      ConsensusMessageServiceMeta.Timeoutable.ConsensusElectionTimeout consensusElectionTimeout) {
    return true;
  }

  @Override
  public Boolean process(ConsensusMessageServiceMeta.Timeoutable.AliveMsg aliveMsg) {
    return true;
  }

  @Override
  public Boolean process(ConsensusMessageServiceMeta.MsgCreatorService.Ask ask) {
    return true;
  }

  @Override
  public Boolean process(ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk bulkAsk) {
    return true;
  }

  @Override
  public Boolean process(
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LogClipRequestMessage _rpLogClipRequestMessage) {
    return true;
  }
}
