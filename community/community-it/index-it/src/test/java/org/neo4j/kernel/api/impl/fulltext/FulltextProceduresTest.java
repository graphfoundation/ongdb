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
package org.neo4j.kernel.api.impl.fulltext;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.lucene.analysis.miscellaneous.ASCIIFoldingFilter;
import org.eclipse.collections.api.set.primitive.MutableLongSet;
import org.eclipse.collections.impl.set.mutable.primitive.LongHashSet;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.neo4j.configuration.Config;
import org.neo4j.consistency.ConsistencyCheckService;
import org.neo4j.consistency.checking.full.ConsistencyFlags;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.QueryExecutionException;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.ResourceIterator;
import org.neo4j.graphdb.Result;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.schema.IndexDefinition;
import org.neo4j.graphdb.schema.IndexSetting;
import org.neo4j.graphdb.schema.IndexSettingImpl;
import org.neo4j.graphdb.schema.IndexType;
import org.neo4j.internal.helpers.collection.Iterables;
import org.neo4j.internal.helpers.progress.ProgressMonitorFactory;
import org.neo4j.io.IOUtils;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.kernel.api.exceptions.schema.RepeatedLabelInSchemaException;
import org.neo4j.kernel.api.exceptions.schema.RepeatedPropertyInSchemaException;
import org.neo4j.kernel.api.exceptions.schema.RepeatedRelationshipTypeInSchemaException;
import org.neo4j.kernel.impl.index.schema.FulltextIndexProviderFactory;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.procedure.builtin.FulltextProcedures;
import org.neo4j.test.ThreadTestUtils;
import org.neo4j.util.concurrent.BinaryLatch;
import org.neo4j.values.storable.Value;

import static java.lang.String.format;
import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.eclipse.collections.impl.set.mutable.primitive.LongHashSet.newSetWith;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.internal.helpers.collection.Iterables.stream;
import static org.neo4j.kernel.api.impl.fulltext.FulltextIndexProceduresUtil.AWAIT_REFRESH;
import static org.neo4j.kernel.api.impl.fulltext.FulltextIndexProceduresUtil.DB_AWAIT_INDEX;
import static org.neo4j.kernel.api.impl.fulltext.FulltextIndexProceduresUtil.DROP;
import static org.neo4j.kernel.api.impl.fulltext.FulltextIndexProceduresUtil.LIST_AVAILABLE_ANALYZERS;
import static org.neo4j.kernel.api.impl.fulltext.FulltextIndexProceduresUtil.NODE_CREATE;
import static org.neo4j.kernel.api.impl.fulltext.FulltextIndexProceduresUtil.RELATIONSHIP_CREATE;
import static org.neo4j.kernel.api.impl.fulltext.FulltextIndexProceduresUtil.SHOW_FULLTEXT_INDEXES;
import static org.neo4j.kernel.api.impl.fulltext.FulltextIndexProceduresUtil.asStrList;
import static org.neo4j.kernel.api.impl.fulltext.analyzer.StandardFoldingAnalyzer.NON_ASCII_LETTERS;

class FulltextProceduresTest extends FulltextProceduresTestSupport
{

    private static Stream<Arguments> fulltextTypeProvider()
    {
        return Stream.of(
                Arguments.of( "For nodes", NODE_CREATE ),
                Arguments.of( "For relationships", RELATIONSHIP_CREATE )
        );
    }

    @ParameterizedTest( name = "{0}" )
    @MethodSource( "fulltextTypeProvider" )
    void createFulltextIndex( String name, String indexCreateMethod )
    {
        try ( Transaction tx = db.beginTx() )
        {
            tx.execute( format( indexCreateMethod, "test-index", asStrList( "EntityToken1", "EntityToken2" ), asStrList( "prop1", "prop2" ) ) ).close();
            tx.commit();
        }
        Result result;
        Map<String,Object> row;
        try ( Transaction tx = db.beginTx() )
        {
            result = tx.execute( SHOW_FULLTEXT_INDEXES );
            assertTrue( result.hasNext() );
            row = result.next();
            assertEquals( asList( "EntityToken1", "EntityToken2" ), row.get( "labelsOrTypes" ) );
            assertEquals( asList( "prop1", "prop2" ), row.get( "properties" ) );
            assertEquals( "test-index", row.get( "name" ) );
            assertEquals( "FULLTEXT", row.get( "type" ) );
            assertFalse( result.hasNext() );
            result.close();
            tx.commit();
        }
        awaitIndexesOnline();
        try ( Transaction tx = db.beginTx() )
        {
            result = tx.execute( SHOW_FULLTEXT_INDEXES );
            assertTrue( result.hasNext() );
            assertEquals( "ONLINE", result.next().get( "state" ) );
            assertFalse( result.hasNext() );
            result.close();
            assertNotNull( tx.schema().getIndexByName( "test-index" ) );
            tx.commit();
        }
        restartDatabase();
        try ( Transaction tx = db.beginTx() )
        {
            result = tx.execute( SHOW_FULLTEXT_INDEXES );
            assertTrue( result.hasNext() );
            row = result.next();
            assertEquals( asList( "EntityToken1", "EntityToken2" ), row.get( "labelsOrTypes" ) );
            assertEquals( asList( "prop1", "prop2" ), row.get( "properties" ) );
            assertEquals( "test-index", row.get( "name" ) );
            assertEquals( "FULLTEXT", row.get( "type" ) );
            assertEquals( "ONLINE", row.get( "state" ) );
            assertFalse( result.hasNext() );
            //noinspection ConstantConditions
            assertFalse( result.hasNext() );
            assertNotNull( tx.schema().getIndexByName( "test-index" ) );
            tx.commit();
        }
    }

    @Test
    void dropIndexInTheSameTransaction()
    {
        try ( Transaction tx = db.beginTx() )
        {
            tx.execute( format( NODE_CREATE, DEFAULT_NODE_IDX_NAME, asStrList( "Label1", "Label2" ), asStrList( "prop1", "prop2" ) ) ).close();
            tx.execute( format( RELATIONSHIP_CREATE, DEFAULT_REL_IDX_NAME, asStrList( "Reltype1", "Reltype2" ), asStrList( "prop1", "prop2" ) ) ).close();

            Set<String> indexes = new HashSet<>();

            tx.execute( SHOW_FULLTEXT_INDEXES ).forEachRemaining( m -> indexes.add( (String) m.get( "name" ) ) );
            assertThat( indexes ).containsExactly( DEFAULT_NODE_IDX_NAME, DEFAULT_REL_IDX_NAME );
            indexes.clear();

            tx.execute( format( DROP, DEFAULT_NODE_IDX_NAME ) );
            tx.execute( SHOW_FULLTEXT_INDEXES ).forEachRemaining( m -> indexes.add( (String) m.get( "name" ) ) );
            assertThat( indexes ).containsExactly( DEFAULT_REL_IDX_NAME );
            indexes.clear();

            tx.execute( format( DROP, DEFAULT_REL_IDX_NAME ) );
            tx.execute( SHOW_FULLTEXT_INDEXES ).forEachRemaining( m -> indexes.add( (String) m.get( "name" ) ) );
            assertThat( indexes ).isEmpty();

            tx.commit();
        }
    }

    @Test
    void dropIndex()
    {
        long indexesBefore = indexesCount();
        try ( Transaction tx = db.beginTx() )
        {
            tx.execute( format( NODE_CREATE, DEFAULT_NODE_IDX_NAME, asStrList( "Label1", "Label2" ), asStrList( "prop1", "prop2" ) ) ).close();
            tx.execute( format( RELATIONSHIP_CREATE, DEFAULT_REL_IDX_NAME, asStrList( "Reltype1", "Reltype2" ), asStrList( "prop1", "prop2" ) ) ).close();
            tx.commit();
        }

        try ( Transaction tx = db.beginTx() )
        {
            Set<String> indexes = new HashSet<>();
            tx.execute( SHOW_FULLTEXT_INDEXES ).forEachRemaining( m -> indexes.add( (String) m.get( "name" ) ) );
            assertThat( indexes ).containsExactly( DEFAULT_NODE_IDX_NAME, DEFAULT_REL_IDX_NAME );

            tx.execute( format( DROP, DEFAULT_NODE_IDX_NAME ) );
            tx.commit();
        }

        try ( Transaction tx = db.beginTx() )
        {
            Set<String> indexes = new HashSet<>();
            tx.execute( SHOW_FULLTEXT_INDEXES ).forEachRemaining( m -> indexes.add( (String) m.get( "name" ) ) );
            assertThat( indexes ).containsExactly( DEFAULT_REL_IDX_NAME );

            tx.execute( format( DROP, DEFAULT_REL_IDX_NAME ) );
            tx.commit();
        }

        assertThat( indexesCount() ).isEqualTo( indexesBefore );
    }

    @Test
    void mustNotBeAbleToCreateTwoIndexesWithSameName()
    {
        try ( Transaction tx = db.beginTx() )
        {
            tx.execute( format( NODE_CREATE, DEFAULT_NODE_IDX_NAME, asStrList( "Label1", "Label2" ), asStrList( "prop1", "prop2" ) ) ).close();
            tx.commit();
        }

        Exception e = assertThrows( QueryExecutionException.class, () ->
        {
            try ( Transaction tx = db.beginTx() )
            {
                tx.execute( format( NODE_CREATE, DEFAULT_NODE_IDX_NAME, asStrList( "Label1", "Label2" ), asStrList( "prop3", "prop4" ) ) ).close();
                tx.commit();
            }
        } );
        assertThat( e ).hasMessageContaining( "There already exists an index called '" + DEFAULT_NODE_IDX_NAME + "'." );
    }

    @Test
    void mustNotBeAbleToCreateNormalIndexWithSameNameAndSchemaAsExistingFulltextIndex()
    {
        try ( Transaction tx = db.beginTx() )
        {
            tx.execute( format( NODE_CREATE, DEFAULT_NODE_IDX_NAME, asStrList( "Label1" ), asStrList( "prop1" ) ) ).close();
            tx.commit();
        }
        Exception e = assertThrows( QueryExecutionException.class, () ->
        {
            try ( Transaction tx = db.beginTx() )
            {
                tx.execute( "CREATE INDEX `" + DEFAULT_NODE_IDX_NAME + "` FOR (n:Label1) ON (n.prop1)" ).close();
                tx.commit();
            }
        } );
        assertThat( e ).hasMessageContaining( "There already exists an index called '" + DEFAULT_NODE_IDX_NAME + "'." );
    }

    @Test
    void mustNotBeAbleToCreateNormalIndexWithSameNameDifferentSchemaAsExistingFulltextIndex()
    {
        try ( Transaction tx = db.beginTx() )
        {
            tx.execute( format( NODE_CREATE, DEFAULT_NODE_IDX_NAME, asStrList( "Label1" ), asStrList( "prop1", "prop2" ) ) ).close();
            tx.commit();
        }
        Exception e = assertThrows( QueryExecutionException.class, () ->
        {
            try ( Transaction tx = db.beginTx() )
            {
                tx.execute( "CREATE INDEX `" + DEFAULT_NODE_IDX_NAME + "` FOR (n:Label1) ON (n.prop1)" ).close();
                tx.commit();
            }
        } );
        assertThat( e ).hasMessageContaining( "There already exists an index called '" + DEFAULT_NODE_IDX_NAME + "'." );
    }

