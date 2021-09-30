package io.github.onograph.fabric.service;

import io.github.onograph.config.EnterpriseFabricConfiguration;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings.DriverApi;
import org.neo4j.configuration.ssl.SslPolicyScope;
import org.neo4j.driver.internal.security.SecurityPlan;
import org.neo4j.driver.net.ServerAddress;
import org.neo4j.fabric.executor.Location.Remote;
import org.neo4j.ssl.config.SslPolicyLoader;


public class FabricDriverServiceDefaultImpl extends AbstractFabricDriverService {


  private final EnterpriseFabricConfiguration enterpriseFabricConfiguration;


  private final Map<Long, EnterpriseFabricConfiguration.GdbDriverSettings> mapCdgle;

  public FabricDriverServiceDefaultImpl(
      EnterpriseFabricConfiguration _enterpriseFabricConfiguration, Config _sreConfig,
      SslPolicyLoader _sslPolicyLoader) {
    super(_sreConfig, _sslPolicyLoader, SslPolicyScope.FABRIC);
    this.enterpriseFabricConfiguration = _enterpriseFabricConfiguration;
    if (_enterpriseFabricConfiguration.getGdbRef() != null) {
      this.mapCdgle = _enterpriseFabricConfiguration.getGdbRef().getGdbWrappers().stream()
          .filter((gdbWrapper) ->
          {
            return gdbWrapper.getCdGdbDriverSettings() != null;
          }).collect(
              Collectors.toMap(EnterpriseFabricConfiguration.GdbWrapper::getLgI,
                  EnterpriseFabricConfiguration.GdbWrapper::getCdGdbDriverSettings));
    } else {
      this.mapCdgle = Map.of();
    }
  }


  private <T> T _geppt(Function<EnterpriseFabricConfiguration.DriverSettings, T> _functionEtatret,
      Remote _lctoRemote) {

    EnterpriseFabricConfiguration.GdbDriverSettings _cdgGdbDriverSettings =
        this.mapCdgle.get(_lctoRemote.getGraphId());
    if (_cdgGdbDriverSettings != null) {

      T _tVc = _functionEtatret.apply(_cdgGdbDriverSettings);
      if (_tVc != null) {
        return _tVc;
      }
    }

    return _functionEtatret.apply(
        this.enterpriseFabricConfiguration.getDefaultDriverSettings().getDriverSettings());
  }

  @Override
  public org.neo4j.driver.Config cracfForLo(final Remote _lctoRemote) {

    org.neo4j.driver.Config.ConfigBuilder _configBuilder = this.prblcoiForAb(new ConfigAccessor() {
      @Override
      public <T> T getConf(
          Function<EnterpriseFabricConfiguration.DriverSettings, T> _functionEcdet) {
        return FabricDriverServiceDefaultImpl.this._geppt(_functionEcdet, _lctoRemote);
      }
    });

    Set<ServerAddress> _setAsServerAddress = _lctoRemote.getUri().getAddresses().stream()
        .map((address) ->
        {
          return ServerAddress
              .of(address.getHostname(), address.getPort());
        }).collect(Collectors.toSet());
    return _configBuilder.withResolver((mainAddress) ->
    {
      return _setAsServerAddress;
    }).build();
  }

  @Override
  public SecurityPlan cresrplForLo(Remote _lctoRemote) {

    EnterpriseFabricConfiguration.GdbDriverSettings _cdgGdbDriverSettings =
        this.mapCdgle.get(_lctoRemote.getGraphId());
    return this.cresrpl(_cdgGdbDriverSettings != null && !_cdgGdbDriverSettings.getIsEs());
  }

  @Override
  public DriverApi gedvaGraphDatabaseSettingsDriverApi(Remote _lctoRemote) {
    return this._geppt(EnterpriseFabricConfiguration.DriverSettings::getDriverApi, _lctoRemote);
  }
}
