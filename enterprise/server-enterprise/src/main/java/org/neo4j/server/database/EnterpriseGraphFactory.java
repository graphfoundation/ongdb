/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
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

import org.neo4j.configuration.Config;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.enterprise.graphdb.factory.module.edition.EnterpriseEditionModule;
import org.neo4j.graphdb.facade.DatabaseManagementServiceFactory;
import org.neo4j.graphdb.facade.ExternalDependencies;
import org.neo4j.kernel.impl.enterprise.configuration.EnterpriseEditionSettings;
import org.neo4j.kernel.impl.factory.DatabaseInfo;

public class EnterpriseGraphFactory implements GraphFactory
{

    @Override
    public DatabaseManagementService newDatabaseManagementService( Config config, ExternalDependencies dependencies )
    {
        EnterpriseEditionSettings.Mode mode = config.get( EnterpriseEditionSettings.mode );
        return (new DatabaseManagementServiceFactory( DatabaseInfo.ENTERPRISE, EnterpriseEditionModule::new )).build( config, dependencies );
        /*switch ( mode )
        {
        case CORE:
            return (new CoreGraphDatabase( config, dependencies, newDiscoveryServiceFactory(), CoreEditionModule::new )).getManagementService();
        case READ_REPLICA:
            return (new ReadReplicaGraphDatabase( config, dependencies, newDiscoveryServiceFactory(), ReadReplicaEditionModule::new )).getManagementService();
        default:
            return (new DatabaseManagementServiceFactory( DatabaseInfo.ENTERPRISE, EnterpriseEditionModule::new )).build( config, dependencies );
        }

         */
    }
}
