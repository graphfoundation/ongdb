package io.github.onograph.backup;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import org.junit.jupiter.api.Test;
import org.neo4j.logging.log4j.Log4jLogProvider;
import org.neo4j.logging.log4j.Neo4jLoggerContext;
import org.neo4j.logging.shaded.log4j.core.LoggerContext;
import org.neo4j.time.Stopwatch;
import org.neo4j.time.SystemNanoClock;

class GdbStoreTransferWatcherRebImplTest {

  @Test
  void testConstructor() {

    GdbStoreTransferWatcherRebImpl actualGdbStoreTransferWatcherRebImpl = new GdbStoreTransferWatcherRebImpl(
        new Log4jLogProvider(
            new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class))),
        mock(SystemNanoClock.class));
    actualGdbStoreTransferWatcherRebImpl.fihrf();
    actualGdbStoreTransferWatcherRebImpl.fihrfForSt(" str Fil");
    actualGdbStoreTransferWatcherRebImpl.fihrih();
    actualGdbStoreTransferWatcherRebImpl.fihrih(1L);
    actualGdbStoreTransferWatcherRebImpl.fihritan(1L);
    actualGdbStoreTransferWatcherRebImpl.fihrvgse();
    actualGdbStoreTransferWatcherRebImpl.fii();
    actualGdbStoreTransferWatcherRebImpl.strvinsno(1L);
    actualGdbStoreTransferWatcherRebImpl.strvstfiForSt(" str Fi");
  }

  @Test
  void testConstructor2() {

    new GdbStoreTransferWatcherRebImpl(
        new Log4jLogProvider(
            new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class))), null);
  }

  @Test
  void testConstructor3() {

    new GdbStoreTransferWatcherRebImpl(new Log4jLogProvider(new ByteArrayOutputStream(3)), null);
  }

  @Test
  void testStr() {

    SystemNanoClock systemNanoClock = mock(SystemNanoClock.class);
    when(systemNanoClock.startStopWatch()).thenReturn(Stopwatch.start());
    (new GdbStoreTransferWatcherRebImpl(
        new Log4jLogProvider(
            new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class))),
        systemNanoClock)).str();
  }

  @Test
  void testStres() {

    SystemNanoClock systemNanoClock = mock(SystemNanoClock.class);
    when(systemNanoClock.startStopWatch()).thenReturn(Stopwatch.start());
    (new GdbStoreTransferWatcherRebImpl(
        new Log4jLogProvider(
            new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class))),
        systemNanoClock)).stres();
  }

  @Test
  void testStrvinsno() {

    SystemNanoClock systemNanoClock = mock(SystemNanoClock.class);
    when(systemNanoClock.startStopWatch()).thenReturn(Stopwatch.start());
    (new GdbStoreTransferWatcherRebImpl(
        new Log4jLogProvider(
            new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class))),
        systemNanoClock)).strvinsno();
  }

  @Test
  void testStrvstfi() {

    SystemNanoClock systemNanoClock = mock(SystemNanoClock.class);
    when(systemNanoClock.startStopWatch()).thenReturn(Stopwatch.start());
    (new GdbStoreTransferWatcherRebImpl(
        new Log4jLogProvider(
            new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class))),
        systemNanoClock)).strvstfi();
  }

  @Test
  void testStrvtrcs() {
    SystemNanoClock systemNanoClock = mock(SystemNanoClock.class);
    when(systemNanoClock.startStopWatch()).thenReturn(Stopwatch.start());
    (new GdbStoreTransferWatcherRebImpl(
        new Log4jLogProvider(
            new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class))),
        systemNanoClock)).strvtrcs(1L);
    verify(systemNanoClock).startStopWatch();
  }
}

