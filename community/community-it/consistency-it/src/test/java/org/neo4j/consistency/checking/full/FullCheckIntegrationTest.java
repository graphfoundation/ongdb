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
import org.apache.commons.lang3.mutable.MutableInt;
import org.eclipse.collections.api.map.primitive.IntObjectMap;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

import org.neo4j.common.EntityType;
import org.neo4j.common.TokenNameLookup;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.consistency.RecordType;
import org.neo4j.consistency.checker.DebugContext;
import org.neo4j.consistency.checker.NodeBasedMemoryLimiter;
import org.neo4j.consistency.checking.GraphStoreFixture;
import org.neo4j.consistency.checking.GraphStoreFixture.IdGenerator;
import org.neo4j.consistency.checking.GraphStoreFixture.TransactionDataBuilder;
import org.neo4j.consistency.report.ConsistencySummaryStatistics;
import org.neo4j.consistency.store.DirectStoreAccess;
import org.neo4j.counts.CountsStore;
import org.neo4j.exceptions.KernelException;
import org.neo4j.function.ThrowingSupplier;
import org.neo4j.graphdb.Direction;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.config.Setting;
import org.neo4j.internal.counts.RelationshipGroupDegreesStore;
import org.neo4j.internal.helpers.collection.Iterators;
import org.neo4j.internal.helpers.collection.Pair;
import org.neo4j.internal.helpers.progress.ProgressMonitorFactory;
import org.neo4j.internal.kernel.api.TokenWrite;
import org.neo4j.internal.recordstorage.SchemaRuleAccess;
import org.neo4j.internal.schema.ConstraintDescriptor;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.internal.schema.IndexProviderDescriptor;
import org.neo4j.internal.schema.IndexType;
import org.neo4j.internal.schema.SchemaRule;
import org.neo4j.internal.schema.constraints.ConstraintDescriptorFactory;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.PageCursor;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.KernelVersion;
import org.neo4j.kernel.api.KernelTransaction;
import org.neo4j.kernel.api.exceptions.index.IndexEntryConflictException;
import org.neo4j.kernel.api.index.IndexAccessor;
import org.neo4j.kernel.api.index.IndexPopulator;
import org.neo4j.kernel.api.index.IndexUpdater;
import org.neo4j.kernel.impl.api.index.IndexSamplingConfig;
import org.neo4j.kernel.impl.api.index.IndexUpdateMode;
import org.neo4j.kernel.impl.coreapi.InternalTransaction;
import org.neo4j.kernel.impl.index.schema.GenericNativeIndexProvider;
import org.neo4j.kernel.impl.store.DynamicArrayStore;
import org.neo4j.kernel.impl.store.DynamicRecordAllocator;
import org.neo4j.kernel.impl.store.DynamicStringStore;
import org.neo4j.kernel.impl.store.LabelTokenStore;
import org.neo4j.kernel.impl.store.NeoStores;
import org.neo4j.kernel.impl.store.NodeLabelsField;
import org.neo4j.kernel.impl.store.NodeStore;
import org.neo4j.kernel.impl.store.PropertyStore;
import org.neo4j.kernel.impl.store.PropertyType;
import org.neo4j.kernel.impl.store.RecordStore;
import org.neo4j.kernel.impl.store.SchemaStore;
import org.neo4j.kernel.impl.store.StandardDynamicRecordAllocator;
import org.neo4j.kernel.impl.store.allocator.ReusableRecordsAllocator;
import org.neo4j.kernel.impl.store.record.AbstractBaseRecord;
import org.neo4j.kernel.impl.store.record.DynamicRecord;
import org.neo4j.kernel.impl.store.record.LabelTokenRecord;
import org.neo4j.kernel.impl.store.record.NodeRecord;
import org.neo4j.kernel.impl.store.record.PropertyBlock;
import org.neo4j.kernel.impl.store.record.PropertyRecord;
import org.neo4j.kernel.impl.store.record.Record;
import org.neo4j.kernel.impl.store.record.RecordLoad;
import org.neo4j.kernel.impl.store.record.RelationshipGroupRecord;
import org.neo4j.kernel.impl.store.record.RelationshipRecord;
import org.neo4j.kernel.impl.store.record.RelationshipTypeTokenRecord;
import org.neo4j.kernel.impl.store.record.SchemaRecord;
import org.neo4j.logging.log4j.Log4jLogProvider;
import org.neo4j.storageengine.api.EntityTokenUpdate;
import org.neo4j.storageengine.api.EntityUpdates;
import org.neo4j.storageengine.api.IndexEntryUpdate;
import org.neo4j.storageengine.api.ValueIndexEntryUpdate;
import org.neo4j.storageengine.api.cursor.StoreCursors;
import org.neo4j.string.UTF8;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.testdirectory.EphemeralTestDirectoryExtension;
import org.neo4j.test.utils.TestDirectory;
import org.neo4j.util.Bits;
import org.neo4j.values.storable.Value;
import org.neo4j.values.storable.Values;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.configuration.GraphDatabaseInternalSettings.consistency_checker_fail_fast_threshold;
import static org.neo4j.consistency.ConsistencyCheckService.defaultConsistencyCheckThreadsNumber;
import static org.neo4j.consistency.checking.SchemaRuleUtil.constraintIndexRule;
import static org.neo4j.consistency.checking.SchemaRuleUtil.indexRule;
import static org.neo4j.consistency.checking.SchemaRuleUtil.nodePropertyExistenceConstraintRule;
import static org.neo4j.consistency.checking.SchemaRuleUtil.relPropertyExistenceConstraintRule;
import static org.neo4j.consistency.checking.SchemaRuleUtil.uniquenessConstraintRule;
import static org.neo4j.graphdb.Label.label;
import static org.neo4j.graphdb.RelationshipType.withName;
import static org.neo4j.graphdb.schema.IndexType.RANGE;
import static org.neo4j.internal.helpers.collection.Iterables.asIterable;
import static org.neo4j.internal.kernel.api.TokenRead.ANY_LABEL;
import static org.neo4j.internal.kernel.api.TokenRead.ANY_RELATIONSHIP_TYPE;
import static org.neo4j.internal.recordstorage.RecordCursorTypes.DYNAMIC_PROPERTY_KEY_TOKEN_CURSOR;
import static org.neo4j.internal.recordstorage.RecordCursorTypes.DYNAMIC_REL_TYPE_TOKEN_CURSOR;
import static org.neo4j.internal.recordstorage.RecordCursorTypes.LABEL_TOKEN_CURSOR;
import static org.neo4j.internal.recordstorage.RecordCursorTypes.NODE_CURSOR;
import static org.neo4j.internal.recordstorage.RecordCursorTypes.RELATIONSHIP_CURSOR;
import static org.neo4j.internal.recordstorage.RecordCursorTypes.REL_TYPE_TOKEN_CURSOR;
import static org.neo4j.internal.schema.IndexPrototype.forSchema;
import static org.neo4j.internal.schema.IndexPrototype.uniqueForSchema;
import static org.neo4j.internal.schema.SchemaDescriptors.forLabel;
import static org.neo4j.internal.schema.SchemaDescriptors.forRelType;
import static org.neo4j.io.memory.ByteBufferFactory.heapBufferFactory;
import static org.neo4j.io.pagecache.context.CursorContext.NULL;
import static org.neo4j.kernel.api.schema.SchemaTestUtil.SIMPLE_NAME_LOOKUP;
import static org.neo4j.kernel.impl.store.AbstractDynamicStore.readFullByteArrayFromHeavyRecords;
import static org.neo4j.kernel.impl.store.DynamicArrayStore.allocateFromNumbers;
import static org.neo4j.kernel.impl.store.DynamicArrayStore.getRightArray;
import static org.neo4j.kernel.impl.store.DynamicNodeLabels.dynamicPointer;
import static org.neo4j.kernel.impl.store.LabelIdArray.prependNodeId;
import static org.neo4j.kernel.impl.store.PropertyType.ARRAY;
import static org.neo4j.kernel.impl.store.record.Record.NO_LABELS_FIELD;
import static org.neo4j.kernel.impl.store.record.Record.NO_NEXT_PROPERTY;
import static org.neo4j.kernel.impl.store.record.Record.NO_NEXT_RELATIONSHIP;
import static org.neo4j.kernel.impl.store.record.Record.NO_PREVIOUS_PROPERTY;
import static org.neo4j.kernel.impl.store.record.Record.NULL_REFERENCE;
import static org.neo4j.kernel.impl.store.record.RecordLoad.FORCE;
import static org.neo4j.memory.EmptyMemoryTracker.INSTANCE;
import static org.neo4j.storageengine.api.EntityTokenUpdate.tokenChanges;
import static org.neo4j.test.mockito.mock.Property.property;
import static org.neo4j.test.mockito.mock.Property.set;
import static org.neo4j.util.Bits.bits;

@EphemeralTestDirectoryExtension
public class FullCheckIntegrationTest
{
    private static final IndexProviderDescriptor DESCRIPTOR = GenericNativeIndexProvider.DESCRIPTOR;
    private static final String PROP1 = "key1";
    private static final String PROP2 = "key2";
    private static final Object VALUE1 = "value1";
    private static final Object VALUE2 = "value2";
    private final TokenNameLookup tokenNameLookup = SIMPLE_NAME_LOOKUP;

    @Inject
    private TestDirectory testDirectory;

    protected GraphStoreFixture fixture;
    private final ByteArrayOutputStream logStream = new ByteArrayOutputStream();
    private final Log4jLogProvider logProvider = new Log4jLogProvider( logStream );

    @RegisterExtension
    ExtendFailureMessageWatcher watcher = new ExtendFailureMessageWatcher( () -> String.format( "%n%s%n", logStream ) );

    protected int label1;
    protected int label2;
    protected int label3;
    protected int draconian;
    protected int key1;
    protected int mandatory;
    protected int C;
    protected int T;
    protected int M;
    protected final List<Long> indexedNodes = new ArrayList<>();
    private final List<Long> indexedRelationships = new ArrayList<>();
    private long relationshipOfTypeT;
    private final Map<Setting<?>,Object> settings = new HashMap<>();

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
        // when
        ConsistencySummaryStatistics result = check();

