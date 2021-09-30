package io.github.onograph.cluster.raft.readreplica.tx;

import java.util.Collection;


class ReadReplicaJobEventServiceMergedImpl implements ReadReplicaJobEventService {


  private final Collection<ReadReplicaJobEventService> readReplicaJobEventServiceList;

  ReadReplicaJobEventServiceMergedImpl(
      Collection<ReadReplicaJobEventService> readReplicaJobEventServiceList) {
    this.readReplicaJobEventServiceList = readReplicaJobEventServiceList;
  }

  @Override
  public void onfauForEx(Exception _exception) {
    this.readReplicaJobEventServiceList.forEach((eh) ->
    {
      eh.onfauForEx(_exception);
    });
  }

  @Override
  public void onsue() {
    this.readReplicaJobEventServiceList.forEach(ReadReplicaJobEventService::onsue);
  }
}
