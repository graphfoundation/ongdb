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
package org.neo4j.kernel.impl.storemigration;

import org.eclipse.collections.api.iterator.MutableLongIterator;
import org.eclipse.collections.api.set.primitive.MutableLongSet;
import org.eclipse.collections.impl.set.mutable.primitive.LongHashSet;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.SplittableRandom;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.neo4j.common.ProgressReporter;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.internal.batchimport.BatchImporterFactory;
import org.neo4j.internal.counts.GBPTreeGenericCountsStore;
import org.neo4j.internal.counts.GBPTreeRelationshipGroupDegreesStore;
import org.neo4j.internal.counts.RelationshipGroupDegreesStore;
import org.neo4j.internal.helpers.collection.Iterables;
import org.neo4j.internal.helpers.collection.Pair;
import org.neo4j.internal.id.DefaultIdGeneratorFactory;
import org.neo4j.internal.id.IdGeneratorFactory;
import org.neo4j.internal.id.ScanOnOpenOverwritingIdGeneratorFactory;
import org.neo4j.internal.id.SchemaIdType;
import org.neo4j.internal.recordstorage.RandomSchema;
import org.neo4j.internal.recordstorage.RecordStorageEngineFactory;
import org.neo4j.internal.recordstorage.SchemaStorage;
import org.neo4j.internal.recordstorage.StoreTokens;
import org.neo4j.internal.schema.ConstraintDescriptor;
import org.neo4j.internal.schema.SchemaRule;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.layout.Neo4jLayout;
import org.neo4j.io.layout.recordstorage.RecordDatabaseLayout;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.PageCursor;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.KernelVersion;
import org.neo4j.kernel.impl.store.DynamicRecordAllocator;
import org.neo4j.kernel.impl.store.DynamicStringStore;
import org.neo4j.kernel.impl.store.MetaDataStore;
import org.neo4j.kernel.impl.store.NeoStores;
import org.neo4j.kernel.impl.store.SchemaStore;
import org.neo4j.kernel.impl.store.StoreFactory;
import org.neo4j.kernel.impl.store.StoreType;
import org.neo4j.kernel.impl.store.TokenStore;
import org.neo4j.kernel.impl.store.allocator.ReusableRecordsCompositeAllocator;
import org.neo4j.kernel.impl.store.cursor.CachedStoreCursors;
import org.neo4j.kernel.impl.store.format.RecordFormats;
import org.neo4j.kernel.impl.store.format.standard.Standard;
import org.neo4j.kernel.impl.store.format.standard.StandardV3_4;
import org.neo4j.kernel.impl.store.record.DynamicRecord;
import org.neo4j.kernel.impl.store.record.TokenRecord;
import org.neo4j.kernel.impl.storemigration.legacy.SchemaRuleSerialization35;
import org.neo4j.kernel.impl.storemigration.legacy.SchemaStore35;
import org.neo4j.kernel.impl.transaction.log.LogPosition;
import org.neo4j.logging.AssertableLogProvider;
import org.neo4j.logging.LogProvider;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.logging.internal.LogService;
import org.neo4j.logging.internal.NullLogService;
import org.neo4j.logging.internal.SimpleLogService;
import org.neo4j.memory.MemoryTracker;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.storageengine.api.StoreVersionCheck;
import org.neo4j.storageengine.api.TransactionId;
import org.neo4j.storageengine.api.cursor.StoreCursors;
import org.neo4j.storageengine.migration.MigrationProgressMonitor;
import org.neo4j.test.RandomSupport;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.Neo4jLayoutExtension;
import org.neo4j.test.extension.RandomExtension;
import org.neo4j.test.extension.pagecache.PageCacheExtension;
import org.neo4j.test.scheduler.ThreadPoolJobScheduler;
import org.neo4j.test.utils.TestDirectory;
import org.neo4j.token.TokenHolders;

