package io.github.onograph.cluster.raft.share.calg.action;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta;
import io.github.onograph.cluster.raft.share.calg.NodeElectionTimeTrackerType;
import io.github.onograph.cluster.raft.share.calg.meta.ConsensusMetaProvider;
import io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeFollowersMeta;
import io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import org.neo4j.util.VisibleForTesting;


public class ConsensusResultService {


  private final Collection<TransactionLogAction> collectionClTransactionLogAction = new ArrayList();


  private final Collection<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Messager> collectionMoMessager = new ArrayList();


  private final Collection<AbstractTransactionLogProcessorAction> collectionScAbstractTransactionLogProcessorAction = new ArrayList();


  private final Set<ConsensusNodeId> setRhConsensusNodeId;


  private ConsensusNodeFollowersMeta<ConsensusNodeId> consensusNodeFollowersMetaFsConsensusNodeId;


  private ConsensusNodeId fvConsensusNodeId;


  private boolean isEpi;


  private boolean isLe;


  private ConsensusNodeId laeConsensusNodeId;


  private long ldrComLng;


  private ConsensusMessageServiceMeta.LeaderChangeService.LeaderNotAccepted leaderNotAccepted;


  private long lgIc;


  private long lgLbwbill;


  private long lgT;


  private long lgTids;


  private NodeElectionTimeTrackerType mteNodeElectionTimeTrackerType;


  private ConsensusNodeType r;


  private io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage rsInfoReplyMessage;


  private Set<ConsensusNodeId> setMfvpConsensusNodeId;


  private Set<ConsensusNodeId> setVfmConsensusNodeId;


  private LeaderIndexWrapper srLeaderIndexWrapper;


  private ConsensusNodeId ttConsensusNodeId;


  @VisibleForTesting
  ConsensusResultService(
      ConsensusNodeFollowersMeta<ConsensusNodeId> _consensusNodeFollowersMetaSfConsensusNodeId,
      ConsensusNodeId _fvConsensusNodeId, boolean _isEpi, ConsensusNodeId _laeConsensusNodeId,
      long ldrComLng, long _lgIc, long _lgLbwbill, long _lgTer, long _lgTids,
      NodeElectionTimeTrackerType _mteNodeElectionTimeTrackerType,
      ConsensusNodeType _rcConsensusNodeType, Set<ConsensusNodeId> _setMfvConsensusNodeId,
      Set<ConsensusNodeId> _setMfvpConsensusNodeId, Set<ConsensusNodeId> _setRhConsensusNodeId) {
    this.consensusNodeFollowersMetaFsConsensusNodeId = _consensusNodeFollowersMetaSfConsensusNodeId;
    this.fvConsensusNodeId = _fvConsensusNodeId;
    this.isEpi = _isEpi;
    this.laeConsensusNodeId = _laeConsensusNodeId;
    this.ldrComLng = ldrComLng;
    this.lgIc = _lgIc;
    this.lgLbwbill = _lgLbwbill;
    this.lgT = _lgTer;
    this.lgTids = _lgTids;
    this.mteNodeElectionTimeTrackerType = _mteNodeElectionTimeTrackerType;
    this.r = _rcConsensusNodeType;
    this.setMfvpConsensusNodeId = _setMfvpConsensusNodeId;
    this.setRhConsensusNodeId = _setRhConsensusNodeId;
    this.setVfmConsensusNodeId = _setMfvConsensusNodeId;
  }


  public static ConsensusResultService bulrConsensusResultService(
      ConsensusNodeType _rcConsensusNodeType, ConsensusMetaProvider _saeConsensusMetaProvider) {

    boolean _isEpi = _rcConsensusNodeType == ConsensusNodeType.CNT_NODE_FOLLOWER
        && _saeConsensusMetaProvider.isPreltn();

    Set<ConsensusNodeId> _setPvfmConsensusNodeId =
        _isEpi ? new HashSet(_saeConsensusMetaProvider.prvefomeSet()) : Collections.emptySet();

    Set<ConsensusNodeId> _setMfvConsensusNodeId =
        _rcConsensusNodeType == ConsensusNodeType.CNT_NODE_POT ? new HashSet(
            _saeConsensusMetaProvider.voefomeSet()) : Collections.emptySet();

    Set<ConsensusNodeId> _setHrConsensusNodeId =
        _rcConsensusNodeType == ConsensusNodeType.CNT_NODE_LEADER ? new HashSet(
            _saeConsensusMetaProvider.hebresSet()) : Collections.emptySet();

    long _lgLbwbill = _rcConsensusNodeType == ConsensusNodeType.CNT_NODE_LEADER
        ? _saeConsensusMetaProvider.laloiebowbele() : -1L;

    ConsensusNodeFollowersMeta<ConsensusNodeId> _consensusNodeFollowersMetaSfConsensusNodeId =
        _rcConsensusNodeType == ConsensusNodeType.CNT_NODE_LEADER
            ? _saeConsensusMetaProvider.folesteConsensusNodeFollowersMeta()
            : new ConsensusNodeFollowersMeta();
    return new ConsensusResultService(_consensusNodeFollowersMetaSfConsensusNodeId,
        _saeConsensusMetaProvider.voefoConsensusNodeId(), _isEpi,
        _saeConsensusMetaProvider.ledConsensusNodeId(), _saeConsensusMetaProvider.ledcm(),
        _saeConsensusMetaProvider.comie(), _lgLbwbill, _saeConsensusMetaProvider.getElecTerm(),
        -1L, null, _rcConsensusNodeType, _setMfvConsensusNodeId, _setPvfmConsensusNodeId,
        _setHrConsensusNodeId);
  }


