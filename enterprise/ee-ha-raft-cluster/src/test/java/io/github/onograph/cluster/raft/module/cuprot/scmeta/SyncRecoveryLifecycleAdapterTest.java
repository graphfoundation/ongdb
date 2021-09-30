package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyLong;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.neo4j.adversaries.fs.AdversarialChannelDefaultFileSystemAbstraction;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.configuration.Config;
import org.neo4j.internal.recordstorage.RecordStorageEngineFactory;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.pagecache.DelegatingPageCache;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.database.DatabaseTracers;
import org.neo4j.kernel.monitoring.tracing.Tracers;
import org.neo4j.memory.LocalMemoryTracker;
import org.neo4j.monitoring.Monitors;
import org.neo4j.storageengine.api.StorageEngineFactory;
import org.neo4j.storageengine.api.StoreVersionCheck;
import org.neo4j.storageengine.migration.UpgradeNotAllowedException;
import org.neo4j.test.FakeClockJobScheduler;
import org.neo4j.time.SystemNanoClock;

class SyncRecoveryLifecycleAdapterTest {

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
    new SyncRecoveryLifecycleAdapter(_databaseTracers, _fFileSystemAbstraction, _memoryTracker,
        new DelegatingPageCache(
            new DelegatingPageCache(new DelegatingPageCache(new DelegatingPageCache(null)))));
  }

  @Test
  void testIsCarcreseForCoDaSt() {
    DatabaseTracers databaseTracers = mock(DatabaseTracers.class);
    when(databaseTracers.getPageCacheTracer()).thenThrow(new UpgradeNotAllowedException("Msg"));
    AdversarialChannelDefaultFileSystemAbstraction _fFileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    LocalMemoryTracker _memoryTracker = new LocalMemoryTracker();
    SyncRecoveryLifecycleAdapter syncRecoveryLifecycleAdapter = new SyncRecoveryLifecycleAdapter(
        databaseTracers,
        _fFileSystemAbstraction, _memoryTracker,
        new DelegatingPageCache(new DelegatingPageCache(
            new DelegatingPageCache(null))));
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn("Get");
    DatabaseLayout _databaseLayout = mock(DatabaseLayout.class);
    assertThrows(UpgradeNotAllowedException.class,
        () -> syncRecoveryLifecycleAdapter.isCarcreseForCoDaSt(config,
            _databaseLayout, 1L,
            new RecordStorageEngineFactory()));
    verify(databaseTracers).getPageCacheTracer();
  }

  @Test
  void testIsCarcreseForCoDaSt2() {
    DatabaseTracers databaseTracers = mock(DatabaseTracers.class);
    when(databaseTracers.getPageCacheTracer()).thenReturn(mock(PageCacheTracer.class));
    AdversarialChannelDefaultFileSystemAbstraction _fFileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    LocalMemoryTracker _memoryTracker = new LocalMemoryTracker();
    SyncRecoveryLifecycleAdapter syncRecoveryLifecycleAdapter = new SyncRecoveryLifecycleAdapter(
        databaseTracers,
        _fFileSystemAbstraction, _memoryTracker,
        new DelegatingPageCache(new DelegatingPageCache(
            new DelegatingPageCache(null))));
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn("");
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.getDatabaseName()).thenReturn("Database Name");
    when(databaseLayout.metadataStore()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    StoreVersionCheck storeVersionCheck = mock(StoreVersionCheck.class);
    when(storeVersionCheck.storeVersionToString(anyLong())).thenThrow(
        new UpgradeNotAllowedException("Msg"));
    StorageEngineFactory storageEngineFactory = mock(StorageEngineFactory.class);
    when(storageEngineFactory.versionCheck((org.neo4j.io.fs.FileSystemAbstraction) any(),
        (DatabaseLayout) any(),
        (Config) any(), (PageCache) any(), (org.neo4j.logging.internal.LogService) any(),
        (PageCacheTracer) any()))
        .thenReturn(storeVersionCheck);
    assertThrows(UpgradeNotAllowedException.class,
        () -> syncRecoveryLifecycleAdapter.isCarcreseForCoDaSt(config, databaseLayout, 1L,
            storageEngineFactory));
    verify(databaseTracers).getPageCacheTracer();
    verify(storageEngineFactory).versionCheck((org.neo4j.io.fs.FileSystemAbstraction) any(),
        (DatabaseLayout) any(),
        (Config) any(), (PageCache) any(), (org.neo4j.logging.internal.LogService) any(),
        (PageCacheTracer) any());
    verify(storeVersionCheck).storeVersionToString(anyLong());
  }

  @Test
  void testReecoForCoDaSt() throws IOException, GdbFailedToStopException {
    DatabaseTracers databaseTracers = mock(DatabaseTracers.class);
    when(databaseTracers.getPageCacheTracer()).thenThrow(new UpgradeNotAllowedException("Msg"));
    AdversarialChannelDefaultFileSystemAbstraction _fFileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    LocalMemoryTracker _memoryTracker = new LocalMemoryTracker();
    SyncRecoveryLifecycleAdapter syncRecoveryLifecycleAdapter = new SyncRecoveryLifecycleAdapter(
        databaseTracers,
        _fFileSystemAbstraction, _memoryTracker,
        new DelegatingPageCache(new DelegatingPageCache(
            new DelegatingPageCache(null))));
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn("Get");
    DatabaseLayout _databaseLayout = mock(DatabaseLayout.class);
    assertThrows(UpgradeNotAllowedException.class,
        () -> syncRecoveryLifecycleAdapter.reecoForCoDaSt(config, _databaseLayout,
            new RecordStorageEngineFactory()));
    verify(databaseTracers).getPageCacheTracer();
  }

  @Test
  void testReecoForCoDaSt2() throws IOException, GdbFailedToStopException {
    PageCacheTracer pageCacheTracer = mock(PageCacheTracer.class);
    when(pageCacheTracer.createPageCursorTracer((String) any())).thenThrow(
        new UpgradeNotAllowedException("Msg"));
    DatabaseTracers databaseTracers = mock(DatabaseTracers.class);
    when(databaseTracers.getPageCacheTracer()).thenReturn(pageCacheTracer);
    AdversarialChannelDefaultFileSystemAbstraction _fFileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    LocalMemoryTracker _memoryTracker = new LocalMemoryTracker();
    SyncRecoveryLifecycleAdapter syncRecoveryLifecycleAdapter = new SyncRecoveryLifecycleAdapter(
        databaseTracers,
        _fFileSystemAbstraction, _memoryTracker,
        new DelegatingPageCache(new DelegatingPageCache(
            new DelegatingPageCache(null))));
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn("");
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.getDatabaseName()).thenReturn("Database Name");
    when(databaseLayout.metadataStore()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    StorageEngineFactory storageEngineFactory = mock(StorageEngineFactory.class);
    when(storageEngineFactory.versionCheck((org.neo4j.io.fs.FileSystemAbstraction) any(),
        (DatabaseLayout) any(),
        (Config) any(), (PageCache) any(), (org.neo4j.logging.internal.LogService) any(),
        (PageCacheTracer) any()))
        .thenReturn(null);
    assertThrows(UpgradeNotAllowedException.class,
        () -> syncRecoveryLifecycleAdapter.reecoForCoDaSt(config, databaseLayout,
            storageEngineFactory));
    verify(databaseTracers).getPageCacheTracer();
    verify(pageCacheTracer).createPageCursorTracer((String) any());
    verify(storageEngineFactory).versionCheck((org.neo4j.io.fs.FileSystemAbstraction) any(),
        (DatabaseLayout) any(),
        (Config) any(), (PageCache) any(), (org.neo4j.logging.internal.LogService) any(),
        (PageCacheTracer) any());
  }
}

