package io.github.onograph.cluster.raft.share.calg.mnode;

import io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLogEntry;
import io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeFollowerMeta;
import java.time.Clock;


class AgreementManager {


  static final long LIMT_RON = 10L;


  private final Clock clock;


  private final long lgTc;


  private final long lgTr;


  private final long lgTs;


  private final ConsensusTransactionLogEntry lrConsensusTransactionLogEntry;


  private boolean isAg;


  private boolean isFnse;


  private long lgCr;


  private long lgIt;


  private long lgRst;


  AgreementManager(Clock _clock, long _lgTc, long _lgTr,
      ConsensusTransactionLogEntry _lrConsensusTransactionLogEntry) {
    this.lrConsensusTransactionLogEntry = _lrConsensusTransactionLogEntry;
    this.clock = _clock;
    this.lgTr = _lgTr;
    this.lgTc = _lgTc;
    this.lgIt = _lrConsensusTransactionLogEntry.apeie();
    this.lgTs = _clock.millis();
    this.lgRst = _clock.millis();
    this.lgCr = 1L;
  }


  boolean getIsAg() {
    return this.isAg;
  }


  boolean getIsFnse() {
    return this.isFnse;
  }


  void upapgsForCo(ConsensusNodeFollowerMeta _fsConsensusNodeFollowerMeta) {
    if (!this.isFnse) {

      boolean _isTa = _fsConsensusNodeFollowerMeta.getLgIm() >= this.lgIt;
      if (_isTa && this.clock.millis() - this.lgRst <= this.lgTr) {
        this.isAg = true;
        this.isFnse = true;
      } else if (this.clock.millis() > this.lgTs + this.lgTc) {
        this.isFnse = true;
      } else if (_isTa) {
        if (this.lgCr < 10L) {
          ++this.lgCr;
          this.lgRst = this.clock.millis();
          this.lgIt = this.lrConsensusTransactionLogEntry.apeie();
        } else {
          this.isFnse = true;
        }
      }
    }
  }


}
