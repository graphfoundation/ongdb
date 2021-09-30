package io.github.onograph.kernel.trace;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EnterpriseTracerFactoryTest {

  @Test
  void testConstructor() {
    assertEquals("verbose", (new EnterpriseTracerFactory()).getName());
  }
}

