/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
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
package org.neo4j.server.rest;

import org.neo4j.configuration.Config;
import org.neo4j.configuration.connectors.ConnectorPortRegister;
import org.neo4j.kernel.impl.enterprise.configuration.EnterpriseEditionSettings;
import org.neo4j.server.rest.discovery.CommunityDiscoverableURIs;
import org.neo4j.server.rest.discovery.DiscoverableURIs;
import org.neo4j.server.rest.discovery.DiscoverableURIs.Builder;

public class EnterpriseDiscoverableURIs
{
    public static DiscoverableURIs enterpriseDiscoverableURIs( Config config, ConnectorPortRegister portRegister )
    {
        Builder discoverableURIsBuilder = CommunityDiscoverableURIs.communityDiscoverableURIsBuilder( config, portRegister );
        EnterpriseEditionSettings.Mode mode = (EnterpriseEditionSettings.Mode) config.get( EnterpriseEditionSettings.mode );
        if ( mode == EnterpriseEditionSettings.Mode.CORE || mode == EnterpriseEditionSettings.Mode.READ_REPLICA )
        {
            // discoverableURIsBuilder.addEndpoint( "cluster", CausalClusteringService.absoluteDatabaseClusterPath( config ) );
        }

        return discoverableURIsBuilder.build();
    }
}
