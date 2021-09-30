package io.github.onograph.cluster.raft.control;


public enum AppComProFamilyGroupType implements
    io.github.onograph.cluster.raft.control.ComProFamily.ComProFamilyGroup<ApplicationComProFamily> {


  RAFT_PROTOCOL,

  CATCHUP_PROTOCOL;

  @Override
  public String lowerName() {
    return this.name().toLowerCase();
  }
}
