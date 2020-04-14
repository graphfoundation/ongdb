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
 * Modified from https://github.com/graphfoundation/ongdb/blob/3.3/enterprise/causal-clustering/src/main/java/org/neo4j/causalclustering/discovery/HazelcastSslContextFactory.java
 */

package org.neo4j.causalclustering.discovery;

import com.hazelcast.nio.ssl.SSLContextFactory;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.util.Properties;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.ssl.SslPolicy;

import static java.lang.String.format;

//import java.security.*;

class SecureHazelcastContextFactory implements SSLContextFactory
{
    private static final String PROTOCOL = "TLS";
    private final SslPolicy sslPolicy;
    private final Log log;

    /**
     * @param sslPolicy
     * @param logProvider
     */
    SecureHazelcastContextFactory( SslPolicy sslPolicy, LogProvider logProvider )
    {
        this.sslPolicy = sslPolicy;
        this.log = logProvider.getLog( this.getClass() );
    }

    /**
     * @param properties
     */
    public void init( Properties properties )
    {
    }

    @Override
    /**
     *
     */ public SSLContext getSSLContext()
    {
        SSLContext sslCtx;

        try
        {
            sslCtx = SSLContext.getInstance( PROTOCOL );
        }
        catch ( NoSuchAlgorithmException e )
        {
            throw new RuntimeException( e );
        }

        KeyManagerFactory keyManagerFactory;
        try
        {
            keyManagerFactory = KeyManagerFactory.getInstance( KeyManagerFactory.getDefaultAlgorithm() );
        }
        catch ( NoSuchAlgorithmException e )
        {
            throw new RuntimeException( e );
        }

        SecureRandom rand = new SecureRandom();
        char[] password = new char[32];
        for ( int i = 0; i < password.length; i++ )
        {
            password[i] = (char) rand.nextInt( Character.MAX_VALUE + 1 );
        }

        try
        {
            KeyStore keyStore = sslPolicy.getKeyStore( password, password );
            keyManagerFactory.init( keyStore, password );
        }
        catch ( KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException e )
        {
            throw new RuntimeException( e );
        }
        finally
        {
            for ( int i = 0; i < password.length; i++ )
            {
                password[i] = 0;
            }
        }

        KeyManager[] keyManagers = keyManagerFactory.getKeyManagers();
        TrustManager[] trustManagers = sslPolicy.getTrustManagerFactory().getTrustManagers();

        try
        {
            sslCtx.init( keyManagers, trustManagers, null );
        }
        catch ( KeyManagementException e )
        {
            throw new RuntimeException( e );
        }

        if ( sslPolicy.getTlsVersions() != null )
        {
            log.warn( format( "Restricting TLS versions through policy not supported." + " System defaults for %s family will be used.", PROTOCOL ) );
        }

        if ( sslPolicy.getCipherSuites() != null )
        {
            log.warn( "Restricting ciphers through policy not supported." + " System defaults will be used." );
        }

        return sslCtx;
    }
}
