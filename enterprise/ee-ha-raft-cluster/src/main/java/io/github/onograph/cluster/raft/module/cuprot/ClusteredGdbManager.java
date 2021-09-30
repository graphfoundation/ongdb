package io.github.onograph.cluster.raft.module.cuprot;

import io.github.onograph.cluster.raft.module.cuprot.scmeta.ClusteredGdb;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.RemoteStoreServiceManager;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.SocketAddressController;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreService;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.TxMetaUtil;
import io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionSyncManager;
import io.github.onograph.config.SettingsDeclarationClusterImpl;
import java.time.Duration;
import org.neo4j.configuration.Config;
import org.neo4j.graphdb.factory.module.GlobalModule;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.kernel.availability.CompositeDatabaseAvailabilityGuard;
import org.neo4j.kernel.database.DatabaseTracers;
import org.neo4j.logging.LogProvider;
import org.neo4j.memory.MemoryTracker;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.time.SystemNanoClock;


public final class ClusteredGdbManager {

  private ClusteredGdbManager() {
  }


  public static ClusteredGdb crertsrClusteredGdb(StoreService _ccsStoreService,
      GlobalModule _globalModule, TransactionSyncManager _tpcTransactionSyncManager) {

    LogProvider _logProvider = _globalModule.getLogService().getInternalLogProvider();

    Config _config = _globalModule.getGlobalConfig();

    JobScheduler _jobScheduler = _globalModule.getJobScheduler();

    PageCache _pageCache = _globalModule.getPageCache();

    FileSystemAbstraction _fileSystemAbstraction = _globalModule.getFileSystem();

    DatabaseTracers _databaseTracers = new DatabaseTracers(_globalModule.getTracers());

    MemoryTracker _tgmoMemoryTracker = _globalModule.getOtherMemoryPool().getPoolMemoryTracker();

    SystemNanoClock _systemNanoClock = _globalModule.getGlobalClock();

    CompositeDatabaseAvailabilityGuard _compositeDatabaseAvailabilityGuard = _globalModule.getGlobalAvailabilityGuard();

    Duration _imDuration = _config.get(SettingsDeclarationClusterImpl.settingStcareetDuration);
    return crertsrClusteredGdb(_ccsStoreService, _compositeDatabaseAvailabilityGuard, _config,
        _tpcTransactionSyncManager, _databaseTracers,
        _fileSystemAbstraction, _imDuration, _jobScheduler,
        _logProvider, _pageCache, _systemNanoClock, _tgmoMemoryTracker);
  }


  private static ClusteredGdb crertsrClusteredGdb(StoreService _ccsStoreService,
      CompositeDatabaseAvailabilityGuard _compositeDatabaseAvailabilityGuard, Config _config,
      TransactionSyncManager _cptTransactionSyncManager, DatabaseTracers _databaseTracers,
      FileSystemAbstraction _fileSystemAbstraction, Duration _imDuration,
      JobScheduler _jobScheduler, LogProvider _logProvider, PageCache _pageCache,
      SystemNanoClock _systemNanoClock, MemoryTracker _tgmoMemoryTracker) {

    RemoteStoreServiceManager remoteStoreServiceManager =
        new RemoteStoreServiceManager(_ccsStoreService, _systemNanoClock,
            new SocketAddressController(), _imDuration, _jobScheduler, _logProvider);

    TransactionLogSyncManagerBuilder _fltTransactionLogSyncManagerBuilder =
        new TransactionLogSyncManagerBuilder(_fileSystemAbstraction, _logProvider,
            _tgmoMemoryTracker, _pageCache,
            _databaseTracers.getPageCacheTracer());
    return new ClusteredGdb(_compositeDatabaseAvailabilityGuard, _config,
        _cptTransactionSyncManager, _fileSystemAbstraction,
        _fltTransactionLogSyncManagerBuilder,
        new TxMetaUtil(_config, _fileSystemAbstraction, _pageCache), _logProvider, _pageCache,
        _databaseTracers.getPageCacheTracer(), remoteStoreServiceManager);
  }
}
