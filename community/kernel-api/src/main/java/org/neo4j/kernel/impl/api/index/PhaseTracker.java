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
package org.neo4j.kernel.impl.api.index;

public interface PhaseTracker
{
    void enterPhase( Phase phase );

    /**
     * Method for when time has been kept externally and merely reported to this tracker.
     *
     * @param phase which {@link Phase} to register the time for.
     * @param millis time to register.
     */
    void registerTime( Phase phase, long millis );

    void stop();

    PhaseTracker nullInstance = new NullPhaseTracker();

    enum Phase
    {
        // The order in which the phases are declared defines the order in which they will be printed in the log.
        // Keep them arranged in the order in which they naturally are seen during index population.
        SCAN,
        WRITE,
        MERGE,
        BUILD,
        APPLY_EXTERNAL,
        FLIP;
    }

    class NullPhaseTracker implements PhaseTracker
    {
        @Override
        public void enterPhase( Phase phase )
        {
        }

        @Override
        public void registerTime( Phase phase, long millis )
        {
        }

        @Override
        public void stop()
        {
        }
    }
}
