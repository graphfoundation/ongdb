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

import org.eclipse.collections.api.set.ImmutableSet;

import java.io.IOException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

import org.neo4j.io.pagecache.buffer.IOBufferFactory;

public class DelegatingPageCache implements PageCache
{
    private final PageCache delegate;

    public DelegatingPageCache( PageCache delegate )
    {
        this.delegate = delegate;
    }

    @Override
    public PagedFile map( Path path, int pageSize, String databaseName, ImmutableSet<OpenOption> openOptions,
            IOController ioController ) throws IOException
    {
        return delegate.map( path, pageSize, databaseName, openOptions, ioController );
    }

    @Override
    public Optional<PagedFile> getExistingMapping( Path path ) throws IOException
    {
        return delegate.getExistingMapping( path );
    }

    @Override
    public List<PagedFile> listExistingMappings() throws IOException
    {
        return delegate.listExistingMappings();
    }

    @Override
    public int pageSize()
    {
        return delegate.pageSize();
    }

    @Override
    public int pageReservedBytes()
    {
        return delegate.pageReservedBytes();
    }

    @Override
    public void close()
    {
        delegate.close();
    }

    @Override
    public long maxCachedPages()
    {
        return delegate.maxCachedPages();
    }

    @Override
    public IOBufferFactory getBufferFactory()
    {
        return delegate.getBufferFactory();
    }

    @Override
    public void flushAndForce() throws IOException
    {
        delegate.flushAndForce();
    }

}
