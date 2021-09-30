package io.github.onograph.server.security.systemgraph;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import org.junit.jupiter.api.Test;

class SimpleAuthorizationInfoSystemImplTest {

  @Test
  void testConstructor() {
    assertEquals("Uname", (new SimpleAuthorizationInfoSystemImpl("Uname")).getUname());
    assertEquals("Uname",
        (new SimpleAuthorizationInfoSystemImpl(new HashSet<String>(), "Uname")).getUname());
  }
}

