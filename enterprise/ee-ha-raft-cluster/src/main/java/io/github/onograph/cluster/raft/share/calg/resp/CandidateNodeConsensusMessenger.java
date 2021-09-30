package io.github.onograph.cluster.raft.share.calg.resp;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta;
import io.github.onograph.cluster.raft.share.calg.ConsensusMessagingService;
import io.github.onograph.cluster.raft.share.calg.LeaderNodeDataSDWrapper;
import io.github.onograph.cluster.raft.share.calg.NodeElectionTimeTrackerType;
import io.github.onograph.cluster.raft.share.calg.VotingMemberThreshold;
import io.github.onograph.cluster.raft.share.calg.action.ConsensusResultMeta;
import io.github.onograph.cluster.raft.share.calg.action.ConsensusResultService;
import io.github.onograph.cluster.raft.share.calg.meta.ConsensusMetaManagingEnvironment;
import io.github.onograph.cluster.raft.share.calg.meta.ConsensusMetaProvider;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.neo4j.logging.Log;


class CandidateNodeConsensusMessenger implements ConsensusMessagingService {

  @Override
  public ConsensusResultMeta hadConsensusResultMeta(
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage m,
      ConsensusMetaManagingEnvironment _cConsensusMetaManagingEnvironment, Log _log)
      throws IOException {
    return m.dipc(new Processor(_cConsensusMetaManagingEnvironment, _log)).bulConsensusResultMeta();
  }


