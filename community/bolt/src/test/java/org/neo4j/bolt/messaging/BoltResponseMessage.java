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
package org.neo4j.bolt.messaging;

import static java.lang.String.format;

/**
 * Enumeration representing all defined Bolt response messages.
 * Also contains the signature byte with which the message is
 * encoded on the wire.
 */
public enum BoltResponseMessage
{
    SUCCESS( 0x70 ),
    RECORD( 0x71 ),
    IGNORED( 0x7E ),
    FAILURE( 0x7F );

    private static final BoltResponseMessage[] VALUES_BY_SIGNATURE =  new BoltResponseMessage[0x80];
    static
    {
        for ( BoltResponseMessage value : values() )
        {
            VALUES_BY_SIGNATURE[value.signature()] = value;
        }
    }

    /**
     * Obtain a response message by signature.
     *
     * @param signature the signature byte to look up
     * @return the appropriate message instance
     * @throws IllegalArgumentException if no such message exists
     */
    public static BoltResponseMessage withSignature( int signature )
    {
        BoltResponseMessage message = VALUES_BY_SIGNATURE[signature];
        if ( message == null )
        {
            throw new IllegalArgumentException( format( "No message with signature %d", signature ) );
        }
        return message;
    }

    private final byte signature;

    BoltResponseMessage( int signature )
    {
        this.signature = (byte) signature;
    }

    public byte signature()
    {
        return signature;
    }

}