import static java.util.Collections.singleton;
import static org.eclipse.collections.api.factory.Sets.immutable;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.configuration.GraphDatabaseInternalSettings.counts_store_max_cached_entries;
import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;
import static org.neo4j.dbms.database.readonly.DatabaseReadOnlyChecker.writable;
import static org.neo4j.index.internal.gbptree.RecoveryCleanupWorkCollector.immediate;
import static org.neo4j.internal.batchimport.IndexImporterFactory.EMPTY;
import static org.neo4j.io.pagecache.context.CursorContext.NULL;
import static org.neo4j.kernel.impl.store.AbstractDynamicStore.allocateRecordsFromBytes;
import static org.neo4j.kernel.impl.store.MetaDataStore.Position.CHECKPOINT_LOG_VERSION;
import static org.neo4j.kernel.impl.store.record.RecordLoad.CHECK;
import static org.neo4j.logging.AssertableLogProvider.Level.ERROR;
import static org.neo4j.logging.LogAssertions.assertThat;
import static org.neo4j.memory.EmptyMemoryTracker.INSTANCE;
import static org.neo4j.storageengine.migration.MigrationProgressMonitor.SILENT;

@PageCacheExtension
@Neo4jLayoutExtension
@ExtendWith( RandomExtension.class )
@Disabled
class RecordStorageMigratorIT
{
    private static final String MIGRATION_DIRECTORY = "upgrade";
    private static final Config CONFIG = Config.defaults( GraphDatabaseSettings.pagecache_memory, "8m" );
    private static final int MAX_PROPERTY_KEY_ID = 500;
    private static final int MAX_RELATIONSHIP_TYPE_ID = 100;
    private static final int MAX_LABEL_ID = 100;
    private static final long TX_ID = 42;

    @Inject
    private TestDirectory testDirectory;
    @Inject
    private PageCache pageCache;
    @Inject
    private RecordDatabaseLayout databaseLayout;
    @Inject
    private RandomSupport randomRule;

    private DatabaseLayout migrationLayout;
    private BatchImporterFactory batchImporterFactory;

    private final MigrationProgressMonitor progressMonitor = SILENT;
    private final JobScheduler jobScheduler = new ThreadPoolJobScheduler();

    private static Stream<Arguments> versions()
    {
        return Stream.of(
            Arguments.of(
                StandardV3_4.STORE_VERSION,
                new LogPosition( 3, 385 ),
                txInfoAcceptanceOnIdAndTimestamp( TX_ID, 1548441268467L ) ) );
    }

    @BeforeEach
    void setup() throws IOException
    {
        migrationLayout = Neo4jLayout.of( testDirectory.homePath( MIGRATION_DIRECTORY ) ).databaseLayout( DEFAULT_DATABASE_NAME );
        batchImporterFactory = BatchImporterFactory.withHighestPriority();
        testDirectory.getFileSystem().mkdirs( migrationLayout.databaseDirectory() );
    }

    @AfterEach
    void tearDown() throws Exception
    {
        jobScheduler.close();
    }

    @ParameterizedTest
    @MethodSource( "versions" )
    void shouldBeAbleToResumeMigrationOnMoving( String version, LogPosition expectedLogPosition, Function<TransactionId, Boolean> txIdComparator )
        throws Exception
    {
        // GIVEN a legacy database
        Path prepare = testDirectory.directory( "prepare" );
        var fs = testDirectory.getFileSystem();
        MigrationTestUtils.prepareSampleLegacyDatabase( version, fs, databaseLayout.databaseDirectory(), prepare );
        // and a state of the migration saying that it has done the actual migration
        LogService logService = NullLogService.getInstance();
        RecordStoreVersionCheck check = getVersionCheck( pageCache, databaseLayout );

        String versionToMigrateFrom = getVersionToMigrateFrom( check );
        MigrationProgressMonitor progressMonitor = SILENT;
        RecordStorageMigrator migrator = new RecordStorageMigrator( fs, pageCache, CONFIG, logService, jobScheduler, PageCacheTracer.NULL,
                batchImporterFactory, INSTANCE );
        migrator.migrate(
                databaseLayout, migrationLayout, progressMonitor.startSection( "section" ), versionToMigrateFrom, getVersionToMigrateTo( check ),
                EMPTY );

        // WHEN simulating resuming the migration
        migrator = new RecordStorageMigrator( fs, pageCache, CONFIG, logService, jobScheduler, PageCacheTracer.NULL, batchImporterFactory, INSTANCE );
        migrator.moveMigratedFiles( migrationLayout, databaseLayout, versionToMigrateFrom, getVersionToMigrateTo( check ) );

        // THEN starting the new store should be successful
        StoreFactory storeFactory = new StoreFactory( databaseLayout, CONFIG,
                new ScanOnOpenOverwritingIdGeneratorFactory( fs, databaseLayout.getDatabaseName() ), pageCache, fs, logService.getInternalLogProvider(),
                PageCacheTracer.NULL, writable() );
        storeFactory.openAllNeoStores().close();
    }

