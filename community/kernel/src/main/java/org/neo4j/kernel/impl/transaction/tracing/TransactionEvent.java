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
package org.neo4j.kernel.impl.transaction.tracing;

/**
 * A trace event that represents a transaction with the database, and its lifetime.
 */
public interface TransactionEvent extends AutoCloseable
{
    TransactionEvent NULL = new TransactionEvent()
    {
        @Override
        public void setSuccess( boolean success )
        {
        }

        @Override
        public void setFailure( boolean failure )
        {
        }

        @Override
        public CommitEvent beginCommitEvent()
        {
            return CommitEvent.NULL;
        }

        @Override
        public void close()
        {
        }

        @Override
        public void setTransactionWriteState( String transactionWriteState )
        {
        }

        @Override
        public void setReadOnly( boolean wasReadOnly )
        {
        }
    };

    /**
     * The transaction was marked as successful.
     */
    void setSuccess( boolean success );

    /**
     * The transaction was marked as failed.
     */
    void setFailure( boolean failure );

    /**
     * Begin the process of committing the transaction.
     */
    CommitEvent beginCommitEvent();

    /**
     * Mark the end of the transaction, after it has been committed or rolled back.
     */
    @Override
    void close();

    /**
     * Set write state of the transaction
     */
    void setTransactionWriteState( String transactionWriteState );

    /**
     * Specify that the transaction was read-only.
     */
    void setReadOnly( boolean wasReadOnly );
}
