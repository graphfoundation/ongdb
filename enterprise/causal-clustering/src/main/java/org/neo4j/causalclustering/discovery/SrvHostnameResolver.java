/*
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * Copyright (c) 2002-2018 "Neo4j,"
 * Neo4j Sweden AB [http://neo4j.com]
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
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;
import javax.naming.NamingException;

import org.neo4j.helpers.AdvertisedSocketAddress;
import org.neo4j.kernel.configuration.Config;
import org.neo4j.logging.Log;
import org.neo4j.logging.internal.LogService;

public class SrvHostnameResolver extends RetryingHostnameResolver
{
    private final Log userLog;
    private final Log log;
    private final SrvRecordResolver srvRecordResolver;

    public static RemoteMembersResolver resolver( LogService logService, SrvRecordResolver srvHostnameResolver, Config config )
    {
        SrvHostnameResolver hostnameResolver =
                new SrvHostnameResolver( logService, srvHostnameResolver, config, defaultRetryStrategy( config, logService.getInternalLogProvider() ) );
        return new InitialDiscoveryMembersResolver( hostnameResolver, config );
    }

    SrvHostnameResolver( LogService logService, SrvRecordResolver srvRecordResolver, Config config,
            MultiRetryStrategy<AdvertisedSocketAddress,Collection<AdvertisedSocketAddress>> retryStrategy )
    {
        super( config, retryStrategy );
        log = logService.getInternalLog( getClass() );
        userLog = logService.getUserLog( getClass() );
        this.srvRecordResolver = srvRecordResolver;
    }

    @Override
    public Collection<AdvertisedSocketAddress> resolveOnce( AdvertisedSocketAddress initialAddress )
    {
        try
        {
            Set<AdvertisedSocketAddress> addresses = srvRecordResolver
                    .resolveSrvRecord( initialAddress.getHostname() )
                    .map( srvRecord -> new AdvertisedSocketAddress( srvRecord.host, srvRecord.port ) )
                    .collect( Collectors.toSet() );

            userLog.info( "Resolved initial host '%s' to %s", initialAddress, addresses );

            if ( addresses.isEmpty() )
            {
                log.error( "Failed to resolve srv records for '%s'", initialAddress.getHostname() );
            }

            return addresses;
        }
        catch ( NamingException e )
        {
            log.error( String.format( "Failed to resolve srv records for '%s'", initialAddress.getHostname() ), e );
            return Collections.emptySet();
        }
    }
}