    @ParameterizedTest
    @MethodSource( "versions" )
    void shouldBeAbleToMigrateWithoutErrors( String version, LogPosition expectedLogPosition, Function<TransactionId, Boolean> txIdComparator ) throws Exception
    {
        // GIVEN a legacy database

        Path prepare = testDirectory.directory( "prepare" );
        var fs = testDirectory.getFileSystem();
        MigrationTestUtils.prepareSampleLegacyDatabase( version, fs, databaseLayout.databaseDirectory(), prepare );

        AssertableLogProvider logProvider = new AssertableLogProvider( true );
        LogService logService = new SimpleLogService( logProvider, logProvider );

        RecordStoreVersionCheck check = getVersionCheck( pageCache, databaseLayout );

        String versionToMigrateFrom = getVersionToMigrateFrom( check );
        RecordStorageMigrator migrator = new RecordStorageMigrator( fs, pageCache, CONFIG, logService, jobScheduler, PageCacheTracer.NULL,
                batchImporterFactory, INSTANCE );

        // WHEN migrating
        migrator.migrate(
                databaseLayout, migrationLayout, progressMonitor.startSection( "section" ), versionToMigrateFrom, getVersionToMigrateTo( check ),
                EMPTY );
        migrator.moveMigratedFiles( migrationLayout, databaseLayout, versionToMigrateFrom, getVersionToMigrateTo( check ) );

        // THEN starting the new store should be successful
        assertThat( testDirectory.getFileSystem().fileExists( databaseLayout.relationshipGroupDegreesStore() ) ).isTrue();
        GBPTreeRelationshipGroupDegreesStore.DegreesRebuilder noRebuildAssertion = new GBPTreeRelationshipGroupDegreesStore.DegreesRebuilder()
        {
            @Override
            public void rebuild( RelationshipGroupDegreesStore.Updater updater, CursorContext cursorContext, MemoryTracker memoryTracker )
            {
                throw new IllegalStateException( "Rebuild should not be required" );
            }

            @Override
            public long lastCommittedTxId()
            {
                try
                {
                    return new RecordStorageEngineFactory().readOnlyTransactionIdStore( fs, databaseLayout, pageCache, NULL ).getLastCommittedTransactionId();
                }
                catch ( IOException e )
                {
                    throw new UncheckedIOException( e );
                }
            }
        };
        try ( GBPTreeRelationshipGroupDegreesStore groupDegreesStore = new GBPTreeRelationshipGroupDegreesStore( pageCache,
                databaseLayout.relationshipGroupDegreesStore(), testDirectory.getFileSystem(), immediate(), noRebuildAssertion, writable(),
                PageCacheTracer.NULL, GBPTreeGenericCountsStore.NO_MONITOR, databaseLayout.getDatabaseName(), counts_store_max_cached_entries.defaultValue(),
                NullLogProvider.getInstance() ) )
        {
            // The rebuild would happen here in start and will throw exception (above) if invoked
            groupDegreesStore.start( NULL, StoreCursors.NULL, INSTANCE );

            // The store keeps track of committed transactions.
            // It is essential that it starts with the transaction
            // that is the last committed one at the upgrade time.
            assertEquals( TX_ID, groupDegreesStore.txId() );
        }

        StoreFactory storeFactory = new StoreFactory(
                databaseLayout, CONFIG, new ScanOnOpenOverwritingIdGeneratorFactory( fs, databaseLayout.getDatabaseName() ), pageCache, fs,
                logService.getInternalLogProvider(), PageCacheTracer.NULL, writable() );
        storeFactory.openAllNeoStores().close();
        assertThat( logProvider ).forLevel( ERROR ).doesNotHaveAnyLogs();
    }

