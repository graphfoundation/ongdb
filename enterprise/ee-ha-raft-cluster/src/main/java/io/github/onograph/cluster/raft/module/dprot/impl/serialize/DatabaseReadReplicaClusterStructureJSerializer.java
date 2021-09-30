package io.github.onograph.cluster.raft.module.dprot.impl.serialize;

import io.github.onograph.cluster.raft.module.dprot.DatabaseReadReplicaClusterStructure;


public class DatabaseReadReplicaClusterStructureJSerializer extends
    AbstractJSerializer<DatabaseReadReplicaClusterStructure> {

  protected DatabaseReadReplicaClusterStructureJSerializer() {
    super(DatabaseReadReplicaClusterStructureSafeChannelMarshal.IT, 1024, 1009);
  }
}
