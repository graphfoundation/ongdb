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
package org.neo4j.consistency.checking.full;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

import org.neo4j.common.EntityType;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.consistency.ConsistencyCheckService;
import org.neo4j.consistency.RecordType;
import org.neo4j.consistency.checking.GraphStoreFixture;
import org.neo4j.consistency.report.ConsistencySummaryStatistics;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.config.Setting;
import org.neo4j.graphdb.schema.IndexType;
import org.neo4j.internal.helpers.collection.Iterators;
import org.neo4j.internal.helpers.progress.ProgressMonitorFactory;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.io.layout.Neo4jLayout;
import org.neo4j.kernel.api.index.IndexAccessor;
import org.neo4j.kernel.api.index.IndexUpdater;
import org.neo4j.kernel.impl.api.index.IndexUpdateMode;
import org.neo4j.kernel.impl.store.NodeStore;
import org.neo4j.kernel.impl.store.record.NodeRecord;
import org.neo4j.logging.log4j.Log4jLogProvider;
import org.neo4j.storageengine.api.EntityUpdates;
import org.neo4j.storageengine.api.IndexEntryUpdate;
import org.neo4j.storageengine.api.ValueIndexEntryUpdate;
import org.neo4j.storageengine.api.cursor.StoreCursors;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.testdirectory.TestDirectoryExtension;
import org.neo4j.test.utils.TestDirectory;
import org.neo4j.values.storable.CoordinateReferenceSystem;
import org.neo4j.values.storable.Value;
import org.neo4j.values.storable.Values;

import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.consistency.checking.full.ConsistencyFlags.DEFAULT;
import static org.neo4j.graphdb.Label.label;
import static org.neo4j.graphdb.RelationshipType.withName;
import static org.neo4j.internal.recordstorage.RecordCursorTypes.NODE_CURSOR;
import static org.neo4j.io.pagecache.context.CursorContext.NULL;
import static org.neo4j.test.mockito.mock.Property.property;
import static org.neo4j.test.mockito.mock.Property.set;

class SpecialisedIndexFullCheckTest
{
    @TestDirectoryExtension
    abstract class TestBase
    {

        private static final String PROP1 = "key1";
        private static final String PROP2 = "key2";

        @Inject
        private TestDirectory testDirectory;

        protected GraphStoreFixture fixture;
        private final ByteArrayOutputStream logStream = new ByteArrayOutputStream();
        private final Log4jLogProvider logProvider = new Log4jLogProvider( logStream );

        protected final List<Long> indexedNodes = new ArrayList<>();
        private final List<Long> indexedRelationships = new ArrayList<>();
        private final Map<Setting<?>,Object> settings = new HashMap<>();

        abstract IndexType type();

        abstract Object indexedValue();

        abstract Object anotherIndexedValue();

        abstract Object notIndexedValue();

        @BeforeEach
        protected void setUp()
        {
            fixture = createFixture();
        }

        @AfterEach
        void tearDown()
        {
            fixture.close();
        }

        @Test
        void shouldCheckConsistencyOfAConsistentStore() throws Exception
        {
            ConsistencySummaryStatistics result = check();

            assertTrue( result.isConsistent(), result.toString() );
        }

        @ParameterizedTest
        @EnumSource( IndexSize.class )
        void shouldReportIndexInconsistencies( IndexSize indexSize ) throws Exception
        {
            indexSize.createAdditionalData( fixture );

            NodeStore nodeStore = fixture.directStoreAccess().nativeStores().getNodeStore();
            StoreCursors storeCursors = fixture.getStoreCursors();
            try ( var cursor = storeCursors.writeCursor( NODE_CURSOR ) )
            {
                for ( Long id : indexedNodes )
                {
                    NodeRecord nodeRecord = new NodeRecord( id );
                    nodeRecord.clear();
                    nodeStore.updateRecord( nodeRecord, cursor, NULL, storeCursors );
                }
            }

            ConsistencySummaryStatistics stats = check();

            assertFalse( stats.isConsistent() );
            assertThat( logStream.toString() ).contains( "This index entry refers to a node record that is not in use" );
            assertThat( stats.getInconsistencyCountForRecordType( RecordType.INDEX ) ).isEqualTo( 3 );
        }

