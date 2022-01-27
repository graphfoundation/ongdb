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
package org.neo4j.graphdb.schema;

import java.util.Map;

import org.neo4j.annotations.api.PublicApi;
import org.neo4j.graphdb.ConstraintViolationException;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;

/**
 * A builder for entering details about an index to create. After all details have been entered
 * {@link #create()} must be called for the index to actually be created. An index creator knows
 * which {@link Label label} it is to be created for.
 * <p>
 * All methods except {@link #create()} will return an {@link IndexCreator} which should be
 * used for further interaction.
 *
 * @see Schema
 */
@PublicApi
public interface IndexCreator
{
    /**
     * Includes the given {@code propertyKey} in this index, such that {@link Node nodes} with
     * the assigned {@link Label label} and this property key will have its values indexed.
     * <p>
     * NOTE: currently only a single property key per index is supported.
     *
     * @param propertyKey the property key to include in this index to be created.
     * @return an {@link IndexCreator} instance to be used for further interaction.
     */
    IndexCreator on( String propertyKey );

    /**
     * Assign a name to the index, which will then be returned from {@link IndexDefinition#getName()}, and can be used for finding the index with
     * {@link Schema#getIndexByName(String)}.
     *
     * @param indexName the name to give the index.
     * @return an {@link IndexCreator} instance to be used for further interaction.
     */
    IndexCreator withName( String indexName );

    /**
     * Specify the type of index to be created.
     * <p>
     * By default, the {@link IndexType#BTREE} will be used.
     * See the documentation on {@link IndexType} for more information about the different index types.
     *
     * @param type the desired index type.
     * @return an {@link IndexCreator} instance to be used for further interaction.
     */
    IndexCreator withIndexType( IndexType type );

    /**
     * Set index-specific index configurations.
     * <p>
     * This call will override the settings from any previous call to this method.
     *
     * @param indexConfiguration The index settings in the index configuration that differ from their defaults.
     * @return an {@link IndexCreator} instance to be used for further interaction.
     */
    IndexCreator withIndexConfiguration( Map<IndexSetting,Object> indexConfiguration );

    /**
     * Creates an index with the details specified by the other methods in this interface.
     *
     * @return the created {@link IndexDefinition index}.
     * @throws ConstraintViolationException if creating this index would violate one or more constraints.
     */
    IndexDefinition create() throws ConstraintViolationException;
}
