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
package org.neo4j.kernel.impl.coreapi.schema;

import org.neo4j.exceptions.KernelException;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.schema.AnyTokens;
import org.neo4j.graphdb.schema.ConstraintDefinition;
import org.neo4j.graphdb.schema.IndexDefinition;
import org.neo4j.graphdb.schema.IndexType;
import org.neo4j.internal.schema.ConstraintDescriptor;
import org.neo4j.internal.schema.IndexConfig;
import org.neo4j.internal.schema.IndexDescriptor;

/**
 * Implementations are used to configure {@link IndexCreatorImpl} and {@link BaseNodeConstraintCreator} for re-use
 * by both the graph database and the batch inserter.
 */
public interface InternalSchemaActions
{
    IndexDefinition createIndexDefinition( Label[] label, String indexName, IndexType indexType, IndexConfig indexConfig, String... propertyKey );

    IndexDefinition createIndexDefinition( RelationshipType[] types, String indexName, IndexType indexType, IndexConfig indexConfig, String... propertyKey );

    IndexDefinition createIndexDefinition( AnyTokens tokens, String indexName, IndexConfig indexConfig );

    void dropIndexDefinitions( IndexDefinition indexDefinition );

    ConstraintDefinition createPropertyUniquenessConstraint( IndexDefinition indexDefinition, String name, IndexType indexType, IndexConfig indexConfig );

    ConstraintDefinition createNodeKeyConstraint( IndexDefinition indexDefinition, String name, IndexType indexType, IndexConfig indexConfig );

    ConstraintDefinition createPropertyExistenceConstraint( String name, Label label, String... propertyKey );

    ConstraintDefinition createPropertyExistenceConstraint( String name, RelationshipType type, String propertyKey );

    void dropConstraint( ConstraintDescriptor constraint );

    String getUserMessage( KernelException e );

    String getUserDescription( IndexDescriptor index );

    void assertInOpenTransaction();
}
