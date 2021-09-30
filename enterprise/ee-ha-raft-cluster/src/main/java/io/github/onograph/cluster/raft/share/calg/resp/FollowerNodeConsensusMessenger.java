package io.github.onograph.cluster.raft.share.calg.resp;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta;
import io.github.onograph.cluster.raft.share.calg.ConsensusMessagingService;
import io.github.onograph.cluster.raft.share.calg.NodeElectionTimeTrackerType;
import io.github.onograph.cluster.raft.share.calg.VotingMemberThreshold;
import io.github.onograph.cluster.raft.share.calg.action.ConsensusResultMeta;
import io.github.onograph.cluster.raft.share.calg.action.ConsensusResultService;
import io.github.onograph.cluster.raft.share.calg.meta.ConsensusMetaManagingEnvironment;
import io.github.onograph.cluster.raft.share.calg.meta.ConsensusMetaProvider;
import io.github.onograph.config.NodeGroupIdentifier;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.neo4j.logging.Log;


class FollowerNodeConsensusMessenger implements ConsensusMessagingService {


  private static ConsensusResultService _haeettitConsensusResultService(
      ConsensusResultService _boConsensusResultService,
      ConsensusMetaManagingEnvironment _cConsensusMetaManagingEnvironment, Log _log)
      throws IOException {

    ConsensusMetaProvider _saeConsensusMetaProvider = _cConsensusMetaManagingEnvironment.getSaeConsensusMetaProvider();

    boolean _isAalbm = !_cConsensusMetaManagingEnvironment.isPcshwiprs();
    if (_cConsensusMetaManagingEnvironment.getIsVps()) {
      if (_isAalbm) {

        if (ConsensusLeaderElectionRole.isStpeenForCoCoLo(_boConsensusResultService, _log,
            _saeConsensusMetaProvider)) {
          _boConsensusResultService.sepecoConsensusResultService(true);
        }
      } else {

        Set<ConsensusNodeId> _setMiConsensusNodeId = _saeConsensusMetaProvider.voimbsSet();
        if (_setMiConsensusNodeId != null && _setMiConsensusNodeId.contains(
            _saeConsensusMetaProvider.myeConsensusNodeId())) {
          _boConsensusResultService.sepecoConsensusResultService(true);
        }
      }
    } else if (_isAalbm) {

      if (ConsensusLeaderElectionRole.isStreloForCoCoLo(_boConsensusResultService,
          _saeConsensusMetaProvider.getElecTerm(), _log,
          _saeConsensusMetaProvider)) {
        _boConsensusResultService.sereConsensusResultService(ConsensusNodeType.CNT_NODE_POT);


      }
    } else {

    }

    return _boConsensusResultService;
  }


  private static void _haelelccForCoCoCo(ConsensusResultService _boConsensusResultService,
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RequestTransactionLogCZMetaMessage _icRequestTransactionLogCZMetaMessage,
      ConsensusMetaProvider _saeConsensusMetaProvider) {
    if (_icRequestTransactionLogCZMetaMessage.getLgLt()
        >= _saeConsensusMetaProvider.getElecTerm()) {

      long _lgIal = _saeConsensusMetaProvider.enrloConsensusTransactionLogEntry().apeie();

      long _lgIpl = _icRequestTransactionLogCZMetaMessage.getBefIdx();
      if (_lgIal <= -1L || _lgIpl > _lgIal) {
        _boConsensusResultService.manefrfhssConsensusResultService(_lgIal, _lgIpl);
      }
    }
  }