    @Test
    void mustNotBeAbleToCreateFulltextIndexWithSameNameAndSchemaAsExistingNormalIndex()
    {
        try ( Transaction tx = db.beginTx() )
        {
            tx.execute( "CREATE INDEX `" + DEFAULT_NODE_IDX_NAME + "` FOR (n:Label1) ON (n.prop1)" ).close();
            tx.commit();
        }
        Exception e = assertThrows( QueryExecutionException.class, () ->
        {
            try ( Transaction tx = db.beginTx() )
            {
                tx.execute( format( NODE_CREATE, DEFAULT_NODE_IDX_NAME, asStrList( "Label1" ), asStrList( "prop1" ) ) ).close();
                tx.commit();
            }
        } );
        assertThat( e ).hasMessageContaining( "There already exists an index called '" + DEFAULT_NODE_IDX_NAME + "'." );
    }

    @Test
    void mustNotBeAbleToCreateFulltextIndexWithSameNameDifferentSchemaAsExistingNormalIndex()
    {
        try ( Transaction tx = db.beginTx() )
        {
            tx.execute( "CREATE INDEX `" + DEFAULT_NODE_IDX_NAME + "` FOR (n:Label1) ON (n.prop1)" ).close();
            tx.commit();
        }
        Exception e = assertThrows( QueryExecutionException.class, () ->
        {
            try ( Transaction tx = db.beginTx() )
            {
                tx.execute( format( NODE_CREATE, DEFAULT_NODE_IDX_NAME, asStrList( "Label1" ), asStrList( "prop1", "prop2" ) ) ).close();
                tx.commit();
            }
        } );
        assertThat( e ).hasMessageContaining( "There already exists an index called '" + DEFAULT_NODE_IDX_NAME + "'." );
    }

    @Test
    void nodeIndexesMustHaveLabels()
    {
        Exception e = assertThrows( QueryExecutionException.class, () ->
        {
            try ( Transaction tx = db.beginTx() )
            {
                tx.execute( format( NODE_CREATE, "nodeIndex", asStrList(), asStrList( PROP ) ) ).close();
            }
        } );

        assertThat( e ).hasMessageContaining( "Schema descriptor must have at least one label." );
    }

    @Test
    void relationshipIndexesMustHaveRelationshipTypes()
    {
        Exception e = assertThrows( QueryExecutionException.class, () ->
        {
            try ( Transaction tx = db.beginTx() )
            {
                tx.execute( format( RELATIONSHIP_CREATE, "relIndex", asStrList(), asStrList( PROP ) ) );
            }
        } );

        assertThat( e ).hasMessageContaining( "Schema descriptor must have at least one relationship type." );
    }

    @ParameterizedTest( name = "{0}" )
    @MethodSource( "fulltextTypeProvider" )
    void indexesMustHaveProperties( String name, String indexCreateMethod )
    {
        Exception e = assertThrows( QueryExecutionException.class, () ->
        {
            try ( Transaction tx = db.beginTx() )
            {
                tx.execute( format( indexCreateMethod, "index", asStrList( "EntityToken" ), asStrList() ) ).close();
            }
        } );

        assertThat( e ).hasMessageContaining( "An index needs at least one property key to index" );
    }

    @Test
    void creatingIndexesWhichImpliesTokenCreateMustNotBlockForever()
    {
        try ( Transaction tx = db.beginTx() )
        {
            // The property keys and labels we ask for do not exist, so those tokens will have to be allocated.
            // This test verifies that the locking required for the index modifications do not conflict with the
            // locking required for the token allocation.
            tx.execute( format( NODE_CREATE, "nodesA", asStrList( "SOME_LABEL" ), asStrList( "this" ) ) );
            tx.execute( format( RELATIONSHIP_CREATE, "relsA", asStrList( "SOME_REL_TYPE" ), asStrList( "foo" ) ) );
            tx.execute( format( NODE_CREATE, "nodesB", asStrList( "SOME_OTHER_LABEL" ), asStrList( "that" ) ) );
            tx.execute( format( RELATIONSHIP_CREATE, "relsB", asStrList( "SOME_OTHER_REL_TYPE" ), asStrList( "bar" ) ) );

            tx.commit();
        }
    }

    @Test
    void creatingIndexWithSpecificAnalyzerMustUseThatAnalyzerForPopulationUpdatingAndQuerying()
    {
        LongHashSet noResults = new LongHashSet();
        LongHashSet swedishNodes = new LongHashSet();
        LongHashSet englishNodes = new LongHashSet();
        LongHashSet swedishRels = new LongHashSet();
        LongHashSet englishRels = new LongHashSet();

        String labelledSwedishNodes = "labelledSwedishNodes";
        String typedSwedishRelationships = "typedSwedishRelationships";

        try ( Transaction tx = db.beginTx() )
        {
            // Nodes and relationships picked up by index population.
            Node nodeA = tx.createNode( LABEL );
            nodeA.setProperty( PROP, "En apa och en tomte bodde i ett hus." );
            swedishNodes.add( nodeA.getId() );
            Node nodeB = tx.createNode( LABEL );
            nodeB.setProperty( PROP, "Hello and hello again, in the end." );
            englishNodes.add( nodeB.getId() );
            Relationship relA = nodeA.createRelationshipTo( nodeB, REL );
            relA.setProperty( PROP, "En apa och en tomte bodde i ett hus." );
            swedishRels.add( relA.getId() );
            Relationship relB = nodeB.createRelationshipTo( nodeA, REL );
            relB.setProperty( PROP, "Hello and hello again, in the end." );
            englishRels.add( relB.getId() );
            tx.commit();
        }
        try ( Transaction tx = db.beginTx() )
        {
            String lbl = asStrList( LABEL.name() );
            String rel = asStrList( REL.name() );
            String props = asStrList( PROP );
            String swedish = props + ", {analyzer: '" + FulltextAnalyzerTest.SWEDISH + "'}";
            tx.execute( format( NODE_CREATE, labelledSwedishNodes, lbl, swedish ) ).close();
            tx.execute( format( RELATIONSHIP_CREATE, typedSwedishRelationships, rel, swedish ) ).close();
            tx.commit();
        }
        awaitIndexesOnline();
        try ( Transaction tx = db.beginTx() )
        {
            // Nodes and relationships picked up by index updates.
            Node nodeC = tx.createNode( LABEL );
            nodeC.setProperty( PROP, "En apa och en tomte bodde i ett hus." );
            swedishNodes.add( nodeC.getId() );
            Node nodeD = tx.createNode( LABEL );
            nodeD.setProperty( PROP, "Hello and hello again, in the end." );
            englishNodes.add( nodeD.getId() );
            Relationship relC = nodeC.createRelationshipTo( nodeD, REL );
            relC.setProperty( PROP, "En apa och en tomte bodde i ett hus." );
            swedishRels.add( relC.getId() );
            Relationship relD = nodeD.createRelationshipTo( nodeC, REL );
            relD.setProperty( PROP, "Hello and hello again, in the end." );
            englishRels.add( relD.getId() );
            tx.commit();
        }
        assertQueryFindsIds( db, true, labelledSwedishNodes, "and", englishNodes ); // english word
        // swedish stop word (ignored by swedish analyzer, and not among the english nodes)
        assertQueryFindsIds( db, true, labelledSwedishNodes, "ett", noResults );
        assertQueryFindsIds( db, true, labelledSwedishNodes, "apa", swedishNodes ); // swedish word

        assertQueryFindsIds( db, false, typedSwedishRelationships, "and", englishRels );
        assertQueryFindsIds( db, false, typedSwedishRelationships, "ett", noResults );
        assertQueryFindsIds( db, false, typedSwedishRelationships, "apa", swedishRels );
    }

    @Test
    void mustFailToCreateIndexWithUnknownAnalyzer()
    {
        try ( Transaction tx = db.beginTx() )
        {
            String label = asStrList( LABEL.name() );
            String props = asStrList( PROP );
            String analyzer = props + ", {analyzer: 'blablalyzer'}";

            Exception e = assertThrows( QueryExecutionException.class, () -> tx.execute( format( NODE_CREATE, "my_index", label, analyzer ) ) );
            assertThat( e ).hasMessageContaining( "No such full-text analyzer: 'blablalyzer'." );
        }
    }

    @Test
    void queryShouldFindDataAddedInLaterTransactions()
    {
        try ( Transaction tx = db.beginTx() )
        {
            tx.execute( format( NODE_CREATE, DEFAULT_NODE_IDX_NAME, asStrList( "Label1", "Label2" ), asStrList( "prop1", "prop2" ) ) ).close();
            tx.execute( format( RELATIONSHIP_CREATE, DEFAULT_REL_IDX_NAME, asStrList( "Reltype1", "Reltype2" ), asStrList( "prop1", "prop2" ) ) ).close();
            tx.commit();
        }
        awaitIndexesOnline();
        long horseId;
        long horseRelId;
        try ( Transaction tx = db.beginTx() )
        {
            Node zebra = tx.createNode();
            zebra.setProperty( "prop1", "zebra" );
            Node horse = tx.createNode( Label.label( "Label1" ) );
            horse.setProperty( "prop2", "horse" );
            horse.setProperty( "prop3", "zebra" );
            Relationship horseRel = zebra.createRelationshipTo( horse, RelationshipType.withName( "Reltype1" ) );
            horseRel.setProperty( "prop1", "horse" );
            Relationship loop = horse.createRelationshipTo( horse, RelationshipType.withName( "loop" ) );
            loop.setProperty( "prop2", "zebra" );

            horseId = horse.getId();
            horseRelId = horseRel.getId();
            tx.commit();
        }
        assertQueryFindsIdsInOrder( db, true, DEFAULT_NODE_IDX_NAME, "horse", horseId );
        // node 'zebra' is not in the result, because it does not have the indexed labels
        assertQueryFindsIdsInOrder( db, true, DEFAULT_NODE_IDX_NAME, "horse zebra", horseId );
        // node 'horse' is not in the result, because property 'prop3' is not indexed
        assertQueryFindsIdsInOrder( db, true, DEFAULT_NODE_IDX_NAME, "zebra" );

        assertQueryFindsIdsInOrder( db, false, DEFAULT_REL_IDX_NAME, "horse", horseRelId );
        assertQueryFindsIdsInOrder( db, false, DEFAULT_REL_IDX_NAME, "horse zebra", horseRelId );
    }

    @Test
    void queryShouldFindDataAddedInIndexPopulation()
    {
        // when
        Node node1;
        Node node2;
        Relationship relationship;
        try ( Transaction tx = db.beginTx() )
        {
            node1 = tx.createNode( LABEL );
            node1.setProperty( PROP, "This is a integration test." );
            node2 = tx.createNode( LABEL );
            node2.setProperty( "otherprop", "This is a related integration test" );
            relationship = node1.createRelationshipTo( node2, REL );
            relationship.setProperty( PROP, "They relate" );
            tx.commit();
        }
        try ( Transaction tx = db.beginTx() )
        {
            tx.execute( format( NODE_CREATE, DEFAULT_NODE_IDX_NAME, asStrList( LABEL.name() ), asStrList( PROP, "otherprop" ) ) );
            tx.execute( format( RELATIONSHIP_CREATE, DEFAULT_REL_IDX_NAME, asStrList( REL.name() ), asStrList( PROP ) ) );
            tx.commit();
        }
        awaitIndexesOnline();

        // then
        assertQueryFindsIdsInOrder( db, true, DEFAULT_NODE_IDX_NAME, "integration", node1.getId(), node2.getId() );
        assertQueryFindsIdsInOrder( db, true, DEFAULT_NODE_IDX_NAME, "test", node1.getId(), node2.getId() );
        assertQueryFindsIds( db, true, DEFAULT_NODE_IDX_NAME, "related", newSetWith( node2.getId() ) );
        assertQueryFindsIds( db, false, DEFAULT_REL_IDX_NAME, "relate", newSetWith( relationship.getId() ) );
    }

