package io.github.onograph.kernel.srv.pagecache;

import java.util.concurrent.TimeUnit;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.Log;
import org.neo4j.time.Stopwatch;


public class PageCacheLoadingWatcherDefaultImpl extends BasePageCacheLoadingWatcher {


  private final Log log;


  private Stopwatch swStopwatch;

  public PageCacheLoadingWatcherDefaultImpl(Log _log) {
    this.log = _log;
  }

  @Override
  public void wamsrdForNa(NamedDatabaseId _namedDatabaseId) {
    this.swStopwatch = Stopwatch.start();


  }

  @Override
  public void wapclForNa(long _lgLp, NamedDatabaseId _namedDatabaseId) {

    long _lgMli = this.swStopwatch.elapsed(TimeUnit.MILLISECONDS);

    double _mppDouble = (double) _lgLp / (double) _lgMli;


  }
}
