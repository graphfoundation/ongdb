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
package org.neo4j.kernel.recovery;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import java.io.IOException;
import java.nio.file.Path;

import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Transaction;
import org.neo4j.io.fs.EphemeralFileSystemAbstraction;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.layout.recordstorage.RecordDatabaseLayout;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.storageengine.api.StorageEngineFactory;
import org.neo4j.test.TestDatabaseManagementServiceBuilder;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.Neo4jLayoutExtension;
import org.neo4j.test.extension.pagecache.PageCacheSupportExtension;
import org.neo4j.test.utils.TestDirectory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;
import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_TX_LOGS_ROOT_DIR_NAME;
import static org.neo4j.configuration.GraphDatabaseSettings.transaction_logs_root_path;
import static org.neo4j.memory.EmptyMemoryTracker.INSTANCE;

@Neo4jLayoutExtension
class RecoveryRequiredCheckerTest
{
    @RegisterExtension
    static PageCacheSupportExtension pageCacheExtension = new PageCacheSupportExtension();
    @Inject
    private TestDirectory testDirectory;
    @Inject
    private FileSystemAbstraction fileSystem;
    @Inject
    private RecordDatabaseLayout databaseLayout;

    private Path storeDir;
    private final StorageEngineFactory storageEngineFactory = StorageEngineFactory.defaultStorageEngine();

    @BeforeEach
    void setup()
    {
        storeDir = testDirectory.homePath();
    }

    @Test
    void shouldNotWantToRecoverIntactStore() throws Exception
    {
        startStopAndCreateDefaultData();

        try ( PageCache pageCache = pageCacheExtension.getPageCache( fileSystem ) )
        {
            RecoveryRequiredChecker recoverer = getRecoveryCheckerWithDefaultConfig( fileSystem, pageCache, storageEngineFactory );
            assertThat( recoverer.isRecoveryRequiredAt( databaseLayout, INSTANCE ) ).isEqualTo( false );
        }
    }

    @Test
    void shouldWantToRecoverBrokenStore() throws Exception
    {
        try ( EphemeralFileSystemAbstraction ephemeralFs = createAndCrashWithDefaultConfig();
            PageCache pageCache = pageCacheExtension.getPageCache( ephemeralFs ) )
        {
            RecoveryRequiredChecker recoverer = getRecoveryCheckerWithDefaultConfig( ephemeralFs, pageCache, storageEngineFactory );

            assertThat( recoverer.isRecoveryRequiredAt( databaseLayout, INSTANCE ) ).isEqualTo( true );
        }
    }

    @Test
    void shouldBeAbleToRecoverBrokenStore() throws Exception
    {
        try ( EphemeralFileSystemAbstraction ephemeralFs = createAndCrashWithDefaultConfig();
                PageCache pageCache = pageCacheExtension.getPageCache( ephemeralFs ) )
        {
            RecoveryRequiredChecker recoverer = getRecoveryCheckerWithDefaultConfig( ephemeralFs, pageCache, storageEngineFactory );

            assertThat( recoverer.isRecoveryRequiredAt( databaseLayout, INSTANCE ) ).isEqualTo( true );

            startStopDatabase( ephemeralFs, storeDir );

            assertThat( recoverer.isRecoveryRequiredAt( databaseLayout, INSTANCE ) ).isEqualTo( false );
        }
    }

    @Test
    void shouldBeAbleToRecoverBrokenStoreWithLogsInSeparateAbsoluteLocation() throws Exception
    {
        Path customTransactionLogsLocation = testDirectory.directory( DEFAULT_TX_LOGS_ROOT_DIR_NAME );
        Config config = Config.newBuilder()
                .set( GraphDatabaseSettings.ongdb_home, testDirectory.homePath() )
                .set( transaction_logs_root_path, customTransactionLogsLocation.toAbsolutePath() )
                .build();
        recoverBrokenStoreWithConfig( config );
    }

    @Test
    void shouldNotWantToRecoverEmptyStore() throws Exception
    {
        DatabaseLayout databaseLayout = DatabaseLayout.ofFlat( testDirectory.directory( "dir-without-store" ) );

        try ( PageCache pageCache = pageCacheExtension.getPageCache( fileSystem ) )
        {
            RecoveryRequiredChecker checker = getRecoveryCheckerWithDefaultConfig( fileSystem, pageCache, storageEngineFactory );
            assertFalse( checker.isRecoveryRequiredAt( databaseLayout, INSTANCE ) );
        }
    }

