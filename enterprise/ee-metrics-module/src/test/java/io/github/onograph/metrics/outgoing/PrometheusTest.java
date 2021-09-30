package io.github.onograph.metrics.outgoing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codahale.metrics.MetricRegistry;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.configuration.connectors.ConnectorPortRegister;
import org.neo4j.configuration.helpers.SocketAddress;

class PrometheusTest {

  @Test
  void testConstructor() {
    ConnectorPortRegister _connectorPortRegister = new ConnectorPortRegister();
    BufferingLog bufferingLog = new BufferingLog();
    MetricRegistry metricRegistry = new MetricRegistry();
    SocketAddress socketAddress = new SocketAddress("localhost");
    assertNull(
        (new Prometheus(_connectorPortRegister, bufferingLog, metricRegistry,
            socketAddress)).metricsPrometheusServer);
    assertTrue(bufferingLog.isDebugEnabled());
    assertTrue(metricRegistry.getCounters().isEmpty());
    assertTrue(metricRegistry.getTimers().isEmpty());
    assertTrue(metricRegistry.getNames().isEmpty());
    assertTrue(metricRegistry.getMetrics().isEmpty());
    assertTrue(metricRegistry.getMeters().isEmpty());
    assertTrue(metricRegistry.getHistograms().isEmpty());
    assertTrue(metricRegistry.getGauges().isEmpty());
    assertEquals("localhost", socketAddress.getHostname());
    assertEquals("localhost", socketAddress.toString());
    assertFalse(socketAddress.isIPv6());
    assertEquals(-1, socketAddress.getPort());
  }

  @Test
  void testInit() {

    ConnectorPortRegister _connectorPortRegister = new ConnectorPortRegister();
    BufferingLog _gLog = new BufferingLog();
    MetricRegistry _metricRegistry = new MetricRegistry();
    (new Prometheus(_connectorPortRegister, _gLog, _metricRegistry,
        new SocketAddress("localhost"))).init();
  }

  @Test
  void testShutdown() {
    ConnectorPortRegister _connectorPortRegister = new ConnectorPortRegister();
    BufferingLog _gLog = new BufferingLog();
    MetricRegistry _metricRegistry = new MetricRegistry();
    Prometheus prometheus = new Prometheus(_connectorPortRegister, _gLog, _metricRegistry,
        new SocketAddress("localhost"));
    prometheus.shutdown();
    assertNull(prometheus.metricsPrometheusServer);
  }

  @Test
  void testStop() {
    ConnectorPortRegister _connectorPortRegister = new ConnectorPortRegister();
    BufferingLog _gLog = new BufferingLog();
    MetricRegistry _metricRegistry = new MetricRegistry();
    Prometheus prometheus = new Prometheus(_connectorPortRegister, _gLog, _metricRegistry,
        new SocketAddress("localhost"));
    prometheus.stop();
    assertNull(prometheus.metricsPrometheusServer);
  }
}

