package org.neo4j.server.enterprise;

import java.io.File;

import org.neo4j.graphdb.facade.GraphDatabaseFacadeFactory;
import org.neo4j.graphdb.facade.GraphDatabaseFacadeFactory.Dependencies;
import org.neo4j.kernel.configuration.Config;
import org.neo4j.kernel.impl.factory.DatabaseInfo;
import org.neo4j.kernel.impl.factory.GraphDatabaseFacade;

public class OpenEnterpriseGraphDatabaseFacade extends GraphDatabaseFacade
{
    public OpenEnterpriseGraphDatabaseFacade( File storeDir, Config config, Dependencies dependencies )
    {
        (new GraphDatabaseFacadeFactory( DatabaseInfo.ENTERPRISE, OpenEnterpriseEditionModule::new )).initFacade( storeDir, config, dependencies, this );
    }
}
