package io.github.onograph.metrics.outgoing;

import com.codahale.metrics.MetricFilter;
import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.graphite.Graphite;
import com.codahale.metrics.graphite.GraphiteReporter;
import java.util.concurrent.TimeUnit;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.kernel.lifecycle.Lifecycle;
import org.neo4j.logging.Log;


public class CodehaleGraphite implements Lifecycle {


  private final Log gLog;


  private final long lgPro;


  private final MetricRegistry metricRegistry;


  private final SocketAddress socketAddress;


  private GraphiteReporter graphiteReporter;

  CodehaleGraphite(SocketAddress _socketAddress, long _lgPro, MetricRegistry _metricRegistry,
      Log _gLog) {
    this.gLog = _gLog;
    this.lgPro = _lgPro;
    this.metricRegistry = _metricRegistry;
    this.socketAddress = _socketAddress;
  }

  @Override
  public void init() {

    Graphite _graphite = new Graphite(this.socketAddress.getHostname(),
        this.socketAddress.getPort());
    this.graphiteReporter =
        GraphiteReporter.forRegistry(this.metricRegistry).convertRatesTo(TimeUnit.SECONDS)
            .convertDurationsTo(TimeUnit.MILLISECONDS)
            .filter(MetricFilter.ALL).build(_graphite);
  }

  @Override
  public void shutdown() {
    this.graphiteReporter = null;
  }

  @Override
  public void start() {
    this.graphiteReporter.start(this.lgPro, TimeUnit.MILLISECONDS);


  }

  @Override
  public void stop() {
    this.graphiteReporter.close();
  }
}
