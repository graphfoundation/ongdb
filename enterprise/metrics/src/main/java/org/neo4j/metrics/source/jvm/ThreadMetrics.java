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
package org.neo4j.metrics.source.jvm;

import com.codahale.metrics.MetricRegistry;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

import org.neo4j.annotations.documented.Documented;
import org.neo4j.metrics.meter.MeterCounter;

@Documented( ".JVM threads metrics." )
public class ThreadMetrics extends JvmMetrics
{
    @Documented( "Estimated number of active threads in the current thread group." )
    private static final String THREAD_COUNT_TEMPLATE = MetricRegistry.name( "vm", "thread.count" );
    @Documented( "The total number of live threads including daemon and non-daemon threads." )
    private static final String THREAD_TOTAL_TEMPLATE = MetricRegistry.name( "vm", "thread.total" );
    private final String threadCount;
    private final String threadTotal;
    private final MetricRegistry registry;
    private final ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();

    public ThreadMetrics( String metricsPrefix, MetricRegistry registry )
    {
        this.registry = registry;
        this.threadCount = MetricRegistry.name( metricsPrefix, THREAD_COUNT_TEMPLATE );
        this.threadTotal = MetricRegistry.name( metricsPrefix, THREAD_TOTAL_TEMPLATE );
    }

    @Override
    public void start()
    {
        registry.register( threadCount, new MeterCounter( Thread::activeCount ) );
        registry.register( threadTotal, new MeterCounter( threadMXBean::getThreadCount ) );
    }

    @Override
    public void stop()
    {
        this.registry.remove( this.threadCount );
        this.registry.remove( this.threadTotal );
    }
}

