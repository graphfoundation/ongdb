package io.github.onograph.cluster.raft.share.calg.cle;

import io.github.onograph.cluster.raft.share.meta.ConsensusTLogManager;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.function.BooleanSupplier;
import org.neo4j.exceptions.UnderlyingStorageException;
import org.neo4j.function.Predicates;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobHandle;
import org.neo4j.scheduler.JobScheduler;


public class LogMaintainerLifecycleAdapter extends LifecycleAdapter {


  private final JobScheduler jobScheduler;


  private final long lgMpr;


  private final Log log;


  private final ConsensusTLogManager plConsensusTLogManager;


  private volatile boolean isCp;


  private final BooleanSupplier cpcBooleanSupplier = new BooleanSupplier() {
    @Override
    public boolean getAsBoolean() {
      return !LogMaintainerLifecycleAdapter.this.isCp;
    }
  };


  private volatile JobHandle jobHandle;


  private volatile boolean notRunning;
  public LogMaintainerLifecycleAdapter(JobScheduler _jobScheduler, long _lgRpm,
      LogProvider _logProvider, ConsensusTLogManager _plConsensusTLogManager) {
    this.plConsensusTLogManager = _plConsensusTLogManager;
    this.jobScheduler = _jobScheduler;
    this.lgMpr = _lgRpm;
    this.log = _logProvider.getLog(this.getClass());
  }  private final Runnable jRunnable = new Runnable() {
    @Override
    public void run() {
      try {
        LogMaintainerLifecycleAdapter.this.isCp = true;
        if (LogMaintainerLifecycleAdapter.this.notRunning) {
          return;
        }

        LogMaintainerLifecycleAdapter.this.plConsensusTLogManager.prn();
      } catch (

          IOException _iOException) {
        throw new UnderlyingStorageException(_iOException);
      } finally {
        LogMaintainerLifecycleAdapter.this.isCp = false;
      }

      if (!LogMaintainerLifecycleAdapter.this.notRunning) {
        LogMaintainerLifecycleAdapter.this.jobHandle = LogMaintainerLifecycleAdapter.this.jobScheduler
            .schedule(Group.RAFT_LOG_PRUNING, LogMaintainerLifecycleAdapter.this.jRunnable,
                LogMaintainerLifecycleAdapter.this.lgMpr,
                TimeUnit.MILLISECONDS);
      }
    }
  };

  @Override
  public void start() {
    this.jobHandle = this.jobScheduler.schedule(Group.RAFT_LOG_PRUNING, this.jRunnable, this.lgMpr,
        TimeUnit.MILLISECONDS);
  }

  @Override
  public void stop() {

    this.notRunning = true;
    if (this.jobHandle != null) {
      this.jobHandle.cancel();
    }

    Predicates.awaitForever(this.cpcBooleanSupplier, 100L, TimeUnit.MILLISECONDS);
  }




}
