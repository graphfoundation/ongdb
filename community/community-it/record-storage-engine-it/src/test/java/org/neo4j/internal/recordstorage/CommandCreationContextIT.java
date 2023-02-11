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
package org.neo4j.internal.recordstorage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.ToLongFunction;
import java.util.stream.Stream;

import org.neo4j.configuration.GraphDatabaseInternalSettings;
import org.neo4j.graphdb.Transaction;
import org.neo4j.internal.id.IdGenerator;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.io.pagecache.tracing.cursor.PageCursorTracer;
import org.neo4j.kernel.impl.store.CommonAbstractStore;
import org.neo4j.kernel.impl.store.NeoStores;
import org.neo4j.kernel.internal.GraphDatabaseAPI;
import org.neo4j.lock.LockTracer;
import org.neo4j.memory.LocalMemoryTracker;
import org.neo4j.storageengine.api.CommandCreationContext;
import org.neo4j.storageengine.api.cursor.StoreCursors;
import org.neo4j.test.TestDatabaseManagementServiceBuilder;
import org.neo4j.test.extension.DbmsExtension;
import org.neo4j.test.extension.ExtensionCallback;
import org.neo4j.test.extension.Inject;
import org.neo4j.values.storable.Values;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.mockito.Mockito.mock;
import static org.neo4j.graphdb.RelationshipType.withName;
import static org.neo4j.internal.recordstorage.FlatRelationshipModifications.singleCreate;
import static org.neo4j.internal.recordstorage.RecordStorageCommandReaderFactory.LATEST_LOG_SERIALIZATION;
import static org.neo4j.io.pagecache.context.CursorContext.NULL;
import static org.neo4j.lock.ResourceLocker.IGNORE;
import static org.neo4j.memory.EmptyMemoryTracker.INSTANCE;

@DbmsExtension( configurationCallback = "configure" )
public class CommandCreationContextIT
{
    @Inject
    private GraphDatabaseAPI databaseAPI;
    @Inject
    private RecordStorageEngine storageEngine;
    @Inject
    private PageCacheTracer pageCacheTracer;
    private NeoStores neoStores;
    private long nodeId;
    private long relationshipId;

    @ExtensionCallback
    void configure( TestDatabaseManagementServiceBuilder builder )
    {
        builder.setConfig( GraphDatabaseInternalSettings.storage_engine, RecordStorageEngineFactory.NAME );
    }

    @BeforeEach
    void setUp()
    {
        neoStores = storageEngine.testAccessNeoStores();
        try ( Transaction tx = databaseAPI.beginTx() )
        {
            var startNode = tx.createNode();
            var endNode = tx.createNode();
            nodeId = startNode.getId();
            relationshipId = startNode.createRelationshipTo( endNode, withName( "marker" ) ).getId();
            tx.commit();
        }
    }

    @ParameterizedTest
    @MethodSource( "idReservation" )
    void trackPageCacheAccessOnIdReservation( Function<NeoStores, CommonAbstractStore<?,?>> storeProvider,
            ToLongFunction<CommandCreationContext> idReservation )
    {
        try ( var cursorContext = new CursorContext( pageCacheTracer.createPageCursorTracer( "trackPageCacheAccessOnIdReservation" ) ) )
        {
            prepareIdGenerator( storeProvider.apply( neoStores ).getIdGenerator() );
            try ( var creationContext = storageEngine.newCommandCreationContext( INSTANCE ) )
            {
                creationContext.initialize( cursorContext, StoreCursors.NULL );
                idReservation.applyAsLong( creationContext );
                assertThat( cursorContext.getCursorTracer().pins() ).isEqualTo( 1 );
            }
        }
    }

