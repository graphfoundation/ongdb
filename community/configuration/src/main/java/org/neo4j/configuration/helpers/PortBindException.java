/*
 * Copyright (c) 2018-2022 "Graph Foundation,"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB.
 *
 * ONgDB is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * Copyright (c) "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.configuration.helpers;

import java.net.BindException;

/**
 * A bind exception that includes which port we failed to bind to.
 * Whenever possible, catch and rethrow bind exceptions as this, to make it possible to
 * sort out which address it is that is in use.
 */
public class PortBindException extends BindException
{
    public PortBindException( SocketAddress address, Throwable original )
    {
        this( address, null, original );
    }

    public PortBindException( java.net.SocketAddress address, Throwable original )
    {
        super( "An error occurred while trying to bind to the socket " + address );
        initCause( original );
    }

    public PortBindException( SocketAddress address1, SocketAddress address2, Throwable original )
    {
        super( createMessage( address1, address2 ) );
        setStackTrace( original.getStackTrace() );
    }

    private static String createMessage( SocketAddress address1, SocketAddress address2 )
    {
        if ( address1 == null && address2 == null )
        {
            return "Address is already in use, cannot bind to it.";
        }
        else if ( address1 != null && address2 != null )
        {
            return String.format( "At least one of the addresses %s or %s is already in use, cannot bind to it.", address1, address2 );
        }
        else
        {
            return String.format( "Address %s is already in use, cannot bind to it.", address1 != null ? address1 : address2 );
        }
    }
}
