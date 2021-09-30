package io.github.onograph.dbms.crash;

import java.util.Objects;


public abstract class AbstractCrashEvent implements CrashSignaler.CrashEvent {


  protected final Throwable casThrowable;


  protected final CrashSignaler.CauseInfo causeInfo;


  protected AbstractCrashEvent(CrashSignaler.CauseInfo causeInfo, Throwable _cueThrowable) {
    this.casThrowable = _cueThrowable;
    this.causeInfo = causeInfo;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      AbstractCrashEvent _thaAbstractCrashEvent = (AbstractCrashEvent) obj;
      return this.casThrowable.equals(_thaAbstractCrashEvent.casThrowable) && this.causeInfo.equals(
          _thaAbstractCrashEvent.causeInfo);
    } else {
      return false;
    }
  }

  @Override
  public Throwable gecsThrowable() {
    return this.casThrowable;
  }

  @Override
  public CrashSignaler.CauseInfo gersCrashSignalerCauseInfo() {
    return this.causeInfo;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.casThrowable, this.causeInfo);
  }
}
