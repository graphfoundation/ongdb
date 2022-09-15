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
package org.neo4j.internal.batchimport.input.csv;

import org.apache.commons.lang3.mutable.MutableLong;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseInternalSettings;
import org.neo4j.internal.batchimport.Configuration;
import org.neo4j.internal.batchimport.ImportLogic;
import org.neo4j.internal.batchimport.IndexImporterFactory;
import org.neo4j.internal.batchimport.ParallelBatchImporter;
import org.neo4j.internal.batchimport.input.Collector;
import org.neo4j.internal.batchimport.input.Distribution;
import org.neo4j.internal.batchimport.input.Groups;
import org.neo4j.internal.batchimport.input.IdType;
import org.neo4j.internal.batchimport.input.Input;
import org.neo4j.internal.batchimport.input.InputChunk;
import org.neo4j.internal.batchimport.input.InputEntity;
import org.neo4j.internal.batchimport.input.InputEntityDecorators;
import org.neo4j.internal.batchimport.input.RandomEntityDataGenerator;
import org.neo4j.internal.id.DefaultIdGeneratorFactory;
import org.neo4j.io.fs.DefaultFileSystemAbstraction;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.layout.recordstorage.RecordDatabaseFile;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.PageCursor;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.impl.SingleFilePageSwapperFactory;
import org.neo4j.io.pagecache.impl.muninn.MuninnPageCache;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.impl.store.NeoStores;
import org.neo4j.kernel.impl.store.PropertyValueRecordSizeCalculator;
import org.neo4j.kernel.impl.store.StoreFactory;
import org.neo4j.kernel.impl.store.format.RecordFormats;
import org.neo4j.kernel.impl.store.record.PropertyRecord;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.logging.internal.NullLogService;
import org.neo4j.memory.EmptyMemoryTracker;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.storageengine.api.LogFilesInitializer;
import org.neo4j.test.RandomSupport;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.Neo4jLayoutExtension;
import org.neo4j.test.extension.RandomExtension;
import org.neo4j.test.scheduler.ThreadPoolJobScheduler;
import org.neo4j.test.utils.TestDirectory;

import static java.lang.Math.abs;
import static java.lang.Math.toIntExact;
import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Percentage.withPercentage;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.neo4j.dbms.database.readonly.DatabaseReadOnlyChecker.writable;
import static org.neo4j.csv.reader.CharSeekers.charSeeker;
import static org.neo4j.csv.reader.Configuration.COMMAS;
import static org.neo4j.csv.reader.Readables.wrap;
import static org.neo4j.index.internal.gbptree.RecoveryCleanupWorkCollector.immediate;
import static org.neo4j.internal.batchimport.AdditionalInitialIds.EMPTY;
import static org.neo4j.internal.batchimport.input.RandomEntityDataGenerator.convert;
import static org.neo4j.internal.batchimport.input.csv.DataFactories.defaultFormatNodeFileHeader;
import static org.neo4j.internal.batchimport.input.csv.DataFactories.defaultFormatRelationshipFileHeader;
import static org.neo4j.internal.batchimport.staging.ExecutionMonitor.INVISIBLE;
import static org.neo4j.internal.helpers.collection.Iterables.count;
import static org.neo4j.io.ByteUnit.bytesToString;
import static org.neo4j.kernel.impl.store.NoStoreHeader.NO_STORE_HEADER;
import static org.neo4j.kernel.impl.store.format.standard.Standard.LATEST_RECORD_FORMATS;
import static org.neo4j.kernel.impl.store.record.RecordLoad.CHECK;
import static org.neo4j.memory.EmptyMemoryTracker.INSTANCE;

@Neo4jLayoutExtension
@ExtendWith( RandomExtension.class )
class CsvInputEstimateCalculationIT
{
    private static final long NODE_COUNT = 600_000;
    private static final long RELATIONSHIP_COUNT = 600_000;
    // Configured for maximum determinism in order to reduce flakiness of this test.
    private static final Configuration PBI_CONFIG = new Configuration.Overridden( Configuration.DEFAULT )
    {
        @Override
        public boolean sequentialBackgroundFlushing()
        {
            return false;
        }

        @Override
        public int maxNumberOfProcessors()
        {
            return 1;
        }

        @Override
        public boolean parallelRecordWrites()
        {
            return false;
        }

        @Override
        public boolean parallelRecordReads()
        {
            return false;
        }

        @Override
        public boolean highIO()
        {
            return false;
        }
    };

