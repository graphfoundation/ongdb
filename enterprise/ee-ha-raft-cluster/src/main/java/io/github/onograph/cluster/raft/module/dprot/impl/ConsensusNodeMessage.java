package io.github.onograph.cluster.raft.module.dprot.impl;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import java.util.Objects;
import org.neo4j.kernel.database.NamedDatabaseId;


public class ConsensusNodeMessage {


  private final ConsensusNodeId consensusNodeId;


  private final NamedDatabaseId namedDatabaseId;


  public ConsensusNodeMessage(ConsensusNodeId consensusNodeId, NamedDatabaseId _namedDatabaseId) {
    this.namedDatabaseId = Objects.requireNonNull(_namedDatabaseId);
    this.consensusNodeId = consensusNodeId;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      ConsensusNodeMessage _thConsensusNodeMessage = (ConsensusNodeMessage) obj;
      if (!Objects.equals(this.namedDatabaseId, _thConsensusNodeMessage.namedDatabaseId)) {
        return false;
      } else {
        return this.consensusNodeId != null ? this.consensusNodeId.equals(
            _thConsensusNodeMessage.consensusNodeId)
            : _thConsensusNodeMessage.consensusNodeId == null;
      }
    } else {
      return false;
    }
  }


  public ConsensusNodeId getConsensusNodeId() {
    return this.consensusNodeId;
  }


  public NamedDatabaseId getNamedDatabaseId() {
    return this.namedDatabaseId;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.namedDatabaseId, this.consensusNodeId);
  }


}
