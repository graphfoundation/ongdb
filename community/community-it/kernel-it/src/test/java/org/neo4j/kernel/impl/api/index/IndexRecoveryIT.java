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
package org.neo4j.kernel.impl.api.index;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;

import org.neo4j.common.TokenNameLookup;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.schema.IndexDefinition;
import org.neo4j.graphdb.schema.Schema;
import org.neo4j.internal.kernel.api.InternalIndexState;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.internal.schema.SchemaDescriptors;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.fs.FileUtils;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.kernel.api.KernelTransaction;
import org.neo4j.kernel.api.index.IndexAccessor;
import org.neo4j.kernel.api.index.IndexPopulator;
import org.neo4j.kernel.api.index.IndexProvider;
import org.neo4j.kernel.api.index.IndexSample;
import org.neo4j.kernel.api.index.IndexUpdater;
import org.neo4j.kernel.extension.ExtensionFactory;
import org.neo4j.kernel.impl.coreapi.InternalTransaction;
import org.neo4j.kernel.impl.index.schema.CollectingIndexUpdater;
import org.neo4j.kernel.impl.transaction.log.checkpoint.CheckPointer;
import org.neo4j.kernel.impl.transaction.log.checkpoint.SimpleTriggerInfo;
import org.neo4j.kernel.impl.transaction.log.files.LogFiles;
import org.neo4j.kernel.impl.transaction.log.rotation.LogRotation;
import org.neo4j.kernel.impl.transaction.tracing.LogAppendEvent;
import org.neo4j.kernel.internal.GraphDatabaseAPI;
import org.neo4j.kernel.recovery.Recovery;
import org.neo4j.kernel.recovery.RecoveryMonitor;
import org.neo4j.monitoring.Monitors;
import org.neo4j.storageengine.api.IndexEntryUpdate;
import org.neo4j.storageengine.migration.StoreMigrationParticipant;
import org.neo4j.test.TestDatabaseManagementServiceBuilder;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.Neo4jLayoutExtension;
import org.neo4j.test.utils.TestDirectory;
import org.neo4j.values.storable.Values;

import static java.util.concurrent.Executors.newSingleThreadExecutor;
import static java.util.concurrent.TimeUnit.MINUTES;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.neo4j.configuration.Config.defaults;
import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;
import static org.neo4j.configuration.GraphDatabaseSettings.default_schema_provider;
import static org.neo4j.graphdb.Label.label;
import static org.neo4j.internal.kernel.api.InternalIndexState.ONLINE;
import static org.neo4j.kernel.impl.api.index.SchemaIndexTestHelper.singleInstanceIndexProviderFactory;
import static org.neo4j.kernel.impl.api.index.TestIndexProviderDescriptor.PROVIDER_DESCRIPTOR;
import static org.neo4j.memory.EmptyMemoryTracker.INSTANCE;

@Neo4jLayoutExtension
class IndexRecoveryIT
{
    @Inject
    private TestDirectory testDirectory;
    @Inject
    private DatabaseLayout databaseLayout;
    private GraphDatabaseAPI db;
    private final IndexProvider mockedIndexProvider = mock( IndexProvider.class );
    private final ExtensionFactory<?> mockedIndexProviderFactory =
            singleInstanceIndexProviderFactory( PROVIDER_DESCRIPTOR.getKey(), mockedIndexProvider );
    private final String key = "number_of_bananas_owned";
    private final Label myLabel = label( "MyLabel" );
    private final Monitors monitors = new Monitors();
    private DatabaseManagementService managementService;
    private ExecutorService executor;
    private final Object lock = new Object();

    @BeforeEach
    void setUp()
    {
        executor = newSingleThreadExecutor();
        when( mockedIndexProvider.getProviderDescriptor() ).thenReturn( PROVIDER_DESCRIPTOR );
        when( mockedIndexProvider.storeMigrationParticipant( any( FileSystemAbstraction.class ), any( PageCache.class ), any() ) )
                .thenReturn( StoreMigrationParticipant.NOT_PARTICIPATING );
        when( mockedIndexProvider.completeConfiguration( any( IndexDescriptor.class ) ) ).then( inv -> inv.getArgument( 0 ) );
    }

    @AfterEach
    void after()
    {
        executor.shutdown();
        if ( db != null )
        {
            managementService.shutdown();
        }
    }

