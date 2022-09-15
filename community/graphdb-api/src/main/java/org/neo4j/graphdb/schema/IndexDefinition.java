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
package org.neo4j.graphdb.schema;

import java.util.Map;

import org.neo4j.annotations.api.PublicApi;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.RelationshipType;

/**
 * Definition for an index.
 */
@PublicApi
public interface IndexDefinition
{
    /**
     * Return the set of node labels (in no particular order) that this index applies to. This method works for both {@link #isMultiTokenIndex() multi-token}
     * indexes, and "single-token" indexes.
     * <p>
     * Note that this assumes that this is a node index (that {@link #isNodeIndex()} returns {@code true}). If this is not the case, then an
     * {@link IllegalStateException} is thrown.
     *
     * @return the set of {@link Label labels} this index definition is associated with.
     */
    Iterable<Label> getLabels();

    /**
     * Return the set of relationship types (in no particular order) that this index applies to. This method works for both
     * {@link #isMultiTokenIndex() mult-token} indexes, and "single-token" indexes.
     * <p>
     * Note that this assumes that this is a relationship index (that {@link #isRelationshipIndex()} returns {@code true}). If thisk is not the case, then an
     * {@link IllegalStateException} is thrown.
     *
     * @return the set of {@link RelationshipType relationship types} this index definition is associated with.
     */
    Iterable<RelationshipType> getRelationshipTypes();

    /**
     * Return the set of properties that are indexed by this index.
     * <p>
     * Most indexes will only have a single property, but {@link #isCompositeIndex() composite indexes} will have multiple properties.
     *
     * @return the property keys this index was created on.
     * @see #isCompositeIndex()
     */
    Iterable<String> getPropertyKeys();

    /**
     * Get the {@linkplain IndexType index type} of this index.
     * @return The {@link IndexType} this index was defined with.
     */
    IndexType getIndexType();

    /**
     * Drops this index. {@link Schema#getIndexes(Label)} will no longer include this index
     * and any related background jobs and files will be stopped and removed.
     */
    void drop();

    /**
     * @return {@code true} if this index is created as a side effect of the creation of a uniqueness constraint.
     */
    boolean isConstraintIndex();

    /**
     * @return {@code true} if this index is indexing nodes, otherwise {@code false}.
     */
    boolean isNodeIndex();

    /**
     * @return {@code true} if this index is indexing relationships, otherwise {@code false}.
     */
    boolean isRelationshipIndex();

    /**
     * A multi-token index is an index that indexes nodes or relationships that have any or all of a given set of labels or relationship types, respectively.
     * <p>
     * For instance, a multi-token index could apply to all {@code Movie} and {@code Book} nodes that have a {@code description} property. A node or
     * relationship do not need to have all of the labels or relationship types for it to be indexed. A node that has any of the given labels, or a relationship
     * that has any of the given relationship types, will be a candidate for indexing, depending on their properties.
     *
     * @return {@code true} if this is a multi-token index.
     */
    boolean isMultiTokenIndex();

    /**
     * A composite index is an index that indexes nodes or relationships by more than one property.
     * <p>
     * For instance, a composite index for {@code PhoneNumber} nodes could be indexing the {@code country_code}, {@code area_code}, {@code prefix},
     * and {@code line_number}.
     *
     * <strong>Note:</strong> it is index-implementation specific if a node or relationship must have all of the properties in order to be indexable,
     * or if having any of the properties is enough for the given node or relationship to be indexed. For instance, {@code NODE KEY} constraint indexes
     * require that all of the properties be present on a node before it will be included in the index, while a full-text index will index nodes or
     * relationships that have any of the given properties.
     *
     * @return {@code true} if this is a composite index.
     */
    boolean isCompositeIndex();

    /**
     * Get the name given to this index when it was created.
     * Indexes that were not explicitly given a name at creation, will have an auto-generated name.
     * @return the unique name of the index.
     */
    String getName();

    /**
     * Get the index configuration that this index was created with.
     * @return The index configuration as a read-only map.
     */
    Map<IndexSetting,Object> getIndexConfiguration();
}
