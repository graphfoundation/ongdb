package io.github.onograph.cluster.raft.readreplica.tx;

import io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompleted;
import java.util.concurrent.CompletableFuture;


class ReadReplicaJobEventServiceStatusImpl implements ReadReplicaJobEventService {


  private final CompletableFuture<TransactionChunkingCompleted> completableFutureFcTransactionChunkingCompleted;


  private final TransactionChunkingCompleted soTransactionChunkingCompleted;

  private ReadReplicaJobEventServiceStatusImpl(
      CompletableFuture<TransactionChunkingCompleted> _completableFutureFcTransactionChunkingCompleted,
      TransactionChunkingCompleted _soTransactionChunkingCompleted) {
    this.completableFutureFcTransactionChunkingCompleted = _completableFutureFcTransactionChunkingCompleted;
    this.soTransactionChunkingCompleted = _soTransactionChunkingCompleted;
  }


  static ReadReplicaJobEventServiceStatusImpl coptsiaReadReplicaJobEventServiceStatusImpl(
      CompletableFuture<TransactionChunkingCompleted> _completableFutureFcTransactionChunkingCompleted,
      TransactionChunkingCompleted _rsosTransactionChunkingCompleted) {
    return new ReadReplicaJobEventServiceStatusImpl(
        _completableFutureFcTransactionChunkingCompleted, _rsosTransactionChunkingCompleted);
  }


  static ReadReplicaJobEventServiceStatusImpl keprnnReadReplicaJobEventServiceStatusImpl(
      CompletableFuture<TransactionChunkingCompleted> _completableFutureFcTransactionChunkingCompleted) {
    return new ReadReplicaJobEventServiceStatusImpl(
        _completableFutureFcTransactionChunkingCompleted, null);
  }

  @Override
  public void onfauForEx(Exception _exception) {
    this.completableFutureFcTransactionChunkingCompleted.completeExceptionally(_exception);
  }

  @Override
  public void onsue() {
    if (this.soTransactionChunkingCompleted != null) {
      this.completableFutureFcTransactionChunkingCompleted.complete(
          this.soTransactionChunkingCompleted);
    }
  }
}
