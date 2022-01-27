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
package org.neo4j.consistency.checker;

import org.eclipse.collections.api.list.primitive.MutableLongList;
import org.eclipse.collections.api.set.primitive.MutableLongSet;
import org.eclipse.collections.impl.factory.primitive.LongLists;
import org.eclipse.collections.impl.factory.primitive.LongSets;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.LongConsumer;
import java.util.function.LongPredicate;
import java.util.function.LongSupplier;
import java.util.function.Predicate;
import java.util.function.ToLongFunction;
import java.util.stream.Stream;

import org.neo4j.common.DependencyResolver;
import org.neo4j.common.EntityType;
import org.neo4j.common.TokenNameLookup;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.consistency.ConsistencyCheckService;
import org.neo4j.consistency.checking.full.ConsistencyCheckIncompleteException;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.dbms.api.DatabaseManagementServiceBuilder;
import org.neo4j.graphdb.ConstraintViolationException;
import org.neo4j.graphdb.Entity;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.config.Setting;
import org.neo4j.graphdb.schema.ConstraintCreator;
import org.neo4j.graphdb.schema.IndexCreator;
import org.neo4j.graphdb.schema.IndexDefinition;
import org.neo4j.graphdb.schema.IndexType;
import org.neo4j.graphdb.schema.Schema;
import org.neo4j.internal.helpers.progress.ProgressMonitorFactory;
import org.neo4j.internal.recordstorage.RecordCursorTypes;
import org.neo4j.internal.recordstorage.RecordStorageEngine;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.io.layout.recordstorage.RecordDatabaseLayout;
import org.neo4j.io.pagecache.PageCursor;
import org.neo4j.kernel.api.index.IndexAccessor;
import org.neo4j.kernel.api.index.IndexEntriesReader;
import org.neo4j.kernel.api.index.IndexUpdater;
import org.neo4j.kernel.impl.api.index.AbstractDelegatingIndexProxy;
import org.neo4j.kernel.impl.api.index.IndexProxy;
import org.neo4j.kernel.impl.api.index.IndexUpdateMode;
import org.neo4j.kernel.impl.api.index.IndexingService;
import org.neo4j.kernel.impl.api.index.OnlineIndexProxy;
import org.neo4j.kernel.impl.coreapi.schema.IndexDefinitionImpl;
import org.neo4j.kernel.impl.store.AbstractDynamicStore;
import org.neo4j.kernel.impl.store.DynamicNodeLabels;
import org.neo4j.kernel.impl.store.NeoStores;
import org.neo4j.kernel.impl.store.NodeLabels;
import org.neo4j.kernel.impl.store.NodeLabelsField;
import org.neo4j.kernel.impl.store.NodeStore;
import org.neo4j.kernel.impl.store.PropertyStore;
import org.neo4j.kernel.impl.store.PropertyType;
import org.neo4j.kernel.impl.store.RecordStore;
import org.neo4j.kernel.impl.store.RelationshipStore;
import org.neo4j.kernel.impl.store.SchemaStore;
import org.neo4j.kernel.impl.store.record.AbstractBaseRecord;
import org.neo4j.kernel.impl.store.record.DynamicRecord;
import org.neo4j.kernel.impl.store.record.NodeRecord;
import org.neo4j.kernel.impl.store.record.PrimitiveRecord;
import org.neo4j.kernel.impl.store.record.PropertyBlock;
import org.neo4j.kernel.impl.store.record.PropertyRecord;
import org.neo4j.kernel.impl.store.record.RecordLoad;
import org.neo4j.kernel.impl.store.record.RelationshipGroupRecord;
import org.neo4j.kernel.impl.store.record.RelationshipRecord;
import org.neo4j.kernel.impl.store.record.SchemaRecord;
import org.neo4j.kernel.internal.GraphDatabaseAPI;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.storageengine.api.IndexEntryUpdate;
import org.neo4j.storageengine.api.cursor.CursorType;
import org.neo4j.storageengine.api.cursor.StoreCursors;
import org.neo4j.test.RandomSupport;
import org.neo4j.test.TestDatabaseManagementServiceBuilder;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.RandomExtension;
import org.neo4j.test.extension.testdirectory.TestDirectorySupportExtension;
import org.neo4j.test.utils.TestDirectory;
import org.neo4j.token.TokenHolders;
import org.neo4j.values.storable.Value;
import org.neo4j.values.storable.Values;

import static java.lang.System.currentTimeMillis;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.collection.PrimitiveLongCollections.EMPTY_LONG_ARRAY;
import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;
import static org.neo4j.configuration.GraphDatabaseSettings.neo4j_home;
import static org.neo4j.consistency.checking.full.ConsistencyFlags.DEFAULT;
import static org.neo4j.internal.recordstorage.RecordCursorTypes.DYNAMIC_ARRAY_STORE_CURSOR;
import static org.neo4j.internal.recordstorage.RecordCursorTypes.DYNAMIC_STRING_STORE_CURSOR;
import static org.neo4j.internal.recordstorage.RecordCursorTypes.GROUP_CURSOR;
import static org.neo4j.internal.recordstorage.RecordCursorTypes.NODE_CURSOR;
import static org.neo4j.internal.recordstorage.RecordCursorTypes.PROPERTY_CURSOR;
import static org.neo4j.internal.recordstorage.RecordCursorTypes.RELATIONSHIP_CURSOR;
import static org.neo4j.internal.schema.IndexType.BTREE;
import static org.neo4j.internal.schema.IndexType.RANGE;
import static org.neo4j.io.pagecache.context.CursorContext.NULL;
import static org.neo4j.kernel.impl.store.record.Record.NO_LABELS_FIELD;
import static org.neo4j.kernel.impl.store.record.Record.NULL_REFERENCE;
import static org.neo4j.memory.EmptyMemoryTracker.INSTANCE;
import static org.neo4j.values.storable.Values.intValue;

@ExtendWith( {TestDirectorySupportExtension.class, RandomExtension.class} )
public class DetectRandomSabotageIT
{
    private static final int SOME_WAY_TOO_HIGH_ID = 10_000_000;
    private static final int NUMBER_OF_NODES = 1_000;
    private static final int NUMBER_OF_INDEXES = 7;
    private static final String[] TOKEN_NAMES = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight"};

    @Inject
    TestDirectory directory;

    @Inject
    protected RandomSupport random;

    private DatabaseManagementService dbms;
    private GraphDatabaseAPI db;
    private NeoStores neoStores;
    private DependencyResolver resolver;
    private StoreCursors storageCursors;

    private DatabaseManagementService getDbms( Path home )
    {
        return addConfig( createBuilder( home ) ).build();
    }

    protected TestDatabaseManagementServiceBuilder createBuilder( Path home )
    {
        return new TestDatabaseManagementServiceBuilder( home );
    }

