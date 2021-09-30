package io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology;

import akka.actor.ActorRef;
import io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaReadReplicaImpl;
import io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper;
import java.util.Map;
import java.util.Objects;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.DatabaseId;


public class UpdateReadReplicaInfo {


  private final GdbDiscoveryMetaReadReplicaImpl irrGdbDiscoveryMetaReadReplicaImpl;


  private final Map<DatabaseId, DiscoveryGdbOperatorMetaWrapper> mapDsdd;


  private final ActorRef mccActorRef;


  private final ServerId serverId;


  private final ActorRef tcActorRef;


  public UpdateReadReplicaInfo(ActorRef _ctActorRef,
      GdbDiscoveryMetaReadReplicaImpl _irrGdbDiscoveryMetaReadReplicaImpl,
      Map<DatabaseId, DiscoveryGdbOperatorMetaWrapper> _mapSddd, ActorRef _mccActorRef,
      ServerId _serverId) {
    this.irrGdbDiscoveryMetaReadReplicaImpl = _irrGdbDiscoveryMetaReadReplicaImpl;
    this.mapDsdd = _mapSddd;
    this.mccActorRef = _mccActorRef;
    this.serverId = _serverId;
    this.tcActorRef = _ctActorRef;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      UpdateReadReplicaInfo _tUpdateReadReplicaInfo = (UpdateReadReplicaInfo) obj;
      return Objects.equals(this.irrGdbDiscoveryMetaReadReplicaImpl,
          _tUpdateReadReplicaInfo.irrGdbDiscoveryMetaReadReplicaImpl) &&
          Objects.equals(this.serverId, _tUpdateReadReplicaInfo.serverId) &&
          Objects.equals(this.mccActorRef, _tUpdateReadReplicaInfo.mccActorRef) &&
          Objects.equals(this.tcActorRef, _tUpdateReadReplicaInfo.tcActorRef) &&
          Objects.equals(this.mapDsdd, _tUpdateReadReplicaInfo.mapDsdd);
    } else {
      return false;
    }
  }


  public GdbDiscoveryMetaReadReplicaImpl getIrrGdbDiscoveryMetaReadReplicaImpl() {
    return this.irrGdbDiscoveryMetaReadReplicaImpl;
  }


  public Map<DatabaseId, DiscoveryGdbOperatorMetaWrapper> getMapDsdd() {
    return this.mapDsdd;
  }


  public ActorRef getMccActorRef() {
    return this.mccActorRef;
  }


  public ServerId getServerId() {
    return this.serverId;
  }


  public ActorRef getTcActorRef() {
    return this.tcActorRef;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.irrGdbDiscoveryMetaReadReplicaImpl, this.serverId, this.mccActorRef,
        this.tcActorRef, this.mapDsdd);
  }


}
