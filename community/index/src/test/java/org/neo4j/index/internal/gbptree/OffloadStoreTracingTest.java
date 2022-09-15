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
package org.neo4j.index.internal.gbptree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.PagedFile;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.DefaultPageCacheTracer;
import org.neo4j.io.pagecache.tracing.cursor.PageCursorTracer;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.pagecache.PageCacheExtension;
import org.neo4j.test.utils.TestDirectory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.neo4j.index.internal.gbptree.OffloadIdValidator.ALWAYS_TRUE;
import static org.neo4j.index.internal.gbptree.RawBytes.EMPTY_BYTES;

@PageCacheExtension
class OffloadStoreTracingTest
{
    @Inject
    private PageCache pageCache;
    @Inject
    private TestDirectory testDirectory;

    private final SimpleByteArrayLayout layout = new SimpleByteArrayLayout( false );
    private final DefaultPageCacheTracer pageCacheTracer = new DefaultPageCacheTracer();
    private OffloadStoreImpl<RawBytes,RawBytes> offloadStore;
    private CursorContext cursorContext;
    private PagedFile pagedFile;

    @BeforeEach
    void setUp() throws IOException
    {
        cursorContext = new CursorContext( pageCacheTracer.createPageCursorTracer( "testCursorTracer" ) );
        pagedFile = pageCache.map( testDirectory.createFile( "file" ), pageCache.pageSize(), "neo4j" );
        OffloadPageCursorFactory pcFactory = pagedFile::io;
        var idProvider = new FreeListIdProvider( pagedFile, 10 );
        offloadStore = new OffloadStoreImpl<>( layout, idProvider, pcFactory, ALWAYS_TRUE, pageCache.pageSize() );
    }

    @AfterEach
    void tearDown()
    {
        if ( pagedFile != null )
        {
            pagedFile.close();
        }
    }

    @Test
    void tracePageCacheAccessOnKeyWrite() throws IOException
    {
        cursorContext.getCursorTracer().reportEvents();
        assertZeroCursor();

        offloadStore.writeKey( EMPTY_BYTES, 0, 1, cursorContext );

        assertWriteCursorEvents();
    }

    @Test
    void tracePageCacheAccessOnKeyValueWrite() throws IOException
    {
        cursorContext.getCursorTracer().reportEvents();
        assertZeroCursor();

        offloadStore.writeKeyValue( EMPTY_BYTES, EMPTY_BYTES, 1, 1, cursorContext );

        assertWriteCursorEvents();
    }

    @Test
    void tracePageCacheAccessOnFree() throws IOException
    {
        PageCursorTracer cursorTracer = cursorContext.getCursorTracer();
        cursorTracer.reportEvents();
        assertZeroCursor();

        offloadStore.free( 1, 1, 1, cursorContext );

        assertThat( cursorTracer.faults() ).isEqualTo( 1 );
        assertThat( cursorTracer.pins() ).isEqualTo( 1 );
        assertThat( cursorTracer.unpins() ).isEqualTo( 1 );
    }

    @Test
    void tracePageCacheAccessOnKeyRead() throws IOException
    {
        long id = offloadStore.writeKeyValue( EMPTY_BYTES, EMPTY_BYTES, 1, 2, cursorContext );
        cursorContext.getCursorTracer().reportEvents();
        assertZeroCursor();

        offloadStore.readKey( id, EMPTY_BYTES, cursorContext );

        assertReadCursorEvents();
    }

    @Test
    void tracePageCacheAccessOnKeyValueRead() throws IOException
    {
        long id = offloadStore.writeKeyValue( EMPTY_BYTES, EMPTY_BYTES, 1, 2, cursorContext );
        cursorContext.getCursorTracer().reportEvents();
        assertZeroCursor();

        offloadStore.readKeyValue( id, EMPTY_BYTES, EMPTY_BYTES, cursorContext );

        assertReadCursorEvents();
    }

    @Test
    void tracePageCacheAccessOnValueRead() throws IOException
    {
        long id = offloadStore.writeKeyValue( EMPTY_BYTES, EMPTY_BYTES, 1, 2, cursorContext );
        cursorContext.getCursorTracer().reportEvents();
        assertZeroCursor();

        offloadStore.readValue( id, EMPTY_BYTES, cursorContext );

        assertReadCursorEvents();
    }

    private void assertReadCursorEvents()
    {
        var cursorTracer = cursorContext.getCursorTracer();
        assertThat( cursorTracer.faults() ).isEqualTo( 0 );
        assertThat( cursorTracer.pins() ).isEqualTo( 1 );
        assertThat( cursorTracer.unpins() ).isEqualTo( 1 );
    }

    private void assertWriteCursorEvents()
    {
        var cursorTracer = cursorContext.getCursorTracer();
        assertThat( cursorTracer.faults() ).isEqualTo( 1 );
        assertThat( cursorTracer.pins() ).isEqualTo( 2 );
        assertThat( cursorTracer.unpins() ).isEqualTo( 2 );
    }

    private void assertZeroCursor()
    {
        var cursorTracer = cursorContext.getCursorTracer();
        assertThat( cursorTracer.pins() ).isZero();
        assertThat( cursorTracer.unpins() ).isZero();
        assertThat( cursorTracer.faults() ).isZero();
    }
}
