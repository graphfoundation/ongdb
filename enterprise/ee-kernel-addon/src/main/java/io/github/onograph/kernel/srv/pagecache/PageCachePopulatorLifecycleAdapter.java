package io.github.onograph.kernel.srv.pagecache;

import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.kernel.availability.DatabaseAvailabilityGuard;
import org.neo4j.kernel.database.Database;
import org.neo4j.kernel.impl.transaction.state.DatabaseFileListing;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.kernel.monitoring.tracing.Tracers;
import org.neo4j.logging.Log;
import org.neo4j.scheduler.JobScheduler;


class PageCachePopulatorLifecycleAdapter extends LifecycleAdapter {


  private final AvailabilityListenerPageCacheLoadingImpl availabilityListenerPageCacheLoadingImpl;


  private final Config config;


  private final Database database;


  private final DatabaseAvailabilityGuard databaseAvailabilityGuard;


  private final CachePopulator wcpCachePopulator;


  private volatile boolean isSatd;


  PageCachePopulatorLifecycleAdapter(Config _config, Database _database,
      DatabaseAvailabilityGuard _databaseAvailabilityGuard,
      FileSystemAbstraction _fFileSystemAbstraction, JobScheduler _jobScheduler, Log _log,
      PageCacheLoadingWatcher _mntrPageCacheLoadingWatcher, PageCache _pageCache,
      Tracers _tracers) {
    this.databaseAvailabilityGuard = _databaseAvailabilityGuard;
    this.database = _database;
    this.config = _config;
    this.wcpCachePopulator =
        new CachePopulator(_config, _fFileSystemAbstraction, _database.getNamedDatabaseId().name(),
            _jobScheduler,
            _log, _pageCache, _database.getDatabaseLayout().databaseDirectory(), _tracers);
    this.availabilityListenerPageCacheLoadingImpl =
        new AvailabilityListenerPageCacheLoadingImpl(_config, _jobScheduler, _log,
            _mntrPageCacheLoadingWatcher, _database.getNamedDatabaseId(),
            this.wcpCachePopulator);
  }


  private DatabaseFileListing _genoseflnDatabaseFileListing() {
    return this.database.getDependencyResolver().resolveDependency(DatabaseFileListing.class);
  }

  @Override
  public void start() {
    if (this.config.get(GraphDatabaseSettings.pagecache_warmup_enabled)) {
      this.wcpCachePopulator.str();
      this.databaseAvailabilityGuard.addListener(this.availabilityListenerPageCacheLoadingImpl);
      this._genoseflnDatabaseFileListing().registerStoreFileProvider(this.wcpCachePopulator);
      this.isSatd = true;
    }
  }

  @Override
  public void stop() throws Exception {
    if (this.isSatd) {
      this.databaseAvailabilityGuard.removeListener(this.availabilityListenerPageCacheLoadingImpl);
      this.availabilityListenerPageCacheLoadingImpl.unavailable();
      this.wcpCachePopulator.kill();
      this.isSatd = false;
    }
  }
}
