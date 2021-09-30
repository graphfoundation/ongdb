package io.github.onograph.kernel.srv.pagecache;

import org.neo4j.configuration.Config;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.kernel.availability.DatabaseAvailabilityGuard;
import org.neo4j.kernel.database.Database;
import org.neo4j.kernel.extension.ExtensionFactory;
import org.neo4j.kernel.extension.ExtensionType;
import org.neo4j.kernel.extension.context.ExtensionContext;
import org.neo4j.kernel.lifecycle.Lifecycle;
import org.neo4j.kernel.monitoring.tracing.Tracers;
import org.neo4j.logging.Log;
import org.neo4j.logging.internal.LogService;
import org.neo4j.monitoring.Monitors;
import org.neo4j.scheduler.JobScheduler;


public class CachePopulatorExtensionFactory extends
    ExtensionFactory<CachePopulatorExtensionFactory.ComponentsChecker> {

  public CachePopulatorExtensionFactory() {
    super(ExtensionType.DATABASE, io.github.onograph.TokenConstants.PAGECACHEWARMER);
  }

  @Override
  public Lifecycle newInstance(ExtensionContext _extensionContext,
      ComponentsChecker _dComponentsChecker) {

    JobScheduler _jobScheduler = _dComponentsChecker.joselJobScheduler();

    DatabaseAvailabilityGuard _databaseAvailabilityGuard = _dComponentsChecker.avatgrDatabaseAvailabilityGuard();

    PageCache _pageCache = _dComponentsChecker.paeccPageCache();

    FileSystemAbstraction _fFileSystemAbstraction = _dComponentsChecker.fyaanFileSystemAbstraction();

    LogService _logService = _dComponentsChecker.losveLogService();

    Database _database = _dComponentsChecker.gedasDatabase();

    Log _log = _logService.getInternalLog(CachePopulator.class);

    Monitors _monitors = _dComponentsChecker.moirMonitors();

    PageCacheLoadingWatcher _mntrPageCacheLoadingWatcher = _monitors.newMonitor(
        PageCacheLoadingWatcher.class, new String[0]);
    _monitors.addMonitorListener(new PageCacheLoadingWatcherDefaultImpl(_log));

    Config _config = _dComponentsChecker.cofConfig();

    Tracers _tracers = _dComponentsChecker.trcsTracers();
    return new PageCachePopulatorLifecycleAdapter(_config, _database, _databaseAvailabilityGuard,
        _fFileSystemAbstraction, _jobScheduler, _log,
        _mntrPageCacheLoadingWatcher, _pageCache, _tracers);
  }


  public interface ComponentsChecker {


    DatabaseAvailabilityGuard avatgrDatabaseAvailabilityGuard();


    Config cofConfig();


    FileSystemAbstraction fyaanFileSystemAbstraction();


    Database gedasDatabase();


    JobScheduler joselJobScheduler();


    LogService losveLogService();


    Monitors moirMonitors();


    PageCache paeccPageCache();


    Tracers trcsTracers();
  }
}
