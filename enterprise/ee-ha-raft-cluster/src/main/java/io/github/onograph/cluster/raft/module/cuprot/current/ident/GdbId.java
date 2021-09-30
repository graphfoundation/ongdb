package io.github.onograph.cluster.raft.module.cuprot.current.ident;

import java.util.Objects;
import org.neo4j.kernel.database.DatabaseId;


public class GdbId {


  private final DatabaseId rDatabaseId;

  public GdbId(DatabaseId _rDatabaseId) {
    this.rDatabaseId = _rDatabaseId;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      GdbId _thGdbId = (GdbId) obj;
      return Objects.equals(this.rDatabaseId, _thGdbId.rDatabaseId);
    } else {
      return false;
    }
  }


  public DatabaseId getRDatabaseId() {
    return this.rDatabaseId;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.rDatabaseId);
  }


}
