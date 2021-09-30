package io.github.onograph.kernel.srv.pagecache;

import java.util.concurrent.TimeUnit;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.kernel.availability.AvailabilityListener;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.Log;
import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobHandle;
import org.neo4j.scheduler.JobMonitoringParams;
import org.neo4j.scheduler.JobScheduler;


class AvailabilityListenerPageCacheLoadingImpl implements AvailabilityListener {


  private final Config config;


  private final JobScheduler jobScheduler;


  private final Log log;


  private final PageCacheLoadingWatcher mntrPageCacheLoadingWatcher;


  private final NamedDatabaseId namedDatabaseId;


  private final CachePopulator pcwCachePopulator;


  private volatile boolean isAalbe;


  private JobHandle jobHandle;


  AvailabilityListenerPageCacheLoadingImpl(Config _config, JobScheduler _jobScheduler, Log _log,
      PageCacheLoadingWatcher _mntrPageCacheLoadingWatcher, NamedDatabaseId _namedDatabaseId,
      CachePopulator _wcpCachePopulator) {
    this.config = _config;
    this.jobScheduler = _jobScheduler;
    this.log = _log;
    this.mntrPageCacheLoadingWatcher = _mntrPageCacheLoadingWatcher;
    this.namedDatabaseId = _namedDatabaseId;
    this.pcwCachePopulator = _wcpCachePopulator;
  }


  private void _dopri() {
    try {
      this.pcwCachePopulator._prfeForPaPa().ifPresent((pages) ->
      {
        this.mntrPageCacheLoadingWatcher.prlcpdForNa(pages, this.namedDatabaseId);
      });
    } catch (

        Exception _exception) {

    }
  }


  private synchronized void _scupo() {
    if (this.isAalbe) {

      JobMonitoringParams _jobMonitoringParams = JobMonitoringParams.systemJob(
          this.namedDatabaseId.name(), io.github.onograph.I18N.format(
              "io.github.onograph.kernel.srv.pagecache.AvailabilityListenerPageCacheLoadingImpl.systemJob2"));

      long _lgMf = this.config.get(GraphDatabaseSettings.pagecache_warmup_profiling_interval)
          .toMillis();
      this.jobHandle =
          this.jobScheduler.scheduleRecurring(Group.FILE_IO_HELPER, _jobMonitoringParams,
              this::_dopri, _lgMf, TimeUnit.MILLISECONDS);
    }
  }


  private void _strwau() {
    if (this.isAalbe) {
      try {
        this.mntrPageCacheLoadingWatcher.wamsrdForNa(this.namedDatabaseId);
        this.pcwCachePopulator.reeOptionalLong().ifPresent((loadedPages) ->
        {
          this.mntrPageCacheLoadingWatcher.wapclForNa(loadedPages, this.namedDatabaseId);
        });
      } catch (

          Exception _exception) {

      }

      this._scupo();
    }
  }

  @Override
  public synchronized void available() {
    this.isAalbe = true;
    this.jobHandle = this.jobScheduler
        .schedule(Group.FILE_IO_HELPER, JobMonitoringParams.systemJob(this.namedDatabaseId.name(),
                io.github.onograph.I18N.format(
                    "io.github.onograph.kernel.srv.pagecache.AvailabilityListenerPageCacheLoadingImpl.systemJob")),
            this::_strwau);
  }

  @Override
  public synchronized void unavailable() {
    this.isAalbe = false;
    if (this.jobHandle != null) {
      this.jobHandle.cancel();
      this.jobHandle = null;
    }
  }
}
