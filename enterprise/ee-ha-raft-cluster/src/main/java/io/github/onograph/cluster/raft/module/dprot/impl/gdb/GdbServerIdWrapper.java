package io.github.onograph.cluster.raft.module.dprot.impl.gdb;

import java.util.Objects;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.DatabaseId;


public class GdbServerIdWrapper {


  private final DatabaseId databaseId;


  private final ServerId serverId;

  public GdbServerIdWrapper(DatabaseId _databaseId, ServerId _serverId) {
    this.databaseId = _databaseId;
    this.serverId = _serverId;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      GdbServerIdWrapper _tGdbServerIdWrapper = (GdbServerIdWrapper) obj;
      return Objects.equals(this.databaseId, _tGdbServerIdWrapper.databaseId) && Objects.equals(
          this.serverId, _tGdbServerIdWrapper.serverId);
    } else {
      return false;
    }
  }


  public DatabaseId getDatabaseId() {
    return this.databaseId;
  }


  public ServerId getServerId() {
    return this.serverId;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.databaseId, this.serverId);
  }


}