    @BeforeEach
    protected void setUp()
    {
        dbms = getDbms( directory.homePath() );
        db = (GraphDatabaseAPI) dbms.database( DEFAULT_DATABASE_NAME );

        // Create some nodes
        MutableLongList nodeIds = createNodes( db );

        // Force some nodes to be dense nodes and some to have only a single relationship
        MutableLongSet singleRelationshipNodes = LongSets.mutable.empty();
        MutableLongSet denseNodes = LongSets.mutable.empty();
        while ( singleRelationshipNodes.size() < 5 )
        {
            singleRelationshipNodes.add( nodeIds.get( random.nextInt( nodeIds.size() ) ) );
        }
        while ( denseNodes.size() < 5 )
        {
            long nodeId = nodeIds.get( random.nextInt( nodeIds.size() ) );
            if ( !singleRelationshipNodes.contains( nodeId ) )
            {
                denseNodes.add( nodeId );
            }
        }

        // Connect them with some relationships
        createRelationships( db, nodeIds, singleRelationshipNodes );

        // Make the dense nodes dense by creating many relationships to or from them
        createAdditionalRelationshipsForDenseNodes( db, nodeIds, denseNodes );

        // Delete some entities
        deleteSomeEntities( db, nodeIds, singleRelationshipNodes, denseNodes );

        // Create some indexes and constraints
        createSchema( db );

        RecordStorageEngine recordStorageEngine = db.getDependencyResolver().resolveDependency( RecordStorageEngine.class );
        neoStores = recordStorageEngine.testAccessNeoStores();
        storageCursors = recordStorageEngine.createStorageCursors( NULL );
        resolver = db.getDependencyResolver();
    }

    @AfterEach
    void tearDown()
    {
        storageCursors.close();
        dbms.shutdown();
    }

    @Test
    void shouldDetectRandomSabotage() throws Exception
    {
        // given
        SabotageType type = random.among( SabotageType.values() );

        // when
        Sabotage sabotage = type.run( random, neoStores, resolver, db, storageCursors );

        // then
        ConsistencyCheckService.Result result = shutDownAndRunConsistencyChecker();
        boolean hasSomeErrorOrWarning = result.summary().getTotalInconsistencyCount() > 0 || result.summary().getTotalWarningCount() > 0;
        assertTrue( hasSomeErrorOrWarning );
        // TODO also assert there being a report about the sabotaged area
    }

    /* Failures/bugs found by the random sabotage are fixed and tested below, if they don't fit into any other FullCheck IT*/

    @Test
        //From Seed 1608234007554L
    void shouldDetectIndexConfigCorruption() throws Exception
    {
        //Given
        SchemaStore schemaStore = neoStores.getSchemaStore();
        PropertyStore propertyStore = schemaStore.propertyStore();
        long indexId = resolver.resolveDependency( IndexingService.class ).getIndexIds().longIterator().next();
        SchemaRecord schemaRecord = schemaStore.newRecord();
        var cursor = storageCursors.readCursor( RecordCursorTypes.SCHEMA_CURSOR );
        schemaStore.getRecordByCursor( indexId, schemaRecord, RecordLoad.FORCE, cursor );

        PropertyRecord indexConfigPropertyRecord = propertyStore.newRecord();
        var propertyCursor = storageCursors.readCursor( RecordCursorTypes.PROPERTY_CURSOR );
        propertyStore.getRecordByCursor( schemaRecord.getNextProp(), indexConfigPropertyRecord, RecordLoad.FORCE, propertyCursor );
        propertyStore.ensureHeavy( indexConfigPropertyRecord, storageCursors );

        //When
        int[] tokenId = new int[1];
        resolver.resolveDependency( TokenHolders.class ).propertyKeyTokens().getOrCreateInternalIds( new String[]{"foo"}, tokenId );

        PropertyBlock block = indexConfigPropertyRecord.iterator().next();
        indexConfigPropertyRecord.removePropertyBlock( block.getKeyIndexId() );
        PropertyBlock newBlock = new PropertyBlock();
        propertyStore.encodeValue( newBlock, tokenId[0], intValue( 11 ), NULL, INSTANCE );
        indexConfigPropertyRecord.addPropertyBlock( newBlock );
        try ( var storeCursor = storageCursors.writeCursor( PROPERTY_CURSOR ) )
        {
            propertyStore.updateRecord( indexConfigPropertyRecord, storeCursor, NULL, storageCursors );
        }

        // then
        ConsistencyCheckService.Result result = shutDownAndRunConsistencyChecker();
        boolean hasSomeErrorOrWarning = result.summary().getTotalInconsistencyCount() > 0 || result.summary().getTotalWarningCount() > 0;
        assertTrue( hasSomeErrorOrWarning );
    }

    private void createSchema( GraphDatabaseAPI db )
    {
        for ( int i = 0; i < NUMBER_OF_INDEXES; i++ )
        {
            String entityToken = random.among( TOKEN_NAMES );
            String[] keys = random.selection( TOKEN_NAMES, 1, 3, false );
            if ( random.nextBoolean() )
            {
                createNodeIndexAndConstraint( db, entityToken, keys );
            }
            else
            {
                createRelationshipIndex( db, entityToken, keys );
            }
        }
        try ( Transaction tx = db.beginTx() )
        {
            tx.schema().awaitIndexesOnline( 2, TimeUnit.MINUTES );
            tx.commit();
        }
    }

    private void createNodeIndexAndConstraint( GraphDatabaseAPI db, String entityToken, String[] keys )
    {
        Label label = Label.label( entityToken );
        createIndex( db, schema -> schema.indexFor( label ), keys );

        if ( keys.length == 1 && random.nextFloat() < 0.3 )
        {
            try ( Transaction tx = db.beginTx() )
            {
                // Also create a uniqueness constraint for this index
                ConstraintCreator constraintCreator = tx.schema().constraintFor( label );
                for ( String key : keys )
                {
                    constraintCreator = constraintCreator.assertPropertyIsUnique( key );
                }
                if ( random.nextBoolean() )
                {
                    constraintCreator = constraintCreator.withIndexType( IndexType.RANGE );
                }
                // TODO also make it so that it's possible to add other types of constraints... this would mean
                //      guaranteeing e.g. property existence on entities given certain entity tokens and such
                constraintCreator.create();
                tx.commit();
            }
            catch ( ConstraintViolationException e )
            {
                // This is fine, either we tried to create a uniqueness constraint on data that isn't unique (we just generate random data above)
                // or we already created a similar constraint.
            }
        }
    }

    private void createRelationshipIndex( GraphDatabaseAPI db, String entityToken, String[] keys )
    {
        RelationshipType type = RelationshipType.withName( entityToken );
        createIndex( db, schema -> schema.indexFor( type ), keys );
    }

