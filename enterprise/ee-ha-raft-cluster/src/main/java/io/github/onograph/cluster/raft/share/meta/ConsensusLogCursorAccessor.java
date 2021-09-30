package io.github.onograph.cluster.raft.share.meta;

import io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry;
import io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntryRawCursor;
import io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLogEntry;
import io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheService;
import java.io.IOException;


public class ConsensusLogCursorAccessor implements AutoCloseable {


  private final ConsensusLogCacheService cfiConsensusLogCacheService;


  private final boolean isRap;


  private final ConsensusTransactionLogEntry lrConsensusTransactionLogEntry;


  private ConsensusLogEntryRawCursor consensusLogEntryRawCursor;


  private boolean isUc = true;


  public ConsensusLogCursorAccessor(ConsensusLogCacheService _cfiConsensusLogCacheService,
      boolean _isRap, ConsensusTransactionLogEntry _lrConsensusTransactionLogEntry) {
    this.cfiConsensusLogCacheService = _cfiConsensusLogCacheService;
    this.isRap = _isRap;
    this.lrConsensusTransactionLogEntry = _lrConsensusTransactionLogEntry;
  }


  private ConsensusLogEntry _geuncuoConsensusLogEntry(long lgIdx) throws IOException {
    if (this.consensusLogEntryRawCursor == null) {
      this.consensusLogEntryRawCursor = this.lrConsensusTransactionLogEntry.geercuoConsensusLogEntryRawCursor(
          lgIdx);
    }

    if (this.consensusLogEntryRawCursor.next()) {
      if (this.consensusLogEntryRawCursor.ine() != lgIdx) {

        throw new IllegalStateException("*** Error: 1d973c71-5329-430f-b452-d57862ede76b");
      } else {
        return this.consensusLogEntryRawCursor.get();
      }
    } else {
      return null;
    }
  }

  @Override
  public void close() throws IOException {
    if (this.consensusLogEntryRawCursor != null) {
      this.consensusLogEntryRawCursor.close();
    }
  }


  public ConsensusLogEntry getConsensusLogEntry(long lgIdx) throws IOException {

    ConsensusLogEntry _consensusLogEntry = null;
    if (this.isUc) {
      _consensusLogEntry = this.cfiConsensusLogCacheService.getConsensusLogEntry(lgIdx);
    } else {
      this.cfiConsensusLogCacheService.retspccac();
    }

    if (_consensusLogEntry == null) {
      this.isUc = false;
      _consensusLogEntry = this._geuncuoConsensusLogEntry(lgIdx);
    }

    if (this.isRap) {
      this.cfiConsensusLogCacheService.prn(lgIdx);
    }

    return _consensusLogEntry;
  }
}
