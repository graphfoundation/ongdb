package io.github.onograph.cluster.raft.akkamsg.serialization;

import io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.SyncableDataMessageToMessageDecoderImpl;
import org.neo4j.kernel.impl.transaction.log.entry.VersionAwareLogEntryReader;
import org.neo4j.storageengine.api.CommandReaderFactory;


public class SyncableDataMessageToMessageDecoderController {


  public SyncableDataMessageToMessageDecoder deorSyncableDataMessageToMessageDecoder(byte _ccByte,
      CommandReaderFactory _commandReaderFactory) {
    switch (_ccByte) {
      case 0:
        if (_commandReaderFactory == null) {

          throw new IllegalStateException("*** Error:  1e48aad7-b301-47ef-bb8f-785583f7df23");
        }

        return new SyncableDataMessageToMessageDecoderImpl(
            new VersionAwareLogEntryReader(_commandReaderFactory, false));
      case 8:
        return new SyncableDataMessageToMessageDecoderNoopImpl();
      default:
        return new SyncableDataMessageToMessageDecoderNoWaitImpl((ch) ->
        {
          return (new BaseSyncableDataMarshal(null)).unahDataManagerFactory(ch, _ccByte);
        });
    }
  }
}
