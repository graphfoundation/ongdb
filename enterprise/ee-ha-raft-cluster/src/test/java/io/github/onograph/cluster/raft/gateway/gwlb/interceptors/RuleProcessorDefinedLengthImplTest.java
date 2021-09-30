package io.github.onograph.cluster.raft.gateway.gwlb.interceptors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

class RuleProcessorDefinedLengthImplTest {

  @Test
  void testAplSet() {
    RuleProcessorDefinedLengthImpl<Object> ruleProcessorDefinedLengthImpl = new RuleProcessorDefinedLengthImpl<Object>(
        1);
    assertTrue(ruleProcessorDefinedLengthImpl.aplSet(new HashSet<Object>()).isEmpty());
  }

  @Test
  void testAplSet2() {
    RuleProcessorDefinedLengthImpl<Object> ruleProcessorDefinedLengthImpl = new RuleProcessorDefinedLengthImpl<Object>(
        0);
    HashSet<Object> objectSet = new HashSet<Object>();
    Set<Object> actualAplSetResult = ruleProcessorDefinedLengthImpl.aplSet(objectSet);
    assertSame(objectSet, actualAplSetResult);
    assertTrue(actualAplSetResult.isEmpty());
  }

  @Test
  void testConstructor() {

    new RuleProcessorDefinedLengthImpl<Object>(1);
  }

  @Test
  void testEquals() {
    assertFalse((new RuleProcessorDefinedLengthImpl<Object>(1)).equals(null));
    assertFalse(
        (new RuleProcessorDefinedLengthImpl<Object>(1)).equals(
            "Different type to RuleProcessorDefinedLengthImpl"));
  }

  @Test
  void testEquals2() {
    RuleProcessorDefinedLengthImpl<Object> ruleProcessorDefinedLengthImpl = new RuleProcessorDefinedLengthImpl<Object>(
        1);
    assertTrue(ruleProcessorDefinedLengthImpl.equals(ruleProcessorDefinedLengthImpl));
    int expectedHashCodeResult = ruleProcessorDefinedLengthImpl.hashCode();
    assertEquals(expectedHashCodeResult, ruleProcessorDefinedLengthImpl.hashCode());
  }

  @Test
  void testEquals3() {
    RuleProcessorDefinedLengthImpl<Object> ruleProcessorDefinedLengthImpl = new RuleProcessorDefinedLengthImpl<Object>(
        1);
    RuleProcessorDefinedLengthImpl<Object> ruleProcessorDefinedLengthImpl1 = new RuleProcessorDefinedLengthImpl<Object>(
        1);
    assertTrue(ruleProcessorDefinedLengthImpl.equals(ruleProcessorDefinedLengthImpl1));
    int expectedHashCodeResult = ruleProcessorDefinedLengthImpl.hashCode();
    assertEquals(expectedHashCodeResult, ruleProcessorDefinedLengthImpl1.hashCode());
  }

  @Test
  void testEquals4() {
    RuleProcessorDefinedLengthImpl<Object> ruleProcessorDefinedLengthImpl = new RuleProcessorDefinedLengthImpl<Object>(
        0);
    assertFalse(
        ruleProcessorDefinedLengthImpl.equals(new RuleProcessorDefinedLengthImpl<Object>(1)));
  }
}

