package io.github.onograph.cluster.raft.share.calg.cle.parts;

import io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry;
import io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntryData;
import io.github.onograph.cluster.raft.share.calg.cle.TransactionLogCoords;
import io.github.onograph.cluster.raft.share.sync.SyncableData;
import java.io.IOException;
import java.nio.file.Path;
import org.neo4j.cursor.EmptyIOCursor;
import org.neo4j.cursor.IOCursor;
import org.neo4j.io.ByteUnit;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.fs.PhysicalFlushableChannel;
import org.neo4j.io.fs.StoreChannel;
import org.neo4j.io.marshal.ChannelMarshal;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.io.memory.NativeScopedBuffer;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.memory.MemoryTracker;


class TransactionLogPartFileSystemWrapper implements AutoCloseable {


  private static final PartRecordDataHeaderSafeChannelMarshal hedmslPartRecordDataHeaderSafeChannelMarshal = new PartRecordDataHeaderSafeChannelMarshal();


  private final ChannelMarshal<SyncableData> channelMarshalMcSyncableData;


  private final TransactionLogCoordinates cpTransactionLogCoordinates;


  private final FileSystemAbstraction fileSystemAbstraction;


  private final PartRecordDataHeader hdrByte;


  private final long lgVrin;


  private final Log log;


  private final MemoryTracker memoryTracker;


  private final Path path;


  private final StoreFileWrapperFASManager prStoreFileWrapperFASManager;


  private final TransactionLogPartStats rcTransactionLogPartStats;


  private PhysicalFlushableChannel wbPhysicalFlushableChannel;


  TransactionLogPartFileSystemWrapper(ChannelMarshal<SyncableData> _channelMarshalMcSyncableData,
      FileSystemAbstraction _fileSystemAbstraction, PartRecordDataHeader hdrByte, long _lgVrin,
      LogProvider _logProvider, MemoryTracker _memoryTracker, Path _path,
      StoreFileWrapperFASManager _prStoreFileWrapperFASManager) {
    this.fileSystemAbstraction = _fileSystemAbstraction;
    this.path = _path;
    this.prStoreFileWrapperFASManager = _prStoreFileWrapperFASManager;
    this.channelMarshalMcSyncableData = _channelMarshalMcSyncableData;
    this.hdrByte = hdrByte;
    this.lgVrin = _lgVrin;
    this.cpTransactionLogCoordinates = new TransactionLogCoordinates(hdrByte.getIOr());
    this.memoryTracker = _memoryTracker;
    this.rcTransactionLogPartStats = new TransactionLogPartStats();
    this.log = _logProvider.getLog(this.getClass());
  }


  static TransactionLogPartFileSystemWrapper craTransactionLogPartFileSystemWrapper(
      ChannelMarshal<SyncableData> _channelMarshalMcSyncableData,
      FileSystemAbstraction _fileSystemAbstraction, PartRecordDataHeader hdrByte, long _lgVrin,
      LogProvider _logProvider, MemoryTracker _memoryTracker, Path _path,
      StoreFileWrapperFASManager _rpStoreFileWrapperFASManager)
      throws IOException {
    if (_fileSystemAbstraction.fileExists(_path)) {

      throw new IllegalStateException("*** Error:  2e253e31-0f82-4476-ae14-a99129fedce2");
    } else {

      TransactionLogPartFileSystemWrapper _sgetTransactionLogPartFileSystemWrapper =
          new TransactionLogPartFileSystemWrapper(_channelMarshalMcSyncableData,
              _fileSystemAbstraction, hdrByte, _lgVrin, _logProvider,
              _memoryTracker, _path, _rpStoreFileWrapperFASManager);
      hedmslPartRecordDataHeaderSafeChannelMarshal.marshal(hdrByte,
          _sgetTransactionLogPartFileSystemWrapper._geocewePhysicalFlushableChannel());
      _sgetTransactionLogPartFileSystemWrapper.fls();
      return _sgetTransactionLogPartFileSystemWrapper;
    }
  }


