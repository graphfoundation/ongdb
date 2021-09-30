package io.github.onograph.cluster.raft.share.calg.cle.parts;

import io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntryData;
import io.github.onograph.cluster.raft.share.sync.SyncableData;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.function.Function;
import org.neo4j.cursor.IOCursor;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.fs.PhysicalFlushableChannel;
import org.neo4j.io.fs.ReadAheadChannel;
import org.neo4j.io.fs.StoreChannel;
import org.neo4j.io.marshal.ChannelMarshal;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.io.memory.HeapScopedBuffer;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.memory.MemoryTracker;


class RepairManager {


  private static final PartRecordDataHeaderSafeChannelMarshal hedmslPartRecordDataHeaderSafeChannelMarshal = new PartRecordDataHeaderSafeChannelMarshal();


  private final FileSystemAbstraction fileSystemAbstraction;


  private final Function<Integer, ChannelMarshal<SyncableData>> functionMsic;


  private final Log log;


  private final LogProvider logProvider;


  private final MemoryTracker memoryTracker;


  private final LogFilePathManager nfLogFilePathManager;


  private final StoreFileWrapperFASManager prStoreFileWrapperFASManager;


  RepairManager(FileSystemAbstraction _fileSystemAbstraction,
      Function<Integer, ChannelMarshal<SyncableData>> _functionSmic, LogProvider _logProvider,
      MemoryTracker _memoryTracker, LogFilePathManager _nfLogFilePathManager,
      StoreFileWrapperFASManager _prStoreFileWrapperFASManager) {
    this.fileSystemAbstraction = _fileSystemAbstraction;
    this.nfLogFilePathManager = _nfLogFilePathManager;
    this.prStoreFileWrapperFASManager = _prStoreFileWrapperFASManager;
    this.functionMsic = _functionSmic;
    this.logProvider = _logProvider;
    this.log = _logProvider.getLog(this.getClass());
    this.memoryTracker = _memoryTracker;
  }


  private static void _chsnnbmt(long _lgNsh, long _lgNsnf)
      throws TransactionLogKernelException {
    if (_lgNsh != _lgNsnf) {

      throw new TransactionLogKernelException("*** Error:  21a7d43d-6a14-4747-a575-80e544478e62",
          _lgNsh, _lgNsnf);
    }
  }


  private static void _chsnnbsqe(long _lgNse, long _lgNsnf)
      throws TransactionLogKernelException {
    if (_lgNsnf != _lgNse) {

      throw new TransactionLogKernelException("*** Error:  1a468ef2-3aae-4e2a-bf98-f59241801d95",
          _lgNse, _lgNsnf);
    }
  }


  private static PartRecordDataHeader _lodharPartRecordDataHeader(
      FileSystemAbstraction _fileSystemAbstraction, MemoryTracker _memoryTracker, Path _path)
      throws IOException, EndOfStreamException {

    StoreChannel _storeChannel = _fileSystemAbstraction.read(_path);

    PartRecordDataHeader _partRecordDataHeader;
    try {
      _partRecordDataHeader = hedmslPartRecordDataHeaderSafeChannelMarshal
          .unmarshal(new ReadAheadChannel(_storeChannel,
              new HeapScopedBuffer(PartRecordDataHeader.EXST_RCD_OFS, _memoryTracker)));
    } catch (

        Throwable _throwable) {
      if (_storeChannel != null) {
        try {
          _storeChannel.close();
        } catch (

            Throwable _throwable2) {
          _throwable.addSuppressed(_throwable2);
        }
      }

      throw _throwable;
    }

    if (_storeChannel != null) {
      _storeChannel.close();
    }

    return _partRecordDataHeader;
  }


