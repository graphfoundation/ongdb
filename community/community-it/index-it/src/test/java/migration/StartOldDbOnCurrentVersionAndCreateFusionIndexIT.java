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
package migration;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.stream.Stream;

import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.dbms.api.DatabaseManagementServiceBuilder;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.schema.IndexDefinition;
import org.neo4j.internal.kernel.api.IndexMonitor;
import org.neo4j.internal.kernel.api.IndexReadSession;
import org.neo4j.internal.kernel.api.InternalIndexState;
import org.neo4j.internal.kernel.api.NodeValueIndexCursor;
import org.neo4j.internal.kernel.api.PropertyIndexQuery;
import org.neo4j.internal.kernel.api.SchemaRead;
import org.neo4j.internal.kernel.api.TokenRead;
import org.neo4j.internal.kernel.api.exceptions.TransactionFailureException;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.internal.schema.IndexProviderDescriptor;
import org.neo4j.internal.schema.SchemaDescriptors;
import org.neo4j.io.compress.ZipUtils;
import org.neo4j.io.fs.DefaultFileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.kernel.api.KernelTransaction;
import org.neo4j.kernel.impl.coreapi.InternalTransaction;
import org.neo4j.kernel.impl.index.schema.GenericNativeIndexProvider;
import org.neo4j.kernel.impl.index.schema.fusion.NativeLuceneFusionIndexProviderFactory30;
import org.neo4j.kernel.internal.GraphDatabaseAPI;
import org.neo4j.monitoring.Monitors;
import org.neo4j.test.TestDatabaseManagementServiceBuilder;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.Neo4jLayoutExtension;
import org.neo4j.test.utils.TestDirectory;
import org.neo4j.values.storable.CoordinateReferenceSystem;
import org.neo4j.values.storable.DurationValue;
import org.neo4j.values.storable.Values;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;
import static org.neo4j.internal.helpers.ArrayUtil.concat;
import static org.neo4j.internal.helpers.collection.Iterables.asList;
import static org.neo4j.internal.helpers.collection.Iterators.single;
import static org.neo4j.internal.kernel.api.IndexQueryConstraints.unconstrained;
import static org.neo4j.test.Unzip.unzip;

@Neo4jLayoutExtension
class StartOldDbOnCurrentVersionAndCreateFusionIndexIT
{
    private static final String ZIP_FILE_3_5 = "3_5-db.zip";

    private static final String KEY1 = "key1";
    private static final String KEY2 = "key2";
    private DatabaseManagementService managementService;
    // number of new indexes dbms will create on its own for internal purposes, like system database
    // and two token indexes for system database.
    private static final int NUMBER_OF_SYSTEM_INDEXES = 2 + 3;

    private enum Provider
    {
        // in order of appearance
        LUCENE_10( "Label1", "lucene-1.0", NativeLuceneFusionIndexProviderFactory30.DESCRIPTOR ),
        FUSION_10( "Label2", "lucene+native-1.0", NativeLuceneFusionIndexProviderFactory30.DESCRIPTOR ),
        FUSION_20( "Label3", "lucene+native-2.0", GenericNativeIndexProvider.DESCRIPTOR ),
        BTREE_10( "Label4", "native-btree-1.0", GenericNativeIndexProvider.DESCRIPTOR ),
        BTREE_10_40( "Label5", "native-btree-1.0", GenericNativeIndexProvider.DESCRIPTOR );

        private final Label label;
        @SuppressWarnings( {"unused", "FieldCanBeLocal"} )
        private final String originallyCreatedWithProvider;
        private final IndexProviderDescriptor descriptor;

        Provider( String labelName, String originallyCreatedWithProvider, IndexProviderDescriptor descriptor )
        {
            this.label = Label.label( labelName );
            this.originallyCreatedWithProvider = originallyCreatedWithProvider;
            this.descriptor = descriptor;
        }
    }

    private static final Provider DEFAULT_PROVIDER = Provider.BTREE_10_40;

    @Inject
    private TestDirectory testDirectory;
    @Inject
    private DatabaseLayout databaseLayout;

