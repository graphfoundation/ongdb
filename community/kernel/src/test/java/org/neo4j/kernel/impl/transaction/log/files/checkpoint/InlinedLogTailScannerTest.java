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
package org.neo4j.kernel.impl.transaction.log.files.checkpoint;

import java.io.IOException;

import org.neo4j.configuration.Config;
import org.neo4j.kernel.KernelVersion;
import org.neo4j.kernel.impl.transaction.log.LogPosition;
import org.neo4j.kernel.impl.transaction.log.entry.LogEntryWriter;
import org.neo4j.kernel.impl.transaction.log.files.LogFiles;
import org.neo4j.kernel.impl.transaction.log.files.LogFilesBuilder;
import org.neo4j.storageengine.api.StoreId;

import static org.neo4j.configuration.GraphDatabaseInternalSettings.fail_on_corrupted_log_files;
import static org.neo4j.kernel.impl.transaction.log.TestLogEntryReader.logEntryReader;

class InlinedLogTailScannerTest extends AbstractLogTailScannerTest
{
    @Override
    protected LogFiles createLogFiles() throws IOException
    {
        return LogFilesBuilder
                .activeFilesBuilder( databaseLayout, fs, pageCache )
                .withLogVersionRepository( logVersionRepository )
                .withTransactionIdStore( transactionIdStore )
                .withLogEntryReader( logEntryReader() )
                .withStoreId( StoreId.UNKNOWN )
                .withLogProvider( logProvider )
                .withConfig( Config.defaults( fail_on_corrupted_log_files, false ) )
                // The inlined checkpoints doesn't exist in LogEntryParserSets later than 4.0 so write them with that version.
                .withKernelVersionProvider( () -> KernelVersion.V4_0 )
                .build();
    }

    @Override
    protected void writeCheckpoint( LogEntryWriter transactionLogWriter, CheckpointFile separateCheckpointFile, LogPosition logPosition ) throws IOException
    {
        transactionLogWriter.writeLegacyCheckPointEntry( logPosition );
    }
}
