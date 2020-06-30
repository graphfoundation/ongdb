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
package org.neo4j.causalclustering.discovery;

import org.neo4j.causalclustering.identity.MemberId;
import org.neo4j.kernel.configuration.Config;
import org.neo4j.kernel.monitoring.Monitors;
import org.neo4j.logging.LogProvider;
import org.neo4j.scheduler.JobScheduler;

public class SharedDiscoveryServiceFactory implements DiscoveryServiceFactory
{

    private final SharedDiscoveryService discoveryService = new SharedDiscoveryService();

    @Override
    public CoreTopologyService coreTopologyService( Config config, MemberId myself, JobScheduler jobScheduler,
                                                    LogProvider logProvider, LogProvider userLogProvider, RemoteMembersResolver remoteMembersResolver,
                                                    TopologyServiceRetryStrategy topologyServiceRetryStrategy, Monitors monitors )
    {
        return new SharedDiscoveryCoreClient( discoveryService, myself, logProvider, config );
    }

    @Override
    public TopologyService readReplicaTopologyService( Config config, LogProvider logProvider, JobScheduler jobScheduler, MemberId myself,
                                                       RemoteMembersResolver remoteMembersResolver, TopologyServiceRetryStrategy topologyServiceRetryStrategy )
    {
        return new SharedDiscoveryReadReplicaClient( discoveryService, config, myself, logProvider );
    }
}
