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
package org.neo4j.kernel.impl.newapi;

import org.neo4j.internal.kernel.api.DefaultCloseListenable;
import org.neo4j.internal.kernel.api.PropertyIndexQuery;
import org.neo4j.internal.kernel.api.IndexQueryConstraints;
import org.neo4j.internal.kernel.api.KernelReadTracer;
import org.neo4j.internal.kernel.api.NodeCursor;
import org.neo4j.internal.kernel.api.NodeValueIndexCursor;
import org.neo4j.internal.kernel.api.security.AccessMode;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.kernel.api.index.IndexProgressor;
import org.neo4j.values.storable.Value;

public class ExtendedNodeValueIndexCursorAdapter extends DefaultCloseListenable implements NodeValueIndexCursor, EntityIndexSeekClient
{
    @Override
    public void closeInternal()
    {

    }

    @Override
    public boolean isClosed()
    {
        return false;
    }

    @Override
    public boolean next()
    {
        return false;
    }

    @Override
    public void node( NodeCursor cursor )
    {

    }

    @Override
    public long nodeReference()
    {
        return 0;
    }

    @Override
    public int numberOfProperties()
    {
        return 0;
    }

    @Override
    public boolean hasValue()
    {
        return false;
    }

    @Override
    public Value propertyValue( int offset )
    {
        return null;
    }

    @Override
    public float score()
    {
        return 0;
    }

    @Override
    public void setRead( Read read )
    {
    }

    @Override
    public void initialize( IndexDescriptor descriptor, IndexProgressor progressor, AccessMode accessMode,
                            boolean indexIncludesTransactionState, IndexQueryConstraints constraints, PropertyIndexQuery... query )
    {
    }

    @Override
    public boolean acceptEntity( long reference, float score, Value... values )
    {
        return false;
    }

    @Override
    public boolean needsValues()
    {
        return false;
    }

    @Override
    public void setTracer( KernelReadTracer tracer )
    {
        throw new UnsupportedOperationException( "not implemented" );
    }

    @Override
    public void removeTracer()
    {
        throw new UnsupportedOperationException( "not implemented" );
    }
}
