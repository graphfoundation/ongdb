/*
 * Copyright (c) 2018-2020 "Graph Foundation,"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB Enterprise Edition. The included source
 * code can be redistributed and/or modified under the terms of the
 * GNU AFFERO GENERAL PUBLIC LICENSE Version 3
 * (http://www.fsf.org/licensing/licenses/agpl-3.0.html) as found
 * in the associated LICENSE.txt file.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 */
package org.neo4j.causalclustering.readreplica;

import java.io.File;
import java.util.UUID;
import java.util.function.Function;

import org.neo4j.causalclustering.discovery.DiscoveryServiceFactory;
import org.neo4j.causalclustering.discovery.HazelcastDiscoveryServiceFactory;
import org.neo4j.causalclustering.identity.MemberId;
import org.neo4j.kernel.configuration.Config;
import org.neo4j.kernel.impl.factory.DatabaseInfo;
import org.neo4j.kernel.impl.factory.EditionModule;
import org.neo4j.kernel.impl.factory.GraphDatabaseFacadeFactory;
import org.neo4j.kernel.impl.factory.GraphDatabaseFacadeFactory.Dependencies;
import org.neo4j.kernel.impl.factory.PlatformModule;

public class OpenEnterpriseReadReplicaGraphDatabase extends ReadReplicaGraphDatabase
{
    public OpenEnterpriseReadReplicaGraphDatabase( File storeDir, Config config, Dependencies dependencies )
    {
        this( storeDir, config, dependencies, new HazelcastDiscoveryServiceFactory(), new MemberId( UUID.randomUUID() ) );
    }

    public OpenEnterpriseReadReplicaGraphDatabase( File storeDir, Config config, Dependencies dependencies, DiscoveryServiceFactory discoveryServiceFactory,
                                                   MemberId memberId )
    {
        Function<PlatformModule,EditionModule> factory =
                platformModule -> new OpenEnterpriseReadReplicaEditionModule( platformModule, discoveryServiceFactory, memberId );

        (new GraphDatabaseFacadeFactory( DatabaseInfo.READ_REPLICA, factory )).initFacade( storeDir, config, dependencies, this );
    }
}

