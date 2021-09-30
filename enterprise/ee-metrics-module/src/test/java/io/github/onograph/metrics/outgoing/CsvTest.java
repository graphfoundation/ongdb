package io.github.onograph.metrics.outgoing;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.codahale.metrics.MetricRegistry;
import io.github.onograph.config.Metrics;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.neo4j.adversaries.fs.AdversarialChannelDefaultFileSystemAbstraction;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.configuration.Config;
import org.neo4j.io.fs.EphemeralFileSystemAbstraction;

class CsvTest {

  @Test
  void testConstructor() {

    Config _config = mock(Config.class);
    AdversarialChannelDefaultFileSystemAbstraction _fileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    BufferingLog _gLog = new BufferingLog();
    MetricRegistry _metricRegistry = new MetricRegistry();
    AdversarialChannelDefaultFileSystemAbstraction _fileSystemAbstraction1 = new AdversarialChannelDefaultFileSystemAbstraction();
    Path _pdPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    RotatingLogFileWriterService _fflRotatingLogFileWriterService = mock(
        RotatingLogFileWriterService.class);
    (new Csv(_config, _fileSystemAbstraction, _gLog,
        new CsvScheduledReporter(_metricRegistry, _fileSystemAbstraction1,
            _pdPath, 1L, 1, Metrics.CompressionOption.NONE,
            _fflRotatingLogFileWriterService, new BufferingLog())))
        .shutdown();
  }

  @Test
  void testInit() throws IOException {

    AdversarialChannelDefaultFileSystemAbstraction _fileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    BufferingLog _gLog = new BufferingLog();
    MetricRegistry _metricRegistry = new MetricRegistry();
    AdversarialChannelDefaultFileSystemAbstraction _fileSystemAbstraction1 = new AdversarialChannelDefaultFileSystemAbstraction();
    Path _pdPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    RotatingLogFileWriterService _fflRotatingLogFileWriterService = mock(
        RotatingLogFileWriterService.class);
    (new Csv(null, _fileSystemAbstraction, _gLog,
        new CsvScheduledReporter(_metricRegistry, _fileSystemAbstraction1,
            _pdPath, 1L, 1, Metrics.CompressionOption.NONE,
            _fflRotatingLogFileWriterService, new BufferingLog()))).init();
  }

  @Test
  void testInit2() throws IOException {

    EphemeralFileSystemAbstraction _fileSystemAbstraction = new EphemeralFileSystemAbstraction();
    BufferingLog _gLog = new BufferingLog();
    MetricRegistry _metricRegistry = new MetricRegistry();
    AdversarialChannelDefaultFileSystemAbstraction _fileSystemAbstraction1 = new AdversarialChannelDefaultFileSystemAbstraction();
    Path _pdPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    RotatingLogFileWriterService _fflRotatingLogFileWriterService = mock(
        RotatingLogFileWriterService.class);
    (new Csv(null, _fileSystemAbstraction, _gLog,
        new CsvScheduledReporter(_metricRegistry, _fileSystemAbstraction1,
            _pdPath, 1L, 1, Metrics.CompressionOption.NONE,
            _fflRotatingLogFileWriterService, new BufferingLog()))).init();
  }

  @Test
  void testStart() {
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenThrow(
        new IllegalStateException("foo"));
    AdversarialChannelDefaultFileSystemAbstraction _fileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    BufferingLog _gLog = new BufferingLog();
    MetricRegistry _metricRegistry = new MetricRegistry();
    AdversarialChannelDefaultFileSystemAbstraction _fileSystemAbstraction1 = new AdversarialChannelDefaultFileSystemAbstraction();
    Path _pdPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    RotatingLogFileWriterService _fflRotatingLogFileWriterService = mock(
        RotatingLogFileWriterService.class);
    assertThrows(IllegalStateException.class,
        () -> (new Csv(config, _fileSystemAbstraction, _gLog,
            new CsvScheduledReporter(_metricRegistry, _fileSystemAbstraction1, _pdPath, 1L, 1,
                Metrics.CompressionOption.NONE, _fflRotatingLogFileWriterService,
                new BufferingLog()))).start());
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }

  @Test
  void testStop() {

    AdversarialChannelDefaultFileSystemAbstraction _fileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    BufferingLog _gLog = new BufferingLog();
    MetricRegistry _metricRegistry = new MetricRegistry();
    AdversarialChannelDefaultFileSystemAbstraction _fileSystemAbstraction1 = new AdversarialChannelDefaultFileSystemAbstraction();
    Path _pdPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    RotatingLogFileWriterService _fflRotatingLogFileWriterService = mock(
        RotatingLogFileWriterService.class);
    (new Csv(null, _fileSystemAbstraction, _gLog,
        new CsvScheduledReporter(_metricRegistry, _fileSystemAbstraction1,
            _pdPath, 1L, 1, Metrics.CompressionOption.NONE,
            _fflRotatingLogFileWriterService, new BufferingLog()))).stop();
  }
}