    @Test
    void shouldWantToRecoverStoreWithoutOneIdFile() throws Exception
    {
        startStopAndCreateDefaultData();
        assertAllIdFilesExist();

        try ( PageCache pageCache = pageCacheExtension.getPageCache( fileSystem ) )
        {
            RecoveryRequiredChecker checker;
            checker = getRecoveryCheckerWithDefaultConfig( fileSystem, pageCache, storageEngineFactory );
            assertFalse( checker.isRecoveryRequiredAt( databaseLayout, INSTANCE ) );

            fileSystem.deleteFileOrThrow( databaseLayout.idNodeStore() );

            assertTrue( checker.isRecoveryRequiredAt( databaseLayout, INSTANCE ) );
        }
    }

    @Test
    void shouldWantToRecoverStoreWithoutAllIdFiles() throws Exception
    {
        startStopAndCreateDefaultData();
        assertAllIdFilesExist();

        try ( PageCache pageCache = pageCacheExtension.getPageCache( fileSystem ) )
        {
            RecoveryRequiredChecker checker = getRecoveryCheckerWithDefaultConfig( fileSystem, pageCache, storageEngineFactory );
            assertFalse( checker.isRecoveryRequiredAt( databaseLayout, INSTANCE ) );

            for ( Path idFile : databaseLayout.idFiles() )
            {
                fileSystem.deleteFileOrThrow( idFile );
            }

            assertTrue( checker.isRecoveryRequiredAt( databaseLayout, INSTANCE ) );
        }
    }

    @Test
    void recoveryRequiredWhenAnyStoreFileIsMissing() throws Exception
    {
        startStopAndCreateDefaultData();

        assertStoreFilesExist();

        try ( PageCache pageCache = pageCacheExtension.getPageCache( fileSystem ) )
        {
            RecoveryRequiredChecker checker = getRecoveryCheckerWithDefaultConfig( fileSystem, pageCache, storageEngineFactory );
            assertFalse( checker.isRecoveryRequiredAt( databaseLayout, INSTANCE ) );

            fileSystem.deleteFileOrThrow( databaseLayout.nodeStore() );

            assertTrue( checker.isRecoveryRequiredAt( databaseLayout, INSTANCE ) );
        }
    }

    @Test
    void recoveryRequiredWhenSeveralStoreFileAreMissing() throws Exception
    {
        startStopAndCreateDefaultData();

        assertStoreFilesExist();

        try ( PageCache pageCache = pageCacheExtension.getPageCache( fileSystem ) )
        {
            RecoveryRequiredChecker checker = getRecoveryCheckerWithDefaultConfig( fileSystem, pageCache, storageEngineFactory );
            assertFalse( checker.isRecoveryRequiredAt( databaseLayout, INSTANCE ) );

            fileSystem.deleteFileOrThrow( databaseLayout.relationshipStore() );
            fileSystem.deleteFileOrThrow( databaseLayout.propertyStore() );
            fileSystem.deleteFileOrThrow( databaseLayout.relationshipTypeTokenStore() );

            assertTrue( checker.isRecoveryRequiredAt( databaseLayout, INSTANCE ) );
        }
    }

    @Test
    void recoveryNotRequiredWhenCountStoreIsMissing() throws Exception
    {
        startStopAndCreateDefaultData();

        assertStoreFilesExist();

        try ( PageCache pageCache = pageCacheExtension.getPageCache( fileSystem ) )
        {
            RecoveryRequiredChecker checker = getRecoveryCheckerWithDefaultConfig( fileSystem, pageCache, storageEngineFactory );
            assertFalse( checker.isRecoveryRequiredAt( databaseLayout, INSTANCE ) );

            fileSystem.deleteFileOrThrow( databaseLayout.countStore() );

            assertFalse( checker.isRecoveryRequiredAt( databaseLayout, INSTANCE ) );
        }
    }

