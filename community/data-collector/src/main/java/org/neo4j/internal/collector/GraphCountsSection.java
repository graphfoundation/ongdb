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
package org.neo4j.internal.collector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.neo4j.common.EntityType;
import org.neo4j.internal.helpers.collection.Iterators;
import org.neo4j.internal.kernel.api.Read;
import org.neo4j.internal.kernel.api.SchemaRead;
import org.neo4j.internal.kernel.api.TokenRead;
import org.neo4j.internal.kernel.api.exceptions.TransactionFailureException;
import org.neo4j.internal.kernel.api.exceptions.schema.IndexNotFoundKernelException;
import org.neo4j.internal.kernel.api.security.LoginContext;
import org.neo4j.internal.schema.ConstraintDescriptor;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.internal.schema.IndexType;
import org.neo4j.kernel.api.Kernel;
import org.neo4j.kernel.api.KernelTransaction;
import org.neo4j.token.api.NamedToken;

/**
 * The Graph Counts section holds all data that is available form the counts store, plus metadata
 * about the available indexes and constraints. This essentially captures all the knowledge the
 * planner has when planning, meaning that the data from this section could be used to investigate
 * planning problems.
 */
final class GraphCountsSection
{
    private GraphCountsSection()
    { // only static functionality
    }

    static Stream<RetrieveResult> retrieve( Kernel kernel, Anonymizer anonymizer )
            throws TransactionFailureException, IndexNotFoundKernelException
    {
        try ( KernelTransaction tx = kernel.beginTransaction( KernelTransaction.Type.EXPLICIT, LoginContext.AUTH_DISABLED ) )
        {
            TokenRead tokens = tx.tokenRead();
            Read read = tx.dataRead();

            Map<String,Object> data = new HashMap<>();
            data.put( "nodes", nodeCounts( tokens, read, anonymizer ) );
            data.put( "relationships", relationshipCounts( tokens, read, anonymizer ) );
            data.put( "indexes", indexes( tokens, tx.schemaRead(), anonymizer ) );
            data.put( "constraints", constraints( tokens, tx.schemaRead(), anonymizer ) );

            return Stream.of( new RetrieveResult( Sections.GRAPH_COUNTS, data ) );
        }
    }

    private static List<Map<String,Object>> nodeCounts( TokenRead tokens, Read read, Anonymizer anonymizer )
    {
        List<Map<String,Object>> nodeCounts = new ArrayList<>();
        Map<String,Object> nodeCount = new HashMap<>();

        nodeCount.put( "count", read.countsForNodeWithoutTxState( -1 ) );
        nodeCounts.add( nodeCount );

        tokens.labelsGetAllTokens().forEachRemaining( t -> {
            long count = read.countsForNodeWithoutTxState( t.id() );
            Map<String,Object> labelCount = new HashMap<>();
            labelCount.put( "label", anonymizer.label( t.name(), t.id() ) );
            labelCount.put( "count", count );
            nodeCounts.add( labelCount );
        } );

        return nodeCounts;
    }

    private static List<Map<String,Object>> relationshipCounts( TokenRead tokens, Read read, Anonymizer anonymizer )
    {
        List<Map<String,Object>> relationshipCounts = new ArrayList<>();
        Map<String,Object> relationshipCount = new HashMap<>();
        relationshipCount.put( "count", read.countsForRelationshipWithoutTxState( -1, -1, -1 ) );
        relationshipCounts.add( relationshipCount );

        List<NamedToken> labels = Iterators.asList( tokens.labelsGetAllTokens() );

        tokens.relationshipTypesGetAllTokens().forEachRemaining( t -> {
            long count = read.countsForRelationshipWithoutTxState( -1, t.id(), -1 );
            Map<String,Object> relationshipTypeCount = new HashMap<>();
            relationshipTypeCount.put( "relationshipType", anonymizer.relationshipType( t.name(), t.id() ) );
            relationshipTypeCount.put( "count", count );
            relationshipCounts.add( relationshipTypeCount );

            for ( NamedToken label : labels )
            {
                long startCount = read.countsForRelationshipWithoutTxState( label.id(), t.id(), -1 );
                if ( startCount > 0 )
                {
                    Map<String,Object> x = new HashMap<>();
                    x.put( "relationshipType", anonymizer.relationshipType( t.name(), t.id() ) );
                    x.put( "startLabel", anonymizer.label( label.name(), label.id() ) );
                    x.put( "count", startCount );
                    relationshipCounts.add( x );
                }
                long endCount = read.countsForRelationshipWithoutTxState( -1, t.id(), label.id() );
                if ( endCount > 0 )
                {
                    Map<String,Object> x = new HashMap<>();
                    x.put( "relationshipType", anonymizer.relationshipType( t.name(), t.id() ) );
                    x.put( "endLabel", anonymizer.label( label.name(), label.id() ) );
                    x.put( "count", endCount );
                    relationshipCounts.add( x );
                }
            }
        } );

        return relationshipCounts;
    }

