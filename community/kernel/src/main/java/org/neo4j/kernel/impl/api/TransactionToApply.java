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
package org.neo4j.kernel.impl.api;

import java.io.IOException;
import java.util.Iterator;
import java.util.function.LongConsumer;

import org.neo4j.common.HexPrinter;
import org.neo4j.common.Subject;
import org.neo4j.internal.helpers.collection.Visitor;
import org.neo4j.internal.kernel.api.security.AuthSubject;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.kernel.impl.transaction.TransactionRepresentation;
import org.neo4j.kernel.impl.transaction.log.Commitment;
import org.neo4j.kernel.impl.transaction.log.LogPosition;
import org.neo4j.kernel.impl.transaction.tracing.CommitEvent;
import org.neo4j.storageengine.api.CommandsToApply;
import org.neo4j.storageengine.api.StorageCommand;
import org.neo4j.storageengine.api.TransactionApplicationMode;
import org.neo4j.storageengine.api.cursor.StoreCursors;

import static org.neo4j.internal.helpers.Format.date;

/**
 * A chain of transactions to apply. Transactions form a linked list, each pointing to the {@link #next()}
 * or {@code null}. This design chosen for less garbage and convenience, i.e. that we pass in a number of transactions
 * while also expecting some results for each and every one of those transactions back. The results are
 * written directly into each instance instead of creating another data structure which is then returned.
 * This is an internal class so even if it mixes arguments with results it's easier to work with,
 * requires less code... and less objects.
 *
 * State and methods are divided up into two parts, one part being the responsibility of the user to manage,
 * the other part up to the commit process to manage.
 *
 * The access pattern looks like:
 * <ol>
 * <li>=== USER ===</li>
 * <li>Construct instances</li>
 * <li>Form the linked list using {@link #next(TransactionToApply)}</li>
 * <li>Pass into {@link TransactionCommitProcess#commit(TransactionToApply, CommitEvent, TransactionApplicationMode)}</li>
 * <li>=== COMMIT PROCESS ===</li>
 * <li>Commit, where {@link #commitment(Commitment, long)} is called to store the {@link Commitment} and transaction id</li>
 * <li>Apply, where {@link #publishAsCommitted()} ()},
 * {@link #transactionRepresentation()} and {@link #next()} are called</li>
 * </ol>
 */
public class TransactionToApply implements CommandsToApply, AutoCloseable
{
    public static final long TRANSACTION_ID_NOT_SPECIFIED = 0;

    // These fields are provided by user
    private final TransactionRepresentation transactionRepresentation;
    private long transactionId;
    private final CursorContext cursorContext;
    private final StoreCursors storeCursors;
    private TransactionToApply nextTransactionInBatch;

    // These fields are provided by commit process, storage engine, or recovery process
    private Commitment commitment;
    private LongConsumer closedCallback;
    private LogPosition logPosition;

    /**
     * Used when committing a transaction that hasn't already gotten a transaction id assigned.
     */
    public TransactionToApply( TransactionRepresentation transactionRepresentation, CursorContext cursorContext, StoreCursors storeCursors )
    {
        this( transactionRepresentation, TRANSACTION_ID_NOT_SPECIFIED, cursorContext, storeCursors );
    }

    public TransactionToApply( TransactionRepresentation transactionRepresentation, long transactionId, CursorContext cursorContext, StoreCursors storeCursors )
    {
        this.transactionRepresentation = transactionRepresentation;
        this.transactionId = transactionId;
        this.cursorContext = cursorContext;
        this.storeCursors = storeCursors;
    }

    // These methods are called by the user when building a batch
    public void next( TransactionToApply next )
    {
        nextTransactionInBatch = next;
    }

    public void publishAsCommitted()
    {
        commitment.publishAsCommitted( cursorContext );
    }

    public void publishAsClosed()
    {
        if ( commitment.markedAsCommitted() )
        {
            commitment.publishAsClosed( cursorContext );
        }
    }

    @Override
    public long transactionId()
    {
        return transactionId;
    }

    @Override
    public Subject subject()
    {
        if ( transactionRepresentation.getAuthSubject() == AuthSubject.AUTH_DISABLED )
        {
            return Subject.AUTH_DISABLED;
        }

        if ( transactionRepresentation.getAuthSubject() == AuthSubject.ANONYMOUS )
        {
            return Subject.ANONYMOUS;
        }

        return new Subject( transactionRepresentation.getAuthSubject().executingUser() );
    }

    @Override
    public CursorContext cursorContext()
    {
        return cursorContext;
    }

    @Override
    public StoreCursors storeCursors()
    {
        return storeCursors;
    }

    @Override
    public boolean accept( Visitor<StorageCommand,IOException> visitor ) throws IOException
    {
        return transactionRepresentation.accept( visitor );
    }

    public TransactionRepresentation transactionRepresentation()
    {
        return transactionRepresentation;
    }

    public void commitment( Commitment commitment, long transactionId )
    {
        this.commitment = commitment;
        this.transactionId = transactionId;
        this.cursorContext.getVersionContext().initWrite( transactionId );
    }

    public void logPosition( LogPosition position )
    {
        this.logPosition = position;
    }

    @Override
    public TransactionToApply next()
    {
        return nextTransactionInBatch;
    }

    public void onClose( LongConsumer closedCallback )
    {
        this.closedCallback = closedCallback;
    }

    @Override
    public void close()
    {
        if ( closedCallback != null )
        {
            closedCallback.accept( transactionId );
        }
    }

    @Override
    public String toString()
    {
        TransactionRepresentation tr = this.transactionRepresentation;
        return "Transaction #" + transactionId +
               (logPosition != null ? " at log position " + logPosition : " (no log position)") +
               " {started " + date( tr.getTimeStarted() ) +
               ", committed " + date( tr.getTimeCommitted() ) +
               ", with " + countCommands() + " commands in this transaction" +
               ", lease " + tr.getLeaseId() +
               ", latest committed transaction id when started was " + tr.getLatestCommittedTxWhenStarted() +
               ", additional header bytes: " + HexPrinter.hex( tr.additionalHeader(), Integer.MAX_VALUE, "" ) + "}";
    }

    private String countCommands()
    {
        class Counter implements Visitor<StorageCommand,IOException>
        {
            private int count;

            @Override
            public boolean visit( StorageCommand element )
            {
                count++;
                return false;
            }
        }
        try
        {
            Counter counter = new Counter();
            accept( counter );
            return String.valueOf( counter.count );
        }
        catch ( Throwable e )
        {
            return "(unable to count: " + e.getMessage() + ")";
        }
    }

    @Override
    public Iterator<StorageCommand> iterator()
    {
        return transactionRepresentation.iterator();
    }

}
