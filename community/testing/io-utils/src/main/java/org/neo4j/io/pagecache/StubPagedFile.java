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
package org.neo4j.io.pagecache;

import java.io.IOException;
import java.nio.file.Path;

import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.monitoring.PageFileCounters;
import org.neo4j.io.pagecache.tracing.PageFileSwapperTracer;

public class StubPagedFile implements PagedFile
{
    private final int pageSize;
    public final int exposedPageSize;
    public long lastPageId = 1;

    public StubPagedFile( int pageSize )
    {
        this.pageSize = pageSize;
        this.exposedPageSize = pageSize;
    }

    @Override
    public PageCursor io( long pageId, int pf_flags, CursorContext context ) throws IOException
    {
        StubPageCursor cursor = new StubPageCursor( pageId, pageSize );
        prepareCursor( cursor );
        return cursor;
    }

    protected void prepareCursor( StubPageCursor cursor )
    {
    }

    @Override
    public int pageSize()
    {
        return exposedPageSize;
    }

    @Override
    public long fileSize()
    {
        if ( lastPageId < 0 )
        {
            return 0L;
        }
        return (lastPageId + 1) * pageSize();
    }

    @Override
    public Path path()
    {
        return Path.of( "stub" );
    }

    @Override
    public void flushAndForce()
    {
    }

    @Override
    public long getLastPageId()
    {
        return lastPageId;
    }

    @Override
    public void close()
    {
    }

    @Override
    public void setDeleteOnClose( boolean deleteOnClose )
    {
    }

    @Override
    public boolean isDeleteOnClose()
    {
        return false;
    }

    @Override
    public String getDatabaseName()
    {
        return "stub";
    }

    @Override
    public PageFileCounters pageFileCounters()
    {
        return PageFileSwapperTracer.NULL;
    }
}
