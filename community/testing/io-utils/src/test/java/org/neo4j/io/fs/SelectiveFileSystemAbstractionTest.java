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
package org.neo4j.io.fs;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;

import org.neo4j.io.fs.watcher.FileWatcher;
import org.neo4j.io.fs.watcher.resource.WatchedResource;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

class SelectiveFileSystemAbstractionTest
{
    @Test
    void shouldUseCorrectFileSystemForChosenFile() throws Exception
    {
        // given
        Path specialFile = Path.of( "special" );
        FileSystemAbstraction normal = mock( FileSystemAbstraction.class );
        FileSystemAbstraction special = mock( FileSystemAbstraction.class );

        // when
        try ( SelectiveFileSystemAbstraction systemAbstraction = new SelectiveFileSystemAbstraction( specialFile,
                special, normal ) )
        {
            systemAbstraction.read( specialFile );

            // then
            verify( special ).read( specialFile );
            verifyNoMoreInteractions( special );
            verifyNoMoreInteractions( normal );
        }
    }

    @Test
    void shouldUseDefaultFileSystemForOtherFiles() throws Exception
    {
        // given
        Path specialFile = Path.of( "special" );
        Path otherFile = Path.of( "other" );

        FileSystemAbstraction normal = mock( FileSystemAbstraction.class );
        FileSystemAbstraction special = mock( FileSystemAbstraction.class );

        // when
        try ( SelectiveFileSystemAbstraction fs = new SelectiveFileSystemAbstraction( specialFile, special, normal ) )
        {
            fs.write( otherFile );
            fs.read( otherFile );

            // then
            verify( normal ).write( otherFile );
            verify( normal ).read( otherFile );
            verifyNoMoreInteractions( special );
            verifyNoMoreInteractions( normal );
        }
    }

    @Test
    void provideSelectiveWatcher() throws IOException
    {
        Path specialFile = Path.of( "special" );
        Path otherFile = Path.of( "other" );

        FileSystemAbstraction normal = mock( FileSystemAbstraction.class );
        FileSystemAbstraction special = mock( FileSystemAbstraction.class );

        FileWatcher specialWatcher = mock( FileWatcher.class );
        FileWatcher normalWatcher = mock( FileWatcher.class );
        WatchedResource specialResource = mock( WatchedResource.class );
        WatchedResource normalResource = mock( WatchedResource.class );

        when( special.fileWatcher() ).thenReturn( specialWatcher );
        when( normal.fileWatcher() ).thenReturn( normalWatcher );
        when( specialWatcher.watch( specialFile ) ).thenReturn( specialResource );
        when( normalWatcher.watch( otherFile ) ).thenReturn( normalResource );

        try ( SelectiveFileSystemAbstraction fs = new SelectiveFileSystemAbstraction( specialFile, special, normal ) )
        {
            FileWatcher fileWatcher = fs.fileWatcher();
            assertSame( specialResource, fileWatcher.watch( specialFile ) );
            assertSame( normalResource, fileWatcher.watch( otherFile ) );
        }
    }
}
