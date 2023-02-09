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
package org.neo4j.kernel.recovery;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.neo4j.counts.CountsAccessor;
import org.neo4j.exceptions.KernelException;
import org.neo4j.internal.diagnostics.DiagnosticsLogger;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.KernelVersion;
import org.neo4j.kernel.impl.api.InjectedNLIUpgradeCallback;
import org.neo4j.kernel.impl.store.stats.StoreEntityCounters;
import org.neo4j.kernel.impl.transaction.CommittedTransactionRepresentation;
import org.neo4j.kernel.impl.transaction.TransactionRepresentation;
import org.neo4j.kernel.impl.transaction.log.PhysicalTransactionRepresentation;
import org.neo4j.kernel.impl.transaction.log.entry.LogEntryCommit;
import org.neo4j.kernel.impl.transaction.log.entry.LogEntryStart;
import org.neo4j.kernel.lifecycle.Lifecycle;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.lock.LockGroup;
import org.neo4j.lock.LockService;
import org.neo4j.lock.LockTracer;
import org.neo4j.lock.LockType;
import org.neo4j.lock.ResourceLocker;
import org.neo4j.logging.Log;
import org.neo4j.memory.MemoryTracker;
import org.neo4j.storageengine.api.CommandCreationContext;
import org.neo4j.storageengine.api.CommandStream;
import org.neo4j.storageengine.api.CommandsToApply;
import org.neo4j.storageengine.api.IndexUpdateListener;
import org.neo4j.storageengine.api.MetadataProvider;
import org.neo4j.storageengine.api.StorageCommand;
import org.neo4j.storageengine.api.StorageEngine;
import org.neo4j.storageengine.api.StorageLocks;
import org.neo4j.storageengine.api.StorageReader;
import org.neo4j.storageengine.api.StoreFileMetadata;
import org.neo4j.storageengine.api.StoreId;
import org.neo4j.storageengine.api.TransactionApplicationMode;
import org.neo4j.storageengine.api.cursor.StoreCursors;
import org.neo4j.storageengine.api.txstate.ReadableTransactionState;
import org.neo4j.storageengine.api.txstate.TxStateVisitor;
import org.neo4j.test.Barrier;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.neo4j.kernel.impl.transaction.log.LogPosition.UNSPECIFIED;
import static org.neo4j.storageengine.api.TransactionApplicationMode.RECOVERY;

class ParallelRecoveryVisitorTest
{
    @Test
    void shouldApplyUnrelatedInParallel() throws Exception
    {
        // given
        Barrier.Control barrier = new Barrier.Control();
        RecoveryControllableStorageEngine storageEngine = new RecoveryControllableStorageEngine()
        {
            @Override
            public void apply( CommandsToApply batch, TransactionApplicationMode mode ) throws Exception
            {
                long txId = idOf( batch );
                if ( txId == 2 )
                {
                    barrier.reached();
                }
                else if ( txId == 3 )
                {
                    barrier.awaitUninterruptibly();
                }
                super.apply( batch, mode );
                if ( txId == 3 )
                {
                    barrier.release();
                }
            }
        };

        // when
        try ( ParallelRecoveryVisitor visitor = new ParallelRecoveryVisitor( storageEngine, RECOVERY, PageCacheTracer.NULL, "test", 2 ) )
        {
            visitor.visit( tx( 2, commandsRelatedToNode( 99 ) ) );
            visitor.visit( tx( 3, commandsRelatedToNode( 999 ) ) );
        }

        // then
        assertThat( storageEngine.lockOrder() ).isEqualTo( new long[]{2, 3} );
        assertThat( storageEngine.applyOrder() ).isEqualTo( new long[]{3, 2} );
    }

    @Test
    void shouldApplyRelatedToSameNodeInSequence() throws Exception
    {
        // given
        RecoveryControllableStorageEngine storageEngine = new RecoveryControllableStorageEngine()
        {
            @Override
            public void apply( CommandsToApply batch, TransactionApplicationMode mode ) throws Exception
            {
                if ( idOf( batch ) == 2 )
                {
                    // Just make it very likely that, if the locking wouldn't work as expected, then the test will fail,
                    // but the test will not be flaky if the visitor works as expected.
                    Thread.sleep( 50 );
                }
                super.apply( batch, mode );
            }
        };

        // when
        try ( ParallelRecoveryVisitor visitor = new ParallelRecoveryVisitor( storageEngine, RECOVERY, PageCacheTracer.NULL, "test", 2 ) )
        {
            visitor.visit( tx( 2, commandsRelatedToNode( 99 ) ) );
            visitor.visit( tx( 3, commandsRelatedToNode( 99 ) ) );
        }

        // then
        assertThat( storageEngine.lockOrder() ).isEqualTo( new long[]{2, 3} );
        assertThat( storageEngine.applyOrder() ).isEqualTo( new long[]{2, 3} );
    }