        @ParameterizedTest
        @EnumSource( IndexSize.class )
        void shouldReportNodesThatAreNotIndexed( IndexSize indexSize ) throws Exception
        {
            indexSize.createAdditionalData( fixture );

            Iterator<IndexDescriptor> indexDescriptorIterator = getValueIndexDescriptors();
            while ( indexDescriptorIterator.hasNext() )
            {
                IndexDescriptor indexDescriptor = indexDescriptorIterator.next();
                if ( indexDescriptor.schema().entityType() == EntityType.NODE )
                {
                    IndexAccessor accessor = fixture.indexAccessorLookup().apply( indexDescriptor );
                    try ( IndexUpdater updater = accessor.newUpdater( IndexUpdateMode.ONLINE, NULL ) )
                    {
                        for ( long nodeId : indexedNodes )
                        {
                            EntityUpdates updates = fixture.nodeAsUpdates( nodeId );
                            for ( IndexEntryUpdate<?> update : updates.valueUpdatesForIndexKeys( singletonList( indexDescriptor ) ) )
                            {
                                updater.process( IndexEntryUpdate.remove( nodeId, indexDescriptor, ((ValueIndexEntryUpdate<?>) update).values() ) );
                            }
                        }
                    }
                }
            }

            ConsistencySummaryStatistics stats = check();

            assertFalse( stats.isConsistent() );
            assertThat( logStream.toString() ).contains( "This node was not found in the expected index" );
            assertThat( stats.getInconsistencyCountForRecordType( RecordType.NODE ) ).isEqualTo( 3 );
        }

        @Test
        void shouldReportRelationshipsThatAreNotIndexed() throws Exception
        {
            Iterator<IndexDescriptor> indexDescriptorIterator = getValueIndexDescriptors();
            while ( indexDescriptorIterator.hasNext() )
            {
                IndexDescriptor indexDescriptor = indexDescriptorIterator.next();
                if ( indexDescriptor.schema().entityType() == EntityType.RELATIONSHIP )
                {
                    IndexAccessor accessor = fixture.indexAccessorLookup().apply( indexDescriptor );
                    try ( IndexUpdater updater = accessor.newUpdater( IndexUpdateMode.ONLINE, NULL ) )
                    {
                        for ( long relId : indexedRelationships )
                        {
                            EntityUpdates updates = fixture.relationshipAsUpdates( relId );
                            for ( IndexEntryUpdate<?> update : updates.valueUpdatesForIndexKeys( singletonList( indexDescriptor ) ) )
                            {
                                updater.process( IndexEntryUpdate.remove( relId, indexDescriptor, ((ValueIndexEntryUpdate<?>) update).values() ) );
                            }
                        }
                    }
                }
            }

            ConsistencySummaryStatistics stats = check();

            assertFalse( stats.isConsistent() );
            assertThat( logStream.toString() ).contains( "This relationship was not found in the expected index" );
            assertThat( stats.getInconsistencyCountForRecordType( RecordType.RELATIONSHIP ) ).isEqualTo( 3 );
        }

        @ParameterizedTest
        @EnumSource( IndexSize.class )
        void shouldReportNodesThatAreIndexedWhenTheyShouldNotBe( IndexSize indexSize ) throws Exception
        {
            indexSize.createAdditionalData( fixture );

            // given
            long newNode = createOneNode();

            Iterator<IndexDescriptor> indexDescriptorIterator = getValueIndexDescriptors();
            while ( indexDescriptorIterator.hasNext() )
            {
                IndexDescriptor indexDescriptor = indexDescriptorIterator.next();
                if ( indexDescriptor.schema().entityType() == EntityType.NODE && !indexDescriptor.isUnique() )
                {
                    IndexAccessor accessor = fixture.indexAccessorLookup().apply( indexDescriptor );
                    try ( IndexUpdater updater = accessor.newUpdater( IndexUpdateMode.ONLINE, NULL ) )
                    {
                        updater.process( IndexEntryUpdate.add( newNode, indexDescriptor, values( indexDescriptor ) ) );
                    }
                }
            }

            // when
            ConsistencySummaryStatistics stats = check();

            assertFalse( stats.isConsistent() );
            assertThat( stats.getInconsistencyCountForRecordType( RecordType.INDEX) ).isEqualTo( 2 );
        }

        Value[] values( IndexDescriptor indexRule )
        {
            switch ( indexRule.schema().getPropertyIds().length )
            {
            case 1: return Iterators.array( Values.of( indexedValue() ) );
            case 2: return Iterators.array( Values.of( indexedValue() ), Values.of( anotherIndexedValue() ) );
            default: throw new UnsupportedOperationException();
            }
        }

        private Iterator<IndexDescriptor> getValueIndexDescriptors()
        {
            return Iterators.filter( descriptor -> !descriptor.isTokenIndex(), fixture.getIndexDescriptors() );
        }

        private ConsistencySummaryStatistics check() throws ConsistencyCheckIncompleteException
        {
            // the database must not be running during the check because of Lucene-based indexes
            // Lucene files are locked when the DB is running
            fixture.close();

            var config = Config.newBuilder().set( GraphDatabaseSettings.neo4j_home, testDirectory.homePath() ).build();

            ConsistencyCheckService checkService = new ConsistencyCheckService();
            return checkService.runFullConsistencyCheck( Neo4jLayout.of( config ).databaseLayout( "neo4j" ),
                    config, ProgressMonitorFactory.NONE, logProvider, false, DEFAULT ).summary();
        }

