/*
 * Copyright (c) 2018-2019 "GraphFoundation" [https://graphfoundation.org]
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

import org.neo4j.causalclustering.discovery.DiscoveryServiceFactorySelector;
import org.neo4j.causalclustering.discovery.SecureDiscoveryServiceFactory;
import org.neo4j.causalclustering.discovery.SecureHazelcastDiscoveryServiceFactory;

/**
 * In order to use the new SecureDiscoveryServiceFactory interface we created, we need to extend DiscoveryServiceFactorySelector.
 * The naming convention we are following is to append OpenEnterprise to the base class.
 */
public class OpenEnterpriseDiscoveryServiceFactorySelector extends DiscoveryServiceFactorySelector
{
    protected SecureDiscoveryServiceFactory select( DiscoveryImplementation middleware )
    {
        switch ( middleware )
        {
        case HAZELCAST:
            return new SecureHazelcastDiscoveryServiceFactory();
        // Add others in the future.
        default:
            throw new IllegalArgumentException(
                    "SecureDiscoveryServiceFactory middleware: " + middleware + " did not match any available options.  Should have been HAZELCAST" );
        }
    }
}