        // then
        assertEquals( 0, result.getTotalInconsistencyCount(), result.toString() );
    }

    @Test
    void shouldReportNodeInconsistencies() throws Exception
    {
        // given
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                                            GraphStoreFixture.IdGenerator next )
            {
                tx.create( new NodeRecord( next.node() ).initialize( false, -1, false, next.relationship(), 0 ) );
            }
        } );

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.NODE, 1 )
                   .andThatsAllFolks();
    }

    @Test
    void shouldReportInlineNodeLabelInconsistencies() throws Exception
    {
        // given
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                                            GraphStoreFixture.IdGenerator next )
            {
                NodeRecord nodeRecord = new NodeRecord( next.node() ).initialize( false, -1, false, -1, 0 );
                NodeLabelsField.parseLabelsField( nodeRecord ).add( 10, null, null, NULL, StoreCursors.NULL, INSTANCE );
                tx.create( nodeRecord );
            }
        } );

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.NODE, 1 )
                   .andThatsAllFolks();
    }

    @Test
    void shouldReportNodeDynamicLabelContainingUnknownLabelAsNodeInconsistency() throws Exception
    {
        // given
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                                            GraphStoreFixture.IdGenerator next )
            {
                NodeRecord nodeRecord = new NodeRecord( next.node() ).initialize( false, -1, false, -1, 0 );
                DynamicRecord record = inUse( new DynamicRecord( next.nodeLabel() ) );
                List<DynamicRecord> newRecords = new ArrayList<>();
                allocateFromNumbers( newRecords, prependNodeId( nodeRecord.getId(), new long[]{42L} ),
                        new ReusableRecordsAllocator( 60, record ), NULL, INSTANCE );
                nodeRecord.setLabelField( dynamicPointer( newRecords ), newRecords );

                tx.create( nodeRecord );
            }
        } );

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.NODE, 1 )
                   .andThatsAllFolks();
    }

    @Test
    void shouldNotReportAnythingForNodeWithConsistentChainOfDynamicRecordsWithLabels() throws Exception
    {
        // given
        assertEquals( 3, chainOfDynamicRecordsWithLabelsForANode( 130 ).first().size() );

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        assertTrue( stats.isConsistent(), "should be consistent" );
    }

    @Test
    void shouldReportNodeLabelIndexInconsistencies() throws Exception
    {
        // given
        GraphStoreFixture.IdGenerator idGenerator = fixture.idGenerator();
        long nodeId1 = idGenerator.node();
        long labelId = idGenerator.label() - 1;

        Iterable<EntityTokenUpdate> nodeLabelUpdates = asIterable( tokenChanges( nodeId1, new long[]{}, new long[]{labelId} ) );
        writeToNodeLabelStructure( fixture, nodeLabelUpdates );

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.LABEL_SCAN_DOCUMENT, 1 )
                   .andThatsAllFolks();
    }

    @Test
    void shouldReportRelationshipTypeIndexInconsistencies1() throws Exception
    {
        // given
        // relationship present in type index but not in store
        GraphStoreFixture.IdGenerator idGenerator = fixture.idGenerator();
        long relationshipId = idGenerator.relationship();
        long relationshipTypeId = idGenerator.relationshipType() - 1;

        IndexDescriptor rtiDescriptor = findTokenIndex( fixture, EntityType.RELATIONSHIP );
        IndexAccessor accessor = fixture.indexAccessorLookup().apply( rtiDescriptor );
        try ( IndexUpdater indexUpdater = accessor.newUpdater( IndexUpdateMode.ONLINE, NULL ) )
        {
            indexUpdater.process( IndexEntryUpdate.change( relationshipId, rtiDescriptor, new long[]{}, new long[]{relationshipTypeId} ) );
        }

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.RELATIONSHIP_TYPE_SCAN_DOCUMENT, 1 )
                   .andThatsAllFolks();
    }

    @Test
    void shouldReportRelationshipTypeIndexInconsistencies2() throws Exception
    {
        // given
        // type index and store has different type for same relationship
        RecordStore<RelationshipRecord> relationshipStore = fixture.directStoreAccess().nativeStores().getRelationshipStore();
        RelationshipRecord relationshipRecord = new RelationshipRecord( 0 );

        long relationshipId = relationshipOfTypeT;
        try ( var cursor = relationshipStore.openPageCursorForReading( relationshipId, NULL ) )
        {
            relationshipStore.getRecordByCursor( relationshipId, relationshipRecord, RecordLoad.NORMAL, cursor );
        }
        relationshipRecord.setType( relationshipRecord.getType() + 1 );
        StoreCursors storeCursors = fixture.getStoreCursors();
        try ( PageCursor pageCursor = storeCursors.writeCursor( RELATIONSHIP_CURSOR ) )
        {
            relationshipStore.updateRecord( relationshipRecord, pageCursor, NULL, storeCursors );
        }

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.RELATIONSHIP_TYPE_SCAN_DOCUMENT, 2 )
                   .verify( RecordType.COUNTS, 2 )
                   .andThatsAllFolks();
    }

    private IndexDescriptor findTokenIndex( GraphStoreFixture fixture, EntityType entityType )
    {
        Iterator<IndexDescriptor> indexDescriptors = fixture.getIndexDescriptors();
        while ( indexDescriptors.hasNext() )
        {
            IndexDescriptor next = indexDescriptors.next();
            if ( next.isTokenIndex() && next.schema().entityType() == entityType )
            {
                return next;
            }
        }
        throw new RuntimeException( entityType + " index missing" );
    }

    void writeToNodeLabelStructure( GraphStoreFixture fixture, Iterable<EntityTokenUpdate> entityTokenUpdates ) throws IOException, IndexEntryConflictException
    {
        IndexDescriptor tokenIndex = findTokenIndex( fixture, EntityType.NODE );
        IndexAccessor accessor = fixture.indexAccessorLookup().apply( tokenIndex );
        try ( IndexUpdater indexUpdater = accessor.newUpdater( IndexUpdateMode.ONLINE, NULL ) )
        {
            for ( EntityTokenUpdate entityTokenUpdate : entityTokenUpdates )
            {
                indexUpdater.process( IndexEntryUpdate.change( entityTokenUpdate.getEntityId(), tokenIndex,
                                                               entityTokenUpdate.getTokensBefore(), entityTokenUpdate.getTokensAfter() ) );
            }
        }
    }

    @ParameterizedTest
    @EnumSource( IndexSize.class )
    void shouldReportIndexInconsistencies( IndexSize indexSize ) throws Exception
    {
        indexSize.createAdditionalData( fixture );

        // given
        NodeStore nodeStore = fixture.directStoreAccess().nativeStores().getNodeStore();
        StoreCursors storeCursors = fixture.getStoreCursors();
        try ( var cursor = storeCursors.writeCursor( NODE_CURSOR ) )
        {
            for ( Long indexedNodeId : indexedNodes )
            {
                nodeStore.updateRecord( notInUse( new NodeRecord( indexedNodeId ).initialize( false, -1, false, -1, 0 ) ), cursor, NULL, storeCursors );
            }
        }

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.INDEX, 6 ) // 6 (3 BTREE and 3 RANGE) index entries are pointing to nodes not in use
                   .verify( RecordType.LABEL_SCAN_DOCUMENT, 2 ) // the label scan is pointing to 2 nodes not in use
                   .verify( RecordType.COUNTS, 2 )
                   .andThatsAllFolks();
    }

    @Test
    void shouldNotReportIndexInconsistenciesIfIndexIsFailed() throws Exception
    {
        // this test fails all indexes, and then destroys a record and makes sure we only get a failure for
        // the label scan store but not for any index

        // given
        DirectStoreAccess storeAccess = fixture.directStoreAccess();

        // fail all indexes
        Iterator<IndexDescriptor> rules = getValueIndexDescriptors();
        while ( rules.hasNext() )
        {
            IndexDescriptor rule = rules.next();
            IndexSamplingConfig samplingConfig = new IndexSamplingConfig( Config.defaults() );
            IndexPopulator populator = storeAccess.indexes().lookup( rule.getIndexProvider() )
                    .getPopulator( rule, samplingConfig, heapBufferFactory( 1024 ), INSTANCE, tokenNameLookup );
            populator.markAsFailed( "Oh noes! I was a shiny index and then I was failed" );
            populator.close( false, NULL );
        }

        NodeStore nodeStore = storeAccess.nativeStores().getNodeStore();
        StoreCursors storeCursors = fixture.getStoreCursors();
        try ( var cursor = storeCursors.writeCursor( NODE_CURSOR ) )
        {
            for ( Long indexedNodeId : indexedNodes )
            {
                nodeStore.updateRecord( notInUse( new NodeRecord( indexedNodeId ).initialize( false, -1, false, -1, 0 ) ), cursor, NULL, storeCursors );
            }
        }

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.LABEL_SCAN_DOCUMENT, 2 ) // the label scan is pointing to 2 nodes not in use
                   .verify( RecordType.COUNTS, 2 )
                   .andThatsAllFolks();
    }

    @Test
    void shouldReportMismatchedLabels() throws Exception
    {
        final List<Integer> labels = new ArrayList<>();

        // given
        final Pair<List<DynamicRecord>, List<Integer>> pair = chainOfDynamicRecordsWithLabelsForANode( 3 );
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                                            GraphStoreFixture.IdGenerator next )
            {
                NodeRecord node = new NodeRecord( 42 ).initialize( false, -1, false, -1, 0 );
                node.setInUse( true );
                List<DynamicRecord> dynamicRecords;
                dynamicRecords = pair.first();
                labels.addAll( pair.other() );
                node.setLabelField( dynamicPointer( dynamicRecords ), dynamicRecords );
                tx.create( node );

            }
        } );

        long[] before = asArray( labels );
        labels.remove( 1 );
        long[] after = asArray( labels );

        writeToNodeLabelStructure( fixture, singletonList( tokenChanges( 42, before, after ) ) );

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.LABEL_SCAN_DOCUMENT, 1 )
                   .andThatsAllFolks();
    }

    private static long[] asArray( List<? extends Number> in )
    {
        long[] longs = new long[in.size()];
        for ( int i = 0; i < in.size(); i++ )
        {
            longs[i] = in.get( i ).longValue();
        }
        return longs;
    }

    @Test
    void shouldReportMismatchedInlinedLabels() throws Exception
    {
        // given
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                                            GraphStoreFixture.IdGenerator next )
            {
                NodeRecord node = new NodeRecord( 42 ).initialize( false, -1, false, -1, 0 );
                node.setInUse( true );
                node.setLabelField( inlinedLabelsLongRepresentation( label1, label2 ), Collections.emptyList() );
                tx.create( node );
            }
        } );

        EntityTokenUpdate update = tokenChanges( 42, new long[]{label1, label2}, new long[]{label1} );
        writeToNodeLabelStructure( fixture, singletonList( update ) );

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.LABEL_SCAN_DOCUMENT, 1 )
                   .andThatsAllFolks();
    }

    @ParameterizedTest
    @EnumSource( IndexSize.class )
    void shouldReportNodesThatAreNotIndexed( IndexSize indexSize ) throws Exception
    {
        indexSize.createAdditionalData( fixture );

        // given
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

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.NODE, 6 ) // 1 node missing from 1 index + 1 node missing from 2 indexes (for both RANGE and BTREE)
                   .andThatsAllFolks();
    }

    @Test
    void shouldReportRelationshipsThatAreNotIndexed() throws Exception
    {
        // given
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

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.RELATIONSHIP, 6 )
                // 1 relationship missing from 1 index + 1 relationship missing from 2 indexes (for both RANGE and BTREE)
                .andThatsAllFolks();
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

        // then
        on( stats ).verify( RecordType.INDEX, 4 ) // 2 BTREE and 2 RANGE indexes
                .andThatsAllFolks();
    }

    @ParameterizedTest
    @EnumSource( IndexSize.class )
    void shouldReportNodesThatAreIndexedWithTheWrongValues( IndexSize indexSize ) throws Exception
    {
        indexSize.createAdditionalData( fixture );

        // given
        final AtomicLong id = new AtomicLong();
        fixture.apply( tx ->
        {
            Node node = set( tx.createNode( label( "label3" ) ), property( PROP1, VALUE1 ), property(  PROP2, VALUE2 ) );
            id.set( node.getId() );
        } );

        Iterator<IndexDescriptor> indexDescriptorIterator = getValueIndexDescriptors();
        while ( indexDescriptorIterator.hasNext() )
        {
            IndexDescriptor indexDescriptor = indexDescriptorIterator.next();
            if ( indexDescriptor.schema().entityType() == EntityType.NODE && !indexDescriptor.isUnique() )
            {
                IndexAccessor accessor = fixture.indexAccessorLookup().apply( indexDescriptor );
                try ( IndexUpdater updater = accessor.newUpdater( IndexUpdateMode.ONLINE, NULL ) )
                {
                    updater.process( IndexEntryUpdate.change( id.get(), indexDescriptor, values( indexDescriptor ), otherValues( indexDescriptor ) ) );
                }
            }
        }

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        RecordType expectedType = indexSize == IndexSize.SMALL_INDEX ? RecordType.NODE : RecordType.INDEX;
        on( stats ).verify( expectedType, 4 ) // 2 BTREE and 2 RANGE indexes
                .andThatsAllFolks();
    }

    @Test
    void shouldReportRelationshipsThatAreIndexedWithTheWrongValues() throws Exception
    {
        // given
        final AtomicLong id = new AtomicLong();
        fixture.apply( tx ->
        {
            Node node = tx.createNode();
            Relationship relationship = set( node.createRelationshipTo( node, withName( "C" ) ), property( PROP1, VALUE1 ), property(  PROP2, VALUE2 ) );
            id.set( relationship.getId() );
        } );

        Iterator<IndexDescriptor> indexDescriptorIterator = getValueIndexDescriptors();
        while ( indexDescriptorIterator.hasNext() )
        {
            IndexDescriptor indexDescriptor = indexDescriptorIterator.next();
            if ( indexDescriptor.schema().entityType() == EntityType.RELATIONSHIP )
            {
                IndexAccessor accessor = fixture.indexAccessorLookup().apply( indexDescriptor );
                try ( IndexUpdater updater = accessor.newUpdater( IndexUpdateMode.ONLINE, NULL ) )
                {
                    updater.process( IndexEntryUpdate.change( id.get(), indexDescriptor, values( indexDescriptor ), otherValues( indexDescriptor ) ) );
                }
            }
        }

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.RELATIONSHIP, 4 ) // 2 BTREE and 2 RANGE indexes
                .andThatsAllFolks();
    }

    Value[] otherValues( IndexDescriptor indexRule )
    {
        switch ( indexRule.schema().getPropertyIds().length )
        {
        case 1:
            return Iterators.array( Values.of( VALUE2 ) );
        case 2:
            return Iterators.array( Values.of( VALUE2 ), Values.of( VALUE1 ) );
        default:
            throw new UnsupportedOperationException();
        }
    }

    @ParameterizedTest
    @EnumSource( IndexSize.class )
    void shouldReportNodesWithDuplicatePropertyValueInUniqueIndex( IndexSize indexSize ) throws Exception
    {
        // given
        indexSize.createAdditionalData( fixture );

        Iterator<IndexDescriptor> indexRuleIterator = getValueIndexDescriptors();
        // Create a node so the duplicate in the index refers to a valid node
        // (IndexChecker only reports the duplicate if it refers to a node id lower than highId)
        long nodeId = createOneNode();
        while ( indexRuleIterator.hasNext() )
        {
            IndexDescriptor indexRule = indexRuleIterator.next();
            // Don't close this accessor. It will be done when shutting down db.
            IndexAccessor accessor = fixture.indexAccessorLookup().apply( indexRule );

            try ( IndexUpdater updater = accessor.newUpdater( IndexUpdateMode.ONLINE, NULL ) )
            {
                // There is already another node (created in generateInitialData()) that has this value
                updater.process( IndexEntryUpdate.add( nodeId, indexRule, values( indexRule ) ) );
            }
            accessor.force( NULL );
        }

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.NODE, 2 ) // the duplicate in the 2 unique indexes
                   .verify( RecordType.INDEX, 6 ) // the index entries pointing to node that should not be in index (3 BTREE and 3 RANGE indexes)
                   .andThatsAllFolks();
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

    protected static Value[] values( IndexDescriptor indexRule )
    {
        switch ( indexRule.schema().getPropertyIds().length )
        {
        case 1: return Iterators.array( Values.of( VALUE1 ) );
        case 2: return Iterators.array( Values.of( VALUE1 ), Values.of( VALUE2 ) );
        default: throw new UnsupportedOperationException();
        }
    }

    @Test
    void shouldReportMissingMandatoryNodeProperty() throws Exception
    {
        // given
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                    GraphStoreFixture.IdGenerator next )
            {
                // structurally correct, but does not have the 'mandatory' property with the 'draconian' label
                NodeRecord node = new NodeRecord( next.node() ).initialize( false, next.property(), false, -1, 0 );
                node.setInUse( true );
                node.setLabelField( inlinedLabelsLongRepresentation( draconian ), Collections.emptyList() );
                PropertyRecord property = new PropertyRecord( node.getNextProp(), node );
                property.setInUse( true );
                PropertyBlock block = new PropertyBlock();
                block.setSingleBlock( key1 | (((long) PropertyType.INT.intValue()) << 24) | (1337L << 28) );
                property.addPropertyBlock( block );
                tx.create( node );
                tx.create( property );
            }
        } );

        createNodePropertyExistenceConstraint( draconian, mandatory );

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.NODE, 1 )
                .andThatsAllFolks();
    }

    @Test
    void shouldReportMissingMandatoryRelationshipProperty() throws Exception
    {
        // given
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                    GraphStoreFixture.IdGenerator next )
            {
                long nodeId1 = next.node();
                long nodeId2 = next.node();
                long relId = next.relationship();
                long propId = next.property();

                NodeRecord node1 = new NodeRecord( nodeId1 ).initialize( true, NO_NEXT_PROPERTY.intValue(), false, relId, NO_LABELS_FIELD.intValue() );
                NodeRecord node2 = new NodeRecord( nodeId2 ).initialize( true, NO_NEXT_PROPERTY.intValue(), false, relId, NO_LABELS_FIELD.intValue() );

                // structurally correct, but does not have the 'mandatory' property with the 'M' rel type
                RelationshipRecord relationship = new RelationshipRecord( relId );
                relationship.initialize( true, 0, nodeId1, nodeId2, M,
                        1, NO_NEXT_RELATIONSHIP.intValue(), 1, NO_NEXT_RELATIONSHIP.intValue(), true, true );
                relationship.setNextProp( propId );

                PropertyRecord property = new PropertyRecord( propId, relationship );
                property.setInUse( true );
                PropertyBlock block = new PropertyBlock();
                block.setSingleBlock( key1 | (((long) PropertyType.INT.intValue()) << 24) | (1337L << 28) );
                property.addPropertyBlock( block );

                tx.create( node1 );
                tx.create( node2 );
                tx.create( relationship );
                tx.create( property );
                tx.incrementRelationshipCount( ANY_LABEL, ANY_RELATIONSHIP_TYPE, ANY_LABEL, 1 );
                tx.incrementRelationshipCount( ANY_LABEL, M, ANY_LABEL, 1 );
            }
        } );

        createRelationshipPropertyExistenceConstraint( M, mandatory );

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.RELATIONSHIP, 1 )
                .andThatsAllFolks();
    }

    private static long inlinedLabelsLongRepresentation( long... labelIds )
    {
        long header = (long) labelIds.length << 36;
        byte bitsPerLabel = (byte) (36 / labelIds.length);
        Bits bits = bits( 5 );
        for ( long labelId : labelIds )
        {
            bits.put( labelId, bitsPerLabel );
        }
        return header | bits.getLongs()[0];
    }

    @Test
    void shouldReportCyclesInDynamicRecordsWithLabels() throws Exception
    {
        // given
        final List<DynamicRecord> chain = chainOfDynamicRecordsWithLabelsForANode( 176/*3 full records*/ ).first();
        assertEquals( 3, chain.size(), "number of records in chain" );
        assertEquals( chain.get( 0 ).getLength(), chain.get( 2 ).getLength(), "all records full" );
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                                            GraphStoreFixture.IdGenerator next )
            {
                long nodeId = ((long[]) getRightArray( readFullByteArrayFromHeavyRecords( chain, ARRAY ) ).asObject())[0];
                NodeRecord before = inUse( new NodeRecord( nodeId ).initialize( false, -1, false, -1, 0 ) );
                NodeRecord after = inUse( new NodeRecord( nodeId ).initialize( false, -1, false, -1, 0 ) );
                DynamicRecord record1 = cloneRecord( chain.get( 0 ) );
                DynamicRecord record2 = cloneRecord( chain.get( 1 ) );
                DynamicRecord record3 = cloneRecord( chain.get( 2 ) );

                record3.setNextBlock( record2.getId() );
                before.setLabelField( dynamicPointer( chain ), chain );
                after.setLabelField( dynamicPointer( chain ), asList( record1, record2, record3 ) );
                tx.update( before, after );
            }
        } );

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.NODE, 1 )
                   .verify( RecordType.COUNTS, 176 )
                   .andThatsAllFolks();
    }

    private Pair<List<DynamicRecord>,List<Integer>> chainOfDynamicRecordsWithLabelsForANode( int labelCount )
            throws KernelException
    {
        final long[] labels = new long[labelCount + 1]; // allocate enough labels to need three records
        final List<Integer> createdLabels = new ArrayList<>();
        for ( int i = 1/*leave space for the node id*/; i < labels.length; i++ )
        {
            final int offset = i;
            fixture.apply( new GraphStoreFixture.Transaction()
            { // Neo4j can create no more than one label per transaction...
                @Override
                protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                        GraphStoreFixture.IdGenerator next )
                {
                    Integer label = next.label();
                    tx.nodeLabel( (int) (labels[offset] = label), "label:" + offset, false );
                    createdLabels.add( label );
                }
            } );
        }
        final List<DynamicRecord> chain = new ArrayList<>();
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                    GraphStoreFixture.IdGenerator next )
            {
                NodeRecord nodeRecord = new NodeRecord( next.node() ).initialize( false, -1, false, -1, 0 );
                DynamicRecord record1 = inUse( new DynamicRecord( next.nodeLabel() ) );
                DynamicRecord record2 = inUse( new DynamicRecord( next.nodeLabel() ) );
                DynamicRecord record3 = inUse( new DynamicRecord( next.nodeLabel() ) );
                labels[0] = nodeRecord.getId(); // the first id should not be a label id, but the id of the node
                ReusableRecordsAllocator allocator = new ReusableRecordsAllocator( 60, record1, record2, record3 );
                allocateFromNumbers( chain, labels, allocator, NULL, INSTANCE );

                nodeRecord.setLabelField( dynamicPointer( chain ), chain );

                tx.create( nodeRecord );
            }
        } );
        return Pair.of( chain, createdLabels );
    }

    @Test
    void shouldReportNodeDynamicLabelContainingDuplicateLabelAsNodeInconsistency() throws Exception
    {
        int nodeId = 1000;
        List<DynamicRecord> duplicatedLabel = new ArrayList<>();
        final Pair<List<DynamicRecord>, List<Integer>> labels = chainOfDynamicRecordsWithLabelsForANode( 1 );

        // given
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                    GraphStoreFixture.IdGenerator next )
            {
                NodeRecord node = new NodeRecord( nodeId ).initialize( false, -1, false, -1, 0 );
                node.setInUse( true );
                List<DynamicRecord> labelRecords = labels.first();
                node.setLabelField( dynamicPointer( labelRecords ), labelRecords );
                tx.create( node );

                Integer labelId = labels.other().get( 0 );
                DynamicRecord record = inUse( new DynamicRecord( labelId ) );
                allocateFromNumbers( duplicatedLabel, new long[]{nodeId, labelId, labelId}, new ReusableRecordsAllocator( 60, record ), NULL, INSTANCE );
            }
        } );

        NeoStores neoStores = fixture.directStoreAccess().nativeStores();
        NodeRecord nodeRecord = new NodeRecord( nodeId );
        NodeStore nodeStore = neoStores.getNodeStore();
        try ( var cursor = nodeStore.openPageCursorForReading( 0, CursorContext.NULL ) )
        {
            nodeStore.getRecordByCursor( nodeId, nodeRecord, FORCE, cursor );
        }
        nodeRecord.setLabelField( dynamicPointer( duplicatedLabel ), duplicatedLabel );
        nodeRecord.setInUse( true );
        StoreCursors storeCursors = fixture.getStoreCursors();
        try ( var storeCursor = storeCursors.writeCursor( NODE_CURSOR ) )
        {
            nodeStore.updateRecord( nodeRecord, storeCursor, NULL, storeCursors );
        }

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.NODE, 1 ) // the duplicated label
                   .verify( RecordType.COUNTS, 0 )
                   .andThatsAllFolks();
    }

    @Test
    void shouldReportRelationshipInconsistencies() throws Exception
    {
        // given
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                                            GraphStoreFixture.IdGenerator next )
            {
                RelationshipRecord relationship = new RelationshipRecord( next.relationship() );
                relationship.setLinks( 1, 2, C );
                tx.create( relationship );
            }
        } );

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.RELATIONSHIP, 2 )
                   .verify( RecordType.COUNTS, 4 )
                   .andThatsAllFolks();
    }

    @Test
    void shouldReportRelationshipOtherNodeInconsistencies() throws Exception
    {
        // given
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                    GraphStoreFixture.IdGenerator next )
            {
                long node1 = next.node();
                long node2 = next.node();
                long rel = next.relationship();

                RelationshipRecord relationship = new  RelationshipRecord( rel );
                relationship.setLinks( node1, node2, 0 );
                tx.create( inUse( relationship ) );
                tx.create( inUse( new NodeRecord( node1 ).initialize( false, -1, false, rel + 1, 0 ) ) );
                tx.create( inUse( new NodeRecord( node2 ).initialize( false, -1, false, rel + 2, 0 ) ) );
            }
        } );

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.RELATIONSHIP, 2 )
                   .verify( RecordType.NODE, 2 )
                   .verify( RecordType.COUNTS, 2 )
                   .andThatsAllFolks();
    }

    @Test
    void shouldReportPropertyInconsistencies() throws Exception
    {
        // given
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                                            GraphStoreFixture.IdGenerator next )
            {
                NodeRecord node = new NodeRecord( next.node() );
                PropertyRecord property = new PropertyRecord( next.property() );
                node.setNextProp( property.getId() );

                // Mess up the prev/next pointers a bit
                property.setNextProp( 1_000 );

                PropertyBlock block = new PropertyBlock();
                block.setSingleBlock( next.propertyKey() | (((long) PropertyType.INT.intValue()) << 24) | (666L << 28) );
                property.addPropertyBlock( block );
                tx.create( node );
                tx.create( property );
            }
        } );

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.PROPERTY, 2 )
                   .verify( RecordType.NODE, 1 )
                   .andThatsAllFolks();
    }

    @Test
    void shouldReportStringPropertyInconsistencies() throws Exception
    {
        // given
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                                            GraphStoreFixture.IdGenerator next )
            {
                // A dynamic string property with a broken chain, first dynamic record pointing to an unused second dynamic record
                DynamicRecord string = new DynamicRecord( next.stringProperty() );
                string.setInUse( true );
                string.setCreated();
                string.setType( PropertyType.STRING.intValue() );
                string.setNextBlock( next.stringProperty() );
                string.setData( UTF8.encode( "hello world" ) );

                // A property block referencing this dynamic string property
                PropertyBlock block = new PropertyBlock();
                block.setSingleBlock( (((long) PropertyType.STRING.intValue()) << 24) | (string.getId() << 28) );
                block.addValueRecord( string );
                // Set the property key explicitly to one created in the setup (property key 0 can be an internal token)
                block.setKeyIndexId( key1 );

                // A property record with this block in it
                PropertyRecord property = new PropertyRecord( next.property() );
                property.addPropertyBlock( block );

                // A node referencing this property record
                NodeRecord node = new NodeRecord( next.node() );
                node.initialize( true, property.getId(), false, NO_NEXT_RELATIONSHIP.longValue(), NO_LABELS_FIELD.longValue() );
                property.setNodeId( node.getId() );

                tx.create( property );
                tx.create( node );
            }
        } );

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.STRING_PROPERTY, 1 )
                   .andThatsAllFolks();
    }

    @Test
    void shouldReportBrokenSchemaRecordChain() throws Exception
    {
        // given
        AtomicReference<IndexDescriptor> descriptor = new AtomicReference<>();
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                                            GraphStoreFixture.IdGenerator next )
            {
                SchemaRecord before = new SchemaRecord( next.schema() );
                SchemaRecord after = cloneRecord( before );
                after.initialize( true, next.property() ); // Point to a record that isn't in use.

                IndexDescriptor rule = indexRule( after.getId(), label1, key1, DESCRIPTOR );
                rule = tx.completeConfiguration( rule );
                tx.createSchema( before, after, rule );
                descriptor.set( rule );
            }
        } );
        fixture.indexingService().activateIndex( descriptor.get() );

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.SCHEMA, 1 ).andThatsAllFolks();
    }

    @Test
    void shouldReportDuplicateConstraintReferences() throws Exception
    {
        // given
        AtomicReference<IndexDescriptor> descriptor1 = new AtomicReference<>();
        AtomicReference<IndexDescriptor> descriptor2 = new AtomicReference<>();
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                                            GraphStoreFixture.IdGenerator next ) throws KernelException
            {
                int ruleId1 = (int) next.schema();
                int ruleId2 = (int) next.schema();
                int labelId = next.label();
                int propertyKeyId = next.propertyKey();

                SchemaRecord before1 = new SchemaRecord( ruleId1 );
                SchemaRecord before2 = new SchemaRecord( ruleId2 );
                SchemaRecord after1 = cloneRecord( before1 ).initialize( true, 0 );
                SchemaRecord after2 = cloneRecord( before2 ).initialize( true, 0 );

                IndexDescriptor rule1 = constraintIndexRule( ruleId1, labelId, propertyKeyId, DESCRIPTOR, ruleId1, IndexType.BTREE );
                rule1 = tx.completeConfiguration( rule1 );
                IndexDescriptor rule2 = constraintIndexRule( ruleId2, labelId, propertyKeyId, DESCRIPTOR, ruleId1, IndexType.BTREE );
                rule2 = tx.completeConfiguration( rule2 );

                serializeRule( rule1, after1, tx, next );
                serializeRule( rule2, after2, tx, next );

                tx.nodeLabel( labelId, "label", false );
                tx.propertyKey( propertyKeyId, "property", false );

                tx.createSchema( before1, after1, rule1 );
                tx.createSchema( before2, after2, rule2 );

                descriptor1.set( rule1 );
                descriptor2.set( rule2 );
            }
        } );
        fixture.indexingService().activateIndex( descriptor1.get() );
        fixture.indexingService().activateIndex( descriptor2.get() );

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.SCHEMA, 4 ).andThatsAllFolks();
        String logContents = logStream.toString();
        assertThat( logContents ).contains( descriptor1.get().userDescription( fixture.directStoreAccess().tokenHolders() ) );
        assertThat( logContents ).contains( descriptor2.get().userDescription( fixture.directStoreAccess().tokenHolders() ) );
    }

    @Test
    void shouldReportInvalidConstraintBackReferences() throws Exception
    {
        // given
        AtomicReference<IndexDescriptor> descriptor = new AtomicReference<>();
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                                            GraphStoreFixture.IdGenerator next ) throws KernelException
            {
                int ruleId1 = (int) next.schema();
                int ruleId2 = (int) next.schema();
                int labelId = next.label();
                int propertyKeyId = next.propertyKey();

                SchemaRecord before1 = new SchemaRecord( ruleId1 );
                SchemaRecord before2 = new SchemaRecord( ruleId2 );
                SchemaRecord after1 = cloneRecord( before1 ).initialize( true, 0 );
                SchemaRecord after2 = cloneRecord( before2 ).initialize( true, 0 );

                IndexDescriptor rule1 = constraintIndexRule( ruleId1, labelId, propertyKeyId, DESCRIPTOR, ruleId2, IndexType.BTREE );
                rule1 = tx.completeConfiguration( rule1 );
                ConstraintDescriptor rule2 = uniquenessConstraintRule( ruleId2, labelId, propertyKeyId, ruleId2, IndexType.BTREE );

                serializeRule( rule1, after1, tx, next );
                serializeRule( rule2, after2, tx, next );

                tx.nodeLabel( labelId, "label", false );
                tx.propertyKey( propertyKeyId, "property", false );

                tx.createSchema( before1, after1, rule1 );
                tx.createSchema( before2, after2, rule2 );

                descriptor.set( rule1 );
            }
        } );
        fixture.indexingService().activateIndex( descriptor.get() );

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.SCHEMA, 2 ).andThatsAllFolks();
    }

    @Test
    void shouldReportConstraintReferencingIndexOfWrongType() throws Exception
    {
        // given
        AtomicReference<IndexDescriptor> descriptor = new AtomicReference<>();
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                    GraphStoreFixture.IdGenerator next ) throws KernelException
            {
                int ruleId1 = (int) next.schema();
                int ruleId2 = (int) next.schema();
                int labelId = next.label();
                int propertyKeyId = next.propertyKey();

                SchemaRecord before1 = new SchemaRecord( ruleId1 );
                SchemaRecord before2 = new SchemaRecord( ruleId2 );
                SchemaRecord after1 = cloneRecord( before1 ).initialize( true, 0 );
                SchemaRecord after2 = cloneRecord( before2 ).initialize( true, 0 );

                IndexDescriptor rule1 = constraintIndexRule( ruleId1, labelId, propertyKeyId, DESCRIPTOR, ruleId2, IndexType.RANGE );
                rule1 = tx.completeConfiguration( rule1 );
                ConstraintDescriptor rule2 = uniquenessConstraintRule( ruleId2, labelId, propertyKeyId, ruleId1, IndexType.BTREE );

                serializeRule( rule1, after1, tx, next );
                serializeRule( rule2, after2, tx, next );

                tx.nodeLabel( labelId, "label", false );
                tx.propertyKey( propertyKeyId, "property", false );

                tx.createSchema( before1, after1, rule1 );
                tx.createSchema( before2, after2, rule2 );

                descriptor.set( rule1 );
            }
        } );
        fixture.indexingService().activateIndex( descriptor.get() );

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.SCHEMA, 1 ).andThatsAllFolks();
    }

    @Test
    void shouldReportArrayPropertyInconsistencies() throws Exception
    {
        // given
        int recordDataSize = GraphDatabaseSettings.DEFAULT_BLOCK_SIZE - 12;
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                                            GraphStoreFixture.IdGenerator next )
            {
                // A dynamic array property with a broken chain, first dynamic record pointing to an unused second dynamic record
                List<DynamicRecord> allocatedRecords = new ArrayList<>();
                long[] arrayValue = new long[70];
                for ( int i = 0; i < arrayValue.length; i++ )
                {
                    arrayValue[i] = i * 10_000;
                }
                DynamicArrayStore.allocateRecords( allocatedRecords, arrayValue, new DynamicRecordAllocator()
                {
                    @Override
                    public int getRecordDataSize()
                    {
                        return recordDataSize;
                    }

                    @Override
                    public DynamicRecord nextRecord( CursorContext cursorContext )
                    {
                        return StandardDynamicRecordAllocator.allocateRecord( next.arrayProperty() );
                    }
                }, true, NULL, INSTANCE );
                assertThat( allocatedRecords.size() ).isGreaterThan( 1 );
                DynamicRecord array = allocatedRecords.get( 0 );
                array.setType( ARRAY.intValue() );

                // A property block referencing this dynamic array property
                PropertyBlock block = new PropertyBlock();
                block.setSingleBlock( (((long) ARRAY.intValue()) << 24) | (array.getId() << 28) );
                block.addValueRecord( array );
                // Set the property key explicitly to one created in the setup (property key 0 can be an internal token)
                block.setKeyIndexId( key1 );

                // A property record with this block in it
                PropertyRecord property = new PropertyRecord( next.property() );
                property.addPropertyBlock( block );

                // A node referencing this property record
                NodeRecord node = new NodeRecord( next.node() );
                node.initialize( true, property.getId(), false, NO_NEXT_RELATIONSHIP.longValue(), NO_LABELS_FIELD.longValue() );
                property.setNodeId( node.getId() );

                tx.create( property );
                tx.create( node );
            }
        } );

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.ARRAY_PROPERTY, 1 )
                   .andThatsAllFolks();
    }

    @Test
    void shouldReportRelationshipLabelNameInconsistencies() throws Exception
    {
        // given
        final Reference<Integer> inconsistentName = new Reference<>();
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                                            GraphStoreFixture.IdGenerator next )
            {
                inconsistentName.set( next.relationshipType() );
                tx.relationshipType( inconsistentName.get(), "FOO", false );
            }
        } );
        NeoStores neoStores = fixture.directStoreAccess().nativeStores();
        StoreCursors storeCursors = fixture.getStoreCursors();
        DynamicStringStore nameStore = neoStores.getRelationshipTypeTokenStore().getNameStore();
        DynamicRecord record = nameStore.newRecord();
        nameStore.getRecordByCursor( inconsistentName.get(), record, FORCE, storeCursors.readCursor( DYNAMIC_REL_TYPE_TOKEN_CURSOR ) );
        record.setNextBlock( record.getId() );
        try ( var storeCursor = storeCursors.writeCursor( DYNAMIC_REL_TYPE_TOKEN_CURSOR ) )
        {
            nameStore.updateRecord( record, storeCursor, NULL, storeCursors );
        }

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.RELATIONSHIP_TYPE_NAME, 1 )
                   .andThatsAllFolks();
    }

    @Test
    void shouldReportPropertyKeyNameInconsistencies() throws Exception
    {
        // given
        final Reference<int[]> propertyKeyNameIds = new Reference<>();
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                                            GraphStoreFixture.IdGenerator next )
            {
                int[] dynamicIds = tx.propertyKey( next.propertyKey(), "FOO", false );
                propertyKeyNameIds.set( dynamicIds );
            }
        } );
        NeoStores neoStores = fixture.directStoreAccess().nativeStores();
        StoreCursors storeCursors = fixture.getStoreCursors();
        DynamicStringStore nameStore = neoStores.getPropertyKeyTokenStore().getNameStore();
        DynamicRecord record = nameStore.newRecord();
        nameStore.getRecordByCursor( propertyKeyNameIds.get()[0], record, FORCE, storeCursors.readCursor( DYNAMIC_PROPERTY_KEY_TOKEN_CURSOR ) );
        record.setNextBlock( record.getId() );
        try ( var storeCursor = storeCursors.writeCursor( DYNAMIC_PROPERTY_KEY_TOKEN_CURSOR ) )
        {
            nameStore.updateRecord( record, storeCursor, NULL, storeCursors );
        }

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.PROPERTY_KEY_NAME, 1 )
                   .andThatsAllFolks();
    }

    @Test
    void shouldReportRelationshipTypeInconsistencies() throws Exception
    {
        // given
        NeoStores neoStores = fixture.directStoreAccess().nativeStores();
        StoreCursors storeCursors = fixture.getStoreCursors();
        RecordStore<RelationshipTypeTokenRecord> relTypeStore = neoStores.getRelationshipTypeTokenStore();
        RelationshipTypeTokenRecord record = relTypeStore.newRecord();
        relTypeStore.getRecordByCursor( (int) relTypeStore.nextId( NULL ), record, FORCE, storeCursors.readCursor( REL_TYPE_TOKEN_CURSOR ) );
        record.setNameId( 20 );
        record.setInUse( true );
        try ( var storeCursor = storeCursors.writeCursor( REL_TYPE_TOKEN_CURSOR ) )
        {
            relTypeStore.updateRecord( record, storeCursor, NULL, StoreCursors.NULL );
        }

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        neoStores.close();
        on( stats ).verify( RecordType.RELATIONSHIP_TYPE, 1 )
                   .andThatsAllFolks();
    }

    @Test
    void shouldReportLabelInconsistencies() throws Exception
    {
        // given
        NeoStores neoStores = fixture.directStoreAccess().nativeStores();
        StoreCursors storeCursors = fixture.getStoreCursors();
        LabelTokenStore labelTokenStore = neoStores.getLabelTokenStore();
        LabelTokenRecord record = labelTokenStore.newRecord();
        labelTokenStore.getRecordByCursor( 1, record, FORCE, storeCursors.readCursor( LABEL_TOKEN_CURSOR ) );
        record.setNameId( 20 );
        record.setInUse( true );
        try ( var storeCursor = storeCursors.writeCursor( LABEL_TOKEN_CURSOR ) )
        {
            labelTokenStore.updateRecord( record, storeCursor, NULL, storeCursors );
        }

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.LABEL, 1 )
                   .andThatsAllFolks();
    }

    @Test
    void shouldReportPropertyKeyInconsistencies() throws Exception
    {
        // given
        final Reference<int[]> propertyKeyNameIds = new Reference<>();
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                                            GraphStoreFixture.IdGenerator next )
            {
                int[] nameIds = tx.propertyKey( next.propertyKey(), "FOO", false );
                propertyKeyNameIds.set( nameIds );
            }
        } );
        NeoStores neoStores = fixture.directStoreAccess().nativeStores();
        StoreCursors storeCursors = fixture.getStoreCursors();
        DynamicStringStore nameStore = neoStores.getPropertyKeyTokenStore().getNameStore();
        DynamicRecord record = nameStore.newRecord();
        nameStore.getRecordByCursor( propertyKeyNameIds.get()[0], record, FORCE, storeCursors.readCursor( DYNAMIC_PROPERTY_KEY_TOKEN_CURSOR ) );
        record.setInUse( false );
        try ( var storeCursor = storeCursors.writeCursor( DYNAMIC_PROPERTY_KEY_TOKEN_CURSOR ) )
        {
            nameStore.updateRecord( record, storeCursor, NULL, storeCursors );
        }

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.PROPERTY_KEY, 1 )
                   .andThatsAllFolks();
    }

    @Test
    void shouldReportRelationshipGroupTypeInconsistencies() throws Exception
    {
        // given
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                                            GraphStoreFixture.IdGenerator next )
            {
                long node = next.node();
                long group = next.relationshipGroup();
                int nonExistentType = next.relationshipType() + 1;
                tx.create( inUse( new NodeRecord( node ).initialize( false, NO_NEXT_PROPERTY.intValue(), true, group, 0 ) ) );
                tx.create( withOwner( inUse( relationshipGroupRecord( group, nonExistentType ) ), node ) );
            }
        } );

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.RELATIONSHIP_GROUP, 1 )
                   .andThatsAllFolks();
    }

    @Test
    void shouldReportRelationshipGroupChainInconsistencies() throws Exception
    {
        // given
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                    GraphStoreFixture.IdGenerator next )
            {
                long node = next.node();
                long group = next.relationshipGroup();
                tx.create( inUse( new NodeRecord( node ).initialize( false, NO_NEXT_PROPERTY.intValue(), true, group, 0 ) ) );
                tx.create( withOwner( withNext( inUse( relationshipGroupRecord( group, C ) ),
                        group + 1 /*non-existent group id*/ ), node ) );
            }
        } );

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.RELATIONSHIP_GROUP, 1 )
                   .andThatsAllFolks();
    }

    @Test
    void shouldReportRelationshipGroupUnsortedChainInconsistencies() throws Exception
    {
        // given
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                    GraphStoreFixture.IdGenerator next )
            {
                long node = next.node();
                long firstGroupId = next.relationshipGroup();
                long otherGroupId = next.relationshipGroup();
                tx.create( inUse( new NodeRecord( node ).initialize( false, NO_NEXT_PROPERTY.intValue(), true, firstGroupId, 0 ) ) );
                tx.create( withOwner( withNext( inUse( relationshipGroupRecord( firstGroupId, T ) ),
                        otherGroupId ), node ) );
                tx.create( withOwner( inUse( relationshipGroupRecord( otherGroupId, C ) ), node ) );
            }
        } );

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.RELATIONSHIP_GROUP, 1 )
                   .andThatsAllFolks();
    }

    @Test
    void shouldReportRelationshipGroupRelationshipNotInUseInconsistencies() throws Exception
    {
        // given
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                    GraphStoreFixture.IdGenerator next )
            {
                long node = next.node();
                long groupId = next.relationshipGroup();
                long rel = next.relationship();
                tx.create( inUse( new NodeRecord( node ).initialize( false, NO_NEXT_PROPERTY.intValue(), true, groupId, 0 ) ) );
                tx.create( withOwner( withRelationships( inUse( relationshipGroupRecord( groupId, C ) ),
                        rel, rel, rel ), node ) );
            }
        } );

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.RELATIONSHIP_GROUP, 3 )
                   .andThatsAllFolks();
    }

    @Test
    void shouldReportRelationshipGroupRelationshipNotFirstInconsistencies() throws Exception
    {
        // given
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                    GraphStoreFixture.IdGenerator next )
            {
                /*
                 *   node ----------------> group
                 *                             |
                 *                             v
                 *   otherNode <--> relA <--> relB
                 */
                long node = next.node();
                long otherNode = next.node();
                long group = next.relationshipGroup();
                long relA = next.relationship();
                long relB = next.relationship();
                tx.create( inUse( new NodeRecord( node ).initialize( false, NO_NEXT_PROPERTY.intValue(), true, group, 0 ) ) );
                tx.create( inUse( new NodeRecord( otherNode ).initialize( false, NO_NEXT_PROPERTY.intValue(), false, relA, 0 ) ) );

                RelationshipRecord relationshipA = new RelationshipRecord( relA );
                relationshipA.setLinks( otherNode, node, C );
                tx.create( withNext( inUse( relationshipA ), relB ) );
                RelationshipRecord relationshipB = new RelationshipRecord( relB );
                relationshipB.setLinks( node , otherNode, C);
                tx.create( withPrev( inUse( relationshipB ), relA ) );
                tx.create( withOwner( withRelationships( inUse( relationshipGroupRecord( group, C ) ), relB, relB, relB ), node ) );
                tx.incrementRelationshipCount( ANY_LABEL, ANY_RELATIONSHIP_TYPE, ANY_LABEL, 2 );
                tx.incrementRelationshipCount( ANY_LABEL, C, ANY_LABEL, 2 );
            }
        } );

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.RELATIONSHIP_GROUP, 3 )
                   .andThatsAllFolks();
    }

    @Test
    void shouldReportFirstRelationshipGroupOwnerInconsistency() throws Exception
    {
        // given
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                    GraphStoreFixture.IdGenerator next )
            {
                // node -[first]-> group -[owner]-> otherNode
                long node = next.node();
                long otherNode = next.node();
                long group = next.relationshipGroup();
                tx.create( new NodeRecord( node ).initialize( true, NO_NEXT_PROPERTY.intValue(), true, group, 0 ) );
                tx.create( new NodeRecord( otherNode ).initialize( true, NO_NEXT_PROPERTY.intValue(), false, NO_NEXT_RELATIONSHIP.intValue(), 0 ) );
                tx.create( new RelationshipGroupRecord( group ).initialize( true, C, -1, -1, -1, otherNode, -1 ) );
            }
        } );

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        // - next group has other owner that its previous
        // - first group has other owner
        on( stats ).verify( RecordType.NODE, 1 )
                   .andThatsAllFolks();
    }

    @Test
    void shouldReportChainedRelationshipGroupOwnerInconsistency() throws Exception
    {
        // given
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                    GraphStoreFixture.IdGenerator next )
            {
                /* node -[first]-> groupA -[next]-> groupB
                 *    ^               /                |
                 *     \--[owner]----               [owner]
                 *                                     v
                 *                                  otherNode
                 */
                long node = next.node();
                long otherNode = next.node();
                long groupA = next.relationshipGroup();
                long groupB = next.relationshipGroup();
                tx.create( inUse( new NodeRecord( node ).initialize( false, NO_NEXT_PROPERTY.intValue(), true, groupA, 0 ) ) );
                tx.create( inUse( new NodeRecord( otherNode ).initialize( false, NO_NEXT_PROPERTY.intValue(), false, NO_NEXT_RELATIONSHIP.intValue(), 0 ) ) );
                tx.create( withNext( withOwner( inUse( relationshipGroupRecord( groupA, C ) ),
                        node ), groupB ) );
                tx.create( withOwner( inUse( relationshipGroupRecord( groupB, T ) ), otherNode ) );
            }
        } );

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.RELATIONSHIP_GROUP, 1 )
                   .andThatsAllFolks();
    }

    @Test
    void shouldReportRelationshipGroupOwnerNotInUse() throws Exception
    {
        // given
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                    GraphStoreFixture.IdGenerator next )
            {
                // group -[owner]-> <not-in-use node>
                long node = next.node();
                long group = next.relationshipGroup();
                tx.create( withOwner( inUse( relationshipGroupRecord( group, C ) ), node ) );
            }
        } );

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.RELATIONSHIP_GROUP, 1 )
                   .andThatsAllFolks();
    }

    @Test
    void shouldReportRelationshipGroupOwnerInvalidValue() throws Exception
    {
        // given
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                    GraphStoreFixture.IdGenerator next )
            {
                // node -[first]-> group -[owner]-> -1
                long group = next.relationshipGroup();
                tx.create( withOwner( inUse( relationshipGroupRecord( group, C ) ), -1 ) );
            }
        } );

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.RELATIONSHIP_GROUP, 1 )
                   .andThatsAllFolks();
    }

    private static RelationshipRecord withNext( RelationshipRecord relationship, long next )
    {
        relationship.setFirstNextRel( next );
        relationship.setSecondNextRel( next );
        return relationship;
    }

    private static RelationshipRecord withPrev( RelationshipRecord relationship, long prev )
    {
        relationship.setFirstInFirstChain( false );
        relationship.setFirstInSecondChain( false );
        relationship.setFirstPrevRel( prev );
        relationship.setSecondPrevRel( prev );
        return relationship;
    }

    @Test
    void shouldReportRelationshipGroupRelationshipOfOtherTypeInconsistencies() throws Exception
    {
        // given
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                    GraphStoreFixture.IdGenerator next )
            {
                /*
                 *   node -----> groupA
                 *                   |
                 *                   v
                 *   otherNode <--> relB
                 */
                long node = next.node();
                long otherNode = next.node();
                long group = next.relationshipGroup();
                long rel = next.relationship();
                tx.create( new NodeRecord( node ).initialize( false, NO_NEXT_PROPERTY.intValue(), true, group, 0 ) );
                tx.create( new NodeRecord( otherNode ).initialize( false, NO_NEXT_PROPERTY.intValue(), false, rel, 0 ) );
                RelationshipRecord relationship = new RelationshipRecord( rel );
                relationship.setLinks( node, otherNode, T );
                tx.create( relationship );
                tx.create( withOwner( withRelationships( relationshipGroupRecord( group, C ),
                        rel, rel, rel ), node ) );
                tx.incrementRelationshipCount( ANY_LABEL, ANY_RELATIONSHIP_TYPE, ANY_LABEL, 1 );
                tx.incrementRelationshipCount( ANY_LABEL, T, ANY_LABEL, 1 );
            }
        } );

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.RELATIONSHIP_GROUP, 3 )
                   .andThatsAllFolks();
    }

    @Test
    void shouldNotReportRelationshipGroupInconsistenciesForConsistentRecords() throws Exception
    {
        // given
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                    GraphStoreFixture.IdGenerator next )
            {
                /* Create a little mini consistent structure:
                 *
                 *    nodeA --> groupA -[next]-> groupB
                 *      ^          |
                 *       \       [out]
                 *        \        v
                 *       [start]- rel -[end]-> nodeB
                 */

                long nodeA = next.node();
                long nodeB = next.node();
                long rel = next.relationship();
                long groupA = next.relationshipGroup();
                long groupB = next.relationshipGroup();

                tx.create( new NodeRecord( nodeA ).initialize( false, NO_NEXT_PROPERTY.intValue(), true, groupA, 0 ) );
                tx.create( new NodeRecord( nodeB ).initialize( false, NO_NEXT_PROPERTY.intValue(), false, rel, 0 ) );
                RelationshipRecord relationship = new RelationshipRecord( rel );
                relationship.setLinks( nodeA, nodeB, C );
                tx.create( firstInChains( relationship, 1 ) );
                tx.incrementRelationshipCount( ANY_LABEL, ANY_RELATIONSHIP_TYPE, ANY_LABEL, 1 );
                tx.incrementRelationshipCount( ANY_LABEL, C, ANY_LABEL, 1 );

                tx.create( withOwner( withRelationship( withNext( relationshipGroupRecord( groupA, C ), groupB ),
                        Direction.OUTGOING, rel ), nodeA ) );
                tx.create( withOwner( relationshipGroupRecord( groupB, T ), nodeA ) );
            }
        } );

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        assertTrue( stats.isConsistent(), "should be consistent" );
    }

    @Test
    void shouldReportWrongNodeCountsEntries() throws Exception
    {
        // given
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                                            GraphStoreFixture.IdGenerator next )
            {
                tx.incrementNodeCount( label3, 1 );
            }
        } );

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.COUNTS, 1 )
                   .andThatsAllFolks();
    }

    @Test
    void shouldReportWrongRelationshipCountsEntries() throws Exception
    {
        // given
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                                            GraphStoreFixture.IdGenerator next )
            {
                tx.incrementRelationshipCount( label1 , C, ANY_LABEL, 1 );
            }
        } );

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.COUNTS, 1 )
                   .andThatsAllFolks();
    }

    @Test
    void shouldReportIfSomeKeysAreMissing() throws Exception
    {
        // given
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                                            GraphStoreFixture.IdGenerator next )
            {
                tx.incrementNodeCount( label3, -1 );
            }
        } );

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.COUNTS, 1 )
                   .andThatsAllFolks();
    }

    @Test
    void shouldReportIfThereAreExtraKeys() throws Exception
    {
        // given
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                                            GraphStoreFixture.IdGenerator next )
            {
                tx.incrementNodeCount( 1024 /* new label */, 1 );
            }
        } );

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.COUNTS, 1 )
                   .andThatsAllFolks();
    }

    @ParameterizedTest
    @EnumSource( EntityType.class )
    void shouldReportDuplicatedIndexRules( EntityType entityType ) throws Exception
    {
        // Given
        int entityTokenId = createEntityToken( entityType );
        int propertyKeyId = createPropertyKey();
        createIndexRule( entityType, entityTokenId, propertyKeyId );
        createIndexRule( entityType, entityTokenId, propertyKeyId );

        // When
        ConsistencySummaryStatistics stats = check();

        // Then
        on( stats ).verify( RecordType.SCHEMA, 1 ).andThatsAllFolks();
    }

    @ParameterizedTest
    @EnumSource( EntityType.class )
    void shouldNotReportDuplicatedIndexRulesForDifferentIndexTypes( EntityType entityType ) throws Exception
    {
        // Given
        int entityTokenId = createEntityToken( entityType );
        int propertyKeyId = createPropertyKey();
        createIndexRule( entityType, IndexType.BTREE, entityTokenId, propertyKeyId );
        createIndexRule( entityType, IndexType.RANGE, entityTokenId, propertyKeyId );
        createIndexRule( entityType, IndexType.TEXT, entityTokenId, propertyKeyId );
        createIndexRule( entityType, IndexType.POINT, entityTokenId, propertyKeyId );

        // When
        ConsistencySummaryStatistics stats = check();

        // Then
        assertTrue( stats.isConsistent() );
    }

    @ParameterizedTest
    @EnumSource( EntityType.class )
    void shouldReportDuplicatedCompositeIndexRules( EntityType entityType ) throws Exception
    {
        // Given
        int entityTokenId = createEntityToken( entityType );
        int propertyKeyId1 = createPropertyKey( "p1" );
        int propertyKeyId2 = createPropertyKey( "p2" );
        int propertyKeyId3 = createPropertyKey( "p3" );
        createIndexRule( entityType, entityTokenId, propertyKeyId1, propertyKeyId2, propertyKeyId3 );
        createIndexRule( entityType, entityTokenId, propertyKeyId1, propertyKeyId2, propertyKeyId3 );

        // When
        ConsistencySummaryStatistics stats = check();

        // Then
        on( stats ).verify( RecordType.SCHEMA, 1 ).andThatsAllFolks();
    }

    @Test
    void shouldReportDuplicatedUniquenessConstraintRules() throws Exception
    {
        // Given
        int labelId = createLabel();
        int propertyKeyId = createPropertyKey();
        createUniquenessConstraintRule( labelId, propertyKeyId );
        createUniquenessConstraintRule( labelId, propertyKeyId );

        // When
        ConsistencySummaryStatistics stats = check();

        // Then
        on( stats ).verify( RecordType.SCHEMA, 2 ) // pair of duplicated indexes & pair of duplicated constraints
                .andThatsAllFolks();
    }

    @Test
    void shouldNotReportDuplicatedUniquenessConstraintRulesIfDifferentIndexTypes() throws Exception
    {
        // Given
        int labelId = createLabel();
        int propertyKeyId = createPropertyKey();
        createUniquenessConstraintRule( IndexType.BTREE, labelId, propertyKeyId );
        createUniquenessConstraintRule( IndexType.RANGE, labelId, propertyKeyId );

        // When
        ConsistencySummaryStatistics stats = check();

        // Then
        assertTrue( stats.isConsistent() );
    }

    @Test
    void shouldReportDuplicatedCompositeUniquenessConstraintRules() throws Exception
    {
        // Given
        int labelId = createLabel();
        int propertyKeyId1 = createPropertyKey( "p1" );
        int propertyKeyId2 = createPropertyKey( "p2" );
        createUniquenessConstraintRule( labelId, propertyKeyId1, propertyKeyId2 );
        createUniquenessConstraintRule( labelId, propertyKeyId1, propertyKeyId2 );

        // When
        ConsistencySummaryStatistics stats = check();

        // Then
        on( stats ).verify( RecordType.SCHEMA, 2 ) // pair of duplicated indexes & pair of duplicated constraints
                .andThatsAllFolks();
    }

    @Test
    void shouldReportDuplicatedNodeKeyConstraintRules() throws Exception
    {
        // Given
        int labelId = createLabel();
        int propertyKeyId1 = createPropertyKey( "p1" );
        int propertyKeyId2 = createPropertyKey( "p2" );
        createNodeKeyConstraintRule( labelId, propertyKeyId1, propertyKeyId2 );
        createNodeKeyConstraintRule( labelId, propertyKeyId1, propertyKeyId2 );

        // When
        ConsistencySummaryStatistics stats = check();

        // Then
        on( stats ).verify( RecordType.SCHEMA, 2 ) // pair of duplicated indexes & pair of duplicated constraints
                .andThatsAllFolks();
    }

    @Test
    void shouldNotReportDuplicatedNodeKeyConstraintRulesIfDifferentIndexTypes() throws Exception
    {
        // Given
        int labelId = createLabel();
        int propertyKeyId1 = createPropertyKey( "p1" );
        int propertyKeyId2 = createPropertyKey( "p2" );
        createNodeKeyConstraintRule( IndexType.RANGE, labelId, propertyKeyId1, propertyKeyId2 );
        createNodeKeyConstraintRule( IndexType.BTREE, labelId, propertyKeyId1, propertyKeyId2 );

        // When
        ConsistencySummaryStatistics stats = check();

        // Then
        assertTrue( stats.isConsistent() );
    }

    @Test
    void shouldReportNodeKeyAndUniquenessConstraintOnSameLabelAndProperty() throws Exception
    {
        // Given
        int labelId = createLabel();
        int propertyKeyId = createPropertyKey();

        createNodeKeyConstraintRule( labelId, propertyKeyId );
        createUniquenessConstraintRule( labelId, propertyKeyId );

        // When
        ConsistencySummaryStatistics stats = check();

        // Then
        on( stats ).verify( RecordType.SCHEMA, 2 ) // pair of duplicated indexes & pair of duplicated constraints
                .andThatsAllFolks();
    }

    @Test
    void shouldNotReportNodeKeyAndUniquenessConstraintOnSameLabelAndPropertyIfDifferentIndexTypes() throws Exception
    {
        // Given
        int labelId = createLabel();
        int propertyKeyId = createPropertyKey();

        createNodeKeyConstraintRule( IndexType.BTREE, labelId, propertyKeyId );
        createUniquenessConstraintRule( IndexType.RANGE, labelId, propertyKeyId );

        // When
        ConsistencySummaryStatistics stats = check();

        // Then
        assertTrue( stats.isConsistent() );
    }

    @Test
    void shouldReportDuplicatedNodePropertyExistenceConstraintRules() throws Exception
    {
        // Given
        int labelId = createLabel();
        int propertyKeyId = createPropertyKey();
        createNodePropertyExistenceConstraint( labelId, propertyKeyId );
        createNodePropertyExistenceConstraint( labelId, propertyKeyId );

        // When
        ConsistencySummaryStatistics stats = check();

        // Then
        on( stats ).verify( RecordType.SCHEMA, 1 ).andThatsAllFolks();
    }

    @Test
    void shouldReportDuplicatedRelationshipPropertyExistenceConstraintRules() throws Exception
    {
        // Given
        int relTypeId = createRelType();
        int propertyKeyId = createPropertyKey();
        createRelationshipPropertyExistenceConstraint( relTypeId, propertyKeyId );
        createRelationshipPropertyExistenceConstraint( relTypeId, propertyKeyId );

        // When
        ConsistencySummaryStatistics stats = check();

        // Then
        on( stats ).verify( RecordType.SCHEMA, 1 ).andThatsAllFolks();
    }

    @Test
    void shouldReportInvalidLabelIdInIndexRule() throws Exception
    {
        // Given
        int labelId = fixture.idGenerator().label();
        int propertyKeyId = createPropertyKey();
        createIndexRule( EntityType.NODE, labelId, propertyKeyId );

        // When
        ConsistencySummaryStatistics stats = check();

        // Then
        on( stats ).verify( RecordType.SCHEMA, 1 ).andThatsAllFolks();
    }

    @Test
    void shouldReportInvalidRelTypeIdInIndexRule() throws Exception
    {
        // Given
        int relTypeId = fixture.idGenerator().relationshipType();
        int propertyKeyId = createPropertyKey();
        createIndexRule( EntityType.RELATIONSHIP, relTypeId, propertyKeyId );

        // When
        ConsistencySummaryStatistics stats = check();

        // Then
        on( stats ).verify( RecordType.SCHEMA, 1 ).andThatsAllFolks();
    }

    @Test
    void shouldReportInvalidLabelIdInUniquenessConstraintRule() throws Exception
    {
        // Given
        int badLabelId = fixture.idGenerator().label();
        int propertyKeyId = createPropertyKey();
        createUniquenessConstraintRule( badLabelId, propertyKeyId );

        // When
        ConsistencySummaryStatistics stats = check();

        // Then
        on( stats ).verify( RecordType.SCHEMA, 2 ) // invalid label in both index & owning constraint
                .andThatsAllFolks();
    }

    @Test
    void shouldReportInvalidLabelIdInNodeKeyConstraintRule() throws Exception
    {
        // Given
        int badLabelId = fixture.idGenerator().label();
        int propertyKeyId = createPropertyKey();
        createNodeKeyConstraintRule( badLabelId, propertyKeyId );

        // When
        ConsistencySummaryStatistics stats = check();

        // Then
        on( stats ).verify( RecordType.SCHEMA, 2 ) // invalid label in both index & owning constraint
                .andThatsAllFolks();
    }

    @Test
    void shouldReportInvalidLabelIdInNodePropertyExistenceConstraintRule() throws Exception
    {
        // Given
        int badLabelId = fixture.idGenerator().label();
        int propertyKeyId = createPropertyKey();
        createNodePropertyExistenceConstraint( badLabelId, propertyKeyId );

        // When
        ConsistencySummaryStatistics stats = check();

        // Then
        on( stats ).verify( RecordType.SCHEMA, 1 ).andThatsAllFolks();
    }

    @ParameterizedTest
    @EnumSource( EntityType.class )
    void shouldReportInvalidPropertyKeyIdInIndexRule( EntityType entityType ) throws Exception
    {
        // Given
        int entityTokenId = createEntityToken( entityType );
        int badPropertyKeyId = fixture.idGenerator().propertyKey();
        createIndexRule( entityType, entityTokenId, badPropertyKeyId );

        // When
        ConsistencySummaryStatistics stats = check();

        // Then
        on( stats ).verify( RecordType.SCHEMA, 1 ).andThatsAllFolks();
    }

    @ParameterizedTest
    @EnumSource( EntityType.class )
    void shouldReportInvalidSecondPropertyKeyIdInIndexRule( EntityType entityType ) throws Exception
    {
        // Given
        int entityTokenId = createEntityToken( entityType );
        int propertyKeyId = createPropertyKey();
        int badPropertyKeyId = fixture.idGenerator().propertyKey();
        createIndexRule( entityType, entityTokenId, propertyKeyId, badPropertyKeyId );

        // When
        ConsistencySummaryStatistics stats = check();

        // Then
        on( stats ).verify( RecordType.SCHEMA, 1 ).andThatsAllFolks();
    }

    @Test
    void shouldReportInvalidPropertyKeyIdInUniquenessConstraintRule() throws Exception
    {
        // Given
        int labelId = createLabel();
        int badPropertyKeyId = fixture.idGenerator().propertyKey();
        createUniquenessConstraintRule( labelId, badPropertyKeyId );

        // When
        ConsistencySummaryStatistics stats = check();

        // Then
        on( stats ).verify( RecordType.SCHEMA, 2 ) // invalid property key in both index & owning constraint
                .andThatsAllFolks();
    }

    @Test
    void shouldReportInvalidSecondPropertyKeyIdInUniquenessConstraintRule() throws Exception
    {
        // Given
        int labelId = createLabel();
        int propertyKeyId = createPropertyKey();
        int badPropertyKeyId = fixture.idGenerator().propertyKey();
        createUniquenessConstraintRule( labelId, propertyKeyId, badPropertyKeyId );

        // When
        ConsistencySummaryStatistics stats = check();

        // Then
        on( stats ).verify( RecordType.SCHEMA, 2 ) // invalid property key in both index & owning constraint
                .andThatsAllFolks();
    }

    @Test
    void shouldReportInvalidSecondPropertyKeyIdInNodeKeyConstraintRule() throws Exception
    {
        // Given
        int labelId = createLabel();
        int propertyKeyId = createPropertyKey();
        int badPropertyKeyId = fixture.idGenerator().propertyKey();
        createNodeKeyConstraintRule( labelId, propertyKeyId, badPropertyKeyId );

        // When
        ConsistencySummaryStatistics stats = check();

        // Then
        on( stats ).verify( RecordType.SCHEMA, 2 ) // invalid property key in both index & owning constraint
                .andThatsAllFolks();
    }

    @Test
    void shouldReportInvalidPropertyKeyIdInNodePropertyExistenceConstraintRule() throws Exception
    {
        // Given
        int labelId = createLabel();
        int badPropertyKeyId = fixture.idGenerator().propertyKey();
        createNodePropertyExistenceConstraint( labelId, badPropertyKeyId );

        // When
        ConsistencySummaryStatistics stats = check();

        // Then
        on( stats ).verify( RecordType.SCHEMA, 1 ).andThatsAllFolks();
    }

    @Test
    void shouldReportInvalidRelTypeIdInRelationshipPropertyExistenceConstraintRule() throws Exception
    {
        // Given
        int badRelTypeId = fixture.idGenerator().relationshipType();
        int propertyKeyId = createPropertyKey();
        createRelationshipPropertyExistenceConstraint( badRelTypeId, propertyKeyId );

        // When
        ConsistencySummaryStatistics stats = check();

        // Then
        on( stats ).verify( RecordType.SCHEMA, 1 ).andThatsAllFolks();
    }

    @Test
    void shouldReportNothingForUniquenessAndPropertyExistenceConstraintOnSameLabelAndProperty() throws Exception
    {
        // Given
        int labelId = createLabel();
        int propertyKeyId = createPropertyKey();

        createUniquenessConstraintRule( labelId, propertyKeyId );
        createNodePropertyExistenceConstraint( labelId, propertyKeyId );

        // When
        ConsistencySummaryStatistics stats = check();

        // Then
        assertTrue( stats.isConsistent() );
    }

    @Test
    void shouldReportNothingForNodeKeyAndPropertyExistenceConstraintOnSameLabelAndProperty() throws Exception
    {
        // Given
        int labelId = createLabel();
        int propertyKeyId = createPropertyKey();

        createNodeKeyConstraintRule( labelId, propertyKeyId );
        createNodePropertyExistenceConstraint( labelId, propertyKeyId );

        // When
        ConsistencySummaryStatistics stats = check();

        // Then
        assertTrue( stats.isConsistent() );
    }

    @Test
    void shouldManageUnusedRecordsWithWeirdDataIn() throws Exception
    {
        // Given
        final AtomicLong id = new AtomicLong();
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( TransactionDataBuilder tx, IdGenerator next )
            {
                id.set( next.relationship() );
                RelationshipRecord relationship = new RelationshipRecord( id.get() );
                relationship.setFirstNode( -1 );
                relationship.setSecondNode( -1 );
                relationship.setInUse( true );
                tx.create( relationship );
            }
        } );
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( TransactionDataBuilder tx, IdGenerator next )
            {
                RelationshipRecord relationship = new RelationshipRecord( id.get() );
                tx.delete( relationship );
            }
        } );

        // When
        ConsistencySummaryStatistics stats = check();

        // Then
        assertTrue( stats.isConsistent() );
    }

    @Test
    void shouldReportCircularNodePropertyRecordChain() throws Exception
    {
        shouldReportCircularPropertyRecordChain( RecordType.NODE, ( tx, next, propertyRecordId ) -> tx.create(
                new NodeRecord( next.node() ).initialize( true, propertyRecordId, false, -1, Record.NO_LABELS_FIELD.longValue() ) ) );
    }

    @Test
    void shouldReportCircularRelationshipPropertyRecordChain() throws Exception
    {
        int relType = createRelType();
        shouldReportCircularPropertyRecordChain( RecordType.RELATIONSHIP, ( tx, next, propertyRecordId ) ->
        {
            long node = next.node();
            long relationship = next.relationship();
            tx.create( new NodeRecord( node ).initialize( true, -1, false, relationship, Record.NO_LABELS_FIELD.longValue() ) );
            RelationshipRecord relationshipRecord = new RelationshipRecord( relationship );
            relationshipRecord.setFirstNode( node );
            relationshipRecord.setSecondNode( node );
            relationshipRecord.setType( relType );
            relationshipRecord.setNextProp( propertyRecordId );
            tx.create( relationshipRecord );
        } );
    }

    @Test
    void shouldOnlyReportFirstNodeInconsistencyOnFailFast() throws Exception
    {
        // given
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                    GraphStoreFixture.IdGenerator next )
            {
                tx.create( new NodeRecord( next.node() ).initialize( false, -1, false, next.relationship(), 0 ) );
                tx.create( new NodeRecord( next.node() ).initialize( false, -1, false, next.relationship(), 0 ) );
            }
        } );

        settings.put( consistency_checker_fail_fast_threshold, 1 );

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.NODE, 1 )
                .andThatsAllFolks();
    }

    @Test
    void shouldOnlyReportFirstRelationshipInconsistenciesOnFailFast() throws Exception
    {
        // given
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                    GraphStoreFixture.IdGenerator next )
            {
                RelationshipRecord relationshipA = new RelationshipRecord( next.relationship() );
                relationshipA.setLinks(1, 2, C );
                tx.create( relationshipA );
                RelationshipRecord relationshipB = new RelationshipRecord( next.relationship() );
                relationshipB.setLinks(1, 2, C );
                tx.create( relationshipB );
            }
        } );
        settings.put( consistency_checker_fail_fast_threshold, 1 );

        // when
        ConsistencySummaryStatistics stats = check();

        // then number of relationship inconsistencies may be 1 or 2, because in a fail-fast setting not all failures are necessarily reported
        // before the checker is aborted. The driver for this arose when adding memory-limited testing to the new checker.
        int relationshipInconsistencies = stats.getInconsistencyCountForRecordType( RecordType.RELATIONSHIP );
        assertThat( relationshipInconsistencies ).isIn( 1, 2 );
        assertEquals( stats.getTotalInconsistencyCount(), relationshipInconsistencies );
    }

    @Test
    void shouldReportRelationshipGroupRelationshipDoesNotShareOwner() throws Exception
    {
        // given
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                    GraphStoreFixture.IdGenerator next )
            {
                /*
                 *   node -----> groupA
                 *                   |
                 *                   v
                 *   otherNode <--> relB
                 */
                long node = next.node();
                long otherNode = next.node();
                long group = next.relationshipGroup();
                long rel = next.relationship();
                tx.create( new NodeRecord( node ).initialize( false, NO_NEXT_PROPERTY.intValue(), true, group, 0 ) );
                tx.create( new NodeRecord( otherNode ).initialize( false, NO_NEXT_PROPERTY.intValue(), false, rel, 0 ) );
                RelationshipRecord relationship = new RelationshipRecord( rel );
                relationship.setLinks( otherNode, otherNode, C );
                tx.create( relationship );
                tx.create( new RelationshipGroupRecord( group ).initialize( false, C, rel, rel, rel, node, NULL_REFERENCE.longValue() ) );
                tx.incrementRelationshipCount( ANY_LABEL, ANY_RELATIONSHIP_TYPE, ANY_LABEL, 1 );
                tx.incrementRelationshipCount( ANY_LABEL, C, ANY_LABEL, 1 );
            }
        } );

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.RELATIONSHIP_GROUP, 3 )
                .andThatsAllFolks();
    }

    @Test
    void shouldHandleNegativeRelationshipPointers() throws Exception
    {
        // given
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                    GraphStoreFixture.IdGenerator next )
            {
                long node = next.node();
                long otherNode = next.node();
                long rel = next.relationship();
                tx.create( new NodeRecord( node ).initialize( false, NO_NEXT_PROPERTY.intValue(), false, rel, 0 ) );
                tx.create( new NodeRecord( otherNode ).initialize( false, NO_NEXT_PROPERTY.intValue(), false, rel, 0 ) );

                RelationshipRecord relationship = new RelationshipRecord( rel );
                relationship.setLinks( node, otherNode, C );
                relationship.setFirstNextRel( -3 ); //Set some negative pointers
                relationship.setFirstPrevRel( -4 );
                relationship.setSecondNextRel( -5 );
                relationship.setSecondPrevRel( -6 );
                tx.create( relationship );

                tx.incrementRelationshipCount( ANY_LABEL, ANY_RELATIONSHIP_TYPE, ANY_LABEL, 1 );
                tx.incrementRelationshipCount( ANY_LABEL, C, ANY_LABEL, 1 );

            }
        } );

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.RELATIONSHIP, expectedNumberOfErrorsForNegativeRelationshipPointerInconsistency() )
                .andThatsAllFolks();
    }

    protected int expectedNumberOfErrorsForNegativeRelationshipPointerInconsistency()
    {
        return 2;
    }

    @Test
    void shouldHandleNegativeNodeRelationshipPointer() throws Exception
    {
        // given
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                    GraphStoreFixture.IdGenerator next )
            {
                tx.create( new NodeRecord( next.node() ).initialize( false, NO_NEXT_PROPERTY.intValue(), false, -6, 0 ) );
            }
        } );

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.NODE, 1 )
                .andThatsAllFolks();
    }

    @Test
    void shouldHandleNegativeRelationshipNodePointers() throws Exception
    {
        // given
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                    GraphStoreFixture.IdGenerator next )
            {
                RelationshipRecord relationship = new RelationshipRecord( next.relationship() );
                relationship.setLinks( -2, -3, C );
                tx.create( relationship );

                tx.incrementRelationshipCount( ANY_LABEL, ANY_RELATIONSHIP_TYPE, ANY_LABEL, 1 );
                tx.incrementRelationshipCount( ANY_LABEL, C, ANY_LABEL, 1 );
            }
        } );

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        on( stats ).verify( RecordType.RELATIONSHIP, 2 )
                .andThatsAllFolks();
    }

    @Test
    void shouldDetectInvalidUseOfInternalPropertyKeyTokens() throws Exception
    {
        // given
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                    GraphStoreFixture.IdGenerator next )
            {
                int propertyKey = next.propertyKey();
                tx.propertyKey( propertyKey, "FOO", true );
                long nextProp = next.property();
                PropertyRecord property = new PropertyRecord( nextProp ).initialize( true, NO_PREVIOUS_PROPERTY.longValue(), NO_NEXT_PROPERTY.longValue() );
                PropertyBlock block = new PropertyBlock();
                block.setSingleBlock( propertyKey | (((long) PropertyType.INT.intValue()) << 24) | (666L << 28) );
                property.addPropertyBlock( block );
                tx.create( property );
                tx.create( new NodeRecord( next.node() ).initialize( true, nextProp, false, NO_NEXT_RELATIONSHIP.longValue(), NO_LABELS_FIELD.longValue() ) );
            }
        } );

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        assertFalse( stats.isConsistent() );
        on( stats ).verify( RecordType.PROPERTY, 1 )
                .andThatsAllFolks();
    }

    @Test
    void shouldDetectCutOffRelationshipGroupChains() throws Exception
    {
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( TransactionDataBuilder tx, IdGenerator next )
            {
                // node -> group1 -> group2 -X-> group3 -> group4
                //                           ^
                //                           | chain cut off

                long nodeId = next.node();
                long group1Id = next.relationshipGroup();
                long group2Id = next.relationshipGroup();
                long group3Id = next.relationshipGroup();
                long group4Id = next.relationshipGroup();

                int type1 = next.relationshipType();
                int type2 = next.relationshipType();
                int type3 = next.relationshipType();
                int type4 = next.relationshipType();

                NodeRecord node = new NodeRecord( nodeId ).initialize( true, NULL_REFERENCE.longValue(), true, group1Id, NO_LABELS_FIELD.longValue() );
                RelationshipGroupRecord group1 = new RelationshipGroupRecord( group1Id ).initialize(
                        true, type1, NULL_REFERENCE.longValue(), NULL_REFERENCE.longValue(), NULL_REFERENCE.longValue(), nodeId, group2Id );
                RelationshipGroupRecord group2 = new RelationshipGroupRecord( group2Id ).initialize(
                        true, type2, NULL_REFERENCE.longValue(), NULL_REFERENCE.longValue(), NULL_REFERENCE.longValue(), nodeId,
                        // cut-off point
                        NULL_REFERENCE.longValue() );
                RelationshipGroupRecord group3 = new RelationshipGroupRecord( group3Id ).initialize(
                        true, type3, NULL_REFERENCE.longValue(), NULL_REFERENCE.longValue(), NULL_REFERENCE.longValue(), nodeId, group4Id );
                RelationshipGroupRecord group4 = new RelationshipGroupRecord( group3Id ).initialize(
                        true, type4, NULL_REFERENCE.longValue(), NULL_REFERENCE.longValue(), NULL_REFERENCE.longValue(), nodeId,
                        // correct end of chain
                        NULL_REFERENCE.longValue() );

                tx.create( node );
                tx.relationshipType( type1, "T1", false );
                tx.relationshipType( type2, "T2", false );
                tx.relationshipType( type3, "T3", false );
                tx.relationshipType( type4, "T4", false );
                tx.create( group1 );
                tx.create( group2 );
                tx.create( group3 );
                tx.create( group4 );
            }
        } );

        // when
        ConsistencySummaryStatistics stats = check();

        // then
        assertFalse( stats.isConsistent() );
        on( stats ).verify( RecordType.RELATIONSHIP_GROUP, 1 )
                .andThatsAllFolks();
    }

    protected Map<Setting<?>,Object> getSettings()
    {
        return settings;
    }

    private GraphStoreFixture createFixture()
    {
        return new GraphStoreFixture( getRecordFormatName(), testDirectory )
        {
            @Override
            protected void generateInitialData( GraphDatabaseService db )
            {
                // Make sure all tokens are created in expected order
                // because many tests rely on sort order for those token ids.
                try ( org.neo4j.graphdb.Transaction tx = db.beginTx() )
                {
                    KernelTransaction ktx = ((InternalTransaction) tx).kernelTransaction();
                    TokenWrite tokenWrite = ktx.tokenWrite();
                    label1 = tokenWrite.labelGetOrCreateForName( "label1" );
                    label2 = tokenWrite.labelGetOrCreateForName( "label2" );
                    label3 = tokenWrite.labelGetOrCreateForName( "label3" );
                    tokenWrite.labelGetOrCreateForName( "label4" );
                    draconian = tokenWrite.labelGetOrCreateForName( "draconian" );
                    key1 = tokenWrite.propertyKeyGetOrCreateForName( PROP1 );
                    mandatory = tokenWrite.propertyKeyGetOrCreateForName( "mandatory" );
                    C = tokenWrite.relationshipTypeGetOrCreateForName( "C" );
                    T = tokenWrite.relationshipTypeGetOrCreateForName( "T" );
                    M = tokenWrite.relationshipTypeGetOrCreateForName( "M" );
                    tx.commit();
                }
                catch ( KernelException e )
                {
                    throw new RuntimeException( e );
                }

                // Create indexes
                try ( org.neo4j.graphdb.Transaction tx = db.beginTx() )
                {
                    tx.schema().indexFor( label( "label3" ) ).on( PROP1 ).create();
                    tx.schema().indexFor( label( "label3" ) ).on( PROP1 ).withIndexType( RANGE ).create();
                    tx.schema().indexFor( label( "label3" ) ).on( PROP1 ).on( PROP2 ).create();
                    tx.schema().indexFor( label( "label3" ) ).on( PROP1 ).on( PROP2 ).withIndexType( RANGE ).create();

                    tx.schema().constraintFor( label( "label4" ) ).assertPropertyIsUnique( PROP1 ).create();
                    tx.schema().constraintFor( label( "label4" ) ).assertPropertyIsUnique( PROP1 ).withIndexType( RANGE ).create();

                    tx.schema().indexFor( withName( "C" ) ).on( PROP1 ).create();
                    tx.schema().indexFor( withName( "C" ) ).on( PROP1 ).withIndexType( RANGE ).create();
                    tx.schema().indexFor( withName( "C" ) ).on( PROP1 ).on( PROP2 ).create();
                    tx.schema().indexFor( withName( "C" ) ).on( PROP1 ).on( PROP2 ).withIndexType( RANGE ).create();
                    tx.commit();
                }
                try ( org.neo4j.graphdb.Transaction tx = db.beginTx() )
                {
                    tx.schema().awaitIndexesOnline( 2, TimeUnit.MINUTES );
                }

                // Create initial data
                try ( org.neo4j.graphdb.Transaction tx = db.beginTx() )
                {
                    Node node1 = set( tx.createNode( label( "label1" ) ) );
                    Node node2 = set( tx.createNode( label( "label2" ) ), property( PROP1, VALUE1 ) );
                    indexedRelationships.add( set( node1.createRelationshipTo( node2, withName( "C" ) ), property( PROP1, VALUE1 ) ).getId() );
                    indexedRelationships
                            .add( set( node2.createRelationshipTo( node1, withName( "C" ) ), property( PROP1, VALUE1 ), property( PROP2, VALUE2 ) ).getId() );
                    // Just to create one more rel type
                    relationshipOfTypeT = tx.createNode().createRelationshipTo( tx.createNode(), withName( "T" ) ).getId();
                    indexedNodes.add( set( tx.createNode( label( "label3" ) ), property( PROP1, VALUE1 ) ).getId() );
                    indexedNodes.add( set( tx.createNode( label( "label3" ) ), property( PROP1, VALUE1 ), property( PROP2, VALUE2 ) ).getId() );

                    set( tx.createNode( label( "label4" ) ), property( PROP1, VALUE1 ) );
                    tx.commit();
                }
            }

            @Override
            protected Map<Setting<?>,Object> getConfig()
            {
                return getSettings();
            }
        };
    }

    private void shouldReportCircularPropertyRecordChain( RecordType expectedInconsistentRecordType, EntityCreator entityCreator ) throws Exception
    {
        // Given
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( TransactionDataBuilder tx, IdGenerator next )
            {
                // Create property chain A --> B --> C --> D
                //                             ↑           │
                //                             └───────────┘
                long a = next.property();
                long b = next.property();
                long c = next.property();
                long d = next.property();
                tx.create( propertyRecordWithSingleIntProperty( a, next.propertyKey(), -1, b ) );
                tx.create( propertyRecordWithSingleIntProperty( b, next.propertyKey(), a, c ) );
                tx.create( propertyRecordWithSingleIntProperty( c, next.propertyKey(), b, d ) );
                tx.create( propertyRecordWithSingleIntProperty( d, next.propertyKey(), c, b ) );
                entityCreator.create( tx, next, a );
            }

            private PropertyRecord propertyRecordWithSingleIntProperty( long id, int propertyKeyId, long prev, long next )
            {
                PropertyRecord record = new PropertyRecord( id ).initialize( true, prev, next );
                PropertyBlock block = new PropertyBlock();
                PropertyStore.encodeValue( block, propertyKeyId, Values.intValue( 10 ), null, null, false, NULL, INSTANCE );
                record.addPropertyBlock( block );
                return record;
            }
        } );

        // When
        ConsistencySummaryStatistics stats = check();

        // Then report will be filed on Node inconsistent with the Property completing the circle
        on( stats ).verify( expectedInconsistentRecordType, 1 );
    }

    @FunctionalInterface
    private interface EntityCreator
    {
        void create( TransactionDataBuilder tx, IdGenerator next, long propertyRecordId );
    }

    protected ConsistencySummaryStatistics check() throws ConsistencyCheckIncompleteException
    {
        DirectStoreAccess stores = fixture.readOnlyDirectStoreAccess();
        return check( fixture.getInstantiatedPageCache(), stores, fixture.counts(), fixture.groupDegrees() );
    }

    private ConsistencySummaryStatistics check( PageCache pageCache, DirectStoreAccess stores, ThrowingSupplier<CountsStore,IOException> counts,
            ThrowingSupplier<RelationshipGroupDegreesStore,IOException> groupDegrees ) throws ConsistencyCheckIncompleteException
    {
        Config config = config();
        return check( pageCache, stores, counts, groupDegrees, config );
    }

    private ConsistencySummaryStatistics check( PageCache pageCache, DirectStoreAccess stores, ThrowingSupplier<CountsStore,IOException> counts,
            ThrowingSupplier<RelationshipGroupDegreesStore,IOException> groupDegrees, Config config )
            throws ConsistencyCheckIncompleteException
    {
        final var consistencyFlags = new ConsistencyFlags( true, true, true );
        FullCheck checker =
                new FullCheck( ProgressMonitorFactory.NONE, defaultConsistencyCheckThreadsNumber(), consistencyFlags, config, DebugContext.NO_DEBUG,
                        memoryLimit() );
        return checker.execute( pageCache, stores, counts, groupDegrees, fixture.indexAccessorLookup(), PageCacheTracer.NULL, INSTANCE,
                logProvider.getLog( "test" ) );
    }

    protected NodeBasedMemoryLimiter.Factory memoryLimit()
    {
        return NodeBasedMemoryLimiter.DEFAULT;
    }

    private Config config()
    {
        return Config.newBuilder()
                .set( GraphDatabaseSettings.record_format, getRecordFormatName() )
                .set( getSettings() )
                .build();
    }

    protected static RelationshipGroupRecord withRelationships( RelationshipGroupRecord group, long out, long in, long loop )
    {
        group.setFirstOut( out );
        group.setFirstIn( in );
        group.setFirstLoop( loop );
        return group;
    }

    private static RelationshipGroupRecord withRelationship( RelationshipGroupRecord group, Direction direction, long rel )
    {
        switch ( direction )
        {
        case OUTGOING:
            group.setFirstOut( rel );
            break;
        case INCOMING:
            group.setFirstIn( rel );
            break;
        case BOTH:
            group.setFirstLoop( rel );
            break;
        default:
            throw new IllegalArgumentException( direction.name() );
        }
        return group;
    }

    private static RelationshipRecord firstInChains( RelationshipRecord relationship, int count )
    {
        relationship.setFirstInFirstChain( true );
        relationship.setFirstPrevRel( count );
        relationship.setFirstInSecondChain( true );
        relationship.setSecondPrevRel( count );
        return relationship;
    }

    private static RelationshipGroupRecord withNext( RelationshipGroupRecord group, long next )
    {
        group.setNext( next );
        return group;
    }

    protected static RelationshipGroupRecord withOwner( RelationshipGroupRecord record, long owner )
    {
        record.setOwningNode( owner );
        return record;
    }

    protected String getRecordFormatName()
    {
        return StringUtils.EMPTY;
    }

    private int createEntityToken( EntityType entityType ) throws Exception
    {
        if ( entityType.equals( EntityType.NODE ) )
        {
            return createLabel();
        }
        return createRelType();
    }

    private int createLabel() throws Exception
    {
        final MutableInt id = new MutableInt( -1 );

        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                    GraphStoreFixture.IdGenerator next )
            {
                int labelId = next.label();
                tx.nodeLabel( labelId, "label_" + labelId, false );
                id.setValue( labelId );
            }
        } );

        return id.intValue();
    }

    private int createPropertyKey() throws Exception
    {
        return createPropertyKey( "property" );
    }

    private int createPropertyKey( String propertyKey ) throws Exception
    {
        final MutableInt id = new MutableInt( -1 );

        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                    GraphStoreFixture.IdGenerator next )
            {
                int propertyKeyId = next.propertyKey();
                tx.propertyKey( propertyKeyId, propertyKey + "_" + propertyKeyId, false );
                id.setValue( propertyKeyId );
            }
        } );

        return id.intValue();
    }

    private int createRelType() throws Exception
    {
        final MutableInt id = new MutableInt( -1 );

        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx,
                    GraphStoreFixture.IdGenerator next )
            {
                int relTypeId = next.relationshipType();
                tx.relationshipType( relTypeId, "relType", false );
                id.setValue( relTypeId );
            }
        } );

        return id.intValue();
    }

    private void createIndexRule( EntityType entityType, final int entityTokenId, final int... propertyKeyIds ) throws Exception
    {
        createIndexRule( entityType, IndexType.BTREE, entityTokenId, propertyKeyIds );
    }

    private void createIndexRule( EntityType entityType, IndexType indexType, final int entityTokenId, final int... propertyKeyIds ) throws Exception
    {
        AtomicReference<String> indexName = new AtomicReference<>();
        fixture.apply( new GraphStoreFixture.Transaction()
        {
            @Override
            protected void transactionData( GraphStoreFixture.TransactionDataBuilder tx, GraphStoreFixture.IdGenerator next ) throws KernelException
            {
                int id = (int) next.schema();
                String name = "index_" + id;
                IndexDescriptor index;
                switch ( entityType )
                {
                case RELATIONSHIP:
                    index = forSchema( forRelType( entityTokenId, propertyKeyIds ), DESCRIPTOR ).withIndexType( indexType ).withName( name ).materialise( id );
                    break;
                case NODE:
                default:
                    index = forSchema( forLabel( entityTokenId, propertyKeyIds ), DESCRIPTOR ).withIndexType( indexType ).withName( name ).materialise( id );
                    break;
                }
                indexName.set( name );
                index = tx.completeConfiguration( index );

                SchemaRecord before = new SchemaRecord( id );
                SchemaRecord after = cloneRecord( before );

                serializeRule( index, after, tx, next );

                tx.createSchema( before, after, index );
            }
        } );
        fixture.apply( tx ->
        {
            try
            {
                tx.schema().awaitIndexOnline( indexName.get(), 1, TimeUnit.MINUTES );
            }
            catch ( RuntimeException e )
            {
                if ( e.getCause() instanceof KernelException )
                {
                    // this is OK since many createIndex calls will create invalid indexes
                }
                else
                {
                    throw e;
                }
            }
        } );
    }

    private void createUniquenessConstraintRule( final int labelId, final int... propertyKeyIds ) throws KernelException
    {
        createUniquenessConstraintRule( IndexType.BTREE, labelId, propertyKeyIds );
    }

    private void createUniquenessConstraintRule( IndexType indexType, final int labelId, final int... propertyKeyIds ) throws KernelException
    {
        SchemaStore schemaStore = fixture.directStoreAccess().nativeStores().getSchemaStore();

        long ruleId1 = schemaStore.nextId( NULL );
        long ruleId2 = schemaStore.nextId( NULL );

        String name = "constraint_" + ruleId2;
        IndexDescriptor indexRule = uniqueForSchema( forLabel( labelId, propertyKeyIds ), DESCRIPTOR )
                .withIndexType( indexType ).withName( name ).materialise( ruleId1 ).withOwningConstraintId( ruleId2 );
        ConstraintDescriptor uniqueRule = ConstraintDescriptorFactory.uniqueForLabel( indexType, labelId, propertyKeyIds )
                .withId( ruleId2 ).withName( name ).withOwnedIndexId( ruleId1 );

        writeToSchemaStore( schemaStore, indexRule );
        writeToSchemaStore( schemaStore, uniqueRule );
    }

    private void createNodeKeyConstraintRule( final int labelId, final int... propertyKeyIds ) throws KernelException
    {
        createUniquenessConstraintRule( IndexType.BTREE, labelId, propertyKeyIds );
    }

    private void createNodeKeyConstraintRule( IndexType indexType, final int labelId, final int... propertyKeyIds ) throws KernelException
    {
        SchemaStore schemaStore = fixture.directStoreAccess().nativeStores().getSchemaStore();

        long ruleId1 = schemaStore.nextId( NULL );
        long ruleId2 = schemaStore.nextId( NULL );

        String name = "constraint_" + ruleId2;
        IndexDescriptor indexRule = uniqueForSchema( forLabel( labelId, propertyKeyIds ), DESCRIPTOR )
                .withIndexType( indexType ).withName( name ).materialise( ruleId1 ).withOwningConstraintId( ruleId2 );
        ConstraintDescriptor nodeKeyRule = ConstraintDescriptorFactory.nodeKeyForLabel( indexType, labelId, propertyKeyIds )
                .withId( ruleId2 ).withName( name ).withOwnedIndexId( ruleId1 );

        writeToSchemaStore( schemaStore, indexRule );
        writeToSchemaStore( schemaStore, nodeKeyRule );
    }

    private void createNodePropertyExistenceConstraint( int labelId, int propertyKeyId ) throws KernelException
    {
        SchemaStore schemaStore = fixture.directStoreAccess().nativeStores().getSchemaStore();
        long ruleId = schemaStore.nextId( NULL );
        ConstraintDescriptor rule = nodePropertyExistenceConstraintRule( ruleId, labelId, propertyKeyId ).withName( "constraint_" + ruleId );
        writeToSchemaStore( schemaStore, rule );
    }

    private void createRelationshipPropertyExistenceConstraint( int relTypeId, int propertyKeyId ) throws KernelException
    {
        SchemaStore schemaStore = fixture.directStoreAccess().nativeStores().getSchemaStore();
        ConstraintDescriptor rule = relPropertyExistenceConstraintRule( schemaStore.nextId( NULL ), relTypeId, propertyKeyId );
        writeToSchemaStore( schemaStore, rule );
    }

    private void writeToSchemaStore( SchemaStore schemaStore, SchemaRule rule ) throws KernelException
    {
        SchemaRuleAccess schemaRuleAccess = SchemaRuleAccess.getSchemaRuleAccess( schemaStore, fixture.writableTokenHolders(),
                () -> KernelVersion.LATEST );
        schemaRuleAccess.writeSchemaRule( rule, NULL, INSTANCE, fixture.getStoreCursors() );
    }

    protected Iterator<IndexDescriptor> getValueIndexDescriptors()
    {
        return Iterators.filter( descriptor -> !descriptor.isTokenIndex(), fixture.getIndexDescriptors() );
    }

    private static class Reference<T>
    {
        private T value;

        void set( T value )
        {
            this.value = value;
        }

        T get()
        {
            return value;
        }

        @Override
        public String toString()
        {
            return String.valueOf( value );
        }
    }

    protected static ConsistencySummaryVerifier on( ConsistencySummaryStatistics stats )
    {
        return new ConsistencySummaryVerifier( stats );
    }

    protected static final class ConsistencySummaryVerifier
    {
        private final ConsistencySummaryStatistics stats;
        private final Set<RecordType> types = new HashSet<>();
        private long total;

        private ConsistencySummaryVerifier( ConsistencySummaryStatistics stats )
        {
            this.stats = stats;
        }

        public ConsistencySummaryVerifier verify( RecordType type, int inconsistencies )
        {
            if ( !types.add( type ) )
            {
                throw new IllegalStateException( "Tried to verify the same type twice: " + type );
            }
            assertEquals( inconsistencies,
                    stats.getInconsistencyCountForRecordType( type ), "Inconsistencies of type: " + type );
            total += inconsistencies;
            return this;
        }

        public void andThatsAllFolks()
        {
            assertEquals( total, stats.getTotalInconsistencyCount(), "Total number of inconsistencies: " + stats );
        }
    }

    private void serializeRule( SchemaRule rule, SchemaRecord schemaRecord, TransactionDataBuilder tx, IdGenerator next ) throws KernelException
    {
        IntObjectMap<Value> protoProperties = SchemaStore.convertSchemaRuleToMap( rule, tx.tokenHolders() );
        Collection<PropertyBlock> blocks = new ArrayList<>();
        DynamicRecordAllocator stringAllocator = null;
        DynamicRecordAllocator arrayAllocator = null;
        protoProperties.forEachKeyValue( ( keyId, value ) ->
        {
            PropertyBlock block = new PropertyBlock();
            PropertyStore.encodeValue( block, keyId, value, stringAllocator, arrayAllocator, true, NULL, INSTANCE );
            blocks.add( block );
        } );

        long nextPropId = Record.NO_NEXT_PROPERTY.longValue();
        PropertyRecord currRecord = newInitialisedPropertyRecord( next, rule );

        for ( PropertyBlock block : blocks )
        {
            if ( !currRecord.hasSpaceFor( block ) )
            {
                PropertyRecord nextRecord = newInitialisedPropertyRecord( next, rule );
                linkAndWritePropertyRecord( currRecord, nextRecord.getId(), nextPropId, tx );
                nextPropId = currRecord.getId();
                currRecord = nextRecord;
            }
            currRecord.addPropertyBlock( block );
        }

        linkAndWritePropertyRecord( currRecord, Record.NO_PREVIOUS_PROPERTY.longValue(), nextPropId, tx );
        nextPropId = currRecord.getId();

        schemaRecord.initialize( true, nextPropId );
        schemaRecord.setId( rule.getId() );
    }

    @SuppressWarnings( "unchecked" )
    private static <T extends AbstractBaseRecord> T cloneRecord( T record )
    {
        return (T) record.copy();
    }

    private PropertyRecord newInitialisedPropertyRecord( IdGenerator next, SchemaRule rule )
    {
        PropertyRecord record = new PropertyRecord( next.property() );
        record.setSchemaRuleId( rule.getId() );
        return record;
    }

    private static void linkAndWritePropertyRecord( PropertyRecord record, long prevPropId, long nextProp, TransactionDataBuilder tx )
    {
        record.setInUse( true );
        record.setPrevProp( prevPropId );
        record.setNextProp( nextProp );
        tx.update( cloneRecord( record ).initialize( false, Record.NO_PREVIOUS_PROPERTY.longValue(), Record.NO_PREVIOUS_PROPERTY.longValue() ), record );
    }

    private static RelationshipGroupRecord relationshipGroupRecord( long id, int type )
    {
        return new RelationshipGroupRecord( id )
                .initialize( false, type, NULL_REFERENCE.longValue(), NULL_REFERENCE.longValue(), NULL_REFERENCE.longValue(), NULL_REFERENCE.longValue(),
                        NULL_REFERENCE.longValue() );
    }

    public static <R extends AbstractBaseRecord> R inUse( R record )
    {
        record.setInUse( true );
        return record;
    }

    public static <R extends AbstractBaseRecord> R notInUse( R record )
    {
        record.setInUse( false );
        return record;
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
                            // 60 to be sure to still be considered a small index for tests that add one more node to the index.
                            for ( int i = 0; i < 60; i++ )
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
                        // Create one more node in index to still be considered large index for tests that remove entries
                        fixture.apply( tx ->
                        {
                            Node node = tx.createNode( label( "label3" ) );
                            node.setProperty( PROP1, "someValue" );
                            node.setProperty( PROP2, "someOtherValue" );
                        } );
                    }
                };

        public abstract void createAdditionalData( GraphStoreFixture fixture );
    }
}
