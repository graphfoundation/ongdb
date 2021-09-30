package io.github.onograph.kernel.srv.pagecache;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.neo4j.adversaries.fs.AdversarialChannelDefaultFileSystemAbstraction;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.configuration.Config;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.pagecache.DelegatingPageCache;
import org.neo4j.kernel.availability.CompositeDatabaseAvailabilityGuard;
import org.neo4j.kernel.availability.DatabaseAvailabilityGuard;
import org.neo4j.kernel.database.Database;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.database.TestDatabaseIdRepository;
import org.neo4j.monitoring.Monitors;
import org.neo4j.test.FakeClockJobScheduler;

class PageCachePopulatorLifecycleAdapterTest {

  @Test
  void testConstructor() {

    Config _config = mock(Config.class);
    Database database = mock(Database.class);
    when(database.getDatabaseLayout()).thenReturn(mock(DatabaseLayout.class));
    when(database.getNamedDatabaseId()).thenReturn(
        TestDatabaseIdRepository.randomNamedDatabaseId());
    NamedDatabaseId namedDatabaseId = TestDatabaseIdRepository.randomNamedDatabaseId();
    FakeClockJobScheduler clock = new FakeClockJobScheduler();
    BufferingLog log = new BufferingLog();
    DatabaseAvailabilityGuard _databaseAvailabilityGuard = new DatabaseAvailabilityGuard(
        namedDatabaseId, clock, log,
        1L, new CompositeDatabaseAvailabilityGuard(
        new FakeClockJobScheduler()));

    AdversarialChannelDefaultFileSystemAbstraction _fFileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    FakeClockJobScheduler _jobScheduler = new FakeClockJobScheduler();
    BufferingLog _log = new BufferingLog();
    BasePageCacheLoadingWatcher _mntrPageCacheLoadingWatcher = new BasePageCacheLoadingWatcher();
    DelegatingPageCache _pageCache = new DelegatingPageCache(
        new DelegatingPageCache(new DelegatingPageCache(new DelegatingPageCache(null))));
    BufferingLog msgLog = new BufferingLog();
    Monitors monitors = new Monitors();
    //new PageCachePopulatorLifecycleAdapter( _config, database, _databaseAvailabilityGuard, _fFileSystemAbstraction,_jobScheduler, _log, _mntrPageCacheLoadingWatcher, _pageCache, new Tracers( "Desired Implementation Name",msgLog, monitors,new FakeClockJobScheduler(),mock( SystemNanoClock.class ),mock( Config.class )  );
  }
}

