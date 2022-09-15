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
package org.neo4j.io.pagecache.tracing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import org.neo4j.io.ByteUnit;
import org.neo4j.io.pagecache.PageSwapper;
import org.neo4j.io.pagecache.tracing.cursor.DefaultPageCursorTracer;
import org.neo4j.io.pagecache.tracing.cursor.PageCursorTracer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

class DefaultPageCursorTracerTest
{
    private static final String TEST_TRACER = "testTracer";
    private PageSwapper swapper;
    private PageCursorTracer pageCursorTracer;
    private DefaultPageCacheTracer cacheTracer;
    private PageReferenceTranslator referenceTranslator;

    @BeforeEach
    void setUp()
    {
        cacheTracer = new DefaultPageCacheTracer();
        pageCursorTracer = createTracer();
        swapper = new DummyPageSwapper( "filename", (int) ByteUnit.kibiBytes( 8 ) );
        referenceTranslator = mock( PageReferenceTranslator.class );
    }

    @Test
    void countClosedAndOpenCursors()
    {
        assertEquals( 0, cacheTracer.closedCursors() );
        assertEquals( 0, cacheTracer.openedCursors() );

        cacheTracer.openCursor();
        cacheTracer.openCursor();
        cacheTracer.openCursor();
        cacheTracer.openCursor();

        cacheTracer.closeCursor();
        cacheTracer.closeCursor();
        cacheTracer.closeCursor();

        assertEquals( 3, cacheTracer.closedCursors() );
        assertEquals( 4, cacheTracer.openedCursors() );
    }

    @Test
    void countPinsAndUnpins()
    {
        pageCursorTracer.beginPin( true, 0, swapper ).done();
        pageCursorTracer.beginPin( true, 0, swapper );

        assertEquals( 2, pageCursorTracer.pins() );
        assertEquals( 1, pageCursorTracer.unpins() );
    }

    @Test
    void noHitForPinEventWithPageFault()
    {
        pinFaultAndHit();

        assertEquals( 1, pageCursorTracer.pins() );
        assertEquals( 1, pageCursorTracer.faults() );
        assertEquals( 0, pageCursorTracer.hits() );
    }

    @Test
    void hitForPinEventWithoutPageFault()
    {
        pinAndHit();

        assertEquals( 1, pageCursorTracer.pins() );
        assertEquals( 1, pageCursorTracer.hits() );
    }

    @Test
    void countHitsOnlyForPinEventsWithoutPageFaults()
    {
        pinAndHit();
        pinAndHit();
        pinAndHit();
        pinFaultAndHit();
        pinFaultAndHit();
        pinAndHit();
        pinAndHit();

        assertEquals( 7, pageCursorTracer.pins() );
        assertEquals( 5, pageCursorTracer.hits() );
    }

    @Test
    void countPageFaultsAndBytesRead()
    {
        PinEvent pinEvent = pageCursorTracer.beginPin( true, 0, swapper );
        {
            PageFaultEvent pageFaultEvent = pinEvent.beginPageFault( 1, swapper );
            {
                pageFaultEvent.addBytesRead( 42 );
            }
            pageFaultEvent.done();
            pageFaultEvent = pinEvent.beginPageFault( 3, swapper );
            {
                pageFaultEvent.addBytesRead( 42 );
            }
            pageFaultEvent.done();
        }
        pinEvent.done();

        assertEquals( 1, pageCursorTracer.pins() );
        assertEquals( 1, pageCursorTracer.unpins() );
        assertEquals( 2, pageCursorTracer.faults() );
        assertEquals( 84, pageCursorTracer.bytesRead() );
    }

    @Test
    void countPageEvictions()
    {
        PinEvent pinEvent = pageCursorTracer.beginPin( true, 0, swapper );
        {
            PageFaultEvent faultEvent = pinEvent.beginPageFault( 1, swapper );
            {
                EvictionEvent evictionEvent = faultEvent.beginEviction( 0 );
                evictionEvent.setSwapper( swapper );
                evictionEvent.setFilePageId( 0 );
                evictionEvent.threwException( new IOException( "exception" ) );
                evictionEvent.close();
            }
            faultEvent.done();
        }
        pinEvent.done();

        assertEquals( 1, pageCursorTracer.pins() );
        assertEquals( 1, pageCursorTracer.unpins() );
        assertEquals( 1, pageCursorTracer.faults() );
        assertEquals( 1, pageCursorTracer.evictions() );
        assertEquals( 1, pageCursorTracer.evictionExceptions() );
    }

