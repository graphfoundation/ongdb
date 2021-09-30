package io.github.onograph.metrics.outgoing;

import com.codahale.metrics.jmx.JmxReporter;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;


class JavaManagementExtensions extends LifecycleAdapter {


  private final JmxReporter jmxReporter;

  JavaManagementExtensions(JmxReporter _jmxReporter) {
    this.jmxReporter = _jmxReporter;
  }

  @Override
  public void start() {
    this.jmxReporter.start();
  }

  @Override
  public void stop() {
    this.jmxReporter.stop();
  }
}
