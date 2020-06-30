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

import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;

import org.neo4j.annotations.documented.Documented;
import org.neo4j.bolt.runtime.BoltConnectionMetricsMonitor;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.metrics.meter.MeterCounter;
import org.neo4j.monitoring.Monitors;

@Documented( ".Bolt metrics" )
public class BoltMetrics extends LifecycleAdapter
{
    private static final String BOLT_PREFIX = "neo4j.bolt";
    @Documented( "The total number of Bolt sessions started since this instance started. This includes both succeeded and failed sessions (deprecated, use connections_opened instead)." )
    private static final String SESSIONS_STARTED_TEMPLATE = MetricRegistry.name( BOLT_PREFIX, "sessions_started" );
    @Documented( "The total number of Bolt connections opened since this instance started. This includes both succeeded and failed connections." )
    private static final String CONNECTIONS_OPENED_TEMPLATE = MetricRegistry.name( BOLT_PREFIX, "connections_opened" );
    @Documented( "The total number of Bolt connections closed since this instance started. This includes both properly and abnormally ended connections." )
    private static final String CONNECTIONS_CLOSED_TEMPLATE = MetricRegistry.name( BOLT_PREFIX, "connections_closed" );
    @Documented( "The total number of Bolt connections currently being executed." )
    private static final String CONNECTIONS_RUNNING_TEMPLATE = MetricRegistry.name( BOLT_PREFIX, "connections_running" );
    @Documented( "The total number of Bolt connections sitting idle." )
    private static final String CONNECTIONS_IDLE_TEMPLATE = MetricRegistry.name( BOLT_PREFIX, "connections_idle" );
    @Documented( "The total number of messages received via Bolt since this instance started." )
    private static final String MESSAGES_RECEIVED_TEMPLATE = MetricRegistry.name( BOLT_PREFIX, "messages_received" );
    @Documented( "The total number of messages that began processing since this instance started. This is different from messages received in that this counter tracks how many of the received messages havebeen taken on by a worker thread." )
    private static final String MESSAGES_STARTED_TEMPLATE = MetricRegistry.name( BOLT_PREFIX, "messages_started" );
    @Documented( "The total number of messages that completed processing since this instance started. This includes successful, failed and ignored Bolt messages." )
    private static final String MESSAGES_DONE_TEMPLATE = MetricRegistry.name( BOLT_PREFIX, "messages_done" );
    @Documented( "The total number of messages that failed processing since this instance started." )
    private static final String MESSAGES_FAILED_TEMPLATE = MetricRegistry.name( BOLT_PREFIX, "messages_failed" );
    @Documented( "The accumulated time messages have spent waiting for a worker thread." )
    private static final String TOTAL_QUEUE_TIME_TEMPLATE = MetricRegistry.name( BOLT_PREFIX, "accumulated_queue_time" );
    @Documented( "The accumulated time worker threads have spent processing messages." )
    private static final String TOTAL_PROCESSING_TIME_TEMPLATE = MetricRegistry.name( BOLT_PREFIX, "accumulated_processing_time" );
    private final String sessionsStarted;
    private final String connectionsOpened;
    private final String connectionsClosed;
    private final String connectionsRunning;
    private final String connectionsIdle;
    private final String messagesReceived;
    private final String messagesStarted;
    private final String messagesDone;
    private final String messagesFailed;
    private final String totalQueueTime;
    private final String totalProcessingTime;
    private final MetricRegistry registry;
    private final Monitors monitors;
    private final BoltMetrics.BoltMetricsMonitor boltMonitor = new BoltMetrics.BoltMetricsMonitor();

    public BoltMetrics( String metricsPrefix, MetricRegistry registry, Monitors monitors )
    {
        this.sessionsStarted = MetricRegistry.name( metricsPrefix, SESSIONS_STARTED_TEMPLATE );
        this.connectionsOpened = MetricRegistry.name( metricsPrefix, CONNECTIONS_OPENED_TEMPLATE );
        this.connectionsClosed = MetricRegistry.name( metricsPrefix, CONNECTIONS_CLOSED_TEMPLATE );
        this.connectionsRunning = MetricRegistry.name( metricsPrefix, CONNECTIONS_RUNNING_TEMPLATE );
        this.connectionsIdle = MetricRegistry.name( metricsPrefix, CONNECTIONS_IDLE_TEMPLATE );
        this.messagesReceived = MetricRegistry.name( metricsPrefix, MESSAGES_RECEIVED_TEMPLATE );
        this.messagesStarted = MetricRegistry.name( metricsPrefix, MESSAGES_STARTED_TEMPLATE );
        this.messagesDone = MetricRegistry.name( metricsPrefix, MESSAGES_DONE_TEMPLATE );
        this.messagesFailed = MetricRegistry.name( metricsPrefix, MESSAGES_FAILED_TEMPLATE );
        this.totalQueueTime = MetricRegistry.name( metricsPrefix, TOTAL_QUEUE_TIME_TEMPLATE );
        this.totalProcessingTime = MetricRegistry.name( metricsPrefix, TOTAL_PROCESSING_TIME_TEMPLATE );
        this.registry = registry;
        this.monitors = monitors;
    }

