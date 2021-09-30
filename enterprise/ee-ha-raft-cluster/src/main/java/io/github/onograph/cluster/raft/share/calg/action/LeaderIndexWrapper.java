package io.github.onograph.cluster.raft.share.calg.action;


public class LeaderIndexWrapper {


  private final long lgIal;


  private final long lgLpi;


  LeaderIndexWrapper(long _lgIal, long _lgLpi) {
    this.lgIal = _lgIal;
    this.lgLpi = _lgLpi;
  }


  public long getLgIal() {
    return this.lgIal;
  }


  public long getLgLpi() {
    return this.lgLpi;
  }


}
