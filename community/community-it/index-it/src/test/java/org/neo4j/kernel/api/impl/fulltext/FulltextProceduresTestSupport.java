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
package org.neo4j.kernel.api.impl.fulltext;

import org.apache.lucene.queryparser.flexible.standard.QueryParserUtil;
import org.eclipse.collections.api.iterator.MutableLongIterator;
import org.eclipse.collections.api.set.primitive.MutableLongSet;
import org.eclipse.collections.impl.set.mutable.primitive.LongHashSet;
import org.junit.jupiter.params.provider.Arguments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.LongFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.graphdb.Entity;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.ResourceIterator;
import org.neo4j.graphdb.Result;
import org.neo4j.graphdb.Transaction;
import org.neo4j.internal.kernel.api.IndexMonitor;
import org.neo4j.kernel.internal.GraphDatabaseAPI;
import org.neo4j.logging.Level;
import org.neo4j.monitoring.Monitors;
import org.neo4j.test.Barrier;
import org.neo4j.test.TestDatabaseManagementServiceBuilder;
import org.neo4j.test.extension.DbmsController;
import org.neo4j.test.extension.DbmsExtension;
import org.neo4j.test.extension.ExtensionCallback;
import org.neo4j.test.extension.Inject;
import org.neo4j.values.storable.RandomValues;
import org.neo4j.values.storable.Value;
import org.neo4j.values.storable.ValueGroup;

import static java.lang.String.format;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.neo4j.kernel.api.impl.fulltext.FulltextIndexProceduresUtil.DROP;
import static org.neo4j.kernel.api.impl.fulltext.FulltextIndexProceduresUtil.NODE_CREATE;
import static org.neo4j.kernel.api.impl.fulltext.FulltextIndexProceduresUtil.RELATIONSHIP_CREATE;
import static org.neo4j.kernel.api.impl.fulltext.FulltextIndexProceduresUtil.asStrList;

@DbmsExtension( configurationCallback = "configure" )
class FulltextProceduresTestSupport
{
    static final String SCORE = "score";
    static final String NODE = "node";
    static final String RELATIONSHIP = "relationship";
    static final String DESCARTES_MEDITATIONES = "/meditationes--rene-descartes--public-domain.txt";
    static final Label LABEL = Label.label( "Label" );
    static final RelationshipType REL = RelationshipType.withName( "REL" );
    static final String PROP = "prop";
    static final String EVENTUALLY_CONSISTENT = ", {eventually_consistent: 'true'}";
    static final String EVENTUALLY_CONSISTENT_PREFIXED = ", {`fulltext.eventually_consistent`: 'true'}";
    static final String QUERY_NODES = "CALL db.index.fulltext.queryNodes(\"%s\", \"%s\")";
    static final String QUERY_RELS = "CALL db.index.fulltext.queryRelationships(\"%s\", \"%s\")";
    static final String DEFAULT_NODE_IDX_NAME = "nodes";
    static final String DEFAULT_REL_IDX_NAME = "rels";

    @Inject
    GraphDatabaseAPI db;
    @Inject
    DbmsController controller;

    final AtomicBoolean trapPopulation = new AtomicBoolean();
    final Barrier.Control populationScanFinished = new Barrier.Control();

    @ExtensionCallback
    void configure( TestDatabaseManagementServiceBuilder builder )
    {
        Monitors monitors = new Monitors();
        IndexMonitor.MonitorAdapter trappingMonitor = new IndexMonitor.MonitorAdapter()
        {
            @Override
            public void indexPopulationScanComplete()
            {
                if ( trapPopulation.get() )
                {
                    populationScanFinished.reached();
                }
            }
        };
        monitors.addMonitorListener( trappingMonitor );
        builder.setMonitors( monitors );
        builder.setConfig( GraphDatabaseSettings.store_internal_log_level, Level.DEBUG );
    }

