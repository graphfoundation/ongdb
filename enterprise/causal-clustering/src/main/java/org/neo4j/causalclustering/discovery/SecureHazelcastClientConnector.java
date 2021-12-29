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

import com.hazelcast.client.config.ClientNetworkConfig;

import org.neo4j.kernel.configuration.Config;
import org.neo4j.logging.LogProvider;
import org.neo4j.ssl.SslPolicy;

public class SecureHazelcastClientConnector extends HazelcastClientConnector
{
    private final SslPolicy sslPolicy;

    SecureHazelcastClientConnector( Config config, LogProvider logProvider, SslPolicy sslPolicy, HostnameResolver hostnameResolver )
    {
        super( config, logProvider, hostnameResolver );
        this.sslPolicy = sslPolicy;
    }

    protected void additionalConfig( ClientNetworkConfig networkConfig, LogProvider logProvider )
    {
        SecureHazelcastConfiguration.configureSsl( networkConfig, this.sslPolicy, logProvider );
    }
}

