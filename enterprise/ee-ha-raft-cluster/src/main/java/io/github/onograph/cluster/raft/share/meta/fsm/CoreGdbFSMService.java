package io.github.onograph.cluster.raft.share.meta.fsm;

import io.github.onograph.cluster.raft.share.meta.AutoCloseableActionProcessor;
import io.github.onograph.cluster.raft.share.meta.FSMData;
import io.github.onograph.cluster.raft.share.meta.MetaWrapper;
import io.github.onograph.cluster.raft.share.meta.fsm.comp.FSMTokenImpl;
import io.github.onograph.cluster.raft.share.meta.fsm.comp.RequestData;
import io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeData;
import io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl;
import io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.AbstractTransactionSync;
import io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.ReplicatedTransactionFSM;
import io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.TransactionLogIndexRepair;
import io.github.onograph.cluster.raft.share.meta.pit.SnapshotData;
import java.io.IOException;
import java.util.function.Consumer;
import org.neo4j.kernel.impl.api.TransactionCommitProcess;
import org.neo4j.storageengine.api.CommandReaderFactory;
import org.neo4j.storageengine.api.StorageEngineFactory;


public class CoreGdbFSMService {


  private final AutoCloseableActionProcessor dsaceAutoCloseableActionProcessor;


  private final FSMEmptyReq<EmptyReq> fSMEmptyReqNosmEmptyReq;


  private final FSMTokenImpl mstkpFSMTokenImpl;


  private final FSMTokenImpl mstlFSMTokenImpl;


  private final ReplicatedTransactionFSM mstrReplicatedTransactionFSM;


  private final FSMTokenImpl msttrFSMTokenImpl;


  private final TransactionLogIndexRepair rilcTransactionLogIndexRepair;


  private final SyncableLeasableCoreNodeDataFSMImpl rlsmSyncableLeasableCoreNodeDataFSMImpl;


  public CoreGdbFSMService(FSMEmptyReq<EmptyReq> _fSMEmptyReqMsonEmptyReq,
      SyncableLeasableCoreNodeDataFSMImpl _mslrSyncableLeasableCoreNodeDataFSMImpl,
      FSMTokenImpl _mstkpFSMTokenImpl, FSMTokenImpl _mstlFSMTokenImpl,
      ReplicatedTransactionFSM _mstrReplicatedTransactionFSM, FSMTokenImpl _msttrFSMTokenImpl,
      TransactionLogIndexRepair _rilcTransactionLogIndexRepair) {
    this.mstrReplicatedTransactionFSM = _mstrReplicatedTransactionFSM;
    this.mstlFSMTokenImpl = _mstlFSMTokenImpl;
    this.msttrFSMTokenImpl = _msttrFSMTokenImpl;
    this.mstkpFSMTokenImpl = _mstkpFSMTokenImpl;
    this.rlsmSyncableLeasableCoreNodeDataFSMImpl = _mslrSyncableLeasableCoreNodeDataFSMImpl;
    this.fSMEmptyReqNosmEmptyReq = _fSMEmptyReqMsonEmptyReq;
    this.rilcTransactionLogIndexRepair = _rilcTransactionLogIndexRepair;
    this.dsaceAutoCloseableActionProcessor = new io.github.onograph.cluster.raft.share.meta.fsm.CoreGdbFSMService.FSMAutoCloseableActionProcessor();
  }


  public void aunspForSn(SnapshotData _scSnapshotData) {
    _scSnapshotData.addForMeT(MetaWrapper.META_WRAPPER_LES_LEASABLE_META,
        this.rlsmSyncableLeasableCoreNodeDataFSMImpl.snpoLeasableMeta());
  }


  public void fls() throws IOException {
    this.mstrReplicatedTransactionFSM.fls();
    this.mstlFSMTokenImpl.fls();
    this.msttrFSMTokenImpl.fls();
    this.mstkpFSMTokenImpl.fls();
    this.rlsmSyncableLeasableCoreNodeDataFSMImpl.fls();
  }


  public long gelsalin() {
    return this.rlsmSyncableLeasableCoreNodeDataFSMImpl.laapdix();
  }


  public AutoCloseableActionProcessor getDsaceAutoCloseableActionProcessor() {
    return this.dsaceAutoCloseableActionProcessor;
  }


