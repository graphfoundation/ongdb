package io.github.onograph.server.security;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.nio.file.Paths;
import java.util.HashSet;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.Config;
import org.neo4j.io.fs.DefaultFileSystemAbstraction;

class DiagnosticsOfflineReportProviderEnterpriseImplTest {

  @Test
  void testConstructor() {

    new DiagnosticsOfflineReportProviderEnterpriseImpl();
  }

  @Test
  void testInit() {

    DiagnosticsOfflineReportProviderEnterpriseImpl diagnosticsOfflineReportProviderEnterpriseImpl = new DiagnosticsOfflineReportProviderEnterpriseImpl();
    diagnosticsOfflineReportProviderEnterpriseImpl.init(new DefaultFileSystemAbstraction(),
        " str Ndd",
        mock(Config.class), Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
  }

  @Test
  void testProvideSources() {
    DiagnosticsOfflineReportProviderEnterpriseImpl diagnosticsOfflineReportProviderEnterpriseImpl = new DiagnosticsOfflineReportProviderEnterpriseImpl();
    assertTrue(diagnosticsOfflineReportProviderEnterpriseImpl.provideSources(new HashSet<String>())
        .isEmpty());
  }
}

