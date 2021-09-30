package io.github.onograph.cluster.raft.share.meta.fsm;


public class ActionIdxMonitor {


  private volatile long lgAci;


  public long getLgAci() {
    return this.lgAci;
  }


  public void seapcnie(long _lgIca) {
    this.lgAci = _lgIca;
  }
}
