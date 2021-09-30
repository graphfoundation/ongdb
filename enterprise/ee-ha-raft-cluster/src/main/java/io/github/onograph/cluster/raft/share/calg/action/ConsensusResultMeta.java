package io.github.onograph.cluster.raft.share.calg.action;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta;
import io.github.onograph.cluster.raft.share.calg.NodeElectionTimeTrackerType;
import io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeFollowersMeta;
import io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeType;
import java.util.Collection;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.Set;


public class ConsensusResultMeta implements ResultMeta {


  private final Collection<AbstractTransactionLogProcessorAction> collectionCsAbstractTransactionLogProcessorAction;


  private final Collection<TransactionLogAction> collectionLcTransactionLogAction;


  private final Collection<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Messager> collectionMoMessager;


  private final ConsensusNodeFollowersMeta<ConsensusNodeId> consensusNodeFollowersMetaSfConsensusNodeId;


  private final ConsensusNodeId fvConsensusNodeId;


  private final boolean isIpe;


  private final boolean isLe;


  private final ConsensusNodeId laeConsensusNodeId;


  private final long ldrComLng;


  private final ConsensusMessageServiceMeta.LeaderChangeService.LeaderNotAccepted leaderNotAccepted;


  private final long lgIc;


  private final long lgLbwbill;


  private final long lgT;


  private final long lgTids;


  private final NodeElectionTimeTrackerType mteNodeElectionTimeTrackerType;


  private final ConsensusNodeType r;


  private final Set<ConsensusNodeId> setMfvConsensusNodeId;


  private final Set<ConsensusNodeId> setMfvpConsensusNodeId;


  private final Set<ConsensusNodeId> setRhConsensusNodeId;


  private final io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage srInfoReplyMessage;


  private final LeaderIndexWrapper srLeaderIndexWrapper;


  private final ConsensusNodeId tltConsensusNodeId;


  ConsensusResultMeta(Collection<TransactionLogAction> _collectionClTransactionLogAction,
      Collection<AbstractTransactionLogProcessorAction> _collectionCsAbstractTransactionLogProcessorAction,
      Collection<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Messager> _collectionMoMessager,
      ConsensusNodeFollowersMeta<ConsensusNodeId> _consensusNodeFollowersMetaSfConsensusNodeId,
      ConsensusNodeId _fvConsensusNodeId, boolean _isEpi, boolean _isLe,
      ConsensusNodeId _laeConsensusNodeId, long ldrComLng,
      ConsensusMessageServiceMeta.LeaderChangeService.LeaderNotAccepted leaderNotAccepted,
      long _lgIc, long _lgLbwbill, long _lgT, long _lgTids,
      NodeElectionTimeTrackerType _mteNodeElectionTimeTrackerType, ConsensusNodeType r,
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage _rsInfoReplyMessage,
      Set<ConsensusNodeId> _setHrConsensusNodeId, Set<ConsensusNodeId> _setMfvpConsensusNodeId,
      Set<ConsensusNodeId> _setVfmConsensusNodeId, LeaderIndexWrapper _srLeaderIndexWrapper,
      ConsensusNodeId _tltConsensusNodeId) {
    this.r = r;
    this.lgT = _lgT;
    this.laeConsensusNodeId = _laeConsensusNodeId;
    this.ldrComLng = ldrComLng;
    this.fvConsensusNodeId = _fvConsensusNodeId;
    this.setMfvConsensusNodeId = _setVfmConsensusNodeId;
    this.setMfvpConsensusNodeId = _setMfvpConsensusNodeId;
    this.lgLbwbill = _lgLbwbill;
    this.consensusNodeFollowersMetaSfConsensusNodeId = _consensusNodeFollowersMetaSfConsensusNodeId;
    this.mteNodeElectionTimeTrackerType = _mteNodeElectionTimeTrackerType;
    this.setRhConsensusNodeId = Set.copyOf(_setHrConsensusNodeId);
    this.collectionLcTransactionLogAction = _collectionClTransactionLogAction;
    this.collectionMoMessager = _collectionMoMessager;
    this.collectionCsAbstractTransactionLogProcessorAction = _collectionCsAbstractTransactionLogProcessorAction;
    this.lgIc = _lgIc;
    this.isIpe = _isEpi;
    this.lgTids = _lgTids;
    this.isLe = _isLe;
    this.srLeaderIndexWrapper = _srLeaderIndexWrapper;
    this.leaderNotAccepted = leaderNotAccepted;
    this.tltConsensusNodeId = _tltConsensusNodeId;
    this.srInfoReplyMessage = _rsInfoReplyMessage;
  }


  public Optional<NodeElectionTimeTrackerType> elitmcaOptional() {
    return Optional.ofNullable(this.mteNodeElectionTimeTrackerType);
  }

