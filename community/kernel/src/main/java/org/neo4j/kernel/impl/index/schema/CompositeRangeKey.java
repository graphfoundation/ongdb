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
package org.neo4j.kernel.impl.index.schema;

import java.util.StringJoiner;

import org.neo4j.io.pagecache.PageCursor;
import org.neo4j.util.Preconditions;
import org.neo4j.values.storable.Value;
import org.neo4j.values.storable.ValueGroup;

/**
 * {@link RangeKey} which has an array of {@link RangeKey} inside and can therefore hold composite key state.
 * For single-keys please instead use the more efficient {@link RangeKey}.
 */
final class CompositeRangeKey extends RangeKey
{
    private RangeKey[] states;

    CompositeRangeKey( int slots )
    {
        states = new RangeKey[slots];
        for ( int i = 0; i < slots; i++ )
        {
            states[i] = new RangeKey();
        }
    }

    @Override
    void writeValue( int stateSlot, Value value, Inclusion inclusion )
    {
        stateSlot( stateSlot ).writeValue( value, inclusion );
    }

    @Override
    void assertValidValue( int stateSlot, Value value )
    {
        Preconditions.requireBetween( stateSlot, 0, numberOfStateSlots() );
    }

    @Override
    Value[] asValues()
    {
        Value[] values = new Value[numberOfStateSlots()];
        for ( int i = 0; i < values.length; i++ )
        {
            values[i] = stateSlot( i ).asValue();
        }
        return values;
    }

    @Override
    void initValueAsLowest( int stateSlot, ValueGroup valueGroup )
    {
        stateSlot( stateSlot ).initValueAsLowest( valueGroup );
    }

    @Override
    void initValueAsHighest( int stateSlot, ValueGroup valueGroup )
    {
        stateSlot( stateSlot ).initValueAsHighest( valueGroup );
    }

    @Override
    int compareValueToInternal( RangeKey other )
    {
        int slots = numberOfStateSlots();
        for ( int i = 0; i < slots; i++ )
        {
            int comparison = stateSlot( i ).compareValueToInternal( other.stateSlot( i ) );
            if ( comparison != 0 )
            {
                return comparison;
            }
        }
        return 0;
    }

    @Override
    void copyFromInternal( GenericKey<?> key )
    {
        int slots = numberOfStateSlots();
        if ( key.numberOfStateSlots() != slots )
        {
            throw new IllegalArgumentException( "Different state lengths " + key.numberOfStateSlots() + " vs " + slots );
        }

        for ( int i = 0; i < slots; i++ )
        {
            stateSlot( i ).copyFromInternal( key.stateSlot( i ) );
        }
    }

    @Override
    int sizeInternal()
    {
        int size = 0;
        int slots = numberOfStateSlots();
        for ( int i = 0; i < slots; i++ )
        {
            size += stateSlot( i ).sizeInternal();
        }
        return size;
    }

    @Override
    void putInternal( PageCursor cursor )
    {
        int slots = numberOfStateSlots();
        for ( int i = 0; i < slots; i++ )
        {
            stateSlot( i ).putInternal( cursor );
        }
    }

    @Override
    boolean getInternal( PageCursor cursor, int keySize )
    {
        int slots = numberOfStateSlots();
        for ( int i = 0; i < slots; i++ )
        {
            if ( !stateSlot( i ).getInternal( cursor, keySize ) )
            {
                // The slot's getInternal has already set cursor exception, if it so desired, with more specific information so don't do it here.
                return false;
            }
        }
        return true;
    }

    @Override
    void initializeToDummyValueInternal()
    {
        int slots = numberOfStateSlots();
        for ( int i = 0; i < slots; i++ )
        {
            stateSlot( i ).initializeToDummyValueInternal();
        }
    }

    @Override
    int numberOfStateSlots()
    {
        return states.length;
    }

    @Override
    public String toStringInternal()
    {
        StringJoiner joiner = new StringJoiner( "," );
        for ( RangeKey state : states )
        {
            joiner.add( state.toStringInternal() );
        }
        return joiner.toString();
    }

    @Override
    String toDetailedStringInternal()
    {
        StringJoiner joiner = new StringJoiner( "," );
        for ( RangeKey state : states )
        {
            joiner.add( state.toDetailedStringInternal() );
        }
        return joiner.toString();
    }

    @Override
    void minimalSplitterInternal( RangeKey left, RangeKey right, RangeKey into )
    {
        int firstStateToDiffer = 0;
        int compare = 0;
        int stateCount = right.numberOfStateSlots();

        // It's really quite assumed that all these keys have the same number of state slots.
        // It's not a practical runtime concern, so merely an assertion here
        assert right.numberOfStateSlots() == stateCount;
        assert into.numberOfStateSlots() == stateCount;

        while ( compare == 0 && firstStateToDiffer < stateCount )
        {
            RangeKey leftState = left.stateSlot( firstStateToDiffer );
            RangeKey rightState = right.stateSlot( firstStateToDiffer );
            firstStateToDiffer++;
            compare = leftState.compareValueToInternal( rightState );
        }
        firstStateToDiffer--; // Rewind last increment
        for ( int i = 0; i < firstStateToDiffer; i++ )
        {
            into.stateSlot( i ).copyFromInternal( right.stateSlot( i ) );
        }
        for ( int i = firstStateToDiffer; i < stateCount; i++ )
        {
            RangeKey leftState = left.stateSlot( i );
            RangeKey rightState = right.stateSlot( i );
            rightState.minimalSplitterInternal( leftState, rightState, into.stateSlot( i ) );
        }
    }

    @Override
    RangeKey stateSlot( int slot )
    {
        return states[slot];
    }
}
