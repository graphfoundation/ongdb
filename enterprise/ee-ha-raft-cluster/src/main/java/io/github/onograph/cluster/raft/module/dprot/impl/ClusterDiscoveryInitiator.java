package io.github.onograph.cluster.raft.module.dprot.impl;

import io.github.onograph.cluster.raft.module.dprot.pit.GdbServerPointInTime;
import java.util.Objects;


public final class ClusterDiscoveryInitiator {


  private final GdbServerPointInTime gdbServerPointInTime;

  public ClusterDiscoveryInitiator(GdbServerPointInTime gdbServerPointInTime) {
    this.gdbServerPointInTime = gdbServerPointInTime;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      ClusterDiscoveryInitiator _tClusterDiscoveryInitiator = (ClusterDiscoveryInitiator) obj;
      return Objects.equals(this.gdbServerPointInTime,
          _tClusterDiscoveryInitiator.gdbServerPointInTime);
    } else {
      return false;
    }
  }


  public GdbServerPointInTime getGdbServerPointInTime() {
    return this.gdbServerPointInTime;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.gdbServerPointInTime);
  }
}