    @Test
    void shouldApplyUnrelatedInParallelToRelatedInSequence() throws Exception
    {
        // given
        Barrier.Control barrier = new Barrier.Control();
        RecoveryControllableStorageEngine storageEngine = new RecoveryControllableStorageEngine()
        {
            @Override
            public void lockRecoveryCommands( CommandStream commands, LockService lockService, LockGroup lockGroup, TransactionApplicationMode mode )
            {
                if ( idOf( commands ) == 5 )
                {
                    barrier.release();
                }
                super.lockRecoveryCommands( commands, lockService, lockGroup, RECOVERY );
            }

            @Override
            public void apply( CommandsToApply batch, TransactionApplicationMode mode ) throws Exception
            {
                long txId = idOf( batch );
                if ( txId > 2 )
                {
                    barrier.awaitUninterruptibly();
                }
                super.apply( batch, mode );
                if ( txId == 2 )
                {
                    barrier.reached();
                }
            }
        };

        // when
        try ( ParallelRecoveryVisitor visitor = new ParallelRecoveryVisitor( storageEngine, RECOVERY, PageCacheTracer.NULL, "test", 2 ) )
        {
            visitor.visit( tx( 2, commandsRelatedToNode( 99 ) ) );
            visitor.visit( tx( 3, commandsRelatedToNode( 999 ) ) );
            visitor.visit( tx( 4, commandsRelatedToNode( 9999 ) ) );
            visitor.visit( tx( 5, commandsRelatedToNode( 99 ) ) );
        }

        // then
        assertThat( storageEngine.lockOrder() ).isEqualTo( new long[]{2, 3, 4, 5} );
        long[] applyOrder = storageEngine.applyOrder();
        assertThat( applyOrder[0] ).isEqualTo( 2 );
        assertThat( applyOrder[applyOrder.length - 1] ).isEqualTo( 5 );
    }

    @Test
    void shouldPropagateApplyFailureOnVisit()
    {
        // given
        String failure = "Deliberate failure applying transaction";
        RecoveryControllableStorageEngine storageEngine = new RecoveryControllableStorageEngine()
        {
            @Override
            public void apply( CommandsToApply batch, TransactionApplicationMode mode ) throws Exception
            {
                super.apply( batch, mode );
                throw new Exception( failure );
            }
        };

        // when
        try ( ParallelRecoveryVisitor visitor = new ParallelRecoveryVisitor( storageEngine, RECOVERY, PageCacheTracer.NULL, "test", 2 ) )
        {
            assertThatThrownBy( () ->
            {
                for ( long txId = 2; txId < 100; txId++ )
                {
                    visitor.visit( tx( txId, commandsRelatedToNode( 99 ) ) );
                    Thread.sleep( 50 );
                }
            } ).getCause().hasMessageContaining( failure );
        }
        catch ( Exception e )
        {
            // The failure will also be thrown on close, but ignore that in this test
        }
    }

    @Test
    void shouldPropagateApplyFailureOnClose() throws Exception
    {
        // given
        String failure = "Deliberate failure applying transaction";
        RecoveryControllableStorageEngine storageEngine = new RecoveryControllableStorageEngine()
        {
            @Override
            public void apply( CommandsToApply batch, TransactionApplicationMode mode ) throws Exception
            {
                super.apply( batch, mode );
                throw new Exception( failure );
            }
        };

        // when
        ParallelRecoveryVisitor visitor = new ParallelRecoveryVisitor( storageEngine, RECOVERY, PageCacheTracer.NULL, "test", 2 );
        visitor.visit( tx( 2, commandsRelatedToNode( 99 ) ) );
        assertThatThrownBy( visitor::close ).getCause().hasMessageContaining( failure );
    }

    private CommittedTransactionRepresentation tx( long txId, List<StorageCommand> commands )
    {
        commands.forEach( cmd -> ((RecoveryTestBaseCommand) cmd).txId = txId );
        LogEntryStart startEntry = new LogEntryStart( 0, 0, 0, new byte[0], UNSPECIFIED );
        TransactionRepresentation txRepresentation = new PhysicalTransactionRepresentation( commands );
        LogEntryCommit commitEntry = new LogEntryCommit( txId, 0, 0 );
        return new CommittedTransactionRepresentation( startEntry, txRepresentation, commitEntry );
    }

