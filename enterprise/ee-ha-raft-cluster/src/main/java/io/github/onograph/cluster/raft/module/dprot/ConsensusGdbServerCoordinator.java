package io.github.onograph.cluster.raft.module.dprot;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.module.dprot.impl.gdb.GdbServerIdWrapper;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.DatabaseId;


public class ConsensusGdbServerCoordinator {


  private final Map<DatabaseId, ConsensusNodeId> mapMrtddc;


  private final ServerId serverId;


  private ConsensusGdbServerCoordinator(Map<DatabaseId, ConsensusNodeId> _mapMrtddc,
      ServerId _serverId) {
    this.mapMrtddc = _mapMrtddc;
    this.serverId = _serverId;
  }


  private static ConsensusGdbServerCoordinator _addConsensusGdbServerCoordinator(
      ConsensusNodeId consensusNodeId,
      ConsensusGdbServerCoordinator _eitnConsensusGdbServerCoordinator, GdbServerIdWrapper k) {
    if (_eitnConsensusGdbServerCoordinator == null) {
      _eitnConsensusGdbServerCoordinator = emtofConsensusGdbServerCoordinator(k.getServerId());
    }

    _eitnConsensusGdbServerCoordinator.mapMrtddc.put(k.getDatabaseId(), consensusNodeId);
    return _eitnConsensusGdbServerCoordinator;
  }


  public static ConsensusGdbServerCoordinator emtofConsensusGdbServerCoordinator(
      ServerId _serverId) {
    return new ConsensusGdbServerCoordinator(new HashMap(), _serverId);
  }


  public static ConsensusGdbServerCoordinator ofConsensusGdbServerCoordinator(
      Map<DatabaseId, ConsensusNodeId> _mapMpigdc, ServerId _serverId) {
    return new ConsensusGdbServerCoordinator(_mapMpigdc, _serverId);
  }


  public static Map<ServerId, ConsensusGdbServerCoordinator> ofConsensusGdbServerCoordinator(
      Map<GdbServerIdWrapper, ConsensusNodeId> _mapMgc) {

    HashMap<ServerId, ConsensusGdbServerCoordinator> _hashMapMpigsc = new HashMap();
    _mapMgc.forEach((key, value) ->
    {
      _hashMapMpigsc.compute(key.getServerId(), (ignored, existing) ->
      {
        return _addConsensusGdbServerCoordinator(value, existing, key);
      });
    });
    return _hashMapMpigsc;
  }


  public Map<DatabaseId, ConsensusNodeId> daatrmaMap() {
    return Collections.unmodifiableMap(this.mapMrtddc);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      ConsensusGdbServerCoordinator _tConsensusGdbServerCoordinator = (ConsensusGdbServerCoordinator) obj;
      return Objects.equals(this.serverId, _tConsensusGdbServerCoordinator.serverId) &&
          Objects.equals(this.mapMrtddc, _tConsensusGdbServerCoordinator.mapMrtddc);
    } else {
      return false;
    }
  }


  public ServerId getServerId() {
    return this.serverId;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.serverId, this.mapMrtddc);
  }


}