    @Disabled( "Here as reference for how 3.5 db was created" )
    @Test
    void create3_5Database() throws Exception
    {
        Path storeDir = tempStoreDirectory();
        DatabaseManagementServiceBuilder builder = new TestDatabaseManagementServiceBuilder( storeDir );

        createIndexDataAndShutdown( builder, "lucene-1.0", Provider.LUCENE_10.label );
        createIndexDataAndShutdown( builder, "lucene+native-1.0", Provider.FUSION_10.label );
        createIndexDataAndShutdown( builder, "lucene+native-2.0", Provider.FUSION_20.label );
        createIndexDataAndShutdown( builder, GraphDatabaseSettings.SchemaIndex.NATIVE_BTREE10.providerName(), Provider.BTREE_10.label, db ->
        {
            try ( Transaction tx = db.beginTx() )
            {
                tx.execute( "CALL db.index.fulltext.createNodeIndex('fts1', ['Fts1'], ['prop1'] )" ).close();
                tx.execute( "CALL db.index.fulltext.createNodeIndex('fts2', ['Fts2', 'Fts3'], ['prop1', 'prop2'] )" ).close();
                tx.execute( "CALL db.index.fulltext.createNodeIndex('fts3', ['Fts4'], ['prop1'], {eventually_consistent: 'true'} )" ).close();
                tx.execute( "CALL db.index.fulltext.createRelationshipIndex('fts4', ['FtsRel1', 'FtsRel2'], ['prop1', 'prop2'], " +
                        "{eventually_consistent: 'true'} )" ).close();
                tx.commit();
            }
            try ( Transaction tx = db.beginTx() )
            {
                tx.schema().awaitIndexesOnline( 10, TimeUnit.MINUTES );
                Node node = tx.createNode( Label.label( "Fts1" ), Label.label( "Fts2" ), Label.label( "Fts3" ), Label.label( "Fts4" ) );
                node.setProperty( "prop1", "abc" );
                node.setProperty( "prop2", "abc" );
                node.createRelationshipTo( node, RelationshipType.withName( "FtsRel1" ) ).setProperty( "prop1", "abc" );
                node.createRelationshipTo( node, RelationshipType.withName( "FtsRel2" ) ).setProperty( "prop2", "abc" );
                tx.commit();
            }
            try ( Transaction tx = db.beginTx() )
            {
                tx.execute( "call db.index.fulltext.awaitEventuallyConsistentIndexRefresh" ).close();
                tx.commit();
            }
        } );

        Path zipFile = storeDir.resolveSibling( storeDir.getFileName().toString() + ".zip" );
        ZipUtils.zip( new DefaultFileSystemAbstraction(), storeDir, zipFile );
        System.out.println( "Db created in " + zipFile.toAbsolutePath() );
    }

    @Test
    void shouldOpen3_5DbAndCreateAndWorkWithSomeFusionIndexes() throws Exception
    {
        Provider highestProviderInOldVersion = Provider.BTREE_10;
        shouldOpenOldDbAndCreateAndWorkWithSomeFusionIndexes( ZIP_FILE_3_5, highestProviderInOldVersion );
    }

