package io.github.onograph.cluster.raft.module.dprot.impl;

import io.github.onograph.cluster.raft.module.dprot.DatabaseCoreClusterStructure;
import io.github.onograph.cluster.raft.module.dprot.DatabaseReadReplicaClusterStructure;


public interface ClusterStructureChangeListener {


  void ontoueForDa(DatabaseCoreClusterStructure _databaseCoreClusterStructure);


  void ontoueForDa(DatabaseReadReplicaClusterStructure _databaseReadReplicaClusterStructure);
}