  private static void _haeleptsForCoCoCoLo(
      ConsensusMessageServiceMeta.LeaderChangeService.AskToChange askToChange,
      ConsensusResultService _boConsensusResultService,
      ConsensusMetaManagingEnvironment _cConsensusMetaManagingEnvironment, Log _log)
      throws IOException {

    ConsensusMetaProvider _saeConsensusMetaProvider = _cConsensusMetaManagingEnvironment.getSaeConsensusMetaProvider();

    boolean _isTs = _saeConsensusMetaProvider.getElecTerm() == askToChange.getLgT();

    long _lgIal = _saeConsensusMetaProvider.enrloConsensusTransactionLogEntry().apeie();

    boolean _isDtu = _lgIal >= askToChange.getLgIp();

    Set<NodeGroupIdentifier> _setMgNodeGroupIdentifier = _cConsensusMetaManagingEnvironment.sevguSet();

    boolean _isAalbm = !_cConsensusMetaManagingEnvironment.isReoy()
        && !_cConsensusMetaManagingEnvironment.isPcshwiprs();

    boolean _isPrs =
        _isNorudprForCo(askToChange) || _isIaiprryForSeCo(askToChange, _setMgNodeGroupIdentifier);
    if (_isAalbm && _isTs && _isDtu && _isPrs) {
      if (ConsensusLeaderElectionRole.isStreloForCoCoLo(_boConsensusResultService,
          _saeConsensusMetaProvider.getElecTerm(), _log,
          _saeConsensusMetaProvider)) {
        _boConsensusResultService.sereConsensusResultService(ConsensusNodeType.CNT_NODE_POT);


      }
    } else {
      _boConsensusResultService.adotgmaConsensusResultService(
          new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Messager(
              new ConsensusMessageServiceMeta.LeaderChangeService.LeaderNotAccepted(
                  _saeConsensusMetaProvider.myeConsensusNodeId(), _lgIal,
                  _saeConsensusMetaProvider.getElecTerm()),
              askToChange.getFroConsensusNodeId()));
    }
  }


  private static boolean _isIaiprryForSeCo(
      ConsensusMessageServiceMeta.LeaderChangeService.AskToChange askToChange,
      Set<NodeGroupIdentifier> _setGmNodeGroupIdentifier) {

    Iterator _iterator = askToChange.getSetGopNodeGroupIdentifier().iterator();

    NodeGroupIdentifier _gpNodeGroupIdentifier;
    do {
      if (!_iterator.hasNext()) {
        return false;
      }

      _gpNodeGroupIdentifier = (NodeGroupIdentifier) _iterator.next();
    }
    while (!_setGmNodeGroupIdentifier.contains(_gpNodeGroupIdentifier));

    return true;
  }


  private static boolean _isNorudprForCo(
      ConsensusMessageServiceMeta.LeaderChangeService.AskToChange askToChange) {
    return askToChange.getSetGopNodeGroupIdentifier().isEmpty();
  }


  private static Processor _viirFollowerNodeConsensusMessengerProcessor(
      ConsensusMetaManagingEnvironment _cConsensusMetaManagingEnvironment, Log _log) {

    ConsensusMetaProvider _saeConsensusMetaProvider = _cConsensusMetaManagingEnvironment.getSaeConsensusMetaProvider();

    io.github.onograph.cluster.raft.share.calg.resp.FollowerNodeConsensusMessenger.ElectionPrepRequestService _hrvpElectionPrepRequestService;

    io.github.onograph.cluster.raft.share.calg.resp.FollowerNodeConsensusMessenger.ElectionPrepReplyService _hrvpElectionPrepReplyService;
    if (_cConsensusMetaManagingEnvironment.getIsVps()) {
      _hrvpElectionPrepRequestService =
          !_saeConsensusMetaProvider.isPreltn() && _saeConsensusMetaProvider.isArtmstd()
              ? io.github.onograph.cluster.raft.share.calg.resp.FollowerNodeConsensusMessenger.ElectionPrepRequestServiceRejectorImpl.IT
              : io.github.onograph.cluster.raft.share.calg.resp.FollowerNodeConsensusMessenger.ElectionPrepRequestServiceImpl.IT;
      _hrvpElectionPrepReplyService = _saeConsensusMetaProvider.isPreltn()
          ? io.github.onograph.cluster.raft.share.calg.resp.FollowerNodeConsensusMessenger.ElectionPrepReplyServiceOrganizerImpl.IT
          : io.github.onograph.cluster.raft.share.calg.resp.FollowerNodeConsensusMessenger.ElectionPrepReplyServiceDummyImpl.IT;
    } else {
      _hrvpElectionPrepRequestService =
          io.github.onograph.cluster.raft.share.calg.resp.FollowerNodeConsensusMessenger.ElectionPrepRequestServiceDummyImpl.IT;
      _hrvpElectionPrepReplyService =
          io.github.onograph.cluster.raft.share.calg.resp.FollowerNodeConsensusMessenger.ElectionPrepReplyServiceDummyImpl.IT;
    }

    return new Processor(_cConsensusMetaManagingEnvironment, _hrvpElectionPrepReplyService,
        _hrvpElectionPrepRequestService, _log);
  }


