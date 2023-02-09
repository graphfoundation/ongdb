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
package org.neo4j.kernel.impl.storemigration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.neo4j.collection.Dependencies;
import org.neo4j.common.ProgressReporter;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.internal.batchimport.BatchImporterFactory;
import org.neo4j.internal.batchimport.IndexImporterFactory;
import org.neo4j.internal.id.ScanOnOpenOverwritingIdGeneratorFactory;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.layout.Neo4jLayout;
import org.neo4j.io.layout.recordstorage.RecordDatabaseLayout;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.DefaultPageCacheTracer;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.api.index.IndexProvider;
import org.neo4j.kernel.impl.store.NeoStores;
import org.neo4j.kernel.impl.store.StoreFactory;
import org.neo4j.kernel.impl.store.format.RecordFormats;
import org.neo4j.kernel.impl.store.format.standard.Standard;
import org.neo4j.kernel.impl.store.format.standard.StandardV3_4;
import org.neo4j.kernel.impl.storemigration.StoreUpgrader.UnableToUpgradeException;
import org.neo4j.kernel.impl.transaction.log.LogPosition;
import org.neo4j.kernel.impl.transaction.log.files.LogFiles;
import org.neo4j.kernel.impl.transaction.log.files.LogFilesBuilder;
import org.neo4j.kernel.impl.transaction.log.files.LogTailInformation;
import org.neo4j.logging.AssertableLogProvider;
import org.neo4j.logging.NullLog;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.logging.internal.NullLogService;
import org.neo4j.monitoring.DatabaseHealth;
import org.neo4j.monitoring.Monitors;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.storageengine.api.StorageEngineFactory;
import org.neo4j.storageengine.api.StoreVersionCheck;
import org.neo4j.storageengine.migration.AbstractStoreMigrationParticipant;
import org.neo4j.storageengine.migration.MigrationProgressMonitor;
import org.neo4j.storageengine.migration.SchemaIndexMigrator;
import org.neo4j.storageengine.migration.StoreMigrationParticipant;
import org.neo4j.storageengine.migration.UpgradeNotAllowedException;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.Neo4jLayoutExtension;
import org.neo4j.test.extension.pagecache.PageCacheExtension;
import org.neo4j.test.scheduler.ThreadPoolJobScheduler;
import org.neo4j.test.utils.TestDirectory;

import static java.util.concurrent.TimeUnit.MINUTES;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.neo4j.configuration.GraphDatabaseSettings.default_database;
import static org.neo4j.configuration.GraphDatabaseSettings.ongdb_home;
import static org.neo4j.dbms.database.readonly.DatabaseReadOnlyChecker.writable;
import static org.neo4j.io.pagecache.tracing.PageCacheTracer.NULL;
import static org.neo4j.kernel.impl.storemigration.MigrationTestUtils.verifyFilesHaveSameContent;
import static org.neo4j.logging.LogAssertions.assertThat;
import static org.neo4j.memory.EmptyMemoryTracker.INSTANCE;
import static org.neo4j.monitoring.PanicEventGenerator.NO_OP;
import static org.neo4j.storageengine.migration.MigrationProgressMonitor.SILENT;
import static org.neo4j.storageengine.migration.StoreMigrationParticipant.NOT_PARTICIPATING;

@PageCacheExtension
@Neo4jLayoutExtension
public class StoreUpgraderTest
{
    private static final String INTERNAL_LOG_FILE = "debug.log";

    @Inject
    private TestDirectory testDirectory;
    @Inject
    private Neo4jLayout neo4jLayout;
    @Inject
    private PageCache pageCache;
    @Inject
    private FileSystemAbstraction fileSystem;

    private RecordDatabaseLayout databaseLayout;
    private JobScheduler jobScheduler;

    private final Config allowMigrateConfig = Config.defaults( GraphDatabaseSettings.allow_upgrade, true );
    private Path prepareDatabaseDirectory;

    private static Collection<Arguments> versions()
    {
        return Collections.singletonList( arguments( StandardV3_4.RECORD_FORMATS ) );
    }

    @BeforeEach
    void prepareDb()
    {
        jobScheduler = new ThreadPoolJobScheduler();
    }

