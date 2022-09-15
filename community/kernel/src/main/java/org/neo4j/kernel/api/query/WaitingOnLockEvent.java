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
package org.neo4j.kernel.api.query;

import org.neo4j.lock.LockTracer;
import org.neo4j.lock.LockType;
import org.neo4j.lock.LockWaitEvent;
import org.neo4j.lock.ResourceType;

/**
 * This is both a status state in the state machine of {@link ExecutingQuery}, and a {@link LockWaitEvent}.
 * The reason for this is to avoid unnecessary object allocation and indirection, since there is always a one-to-one
 * mapping between the status corresponding to the lock we are waiting on (caused by
 * {@linkplain LockTracer#waitForLock(LockType, ResourceType, long, long...)} the event of waiting
 * on a lock}) and the event object used to {@linkplain LockWaitEvent#close() signal the end of the wait}.
 */
class WaitingOnLockEvent extends WaitingOnLock implements LockWaitEvent
{
    private final ExecutingQueryStatus previous;
    private final ExecutingQuery executingQuery;

    WaitingOnLockEvent(
            LockType lockType,
            ResourceType resourceType,
            long transactionId,
            long[] resourceIds,
            ExecutingQuery executingQuery,
            long currentTimeNanos,
            ExecutingQueryStatus previous )
    {
        super( lockType, resourceType, transactionId, resourceIds, currentTimeNanos );
        this.executingQuery = executingQuery;
        this.previous = previous;
    }

    ExecutingQueryStatus previousStatus()
    {
        return previous;
    }

    @Override
    public void close()
    {
        executingQuery.doneWaitingOnLock( this );
    }

    @Override
    boolean isParsingOrPlanning()
    {
        return previous.isParsingOrPlanning();
    }
}
