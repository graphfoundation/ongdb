/*
 * Copyright (c) 2002-2020 "Neo4j,"
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
package org.neo4j.kernel.impl.locking;

<<<<<<< HEAD
import org.junit.AfterClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
=======
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
>>>>>>> fork/4.0
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Predicate;

<<<<<<< HEAD
=======
import org.neo4j.graphdb.GraphDatabaseService;
>>>>>>> fork/4.0
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.NotFoundException;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.Transaction;
import org.neo4j.internal.kernel.api.Write;
import org.neo4j.kernel.api.KernelTransaction;
import org.neo4j.kernel.impl.api.KernelTransactionImplementation;
<<<<<<< HEAD
import org.neo4j.kernel.impl.core.ThreadToStatementContextBridge;
import org.neo4j.kernel.impl.locking.community.RWLock;
import org.neo4j.test.rule.ImpermanentDatabaseRule;
import org.neo4j.test.rule.RepeatRule;
import org.neo4j.test.rule.concurrent.ThreadingRule;
import org.neo4j.util.concurrent.BinaryLatch;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class DetachDeleteIT
{
    private static ExecutorService executor = Executors.newFixedThreadPool( 5 );

    @ClassRule
    public static ImpermanentDatabaseRule db = new ImpermanentDatabaseRule();

    @Rule
    public RepeatRule repeatRule = new RepeatRule();

    @AfterClass
    public static void tearDown()
=======
import org.neo4j.kernel.impl.coreapi.InternalTransaction;
import org.neo4j.kernel.impl.locking.community.RWLock;
import org.neo4j.lock.ResourceTypes;
import org.neo4j.test.extension.ImpermanentDbmsExtension;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.rule.concurrent.ThreadingRule;
import org.neo4j.util.concurrent.BinaryLatch;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

@TestInstance( TestInstance.Lifecycle.PER_CLASS )
@ImpermanentDbmsExtension
class DetachDeleteIT
{
    private static ExecutorService executor = Executors.newFixedThreadPool( 5 );

    @AfterAll
    static void tearDown()
>>>>>>> fork/4.0
    {
        executor.shutdown();
    }

<<<<<<< HEAD
    @Test
    public void detachDeleteMustRemoveAllRelationships() throws Exception
=======
    @Inject
    GraphDatabaseService db;

    @Test
    void detachDeleteMustRemoveAllRelationships() throws Exception
>>>>>>> fork/4.0
    {
        long nodeId = makeSimpleNode();

        try ( Transaction tx = db.beginTx() )
        {
<<<<<<< HEAD
            Write write = getWrite();
            assertEquals( 10, write.nodeDetachDelete( nodeId ) );
            tx.success();
=======
            Write write = getWrite( tx );
            assertEquals( 10, write.nodeDetachDelete( nodeId ) );
            tx.commit();
>>>>>>> fork/4.0
        }
    }

    @Test
<<<<<<< HEAD
    public void detachDeleteMustRemoveAllRelationshipsOfDenseNodes() throws Exception
=======
    void detachDeleteMustRemoveAllRelationshipsOfDenseNodes() throws Exception
>>>>>>> fork/4.0
    {
        long nodeId = makeDenseNode();

        try ( Transaction tx = db.beginTx() )
        {
<<<<<<< HEAD
            Write write = getWrite();
            assertEquals( 100, write.nodeDetachDelete( nodeId ) );
            tx.success();
        }
    }

    @RepeatRule.Repeat( times = 10 )
    @Test
    public void detachDeleteMustRemoveAllRelationshipsWhenMoreAreConcurrentlyAdded() throws Exception
=======
            Write write = getWrite( tx );
            assertEquals( 100, write.nodeDetachDelete( nodeId ) );
            tx.commit();
        }
    }

    @RepeatedTest( 10 )
    void detachDeleteMustRemoveAllRelationshipsWhenMoreAreConcurrentlyAdded() throws Exception
>>>>>>> fork/4.0
    {
        long nodeId = makeSimpleNode();
        verifyDetachDeleteRacingWithRelationCreateWithoutThrowing( nodeId, 1 );
    }

<<<<<<< HEAD
    @RepeatRule.Repeat( times = 10 )
    @Test
    public void detachDeleteMustRemoveAllRelationshipsWhenMoreAreConcurrentlyAddedToMakeNodeDense() throws Exception
=======
    @RepeatedTest( 10 )
    void detachDeleteMustRemoveAllRelationshipsWhenMoreAreConcurrentlyAddedToMakeNodeDense() throws Exception
>>>>>>> fork/4.0
    {
        long nodeId = makeSimpleNode();
        verifyDetachDeleteRacingWithRelationCreateWithoutThrowing( nodeId, 10 );
    }

<<<<<<< HEAD
    @RepeatRule.Repeat( times = 10 )
    @Test
    public void detachDeleteMustRemoveAllRelationshipsWhenMoreAreConcurrentlyAddedToAlreadyDenseNode() throws Exception
=======
    @RepeatedTest( 10 )
    void detachDeleteMustRemoveAllRelationshipsWhenMoreAreConcurrentlyAddedToAlreadyDenseNode() throws Exception
>>>>>>> fork/4.0
    {
        long nodeId = makeDenseNode();
        verifyDetachDeleteRacingWithRelationCreateWithoutThrowing( nodeId, 10 );
    }

    enum Phases
    {
        OTHER_REL_CREATED,
        DETACH_DELETE_HAS_STARTED,
        DETACH_DELETE_HAS_FINISHED,
        LOCK_VERIFICATION_FINISHED
    }

    @Test
<<<<<<< HEAD
    public void detachDeleteMustLockAllNeighboursIncludingThoseConcurrentlyAdded() throws Exception
=======
    void detachDeleteMustLockAllNeighboursIncludingThoseConcurrentlyAdded() throws Exception
>>>>>>> fork/4.0
    {
        Sequencer<Phases> sequencer = Sequencer.from( Phases.class );
        Thread main = Thread.currentThread();
        long otherNodeId;
        try ( Transaction tx = db.beginTx() )
        {
<<<<<<< HEAD
            otherNodeId = db.createNodeId();
            tx.success();
=======
            otherNodeId = tx.createNode().getId();
            tx.commit();
>>>>>>> fork/4.0
        }
        long nodeId = makeDenseNode();
        AtomicLong otherRelId = new AtomicLong();

        Future<Object> relationshipAdder = executor.submit( () ->
        {
<<<<<<< HEAD
            try ( Transaction tx1 = db.beginTx() )
            {
                Node node = db.getNodeById( nodeId );
                Node other = db.getNodeById( otherNodeId );
                long id = node.createRelationshipTo( other, RelationshipType.withName( "R5" ) ).getId();
                otherRelId.set( id );
                tx1.success();
                sequencer.release( Phases.OTHER_REL_CREATED ); // Allow detach delete to commence.
                sequencer.await( Phases.DETACH_DELETE_HAS_STARTED ); // Wait for the detach delete to have been attempted
=======
            try ( Transaction tx = db.beginTx() )
            {
                Node node = tx.getNodeById( nodeId );
                Node other = tx.getNodeById( otherNodeId );
                long id = node.createRelationshipTo( other, RelationshipType.withName( "R5" ) ).getId();
                otherRelId.set( id );
                sequencer.release( Phases.OTHER_REL_CREATED ); // Allow detach delete to commence.
                sequencer.await( Phases.DETACH_DELETE_HAS_STARTED ); // Wait for the detach delete to have been attempted
                tx.commit();
>>>>>>> fork/4.0
            }
            return null;
        } );

        Future<Object> lockVerifier = executor.submit( () ->
        {
            sequencer.await( Phases.OTHER_REL_CREATED );
            Predicate<Thread> predicate = ThreadingRule.waitingWhileIn( RWLock.class, "waitUninterruptedly" );
            do
            {
                Thread.sleep( 100 );
            }
            while ( !predicate.test( main ) );
            sequencer.release( Phases.DETACH_DELETE_HAS_STARTED );
            sequencer.await( Phases.DETACH_DELETE_HAS_FINISHED ); // Now the DETACH DELETE *should* be holding a lock on all neighbours. Verify.
            try ( Transaction ignore = db.beginTx() )
            {
<<<<<<< HEAD
                Locks.Client locksClient = getLocksClient();
=======
                Locks.Client locksClient = getLocksClient( ignore );
>>>>>>> fork/4.0
                // The try-lock should fail because the detach-delete should already be holding an exclusive lock on that node.
                assertFalse( locksClient.trySharedLock( ResourceTypes.NODE, otherNodeId ) );
                // The detach-delete should also hold an exclusive lock on the associated relationship.
                Assertions.assertFalse( locksClient.trySharedLock( ResourceTypes.RELATIONSHIP, otherRelId.get() ) );
            }
            finally
            {
                sequencer.release( Phases.LOCK_VERIFICATION_FINISHED );
            }
            return null;
        } );

        sequencer.await( Phases.OTHER_REL_CREATED ); // Wait for node to be locked in a transaction with pending relationship create.
        try ( Transaction tx = db.beginTx() )
        {
<<<<<<< HEAD
            Write write = getWrite();
            write.nodeDetachDelete( nodeId );
            tx.success();
            sequencer.release( Phases.DETACH_DELETE_HAS_FINISHED );
            sequencer.await( Phases.LOCK_VERIFICATION_FINISHED );
=======
            Write write = getWrite( tx );
            write.nodeDetachDelete( nodeId );
            sequencer.release( Phases.DETACH_DELETE_HAS_FINISHED );
            sequencer.await( Phases.LOCK_VERIFICATION_FINISHED );
            tx.commit();
>>>>>>> fork/4.0
        }
        relationshipAdder.get();
        lockVerifier.get();
    }

    private void verifyDetachDeleteRacingWithRelationCreateWithoutThrowing( long nodeId, int iterPerRelType ) throws Exception
    {
        CountDownLatch latch = new CountDownLatch( 5 );
        List<Callable<Object>> tasks = new ArrayList<>();

        for ( int i = 1; i < 10; i++ )
        {
            RelationshipType type = RelationshipType.withName( "R" + i );
            Callable<Object> callable = () ->
            {
                latch.countDown();
                latch.await();
                try ( Transaction tx = db.beginTx() )
                {
<<<<<<< HEAD
                    Node node = db.getNodeById( nodeId );
                    node.createRelationshipTo( db.createNode(), type );
                    tx.success();
=======
                    Node node = tx.getNodeById( nodeId );
                    node.createRelationshipTo( tx.createNode(), type );
                    tx.commit();
>>>>>>> fork/4.0
                }
                catch ( NotFoundException ignore )
                {
                    // The DETACH DELETE got ahead of us. It's fine.
                }
                return null;
            };
            for ( int j = 0; j < iterPerRelType; j++ )
            {
                tasks.add( callable );
            }
        }
        tasks.add( () ->
        {
            latch.countDown();
            latch.await();
            try ( Transaction tx = db.beginTx() )
            {
<<<<<<< HEAD
                Write write = getWrite();
                write.nodeDetachDelete( nodeId );
                tx.success();
=======
                Write write = getWrite( tx );
                write.nodeDetachDelete( nodeId );
                tx.commit();
>>>>>>> fork/4.0
            }
            return null;
        } );

        Collections.shuffle( tasks );

        List<Future<Object>> futures = executor.invokeAll( tasks );
        for ( Future<Object> future : futures )
        {
            future.get();
        }
    }

    private long makeSimpleNode()
    {
        long nodeId;
        try ( Transaction tx = db.beginTx() )
        {
<<<<<<< HEAD
            Node node = db.createNode();
            nodeId = node.getId();
            for ( int i = 0; i < 10; i++ )
            {
                node.createRelationshipTo( db.createNode(), RelationshipType.withName( "R" + i ) );
            }
            tx.success();
=======
            Node node = tx.createNode();
            nodeId = node.getId();
            for ( int i = 0; i < 10; i++ )
            {
                node.createRelationshipTo( tx.createNode(), RelationshipType.withName( "R" + i ) );
            }
            tx.commit();
>>>>>>> fork/4.0
        }
        return nodeId;
    }

    private long makeDenseNode()
    {
        long nodeId;
        try ( Transaction tx = db.beginTx() )
        {
<<<<<<< HEAD
            Node node = db.createNode();
            nodeId = node.getId();
            tx.success();
=======
            Node node = tx.createNode();
            nodeId = node.getId();
            tx.commit();
>>>>>>> fork/4.0
        }

        // Create each group in a separate transaction, in order to make the arrangement of records more deterministic.
        for ( int i = 0; i < 10; i++ )
        {
            RelationshipType type = RelationshipType.withName( "R" + i );
            try ( Transaction tx = db.beginTx() )
            {
<<<<<<< HEAD
                Node node = db.getNodeById( nodeId );
                for ( int j = 0; j < 10; j++ )
                {
                    node.createRelationshipTo( db.createNode(), type );
                }
                tx.success();
=======
                Node node = tx.getNodeById( nodeId );
                for ( int j = 0; j < 10; j++ )
                {
                    node.createRelationshipTo( tx.createNode(), type );
                }
                tx.commit();
>>>>>>> fork/4.0
            }
        }
        return nodeId;
    }

<<<<<<< HEAD
    private Write getWrite() throws Exception
    {
        return getKernelTransaction().dataWrite();
    }

    private Locks.Client getLocksClient()
    {
        KernelTransactionImplementation kti = (KernelTransactionImplementation) getKernelTransaction();
        return kti.statementLocks().pessimistic();
    }

    private KernelTransaction getKernelTransaction()
    {
        ThreadToStatementContextBridge txBridge = db.getDependencyResolver().resolveDependency( ThreadToStatementContextBridge.class );
        return txBridge.getKernelTransactionBoundToThisThread( true );
=======
    private Write getWrite( Transaction tx ) throws Exception
    {
        return getKernelTransaction( tx ).dataWrite();
    }

    private Locks.Client getLocksClient( Transaction tx )
    {
        KernelTransactionImplementation kti = (KernelTransactionImplementation) getKernelTransaction( tx );
        return kti.statementLocks().pessimistic();
    }

    private KernelTransaction getKernelTransaction( Transaction tx )
    {
        InternalTransaction itx = (InternalTransaction) tx;
        return itx.kernelTransaction();
>>>>>>> fork/4.0
    }

    /**
     * Similar to a {@link java.util.concurrent.Phaser} or a {@link java.util.concurrent.Semaphore}, except the Sequencer is single-use,
     * and goes through a pre-defined set of steps or phases, as defined by the given enum.
     */
    private static class Sequencer<E extends Enum<E>>
    {
        private final EnumMap<E,BinaryLatch> map;

        private Sequencer( EnumMap<E,BinaryLatch> map )
        {
            this.map = map;
        }

        static <T extends Enum<T>> Sequencer<T> from( Class<T> cls )
        {
            EnumMap<T,BinaryLatch> map = new EnumMap<>( cls );
            for ( T phase : cls.getEnumConstants() )
            {
                map.put( phase, new BinaryLatch() );
            }
            return new Sequencer<>( map );
        }

        void await( E phase )
        {
            map.get( phase ).await();
        }

        void release( E phase )
        {
            map.get( phase ).release();
        }
    }
}
