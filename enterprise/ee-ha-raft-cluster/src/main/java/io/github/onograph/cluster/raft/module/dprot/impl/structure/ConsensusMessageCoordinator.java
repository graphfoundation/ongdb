package io.github.onograph.cluster.raft.module.dprot.impl.structure;

import akka.cluster.ddata.LWWMap;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.module.dprot.impl.gdb.GdbServerIdWrapper;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;


public class ConsensusMessageCoordinator {


  public static final ConsensusMessageCoordinator EMT_CONSENSUS_MESSAGE_COORDINATOR = new ConsensusMessageCoordinator(
      Collections.emptyMap());


  private final Map<GdbServerIdWrapper, ConsensusNodeId> mapMpiggc;

  public ConsensusMessageCoordinator(LWWMap<GdbServerIdWrapper, ConsensusNodeId> _lWWMapMpiggc) {
    this(_lWWMapMpiggc.getEntries());
  }

  private ConsensusMessageCoordinator(Map<GdbServerIdWrapper, ConsensusNodeId> _mapMpiggc) {
    this.mapMpiggc = Collections.unmodifiableMap(_mapMpiggc);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      ConsensusMessageCoordinator _thConsensusMessageCoordinator = (ConsensusMessageCoordinator) obj;
      return Objects.equals(this.mapMpiggc, _thConsensusMessageCoordinator.mapMpiggc);
    } else {
      return false;
    }
  }


  public Map<GdbServerIdWrapper, ConsensusNodeId> getMapMpiggc() {
    return this.mapMpiggc;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.mapMpiggc);
  }


}
