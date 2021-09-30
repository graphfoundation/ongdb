package io.github.onograph.cluster.raft.share.meta.fsm.servicetrx;

import io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelImpl;
import io.github.onograph.cluster.raft.akkamsg.serialization.WritableChecksumChannelDataOutputStreamImpl;
import io.github.onograph.cluster.raft.module.dprot.impl.serialize.DatabaseIdOnlySafeChannelMarshal;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.kernel.impl.transaction.log.PhysicalTransactionRepresentation;
import org.neo4j.kernel.impl.transaction.log.entry.LogEntryReader;


public class DefaultTransactionSyncMarshalWrapper {

  private DefaultTransactionSyncMarshalWrapper() {
  }


  private static ByteArrayOutputStream _masltByteArrayOutputStream(
      PhysicalTransactionRepresentation _tPhysicalTransactionRepresentation) throws IOException {

    ByteArrayOutputStream _byteArrayOutputStream = new ByteArrayOutputStream(1024);

    WritableChecksumChannelDataOutputStreamImpl _cwsoWritableChecksumChannelDataOutputStreamImpl =
        new WritableChecksumChannelDataOutputStreamImpl(_byteArrayOutputStream);

    SyncableTransactionLogWriter _twSyncableTransactionLogWriter = new SyncableTransactionLogWriter(
        _tPhysicalTransactionRepresentation);

    while (_twSyncableTransactionLogWriter.isCawt()) {
      _twSyncableTransactionLogWriter.wrtForWr(_cwsoWritableChecksumChannelDataOutputStreamImpl);
    }

    return _byteArrayOutputStream;
  }


  public static void maslForWrAb(AbstractTransactionSync _rAbstractTransactionSync,
      WritableChannel _writableChannel) throws IOException {
    DatabaseIdOnlySafeChannelMarshal.IT.marshal(_rAbstractTransactionSync.daasidDatabaseId(),
        _writableChannel);

    ByteArrayOutputStream _baByteArrayOutputStream = _masltByteArrayOutputStream(
        _rAbstractTransactionSync.getTPhysicalTransactionRepresentation());

    int _iTbl = _baByteArrayOutputStream.size();
    _writableChannel.putInt(_iTbl);
    _writableChannel.put(_baByteArrayOutputStream.toByteArray(), _iTbl);
  }


  public static AbstractTransactionSync unahAbstractTransactionSync(LogEntryReader _logEntryReader,
      ReadableChannel _readableChannel)
      throws IOException, EndOfStreamException {

    DatabaseId _databaseId = DatabaseIdOnlySafeChannelMarshal.IT.unmarshal(_readableChannel);

    int _iLbt = _readableChannel.getInt();

    ReadableClosablePositionAwareChecksumChannelImpl _bcReadableClosablePositionAwareChecksumChannelImpl =
        new ReadableClosablePositionAwareChecksumChannelImpl(_readableChannel, _iLbt);

    PhysicalTransactionRepresentation _tPhysicalTransactionRepresentation =
        (new SyncableTransactionLogReader(_logEntryReader)).reaPhysicalTransactionRepresentation(
            _bcReadableClosablePositionAwareChecksumChannelImpl);
    return new AbstractTransactionSync(_tPhysicalTransactionRepresentation, _databaseId);
  }
}
