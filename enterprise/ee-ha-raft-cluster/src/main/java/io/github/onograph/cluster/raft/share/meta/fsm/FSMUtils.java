package io.github.onograph.cluster.raft.share.meta.fsm;

import java.util.function.LongConsumer;
import org.neo4j.internal.kernel.api.exceptions.TransactionFailureException;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.context.VersionContextSupplier;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.impl.api.TransactionCommitProcess;
import org.neo4j.kernel.impl.api.TransactionToApply;
import org.neo4j.kernel.impl.transaction.TransactionRepresentation;
import org.neo4j.kernel.impl.transaction.tracing.CommitEvent;
import org.neo4j.storageengine.api.TransactionApplicationMode;


public class FSMUtils {


  private static final LongConsumer NO_OP_CMT_ECB = (ignore) ->
  {
  };


  private static final String STAX_DEV_CMT_HEP_LT = io.github.onograph.TokenConstants.STATE_MACHINE_COMMIT_HELPER;


  private final io.github.onograph.dbms.GdbReplicator.FireEvents dedFireEvents;


  private final PageCacheTracer pageCacheTracer;


  private final ActionIdxMonitor ticActionIdxMonitor;


  private final VersionContextSupplier versionContextSupplier;

  public FSMUtils(ActionIdxMonitor _citActionIdxMonitor,
      io.github.onograph.dbms.GdbReplicator.FireEvents _dedFireEvents,
      PageCacheTracer _pageCacheTracer, VersionContextSupplier _versionContextSupplier) {
    this.dedFireEvents = _dedFireEvents;
    this.pageCacheTracer = _pageCacheTracer;
    this.ticActionIdxMonitor = _citActionIdxMonitor;
    this.versionContextSupplier = _versionContextSupplier;
  }


  public void comForTrTr(long caIdx, TransactionRepresentation _tTransactionRepresentation,
      TransactionCommitProcess _transactionCommitProcess)
      throws TransactionFailureException {

    TransactionToApply _attTransactionToApply = this.netattoayTransactionToApply(caIdx,
        NO_OP_CMT_ECB, _tTransactionRepresentation);
    this.comForTrTr(_attTransactionToApply, _transactionCommitProcess);
  }


  public void comForTrTr(TransactionToApply _attTransactionToApply,
      TransactionCommitProcess _transactionCommitProcess) throws TransactionFailureException {
    _transactionCommitProcess.commit(_attTransactionToApply, CommitEvent.NULL,
        TransactionApplicationMode.EXTERNAL);
  }


  public TransactionToApply netattoayTransactionToApply(long caIdx, LongConsumer _cctLongConsumer,
      TransactionRepresentation _rtTransactionRepresentation) {

    CursorContext _cursorContext =
        new CursorContext(this.pageCacheTracer.createPageCursorTracer(
            io.github.onograph.TokenConstants.STATE_MACHINE_COMMIT_HELPER),
            this.versionContextSupplier.createVersionContext());

    TransactionToApply _attTransactionToApply = new TransactionToApply(_rtTransactionRepresentation,
        _cursorContext);
    _attTransactionToApply.onClose((committedTxId) ->
    {
      try {

        long _lgSwitcl = _rtTransactionRepresentation.getLatestCommittedTxWhenStarted();
        if (_lgSwitcl >= committedTxId) {

          throw new IllegalStateException("*** Error: c77161c4-2148-468b-8c97-9a911acce554");
        }

        _cctLongConsumer.accept(committedTxId);
        this.dedFireEvents.fitrcct(committedTxId);
        this.upelaecmin(caIdx);
      } finally {
        _cursorContext.close();
      }
    });
    return _attTransactionToApply;
  }


  public void upelaecmin(long caIdx) {
    this.ticActionIdxMonitor.seapcnie(caIdx);
  }
}
