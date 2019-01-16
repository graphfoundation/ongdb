/**
 * Copyright (c) 2019 "GraphFoundation" <https://graphfoundation.org>
 * <p>
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * <p>
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 **/

package org.neo4j.causalclustering.discovery;

import org.neo4j.causalclustering.identity.MemberId;
import org.neo4j.kernel.configuration.Config;
import org.neo4j.kernel.monitoring.Monitors;
import org.neo4j.logging.LogProvider;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.ssl.SslPolicy;

public class SecureHazelcastDiscoveryServiceFactory extends HazelcastDiscoveryServiceFactory implements SecureDiscoveryServiceFactory
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
     * @param remoteMembersResolver
     * @param topologyServiceRetryStrategy
     * @param monitors
     * @return
     */
    public CoreTopologyService coreTopologyService( Config config, MemberId myself, JobScheduler jobScheduler, LogProvider logProvider,
            LogProvider userLogProvider, RemoteMembersResolver remoteMembersResolver, TopologyServiceRetryStrategy topologyServiceRetryStrategy,
            Monitors monitors )
    {
        configureHazelcast( config, logProvider );
        return new SecureHazelcastCoreTopologyService( config, this.sslPolicy, myself, jobScheduler, logProvider, userLogProvider, remoteMembersResolver,
                topologyServiceRetryStrategy, monitors );
    }

    /**
     * @param config
     * @param logProvider
     * @param jobScheduler
     * @param myself
     * @param remoteMembersResolver
     * @param topologyServiceRetryStrategy
     * @return
     */
    public TopologyService topologyService( Config config, LogProvider logProvider, JobScheduler jobScheduler, MemberId myself,
            RemoteMembersResolver remoteMembersResolver, TopologyServiceRetryStrategy topologyServiceRetryStrategy )
    {
        configureHazelcast( config, logProvider );

        return new HazelcastClient( new SecureHazelcastClientConnector( config, logProvider, this.sslPolicy, remoteMembersResolver ), jobScheduler, logProvider,
                config, myself );
    }

    /**
     * @param sslPolicy
     */
    public void setSslPolicy( SslPolicy sslPolicy )
    {
        this.sslPolicy = sslPolicy;
    }
}
