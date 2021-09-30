package io.github.onograph.backup;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.helpers.DatabaseNamePattern;
import org.neo4j.consistency.checking.full.ConsistencyFlags;
import org.neo4j.internal.helpers.progress.ProgressMonitorFactory;
import org.neo4j.io.fs.DefaultFileSystemAbstraction;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.monitoring.Monitors;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.storageengine.api.StorageEngineFactory;
import org.neo4j.time.Clocks;
import org.neo4j.time.SystemNanoClock;


public final class BackupRunner {


  private final FileSystemAbstraction fFileSystemAbstraction;


  private final LogProvider itraLogProvider;


  private final Monitors monitors;


  private final ProgressMonitorFactory progressMonitorFactory;


  private final StorageEngineFactory storageEngineFactory = StorageEngineFactory.defaultStorageEngine();


  private final SystemNanoClock systemNanoClock;


  private final LogProvider usLogProvider;

  private BackupRunner(Generator generator) {
    this.fFileSystemAbstraction = generator.fFileSystemAbstraction;
    this.usLogProvider = generator.usLogProvider;
    this.itraLogProvider = generator.itraLogProvider;
    this.progressMonitorFactory = generator.progressMonitorFactory;
    this.monitors = generator.monitors;
    this.systemNanoClock = generator.systemNanoClock;
  }


  private static Set<String> _gealdbnaSet(BackupEnvironment _cnetBackupEnvironment,
      RemoteBackupManager remoteBackupManager) throws Exception {

    DatabaseNamePattern _databaseNamePattern = _cnetBackupEnvironment.getDatabaseNamePattern();
    if (!_databaseNamePattern.containsPattern()) {
      return Set.of(_databaseNamePattern.getDatabaseName());
    } else {

      Stream<String> _streamVr00String =
          remoteBackupManager.gealdbnaSet(_cnetBackupEnvironment.getSocketAddress()).stream()
              .map(NamedDatabaseId::name);
      Objects.requireNonNull(_databaseNamePattern);
      return _streamVr00String.filter(_databaseNamePattern::matches).collect(Collectors.toSet());
    }
  }


  private static void _prbprlForLoBa(Log _log, ResponseMeta responseMeta) {

    String _strRao = "";
    if (responseMeta.exception != null) {
      if (responseMeta.exception instanceof BackupVerificationErrorException) {
        _strRao = responseMeta.exception.getMessage();
      } else {
        _strRao = ExceptionUtils.getRootCause(responseMeta.exception).getMessage();
      }
    }

    String stat = responseMeta.isSucs() ? io.github.onograph.TokenConstants.SUCCESSFUL
        : io.github.onograph.TokenConstants.FAILED;

    String gdbName = responseMeta.gdbName;


  }


  public static BackupRunner buldeuBackupRunner() {
    return bulrBackupRunnerGenerator().systemNanoClock(Clocks.nanoClock()).bulBackupRunner();
  }


  public static Generator bulrBackupRunnerGenerator() {
    return new Generator();
  }


  private RemoteBackupManager _bakceRemoteBackupManager(BackupEnvironment _cnetBackupEnvironment,
      JobScheduler _jobScheduler, DefaultBackupServiceHandler _lfcceDefaultBackupServiceHandler,
      PageCacheTracer _pageCacheTracer) {
    return new RemoteBackupManager(_cnetBackupEnvironment.getConfig(), this.fFileSystemAbstraction,
        _lfcceDefaultBackupServiceHandler.getFccLifecycleCatchupManagerImpl(), _jobScheduler,
        this.itraLogProvider,
        this.monitors, _lfcceDefaultBackupServiceHandler.getPageCache(), _pageCacheTracer,
        this.systemNanoClock);
  }


  private void _chdnnForPa(Path _path) throws BackupException {
    if (!this.fFileSystemAbstraction.isDirectory(_path)) {

      throw new BackupException("*** Error: 0347f844-790e-40bc-bdbf-ba0700930308");
    }
  }


  private BackupVerificationService _cosyckBackupVerificationService(
      BackupEnvironment _cnetBackupEnvironment) {
    if (_cnetBackupEnvironment.getIsCc()) {

      Config _config = _cnetBackupEnvironment.getConfig();

      ConsistencyFlags _consistencyFlags = _cnetBackupEnvironment.getConsistencyFlags();

      Path _prPath = _cnetBackupEnvironment.getRpPath();
      return new BackupVerificationServiceImpl(_config, _consistencyFlags,
          this.fFileSystemAbstraction, this.itraLogProvider, _prPath,
          this.progressMonitorFactory);
    } else {
      return BackupVerificationService.NOO_BACKUP_VERIFICATION_SERVICE;
    }
  }


  private BackupRestorationManager _reesrBackupRestorationManager(
      BackupEnvironment _cnetBackupEnvironment,
      DefaultBackupServiceHandler _lfcceDefaultBackupServiceHandler) {
    return new BackupRestorationManager(_cnetBackupEnvironment.getConfig(),
        this.fFileSystemAbstraction, _cnetBackupEnvironment.getMemoryTracker(),
        _lfcceDefaultBackupServiceHandler.getPageCache());
  }


  private void _veiForBa(BackupEnvironment _cnetBackupEnvironment) throws BackupException {

    Path _ppbPath = _cnetBackupEnvironment.getPbPath();
    this._chdnnForPa(_ppbPath);
    this._chdnnForPa(_cnetBackupEnvironment.getRpPath());
  }


