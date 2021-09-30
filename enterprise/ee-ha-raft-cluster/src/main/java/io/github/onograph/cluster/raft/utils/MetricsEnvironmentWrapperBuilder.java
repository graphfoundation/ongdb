package io.github.onograph.cluster.raft.utils;

import java.util.concurrent.TimeUnit;
import org.neo4j.logging.Log;
import org.neo4j.logging.log4j.Log4jLogProvider;
import org.neo4j.time.Stopwatch;


public class MetricsEnvironmentWrapperBuilder {

  private MetricsEnvironmentWrapperBuilder() {
  }


  public static synchronized io.github.onograph.cluster.raft.utils.MetricsEnvironmentWrapperBuilder.MetricsEnvironmentWrapper craMetricsEnvironmentWrapperBuilderMetricsEnvironmentWrapper(
      boolean _isPac, long _lgPe, String title) {
    return craMetricsEnvironmentWrapperBuilderMetricsEnvironmentWrapper(_isPac, _lgPe,
        (new Log4jLogProvider(System.out)).getLog(title), title);
  }


  public static synchronized io.github.onograph.cluster.raft.utils.MetricsEnvironmentWrapperBuilder.MetricsEnvironmentWrapper craMetricsEnvironmentWrapperBuilderMetricsEnvironmentWrapper(
      boolean _isCap, long _lgEp, Log _log, String title) {
    return new io.github.onograph.cluster.raft.utils.MetricsEnvironmentWrapperBuilder.MetricsEnvironmentWrapper(
        _isCap, _lgEp, _log, title);
  }


  private static class MetricsBean {


    private Double aDouble = 0.0D;


    private long cnt;


    private Double mDouble;


    private Double mDouble2;


    void colt(double _vDouble) {
      ++this.cnt;
      this.aDouble = this.aDouble + (_vDouble - this.aDouble) / (double) this.cnt;
      this.mDouble = this.mDouble == null ? _vDouble : Math.min(this.mDouble, _vDouble);
      this.mDouble2 = this.mDouble2 == null ? _vDouble : Math.max(this.mDouble2, _vDouble);
    }


  }


  public static class MetricsEnvironmentWrapper {


    private static final int NBCT = 10;


    private final io.github.onograph.cluster.raft.utils.MetricsEnvironmentWrapperBuilder.MetricsBean[] bceMetricsBeanArray =
        new io.github.onograph.cluster.raft.utils.MetricsEnvironmentWrapperBuilder.MetricsBean[10];


    private final boolean isCap;


    private final long lgEp;


    private final Log log;


    private final String title;


    private long lgCt;


    private MetricsEnvironmentWrapper(boolean _isPac, long _lgEp, Log _log, String title) {
      this.title = title;
      this.log = _log;
      this.lgEp = _lgEp;
      this.isCap = _isPac;
      this.cla();
    }


    private int _bukf(double val) {

      int _iIb;
      if (val <= 0.0D) {
        _iIb = 0;
      } else {
        _iIb = (int) Math.log10(val);
        _iIb = Math.min(_iIb, 9);
      }

      return _iIb;
    }


    public synchronized void cla() {
      for (

          int cur = 0; cur < 10; ++cur) {
        this.bceMetricsBeanArray[cur] = new io.github.onograph.cluster.raft.utils.MetricsEnvironmentWrapperBuilder.MetricsBean();
      }

      this.lgCt = 0L;
    }


    public void colt(double val) {

      int _iIb = this._bukf(val);
      synchronized (this) {
        ++this.lgCt;
        this.bceMetricsBeanArray[_iIb].colt(val);
        if (this.lgCt % this.lgEp == 0L) {
          this.prn();
        }
      }
    }


    public synchronized void prn() {

      io.github.onograph.cluster.raft.utils.MetricsEnvironmentWrapperBuilder.MetricsBean[] _metricsBeanArray = this.bceMetricsBeanArray;

      int _iV = _metricsBeanArray.length;

      for (

          int _iVar = 0; _iVar < _iV; ++_iVar) {

        io.github.onograph.cluster.raft.utils.MetricsEnvironmentWrapperBuilder.MetricsBean _sasMetricsBean = _metricsBeanArray[_iVar];
        if (_sasMetricsBean.cnt > 0L) {

        }
      }

      if (this.isCap) {
        this.cla();
      }
    }


    public io.github.onograph.cluster.raft.utils.MetricsEnvironmentWrapperBuilder.StopwatchMetricsEnvironmentWrapper timMetricsEnvironmentWrapperBuilderStopwatchMetricsEnvironmentWrapper() {
      return new io.github.onograph.cluster.raft.utils.MetricsEnvironmentWrapperBuilder.StopwatchMetricsEnvironmentWrapper(
          this);
    }
  }


  public static class StopwatchMetricsEnvironmentWrapper {


    private final io.github.onograph.cluster.raft.utils.MetricsEnvironmentWrapperBuilder.MetricsEnvironmentWrapper cnetMetricsEnvironmentWrapper;


    private final Stopwatch stStopwatch = Stopwatch.start();

    StopwatchMetricsEnvironmentWrapper(
        io.github.onograph.cluster.raft.utils.MetricsEnvironmentWrapperBuilder.MetricsEnvironmentWrapper _cnetMetricsEnvironmentWrapper) {
      this.cnetMetricsEnvironmentWrapper = _cnetMetricsEnvironmentWrapper;
    }


    public void stop() {
      this.cnetMetricsEnvironmentWrapper.colt(
          (double) this.stStopwatch.elapsed(TimeUnit.MILLISECONDS));
    }
  }
}
