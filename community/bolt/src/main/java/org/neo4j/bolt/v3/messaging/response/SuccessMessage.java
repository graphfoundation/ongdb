/*
 * Copyright (c) "Graph Foundation,"
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
package org.neo4j.bolt.v3.messaging.response;

import org.neo4j.bolt.messaging.ResponseMessage;
import org.neo4j.values.virtual.MapValue;

public class SuccessMessage implements ResponseMessage
{
    public static final byte SIGNATURE = 0x70;
    private final MapValue metadata;

    public SuccessMessage( MapValue metadata )
    {
        this.metadata = metadata;
    }

    @Override
    public byte signature()
    {
        return SIGNATURE;
    }

    @Override
    public ResponseMessage copy()
    {
        return this;
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

        SuccessMessage that = (SuccessMessage) o;

        return metadata.equals( that.metadata );

    }

    @Override
    public int hashCode()
    {
        return metadata.hashCode();
    }

    @Override
    public String toString()
    {
        return "SUCCESS " + metadata;
    }

    public MapValue meta()
    {
        return metadata;
    }
}