    @ParameterizedTest
    @MethodSource( "versions" )
    void shouldBeAbleToResumeMigrationOnRebuildingCounts( String version, LogPosition expectedLogPosition, Function<TransactionId, Boolean> txIdComparator )
        throws Exception
    {
        // GIVEN a legacy database

        Path prepare = testDirectory.directory( "prepare" );
        var fs = testDirectory.getFileSystem();
        MigrationTestUtils.prepareSampleLegacyDatabase( version, fs, databaseLayout.databaseDirectory(), prepare );
        // and a state of the migration saying that it has done the actual migration
        LogService logService = NullLogService.getInstance();
        RecordStoreVersionCheck check = getVersionCheck( pageCache, databaseLayout );

        String versionToMigrateFrom = getVersionToMigrateFrom( check );
        MigrationProgressMonitor progressMonitor = SILENT;
        RecordStorageMigrator migrator = new RecordStorageMigrator( fs, pageCache, CONFIG, logService, jobScheduler, PageCacheTracer.NULL,
                batchImporterFactory, INSTANCE );
        migrator.migrate( databaseLayout, migrationLayout, progressMonitor.startSection( "section" ),
                versionToMigrateFrom, getVersionToMigrateTo( check ), EMPTY );

        // WHEN simulating resuming the migration

        migrator.moveMigratedFiles( migrationLayout, databaseLayout, versionToMigrateFrom, getVersionToMigrateTo( check ) );

        // THEN starting the new store should be successful
        StoreFactory storeFactory =
                new StoreFactory( databaseLayout, CONFIG, new ScanOnOpenOverwritingIdGeneratorFactory( fs, databaseLayout.getDatabaseName() ), pageCache, fs,
                        logService.getInternalLogProvider(), PageCacheTracer.NULL, writable() );
        storeFactory.openAllNeoStores().close();
    }

    @ParameterizedTest
    @MethodSource( "versions" )
    void shouldComputeTheLastTxLogPositionCorrectly( String version, LogPosition expectedLogPosition, Function<TransactionId, Boolean> txIdComparator )
        throws Throwable
    {
        // GIVEN a legacy database

        Path prepare = testDirectory.directory( "prepare" );
        var fs = testDirectory.getFileSystem();
        MigrationTestUtils.prepareSampleLegacyDatabase( version, fs, databaseLayout.databaseDirectory(), prepare );
        // and a state of the migration saying that it has done the actual migration
        LogService logService = NullLogService.getInstance();
        RecordStoreVersionCheck check = getVersionCheck( pageCache, databaseLayout );

        String versionToMigrateFrom = getVersionToMigrateFrom( check );
        MigrationProgressMonitor progressMonitor = SILENT;
        RecordStorageMigrator migrator = new RecordStorageMigrator( fs, pageCache, CONFIG, logService, jobScheduler, PageCacheTracer.NULL,
                batchImporterFactory, INSTANCE );

        // WHEN migrating
        migrator.migrate(
                databaseLayout, migrationLayout, progressMonitor.startSection( "section" ), versionToMigrateFrom, getVersionToMigrateTo( check ),
                EMPTY );

        // THEN it should compute the correct last tx log position
        assertEquals( expectedLogPosition, migrator.readLastTxLogPosition( migrationLayout ) );
    }

    @ParameterizedTest
    @MethodSource( "versions" )
    void shouldComputeTheLastTxInfoCorrectly( String version, LogPosition expectedLogPosition, Function<TransactionId, Boolean> txIdComparator )
        throws Exception
    {
        // given

        Path prepare = testDirectory.directory( "prepare" );
        var fs = testDirectory.getFileSystem();
        MigrationTestUtils.prepareSampleLegacyDatabase( version, fs, databaseLayout.databaseDirectory(), prepare );
        // and a state of the migration saying that it has done the actual migration
        LogService logService = NullLogService.getInstance();
        RecordStoreVersionCheck check = getVersionCheck( pageCache, databaseLayout );

        String versionToMigrateFrom = getVersionToMigrateFrom( check );
        MigrationProgressMonitor progressMonitor = SILENT;
        RecordStorageMigrator migrator = new RecordStorageMigrator( fs, pageCache, CONFIG, logService, jobScheduler, PageCacheTracer.NULL,
                batchImporterFactory, INSTANCE );

        // when
        migrator.migrate(
                databaseLayout, migrationLayout, progressMonitor.startSection( "section" ), versionToMigrateFrom, getVersionToMigrateTo( check ),
                EMPTY );

        // then
        assertTrue( txIdComparator.apply( migrator.readLastTxInformation( migrationLayout ) ) );
    }

