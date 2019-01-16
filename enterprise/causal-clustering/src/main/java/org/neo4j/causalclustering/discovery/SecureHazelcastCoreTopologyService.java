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

import com.hazelcast.config.NetworkConfig;

import org.neo4j.causalclustering.identity.MemberId;
import org.neo4j.kernel.configuration.Config;
import org.neo4j.kernel.monitoring.Monitors;
import org.neo4j.logging.LogProvider;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.ssl.SslPolicy;

class SecureHazelcastCoreTopologyService extends HazelcastCoreTopologyService
{
    private final SslPolicy sslPolicy;

    /**
     * @param config
     * @param sslPolicy
     * @param myself
     * @param jobScheduler
     * @param logProvider
     * @param userLogProvider
     * @param remoteMembersResolver
     * @param topologyServiceRetryStrategy
     * @param monitors
     */
    SecureHazelcastCoreTopologyService( Config config, SslPolicy sslPolicy, MemberId myself, JobScheduler jobScheduler, LogProvider logProvider,
            LogProvider userLogProvider, RemoteMembersResolver remoteMembersResolver, TopologyServiceRetryStrategy topologyServiceRetryStrategy,
            Monitors monitors )
    {
        super( config, myself, jobScheduler, logProvider, userLogProvider, remoteMembersResolver, topologyServiceRetryStrategy, monitors );
        this.sslPolicy = sslPolicy;
    }

    /**
     * @param networkConfig
     * @param logProvider
     */
    protected void additionalConfig( NetworkConfig networkConfig, LogProvider logProvider )
    {
        SecureHazelcastConfiguration.configureSsl( networkConfig, this.sslPolicy, logProvider );
    }
}

