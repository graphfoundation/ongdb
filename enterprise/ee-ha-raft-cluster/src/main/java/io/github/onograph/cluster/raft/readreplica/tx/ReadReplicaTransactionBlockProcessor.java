package io.github.onograph.cluster.raft.readreplica.tx;

import io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionSyncWatcherProvider;
import io.github.onograph.cluster.raft.share.meta.fsm.ActionIdxMonitor;
import io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.TransactionLogHeadWrapper;
import org.neo4j.internal.kernel.api.exceptions.TransactionFailureException;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.context.VersionContextSupplier;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.impl.api.TransactionCommitProcess;
import org.neo4j.kernel.impl.api.TransactionToApply;
import org.neo4j.kernel.impl.transaction.CommittedTransactionRepresentation;
import org.neo4j.kernel.impl.transaction.tracing.CommitEvent;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.monitoring.Monitors;
import org.neo4j.storageengine.api.TransactionApplicationMode;


public class ReadReplicaTransactionBlockProcessor {


  private static final String CLSRG_BACN_TXS_LT = io.github.onograph.TokenConstants.CLUSTERING_BATCHING_TRANSACTION;


  private final ReadReplicaAsyncTransactionAdapter apirReadReplicaAsyncTransactionAdapter;


  private final io.github.onograph.dbms.GdbReplicator.FireEvents dedFireEvents;


  private final Log log;


  private final TransactionSyncWatcherProvider mntrTransactionSyncWatcherProvider;


  private final PageCacheTracer pageCacheTracer;


  private final ActionIdxMonitor ticActionIdxMonitor;


  private final TransactionCommitProcess transactionCommitProcess;


  private final VersionContextSupplier versionContextSupplier;


  private volatile long lgItql;


  private TxBlock txBlock = new TxBlock();


  ReadReplicaTransactionBlockProcessor(
      ReadReplicaAsyncTransactionAdapter _apirReadReplicaAsyncTransactionAdapter,
      io.github.onograph.dbms.GdbReplicator.FireEvents _dedFireEvents, long _lgItcl,
      LogProvider _logProvider, Monitors _monitors, PageCacheTracer _pageCacheTracer,
      ActionIdxMonitor _ticActionIdxMonitor, TransactionCommitProcess _transactionCommitProcess,
      VersionContextSupplier _versionContextSupplier) {
    this.log = _logProvider.getLog(this.getClass());
    this.mntrTransactionSyncWatcherProvider = _monitors.newMonitor(
        TransactionSyncWatcherProvider.class, new String[0]);
    this.ticActionIdxMonitor = _ticActionIdxMonitor;
    this.dedFireEvents = _dedFireEvents;
    this.lgItql = _lgItcl;
    this.transactionCommitProcess = _transactionCommitProcess;
    this.pageCacheTracer = _pageCacheTracer;
    this.versionContextSupplier = _versionContextSupplier;
    this.apirReadReplicaAsyncTransactionAdapter = _apirReadReplicaAsyncTransactionAdapter;
  }


  private void _comForRe(TxBlock txBlock) throws TransactionFailureException {
    this.transactionCommitProcess.commit(txBlock.isStrt, CommitEvent.NULL,
        TransactionApplicationMode.EXTERNAL);

    byte[] _haByteArray = txBlock.lasTransactionToApply.transactionRepresentation()
        .additionalHeader();
    if (_haByteArray.length > 0) {

      long _lgIral = TransactionLogHeadWrapper.deelinfrthr(_haByteArray);
      this.ticActionIdxMonitor.seapcnie(_lgIral);
    }
  }


  public synchronized void apbaForRe(ReadReplicaJobEventService readReplicaJobEventService) {
    if (this.txBlock.isStrt == null) {
      readReplicaJobEventService.onsue();
    } else {

      TxBlock _atTxBlock = this.txBlock;
      this.txBlock = new TxBlock();
      this.apirReadReplicaAsyncTransactionAdapter.addForRu(new ReadReplicaAsyncJobRunner(() ->
      {
        this._comForRe(_atTxBlock);
        return null;
      }, readReplicaJobEventService, () ->
      {
        return false;
      }));
    }
  }


  public long getLgItql() {
    return this.lgItql;
  }


  public synchronized void quuForCo(
      CommittedTransactionRepresentation _tCommittedTransactionRepresentation) {

    long _lgItr = _tCommittedTransactionRepresentation.getCommitEntry().getTxId();

    long _lgIte = this.lgItql + 1L;
    if (_lgItr != _lgIte) {

    } else {

      CursorContext _cursorContext =
          new CursorContext(this.pageCacheTracer.createPageCursorTracer(
              io.github.onograph.TokenConstants.CLUSTERING_BATCHING_TRANSACTION),
              this.versionContextSupplier.createVersionContext());

      TransactionToApply _transactionToApply =
          new TransactionToApply(
              _tCommittedTransactionRepresentation.getTransactionRepresentation(), _lgItr,
              _cursorContext);
      _transactionToApply.onClose((txId) ->
      {
        this.dedFireEvents.fitrcct(txId);
        _cursorContext.close();
      });
      this.txBlock._chiForTr(_transactionToApply);
      this.lgItql = _lgItr;
      this.mntrTransactionSyncWatcherProvider.txpurps(_lgItr);
    }
  }


  private static class TxBlock {


    TransactionToApply isStrt;


    TransactionToApply lasTransactionToApply;


    private void _chiForTr(TransactionToApply _nTransactionToApply) {
      if (this.isStrt == null) {
        this.isStrt = this.lasTransactionToApply = _nTransactionToApply;
      } else {
        this.lasTransactionToApply.next(_nTransactionToApply);
        this.lasTransactionToApply = _nTransactionToApply;
      }
    }
  }
}
