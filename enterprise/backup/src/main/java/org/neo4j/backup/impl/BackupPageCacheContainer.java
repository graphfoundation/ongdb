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
package org.neo4j.backup.impl;

import org.neo4j.io.pagecache.PageCache;
import org.neo4j.scheduler.JobScheduler;

class BackupPageCacheContainer implements AutoCloseable
{
    private final PageCache pageCache;
    private final JobScheduler jobScheduler;

    public static BackupPageCacheContainer of( PageCache pageCache )
    {
        return of( pageCache, null );
    }

    public static BackupPageCacheContainer of( PageCache pageCache, JobScheduler jobScheduler )
    {
        return new BackupPageCacheContainer( pageCache, jobScheduler );
    }

    private BackupPageCacheContainer( PageCache pageCache, JobScheduler jobScheduler )
    {
        this.pageCache = pageCache;
        this.jobScheduler = jobScheduler;
    }

    public PageCache getPageCache()
    {
        return pageCache;
    }

    @Override
    public void close() throws Exception
    {
        pageCache.close();
        if ( jobScheduler != null )
        {
            jobScheduler.close();
        }
    }
}