    @AfterEach
    void tearDown() throws Exception
    {
        jobScheduler.close();
    }

    private void init( RecordFormats formats ) throws IOException
    {
        String version = formats.storeVersion();
        databaseLayout = RecordDatabaseLayout.of( neo4jLayout, "db-" + version );
        prepareDatabaseDirectory = testDirectory.directory( "prepare_" + version );
        prepareSampleDatabase( version, fileSystem, databaseLayout, prepareDatabaseDirectory );
    }

    @ParameterizedTest
    @MethodSource( "versions" )
    void forbidRegistrationOfParticipantsWithSameName( RecordFormats formats ) throws IOException
    {
        init( formats );
        StoreVersionCheck check = getVersionCheck( pageCache );
        StoreUpgrader upgrader = newUpgrader( check, allowMigrateConfig, pageCache );
        upgrader.addParticipant( new EmptyNamedMigrationParticipant( "foo" ) );
        assertThrows( IllegalStateException.class, () -> upgrader.addParticipant( new EmptyNamedMigrationParticipant( "foo" ) ) );
    }

    @ParameterizedTest
    @MethodSource( "versions" )
    void shouldHaltUpgradeIfUpgradeConfigurationVetoesTheProcess( RecordFormats formats ) throws IOException
    {
        init( formats );
        Config deniedMigrationConfig = Config.newBuilder()
                .set( GraphDatabaseSettings.allow_upgrade, false )
                .set( GraphDatabaseSettings.record_format, Standard.LATEST_NAME )
                .build();
        StoreVersionCheck check = getVersionCheck( pageCache );

        assertThrows( UpgradeNotAllowedException.class, () -> newUpgrader( check, deniedMigrationConfig, pageCache ).migrateIfNeeded( databaseLayout, false ) );
    }

    @ParameterizedTest
    @MethodSource( "versions" )
    void shouldRefuseToUpgradeIfAnyOfTheStoresWereNotShutDownCleanly( RecordFormats formats ) throws IOException
    {
        init( formats );
        Path comparisonDirectory = testDirectory.directory(
            "shouldRefuseToUpgradeIfAnyOfTheStoresWereNotShutDownCleanly-comparison" );
        removeCheckPointFromTxLog( fileSystem, databaseLayout.databaseDirectory() );
        fileSystem.deleteRecursively( comparisonDirectory );
        fileSystem.copyRecursively( databaseLayout.databaseDirectory(), comparisonDirectory );
        StoreVersionCheck check = getVersionCheck( pageCache );

        assertThrows( StoreUpgrader.UnableToUpgradeException.class, () -> newUpgrader( check, pageCache ).migrateIfNeeded( databaseLayout, false ) );
        verifyFilesHaveSameContent( fileSystem, comparisonDirectory, databaseLayout.databaseDirectory() );
    }

    @ParameterizedTest
    @MethodSource( "versions" )
    void shouldRefuseToUpgradeIfAllOfTheStoresWereNotShutDownCleanly( RecordFormats formats ) throws IOException
    {
        init( formats );
        Path comparisonDirectory = testDirectory.directory(
            "shouldRefuseToUpgradeIfAllOfTheStoresWereNotShutDownCleanly-comparison" );
        removeCheckPointFromTxLog( fileSystem, databaseLayout.databaseDirectory() );
        fileSystem.deleteRecursively( comparisonDirectory );
        fileSystem.copyRecursively( databaseLayout.databaseDirectory(), comparisonDirectory );
        StoreVersionCheck check = getVersionCheck( pageCache );

        assertThrows( StoreUpgrader.UnableToUpgradeException.class, () -> newUpgrader( check, pageCache ).migrateIfNeeded( databaseLayout, false ) );
        verifyFilesHaveSameContent( fileSystem, comparisonDirectory, databaseLayout.databaseDirectory() );
    }

