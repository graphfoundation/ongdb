package io.github.onograph.cluster.raft.readreplica.tx;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobScheduler;


public class ReadReplicaAsyncTransactionAdapter extends LifecycleAdapter {


  private final AsyncTaskProcessor asyncTaskProcessor;


  private final BlockingQueue<Runnable> blockingQueueQjRunnable = new LinkedBlockingQueue();


  private final JobScheduler jobScheduler;


  private final Log log;


  private Thread apirThread;


  private volatile boolean notRunning;

  public ReadReplicaAsyncTransactionAdapter(JobScheduler _jobScheduler, LogProvider _logProvider) {
    this.log = _logProvider.getLog(this.getClass());
    this.jobScheduler = _jobScheduler;
    this.asyncTaskProcessor = new AsyncTaskProcessor(this.blockingQueueQjRunnable, this.log);
  }


  public void addForRu(Runnable _taRunnable) {
    if (this.notRunning) {

    } else {
      this.blockingQueueQjRunnable.add(_taRunnable);
    }
  }

  @Override
  public void start() throws Exception {

    this.apirThread = this.jobScheduler.threadFactory(Group.APPLY_UPDATES)
        .newThread(this.asyncTaskProcessor);
    this.apirThread.start();
  }

  @Override
  public void stop() throws Exception {

    this.notRunning = true;
    this.asyncTaskProcessor.stppln();
    this.apirThread.join();
  }
}
