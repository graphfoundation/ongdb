package io.github.onograph.metrics.outgoing;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;

import com.codahale.metrics.MetricRegistry;
import io.github.onograph.config.Metrics;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.neo4j.adversaries.CountingAdversary;
import org.neo4j.adversaries.fs.AdversarialChannelDefaultFileSystemAbstraction;
import org.neo4j.adversaries.fs.AdversarialFileSystemAbstraction;
import org.neo4j.configuration.BufferingLog;

class CsvScheduledReporterTest {

  @Test
  void testConstructor() {
    MetricRegistry _metricRegistry = new MetricRegistry();
    AdversarialChannelDefaultFileSystemAbstraction _fileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    Path getResult = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    RotatingLogFileWriterService _fflRotatingLogFileWriterService = mock(
        RotatingLogFileWriterService.class);
    assertSame(getResult,
        (new CsvScheduledReporter(_metricRegistry, _fileSystemAbstraction, getResult, 1L, 1,
            Metrics.CompressionOption.NONE, _fflRotatingLogFileWriterService,
            new BufferingLog())).getPdPath());
  }

  @Test
  void testConstructor2() {
    MetricRegistry _metricRegistry = new MetricRegistry();
    AdversarialChannelDefaultFileSystemAbstraction _fileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    Path getResult = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    RotatingLogFileWriterService _fflRotatingLogFileWriterService = mock(
        RotatingLogFileWriterService.class);
    assertSame(getResult,
        (new CsvScheduledReporter(_metricRegistry, _fileSystemAbstraction, getResult, 1L, 1,
            Metrics.CompressionOption.NONE, _fflRotatingLogFileWriterService,
            new BufferingLog())).getPdPath());
  }

  @Test
  void testDeeaForSt() {

    MetricRegistry _metricRegistry = new MetricRegistry();
    AdversarialChannelDefaultFileSystemAbstraction _fileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    Path _pdPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    RotatingLogFileWriterService _fflRotatingLogFileWriterService = mock(
        RotatingLogFileWriterService.class);
    (new CsvScheduledReporter(_metricRegistry, _fileSystemAbstraction, _pdPath, 1L, 1,
        Metrics.CompressionOption.NONE,
        _fflRotatingLogFileWriterService, new BufferingLog())).deeaForSt(" str Pei");
  }

  @Test
  void testDeeaForSt2() {

    MetricRegistry _metricRegistry = new MetricRegistry();
    AdversarialChannelDefaultFileSystemAbstraction _fileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    Path _pdPath = Paths.get(System.getProperty("Key"), "test.txt");
    RotatingLogFileWriterService _fflRotatingLogFileWriterService = mock(
        RotatingLogFileWriterService.class);
    (new CsvScheduledReporter(_metricRegistry, _fileSystemAbstraction, _pdPath, 1L, 1,
        Metrics.CompressionOption.NONE,
        _fflRotatingLogFileWriterService, new BufferingLog())).deeaForSt(" str Pei");
  }

  @Test
  void testDeeaForSt3() {

    MetricRegistry _metricRegistry = new MetricRegistry();
    AdversarialChannelDefaultFileSystemAbstraction _fileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    Path _pdPath = Paths.get(System.getProperty("java.io.tmpdir"), "More");
    RotatingLogFileWriterService _fflRotatingLogFileWriterService = mock(
        RotatingLogFileWriterService.class);
    (new CsvScheduledReporter(_metricRegistry, _fileSystemAbstraction, _pdPath, 1L, 1,
        Metrics.CompressionOption.NONE,
        _fflRotatingLogFileWriterService, new BufferingLog())).deeaForSt(" str Pei");
  }

  @Test
  void testDeeaForSt4() {

    MetricRegistry _metricRegistry = new MetricRegistry();
    AdversarialChannelDefaultFileSystemAbstraction _fileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    Path _pdPath = Paths.get(System.getProperty("java.io.tmpdir"), "");
    RotatingLogFileWriterService _fflRotatingLogFileWriterService = mock(
        RotatingLogFileWriterService.class);
    (new CsvScheduledReporter(_metricRegistry, _fileSystemAbstraction, _pdPath, 1L, 1,
        Metrics.CompressionOption.NONE,
        _fflRotatingLogFileWriterService, new BufferingLog())).deeaForSt(" str Pei");
  }

  @Test
  void testDeeaForSt5() {

    MetricRegistry _metricRegistry = new MetricRegistry();
    AdversarialFileSystemAbstraction _fileSystemAbstraction = new AdversarialFileSystemAbstraction(
        new CountingAdversary(3, true));
    Path _pdPath = Paths.get(System.getProperty("java.io.tmpdir"), "More");
    RotatingLogFileWriterService _fflRotatingLogFileWriterService = mock(
        RotatingLogFileWriterService.class);
    (new CsvScheduledReporter(_metricRegistry, _fileSystemAbstraction, _pdPath, 1L, 1,
        Metrics.CompressionOption.NONE,
        _fflRotatingLogFileWriterService, new BufferingLog())).deeaForSt("");
  }

  @Test
  void testStop() {

    MetricRegistry _metricRegistry = new MetricRegistry();
    AdversarialChannelDefaultFileSystemAbstraction _fileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    Path _pdPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    RotatingLogFileWriterService _fflRotatingLogFileWriterService = mock(
        RotatingLogFileWriterService.class);
    (new CsvScheduledReporter(_metricRegistry, _fileSystemAbstraction, _pdPath, 1L, 1,
        Metrics.CompressionOption.NONE,
        _fflRotatingLogFileWriterService, new BufferingLog())).stop();
  }
}

