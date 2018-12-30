package org.neo4j.server.enterprise;

import java.io.File;

import org.neo4j.causalclustering.core.OpenEnterpriseCoreGraphDatabase;
import org.neo4j.causalclustering.discovery.SecureDiscoveryServiceFactory;
import org.neo4j.causalclustering.readreplica.OpenEnterpriseReadReplicaGraphDatabase;
import org.neo4j.graphdb.facade.GraphDatabaseFacadeFactory.Dependencies;
import org.neo4j.graphdb.factory.GraphDatabaseSettings;
import org.neo4j.kernel.configuration.Config;
import org.neo4j.kernel.impl.enterprise.configuration.EnterpriseEditionSettings;
import org.neo4j.kernel.impl.enterprise.configuration.EnterpriseEditionSettings.Mode;
import org.neo4j.kernel.impl.factory.GraphDatabaseFacade;
import org.neo4j.server.database.EnterpriseGraphFactory;

public class OpenEnterpriseGraphFactory extends EnterpriseGraphFactory
{
    public GraphDatabaseFacade newGraphDatabase( Config config, Dependencies dependencies )
    {
        Mode mode = (Mode) config.get( EnterpriseEditionSettings.mode );
        File storeDir = (File) config.get( GraphDatabaseSettings.databases_root_path );
        SecureDiscoveryServiceFactory discoveryServiceFactory =
                (SecureDiscoveryServiceFactory) (new OpenEnterpriseDiscoveryServiceFactorySelector()).select( (Config) config );
        switch ( mode )
        {
        case CORE:
            return new OpenEnterpriseCoreGraphDatabase( storeDir, config, dependencies, discoveryServiceFactory );
        case READ_REPLICA:
            return new OpenEnterpriseReadReplicaGraphDatabase( storeDir, config, dependencies, discoveryServiceFactory );
        case SINGLE:
            return new OpenEnterpriseGraphDatabaseFacade( storeDir, config, dependencies );
        default:
            return super.newGraphDatabase( config, dependencies );
        }
    }
}