  static void cottlgoudForCoCo(ConsensusResultService _boConsensusResultService, long ldrComLng,
      long _lgEnloi, ConsensusMetaProvider _saeConsensusMetaProvider) {

    long _lgIcn = Long.min(ldrComLng, _lgEnloi);
    if (_lgIcn > _saeConsensusMetaProvider.comie()) {
      _boConsensusResultService.secmieConsensusResultService(_lgIcn);
    }
  }


  static boolean isLohsmeForCo(long _lgIpsl, long _lgTpsl,
      ConsensusMetaProvider _saeConsensusMetaProvider) throws IOException {

    long _lgIpll = _saeConsensusMetaProvider.enrloConsensusTransactionLogEntry().prvid();

    long _lgLspt = _saeConsensusMetaProvider.enrloConsensusTransactionLogEntry().redettm(_lgIpsl);
    return _lgIpsl > -1L && (_lgIpsl <= _lgIpll || _lgLspt == _lgTpsl);
  }

  @Override
  public ConsensusResultMeta hadConsensusResultMeta(
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage m,
      ConsensusMetaManagingEnvironment _cConsensusMetaManagingEnvironment, Log _log)
      throws IOException {
    return m.dipc(
            _viirFollowerNodeConsensusMessengerProcessor(_cConsensusMetaManagingEnvironment, _log))
        .bulConsensusResultMeta();
  }


  private interface ElectionPrepReplyService {


    ConsensusResultService hadConsensusResultService(ConsensusMetaProvider _consensusMetaProvider,
        ConsensusResultService _consensusResultService, Log _log,
        ConsensusMessageServiceMeta.VotePreparationMessage.Reply _reply)
        throws IOException;
  }


  private interface ElectionPrepRequestService {


    ConsensusResultService hadConsensusResultService(
        ConsensusMessageServiceMeta.VotePreparationMessage.Ask _ask,
        ConsensusMetaProvider _consensusMetaProvider,
        ConsensusResultService _consensusResultService, Log _log) throws IOException;
  }


  private static class ElectionPrepReplyServiceDummyImpl
      implements
      io.github.onograph.cluster.raft.share.calg.resp.FollowerNodeConsensusMessenger.ElectionPrepReplyService {


    private static final io.github.onograph.cluster.raft.share.calg.resp.FollowerNodeConsensusMessenger.ElectionPrepReplyService IT =
        new io.github.onograph.cluster.raft.share.calg.resp.FollowerNodeConsensusMessenger.ElectionPrepReplyServiceDummyImpl();

    @Override
    public ConsensusResultService hadConsensusResultService(
        ConsensusMetaProvider _saeConsensusMetaProvider,
        ConsensusResultService _boConsensusResultService, Log _log,
        ConsensusMessageServiceMeta.VotePreparationMessage.Reply reply) {
      return _boConsensusResultService;
    }
  }


