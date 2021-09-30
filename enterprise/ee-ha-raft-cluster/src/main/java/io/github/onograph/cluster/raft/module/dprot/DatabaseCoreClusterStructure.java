package io.github.onograph.cluster.raft.module.dprot;

import io.github.onograph.cluster.raft.id.ConsensusMemberGroupId;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.DatabaseId;


public class DatabaseCoreClusterStructure implements ClusterStructure<GdbDiscoveryMetaCoreImpl> {


  private final ConsensusMemberGroupId consensusMemberGroupId;


  private final DatabaseId databaseId;


  private final Map<ServerId, GdbDiscoveryMetaCoreImpl> mapScsg;


  public DatabaseCoreClusterStructure(ConsensusMemberGroupId consensusMemberGroupId,
      DatabaseId _databaseId, Map<ServerId, GdbDiscoveryMetaCoreImpl> _mapScsg) {
    this.databaseId = Objects.requireNonNull(_databaseId);
    this.consensusMemberGroupId = consensusMemberGroupId;
    this.mapScsg = Map.copyOf(_mapScsg);
  }


  public static DatabaseCoreClusterStructure emtDatabaseCoreClusterStructure(
      DatabaseId _databaseId) {
    return new DatabaseCoreClusterStructure(null, _databaseId, Collections.emptyMap());
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

      DatabaseCoreClusterStructure _thDatabaseCoreClusterStructure = (DatabaseCoreClusterStructure) obj;
      return Objects.equals(this.databaseId, _thDatabaseCoreClusterStructure.databaseId) &&
          Objects.equals(this.consensusMemberGroupId,
              _thDatabaseCoreClusterStructure.consensusMemberGroupId) &&
          Objects.equals(this.mapScsg, _thDatabaseCoreClusterStructure.mapScsg);
    } else {
      return false;
    }
  }


  public ConsensusMemberGroupId getConsensusMemberGroupId() {
    return this.consensusMemberGroupId;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.databaseId, this.consensusMemberGroupId, this.mapScsg);
  }


  public <T> Set<T> reoeSet(BiFunction<DatabaseId, ServerId, T> _biFunctionRsledst) {
    return this.sevsMap().keySet().stream().map((serverId) ->
    {
      return _biFunctionRsledst.apply(this.databaseId, serverId);
    }).filter(Objects::nonNull).collect(Collectors.toSet());
  }

  @Override
  public Map<ServerId, GdbDiscoveryMetaCoreImpl> sevsMap() {
    return this.mapScsg;
  }


}