    @ParameterizedTest
    @MethodSource( "versions" )
    void mustMigrateSchemaStoreToNewFormat( String version, LogPosition expectedLogPosition, Function<TransactionId, Boolean> txIdComparator ) throws Exception
    {
        // Given we have an old store full of random schema rules.

        Path prepare = testDirectory.directory( "prepare" );
        var fs = testDirectory.getFileSystem();
        MigrationTestUtils.prepareSampleLegacyDatabase( version, fs, databaseLayout.databaseDirectory(), prepare );
        // and a state of the migration saying that it has done the actual migration
        LogService logService = NullLogService.getInstance();

        // Uses this special scan-on-open IGF because when the new IndexedIdGenerator was introduced this test would break
        // when trying to open an older store, before doing migration.
        IdGeneratorFactory igf = new ScanOnOpenOverwritingIdGeneratorFactory( fs, databaseLayout.getDatabaseName() );
        LogProvider logProvider = logService.getInternalLogProvider();

        // Prepare all the tokens we'll need.
        StoreFactory legacyStoreFactory = new StoreFactory( databaseLayout, CONFIG, igf, pageCache, fs, StandardV3_4.RECORD_FORMATS, logProvider,
                PageCacheTracer.NULL, writable(),
                immutable.empty() );
        NeoStores stores = legacyStoreFactory.openNeoStores( false,
                StoreType.LABEL_TOKEN, StoreType.LABEL_TOKEN_NAME,
                StoreType.RELATIONSHIP_TYPE_TOKEN, StoreType.RELATIONSHIP_TYPE_TOKEN_NAME,
                StoreType.PROPERTY_KEY_TOKEN, StoreType.PROPERTY_KEY_TOKEN_NAME );
        createTokens( stores.getLabelTokenStore(), MAX_LABEL_ID );
        createTokens( stores.getRelationshipTypeTokenStore(), MAX_RELATIONSHIP_TYPE_ID );
        createTokens( stores.getPropertyKeyTokenStore(), MAX_PROPERTY_KEY_ID );
        stores.close();

        // Prepare the legacy schema store we'll migrate.
        Path storeFile = databaseLayout.schemaStore();
        Path idFile = databaseLayout.idSchemaStore();
        SchemaStore35 schemaStore35 = new SchemaStore35( storeFile, idFile, CONFIG, SchemaIdType.SCHEMA, igf, pageCache, logProvider,
                StandardV3_4.RECORD_FORMATS, writable(), DEFAULT_DATABASE_NAME, immutable.empty() );
        schemaStore35.initialise( false, NULL );
        SplittableRandom rng = new SplittableRandom( randomRule.seed() );
        LongHashSet indexes = new LongHashSet();
        LongHashSet constraints = new LongHashSet();
        for ( int i = 0; i < 10; i++ )
        {
            long id = schemaStore35.nextId( NULL );
            MutableLongSet target = rng.nextInt( 3 ) < 2 ? indexes : constraints;
            target.add( id );
        }

        List<SchemaRule> generatedRules = new ArrayList<>();
        RealIdsRandomSchema randomSchema = new RealIdsRandomSchema( rng, indexes, constraints );
        while ( randomSchema.hasMoreIds() )
        {
            try
            {
                SchemaRule schemaRule = randomSchema.nextSchemaRule();
                if ( schemaRule instanceof ConstraintDescriptor )
                {
                    ConstraintDescriptor constraint = (ConstraintDescriptor) schemaRule;
                    if ( constraint.isIndexBackedConstraint() && !constraint.asIndexBackedConstraint().hasOwnedIndexId() )
                    {
                        // Filter out constraints that are supposed to own indexes, but don't, because those are illegal to persist.
                        randomSchema.rollback();
                        continue;
                    }
                }
                randomSchema.commit();
                generatedRules.add( schemaRule );
                List<DynamicRecord> dynamicRecords = allocateFrom( schemaStore35, schemaRule, NULL );
                try ( PageCursor pageCursor = schemaStore35.openPageCursorForWriting( 0, NULL ) )
                {
                    for ( DynamicRecord dynamicRecord : dynamicRecords )
                    {
                        schemaStore35.updateRecord( dynamicRecord, pageCursor, NULL, StoreCursors.NULL );
                    }
                }
            }
            catch ( NoSuchElementException ignore )
            {
                // We're starting to run low on ids, but just ignore this and loop as along as there are still some left.
            }
        }
        schemaStore35.flush( NULL );
        schemaStore35.close();

        RecordStoreVersionCheck check = getVersionCheck( pageCache, databaseLayout );
        String versionToMigrateFrom = getVersionToMigrateFrom( check );
        MigrationProgressMonitor progressMonitor = SILENT;
        RecordStorageMigrator migrator = new RecordStorageMigrator( fs, pageCache, CONFIG, logService, jobScheduler, PageCacheTracer.NULL,
                batchImporterFactory, INSTANCE );

        // When we migrate it to the new store format.
        String versionToMigrateTo = getVersionToMigrateTo( check );
        ProgressReporter reporter = progressMonitor.startSection( "section" );
        migrator.migrate( databaseLayout, migrationLayout, reporter, versionToMigrateFrom, versionToMigrateTo, EMPTY );
        migrator.moveMigratedFiles( migrationLayout, databaseLayout, versionToMigrateFrom, versionToMigrateTo );

        generatedRules.sort( Comparator.comparingLong( SchemaRule::getId ) );

        // Then the new store should retain an exact representation of the old-format schema rules.
        StoreFactory storeFactory = new StoreFactory( databaseLayout, CONFIG, igf, pageCache, fs, logProvider, PageCacheTracer.NULL, writable() );
        try ( NeoStores neoStores = storeFactory.openAllNeoStores();
              var storeCursors = new CachedStoreCursors( neoStores, NULL ) )
        {
            SchemaStore schemaStore = neoStores.getSchemaStore();
            TokenHolders tokenHolders = StoreTokens.readOnlyTokenHolders( neoStores, storeCursors );
            SchemaStorage storage = new SchemaStorage( schemaStore, tokenHolders, () -> KernelVersion.LATEST );
            List<SchemaRule> migratedRules = new ArrayList<>();
            storage.getAll( storeCursors ).iterator().forEachRemaining( migratedRules::add );

            // Nerf the rule names, since migration may change those around.
            migratedRules = migratedRules.stream().map( r -> r.withName( "a" ) ).collect( Collectors.toList() );
            generatedRules = generatedRules.stream().map( r -> r.withName( "a" ) ).collect( Collectors.toList() );

            assertThat( migratedRules ).isEqualTo( generatedRules );
        }
    }

