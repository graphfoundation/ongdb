package io.github.onograph.cluster.raft.share.calg.resp;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta;
import io.github.onograph.cluster.raft.share.calg.ConsensusMessagingService;
import io.github.onograph.cluster.raft.share.calg.NonLeaderVotingNodeMemberWrapper;
import io.github.onograph.cluster.raft.share.calg.VotingMemberThreshold;
import io.github.onograph.cluster.raft.share.calg.action.ConsensusResultMeta;
import io.github.onograph.cluster.raft.share.calg.action.ConsensusResultService;
import io.github.onograph.cluster.raft.share.calg.meta.ConsensusMetaManagingEnvironment;
import io.github.onograph.cluster.raft.share.calg.meta.ConsensusMetaProvider;
import io.github.onograph.cluster.raft.share.sync.SyncableData;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.neo4j.internal.helpers.collection.FilteringIterable;
import org.neo4j.internal.helpers.collection.Iterables;
import org.neo4j.logging.Log;


public class LeaderNodeConsensusMessenger implements ConsensusMessagingService {


  private static Iterable<ConsensusNodeId> _recnteIterable(
      ConsensusMetaProvider _saeConsensusMetaProvider) {
    return new FilteringIterable(_saeConsensusMetaProvider.recnmeSet(), (member) ->
    {
      return !member.equals(_saeConsensusMetaProvider.myeConsensusNodeId());
    });
  }


  static void sedhabtForCoCo(ConsensusResultService _boConsensusResultService,
      ConsensusMetaProvider _saeConsensusMetaProvider)
      throws IOException {

    long _lgIc = _saeConsensusMetaProvider.comie();

    long _lgCit = _saeConsensusMetaProvider.enrloConsensusTransactionLogEntry().redettm(_lgIc);

    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveNoReplyMessage _hatetAliveNoReplyMessage =
        new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveNoReplyMessage(
            _saeConsensusMetaProvider.myeConsensusNodeId(), _lgIc,
            _saeConsensusMetaProvider.getElecTerm(), _lgCit);

    Iterator _iterator = _recnteIterable(_saeConsensusMetaProvider).iterator();

    while (_iterator.hasNext()) {

      ConsensusNodeId _tConsensusNodeId = (ConsensusNodeId) _iterator.next();
      _boConsensusResultService.adotgmaConsensusResultService(
          new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Messager(
              _hatetAliveNoReplyMessage,
              _tConsensusNodeId));
    }
  }

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

    Processor(ConsensusMetaManagingEnvironment _cConsensusMetaManagingEnvironment, Log _log) {
      this.cConsensusMetaManagingEnvironment = _cConsensusMetaManagingEnvironment;
      this.saeConsensusMetaProvider = _cConsensusMetaManagingEnvironment.getSaeConsensusMetaProvider();
      this.log = _log;
      this.boConsensusResultService = ConsensusResultService.bulrConsensusResultService(
          ConsensusNodeType.CNT_NODE_LEADER,
          _cConsensusMetaManagingEnvironment.getSaeConsensusMetaProvider());
    }


    private void _stdotfwForCoCo(ConsensusResultService _boConsensusResultService,
        ConsensusMetaProvider _srConsensusMetaProvider) {
      _boConsensusResultService.stpndoConsensusResultService(_srConsensusMetaProvider.getElecTerm())
          .sereConsensusResultService(ConsensusNodeType.CNT_NODE_FOLLOWER)
          .seldConsensusResultService(null);
    }

    @Override
    public ConsensusResultService process(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveNoReplyMessage _hatetAliveNoReplyMessage)
        throws IOException {
      if (_hatetAliveNoReplyMessage.getLgLt() < this.saeConsensusMetaProvider.getElecTerm()) {
        return this.boConsensusResultService;
      } else {
        this._stdotfwForCoCo(this.boConsensusResultService, this.saeConsensusMetaProvider);

        Health.beaForCoCoCoLo(this.log, this.boConsensusResultService, _hatetAliveNoReplyMessage,
            this.saeConsensusMetaProvider);
        return this.boConsensusResultService;
      }
    }

