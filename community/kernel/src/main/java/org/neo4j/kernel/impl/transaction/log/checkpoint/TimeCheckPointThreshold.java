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
package org.neo4j.kernel.impl.transaction.log.checkpoint;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import org.neo4j.time.SystemNanoClock;

class TimeCheckPointThreshold extends AbstractCheckPointThreshold
{
    private volatile long lastCheckPointedTransactionId;
    private volatile long lastCheckPointTimeNanos;

    private final long timeMillisThreshold;
    private final SystemNanoClock clock;

    TimeCheckPointThreshold( long thresholdMillis, SystemNanoClock clock )
    {
        super( "time threshold" );
        this.timeMillisThreshold = thresholdMillis;
        this.clock = clock;
        // The random start offset means database in a cluster will not all check-point at the same time.
        long randomStartOffset = thresholdMillis > 0 ? ThreadLocalRandom.current().nextLong( thresholdMillis ) : 0;
        this.lastCheckPointTimeNanos = clock.nanos() + TimeUnit.MILLISECONDS.toNanos( randomStartOffset );
    }

    @Override
    public void initialize( long transactionId )
    {
        lastCheckPointedTransactionId = transactionId;
    }

    @Override
    protected boolean thresholdReached( long lastCommittedTransactionId )
    {
        return lastCommittedTransactionId > lastCheckPointedTransactionId &&
               clock.nanos() - lastCheckPointTimeNanos >= TimeUnit.MILLISECONDS.toNanos( timeMillisThreshold );
    }

    @Override
    public void checkPointHappened( long transactionId )
    {
        lastCheckPointTimeNanos = clock.nanos();
        lastCheckPointedTransactionId = transactionId;
    }

    @Override
    public long checkFrequencyMillis()
    {
        return timeMillisThreshold;
    }
}