    @Override
    public void start()
    {
        this.monitors.addMonitorListener( this.boltMonitor );
        MetricRegistry registry = this.registry;

        Objects.requireNonNull( boltMonitor.connectionsOpened );
        registry.register( sessionsStarted, new MeterCounter( boltMonitor.connectionsOpened::get ) );

        registry.register( connectionsOpened, new MeterCounter( boltMonitor.connectionsOpened::get ) );

        Objects.requireNonNull( boltMonitor.connectionsClosed );
        registry.register( connectionsClosed, new MeterCounter( boltMonitor.connectionsClosed::get ) );

        Objects.requireNonNull( boltMonitor.connectionsActive );
        registry.register( connectionsRunning, new MeterCounter( boltMonitor.connectionsActive::get ) );

        Objects.requireNonNull( boltMonitor.connectionsIdle );
        registry.register( connectionsIdle, new MeterCounter( boltMonitor.connectionsIdle::get ) );

        Objects.requireNonNull( boltMonitor.messagesReceived );
        registry.register( messagesReceived, new MeterCounter( boltMonitor.messagesReceived::get ) );

        Objects.requireNonNull( boltMonitor.messagesStarted );
        registry.register( messagesStarted, new MeterCounter( boltMonitor.messagesStarted::get ) );

        Objects.requireNonNull( boltMonitor.messagesDone );
        registry.register( messagesDone, new MeterCounter( boltMonitor.messagesDone::get ) );

        Objects.requireNonNull( boltMonitor.messagesFailed );
        registry.register( messagesFailed, new MeterCounter( boltMonitor.messagesFailed::get ) );

        Objects.requireNonNull( boltMonitor.queueTime );
        registry.register( totalQueueTime, new MeterCounter( boltMonitor.queueTime::get ) );

        Objects.requireNonNull( boltMonitor.processingTime );
        registry.register( totalProcessingTime, new MeterCounter( boltMonitor.processingTime::get ) );
    }

    @Override
    public void stop()
    {
        this.registry.remove( sessionsStarted );
        this.registry.remove( connectionsOpened );
        this.registry.remove( connectionsClosed );
        this.registry.remove( connectionsIdle );
        this.registry.remove( connectionsRunning );
        this.registry.remove( messagesReceived );
        this.registry.remove( messagesStarted );
        this.registry.remove( messagesDone );
        this.registry.remove( messagesFailed );
        this.registry.remove( totalQueueTime );
        this.registry.remove( totalProcessingTime );
        this.monitors.removeMonitorListener( boltMonitor );
    }

    private class BoltMetricsMonitor implements BoltConnectionMetricsMonitor
    {
        final AtomicLong connectionsOpened = new AtomicLong();
        final AtomicLong connectionsClosed = new AtomicLong();

        final AtomicLong connectionsActive = new AtomicLong();
        final AtomicLong connectionsIdle = new AtomicLong();

        final AtomicLong messagesReceived = new AtomicLong();
        final AtomicLong messagesStarted = new AtomicLong();
        final AtomicLong messagesDone = new AtomicLong();
        final AtomicLong messagesFailed = new AtomicLong();

        // It will take about 300 million years of queue/processing time to overflow these
        // Even if we run a million processors concurrently, the instance would need to
        // run uninterrupted for three hundred years before the monitoring had a hiccup.
        final AtomicLong queueTime = new AtomicLong();
        final AtomicLong processingTime = new AtomicLong();

        @Override
        public void connectionOpened()
        {
            connectionsOpened.incrementAndGet();
            connectionsIdle.incrementAndGet();
        }

        @Override
        public void connectionActivated()
        {
            connectionsActive.incrementAndGet();
            connectionsIdle.decrementAndGet();
        }

        @Override
        public void connectionWaiting()
        {
            connectionsIdle.incrementAndGet();
            connectionsActive.decrementAndGet();
        }

        @Override
        public void messageReceived()
        {
            messagesReceived.incrementAndGet();
        }

        @Override
        public void messageProcessingStarted( long queueTime )
        {
            this.queueTime.addAndGet( queueTime );
            messagesStarted.incrementAndGet();
        }

        @Override
        public void messageProcessingCompleted( long processingTime )
        {
            this.processingTime.addAndGet( processingTime );
            messagesDone.incrementAndGet();
        }

        @Override
        public void messageProcessingFailed()
        {
            messagesFailed.incrementAndGet();
        }

        @Override
        public void connectionClosed()
        {
            connectionsClosed.incrementAndGet();
            connectionsIdle.decrementAndGet();
        }
    }
}
