/*
 * Copyright (c) 2018-2020 "Graph Foundation,"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB Enterprise Edition. The included source
 * code can be redistributed and/or modified under the terms of the
 * GNU AFFERO GENERAL PUBLIC LICENSE Version 3
 * (http://www.fsf.org/licensing/licenses/agpl-3.0.html) as found
 * in the associated LICENSE.txt file.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 */
/*
 * Copyright (c) 2002-2018 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.causalclustering.core.state.machines;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

import org.neo4j.causalclustering.catchup.storecopy.LocalDatabase;
import org.neo4j.causalclustering.core.consensus.log.RaftLogCursor;
import org.neo4j.causalclustering.core.consensus.log.ReadableRaftLog;
import org.neo4j.causalclustering.core.replication.DistributedOperation;
import org.neo4j.causalclustering.core.replication.ReplicatedContent;
import org.neo4j.cursor.IOCursor;
import org.neo4j.graphdb.DependencyResolver;
import org.neo4j.internal.kernel.api.NamedToken;
import org.neo4j.kernel.impl.storageengine.impl.recordstorage.RecordStorageEngine;
import org.neo4j.kernel.impl.store.NeoStores;
import org.neo4j.kernel.impl.store.TokenStore;
import org.neo4j.kernel.impl.store.record.Record;
import org.neo4j.kernel.impl.store.record.RecordLoad;
import org.neo4j.kernel.impl.store.record.TokenRecord;
import org.neo4j.kernel.impl.transaction.CommittedTransactionRepresentation;
import org.neo4j.kernel.impl.transaction.command.Command;
import org.neo4j.kernel.impl.transaction.log.LogicalTransactionStore;
import org.neo4j.kernel.impl.transaction.log.TransactionIdStore;
import org.neo4j.storageengine.api.StorageEngine;
import org.neo4j.causalclustering.core.state.machines.dummy.DummyMachine;
import org.neo4j.causalclustering.core.state.machines.dummy.DummyRequest;
import org.neo4j.causalclustering.core.state.machines.tx.RecoverConsensusLogIndex;
import org.neo4j.causalclustering.core.state.snapshot.CoreStateType;
import org.neo4j.causalclustering.core.state.CommandDispatcher;
import org.neo4j.causalclustering.core.state.snapshot.CoreSnapshot;
import org.neo4j.causalclustering.core.state.Result;
import org.neo4j.causalclustering.core.state.machines.id.ReplicatedIdAllocationRequest;
import org.neo4j.causalclustering.core.state.machines.id.ReplicatedIdAllocationStateMachine;
import org.neo4j.causalclustering.core.state.machines.token.ReplicatedTokenRequest;
import org.neo4j.causalclustering.core.state.machines.token.ReplicatedTokenStateMachine;
import org.neo4j.causalclustering.core.state.machines.tx.ReplicatedTransaction;
import org.neo4j.causalclustering.core.state.machines.tx.ReplicatedTransactionStateMachine;
import org.neo4j.causalclustering.core.state.machines.locks.ReplicatedLockTokenRequest;
import org.neo4j.causalclustering.core.state.machines.locks.ReplicatedLockTokenStateMachine;
import org.neo4j.kernel.impl.api.TransactionCommitProcess;

import static java.lang.Math.max;
import static org.neo4j.graphdb.DependencyResolver.SelectionStrategy.ONLY;

public class CoreStateMachines
{
    private final ReplicatedTransactionStateMachine replicatedTxStateMachine;

    private final ReplicatedTokenStateMachine labelTokenStateMachine;
    private final ReplicatedTokenStateMachine relationshipTypeTokenStateMachine;
    private final ReplicatedTokenStateMachine propertyKeyTokenStateMachine;

    private final ReplicatedLockTokenStateMachine replicatedLockTokenStateMachine;
    private final ReplicatedIdAllocationStateMachine idAllocationStateMachine;

    private final DummyMachine benchmarkMachine;

    private final LocalDatabase localDatabase;
    private final RecoverConsensusLogIndex consensusLogIndexRecovery;

    private final CommandDispatcher dispatcher = new StateMachineCommandDispatcher();
    private volatile boolean runningBatch;

    CoreStateMachines(
            ReplicatedTransactionStateMachine replicatedTxStateMachine,
            ReplicatedTokenStateMachine labelTokenStateMachine,
            ReplicatedTokenStateMachine relationshipTypeTokenStateMachine,
            ReplicatedTokenStateMachine propertyKeyTokenStateMachine,
            ReplicatedLockTokenStateMachine replicatedLockTokenStateMachine,
            ReplicatedIdAllocationStateMachine idAllocationStateMachine,
            DummyMachine benchmarkMachine,
            LocalDatabase localDatabase,
            RecoverConsensusLogIndex consensusLogIndexRecovery )
    {
        this.replicatedTxStateMachine = replicatedTxStateMachine;
        this.labelTokenStateMachine = labelTokenStateMachine;
        this.relationshipTypeTokenStateMachine = relationshipTypeTokenStateMachine;
        this.propertyKeyTokenStateMachine = propertyKeyTokenStateMachine;
        this.replicatedLockTokenStateMachine = replicatedLockTokenStateMachine;
        this.idAllocationStateMachine = idAllocationStateMachine;
        this.benchmarkMachine = benchmarkMachine;
        this.localDatabase = localDatabase;
        this.consensusLogIndexRecovery = consensusLogIndexRecovery;
    }

    public CommandDispatcher commandDispatcher()
    {
        localDatabase.assertHealthy( IllegalStateException.class );
        assert !runningBatch;
        runningBatch = true;
        return dispatcher;
    }

    public long getLastAppliedIndex()
    {
        long lastAppliedLockTokenIndex = replicatedLockTokenStateMachine.lastAppliedIndex();
        long lastAppliedIdAllocationIndex = idAllocationStateMachine.lastAppliedIndex();
        return max( lastAppliedLockTokenIndex, lastAppliedIdAllocationIndex );
    }

    public void flush() throws IOException
    {
        assert !runningBatch;

        replicatedTxStateMachine.flush();

        labelTokenStateMachine.flush();
        relationshipTypeTokenStateMachine.flush();
        propertyKeyTokenStateMachine.flush();

        replicatedLockTokenStateMachine.flush();
        idAllocationStateMachine.flush();
    }

    public void addSnapshots( CoreSnapshot coreSnapshot )
    {
        assert !runningBatch;

        coreSnapshot.add( CoreStateType.ID_ALLOCATION, idAllocationStateMachine.snapshot() );
        coreSnapshot.add( CoreStateType.LOCK_TOKEN, replicatedLockTokenStateMachine.snapshot() );
        // transactions and tokens live in the store
    }

    public void installSnapshots( CoreSnapshot coreSnapshot )
    {
        assert !runningBatch;

        idAllocationStateMachine.installSnapshot( coreSnapshot.get( CoreStateType.ID_ALLOCATION ) );
        replicatedLockTokenStateMachine.installSnapshot( coreSnapshot.get( CoreStateType.LOCK_TOKEN ) );
        // transactions and tokens live in the store
    }

    public void installCommitProcess( TransactionCommitProcess localCommit )
    {
        assert !runningBatch;
        long lastAppliedIndex = consensusLogIndexRecovery.findLastAppliedIndex();

        replicatedTxStateMachine.installCommitProcess( localCommit, lastAppliedIndex );

        labelTokenStateMachine.installCommitProcess( localCommit, lastAppliedIndex );
        relationshipTypeTokenStateMachine.installCommitProcess( localCommit, lastAppliedIndex );
        propertyKeyTokenStateMachine.installCommitProcess( localCommit, lastAppliedIndex );
    }

    private static final long RAFT_LOG_BOOTSTRAP_WAIT_MILLIS = TimeUnit.SECONDS.toMillis( 30 );

    /**
     * Seed replicated token registries after store copy. Snapshot install skips the local raft log to the
     * copied index without retaining historical entries, so registries are rebuilt from the raft log when
     * it has caught up and from committed transaction-log token commands and readable on-disk slots.
     */
    public void bootstrapReplicatedTokensAfterStoreCopy( ReadableRaftLog raftLog, long snapshotPrevIndex,
            LocalDatabase localDatabase ) throws IOException, InterruptedException
    {
        waitForRaftLogThroughIndex( raftLog, snapshotPrevIndex );
        long raftScanLimit = snapshotPrevIndex < 0 ? raftLog.appendIndex()
                : Math.min( raftLog.appendIndex(), snapshotPrevIndex );
        bootstrapReplicatedTokensFromRaftLog( raftLog, raftScanLimit );
        bootstrapReplicatedTokensFromTxLog( localDatabase );
        bootstrapReplicatedTokensFromTokenStores( localDatabase );
    }

    private void bootstrapReplicatedTokensFromTokenStores( LocalDatabase localDatabase )
    {
        StorageEngine storageEngine =
                localDatabase.dataSource().getDependencyResolver().resolveDependency( StorageEngine.class, ONLY );
        if ( !(storageEngine instanceof RecordStorageEngine) )
        {
            return;
        }
        NeoStores neoStores = ((RecordStorageEngine) storageEngine).testAccessNeoStores();
        bootstrapStoreTokens( neoStores.getPropertyKeyTokenStore(), propertyKeyTokenStateMachine );
        bootstrapStoreTokens( neoStores.getLabelTokenStore(), labelTokenStateMachine );
        bootstrapStoreTokens( neoStores.getRelationshipTypeTokenStore(), relationshipTypeTokenStateMachine );
    }

    private static <RECORD extends TokenRecord> void bootstrapStoreTokens(
            TokenStore<RECORD> store, ReplicatedTokenStateMachine stateMachine )
    {
        for ( NamedToken token : store.getTokens() )
        {
            stateMachine.registerTokenIfAbsent( token );
        }
        RECORD probe = store.newRecord();
        for ( long id = 0, highId = store.getHighId(); id < highId; id++ )
        {
            if ( !store.getRecord( id, probe, RecordLoad.CHECK ).inUse() )
            {
                continue;
            }
            if ( probe.getNameId() != Record.RESERVED.intValue() )
            {
                try
                {
                    stateMachine.registerTokenIfAbsent( new NamedToken( store.getStringFor( probe ), (int) id ) );
                    continue;
                }
                catch ( RuntimeException ignored )
                {
                    // Fall through to getToken probe.
                }
            }
            try
            {
                stateMachine.registerTokenIfAbsent( store.getToken( (int) id ) );
            }
            catch ( RuntimeException ignored )
            {
                // Unreadable token slot; tx-log or raft bootstrap must supply the name.
            }
        }
    }

    private static void waitForRaftLogThroughIndex( ReadableRaftLog raftLog, long toIndexInclusive )
            throws InterruptedException
    {
        if ( toIndexInclusive < 0 )
        {
            return;
        }
        long deadline = System.currentTimeMillis() + RAFT_LOG_BOOTSTRAP_WAIT_MILLIS;
        while ( raftLog.appendIndex() < toIndexInclusive )
        {
            if ( System.currentTimeMillis() > deadline )
            {
                break;
            }
            Thread.sleep( 50 );
        }
    }

    /**
     * Seed replicated token registries from committed raft entries after store copy.
     * Token commands at or before {@code toIndexInclusive} are already reflected in the copied store
     * and will not be replayed through the state machines, but holders must still see them.
     */
    public void bootstrapReplicatedTokensFromRaftLog( ReadableRaftLog raftLog, long toIndexInclusive ) throws IOException
    {
        try ( RaftLogCursor cursor = raftLog.getEntryCursor( 0 ) )
        {
            while ( cursor.next() )
            {
                if ( cursor.index() > toIndexInclusive )
                {
                    break;
                }
                ReplicatedContent content = unwrapDistributedOperation( cursor.get().content() );
                if ( content instanceof ReplicatedTokenRequest )
                {
                    registerTokenFromRequest( (ReplicatedTokenRequest) content );
                }
            }
        }
    }

    /**
     * Rebuild token registries from token commands in the copied transaction log. Store-copy recovery does not
     * replay token creates that are already reflected in the checkpoint snapshot, so in-memory holders can miss
     * entries that never appear in a post-skip raft log scan.
     */
    public void bootstrapReplicatedTokensFromTxLog( LocalDatabase localDatabase ) throws IOException
    {
        DependencyResolver dependencies = localDatabase.dataSource().getDependencyResolver();
        LogicalTransactionStore transactionStore = dependencies.resolveDependency( LogicalTransactionStore.class, ONLY );
        TransactionIdStore transactionIdStore = dependencies.resolveDependency( TransactionIdStore.class, ONLY );
        StorageEngine storageEngine = dependencies.resolveDependency( StorageEngine.class, ONLY );
        if ( !(storageEngine instanceof RecordStorageEngine) )
        {
            return;
        }
        NeoStores neoStores = ((RecordStorageEngine) storageEngine).testAccessNeoStores();

        long lastTxId = transactionIdStore.getLastCommittedTransactionId();
        long firstTxId = findFirstTxOnDisk( transactionStore, lastTxId );
        if ( firstTxId < 0 )
        {
            return;
        }

        try ( IOCursor<CommittedTransactionRepresentation> transactions = transactionStore.getTransactions( firstTxId ) )
        {
            while ( transactions.next() )
            {
                registerTokensFromCommittedTx( transactions.get(), neoStores );
            }
        }
        catch ( org.neo4j.kernel.impl.transaction.log.NoSuchTransactionException ignored )
        {
            // Copied stores can report committed tx ids ahead of the replayable log segment; raft bootstrap covers that case.
        }
    }

    private static long findFirstTxOnDisk( LogicalTransactionStore transactionStore, long lastTxId ) throws IOException
    {
        for ( long txId = TransactionIdStore.BASE_TX_ID + 1; txId <= lastTxId; txId++ )
        {
            if ( transactionStore.existsOnDisk( txId ) )
            {
                return txId;
            }
        }
        return -1;
    }

    private void registerTokensFromCommittedTx( CommittedTransactionRepresentation committedTx, NeoStores neoStores )
            throws IOException
    {
        committedTx.accept( command ->
        {
            if ( command instanceof Command.PropertyKeyTokenCommand )
            {
                registerPropertyKeyFromCommand( (Command.PropertyKeyTokenCommand) command, neoStores );
            }
            else if ( command instanceof Command.LabelTokenCommand )
            {
                registerLabelFromCommand( (Command.LabelTokenCommand) command, neoStores );
            }
            else if ( command instanceof Command.RelationshipTypeTokenCommand )
            {
                registerRelationshipTypeFromCommand( (Command.RelationshipTypeTokenCommand) command, neoStores );
            }
            return false;
        } );
    }

    private void registerPropertyKeyFromCommand( Command.PropertyKeyTokenCommand command, NeoStores neoStores )
    {
        NamedToken token = namedTokenFromCommand( command, neoStores.getPropertyKeyTokenStore() );
        if ( token != null )
        {
            propertyKeyTokenStateMachine.registerTokenIfAbsent( token );
        }
    }

    private void registerLabelFromCommand( Command.LabelTokenCommand command, NeoStores neoStores )
    {
        NamedToken token = namedTokenFromCommand( command, neoStores.getLabelTokenStore() );
        if ( token != null )
        {
            labelTokenStateMachine.registerTokenIfAbsent( token );
        }
    }

    private void registerRelationshipTypeFromCommand( Command.RelationshipTypeTokenCommand command, NeoStores neoStores )
    {
        NamedToken token = namedTokenFromCommand( command, neoStores.getRelationshipTypeTokenStore() );
        if ( token != null )
        {
            relationshipTypeTokenStateMachine.registerTokenIfAbsent( token );
        }
    }

    private static <RECORD extends TokenRecord> NamedToken namedTokenFromCommand(
            Command.TokenCommand<RECORD> command, TokenStore<RECORD> tokenStore )
    {
        RECORD after = command.getAfter();
        int id = after.getIntId();
        try
        {
            return new NamedToken( tokenStore.getStringFor( after ), id );
        }
        catch ( RuntimeException commandLookupFailed )
        {
            try
            {
                return tokenStore.getToken( id );
            }
            catch ( RuntimeException storeLookupFailed )
            {
                return null;
            }
        }
    }

    private static ReplicatedContent unwrapDistributedOperation( ReplicatedContent content )
    {
        while ( content instanceof DistributedOperation )
        {
            content = ((DistributedOperation) content).content();
        }
        return content;
    }

    private void registerTokenFromRequest( ReplicatedTokenRequest request )
    {
        switch ( request.type() )
        {
        case PROPERTY:
            propertyKeyTokenStateMachine.registerTokenIfAbsent( request );
            break;
        case RELATIONSHIP:
            relationshipTypeTokenStateMachine.registerTokenIfAbsent( request );
            break;
        case LABEL:
            labelTokenStateMachine.registerTokenIfAbsent( request );
            break;
        default:
            throw new IllegalStateException( "Unknown token type: " + request.type() );
        }
    }

    private class StateMachineCommandDispatcher implements CommandDispatcher
    {
        @Override
        public void dispatch( ReplicatedTransaction transaction, long commandIndex, Consumer<Result> callback )
        {
            replicatedTxStateMachine.applyCommand( transaction, commandIndex, callback );
        }

        @Override
        public void dispatch( ReplicatedIdAllocationRequest idRequest, long commandIndex, Consumer<Result> callback )
        {
            replicatedTxStateMachine.ensuredApplied();
            idAllocationStateMachine.applyCommand( idRequest, commandIndex, callback );
        }

        @Override
        public void dispatch( ReplicatedTokenRequest tokenRequest, long commandIndex, Consumer<Result> callback )
        {
            replicatedTxStateMachine.ensuredApplied();
            switch ( tokenRequest.type() )
            {
            case PROPERTY:
                propertyKeyTokenStateMachine.applyCommand( tokenRequest, commandIndex, callback );
                break;
            case RELATIONSHIP:
                relationshipTypeTokenStateMachine.applyCommand( tokenRequest, commandIndex, callback );
                break;
            case LABEL:
                labelTokenStateMachine.applyCommand( tokenRequest, commandIndex, callback );
                break;
            default:
                throw new IllegalStateException();
            }
        }

        @Override
        public void dispatch( ReplicatedLockTokenRequest lockRequest, long commandIndex, Consumer<Result> callback )
        {
            replicatedTxStateMachine.ensuredApplied();
            replicatedLockTokenStateMachine.applyCommand( lockRequest, commandIndex, callback );
        }

        @Override
        public void dispatch( DummyRequest dummyRequest, long commandIndex, Consumer<Result> callback )
        {
            benchmarkMachine.applyCommand( dummyRequest, commandIndex, callback );
        }

        @Override
        public void close()
        {
            runningBatch = false;
            replicatedTxStateMachine.ensuredApplied();
        }
    }
}
