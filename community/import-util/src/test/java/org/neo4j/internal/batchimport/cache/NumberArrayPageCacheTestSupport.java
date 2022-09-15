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
package org.neo4j.internal.batchimport.cache;

import java.io.IOException;
import java.nio.file.Path;

import org.neo4j.io.fs.DefaultFileSystemAbstraction;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.impl.muninn.StandalonePageCacheFactory;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.test.utils.TestDirectory;
import org.neo4j.test.scheduler.ThreadPoolJobScheduler;

public class NumberArrayPageCacheTestSupport
{
    static Fixture prepareDirectoryAndPageCache( Class<?> testClass ) throws IOException
    {
        DefaultFileSystemAbstraction fileSystem = new DefaultFileSystemAbstraction();
        TestDirectory testDirectory = TestDirectory.testDirectory( testClass, fileSystem );
        Path dir = testDirectory.prepareDirectoryForTest( "test" );
        ThreadPoolJobScheduler scheduler = new ThreadPoolJobScheduler();
        PageCache pageCache = StandalonePageCacheFactory.createPageCache( fileSystem, scheduler, PageCacheTracer.NULL );
        return new Fixture( pageCache, fileSystem, dir, scheduler );
    }

    public static class Fixture implements AutoCloseable
    {
        public final PageCache pageCache;
        public final FileSystemAbstraction fileSystem;
        public final Path directory;
        private final ThreadPoolJobScheduler scheduler;

        private Fixture( PageCache pageCache, FileSystemAbstraction fileSystem, Path directory, ThreadPoolJobScheduler scheduler )
        {
            this.pageCache = pageCache;
            this.fileSystem = fileSystem;
            this.directory = directory;
            this.scheduler = scheduler;
        }

        @Override
        public void close() throws Exception
        {
            pageCache.close();
            scheduler.close();
            fileSystem.close();
        }
    }
}
