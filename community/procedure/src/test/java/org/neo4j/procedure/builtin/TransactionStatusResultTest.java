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
package org.neo4j.procedure.builtin;

import org.junit.jupiter.api.Test;

import java.net.InetSocketAddress;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Stream;

import org.neo4j.collection.Dependencies;
import org.neo4j.collection.pool.Pool;
import org.neo4j.configuration.Config;
import org.neo4j.dbms.database.DbmsRuntimeRepository;
import org.neo4j.dbms.database.readonly.DatabaseReadOnlyChecker;
import org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo;
import org.neo4j.internal.kernel.api.helpers.TransactionDependenciesResolver;
import org.neo4j.internal.kernel.api.security.CommunitySecurityLog;
import org.neo4j.internal.schema.SchemaState;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.context.EmptyVersionContextSupplier;
import org.neo4j.kernel.KernelVersion;
import org.neo4j.kernel.api.KernelTransaction;
import org.neo4j.kernel.api.KernelTransactionHandle;
import org.neo4j.kernel.api.exceptions.InvalidArgumentsException;
import org.neo4j.kernel.api.procedure.GlobalProcedures;
import org.neo4j.kernel.api.query.ExecutingQuery;
import org.neo4j.kernel.api.query.QueryObfuscator;
import org.neo4j.kernel.api.query.QuerySnapshot;
import org.neo4j.kernel.database.DatabaseTracers;
import org.neo4j.kernel.impl.api.KernelTransactionImplementation;
import org.neo4j.kernel.impl.api.KernelTransactions;
import org.neo4j.kernel.impl.api.LeaseService;
import org.neo4j.kernel.impl.api.TestKernelTransactionHandle;
import org.neo4j.kernel.impl.api.TransactionCommitProcess;
import org.neo4j.kernel.impl.api.TransactionExecutionStatistic;
import org.neo4j.kernel.impl.api.index.IndexingService;
import org.neo4j.kernel.impl.api.index.stats.IndexStatisticsStore;
import org.neo4j.kernel.impl.api.state.ConstraintIndexCreator;
import org.neo4j.kernel.impl.api.transaction.trace.TransactionInitializationTrace;
import org.neo4j.kernel.impl.constraints.StandardConstraintSemantics;
import org.neo4j.kernel.impl.factory.CanWrite;
import org.neo4j.kernel.impl.locking.NoOpClient;
import org.neo4j.kernel.impl.query.TransactionExecutionMonitor;
import org.neo4j.kernel.impl.query.clientconnection.HttpConnectionInfo;
import org.neo4j.kernel.impl.transaction.stats.DatabaseTransactionStats;
import org.neo4j.kernel.impl.util.DefaultValueMapper;
import org.neo4j.kernel.internal.event.DatabaseTransactionEventListeners;
import org.neo4j.lock.ActiveLock;
import org.neo4j.lock.ResourceTypes;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.memory.MemoryPools;
import org.neo4j.resources.CpuClock;
import org.neo4j.storageengine.api.StorageEngine;
import org.neo4j.time.Clocks;
import org.neo4j.time.SystemNanoClock;
import org.neo4j.token.TokenHolders;
import org.neo4j.token.api.TokenHolder;

import static java.time.ZoneOffset.UTC;
import static java.util.Collections.emptyMap;
import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static org.apache.commons.lang3.StringUtils.EMPTY;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.RETURNS_MOCKS;
import static org.mockito.Mockito.mock;
import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;
import static org.neo4j.kernel.database.DatabaseIdFactory.from;
import static org.neo4j.kernel.impl.util.collection.CollectionsFactorySupplier.ON_HEAP;
import static org.neo4j.lock.LockType.SHARED;
import static org.neo4j.values.virtual.VirtualValues.EMPTY_MAP;

class TransactionStatusResultTest
{

    private TestKernelTransactionHandle transactionHandle = new TransactionHandleWithLocks( new StubKernelTransaction() );
    private final HashMap<KernelTransactionHandle,Optional<QuerySnapshot>> snapshotsMap = new HashMap<>();
    private final TransactionDependenciesResolver blockerResolver = new TransactionDependenciesResolver( snapshotsMap );

