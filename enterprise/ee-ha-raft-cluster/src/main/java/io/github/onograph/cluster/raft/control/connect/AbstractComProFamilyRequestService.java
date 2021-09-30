package io.github.onograph.cluster.raft.control.connect;

import java.util.Objects;
import java.util.Set;


public abstract class AbstractComProFamilyRequestService<IMPL extends Comparable<IMPL>> implements
    HandshakeMessageService {


  private final String pType;


  private final Set<IMPL> setVrinIMPL;

  AbstractComProFamilyRequestService(String pType, Set<IMPL> _setVrinIMPL) {
    this.pType = pType;
    this.setVrinIMPL = _setVrinIMPL;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      AbstractComProFamilyRequestService _thAbstractComProFamilyRequestService = (AbstractComProFamilyRequestService) obj;
      return Objects.equals(this.pType, _thAbstractComProFamilyRequestService.pType) &&
          Objects.equals(this.setVrinIMPL, _thAbstractComProFamilyRequestService.setVrinIMPL);
    } else {
      return false;
    }
  }


  public String getPType() {
    return this.pType;
  }


  public Set<IMPL> getSetVrinIMPL() {
    return this.setVrinIMPL;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.pType, this.setVrinIMPL);
  }


}
