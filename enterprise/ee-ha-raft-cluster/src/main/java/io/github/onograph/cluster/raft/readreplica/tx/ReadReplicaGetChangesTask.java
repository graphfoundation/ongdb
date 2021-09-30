package io.github.onograph.cluster.raft.readreplica.tx;

import io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerManager;
import io.github.onograph.cluster.raft.module.cuprot.CatchupProblem;
import io.github.onograph.cluster.raft.module.cuprot.CatchupReplyChannelManager;
import io.github.onograph.cluster.raft.module.cuprot.synctrxr.CatchupIncomingTransactionReply;
import io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompleted;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import org.neo4j.logging.Log;


public class ReadReplicaGetChangesTask extends CatchupAnswerManager<TransactionChunkingCompleted> {


  private final ReadReplicaJobEventService hfaReadReplicaJobEventService;


  private final ReadReplicaJobEventServiceErrorWatcherImpl hftReadReplicaJobEventServiceErrorWatcherImpl = new ReadReplicaJobEventServiceErrorWatcherImpl();


  private final long lgSbm;


  private final long lgWl;


  private final long lgWu;


  private final Log log;


  private final ReadReplicaTransactionBlockProcessor readReplicaTransactionBlockProcessor;


  private final TxCancelable scTxCancelable;


  private int iSbc;


  private ReadReplicaJobEventServiceReplyInManagerImpl readReplicaJobEventServiceReplyInManagerImpl;


  public ReadReplicaGetChangesTask(ReadReplicaJobEventService _hfaReadReplicaJobEventService,
      long _lgSbm, long _lgSqm, Log _log,
      ReadReplicaTransactionBlockProcessor readReplicaTransactionBlockProcessor,
      TxCancelable _scTxCancelable) {
    this.lgWu = StrictMath.max(1L, _lgSqm / _lgSbm);
    this.lgWl = this.lgWu / 2L;
    this.lgSbm = _lgSbm;
    this.hfaReadReplicaJobEventService = _hfaReadReplicaJobEventService;
    this.readReplicaTransactionBlockProcessor = readReplicaTransactionBlockProcessor;
    this.log = _log;
    this.scTxCancelable = _scTxCancelable;
  }


  private ReadReplicaJobEventService _coejbethlReadReplicaJobEventService(
      CompletableFuture<TransactionChunkingCompleted> _completableFutureSgaTransactionChunkingCompleted,
      TransactionChunkingCompleted _rsosTransactionChunkingCompleted) {
    return new ReadReplicaJobEventServiceMergedImpl(
        List.of(this.hfaReadReplicaJobEventService,
            this.hftReadReplicaJobEventServiceErrorWatcherImpl,
            ReadReplicaJobEventServiceStatusImpl.coptsiaReadReplicaJobEventServiceStatusImpl(
                _completableFutureSgaTransactionChunkingCompleted,
                _rsosTransactionChunkingCompleted)));
  }


  private ReadReplicaJobEventService _onnjeheReadReplicaJobEventService(
      CompletableFuture<TransactionChunkingCompleted> _completableFutureSgaTransactionChunkingCompleted) {
    return new ReadReplicaJobEventServiceMergedImpl(
        List.of(this.readReplicaJobEventServiceReplyInManagerImpl,
            this.hfaReadReplicaJobEventService,
            this.hftReadReplicaJobEventServiceErrorWatcherImpl,
            ReadReplicaJobEventServiceStatusImpl.keprnnReadReplicaJobEventServiceStatusImpl(
                _completableFutureSgaTransactionChunkingCompleted)));
  }

  @Override
  public void onccerresForCoCa(CatchupProblem _recCatchupProblem,
      CompletableFuture<TransactionChunkingCompleted> _completableFutureSgaTransactionChunkingCompleted) {
    _completableFutureSgaTransactionChunkingCompleted.complete(
        new TransactionChunkingCompleted(-1L, _recCatchupProblem.getStat()));


  }

  @Override
  public void ontpurseForCoCaCa(
      CatchupIncomingTransactionReply _rsosCatchupIncomingTransactionReply,
      CatchupReplyChannelManager catchupReplyChannelManager,
      CompletableFuture<TransactionChunkingCompleted> _completableFutureSgaTransactionChunkingCompleted) {
    if (this.readReplicaJobEventServiceReplyInManagerImpl == null) {
      this.readReplicaJobEventServiceReplyInManagerImpl =
          new ReadReplicaJobEventServiceReplyInManagerImpl(catchupReplyChannelManager, this.lgWl,
              this.lgWu);
    }

    this.readReplicaTransactionBlockProcessor.quuForCo(
        _rsosCatchupIncomingTransactionReply.getTCommittedTransactionRepresentation());
    this.iSbc += _rsosCatchupIncomingTransactionReply.getISt();
    if (this.scTxCancelable.needsCancel()) {
      _completableFutureSgaTransactionChunkingCompleted.completeExceptionally(
          ReadReplicaIncomingChangeTaskError.IT);
    } else if ((long) this.iSbc >= this.lgSbm) {
      this.readReplicaJobEventServiceReplyInManagerImpl.inre();
      this.readReplicaTransactionBlockProcessor.apbaForRe(this._onnjeheReadReplicaJobEventService(
          _completableFutureSgaTransactionChunkingCompleted));
      this.iSbc = 0;
    }
  }

  @Override
  public void ontstfhrseForCoTr(
      CompletableFuture<TransactionChunkingCompleted> _completableFutureSgaTransactionChunkingCompleted,
      TransactionChunkingCompleted _rsosTransactionChunkingCompleted) {
    this.readReplicaTransactionBlockProcessor.apbaForRe(
        this._coejbethlReadReplicaJobEventService(_completableFutureSgaTransactionChunkingCompleted,
            _rsosTransactionChunkingCompleted));
  }
}
