package io.github.onograph.internal.batchimport;

import org.neo4j.configuration.Config;
import org.neo4j.internal.batchimport.AdditionalInitialIds;
import org.neo4j.internal.batchimport.BatchImporter;
import org.neo4j.internal.batchimport.BatchImporterFactory;
import org.neo4j.internal.batchimport.Configuration;
import org.neo4j.internal.batchimport.ImportLogic.Monitor;
import org.neo4j.internal.batchimport.IndexImporterFactory;
import org.neo4j.internal.batchimport.input.Collector;
import org.neo4j.internal.batchimport.staging.ExecutionMonitor;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.impl.store.format.RecordFormats;
import org.neo4j.logging.internal.LogService;
import org.neo4j.memory.MemoryTracker;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.storageengine.api.LogFilesInitializer;


public class EnterpriseBatchImporterFactory extends BatchImporterFactory {

  public EnterpriseBatchImporterFactory() {
    super(10);
  }

  @Override
  public String getName() {
    return io.github.onograph.TokenConstants.RESTARTABLE;
  }

  @Override
  public BatchImporter instantiate(DatabaseLayout _databaseLayout,
      FileSystemAbstraction _fileSystemAbstraction, PageCacheTracer _pageCacheTracer,
      Configuration _configuration, LogService _logService, ExecutionMonitor _executionMonitor,
      AdditionalInitialIds _additionalInitialIds, Config _dConfig, RecordFormats _recordFormats,
      Monitor _monitor, JobScheduler _jobScheduler, Collector _bCollector,
      LogFilesInitializer _logFilesInitializer, IndexImporterFactory _indexImporterFactory,
      MemoryTracker _memoryTracker) {
    return new EnterpriseBatchImporter(_additionalInitialIds, _bCollector, _configuration,
        _dConfig, _databaseLayout, _executionMonitor, _fileSystemAbstraction, _indexImporterFactory,
        _jobScheduler,
        _logFilesInitializer, _logService,
        _memoryTracker, _monitor, _pageCacheTracer, _recordFormats);
  }
}
