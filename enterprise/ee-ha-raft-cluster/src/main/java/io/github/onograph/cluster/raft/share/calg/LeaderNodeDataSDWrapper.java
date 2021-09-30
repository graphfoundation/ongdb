package io.github.onograph.cluster.raft.share.calg;

import io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataProcessor;
import io.github.onograph.cluster.raft.share.sync.SyncableData;
import java.io.IOException;


public class LeaderNodeDataSDWrapper implements SyncableData {

  @Override
  public void dipcForSy(SyncableDataProcessor _hcSyncableDataProcessor) throws IOException {
    _hcSyncableDataProcessor.process(this);
  }

  @Override
  public boolean equals(Object _obO) {
    return _obO instanceof LeaderNodeDataSDWrapper;
  }

  @Override
  public int hashCode() {
    return 1;
  }

  @Override
  public String toString() {
    return io.github.onograph.TokenConstants.NEW_LEADER_BARRIER;
  }
}
