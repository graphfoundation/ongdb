package io.github.onograph.cluster.raft.share.calg.meta;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.share.calg.CandidateTallyMeta;
import io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta;
import io.github.onograph.cluster.raft.share.calg.action.ConsensusResultMeta;
import io.github.onograph.cluster.raft.share.calg.action.TransactionLogAction;
import io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLog;
import io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLogEntry;
import io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheService;
import io.github.onograph.cluster.raft.share.calg.mnode.MemberNodes;
import io.github.onograph.cluster.raft.share.calg.nltof.TransferCollection;
import io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeFollowersMeta;
import io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeType;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import org.neo4j.function.Suppliers.Lazy;
import org.neo4j.io.state.StateStorage;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


public class ConsensusMeta implements ConsensusMetaProvider {


  private final ConsensusLogCacheService cfiConsensusLogCacheService;


  private final Lazy<ConsensusNodeId> lazyMslConsensusNodeId;


  private final ConsensusTransactionLog leConsensusTransactionLog;


  private final Log log;


  private final MemberNodes mmesiMemberNodes;


  private final StateStorage<CandidateTermMeta> stateStorageStCandidateTermMeta;


  private final StateStorage<CandidateTallyMeta> stateStorageSvCandidateTallyMeta;


  private final TransferCollection<ConsensusNodeId> transferCollectionTlConsensusNodeId;


  private ConsensusNodeFollowersMeta<ConsensusNodeId> consensusNodeFollowersMetaSfConsensusNodeId;


  private NodeServerMemberLeaderMeta ilNodeServerMemberLeaderMeta;


  private boolean isEpi;


  private boolean isSt;


  private ConsensusNodeId laeConsensusNodeId;


  private long ldrComLng;


  private long lgIc;


  private long lgLbwbill;


  private Set<ConsensusNodeId> setMfvConsensusNodeId;


  private Set<ConsensusNodeId> setMfvpConsensusNodeId;


  private Set<ConsensusNodeId> setRhConsensusNodeId;


  private CandidateTermMeta stCandidateTermMeta;


  private CandidateTallyMeta svCandidateTallyMeta;


  public ConsensusMeta(ConsensusLogCacheService _cfiConsensusLogCacheService,
      Lazy<ConsensusNodeId> _lazyMslConsensusNodeId,
      ConsensusTransactionLog _leConsensusTransactionLog, LogProvider _logProvider,
      MemberNodes _mmesiMemberNodes,
      StateStorage<CandidateTermMeta> _stateStorageStCandidateTermMeta,
      StateStorage<CandidateTallyMeta> _stateStorageSvCandidateTallyMeta,
      TransferCollection<ConsensusNodeId> _transferCollectionTlConsensusNodeId) {
    this.ilNodeServerMemberLeaderMeta = NodeServerMemberLeaderMeta.INTL_NODE_SERVER_MEMBER_LEADER_META;
    this.setMfvConsensusNodeId = new HashSet();
    this.setMfvpConsensusNodeId = new HashSet();
    this.setRhConsensusNodeId = new HashSet();
    this.consensusNodeFollowersMetaSfConsensusNodeId = new ConsensusNodeFollowersMeta();
    this.ldrComLng = -1L;
    this.lgIc = -1L;
    this.lgLbwbill = -1L;
    this.lazyMslConsensusNodeId = _lazyMslConsensusNodeId;
    this.stateStorageStCandidateTermMeta = _stateStorageStCandidateTermMeta;
    this.stateStorageSvCandidateTallyMeta = _stateStorageSvCandidateTallyMeta;
    this.mmesiMemberNodes = _mmesiMemberNodes;
    this.leConsensusTransactionLog = _leConsensusTransactionLog;
    this.cfiConsensusLogCacheService = _cfiConsensusLogCacheService;
    this.log = _logProvider.getLog(this.getClass());
    this.transferCollectionTlConsensusNodeId = _transferCollectionTlConsensusNodeId;
  }


  private void _loilrcgForCo(ConsensusNodeId _laeConsensusNodeId) {
    if (this.laeConsensusNodeId == null) {
      if (_laeConsensusNodeId != null) {

      }
    } else {
      if (!this.laeConsensusNodeId.equals(_laeConsensusNodeId)) {

      }
    }
  }


  private CandidateTermMeta _temsaCandidateTermMeta() {
    if (this.stCandidateTermMeta == null) {
      this.stCandidateTermMeta = this.stateStorageStCandidateTermMeta.getInitialState();
    }

    return this.stCandidateTermMeta;
  }


  private CandidateTallyMeta _voesaCandidateTallyMeta() {
    if (this.svCandidateTallyMeta == null) {
      this.svCandidateTallyMeta = this.stateStorageSvCandidateTallyMeta.getInitialState();
    }

    return this.svCandidateTallyMeta;
  }

  @Override
  public long comie() {
    return this.lgIc;
  }


  public ConsensusMetaInfo copConsensusMetaInfo() {
    return new io.github.onograph.cluster.raft.share.calg.meta.ConsensusMeta.ConsensusMetaInfoImpl(
        this.ledcm(),
        this.enrloConsensusTransactionLogEntry().apeie(),
        this.comie(), this.laloiebowbele(),
        this.getElecTerm(), this.voimbsSet());
  }

  @Override
  public ConsensusTransactionLogEntry enrloConsensusTransactionLogEntry() {
    return this.leConsensusTransactionLog;
  }

  @Override
  public ConsensusNodeFollowersMeta<ConsensusNodeId> folesteConsensusNodeFollowersMeta() {
    return this.consensusNodeFollowersMetaSfConsensusNodeId;
  }

