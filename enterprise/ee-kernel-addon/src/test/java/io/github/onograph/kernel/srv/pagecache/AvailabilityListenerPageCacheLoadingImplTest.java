package io.github.onograph.kernel.srv.pagecache;

import static org.mockito.Mockito.mock;

import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.neo4j.adversaries.fs.AdversarialChannelDefaultFileSystemAbstraction;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.configuration.Config;
import org.neo4j.io.pagecache.DelegatingPageCache;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.database.TestDatabaseIdRepository;
import org.neo4j.kernel.monitoring.tracing.Tracers;
import org.neo4j.monitoring.Monitors;
import org.neo4j.test.FakeClockJobScheduler;
import org.neo4j.test.OnDemandJobScheduler;
import org.neo4j.time.SystemNanoClock;

class AvailabilityListenerPageCacheLoadingImplTest {

  @Test
  void testConstructor() {

    Config _config = mock(Config.class);
    FakeClockJobScheduler _jobScheduler = new FakeClockJobScheduler();
    BufferingLog _log = new BufferingLog();
    BasePageCacheLoadingWatcher _mntrPageCacheLoadingWatcher = new BasePageCacheLoadingWatcher();
    NamedDatabaseId _namedDatabaseId = TestDatabaseIdRepository.randomNamedDatabaseId();
    Config _config1 = mock(Config.class);
    AdversarialChannelDefaultFileSystemAbstraction _fFileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    FakeClockJobScheduler _jobScheduler1 = new FakeClockJobScheduler();
    BufferingLog _log1 = new BufferingLog();
    DelegatingPageCache _pageCache = new DelegatingPageCache(
        new DelegatingPageCache(new DelegatingPageCache(null)));
    Path _pdPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    BufferingLog msgLog = new BufferingLog();
    Monitors monitors = new Monitors();
    new AvailabilityListenerPageCacheLoadingImpl(_config, _jobScheduler, _log,
        _mntrPageCacheLoadingWatcher,
        _namedDatabaseId,
        new CachePopulator(_config1, _fFileSystemAbstraction, "Gdb Name", _jobScheduler1, _log1,
            _pageCache,
            _pdPath,
            new Tracers("Desired Implementation Name", msgLog, monitors,
                new FakeClockJobScheduler(),
                mock(SystemNanoClock.class), mock(Config.class))));
  }

  @Test
  void testAvailable() {

    OnDemandJobScheduler _jobScheduler = new OnDemandJobScheduler(true);
    BufferingLog _log = new BufferingLog();
    BasePageCacheLoadingWatcher _mntrPageCacheLoadingWatcher = new BasePageCacheLoadingWatcher();
    NamedDatabaseId _namedDatabaseId = TestDatabaseIdRepository.randomNamedDatabaseId();
    AdversarialChannelDefaultFileSystemAbstraction _fFileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    FakeClockJobScheduler _jobScheduler1 = new FakeClockJobScheduler();
    BufferingLog _log1 = new BufferingLog();
    DelegatingPageCache _pageCache = new DelegatingPageCache(new DelegatingPageCache(null));
    Path _pdPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    BufferingLog msgLog = new BufferingLog();
    Monitors monitors = new Monitors();
    (new AvailabilityListenerPageCacheLoadingImpl(null, _jobScheduler, _log,
        _mntrPageCacheLoadingWatcher,
        _namedDatabaseId,
        new CachePopulator(null, _fFileSystemAbstraction, "Gdb Name", _jobScheduler1, _log1,
            _pageCache,
            _pdPath,
            new Tracers("Desired Implementation Name", msgLog, monitors,
                new FakeClockJobScheduler(), null, null))))
        .available();
  }

  @Test
  void testUnavailable() {

    FakeClockJobScheduler _jobScheduler = new FakeClockJobScheduler();
    BufferingLog _log = new BufferingLog();
    BasePageCacheLoadingWatcher _mntrPageCacheLoadingWatcher = new BasePageCacheLoadingWatcher();
    NamedDatabaseId _namedDatabaseId = TestDatabaseIdRepository.randomNamedDatabaseId();
    AdversarialChannelDefaultFileSystemAbstraction _fFileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    FakeClockJobScheduler _jobScheduler1 = new FakeClockJobScheduler();
    BufferingLog _log1 = new BufferingLog();
    DelegatingPageCache _pageCache = new DelegatingPageCache(new DelegatingPageCache(null));
    Path _pdPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    BufferingLog msgLog = new BufferingLog();
    Monitors monitors = new Monitors();
    (new AvailabilityListenerPageCacheLoadingImpl(null, _jobScheduler, _log,
        _mntrPageCacheLoadingWatcher,
        _namedDatabaseId,
        new CachePopulator(null, _fFileSystemAbstraction, "Gdb Name", _jobScheduler1, _log1,
            _pageCache,
            _pdPath,
            new Tracers("Desired Implementation Name", msgLog, monitors,
                new FakeClockJobScheduler(), null, null))))
        .unavailable();
  }
}

