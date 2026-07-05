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
package org.neo4j.server.database;

import java.io.File;

import org.neo4j.causalclustering.core.OpenEnterpriseCoreGraphDatabase;
import org.neo4j.causalclustering.readreplica.OpenEnterpriseReadReplicaGraphDatabase;
import org.neo4j.graphdb.facade.GraphDatabaseFacadeFactory.Dependencies;
import org.neo4j.graphdb.factory.GraphDatabaseSettings;
import org.neo4j.kernel.configuration.Config;
import org.neo4j.kernel.enterprise.EnterpriseGraphDatabase;
import org.neo4j.kernel.ha.HighlyAvailableGraphDatabase;
import org.neo4j.kernel.impl.enterprise.configuration.EnterpriseEditionSettings;
import org.neo4j.kernel.impl.enterprise.configuration.EnterpriseEditionSettings.Mode;
import org.neo4j.kernel.impl.factory.GraphDatabaseFacade;

public class EnterpriseGraphFactory implements GraphFactory
{
    @Override
    public GraphDatabaseFacade newGraphDatabase( Config config, Dependencies dependencies )
    {
        Mode mode = config.get( EnterpriseEditionSettings.mode );
        File storeDirectory = config.get( GraphDatabaseSettings.databases_root_path );

        switch ( mode )
        {
        case HA:
            return new HighlyAvailableGraphDatabase( storeDirectory, config, dependencies );
        case ARBITER:
            throw new IllegalArgumentException( "The server cannot be started in ARBITER mode." );
        case CORE:
            return new OpenEnterpriseCoreGraphDatabase( storeDirectory, config, dependencies );
        case READ_REPLICA:
            return new OpenEnterpriseReadReplicaGraphDatabase( storeDirectory, config, dependencies );
        default:
            return new EnterpriseGraphDatabase( storeDirectory, config, dependencies );
        }
    }
}
