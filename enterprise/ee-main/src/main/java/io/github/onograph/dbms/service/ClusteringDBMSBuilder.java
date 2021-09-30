package io.github.onograph.dbms.service;

import io.github.onograph.cluster.raft.module.dprot.impl.ClusterDiscoveryManagerAkkaImpl;
import io.github.onograph.cluster.raft.readreplica.ReadReplicaModule;
import io.github.onograph.cluster.raft.share.CoreModule;
import java.io.File;
import java.nio.file.Path;
import java.util.Map;
import java.util.function.Function;
import org.neo4j.annotations.api.PublicApi;
import org.neo4j.common.DependencyResolver;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseInternalSettings;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.GraphDatabaseSettings.Mode;
import org.neo4j.graphdb.config.Setting;
import org.neo4j.graphdb.event.DatabaseEventListener;
import org.neo4j.graphdb.facade.ExternalDependencies;
import org.neo4j.graphdb.factory.module.GlobalModule;
import org.neo4j.graphdb.factory.module.edition.AbstractEditionModule;
import org.neo4j.graphdb.security.URLAccessRule;
import org.neo4j.io.ByteUnit;
import org.neo4j.kernel.impl.factory.DbmsInfo;
import org.neo4j.logging.LogProvider;
import org.neo4j.monitoring.Monitors;


@PublicApi
public class ClusteringDBMSBuilder extends DatabaseManagementServiceBuilderEnterpriseImpl {

  /**
   * @deprecated
   */
  @Deprecated(
      forRemoval = true
  )
  public ClusteringDBMSBuilder(File _dhFile) {
    this(_dhFile.toPath());
  }

  public ClusteringDBMSBuilder(Path _phPath) {
    super(_phPath);
  }


  private static Config _vaitcoiConfig(Config _config) {
    if (_config.get(GraphDatabaseSettings.memory_transaction_max_size) == 0L) {
      _config.set(GraphDatabaseSettings.memory_transaction_max_size, ByteUnit.gibiBytes(2L));
    }

    return _config;
  }

  @Override
  public ClusteringDBMSBuilder addDatabaseListener(DatabaseEventListener _databaseEventListener) {
    super.addDatabaseListener(_databaseEventListener);
    return this;
  }

  @Override
  public ClusteringDBMSBuilder addURLAccessRule(String _strPooo, URLAccessRule _uRLAccessRule) {
    super.addURLAccessRule(_strPooo, _uRLAccessRule);
    return this;
  }

  @Override
  protected Config augmentConfig(Config _config) {

    Config _agetdConfig = super.augmentConfig(_config);
    _agetdConfig.addListener(GraphDatabaseSettings.memory_transaction_max_size, (before, after) ->
    {
      _vaitcoiConfig(_agetdConfig);
    });
    return _vaitcoiConfig(_agetdConfig);
  }

  @Override
  public DatabaseManagementServiceClusterImpl build() {
    return (DatabaseManagementServiceClusterImpl) super.build();
  }

  @Override
  protected DbmsInfo getDbmsInfo(Config _config) {

    Mode mdstr = _config.get(GraphDatabaseSettings.mode);
    switch (mdstr) {
      case CORE:
        return DbmsInfo.CORE;
      case READ_REPLICA:
        return DbmsInfo.READ_REPLICA;
      default:

        throw new IllegalArgumentException("*** Error: c6437dda-6e30-467a-9717-21a54e6632ce");
    }
  }

  @Override
  protected Function<GlobalModule, AbstractEditionModule> getEditionFactory(Config _config) {

    Mode mdstr = _config.get(GraphDatabaseSettings.mode);
    switch (mdstr) {
      case CORE:
        return (globalModule) ->
        {
          return new CoreModule(new ClusterDiscoveryManagerAkkaImpl(), globalModule);
        };
      case READ_REPLICA:
        return (globalModule) ->
        {
          return new ReadReplicaModule(new ClusterDiscoveryManagerAkkaImpl(), globalModule);
        };
      default:

        throw new IllegalArgumentException("*** Error: 54d47ebb-36f7-442f-b4bc-0d59b10fd787");
    }
  }

  /**
   * @deprecated
   */
  @Override
  @Deprecated(
      forRemoval = true
  )
  public ClusteringDBMSBuilder loadPropertiesFromFile(String _strNf) {
    this.loadPropertiesFromFile(Path.of(_strNf));
    return this;
  }

  @Override
  public ClusteringDBMSBuilder loadPropertiesFromFile(Path _path) {
    super.loadPropertiesFromFile(_path);
    return this;
  }

  @Override
  protected DatabaseManagementServiceClusterImpl newDatabaseManagementService(Config _config,
      ExternalDependencies _externalDependencies) {
    _config.set(GraphDatabaseInternalSettings.ephemeral_lucene, Boolean.FALSE);
    return (new DatabaseManagementServiceFactoryClusteringImpl(this.getDbmsInfo(_config),
        this.getEditionFactory(_config)))
        .build(this.augmentConfig(_config), _externalDependencies);
  }

  @Override
  public <T> ClusteringDBMSBuilder setConfig(Setting<T> _settingStigT, T val) {
    super.setConfig(_settingStigT, val);
    return this;
  }

  @Override
  public ClusteringDBMSBuilder setConfig(Map<Setting<?>, Object> _mapCniso) {
    super.setConfig(_mapCniso);
    return this;
  }

  @Override
  public ClusteringDBMSBuilder setConfigRaw(Map<String, String> _mapRss) {
    super.setConfigRaw(_mapRss);
    return this;
  }

  @Override
  public ClusteringDBMSBuilder setExternalDependencies(
      DependencyResolver _dpnecDependencyResolver) {
    super.setExternalDependencies(_dpnecDependencyResolver);
    return this;
  }

  @Override
  public ClusteringDBMSBuilder setMonitors(Monitors _monitors) {
    super.setMonitors(_monitors);
    return this;
  }

  @Override
  public ClusteringDBMSBuilder setUserLogProvider(LogProvider _usLogProvider) {
    super.setUserLogProvider(_usLogProvider);
    return this;
  }
}
