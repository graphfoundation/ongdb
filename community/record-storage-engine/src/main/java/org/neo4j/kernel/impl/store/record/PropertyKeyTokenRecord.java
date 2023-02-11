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
package org.neo4j.kernel.impl.store.record;

import static org.neo4j.memory.HeapEstimator.shallowSizeOfInstance;

public class PropertyKeyTokenRecord extends TokenRecord
{
    public static final long SHALLOW_SIZE = shallowSizeOfInstance( PropertyKeyTokenRecord.class );
    private int propCount;

    public PropertyKeyTokenRecord( int id )
    {
        super( id );
    }

    public PropertyKeyTokenRecord( PropertyKeyTokenRecord other )
    {
        super( other );
        this.propCount = other.propCount;
    }

    public PropertyKeyTokenRecord initialize( boolean inUse, int nameId, int propertyCount )
    {
        super.initialize( inUse, nameId );
        this.propCount = propertyCount;
        return this;
    }

    @Override
    public void clear()
    {
        super.clear();
        propCount = 0;
    }

    @Override
    protected String simpleName()
    {
        return "PropertyKey";
    }

    public int getPropertyCount()
    {
        return propCount;
    }

    public void setPropertyCount( int count )
    {
        this.propCount = count;
    }

    @Override
    protected void additionalToString( StringBuilder buf )
    {
        buf.append( ",propCount=" ).append( propCount );
    }

    @Override
    public PropertyKeyTokenRecord copy()
    {
        return new PropertyKeyTokenRecord( this );
    }
}
