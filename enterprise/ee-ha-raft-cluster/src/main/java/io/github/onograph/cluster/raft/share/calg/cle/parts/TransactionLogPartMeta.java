package io.github.onograph.cluster.raft.share.calg.cle.parts;


class TransactionLogPartMeta {


  private final TransactionLogParts sgetTransactionLogParts;


  private final CandidateTermWrapper trsCandidateTermWrapper;


  private long befIdx;


  private long befTLng;


  private long lgIa;

  TransactionLogPartMeta(TransactionLogParts _sgetTransactionLogParts,
      CandidateTermWrapper _trsCandidateTermWrapper) {
    this(-1L, -1L, -1L, _sgetTransactionLogParts, _trsCandidateTermWrapper);
  }


  TransactionLogPartMeta(long befIdx, long befTLng, long _lgIa,
      TransactionLogParts _sgetTransactionLogParts, CandidateTermWrapper _trsCandidateTermWrapper) {
    this.befIdx = befIdx;
    this.befTLng = befTLng;
    this.lgIa = _lgIa;
    this.sgetTransactionLogParts = _sgetTransactionLogParts;
    this.trsCandidateTermWrapper = _trsCandidateTermWrapper;
  }


  long getBefIdx() {
    return this.befIdx;
  }


  long getBefTLng() {
    return this.befTLng;
  }


  long getLgIa() {
    return this.lgIa;
  }


  TransactionLogParts getSgetTransactionLogParts() {
    return this.sgetTransactionLogParts;
  }


  CandidateTermWrapper getTrsCandidateTermWrapper() {
    return this.trsCandidateTermWrapper;
  }


  void seaeie(long _lgIa) {
    this.lgIa = _lgIa;
  }


  void sepvid(long befIdx) {
    this.befIdx = befIdx;
  }


  void sepvtr(long befTLng) {
    this.befTLng = befTLng;
  }


}