  private static class ElectionPrepReplyServiceOrganizerImpl
      implements
      io.github.onograph.cluster.raft.share.calg.resp.FollowerNodeConsensusMessenger.ElectionPrepReplyService {


    private static final io.github.onograph.cluster.raft.share.calg.resp.FollowerNodeConsensusMessenger.ElectionPrepReplyService IT =
        new io.github.onograph.cluster.raft.share.calg.resp.FollowerNodeConsensusMessenger.ElectionPrepReplyServiceOrganizerImpl();

    @Override
    public ConsensusResultService hadConsensusResultService(
        ConsensusMetaProvider _saeConsensusMetaProvider,
        ConsensusResultService _boConsensusResultService, Log _log,
        ConsensusMessageServiceMeta.VotePreparationMessage.Reply _rReply)
        throws IOException {

      long _lgTe = Long.max(_rReply.getLgT(), _saeConsensusMetaProvider.getElecTerm());
      if (_lgTe > _saeConsensusMetaProvider.getElecTerm()) {
        _boConsensusResultService.setmConsensusResultService(_rReply.getLgT())
            .sepecoConsensusResultService(false);

        return _boConsensusResultService;
      } else if (_rReply.getLgT() >= _saeConsensusMetaProvider.getElecTerm() && _rReply.getIsGv()) {

        HashSet<ConsensusNodeId> _hashSetMfvpConsensusNodeId = new HashSet(
            _saeConsensusMetaProvider.prvefomeSet());
        if (!_rReply.getFroConsensusNodeId()
            .equals(_saeConsensusMetaProvider.myeConsensusNodeId())) {
          _hashSetMfvpConsensusNodeId.add(_rReply.getFroConsensusNodeId());
          _boConsensusResultService.sepevsfmeConsensusResultService(_hashSetMfvpConsensusNodeId);
        }

        if (VotingMemberThreshold.isQuu(_saeConsensusMetaProvider.voimbsSet(),
            _hashSetMfvpConsensusNodeId)) {
          _boConsensusResultService.reeitmConsensusResultService(
                  NodeElectionTimeTrackerType.TTT_CON_ELECT_INPROCESS)
              .sepecoConsensusResultService(false);
          if (ConsensusLeaderElectionRole.isStreloForCoCoLo(_boConsensusResultService, _lgTe, _log,
              _saeConsensusMetaProvider)) {
            _boConsensusResultService.sereConsensusResultService(ConsensusNodeType.CNT_NODE_POT);


          }
        }

        return _boConsensusResultService;
      } else {
        return _boConsensusResultService;
      }
    }
  }


  private static class ElectionPrepRequestServiceDummyImpl
      implements
      io.github.onograph.cluster.raft.share.calg.resp.FollowerNodeConsensusMessenger.ElectionPrepRequestService {


    private static final io.github.onograph.cluster.raft.share.calg.resp.FollowerNodeConsensusMessenger.ElectionPrepRequestService IT =
        new io.github.onograph.cluster.raft.share.calg.resp.FollowerNodeConsensusMessenger.ElectionPrepRequestServiceDummyImpl();

    @Override
    public ConsensusResultService hadConsensusResultService(
        ConsensusMessageServiceMeta.VotePreparationMessage.Ask ask,
        ConsensusMetaProvider _saeConsensusMetaProvider,
        ConsensusResultService _boConsensusResultService, Log _log) {
      return _boConsensusResultService;
    }
  }


  private static class ElectionPrepRequestServiceImpl
      implements
      io.github.onograph.cluster.raft.share.calg.resp.FollowerNodeConsensusMessenger.ElectionPrepRequestService {


    private static final io.github.onograph.cluster.raft.share.calg.resp.FollowerNodeConsensusMessenger.ElectionPrepRequestService IT =
        new io.github.onograph.cluster.raft.share.calg.resp.FollowerNodeConsensusMessenger.ElectionPrepRequestServiceImpl();

    @Override
    public ConsensusResultService hadConsensusResultService(
        ConsensusMessageServiceMeta.VotePreparationMessage.Ask ask,
        ConsensusMetaProvider _saeConsensusMetaProvider, ConsensusResultService reslt, Log _log)
        throws IOException {

      long _lgT = Long.max(_saeConsensusMetaProvider.getElecTerm(), ask.getLgT());
      reslt.setmConsensusResultService(_lgT);
      ElectionTallyRole.haepvovrForCoCoCoLo(ask, _lgT, _log, reslt, _saeConsensusMetaProvider);
      return reslt;
    }
  }


