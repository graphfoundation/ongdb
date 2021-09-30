package io.github.onograph.kernel.trace;

import org.neo4j.configuration.Config;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.monitoring.tracing.DefaultTracerFactory;
import org.neo4j.logging.Log;
import org.neo4j.monitoring.Monitors;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.time.SystemNanoClock;


public class EnterpriseTracerFactory extends DefaultTracerFactory {

  @Override
  public PageCacheTracer createPageCacheTracer(Monitors _monitors, JobScheduler _jobScheduler,
      SystemNanoClock _systemNanoClock, Log _mLog, Config _config) {
    return new EnterprisePageCacheTracer(_config, _mLog, _systemNanoClock);
  }

  @Override
  public String getName() {
    return io.github.onograph.TokenConstants.VERBOSE;
  }
}
