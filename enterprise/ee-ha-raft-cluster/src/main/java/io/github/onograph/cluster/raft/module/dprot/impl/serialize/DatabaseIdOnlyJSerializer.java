package io.github.onograph.cluster.raft.module.dprot.impl.serialize;

import org.neo4j.kernel.database.DatabaseId;


public class DatabaseIdOnlyJSerializer extends AbstractJSerializer<DatabaseId> {


  private static final int siehn = 16;

  protected DatabaseIdOnlyJSerializer() {
    super(DatabaseIdOnlySafeChannelMarshal.IT, 16, 1012);
  }
}
