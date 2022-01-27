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
package org.neo4j.values.storable;

import org.neo4j.hashing.HashFunction;
import org.neo4j.values.AnyValue;
import org.neo4j.values.Equality;
import org.neo4j.values.ValueMapper;

/**
 * Not a value.
 *
 * The NULL object of the Value world. Is implemented as a singleton, to allow direct reference equality checks (==),
 * and avoid unnecessary object creation.
 */
public final class NoValue extends Value
{
    public static final NoValue NO_VALUE = new NoValue();

    private NoValue()
    {
    }

    @Override
    public boolean equalTo( Object other )
    {
        return this == other;
    }

    @Override
    public Equality ternaryEquals( AnyValue other )
    {
        return Equality.UNDEFINED;
    }

    @Override
    boolean ternaryUndefined()
    {
        return true;
    }

    @Override
    public <T> T map( ValueMapper<T> mapper )
    {
        return mapper.mapNoValue();
    }

    @Override
    public long updateHash( HashFunction hashFunction, long hash )
    {
        return hashFunction.update( hash, hashCode() );
    }

    @Override
    protected int computeHash()
    {
        return System.identityHashCode( this );
    }

    @Override
    public boolean equals( Value other )
    {
        return this == other;
    }

    @Override
    public <E extends Exception> void writeTo( ValueWriter<E> writer ) throws E
    {
        writer.writeNull();
    }

    @Override
    public Object asObjectCopy()
    {
        return null;
    }

    @Override
    public String toString()
    {
        return prettyPrint();
    }

    @Override
    public String prettyPrint()
    {
        return getTypeName();
    }

    @Override
    public String getTypeName()
    {
        return "NO_VALUE";
    }

    @Override
    public ValueRepresentation valueRepresentation()
    {
        return ValueRepresentation.NO_VALUE;
    }

    @Override
    public NumberType numberType()
    {
        return NumberType.NO_NUMBER;
    }

    @Override
    protected int unsafeCompareTo( Value other )
    {
        return 0;
    }

    @Override
    public long estimatedHeapUsage()
    {
        return 0L;
    }
}
