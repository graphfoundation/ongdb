package io.github.onograph.metrics.outgoing;

import io.prometheus.client.exporter.HTTPServer;
import java.io.IOException;
import java.net.InetSocketAddress;


class MetricsPrometheusServer extends HTTPServer {

  MetricsPrometheusServer(String hostNameOrIp, int portNumber) throws IOException {
    super(hostNameOrIp, portNumber, true);
  }


  InetSocketAddress gearsInetSocketAddress() {
    return this.server.getAddress();
  }
}