    static void assertNoIndexSeeks( Result result )
    {
        assertThat( result.stream().count() ).isEqualTo( 1L );
        String planDescription = result.getExecutionPlanDescription().toString();
        assertThat( planDescription ).contains( "NodeByLabel" );
        assertThat( planDescription ).doesNotContain( "IndexSeek" );
    }

    void restartDatabase()
    {
        controller.restartDbms( db.databaseName() );
    }

    void awaitIndexesOnline()
    {
        try ( Transaction tx = db.beginTx() )
        {
            tx.schema().awaitIndexesOnline( 1, TimeUnit.HOURS );
            tx.commit();
        }
    }

    static void assertQueryFindsIdsInOrder( GraphDatabaseService db, boolean queryNodes, String index, String query, long... ids )
    {
        try ( Transaction tx = db.beginTx() )
        {
            assertQueryFindsIdsInOrder( tx, queryNodes, index, query, ids );
            tx.commit();
        }
    }

    static void assertQueryFindsIdsInOrder( Transaction tx, boolean queryNodes, String index, String query, long... ids )
    {
        String queryCall = queryNodes ? QUERY_NODES : QUERY_RELS;
        Result result = tx.execute( format( queryCall, index, query ) );
        int num = 0;
        Double score = Double.MAX_VALUE;
        while ( result.hasNext() )
        {
            Map<String, Object> entry = result.next();
            Long nextId = ((Entity) entry.get( queryNodes ? NODE : RELATIONSHIP )).getId();
            Double nextScore = (Double) entry.get( SCORE );
            assertThat( nextScore ).isLessThanOrEqualTo( score );
            score = nextScore;
            if ( num < ids.length )
            {
                assertEquals( ids[num], nextId.longValue(), format( "Result returned id %d, expected %d", nextId, ids[num] ) );
            }
            else
            {
                fail( format( "Result returned id %d, which is beyond the number of ids (%d) that were expected.", nextId, ids.length ) );
            }
            num++;
        }
        assertEquals( ids.length, num, "Number of results differ from expected" );
    }

    static void assertQueryFindsIds( GraphDatabaseService db, boolean queryNodes, String index, String query, LongHashSet ids )
    {
        ids = new LongHashSet( ids ); // Create a defensive copy, because we're going to modify this instance.
        String queryCall = queryNodes ? QUERY_NODES : QUERY_RELS;
        long[] expectedIds = ids.toArray();
        MutableLongSet actualIds = new LongHashSet();
        try ( Transaction tx = db.beginTx() )
        {
            LongFunction<Entity> getEntity = queryNodes ? tx::getNodeById : tx::getRelationshipById;
            Result result = tx.execute( format( queryCall, index, query ) );
            Double score = Double.MAX_VALUE;
            while ( result.hasNext() )
            {
                Map<String, Object> entry = result.next();
                long nextId = ((Entity) entry.get( queryNodes ? NODE : RELATIONSHIP )).getId();
                Double nextScore = (Double) entry.get( SCORE );
                assertThat( nextScore ).isLessThanOrEqualTo( score );
                score = nextScore;
                actualIds.add( nextId );
                if ( !ids.remove( nextId ) )
                {
                    String msg = "This id was not expected: " + nextId;
                    failQuery( getEntity, index, query, ids, expectedIds, actualIds, msg );
                }
            }
            if ( !ids.isEmpty() )
            {
                String msg = "Not all expected ids were found: " + ids;
                failQuery( getEntity, index, query, ids, expectedIds, actualIds, msg );
            }
            tx.commit();
        }
    }

