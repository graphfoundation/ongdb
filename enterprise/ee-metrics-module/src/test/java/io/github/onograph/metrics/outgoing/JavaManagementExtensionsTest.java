package io.github.onograph.metrics.outgoing;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;

import com.codahale.metrics.jmx.JmxReporter;
import org.junit.jupiter.api.Test;

class JavaManagementExtensionsTest {

  @Test
  void testConstructor() {

    new JavaManagementExtensions(mock(JmxReporter.class));
  }

  @Test
  void testStart() {

    JmxReporter jmxReporter = mock(JmxReporter.class);
    doNothing().when(jmxReporter).start();
    (new JavaManagementExtensions(jmxReporter)).start();
  }

  @Test
  void testStop() {

    JmxReporter jmxReporter = mock(JmxReporter.class);
    doNothing().when(jmxReporter).stop();
    (new JavaManagementExtensions(jmxReporter)).stop();
  }
}

