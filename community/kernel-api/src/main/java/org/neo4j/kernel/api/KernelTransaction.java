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
package org.neo4j.kernel.api;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import org.neo4j.exceptions.KernelException;
import org.neo4j.graphdb.NotInTransactionException;
import org.neo4j.internal.kernel.api.CursorFactory;
import org.neo4j.internal.kernel.api.ExecutionStatistics;
import org.neo4j.internal.kernel.api.Locks;
import org.neo4j.internal.kernel.api.NodeCursor;
import org.neo4j.internal.kernel.api.Procedures;
import org.neo4j.internal.kernel.api.PropertyCursor;
import org.neo4j.internal.kernel.api.QueryContext;
import org.neo4j.internal.kernel.api.Read;
import org.neo4j.internal.kernel.api.RelationshipScanCursor;
import org.neo4j.internal.kernel.api.SchemaRead;
import org.neo4j.internal.kernel.api.SchemaWrite;
import org.neo4j.internal.kernel.api.Token;
import org.neo4j.internal.kernel.api.TokenRead;
import org.neo4j.internal.kernel.api.TokenWrite;
import org.neo4j.internal.kernel.api.Write;
import org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo;
import org.neo4j.internal.kernel.api.exceptions.FrozenLocksException;
import org.neo4j.internal.kernel.api.exceptions.InvalidTransactionTypeKernelException;
import org.neo4j.internal.kernel.api.exceptions.LocksNotFrozenException;
import org.neo4j.internal.kernel.api.exceptions.TransactionFailureException;
import org.neo4j.internal.kernel.api.security.AccessMode;
import org.neo4j.internal.kernel.api.security.AuthSubject;
import org.neo4j.internal.kernel.api.security.SecurityAuthorizationHandler;
import org.neo4j.internal.kernel.api.security.SecurityContext;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.internal.schema.IndexPrototype;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.kernel.api.exceptions.Status;
import org.neo4j.kernel.impl.api.ClockContext;
import org.neo4j.kernel.impl.api.InjectedNLIUpgradeCallback;
import org.neo4j.kernel.impl.coreapi.InternalTransaction;
import org.neo4j.memory.MemoryTracker;
import org.neo4j.storageengine.api.cursor.StoreCursors;

/**
 * A transaction with the graph database.
 *
 * Access to the graph is performed via sub-interfaces like {@link Read}.
 * Changes made within a transaction are immediately visible to all operations within it, but are only
 * visible to other transactions after the successful commit of the transaction.
 *
 * <p>
 * Typical usage:
 * <pre>
 * try ( Transaction transaction = db.beginTransaction() )
 * {
 *      ...
 *      transaction.commit();
 * }
 * catch ( SomeException e )
 * {
 *      ...
 * }
 * </pre>
 *
 * <p>
 * Typical usage of {@code rollback()}, if failure isn't controlled with exceptions:
 * <pre>
 * try ( Transaction transaction = db.beginTransaction() )
 * {
 *      ...
 *      if ( ... some condition )
 *      {
 *          transaction.rollback();
 *      }
 *      else
 *      {
 *          transaction.commit();
 *      }
 * }
 * </pre>
 */
public interface KernelTransaction extends AssertOpen, AutoCloseable
{
    /**
     * The store id of a rolled back transaction.
     */
    long ROLLBACK_ID = -1;
    /**
     * The store id of a read-only transaction.
     */
    long READ_ONLY_ID = 0;

    KernelTransactionMonitor NO_MONITOR = () -> {};

    /**
     * Commit and any changes introduced as part of this transaction.
     * Any transaction that was not committed will be rolled back when it will be closed.
     *
     * When {@code commit()} is completed, all resources are released and no more changes are possible in this transaction.
     *
     * @param kernelTransactionMonitor monitor for advanced interaction with commit process.
     * @return id of the committed transaction or {@link #ROLLBACK_ID} if transaction was rolled back or
     * {@link #READ_ONLY_ID} if transaction was read-only.
     */
    long commit( KernelTransactionMonitor kernelTransactionMonitor ) throws TransactionFailureException;

