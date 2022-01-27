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
package org.neo4j.io.pagecache.tracing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.nio.file.Path;

import org.neo4j.io.ByteUnit;
import org.neo4j.io.pagecache.PageSwapper;
import org.neo4j.io.pagecache.PagedFile;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class DefaultPageCacheTracerTest
{
    private PageCacheTracer tracer;
    private PageSwapper swapper;
    private PageReferenceTranslator pageReferenceTranslator;

    @BeforeEach
    public void setUp()
    {
        tracer = new DefaultPageCacheTracer();
        swapper = new DummyPageSwapper( "filename", (int) ByteUnit.kibiBytes( 8 ) );
        pageReferenceTranslator = Mockito.mock( PageReferenceTranslator.class );
    }

    @Test
    void independentCursorTracers()
    {
        var first = tracer.createPageCursorTracer( "first" );
        var second = tracer.createPageCursorTracer( "second" );
        var third = tracer.createPageCursorTracer( "third" );

        assertEquals( "first", first.getTag() );
        assertEquals( "second", second.getTag() );
        assertEquals( "third", third.getTag() );

        first.beginPin( false, 1, swapper ).done();
        first.beginPin( false, 1, swapper ).done();

        assertEquals( 2, first.pins() );
        assertEquals( 0, second.pins() );
        assertEquals( 0, third.pins() );

        PinEvent secondPin = second.beginPin( true, 2, swapper );
        secondPin.beginPageFault( 2, swapper ).done();

        assertEquals( 2, first.pins() );
        assertEquals( 1, second.pins() );
        assertEquals( 0, third.pins() );

        assertEquals( 0, first.faults() );
        assertEquals( 1, second.faults() );
        assertEquals( 0, third.faults() );
    }

    @Test
    void mustCountEvictions()
    {
        try ( EvictionRunEvent evictionRunEvent = tracer.beginPageEvictions( 2 ) )
        {
            try ( EvictionEvent evictionEvent = evictionRunEvent.beginEviction( 0 ) )
            {
                evictionEvent.setSwapper( swapper );
                FlushEvent flushEvent = evictionEvent.beginFlush( 0, swapper, pageReferenceTranslator );
                flushEvent.addBytesWritten( 12 );
                flushEvent.addPagesFlushed( 10 );
                flushEvent.done();
            }

            try ( EvictionEvent evictionEvent = evictionRunEvent.beginEviction( 0 ) )
            {
                FlushEvent flushEvent = evictionEvent.beginFlush( 0, swapper, pageReferenceTranslator );
                flushEvent.addBytesWritten( 12 );
                flushEvent.addPagesFlushed( 1 );
                flushEvent.done();
                evictionEvent.threwException( new IOException() );
            }

            try ( EvictionEvent evictionEvent = evictionRunEvent.beginEviction( 0 ) )
            {
                FlushEvent flushEvent = evictionEvent.beginFlush( 0, swapper, pageReferenceTranslator );
                flushEvent.addBytesWritten( 12 );
                flushEvent.addPagesFlushed( 2 );
                flushEvent.done();
                evictionEvent.threwException( new IOException() );
            }

            evictionRunEvent.beginEviction( 0 ).close();
        }

        assertCounts( 0, 0, 0, 0, 4, 2, 13, 0, 0, 36, 0, 0, 0d, 0 );
    }

    @Test
    void mustDistinguishCooperativeEvictions()
    {
        try ( EvictionRunEvent evictionRunEvent = tracer.beginPageEvictions( 2 ) )
        {
            try ( EvictionEvent evictionEvent = evictionRunEvent.beginEviction( 0 ) )
            {
                evictionEvent.setSwapper( swapper );
                var flushEvent = evictionEvent.beginFlush( 0, swapper, pageReferenceTranslator );
                flushEvent.addBytesWritten( 12 );
                flushEvent.addPagesFlushed( 10 );
                flushEvent.done();
            }

            evictionRunEvent.beginEviction( 0 ).close();
        }
        try ( var pageCursorTracer = tracer.createPageCursorTracer( "tag" ) )
        {
            PinEvent pinEvent = pageCursorTracer.beginPin( false, 0, swapper );
            {
                try ( var pageFaultEvent = pinEvent.beginPageFault( 4, swapper );
                      var evictionEvent = pageFaultEvent.beginEviction( 0 ) )
                {
                    evictionEvent.setSwapper( swapper );
                    var flushEvent = evictionEvent.beginFlush( 0, swapper, pageReferenceTranslator );
                    flushEvent.addBytesWritten( 12 );
                    flushEvent.addPagesFlushed( 1 );
                    flushEvent.done();
                }
            }
            pinEvent.done();
        }

        assertCounts( 1, 1, 0, 1, 3, 0, 11, 0, 0, 24, 0, 0, 0d, 1 );
    }

    @Test
    void mustCountFileMappingAndUnmapping()
    {
        var pagedFile = Mockito.mock( PagedFile.class );
        when( pagedFile.path() ).thenReturn( Path.of( "a" ) );

        tracer.mappedFile( 1, pagedFile );
        assertCounts( 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0d, 0 );
        tracer.unmappedFile( 1, pagedFile );
        assertCounts( 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0d, 0 );
    }

    @Test
    void mustCountFlushes()
    {
        try ( MajorFlushEvent cacheFlush = tracer.beginCacheFlush() )
        {
            cacheFlush.beginFlush( 0, swapper, pageReferenceTranslator ).done();
            cacheFlush.beginFlush( 0, swapper, pageReferenceTranslator ).done();
            cacheFlush.beginFlush( 0, swapper, pageReferenceTranslator ).done();
        }

        assertCounts( 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0d, 0 );

        try ( MajorFlushEvent fileFlush = tracer.beginFileFlush( swapper ) )
        {
            var flushEvent1 = fileFlush.beginFlush( 0, swapper, pageReferenceTranslator );
            flushEvent1.addPagesFlushed( 1 );
            flushEvent1.done();

            var flushEvent2 = fileFlush.beginFlush( 0, swapper, pageReferenceTranslator );
            flushEvent2.addPagesFlushed( 2 );
            flushEvent2.done();

            var flushEvent3 = fileFlush.beginFlush( 0, swapper, pageReferenceTranslator );
            flushEvent3.addPagesFlushed( 3 );
            flushEvent3.done();
        }

        assertCounts( 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0d, 0 );
    }

    @Test
    void countPageMerges()
    {
        try ( MajorFlushEvent cacheFlush = tracer.beginCacheFlush() )
        {
            cacheFlush.beginFlush( 0, swapper, pageReferenceTranslator ).done();
            cacheFlush.beginFlush( 0, swapper, pageReferenceTranslator ).done();
            cacheFlush.beginFlush( 0, swapper, pageReferenceTranslator ).done();
        }
        assertCounts( 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0d, 0 );

        try ( MajorFlushEvent fileFlush = tracer.beginFileFlush( swapper ) )
        {
            var flushEvent1 = fileFlush.beginFlush( new long[]{0}, swapper, pageReferenceTranslator, 0, 1 );
            flushEvent1.addPagesMerged( 1 );
            flushEvent1.done();

            var flushEvent2 = fileFlush.beginFlush( new long[]{0}, swapper, pageReferenceTranslator, 0, 2 );
            flushEvent2.addPagesMerged( 2 );
            flushEvent2.done();

            var flushEvent3 = fileFlush.beginFlush( new long[]{0}, swapper, pageReferenceTranslator, 0, 3 );
            flushEvent3.addPagesMerged( 3 );
            flushEvent3.done();
        }
        assertCounts( 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0d, 0 );
    }

    @Test
    void shouldCalculateHitRatio()
    {
        assertThat( tracer.hitRatio() ).as( "hitRation" ).isCloseTo( 0d, within( 0.0001 ) );
        tracer.hits( 3 );
        tracer.faults( 7 );
        assertThat( tracer.hitRatio() ).as( "hitRation" ).isCloseTo( 3.0 / 10, within( 0.0001 ) );
    }

    @Test
    void usageRatio()
    {
        assertThat( tracer.usageRatio() ).isEqualTo( 0 );
        tracer.maxPages( 10, 8 );
        assertThat( tracer.usageRatio() ).isCloseTo( 0d, within( 0.0001 ) );
        tracer.faults( 5 );
        assertThat( tracer.usageRatio() ).isCloseTo( 0.5, within( 0.0001 ) );
        tracer.faults( 5 );
        tracer.evictions( 5 );
        assertThat( tracer.usageRatio() ).isCloseTo( 0.5, within( 0.0001 ) );
        tracer.faults( 5 );
        assertThat( tracer.usageRatio() ).isCloseTo( 1d, within( 0.0001 ) );

        tracer.evictions( 500 );
        assertThat( tracer.usageRatio() ).isCloseTo( 0, within( 0.0001 ) );
    }

    private void assertCounts( long pins, long unpins, long hits, long faults, long evictions, long evictionExceptions, long flushes, long merges,
                               long bytesRead, long bytesWritten, long filesMapped, long filesUnmapped, double hitRatio, long cooperativeEvictions )
    {
        assertThat( tracer.pins() ).as( "pins" ).isEqualTo( pins );
        assertThat( tracer.unpins() ).as( "unpins" ).isEqualTo( unpins );
        assertThat( tracer.hits() ).as( "hits" ).isEqualTo( hits );
        assertThat( tracer.faults() ).as( "faults" ).isEqualTo( faults );
        assertThat( tracer.merges() ).as( "merges" ).isEqualTo( merges );
        assertThat( tracer.evictions() ).as( "evictions" ).isEqualTo( evictions );
        assertThat( tracer.cooperativeEvictions() ).as( "cooperativeEvictions" ).isEqualTo( cooperativeEvictions );
        assertThat( tracer.evictionExceptions() ).as( "evictionExceptions" ).isEqualTo( evictionExceptions );
        assertThat( tracer.flushes() ).as( "flushes" ).isEqualTo( flushes );
        assertThat( tracer.bytesRead() ).as( "bytesRead" ).isEqualTo( bytesRead );
        assertThat( tracer.bytesWritten() ).as( "bytesWritten" ).isEqualTo( bytesWritten );
        assertThat( tracer.filesMapped() ).as( "filesMapped" ).isEqualTo( filesMapped );
        assertThat( tracer.filesUnmapped() ).as( "filesUnmapped" ).isEqualTo( filesUnmapped );
        assertThat( tracer.hitRatio() ).as( "hitRatio" ).isCloseTo( hitRatio, within( 0.0001 ) );
    }
}
