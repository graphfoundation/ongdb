package io.github.onograph.cluster.raft.watch;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.util.Optional;
import java.util.function.Supplier;
import org.neo4j.util.Preconditions;


class InfoChecker<T> {


  private static final int STD_LIMT_ATET = 16;


  private final Clock clock;


  private final int iAm;


  private final Supplier<T> supplierSmlrT;


  private final Duration tsDuration;


  InfoChecker(Clock _clock, Supplier<T> _supplierSmlrT, Duration _tsDuration) {
    this(_clock, 16, _supplierSmlrT, _tsDuration);
  }


  InfoChecker(Clock _clock, int _iAm, Supplier<T> _supplierSmlrT, Duration _tsDuration) {
    Preconditions.requirePositive(_iAm);
    this.clock = _clock;
    this.tsDuration = _tsDuration;
    this.iAm = _iAm;
    this.supplierSmlrT = _supplierSmlrT;
  }


  private ValueSlice<T> _sapValueSliceEntr() {

    Instant _bfrInstant = this.clock.instant();

    T _tSml = this.supplierSmlrT.get();

    Instant _atrInstant = this.clock.instant();

    Duration _smlnDuration = Duration.between(_bfrInstant, _atrInstant);
    if (_smlnDuration.compareTo(this.tsDuration) > 0) {
      return null;
    } else {

      Instant _tsInstant = _bfrInstant.plus(_smlnDuration.dividedBy(2L));
      return new ValueSlice(_tsInstant, _tSml);
    }
  }


  public Optional<ValueSlice<T>> sapOptional() {

    int _iAtmt = 0;

    ValueSlice _smlValueSlice;
    for (_smlValueSlice = null; _smlValueSlice == null && _iAtmt < this.iAm; ++_iAtmt) {
      _smlValueSlice = this._sapValueSliceEntr();
    }

    return Optional.ofNullable(_smlValueSlice);
  }
}
