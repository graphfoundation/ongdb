/*
 * Copyright (c) 2002-2018 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * Modifications Copyright (c) 2018-2019 "GraphFoundation" [https://graphfoundation.org]
 *
 * The included source code can be redistributed and/or modified under the terms of the
 * GNU AFFERO GENERAL PUBLIC LICENSE Version 3
 * (http://www.fsf.org/licensing/licenses/agpl-3.0.html)
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 */
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
