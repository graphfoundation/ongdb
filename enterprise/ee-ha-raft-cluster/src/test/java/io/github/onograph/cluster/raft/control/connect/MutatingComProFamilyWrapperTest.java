package io.github.onograph.cluster.raft.control.connect;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import org.junit.jupiter.api.Test;

class MutatingComProFamilyWrapperTest {

  @Test
  void testConstructor() {
    MutatingComProFamilyWrapper actualMutatingComProFamilyWrapper = new MutatingComProFamilyWrapper(
        " str Ietfe",
        new HashSet<String>());

    assertTrue(actualMutatingComProFamilyWrapper.getSetVrinU().isEmpty());
    assertEquals(" str Ietfe", actualMutatingComProFamilyWrapper.getStrIetfe());
  }

  @Test
  void testConstructor2() {
    MutatingComProFamilyWrapper actualMutatingComProFamilyWrapper = new MutatingComProFamilyWrapper(
        "",
        new HashSet<String>());

    assertTrue(actualMutatingComProFamilyWrapper.getSetVrinU().isEmpty());
    assertEquals("", actualMutatingComProFamilyWrapper.getStrIetfe());
  }
}

