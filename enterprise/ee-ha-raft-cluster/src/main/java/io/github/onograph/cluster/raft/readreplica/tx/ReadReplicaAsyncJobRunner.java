package io.github.onograph.cluster.raft.readreplica.tx;

import java.util.concurrent.Callable;


public class ReadReplicaAsyncJobRunner implements Runnable {


  private final Callable<Void> callableTasVoid;


  private final ReadReplicaJobEventService readReplicaJobEventService;


  private final TxCancelable txCancelable;


  ReadReplicaAsyncJobRunner(Callable<Void> _callableTVoid,
      ReadReplicaJobEventService readReplicaJobEventService, TxCancelable txCancelable) {
    this.callableTasVoid = _callableTVoid;
    this.readReplicaJobEventService = readReplicaJobEventService;
    this.txCancelable = txCancelable;
  }

  @Override
  public void run() {
    if (!this.txCancelable.needsCancel()) {
      try {
        this.callableTasVoid.call();
        this.readReplicaJobEventService.onsue();
      } catch (

          Exception _exception) {
        this.readReplicaJobEventService.onfauForEx(_exception);
      }
    }
  }
}
