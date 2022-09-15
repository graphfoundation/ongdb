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
package org.neo4j.kernel.impl.index.schema;

import org.eclipse.collections.api.iterator.LongIterator;

import org.neo4j.collection.PrimitiveLongCollections;
import org.neo4j.collection.PrimitiveLongResourceIterator;
import org.neo4j.internal.kernel.api.PropertyIndexQuery;
import org.neo4j.internal.kernel.api.IndexQueryConstraints;
import org.neo4j.internal.kernel.api.security.AccessMode;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.kernel.api.index.IndexProgressor;
import org.neo4j.values.storable.Value;

/**
 * A {@link IndexProgressor} + {@link IndexProgressor.EntityValueClient} combo presented as a {@link LongIterator}.
 */
public class NodeValueIterator extends PrimitiveLongCollections.AbstractPrimitiveLongBaseIterator
        implements IndexProgressor.EntityValueClient, PrimitiveLongResourceIterator, LongIterator
{
    private boolean closed;
    private IndexProgressor progressor;

    @Override
    protected boolean fetchNext()
    {
        // progressor.next() will progress underlying SeekCursor
        // and feed result into this with node( long reference, Value... values )
        if ( closed || !progressor.next() )
        {
            close();
            return false;
        }
        return true;
    }

    @Override
    public void initialize( IndexDescriptor descriptor, IndexProgressor progressor, AccessMode accessMode,
                            boolean indexIncludesTransactionState, IndexQueryConstraints constraints, PropertyIndexQuery... query )
    {
        this.progressor = progressor;
    }

    @Override
    public boolean acceptEntity( long reference, float score, Value... values )
    {
        return next( reference );
    }

    @Override
    public boolean needsValues()
    {
        return false;
    }

    @Override
    public void close()
    {
        if ( !closed )
        {
            closed = true;
            progressor.close();
            progressor = null;
        }
    }
}
