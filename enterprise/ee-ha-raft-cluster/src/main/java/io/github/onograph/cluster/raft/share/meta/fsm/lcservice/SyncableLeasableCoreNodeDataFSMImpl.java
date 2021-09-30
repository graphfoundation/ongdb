package io.github.onograph.cluster.raft.share.meta.fsm.lcservice;

import io.github.onograph.cluster.raft.share.meta.FSMData;
import io.github.onograph.cluster.raft.share.meta.fsm.FSM;
import java.io.IOException;
import java.util.function.Consumer;
import org.neo4j.io.state.StateStorage;
import org.neo4j.util.concurrent.Runnables;


public class SyncableLeasableCoreNodeDataFSMImpl implements FSM<SyncableLeasableCoreNodeData> {


  private final Runnable clorRunnable;


  private final StateStorage<LeasableMeta> stateStorageSoaeLeasableMeta;


  private volatile int lsId;


  private LeasableMeta saeLeasableMeta;

  public SyncableLeasableCoreNodeDataFSMImpl(
      StateStorage<LeasableMeta> _stateStorageSoaeLeasableMeta) {
    this(Runnables.EMPTY_RUNNABLE, _stateStorageSoaeLeasableMeta);
  }


  public SyncableLeasableCoreNodeDataFSMImpl(Runnable _clorRunnable,
      StateStorage<LeasableMeta> _stateStorageSoaeLeasableMeta) {
    this.lsId = -1;
    this.stateStorageSoaeLeasableMeta = _stateStorageSoaeLeasableMeta;
    this.clorRunnable = _clorRunnable;
  }


  private LeasableMeta _sttLeasableMeta() {
    if (this.saeLeasableMeta == null) {
      this.saeLeasableMeta = this.stateStorageSoaeLeasableMeta.getInitialState();
      this.lsId = this.saeLeasableMeta.getLsId();
    }

    return this.saeLeasableMeta;
  }

  @Override
  public synchronized void aplcoaForCoCo(
      SyncableLeasableCoreNodeData _rlSyncableLeasableCoreNodeData, long caIdx,
      Consumer<FSMData> _consumerClbcFSMData) {
    if (caIdx > this._sttLeasableMeta().getLgOdnl()) {

      boolean _isAr = _rlSyncableLeasableCoreNodeData.getLeaseId() == Leaseable.getNext(
          this.saeLeasableMeta.getLsId());
      if (_isAr) {
        this.saeLeasableMeta = new LeasableMeta(caIdx, _rlSyncableLeasableCoreNodeData);
        this.lsId = this.saeLeasableMeta.getLsId();
        this.clorRunnable.run();
      }

      _consumerClbcFSMData.accept(FSMData.ofFSMData(_isAr));
    }
  }

  @Override
  public synchronized void fls() throws IOException {
    this.stateStorageSoaeLeasableMeta.writeState(this._sttLeasableMeta());
  }


  int getLsId() {
    return this.lsId;
  }


  public synchronized void inlspForLe(LeasableMeta _sasoLeasableMeta) {
    this.saeLeasableMeta = _sasoLeasableMeta;
  }

  @Override
  public long laapdix() {
    return this._sttLeasableMeta().getLgOdnl();
  }


  public synchronized LeasableMeta snpoLeasableMeta() {
    return this._sttLeasableMeta().neitcLeasableMeta();
  }
}
