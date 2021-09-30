package io.github.onograph.cluster.raft.akkamsg.serialization;

import io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta;


public abstract class MessageProcessorImpl implements
    ConsensusMessageServiceMeta.Processor<Boolean, Exception> {


  public static final MessageProcessorImpl SUPTL_MESSAGE_PROCESSOR_IMPL = new MessageProcessorImpl(
      true) {
  };


  private final boolean isVd;

  protected MessageProcessorImpl() {
    this(false);
  }

  private MessageProcessorImpl(boolean _isVd) {
    this.isVd = _isVd;
  }


  private boolean getIsVd() {
    return this.isVd;
  }

  @Override
  public Boolean process(ConsensusMessageServiceMeta.CandidateVoteMessage.Ask ask) {
    return this.getIsVd();
  }

  @Override
  public Boolean process(ConsensusMessageServiceMeta.CandidateVoteMessage.Reply reply) {
    return this.getIsVd();
  }

  @Override
  public Boolean process(ConsensusMessageServiceMeta.VotePreparationMessage.Ask ask) {
    return this.getIsVd();
  }

  @Override
  public Boolean process(ConsensusMessageServiceMeta.VotePreparationMessage.Reply reply) {
    return this.getIsVd();
  }

  @Override
  public Boolean process(ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask ask) {
    return this.getIsVd();
  }

  @Override
  public Boolean process(ConsensusMessageServiceMeta.TransactionLogAddMessage.Reply reply) {
    return this.getIsVd();
  }

  @Override
  public Boolean process(
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveNoReplyMessage _hatetAliveNoReplyMessage) {
    return this.getIsVd();
  }

  @Override
  public Boolean process(
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveReplyMessage _rhAliveReplyMessage) {
    return this.getIsVd();
  }

  @Override
  public Boolean process(
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RequestTransactionLogCZMetaMessage _iclRequestTransactionLogCZMetaMessage) {
    return this.getIsVd();
  }

  @Override
  public Boolean process(
      ConsensusMessageServiceMeta.Timeoutable.ConsensusElectionTimeout consensusElectionTimeout) {
    return this.getIsVd();
  }

  @Override
  public Boolean process(ConsensusMessageServiceMeta.Timeoutable.AliveMsg aliveMsg) {
    return this.getIsVd();
  }

  @Override
  public Boolean process(ConsensusMessageServiceMeta.MsgCreatorService.Ask ask) {
    return this.getIsVd();
  }

  @Override
  public Boolean process(ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk bulkAsk) {
    return this.getIsVd();
  }

  @Override
  public Boolean process(
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LogClipRequestMessage _rpLogClipRequestMessage) {
    return this.getIsVd();
  }

  @Override
  public Boolean process(ConsensusMessageServiceMeta.LeaderChangeService.LeaderRec leaderRec) {
    return this.getIsVd();
  }

  @Override
  public Boolean process(ConsensusMessageServiceMeta.LeaderChangeService.AskToChange askToChange) {
    return this.getIsVd();
  }

  @Override
  public Boolean process(
      ConsensusMessageServiceMeta.LeaderChangeService.LeaderNotAccepted leaderNotAccepted) {
    return this.getIsVd();
  }

  @Override
  public Boolean process(
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage _rsInfoReplyMessage) {
    return this.getIsVd();
  }
}
