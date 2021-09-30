package io.github.onograph.fabric.service;

import static org.mockito.Mockito.mock;

import io.github.onograph.config.EnterpriseFabricConfiguration;
import io.github.onograph.fabric.security.AuthTokenService;
import java.util.ArrayList;
import java.util.HashSet;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.helpers.NormalizedDatabaseName;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.fabric.config.FabricConfig;
import org.neo4j.logging.Level;
import org.neo4j.test.OnDemandJobScheduler;
import org.neo4j.time.Clocks;
import org.neo4j.time.FakeClock;

class PoolingLifecycleAdapterTest {

  @Test
  void testConstructor() {

    FakeClock _clock = Clocks.fakeClock();
    FabricConfig.DataStream _dataStream = new FabricConfig.DataStream(1, 3, 3, 1);

    EnterpriseFabricConfiguration.DefaultDriverSettings defaultDriverSettings = new EnterpriseFabricConfiguration.DefaultDriverSettings(
        new EnterpriseFabricConfiguration.DriverSettings(GraphDatabaseSettings.DriverApi.RX, 1,
            true, null, Level.DEBUG,
            null, null, null),
        1, null, null);

    HashSet<EnterpriseFabricConfiguration.GdbWrapper> gdbWrappers = new HashSet<EnterpriseFabricConfiguration.GdbWrapper>();
    EnterpriseFabricConfiguration.GdbRef gdbRef = new EnterpriseFabricConfiguration.GdbRef(
        gdbWrappers,
        new NormalizedDatabaseName("Name"));

    EnterpriseFabricConfiguration _enterpriseFabricConfiguration = new EnterpriseFabricConfiguration(
        _dataStream,
        defaultDriverSettings, gdbRef, true, true,
        new ArrayList<SocketAddress>(), null, null);

    new PoolingLifecycleAdapter(_clock, _enterpriseFabricConfiguration, null,
        new OnDemandJobScheduler(true),
        mock(AuthTokenService.class));
  }
}