    static void failQuery( LongFunction<Entity> getEntity, String index, String query, MutableLongSet ids, long[] expectedIds, MutableLongSet actualIds,
            String msg )
    {
        StringBuilder message = new StringBuilder( msg ).append( '\n' );
        MutableLongIterator itr = ids.longIterator();
        while ( itr.hasNext() )
        {
            long id = itr.next();
            Entity entity = getEntity.apply( id );
            message.append( '\t' ).append( entity ).append( entity.getAllProperties() ).append( '\n' );
        }
        message.append( "for query: '" ).append( query ).append( "'\nin index: " ).append( index ).append( '\n' );
        message.append( "all expected ids: " ).append( Arrays.toString( expectedIds ) ).append( '\n' );
        message.append( "actual ids: " ).append( actualIds );
        itr = actualIds.longIterator();
        while ( itr.hasNext() )
        {
            long id = itr.next();
            Entity entity = getEntity.apply( id );
            message.append( "\n\t" ).append( entity ).append( entity.getAllProperties() );
        }
        fail( message.toString() );
    }

    static List<Value> generateRandomNonStringValues()
    {
        Predicate<Value> nonString = v -> v.valueGroup() != ValueGroup.TEXT;
        return generateRandomValues( nonString );
    }

    static List<Value> generateRandomSimpleValues()
    {
        EnumSet<ValueGroup> simpleTypes = EnumSet.of(
                ValueGroup.BOOLEAN, ValueGroup.BOOLEAN_ARRAY, ValueGroup.NUMBER, ValueGroup.NUMBER_ARRAY );
        return generateRandomValues( v -> simpleTypes.contains( v.valueGroup() ) );
    }

    static List<Value> generateRandomValues( Predicate<Value> predicate )
    {
        int valuesToGenerate = 1000;
        RandomValues generator = RandomValues.create();
        List<Value> values = new ArrayList<>( valuesToGenerate );
        for ( int i = 0; i < valuesToGenerate; i++ )
        {
            Value value;
            do
            {
                value = generator.nextValue();
            }
            while ( !predicate.test( value ) );
            values.add( value );
        }
        return values;
    }

    void createIndexAndWait( EntityUtil entityUtil )
    {
        try ( Transaction tx = db.beginTx() )
        {
            entityUtil.createIndex( tx );
            tx.commit();
        }
        awaitIndexesOnline();
    }

    static void createSimpleRelationshipIndex( Transaction tx )
    {
        tx.execute( format( RELATIONSHIP_CREATE, DEFAULT_REL_IDX_NAME, asStrList( REL.name() ), asStrList( PROP ) ) ).close();
    }

    static void createSimpleNodesIndex( Transaction tx )
    {
        tx.execute( format( NODE_CREATE, DEFAULT_NODE_IDX_NAME, asStrList( LABEL.name() ), asStrList( PROP ) ) ).close();
    }

    interface EntityUtil
    {
        void createIndex( Transaction tx );

        long createEntityWithProperty( Transaction tx, String propertyValue );

        long createEntity( Transaction tx );

        void assertQueryFindsIdsInOrder( Transaction tx, String query, long... ids );

        void assertQueryFindsIds( GraphDatabaseAPI db, String query, LongHashSet ids );

        default void assertQueryFindsIdsInOrder( GraphDatabaseAPI db, String query, long... ids )
        {
            try ( var tx = db.beginTx() )
            {
                assertQueryFindsIdsInOrder( tx, query, ids );
                tx.commit();
            }
        }

        void deleteEntity( Transaction tx, long entityId );

        void dropIndex( Transaction tx );

        Result queryIndex( Transaction tx, String query );

        ResourceIterator<Entity> queryIndexWithOptions( Transaction tx, String query, String options );

        Entity getEntity( Transaction tx, long id );
    }

    static class NodeUtil implements EntityUtil
    {
        @Override
        public void createIndex( Transaction tx )
        {
            createSimpleNodesIndex( tx );
        }

        @Override
        public long createEntityWithProperty( Transaction tx, String propertyValue )
        {
            Node node = tx.createNode( LABEL );
            node.setProperty( PROP, propertyValue );
            return node.getId();
        }

        @Override
        public long createEntity( Transaction tx )
        {
            return tx.createNode( LABEL ).getId();
        }

