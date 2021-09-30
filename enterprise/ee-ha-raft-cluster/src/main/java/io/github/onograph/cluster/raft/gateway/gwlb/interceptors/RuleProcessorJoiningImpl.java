package io.github.onograph.cluster.raft.gateway.gwlb.interceptors;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;


public class RuleProcessorJoiningImpl<T> implements RuleProcessor<T> {


  private final List<RuleProcessor<T>> listCanRuleProcessor;

  public RuleProcessorJoiningImpl(List<RuleProcessor<T>> _listCanRuleProcessor) {
    this.listCanRuleProcessor = _listCanRuleProcessor;
  }

  @Override
  public Set<T> aplSet(Set<T> _setDatT) {

    RuleProcessor _fleRuleProcessor;
    for (

        Iterator _iterator = this.listCanRuleProcessor.iterator(); _iterator.hasNext();
        _setDatT = _fleRuleProcessor.aplSet(_setDatT)) {
      _fleRuleProcessor = (RuleProcessor) _iterator.next();
    }

    return _setDatT;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      RuleProcessorJoiningImpl<?> _ruleProcessorJoiningImplTObject = (RuleProcessorJoiningImpl) obj;
      return Objects.equals(this.listCanRuleProcessor,
          _ruleProcessorJoiningImplTObject.listCanRuleProcessor);
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.listCanRuleProcessor);
  }


}
