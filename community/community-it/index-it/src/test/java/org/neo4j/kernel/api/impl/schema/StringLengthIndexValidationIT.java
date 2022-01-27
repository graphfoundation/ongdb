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
package org.neo4j.kernel.api.impl.schema;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.schema.IndexCreator;
import org.neo4j.graphdb.schema.IndexDefinition;
import org.neo4j.graphdb.schema.Schema;
import org.neo4j.internal.kernel.api.IndexMonitor;
import org.neo4j.kernel.impl.coreapi.schema.IndexDefinitionImpl;
import org.neo4j.kernel.internal.GraphDatabaseAPI;
import org.neo4j.monitoring.Monitors;
import org.neo4j.test.Barrier;
import org.neo4j.test.RandomSupport;
import org.neo4j.test.TestDatabaseManagementServiceBuilder;
import org.neo4j.test.extension.DbmsExtension;
import org.neo4j.test.extension.ExtensionCallback;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.RandomExtension;

import static java.util.concurrent.TimeUnit.MINUTES;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.configuration.GraphDatabaseSettings.default_schema_provider;
import static org.neo4j.test.TestLabels.LABEL_ONE;

@DbmsExtension( configurationCallback = "configure" )
@ExtendWith( RandomExtension.class )
public abstract class StringLengthIndexValidationIT
{
    private static final String propKey = "largeString";

    private final AtomicBoolean trapPopulation = new AtomicBoolean();
    private final Barrier.Control populationScanFinished = new Barrier.Control();
    private final int singleKeySizeLimit = getSingleKeySizeLimit();
    private final GraphDatabaseSettings.SchemaIndex schemaIndex = getSchemaIndex();

    @Inject
    private GraphDatabaseAPI db;

    @Inject
    private RandomSupport random;

    protected abstract int getSingleKeySizeLimit();

    // Each char in string need to fit in one byte
    protected abstract String getString( RandomSupport random, int keySize );

    protected abstract GraphDatabaseSettings.SchemaIndex getSchemaIndex();

