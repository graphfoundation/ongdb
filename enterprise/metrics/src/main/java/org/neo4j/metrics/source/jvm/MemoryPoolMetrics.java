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

import com.codahale.metrics.Gauge;
import com.codahale.metrics.MetricRegistry;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryPoolMXBean;

import org.neo4j.annotations.documented.Documented;

@Documented( ".JVM memory pools metrics." )
public class MemoryPoolMetrics extends JvmMetrics
{
    private static final String MEMORY_POOL_PREFIX = MetricRegistry.name( "vm", "memory.pool" );
    @Documented( "Estimated number of buffers in the pool." )
    private static final String MEMORY_POOL_USAGE_TEMPLATE;

    static
    {
        MEMORY_POOL_USAGE_TEMPLATE = MetricRegistry.name( MEMORY_POOL_PREFIX, "%s" );
    }

    private final String memoryPoolPrefix;
    private final String memoryPool;
    private final MetricRegistry registry;

    public MemoryPoolMetrics( String metricsPrefix, MetricRegistry registry )
    {
        this.registry = registry;
        this.memoryPoolPrefix = MetricRegistry.name( metricsPrefix, MEMORY_POOL_PREFIX );
        this.memoryPool = MetricRegistry.name( metricsPrefix, MEMORY_POOL_USAGE_TEMPLATE );
    }

    @Override
    public void start()
    {
        for ( final MemoryPoolMXBean memPool : ManagementFactory.getMemoryPoolMXBeans() )
        {
            this.registry.register( String.format( this.memoryPool, prettifyName( memPool.getName() ) ), (Gauge<Long>) () ->
            {
                return memPool.getUsage().getUsed();
            } );
        }
    }

    @Override
    public void stop()
    {
        registry.removeMatching( ( name, metric ) -> name.startsWith( memoryPoolPrefix ) );
    }
}