  public ConsensusResultService adhaarpConsensusResultService(ConsensusNodeId _fConsensusNodeId) {
    this.setRhConsensusNodeId.add(_fConsensusNodeId);
    return this;
  }


  public ConsensusResultService adlatrerenConsensusResultService(
      ConsensusMessageServiceMeta.LeaderChangeService.LeaderNotAccepted leaderNotAccepted) {
    this.leaderNotAccepted = leaderNotAccepted;
    return this;
  }


  public ConsensusResultService adlcmdConsensusResultService(
      TransactionLogAction _clTransactionLogAction) {
    this.collectionClTransactionLogAction.add(_clTransactionLogAction);
    return this;
  }


  public ConsensusResultService adotgmaConsensusResultService(
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Messager m) {
    this.collectionMoMessager.add(m);
    return this;
  }


  public ConsensusResultService adspcmnConsensusResultService(
      AbstractTransactionLogProcessorAction _csAbstractTransactionLogProcessorAction) {
    this.collectionScAbstractTransactionLogProcessorAction.add(
        _csAbstractTransactionLogProcessorAction);
    return this;
  }


  public ConsensusResultMeta bulConsensusResultMeta() {
    return new ConsensusResultMeta(this.collectionClTransactionLogAction,
        this.collectionScAbstractTransactionLogProcessorAction, this.collectionMoMessager,
        this.consensusNodeFollowersMetaFsConsensusNodeId, this.fvConsensusNodeId, this.isEpi,
        this.isLe,
        this.laeConsensusNodeId, this.ldrComLng, this.leaderNotAccepted, this.lgIc,
        this.lgLbwbill, this.lgT, this.lgTids, this.mteNodeElectionTimeTrackerType, this.r,
        this.rsInfoReplyMessage,
        this.setRhConsensusNodeId, this.setMfvpConsensusNodeId, this.setVfmConsensusNodeId,
        this.srLeaderIndexWrapper, this.ttConsensusNodeId);
  }


  public ConsensusResultService clhbresConsensusResultService() {
    this.setRhConsensusNodeId.clear();
    return this;
  }