  private static void _wrtheeForFiPaPaMe(FileSystemAbstraction _fileSystemAbstraction,
      PartRecordDataHeader hdrByte, MemoryTracker _memoryTracker, Path _pfPath)
      throws IOException {

    StoreChannel _storeChannel = _fileSystemAbstraction.write(_pfPath);

    try {
      _storeChannel.position(0L);

      PhysicalFlushableChannel _wiePhysicalFlushableChannel =
          new PhysicalFlushableChannel(_storeChannel,
              new HeapScopedBuffer(PartRecordDataHeader.EXST_RCD_OFS, _memoryTracker));

      try {
        hedmslPartRecordDataHeaderSafeChannelMarshal.marshal(hdrByte, _wiePhysicalFlushableChannel);
        _wiePhysicalFlushableChannel.prepareForFlush().flush();
      } catch (

          Throwable _throwable) {
        try {
          _wiePhysicalFlushableChannel.close();
        } catch (

            Throwable _throwable2) {
          _throwable.addSuppressed(_throwable2);
        }

        throw _throwable;
      }

      _wiePhysicalFlushableChannel.close();
    } catch (

        Throwable _throwable3) {
      if (_storeChannel != null) {
        try {
          _storeChannel.close();
        } catch (

            Throwable _throwable4) {
          _throwable3.addSuppressed(_throwable4);
        }
      }

      throw _throwable3;
    }

    if (_storeChannel != null) {
      _storeChannel.close();
    }
  }