    @Test
    void countFlushesAndBytesWritten()
    {
        PinEvent pinEvent = pageCursorTracer.beginPin( true, 0, swapper );
        {
            PageFaultEvent faultEvent = pinEvent.beginPageFault( 3, swapper );
            {
                EvictionEvent evictionEvent = faultEvent.beginEviction( 0 );
                {
                    evictionEvent.setSwapper( swapper );
                    FlushEvent flushEvent = evictionEvent.beginFlush( 0, swapper, referenceTranslator );
                    flushEvent.addBytesWritten( 27 );
                    flushEvent.addPagesMerged( 10 );
                    flushEvent.done();
                    FlushEvent flushEvent1 = evictionEvent.beginFlush( 1, swapper, referenceTranslator );
                    flushEvent1.addBytesWritten( 13 );
                    flushEvent1.addPagesFlushed( 2 );
                    flushEvent1.addPagesMerged( 2 );
                    flushEvent1.done();
                }
                evictionEvent.close();
            }
            faultEvent.done();
        }
        pinEvent.done();

        assertEquals( 1, pageCursorTracer.pins() );
        assertEquals( 1, pageCursorTracer.unpins() );
        assertEquals( 1, pageCursorTracer.faults() );
        assertEquals( 1, pageCursorTracer.evictions() );
        assertEquals( 2, pageCursorTracer.flushes() );
        assertEquals( 12, pageCursorTracer.merges() );
        assertEquals( 40, pageCursorTracer.bytesWritten() );
    }

    @Test
    void reportCountersToPageCursorTracer()
    {
        generateEventSet();
        pageCursorTracer.reportEvents();

        assertEquals( 1, cacheTracer.pins() );
        assertEquals( 1, cacheTracer.unpins() );
        assertEquals( 1, cacheTracer.faults() );
        assertEquals( 1, cacheTracer.evictions() );
        assertEquals( 1, cacheTracer.cooperativeEvictions() );
        assertEquals( 1, cacheTracer.evictionExceptions() );
        assertEquals( 1, cacheTracer.flushes() );
        assertEquals( 1, cacheTracer.merges() );
        assertEquals( 10, cacheTracer.bytesWritten() );
        assertEquals( 150, cacheTracer.bytesRead() );

        generateEventSet();
        generateEventSet();
        pageCursorTracer.reportEvents();

        assertEquals( 3, cacheTracer.pins() );
        assertEquals( 3, cacheTracer.unpins() );
        assertEquals( 3, cacheTracer.faults() );
        assertEquals( 3, cacheTracer.evictions() );
        assertEquals( 3, cacheTracer.cooperativeEvictions() );
        assertEquals( 3, cacheTracer.evictionExceptions() );
        assertEquals( 3, cacheTracer.flushes() );
        assertEquals( 3, cacheTracer.merges() );
        assertEquals( 30, cacheTracer.bytesWritten() );
        assertEquals( 450, cacheTracer.bytesRead() );
    }

    @Test
    void closingTraceCursorReportEvents()
    {
        generateEventSet();
        pageCursorTracer.close();

        assertEquals( 1, cacheTracer.pins() );
        assertEquals( 1, cacheTracer.unpins() );
        assertEquals( 1, cacheTracer.faults() );
        assertEquals( 1, cacheTracer.evictions() );
        assertEquals( 1, cacheTracer.cooperativeEvictions() );
        assertEquals( 1, cacheTracer.evictionExceptions() );
        assertEquals( 1, cacheTracer.flushes() );
        assertEquals( 1, cacheTracer.merges() );
        assertEquals( 10, cacheTracer.bytesWritten() );
        assertEquals( 150, cacheTracer.bytesRead() );

        generateEventSet();
        generateEventSet();
        pageCursorTracer.close();

        assertEquals( 3, cacheTracer.pins() );
        assertEquals( 3, cacheTracer.unpins() );
        assertEquals( 3, cacheTracer.faults() );
        assertEquals( 3, cacheTracer.evictions() );
        assertEquals( 3, cacheTracer.cooperativeEvictions() );
        assertEquals( 3, cacheTracer.evictionExceptions() );
        assertEquals( 3, cacheTracer.flushes() );
        assertEquals( 3, cacheTracer.merges() );
        assertEquals( 30, cacheTracer.bytesWritten() );
        assertEquals( 450, cacheTracer.bytesRead() );
    }

