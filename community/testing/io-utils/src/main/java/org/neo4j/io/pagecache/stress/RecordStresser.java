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
package org.neo4j.io.pagecache.stress;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Callable;

import org.neo4j.io.pagecache.PageCursor;
import org.neo4j.io.pagecache.PagedFile;
import org.neo4j.io.pagecache.TinyLockManager;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.io.pagecache.PagedFile.PF_SHARED_READ_LOCK;
import static org.neo4j.io.pagecache.PagedFile.PF_SHARED_WRITE_LOCK;

public class RecordStresser implements Callable<Void>
{
    private final PagedFile pagedFile;
    private final Condition condition;
    private final int maxRecords;
    private final RecordFormat format;
    private final int threadId;
    private final TinyLockManager locks;
    private final PageCacheTracer cacheTracer;
    private long countSum;

    public RecordStresser( PagedFile pagedFile,
                           Condition condition,
                           int maxRecords,
                           RecordFormat format,
                           int threadId,
                           TinyLockManager locks,
                           PageCacheTracer cacheTracer )
    {
        this.pagedFile = pagedFile;
        this.condition = condition;
        this.maxRecords = maxRecords;
        this.format = format;
        this.threadId = threadId;
        this.locks = locks;
        this.cacheTracer = cacheTracer;
    }

    @Override
    public Void call() throws Exception
    {
        Random random = new Random();
        int recordsPerPage = format.getRecordsPerPage();
        int recordSize = format.getRecordSize();
        try ( PageCursor cursor = pagedFile.io( 0, PF_SHARED_WRITE_LOCK, CursorContext.NULL ) )
        {
            while ( !condition.fulfilled() )
            {
                int recordId = random.nextInt( maxRecords );
                int pageId = recordId / recordsPerPage;
                int recordOffset = (recordId % recordsPerPage) * recordSize;

                locks.lock( recordId );
                try
                {
                    assertTrue( cursor.next( pageId ), "I must be able to access pages" );
                    cursor.setOffset( recordOffset );
                    long newValue = format.incrementCounter( cursor, threadId );
                    countSum++;
                    assertFalse( cursor.shouldRetry(), "Write lock, so never a need to retry" );
                    assertThat( newValue ).describedAs( "Record-local count must be less than or equal to thread-local count sum" )
                            .isLessThanOrEqualTo( countSum );
                }
                finally
                {
                    locks.unlock( recordId );
                }
            }
        }

        return null;
    }

    public void verifyCounts() throws IOException
    {
        long actualSum = 0;
        try ( PageCursor cursor = pagedFile.io( 0, PF_SHARED_READ_LOCK, CursorContext.NULL ) )
        {
            while ( cursor.next() )
            {
                actualSum += format.sumCountsForThread( cursor, threadId );
            }
        }
        assertThat( actualSum ).describedAs( "Thread specific sum across all records" ).isEqualTo( countSum );
    }
}