    private void createIndex( GraphDatabaseAPI db, Function<Schema,IndexCreator> indexFunc, String[] keys )
    {
        try ( Transaction tx = db.beginTx() )
        {
            IndexCreator indexCreator = indexFunc.apply( tx.schema() );
            for ( String key : keys )
            {
                indexCreator = indexCreator.on( key );
            }
            if ( random.nextBoolean() )
            {
                indexCreator = indexCreator.withIndexType( IndexType.RANGE );
            }
            indexCreator.create();
            tx.commit();
        }
        catch ( ConstraintViolationException e )
        {
            // This is fine we've already created a similar index
        }
    }

    private void deleteSomeEntities( GraphDatabaseAPI db, MutableLongList nodeIds, MutableLongSet singleRelationshipNodes, MutableLongSet denseNodes )
    {
        int nodesToDelete = NUMBER_OF_NODES / 100;
        try ( Transaction tx = db.beginTx() )
        {
            for ( int i = 0; i < nodesToDelete; i++ )
            {
                long nodeId;
                do
                {
                    nodeId = nodeIds.get( random.nextInt( nodeIds.size() ) );
                }
                while ( singleRelationshipNodes.contains( nodeId ) || denseNodes.contains( nodeId ) );
                nodeIds.remove( nodeId );
                Node node = tx.getNodeById( nodeId );
                node.getRelationships().forEach( Relationship::delete );
                node.delete();
            }
            tx.commit();
        }
    }

    private void createAdditionalRelationshipsForDenseNodes( GraphDatabaseAPI db, MutableLongList nodeIds, MutableLongSet denseNodes )
    {
        try ( Transaction tx = db.beginTx() )
        {
            int additionalRelationships = denseNodes.size() * GraphDatabaseSettings.dense_node_threshold.defaultValue();
            long[] denseNodeIds = denseNodes.toArray();
            for ( int i = 0; i < additionalRelationships; i++ )
            {
                Node denseNode = tx.getNodeById( denseNodeIds[i % denseNodeIds.length] );
                Node otherNode = tx.getNodeById( nodeIds.get( random.nextInt( nodeIds.size() ) ) );
                Node startNode = random.nextBoolean() ? denseNode : otherNode;
                Node endNode = startNode == denseNode ? otherNode : denseNode;
                startNode.createRelationshipTo( endNode, RelationshipType.withName( random.among( TOKEN_NAMES ) ) );
            }
            tx.commit();
        }
    }

    private void createRelationships( GraphDatabaseAPI db, MutableLongList nodeIds, MutableLongSet singleRelationshipNodes )
    {
        try ( Transaction tx = db.beginTx() )
        {
            int numberOfRelationships = (int) (NUMBER_OF_NODES * (10f + 10f * random.nextFloat()));
            for ( int i = 0; i < numberOfRelationships; i++ )
            {
                Node startNode = tx.getNodeById( nodeIds.get( random.nextInt( nodeIds.size() ) ) );
                Node endNode = tx.getNodeById( nodeIds.get( random.nextInt( nodeIds.size() ) ) );
                Relationship relationship = startNode.createRelationshipTo( endNode, RelationshipType.withName( random.among( TOKEN_NAMES ) ) );
                setRandomProperties( relationship );
                // Prevent more relationships to be added to the "single-relationship" Nodes
                if ( singleRelationshipNodes.remove( startNode.getId() ) )
                {
                    nodeIds.remove( startNode.getId() );
                }
                if ( singleRelationshipNodes.remove( endNode.getId() ) )
                {
                    nodeIds.remove( endNode.getId() );
                }
            }
            tx.commit();
        }
    }

    private MutableLongList createNodes( GraphDatabaseAPI db )
    {
        MutableLongList nodeIds = LongLists.mutable.empty();
        try ( Transaction tx = db.beginTx() )
        {
            for ( int i = 0; i < NUMBER_OF_NODES; i++ )
            {
                Node node = tx.createNode( labels( random.selection( TOKEN_NAMES, 0, TOKEN_NAMES.length, false ) ) );
                setRandomProperties( node );
                nodeIds.add( node.getId() );
            }
            tx.commit();
        }
        return nodeIds;
    }

    private void setRandomProperties( Entity entity )
    {
        for ( String key : random.selection( TOKEN_NAMES, 0, TOKEN_NAMES.length, false ) )
        {
            entity.setProperty( key, randomValue().asObjectCopy() );
        }
    }

    private Value randomValue()
    {
        switch ( random.nextInt( 100 ) )
        {
        case 0: // A large string
            return random.nextAlphaNumericTextValue( 300, 500 );
        case 1: // A large string array
            int arrayLength = random.nextInt( 20, 40 );
            String[] array = new String[arrayLength];
            for ( int i = 0; i < arrayLength; i++ )
            {
                array[i] = random.nextAlphaNumericTextValue( 10, 20 ).stringValue();
            }
            return Values.stringArray( array );
        default:
            return random.nextValue();
        }
    }

    private static Label[] labels( String[] names )
    {
        return Stream.of( names ).map( Label::label ).toArray( Label[]::new );
    }

    private ConsistencyCheckService.Result shutDownAndRunConsistencyChecker() throws ConsistencyCheckIncompleteException
    {
        dbms.shutdown();
        Config.Builder builder = Config.newBuilder().set( neo4j_home, directory.homePath() );
        Config config = addConfig( builder ).build();
        return new ConsistencyCheckService().runFullConsistencyCheck( RecordDatabaseLayout.of( config ), config, ProgressMonitorFactory.NONE,
                NullLogProvider.getInstance(), false, DEFAULT );
    }

    protected <T> T addConfig( T t, SetConfigAction<T> action )
    {
        return t;
    }

    private DatabaseManagementServiceBuilder addConfig( DatabaseManagementServiceBuilder builder )
    {
        return addConfig( builder, DatabaseManagementServiceBuilder::setConfig );
    }

    private Config.Builder addConfig( Config.Builder builder )
    {
        return addConfig( builder, Config.Builder::set );
    }

    @FunctionalInterface
    protected interface SetConfigAction<TARGET>
    {
        <VALUE> void setConfig( TARGET target, Setting<VALUE> setting, VALUE value );
    }

