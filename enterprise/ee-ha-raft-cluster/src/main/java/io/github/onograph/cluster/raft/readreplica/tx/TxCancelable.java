package io.github.onograph.cluster.raft.readreplica.tx;


public interface TxCancelable {


  boolean needsCancel();
}