    @ParameterizedTest
    @MethodSource( "versions" )
    void shouldContinueMovingFilesIfUpgradeCancelledWhileMoving( RecordFormats formats ) throws Exception
    {
        init( formats );
        StoreVersionCheck check = getVersionCheck( pageCache );

        String versionToMigrateTo = check.configuredVersion();
        StoreVersionCheck.Result upgradeResult = check.checkUpgrade( check.configuredVersion(), CursorContext.NULL );
        assertTrue( upgradeResult.outcome.isSuccessful() );
        String versionToMigrateFrom = upgradeResult.actualVersion;

        // GIVEN
        {
            StoreUpgrader upgrader = newUpgrader( check, allowMigrateConfig, pageCache );
            String failureMessage = "Just failing";
            upgrader.addParticipant( participantThatWillFailWhenMoving( failureMessage ) );

            // WHEN
            var e = assertThrows( UnableToUpgradeException.class, () -> upgrader.migrateIfNeeded( databaseLayout, false ) );
            assertTrue( e.getCause() instanceof IOException );
            assertEquals( failureMessage, e.getCause().getMessage() );
        }

        // AND WHEN
        {
            StoreUpgrader upgrader = newUpgrader( check, pageCache );
            StoreMigrationParticipant observingParticipant = Mockito.mock( StoreMigrationParticipant.class );
            upgrader.addParticipant( observingParticipant );
            upgrader.migrateIfNeeded( databaseLayout, false );

            // THEN
            verify( observingParticipant, Mockito.never() ).migrate( any( DatabaseLayout.class ), any( DatabaseLayout.class ), any( ProgressReporter.class ),
                    eq( versionToMigrateFrom ), eq( versionToMigrateTo ), eq( IndexImporterFactory.EMPTY ) );
            verify( observingParticipant ).
                    moveMigratedFiles( any( DatabaseLayout.class ), any( DatabaseLayout.class ), eq( versionToMigrateFrom ), eq( versionToMigrateTo ) );

            verify( observingParticipant ).cleanup( any( DatabaseLayout.class ) );
        }
    }

    @ParameterizedTest
    @MethodSource( "versions" )
    void upgradedNeoStoreShouldHaveNewUpgradeTimeAndUpgradeId( RecordFormats formats ) throws Exception
    {
        init( formats );

        // Given
        fileSystem.deleteFile( databaseLayout.file( INTERNAL_LOG_FILE ) );
        StoreVersionCheck check = getVersionCheck( pageCache );

        // When
        newUpgrader( check, allowMigrateConfig, pageCache ).migrateIfNeeded( databaseLayout, false );

        // Then
        verifyStoreUpgradedWithin( 1, MINUTES );
    }

    @ParameterizedTest
    @MethodSource( "versions" )
    void tracePageCacheAccessOnStoreUpgrade( RecordFormats formats ) throws IOException
    {
        init( formats );

        fileSystem.deleteFile( databaseLayout.file( INTERNAL_LOG_FILE ) );
        StoreVersionCheck check = getVersionCheck( pageCache );

        var pageCacheTracer = new DefaultPageCacheTracer();
        newUpgrader( check, allowMigrateConfig, pageCache, pageCacheTracer ).migrateIfNeeded( databaseLayout, false );

        assertThat( pageCacheTracer.hits() ).isGreaterThan( 0 );
        assertThat( pageCacheTracer.pins() ).isGreaterThan( 0 );
        assertThat( pageCacheTracer.unpins() ).isGreaterThan( 0 );
        assertThat( pageCacheTracer.faults() ).isGreaterThan( 0 );

        StoreFactory factory = new StoreFactory( databaseLayout, allowMigrateConfig,
                new ScanOnOpenOverwritingIdGeneratorFactory( fileSystem, databaseLayout.getDatabaseName() ), pageCache, fileSystem,
                NullLogProvider.getInstance(), NULL, writable() );
        try ( NeoStores neoStores = factory.openAllNeoStores() )
        {
            assertThat( neoStores.getMetaDataStore().getUpgradeTransaction() ).isEqualTo( neoStores.getMetaDataStore().getLastCommittedTransaction() );
            assertThat( neoStores.getMetaDataStore().getUpgradeTime() ).isPositive();
        }
    }

