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
package org.neo4j.kernel.impl.pagecache;

import java.io.IOException;
import java.util.concurrent.ExecutorService;

import org.neo4j.io.fs.FileUtils;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.PagedFile;

class PageLoaderFactory
{
    private final ExecutorService executor;
    private final PageCache pageCache;

    PageLoaderFactory( ExecutorService executor, PageCache pageCache )
    {
        this.executor = executor;
        this.pageCache = pageCache;
    }

    PageLoader getLoader( PagedFile file ) throws IOException
    {
        if ( FileUtils.highIODevice( file.file().toPath(), false ) )
        {
            return new ParallelPageLoader( file, executor, pageCache );
        }
        return new SingleCursorPageLoader( file );
    }
}