    @Test
    void updatesToEventuallyConsistentIndexMustEventuallyBecomeVisible()
    {
        try ( Transaction tx = db.beginTx() )
        {
            tx.execute( format( NODE_CREATE, DEFAULT_NODE_IDX_NAME, asStrList( LABEL.name() ), asStrList( PROP ) + EVENTUALLY_CONSISTENT ) );
            tx.execute( format( RELATIONSHIP_CREATE, DEFAULT_REL_IDX_NAME, asStrList( REL.name() ), asStrList( PROP ) + EVENTUALLY_CONSISTENT ) );
            tx.commit();
        }

        LongHashSet nodeIds = new LongHashSet();
        LongHashSet relIds = new LongHashSet();

        generateNodesAndRelationshipsWithProperty( 200, nodeIds, relIds, "bla bla" );

        // Assert that we can observe our updates within 20 seconds from now. We have, after all, already committed the transaction.
        long deadline = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis( 20 );
        boolean success = false;
        do
        {
            try
            {
                assertQueryFindsIds( db, true, DEFAULT_NODE_IDX_NAME, "bla", nodeIds );
                assertQueryFindsIds( db, false, DEFAULT_REL_IDX_NAME, "bla", relIds );
                success = true;
            }
            catch ( Throwable throwable )
            {
                if ( deadline <= System.currentTimeMillis() )
                {
                    // We're past the deadline. This test is not successful.
                    throw throwable;
                }
            }
        }
        while ( !success );
    }

    @Test
    void updatesToEventuallyConsistentIndexMustBecomeVisibleAfterAwaitRefresh()
    {
        try ( Transaction tx = db.beginTx() )
        {
            tx.execute( format( NODE_CREATE, DEFAULT_NODE_IDX_NAME, asStrList( LABEL.name() ), asStrList( PROP ) + EVENTUALLY_CONSISTENT ) );
            tx.execute( format( RELATIONSHIP_CREATE, DEFAULT_REL_IDX_NAME, asStrList( REL.name() ), asStrList( PROP ) + EVENTUALLY_CONSISTENT ) );
            tx.commit();
        }
        awaitIndexesOnline();

        LongHashSet nodeIds = new LongHashSet();
        LongHashSet relIds = new LongHashSet();

        generateNodesAndRelationshipsWithProperty( 200, nodeIds, relIds, "bla bla" );

        try ( Transaction transaction = db.beginTx() )
        {
            transaction.execute( AWAIT_REFRESH ).close();
            transaction.commit();
        }
        assertQueryFindsIds( db, true, DEFAULT_NODE_IDX_NAME, "bla", nodeIds );
        assertQueryFindsIds( db, false, DEFAULT_REL_IDX_NAME, "bla", relIds );
    }

    @Test
    void eventuallyConsistentIndexMustPopulateWithExistingDataWhenCreated()
    {
        LongHashSet nodeIds = new LongHashSet();
        LongHashSet relIds = new LongHashSet();

        generateNodesAndRelationshipsWithProperty( 200, nodeIds, relIds, "bla bla" );

        try ( Transaction tx = db.beginTx() )
        {
            tx.execute( format( NODE_CREATE, DEFAULT_NODE_IDX_NAME, asStrList( LABEL.name() ), asStrList( PROP ) + EVENTUALLY_CONSISTENT ) );
            tx.execute( format( RELATIONSHIP_CREATE, DEFAULT_REL_IDX_NAME, asStrList( REL.name() ), asStrList( PROP ) + EVENTUALLY_CONSISTENT ) );
            tx.commit();
        }

        awaitIndexesOnline();
        assertQueryFindsIds( db, true, DEFAULT_NODE_IDX_NAME, "bla", nodeIds );
        assertQueryFindsIds( db, false, DEFAULT_REL_IDX_NAME, "bla", relIds );
    }

    private void generateNodesAndRelationshipsWithProperty( int count, MutableLongSet nodeIds, MutableLongSet relIds, String propertyValue )
    {
        try ( Transaction tx = db.beginTx() )
        {
            for ( int i = 0; i < count; i++ )
            {
                Node node = tx.createNode( LABEL );
                node.setProperty( PROP, propertyValue );
                Relationship rel = node.createRelationshipTo( node, REL );
                rel.setProperty( PROP, propertyValue );
                nodeIds.add( node.getId() );
                relIds.add( rel.getId() );
            }
            tx.commit();
        }
    }

    @Test
    void concurrentPopulationAndUpdatesToAnEventuallyConsistentIndexMustEventuallyResultInCorrectIndexState() throws Exception
    {
        String oldValue = "red";
        String newValue = "green";

        // First we create the nodes and relationships with the property value "red".
        LongHashSet nodeIds = new LongHashSet();
        LongHashSet relIds = new LongHashSet();

        generateNodesAndRelationshipsWithProperty( 200, nodeIds, relIds, oldValue );

        // Then, in two concurrent transactions, we create our indexes AND change all the property values to "green".
        CountDownLatch readyLatch = new CountDownLatch( 2 );
        BinaryLatch startLatch = new BinaryLatch();
        Runnable createIndexes = () ->
        {
            readyLatch.countDown();
            startLatch.await();
            try ( Transaction tx = db.beginTx() )
            {
                tx.execute( format( NODE_CREATE, DEFAULT_NODE_IDX_NAME, asStrList( LABEL.name() ), asStrList( PROP ) + EVENTUALLY_CONSISTENT ) );
                tx.execute( format( RELATIONSHIP_CREATE, DEFAULT_REL_IDX_NAME, asStrList( REL.name() ), asStrList( PROP ) + EVENTUALLY_CONSISTENT ) );
                tx.commit();
            }
        };
        Runnable makeAllEntitiesGreen = () ->
        {
            try ( Transaction tx = db.beginTx() )
            {
                // Prepare our transaction state first.
                nodeIds.forEach( nodeId -> tx.getNodeById( nodeId ).setProperty( PROP, newValue ) );
                relIds.forEach( relId -> tx.getRelationshipById( relId ).setProperty( PROP, newValue ) );
                // Okay, NOW we're ready to race!
                readyLatch.countDown();
                startLatch.await();
                tx.commit();
            }
        };
        ExecutorService executor = Executors.newFixedThreadPool( 2 );
        Future<?> future1 = executor.submit( createIndexes );
        Future<?> future2 = executor.submit( makeAllEntitiesGreen );
        readyLatch.await();
        startLatch.release();

        // Finally, when everything has settled down, we should see that all of the nodes and relationships are indexed with the value "green".
        try
        {
            future1.get();
            future2.get();
            awaitIndexesOnline();
            try ( Transaction tx = db.beginTx() )
            {
                tx.execute( AWAIT_REFRESH ).close();
            }
            assertQueryFindsIds( db, true, DEFAULT_NODE_IDX_NAME, newValue, nodeIds );
            assertQueryFindsIds( db, false, DEFAULT_REL_IDX_NAME, newValue, relIds );
        }
        finally
        {
            IOUtils.closeAllSilently( executor::shutdown );
        }
    }

    @Test
    void mustBeAbleToListAvailableAnalyzers()
    {
        // Verify that a couple of expected analyzers are available.
        try ( Transaction tx = db.beginTx() )
        {
            Set<String> analyzers = new HashSet<>();
            try ( ResourceIterator<String> iterator = tx.execute( LIST_AVAILABLE_ANALYZERS ).columnAs( "analyzer" ) )
            {
                while ( iterator.hasNext() )
                {
                    analyzers.add( iterator.next() );
                }
            }
            assertThat( analyzers ).contains( "english" );
            assertThat( analyzers ).contains( "swedish" );
            assertThat( analyzers ).contains( "standard" );
            assertThat( analyzers ).contains( "galician" );
            assertThat( analyzers ).contains( "irish" );
            assertThat( analyzers ).contains( "latvian" );
            assertThat( analyzers ).contains( "sorani" );
            tx.commit();
        }
    }

    @Test
    void listAvailableAnalyzersMustContainDescriptions()
    {
        try ( Transaction tx = db.beginTx() )
        {
            try ( Result result = tx.execute( LIST_AVAILABLE_ANALYZERS ) )
            {
                while ( result.hasNext() )
                {
                    Map<String,Object> row = result.next();
                    Object description = row.get( "description" );
                    assertNotNull( description, "Found no description for analyzer: " + row );
                    assertThat( description )
                            .withFailMessage( "Found description for analyzer '" + row + "'' that is not a string" )
                            .isInstanceOf( String.class );
                    assertThat( (String) description )
                            .withFailMessage( "Found description for analyzer '" + row + "'' that is blank" )
                            .isNotBlank();
                }
            }
            tx.commit();
        }
    }

    @Test
    void analyzersMustKnowTheirStopWords()
    {
        try ( Transaction tx = db.beginTx() )
        {
            try ( Result result = tx.execute( LIST_AVAILABLE_ANALYZERS ) )
            {
                while ( result.hasNext() )
                {
                    Map<String,Object> row = result.next();
                    Object stopwords = row.get( "stopwords" );

                    assertThat( stopwords )
                            .withFailMessage( "Found no stop-words list for analyzer: " + row )
                            .isNotNull()
                            .isInstanceOf( List.class );

                    List<String> words = (List<String>) stopwords;
                    String analyzerName = (String) row.get( "analyzer" );
                    if ( analyzerName.equals( "english" ) || analyzerName.equals( "standard" ) )
                    {
                        assertThat( words ).contains( "and" );
                    }
                    else if ( analyzerName.equals( "standard-no-stop-words" ) )
                    {
                        assertTrue( words.isEmpty() );
                    }
                }
            }
            tx.commit();
        }
    }

    @SuppressWarnings( "unchecked" )
    @Test
    void testThatStopWordsAreClean()
    {
        // Verify that the stop-words data-sets are clean; that they contain no comments, white-space or empty strings.
        try ( Transaction tx = db.beginTx() )
        {
            try ( Result result = tx.execute( LIST_AVAILABLE_ANALYZERS ) )
            {
                while ( result.hasNext() )
                {
                    Map<String,Object> row = result.next();
                    List<String> stopwords = (List<String>) row.get( "stopwords" );
                    for ( String stopword : stopwords )
                    {
                        assertThat( stopword )
                                .withFailMessage( "The list of stop-words for the " + row.get( "analyzer" ) + " analyzer contains dirty data. " +
                                        "Specifically, '" + stopword + "' does not look like a valid stop-word. The full list:" +
                                        System.lineSeparator() + stopwords )
                                .isNotBlank()
                                .doesNotContainAnyWhitespaces()
                                .doesNotContain( "#" );
                    }
                }
            }
            tx.commit();
        }
    }

    @Test
    void queryNodesMustThrowWhenQueryingRelationshipIndex()
    {
        try ( Transaction tx = db.beginTx() )
        {
            createSimpleRelationshipIndex( tx );
            tx.commit();
        }

        awaitIndexesOnline();

        try ( Transaction tx = db.beginTx() )
        {
            assertThrows( Exception.class, () -> tx.execute( format( QUERY_NODES, DEFAULT_REL_IDX_NAME, "bla bla" ) ).next() );
        }
    }

    @Test
    void queryRelationshipsMustThrowWhenQueryingNodeIndex()
    {
        try ( Transaction tx = db.beginTx() )
        {
            createSimpleNodesIndex( tx );
            tx.commit();
        }

        awaitIndexesOnline();

        try ( Transaction tx = db.beginTx() )
        {
            assertThrows( Exception.class, () -> tx.execute( format( QUERY_RELS, DEFAULT_NODE_IDX_NAME, "bla bla" ) ).next() );
        }
    }

