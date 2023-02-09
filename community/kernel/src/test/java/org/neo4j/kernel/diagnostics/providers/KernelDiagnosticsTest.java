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
package org.neo4j.kernel.diagnostics.providers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Path;
import java.util.Collections;

import org.neo4j.io.fs.DefaultFileSystemAbstraction;
import org.neo4j.io.fs.StoreChannel;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.memory.ByteBuffers;
import org.neo4j.logging.AssertableLogProvider;
import org.neo4j.storageengine.api.StorageEngineFactory;
import org.neo4j.test.extension.DefaultFileSystemExtension;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.Neo4jLayoutExtension;
import org.neo4j.test.utils.TestDirectory;

import static java.util.Collections.singletonList;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.neo4j.io.ByteUnit.kibiBytes;
import static org.neo4j.logging.LogAssertions.assertThat;
import static org.neo4j.memory.EmptyMemoryTracker.INSTANCE;

@ExtendWith( DefaultFileSystemExtension.class )
@Neo4jLayoutExtension
class KernelDiagnosticsTest
{
    @Inject
    private DefaultFileSystemAbstraction fs;
    @Inject
    private TestDirectory testDirectory;
    @Inject
    private DatabaseLayout databaseLayout;

    @Test
    void shouldPrintDiskUsage() throws IOException
    {
        DatabaseLayout layout = DatabaseLayout.ofFlat( testDirectory.homePath() );
        StorageEngineFactory storageEngineFactory = mock( StorageEngineFactory.class );
        when( storageEngineFactory.listStorageFiles( any(), any() ) ).thenReturn( Collections.emptyList() );

        AssertableLogProvider logProvider = new AssertableLogProvider();
        StoreFilesDiagnostics storeFiles = new StoreFilesDiagnostics( storageEngineFactory, fs, layout );
        storeFiles.dump( logProvider.getLog( getClass() )::debug );

        assertThat( logProvider ).containsMessages( "Disk space on partition" );
    }

    @Test
    void printDatabaseFileStoreType()
    {
        StorageEngineFactory storageEngineFactory = mock( StorageEngineFactory.class );

        AssertableLogProvider logProvider = new AssertableLogProvider();
        StoreFilesDiagnostics storeFiles = new StoreFilesDiagnostics( storageEngineFactory, fs, databaseLayout );
        storeFiles.dump( logProvider.getLog( getClass() )::debug );

        assertThat( logProvider ).containsMessages( "Storage files stored on file store: " );
    }

    @Test
    void shouldCountFileSizeRecursively() throws IOException
    {
        // file structure:
        //   storeDir/indexDir/indexFile (1 kB)
        //   storeDir/neostore (3 kB)
        Path storeDir = testDirectory.directory( "storedir" );
        DatabaseLayout layout = DatabaseLayout.ofFlat( storeDir );
        Path indexDir = directory( storeDir, "indexDir" );
        file( indexDir, "indexFile", (int) kibiBytes( 1 ) );
        file( storeDir, layout.metadataStore().getFileName().toString(), (int) kibiBytes( 3 ) );
        StorageEngineFactory storageEngineFactory = mock( StorageEngineFactory.class );
        when( storageEngineFactory.listStorageFiles( any(), any() ) ).thenReturn( singletonList( layout.metadataStore() ) );

        AssertableLogProvider logProvider = new AssertableLogProvider();
        StoreFilesDiagnostics storeFiles = new StoreFilesDiagnostics( storageEngineFactory, fs, layout );
        storeFiles.dump( logProvider.getLog( getClass() )::debug );

        assertThat( logProvider ).containsMessages( "Total size of store: 4.000KiB", "Total size of mapped files: 3.000KiB" );
    }

    private Path directory( Path parent, String name ) throws IOException
    {
        Path dir = parent.resolve( name );
        fs.mkdirs( dir );
        return dir;
    }

    private Path file( Path parent, String name, int size ) throws IOException
    {
        Path file = parent.resolve( name );
        try ( StoreChannel channel = fs.write( file ) )
        {
            ByteBuffer buffer = ByteBuffers.allocate( size, INSTANCE );
            buffer.position( size ).flip();
            channel.writeAll( buffer );
        }
        return file;
    }
}
