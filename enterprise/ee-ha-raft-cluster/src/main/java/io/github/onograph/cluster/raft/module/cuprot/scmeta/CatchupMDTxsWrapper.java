package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import org.neo4j.internal.helpers.collection.LongRange;


public class CatchupMDTxsWrapper {


  private static final long NO_REUE_TXS_UID = -1L;


  private final long lgIts;


  private final long lgTr;

  private CatchupMDTxsWrapper(long _lgIts, long _lgTr) {
    if (_lgIts < 0L) {

      throw new IllegalArgumentException("*** Error: 478bfec2-6cd8-4f23-bf1b-b7443af9f7df");
    } else {
      this.lgIts = _lgIts;
      this.lgTr = _lgTr;
    }
  }


  static CatchupMDTxsWrapper nocotiCatchupMDTxsWrapper(long _lgIthm) {
    return new CatchupMDTxsWrapper(_lgIthm, -1L);
  }


  static CatchupMDTxsWrapper reueraeCatchupMDTxsWrapper(long _lgItr, long _lgIts) {
    LongRange.assertIsRange(_lgIts, _lgItr);
    return new CatchupMDTxsWrapper(_lgIts, _lgItr);
  }


  public long getLgIts() {
    return this.lgIts;
  }


  long getLgTr() {
    return this.lgTr;
  }


  boolean isNoreidti() {
    return this.lgTr == -1L;
  }


}
