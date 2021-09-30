package io.github.onograph.cluster.raft.control.connect;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.onograph.cluster.raft.control.ComProFamily;
import java.util.Comparator;
import org.eclipse.collections.impl.map.mutable.primitive.MutableShortDoubleMapFactoryImpl;
import org.junit.jupiter.api.Test;

class AbstractComProFamilyManagerTest {

  @Test
  void testVeonbcmtComparator() {
    Comparator<ComProFamily> actualVeonbcmtComparatorResult = AbstractComProFamilyManager
        .<MutableShortDoubleMapFactoryImpl, ComProFamily>veonbcmtComparator();
    ComProFamily<MutableShortDoubleMapFactoryImpl> comProFamily = (ComProFamily<MutableShortDoubleMapFactoryImpl>) mock(
        ComProFamily.class);
    when(comProFamily.getImpl()).thenReturn(MutableShortDoubleMapFactoryImpl.INSTANCE);
    ComProFamily<MutableShortDoubleMapFactoryImpl> comProFamily1 = (ComProFamily<MutableShortDoubleMapFactoryImpl>) mock(
        ComProFamily.class);
    when(comProFamily1.getImpl()).thenReturn(MutableShortDoubleMapFactoryImpl.INSTANCE);
    int actualCompareResult = actualVeonbcmtComparatorResult.compare(comProFamily, comProFamily1);
    verify(comProFamily).getImpl();
    verify(comProFamily1).getImpl();
    assertEquals(0, actualCompareResult);
  }
}