    /**
     * Commit without a {@link KernelTransactionMonitor}.
     *
     * @see #commit(KernelTransactionMonitor)
     */
    default long commit() throws TransactionFailureException
    {
        return commit( NO_MONITOR );
    }

    /**
     * Roll back and any changes introduced as part of this transaction.
     *
     * When {@code rollback()} is completed, all resources are released and no more changes are possible in this transaction.
     */
    void rollback() throws TransactionFailureException;

    /**
     * @return The Read operations of the graph. The returned instance targets the active transaction state layer.
     */
    Read dataRead();

    /**
     * @return The Write operations of the graph. The returned instance writes to the active transaction state layer.
     * @throws InvalidTransactionTypeKernelException when transaction cannot be upgraded to a write transaction. This
     * can happen when there have been schema modifications.
     */
    Write dataWrite() throws InvalidTransactionTypeKernelException;

    /**
     * @return Token read operations
     */
    TokenRead tokenRead();

    /**
     * @return Token write operations
     */
    TokenWrite tokenWrite();

    /**
     * @return Token read and write operations
     */
    Token token();

    /**
     * @return The schema index read operations of the graph, used for finding indexes.
     */
    SchemaRead schemaRead();

    /**
     * @return The schema index write operations of the graph, used for creating and dropping indexes and constraints.
     */
    SchemaWrite schemaWrite() throws InvalidTransactionTypeKernelException;

    /**
     * @return The lock operations of the graph.
     */
    Locks locks();

    /**
     * Forbid acquisition and releasing of locks on this transaction. Any call through the kernel API that
     * requires a lock to be acquired or released will throw a {@link FrozenLocksException}. Calling `freezeLocks`
     * several times will nest the freezing.
     *
     * A transaction can be opened to new lock interactions again by calling {@link KernelTransaction#thawLocks()}
     * once for every freeze.
     */
    void freezeLocks();

    /**
     * Allow acquisition and releasing of locks on this transaction. Thaws one nesting of {@link KernelTransaction#freezeLocks()},
     * which restores the Transaction to normal operation if there has been the same number of freeze and thaw calls.
     *
     * @throws LocksNotFrozenException if the locks were not frozen.
     */
    void thawLocks() throws LocksNotFrozenException;

    /**
     * @return The cursor factory
     */
    CursorFactory cursors();

    /**
     * @return Returns procedure operations
     */
    Procedures procedures();

    /**
     * @return statistics about the execution
     */
    ExecutionStatistics executionStatistics();

    /**
     * Closes this transaction, roll back any changes if {@link #commit()} was not called.
     *
     * @return id of the committed transaction or {@link #ROLLBACK_ID} if transaction was rolled back or
     * {@link #READ_ONLY_ID} if transaction was read-only.
     */
    long closeTransaction() throws TransactionFailureException;

    /**
     * Closes this transaction, roll back any changes if {@link #commit()} was not called.
     */
    @Override
    void close() throws TransactionFailureException;

    /**
     * @return {@code true} if the transaction is still open, i.e. if {@link #close()} hasn't been called yet.
     */
    boolean isOpen();

    /**
     * @return {@code true} if the transaction is closing, i.e. committing or rolling back.
     */
    boolean isClosing();

    /**
     * @return {@link Status} if {@link #markForTermination(Status)} has been invoked, otherwise empty optional.
     */
    Optional<Status> getReasonIfTerminated();

    /**
     * @return true if transaction was terminated, otherwise false
     */
    boolean isTerminated();

    /**
     * Marks this transaction for termination, such that it cannot commit successfully and will try to be
     * terminated by having other methods throw a specific termination exception, as to sooner reach the assumed
     * point where {@link #close()} will be invoked.
     */
    void markForTermination( Status reason );

