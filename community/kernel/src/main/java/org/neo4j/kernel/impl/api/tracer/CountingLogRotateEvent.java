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
package org.neo4j.kernel.impl.api.tracer;

import java.util.concurrent.atomic.AtomicLong;

import org.neo4j.kernel.impl.transaction.tracing.LogRotateEvent;

class CountingLogRotateEvent implements LogRotateEvent
{
    private final AtomicLong rotationCounter = new AtomicLong();
    private final AtomicLong accumulatedRotationTimeMillis = new AtomicLong();
    private volatile long lastRotationTimeMillis;

    @Override
    public void rotationCompleted( long rotationMillis )
    {
        rotationCounter.incrementAndGet();
        accumulatedRotationTimeMillis.addAndGet( rotationMillis );
        lastRotationTimeMillis = rotationMillis;
    }

    @Override
    public void close()
    {

    }

    long numberOfLogRotations()
    {
        return rotationCounter.get();
    }

    long logRotationAccumulatedTotalTimeMillis()
    {
        return accumulatedRotationTimeMillis.get();
    }

    long lastLogRotationTimeMillis()
    {
        return lastRotationTimeMillis;
    }
}
