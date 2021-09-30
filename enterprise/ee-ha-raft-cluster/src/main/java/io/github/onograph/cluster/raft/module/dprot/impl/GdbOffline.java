package io.github.onograph.cluster.raft.module.dprot.impl;

import java.util.Objects;
import org.neo4j.kernel.database.NamedDatabaseId;


public class GdbOffline {


  private final NamedDatabaseId namedDatabaseId;

  public GdbOffline(NamedDatabaseId _namedDatabaseId) {
    this.namedDatabaseId = Objects.requireNonNull(_namedDatabaseId);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      GdbOffline _thaGdbOffline = (GdbOffline) obj;
      return Objects.equals(this.namedDatabaseId, _thaGdbOffline.namedDatabaseId);
    } else {
      return false;
    }
  }


  public NamedDatabaseId getNamedDatabaseId() {
    return this.namedDatabaseId;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.namedDatabaseId);
  }


}
