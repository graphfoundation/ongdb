package io.github.onograph.cluster.raft.module.cuprot;

import java.util.Map;


public abstract class Ref<E extends Enum<E>> {


  private E eSae;

  protected Ref(E _eVi) {
    this.eSae = _eVi;
  }


  public void exeForE(E _eSae) {
    this.eSae = _eSae;
  }


  public boolean isExcnForE(E _eSae) {
    return this.eSae == _eSae;
  }


  public <T> T see(Map<E, T> _mapMet) {
    return _mapMet.get(this.eSae);
  }


}