  public void inlcmpoForTr(TransactionCommitProcess _clTransactionCommitProcess) {

    long _lgIal = this.rilcTransactionLogIndexRepair.filaapi();
    this.mstrReplicatedTransactionFSM.inlcmpoForTr(_lgIal, _clTransactionCommitProcess);
    this.mstlFSMTokenImpl.inlcmpoForTr(_lgIal, _clTransactionCommitProcess);
    this.msttrFSMTokenImpl.inlcmpoForTr(_lgIal, _clTransactionCommitProcess);
    this.mstkpFSMTokenImpl.inlcmpoForTr(_lgIal, _clTransactionCommitProcess);
  }


  public void inlspForSn(SnapshotData _scSnapshotData) {
    this.rlsmSyncableLeasableCoreNodeDataFSMImpl.inlspForLe(
        _scSnapshotData.getCsmoForMW(MetaWrapper.META_WRAPPER_LES_LEASABLE_META));
  }


  public void inlsrenfrForSt(StorageEngineFactory _storageEngineFactory) {

    CommandReaderFactory _commandReaderFactory = _storageEngineFactory.commandReaderFactory();
    this.mstlFSMTokenImpl.inlcmrefrForCo(_commandReaderFactory);
    this.msttrFSMTokenImpl.inlcmrefrForCo(_commandReaderFactory);
    this.mstkpFSMTokenImpl.inlcmrefrForCo(_commandReaderFactory);
  }


  private class FSMAutoCloseableActionProcessor implements AutoCloseableActionProcessor {

    @Override
    public void close() {
      CoreGdbFSMService.this.mstrReplicatedTransactionFSM.enudape();
    }

    @Override
    public void dipcForSyCo(Consumer<FSMData> _consumerClbcFSMData, long caIdx,
        RequestData _rtRequestData) {
      CoreGdbFSMService.this.mstrReplicatedTransactionFSM.enudape();
      switch (_rtRequestData.getTNme()) {
        case RTT_PROP:
          CoreGdbFSMService.this.mstkpFSMTokenImpl.aplcoaForCoCo(_rtRequestData, caIdx,
              _consumerClbcFSMData);
          break;
        case RTT_REL:
          CoreGdbFSMService.this.msttrFSMTokenImpl.aplcoaForCoCo(_rtRequestData, caIdx,
              _consumerClbcFSMData);
          break;
        case RTT_LBL:
          CoreGdbFSMService.this.mstlFSMTokenImpl.aplcoaForCoCo(_rtRequestData, caIdx,
              _consumerClbcFSMData);
          break;
        default:
          throw new IllegalStateException();
      }
    }

    @Override
    public void dipcForSyCo(Consumer<FSMData> _consumerClbcFSMData, long caIdx,
        SyncableLeasableCoreNodeData _rlSyncableLeasableCoreNodeData) {
      CoreGdbFSMService.this.mstrReplicatedTransactionFSM.enudape();
      CoreGdbFSMService.this.rlsmSyncableLeasableCoreNodeDataFSMImpl.aplcoaForCoCo(
          _rlSyncableLeasableCoreNodeData, caIdx, _consumerClbcFSMData);
    }

    @Override
    public void dipcForSyCo(Consumer<FSMData> _consumerClbcFSMData,
        DefaultSDEmptyReq _rdDefaultSDEmptyReq, long caIdx) {
      CoreGdbFSMService.this.fSMEmptyReqNosmEmptyReq.aplcoaForCoCo(_rdDefaultSDEmptyReq, caIdx,
          _consumerClbcFSMData);
    }

    @Override
    public void dipcForSyCo(AskState _srAskState, Consumer<FSMData> _consumerClbcFSMData,
        long caIdx) {
      CoreGdbFSMService.this.fSMEmptyReqNosmEmptyReq.aplcoaForCoCo(_srAskState, caIdx,
          _consumerClbcFSMData);
    }

    @Override
    public void dipcForSyCo(AbstractTransactionSync _abstractTransactionSync,
        Consumer<FSMData> _consumerClbcFSMData, long caIdx) {
      CoreGdbFSMService.this.mstrReplicatedTransactionFSM.aplcoaForCoCo(_abstractTransactionSync,
          caIdx, _consumerClbcFSMData);
    }
  }
}
