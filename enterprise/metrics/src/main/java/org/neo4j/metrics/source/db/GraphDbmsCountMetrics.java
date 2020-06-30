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

import com.codahale.metrics.Gauge;
import com.codahale.metrics.MetricRegistry;

import java.util.function.Supplier;

import org.neo4j.annotations.documented.Documented;
import org.neo4j.kernel.impl.store.stats.StoreEntityCounters;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;

import static com.codahale.metrics.MetricRegistry.name;

@Documented( ".Database data count metrics" )
public class GraphDbmsCountMetrics extends LifecycleAdapter
{
    private static final String COUNTS_PREFIX = "dbms.count";
    @Documented( "The total number of relationships in the db" )
    public static final String COUNTS_RELATIONSHIP = name( COUNTS_PREFIX, "relationship" );
    @Documented( "The total number of nodes in the db" )
    public static final String COUNTS_NODE = name( COUNTS_PREFIX, "node" );

    private final String metricsPrefix;
    private final MetricRegistry registry;
    private final Supplier<StoreEntityCounters> countsSource;

    public GraphDbmsCountMetrics( String metricsPrefix, MetricRegistry registry, Supplier<StoreEntityCounters> countsSource )
    {
        this.metricsPrefix = metricsPrefix;
        this.registry = registry;
        this.countsSource = countsSource;
    }

    @Override
    public void start()
    {

        this.registry.register( metricsName( COUNTS_NODE ), (Gauge<Long>) () ->
        {
            return (this.countsSource.get()).allNodesCountStore();
        } );

        this.registry.register( metricsName( COUNTS_RELATIONSHIP ), (Gauge<Long>) () ->
        {
            return (countsSource.get()).allRelationshipsCountStore();
        } );
    }

    @Override
    public void stop()
    {
        this.registry.remove( metricsName( COUNTS_NODE ) );
        this.registry.remove( metricsName( COUNTS_RELATIONSHIP ) );
    }

    /**
     * @param metricsName
     * @return
     */
    private String metricsName( String metricsName )
    {
        return name( metricsPrefix, metricsName );
    }
}
