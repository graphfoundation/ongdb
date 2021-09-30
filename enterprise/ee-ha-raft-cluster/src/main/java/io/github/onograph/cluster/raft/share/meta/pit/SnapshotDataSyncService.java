package io.github.onograph.cluster.raft.share.meta.pit;

import io.github.onograph.cluster.raft.module.cuprot.SocketAddressService;
import io.github.onograph.cluster.raft.share.meta.ActionProcessManager;
import io.github.onograph.cluster.raft.share.meta.SnapshotDataManager;
import io.github.onograph.dbms.GdbReplicator;
import io.github.onograph.dbms.crash.CrashSignaler;
import io.github.onograph.dbms.crash.GdbCrashCauseInfo;
import io.github.onograph.dbms.crash.GdbCrashEvent;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.neo4j.collection.Dependencies;
import org.neo4j.internal.helpers.TimeoutStrategy;
import org.neo4j.internal.helpers.TimeoutStrategy.Timeout;
import org.neo4j.kernel.database.Database;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.Log;
import org.neo4j.monitoring.Monitors;
import org.neo4j.storageengine.api.TransactionIdStore;


class SnapshotDataSyncService implements Runnable {


  static final String DOOAT = io.github.onograph.I18N.format(
      "io.github.onograph.cluster.raft.share.meta.pit.SnapshotDataSyncService.var");


  static final String SHTW = io.github.onograph.TokenConstants.SHUTDOWN;


  private final AtomicReference<io.github.onograph.cluster.raft.share.meta.pit.SnapshotDataSyncService.SnapshotStatusType>
      atomicReferenceSaeSnapshotStatusType;


  private final StoreSyncEnvironment cnetStoreSyncEnvironment;


  private final CoreDbSyncWatcher coreDbSyncWatcher;


  private final CrashSignaler crashSignaler;


  private final GdbReplicator desGdbReplicator;


  private final DataSyncManager dwlaeDataSyncManager;


  private final Log log;


  private final AtomicBoolean notRunning;


  private final ActionProcessManager paActionProcessManager;


  private final SocketAddressService paSocketAddressService;


  private final SnapshotDataManager ssSnapshotDataManager;


  private final TimeoutStrategy timeoutStrategy;


  SnapshotDataSyncService(StoreSyncEnvironment _cnetStoreSyncEnvironment,
      CrashSignaler crashSignaler, DataSyncManager _dwlaeDataSyncManager, Log _log,
      Monitors _monitors, ActionProcessManager _paActionProcessManager,
      SocketAddressService _paSocketAddressService, GdbReplicator _sedGdbReplicator,
      SnapshotDataManager _ssSnapshotDataManager, TimeoutStrategy _timeoutStrategy) {
    this.paActionProcessManager = _paActionProcessManager;
    this.paSocketAddressService = _paSocketAddressService;
    this.dwlaeDataSyncManager = _dwlaeDataSyncManager;
    this.ssSnapshotDataManager = _ssSnapshotDataManager;
    this.desGdbReplicator = _sedGdbReplicator;
    this.cnetStoreSyncEnvironment = _cnetStoreSyncEnvironment;
    this.log = _log;
    this.timeoutStrategy = _timeoutStrategy;
    this.crashSignaler = crashSignaler;
    this.coreDbSyncWatcher = _monitors.newMonitor(CoreDbSyncWatcher.class, new String[0]);
    this.notRunning = new AtomicBoolean(false);
    this.atomicReferenceSaeSnapshotStatusType =
        new AtomicReference(
            io.github.onograph.cluster.raft.share.meta.pit.SnapshotDataSyncService.SnapshotStatusType.SST_READY);
  }


  private SnapshotData _doosatastSnapshotData(StoreSyncEnvironment _cnetStoreSyncEnvironment)
      throws SyncException, InterruptedException {

    Timeout _bcofTimeout = this.timeoutStrategy.newTimeout();

    while (!this.notRunning.get()) {
      try {
        return this.dwlaeDataSyncManager.doosatastSnapshotData(_cnetStoreSyncEnvironment,
            this.paSocketAddressService);
      } catch (

          SyncException _syncException) {
        if (_syncException.getFailureType() != SyncException.FailureType.CRET_ERR) {
          throw _syncException;
        }

        Thread.sleep(_bcofTimeout.getAndIncrement());
      }
    }

    throw new SyncException(
        SyncException.FailureType.FT_ERR, "*** Error:  1eebafb0-633f-4075-93b3-4d82b2b6046f");
  }


