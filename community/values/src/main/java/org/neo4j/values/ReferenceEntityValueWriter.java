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
package org.neo4j.values;

import org.neo4j.values.storable.TextArray;
import org.neo4j.values.storable.TextValue;
import org.neo4j.values.virtual.MapValue;

/**
 * AnyValueWriter that only supports entity references.
 */
public abstract class ReferenceEntityValueWriter<E extends Exception> implements AnyValueWriter<E>
{
    @Override
    public final EntityMode entityMode()
    {
        return EntityMode.REFERENCE;
    }

    @Override
    public final void writeNode( long nodeId, TextArray labels, MapValue properties, boolean isDeleted ) throws E
    {
        throw new IllegalStateException( "Cannot write full node to ReferenceEntityValueWriter" );
    }

    @Override
    public final void writeRelationship( long relId, long startNodeId, long endNodeId, TextValue type, MapValue properties, boolean isDeleted ) throws E
    {
        throw new IllegalStateException( "Cannot write full node to ReferenceEntityValueWriter" );
    }
}