    enum SabotageType
    {
        NODE_PROP
                {
                    @Override
                    Sabotage run( RandomSupport random, NeoStores stores, DependencyResolver otherDependencies, GraphDatabaseAPI db,
                            StoreCursors storageCursors )
                    {
                        return loadChangeUpdate( random, stores.getNodeStore(), usedRecord(), PrimitiveRecord::getNextProp, PrimitiveRecord::setNextProp,
                                () -> randomLargeSometimesNegative( random ), storageCursors, NODE_CURSOR );
                    }
                },
        NODE_REL
                {
                    @Override
                    Sabotage run( RandomSupport random, NeoStores stores, DependencyResolver otherDependencies, GraphDatabaseAPI db,
                            StoreCursors storageCursors )
                    {
                        return loadChangeUpdate( random, stores.getNodeStore(), usedRecord(), NodeRecord::getNextRel, NodeRecord::setNextRel, storageCursors,
                                NODE_CURSOR );
                    }
                },
        NODE_LABELS
                {
                    @Override
                    Sabotage run( RandomSupport random, NeoStores stores, DependencyResolver otherDependencies, GraphDatabaseAPI db,
                            StoreCursors storageCursors )
                    {
                        NodeStore store = stores.getNodeStore();
                        PageCursor nodeCursor = storageCursors.readCursor( NODE_CURSOR );
                        NodeRecord node = randomRecord( random, store, usedRecord(), nodeCursor );
                        NodeRecord before = store.newRecord();
                        store.getRecordByCursor( node.getId(), before, RecordLoad.NORMAL, nodeCursor );
                        NodeLabels nodeLabels = NodeLabelsField.parseLabelsField( node );
                        long[] existing = nodeLabels.get( store, storageCursors );
                        if ( random.nextBoolean() )
                        {
                            // Change inlined
                            do
                            {
                                long labelField = random.nextLong( 0xFF_FFFFFFFFL );
                                if ( !NodeLabelsField.fieldPointsToDynamicRecordOfLabels( labelField ) )
                                {
                                    node.setLabelField( labelField, node.getDynamicLabelRecords() );
                                }
                            }
                            while ( Arrays.equals( existing, NodeLabelsField.get( node, store, storageCursors ) ) );
                        }
                        else
                        {
                            long existingLabelField = node.getLabelField();
                            do
                            {
                                node.setLabelField( DynamicNodeLabels.dynamicPointer( randomLargeSometimesNegative( random ) ), node.getDynamicLabelRecords() );
                            }
                            while ( existingLabelField == node.getLabelField() );
                        }
                        try ( var storeCursor = storageCursors.writeCursor( NODE_CURSOR ) )
                        {
                            store.updateRecord( node, storeCursor, NULL, storageCursors );
                        }
                        return recordSabotage( before, node );
                    }
                },
        NODE_IN_USE
                {
                    @Override
                    Sabotage run( RandomSupport random, NeoStores stores, DependencyResolver otherDependencies, GraphDatabaseAPI db,
                            StoreCursors storageCursors )
                    {
                        return setRandomRecordNotInUse( random, stores.getNodeStore(), storageCursors, NODE_CURSOR );
                    }
                },
        RELATIONSHIP_CHAIN
                {
                    @Override
                    Sabotage run( RandomSupport random, NeoStores stores, DependencyResolver otherDependencies, GraphDatabaseAPI db,
                            StoreCursors storageCursors )
                    {
                        RelationshipStore store = stores.getRelationshipStore();
                        PageCursor relCursor = storageCursors.readCursor( RELATIONSHIP_CURSOR );
                        RelationshipRecord relationship = randomRecord( random, store, usedRecord(), relCursor );
                        RelationshipRecord before = store.newRecord();
                        store.getRecordByCursor( relationship.getId(), before, RecordLoad.NORMAL, relCursor );
                        LongSupplier rng = () -> randomIdOrSometimesDefault( random, NULL_REFERENCE.longValue(), id -> true );
                        switch ( random.nextInt( 4 ) )
                        {
                        case 0: // start node prev
                            // Our consistency checker(s) doesn't verify node degrees
                            if ( !relationship.isFirstInFirstChain() )
                            {
                                guaranteedChangedId( relationship::getFirstPrevRel, relationship::setFirstPrevRel, rng );
                                break;
                            }
                        case 1: // start node next
                            guaranteedChangedId( relationship::getFirstNextRel, relationship::setFirstNextRel, rng );
                            break;
                        case 2: // end node prev
                            // Our consistency checker(s) doesn't verify node degrees
                            if ( !relationship.isFirstInSecondChain() )
                            {
                                guaranteedChangedId( relationship::getSecondPrevRel, relationship::setSecondPrevRel, rng );
                                break;
                            }
                        default: // end node next
                            guaranteedChangedId( relationship::getSecondNextRel, relationship::setSecondNextRel, rng );
                            break;
                        }
                        try ( var storeCursor = storageCursors.writeCursor( RELATIONSHIP_CURSOR ) )
                        {
                            store.updateRecord( relationship, storeCursor, NULL, storageCursors );
                        }
                        return recordSabotage( before, relationship );
                    }
                },
        RELATIONSHIP_NODES
                {
                    @Override
                    Sabotage run( RandomSupport random, NeoStores stores, DependencyResolver otherDependencies, GraphDatabaseAPI db,
                            StoreCursors storageCursors )
                    {
                        boolean startNode = random.nextBoolean();
                        ToLongFunction<RelationshipRecord> getter = startNode ? RelationshipRecord::getFirstNode : RelationshipRecord::getSecondNode;
                        BiConsumer<RelationshipRecord,Long> setter = startNode ? RelationshipRecord::setFirstNode : RelationshipRecord::setSecondNode;
                        return loadChangeUpdate( random, stores.getRelationshipStore(), usedRecord(), getter, setter, storageCursors, RELATIONSHIP_CURSOR );
                    }
                },
        RELATIONSHIP_PROP
                {
                    @Override
                    Sabotage run( RandomSupport random, NeoStores stores, DependencyResolver otherDependencies, GraphDatabaseAPI db,
                            StoreCursors storageCursors )
                    {
                        return loadChangeUpdate( random, stores.getRelationshipStore(), usedRecord(), PrimitiveRecord::getNextProp,
                                PrimitiveRecord::setNextProp, () -> randomLargeSometimesNegative( random, propertyId ->
                                {
                                    // For relationship properties there's a chance that the generated id will be a perfectly valid
                                    // start of an existing property chain, therefore add some extra validation to this ID

                                    // We can not detect corrupt property pointers that look like empty pointers.
                                    if ( NULL_REFERENCE.is( propertyId ) )
                                    {
                                        return false;
                                    }

                                    if ( propertyId < 0 )
                                    {
                                        return true;
                                    }

                                    PropertyStore propertyStore = stores.getPropertyStore();
                                    PropertyRecord record = propertyStore.newRecord();
                                    propertyStore.getRecordByCursor( propertyId, record, RecordLoad.CHECK, storageCursors.readCursor( PROPERTY_CURSOR ) );
                                    return !record.inUse() || !NULL_REFERENCE.is( record.getPrevProp() );
                                } ), storageCursors, RELATIONSHIP_CURSOR );
                    }
                },
        RELATIONSHIP_TYPE
                {
                    @Override
                    Sabotage run( RandomSupport random, NeoStores stores, DependencyResolver otherDependencies, GraphDatabaseAPI db,
                            StoreCursors storageCursors )
                    {
                        return loadChangeUpdate( random, stores.getRelationshipStore(), usedRecord(), RelationshipRecord::getType,
                                ( relationship, type ) -> relationship.setType( type.intValue() ), () -> random.nextInt( TOKEN_NAMES.length * 2 ) - 1,
                                storageCursors, RELATIONSHIP_CURSOR );
                    }
                },
        RELATIONSHIP_IN_USE
                {
                    @Override
                    Sabotage run( RandomSupport random, NeoStores stores, DependencyResolver otherDependencies, GraphDatabaseAPI db,
                            StoreCursors storageCursors )
                    {
                        return setRandomRecordNotInUse( random, stores.getRelationshipStore(), storageCursors, RELATIONSHIP_CURSOR );
                    }
                },
        PROPERTY_CHAIN
                {
                    @Override
                    Sabotage run( RandomSupport random, NeoStores stores, DependencyResolver otherDependencies, GraphDatabaseAPI db,
                            StoreCursors storageCursors )
                    {
                        boolean prev = random.nextBoolean();
                        if ( prev )
                        {
                            return loadChangeUpdate( random, stores.getPropertyStore(), usedRecord(), PropertyRecord::getPrevProp, PropertyRecord::setPrevProp,
                                    storageCursors, PROPERTY_CURSOR );
                        }
                        return loadChangeUpdate( random, stores.getPropertyStore(), usedRecord(), PropertyRecord::getNextProp, PropertyRecord::setNextProp,
                                () -> randomLargeSometimesNegative( random ), storageCursors, PROPERTY_CURSOR );
                        //can not detect chains split with next = -1
                    }
                },
        //        PROPERTY_VALUE,
//        PROPERTY_KEY,
        PROPERTY_IN_USE
                {
                    @Override
                    Sabotage run( RandomSupport random, NeoStores stores, DependencyResolver otherDependencies, GraphDatabaseAPI db,
                            StoreCursors storageCursors )
                    {
                        return setRandomRecordNotInUse( random, stores.getPropertyStore(), storageCursors, PROPERTY_CURSOR );
                    }
                },
        // STRING_CHAIN - format doesn't allow us to detect these
        STRING_LENGTH
                {
                    @Override
                    Sabotage run( RandomSupport random, NeoStores stores, DependencyResolver otherDependencies, GraphDatabaseAPI db,
                            StoreCursors storageCursors )
                    {
                        return loadChangeUpdateDynamicChain( random, stores.getPropertyStore(), stores.getPropertyStore().getStringStore(), PropertyType.STRING,
                                record -> record.setData( Arrays.copyOf( record.getData(), random.nextInt( record.getLength() ) ) ), v -> true, storageCursors,
                                DYNAMIC_STRING_STORE_CURSOR );
                    }
                },
        //        STRING_DATA - format doesn't allow us to detect these
        STRING_IN_USE
                {
                    @Override
                    Sabotage run( RandomSupport random, NeoStores stores, DependencyResolver otherDependencies, GraphDatabaseAPI db,
                            StoreCursors storageCursors )
                    {
                        return setRandomRecordNotInUse( random, stores.getPropertyStore().getStringStore(), storageCursors, DYNAMIC_STRING_STORE_CURSOR );
                    }
                },
        ARRAY_CHAIN
                {
                    @Override
                    Sabotage run( RandomSupport random, NeoStores stores, DependencyResolver otherDependencies, GraphDatabaseAPI db,
                            StoreCursors storageCursors )
                    {
                        return loadChangeUpdateDynamicChain( random, stores.getPropertyStore(), stores.getPropertyStore().getArrayStore(), PropertyType.ARRAY,
                                record -> record.setData( Arrays.copyOf( record.getData(), random.nextInt( record.getLength() ) ) ),
                                v -> v.asObjectCopy() instanceof String[], storageCursors, DYNAMIC_ARRAY_STORE_CURSOR );
                    }
                },
        ARRAY_LENGTH
                {
                    @Override
                    Sabotage run( RandomSupport random, NeoStores stores, DependencyResolver otherDependencies, GraphDatabaseAPI db,
                            StoreCursors storageCursors )
                    {
                        return loadChangeUpdateDynamicChain( random, stores.getPropertyStore(), stores.getPropertyStore().getArrayStore(), PropertyType.ARRAY,
                                record -> record.setData( Arrays.copyOf( record.getData(), random.nextInt( record.getLength() ) ) ), v -> true, storageCursors,
                                DYNAMIC_ARRAY_STORE_CURSOR );
                    }
                },
        //        ARRAY_DATA?
        ARRAY_IN_USE
                {
                    @Override
                    Sabotage run( RandomSupport random, NeoStores stores, DependencyResolver otherDependencies, GraphDatabaseAPI db,
                            StoreCursors storageCursors )
                    {
                        return setRandomRecordNotInUse( random, stores.getPropertyStore().getArrayStore(), storageCursors, DYNAMIC_ARRAY_STORE_CURSOR );
                    }
                },
        RELATIONSHIP_GROUP_CHAIN
                {
                    @Override
                    Sabotage run( RandomSupport random, NeoStores stores, DependencyResolver otherDependencies, GraphDatabaseAPI db,
                            StoreCursors storageCursors )
                    {
                        // prev isn't stored in the record format
                        return loadChangeUpdate( random, stores.getRelationshipGroupStore(), usedRecord(), RelationshipGroupRecord::getNext,
                                RelationshipGroupRecord::setNext, () -> randomIdOrSometimesDefault( random, NULL_REFERENCE.longValue(), id -> true ),
                                storageCursors, GROUP_CURSOR );
                    }
                },
        RELATIONSHIP_GROUP_TYPE
                {
                    @Override
                    Sabotage run( RandomSupport random, NeoStores stores, DependencyResolver otherDependencies, GraphDatabaseAPI db,
                            StoreCursors storageCursors )
                    {
                        return loadChangeUpdate( random, stores.getRelationshipGroupStore(), usedRecord(), RelationshipGroupRecord::getType,
                                ( group, type ) -> group.setType( type.intValue() ), () -> random.nextInt( TOKEN_NAMES.length * 2 ) - 1, storageCursors,
                                GROUP_CURSOR );
                    }
                },
        RELATIONSHIP_GROUP_FIRST_RELATIONSHIP
                {
                    @Override
                    Sabotage run( RandomSupport random, NeoStores stores, DependencyResolver otherDependencies, GraphDatabaseAPI db,
                            StoreCursors storageCursors )
                    {
                        ToLongFunction<RelationshipGroupRecord> getter;
                        BiConsumer<RelationshipGroupRecord,Long> setter;
                        switch ( random.nextInt( 3 ) )
                        {
                        case 0:
                            getter = RelationshipGroupRecord::getFirstOut;
                            setter = RelationshipGroupRecord::setFirstOut;
                            break;
                        case 1:
                            getter = RelationshipGroupRecord::getFirstIn;
                            setter = RelationshipGroupRecord::setFirstIn;
                            break;
                        default:
                            getter = RelationshipGroupRecord::getFirstLoop;
                            setter = RelationshipGroupRecord::setFirstLoop;
                            break;
                        }
                        return loadChangeUpdate( random, stores.getRelationshipGroupStore(), usedRecord(), getter, setter,
                                () -> randomLargeSometimesNegative( random ), storageCursors, GROUP_CURSOR );
                    }
                },
        RELATIONSHIP_GROUP_IN_USE
                {
                    @Override
                    Sabotage run( RandomSupport random, NeoStores stores, DependencyResolver otherDependencies, GraphDatabaseAPI db,
                            StoreCursors storageCursors )
                    {
                        return setRandomRecordNotInUse( random, stores.getRelationshipGroupStore(), storageCursors, GROUP_CURSOR );
                    }
                },
        SCHEMA_INDEX_ENTRY
                {
                    @Override
                    Sabotage run( RandomSupport random, NeoStores stores, DependencyResolver otherDependencies, GraphDatabaseAPI db,
                            StoreCursors storageCursors ) throws Exception
                    {
                        IndexingService indexing = otherDependencies.resolveDependency( IndexingService.class );
                        long[] indexIds = indexing.getIndexIds().toArray();
                        IndexProxy indexProxy = null;
                        while ( indexProxy == null )
                        {
                            // Make sure we get an index proxy representing a BTREE or RANGE index (and not e.g. TokenIndex)
                            long indexId = indexIds[random.nextInt( indexIds.length )];
                            indexProxy = indexing.getIndexProxy( indexId );
                            while ( indexProxy instanceof AbstractDelegatingIndexProxy )
                            {
                                indexProxy = ((AbstractDelegatingIndexProxy) indexProxy).getDelegate();
                            }

                            org.neo4j.internal.schema.IndexType type = indexProxy.getDescriptor().getIndexType();
                            if ( type != BTREE && type != RANGE )
                            {
                                indexProxy = null;
                            }
                        }
                        IndexAccessor accessor = ((OnlineIndexProxy) indexProxy).accessor();
                        long selectedEntityId = -1;
                        Value[] selectedValues = null;
                        try ( IndexEntriesReader reader = accessor.newAllEntriesValueReader( 1, NULL )[0] )
                        {
                            long entityId = -1;
                            Value[] values = null;
                            while ( reader.hasNext() )
                            {
                                entityId = reader.next();
                                values = reader.values();
                                if ( random.nextFloat() < 0.01 )
                                {
                                    selectedEntityId = entityId;
                                    selectedValues = values;
                                }
                            }
                            if ( selectedValues == null && entityId != -1 )
                            {
                                selectedEntityId = entityId;
                                selectedValues = values;
                            }
                        }
                        if ( selectedEntityId == -1 )
                        {
                            throw new UnsupportedOperationException( "Something is wrong with the test, could not find index entry to sabotage" );
                        }

                        boolean add = random.nextBoolean();
                        if ( indexProxy.getDescriptor().schema().entityType() == EntityType.RELATIONSHIP )
                        {
                            // Consistency checking of relationship indexes doesn't find entries that shouldn't exist
                            // in the indexes (yet), just entries missing from the index.
                            // For now just test the remove case for relationship indexes
                            add = false;
                        }
                        try ( IndexUpdater updater = accessor.newUpdater( IndexUpdateMode.ONLINE_IDEMPOTENT, NULL ) )
                        {
                            if ( add )
                            {
                                selectedEntityId = random.nextLong( SOME_WAY_TOO_HIGH_ID );
                                updater.process( IndexEntryUpdate.add( selectedEntityId, indexProxy.getDescriptor(), selectedValues ) );
                            }
                            else
                            {
                                updater.process( IndexEntryUpdate.remove( selectedEntityId, indexProxy.getDescriptor(), selectedValues ) );
                            }
                        }

                        TokenNameLookup tokenNameLookup = otherDependencies.resolveDependency( TokenNameLookup.class );
                        String userDescription = indexProxy.getDescriptor().userDescription( tokenNameLookup );
                        return new Sabotage(
                                String.format( "%s entityId:%d values:%s index:%s", add ? "Add" : "Remove", selectedEntityId, Arrays.toString( selectedValues ),
                                        userDescription ), userDescription ); // TODO more specific
                    }
                },
        NODE_LABEL_INDEX_ENTRY
                {
                    @Override
                    Sabotage run( RandomSupport random, NeoStores stores, DependencyResolver otherDependencies, GraphDatabaseAPI db,
                            StoreCursors storageCursors ) throws Exception
                    {
                        IndexDescriptor nliDescriptor = null;
                        try ( Transaction tx = db.beginTx() )
                        {
                            Iterable<IndexDefinition> indexes = tx.schema().getIndexes();
                            for ( IndexDefinition indexDefinition : indexes )
                            {
                                if ( indexDefinition.getIndexType() == IndexType.LOOKUP && indexDefinition.isNodeIndex() )
                                {
                                    nliDescriptor = ((IndexDefinitionImpl) indexDefinition).getIndexReference();
                                    break;
                                }
                            }
                            tx.commit();
                        }
                        assertNotNull( nliDescriptor );
                        IndexingService indexingService = otherDependencies.resolveDependency( IndexingService.class );
                        IndexProxy nliProxy = indexingService.getIndexProxy( nliDescriptor );

                        boolean add = random.nextBoolean();
                        NodeStore store = stores.getNodeStore();
                        NodeRecord nodeRecord = randomRecord( random, store, r -> add || (r.inUse() && r.getLabelField() != NO_LABELS_FIELD.longValue()),
                                storageCursors.readCursor( NODE_CURSOR ) );
                        TokenHolders tokenHolders = otherDependencies.resolveDependency( TokenHolders.class );
                        Set<String> labelNames = new HashSet<>( Arrays.asList( TOKEN_NAMES ) );
                        int labelId;
                        try ( IndexUpdater writer = nliProxy.newUpdater( IndexUpdateMode.ONLINE, NULL ) )
                        {
                            if ( nodeRecord.inUse() )
                            {
                                // Our node is in use, make sure it's a label it doesn't already have
                                NodeLabels labelsField = NodeLabelsField.parseLabelsField( nodeRecord );
                                long[] labelsBefore = labelsField.get( store, storageCursors );
                                for ( long labelIdBefore : labelsBefore )
                                {
                                    labelNames.remove( tokenHolders.labelTokens().getTokenById( (int) labelIdBefore ).name() );
                                }
                                if ( add )
                                {
                                    // Add a label to an existing node (in the label index only)
                                    labelId = labelNames.isEmpty() ? 9999
                                                                   : tokenHolders.labelTokens().getIdByName( random.among( new ArrayList<>( labelNames ) ) );
                                    long[] labelsAfter = Arrays.copyOf( labelsBefore, labelsBefore.length + 1 );
                                    labelsAfter[labelsBefore.length] = labelId;
                                    Arrays.sort( labelsAfter );
                                    writer.process( IndexEntryUpdate.change( nodeRecord.getId(), nliDescriptor, labelsBefore, labelsAfter ) );
                                }
                                else
                                {
                                    // Remove a label from an existing node (in the label index only)
                                    MutableLongList labels = LongLists.mutable.of( Arrays.copyOf( labelsBefore, labelsBefore.length ) );
                                    labelId = (int) labels.removeAtIndex( random.nextInt( labels.size() ) );
                                    long[] labelsAfter = labels.toSortedArray(); // With one of the labels removed
                                    writer.process( IndexEntryUpdate.change( nodeRecord.getId(), nliDescriptor, labelsBefore, labelsAfter ) );
                                }
                            }
                            else // Getting here means the we're adding something (see above when selecting the node)
                            {
                                // Add a label to a non-existent node (in the label index only)
                                labelId = tokenHolders.labelTokens().getIdByName( random.among( TOKEN_NAMES ) );
                                writer.process( IndexEntryUpdate.change( nodeRecord.getId(), nliDescriptor, EMPTY_LONG_ARRAY, new long[]{labelId} ) );
                            }
                        }
                        return new Sabotage( String.format( "%s labelId:%d node:%s", add ? "Add" : "Remove", labelId, nodeRecord ), nodeRecord.toString() );
                    }
                },
        RELATIONSHIP_TYPE_INDEX_ENTRY
                {
                    @Override
                    Sabotage run( RandomSupport random, NeoStores stores, DependencyResolver otherDependencies, GraphDatabaseAPI db,
                            StoreCursors storageCursors ) throws Exception
                    {
                        IndexDescriptor rtiDescriptor = null;
                        try ( Transaction tx = db.beginTx() )
                        {
                            Iterable<IndexDefinition> indexes = tx.schema().getIndexes();
                            for ( IndexDefinition indexDefinition : indexes )
                            {
                                if ( indexDefinition.getIndexType() == IndexType.LOOKUP && indexDefinition.isRelationshipIndex() )
                                {
                                    rtiDescriptor = ((IndexDefinitionImpl) indexDefinition).getIndexReference();
                                    break;
                                }
                            }
                            tx.commit();
                        }
                        assertNotNull( rtiDescriptor );
                        IndexingService indexingService = otherDependencies.resolveDependency( IndexingService.class );
                        IndexProxy rtiProxy = indexingService.getIndexProxy( rtiDescriptor );

                        RelationshipStore store = stores.getRelationshipStore();
                        RelationshipRecord relationshipRecord = randomRecord( random, store, r -> true, storageCursors.readCursor( RELATIONSHIP_CURSOR ) );
                        TokenHolders tokenHolders = otherDependencies.resolveDependency( TokenHolders.class );
                        Set<String> relationshipTypeNames = new HashSet<>( Arrays.asList( TOKEN_NAMES ) );
                        int typeBefore = relationshipRecord.getType();
                        long[] typesBefore = new long[]{typeBefore};
                        int typeId;
                        long[] typesAfter;
                        String operation;
                        try ( IndexUpdater writer = rtiProxy.newUpdater( IndexUpdateMode.ONLINE, NULL ) )
                        {
                            if ( relationshipRecord.inUse() )
                            {
                                int mode = random.nextInt( 3 );
                                if ( mode < 2 )
                                {
                                    relationshipTypeNames.remove( tokenHolders.relationshipTypeTokens().getTokenById( typeBefore ).name() );
                                    typeId = tokenHolders.relationshipTypeTokens().getIdByName( random.among( new ArrayList<>( relationshipTypeNames ) ) );
                                    if ( mode == 0 )
                                    {
                                        operation = "Replace relationship type in index with a new type";
                                        typesAfter = new long[]{typeId};
                                    }
                                    else
                                    {
                                        operation = "Add additional relationship type in index";
                                        typesAfter = new long[]{typeId, typeBefore};
                                        Arrays.sort( typesAfter );
                                    }
                                }
                                else
                                {
                                    operation = "Remove relationship type from index";
                                    typeId = typeBefore;
                                    typesAfter = EMPTY_LONG_ARRAY;
                                }
                                writer.process( IndexEntryUpdate.change( relationshipRecord.getId(), rtiDescriptor, typesBefore, typesAfter ) );
                            }
                            else
                            {
                                // Getting here means the we're adding something (see above when selecting the relationship)
                                operation = "Add relationship type to a non-existing relationship (in relationship type index only)";
                                typeId = tokenHolders.labelTokens().getIdByName( random.among( TOKEN_NAMES ) );
                                writer.process( IndexEntryUpdate.change( relationshipRecord.getId(), rtiDescriptor, EMPTY_LONG_ARRAY, new long[]{typeId} ) );
                            }
                        }
                        String description = String.format( "%s relationshipTypeId:%d relationship:%s", operation, typeId, relationshipRecord );
                        return new Sabotage( description, relationshipRecord.toString() );
                    }
                },
        GRAPH_ENTITY_USES_INTERNAL_TOKEN
                {
                    @Override
                    Sabotage run( RandomSupport random, NeoStores stores, DependencyResolver otherDependencies, GraphDatabaseAPI db,
                            StoreCursors storageCursors ) throws Exception
                    {
                        TokenHolders tokenHolders = otherDependencies.resolveDependency( TokenHolders.class );
                        String tokenName = "Token-" + currentTimeMillis();
                        int[] tokenId = new int[1];
                        switch ( random.nextInt( 3 ) )
                        {
                        case 0: // node label
                        {
                            tokenHolders.labelTokens().getOrCreateInternalIds( new String[]{tokenName}, tokenId );
                            NodeStore nodeStore = stores.getNodeStore();
                            NodeRecord node = randomRecord( random, nodeStore, usedRecord(), storageCursors.readCursor( NODE_CURSOR ) );
                            NodeLabelsField.parseLabelsField( node ).add( tokenId[0], nodeStore, nodeStore.getDynamicLabelStore(), NULL, storageCursors,
                                    INSTANCE );
                            try ( var storeCursor = storageCursors.writeCursor( NODE_CURSOR ) )
                            {
                                nodeStore.updateRecord( node, storeCursor, NULL, storageCursors );
                            }
                            return new Sabotage( "Node has label token which is internal", node.toString() );
                        }
                        case 1: // property
                        {
                            tokenHolders.propertyKeyTokens().getOrCreateInternalIds( new String[]{tokenName}, tokenId );
                            PropertyStore propertyStore = stores.getPropertyStore();
                            PropertyRecord property = randomRecord( random, propertyStore, usedRecord(), storageCursors.readCursor( PROPERTY_CURSOR ) );
                            PropertyBlock block = property.iterator().next();
                            property.removePropertyBlock( block.getKeyIndexId() );
                            PropertyBlock newBlock = new PropertyBlock();
                            propertyStore.encodeValue( newBlock, tokenId[0], intValue( 11 ), NULL, INSTANCE );
                            property.addPropertyBlock( newBlock );
                            try ( var storeCursor = storageCursors.writeCursor( PROPERTY_CURSOR ) )
                            {
                                propertyStore.updateRecord( property, storeCursor, NULL, storageCursors );
                            }
                            return new Sabotage( "Property has key which is internal", property.toString() );
                        }
                        default: // relationship type
                        {
                            tokenHolders.relationshipTypeTokens().getOrCreateInternalIds( new String[]{tokenName}, tokenId );
                            RelationshipStore relationshipStore = stores.getRelationshipStore();
                            RelationshipRecord relationship =
                                    randomRecord( random, relationshipStore, usedRecord(), storageCursors.readCursor( RELATIONSHIP_CURSOR ) );
                            relationship.setType( tokenId[0] );
                            try ( var storeCursor = storageCursors.writeCursor( RELATIONSHIP_CURSOR ) )
                            {
                                relationshipStore.updateRecord( relationship, storeCursor, NULL, storageCursors );
                            }
                            return new Sabotage( "Relationship has type which is internal", relationship.toString() );
                        }
                        }
                    }
                };

