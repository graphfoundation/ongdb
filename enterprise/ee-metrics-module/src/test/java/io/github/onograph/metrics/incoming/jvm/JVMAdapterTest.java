package io.github.onograph.metrics.incoming.jvm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class JVMAdapterTest {

  @Test
  void testPrtfnaString() {
    assertEquals("dr", JVMAdapter.prtfnaString("Dr"));
  }
}

