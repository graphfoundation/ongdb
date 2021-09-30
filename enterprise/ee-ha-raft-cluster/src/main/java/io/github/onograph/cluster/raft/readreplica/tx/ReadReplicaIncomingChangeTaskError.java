package io.github.onograph.cluster.raft.readreplica.tx;


public class ReadReplicaIncomingChangeTaskError extends Exception {


  public static ReadReplicaIncomingChangeTaskError IT = new ReadReplicaIncomingChangeTaskError();

  private ReadReplicaIncomingChangeTaskError() {
  }
}
