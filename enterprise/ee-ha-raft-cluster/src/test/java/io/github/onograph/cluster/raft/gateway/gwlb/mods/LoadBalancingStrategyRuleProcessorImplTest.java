package io.github.onograph.cluster.raft.gateway.gwlb.mods;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessor;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

class LoadBalancingStrategyRuleProcessorImplTest {

  @Test
  void testConstructor() {

    new LoadBalancingStrategyRuleProcessorImpl(
        (RuleProcessor<LoadBalanceServerMeta>) mock(RuleProcessor.class));
  }

  @Test
  void testAplSet() {
    RuleProcessor<LoadBalanceServerMeta> ruleProcessor = (RuleProcessor<LoadBalanceServerMeta>) mock(
        RuleProcessor.class);
    HashSet<LoadBalanceServerMeta> loadBalanceServerMetaSet = new HashSet<LoadBalanceServerMeta>();
    when(ruleProcessor.aplSet((Set<LoadBalanceServerMeta>) any())).thenReturn(
        loadBalanceServerMetaSet);
    LoadBalancingStrategyRuleProcessorImpl loadBalancingStrategyRuleProcessorImpl = new LoadBalancingStrategyRuleProcessorImpl(
        ruleProcessor);
    Set<LoadBalanceServerMeta> actualAplSetResult = loadBalancingStrategyRuleProcessorImpl
        .aplSet(new HashSet<LoadBalanceServerMeta>());
    assertSame(loadBalanceServerMetaSet, actualAplSetResult);
    assertTrue(actualAplSetResult.isEmpty());
    verify(ruleProcessor).aplSet((Set<LoadBalanceServerMeta>) any());
  }

  @Test
  void testEquals() {
    assertFalse(
        (new LoadBalancingStrategyRuleProcessorImpl(
            (RuleProcessor<LoadBalanceServerMeta>) mock(RuleProcessor.class)))
            .equals(null));
    assertFalse(
        (new LoadBalancingStrategyRuleProcessorImpl(
            (RuleProcessor<LoadBalanceServerMeta>) mock(RuleProcessor.class)))
            .equals("Different type to LoadBalancingStrategyRuleProcessorImpl"));
  }

  @Test
  void testEquals2() {
    LoadBalancingStrategyRuleProcessorImpl loadBalancingStrategyRuleProcessorImpl = new LoadBalancingStrategyRuleProcessorImpl(
        (RuleProcessor<LoadBalanceServerMeta>) mock(RuleProcessor.class));
    assertTrue(
        loadBalancingStrategyRuleProcessorImpl.equals(loadBalancingStrategyRuleProcessorImpl));
    int expectedHashCodeResult = loadBalancingStrategyRuleProcessorImpl.hashCode();
    assertEquals(expectedHashCodeResult, loadBalancingStrategyRuleProcessorImpl.hashCode());
  }

  @Test
  void testEquals3() {
    LoadBalancingStrategyRuleProcessorImpl loadBalancingStrategyRuleProcessorImpl = new LoadBalancingStrategyRuleProcessorImpl(
        (RuleProcessor<LoadBalanceServerMeta>) mock(RuleProcessor.class));
    assertFalse(loadBalancingStrategyRuleProcessorImpl.equals(
        new LoadBalancingStrategyRuleProcessorImpl(
            (RuleProcessor<LoadBalanceServerMeta>) mock(RuleProcessor.class))));
  }
}

