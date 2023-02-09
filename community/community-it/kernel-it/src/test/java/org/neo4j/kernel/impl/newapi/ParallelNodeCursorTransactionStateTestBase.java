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
package org.neo4j.kernel.impl.newapi;

import org.eclipse.collections.api.list.primitive.LongList;
import org.eclipse.collections.api.set.primitive.LongSet;
import org.eclipse.collections.api.set.primitive.MutableLongSet;
import org.eclipse.collections.impl.block.procedure.checked.primitive.CheckedLongProcedure;
import org.eclipse.collections.impl.factory.primitive.LongSets;
import org.eclipse.collections.impl.list.mutable.primitive.LongArrayList;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import java.util.function.ToLongFunction;

import org.neo4j.internal.kernel.api.CursorFactory;
import org.neo4j.internal.kernel.api.NodeCursor;
import org.neo4j.internal.kernel.api.Read;
import org.neo4j.internal.kernel.api.Scan;
import org.neo4j.internal.kernel.api.Write;
import org.neo4j.internal.kernel.api.exceptions.InvalidTransactionTypeKernelException;
import org.neo4j.internal.kernel.api.exceptions.TransactionFailureException;
import org.neo4j.internal.kernel.api.security.AccessMode;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.kernel.api.KernelTransaction;

import static java.lang.String.format;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.io.pagecache.context.CursorContext.NULL;
import static org.neo4j.kernel.impl.newapi.TestUtils.closeWorkContexts;
import static org.neo4j.kernel.impl.newapi.TestUtils.count;
import static org.neo4j.kernel.impl.newapi.TestUtils.createContexts;
import static org.neo4j.kernel.impl.newapi.TestUtils.createRandomWorkers;
import static org.neo4j.kernel.impl.newapi.TestUtils.createWorkers;
import static org.neo4j.kernel.impl.newapi.TestUtils.randomBatchWorker;
import static org.neo4j.kernel.impl.newapi.TestUtils.singleBatchWorker;
import static org.neo4j.util.concurrent.Futures.getAllResults;