    @Test
    void shouldBeAbleToRecoverInTheMiddleOfPopulatingAnIndexWhereLogHasRotated() throws Exception
    {
        // Given
        startDb();

        Semaphore populationSemaphore = new Semaphore( 0 );
        Future<Void> killFuture;
        try
        {
            when( mockedIndexProvider
                    .getPopulator( any( IndexDescriptor.class ), any( IndexSamplingConfig.class ), any(), any(), any( TokenNameLookup.class ) ) ).thenReturn(
                    indexPopulatorWithControlledCompletionTiming( populationSemaphore ) );
            createSomeData();
            createIndex( myLabel );

            // And Given
            killFuture = killDbInSeparateThread();
            int iterations = 0;
            do
            {
                rotateLogsAndCheckPoint();
                Thread.sleep( 10 );
            } while ( iterations++ < 100 && !killFuture.isDone() );
        }
        finally
        {
            populationSemaphore.release();
        }

        killFuture.get();

        when( mockedIndexProvider.getInitialState( any( IndexDescriptor.class ), any( CursorContext.class ) ) ).thenReturn( InternalIndexState.POPULATING );
        Semaphore recoverySemaphore = new Semaphore( 0 );
        try
        {
            when( mockedIndexProvider
                    .getPopulator( any( IndexDescriptor.class ), any( IndexSamplingConfig.class ), any(), any(), any( TokenNameLookup.class ) ) ).thenReturn(
                    indexPopulatorWithControlledCompletionTiming( recoverySemaphore ) );
            boolean recoveryRequired = Recovery.isRecoveryRequired( testDirectory.getFileSystem(), databaseLayout, defaults(), INSTANCE );
            monitors.addMonitorListener( new MyRecoveryMonitor( recoverySemaphore ) );
            // When
            startDb();

            try ( Transaction transaction = db.beginTx() )
            {
                assertThat( transaction.schema().getIndexes( myLabel ) ).hasSize( 1 );
                assertThat( transaction.schema().getIndexes( myLabel ) )
                        .extracting( i -> transaction.schema().getIndexState( i ) ).containsOnly( Schema.IndexState.POPULATING );
            }
            // in case if kill was not that fast and killed db after flush there will be no need to do recovery and
            // we will not gonna need to get index populators during recovery index service start
            verify( mockedIndexProvider, times( recoveryRequired ? 3 : 2 ) ).getPopulator( any( IndexDescriptor.class ),
                    any( IndexSamplingConfig.class ), any(), any(), any( TokenNameLookup.class ) );
            verify( mockedIndexProvider, never() )
                    .getOnlineAccessor( any( IndexDescriptor.class ), any( IndexSamplingConfig.class ), any( TokenNameLookup.class ) );
        }
        finally
        {
            recoverySemaphore.release();
        }
    }

    @Test
    void shouldBeAbleToRecoverInTheMiddleOfPopulatingAnIndex() throws IOException, ExecutionException, InterruptedException
    {
        // Given
        Semaphore populationSemaphore = new Semaphore( 1 );
        try
        {
            startDb();

            when( mockedIndexProvider
                    .getPopulator( any( IndexDescriptor.class ), any( IndexSamplingConfig.class ), any(), any(), any( TokenNameLookup.class ) ) ).thenReturn(
                    indexPopulatorWithControlledCompletionTiming( populationSemaphore ) );
            createSomeData();
            createIndex( myLabel );

            // And Given
            Future<Void> killFuture = killDbInSeparateThread();
            populationSemaphore.release();
            killFuture.get();
        }
        finally
        {
            populationSemaphore.release();
        }

        // When
        when( mockedIndexProvider.getInitialState( any( IndexDescriptor.class ), any( CursorContext.class ) ) ).thenReturn( InternalIndexState.POPULATING );
        populationSemaphore = new Semaphore( 1 );
        try
        {
            when( mockedIndexProvider
                    .getPopulator( any( IndexDescriptor.class ), any( IndexSamplingConfig.class ), any(), any(), any( TokenNameLookup.class ) ) ).thenReturn(
                    indexPopulatorWithControlledCompletionTiming( populationSemaphore ) );
            startDb();

            try ( Transaction transaction = db.beginTx() )
            {
                assertThat( transaction.schema().getIndexes( myLabel ) ).hasSize( 1 );
                assertThat( transaction.schema().getIndexes( myLabel ) )
                        .extracting( i -> transaction.schema().getIndexState( i ) ).containsOnly( Schema.IndexState.POPULATING );
            }
            verify( mockedIndexProvider, times( 3 ) ).getPopulator( any( IndexDescriptor.class ), any( IndexSamplingConfig.class ),
                    any(), any(), any( TokenNameLookup.class ) );
            verify( mockedIndexProvider, never() )
                    .getOnlineAccessor( any( IndexDescriptor.class ), any( IndexSamplingConfig.class ), any( TokenNameLookup.class ) );
        }
        finally
        {
            populationSemaphore.release();
        }
    }

