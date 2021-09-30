package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import io.github.onograph.cluster.raft.utils.RemoteStoreVerifier;
import java.io.IOException;
import java.util.Optional;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.database.DatabaseTracers;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.kernel.recovery.Recovery;
import org.neo4j.logging.internal.NullLogService;
import org.neo4j.memory.MemoryTracker;
import org.neo4j.storageengine.api.StorageEngineFactory;
import org.neo4j.storageengine.api.StoreVersionCheck;
import org.neo4j.storageengine.migration.UpgradeNotAllowedException;


public class SyncRecoveryLifecycleAdapter extends LifecycleAdapter {


  private static final String DST_REOR_VX_CHCR_LT = io.github.onograph.TokenConstants.STORE_RECOVERY_VERSION_CHECKER;


  private final DatabaseTracers databaseTracers;


  private final FileSystemAbstraction fFileSystemAbstraction;


  private final MemoryTracker memoryTracker;


  private final PageCache pageCache;


  private boolean isSudw;


  public SyncRecoveryLifecycleAdapter(DatabaseTracers _databaseTracers,
      FileSystemAbstraction _fFileSystemAbstraction, MemoryTracker _memoryTracker,
      PageCache _pageCache) {
    this.databaseTracers = _databaseTracers;
    this.fFileSystemAbstraction = _fFileSystemAbstraction;
    this.memoryTracker = _memoryTracker;
    this.pageCache = _pageCache;
  }


  private String _fadtsamsString(Config _config) {

    String _strRf = _config.get(GraphDatabaseSettings.record_format);
    return String.format(
        io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.module.cuprot.scmeta.SyncRecoveryLifecycleAdapter.format"),
        GraphDatabaseSettings.record_format.name(), _strRf);
  }


  private Optional<String> _gesovrOptional(PageCacheTracer _pageCacheTracer,
      StoreVersionCheck _storeVersionCheck) {

    CursorContext _cursorContext =
        new CursorContext(_pageCacheTracer.createPageCursorTracer(
            io.github.onograph.TokenConstants.STORE_RECOVERY_VERSION_CHECKER));

    Optional _optional;
    try {
      _optional = _storeVersionCheck.storeVersion(_cursorContext);
    } catch (

        Throwable _throwable) {
      try {
        _cursorContext.close();
      } catch (

          Throwable _throwable2) {
        _throwable.addSuppressed(_throwable2);
      }

      throw _throwable;
    }

    _cursorContext.close();
    return _optional;
  }


  public synchronized boolean isCarcreseForCoDaSt(Config _config, DatabaseLayout _databaseLayout,
      long _lgVsr, StorageEngineFactory _storageEngineFactory) {

    StoreVersionCheck _storeVersionCheck = _storageEngineFactory
        .versionCheck(this.fFileSystemAbstraction, _databaseLayout, _config, this.pageCache,
            NullLogService.getInstance(),
            this.databaseTracers.getPageCacheTracer());
    return this.isCarcreseForCoDaSt(_config, _storageEngineFactory, _storeVersionCheck,
        _storeVersionCheck.storeVersionToString(_lgVsr));
  }


  private boolean isCarcreseForCoDaSt(Config _config, StorageEngineFactory _storageEngineFactory,
      StoreVersionCheck _storeVersionCheck, String _strRsv) {
    return RemoteStoreVerifier.isVaretuesefForStStCoSt(_config, _storageEngineFactory,
        _storeVersionCheck, _strRsv);
  }


  public synchronized void reecoForCoDaSt(Config _config, DatabaseLayout _databaseLayout,
      StorageEngineFactory _storageEngineFactory)
      throws GdbFailedToStopException, IOException {
    if (this.isSudw) {

      throw new GdbFailedToStopException("*** Error:  acc5a41b-1437-47e9-8dfa-a5ed45dd4cf7");
    } else {

      PageCacheTracer _pageCacheTracer = this.databaseTracers.getPageCacheTracer();

      StoreVersionCheck _storeVersionCheck =
          _storageEngineFactory.versionCheck(this.fFileSystemAbstraction, _databaseLayout, _config,
              this.pageCache, NullLogService.getInstance(),
              _pageCacheTracer);

      Optional<String> _optionalVsString = this._gesovrOptional(_pageCacheTracer,
          _storeVersionCheck);
      if (_optionalVsString.isPresent() && !this.isCarcreseForCoDaSt(_config, _storageEngineFactory,
          _storeVersionCheck, _optionalVsString.get())) {
        throw new RuntimeException(this._fadtsamsString(_config));
      } else {
        try {
          Recovery.performRecovery(this.fFileSystemAbstraction, this.pageCache,
              this.databaseTracers, _config, _databaseLayout,
              _storageEngineFactory, true,
              this.memoryTracker);
        } catch (

            Exception _exception) {
          if (ExceptionUtils.indexOfThrowable(_exception, UpgradeNotAllowedException.class) != -1) {
            throw new RuntimeException(this._fadtsamsString(_config), _exception);
          } else {
            throw _exception;
          }
        }
      }
    }
  }

  @Override
  public synchronized void shutdown() {
    this.isSudw = true;
  }
}
