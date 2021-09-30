package io.github.onograph.cluster.raft.share.calg.cle.parts;

import org.neo4j.internal.helpers.collection.Visitor;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


class PartClipperServiceTransactionLogEntryImpl implements PartClipperService {


  private final long lgKte;


  private final Log log;

  PartClipperServiceTransactionLogEntryImpl(long _lgKte, LogProvider _logProvider) {
    this.lgKte = _lgKte;
    this.log = _logProvider.getLog(this.getClass());
  }

  @Override
  public long geietokeForTr(TransactionLogParts _sgetTransactionLogParts) {

    io.github.onograph.cluster.raft.share.calg.cle.parts.PartClipperServiceTransactionLogEntryImpl.TransactionLogPartFileSystemWrapperVisitor
        _transactionLogPartFileSystemWrapperVisitor =
        new io.github.onograph.cluster.raft.share.calg.cle.parts.PartClipperServiceTransactionLogEntryImpl.TransactionLogPartFileSystemWrapperVisitor();
    _sgetTransactionLogParts.viibawdForVi(_transactionLogPartFileSystemWrapperVisitor);
    if (_transactionLogPartFileSystemWrapperVisitor.viidcu == 0L) {

    }

    return _transactionLogPartFileSystemWrapperVisitor.befIdx;
  }


  private class TransactionLogPartFileSystemWrapperVisitor implements
      Visitor<TransactionLogPartFileSystemWrapper, RuntimeException> {


    long acule;


    long befIdx = -1L;


    long latpeinx = -1L;


    long viidcu;

    @Override
    public boolean visit(
        TransactionLogPartFileSystemWrapper _sgetTransactionLogPartFileSystemWrapper)
        throws RuntimeException {
      ++this.viidcu;
      if (this.latpeinx == -1L) {
        this.latpeinx = _sgetTransactionLogPartFileSystemWrapper.getHdrByte().getBefIdx();
        return false;
      } else {
        this.befIdx = _sgetTransactionLogPartFileSystemWrapper.getHdrByte().getBefIdx();
        this.acule += this.latpeinx - this.befIdx;
        this.latpeinx = this.befIdx;
        return this.acule >= PartClipperServiceTransactionLogEntryImpl.this.lgKte;
      }
    }
  }
}