    @Test
    void recoveryNotRequiredWhenIndexStatisticStoreIsMissing() throws Exception
    {
        startStopAndCreateDefaultData();

        assertStoreFilesExist();

        try ( PageCache pageCache = pageCacheExtension.getPageCache( fileSystem ) )
        {
            RecoveryRequiredChecker checker = getRecoveryCheckerWithDefaultConfig( fileSystem, pageCache, storageEngineFactory );
            assertFalse( checker.isRecoveryRequiredAt( databaseLayout, INSTANCE ) );

            fileSystem.deleteFileOrThrow( databaseLayout.indexStatisticsStore() );

            assertFalse( checker.isRecoveryRequiredAt( databaseLayout, INSTANCE ) );
        }
    }

    private void recoverBrokenStoreWithConfig( Config config ) throws IOException
    {
        try ( EphemeralFileSystemAbstraction ephemeralFs = createSomeDataAndCrash( storeDir, config );
                PageCache pageCache = pageCacheExtension.getPageCache( ephemeralFs ) )
        {
            RecoveryRequiredChecker recoveryChecker = getRecoveryChecker( ephemeralFs, pageCache, storageEngineFactory, config );

            assertThat( recoveryChecker.isRecoveryRequiredAt( DatabaseLayout.of( config ), INSTANCE ) ).isEqualTo( true );

            DatabaseManagementService managementService = new TestDatabaseManagementServiceBuilder( storeDir )
                        .setFileSystem( ephemeralFs )
                        .setConfig( config )
                    .build();
            managementService.shutdown();

            assertThat( recoveryChecker.isRecoveryRequiredAt( databaseLayout, INSTANCE ) ).isEqualTo( false );
        }
    }

    private EphemeralFileSystemAbstraction createAndCrashWithDefaultConfig() throws IOException
    {
        return createSomeDataAndCrash( storeDir, Config.defaults() );
    }

    private void assertAllIdFilesExist()
    {
        for ( Path idFile : databaseLayout.idFiles() )
        {
            assertTrue( fileSystem.fileExists( idFile ), "ID file " + idFile + " does not exist" );
        }
    }

    private void assertStoreFilesExist()
    {
        for ( Path file : databaseLayout.storeFiles() )
        {
            assertTrue( fileSystem.fileExists( file ), "Store file " + file + " does not exist" );
        }
    }

    private static RecoveryRequiredChecker getRecoveryCheckerWithDefaultConfig( FileSystemAbstraction fileSystem, PageCache pageCache,
            StorageEngineFactory storageEngineFactory )
    {
        return getRecoveryChecker( fileSystem, pageCache, storageEngineFactory, Config.defaults() );
    }

    private static RecoveryRequiredChecker getRecoveryChecker( FileSystemAbstraction fileSystem, PageCache pageCache,
            StorageEngineFactory storageEngineFactory, Config config )
    {
        return new RecoveryRequiredChecker( fileSystem, pageCache, config, storageEngineFactory );
    }

    private static EphemeralFileSystemAbstraction createSomeDataAndCrash( Path store, Config config ) throws IOException
    {
        try ( EphemeralFileSystemAbstraction ephemeralFs = new EphemeralFileSystemAbstraction() )
        {
            DatabaseManagementService managementService = new TestDatabaseManagementServiceBuilder( store )
                        .setFileSystem( ephemeralFs )
                        .setConfig( config )
                    .build();
            final GraphDatabaseService db = managementService.database( DEFAULT_DATABASE_NAME );

            try ( Transaction tx = db.beginTx() )
            {
                tx.createNode();
                tx.commit();
            }

            EphemeralFileSystemAbstraction snapshot = ephemeralFs.snapshot();
            managementService.shutdown();
            return snapshot;
        }
    }

    private static DatabaseManagementService startDatabase( FileSystemAbstraction fileSystem, Path storeDir )
    {
        return new TestDatabaseManagementServiceBuilder( storeDir )
                .setFileSystem( fileSystem )
                .build();
    }

    private static void startStopDatabase( FileSystemAbstraction fileSystem, Path storeDir )
    {
        DatabaseManagementService managementService = startDatabase( fileSystem, storeDir );
        managementService.shutdown();
    }

    private void startStopAndCreateDefaultData()
    {
        DatabaseManagementService managementService = startDatabase( fileSystem, storeDir );
        try
        {
            GraphDatabaseService database = managementService.database( DEFAULT_DATABASE_NAME );
            try ( Transaction transaction = database.beginTx() )
            {
                transaction.createNode();
                transaction.commit();
            }
        }
        finally
        {
            managementService.shutdown();
        }
    }
}
