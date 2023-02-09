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
package org.neo4j.tracers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

import org.neo4j.exceptions.KernelException;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Transaction;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.cursor.DefaultPageCursorTracer;
import org.neo4j.io.pagecache.tracing.cursor.PageCursorTracer;
import org.neo4j.kernel.impl.api.KernelTransactionImplementation;
import org.neo4j.kernel.impl.coreapi.InternalTransaction;
import org.neo4j.kernel.internal.GraphDatabaseAPI;
import org.neo4j.storageengine.api.CountsDelta;
import org.neo4j.storageengine.api.StorageReader;
import org.neo4j.storageengine.api.cursor.StoreCursors;
import org.neo4j.storageengine.api.txstate.TransactionCountingStateVisitor;
import org.neo4j.test.extension.DbmsExtension;
import org.neo4j.test.extension.Inject;

import static org.assertj.core.api.Assertions.assertThat;
import static org.neo4j.graphdb.RelationshipType.withName;
import static org.neo4j.storageengine.api.txstate.TxStateVisitor.EMPTY;

@DbmsExtension
public class TransactionCountingStateVisitorTraceIT
{
    @Inject
    private GraphDatabaseAPI database;
    private static final Label marker = Label.label( "marker" );
    private static final Label label = Label.label( "label" );
    private long sourceNodeId;
    private long relationshipId;

    @BeforeEach
    void setUp()
    {
        try ( Transaction transaction = database.beginTx() )
        {
            var source = transaction.createNode( marker, label );
            sourceNodeId = source.getId();
            var destination = transaction.createNode();
            var relationship = source.createRelationshipTo( destination, withName( "any" ) );
            relationshipId = relationship.getId();
            transaction.commit();
        }
    }

    @Test
    void traceDeletedRelationshipPageCacheAccess() throws KernelException
    {
        traceStateWithChanges( tx -> tx.getRelationshipById( relationshipId ).delete(), 2 );
    }

    @Test
    void traceNodeLabelChangesPageCacheAccess() throws KernelException
    {
        traceStateWithChanges( tx -> tx.getNodeById( sourceNodeId ).removeLabel( marker ) );
    }

    @Test
    void traceDeletedNodePageCacheAccess() throws KernelException
    {
        traceStateWithChanges( tx -> tx.getNodeById( sourceNodeId ).delete() );
    }

    private void traceStateWithChanges( Consumer<Transaction> transactionalOperation ) throws KernelException
    {
        traceStateWithChanges( transactionalOperation, 2 );
    }

    private void traceStateWithChanges( Consumer<Transaction> transactionalOperation, int traceCount ) throws KernelException
    {
        try ( var transaction = database.beginTx() )
        {
            var internalTransaction = (InternalTransaction) transaction;
            KernelTransactionImplementation kernelTransaction = (KernelTransactionImplementation) internalTransaction.kernelTransaction();
            var cursorContext = kernelTransaction.cursorContext();

            transactionalOperation.accept( transaction );

            ((DefaultPageCursorTracer) cursorContext.getCursorTracer()).setIgnoreCounterCheck( true );
            cursorContext.getCursorTracer().reportEvents();
            assertZeroCursor( cursorContext );
            var transactionState = kernelTransaction.txState();
            var counts = new CountsDelta();

            try ( StorageReader storageReader = kernelTransaction.newStorageReader();
                    var stateVisitor = new TransactionCountingStateVisitor( EMPTY, storageReader, transactionState, counts, cursorContext, StoreCursors.NULL ) )
            {
                transactionState.accept( stateVisitor );
            }

            assertCursorTracer( cursorContext, traceCount );
        }
    }

    private static void assertCursorTracer( CursorContext cursorContext, int count )
    {
        PageCursorTracer cursorTracer = cursorContext.getCursorTracer();
        assertThat( cursorTracer.pins() ).isEqualTo( count );
        assertThat( cursorTracer.hits() ).isEqualTo( count );
        assertThat( cursorTracer.unpins() ).isEqualTo( count );
    }

    private static void assertZeroCursor( CursorContext cursorContext )
    {
        PageCursorTracer cursorTracer = cursorContext.getCursorTracer();
        assertThat( cursorTracer.pins() ).isZero();
        assertThat( cursorTracer.hits() ).isZero();
        assertThat( cursorTracer.unpins() ).isZero();
        assertThat( cursorTracer.faults() ).isZero();
    }
}
