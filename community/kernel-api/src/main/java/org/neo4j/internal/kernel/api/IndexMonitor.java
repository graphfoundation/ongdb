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
package org.neo4j.internal.kernel.api;

import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.kernel.impl.api.index.IndexSamplingMode;

public interface IndexMonitor
{
    IndexMonitor NO_MONITOR = new MonitorAdapter();

    void initialState( String databaseName, IndexDescriptor descriptor, InternalIndexState state );

    void populationCompleteOn( IndexDescriptor descriptor );

    void indexPopulationScanStarting();

    void indexPopulationScanComplete();

    void awaitingPopulationOfRecoveredIndex( IndexDescriptor descriptor );

    void indexSamplingTriggered( IndexSamplingMode mode );

    void populationCancelled();

    void populationJobCompleted( long peakDirectMemoryUsage );

    void queried( IndexDescriptor descriptor );

    class MonitorAdapter implements IndexMonitor
    {
        @Override
        public void initialState( String databaseName, IndexDescriptor descriptor, InternalIndexState state )
        {   // Do nothing
        }

        @Override
        public void populationCompleteOn( IndexDescriptor descriptor )
        {   // Do nothing
        }

        @Override
        public void indexPopulationScanStarting()
        {   // Do nothing
        }

        @Override
        public void indexPopulationScanComplete()
        {   // Do nothing
        }

        @Override
        public void awaitingPopulationOfRecoveredIndex( IndexDescriptor descriptor )
        {   // Do nothing
        }

        @Override
        public void indexSamplingTriggered( IndexSamplingMode mode )
        {   // Do nothing
        }

        @Override
        public void populationCancelled()
        {   // Do nothing
        }

        @Override
        public void populationJobCompleted( long peakDirectMemoryUsage )
        {   // Do nothing
        }

        @Override
        public void queried( IndexDescriptor descriptor )
        {   // Do nothing

        }
    }
}
