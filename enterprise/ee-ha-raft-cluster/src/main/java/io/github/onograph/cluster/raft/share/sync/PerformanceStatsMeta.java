package io.github.onograph.cluster.raft.share.sync;


public class PerformanceStatsMeta {


  public String gdbName;


  public Double mbpesenDouble;


  public Double oppmlDouble;


  public Long sizeCnt;


  public Long tiemls;


  public Long toarees;


  PerformanceStatsMeta(String gdbName, long _lgMtt, long _lgRt, long sizeCnt) {
    this.gdbName = gdbName;
    this.toarees = _lgRt;
    this.sizeCnt = sizeCnt;
    this.tiemls = _lgMtt;
    this.oppmlDouble = (double) _lgRt / (double) _lgMtt;
    this.mbpesenDouble = (double) sizeCnt / (double) _lgMtt / 1048576.0D * 1000.0D;
  }
}