  private static class ElectionPrepRequestServiceRejectorImpl
      implements
      io.github.onograph.cluster.raft.share.calg.resp.FollowerNodeConsensusMessenger.ElectionPrepRequestService {


    private static final io.github.onograph.cluster.raft.share.calg.resp.FollowerNodeConsensusMessenger.ElectionPrepRequestService IT =
        new io.github.onograph.cluster.raft.share.calg.resp.FollowerNodeConsensusMessenger.ElectionPrepRequestServiceRejectorImpl();

    @Override
    public ConsensusResultService hadConsensusResultService(
        ConsensusMessageServiceMeta.VotePreparationMessage.Ask ask,
        ConsensusMetaProvider _saeConsensusMetaProvider,
        ConsensusResultService _obConsensusResultService, Log _log) throws IOException {

      long _lgTe = Long.max(ask.getLgT(), _saeConsensusMetaProvider.getElecTerm());
      if (_lgTe > _saeConsensusMetaProvider.getElecTerm()) {
        _obConsensusResultService.setmConsensusResultService(_lgTe);
      }

      ElectionTallyRole.denpvretForCoCoCo(ask, _obConsensusResultService, _lgTe,
          _saeConsensusMetaProvider);
      return _obConsensusResultService;
    }
  }


  private static class Processor implements
      ConsensusMessageServiceMeta.Processor<ConsensusResultService, IOException> {


    protected final ConsensusMetaManagingEnvironment ctxConsensusMetaManagingEnvironment;


    protected final Log log;


    protected final ConsensusResultService oucebieConsensusResultService;


    protected final ConsensusMetaProvider sttConsensusMetaProvider;


    private final io.github.onograph.cluster.raft.share.calg.resp.FollowerNodeConsensusMessenger.ElectionPrepReplyService
        hrvpElectionPrepReplyService;


    private final io.github.onograph.cluster.raft.share.calg.resp.FollowerNodeConsensusMessenger.ElectionPrepRequestService
        hrvpElectionPrepRequestService;


    Processor(ConsensusMetaManagingEnvironment _cConsensusMetaManagingEnvironment,
        io.github.onograph.cluster.raft.share.calg.resp.FollowerNodeConsensusMessenger.ElectionPrepReplyService _hrvpElectionPrepReplyService,
        io.github.onograph.cluster.raft.share.calg.resp.FollowerNodeConsensusMessenger.ElectionPrepRequestService _hrvpElectionPrepRequestService,
        Log _log) {
      this.ctxConsensusMetaManagingEnvironment = _cConsensusMetaManagingEnvironment;
      this.sttConsensusMetaProvider = _cConsensusMetaManagingEnvironment.getSaeConsensusMetaProvider();
      this.log = _log;
      this.oucebieConsensusResultService = ConsensusResultService.bulrConsensusResultService(
          ConsensusNodeType.CNT_NODE_FOLLOWER,
          _cConsensusMetaManagingEnvironment.getSaeConsensusMetaProvider());
      this.hrvpElectionPrepRequestService = _hrvpElectionPrepRequestService;
      this.hrvpElectionPrepReplyService = _hrvpElectionPrepReplyService;
    }

    @Override
    public ConsensusResultService process(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveNoReplyMessage _hatetAliveNoReplyMessage)
        throws IOException {
      Health.beaForCoCoCoLo(this.log, this.oucebieConsensusResultService, _hatetAliveNoReplyMessage,
          this.sttConsensusMetaProvider);
      return this.oucebieConsensusResultService;
    }

    @Override
    public ConsensusResultService process(
        ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask ask) throws IOException {
      AdderRole.haeanerretForCoCoCo(ask, this.oucebieConsensusResultService,
          this.sttConsensusMetaProvider);
      return this.oucebieConsensusResultService;
    }

    @Override
    public ConsensusResultService process(ConsensusMessageServiceMeta.CandidateVoteMessage.Ask ask)
        throws IOException {

      long _lgTe = Long.max(ask.getLgT(), this.sttConsensusMetaProvider.getElecTerm());

      ConsensusNodeId _fvConsensusNodeId = this.sttConsensusMetaProvider.voefoConsensusNodeId();
      if (_lgTe > this.sttConsensusMetaProvider.getElecTerm()) {
        this.oucebieConsensusResultService.setmConsensusResultService(_lgTe);
        _fvConsensusNodeId = null;
      }

      ElectionTallyRole.haevvcForCoCoCoLoCo(ask, this.oucebieConsensusResultService, _lgTe,
          this.log, this.sttConsensusMetaProvider,
          _fvConsensusNodeId);
      return this.oucebieConsensusResultService;
    }

    @Override
    public ConsensusResultService process(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RequestTransactionLogCZMetaMessage _lciRequestTransactionLogCZMetaMessage) {
      FollowerNodeConsensusMessenger._haelelccForCoCoCo(this.oucebieConsensusResultService,
          _lciRequestTransactionLogCZMetaMessage,
          this.sttConsensusMetaProvider);
      return this.oucebieConsensusResultService;
    }

    @Override
    public ConsensusResultService process(
        ConsensusMessageServiceMeta.CandidateVoteMessage.Reply reply) {

      return this.oucebieConsensusResultService;
    }

    @Override
    public ConsensusResultService process(
        ConsensusMessageServiceMeta.VotePreparationMessage.Ask ask) throws IOException {
      return this.hrvpElectionPrepRequestService.hadConsensusResultService(ask,
          this.sttConsensusMetaProvider, this.oucebieConsensusResultService,
          this.log);
    }

    @Override
    public ConsensusResultService process(
        ConsensusMessageServiceMeta.VotePreparationMessage.Reply reply)
        throws IOException {
      return this.hrvpElectionPrepReplyService.hadConsensusResultService(
          this.sttConsensusMetaProvider, this.oucebieConsensusResultService, this.log,
          reply);
    }

    @Override
    public ConsensusResultService process(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LogClipRequestMessage _rpLogClipRequestMessage) {
      ClipperRole.haepereForCoCo(this.oucebieConsensusResultService, _rpLogClipRequestMessage);
      return this.oucebieConsensusResultService;
    }

    @Override
    public ConsensusResultService process(
        ConsensusMessageServiceMeta.TransactionLogAddMessage.Reply reply) {
      return this.oucebieConsensusResultService;
    }

    @Override
    public ConsensusResultService process(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveReplyMessage _rhAliveReplyMessage) {
      return this.oucebieConsensusResultService;
    }

    @Override
    public ConsensusResultService process(
        ConsensusMessageServiceMeta.Timeoutable.ConsensusElectionTimeout consensusElectionTimeout)
        throws IOException {
      return FollowerNodeConsensusMessenger._haeettitConsensusResultService(
          this.oucebieConsensusResultService, this.ctxConsensusMetaManagingEnvironment,
          this.log);
    }

    @Override
    public ConsensusResultService process(
        ConsensusMessageServiceMeta.Timeoutable.AliveMsg aliveMsg) {
      return this.oucebieConsensusResultService;
    }

    @Override
    public ConsensusResultService process(ConsensusMessageServiceMeta.MsgCreatorService.Ask ask) {
      return this.oucebieConsensusResultService;
    }

    @Override
    public ConsensusResultService process(
        ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk bulkAsk) {
      return this.oucebieConsensusResultService;
    }

    @Override
    public ConsensusResultService process(
        ConsensusMessageServiceMeta.LeaderChangeService.AskToChange askToChange)
        throws IOException {
      FollowerNodeConsensusMessenger._haeleptsForCoCoCoLo(askToChange,
          this.oucebieConsensusResultService, this.ctxConsensusMetaManagingEnvironment,
          this.log);
      return this.oucebieConsensusResultService;
    }

    @Override
    public ConsensusResultService process(
        ConsensusMessageServiceMeta.LeaderChangeService.LeaderRec leaderRec)
        throws IOException {
      return this.process(new ConsensusMessageServiceMeta.LeaderChangeService.LeaderNotAccepted(
          this.sttConsensusMetaProvider.myeConsensusNodeId(),
          this.sttConsensusMetaProvider.comie(),
          this.sttConsensusMetaProvider.getElecTerm()));
    }

    @Override
    public ConsensusResultService process(
        ConsensusMessageServiceMeta.LeaderChangeService.LeaderNotAccepted leaderNotAccepted)
        throws IOException {
      return this.oucebieConsensusResultService.adlatrerenConsensusResultService(leaderNotAccepted);
    }

    @Override
    public ConsensusResultService process(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage _rsInfoReplyMessage)
        throws IOException {
      return this.oucebieConsensusResultService.sesaresConsensusResultService(_rsInfoReplyMessage);
    }
  }
}