    private static List<Map<String,Object>> indexes( TokenRead tokens, SchemaRead schemaRead, Anonymizer anonymizer )
            throws IndexNotFoundKernelException
    {
        List<Map<String,Object>> indexes = new ArrayList<>();

        Iterator<IndexDescriptor> iterator = schemaRead.indexesGetAll();
        while ( iterator.hasNext() )
        {
            IndexDescriptor index = iterator.next();
            IndexType indexType = index.getIndexType();
            if ( indexType == IndexType.FULLTEXT )
            {
                /* For full text indexes, we currently do not return its options, which makes returning information on
                 * this index not useful and if the index type is ignored, this would even be misleading.
                 */
                continue;
            }
            EntityType entityType = index.schema().entityType();
            Map<String,Object> data = new HashMap<>();

            switch ( entityType )
            {
            case NODE:
                data.put( "labels", map( index.schema().getEntityTokenIds(),
                                         id -> anonymizer.label( tokens.labelGetName( id ), id ) ) );
                break;
            case RELATIONSHIP:
                data.put( "relationshipTypes", map( index.schema().getEntityTokenIds(),
                                                    id -> anonymizer.relationshipType( tokens.relationshipTypeGetName( id ), id ) ) );
                break;
            default:
            }

            data.put( "properties", map( index.schema().getPropertyIds(),
                                         id -> anonymizer.propertyKey( tokens.propertyKeyGetName( id ), id ) ) );

            var indexSample = schemaRead.indexSample( index );
            data.put( "totalSize", indexSample.indexSize() );
            data.put( "updatesSinceEstimation", indexSample.updates() );
            data.put( "estimatedUniqueSize", indexSample.uniqueValues() );
            data.put( "indexType", indexType.name() );

            indexes.add( data );
        }

        return indexes;
    }

    private static List<Map<String,Object>> constraints( TokenRead tokens, SchemaRead schemaRead, Anonymizer anonymizer )
    {
        List<Map<String,Object>> constraints = new ArrayList<>();

        Iterator<ConstraintDescriptor> iterator = schemaRead.constraintsGetAll();
        while ( iterator.hasNext() )
        {
            ConstraintDescriptor constraint = iterator.next();
            EntityType entityType = constraint.schema().entityType();
            Map<String,Object> data = new HashMap<>();

            data.put( "properties", map( constraint.schema().getPropertyIds(),
                    id -> anonymizer.propertyKey( tokens.propertyKeyGetName( id ), id ) ) );
            data.put( "type", constraintType( constraint ) );
            int entityTokenId = constraint.schema().getEntityTokenIds()[0];

            switch ( entityType )
            {
            case NODE:
                data.put( "label", anonymizer.label( tokens.labelGetName( entityTokenId ), entityTokenId ) );
                constraints.add( data );
                break;
            case RELATIONSHIP:
                data.put( "relationshipType", anonymizer.relationshipType( tokens.relationshipTypeGetName( entityTokenId ), entityTokenId ) );
                constraints.add( data );
                break;
            default:
            }
        }

        return constraints;
    }

    private static List<String> map( int[] ids, IntFunction<String> f )
    {
        return Arrays.stream(ids).mapToObj( f ).collect( Collectors.toList());
    }

    private static String constraintType( ConstraintDescriptor constraint )
    {
        switch ( constraint.type() )
        {
        case EXISTS:
            return "Existence constraint";
        case UNIQUE:
            return "Uniqueness constraint";
        case UNIQUE_EXISTS:
            return "Node Key";
        default:
            throw new IllegalArgumentException( "Unknown constraint type: " + constraint.type() );
        }
    }
}
