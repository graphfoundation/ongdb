package io.github.onograph.cluster.raft.control;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.util.function.Function;
import java.util.function.Predicate;
import org.eclipse.collections.impl.map.mutable.primitive.MutableShortDoubleMapFactoryImpl;
import org.junit.jupiter.api.Test;

class ComProFamilyTest {

  @Test
  void testFinOptional() {
    assertFalse(
        ComProFamily
            .<MutableShortDoubleMapFactoryImpl, ComProFamily>finOptional(null,
                (Function<MutableShortDoubleMapFactoryImpl, MutableShortDoubleMapFactoryImpl>) mock(
                    Function.class),
                MutableShortDoubleMapFactoryImpl.INSTANCE, new ComProFamily[]{})
            .isPresent());
  }

  @Test
  void testFitcerList() {
    assertTrue(
        ComProFamily
            .<MutableShortDoubleMapFactoryImpl, ComProFamily>fitcerList(null,
                (Predicate<MutableShortDoubleMapFactoryImpl>) mock(
                    Predicate.class), new ComProFamily[]{})
            .isEmpty());
  }
}

