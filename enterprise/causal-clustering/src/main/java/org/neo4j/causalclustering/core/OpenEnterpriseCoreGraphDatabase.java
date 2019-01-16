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

package org.neo4j.causalclustering.core;

import java.io.File;
import java.util.function.Function;

import org.neo4j.causalclustering.discovery.DiscoveryServiceFactory;
import org.neo4j.causalclustering.discovery.SecureHazelcastDiscoveryServiceFactory;
import org.neo4j.graphdb.facade.GraphDatabaseFacadeFactory;
import org.neo4j.graphdb.facade.GraphDatabaseFacadeFactory.Dependencies;
import org.neo4j.graphdb.factory.module.PlatformModule;
import org.neo4j.graphdb.factory.module.edition.AbstractEditionModule;
import org.neo4j.kernel.configuration.Config;
import org.neo4j.kernel.impl.factory.DatabaseInfo;

public class OpenEnterpriseCoreGraphDatabase extends CoreGraphDatabase
{
    /**
     * @param storeDir
     * @param config
     * @param dependencies
     */
    public OpenEnterpriseCoreGraphDatabase( File storeDir, Config config, Dependencies dependencies )
    {
        this( storeDir, config, dependencies, new SecureHazelcastDiscoveryServiceFactory() );
    }

    /**
     * @param storeDir
     * @param config
     * @param dependencies
     * @param discoveryServiceFactory
     */
    public OpenEnterpriseCoreGraphDatabase( File storeDir, Config config, Dependencies dependencies, DiscoveryServiceFactory discoveryServiceFactory )
    {
        Function<PlatformModule,AbstractEditionModule> factory =
                platformModule -> new OpenEnterpriseCoreEditionModule( platformModule, discoveryServiceFactory );

        (new GraphDatabaseFacadeFactory( DatabaseInfo.CORE, factory )).initFacade( storeDir, config, dependencies, this );
    }
}
