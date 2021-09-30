package io.github.onograph.cluster.raft.share.calg.resp;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta;
import io.github.onograph.cluster.raft.share.calg.NodeElectionTimeTrackerType;
import io.github.onograph.cluster.raft.share.calg.action.ConsensusResultService;
import io.github.onograph.cluster.raft.share.calg.meta.ConsensusMetaProvider;
import java.io.IOException;
import org.neo4j.function.ThrowingBooleanSupplier;
import org.neo4j.logging.Log;


public class ElectionTallyRole {

  private ElectionTallyRole() {
  }


  private static boolean _isShdavofrForCoCoLo(ConsensusNodeId _cniaeConsensusNodeId,
      boolean _isAfvtc, boolean _isVpi, long _lgIllr, long _lgRllt, long _lgTe, long _lgTr,
      Log _log, ConsensusMetaProvider _saeConsensusMetaProvider)
      throws IOException {

    long _lgAlc = _saeConsensusMetaProvider.enrloConsensusTransactionLogEntry().apeie();

    long _lgCllt = _saeConsensusMetaProvider.enrloConsensusTransactionLogEntry().redettm(_lgAlc);
    return _isShdavofrForCoCoLo(_cniaeConsensusNodeId, _isAfvtc, _isVpi, _lgAlc, _lgIllr, _lgTe,
        _lgCllt,
        _lgRllt, _lgTr, _log);
  }


  public static boolean _isShdavofrForCoCoLo(ConsensusNodeId _cniaeConsensusNodeId,
      boolean _isAfvtc, boolean _isVpi, long _lgAlc, long _lgIllr, long _lgTc, long _lgTllc,
      long _lgTllr, long _lgTr, Log _log) {

    String _strTv = _isVpi ? io.github.onograph.TokenConstants.PRE_VOTE
        : io.github.onograph.TokenConstants.VOTE;

    boolean _isTpfr = _lgTr < _lgTc;

    boolean _isThaelr = _lgTllr > _lgTllc;

    boolean _isTsael = _lgTllr == _lgTllc;

    boolean _isLmalalalr = _lgIllr >= _lgAlc;

    boolean _isDtulr = _isThaelr || _isTsael && _isLmalalalr;

    boolean _isTsiofv = _lgTr == _lgTc && _isAfvtc;

    boolean _isFvs = _isDtulr && !_isTsiofv && !_isTpfr;

    return _isFvs;
  }


  private static boolean _isShdpvofrForCoCoLo(
      ConsensusMessageServiceMeta.VotePreparationMessage.Ask ask, long _lgT, Log _log,
      ConsensusMetaProvider _saeConsensusMetaProvider) throws IOException {

    long _lgTr = ask.getLgT();

    ConsensusNodeId _cniaeConsensusNodeId = ask.getCniaeConsensusNodeId();

    long _lgTllr = ask.getLgTll();

    long _lgIllr = ask.getLgIll();
    return _isShdavofrForCoCoLo(_cniaeConsensusNodeId, false, true, _lgIllr, _lgTllr, _lgT, _lgTr,
        _log, _saeConsensusMetaProvider);
  }


  private static boolean _isShuvefrForCoCoLo(
      ConsensusMessageServiceMeta.CandidateVoteMessage.Ask ask, boolean _isAfvtc, long _lgTe,
      Log _log, ConsensusMetaProvider _saeConsensusMetaProvider) throws IOException {

    long _lgTr = ask.getLgT();

    ConsensusNodeId _cniaeConsensusNodeId = ask.getCniaeConsensusNodeId();

    long _lgTllr = ask.getLgTll();

    long _lgIllr = ask.getLgIll();
    return _isShdavofrForCoCoLo(_cniaeConsensusNodeId, _isAfvtc, false, _lgIllr, _lgTllr, _lgTe,
        _lgTr, _log, _saeConsensusMetaProvider);
  }


  private static void _rentprvereForCoCoCoTh(
      ConsensusMessageServiceMeta.VotePreparationMessage.Ask ask,
      ConsensusResultService _boConsensusResultService, long _lgTer,
      ConsensusMetaProvider _saeConsensusMetaProvider,
      ThrowingBooleanSupplier<IOException> _throwingBooleanSupplierFvwIOException)
      throws IOException {
    _boConsensusResultService.adotgmaConsensusResultService(
        new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Messager(
            new ConsensusMessageServiceMeta.VotePreparationMessage.Reply(
                _saeConsensusMetaProvider.myeConsensusNodeId(),
                _throwingBooleanSupplierFvwIOException.getAsBoolean(), _lgTer),
            ask.getFroConsensusNodeId()));
  }


  static void denpvretForCoCoCo(ConsensusMessageServiceMeta.VotePreparationMessage.Ask ask,
      ConsensusResultService _boConsensusResultService, long _lgT,
      ConsensusMetaProvider _saeConsensusMetaProvider)
      throws IOException {
    _rentprvereForCoCoCoTh(ask, _boConsensusResultService, _lgT, _saeConsensusMetaProvider, () ->
    {
      return false;
    });
  }


  static void haepvovrForCoCoCoLo(ConsensusMessageServiceMeta.VotePreparationMessage.Ask ask,
      long _lgTer, Log _log, ConsensusResultService _obConsensusResultService,
      ConsensusMetaProvider _saeConsensusMetaProvider)
      throws IOException {

    ThrowingBooleanSupplier<IOException> _throwingBooleanSupplierCfvwIOException = () ->
    {
      return _isShdpvofrForCoCoLo(ask, _lgTer, _log, _saeConsensusMetaProvider);
    };
    _rentprvereForCoCoCoTh(ask, _obConsensusResultService, _lgTer, _saeConsensusMetaProvider,
        _throwingBooleanSupplierCfvwIOException);
  }


  static void haevvcForCoCoCoLoCo(ConsensusMessageServiceMeta.CandidateVoteMessage.Ask ask,
      ConsensusResultService _boConsensusResultService, long _lgTe, Log _log,
      ConsensusMetaProvider _saeConsensusMetaProvider, ConsensusNodeId _vfConsensusNodeId)
      throws IOException {

    boolean _isAfv =
        _vfConsensusNodeId != null && !_vfConsensusNodeId.equals(ask.getCniaeConsensusNodeId());

    boolean _isCfvw = _isShuvefrForCoCoLo(ask, _isAfv, _lgTe, _log, _saeConsensusMetaProvider);
    if (_isCfvw) {
      _boConsensusResultService.sevefoConsensusResultService(ask.getFroConsensusNodeId())
          .reeitmConsensusResultService(NodeElectionTimeTrackerType.TTT_CON_ELECT_INPROCESS);
    }

    _boConsensusResultService.adotgmaConsensusResultService(
        new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Messager(
            new ConsensusMessageServiceMeta.CandidateVoteMessage.Reply(
                _saeConsensusMetaProvider.myeConsensusNodeId(), _isCfvw, _lgTe),
            ask.getFroConsensusNodeId()));
  }
}