  public ConsensusResultService elcdlarConsensusResultService() {
    assert this.lgTids == -1L;

    this.isLe = true;
    return this;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      ConsensusResultService reslt = (ConsensusResultService) obj;
      return this.lgT == reslt.lgT && this.ldrComLng == reslt.ldrComLng && this.lgIc == reslt.lgIc
          &&
          this.mteNodeElectionTimeTrackerType == reslt.mteNodeElectionTimeTrackerType &&
          Objects.equals(this.srLeaderIndexWrapper, reslt.srLeaderIndexWrapper) &&
          this.isEpi == reslt.isEpi && this.lgLbwbill == reslt.lgLbwbill &&
          this.isLe == reslt.isLe && this.r == reslt.r &&
          Objects.equals(this.lgTids, reslt.lgTids) && Objects.equals(this.laeConsensusNodeId,
          reslt.laeConsensusNodeId) &&
          Objects.equals(this.collectionClTransactionLogAction,
              reslt.collectionClTransactionLogAction) &&
          Objects.equals(this.collectionMoMessager, reslt.collectionMoMessager) &&
          Objects.equals(this.fvConsensusNodeId, reslt.fvConsensusNodeId) &&
          Objects.equals(this.setMfvpConsensusNodeId, reslt.setMfvpConsensusNodeId) &&
          Objects.equals(this.setVfmConsensusNodeId, reslt.setVfmConsensusNodeId) &&
          Objects.equals(this.consensusNodeFollowersMetaFsConsensusNodeId,
              reslt.consensusNodeFollowersMetaFsConsensusNodeId) &&
          Objects.equals(this.collectionScAbstractTransactionLogProcessorAction,
              reslt.collectionScAbstractTransactionLogProcessorAction) &&
          Objects.equals(this.setRhConsensusNodeId, reslt.setRhConsensusNodeId) &&
          Objects.equals(this.ttConsensusNodeId, reslt.ttConsensusNodeId) &&
          Objects.equals(this.leaderNotAccepted, reslt.leaderNotAccepted) &&
          Objects.equals(this.rsInfoReplyMessage, reslt.rsInfoReplyMessage);
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.r, this.lgT, this.laeConsensusNodeId, this.ldrComLng,
        this.collectionClTransactionLogAction, this.collectionMoMessager,
        this.lgIc,
        this.fvConsensusNodeId, this.mteNodeElectionTimeTrackerType, this.srLeaderIndexWrapper,
        this.isEpi, this.setMfvpConsensusNodeId,
        this.setVfmConsensusNodeId, this.lgLbwbill,
        this.consensusNodeFollowersMetaFsConsensusNodeId,
        this.collectionScAbstractTransactionLogProcessorAction, this.isLe,
        this.lgTids, this.setRhConsensusNodeId, this.ttConsensusNodeId, this.leaderNotAccepted,
        this.rsInfoReplyMessage);
  }


  public ConsensusResultService manefrfhssConsensusResultService(long _lgIal, long _lgLpi) {
    this.srLeaderIndexWrapper = new LeaderIndexWrapper(_lgIal, _lgLpi);
    return this;
  }


  public ConsensusResultService recflssConsensusResultService(
      ConsensusNodeFollowersMeta<ConsensusNodeId> _consensusNodeFollowersMetaSfConsensusNodeId) {
    this.consensusNodeFollowersMetaFsConsensusNodeId = _consensusNodeFollowersMetaSfConsensusNodeId;
    return this;
  }


  public ConsensusResultService reeitmConsensusResultService(
      NodeElectionTimeTrackerType _mteNodeElectionTimeTrackerType) {
    this.mteNodeElectionTimeTrackerType = _mteNodeElectionTimeTrackerType;
    return this;
  }


  public ConsensusResultService secmieConsensusResultService(long _lgCi) {
    this.lgIc = _lgCi;
    return this;
  }


  public ConsensusResultService selacoConsensusResultService(long ldrComLng) {
    this.ldrComLng = ldrComLng;
    return this;
  }


  public ConsensusResultService seldConsensusResultService(ConsensusNodeId _laeConsensusNodeId) {
    this.laeConsensusNodeId = _laeConsensusNodeId;
    return this;
  }


  public ConsensusResultService selslibewbcleConsensusResultService(long _lgLbwbill) {
    this.lgLbwbill = _lgLbwbill;
    return this;
  }


  public ConsensusResultService sepecoConsensusResultService(boolean _isEpi) {
    this.isEpi = _isEpi;
    return this;
  }


  public ConsensusResultService sepevsfmeConsensusResultService(
      Set<ConsensusNodeId> _setVpConsensusNodeId) {
    this.setMfvpConsensusNodeId = _setVpConsensusNodeId;
    return this;
  }


  public ConsensusResultService sereConsensusResultService(ConsensusNodeType r) {
    this.r = r;
    return this;
  }


  public ConsensusResultService sesaresConsensusResultService(
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage _rsInfoReplyMessage) {
    this.rsInfoReplyMessage = _rsInfoReplyMessage;
    return this;
  }


  public ConsensusResultService setmConsensusResultService(long _lgTn) {
    this.lgT = _lgTn;
    return this;
  }


  public ConsensusResultService sevefoConsensusResultService(ConsensusNodeId _fvConsensusNodeId) {
    this.fvConsensusNodeId = _fvConsensusNodeId;
    return this;
  }


  public ConsensusResultService sevefomeConsensusResultService(
      Set<ConsensusNodeId> _setVtsConsensusNodeId) {
    this.setVfmConsensusNodeId = _setVtsConsensusNodeId;
    return this;
  }


  public ConsensusResultService stpndoConsensusResultService(long _lgTds) {
    assert !this.isLe;

    this.lgTids = _lgTds;
    return this;
  }


  public ConsensusResultService sttfnldiConsensusResultService(
      ConsensusNodeId _pooeConsensusNodeId) {
    this.ttConsensusNodeId = _pooeConsensusNodeId;
    return this;
  }


}
