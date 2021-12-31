/*
 * Copyright (c) 2018-2022 "Graph Foundation,"
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
/*
 * Copyright (c) 2002-2018 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
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
 */
package org.neo4j.causalclustering.protocol.handshake;

import java.util.Objects;

public class InitialMagicMessage implements ServerMessage, ClientMessage
{
    // these can never, ever change
    static final String CORRECT_MAGIC_VALUE = "ONGDB_CLUSTER";
    static final int MESSAGE_CODE = 0x44474E4F; // ASCII/UTF-8 "ONGDB"

    private final String magic;
    // TODO: clusterId (String?)

    private static final InitialMagicMessage instance = new InitialMagicMessage( CORRECT_MAGIC_VALUE );

    InitialMagicMessage( String magic )
    {
        this.magic = magic;
    }

    public static InitialMagicMessage instance()
    {
        return instance;
    }

    @Override
    public void dispatch( ServerMessageHandler handler )
    {
        handler.handle( this );
    }

    @Override
    public void dispatch( ClientMessageHandler handler )
    {
        handler.handle( this );
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
        InitialMagicMessage that = (InitialMagicMessage) o;
        return Objects.equals( magic, that.magic );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( magic );
    }

    boolean isCorrectMagic()
    {
        return magic.equals( CORRECT_MAGIC_VALUE );
    }

    public String magic()
    {
        return magic;
    }

    @Override
    public String toString()
    {
        return "InitialMagicMessage{" + "magic='" + magic + '\'' + '}';
    }
}
