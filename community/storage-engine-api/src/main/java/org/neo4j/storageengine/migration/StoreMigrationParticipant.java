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
package org.neo4j.storageengine.migration;

import java.io.IOException;

import org.neo4j.common.ProgressReporter;
import org.neo4j.exceptions.KernelException;
import org.neo4j.exceptions.UnsatisfiedDependencyException;
import org.neo4j.internal.batchimport.IndexImporterFactory;
import org.neo4j.io.layout.DatabaseLayout;

public interface StoreMigrationParticipant
{
    /**
     * Default empty implementation of StoreMigrationParticipant
     */
    StoreMigrationParticipant NOT_PARTICIPATING = new AbstractStoreMigrationParticipant( "Nothing" )
    {
        @Override
        public void migrate( DatabaseLayout directoryLayout, DatabaseLayout migrationLayout, ProgressReporter progress, String versionToMigrateFrom,
            String versionToMigrateTo, IndexImporterFactory indexImporterFactory )
        {
            // nop
        }

        @Override
        public void moveMigratedFiles( DatabaseLayout migrationLayout, DatabaseLayout directoryLayout, String versionToMigrateFrom, String versionToMigrateTo )
        {
            // nop
        }

        @Override
        public void cleanup( DatabaseLayout migrationLayout )
        {
            // nop
        }
    };

    /**
     * Performs migration of data this participant is responsible for if necessary.
     *
     * Data to migrate sits in {@code sourceDirectory} and must not be modified.
     * Migrated data should go into {@code targetStoreDir}, where source and target dirs are
     * highest level database store dirs.
     *
     * @param directoryLayout data to migrate.
     * @param migrationLayout place to migrate to.
     * @param progress migration progress monitor
     * @param versionToMigrateFrom the version to migrate from
     * @param versionToMigrateTo the version to migrate to
     * @param indexImporterFactory the factory to create an index updater to keep the indexes updated.
     * @throws IOException if there was an error migrating.
     * @throws UnsatisfiedDependencyException if one or more dependencies were unsatisfied.
     */
    void migrate( DatabaseLayout directoryLayout, DatabaseLayout migrationLayout, ProgressReporter progress,
            String versionToMigrateFrom, String versionToMigrateTo, IndexImporterFactory indexImporterFactory ) throws IOException, KernelException;

    /**
     * After a successful migration, move all affected files from {@code upgradeDirectory} over to
     * the {@code workingDirectory}, effectively activating the migration changes.
     * @param migrationLayout directory where the
     * {@link #migrate(DatabaseLayout, DatabaseLayout, ProgressReporter, String, String, IndexImporterFactory) migration} put its files.
     * @param directoryLayout directory the store directory of the to move the migrated files to.
     * @param versionToMigrateFrom the version we have migrated from
     * @param versionToMigrateTo the version we want to migrate to
     * @throws IOException if unable to move one or more files.
     */
    void moveMigratedFiles( DatabaseLayout migrationLayout, DatabaseLayout directoryLayout, String versionToMigrateFrom, String versionToMigrateTo )
            throws IOException;

    /**
     * Delete any file from {@code migrationLayout} produced during migration.
     * @param migrationLayout the directory where migrated files end up.
     * @throws IOException if unable to clean up one or more files.
     */
    void cleanup( DatabaseLayout migrationLayout ) throws IOException;

    /**
     * @return descriptive name of this migration participant.
     */
    String getName();
}