        protected static <T extends AbstractBaseRecord> Sabotage setRandomRecordNotInUse( RandomSupport random, RecordStore<T> store, StoreCursors storeCursors,
                CursorType cursorType )
        {
            PageCursor readCursor = storeCursors.readCursor( cursorType );
            T before = randomRecord( random, store, usedRecord(), readCursor );
            T record = store.newRecord();
            store.getRecordByCursor( before.getId(), record, RecordLoad.NORMAL, readCursor );
            record.setInUse( false );
            try ( var storeCursor = storeCursors.writeCursor( cursorType ) )
            {
                store.updateRecord( record, storeCursor, NULL, storeCursors );
            }
            return recordSabotage( before, record );
        }

        private static <T extends AbstractBaseRecord> Predicate<T> usedRecord()
        {
            return AbstractBaseRecord::inUse;
        }

        protected static <T extends AbstractBaseRecord> Sabotage loadChangeUpdate( RandomSupport random, RecordStore<T> store, Predicate<T> filter,
                ToLongFunction<T> idGetter, BiConsumer<T,Long> idSetter, StoreCursors storeCursors, CursorType cursorType )
        {
            return loadChangeUpdate( random, store, filter, idGetter, idSetter,
                    () -> randomIdOrSometimesDefault( random, NULL_REFERENCE.longValue(), id -> true ), storeCursors, cursorType );
        }

