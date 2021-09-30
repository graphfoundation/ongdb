package io.github.onograph.cluster.raft.share.calg.cle.parts;

import io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry;
import io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntryData;
import io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntryRawCursor;
import java.io.IOException;
import org.neo4j.cursor.CursorValue;
import org.neo4j.cursor.IOCursor;


class ConsensusLogEntryRawCursorSpreadImpl implements ConsensusLogEntryRawCursor {


  private final CursorValue<ConsensusLogEntry> cursorValueCretConsensusLogEntry;


  private final IOCursor<ConsensusLogEntryData> iOCursorInrConsensusLogEntryData;


  private long idx;


  ConsensusLogEntryRawCursorSpreadImpl(
      IOCursor<ConsensusLogEntryData> _iOCursorInrConsensusLogEntryData, long sourceIdx) {
    this.iOCursorInrConsensusLogEntryData = _iOCursorInrConsensusLogEntryData;
    this.cursorValueCretConsensusLogEntry = new CursorValue();
    this.idx = sourceIdx - 1L;
  }

  @Override
  public void close() throws IOException {
    this.iOCursorInrConsensusLogEntryData.close();
  }

  @Override
  public ConsensusLogEntry get() {
    return this.cursorValueCretConsensusLogEntry.get();
  }

  @Override
  public long ine() {
    return this.idx;
  }

  @Override
  public boolean next() throws IOException {

    boolean _isHn = this.iOCursorInrConsensusLogEntryData.next();
    if (_isHn) {
      this.cursorValueCretConsensusLogEntry.set(
          this.iOCursorInrConsensusLogEntryData.get().getConsensusLogEntry());
      ++this.idx;
    } else {
      this.cursorValueCretConsensusLogEntry.invalidate();
    }

    return _isHn;
  }
}
