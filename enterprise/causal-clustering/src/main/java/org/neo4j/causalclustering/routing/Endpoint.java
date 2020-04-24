/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
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
package org.neo4j.causalclustering.routing;

import java.util.Objects;
import java.util.Optional;

import org.neo4j.helpers.AdvertisedSocketAddress;

/**
 * This class binds a certain role with an address and
 * thus defines a reachable endpoint with defined capabilities.
 */
public class Endpoint
{
    private final AdvertisedSocketAddress address;
    private final Role role;

    public Endpoint( AdvertisedSocketAddress address, Role role )
    {
        this.address = address;
        this.role = role;
    }

    public Endpoint( AdvertisedSocketAddress address, Role role, String dbName )
    {
        this.address = address;
        this.role = role;
    }

    public AdvertisedSocketAddress address()
    {
        return address;
    }

    public static Endpoint write( AdvertisedSocketAddress address )
    {
        return new Endpoint( address, Role.WRITE );
    }

    public static Endpoint read( AdvertisedSocketAddress address )
    {
        return new Endpoint( address, Role.READ );
    }

    public static Endpoint route( AdvertisedSocketAddress address )
    {
        return new Endpoint( address, Role.ROUTE );
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o )
        {
            return true;
        }
        if ( o == null || getClass() != o.getClass() )
        {
            return false;
        }
        Endpoint endPoint = (Endpoint) o;
        return Objects.equals( address, endPoint.address ) && role == endPoint.role;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( address, role );
    }

    @Override
    public String toString()
    {
        return "EndPoint{" + "address=" + address + ", role=" + role + '}';
    }
}
