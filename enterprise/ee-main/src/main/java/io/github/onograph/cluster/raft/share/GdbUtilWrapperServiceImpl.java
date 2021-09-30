package io.github.onograph.cluster.raft.share;

import io.github.onograph.cluster.raft.utils.GdbUtilWrapper;
import io.github.onograph.cluster.raft.utils.GdbUtilWrapperService;
import io.github.onograph.config.Backup;
import io.github.onograph.config.Metrics;
import io.github.onograph.config.Security;
import io.github.onograph.dbms.service.DatabaseManagementServiceBuilderEnterpriseImpl;
import java.nio.file.Path;
import org.neo4j.collection.Dependencies;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseInternalSettings;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.dbms.DatabaseManagementSystemSettings;
import org.neo4j.dbms.api.DatabaseManagementServiceBuilder;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.pagecache.ExternallyManagedPageCache;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.logging.NullLogProvider;


public class GdbUtilWrapperServiceImpl implements GdbUtilWrapperService {


  private final FileSystemAbstraction fileSystemAbstraction;


  private final PageCache pageCache;


  public GdbUtilWrapperServiceImpl(FileSystemAbstraction _fileSystemAbstraction,
      PageCache _pageCache) {
    this.fileSystemAbstraction = _fileSystemAbstraction;
    this.pageCache = _pageCache;
  }


  private static void _aumtcngForDaCoPa(
      DatabaseManagementServiceBuilder _databaseManagementServiceBuilder, boolean _isSi,
      Config _oiiaConfig, Path _prPath) {
    _databaseManagementServiceBuilder.setConfig(GraphDatabaseSettings.record_format,
        _oiiaConfig.get(GraphDatabaseSettings.record_format));
    _databaseManagementServiceBuilder.setConfig(GraphDatabaseInternalSettings.databases_root_path,
        _prPath.toAbsolutePath());
    _databaseManagementServiceBuilder.setConfig(GraphDatabaseSettings.transaction_logs_root_path,
        _prPath.toAbsolutePath());
    _databaseManagementServiceBuilder.setConfig(GraphDatabaseSettings.pagecache_warmup_enabled,
        false);
    _databaseManagementServiceBuilder.setConfig(Backup.settingOneubBoolean, false);
    _databaseManagementServiceBuilder.setConfig(Metrics.settingMersaeBoolean, false);
    _databaseManagementServiceBuilder.setConfig(Metrics.settingCsebdBoolean, false);
    _databaseManagementServiceBuilder.setConfig(
        GraphDatabaseSettings.allow_single_automatic_upgrade, false);
    if (_oiiaConfig.isExplicitlySet(GraphDatabaseInternalSettings.system_init_file)) {
      _databaseManagementServiceBuilder
          .setConfig(GraphDatabaseInternalSettings.system_init_file,
              _oiiaConfig.get(GraphDatabaseInternalSettings.system_init_file));
    }

    _databaseManagementServiceBuilder.setConfig(Security.settingSeignPath,
        _oiiaConfig.get(Security.settingSeignPath));
    _databaseManagementServiceBuilder.setConfig(
        DatabaseManagementSystemSettings.auth_store_directory,
        _oiiaConfig.get(DatabaseManagementSystemSettings.auth_store_directory));
    if (_oiiaConfig.isExplicitlySet(GraphDatabaseInternalSettings.auth_store)) {
      _databaseManagementServiceBuilder
          .setConfig(GraphDatabaseInternalSettings.auth_store,
              _oiiaConfig.get(GraphDatabaseInternalSettings.auth_store));
    }

    if (_isSi) {
      _databaseManagementServiceBuilder.setConfig(GraphDatabaseSettings.default_database,
          _oiiaConfig.get(GraphDatabaseSettings.default_database));
    }
  }

  @Override
  public GdbUtilWrapper sttrdasGdbUtilWrapper(Config _oiiaConfig, boolean _isSi, Path _rpPath) {

    Dependencies _dependencies = new Dependencies();
    _dependencies.satisfyDependency(new ExternallyManagedPageCache(this.pageCache));
    _dependencies.satisfyDependency(this.fileSystemAbstraction);

    DatabaseManagementServiceBuilder _databaseManagementServiceBuilder =
        (new DatabaseManagementServiceBuilderEnterpriseImpl(_rpPath)).setUserLogProvider(
                NullLogProvider.getInstance())
            .setExternalDependencies(_dependencies);
    _aumtcngForDaCoPa(_databaseManagementServiceBuilder, _isSi, _oiiaConfig, _rpPath);
    return new GdbUtilWrapper(_databaseManagementServiceBuilder.build(), _isSi);
  }
}