    @ParameterizedTest
    @MethodSource( "versions" )
    void tracePageCacheAccessOnVersionCheck( RecordFormats formats ) throws IOException
    {
        init( formats );

        fileSystem.deleteFile( databaseLayout.file( INTERNAL_LOG_FILE ) );
        var pageCacheTracer = new DefaultPageCacheTracer();
        new RecordStoreVersionCheck( fileSystem, pageCache, databaseLayout, NullLogProvider.getInstance(), Config.defaults(), pageCacheTracer );

        assertThat( pageCacheTracer.hits() ).isEqualTo( 0 );
        assertThat( pageCacheTracer.pins() ).isEqualTo( 1 );
        assertThat( pageCacheTracer.unpins() ).isEqualTo( 1 );
        assertThat( pageCacheTracer.faults() ).isEqualTo( 1 );
    }

    @ParameterizedTest
    @MethodSource( "versions" )
    void upgradeShouldNotLeaveLeftoverAndMigrationDirs( RecordFormats formats ) throws Exception
    {
        init( formats );

        // Given
        fileSystem.deleteFile( databaseLayout.file( INTERNAL_LOG_FILE ) );
        StoreVersionCheck check = getVersionCheck( pageCache );

        // When
        newUpgrader( check, allowMigrateConfig, pageCache ).migrateIfNeeded( databaseLayout, false );

        // Then
        assertThat( migrationHelperDirs() ).isEmpty();
    }

    @ParameterizedTest
    @MethodSource( "versions" )
    void upgradeShouldGiveProgressMonitorProgressMessages( RecordFormats formats ) throws Exception
    {
        init( formats );

        // Given
        StoreVersionCheck check = getVersionCheck( pageCache );

        // When
        AssertableLogProvider logProvider = new AssertableLogProvider();
        newUpgrader( check, pageCache, allowMigrateConfig,
            new VisibleMigrationProgressMonitor( logProvider.getLog( "test" ) ) ).migrateIfNeeded( databaseLayout, false );

        // Then
        assertThat( logProvider ).containsMessages( "Store files", "Indexes", "Successfully finished" );
    }

    @ParameterizedTest
    @MethodSource( "versions" )
    void upgraderShouldCleanupLegacyLeftoverAndMigrationDirs( RecordFormats formats ) throws Exception
    {
        init( formats );

        // Given
        fileSystem.deleteFile( databaseLayout.file( INTERNAL_LOG_FILE ) );
        fileSystem.mkdir( databaseLayout.file( StoreUpgrader.MIGRATION_DIRECTORY ) );
        fileSystem.mkdir( databaseLayout.file( StoreUpgrader.MIGRATION_LEFT_OVERS_DIRECTORY ) );
        fileSystem.mkdir( databaseLayout.file( StoreUpgrader.MIGRATION_LEFT_OVERS_DIRECTORY + "_1" ) );
        fileSystem.mkdir( databaseLayout.file( StoreUpgrader.MIGRATION_LEFT_OVERS_DIRECTORY + "_2" ) );
        fileSystem.mkdir( databaseLayout.file( StoreUpgrader.MIGRATION_LEFT_OVERS_DIRECTORY + "_42" ) );

        // When
        StoreVersionCheck check = getVersionCheck( pageCache );
        StoreUpgrader storeUpgrader = newUpgrader( check, pageCache );
        storeUpgrader.migrateIfNeeded( databaseLayout, false );

        // Then
        assertThat( migrationHelperDirs() ).isEmpty();
    }

    @ParameterizedTest
    @MethodSource( "versions" )
    void upgradeFailsIfMigrationIsNotAllowed( RecordFormats formats ) throws IOException
    {
        init( formats );

        StoreVersionCheck check = getVersionCheck( pageCache );

        AssertableLogProvider logProvider = new AssertableLogProvider();
        assertThrows( UpgradeNotAllowedException.class, () -> newUpgrader( check, pageCache, Config.defaults(),
            new VisibleMigrationProgressMonitor( logProvider.getLog( "test" ) ) ).migrateIfNeeded( databaseLayout, false ) );
    }

