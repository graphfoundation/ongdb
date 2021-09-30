package io.github.onograph.cluster.raft.module.dprot.impl.structure;

import akka.cluster.UniqueAddress;
import java.util.Objects;


public class FinishClear {


  private final UniqueAddress uniqueAddress;

  public FinishClear(UniqueAddress _uniqueAddress) {
    this.uniqueAddress = _uniqueAddress;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      FinishClear _thaFinishClear = (FinishClear) obj;
      return Objects.equals(this.uniqueAddress, _thaFinishClear.uniqueAddress);
    } else {
      return false;
    }
  }


  public UniqueAddress getUniqueAddress() {
    return this.uniqueAddress;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.uniqueAddress);
  }
}
