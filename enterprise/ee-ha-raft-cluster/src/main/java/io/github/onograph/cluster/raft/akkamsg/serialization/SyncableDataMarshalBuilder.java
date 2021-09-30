package io.github.onograph.cluster.raft.akkamsg.serialization;

import io.github.onograph.cluster.raft.share.sync.SyncableData;
import java.util.Map;
import org.neo4j.io.marshal.ChannelMarshal;
import org.neo4j.kernel.impl.transaction.log.entry.LogEntryReader;


public class SyncableDataMarshalBuilder {


  public static Map<Integer, ChannelMarshal<SyncableData>> build(LogEntryReader RNME) {
    return Map.of(2, new BaseSyncableDataMarshal(RNME), 3, new DefaultSyncableDataMarshal(RNME));
  }
}
