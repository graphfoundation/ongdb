package io.github.onograph.cluster.raft.share.calg.nltof;

import java.util.Objects;
import java.util.Set;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.NamedDatabaseId;


class NodeOptions {


  private final NamedDatabaseId namedDatabaseId;


  private final Set<ServerId> setSresServerId;

  NodeOptions(NamedDatabaseId _namedDatabaseId, Set<ServerId> _setSresServerId) {
    this.namedDatabaseId = _namedDatabaseId;
    this.setSresServerId = _setSresServerId;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      NodeOptions _thNodeOptions = (NodeOptions) obj;
      return Objects.equals(this.namedDatabaseId, _thNodeOptions.namedDatabaseId) &&
          Objects.equals(this.setSresServerId, _thNodeOptions.setSresServerId);
    } else {
      return false;
    }
  }


  public NamedDatabaseId getNamedDatabaseId() {
    return this.namedDatabaseId;
  }


  public Set<ServerId> getSetSresServerId() {
    return this.setSresServerId;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.namedDatabaseId, this.setSresServerId);
  }


}
