package io.github.onograph.cluster.raft.id;

import io.github.onograph.cluster.raft.share.meta.pit.SnapshotData;
import java.util.Optional;


public class ConsensusSnapshotDataInfo {


  private final ConsensusMemberGroupId consensusMemberGroupId;


  private final SnapshotData scSnapshotData;

  public ConsensusSnapshotDataInfo(ConsensusMemberGroupId consensusMemberGroupId) {
    this(consensusMemberGroupId, null);
  }

  ConsensusSnapshotDataInfo(ConsensusMemberGroupId consensusMemberGroupId,
      SnapshotData _scSnapshotData) {
    this.consensusMemberGroupId = consensusMemberGroupId;
    this.scSnapshotData = _scSnapshotData;
  }


  public ConsensusMemberGroupId getConsensusMemberGroupId() {
    return this.consensusMemberGroupId;
  }


  public Optional<SnapshotData> snpoOptional() {
    return Optional.ofNullable(this.scSnapshotData);
  }
}
