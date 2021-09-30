package io.github.onograph.kernel.srv.pagecache;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ThreadFactory;
import org.junit.jupiter.api.Test;
import org.neo4j.adversaries.CountingAdversary;
import org.neo4j.adversaries.fs.AdversarialChannelDefaultFileSystemAbstraction;
import org.neo4j.adversaries.fs.AdversarialFileSystemAbstraction;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.configuration.Config;
import org.neo4j.dbms.database.DatabasePageCache;
import org.neo4j.io.pagecache.DelegatingPageCache;
import org.neo4j.io.pagecache.EmptyIOController;
import org.neo4j.kernel.monitoring.tracing.Tracers;
import org.neo4j.monitoring.Monitors;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.test.FakeClockJobScheduler;
import org.neo4j.time.SystemNanoClock;

class CachePopulatorTest {

  @Test
  void testConstructor() {

    AdversarialChannelDefaultFileSystemAbstraction _fFileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    FakeClockJobScheduler _jobScheduler = new FakeClockJobScheduler();
    BufferingLog _log = new BufferingLog();
    DelegatingPageCache _pageCache = new DelegatingPageCache(
        new DelegatingPageCache(new DelegatingPageCache(new DelegatingPageCache(null))));
    Path _pdPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    BufferingLog msgLog = new BufferingLog();
    Monitors monitors = new Monitors();
    new CachePopulator(null, _fFileSystemAbstraction, "Gdb Name", _jobScheduler, _log, _pageCache,
        _pdPath,
        new Tracers("Desired Implementation Name", msgLog, monitors, new FakeClockJobScheduler(),
            null, null));
  }

  @Test
  void testConstructor2() {

    AdversarialChannelDefaultFileSystemAbstraction _fFileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    FakeClockJobScheduler _jobScheduler = new FakeClockJobScheduler();
    BufferingLog _log = new BufferingLog();
    DelegatingPageCache _pageCache = new DelegatingPageCache(
        new DelegatingPageCache(new DelegatingPageCache(new DelegatingPageCache(null))));
    Path _pdPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    BufferingLog msgLog = new BufferingLog();
    Monitors monitors = new Monitors();
    new CachePopulator(null, _fFileSystemAbstraction, "Gdb Name", _jobScheduler, _log, _pageCache,
        _pdPath,
        new Tracers("Desired Implementation Name", msgLog, monitors, new FakeClockJobScheduler(),
            null, null));
  }

  @Test
  void test_prfeForPaPa() throws IOException {

    AdversarialChannelDefaultFileSystemAbstraction _fFileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    FakeClockJobScheduler _jobScheduler = new FakeClockJobScheduler();
    BufferingLog _log = new BufferingLog();
    DelegatingPageCache globalPageCache = new DelegatingPageCache(
        new DelegatingPageCache(new DelegatingPageCache(null)));
    DelegatingPageCache _pageCache = new DelegatingPageCache(
        new DelegatingPageCache(new DatabasePageCache(globalPageCache, new EmptyIOController())));
    Path _pdPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    BufferingLog msgLog = new BufferingLog();
    Monitors monitors = new Monitors();
    (new CachePopulator(null, _fFileSystemAbstraction, "Gdb Name", _jobScheduler, _log, _pageCache,
        _pdPath,
        new Tracers("Desired Implementation Name", msgLog, monitors, new FakeClockJobScheduler(),
            null, null)))
        ._prfeForPaPa();
  }

  @Test
  void test_prfeForPaPa2() throws IOException {

    AdversarialChannelDefaultFileSystemAbstraction _fFileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    FakeClockJobScheduler _jobScheduler = new FakeClockJobScheduler();
    BufferingLog _log = new BufferingLog();
    DelegatingPageCache globalPageCache = new DelegatingPageCache(
        new DelegatingPageCache(new DelegatingPageCache(null)));
    DelegatingPageCache _pageCache = new DelegatingPageCache(
        new DelegatingPageCache(new DatabasePageCache(globalPageCache, new EmptyIOController())));
    Path _pdPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    BufferingLog msgLog = new BufferingLog();
    Monitors monitors = new Monitors();
    (new CachePopulator(null, _fFileSystemAbstraction, "Gdb Name", _jobScheduler, _log, _pageCache,
        _pdPath,
        new Tracers("Desired Implementation Name", msgLog, monitors, new FakeClockJobScheduler(),
            null, null)))
        ._prfeForPaPa();
  }

