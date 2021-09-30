package io.github.onograph.dbms.gdb;

import io.github.onograph.dbms.StructureMetaService;
import java.util.Map;
import org.neo4j.graphdb.config.Setting;
import org.neo4j.graphdb.factory.module.GlobalModule;
import org.neo4j.graphdb.factory.module.ModularDatabaseCreationContext;
import org.neo4j.graphdb.factory.module.edition.AbstractEditionModule;
import org.neo4j.kernel.database.Database;
import org.neo4j.kernel.database.NamedDatabaseId;


public class MultipleGdbDatabaseManagerEnterpriseImpl extends
    AbstractMultipleGdbDatabaseManager<DefaultStandaloneDatabaseContext> {


  private final StructureMetaService.Generator topologyPublisherGenerator;


  public MultipleGdbDatabaseManagerEnterpriseImpl(AbstractEditionModule _abstractEditionModule,
      GlobalModule _globalModule, StructureMetaService.Generator topologyPublisherGenerator) {
    super(_abstractEditionModule, _globalModule);
    this.topologyPublisherGenerator = topologyPublisherGenerator;
  }

  @Override
  protected DefaultStandaloneDatabaseContext createDatabaseContext(NamedDatabaseId _namedDatabaseId,
      Map<Setting<?>, Object> _mapSsdso) {

    ModularDatabaseCreationContext _modularDatabaseCreationContext =
        this.newDatabaseCreationContext(_namedDatabaseId, _mapSsdso,
            this.globalModule.getGlobalDependencies(),
            this.globalModule.getGlobalMonitors());

    Database _kreDatabase = new Database(_modularDatabaseCreationContext);

    Gdb gdb =
        Gdb.bulrGdbKernelDbComponentService(Gdb::new)
            .lifecycle(this.topologyPublisherGenerator.apply(_namedDatabaseId))
            .database(_kreDatabase).bul();
    return new DefaultStandaloneDatabaseContext(_kreDatabase, gdb);
  }
}
