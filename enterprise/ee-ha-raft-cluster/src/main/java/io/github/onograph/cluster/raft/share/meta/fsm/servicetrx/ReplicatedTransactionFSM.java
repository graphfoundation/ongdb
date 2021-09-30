package io.github.onograph.cluster.raft.share.meta.fsm.servicetrx;

import io.github.onograph.cluster.raft.share.meta.FSMData;
import io.github.onograph.cluster.raft.share.meta.fsm.FSM;
import io.github.onograph.cluster.raft.share.meta.fsm.FSMUtils;
import io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import org.neo4j.internal.kernel.api.exceptions.TransactionFailureException;
import org.neo4j.kernel.api.exceptions.Status.Transaction;
import org.neo4j.kernel.impl.api.TransactionCommitProcess;
import org.neo4j.kernel.impl.api.TransactionQueue;
import org.neo4j.kernel.impl.api.TransactionToApply;
import org.neo4j.kernel.impl.transaction.log.PhysicalTransactionRepresentation;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


public class ReplicatedTransactionFSM implements FSM<AbstractTransactionSync> {


  private final FSMUtils hcFSMUtils;


  private final int iSbm;


  private final Log log;


  private final SyncableLeasableCoreNodeDataFSMImpl mslSyncableLeasableCoreNodeDataFSMImpl;


  private long lgIcl = -1L;


  private TransactionQueue transactionQueue;


  public ReplicatedTransactionFSM(FSMUtils _chFSMUtils, int _iSbm, LogProvider _logProvider,
      SyncableLeasableCoreNodeDataFSMImpl _mslSyncableLeasableCoreNodeDataFSMImpl) {
    this.hcFSMUtils = _chFSMUtils;
    this.mslSyncableLeasableCoreNodeDataFSMImpl = _mslSyncableLeasableCoreNodeDataFSMImpl;
    this.iSbm = _iSbm;
    this.log = _logProvider.getLog(this.getClass());
  }


  private IllegalStateException _paiexpoIllegalStateException(Exception _exception) {
    return new IllegalStateException("*** Error:  7a979cd7-cb56-4828-9cfe-a248de82ed9f",
        _exception);
  }

  @Override
  public synchronized void aplcoaForCoCo(AbstractTransactionSync _trAbstractTransactionSync,
      long caIdx, Consumer<FSMData> _consumerClbcFSMData) {
    if (caIdx <= this.lgIcl) {

    } else {

      PhysicalTransactionRepresentation _tPhysicalTransactionRepresentation = _trAbstractTransactionSync.getTPhysicalTransactionRepresentation();

      byte[] _heByteArray = TransactionLogHeadWrapper.enelinastha(caIdx);
      _tPhysicalTransactionRepresentation.setAdditionalHeader(_heByteArray);

      int _iCli = this.mslSyncableLeasableCoreNodeDataFSMImpl.snpoLeasableMeta().getLsId();

      int lsId = _tPhysicalTransactionRepresentation.getLeaseId();
      if (_iCli != lsId && lsId != -1) {
        _consumerClbcFSMData.accept(
            FSMData.ofFSMData(new TransactionFailureException(Transaction.LeaseExpired,
                "*** Error:  edbb3b85-2995-4817-88af-be7ebb61335a",
                new Object[]{_iCli, lsId})));
      } else {
        try {

          LongConsumer _cctLongConsumer = (committedTxId) ->
          {
            _consumerClbcFSMData.accept(FSMData.ofFSMData(committedTxId));
          };

          TransactionToApply _transactionToApply =
              this.hcFSMUtils.netattoayTransactionToApply(caIdx, _cctLongConsumer,
                  _tPhysicalTransactionRepresentation);
          this.transactionQueue.queue(_transactionToApply);
        } catch (

            Exception _exception) {
          throw this._paiexpoIllegalStateException(_exception);
        }
      }
    }
  }


  public synchronized void enudape() {
    try {
      this.transactionQueue.empty();
    } catch (

        Exception _exception) {
      throw this._paiexpoIllegalStateException(_exception);
    }
  }

  @Override
  public void fls() {
  }


  public synchronized void inlcmpoForTr(long _lgLci,
      TransactionCommitProcess _transactionCommitProcess) {
    this.lgIcl = _lgLci;
    this.hcFSMUtils.upelaecmin(_lgLci);

    this.transactionQueue = new TransactionQueue(this.iSbm, (first, last) ->
    {
      this.hcFSMUtils.comForTrTr(first, _transactionCommitProcess);
    });
  }

  @Override
  public long laapdix() {
    if (this.transactionQueue == null) {

      throw new IllegalStateException("*** Error:  1a798174-f854-4591-891e-ea80da11091d");
    } else {
      return this.lgIcl;
    }
  }
}
