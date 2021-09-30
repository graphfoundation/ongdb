package io.github.onograph.cluster.raft.share.calg.action;

import io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry;
import io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLog;
import io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheService;
import java.io.IOException;
import java.util.Objects;
import org.neo4j.logging.Log;


public class AddAction implements TransactionLogAction {


  public final ConsensusLogEntry consensusLogEntry;


  public final long idx;


  public AddAction(ConsensusLogEntry _consensusLogEntry, long idx) {
    this.consensusLogEntry = _consensusLogEntry;
    this.idx = idx;
  }

  @Override
  public void apltoForCoLo(ConsensusTransactionLog _lrConsensusTransactionLog, Log _log)
      throws IOException {
    if (this.idx <= _lrConsensusTransactionLog.apeie()) {

      throw new IllegalStateException("*** Error: cd1d9dda-025b-4790-8736-adf0f6037475");
    } else {
      _lrConsensusTransactionLog.apeForCo(this.consensusLogEntry);
    }
  }

  @Override
  public void apltoForCoLo(ConsensusLogCacheService _cfiConsensusLogCacheService, Log _log) {
    _cfiConsensusLogCacheService.putForCo(this.consensusLogEntry, this.idx);
  }

  @Override
  public void dipcForTr(
      io.github.onograph.cluster.raft.share.calg.action.TransactionLogAction.TransactionLogActions _hnlrTransactionLogActions)
      throws IOException {
    _hnlrTransactionLogActions.apeForCo(this.idx, this.consensusLogEntry);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      AddAction _tAddAction = (AddAction) obj;
      return this.idx == _tAddAction.idx && Objects.equals(this.consensusLogEntry,
          _tAddAction.consensusLogEntry);
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.idx, this.consensusLogEntry);
  }


}
