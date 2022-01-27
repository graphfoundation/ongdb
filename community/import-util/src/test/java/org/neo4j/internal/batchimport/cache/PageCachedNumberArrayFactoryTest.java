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
package org.neo4j.internal.batchimport.cache;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;

import java.nio.file.Path;

import org.neo4j.io.pagecache.PageCache;
import org.neo4j.logging.Log;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.pagecache.PageCacheExtension;
import org.neo4j.test.utils.TestDirectory;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;
import static org.neo4j.io.pagecache.tracing.PageCacheTracer.NULL;
import static org.neo4j.memory.EmptyMemoryTracker.INSTANCE;

@PageCacheExtension
class PageCachedNumberArrayFactoryTest
{
    @Inject
    private PageCache pageCache;
    @Inject
    private TestDirectory directory;

    @Test
    void shouldLogAllocationOnIntArray()
    {
        // given
        Log log = mock( Log.class );
        Path dir = directory.directory( "cache" );
        PageCachedNumberArrayFactory factory = new PageCachedNumberArrayFactory( pageCache, NULL, dir, log, DEFAULT_DATABASE_NAME );

        // when
        factory.newIntArray( 1_000, -1, 0, INSTANCE ).close();

        // then
        verify( log ).info( ArgumentMatchers.contains( "Using page-cache backed caching" ) );
    }

    @Test
    void shouldLogAllocationOnLongArray()
    {
        // given
        Log log = mock( Log.class );
        Path dir = directory.directory( "cache" );
        PageCachedNumberArrayFactory factory = new PageCachedNumberArrayFactory( pageCache, NULL, dir, log, DEFAULT_DATABASE_NAME );

        // when
        factory.newLongArray( 1_000, -1, 0, INSTANCE ).close();

        // then
        verify( log ).info( ArgumentMatchers.contains( "Using page-cache backed caching" ) );
    }

    @Test
    void shouldLogAllocationOnByteArray()
    {
        // given
        Log log = mock( Log.class );
        Path dir = directory.directory( "cache" );
        PageCachedNumberArrayFactory factory = new PageCachedNumberArrayFactory( pageCache, NULL, dir, log, DEFAULT_DATABASE_NAME );

        // when
        factory.newByteArray( 1_000, new byte[4], 0, INSTANCE ).close();

        // then
        verify( log ).info( ArgumentMatchers.contains( "Using page-cache backed caching" ) );
    }
}
