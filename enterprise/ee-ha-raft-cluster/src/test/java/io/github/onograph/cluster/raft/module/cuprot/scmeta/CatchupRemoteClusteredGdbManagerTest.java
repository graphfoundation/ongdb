package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import static org.mockito.Mockito.mock;

import io.github.onograph.cluster.raft.module.cuprot.TransactionLogSyncManagerBuilder;
import io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionSyncManager;
import org.junit.jupiter.api.Test;
import org.neo4j.adversaries.fs.AdversarialChannelDefaultFileSystemAbstraction;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.configuration.Config;
import org.neo4j.io.pagecache.DelegatingPageCache;
import org.neo4j.io.pagecache.tracing.DefaultPageCacheTracer;
import org.neo4j.kernel.availability.CompositeDatabaseAvailabilityGuard;
import org.neo4j.kernel.database.DatabaseTracers;
import org.neo4j.kernel.monitoring.tracing.Tracers;
import org.neo4j.logging.AssertableLogProvider;
import org.neo4j.memory.LocalMemoryTracker;
import org.neo4j.monitoring.Monitors;
import org.neo4j.test.FakeClockJobScheduler;
import org.neo4j.time.SystemNanoClock;

class CatchupRemoteClusteredGdbManagerTest {

  @Test
  void testConstructor() {

    BufferingLog msgLog = new BufferingLog();
    Monitors monitors = new Monitors();
    DatabaseTracers _databaseTracers = new DatabaseTracers(
        new Tracers("Desired Implementation Name", msgLog, monitors,
            new FakeClockJobScheduler(), mock(SystemNanoClock.class),
            mock(Config.class)));
    AdversarialChannelDefaultFileSystemAbstraction _fFileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    LocalMemoryTracker _memoryTracker = new LocalMemoryTracker();
    SyncRecoveryLifecycleAdapter _rscSyncRecoveryLifecycleAdapter = new SyncRecoveryLifecycleAdapter(
        _databaseTracers,
        _fFileSystemAbstraction, _memoryTracker,
        new DelegatingPageCache(new DelegatingPageCache(
            new DelegatingPageCache(null))));

    CompositeDatabaseAvailabilityGuard _compositeDatabaseAvailabilityGuard = new CompositeDatabaseAvailabilityGuard(
        new FakeClockJobScheduler());
    Config _config = mock(Config.class);
    TransactionSyncManager _cptTransactionSyncManager = new TransactionSyncManager(null,
        new AssertableLogProvider(true));

    AdversarialChannelDefaultFileSystemAbstraction _fFileSystemAbstraction1 = new AdversarialChannelDefaultFileSystemAbstraction();
    AdversarialChannelDefaultFileSystemAbstraction _fFileSystemAbstraction2 = new AdversarialChannelDefaultFileSystemAbstraction();
    AssertableLogProvider _logProvider = new AssertableLogProvider(true);
    LocalMemoryTracker _memoryTracker1 = new LocalMemoryTracker();
    DelegatingPageCache _pageCache = new DelegatingPageCache(new DelegatingPageCache(null));
    TransactionLogSyncManagerBuilder _fltTransactionLogSyncManagerBuilder = new TransactionLogSyncManagerBuilder(
        _fFileSystemAbstraction2, _logProvider, _memoryTracker1, _pageCache,
        new DefaultPageCacheTracer());

    Config _config1 = mock(Config.class);
    AdversarialChannelDefaultFileSystemAbstraction _fFileSystemAbstraction3 = new AdversarialChannelDefaultFileSystemAbstraction();
    TxMetaUtil _hscTxMetaUtil = new TxMetaUtil(_config1, _fFileSystemAbstraction3,
        new DelegatingPageCache(new DelegatingPageCache(null)));

    AssertableLogProvider _logProvider1 = new AssertableLogProvider(true);
    DelegatingPageCache _pageCache1 = new DelegatingPageCache(
        new DelegatingPageCache(new DelegatingPageCache(null)));
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    StoreService _ccsStoreService = new StoreService(null, new AssertableLogProvider(true));

    FakeClockJobScheduler _clock = new FakeClockJobScheduler();
    SocketAddressController gSocketAddressController = new SocketAddressController();
    FakeClockJobScheduler _jobScheduler = new FakeClockJobScheduler();
    new CatchupRemoteClusteredGdbManager(_rscSyncRecoveryLifecycleAdapter,
        new ClusteredGdb(_compositeDatabaseAvailabilityGuard, _config, _cptTransactionSyncManager,
            _fFileSystemAbstraction1, _fltTransactionLogSyncManagerBuilder, _hscTxMetaUtil,
            _logProvider1,
            _pageCache1,
            _pageCacheTracer,
            new RemoteStoreServiceManager(_ccsStoreService, _clock, gSocketAddressController, null,
                _jobScheduler, new AssertableLogProvider(true))));
  }
}

