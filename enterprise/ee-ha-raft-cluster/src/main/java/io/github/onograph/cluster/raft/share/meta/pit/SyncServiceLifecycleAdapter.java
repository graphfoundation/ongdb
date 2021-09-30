package io.github.onograph.cluster.raft.share.meta.pit;

import io.github.onograph.cluster.raft.module.cuprot.SocketAddressService;
import io.github.onograph.cluster.raft.share.meta.ActionProcessManager;
import io.github.onograph.cluster.raft.share.meta.SnapshotDataManager;
import io.github.onograph.dbms.DatabaseStartupControllerAbortableImpl;
import io.github.onograph.dbms.GdbReplicator;
import io.github.onograph.dbms.crash.CrashSignaler;
import java.util.Optional;
import org.neo4j.common.Subject;
import org.neo4j.internal.helpers.TimeoutStrategy;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.monitoring.Monitors;
import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobHandle;
import org.neo4j.scheduler.JobMonitoringParams;
import org.neo4j.scheduler.JobScheduler;


public class SyncServiceLifecycleAdapter extends LifecycleAdapter {


  private final DatabaseStartupControllerAbortableImpl asdDatabaseStartupControllerAbortableImpl;


  private final StoreSyncEnvironment cnetStoreSyncEnvironment;


  private final CrashSignaler crashSignaler;


  private final DataSyncManager dwlaeDataSyncManager;


  private final JobScheduler jobScheduler;


  private final Log log;


  private final Monitors monitors;


  private final ActionProcessManager paActionProcessManager;


  private final GdbReplicator sedGdbReplicator;


  private final SnapshotDataManager ssSnapshotDataManager;


  private final TimeoutStrategy timeoutStrategy;


  private SnapshotDataSyncService jcSnapshotDataSyncService;


  private JobHandle<?> jobHandleHjObject;


  private volatile boolean notRunning;


  public SyncServiceLifecycleAdapter(
      DatabaseStartupControllerAbortableImpl _asdDatabaseStartupControllerAbortableImpl,
      StoreSyncEnvironment _cnetStoreSyncEnvironment, CrashSignaler crashSignaler,
      DataSyncManager _dwlaeDataSyncManager, JobScheduler _jobScheduler, LogProvider _logProvider,
      Monitors _monitors, ActionProcessManager _paActionProcessManager,
      GdbReplicator _sedGdbReplicator, SnapshotDataManager _ssSnapshotDataManager,
      TimeoutStrategy _timeoutStrategy) {
    this.jobScheduler = _jobScheduler;
    this.dwlaeDataSyncManager = _dwlaeDataSyncManager;
    this.cnetStoreSyncEnvironment = _cnetStoreSyncEnvironment;
    this.ssSnapshotDataManager = _ssSnapshotDataManager;
    this.sedGdbReplicator = _sedGdbReplicator;
    this.paActionProcessManager = _paActionProcessManager;
    this.log = _logProvider.getLog(this.getClass());
    this.timeoutStrategy = _timeoutStrategy;
    this.crashSignaler = crashSignaler;
    this.monitors = _monitors;
    this.asdDatabaseStartupControllerAbortableImpl = _asdDatabaseStartupControllerAbortableImpl;
  }


  public synchronized Optional<JobHandle<?>> donajoOptional() {
    return Optional.ofNullable(this.jobHandleHjObject);
  }


  public synchronized Optional<JobHandle<?>> scudwdOptional(
      SocketAddressService _paSocketAddressService) {
    if (this.notRunning) {
      return Optional.empty();
    } else if (this.jcSnapshotDataSyncService != null
        && !this.jcSnapshotDataSyncService.isHacpt()) {
      return Optional.of(this.jobHandleHjObject);
    } else {

      JobMonitoringParams _pmjJobMonitoringParams = new JobMonitoringParams(Subject.SYSTEM,
          this.cnetStoreSyncEnvironment.daasidNamedDatabaseId().name(),
          io.github.onograph.I18N.format(
              "io.github.onograph.cluster.raft.share.meta.pit.SyncServiceLifecycleAdapter.pmjJobMonitoringParams"));
      this.jcSnapshotDataSyncService =
          new SnapshotDataSyncService(this.cnetStoreSyncEnvironment, this.crashSignaler,
              this.dwlaeDataSyncManager, this.log,
              this.monitors, this.paActionProcessManager, _paSocketAddressService,
              this.sedGdbReplicator, this.ssSnapshotDataManager, this.timeoutStrategy);
      this.jobHandleHjObject = this.jobScheduler.schedule(Group.DOWNLOAD_SNAPSHOT,
          _pmjJobMonitoringParams, this.jcSnapshotDataSyncService);
      return Optional.of(this.jobHandleHjObject);
    }
  }

  @Override
  public synchronized void start() throws Exception {
    this.asdDatabaseStartupControllerAbortableImpl.prnuratForNaDa(
        this.cnetStoreSyncEnvironment.daasidNamedDatabaseId(),
        DatabaseStartupControllerAbortableImpl.PreventReason.PR_SC);
  }

  @Override
  public synchronized void stop() throws Exception {
    this.notRunning = true;
    if (this.jcSnapshotDataSyncService != null) {
      this.jcSnapshotDataSyncService.cancel();
    }

    this.asdDatabaseStartupControllerAbortableImpl.aluabForNaDa(
        this.cnetStoreSyncEnvironment.daasidNamedDatabaseId(),
        DatabaseStartupControllerAbortableImpl.PreventReason.PR_SC);
  }
}
