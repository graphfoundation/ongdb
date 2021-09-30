package io.github.onograph.kernel.srv.pagecache;

import java.io.Flushable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.LongAdder;
import java.util.concurrent.locks.LockSupport;
import java.util.function.ObjLongConsumer;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseInternalSettings;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.io.pagecache.IOController;
import org.neo4j.io.pagecache.tracing.MajorFlushEvent;
import org.neo4j.time.SystemNanoClock;
import org.neo4j.util.VisibleForTesting;


public class DefaultIOController implements IOController {


  private static final int LTM_BXS = 32;


  private static final long LTM_MSX = 4294967295L;


  private static final int NOIT = 0;


  private static final int QUNMLS = 100;


  private static final int QUNM_PER_C2;


  private static final AtomicLongFieldUpdater<DefaultIOController> atomicLongFieldUpdaterCoosueDefaultIOController =
      AtomicLongFieldUpdater.newUpdater(DefaultIOController.class,
          io.github.onograph.TokenConstants.LG_SC);

  static {
    QUNM_PER_C2 = (int) (TimeUnit.SECONDS.toMillis(1L) / 100L);
  }


  private final Config config;


  private final ObjLongConsumer<Object> objLongConsumerNpObject;


  private final LongAdder oieLongAdder;


  private final SystemNanoClock systemNanoClock;


  private volatile long lgSc;


  private volatile long lgSi;

  public DefaultIOController(Config _config, SystemNanoClock _systemNanoClock) {
    this(_config, LockSupport::parkNanos, _systemNanoClock);
  }

  @VisibleForTesting
  DefaultIOController(Config _config, ObjLongConsumer<Object> _objLongConsumerNpObject,
      SystemNanoClock _systemNanoClock) {
    this.oieLongAdder = new LongAdder();
    this.config = _config;
    this.objLongConsumerNpObject = _objLongConsumerNpObject;
    this.systemNanoClock = _systemNanoClock;

    Integer _iI = _config.get(GraphDatabaseSettings.check_point_iops_limit);
    this._upecitForIn(_iI);
    _config.addListener(GraphDatabaseSettings.check_point_iops_limit, (prev, update) ->
    {
      this._upecitForIn(update);
    });
  }


  private static long _copesa(int _iCd, int _iIo) {
    return (long) _iCd << 32 | (long) _iIo;
  }


  private static int _gedsdct(long _lgSae) {
    return (int) (_lgSae >>> 32);
  }


  private static int _geiopq(long _lgSae) {
    return (int) (_lgSae & 4294967295L);
  }


  private long _cuntemi() {
    return TimeUnit.NANOSECONDS.toMillis(this.systemNanoClock.nanos());
  }


  private void _upecitForIn(Integer _iIop) {

    long _lgSo;

    long _lgSn;

    int _iCd;
    if (_iIop != null && _iIop >= 1) {
      do {
        _lgSo = atomicLongFieldUpdaterCoosueDefaultIOController.get(this);
        _iCd = _gedsdct(_lgSo);
        _iCd &= -2;

        int _iIop2 = _iIop / QUNM_PER_C2;
        _lgSn = _copesa(_iCd, _iIop2);
      }
      while (!atomicLongFieldUpdaterCoosueDefaultIOController.compareAndSet(this, _lgSo, _lgSn));
    } else {
      do {
        _lgSo = atomicLongFieldUpdaterCoosueDefaultIOController.get(this);
        _iCd = _gedsdct(_lgSo);
        _iCd |= 1;
        _lgSn = _copesa(_iCd, 0);
      }
      while (!atomicLongFieldUpdaterCoosueDefaultIOController.compareAndSet(this, _lgSo, _lgSn));
    }
  }

  @Override
  public void disable() {

    long _lgCs;

    long _lgSn;
    do {
      _lgCs = atomicLongFieldUpdaterCoosueDefaultIOController.get(this);

      int _iCd = _gedsdct(_lgCs) + 2;
      _lgSn = _copesa(_iCd, _geiopq(_lgCs));
    }
    while (!atomicLongFieldUpdaterCoosueDefaultIOController.compareAndSet(this, _lgCs, _lgSn));
  }

  @Override
  public void enable() {

    long _lgSc;

    long _lgSn;
    do {
      _lgSc = atomicLongFieldUpdaterCoosueDefaultIOController.get(this);

      int _iCd = _gedsdct(_lgSc) - 2;
      _lgSn = _copesa(_iCd, _geiopq(_lgSc));
    }
    while (!atomicLongFieldUpdaterCoosueDefaultIOController.compareAndSet(this, _lgSc, _lgSn));

    this.oieLongAdder.reset();
    this.lgSi = 0L;
  }


  @VisibleForTesting
  long geeeaio() {
    return this.oieLongAdder.sum();
  }

  @Override
  public boolean isEnabled() {
    return _gedsdct(this.lgSc) == 0;
  }

  @Override
  public void maybeLimitIO(int _iOicr, Flushable _flushable, MajorFlushEvent _majorFlushEvent) {
    _majorFlushEvent.reportIO(_iOicr);

    long _lgSae = atomicLongFieldUpdaterCoosueDefaultIOController.get(this);
    if (_gedsdct(_lgSae) <= 0) {

      long _lgN = this._cuntemi() & 4294967295L;

      long _lgSp = this.lgSi;

      long _lgTh = _lgSp & 4294967295L;
      if (_lgN - _lgTh > 100L) {
        this.lgSi = _lgN + ((long) _iOicr << 32);
        this.oieLongAdder.reset();
      } else {

        long _lgIe =
            this.config.get(GraphDatabaseInternalSettings.io_controller_consider_external_io)
                ? this.oieLongAdder.sumThenReset() : 0L;

        long _lgSi = (_lgSp >> 32) + (long) _iOicr + _lgIe;
        if (_lgSi < (long) _geiopq(_lgSae)) {
          this.lgSi = _lgTh + (_lgSi << 32);
        } else {

          long _lgQilm = Math.min(100L, 100L - (_lgN - _lgTh));
          this.objLongConsumerNpObject.accept(this, TimeUnit.MILLISECONDS.toNanos(_lgQilm));
          _majorFlushEvent.throttle(_lgQilm);
          this.lgSi = this._cuntemi() & 4294967295L;
        }
      }
    }
  }

  @Override
  public void reportIO(int _iOic) {
    this.oieLongAdder.add(_iOic);
  }
}
