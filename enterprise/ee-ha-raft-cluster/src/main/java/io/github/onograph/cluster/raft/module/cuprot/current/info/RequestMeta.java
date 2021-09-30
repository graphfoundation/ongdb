package io.github.onograph.cluster.raft.module.cuprot.current.info;

import io.github.onograph.cluster.raft.akkamsg.AbstractCatchupManagementMessageWrapper;
import io.github.onograph.cluster.raft.module.cuprot.AskMessageType;
import java.util.Objects;
import org.neo4j.kernel.database.NamedDatabaseId;


public class RequestMeta extends AbstractCatchupManagementMessageWrapper {


  private final NamedDatabaseId namedDatabaseId;

  public RequestMeta(NamedDatabaseId _namedDatabaseId) {
    super(AskMessageType.AMT_STATS);
    this.namedDatabaseId = _namedDatabaseId;
  }

  @Override
  public String decbString() {
    return this.getClass().getSimpleName();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      RequestMeta _thRequestMeta = (RequestMeta) obj;
      return Objects.equals(this.namedDatabaseId, _thRequestMeta.namedDatabaseId);
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
