/*
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
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

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;

import org.neo4j.annotations.documented.Documented;
import org.neo4j.metrics.meter.MeterCounter;

import static com.codahale.metrics.MetricRegistry.name;

public class GCMetrics extends JvmMetrics
{
    private static final String GC_PREFIX = MetricRegistry.name( NAME_PREFIX, "gc" );
    @Documented( "Accumulated garbage collection time in milliseconds." )
    private static final String GC_TIME_TEMPLATE;
    @Documented( "Total number of garbage collections." )
    private static final String GC_COUNT_TEMPLATE;

    static
    {
        GC_TIME_TEMPLATE = MetricRegistry.name( GC_PREFIX, "time", "%s" );
        GC_COUNT_TEMPLATE = MetricRegistry.name( GC_PREFIX, "count", "%s" );
    }

    private final String gcPrefix;
    private final String gcTime;
    private final String gcCount;
    private final MetricRegistry registry;

    public GCMetrics( String metricsPrefix, MetricRegistry registry )
    {
        this.registry = registry;
        this.gcPrefix = MetricRegistry.name( metricsPrefix, GC_PREFIX );
        this.gcTime = MetricRegistry.name( metricsPrefix, GC_TIME_TEMPLATE );
        this.gcCount = MetricRegistry.name( metricsPrefix, GC_COUNT_TEMPLATE );
    }

    @Override
    public void start()
    {
        for ( final GarbageCollectorMXBean gcBean : ManagementFactory.getGarbageCollectorMXBeans() )
        {
            registry.register( name( gcTime, prettifyName( gcBean.getName() ) ),
                               new MeterCounter( gcBean::getCollectionTime ) );
            registry.register( name( gcCount, prettifyName( gcBean.getName() ) ),
                               new MeterCounter( gcBean::getCollectionCount ) );
        }
    }

    @Override
    public void stop()
    {
        registry.removeMatching( ( name, metric ) -> name.startsWith( GC_PREFIX ) );
    }
}
