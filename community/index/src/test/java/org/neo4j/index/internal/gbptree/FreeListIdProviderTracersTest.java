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
package org.neo4j.index.internal.gbptree;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.DefaultPageCacheTracer;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.pagecache.PageCacheExtension;
import org.neo4j.test.utils.TestDirectory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.neo4j.io.pagecache.context.CursorContext.NULL;

@PageCacheExtension
public class FreeListIdProviderTracersTest
{
    private static final String DATABASE_NAME = "neo4j";
    @Inject
    private PageCache pageCache;
    @Inject
    private TestDirectory testDirectory;
    private final DefaultPageCacheTracer cacheTracer = new DefaultPageCacheTracer();

    @Test
    void trackPageCacheAccessOnInitialize() throws IOException
    {
        var cursorContext = new CursorContext( cacheTracer.createPageCursorTracer( "trackPageCacheAccessOnInitialize" ) );
        assertZeroCursor( cursorContext );

        try ( var freeListFile = pageCache.map( testDirectory.createFile( "init" ), pageCache.pageSize(), DATABASE_NAME ) )
        {
            FreeListIdProvider listIdProvider = new FreeListIdProvider( freeListFile, 0 );
            listIdProvider.initializeAfterCreation( cursorContext );
        }

        assertOneCursor( cursorContext );
    }

    @Test
    void trackPageCacheAccessOnNewIdGeneration() throws IOException
    {
        var cursorContext = new CursorContext( cacheTracer.createPageCursorTracer( "trackPageCacheAccessOnNewIdGeneration" ) );
        assertZeroCursor( cursorContext );

        try ( var freeListFile = pageCache.map( testDirectory.createFile( "newId" ), pageCache.pageSize(), DATABASE_NAME ) )
        {
            FreeListIdProvider listIdProvider = new FreeListIdProvider( freeListFile, 0 );
            listIdProvider.acquireNewId( 1, 1, cursorContext );
        }

        assertOneCursor( cursorContext );
    }

    @Test
    void trackPageCacheAccessOnIdReleaseOnTheSamePage() throws IOException
    {
        var cursorContext = new CursorContext( cacheTracer.createPageCursorTracer( "trackPageCacheAccessOnIdReleaseOnTheSamePage" ) );
        assertZeroCursor( cursorContext );

        try ( var freeListFile = pageCache.map( testDirectory.createFile( "releaseId" ), pageCache.pageSize(), DATABASE_NAME ) )
        {
            FreeListIdProvider listIdProvider = new FreeListIdProvider( freeListFile, 0 );
            listIdProvider.releaseId( 1, 1,42,  cursorContext );
        }

        assertOneCursor( cursorContext );
    }

    @Test
    void trackPageCacheAccessOnIdReleaseOnDifferentPage() throws IOException
    {
        var cursorContext = new CursorContext( cacheTracer.createPageCursorTracer( "trackPageCacheAccessOnIdReleaseOnDifferentPage" ) );
        assertZeroCursor( cursorContext );

        try ( var freeListFile = pageCache.map( testDirectory.createFile( "differentReleaseId" ), pageCache.pageSize(), DATABASE_NAME ) )
        {
            FreeListIdProvider listIdProvider = new FreeListIdProvider( freeListFile, 0 );
            listIdProvider.initialize( 0, 1, 0, listIdProvider.entriesPerPage() - 1, 0 );
            listIdProvider.releaseId( 1, 1,42,  cursorContext );
            assertEquals( 0, listIdProvider.writePos() );
        }

        var cursorTracer = cursorContext.getCursorTracer();
        assertThat( cursorTracer.pins() ).isEqualTo( 3 );
        assertThat( cursorTracer.unpins() ).isEqualTo( 3 );
        assertThat( cursorTracer.hits() ).isEqualTo( 1 );
        assertThat( cursorTracer.faults() ).isEqualTo( 2 );
    }

    @Test
    void trackPageCacheAccessOnFreeListTraversal() throws IOException
    {
        var cursorContext = new CursorContext( cacheTracer.createPageCursorTracer( "trackPageCacheAccessOnFreeListTraversal" ) );
        assertZeroCursor( cursorContext );

        try ( var freeListFile = pageCache.map( testDirectory.createFile( "traversal" ), pageCache.pageSize(), DATABASE_NAME ) )
        {
            FreeListIdProvider listIdProvider = new FreeListIdProvider( freeListFile, 0 );
            listIdProvider.initialize( 100, 0, 1, listIdProvider.entriesPerPage() - 1, 0 );
            listIdProvider.releaseId( 1, 1,42,  NULL );
            assertEquals( 0, listIdProvider.writePos() );

            listIdProvider.visitFreelist( new IdProvider.IdProviderVisitor.Adaptor(), cursorContext );
        }

        var cursorTracer = cursorContext.getCursorTracer();
        assertThat( cursorTracer.pins() ).isEqualTo( 3 );
        assertThat( cursorTracer.unpins() ).isEqualTo( 3 );
        assertThat( cursorTracer.hits() ).isEqualTo( 3 );
    }

    private static void assertOneCursor( CursorContext cursorContext )
    {
        var cursorTracer = cursorContext.getCursorTracer();
        assertThat( cursorTracer.pins() ).isOne();
        assertThat( cursorTracer.unpins() ).isOne();
        assertThat( cursorTracer.faults() ).isOne();
    }

    private static void assertZeroCursor( CursorContext cursorContext )
    {
        var cursorTracer = cursorContext.getCursorTracer();
        assertThat( cursorTracer.pins() ).isZero();
        assertThat( cursorTracer.hits() ).isZero();
        assertThat( cursorTracer.unpins() ).isZero();
        assertThat( cursorTracer.faults() ).isZero();
    }
}
