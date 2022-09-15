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
package org.neo4j.internal.batchimport;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.function.Supplier;

import org.neo4j.configuration.Config;
import org.neo4j.csv.reader.CharReadable;
import org.neo4j.csv.reader.DataAfterQuoteException;
import org.neo4j.csv.reader.Readables;
import org.neo4j.internal.batchimport.input.Collector;
import org.neo4j.internal.batchimport.input.IdType;
import org.neo4j.internal.batchimport.input.Input;
import org.neo4j.internal.batchimport.input.InputEntityDecorators;
import org.neo4j.internal.batchimport.input.InputException;
import org.neo4j.internal.batchimport.input.csv.CsvInput;
import org.neo4j.internal.batchimport.input.csv.DataFactories;
import org.neo4j.internal.batchimport.input.csv.DataFactory;
import org.neo4j.internal.batchimport.staging.ExecutionMonitor;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.impl.store.format.standard.StandardV3_4;
import org.neo4j.logging.internal.NullLogService;
import org.neo4j.memory.EmptyMemoryTracker;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.storageengine.api.LogFilesInitializer;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.Neo4jLayoutExtension;
import org.neo4j.test.extension.RandomExtension;
import org.neo4j.test.RandomSupport;
import org.neo4j.test.utils.TestDirectory;
import org.neo4j.test.scheduler.ThreadPoolJobScheduler;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.csv.reader.Configuration.COMMAS;
import static org.neo4j.memory.EmptyMemoryTracker.INSTANCE;

@Neo4jLayoutExtension
@ExtendWith( RandomExtension.class )
class ImportPanicIT
{
    private static final int BUFFER_SIZE = 1000;

    @Inject
    private TestDirectory testDirectory;
    @Inject
    private RandomSupport random;
    @Inject
    private DatabaseLayout databaseLayout;

    /**
     * There was this problem where some steps and in particular parallel CSV input parsing that
     * paniced would hang the import entirely.
     */
    @Test
    void shouldExitAndThrowExceptionOnPanic() throws Exception
    {
        try ( JobScheduler jobScheduler = new ThreadPoolJobScheduler() )
        {
            BatchImporter importer = new ParallelBatchImporter(
                    databaseLayout, testDirectory.getFileSystem(), PageCacheTracer.NULL,
                    Configuration.DEFAULT, NullLogService.getInstance(), ExecutionMonitor.INVISIBLE, AdditionalInitialIds.EMPTY,
                    Config.defaults(), StandardV3_4.RECORD_FORMATS, ImportLogic.NO_MONITOR, jobScheduler, Collector.EMPTY,
                    LogFilesInitializer.NULL, IndexImporterFactory.EMPTY, EmptyMemoryTracker.INSTANCE );
            Iterable<DataFactory> nodeData =
                DataFactories.datas( DataFactories.data( InputEntityDecorators.NO_DECORATOR, fileAsCharReadable( nodeCsvFileWithBrokenEntries() ) ) );
            Input brokenCsvInput = new CsvInput(
                nodeData, DataFactories.defaultFormatNodeFileHeader(),
                DataFactories.datas(), DataFactories.defaultFormatRelationshipFileHeader(),
                IdType.ACTUAL,
                csvConfigurationWithLowBufferSize(),
                false, CsvInput.NO_MONITOR, INSTANCE );
            var e = assertThrows( InputException.class, () -> importer.doImport( brokenCsvInput ) );
            assertTrue( e.getCause() instanceof DataAfterQuoteException );
        }
    }

    private static org.neo4j.csv.reader.Configuration csvConfigurationWithLowBufferSize()
    {
        return COMMAS.toBuilder().withBufferSize( BUFFER_SIZE ).build();
    }

    private static Supplier<CharReadable> fileAsCharReadable( Path path )
    {
        return () ->
        {
            try
            {
                return Readables.files( StandardCharsets.UTF_8, path );
            }
            catch ( IOException e )
            {
                throw new UncheckedIOException( e );
            }
        };
    }

    private Path nodeCsvFileWithBrokenEntries() throws IOException
    {
        Path file = testDirectory.file( "broken-node-data.csv" );
        try ( PrintWriter writer = new PrintWriter(
                testDirectory.getFileSystem().openAsWriter( file, StandardCharsets.UTF_8, false ) ) )
        {
            writer.println( ":ID,name" );
            int numberOfLines = BUFFER_SIZE * 10;
            int brokenLine = random.nextInt( numberOfLines );
            for ( int i = 0; i < numberOfLines; i++ )
            {
                if ( i == brokenLine )
                {
                    writer.println( i + ",\"broken\"line" );
                }
                else
                {
                    writer.println( i + ",name" + i );
                }
            }
        }
        return file;
    }
}