    @Test
    void shouldBeAbleToRecoverAndUpdateOnlineIndex() throws Exception
    {
        // Given
        startDb();

        IndexPopulator populator = mock( IndexPopulator.class );
        when( mockedIndexProvider
                .getPopulator( any( IndexDescriptor.class ), any( IndexSamplingConfig.class ), any(), any(), any( TokenNameLookup.class ) ) )
                .thenReturn( populator );
        when( populator.sample( any( CursorContext.class ) ) ).thenReturn( new IndexSample() );
        IndexAccessor mockedAccessor = mock( IndexAccessor.class );
        when( mockedAccessor.newUpdater( any( IndexUpdateMode.class ), any( CursorContext.class ) ) ).thenReturn( SwallowingIndexUpdater.INSTANCE );
        when( mockedIndexProvider.getOnlineAccessor( any( IndexDescriptor.class ), any( IndexSamplingConfig.class ), any( TokenNameLookup.class ) ) )
                .thenReturn( mockedAccessor );
        createIndexAndAwaitPopulation( myLabel );
        // rotate logs
        rotateLogsAndCheckPoint();
        // make updates
        Set<IndexEntryUpdate<?>> expectedUpdates = createSomeBananas( myLabel );

        // And Given
        killDb();
        when( mockedIndexProvider.getInitialState( any( IndexDescriptor.class ), any( CursorContext.class ) ) ).thenReturn( ONLINE );
        GatheringIndexWriter writer = new GatheringIndexWriter();
        when( mockedIndexProvider.getOnlineAccessor( any( IndexDescriptor.class ), any( IndexSamplingConfig.class ), any( TokenNameLookup.class ) ) )
                .thenReturn( writer );

        // When
        startDb();

        // Then
        try ( Transaction transaction = db.beginTx() )
        {
            assertThat( transaction.schema().getIndexes( myLabel ) ).hasSize( 1 );
            assertThat( transaction.schema().getIndexes( myLabel ) )
                    .extracting( i -> transaction.schema().getIndexState( i ) ).containsOnly( Schema.IndexState.ONLINE );
        }
        verify( mockedIndexProvider )
                .getPopulator( any( IndexDescriptor.class ), any( IndexSamplingConfig.class ), any(), any(), any( TokenNameLookup.class ) );
        int onlineAccessorInvocationCount = 3; // once when we create the index, and once when we restart the db
        verify( mockedIndexProvider, times( onlineAccessorInvocationCount ) )
                .getOnlineAccessor( any( IndexDescriptor.class ), any( IndexSamplingConfig.class ), any( TokenNameLookup.class ) );
        assertEquals( expectedUpdates, writer.batchedUpdates );
    }

    @Test
    void shouldKeepFailedIndexesAsFailedAfterRestart() throws Exception
    {
        // Given
        IndexPopulator indexPopulator = mock( IndexPopulator.class );
        when( mockedIndexProvider.getPopulator( any( IndexDescriptor.class ), any( IndexSamplingConfig.class ), any(), any(), any( TokenNameLookup.class ) ) )
                .thenReturn( indexPopulator );
        IndexAccessor indexAccessor = mock( IndexAccessor.class );
        when( mockedIndexProvider.getOnlineAccessor( any( IndexDescriptor.class ), any( IndexSamplingConfig.class ), any( TokenNameLookup.class ) ) )
                .thenReturn( indexAccessor );
        startDb();
        createIndex( myLabel );
        rotateLogsAndCheckPoint();

        // And Given
        killDb();
        when( mockedIndexProvider.getInitialState( any( IndexDescriptor.class ), any( CursorContext.class ) ) ).thenReturn( InternalIndexState.FAILED );

        // When
        startDb();

        // Then
        try ( Transaction transaction = db.beginTx() )
        {
            assertThat( transaction.schema().getIndexes( myLabel ) ).hasSize( 1 );
            assertThat( transaction.schema().getIndexes( myLabel ) )
                    .extracting( i -> transaction.schema().getIndexState( i ) ).containsOnly( Schema.IndexState.FAILED );
        }
        verify( mockedIndexProvider )
                .getPopulator( any( IndexDescriptor.class ), any( IndexSamplingConfig.class ), any(), any(), any( TokenNameLookup.class ) );
        verify( mockedIndexProvider ).getMinimalIndexAccessor( any( IndexDescriptor.class ) );
    }

    private void startDb()
    {
        if ( db != null )
        {
            managementService.shutdown();
        }

        managementService = new TestDatabaseManagementServiceBuilder( testDirectory.homePath() )
                .setFileSystem( testDirectory.getFileSystem() )
                .addExtension( mockedIndexProviderFactory )
                .noOpSystemGraphInitializer()
                .setMonitors( monitors )
                .setConfig( default_schema_provider, PROVIDER_DESCRIPTOR.name() )
                .build();

        db = (GraphDatabaseAPI) managementService.database( DEFAULT_DATABASE_NAME );
    }

    private void killDb()
    {
        if ( db != null )
        {
            Path snapshotDir = testDirectory.directory( "snapshot" );
            synchronized ( lock )
            {
                snapshotFs( snapshotDir );
            }
            managementService.shutdown();
            restoreSnapshot( snapshotDir );
        }
    }

