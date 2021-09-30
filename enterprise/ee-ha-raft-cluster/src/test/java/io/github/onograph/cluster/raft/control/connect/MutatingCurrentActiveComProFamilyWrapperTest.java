package io.github.onograph.cluster.raft.control.connect;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class MutatingCurrentActiveComProFamilyWrapperTest {

  @Test
  void testConstructor() {
    MutatingCurrentActiveComProFamilyWrapper actualMutatingCurrentActiveComProFamilyWrapper = new MutatingCurrentActiveComProFamilyWrapper(
        null, new ArrayList<String>());

    assertNull(actualMutatingCurrentActiveComProFamilyWrapper.getComProFamilyGroupCtgrT());
    assertTrue(actualMutatingCurrentActiveComProFamilyWrapper.getListVrinU().isEmpty());
  }
}

