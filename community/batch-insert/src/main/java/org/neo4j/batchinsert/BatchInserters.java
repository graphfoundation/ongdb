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

import java.io.IOException;

import org.neo4j.batchinsert.internal.BatchInserterImpl;
import org.neo4j.batchinsert.internal.FileSystemClosingBatchInserter;
import org.neo4j.configuration.Config;
import org.neo4j.io.fs.DefaultFileSystemAbstraction;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;

import static java.lang.Boolean.FALSE;
import static org.neo4j.configuration.GraphDatabaseSettings.preallocate_logical_logs;
import static org.neo4j.kernel.database.DatabaseTracers.EMPTY;

/**
 * Provides instances of {@link BatchInserter}.
 */
public final class BatchInserters
{
    /**
     * Get a {@link BatchInserter} given a store directory.
     *
     * @param databaseLayout directory where particular neo4j database is located
     * @return a new {@link BatchInserter}
     * @throws IOException if there is an IO error
     */
    public static BatchInserter inserter( DatabaseLayout databaseLayout ) throws IOException
    {
        DefaultFileSystemAbstraction fileSystem = createFileSystem();
        BatchInserter batchInserter = inserter( databaseLayout, fileSystem, Config.defaults() );
        return new FileSystemClosingBatchInserter( batchInserter, fileSystem );
    }

    public static BatchInserter inserter( DatabaseLayout databaseLayout, FileSystemAbstraction fs ) throws IOException
    {
        return inserter( databaseLayout, fs, Config.defaults( preallocate_logical_logs, FALSE ) );
    }

    public static BatchInserter inserter( DatabaseLayout databaseLayout, Config config ) throws IOException
    {
        DefaultFileSystemAbstraction fileSystem = createFileSystem();
        BatchInserter inserter = inserter( databaseLayout, fileSystem, config );
        return new FileSystemClosingBatchInserter( inserter, fileSystem );
    }

    public static BatchInserter inserter( DatabaseLayout databaseLayout, FileSystemAbstraction fs, Config config ) throws IOException
    {
        return new BatchInserterImpl( databaseLayout, fs, config, EMPTY );
    }

    private static DefaultFileSystemAbstraction createFileSystem()
    {
        return new DefaultFileSystemAbstraction();
    }
}
