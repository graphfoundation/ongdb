package io.github.onograph.dbms.service;

import java.util.function.Function;
import org.neo4j.configuration.Config;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.graphdb.facade.DatabaseManagementServiceFactory;
import org.neo4j.graphdb.facade.ExternalDependencies;
import org.neo4j.graphdb.factory.module.GlobalModule;
import org.neo4j.graphdb.factory.module.edition.AbstractEditionModule;
import org.neo4j.kernel.impl.factory.DbmsInfo;
import org.neo4j.kernel.lifecycle.LifeSupport;
import org.neo4j.logging.Log;


public class DatabaseManagementServiceFactoryClusteringImpl extends
    DatabaseManagementServiceFactory {

  public DatabaseManagementServiceFactoryClusteringImpl(DbmsInfo _dbmsInfo,
      Function<GlobalModule, AbstractEditionModule> _functionFega) {
    super(_dbmsInfo, _functionFega);
  }

  @Override
  public DatabaseManagementServiceClusterImpl build(Config _config,
      ExternalDependencies _externalDependencies) {

    DatabaseManagementService _dbDatabaseManagementService = super.build(_config,
        _externalDependencies);
    return new DatabaseManagementServiceClusterImpl(_dbDatabaseManagementService);
  }

  @Override
  protected DatabaseManagementServiceClusterImpl createManagementService(GlobalModule _globalModule,
      LifeSupport _lgLifeSupport, Log _itraLog, DatabaseManager<?> _databaseManagerMdObject) {

    DatabaseManagementService _dlgtDatabaseManagementService =
        super.createManagementService(_globalModule, _lgLifeSupport, _itraLog,
            _databaseManagerMdObject);
    return new DatabaseManagementServiceClusterImpl(_dlgtDatabaseManagementService);
  }
}
