package io.github.onograph.cluster.raft.module.dprot.impl.structure;

import io.github.onograph.cluster.raft.id.ConsensusMemberGroupId;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import java.util.Map;
import java.util.Objects;


public class ConsensusGdbsReady {


  public static final ConsensusGdbsReady EMT_CONSENSUS_GDBS_READY = new ConsensusGdbsReady(
      Map.of());


  private final Map<ConsensusMemberGroupId, ConsensusNodeId> mapRbcc;

  public ConsensusGdbsReady(Map<ConsensusMemberGroupId, ConsensusNodeId> _mapRbcc) {
    this.mapRbcc = Map.copyOf(_mapRbcc);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      ConsensusGdbsReady _thaConsensusGdbsReady = (ConsensusGdbsReady) obj;
      return Objects.equals(this.mapRbcc, _thaConsensusGdbsReady.mapRbcc);
    } else {
      return false;
    }
  }


  public Map<ConsensusMemberGroupId, ConsensusNodeId> getMapRbcc() {
    return this.mapRbcc;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.mapRbcc);
  }


}