    private void shouldOpenOldDbAndCreateAndWorkWithSomeFusionIndexes( String zippedDbName, Provider highestProviderInOldVersion ) throws Exception
    {
        // given
        Path targetDirectory = databaseLayout.databaseDirectory();
        unzip( getClass(), zippedDbName, targetDirectory );
        IndexRecoveryTracker indexRecoveryTracker = new IndexRecoveryTracker();
        // when
        Path storeDir = testDirectory.homePath();
        managementService = setupDb( storeDir, indexRecoveryTracker );
        GraphDatabaseAPI db = getDefaultDatabase();
        // then
        Provider[] providers = providersUpToAndIncluding( highestProviderInOldVersion );
        Provider[] providersIncludingSubject = concat( providers, DEFAULT_PROVIDER );
        int fulltextIndexes = 4;
        int lookupIndexes = 1;
        int expectedNumberOfIndexes = fulltextIndexes + lookupIndexes + providers.length * 2;
        try
        {
            // All indexes needs to be rebuilt:
            verifyInitialState( indexRecoveryTracker, expectedNumberOfIndexes, InternalIndexState.POPULATING );

            // Wait for all populating indexes to finish, so we can verify their contents:
            try ( Transaction tx = db.beginTx() )
            {
                tx.schema().awaitIndexesOnline( 10, TimeUnit.MINUTES );
                tx.commit();
            }

            // then
            for ( Provider provider : providers )
            {
                verifyIndexes( db, provider.label );
            }

            // when
            createIndexesAndData( db, DEFAULT_PROVIDER.label );

            // then
            verifyIndexes( db, DEFAULT_PROVIDER.label );

            // when
            for ( Provider provider : providersIncludingSubject )
            {
                additionalUpdates( db, provider.label );

                // then
                verifyAfterAdditionalUpdate( db, provider.label );
            }

            // then
            try ( Transaction tx = db.beginTx() )
            {
                IndexDefinition fts1 = tx.schema().getIndexByName( "fts1" );

                Iterator<Label> fts1labels = fts1.getLabels().iterator();
                assertTrue( fts1labels.hasNext() );
                assertEquals( fts1labels.next().name(), "Fts1" );
                assertFalse( fts1labels.hasNext() );

                Iterator<String> fts1props = fts1.getPropertyKeys().iterator();
                assertTrue( fts1props.hasNext() );
                assertEquals( "prop1", fts1props.next() );
                assertFalse( fts1props.hasNext() );

                IndexDefinition fts2 = tx.schema().getIndexByName( "fts2" );

                Iterator<Label> fts2labels = fts2.getLabels().iterator();
                assertTrue( fts2labels.hasNext() );
                assertEquals( fts2labels.next().name(), "Fts2" );
                assertTrue( fts2labels.hasNext() );
                assertEquals( fts2labels.next().name(), "Fts3" );
                assertFalse( fts2labels.hasNext() );

                Iterator<String> fts2props = fts2.getPropertyKeys().iterator();
                assertTrue( fts2props.hasNext() );
                assertEquals( "prop1", fts2props.next() );
                assertTrue( fts2props.hasNext() );
                assertEquals( "prop2", fts2props.next() );
                assertFalse( fts2props.hasNext() );

                IndexDefinition fts3 = tx.schema().getIndexByName( "fts3" );

                Iterator<Label> fts3labels = fts3.getLabels().iterator();
                assertTrue( fts3labels.hasNext() );
                assertEquals( fts3labels.next().name(), "Fts4" );
                assertFalse( fts3labels.hasNext() );

                Iterator<String> fts3props = fts3.getPropertyKeys().iterator();
                assertTrue( fts3props.hasNext() );
                assertEquals( "prop1", fts3props.next() );
                assertFalse( fts3props.hasNext() );
                // TODO verify the index configuration of 'fts3' -- it is eventually consistent.

                IndexDefinition fts4 = tx.schema().getIndexByName( "fts4" );

                Iterator<RelationshipType> fts4relTypes = fts4.getRelationshipTypes().iterator();
                assertTrue( fts4relTypes.hasNext() );
                assertEquals( fts4relTypes.next().name(), "FtsRel1" );
                assertTrue( fts4relTypes.hasNext() );
                assertEquals( fts4relTypes.next().name(), "FtsRel2" );
                assertFalse( fts4relTypes.hasNext() );

                Iterator<String> fts4props = fts4.getPropertyKeys().iterator();
                assertTrue( fts4props.hasNext() );
                assertEquals( "prop1", fts4props.next() );
                assertTrue( fts4props.hasNext() );
                assertEquals( "prop2", fts4props.next() );
                assertFalse( fts4props.hasNext() );
                // TODO verify the index configuration of 'fts3' -- it is eventually consistent.

                try ( var result = tx.execute( "CALL db.index.fulltext.queryNodes( 'fts1', 'abc' )" ).stream() )
                {
                    assertEquals( result.count(), 1L );
                }
                try ( var result = tx.execute( "CALL db.index.fulltext.queryNodes( 'fts2', 'abc' )" ).stream() )
                {
                    assertEquals( result.count(), 1L );
                }
                try ( var result = tx.execute( "CALL db.index.fulltext.queryNodes( 'fts3', 'abc' )" ).stream() )
                {
                    assertEquals( result.count(), 1L );
                }
                try ( var result = tx.execute( "CALL db.index.fulltext.queryRelationships( 'fts4', 'abc' )" ).stream() )
                {
                    assertEquals( result.count(), 2L );
                }

                tx.commit();
            }

            // and finally
            for ( Provider provider : providersIncludingSubject )
            {
                verifyExpectedProvider( db, provider.label, provider.descriptor );
            }
        }
        finally
        {
            managementService.shutdown();
        }

        // when
        indexRecoveryTracker = new IndexRecoveryTracker();
        managementService = setupDb( storeDir, indexRecoveryTracker );
        try
        {
            int numberNewIndexes = 2;
            verifyInitialState( indexRecoveryTracker, expectedNumberOfIndexes + numberNewIndexes + NUMBER_OF_SYSTEM_INDEXES, InternalIndexState.ONLINE );
        }
        finally
        {
            managementService.shutdown();
        }
    }

    private static Provider[] providersUpToAndIncluding( Provider provider )
    {
        return Stream.of( Provider.values() ).filter( p -> p.ordinal() <= provider.ordinal() ).toArray( Provider[]::new );
    }

