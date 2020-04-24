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

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.neo4j.io.pagecache.PageCache;
import org.neo4j.scheduler.JobScheduler;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

class BackupPageCacheContainerTest
{
    private PageCache pageCache;
    private JobScheduler jobScheduler;

    @BeforeEach
    void setUp()
    {
        pageCache = mock( PageCache.class );
        jobScheduler = mock( JobScheduler.class );
    }

    @Test
    void createAndCloseContainerWithPageCacheOnly() throws Exception
    {
        BackupPageCacheContainer pageCacheContainer = BackupPageCacheContainer.of( pageCache );
        pageCacheContainer.close();

        verify( pageCache ).close();
        verify( jobScheduler, never() ).close();
    }

    @Test
    void createAndCloseContainerWithPageCacheAndScheduler() throws Exception
    {
        BackupPageCacheContainer pageCacheContainer = BackupPageCacheContainer.of( pageCache, jobScheduler );
        pageCacheContainer.close();

        verify( pageCache ).close();
        verify( jobScheduler ).close();
    }
}
