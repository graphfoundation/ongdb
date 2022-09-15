/*
 * Copyright (c) 2018-2022 "Graph Foundation,"
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
package org.neo4j.kernel.impl.util;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.concurrent.CountDownLatch;

import org.neo4j.io.fs.watcher.FileWatcher;
import org.neo4j.io.fs.watcher.SilentFileWatcher;
import org.neo4j.kernel.impl.util.watcher.DefaultFileSystemWatcherService;
import org.neo4j.scheduler.JobScheduler;

import static org.mockito.Mockito.verify;
import static org.neo4j.kernel.impl.scheduler.JobSchedulerFactory.createInitialisedScheduler;

class DefaultFileSystemWatcherServiceTest
{

    private static JobScheduler jobScheduler;
    private final FileWatcher fileWatcher = Mockito.mock( FileWatcher.class );

    @BeforeAll
    static void setUp()
    {
        jobScheduler = createInitialisedScheduler();
    }

    @AfterAll
    static void tearDown() throws Throwable
    {
        jobScheduler.shutdown();
    }

    @Test
    void startMonitoringWhenLifecycleStarting() throws Throwable
    {
        CountDownLatch latch = new CountDownLatch( 1 );
        FileWatcher watcher = new TestFileWatcher( latch );
        DefaultFileSystemWatcherService service = new DefaultFileSystemWatcherService( jobScheduler, watcher );
        service.init();
        service.start();

        latch.await();
    }

    @Test
    void stopMonitoringWhenLifecycleStops() throws Throwable
    {
        DefaultFileSystemWatcherService service = new DefaultFileSystemWatcherService( jobScheduler, fileWatcher );
        service.init();
        service.start();
        service.stop();

        verify( fileWatcher ).stopWatching();
    }

    @Test
    void closeFileWatcherOnShutdown() throws Throwable
    {
        DefaultFileSystemWatcherService service = new DefaultFileSystemWatcherService( jobScheduler, fileWatcher );
        service.init();
        service.start();
        service.stop();
        service.shutdown();

        verify( fileWatcher ).close();
    }

    private static class TestFileWatcher extends SilentFileWatcher
    {

        private CountDownLatch latch;

        TestFileWatcher( CountDownLatch latch )
        {
            this.latch = latch;
        }

        @Override
        public void startWatching()
        {
            latch.countDown();
        }
    }
}
