package io.github.onograph.fabric.service;

import io.github.onograph.config.EnterpriseFabricConfiguration;
import java.util.function.Function;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings.DriverApi;
import org.neo4j.configuration.ssl.SslPolicyScope;
import org.neo4j.driver.internal.security.SecurityPlan;
import org.neo4j.fabric.executor.Location.Remote;
import org.neo4j.ssl.config.SslPolicyLoader;


public class FabricDriverServiceClusterImpl extends AbstractFabricDriverService {


  private final EnterpriseFabricConfiguration enterpriseFabricConfiguration;

  public FabricDriverServiceClusterImpl(
      EnterpriseFabricConfiguration _enterpriseFabricConfiguration, Config _sreConfig,
      SslPolicyLoader _sslPolicyLoader) {
    super(_sreConfig, _sslPolicyLoader, SslPolicyScope.CLUSTER);
    this.enterpriseFabricConfiguration = _enterpriseFabricConfiguration;
  }

  @Override
  public org.neo4j.driver.Config cracfForLo(Remote _lctoRemote) {

    org.neo4j.driver.Config.ConfigBuilder _configBuilder = this.prblcoiForAb(new ConfigAccessor() {
      @Override
      public <T> T getConf(
          Function<EnterpriseFabricConfiguration.DriverSettings, T> _functionEcdet) {
        return _functionEcdet.apply(
            FabricDriverServiceClusterImpl.this.enterpriseFabricConfiguration.getDefaultDriverSettings()
                .getDriverSettings());
      }
    });
    return _configBuilder.build();
  }

  @Override
  public SecurityPlan cresrplForLo(Remote _lctoRemote) {
    return this.cresrpl(false);
  }

  @Override
  public DriverApi gedvaGraphDatabaseSettingsDriverApi(Remote _lctoRemote) {
    return this.enterpriseFabricConfiguration.getDefaultDriverSettings().getDriverSettings()
        .getDriverApi();
  }
}
