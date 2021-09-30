package io.github.onograph.metrics.outgoing;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.codahale.metrics.MetricRegistry;
import io.github.onograph.config.Metrics;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.neo4j.adversaries.fs.AdversarialChannelDefaultFileSystemAbstraction;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.connectors.ConnectorPortRegister;
import org.neo4j.kernel.lifecycle.LifeSupport;

class ReportingServiceTest {

  @Test
  void testConstructor() {

    Config _config = mock(Config.class);
    ConnectorPortRegister _connectorPortRegister = new ConnectorPortRegister();
    MetricRegistry _metricRegistry = new MetricRegistry();
    AdversarialChannelDefaultFileSystemAbstraction _fileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    Path _pdPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    RotatingLogFileWriterService _fflRotatingLogFileWriterService = mock(
        RotatingLogFileWriterService.class);
    CsvScheduledReporter _crCsvScheduledReporter = new CsvScheduledReporter(_metricRegistry,
        _fileSystemAbstraction,
        _pdPath, 1L, 1, Metrics.CompressionOption.NONE,
        _fflRotatingLogFileWriterService, new BufferingLog());

    AdversarialChannelDefaultFileSystemAbstraction _fileSystemAbstraction1 = new AdversarialChannelDefaultFileSystemAbstraction();
    BufferingLog _gLog = new BufferingLog();
    LifeSupport _lifeSupport = new LifeSupport();
    new ReportingService(_config, _connectorPortRegister, _crCsvScheduledReporter,
        _fileSystemAbstraction1, _gLog,
        _lifeSupport, new MetricRegistry());
  }

  @Test
  void testIsCofu() {
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn(false);
    ConnectorPortRegister _connectorPortRegister = new ConnectorPortRegister();
    MetricRegistry _metricRegistry = new MetricRegistry();
    AdversarialChannelDefaultFileSystemAbstraction _fileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    Path _pdPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    RotatingLogFileWriterService _fflRotatingLogFileWriterService = mock(
        RotatingLogFileWriterService.class);
    CsvScheduledReporter _crCsvScheduledReporter = new CsvScheduledReporter(_metricRegistry,
        _fileSystemAbstraction,
        _pdPath, 1L, 1, Metrics.CompressionOption.NONE,
        _fflRotatingLogFileWriterService, new BufferingLog());

    AdversarialChannelDefaultFileSystemAbstraction _fileSystemAbstraction1 = new AdversarialChannelDefaultFileSystemAbstraction();
    BufferingLog _gLog = new BufferingLog();
    LifeSupport _lifeSupport = new LifeSupport();
    assertFalse((new ReportingService(config, _connectorPortRegister, _crCsvScheduledReporter,
        _fileSystemAbstraction1,
        _gLog, _lifeSupport, new MetricRegistry())).isCofu());
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }
}