    @Override
    public ConsensusResultService process(ConsensusMessageServiceMeta.Timeoutable.AliveMsg aliveMsg)
        throws IOException {
      LeaderNodeConsensusMessenger.sedhabtForCoCo(this.boConsensusResultService,
          this.saeConsensusMetaProvider);
      return this.boConsensusResultService;
    }

    @Override
    public ConsensusResultService process(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveReplyMessage _rhAliveReplyMessage) {
      this.boConsensusResultService.adhaarpConsensusResultService(
          _rhAliveReplyMessage.getFroConsensusNodeId());
      return this.boConsensusResultService;
    }

    @Override
    public ConsensusResultService process(
        ConsensusMessageServiceMeta.Timeoutable.ConsensusElectionTimeout consensusElectionTimeout) {
      if (!VotingMemberThreshold.isQuu(this.saeConsensusMetaProvider.voimbsSet().size(),
          this.saeConsensusMetaProvider.hebresSet().size())) {
        this._stdotfwForCoCo(this.boConsensusResultService, this.saeConsensusMetaProvider);


      }

      this.boConsensusResultService.clhbresConsensusResultService();
      return this.boConsensusResultService;
    }

    @Override
    public ConsensusResultService process(
        ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask _rAsk) throws IOException {
      if (_rAsk.getLgLt() < this.saeConsensusMetaProvider.getElecTerm()) {

        ConsensusMessageServiceMeta.TransactionLogAddMessage.Reply nReply =
            new ConsensusMessageServiceMeta.TransactionLogAddMessage.Reply(
                this.saeConsensusMetaProvider.myeConsensusNodeId(), false,
                this.saeConsensusMetaProvider.enrloConsensusTransactionLogEntry()
                    .apeie(), -1L,
                this.saeConsensusMetaProvider.getElecTerm());
        this.boConsensusResultService.adotgmaConsensusResultService(
            new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Messager(
                nReply, _rAsk.getFroConsensusNodeId()));
        return this.boConsensusResultService;
      } else if (_rAsk.getLgLt() == this.saeConsensusMetaProvider.getElecTerm()) {

        throw new IllegalStateException("*** Error:  894a79c3-0da9-432d-b52e-fb14e100972c");
      } else {
        this._stdotfwForCoCo(this.boConsensusResultService, this.saeConsensusMetaProvider);

        AdderRole.haeanerretForCoCoCo(_rAsk, this.boConsensusResultService,
            this.saeConsensusMetaProvider);
        return this.boConsensusResultService;
      }
    }

