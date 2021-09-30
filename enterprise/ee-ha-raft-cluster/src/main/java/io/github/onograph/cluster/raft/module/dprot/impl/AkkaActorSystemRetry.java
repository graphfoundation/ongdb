package io.github.onograph.cluster.raft.module.dprot.impl;

import io.github.onograph.config.SettingsDeclarationClusterSystemImpl;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.neo4j.configuration.Config;
import org.neo4j.internal.helpers.DefaultTimeoutStrategy;
import org.neo4j.internal.helpers.TimeoutStrategy;
import org.neo4j.internal.helpers.TimeoutStrategy.Timeout;
import org.neo4j.util.VisibleForTesting;


public class AkkaActorSystemRetry {


  private final int iArm;


  private final TimeoutStrategy timeoutStrategy;


  private volatile boolean isHaty = true;


  private volatile Throwable leThrowable;


  private AkkaActorSystemRetry(int _iArm, TimeoutStrategy _timeoutStrategy) {
    this.iArm = _iArm;
    this.timeoutStrategy = _timeoutStrategy;
  }


  public static AkkaActorSystemRetry focfAkkaActorSystemRetry(Config _config) {

    TimeoutStrategy _timeoutStrategy = DefaultTimeoutStrategy
        .exponential(
            _config.get(SettingsDeclarationClusterSystemImpl.settingAkcyrrnlyDuration).toMillis(),
            _config.get(SettingsDeclarationClusterSystemImpl.settingAkcyrraaDuration).toMillis(),
            TimeUnit.MILLISECONDS);
    return new AkkaActorSystemRetry(
        _config.get(SettingsDeclarationClusterSystemImpl.settingAkcymsapInteger), _timeoutStrategy);
  }


  @VisibleForTesting
  public static AkkaActorSystemRetry fottAkkaActorSystemRetry(int _iRm) {
    return new AkkaActorSystemRetry(_iRm,
        DefaultTimeoutStrategy.constant(1L, TimeUnit.MILLISECONDS));
  }


  private boolean _isDoreaForCa(Callable<Boolean> _callableRtyBoolean) {
    try {

      Boolean _isRsl = _callableRtyBoolean.call();
      this.leThrowable = null;
      return _isRsl;
    } catch (

        Throwable _throwable) {
      this.leThrowable = _throwable;
      return false;
    }
  }


  public boolean getIsHaty() {
    return this.isHaty;
  }


  public synchronized void rettForStCa(Callable<Boolean> _callableRtyBoolean, String title)
      throws StartFailure {

    int cnt = 0;

    Timeout _timeout = this.timeoutStrategy.newTimeout();

    while (cnt < this.iArm || this.iArm < 0) {
      if (this._isDoreaForCa(_callableRtyBoolean)) {
        this.isHaty = true;
        return;
      }

      this.isHaty = false;
      ++cnt;

      try {
        Thread.sleep(_timeout.getAndIncrement());
      } catch (

          InterruptedException _interruptedException) {
        Thread.currentThread().interrupt();
        throw new RuntimeException(_interruptedException);
      }
    }

    this.isHaty = false;
    throw this.leThrowable != null ? new StartFailure(this.leThrowable)
        : new StartFailure(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.cluster.raft.module.dprot.impl.AkkaActorSystemRetry.format"),
                title, cnt));
  }


  public static class StartFailure extends Exception {

    public StartFailure(Throwable _cueThrowable) {
      super(_cueThrowable);
    }

    public StartFailure(String m) {
      super(m);
    }
  }
}
