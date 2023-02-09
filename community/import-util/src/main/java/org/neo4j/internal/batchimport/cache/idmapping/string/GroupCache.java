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
package org.neo4j.internal.batchimport.cache.idmapping.string;

import org.neo4j.internal.batchimport.cache.ByteArray;
import org.neo4j.internal.batchimport.cache.NumberArrayFactory;
import org.neo4j.internal.batchimport.input.Group;
import org.neo4j.memory.MemoryTracker;

import static org.neo4j.internal.helpers.Numbers.safeCastIntToUnsignedByte;
import static org.neo4j.internal.helpers.Numbers.safeCastIntToUnsignedShort;
import static org.neo4j.internal.helpers.Numbers.unsignedByteToInt;
import static org.neo4j.internal.helpers.Numbers.unsignedShortToInt;

/**
 * Cache for keeping nodeId --> groupId mapping.
 */
public interface GroupCache extends AutoCloseable
{
    void set( long nodeId, int groupId );

    int get( long nodeId );

    @Override
    void close();

    GroupCache GLOBAL = new GroupCache()
    {
        @Override
        public void set( long nodeId, int groupId )
        {   // no need
            assert groupId == Group.GLOBAL.id();
        }

        @Override
        public int get( long nodeId )
        {
            return Group.GLOBAL.id();
        }

        @Override
        public void close()
        {
        }
    };

    class ByteGroupCache implements GroupCache
    {
        private final ByteArray array;

        public ByteGroupCache( NumberArrayFactory factory, int chunkSize, MemoryTracker memoryTracker )
        {
            array = factory.newDynamicByteArray( chunkSize, new byte[Byte.BYTES], memoryTracker );
        }

        @Override
        public void set( long nodeId, int groupId )
        {
            array.setByte( nodeId, 0, safeCastIntToUnsignedByte( groupId ) );
        }

        @Override
        public int get( long nodeId )
        {
            return unsignedByteToInt( array.getByte( nodeId, 0 ) );
        }

        @Override
        public void close()
        {
            array.close();
        }
    }

    class ShortGroupCache implements GroupCache
    {
        private final ByteArray array;

        public ShortGroupCache( NumberArrayFactory factory, int chunkSize, MemoryTracker memoryTracker )
        {
            array = factory.newDynamicByteArray( chunkSize, new byte[Short.BYTES], memoryTracker );
        }

        @Override
        public void set( long nodeId, int groupId )
        {
            array.setShort( nodeId, 0, safeCastIntToUnsignedShort( groupId ) );
        }

        @Override
        public int get( long nodeId )
        {
            return unsignedShortToInt( array.getShort( nodeId, 0 ) );
        }

        @Override
        public void close()
        {
            array.close();
        }
    }

    static GroupCache select( NumberArrayFactory factory, int chunkSize, int numberOfGroups, MemoryTracker memoryTracker )
    {
        if ( numberOfGroups == 0 )
        {
            return GLOBAL;
        }
        if ( numberOfGroups <= 0x100 )
        {
            return new ByteGroupCache( factory, chunkSize, memoryTracker );
        }
        if ( numberOfGroups <= 0x10000 )
        {
            return new ShortGroupCache( factory, chunkSize, memoryTracker );
        }
        throw new IllegalArgumentException( "Max allowed groups is " + 0xFFFF + ", but wanted " + numberOfGroups );
    }
}
