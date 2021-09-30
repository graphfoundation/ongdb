package io.github.onograph.cluster.raft.module.cuprot;

import io.github.onograph.cluster.raft.module.cuprot.synctrxr.CatchupIncomingTransactionReply;
import io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionSyncReplyWatcher;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Path;
import java.time.Instant;
import org.neo4j.collection.Dependencies;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.Config.Builder;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.dbms.database.DatabasePageCache;
import org.neo4j.internal.helpers.collection.LongRange;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.pagecache.IOController;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.impl.transaction.CommittedTransactionRepresentation;
import org.neo4j.kernel.impl.transaction.log.LogPosition;
import org.neo4j.kernel.impl.transaction.log.LogPositionMarker;
import org.neo4j.kernel.impl.transaction.log.TransactionLogWriter;
import org.neo4j.kernel.impl.transaction.log.checkpoint.CheckpointAppender;
import org.neo4j.kernel.impl.transaction.log.entry.LogHeaderReader;
import org.neo4j.kernel.impl.transaction.log.files.LogFile;
import org.neo4j.kernel.impl.transaction.log.files.LogFiles;
import org.neo4j.kernel.impl.transaction.log.files.LogFilesBuilder;
import org.neo4j.kernel.impl.transaction.log.files.TransactionLogFilesHelper;
import org.neo4j.kernel.impl.transaction.log.files.checkpoint.CheckpointFile;
import org.neo4j.kernel.impl.transaction.tracing.LogCheckPointEvent;
import org.neo4j.kernel.lifecycle.Lifespan;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.memory.MemoryTracker;
import org.neo4j.monitoring.DatabaseHealth;
import org.neo4j.storageengine.api.MetadataProvider;
import org.neo4j.storageengine.api.StorageEngineFactory;
import org.neo4j.storageengine.api.TransactionId;


public class TransactionLogSyncManager implements TransactionSyncReplyWatcher, AutoCloseable {


  private static final String FUL_DST_COP_CPX =
      io.github.onograph.I18N.format(
          "io.github.onograph.cluster.raft.module.cuprot.TransactionLogSyncManager.var");


  private static final String TXS_LG_CACP_LT = io.github.onograph.TokenConstants.TRANSACTION_LOG_CATCHUP;


  private final DatabasePageCache databasePageCache;


  private final boolean isCsf;


  private final LongRange itivLongRange;


  private final Lifespan lifespan = new Lifespan();


  private final Log log;


  private final LogFiles logFiles;


  private final LogPositionMarker logPositionMarker = new LogPositionMarker();


  private final PageCacheTracer pageCacheTracer;


  private final MetadataProvider sdmMetadataProvider;


  private final TransactionLogWriter transactionLogWriter;


  private long lgIte = -1L;


  private long lgItl = -1L;


  TransactionLogSyncManager(Config _config, DatabaseHealth _databaseHealth,
      DatabaseLayout _databaseLayout, FileSystemAbstraction _fFileSystemAbstraction, boolean _isCsf,
      boolean _isDsiltk, LongRange _itivLongRange, LogProvider _logProvider,
      MemoryTracker _memoryTracker, PageCache _pageCache, PageCacheTracer _pageCacheTracer,
      StorageEngineFactory _storageEngineFactory) throws IOException {
    this.log = _logProvider.getLog(this.getClass());
    this.isCsf = _isCsf;
    this.pageCacheTracer = _pageCacheTracer;
    this.databasePageCache = new DatabasePageCache(_pageCache, IOController.DISABLED);

    Config _fsswConfig = _cogwosecsefaConfig(_config);
    this.sdmMetadataProvider =
        _storageEngineFactory.transactionMetaDataStore(_fFileSystemAbstraction, _databaseLayout,
            _fsswConfig, this.databasePageCache,
            _pageCacheTracer);

    Config _csoConfig = _cumcgConfig(_isCsf, _isDsiltk, _config);
    this.logFiles =
        _gelfeLogFiles(_csoConfig, _databaseHealth, _databaseLayout, _fFileSystemAbstraction,
            _itivLongRange, this.sdmMetadataProvider, _memoryTracker,
            _storageEngineFactory, _fsswConfig);
    this.lifespan.add(this.logFiles);
    this.transactionLogWriter = this.logFiles.getLogFile().getTransactionLogWriter();
    this.itivLongRange = _itivLongRange;
  }


  private static Config _cogwosecsefaConfig(Config _config) {
    return Config.newBuilder().fromConfig(_config).set(GraphDatabaseSettings.record_format, null)
        .build();
  }


  private static Config _cumcgConfig(boolean _isCsf, boolean _isDsiltk, Config _oiiaConfig) {

    Builder _builder = Config.newBuilder();
    if (!_isDsiltk && _oiiaConfig.isExplicitlySet(
        GraphDatabaseSettings.transaction_logs_root_path)) {
      _builder.set(GraphDatabaseSettings.transaction_logs_root_path,
          _oiiaConfig.get(GraphDatabaseSettings.transaction_logs_root_path));
    }

    if (_oiiaConfig.isExplicitlySet(GraphDatabaseSettings.logical_log_rotation_threshold)) {
      _builder.set(GraphDatabaseSettings.logical_log_rotation_threshold,
          _oiiaConfig.get(GraphDatabaseSettings.logical_log_rotation_threshold));
    }

    if (_isCsf) {
      _builder.set(GraphDatabaseSettings.preallocate_logical_logs, false);
    }

    return _builder.build();
  }