    @ParameterizedTest
    @MethodSource( "versions" )
    void upgradeMoveTransactionLogs( RecordFormats formats ) throws IOException
    {
        init( formats );

        Path txRoot = testDirectory.directory( "customTxRoot" );
        AssertableLogProvider logProvider = new AssertableLogProvider();
        StoreVersionCheck check = getVersionCheck( pageCache );

        Config config = Config.newBuilder().fromConfig( allowMigrateConfig )
                .set( ongdb_home, testDirectory.homePath() )
                .set( GraphDatabaseSettings.transaction_logs_root_path, txRoot.toAbsolutePath() )
                .set( default_database, databaseLayout.getDatabaseName() )
                .build();
        DatabaseLayout migrationLayout = DatabaseLayout.of( config );

        newUpgrader( check, pageCache, config, new VisibleMigrationProgressMonitor( logProvider.getLog( "test" ) ) )
            .migrateIfNeeded( migrationLayout, false );

        assertThat( logProvider ).containsMessages( "Starting transaction logs migration.", "Transaction logs migration completed." );
        assertThat( getLogFiles( migrationLayout.databaseDirectory() ) ).isEmpty();
        Path databaseTransactionLogsHome = txRoot.resolve( migrationLayout.getDatabaseName() );
        assertTrue( fileSystem.fileExists( databaseTransactionLogsHome ) );

        Set<String> logFileNames = getLogFileNames( databaseTransactionLogsHome );
        assertThat( logFileNames ).isNotEmpty();
        assertThat( logFileNames ).containsAll( getLogFileNames( prepareDatabaseDirectory ) );
    }

    @ParameterizedTest
    @MethodSource( "versions" )
    void failToMoveTransactionLogsIfTheyAlreadyExist( RecordFormats formats ) throws IOException
    {
        init( formats );

        Path txRoot = testDirectory.directory( "customTxRoot" );
        AssertableLogProvider logProvider = new AssertableLogProvider();
        StoreVersionCheck check = getVersionCheck( pageCache );

        Config config = Config.newBuilder().fromConfig( allowMigrateConfig )
                .set( ongdb_home, testDirectory.homePath() )
                .set( GraphDatabaseSettings.transaction_logs_root_path, txRoot.toAbsolutePath() )
                .set( default_database, databaseLayout.getDatabaseName() )
                .build();
        DatabaseLayout migrationLayout = DatabaseLayout.of( config );

        Path databaseTransactionLogsHome = txRoot.resolve( migrationLayout.getDatabaseName() );
        fileSystem.mkdir( databaseTransactionLogsHome );
        createDummyTxLogFiles( databaseTransactionLogsHome );

        assertThrows( StoreUpgrader.TransactionLogsRelocationException.class, () ->
                newUpgrader( check, pageCache, config, new VisibleMigrationProgressMonitor( logProvider.getLog( "test" ) ) )
                .migrateIfNeeded( migrationLayout, false ) );
    }

    @ParameterizedTest
    @MethodSource( "versions" )
    void notParticipatingParticipantsAreNotPartOfMigration( RecordFormats formats ) throws IOException
    {
        init( formats );

        StoreVersionCheck check = getVersionCheck( pageCache );
        StoreUpgrader storeUpgrader = newUpgrader( check, pageCache );
        assertThat( storeUpgrader.getParticipants() ).hasSize( 2 );
    }

    private void createDummyTxLogFiles( Path databaseTransactionLogsHome ) throws IOException
    {
        Set<String> preparedLogFiles = getLogFileNames( prepareDatabaseDirectory );
        assertThat( preparedLogFiles ).isNotEmpty();
        for ( String preparedLogFile : preparedLogFiles )
        {
            fileSystem.write( databaseTransactionLogsHome.resolve( preparedLogFile ) ).close();
        }
    }

    private Path[] getLogFiles( Path directory ) throws IOException
    {
        return LogFilesBuilder.logFilesBasedOnlyBuilder( directory, fileSystem )
                .build()
                .logFiles();
    }

    private Set<String> getLogFileNames( Path directory ) throws IOException
    {
        return Arrays.stream( LogFilesBuilder.logFilesBasedOnlyBuilder( directory, fileSystem )
                     .build()
                     .logFiles() )
                         .map( Path::getFileName )
                         .map( Path::toString )
                         .collect( Collectors.toSet() );
    }

