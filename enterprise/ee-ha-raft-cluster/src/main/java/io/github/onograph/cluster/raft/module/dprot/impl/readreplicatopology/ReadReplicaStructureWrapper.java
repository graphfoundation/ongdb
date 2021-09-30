package io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology;

import akka.actor.ActorRef;
import io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaReadReplicaImpl;
import io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper;
import java.time.Clock;
import java.time.Instant;
import java.util.Map;
import java.util.Objects;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.DatabaseId;


public class ReadReplicaStructureWrapper {


  private final GdbDiscoveryMetaReadReplicaImpl irrGdbDiscoveryMetaReadReplicaImpl;


  private final Map<DatabaseId, DiscoveryGdbOperatorMetaWrapper> mapSddd;


  private final ServerId serverId;


  private final ActorRef tcActorRef;


  private final Instant tmsapInstant;


  ReadReplicaStructureWrapper(ActorRef _ctActorRef,
      Map<DatabaseId, DiscoveryGdbOperatorMetaWrapper> _mapSddd,
      GdbDiscoveryMetaReadReplicaImpl _rriGdbDiscoveryMetaReadReplicaImpl, ServerId _serverId,
      Instant _tmsapInstant) {
    this.irrGdbDiscoveryMetaReadReplicaImpl = _rriGdbDiscoveryMetaReadReplicaImpl;
    this.mapSddd = _mapSddd;
    this.serverId = _serverId;
    this.tcActorRef = _ctActorRef;
    this.tmsapInstant = _tmsapInstant;
  }


  ReadReplicaStructureWrapper(Clock _clock, UpdateReadReplicaInfo m) {
    this(m.getTcActorRef(), m.getMapDsdd(), m.getIrrGdbDiscoveryMetaReadReplicaImpl(),
        m.getServerId(), Instant.now(_clock));
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      ReadReplicaStructureWrapper _tReadReplicaStructureWrapper = (ReadReplicaStructureWrapper) obj;
      return Objects.equals(this.irrGdbDiscoveryMetaReadReplicaImpl,
          _tReadReplicaStructureWrapper.irrGdbDiscoveryMetaReadReplicaImpl) &&
          Objects.equals(this.tmsapInstant, _tReadReplicaStructureWrapper.tmsapInstant) &&
          Objects.equals(this.tcActorRef, _tReadReplicaStructureWrapper.tcActorRef) &&
          Objects.equals(this.serverId, _tReadReplicaStructureWrapper.serverId) &&
          Objects.equals(this.mapSddd, _tReadReplicaStructureWrapper.mapSddd);
    } else {
      return false;
    }
  }


  public GdbDiscoveryMetaReadReplicaImpl getIrrGdbDiscoveryMetaReadReplicaImpl() {
    return this.irrGdbDiscoveryMetaReadReplicaImpl;
  }


  Map<DatabaseId, DiscoveryGdbOperatorMetaWrapper> getMapSddd() {
    return this.mapSddd;
  }


  public ServerId getServerId() {
    return this.serverId;
  }


  public ActorRef getTcActorRef() {
    return this.tcActorRef;
  }


  public Instant getTmsapInstant() {
    return this.tmsapInstant;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.irrGdbDiscoveryMetaReadReplicaImpl, this.tmsapInstant, this.tcActorRef,
        this.serverId, this.mapSddd);
  }


}
