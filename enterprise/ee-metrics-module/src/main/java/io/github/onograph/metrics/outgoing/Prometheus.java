package io.github.onograph.metrics.outgoing;

import com.codahale.metrics.MetricRegistry;
import io.prometheus.client.CollectorRegistry;
import io.prometheus.client.dropwizard.DropwizardExports;
import org.neo4j.configuration.connectors.ConnectorPortRegister;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.kernel.lifecycle.Lifecycle;
import org.neo4j.logging.Log;


public class Prometheus implements Lifecycle {


  private final ConnectorPortRegister connectorPortRegister;


  private final Log gLog;


  private final MetricRegistry metricRegistry;


  private final MetricRegistry reMetricRegistry;


  private final SocketAddress socketAddress;


  protected MetricsPrometheusServer metricsPrometheusServer;


  Prometheus(ConnectorPortRegister _connectorPortRegister, Log _gLog,
      MetricRegistry _metricRegistry, SocketAddress _socketAddress) {
    this.socketAddress = _socketAddress;
    this.metricRegistry = _metricRegistry;
    this.gLog = _gLog;
    this.connectorPortRegister = _connectorPortRegister;
    this.reMetricRegistry = new MetricRegistry();
  }

  @Override
  public void init() {
    CollectorRegistry.defaultRegistry.register(new DropwizardExports(this.metricRegistry));
    CollectorRegistry.defaultRegistry.register(new DropwizardExports(this.reMetricRegistry));
  }

  @Override
  public void shutdown() {
    this.stop();
  }

  @Override
  public void start() throws Exception {
    if (this.metricsPrometheusServer == null) {
      this.metricsPrometheusServer = new MetricsPrometheusServer(this.socketAddress.getHostname(),
          this.socketAddress.getPort());
      this.connectorPortRegister.register(io.github.onograph.TokenConstants.PROMETHEUS,
          this.metricsPrometheusServer.gearsInetSocketAddress());


    }
  }

  @Override
  public void stop() {
    if (this.metricsPrometheusServer != null) {

      String _strAdes = this.metricsPrometheusServer.gearsInetSocketAddress().toString();
      this.metricsPrometheusServer.stop();
      this.metricsPrometheusServer = null;


    }
  }
}
