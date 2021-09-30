package io.github.onograph.dbms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.function.Function;
import org.junit.jupiter.api.Test;

class OperatorStateEnterpriseTypeImplTest {

  @Test
  void testDescription() {
    assertEquals("offline", OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING.description());
  }

  @Test
  void testMibotsaBinaryOperator() {
    Function<Object, OperatorStateEnterpriseTypeImpl> function = (Function<Object, OperatorStateEnterpriseTypeImpl>) mock(
        Function.class);
    when(function.apply((Object) any())).thenReturn(
        OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING);
    Object actualApplyResult = OperatorStateEnterpriseTypeImpl.<Object>mibotsaBinaryOperator(
            function)
        .apply("42", "42");
    verify(function, atLeast(1)).apply((Object) any());
    assertEquals("42", actualApplyResult);
  }

  @Test
  void testMibpdOperatorStateEnterpriseTypeImpl() {
    assertEquals(OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING,
        OperatorStateEnterpriseTypeImpl.mibpdOperatorStateEnterpriseTypeImpl(
            OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING,
            OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING));
    assertEquals(OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING,
        OperatorStateEnterpriseTypeImpl.mibpdOperatorStateEnterpriseTypeImpl(
            OperatorStateEnterpriseTypeImpl.SETI_SC_IN_PROGRESS,
            OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING));
  }

  @Test
  void testTerminal() {
    assertFalse(OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING.terminal());
    assertTrue(OperatorStateEnterpriseTypeImpl.SETI_D.terminal());
  }
}