        protected static <T extends AbstractBaseRecord> Sabotage loadChangeUpdate( RandomSupport random, RecordStore<T> store, Predicate<T> filter,
                ToLongFunction<T> idGetter, BiConsumer<T,Long> idSetter, LongSupplier rng, StoreCursors storeCursors, CursorType cursorType )
        {
            PageCursor readCursor = storeCursors.readCursor( cursorType );
            T before = randomRecord( random, store, filter, readCursor );
            T record = store.newRecord();
            store.getRecordByCursor( before.getId(), record, RecordLoad.NORMAL, readCursor );
            guaranteedChangedId( () -> idGetter.applyAsLong( record ), changedId -> idSetter.accept( record, changedId ), rng );
            try ( var storeCursor = storeCursors.writeCursor( cursorType ) )
            {
                store.updateRecord( record, storeCursor, NULL, storeCursors );
            }
            return recordSabotage( before, record );
        }

        private static <T extends AbstractBaseRecord> Sabotage recordSabotage( T before, T after )
        {
            return new Sabotage( String.format( "%s --> %s", before, after ), after.toString() );
        }

        protected static void guaranteedChangedId( LongSupplier getter, LongConsumer setter, LongSupplier rng )
        {
            long nextProp = getter.getAsLong();
            while ( getter.getAsLong() == nextProp )
            {
                setter.accept( rng.getAsLong() );
            }
        }

