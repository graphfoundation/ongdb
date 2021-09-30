package io.github.onograph.cluster.raft.module.dprot.impl.structure;

import akka.actor.ActorRef;
import io.github.onograph.cluster.raft.id.ConsensusMemberGroupId;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import java.time.Duration;
import java.util.Objects;


public class SetupConsensusDatabaseId {


  private final ConsensusMemberGroupId consensusMemberGroupId;


  private final ConsensusNodeId pbihrConsensusNodeId;


  private final Duration tmotDuration;


  private final ActorRef trActorRef;

  public SetupConsensusDatabaseId(ConsensusMemberGroupId consensusMemberGroupId,
      ConsensusNodeId _pbihrConsensusNodeId, Duration _tmotDuration) {
    this(consensusMemberGroupId, _pbihrConsensusNodeId, _tmotDuration, ActorRef.noSender());
  }

  private SetupConsensusDatabaseId(ConsensusMemberGroupId consensusMemberGroupId,
      ConsensusNodeId _pbihrConsensusNodeId, Duration _tmotDuration, ActorRef _trActorRef) {
    this.consensusMemberGroupId = consensusMemberGroupId;
    this.pbihrConsensusNodeId = _pbihrConsensusNodeId;
    this.tmotDuration = _tmotDuration;
    this.trActorRef = _trActorRef;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      SetupConsensusDatabaseId _tSetupConsensusDatabaseId = (SetupConsensusDatabaseId) obj;
      return Objects.equals(this.consensusMemberGroupId,
          _tSetupConsensusDatabaseId.consensusMemberGroupId) &&
          Objects.equals(this.pbihrConsensusNodeId,
              _tSetupConsensusDatabaseId.pbihrConsensusNodeId);
    } else {
      return false;
    }
  }


  public ConsensusMemberGroupId getConsensusMemberGroupId() {
    return this.consensusMemberGroupId;
  }


  public ConsensusNodeId getPbihrConsensusNodeId() {
    return this.pbihrConsensusNodeId;
  }


  public Duration getTmotDuration() {
    return this.tmotDuration;
  }


  ActorRef getTrActorRef() {
    return this.trActorRef;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.consensusMemberGroupId, this.pbihrConsensusNodeId);
  }


  SetupConsensusDatabaseId trActorRef(ActorRef _trActorRef) {
    return new SetupConsensusDatabaseId(this.consensusMemberGroupId, this.pbihrConsensusNodeId,
        this.tmotDuration, _trActorRef);
  }


}
