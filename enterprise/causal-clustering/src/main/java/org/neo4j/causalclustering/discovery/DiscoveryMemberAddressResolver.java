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
package org.neo4j.causalclustering.discovery;

import java.util.Collection;
import java.util.LinkedHashSet;

import org.neo4j.causalclustering.core.CausalClusteringSettings;
import org.neo4j.helpers.AdvertisedSocketAddress;
import org.neo4j.kernel.configuration.Config;

/**
 * Resolves the set of advertised addresses used to join Hazelcast discovery,
 * honoring {@link CausalClusteringSettings#discovery_type}.
 */
final class DiscoveryMemberAddressResolver
{
    private DiscoveryMemberAddressResolver()
    {
    }

    static Collection<AdvertisedSocketAddress> resolve( Config config, HostnameResolver hostnameResolver )
    {
        if ( config.get( CausalClusteringSettings.discovery_type ) == CausalClusteringSettings.DiscoveryType.K8S )
        {
            return hostnameResolver.resolve( null );
        }

        Collection<AdvertisedSocketAddress> resolved = new LinkedHashSet<>();
        for ( AdvertisedSocketAddress address : config.get( CausalClusteringSettings.initial_discovery_members ) )
        {
            resolved.addAll( hostnameResolver.resolve( address ) );
        }
        return resolved;
    }
}
