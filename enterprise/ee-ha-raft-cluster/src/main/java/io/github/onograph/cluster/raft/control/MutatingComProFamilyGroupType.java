package io.github.onograph.cluster.raft.control;


public enum MutatingComProFamilyGroupType implements
    io.github.onograph.cluster.raft.control.ComProFamily.ComProFamilyGroup<MutableComProFamily> {


  TYPE_COMP,

  DAT_OBFUS;

  @Override
  public String lowerName() {
    return this.name().toLowerCase();
  }
}
