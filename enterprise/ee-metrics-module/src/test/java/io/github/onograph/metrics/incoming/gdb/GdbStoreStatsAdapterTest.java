package io.github.onograph.metrics.incoming.gdb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.codahale.metrics.MetricRegistry;
import io.github.onograph.metrics.MetricRegistryManager;
import io.github.onograph.metrics.incoming.EnterpriseMetricsType;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.neo4j.adversaries.fs.AdversarialChannelDefaultFileSystemAbstraction;
import org.neo4j.configuration.helpers.GlobbingPattern;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.test.OnDemandJobScheduler;

class GdbStoreStatsAdapterTest {

  @Test
  void testConstructor() {
    assertEquals(EnterpriseMetricsType.EMT_GENERIC, (new GdbStoreStatsAdapter()).getGrp());
  }

  @Test
  void testConstructor2() {
    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    MetricRegistryManager _metricRegistryManager = new MetricRegistryManager(_listFmGlobbingPattern,
        new MetricRegistry());

    OnDemandJobScheduler _jobScheduler = new OnDemandJobScheduler(true);
    assertEquals(EnterpriseMetricsType.EMT_GENERIC,
        (new GdbStoreStatsAdapter("Mprnm", _metricRegistryManager,
            _jobScheduler, new AdversarialChannelDefaultFileSystemAbstraction(),
            null)).getGrp());
  }

  @Test
  void testConstructor3() {
    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    MetricRegistryManager _metricRegistryManager = new MetricRegistryManager(_listFmGlobbingPattern,
        new MetricRegistry());

    OnDemandJobScheduler _jobScheduler = new OnDemandJobScheduler(true);
    assertEquals(EnterpriseMetricsType.EMT_GENERIC,
        (new GdbStoreStatsAdapter("", _metricRegistryManager, _jobScheduler,
            new AdversarialChannelDefaultFileSystemAbstraction(), null)).getGrp());
  }

  @Test
  void testStart() {
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.getDatabaseName()).thenReturn("Database Name");
    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    MetricRegistryManager _metricRegistryManager = new MetricRegistryManager(_listFmGlobbingPattern,
        new MetricRegistry());

    OnDemandJobScheduler _jobScheduler = new OnDemandJobScheduler(true);
    (new GdbStoreStatsAdapter("Mprnm", _metricRegistryManager, _jobScheduler,
        new AdversarialChannelDefaultFileSystemAbstraction(), databaseLayout)).start();
    verify(databaseLayout).getDatabaseName();
  }

  @Test
  void testStart2() {
    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.getDatabaseName()).thenReturn("Database Name");
    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    MetricRegistryManager _metricRegistryManager = new MetricRegistryManager(_listFmGlobbingPattern,
        new MetricRegistry());

    OnDemandJobScheduler _jobScheduler = new OnDemandJobScheduler(true);
    (new GdbStoreStatsAdapter(
        "io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter.systemJob",
        _metricRegistryManager, _jobScheduler, new AdversarialChannelDefaultFileSystemAbstraction(),
        databaseLayout))
        .start();
    verify(databaseLayout).getDatabaseName();
  }

  @Test
  void testStart3() {
    ArrayList<GlobbingPattern> globbingPatternList = new ArrayList<GlobbingPattern>();
    globbingPatternList.add(new GlobbingPattern("Pattern"));
    MetricRegistryManager _metricRegistryManager = new MetricRegistryManager(globbingPatternList,
        new MetricRegistry());

    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.getDatabaseName()).thenReturn("Database Name");
    OnDemandJobScheduler _jobScheduler = new OnDemandJobScheduler(true);
    (new GdbStoreStatsAdapter("Mprnm", _metricRegistryManager, _jobScheduler,
        new AdversarialChannelDefaultFileSystemAbstraction(), databaseLayout)).start();
    verify(databaseLayout).getDatabaseName();
  }

  @Test
  void testStart4() {
    ArrayList<GlobbingPattern> globbingPatternList = new ArrayList<GlobbingPattern>();
    globbingPatternList.add(new GlobbingPattern("Pattern"));
    globbingPatternList.add(new GlobbingPattern("Pattern"));
    MetricRegistryManager _metricRegistryManager = new MetricRegistryManager(globbingPatternList,
        new MetricRegistry());

    DatabaseLayout databaseLayout = mock(DatabaseLayout.class);
    when(databaseLayout.getDatabaseName()).thenReturn("Database Name");
    OnDemandJobScheduler _jobScheduler = new OnDemandJobScheduler(true);
    (new GdbStoreStatsAdapter("Mprnm", _metricRegistryManager, _jobScheduler,
        new AdversarialChannelDefaultFileSystemAbstraction(), databaseLayout)).start();
    verify(databaseLayout).getDatabaseName();
  }

  @Test
  void testStop() {

    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    MetricRegistryManager _metricRegistryManager = new MetricRegistryManager(_listFmGlobbingPattern,
        new MetricRegistry());

    OnDemandJobScheduler _jobScheduler = new OnDemandJobScheduler(true);
    (new GdbStoreStatsAdapter("Mprnm", _metricRegistryManager, _jobScheduler,
        new AdversarialChannelDefaultFileSystemAbstraction(), null)).stop();
  }
}