        private static Sabotage loadChangeUpdateDynamicChain( RandomSupport random, PropertyStore propertyStore, AbstractDynamicStore dynamicStore,
                PropertyType valueType, Consumer<DynamicRecord> vandal, Predicate<Value> checkability, StoreCursors storeCursors, CursorType dynamicCursorType )
        {
            PropertyRecord propertyRecord = propertyStore.newRecord();
            var propertyCursor = storeCursors.readCursor( RecordCursorTypes.PROPERTY_CURSOR );
            while ( true )
            {
                propertyStore.getRecordByCursor( random.nextLong( propertyStore.getHighId() ), propertyRecord, RecordLoad.CHECK, propertyCursor );
                if ( propertyRecord.inUse() )
                {
                    try ( var dynamicCursor = storeCursors.writeCursor( dynamicCursorType ) )
                    {
                        for ( PropertyBlock block : propertyRecord )
                        {
                            if ( block.getType() == valueType && checkability.test( block.getType().value( block, propertyStore, storeCursors ) ) )
                            {
                                propertyStore.ensureHeavy( block, storeCursors );
                                if ( block.getValueRecords().size() > 1 )
                                {
                                    DynamicRecord dynamicRecord = block.getValueRecords().get( random.nextInt( block.getValueRecords().size() - 1 ) );
                                    DynamicRecord before = dynamicStore.newRecord();
                                    dynamicStore.getRecordByCursor( dynamicRecord.getId(), before, RecordLoad.NORMAL,
                                            storeCursors.readCursor( dynamicCursorType ) );
                                    vandal.accept( dynamicRecord );
                                    dynamicStore.updateRecord( dynamicRecord, dynamicCursor, NULL, storeCursors );
                                    return recordSabotage( before, dynamicRecord );
                                }
                            }
                        }
                    }
                }
            }
        }