    @Test
    void fulltextIndexMustIgnoreNonStringPropertiesForUpdate()
    {
        try ( Transaction tx = db.beginTx() )
        {
            createSimpleNodesIndex( tx );
            createSimpleRelationshipIndex( tx );
            tx.commit();
        }

        awaitIndexesOnline();

        List<Value> values = generateRandomNonStringValues();

        try ( Transaction tx = db.beginTx() )
        {
            for ( Value value : values )
            {
                Node node = tx.createNode( LABEL );
                Object propertyValue = value.asObject();
                node.setProperty( PROP, propertyValue );
                node.createRelationshipTo( node, REL ).setProperty( PROP, propertyValue );
            }
            tx.commit();
        }

        assertNodeAndRelationshipIndexEmpty();
    }

    @Test
    void fulltextIndexMustIgnoreNonStringPropertiesForPopulation()
    {
        List<Value> values = generateRandomNonStringValues();

        try ( Transaction tx = db.beginTx() )
        {
            for ( Value value : values )
            {
                Node node = tx.createNode( LABEL );
                Object propertyValue = value.asObject();
                node.setProperty( PROP, propertyValue );
                node.createRelationshipTo( node, REL ).setProperty( PROP, propertyValue );
            }
            tx.commit();
        }
        try ( Transaction tx = db.beginTx() )
        {
            createSimpleNodesIndex( tx );
            createSimpleRelationshipIndex( tx );
            tx.commit();
        }

        awaitIndexesOnline();

        assertNodeAndRelationshipIndexEmpty();
    }

    @Test
    void entitiesMustBeRemovedFromFulltextIndexWhenPropertyValuesChangeAwayFromText()
    {
        try ( Transaction tx = db.beginTx() )
        {
            createSimpleNodesIndex( tx );
            createSimpleRelationshipIndex( tx );
            tx.commit();
        }
        long nodeId;
        long relId;
        try ( Transaction tx = db.beginTx() )
        {
            Node node = tx.createNode( LABEL );
            nodeId = node.getId();
            node.setProperty( PROP, "bla bla" );
            Relationship rel = node.createRelationshipTo( node, REL );
            relId = rel.getId();
            rel.setProperty( PROP, "bla bla" );
            tx.commit();
        }

        assertQueryFindsIdsInOrder( db, true, DEFAULT_NODE_IDX_NAME, "bla bla", nodeId );
        assertQueryFindsIdsInOrder( db, false, DEFAULT_REL_IDX_NAME, "bla bla", relId );

        awaitIndexesOnline();

        try ( Transaction tx = db.beginTx() )
        {
            Node node = tx.getNodeById( nodeId );
            node.setProperty( PROP, 42 );
            Relationship rel = tx.getRelationshipById( relId );
            rel.setProperty( PROP, 42 );
            tx.commit();
        }

        assertNodeAndRelationshipIndexEmpty();
    }

    private void assertNodeAndRelationshipIndexEmpty()
    {
        try ( Transaction tx = db.beginTx() )
        {
            // Get all from the index and check that it is empty.
            Result nodes = tx.execute( format( QUERY_NODES, DEFAULT_NODE_IDX_NAME, "*:*" ) );
            assertFalse( nodes.hasNext() );
            Result relationships = tx.execute( format( QUERY_RELS, DEFAULT_REL_IDX_NAME, "*:*" ) );
            assertFalse( relationships.hasNext() );
            tx.commit();
        }
    }

    @Test
    void entitiesMustBeAddedToFulltextIndexWhenPropertyValuesChangeToText()
    {
        try ( Transaction tx = db.beginTx() )
        {
            createSimpleNodesIndex( tx );
            createSimpleRelationshipIndex( tx );
            tx.commit();
        }
        long nodeId;
        long relId;
        try ( Transaction tx = db.beginTx() )
        {
            Node node = tx.createNode( LABEL );
            node.setProperty( PROP, 42 );
            nodeId = node.getId();
            Relationship rel = node.createRelationshipTo( node, REL );
            relId = rel.getId();
            rel.setProperty( PROP, 42 );
            tx.commit();
        }

        awaitIndexesOnline();

        try ( Transaction tx = db.beginTx() )
        {
            Node node = tx.getNodeById( nodeId );
            node.setProperty( PROP, "bla bla" );
            Relationship rel = tx.getRelationshipById( relId );
            rel.setProperty( PROP, "bla bla" );
            tx.commit();
        }

        assertQueryFindsIdsInOrder( db, true, DEFAULT_NODE_IDX_NAME, "bla", nodeId );
        assertQueryFindsIdsInOrder( db, false, DEFAULT_REL_IDX_NAME, "bla", relId );
    }

    @Test
    void propertiesMustBeRemovedFromFulltextIndexWhenTheirValueTypeChangesAwayFromText()
    {
        try ( Transaction tx = db.beginTx() )
        {
            tx.execute( format( NODE_CREATE, DEFAULT_NODE_IDX_NAME, asStrList( LABEL.name() ), asStrList( "prop1", "prop2" ) ) ).close();
            tx.execute( format( RELATIONSHIP_CREATE, DEFAULT_REL_IDX_NAME, asStrList( REL.name() ), asStrList( "prop1", "prop2" ) ) ).close();
            tx.commit();
        }
        long nodeId;
        long relId;
        try ( Transaction tx = db.beginTx() )
        {
            Node node = tx.createNode( LABEL );
            nodeId = node.getId();
            node.setProperty( "prop1", "foo" );
            node.setProperty( "prop2", "bar" );
            Relationship rel = node.createRelationshipTo( node, REL );
            relId = rel.getId();
            rel.setProperty( "prop1", "foo" );
            rel.setProperty( "prop2", "bar" );
            tx.commit();
        }

        awaitIndexesOnline();

        assertQueryFindsIdsInOrder( db, true, DEFAULT_NODE_IDX_NAME, "foo", nodeId );
        assertQueryFindsIdsInOrder( db, true, DEFAULT_NODE_IDX_NAME, "bar", nodeId );
        assertQueryFindsIdsInOrder( db, false, DEFAULT_REL_IDX_NAME, "foo", relId );
        assertQueryFindsIdsInOrder( db, false, DEFAULT_REL_IDX_NAME, "bar", relId );

        try ( Transaction tx = db.beginTx() )
        {
            Node node = tx.getNodeById( nodeId );
            node.setProperty( "prop2", 42 );
            Relationship rel = tx.getRelationshipById( relId );
            rel.setProperty( "prop2", 42 );
            tx.commit();
        }

        assertQueryFindsIdsInOrder( db, true, DEFAULT_NODE_IDX_NAME, "foo", nodeId );
        assertQueryFindsIdsInOrder( db, true, DEFAULT_NODE_IDX_NAME, "bar" );
        assertQueryFindsIdsInOrder( db, false, DEFAULT_REL_IDX_NAME, "foo", relId );
        assertQueryFindsIdsInOrder( db, false, DEFAULT_REL_IDX_NAME, "bar" );
    }

    @Test
    void propertiesMustBeAddedToFulltextIndexWhenTheirValueTypeChangesToText()
    {
        try ( Transaction tx = db.beginTx() )
        {
            tx.execute( format( NODE_CREATE, DEFAULT_NODE_IDX_NAME, asStrList( LABEL.name() ), asStrList( "prop1", "prop2" ) ) ).close();
            tx.execute( format( RELATIONSHIP_CREATE, DEFAULT_REL_IDX_NAME, asStrList( REL.name() ), asStrList( "prop1", "prop2" ) ) ).close();
            tx.commit();
        }
        long nodeId;
        long relId;
        try ( Transaction tx = db.beginTx() )
        {
            Node node = tx.createNode( LABEL );
            nodeId = node.getId();
            node.setProperty( "prop1", "foo" );
            node.setProperty( "prop2", 42 );
            Relationship rel = node.createRelationshipTo( node, REL );
            relId = rel.getId();
            rel.setProperty( "prop1", "foo" );
            rel.setProperty( "prop2", 42 );
            tx.commit();
        }

        awaitIndexesOnline();

        assertQueryFindsIdsInOrder( db, true, DEFAULT_NODE_IDX_NAME, "foo", nodeId );
        assertQueryFindsIdsInOrder( db, false, DEFAULT_REL_IDX_NAME, "foo", relId );

        try ( Transaction tx = db.beginTx() )
        {
            Node node = tx.getNodeById( nodeId );
            node.setProperty( "prop2", "bar" );
            Relationship rel = tx.getRelationshipById( relId );
            rel.setProperty( "prop2", "bar" );
            tx.commit();
        }

        assertQueryFindsIdsInOrder( db, true, DEFAULT_NODE_IDX_NAME, "foo", nodeId );
        assertQueryFindsIdsInOrder( db, true, DEFAULT_NODE_IDX_NAME, "bar", nodeId );
        assertQueryFindsIdsInOrder( db, false, DEFAULT_REL_IDX_NAME, "foo", relId );
        assertQueryFindsIdsInOrder( db, false, DEFAULT_REL_IDX_NAME, "bar", relId );
    }

    @Test
    void propertiesMustStayInFulltextIndexWhenSomeOfLabelsRemoved()
    {
        Label secondLabel = Label.label( "label2" );
        try ( Transaction tx = db.beginTx() )
        {
            tx.execute( format( NODE_CREATE, DEFAULT_NODE_IDX_NAME, asStrList( LABEL.name(), secondLabel.name() ), asStrList( PROP ) ) ).close();
            tx.commit();
        }
        long nodeId;
        try ( Transaction tx = db.beginTx() )
        {
            Node node = tx.createNode( LABEL, secondLabel );
            nodeId = node.getId();
            node.setProperty( PROP, "foo" );
            tx.commit();
        }

        awaitIndexesOnline();

        assertQueryFindsIdsInOrder( db, true, DEFAULT_NODE_IDX_NAME, "foo", nodeId );

        try ( Transaction tx = db.beginTx() )
        {
            Node node = tx.getNodeById( nodeId );
            node.removeLabel( secondLabel );
            tx.commit();
        }

        // The node still has one of the indexed labels so the property should still be in the index.
        assertQueryFindsIdsInOrder( db, true, DEFAULT_NODE_IDX_NAME, "foo", nodeId );
    }

    @Test
    void mustBeAbleToIndexHugeTextPropertiesInIndexUpdates() throws Exception
    {
        String meditationes;
        try ( BufferedReader reader = new BufferedReader(
                new InputStreamReader( getClass().getResourceAsStream( DESCARTES_MEDITATIONES ), StandardCharsets.UTF_8 ) ) )
        {
            meditationes = reader.lines().collect( Collectors.joining( "\n" ) );
        }

        Label label = Label.label( "Book" );
        try ( Transaction tx = db.beginTx() )
        {
            tx.execute( format( NODE_CREATE, "books", asStrList( label.name() ), asStrList( "title", "author", "contents" ) ) ).close();
            tx.commit();
        }
        long nodeId;
        try ( Transaction tx = db.beginTx() )
        {
            Node node = tx.createNode( label );
            nodeId = node.getId();
            node.setProperty( "title", "Meditationes de prima philosophia" );
            node.setProperty( "author", "René Descartes" );
            node.setProperty( "contents", meditationes );
            tx.commit();
        }

        awaitIndexesOnline();

        assertQueryFindsIdsInOrder( db, true, "books", "impellit scriptum offerendum", nodeId );
    }

    @Test
    void mustBeAbleToIndexHugeTextPropertiesInIndexPopulation() throws Exception
    {
        String meditationes;
        try ( BufferedReader reader = new BufferedReader(
                new InputStreamReader( getClass().getResourceAsStream( DESCARTES_MEDITATIONES ), StandardCharsets.UTF_8 ) ) )
        {
            meditationes = reader.lines().collect( Collectors.joining( "\n" ) );
        }

        Label label = Label.label( "Book" );
        long nodeId;
        try ( Transaction tx = db.beginTx() )
        {
            Node node = tx.createNode( label );
            nodeId = node.getId();
            node.setProperty( "title", "Meditationes de prima philosophia" );
            node.setProperty( "author", "René Descartes" );
            node.setProperty( "contents", meditationes );
            tx.commit();
        }
        try ( Transaction tx = db.beginTx() )
        {
            tx.execute( format( NODE_CREATE, "books", asStrList( label.name() ), asStrList( "title", "author", "contents" ) ) ).close();
            tx.commit();
        }

        awaitIndexesOnline();

        assertQueryFindsIdsInOrder( db, true, "books", "impellit scriptum offerendum", nodeId );
    }