    @Override
    public ConsensusResultService process(
        ConsensusMessageServiceMeta.TransactionLogAddMessage.Reply reply)
        throws IOException {

      ConsensusNodeFollowersMeta<ConsensusNodeId> _consensusNodeFollowersMetaSfConsensusNodeId =
          this.saeConsensusMetaProvider.folesteConsensusNodeFollowersMeta();
      if (reply.getLgT() < this.saeConsensusMetaProvider.getElecTerm()) {
        return this.boConsensusResultService;
      } else if (reply.getLgT() > this.saeConsensusMetaProvider.getElecTerm()) {
        this.boConsensusResultService.setmConsensusResultService(reply.getLgT());
        this._stdotfwForCoCo(this.boConsensusResultService, this.saeConsensusMetaProvider);

        _consensusNodeFollowersMetaSfConsensusNodeId = new ConsensusNodeFollowersMeta();
        this.boConsensusResultService.recflssConsensusResultService(
            _consensusNodeFollowersMetaSfConsensusNodeId);
        return this.boConsensusResultService;
      } else {

        ConsensusNodeFollowerMeta _consensusNodeFollowerMeta =
            this.saeConsensusMetaProvider.folesteConsensusNodeFollowersMeta()
                .getConsensusNodeFollowerMeta(reply.getFroConsensusNodeId());
        if (reply.getIsSces()) {
          assert
              reply.getLgIm() <= this.saeConsensusMetaProvider.enrloConsensusTransactionLogEntry()
                  .apeie();

          boolean _isPf = reply.getLgIm() > _consensusNodeFollowerMeta.getLgIm();
          _consensusNodeFollowersMetaSfConsensusNodeId = _consensusNodeFollowersMetaSfConsensusNodeId.onscresConsensusNodeFollowersMeta(
              Math.max(reply.getLgIm(), _consensusNodeFollowerMeta.getLgIm()),
              reply.getFroConsensusNodeId());
          this.boConsensusResultService.recflssConsensusResultService(
                  _consensusNodeFollowersMetaSfConsensusNodeId)
              .adspcmnConsensusResultService(
                  new io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.FindComAction(
                      reply.getLgIm(), reply.getFroConsensusNodeId()));

          boolean _isTcim = this.saeConsensusMetaProvider.enrloConsensusTransactionLogEntry()
              .redettm(reply.getLgIm()) ==
              this.saeConsensusMetaProvider.getElecTerm();
          if (_isPf && _isTcim) {

            long _lgIaq = NonLeaderVotingNodeMemberWrapper.qumanieForSeCo(
                _consensusNodeFollowersMetaSfConsensusNodeId,
                this.saeConsensusMetaProvider.voimbsSet());
            if (_lgIaq > this.saeConsensusMetaProvider.comie()) {
              this.boConsensusResultService.selacoConsensusResultService(_lgIaq)
                  .secmieConsensusResultService(_lgIaq)
                  .adspcmnConsensusResultService(
                      new io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.FinishChangeAction());
            }
          }
        } else if (reply.getLgIa() > -1L
            && reply.getLgIa() >= this.saeConsensusMetaProvider.enrloConsensusTransactionLogEntry()
            .prvid()) {
          this.boConsensusResultService.adspcmnConsensusResultService(
              new io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.NoComAction(
                  reply.getLgIa(),
                  reply.getFroConsensusNodeId()));
        } else {

          io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RequestTransactionLogCZMetaMessage
              _icRequestTransactionLogCZMetaMessage =
              new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RequestTransactionLogCZMetaMessage(
                  this.saeConsensusMetaProvider.enrloConsensusTransactionLogEntry().prvid(),
                  this.saeConsensusMetaProvider.myeConsensusNodeId(),
                  this.saeConsensusMetaProvider.getElecTerm());

          io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Messager _icdMessager =
              new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Messager(
                  _icRequestTransactionLogCZMetaMessage,
                  reply.getFroConsensusNodeId());
          this.boConsensusResultService.adotgmaConsensusResultService(_icdMessager);
        }

        return this.boConsensusResultService;
      }
    }

    @Override
    public ConsensusResultService process(
        ConsensusMessageServiceMeta.CandidateVoteMessage.Ask _rAsk) throws IOException {
      if (_rAsk.getLgT() > this.saeConsensusMetaProvider.getElecTerm()) {
        this.boConsensusResultService.setmConsensusResultService(_rAsk.getLgT());
        this._stdotfwForCoCo(this.boConsensusResultService, this.saeConsensusMetaProvider);

        ConsensusNodeId _fvConsensusNodeId = null;
        ElectionTallyRole.haevvcForCoCoCoLoCo(_rAsk, this.boConsensusResultService, _rAsk.getLgT(),
            this.log, this.saeConsensusMetaProvider,
            _fvConsensusNodeId);
        return this.boConsensusResultService;
      } else {
        this.boConsensusResultService.adotgmaConsensusResultService(
            new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Messager(
                new ConsensusMessageServiceMeta.CandidateVoteMessage.Reply(
                    this.saeConsensusMetaProvider.myeConsensusNodeId(), false,
                    this.saeConsensusMetaProvider.getElecTerm()),
                _rAsk.getFroConsensusNodeId()));
        return this.boConsensusResultService;
      }
    }

    @Override
    public ConsensusResultService process(ConsensusMessageServiceMeta.MsgCreatorService.Ask _rAsk)
        throws IOException {
      if (!this.saeConsensusMetaProvider.isArtarlr()) {

        SyncableData btval = _rAsk.getBtval();
        AdderRole.apenerForCoCoSy(this.boConsensusResultService, btval,
            this.saeConsensusMetaProvider);
      }

      return this.boConsensusResultService;
    }