  private static LogFiles _gelfeLogFiles(Config _csoConfig, DatabaseHealth _databaseHealth,
      DatabaseLayout _databaseLayout, FileSystemAbstraction _fFileSystemAbstraction,
      LongRange _itivLongRange, MetadataProvider _mdsMetadataProvider, MemoryTracker _memoryTracker,
      StorageEngineFactory _storageEngineFactory, Config _wssfConfig) throws IOException {

    Dependencies _dependencies = new Dependencies();
    _dependencies.satisfyDependencies(_databaseLayout, _fFileSystemAbstraction, _wssfConfig,
        _databaseHealth);

    LogPosition _psLogPosition = _gelscstatpooLogPosition(_databaseLayout, _fFileSystemAbstraction,
        _memoryTracker, _mdsMetadataProvider);

    LogFilesBuilder _logFilesBuilder =
        LogFilesBuilder.builder(_databaseLayout, _fFileSystemAbstraction)
            .withDependencies(_dependencies)
            .withLastCommittedTransactionIdSupplier(() ->
            {
              return _itivLongRange
                  .from() -
                  1L;
            })
            .withConfig(_csoConfig).withLogVersionRepository(_mdsMetadataProvider)
            .withTransactionIdStore(_mdsMetadataProvider)
            .withStoreId(_mdsMetadataProvider.getStoreId())
            .withCommandReaderFactory(_storageEngineFactory.commandReaderFactory())
            .withLastClosedTransactionPositionSupplier(() ->
            {
              return _psLogPosition;
            });
    return _logFilesBuilder.build();
  }


  private static LogPosition _gelscstatpooLogPosition(DatabaseLayout _databaseLayout,
      FileSystemAbstraction _fFileSystemAbstraction, MemoryTracker _memoryTracker,
      MetadataProvider _sdmMetadataProvider) throws IOException {

    TransactionLogFilesHelper _transactionLogFilesHelper =
        new TransactionLogFilesHelper(_fFileSystemAbstraction,
            _databaseLayout.getTransactionLogsDirectory());

    Path _plPath = _transactionLogFilesHelper.getLogFileForVersion(
        _sdmMetadataProvider.getCurrentLogVersion());
    return _fFileSystemAbstraction.fileExists(_plPath) ? LogHeaderReader.readLogHeader(
            _fFileSystemAbstraction, _plPath, _memoryTracker)
        .getStartPosition() : new LogPosition(0L, 64L);
  }


  private boolean _isFitt() {
    return this.lgIte == -1L;
  }


  private void _vaarcdti(long _lgItr) {
    if (this._isFitt()) {
      if (!this.itivLongRange.isWithinRange(_lgItr)) {

        throw new RuntimeException("*** Error: 42aadc50-cf79-43aa-a5f2-2b5b3230e386");
      }

      this.lgIte = _lgItr;
    }

    if (_lgItr != this.lgIte) {

      throw new RuntimeException("*** Error: 9d3722b8-78c1-4470-af35-18f970e52794");
    }
  }

  @Override
  public synchronized void close() throws IOException {

    CursorContext _cursorContext =
        new CursorContext(this.pageCacheTracer.createPageCursorTracer(
            io.github.onograph.TokenConstants.TRANSACTION_LOG_CATCHUP));
    if (this.isCsf) {

      LogFile _logFile = this.logFiles.getLogFile();

      long _lgVl = _logFile.getLowestLogVersion();

      LogPosition _cppLogPosition = _logFile.extractHeader(_lgVl).getStartPosition();

      CheckpointFile _checkpointFile = this.logFiles.getCheckpointFile();

      CheckpointAppender _checkpointAppender = _checkpointFile.getCheckpointAppender();
      _checkpointAppender.checkPoint(LogCheckPointEvent.NULL, _cppLogPosition, Instant.now(),
          io.github.onograph.I18N.format(
              "io.github.onograph.cluster.raft.module.cuprot.TransactionLogSyncManager.checkPoint"));

      TransactionId _lctTransactionId = this.sdmMetadataProvider.getLastCommittedTransaction();
      this.sdmMetadataProvider
          .setLastCommittedAndClosedTransactionId(_lctTransactionId.transactionId(),
              _lctTransactionId.checksum(),
              _lctTransactionId.commitTimestamp(),
              _cppLogPosition.getByteOffset(), _lgVl, _cursorContext);
    }

    this.lifespan.close();
    if (this.lgItl != -1L) {
      this.sdmMetadataProvider.setLastCommittedAndClosedTransactionId(this.lgItl, 0,
          System.currentTimeMillis(), this.logPositionMarker.getByteOffset(),
          this.logPositionMarker.getLogVersion(), _cursorContext);
    }

    this.sdmMetadataProvider.close();
    _cursorContext.close();
    this.databasePageCache.close();
  }


  public long getLgItl() {
    return this.lgItl;
  }

  @Override
  public synchronized void ontxrcvForCa(
      CatchupIncomingTransactionReply _rptCatchupIncomingTransactionReply) {

    CommittedTransactionRepresentation _tCommittedTransactionRepresentation = _rptCatchupIncomingTransactionReply.getTCommittedTransactionRepresentation();

    long _lgItr = _tCommittedTransactionRepresentation.getCommitEntry().getTxId();
    if (this.logFiles.getLogFile().rotationNeeded()) {
      try {
        this.logFiles.getLogFile().rotate();
      } catch (

          IOException _iOException) {
        throw new UncheckedIOException(_iOException);
      }
    }

    this._vaarcdti(_lgItr);
    this.lgItl = _lgItr;
    ++this.lgIte;

    try {
      this.transactionLogWriter.getCurrentPosition(this.logPositionMarker);
      this.transactionLogWriter.append(
          _tCommittedTransactionRepresentation.getTransactionRepresentation(), this.lgItl,
          _tCommittedTransactionRepresentation.getStartEntry().getPreviousChecksum());
    } catch (

        IOException _iOException2) {

      throw new UncheckedIOException(_iOException2);
    }
  }
}