    @Test
    void shouldCalculateHitRatio()
    {
        assertEquals( 0d, pageCursorTracer.hitRatio(), 0.0001 );

        pinFaultAndHit();

        assertEquals( 0.0 / 1, pageCursorTracer.hitRatio(), 0.0001 );

        pinAndHit();

        assertEquals( 1.0 / 2, pageCursorTracer.hitRatio(), 0.0001 );

        pinFaultAndHit();
        pinFaultAndHit();
        pinFaultAndHit();
        pinAndHit();
        pinAndHit();

        assertEquals( 3.0 / 7, pageCursorTracer.hitRatio(), 0.0001 );

        pageCursorTracer.reportEvents();

        assertEquals( 3.0 / 7, cacheTracer.hitRatio(), 0.0001 );
    }

    @Test
    void pageCursorTracerHasDefinedTag()
    {
        assertEquals( TEST_TRACER, pageCursorTracer.getTag() );
    }

    @Test
    void mergePageCursors()
    {
        var tracer = createTracer();
        for ( int i = 0; i < 5; i++ )
        {
            DummyPageSwapper dummyPageSwapper = new DummyPageSwapper( "a", 4 );
            PinEvent pinEvent = tracer.beginPin( false, 1, dummyPageSwapper );
            pinEvent.hit();
            try ( PageFaultEvent pageFaultEvent = pinEvent.beginPageFault( 1, dummyPageSwapper ) )
            {
                pageFaultEvent.addBytesRead( 16 );
                try ( EvictionEvent evictionEvent = pageFaultEvent.beginEviction( 3 ) )
                {
                    evictionEvent.setSwapper( dummyPageSwapper );
                    FlushEvent flushEvent = evictionEvent.beginFlush( 1, dummyPageSwapper, pageRef -> (int) pageRef );
                    flushEvent.addPagesMerged( 7 );
                    flushEvent.addBytesWritten( 17 );
                    flushEvent.done();
                }
                pageFaultEvent.done();
            }
            pinEvent.done();
        }
        pageCursorTracer.merge( tracer );

        assertEquals( 5, pageCursorTracer.pins() );
        assertEquals( 5, pageCursorTracer.unpins() );
        assertEquals( 5, pageCursorTracer.evictions() );
        assertEquals( 35, pageCursorTracer.merges() );
        assertEquals( 10, pageCursorTracer.faults() );
        assertEquals( 80, pageCursorTracer.bytesRead() );
        assertEquals( 85, pageCursorTracer.bytesWritten() );
    }

    private void generateEventSet()
    {
        PinEvent pinEvent = pageCursorTracer.beginPin( false, 0, swapper );
        {
            PageFaultEvent pageFaultEvent = pinEvent.beginPageFault( 4, swapper );
            pageFaultEvent.addBytesRead( 150 );
            {
                EvictionEvent evictionEvent = pageFaultEvent.beginEviction( 0 );
                {
                    evictionEvent.setSwapper( swapper );
                    FlushEvent flushEvent = evictionEvent.beginFlush( 0, swapper, referenceTranslator );
                    flushEvent.addBytesWritten( 10 );
                    flushEvent.addPagesFlushed( 1 );
                    flushEvent.addPagesMerged( 1 );
                    flushEvent.done();
                }
                evictionEvent.threwException( new IOException( "eviction exception" ) );
                evictionEvent.close();
            }
            pageFaultEvent.done();
        }
        pinEvent.done();
    }

    private PageCursorTracer createTracer()
    {
        return new DefaultPageCursorTracer( cacheTracer, TEST_TRACER );
    }

    private void pinAndHit()
    {
        PinEvent pinEvent = pageCursorTracer.beginPin( true, 0, swapper );
        pinEvent.hit();
        pinEvent.done();
    }

    private void pinFaultAndHit()
    {
        PinEvent pinEvent = pageCursorTracer.beginPin( true, 0, swapper );
        PageFaultEvent pageFaultEvent = pinEvent.beginPageFault( 6, swapper );
        pinEvent.hit();
        pageFaultEvent.done();
        pinEvent.done();
    }
}
