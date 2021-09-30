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

class RuleProcessorInitiatorImplTest {

  @Test
  void testAplSet() {
    RuleProcessorInitiatorImpl<Object> ruleProcessorInitiatorImpl = new RuleProcessorInitiatorImpl<Object>(
        new ArrayList<RuleProcessorJoiningImpl<Object>>());
    HashSet<Object> objectSet = new HashSet<Object>();
    Set<Object> actualAplSetResult = ruleProcessorInitiatorImpl.aplSet(objectSet);
    assertSame(objectSet, actualAplSetResult);
    assertTrue(actualAplSetResult.isEmpty());
  }

  @Test
  void testAplSet2() {
    ArrayList<RuleProcessorJoiningImpl<Object>> ruleProcessorJoiningImplList = new ArrayList<RuleProcessorJoiningImpl<Object>>();
    ruleProcessorJoiningImplList.add(
        new RuleProcessorJoiningImpl<Object>(new ArrayList<RuleProcessor<Object>>()));
    RuleProcessorInitiatorImpl<Object> ruleProcessorInitiatorImpl = new RuleProcessorInitiatorImpl<Object>(
        ruleProcessorJoiningImplList);
    HashSet<Object> objectSet = new HashSet<Object>();
    Set<Object> actualAplSetResult = ruleProcessorInitiatorImpl.aplSet(objectSet);
    assertSame(objectSet, actualAplSetResult);
    assertTrue(actualAplSetResult.isEmpty());
  }

  @Test
  void testAplSet3() {
    RuleProcessor<Object> ruleProcessor = (RuleProcessor<Object>) mock(RuleProcessor.class);
    HashSet<Object> objectSet = new HashSet<Object>();
    when(ruleProcessor.aplSet((Set<Object>) any())).thenReturn(objectSet);

    ArrayList<RuleProcessor<Object>> ruleProcessorList = new ArrayList<RuleProcessor<Object>>();
    ruleProcessorList.add(ruleProcessor);
    RuleProcessorJoiningImpl<Object> e = new RuleProcessorJoiningImpl<Object>(ruleProcessorList);

    ArrayList<RuleProcessorJoiningImpl<Object>> ruleProcessorJoiningImplList = new ArrayList<RuleProcessorJoiningImpl<Object>>();
    ruleProcessorJoiningImplList.add(e);
    RuleProcessorInitiatorImpl<Object> ruleProcessorInitiatorImpl = new RuleProcessorInitiatorImpl<Object>(
        ruleProcessorJoiningImplList);
    Set<Object> actualAplSetResult = ruleProcessorInitiatorImpl.aplSet(new HashSet<Object>());
    assertSame(objectSet, actualAplSetResult);
    assertTrue(actualAplSetResult.isEmpty());
    verify(ruleProcessor).aplSet((Set<Object>) any());
  }

  @Test
  void testAplSet4() {
    HashSet<Object> objectSet = new HashSet<Object>();
    objectSet.add("42");
    RuleProcessor<Object> ruleProcessor = (RuleProcessor<Object>) mock(RuleProcessor.class);
    when(ruleProcessor.aplSet((Set<Object>) any())).thenReturn(objectSet);

    ArrayList<RuleProcessor<Object>> ruleProcessorList = new ArrayList<RuleProcessor<Object>>();
    ruleProcessorList.add(ruleProcessor);
    RuleProcessorJoiningImpl<Object> e = new RuleProcessorJoiningImpl<Object>(ruleProcessorList);

    ArrayList<RuleProcessorJoiningImpl<Object>> ruleProcessorJoiningImplList = new ArrayList<RuleProcessorJoiningImpl<Object>>();
    ruleProcessorJoiningImplList.add(e);
    RuleProcessorInitiatorImpl<Object> ruleProcessorInitiatorImpl = new RuleProcessorInitiatorImpl<Object>(
        ruleProcessorJoiningImplList);
    Set<Object> actualAplSetResult = ruleProcessorInitiatorImpl.aplSet(new HashSet<Object>());
    assertSame(objectSet, actualAplSetResult);
    assertEquals(1, actualAplSetResult.size());
    verify(ruleProcessor).aplSet((Set<Object>) any());
  }