public abstract class ParallelNodeCursorTransactionStateTestBase<G extends KernelAPIWriteTestSupport>
        extends KernelAPIWriteTestBase<G>
{

    private static final ToLongFunction<NodeCursor> NODE_GET = NodeCursor::nodeReference;

    @Test
    void shouldHandleEmptyDatabase() throws TransactionFailureException
    {
        try ( KernelTransaction tx = beginTransaction() )
        {
            try ( NodeCursor cursor = tx.cursors().allocateNodeCursor( NULL ) )
            {
                Scan<NodeCursor> scan = tx.dataRead().allNodesScan();
                while ( scan.reserveBatch( cursor, 23, NULL, tx.securityContext().mode() ) )
                {
                    assertFalse( cursor.next() );
                }
            }
        }
    }

    @Test
    void scanShouldNotSeeDeletedNode() throws Exception
    {
        int size = 100;
        MutableLongSet created = LongSets.mutable.empty();
        MutableLongSet deleted =  LongSets.mutable.empty();
        try ( KernelTransaction tx = beginTransaction() )
        {
            Write write = tx.dataWrite();
            for ( int i = 0; i < size; i++ )
            {
                created.add( write.nodeCreate() );
                deleted.add( write.nodeCreate() );
            }
            tx.commit();
        }

        try ( KernelTransaction tx = beginTransaction() )
        {
            deleted.each( new CheckedLongProcedure()
            {
                @Override
                public void safeValue( long item ) throws Exception
                {
                    tx.dataWrite().nodeDelete( item );
                }
            } );

            try ( NodeCursor cursor = tx.cursors().allocateNodeCursor( NULL ) )
            {
                Scan<NodeCursor> scan = tx.dataRead().allNodesScan();
                MutableLongSet seen =  LongSets.mutable.empty();
                while ( scan.reserveBatch( cursor, 17, NULL, tx.securityContext().mode() ) )
                {
                    while ( cursor.next() )
                    {
                        long nodeId = cursor.nodeReference();
                        assertTrue( seen.add( nodeId ) );
                        assertTrue( created.remove( nodeId ) );
                    }
                }

                assertTrue( created.isEmpty() );
            }
        }
    }

    @Test
    void scanShouldSeeAddedNodes() throws Exception
    {
        int size = 100;
        MutableLongSet existing = createNodes( size );
        MutableLongSet added = LongSets.mutable.empty();

        try ( KernelTransaction tx = beginTransaction() )
        {
            for ( int i = 0; i < size; i++ )
            {
                added.add( tx.dataWrite().nodeCreate() );
            }

            try ( NodeCursor cursor = tx.cursors().allocateNodeCursor( NULL ) )
            {
                Scan<NodeCursor> scan = tx.dataRead().allNodesScan();
                MutableLongSet seen = LongSets.mutable.empty();
                while ( scan.reserveBatch( cursor, 17, NULL, tx.securityContext().mode() ) )
                {
                    while ( cursor.next() )
                    {
                        long nodeId = cursor.nodeReference();
                        assertTrue( seen.add( nodeId ) );
                        assertTrue( existing.remove( nodeId ) || added.remove( nodeId ) );
                    }
                }

                //make sure we have seen all nodes
                assertTrue( existing.isEmpty() );
                assertTrue( added.isEmpty() );
            }
        }
    }

    @Test
    void shouldReserveBatchFromTxState()
            throws TransactionFailureException, InvalidTransactionTypeKernelException
    {
        try ( KernelTransaction tx = beginTransaction() )
        {
            for ( int i = 0; i < 11; i++ )
            {
                tx.dataWrite().nodeCreate();
            }

            CursorContext cursorContext = tx.cursorContext();
            AccessMode accessMode = tx.securityContext().mode();
            try ( NodeCursor cursor = tx.cursors().allocateNodeCursor( cursorContext ) )
            {
                Scan<NodeCursor> scan = tx.dataRead().allNodesScan();
                assertTrue( scan.reserveBatch( cursor, 5, cursorContext, accessMode ) );
                assertEquals( 5, count( cursor ) );
                assertTrue( scan.reserveBatch( cursor, 4, cursorContext, accessMode ) );
                assertEquals( 4, count( cursor ) );
                assertTrue( scan.reserveBatch( cursor, 6, NULL, accessMode ) );
                assertEquals( 2, count( cursor ) );
                //now we should have fetched all nodes
                while ( scan.reserveBatch( cursor, 3, NULL, accessMode ) )
                {
                    assertFalse( cursor.next() );
                }
            }
        }
    }

    @Test
    void shouldScanAllNodesFromMultipleThreads()
            throws InterruptedException, ExecutionException, TransactionFailureException,
            InvalidTransactionTypeKernelException
    {
        // given
        int numberOfWorkers = 4;
        ExecutorService service = Executors.newFixedThreadPool( numberOfWorkers );
        CursorFactory cursors = testSupport.kernelToTest().cursors();
        int size = 128;
        LongArrayList ids = new LongArrayList();
        try ( KernelTransaction tx = beginTransaction() )
        {
            Write write = tx.dataWrite();
            for ( int i = 0; i < size; i++ )
            {
                ids.add( write.nodeCreate() );
            }

            org.neo4j.internal.kernel.api.Read read = tx.dataRead();
            Scan<NodeCursor> scan = read.allNodesScan();

            var workerContexts = createContexts( tx, cursors::allocateNodeCursor, numberOfWorkers );
            var futures = service.invokeAll( createWorkers( size / numberOfWorkers, scan, numberOfWorkers, workerContexts, NodeCursor::nodeReference ) );

            List<LongList> idsLists = getAllResults( futures );
            closeWorkContexts( workerContexts );

            TestUtils.assertDistinct( idsLists );
            LongList concat = TestUtils.concat( idsLists );
            assertEquals( ids.toSortedList(), concat.toSortedList() );
            tx.rollback();
        }
        finally
        {
            service.shutdown();
            service.awaitTermination( 1, TimeUnit.MINUTES );
        }
    }

    @Test
    void shouldScanAllNodesFromMultipleThreadWithBigSizeHints()
            throws InterruptedException, ExecutionException, TransactionFailureException,
            InvalidTransactionTypeKernelException
    {
        // given
        int numberOfWorkers = 4;
        ExecutorService service = Executors.newFixedThreadPool( numberOfWorkers );
        CursorFactory cursors = testSupport.kernelToTest().cursors();
        int size = 128;
        LongArrayList ids = new LongArrayList();
        try ( KernelTransaction tx = beginTransaction() )
        {
            Write write = tx.dataWrite();
            for ( int i = 0; i < size; i++ )
            {
                ids.add( write.nodeCreate() );
            }

            org.neo4j.internal.kernel.api.Read read = tx.dataRead();
            Scan<NodeCursor> scan = read.allNodesScan();

            var workerContexts = createContexts( tx, cursors::allocateNodeCursor, numberOfWorkers );
            var futures = service.invokeAll( createWorkers( 100, scan, numberOfWorkers, workerContexts, NODE_GET ) );

            List<LongList> idsLists = getAllResults( futures );
            closeWorkContexts( workerContexts );

            TestUtils.assertDistinct( idsLists );
            LongList concat = TestUtils.concat( idsLists );
            assertEquals( ids.toSortedList(), concat.toSortedList() );
        }
        finally
        {
            service.shutdown();
            service.awaitTermination( 1, TimeUnit.MINUTES );
        }
    }

    @Test
    void shouldScanAllNodesFromRandomlySizedWorkers()
            throws InterruptedException, TransactionFailureException, InvalidTransactionTypeKernelException, ExecutionException
    {
        // given
        ExecutorService service = Executors.newFixedThreadPool( 4 );
        int size = 128;
        LongArrayList ids = new LongArrayList();

        try ( KernelTransaction tx = beginTransaction() )
        {
            Write write = tx.dataWrite();
            for ( int i = 0; i < size; i++ )
            {
                ids.add( write.nodeCreate() );
            }

            Read read = tx.dataRead();
            Scan<NodeCursor> scan = read.allNodesScan();
            CursorFactory cursors = testSupport.kernelToTest().cursors();

            // when
            int numberOfWorkers = 10;
            var workerContexts = createContexts( tx, cursors::allocateNodeCursor, numberOfWorkers );
            var futures = service.invokeAll( createRandomWorkers( scan, numberOfWorkers, workerContexts, NODE_GET ) );

            // then
            List<LongList> lists = getAllResults( futures );
            closeWorkContexts( workerContexts );

            TestUtils.assertDistinct( lists );
            LongList concat = TestUtils.concat( lists );

            assertEquals( ids.toSortedList(), concat.toSortedList() );
            tx.rollback();
        }
        finally
        {
            service.shutdown();
            service.awaitTermination( 1, TimeUnit.MINUTES );
        }
    }

    @Test
    void parallelTxStateScanStressTest() throws InvalidTransactionTypeKernelException, TransactionFailureException, InterruptedException, ExecutionException
    {
        LongSet existingNodes = createNodes( 77 );
        int workers = Runtime.getRuntime().availableProcessors();
        ExecutorService threadPool = Executors.newFixedThreadPool( workers );
        CursorFactory cursors = testSupport.kernelToTest().cursors();
        ThreadLocalRandom random = ThreadLocalRandom.current();
        try
        {
            for ( int i = 0; i < 1000; i++ )
            {
                MutableLongSet allNodes = LongSets.mutable.withAll( existingNodes );
                try ( KernelTransaction tx = beginTransaction() )
                {
                    int nodeInTx = random.nextInt( 100 );
                    for ( int j = 0; j < nodeInTx; j++ )
                    {
                        allNodes.add( tx.dataWrite().nodeCreate() );
                    }

                    Scan<NodeCursor> scan = tx.dataRead().allNodesScan();

                    var workerContexts = createContexts( tx, cursors::allocateNodeCursor, workers );
                    var futures = threadPool.invokeAll( createRandomWorkers( scan, workers, workerContexts, NODE_GET ) );

                    List<LongList> lists = getAllResults( futures );
                    closeWorkContexts( workerContexts );

                    TestUtils.assertDistinct( lists );
                    LongList concat = TestUtils.concat( lists );
                    assertEquals(
                            allNodes, LongSets.immutable.withAll( concat ),
                            format( "nodes=%d, seen=%d, all=%d", nodeInTx, concat.size(), allNodes.size() ) );
                    assertEquals( allNodes.size(), concat.size(), format( "nodes=%d", nodeInTx ) );
                    tx.rollback();
                }
            }
        }
        finally
        {
            threadPool.shutdown();
            threadPool.awaitTermination( 1, TimeUnit.MINUTES );
        }
    }

    private static MutableLongSet createNodes( int size )
            throws TransactionFailureException, InvalidTransactionTypeKernelException
    {
        MutableLongSet nodes = LongSets.mutable.empty();
        try ( KernelTransaction tx = beginTransaction() )
        {
            Write write = tx.dataWrite();
            for ( int i = 0; i < size; i++ )
            {
                nodes.add( write.nodeCreate() );
            }
            tx.commit();
        }
        return nodes;
    }
}
