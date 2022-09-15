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
package org.neo4j.test.extension.pagecache;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;

import org.neo4j.io.fs.DefaultFileSystemAbstraction;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.PagedFile;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.utils.TestDirectory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

@PageCacheExtension
class PageCacheExtensionTest
{
    @Inject
    private PageCache pageCache;
    @Inject
    private TestDirectory testDirectory;

    @Test
    void pageCacheInjected()
    {
        assertNotNull( pageCache );
    }

    @Test
    void testDirectoryInjected()
    {
        assertNotNull( testDirectory );
    }

    @Test
    void testDirectoryWithHasDefaultFileSystem()
    {
        assertThat( testDirectory.getFileSystem() ).isInstanceOf( DefaultFileSystemAbstraction.class );
    }

    @Test
    void pageCacheCanFindFileCreatedByTestDirectory() throws IOException
    {
        Path testFile = testDirectory.createFile( "testFile" );
        try ( PagedFile map = pageCache.map( testFile, 4096, testDirectory.homePath().getFileName().toString() ) )
        {
            assertNotNull( map );
        }
    }

    @Nested
    class NestedPageCacheTest
    {
        @Inject
        private PageCache nestedPageCache;

        @Test
        void nestedPageCacheInjection()
        {
            assertNotNull( nestedPageCache );
        }

        @Test
        void nestedAndRootPageCacheAreTheSame()
        {
            assertSame( pageCache, nestedPageCache );
        }
    }
}
