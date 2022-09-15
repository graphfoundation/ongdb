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
package org.neo4j.kernel.api.index;

import java.nio.file.Path;

import org.neo4j.internal.schema.IndexProviderDescriptor;

/**
 * Dictates how directory structure looks for an IndexProvider and its indexes. Generally there's a
 * {@link #rootDirectory() root directory} which contains all index directories in some shape and form.
 * For getting a directory (which must be a sub-directory to the root directory) for a particular index there's the
 * {@link #directoryForIndex(long)} method.
 *
 * These instances are created from a {@link Factory} which typically gets passed into an IndexProvider constructor,
 * which then creates a {@link IndexDirectoryStructure} given its {@link IndexProviderDescriptor}.
 */
public abstract class IndexDirectoryStructure
{
    /**
     * Creates an {@link IndexDirectoryStructure} for a {@link IndexProviderDescriptor} for an IndexProvider.
     */
    public interface Factory
    {
        IndexDirectoryStructure forProvider( IndexProviderDescriptor descriptor );
    }

    private static class SubDirectoryByIndexId extends IndexDirectoryStructure
    {
        private final Path providerRootFolder;

        private SubDirectoryByIndexId( Path providerRootFolder )
        {
            this.providerRootFolder = providerRootFolder;
        }

        @Override
        public Path rootDirectory()
        {
            return providerRootFolder;
        }

        @Override
        public Path directoryForIndex( long indexId )
        {
            return providerRootFolder.resolve( String.valueOf( indexId ) );
        }
    }

    private static class NoSubDirectory extends IndexDirectoryStructure
    {
        private final Path rootDirectory;

        private NoSubDirectory( Path rootDirectory )
        {
            this.rootDirectory = rootDirectory;
        }

        @Override
        public Path rootDirectory()
        {
            return rootDirectory;
        }

        @Override
        public Path directoryForIndex( long indexId )
        {
            return rootDirectory;
        }
    }

    /**
     * Returns the base schema index directory, i.e.
     *
     * <pre>
     * &lt;db&gt;/schema/index/
     * </pre>
     *
     * @param databaseStoreDir database store directory, i.e. {@code db} in the example above, where e.g. {@code nodestore} lives.
     * @return the base directory of schema indexing.
     */
    public static Path baseSchemaIndexFolder( Path databaseStoreDir )
    {
        return databaseStoreDir.resolve( "schema" ).resolve( "index" );
    }

    /**
     * @param databaseStoreDir store directory of database, i.e. {@code db} in the example above.
     * @return {@link Factory} for creating {@link IndexDirectoryStructure} returning directories looking something like:
     *
     * <pre>
     * &lt;db&gt;/schema/index/&lt;providerKey&gt;-&lt;providerVersion&gt;/&lt;indexId&gt;/
     * </pre>
     */
    public static Factory directoriesByProvider( Path databaseStoreDir )
    {
        return descriptor -> new SubDirectoryByIndexId( baseSchemaIndexFolder( databaseStoreDir ).resolve( fileNameFriendly( descriptor ) ) );
    }

    /**
     * @param databaseStoreDir store directory of database.
     * @return {@link Factory} for creating {@link IndexDirectoryStructure} used for indexes that should reside directly in the store dir.
     */
    public static Factory noSubDirectory( Path databaseStoreDir )
    {
        return descriptor -> new NoSubDirectory( databaseStoreDir );
    }

    /**
     * @param directoryStructure existing {@link IndexDirectoryStructure}.
     * @return a {@link Factory} returning an already existing {@link IndexDirectoryStructure}.
     */
    public static Factory given( IndexDirectoryStructure directoryStructure )
    {
        return descriptor -> directoryStructure;
    }

    /**
     * Useful when combining multiple IndexProvider into one.
     *
     * @param parentStructure {@link IndexDirectoryStructure} of the parent.
     * @return {@link Factory} creating {@link IndexDirectoryStructure} looking something like:
     *
     * <pre>
     * &lt;db&gt;/schema/index/.../&lt;indexId&gt;/&lt;childProviderKey&gt;-&lt;childProviderVersion&gt;/
     * </pre>
     */
    public static Factory directoriesBySubProvider( IndexDirectoryStructure parentStructure )
    {
        return descriptor -> new IndexDirectoryStructure()
        {
            @Override
            public Path rootDirectory()
            {
                return parentStructure.rootDirectory();
            }

            @Override
            public Path directoryForIndex( long indexId )
            {
                return parentStructure.directoryForIndex( indexId ).resolve( fileNameFriendly( descriptor ) );
            }
        };
    }

    public static String fileNameFriendly( String name )
    {
        return name.replaceAll( "\\+", "_" );
    }

    static String fileNameFriendly( IndexProviderDescriptor descriptor )
    {
        return fileNameFriendly( descriptor.getKey() + "-" + descriptor.getVersion() );
    }

    private static final IndexDirectoryStructure NO_DIRECTORY_STRUCTURE = new IndexDirectoryStructure()
    {
        @Override
        public Path rootDirectory()
        {
            return null; // meaning there's no persistent storage
        }

        @Override
        public Path directoryForIndex( long indexId )
        {
            return null; // meaning there's no persistent storage
        }
    };

    /**
     * Useful for some in-memory index providers or similar.
     */
    public static final Factory NONE = descriptor -> NO_DIRECTORY_STRUCTURE;

    /**
     * Returns root directory. Must be parent (one or more steps) to all sub-directories returned from {@link #directoryForIndex(long)}.
     * Returns something equivalent to:
     *
     * <pre>
     * &lt;db&gt;/schema/index/&lt;provider&gt;/
     * </pre>
     *
     * @return {@link Path} denoting root directory for this provider.
     * May return {@code null} if there's no root directory, i.e. no persistent storage at all.
     */
    public abstract Path rootDirectory();

    /**
     * Returns a sub-directory (somewhere under {@link #rootDirectory()}) for a specific index id, looking something equivalent to:
     *
     * <pre>
     * &lt;db&gt;/schema/index/&lt;provider&gt;/&lt;indexId&gt;/
     * </pre>
     *
     * I.e. the root of the schema indexes for this specific provider.
     *
     * @param indexId index id to return directory for.
     * @return {@link Path} denoting directory for the specific {@code indexId} for this provider.
     * May return {@code null} if there's no root directory, i.e. no persistent storage at all.
     */
    public abstract Path directoryForIndex( long indexId );
}
