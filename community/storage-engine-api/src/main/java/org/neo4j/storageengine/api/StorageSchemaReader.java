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
package org.neo4j.storageengine.api;

import java.util.Iterator;

import org.neo4j.internal.schema.ConstraintDescriptor;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.internal.schema.IndexType;
import org.neo4j.internal.schema.SchemaDescriptor;

public interface StorageSchemaReader
{

    /**
     * Get the index with the given name.
     * @param name name of index to find.
     * @return {@link IndexDescriptor} associated with the given {@code name}.
     */
    IndexDescriptor indexGetForName( String name );

    /**
     * Get the constraint with the given name.
     * @param name name of the constraint to find.
     * @return {@link ConstraintDescriptor} associated with the given {@code name}.
     */
    ConstraintDescriptor constraintGetForName( String name );

    /**
     * Looks for a stored index by given {@code descriptor}
     *
     * @param descriptor a description of the index.
     * @return iterator of matching {@link IndexDescriptor}s.
     */
    Iterator<IndexDescriptor> indexGetForSchema( SchemaDescriptor descriptor );

    /**
     * Looks for a stored index by given {@code descriptor} and @{code type}
     *
     * @param descriptor a description of the index.
     * @param type an index type
     * @return matching {@link IndexDescriptor} or null.
     */
    IndexDescriptor indexGetForSchemaAndType( SchemaDescriptor descriptor, IndexType type );

    /**
     * @param labelId label to list indexes for.
     * @return {@link IndexDescriptor} associated with the given {@code labelId}.
     */
    Iterator<IndexDescriptor> indexesGetForLabel( int labelId );

    /**
     * @param relationshipType relationship type to list indexes for.
     * @return {@link IndexDescriptor} associated with the given {@code relationshipType}.
     */
    Iterator<IndexDescriptor> indexesGetForRelationshipType( int relationshipType );

    /**
     * @return all {@link IndexDescriptor} in storage.
     */
    Iterator<IndexDescriptor> indexesGetAll();

    /**
     * @param labelId label token id.
     * @return node property constraints associated with the label token id.
     */
    Iterator<ConstraintDescriptor> constraintsGetForLabel( int labelId );

    /**
     * @param typeId relationship type token id .
     * @return relationship property constraints associated with the relationship type token id.
     */
    Iterator<ConstraintDescriptor> constraintsGetForRelationshipType( int typeId );

    /**
     * @return all stored property constraints.
     */
    Iterator<ConstraintDescriptor> constraintsGetAll();
}
