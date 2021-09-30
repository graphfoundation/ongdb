package io.github.onograph.cluster.raft.share.calg.cle.cservice;


public interface LivingCacheObserver {


  LivingCacheObserver VOI_LIVING_CACHE_OBSERVER = new LivingCacheObserver() {
    @Override
    public void cacheHit() {
    }

    @Override
    public void cacheMiss() {
    }

    @Override
    public void seeec(int _iCe) {
    }

    @Override
    public void sembe(long _lgBm) {
    }

    @Override
    public void sememt(int _iEm) {
    }

    @Override
    public void setabys(long sizeCnt) {
    }
  };


  void cacheHit();


  void cacheMiss();


  void seeec(int _iV);


  void sembe(long _lgVar);


  void sememt(int _iVa);


  void setabys(long _lgV);
}
