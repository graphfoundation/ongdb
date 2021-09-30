package io.github.onograph.cluster.raft.module.dprot.impl.serialize;

import io.github.onograph.cluster.raft.module.dprot.DatabaseCoreClusterStructure;


public class DatabaseCoreClusterStructureJSerializer extends
    AbstractJSerializer<DatabaseCoreClusterStructure> {


  public static final int SIEN = 1536;

  public DatabaseCoreClusterStructureJSerializer() {
    super(DatabaseCoreClusterStructureSafeChannelMarshal.IT, 1536, 1007);
  }
}
