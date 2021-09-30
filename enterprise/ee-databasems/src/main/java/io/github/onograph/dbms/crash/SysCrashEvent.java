package io.github.onograph.dbms.crash;

import java.util.Objects;


public final class SysCrashEvent extends AbstractCrashEvent {


  private final int iCe;


  public SysCrashEvent(Throwable _cueThrowable, SysCrashCauseInfo _raoSysCrashCauseInfo) {
    super(_raoSysCrashCauseInfo, _cueThrowable);
    this.iCe = _raoSysCrashCauseInfo.insCType;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {
      if (!super.equals(obj)) {
        return false;
      } else {

        SysCrashEvent ev = (SysCrashEvent) obj;
        return super.equals(ev) && this.iCe == ev.iCe;
      }
    } else {
      return false;
    }
  }


  public int getICe() {
    return this.iCe;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), this.iCe);
  }
}