  TransactionLogPartMeta runTransactionLogPartMeta()
      throws IOException, TransactionLogKernelException, TransactionLogPartMissingException {

    SortedMap<Long, Path> _sortedMapFlslp = this.nfLogFilePathManager.geafeSortedMap(
        this.fileSystemAbstraction, this.log);
    if (_sortedMapFlslp.entrySet().isEmpty()) {

      TransactionLogParts _sgetTransactionLogParts =
          new TransactionLogParts(this.fileSystemAbstraction, this.functionMsic, -1L,
              Collections.emptyList(), this.logProvider,
              this.memoryTracker, this.nfLogFilePathManager, this.prStoreFileWrapperFASManager);
      _sgetTransactionLogParts.roaTransactionLogPartFileSystemWrapper(-1L, -1L, -1L);

      CandidateTermWrapper _trsCandidateTermWrapper = new CandidateTermWrapper(-1L, -1L);
      return new TransactionLogPartMeta(_sgetTransactionLogParts, _trsCandidateTermWrapper);
    } else {

      List<TransactionLogPartFileSystemWrapper> _listFsTransactionLogPartFileSystemWrapper = new ArrayList();

      TransactionLogPartFileSystemWrapper _sgetTransactionLogPartFileSystemWrapper = null;

      long _lgNse = _sortedMapFlslp.firstKey();

      boolean _isHlrm = false;

      boolean _isSk = true;

      long befIdx = -1L;

      long befTLng = -1L;

      Path _fpPath;
      for (

          Iterator _iterator = _sortedMapFlslp.entrySet().iterator(); _iterator.hasNext();
          ++_lgNse) {

        Entry<Long, Path> _entryEtylp = (Entry) _iterator.next();

        long _lgNsf = _entryEtylp.getKey();
        _fpPath = _entryEtylp.getValue();
        _chsnnbsqe(_lgNse, _lgNsf);

        PartRecordDataHeader hdrByte;
        try {
          hdrByte = _lodharPartRecordDataHeader(this.fileSystemAbstraction, this.memoryTracker,
              _fpPath);
          _chsnnbmt(hdrByte.getLgNs(), _lgNsf);
        } catch (

            EndOfStreamException _endOfStreamException) {
          if (_sortedMapFlslp.lastKey() != _lgNsf) {

            throw new TransactionLogKernelException(_endOfStreamException,
                "*** Error:  1f7aace5-6cfe-4995-b03a-e22e0f630c5f", _fpPath);
          }

          if (_sortedMapFlslp.size() == 1) {

            throw new TransactionLogKernelException(_endOfStreamException,
                "*** Error:  a1c038eb-2365-4e66-ac8c-ef3b71ead3fd", _fpPath);
          }

          _isHlrm = true;
          break;
        }

        _sgetTransactionLogPartFileSystemWrapper = new TransactionLogPartFileSystemWrapper(
            this.functionMsic.apply(hdrByte.getIVf()), this.fileSystemAbstraction, hdrByte, _lgNsf,
            this.logProvider,
            this.memoryTracker, _fpPath, this.prStoreFileWrapperFASManager);
        _listFsTransactionLogPartFileSystemWrapper.add(_sgetTransactionLogPartFileSystemWrapper);
        if (_sgetTransactionLogPartFileSystemWrapper.getHdrByte().getBefIdx()
            != _sgetTransactionLogPartFileSystemWrapper.getHdrByte().getLstFIdx()) {

          _isSk = true;
        }

        if (_isSk) {
          befIdx = _sgetTransactionLogPartFileSystemWrapper.getHdrByte().getBefIdx();
          befTLng = _sgetTransactionLogPartFileSystemWrapper.getHdrByte().getBefTLng();
          _isSk = false;
        }
      }

      assert _sgetTransactionLogPartFileSystemWrapper != null;

      long _lgIa = _sgetTransactionLogPartFileSystemWrapper.getHdrByte().getBefIdx();

      CandidateTermWrapper _trsCandidateTermWrapper2 = new CandidateTermWrapper(
          _sgetTransactionLogPartFileSystemWrapper.getHdrByte().getBefIdx(),
          _sgetTransactionLogPartFileSystemWrapper.getHdrByte().getBefTLng());

      IOCursor<ConsensusLogEntryData> _iOCursorCroConsensusLogEntryData =
          _sgetTransactionLogPartFileSystemWrapper.gecsIOCursor(
              _sgetTransactionLogPartFileSystemWrapper.getHdrByte().getBefIdx() + 1L);

      try {
        while (_iOCursorCroConsensusLogEntryData.next()) {

          ConsensusLogEntryData _consensusLogEntryData = _iOCursorCroConsensusLogEntryData.get();
          _lgIa = _consensusLogEntryData.getLgIdx();
          _trsCandidateTermWrapper2.ape(_lgIa,
              _consensusLogEntryData.getConsensusLogEntry().getLgTe());
        }
      } catch (

          Throwable _throwable) {
        if (_iOCursorCroConsensusLogEntryData != null) {
          try {
            _iOCursorCroConsensusLogEntryData.close();
          } catch (

              Throwable _throwable2) {
            _throwable.addSuppressed(_throwable2);
          }
        }

        throw _throwable;
      }

      if (_iOCursorCroConsensusLogEntryData != null) {
        _iOCursorCroConsensusLogEntryData.close();
      }

      if (_isHlrm) {

        PartRecordDataHeader hdrByte = PartRecordDataHeader.cresehaPartRecordDataHeader(_lgIa,
            _trsCandidateTermWrapper2.lae(), _lgNse, _lgIa);

        _fpPath = this.nfLogFilePathManager.gefsmtPath(_lgNse);
        _wrtheeForFiPaPaMe(this.fileSystemAbstraction, hdrByte, this.memoryTracker, _fpPath);
        _sgetTransactionLogPartFileSystemWrapper = new TransactionLogPartFileSystemWrapper(
            this.functionMsic.apply(hdrByte.getIVf()), this.fileSystemAbstraction, hdrByte, _lgNse,
            this.logProvider,
            this.memoryTracker, _fpPath, this.prStoreFileWrapperFASManager);
        _listFsTransactionLogPartFileSystemWrapper.add(_sgetTransactionLogPartFileSystemWrapper);
      }

      TransactionLogParts _sgetTransactionLogParts2 = new TransactionLogParts(
          this.fileSystemAbstraction, this.functionMsic,
          _sgetTransactionLogPartFileSystemWrapper.getHdrByte().getLgNs(),
          _listFsTransactionLogPartFileSystemWrapper, this.logProvider,
          this.memoryTracker, this.nfLogFilePathManager,
          this.prStoreFileWrapperFASManager);
      return new TransactionLogPartMeta(befIdx, befTLng, _lgIa, _sgetTransactionLogParts2,
          _trsCandidateTermWrapper2);
    }
  }
}
