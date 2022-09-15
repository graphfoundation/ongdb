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
package org.neo4j.kernel.availability;

import java.time.Clock;

import org.neo4j.kernel.impl.transaction.stats.TransactionCounters;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;

import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static java.util.concurrent.locks.LockSupport.parkNanos;

/**
 * This class handles whether the database as a whole is available to use at all.
 * As it runs as the last service in the lifecycle list, the stop() is called first
 * on stop, shutdown or restart, and thus blocks access to everything else for outsiders.
 */
public class DatabaseAvailability extends LifecycleAdapter
{
    private static final AvailabilityRequirement UNAVAILABILITY_REQUIREMENT = new DescriptiveAvailabilityRequirement( "Database unavailable" );
    private final AvailabilityGuard databaseAvailabilityGuard;
    private final TransactionCounters transactionCounters;
    private final Clock clock;
    private final long awaitActiveTransactionDeadlineMillis;

    public DatabaseAvailability( AvailabilityGuard databaseAvailabilityGuard, TransactionCounters transactionCounters, Clock clock,
            long awaitActiveTransactionDeadlineMillis )
    {
        this.databaseAvailabilityGuard = databaseAvailabilityGuard;
        this.transactionCounters = transactionCounters;
        this.awaitActiveTransactionDeadlineMillis = awaitActiveTransactionDeadlineMillis;
        this.clock = clock;
    }

    @Override
    public void init() throws Exception
    {
        databaseAvailabilityGuard.require( UNAVAILABILITY_REQUIREMENT );
    }

    @Override
    public void start()
    {
        databaseAvailabilityGuard.fulfill( UNAVAILABILITY_REQUIREMENT );
    }

    @Override
    public void stop()
    {
        // Database is no longer available for use
        // Deny beginning new transactions
        databaseAvailabilityGuard.require( UNAVAILABILITY_REQUIREMENT );

        // Await transactions stopped
        awaitTransactionsClosedWithinTimeout();
    }

    private void awaitTransactionsClosedWithinTimeout()
    {
        long deadline = clock.millis() + awaitActiveTransactionDeadlineMillis;
        while ( transactionCounters.getNumberOfActiveTransactions() > 0 && clock.millis() < deadline )
        {
            parkNanos( MILLISECONDS.toNanos( 10 ) );
        }
    }
}
