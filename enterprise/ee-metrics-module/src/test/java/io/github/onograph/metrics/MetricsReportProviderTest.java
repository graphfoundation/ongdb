package io.github.onograph.metrics;

import static org.mockito.Mockito.mock;

import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.neo4j.adversaries.fs.AdversarialChannelDefaultFileSystemAbstraction;
import org.neo4j.configuration.Config;

class MetricsReportProviderTest {

  @Test
  void testConstructor() {

    new MetricsReportProvider();
  }

  @Test
  void testInit() {

    MetricsReportProvider metricsReportProvider = new MetricsReportProvider();
    metricsReportProvider.init(new AdversarialChannelDefaultFileSystemAbstraction(), " str Ndd",
        mock(Config.class),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
  }
}

