package io.github.onograph.cluster.raft.share.calg.cle.parts;

import io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntryData;
import java.io.IOException;
import java.util.Optional;
import org.neo4j.cursor.CursorValue;
import org.neo4j.cursor.IOCursor;


class ConsensusLogEntryDataIOCursor implements IOCursor<ConsensusLogEntryData> {


  private final CursorValue<ConsensusLogEntryData> cursorValueRcConsensusLogEntryData = new CursorValue();


  private final TransactionLogParts sgetTransactionLogParts;


  private IOCursor<ConsensusLogEntryData> iOCursorCroConsensusLogEntryData;


  private io.github.onograph.cluster.raft.share.calg.cle.parts.TreeComparingWrapper.KeyValueLimit<Long, TransactionLogPartFileSystemWrapper>
      keyValueLimitSrlt;


  private long lgIc;


  private long lgLmt = Long.MAX_VALUE;


  ConsensusLogEntryDataIOCursor(long lgIdx, TransactionLogParts _sgetTransactionLogParts) {
    this.sgetTransactionLogParts = _sgetTransactionLogParts;
    this.lgIc = lgIdx - 1L;
  }


  private boolean _isNetsgn() throws IOException {
    this.keyValueLimitSrlt = this.sgetTransactionLogParts.gefieTreeComparingWrapperKeyValueLimit(
        this.lgIc);

    Optional<TransactionLogPartFileSystemWrapper> _optionalFoTransactionLogPartFileSystemWrapper = this.keyValueLimitSrlt.vauOptional();
    if (!_optionalFoTransactionLogPartFileSystemWrapper.isPresent()) {
      this.cursorValueRcConsensusLogEntryData.invalidate();
      return false;
    } else {

      TransactionLogPartFileSystemWrapper _transactionLogPartFileSystemWrapper = _optionalFoTransactionLogPartFileSystemWrapper.get();

      IOCursor<ConsensusLogEntryData> _iOCursorCoConsensusLogEntryData = this.iOCursorCroConsensusLogEntryData;

      try {
        this.iOCursorCroConsensusLogEntryData = _transactionLogPartFileSystemWrapper.gecsIOCursor(
            this.lgIc);
      } catch (

          TransactionLogPartMissingException _transactionLogPartMissingException) {
        this.cursorValueRcConsensusLogEntryData.invalidate();
        return false;
      }

      if (_iOCursorCoConsensusLogEntryData != null) {
        _iOCursorCoConsensusLogEntryData.close();
      }

      this.lgLmt = this.keyValueLimitSrlt.liiOptional().orElse(Long.MAX_VALUE);
      return true;
    }
  }

  @Override
  public void close() throws IOException {
    if (this.iOCursorCroConsensusLogEntryData != null) {
      this.iOCursorCroConsensusLogEntryData.close();
    }
  }

  @Override
  public ConsensusLogEntryData get() {
    return this.cursorValueRcConsensusLogEntryData.get();
  }

  @Override
  public boolean next() throws IOException {
    ++this.lgIc;
    if ((this.keyValueLimitSrlt == null || this.lgIc >= this.lgLmt) && !this._isNetsgn()) {
      return false;
    } else if (this.iOCursorCroConsensusLogEntryData.next()) {
      this.cursorValueRcConsensusLogEntryData.set(this.iOCursorCroConsensusLogEntryData.get());
      return true;
    } else {
      this.cursorValueRcConsensusLogEntryData.invalidate();
      return false;
    }
  }
}