        private GraphStoreFixture createFixture()
        {
            return new GraphStoreFixture( StringUtils.EMPTY, testDirectory )
            {
                @Override
                protected void generateInitialData( GraphDatabaseService db )
                {
                    try ( var tx = db.beginTx() )
                    {
                        tx.schema().indexFor( label( "Label1" ) ).on( PROP1 ).withIndexType( type() ).create();
                        tx.schema().indexFor( label( "Label1" ) ).on( PROP2 ).withIndexType( type() ).create();

                        tx.schema().indexFor( withName( "Type1" ) ).on( PROP1 ).withIndexType( type() ).create();
                        tx.schema().indexFor( withName( "Type1" ) ).on( PROP2 ).withIndexType( type() ).create();
                        tx.commit();
                    }
                    try ( var tx = db.beginTx() )
                    {
                        tx.schema().awaitIndexesOnline( 2, TimeUnit.MINUTES );
                    }

                    // Create initial data
                    try ( org.neo4j.graphdb.Transaction tx = db.beginTx() )
                    {
                        Node node1 = set( tx.createNode( label( "Label1" ) ), property( PROP1, indexedValue() ) );
                        Node node2 = set( tx.createNode( label( "Label1" ) ), property( PROP1, indexedValue() ), property( PROP2, anotherIndexedValue() ) );
                        Node node3 = set( tx.createNode( label( "Label1" ) ), property( PROP1, notIndexedValue() ) );
                        set( tx.createNode( label( "AnotherLabel" ) ), property( PROP1, indexedValue() ) );
                        set( tx.createNode( label( "Label1" ) ), property( "anotherProperty", indexedValue() ) );
                        Node node6 = tx.createNode();

                        indexedNodes.add( node1.getId() );
                        indexedNodes.add( node2.getId() );

                        // Add another node that is indexed so our tests removing an indexed entry actually run for both IndexSizes
                        set( tx.createNode( label( "Label1" ) ), property( PROP1, indexedValue() ), property( PROP2, anotherIndexedValue() ) );

                        indexedRelationships.add( set( node1.createRelationshipTo( node6, withName( "Type1" ) ), property( PROP1, indexedValue() ) ).getId() );
                        indexedRelationships
                                .add( set( node2.createRelationshipTo( node6, withName( "Type1" ) ), property( PROP1, indexedValue() ),
                                        property( PROP2, anotherIndexedValue() ) ).getId() );
                        indexedRelationships.add(
                                set( node3.createRelationshipTo( node6, withName( "Type1" ) ), property( PROP1, notIndexedValue() ) ).getId() );

                        tx.commit();
                    }
                }

                @Override
                protected Map<Setting<?>,Object> getConfig()
                {
                    return settings;
                }
            };
        }

        protected long createOneNode()
        {
            final AtomicLong id = new AtomicLong();
            fixture.apply( tx ->
            {
                id.set( tx.createNode().getId() );
            } );
            return id.get();
        }
    }

    @Nested
    class PointIndex extends TestBase
    {

        @Override
        IndexType type()
        {
            return IndexType.POINT;
        }

        @Override
        Object indexedValue()
        {
            return Values.pointValue( CoordinateReferenceSystem.Cartesian, 1, 2 );
        }

        @Override
        Object anotherIndexedValue()
        {
            return Values.pointValue( CoordinateReferenceSystem.WGS84_3D, 1, 2, 3 );
        }

        @Override
        Object notIndexedValue()
        {
            return "some string";
        }
    }

    @Nested
    class TextIndex extends TestBase
    {

        @Override
        IndexType type()
        {
            return IndexType.TEXT;
        }

        @Override
        Object indexedValue()
        {
            return "some text";
        }

        @Override
        Object anotherIndexedValue()
        {
            return "another piece of text";
        }

        @Override
        Object notIndexedValue()
        {
            return 123;
        }
    }

    @Nested
    class FullTextIndex extends TestBase
    {

        @Override
        IndexType type()
        {
            return IndexType.FULLTEXT;
        }

        @Override
        Object indexedValue()
        {
            return "some text";
        }

        @Override
        Object anotherIndexedValue()
        {
            return "another piece of text";
        }

        @Override
        Object notIndexedValue()
        {
            return 123;
        }
    }

    /**
     * Indexes are consistency checked in different ways depending on their size.
     * This can be used to make the indexes created in the setup appear large or small.
     */
    private enum IndexSize
    {
        SMALL_INDEX
                {
                    @Override
                    public void createAdditionalData( GraphStoreFixture fixture )
                    {
                        fixture.apply( tx ->
                        {
                            // Create more nodes so our indexes will be considered to be small indexes (less than 5% of nodes in index).
                            for ( int i = 0; i < 80; i++ )
                            {
                                tx.createNode();
                            }
                        } );
                    }
                },
        LARGE_INDEX
                {
                    @Override
                    public void createAdditionalData( GraphStoreFixture fixture )
                    {
                    }
                };

        public abstract void createAdditionalData( GraphStoreFixture fixture );
    }
}