    @Test
    void statusOfTransactionWithSingleQuery() throws InvalidArgumentsException
    {
        snapshotsMap.put( transactionHandle, Optional.of( createQuerySnapshot( 7L ) ) );
        TransactionStatusResult statusResult =
                new TransactionStatusResult( "my-database", transactionHandle, blockerResolver, snapshotsMap, UTC );

        checkTransactionStatus( statusResult, "testQuery", "query-7", "1970-01-01T00:00:01.984Z" );
    }

    @Test
    void statusOfTransactionWithoutRunningQuery() throws InvalidArgumentsException
    {
        snapshotsMap.put( transactionHandle, Optional.empty() );
        TransactionStatusResult statusResult =
                new TransactionStatusResult( "neo4j", transactionHandle, blockerResolver, snapshotsMap, UTC );

        checkTransactionStatusWithoutQueries( statusResult );
    }

    @Test
    void statusOfTransactionWithDifferentTimeZone() throws InvalidArgumentsException
    {
        snapshotsMap.put( transactionHandle, Optional.of( createQuerySnapshot( 7L ) ) );
        TransactionStatusResult statusResult =
                new TransactionStatusResult( "my-database", transactionHandle, blockerResolver, snapshotsMap, ZoneId.of( "UTC+1" ) );

        checkTransactionStatus( statusResult, "testQuery", "query-7", "1970-01-01T01:00:01.984+01:00" );
    }

    @Test
    void emptyInitialisationStacktraceWhenTraceNotAvailable() throws InvalidArgumentsException
    {
        snapshotsMap.put( transactionHandle, Optional.empty() );
        TransactionStatusResult statusResult = new TransactionStatusResult( "neo4j", transactionHandle, blockerResolver, snapshotsMap, UTC );
        assertEquals( EMPTY, statusResult.initializationStackTrace );
    }

    @Test
    void includeInitialisationStacktraceWhenTraceAvailable() throws InvalidArgumentsException
    {
        transactionHandle = new TransactionHandleWithLocks( new StubKernelTransaction(), true );
        snapshotsMap.put( transactionHandle, Optional.empty() );
        TransactionStatusResult statusResult = new TransactionStatusResult( "neo4j", transactionHandle, blockerResolver, snapshotsMap, UTC );
        assertThat( statusResult.initializationStackTrace ).contains( "Transaction initialization stacktrace." );
    }

    @Test
    void emptyClientInfoForClosedTransaction() throws InvalidArgumentsException
    {
        var handle = new TransactionHandleWithLocks( new StubKernelTransaction(), false, false );
        snapshotsMap.put( handle, Optional.empty() );
        var statusResult = new TransactionStatusResult( "neo4j", handle, blockerResolver, snapshotsMap, UTC );
        assertThat( statusResult.protocol ).isEmpty();
        assertThat( statusResult.clientAddress ).isEmpty();
        assertThat( statusResult.requestUri ).isEmpty();
        assertThat( statusResult.connectionId ).isEmpty();
    }

    private static void checkTransactionStatusWithoutQueries( TransactionStatusResult statusResult )
    {
        assertEquals( "neo4j-transaction-8", statusResult.transactionId );
        assertEquals( "testUser", statusResult.username );
        assertEquals( stringObjectEmptyMap(), statusResult.metaData );
        assertEquals( "1970-01-01T00:00:01.984Z", statusResult.startTime );
        assertEquals( "https", statusResult.protocol );
        assertEquals( "https-42", statusResult.connectionId );
        assertEquals( "localhost:1000", statusResult.clientAddress );
        assertEquals( "https://localhost:1001/path", statusResult.requestUri );
        assertEquals( EMPTY, statusResult.currentQueryId );
        assertEquals( EMPTY, statusResult.currentQuery );
        assertEquals( 1, statusResult.activeLockCount );
        assertEquals( "Running", statusResult.status );
        assertEquals( stringObjectEmptyMap(), statusResult.resourceInformation );
        assertEquals( 1810L, statusResult.elapsedTimeMillis );
        assertEquals( Long.valueOf( 1L ), statusResult.cpuTimeMillis );
        assertEquals( 0L, statusResult.waitTimeMillis );
        assertEquals( Long.valueOf( 1809 ), statusResult.idleTimeMillis );
        assertEquals( Long.valueOf( 0 ), statusResult.allocatedBytes );
        assertEquals( Long.valueOf( 0 ), statusResult.allocatedDirectBytes );
        assertEquals( 0L, statusResult.pageHits );
        assertEquals( 0L, statusResult.pageFaults );
        assertEquals( "neo4j", statusResult.database );
    }

