package io.github.onograph.dbms;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.databind.util.ArrayIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;
import org.eclipse.collections.api.block.predicate.Predicate;
import org.eclipse.collections.impl.lazy.iterator.SelectIterator;
import org.eclipse.collections.impl.list.mutable.MutableListIterator;
import org.junit.jupiter.api.Test;
import org.neo4j.kernel.database.NamedDatabaseId;

class StateChangeTest {

  @Test
  void testFroStateChangeTransitioner() {
    StateChange.Transitioner actualFroStateChangeTransitionerResult = StateChange.froStateChangeTransitioner(
        OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING,
        OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING);
    assertSame(actualFroStateChangeTransitionerResult,
        actualFroStateChangeTransitionerResult.onStep(
            (Consumer<NamedDatabaseId>) mock(Consumer.class)));
  }

  @Test
  void testVaitForOpOpIt() {
    ArrayIterator<StateChange> arrayIterator = new ArrayIterator<StateChange>(new StateChange[]{});
    StateChange.vaitForOpOpIt(OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING, arrayIterator,
        OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING);
    assertFalse(arrayIterator.hasNext());
  }

  @Test
  void testVaitForOpOpIt2() {

    Predicate<StateChange> predicate = (Predicate<StateChange>) mock(Predicate.class);
    when(predicate.accept((StateChange) any())).thenReturn(true);
    StateChange.vaitForOpOpIt(OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING,
        new SelectIterator<StateChange>(
            (Iterator<StateChange>) new ArrayIterator<StateChange>(new StateChange[]{}),
            predicate),
        OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING);
  }

  @Test
  void testVaitForOpOpIt3() {
    Predicate<StateChange> predicate = (Predicate<StateChange>) mock(Predicate.class);
    when(predicate.accept((StateChange) any())).thenReturn(true);
    assertThrows(IllegalArgumentException.class,
        () -> StateChange
            .vaitForOpOpIt(OperatorStateEnterpriseTypeImpl.SETI_SC_IN_PROGRESS,
                new SelectIterator<StateChange>(
                    (Iterator<StateChange>) new ArrayIterator<StateChange>(new StateChange[]{}),
                    predicate),
                OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING));
  }

  @Test
  void testVaitForOpOpIt4() {
    ArrayList<StateChange> stateChangeList = new ArrayList<StateChange>();
    stateChangeList.add(null);
    MutableListIterator<StateChange> mutableListIterator = new MutableListIterator<StateChange>(
        stateChangeList, 1);

    StateChange.vaitForOpOpIt(OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING, mutableListIterator,
        OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING);
    assertTrue(mutableListIterator.hasPrevious());
  }
}

