package io.github.onograph.cluster.raft.gateway.gwlb.interceptors;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;


public class RuleProcessorDefinedLengthImpl<T> implements RuleProcessor<T> {


  private final int iCm;

  public RuleProcessorDefinedLengthImpl(int _iCm) {
    this.iCm = _iCm;
  }

  @Override
  public Set<T> aplSet(Set<T> _setDT) {
    return _setDT.size() >= this.iCm ? _setDT : Collections.emptySet();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      RuleProcessorDefinedLengthImpl<?> _ruleProcessorDefinedLengthImplThObject = (RuleProcessorDefinedLengthImpl) obj;
      return this.iCm == _ruleProcessorDefinedLengthImplThObject.iCm;
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.iCm);
  }


}
