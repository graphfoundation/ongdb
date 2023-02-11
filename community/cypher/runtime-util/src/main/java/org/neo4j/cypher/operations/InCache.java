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
package org.neo4j.cypher.operations;

import java.util.Iterator;

import org.neo4j.collection.trackable.HeapTrackingCollections;
import org.neo4j.collection.trackable.HeapTrackingUnifiedSet;
import org.neo4j.memory.MemoryTracker;
import org.neo4j.values.AnyValue;
import org.neo4j.values.Equality;
import org.neo4j.values.SequenceValue;
import org.neo4j.values.storable.Value;
import org.neo4j.values.virtual.ListValue;
import org.neo4j.values.virtual.MapValue;

import static org.neo4j.values.storable.Values.FALSE;
import static org.neo4j.values.storable.Values.NO_VALUE;
import static org.neo4j.values.storable.Values.TRUE;

public class InCache implements AutoCloseable
{
    private final SimpleIdentityCache<ListValue,DelayedInCacheChecker> seen;

    public InCache()
    {
        this( 16 );
    }

    public InCache( int maxSize )
    {
        seen = new SimpleIdentityCache<>( maxSize );
    }

    public Value check( AnyValue value, ListValue list, MemoryTracker memoryTracker )
    {
        if ( list.size() < 128 || value == NO_VALUE )
        {
            return CypherFunctions.in( value, list );
        }
        else
        {
            return seen.getOrCache( list, oldValue ->
                       {
                           if ( oldValue != null )
                           {
                               oldValue.close();
                           }
                           return new DelayedInCacheChecker();
                       } )
                       .check( value, list, memoryTracker );
        }
    }

    @Override
    public void close()
    {
        seen.foreach( ( k, v ) -> v.close() );
    }

    private static class DelayedInCacheChecker implements AutoCloseable
    {
        private static final int DEFAULT_DELAY = 1;
        private HeapTrackingUnifiedSet<AnyValue> seen;
        private Iterator<AnyValue> iterator;
        private boolean seenUndefined; // Not valid for sequence values and maps
        private int cacheHits;

        private final int delay;

        private DelayedInCacheChecker()
        {
            this( DEFAULT_DELAY );
        }

        private DelayedInCacheChecker( int delay )
        {
            this.delay = delay;
        }

        private Value check( AnyValue value, ListValue list, MemoryTracker memoryTracker )
        {
            assert value != NO_VALUE;
            if ( cacheHits++ < delay )
            {
                return CypherFunctions.in( value, list );
            }
            if ( iterator == null )
            {
                iterator = list.iterator();
                this.seen = HeapTrackingCollections.newSet( memoryTracker );
            }
            if ( seen.contains( value ) )
            {
                return TRUE;
            }

            while ( iterator.hasNext() )
            {
                var next = iterator.next();
                if ( next == NO_VALUE )
                {
                    seenUndefined = true;
                }
                else
                {
                    seen.add( next );

                    if ( next.ternaryEquals( value ) == Equality.TRUE )
                    {
                        return TRUE;
                    }
                }
            }

            if ( seenUndefined )
            {
                return NO_VALUE;
            }
            else if ( value instanceof SequenceValue || value instanceof MapValue )
            {
                var undefinedEquality =
                        seen.stream().anyMatch( seenValue -> value.ternaryEquals( seenValue ) == Equality.UNDEFINED );
                return undefinedEquality ? NO_VALUE : FALSE;
            }
            else
            {
                return FALSE;
            }
        }

        @Override
        public void close()
        {
            if ( seen != null )
            {
                seen.close();
            }
        }
    }
}