    protected abstract String expectedPopulationFailureCauseMessage( long indexId, long entityId );

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
        builder.setConfig( default_schema_provider, schemaIndex.providerName() );
    }

    @Test
    void shouldSuccessfullyWriteAndReadWithinIndexKeySizeLimit()
    {
        createIndex( propKey );
        String propValue = getString( random, singleKeySizeLimit );
        long expectedNodeId;

        // Write
        expectedNodeId = createNode( propValue );

        // Read
        assertReadNode( propValue, expectedNodeId );
    }

    @Test
    void shouldSuccessfullyPopulateIndexWithinIndexKeySizeLimit()
    {
        String propValue = getString( random, singleKeySizeLimit );
        long expectedNodeId;

        // Write
        expectedNodeId = createNode( propValue );

        // Populate
        createIndex( propKey );

        // Read
        assertReadNode( propValue, expectedNodeId );
    }

    @Test
    void txMustFailIfExceedingIndexKeySizeLimit()
    {
        long indexId = createIndex( propKey );
        long nodeId;

        // Write
        try ( Transaction tx = db.beginTx() )
        {
            String propValue = getString( random, singleKeySizeLimit + 1 );
            Node node = tx.createNode( LABEL_ONE );
            nodeId = node.getId();

            IllegalArgumentException e = assertThrows( IllegalArgumentException.class, () -> node.setProperty( propKey, propValue ) );
            assertThat( e.getMessage() ).contains( String.format(
                    "Property value is too large to index, please see index documentation for limitations. " +
                    "Index: Index( id=%d, name='index_71616483', type='GENERAL BTREE', schema=(:LABEL_ONE {largeString}), indexProvider='%s' ), entity id: %d",
                    indexId, schemaIndex.providerName(), nodeId ) );
        }
    }

    @Test
    void indexPopulationMustFailIfExceedingIndexKeySizeLimit()
    {
        // Write
        String propValue = getString( random, singleKeySizeLimit + 1 );
        long nodeId = createNode( propValue );

        // Create index should be fine
        long indexId;
        try ( Transaction tx = db.beginTx() )
        {
            var index = tx.schema().indexFor( LABEL_ONE ).on( propKey ).create();
            indexId = getIndexIdFrom( index );
            tx.commit();
        }
        assertIndexFailToComeOnline( indexId, nodeId );
        assertIndexInFailedState( indexId, nodeId );
    }

    @Test
    public void externalUpdatesMustNotFailIndexPopulationIfWithinIndexKeySizeLimit() throws InterruptedException
    {
        trapPopulation.set( true );
        try ( Transaction tx = db.beginTx() )
        {
            tx.createNode();
            tx.commit();
        }

        // Create index should be fine
        try ( Transaction tx = db.beginTx() )
        {
            tx.schema().indexFor( LABEL_ONE ).on( propKey ).create();
            tx.commit();
        }

        // Wait for index population to start
        populationScanFinished.await();

        // External update to index while population has not yet finished
        String propValue = getString( random, singleKeySizeLimit );
        long nodeId = createNode( propValue );

        // Continue index population
        populationScanFinished.release();

        // Waiting for it to come online should succeed
        try ( Transaction tx = db.beginTx() )
        {
            tx.schema().awaitIndexesOnline( 2, TimeUnit.MINUTES );
            tx.commit();
        }

        assertReadNode( propValue, nodeId );
    }

    @Test
    public void externalUpdatesMustFailIndexPopulationIfExceedingIndexKeySizeLimit() throws InterruptedException
    {
        trapPopulation.set( true );
        try ( Transaction tx = db.beginTx() )
        {
            tx.createNode();
            tx.commit();
        }

        // Create index should be fine
        long indexId;
        try ( Transaction tx = db.beginTx() )
        {
            var index = tx.schema().indexFor( LABEL_ONE ).on( propKey ).create();
            indexId = getIndexIdFrom( index );
            tx.commit();
        }

        // Wait for index population to start
        populationScanFinished.await();

        // External update to index while population has not yet finished
        String propValue = getString( random, singleKeySizeLimit + 1 );
        long nodeId = createNode( propValue );

        // Continue index population
        populationScanFinished.release();

        assertIndexFailToComeOnline( indexId, nodeId );
        assertIndexInFailedState( indexId, nodeId );
    }

    public void assertIndexFailToComeOnline( long indexId, long entityId )
    {
        // Waiting for it to come online should fail
        IllegalStateException e = assertThrows( IllegalStateException.class, () ->
        {
            try ( Transaction tx = db.beginTx() )
            {
                tx.schema().awaitIndexesOnline( 2, MINUTES );
                tx.commit();
            }
        } );

        GraphDatabaseSettings.SchemaIndex schemaIndex = getSchemaIndex();
        assertThat( e.getMessage() ).contains(
                String.format( "Index IndexDefinition[label:LABEL_ONE on:largeString] " +
                               "(Index( id=%d, name='index_71616483', type='GENERAL BTREE', schema=(:LABEL_ONE {largeString}), indexProvider='%s' )) " +
                               "entered a FAILED state.",
                        indexId, schemaIndex.providerName() ),
                expectedPopulationFailureCauseMessage( indexId, entityId ) );
    }

    public void assertIndexInFailedState( long indexId, long entityId )
    {
        // Index should be in failed state
        try ( Transaction tx = db.beginTx() )
        {
            Iterator<IndexDefinition> iterator = tx.schema().getIndexes( LABEL_ONE ).iterator();
            assertTrue( iterator.hasNext() );
            IndexDefinition next = iterator.next();
            assertEquals( Schema.IndexState.FAILED, tx.schema().getIndexState( next ), "state is FAILED" );
            assertThat( tx.schema().getIndexFailure( next ) ).contains( expectedPopulationFailureCauseMessage( indexId, entityId ) );
            tx.commit();
        }
    }

    @Test
    void shouldHandleSizesCloseToTheLimit()
    {
        // given
        createIndex( propKey );

        // when
        Map<String,Long> strings = new HashMap<>();
        try ( Transaction tx = db.beginTx() )
        {
            for ( int i = 0; i < 1_000; i++ )
            {
                String string;
                do
                {
                    string = getString( random, random.nextInt( singleKeySizeLimit / 2, singleKeySizeLimit ) );
                }
                while ( strings.containsKey( string ) );

                Node node = tx.createNode( LABEL_ONE );
                node.setProperty( propKey, string );
                strings.put( string, node.getId() );
            }
            tx.commit();
        }

        // then
        try ( Transaction tx = db.beginTx() )
        {
            for ( String string : strings.keySet() )
            {
                Node node = tx.findNode( LABEL_ONE, propKey, string );
                assertEquals( strings.get( string ).longValue(), node.getId() );
            }
            tx.commit();
        }
    }

    private long createIndex( String... keys )
    {
        long indexId;
        try ( Transaction tx = db.beginTx() )
        {
            IndexCreator indexCreator = tx.schema().indexFor( LABEL_ONE );
            for ( String key : keys )
            {
                indexCreator = indexCreator.on( key );
            }
            var index = indexCreator.create();
            indexId = getIndexIdFrom( index );
            tx.commit();
        }
        try ( Transaction tx = db.beginTx() )
        {
            tx.schema().awaitIndexesOnline( 2, MINUTES );
            tx.commit();
        }
        return indexId;
    }

    private static long getIndexIdFrom( IndexDefinition index )
    {
        return ((IndexDefinitionImpl) index).getIndexReference().getId();
    }

    private long createNode( String propValue )
    {
        long expectedNodeId;
        try ( Transaction tx = db.beginTx() )
        {
            Node node = tx.createNode( LABEL_ONE );
            node.setProperty( propKey, propValue );
            expectedNodeId = node.getId();
            tx.commit();
        }
        return expectedNodeId;
    }

    private void assertReadNode( String propValue, long expectedNodeId )
    {
        try ( Transaction tx = db.beginTx() )
        {
            Node node = tx.findNode( LABEL_ONE, propKey, propValue );
            Assertions.assertNotNull( node );
            assertEquals( expectedNodeId, node.getId(), "node id" );
            tx.commit();
        }
    }
}
