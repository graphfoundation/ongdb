package io.github.onograph.cluster.raft.module.cuprot;

import java.io.IOException;
import org.neo4j.configuration.Config;
import org.neo4j.internal.helpers.collection.LongRange;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.logging.LogProvider;
import org.neo4j.memory.MemoryTracker;
import org.neo4j.monitoring.DatabaseHealth;
import org.neo4j.storageengine.api.StorageEngineFactory;


public class TransactionLogSyncManagerBuilder {


  private final FileSystemAbstraction fFileSystemAbstraction;


  private final LogProvider logProvider;


  private final MemoryTracker memoryTracker;


  private final PageCache pageCache;


  private final PageCacheTracer pageCacheTracer;


  public TransactionLogSyncManagerBuilder(FileSystemAbstraction _fFileSystemAbstraction,
      LogProvider _logProvider, MemoryTracker _memoryTracker, PageCache _pageCache,
      PageCacheTracer _pageCacheTracer) {
    this.fFileSystemAbstraction = _fFileSystemAbstraction;
    this.logProvider = _logProvider;
    this.memoryTracker = _memoryTracker;
    this.pageCache = _pageCache;
    this.pageCacheTracer = _pageCacheTracer;
  }


  public TransactionLogSyncManager craTransactionLogSyncManager(Config _config,
      DatabaseHealth _databaseHealth, DatabaseLayout _databaseLayout, boolean _isCsf,
      boolean _isDsiltk, StorageEngineFactory _storageEngineFactory, LongRange _tivLongRange)
      throws IOException {
    return new TransactionLogSyncManager(_config, _databaseHealth, _databaseLayout,
        this.fFileSystemAbstraction,
        _isCsf, _isDsiltk, _tivLongRange, this.logProvider, this.memoryTracker, this.pageCache,
        this.pageCacheTracer,
        _storageEngineFactory);
  }
}
