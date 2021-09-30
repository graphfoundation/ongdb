package io.github.onograph.cluster.raft.readreplica;

import io.github.onograph.cluster.raft.share.calg.scholder.ScHolderBuilder;
import io.github.onograph.cluster.raft.share.calg.scholder.ScHolderJobScheduler;
import io.github.onograph.cluster.raft.share.calg.scholder.ScHolderJobSchedulerWatcher;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.scheduler.Group;


public class CatchupNodeTaskCoordinator extends LifecycleAdapter {


  private final CatchupRunner catchupRunner;


  private final Duration ijcDuration;


  private final ScHolderJobScheduler stScHolderJobScheduler;


  private ScHolderJobSchedulerWatcher tmrScHolderJobSchedulerWatcher;


  public CatchupNodeTaskCoordinator(CatchupRunner catchupRunner, Duration _ijcDuration,
      ScHolderJobScheduler _stScHolderJobScheduler) {
    this.catchupRunner = catchupRunner;
    this.ijcDuration = _ijcDuration;
    this.stScHolderJobScheduler = _stScHolderJobScheduler;
  }

  @Override
  public void start() throws Exception {
    this.tmrScHolderJobSchedulerWatcher = this.stScHolderJobScheduler.craScHolderJobSchedulerWatcher(
        Group.PULL_UPDATES, (timeout) ->
        {
          this.catchupRunner.run();
          this.tmrScHolderJobSchedulerWatcher.isRee();
        }, SchedulerTypes.ST_TRX_IN_SW);
    this.tmrScHolderJobSchedulerWatcher.isSetForSc(
        ScHolderBuilder.fietioScHolder(this.ijcDuration.toMillis(), TimeUnit.MILLISECONDS));
  }

  @Override
  public void stop() throws Exception {
    if (this.tmrScHolderJobSchedulerWatcher != null) {
      this.tmrScHolderJobSchedulerWatcher.kilForSc(
          io.github.onograph.cluster.raft.share.calg.scholder.ScHolderJobSchedulerWatcher.JobTerminationType.JTT_SYNC_HOLD);
    }
  }


  public enum SchedulerTypes implements ScHolderJobScheduler.SchedulerTypeService {


    ST_TRX_IN_SW
  }
}
