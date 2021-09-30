package io.github.onograph.cluster.raft.akkamsg.serialization;

import io.github.onograph.cluster.raft.akkamsg.DefaultReadableChecksumChannel;
import io.github.onograph.cluster.raft.share.sync.SyncableData;


public interface SyncableDataMessageToMessageDecoder {


  void coseForDe(DefaultReadableChecksumChannel _defaultReadableChecksumChannel) throws Exception;


  DataManagerFactory<SyncableData> cracttDataManagerFactory();
}
