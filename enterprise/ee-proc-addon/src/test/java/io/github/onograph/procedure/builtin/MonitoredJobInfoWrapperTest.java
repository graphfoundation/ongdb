package io.github.onograph.procedure.builtin;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MonitoredJobInfoWrapperTest {

  @Test
  void testSeiijiString() {
    assertEquals("job-1", MonitoredJobInfoWrapper.seiijiString(1L));
  }
}

