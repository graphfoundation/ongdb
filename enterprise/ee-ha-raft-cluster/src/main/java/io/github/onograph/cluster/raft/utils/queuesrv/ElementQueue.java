package io.github.onograph.cluster.raft.utils.queuesrv;

import java.util.List;


public interface ElementQueue<E> {


  boolean isQueueEmpty();


  E poll();


  void recForTry(E _eVar);


  void removeAll();


  void removeSome(List<E> some);
}
