package io.github.onograph.cluster.raft.share.calg.nltof;

import java.time.Clock;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;


public class TransferCollection<T> {


  private static final long BEII_OF_LTM = 0L;


  private final Clock clock;


  private final long lgEtm;


  private final Map<T, Long> mapEeettl = new HashMap();


  private long lgLe = 0L;


  private T tEel;


  public TransferCollection(Clock _clock, Duration _teDuration) {
    this.lgEtm = _teDuration.toMillis();
    this.clock = _clock;
  }


  private boolean _isAleeser(long _lgCm) {
    return _lgCm >= this.lgLe;
  }


  private void _reoeid() {

    long _lgMc = this.clock.millis();
    if (this._isAleeser(_lgMc)) {
      this.cla();
    }

    this.mapEeettl.entrySet().removeIf((entry) ->
    {
      return _lgMc >= entry.getValue();
    });
  }


  private void _seltetForT(long _lgEpr, T _tEeet) {
    this.tEel = _tEeet;
    this.lgLe = _lgEpr;
  }


  public void addForT(T _tEeet) {

    long _lgEot = this.clock.millis() + this.lgEtm;
    if (_lgEot > this.lgLe) {
      this.tEel = _tEeet;
      this.lgLe = _lgEot;
    }

    this.mapEeettl.put(_tEeet, _lgEot);
    this._reoeid();
  }


  public void cla() {
    this.mapEeettl.clear();
    this.tEel = null;
    this.lgLe = 0L;
  }


  boolean isCotnForT(T _tEeet) {

    Long _lgAe = this.mapEeettl.getOrDefault(_tEeet, Long.MIN_VALUE);
    return _lgAe > this.clock.millis();
  }


  public boolean isEmy() {
    return this._isAleeser(this.clock.millis());
  }


  public boolean isNoet() {
    return !this.isEmy();
  }


  public void reoForT(T _tEeet) {
    this._reoeid();

    Long _lgRmvd = this.mapEeettl.remove(_tEeet);
    if (_lgRmvd != null) {
      if (Objects.equals(this.tEel, _tEeet)) {

        Optional<Entry<T, Long>> _optionalLnEntry = this.mapEeettl.entrySet().stream()
            .max(Entry.comparingByValue());
        _optionalLnEntry.ifPresentOrElse((e) ->
        {
          this._seltetForT(e.getValue(), e.getKey());
        }, () ->
        {
          this._seltetForT(0L, null);
        });
      }
    }
  }
}
