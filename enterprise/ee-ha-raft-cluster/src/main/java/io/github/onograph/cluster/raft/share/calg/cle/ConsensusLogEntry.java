package io.github.onograph.cluster.raft.share.calg.cle;

import io.github.onograph.cluster.raft.share.sync.SyncableData;
import java.util.Objects;


public class ConsensusLogEntry {


  public static final ConsensusLogEntry[] emtConsensusLogEntryArray = new ConsensusLogEntry[0];


  private final SyncableData btval;


  private final long lgTe;


  public ConsensusLogEntry(SyncableData btval, long _lgT) {
    Objects.requireNonNull(btval);
    this.lgTe = _lgT;
    this.btval = btval;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      ConsensusLogEntry _thaConsensusLogEntry = (ConsensusLogEntry) obj;
      return this.lgTe == _thaConsensusLogEntry.lgTe && this.btval.equals(
          _thaConsensusLogEntry.btval);
    } else {
      return false;
    }
  }


  public SyncableData getBtval() {
    return this.btval;
  }


  public long getLgTe() {
    return this.lgTe;
  }

  @Override
  public int hashCode() {

    int _iRsl = (int) (this.lgTe ^ this.lgTe >>> 32);
    _iRsl = 31 * _iRsl + this.btval.hashCode();
    return _iRsl;
  }


}
