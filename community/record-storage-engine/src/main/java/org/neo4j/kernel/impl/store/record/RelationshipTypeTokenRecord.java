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

public class RelationshipTypeTokenRecord extends TokenRecord
{
    public static final long SHALLOW_SIZE = shallowSizeOfInstance( RelationshipTypeTokenRecord.class );

    public RelationshipTypeTokenRecord( int id )
    {
        super( id );
    }

    public RelationshipTypeTokenRecord( RelationshipTypeTokenRecord other )
    {
        super( other );
    }

    @Override
    public RelationshipTypeTokenRecord initialize( boolean inUse, int nameId )
    {
        super.initialize( inUse, nameId );
        return this;
    }

    @Override
    protected String simpleName()
    {
        return "RelationshipType";
    }

    @Override
    public RelationshipTypeTokenRecord copy()
    {
        return new RelationshipTypeTokenRecord( this );
    }
}
