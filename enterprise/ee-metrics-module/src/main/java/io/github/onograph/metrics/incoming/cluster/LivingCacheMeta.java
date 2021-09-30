package io.github.onograph.metrics.incoming.cluster;

import io.github.onograph.cluster.raft.share.calg.cle.cservice.LivingCacheObserver;
import java.util.concurrent.atomic.LongAdder;


public class LivingCacheMeta implements LivingCacheObserver {


  private final LongAdder hiLongAdder = new LongAdder();


  private final LongAdder mseLongAdder = new LongAdder();


  private volatile int iCe;


  private volatile int iEm;


  private volatile long lgBm;


  private volatile long sizeCnt;

  @Override
  public void cacheHit() {
    this.hiLongAdder.increment();
  }

  @Override
  public void cacheMiss() {
    this.mseLongAdder.increment();
  }


  public long gehs() {
    return this.hiLongAdder.sum();
  }


  public long gems() {
    return this.mseLongAdder.sum();
  }


  public long getICe() {
    return this.iCe;
  }


  public long getIEm() {
    return this.iEm;
  }


  public long getLgBm() {
    return this.lgBm;
  }


  public long getSizeCnt() {
    return this.sizeCnt;
  }

  @Override
  public void seeec(int _iCe) {
    this.iCe = _iCe;
  }

  @Override
  public void sembe(long _lgMb) {
    this.lgBm = _lgMb;
  }

  @Override
  public void sememt(int _iEm) {
    this.iEm = _iEm;
  }

  @Override
  public void setabys(long sizeCnt) {
    this.sizeCnt = sizeCnt;
  }
}