    @ParameterizedTest
    @MethodSource( "versions" )
    void shouldStartCheckpointLogVersionFromZeroIfMissingBeforeMigration( String version, LogPosition expectedLogPosition,
            Function<TransactionId,Boolean> txIdComparator ) throws Exception
    {
        // given
        Path prepare = testDirectory.directory( "prepare" );
        var fs = testDirectory.getFileSystem();
        MigrationTestUtils.prepareSampleLegacyDatabase( version, fs, databaseLayout.databaseDirectory(), prepare );
        RecordStoreVersionCheck check = getVersionCheck( pageCache, databaseLayout );
        String versionToMigrateFrom = getVersionToMigrateFrom( check );
        String versionToMigrateTo = getVersionToMigrateTo( check );

        // when
        RecordStorageMigrator migrator =
                new RecordStorageMigrator( fs, pageCache, CONFIG, NullLogService.getInstance(), jobScheduler, PageCacheTracer.NULL, batchImporterFactory,
                        INSTANCE );

        // when
        migrator.migrate( databaseLayout, migrationLayout, SILENT.startSection( "section" ), versionToMigrateFrom, versionToMigrateTo,
                          EMPTY );
        migrator.moveMigratedFiles( migrationLayout, databaseLayout, versionToMigrateFrom, versionToMigrateTo );

        // then
        try ( NeoStores neoStores = new StoreFactory( databaseLayout, Config.defaults(),
                new DefaultIdGeneratorFactory( fs, immediate(), databaseLayout.getDatabaseName() ), pageCache, fs, NullLogProvider.getInstance(),
                PageCacheTracer.NULL, writable() ).openNeoStores( StoreType.META_DATA ) )
        {
            neoStores.start( NULL );
            assertThat( neoStores.getMetaDataStore().getCheckpointLogVersion() ).isEqualTo( 0 );
        }
    }

