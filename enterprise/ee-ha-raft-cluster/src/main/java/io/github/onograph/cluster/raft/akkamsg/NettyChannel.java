package io.github.onograph.cluster.raft.akkamsg;

import java.util.concurrent.Future;


public interface NettyChannel {


  void dipe();


  boolean isChannelDis();


  boolean isChannelOpen();


  Future<Void> wrtFuture(Object _obVa);


  Future<Void> wrtanflhFuture(Object _obVar);
}