    protected void prepareSampleDatabase( String version, FileSystemAbstraction fileSystem, DatabaseLayout databaseLayout,
            Path databaseDirectory ) throws IOException
    {
        MigrationTestUtils.prepareSampleLegacyDatabase( version, fileSystem, databaseLayout.databaseDirectory(), databaseDirectory );
    }

    private StoreVersionCheck getVersionCheck( PageCache pageCache )
    {
        return getVersionCheck( pageCache, NULL );
    }

    private StoreVersionCheck getVersionCheck( PageCache pageCache, PageCacheTracer cacheTracer )
    {
        return new RecordStoreVersionCheck( fileSystem, pageCache, databaseLayout, NullLogProvider.getInstance(), getTuningConfig(), cacheTracer );
    }

    private static StoreMigrationParticipant participantThatWillFailWhenMoving( final String failureMessage )
    {
        return new AbstractStoreMigrationParticipant( "Failing" )
        {
            @Override
            public void migrate( DatabaseLayout directoryLayout, DatabaseLayout migrationLayout, ProgressReporter progress, String versionToMigrateFrom,
                String versionToMigrateTo, IndexImporterFactory indexImporterFactory )
            {
                // nop
            }

            @Override
            public void moveMigratedFiles( DatabaseLayout migrationLayout, DatabaseLayout directoryLayout, String versionToUpgradeFrom,
                    String versionToMigrateTo ) throws IOException
            {
                throw new IOException( failureMessage );
            }

            @Override
            public void cleanup( DatabaseLayout migrationLayout )
            {
                // nop
            }
        };
    }

    private StoreUpgrader newUpgrader( StoreVersionCheck storeVersionCheck, Config config, PageCache pageCache,
            PageCacheTracer pageCacheTracer )
    {
        return newUpgrader( storeVersionCheck, pageCache, config, pageCacheTracer );
    }

    private StoreUpgrader newUpgrader( StoreVersionCheck storeVersionCheck, Config config, PageCache pageCache )
    {
        return newUpgrader( storeVersionCheck, pageCache, config, NULL );
    }

    private StoreUpgrader newUpgrader( StoreVersionCheck storeVersionCheck, PageCache pageCache )
    {
        return newUpgrader( storeVersionCheck, pageCache, allowMigrateConfig, NULL );
    }

    private StoreUpgrader newUpgrader( StoreVersionCheck storeVersionCheck, PageCache pageCache, Config config,
            PageCacheTracer pageCacheTracer )
    {
        return newUpgrader( storeVersionCheck, pageCache, config, SILENT, pageCacheTracer );
    }

    private StoreUpgrader newUpgrader( StoreVersionCheck storeVersionCheck, PageCache pageCache, Config config, MigrationProgressMonitor progressMonitor )
    {
        return newUpgrader( storeVersionCheck, pageCache, config, progressMonitor, NULL );
    }

    private StoreUpgrader newUpgrader( StoreVersionCheck storeVersionCheck, PageCache pageCache, Config config,
            MigrationProgressMonitor progressMonitor, PageCacheTracer pageCacheTracer )
    {
        NullLogService instance = NullLogService.getInstance();
        BatchImporterFactory batchImporterFactory = BatchImporterFactory.withHighestPriority();
        RecordStorageMigrator defaultMigrator = new RecordStorageMigrator( fileSystem, pageCache, getTuningConfig(), instance, jobScheduler, pageCacheTracer,
                batchImporterFactory, INSTANCE );
        StorageEngineFactory storageEngineFactory = StorageEngineFactory.defaultStorageEngine();
        SchemaIndexMigrator indexMigrator =
                new SchemaIndexMigrator( "Indexes", fileSystem, pageCache, IndexProvider.EMPTY.directoryStructure(), storageEngineFactory, true );

        LegacyTransactionLogsLocator logsLocator = new LegacyTransactionLogsLocator( config, databaseLayout );
        DatabaseHealth databaseHealth = new DatabaseHealth( NO_OP, NullLog.getInstance() );
        Dependencies dependencies = new Dependencies();
        dependencies.satisfyDependencies( new Monitors() );
        var logsUpgrader = new LogsUpgrader( fileSystem, storageEngineFactory, databaseLayout, pageCache,
                                             logsLocator, config, dependencies, pageCacheTracer, INSTANCE, databaseHealth );
        StoreUpgrader upgrader =
                new StoreUpgrader( storageEngineFactory, storeVersionCheck, progressMonitor, config, fileSystem, NullLogProvider.getInstance(), logsUpgrader,
                        pageCacheTracer );
        upgrader.addParticipant( indexMigrator );
        upgrader.addParticipant( NOT_PARTICIPATING );
        upgrader.addParticipant( NOT_PARTICIPATING );
        upgrader.addParticipant( NOT_PARTICIPATING );
        upgrader.addParticipant( NOT_PARTICIPATING );
        upgrader.addParticipant( defaultMigrator );
        return upgrader;
    }

