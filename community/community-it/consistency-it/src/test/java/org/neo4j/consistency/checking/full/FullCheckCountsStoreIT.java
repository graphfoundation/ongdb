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
package org.neo4j.consistency.checking.full;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Function;

import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.consistency.ConsistencyCheckService;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.function.ThrowingFunction;
import org.neo4j.io.layout.recordstorage.RecordDatabaseLayout;
import org.neo4j.io.memory.ByteBuffers;
import org.neo4j.kernel.internal.GraphDatabaseAPI;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.test.extension.DbmsExtension;
import org.neo4j.test.extension.Inject;

import static java.nio.file.StandardOpenOption.READ;
import static java.nio.file.StandardOpenOption.WRITE;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.configuration.Config.defaults;
import static org.neo4j.consistency.checking.full.ConsistencyFlags.DEFAULT;
import static org.neo4j.internal.helpers.progress.ProgressMonitorFactory.NONE;
import static org.neo4j.io.fs.FileUtils.writeAll;
import static org.neo4j.memory.EmptyMemoryTracker.INSTANCE;

@DbmsExtension
public class FullCheckCountsStoreIT
{
    @Inject
    private DatabaseManagementService dbms;
    @Inject
    private GraphDatabaseAPI db;

    @Test
    void shouldReportMissingCountsStore() throws Exception
    {
        shouldReportBadCountsStore( path ->
        {
            Files.delete( path );
            return true;
        }, RecordDatabaseLayout::countStore,
                "Counts store is missing, broken or of an older format" );
    }

    @Test
    void shouldReportBrokenCountsStore() throws Exception
    {
        shouldReportBadCountsStore( FullCheckCountsStoreIT::corruptFileIfExists, RecordDatabaseLayout::countStore,
                "Counts store is missing, broken or of an older format" );
    }

    @Test
    void shouldReportMissingGroupDegreesStore() throws Exception
    {
        shouldReportBadCountsStore( path ->
        {
            Files.delete( path );
            return true;
        }, RecordDatabaseLayout::relationshipGroupDegreesStore,
                "Relationship group degrees store is missing, broken or of an older format" );
    }

    @Test
    void shouldReportBrokenGroupDegreesStore() throws Exception
    {
        shouldReportBadCountsStore( FullCheckCountsStoreIT::corruptFileIfExists, RecordDatabaseLayout::relationshipGroupDegreesStore,
                                    "Relationship group degrees store is missing, broken or of an older format" );
    }

    private void shouldReportBadCountsStore( ThrowingFunction<Path,Boolean,IOException> fileAction, Function<RecordDatabaseLayout,Path> store,
            String errorMessage ) throws Exception
    {
        // given
        RecordDatabaseLayout databaseLayout = (RecordDatabaseLayout) db.databaseLayout();
        dbms.shutdown();
        boolean corrupted = fileAction.apply( store.apply( databaseLayout ));
        assertTrue( corrupted );

        // when
        ConsistencyCheckService.Result result = new ConsistencyCheckService().runFullConsistencyCheck( databaseLayout,
                defaults( GraphDatabaseSettings.logs_directory, databaseLayout.databaseDirectory() ), NONE, NullLogProvider.getInstance(), false, DEFAULT );

        // then
        assertThat( result.summary().getGenericErrors() ).contains( errorMessage );
    }

    private static boolean corruptFileIfExists( Path file ) throws IOException
    {
        if ( Files.exists( file ) )
        {
            try ( FileChannel channel = FileChannel.open( file, READ, WRITE ) )
            {
                ByteBuffer buffer = ByteBuffers.allocate( 30, INSTANCE );
                while ( buffer.hasRemaining() )
                {
                    buffer.put( (byte) 9 );
                }
                buffer.flip();
                writeAll( channel, buffer );
            }
            return true;
        }
        return false;
    }
}
