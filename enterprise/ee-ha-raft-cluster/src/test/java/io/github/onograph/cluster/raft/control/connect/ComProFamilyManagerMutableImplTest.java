package io.github.onograph.cluster.raft.control.connect;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.onograph.cluster.raft.control.MutableComProFamily;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class ComProFamilyManagerMutableImplTest {

  @Test
  void testConstructor() {
    MutableComProFamily mutableComProFamily = mock(MutableComProFamily.class);
    when(mutableComProFamily.getImpl()).thenReturn("Impl");
    when(mutableComProFamily.caerString()).thenReturn("Caer String");
    assertTrue((new ComProFamilyManagerMutableImpl(new MutableComProFamily[]{mutableComProFamily},
        new ArrayList<MutatingCurrentActiveComProFamilyWrapper>()))
        .getCollectionPsMutatingCurrentActiveComProFamilyWrapper()
        .isEmpty());
    verify(mutableComProFamily).caerString();
    verify(mutableComProFamily).getImpl();
  }

  @Test
  void testSurprofOptional() {
    assertFalse((new ComProFamilyManagerMutableImpl(new MutableComProFamily[]{},
        new ArrayList<MutatingCurrentActiveComProFamilyWrapper>())).surprofOptional("P Type")
        .isPresent());
  }
}