  private synchronized PhysicalFlushableChannel _geocewePhysicalFlushableChannel()
      throws IOException {
    if (this.wbPhysicalFlushableChannel == null) {
      if (!this.rcTransactionLogPartStats.isInrs()) {

        throw new IOException("*** Error:  827491aa-be0f-4831-afbf-bbd42c99718c");
      }

      StoreChannel _storeChannel = this.fileSystemAbstraction.write(this.path);
      _storeChannel.position(_storeChannel.size());
      this.wbPhysicalFlushableChannel =
          new PhysicalFlushableChannel(_storeChannel,
              new NativeScopedBuffer(ByteUnit.kibiBytes(512L), this.memoryTracker));
    }

    return this.wbPhysicalFlushableChannel;
  }

  @Override
  public void close() {
    this.clswre();
    this.prStoreFileWrapperFASManager.prnForTi(this.lgVrin);
    if (!this.rcTransactionLogPartStats.isTrdpe()) {

      throw new IllegalStateException("*** Error: e51ed3d0-4612-47e2-a5fb-ce89e9665302");
    }
  }


  synchronized void clswre() {
    if (this.wbPhysicalFlushableChannel != null) {
      try {
        this.fls();
        this.wbPhysicalFlushableChannel.close();
      } catch (

          IOException _iOException) {

      } finally {
        this.wbPhysicalFlushableChannel = null;
        this.rcTransactionLogPartStats.ders();
      }
    }
  }


  public void dee() throws IOException {
    this.fileSystemAbstraction.deleteFile(this.path);
  }


  synchronized void fls() throws IOException {
    this.wbPhysicalFlushableChannel.prepareForFlush().flush();
  }


  IOCursor<ConsensusLogEntryData> gecsIOCursor(long lgIdx)
      throws IOException, TransactionLogPartMissingException {
    assert lgIdx > this.hdrByte.getBefIdx();

    if (!this.rcTransactionLogPartStats.isInrs()) {
      throw new TransactionLogPartMissingException();
    } else {

      long _lgIo = lgIdx - (this.hdrByte.getBefIdx() + 1L);

      TransactionLogCoords _pstoTransactionLogCoords = this.cpTransactionLogCoordinates.lokTransactionLogCoords(
          _lgIo);

      StoreChannelFileWrapper RNME = this.prStoreFileWrapperFASManager.acueStoreChannelFileWrapper(
          _pstoTransactionLogCoords.byeoft, this.lgVrin);

      try {

        long _lgCi = _pstoTransactionLogCoords.lgIdx;
        return new DataIOCursor(RNME, this.channelMarshalMcSyncableData, _lgCi, _lgIo,
            this.memoryTracker, this);
      } catch (

          EndOfStreamException _endOfStreamException) {
        this.prStoreFileWrapperFASManager.reeeForSt(RNME);
        this.rcTransactionLogPartStats.ders();
        return EmptyIOCursor.empty();
      } catch (

          IOException _iOException) {
        RNME.close();
        this.rcTransactionLogPartStats.ders();
        throw _iOException;
      }
    }
  }


  String gefemString() {
    return this.path.getFileName().toString();
  }


  TransactionLogCoordinates getCpTransactionLogCoordinates() {
    return this.cpTransactionLogCoordinates;
  }


  public long getFileSize() throws IOException {
    return this.fileSystemAbstraction.getFileSize(this.path);
  }


  public PartRecordDataHeader getHdrByte() {
    return this.hdrByte;
  }


  public StoreFileWrapperFASManager getPrStoreFileWrapperFASManager() {
    return this.prStoreFileWrapperFASManager;
  }


  TransactionLogPartStats getRcTransactionLogPartStats() {
    return this.rcTransactionLogPartStats;
  }


  boolean isTrcs() {
    if (this.rcTransactionLogPartStats.isTrdpe()) {
      this.close();
      return true;
    } else {
      return false;
    }
  }


  synchronized long poio() throws IOException {
    return this._geocewePhysicalFlushableChannel().position();
  }


  public synchronized void wrtForCo(ConsensusLogEntry _consensusLogEntry, long lgIdx)
      throws IOException {
    ConsensusLogEntryData.wrtForWrChSy(_consensusLogEntry.getBtval(),
        this.channelMarshalMcSyncableData, lgIdx, _consensusLogEntry.getLgTe(),
        this._geocewePhysicalFlushableChannel());
  }


}
