package io.github.onograph.metrics.incoming.gdb;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AbstractMemoryPoolsAdapterTest {

  @Test
  void testPrtfnaString() {
    assertEquals("Dr", AbstractMemoryPoolsAdapter.prtfnaString("Dr"));
  }
}

