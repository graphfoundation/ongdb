package io.github.onograph.cluster.raft.control.connect;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.github.onograph.config.EntProVer;
import java.util.HashSet;
import org.junit.jupiter.api.Test;

class ApplicationAbstractComProFamilyWrapperTest {

  @Test
  void testConstructor() {
    ApplicationAbstractComProFamilyWrapper actualApplicationAbstractComProFamilyWrapper = new ApplicationAbstractComProFamilyWrapper(
        " str Ietfe", new HashSet<EntProVer>());

    assertTrue(actualApplicationAbstractComProFamilyWrapper.getSetVrinU().isEmpty());
    assertEquals(" str Ietfe", actualApplicationAbstractComProFamilyWrapper.getStrIetfe());
  }
}

