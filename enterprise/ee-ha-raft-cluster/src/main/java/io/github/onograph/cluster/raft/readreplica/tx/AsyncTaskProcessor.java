package io.github.onograph.cluster.raft.readreplica.tx;

import java.util.concurrent.BlockingQueue;
import org.neo4j.logging.Log;


class AsyncTaskProcessor implements Runnable {


  private final BlockingQueue<Runnable> blockingQueueJoRunnable;


  private final Log log;


  private volatile boolean isPs;

  AsyncTaskProcessor(BlockingQueue<Runnable> _blockingQueueJoRunnable, Log _log) {
    this.blockingQueueJoRunnable = _blockingQueueJoRunnable;
    this.log = _log;
  }


  private void _rujForRu(Runnable _jRunnable) {
    try {
      _jRunnable.run();
    } catch (

        Throwable _throwable) {

    }
  }

  @Override
  public void run() {
    while (!this.isPs) {

      Runnable _jRunnable;
      try {
        _jRunnable = this.blockingQueueJoRunnable.take();
      } catch (

          InterruptedException _interruptedException) {

        continue;
      }

      this._rujForRu(_jRunnable);
    }

    this.blockingQueueJoRunnable.forEach(this::_rujForRu);


  }


  void stppln() {
    this.isPs = true;
    this.blockingQueueJoRunnable.add(() ->
    {
    });
  }
}
