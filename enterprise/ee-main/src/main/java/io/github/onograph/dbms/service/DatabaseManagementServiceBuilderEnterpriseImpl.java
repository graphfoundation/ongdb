package io.github.onograph.dbms.service;

import io.github.onograph.module.edition.DefaultEnterpriseModule;
import java.io.File;
import java.nio.file.Path;
import java.util.function.Function;
import org.neo4j.annotations.api.PublicApi;
import org.neo4j.common.Edition;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.GraphDatabaseSettings.Mode;
import org.neo4j.dbms.api.DatabaseManagementServiceBuilder;
import org.neo4j.graphdb.facade.ExternalDependencies;
import org.neo4j.graphdb.facade.GraphDatabaseDependencies;
import org.neo4j.graphdb.factory.module.GlobalModule;
import org.neo4j.graphdb.factory.module.edition.AbstractEditionModule;
import org.neo4j.kernel.impl.factory.DbmsInfo;


@PublicApi
public class DatabaseManagementServiceBuilderEnterpriseImpl extends
    DatabaseManagementServiceBuilder {

  /**
   * @deprecated
   */
  @Deprecated(
      forRemoval = true
  )
  public DatabaseManagementServiceBuilderEnterpriseImpl(File _dhFile) {
    this(_dhFile.toPath());
  }

  public DatabaseManagementServiceBuilderEnterpriseImpl(Path _phPath) {
    super(_phPath);
  }

  @Override
  protected ExternalDependencies databaseDependencies() {
    return GraphDatabaseDependencies.newDependencies().monitors(this.monitors)
        .userLogProvider(this.userLogProvider).dependencies(this.dependencies)
        .urlAccessRules(this.urlAccessRules).extensions(this.extensions)
        .databaseEventListeners(this.databaseEventListeners);
  }

  @Override
  protected DbmsInfo getDbmsInfo(Config _config) {

    Mode mdstr = _config.get(GraphDatabaseSettings.mode);
    if (mdstr == Mode.SINGLE) {
      return DbmsInfo.ENTERPRISE;
    } else {

      throw new IllegalArgumentException("*** Error: 99284795-3cf5-444d-8e43-794e25f29b29");
    }
  }

  @Override
  public String getEdition() {
    return Edition.ENTERPRISE.toString();
  }

  @Override
  protected Function<GlobalModule, AbstractEditionModule> getEditionFactory(Config _config) {

    Mode mdstr = _config.get(GraphDatabaseSettings.mode);
    if (mdstr == Mode.SINGLE) {
      return DefaultEnterpriseModule::new;
    } else {

      throw new IllegalArgumentException("*** Error: 535ec255-17bf-4de4-95a1-6d584fb470ac");
    }
  }
}
