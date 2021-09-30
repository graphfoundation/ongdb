package io.github.onograph.cluster.raft.readreplica;


@FunctionalInterface
public interface CatchupRunner {


  void run();
}
