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
package org.neo4j.kernel.api.impl.index.storage;

import org.apache.lucene.store.ByteBuffersDirectory;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.store.FilterDirectory;
import org.apache.lucene.store.NIOFSDirectory;
import org.apache.lucene.store.NRTCachingDirectory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

import org.neo4j.io.IOUtils;
import org.neo4j.util.FeatureToggles;

public interface DirectoryFactory extends AutoCloseable
{
    static DirectoryFactory directoryFactory( boolean ephemeral )
    {
        return ephemeral ? new DirectoryFactory.InMemoryDirectoryFactory() : DirectoryFactory.PERSISTENT;
    }

    Directory open( Path dir ) throws IOException;

    DirectoryFactory PERSISTENT = new DirectoryFactory()
    {
        private final int MAX_MERGE_SIZE_MB =
                FeatureToggles.getInteger( DirectoryFactory.class, "max_merge_size_mb", 5 );
        private final int MAX_CACHED_MB =
                FeatureToggles.getInteger( DirectoryFactory.class, "max_cached_mb", 50 );
        private final boolean USE_DEFAULT_DIRECTORY_FACTORY =
                FeatureToggles.flag( DirectoryFactory.class, "default_directory_factory", true );

        @SuppressWarnings( "ResultOfMethodCallIgnored" )
        @Override
        public Directory open( Path dir ) throws IOException
        {
            Files.createDirectories( dir );
            FSDirectory directory = USE_DEFAULT_DIRECTORY_FACTORY ? FSDirectory.open( dir ) : new NIOFSDirectory( dir );
            return new NRTCachingDirectory( directory, MAX_MERGE_SIZE_MB, MAX_CACHED_MB );
        }

        @Override
        public void close()
        {
            // No resources to release. This method only exists as a hook for test implementations.
        }

    };

    final class InMemoryDirectoryFactory implements DirectoryFactory
    {
        private final Map<Path, Directory> directories = new HashMap<>();

        @Override
        public synchronized Directory open( Path dir )
        {
            if ( !directories.containsKey( dir ) )
            {
                directories.put( dir, new ByteBuffersDirectory() );
            }
            return new UncloseableDirectory( directories.get( dir ) );
        }

        @Override
        public synchronized void close() throws IOException
        {
            IOUtils.closeAll( directories.values() );
            directories.clear();
        }
    }

    final class Single implements DirectoryFactory
    {
        private final Directory directory;

        public Single( Directory directory )
        {
            this.directory = directory;
        }

        @Override
        public Directory open( Path dir )
        {
            return directory;
        }

        @Override
        public void close()
        {
        }
    }

    final class UncloseableDirectory extends FilterDirectory
    {

        public UncloseableDirectory( Directory delegate )
        {
            super( delegate );
        }

        @Override
        public void close()
        {
            // No-op
        }
    }
}
