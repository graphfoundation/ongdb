/*
 * Copyright (c) "Graph Foundation,"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB.
 *
 * ONgDB is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * Copyright (c) "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.server.web;

import org.eclipse.jetty.io.ByteBufferPool;
import org.eclipse.jetty.util.thread.QueuedThreadPool;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.ResourceLock;
import org.junit.jupiter.api.parallel.Resources;

import java.util.concurrent.CountDownLatch;

import org.neo4j.configuration.Config;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.kernel.api.net.NetworkConnectionTracker;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.SuppressOutput;
import org.neo4j.test.extension.SuppressOutputExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

@ExtendWith( SuppressOutputExtension.class )
@ResourceLock( Resources.SYSTEM_OUT )
class JettyThreadLimitIT
{
    @Inject
    private SuppressOutput suppressOutput;

    @Test
    void shouldHaveConfigurableJettyThreadPoolSize() throws Exception
    {
        Jetty9WebServer server = new Jetty9WebServer(
                NullLogProvider.getInstance(), Config.defaults(), NetworkConnectionTracker.NO_OP, mock( ByteBufferPool.class ) );
        int numCores = 1;
        int configuredMaxThreads = 12; // 12 is the new min max Threads value, for one core
        int acceptorThreads = 1; // In this configuration, 1 thread will become an acceptor...
        int selectorThreads = 1; // ... and 1 thread will become a selector...
        int jobThreads = configuredMaxThreads - acceptorThreads - selectorThreads; // ... and the rest are job threads
        server.setMaxThreads( numCores );
        server.setHttpAddress( new SocketAddress( "localhost", 0 ) );
        try
        {
            server.start();
            QueuedThreadPool threadPool = (QueuedThreadPool) server.getJetty().getThreadPool();
            threadPool.start();
            CountDownLatch startLatch = new CountDownLatch( jobThreads );
            CountDownLatch endLatch = loadThreadPool( threadPool, configuredMaxThreads + 1, startLatch );
            startLatch.await(); // Wait for threadPool to create threads
            int threads = threadPool.getThreads();
            assertEquals( configuredMaxThreads, threads, "Wrong number of threads in pool" );
            endLatch.countDown();
        }
        finally
        {
            server.stop();
        }
    }

    private static CountDownLatch loadThreadPool( QueuedThreadPool threadPool, int tasksToSubmit, final CountDownLatch startLatch )
    {
        CountDownLatch endLatch = new CountDownLatch( 1 );
        for ( int i = 0; i < tasksToSubmit; i++ )
        {
            threadPool.execute( () ->
            {
                startLatch.countDown();
                try
                {
                    endLatch.await();
                }
                catch ( InterruptedException e )
                {
                    e.printStackTrace();
                }
            } );
        }
        return endLatch;
    }
}
