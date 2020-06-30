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
package org.neo4j.metrics.source.server;

import com.codahale.metrics.Gauge;
import com.codahale.metrics.MetricRegistry;

import org.neo4j.annotations.documented.Documented;
import org.neo4j.common.DependencySatisfier;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.logging.Log;
import org.neo4j.logging.internal.LogService;

@Documented( ".Server metrics" )
public class ServerMetrics extends LifecycleAdapter
{
    private static final String SERVER_PREFIX = "server";
    @Documented( "The total number of idle threads in the jetty pool." )
    private static final String THREAD_JETTY_IDLE_TEMPLATE = MetricRegistry.name( "server", "threads.jetty.idle" );
    @Documented( "The total number of threads (both idle and busy) in the jetty pool." )
    private static final String THREAD_JETTY_ALL_TEMPLATE = MetricRegistry.name( "server", "threads.jetty.all" );
    private final String threadJettyIdle;
    private final String threadJettyAll;
    private final MetricRegistry registry;
    private volatile ServerThreadView serverThreadView;

    public ServerMetrics( String metricsPrefix, MetricRegistry registry, LogService logService, DependencySatisfier satisfier )
    {
        final Log userLog = logService.getUserLog( this.getClass() );
        this.registry = registry;
        this.threadJettyIdle = MetricRegistry.name( metricsPrefix, THREAD_JETTY_IDLE_TEMPLATE );
        this.threadJettyAll = MetricRegistry.name( metricsPrefix, THREAD_JETTY_ALL_TEMPLATE );
        this.serverThreadView = new ServerThreadView()
        {
            private volatile boolean warnedAboutIdle;
            private volatile boolean warnedAboutAll;

            @Override
            public int idleThreads()
            {
                if ( !this.warnedAboutIdle )
                {
                    userLog.warn( "Server thread metrics not available (missing " + ServerMetrics.this.threadJettyIdle + ")" );
                    this.warnedAboutIdle = true;
                }

                return -1;
            }

            @Override
            public int allThreads()
            {
                if ( !this.warnedAboutAll )
                {
                    userLog.warn( "Server thread metrics not available (missing " + ServerMetrics.this.threadJettyAll + ")" );
                    this.warnedAboutAll = true;
                }

                return -1;
            }
        };
        // TODO: Review
        satisfier.satisfyDependency( (ServerThreadViewSetter) serverThreadView ->
        {
            assert this.serverThreadView != null;

            this.serverThreadView = serverThreadView;
            userLog.info( "Server thread metrics have been registered successfully" );
        } );
    }

    @Override
    public void start()
    {
        registry.register( threadJettyIdle, (Gauge<Integer>) () -> serverThreadView.idleThreads() );
        registry.register( threadJettyAll, (Gauge<Integer>) () -> serverThreadView.allThreads() );
    }

    @Override
    public void stop()
    {
        this.registry.remove( this.threadJettyIdle );
        this.registry.remove( this.threadJettyAll );
    }
}
