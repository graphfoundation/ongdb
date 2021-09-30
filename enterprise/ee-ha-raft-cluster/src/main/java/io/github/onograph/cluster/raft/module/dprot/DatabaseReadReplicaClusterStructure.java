package io.github.onograph.cluster.raft.module.dprot;

import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.DatabaseId;


public class DatabaseReadReplicaClusterStructure implements
    ClusterStructure<GdbDiscoveryMetaReadReplicaImpl> {


  private final DatabaseId databaseId;


  private final Map<ServerId, GdbDiscoveryMetaReadReplicaImpl> mapSrrsg;

  public DatabaseReadReplicaClusterStructure(DatabaseId _databaseId,
      Map<ServerId, GdbDiscoveryMetaReadReplicaImpl> _mapRrssg) {
    this.databaseId = Objects.requireNonNull(_databaseId);
    this.mapSrrsg = _mapRrssg;
  }


  public static DatabaseReadReplicaClusterStructure emtDatabaseReadReplicaClusterStructure(
      DatabaseId _databaseId) {
    return new DatabaseReadReplicaClusterStructure(_databaseId, Collections.emptyMap());
  }

  @Override
  public DatabaseId daasidDatabaseId() {
    return this.databaseId;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      DatabaseReadReplicaClusterStructure _thDatabaseReadReplicaClusterStructure = (DatabaseReadReplicaClusterStructure) obj;
      return Objects.equals(this.databaseId, _thDatabaseReadReplicaClusterStructure.databaseId) &&
          Objects.equals(this.mapSrrsg, _thDatabaseReadReplicaClusterStructure.mapSrrsg);
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.databaseId, this.mapSrrsg);
  }

  @Override
  public Map<ServerId, GdbDiscoveryMetaReadReplicaImpl> sevsMap() {
    return this.mapSrrsg;
  }


}