    private static DatabaseManagementService setupDb( Path storeDir, IndexRecoveryTracker indexRecoveryTracker )
    {
        Monitors monitors = new Monitors();
        monitors.addMonitorListener( indexRecoveryTracker );
        return new TestDatabaseManagementServiceBuilder( storeDir )
                .setMonitors( monitors )
                .setConfig( GraphDatabaseSettings.allow_upgrade, true )
                .build();
    }

    private GraphDatabaseAPI getDefaultDatabase()
    {
        return (GraphDatabaseAPI) managementService.database( DEFAULT_DATABASE_NAME );
    }

    private static void verifyInitialState( IndexRecoveryTracker indexRecoveryTracker, int expectedNumberOfIndexes, InternalIndexState expectedInitialState )
    {
        assertEquals( expectedNumberOfIndexes, indexRecoveryTracker.initialStateMap.size(), "exactly " + expectedNumberOfIndexes + " indexes " );
        for ( Map.Entry<IndexDescriptor,InternalIndexState> indexStateEntry : indexRecoveryTracker.initialStateMap.entrySet() )
        {
            switch ( indexStateEntry.getKey().getIndexType() )
            {
            case LOOKUP:
                assertEquals( InternalIndexState.ONLINE, indexStateEntry.getValue(),
                        "Unexpected lookup index state: " + indexRecoveryTracker.initialStateMap );
                break;
            default:
                assertEquals( expectedInitialState, indexStateEntry.getValue(),
                        "initial state is online, don't do recovery: " + indexRecoveryTracker.initialStateMap );
                break;
            }
        }
    }

    private static void verifyExpectedProvider( GraphDatabaseAPI db, Label label, IndexProviderDescriptor expectedDescriptor )
            throws TransactionFailureException
    {
        try ( InternalTransaction tx = (InternalTransaction) db.beginTx();
              KernelTransaction kernelTransaction = tx.kernelTransaction() )
        {
            TokenRead tokenRead = kernelTransaction.tokenRead();
            SchemaRead schemaRead = kernelTransaction.schemaRead();

            int labelId = tokenRead.nodeLabel( label.name() );
            int key1Id = tokenRead.propertyKey( KEY1 );
            int key2Id = tokenRead.propertyKey( KEY2 );

            IndexDescriptor index = single( schemaRead.index( SchemaDescriptors.forLabel( labelId, key1Id ) ) );
            assertIndexHasExpectedProvider( expectedDescriptor, index );
            index = single( schemaRead.index( SchemaDescriptors.forLabel( labelId, key1Id, key2Id ) ) );
            assertIndexHasExpectedProvider( expectedDescriptor, index );
            tx.commit();
        }
    }

    private static void assertIndexHasExpectedProvider( IndexProviderDescriptor expectedDescriptor, IndexDescriptor index )
    {
        assertEquals( expectedDescriptor.getKey(), index.getIndexProvider().getKey(), "same key" );
        assertEquals( expectedDescriptor.getVersion(), index.getIndexProvider().getVersion(), "same version" );
    }

    private static void createIndexDataAndShutdown( DatabaseManagementServiceBuilder builder, String indexProvider, Label label )
    {
        createIndexDataAndShutdown( builder, indexProvider, label, db -> {} );
    }

    private static void createIndexDataAndShutdown( DatabaseManagementServiceBuilder builder, String indexProvider, Label label,
            Consumer<GraphDatabaseService> otherActions )
    {
        builder.setConfig( GraphDatabaseSettings.default_schema_provider, indexProvider );
        DatabaseManagementService dbms = builder.build();
        try
        {
            GraphDatabaseService db = dbms.database( DEFAULT_DATABASE_NAME );
            otherActions.accept( db );
            createIndexData( db, label );
        }
        finally
        {
            dbms.shutdown();
        }
    }

    private static void createIndexData( GraphDatabaseService db, Label label )
    {
        createIndexesAndData( db, label );
    }

    private static Path tempStoreDirectory() throws IOException
    {
        return Files.createTempDirectory( "create-db-ongdb" );
    }

    private static void createIndexesAndData( GraphDatabaseService db, Label label )
    {
        try ( Transaction tx = db.beginTx() )
        {
            tx.schema().indexFor( label ).on( KEY1 ).create();
            tx.schema().indexFor( label ).on( KEY1 ).on( KEY2 ).create();
            tx.commit();
        }
        try ( Transaction tx = db.beginTx() )
        {
            tx.schema().awaitIndexesOnline( 10, TimeUnit.MINUTES );
            tx.commit();
        }

        createData( db, label );
    }

