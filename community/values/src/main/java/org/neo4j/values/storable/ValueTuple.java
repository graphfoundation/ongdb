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
package org.neo4j.values.storable;

import java.util.Comparator;

import static org.neo4j.memory.HeapEstimator.shallowSizeOf;
import static org.neo4j.memory.HeapEstimator.shallowSizeOfInstance;
import static org.neo4j.util.Preconditions.requireNoNullElements;
import static org.neo4j.util.Preconditions.requireNonEmpty;
import static org.neo4j.values.utils.ValueMath.HASH_CONSTANT;

/**
 * A tuple of n values.
 */
public class ValueTuple
{
    private static final long SHALLOW_SIZE = shallowSizeOfInstance( ValueTuple.class );

    public static ValueTuple of( Value... values )
    {
        return new ValueTuple( values );
    }

    public static ValueTuple of( Object... objects )
    {
        Value[] values = new Value[objects.length];
        for ( int i = 0; i < values.length; i++ )
        {
            values[i] = Values.of( objects[i], false );
        }
        return new ValueTuple( values );
    }

    private final Value[] values;

    protected ValueTuple( Value[] values )
    {
        requireNonEmpty( values );
        requireNoNullElements( values );
        this.values = values;
    }

    public int size()
    {
        return values.length;
    }

    public Value valueAt( int offset )
    {
        return values[offset];
    }

    /**
     * WARNING: this method does not create a defensive copy. Do not modify the returned array.
     */
    public Value[] getValues()
    {
        return values;
    }

    /**
     * Get the "shallow" size of the tuple, this includes the object overhead and the backing array, but not the retained values.
     */
    public long getShallowSize()
    {
        return SHALLOW_SIZE + shallowSizeOf( values );
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

        ValueTuple that = (ValueTuple) o;

        if ( that.values.length != values.length )
        {
            return false;
        }

        for ( int i = 0; i < values.length; i++ )
        {
            if ( !values[i].equals( that.values[i] ) )
            {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode()
    {
        int result = 1;
        for ( Object value : values )
        {
            result = HASH_CONSTANT * result + value.hashCode();
        }
        return result;
    }

    public Value getOnlyValue()
    {
        assert values.length == 1 : "Assumed single value tuple, but had " + values.length;
        return values[0];
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        String sep = "( ";
        for ( Value value : values )
        {
            sb.append( sep );
            sep = ", ";
            sb.append( value );
        }
        sb.append( " )" );
        return sb.toString();
    }

    public static final Comparator<ValueTuple> COMPARATOR = ( left, right ) ->
    {
        if ( left.values.length != right.values.length )
        {
            throw new IllegalStateException( "Comparing two ValueTuples of different lengths!" );
        }

        int compare = 0;
        for ( int i = 0; i < left.values.length; i++ )
        {
            compare = Values.COMPARATOR.compare( left.valueAt( i ), right.valueAt( i ) );
            if ( compare != 0 )
            {
                return compare;
            }
        }
        return compare;
    };
}
