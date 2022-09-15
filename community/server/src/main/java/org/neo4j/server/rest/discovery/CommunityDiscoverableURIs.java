/*
 * Copyright (c) 2018-2022 "Graph Foundation,"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB.
 *
 * ONgDB is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * Copyright (c) "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.server.rest.discovery;

import org.neo4j.configuration.Config;
import org.neo4j.configuration.connectors.ConnectorPortRegister;
import org.neo4j.procedure.builtin.routing.ClientRoutingDomainChecker;
import org.neo4j.server.configuration.ConfigurableServerModules;
import org.neo4j.server.configuration.ServerSettings;
import org.neo4j.server.http.cypher.CypherResource;

import static org.neo4j.server.http.cypher.CypherResource.absoluteDatabaseTransactionPath;

public class CommunityDiscoverableURIs
{
    /**
     * URIs exposed at the root HTTP endpoint, to help clients discover the rest of the service.
     */
    public static DiscoverableURIs communityDiscoverableURIs( Config config, ConnectorPortRegister portRegister,
                                                              ClientRoutingDomainChecker clientRoutingDomainChecker )
    {
        return communityDiscoverableURIsBuilder( config, portRegister, clientRoutingDomainChecker ).build();
    }

    public static DiscoverableURIs.Builder communityDiscoverableURIsBuilder( Config config, ConnectorPortRegister portRegister,
                                                                             ClientRoutingDomainChecker clientRoutingDomainChecker )
    {
        var builder = new DiscoverableURIs.Builder( clientRoutingDomainChecker );
        if ( config.get( ServerSettings.http_enabled_modules ).contains( ConfigurableServerModules.TRANSACTIONAL_ENDPOINTS ) )
        {
            builder = builder.addEndpoint( CypherResource.NAME, absoluteDatabaseTransactionPath( config ) );
        }
        return builder.addBoltEndpoint( config, portRegister );
    }
}
