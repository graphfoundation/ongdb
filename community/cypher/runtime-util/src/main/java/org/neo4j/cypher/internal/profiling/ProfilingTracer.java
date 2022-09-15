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
package org.neo4j.cypher.internal.profiling;

import java.util.HashMap;
import java.util.Map;

import org.neo4j.cypher.internal.util.attribution.Id;
import org.neo4j.cypher.result.OperatorProfile;
import org.neo4j.cypher.result.QueryProfile;

public class ProfilingTracer implements QueryProfiler, QueryProfile
{
    public interface Clock
    {
        long nanoTime();

        Clock SYSTEM_TIMER = System::nanoTime;
    }

    private final Clock clock;
    private final KernelStatisticProvider statisticProvider;
    private final Map<Integer, ProfilingTracerData> data = new HashMap<>();

    public ProfilingTracer( KernelStatisticProvider statisticProvider )
    {
        this( Clock.SYSTEM_TIMER, statisticProvider );
    }

    ProfilingTracer( Clock clock, KernelStatisticProvider statisticProvider )
    {
        this.clock = clock;
        this.statisticProvider = statisticProvider;
    }

    @Override
    public OperatorProfile operatorProfile( int operatorId )
    {
        ProfilingTracerData value = data.get( operatorId );
        if ( value == null )
        {
            return OperatorProfile.ZERO;
        }
        else
        {
            value.sanitize();
            return value;
        }
    }

    @Override
    public long maxAllocatedMemory()
    {
        return OperatorProfile.NO_DATA;
    }

    public long timeOf( Id operatorId )
    {
        return operatorProfile( operatorId.x() ).time();
    }

    public long dbHitsOf( Id operatorId )
    {
        return operatorProfile( operatorId.x() ).dbHits();
    }

    public long rowsOf( Id operatorId )
    {
        return operatorProfile( operatorId.x() ).rows();
    }

    @Override
    public OperatorProfileEvent executeOperator( Id operatorId )
    {
        return executeOperator( operatorId, true );
    }

    @Override
    public OperatorProfileEvent executeOperator( Id operatorId, boolean trackTime )
    {
        ProfilingTracerData operatorData = this.data.get( operatorId.x() );
        if ( operatorData == null )
        {
            operatorData = new ProfilingTracerData();
            this.data.put( operatorId.x(), operatorData );
        }
        if ( trackTime )
        {
            return new TrackingExecutionEvent( clock, statisticProvider, operatorData );
        }
        else
        {
            return new ExecutionEvent( statisticProvider, operatorData );
        }
    }

    @Override
    public String toString()
    {
        return String.format( "ProfilingTracer { %s }", data );
    }

    private static class ExecutionEvent extends OperatorProfileEvent
    {
        final ProfilingTracerData data;
        final KernelStatisticProvider statisticProvider;
        long hitCount;
        long rowCount;

        ExecutionEvent( KernelStatisticProvider statisticProvider, ProfilingTracerData data )
        {
            this.statisticProvider = statisticProvider;
            this.data = data;
        }

        @Override
        public void close()
        {
            data.update( OperatorProfile.NO_DATA, hitCount, rowCount,  OperatorProfile.NO_DATA,  OperatorProfile.NO_DATA, OperatorProfile.NO_DATA );
        }

        @Override
        public void dbHit()
        {
            hitCount++;
        }

        @Override
        public void dbHits( long hits )
        {
            hitCount += hits;
        }

        @Override
        public void row()
        {
            rowCount++;
        }

        @Override
        public void row( boolean hasRow )
        {
            if ( hasRow )
            {
                rowCount++;
            }
        }

        @Override
        public void rows( long n )
        {
            rowCount += n;
        }
    }

    private static class TrackingExecutionEvent extends ExecutionEvent
    {
        private final long start;
        private final Clock clock;
        private long pageCountHitsStart;
        private long pageCountMissesStart;

        TrackingExecutionEvent( Clock clock, KernelStatisticProvider statisticProvider, ProfilingTracerData data )
        {
            super( statisticProvider, data );
            this.clock = clock;
            this.start = clock.nanoTime();
            this.pageCountHitsStart = statisticProvider.getPageCacheHits();
            this.pageCountMissesStart = statisticProvider.getPageCacheMisses();
        }

        @Override
        public void close()
        {
            long pageCacheHits = statisticProvider.getPageCacheHits();
            long pageCacheFaults = statisticProvider.getPageCacheMisses();
            long executionTime = clock.nanoTime() - start;
            data.update( executionTime,
                         hitCount,
                         rowCount,
                         pageCacheHits - pageCountHitsStart,
                         pageCacheFaults - pageCountMissesStart,
                         OperatorProfile.NO_DATA );
        }
    }
}
