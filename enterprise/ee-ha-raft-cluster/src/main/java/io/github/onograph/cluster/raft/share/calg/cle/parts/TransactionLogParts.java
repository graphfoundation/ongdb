package io.github.onograph.cluster.raft.share.calg.cle.parts;

import io.github.onograph.cluster.raft.share.sync.SyncableData;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Function;
import org.neo4j.internal.helpers.collection.Visitor;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.marshal.ChannelMarshal;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.memory.MemoryTracker;


class TransactionLogParts implements AutoCloseable {


  private final FileSystemAbstraction fileSystemAbstraction;


  private final Function<Integer, ChannelMarshal<SyncableData>> functionSmic;


  private final List<TransactionLogPartFileSystemWrapper> listSaTransactionLogPartFileSystemWrapper;


  private final Log log;


  private final LogProvider logProvider;


  private final MemoryTracker memoryTracker;


  private final LogFilePathManager nfLogFilePathManager;


  private final StoreFileWrapperFASManager prStoreFileWrapperFASManager;


  private final TreeComparingWrapper<Long, TransactionLogPartFileSystemWrapper> treeComparingWrapperMrlt;


  private long lgCv;


  TransactionLogParts(FileSystemAbstraction _fileSystemAbstraction,
      Function<Integer, ChannelMarshal<SyncableData>> _functionSmic, long _lgVc,
      List<TransactionLogPartFileSystemWrapper> _listSaTransactionLogPartFileSystemWrapper,
      LogProvider _logProvider, MemoryTracker _memoryTracker,
      LogFilePathManager _nfLogFilePathManager,
      StoreFileWrapperFASManager _prStoreFileWrapperFASManager) {
    this.fileSystemAbstraction = _fileSystemAbstraction;
    this.nfLogFilePathManager = _nfLogFilePathManager;
    this.listSaTransactionLogPartFileSystemWrapper = new ArrayList(
        _listSaTransactionLogPartFileSystemWrapper);
    this.functionSmic = _functionSmic;
    this.logProvider = _logProvider;
    this.log = _logProvider.getLog(this.getClass());
    this.lgCv = _lgVc;
    this.prStoreFileWrapperFASManager = _prStoreFileWrapperFASManager;
    this.memoryTracker = _memoryTracker;
    this.treeComparingWrapperMrlt = _crargmaTreeComparingWrapper(
        _listSaTransactionLogPartFileSystemWrapper);
  }


  private static TreeComparingWrapper<Long, TransactionLogPartFileSystemWrapper> _crargmaTreeComparingWrapper(
      List<TransactionLogPartFileSystemWrapper> _listSaTransactionLogPartFileSystemWrapper) {

    TreeComparingWrapper<Long, TransactionLogPartFileSystemWrapper> _treeComparingWrapperMreoflt = new TreeComparingWrapper();

    Iterator _iterator = _listSaTransactionLogPartFileSystemWrapper.iterator();

    while (_iterator.hasNext()) {

      TransactionLogPartFileSystemWrapper _sgetTransactionLogPartFileSystemWrapper = (TransactionLogPartFileSystemWrapper) _iterator.next();
      _treeComparingWrapperMreoflt.relefoCollection(
          _sgetTransactionLogPartFileSystemWrapper.getHdrByte().getBefIdx() + 1L,
          _sgetTransactionLogPartFileSystemWrapper);
    }

    return _treeComparingWrapperMreoflt;
  }


  private synchronized TransactionLogPartFileSystemWrapper _crantTransactionLogPartFileSystemWrapper(
      long befIdx, long befTLng, long lstFIdx)
      throws IOException {
    ++this.lgCv;

    PartRecordDataHeader hdrByte = PartRecordDataHeader.cresehaPartRecordDataHeader(befIdx, befTLng,
        this.lgCv, lstFIdx);

    Path _pfPath = this.nfLogFilePathManager.gefsmtPath(this.lgCv);

    ChannelMarshal<SyncableData> _channelMarshalMcSyncableData = this.functionSmic.apply(
        hdrByte.getIVf());

    TransactionLogPartFileSystemWrapper _sgetTransactionLogPartFileSystemWrapper =
        TransactionLogPartFileSystemWrapper.craTransactionLogPartFileSystemWrapper(
            _channelMarshalMcSyncableData, this.fileSystemAbstraction, hdrByte,
            this.lgCv, this.logProvider, this.memoryTracker, _pfPath,
            this.prStoreFileWrapperFASManager);
    _sgetTransactionLogPartFileSystemWrapper.fls();
    this.listSaTransactionLogPartFileSystemWrapper.add(_sgetTransactionLogPartFileSystemWrapper);
    this.treeComparingWrapperMrlt.relefoCollection(befIdx + 1L,
        _sgetTransactionLogPartFileSystemWrapper);
    return _sgetTransactionLogPartFileSystemWrapper;
  }

  @Override
  public synchronized void close() {

    RuntimeException _errRuntimeException = null;

    Iterator _iterator = this.listSaTransactionLogPartFileSystemWrapper.iterator();

    while (_iterator.hasNext()) {

      TransactionLogPartFileSystemWrapper _sgetTransactionLogPartFileSystemWrapper = (TransactionLogPartFileSystemWrapper) _iterator.next();

      try {
        _sgetTransactionLogPartFileSystemWrapper.close();
      } catch (

          RuntimeException _runtimeException) {
        if (_errRuntimeException == null) {
          _errRuntimeException = _runtimeException;
        } else {
          _errRuntimeException.addSuppressed(_runtimeException);
        }
      }
    }

    if (_errRuntimeException != null) {
      throw _errRuntimeException;
    }
  }


