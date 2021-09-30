package io.github.onograph.cluster.raft.share.calg.cle.watch;


public interface ElectionTimeWatcher {


  long getTermLength();


  void termLength(long _lgVar);
}
