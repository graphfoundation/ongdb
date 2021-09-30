package io.github.onograph.cluster.raft.share.calg.mnode;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.share.calg.action.TransactionLogAction;
import io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry;
import io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntryRawCursor;
import io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLogEntry;
import io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeFollowersMeta;
import io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeType;
import io.github.onograph.cluster.raft.share.sync.SyncToManager;
import java.io.IOException;
import java.time.Clock;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.LongSupplier;
import org.neo4j.function.Suppliers.Lazy;
import org.neo4j.internal.helpers.collection.Iterables;
import org.neo4j.io.state.StateStorage;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


public class MemberNodesService extends LifecycleAdapter
    implements MemberNodes,
    io.github.onograph.cluster.raft.share.calg.action.TransactionLogAction.TransactionLogActions {


  private final ConsensusNodesKeeper cmConsensusNodesKeeper;


  private final io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodes.ConsensusNodesFactory<ConsensusNodeId>
      consensusNodesFactoryMsbConsensusNodeId;


  private final int iSgcm;


  private final Lazy<ConsensusNodeId> lazyMslConsensusNodeId;


  private final Log log;


  private final ConsensusTransactionLogEntry lrConsensusTransactionLogEntry;


  private final SyncToManager mtsSyncToManager;


  private final Set<io.github.onograph.cluster.raft.share.calg.mnode.MemberNodes.MemberNodeEventListener> setLseesMemberNodeEventListener =
      new HashSet();


  private final Set<ConsensusNodeId> setMraConsensusNodeId = new HashSet();


  private final StateStorage<NodeServerMemberTransactionLogDataMeta> stateStorageSoaeNodeServerMemberTransactionLogDataMeta;


  private NodeServerMemberTransactionLogDataMeta saeNodeServerMemberTransactionLogDataMeta;


  private volatile Set<ConsensusNodeId> setMrConsensusNodeId = Collections.unmodifiableSet(
      new HashSet());


  private Set<ConsensusNodeId> setMtConsensusNodeId;


  private volatile Set<ConsensusNodeId> setMvConsensusNodeId = Collections.unmodifiableSet(
      new HashSet());


  private LongSupplier sifrLongSupplier;


  public MemberNodesService(Clock _clock,
      io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodes.ConsensusNodesFactory<ConsensusNodeId> _consensusNodesFactoryBsmConsensusNodeId,
      int _iSgcm, Lazy<ConsensusNodeId> _lazyMslConsensusNodeId, long _lgTc, long _lgTlc,
      LogProvider _logProvider, ConsensusTransactionLogEntry _lrConsensusTransactionLogEntry,
      SyncToManager _mtsSyncToManager,
      StateStorage<NodeServerMemberTransactionLogDataMeta> _stateStorageSmNodeServerMemberTransactionLogDataMeta) {
    this.mtsSyncToManager = _mtsSyncToManager;
    this.lazyMslConsensusNodeId = _lazyMslConsensusNodeId;
    this.consensusNodesFactoryMsbConsensusNodeId = _consensusNodesFactoryBsmConsensusNodeId;
    this.lrConsensusTransactionLogEntry = _lrConsensusTransactionLogEntry;
    this.iSgcm = _iSgcm;
    this.stateStorageSoaeNodeServerMemberTransactionLogDataMeta = _stateStorageSmNodeServerMemberTransactionLogDataMeta;
    this.log = _logProvider.getLog(this.getClass());
    this.cmConsensusNodesKeeper = new ConsensusNodesKeeper(_clock, _lgTlc, _lgTc, _logProvider,
        _lrConsensusTransactionLogEntry, this);
  }


  private void _chfsacno() {
    if (this._mgmmrSet().size() > 0) {
      this.cmConsensusNodesKeeper.onmsmeForCo(Iterables.first(this._mgmmrSet()));
    } else if (this._sufsmeSet().size() > 0 && this._isSetrmme()) {
      this.cmConsensusNodesKeeper.onseommForCo(Iterables.first(this._sufsmeSet()));
    }
  }


  private boolean _isSetrmme() {

    Set<ConsensusNodeId> _setMvConsensusNodeId = this.voimbsSet();

    boolean _isMrts = _setMvConsensusNodeId != null && _setMvConsensusNodeId.size() > this.iSgcm;
    if (!_isMrts) {

      Set<ConsensusNodeId> _setRtmConsensusNodeId = this._sufsmeSet();


    }

    return _isMrts;
  }


  private Set<ConsensusNodeId> _mgmmrSet() {
    if (this.setMtConsensusNodeId != null && this.voimbsSet() != null) {

      Set<ConsensusNodeId> _setMmConsensusNodeId = new HashSet(this.setMtConsensusNodeId);
      _setMmConsensusNodeId.removeAll(this.voimbsSet());
      return _setMmConsensusNodeId;
    } else {
      return Collections.emptySet();
    }
  }


  private Set<ConsensusNodeId> _sufsmeSet() {
    if (this.setMtConsensusNodeId != null && this.voimbsSet() != null) {

      Set<ConsensusNodeId> _setMsConsensusNodeId = new HashSet(this.voimbsSet());
      _setMsConsensusNodeId.removeAll(this.setMtConsensusNodeId);
      _setMsConsensusNodeId.remove(this.lazyMslConsensusNodeId.getIfPresent());
      return _setMsConsensusNodeId;
    } else {
      return Collections.emptySet();
    }
  }


  private void _upemess() {
    this.setMvConsensusNodeId = Collections.unmodifiableSet(
        this.saeNodeServerMemberTransactionLogDataMeta.geleSet());

    HashSet<ConsensusNodeId> _hashSetMrnConsensusNodeId = new HashSet(this.setMvConsensusNodeId);
    _hashSetMrnConsensusNodeId.addAll(this.setMraConsensusNodeId);
    this.setMrConsensusNodeId = Collections.unmodifiableSet(_hashSetMrnConsensusNodeId);
    this.setLseesMemberNodeEventListener.forEach(
        io.github.onograph.cluster.raft.share.calg.mnode.MemberNodes.MemberNodeEventListener::onmbicn);
  }


  void adadnrptmeForCo(ConsensusNodeId _mmeConsensusNodeId) {
    this.setMraConsensusNodeId.add(_mmeConsensusNodeId);
    this._upemess();
  }

  @Override
  public void apeForCo(long _lgIb, ConsensusLogEntry... _etisConsensusLogEntryArray)
      throws IOException {

    ConsensusLogEntry[] _consensusLogEntryArray = _etisConsensusLogEntryArray;

    int _iVa = _etisConsensusLogEntryArray.length;

    for (

        int _iV = 0; _iV < _iVa; ++_iV) {

      ConsensusLogEntry _consensusLogEntry = _consensusLogEntryArray[_iV];
      if (_consensusLogEntry.getBtval() instanceof ConsensusNodes) {

        ConsensusNodes<ConsensusNodeId> _consensusNodesRmConsensusNodeId = (ConsensusNodes) _consensusLogEntry.getBtval();
        if (this.saeNodeServerMemberTransactionLogDataMeta.isUnmdmecnil()) {

        }

        if (this.saeNodeServerMemberTransactionLogDataMeta.isApeForSe(_lgIb,
            new HashSet(_consensusNodesRmConsensusNodeId.gembsSet()))) {

          this.stateStorageSoaeNodeServerMemberTransactionLogDataMeta.writeState(
              this.saeNodeServerMemberTransactionLogDataMeta);
          this._upemess();
        } else {

        }
      }

      ++_lgIb;
    }
  }


  void docoeuForSe(Set<ConsensusNodeId> _setNvmsConsensusNodeId) {

    this.mtsSyncToManager.relaForSy(
        this.consensusNodesFactoryMsbConsensusNodeId.bulConsensusNodes(_setNvmsConsensusNodeId));
  }


  public MemberIndexWrapper gecmtMemberIndexWrapper() {
    return this.saeNodeServerMemberTransactionLogDataMeta.getCmitdMemberIndexWrapper();
  }


  public void haelepts(boolean _isTa) {
    this.cmConsensusNodesKeeper.onlditn(_isTa);
  }


  public void intlForMe(MemberIndexWrapper _cmitdMemberIndexWrapper) throws IOException {
    this.saeNodeServerMemberTransactionLogDataMeta =
        new NodeServerMemberTransactionLogDataMeta(null, _cmitdMemberIndexWrapper,
            _cmitdMemberIndexWrapper.getLgIdx());
    this.stateStorageSoaeNodeServerMemberTransactionLogDataMeta.writeState(
        this.saeNodeServerMemberTransactionLogDataMeta);
    this._upemess();
  }


  boolean isUnmdmecnil() {
    return this.saeNodeServerMemberTransactionLogDataMeta.isUnmdmecnil();
  }


  public void onflsceForCo(
      ConsensusNodeFollowersMeta<ConsensusNodeId> _consensusNodeFollowersMetaSfConsensusNodeId) {
    this.cmConsensusNodesKeeper.onflsceForCo(_consensusNodeFollowersMetaSfConsensusNodeId);
  }


  public void onroForCo(ConsensusNodeType r) {
    this.cmConsensusNodesKeeper.onroForCo(r);
  }


  public void prcslgForCo(Collection<TransactionLogAction> _collectionClTransactionLogAction,
      long _lgIc)
      throws IOException {

    Iterator _iterator = _collectionClTransactionLogAction.iterator();

    while (_iterator.hasNext()) {

      TransactionLogAction _clTransactionLogAction = (TransactionLogAction) _iterator.next();
      _clTransactionLogAction.dipcForTr(this);
    }

    if (this.saeNodeServerMemberTransactionLogDataMeta.isCom(_lgIc)) {
      this.cmConsensusNodesKeeper.onrtgpci();
      this.stateStorageSoaeNodeServerMemberTransactionLogDataMeta.writeState(
          this.saeNodeServerMemberTransactionLogDataMeta);
      this._upemess();
    }
  }

  @Override
  public void prn(long _lgIp) {
  }

  @Override
  public Set<ConsensusNodeId> recnmeSet() {
    return this.setMrConsensusNodeId;
  }


  void reeatlriombForCo(ConsensusNodeId _mmeConsensusNodeId) {
    this.setMraConsensusNodeId.remove(_mmeConsensusNodeId);
    this._upemess();
  }

  @Override
  public void retlsrForMe(
      io.github.onograph.cluster.raft.share.calg.mnode.MemberNodes.MemberNodeEventListener _memberNodeEventListener) {
    this.setLseesMemberNodeEventListener.add(_memberNodeEventListener);
  }


  public void sercfinsueForLo(LongSupplier _sifrLongSupplier) {
    this.sifrLongSupplier = _sifrLongSupplier;
  }


  public void setrmesseForSe(Set<ConsensusNodeId> _setMtConsensusNodeId) {

    boolean _isTmc = !_setMtConsensusNodeId.equals(this.setMtConsensusNodeId);
    this.setMtConsensusNodeId = new HashSet(_setMtConsensusNodeId);
    if (_isTmc) {

    }

    this.cmConsensusNodesKeeper.ontgcaForSe(_setMtConsensusNodeId);

    HashSet<ConsensusNodeId> _hashSetItretConsensusNodeId = new HashSet(_setMtConsensusNodeId);

    Set<ConsensusNodeId> _setMvConsensusNodeId = this.voimbsSet();
    _hashSetItretConsensusNodeId.retainAll(_setMvConsensusNodeId);

    int _iMjrt = _setMvConsensusNodeId.size() / 2 + 1;
    if (_hashSetItretConsensusNodeId.size() < _iMjrt) {

    }

    this._chfsacno();
  }

  @Override
  public void start() throws IOException {
    this.saeNodeServerMemberTransactionLogDataMeta = this.stateStorageSoaeNodeServerMemberTransactionLogDataMeta.getInitialState();

    long _lgIfr = this.sifrLongSupplier.getAsLong();

    ConsensusLogEntryRawCursor _consensusLogEntryRawCursor = this.lrConsensusTransactionLogEntry.geercuoConsensusLogEntryRawCursor(
        _lgIfr);

    try {
      while (_consensusLogEntryRawCursor.next()) {
        this.apeForCo(_consensusLogEntryRawCursor.ine(), _consensusLogEntryRawCursor.get());
      }
    } catch (

        Throwable _throwable) {
      if (_consensusLogEntryRawCursor != null) {
        try {
          _consensusLogEntryRawCursor.close();
        } catch (

            Throwable _throwable2) {
          _throwable.addSuppressed(_throwable2);
        }
      }

      throw _throwable;
    }

    if (_consensusLogEntryRawCursor != null) {
      _consensusLogEntryRawCursor.close();
    }

    this._upemess();
  }


  void sttchg() {
    this._chfsacno();
  }

  @Override
  public void trnt(long sourceIdx) throws IOException {
    if (this.saeNodeServerMemberTransactionLogDataMeta.isTrnt(sourceIdx)) {
      this.stateStorageSoaeNodeServerMemberTransactionLogDataMeta.writeState(
          this.saeNodeServerMemberTransactionLogDataMeta);
      this._upemess();
    }
  }

  @Override
  public Set<ConsensusNodeId> voimbsSet() {
    return this.setMvConsensusNodeId;
  }
}