    @Test
    void mustBeAbleToQuerySpecificPropertiesViaLuceneSyntax()
    {
        Label book = Label.label( "Book" );
        try ( Transaction tx = db.beginTx() )
        {
            tx.execute( format( NODE_CREATE, "books", asStrList( book.name() ), asStrList( "title", "author" ) ) ).close();
            tx.commit();
        }

        long book2id;
        try ( Transaction tx = db.beginTx() )
        {
            tx.schema().awaitIndexesOnline( 2, TimeUnit.MINUTES );
            Node book1 = tx.createNode( book );
            book1.setProperty( "author", "René Descartes" );
            book1.setProperty( "title", "Meditationes de prima philosophia" );
            Node book2 = tx.createNode( book );
            book2.setProperty( "author", "E. M. Curley" );
            book2.setProperty( "title", "Descartes Against the Skeptics" );
            book2id = book2.getId();
            tx.commit();
        }

        assertQueryFindsIdsInOrder( db, true, "books", "title:Descartes", book2id );
    }

    @Test
    void mustIndexNodesByCorrectProperties()
    {
        try ( Transaction tx = db.beginTx() )
        {
            tx.execute( format( NODE_CREATE, DEFAULT_NODE_IDX_NAME, asStrList( LABEL.name() ), asStrList( "a", "b", "c", "d", "e", "f" ) ) ).close();
            tx.commit();
        }
        long nodeId;
        awaitIndexesOnline();
        try ( Transaction tx = db.beginTx() )
        {
            Node node = tx.createNode( LABEL );
            node.setProperty( "e", "value" );
            nodeId = node.getId();
            tx.commit();
        }

        assertQueryFindsIdsInOrder( db, true, DEFAULT_NODE_IDX_NAME, "e:value", nodeId );
        assertQueryFindsIdsInOrder( db, true, DEFAULT_NODE_IDX_NAME, "value", nodeId );
    }

    @MethodSource( "entityTypeProvider" )
    @ParameterizedTest
    void queryingIndexInPopulatingStateMustBlockUntilIndexIsOnline( EntityUtil entityUtil ) throws InterruptedException
    {
        trapPopulation.set( true );

        try ( Transaction tx = db.beginTx() )
        {
            entityUtil.createEntityWithProperty( tx, "value" );
            tx.commit();
        }
        try ( Transaction tx = db.beginTx() )
        {
            entityUtil.createIndex( tx );
            tx.commit();
        }
        try ( Transaction tx = db.beginTx() )
        {
            try ( Result result = entityUtil.queryIndex( tx, "value" );
                    Stream<Map<String,Object>> stream = result.stream() )
            {
                populationScanFinished.await();
                populationScanFinished.release();
                assertThat( stream.count() ).isEqualTo( 1 );
            }
            tx.commit();
        }
    }

    @MethodSource( "entityTypeProvider" )
    @ParameterizedTest
    void queryingIndexInTransactionItWasCreatedInMustThrow( EntityUtil entityUtil )
    {
        try ( Transaction tx = db.beginTx() )
        {
            entityUtil.createIndex( tx );
            assertThrows( QueryExecutionException.class, () -> entityUtil.queryIndex( tx, "value" ).next() );
        }
    }

    @MethodSource( "entityTypeProvider" )
    @ParameterizedTest
    void queryResultsMustNotIncludeEntitiesDeletedInOtherConcurrentlyCommittedTransactions( EntityUtil entityUtil ) throws Exception
    {
        createIndexAndWait( entityUtil );
        long entityIdA;
        long entityIdB;
        try ( Transaction tx = db.beginTx() )
        {
            entityIdA = entityUtil.createEntityWithProperty( tx, "value" );
            entityIdB = entityUtil.createEntityWithProperty( tx, "value" );
            tx.commit();
        }
        try ( Transaction tx = db.beginTx() )
        {
            try ( Result result = entityUtil.queryIndex( tx, "value" ) )
            {
                ThreadTestUtils.forkFuture( () ->
                {
                    try ( Transaction forkedTx = db.beginTx() )
                    {
                        entityUtil.deleteEntity( tx, entityIdA );
                        entityUtil.deleteEntity( tx, entityIdB );
                        forkedTx.commit();
                    }
                    return null;
                } ).get();
                assertThat( result.stream().count() ).isEqualTo( 0L );
            }
            tx.commit();
        }
    }

    @MethodSource( "entityTypeProvider" )
    @ParameterizedTest
    void queryResultsMustIncludeEntitiesWithPropertiesAddedToBeIndexed( EntityUtil entityUtil )
    {
        createIndexAndWait( entityUtil );
        long entityId;
        try ( Transaction tx = db.beginTx() )
        {
            entityId = entityUtil.createEntity( tx );
            tx.commit();
        }
        try ( Transaction tx = db.beginTx() )
        {
            entityUtil.getEntity( tx, entityId ).setProperty( PROP, "value" );
            tx.commit();
        }
        entityUtil.assertQueryFindsIdsInOrder( db, "prop:value", entityId );
        entityUtil.assertQueryFindsIdsInOrder( db, "value", entityId );
    }

    @Test
    void queryResultsMustIncludeNodesWithLabelsModifedToBeIndexed()
    {
        try ( Transaction tx = db.beginTx() )
        {
            createSimpleNodesIndex( tx );
            tx.commit();
        }
        long nodeId;
        awaitIndexesOnline();
        try ( Transaction tx = db.beginTx() )
        {
            Node node = tx.createNode();
            node.setProperty( PROP, "value" );
            nodeId = node.getId();
            tx.commit();
        }
        try ( Transaction tx = db.beginTx() )
        {
            Node node = tx.getNodeById( nodeId );
            node.addLabel( LABEL );
            tx.commit();
        }
        assertQueryFindsIdsInOrder( db, true, DEFAULT_NODE_IDX_NAME, "value", nodeId );
    }

    @MethodSource( "entityTypeProvider" )
    @ParameterizedTest
    void queryResultsMustIncludeUpdatedValueOfChangedProperties( EntityUtil entityUtil )
    {
        createIndexAndWait( entityUtil );
        long entityId;
        try ( Transaction tx = db.beginTx() )
        {
            entityId = entityUtil.createEntityWithProperty( tx, "primo" );
            tx.commit();
        }
        entityUtil.assertQueryFindsIdsInOrder( db, "primo", entityId );
        try ( Transaction tx = db.beginTx() )
        {
            entityUtil.getEntity( tx, entityId ).setProperty( PROP, "secundo" );
            tx.commit();
        }
        entityUtil.assertQueryFindsIdsInOrder( db, "primo" );
        entityUtil.assertQueryFindsIdsInOrder( db, "secundo", entityId );
    }

    @MethodSource( "entityTypeProvider" )
    @ParameterizedTest
    void queryResultsMustNotIncludeEntitiesWithRemovedIndexedProperties( EntityUtil entityUtil )
    {
        createIndexAndWait( entityUtil );
        long entityId;
        try ( Transaction tx = db.beginTx() )
        {
            entityId = entityUtil.createEntityWithProperty( tx, "value" );
            tx.commit();
        }
        entityUtil.assertQueryFindsIdsInOrder( db, "value", entityId );

        try ( Transaction tx = db.beginTx() )
        {
            entityUtil.getEntity( tx, entityId ).removeProperty( PROP );
            tx.commit();
        }

        entityUtil.assertQueryFindsIdsInOrder( db, "value" );
    }

    @Test
    void queryResultsMustNotIncludeNodesWithRemovedIndexedLabels()
    {
        try ( Transaction tx = db.beginTx() )
        {
            createSimpleNodesIndex( tx );
            tx.commit();
        }
        long nodeId;
        try ( Transaction tx = db.beginTx() )
        {
            Node node = tx.createNode( LABEL );
            node.setProperty( PROP, "value" );
            nodeId = node.getId();
            tx.commit();
        }

        assertQueryFindsIdsInOrder( db, true, DEFAULT_NODE_IDX_NAME, "value", nodeId );

        try ( Transaction tx = db.beginTx() )
        {
            tx.getNodeById( nodeId ).removeLabel( LABEL );
            tx.commit();
        }
        assertQueryFindsIdsInOrder( db, true, DEFAULT_NODE_IDX_NAME, "value" );
    }

    @Test
    void queryResultsMustIncludeNodesWhenNodeLabelRemovalsAreUndone()
    {
        try ( Transaction tx = db.beginTx() )
        {
            createSimpleNodesIndex( tx );
            tx.commit();
        }
        long nodeId;
        awaitIndexesOnline();
        try ( Transaction tx = db.beginTx() )
        {
            Node node = tx.createNode( LABEL );
            node.setProperty( PROP, "primo" );
            nodeId = node.getId();
            tx.commit();
        }
        try ( Transaction tx = db.beginTx() )
        {
            Node node = tx.getNodeById( nodeId );
            node.removeLabel( LABEL );
            assertQueryFindsIdsInOrder( tx, true, DEFAULT_NODE_IDX_NAME, "primo" );

            node.addLabel( LABEL );
            assertQueryFindsIdsInOrder( tx, true, DEFAULT_NODE_IDX_NAME, "primo", nodeId );
            tx.commit();
        }
        assertQueryFindsIdsInOrder( db, true, DEFAULT_NODE_IDX_NAME, "primo", nodeId );
    }

    @MethodSource( "entityTypeProvider" )
    @ParameterizedTest
    void queryResultsMustBeOrderedByScore( EntityUtil entityUtil )
    {
        createIndexAndWait( entityUtil );
        long firstId;
        long secondId;
        long thirdId;
        try ( Transaction tx = db.beginTx() )
        {
            firstId = entityUtil.createEntityWithProperty( tx, "dude sweet dude sweet" );
            tx.commit();
        }

        try ( Transaction tx = db.beginTx() )
        {
            secondId = entityUtil.createEntityWithProperty( tx, "dude sweet" );
            tx.commit();
        }

        try ( Transaction tx = db.beginTx() )
        {
            thirdId = entityUtil.createEntityWithProperty( tx, "dude sweet dude dude dude sweet" );
            tx.commit();
        }
        entityUtil.assertQueryFindsIdsInOrder( db, "dude", thirdId, firstId, secondId );
    }

    @MethodSource( "entityTypeProvider" )
    @ParameterizedTest
    void queryingDroppedIndexInDroppingTransactionMustThrow( EntityUtil entityUtil )
    {
        createIndexAndWait( entityUtil );
        try ( Transaction tx = db.beginTx() )
        {
            entityUtil.dropIndex( tx );
            assertThrows( QueryExecutionException.class, () -> entityUtil.queryIndex( tx, "blabla" ).next() );
        }
    }

    @MethodSource( "entityTypeProvider" )
    @ParameterizedTest
    void creatingAndDroppingIndexesInSameTransactionMustNotThrow( EntityUtil entityUtil )
    {
        try ( Transaction tx = db.beginTx() )
        {
            entityUtil.createIndex( tx );
            entityUtil.dropIndex( tx );
            tx.commit();
        }
        awaitIndexesOnline();
        try ( Transaction tx = db.beginTx() )
        {
            var result = tx.execute( SHOW_FULLTEXT_INDEXES );
            assertThat( result.hasNext() ).isFalse().as( "Fulltext indexes should not be created" );
            tx.commit();
        }
    }

