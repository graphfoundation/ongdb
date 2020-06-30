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
package org.neo4j.kernel.monitoring.tracing;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

import org.neo4j.internal.helpers.TimeUtil;
import org.neo4j.io.ByteUnit;
import org.neo4j.io.pagecache.PageSwapper;
import org.neo4j.io.pagecache.tracing.DefaultPageCacheTracer;
import org.neo4j.io.pagecache.tracing.FlushEvent;
import org.neo4j.io.pagecache.tracing.FlushEventOpportunity;
import org.neo4j.io.pagecache.tracing.MajorFlushEvent;
import org.neo4j.logging.Log;
import org.neo4j.time.Stopwatch;
import org.neo4j.time.SystemNanoClock;

import static org.neo4j.util.FeatureToggles.flag;
import static org.neo4j.util.FeatureToggles.getInteger;

public class VerbosePageCacheTracer extends DefaultPageCacheTracer
{

    private static final boolean USE_RAW_REPORTING_UNITS =
            flag( VerbosePageCacheTracer.class, "reportInRawUnits", false );
    private static final int SPEED_REPORTING_TIME_THRESHOLD = getInteger( VerbosePageCacheTracer.class,
                                                                          "speedReportingThresholdSeconds", 10 );

    private final Log log;
    private final SystemNanoClock clock;
    private final AtomicLong flushedPages = new AtomicLong();
    private final AtomicLong flushBytesWritten = new AtomicLong();
    private final FlushEvent flushEvent = new FlushEvent()
    {
        public void addBytesWritten( long bytes )
        {
            VerbosePageCacheTracer.this.bytesWritten.add( bytes );
            VerbosePageCacheTracer.this.flushBytesWritten.getAndAdd( bytes );
        }

        public void done()
        {
            VerbosePageCacheTracer.this.flushes.increment();
        }

        public void done( IOException exception )
        {
            this.done();
        }

        public void addPagesFlushed( int pageCount )
        {
            VerbosePageCacheTracer.this.flushedPages.getAndAdd( (long) pageCount );
        }
    };

    VerbosePageCacheTracer( Log log, SystemNanoClock clock )
    {
        this.log = log;
        this.clock = clock;
    }

    private static String nanosToString( long nanos )
    {
        return USE_RAW_REPORTING_UNITS ? nanos + "ns" : TimeUtil.nanosToString( nanos );
    }

    private static String flushSpeed( long bytesWrittenInTotal, long flushTimeNanos )
    {
        if ( USE_RAW_REPORTING_UNITS )
        {
            return bytesInNanoSeconds( bytesWrittenInTotal, flushTimeNanos );
        }
        else
        {
            long seconds = TimeUnit.NANOSECONDS.toSeconds( flushTimeNanos );
            return seconds > 0L ? bytesToString( bytesWrittenInTotal / seconds ) + "/s"
                                : bytesInNanoSeconds( bytesWrittenInTotal, flushTimeNanos );
        }
    }

    private static String bytesInNanoSeconds( long bytesWrittenInTotal, long flushTimeNanos )
    {
        long bytesInNanoSecond =
                flushTimeNanos > 0L ? bytesWrittenInTotal / flushTimeNanos : bytesWrittenInTotal;
        return bytesInNanoSecond + "bytes/ns";
    }

    private static String bytesToString( long bytes )
    {
        return USE_RAW_REPORTING_UNITS ? bytes + "bytes" : ByteUnit.bytesToString( bytes );
    }

    public void mappedFile( File file )
    {
        this.log.info( String.format( "Map file: '%s'.", file.getName() ) );
        super.mappedFile( file );
    }

    public void unmappedFile( File file )
    {
        this.log.info( String.format( "Unmap file: '%s'.", file.getName() ) );
        super.unmappedFile( file );
    }

    public MajorFlushEvent beginCacheFlush()
    {
        this.log.info( "Start whole page cache flush." );
        return new VerbosePageCacheTracer.PageCacheMajorFlushEvent( this.flushedPages.get(),
                                                                    this.flushBytesWritten.get(), this.clock.startStopWatch() );
    }

    public MajorFlushEvent beginFileFlush( PageSwapper swapper )
    {
        String fileName = swapper.file().getName();
        this.log.info( String.format( "Flushing file: '%s'.", fileName ) );
        return new VerbosePageCacheTracer.FileFlushEvent( fileName, this.flushedPages.get(),
                                                          this.flushBytesWritten.get(), this.clock.startStopWatch() );
    }

    private class VerboseFlushOpportunity implements FlushEventOpportunity
    {

        private final String fileName;
        private Stopwatch lastReportingTime;
        private long lastReportedBytesWritten;

