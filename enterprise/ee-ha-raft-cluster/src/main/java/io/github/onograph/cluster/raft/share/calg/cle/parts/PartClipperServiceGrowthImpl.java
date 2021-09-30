package io.github.onograph.cluster.raft.share.calg.cle.parts;

import java.io.IOException;
import java.io.UncheckedIOException;
import org.neo4j.internal.helpers.collection.Visitor;


class PartClipperServiceGrowthImpl implements PartClipperService,
    Visitor<TransactionLogPartFileSystemWrapper, RuntimeException> {


  private final long lgBtk;


  private long lgSa;


  private TransactionLogPartFileSystemWrapper transactionLogPartFileSystemWrapper;

  PartClipperServiceGrowthImpl(long _lgKtb) {
    this.lgBtk = _lgKtb;
  }

  @Override
  public synchronized long geietokeForTr(TransactionLogParts _sgetTransactionLogParts) {
    this.lgSa = 0L;
    this.transactionLogPartFileSystemWrapper = null;
    _sgetTransactionLogParts.viibawdForVi(this);
    return this.transactionLogPartFileSystemWrapper != null ?
        this.transactionLogPartFileSystemWrapper.getHdrByte().getBefIdx() + 1L : -1L;
  }

  @Override
  public boolean visit(
      TransactionLogPartFileSystemWrapper _sgetTransactionLogPartFileSystemWrapper) {
    if (this.lgSa < this.lgBtk) {
      this.transactionLogPartFileSystemWrapper = _sgetTransactionLogPartFileSystemWrapper;

      try {
        this.lgSa += this.transactionLogPartFileSystemWrapper.getFileSize();
        return false;
      } catch (

          IOException _iOException) {
        throw new UncheckedIOException(_iOException);
      }
    } else {
      return true;
    }
  }
}