    @MethodSource( "entityTypeProvider" )
    @ParameterizedTest
    void eventuallyConsistentIndexMustNotIncludeEntitiesAddedInTransaction()
    {
        try ( Transaction tx = db.beginTx() )
        {
            tx.execute( format( NODE_CREATE, DEFAULT_NODE_IDX_NAME, asStrList( LABEL.name() ), asStrList( PROP ) + EVENTUALLY_CONSISTENT ) ).close();
            tx.execute( format( RELATIONSHIP_CREATE, DEFAULT_REL_IDX_NAME, asStrList( REL.name() ), asStrList( PROP ) + EVENTUALLY_CONSISTENT ) ).close();
            tx.commit();
        }
        awaitIndexesOnline();
        try ( Transaction tx = db.beginTx() )
        {
            Node node = tx.createNode( LABEL );
            node.setProperty( PROP, "value" );
            node.createRelationshipTo( node, REL ).setProperty( PROP, "value" );
        }

        assertQueryFindsIdsInOrder( db, true, DEFAULT_NODE_IDX_NAME, "value" );
        assertQueryFindsIdsInOrder( db, false, DEFAULT_REL_IDX_NAME, "value" );
        try ( Transaction transaction = db.beginTx() )
        {
            transaction.execute( AWAIT_REFRESH ).close();
            transaction.commit();
        }
        assertQueryFindsIdsInOrder( db, true, DEFAULT_NODE_IDX_NAME, "value" );
        assertQueryFindsIdsInOrder( db, false, DEFAULT_REL_IDX_NAME, "value" );
    }

    @Test
    void prefixedFulltextIndexSettingMustBeRecognized()
    {
        try ( Transaction tx = db.beginTx() )
        {
            tx.execute( format( NODE_CREATE, DEFAULT_NODE_IDX_NAME, asStrList( LABEL.name() ), asStrList( PROP ) + EVENTUALLY_CONSISTENT_PREFIXED ) ).close();
            tx.execute(
                    format( RELATIONSHIP_CREATE, DEFAULT_REL_IDX_NAME, asStrList( REL.name() ), asStrList( PROP ) + EVENTUALLY_CONSISTENT_PREFIXED ) ).close();
            tx.commit();
        }
        awaitIndexesOnline();

        try ( Transaction tx = db.beginTx() )
        {
            for ( IndexDefinition index : tx.schema().getIndexes() )
            {
                if ( index.getIndexType() != IndexType.FULLTEXT )
                {
                    continue;
                }
                Map<IndexSetting,Object> indexConfiguration = index.getIndexConfiguration();
                Object eventuallyConsistentObj = indexConfiguration.get( IndexSettingImpl.FULLTEXT_EVENTUALLY_CONSISTENT );
                assertNotNull( eventuallyConsistentObj );
                assertThat( eventuallyConsistentObj ).isInstanceOf( Boolean.class );
                assertTrue( (Boolean) eventuallyConsistentObj );
            }
            tx.commit();
        }
    }

    @Test
    void prefixedFulltextIndexSettingMustBeRecognizedTogetherWithNonPrefixed()
    {
        try ( Transaction tx = db.beginTx() )
        {
            String mixedPrefixConfig = ", {`fulltext.analyzer`: 'english', eventually_consistent: 'true'}";
            tx.execute( format( NODE_CREATE, DEFAULT_NODE_IDX_NAME, asStrList( LABEL.name() ), asStrList( PROP ) + mixedPrefixConfig ) ).close();
            tx.execute( format( RELATIONSHIP_CREATE, DEFAULT_REL_IDX_NAME, asStrList( REL.name() ), asStrList( PROP ) + mixedPrefixConfig ) ).close();
            tx.commit();
        }
        awaitIndexesOnline();

        try ( Transaction tx = db.beginTx() )
        {
            for ( IndexDefinition index : tx.schema().getIndexes() )
            {
                if ( index.getIndexType() != IndexType.FULLTEXT )
                {
                    continue;
                }
                Map<IndexSetting,Object> indexConfiguration = index.getIndexConfiguration();
                Object eventuallyConsistentObj = indexConfiguration.get( IndexSettingImpl.FULLTEXT_EVENTUALLY_CONSISTENT );
                assertNotNull( eventuallyConsistentObj );
                assertThat( eventuallyConsistentObj ).isInstanceOf( Boolean.class );
                assertTrue( (Boolean) eventuallyConsistentObj );
                Object analyzerObj = indexConfiguration.get( IndexSettingImpl.FULLTEXT_ANALYZER );
                assertNotNull( analyzerObj );
                assertThat( analyzerObj ).isInstanceOf( String.class );
                assertEquals( "english", analyzerObj );
            }
            tx.commit();
        }
    }

    @Test
    void mustThrowOnDuplicateFulltextIndexSetting()
    {
        String duplicateConfig = ", {`fulltext.analyzer`: 'english', analyzer: 'swedish'}";

        try ( Transaction tx = db.beginTx() )
        {
            Exception e = assertThrows( QueryExecutionException.class,
                    () -> tx.execute( format( NODE_CREATE, DEFAULT_NODE_IDX_NAME, asStrList( LABEL.name() ), asStrList( PROP ) + duplicateConfig ) ).close() );
            assertThat( e ).hasMessageContaining( "Config setting was specified more than once, 'analyzer'." );
            assertThat( e ).hasRootCauseExactlyInstanceOf( IllegalArgumentException.class );
        }

        try ( Transaction tx = db.beginTx() )
        {
            Exception e = assertThrows( QueryExecutionException.class,
                    () -> tx.execute(
                            format( RELATIONSHIP_CREATE, DEFAULT_REL_IDX_NAME, asStrList( REL.name() ), asStrList( PROP ) + duplicateConfig ) ).close() );
            assertThat( e ).hasMessageContaining( "Config setting was specified more than once, 'analyzer'." );
            assertThat( e ).hasRootCauseExactlyInstanceOf( IllegalArgumentException.class );
        }
    }

    @Test
    void dropMustNotApplyToRegularSchemaIndexes()
    {
        try ( Transaction tx = db.beginTx() )
        {
            tx.schema().indexFor( LABEL ).on( PROP ).create();
            tx.commit();
        }
        awaitIndexesOnline();
        String schemaIndexName;
        try ( Transaction tx = db.beginTx() )
        {
            try ( Result result = tx.execute( "call db.indexes()" ) )
            {
                assertTrue( result.hasNext() );
                schemaIndexName = result.next().get( "name" ).toString();
            }
            Exception e = assertThrows( QueryExecutionException.class, () -> tx.execute( format( DROP, schemaIndexName ) ).close() );
            assertThat( e ).hasMessageContaining( "is not a full-text index." );
        }
    }

    @CsvSource( {"false, without DB restart", "true, with DB restart"} )
    @ParameterizedTest( name = "{1}" )
    void fulltextIndexMustNotBeAvailableForRegularIndexSeeks( boolean dbRestart, String name )
    {
        try ( Transaction tx = db.beginTx() )
        {
            createSimpleNodesIndex( tx );
            tx.commit();
        }
        if ( dbRestart )
        {
            restartDatabase();
        }
        String valueToQueryFor = "value to query for";
        awaitIndexesOnline();
        try ( Transaction tx = db.beginTx() )
        {
            List<Value> values = generateRandomSimpleValues();
            for ( Value value : values )
            {
                tx.createNode( LABEL ).setProperty( PROP, value.asObject() );
            }
            tx.createNode( LABEL ).setProperty( PROP, valueToQueryFor );
            tx.commit();
        }
        try ( Transaction tx = db.beginTx() )
        {
            Map<String,Object> params = new HashMap<>();
            params.put( PROP, valueToQueryFor );
            try ( Result result = tx.execute( "profile match (n:" + LABEL.name() + ") where n." + PROP + " = $prop return n", params ) )
            {
                assertNoIndexSeeks( result );
            }
            try ( Result result = tx.execute( "cypher 3.5 profile match (n:" + LABEL.name() + ") where n." + PROP + " = $prop return n", params ) )
            {
                assertNoIndexSeeks( result );
            }
            tx.commit();
        }
    }

    @Test
    void nodeOutputMustBeOrderedByScoreDescending()
    {
        FulltextProcedures.NodeOutput a = new FulltextProcedures.NodeOutput( null, Float.NaN );
        FulltextProcedures.NodeOutput b = new FulltextProcedures.NodeOutput( null, Float.POSITIVE_INFINITY );
        FulltextProcedures.NodeOutput c = new FulltextProcedures.NodeOutput( null, Float.MAX_VALUE );
        FulltextProcedures.NodeOutput d = new FulltextProcedures.NodeOutput( null, 1.0f );
        FulltextProcedures.NodeOutput e = new FulltextProcedures.NodeOutput( null, Float.MIN_NORMAL );
        FulltextProcedures.NodeOutput f = new FulltextProcedures.NodeOutput( null, Float.MIN_VALUE );
        FulltextProcedures.NodeOutput g = new FulltextProcedures.NodeOutput( null, 0.0f );
        FulltextProcedures.NodeOutput h = new FulltextProcedures.NodeOutput( null, -1.0f );
        FulltextProcedures.NodeOutput i = new FulltextProcedures.NodeOutput( null, Float.NEGATIVE_INFINITY );
        FulltextProcedures.NodeOutput[] expectedOrder = new FulltextProcedures.NodeOutput[]{a, b, c, d, e, f, g, h, i};
        FulltextProcedures.NodeOutput[] array = Arrays.copyOf( expectedOrder, expectedOrder.length );

        for ( int counter = 0; counter < 10; counter++ )
        {
            ArrayUtils.shuffle( array );
            Arrays.sort( array );
            assertArrayEquals( expectedOrder, array );
        }
    }

    @Test
    void relationshipOutputMustBeOrderedByScoreDescending()
    {
        FulltextProcedures.RelationshipOutput a = new FulltextProcedures.RelationshipOutput( null, Float.NaN );
        FulltextProcedures.RelationshipOutput b = new FulltextProcedures.RelationshipOutput( null, Float.POSITIVE_INFINITY );
        FulltextProcedures.RelationshipOutput c = new FulltextProcedures.RelationshipOutput( null, Float.MAX_VALUE );
        FulltextProcedures.RelationshipOutput d = new FulltextProcedures.RelationshipOutput( null, 1.0f );
        FulltextProcedures.RelationshipOutput e = new FulltextProcedures.RelationshipOutput( null, Float.MIN_NORMAL );
        FulltextProcedures.RelationshipOutput f = new FulltextProcedures.RelationshipOutput( null, Float.MIN_VALUE );
        FulltextProcedures.RelationshipOutput g = new FulltextProcedures.RelationshipOutput( null, 0.0f );
        FulltextProcedures.RelationshipOutput h = new FulltextProcedures.RelationshipOutput( null, -1.0f );
        FulltextProcedures.RelationshipOutput i = new FulltextProcedures.RelationshipOutput( null, Float.NEGATIVE_INFINITY );
        FulltextProcedures.RelationshipOutput[] expectedOrder = new FulltextProcedures.RelationshipOutput[]{a, b, c, d, e, f, g, h, i};
        FulltextProcedures.RelationshipOutput[] array = Arrays.copyOf( expectedOrder, expectedOrder.length );

        for ( int counter = 0; counter < 10; counter++ )
        {
            ArrayUtils.shuffle( array );
            Arrays.sort( array );
            assertArrayEquals( expectedOrder, array );
        }
    }

