package io.github.onograph.cluster.raft.share.calg.cle.parts;

import io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntryData;
import io.github.onograph.cluster.raft.share.calg.cle.TransactionLogCoords;
import io.github.onograph.cluster.raft.share.sync.SyncableData;
import java.io.IOException;
import org.neo4j.cursor.CursorValue;
import org.neo4j.cursor.IOCursor;
import org.neo4j.io.fs.ReadAheadChannel;
import org.neo4j.io.fs.StoreChannel;
import org.neo4j.io.marshal.ChannelMarshal;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.io.memory.NativeScopedBuffer;
import org.neo4j.memory.MemoryTracker;


class DataIOCursor implements IOCursor<ConsensusLogEntryData> {


  private final StoreChannelFileWrapper RNME;


  private final ChannelMarshal<SyncableData> channelMarshalMcSyncableData;


  private final CursorValue<ConsensusLogEntryData> cursorValueRcConsensusLogEntryData = new CursorValue();


  private final TransactionLogCoords pstoTransactionLogCoords;


  private final TransactionLogPartFileSystemWrapper sgetTransactionLogPartFileSystemWrapper;


  private boolean isCoe;


  private boolean isHe;


  private ReadAheadChannel<StoreChannel> readAheadChannelRbStoreChannel;


  DataIOCursor(StoreChannelFileWrapper RNME,
      ChannelMarshal<SyncableData> _channelMarshalMcSyncableData, long _lgIc, long _lgIw,
      MemoryTracker _memoryTracker,
      TransactionLogPartFileSystemWrapper _sgetTransactionLogPartFileSystemWrapper)
      throws IOException, EndOfStreamException {
    this.readAheadChannelRbStoreChannel =
        new ReadAheadChannel(RNME.getStoreChannel(),
            new NativeScopedBuffer(ReadAheadChannel.DEFAULT_READ_AHEAD_SIZE, _memoryTracker));
    this.RNME = RNME;
    this.channelMarshalMcSyncableData = _channelMarshalMcSyncableData;

    for (this.sgetTransactionLogPartFileSystemWrapper = _sgetTransactionLogPartFileSystemWrapper;
        _lgIc < _lgIw; ++_lgIc) {
      ConsensusLogEntryData.reaConsensusLogEntryData(_channelMarshalMcSyncableData,
          this.readAheadChannelRbStoreChannel);
    }

    this.pstoTransactionLogCoords = new TransactionLogCoords(_lgIc,
        this.readAheadChannelRbStoreChannel.position());
  }

  @Override
  public void close() throws IOException {
    if (this.isCoe) {

      throw new IllegalStateException("*** Error:  3080274f-8704-4c5c-a116-7bc54c0d04cc");
    } else {
      this.readAheadChannelRbStoreChannel = null;
      this.isCoe = true;
      this.sgetTransactionLogPartFileSystemWrapper.getRcTransactionLogPartStats().ders();
      if (this.isHe) {
        this.RNME.close();
      } else {
        this.sgetTransactionLogPartFileSystemWrapper.getCpTransactionLogCoordinates()
            .putForTr(this.pstoTransactionLogCoords);
        this.sgetTransactionLogPartFileSystemWrapper.getPrStoreFileWrapperFASManager()
            .reeeForSt(this.RNME);
      }
    }
  }

  @Override
  public ConsensusLogEntryData get() {
    return this.cursorValueRcConsensusLogEntryData.get();
  }

  @Override
  public boolean next() throws IOException {

    ConsensusLogEntryData _reConsensusLogEntryData;
    try {
      _reConsensusLogEntryData = ConsensusLogEntryData.reaConsensusLogEntryData(
          this.channelMarshalMcSyncableData, this.readAheadChannelRbStoreChannel);
    } catch (

        EndOfStreamException _endOfStreamException) {
      this.cursorValueRcConsensusLogEntryData.invalidate();
      return false;
    } catch (

        IOException _iOException) {
      this.isHe = true;
      throw _iOException;
    }

    this.cursorValueRcConsensusLogEntryData.set(_reConsensusLogEntryData);
    this.pstoTransactionLogCoords.byeoft = this.readAheadChannelRbStoreChannel.position();
    ++this.pstoTransactionLogCoords.lgIdx;
    return true;
  }
}
