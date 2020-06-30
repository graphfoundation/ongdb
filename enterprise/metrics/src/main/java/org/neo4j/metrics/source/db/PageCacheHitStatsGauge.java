/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 *   This file is part of ONgDB.
 *
 *   ONgDB is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.neo4j.metrics.source.db;

import com.codahale.metrics.Clock;
import com.codahale.metrics.Gauge;
import com.codahale.metrics.SlidingTimeWindowArrayReservoir;
import com.codahale.metrics.Snapshot;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.neo4j.annotations.documented.Documented;
import org.neo4j.internal.helpers.MathUtil;
import org.neo4j.io.pagecache.monitoring.PageCacheCounters;

@Documented( ".Page cache hit statistics gauge." )
class PageCacheHitStatsGauge implements Gauge<Double>
{
    private final PageCacheCounters pageCacheCounters;
    private final SlidingTimeWindowArrayReservoir hitsWindow;
    private final SlidingTimeWindowArrayReservoir missesWindow;

    PageCacheHitStatsGauge( PageCacheCounters pageCacheCounters, Duration windowDuration, Clock clock )
    {
        long windowSeconds = windowDuration.getSeconds();
        this.hitsWindow = new SlidingTimeWindowArrayReservoir( windowSeconds, TimeUnit.SECONDS, clock );
        this.missesWindow = new SlidingTimeWindowArrayReservoir( windowSeconds, TimeUnit.SECONDS, clock );
        this.pageCacheCounters = pageCacheCounters;
    }

    PageCacheHitStatsGauge( PageCacheCounters pageCacheCounters )
    {
        this( pageCacheCounters, Duration.ofMinutes( 1L ), Clock.defaultClock() );
    }

    @Override
    public Double getValue()
    {
        this.hitsWindow.update( this.pageCacheCounters.hits() );
        this.missesWindow.update( this.pageCacheCounters.faults() );
        long hits = this.getSnapshotHits();
        long misses = this.getSnapshotMisses();
        return MathUtil.portion( (double) hits, (double) misses );
    }

    /**
     * @return
     */
    private long getSnapshotMisses()
    {
        Snapshot snapshot = this.missesWindow.getSnapshot();
        return Math.subtractExact( snapshot.getMax(), snapshot.getMin() );
    }

    /**
     * @return
     */
    private long getSnapshotHits()
    {
        Snapshot snapshot = this.hitsWindow.getSnapshot();
        return Math.subtractExact( snapshot.getMax(), snapshot.getMin() );
    }
}