  @Override
  public boolean equals(Object _obOjc) {
    if (this == _obOjc) {
      return true;
    } else if (_obOjc != null && this.getClass() == _obOjc.getClass()) {

      ConsensusResultMeta reslt = (ConsensusResultMeta) _obOjc;
      return this.lgT == reslt.lgT && this.ldrComLng == reslt.ldrComLng && this.lgIc == reslt.lgIc
          &&
          this.mteNodeElectionTimeTrackerType == reslt.mteNodeElectionTimeTrackerType
          && this.isIpe == reslt.isIpe &&
          this.lgLbwbill == reslt.lgLbwbill && this.isLe == reslt.isLe &&
          this.lgTids == reslt.lgTids && this.r == reslt.r && Objects.equals(
          this.laeConsensusNodeId, reslt.laeConsensusNodeId) &&
          Objects.equals(this.collectionLcTransactionLogAction,
              reslt.collectionLcTransactionLogAction) &&
          Objects.equals(this.collectionMoMessager, reslt.collectionMoMessager) &&
          Objects.equals(this.fvConsensusNodeId, reslt.fvConsensusNodeId) &&
          Objects.equals(this.srLeaderIndexWrapper, reslt.srLeaderIndexWrapper) &&
          Objects.equals(this.setMfvpConsensusNodeId, reslt.setMfvpConsensusNodeId) &&
          Objects.equals(this.setMfvConsensusNodeId, reslt.setMfvConsensusNodeId) &&
          Objects.equals(this.consensusNodeFollowersMetaSfConsensusNodeId,
              reslt.consensusNodeFollowersMetaSfConsensusNodeId) &&
          Objects.equals(this.collectionCsAbstractTransactionLogProcessorAction,
              reslt.collectionCsAbstractTransactionLogProcessorAction) &&
          Objects.equals(this.leaderNotAccepted, reslt.leaderNotAccepted) &&
          Objects.equals(this.setRhConsensusNodeId, reslt.setRhConsensusNodeId) &&
          Objects.equals(this.tltConsensusNodeId, reslt.tltConsensusNodeId) &&
          Objects.equals(this.srInfoReplyMessage, reslt.srInfoReplyMessage);
    } else {
      return false;
    }
  }

  @Override
  public long gecmie() {
    return this.lgIc;
  }


  public Optional<ConsensusMessageServiceMeta.LeaderChangeService.LeaderNotAccepted> gelatrerenOptional() {
    return Optional.ofNullable(this.leaderNotAccepted);
  }


  public Optional<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage> gesaresOptional() {
    return Optional.ofNullable(this.srInfoReplyMessage);
  }


  public Collection<AbstractTransactionLogProcessorAction> getCollectionCsAbstractTransactionLogProcessorAction() {
    return this.collectionCsAbstractTransactionLogProcessorAction;
  }


  public Collection<TransactionLogAction> getCollectionLcTransactionLogAction() {
    return this.collectionLcTransactionLogAction;
  }


  public Collection<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Messager> getCollectionMoMessager() {
    return this.collectionMoMessager;
  }


  public ConsensusNodeFollowersMeta<ConsensusNodeId> getConsensusNodeFollowersMetaSfConsensusNodeId() {
    return this.consensusNodeFollowersMetaSfConsensusNodeId;
  }


  public ConsensusNodeType getConsensusNodeTypeForR() {
    return this.r;
  }


  public ConsensusNodeId getFvConsensusNodeId() {
    return this.fvConsensusNodeId;
  }


  public boolean getIsIpe() {
    return this.isIpe;
  }


  public boolean getIsLe() {
    return this.isLe;
  }


  public ConsensusNodeId getLaeConsensusNodeId() {
    return this.laeConsensusNodeId;
  }


  public long getLdrComLng() {
    return this.ldrComLng;
  }


  public long getLgLbwbill() {
    return this.lgLbwbill;
  }


  public long getLgT() {
    return this.lgT;
  }


  public Set<ConsensusNodeId> getSetMfvConsensusNodeId() {
    return this.setMfvConsensusNodeId;
  }


  public Set<ConsensusNodeId> getSetMfvpConsensusNodeId() {
    return this.setMfvpConsensusNodeId;
  }


  public Set<ConsensusNodeId> getSetRhConsensusNodeId() {
    return this.setRhConsensusNodeId;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.r, this.lgT, this.laeConsensusNodeId, this.ldrComLng,
        this.collectionLcTransactionLogAction, this.collectionMoMessager,
        this.lgIc,
        this.fvConsensusNodeId, this.mteNodeElectionTimeTrackerType, this.srLeaderIndexWrapper,
        this.isIpe, this.setMfvpConsensusNodeId,
        this.setMfvConsensusNodeId, this.lgLbwbill,
        this.consensusNodeFollowersMetaSfConsensusNodeId,
        this.collectionCsAbstractTransactionLogProcessorAction, this.isLe,
        this.lgTids, this.setRhConsensusNodeId, this.leaderNotAccepted, this.tltConsensusNodeId,
        this.srInfoReplyMessage);
  }


  public boolean isStpgdw() {
    return this.lgTids != -1L;
  }

  @Override
  public Optional<LeaderIndexWrapper> snhrqmOptional() {
    return Optional.ofNullable(this.srLeaderIndexWrapper);
  }


  public OptionalLong stpdwteOptionalLong() {
    return this.isStpgdw() ? OptionalLong.of(this.lgTids) : OptionalLong.empty();
  }


  public Optional<ConsensusNodeId> trfnlditOptional() {
    return Optional.ofNullable(this.tltConsensusNodeId);
  }


}
