/*
 * Copyright (c) 2019 "GraphFoundation" [https://graphfoundation.org]
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
package org.neo4j.causalclustering.readreplica;

import java.io.File;
import java.util.UUID;
import java.util.function.Function;

import org.neo4j.causalclustering.discovery.DiscoveryServiceFactory;
import org.neo4j.causalclustering.discovery.SecureDiscoveryServiceFactory;
import org.neo4j.causalclustering.identity.MemberId;
import org.neo4j.graphdb.facade.GraphDatabaseFacadeFactory;
import org.neo4j.graphdb.facade.GraphDatabaseFacadeFactory.Dependencies;
import org.neo4j.graphdb.factory.module.PlatformModule;
import org.neo4j.graphdb.factory.module.edition.AbstractEditionModule;
import org.neo4j.kernel.configuration.Config;
import org.neo4j.kernel.impl.factory.DatabaseInfo;

public class OpenEnterpriseReadReplicaGraphDatabase extends ReadReplicaGraphDatabase
{
    /**
     * @param storeDir
     * @param config
     * @param dependencies
     */
    public OpenEnterpriseReadReplicaGraphDatabase( File storeDir, Config config, Dependencies dependencies,
            SecureDiscoveryServiceFactory discoveryServiceFactory )
    {
        this( storeDir, config, dependencies, discoveryServiceFactory, new MemberId( UUID.randomUUID() ) );
    }

    /**
     * @param storeDir
     * @param config
     * @param dependencies
     * @param discoveryServiceFactory
     * @param memberId
     */
    public OpenEnterpriseReadReplicaGraphDatabase( File storeDir, Config config, Dependencies dependencies, DiscoveryServiceFactory discoveryServiceFactory,
            MemberId memberId )
    {
        Function<PlatformModule,AbstractEditionModule> factory =
                platformModule -> new OpenEnterpriseReadReplicaEditionModule( platformModule, discoveryServiceFactory, memberId );

        (new GraphDatabaseFacadeFactory( DatabaseInfo.READ_REPLICA, factory )).initFacade( storeDir, config, dependencies, this );
    }
}

