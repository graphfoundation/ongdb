package io.github.onograph.cluster.raft.share.calg.action;

import io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLog;
import io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheService;
import java.io.IOException;
import java.util.Objects;
import org.neo4j.logging.Log;


public class TransactionLogActionClipImpl implements TransactionLogAction {


  private final long lgIp;

  public TransactionLogActionClipImpl(long _lgIp) {
    this.lgIp = _lgIp;
  }

  @Override
  public void apltoForCoLo(ConsensusTransactionLog _rlConsensusTransactionLog, Log _log)
      throws IOException {
    _rlConsensusTransactionLog.prn(this.lgIp);
  }

  @Override
  public void apltoForCoLo(ConsensusLogCacheService _ifcConsensusLogCacheService, Log _log) {
  }

  @Override
  public void dipcForTr(
      io.github.onograph.cluster.raft.share.calg.action.TransactionLogAction.TransactionLogActions _hnlrTransactionLogActions) {
    _hnlrTransactionLogActions.prn(this.lgIp);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      TransactionLogActionClipImpl _tTransactionLogActionClipImpl = (TransactionLogActionClipImpl) obj;
      return this.lgIp == _tTransactionLogActionClipImpl.lgIp;
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.lgIp);
  }


}