  private static class Processor implements
      ConsensusMessageServiceMeta.Processor<ConsensusResultService, IOException> {


    private final ConsensusResultService boConsensusResultService;


    private final ConsensusMetaManagingEnvironment cConsensusMetaManagingEnvironment;


    private final Log log;


    private final ConsensusMetaProvider saeConsensusMetaProvider;

    private Processor(ConsensusMetaManagingEnvironment _cConsensusMetaManagingEnvironment,
        Log _log) {
      this.cConsensusMetaManagingEnvironment = _cConsensusMetaManagingEnvironment;
      this.saeConsensusMetaProvider = _cConsensusMetaManagingEnvironment.getSaeConsensusMetaProvider();
      this.log = _log;
      this.boConsensusResultService = ConsensusResultService.bulrConsensusResultService(
          ConsensusNodeType.CNT_NODE_POT,
          _cConsensusMetaManagingEnvironment.getSaeConsensusMetaProvider());
    }

    @Override
    public ConsensusResultService process(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveNoReplyMessage _rAliveNoReplyMessage)
        throws IOException {
      if (_rAliveNoReplyMessage.getLgLt() < this.saeConsensusMetaProvider.getElecTerm()) {
        return this.boConsensusResultService;
      } else {
        this.boConsensusResultService.sereConsensusResultService(
            ConsensusNodeType.CNT_NODE_FOLLOWER);

        Health.beaForCoCoCoLo(this.log, this.boConsensusResultService, _rAliveNoReplyMessage,
            this.saeConsensusMetaProvider);
        return this.boConsensusResultService;
      }
    }

    @Override
    public ConsensusResultService process(
        ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask _rAsk) throws IOException {
      if (_rAsk.getLgLt() < this.saeConsensusMetaProvider.getElecTerm()) {

        ConsensusMessageServiceMeta.TransactionLogAddMessage.Reply nReply =
            new ConsensusMessageServiceMeta.TransactionLogAddMessage.Reply(
                this.saeConsensusMetaProvider.myeConsensusNodeId(), false,
                this.saeConsensusMetaProvider.enrloConsensusTransactionLogEntry()
                    .apeie(), _rAsk.getBegLIdx(),
                this.saeConsensusMetaProvider.getElecTerm());
        this.boConsensusResultService.adotgmaConsensusResultService(
            new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Messager(
                nReply, _rAsk.getFroConsensusNodeId()));
        return this.boConsensusResultService;
      } else {
        this.boConsensusResultService.sereConsensusResultService(
            ConsensusNodeType.CNT_NODE_FOLLOWER);

        AdderRole.haeanerretForCoCoCo(_rAsk, this.boConsensusResultService,
            this.saeConsensusMetaProvider);
        return this.boConsensusResultService;
      }
    }

    @Override
    public ConsensusResultService process(
        ConsensusMessageServiceMeta.CandidateVoteMessage.Reply _rReply) throws IOException {
      if (_rReply.getLgT() > this.saeConsensusMetaProvider.getElecTerm()) {
        this.boConsensusResultService.setmConsensusResultService(_rReply.getLgT())
            .sereConsensusResultService(ConsensusNodeType.CNT_NODE_FOLLOWER);

        return this.boConsensusResultService;
      } else if (_rReply.getLgT() >= this.saeConsensusMetaProvider.getElecTerm()
          && _rReply.getIsGv()) {

        HashSet<ConsensusNodeId> _hashSetVfmConsensusNodeId = new HashSet(
            this.saeConsensusMetaProvider.voefomeSet());
        if (!_rReply.getFroConsensusNodeId()
            .equals(this.saeConsensusMetaProvider.myeConsensusNodeId())) {
          _hashSetVfmConsensusNodeId.add(_rReply.getFroConsensusNodeId());
          this.boConsensusResultService.sevefomeConsensusResultService(_hashSetVfmConsensusNodeId);
        }

        if (VotingMemberThreshold.isQuu(this.saeConsensusMetaProvider.voimbsSet(),
            _hashSetVfmConsensusNodeId)) {
          this.boConsensusResultService.seldConsensusResultService(
              this.saeConsensusMetaProvider.myeConsensusNodeId());
          AdderRole.apenerForCoCoSy(this.boConsensusResultService, new LeaderNodeDataSDWrapper(),
              this.saeConsensusMetaProvider);
          LeaderNodeConsensusMessenger.sedhabtForCoCo(this.boConsensusResultService,
              this.saeConsensusMetaProvider);
          this.boConsensusResultService.selslibewbcleConsensusResultService(
                  this.saeConsensusMetaProvider.enrloConsensusTransactionLogEntry().apeie())
              .elcdlarConsensusResultService()
              .reeitmConsensusResultService(NodeElectionTimeTrackerType.TTT_ERR_TRACE)
              .sereConsensusResultService(ConsensusNodeType.CNT_NODE_LEADER);


        }

        return this.boConsensusResultService;
      } else {
        return this.boConsensusResultService;
      }
    }

    @Override
    public ConsensusResultService process(
        ConsensusMessageServiceMeta.CandidateVoteMessage.Ask _rAsk) throws IOException {

      long _lgTe = Long.max(_rAsk.getLgT(), this.saeConsensusMetaProvider.getElecTerm());
      if (_lgTe > this.saeConsensusMetaProvider.getElecTerm()) {
        this.boConsensusResultService.setmConsensusResultService(_lgTe)
            .sevefomeConsensusResultService(Set.of())
            .sereConsensusResultService(ConsensusNodeType.CNT_NODE_FOLLOWER);

        ConsensusNodeId _fvConsensusNodeId = null;
        ElectionTallyRole.haevvcForCoCoCoLoCo(_rAsk, this.boConsensusResultService, _lgTe, this.log,
            this.saeConsensusMetaProvider,
            _fvConsensusNodeId);
        return this.boConsensusResultService;
      } else {
        this.boConsensusResultService
            .adotgmaConsensusResultService(
                new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Messager(
                    new ConsensusMessageServiceMeta.CandidateVoteMessage.Reply(
                        this.saeConsensusMetaProvider.myeConsensusNodeId(), false, _lgTe),
                    _rAsk.getFroConsensusNodeId()));
        return this.boConsensusResultService;
      }
    }

    @Override
    public ConsensusResultService process(
        ConsensusMessageServiceMeta.Timeoutable.ConsensusElectionTimeout consensusElectionTimeout)
        throws IOException {

      if (!ConsensusLeaderElectionRole.isStreloForCoCoLo(this.boConsensusResultService,
          this.saeConsensusMetaProvider.getElecTerm(), this.log,
          this.saeConsensusMetaProvider)) {

        this.boConsensusResultService.sereConsensusResultService(
            ConsensusNodeType.CNT_NODE_FOLLOWER);
      }

      return this.boConsensusResultService;
    }

    @Override
    public ConsensusResultService process(
        ConsensusMessageServiceMeta.VotePreparationMessage.Ask _rAsk) throws IOException {
      if (this.cConsensusMetaManagingEnvironment.getIsVps()) {
        if (_rAsk.getLgT() > this.saeConsensusMetaProvider.getElecTerm()) {
          this.boConsensusResultService.sevefomeConsensusResultService(Set.of())
              .sereConsensusResultService(ConsensusNodeType.CNT_NODE_FOLLOWER);


        }

        long _lgT = Long.max(_rAsk.getLgT(), this.saeConsensusMetaProvider.getElecTerm());
        if (_lgT > this.saeConsensusMetaProvider.getElecTerm()) {
          this.boConsensusResultService.setmConsensusResultService(_lgT);
        }

        ElectionTallyRole.haepvovrForCoCoCoLo(_rAsk, _lgT, this.log, this.boConsensusResultService,
            this.saeConsensusMetaProvider);
      }

      return this.boConsensusResultService;
    }

    @Override
    public ConsensusResultService process(
        ConsensusMessageServiceMeta.VotePreparationMessage.Reply reply) {
      return this.boConsensusResultService;
    }

    @Override
    public ConsensusResultService process(
        ConsensusMessageServiceMeta.TransactionLogAddMessage.Reply reply) {
      return this.boConsensusResultService;
    }

    @Override
    public ConsensusResultService process(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RequestTransactionLogCZMetaMessage _lciRequestTransactionLogCZMetaMessage) {
      return this.boConsensusResultService;
    }

    @Override
    public ConsensusResultService process(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveReplyMessage _rhAliveReplyMessage) {
      return this.boConsensusResultService;
    }

    @Override
    public ConsensusResultService process(
        ConsensusMessageServiceMeta.Timeoutable.AliveMsg aliveMsg) {
      return this.boConsensusResultService;
    }

    @Override
    public ConsensusResultService process(ConsensusMessageServiceMeta.MsgCreatorService.Ask ask) {
      return this.boConsensusResultService;
    }

    @Override
    public ConsensusResultService process(
        ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk bulkAsk) {
      return this.boConsensusResultService;
    }

    @Override
    public ConsensusResultService process(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LogClipRequestMessage _rpLogClipRequestMessage) {
      ClipperRole.haepereForCoCo(this.boConsensusResultService, _rpLogClipRequestMessage);
      return this.boConsensusResultService;
    }

    @Override
    public ConsensusResultService process(
        ConsensusMessageServiceMeta.LeaderChangeService.AskToChange askToChange) {

      ConsensusMessageServiceMeta.LeaderChangeService.LeaderNotAccepted leaderNotAccepted =
          new ConsensusMessageServiceMeta.LeaderChangeService.LeaderNotAccepted(
              this.saeConsensusMetaProvider.myeConsensusNodeId(),
              this.saeConsensusMetaProvider.comie(),
              this.saeConsensusMetaProvider.getElecTerm());
      this.boConsensusResultService.adotgmaConsensusResultService(
          new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Messager(
              leaderNotAccepted,
              askToChange.getFroConsensusNodeId()));
      return this.boConsensusResultService;
    }

    @Override
    public ConsensusResultService process(
        ConsensusMessageServiceMeta.LeaderChangeService.LeaderRec leaderRec) {
      return this.process(new ConsensusMessageServiceMeta.LeaderChangeService.LeaderNotAccepted(
          this.saeConsensusMetaProvider.myeConsensusNodeId(),
          this.saeConsensusMetaProvider.comie(),
          this.saeConsensusMetaProvider.getElecTerm()));
    }

    @Override
    public ConsensusResultService process(
        ConsensusMessageServiceMeta.LeaderChangeService.LeaderNotAccepted leaderNotAccepted) {
      this.boConsensusResultService.adlatrerenConsensusResultService(leaderNotAccepted);
      return this.boConsensusResultService;
    }

    @Override
    public ConsensusResultService process(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage _rsInfoReplyMessage)
        throws IOException {
      this.boConsensusResultService.sesaresConsensusResultService(_rsInfoReplyMessage);
      return this.boConsensusResultService;
    }
  }
}
