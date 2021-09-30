package io.github.onograph.cluster.raft.share.meta.fsm.servicetrx;

import io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl;
import io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl;
import io.github.onograph.cluster.raft.module.dprot.impl.serialize.DatabaseIdOnlySafeChannelMarshal;
import java.io.IOException;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.kernel.impl.transaction.log.PhysicalTransactionRepresentation;
import org.neo4j.kernel.impl.transaction.log.entry.LogEntryReader;


public class ClonedTxLogMarshaller {

  private ClonedTxLogMarshaller() {
  }


  public static void maslForWrAb(AbstractTransactionSync _rAbstractTransactionSync,
      WritableChannel _writableChannel) throws IOException {
    DatabaseIdOnlySafeChannelMarshal.IT.marshal(_rAbstractTransactionSync.daasidDatabaseId(),
        _writableChannel);

    PhysicalTransactionRepresentation _tPhysicalTransactionRepresentation = _rAbstractTransactionSync.getTPhysicalTransactionRepresentation();
    _writableChannel.putLong(_tPhysicalTransactionRepresentation.commandCount());

    SyncableTransactionLogWriter _wtSyncableTransactionLogWriter = new SyncableTransactionLogWriter(
        _tPhysicalTransactionRepresentation);

    while (_wtSyncableTransactionLogWriter.isCawt()) {
      _wtSyncableTransactionLogWriter.wrtForWr(new WritableChecksumChannelImpl(_writableChannel));
    }
  }


  public static AbstractTransactionSync unahAbstractTransactionSync(LogEntryReader _logEntryReader,
      ReadableChannel _readableChannel)
      throws IOException, EndOfStreamException {

    DatabaseId _databaseId = DatabaseIdOnlySafeChannelMarshal.IT.unmarshal(_readableChannel);

    long _lgCc = _readableChannel.getLong();

    PhysicalTransactionRepresentation _tPhysicalTransactionRepresentation =
        (new SyncableTransactionLogReader(_logEntryReader,
            _lgCc)).reaPhysicalTransactionRepresentation(
            new ReadableClosablePositionAwareChecksumChannelPassThruImpl(_readableChannel));
    if ((long) _tPhysicalTransactionRepresentation.commandCount() != _lgCc) {
      throw EndOfStreamException.INSTANCE;
    } else {
      return new AbstractTransactionSync(_tPhysicalTransactionRepresentation, _databaseId);
    }
  }
}