    @Inject
    private RandomSupport random;

    @Inject
    private TestDirectory testDirectory;

    @Inject
    private DatabaseLayout databaseLayout;

    @Test
    void shouldCalculateCorrectEstimates() throws Exception
    {
        // given a couple of input files of various layouts
        Input input = generateData();
        RecordFormats format = LATEST_RECORD_FORMATS;
        Input.Estimates estimates = input.calculateEstimates( new PropertyValueRecordSizeCalculator(
                format.property().getRecordSize( NO_STORE_HEADER ),
                GraphDatabaseInternalSettings.string_block_size.defaultValue(), 0,
                GraphDatabaseInternalSettings.array_block_size.defaultValue(), 0 ) );

        // when
        Config config = Config.defaults();
        FileSystemAbstraction fs = new DefaultFileSystemAbstraction();
        try ( JobScheduler jobScheduler = new ThreadPoolJobScheduler() )
        {
            PageCacheTracer cacheTracer = PageCacheTracer.NULL;
            new ParallelBatchImporter( databaseLayout, fs, cacheTracer, PBI_CONFIG, NullLogService.getInstance(),
                    INVISIBLE, EMPTY, config, format, ImportLogic.NO_MONITOR, jobScheduler, Collector.EMPTY,
                    LogFilesInitializer.NULL, IndexImporterFactory.EMPTY, EmptyMemoryTracker.INSTANCE ).doImport( input );

            // then compare estimates with actual disk sizes
            SingleFilePageSwapperFactory swapperFactory = new SingleFilePageSwapperFactory( fs, cacheTracer );
            try ( PageCache pageCache = new MuninnPageCache( swapperFactory, jobScheduler, MuninnPageCache.config( 1000 ) );
                    NeoStores stores = new StoreFactory( databaseLayout, config,
                            new DefaultIdGeneratorFactory( fs, immediate(), databaseLayout.getDatabaseName() ), pageCache, fs,
                          NullLogProvider.getInstance(), cacheTracer, writable() ).openAllNeoStores() )
            {
                assertRoughlyEqual( estimates.numberOfNodes(), stores.getNodeStore().getNumberOfIdsInUse() );
                assertRoughlyEqual( estimates.numberOfRelationships(), stores.getRelationshipStore().getNumberOfIdsInUse() );
                assertRoughlyEqual( estimates.numberOfNodeProperties() + estimates.numberOfRelationshipProperties(), calculateNumberOfProperties( stores ) );
            }

            long measuredPropertyStorage = propertyStorageSize();
            long estimatedPropertyStorage = estimates.sizeOfNodeProperties() + estimates.sizeOfRelationshipProperties();
            assertThat( estimatedPropertyStorage )
                    .as( "Estimated property storage size of %s must be within 10%% of the measured size of %s.",
                            bytesToString( estimatedPropertyStorage ), bytesToString( measuredPropertyStorage ) )
                    .isCloseTo( measuredPropertyStorage, withPercentage( 10.0 ) );
        }
    }

    @Test
    void shouldCalculateCorrectEstimatesOnEmptyData() throws Exception
    {
        // given
        Groups groups = new Groups();
        Collection<DataFactory> nodeData = singletonList(
                generateData( defaultFormatNodeFileHeader(), new MutableLong(), 0, 0, ":ID", "nodes-1.csv", groups ) );
        Collection<DataFactory> relationshipData = singletonList(
                generateData( defaultFormatRelationshipFileHeader(), new MutableLong(), 0, 0, ":START_ID,:TYPE,:END_ID", "rels-1.csv", groups ) );
        Input input = new CsvInput( nodeData, defaultFormatNodeFileHeader(), relationshipData, defaultFormatRelationshipFileHeader(),
                IdType.INTEGER, COMMAS, false, CsvInput.NO_MONITOR, groups, INSTANCE );

        // when
        Input.Estimates estimates = input.calculateEstimates( new PropertyValueRecordSizeCalculator(
                LATEST_RECORD_FORMATS.property().getRecordSize( NO_STORE_HEADER ),
                GraphDatabaseInternalSettings.string_block_size.defaultValue(), 0,
                GraphDatabaseInternalSettings.array_block_size.defaultValue(), 0 ) );

        // then
        assertEquals( 0, estimates.numberOfNodes() );
        assertEquals( 0, estimates.numberOfRelationships() );
        assertEquals( 0, estimates.numberOfRelationshipProperties() );
        assertEquals( 0, estimates.numberOfNodeProperties() );
        assertEquals( 0, estimates.numberOfNodeLabels() );
    }

