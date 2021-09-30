package io.github.onograph.kernel.srv.log.query;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.nio.file.Paths;
import java.util.HashSet;
import org.junit.jupiter.api.Test;
import org.neo4j.adversaries.fs.AdversarialChannelDefaultFileSystemAbstraction;
import org.neo4j.configuration.Config;

class DiagnosticsOfflineReportProviderQueryLoggingImplTest {

  @Test
  void testConstructor() {

    new DiagnosticsOfflineReportProviderQueryLoggingImpl();
  }

  @Test
  void testInit() {

    DiagnosticsOfflineReportProviderQueryLoggingImpl diagnosticsOfflineReportProviderQueryLoggingImpl =
        new DiagnosticsOfflineReportProviderQueryLoggingImpl();
    diagnosticsOfflineReportProviderQueryLoggingImpl.init(
        new AdversarialChannelDefaultFileSystemAbstraction(),
        " str Ndd", mock(Config.class),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
  }

  @Test
  void testProvideSources() {
    DiagnosticsOfflineReportProviderQueryLoggingImpl diagnosticsOfflineReportProviderQueryLoggingImpl =
        new DiagnosticsOfflineReportProviderQueryLoggingImpl();
    assertTrue(
        diagnosticsOfflineReportProviderQueryLoggingImpl.provideSources(new HashSet<String>())
            .isEmpty());
  }
}