  @Test
  void test_prfeForPaPa3() throws IOException {

    AdversarialChannelDefaultFileSystemAbstraction _fFileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    FakeClockJobScheduler _jobScheduler = new FakeClockJobScheduler();
    BufferingLog _log = new BufferingLog();
    DelegatingPageCache globalPageCache = new DelegatingPageCache(
        new DelegatingPageCache(new DelegatingPageCache(null)));
    DelegatingPageCache _pageCache = new DelegatingPageCache(
        new DelegatingPageCache(new DatabasePageCache(globalPageCache, new EmptyIOController())));
    Path _pdPath = Paths.get(System.getProperty("java.io.tmpdir"), "");
    BufferingLog msgLog = new BufferingLog();
    Monitors monitors = new Monitors();
    (new CachePopulator(null, _fFileSystemAbstraction, "Gdb Name", _jobScheduler, _log, _pageCache,
        _pdPath,
        new Tracers("Desired Implementation Name", msgLog, monitors, new FakeClockJobScheduler(),
            null, null)))
        ._prfeForPaPa();
  }

  @Test
  void test_prfeForPaPa4() throws IOException {

    AdversarialFileSystemAbstraction _fFileSystemAbstraction = new AdversarialFileSystemAbstraction(
        new CountingAdversary(0, true));
    FakeClockJobScheduler _jobScheduler = new FakeClockJobScheduler();
    BufferingLog _log = new BufferingLog();
    DelegatingPageCache globalPageCache = new DelegatingPageCache(
        new DelegatingPageCache(new DelegatingPageCache(null)));
    DelegatingPageCache _pageCache = new DelegatingPageCache(
        new DelegatingPageCache(new DatabasePageCache(globalPageCache, new EmptyIOController())));
    Path _pdPath = Paths.get(System.getProperty("java.io.tmpdir"), "");
    BufferingLog msgLog = new BufferingLog();
    Monitors monitors = new Monitors();
    (new CachePopulator(null, _fFileSystemAbstraction, "Gdb Name", _jobScheduler, _log, _pageCache,
        _pdPath,
        new Tracers("Desired Implementation Name", msgLog, monitors, new FakeClockJobScheduler(),
            null, null)))
        ._prfeForPaPa();
  }

  @Test
  void testKill() {

    AdversarialChannelDefaultFileSystemAbstraction _fFileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    FakeClockJobScheduler _jobScheduler = new FakeClockJobScheduler();
    BufferingLog _log = new BufferingLog();
    DelegatingPageCache _pageCache = new DelegatingPageCache(
        new DelegatingPageCache(new DelegatingPageCache(null)));
    Path _pdPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    BufferingLog msgLog = new BufferingLog();
    Monitors monitors = new Monitors();
    (new CachePopulator(null, _fFileSystemAbstraction, "Gdb Name", _jobScheduler, _log, _pageCache,
        _pdPath,
        new Tracers("Desired Implementation Name", msgLog, monitors, new FakeClockJobScheduler(),
            null, null))).kill();
  }

  @Test
  void testKill2() {

    AdversarialChannelDefaultFileSystemAbstraction _fFileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    FakeClockJobScheduler _jobScheduler = new FakeClockJobScheduler();
    BufferingLog _log = new BufferingLog();
    DelegatingPageCache _pageCache = new DelegatingPageCache(
        new DelegatingPageCache(new DelegatingPageCache(null)));
    Path _pdPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    BufferingLog msgLog = new BufferingLog();
    Monitors monitors = new Monitors();
    (new CachePopulator(null, _fFileSystemAbstraction, "Gdb Name", _jobScheduler, _log, _pageCache,
        _pdPath,
        new Tracers("Desired Implementation Name", msgLog, monitors, new FakeClockJobScheduler(),
            null, null))).kill();
  }

