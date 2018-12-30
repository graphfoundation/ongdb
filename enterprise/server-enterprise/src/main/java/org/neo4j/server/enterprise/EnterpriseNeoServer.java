package org.neo4j.server.enterprise;

import org.neo4j.graphdb.facade.GraphDatabaseFacadeFactory.Dependencies;
import org.neo4j.kernel.configuration.Config;
import org.neo4j.server.database.GraphFactory;

//import org.neo4j.kernel.impl.factory.GraphDatabaseFacadeFactory.Dependencies;
//import org.neo4j.server.database.Database.Factory;
//import org.neo4j.server.database.LifecycleManagingDatabase.GraphFactory;

/**
 * See https://github.com/neo4j/neo4j/blob/3.2/enterprise/server-enterprise/src/main/java/org/neo4j/server/enterprise/EnterpriseNeoServer.java
 * <p>
 * https://github.com/neo4j/neo4j/blob/625e26f3f0a46a52085b5d65600c5521ca80a34d/community/server/src/main/java/org/neo4j/server/rest/management/VersionAndEditionService.java
 * We need to create our own and the class should be named EnterpriseNeoServer (See above.)
 */
public class EnterpriseNeoServer extends OpenEnterpriseNeoServer
{
    /**
     *
     * @param config
     * @param dependencies
     */
    public EnterpriseNeoServer( Config config, Dependencies dependencies )
    {
        super( config, new OpenEnterpriseGraphFactory(), dependencies );
    }

    /**
     *
     * @param config
     * @param graphFactory
     * @param dependencies
     */
    public EnterpriseNeoServer( Config config, GraphFactory graphFactory, Dependencies dependencies )
    {
        super( config, graphFactory, dependencies );
    }
}