    @Override
    public ConsensusResultService process(
        ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk _rBulkAsk) throws IOException {
      if (!this.saeConsensusMetaProvider.isArtarlr()) {

        List<SyncableData> _listCnetSyncableData = _rBulkAsk.cottList();
        AdderRole.apdnensForCoCoCo(this.boConsensusResultService, _listCnetSyncableData,
            this.saeConsensusMetaProvider);
      }

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
        ConsensusMessageServiceMeta.CandidateVoteMessage.Reply reply) {
      return this.boConsensusResultService;
    }

    @Override
    public ConsensusResultService process(
        ConsensusMessageServiceMeta.VotePreparationMessage.Ask _rAsk) throws IOException {
      if (this.cConsensusMetaManagingEnvironment.getIsVps()) {
        if (_rAsk.getLgT() > this.saeConsensusMetaProvider.getElecTerm()) {
          this._stdotfwForCoCo(this.boConsensusResultService, this.saeConsensusMetaProvider);


        }

        long _lgT = Long.max(_rAsk.getLgT(), this.saeConsensusMetaProvider.getElecTerm());
        if (_lgT > this.saeConsensusMetaProvider.getElecTerm()) {
          this.boConsensusResultService.setmConsensusResultService(_lgT);
        }

        ElectionTallyRole.denpvretForCoCoCo(_rAsk, this.boConsensusResultService, _lgT,
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
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RequestTransactionLogCZMetaMessage _iclRequestTransactionLogCZMetaMessage) {
      return this.boConsensusResultService;
    }

    @Override
    public ConsensusResultService process(
        ConsensusMessageServiceMeta.LeaderChangeService.AskToChange askToChange)
        throws IOException {
      if (askToChange.getLgT() > this.saeConsensusMetaProvider.getElecTerm()) {
        this._stdotfwForCoCo(this.boConsensusResultService, this.saeConsensusMetaProvider);


      }

      ConsensusMessageServiceMeta.LeaderChangeService.LeaderNotAccepted leaderNotAccepted =
          new ConsensusMessageServiceMeta.LeaderChangeService.LeaderNotAccepted(
              askToChange.getFroConsensusNodeId(),
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
        ConsensusMessageServiceMeta.LeaderChangeService.LeaderRec leaderRec)
        throws IOException {

      long _lgIa = this.saeConsensusMetaProvider.enrloConsensusTransactionLogEntry().apeie();

      long _lgAit = this.saeConsensusMetaProvider.enrloConsensusTransactionLogEntry()
          .redettm(_lgIa);

      ConsensusNodeId _pooeConsensusNodeId = leaderRec.getPooeConsensusNodeId();

      boolean _isKp = Iterables.stream(
              LeaderNodeConsensusMessenger._recnteIterable(this.saeConsensusMetaProvider))
          .anyMatch((member) ->
          {
            return member.equals(
                _pooeConsensusNodeId);
          });
      if (!_isKp) {
        return this.process(new ConsensusMessageServiceMeta.LeaderChangeService.LeaderNotAccepted(
            _pooeConsensusNodeId, _lgIa, _lgAit));
      } else {

        ConsensusMessageServiceMeta.LeaderChangeService.AskToChange askToChange =
            new ConsensusMessageServiceMeta.LeaderChangeService.AskToChange(
                this.saeConsensusMetaProvider.myeConsensusNodeId(), _lgIa, _lgAit,
                leaderRec.getSetGpNodeGroupIdentifier());
        this.boConsensusResultService.sttfnldiConsensusResultService(_pooeConsensusNodeId);

        this.boConsensusResultService.adotgmaConsensusResultService(
            new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Messager(
                askToChange, _pooeConsensusNodeId));
        return this.boConsensusResultService;
      }
    }

    @Override
    public ConsensusResultService process(
        ConsensusMessageServiceMeta.LeaderChangeService.LeaderNotAccepted leaderNotAccepted)
        throws IOException {
      this.boConsensusResultService.adlatrerenConsensusResultService(leaderNotAccepted);

      return this.boConsensusResultService;
    }

    @Override
    public ConsensusResultService process(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage _rsInfoReplyMessage)
        throws IOException {
      return this.boConsensusResultService.sesaresConsensusResultService(_rsInfoReplyMessage);
    }
  }
}
