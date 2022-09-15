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
package org.neo4j.kernel.impl.index.schema;

import java.io.IOException;

import org.neo4j.common.ProgressReporter;
import org.neo4j.exceptions.KernelException;
import org.neo4j.internal.batchimport.IndexImporterFactory;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.storageengine.migration.StoreMigrationParticipant;

public class NameOverridingStoreMigrationParticipant implements StoreMigrationParticipant
{
    private final StoreMigrationParticipant delegate;
    private final String nameOverride;

    public NameOverridingStoreMigrationParticipant( StoreMigrationParticipant delegate, String nameOverride )
    {
        this.delegate = delegate;
        this.nameOverride = nameOverride;
    }

    @Override
    public void migrate( DatabaseLayout directoryLayout, DatabaseLayout migrationLayout, ProgressReporter progress, String versionToMigrateFrom,
                         String versionToMigrateTo, IndexImporterFactory indexImporterFactory ) throws IOException, KernelException
    {
        delegate.migrate( directoryLayout, migrationLayout, progress, versionToMigrateFrom, versionToMigrateTo, indexImporterFactory );
    }

    @Override
    public void moveMigratedFiles( DatabaseLayout migrationLayout, DatabaseLayout directoryLayout, String versionToMigrateFrom, String versionToMigrateTo )
            throws IOException
    {
        delegate.moveMigratedFiles( migrationLayout, directoryLayout, versionToMigrateFrom, versionToMigrateTo );
    }

    @Override
    public void cleanup( DatabaseLayout migrationLayout ) throws IOException
    {
        delegate.cleanup( migrationLayout );
    }

    @Override
    public String getName()
    {
        return nameOverride;
    }
}
