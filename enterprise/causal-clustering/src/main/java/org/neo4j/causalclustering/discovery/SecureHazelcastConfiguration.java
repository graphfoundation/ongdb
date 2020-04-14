/*
 * Copyright (c) 2002-2018 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * Modifications Copyright (c) 2019 "GraphFoundation" [https://graphfoundation.org]
 *
 * You can redistribute this software and/or modify
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

 *
 * Modified from :  https://github.com/graphfoundation/ongdb/blob/3.3/enterprise/causal-clustering/src/main/java/org/neo4j/causalclustering/discovery/HazelcastSslConfiguration.java
 */

package org.neo4j.causalclustering.discovery;

import com.hazelcast.client.config.ClientNetworkConfig;
import com.hazelcast.config.NetworkConfig;
import com.hazelcast.config.SSLConfig;

import org.neo4j.logging.LogProvider;
import org.neo4j.ssl.SslPolicy;

public class SecureHazelcastConfiguration
{
    /**
     *
     */
    public SecureHazelcastConfiguration()
    {
    }

    /**
     * @param networkConfig
     * @param sslPolicy
     * @param logProvider
     */
    public static void configureSsl( NetworkConfig networkConfig, SslPolicy sslPolicy, LogProvider logProvider )
    {
        SSLConfig sslConfig = commonSslConfig( sslPolicy, logProvider );
        networkConfig.setSSLConfig( sslConfig );
    }

    /**
     * @param clientNetworkConfig
     * @param sslPolicy
     * @param logProvider
     */
    public static void configureSsl( ClientNetworkConfig clientNetworkConfig, SslPolicy sslPolicy, LogProvider logProvider )
    {
        SSLConfig sslConfig = commonSslConfig( sslPolicy, logProvider );
        clientNetworkConfig.setSSLConfig( sslConfig );
    }

    /**
     * @param sslPolicy
     * @param logProvider
     * @return
     */
    private static SSLConfig commonSslConfig( SslPolicy sslPolicy, LogProvider logProvider )
    {
        SSLConfig sslConfig = new SSLConfig();
        if ( sslPolicy == null )
        {
            return sslConfig;
        }
        else
        {
            sslConfig.setFactoryImplementation( new SecureHazelcastContextFactory( sslPolicy, logProvider ) ).setEnabled( true );
            switch ( sslPolicy.getClientAuth() )
            {
            case REQUIRE:
                sslConfig.setProperty( "javax.net.ssl.mutualAuthentication", "REQUIRED" );
                break;
            case OPTIONAL:
                sslConfig.setProperty( "javax.net.ssl.mutualAuthentication", "OPTIONAL" );
            case NONE:
                break;
            default:
                throw new IllegalArgumentException( "Not supported: " + sslPolicy.getClientAuth() );
            }

            return sslConfig;
        }
    }
}
