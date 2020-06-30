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

package org.neo4j.metrics.source.jvm;

import com.codahale.metrics.MetricRegistry;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;

import org.neo4j.annotations.documented.Documented;
import org.neo4j.metrics.meter.MeterCounter;

@Documented( ".JVM heap metrics." )
public class HeapMemoryJvmMetrics extends JvmMetrics
{

    public static final String HEAP_COMMITTED_TEMPLATE = MetricRegistry.name( JvmMetrics.NAME_PREFIX, "heap.committed" );
    public static final String HEAP_USED_TEMPLATE = MetricRegistry.name( JvmMetrics.NAME_PREFIX, "heap.used" );
    public static final String HEAP_MAX_TEMPLATE = MetricRegistry.name( JvmMetrics.NAME_PREFIX, "heap.max" );
    private final MetricRegistry registry;
    private final String heapCommitted;
    private final String heapUsed;
    private final String heapMax;

    /**
     * @param metricsPrefix
     * @param registry
     */
    public HeapMemoryJvmMetrics( String metricsPrefix, MetricRegistry registry )
    {
        this.registry = registry;
        this.heapCommitted = MetricRegistry.name( metricsPrefix, HEAP_COMMITTED_TEMPLATE );
        this.heapUsed = MetricRegistry.name( metricsPrefix, HEAP_USED_TEMPLATE );
        this.heapMax = MetricRegistry.name( metricsPrefix, HEAP_MAX_TEMPLATE );
    }

    @Override
    public void start()
    {

        HeapMemoryUsageProvider heapMemoryUsageProvider = new HeapMemoryUsageProvider();

        registry.register( heapCommitted, new MeterCounter( heapMemoryUsageProvider::getCommitted ) );
        registry.register( heapUsed, new MeterCounter( heapMemoryUsageProvider::getUsed ) );
        registry.register( heapMax, new MeterCounter( heapMemoryUsageProvider::getMax ) );
    }

    @Override
    public void stop()
    {
        registry.remove( heapMax );
        registry.remove( heapUsed );
        registry.remove( heapCommitted );
    }

    /**
     *
     */
    public static class HeapMemoryUsageProvider
    {
        private final MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
        private volatile MemoryUsage lastMemoryUsage;

        private HeapMemoryUsageProvider()
        {
            this.lastMemoryUsage = this.memoryMXBean.getHeapMemoryUsage();
        }

        private long getCommitted()
        {
            this.lastMemoryUsage = this.memoryMXBean.getHeapMemoryUsage();
            return this.lastMemoryUsage.getCommitted();
        }

        private long getUsed()
        {
            return this.lastMemoryUsage.getUsed();
        }

        private long getMax()
        {
            return this.lastMemoryUsage.getMax();
        }
    }
}