    @ParameterizedTest
    @MethodSource( "versions" )
    void shouldKeepCheckpointLogVersionIfPresentBeforeMigration( String version, LogPosition expectedLogPosition,
            Function<TransactionId,Boolean> txIdComparator ) throws Exception
    {
        // given
        Path prepare = testDirectory.directory( "prepare" );
        var fs = testDirectory.getFileSystem();
        MigrationTestUtils.prepareSampleLegacyDatabase( version, fs, databaseLayout.databaseDirectory(), prepare );
        RecordStoreVersionCheck check = getVersionCheck( pageCache, databaseLayout );
        String versionToMigrateFrom = getVersionToMigrateFrom( check );
        String versionToMigrateTo = getVersionToMigrateTo( check );
        // explicitly set a checkpoint log version into the meta data store
        long checkpointLogVersion = 4;
        MetaDataStore.setRecord( pageCache, databaseLayout.metadataStore(), CHECKPOINT_LOG_VERSION, checkpointLogVersion, databaseLayout.getDatabaseName(),
                NULL );

        // when
        RecordStorageMigrator migrator =
                new RecordStorageMigrator( fs, pageCache, CONFIG, NullLogService.getInstance(), jobScheduler, PageCacheTracer.NULL, batchImporterFactory,
                        INSTANCE );

        // when
        migrator.migrate( databaseLayout, migrationLayout, SILENT.startSection( "section" ), versionToMigrateFrom, versionToMigrateTo,
                          EMPTY );
        migrator.moveMigratedFiles( migrationLayout, databaseLayout, versionToMigrateFrom, versionToMigrateTo );

        // then
        try ( NeoStores neoStores = new StoreFactory( databaseLayout, Config.defaults(),
                new DefaultIdGeneratorFactory( fs, immediate(), databaseLayout.getDatabaseName() ), pageCache, fs, NullLogProvider.getInstance(),
                PageCacheTracer.NULL, writable() ).openNeoStores( StoreType.META_DATA ) )
        {
            neoStores.start( NULL );
            assertThat( neoStores.getMetaDataStore().getCheckpointLogVersion() ).isEqualTo( checkpointLogVersion );
        }
    }

    private static <T extends TokenRecord> void createTokens( TokenStore<T> tokenStore, int tokenCount )
    {
        T record = tokenStore.newRecord();
        DynamicStringStore nameStore = tokenStore.getNameStore();
        record.setInUse( true );
        record.setCreated();
        String tokenType = record.getClass().getSimpleName();
        String prefix = tokenType.substring( 0, tokenType.indexOf( "TokenRecord" ) );
        for ( int i = 1; i <= tokenCount; i++ )
        {
            String name = prefix + i;
            Collection<DynamicRecord> nameRecords = tokenStore.allocateNameRecords( name.getBytes( StandardCharsets.UTF_8 ), NULL, INSTANCE );
            record.setNameId( (int) Iterables.first( nameRecords ).getId() );
            record.addNameRecords( nameRecords );
            record.setId( tokenStore.nextId( NULL ) );
            long maxId = 0;
            try ( var nameCursor = nameStore.openPageCursorForWriting( 0, NULL ) )
            {
                for ( DynamicRecord nameRecord : nameRecords )
                {
                    nameStore.updateRecord( nameRecord, nameCursor, NULL, StoreCursors.NULL );
                    maxId = Math.max( nameRecord.getId(), maxId );
                }
            }
            nameStore.setHighestPossibleIdInUse( Math.max( maxId, nameStore.getHighestPossibleIdInUse( NULL ) ) );
            try ( var tokenCursor = tokenStore.openPageCursorForWriting( 0, NULL ) )
            {
                tokenStore.updateRecord( record, tokenCursor, NULL, StoreCursors.NULL );
            }
            tokenStore.setHighestPossibleIdInUse( Math.max( record.getId(), tokenStore.getHighestPossibleIdInUse( NULL ) ) );
        }
        nameStore.flush( NULL );
        tokenStore.flush( NULL );
    }

    private static class RealIdsRandomSchema extends RandomSchema
    {
        private final Pair<LongHashSet,LongHashSet> newIndexes;
        private final Pair<LongHashSet,LongHashSet> newConstraints;
        private final Pair<LongHashSet,LongHashSet> existingIndexes;
        private final Pair<LongHashSet,LongHashSet> existingConstraints;