    private void snapshotFs( Path snapshotDir )
    {
        try
        {
            DatabaseLayout layout = databaseLayout;
            FileUtils.copyDirectory( layout.databaseDirectory(), snapshotDir.resolve( "data" ) );
            FileUtils.copyDirectory( layout.getTransactionLogsDirectory(), snapshotDir.resolve( "transactions" ) );
        }
        catch ( IOException e )
        {
            throw new RuntimeException( e );
        }
    }

    private void restoreSnapshot( Path snapshotDir )
    {
        try
        {
            DatabaseLayout layout = databaseLayout;
            FileUtils.deleteDirectory( layout.databaseDirectory() );
            FileUtils.deleteDirectory( layout.getTransactionLogsDirectory() );
            FileUtils.copyDirectory( snapshotDir.resolve( "data" ), layout.databaseDirectory() );
            FileUtils.copyDirectory( snapshotDir.resolve( "transactions" ), layout.getTransactionLogsDirectory() );
            FileUtils.deleteDirectory( snapshotDir );
        }
        catch ( IOException e )
        {
            throw new RuntimeException( e );
        }
    }

    private Future<Void> killDbInSeparateThread()
    {
        return executor.submit( () ->
        {
            killDb();
            return null;
        } );
    }

    private void rotateLogsAndCheckPoint() throws IOException
    {
        synchronized ( lock )
        {
            db.getDependencyResolver().resolveDependency( LogFiles.class ).getLogFile().getLogRotation().rotateLogFile( LogAppendEvent.NULL );
            db.getDependencyResolver().resolveDependency( CheckPointer.class ).forceCheckPoint( new SimpleTriggerInfo( "test" ) );
        }
    }

    private void createIndexAndAwaitPopulation( Label label )
    {
        IndexDefinition index = createIndex( label );
        try ( Transaction tx = db.beginTx() )
        {
            tx.schema().awaitIndexOnline( index, 1, MINUTES );
            tx.commit();
        }
    }

    private IndexDefinition createIndex( Label label )
    {
        try ( Transaction tx = db.beginTx() )
        {
            IndexDefinition index = tx.schema().indexFor( label ).on( key ).create();
            tx.commit();
            return index;
        }
    }

    private Set<IndexEntryUpdate<?>> createSomeBananas( Label label )
    {
        Set<IndexEntryUpdate<?>> updates = new HashSet<>();
        try ( Transaction tx = db.beginTx() )
        {
            KernelTransaction ktx = ((InternalTransaction) tx).kernelTransaction();

            int labelId = ktx.tokenRead().nodeLabel( label.name() );
            int propertyKeyId = ktx.tokenRead().propertyKey( key );
            var schemaDescriptor = SchemaDescriptors.forLabel( labelId, propertyKeyId );
            for ( int number : new int[]{4, 10} )
            {
                Node node = tx.createNode( label );
                node.setProperty( key, number );
                updates.add( IndexEntryUpdate.add( node.getId(), () -> schemaDescriptor, Values.of( number ) ) );
            }
            tx.commit();
            return updates;
        }
    }

    public static class GatheringIndexWriter extends IndexAccessor.Adapter
    {
        private final Set<IndexEntryUpdate<?>> regularUpdates = new HashSet<>();
        private final Set<IndexEntryUpdate<?>> batchedUpdates = new HashSet<>();

        @Override
        public IndexUpdater newUpdater( final IndexUpdateMode mode, CursorContext cursorContext )
        {
            return new CollectingIndexUpdater( updates ->
            {
                switch ( mode )
                {
                    case ONLINE:
                        regularUpdates.addAll( updates );
                        break;

                    case RECOVERY:
                        batchedUpdates.addAll( updates );
                        break;

                    default:
                        throw new UnsupportedOperationException();
                }
            } );
        }
    }

    private static IndexPopulator indexPopulatorWithControlledCompletionTiming( Semaphore semaphore )
    {
        return new IndexPopulator.Adapter()
        {
            @Override
            public void create()
            {
                try
                {
                    semaphore.acquire();
                }
                catch ( InterruptedException e )
                {
                    // fall through and return early
                }
                throw new RuntimeException( "this is expected" );
            }
        };
    }

    private static class MyRecoveryMonitor implements RecoveryMonitor
    {
        private final Semaphore recoverySemaphore;

        MyRecoveryMonitor( Semaphore recoverySemaphore )
        {
            this.recoverySemaphore = recoverySemaphore;
        }

        @Override
        public void recoveryCompleted( int numberOfRecoveredTransactions, long recoveryTimeInMilliseconds )
        {
            recoverySemaphore.release();
        }
    }

    private void createSomeData()
    {
        try ( Transaction tx = db.beginTx() )
        {
            tx.createNode();
            tx.commit();
        }
    }
}