    private long propertyStorageSize() throws IOException
    {
        return sizeOf( RecordDatabaseFile.PROPERTY_STORE ) + sizeOf( RecordDatabaseFile.PROPERTY_ARRAY_STORE ) +
                sizeOf( RecordDatabaseFile.PROPERTY_STRING_STORE );
    }

    private long sizeOf( RecordDatabaseFile file ) throws IOException
    {
        return Files.size( databaseLayout.file( file ) );
    }

    private Input generateData() throws IOException
    {
        List<DataFactory> nodeData = new ArrayList<>();
        MutableLong start = new MutableLong();
        Groups groups = new Groups();
        nodeData.add( generateData( defaultFormatNodeFileHeader(),
                start, NODE_COUNT / 3, NODE_COUNT, ":ID", "nodes-1.csv", groups ) );
        nodeData.add( generateData( defaultFormatNodeFileHeader(),
                start, NODE_COUNT / 3, NODE_COUNT, ":ID,:LABEL,name:String,yearOfBirth:int", "nodes-2.csv", groups ) );
        nodeData.add( generateData( defaultFormatNodeFileHeader(),
                start, NODE_COUNT - start.longValue(), NODE_COUNT, ":ID,name:String,yearOfBirth:int,other", "nodes-3.csv", groups ) );
        List<DataFactory> relationshipData = new ArrayList<>();
        start.setValue( 0 );
        relationshipData.add( generateData( defaultFormatRelationshipFileHeader(), start, RELATIONSHIP_COUNT / 2, NODE_COUNT,
                ":START_ID,:TYPE,:END_ID", "relationships-1.csv", groups ) );
        relationshipData.add( generateData( defaultFormatRelationshipFileHeader(), start, RELATIONSHIP_COUNT - start.longValue(),
                NODE_COUNT, ":START_ID,:TYPE,:END_ID,prop1,prop2", "relationships-2.csv", groups ) );
        return new CsvInput( nodeData, defaultFormatNodeFileHeader(), relationshipData, defaultFormatRelationshipFileHeader(),
                IdType.INTEGER, COMMAS, false, CsvInput.NO_MONITOR, groups, INSTANCE );
    }

    private static long calculateNumberOfProperties( NeoStores stores )
    {
        long count = 0;
        PropertyRecord record = stores.getPropertyStore().newRecord();
        try ( PageCursor cursor = stores.getPropertyStore().openPageCursorForReading( 0, CursorContext.NULL ) )
        {
            long highId = stores.getPropertyStore().getHighId();
            for ( long id = 0; id < highId; id++ )
            {
                stores.getPropertyStore().getRecordByCursor( id, record, CHECK, cursor );
                if ( record.inUse() )
                {
                    count += count( record );
                }
            }
        }
        return count;
    }

    private static void assertRoughlyEqual( long expected, long actual )
    {
        long diff = abs( expected - actual );
        assertThat( expected / 10 ).isGreaterThan( diff );
    }

    private DataFactory generateData( Header.Factory factory, MutableLong start, long count,
            long nodeCount, String headerString, String fileName, Groups groups ) throws IOException
    {
        Path file = testDirectory.file( fileName );
        Header header = factory.create( charSeeker( wrap( headerString ), COMMAS, false ), COMMAS, IdType.INTEGER, groups );
        Distribution<String> distribution = new Distribution<>( new String[] {"Token"} );
        Deserialization<String> deserialization = new StringDeserialization( COMMAS );
        try ( PrintWriter out = new PrintWriter( Files.newBufferedWriter( file ) );
              RandomEntityDataGenerator generator = new RandomEntityDataGenerator( nodeCount, count, toIntExact( count ), random.seed(),
                      start.longValue(), header, distribution, distribution, 0, 0, 5 );
              InputChunk chunk = generator.newChunk();
              InputEntity entity = new InputEntity() )
        {
            out.println( headerString );
            while ( generator.next( chunk ) )
            {
                while ( chunk.next( entity ) )
                {
                    out.println( convert( entity, deserialization, header ) );
                }
            }
        }
        start.add( count );
        return DataFactories.data( InputEntityDecorators.NO_DECORATOR, StandardCharsets.UTF_8, file );
    }
}