  @Override
  public long getElecTerm() {
    return this._temsaCandidateTermMeta().getLgT();
  }

  @Override
  public Set<ConsensusNodeId> hebresSet() {
    return this.setRhConsensusNodeId;
  }

  @Override
  public boolean isArtarlr() {
    return this.transferCollectionTlConsensusNodeId.isNoet();
  }

  @Override
  public boolean isArtmstd() {
    return this.isSt;
  }

  @Override
  public boolean isPreltn() {
    return this.isEpi;
  }

  @Override
  public long laloiebowbele() {
    return this.lgLbwbill;
  }

  @Override
  public ConsensusNodeId ledConsensusNodeId() {
    return this.laeConsensusNodeId;
  }

  @Override
  public long ledcm() {
    return this.ldrComLng;
  }

  @Override
  public NodeServerMemberLeaderMeta ledioNodeServerMemberLeaderMeta() {
    return this.ilNodeServerMemberLeaderMeta;
  }

  @Override
  public ConsensusNodeId myeConsensusNodeId() {
    return this.lazyMslConsensusNodeId.get();
  }

  @Override
  public Set<ConsensusNodeId> prvefomeSet() {
    return this.setMfvpConsensusNodeId;
  }

  @Override
  public Set<ConsensusNodeId> recnmeSet() {
    return this.mmesiMemberNodes.recnmeSet();
  }


  public void setmstd() {
    this.isSt = true;
  }


  public void upaForCo(ConsensusResultMeta reslt) throws IOException {
    if (this._temsaCandidateTermMeta().isUpa(reslt.getLgT())) {
      this.stateStorageStCandidateTermMeta.writeState(this._temsaCandidateTermMeta());
    }

    if (this._voesaCandidateTallyMeta().isUpaForCo(reslt.getFvConsensusNodeId(), reslt.getLgT())) {
      this.stateStorageSvCandidateTallyMeta.writeState(this._voesaCandidateTallyMeta());
    }

    this._loilrcgForCo(reslt.getLaeConsensusNodeId());
    this.laeConsensusNodeId = reslt.getLaeConsensusNodeId();
    this.ilNodeServerMemberLeaderMeta = new NodeServerMemberLeaderMeta(
        reslt.getLaeConsensusNodeId(), reslt.getLgT());
    this.ldrComLng = reslt.getLdrComLng();
    this.setMfvConsensusNodeId = reslt.getSetMfvConsensusNodeId();
    this.setMfvpConsensusNodeId = reslt.getSetMfvpConsensusNodeId();
    this.setRhConsensusNodeId = reslt.getSetRhConsensusNodeId();
    this.lgLbwbill = reslt.getLgLbwbill();
    this.consensusNodeFollowersMetaSfConsensusNodeId = reslt.getConsensusNodeFollowersMetaSfConsensusNodeId();
    this.isEpi = reslt.getIsIpe();
    if (reslt.getConsensusNodeTypeForR() != ConsensusNodeType.CNT_NODE_LEADER) {
      this.transferCollectionTlConsensusNodeId.cla();
    } else {

      Optional _optional = reslt.trfnlditOptional();

      TransferCollection _transferCollection = this.transferCollectionTlConsensusNodeId;
      Objects.requireNonNull(_transferCollection);
      _optional.ifPresent(_transferCollection::addForT);
      reslt.gelatrerenOptional().ifPresent((rejection) ->
      {
        this.transferCollectionTlConsensusNodeId.reoForT(rejection.getFroConsensusNodeId());
      });
    }

    Iterator _iterator = reslt.getCollectionLcTransactionLogAction().iterator();

    while (_iterator.hasNext()) {

      TransactionLogAction _clTransactionLogAction = (TransactionLogAction) _iterator.next();
      _clTransactionLogAction.apltoForCoLo(this.leConsensusTransactionLog, this.log);
      _clTransactionLogAction.apltoForCoLo(this.cfiConsensusLogCacheService, this.log);
    }

    this.lgIc = reslt.gecmie();
  }

  @Override
  public ConsensusNodeId voefoConsensusNodeId() {
    return this._voesaCandidateTallyMeta().getFvConsensusNodeId();
  }

  @Override
  public Set<ConsensusNodeId> voefomeSet() {
    return this.setMfvConsensusNodeId;
  }

  @Override
  public Set<ConsensusNodeId> voimbsSet() {
    return this.mmesiMemberNodes.voimbsSet();
  }


  private static class ConsensusMetaInfoImpl implements ConsensusMetaInfo {

    final long apeie;

    final long ldrComLng;

    final long lgIc;

    final long lgLbwbill;

    final Set<ConsensusNodeId> setVoimbsConsensusNodeId;

    final long ter;


    private ConsensusMetaInfoImpl(long ldrComLng, long _lgIa, long _lgIc, long _lgLbwbill,
        long _lgT, Set<ConsensusNodeId> _setMvConsensusNodeId) {
      this.apeie = _lgIa;
      this.ldrComLng = ldrComLng;
      this.lgIc = _lgIc;
      this.lgLbwbill = _lgLbwbill;
      this.setVoimbsConsensusNodeId = _setMvConsensusNodeId;
      this.ter = _lgT;
    }

    @Override
    public long apeie() {
      return this.apeie;
    }

    @Override
    public long comie() {
      return this.lgIc;
    }

    @Override
    public long getElecTerm() {
      return this.ter;
    }

    @Override
    public long getPrevIdxFromLeco() {
      return this.lgLbwbill;
    }

    @Override
    public Set<ConsensusNodeId> getVoters() {
      return this.setVoimbsConsensusNodeId;
    }

    @Override
    public long ledcm() {
      return this.ldrComLng;
    }
  }
}
