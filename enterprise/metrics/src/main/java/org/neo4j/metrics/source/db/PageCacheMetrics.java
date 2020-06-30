/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB Enterprise Edition. The included source
 * code can be redistributed and/or modified under the terms of the
 * GNU AFFERO GENERAL PUBLIC LICENSE Version 3
 * (http://www.fsf.org/licensing/licenses/agpl-3.0.html) as found
 * in the associated LICENSE.txt file.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 */
package org.neo4j.metrics.source.db;

import com.codahale.metrics.Gauge;
import com.codahale.metrics.MetricRegistry;

import org.neo4j.annotations.documented.Documented;
import org.neo4j.io.pagecache.monitoring.PageCacheCounters;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.metrics.meter.MeterCounter;

@Documented( ".Database page cache metrics" )
public class PageCacheMetrics extends LifecycleAdapter
{
    private static final String PAGE_CACHE_PREFIX = "page_cache";
    @Documented( "The total number of exceptions seen during the eviction process in the page cache." )
    private static final String PC_EVICTION_EXCEPTIONS_TEMPLATE = MetricRegistry.name( "page_cache", "eviction_exceptions" );
    @Documented( "The total number of flushes executed by the page cache." )
    private static final String PC_FLUSHES_TEMPLATE = MetricRegistry.name( "page_cache", "flushes" );
    @Documented( "The total number of page unpins executed by the page cache." )
    private static final String PC_UNPINS_TEMPLATE = MetricRegistry.name( "page_cache", "unpins" );
    @Documented( "The total number of page pins executed by the page cache." )
    private static final String PC_PINS_TEMPLATE = MetricRegistry.name( "page_cache", "pins" );
    @Documented( "The total number of page evictions executed by the page cache." )
    private static final String PC_EVICTIONS_TEMPLATE = MetricRegistry.name( "page_cache", "evictions" );
    @Documented( "The total number of page faults happened in the page cache." )
    private static final String PC_PAGE_FAULTS_TEMPLATE = MetricRegistry.name( "page_cache", "page_faults" );
    @Documented( "The total number of page hits happened in the page cache." )
    private static final String PC_HITS_TEMPLATE = MetricRegistry.name( "page_cache", "hits" );
    @Documented( "The ratio of hits to the total number of lookups in the page cache." )
    private static final String PC_HIT_RATIO_TEMPLATE = MetricRegistry.name( "page_cache", "hit_ratio" );
    @Documented( "The ratio of number of used pages to total number of available pages." )
    private static final String PC_USAGE_RATIO_TEMPLATE = MetricRegistry.name( "page_cache", "usage_ratio" );
    private final String pcEvictionExceptions;
    private final String pcFlushes;
    private final String pcUnpins;
    private final String pcPins;
    private final String pcEvictions;
    private final String pcPageFaults;
    private final String pcHits;
    private final String pcHitRatio;
    private final String pcUsageRatio;
    private final MetricRegistry registry;
    private final PageCacheCounters pageCacheCounters;

    public PageCacheMetrics( String metricsPrefix, MetricRegistry registry, PageCacheCounters pageCacheCounters )
    {
        this.registry = registry;
        this.pageCacheCounters = pageCacheCounters;
        this.pcEvictionExceptions = MetricRegistry.name( metricsPrefix, PC_EVICTION_EXCEPTIONS_TEMPLATE );
        this.pcFlushes = MetricRegistry.name( metricsPrefix, PC_FLUSHES_TEMPLATE );
        this.pcUnpins = MetricRegistry.name( metricsPrefix, PC_UNPINS_TEMPLATE );
        this.pcPins = MetricRegistry.name( metricsPrefix, PC_PINS_TEMPLATE );
        this.pcEvictions = MetricRegistry.name( metricsPrefix, PC_EVICTIONS_TEMPLATE );
        this.pcPageFaults = MetricRegistry.name( metricsPrefix, PC_PAGE_FAULTS_TEMPLATE );
        this.pcHits = MetricRegistry.name( metricsPrefix, PC_HITS_TEMPLATE );
        this.pcHitRatio = MetricRegistry.name( metricsPrefix, PC_HIT_RATIO_TEMPLATE );
        this.pcUsageRatio = MetricRegistry.name( metricsPrefix, PC_USAGE_RATIO_TEMPLATE );
    }

    @Override
    public void start()
    {
        registry.register( pcPageFaults, new MeterCounter( pageCacheCounters::faults ) );
        registry.register( pcEvictions, new MeterCounter( pageCacheCounters::evictions ) );
        registry.register( pcPins, new MeterCounter( pageCacheCounters::pins ) );
        registry.register( pcUnpins, new MeterCounter( pageCacheCounters::unpins ) );
        registry.register( pcHits, new MeterCounter( pageCacheCounters::hits ) );
        registry.register( pcFlushes, new MeterCounter( pageCacheCounters::flushes ) );
        registry.register( pcEvictionExceptions, new MeterCounter( pageCacheCounters::evictionExceptions ) );
        registry.register( pcHitRatio, new PageCacheHitStatsGauge( pageCacheCounters ) );
        registry.register( pcUsageRatio, (Gauge<Double>) pageCacheCounters::usageRatio );
    }

    @Override
    public void stop()
    {
        this.registry.remove( this.pcPageFaults );
        this.registry.remove( this.pcEvictions );
        this.registry.remove( this.pcPins );
        this.registry.remove( this.pcUnpins );
        this.registry.remove( this.pcHits );
        this.registry.remove( this.pcFlushes );
        this.registry.remove( this.pcEvictionExceptions );
        this.registry.remove( this.pcHitRatio );
        this.registry.remove( this.pcUsageRatio );
    }
}