  @Test
  void testReeOptionalLong() throws IOException {
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any()))
        .thenThrow(new RuntimeException("An error occurred"));
    AdversarialChannelDefaultFileSystemAbstraction _fFileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    FakeClockJobScheduler _jobScheduler = new FakeClockJobScheduler();
    BufferingLog _log = new BufferingLog();
    DelegatingPageCache _pageCache = new DelegatingPageCache(
        new DelegatingPageCache(new DelegatingPageCache(null)));
    Path _pdPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    BufferingLog msgLog = new BufferingLog();
    Monitors monitors = new Monitors();
    assertThrows(RuntimeException.class,
        () -> (new CachePopulator(config, _fFileSystemAbstraction, "Gdb Name", _jobScheduler, _log,
            _pageCache, _pdPath,
            new Tracers("Desired Implementation Name", msgLog, monitors,
                new FakeClockJobScheduler(), null, null)))
            .reeOptionalLong());
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }

  @Test
  void testReeOptionalLong2() throws IOException {
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any()))
        .thenThrow(new RuntimeException("An error occurred"));
    AdversarialChannelDefaultFileSystemAbstraction _fFileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    FakeClockJobScheduler _jobScheduler = new FakeClockJobScheduler();
    BufferingLog _log = new BufferingLog();
    DelegatingPageCache _pageCache = new DelegatingPageCache(
        new DelegatingPageCache(new DelegatingPageCache(null)));
    Path _pdPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    BufferingLog msgLog = new BufferingLog();
    Monitors monitors = new Monitors();
    assertThrows(RuntimeException.class,
        () -> (new CachePopulator(config, _fFileSystemAbstraction, "Gdb Name", _jobScheduler, _log,
            _pageCache, _pdPath,
            new Tracers("Desired Implementation Name", msgLog, monitors,
                new FakeClockJobScheduler(), null, null)))
            .reeOptionalLong());
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }

  @Test
  void testStr() {

    JobScheduler jobScheduler = mock(JobScheduler.class);
    when(jobScheduler.threadFactory((org.neo4j.scheduler.Group) any())).thenReturn(
        mock(ThreadFactory.class));
    Config _config = mock(Config.class);
    AdversarialChannelDefaultFileSystemAbstraction _fFileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    BufferingLog _log = new BufferingLog();
    DelegatingPageCache _pageCache = new DelegatingPageCache(
        new DelegatingPageCache(new DelegatingPageCache(null)));
    Path _pdPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    BufferingLog msgLog = new BufferingLog();
    Monitors monitors = new Monitors();
    (new CachePopulator(_config, _fFileSystemAbstraction, "Gdb Name", jobScheduler, _log,
        _pageCache, _pdPath,
        new Tracers("Desired Implementation Name", msgLog, monitors, new FakeClockJobScheduler(),
            mock(SystemNanoClock.class), mock(Config.class)))).str();
  }

  @Test
  void testStr2() {

    JobScheduler jobScheduler = mock(JobScheduler.class);
    when(jobScheduler.threadFactory((org.neo4j.scheduler.Group) any())).thenReturn(
        mock(ThreadFactory.class));
    Config _config = mock(Config.class);
    AdversarialChannelDefaultFileSystemAbstraction _fFileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    BufferingLog _log = new BufferingLog();
    DelegatingPageCache _pageCache = new DelegatingPageCache(
        new DelegatingPageCache(new DelegatingPageCache(null)));
    Path _pdPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    BufferingLog msgLog = new BufferingLog();
    Monitors monitors = new Monitors();
    (new CachePopulator(_config, _fFileSystemAbstraction, "Gdb Name", jobScheduler, _log,
        _pageCache, _pdPath,
        new Tracers("Desired Implementation Name", msgLog, monitors, new FakeClockJobScheduler(),
            mock(SystemNanoClock.class), mock(Config.class)))).str();
  }
}