        VerboseFlushOpportunity( String fileName, Stopwatch startTime, long bytesWrittenOnStart )
        {
            this.fileName = fileName;
            this.lastReportingTime = startTime;
            this.lastReportedBytesWritten = bytesWrittenOnStart;
        }

        public FlushEvent beginFlush( long filePageId, long cachePageId, PageSwapper swapper )
        {
            if ( this.lastReportingTime
                    .hasTimedOut( (long) VerbosePageCacheTracer.SPEED_REPORTING_TIME_THRESHOLD,
                                  TimeUnit.SECONDS ) )
            {
                long writtenBytes = VerbosePageCacheTracer.this.flushBytesWritten.get();
                VerbosePageCacheTracer.this.log
                        .info( String.format( "'%s' flushing speed: %s.", this.fileName,
                                              VerbosePageCacheTracer.flushSpeed( writtenBytes - this.lastReportedBytesWritten,
                                                                                 this.lastReportingTime
                                                                                         .elapsed( TimeUnit.NANOSECONDS ) ) ) );
                this.lastReportingTime = VerbosePageCacheTracer.this.clock.startStopWatch();
                this.lastReportedBytesWritten = writtenBytes;
            }

            return VerbosePageCacheTracer.this.flushEvent;
        }
    }

    private class PageCacheMajorFlushEvent implements MajorFlushEvent
    {

        private final long flushesOnStart;
        private final long bytesWrittenOnStart;
        private final Stopwatch startTime;

        PageCacheMajorFlushEvent( long flushesOnStart, long bytesWrittenOnStart, Stopwatch startTime )
        {
            this.flushesOnStart = flushesOnStart;
            this.bytesWrittenOnStart = bytesWrittenOnStart;
            this.startTime = startTime;
        }

        public FlushEventOpportunity flushEventOpportunity()
        {
            return VerbosePageCacheTracer.this.new VerboseFlushOpportunity( "Page Cache", this.startTime,
                                                                            this.bytesWrittenOnStart );
        }

        public void close()
        {
            long pageCacheFlushNanos = this.startTime.elapsed( TimeUnit.NANOSECONDS );
            long bytesWrittenInTotal =
                    VerbosePageCacheTracer.this.flushBytesWritten.get() - this.bytesWrittenOnStart;
            long flushedPagesInTotal =
                    VerbosePageCacheTracer.this.flushedPages.get() - this.flushesOnStart;
            VerbosePageCacheTracer.this.log.info(
                    "Page cache flush completed. Flushed %s in %d pages. Flush took: %s. Average speed: %s.",
                    new Object[]{VerbosePageCacheTracer.bytesToString( bytesWrittenInTotal ),
                                 flushedPagesInTotal,
                                 VerbosePageCacheTracer.nanosToString( pageCacheFlushNanos ),
                                 VerbosePageCacheTracer.flushSpeed( bytesWrittenInTotal, pageCacheFlushNanos )} );
        }
    }

    private class FileFlushEvent implements MajorFlushEvent
    {

        private final Stopwatch startTime;
        private final String fileName;
        private long flushesOnStart;
        private long bytesWrittenOnStart;

        FileFlushEvent( String fileName, long flushesOnStart, long bytesWrittenOnStart,
                        Stopwatch startTime )
        {
            this.fileName = fileName;
            this.flushesOnStart = flushesOnStart;
            this.bytesWrittenOnStart = bytesWrittenOnStart;
            this.startTime = startTime;
        }

        public FlushEventOpportunity flushEventOpportunity()
        {
            return VerbosePageCacheTracer.this.new VerboseFlushOpportunity( this.fileName, this.startTime,
                                                                            this.bytesWrittenOnStart );
        }

        public void close()
        {
            long fileFlushNanos = this.startTime.elapsed( TimeUnit.NANOSECONDS );
            long bytesWrittenInTotal =
                    VerbosePageCacheTracer.this.flushBytesWritten.get() - this.bytesWrittenOnStart;
            long flushedPagesInTotal =
                    VerbosePageCacheTracer.this.flushedPages.get() - this.flushesOnStart;
            VerbosePageCacheTracer.this.log
                    .info( "'%s' flush completed. Flushed %s in %d pages. Flush took: %s. Average speed: %s.",
                           new Object[]{this.fileName, VerbosePageCacheTracer.bytesToString( bytesWrittenInTotal ),
                                        flushedPagesInTotal,
                                        VerbosePageCacheTracer.nanosToString( fileFlushNanos ),
                                        VerbosePageCacheTracer.flushSpeed( bytesWrittenInTotal, fileFlushNanos )} );
        }
    }
}