    private static void checkTransactionStatus( TransactionStatusResult statusResult, String currentQuery, String currentQueryId, String startTime )
    {
        assertEquals( "my-database-transaction-8", statusResult.transactionId );
        assertEquals( "testUser", statusResult.username );
        assertEquals( stringObjectEmptyMap(), statusResult.metaData );
        assertEquals( startTime, statusResult.startTime );
        assertEquals( "https", statusResult.protocol );
        assertEquals( "https-42", statusResult.connectionId );
        assertEquals( "localhost:1000", statusResult.clientAddress );
        assertEquals( "https://localhost:1001/path", statusResult.requestUri );
        assertEquals( currentQueryId, statusResult.currentQueryId );
        assertEquals( currentQuery, statusResult.currentQuery );
        assertEquals( 1, statusResult.activeLockCount );
        assertEquals( "Running", statusResult.status );
        assertEquals( stringObjectEmptyMap(), statusResult.resourceInformation );
        assertEquals( 1810, statusResult.elapsedTimeMillis );
        assertEquals( Long.valueOf( 1 ), statusResult.cpuTimeMillis );
        assertEquals( 0L, statusResult.waitTimeMillis );
        assertEquals( Long.valueOf( 1809 ), statusResult.idleTimeMillis );
        assertEquals( Long.valueOf( 0 ), statusResult.allocatedBytes );
        assertEquals( Long.valueOf( 0 ), statusResult.allocatedDirectBytes );
        assertEquals( 0, statusResult.pageHits );
        assertEquals( 0, statusResult.pageFaults );
        assertEquals( "my-database", statusResult.database );
    }

    private static Map<String,Object> stringObjectEmptyMap()
    {
        return emptyMap();
    }

    private static QuerySnapshot createQuerySnapshot( long queryId )
    {
        ExecutingQuery executingQuery = createExecutingQuery( queryId );
        executingQuery.onObfuscatorReady( QueryObfuscator.PASSTHROUGH );
        return executingQuery.snapshot();
    }

    private static ExecutingQuery createExecutingQuery( long queryId )
    {
        return new ExecutingQuery( queryId, getTestConnectionInfo(), from( DEFAULT_DATABASE_NAME, UUID.randomUUID() ), "testUser", "testUser", "testQuery",
                                   EMPTY_MAP,
                                   stringObjectEmptyMap(), () -> 1L, () -> 1, () -> 2,
                                   Thread.currentThread().getId(), Thread.currentThread().getName(),
                                   new CountingNanoClock(), new CountingCpuClock(), true );
    }

    private static HttpConnectionInfo getTestConnectionInfo()
    {
        return new HttpConnectionInfo( "https-42", "https", new InetSocketAddress( "localhost", 1000 ),
                new InetSocketAddress( "localhost", 1001 ), "/path" );
    }

    private static class TransactionHandleWithLocks extends TestKernelTransactionHandle
    {
        boolean hasInitTrace;
        boolean hasClientInfo;

        TransactionHandleWithLocks( KernelTransaction tx )
        {
            this( tx, false, true );
        }

        TransactionHandleWithLocks( KernelTransaction tx, boolean hasInitTrace )
        {
            this( tx, hasInitTrace, true );
        }