        RealIdsRandomSchema( SplittableRandom rng, LongHashSet indexes, LongHashSet constraints )
        {
            super( rng );
            this.newIndexes = Pair.of( indexes, new LongHashSet() );
            this.newConstraints = Pair.of( constraints, new LongHashSet() );
            this.existingIndexes = Pair.of( new LongHashSet( indexes ), new LongHashSet() );
            this.existingConstraints = Pair.of( new LongHashSet( constraints ), new LongHashSet() );
        }

        @Override
        protected int maxPropertyId()
        {
            return MAX_PROPERTY_KEY_ID;
        }

        @Override
        protected int maxRelationshipTypeId()
        {
            return MAX_RELATIONSHIP_TYPE_ID;
        }

        @Override
        protected int maxLabelId()
        {
            return MAX_LABEL_ID;
        }

        @Override
        protected int defaultLabelIdsArrayMaxLength()
        {
            return 20;
        }

        @Override
        protected int defaultRelationshipTypeIdsArrayMaxLength()
        {
            return 20;
        }

        @Override
        protected int defaultPropertyKeyIdsArrayMaxLength()
        {
            return 100;
        }

        @Override
        public long nextRuleIdForIndex()
        {
            return nextRuleId( newIndexes );
        }

        @Override
        public long existingConstraintId()
        {
            return nextRuleId( existingConstraints );
        }

        @Override
        public long nextRuleIdForConstraint()
        {
            return nextRuleId( newConstraints );
        }

        @Override
        public long existingIndexId()
        {
            return nextRuleId( existingIndexes );
        }

        private long nextRuleId( Pair<LongHashSet,LongHashSet> idSet )
        {
            try
            {
                MutableLongIterator itr = idSet.first().longIterator();
                long next = itr.next();
                itr.remove();
                idSet.other().add( next );
                return next;
            }
            catch ( NoSuchElementException exception )
            {
                rollback();
                throw exception;
            }
        }

        public void rollback()
        {
            for ( Pair<LongHashSet,LongHashSet> pair : Arrays.asList( newIndexes, newConstraints, existingIndexes, existingConstraints ) )
            {
                pair.first().addAll( pair.other() );
                pair.other().clear();
            }
        }

        public void commit()
        {
            for ( Pair<LongHashSet,LongHashSet> pair : Arrays.asList( newIndexes, newConstraints, existingIndexes, existingConstraints ) )
            {
                pair.other().clear();
            }
        }

        boolean hasMoreIds()
        {
            return newIndexes.first().notEmpty() || newConstraints.first().notEmpty();
        }
    }

    private static String getVersionToMigrateFrom( RecordStoreVersionCheck check )
    {
        StoreVersionCheck.Result result = check.checkUpgrade( check.configuredVersion(), NULL );
        assertTrue( result.outcome.isSuccessful() );
        return result.actualVersion;
    }

    private static String getVersionToMigrateTo( RecordStoreVersionCheck check )
    {
        return check.configuredVersion();
    }

    private static RecordStoreVersionCheck getVersionCheck( PageCache pageCache, RecordDatabaseLayout layout )
    {
        return new RecordStoreVersionCheck( pageCache, layout, selectFormat(), Config.defaults() );
    }

    private static RecordFormats selectFormat()
    {
        return Standard.LATEST_RECORD_FORMATS;
    }

    private static Function<TransactionId,Boolean> txInfoAcceptanceOnIdAndTimestamp( long id, long timestamp )
    {
        return txInfo -> txInfo.transactionId() == id && txInfo.commitTimestamp() == timestamp;
    }

    public static List<DynamicRecord> allocateFrom( SchemaStore35 schemaStore35, SchemaRule rule, CursorContext cursorContext )
    {
        List<DynamicRecord> records = new ArrayList<>();
        DynamicRecord record = schemaStore35.newRecord();
        try ( var cursor = schemaStore35.openPageCursorForReading( rule.getId(), cursorContext ) )
        {
            schemaStore35.getRecordByCursor( rule.getId(), record, CHECK, cursor );
        }
        DynamicRecordAllocator recordAllocator = new ReusableRecordsCompositeAllocator( singleton( record ), schemaStore35 );
        allocateRecordsFromBytes( records, SchemaRuleSerialization35.serialize( rule, INSTANCE ), recordAllocator, cursorContext, INSTANCE );
        return records;
    }

}
