package io.github.onograph.cluster.raft.gateway.gwlb.interceptors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

class RuleProcessorJoiningImplTest {

  @Test
  void testAplSet() {
    RuleProcessorJoiningImpl<Object> ruleProcessorJoiningImpl = new RuleProcessorJoiningImpl<Object>(
        new ArrayList<RuleProcessor<Object>>());
    HashSet<Object> objectSet = new HashSet<Object>();
    Set<Object> actualAplSetResult = ruleProcessorJoiningImpl.aplSet(objectSet);
    assertSame(objectSet, actualAplSetResult);
    assertTrue(actualAplSetResult.isEmpty());
  }

  @Test
  void testAplSet2() {
    RuleProcessor<Object> ruleProcessor = (RuleProcessor<Object>) mock(RuleProcessor.class);
    HashSet<Object> objectSet = new HashSet<Object>();
    when(ruleProcessor.aplSet((Set<Object>) any())).thenReturn(objectSet);

    ArrayList<RuleProcessor<Object>> ruleProcessorList = new ArrayList<RuleProcessor<Object>>();
    ruleProcessorList.add(ruleProcessor);
    RuleProcessorJoiningImpl<Object> ruleProcessorJoiningImpl = new RuleProcessorJoiningImpl<Object>(
        ruleProcessorList);
    Set<Object> actualAplSetResult = ruleProcessorJoiningImpl.aplSet(new HashSet<Object>());
    assertSame(objectSet, actualAplSetResult);
    assertTrue(actualAplSetResult.isEmpty());
    verify(ruleProcessor).aplSet((Set<Object>) any());
  }

  @Test
  void testConstructor() {
    ArrayList<RuleProcessor<Object>> ruleProcessorList = new ArrayList<RuleProcessor<Object>>();
    new RuleProcessorJoiningImpl<Object>(ruleProcessorList);
    assertTrue(ruleProcessorList.isEmpty());
  }

  @Test
  void testEquals() {
    assertFalse(
        (new RuleProcessorJoiningImpl<Object>(new ArrayList<RuleProcessor<Object>>())).equals(
            null));
    assertFalse((new RuleProcessorJoiningImpl<Object>(new ArrayList<RuleProcessor<Object>>()))
        .equals("Different type to RuleProcessorJoiningImpl"));
  }

  @Test
  void testEquals2() {
    RuleProcessorJoiningImpl<Object> ruleProcessorJoiningImpl = new RuleProcessorJoiningImpl<Object>(
        new ArrayList<RuleProcessor<Object>>());
    assertTrue(ruleProcessorJoiningImpl.equals(ruleProcessorJoiningImpl));
    int expectedHashCodeResult = ruleProcessorJoiningImpl.hashCode();
    assertEquals(expectedHashCodeResult, ruleProcessorJoiningImpl.hashCode());
  }

  @Test
  void testEquals3() {
    RuleProcessorJoiningImpl<Object> ruleProcessorJoiningImpl = new RuleProcessorJoiningImpl<Object>(
        new ArrayList<RuleProcessor<Object>>());
    RuleProcessorJoiningImpl<Object> ruleProcessorJoiningImpl1 = new RuleProcessorJoiningImpl<Object>(
        new ArrayList<RuleProcessor<Object>>());
    assertTrue(ruleProcessorJoiningImpl.equals(ruleProcessorJoiningImpl1));
    int expectedHashCodeResult = ruleProcessorJoiningImpl.hashCode();
    assertEquals(expectedHashCodeResult, ruleProcessorJoiningImpl1.hashCode());
  }

  @Test
  void testEquals4() {
    ArrayList<RuleProcessor<Object>> ruleProcessorList = new ArrayList<RuleProcessor<Object>>();
    ruleProcessorList.add((RuleProcessor<Object>) mock(RuleProcessor.class));
    RuleProcessorJoiningImpl<Object> ruleProcessorJoiningImpl = new RuleProcessorJoiningImpl<Object>(
        ruleProcessorList);
    assertFalse(
        ruleProcessorJoiningImpl.equals(
            new RuleProcessorJoiningImpl<Object>(new ArrayList<RuleProcessor<Object>>())));
  }

  @Test
  void testEquals5() {
    ArrayList<RuleProcessor<Object>> ruleProcessorList = new ArrayList<RuleProcessor<Object>>();
    ruleProcessorList.add((RuleProcessor<Object>) mock(RuleProcessor.class));
    RuleProcessorJoiningImpl<Object> ruleProcessorJoiningImpl = new RuleProcessorJoiningImpl<Object>(
        ruleProcessorList);

    ArrayList<RuleProcessor<Object>> ruleProcessorList1 = new ArrayList<RuleProcessor<Object>>();
    ruleProcessorList1.add((RuleProcessor<Object>) mock(RuleProcessor.class));
    assertFalse(
        ruleProcessorJoiningImpl.equals(new RuleProcessorJoiningImpl<Object>(ruleProcessorList1)));
  }

  @Test
  void testEquals6() {
    ArrayList<RuleProcessor<Object>> ruleProcessorList = new ArrayList<RuleProcessor<Object>>();
    ruleProcessorList.add(
        new RuleProcessorJoiningImpl<Object>(new ArrayList<RuleProcessor<Object>>()));
    RuleProcessorJoiningImpl<Object> ruleProcessorJoiningImpl = new RuleProcessorJoiningImpl<Object>(
        ruleProcessorList);

    ArrayList<RuleProcessor<Object>> ruleProcessorList1 = new ArrayList<RuleProcessor<Object>>();
    ruleProcessorList1.add((RuleProcessor<Object>) mock(RuleProcessor.class));
    assertFalse(
        ruleProcessorJoiningImpl.equals(new RuleProcessorJoiningImpl<Object>(ruleProcessorList1)));
  }
}

