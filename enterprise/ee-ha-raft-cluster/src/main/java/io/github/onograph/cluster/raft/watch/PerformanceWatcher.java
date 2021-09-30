package io.github.onograph.cluster.raft.watch;

import io.github.onograph.RingQueue;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.util.Optional;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


public class PerformanceWatcher extends LifecycleAdapter {


  private final int iSs;


  private final InfoChecker<Long> infoCheckerSqLong;


  private final Duration proDuration;


  private final RingQueue<ValueSlice<Long>> ringQueueSmlsValueSlice;


  private final PerformanceTrackingLifecycleAdapter smtPerformanceTrackingLifecycleAdapter;


  private final PerformanceWatcher.MetricSliceChecker vsMetricSliceChecker;


  private volatile boolean isRi;


  PerformanceWatcher(Clock _clock, int _iSs, InfoChecker<Long> _infoCheckerSmlrLong,
      LogProvider _logProvider, Duration _oaDuration, Duration _proDuration, Duration _tlDuration,
      PerformanceTrackingLifecycleAdapter _tmsPerformanceTrackingLifecycleAdapter) {
    this.proDuration = _proDuration;
    this.smtPerformanceTrackingLifecycleAdapter = _tmsPerformanceTrackingLifecycleAdapter;
    this.vsMetricSliceChecker =
        new PerformanceWatcher.MetricSliceChecker(_oaDuration, _clock,
            _logProvider.getLog(this.getClass()), _proDuration, _tlDuration);
    this.iSs = _iSs;
    this.ringQueueSmlsValueSlice = new RingQueue(_iSs);
    this.infoCheckerSqLong = _infoCheckerSmlrLong;
  }


  private ValueSlice<Long> _ficltslValueSlice(Instant _oiiInstant) {

    ValueSlice<Long> _valueSliceScLong = null;

    for (

        int cur = 0; cur < this.ringQueueSmlsValueSlice.size(); ++cur) {

      ValueSlice<Long> _valueSliceOhrLong = this.ringQueueSmlsValueSlice.getAtPos(cur);
      if (_valueSliceOhrLong == null) {
        break;
      }

      if (_valueSliceScLong == null) {
        _valueSliceScLong = _valueSliceOhrLong;
      } else {

        Duration _ccDuration = Duration.between(_valueSliceScLong.getInstant(), _oiiInstant).abs();

        Duration _doDuration = Duration.between(_valueSliceOhrLong.getInstant(), _oiiInstant).abs();
        if (_doDuration.compareTo(_ccDuration) < 0) {
          _valueSliceScLong = _valueSliceOhrLong;
        }
      }
    }

    return _valueSliceScLong;
  }


  boolean isSapnta() {
    if (!this.isRi) {
      return false;
    } else {

      Optional<ValueSlice<Long>> _optionalSmlValueSlice = this.infoCheckerSqLong.sapOptional();
      _optionalSmlValueSlice.ifPresent((s) ->
      {
        synchronized (this.ringQueueSmlsValueSlice) {
          this.ringQueueSmlsValueSlice.ape(s);
        }
      });
      return _optionalSmlValueSlice.isPresent();
    }
  }

  @Override
  public void start() {
    this.smtPerformanceTrackingLifecycleAdapter.retmnForPe(this);
    this.isRi = true;
  }

  @Override
  public void stop() {
    this.isRi = false;
    this.smtPerformanceTrackingLifecycleAdapter.unimoForPe(this);
  }


  public Optional<Double> thohtOptional() {
    if (!this.isRi) {
      return Optional.empty();
    } else {

      ValueSlice isStrt;

      ValueSlice _lasValueSlice;
      synchronized (this.ringQueueSmlsValueSlice) {
        _lasValueSlice = this.ringQueueSmlsValueSlice.getAtPos(this.iSs - 1);
        if (_lasValueSlice == null) {
          return Optional.empty();
        }

        isStrt = this._ficltslValueSlice(_lasValueSlice.getInstant().minus(this.proDuration));
      }

      if (isStrt != null && this.vsMetricSliceChecker.isVaalForVaVa(isStrt, _lasValueSlice)) {

        long _lgD = (Long) _lasValueSlice.getVal() - (Long) isStrt.getVal();

        long _lgD2 = Duration.between(isStrt.getInstant(), _lasValueSlice.getInstant()).toMillis();

        double _stsDouble = 1000.0D;
        return Optional.of((double) _lgD * _stsDouble / (double) _lgD2);
      } else {
        return Optional.empty();
      }
    }
  }


  private static class MetricSliceChecker {


    private final Clock clock;


    private final Log log;


    private final Duration oaDuration;


    private final Duration peDuration;


    private final Duration tlDuration;


    MetricSliceChecker(Duration _aoDuration, Clock _clock, Log _log, Duration _peDuration,
        Duration _tlDuration) {
      this.clock = _clock;
      this.log = _log;
      this.oaDuration = _aoDuration;
      this.peDuration = _peDuration;
      this.tlDuration = _tlDuration;
    }


    private boolean _isLasautdaForVa(ValueSlice<Long> _valueSliceLsLong) {

      Duration _slsDuration = Duration.between(_valueSliceLsLong.getInstant(),
          this.clock.instant());
      if (_slsDuration.compareTo(this.tlDuration) > 0) {

        return false;
      } else {
        return true;
      }
    }


    private boolean _isMerprapeForVaVa(ValueSlice<Long> isStrt,
        ValueSlice<Long> _valueSliceLasLong) {

      Duration _pmDuration = Duration.between(isStrt.getInstant(), _valueSliceLasLong.getInstant());

      Duration _diDuration = _pmDuration.minus(this.peDuration).abs();
      if (_diDuration.compareTo(this.oaDuration) > 0) {

        return false;
      } else {
        return true;
      }
    }


    boolean isVaalForVaVa(ValueSlice<Long> isStrt, ValueSlice<Long> _valueSliceLLong) {
      return this._isLasautdaForVa(_valueSliceLLong) && this._isMerprapeForVaVa(isStrt,
          _valueSliceLLong);
    }
  }
}
