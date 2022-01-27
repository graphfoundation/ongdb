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

import org.neo4j.common.ProgressReporter;

public interface MigrationProgressMonitor
{
    /**
     * Signals that the migration process has started.
     * @param numStages The number of migration stages is the migration process that we are monitoring.
     */
    void started( int numStages );

    /**
     * Signals that migration goes into section with given {@code name}.
     *
     * @param name descriptive name of the section to migration.
     * @return {@link ProgressReporter} which should be notified about progress in the given section.
     */
    ProgressReporter startSection( String name );

    /**
     * The migration process has completed successfully.
     */
    void completed();

    /**
     * Signal that migration starting transaction logs migration.
     */
    void startTransactionLogsMigration();

    /**
     * Signal that migration completed transaction logs migration.
     */
    void completeTransactionLogsMigration();

    MigrationProgressMonitor SILENT = new MigrationProgressMonitor()
    {
        @Override
        public void started( int numStages )
        {
            // empty
        }

        @Override
        public ProgressReporter startSection( String name )
        {
            return ProgressReporter.SILENT;
        }

        @Override
        public void completed()
        {

        }

        @Override
        public void startTransactionLogsMigration()
        {
            // empty
        }

        @Override
        public void completeTransactionLogsMigration()
        {
            // empty
        }
    };
}
