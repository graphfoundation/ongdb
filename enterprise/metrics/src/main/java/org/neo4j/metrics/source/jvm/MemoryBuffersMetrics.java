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

import java.lang.management.BufferPoolMXBean;
import java.lang.management.ManagementFactory;

import org.neo4j.annotations.documented.Documented;
import org.neo4j.metrics.meter.MeterCounter;

@Documented( ".JVM memory buffers metrics." )
public class MemoryBuffersMetrics extends JvmMetrics
{
    private static final String MEMORY_BUFFER_PREFIX = MetricRegistry.name( "vm", "memory.buffer" );
    @Documented( "Estimated number of buffers in the pool." )
    private static final String MEMORY_BUFFER_COUNT_TEMPLATE;
    @Documented( "Estimated amount of memory used by the pool." )
    private static final String MEMORY_BUFFER_USED_TEMPLATE;
    @Documented( "Estimated total capacity of buffers in the pool." )
    private static final String MEMORY_BUFFER_CAPACITY_TEMPLATE;

    static
    {
        MEMORY_BUFFER_COUNT_TEMPLATE = MetricRegistry.name( MEMORY_BUFFER_PREFIX, "%s", "count" );
        MEMORY_BUFFER_USED_TEMPLATE = MetricRegistry.name( MEMORY_BUFFER_PREFIX, "%s", "used" );
        MEMORY_BUFFER_CAPACITY_TEMPLATE = MetricRegistry.name( MEMORY_BUFFER_PREFIX, "%s", "capacity" );
    }

    private final MetricRegistry registry;
    private final String memoryBufferPrefix;
    private final String memoryBufferCount;
    private final String memoryBufferUsed;
    private final String memoryBufferCapacity;

    public MemoryBuffersMetrics( String metricsPrefix, MetricRegistry registry )
    {
        this.registry = registry;
        this.memoryBufferPrefix = MetricRegistry.name( metricsPrefix, MEMORY_BUFFER_PREFIX );
        this.memoryBufferCount = MetricRegistry.name( metricsPrefix, MEMORY_BUFFER_COUNT_TEMPLATE );
        this.memoryBufferUsed = MetricRegistry.name( metricsPrefix, MEMORY_BUFFER_USED_TEMPLATE );
        this.memoryBufferCapacity = MetricRegistry.name( metricsPrefix, MEMORY_BUFFER_CAPACITY_TEMPLATE );
    }

    @Override
    public void start()
    {

        for ( final BufferPoolMXBean pool : ManagementFactory.getPlatformMXBeans( BufferPoolMXBean.class ) )
        {
            String poolPrettyName = prettifyName( pool.getName() );
            registry.register( memoryBufferCount + poolPrettyName, new MeterCounter( pool::getCount ) );
            registry.register( memoryBufferUsed + poolPrettyName, new MeterCounter( pool::getMemoryUsed ) );
            registry.register( memoryBufferCapacity + poolPrettyName, new MeterCounter( pool::getTotalCapacity ) );
        }
    }

    @Override
    public void stop()
    {
        registry.removeMatching( ( name, metric ) -> name.startsWith( memoryBufferPrefix ) );
    }
}
