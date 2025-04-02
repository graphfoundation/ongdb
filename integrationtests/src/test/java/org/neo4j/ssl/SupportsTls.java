/*
 * Copyright (c) "Graph Foundation,"
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
package org.neo4j.ssl;

import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.SSLContext;

/**
 * Reports whether the running JVM can complete a TLS handshake for a given protocol version.
 * Newer JDKs commonly list legacy protocols in {@code jdk.tls.disabledAlgorithms}; those still appear
 * in {@link SSLContext#getSupportedSSLParameters()} and can often be passed to
 * {@code setEnabledProtocols}, but handshakes fail. Version-string checks are intentionally avoided.
 */
public class SupportsTls
{
    private static final Set<String> PROTOCOL_NAMES = new HashSet<>( Arrays.asList(
            "SSLv3", "TLSv1", "TLSv1.1", "TLSv1.2", "TLSv1.3" ) );

    private static final Set<String> SUPPORTED_PROTOCOLS = discoverSupportedProtocols();
    private static final Set<String> DISABLED_PROTOCOLS = discoverDisabledProtocols();

    public static boolean supportsTls_1_0()
    {
        return supports( "TLSv1" );
    }

    public static boolean supportsTls_1_1()
    {
        return supports( "TLSv1.1" );
    }

    public static boolean supportsTls_1_2()
    {
        return supports( "TLSv1.2" );
    }

    public static boolean supportsTls_1_3()
    {
        return supports( "TLSv1.3" );
    }

    private static boolean supports( String protocol )
    {
        return SUPPORTED_PROTOCOLS.contains( protocol ) && !DISABLED_PROTOCOLS.contains( protocol );
    }

    private static Set<String> discoverSupportedProtocols()
    {
        try
        {
            String[] protocols = SSLContext.getDefault().getSupportedSSLParameters().getProtocols();
            return Collections.unmodifiableSet( new HashSet<>( Arrays.asList( protocols ) ) );
        }
        catch ( NoSuchAlgorithmException e )
        {
            return Collections.emptySet();
        }
    }

    private static Set<String> discoverDisabledProtocols()
    {
        String property = Security.getProperty( "jdk.tls.disabledAlgorithms" );
        if ( property == null || property.trim().isEmpty() )
        {
            return Collections.emptySet();
        }

        Set<String> disabled = new HashSet<>();
        for ( String part : property.split( "," ) )
        {
            String token = part.trim();
            if ( PROTOCOL_NAMES.contains( token ) )
            {
                disabled.add( token );
            }
        }
        return Collections.unmodifiableSet( disabled );
    }
}
