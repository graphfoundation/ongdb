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
package org.neo4j.kernel.impl.transaction;

import org.neo4j.internal.kernel.api.security.AuthSubject;
import org.neo4j.kernel.KernelVersion;
import org.neo4j.kernel.impl.api.LeaseService;
import org.neo4j.kernel.impl.transaction.log.TransactionAppender;
import org.neo4j.storageengine.api.CommandStream;

/**
 * Representation of a transaction that can be written to a {@link TransactionAppender} and read back later.
 */
public interface TransactionRepresentation extends CommandStream
{
    /**
     * @return an additional header of this transaction. Just arbitrary bytes that means nothing
     * to this transaction representation.
     */
    byte[] additionalHeader();

    /**
     * @return time when transaction was started, i.e. when the user started it, not when it was committed.
     * Reported in milliseconds.
     */
    long getTimeStarted();

    /**
     * @return last committed transaction id at the time when this transaction was started.
     */
    long getLatestCommittedTxWhenStarted();

    /**
     * @return time when transaction was committed. Reported in milliseconds.
     */
    long getTimeCommitted();

    /**
     * @return the identifier for the lease associated with this transaction, or {@value LeaseService#NO_LEASE}.
     * This is only used for coordinating transaction validity in a cluster.
     */
    int getLeaseId();

    /**
     * @return the subject associated with the transaction.
     * Typically an authenticated end user that created the transaction.
     */
    AuthSubject getAuthSubject();

    KernelVersion version();
}
