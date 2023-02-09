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
package org.neo4j.internal.helpers;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class DefaultTimeoutStrategy implements TimeoutStrategy
{
    public static DefaultTimeoutStrategy exponential( long initialTime, long upperBoundTime, TimeUnit timeUnit )
    {
        return new DefaultTimeoutStrategy( initialTime, upperBoundTime, timeUnit, i -> i * 2 );
    }

    public static DefaultTimeoutStrategy constant( long initialTime, TimeUnit timeUnit )
    {
        return new DefaultTimeoutStrategy( initialTime, initialTime, timeUnit, i -> i );
    }

    private final Function<Long,Long> increasingFunction;
    private final long startTimeMillis;
    private final long upperBoundTime;

    public DefaultTimeoutStrategy( long initialTime, long upperBoundTime, TimeUnit timeUnit, Function<Long,Long> increasingFunction )
    {
        if ( initialTime > increasingFunction.apply( initialTime ) )
        {
            throw new IllegalArgumentException( "passed function can't decrease" );
        }
        if ( initialTime < 0 )
        {
            throw new IllegalArgumentException( "initial time can't be less than zero" );
        }
        this.startTimeMillis = timeUnit.toMillis( initialTime );
        this.increasingFunction = increasingFunction;
        this.upperBoundTime = timeUnit.toMillis( upperBoundTime );
    }

    @Override
    public Timeout newTimeout()
    {
        return new Timeout()
        {
            private long currentTimeMillis = startTimeMillis;

            @Override
            public long getMillis()
            {
                return currentTimeMillis;
            }

            @Override
            public void increment()
            {
                currentTimeMillis = Math.min( upperBoundTime, increasingFunction.apply( currentTimeMillis ) );
            }
        };
    }
}