  private void _noyseceForDa(Database _database) {

    Dependencies _rdDependencies = _database.getDependencyResolver();

    TransactionIdStore _sitTransactionIdStore = _rdDependencies.resolveDependency(
        TransactionIdStore.class);

    long _lgItcl = _sitTransactionIdStore.getLastCommittedTransactionId();

    assert _lgItcl == _sitTransactionIdStore.getLastClosedTransactionId();

    this.desGdbReplicator.gedteetdaGdbReplicatorFireEvents(
        this.cnetStoreSyncEnvironment.daasidNamedDatabaseId()).ftree(_lgItcl);
  }


  private void _paiForTh(Throwable _throwable) {

    this.crashSignaler.signal(
        new GdbCrashEvent(_throwable, this.cnetStoreSyncEnvironment.daasidNamedDatabaseId(),
            GdbCrashCauseInfo.CCI_SP_ERR));
    if (this.notRunning.compareAndSet(false, true)) {
      this.paActionProcessManager.stopProcessor(io.github.onograph.TokenConstants.SHUTDOWN);
    }
  }


  void cancel() {
    if (this.notRunning.compareAndSet(false, true)) {
      this.paActionProcessManager.stopProcessor(io.github.onograph.TokenConstants.SHUTDOWN);

      while (this.atomicReferenceSaeSnapshotStatusType.get() !=
          io.github.onograph.cluster.raft.share.meta.pit.SnapshotDataSyncService.SnapshotStatusType.SST_DONE) {
        try {
          Thread.sleep(100L);
        } catch (

            InterruptedException _interruptedException) {
          Thread.currentThread().interrupt();
        }
      }
    }
  }


  boolean isHacpt() {
    return this.atomicReferenceSaeSnapshotStatusType.get() ==
        io.github.onograph.cluster.raft.share.meta.pit.SnapshotDataSyncService.SnapshotStatusType.SST_DONE;
  }

  @Override
  public void run() {
    if (this.atomicReferenceSaeSnapshotStatusType.compareAndSet(
        io.github.onograph.cluster.raft.share.meta.pit.SnapshotDataSyncService.SnapshotStatusType.SST_READY,
        io.github.onograph.cluster.raft.share.meta.pit.SnapshotDataSyncService.SnapshotStatusType.SST_PROCESSING)) {

      NamedDatabaseId _namedDatabaseId = this.cnetStoreSyncEnvironment.daasidNamedDatabaseId();

      try {
        this.coreDbSyncWatcher.stednatForNa(_namedDatabaseId);
        this.paActionProcessManager.stopProcessor(io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.share.meta.pit.SnapshotDataSyncService.stopProcessor"));

        io.github.onograph.dbms.DbmsManagerClusterImpl.StoreSyncOpFacade _ksStoreSyncOpFacade =
            this.cnetStoreSyncEnvironment.stfosrcyDbmsManagerClusterImplStoreSyncOpFacade();

        SnapshotData _snapshotData = this._doosatastSnapshotData(this.cnetStoreSyncEnvironment);

        if (this.notRunning.get()) {

        } else {
          this.ssSnapshotDataManager.inlspForSn(_snapshotData);

          boolean _isTr = _ksStoreSyncOpFacade.isReee();
          if (!_isTr) {

          } else if (!this.cnetStoreSyncEnvironment.getKreDatabase().isStarted()) {

          } else {

            this._noyseceForDa(this.cnetStoreSyncEnvironment.getKreDatabase());
          }
        }
      } catch (

          InterruptedException _interruptedException) {
        Thread.currentThread().interrupt();


      } catch (

          SyncException _syncException) {

        if (_syncException.getFailureType() == SyncException.FailureType.FATAL_ERR) {
          this._paiForTh(_syncException);
        } else {

        }
      } catch (

          Throwable _throwable) {
        this._paiForTh(_throwable);
      } finally {
        this.atomicReferenceSaeSnapshotStatusType.compareAndSet(
            io.github.onograph.cluster.raft.share.meta.pit.SnapshotDataSyncService.SnapshotStatusType.SST_PROCESSING,
            io.github.onograph.cluster.raft.share.meta.pit.SnapshotDataSyncService.SnapshotStatusType.SST_DONE);
        this.paActionProcessManager.reualrForSt(
            io.github.onograph.I18N.format(
                "io.github.onograph.cluster.raft.share.meta.pit.SnapshotDataSyncService.reualrForSt"));
        this.coreDbSyncWatcher.doosatclForNa(_namedDatabaseId);
      }
    }
  }


  private enum SnapshotStatusType {


    SST_READY,

    SST_PROCESSING,

    SST_DONE
  }
}
