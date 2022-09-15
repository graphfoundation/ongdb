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
package org.neo4j.batchinsert;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import org.neo4j.batchinsert.internal.FileSystemClosingBatchInserter;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.io.ByteUnit;
import org.neo4j.io.fs.EphemeralFileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.Neo4jLayoutExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.neo4j.batchinsert.BatchInserters.inserter;
import static org.neo4j.configuration.GraphDatabaseSettings.default_schema_provider;
import static org.neo4j.configuration.GraphDatabaseSettings.logical_log_rotation_threshold;
import static org.neo4j.configuration.GraphDatabaseSettings.preallocate_logical_logs;

@Neo4jLayoutExtension
class BatchInsertersTest
{
    @Inject
    private DatabaseLayout databaseLayout;

    @Test
    void automaticallyCloseCreatedFileSystemOnShutdown() throws Exception
    {
        verifyInserterFileSystemClose( inserter( databaseLayout ) );
        verifyInserterFileSystemClose( inserter( databaseLayout, getConfig() ) );
    }

    @Test
    void providedFileSystemNotClosedAfterShutdown() throws IOException
    {
        try ( EphemeralFileSystemAbstraction fs = new EphemeralFileSystemAbstraction() )
        {
            verifyProvidedFileSystemOpenAfterShutdown( inserter( databaseLayout, fs ), fs );
            verifyProvidedFileSystemOpenAfterShutdown( inserter( databaseLayout, fs, getConfig() ), fs );
        }
    }

    private static Config getConfig()
    {
        return Config.newBuilder()
                .set( logical_log_rotation_threshold, ByteUnit.mebiBytes( 10 ) )
                .set( preallocate_logical_logs, false )
                .set( default_schema_provider, GraphDatabaseSettings.SchemaIndex.NATIVE_BTREE10.providerName() )
                .build();
    }

    private static void verifyProvidedFileSystemOpenAfterShutdown( BatchInserter inserter, EphemeralFileSystemAbstraction fileSystemAbstraction )
    {
        inserter.shutdown();
        assertFalse( fileSystemAbstraction.isClosed() );
    }

    private static void verifyInserterFileSystemClose( BatchInserter inserter )
    {
        assertThat( inserter ).as( "Expect specific implementation that will do required cleanups." ).isInstanceOf( FileSystemClosingBatchInserter.class );
        inserter.shutdown();
    }
}
