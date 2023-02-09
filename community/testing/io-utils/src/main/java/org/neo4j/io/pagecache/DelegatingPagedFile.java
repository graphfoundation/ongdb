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

public class DelegatingPagedFile implements PagedFile
{
    private final PagedFile delegate;

    public DelegatingPagedFile( PagedFile delegate )
    {
        this.delegate = delegate;
    }

    @Override
    public PageCursor io( long pageId, int pf_flags, CursorContext context ) throws IOException
    {
        return delegate.io( pageId, pf_flags, context );
    }

    @Override
    public void flushAndForce() throws IOException
    {
        delegate.flushAndForce();
    }

    @Override
    public long getLastPageId() throws IOException
    {
        return delegate.getLastPageId();
    }

    @Override
    public int pageSize()
    {
        return delegate.pageSize();
    }

    @Override
    public long fileSize() throws IOException
    {
        return delegate.fileSize();
    }

    @Override
    public Path path()
    {
        return delegate.path();
    }

    @Override
    public void close()
    {
        delegate.close();
    }

    @Override
    public void setDeleteOnClose( boolean deleteOnClose )
    {
        delegate.setDeleteOnClose( deleteOnClose );
    }

    @Override
    public boolean isDeleteOnClose()
    {
        return delegate.isDeleteOnClose();
    }

    @Override
    public String getDatabaseName()
    {
        return delegate.getDatabaseName();
    }

    @Override
    public PageFileCounters pageFileCounters()
    {
        return delegate.pageFileCounters();
    }
}
