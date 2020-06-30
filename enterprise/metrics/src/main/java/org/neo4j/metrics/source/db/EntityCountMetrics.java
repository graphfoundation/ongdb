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

import com.codahale.metrics.MetricRegistry;

import java.util.function.Supplier;

import org.neo4j.annotations.documented.Documented;
import org.neo4j.kernel.impl.store.stats.StoreEntityCounters;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.metrics.meter.MeterCounter;

@Documented( ".Database data metrics" )
public class EntityCountMetrics extends LifecycleAdapter
{
    private static final String COUNTS_PREFIX = "ids_in_use";
    @Documented( "The total number of different relationship types stored in the db." )
    private static final String COUNTS_RELATIONSHIP_TYPE_TEMPLATE = MetricRegistry.name( "ids_in_use", "relationship_type" );
    @Documented( "The total number of different property names used in the db." )
    private static final String COUNTS_PROPERTY_TEMPLATE = MetricRegistry.name( "ids_in_use", "property" );
    @Documented( "The total number of relationships stored in the db." )
    private static final String COUNTS_RELATIONSHIP_TEMPLATE = MetricRegistry.name( "ids_in_use", "relationship" );
    @Documented( "The total number of nodes stored in the db." )
    private static final String COUNTS_NODE_TEMPLATE = MetricRegistry.name( "ids_in_use", "node" );
    private final String countsRelationshipType;
    private final String countsProperty;
    private final String countsRelationship;
    private final String countsNode;
    private final MetricRegistry registry;
    private final Supplier<StoreEntityCounters> storeEntityCounters;

    public EntityCountMetrics( String metricsPrefix, MetricRegistry registry, Supplier<StoreEntityCounters> storeEntityCounters )
    {
        this.countsRelationshipType = MetricRegistry.name( metricsPrefix, COUNTS_RELATIONSHIP_TYPE_TEMPLATE );
        this.countsProperty = MetricRegistry.name( metricsPrefix, COUNTS_PROPERTY_TEMPLATE );
        this.countsRelationship = MetricRegistry.name( metricsPrefix, COUNTS_RELATIONSHIP_TEMPLATE );
        this.countsNode = MetricRegistry.name( metricsPrefix, COUNTS_NODE_TEMPLATE );
        this.registry = registry;
        this.storeEntityCounters = storeEntityCounters;
    }

    @Override
    public void start()
    {
        //StoreEntityCounters counters = storeEntityCountersSupplier.get();
        //registry.register( COUNTS_NODE, (Gauge<Long>) counters::nodes );
        //registry.register( COUNTS_RELATIONSHIP, (Gauge<Long>) counters::relationships );
        //registry.register( COUNTS_PROPERTY, (Gauge<Long>) counters::properties );
        //registry.register( COUNTS_RELATIONSHIP_TYPE, (Gauge<Long>) counters::relationshipTypes );

        //this.registry.register( this.countsNode, () -> {
        //    return ((StoreEntityCounters) this.storeEntityCounters.get()).nodes();
        //} );
        this.registry.register( this.countsNode, new MeterCounter( () ->
                                                                           this.storeEntityCounters.get().nodes() ) );

        this.registry.register( this.countsRelationship, new MeterCounter( () ->
                                                                                   this.storeEntityCounters.get().relationships() ) );

        this.registry.register( this.countsProperty, new MeterCounter( () ->
                                                                               this.storeEntityCounters.get().properties() ) );

        this.registry.register( this.countsRelationshipType, new MeterCounter( () ->
                                                                                       this.storeEntityCounters.get().relationshipTypes() ) );
    }

    @Override
    public void stop()
    {
        this.registry.remove( this.countsNode );
        this.registry.remove( this.countsRelationship );
        this.registry.remove( this.countsProperty );
        this.registry.remove( this.countsRelationshipType );
    }
}
