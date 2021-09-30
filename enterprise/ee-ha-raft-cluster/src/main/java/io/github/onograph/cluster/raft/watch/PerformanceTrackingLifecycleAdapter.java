package io.github.onograph.cluster.raft.watch;

import io.github.onograph.cluster.raft.share.meta.fsm.ActionIdxMonitor;
import java.time.Clock;
import java.time.Duration;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobHandle;
import org.neo4j.scheduler.JobScheduler;


public class PerformanceTrackingLifecycleAdapter extends LifecycleAdapter {


  public static final int SAPS = 10;


  public static final int TOAIR = 2;


  private static final int LALCTE = 2;


  private final Clock clock;


  private final Collection<PerformanceWatcher> collectionMntrPerformanceWatcher = new CopyOnWriteArrayList();


  private final Duration isDuration;


  private final JobScheduler jobScheduler;


  private final Log log;


  private final LogProvider logProvider;


  private final Duration wtDuration;


  private volatile boolean isRi;


  private JobHandle<?> jobHandleHjObject;


  public PerformanceTrackingLifecycleAdapter(Clock _clock, JobScheduler _jobScheduler,
      LogProvider _logProvider, Duration _wtDuration) {
    this.wtDuration = _wtDuration;
    this.isDuration = _wtDuration.dividedBy(10L);
    this.clock = _clock;
    this.jobScheduler = _jobScheduler;
    this.logProvider = _logProvider;
    this.log = _logProvider.getLog(this.getClass());
  }


  private void _sap() {
    if (this.isRi) {

      int _iFie = 0;

      Iterator _iterator = this.collectionMntrPerformanceWatcher.iterator();

      while (_iterator.hasNext()) {

        PerformanceWatcher _mntrPerformanceWatcher = (PerformanceWatcher) _iterator.next();
        if (!_mntrPerformanceWatcher.isSapnta()) {
          ++_iFie;
        }
      }

      if (_iFie != 0) {

      }
    }
  }


  public PerformanceWatcher cramirPerformanceWatcher(ActionIdxMonitor _ticActionIdxMonitor) {

    Duration _tlDuration = this.isDuration.multipliedBy(2L);

    Duration _oaDuration = this.wtDuration.dividedBy(2L);

    LogProvider _logProvider = this.logProvider;

    Clock _clock = this.clock;

    Duration _duration = this.wtDuration;

    Clock _clock2 = this.clock;

    Duration _duration2 = this.isDuration.dividedBy(2L);
    Objects.requireNonNull(_ticActionIdxMonitor);
    return new PerformanceWatcher(_clock, 10,
        new InfoChecker(_clock2, _ticActionIdxMonitor::getLgAci, _duration2), _logProvider,
        _oaDuration, _duration,
        _tlDuration, this);
  }


  void retmnForPe(PerformanceWatcher _tmPerformanceWatcher) {
    this.collectionMntrPerformanceWatcher.add(_tmPerformanceWatcher);
  }

  @Override
  public void start() throws Exception {
    this.isRi = true;
    this.jobHandleHjObject = this.jobScheduler.scheduleRecurring(Group.THROUGHPUT_MONITOR,
        this::_sap, this.isDuration.toMillis(), TimeUnit.MILLISECONDS);
  }

  @Override
  public void stop() {
    this.isRi = false;
    this.jobHandleHjObject.cancel();
  }


  void unimoForPe(PerformanceWatcher _mtPerformanceWatcher) {
    this.collectionMntrPerformanceWatcher.remove(_mtPerformanceWatcher);
  }
}
