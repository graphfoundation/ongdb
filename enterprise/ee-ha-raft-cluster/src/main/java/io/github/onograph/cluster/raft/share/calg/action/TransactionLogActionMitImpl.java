package io.github.onograph.cluster.raft.share.calg.action;

import io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLog;
import io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheService;
import java.io.IOException;
import java.util.Objects;
import org.neo4j.logging.Log;


public class TransactionLogActionMitImpl implements TransactionLogAction {


  public final long sourceIdx;

  public TransactionLogActionMitImpl(long sourceIdx) {
    this.sourceIdx = sourceIdx;
  }

  @Override
  public void apltoForCoLo(ConsensusTransactionLog _lrConsensusTransactionLog, Log _log)
      throws IOException {
    _lrConsensusTransactionLog.trnt(this.sourceIdx);
  }

  @Override
  public void apltoForCoLo(ConsensusLogCacheService _cfiConsensusLogCacheService, Log _log) {

    _cfiConsensusLogCacheService.trnt(this.sourceIdx);
  }

  @Override
  public void dipcForTr(
      io.github.onograph.cluster.raft.share.calg.action.TransactionLogAction.TransactionLogActions _hnlrTransactionLogActions)
      throws IOException {
    _hnlrTransactionLogActions.trnt(this.sourceIdx);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      TransactionLogActionMitImpl _thTransactionLogActionMitImpl = (TransactionLogActionMitImpl) obj;
      return this.sourceIdx == _thTransactionLogActionMitImpl.sourceIdx;
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.sourceIdx);
  }


}