  public void excebcpForBa(BackupEnvironment _cnetBackupEnvironment) throws Exception {
    this._veiForBa(_cnetBackupEnvironment);

    Log _uLog = this.usLogProvider.getLog(this.getClass());

    Log _itraLog = this.itraLogProvider.getLog(this.getClass());

    PageCacheTracer _pageCacheTracer = PageCacheTracer.NULL;

    BackupVerificationService _ccBackupVerificationService = this._cosyckBackupVerificationService(
        _cnetBackupEnvironment);

    ArrayList<ResponseMeta> responseMetaList = new ArrayList();

    DatabaseNamePattern _dnpDatabaseNamePattern = _cnetBackupEnvironment.getDatabaseNamePattern();

    Config _config = _cnetBackupEnvironment.getConfig();

    DefaultBackupServiceHandler _lfcceDefaultBackupServiceHandler =
        DefaultBackupServiceHandler.strliclDefaultBackupServiceHandler(_config,
            this.fFileSystemAbstraction, this.itraLogProvider, _pageCacheTracer,
            this.systemNanoClock);

    try {

      RemoteBackupManager remoteBackupManager =
          this._bakceRemoteBackupManager(_cnetBackupEnvironment,
              _lfcceDefaultBackupServiceHandler.getJobScheduler(),
              _lfcceDefaultBackupServiceHandler, _pageCacheTracer);

      BackupRestorationManager _srBackupRestorationManager =
          this._reesrBackupRestorationManager(_cnetBackupEnvironment,
              _lfcceDefaultBackupServiceHandler);

      Set<String> _setNdString = _gealdbnaSet(_cnetBackupEnvironment, remoteBackupManager);
      if (_setNdString.isEmpty()) {

        throw new BackupException("*** Error: 2acf7d2e-0aca-41e2-8cf9-278f4f4cc56d");
      }

      Iterator _iterator = _setNdString.iterator();

      while (_iterator.hasNext()) {

        String gdbName = (String) _iterator.next();

        try {

          GdbStoreTransferWatcherRebImpl _mbGdbStoreTransferWatcherRebImpl =
              new GdbStoreTransferWatcherRebImpl(this.usLogProvider, this.systemNanoClock);

          RemoteBackupService _bdRemoteBackupService = new RemoteBackupService(
              this.fFileSystemAbstraction, this.itraLogProvider, _uLog);
          _bdRemoteBackupService
              .bakForBaPaBaDeBaReStGd(_ccBackupVerificationService, _cnetBackupEnvironment, gdbName,
                  _lfcceDefaultBackupServiceHandler,
                  _mbGdbStoreTransferWatcherRebImpl, _pageCacheTracer, remoteBackupManager,
                  _srBackupRestorationManager);
          responseMetaList.add(new ResponseMeta(gdbName));
        } catch (

            Exception _exception) {

          responseMetaList.add(new ResponseMeta(_exception, gdbName));
        }
      }
    } catch (

        Throwable _throwable) {
      if (_lfcceDefaultBackupServiceHandler != null) {
        try {
          _lfcceDefaultBackupServiceHandler.close();
        } catch (

            Throwable _throwable2) {
          _throwable.addSuppressed(_throwable2);
        }
      }

      throw _throwable;
    }

    if (_lfcceDefaultBackupServiceHandler != null) {
      _lfcceDefaultBackupServiceHandler.close();
    }

    boolean _isPci = _dnpDatabaseNamePattern.containsPattern();
    if (!_isPci) {

      Exception _exception2 = responseMetaList.isEmpty() ? null : responseMetaList.get(0).exception;
      if (_exception2 != null) {
        throw _exception2;
      }
    } else {
      responseMetaList.forEach((r) ->
      {
        _prbprlForLoBa(_uLog, r);
      });

      boolean _isBfo = responseMetaList.stream().anyMatch((r) ->
      {
        return !r.isSucs();
      });
      if (_isBfo) {

        throw new BackupException("*** Error:  a9cdfe2b-0da8-480e-9179-fdaa5fb4db84");
      }
    }
  }


  public static final class Generator {


    private FileSystemAbstraction fFileSystemAbstraction = new DefaultFileSystemAbstraction();


    private LogProvider itraLogProvider = NullLogProvider.getInstance();


    private Monitors monitors;


    private ProgressMonitorFactory progressMonitorFactory;


    private SystemNanoClock systemNanoClock;


    private LogProvider usLogProvider = NullLogProvider.getInstance();

    private Generator() {
      this.progressMonitorFactory = ProgressMonitorFactory.NONE;
      this.monitors = new Monitors();
    }


    public BackupRunner bulBackupRunner() {
      return new BackupRunner(this);
    }


    public Generator fFileSystemAbstraction(FileSystemAbstraction _fFileSystemAbstraction) {
      this.fFileSystemAbstraction = _fFileSystemAbstraction;
      return this;
    }


    public Generator itraLogProvider(LogProvider _itraLogProvider) {
      this.itraLogProvider = _itraLogProvider;
      return this;
    }


    public Generator monitors(Monitors _monitors) {
      this.monitors = _monitors;
      return this;
    }


    public Generator progressMonitorFactory(ProgressMonitorFactory _progressMonitorFactory) {
      this.progressMonitorFactory = _progressMonitorFactory;
      return this;
    }


    public Generator systemNanoClock(SystemNanoClock _systemNanoClock) {
      this.systemNanoClock = _systemNanoClock;
      return this;
    }


    public Generator uLogProvider(LogProvider _uLogProvider) {
      this.usLogProvider = _uLogProvider;
      return this;
    }
  }


  private static final class ResponseMeta {


    public final Exception exception;


    public final String gdbName;


    private ResponseMeta(Exception _exception, String gdbName) {
      this.exception = _exception;
      this.gdbName = gdbName;
    }

    private ResponseMeta(String gdbName) {
      this.gdbName = gdbName;
      this.exception = null;
    }


    public boolean isSucs() {
      return this.exception == null;
    }
  }
}