        protected static long randomIdOrSometimesDefault( RandomSupport random, long defaultValue, LongPredicate filter )
        {
            return random.nextFloat() < 0.1 ? defaultValue : randomLargeSometimesNegative( random, filter );
        }

        protected static long randomLargeSometimesNegative( RandomSupport random )
        {
            return randomLargeSometimesNegative( random, id -> true );
        }

        protected static long randomLargeSometimesNegative( RandomSupport random, LongPredicate filter )
        {
            long value;
            do
            {
                value = random.nextLong( SOME_WAY_TOO_HIGH_ID );
                value = random.nextFloat() < 0.2 ? -value : value;
            }
            while ( !filter.test( value ) );
            return value;
        }

        protected static <T extends AbstractBaseRecord> T randomRecord( RandomSupport random, RecordStore<T> store, Predicate<T> filter, PageCursor readCursor )
        {
            long highId = store.getHighId();
            T record = store.newRecord();
            do
            {
                // Load with FORCE to ignore not-in-use and decoding errors at this stage.
                store.getRecordByCursor( random.nextLong( highId ), record, RecordLoad.FORCE, readCursor );
            }
            while ( !filter.test( record ) );
            return record;
        }

        abstract Sabotage run( RandomSupport random, NeoStores stores, DependencyResolver otherDependencies, GraphDatabaseAPI db, StoreCursors storageCursors )
                throws Exception;
    }

    private static class Sabotage
    {
        private final String description;
        private final String record;

        Sabotage( String description, String record )
        {
            this.description = description;
            this.record = record;
        }

        String description()
        {
            return description;
        }

        /**
         * For grepping on in the inconsistency report
         */
        String record()
        {
            return record;
        }
    }
}
