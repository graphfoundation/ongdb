package io.github.onograph.cluster.raft.share.calg.action;

import io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry;
import io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLog;
import io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheService;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import org.neo4j.logging.Log;


public class BulkAddAction implements TransactionLogAction {


  public final long baeid;


  public final ConsensusLogEntry[] enrsConsensusLogEntryArray;


  public final int ofst;


  public BulkAddAction(ConsensusLogEntry[] _etisConsensusLogEntryArray, long _lgIb, int ofst) {
    this.baeid = _lgIb;
    this.enrsConsensusLogEntryArray = _etisConsensusLogEntryArray;
    this.ofst = ofst;
  }

  @Override
  public void apltoForCoLo(ConsensusTransactionLog _lrConsensusTransactionLog, Log _log)
      throws IOException {

    long _lgIl = this.baeid + (long) this.ofst;
    if (_lgIl <= _lrConsensusTransactionLog.apeie()) {

      throw new IllegalStateException("*** Error: f3330dda-bebf-431a-b2f1-9e514ce30f6d");
    } else {
      _lrConsensusTransactionLog.apeForCo(
          Arrays.copyOfRange(this.enrsConsensusLogEntryArray, this.ofst,
              this.enrsConsensusLogEntryArray.length));
    }
  }

  @Override
  public void apltoForCoLo(ConsensusLogCacheService _cfiConsensusLogCacheService, Log _log) {
    for (

        int cur = this.ofst; cur < this.enrsConsensusLogEntryArray.length; ++cur) {
      _cfiConsensusLogCacheService.putForCo(this.enrsConsensusLogEntryArray[cur],
          this.baeid + (long) cur);
    }
  }

  @Override
  public void dipcForTr(
      io.github.onograph.cluster.raft.share.calg.action.TransactionLogAction.TransactionLogActions _hnlrTransactionLogActions)
      throws IOException {
    _hnlrTransactionLogActions.apeForCo(this.baeid + (long) this.ofst,
        Arrays.copyOfRange(this.enrsConsensusLogEntryArray, this.ofst,
            this.enrsConsensusLogEntryArray.length));
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      BulkAddAction _thBulkAddAction = (BulkAddAction) obj;
      return this.baeid == _thBulkAddAction.baeid && this.ofst == _thBulkAddAction.ofst &&
          Arrays.equals(this.enrsConsensusLogEntryArray,
              _thBulkAddAction.enrsConsensusLogEntryArray);
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.baeid, this.ofst, Arrays.hashCode(this.enrsConsensusLogEntryArray));
  }


}
