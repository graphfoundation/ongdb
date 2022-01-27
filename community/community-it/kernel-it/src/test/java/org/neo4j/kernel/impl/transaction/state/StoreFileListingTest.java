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
package org.neo4j.kernel.impl.transaction.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.graphdb.Resource;
import org.neo4j.graphdb.ResourceIterator;
import org.neo4j.internal.helpers.collection.Iterators;
import org.neo4j.internal.id.IdGeneratorFactory;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.kernel.database.Database;
import org.neo4j.kernel.impl.api.index.IndexingService;
import org.neo4j.kernel.impl.store.StoreFileListing;
import org.neo4j.kernel.impl.store.StoreFileProvider;
import org.neo4j.kernel.impl.transaction.log.files.LogFiles;
import org.neo4j.kernel.internal.GraphDatabaseAPI;
import org.neo4j.storageengine.api.StorageEngine;
import org.neo4j.storageengine.api.StoreFileMetadata;
import org.neo4j.test.TestDatabaseManagementServiceBuilder;
import org.neo4j.test.extension.DbmsExtension;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.utils.TestDirectory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;
import static org.neo4j.internal.helpers.collection.Iterators.asResourceIterator;
import static org.neo4j.kernel.impl.transaction.log.files.TransactionLogFiles.DEFAULT_FILENAME_FILTER;

@DbmsExtension
class StoreFileListingTest
{
    @Inject
    private GraphDatabaseAPI db;
    @Inject
    private TestDirectory testDirectory;
    @Inject
    private Database database;
    private static final String[] STANDARD_STORE_DIR_FILES = new String[]{
            "index",
            "lock",
            "debug.log",
            "neostore",
            "neostore.id",
            "neostore.counts.db",
            "neostore.labelscanstore.db",
            "neostore.labeltokenstore.db",
            "neostore.labeltokenstore.db.id",
            "neostore.labeltokenstore.db.names",
            "neostore.labeltokenstore.db.names.id",
            "neostore.nodestore.db",
            "neostore.nodestore.db.id",
            "neostore.nodestore.db.labels",
            "neostore.nodestore.db.labels.id",
            "neostore.propertystore.db",
            "neostore.propertystore.db.arrays",
            "neostore.propertystore.db.arrays.id",
            "neostore.propertystore.db.id",
            "neostore.propertystore.db.index",
            "neostore.propertystore.db.index.id",
            "neostore.propertystore.db.index.keys",
            "neostore.propertystore.db.index.keys.id",
            "neostore.propertystore.db.strings",
            "neostore.propertystore.db.strings.id",
            "neostore.relationshipgroupstore.db",
            "neostore.relationshipgroupstore.db.id",
            "neostore.relationshipstore.db",
            "neostore.relationshipstore.db.id",
            "neostore.relationshiptypestore.db",
            "neostore.relationshiptypestore.db.id",
            "neostore.relationshiptypestore.db.names",
            "neostore.relationshiptypestore.db.names.id",
            "neostore.schemastore.db",
            "neostore.schemastore.db.id",
            "neostore.transaction.db.0",
            "neostore.transaction.db.1",
            "neostore.transaction.db.2",
            "store_lock"};

    private static final String[] STANDARD_STORE_DIR_DIRECTORIES = new String[]{"schema", "index", "branched"};

    @BeforeEach
    void setUp() throws IOException
    {
        createIndexDbFile();
    }

    @Test
    void shouldCloseIndexSnapshots() throws Exception
    {
        // Given
        IndexingService indexingService = mock( IndexingService.class );
        DatabaseLayout databaseLayout = mock( DatabaseLayout.class );
        when( databaseLayout.metadataStore() ).thenReturn( mock( Path.class ) );
        LogFiles logFiles = mock( LogFiles.class );
        filesInStoreDirAre( databaseLayout, STANDARD_STORE_DIR_FILES, STANDARD_STORE_DIR_DIRECTORIES );
        StorageEngine storageEngine = mock( StorageEngine.class );
        IdGeneratorFactory idGeneratorFactory = mock( IdGeneratorFactory.class );
        StoreFileListing fileListing = new StoreFileListing( databaseLayout, logFiles,
                                                             indexingService, storageEngine, idGeneratorFactory );

        ResourceIterator<Path> indexSnapshot = indexFilesAre( indexingService, new String[]{"schema/index/my.index"} );

        ResourceIterator<StoreFileMetadata> result = fileListing.builder().excludeLogFiles().build();

        // When
        result.close();

        // Then
        verify( indexSnapshot ).close();
    }

    @Test
    void shouldListMetaDataStoreLast() throws Exception
    {
        StoreFileMetadata fileMetadata = Iterators.last( database.listStoreFiles( false ) );
        assertEquals( fileMetadata.path(), database.getDatabaseLayout().metadataStore() );
    }

    @Test
    void shouldListMetaDataStoreLastWithTxLogs() throws Exception
    {
        StoreFileMetadata fileMetadata = Iterators.last( database.listStoreFiles( true ) );
        assertEquals( fileMetadata.path(), database.getDatabaseLayout().metadataStore() );
    }

    @Test
    void shouldListTransactionLogsFromCustomAbsoluteLocationWhenConfigured() throws IOException
    {
        Path customLogLocation = testDirectory.directory( "customLogLocation" );
        verifyLogFilesWithCustomPathListing( customLogLocation.toAbsolutePath() );
    }

