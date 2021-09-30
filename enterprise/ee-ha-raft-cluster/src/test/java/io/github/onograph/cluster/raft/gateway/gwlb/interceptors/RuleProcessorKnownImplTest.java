package io.github.onograph.cluster.raft.gateway.gwlb.interceptors;

import java.util.HashSet;
import org.junit.jupiter.api.Test;

class RuleProcessorKnownImplTest {

  @Test
  void testAsRuleProcessorKnownImpl() {

    RuleProcessorKnownImpl<Object> actualAsRuleProcessorKnownImplResult = RuleProcessorKnownImpl
        .<Object>asRuleProcessorKnownImpl();
    actualAsRuleProcessorKnownImplResult.aplSet(new HashSet<Object>());
  }

  @Test
  void testAsRuleProcessorKnownImpl2() {

    RuleProcessorKnownImpl<Object> actualAsRuleProcessorKnownImplResult = RuleProcessorKnownImpl
        .<Object>asRuleProcessorKnownImpl();
    HashSet<Object> objectSet = new HashSet<Object>();
    objectSet.add("42");
    actualAsRuleProcessorKnownImplResult.aplSet(objectSet);
  }
}

