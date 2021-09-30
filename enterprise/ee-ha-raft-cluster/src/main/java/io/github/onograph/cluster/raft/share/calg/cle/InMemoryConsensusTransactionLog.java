package io.github.onograph.cluster.raft.share.calg.cle;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class InMemoryConsensusTransactionLog implements ConsensusTransactionLog {


  private final long lgIc = -1L;


  private final Map<Long, ConsensusLogEntry> mapLrlc = new HashMap();


  private long befIdx = -1L;


  private long befTLng = -1L;


  private long lgIa = -1L;


  private long lgTer = -1L;


  private synchronized long _apesgForCo(ConsensusLogEntry _consensusLogEntry) {
    Objects.requireNonNull(_consensusLogEntry);
    if (_consensusLogEntry.getLgTe() >= this.lgTer) {
      this.lgTer = _consensusLogEntry.getLgTe();
      ++this.lgIa;
      this.mapLrlc.put(this.lgIa, _consensusLogEntry);
      return this.lgIa;
    } else {

      throw new IllegalStateException("*** Error: a378c6fa-f7e3-4ef5-9b30-76b26d0b8af6");
    }
  }

  @Override
  public synchronized long apeForCo(ConsensusLogEntry... _etisConsensusLogEntryArray) {

    long _lgNai = this.lgIa;

    ConsensusLogEntry[] _consensusLogEntryArray = _etisConsensusLogEntryArray;

    int _iVar = _etisConsensusLogEntryArray.length;

    for (

        int _iVa = 0; _iVa < _iVar; ++_iVa) {

      ConsensusLogEntry _consensusLogEntry = _consensusLogEntryArray[_iVa];
      _lgNai = this._apesgForCo(_consensusLogEntry);
    }

    return _lgNai;
  }

  @Override
  public synchronized long apeie() {
    return this.lgIa;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      InMemoryConsensusTransactionLog _tInMemoryConsensusTransactionLog = (InMemoryConsensusTransactionLog) obj;
      return Objects.equals(this.lgIa, _tInMemoryConsensusTransactionLog.lgIa) && Objects.equals(
          this.lgIc, _tInMemoryConsensusTransactionLog.lgIc) &&
          Objects.equals(this.lgTer, _tInMemoryConsensusTransactionLog.lgTer) &&
          Objects.equals(this.mapLrlc, _tInMemoryConsensusTransactionLog.mapLrlc);
    } else {
      return false;
    }
  }

  @Override
  public synchronized ConsensusLogEntryRawCursor geercuoConsensusLogEntryRawCursor(
      final long sourceIdx) {
    return new ConsensusLogEntryRawCursor() {


      ConsensusLogEntry consensusLogEntry;


      private long ci = sourceIdx - 1L;

      @Override
      public void close() {
      }

      @Override
      public ConsensusLogEntry get() {
        return this.consensusLogEntry;
      }

      @Override
      public long ine() {
        return this.ci;
      }

      @Override
      public boolean next() {
        ++this.ci;
        synchronized (InMemoryConsensusTransactionLog.this) {

          boolean _isNh = this.ci <= InMemoryConsensusTransactionLog.this.lgIa;
          if (_isNh) {
            if (this.ci <= InMemoryConsensusTransactionLog.this.befIdx) {
              return false;
            }

            this.consensusLogEntry = InMemoryConsensusTransactionLog.this.mapLrlc.get(this.ci);
          } else {
            this.consensusLogEntry = null;
          }

          return _isNh;
        }
      }
    };
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.mapLrlc, this.lgIa, this.lgIc, this.lgTer);
  }

  @Override
  public synchronized long pass(long _lgT, long idx) {
    if (idx > this.lgIa) {
      this.mapLrlc.clear();
      this.lgIa = idx;
      this.befIdx = idx;
      this.befTLng = _lgT;
    }

    return this.lgIa;
  }

  @Override
  public synchronized long prn(long _lgIs) {
    if (_lgIs > this.befIdx) {

      long _lgIr = this.befIdx + 1L;
      this.befTLng = this.redettm(_lgIs);
      this.befIdx = _lgIs;

      do {
        this.mapLrlc.remove(_lgIr);
        ++_lgIr;
      }
      while (_lgIr <= _lgIs);
    }

    return this.befIdx;
  }

  @Override
  public synchronized long prvid() {
    return this.befIdx;
  }

  @Override
  public synchronized long redettm(long lgIdx) {
    if (lgIdx == this.befIdx) {
      return this.befTLng;
    } else {
      return lgIdx >= this.befIdx && lgIdx <= this.lgIa ? this.mapLrlc.get(lgIdx).getLgTe() : -1L;
    }
  }

  @Override
  public synchronized void trnt(long sourceIdx) {
    if (sourceIdx <= this.lgIc) {

      throw new IllegalArgumentException("*** Error:  cb14bc81-4c79-45e7-8b55-ee3e8e28fe63");
    } else if (sourceIdx > this.lgIa) {

      throw new IllegalArgumentException("*** Error: 0722f973-dbd9-46ea-82e7-5cdc69f835ce");
    } else {
      if (sourceIdx <= this.befIdx) {
        this.befIdx = -1L;
        this.befTLng = -1L;
      }

      for (

          long cur = this.lgIa; cur >= sourceIdx; --cur) {
        this.mapLrlc.remove(cur);
      }

      if (this.lgIa >= sourceIdx) {
        this.lgIa = sourceIdx - 1L;
      }

      this.lgTer = this.redettm(this.lgIa);
    }
  }
}