    private List<StorageCommand> commandsRelatedToNode( long nodeId )
    {
        List<StorageCommand> commands = new ArrayList<>();
        commands.add( new CommandRelatedToNode( nodeId ) );
        return commands;
    }

    private boolean hasId( CommandStream commands, long txId )
    {
        return idOf( commands ) == txId;
    }

    private static long idOf( CommandStream commands )
    {
        return ((RecoveryTestBaseCommand) commands.iterator().next()).txId;
    }

    private abstract static class RecoveryTestBaseCommand implements StorageCommand
    {
        // Tag the commands with txId too to simplify test code and assertions
        long txId;

        @Override
        public void serialize( WritableChannel channel ) throws IOException
        {
            // not needed
        }

        @Override
        public KernelVersion version()
        {
            return KernelVersion.LATEST;
        }

        abstract void lock( LockService lockService, LockGroup lockGroup );
    }

    private static class CommandRelatedToNode extends RecoveryTestBaseCommand
    {
        final long nodeId;

        CommandRelatedToNode( long nodeId )
        {
            this.nodeId = nodeId;
        }

        @Override
        void lock( LockService lockService, LockGroup lockGroup )
        {
            lockGroup.add( lockService.acquireNodeLock( nodeId, LockType.EXCLUSIVE ) );
        }
    }

    private static class RecoveryControllableStorageEngine extends LifecycleAdapter implements StorageEngine
    {
        private final long[] lockOrder = new long[100];
        private final long[] applyOrder = new long[100];
        private final AtomicInteger lockOrderCursor = new AtomicInteger();
        private final AtomicInteger applyOrderCursor = new AtomicInteger();

        @Override
        public void lockRecoveryCommands( CommandStream commands, LockService lockService, LockGroup lockGroup, TransactionApplicationMode mode )
        {
            commands.forEach( cmd -> ((RecoveryTestBaseCommand) cmd).lock( lockService, lockGroup ) );
            lockOrder[lockOrderCursor.getAndIncrement()] = idOf( commands );
        }

        @Override
        public void apply( CommandsToApply batch, TransactionApplicationMode mode ) throws Exception
        {
            applyOrder[applyOrderCursor.getAndIncrement()] = idOf( batch );
        }

        long[] lockOrder()
        {
            return Arrays.copyOf( lockOrder, lockOrderCursor.get() );
        }

        long[] applyOrder()
        {
            return Arrays.copyOf( applyOrder, applyOrderCursor.get() );
        }

        // vvv these methods are not used by the recovery visitor vvv

        @Override
        public CommandCreationContext newCommandCreationContext( MemoryTracker memoryTracker )
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public StoreCursors createStorageCursors( CursorContext initialContext )
        {
            return StoreCursors.NULL;
        }

        @Override
        public StorageLocks createStorageLocks( ResourceLocker locker )
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public void addIndexUpdateListener( IndexUpdateListener indexUpdateListener )
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public void createCommands( Collection<StorageCommand> target, ReadableTransactionState state, StorageReader storageReader,
                CommandCreationContext creationContext, ResourceLocker locks, LockTracer lockTracer, long lastTransactionIdWhenStarted,
                TxStateVisitor.Decorator additionalTxStateVisitor, CursorContext cursorContext, StoreCursors storeCursors, MemoryTracker memoryTracker )
                throws KernelException
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public List<StorageCommand> createUpgradeCommands( KernelVersion versionToUpgradeTo,
                InjectedNLIUpgradeCallback injectedNLIUpgradeCallback )
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public void flushAndForce( CursorContext cursorTracer ) throws IOException
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public void dumpDiagnostics( Log errorLog, DiagnosticsLogger diagnosticsLog )
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public void forceClose()
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public void listStorageFiles( Collection<StoreFileMetadata> atomic, Collection<StoreFileMetadata> replayable )
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public StoreId getStoreId()
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public Lifecycle schemaAndTokensLifecycle()
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public MetadataProvider metadataProvider()
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public CountsAccessor countsAccessor()
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public StorageReader newReader()
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public StoreEntityCounters storeEntityCounters()
        {
            throw new UnsupportedOperationException();
        }
    }
}