  @Test
  void testConstructor() {
    ArrayList<RuleProcessorJoiningImpl<Object>> ruleProcessorJoiningImplList = new ArrayList<RuleProcessorJoiningImpl<Object>>();
    new RuleProcessorInitiatorImpl<Object>(ruleProcessorJoiningImplList);
    assertTrue(ruleProcessorJoiningImplList.isEmpty());
  }

  @Test
  void testEquals() {
    assertFalse(
        (new RuleProcessorInitiatorImpl<Object>(
            new ArrayList<RuleProcessorJoiningImpl<Object>>())).equals(null));
    assertFalse(
        (new RuleProcessorInitiatorImpl<Object>(new ArrayList<RuleProcessorJoiningImpl<Object>>()))
            .equals("Different type to RuleProcessorInitiatorImpl"));
  }

  @Test
  void testEquals2() {
    RuleProcessorInitiatorImpl<Object> ruleProcessorInitiatorImpl = new RuleProcessorInitiatorImpl<Object>(
        new ArrayList<RuleProcessorJoiningImpl<Object>>());
    assertTrue(ruleProcessorInitiatorImpl.equals(ruleProcessorInitiatorImpl));
    int expectedHashCodeResult = ruleProcessorInitiatorImpl.hashCode();
    assertEquals(expectedHashCodeResult, ruleProcessorInitiatorImpl.hashCode());
  }

  @Test
  void testEquals3() {
    RuleProcessorInitiatorImpl<Object> ruleProcessorInitiatorImpl = new RuleProcessorInitiatorImpl<Object>(
        new ArrayList<RuleProcessorJoiningImpl<Object>>());
    RuleProcessorInitiatorImpl<Object> ruleProcessorInitiatorImpl1 = new RuleProcessorInitiatorImpl<Object>(
        new ArrayList<RuleProcessorJoiningImpl<Object>>());
    assertTrue(ruleProcessorInitiatorImpl.equals(ruleProcessorInitiatorImpl1));
    int expectedHashCodeResult = ruleProcessorInitiatorImpl.hashCode();
    assertEquals(expectedHashCodeResult, ruleProcessorInitiatorImpl1.hashCode());
  }

  @Test
  void testEquals4() {
    ArrayList<RuleProcessorJoiningImpl<Object>> ruleProcessorJoiningImplList = new ArrayList<RuleProcessorJoiningImpl<Object>>();
    ruleProcessorJoiningImplList.add(
        new RuleProcessorJoiningImpl<Object>(new ArrayList<RuleProcessor<Object>>()));
    RuleProcessorInitiatorImpl<Object> ruleProcessorInitiatorImpl = new RuleProcessorInitiatorImpl<Object>(
        ruleProcessorJoiningImplList);
    assertFalse(ruleProcessorInitiatorImpl
        .equals(new RuleProcessorInitiatorImpl<Object>(
            new ArrayList<RuleProcessorJoiningImpl<Object>>())));
  }

  @Test
  void testEquals5() {
    ArrayList<RuleProcessorJoiningImpl<Object>> ruleProcessorJoiningImplList = new ArrayList<RuleProcessorJoiningImpl<Object>>();
    ruleProcessorJoiningImplList.add(
        (RuleProcessorJoiningImpl<Object>) mock(RuleProcessorJoiningImpl.class));
    RuleProcessorInitiatorImpl<Object> ruleProcessorInitiatorImpl = new RuleProcessorInitiatorImpl<Object>(
        ruleProcessorJoiningImplList);

    ArrayList<RuleProcessorJoiningImpl<Object>> ruleProcessorJoiningImplList1 = new ArrayList<RuleProcessorJoiningImpl<Object>>();
    ruleProcessorJoiningImplList1.add(
        new RuleProcessorJoiningImpl<Object>(new ArrayList<RuleProcessor<Object>>()));
    assertFalse(
        ruleProcessorInitiatorImpl.equals(
            new RuleProcessorInitiatorImpl<Object>(ruleProcessorJoiningImplList1)));
  }
}