        TransactionHandleWithLocks( KernelTransaction tx, boolean hasInitTrace, boolean hasClientInfo )
        {
            super( tx );
            this.hasInitTrace = hasInitTrace;
            this.hasClientInfo = hasClientInfo;
        }

        @Override
        public TransactionInitializationTrace transactionInitialisationTrace()
        {
            if ( hasInitTrace )
            {
                return new TransactionInitializationTrace();
            }
            return super.transactionInitialisationTrace();
        }

        @Override
        public Stream<ActiveLock> activeLocks()
        {
            return Stream.of( new ActiveLock( ResourceTypes.NODE, SHARED, 3, 3 ) );
        }

        @Override
        public TransactionExecutionStatistic transactionStatistic()
        {
            Dependencies dependencies = new Dependencies();
            dependencies.satisfyDependency( mock( DefaultValueMapper.class ) );
            KernelTransactionImplementation transaction = new KernelTransactionImplementation(
                    Config.defaults(),
                    mock( DatabaseTransactionEventListeners.class ),
                    mock( ConstraintIndexCreator.class ), mock( GlobalProcedures.class ),
                    mock( TransactionCommitProcess.class ), new DatabaseTransactionStats(),
                    mock( Pool.class ), Clocks.fakeClock(),
                    new AtomicReference<>( CpuClock.NOT_AVAILABLE ),
                    mock( DatabaseTracers.class, RETURNS_MOCKS ),
                    mock( StorageEngine.class, RETURNS_MOCKS ), any -> CanWrite.INSTANCE,
                    EmptyVersionContextSupplier.EMPTY, ON_HEAP, new StandardConstraintSemantics(), mock( SchemaState.class ),
                    mockedTokenHolders(), mock( IndexingService.class ),
                    mock( IndexStatisticsStore.class ), dependencies,
                    from( DEFAULT_DATABASE_NAME, UUID.randomUUID() ), LeaseService.NO_LEASES, MemoryPools.NO_TRACKING, DatabaseReadOnlyChecker.writable(),
                    TransactionExecutionMonitor.NO_OP, CommunitySecurityLog.NULL_LOG, () -> KernelVersion.LATEST, mock( DbmsRuntimeRepository.class ),
                    new NoOpClient(), mock( KernelTransactions.class ), NullLogProvider.getInstance() )
            {
                @Override
                public Statistics getStatistics()
                {
                    TestStatistics statistics = new TestStatistics( this, new AtomicReference<>( new CountingCpuClock() ) );
                    statistics.init( Thread.currentThread().getId(), CursorContext.NULL );
                    return statistics;
                }
            };
            return new TransactionExecutionStatistic( transaction, Clocks.fakeClock().forward( 2010, MILLISECONDS ), 200 );
        }

        @Override
        public Optional<ClientConnectionInfo> clientInfo()
        {
            if ( hasClientInfo )
            {
                return Optional.of( getTestConnectionInfo() );
            }
            return Optional.empty();
        }
    }

    private static TokenHolders mockedTokenHolders()
    {
        return new TokenHolders(
                mock( TokenHolder.class ),
                mock( TokenHolder.class ),
                mock( TokenHolder.class ) );
    }

    private static class TestStatistics extends KernelTransactionImplementation.Statistics
    {
        @Override
        protected void init( long threadId, CursorContext cursorContext )
        {
            super.init( threadId, cursorContext );
        }

        TestStatistics( KernelTransactionImplementation transaction, AtomicReference<CpuClock> cpuClockRef )
        {
            super( transaction, cpuClockRef, false );
        }
    }

    private static class CountingNanoClock extends SystemNanoClock
    {
        private long time;

        @Override
        public long nanos()
        {
            time += MILLISECONDS.toNanos( 1 );
            return time;
        }
    }

    private static class CountingCpuClock implements CpuClock
    {
        private long cpuTime;

        @Override
        public long cpuTimeNanos( long threadId )
        {
            cpuTime += MILLISECONDS.toNanos( 1 );
            return cpuTime;
        }
    }
}
