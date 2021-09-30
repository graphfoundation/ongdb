package io.github.onograph.cluster.raft.akkamsg.serialization;

import io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.AbstractTransactionSync;
import io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.ClonedTxLogMarshaller;
import io.github.onograph.cluster.raft.share.sync.SyncableData;
import java.io.IOException;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.kernel.impl.transaction.log.entry.LogEntryReader;


public class DefaultSyncableDataMarshal extends BaseSyncableDataMarshal {

  public DefaultSyncableDataMarshal(LogEntryReader _logEntryReader) {
    super(_logEntryReader);
  }

  @Override
  protected SyncableDataProcessor gemslSyncableDataProcessor(WritableChannel _writableChannel) {
    return new MarshalProcessor(_writableChannel);
  }

  @Override
  public DataManagerFactory<SyncableData> unahDataManagerFactory(ReadableChannel _readableChannel,
      byte _tcByte) throws IOException, EndOfStreamException {
    return _tcByte == 0 ? DataManagerFactory.fiieDataManagerFactory(
        ClonedTxLogMarshaller.unahAbstractTransactionSync(this.logEntryReader, _readableChannel))
        : super.unahDataManagerFactory(_readableChannel, _tcByte);
  }


  private static class MarshalProcessor extends Processor {

    MarshalProcessor(WritableChannel _writableChannel) {
      super(_writableChannel);
    }

    @Override
    public void process(AbstractTransactionSync _tAbstractTransactionSync) throws IOException {
      this.writableChannel.put((byte) 0);
      ClonedTxLogMarshaller.maslForWrAb(_tAbstractTransactionSync, this.writableChannel);
    }
  }
}
