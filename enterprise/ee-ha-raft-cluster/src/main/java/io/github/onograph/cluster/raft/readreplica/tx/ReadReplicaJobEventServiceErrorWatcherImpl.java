package io.github.onograph.cluster.raft.readreplica.tx;


class ReadReplicaJobEventServiceErrorWatcherImpl implements ReadReplicaJobEventService,
    TxCancelable {


  private volatile boolean isFh;

  @Override
  public boolean needsCancel() {
    return this.isFh;
  }

  @Override
  public void onfauForEx(Exception _exception) {
    this.isFh = true;
  }

  @Override
  public void onsue() {
  }
}
