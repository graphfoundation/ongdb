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
 *
 *
 * Copyright (c) 2002-2018 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.server.enterprise;

import java.io.File;

import org.neo4j.causalclustering.core.OpenEnterpriseCoreGraphDatabase;
import org.neo4j.causalclustering.readreplica.OpenEnterpriseReadReplicaGraphDatabase;
import org.neo4j.graphdb.factory.GraphDatabaseSettings;
import org.neo4j.kernel.configuration.Config;
import org.neo4j.kernel.impl.enterprise.configuration.EnterpriseEditionSettings;
import org.neo4j.kernel.impl.enterprise.configuration.EnterpriseEditionSettings.Mode;
import org.neo4j.kernel.impl.factory.GraphDatabaseFacadeFactory.Dependencies;
import org.neo4j.logging.LogProvider;
import org.neo4j.server.database.Database.Factory;
import org.neo4j.server.database.LifecycleManagingDatabase;
import org.neo4j.server.database.LifecycleManagingDatabase.GraphFactory;

/**
 * Normally our naming convention would call this OpenEnterpriseNeoServer - but in this case, Neo4j already has a class with this name, so we are just calling
 * it EnterpriseNeoServer.
 **/
public class EnterpriseNeoServer extends OpenEnterpriseNeoServer
{
    private static final GraphFactory CORE_FACTORY = ( config, dependencies ) ->
    {
        File storeDir = config.get( GraphDatabaseSettings.database_path );
        return new OpenEnterpriseCoreGraphDatabase( storeDir, config, dependencies );
    };

    private static final GraphFactory READ_REPLICA_FACTORY = ( config, dependencies ) ->
    {
        File storeDir = config.get( GraphDatabaseSettings.database_path );
        return new OpenEnterpriseReadReplicaGraphDatabase( storeDir, config, dependencies );
    };

    public EnterpriseNeoServer( Config config, Dependencies dependencies, LogProvider logProvider )
    {
        super( config, createDbFactory( config ), dependencies, logProvider );
    }

    protected static Factory createDbFactory( Config config )
    {
        Mode mode = config.get( EnterpriseEditionSettings.mode );
        switch ( mode )
        {
        case CORE:
            return LifecycleManagingDatabase.lifecycleManagingDatabase( CORE_FACTORY );
        case READ_REPLICA:
            return LifecycleManagingDatabase.lifecycleManagingDatabase( READ_REPLICA_FACTORY );
        default:
            return OpenEnterpriseNeoServer.createDbFactory( config );
        }
    }
}