    private static void createData( GraphDatabaseService db, Label label )
    {
        try ( Transaction tx = db.beginTx() )
        {
            for ( int i = 0; i < 100; i++ )
            {
                Node node = tx.createNode( label );
                Object value = i % 2 == 0 ? i : String.valueOf( i );
                node.setProperty( KEY1, value );
                if ( i % 3 == 0 )
                {
                    node.setProperty( KEY2, value );
                }
            }
            tx.commit();
        }
    }

    private static void createSpatialAndTemporalData( GraphDatabaseAPI db, Label label )
    {
        try ( Transaction tx = db.beginTx() )
        {
            for ( int i = 0; i < 100; i++ )
            {
                Node node = tx.createNode( label );
                Object value = i % 2 == 0 ?
                               Values.pointValue( CoordinateReferenceSystem.Cartesian, i, i ) :
                               DurationValue.duration( 0, 0, i, 0 );
                node.setProperty( KEY1, value );
                if ( i % 3 ==  0 )
                {
                    node.setProperty( KEY2, value );
                }
            }
            tx.commit();
        }
    }

    private static void additionalUpdates( GraphDatabaseAPI db, Label label )
    {
        createData( db, label );
        createSpatialAndTemporalData( db, label );
    }

    private static void verifyIndexes( GraphDatabaseAPI db, Label label ) throws Exception
    {
        assertTrue( hasIndex( db, label, KEY1 ) );
        assertEquals( 100, countIndexedNodes( db, label, KEY1 ) );

        assertTrue( hasIndex( db, label, KEY1, KEY2 ) );
        assertEquals( 34, countIndexedNodes( db, label, KEY1, KEY2 ) );
    }

    private static void verifyAfterAdditionalUpdate( GraphDatabaseAPI db, Label label ) throws Exception
    {
        assertTrue( hasIndex( db, label, KEY1 ) );
        assertEquals( 300, countIndexedNodes( db, label, KEY1 ) );

        assertTrue( hasIndex( db, label, KEY1, KEY2 ) );
        assertEquals( 102, countIndexedNodes( db, label, KEY1, KEY2 ) );
    }

    private static int countIndexedNodes( GraphDatabaseAPI db, Label label, String... keys ) throws Exception
    {
        try ( InternalTransaction tx = (InternalTransaction) db.beginTx() )
        {
            KernelTransaction ktx = tx.kernelTransaction();

            TokenRead tokenRead = ktx.tokenRead();
            int labelId = tokenRead.nodeLabel( label.name() );
            int[] propertyKeyIds = new int[keys.length];
            for ( int i = 0; i < propertyKeyIds.length; i++ )
            {
                propertyKeyIds[i] = tokenRead.propertyKey( keys[i] );
            }
            PropertyIndexQuery[] predicates = new PropertyIndexQuery[propertyKeyIds.length];
            for ( int i = 0; i < propertyKeyIds.length; i++ )
            {
                predicates[i] = PropertyIndexQuery.exists( propertyKeyIds[i] );
            }
            IndexDescriptor index = single( ktx.schemaRead().index( SchemaDescriptors.forLabel( labelId, propertyKeyIds ) ) );
            IndexReadSession indexSession = ktx.dataRead().indexReadSession( index );
            int count = 0;
            try ( NodeValueIndexCursor cursor = ktx.cursors().allocateNodeValueIndexCursor( ktx.cursorContext(), ktx.memoryTracker() ) )
            {
                ktx.dataRead().nodeIndexSeek( ktx.queryContext(), indexSession, cursor, unconstrained(), predicates );
                while ( cursor.next() )
                {
                    count++;
                }
            }
            tx.commit();
            return count;
        }
    }

    private static boolean hasIndex( GraphDatabaseService db, Label label, String... keys )
    {
        try ( Transaction tx = db.beginTx() )
        {
            List<String> keyList = asList( keys );
            for ( IndexDefinition index : tx.schema().getIndexes( label ) )
            {
                if ( asList( index.getPropertyKeys() ).equals( keyList ) )
                {
                    return true;
                }
            }
            tx.commit();
        }
        return false;
    }

    private static class IndexRecoveryTracker extends IndexMonitor.MonitorAdapter
    {
        Map<IndexDescriptor,InternalIndexState> initialStateMap = new HashMap<>();

        @Override
        public void initialState( String databaseName, IndexDescriptor descriptor, InternalIndexState state )
        {
            initialStateMap.put( descriptor, state );
        }

        public void reset()
        {
            initialStateMap = new HashMap<>();
        }
    }
}