    @Test
    void awaitIndexProcedureMustWorkOnIndexNames()
    {
        try ( Transaction tx = db.beginTx() )
        {
            for ( int i = 0; i < 1000; i++ )
            {
                Node node = tx.createNode( LABEL );
                node.setProperty( PROP, "value" );
                Relationship rel = node.createRelationshipTo( node, REL );
                rel.setProperty( PROP, "value" );
            }
            tx.commit();
        }
        try ( Transaction tx = db.beginTx() )
        {
            createSimpleNodesIndex( tx );
            createSimpleRelationshipIndex( tx );
            tx.commit();
        }
        try ( Transaction tx = db.beginTx() )
        {
            tx.execute( format( DB_AWAIT_INDEX, DEFAULT_NODE_IDX_NAME ) ).close();
            tx.execute( format( DB_AWAIT_INDEX, DEFAULT_REL_IDX_NAME ) ).close();
            tx.commit();
        }
    }

    @Test
    void mustBePossibleToDropFulltextIndexByNameForWhichNormalIndexExistWithMatchingSchema()
    {
        try ( Transaction tx = db.beginTx() )
        {
            tx.execute( "CREATE INDEX FOR (n:Person) ON (n.name)" ).close();
            tx.execute( "call db.index.fulltext.createNodeIndex('nameIndex', ['Person'], ['name'])" ).close();
            tx.commit();
        }
        awaitIndexesOnline();
        try ( Transaction tx = db.beginTx() )
        {
            // This must not throw:
            tx.execute( "call db.index.fulltext.drop('nameIndex')" ).close();
            tx.commit();
        }
        try ( Transaction tx = db.beginTx() )
        {
            assertThat( stream( tx.schema().getIndexes() ).map( IndexDefinition::getName ).collect( toList() ) ).doesNotContain( "nameIndex" );
            tx.commit();
        }
    }

    @Test
    void fulltextIndexesMustNotPreventNormalSchemaIndexesFromBeingDropped()
    {
        try ( Transaction tx = db.beginTx() )
        {
            tx.execute( "CREATE INDEX FOR (n:Person) ON (n.name)" ).close();
            tx.execute( "call db.index.fulltext.createNodeIndex('nameIndex', ['Person'], ['name'])" ).close();
            tx.commit();
        }
        awaitIndexesOnline();
        try ( Transaction tx = db.beginTx() )
        {
            // This must not throw:
            tx.execute( "DROP INDEX ON :Person(name)" ).close();
            tx.commit();
        }
        try ( Transaction tx = db.beginTx() )
        {
            assertThat( stream( tx.schema().getIndexes() ).map( IndexDefinition::getName ).collect( toList() ) ).contains( "nameIndex" );
            tx.commit();
        }
    }

    @Test
    void creatingNormalIndexWithFulltextProviderMustThrow()
    {
        String providerName = FulltextIndexProviderFactory.DESCRIPTOR.name();
        assertThat( providerName ).isEqualTo( "fulltext-1.0" ); // Sanity check that this test is up to date.

        Exception e = assertThrows( QueryExecutionException.class, () ->
        {
            try ( Transaction tx = db.beginTx() )
            {
                tx.execute( "call db.createIndex( \"MyIndex\", ['User'], ['searchableString'], \"" + providerName + "\" );" ).close();
                tx.commit();
            }
        } );
        assertThat( e.getMessage() ).contains(
                "Could not create index with specified index provider 'fulltext-1.0'. To create fulltext index, please use 'CREATE FULLTEXT INDEX ...'." );
    }

    @MethodSource( "entityTypeProvider" )
    @ParameterizedTest
    void mustSupportWildcardEndsLikeStartsWith( EntityUtil entityUtil )
    {
        createIndexAndWait( entityUtil );
        LongHashSet ids = new LongHashSet();
        try ( Transaction tx = db.beginTx() )
        {
            ids.add( entityUtil.createEntityWithProperty( tx, "abcdef" ) );
            ids.add( entityUtil.createEntityWithProperty( tx, "abcxyz" ) );
            tx.commit();
        }

        entityUtil.assertQueryFindsIds( db, "abc*", ids );
    }

    @MethodSource( "entityTypeProvider" )
    @ParameterizedTest
    void mustSupportWildcardBeginningsLikeEndsWith( EntityUtil entityUtil )
    {
        createIndexAndWait( entityUtil );
        LongHashSet ids = new LongHashSet();
        try ( Transaction tx = db.beginTx() )
        {
            ids.add( entityUtil.createEntityWithProperty( tx, "defabc" ) );
            ids.add( entityUtil.createEntityWithProperty( tx, "xyzabc" ) );
            tx.commit();
        }

        entityUtil.assertQueryFindsIds( db, "*abc", ids );
    }

    @MethodSource( "entityTypeProvider" )
    @ParameterizedTest
    void mustSupportWildcardBeginningsAndEndsLikeContains( EntityUtil entityUtil )
    {
        createIndexAndWait( entityUtil );
        LongHashSet ids = new LongHashSet();
        try ( Transaction tx = db.beginTx() )
        {
            ids.add( entityUtil.createEntityWithProperty( tx, "defabcdef" ) );
            ids.add( entityUtil.createEntityWithProperty( tx, "xyzabcxyz" ) );
            tx.commit();
        }

        entityUtil.assertQueryFindsIds( db, "*abc*", ids );
    }

    @Test
    void mustMatchCaseInsensitiveWithStandardAnalyzer()
    {
        // The letter 'A' is a stop-word in English, so it is not indexed.
        mustMatchCaseInsensitive( ", {analyzer: 'standard'}", false );
    }

    @Test
    void mustMatchCaseInsensitiveWithSimpleAnalyzer()
    {
        mustMatchCaseInsensitive( ", {analyzer: 'simple'}", true );
    }

    @Test
    void mustMatchCaseInsensitiveWithDefaultAnalyzer()
    {
        mustMatchCaseInsensitive( "", true );
    }

    private void mustMatchCaseInsensitive( String analyzerString, boolean expectA )
    {
        try ( Transaction tx = db.beginTx() )
        {
            tx.execute( "foreach (x in range (1,1000) | create (n:Label {id:'A'}))" ).close();
            tx.execute( "foreach (x in range (1,1000) | create (n:Label {id:'B'}))" ).close();
            tx.execute( "foreach (x in range (1,1000) | create (n:Label {id:'C'}))" ).close();
            tx.execute( "foreach (x in range (1,1000) | create (n:Label {id:'b'}))" ).close();
            tx.commit();
        }
        try ( Transaction tx = db.beginTx() )
        {
            tx.execute( format( NODE_CREATE, "myindex", asStrList( LABEL.name() ), asStrList( "id" ) + analyzerString ) ).close();
            tx.commit();
        }
        awaitIndexesOnline();

        try ( Transaction tx = db.beginTx() )
        {
            try ( Result result = tx.execute( format( QUERY_NODES, "myindex", "A" ) ) )
            {
                if ( expectA )
                {
                    assertThat( result.stream().count() ).isEqualTo( 1000L ); // We only have upper-case 'A' nodes.
                }
                else
                {
                    assertThat( result.stream().count() ).isEqualTo( 0L );
                }
            }
            try ( Result result = tx.execute( format( QUERY_NODES, "myindex", "B" ) ) )
            {
                assertThat( result.stream().count() ).isEqualTo( 2000L ); // Both upper- and lower-case 'B' nodes.
            }
            try ( Result result = tx.execute( format( QUERY_NODES, "myindex", "C" ) ) )
            {
                assertThat( result.stream().count() ).isEqualTo( 1000L ); // We only have upper-case 'C' nodes.
            }
            tx.commit();
        }
    }

    @Test
    void makeSureFulltextIndexDoesNotBlockSchemaIndexOnSameSchemaPattern()
    {
        long indexesBefore = indexesCount();

        try ( Transaction tx = db.beginTx() )
        {
            tx.execute( format( NODE_CREATE, "myindex", asStrList( LABEL.name() ), asStrList( PROP ) ) );
            tx.commit();
        }
        try ( Transaction tx = db.beginTx() )
        {
            tx.execute( format( DB_AWAIT_INDEX, "myindex" ) );
            tx.commit();
        }
        try ( Transaction tx = db.beginTx() )
        {
            tx.schema().indexFor( LABEL ).on( PROP ).create();
            tx.commit();
        }
        try ( Transaction tx = db.beginTx() )
        {
            tx.schema().awaitIndexesOnline( 1, TimeUnit.HOURS );
            tx.commit();
        }
        assertThat( indexesCount() ).isEqualTo( indexesBefore + 2 );
    }

    @Test
    void makeSureSchemaIndexDoesNotBlockFulltextIndexOnSameSchemaPattern()
    {
        long indexesBefore = indexesCount();

        try ( Transaction tx = db.beginTx() )
        {
            tx.schema().indexFor( LABEL ).on( PROP ).create();
            tx.commit();
        }
        try ( Transaction tx = db.beginTx() )
        {
            tx.schema().awaitIndexesOnline( 1, TimeUnit.HOURS );
            tx.commit();
        }
        try ( Transaction tx = db.beginTx() )
        {
            tx.execute( format( NODE_CREATE, "myindex", asStrList( LABEL.name() ), asStrList( PROP ) ) );
            tx.commit();
        }
        try ( Transaction tx = db.beginTx() )
        {
            tx.execute( format( DB_AWAIT_INDEX, "myindex" ) );
            tx.commit();
        }
        assertThat( indexesCount() ).isEqualTo( indexesBefore + 2 );
    }

    @CsvSource( value = {NODE_CREATE + "|For node", RELATIONSHIP_CREATE + "|For relationship"}, delimiter = '|' )
    @ParameterizedTest( name = "{1}" )
    void shouldNotBePossibleToCreateIndexWithDuplicateProperty( String createMethod, String name )
    {
        Exception e = assertThrows( Exception.class, () ->
        {
            try ( Transaction tx = db.beginTx() )
            {
                tx.execute( format( createMethod, "myindex", asStrList( "EntityToken" ), asStrList( "id", "id" ) ) );
            }
        } );

        assertThat( e ).hasRootCauseExactlyInstanceOf( RepeatedPropertyInSchemaException.class )
                       .hasMessageContaining( "includes a property more than once." );
    }

    @Test
    void shouldNotBePossibleToCreateIndexWithDuplicateLabel()
    {
        Exception e = assertThrows( Exception.class, () ->
        {
            try ( Transaction tx = db.beginTx() )
            {
                tx.execute( format( NODE_CREATE, "myindex", asStrList( LABEL.name(), LABEL.name() ), asStrList( "id" ) ) );
            }
        } );

        assertThat( e ).hasRootCauseExactlyInstanceOf( RepeatedLabelInSchemaException.class )
                       .hasMessageContaining( "includes a label more than once." );
    }

    @Test
    void shouldNotBePossibleToCreateIndexWithDuplicateRelType()
    {
        Exception e = assertThrows( Exception.class, () ->
        {
            try ( Transaction tx = db.beginTx() )
            {
                tx.execute( format( RELATIONSHIP_CREATE, "myindex", asStrList( "RelType", "RelType" ), asStrList( "id" ) ) );
            }
        } );
        assertThat( e ).hasRootCauseExactlyInstanceOf( RepeatedRelationshipTypeInSchemaException.class )
                       .hasMessageContaining( "includes a relationship type more than once." );
    }

    @Test
    void attemptingToIndexOnPropertyUsedForInternalReferenceMustThrow()
    {
        var e = assertThrows( Exception.class, () ->
        {
            try ( Transaction tx = db.beginTx() )
            {
                tx.execute( format( NODE_CREATE, "myindex",
                        asStrList( LABEL.name() ),
                        asStrList( LuceneFulltextDocumentStructure.FIELD_ENTITY_ID ) ) )
                  .close();
                tx.commit();
            }
        } );
        assertThat( e.getMessage() ).contains( LuceneFulltextDocumentStructure.FIELD_ENTITY_ID );
    }