    /**
     * Sets the user defined meta data to be associated with started queries.
     * @param data the meta data
     */
    void setMetaData( Map<String,Object> data );

    /**
     * Gets associated meta data.
     *
     * @return the meta data
     */
    Map<String,Object> getMetaData();

    /**
     * Sets additional status to be associated with particular transaction execution step.
     * @param statusDetails - additional status details.
     */
    void setStatusDetails( String statusDetails );

    /**
     * Gets additional status details if available
     * @return additional status details or empty string.
     */
    String statusDetails();

    enum Type
    {
        /**
         * An IMPLICIT transaction is automatically opened together with a query and does not allow multiple queries to be executed in it. The transaction
         * itself is never returned to the user, and they don't get any control over it. It commits/rollbacks automatically once the query is finished.
         */
        IMPLICIT,
        /**
         * An EXPLICIT transaction is opened by the user, they have control to commit it and roll it back, and they can execute multiple queries in that
         * transaction.
         */
        EXPLICIT
    }

    /**
     * Acquires a new {@link Statement} for this transaction which allows for reading and writing data from and
     * to the underlying database. After the group of reads and writes have been performed the statement
     * must be {@link Statement#close() released}.
     *
     * @return a {@link Statement} with access to underlying database.
     */
    Statement acquireStatement();

    /**
     * Create unique index which will be used to support uniqueness constraint.
     *
     * @param prototype the prototype of the unique index to create.
     * @return IndexReference for the index to be created.
     */
    IndexDescriptor indexUniqueCreate( IndexPrototype prototype ) throws KernelException;

    /**
     * @return the security context this transaction is currently executing in.
     * @throws NotInTransactionException if the transaction is closed.
     */
    SecurityContext securityContext();

    /**
     *
     * @return current security authorization handler
     */
    SecurityAuthorizationHandler securityAuthorizationHandler();

    /**
     * @return transaction originator info
     */
    ClientConnectionInfo clientInfo();

    /**
     * @return the subject executing this transaction, or {@link AuthSubject#ANONYMOUS} if the transaction is closed.
     */
    AuthSubject subjectOrAnonymous();

    /**
     * @return The timestamp of the last transaction that was committed to the store when this transaction started.
     */
    long lastTransactionTimestampWhenStarted();

    /**
     * @return The id of the last transaction that was committed to the store when this transaction started.
     */
    long lastTransactionIdWhenStarted();

    /**
     * Bind this kernel transaction to a user transaction
     */
    void bindToUserTransaction( InternalTransaction internalTransaction );

    /**
     * Return user transaction that is bound to current kernel transaction
     */
    InternalTransaction internalTransaction();

    /**
     * @return start time of this transaction
     */
    long startTime();

    /**
     * @return start time of this transaction, i.e. basically {@link System#nanoTime()} when user called
     */
    long startTimeNanos();

    /**
     * Timeout for transaction in milliseconds.
     * @return transaction timeout in milliseconds.
     */
    long timeout();

    /**
     * Kernel transaction type
     *
     * Implicit if created internally in the database
     * Explicit if created by the end user
     *
     * @return the transaction type: implicit or explicit
     */
    Type transactionType();

    /**
     * Return transaction id that assigned during transaction commit process.
     * @return transaction id.
     * @throws IllegalStateException if transaction id is not assigned yet
     */
    long getTransactionId();

    /**
     * Return the transaction id that is exposed to the users.
     * @return transaction id.
     */
    long getUserTransactionId();

    /**
     * Return transaction commit time (in millis) that assigned during transaction commit process.
     * @return transaction commit time
     * @throws IllegalStateException if commit time is not assigned yet
     */
    long getCommitTime();

    /**
     * Temporarily override this transaction's SecurityContext. The override should be reverted using
     * the returned {@link Revertable}.
     *
     * @param context the temporary SecurityContext.
     * @return {@link Revertable} which reverts to the original SecurityContext.
     */
    Revertable overrideWith( SecurityContext context );

