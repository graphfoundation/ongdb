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

import java.net.InetAddress;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapDomainNameResolver implements DomainNameResolver
{
    private final Map<String /*hostname*/,InetAddress[] /*response*/> domainNameMapping;

    public MapDomainNameResolver( Map<String,InetAddress[]> mapping )
    {
        domainNameMapping = mapping;
    }

    @Override
    public InetAddress[] resolveDomainName( String hostname ) throws UnknownHostException
    {
        return Optional.ofNullable( domainNameMapping.get( hostname ) ).orElse( new InetAddress[0] );
    }

    public void setHostnameAddresses( String hostname, Collection<String> addresses )
    {
        InetAddress[] processedAddresses = new InetAddress[addresses.size()];
        addresses.stream().map( MapDomainNameResolver::inetAddress ).collect( Collectors.toList() )
                .toArray( processedAddresses );
        domainNameMapping.put( hostname, processedAddresses );
    }

    private static InetAddress inetAddress( String address )
    {
        try
        {
            return InetAddress.getByName( address );
        }
        catch ( java.net.UnknownHostException e )
        {
            throw new UnknownHostException( e );
        }
    }
}