    private List<Path> migrationHelperDirs()
    {
        Path[] tmpDirs = databaseLayout.listDatabaseFiles( file -> Files.isDirectory( file ) &&
                (file.getFileName().toString().equals( StoreUpgrader.MIGRATION_DIRECTORY ) ||
                        file.getFileName().toString().startsWith( StoreUpgrader.MIGRATION_LEFT_OVERS_DIRECTORY )) );
        assertNotNull( tmpDirs, "Some IO errors occurred" );
        return Arrays.asList( tmpDirs );
    }

    private Config getTuningConfig()
    {
        return Config.defaults( GraphDatabaseSettings.record_format, getRecordFormatsName() );
    }

    protected String getRecordFormatsName()
    {
        return Standard.LATEST_NAME;
    }

    public static void removeCheckPointFromTxLog( FileSystemAbstraction fileSystem, Path databaseDirectory ) throws IOException
    {
        LogFiles logFiles = LogFilesBuilder.logFilesBasedOnlyBuilder( databaseDirectory, fileSystem )
                .withStorageEngineFactory( StorageEngineFactory.defaultStorageEngine() )
                .build();
        LogTailInformation logTailInformation = logFiles.getTailInformation();

        if ( logTailInformation.commitsAfterLastCheckpoint() )
        {
            // done already
            return;
        }

        // let's assume there is at least a checkpoint
        assertNotNull( logTailInformation.lastCheckPoint );

        LogPosition logPosition = logTailInformation.lastCheckPoint.getTransactionLogPosition();
        Path logFile = logFiles.getLogFile().getLogFileForVersion( logPosition.getLogVersion() );
        long byteOffset = logPosition.getByteOffset();
        fileSystem.truncate( logFile, byteOffset );
    }

    private void verifyStoreUpgradedWithin( long duration, TimeUnit unit )
    {
        StoreFactory factory = new StoreFactory( databaseLayout, allowMigrateConfig,
                new ScanOnOpenOverwritingIdGeneratorFactory( fileSystem, databaseLayout.getDatabaseName() ), pageCache, fileSystem,
                NullLogProvider.getInstance(), NULL, writable() );
        try ( NeoStores neoStores = factory.openAllNeoStores() )
        {
            assertThat( neoStores.getMetaDataStore().getUpgradeTransaction() ).isEqualTo( neoStores.getMetaDataStore().getLastCommittedTransaction() );
            assertThat( neoStores.getMetaDataStore().getUpgradeTime() ).isPositive();

            long minuteAgo = System.currentTimeMillis() - unit.toMillis( duration );
            assertThat( neoStores.getMetaDataStore().getUpgradeTime() ).isGreaterThan( minuteAgo );
        }
    }

    private static class EmptyNamedMigrationParticipant extends AbstractStoreMigrationParticipant
    {
        protected EmptyNamedMigrationParticipant( String name )
        {
            super( name );
        }

        @Override
        public void migrate( DatabaseLayout directoryLayout, DatabaseLayout migrationLayout, ProgressReporter progress, String versionToMigrateFrom,
                             String versionToMigrateTo, IndexImporterFactory indexImporterFactory )
        {
            // empty
        }

        @Override
        public void moveMigratedFiles( DatabaseLayout migrationLayout, DatabaseLayout directoryLayout, String versionToMigrateFrom,
                String versionToMigrateTo )
        {
            // empty
        }

        @Override
        public void cleanup( DatabaseLayout migrationLayout )
        {
            // empty
        }
    }
}
