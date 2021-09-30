package io.github.onograph.metrics.outgoing;

import static org.mockito.Mockito.mock;

import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.MetricRegistryListener;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.configuration.helpers.SocketAddress;

class CodehaleGraphiteTest {

  @Test
  void testConstructor() {

    SocketAddress _socketAddress = new SocketAddress("localhost");
    MetricRegistry _metricRegistry = new MetricRegistry();
    new CodehaleGraphite(_socketAddress, 1L, _metricRegistry, new BufferingLog());
  }

  @Test
  void testConstructor2() {

    SocketAddress _socketAddress = new SocketAddress("localhost");
    MetricRegistry _metricRegistry = new MetricRegistry();
    new CodehaleGraphite(_socketAddress, 1L, _metricRegistry, new BufferingLog());
  }

  @Test
  void testInit() {

    SocketAddress _socketAddress = new SocketAddress("localhost", 8080);

    MetricRegistry _metricRegistry = new MetricRegistry();
    (new CodehaleGraphite(_socketAddress, 1L, _metricRegistry, new BufferingLog())).init();
  }

  @Test
  void testInit2() {

    SocketAddress _socketAddress = new SocketAddress("localhost", 8080);

    MetricRegistry _metricRegistry = new MetricRegistry();
    (new CodehaleGraphite(_socketAddress, 0L, _metricRegistry, new BufferingLog())).init();
  }

  @Test
  void testInit3() {

    MetricRegistry metricRegistry = new MetricRegistry();
    metricRegistry.addListener(mock(MetricRegistryListener.class));
    SocketAddress _socketAddress = new SocketAddress("localhost", 8080);

    (new CodehaleGraphite(_socketAddress, 1L, metricRegistry, new BufferingLog())).init();
  }
}

