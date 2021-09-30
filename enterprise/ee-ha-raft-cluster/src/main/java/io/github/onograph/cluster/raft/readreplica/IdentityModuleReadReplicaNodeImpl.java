package io.github.onograph.cluster.raft.readreplica;

import java.util.UUID;
import org.neo4j.dbms.identity.AbstractIdentityModule;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


public class IdentityModuleReadReplicaNodeImpl extends AbstractIdentityModule {


  private final ServerId serverId = new ServerId(UUID.randomUUID());

  public IdentityModuleReadReplicaNodeImpl(LogProvider _logProvider) {

    Log _log = _logProvider.getLog(this.getClass());


  }


  public static IdentityModuleReadReplicaNodeImpl craIdentityModuleReadReplicaNodeImpl(
      LogProvider _logProvider) {
    return new IdentityModuleReadReplicaNodeImpl(_logProvider);
  }

  @Override
  public ServerId serverId() {
    return this.serverId;
  }
}
