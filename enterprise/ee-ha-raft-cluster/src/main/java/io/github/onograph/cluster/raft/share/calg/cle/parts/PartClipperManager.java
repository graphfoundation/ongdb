package io.github.onograph.cluster.raft.share.calg.cle.parts;


class PartClipperManager {


  private final PartClipperService psPartClipperService;

  PartClipperManager(PartClipperService _spPartClipperService) {
    this.psPartClipperService = _spPartClipperService;
  }


  long geidtpfForTr(long _lgIs, TransactionLogParts _sgetTransactionLogParts) {
    return Math.min(_lgIs, this.psPartClipperService.geietokeForTr(_sgetTransactionLogParts));
  }
}
