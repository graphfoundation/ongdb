package io.github.onograph.cluster.raft.control.connect;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.github.onograph.config.EntProVer;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class ApplicationCurrentActiveComProFamilyWrapperTest {

  @Test
  void testAlkopolApplicationCurrentActiveComProFamilyWrapper() {
    ApplicationCurrentActiveComProFamilyWrapper actualAlkopolApplicationCurrentActiveComProFamilyWrapperResult = ApplicationCurrentActiveComProFamilyWrapper
        .alkopolApplicationCurrentActiveComProFamilyWrapper(null);
    assertNull(
        actualAlkopolApplicationCurrentActiveComProFamilyWrapperResult.getComProFamilyGroupCtgrT());
    assertTrue(
        actualAlkopolApplicationCurrentActiveComProFamilyWrapperResult.getListVrinU().isEmpty());
  }

  @Test
  void testFoptoApplicationCurrentActiveComProFamilyWrapper() {
    ApplicationCurrentActiveComProFamilyWrapper actualFoptoApplicationCurrentActiveComProFamilyWrapperResult = ApplicationCurrentActiveComProFamilyWrapper
        .foptoApplicationCurrentActiveComProFamilyWrapper(null, new ArrayList<EntProVer>());
    assertNull(
        actualFoptoApplicationCurrentActiveComProFamilyWrapperResult.getComProFamilyGroupCtgrT());
    assertTrue(
        actualFoptoApplicationCurrentActiveComProFamilyWrapperResult.getListVrinU().isEmpty());
  }
}

