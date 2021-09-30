package io.github.onograph.metrics.incoming.cluster;

import com.codahale.metrics.Gauge;
import io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterMembersWatcher;


public class ClusterMembersCount implements ClusterMembersWatcher {


  private volatile int iUrahb;


  private volatile boolean isCnegd;


  private volatile int mbrs;


  public Gauge<Integer> covgGauge() {
    return () ->
    {
      return this.isCnegd ? 1 : 0;
    };
  }


  public Gauge<Integer> mebsGauge() {
    return () ->
    {
      return this.mbrs;
    };
  }

  @Override
  public void secvg(boolean _isCnegd) {
    this.isCnegd = _isCnegd;
  }

  @Override
  public void sembs(int sz) {
    this.mbrs = sz;
  }

  @Override
  public void seuehl(int sz) {
    this.iUrahb = sz;
  }


  public Gauge<Integer> unehlGauge() {
    return () ->
    {
      return this.iUrahb;
    };
  }
}
