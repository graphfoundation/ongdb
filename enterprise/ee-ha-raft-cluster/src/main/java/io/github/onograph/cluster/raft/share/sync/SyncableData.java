package io.github.onograph.cluster.raft.share.sync;

import io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataProcessor;
import java.io.IOException;
import java.util.OptionalLong;


public interface SyncableData {


  void dipcForSy(SyncableDataProcessor _syncableDataProcessor) throws IOException;


  default OptionalLong sizOptionalLong() {
    return OptionalLong.empty();
  }
}
