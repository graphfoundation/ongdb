package io.github.onograph.cluster.raft.share.calg;

import io.github.onograph.cluster.raft.akkamsg.FLIncomingMessageProcessor;
import io.github.onograph.cluster.raft.akkamsg.IncomingMessageProvider;
import io.github.onograph.cluster.raft.id.ConsensusMemberGroupId;
import java.util.function.LongSupplier;


public class LeaderNodeStatusIncomingMessageProcessor
    implements
    FLIncomingMessageProcessor<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>> {


  private final FLIncomingMessageProcessor<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>>
      fLIncomingMessageProcessorHdArrivingMessageManager;


  private final ResettableMessageTimer mrtmrResettableMessageTimer;


  private final LeaderNodeScheduleWrapper talLeaderNodeScheduleWrapper;


  private final io.github.onograph.cluster.raft.share.calg.LeaderNodeStatusIncomingMessageProcessor.MessageProcessorImpl tersMessageProcessorImpl;


  public LeaderNodeStatusIncomingMessageProcessor(
      FLIncomingMessageProcessor<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>> _fLIncomingMessageProcessorHdArrivingMessageManager,
      ResettableMessageTimer _mrtmrResettableMessageTimer,
      LeaderNodeScheduleWrapper _talLeaderNodeScheduleWrapper, LongSupplier _terLongSupplier) {
    this.fLIncomingMessageProcessorHdArrivingMessageManager = _fLIncomingMessageProcessorHdArrivingMessageManager;
    this.talLeaderNodeScheduleWrapper = _talLeaderNodeScheduleWrapper;
    this.tersMessageProcessorImpl =
        new io.github.onograph.cluster.raft.share.calg.LeaderNodeStatusIncomingMessageProcessor.MessageProcessorImpl(
            _terLongSupplier);
    this.mrtmrResettableMessageTimer = _mrtmrResettableMessageTimer;
  }


  public static IncomingMessageProvider copaeIncomingMessageProvider(
      ResettableMessageTimer _mrtmrResettableMessageTimer,
      LeaderNodeScheduleWrapper _talLeaderNodeScheduleWrapper, LongSupplier _teLongSupplier) {
    return (delegate) ->
    {
      return new LeaderNodeStatusIncomingMessageProcessor(delegate, _mrtmrResettableMessageTimer,
          _talLeaderNodeScheduleWrapper, _teLongSupplier);
    };
  }


  private void _hadtetForCo(
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?> m) {
    if (m.getM().dipc(this.tersMessageProcessorImpl)) {
      this.mrtmrResettableMessageTimer.tieret();
      this.talLeaderNodeScheduleWrapper.reeitmForNo(NodeElectionTimeTrackerType.TTT_ERR_TRACE);
    }
  }

  @Override
  public void hadForM(
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?> m) {
    this._hadtetForCo(m);
    this.fLIncomingMessageProcessorHdArrivingMessageManager.hadForM(m);
  }

  @Override
  public synchronized void startProcessor(ConsensusMemberGroupId consensusMemberGroupId)
      throws Exception {
    this.fLIncomingMessageProcessorHdArrivingMessageManager.startProcessor(consensusMemberGroupId);
  }

  @Override
  public synchronized void stopProcessor() throws Exception {
    this.fLIncomingMessageProcessorHdArrivingMessageManager.stopProcessor();
  }


  private static class MessageProcessorImpl implements
      ConsensusMessageServiceMeta.Processor<Boolean, RuntimeException> {


    private final LongSupplier teLongSupplier;

    private MessageProcessorImpl(LongSupplier _tLongSupplier) {
      this.teLongSupplier = _tLongSupplier;
    }

    @Override
    public Boolean process(ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask ask) {
      return ask.getLgLt() >= this.teLongSupplier.getAsLong();
    }

    @Override
    public Boolean process(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveNoReplyMessage _hatetAliveNoReplyMessage) {
      return _hatetAliveNoReplyMessage.getLgLt() >= this.teLongSupplier.getAsLong();
    }

    @Override
    public Boolean process(ConsensusMessageServiceMeta.CandidateVoteMessage.Ask ask) {
      return Boolean.FALSE;
    }

    @Override
    public Boolean process(ConsensusMessageServiceMeta.CandidateVoteMessage.Reply reply) {
      return Boolean.FALSE;
    }

    @Override
    public Boolean process(ConsensusMessageServiceMeta.VotePreparationMessage.Ask ask) {
      return Boolean.FALSE;
    }

    @Override
    public Boolean process(ConsensusMessageServiceMeta.VotePreparationMessage.Reply reply) {
      return Boolean.FALSE;
    }

    @Override
    public Boolean process(ConsensusMessageServiceMeta.TransactionLogAddMessage.Reply reply) {
      return Boolean.FALSE;
    }

    @Override
    public Boolean process(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RequestTransactionLogCZMetaMessage _iclRequestTransactionLogCZMetaMessage) {
      return Boolean.FALSE;
    }

    @Override
    public Boolean process(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveReplyMessage _rhAliveReplyMessage) {
      return Boolean.FALSE;
    }

    @Override
    public Boolean process(
        ConsensusMessageServiceMeta.Timeoutable.ConsensusElectionTimeout consensusElectionTimeout) {
      return Boolean.FALSE;
    }

    @Override
    public Boolean process(ConsensusMessageServiceMeta.Timeoutable.AliveMsg aliveMsg) {
      return Boolean.FALSE;
    }

    @Override
    public Boolean process(ConsensusMessageServiceMeta.MsgCreatorService.Ask ask) {
      return Boolean.FALSE;
    }

    @Override
    public Boolean process(ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk bulkAsk) {
      return Boolean.FALSE;
    }

    @Override
    public Boolean process(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LogClipRequestMessage _rpLogClipRequestMessage) {
      return Boolean.FALSE;
    }

    @Override
    public Boolean process(
        ConsensusMessageServiceMeta.LeaderChangeService.AskToChange askToChange) {
      return Boolean.FALSE;
    }

    @Override
    public Boolean process(ConsensusMessageServiceMeta.LeaderChangeService.LeaderRec leaderRec) {
      return Boolean.FALSE;
    }

    @Override
    public Boolean process(
        ConsensusMessageServiceMeta.LeaderChangeService.LeaderNotAccepted leaderNotAccepted) {
      return Boolean.FALSE;
    }

    @Override
    public Boolean process(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage _rsInfoReplyMessage)
        throws RuntimeException {
      return Boolean.FALSE;
    }
  }
}
