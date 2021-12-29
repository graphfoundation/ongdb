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
/*
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
package org.neo4j.causalclustering.discovery;

import org.neo4j.causalclustering.identity.MemberId;
import org.neo4j.kernel.configuration.Config;
import org.neo4j.logging.LogProvider;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.ssl.SslPolicy;

public class SecureHazelcastDiscoveryServiceFactory extends HazelcastDiscoveryServiceFactory
{
    private SslPolicy sslPolicy;

    /**
     *
     */
    public SecureHazelcastDiscoveryServiceFactory()
    {
    }

    /**
     * @param config
     * @param myself
     * @param jobScheduler
     * @param logProvider
     * @param userLogProvider
     * @param hostnameResolver
     * @param topologyServiceRetryStrategy
     * @return
     */
    public CoreTopologyService coreTopologyService( Config config, MemberId myself, JobScheduler jobScheduler, LogProvider logProvider,
            LogProvider userLogProvider, HostnameResolver hostnameResolver, TopologyServiceRetryStrategy topologyServiceRetryStrategy )
    {
        configureHazelcast( config, logProvider );
        return new SecureHazelcastCoreTopologyService( config, this.sslPolicy, myself, jobScheduler, logProvider, userLogProvider, hostnameResolver,
                topologyServiceRetryStrategy );
    }

    /**
     * @param config
     * @param logProvider
     * @param jobScheduler
     * @param myself
     * @param hostnameResolver
     * @param topologyServiceRetryStrategy
     * @return
     */
    public TopologyService topologyService( Config config, LogProvider logProvider, JobScheduler jobScheduler, MemberId myself,
            HostnameResolver hostnameResolver, TopologyServiceRetryStrategy topologyServiceRetryStrategy )
    {

        configureHazelcast( config, logProvider );
        return new HazelcastClient( new SecureHazelcastClientConnector( config, logProvider, this.sslPolicy, hostnameResolver ), jobScheduler, logProvider,
                config, myself, topologyServiceRetryStrategy );
    }

    /**
     * @param sslPolicy
     */
    public void setSslPolicy( SslPolicy sslPolicy )
    {
        this.sslPolicy = sslPolicy;
    }
}
