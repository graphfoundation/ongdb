package io.github.onograph.cluster.raft.gateway.gwlb.interceptors;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;


public class RuleProcessorInitiatorImpl<T> implements RuleProcessor<T> {


  private final List<RuleProcessorJoiningImpl<T>> listRlsRuleProcessorJoiningImpl;

  public RuleProcessorInitiatorImpl(
      List<RuleProcessorJoiningImpl<T>> _listRlsRuleProcessorJoiningImpl) {
    this.listRlsRuleProcessorJoiningImpl = _listRlsRuleProcessorJoiningImpl;
  }

  @Override
  public Set<T> aplSet(Set<T> _setIptT) {

    Set<T> _setOtuT = _setIptT;

    Iterator _iterator = this.listRlsRuleProcessorJoiningImpl.iterator();

    while (_iterator.hasNext()) {

      RuleProcessor<T> _ruleProcessorCanT = (RuleProcessor) _iterator.next();
      _setOtuT = _ruleProcessorCanT.aplSet(_setIptT);
      if (!_setOtuT.isEmpty()) {
        break;
      }
    }

    return _setOtuT;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      RuleProcessorInitiatorImpl<?> _ruleProcessorInitiatorImplThaObject = (RuleProcessorInitiatorImpl) obj;
      return Objects.equals(this.listRlsRuleProcessorJoiningImpl,
          _ruleProcessorInitiatorImplThaObject.listRlsRuleProcessorJoiningImpl);
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.listRlsRuleProcessorJoiningImpl);
  }


}