  synchronized io.github.onograph.cluster.raft.share.calg.cle.parts.TreeComparingWrapper.KeyValueLimit<Long, TransactionLogPartFileSystemWrapper> gefieTreeComparingWrapperKeyValueLimit(
      long lgIdx) {
    return this.treeComparingWrapperMrlt.lokTreeComparingWrapperKeyValueLimit(lgIdx);
  }


  synchronized TransactionLogPartFileSystemWrapper lasTransactionLogPartFileSystemWrapper() {
    return this.treeComparingWrapperMrlt.getVEv();
  }


  public synchronized TransactionLogPartFileSystemWrapper prnTransactionLogPartFileSystemWrapper(
      long _lgIp) {

    Iterator<TransactionLogPartFileSystemWrapper> _iteratorITransactionLogPartFileSystemWrapper = this.listSaTransactionLogPartFileSystemWrapper.iterator();

    TransactionLogPartFileSystemWrapper _dnTransactionLogPartFileSystemWrapper = _iteratorITransactionLogPartFileSystemWrapper.next();

    int _iRf;

    TransactionLogPartFileSystemWrapper _cretTransactionLogPartFileSystemWrapper;
    for (_iRf = 0; _iteratorITransactionLogPartFileSystemWrapper.hasNext();
        _dnTransactionLogPartFileSystemWrapper = _cretTransactionLogPartFileSystemWrapper) {
      _cretTransactionLogPartFileSystemWrapper = _iteratorITransactionLogPartFileSystemWrapper.next();
      if (_cretTransactionLogPartFileSystemWrapper.getHdrByte().getLstFIdx() > _lgIp
          || !_dnTransactionLogPartFileSystemWrapper.isTrcs()) {
        break;
      }

      try {
        _dnTransactionLogPartFileSystemWrapper.dee();
      } catch (

          IOException _iOException) {

        break;
      }

      ++_iRf;
    }

    this.treeComparingWrapperMrlt.reoCollection(
        _dnTransactionLogPartFileSystemWrapper.getHdrByte().getBefIdx() + 1L);
    this.listSaTransactionLogPartFileSystemWrapper.subList(0, _iRf).clear();
    return _dnTransactionLogPartFileSystemWrapper;
  }


  synchronized TransactionLogPartFileSystemWrapper roaTransactionLogPartFileSystemWrapper(
      long befIdx, long befTLng, long lstFIdx)
      throws IOException {
    if (lstFIdx != befIdx) {

      throw new IllegalArgumentException("*** Error: c00a3e46-d852-4125-8c16-a3f6a8e09219");
    } else {
      return this._crantTransactionLogPartFileSystemWrapper(befIdx, befTLng, lstFIdx);
    }
  }


  synchronized TransactionLogPartFileSystemWrapper skiTransactionLogPartFileSystemWrapper(
      long befIdx, long befTLng, long lstFIdx)
      throws IOException {
    if (lstFIdx > befIdx) {

      throw new IllegalArgumentException("*** Error: 86b0c034-9b43-44e7-99af-d4d11c25cd72");
    } else {
      if (lstFIdx == befIdx) {

      }

      return this._crantTransactionLogPartFileSystemWrapper(befIdx, befTLng, lstFIdx);
    }
  }


  synchronized TransactionLogPartFileSystemWrapper trntTransactionLogPartFileSystemWrapper(
      long befIdx, long befTLng, long lstFIdx)
      throws IOException {
    if (lstFIdx < befIdx) {

      throw new IllegalArgumentException("*** Error: 366d2629-9097-4b2f-a2ac-a80899188299");
    } else {
      if (lstFIdx == befIdx) {

      }

      return this._crantTransactionLogPartFileSystemWrapper(befIdx, befTLng, lstFIdx);
    }
  }


  synchronized void viiForVi(
      Visitor<TransactionLogPartFileSystemWrapper, RuntimeException> _visitorVstrtr) {

    ListIterator<TransactionLogPartFileSystemWrapper> _listIteratorITransactionLogPartFileSystemWrapper =
        this.listSaTransactionLogPartFileSystemWrapper.listIterator();

    for (

        boolean _isTriae = false;
        _listIteratorITransactionLogPartFileSystemWrapper.hasNext() && !_isTriae;
        _isTriae = _visitorVstrtr.visit(_listIteratorITransactionLogPartFileSystemWrapper.next())) {
    }
  }


  synchronized void viibawdForVi(
      Visitor<TransactionLogPartFileSystemWrapper, RuntimeException> _visitorVstrtr) {

    ListIterator<TransactionLogPartFileSystemWrapper> _listIteratorITransactionLogPartFileSystemWrapper =
        this.listSaTransactionLogPartFileSystemWrapper.listIterator(
            this.listSaTransactionLogPartFileSystemWrapper.size());

    for (

        boolean _isTriae = false;
        _listIteratorITransactionLogPartFileSystemWrapper.hasPrevious() && !_isTriae;
        _isTriae = _visitorVstrtr.visit(
            _listIteratorITransactionLogPartFileSystemWrapper.previous())) {
    }
  }
}