    /**
     * This callback is used by upgrade listener to adapt transaction state
     * to the changes made by the upgrade transaction.
     */
    InjectedNLIUpgradeCallback injectedNLIUpgradeCallback();

    /**
     * Clocks associated with this transaction.
     */
    ClockContext clocks();

    /**
     * USE WITH CAUTION:
     * The internal node cursor instance used to serve kernel API calls. If some kernel API call
     * is made while this cursor is used, it might get corrupted and return wrong results.
     */
    NodeCursor ambientNodeCursor();

    /**
     * USE WITH CAUTION:
     * The internal relationship scan cursor instance used to serve kernel API calls. If some kernel
     * API call is made while this cursor is used, it might get corrupted and return wrong results.
     */
    RelationshipScanCursor ambientRelationshipCursor();

    /**
     * USE WITH CAUTION:
     * The internal property cursor instance used to serve kernel API calls. If some kernel
     * API call is made while this cursor is used, it might get corrupted and return wrong results.
     */
    PropertyCursor ambientPropertyCursor();

    /**
     * @return whether or not this transaction is a schema transaction. Type of transaction is decided
     * on first write operation, be it data or schema operation.
     */
    boolean isSchemaTransaction();

    /**
     * Get transaction local page cursor context
     * @return page cursor context
     */
    CursorContext cursorContext();

    /**
     * Create transaction execution context to be use in threads, separate to one where transaction is executed.
     * Resources that are passed over context should be safe to access from other thread.
     * Each separate execution thread should use its own independent execution context.
     * In the end of execution separate thread should call {@link ExecutionContext#complete()} to mark context as completed and prepare any execution statistic
     * After that transaction thread should call {@link ExecutionContext#close()}}
     * @return separate thread execution context
     */
    ExecutionContext createExecutionContext();

    /**
     * @return current transaction query execution context
     */
    QueryContext queryContext();

    /**
     * Get transaction local store cursors used to access underlying stores
     */
    StoreCursors storeCursors();

    /**
     * Get the memory tracker for this transaction.
     * @return underlying transaction memory tracker
     */
    MemoryTracker memoryTracker();

    @FunctionalInterface
    interface Revertable extends AutoCloseable
    {
        @Override
        void close();
    }

    /**
     * The id of the database which the transaction is connected to.
     * @return database id.
     */
    UUID getDatabaseId();

    /**
     * The name of the database which the transaction is connected to.
     * @return database name.
     */
    String getDatabaseName();

    /**
     * Whether this transaction can be committed or must instead be rolled back on close().
     */
    boolean canCommit();

    InnerTransactionHandler getInnerTransactionHandler();

    interface KernelTransactionMonitor
    {
        /**
         * Called during commit after all logical transaction state have been converted into storage commands,
         * but before the commands have been applied to the transaction log and store.
         */
        void beforeApply();
    }

    /**
     * Execution context that should be passed to workers in other threads but that are still belong to the transaction and need to have access to some
     * transactional resources.
     * Creation of context should be done in a transaction execution thread. Every other worker thread should have its own execution context.
     * In the end of evaluation worker thread should call {@link ExecutionContext#complete()} to mark context as completed and prepare data that needs
     * to be transferred back to owning transaction.
     * After that transaction executor thread should call {@link ExecutionContext#close()}
     */
    interface ExecutionContext extends AutoCloseable
    {
        /**
         * Execution context cursor tracer. Page cache statistic recorded during execution reported back to owning transaction only when context is closed.
         * @return execution context cursor tracer.
         */
        CursorContext cursorContext();

        /**
         * @return execution context security access mode
         */
        AccessMode accessMode();

        /**
         * Mark execution context as completed and prepare any data that needs to be reported back to owning transaction.
         * Should be called by thread where work was executed.
         */
        void complete();

        /**
         * Close execution context and merge back any data to the owning transaction if such exists.
         * Should be called by transaction thread.
         */
        @Override
        void close();
    }
}