    @CsvSource( {"false, without DB restart", "true, with DB restart"} )
    @ParameterizedTest( name = "{1}" )
    void relationshipIndexAndDetachDelete( boolean restartDb, String name )
    {
        try ( Transaction tx = db.beginTx() )
        {
            createSimpleRelationshipIndex( tx );
            tx.commit();
        }
        awaitIndexesOnline();
        long nodeId;
        long relId;
        try ( Transaction tx = db.beginTx() )
        {
            Node node = tx.createNode();
            nodeId = node.getId();
            Relationship rel = node.createRelationshipTo( node, REL );
            relId = rel.getId();
            rel.setProperty( PROP, "blabla" );
            tx.commit();
        }

        if ( restartDb )
        {
            restartDatabase();
        }

        try ( Transaction tx = db.beginTx() )
        {
            assertQueryFindsIdsInOrder( tx, false, DEFAULT_REL_IDX_NAME, "blabla", relId );
            tx.execute( "match (n) where id(n) = " + nodeId + " detach delete n" ).close();
            tx.commit();
        }

        assertQueryFindsIdsInOrder( db, false, DEFAULT_REL_IDX_NAME, "blabla" );

        checkDatabaseConsistency();
    }

    private void checkDatabaseConsistency()
    {
        DatabaseLayout layout = db.databaseLayout();
        controller.restartDbms( b ->
        {
            try
            {
                ConsistencyCheckService cc = new ConsistencyCheckService();
                ConsistencyCheckService.Result result = cc.runFullConsistencyCheck(
                        layout, Config.defaults(), ProgressMonitorFactory.NONE, NullLogProvider.getInstance(), false, ConsistencyFlags.DEFAULT );
                if ( !result.isSuccessful() )
                {
                    Files.lines( result.reportFile() ).forEach( System.out::println );
                }
                assertTrue( result.isSuccessful() );
            }
            catch ( Exception e )
            {
                throw new RuntimeException( e );
            }
            return b;
        } );
    }

    @CsvSource( {"false, without DB restart", "true, with DB restart"} )
    @ParameterizedTest( name = "{1}" )
    public void relationshipIndexAndPropertyRemove( boolean restartDb, String name )
    {
        try ( Transaction tx = db.beginTx() )
        {
            createSimpleRelationshipIndex( tx );
            tx.commit();
        }
        awaitIndexesOnline();

        long relId;
        try ( Transaction tx = db.beginTx() )
        {
            Node node = tx.createNode();
            Relationship rel = node.createRelationshipTo( node, REL );
            relId = rel.getId();
            rel.setProperty( PROP, "blabla" );
            tx.commit();
        }

        if ( restartDb )
        {
            restartDatabase();
        }

        try ( Transaction tx = db.beginTx() )
        {
            assertQueryFindsIdsInOrder( tx, false, DEFAULT_REL_IDX_NAME, "blabla", relId );
            Relationship rel = tx.getRelationshipById( relId );
            rel.removeProperty( PROP );
            tx.commit();
        }
        assertQueryFindsIdsInOrder( db, false, DEFAULT_REL_IDX_NAME, "blabla" );

        checkDatabaseConsistency();
    }

    @Test
    public void relationshipIndexAndPropertyRemove()
    {
        try ( Transaction tx = db.beginTx() )
        {
            tx.execute( format( RELATIONSHIP_CREATE, "rels", asStrList( REL.name() ), asStrList( PROP ) ) ).close();
            tx.commit();
        }
        try ( Transaction tx = db.beginTx() )
        {
            tx.schema().awaitIndexesOnline( 2, TimeUnit.MINUTES );
            tx.commit();
        }
        long relId;
        try ( Transaction tx = db.beginTx() )
        {
            Node node = tx.createNode();
            Relationship rel = node.createRelationshipTo( node, REL );
            relId = rel.getId();
            rel.setProperty( PROP, "blabla" );
            tx.commit();
        }

        try ( Transaction tx = db.beginTx() )
        {
            assertQueryFindsIdsInOrder( db, false, "rels", "blabla", relId );
            Relationship rel = tx.getRelationshipById( relId );
            rel.removeProperty( PROP );
            tx.commit();
        }
        assertQueryFindsIdsInOrder( db, false, DEFAULT_REL_IDX_NAME, "blabla" );

        checkDatabaseConsistency();
    }

    @Test
    public void relationshipIndexAndPropertyRemoveWithRestart()
    {
        try ( Transaction tx = db.beginTx() )
        {
            tx.execute( format( RELATIONSHIP_CREATE, "rels", asStrList( REL.name() ), asStrList( PROP ) ) ).close();
            tx.commit();
        }
        try ( Transaction tx = db.beginTx() )
        {
            tx.schema().awaitIndexesOnline( 2, TimeUnit.MINUTES );
            tx.commit();
        }
        long relId;
        try ( Transaction tx = db.beginTx() )
        {
            Node node = tx.createNode();
            Relationship rel = node.createRelationshipTo( node, REL );
            relId = rel.getId();
            rel.setProperty( PROP, "blabla" );
            tx.commit();
        }

        restartDatabase();

        try ( Transaction tx = db.beginTx() )
        {
            assertQueryFindsIdsInOrder( db, false, "rels", "blabla", relId );
            Relationship rel = tx.getRelationshipById( relId );
            rel.removeProperty( PROP );
            tx.commit();
        }
        try ( Transaction tx = db.beginTx() )
        {
            assertQueryFindsIdsInOrder( db, false, "rels", "blabla" );
            tx.commit();
        }

        checkDatabaseConsistency();
    }

    /**
     * This test comes from github issue #12662
     * https://github.com/neo4j/neo4j/issues/12662
     */
    @Test
    void standardFoldingAnalyzerMustWorkGitHub12662()
    {
        String indexName = "my_index";
        long nodeId;
        try ( Transaction tx = db.beginTx() )
        {
            Node node = tx.createNode( LABEL );
            node.setProperty( PROP, "1SOMECODE1" );
            nodeId = node.getId();
            tx.commit();
        }

        try ( Transaction tx = db.beginTx() )
        {
            String label = asStrList( LABEL.name() );
            String props = asStrList( PROP );
            String analyzer = props + ", {analyzer: 'standard-folding'}";
            tx.execute( format( NODE_CREATE, indexName, label, analyzer ) ).close();
            tx.commit();
        }

        try ( Transaction tx = db.beginTx() )
        {
            tx.schema().awaitIndexesOnline( 1, TimeUnit.HOURS );
            tx.commit();
        }

        try ( Transaction tx = db.beginTx() )
        {
            try ( var iterator = tx.execute( format( QUERY_NODES, indexName, "*SOMECODE*" ) ).columnAs( "node" ) )
            {
                assertTrue( iterator.hasNext() );
                assertThat( ((Node) iterator.next()).getId() ).isEqualTo( nodeId );
                assertFalse( iterator.hasNext() );
            }
            tx.commit();
        }
    }

    @ParameterizedTest
    @EnumSource( SearchString.class )
    void standardFoldingAnalyzerMustFindNonASCIILettersByTheirFolding( SearchString searchString )
    {
        // Given
        // Fulltext index with analyzer: 'standard-folding'
        String indexName = createNodeFulltextIndexWithStandardFoldingAnalyzer();
        char[] nonAsciiLetterArray = NON_ASCII_LETTERS.toCharArray();

        // and
        // a folding from non ascii characters to ascii strings
        Map<Character,String> nonAsciiCharsToFolding = getFoldingOfChars( nonAsciiLetterArray );

        // When
        // Nodes with non Ascii characters
        Map<Character,Long> nonAsciiCharsToNodeId = new HashMap<>();
        String propPrefix = "123";
        String propSuffix = "345";
        try ( Transaction tx = db.beginTx() )
        {
            for ( Map.Entry<Character,String> charToFolding : nonAsciiCharsToFolding.entrySet() )
            {
                Node node = tx.createNode( LABEL );
                Character character = charToFolding.getKey();

                // To make sure no properties are filtered out because of accidental match with stopwords
                // we surround the non ascii letter with prefix and suffix. We use a number to avoid false
                // positives when searching.
                String propValue = propPrefix + character + propSuffix;
                node.setProperty( PROP, propValue );

                long id = node.getId();
                nonAsciiCharsToNodeId.put( character, id );
            }
            tx.commit();
        }

        // Then
        // Should find with exact match and wildcard
        try ( Transaction tx = db.beginTx() )
        {
            for ( char nonAsciiChar : nonAsciiLetterArray )
            {
                Long expectedNodeId = nonAsciiCharsToNodeId.get( nonAsciiChar );
                assertAtLeastSingleHitOnSearch( indexName, expectedNodeId, tx, searchString.searchString( nonAsciiChar, propPrefix, propSuffix ) );
            }
            tx.commit();
        }
    }

    private static Map<Character,String> getFoldingOfChars( char[] nonAsciiCharacterArray )
    {
        Map<Character,String> nonAsciiCharToAsciiFolding = new HashMap<>();
        for ( char nonASCIIChar : nonAsciiCharacterArray )
        {
            String folding = toASCIIFolding( nonASCIIChar );
            nonAsciiCharToAsciiFolding.put( nonASCIIChar, folding );
        }
        return nonAsciiCharToAsciiFolding;
    }

    private String createNodeFulltextIndexWithStandardFoldingAnalyzer()
    {
        String indexName = "my_index";
        try ( Transaction tx = db.beginTx() )
        {
            String label = asStrList( LABEL.name() );
            String props = asStrList( PROP );
            String analyzer = props + ", {analyzer: 'standard-folding'}";
            tx.execute( format( NODE_CREATE, indexName, label, analyzer ) ).close();
            tx.commit();
        }

        try ( Transaction tx = db.beginTx() )
        {
            tx.schema().awaitIndexesOnline( 1, TimeUnit.HOURS );
            tx.commit();
        }
        return indexName;
    }

    private static String toASCIIFolding( char nonASCIIChar )
    {
        char[] result = new char[4];
        int length = ASCIIFoldingFilter.foldToASCII( new char[]{nonASCIIChar}, 0, result, 0, 1 );
        result = Arrays.copyOf( result, length );
        return new String( result );
    }

    private static void assertAtLeastSingleHitOnSearch( String indexName, long expectedNodeId, Transaction tx, String searchString )
    {
        Set<Long> nodeIds = new TreeSet<>();
        try ( var iterator = tx.execute( format( QUERY_NODES, indexName, searchString ) ).columnAs( "node" ) )
        {
            while ( iterator.hasNext() )
            {
                nodeIds.add( ((Node) iterator.next()).getId() );
            }
        }
        assertThat( nodeIds ).as( "expected search '" + searchString + "' to find " + expectedNodeId ).contains( expectedNodeId );
    }

    private long indexesCount()
    {
        long indexesBefore;
        try ( Transaction tx = db.beginTx() )
        {
            indexesBefore = Iterables.count( tx.schema().getIndexes() );
        }
        return indexesBefore;
    }

    private enum SearchString
    {
        FOLDING_EXACT
                {
                    @Override
                    String searchString( Character nonAsciiCharacter, String propPrefix, String propSuffix )
                    {
                        return propPrefix + toASCIIFolding( nonAsciiCharacter ) + propSuffix;
                    }
                },
        FOLDING_WILDCARD
                {
                    @Override
                    String searchString( Character nonAsciiCharacter, String propPrefix, String propSuffix )
                    {
                        return "*" + toASCIIFolding( nonAsciiCharacter ) + "*";
                    }
                };

        abstract String searchString( Character nonAsciiCharacter, String propPrefix, String propSuffix );
    }
}
