package io.github.onograph.fabric;

import static org.mockito.Mockito.mock;

import io.github.onograph.config.EnterpriseFabricConfiguration;
import io.github.onograph.fabric.security.AuthTokenService;
import io.github.onograph.fabric.service.FabricDriverServiceClusterImpl;
import io.github.onograph.fabric.service.PoolingLifecycleAdapter;
import java.util.ArrayList;
import java.util.HashSet;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.helpers.NormalizedDatabaseName;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.fabric.config.FabricConfig;
import org.neo4j.logging.Level;
import org.neo4j.ssl.config.SslPolicyLoader;
import org.neo4j.test.OnDemandJobScheduler;
import org.neo4j.time.Clocks;
import org.neo4j.time.FakeClock;

class FabricRemoteExecutorEnterpriseImplTest {

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

    FabricConfig.DataStream _dataStream1 = new FabricConfig.DataStream(1, 3, 3, 1);

    EnterpriseFabricConfiguration.DefaultDriverSettings defaultDriverSettings1 = new EnterpriseFabricConfiguration.DefaultDriverSettings(
        null, 1, null, null);

    EnterpriseFabricConfiguration.GdbRef gdbRef1 = new EnterpriseFabricConfiguration.GdbRef(null,
        null);

    FabricDriverServiceClusterImpl _fcdFabricDriverService = new FabricDriverServiceClusterImpl(
        new EnterpriseFabricConfiguration(_dataStream1, defaultDriverSettings1, gdbRef1, true, true,
            new ArrayList<SocketAddress>(), null, null),
        mock(Config.class), mock(SslPolicyLoader.class));

    new FabricRemoteExecutorEnterpriseImpl(
        new PoolingLifecycleAdapter(_clock, _enterpriseFabricConfiguration,
            _fcdFabricDriverService, new OnDemandJobScheduler(true),
            mock(AuthTokenService.class)));
  }

  @Test
  void testConstructor2() {

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

    FabricConfig.DataStream _dataStream1 = new FabricConfig.DataStream(1, 3, 3, 1);

    EnterpriseFabricConfiguration.DefaultDriverSettings defaultDriverSettings1 = new EnterpriseFabricConfiguration.DefaultDriverSettings(
        null, 1, null, null);

    EnterpriseFabricConfiguration.GdbRef gdbRef1 = new EnterpriseFabricConfiguration.GdbRef(null,
        null);

    FabricDriverServiceClusterImpl _fcdFabricDriverService = new FabricDriverServiceClusterImpl(
        new EnterpriseFabricConfiguration(_dataStream1, defaultDriverSettings1, gdbRef1, true, true,
            new ArrayList<SocketAddress>(), null, null),
        mock(Config.class), mock(SslPolicyLoader.class));

    new FabricRemoteExecutorEnterpriseImpl(
        new PoolingLifecycleAdapter(_clock, _enterpriseFabricConfiguration,
            _fcdFabricDriverService, new OnDemandJobScheduler(true),
            mock(AuthTokenService.class)));
  }
}