    @Test
    void shouldListTxLogFiles() throws Exception
    {
        assertTrue( database.listStoreFiles( true ).stream()
                .map( metaData -> metaData.path().getFileName() )
                .anyMatch( fileName ->
                {
                    try
                    {
                        return DEFAULT_FILENAME_FILTER.accept( fileName );
                    }
                    catch ( IOException e )
                    {
                        throw new UncheckedIOException( e );
                    }
                } ) );
    }

    @Test
    void shouldNotListTxLogFiles() throws Exception
    {
        assertTrue( database.listStoreFiles( false ).stream()
                .map( metaData -> metaData.path().getFileName() )
                .noneMatch( fileName ->
                {
                    try
                    {
                        return DEFAULT_FILENAME_FILTER.accept( fileName );
                    }
                    catch ( IOException e )
                    {
                        throw new UncheckedIOException( e );
                    }
                } ) );
    }

    @Test
    void shouldListNeostoreFiles() throws Exception
    {
        DatabaseLayout layout = database.getDatabaseLayout();
        Set<Path> expectedFiles = layout.storeFiles();
        // there was no rotation
        ResourceIterator<StoreFileMetadata> storeFiles = database.listStoreFiles( false );
        Set<Path> listedStoreFiles = storeFiles.stream()
                .map( StoreFileMetadata::path )
                .collect( Collectors.toSet() );
        assertEquals( expectedFiles, listedStoreFiles );
    }

    @Test
    void doNotListFilesFromAdditionalProviderThatRegisterTwice() throws IOException
    {
        StoreFileListing storeFileListing = database.getStoreFileListing();
        MarkerFileProvider provider = new MarkerFileProvider();
        storeFileListing.registerStoreFileProvider( provider );
        storeFileListing.registerStoreFileProvider( provider );
        ResourceIterator<StoreFileMetadata> metadataResourceIterator = storeFileListing.builder().build();
        assertEquals( 1, metadataResourceIterator.stream().filter( metadata -> "marker".equals( metadata.path().getFileName().toString() ) ).count() );
    }

    private void verifyLogFilesWithCustomPathListing( Path path ) throws IOException
    {
        DatabaseManagementService managementService = new TestDatabaseManagementServiceBuilder( testDirectory.homePath( "customDb" ) )
                .setConfig( GraphDatabaseSettings.transaction_logs_root_path, path )
                .build();
        GraphDatabaseAPI graphDatabase = (GraphDatabaseAPI) managementService.database( DEFAULT_DATABASE_NAME );
        Database database = graphDatabase.getDependencyResolver().resolveDependency( Database.class );
        LogFiles logFiles = graphDatabase.getDependencyResolver().resolveDependency( LogFiles.class );
        assertTrue( database.listStoreFiles( true ).stream()
                .anyMatch( metadata -> metadata.isLogFile() && logFiles.isLogFile( metadata.path() ) ) );
        assertEquals( path.getFileName().toString(), logFiles.logFilesDirectory().getParent().getFileName().toString() );
        managementService.shutdown();
    }

    private static void filesInStoreDirAre( DatabaseLayout databaseLayout, String[] filenames, String[] dirs )
    {
        List<Path> files = new ArrayList<>();
        mockFiles( filenames, files, false );
        mockFiles( dirs, files, true );
        when( databaseLayout.listDatabaseFiles( any() ) ).thenReturn( files.toArray( new Path[0] ) );
    }

    private static ResourceIterator<Path> indexFilesAre( IndexingService indexingService, String[] fileNames )
            throws IOException
    {
        List<Path> files = new ArrayList<>();
        mockFiles( fileNames, files, false );
        ResourceIterator<Path> snapshot = spy( asResourceIterator( files.iterator() ) );
        when( indexingService.snapshotIndexFiles() ).thenReturn( snapshot );
        return snapshot;
    }

    private void createIndexDbFile() throws IOException
    {
        DatabaseLayout databaseLayout = db.databaseLayout();
        final Path indexFile = databaseLayout.file( "index.db" );
        if ( Files.notExists( indexFile ) )
        {
            Files.createFile( indexFile );
        }
    }

    private static void mockFiles( String[] filenames, List<Path> files, boolean isDirectories )
    {
        for ( String filename : filenames )
        {
            File file = mock( File.class );
            Path path = mock( Path.class );

            String[] fileNameParts = filename.split( "/" );
            when( file.getName() ).thenReturn( fileNameParts[fileNameParts.length - 1] );

            when( file.isFile() ).thenReturn( !isDirectories );
            when( file.isDirectory() ).thenReturn( isDirectories );
            when( file.exists() ).thenReturn( true );
            when( file.getPath() ).thenReturn( filename );
            when( path.toFile() ).thenReturn( file );
            files.add( path );
        }
    }

    private static class MarkerFileProvider implements StoreFileProvider
    {
        @Override
        public Resource addFilesTo( Collection<StoreFileMetadata> fileMetadataCollection )
        {
            fileMetadataCollection.add( new StoreFileMetadata( Path.of( "marker" ), 0 ) );
            return Resource.EMPTY;
        }
    }
}