        @Override
        public void assertQueryFindsIdsInOrder( Transaction tx, String query, long... ids )
        {
            FulltextProceduresTestSupport.assertQueryFindsIdsInOrder( tx, true, DEFAULT_NODE_IDX_NAME, query, ids );
        }

        @Override
        public void assertQueryFindsIds( GraphDatabaseAPI db, String query, LongHashSet ids )
        {
            FulltextProceduresTestSupport.assertQueryFindsIds( db, true, DEFAULT_NODE_IDX_NAME, query, ids );
        }

        @Override
        public void deleteEntity( Transaction tx, long entityId )
        {
            tx.getNodeById( entityId ).delete();
        }

        @Override
        public void dropIndex( Transaction tx )
        {
            tx.execute( format( DROP, DEFAULT_NODE_IDX_NAME ) );
        }

        @Override
        public Result queryIndex( Transaction tx, String query )
        {
            return tx.execute( format( QUERY_NODES, DEFAULT_NODE_IDX_NAME, query ) );
        }

        @Override
        public ResourceIterator<Entity> queryIndexWithOptions( Transaction tx, String query, String options )
        {
            return tx.execute( format( "CALL db.index.fulltext.queryNodes(\"%s\", \"%s\", %s )", DEFAULT_NODE_IDX_NAME, query, options ) ).columnAs( "node" );
        }

        @Override
        public Entity getEntity( Transaction tx, long id )
        {
            return tx.getNodeById( id );
        }

        @Override
        public String toString()
        {
            return "For node";
        }
    }

    static Stream<Arguments> entityTypeProvider()
    {
        return Stream.of( Arguments.of( new NodeUtil() ), Arguments.of( new RelationshipUtil() ) );
    }

    static class RelationshipUtil implements EntityUtil
    {
        @Override
        public void createIndex( Transaction tx )
        {
            createSimpleRelationshipIndex( tx );
        }

        @Override
        public long createEntityWithProperty( Transaction tx, String propertyValue )
        {
            Node node = tx.createNode();
            Relationship rel = node.createRelationshipTo( node, REL );
            rel.setProperty( PROP, propertyValue );
            return rel.getId();
        }

        @Override
        public long createEntity( Transaction tx )
        {
            Node node = tx.createNode();
            return node.createRelationshipTo( node, REL ).getId();
        }

        @Override
        public void assertQueryFindsIdsInOrder( Transaction tx, String query, long... ids )
        {
            FulltextProceduresTestSupport.assertQueryFindsIdsInOrder( tx, false, DEFAULT_REL_IDX_NAME, query, ids );
        }

        @Override
        public void assertQueryFindsIds( GraphDatabaseAPI db, String query, LongHashSet ids )
        {
            FulltextProceduresTestSupport.assertQueryFindsIds( db, false, DEFAULT_REL_IDX_NAME, query, ids );
        }

        @Override
        public void deleteEntity( Transaction tx, long entityId )
        {
            tx.getRelationshipById( entityId ).delete();
        }

        @Override
        public void dropIndex( Transaction tx )
        {
            tx.execute( format( DROP, DEFAULT_REL_IDX_NAME ) );
        }

        @Override
        public Result queryIndex( Transaction tx, String query )
        {
            return tx.execute( format( QUERY_RELS, DEFAULT_REL_IDX_NAME, query ) );
        }

        @Override
        public ResourceIterator<Entity> queryIndexWithOptions( Transaction tx, String query, String options )
        {
            return tx.execute( format( "CALL db.index.fulltext.queryRelationships(\"%s\", \"%s\", %s )", DEFAULT_REL_IDX_NAME, query, options ) )
                     .columnAs( "relationship" );
        }

        @Override
        public Entity getEntity( Transaction tx, long id )
        {
            return tx.getRelationshipById( id );
        }

        @Override
        public String toString()
        {
            return "For relationship";
        }
    }
}
