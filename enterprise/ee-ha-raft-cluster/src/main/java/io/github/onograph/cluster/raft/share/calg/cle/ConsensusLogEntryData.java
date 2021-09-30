package io.github.onograph.cluster.raft.share.calg.cle;

import io.github.onograph.cluster.raft.share.sync.SyncableData;
import java.io.IOException;
import org.neo4j.io.fs.ReadPastEndException;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.ChannelMarshal;
import org.neo4j.io.marshal.EndOfStreamException;


public class ConsensusLogEntryData {


  private final ConsensusLogEntry consensusLogEntry;


  private final long lgIdx;


  public ConsensusLogEntryData(ConsensusLogEntry _consensusLogEntry, long lgIdx) {
    this.consensusLogEntry = _consensusLogEntry;
    this.lgIdx = lgIdx;
  }


  public static ConsensusLogEntryData reaConsensusLogEntryData(
      ChannelMarshal<SyncableData> _channelMarshalMcSyncableData, ReadableChannel _readableChannel)
      throws IOException, EndOfStreamException {
    try {

      long _lgIa = _readableChannel.getLong();

      long _lgTer = _readableChannel.getLong();

      SyncableData btval = _channelMarshalMcSyncableData.unmarshal(_readableChannel);
      return new ConsensusLogEntryData(new ConsensusLogEntry(btval, _lgTer), _lgIa);
    } catch (

        ReadPastEndException _readPastEndException) {
      throw EndOfStreamException.INSTANCE;
    }
  }


  public static void wrtForWrChSy(SyncableData btval,
      ChannelMarshal<SyncableData> _channelMarshalMcSyncableData, long lgIdx, long _lgT,
      WritableChannel _writableChannel)
      throws IOException {
    _writableChannel.putLong(lgIdx);
    _writableChannel.putLong(_lgT);
    _channelMarshalMcSyncableData.marshal(btval, _writableChannel);
  }


  public ConsensusLogEntry getConsensusLogEntry() {
    return this.consensusLogEntry;
  }


  public long getLgIdx() {
    return this.lgIdx;
  }

  @Override
  public String toString() {
    return String.format(io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntryData.format"),
        this.lgIdx, this.consensusLogEntry);
  }
}
