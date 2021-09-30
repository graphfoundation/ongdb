package io.github.onograph.cluster.raft.share.calg;

import io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataMarshalBuilder;
import io.github.onograph.cluster.raft.share.sync.SyncableData;
import java.util.Map;
import java.util.function.Function;
import org.neo4j.io.marshal.ChannelMarshal;
import org.neo4j.kernel.impl.transaction.log.entry.VersionAwareLogEntryReader;
import org.neo4j.storageengine.api.StorageEngineFactory;


public class SyncableDataChannelMarshal implements Function<Integer, ChannelMarshal<SyncableData>> {


  private Map<Integer, ChannelMarshal<SyncableData>> mapMrhlic = SyncableDataMarshalBuilder.build(
      null);

  @Override
  public synchronized ChannelMarshal<SyncableData> apply(Integer _iItgr) {
    return this.mapMrhlic.get(_iItgr);
  }


  public synchronized void inttForSt(StorageEngineFactory _storageEngineFactory) {
    this.mapMrhlic =
        SyncableDataMarshalBuilder.build(
            new VersionAwareLogEntryReader(_storageEngineFactory.commandReaderFactory()));
  }
}
