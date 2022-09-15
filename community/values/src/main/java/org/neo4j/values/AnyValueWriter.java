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
package org.neo4j.values;

import org.neo4j.values.storable.TextArray;
import org.neo4j.values.storable.TextValue;
import org.neo4j.values.storable.ValueWriter;
import org.neo4j.values.virtual.MapValue;
import org.neo4j.values.virtual.NodeValue;
import org.neo4j.values.virtual.RelationshipValue;

/**
 * Writer of any values.
 */
public interface AnyValueWriter<E extends Exception> extends ValueWriter<E>
{
    enum EntityMode
    {
        REFERENCE,
        FULL
    }

    /**
     * Returns the wanted {@link EntityMode} of this AnyValueWriter.
     *
     * A returned {@link EntityMode#REFERENCE} signals to all entity-values that they should callback using {@link #writeNodeReference(long)} or
     * {@link #writeRelationshipReference(long)} even if the whole entity is available.
     *
     * A returned {@link EntityMode#FULL} signals to all entity-values that they can callback using either
     *      {@link #writeNodeReference(long)},
     *      {@link #writeNode(long, TextArray, MapValue, boolean)},
     *      {@link #writeRelationshipReference(long)}
     *   or {@link #writeRelationship(long, long, long, TextValue, MapValue, boolean)}
     * depending on how much information is available to the value instance.
     */
    EntityMode entityMode();

    void writeNodeReference( long nodeId ) throws E;

    void writeNode( long nodeId, TextArray labels, MapValue properties, boolean isDeleted ) throws E;

    void writeRelationshipReference( long relId ) throws E;

    void writeRelationship( long relId, long startNodeId, long endNodeId, TextValue type, MapValue properties, boolean isDeleted ) throws E;

    void beginMap( int size ) throws E;

    void endMap() throws E;

    void beginList( int size ) throws E;

    void endList() throws E;

    void writePathReference( long[] nodes, long[] relationships ) throws E;

    void writePath( NodeValue[] nodes, RelationshipValue[] relationships ) throws E;

    default void writeVirtualNodeHack( Object node )
    {
        // do nothing, this is an ugly hack.
    }

    default void writeVirtualRelationshipHack( Object relationship )
    {
        // do nothing, this is an ugly hack.
    }
}
