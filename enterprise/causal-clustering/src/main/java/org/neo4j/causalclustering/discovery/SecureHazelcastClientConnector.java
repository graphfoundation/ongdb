/**
 * Copyright (c) 2019 "GraphFoundation" <https://graphfoundation.org>
 * <p>
 * ONgDB is free software: you can redistribute it and/or modify
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

import com.hazelcast.client.config.ClientNetworkConfig;

import org.neo4j.kernel.configuration.Config;
import org.neo4j.logging.LogProvider;
import org.neo4j.ssl.SslPolicy;

public class SecureHazelcastClientConnector extends HazelcastClientConnector
{
    private final SslPolicy sslPolicy;

    /**
     * @param config
     * @param logProvider
     * @param sslPolicy
     * @param remoteMembersResolver
     */
    SecureHazelcastClientConnector( Config config, LogProvider logProvider, SslPolicy sslPolicy, RemoteMembersResolver remoteMembersResolver )
    {
        super( config, logProvider, remoteMembersResolver );
        this.sslPolicy = sslPolicy;
    }

    /**
     * @param networkConfig
     * @param logProvider
     */
    protected void additionalConfig( ClientNetworkConfig networkConfig, LogProvider logProvider )
    {
        SecureHazelcastConfiguration.configureSsl( networkConfig, this.sslPolicy, logProvider );
    }
}

