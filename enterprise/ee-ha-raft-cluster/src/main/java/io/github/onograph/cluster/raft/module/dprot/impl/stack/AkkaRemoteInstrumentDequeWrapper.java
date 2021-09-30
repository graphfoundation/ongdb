package io.github.onograph.cluster.raft.module.dprot.impl.stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class AkkaRemoteInstrumentDequeWrapper {


  private static final Deque<Byte> dequeIdsByte =
      IntStream.range(8, 32).boxed().map(Integer::byteValue)
          .collect(Collectors.toCollection(LinkedList::new));


  public static synchronized byte geinfr() {
    return dequeIdsByte.pop();
  }
}