    @ParameterizedTest
    @MethodSource( "commandOperations" )
    void trackMemoryAllocationInCommandCreationContext( BiConsumer<TransactionRecordState, ContextHolder> operation )
    {
        var memoryTracker = new LocalMemoryTracker();
        try ( var commandCreationContext = storageEngine.newCommandCreationContext( memoryTracker );
              var storeCursors = storageEngine.createStorageCursors( NULL ) )
        {
            var integrityValidator = mock( IntegrityValidator.class );
            commandCreationContext.initialize( NULL, storeCursors );
            var recordState = commandCreationContext.createTransactionRecordState( integrityValidator, 1, IGNORE, LockTracer.NONE,
                    LATEST_LOG_SERIALIZATION, RecordAccess.LoadMonitor.NULL_MONITOR );
            long heapBefore = memoryTracker.estimatedHeapMemory();
            for ( int i = 1; i < 1024; i++ )
            {
                operation.accept( recordState, new ContextHolder( nodeId, relationshipId, i ) );
            }
            assertThat( heapBefore ).isLessThan( memoryTracker.estimatedHeapMemory() );
            assertThat( memoryTracker.usedNativeMemory() ).isZero();
        }
    }

    private static Stream<BiConsumer<TransactionRecordState, ContextHolder>> commandOperations()
    {
        return Stream.of( ( state, context ) -> state.nodeCreate( context.getIteration() ),
                ( state, context ) -> state.createRelationshipTypeToken( "type" + context.getIteration(), context.getIteration(), false ),
                ( state, context ) -> state.createLabelToken( "label" + context.getIteration(), context.getIteration(), false ),
                ( state, context ) -> state.createPropertyKeyToken( "key" + context.getIteration(), context.getIteration(), false ),
                ( state, context ) -> state.relModify( singleCreate( context.getIteration(), context.getIteration(), context.getExistentNodeId(),
                        context.getExistentNodeId() ) ),
                ( state, context ) -> state.relAddProperty( context.getExistentRelId(), context.getIteration(), Values.of( context.getIteration() ) ),
                ( state, context ) -> state.nodeAddProperty( context.existentNodeId, context.getIteration(), Values.of( context.getIteration() ) ) );
    }

    private static Stream<Arguments> idReservation()
    {
        return Stream.of(
                arguments( (Function<NeoStores,CommonAbstractStore<?,?>>) NeoStores::getSchemaStore,
                        (ToLongFunction<CommandCreationContext>) CommandCreationContext::reserveSchema ),

                arguments( (Function<NeoStores,CommonAbstractStore<?,?>>) NeoStores::getNodeStore,
                        (ToLongFunction<CommandCreationContext>) CommandCreationContext::reserveNode ),

                arguments( (Function<NeoStores,CommonAbstractStore<?,?>>) NeoStores::getRelationshipStore,
                        (ToLongFunction<CommandCreationContext>) commandCreationContext -> commandCreationContext.reserveRelationship( -1 ) ),

                arguments( (Function<NeoStores,CommonAbstractStore<?,?>>) NeoStores::getLabelTokenStore,
                        (ToLongFunction<CommandCreationContext>) CommandCreationContext::reserveLabelTokenId ),

                arguments( (Function<NeoStores,CommonAbstractStore<?,?>>) NeoStores::getPropertyKeyTokenStore,
                        (ToLongFunction<CommandCreationContext>) CommandCreationContext::reservePropertyKeyTokenId ),

                arguments( (Function<NeoStores,CommonAbstractStore<?,?>>) NeoStores::getRelationshipTypeTokenStore,
                        (ToLongFunction<CommandCreationContext>) CommandCreationContext::reserveRelationshipTypeTokenId )
        );
    }

    private static void assertCursorZero( CursorContext cursorContext )
    {
        PageCursorTracer cursorTracer = cursorContext.getCursorTracer();
        assertThat( cursorTracer.pins() ).isZero();
        assertThat( cursorTracer.unpins() ).isZero();
        assertThat( cursorTracer.hits() ).isZero();
    }

    private static void prepareIdGenerator( IdGenerator idGenerator )
    {
        try ( var marker = idGenerator.marker( NULL ) )
        {
            marker.markDeleted( 1L );
        }
        idGenerator.clearCache( NULL );
    }

    private static class ContextHolder
    {
        private final long existentNodeId;
        private final long existentRelId;
        private final int iteration;

        ContextHolder( long existentNodeId, long existentRelId, int iteration )
        {
            this.existentNodeId = existentNodeId;
            this.existentRelId = existentRelId;
            this.iteration = iteration;
        }

        public long getExistentNodeId()
        {
            return existentNodeId;
        }

        public long getExistentRelId()
        {
            return existentRelId;
        }

        public int getIteration()
        {
            return iteration;
        }
    }
}
